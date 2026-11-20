"""Conversione delle Resumable Sub (Sleep / Wait For).

B4A compila una Resumable Sub in una classe ResumableSub_<Nome> con una macchina a stati
(switch(this.state)). Qui la macchina a stati viene riprodotta fedelmente in B4A:

    Sub Nome(...) As ResumableSub
        Dim rsState As Int = 0
        Do While True
            Select rsState
                Case 0
                    ...
                    rsState = 3
                Case 3
                    Wait For (sf) Dialog_Result (wf3_0 As Int)
                    ...

Il risultato compila e si comporta come l'originale; e' marcato con '### RISTRUTTURARE
per essere riscritto in forma strutturata (If/For) durante la revisione.
"""
import re
from javalang import tree as T
from j2b4a import type_str, strip_us


def find_state_switch(body):
    for path, node in body.filter(T.SwitchStatement) if hasattr(body, 'filter') else []:
        e = node.expression
        if isinstance(e, T.MemberReference) and e.member == 'state':
            return node
    return None


def gen_resumable(g, launcher, rs, disp):
    c = g.c
    m = g.m
    # --- campi della classe resumable (= variabili locali originali, con i nomi veri)
    fields = {}
    finit = {}
    for b in rs.body:
        if isinstance(b, T.FieldDeclaration):
            for d in b.declarators:
                fields[d.name] = type_str(b.type)
                finit[d.name] = d.initializer
    # --- costruttore: mappa parametri -> campi
    ctor = next((b for b in rs.body if isinstance(b, T.ConstructorDeclaration)), None)
    params = []
    if ctor is not None:
        pnames = [p.name for p in ctor.parameters]
        for st in ctor.body or []:
            if isinstance(st, T.StatementExpression) and isinstance(st.expression, T.Assignment):
                lhs = st.expression.expressionl
                val = st.expression.value
                fname = None
                if isinstance(lhs, T.This):
                    sels = lhs.selectors or []
                    if sels and isinstance(sels[0], T.MemberReference):
                        fname = sels[0].member
                elif isinstance(lhs, T.MemberReference):
                    fname = lhs.member
                if fname and fname != 'parent' and isinstance(val, T.MemberReference) and val.member in pnames:
                    params.append((pnames.index(val.member), fname))
    params.sort()
    pfields = [f for _, f in params]

    resume = next((b for b in rs.body if isinstance(b, T.MethodDeclaration) and b.name == 'resume'), None)
    sw = None
    has_catch = False
    if resume is not None:
        for _, node in resume.filter(T.SwitchStatement):
            e = node.expression
            if isinstance(e, T.MemberReference) and e.member == 'state':
                sw = node
                break
            if isinstance(e, T.This) or (isinstance(e, T.MemberReference) and e.qualifier == 'this'):
                sw = node
                break
        has_catch = any(True for _, n in resume.filter(T.MemberReference) if n.member == 'catchState')

    # --- tipo di ritorno
    rt = type_str(launcher.return_type)
    returns_rs = 'ResumableSubWrapper' in rt
    loc = {}
    g.loc_names_low = {}
    g.in_switch = []
    g.no_return_type = not returns_rs

    def lname(f):
        n = strip_us(f)
        return g.localname(n, loc, key='rs:' + f)

    ptxt = []
    for f in pfields:
        nm = lname(f)
        loc[('rs', f)] = nm
        ptxt.append('%s As %s' % (nm, c.b4type(fields[f], m) or 'Object'))
    head = 'Sub %s%s%s' % (disp, '(' + ', '.join(ptxt) + ')' if ptxt else '', ' As ResumableSub' if returns_rs else '')
    g.emit("'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).")
    if launcher.name in m.bad_methods or (resume is not None and 'resume' in getattr(rs, '_bad', set())):
        g.emit("'### VERIFICARE: decompilazione imperfetta.")
    g.emit(head)
    g.ind += 1
    # dichiarazioni
    skip = {'parent', 'state', 'catchState'} | set(pfields)
    for f, ts in fields.items():
        if f in skip or re.match(r'^(limit|step|group|index|groupLen)\d+$', f) and False:
            continue
        nm = lname(f)
        loc[('rs', f)] = nm
        b4 = c.b4type(ts, m) or 'Object'
        iv = finit.get(f)
        ivt = ''
        if iv is not None and isinstance(iv, T.Literal) and iv.value not in ('null', '0', 'false', '0.0d', '""', '0.0f', '0L'):
            ivt = ' = ' + g.lit(iv.value)[0]
        if b4.endswith('()'):
            g.emit('Dim %s() As %s' % (nm, b4[:-2]))
        else:
            g.emit('Dim %s As %s%s' % (nm, b4, ivt))
    g.emit('Dim rsState As Int = 0')
    if resume is not None:
        g.count_uses(resume)
    if has_catch:
        g.emit('Dim rsCatchState As Int = 0')
    g.rs = {'fields': fields, 'loc': loc, 'wf': {}}
    if sw is None:
        g.emit("'### ERRORE: macchina a stati non trovata")
        g.ind -= 1
        g.emit('End Sub')
        g.emit()
        g.rs = None
        return
    # pre-analisi Wait For: per ogni stato di ripresa, quali objArr[i] e con che tipo
    resume_types = {}
    for case in sw.cases:
        labels = [g.exs(x, {}) for x in case.case if x is not None]
        for st in case.statements:
            for _, node in st.filter(T.ArraySelector) if hasattr(st, 'filter') else []:
                pass
        txts = []
        for st in case.statements:
            for _, node in st.filter(T.MemberReference):
                if node.member == 'objArr' or node.member.startswith('objArr'):
                    pass
        # cerca "this._x = (T) objArr[i]"
        for st in case.statements:
            if isinstance(st, T.StatementExpression) and isinstance(st.expression, T.Assignment):
                v = st.expression.value
                cast_t = None
                if isinstance(v, T.Cast):
                    cast_t = type_str(v.type)
                    inner = v.expression
                else:
                    inner = v
                # BA.ObjectToNumber(objArr[i]) ecc.
                if isinstance(inner, T.MethodInvocation) and inner.arguments:
                    inner = inner.arguments[-1]
                if isinstance(inner, T.MemberReference) and inner.member == 'objArr' and inner.selectors:
                    sel = inner.selectors[0]
                    if isinstance(sel, T.ArraySelector) and isinstance(sel.index, T.Literal):
                        for lb in labels:
                            resume_types.setdefault(lb, {})[int(sel.index.value)] = cast_t
    g.rs['resume_types'] = resume_types

    g.emit('Do While True')
    g.ind += 1
    if has_catch:
        g.emit('Try')
        g.ind += 1
    g.emit('Select rsState')
    g.ind += 1
    cases = list(sw.cases)
    for ci, case in enumerate(cases):
        labels = [g.exs(x, {}) for x in case.case if x is not None]
        g.rs['cur_labels'] = labels
        g.emit('Case ' + ', '.join(labels) if labels else 'Case Else')
        g.ind += 1
        stmts = list(case.statements)
        g.in_switch = ['rs']
        for st in stmts:
            g.stmt(st, loc)
        # fallthrough java: se l'ultimo statement non e' break/return, prosegue nel case successivo
        last = stmts[-1] if stmts else None
        if not isinstance(last, (T.BreakStatement, T.ReturnStatement, T.ContinueStatement, T.ThrowStatement)) and ci + 1 < len(cases):
            nxt = [g.exs(x, {}) for x in cases[ci + 1].case if x is not None]
            if nxt and stmts:
                g.emit("'(fallthrough java verso il case successivo)")
                g.emit('rsState = %s' % nxt[0])
        g.ind -= 1
    g.ind -= 1
    g.emit('End Select')
    if has_catch:
        g.ind -= 1
        g.emit('Catch')
        g.ind += 1
        g.emit('If rsCatchState = 0 Then')
        g.ind += 1
        g.emit('Log(LastException)')
        g.emit('Return' + (' Null' if returns_rs else ''))
        g.ind -= 1
        g.emit('End If')
        g.emit('rsState = rsCatchState')
        g.ind -= 1
        g.emit('End Try')
    g.ind -= 1
    g.emit('Loop')
    g.ind -= 1
    g.emit('End Sub')
    g.emit()
    g.rs = None
