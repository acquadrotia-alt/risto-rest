#!/usr/bin/env python3
"""Controllo statico leggero dei sorgenti B4A generati: blocchi bilanciati e residui Java."""
import sys, re, glob, os
from collections import Counter

OPEN = [('If', re.compile(r'^If\b.*\bThen$', re.I)), ('For', re.compile(r'^For\b', re.I)),
        ('Do', re.compile(r'^Do\b', re.I)), ('Select', re.compile(r'^Select\b', re.I)),
        ('Try', re.compile(r'^Try$', re.I)), ('Sub', re.compile(r'^(Private |Public )?Sub\b', re.I))]
CLOSE = {'If': re.compile(r'^End If$', re.I), 'For': re.compile(r'^Next$', re.I), 'Do': re.compile(r'^Loop\b', re.I),
         'Select': re.compile(r'^End Select$', re.I), 'Try': re.compile(r'^End Try$', re.I), 'Sub': re.compile(r'^End Sub$', re.I)}
JAVA = [(r'&&', '&&'), (r'\|\|', '||'), (r'!=', '!='), (r'==', '=='), (r';\s*$', ';'), (r'\bnew [A-Z]', 'new'),
        (r'\bthis\.', 'this.'), (r'\bnull\b', 'null'), (r'NEW(ARR)?:', 'NEW:'), (r'/\*', '/*'), (r'\+\+|--\s*$', '++'),
        (r'\btrue\b|\bfalse\b', 'true/false'), (r'\bmostCurrent\b', 'mostCurrent'), (r'\bprocessBA\b|\bactivityBA\b|\bgetActivityBA\b', 'BA'),
        (r'\.get[A-Z]\w*\(\)', 'getter'), (r'\bBA_\w+', 'BA_'), (r'\?\?', '??'), (r'\b(Double|Integer|Long|Float|Boolean|String|Math|Character|System)\.[a-z]\w*', 'java statico'), (r'\(\s*,|,\s*,|,\s*\)', 'argomento vuoto')]


def strip_strings(l):
    return re.sub(r'"[^"]*"', '""', l)


def check(path):
    errs = []
    stack = []
    txt = open(path, encoding='utf-8').read().split('\n')
    started = False
    for i, raw in enumerate(txt, 1):
        l = raw.strip()
        if l == '@EndOfDesignText@':
            started = True
            continue
        if not started or not l or l.startswith("'") or l.startswith('#'):
            continue
        code = strip_strings(l.split(" '")[0] if '"' not in l else l)
        for kind, rx in OPEN:
            if rx.match(code):
                if kind == 'Sub' and stack:
                    errs.append((i, 'Sub dentro un blocco aperto: %s' % stack))
                    stack = []
                stack.append((kind, i))
                break
        else:
            for kind, rx in CLOSE.items():
                if rx.match(code):
                    if not stack or stack[-1][0] != kind:
                        errs.append((i, 'chiusura %s inattesa (aperti: %s)' % (kind, [s[0] for s in stack[-3:]])))
                        while stack and stack[-1][0] != kind:
                            stack.pop()
                    if stack:
                        stack.pop()
                    break
        if not code.startswith("'"):
            for rx, lab in JAVA:
                if re.search(rx, code):
                    errs.append((i, 'residuo java [%s]: %s' % (lab, l[:140])))
                    break
    if stack:
        errs.append((len(txt), 'blocchi non chiusi: %s' % stack[-3:]))
    return errs


if __name__ == '__main__':
    d = sys.argv[1]
    tot = Counter()
    files = sorted(glob.glob(os.path.join(d, '*.bas')) + glob.glob(os.path.join(d, '*.b4a')))
    allerr = []
    for f in files:
        e = check(f)
        for ln, msg in e:
            allerr.append('%s:%d: %s' % (os.path.basename(f), ln, msg))
            tot[re.sub(r':.*', '', msg)[:40]] += 1
    out = sys.argv[2] if len(sys.argv) > 2 else None
    if out:
        open(out, 'w', encoding='utf-8').write('\n'.join(allerr) + '\n')
    for k, v in tot.most_common():
        print(v, k)
    print('TOTALE', len(allerr))
