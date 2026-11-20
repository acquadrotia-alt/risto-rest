"""Scrittura del progetto B4A (.b4a + .bas) a partire dal modello del convertitore."""
import os, re, json
from javalang import tree as T
from j2b4a import Gen, type_str, strip_us, EXTERNAL_B4X, TYPE_MAP

B4A_VERSION = '13.1'

EVENT_CASE = {
    'click': 'Click', 'longclick': 'LongClick', 'itemclick': 'ItemClick', 'itemlongclick': 'ItemLongClick',
    'checkedchange': 'CheckedChange', 'textchanged': 'TextChanged', 'enterpressed': 'EnterPressed',
    'tick': 'Tick', 'focuschanged': 'FocusChanged', 'touch': 'Touch', 'create': 'Create', 'resume': 'Resume',
    'pause': 'Pause', 'keypress': 'KeyPress', 'keyup': 'KeyUp', 'valuechanged': 'ValueChanged',
    'newdata': 'NewData', 'error': 'Error', 'terminated': 'Terminated', 'jobdone': 'JobDone',
    'start': 'Start', 'destroy': 'Destroy', 'connected': 'Connected', 'handlerequest': 'HandleRequest',
    'downloadcompleted': 'DownloadCompleted', 'uploadcompleted': 'UploadCompleted', 'listcompleted': 'ListCompleted',
    'messagesent': 'MessageSent', 'messagearrived': 'MessageArrived', 'disconnected': 'Disconnected',
    'scrollchanged': 'ScrollChanged', 'pagechanged': 'PageChanged', 'tabchanged': 'TabChanged',
    'windowfocuschanged': 'WindowFocusChanged', 'permissionresult': 'PermissionResult', 'ready': 'Ready',
    'result': 'Result', 'resize': 'Resize', 'beforetextchanged': 'BeforeTextChanged', 'heightchanged': 'HeightChanged',
    'packetarrived': 'PacketArrived', 'designercreateview': 'DesignerCreateView', 'base_resize': 'Base_Resize',
    'pageloaded': 'PageFinished', 'pagefinished': 'PageFinished', 'overrideurl': 'OverrideUrl',
    'statechanged': 'StateChanged', 'scrolled': 'Scrolled', 'scrollstatechanged': 'ScrollStateChanged',
    'visiblerangechanged': 'VisibleRangeChanged', 'menuitemclick': 'MenuItemClick', 'closed': 'Closed',
    'itemselected': 'ItemSelected', 'datechanged': 'DateChanged', 'timechanged': 'TimeChanged',
}

ACT_BOILER = {'mostCurrent', 'processBA', 'activityBA', 'isFirst', 'processGlobalsRun', 'afterFirstLayout',
              'previousOne', 'layout', 'menuItems', 'fullScreen', 'includeTitle', '_activity', '__c', 'ba',
              '_service', 'activity', 'service', 'mostCurrentRef'}

LIBS = [
    ('anywheresoftware.b4a.objects', 'Core'), ('anywheresoftware.b4a.sql', 'SQL'),
    ('anywheresoftware.b4a.phone', 'Phone'), ('anywheresoftware.b4a.agraham.dialogs', 'Dialogs'),
    ('anywheresoftware.b4a.agraham.reflection', 'Reflection'), ('anywheresoftware.b4a.agraham.threading', 'Threading'),
    ('anywheresoftware.b4a.net.', 'Net'), ('SocketWrapper', 'Network'), ('anywheresoftware.b4a.randomaccessfile', 'RandomAccessFile'),
    ('StringUtils', 'StringUtils'), ('B4XViewWrapper.XUI', 'XUI'), ('anywheresoftware.b4h.okhttp', 'OkHttp'),
    ('anywheresoftware.b4j.object.JavaObject', 'JavaObject'), ('MqttAsyncClientWrapper', 'jMQTT'),
    ('anywheresoftware.b4a.objects.HttpServer', 'HttpServer'), ('anywheresoftware.b4a.objects.usb', 'USB'),
    ('anywheresoftware.b4a.audio', 'Audio'), ('RuntimePermissions', 'RuntimePermissions'),
    ('XmlLayoutBuilder', 'XmlLayoutBuilder'), ('anywheresoftware.b4a.objects.collections.JSONParser', 'JSON'),
    ('jxl.', 'jExcel'), ('WritableWorkbookWrapper', 'jExcel'), ('WritableCellFormatWrapper', 'jExcel'), ('flm.b4a.ultimatelistview', 'UltimateListView'), ('flm.b4a.gesturedetector', 'GestureDetector'),
    ('flm.b4a.animationplus', 'AnimationPlus'), ('com.rootsoft.pdfwriter', 'PDFWriter'),
    ('com.rootsoft.tweenengine', 'RSTweenEngine'), ('njdude.custom', 'CustomProgressDialog'),
    ('mpandroidchartwrapper', 'MPAndroidCharts'), ('b4a.example.dateutils', 'DateUtils'),
    ('b4a.example.bitmapcreator', 'BitmapCreator'), ('b4a.example3.customlistview', 'xCustomListView'),
    ('uk.co.martinpearman.b4a.downloadmanager', 'DownloadManager'), ('uk.co.martinpearman.b4a.webviewextras', 'WebViewExtras'),
    ('de.amberhome.actionbarhelper', 'ActionBarHelper'), ('android_serialport_api', 'SerialPort'),
    ('com.maximus.id', 'Id'), ('com.maximussoft.showtips', 'ShowTips'), ('anywheresoftware.b4a.objects.Serial', 'Serial'),
    ('B4XEncryption', 'B4XEncryption'), ('anywheresoftware.b4a.agraham.encryption', 'Encryption'),
    ('anywheresoftware.b4a.agraham.byteconverter', 'ByteConverter'), ('anywheresoftware.b4a.objects.Base64', 'StringUtils'),
]


def ev_display(conv, name):
    """_button1_click -> Button1_Click (usando i nomi dei layout per il prefisso)."""
    n = strip_us(name)
    if '_' not in n:
        return n
    obj, ev = n.rsplit('_', 1)
    if ev.lower() in EVENT_CASE:
        o = conv.casing.get(obj.lower(), obj[:1].upper() + obj[1:])
        return o + '_' + EVENT_CASE[ev.lower()]
    return n


def module_header(kind):
    h = ['B4A=true', 'Group=Default Group', 'ModulesStructureVersion=1', 'Type=' + kind, 'Version=' + B4A_VERSION,
         '@EndOfDesignText@']
    if kind == 'Activity':
        h += ['#Region  Activity Attributes ', '\t#FullScreen: False', '\t#IncludeTitle: True', '#End Region', '']
    elif kind == 'Service':
        h += ['#Region  Service Attributes ', '\t#StartAtBoot: False', '\t#ExcludeFromLibrary: True', '#End Region', '']
    return h


def gen_module(conv, mod):
    g = Gen(conv, mod)
    g.globals_low = set()
    g.in_switch = []
    g.loc_names_low = {}
    g.no_return_type = True
    # nomi globali (per evitare conflitti con le locali)
    for f in mod.fields:
        if f.startswith('_'):
            g.globals_low.add(conv.bname(mod, f).lower())
    for mname in mod.methods:
        if mname.startswith('_'):
            g.globals_low.add(conv.bname(mod, mname, 'sub').lower())

    lines = []
    # ---------------- globali ----------------
    init_vals = {}
    for gm in ('_process_globals', '_globals', '_class_globals'):
        md = mod.methods.get(gm)
        if md is None:
            continue
        for st in md.body or []:
            if isinstance(st, T.StatementExpression) and isinstance(st.expression, T.Assignment):
                lhs = st.expression.expressionl
                if isinstance(lhs, T.MemberReference):
                    init_vals[lhs.member] = st.expression.value

    def field_decls(static_wanted):
        out = []
        for f, (ts, st, finit) in mod.fields.items():
            if not f.startswith('_') or f in ACT_BOILER or f == '__c':
                continue
            if mod.kind in ('Activity',) and st != static_wanted:
                continue
            tmod = conv.modules.get(ts)
            if tmod is not None and tmod.kind != 'Class' and (conv.is_obf(f) or strip_us(f) == tmod.name):
                continue  # riferimento a un altro modulo, generato da B4A
            if ts in EXTERNAL_B4X and (conv.is_obf(f) or strip_us(f) == ts.split('.')[-1]):
                continue
            nm = conv.bname(mod, f)
            b4 = conv.b4type(ts, mod) or 'Object'
            iv = init_vals.get(f)
            ivt = ''
            if iv is not None:
                g.ind = 0
                try:
                    r = g.norm(g.ex(iv, {}))
                    v = r[0]
                except Exception:
                    v = ''
                if v and not v.startswith('NEW') and v not in ('0', 'False', '""', 'Null', '0.0') and not v.startswith("'"):
                    ivt = ' = ' + v
                elif v.startswith('NEWARR:'):
                    _, eb, dims = v.split(':', 2)
                    out.append('\tPublic %s(%s) As %s' % (nm, dims, eb))
                    continue
            if b4.endswith('()') and not ivt:
                out.append('\tPublic %s() As %s' % (nm, b4[:-2]))
            elif b4.endswith(')') and '(' in b4 and not ivt:
                out.append('\tPublic %s%s As %s' % (nm, b4[b4.index('('):], b4[:b4.index('(')]))
            else:
                out.append('\tPublic %s As %s%s' % (nm, b4, ivt))
        return out

    def type_decls():
        out = []
        for tn, decl in mod.types.items():
            fl = []
            for b in decl.body:
                if isinstance(b, T.FieldDeclaration):
                    for d in b.declarators:
                        if d.name == 'IsInitialized':
                            continue
                        bt = conv.b4type(type_str(b.type), mod) or 'Object'
                        if bt.endswith('()'):
                            fl.append('%s() As %s' % (d.name, bt[:-2]))
                        else:
                            fl.append('%s As %s' % (d.name, bt))
            out.append('\tType %s(%s)' % (conv.type_name(tn), ', '.join(fl)))
        return out

    if mod.kind == 'Class':
        lines.append('Sub Class_Globals')
        lines += type_decls()
        lines += field_decls(False)
        lines.append('End Sub')
        lines.append('')
    else:
        lines.append('Sub Process_Globals')
        lines += type_decls()
        lines += field_decls(True)
        lines.append('End Sub')
        lines.append('')
        if mod.kind == 'Activity':
            lines.append('Sub Globals')
            lines += field_decls(False)
            lines.append('End Sub')
            lines.append('')

    # ---------------- sub ----------------
    for mname, md in mod.methods.items():
        if not mname.startswith('_') or mname in ('_process_globals', '_globals', '_class_globals', '__c'):
            continue
        if mname == '_getObject':
            continue
        if conv.is_obf(mname):
            disp = conv.bname(mod, mname, 'sub')
        elif mname == '_initialize' and mod.kind == 'Class':
            disp = 'Initialize'
        else:
            disp = ev_display(conv, mname)
        rs = conv.resumable_of(mod, md)
        g.out = []
        g.ind = 0
        if rs is not None:
            from resumable import gen_resumable
            gen_resumable(g, md, rs, disp)
        else:
            g.sub(md, disp)
        lines += g.out
    if g.uses_idlib:
        tgt = 'Sub Globals' if mod.kind == 'Activity' else ('Sub Class_Globals' if mod.kind == 'Class' else 'Sub Process_Globals')
        i = lines.index(tgt)
        lines.insert(i + 1, "\tPrivate idLib As id\t'libreria Id (dialoghi InputList1 ecc.)")
    return lines, g.warn


def collect_casing(files_dir, extra=()):
    """Nomi con maiuscole/minuscole originali presi dai layout .bal e da altre fonti."""
    cas = {}
    for fn in os.listdir(files_dir):
        if fn.endswith('.bal'):
            data = open(os.path.join(files_dir, fn), 'rb').read()
            for m in re.finditer(rb'[A-Za-z_][A-Za-z0-9_]{2,40}', data):
                s = m.group().decode()
                if any(ch.isupper() for ch in s) and s.lower() not in cas:
                    cas[s.lower()] = s
    for s in extra:
        cas.setdefault(s.lower(), s)
    return cas


def write_project(conv, out):
    os.makedirs(out, exist_ok=True)
    report = {}
    modules = []
    main_lines = None
    for mod in conv.modules.values():
        lines, warn = gen_module(conv, mod)
        report[mod.name] = warn
        if mod.name == 'main':
            main_lines = lines
            continue
        fn = mod.name + '.bas'
        with open(os.path.join(out, fn), 'w', encoding='utf-8', newline='\r\n') as f:
            f.write('\n'.join(module_header(mod.kind) + lines) + '\n')
        modules.append(mod.name)
    # librerie usate
    alltext = '\n'.join(m.src for m in conv.modules.values())
    libs = ['Core']
    for key, lib in LIBS:
        if key in alltext and lib not in libs:
            libs.append(lib)
    files_dir = os.path.join(out, 'Files')
    files = sorted(os.listdir(files_dir)) if os.path.isdir(files_dir) else []
    hdr = ['Build1=Default,cassandraRisto.ital']
    for i, f in enumerate(files, 1):
        hdr.append('File%d=%s' % (i, f))
    for i, f in enumerate(files, 1):
        hdr.append('FileGroup%d=Default Group' % i)
    hdr.append('Group=Default Group')
    for i, l in enumerate(libs, 1):
        hdr.append('Library%d=%s' % (i, l.lower()))
    manifest = open(os.path.join(os.path.dirname(__file__), 'manifest.txt'), encoding='utf-8').read().strip().split('\n')
    hdr.append('ManifestCode=' + '~\\n~'.join(manifest))
    for i, m in enumerate(modules, 1):
        hdr.append('Module%d=%s' % (i, m))
    hdr.append('NumberOfFiles=%d' % len(files))
    hdr.append('NumberOfLibraries=%d' % len(libs))
    hdr.append('NumberOfModules=%d' % len(modules))
    hdr.append('Version=' + B4A_VERSION)
    hdr.append('@EndOfDesignText@')
    attrs = ['#Region  Project Attributes ', '\t#ApplicationLabel: RistorAndro', '\t#VersionCode: 900',
             '\t#VersionName: 9.00', "\t'SupportedOrientations possible values: unspecified, landscape or portrait.",
             '\t#SupportedOrientations: unspecified', '\t#CanInstallToExternalStorage: False', '#End Region', '',
             '#Region  Activity Attributes ', '\t#FullScreen: False', '\t#IncludeTitle: True', '#End Region', '']
    with open(os.path.join(out, 'RistorAndro.b4a'), 'w', encoding='utf-8', newline='\r\n') as f:
        f.write('\n'.join(hdr + attrs + (main_lines or [])) + '\n')
    with open(os.path.join(out, 'conversione_report.json'), 'w', encoding='utf-8') as f:
        json.dump({'librerie': libs, 'moduli': modules, 'sub_da_verificare': report}, f, indent=1, ensure_ascii=False)
    return libs
