package cassandraRisto.ital;

/* loaded from: classes.dex */
public class ccefdll extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public anywheresoftware.b4a.objects.SocketWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
    public anywheresoftware.b4a.net.SMTPWrapper _vvvvvv3 = null;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
    public long _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.ckprinter _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public anywheresoftware.b4a.sql.SQL.CursorWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.ccefdll._tattivazionert _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
    public cassandraRisto.ital.ccefdll._tlastscontrino _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public b4a.example.dateutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.utility _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public ital.TotemLib.totemdata _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public ital.TotemLib.language _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.acttotemmain _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.main _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.tabelle _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.configura _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.httpclient _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.operatori _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.frmfraziona _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.mod1 _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.starter _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.cassetto _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.clienti _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.colorsroutine _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.confpalmari _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.confstampe _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.dbutil _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.fatturafm _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.filtro _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.ftpmanager _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.iniziative _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.magazzino _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.menu _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.modfunstr _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.offerte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.ordini _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.prenotazioni _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.rpidevice _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.stampe _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.stampecustom _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.tabelleappoggio _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.usbpl2303 _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.usbpl2303service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.verificazione _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.httputils2service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.xuiviewsutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "cassandraRisto.ital.ccefdll");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", cassandraRisto.ital.ccefdll.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public static class _tattivazionert {
        public boolean Attivazione;
        public boolean Censita;
        public boolean InService;
        public long InServiceDa;
        public boolean IsInitialized;
        public boolean generateChiavi;

        public void Initialize() {
            this.IsInitialized = true;
            this.generateChiavi = false;
            this.Censita = false;
            this.Attivazione = false;
            this.InService = false;
            this.InServiceDa = 0L;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _tcopia {
        public boolean IsInitialized;
        public java.lang.String Testo;
        public int stile;

        public void Initialize() {
            this.IsInitialized = true;
            this.Testo = "";
            this.stile = 0;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _tresort {
        public boolean IsInitialized;
        public java.lang.String tDescrizione;
        public int tIvaRT;
        public int tPrezzoUnitarioLordo100;
        public int tQta1000;
        public java.lang.String tScontrino;

        public void Initialize() {
            this.IsInitialized = true;
            this.tPrezzoUnitarioLordo100 = 0;
            this.tQta1000 = 0;
            this.tDescrizione = "";
            this.tIvaRT = 0;
            this.tScontrino = "";
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _tlastscontrino {
        public java.lang.String DataeOraMF;
        public boolean IsInitialized;
        public int nChiusura;
        public int nScontrino;

        public void Initialize() {
            this.IsInitialized = true;
            this.DataeOraMF = "";
            this.nScontrino = 0;
            this.nChiusura = 0;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        r0 = r8.__c;
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(boolean z) throws java.lang.Exception {
        boolean z2 = false;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 && z) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("7007Chiusura Giornaliera    ");
            cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 20)).toString(), 11) == 44) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
            }
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            return true;
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.Common.DoEvents();
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.Common.DoEvents();
        boolean z3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        int i = 0;
        while (true) {
            if (i > 100) {
                break;
            }
            try {
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1510", 32) != 0) {
                    break;
                }
                java.lang.String _read = _read();
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                anywheresoftware.b4a.keywords.Common.LogImpl("496993310", _read, 0);
                if (_read.length() != 30 || _read.substring(0, 1).equals("2")) {
                    break;
                }
                if (_read.substring(0, 1).equals("1")) {
                    break;
                }
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                anywheresoftware.b4a.keywords.Common.DoEvents();
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                anywheresoftware.b4a.keywords.Common.DoEvents();
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 500);
                if (i >= 40 && i % 10 == 0) {
                    anywheresoftware.b4a.keywords.Common common11 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1001", 11) == 44) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        anywheresoftware.b4a.keywords.Common common12 = this.__c;
                        z2 = true;
                    }
                    anywheresoftware.b4a.keywords.Common common13 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                    if (z2) {
                        break;
                    }
                }
                i++;
            } catch (java.lang.Exception e) {
                this.ba.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
            }
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = z3;
        return z2;
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        _nf_apri(true);
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        _nf_testo(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6, 1);
        _nf_testo("MESSA IN SERVIZIO", 4);
        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        _nf_testo(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6, 1);
        _nf_chiudi();
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1511", 36);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 != 0) {
            return "";
        }
        return _read();
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length() > 0) {
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length() <= 0) {
                return true;
            }
            java.lang.String substring = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.substring(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length() - 1, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length());
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = substring.equals(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(3))));
            return true;
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        return false;
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1214", 1) == 0) {
            java.lang.String _read = _read();
            if (_read.length() == 1 && (_read.equals("4") || _read.equals("3"))) {
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                return false;
            }
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            return true;
        }
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        return true;
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.SocketWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
        this._vvvvvv3 = new anywheresoftware.b4a.net.SMTPWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0L;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 2;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
        anywheresoftware.b4a.keywords.Common common9 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 6;
        anywheresoftware.b4a.keywords.Common common10 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new cassandraRisto.ital.ckprinter();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new cassandraRisto.ital.ccefdll._tattivazionert();
        anywheresoftware.b4a.keywords.Common common11 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
        anywheresoftware.b4a.keywords.Common common12 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
        anywheresoftware.b4a.keywords.Common common13 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
        anywheresoftware.b4a.keywords.Common common14 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new cassandraRisto.ital.ccefdll._tlastscontrino();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.List();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Close();
            return "";
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(long j) throws java.lang.Exception {
        switch (anywheresoftware.b4a.BA.switchObjectToInt(java.lang.Long.valueOf(j), 0L, 2L, 3L, 4L, 5L, 6L, 7L, 9L, 10L, 11L, 12L, 13L, 14L, 16L, 18L, 19L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 38L, 39L, 40L, 50L, 51L, 52L, 53L, 54L, 55L, 56L, 57L, 59L, 60L, 62L, 63L, 64L, 65L, 66L, 67L, 68L)) {
            case 0:
                return "Errore " + anywheresoftware.b4a.BA.NumberToString(j) + " sconosciuto";
            case 1:
                return "Errore lettura dati da Memoria Fiscale";
            case 2:
                return "Valore non valido";
            case 3:
                return "Errore interno di codice";
            case 4:
                return "Operazione non possibile";
            case 5:
                return "Errore scrittura logotipo in Memoria Fiscale";
            case 6:
                return "Descrizione TOTALE non permesssa";
            case 7:
                return "Superato massimo importo scontrino";
            case 8:
                return "Superato massimo importo corrisp. giorno";
            case 9:
                return "Valore ricevuto non congruente";
            case 10:
                return "Data antecedente all'ultima memorizzata in Memoria Fiscale";
            case 11:
                return "Data/Ora non valida";
            case 12:
                return "Data differente";
            case 13:
                return "Carta esaurita";
            case 14:
                return "Manca intestazione";
            case 15:
                return "Chiusura non scritta in Memoria Fiscale";
            case 16:
                return "Documento già in corso";
            case 17:
                return "Date diverse";
            case 18:
                return "Totale negativo";
            case 19:
                return "Lunghezza comando errata";
            case 20:
                return "Pagamento incompleto";
            case 21:
                return "Procedura interrotta dall'utente";
            case 22:
                return "Errore nel database interno della cassa";
            case 23:
                java.lang.String str = "Errore generico " + anywheresoftware.b4a.BA.NumberToString(j);
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append(str);
                    anywheresoftware.b4a.keywords.Common common = this.__c;
                    return append.append("\n").append("Verificare che il campo Codice Iva RT nella anagrafica iva sia compilato correttamente.").toString();
                }
                return str;
            case 24:
                return "Il totale iva del documento risulta essere negativo";
            case 25:
                return "DGFE esaurito";
            case 26:
                return "DGFE quasi esaurito";
            case 27:
                return "Inizializzazione DGFE non possibile";
            case 28:
                return "DGFE non presente";
            case 29:
                return "Dati DGFE errati";
            case 30:
                return "Memoria Fiscale disconnessa";
            case 31:
                return "Nessun dato trovato su DGFE";
            case 32:
                return "DGFE non identificato";
            case 33:
                return "SD/MMC con password";
            case 34:
                return "Dato DGFE non presente";
            case 35:
                return "Memoria Fiscale non presente";
            case 36:
                return "Memoria Fiscale esaurita";
            case 37:
                return "Jumper HWINIT inserito";
            case 38:
                return "MF già serializzata";
            case 39:
                return "Necessaria Chiusura Giornaliera";
            case 40:
                return "Modalità training attiva";
            case 41:
                return "Display cliente disconnesso.";
            case 42:
                return "Data/ora non impostati";
            case 43:
                return "Dispositivo non fiscalizzabile";
            case 44:
                return "Dispositivo non serializzabile";
            case 45:
                return "Ricezione dati in corso";
            case 46:
                return "Transazione EFT-POS fallita";
            case 47:
                return "Coperchio aperto";
            case 48:
                return "Errore tensione alimentazione testina termica";
            case 49:
                return "Errore temperatura testina termica";
            case 50:
                return "Taglierina inceppata oppure errore op.sys.";
            case 51:
                return "Testina termica scollegata";
            default:
                return "Errore generico " + anywheresoftware.b4a.BA.NumberToString(j);
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, int i) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String sb2 = sb.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(getActivityBA(), anywheresoftware.b4a.BA.NumberToString(str.length()), 3, anywheresoftware.b4a.BA.ObjectToChar("0"))).append(str).toString();
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("74000001");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", sb2)).append("").toString(), 1) == 0) {
            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
            stringBuilderWrapper.Initialize();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
            boolean z = false;
            while (true) {
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                if (!anywheresoftware.b4a.keywords.Common.Not(z)) {
                    break;
                }
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7403120", 1) == 0) {
                    stringBuilderWrapper.Append(_read().substring(3));
                } else {
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    z = true;
                }
            }
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7408", 1);
            if (stringBuilderWrapper.ToString().length() > 0) {
                java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("CORRISPETTIVI_");
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(activityBA, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append("_").append(anywheresoftware.b4a.BA.NumberToString(i)).append("_");
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.StringBuilder append4 = append3.append(cassandraRisto.ital.main._v_numcassa).append("_");
                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.String replace = append4.append(cassandraRisto.ital.main._v_nnegozio).append(".xml").toString().replace("/", "").replace(":", "");
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.WriteString(sb3.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/Corrispettivi").toString(), replace, stringBuilderWrapper.ToString());
                return "";
            }
            return "";
        }
        return "";
    }

    public java.lang.String _ft_apri(int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = i;
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 == 0) {
                return "";
            }
            anywheresoftware.b4a.keywords.Common common = this.__c;
            _nf_apri(false);
            return "";
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("30161", 1) != 0) {
            return "";
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("400121");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i, 9, 0, 0, false)).toString(), 1) != 0) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("4002", 1);
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _ft_chiudi() throws java.lang.Exception {
        boolean z;
        int i;
        int i2;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 < 0) {
                _ft_testo("==========================================", 1);
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("TOT. NOTA DI CREDITO:");
                cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append2 = sb.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 11));
                anywheresoftware.b4a.keywords.Common common = this.__c;
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                _ft_testo(append.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(activityBA, append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2((this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 * (-1)) / 100.0d, 1, 2, 2, false)).toString(), 11L)).toString(), 4);
                _ft_testo("==========================================", 1);
            } else {
                _ft_testo("==========================================", 1);
                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("TOT.   FATTURA:");
                cassandraRisto.ital.modfunstr modfunstrVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                cassandraRisto.ital.modfunstr modfunstrVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append4 = sb2.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 17));
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                _ft_testo(append3.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(activityBA2, append4.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 / 100.0d, 1, 2, 2, false)).toString(), 17L)).toString(), 4);
                _ft_testo("==========================================", 1);
            }
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 > 0.0d) {
                _ft_testo(" ", 1);
                _ft_testo("Operazione assoggettata a  ", 1);
                _ft_testo("split payment con IVA non  ", 1);
                _ft_testo("incassata dal cedente ai sensi ", 1);
                _ft_testo("dell’ex art.17-ter DPR 633/1972", 1);
                _ft_testo(" ", 1);
                _ft_testo("==========================================", 1);
                java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("NETTO DA PAGARE:");
                cassandraRisto.ital.modfunstr modfunstrVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA activityBA3 = getActivityBA();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                cassandraRisto.ital.modfunstr modfunstrVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append6 = sb3.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 16));
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                double d = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                double d2 = (d - (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 * 100.0d)) / 100.0d;
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                _ft_testo(append5.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(activityBA3, append6.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(d2, 1, 2, 2, false)).toString(), 16L)).toString(), 4);
                _ft_testo("==========================================", 1);
            }
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 > 0) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("4004", 1);
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 > 1) {
                    cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_pausafe) {
                        anywheresoftware.b4a.keywords.Common common7 = this.__c;
                        cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("PR1B"))) {
                            anywheresoftware.b4a.keywords.Common common8 = this.__c;
                            cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("PX1B"))) {
                                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("IP1B"))) {
                                    z = true;
                                    if (z) {
                                        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 500);
                                        anywheresoftware.b4a.keywords.Common common10 = this.__c;
                                        anywheresoftware.b4a.BA ba = this.ba;
                                        cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Premere Ok quando si è pronti per la stampa della copia successiva");
                                    }
                                    i = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 - 1;
                                    for (i2 = 1; i2 <= i; i2++) {
                                        cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _nf_apri(cassandraRisto.ital.main._v_intesta);
                                        int size = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() - 1;
                                        for (int i3 = 0; i3 <= size; i3++) {
                                            cassandraRisto.ital.ccefdll._tcopia _tcopiaVar = (cassandraRisto.ital.ccefdll._tcopia) this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get(i3);
                                            _nf_testo(_tcopiaVar.Testo, _tcopiaVar.stile);
                                        }
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("4004", 1);
                                        if (i2 < this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 - 1 && z) {
                                            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 500);
                                            anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                            anywheresoftware.b4a.BA ba2 = this.ba;
                                            cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Premere Ok quando si è pronti per la stampa della copia successiva");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    i = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 - 1;
                    while (i2 <= i) {
                    }
                }
            }
            anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
            cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String str = cassandraRisto.ital.mod1._vvvvvv1;
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            randomAccessFile.Initialize2(str, "Tmp.MF", false, false);
            java.util.List<java.lang.Object> object = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject();
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            randomAccessFile.WriteObject(object, true, randomAccessFile.CurrentPosition);
            randomAccessFile.Close();
            anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
            anywheresoftware.b4a.keywords.Common common15 = this.__c;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String str2 = cassandraRisto.ital.mod1._vvvvvv1;
            anywheresoftware.b4a.keywords.Common common16 = this.__c;
            textWriterWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(str2, "Tmp.txt", false).getObject());
            int size2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() - 1;
            for (int i4 = 0; i4 <= size2; i4++) {
                java.lang.StringBuilder append7 = new java.lang.StringBuilder().append(((cassandraRisto.ital.ccefdll._tcopia) this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get(i4)).Testo);
                anywheresoftware.b4a.keywords.Common common17 = this.__c;
                java.lang.StringBuilder append8 = append7.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(13))));
                anywheresoftware.b4a.keywords.Common common18 = this.__c;
                textWriterWrapper.Write(append8.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(10)))).toString());
            }
            textWriterWrapper.Close();
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.keywords.Common common19 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(list, (java.util.List) anywheresoftware.b4a.keywords.Common.Null);
            return "";
        }
        java.lang.StringBuilder append9 = new java.lang.StringBuilder().append("4003F15TOTALE FATTURA:");
        anywheresoftware.b4a.keywords.Common common20 = this.__c;
        double d3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.keywords.Common common21 = this.__c;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append9.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(d3, 9, 0, 0, false)).toString(), 1) != 0) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("4006", 1);
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _ft_ristampafe(java.lang.String str) throws java.lang.Exception {
        boolean z;
        int i;
        int i2;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvvv1, str)) {
            anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String str2 = cassandraRisto.ital.mod1._vvvvvv1;
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            randomAccessFile.Initialize(str2, str, false);
            if (randomAccessFile.getSize() == 0) {
                cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(getActivityBA(), "Errore nella struttura del file job (" + str + ")");
                randomAccessFile.Close();
                return "";
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List) randomAccessFile.ReadObject(randomAccessFile.CurrentPosition));
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_pausafe) {
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("PR1B"))) {
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("PX1B"))) {
                        anywheresoftware.b4a.keywords.Common common5 = this.__c;
                        cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("IP1B"))) {
                            z = true;
                            i = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 - 1;
                            for (i2 = 0; i2 <= i; i2++) {
                                cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                _nf_apri(cassandraRisto.ital.main._v_intesta);
                                int size = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() - 1;
                                for (int i3 = 0; i3 <= size; i3++) {
                                    cassandraRisto.ital.ccefdll._tcopia _tcopiaVar = (cassandraRisto.ital.ccefdll._tcopia) this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get(i3);
                                    _nf_testo(_tcopiaVar.Testo, _tcopiaVar.stile);
                                }
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("4004", 1);
                                if (i2 < this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 - 1 && z) {
                                    cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 500);
                                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                                    anywheresoftware.b4a.BA ba = this.ba;
                                    cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Premere Ok quando si è pronti per la stampa della copia successiva");
                                }
                            }
                            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                            anywheresoftware.b4a.keywords.Common common7 = this.__c;
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(list, (java.util.List) anywheresoftware.b4a.keywords.Common.Null);
                        }
                    }
                }
            }
            z = false;
            i = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 - 1;
            while (i2 <= i) {
            }
            anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.keywords.Common common72 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(list2, (java.util.List) anywheresoftware.b4a.keywords.Common.Null);
        }
        return "";
    }

    public java.lang.String _ft_testo(java.lang.String str, int i) throws java.lang.Exception {
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String NumberToString;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
            if (i < 4) {
                anywheresoftware.b4a.keywords.Common common = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(str.startsWith("TOT. "))) {
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Not(str.startsWith("NETTO DA PAGARE"))) {
                        anywheresoftware.b4a.keywords.Common common3 = this.__c;
                        if (anywheresoftware.b4a.keywords.Common.Not(str.startsWith("Scontrini del"))) {
                            anywheresoftware.b4a.keywords.Common common4 = this.__c;
                            if (anywheresoftware.b4a.keywords.Common.Not(str.startsWith("RIC.N."))) {
                                i = 3;
                            }
                        }
                    }
                }
            }
            cassandraRisto.ital.ccefdll._tcopia _tcopiaVar = new cassandraRisto.ital.ccefdll._tcopia();
            _tcopiaVar.Testo = str;
            _tcopiaVar.stile = i;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Add(_tcopiaVar);
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 == 0) {
                return "";
            }
            _nf_testo(str, i);
            return "";
        }
        if (i > 6) {
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_stampa66char)) {
                i = 1;
            }
        }
        anywheresoftware.b4a.BA.NumberToString(i);
        if (i == 10) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 60);
            NumberToString = "D";
        } else if (i == 11) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 66);
            NumberToString = "B";
        } else if (i == 12) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 66);
            NumberToString = "C";
        } else {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 42);
            if (i < 1 || i > 6) {
                i = 1;
            }
            NumberToString = anywheresoftware.b4a.BA.NumberToString(i);
        }
        java.lang.String str2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.equals("") ? " " : _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("4003").append(NumberToString);
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        double length = str2.length();
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(str2).toString(), 1);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(boolean z) throws java.lang.Exception {
        if (z) {
            anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(17))));
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(17))));
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(18))));
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(53))));
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            java.lang.StringBuilder append8 = append7.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            java.lang.StringBuilder append10 = append9.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(53))));
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            java.lang.StringBuilder append11 = append10.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(51))));
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            java.lang.StringBuilder append12 = append11.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(50))));
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            java.lang.StringBuilder append13 = append12.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(54))));
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            java.lang.StringBuilder append14 = append13.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(30))));
            anywheresoftware.b4a.keywords.Common common15 = this.__c;
            java.lang.StringBuilder append15 = append14.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(49))));
            anywheresoftware.b4a.keywords.Common common16 = this.__c;
            java.lang.StringBuilder append16 = append15.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(50))));
            anywheresoftware.b4a.keywords.Common common17 = this.__c;
            java.lang.StringBuilder append17 = append16.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(56))));
            anywheresoftware.b4a.keywords.Common common18 = this.__c;
            textWriterWrapper.Write(append17.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(31)))).toString());
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Flush();
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 1000);
            anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common19 = this.__c;
            java.lang.StringBuilder append18 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(17))));
            anywheresoftware.b4a.keywords.Common common20 = this.__c;
            java.lang.StringBuilder append19 = append18.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(17))));
            anywheresoftware.b4a.keywords.Common common21 = this.__c;
            java.lang.StringBuilder append20 = append19.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(18))));
            anywheresoftware.b4a.keywords.Common common22 = this.__c;
            java.lang.StringBuilder append21 = append20.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common23 = this.__c;
            java.lang.StringBuilder append22 = append21.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common24 = this.__c;
            java.lang.StringBuilder append23 = append22.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(53))));
            anywheresoftware.b4a.keywords.Common common25 = this.__c;
            java.lang.StringBuilder append24 = append23.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common26 = this.__c;
            java.lang.StringBuilder append25 = append24.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common27 = this.__c;
            java.lang.StringBuilder append26 = append25.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
            anywheresoftware.b4a.keywords.Common common28 = this.__c;
            java.lang.StringBuilder append27 = append26.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(53))));
            anywheresoftware.b4a.keywords.Common common29 = this.__c;
            java.lang.StringBuilder append28 = append27.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(51))));
            anywheresoftware.b4a.keywords.Common common30 = this.__c;
            java.lang.StringBuilder append29 = append28.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(50))));
            anywheresoftware.b4a.keywords.Common common31 = this.__c;
            java.lang.StringBuilder append30 = append29.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(55))));
            anywheresoftware.b4a.keywords.Common common32 = this.__c;
            java.lang.StringBuilder append31 = append30.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(30))));
            anywheresoftware.b4a.keywords.Common common33 = this.__c;
            java.lang.StringBuilder append32 = append31.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(57))));
            anywheresoftware.b4a.keywords.Common common34 = this.__c;
            java.lang.StringBuilder append33 = append32.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(50))));
            anywheresoftware.b4a.keywords.Common common35 = this.__c;
            java.lang.StringBuilder append34 = append33.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(49))));
            anywheresoftware.b4a.keywords.Common common36 = this.__c;
            textWriterWrapper2.Write(append34.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(31)))).toString());
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Flush();
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 1000);
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Sblocco eseguito correttamente", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            return "";
        }
        anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common37 = this.__c;
        java.lang.StringBuilder append35 = sb3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(17))));
        anywheresoftware.b4a.keywords.Common common38 = this.__c;
        java.lang.StringBuilder append36 = append35.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(17))));
        anywheresoftware.b4a.keywords.Common common39 = this.__c;
        java.lang.StringBuilder append37 = append36.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(18))));
        anywheresoftware.b4a.keywords.Common common40 = this.__c;
        java.lang.StringBuilder append38 = append37.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common41 = this.__c;
        java.lang.StringBuilder append39 = append38.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common42 = this.__c;
        java.lang.StringBuilder append40 = append39.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(53))));
        anywheresoftware.b4a.keywords.Common common43 = this.__c;
        java.lang.StringBuilder append41 = append40.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common44 = this.__c;
        java.lang.StringBuilder append42 = append41.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common45 = this.__c;
        java.lang.StringBuilder append43 = append42.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common46 = this.__c;
        java.lang.StringBuilder append44 = append43.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(53))));
        anywheresoftware.b4a.keywords.Common common47 = this.__c;
        java.lang.StringBuilder append45 = append44.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(51))));
        anywheresoftware.b4a.keywords.Common common48 = this.__c;
        java.lang.StringBuilder append46 = append45.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(50))));
        anywheresoftware.b4a.keywords.Common common49 = this.__c;
        java.lang.StringBuilder append47 = append46.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(54))));
        anywheresoftware.b4a.keywords.Common common50 = this.__c;
        java.lang.StringBuilder append48 = append47.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(30))));
        anywheresoftware.b4a.keywords.Common common51 = this.__c;
        java.lang.StringBuilder append49 = append48.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common52 = this.__c;
        java.lang.StringBuilder append50 = append49.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(50))));
        anywheresoftware.b4a.keywords.Common common53 = this.__c;
        java.lang.StringBuilder append51 = append50.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(57))));
        anywheresoftware.b4a.keywords.Common common54 = this.__c;
        textWriterWrapper3.Write(append51.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(31)))).toString());
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Flush();
        cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 1000);
        anywheresoftware.b4a.keywords.Common common55 = this.__c;
        anywheresoftware.b4a.keywords.Common.LogImpl("497255452", anywheresoftware.b4a.BA.NumberToString(1), 0);
        anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common56 = this.__c;
        java.lang.StringBuilder append52 = sb4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(17))));
        anywheresoftware.b4a.keywords.Common common57 = this.__c;
        java.lang.StringBuilder append53 = append52.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(17))));
        anywheresoftware.b4a.keywords.Common common58 = this.__c;
        java.lang.StringBuilder append54 = append53.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(18))));
        anywheresoftware.b4a.keywords.Common common59 = this.__c;
        java.lang.StringBuilder append55 = append54.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common60 = this.__c;
        java.lang.StringBuilder append56 = append55.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common61 = this.__c;
        java.lang.StringBuilder append57 = append56.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(53))));
        anywheresoftware.b4a.keywords.Common common62 = this.__c;
        java.lang.StringBuilder append58 = append57.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common63 = this.__c;
        java.lang.StringBuilder append59 = append58.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common64 = this.__c;
        java.lang.StringBuilder append60 = append59.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(48))));
        anywheresoftware.b4a.keywords.Common common65 = this.__c;
        java.lang.StringBuilder append61 = append60.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(53))));
        anywheresoftware.b4a.keywords.Common common66 = this.__c;
        java.lang.StringBuilder append62 = append61.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(51))));
        anywheresoftware.b4a.keywords.Common common67 = this.__c;
        java.lang.StringBuilder append63 = append62.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(50))));
        anywheresoftware.b4a.keywords.Common common68 = this.__c;
        java.lang.StringBuilder append64 = append63.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(55))));
        anywheresoftware.b4a.keywords.Common common69 = this.__c;
        java.lang.StringBuilder append65 = append64.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(30))));
        anywheresoftware.b4a.keywords.Common common70 = this.__c;
        java.lang.StringBuilder append66 = append65.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(57))));
        anywheresoftware.b4a.keywords.Common common71 = this.__c;
        java.lang.StringBuilder append67 = append66.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(50))));
        anywheresoftware.b4a.keywords.Common common72 = this.__c;
        java.lang.StringBuilder append68 = append67.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(49))));
        anywheresoftware.b4a.keywords.Common common73 = this.__c;
        textWriterWrapper4.Write(append68.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(31)))).toString());
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Flush();
        anywheresoftware.b4a.keywords.Common common74 = this.__c;
        anywheresoftware.b4a.keywords.Common.LogImpl("497255455", anywheresoftware.b4a.BA.NumberToString(2), 0);
        cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 1000);
        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Blocco eseguito correttamente", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 == 0) {
            java.lang.String str = "0";
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Si desidera aggiornare adesso il registratore telematico ?");
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "Annulla", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
            if (Msgbox2 == -1) {
                str = "1";
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("ATTENZIONE ... EVITARE DI SPEGNERE IL REGISTRATORE DURANTE LA FASE DI AGGIORNAMENTO ... \nIL PROGRAMMA VERRA' CHIUSO PER CONSENTIRE L'AGGIORNAMENTO.");
                cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("2009" + str, 1);
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.BA ba = this.ba;
            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba, cassandraRisto.ital.main.getObject(), "EsciDaProgrammaAttendi");
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("20091", 1);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int i) throws java.lang.Exception {
        switch (i) {
            case 1:
                return "011";
            case 2:
                return "111";
            case 3:
                return "211";
            case 4:
                return "311";
            case 5:
                return "012";
            case 6:
                return "112";
            case 7:
                return "212";
            case 8:
                return "312";
            case 9:
                return "013";
            case 10:
                return "113";
            case 11:
                return "213";
            case 12:
                return "313";
            case 13:
                return "014";
            case 14:
                return "114";
            case 15:
                return "214";
            case 16:
                return "314";
            case 17:
                return "015";
            case 18:
                return "115";
            case 19:
                return "215";
            case 20:
                return "315";
            case 21:
                return "016";
            case 22:
                return "116";
            case 23:
                return "216";
            case 24:
                return "316";
            case 25:
                return "017";
            default:
                return "";
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str) throws java.lang.Exception {
        switch (anywheresoftware.b4a.BA.switchObjectToInt(str, "Ricevuta POS", "Vuoto a rendere", "Non dichiarato")) {
        }
        return "POS";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws java.lang.Exception {
        int _rt_countfileinfolder = _rt_countfileinfolder("mmc:0:\\XML\\SENT\\CORR\\FAIL");
        int _rt_countfileinfolder2 = _rt_countfileinfolder("mmc:0:\\XML\\SENT\\CORR\\NORESP");
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("0");
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(getActivityBA(), anywheresoftware.b4a.BA.NumberToString(_rt_countfileinfolder), 4, anywheresoftware.b4a.BA.ObjectToChar("0")));
        cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        return append2.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(getActivityBA(), anywheresoftware.b4a.BA.NumberToString(_rt_countfileinfolder2), 4, anywheresoftware.b4a.BA.ObjectToChar("0"))).toString();
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, int i) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = i;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str, boolean z) throws java.lang.Exception {
        if (z) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                long _vvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append = sb.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv2(getActivityBA(), _vvvvvvvvvvvvv0));
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                java.lang.StringBuilder append2 = append.append("\t").append(str);
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                java.lang.String sb2 = append2.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                java.lang.String sb4 = sb3.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/LOG").toString();
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                textWriterWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(sb4, "CEFDLL_ERR.txt", true).getObject());
                textWriterWrapper.WriteLine(sb2);
                textWriterWrapper.Close();
            }
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
            anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper2 = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            long _vvvvvvvvvvvvv02 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append3 = sb5.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv2(getActivityBA(), _vvvvvvvvvvvvv02));
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            java.lang.StringBuilder append4 = append3.append("\t").append(str);
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            java.lang.String sb6 = append4.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String sb8 = sb7.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/LOG").toString();
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            textWriterWrapper2.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(sb8, "CEFDLL_LOG.txt", true).getObject());
            textWriterWrapper2.WriteLine(sb6);
            textWriterWrapper2.Close();
            return "";
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 == 1) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.Common.CallSubNew3(this.ba, "Verificazione", "MsgboxOnly", str2, str);
            return "";
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 == 2) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.CallSubNew3(this.ba, "tabelleappoggio", "MsgboxOnly", str2, str);
            return "";
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence(str), anywheresoftware.b4a.BA.ObjectToCharSequence(str2), getActivityBA());
        return "";
    }

    public java.lang.String _mf_apricassetto() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("70081", 1);
        return "";
    }

    public boolean _mf_dayisopen() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            return false;
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1010", 12) == 0) {
            java.lang.String _read = _read();
            if (_read.length() >= 8 && _read.substring(7, 8).equals("0")) {
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                return true;
            }
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            return false;
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Not(r7.toLowerCase().startsWith("resto ")) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (cassandraRisto.ital.main._v_glory == 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _mf_display(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        boolean z;
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._v_ipvis.equals("")) {
                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            }
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.equals("")) {
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 1) {
                    anywheresoftware.b4a.keywords.Common common = this.__c;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                java.lang.String substring = sb.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str, 20, false)).append("                    ").toString().substring(0, 20);
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_attivamp) {
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)) {
                        z = true;
                        if (!anywheresoftware.b4a.keywords.Common.Not(z)) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common5 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = sb2.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str2, 20, false)).append("                    ").toString().substring(0, 20);
                        } else {
                            cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 20);
                        }
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7007" + substring + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, 1);
                        return "";
                    }
                }
                z = false;
                if (!anywheresoftware.b4a.keywords.Common.Not(z)) {
                }
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7007" + substring + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, 1);
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:10:0x0018, B:12:0x0029, B:15:0x0036, B:17:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004a, B:23:0x004f, B:25:0x0061, B:27:0x0069, B:28:0x007b, B:30:0x0082, B:32:0x008c, B:33:0x0093, B:35:0x009b, B:38:0x00ac, B:40:0x00b0, B:42:0x00d7, B:44:0x00dd, B:46:0x00f7, B:47:0x010c, B:48:0x011a, B:49:0x012a, B:51:0x0130, B:53:0x013c, B:54:0x0145, B:56:0x014f), top: B:9:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:10:0x0018, B:12:0x0029, B:15:0x0036, B:17:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004a, B:23:0x004f, B:25:0x0061, B:27:0x0069, B:28:0x007b, B:30:0x0082, B:32:0x008c, B:33:0x0093, B:35:0x009b, B:38:0x00ac, B:40:0x00b0, B:42:0x00d7, B:44:0x00dd, B:46:0x00f7, B:47:0x010c, B:48:0x011a, B:49:0x012a, B:51:0x0130, B:53:0x013c, B:54:0x0145, B:56:0x014f), top: B:9:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145 A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:10:0x0018, B:12:0x0029, B:15:0x0036, B:17:0x003c, B:18:0x0042, B:20:0x0046, B:22:0x004a, B:23:0x004f, B:25:0x0061, B:27:0x0069, B:28:0x007b, B:30:0x0082, B:32:0x008c, B:33:0x0093, B:35:0x009b, B:38:0x00ac, B:40:0x00b0, B:42:0x00d7, B:44:0x00dd, B:46:0x00f7, B:47:0x010c, B:48:0x011a, B:49:0x012a, B:51:0x0130, B:53:0x013c, B:54:0x0145, B:56:0x014f), top: B:9:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _mf_eod(java.lang.String str) throws java.lang.Exception {
        boolean z;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("30161", 1) != 0) {
            return "";
        }
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
        try {
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(getActivityBA(), "Chiusura Giornaliera");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                z = true;
                if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("2002", 3);
                }
                if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                        anywheresoftware.b4a.keywords.Common common4 = this.__c;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                    }
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("ST"))) {
                        if (str.equals("Main")) {
                            anywheresoftware.b4a.keywords.Common common6 = this.__c;
                            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Invio dati di vendita in corso ...");
                            anywheresoftware.b4a.keywords.Common common7 = this.__c;
                            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA2, ObjectToCharSequence, false);
                        }
                        anywheresoftware.b4a.keywords.Common common8 = this.__c;
                        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 < 7))) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Si sono verificati problemi durante l'invio dei dati di vendita", "Errore invio dati");
                        } else if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) {
                            anywheresoftware.b4a.keywords.Common common9 = this.__c;
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
                            _rt_verificamagazzino();
                        }
                        if (str.equals("Main")) {
                            anywheresoftware.b4a.keywords.Common common10 = this.__c;
                            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
                        }
                    } else {
                        cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 > 0) {
                            anywheresoftware.b4a.objects.IntentWrapper intentWrapper = new anywheresoftware.b4a.objects.IntentWrapper();
                            intentWrapper.Initialize("android.intent.action.MAIN", "zclosure://custom.com/0/1/PROD");
                            intentWrapper.SetComponent("com.custom.utilityrt/.ZSplashActivity");
                            if (str.equals("Main")) {
                                cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "Chiusura";
                                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                anywheresoftware.b4a.BA ba = this.ba;
                                cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.main.getObject(), "StartActivityForResult", intentWrapper);
                            } else {
                                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                                anywheresoftware.b4a.BA ba2 = this.ba;
                                cassandraRisto.ital.verificazione verificazioneVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.verificazione.getObject(), "StartActivityForResult", intentWrapper);
                            }
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
                            cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set ProgLotteriaST =0");
                        } else {
                            cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 == 0) {
                                cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Non è stata trovata l'applicazione UtilityRT", "Errore invio dati");
                                }
                            }
                        }
                    }
                } else {
                    anywheresoftware.b4a.keywords.Common common13 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                        anywheresoftware.b4a.keywords.Common common14 = this.__c;
                        anywheresoftware.b4a.BA ba3 = this.ba;
                        cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba3, cassandraRisto.ital.main.getObject(), "AttendiChiusuraMF");
                        anywheresoftware.b4a.keywords.Common common15 = this.__c;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
                        anywheresoftware.b4a.keywords.Common common16 = this.__c;
                        _rt_leggistato(false);
                    }
                }
                anywheresoftware.b4a.keywords.Common common17 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
                return "";
            }
        }
        z = false;
        if (anywheresoftware.b4a.keywords.Common.Not(z)) {
        }
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
        }
        anywheresoftware.b4a.keywords.Common common172 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
        return "";
    }

    public java.lang.String _mf_feed() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7001z0", 1);
        return "";
    }

    public int _mf_getdisplaystampa(java.lang.String str) throws java.lang.Exception {
        try {
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
                return -1;
            }
            anywheresoftware.b4a.keywords.Common common = this.__c;
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("ST")) && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7501" + str, 11) == 0) {
                return (int) java.lang.Double.parseDouble(_read());
            }
            return -1;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Errore nella lettura dei valori di stampa e display .");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.StringBuilder append2 = append.append("\n");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            java.lang.String sb = append2.append("\n").append("Uscire e riprovare .").toString();
            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("Errore dal ");
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb, append3.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
            return -1;
        }
    }

    public boolean _mf_intesta(int i, java.lang.String str, int i2) throws java.lang.Exception {
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            return false;
        }
        if (str.toLowerCase().equals("logo1")) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            return true;
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1010", 12) == 0) {
            java.lang.String _read = _read();
            if (_read.length() < 8 || _read.substring(7, 8).equals("0")) {
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                return false;
            }
            int i3 = 32;
            if (i2 == 5) {
                i3 = 16;
            }
            if (i2 == 3) {
                i3 = 42;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), (int) ((i3 - r3.length()) / 2.0d))).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, i3).trim()).toString();
            cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            java.lang.StringBuilder append = new java.lang.StringBuilder().append(sb2);
            cassandraRisto.ital.modfunstr modfunstrVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.String _left = cassandraRisto.ital.modfunstr._left(activityBA, append.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), i3)).toString(), i3);
            if (_left.toLowerCase().trim().equals("logo")) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("6302" + anywheresoftware.b4a.BA.NumberToString(i) + "I011", 1);
            } else {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("6302" + anywheresoftware.b4a.BA.NumberToString(i) + anywheresoftware.b4a.BA.NumberToString(i2) + anywheresoftware.b4a.BA.NumberToString(i3) + _left, 1);
            }
            return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0;
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        return false;
    }

    public java.lang.String _mf_leggidataora() throws java.lang.Exception {
        try {
            if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1001", 11) == 0) {
                return _read();
            }
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
        }
        return "";
    }

    public java.lang.String _mf_leggifirmwarever() throws java.lang.Exception {
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1013", 33) == 0) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _read();
        }
        return "";
    }

    public java.lang.String _mf_leggiiva() throws java.lang.Exception {
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7012", 48) == 0) {
            return _read();
        }
        return "";
    }

    public int _mf_leggilastscontr() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1004", 89) != 0) {
            return 0;
        }
        java.lang.String _read = _read();
        if (_read.length() > 4) {
            return (int) java.lang.Double.parseDouble(_read.substring(0, 4));
        }
        return 0;
    }

    public int _mf_leggilastz() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1104", 9) != 0) {
            return 0;
        }
        java.lang.String _read = _read();
        if (_read.length() > 4) {
            return (int) java.lang.Double.parseDouble(_read.substring(0, 4));
        }
        return 0;
    }

    public java.lang.String _mf_leggimf() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1008", 11) == 0) {
            java.lang.String _read = _read();
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.equals("")) {
                _mf_leggifirmwarever();
            }
            if (_read.length() == 11) {
                return _read.substring(3, 5) + _read.substring(0, 2) + _read.substring(5);
            }
            return _read;
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 1) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        }
        return "";
    }

    public int _mf_leggitotalilastscontr() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1003", 62) != 0) {
            return 0;
        }
        java.lang.String _read = _read();
        if (_read.length() > 4) {
            return (int) java.lang.Double.parseDouble(_read.substring(0, 4));
        }
        return 0;
    }

    public java.lang.String _mf_scriviiva(java.lang.String str) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7013" + str, 1);
        return "";
    }

    public java.lang.String _mf_setdatetime(java.lang.String str) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("2001" + str, 5);
        return "";
    }

    public java.lang.String _mf_setdisplaystampa(java.lang.String str, int i) throws java.lang.Exception {
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("ST"))) {
                if (str.equals("1") && (i < 0 || i > 12)) {
                    i = 5;
                } else if (!str.equals("1") && (i < 0 || i > 99)) {
                    i = 40;
                }
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("7500").append(str);
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat(i, 2, 0)).toString(), 1);
                return "";
            }
        }
        return "";
    }

    public java.lang.String _mf_sound() throws java.lang.Exception {
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_suonodacassa)) {
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                java.lang.String str = "1";
                for (int i = 0; i <= 6; i += 2) {
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3116" + str + anywheresoftware.b4a.BA.NumberToString(i), 1) > 0) {
                        anywheresoftware.b4a.keywords.Common common3 = this.__c;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                        return "";
                    }
                    if (str.equals("1")) {
                        str = "2";
                    } else {
                        str = "1";
                    }
                }
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                return "";
            }
        }
        return "";
    }

    public java.lang.String _mf_stampadgfe(java.lang.String str, int i, int i2) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("8002").append(str);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i, 4, 0, 0, false));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i2, 4, 0, 0, false)).append("0").toString(), 1);
        return "";
    }

    public int _mf_tagliacarta() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return 0;
        }
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3013", 1);
    }

    public java.lang.String _mf_writelogo(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 1) {
            return "";
        }
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        if (anywheresoftware.b4a.objects.streams.File.Exists(str, str2)) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String HexFromBytes = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter().HexFromBytes(anywheresoftware.b4a.keywords.Bit.InputStreamToBytes(anywheresoftware.b4a.objects.streams.File.OpenInput(str, str2).getObject()));
            if (HexFromBytes.length() > 0) {
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("910001");
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                double Size = anywheresoftware.b4a.objects.streams.File.Size(str, str2);
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(Size, 6, 0, 0, false)).toString(), 1) == 0) {
                    anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
                    stringBuilderWrapper.Initialize();
                    int length = HexFromBytes.length() - 1;
                    int i = 0;
                    for (int i2 = 0; i2 <= length; i2 += 2) {
                        stringBuilderWrapper.Append(HexFromBytes.substring(i2, i2 + 2));
                        i++;
                        if (i == 50) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("910150" + stringBuilderWrapper.ToString(), 1);
                            stringBuilderWrapper.Initialize();
                            anywheresoftware.b4a.keywords.Common common7 = this.__c;
                            i = 0;
                            anywheresoftware.b4a.keywords.Common.DoEvents();
                        }
                    }
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("9102", 1);
                }
            }
        }
        return "";
    }

    public java.lang.String _nf_apri(boolean z) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized())) {
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv3(activityBA, cassandraRisto.ital.main._v_stampareport);
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 == null) {
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
                    return "";
                }
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._doc_inizio();
                cassandraRisto.ital.ckprinter ckprinterVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                ckprinterVar._doc_paginizio(false);
                if (z) {
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IsInitialized())) {
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from intestaNF order by codice"));
                    }
                    if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getRowCount() > 0) {
                        cassandraRisto.ital.ckprinter ckprinterVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common6 = this.__c;
                        anywheresoftware.b4a.keywords.Common common7 = this.__c;
                        anywheresoftware.b4a.keywords.Common common8 = this.__c;
                        anywheresoftware.b4a.keywords.Common common9 = this.__c;
                        anywheresoftware.b4a.keywords.Common common10 = this.__c;
                        anywheresoftware.b4a.keywords.Common common11 = this.__c;
                        anywheresoftware.b4a.keywords.Common common12 = this.__c;
                        ckprinterVar2._doc_testostile(false, true, false, false, false, false, false, "");
                        for (int i = 0; i <= 5; i++) {
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setPosition(i);
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._doc_testogiustifica(1);
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._doc_testostampa(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.GetString("descrizione"));
                        }
                    }
                }
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._doc_testogiustifica(1);
                return "";
            }
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("30161", 1) != 0) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("40011", 1);
        if (!z || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("4002", 1) != 0) {
            return "";
        }
        return "";
    }

    public java.lang.String _nf_barcode(java.lang.String str, int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 40);
        if (i < 1 || i > 5) {
            i = 4;
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.equals("")) {
            return "";
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("3021").append(anywheresoftware.b4a.BA.NumberToString(i)).append("233");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        double length = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3).toString(), 1);
        return "";
    }

    public java.lang.String _nf_chiudi() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized())) {
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 != null) {
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    if (!anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                        cassandraRisto.ital.ckprinter ckprinterVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common3 = this.__c;
                        ckprinterVar._doc_pagfine(false);
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._doc_fine();
                        return "";
                    }
                }
                return "";
            }
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("4004", 1);
        return "";
    }

    public java.lang.String _nf_testo(java.lang.String str, int i) throws java.lang.Exception {
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String NumberToString;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        if (i > 6) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_stampa66char)) {
                i = 1;
            }
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized())) {
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 != null) {
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    if (!anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                        switch (i) {
                            case 1:
                                cassandraRisto.ital.ckprinter ckprinterVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                                ckprinterVar._doc_testostile(false, false, false, false, false, false, false, "");
                                break;
                            case 2:
                                cassandraRisto.ital.ckprinter ckprinterVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                                anywheresoftware.b4a.keywords.Common common15 = this.__c;
                                anywheresoftware.b4a.keywords.Common common16 = this.__c;
                                anywheresoftware.b4a.keywords.Common common17 = this.__c;
                                ckprinterVar2._doc_testostile(false, true, false, false, false, false, false, "");
                                break;
                            case 3:
                            case 11:
                                cassandraRisto.ital.ckprinter ckprinterVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.keywords.Common common18 = this.__c;
                                anywheresoftware.b4a.keywords.Common common19 = this.__c;
                                anywheresoftware.b4a.keywords.Common common20 = this.__c;
                                anywheresoftware.b4a.keywords.Common common21 = this.__c;
                                anywheresoftware.b4a.keywords.Common common22 = this.__c;
                                anywheresoftware.b4a.keywords.Common common23 = this.__c;
                                anywheresoftware.b4a.keywords.Common common24 = this.__c;
                                ckprinterVar3._doc_testostile(true, false, false, false, false, false, false, "");
                                break;
                            case 4:
                                cassandraRisto.ital.ckprinter ckprinterVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.keywords.Common common25 = this.__c;
                                anywheresoftware.b4a.keywords.Common common26 = this.__c;
                                anywheresoftware.b4a.keywords.Common common27 = this.__c;
                                anywheresoftware.b4a.keywords.Common common28 = this.__c;
                                anywheresoftware.b4a.keywords.Common common29 = this.__c;
                                anywheresoftware.b4a.keywords.Common common30 = this.__c;
                                anywheresoftware.b4a.keywords.Common common31 = this.__c;
                                ckprinterVar4._doc_testostile(false, false, true, false, false, false, false, "");
                                break;
                            case 5:
                                cassandraRisto.ital.ckprinter ckprinterVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.keywords.Common common32 = this.__c;
                                anywheresoftware.b4a.keywords.Common common33 = this.__c;
                                anywheresoftware.b4a.keywords.Common common34 = this.__c;
                                anywheresoftware.b4a.keywords.Common common35 = this.__c;
                                anywheresoftware.b4a.keywords.Common common36 = this.__c;
                                anywheresoftware.b4a.keywords.Common common37 = this.__c;
                                anywheresoftware.b4a.keywords.Common common38 = this.__c;
                                ckprinterVar5._doc_testostile(false, false, false, true, false, false, false, "");
                                break;
                            case 6:
                                cassandraRisto.ital.ckprinter ckprinterVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.keywords.Common common39 = this.__c;
                                anywheresoftware.b4a.keywords.Common common40 = this.__c;
                                anywheresoftware.b4a.keywords.Common common41 = this.__c;
                                anywheresoftware.b4a.keywords.Common common42 = this.__c;
                                anywheresoftware.b4a.keywords.Common common43 = this.__c;
                                anywheresoftware.b4a.keywords.Common common44 = this.__c;
                                anywheresoftware.b4a.keywords.Common common45 = this.__c;
                                ckprinterVar6._doc_testostile(false, false, false, false, true, false, false, "");
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            default:
                                cassandraRisto.ital.ckprinter ckprinterVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.keywords.Common common46 = this.__c;
                                anywheresoftware.b4a.keywords.Common common47 = this.__c;
                                anywheresoftware.b4a.keywords.Common common48 = this.__c;
                                anywheresoftware.b4a.keywords.Common common49 = this.__c;
                                anywheresoftware.b4a.keywords.Common common50 = this.__c;
                                anywheresoftware.b4a.keywords.Common common51 = this.__c;
                                anywheresoftware.b4a.keywords.Common common52 = this.__c;
                                ckprinterVar7._doc_testostile(false, false, false, false, false, false, false, "");
                                break;
                        }
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._doc_testostampa(str);
                        return "";
                    }
                }
                return "";
            }
        }
        anywheresoftware.b4a.BA.NumberToString(i);
        if (i == 10) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 60);
            NumberToString = "D";
        } else if (i == 11) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 66);
            NumberToString = "B";
        } else if (i == 12) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 66);
            NumberToString = "C";
        } else {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 42);
            if (i < 1 || i > 6) {
                i = 1;
            }
            NumberToString = anywheresoftware.b4a.BA.NumberToString(i);
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.equals("")) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = " ";
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 > 250) {
            _nf_chiudi();
            anywheresoftware.b4a.keywords.Common common53 = this.__c;
            _nf_apri(false);
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2++;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("4003").append(NumberToString);
        anywheresoftware.b4a.keywords.Common common54 = this.__c;
        double length = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
        anywheresoftware.b4a.keywords.Common common55 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3).toString(), 1);
        return "";
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.agraham.threading.Threading threading = new anywheresoftware.b4a.agraham.threading.Threading();
        if (!str.equals("")) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = str;
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize("sck");
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTimeOut(10000);
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Connect(this.ba, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, 9100, 10000);
        int i = 0;
        while (true) {
            boolean connected = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (connected || i >= 100) {
                break;
            }
            threading.Sleep(100);
            i++;
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected()) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getOutputStream());
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getInputStream());
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Connected", false);
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
            if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.equals("")) {
                return 0;
            }
            _mf_leggifirmwarever();
            return 0;
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Connection Error", true);
        return 256;
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws java.lang.Exception {
        cassandraRisto.ital.usbpl2303 usbpl2303Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(getActivityBA());
        anywheresoftware.b4a.keywords.Common common = this.__c;
        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Non è stato trovato nessun adattatore USB-Seriale Prolific", "Attenzione");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            return 1;
        }
        cassandraRisto.ital.usbpl2303 usbpl2303Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        if (cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA())) {
            cassandraRisto.ital.usbpl2303 usbpl2303Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 50, 1, "cCEFDLL", "RxDataEvent");
            cassandraRisto.ital.usbpl2303._uartdata _uartdataVar = new cassandraRisto.ital.usbpl2303._uartdata();
            cassandraRisto.ital.usbpl2303 usbpl2303Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            _uartdataVar.rate = cassandraRisto.ital.usbpl2303._rate_19200;
            cassandraRisto.ital.usbpl2303 usbpl2303Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            _uartdataVar.databits = cassandraRisto.ital.usbpl2303._databits_7;
            cassandraRisto.ital.usbpl2303 usbpl2303Var6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            _uartdataVar.parity = cassandraRisto.ital.usbpl2303._parity_odd;
            cassandraRisto.ital.usbpl2303 usbpl2303Var7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            _uartdataVar.stopbits = cassandraRisto.ital.usbpl2303._stopbits_1;
            cassandraRisto.ital.usbpl2303 usbpl2303Var8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(getActivityBA(), _uartdataVar);
            cassandraRisto.ital.usbpl2303 usbpl2303Var9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(activityBA, false, true);
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
            return 0;
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Non si dispone dell'autorizzazione per l'utilizzo di adattatori USB-Seriali", "Abilitazione");
        cassandraRisto.ital.usbpl2303 usbpl2303Var10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(getActivityBA());
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        return 2;
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        try {
            android_serialport_api.SerialPort serialPort = new android_serialport_api.SerialPort();
            serialPort.SetPort("/dev/ttymxc4", 57600, 2);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(serialPort.getOutputStream());
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize(serialPort.getInputStream());
            anywheresoftware.b4a.keywords.Common common = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
            return 0;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Errore nell'apertura della stampante fiscale", "Attenzione");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            return 1;
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str) throws java.lang.Exception {
        java.lang.String str2 = "000" + str;
        int length = str2.length() - 1;
        int i = 0;
        for (int i2 = 0; i2 <= length; i2++) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            i += anywheresoftware.b4a.keywords.Common.Asc(anywheresoftware.b4a.BA.ObjectToChar(str2.substring(i2, i2 + 1)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(2)))).append(str2);
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat(i % 100, 2, 0));
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Write(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(3)))).toString());
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Flush();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str, int i) throws java.lang.Exception {
        java.lang.String str2 = "000" + str;
        int length = str2.length() - 1;
        int i2 = 0;
        for (int i3 = 0; i3 <= length; i3++) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            i2 += anywheresoftware.b4a.keywords.Common.Asc(anywheresoftware.b4a.BA.ObjectToChar(str2.substring(i3, i3 + 1)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(2)))).append(str2);
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat(i2 % 100, 2, 0));
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        byte[] bArr = new byte[0];
        byte[] bytes = append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(3)))).toString().getBytes("UTF8");
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
        cassandraRisto.ital.usbpl2303 usbpl2303Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), bytes, bytes.length, i);
        return "";
    }

    public java.lang.String _read() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 2 || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length() > 12) {
                return this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(9, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length() - 3);
            }
            return this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 1) {
            java.lang.String str = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
            anywheresoftware.b4a.keywords.Common common = this.__c;
            return str.replace(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(6))), "");
        }
        return this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int i) throws java.lang.Exception {
        char[] cArr = new char[1024];
        for (int i2 = 0; i2 <= 1000; i2++) {
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Ready()) {
                int Read = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 1024);
                java.lang.StringBuilder append = new java.lang.StringBuilder().append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                anywheresoftware.b4a.keywords.Common common = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = append.append(anywheresoftware.b4a.keywords.Common.CharsToString(cArr, 0, Read)).toString();
                java.lang.String substring = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length() - 1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length());
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                if (substring.equals(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(3))))) {
                    java.lang.String str = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    java.lang.StringBuilder append2 = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(6))));
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    if (str.startsWith(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(6)))).toString())) {
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(1);
                    }
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    return true;
                }
            }
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), i);
        }
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper) throws java.lang.Exception {
        boolean z;
        int rowCount = cursorWrapper.getRowCount() - 1;
        for (int i = 0; i <= rowCount; i++) {
            cursorWrapper.setPosition(i);
            if (cursorWrapper.GetDouble("importo").doubleValue() == 0.0d) {
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_articolizero != 0) {
                    cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_articolizero != 2 && !cursorWrapper.GetString("codint").equals("888888") && !cursorWrapper.GetString("codint").equals("888889")) {
                        z = false;
                        if (cursorWrapper.GetDouble("qta").doubleValue() != 1.0d && z) {
                            anywheresoftware.b4a.keywords.Common common = this.__c;
                            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvv1(getActivityBA(), cursorWrapper.GetString("codint")))) {
                                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvv0(getActivityBA(), cursorWrapper.GetString("codint")))) {
                                    if (cursorWrapper.GetString("codint").equals("rgr") || cursorWrapper.GetDouble("qta").doubleValue() % 1.0d == 0.0d) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        anywheresoftware.b4a.keywords.Common common3 = this.__c;
                                        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.keywords.Common.NumberFormat(cursorWrapper.GetDouble("qta").doubleValue(), 1, 0)).append(" x ");
                                        anywheresoftware.b4a.keywords.Common common4 = this.__c;
                                        double doubleValue = cursorWrapper.GetDouble("prezzov").doubleValue();
                                        anywheresoftware.b4a.keywords.Common common5 = this.__c;
                                        _nf_testo(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(doubleValue, 1, 2, 2, false).replace(".", ",")).toString(), 1);
                                    } else {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        anywheresoftware.b4a.keywords.Common common6 = this.__c;
                                        double doubleValue2 = cursorWrapper.GetDouble("qta").doubleValue();
                                        anywheresoftware.b4a.keywords.Common common7 = this.__c;
                                        java.lang.StringBuilder append2 = sb2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(doubleValue2, 1, 2, 2, false)).append(" x ");
                                        anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                        double doubleValue3 = cursorWrapper.GetDouble("prezzov").doubleValue();
                                        anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                        _nf_testo(append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(doubleValue3, 1, 2, 2, false).replace(".", ",")).toString(), 1);
                                    }
                                }
                            }
                        }
                        if (!z) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA = getActivityBA();
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                            java.lang.String GetString = cursorWrapper.GetString("descrizione");
                            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.StringBuilder append3 = sb4.append(cassandraRisto.ital.modfunstr._left(activityBA2, GetString, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 + 25));
                            cassandraRisto.ital.modfunstr modfunstrVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA3 = getActivityBA();
                            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String sb5 = append3.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(activityBA3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 + 25)).toString();
                            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.StringBuilder append4 = sb3.append(cassandraRisto.ital.modfunstr._left(activityBA, sb5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 + 25));
                            cassandraRisto.ital.modfunstr modfunstrVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA4 = getActivityBA();
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            cassandraRisto.ital.modfunstr modfunstrVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append5 = sb6.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 7));
                            anywheresoftware.b4a.keywords.Common common10 = this.__c;
                            double doubleValue4 = cursorWrapper.GetDouble("importo").doubleValue();
                            anywheresoftware.b4a.keywords.Common common11 = this.__c;
                            _nf_testo(append4.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(activityBA4, append5.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(doubleValue4, 1, 2, 2, false).replace(".", ",")).toString(), 7L)).toString(), 1);
                        } else if (cursorWrapper.GetDouble("scop").doubleValue() == 100.0d) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            cassandraRisto.ital.modfunstr modfunstrVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA5 = getActivityBA();
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            cassandraRisto.ital.modfunstr modfunstrVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA6 = getActivityBA();
                            java.lang.String GetString2 = cursorWrapper.GetString("descrizione");
                            cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.StringBuilder append6 = sb8.append(cassandraRisto.ital.modfunstr._left(activityBA6, GetString2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 + 25));
                            cassandraRisto.ital.modfunstr modfunstrVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA7 = getActivityBA();
                            cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String sb9 = append6.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(activityBA7, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 + 20)).toString();
                            cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.StringBuilder append7 = sb7.append(cassandraRisto.ital.modfunstr._left(activityBA5, sb9, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 + 20));
                            cassandraRisto.ital.modfunstr modfunstrVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA8 = getActivityBA();
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                            cassandraRisto.ital.modfunstr modfunstrVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            _nf_testo(append7.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(activityBA8, sb10.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 12)).append("(Omaggio)").toString(), 12L)).toString(), 1);
                        }
                        if (cursorWrapper.GetString("memo").equals("")) {
                            _nf_testo(cursorWrapper.GetString("memo").trim(), 10);
                            _nf_testo(" ", 10);
                        }
                    }
                }
            }
            z = true;
            if (cursorWrapper.GetDouble("qta").doubleValue() != 1.0d) {
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvv1(getActivityBA(), cursorWrapper.GetString("codint")))) {
                }
            }
            if (!z) {
            }
            if (cursorWrapper.GetString("memo").equals("")) {
            }
        }
        return "";
    }

    public java.lang.String _rt_aggiungirighe(anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper, int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        if (cursorWrapper.getRowCount() > 0) {
            int rowCount = cursorWrapper.getRowCount() - 1;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 > rowCount) {
                    break;
                }
                cursorWrapper.setPosition(i3);
                java.lang.String GetString = cursorWrapper.GetString("descrizione");
                int GetInt = cursorWrapper.GetInt("reparto");
                anywheresoftware.b4a.keywords.Common common = this.__c;
                int Round2 = (int) anywheresoftware.b4a.keywords.Common.Round2(cursorWrapper.GetDouble("prezzov").doubleValue() * 100.0d, 0);
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                int Round22 = (int) anywheresoftware.b4a.keywords.Common.Round2(cursorWrapper.GetDouble("qta").doubleValue() * 1000.0d, 0);
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                int Round23 = (int) anywheresoftware.b4a.keywords.Common.Round2(cursorWrapper.GetDouble("prezzov").doubleValue() * cursorWrapper.GetDouble("qta").doubleValue() * 100.0d, 0);
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                int Round24 = (int) anywheresoftware.b4a.keywords.Common.Round2(cursorWrapper.GetDouble("scov").doubleValue() * 100.0d, 0);
                boolean z = cursorWrapper.GetString("codint").equals("com") || cursorWrapper.GetString("codint").equals("abb") || cursorWrapper.GetString("codint").equals("pre") || cursorWrapper.GetString("codint").equals("rgr");
                double doubleValue = cursorWrapper.GetDouble("scop").doubleValue();
                int GetInt2 = cursorWrapper.GetInt("iva");
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                _sf_vendita(GetString, GetInt, Round2, Round22, Round23, Round24, z, doubleValue, GetInt2, "", cassandraRisto.ital.main._sc_sconto);
                i2 = i3 + 1;
            }
        } else {
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _sf_vendita("Nessun articolo", 1, 0, 1, 0, 0, false, 0.0d, 1, "", cassandraRisto.ital.main._sc_sconto);
        }
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        _sf_pagamento("Contanti", i, false, 0, true, 0);
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3011", 1) == 0 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3013", 1) != 0) {
            return "";
        }
        return "";
    }

    public java.lang.String _rt_annulladocumento(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) throws java.lang.Exception {
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        if (!str5.equals("") && str5.length() == 8) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("7101A");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str2)).append("");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str3)).append("0");
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str4)).append("08");
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str5)).append("").toString(), 1);
        } else {
            java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("7101A");
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("");
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            java.lang.StringBuilder append8 = append7.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str2)).append("");
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str3)).append("0");
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append9.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str4)).append("").toString(), 1);
        }
        anywheresoftware.b4a.keywords.Common common11 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 != 0) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("71010", 1);
            return "Il documento non può essere annullato";
        }
        if (!str4.equals("")) {
            return "";
        }
        java.lang.String _read = _read();
        if (_read.equals("1")) {
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Attendere ... Ricerca nella memoria di dettaglio in corso ...");
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA, ObjectToCharSequence, true);
            anywheresoftware.b4a.keywords.Common common15 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common16 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            java.lang.StringBuilder append10 = new java.lang.StringBuilder().append("7101A");
            anywheresoftware.b4a.keywords.Common common17 = this.__c;
            java.lang.StringBuilder append11 = append10.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("");
            anywheresoftware.b4a.keywords.Common common18 = this.__c;
            java.lang.StringBuilder append12 = append11.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str2)).append("");
            anywheresoftware.b4a.keywords.Common common19 = this.__c;
            java.lang.StringBuilder append13 = append12.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str3)).append("1");
            anywheresoftware.b4a.keywords.Common common20 = this.__c;
            int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append13.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str4)).append("").toString(), 1);
            anywheresoftware.b4a.keywords.Common common21 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            anywheresoftware.b4a.keywords.Common common22 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 != 0) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("71010", 1);
                return "Il documento non può essere annullato";
            }
            return _read;
        }
        if (_read.equals("2")) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("71010", 1);
            return "Documento non trovato o già annullato";
        }
        return _read;
    }

    public java.lang.String _rt_annulladocumento2(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(str2);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("7114A");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        double length = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length();
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false))).append("");
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append("");
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString(), 1);
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 != 0) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("71010", 1);
            return "Il documento non può essere annullato";
        }
        return "";
    }

    public int _rt_attivadisattivalotteria(boolean z) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return 0;
        }
        java.lang.String str = "1";
        if (z) {
            str = "0";
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("6607");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("000000").toString(), 1);
    }

    public java.lang.String _rt_checkzpending() throws java.lang.Exception {
        java.lang.String str;
        java.lang.String str2;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
        java.lang.String substring = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.substring(1, 5);
        java.lang.String substring2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.substring(5, 9);
        if (!substring.equals("0000") || !substring2.equals("0000")) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("");
            if (substring.equals("0000")) {
                str = "";
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                str = sb.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(getActivityBA(), substring))).append(" chiusure scartate dal server AE").toString();
            }
            java.lang.String sb2 = append.append(anywheresoftware.b4a.BA.ObjectToString(str)).toString();
            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(sb2);
            if (substring2.equals("0000")) {
                str2 = "";
            } else {
                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(anywheresoftware.b4a.BA.ObjectToString(!sb2.equals("") ? " e " : ""));
                cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                str2 = append3.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(getActivityBA(), substring2))).append(" chiusure non inviate al server AE").toString();
            }
            java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Esistono ").append(append2.append(anywheresoftware.b4a.BA.ObjectToString(str2)).toString());
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.String sb3 = append4.append("\n").append("Si desidera tentare l'invio ?").toString();
            cassandraRisto.ital.modfunstr modfunstrVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(getActivityBA(), substring);
            cassandraRisto.ital.modfunstr modfunstrVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(getActivityBA(), substring2) + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 == 1.0d) {
                return sb3.replace("Esistono", "Esiste").replace("chiusure scartate", "chiusura scartata").replace("chiusure non inviate", "chiusura non inviata");
            }
            return sb3;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[LOOP:0: B:14:0x0084->B:29:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4 A[EDGE_INSN: B:30:0x00d4->B:31:0x00d4 BREAK  A[LOOP:0: B:14:0x0084->B:29:0x0083], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _rt_countfileinfolder(java.lang.String str) throws java.lang.Exception {
        java.lang.Exception e;
        boolean z;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return 0;
        }
        try {
            if (!str.equals("")) {
                anywheresoftware.b4a.keywords.Common common = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("7410");
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(getActivityBA(), anywheresoftware.b4a.BA.NumberToString(str.length()), 3, anywheresoftware.b4a.BA.ObjectToChar("0"))).append(str).toString(), 1) > 0) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7412", 1);
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                } else {
                    ?? r2 = 0;
                    while (true) {
                        try {
                            anywheresoftware.b4a.keywords.Common common3 = this.__c;
                            java.lang.String upperCase = _read().toUpperCase();
                            anywheresoftware.b4a.keywords.Common common4 = this.__c;
                            try {
                                if (anywheresoftware.b4a.keywords.Common.Not(upperCase.contains("R_"))) {
                                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                                    if (anywheresoftware.b4a.keywords.Common.Not(upperCase.contains("TEC"))) {
                                        anywheresoftware.b4a.keywords.Common common6 = this.__c;
                                        if (anywheresoftware.b4a.keywords.Common.Not(upperCase.contains("SIM")) && upperCase.contains("_Z") && upperCase.endsWith(".XML")) {
                                            z = r2 + 1;
                                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7411", 1) <= 0) {
                                                break;
                                            }
                                            r2 = z;
                                        }
                                    }
                                }
                                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7411", 1) <= 0) {
                                }
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                this.ba.setLastException(e);
                                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.BA activityBA = getActivityBA();
                                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7412", 1);
                                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = z2;
                                return z;
                            }
                            z = r2;
                        } catch (java.lang.Exception e3) {
                            z = r2;
                            e = e3;
                        }
                    }
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7412", 1);
                    anywheresoftware.b4a.keywords.Common common9 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                    z2 = z;
                }
            } else {
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            }
            return z2 ? 1 : 0;
        } catch (java.lang.Exception e4) {
            e = e4;
            z = z2 ? 1 : 0;
        }
    }

    public java.lang.String _rt_disattivaarrotondamento() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 >= 7 && !this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("60000053", 1) <= 0) {
            try {
                if (_read().equals("00530011")) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("600000530010", 1);
                }
            } catch (java.lang.Exception e) {
                this.ba.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                anywheresoftware.b4a.keywords.Common common = this.__c;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
            }
            return "";
        }
        return "";
    }

    public int _rt_leggidocsospesilotteria() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return (int) java.lang.Double.parseDouble("");
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1518", 1) != 0) {
            return -1;
        }
        java.lang.String _read = _read();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        if (!anywheresoftware.b4a.keywords.Common.IsNumber(_read)) {
            return -1;
        }
        return (int) java.lang.Double.parseDouble(_read);
    }

    public int _rt_leggistato(boolean z) throws java.lang.Exception {
        java.lang.Exception e;
        int i;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return 0;
        }
        try {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            if (z && (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 1 || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 2)) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
            }
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
            i = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("15111", 36);
            try {
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                if (i == 0) {
                    java.lang.String _read = _read();
                    if (_read.length() >= 33) {
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _read.substring(1, 12);
                        if (_read.substring(22, 26).equals("1110") && _read.substring(34, 35).equals("0")) {
                            anywheresoftware.b4a.keywords.Common common4 = this.__c;
                            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = anywheresoftware.b4a.keywords.DateTime.DateTimeParse(_read.substring(28, 30) + "/" + _read.substring(26, 28) + "/20" + _read.substring(30, 32), "00:00:00");
                            anywheresoftware.b4a.keywords.Common common5 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(false);
                        } else if (_read.substring(22, 26).equals("1110") && _read.substring(34, 35).equals("1")) {
                            _read = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0L;
                            anywheresoftware.b4a.keywords.Common common6 = this.__c;
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
                        }
                        if (_read.length() >= 33) {
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _read.substring(22, 26).equals("1111");
                        }
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.generateChiavi = _read.substring(22, 23).equals("1");
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Censita = _read.substring(23, 24).equals("1");
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Attivazione = _read.substring(24, 25).equals("1");
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.InService = _read.substring(25, 26).equals("1");
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.InServiceDa = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        _rt_verificaversionexml();
                        _rt_disattivaarrotondamento();
                    }
                    if (_read.length() >= 53 && _read.substring(52, 53).equals("1")) {
                        anywheresoftware.b4a.keywords.Common common7 = this.__c;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = true;
                    }
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                this.ba.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                return i;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            i = 0;
        }
        anywheresoftware.b4a.keywords.Common common92 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [anywheresoftware.b4a.keywords.Common] */
    /* JADX WARN: Type inference failed for: r1v6, types: [anywheresoftware.b4a.keywords.Common] */
    /* JADX WARN: Type inference failed for: r1v7, types: [anywheresoftware.b4a.keywords.Common] */
    public boolean _rt_mf2xml(java.lang.String str, int i) throws java.lang.Exception {
        int parseDouble;
        int i2 = 1;
        i2 = 1;
        boolean z = false;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
        } else {
            try {
                if (!str.equals("")) {
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("7410");
                    cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(getActivityBA(), anywheresoftware.b4a.BA.NumberToString(str.length()), 3, anywheresoftware.b4a.BA.ObjectToChar("0"))).append(str).toString(), 1) > 0) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7412", 1);
                        anywheresoftware.b4a.keywords.Common common3 = this.__c;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                        i2 = this.__c;
                    } else {
                        while (true) {
                            anywheresoftware.b4a.keywords.Common common4 = this.__c;
                            java.lang.String upperCase = _read().toUpperCase();
                            anywheresoftware.b4a.keywords.Common common5 = this.__c;
                            if (anywheresoftware.b4a.keywords.Common.Not(upperCase.contains("R_"))) {
                                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                                if (anywheresoftware.b4a.keywords.Common.Not(upperCase.contains("TEC"))) {
                                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                                    if (anywheresoftware.b4a.keywords.Common.Not(upperCase.contains("SIM")) && upperCase.contains("_Z") && upperCase.endsWith(".XML") && (parseDouble = (int) java.lang.Double.parseDouble(upperCase.substring(17, 21))) == i) {
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str + "\\" + upperCase.substring(3), parseDouble);
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7412", 1);
                                        anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                                        anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7411", 1) > 0) {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7412", 1);
                                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                                i2 = this.__c;
                                break;
                            }
                        }
                    }
                } else {
                    i2 = this.__c;
                }
            } catch (java.lang.Exception e) {
                this.ba.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("7412", i2);
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = z;
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
            }
        }
        return z;
    }

    public java.lang.String _rt_sendzpending() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        try {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verifica collegamento con il server AE in corso ...");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA, ObjectToCharSequence, false);
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA2, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1516", 1) > 0) {
            return "";
        }
        if (!_read().substring(0, 1).equals("0")) {
            return "Il server AE non è raggiungibile";
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("6403", 1) > 0) {
            return "";
        }
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.BA activityBA3 = getActivityBA();
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Tentativo di invio dati al server in corso");
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA3, ObjectToCharSequence2, false);
        for (int i = 0; i <= 10; i++) {
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
            java.lang.String substring = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.substring(1, 5);
            java.lang.String substring2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.substring(5, 9);
            if (substring.equals("0000") && substring2.equals("0000")) {
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                anywheresoftware.b4a.BA ba = this.ba;
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "I dati sono stati inviati al server AE");
                return "";
            }
            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 1000);
        }
        anywheresoftware.b4a.keywords.Common common12 = this.__c;
        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        return "";
    }

    public boolean _rt_setinmagazzino() throws java.lang.Exception {
        boolean z;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        try {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Sospensione temporanea sul server AE in corso ...");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA, ObjectToCharSequence, false);
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA2, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
        }
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("640210060809MAGAZZINO", 1) == 0) {
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            z = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(true);
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            return z;
        }
        z = false;
        anywheresoftware.b4a.keywords.Common common92 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        anywheresoftware.b4a.keywords.Common common102 = this.__c;
        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        return z;
    }

    public int _rt_verificamagazzino() throws java.lang.Exception {
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                anywheresoftware.b4a.keywords.Common common = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1510", 1);
                try {
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 <= 0) {
                        java.lang.String _read = _read();
                        if (_read.substring(24, 27).equals("200") && _read.substring(1, 20).trim().equals("FUORI_SERVIZIO")) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = -1;
                        }
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == -1;
                        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    }
                    return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                } catch (java.lang.Exception e) {
                    this.ba.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA activityBA = getActivityBA();
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
                    return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                }
            }
        }
        return 0;
    }

    public int _rt_verificaversionexml() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return 0;
        }
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1512", 1);
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 <= 0) {
            try {
                java.lang.String _read = _read();
                if (_read.length() > 2) {
                    return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                }
                anywheresoftware.b4a.keywords.Common common = this.__c;
                if (anywheresoftware.b4a.keywords.Common.IsNumber(_read)) {
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (java.lang.Double.parseDouble(_read) + 6.0d);
                    return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                }
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
            } catch (java.lang.Exception e) {
                this.ba.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
            }
        }
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
    }

    public java.lang.String _sck_connected(boolean z) throws java.lang.Exception {
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str, int i) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str, i, true);
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, int i, boolean z) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        if (str.length() > 0) {
            int length = str.length();
            for (int i2 = 1; i2 <= length; i2++) {
                char charAt = str.charAt(i2 - 1);
                anywheresoftware.b4a.keywords.Common common = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Asc(charAt) >= 33) {
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Asc(charAt) <= 90) {
                        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(charAt)));
                    }
                }
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Asc(charAt) >= 97) {
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Asc(charAt) <= 122) {
                        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(charAt)));
                    }
                }
                switch (anywheresoftware.b4a.BA.switchObjectToInt(java.lang.Character.valueOf(charAt), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("è")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("é")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("à")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ì")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ò")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ù")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("À")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Á")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("È")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("É")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ì")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Í")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ò")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ó")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ù")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ú")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("€")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("´")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("`")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("_")))) {
                    case 0:
                    case 1:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("e");
                        break;
                    case 2:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("a");
                        break;
                    case 3:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("i");
                        break;
                    case 4:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("o");
                        break;
                    case 5:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("u");
                        break;
                    case 6:
                    case 7:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("A");
                        break;
                    case 8:
                    case 9:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("E");
                        break;
                    case 10:
                    case 11:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("I");
                        break;
                    case 12:
                    case 13:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("O");
                        break;
                    case 14:
                    case 15:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("U");
                        break;
                    case 16:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("E");
                        break;
                    case 17:
                    case 18:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("'");
                        break;
                    case 19:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar("_");
                        break;
                    default:
                        charAt = anywheresoftware.b4a.BA.ObjectToChar(" ");
                        break;
                }
                stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(charAt)));
            }
            if (z) {
                while (stringBuilderWrapper.ToString().toUpperCase().contains("TOTALE")) {
                    int indexOf = stringBuilderWrapper.ToString().toUpperCase().indexOf("TOTALE") + 5;
                    stringBuilderWrapper.Remove(indexOf, indexOf + 1);
                    stringBuilderWrapper.Insert(indexOf, ".");
                }
            }
        }
        java.lang.String ToString = stringBuilderWrapper.ToString();
        if (ToString.length() > i) {
            return ToString.substring(0, i);
        }
        return ToString;
    }

    public int _sf_apri(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return 0;
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize();
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = true;
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("30161", 1);
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0) {
            int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3002101 ", 1);
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 && !str3.equals("") && str3.trim().length() == 8) {
                int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv73 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("301908" + str3.trim(), 1);
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv73 == 0) {
                    cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_matricola.startsWith("ST") && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 0) {
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2++;
                        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv73;
                    }
                    return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv73;
                }
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv73;
            }
            if (!str.equals("")) {
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) {
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("3010F");
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    double length = str.length();
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv74 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str.toUpperCase(), 16)).toString(), 1);
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv74 != 0) {
                    }
                    return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv74;
                }
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("3010B");
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    double length2 = str.length();
                    anywheresoftware.b4a.keywords.Common common8 = this.__c;
                    int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv75 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length2, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str.toUpperCase(), 16)).toString(), 1);
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv75 != 0) {
                    }
                    return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv75;
                }
                int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv76 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3002122 *********************", 1);
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv76 == 0) {
                    int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv77 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3002122   COD.FIS. / P.IVA   ", 1);
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv77 == 0) {
                        java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("30021");
                        anywheresoftware.b4a.keywords.Common common9 = this.__c;
                        double length3 = str.length() + 3;
                        anywheresoftware.b4a.keywords.Common common10 = this.__c;
                        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv78 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append3.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length3, 2, 0, 0, false)).append("   ").append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str.toUpperCase(), 16)).toString(), 1);
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv78 == 0) {
                            int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv79 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3002122 *********************", 1);
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv79 != 0) {
                            }
                            return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv79;
                        }
                        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv78;
                    }
                    return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv77;
                }
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv76;
            }
            return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72;
        }
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
    }

    public int _sf_barcode(java.lang.String str, int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return 0;
        }
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 40);
        if (i < 1 || i > 5) {
            i = 4;
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.equals("")) {
            return 0;
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("3021").append(anywheresoftware.b4a.BA.NumberToString(i)).append("25 ");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        double length = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3).toString(), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Not(r14._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _sf_chiudi(boolean z) throws java.lang.Exception {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String substring;
        java.lang.String str5;
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
        java.lang.String str6;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        int i = 0;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
            int size = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getSize() - 1;
            for (int i2 = 0; i2 <= size; i2++) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA.ObjectToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Get(i2)), 1);
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5();
        }
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
            i = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3011", 1);
        }
        if (i != 0) {
            return "";
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 != 0) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("ARROTOND. DL 50/2017  ");
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            java.lang.String sb = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 / 100.0d, 1, 2, 2, false)).toString();
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("30121" + anywheresoftware.b4a.BA.NumberToString(sb.length()) + sb, 1);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3013", 1) != 0) {
            return "";
        }
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Initialize();
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                java.lang.String _mf_leggidataora = _mf_leggidataora();
                if (_mf_leggidataora.length() == 10) {
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.DataeOraMF = _mf_leggidataora.substring(2, 4) + "/" + _mf_leggidataora.substring(0, 2) + "/20" + _mf_leggidataora.substring(4, 6) + " " + _mf_leggidataora.substring(6, 8) + ":" + _mf_leggidataora.substring(8, 10);
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.nScontrino = _mf_leggilastscontr();
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.nChiusura = _mf_leggilastz();
                }
            }
            if (z && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized() && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getSize() > 0) {
                anywheresoftware.b4a.objects.collections.List list = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                list.SortType("tScontrino", true);
                anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
                list2.Initialize();
                java.lang.String str7 = "";
                int size2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getSize() - 1;
                int i3 = 0;
                while (i3 <= size2) {
                    cassandraRisto.ital.ccefdll._tresort _tresortVar = (cassandraRisto.ital.ccefdll._tresort) this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(i3);
                    if (i3 <= 0 || !_tresortVar.tScontrino.equals(str7)) {
                        str6 = _tresortVar.tScontrino;
                        list2.Add(str6);
                    } else {
                        str6 = str7;
                    }
                    i3++;
                    str7 = str6;
                }
                int size3 = list2.getSize() - 1;
                for (int i4 = 0; i4 <= size3; i4++) {
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(list2.Get(i4));
                    boolean contains = ObjectToString.contains("Doc.N._");
                    if (ObjectToString.contains("Doc.N.")) {
                        java.lang.String str8 = "";
                        if (contains) {
                            java.lang.String replace = ObjectToString.substring(ObjectToString.indexOf("Doc.N._")).replace("Doc.N._", "");
                            str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(replace.substring(0, replace.indexOf(" del ")));
                            str2 = "";
                            str3 = "";
                            str4 = replace.substring(replace.indexOf(" del ")).replace(" del ", "");
                        } else {
                            java.lang.String replace2 = ObjectToString.substring(ObjectToString.indexOf("Doc.N.")).replace("Doc.N.", "");
                            cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(getActivityBA(), "0000" + replace2.substring(0, replace2.indexOf("-")), 4L);
                            java.lang.String replace3 = replace2.substring(replace2.indexOf("-")).replace("-", "");
                            cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 = cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(getActivityBA(), "0000" + replace3.substring(0, replace3.indexOf(" del ")), 4L);
                            java.lang.String replace4 = replace3.substring(replace3.indexOf(" del ")).replace(" del ", "");
                            if (replace4.contains("Matricola") && replace4.contains("Lotteria")) {
                                str8 = replace4.substring(replace4.indexOf(" Lotteria ")).replace(" Lotteria ", "");
                                str = replace4.substring(replace4.indexOf(" Matricola "), replace4.indexOf(" Lotteria ")).replace(" Matricola ", "");
                                str2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72;
                                str3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                                str4 = replace4.substring(0, replace4.indexOf(" Matricola "));
                            } else if (!replace4.contains("Matricola")) {
                                str = "";
                                str2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72;
                                str3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                                str4 = replace4;
                            } else {
                                str = replace4.substring(replace4.indexOf(" Matricola ")).replace(" Matricola ", "");
                                str2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72;
                                str3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                                str4 = replace4.substring(0, replace4.indexOf(" Matricola "));
                            }
                        }
                        if (str4.equals("")) {
                            substring = "00000000";
                        } else {
                            substring = str4.replace("/", "").substring(0, 8);
                        }
                        java.lang.String str9 = substring.substring(0, 4) + substring.substring(6);
                        anywheresoftware.b4a.keywords.Common common9 = this.__c;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                        anywheresoftware.b4a.keywords.Common common10 = this.__c;
                        anywheresoftware.b4a.BA activityBA = getActivityBA();
                        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Attendere ... Ricerca nella memoria di dettaglio in corso ...");
                        anywheresoftware.b4a.keywords.Common common11 = this.__c;
                        anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA, ObjectToCharSequence, true);
                        anywheresoftware.b4a.keywords.Common common12 = this.__c;
                        anywheresoftware.b4a.keywords.Common.DoEvents();
                        anywheresoftware.b4a.keywords.Common common13 = this.__c;
                        anywheresoftware.b4a.keywords.Common.DoEvents();
                        if (contains) {
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("7114R");
                            anywheresoftware.b4a.keywords.Common common14 = this.__c;
                            anywheresoftware.b4a.keywords.Common common15 = this.__c;
                            double length = str.length();
                            anywheresoftware.b4a.keywords.Common common16 = this.__c;
                            java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false))).append("");
                            anywheresoftware.b4a.keywords.Common common17 = this.__c;
                            java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("");
                            anywheresoftware.b4a.keywords.Common common18 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append4.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str9)).append("").toString(), 1);
                        } else {
                            if (str.equals("")) {
                                str5 = "";
                            } else {
                                java.lang.String str10 = anywheresoftware.b4a.BA.NumberToString(str.length()) + str;
                                if (!str8.equals("") && str8.length() == 8) {
                                    java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("");
                                    anywheresoftware.b4a.keywords.Common common19 = this.__c;
                                    java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str10)).append("08");
                                    anywheresoftware.b4a.keywords.Common common20 = this.__c;
                                    str5 = append6.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str8)).append("").toString();
                                } else {
                                    java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("");
                                    anywheresoftware.b4a.keywords.Common common21 = this.__c;
                                    str5 = append7.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str10)).append("").toString();
                                }
                            }
                            java.lang.StringBuilder append8 = new java.lang.StringBuilder().append("7101R");
                            anywheresoftware.b4a.keywords.Common common22 = this.__c;
                            java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str3)).append("");
                            anywheresoftware.b4a.keywords.Common common23 = this.__c;
                            java.lang.StringBuilder append10 = append9.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str2)).append("");
                            anywheresoftware.b4a.keywords.Common common24 = this.__c;
                            java.lang.StringBuilder append11 = append10.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str9)).append("1");
                            anywheresoftware.b4a.keywords.Common common25 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append11.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str5)).append("").toString(), 1);
                        }
                        anywheresoftware.b4a.keywords.Common common26 = this.__c;
                        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
                        anywheresoftware.b4a.keywords.Common common27 = this.__c;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 > 0) {
                            anywheresoftware.b4a.keywords.Common common28 = this.__c;
                            anywheresoftware.b4a.BA ba = this.ba;
                            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Reso non consentito su questo documento (Errore " + anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) + ")");
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("71010", 1);
                            return "";
                        }
                        if (_read().equals(anywheresoftware.b4a.BA.NumberToString(2))) {
                            anywheresoftware.b4a.keywords.Common common29 = this.__c;
                            anywheresoftware.b4a.BA ba2 = this.ba;
                            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Reso non consentito su questo documento");
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("71010", 1);
                            return "";
                        }
                        int size4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getSize() - 1;
                        for (int i5 = 0; i5 <= size4; i5++) {
                            cassandraRisto.ital.ccefdll._tresort _tresortVar2 = (cassandraRisto.ital.ccefdll._tresort) this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(i5);
                            if (_tresortVar2.tScontrino.equals(anywheresoftware.b4a.BA.ObjectToString(list2.Get(i4)))) {
                                java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("33011");
                                anywheresoftware.b4a.keywords.Common common30 = this.__c;
                                anywheresoftware.b4a.keywords.Common common31 = this.__c;
                                anywheresoftware.b4a.keywords.Common common32 = this.__c;
                                double Abs = anywheresoftware.b4a.keywords.Common.Abs(_tresortVar2.tQta1000);
                                anywheresoftware.b4a.keywords.Common common33 = this.__c;
                                java.lang.StringBuilder append13 = append12.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(Abs, 9, 0, 0, false))).append("001");
                                anywheresoftware.b4a.keywords.Common common34 = this.__c;
                                anywheresoftware.b4a.keywords.Common common35 = this.__c;
                                double length2 = _tresortVar2.tDescrizione.length();
                                anywheresoftware.b4a.keywords.Common common36 = this.__c;
                                java.lang.StringBuilder append14 = append13.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(length2, 2, 0, 0, false))).append("");
                                anywheresoftware.b4a.keywords.Common common37 = this.__c;
                                java.lang.StringBuilder append15 = append14.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _tresortVar2.tDescrizione)).append("");
                                anywheresoftware.b4a.keywords.Common common38 = this.__c;
                                anywheresoftware.b4a.keywords.Common common39 = this.__c;
                                double d = _tresortVar2.tPrezzoUnitarioLordo100;
                                anywheresoftware.b4a.keywords.Common common40 = this.__c;
                                java.lang.StringBuilder append16 = append15.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(d, 9, 0, 0, false))).append("");
                                anywheresoftware.b4a.keywords.Common common41 = this.__c;
                                anywheresoftware.b4a.keywords.Common common42 = this.__c;
                                double d2 = _tresortVar2.tIvaRT;
                                anywheresoftware.b4a.keywords.Common common43 = this.__c;
                                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append16.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(d2, 2, 0, 0, false))).append("").toString(), 1) != 0) {
                                    return "";
                                }
                            }
                        }
                    }
                    if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
                        int size5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getSize() - 1;
                        int i6 = 0;
                        while (true) {
                            if (i6 > size5) {
                                break;
                            }
                            java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Get(i6));
                            if (!ObjectToString2.startsWith("3010")) {
                                i6++;
                            } else {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ObjectToString2, 1);
                                break;
                            }
                        }
                    }
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3011", 1) != 0) {
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
                        return "";
                    }
                    anywheresoftware.b4a.keywords.Common common44 = this.__c;
                    anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                    java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Attendere ... aggiornamento memoria di dettaglio in corso ...");
                    anywheresoftware.b4a.keywords.Common common45 = this.__c;
                    anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA2, ObjectToCharSequence2, false);
                    anywheresoftware.b4a.keywords.Common common46 = this.__c;
                    anywheresoftware.b4a.keywords.Common.DoEvents();
                    anywheresoftware.b4a.keywords.Common common47 = this.__c;
                    anywheresoftware.b4a.keywords.Common.DoEvents();
                    int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3013", 1);
                    anywheresoftware.b4a.keywords.Common common48 = this.__c;
                    anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 != 0) {
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
                        return "";
                    }
                }
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize();
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize();
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
            anywheresoftware.b4a.keywords.Common common49 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        }
        anywheresoftware.b4a.keywords.Common common50 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        return "";
    }

    public java.lang.String _sf_cortesia(java.lang.String str, int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5();
        java.lang.String str2 = "";
        java.lang.String str3 = " ";
        if (str.toLowerCase().startsWith("logo") && str.length() <= 6) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (anywheresoftware.b4a.keywords.Common.IsNumber(str.substring(4))) {
                str2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) java.lang.Double.parseDouble(str.substring(4)));
            }
        }
        if (str2.equals("")) {
            int i2 = 32;
            if (i == 5) {
                i2 = 16;
            }
            if (i == 3) {
                i2 = 42;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), (int) ((i2 - r3.length()) / 2.0d))).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, i2).trim()).toString();
            cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            java.lang.StringBuilder append = new java.lang.StringBuilder().append(sb2);
            cassandraRisto.ital.modfunstr modfunstrVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            str3 = cassandraRisto.ital.modfunstr._left(activityBA, append.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), i2)).toString(), i2);
            if (i < 1 || i > 6) {
                i = 6;
            }
        }
        if (str.equals("")) {
            return "";
        }
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3011", 1);
        }
        if (!str2.equals("")) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3017" + str2, 1);
        } else {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3012" + anywheresoftware.b4a.BA.NumberToString(i) + anywheresoftware.b4a.BA.NumberToString(str3.length()) + str3, 1);
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = true;
        return "";
    }

    public java.lang.String _sf_pagamento(java.lang.String str, int i, boolean z, int i2, boolean z2, int i3) throws java.lang.Exception {
        java.lang.String str2;
        java.lang.String str3;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 22);
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 && z2 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized() && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() > 0) {
            double d = 0.0d;
            boolean z3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() > 1;
            if (z3) {
                try {
                    int size = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() - 1;
                    int i4 = 0;
                    java.lang.String str4 = "";
                    for (int i5 = 0; i5 <= size; i5++) {
                        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get(i5));
                        if (z3) {
                            cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA activityBA = getActivityBA();
                            cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.String _left = cassandraRisto.ital.modfunstr._left(activityBA, cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(getActivityBA(), ObjectToString, 11L), 9L);
                            anywheresoftware.b4a.keywords.Common common = this.__c;
                            anywheresoftware.b4a.keywords.Common common2 = this.__c;
                            if (!anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(_left))) {
                                d += java.lang.Double.parseDouble(_left);
                                str4 = ObjectToString.substring(19, ((int) java.lang.Double.parseDouble(ObjectToString.substring(17, 19))) + 19);
                                i4++;
                            }
                        }
                    }
                    if (d > 0.0d && i4 > 1) {
                        java.lang.StringBuilder append = new java.lang.StringBuilder().append(str4).append(" Euro ");
                        anywheresoftware.b4a.keywords.Common common3 = this.__c;
                        anywheresoftware.b4a.keywords.Common common4 = this.__c;
                        _sf_testo(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(d / 100.0d, 1, 2, 2, false)).append(" suddiviso in:").toString(), 1);
                    }
                } catch (java.lang.Exception e) {
                    this.ba.setLastException(e);
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    java.lang.String message = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(message, true);
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3003", 1);
            int size2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() - 1;
            for (int i6 = 0; i6 <= size2 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA.ObjectToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get(i6)), 1) <= 0; i6++) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3003", 1);
            }
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 || z) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3003", 1);
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setPosition(i2);
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            boolean z4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") == 5 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 >= 7;
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 < 7) {
                if (z && z2) {
                    i = 0;
                }
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized() && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getSize() > 0) {
                    i = 0;
                }
            }
            cassandraRisto.ital.modfunstr modfunstrVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String _left2 = cassandraRisto.ital.modfunstr._left(activityBA2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("descrizione"), 22L);
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            double length = _left2.length();
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            java.lang.String NumberFormat2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false);
            boolean z5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized() && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.equals("Arrot.") && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 >= 7;
            if (z5) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = i * (-1);
            }
            if (z5 && i2 == 0) {
                anywheresoftware.b4a.objects.collections.List list = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("302700000000");
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                list.Add(append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(i))).append("").toString());
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = i;
            } else if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized()) {
                if (!z4) {
                    str3 = "00";
                } else {
                    anywheresoftware.b4a.keywords.Common common10 = this.__c;
                    anywheresoftware.b4a.keywords.Common common11 = this.__c;
                    str3 = anywheresoftware.b4a.keywords.Common.NumberFormat2(i3, 2, 0, 0, false);
                }
                cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int GetInt = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento");
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 >= 7 && GetInt >= 10) {
                    GetInt += 39;
                }
                anywheresoftware.b4a.objects.collections.List list2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("3007");
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(GetInt, 2, 0, 0, false))).append("");
                anywheresoftware.b4a.keywords.Common common15 = this.__c;
                java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str3)).append("");
                anywheresoftware.b4a.keywords.Common common16 = this.__c;
                java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", NumberFormat2)).append("");
                anywheresoftware.b4a.keywords.Common common17 = this.__c;
                java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _left2)).append("");
                anywheresoftware.b4a.keywords.Common common18 = this.__c;
                anywheresoftware.b4a.keywords.Common common19 = this.__c;
                anywheresoftware.b4a.keywords.Common common20 = this.__c;
                list2.Add(append7.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(i, 9, 0, 0, false))).append("").toString());
            }
        } else {
            if (z && z2) {
                i = 0;
            }
            if (z) {
                str2 = "3005";
            } else {
                str2 = "3004";
            }
            java.lang.StringBuilder append8 = new java.lang.StringBuilder().append(str2);
            anywheresoftware.b4a.keywords.Common common21 = this.__c;
            double length2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
            anywheresoftware.b4a.keywords.Common common22 = this.__c;
            java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length2, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
            anywheresoftware.b4a.keywords.Common common23 = this.__c;
            anywheresoftware.b4a.keywords.Common common24 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append9.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i, 9, 0, 0, false)).toString(), 11);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ee A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _sf_sconto(int i, double d, int i2, int i3) throws java.lang.Exception {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj;
        double d2;
        java.lang.Object obj2;
        java.lang.String str3;
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        if (d >= 0.0d) {
            str = "30013";
            str2 = "SCONTO ";
            obj = "33013";
            d2 = d;
        } else {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            str = "30012";
            str2 = "SERVIZIO ";
            obj = "33012";
            d2 = anywheresoftware.b4a.keywords.Common.Abs(d);
        }
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (i3 == cassandraRisto.ital.main._sc_omaggio) {
            str2 = "OMAGGIO ";
            obj2 = "3301G";
        } else {
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (i3 == cassandraRisto.ital.main._sc_giapagato) {
                str2 = "GIA' RISCOSSO ";
                obj2 = "3301F";
            } else {
                obj2 = obj;
            }
        }
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        int Abs = anywheresoftware.b4a.keywords.Common.Abs(i);
        if (d2 > 0.0d) {
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (i3 == cassandraRisto.ital.main._sc_sconto) {
                if ((1000.0d * d2) % 1000.0d == 0.0d) {
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append(str2);
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    str3 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(d2, 1, 0, 0, false)).append(" Perc.").toString();
                } else {
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(str2);
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    str3 = append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(d2, 1, 2, 2, false)).append(" Perc.").toString();
                }
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                if (!anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                    java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(str);
                    anywheresoftware.b4a.keywords.Common common8 = this.__c;
                    double length = str3.length();
                    anywheresoftware.b4a.keywords.Common common9 = this.__c;
                    java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(str3);
                    anywheresoftware.b4a.keywords.Common common10 = this.__c;
                    anywheresoftware.b4a.keywords.Common common11 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append4.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(Abs, 9, 0, 0, false)).toString(), 1);
                } else {
                    cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(i2);
                    cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.BA activityBA = getActivityBA();
                    java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("00");
                    cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(activityBA, append5.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("RTIva")).toString(), 2L);
                    java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("");
                    anywheresoftware.b4a.keywords.Common common12 = this.__c;
                    java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", obj2)).append("");
                    anywheresoftware.b4a.keywords.Common common13 = this.__c;
                    anywheresoftware.b4a.keywords.Common common14 = this.__c;
                    anywheresoftware.b4a.keywords.Common common15 = this.__c;
                    java.lang.StringBuilder append8 = append7.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(1.0d, 9, 0, 0, false))).append("001");
                    anywheresoftware.b4a.keywords.Common common16 = this.__c;
                    anywheresoftware.b4a.keywords.Common common17 = this.__c;
                    double length2 = str3.length();
                    anywheresoftware.b4a.keywords.Common common18 = this.__c;
                    java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(length2, 2, 0, 0, false))).append("");
                    anywheresoftware.b4a.keywords.Common common19 = this.__c;
                    java.lang.StringBuilder append10 = append9.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str3)).append("");
                    anywheresoftware.b4a.keywords.Common common20 = this.__c;
                    anywheresoftware.b4a.keywords.Common common21 = this.__c;
                    anywheresoftware.b4a.keywords.Common common22 = this.__c;
                    java.lang.StringBuilder append11 = append10.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(Abs, 9, 0, 0, false))).append("");
                    anywheresoftware.b4a.keywords.Common common23 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append11.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)).append("").toString(), 1);
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3003", 1);
                }
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0) {
                    return "";
                }
                return "";
            }
        }
        str3 = str2;
        anywheresoftware.b4a.keywords.Common common72 = this.__c;
        if (!anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0) {
        }
    }

    public java.lang.String _sf_testo(java.lang.String str, int i) throws java.lang.Exception {
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        if (i < 1 || i > 9) {
            i = 1;
        }
        if (i < 7 && i != 3) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 32);
        } else {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 42);
        }
        java.lang.String str2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.equals("") ? " " : _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("3002").append(anywheresoftware.b4a.BA.NumberToString(i));
        anywheresoftware.b4a.keywords.Common common = this.__c;
        double length = str2.length();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(str2).toString(), 1);
        return "";
    }

    public java.lang.String _sf_testoaggiuntivopagamenti(java.lang.String str, int i) throws java.lang.Exception {
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        if (i < 1 || i > 9) {
            i = 1;
        }
        if (i < 7 && i != 3) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 32);
        } else {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 42);
        }
        java.lang.String str2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.equals("") ? " " : _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("3008").append(anywheresoftware.b4a.BA.NumberToString(i));
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            double length = str2.length();
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(str2).toString(), 1);
        } else {
            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("3010").append(anywheresoftware.b4a.BA.NumberToString(i));
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            double length2 = str2.length();
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length2, 2, 0, 0, false)).append(str2).toString(), 1);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0592  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _sf_vendita(java.lang.String str, int i, int i2, int i3, int i4, int i5, boolean z, double d, int i6, java.lang.String str2, int i7) throws java.lang.Exception {
        int i8;
        java.lang.String sb;
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
        java.lang.String sb2;
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            return "";
        }
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_articolizero > 1 && i4 == 0 && i5 == 0) {
            return "";
        }
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, 22);
        if (i == 0 || i > 100) {
        }
        anywheresoftware.b4a.keywords.Common common = this.__c;
        if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
            if (i3 >= 0) {
                if (i4 < 0) {
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("30013");
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    double length = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i4 * (-1), 9, 0, 0, false)).toString(), 1);
                } else {
                    java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("3101101");
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    double length2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length2, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                    anywheresoftware.b4a.keywords.Common common8 = this.__c;
                    anywheresoftware.b4a.keywords.Common common9 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append4.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i4, 9, 0, 0, false)).toString(), 1);
                }
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv72 != 0) {
                    return "";
                }
            } else {
                if (i4 < 0) {
                    i4 *= -1;
                }
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3002113** RESO MERCE", 1) != 0) {
                        return "";
                    }
                    java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("3101901");
                    anywheresoftware.b4a.keywords.Common common11 = this.__c;
                    double length3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
                    anywheresoftware.b4a.keywords.Common common12 = this.__c;
                    java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length3, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                    anywheresoftware.b4a.keywords.Common common13 = this.__c;
                    anywheresoftware.b4a.keywords.Common common14 = this.__c;
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append6.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i4, 9, 0, 0, false)).toString(), 1) != 0) {
                        return "";
                    }
                } else {
                    java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("30013");
                    anywheresoftware.b4a.keywords.Common common15 = this.__c;
                    double length4 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
                    anywheresoftware.b4a.keywords.Common common16 = this.__c;
                    java.lang.StringBuilder append8 = append7.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(length4, 2, 0, 0, false)).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                    anywheresoftware.b4a.keywords.Common common17 = this.__c;
                    anywheresoftware.b4a.keywords.Common common18 = this.__c;
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append8.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i4, 9, 0, 0, false)).toString(), 1) != 0) {
                        return "";
                    }
                }
            }
            if (i3 != 1000) {
                anywheresoftware.b4a.keywords.Common common19 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                    if (i3 % 1000 == 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        anywheresoftware.b4a.keywords.Common common20 = this.__c;
                        anywheresoftware.b4a.keywords.Common common21 = this.__c;
                        java.lang.StringBuilder append9 = sb3.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i3 / 1000.0d, 1, 0, 0, true)).append(" X ");
                        anywheresoftware.b4a.keywords.Common common22 = this.__c;
                        anywheresoftware.b4a.keywords.Common common23 = this.__c;
                        sb2 = append9.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i2 / 100.0d, 1, 2, 2, true)).toString();
                    } else {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        anywheresoftware.b4a.keywords.Common common24 = this.__c;
                        anywheresoftware.b4a.keywords.Common common25 = this.__c;
                        java.lang.StringBuilder append10 = sb4.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i3 / 1000.0d, 1, 3, 3, true)).append(" X ");
                        anywheresoftware.b4a.keywords.Common common26 = this.__c;
                        anywheresoftware.b4a.keywords.Common common27 = this.__c;
                        sb2 = append10.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i2 / 100.0d, 1, 2, 2, true)).toString();
                    }
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3002122  " + (sb2 + "                    ").substring(0, 20), 1) != 0) {
                        return "";
                    }
                }
            }
            if (i5 > 0) {
                java.lang.StringBuilder append11 = new java.lang.StringBuilder().append("310130106SCONTO");
                anywheresoftware.b4a.keywords.Common common28 = this.__c;
                anywheresoftware.b4a.keywords.Common common29 = this.__c;
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append11.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i5, 9, 0, 0, false)).toString(), 1) != 0) {
                    return "";
                }
            } else if (i5 < 0) {
                java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("310120113MAGGIORAZIONE");
                anywheresoftware.b4a.keywords.Common common30 = this.__c;
                anywheresoftware.b4a.keywords.Common common31 = this.__c;
                double Abs = anywheresoftware.b4a.keywords.Common.Abs(i5);
                anywheresoftware.b4a.keywords.Common common32 = this.__c;
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append12.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(Abs, 9, 0, 0, false)).toString(), 1) != 0) {
                    return "";
                }
            }
        } else {
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(i6);
            cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            java.lang.StringBuilder append13 = new java.lang.StringBuilder().append("00");
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(activityBA, append13.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("RTIva")).toString(), 2L);
            if (i3 >= 0) {
                anywheresoftware.b4a.keywords.Common common33 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                if (i4 < 0) {
                    cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    _sf_sconto(i4 * (-1), d, i6, cassandraRisto.ital.main._sc_sconto);
                    i8 = i5;
                    if (i8 <= 0) {
                        _sf_sconto(i8, d, i6, i7);
                    } else if (i8 < 0) {
                        java.lang.StringBuilder append14 = new java.lang.StringBuilder().append("MAGGIORAZIONE ");
                        anywheresoftware.b4a.keywords.Common common34 = this.__c;
                        anywheresoftware.b4a.keywords.Common common35 = this.__c;
                        double Abs2 = anywheresoftware.b4a.keywords.Common.Abs(i8);
                        anywheresoftware.b4a.keywords.Common common36 = this.__c;
                        java.lang.String sb5 = append14.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(Abs2, 1, 0, 0, false)).append(" Perc.").toString();
                        java.lang.StringBuilder append15 = new java.lang.StringBuilder().append("33012");
                        anywheresoftware.b4a.keywords.Common common37 = this.__c;
                        anywheresoftware.b4a.keywords.Common common38 = this.__c;
                        anywheresoftware.b4a.keywords.Common common39 = this.__c;
                        java.lang.StringBuilder append16 = append15.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(1.0d, 9, 0, 0, false))).append("001");
                        anywheresoftware.b4a.keywords.Common common40 = this.__c;
                        anywheresoftware.b4a.keywords.Common common41 = this.__c;
                        double length5 = sb5.length();
                        anywheresoftware.b4a.keywords.Common common42 = this.__c;
                        java.lang.StringBuilder append17 = append16.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(length5, 2, 0, 0, false))).append("");
                        anywheresoftware.b4a.keywords.Common common43 = this.__c;
                        java.lang.StringBuilder append18 = append17.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", sb5)).append("");
                        anywheresoftware.b4a.keywords.Common common44 = this.__c;
                        anywheresoftware.b4a.keywords.Common common45 = this.__c;
                        anywheresoftware.b4a.keywords.Common common46 = this.__c;
                        double Abs3 = anywheresoftware.b4a.keywords.Common.Abs(i8);
                        anywheresoftware.b4a.keywords.Common common47 = this.__c;
                        java.lang.StringBuilder append19 = append18.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(Abs3, 9, 0, 0, false))).append("");
                        anywheresoftware.b4a.keywords.Common common48 = this.__c;
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append19.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)).append("").toString(), 1) != 0) {
                            return "";
                        }
                    }
                } else {
                    if (i3 == 1000) {
                        java.lang.StringBuilder append20 = new java.lang.StringBuilder().append("33011");
                        anywheresoftware.b4a.keywords.Common common49 = this.__c;
                        anywheresoftware.b4a.keywords.Common common50 = this.__c;
                        anywheresoftware.b4a.keywords.Common common51 = this.__c;
                        java.lang.StringBuilder append21 = append20.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(i3, 9, 0, 0, false))).append("001");
                        anywheresoftware.b4a.keywords.Common common52 = this.__c;
                        anywheresoftware.b4a.keywords.Common common53 = this.__c;
                        double length6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
                        anywheresoftware.b4a.keywords.Common common54 = this.__c;
                        java.lang.StringBuilder append22 = append21.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(length6, 2, 0, 0, false))).append("");
                        anywheresoftware.b4a.keywords.Common common55 = this.__c;
                        java.lang.StringBuilder append23 = append22.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)).append("");
                        anywheresoftware.b4a.keywords.Common common56 = this.__c;
                        anywheresoftware.b4a.keywords.Common common57 = this.__c;
                        anywheresoftware.b4a.keywords.Common common58 = this.__c;
                        java.lang.StringBuilder append24 = append23.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(i2, 9, 0, 0, false))).append("");
                        anywheresoftware.b4a.keywords.Common common59 = this.__c;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append24.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)).append("").toString(), 1);
                    } else {
                        if (i3 % 1000 == 0) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common60 = this.__c;
                            anywheresoftware.b4a.keywords.Common common61 = this.__c;
                            java.lang.StringBuilder append25 = sb6.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i3 / 1000.0d, 1, 0, 0, true)).append(" X ");
                            anywheresoftware.b4a.keywords.Common common62 = this.__c;
                            anywheresoftware.b4a.keywords.Common common63 = this.__c;
                            sb = append25.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i2 / 100.0d, 1, 2, 2, true)).toString();
                        } else {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common64 = this.__c;
                            anywheresoftware.b4a.keywords.Common common65 = this.__c;
                            java.lang.StringBuilder append26 = sb7.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i3 / 1000.0d, 1, 3, 3, true)).append(" X ");
                            anywheresoftware.b4a.keywords.Common common66 = this.__c;
                            anywheresoftware.b4a.keywords.Common common67 = this.__c;
                            sb = append26.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(i2 / 100.0d, 1, 2, 2, true)).toString();
                        }
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3002122  " + (sb + "                    ").substring(0, 20), 1) != 0) {
                            return "";
                        }
                        java.lang.StringBuilder append27 = new java.lang.StringBuilder().append("33011000001000001");
                        anywheresoftware.b4a.keywords.Common common68 = this.__c;
                        anywheresoftware.b4a.keywords.Common common69 = this.__c;
                        double length7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
                        anywheresoftware.b4a.keywords.Common common70 = this.__c;
                        java.lang.StringBuilder append28 = append27.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(length7, 2, 0, 0, false))).append("");
                        anywheresoftware.b4a.keywords.Common common71 = this.__c;
                        java.lang.StringBuilder append29 = append28.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)).append("");
                        anywheresoftware.b4a.keywords.Common common72 = this.__c;
                        anywheresoftware.b4a.keywords.Common common73 = this.__c;
                        anywheresoftware.b4a.keywords.Common common74 = this.__c;
                        java.lang.StringBuilder append30 = append29.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(i4, 9, 0, 0, false))).append("");
                        anywheresoftware.b4a.keywords.Common common75 = this.__c;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append30.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)).append("").toString(), 1);
                    }
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 != 0) {
                        return "";
                    }
                    i8 = i5;
                    if (i8 <= 0) {
                    }
                }
            } else {
                if (i4 < 0) {
                    i4 *= -1;
                }
                anywheresoftware.b4a.keywords.Common common76 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                    if (i5 < 0) {
                        int i9 = i4 + i5;
                        i5 = 0;
                    }
                    cassandraRisto.ital.ccefdll._tresort _tresortVar = new cassandraRisto.ital.ccefdll._tresort();
                    _tresortVar.tDescrizione = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    _tresortVar.tPrezzoUnitarioLordo100 = i2;
                    _tresortVar.tQta1000 = i3;
                    _tresortVar.tIvaRT = (int) java.lang.Double.parseDouble(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                    _tresortVar.tScontrino = str2;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Add(_tresortVar);
                    i8 = i5;
                    if (i8 <= 0) {
                    }
                } else {
                    anywheresoftware.b4a.keywords.Common common77 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                    anywheresoftware.b4a.objects.collections.List list = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
                    java.lang.StringBuilder append31 = new java.lang.StringBuilder().append("33013000001000001");
                    anywheresoftware.b4a.keywords.Common common78 = this.__c;
                    anywheresoftware.b4a.keywords.Common common79 = this.__c;
                    double length8 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.length();
                    anywheresoftware.b4a.keywords.Common common80 = this.__c;
                    java.lang.StringBuilder append32 = append31.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(length8, 2, 0, 0, false))).append("");
                    anywheresoftware.b4a.keywords.Common common81 = this.__c;
                    java.lang.StringBuilder append33 = append32.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)).append("");
                    anywheresoftware.b4a.keywords.Common common82 = this.__c;
                    anywheresoftware.b4a.keywords.Common common83 = this.__c;
                    anywheresoftware.b4a.keywords.Common common84 = this.__c;
                    java.lang.StringBuilder append34 = append33.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(i4, 9, 0, 0, false))).append("");
                    anywheresoftware.b4a.keywords.Common common85 = this.__c;
                    list.Add(append34.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)).append("").toString());
                    i8 = i5;
                    if (i8 <= 0) {
                    }
                }
            }
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized()) {
                int size = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getSize() - 1;
                for (int i = 0; i <= size; i++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA.ObjectToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Get(i)), 11);
                }
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize();
            return "";
        }
        return "";
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(boolean z) throws java.lang.Exception {
        long DateTimeParse;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        try {
            java.lang.String _mf_leggidataora = _mf_leggidataora();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            DateTimeParse = anywheresoftware.b4a.keywords.DateTime.DateTimeParse(_mf_leggidataora.substring(2, 4) + "/" + _mf_leggidataora.substring(0, 2) + "/20" + _mf_leggidataora.substring(4, 6), _mf_leggidataora.substring(6, 8) + ":" + _mf_leggidataora.substring(8, 10) + ":00");
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
        }
        if (z) {
            return DateTimeParse < this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        b4a.example.dateutils dateutilsVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        anywheresoftware.b4a.keywords.Common.LogImpl("496600076", anywheresoftware.b4a.BA.NumberToString(b4a.example.dateutils._periodbetweenindays(getActivityBA(), DateTimeParse, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).Minutes), 0);
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        b4a.example.dateutils dateutilsVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        anywheresoftware.b4a.keywords.Common.LogImpl("496600077", anywheresoftware.b4a.BA.NumberToString(b4a.example.dateutils._periodbetweenindays(getActivityBA(), DateTimeParse, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).Hours), 0);
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        b4a.example.dateutils dateutilsVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        anywheresoftware.b4a.keywords.Common.LogImpl("496600078", anywheresoftware.b4a.BA.NumberToString(b4a.example.dateutils._periodbetweenindays(getActivityBA(), DateTimeParse, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).Days), 0);
        b4a.example.dateutils dateutilsVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = b4a.example.dateutils._periodbetweenindays(getActivityBA(), DateTimeParse, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).Days < 3;
        return false;
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str, int i) throws java.lang.Exception {
        int i2;
        boolean z;
        try {
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Add(str);
                return 0;
            }
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 1) {
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(str, (int) anywheresoftware.b4a.BA.ObjectToNumber(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 ? -1 : java.lang.Integer.valueOf(i)));
            }
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 2 || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str);
            }
            char[] cArr = new char[1024];
            char[] cArr2 = new char[1024];
            anywheresoftware.b4a.keywords.Common common = this.__c;
            boolean z2 = true;
            int i3 = 0;
            while (z2) {
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                boolean connected = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                if (!connected) {
                    return i3;
                }
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
                int Read = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 1024);
                if (Read > 0) {
                    java.lang.Character valueOf = java.lang.Character.valueOf(cArr[0]);
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    switch (anywheresoftware.b4a.BA.switchObjectToInt(valueOf, java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(6)), java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(21)))) {
                        case 0:
                            if (Read > 1) {
                                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = anywheresoftware.b4a.keywords.Common.CharsToString(cArr, 1, Read - 1);
                                java.lang.StringBuilder append = new java.lang.StringBuilder().append(str);
                                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                                java.lang.StringBuilder append2 = append.append("\t").append("0");
                                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                java.lang.String sb = append2.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
                                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb, false);
                                z = false;
                                i2 = 0;
                                break;
                            } else if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                                z = false;
                                i2 = 0;
                                break;
                            } else {
                                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(str);
                                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                                java.lang.StringBuilder append4 = append3.append("\t").append("0");
                                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                java.lang.String sb2 = append4.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
                                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb2, false);
                                z = false;
                                i2 = 0;
                                break;
                            }
                        case 1:
                            anywheresoftware.b4a.keywords.Common common13 = this.__c;
                            java.lang.String CharsToString = anywheresoftware.b4a.keywords.Common.CharsToString(cArr, 4, Read - 4);
                            java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(str);
                            anywheresoftware.b4a.keywords.Common common14 = this.__c;
                            java.lang.StringBuilder append6 = append5.append("\t").append(CharsToString);
                            anywheresoftware.b4a.keywords.Common common15 = this.__c;
                            java.lang.String sb3 = append6.append("\t").toString();
                            anywheresoftware.b4a.keywords.Common common16 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb3, true);
                            anywheresoftware.b4a.keywords.Common common17 = this.__c;
                            i3 = (int) anywheresoftware.b4a.keywords.Common.Floor(java.lang.Double.parseDouble(CharsToString));
                            switch (i3) {
                                case 16:
                                case 64:
                                    java.lang.String str2 = "11";
                                    while (!str2.equals("00")) {
                                        java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("Carta esaurita nella stampante fiscale.");
                                        anywheresoftware.b4a.keywords.Common common18 = this.__c;
                                        java.lang.StringBuilder append8 = append7.append("\n");
                                        anywheresoftware.b4a.keywords.Common common19 = this.__c;
                                        java.lang.String sb4 = append8.append("\n").append("Sostituire il rotolo ed attendere la eventuale ristampa.").toString();
                                        java.lang.StringBuilder append9 = new java.lang.StringBuilder().append("Errore dal ");
                                        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb4, append9.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1009");
                                        int Read2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr2, 0, 1024);
                                        anywheresoftware.b4a.keywords.Common common20 = this.__c;
                                        str2 = anywheresoftware.b4a.keywords.Common.CharsToString(cArr2, 1, Read2 - 1);
                                        java.lang.StringBuilder append10 = new java.lang.StringBuilder().append("1009");
                                        anywheresoftware.b4a.keywords.Common common21 = this.__c;
                                        java.lang.StringBuilder append11 = append10.append("\t").append("0");
                                        anywheresoftware.b4a.keywords.Common common22 = this.__c;
                                        java.lang.String sb5 = append11.append("\t").append(str2).toString();
                                        anywheresoftware.b4a.keywords.Common common23 = this.__c;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb5, true);
                                    }
                                    z = false;
                                    i2 = 0;
                                    break;
                                case 98:
                                    java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("Stampante fiscale impegnata da un uso manuale.");
                                    anywheresoftware.b4a.keywords.Common common24 = this.__c;
                                    java.lang.StringBuilder append13 = append12.append("\n");
                                    anywheresoftware.b4a.keywords.Common common25 = this.__c;
                                    java.lang.String sb6 = append13.append("\n").append("Completare o annullare l'operazione tramite la tastiera, poi premere OK.").toString();
                                    java.lang.StringBuilder append14 = new java.lang.StringBuilder().append("Errore dal ");
                                    cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb6, append14.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                    anywheresoftware.b4a.keywords.Common common26 = this.__c;
                                    cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_errmail) {
                                        cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            anywheresoftware.b4a.BA activityBA = getActivityBA();
                                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper = this._vvvvvv3;
                                            anywheresoftware.b4a.keywords.Common common27 = this.__c;
                                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA, "Errore Stampante Fiscale", sMTPWrapper, "Stampante fiscale impegnata da un uso manuale.", false);
                                            i2 = i3;
                                            z = true;
                                            break;
                                        }
                                    }
                                    i2 = i3;
                                    z = true;
                                    break;
                                case 99:
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1015");
                                    int Read3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr2, 0, 1024);
                                    anywheresoftware.b4a.keywords.Common common28 = this.__c;
                                    java.lang.String CharsToString2 = anywheresoftware.b4a.keywords.Common.CharsToString(cArr2, 1, Read3 - 1);
                                    java.lang.String substring = CharsToString2.substring(3, 6);
                                    java.lang.String substring2 = CharsToString2.substring(6);
                                    java.lang.StringBuilder append15 = new java.lang.StringBuilder().append("1015");
                                    anywheresoftware.b4a.keywords.Common common29 = this.__c;
                                    java.lang.StringBuilder append16 = append15.append("\t").append("0");
                                    anywheresoftware.b4a.keywords.Common common30 = this.__c;
                                    java.lang.String sb7 = append16.append("\t").append(CharsToString2).toString();
                                    anywheresoftware.b4a.keywords.Common common31 = this.__c;
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb7, true);
                                    java.lang.StringBuilder append17 = new java.lang.StringBuilder().append("ERR").append(substring);
                                    anywheresoftware.b4a.keywords.Common common32 = this.__c;
                                    java.lang.StringBuilder append18 = append17.append("\n").append(substring2);
                                    anywheresoftware.b4a.keywords.Common common33 = this.__c;
                                    java.lang.StringBuilder append19 = append18.append("\n");
                                    anywheresoftware.b4a.keywords.Common common34 = this.__c;
                                    java.lang.String sb8 = append19.append("\n").append(str).toString();
                                    java.lang.StringBuilder append20 = new java.lang.StringBuilder().append("Errore dal ");
                                    cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb8, append20.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                    cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_errmail) {
                                        cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper2 = this._vvvvvv3;
                                            java.lang.StringBuilder append21 = new java.lang.StringBuilder().append("ERR").append(substring);
                                            anywheresoftware.b4a.keywords.Common common35 = this.__c;
                                            java.lang.StringBuilder append22 = append21.append("\n").append(substring2);
                                            anywheresoftware.b4a.keywords.Common common36 = this.__c;
                                            java.lang.StringBuilder append23 = append22.append("\n");
                                            anywheresoftware.b4a.keywords.Common common37 = this.__c;
                                            java.lang.String sb9 = append23.append("\n").append(str).toString();
                                            anywheresoftware.b4a.keywords.Common common38 = this.__c;
                                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA2, "Errore Stampante Fiscale", sMTPWrapper2, sb9, false);
                                            i2 = i3;
                                            z = false;
                                            break;
                                        }
                                    }
                                default:
                                    anywheresoftware.b4a.keywords.Common common39 = this.__c;
                                    if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(i3);
                                        java.lang.StringBuilder append24 = new java.lang.StringBuilder().append("ERR").append(CharsToString);
                                        anywheresoftware.b4a.keywords.Common common40 = this.__c;
                                        java.lang.StringBuilder append25 = append24.append("\n").append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                                        anywheresoftware.b4a.keywords.Common common41 = this.__c;
                                        java.lang.StringBuilder append26 = append25.append("\n");
                                        anywheresoftware.b4a.keywords.Common common42 = this.__c;
                                        java.lang.String sb10 = append26.append("\n").append(str).toString();
                                        java.lang.StringBuilder append27 = new java.lang.StringBuilder().append("Errore dal ");
                                        cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb10, append27.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                        cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._v_errmail) {
                                            cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                                cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                                anywheresoftware.b4a.BA activityBA3 = getActivityBA();
                                                anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper3 = this._vvvvvv3;
                                                java.lang.StringBuilder append28 = new java.lang.StringBuilder().append("ERR").append(CharsToString);
                                                anywheresoftware.b4a.keywords.Common common43 = this.__c;
                                                java.lang.StringBuilder append29 = append28.append("\n").append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                                                anywheresoftware.b4a.keywords.Common common44 = this.__c;
                                                java.lang.StringBuilder append30 = append29.append("\n");
                                                anywheresoftware.b4a.keywords.Common common45 = this.__c;
                                                java.lang.String sb11 = append30.append("\n").append(str).toString();
                                                anywheresoftware.b4a.keywords.Common common46 = this.__c;
                                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA3, "Errore Stampante Fiscale", sMTPWrapper3, sb11, false);
                                            }
                                        }
                                    }
                            }
                        default:
                            i2 = i3;
                            z = false;
                            break;
                    }
                    boolean z3 = z;
                    i3 = i2;
                    z2 = z3;
                } else {
                    z2 = false;
                }
            }
            return i3;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common47 = this.__c;
            java.lang.String message = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
            anywheresoftware.b4a.keywords.Common common48 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(message, true);
            cassandraRisto.ital.main mainVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_errmail) {
                cassandraRisto.ital.main mainVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (!cassandraRisto.ital.main._v_md3.equals("")) {
                    cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA activityBA4 = getActivityBA();
                    anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper4 = this._vvvvvv3;
                    anywheresoftware.b4a.keywords.Common common49 = this.__c;
                    java.lang.String message2 = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
                    anywheresoftware.b4a.keywords.Common common50 = this.__c;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA4, "Errore Stampante Fiscale", sMTPWrapper4, message2, false);
                }
            }
            anywheresoftware.b4a.keywords.Common common51 = this.__c;
            anywheresoftware.b4a.BA activityBA5 = getActivityBA();
            java.lang.StringBuilder append31 = new java.lang.StringBuilder().append("Verifica collegamento ");
            cassandraRisto.ital.main mainVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow(activityBA5, anywheresoftware.b4a.BA.ObjectToCharSequence(append31.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" in corso ...").toString()));
            anywheresoftware.b4a.keywords.Common common52 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common53 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Close();
            cassandraRisto.ital.main mainVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.Timer timer = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
            anywheresoftware.b4a.keywords.Common common54 = this.__c;
            timer.setEnabled(true);
            return 0;
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws java.lang.Exception {
        try {
            char[] cArr = new char[1024];
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1009");
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 400);
            int Read = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 1024);
            if (Read > 1) {
                anywheresoftware.b4a.keywords.Common common = this.__c;
                return anywheresoftware.b4a.keywords.Common.CharsToString(cArr, 1, Read - 1);
            }
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.String message = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(message, true);
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_errmail) {
                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (!cassandraRisto.ital.main._v_md3.equals("")) {
                    cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA activityBA = getActivityBA();
                    anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper = this._vvvvvv3;
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    java.lang.String message2 = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA, "Errore Stampante Fiscale", sMTPWrapper, message2, false);
                }
            }
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Verifica collegamento ");
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow(activityBA2, anywheresoftware.b4a.BA.ObjectToCharSequence(append.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" in corso ...").toString()));
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Close();
            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.Timer timer = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            timer.setEnabled(true);
        }
        return "";
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str, int i) throws java.lang.Exception {
        int i2;
        boolean z;
        try {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            boolean z2 = true;
            int i3 = 0;
            while (z2) {
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(str, i);
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.equals("") && !str.equals("2002")) {
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore collegamento Stampante Fiscale", true);
                    cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_errmail) {
                        cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!cassandraRisto.ital.main._v_md3.equals("")) {
                            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA activityBA = getActivityBA();
                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper = this._vvvvvv3;
                            anywheresoftware.b4a.keywords.Common common4 = this.__c;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA, "Errore Stampante Fiscale", sMTPWrapper, "Errore collegamento Stampante Fiscale", false);
                        }
                    }
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("Verifica collegamento ");
                    cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.ProgressDialogShow(activityBA2, anywheresoftware.b4a.BA.ObjectToCharSequence(append.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" in corso ...").toString()));
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
                    cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.objects.Timer timer = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    timer.setEnabled(true);
                    return 0;
                }
                cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.String str2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = str2.replace(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(6))), "");
                int length = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length();
                if (length > 0) {
                    java.lang.String substring = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(0, 1);
                    anywheresoftware.b4a.keywords.Common common9 = this.__c;
                    anywheresoftware.b4a.keywords.Common common10 = this.__c;
                    switch (anywheresoftware.b4a.BA.switchObjectToInt(substring, anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(6))), anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(21))))) {
                        case 0:
                            if (length > 1) {
                                java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(str);
                                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                java.lang.StringBuilder append3 = append2.append("\t").append("0");
                                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                                java.lang.String sb = append3.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
                                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb, false);
                                z = false;
                                i2 = 0;
                                break;
                            } else if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                                z = false;
                                i2 = 0;
                                break;
                            } else {
                                java.lang.StringBuilder append4 = new java.lang.StringBuilder().append(str);
                                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                                java.lang.StringBuilder append5 = append4.append("\t").append("0");
                                anywheresoftware.b4a.keywords.Common common15 = this.__c;
                                java.lang.String sb2 = append5.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
                                anywheresoftware.b4a.keywords.Common common16 = this.__c;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb2, false);
                                z = false;
                                i2 = 0;
                                break;
                            }
                        case 1:
                            java.lang.String substring2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(4);
                            java.lang.StringBuilder append6 = new java.lang.StringBuilder().append(str);
                            anywheresoftware.b4a.keywords.Common common17 = this.__c;
                            java.lang.StringBuilder append7 = append6.append("\t").append(substring2);
                            anywheresoftware.b4a.keywords.Common common18 = this.__c;
                            java.lang.String sb3 = append7.append("\t").toString();
                            anywheresoftware.b4a.keywords.Common common19 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb3, true);
                            anywheresoftware.b4a.keywords.Common common20 = this.__c;
                            i3 = (int) anywheresoftware.b4a.keywords.Common.Floor(java.lang.Double.parseDouble(substring2));
                            switch (i3) {
                                case 16:
                                case 64:
                                    java.lang.String str3 = "11";
                                    while (!str3.equals("00")) {
                                        java.lang.StringBuilder append8 = new java.lang.StringBuilder().append("Carta esaurita nella stampante fiscale.");
                                        anywheresoftware.b4a.keywords.Common common21 = this.__c;
                                        java.lang.StringBuilder append9 = append8.append("\n");
                                        anywheresoftware.b4a.keywords.Common common22 = this.__c;
                                        java.lang.String sb4 = append9.append("\n").append("Sostituire il rotolo ed attendere la eventuale ristampa.").toString();
                                        java.lang.StringBuilder append10 = new java.lang.StringBuilder().append("Errore dal ");
                                        cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb4, append10.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("1009", 3);
                                        cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        str3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.substring(1);
                                        java.lang.StringBuilder append11 = new java.lang.StringBuilder().append("1009");
                                        anywheresoftware.b4a.keywords.Common common23 = this.__c;
                                        java.lang.StringBuilder append12 = append11.append("\t").append("0");
                                        anywheresoftware.b4a.keywords.Common common24 = this.__c;
                                        java.lang.String sb5 = append12.append("\t").append(str3).toString();
                                        anywheresoftware.b4a.keywords.Common common25 = this.__c;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb5, true);
                                    }
                                    z = false;
                                    i2 = 0;
                                    break;
                                case 98:
                                    java.lang.StringBuilder append13 = new java.lang.StringBuilder().append("Stampante fiscale impegnata da un uso manuale.");
                                    anywheresoftware.b4a.keywords.Common common26 = this.__c;
                                    java.lang.StringBuilder append14 = append13.append("\n");
                                    anywheresoftware.b4a.keywords.Common common27 = this.__c;
                                    java.lang.String sb6 = append14.append("\n").append("Completare o annullare l'operazione tramite la tastiera, poi premere OK.").toString();
                                    java.lang.StringBuilder append15 = new java.lang.StringBuilder().append("Errore dal ");
                                    cassandraRisto.ital.main mainVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb6, append15.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                    anywheresoftware.b4a.keywords.Common common28 = this.__c;
                                    cassandraRisto.ital.main mainVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_errmail) {
                                        cassandraRisto.ital.main mainVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            anywheresoftware.b4a.BA activityBA3 = getActivityBA();
                                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper2 = this._vvvvvv3;
                                            anywheresoftware.b4a.keywords.Common common29 = this.__c;
                                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA3, "Errore Stampante Fiscale", sMTPWrapper2, "Stampante fiscale impegnata da un uso manuale.", false);
                                            i2 = i3;
                                            z = true;
                                            break;
                                        }
                                    }
                                    i2 = i3;
                                    z = true;
                                    break;
                                case 99:
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("1015", 7);
                                    cassandraRisto.ital.main mainVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    java.lang.String substring3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.substring(1);
                                    java.lang.String substring4 = substring3.substring(3, 6);
                                    java.lang.String substring5 = substring3.substring(6);
                                    java.lang.StringBuilder append16 = new java.lang.StringBuilder().append("1015");
                                    anywheresoftware.b4a.keywords.Common common30 = this.__c;
                                    java.lang.StringBuilder append17 = append16.append("\t").append("0");
                                    anywheresoftware.b4a.keywords.Common common31 = this.__c;
                                    java.lang.String sb7 = append17.append("\t").append(substring3).toString();
                                    anywheresoftware.b4a.keywords.Common common32 = this.__c;
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb7, true);
                                    if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.contains("ERR214")) {
                                        java.lang.StringBuilder append18 = new java.lang.StringBuilder().append("Errore dal ");
                                        cassandraRisto.ital.main mainVar15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Obbligatorio eseguire Chiusura Giornaliera", append18.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                        anywheresoftware.b4a.keywords.Common common33 = this.__c;
                                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                                    } else {
                                        java.lang.StringBuilder append19 = new java.lang.StringBuilder().append("ERR").append(substring4);
                                        anywheresoftware.b4a.keywords.Common common34 = this.__c;
                                        java.lang.StringBuilder append20 = append19.append("\n").append(substring5);
                                        anywheresoftware.b4a.keywords.Common common35 = this.__c;
                                        java.lang.StringBuilder append21 = append20.append("\n");
                                        anywheresoftware.b4a.keywords.Common common36 = this.__c;
                                        java.lang.String sb8 = append21.append("\n").append(str).toString();
                                        java.lang.StringBuilder append22 = new java.lang.StringBuilder().append("Errore dal ");
                                        cassandraRisto.ital.main mainVar16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb8, append22.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                    }
                                    cassandraRisto.ital.main mainVar17 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_errmail) {
                                        cassandraRisto.ital.main mainVar18 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            anywheresoftware.b4a.BA activityBA4 = getActivityBA();
                                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper3 = this._vvvvvv3;
                                            java.lang.StringBuilder append23 = new java.lang.StringBuilder().append("ERR").append(substring4);
                                            anywheresoftware.b4a.keywords.Common common37 = this.__c;
                                            java.lang.StringBuilder append24 = append23.append("\n").append(substring5);
                                            anywheresoftware.b4a.keywords.Common common38 = this.__c;
                                            java.lang.StringBuilder append25 = append24.append("\n");
                                            anywheresoftware.b4a.keywords.Common common39 = this.__c;
                                            java.lang.String sb9 = append25.append("\n").append(str).toString();
                                            anywheresoftware.b4a.keywords.Common common40 = this.__c;
                                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA4, "Errore Stampante Fiscale", sMTPWrapper3, sb9, false);
                                            i2 = i3;
                                            z = false;
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    anywheresoftware.b4a.keywords.Common common41 = this.__c;
                                    if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(i3);
                                        java.lang.StringBuilder append26 = new java.lang.StringBuilder().append("ERR").append(substring2);
                                        anywheresoftware.b4a.keywords.Common common42 = this.__c;
                                        java.lang.StringBuilder append27 = append26.append("\n").append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                                        anywheresoftware.b4a.keywords.Common common43 = this.__c;
                                        java.lang.StringBuilder append28 = append27.append("\n");
                                        anywheresoftware.b4a.keywords.Common common44 = this.__c;
                                        java.lang.String sb10 = append28.append("\n").append(str).toString();
                                        java.lang.StringBuilder append29 = new java.lang.StringBuilder().append("Errore dal ");
                                        cassandraRisto.ital.main mainVar19 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb10, append29.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                        cassandraRisto.ital.main mainVar20 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._v_errmail) {
                                            cassandraRisto.ital.main mainVar21 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                                cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                                anywheresoftware.b4a.BA activityBA5 = getActivityBA();
                                                anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper4 = this._vvvvvv3;
                                                java.lang.StringBuilder append30 = new java.lang.StringBuilder().append("ERR").append(substring2);
                                                anywheresoftware.b4a.keywords.Common common45 = this.__c;
                                                java.lang.StringBuilder append31 = append30.append("\n").append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                                                anywheresoftware.b4a.keywords.Common common46 = this.__c;
                                                java.lang.StringBuilder append32 = append31.append("\n");
                                                anywheresoftware.b4a.keywords.Common common47 = this.__c;
                                                java.lang.String sb11 = append32.append("\n").append(str).toString();
                                                anywheresoftware.b4a.keywords.Common common48 = this.__c;
                                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA5, "Errore Stampante Fiscale", sMTPWrapper4, sb11, false);
                                            }
                                        }
                                    }
                            }
                            break;
                        default:
                            i2 = i3;
                            z = false;
                            break;
                    }
                    boolean z3 = z;
                    i3 = i2;
                    z2 = z3;
                } else {
                    z2 = false;
                }
            }
            return i3;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common49 = this.__c;
            java.lang.String message = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
            anywheresoftware.b4a.keywords.Common common50 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(message, true);
            cassandraRisto.ital.main mainVar22 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_errmail) {
                cassandraRisto.ital.main mainVar23 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (!cassandraRisto.ital.main._v_md3.equals("")) {
                    cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA activityBA6 = getActivityBA();
                    anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper5 = this._vvvvvv3;
                    anywheresoftware.b4a.keywords.Common common51 = this.__c;
                    java.lang.String message2 = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
                    anywheresoftware.b4a.keywords.Common common52 = this.__c;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA6, "Errore Stampante Fiscale", sMTPWrapper5, message2, false);
                }
            }
            anywheresoftware.b4a.keywords.Common common53 = this.__c;
            anywheresoftware.b4a.BA activityBA7 = getActivityBA();
            java.lang.StringBuilder append33 = new java.lang.StringBuilder().append("Verifica collegamento ");
            cassandraRisto.ital.main mainVar24 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow(activityBA7, anywheresoftware.b4a.BA.ObjectToCharSequence(append33.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" in corso ...").toString()));
            anywheresoftware.b4a.keywords.Common common54 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common55 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            cassandraRisto.ital.main mainVar25 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.Timer timer2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
            anywheresoftware.b4a.keywords.Common common56 = this.__c;
            timer2.setEnabled(true);
            return 0;
        }
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str) throws java.lang.Exception {
        boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        int i;
        boolean z;
        try {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            boolean z2 = true;
            int i2 = 0;
            while (z2) {
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
                if (str.startsWith("7410") || str.equals("2002") || str.equals("4004") || str.startsWith("7101") || str.startsWith("3013") || str.startsWith("1516") || str.startsWith("1510") || str.startsWith("3011") || str.startsWith("6403") || str.startsWith("8002")) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(65);
                } else {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(2);
                }
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0) {
                        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.main._v_ipcassa) == 0) {
                            anywheresoftware.b4a.keywords.Common common5 = this.__c;
                            z2 = true;
                        } else {
                            anywheresoftware.b4a.keywords.Common common6 = this.__c;
                            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = true;
                        }
                    }
                }
                char ObjectToChar = anywheresoftware.b4a.BA.ObjectToChar(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(0, 1));
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length() > 10 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(5, 8).equals("ERR")) {
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    ObjectToChar = anywheresoftware.b4a.keywords.Common.Chr(21);
                }
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                    java.lang.Character valueOf = java.lang.Character.valueOf(ObjectToChar);
                    anywheresoftware.b4a.keywords.Common common8 = this.__c;
                    anywheresoftware.b4a.keywords.Common common9 = this.__c;
                    switch (anywheresoftware.b4a.BA.switchObjectToInt(valueOf, java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(6)), java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(21)))) {
                        case 0:
                            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length() > 1) {
                                java.lang.StringBuilder append = new java.lang.StringBuilder().append(str);
                                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                                java.lang.StringBuilder append2 = append.append("\t").append("0");
                                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                java.lang.String sb = append2.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
                                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb, false);
                                z = false;
                                i = 0;
                                break;
                            } else if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                                z = false;
                                i = 0;
                                break;
                            } else {
                                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(str);
                                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                                java.lang.StringBuilder append4 = append3.append("\t").append("0");
                                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                                java.lang.String sb2 = append4.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
                                anywheresoftware.b4a.keywords.Common common15 = this.__c;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb2, false);
                                z = false;
                                i = 0;
                                break;
                            }
                        case 1:
                            java.lang.String substring = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(8, 10);
                            java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(str);
                            anywheresoftware.b4a.keywords.Common common16 = this.__c;
                            java.lang.StringBuilder append6 = append5.append("\t").append(substring);
                            anywheresoftware.b4a.keywords.Common common17 = this.__c;
                            java.lang.String sb3 = append6.append("\t").toString();
                            anywheresoftware.b4a.keywords.Common common18 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb3, true);
                            anywheresoftware.b4a.keywords.Common common19 = this.__c;
                            i2 = (int) anywheresoftware.b4a.keywords.Common.Floor(java.lang.Double.parseDouble(substring));
                            switch (i2) {
                                case 16:
                                case 64:
                                    java.lang.String str2 = "11";
                                    while (!str2.equals("00")) {
                                        java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("Carta esaurita nella stampante fiscale.");
                                        anywheresoftware.b4a.keywords.Common common20 = this.__c;
                                        java.lang.StringBuilder append8 = append7.append("\n");
                                        anywheresoftware.b4a.keywords.Common common21 = this.__c;
                                        java.lang.String sb4 = append8.append("\n").append("Sostituire il rotolo ed attendere la eventuale ristampa.").toString();
                                        java.lang.StringBuilder append9 = new java.lang.StringBuilder().append("Errore dal ");
                                        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb4, append9.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1009");
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(2);
                                        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length() > 12) {
                                            str2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(9, 11);
                                        }
                                        java.lang.StringBuilder append10 = new java.lang.StringBuilder().append("1009");
                                        anywheresoftware.b4a.keywords.Common common22 = this.__c;
                                        java.lang.StringBuilder append11 = append10.append("\t").append("0");
                                        anywheresoftware.b4a.keywords.Common common23 = this.__c;
                                        java.lang.String sb5 = append11.append("\t").append(str2).toString();
                                        anywheresoftware.b4a.keywords.Common common24 = this.__c;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb5, true);
                                    }
                                    z = false;
                                    i = 0;
                                    break;
                                case 98:
                                    java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("Stampante fiscale impegnata da un uso manuale.");
                                    anywheresoftware.b4a.keywords.Common common25 = this.__c;
                                    java.lang.StringBuilder append13 = append12.append("\n");
                                    anywheresoftware.b4a.keywords.Common common26 = this.__c;
                                    java.lang.String sb6 = append13.append("\n").append("Completare o annullare l'operazione tramite la tastiera, poi premere OK.").toString();
                                    java.lang.StringBuilder append14 = new java.lang.StringBuilder().append("Errore dal ");
                                    cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb6, append14.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                    anywheresoftware.b4a.keywords.Common common27 = this.__c;
                                    cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_errmail) {
                                        cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            anywheresoftware.b4a.BA activityBA = getActivityBA();
                                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper = this._vvvvvv3;
                                            anywheresoftware.b4a.keywords.Common common28 = this.__c;
                                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA, "Errore Stampante Fiscale", sMTPWrapper, "Stampante fiscale impegnata da un uso manuale.", false);
                                            i = i2;
                                            z = true;
                                            break;
                                        }
                                    }
                                    i = i2;
                                    z = true;
                                    break;
                                case 99:
                                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1015");
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(2);
                                    if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length() > 12) {
                                        java.lang.String substring2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(12, 15);
                                        java.lang.String substring3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.substring(15, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.length() - 3);
                                        java.lang.StringBuilder append15 = new java.lang.StringBuilder().append("1015");
                                        anywheresoftware.b4a.keywords.Common common29 = this.__c;
                                        java.lang.StringBuilder append16 = append15.append("\t").append("0");
                                        anywheresoftware.b4a.keywords.Common common30 = this.__c;
                                        java.lang.String sb7 = append16.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString();
                                        anywheresoftware.b4a.keywords.Common common31 = this.__c;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb7, true);
                                        anywheresoftware.b4a.keywords.Common common32 = this.__c;
                                        if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                                            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.contains("ERR214")) {
                                                java.lang.StringBuilder append17 = new java.lang.StringBuilder().append("Errore dal ");
                                                cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Obbligatorio eseguire Chiusura Giornaliera", append17.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                                anywheresoftware.b4a.keywords.Common common33 = this.__c;
                                                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                                            } else {
                                                java.lang.StringBuilder append18 = new java.lang.StringBuilder().append("ERR").append(substring2);
                                                anywheresoftware.b4a.keywords.Common common34 = this.__c;
                                                java.lang.StringBuilder append19 = append18.append("\n").append(substring3);
                                                anywheresoftware.b4a.keywords.Common common35 = this.__c;
                                                java.lang.StringBuilder append20 = append19.append("\n");
                                                anywheresoftware.b4a.keywords.Common common36 = this.__c;
                                                java.lang.String sb8 = append20.append("\n").append(str).toString();
                                                java.lang.StringBuilder append21 = new java.lang.StringBuilder().append("Errore dal ");
                                                cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb8, append21.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                            }
                                            cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (cassandraRisto.ital.main._v_errmail) {
                                                cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                                    cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                                    anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                                                    anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper2 = this._vvvvvv3;
                                                    java.lang.StringBuilder append22 = new java.lang.StringBuilder().append("ERR").append(substring2);
                                                    anywheresoftware.b4a.keywords.Common common37 = this.__c;
                                                    java.lang.StringBuilder append23 = append22.append("\n").append(substring3);
                                                    anywheresoftware.b4a.keywords.Common common38 = this.__c;
                                                    java.lang.StringBuilder append24 = append23.append("\n");
                                                    anywheresoftware.b4a.keywords.Common common39 = this.__c;
                                                    java.lang.String sb9 = append24.append("\n").append(str).toString();
                                                    anywheresoftware.b4a.keywords.Common common40 = this.__c;
                                                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA2, "Errore Stampante Fiscale", sMTPWrapper2, sb9, false);
                                                    i = i2;
                                                    z = false;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    anywheresoftware.b4a.keywords.Common common41 = this.__c;
                                    if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(i2);
                                        java.lang.StringBuilder append25 = new java.lang.StringBuilder().append("ERR").append(substring);
                                        anywheresoftware.b4a.keywords.Common common42 = this.__c;
                                        java.lang.StringBuilder append26 = append25.append("\n").append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                                        anywheresoftware.b4a.keywords.Common common43 = this.__c;
                                        java.lang.StringBuilder append27 = append26.append("\n");
                                        anywheresoftware.b4a.keywords.Common common44 = this.__c;
                                        java.lang.String sb10 = append27.append("\n").append(str).toString();
                                        java.lang.StringBuilder append28 = new java.lang.StringBuilder().append("Errore dal ");
                                        cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb10, append28.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString());
                                        cassandraRisto.ital.main mainVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._v_errmail) {
                                            cassandraRisto.ital.main mainVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (!cassandraRisto.ital.main._v_md3.equals("")) {
                                                cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                                anywheresoftware.b4a.BA activityBA3 = getActivityBA();
                                                anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper3 = this._vvvvvv3;
                                                java.lang.StringBuilder append29 = new java.lang.StringBuilder().append("ERR").append(substring);
                                                anywheresoftware.b4a.keywords.Common common45 = this.__c;
                                                java.lang.StringBuilder append30 = append29.append("\n").append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
                                                anywheresoftware.b4a.keywords.Common common46 = this.__c;
                                                java.lang.StringBuilder append31 = append30.append("\n");
                                                anywheresoftware.b4a.keywords.Common common47 = this.__c;
                                                java.lang.String sb11 = append31.append("\n").append(str).toString();
                                                anywheresoftware.b4a.keywords.Common common48 = this.__c;
                                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA3, "Errore Stampante Fiscale", sMTPWrapper3, sb11, false);
                                            }
                                        }
                                    }
                            }
                            break;
                        default:
                            i = i2;
                            z = false;
                            break;
                    }
                    boolean z3 = z;
                    i2 = i;
                    z2 = z3;
                } else {
                    z2 = false;
                }
            }
            return i2;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            java.lang.StringBuilder append32 = new java.lang.StringBuilder().append(str);
            anywheresoftware.b4a.keywords.Common common49 = this.__c;
            java.lang.StringBuilder append33 = append32.append("\t");
            anywheresoftware.b4a.keywords.Common common50 = this.__c;
            java.lang.String sb12 = append33.append(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage()).toString();
            anywheresoftware.b4a.keywords.Common common51 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb12, true);
            cassandraRisto.ital.main mainVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_errmail) {
                cassandraRisto.ital.main mainVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (!cassandraRisto.ital.main._v_md3.equals("")) {
                    cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA activityBA4 = getActivityBA();
                    anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper4 = this._vvvvvv3;
                    anywheresoftware.b4a.keywords.Common common52 = this.__c;
                    java.lang.String message = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
                    anywheresoftware.b4a.keywords.Common common53 = this.__c;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv7(activityBA4, "Errore Stampante Fiscale", sMTPWrapper4, message, false);
                }
            }
            anywheresoftware.b4a.keywords.Common common54 = this.__c;
            anywheresoftware.b4a.BA activityBA5 = getActivityBA();
            java.lang.StringBuilder append34 = new java.lang.StringBuilder().append("Verifica collegamento ");
            cassandraRisto.ital.main mainVar15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow(activityBA5, anywheresoftware.b4a.BA.ObjectToCharSequence(append34.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" in corso ...").toString()));
            anywheresoftware.b4a.keywords.Common common55 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common56 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Close();
            }
            cassandraRisto.ital.main mainVar16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.Timer timer = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
            anywheresoftware.b4a.keywords.Common common57 = this.__c;
            timer.setEnabled(true);
            return 0;
        }
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.fastSubCompare(str, "READ") ? _read() : anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
