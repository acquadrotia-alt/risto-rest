#!/usr/bin/env python3
"""
j2b4a.py - Riconversione del codice Java generato da B4A (decompilato con jadx)
in sorgenti B4A (.bas / .b4a).

Uso:
  python3 j2b4a.py <dir_sorgenti_jadx> <dir_output> [--nomi nomi.csv] [--pkg cassandraRisto.ital]

Il codice di input deve essere prodotto da jadx con:
  jadx --no-replace-consts --no-inline-anonymous --rename-flags none --no-imports --show-bad-code

I nomi offuscati (_vvvv...N) vengono sostituiti con alias leggibili e stabili.
Il file nomi.csv (modulo;tipo;originale;alias;nuovo_nome) permette di assegnare
nomi definitivi: basta compilare la colonna nuovo_nome e rilanciare.
"""
import sys, os, re, glob, csv, json
from collections import OrderedDict, defaultdict
import javalang
from javalang import tree as T

# --------------------------------------------------------------------------------------
# Tabelle di conversione
# --------------------------------------------------------------------------------------
PRIM = {'int': 'Int', 'boolean': 'Boolean', 'double': 'Double', 'float': 'Float', 'long': 'Long',
        'short': 'Short', 'byte': 'Byte', 'char': 'Char', 'void': None}

TYPE_MAP = {
    'java.lang.String': 'String', 'String': 'String', 'java.lang.Object': 'Object',
    'java.lang.CharSequence': 'Object', 'java.lang.StringBuilder': 'String',
    'java.lang.Integer': 'Int', 'java.lang.Double': 'Double', 'java.lang.Long': 'Long',
    'java.lang.Boolean': 'Boolean', 'java.lang.Float': 'Float',
    'anywheresoftware.b4a.objects.collections.Map': 'Map',
    'anywheresoftware.b4a.objects.collections.List': 'List',
    'anywheresoftware.b4a.sql.SQL': 'SQL',
    'anywheresoftware.b4a.sql.SQL.CursorWrapper': 'Cursor',
    'anywheresoftware.b4a.sql.SQL.ResultSetWrapper': 'ResultSet',
    'anywheresoftware.b4a.objects.Timer': 'Timer',
    'anywheresoftware.b4a.objects.IME': 'IME',
    'anywheresoftware.b4a.objects.B4XViewWrapper': 'B4XView',
    'anywheresoftware.b4a.objects.B4XViewWrapper.XUI': 'XUI',
    'anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper': 'B4XBitmap',
    'anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont': 'B4XFont',
    'anywheresoftware.b4a.objects.B4XCanvas': 'B4XCanvas',
    'anywheresoftware.b4a.objects.B4XCanvas.B4XRect': 'B4XRect',
    'anywheresoftware.b4a.objects.B4XCanvas.B4XPath': 'B4XPath',
    'anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper': 'CheckBox',
    'anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper': 'ToggleButton',
    'anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper': 'RadioButton',
    'anywheresoftware.b4a.objects.drawable.CanvasWrapper': 'Canvas',
    'anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper': 'Bitmap',
    'anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper': 'Rect',
    'anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper': 'Path',
    'anywheresoftware.b4a.objects.drawable.ColorDrawable': 'ColorDrawable',
    'anywheresoftware.b4a.objects.drawable.GradientDrawable': 'GradientDrawable',
    'anywheresoftware.b4a.objects.drawable.BitmapDrawable': 'BitmapDrawable',
    'anywheresoftware.b4a.objects.drawable.StateListDrawable': 'StateListDrawable',
    'anywheresoftware.b4a.objects.streams.File.InputStreamWrapper': 'InputStream',
    'anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper': 'OutputStream',
    'anywheresoftware.b4a.objects.streams.File.TextWriterWrapper': 'TextWriter',
    'anywheresoftware.b4a.objects.streams.File.TextReaderWrapper': 'TextReader',
    'anywheresoftware.b4a.keywords.StringBuilderWrapper': 'StringBuilder',
    'anywheresoftware.b4a.objects.CSBuilder': 'CSBuilder',
    'anywheresoftware.b4a.objects.StringUtils': 'StringUtils',
    'anywheresoftware.b4a.objects.RuntimePermissions': 'RuntimePermissions',
    'anywheresoftware.b4a.objects.SocketWrapper': 'Socket',
    'anywheresoftware.b4a.objects.SocketWrapper.UDPSocket': 'UDPSocket',
    'anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper': 'ServerSocket',
    'anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket': 'UDPPacket',
    'anywheresoftware.b4a.objects.HttpServer': 'HttpServer',
    'anywheresoftware.b4a.objects.ServletRequestWrapper': 'ServletRequest',
    'anywheresoftware.b4a.objects.ServletResponseWrapper': 'ServletResponse',
    'anywheresoftware.b4a.objects.AnimationWrapper': 'Animation',
    'anywheresoftware.b4a.objects.ConcreteViewWrapper': 'View',
    'anywheresoftware.b4a.objects.ActivityWrapper': 'Activity',
    'anywheresoftware.b4a.objects.IntentWrapper': 'Intent',
    'anywheresoftware.b4a.objects.NotificationWrapper': 'Notification',
    'anywheresoftware.b4a.objects.usb.UsbManagerWrapper': 'UsbManager',
    'anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbDeviceWrapper': 'UsbDevice',
    'anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbEndpointWrapper': 'UsbEndpoint',
    'anywheresoftware.b4a.objects.usb.UsbManagerWrapper.UsbInterfaceWrapper': 'UsbInterface',
    'anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper': 'UsbDeviceConnection',
    'anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper.UsbRequestWrapper': 'UsbRequest',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog': 'InputDialog',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog': 'CustomLayoutDialog',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog2': 'CustomDialog2',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog': 'CustomDialog',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog': 'DateDialog',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog': 'TimeDialog',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog': 'NumberDialog',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.ColorDialog': 'ColorDialog',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.FileDialog': 'FileDialog',
    'anywheresoftware.b4a.agraham.dialogs.InputDialog.ColorPickerDialog': 'ColorPickerDialog',
    'anywheresoftware.b4a.agraham.reflection.Reflection': 'Reflector',
    'anywheresoftware.b4a.agraham.threading.Threading': 'Thread',
    'anywheresoftware.b4a.agraham.threading.Threading.SemaphoreWrapper': 'Semaphore',
    'anywheresoftware.b4a.agraham.threading.Threading.LockWrapper': 'Lock',
    'anywheresoftware.b4a.net.FTPWrapper': 'FTP',
    'anywheresoftware.b4a.net.SMTPWrapper': 'SMTP',
    'anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper': 'FTPEntry',
    'anywheresoftware.b4a.phone.Phone': 'Phone',
    'anywheresoftware.b4a.phone.Phone.PhoneWakeState': 'PhoneWakeState',
    'anywheresoftware.b4a.phone.Phone.VoiceRecognition': 'VoiceRecognition',
    'anywheresoftware.b4a.phone.Phone.PhoneVibrate': 'PhoneVibrate',
    'anywheresoftware.b4a.phone.Phone.PhoneIntents': 'PhoneIntents',
    'anywheresoftware.b4a.phone.Phone.Email': 'Email',
    'anywheresoftware.b4a.phone.PackageManagerWrapper': 'PackageManager',
    'anywheresoftware.b4a.randomaccessfile.RandomAccessFile': 'RandomAccessFile',
    'anywheresoftware.b4a.randomaccessfile.AsyncStreams': 'AsyncStreams',
    'anywheresoftware.b4a.randomaccessfile.B4XSerializator': 'B4XSerializator',
    'anywheresoftware.b4a.randomaccessfile.CountingStreams': 'CountingInputStream',
    'anywheresoftware.b4a.audio.SoundPoolWrapper': 'SoundPool',
    'anywheresoftware.b4a.audio.MediaPlayerWrapper': 'MediaPlayer',
    'anywheresoftware.b4a.audio.Beeper': 'Beeper',
    'anywheresoftware.b4a.object.XmlLayoutBuilder': 'XmlLayoutBuilder',
    'anywheresoftware.b4j.object.JavaObject': 'JavaObject',
    'anywheresoftware.b4j.objects.MqttAsyncClientWrapper': 'MqttClient',
    'anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper': 'MqttConnectOptions',
    'anywheresoftware.b4h.okhttp.OkHttpClientWrapper': 'OkHttpClient',
    'anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest': 'OkHttpRequest',
    'anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse': 'OkHttpResponse',
    'anywheresoftware.b4a.objects.WebViewWrapper': 'WebView',
    'anywheresoftware.b4a.objects.TabHostWrapper': 'TabHost',
    'anywheresoftware.b4a.objects.SeekBarWrapper': 'SeekBar',
    'anywheresoftware.b4a.objects.ListViewWrapper': 'ListView',
    'anywheresoftware.b4a.objects.ScrollViewWrapper': 'ScrollView',
    'anywheresoftware.b4a.objects.HorizontalScrollViewWrapper': 'HorizontalScrollView',
    'anywheresoftware.b4a.objects.SpinnerWrapper': 'Spinner',
    'anywheresoftware.b4a.objects.LabelWrapper': 'Label',
    'anywheresoftware.b4a.objects.ButtonWrapper': 'Button',
    'anywheresoftware.b4a.objects.PanelWrapper': 'Panel',
    'anywheresoftware.b4a.objects.EditTextWrapper': 'EditText',
    'anywheresoftware.b4a.objects.ImageViewWrapper': 'ImageView',
    'anywheresoftware.b4a.objects.ProgressBarWrapper': 'ProgressBar',
    'anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper': 'AutoCompleteEditText',
    'anywheresoftware.b4a.objects.LayoutValues': 'LayoutValues',
    'anywheresoftware.b4a.objects.Serial': 'Serial',
    'anywheresoftware.b4a.objects.streams.File': 'File',
    'flm.b4a.ultimatelistview.UltimateListViewWrapper': 'UltimateListView',
    'flm.b4a.gesturedetector.GestureDetectorForB4A': 'GestureDetector',
    'flm.b4a.animationplus.AnimationPlusWrapper': 'AnimationPlus',
    'com.rootsoft.pdfwriter.myPDFWriter': 'PDFWriter',
    'com.rootsoft.pdfwriter.PaperSize': 'PDFPaperSizes',
    'com.rootsoft.pdfwriter.StandardFonts': 'PDFStandardFonts',
    'com.rootsoft.tweenengine.RSTween': 'RSTween',
    'com.rootsoft.tweenengine.RSTweenManager': 'RSTweenManager',
    'com.rootsoft.tweenengine.RSTweenConstants': 'RSTweenConstants',
    'com.rootsoft.tweenengine.RSTweenCallback': 'RSTweenCallback',
    'uk.co.martinpearman.b4a.downloadmanager.B4ADownloadManager': 'DownloadManager',
    'njdude.custom.progressdialog.customprogressdialog': 'CustomProgressDialog',
    'mpandroidchartwrapper.pieChartWrapper': 'PieChart',
    'mpandroidchartwrapper.barChartWrapper': 'BarChart',
    'b4a.example.dateutils': 'DateUtils',
    'b4a.example.dateutils._period': 'Period',
    'b4a.example.bitmapcreator': 'BitmapCreator',
    'b4a.example.bcpath': 'BCPath',
    'b4a.example.bcpath._bcbrush': 'BCBrush',
    'b4a.example3.customlistview': 'CustomListView',
    'b4a.example3.customlistview._clvitem': 'CLVItem',
    'anywheresoftware.b4a.objects.collections.JSONParser': 'JSONParser',
    'anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator': 'JSONGenerator',
    'anywheresoftware.b4a.objects.SaxParser': 'SaxParser',
    'anywheresoftware.b4a.objects.SaxParser.AttributesWrapper': 'Attributes',
    'anywheresoftware.b4a.objects.Base64': 'Base64',
    'anywheresoftware.b4a.keywords.Regex.MatcherWrapper': 'Matcher',
    'anywheresoftware.b4a.objects.B4XEncryption': 'B4XCipher',
    'anywheresoftware.b4a.objects.PreferenceActivity': 'PreferenceManager',
    'anywheresoftware.b4a.keywords.Common.ResumableSubWrapper': 'ResumableSub',
    'anywheresoftware.b4a.BA': 'BA',
}

# Oggetti "keyword" statici di Common accessibili senza istanza
KEYWORD_OBJS = {'Colors', 'DateTime', 'File', 'Bit', 'KeyCodes', 'Gravity', 'DialogResponse', 'Typeface',
                'Regex', 'Density', 'Application', 'StartServiceAt', 'LastException'}

# Nomi di libreria esterna (B4X library) usati come moduli: non vengono riconvertiti
EXTERNAL_B4X = {'b4a.example.dateutils': 'DateUtils', 'b4a.example.bitmapcreator': 'BitmapCreator',
                'b4a.example.bcpath': 'BCPath', 'b4a.example3.customlistview': 'CustomListView'}

JAVA_STRING_METHODS = {
    'length': ('prop', 'Length'), 'toUpperCase': ('prop', 'ToUpperCase'), 'toLowerCase': ('prop', 'ToLowerCase'),
    'trim': ('prop', 'Trim'), 'substring': ('sub', None), 'replace': ('m', 'Replace'),
    'contains': ('m', 'Contains'), 'indexOf': ('m', 'IndexOf'), 'lastIndexOf': ('m', 'LastIndexOf'),
    'startsWith': ('m', 'StartsWith'), 'endsWith': ('m', 'EndsWith'), 'charAt': ('m', 'CharAt'),
    'compareTo': ('m', 'CompareTo'), 'equalsIgnoreCase': ('m', 'EqualsIgnoreCase'),
    'getBytes': ('m', 'GetBytes'), 'toString': ('id', None), 'intern': ('id', None),
}

B4A_RESERVED = {x.lower() for x in '''
and or not if then else end sub dim as return for to step next each in loop do while until exit continue
select case try catch type private public true false null me mod is global const as new
sender file bit colors datetime keycodes gravity typeface regex density lastexception log round round2
abs max min sqrt sin cos tan power floor ceil rnd rndseed chr asc msgbox msgbox2 inputlist
callsub callsub2 callsub3 callsubdelayed array activity service starter main
'''.split()}


def strip_pkg(t):
    return t.split('.')[-1]


class Ctx:
    pass


# --------------------------------------------------------------------------------------
# Modello dei moduli
# --------------------------------------------------------------------------------------
class Module:
    def __init__(self, name, fqn, cls, src, kind):
        self.name = name          # nome B4A (es. main)
        self.fqn = fqn
        self.cls = cls            # ClassDeclaration
        self.src = src
        self.kind = kind          # Activity | Service | StaticCode | Class
        self.fields = OrderedDict()   # name -> (javatype, static)
        self.methods = OrderedDict()  # name -> MethodDeclaration
        self.types = OrderedDict()    # inner Type classes name -> ClassDeclaration
        self.resumables = OrderedDict()  # sub name -> ClassDeclaration
        self.bad_methods = set()


def type_str(t):
    """javalang Type -> stringa java (con dimensioni)"""
    if t is None:
        return 'void'
    if isinstance(t, T.BasicType):
        s = t.name
    else:
        parts = []
        cur = t
        while cur is not None:
            parts.append(cur.name)
            cur = getattr(cur, 'sub_type', None)
        s = '.'.join(parts)
    dims = len(t.dimensions or [])
    return s + '[]' * dims


class Converter:
    def __init__(self, srcdir, pkgs, names_csv=None, casing=None):
        self.modules = OrderedDict()   # fqn -> Module
        self.byname = {}               # nome semplice -> Module (per i pacchetti convertiti)
        self.pkgs = pkgs
        self.names = {}                # (mod, kind, orig) -> alias
        self.names_csv = names_csv
        self.casing = casing or {}
        self.load(srcdir)
        self.build_names()

    # ---------------- caricamento ----------------
    def load(self, srcdir):
        for pkg in self.pkgs:
            pdir = os.path.join(srcdir, *pkg.split('.'))
            for f in sorted(glob.glob(os.path.join(pdir, '*.java'))):
                src = open(f, encoding='utf-8').read()
                fixed = re.sub(r'\?\?\s+(\w+)', r'java.lang.Object \1', src)  # tipi non inferiti da jadx
                fixed = re.sub(r'\bclass (\d+)\b', r'class Anon_\1', fixed)    # classi anonime
                fixed = re.sub(r'([A-Za-z_]\w*)\.(\d+)\b(?![.\d])', r'\1.Anon_\2', fixed)
                fixed = re.sub(r'\bnew (\d+)\(', r'new Anon_\1(', fixed)
                fixed = re.sub(r'(?m)^(\s+)(\d+)\(', r'\1Anon_\2(', fixed)
                try:
                    cu = javalang.parse.parse(fixed)
                except Exception as e:
                    print('ERRORE parsing', f, e, file=sys.stderr)
                    continue
                cls = cu.types[0]
                name = cls.name
                if name == 'R' or name == 'designerscripts' or name.startswith('BuildConfig'):
                    continue
                kind = self.detect_kind(cls, src)
                m = Module(name, pkg + '.' + name, cls, fixed, kind)
                self.collect(m, fixed)
                self.modules[m.fqn] = m
                self.byname[name] = m

    def detect_kind(self, cls, src):
        ext = type_str(cls.extends) if cls.extends else ''
        if 'Activity' in ext:
            return 'Activity'
        if 'Service' in ext:
            return 'Service'
        if 'B4AClass' in ext or (cls.implements and any('B4AClass' in type_str(i) for i in cls.implements)):
            return 'Class'
        return 'StaticCode'

    def collect(self, m, src):
        lines = src.split('\n')
        for decl in m.cls.body:
            if isinstance(decl, T.FieldDeclaration):
                ts = type_str(decl.type)
                for d in decl.declarators:
                    m.fields[d.name] = (ts, 'static' in decl.modifiers, d.initializer)
            elif isinstance(decl, T.MethodDeclaration):
                m.methods[decl.name] = decl
                # metodo decompilato in modo imperfetto?
                if decl.position:
                    ln = decl.position.line - 1
                    back = '\n'.join(lines[max(0, ln - 40):ln])
                    last = back.rfind('    }')  # fine del metodo precedente
                    seg = back[last:] if last >= 0 else back
                    if 'Code decompiled incorrectly' in seg or 'code lost' in seg or 'Code restructure failed' in seg:
                        m.bad_methods.add(decl.name)
            elif isinstance(decl, T.ClassDeclaration):
                if decl.name.startswith('ResumableSub_'):
                    m.resumables[decl.name[len('ResumableSub_'):].lower()] = decl
                elif any(isinstance(b, T.FieldDeclaration) and any(dd.name == 'IsInitialized' for dd in b.declarators)
                         for b in decl.body):
                    m.types[decl.name] = decl

    # ---------------- nomi ----------------
    OBF = re.compile(r'^_?v{3,}\d+$')

    def is_obf(self, n):
        return bool(self.OBF.match(n))

    def build_names(self):
        existing = {}
        if self.names_csv and os.path.exists(self.names_csv):
            with open(self.names_csv, encoding='utf-8') as f:
                for row in csv.DictReader(f, delimiter=';'):
                    existing[(row['modulo'], row['tipo'], row['originale'])] = (row['alias'], row.get('nuovo_nome', '').strip())
        self.rows = []
        for m in self.modules.values():
            cnt = defaultdict(int)
            used = {strip_us(n).lower() for n in list(m.fields) + list(m.methods) if not self.is_obf(n)}
            for n, (ts, st, _) in m.fields.items():
                if self.is_obf(n):
                    key = (m.name, 'var', n)
                    if key in existing:
                        alias, new = existing[key]
                    else:
                        p = self.prefix_for(ts)
                        cnt[p] += 1
                        alias = '%s%d' % (p, cnt[p])
                        while alias.lower() in used:
                            cnt[p] += 1
                            alias = '%s%d' % (p, cnt[p])
                        new = ''
                    used.add(alias.lower())
                    self.names[key] = new or alias
                    self.rows.append({'modulo': m.name, 'tipo': 'var', 'originale': n, 'alias': alias,
                                      'nuovo_nome': new, 'tipo_dato': self.b4type(ts, m)})
            for n, md in m.methods.items():
                if self.is_obf(n):
                    key = (m.name, 'sub', n)
                    rsn = self.resumable_name(md)
                    if key in existing:
                        alias, new = existing[key]
                    elif rsn:
                        alias, new = rsn, ''
                    else:
                        cnt['sub'] += 1
                        alias = 'Sub%03d' % cnt['sub']
                        new = ''
                    self.names[key] = new or alias
                    self.rows.append({'modulo': m.name, 'tipo': 'sub', 'originale': n, 'alias': alias,
                                      'nuovo_nome': new, 'tipo_dato': self.b4type(type_str(md.return_type), m) or ''})

    def resumable_name(self, md):
        for _, n in md.filter(T.ClassCreator):
            tn = type_str(n.type)
            if 'ResumableSub_' in tn:
                return tn.split('ResumableSub_')[-1]
        return None

    def resumable_of(self, mod, md):
        n = self.resumable_name(md)
        if n:
            for b in mod.cls.body:
                if isinstance(b, T.ClassDeclaration) and b.name == 'ResumableSub_' + n:
                    return b
        return None

    def prefix_for(self, ts):
        b = self.b4type(ts, None) or 'Obj'
        b = b.replace('()', 'Arr').replace('(', '').replace(')', '').replace(',', '')
        short = {'String': 'str', 'Int': 'int', 'Boolean': 'bln', 'Double': 'dbl', 'Long': 'lng', 'Float': 'flt',
                 'Map': 'map', 'List': 'lst', 'Label': 'lbl', 'Button': 'btn', 'Panel': 'pnl', 'EditText': 'txt',
                 'Cursor': 'cur', 'SQL': 'sql', 'Timer': 'tmr', 'ImageView': 'img', 'Bitmap': 'bmp',
                 'CheckBox': 'chk', 'Spinner': 'spn', 'B4XView': 'xv', 'InputDialog': 'dlg', 'ListView': 'lv',
                 'Object': 'obj', 'Byte': 'byt', 'Short': 'sht', 'Char': 'chr'}
        if b in short:
            return 'v' + short[b].capitalize()
        return 'v' + re.sub(r'[^A-Za-z0-9]', '', b)

    # ---------------- tipi ----------------
    def b4type(self, ts, m):
        if ts is None or ts == 'void':
            return None
        dims = ts.count('[]')
        base = ts.replace('[]', '')
        if base in PRIM:
            r = PRIM[base]
        elif base in TYPE_MAP:
            r = TYPE_MAP[base]
        else:
            mod = self.module_of_type(base)
            if mod is not None:
                if isinstance(mod, tuple):  # tipo (Type) interno a un modulo
                    r = mod[1]
                else:
                    r = mod.name
            elif base.startswith('cassandraRisto') or base.startswith('ital.'):
                r = strip_pkg(base)
            else:
                s = strip_pkg(base)
                r = re.sub(r'Wrapper$', '', s)
        if dims:
            r += '()' if dims == 1 else '(' + ',' * (dims - 1) + ')'
        return r

    def module_of_type(self, base):
        if base in self.modules:
            return self.modules[base]
        # Tipo interno: pkg.module._tipo
        parts = base.split('.')
        if len(parts) >= 2:
            outer = '.'.join(parts[:-1])
            if outer in self.modules and parts[-1] in self.modules[outer].types:
                return (self.modules[outer], self.type_name(parts[-1]))
        return None

    def type_name(self, n):
        return self.casing.get(n.lstrip('_').lower(), n.lstrip('_'))

    def bname(self, mod, n, kind='var'):
        """Nome B4A di un membro (campo/metodo) di un modulo convertito."""
        if self.is_obf(n):
            return self.names.get((mod.name, kind, n), n)
        if kind == 'sub':
            return strip_us(n)
        return self.pretty(n)

    def pretty(self, n):
        n = strip_us(n)
        c = self.casing.get(n.lower())
        if c:
            return c
        # Eventi: oggetto_evento -> Oggetto_Evento
        return n

    def modname(self, mod):
        return self.casing.get(mod.name.lower(), mod.name.capitalize() if mod.name == 'main' else mod.name)

    # ---------------- output ----------------
    def write_names(self, path):
        with open(path, 'w', encoding='utf-8', newline='') as f:
            w = csv.DictWriter(f, fieldnames=['modulo', 'tipo', 'originale', 'alias', 'nuovo_nome', 'tipo_dato'], delimiter=';')
            w.writeheader()
            for r in self.rows:
                w.writerow(r)


def strip_us(n):
    return n[1:] if n.startswith('_') else n


# --------------------------------------------------------------------------------------
# Generatore di codice per un modulo
# --------------------------------------------------------------------------------------
class Gen:
    def __init__(self, conv, mod):
        self.c = conv
        self.m = mod
        self.out = []
        self.ind = 0
        self.warn = []
        self.rs = None
        self.uses_idlib = False

    # ===== utilità =====
    def emit(self, s=''):
        self.out.append(('\t' * self.ind + s) if s else '')

    # ===== tipi di espressione =====
    # Valori: (codice, tipo) dove tipo è una stringa java, oppure 'MOD:<nome>', 'COMMON', 'BA', 'KW:<Obj>', 'SB'
    def resolve_qual(self, q, loc):
        """Risolve un qualificatore testuale (es. 'mostCurrent', 'cassandraRisto.ital.main', 'this.parent')."""
        if not q:
            return None
        parts = q.split('.')
        # pacchetto + modulo
        for i in range(len(parts), 0, -1):
            pre = '.'.join(parts[:i])
            if pre in self.KW_CLASSES:
                return self.chain_fields((self.KW_CLASSES[pre], 'KW:' + self.KW_CLASSES[pre]), parts[i:], loc)
            if pre in self.c.modules:
                val = ('', 'MOD:' + self.c.modules[pre].name)
                return self.chain_fields(val, parts[i:], loc)
            if pre in EXTERNAL_B4X:
                val = (EXTERNAL_B4X[pre], 'EXT:' + pre)
                return self.chain_fields(val, parts[i:], loc)
            if pre in ('anywheresoftware.b4a.keywords.Common', 'keywords.Common', 'Common'):
                return self.chain_fields(('', 'COMMON'), parts[i:], loc)
            if pre in ('anywheresoftware.b4a.BA', 'BA'):
                return self.chain_fields(('', 'BAS'), parts[i:], loc)
            if pre in TYPE_MAP and i == len(parts):
                return (TYPE_MAP[pre], 'STATIC:' + pre)
        first = parts[0]
        if self.rs is not None and first == 'this':
            return self.chain_fields(('', 'RSSELF'), parts[1:], loc)
        if first in loc:
            return self.chain_fields(loc[first], parts[1:], loc)
        if first == 'this':
            return self.chain_fields(('', 'SELF'), parts[1:], loc)
        if first == 'mostCurrent':
            return self.chain_fields(('', 'MOD:' + self.m.name), parts[1:], loc)
        if first in ('processBA', 'ba', 'activityBA'):
            return ('', 'BA')
        if first in self.m.fields:
            return self.chain_fields(self.field_val(self.m, first, ('', 'MOD:' + self.m.name)), parts[1:], loc)
        if first == 'parent':
            return ('', 'MOD:' + self.m.name)
        for i in range(len(parts), 0, -1):
            pre = '.'.join(parts[:i])
            if pre in self.KW_CLASSES:
                val = (self.KW_CLASSES[pre], 'KW:' + self.KW_CLASSES[pre])
                for p in parts[i:]:
                    val = (val[0] + '.' + p, None)
                return val
        # tipi java statici (Math, Integer, ...)
        return (q, 'JSTATIC:' + q)

    def chain_fields(self, val, rest, loc):
        for p in rest:
            val = self.member(val, p, loc)
        return val

    def mod_of_val(self, val):
        t = val[1]
        if isinstance(t, str) and t.startswith('MOD:'):
            return self.c.byname.get(t[4:])
        if t == 'SELF':
            return self.m
        if t and t in self.c.modules:
            return self.c.modules[t]
        return None

    def field_val(self, mod, f, base):
        ts, st, _ = mod.fields[f]
        name = self.c.bname(mod, f)
        # campo che contiene un riferimento a un modulo (code module/activity/service)
        tmod = self.c.modules.get(ts)
        if tmod is not None and tmod.kind != 'Class' and f.startswith('_') and (self.c.is_obf(f) or strip_us(f) == tmod.name):
            return ('', 'MOD:' + tmod.name)
        if ts in EXTERNAL_B4X and tmod is None and not (mod.kind == 'Class' and not st):
            # riferimento a libreria b4x usata come modulo statico
            if self.c.is_obf(f) or strip_us(f) == strip_pkg(ts):
                return (EXTERNAL_B4X[ts], 'EXT:' + ts)
        prefix = ''
        if base[1] in ('MOD:' + self.m.name, 'SELF'):
            prefix = ''
        elif base[0]:
            prefix = base[0] + '.'
        elif base[1].startswith('MOD:'):
            prefix = self.c.modname(self.c.byname[base[1][4:]]) + '.'
        return (prefix + name, ts)

    def member(self, val, p, loc):
        code, t = val[0], val[1]
        if t == 'RSSELF':
            if p == 'parent':
                return ('', 'MOD:' + self.m.name)
            if p == 'state':
                return ('rsState', 'int')
            if p == 'catchState':
                return ('rsCatchState', 'int')
            if ('rs', p) in self.rs['loc']:
                return (self.rs['loc'][('rs', p)], self.rs['fields'].get(p))
            return (strip_us(p), None)
        if p in ('mostCurrent',):
            return ('', t) if t.startswith('MOD:') else val
        if p in ('processBA', 'activityBA', 'ba', 'getActivityBA'):
            return ('', 'BA')
        if p == '__c':
            return ('', 'COMMON')
        if p == 'parent' and (t == 'SELF'):
            return ('', 'MOD:' + self.m.name)
        if t == 'COMMON':
            return (p, 'KW:' + p)
        if isinstance(t, str) and t.startswith('KW:'):
            return (code + '.' + p, None)
        if t == 'BAS':
            return (p, 'BAS.' + p)
        mod = self.mod_of_val(val)
        if mod is not None:
            if p == '_activity':
                return ('Activity', 'anywheresoftware.b4a.objects.ActivityWrapper')
            if p == '_service':
                return ('Service', 'Service')
            if p in ('processBA', 'activityBA', 'ba'):
                return ('', 'BA')
            if p in mod.fields:
                return self.field_val(mod, p, val)
            if p in mod.types:
                return (self.c.type_name(p), 'TYPE')
            return ((code + '.' if code else '') + self.c.pretty(p), None)
        # tipo B4A (Type) interno: campo
        if t and t.startswith('cassandraRisto') or (t and t.startswith('ital.')):
            tm = self.c.module_of_type(t)
            if isinstance(tm, tuple):
                fts = self.type_field_type(t, p)
                return (code + '.' + p, fts)
        if p == 'length' and t and t.endswith('[]'):
            return (code + '.Length', 'int')
        if t and t.startswith('EXT:'):
            return (code + '.' + strip_us(p), None)
        return ((code + '.' if code else '') + strip_us(p) if p.startswith('_') else (code + '.' if code else '') + p, None)

    def type_field_type(self, t, p):
        tm = self.c.module_of_type(t)
        mod, nm = tm
        decl = mod.types[t.split('.')[-1]]
        for b in decl.body:
            if isinstance(b, T.FieldDeclaration):
                for d in b.declarators:
                    if d.name == p:
                        return type_str(b.type)
        return None

    # ===== espressioni =====
    PREC = {'Or': 1, 'And': 2, 'cmp': 3, '&': 4, '+': 5, '-': 5, '*': 6, '/': 6, 'Mod': 6, 'unary': 7, 'atom': 9}

    def ex(self, e, loc):
        """Ritorna (codice, tipo, precedenza)"""
        r = self._ex(e, loc)
        if len(r) == 2:
            r = (r[0], r[1], 9)
        return r

    def exs(self, e, loc):
        return self.ex(e, loc)[0]

    def par(self, r, prec):
        return '(' + r[0] + ')' if r[2] < prec else r[0]

    def _ex(self, e, loc):
        if e is None:
            return ('', None)
        pre = e.prefix_operators or [] if hasattr(e, 'prefix_operators') else []
        post = e.postfix_operators or [] if hasattr(e, 'postfix_operators') else []
        if pre:
            saved = e.prefix_operators
            e.prefix_operators = []
            try:
                inner = self.ex(e, loc)
            finally:
                e.prefix_operators = saved
            for op in reversed(pre):
                if op == '!':
                    # Not(a.equals(b)) -> a <> b
                    if inner[0].count(' = ') == 1 and inner[2] == 3:
                        inner = (inner[0].replace(' = ', ' <> '), 'boolean', 3)
                    elif inner[0].startswith('Not(') and inner[0].endswith(')') and self.balanced(inner[0][4:-1]):
                        inner = (inner[0][4:-1], 'boolean', 3)
                    else:
                        inner = ('Not(' + inner[0] + ')', 'boolean', 9)
                elif op == '-':
                    inner = ('-' + self.par(inner, 7), inner[1], 7)
                elif op == '+':
                    pass
                elif op == '~':
                    inner = ('Bit.Not(' + inner[0] + ')', inner[1], 9)
                elif op in ('++', '--'):
                    inner = ('/*' + op + '*/' + inner[0], inner[1], 9)
            return inner
        r = self._ex2(e, loc)
        return r

    @staticmethod
    def balanced(t):
        d = 0
        q = False
        for ch in t:
            if ch == '"':
                q = not q
            elif not q:
                if ch == '(':
                    d += 1
                elif ch == ')':
                    d -= 1
                    if d < 0:
                        return False
        return d == 0

    def lit(self, v):
        if v in ('true', 'false'):
            return (v.capitalize(), 'boolean')
        if v == 'null':
            return ('Null', 'null')
        if v.startswith('"'):
            return (self.jstr(v), 'java.lang.String')
        if v.startswith("'"):
            s = bytes(v[1:-1], 'utf-8').decode('unicode_escape') if '\\' in v else v[1:-1]
            if s == '"':
                return ('QUOTE', 'char')
            return (self.b4str(s), 'char')
        n = v.rstrip('LlFfDd') if not v.lower().startswith('0x') else v.rstrip('Ll')
        if n.lower().startswith('0x'):
            return ('0x' + n[2:].upper(), 'int')
        t = 'double' if ('.' in n or 'e' in n.lower()) else ('long' if v[-1] in 'Ll' else 'int')
        if t == 'double' and n.endswith('.0'):
            n = n[:-2]
        return (n, t)

    def jstr(self, v):
        body = v[1:-1]
        s = ''
        i = 0
        while i < len(body):
            ch = body[i]
            if ch == '\\' and i + 1 < len(body):
                nx = body[i + 1]
                if nx == 'u':
                    s += chr(int(body[i + 2:i + 6], 16)); i += 6; continue
                s += {'n': '\n', 'r': '\r', 't': '\t', '"': '"', '\\': '\\', "'": "'", '0': '\0', 'b': '\b', 'f': '\f'}.get(nx, nx)
                i += 2
                continue
            s += ch
            i += 1
        return self.b4str(s)

    def b4str(self, s):
        if s == '':
            return '""'
        parts = []
        cur = ''
        special = {'"': 'QUOTE', '\n': 'CRLF', '\r': 'Chr(13)', '\t': 'TAB'}
        for ch in s:
            if ch in special or (ord(ch) < 32):
                if cur:
                    parts.append('"' + cur + '"')
                    cur = ''
                parts.append(special.get(ch, 'Chr(%d)' % ord(ch)))
            else:
                cur += ch
        if cur:
            parts.append('"' + cur + '"')
        return ' & '.join(parts)

    def is_str(self, t):
        return t in ('java.lang.String', 'String', 'SB', 'char', 'java.lang.CharSequence')

    def _ex2(self, e, loc):
        if isinstance(e, T.Literal):
            r = self.lit(e.value)
            return self.apply_selectors(r, e.selectors, loc)
        if isinstance(e, T.MemberReference):
            if self.rs is not None and e.member == 'objArr' and not e.qualifier:
                idx = e.selectors[0].index.value if e.selectors and isinstance(e.selectors[0], T.ArraySelector) else '0'
                lb = (self.rs.get('cur_labels') or ['x'])[0]
                return ('wf%s_%s' % (lb, idx), (self.rs['resume_types'].get(lb, {}) or {}).get(int(idx)))
            if e.qualifier:
                base = self.resolve_qual(e.qualifier, loc)
                val = self.member(base, e.member, loc)
            else:
                val = self.simple_name(e.member, loc)
            return self.apply_selectors(val, e.selectors, loc)
        if isinstance(e, T.MethodInvocation):
            return self.call(e, loc)
        if isinstance(e, T.This):
            if self.rs is not None:
                val = ('', 'RSSELF')
                return self.apply_selectors(val, e.selectors, loc)
            val = ('', 'SELF') if self.m.kind != 'Class' else ('Me', 'SELF')
            return self.apply_selectors(val, e.selectors, loc)
        if isinstance(e, T.BinaryOperation):
            return self.binop(e, loc)
        if isinstance(e, T.Cast):
            r = self.ex(e.expression, loc)
            tt = type_str(e.type)
            # (int) su double -> troncamento: in B4A l'assegnazione a Int tronca comunque
            nt = tt if r[1] in (None, 'java.lang.Object') or tt in ('int', 'long', 'double', 'float', 'short', 'byte') else r[1]
            if tt in ('int', 'long', 'short') and r[1] in ('double', 'float'):
                nt = tt
            return self.apply_selectors((r[0], nt, r[2]), getattr(e, 'selectors', None), loc)
        if isinstance(e, T.TernaryExpression):
            c = self.exs(e.condition, loc)
            a = self.ex(e.if_true, loc)
            b = self.ex(e.if_false, loc)
            if a[1] == 'BA' or b[1] == 'BA':
                return self.apply_selectors(('', 'BA'), getattr(e, 'selectors', None), loc)
            return ('IIf(%s, %s, %s)' % (c, a[0], b[0]), a[1] or b[1])
        if isinstance(e, T.ClassCreator):
            return self.creator(e, loc)
        if isinstance(e, T.ArrayCreator):
            return self.array_creator(e, loc)
        if isinstance(e, T.ArrayInitializer):
            return ('Array(' + ', '.join(self.exs(x, loc) for x in e.initializers) + ')', 'java.lang.Object[]')
        if isinstance(e, T.Assignment):
            return (self.assignment(e, loc), None)
        if isinstance(e, T.ReferenceType) or isinstance(e, T.BasicType):
            return (self.c.b4type(type_str(e), self.m) or 'Object', 'TYPE')
        if isinstance(e, T.ClassReference):
            return (type_str(e.type) + '.class', None)
        if isinstance(e, T.LambdaExpression) or isinstance(e, T.MethodReference):
            return ("'### LAMBDA NON CONVERTITA", None)
        if isinstance(e, T.SuperMethodInvocation):
            return ('/*super*/' + e.member, None)
        return ('/*?%s*/' % type(e).__name__, None)

    def simple_name(self, n, loc):
        if n in loc:
            return loc[n]
        if n in ('processBA', 'activityBA', 'ba'):
            return ('', 'BA')
        if n in self.m.fields:
            return self.field_val(self.m, n, ('', 'MOD:' + self.m.name))
        if n in ('mostCurrent',):
            return ('', 'MOD:' + self.m.name)
        if n in ('processBA', 'ba', 'activityBA'):
            return ('', 'BA')
        if n == '__c':
            return ('', 'COMMON')
        if n == 'parent':
            return ('', 'MOD:' + self.m.name)
        return (strip_us(n) if n.startswith('_') else n, None)

    def apply_selectors(self, val, sels, loc):
        if not sels:
            return val
        if len(val) == 3:
            val = (val[0], val[1])
        for s in sels or []:
            if isinstance(s, T.MethodInvocation):
                val = self.method_on(val, s, loc)
            elif isinstance(s, T.MemberReference):
                val = self.member(val, s.member, loc)
            elif isinstance(s, T.ArraySelector):
                idx = self.exs(s.index, loc)
                t = val[1]
                nt = t[:-2] if t and t.endswith('[]') else None
                code = val[0]
                # array multidimensionale: a(i)(j) -> a(i, j)
                if code.endswith(')') and getattr(self, '_last_was_index', False) == code:
                    code = code[:-1] + ', ' + idx + ')'
                else:
                    code = code + '(' + idx + ')'
                self._last_was_index = code
                val = (code, nt)
            else:
                val = (val[0] + '/*sel?*/', None)
        return val

    def args(self, args, loc, drop_ba=True):
        out = []
        for a in args or []:
            r = self.ex(a, loc)
            if drop_ba and r[1] == 'BA':
                continue
            if r[0] == '' and r[1] in ('SELF', 'RSSELF', 'MOD:' + self.m.name):
                r = ('Me', 'SELF', 9)
            elif r[0] == '' and isinstance(r[1], str) and r[1].startswith('MOD:'):
                mm = self.c.byname.get(r[1][4:])
                r = (self.c.modname(mm) if mm else r[1][4:], 'MODOBJ', 9)
            out.append(r)
        return out

    # ----- chiamate -----
    def call(self, e, loc):
        if e.qualifier:
            base = self.resolve_qual(e.qualifier, loc)
        else:
            base = ('', 'MOD:' + self.m.name)
        r = self.method_on(base, e, loc)
        return self.apply_selectors(r, e.selectors, loc)

    def method_on(self, base, e, loc):
        code, t = base[0], base[1]
        name = e.member
        args = e.arguments or []
        # ---- Common (keywords)
        if t == 'COMMON':
            return self.common_call(name, args, loc)
        if t == 'BAS':
            return self.ba_call(name, args, loc)
        if t == 'BA':
            if name in ('setLastException',):
                return ('', 'DROP')
            if name in ('raiseEvent', 'raiseEvent2', 'raiseEventFromDifferentThread', 'raiseEventFromUI'):
                a = self.args(args, loc)
                return ("'### raiseEvent(" + ', '.join(x[0] for x in a) + ')', None)
            if name == 'subExists':
                a = self.args(args, loc)
                return ('SubExists(Me, ' + a[0][0] + ')', 'boolean')
            return ("'### BA." + name, None)
        if isinstance(t, str) and t.startswith('KW:'):
            kw = t[3:]
            a = self.args(args, loc)
            return self.kw_obj_call(kw, name, a)
        # ---- moduli convertiti
        mod = self.mod_of_val(base)
        if mod is not None:
            return self.module_call(mod, base, name, args, loc)
        if isinstance(t, str) and t.startswith('EXT:'):
            a = self.args(args, loc)
            return ('%s.%s(%s)' % (code, self.ext_name(name), ', '.join(x[0] for x in a)), None)
        # ---- tipo statico java
        if isinstance(t, str) and t.startswith('JSTATIC:'):
            return self.jstatic_call(t[8:], name, args, loc)
        if isinstance(t, str) and t.startswith('STATIC:') and t[7:].startswith('java.'):
            return self.jstatic_call(t[7:], name, args, loc)
        if isinstance(t, str) and t.startswith('STATIC:'):
            a = self.args(args, loc)
            mm = re.match(r'^(get|is)([A-Z]\w*)$', name)
            if mm and not a:
                return ('%s.%s' % (code, mm.group(2)), None)
            return ('%s.%s(%s)' % (code, name, ', '.join(x[0] for x in a)), None)
        # ---- oggetti
        return self.obj_call(base, name, args, loc)

    def ext_name(self, n):
        return n[1:] if n.startswith('_') else n

    def module_call(self, mod, base, name, args, loc):
        if name in ('getActivityBA', 'getBA', 'processBA'):
            return ('', 'BA')
        a = self.args(args, loc)
        if name.startswith('_') or self.c.is_obf(name):
            sub = self.c.bname(mod, name, 'sub')
            md = mod.methods.get(name)
            rt = type_str(md.return_type) if md is not None else None
            if name == '_initialize' and mod.kind == 'Class':
                sub = 'Initialize'
            same = (mod is self.m) and base[1] in ('MOD:' + self.m.name, 'SELF') and not base[0]
            if same:
                prefix = ''
            elif base[0]:
                prefix = base[0] + '.'
            else:
                prefix = self.c.modname(mod) + '.'
            argtxt = ', '.join(x[0] for x in a)
            if not a and not same:
                return (prefix + sub, rt)
            return ('%s%s(%s)' % (prefix, sub, argtxt) if (a or same) else prefix + sub, rt)
        # metodi generati (es. getObject, IsInitialized su istanza di classe)
        if name in ('getObject', '_getObject') and not a and mod.kind != 'Class':
            same = (mod is self.m)
            return ('Me' if same else self.c.modname(mod), 'MODOBJ')
        if name == 'IsInitialized':
            return ((base[0] + '.' if base[0] else '') + 'IsInitialized', 'boolean')
        if name in ('getObject',):
            return (base[0], base[1])
        if name == 'innerInitialize' or name == 'innerInitializeHelper':
            return ('', 'DROP')
        if name == '_getObject':
            return (base[0], base[1])
        return ((base[0] + '.' if base[0] else '') + name + ('(' + ', '.join(x[0] for x in a) + ')' if a else ''), None)

    def common_call(self, name, args, loc):
        a = self.args(args, loc)
        A = [x[0] for x in a]
        if name == 'LogImpl':
            return ('Log(%s)' % A[1], None) if len(A) < 3 or A[2] in ('0', '-1') else ('LogColor(%s, %s)' % (A[1], A[2]), None)
        if name in ('Log', 'LogColor'):
            return ('%s(%s)' % (name, ', '.join(A)), None)
        if name == 'Sender':
            return ('Sender', 'java.lang.Object')
        if name == 'LastException':
            return ('LastException', 'Exception')
        if name in ('CallSubNew', 'CallSubNew2', 'CallSubNew3'):
            return ('CallSub%s(%s)' % (name[10:], ', '.join(A)), 'java.lang.Object')
        if name in ('CallSubDebug', 'CallSubDebug2', 'CallSubDebug3'):
            return ('CallSub%s(%s)' % (name[12:], ', '.join(A)), 'java.lang.Object')
        if name.startswith('CallSubDelayed'):
            return ('%s(%s)' % (name, ', '.join(A)), None)
        if name == 'Not':
            r = self.norm(a[0])
            if r[0].startswith('Not(') and r[0].endswith(')') and self.balanced(r[0][4:-1]):
                return (r[0][4:-1], 'boolean', 3)
            if r[2] == 3 and ' = ' in r[0] and r[0].count(' = ') == 1:
                return (r[0].replace(' = ', ' <> '), 'boolean', 3)
            return ('Not(' + r[0] + ')', 'boolean')
        if name == 'getObject':
            return ('', 'COMMON')
        if name in ('ArrayToList',):
            return ('ArrayToList(' + ', '.join(A) + ')', 'anywheresoftware.b4a.objects.collections.List')
        if name == 'WaitFor':
            snd = [x for x in a[1:] if x[1] not in ('RSSELF', 'SELF')]
            return (A[0].strip('"') + '|' + (snd[0][0] if snd else ''), 'WAITFOR')
        if name == 'Sleep':
            return ('Sleep(' + A[-1] + ')', 'SLEEP')
        if name == 'ReturnFromResumableSub':
            v = [x for x in a if x[1] not in ('RSSELF', 'SELF')]
            return ('Return ' + (v[-1][0] if v else 'Null'), 'RSRET')
        if name == 'IsNumber':
            return ('IsNumber(' + ', '.join(A) + ')', 'boolean')
        if name == 'NumberFormat' or name == 'NumberFormat2' or name in ('SmartStringFormatter',):
            return ('%s(%s)' % (name, ', '.join(A)), 'java.lang.String')
        if name in ('Chr', 'DateTime', 'SubExists'):
            return ('%s(%s)' % (name, ', '.join(A)), 'java.lang.String' if name == 'Chr' else None)
        if name == 'Me':
            return ('Me', 'SELF')
        if name == 'StartActivity' or name == 'StartService' or name == 'StopService':
            return ('%s(%s)' % (name, ', '.join(A)), None)
        rt = {'Round2': 'double', 'Round': 'long', 'Abs': 'double', 'Max': 'double', 'Min': 'double',
              'Floor': 'double', 'Ceil': 'double', 'Rnd': 'int', 'Sqrt': 'double', 'Power': 'double',
              'Asc': 'int', 'IsNumber': 'boolean', 'Msgbox2': 'int', 'InputList': 'int', 'Msgbox2Async': 'java.lang.Object',
              'PerXToCurrent': 'int', 'PerYToCurrent': 'int', 'DipToCurrent': 'int', 'SubExists': 'boolean',
              'IsBackgroundTaskRunning': 'boolean', 'Sender': 'java.lang.Object'}.get(name)
        if A:
            return ('%s(%s)' % (name, ', '.join(A)), rt)
        return (name, rt)

    def ba_call(self, name, args, loc):
        a = self.args(args, loc)
        A = [x[0] for x in a]
        ident = {'NumberToString': 'java.lang.String', 'ObjectToString': 'java.lang.String',
                 'ObjectToCharSequence': 'java.lang.String', 'ObjectToNumber': 'double', 'ObjectToBoolean': 'boolean',
                 'ObjectToLongNumber': 'long', 'ObjectToChar': 'char', 'CharToString': 'java.lang.String',
                 'ObjectToBCPath': None, 'ConvertToWrapper': None, 'returnString': 'java.lang.String'}
        if name in ident:
            if not a:
                return ('', None)
            r = a[-1] if name != 'ConvertToWrapper' else a[1]
            t = ident[name] if r[1] in (None, 'java.lang.Object') or name in ('NumberToString', 'ObjectToString', 'CharToString') else r[1]
            if name in ('NumberToString', 'ObjectToString', 'CharToString', 'ObjectToCharSequence'):
                t = 'java.lang.String'
            return (r[0], t, r[2])
        if name == 'switchObjectToInt':
            return ('/*switch*/' + ', '.join(A), 'SWITCH')
        if name == 'getEnumFromString':
            return (A[-1], 'java.lang.String')
        if name == 'TypeToString':
            return ('', None)
        if name == 'IsDevelopment' or name == 'debugMode':
            return ('False', 'boolean')
        if name == 'ReturnString':
            return (A[0], 'java.lang.String')
        if name == 'gm':
            return ('%s.GetDefault(%s, %s)' % tuple(A), None)
        return ("BA_%s(%s)" % (name, ', '.join(A)), None)

    def kw_obj_call(self, kw, name, a):
        A = [x[0] for x in a]
        if kw == 'Colors' and name == 'ARGB':
            return ('Colors.ARGB(%s)' % ', '.join(A), 'int')
        if kw == 'Colors' and name == 'RGB':
            return ('Colors.RGB(%s)' % ', '.join(A), 'int')
        rt = None
        nm = name
        m = re.match(r'^(get|set)([A-Z].*)$', name)
        if m and m.group(1) == 'get' and not a:
            return ('%s.%s' % (kw, m.group(2)), None)
        if m and m.group(1) == 'set' and len(a) == 1:
            return ('%s.%s = %s' % (kw, m.group(2), A[0]), 'ASSIGN')
        if kw == 'DateTime' and name in ('getNow',):
            return ('DateTime.Now', 'long')
        if kw == 'File' and name in ('Exists', 'IsDirectory'):
            rt = 'boolean'
        if kw == 'File' and name in ('ReadString', 'Combine'):
            rt = 'java.lang.String'
        if kw == 'DateTime' and name in ('Date', 'Time'):
            rt = 'java.lang.String'
        if kw == 'Bit':
            rt = 'int'
        if A:
            return ('%s.%s(%s)' % (kw, nm, ', '.join(A)), rt)
        return ('%s.%s' % (kw, nm), rt)

    KW_CLASSES = {'anywheresoftware.b4a.keywords.constants.Colors': 'Colors', 'anywheresoftware.b4a.keywords.Bit': 'Bit',
                  'anywheresoftware.b4a.keywords.Regex': 'Regex', 'anywheresoftware.b4a.keywords.DateTime': 'DateTime',
                  'anywheresoftware.b4a.keywords.B4AApplication': 'Application',
                  'anywheresoftware.b4a.keywords.constants.TypefaceWrapper': 'Typeface',
                  'anywheresoftware.b4a.keywords.constants.KeyCodes': 'KeyCodes',
                  'anywheresoftware.b4a.keywords.constants.Gravity': 'Gravity',
                  'anywheresoftware.b4a.keywords.constants.DialogResponse': 'DialogResponse',
                  'anywheresoftware.b4a.objects.streams.File': 'File',
                  'anywheresoftware.b4a.keywords.LayoutBuilder': 'LayoutBuilder'}

    def jstatic_call(self, cls, name, args, loc):
        a = self.args(args, loc)
        A = [x[0] for x in a]
        c = cls.split('.')[-1]
        if cls in self.KW_CLASSES:
            return self.kw_obj_call(self.KW_CLASSES[cls], name, a)
        if cls == 'java.util.Arrays' and name == 'fill':
            return ('', 'DROP')
        if cls == 'com.maximus.id.id':
            self.uses_idlib = True
            return ('idLib.%s(%s)' % (name, ', '.join(A)), 'int')
        if c in ('Double', 'Integer', 'Long', 'Float', 'Boolean', 'String', 'Short', 'Byte', 'Character') and name in (
                'valueOf', 'parseDouble', 'parseInt', 'parseLong', 'parseFloat', 'parseBoolean', 'toString'):
            t = {'Double': 'double', 'Integer': 'int', 'Long': 'long', 'Float': 'float', 'Boolean': 'boolean',
                 'String': 'java.lang.String', 'Short': 'short', 'Byte': 'byte', 'Character': 'char'}[c]
            if name == 'toString':
                t = 'java.lang.String'
            if name == 'valueOf' and c == 'String':
                t = 'java.lang.String'
            return (a[0][0], t, a[0][2])
        if c == 'Math':
            m = {'round': 'Round', 'abs': 'Abs', 'max': 'Max', 'min': 'Min', 'floor': 'Floor', 'ceil': 'Ceil',
                 'sqrt': 'Sqrt', 'pow': 'Power', 'sin': 'Sin', 'cos': 'Cos'}.get(name, name)
            return ('%s(%s)' % (m, ', '.join(A)), 'double')
        if c == 'AbsObjectWrapper' and name == 'ConvertToWrapper':
            r = a[1]
            return (r[0], a[0][1], r[2])
        if c == 'Common':
            return self.common_call(name, args, loc)
        if c == 'BA':
            return self.ba_call(name, args, loc)
        if c == 'System' and name == 'currentTimeMillis':
            return ('DateTime.Now', 'long')
        if c == 'String' and name == 'format':
            return ("'### String.format(" + ', '.join(A) + ')', 'java.lang.String')
        return ("'### %s.%s(%s)" % (cls, name, ', '.join(A)), None)

    def obj_call(self, base, name, args, loc):
        code, t = base[0], base[1]
        a = self.args(args, loc)
        A = [x[0] for x in a]
        # StringBuilder java (concatenazioni generate da javac/jadx)
        if t in ('java.lang.StringBuilder', 'SB'):
            if name == 'append':
                if code in ('', '""'):
                    return (A[0], 'SB', a[0][2] if a[0][1] in ('java.lang.String', 'SB') else 9)
                rhs = a[0]
                rtxt = rhs[0] if rhs[2] >= 5 or rhs[1] in ('java.lang.String', 'SB') and rhs[2] >= 4 else '(' + rhs[0] + ')'
                return (code + ' & ' + rtxt, 'SB', 4)
            if name == 'toString':
                return (code, 'java.lang.String', base[2] if len(base) > 2 else 4)
            if name == 'length':
                return ('(' + code + ').Length', 'int')
        if name == 'getObject' and not a:
            return (code, t)
        if name in ('getObjectOrNull',) and not a:
            return (code, t)
        if name == 'setObject' and len(a) == 1:
            return ('%s = %s' % (code, A[0]), 'ASSIGN')
        if name == 'equals' and len(a) == 1:
            return ('%s = %s' % (self.par(self.norm(base), 4), self.par(a[0], 4)), 'boolean', 3)
        if name == 'IsInitialized' and not a:
            return (code + '.IsInitialized', 'boolean')
        # metodi di classi convertite (istanze) gestiti in module_call
        # String java
        if t in ('java.lang.String', 'String', 'char', 'java.lang.CharSequence') or name in ('substring', 'toUpperCase', 'toLowerCase', 'trim', 'startsWith', 'endsWith', 'equalsIgnoreCase', 'charAt'):
            sm = JAVA_STRING_METHODS.get(name)
            if sm:
                kind, b = sm
                pc = self.par(self.norm(base), 9)
                if kind == 'prop':
                    rt = 'int' if b == 'Length' else 'java.lang.String'
                    return (pc + '.' + b, rt)
                if kind == 'sub':
                    if len(A) == 1:
                        return (pc + '.SubString(' + A[0] + ')', 'java.lang.String')
                    return (pc + '.SubString2(' + ', '.join(A) + ')', 'java.lang.String')
                if kind == 'id':
                    return (code, 'java.lang.String', base[2] if len(base) > 2 else 9)
                rt = {'Replace': 'java.lang.String', 'Contains': 'boolean', 'IndexOf': 'int', 'LastIndexOf': 'int',
                      'StartsWith': 'boolean', 'EndsWith': 'boolean', 'CharAt': 'char', 'CompareTo': 'int',
                      'EqualsIgnoreCase': 'boolean', 'GetBytes': 'byte[]'}.get(b)
                return ('%s.%s(%s)' % (pc, b, ', '.join(A)), rt)
            if name == 'split':
                return ('Regex.Split(%s, %s)' % (A[0], code), 'java.lang.String[]')
            if name == 'isEmpty':
                return ('(%s.Length = 0)' % code, 'boolean')
            if name == 'hashCode':
                return ("'### hashCode", 'int')
        if name in ('doubleValue', 'intValue', 'longValue', 'floatValue', 'booleanValue', 'shortValue', 'byteValue') and not a:
            return (code, {'doubleValue': 'double', 'intValue': 'int', 'longValue': 'long', 'floatValue': 'float',
                           'booleanValue': 'boolean', 'shortValue': 'short', 'byteValue': 'byte'}[name], base[2] if len(base) > 2 else 9)
        if name == 'toString' and not a:
            return (code, 'java.lang.String')
        # istanza di classe convertita (es. ccefdllVar._nf_apri)
        tm = self.c.modules.get(t) if t else None
        if tm is not None:
            return self.module_call(tm, base, name, args, loc)
        # proprietà getX / setX
        m = re.match(r'^(get|set|is)([A-Z].*)$', name)
        if m:
            kind, prop = m.group(1), m.group(2)
            if kind in ('get', 'is') and not a:
                return ('%s.%s' % (code, prop), self.prop_type(t, prop))
            if kind == 'set' and len(a) == 1:
                return ('%s.%s = %s' % (code, prop, A[0]), 'ASSIGN')
        rt = self.method_type(t, name)
        if code == '':
            return ('%s(%s)' % (name, ', '.join(A)) if a else name, rt)
        if a:
            return ('%s.%s(%s)' % (code, name, ', '.join(A)), rt)
        return ('%s.%s' % (code, name), rt)

    def prop_type(self, t, prop):
        if prop in ('Text', 'Hint', 'Tag2', 'Input', 'Title', 'Name', 'Description', 'Address'):
            return 'java.lang.String' if prop != 'Tag' else 'java.lang.Object'
        if prop in ('Size', 'RowCount', 'Position', 'Left', 'Top', 'Width', 'Height', 'Color', 'TextColor', 'Length',
                    'Gravity', 'Interval', 'SelectedIndex', 'ColumnCount', 'Value', 'Progress', 'Visibility'):
            return 'int'
        if prop in ('Enabled', 'Visible', 'Checked', 'Initialized', 'Connected'):
            return 'boolean'
        if prop == 'Tag':
            return 'java.lang.Object'
        return None

    def method_type(self, t, name):
        if name in ('GetString', 'GetString2', 'GetColumnName', 'SelectedItem', 'ExecQuerySingleResult', 'ExecQuerySingleResult2',
                    'ReadLine', 'ReadAll', 'GetText', 'getSelectedItem', 'BytesToString'):
            return 'java.lang.String'
        if name in ('GetInt', 'GetInt2', 'GetLong', 'GetLong2', 'IndexOf', 'Size'):
            return 'int' if 'Long' not in name else 'long'
        if name in ('GetDouble', 'GetDouble2'):
            return 'double'
        if name in ('ContainsKey', 'IsInitialized'):
            return 'boolean'
        if name in ('ExecQuery', 'ExecQuery2'):
            return 'anywheresoftware.b4a.sql.SQL.CursorWrapper'
        return None

    def norm(self, r):
        if len(r) == 2:
            return (r[0], r[1], 9)
        return r

    def creator(self, e, loc):
        tt = type_str(e.type)
        a = self.args(e.arguments, loc)
        if tt in ('java.lang.StringBuilder', 'StringBuilder'):
            if a:
                return (a[0][0], 'SB', a[0][2])
            r = ('', 'SB')
            return self.apply_selectors(r, e.selectors, loc)
        if tt.startswith('cassandraRisto.ital.ResumableSub_') or 'ResumableSub_' in tt:
            return ('RESUMABLE', 'RS')
        b4 = self.c.b4type(tt, self.m)
        if tt in ('java.lang.Object',):
            return ('Null', 'java.lang.Object')
        r = ('NEW:' + (b4 or tt), tt)
        if e.selectors:
            # new X().metodo() -> raro: crea variabile temporanea
            r = ('', tt)
            r = self.apply_selectors(r, e.selectors, loc)
        return r

    def array_creator(self, e, loc):
        tt = type_str(e.type)
        b4 = self.c.b4type(tt, self.m)
        if e.initializer is not None:
            items = [self.exs(x, loc) for x in e.initializer.initializers]
            if b4 in ('Object', None):
                return ('Array(' + ', '.join(items) + ')', tt + '[]')
            return ('Array As %s(%s)' % (b4, ', '.join(items)), tt + '[]')
        dims = [self.exs(d, loc) for d in e.dimensions if d is not None]
        return ('NEWARR:%s:%s' % (b4, ', '.join(dims)), tt + '[]' * len(e.dimensions))

    def binop(self, e, loc):
        op = e.operator
        L = self.norm(self.ex(e.operandl, loc))
        R = self.norm(self.ex(e.operandr, loc))
        if op == '+' and (self.is_str(L[1]) or self.is_str(R[1])):
            return (self.par(L, 4) + ' & ' + self.par(R, 5 if not self.is_str(R[1]) else 5), 'java.lang.String', 4)
        if op in ('&&', '||'):
            b = 'And' if op == '&&' else 'Or'
            p = 2 if op == '&&' else 1
            # parentesi esplicite quando si mescolano And e Or
            lt = '(' + L[0] + ')' if (L[2] < 3 and L[2] != p) else L[0]
            rt = '(' + R[0] + ')' if (R[2] < 3) else R[0]
            if R[2] == p and op == '&&':
                rt = R[0]
            return (lt + ' ' + b + ' ' + rt, 'boolean', p)
        if op in ('==', '!=', '<', '>', '<=', '>='):
            o = {'==': '=', '!=': '<>'}.get(op, op)
            # confronto con Null per oggetti
            if R[0] == 'Null' and op in ('==', '!='):
                return (('%s = Null' if op == '==' else 'Not(%s = Null)') % self.par(L, 4), 'boolean', 3)
            return (self.par(L, 4) + ' ' + o + ' ' + self.par(R, 4), 'boolean', 3)
        if op in ('+', '-', '*', '/', '%'):
            o = 'Mod' if op == '%' else op
            p = 5 if op in '+-' else 6
            t = self.num_type(L[1], R[1])
            res = self.par(L, p) + ' ' + o + ' ' + self.par(R, p + 1)
            # divisione intera java: (int)/(int) -> in B4A la divisione è sempre double
            if op == '/' and t in ('int', 'long', 'short', 'byte'):
                return ('Floor(' + res + ')', t, 9) if False else (res, 'double', p)
            return (res, t, p)
        if op in ('&', '|', '^'):
            if L[1] == 'boolean' or R[1] == 'boolean':
                b = {'&': 'And', '|': 'Or', '^': '<>'}[op]
                return (self.par(L, 3) + ' ' + b + ' ' + self.par(R, 3), 'boolean', 2)
            f = {'&': 'Bit.And', '|': 'Bit.Or', '^': 'Bit.Xor'}[op]
            return ('%s(%s, %s)' % (f, L[0], R[0]), 'int')
        if op in ('<<', '>>', '>>>'):
            f = {'<<': 'Bit.ShiftLeft', '>>': 'Bit.ShiftRight', '>>>': 'Bit.UnsignedShiftRight'}[op]
            return ('%s(%s, %s)' % (f, L[0], R[0]), 'int')
        if op == 'instanceof':
            return (L[0] + ' Is ' + R[0], 'boolean', 3)
        return ('%s %s %s' % (L[0], op, R[0]), None)

    def num_type(self, a, b):
        order = ['byte', 'short', 'char', 'int', 'long', 'float', 'double']
        ia = order.index(a) if a in order else 6
        ib = order.index(b) if b in order else 6
        return order[max(ia, ib)]

    # ===== statement =====
    def assignment(self, e, loc):
        L = self.ex(e.expressionl, loc)
        R = self.norm(self.ex(e.value, loc))
        op = e.type
        if R[0].startswith('NEW:'):
            return "'" + L[0] + ' = ' + R[0][4:]  # equivalente a Dim
        if R[0].startswith('NEWARR:'):
            _, b4, dims = R[0].split(':', 2)
            return 'Dim %s(%s) As %s' % (L[0], dims, b4)
        if op == '=':
            if R[2] <= 3:
                return '%s = (%s)' % (L[0], R[0])
            return '%s = %s' % (L[0], R[0])
        o = op[:-1]
        if o == '+' and (self.is_str(L[1]) or self.is_str(R[1])):
            return '%s = %s & %s' % (L[0], L[0], self.par(R, 5))
        if o in ('+', '-', '*', '/'):
            return '%s = %s %s %s' % (L[0], L[0], o, self.par(R, 6))
        if o == '%':
            return '%s = %s Mod %s' % (L[0], L[0], self.par(R, 7))
        f = {'&': 'Bit.And', '|': 'Bit.Or', '^': 'Bit.Xor', '<<': 'Bit.ShiftLeft', '>>': 'Bit.ShiftRight', '>>>': 'Bit.UnsignedShiftRight'}.get(o)
        if f:
            if L[1] == 'boolean':
                return '%s = %s %s %s' % (L[0], L[0], {'&': 'And', '|': 'Or', '^': '<>'}[o], R[0])
            return '%s = %s(%s, %s)' % (L[0], f, L[0], R[0])
        return '%s %s %s' % (L[0], op, R[0])

    JADX_TEMP = re.compile(r'^(\w+Var\d*|append\d*|sb\d*|ObjectTo\w+\d*|ba\d*)$')

    def count_uses(self, md):
        uses = defaultdict(int)
        assigned = set()
        for _, n in md.filter(T.MemberReference):
            if not n.qualifier:
                uses[n.member] += 1
        for _, n in md.filter(T.MethodInvocation):
            if n.qualifier and '.' not in n.qualifier:
                uses[n.qualifier] += 1
        for _, n in md.filter(T.Assignment):
            l = n.expressionl
            if isinstance(l, T.MemberReference) and not l.qualifier:
                assigned.add(l.member)
                uses[l.member] -= 1
        self.uses, self.assigned = uses, assigned

    def pure_ref(self, e):
        # riferimento semplice (campo/variabile, catena di campi) senza chiamate
        if isinstance(e, T.MemberReference):
            return all(isinstance(x, T.MemberReference) for x in (e.selectors or [])) and not (e.prefix_operators or e.postfix_operators)
        if isinstance(e, T.Literal):
            return not e.selectors and not e.prefix_operators
        return False

    def inlinable(self, name, init, ts):
        if not hasattr(self, 'uses') or name in self.assigned:
            return False
        n = self.uses.get(name, 0)
        if ts == 'java.lang.StringBuilder':
            return n <= 1
        if self.JADX_TEMP.match(name) and self.pure_ref(init):
            return True
        if self.pure_ref(init) and n == 1 and not isinstance(init, T.Literal):
            return True
        return False

    def is_module_type(self, ts):
        m = self.c.modules.get(ts)
        return m is not None and m.kind != 'Class'

    def localname(self, n, loc, key=None):
        key = key or n
        nm = n.lstrip('_') or 'v'
        if self.c.is_obf(nm) or self.c.is_obf(n):
            nm = 'vTmp'
        if nm[:1].isupper():
            nm = 'v' + nm
        low = nm.lower()
        if low in B4A_RESERVED or low in self.globals_low:
            nm = nm + '_'
        while nm.lower() in self.loc_names_low and self.loc_names_low[nm.lower()] != key:
            nm += '_'
        self.loc_names_low[nm.lower()] = key
        return nm

    def stmt(self, s, loc):
        if s is None:
            return
        if isinstance(s, T.LocalVariableDeclaration) or isinstance(s, T.VariableDeclaration):
            ts = type_str(s.type)
            for d in s.declarators:
                init = d.initializer
                # riferimenti a moduli / keyword / BA: niente Dim, solo alias
                if self.is_module_type(ts):
                    loc[d.name] = ('', 'MOD:' + self.c.modules[ts].name)
                    continue
                if ts in EXTERNAL_B4X and init is not None:
                    loc[d.name] = (EXTERNAL_B4X[ts], 'EXT:' + ts)
                    continue
                if ts in ('anywheresoftware.b4a.BA', 'BA'):
                    loc[d.name] = ('', 'BA')
                    continue
                if ts in ('anywheresoftware.b4a.keywords.Common', 'keywords.Common'):
                    loc[d.name] = ('', 'COMMON')
                    continue
                if init is not None:
                    r = self.norm(self.ex(init, loc))
                    if r[1] and isinstance(r[1], str) and r[1].startswith('KW:'):
                        loc[d.name] = r[:2]
                        continue
                    if r[1] == 'MOD:' + self.m.name and ts.startswith('cassandraRisto'):
                        loc[d.name] = r[:2]
                        continue
                    if r[1] == 'RS':
                        loc[d.name] = ('', 'RS')
                        continue
                if init is not None and self.inlinable(d.name, init, ts):
                    r = self.norm(self.ex(init, loc))
                    if not r[0].startswith('NEW') and r[1] not in ('WAITFOR', 'SLEEP', 'RSRET', 'DROP'):
                        loc[d.name] = (r[0], 'SB' if ts == 'java.lang.StringBuilder' else (r[1] or ts), r[2])
                        continue
                r = self.norm(self.ex(init, loc)) if init is not None else None
                nm = self.localname(d.name, loc)
                b4 = self.c.b4type(ts, self.m)
                vtype = 'SB' if ts in ('java.lang.StringBuilder',) else ts
                loc[d.name] = (nm, vtype)
                if init is None:
                    self.emit('Dim %s As %s' % (nm, b4 or 'Object'))
                    continue
                if r[0].startswith('NEW:'):
                    self.emit('Dim %s As %s' % (nm, b4))
                elif r[0].startswith('NEWARR:'):
                    _, eb, dims = r[0].split(':', 2)
                    self.emit('Dim %s(%s) As %s' % (nm, dims, eb))
                elif b4 and b4.endswith('()') and r[0].startswith('Array'):
                    self.emit('Dim %s() As %s = %s' % (nm, b4[:-2], r[0]))
                elif b4 and b4.endswith('()'):
                    self.emit('Dim %s() As %s = %s' % (nm, b4[:-2], r[0]))
                elif r[0] == '':
                    self.emit('Dim %s As %s' % (nm, b4 or 'Object'))
                else:
                    self.emit('Dim %s As %s = %s' % (nm, b4 or 'Object', r[0]))
            return
        if isinstance(s, T.StatementExpression):
            e = s.expression
            if isinstance(e, T.ClassCreator) and not e.selectors:
                return  # "new LabelWrapper();" generato da Dim
            if isinstance(e, T.Assignment):
                txt = self.assignment(e, loc)
                if self.rs is not None and txt.startswith('rsState = ') and self.rs.get('pending_wf'):
                    ev, snd = self.rs.pop('pending_wf')
                    target = txt[len('rsState = '):].strip()
                    types = self.rs['resume_types'].get(target, {})
                    ps = []
                    for i in range(max(types) + 1 if types else 0):
                        bt = self.c.b4type(types.get(i), self.m) if types.get(i) else 'Object'
                        ps.append('wf%s_%d As %s' % (target, i, bt or 'Object'))
                    evn = '_'.join(x[:1].upper() + x[1:] for x in ev.split('_'))
                    self.emit('Wait For %s%s%s' % ('(' + snd + ') ' if snd else '', evn, ' (' + ', '.join(ps) + ')' if ps else ''))
                    self.rs['waited'] = True
                if txt.startswith("'") and ' = NEW:' not in txt:
                    self.emit(txt)
                elif txt.startswith("'"):
                    # x = new Wrapper() -> in B4A equivale a 'Dim x As ...' (reinizializzazione)
                    nm, tp = txt[1:].split(' = NEW:')
                    if '.' in nm:
                        self.emit("'" + nm + ' = (nuova istanza ' + tp + ')')
                    else:
                        self.emit('Dim %s As %s' % (nm, tp))
                else:
                    self.emit(txt)
                return
            pre = getattr(e, 'prefix_operators', None) or []
            post = getattr(e, 'postfix_operators', None) or []
            if pre or post:
                ops = pre + post
                e.prefix_operators = []
                e.postfix_operators = []
                try:
                    v = self.exs(e, loc)
                finally:
                    e.prefix_operators, e.postfix_operators = pre, post
                if '++' in ops:
                    self.emit('%s = %s + 1' % (v, v))
                elif '--' in ops:
                    self.emit('%s = %s - 1' % (v, v))
                return
            r = self.ex(e, loc)
            if self.rs is not None and r[1] == 'WAITFOR':
                self.rs['pending_wf'] = tuple(r[0].split('|', 1))
                return
            if self.rs is not None and r[1] == 'SLEEP':
                self.emit(r[0])
                self.rs['waited'] = True
                return
            if self.rs is not None and r[1] == 'RSRET':
                self.emit(r[0])
                self.rs['returned'] = True
                return
            r = self.norm(r)
            if r[1] == 'DROP' or r[0] == '':
                return
            if r[1] == 'SB' and isinstance(e, T.MethodInvocation):
                # sb.append(x); come istruzione: aggiorna la variabile
                q = e.qualifier
                if q and q in loc:
                    self.emit('%s = %s' % (loc[q][0], r[0]))
                    return
            self.emit(r[0])
            return
        if isinstance(s, T.IfStatement):
            self.if_stmt(s, loc, first=True)
            return
        if isinstance(s, T.BlockStatement):
            for x in s.statements or []:
                self.stmt(x, loc)
            return
        if isinstance(s, T.ForStatement):
            self.for_stmt(s, loc)
            return
        if isinstance(s, T.WhileStatement):
            c = self.exs(s.condition, loc)
            self.emit('Do While ' + c)
            self.block(s.body, loc)
            self.emit('Loop')
            return
        if isinstance(s, T.DoStatement):
            c = self.exs(s.condition, loc)
            self.emit('Do While True')
            self.block(s.body, loc)
            self.ind += 1
            self.emit('If Not(%s) Then Exit' % c)
            self.ind -= 1
            self.emit('Loop')
            return
        if isinstance(s, T.SwitchStatement):
            self.switch_stmt(s, loc)
            return
        if isinstance(s, T.TryStatement):
            self.emit('Try')
            self.block(s.block, loc)
            for cc in s.catches or []:
                self.emit('Catch')
                self.ind += 1
                self.emit("Log(LastException)") if not cc.block else None
                self.ind -= 1
                self.block(cc.block, loc)
            if s.finally_block:
                self.emit("'### Finally (non supportato in B4A):")
                self.block(s.finally_block, loc)
            self.emit('End Try')
            return
        if isinstance(s, T.ReturnStatement):
            if self.rs is not None and s.expression is None:
                if self.rs.pop('returned', False):
                    return
                if self.rs.pop('waited', False):
                    self.emit('Continue')
                    return
                self.emit('Return' + (' Null' if not self.no_return_type else ''))
                return
            if s.expression is None:
                self.emit('Return')
                return
            r = self.norm(self.ex(s.expression, loc))
            if self.no_return_type and r[0] in ('""', ''):
                self.emit('Return')
            else:
                self.emit('Return ' + r[0])
            return
        if isinstance(s, T.BreakStatement):
            if self.in_switch and self.in_switch[-1] == 'switch':
                return
            if self.in_switch and self.in_switch[-1] == 'rs':
                self.emit('Continue')
                return
            self.emit('Exit')
            return
        if isinstance(s, T.ContinueStatement):
            self.emit('Continue')
            return
        if isinstance(s, T.ThrowStatement):
            self.emit("'### throw " + self.exs(s.expression, loc))
            return
        if isinstance(s, T.Statement) and type(s) is T.Statement:
            return  # istruzione vuota
        if isinstance(s, T.SynchronizedStatement):
            self.block(s.block, loc)
            return
        if isinstance(s, T.AssertStatement):
            return
        if isinstance(s, T.LocalVariableDeclaration):
            return
        self.emit("'### istruzione non convertita: " + type(s).__name__)

    def block(self, b, loc):
        self.ind += 1
        if isinstance(b, list):
            for x in b:
                self.stmt(x, loc)
        elif isinstance(b, T.BlockStatement):
            for x in b.statements or []:
                self.stmt(x, loc)
        else:
            self.stmt(b, loc)
        self.ind -= 1

    def if_stmt(self, s, loc, first):
        c = self.exs(s.condition, loc)
        self.emit(('If ' if first else 'Else If ') + c + ' Then')
        self.block(s.then_statement, loc)
        el = s.else_statement
        if el is not None:
            if isinstance(el, T.IfStatement):
                self.if_stmt(el, loc, first=False)
                return
            self.emit('Else')
            self.block(el, loc)
        self.emit('End If')

    def for_stmt(self, s, loc):
        ctl = s.control
        if isinstance(ctl, T.EnhancedForControl):
            v = ctl.var
            ts = type_str(v.type)
            nm = self.localname(v.declarators[0].name, loc)
            loc[v.declarators[0].name] = (nm, ts)
            it = self.exs(ctl.iterable, loc)
            self.emit('For Each %s As %s In %s' % (nm, self.c.b4type(ts, self.m) or 'Object', it))
            self.block(s.body, loc)
            self.emit('Next')
            return
        init = ctl.init
        var = None
        start = None
        if isinstance(init, T.VariableDeclaration):
            d = init.declarators[0]
            ts = type_str(init.type)
            nm = self.localname(d.name, loc)
            loc[d.name] = (nm, ts)
            var, start = nm, self.exs(d.initializer, loc)
            self.emit('Dim %s As %s' % (nm, self.c.b4type(ts, self.m)))
        elif isinstance(init, list) and len(init) == 1 and isinstance(init[0], T.Assignment):
            var = self.exs(init[0].expressionl, loc)
            start = self.exs(init[0].value, loc)
        elif isinstance(init, T.Assignment):
            var = self.exs(init.expressionl, loc)
            start = self.exs(init.value, loc)
        cond = ctl.condition
        upd = ctl.update
        step = None
        if upd and len(upd) == 1:
            u = upd[0]
            ops = (getattr(u, 'postfix_operators', None) or []) + (getattr(u, 'prefix_operators', None) or [])
            if '++' in ops:
                step = '1'
            elif '--' in ops:
                step = '-1'
            elif isinstance(u, T.Assignment) and u.type in ('+=', '-='):
                sv = self.exs(u.value, loc)
                step = sv if u.type == '+=' else '-' + sv
            elif isinstance(u, T.Assignment) and u.type == '=':
                sv = self.exs(u.value, loc)
                m = re.match(r'^%s \+ (.+)$' % re.escape(var or '@@'), sv)
                if m:
                    step = m.group(1)
        if var is not None and step is not None and isinstance(cond, T.BinaryOperation) and cond.operator in ('<=', '<', '>=', '>'):
            lim = self.norm(self.ex(cond.operandr, loc))
            limtxt = lim[0]
            if cond.operator == '<':
                limtxt = self.minus1(lim)
            elif cond.operator == '>':
                limtxt = self.plus1(lim)
            self.emit('For %s = %s To %s%s' % (var, start, limtxt, '' if step == '1' else ' Step ' + step))
            self.in_switch.append('loop')
            self.block(s.body, loc)
            self.in_switch.pop()
            self.emit('Next')
            return
        # forma generica
        if init is not None and var is not None:
            self.emit('%s = %s' % (var, start))
        c = self.exs(cond, loc) if cond is not None else 'True'
        self.emit('Do While ' + c)
        self.in_switch.append('loop')
        self.block(s.body, loc)
        self.ind += 1
        for u in upd or []:
            self.stmt(T.StatementExpression(expression=u), loc)
        self.ind -= 1
        self.in_switch.pop()
        self.emit('Loop')

    def minus1(self, lim):
        m = re.match(r'^(.*) \+ 1$', lim[0])
        if m:
            return m.group(1)
        if re.match(r'^\d+$', lim[0]):
            return str(int(lim[0]) - 1)
        return self.par(lim, 5) + ' - 1'

    def plus1(self, lim):
        m = re.match(r'^(.*) - 1$', lim[0])
        if m:
            return m.group(1)
        if re.match(r'^-?\d+$', lim[0]):
            return str(int(lim[0]) + 1)
        return self.par(lim, 5) + ' + 1'

    def switch_stmt(self, s, loc):
        e = s.expression
        values = None
        subj = None
        if isinstance(e, T.MethodInvocation) and e.member == 'switchObjectToInt':
            a = [self.exs(x, loc) for x in e.arguments]
            subj, values = a[0], a[1:]
        else:
            subj = self.exs(e, loc)
        self.emit('Select ' + subj)
        self.in_switch.append('switch')
        for case in s.cases:
            labels = []
            is_default = False
            for c in case.case:
                if c is None or c == 'default':
                    is_default = True
                    continue
                v = self.exs(c, loc)
                if values is not None and re.match(r'^-?\d+$', v):
                    i = int(v)
                    labels.append(values[i] if 0 <= i < len(values) else v)
                else:
                    labels.append(v)
            if not case.case:
                is_default = True
            self.ind += 1
            if is_default and not labels:
                self.emit('Case Else')
            else:
                self.emit('Case ' + ', '.join(labels))
            self.block(case.statements, loc)
            self.ind -= 1
        self.in_switch.pop()
        self.emit('End Select')

    # ===== sub =====
    def sub(self, md, display):
        self.loc_names_low = {}
        self.in_switch = []
        rt = type_str(md.return_type)
        params = list(md.parameters or [])
        if params and type_str(params[0].type) in ('anywheresoftware.b4a.BA', 'BA'):
            params = params[1:]
        loc = {}
        ptxt = []
        for p in params:
            ts = type_str(p.type)
            nm = self.localname(p.name, loc)
            loc[p.name] = (nm, ts)
            ptxt.append('%s As %s' % (nm, self.c.b4type(ts, self.m) or 'Object'))
        # tipo di ritorno
        self.count_uses(md)
        rets = [x for _, x in md.filter(T.ReturnStatement)]
        no_ret = rt in ('void',) or (rt == 'java.lang.String' and all(
            (r.expression is None) or (isinstance(r.expression, T.Literal) and r.expression.value == '""') for r in rets))
        self.no_return_type = no_ret
        b4rt = None if no_ret else self.c.b4type(rt, self.m)
        if rt == 'anywheresoftware.b4a.keywords.Common.ResumableSubWrapper':
            b4rt = 'ResumableSub'
        head = 'Sub %s%s%s' % (display, '(' + ', '.join(ptxt) + ')' if ptxt else '', ' As ' + b4rt if b4rt else '')
        if md.name in self.m.bad_methods:
            self.emit("'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.")
            self.emit("'### Confrontare con il sorgente decompilato: java/%s.java, metodo %s (riga %s)." % (
                self.m.fqn.replace('.', '/'), 'm' + md.name.lstrip('_v')[-1:] + '…' if self.c.is_obf(md.name) else md.name,
                md.position.line if md.position else '?'))
            self.warn.append(display)
        self.emit(head)
        body = md.body or []
        self.ind += 1
        start_len = len(self.out)
        try:
            for st in body:
                # rimuove 'innerInitialize(ba)' e simili
                self.stmt(st, loc)
        except Exception as ex:
            self.emit("'### ERRORE di conversione: %s" % ex)
            self.warn.append(display + ' (errore)')
        # rimuove Return finale superfluo
        if self.out and self.out[-1].strip() == 'Return' and len(self.out) > start_len:
            self.out.pop()
        self.ind -= 1
        self.emit('End Sub')
        self.emit()


def main():
    import argparse
    ap = argparse.ArgumentParser()
    ap.add_argument('src')
    ap.add_argument('out')
    ap.add_argument('--nomi', default=None)
    ap.add_argument('--pkg', action='append', default=None)
    ap.add_argument('--casing', default=None, help='json con mappa minuscolo->Nome dai layout')
    a = ap.parse_args()
    pkgs = a.pkg or ['cassandraRisto.ital']
    casing = json.load(open(a.casing)) if a.casing else {}
    from b4a_writer import write_project
    conv = Converter(a.src, pkgs, a.nomi, casing)
    write_project(conv, a.out)
    if a.nomi:
        conv.write_names(a.nomi)


if __name__ == '__main__':
    sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
    main()
