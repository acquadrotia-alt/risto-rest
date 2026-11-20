package cassandraRisto.ital;

/* loaded from: classes.dex */
public class ingenico extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public byte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
    public byte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
    public byte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public byte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
    public byte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
    public byte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
    public anywheresoftware.b4a.objects.SocketWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
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
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "cassandraRisto.ital.ingenico");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", cassandraRisto.ital.ingenico.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (byte) 2;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (byte) 3;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (byte) 1;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (byte) 4;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (byte) 6;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (byte) 21;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 1000;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 10;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "Ingenico_ERR.txt";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "Ingenico_LOG.txt";
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.SocketWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 20000;
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        try {
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized()) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Close();
            }
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Close();
            }
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized()) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Close();
            }
            anywheresoftware.b4a.keywords.Common common = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Chiusura della connessione.", false);
            return "";
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("4132513805", anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage(), 0);
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage()), anywheresoftware.b4a.BA.ObjectToCharSequence("Sub Close: Attenzione!"), getActivityBA());
            return "";
        }
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        innerInitialize(ba);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = true;
        return "";
    }

    public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, boolean z, int i) throws java.lang.Exception {
        anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
        if (i == this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            try {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
                map.Initialize();
                map.Put("Esito", "11");
                java.lang.String substring = str.substring(1, str.length() - 2);
                if (substring.substring(17, 18).equals("0")) {
                    switch (anywheresoftware.b4a.BA.switchObjectToInt(substring.substring(21, 23), "00", "01", "02", "03", "04", "05", "06", "07", "08")) {
                        case 0:
                            map.Put("Esito", "00");
                            map.Put("DescEsito", "Operazione Eseguita Correttamente");
                            if (substring.length() > 289) {
                                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_eftsmstampa) {
                                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = substring.substring(287);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            map.Put("DescEsito", "Carta esercente non inserita o transazione Online non autorizzata");
                            break;
                        case 2:
                            map.Put("DescEsito", "Pos non operativo");
                            break;
                        case 3:
                            map.Put("DescEsito", "Codice Compagnia non trovato");
                            break;
                        case 4:
                            map.Put("DescEsito", "Profilo non trovato o non valido");
                            break;
                        case 5:
                            map.Put("DescEsito", "Errore nell'importo / congruenza con profilo scaricato da Host");
                            break;
                        case 6:
                            map.Put("DescEsito", "Errore nel calcolo delle commissioni");
                            break;
                        case 7:
                            map.Put("DescEsito", "Operazione annullata");
                            break;
                        case 8:
                            map.Put("DescEsito", "Errore nella transazione OnLine");
                            break;
                        default:
                            map.Put("DescEsito", "Errore generico");
                            break;
                    }
                } else if (substring.substring(17, 18).equals("1")) {
                    map.Put("DescEsito", "Identificativo terminale errato / non accettato");
                } else if (substring.substring(17, 18).equals("2")) {
                    map.Put("DescEsito", "Applicativo assente");
                } else if (substring.substring(17, 18).equals("3")) {
                    map.Put("DescEsito", "Applicativo non abilitato");
                }
            } catch (java.lang.Exception e) {
                this.ba.setLastException(e);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common = this.__c;
                java.lang.String sb2 = sb.append(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage()).append(" Sub: LeggiEsitoPag").toString();
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb2, true);
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                map.Put("Errore", true);
            }
        } else {
            try {
                map.Initialize();
                java.lang.String substring2 = str.substring(1, str.length() - 2);
                if (substring2.substring(10, 12).equals("00")) {
                    map.Put("Esito", substring2.substring(10, 12));
                    map.Put("IDTerminale", substring2.substring(0, 8));
                    map.Put("PAN-Carta", substring2.substring(12, 31));
                    map.Put("TipoTransazione", substring2.substring(31, 34));
                    map.Put("CodiceAut", substring2.substring(34, 40));
                } else {
                    map.Put("DescEsito", substring2.substring(12, 36));
                }
                map.Put("TipoCarta", substring2.substring(47, 48));
                map.Put("IDAcquirer", substring2.substring(48, 59));
                map.Put("STAN", substring2.substring(59, 65));
                map.Put("ProgOP", substring2.substring(65, 71));
                if (z) {
                    map.Put("ActionCode", substring2.substring(71, 74));
                    map.Put("ImportoRicevuto", substring2.substring(74, 82));
                }
            } catch (java.lang.Exception e2) {
                this.ba.setLastException(e2);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                java.lang.String sb4 = sb3.append(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage()).append(" Sub: LeggiEsitoPag").toString();
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb4, true);
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                map.Put("Errore", true);
            }
        }
        return map;
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str, boolean z) throws java.lang.Exception {
        if (z) {
            anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            long _vvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append = sb.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv2(getActivityBA(), _vvvvvvvvvvvvv0));
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.String sb2 = append.append("\t").append(str).toString();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String sb4 = sb3.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/LOG").toString();
            java.lang.String str2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            textWriterWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(sb4, str2, true).getObject());
            textWriterWrapper.WriteLine(sb2);
            textWriterWrapper.Close();
        }
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_logmf) {
            anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper2 = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            long _vvvvvvvvvvvvv02 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append2 = sb5.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv2(getActivityBA(), _vvvvvvvvvvvvv02));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.String sb6 = append2.append("\t").append(str).toString();
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String sb8 = sb7.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/LOG").toString();
            java.lang.String str3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            textWriterWrapper2.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(sb8, str3, true).getObject());
            textWriterWrapper2.WriteLine(sb6);
            textWriterWrapper2.Close();
            return "";
        }
        return "";
    }

    public byte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(byte[] bArr) throws java.lang.Exception {
        byte b = Byte.MAX_VALUE;
        int length = bArr.length - 1;
        for (int i = 0; i <= length; i++) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
            b = (byte) anywheresoftware.b4a.keywords.Bit.Xor(b, bArr[i]);
        }
        return b;
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, int i) throws java.lang.Exception {
        try {
            if (!str.equals("")) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = str;
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize("sck");
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTimeOut(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Connect(this.ba, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, i, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
            int i2 = 0;
            while (true) {
                boolean connected = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
                anywheresoftware.b4a.keywords.Common common = this.__c;
                if (!connected) {
                    double d = i2;
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    if (d >= anywheresoftware.b4a.keywords.Common.Floor(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 / 100.0d)) {
                        break;
                    }
                    cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 100);
                    i2++;
                } else {
                    break;
                }
            }
            if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected()) {
                return 256;
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getOutputStream());
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getInputStream());
            java.lang.String str2 = "Connessione al terminale riuscita. IP:" + this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 + " Porta:" + anywheresoftware.b4a.BA.NumberToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str2, false);
            return 0;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("4132317218", anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage(), 0);
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage()), anywheresoftware.b4a.BA.ObjectToCharSequence("Sub OpenEth: Attenzione!"), getActivityBA());
            return 256;
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, int i, char c) throws java.lang.Exception {
        if (str != null && str.length() < i) {
            int length = i - str.length();
            java.lang.String str2 = "";
            for (int i2 = 1; i2 <= length; i2++) {
                str2 = str2 + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(c));
            }
            return str2 + str;
        }
        return str.substring(0, i);
    }

    public java.lang.String _pconferma() throws java.lang.Exception {
        byte[] bArr = new byte[3];
        bArr[0] = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
        bArr[1] = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        bArr[2] = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(bArr);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        return anywheresoftware.b4a.keywords.Common.BytesToString(bArr, 0, 3, "ASCII");
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        byte[] bArr = new byte[3];
        bArr[0] = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        bArr[1] = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        bArr[2] = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(bArr);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        return anywheresoftware.b4a.keywords.Common.BytesToString(bArr, 0, 3, "ASCII");
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str) throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Write(str);
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Flush();
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca A[Catch: Exception -> 0x012c, TryCatch #0 {Exception -> 0x012c, blocks: (B:3:0x000c, B:7:0x001d, B:9:0x0027, B:10:0x0071, B:11:0x0074, B:12:0x007e, B:13:0x0089, B:15:0x0093, B:17:0x00a0, B:19:0x00bd, B:21:0x00ca, B:23:0x00f0, B:25:0x0105, B:27:0x0123, B:28:0x015c, B:30:0x0165, B:32:0x017d, B:34:0x019d, B:36:0x01ab, B:38:0x01b4, B:40:0x01fb, B:42:0x0204, B:44:0x024b), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c A[Catch: Exception -> 0x012c, TRY_ENTER, TryCatch #0 {Exception -> 0x012c, blocks: (B:3:0x000c, B:7:0x001d, B:9:0x0027, B:10:0x0071, B:11:0x0074, B:12:0x007e, B:13:0x0089, B:15:0x0093, B:17:0x00a0, B:19:0x00bd, B:21:0x00ca, B:23:0x00f0, B:25:0x0105, B:27:0x0123, B:28:0x015c, B:30:0x0165, B:32:0x017d, B:34:0x019d, B:36:0x01ab, B:38:0x01b4, B:40:0x01fb, B:42:0x0204, B:44:0x024b), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _read() throws java.lang.Exception {
        char c;
        char[] cArr = new char[1024];
        try {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Ready())) {
                return "";
            }
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 1) > 0) {
                java.lang.Character valueOf = java.lang.Character.valueOf(cArr[0]);
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                switch (anywheresoftware.b4a.BA.switchObjectToInt(valueOf, java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)), java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5)), java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)), java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)))) {
                    case 0:
                        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0]));
                        while (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 1) > 0) {
                            char c2 = cArr[0];
                            anywheresoftware.b4a.keywords.Common common6 = this.__c;
                            if (c2 != anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4)) {
                                ObjectToString = ObjectToString + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0]));
                            } else {
                                c = cArr[0];
                                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                                if (c != anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4)) {
                                    java.lang.String str = ObjectToString + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0]));
                                    if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 1) > 0) {
                                        char c3 = cArr[0];
                                        anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                        if (c3 == anywheresoftware.b4a.keywords.Common.Chr(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(str.getBytes("ASCII")))) {
                                            return str + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0]));
                                        }
                                    }
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6());
                                    break;
                                } else {
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6());
                                    break;
                                }
                            }
                        }
                        c = cArr[0];
                        anywheresoftware.b4a.keywords.Common common72 = this.__c;
                        if (c != anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4)) {
                        }
                    case 1:
                        java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0]));
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 21);
                        java.lang.String str2 = ObjectToString2;
                        int i = 0;
                        while (i <= 20) {
                            java.lang.String str3 = str2 + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[i]));
                            i++;
                            str2 = str3;
                        }
                        char c4 = cArr[20];
                        anywheresoftware.b4a.keywords.Common common9 = this.__c;
                        if (c4 != anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6)) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6());
                            break;
                        } else {
                            return str2;
                        }
                    case 2:
                        java.lang.String ObjectToString3 = anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0]));
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 2);
                        java.lang.String str4 = ObjectToString3 + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0])) + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[1]));
                        if (!str4.equals(_pconferma())) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6());
                            break;
                        } else {
                            return str4;
                        }
                    case 3:
                        java.lang.String ObjectToString4 = anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0]));
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Read(cArr, 0, 2);
                        java.lang.String str5 = ObjectToString4 + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[0])) + anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(cArr[1]));
                        if (!str5.equals(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6())) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6());
                            break;
                        } else {
                            return str5;
                        }
                    default:
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6());
                        break;
                }
            }
            return "";
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            java.lang.String sb2 = sb.append(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage()).append(" Sub: Read").toString();
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb2, true);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x031e A[Catch: Exception -> 0x03d2, TryCatch #0 {Exception -> 0x03d2, blocks: (B:5:0x0010, B:7:0x001d, B:9:0x0044, B:12:0x005c, B:14:0x00db, B:15:0x00fe, B:16:0x017e, B:18:0x0184, B:23:0x0194, B:25:0x02b9, B:29:0x0303, B:27:0x031a, B:33:0x019e, B:34:0x01e4, B:35:0x031e, B:38:0x0341, B:40:0x0355, B:42:0x0363, B:43:0x0392, B:45:0x0397, B:46:0x0423, B:48:0x042b, B:50:0x0439, B:51:0x046a, B:55:0x04a6, B:57:0x04ae, B:59:0x0215, B:60:0x023a, B:62:0x01eb, B:63:0x0200, B:64:0x04eb), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0341 A[Catch: Exception -> 0x03d2, TryCatch #0 {Exception -> 0x03d2, blocks: (B:5:0x0010, B:7:0x001d, B:9:0x0044, B:12:0x005c, B:14:0x00db, B:15:0x00fe, B:16:0x017e, B:18:0x0184, B:23:0x0194, B:25:0x02b9, B:29:0x0303, B:27:0x031a, B:33:0x019e, B:34:0x01e4, B:35:0x031e, B:38:0x0341, B:40:0x0355, B:42:0x0363, B:43:0x0392, B:45:0x0397, B:46:0x0423, B:48:0x042b, B:50:0x0439, B:51:0x046a, B:55:0x04a6, B:57:0x04ae, B:59:0x0215, B:60:0x023a, B:62:0x01eb, B:63:0x0200, B:64:0x04eb), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04ae A[Catch: Exception -> 0x03d2, TryCatch #0 {Exception -> 0x03d2, blocks: (B:5:0x0010, B:7:0x001d, B:9:0x0044, B:12:0x005c, B:14:0x00db, B:15:0x00fe, B:16:0x017e, B:18:0x0184, B:23:0x0194, B:25:0x02b9, B:29:0x0303, B:27:0x031a, B:33:0x019e, B:34:0x01e4, B:35:0x031e, B:38:0x0341, B:40:0x0355, B:42:0x0363, B:43:0x0392, B:45:0x0397, B:46:0x0423, B:48:0x042b, B:50:0x0439, B:51:0x046a, B:55:0x04a6, B:57:0x04ae, B:59:0x0215, B:60:0x023a, B:62:0x01eb, B:63:0x0200, B:64:0x04eb), top: B:4:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int i, int i2, int i3, int i4, boolean z, java.lang.String str) throws java.lang.Exception {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String substring;
        anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        boolean z2 = false;
        if (i3 == 4) {
            i3 = 0;
        }
        try {
            map.Initialize();
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) == 0) {
                java.lang.String str4 = _vvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.BA.NumberToString(i), 8, anywheresoftware.b4a.BA.ObjectToChar("0")) + "0";
                if (i3 == this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    str2 = str4 + "w";
                } else if (z) {
                    str2 = str4 + "X";
                } else {
                    str2 = str4 + "P";
                }
                if (i3 == 10) {
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append((str2 + "822660") + "0102").append(str);
                    cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 25));
                    cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    java.lang.String str5 = append2.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 19)).toString() + _vvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.BA.NumberToString(i4), 7, anywheresoftware.b4a.BA.ObjectToChar("0"));
                    cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_eftsmstampa) {
                        java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(str5);
                        cassandraRisto.ital.modfunstr modfunstrVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        str3 = append3.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 47)).append("01").toString();
                    } else {
                        java.lang.StringBuilder append4 = new java.lang.StringBuilder().append(str5);
                        cassandraRisto.ital.modfunstr modfunstrVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        str3 = append4.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), 47)).append("11").toString();
                    }
                } else {
                    str3 = ((((str2 + _vvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.BA.NumberToString(i2), 8, anywheresoftware.b4a.BA.ObjectToChar("0"))) + "0000") + anywheresoftware.b4a.BA.NumberToString(i3)) + _vvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.BA.NumberToString(i4), 8, anywheresoftware.b4a.BA.ObjectToChar("0"))) + "00000000";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                java.lang.StringBuilder append5 = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)))).append(str3);
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                java.lang.String sb2 = append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4)))).toString();
                java.lang.StringBuilder append6 = new java.lang.StringBuilder().append(sb2);
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                java.lang.String sb3 = append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(sb2.getBytes("ASCII")))))).toString();
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb3);
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Richiesta pagamento: \"" + sb3 + "\"", false);
                while (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2()) {
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
                        java.lang.String str6 = sb3;
                        for (int i5 = 0; i5 <= 120; i5++) {
                            str6 = _read();
                            if (str6.length() <= 0) {
                                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                                anywheresoftware.b4a.BA ba = this.ba;
                                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.Class<?> object = cassandraRisto.ital.main.getObject();
                                java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("Procedura di pagamento in corso ...");
                                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, object, "SetlwText", append7.append("\n").append("Tempo residuo prima dell'annullo automatico: ").append(anywheresoftware.b4a.BA.NumberToString(120 - i5)).toString());
                                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 1000);
                                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                anywheresoftware.b4a.keywords.Common.DoEvents();
                                if (i5 == 120) {
                                    anywheresoftware.b4a.keywords.Common common10 = this.__c;
                                    map.Put("OK", false);
                                    map.Put("Esito", "Esaurito il tempo per la transazione.");
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                                }
                            } else {
                                substring = str6.substring(0, 1);
                                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                                switch (anywheresoftware.b4a.BA.switchObjectToInt(substring, anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7))), anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0))), anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3))))) {
                                    case 1:
                                        anywheresoftware.b4a.keywords.Common common14 = this.__c;
                                        map.Put("OK", false);
                                        map.Put("Esito", "Operazione rifiutata dal terminale.");
                                        anywheresoftware.b4a.keywords.Common common15 = this.__c;
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Operazione rifiutata dal terminale.", false);
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                                        anywheresoftware.b4a.keywords.Common common16 = this.__c;
                                        z2 = true;
                                        break;
                                    case 2:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_pconferma());
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                                        map = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str6, z, i3);
                                        if (i3 == this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                            if (map.Get("Esito").equals("00")) {
                                                anywheresoftware.b4a.keywords.Common common17 = this.__c;
                                                map.Put("OK", true);
                                                java.lang.String str7 = "Operazione eseguita con successo dal terminale. " + anywheresoftware.b4a.BA.ObjectToString(map.Get("Esito"));
                                                anywheresoftware.b4a.keywords.Common common18 = this.__c;
                                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str7, false);
                                            } else {
                                                anywheresoftware.b4a.keywords.Common common19 = this.__c;
                                                map.Put("OK", false);
                                                map.Put("Esito", map.Get("DescEsito"));
                                                java.lang.String str8 = "Operazione fallita. " + anywheresoftware.b4a.BA.ObjectToString(map.Get("DescEsito"));
                                                anywheresoftware.b4a.keywords.Common common20 = this.__c;
                                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str8, false);
                                            }
                                        } else if (map.ContainsKey("Esito") && map.Get("Esito").equals("00")) {
                                            anywheresoftware.b4a.keywords.Common common21 = this.__c;
                                            map.Put("OK", true);
                                            java.lang.String str9 = "Operazione eseguita con successo dal terminale. " + anywheresoftware.b4a.BA.ObjectToString(map.Get("Esito"));
                                            anywheresoftware.b4a.keywords.Common common22 = this.__c;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str9, false);
                                        } else {
                                            anywheresoftware.b4a.keywords.Common common23 = this.__c;
                                            map.Put("OK", false);
                                            map.Put("Esito", map.Get("DescEsito"));
                                            java.lang.String str10 = "Operazione fallita. " + anywheresoftware.b4a.BA.ObjectToString(map.Get("DescEsito"));
                                            anywheresoftware.b4a.keywords.Common common24 = this.__c;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str10, false);
                                        }
                                        anywheresoftware.b4a.keywords.Common common25 = this.__c;
                                        z2 = true;
                                        break;
                                }
                                sb3 = str6;
                            }
                        }
                        substring = str6.substring(0, 1);
                        anywheresoftware.b4a.keywords.Common common112 = this.__c;
                        anywheresoftware.b4a.keywords.Common common122 = this.__c;
                        anywheresoftware.b4a.keywords.Common common132 = this.__c;
                        switch (anywheresoftware.b4a.BA.switchObjectToInt(substring, anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7))), anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0))), anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3))))) {
                        }
                        sb3 = str6;
                    } else {
                        anywheresoftware.b4a.keywords.Common common26 = this.__c;
                        if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
                            java.lang.String str11 = "Timeout della connessione " + anywheresoftware.b4a.BA.NumberToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) + "ms";
                            anywheresoftware.b4a.keywords.Common common27 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str11, false);
                            anywheresoftware.b4a.keywords.Common common28 = this.__c;
                            map.Put("OK", false);
                            map.Put("Esito", "Timeout della connessione");
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        }
                    }
                }
                anywheresoftware.b4a.keywords.Common common262 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
                }
            } else {
                anywheresoftware.b4a.keywords.Common common29 = this.__c;
                map.Put("OK", false);
                map.Put("Esito", "Problemi di connessione.");
                anywheresoftware.b4a.keywords.Common common30 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Problemi di connessione.", false);
            }
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common31 = this.__c;
            map.Put("OK", false);
            anywheresoftware.b4a.keywords.Common common32 = this.__c;
            map.Put("Esito", anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common33 = this.__c;
            java.lang.String sb5 = sb4.append(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage()).append(" Sub: RichiestaPagamento").toString();
            anywheresoftware.b4a.keywords.Common common34 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(sb5, true);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
        }
        return map;
    }

    public java.lang.String _sck_connected(boolean z) throws java.lang.Exception {
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str, int i) throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = str;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = i;
        return "";
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int i) throws java.lang.Exception {
        if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized()) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            return false;
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = i;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        return true;
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected()) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            return true;
        }
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        return false;
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str) throws java.lang.Exception {
        try {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            int i = 0;
            for (boolean z = true; z; z = false) {
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                boolean connected = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                if (connected || (i = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)) == 0) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
                } else {
                    return i;
                }
            }
            return i;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.String message = anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage();
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(message, true);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Close();
            return 0;
        }
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.fastSubCompare(str, "READ") ? _read() : anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
