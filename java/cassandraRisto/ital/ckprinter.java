package cassandraRisto.ital;

/* loaded from: classes.dex */
public class ckprinter extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public anywheresoftware.b4a.objects.SocketWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
    public cassandraRisto.ital.ckprinter._kprinterstatus _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
    public long _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
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
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "cassandraRisto.ital.ckprinter");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", cassandraRisto.ital.ckprinter.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public static class _kprinterstatus {
        public boolean CoverOpened;
        public boolean ErrCutterCoverOpen;
        public boolean ErrCutterLocked;
        public boolean ErrEpromCorrupted;
        public boolean ErrHeadOverTemperature;
        public boolean ErrPowerSupply;
        public boolean ErrRamCorrupted;
        public boolean InError;
        public boolean IsInitialized;
        public boolean NotchAligned;
        public boolean OffLine;
        public boolean PaperEnd;
        public boolean PaperNearEnd;

        public void Initialize() {
            this.IsInitialized = true;
            this.InError = false;
            this.OffLine = false;
            this.CoverOpened = false;
            this.PaperEnd = false;
            this.PaperNearEnd = false;
            this.NotchAligned = false;
            this.ErrHeadOverTemperature = false;
            this.ErrPowerSupply = false;
            this.ErrCutterLocked = false;
            this.ErrCutterCoverOpen = false;
            this.ErrRamCorrupted = false;
            this.ErrEpromCorrupted = false;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.SocketWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 1;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 1;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new cassandraRisto.ital.ckprinter._kprinterstatus();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0L;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = -1;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = -1;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized()) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Chiusura Socket", false);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Close();
        }
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = anywheresoftware.b4a.keywords.DateTime.getNow();
        return "";
    }

    public java.lang.String _doc_barcodecode39stampa(java.lang.String str) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(72))));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(2)))).toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(9))));
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(107))));
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(69))));
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(str.length())))).append(str).toString());
        return "";
    }

    public java.lang.String _doc_barcodeean13stampa(java.lang.String str) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(72))));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(2)))).toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(9))));
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(107))));
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(67))));
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(13)))).append(str).toString());
        return "";
    }

    public java.lang.String _doc_barcodeitfstampa(java.lang.String str) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(72))));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(2)))).toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(9))));
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(107))));
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(70))));
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(str.length())))).append(str).toString());
        return "";
    }

    public java.lang.String _doc_fine() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("p1");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100))));
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100)))).toString());
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 > 0 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getSize() > 0) {
            try {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String sb3 = sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/Spooler").toString();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append3 = sb4.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(activityBA, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append("_");
                cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.String sb5 = append3.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(getActivityBA(), "0000000" + anywheresoftware.b4a.BA.NumberToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5), 7L)).append("_").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7).append("_").append(anywheresoftware.b4a.BA.ObjectToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 ? "1" : "0")).append("_.tmp").toString();
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5++;
                anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                randomAccessFile.Initialize2(sb3, sb5, false, false);
                java.util.List<java.lang.Object> object = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getObject();
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                randomAccessFile.WriteObject(object, true, randomAccessFile.CurrentPosition);
                java.util.List<java.lang.Object> object2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getObject();
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                randomAccessFile.WriteObject(object2, true, randomAccessFile.CurrentPosition);
                randomAccessFile.Close();
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb3, sb5)) {
                    cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv4(getActivityBA(), sb3, sb5, sb3, sb5.replace(".tmp", ".job"));
                }
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize();
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
            } catch (java.lang.Exception e) {
                this.ba.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA2, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
            }
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 > 0) {
            anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile2 = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
            cassandraRisto.ital.mod1 mod1Var6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String str = cassandraRisto.ital.mod1._vvvvvv1;
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            randomAccessFile2.Initialize2(str, "Tmp.NF", false, false);
            java.util.List<java.lang.Object> object3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject();
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            randomAccessFile2.WriteObject(object3, true, randomAccessFile2.CurrentPosition);
            randomAccessFile2.Close();
            anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String str2 = cassandraRisto.ital.mod1._vvvvvv1;
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            textWriterWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(str2, "Tmp.txt", false).getObject());
            int size = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                java.lang.StringBuilder append4 = new java.lang.StringBuilder().append(anywheresoftware.b4a.BA.ObjectToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Get(i)));
                anywheresoftware.b4a.keywords.Common common15 = this.__c;
                java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(13))));
                anywheresoftware.b4a.keywords.Common common16 = this.__c;
                textWriterWrapper.Write(append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(10)))).toString());
            }
            textWriterWrapper.Close();
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 == 2) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
                return "";
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
        }
        return "";
    }

    public java.lang.String _doc_img(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 > 0 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized()) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Add("__img__" + str + "__" + str2);
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(str2, str));
        return "";
    }

    public java.lang.String _doc_inizio() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 1) {
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common = this.__c;
                java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("p0");
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100))));
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100)))).toString());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("p0");
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100))));
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100)))).toString());
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                java.lang.StringBuilder append5 = sb3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("p1");
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100))));
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100)))).toString());
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                java.lang.StringBuilder append7 = sb4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("p1");
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                java.lang.StringBuilder append8 = append7.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100))));
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append8.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100)))).toString());
            }
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            java.lang.StringBuilder append9 = sb5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("B");
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            java.lang.StringBuilder append10 = append9.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(1))));
            anywheresoftware.b4a.keywords.Common common15 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append10.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(5)))).toString());
            return "";
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public java.lang.String _doc_pagfine(boolean z) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("@").toString());
            return "";
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 != 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.StringBuilder append = sb2.append("\n");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            java.lang.StringBuilder append2 = append.append("\n");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append3 = append2.append("\n");
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append4 = append3.append("\n");
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            java.lang.StringBuilder append5 = append4.append("\n");
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append5.append("\n").toString());
            if (z) {
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                _doc_testostile(false, false, false, false, false, false, false, "");
                _doc_testostampa("------------------------------------------");
                _doc_testostampa(" ");
            } else {
                switch (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
                    case 1:
                        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common15 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29)))).append("V1").toString());
                            break;
                        } else {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common16 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("m").toString());
                            break;
                        }
                    case 2:
                        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common17 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29)))).append("V0").toString());
                            break;
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common18 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("i").toString());
                            break;
                        }
                }
            }
        } else if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common19 = this.__c;
            java.lang.StringBuilder append6 = sb7.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
            anywheresoftware.b4a.keywords.Common common20 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(248)))).toString());
            anywheresoftware.b4a.keywords.Common common21 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(12))));
        }
        return "";
    }

    public java.lang.String _doc_paginizio(boolean z) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 > 0) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized())) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
            }
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = z && this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 > 0;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized())) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
            }
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29)))).append("V1").toString());
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("m").toString());
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append = sb3.append("\n");
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            java.lang.StringBuilder append2 = append.append("\n");
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            java.lang.StringBuilder append3 = append2.append("\n");
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            java.lang.StringBuilder append4 = append3.append("\n");
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            java.lang.StringBuilder append5 = append4.append("\n");
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append5.append("\n").toString());
        } else {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(sb4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27)))).append("@").toString());
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                java.lang.StringBuilder append6 = sb5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(248)))).toString());
                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(12))));
            }
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = -1;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = -1;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
        return "";
    }

    public java.lang.String _doc_testogiustifica(int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 != i) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = i;
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common = this.__c;
                java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27))));
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(97))));
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i)))).toString();
                return "";
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27))));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(97))));
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i)))).toString());
            return "";
        }
        return "";
    }

    public java.lang.String _doc_testostampa(java.lang.String str) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
            return "";
        }
        int length = str.length();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str, length, false);
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 > 0) {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IsInitialized())) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(13))));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(10)))).toString());
        } else {
            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(13))));
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(10)))).toString());
        }
        return "";
    }

    public java.lang.String _doc_testostampanrighevuote(int i) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27))));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(100))));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i)))).toString());
        return "";
    }

    public java.lang.String _doc_testostile(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, java.lang.String str) throws java.lang.Exception {
        int i;
        if (!str.equals("")) {
            _doc_testostile2(str);
            return "";
        }
        int i2 = 0;
        boolean z8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == -1;
        if (z) {
            i2 = 1;
        }
        if (z2) {
            i2 += 8;
        }
        if (z3) {
            i2 += 16;
        }
        if (z4) {
            i2 += 32;
        }
        if (z5) {
            i2 += 64;
        }
        if (z6) {
            i2 += 128;
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = z4;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27))));
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(33))));
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i2)))).toString();
        } else if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 != i2) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = i2;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27))));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(33))));
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i2)))).toString());
        }
        if (z8 || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 != z7) {
            if (z7) {
                i = 1;
            } else {
                i = 0;
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = z7;
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(66))));
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = append7.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i)))).toString();
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                java.lang.StringBuilder append8 = sb3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(66))));
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append9.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i)))).toString());
            }
        }
        return "";
    }

    public java.lang.String _doc_testostile2(java.lang.String str) throws java.lang.Exception {
        boolean z = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == -1;
        if (str.length() < 7 || str.length() > 8) {
            return "";
        }
        int i = str.charAt(0) == anywheresoftware.b4a.BA.ObjectToChar("1") ? 1 : 0;
        if (str.charAt(1) == anywheresoftware.b4a.BA.ObjectToChar("1")) {
            i += 8;
        }
        if (str.charAt(2) == anywheresoftware.b4a.BA.ObjectToChar("1")) {
            i += 16;
        }
        if (str.charAt(3) == anywheresoftware.b4a.BA.ObjectToChar("1")) {
            i += 32;
        }
        if (str.charAt(4) == anywheresoftware.b4a.BA.ObjectToChar("1")) {
            i += 64;
        }
        if (str.charAt(5) == anywheresoftware.b4a.BA.ObjectToChar("1")) {
            i += 128;
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = str.charAt(3) == anywheresoftware.b4a.BA.ObjectToChar("1");
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27))));
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(33))));
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i)))).toString();
        } else if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 != i) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = i;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(27))));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(33))));
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i)))).toString());
        }
        boolean z2 = str.charAt(6) == anywheresoftware.b4a.BA.ObjectToChar("1");
        if (z || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 != z2) {
            int i2 = z2 ? 1 : 0;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = z2;
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(66))));
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = append7.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i2)))).toString();
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                java.lang.StringBuilder append8 = sb3.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(29))));
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(66))));
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append9.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(i2)))).toString());
            }
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = str.length() > 7 && str.charAt(7) == anywheresoftware.b4a.BA.ObjectToChar("1");
        return "";
    }

    public byte[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        return anywheresoftware.b4a.keywords.Bit.InputStreamToBytes(anywheresoftware.b4a.objects.streams.File.OpenInput(str, str2).getObject());
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, boolean z) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = z;
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str, boolean z) throws java.lang.Exception {
        java.lang.String sb;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_lognf)) {
            return "";
        }
        anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        long _vvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (z) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("ERR");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            sb = append.append("\t").toString();
        } else {
            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("INF");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            sb = append2.append("\t").toString();
        }
        java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.ObjectToString(sb));
        cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.StringBuilder append4 = append3.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv2(getActivityBA(), _vvvvvvvvvvvvv0));
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        java.lang.StringBuilder append5 = append4.append("\t").append(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        java.lang.String sb3 = append5.append("\t").append(str).toString();
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.String sb5 = sb4.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/LOG").toString();
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        textWriterWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(sb5, "KPRINTER_LOG.txt", true).getObject());
        anywheresoftware.b4a.keywords.Common common9 = this.__c;
        textWriterWrapper.WriteLine(sb3.replace("\n", ""));
        textWriterWrapper.Close();
        return "";
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 == 0) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            long now = anywheresoftware.b4a.keywords.DateTime.getNow() - this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (now >= 0 && now < 200) {
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 200);
            }
        }
        if (!str.equals("")) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = str;
        }
        anywheresoftware.b4a.agraham.threading.Threading threading = new anywheresoftware.b4a.agraham.threading.Threading();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize("sck");
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTimeOut(7000);
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_disconnettiprt) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Connect(this.ba, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, 9100, 3000);
            int i = 0;
            while (true) {
                boolean connected = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                if (connected || i >= 30) {
                    break;
                }
                threading.Sleep(100);
                i++;
            }
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected())) {
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                java.lang.String str2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                if (!cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv7(activityBA, str2, "Status", 2, 5, true).equals("Host unreachable")) {
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Retry Connection", true);
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Connect(this.ba, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, 9100, 6000);
                    int i2 = 0;
                    while (true) {
                        boolean connected2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
                        anywheresoftware.b4a.keywords.Common common6 = this.__c;
                        if (connected2 || i2 >= 65) {
                            break;
                        }
                        threading.Sleep(100);
                        i2++;
                    }
                } else {
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer Off", true);
                    return 250;
                }
            }
        } else {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Connect(this.ba, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, 9100, 6000);
            int i3 = 0;
            while (true) {
                boolean connected3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                if (connected3 || i3 >= 65) {
                    break;
                }
                threading.Sleep(100);
                i3++;
            }
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected()) {
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer Connected", false);
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper(), this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getOutputStream());
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getInputStream());
            return 0;
        }
        anywheresoftware.b4a.keywords.Common common11 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer Connection Error", true);
        return 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x083b, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_disconnettiprt) != false) goto L249;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        int ReadBytes;
        int ReadBytes2;
        int ReadBytes3;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
            return "";
        }
        byte[] bArr = new byte[1024];
        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar = new cassandraRisto.ital.ckprinter._kprinterstatus();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(16))));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(4))));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(20)))).toString()) == 250) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _kprinterstatusVar;
            cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            _kprinterstatusVar2.OffLine = true;
            cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            _kprinterstatusVar3.InError = true;
            return "";
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _kprinterstatusVar;
        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        _kprinterstatusVar4.OffLine = true;
        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        _kprinterstatusVar5.InError = true;
        try {
            ReadBytes = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ReadBytes(bArr, 0, bArr.length);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore ReadStatus 1", true);
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("") != 0) {
                return "";
            }
            ReadBytes = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ReadBytes(bArr, 0, bArr.length);
        }
        if (ReadBytes == 6) {
            if (bArr[0] == 16 && bArr[1] == 15) {
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                _kprinterstatusVar6.OffLine = false;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar7.PaperEnd = anywheresoftware.b4a.keywords.Bit.And(bArr[2], 1) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit2 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar8.PaperNearEnd = anywheresoftware.b4a.keywords.Bit.And(bArr[2], 4) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit3 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar9.CoverOpened = anywheresoftware.b4a.keywords.Bit.And(bArr[3], 1) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit4 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar10.ErrHeadOverTemperature = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 1) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit5 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar11.ErrPowerSupply = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 8) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common15 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit6 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar12.NotchAligned = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 128) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common16 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit7 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar13.ErrCutterLocked = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 1) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common17 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit8 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar14.ErrCutterCoverOpen = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 2) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common18 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit9 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar15.ErrRamCorrupted = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 4) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common19 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit10 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar16.ErrEpromCorrupted = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 8) > 0;
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.PaperEnd || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.CoverOpened || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrHeadOverTemperature || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrPowerSupply || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrCutterLocked || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrCutterCoverOpen || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrRamCorrupted || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrEpromCorrupted;
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_lognf) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    anywheresoftware.b4a.keywords.Common common20 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit11 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[2], 1)));
                    anywheresoftware.b4a.keywords.Common common21 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit12 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[2], 4)));
                    anywheresoftware.b4a.keywords.Common common22 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit13 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[3], 1)));
                    anywheresoftware.b4a.keywords.Common common23 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit14 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 1)));
                    anywheresoftware.b4a.keywords.Common common24 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit15 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 8)));
                    anywheresoftware.b4a.keywords.Common common25 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit16 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append8 = append7.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 128)));
                    anywheresoftware.b4a.keywords.Common common26 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit17 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 1)));
                    anywheresoftware.b4a.keywords.Common common27 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit18 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append10 = append9.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 2)));
                    anywheresoftware.b4a.keywords.Common common28 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit19 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.StringBuilder append11 = append10.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 4)));
                    anywheresoftware.b4a.keywords.Common common29 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit20 = anywheresoftware.b4a.keywords.Common.Bit;
                    java.lang.String sb3 = append11.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 8))).toString();
                    if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError) {
                        anywheresoftware.b4a.keywords.Common common30 = this.__c;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer in Error 1:" + sb3, true);
                    } else {
                        anywheresoftware.b4a.keywords.Common common31 = this.__c;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer Status 1:" + sb3, false);
                    }
                }
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError) {
                    cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 1000);
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    anywheresoftware.b4a.keywords.Common common32 = this.__c;
                    java.lang.StringBuilder append12 = sb4.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(16))));
                    anywheresoftware.b4a.keywords.Common common33 = this.__c;
                    java.lang.StringBuilder append13 = append12.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(4))));
                    anywheresoftware.b4a.keywords.Common common34 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append13.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(20)))).toString());
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _kprinterstatusVar;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar17 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common35 = this.__c;
                    _kprinterstatusVar17.OffLine = true;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar18 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common36 = this.__c;
                    _kprinterstatusVar18.InError = true;
                    try {
                        ReadBytes3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ReadBytes(bArr, 0, bArr.length);
                    } catch (java.lang.Exception e2) {
                        this.ba.setLastException(e2);
                        anywheresoftware.b4a.keywords.Common common37 = this.__c;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore ReadStatus 2", true);
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("") != 0) {
                            return "";
                        }
                        ReadBytes3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ReadBytes(bArr, 0, bArr.length);
                    }
                    if (ReadBytes3 == 6 && bArr[0] == 16 && bArr[1] == 15) {
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar19 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common38 = this.__c;
                        _kprinterstatusVar19.OffLine = false;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar20 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common39 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit21 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar20.PaperEnd = anywheresoftware.b4a.keywords.Bit.And(bArr[2], 1) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar21 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common40 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit22 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar21.PaperNearEnd = anywheresoftware.b4a.keywords.Bit.And(bArr[2], 4) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar22 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common41 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit23 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar22.CoverOpened = anywheresoftware.b4a.keywords.Bit.And(bArr[3], 1) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar23 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common42 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit24 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar23.ErrHeadOverTemperature = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 1) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar24 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common43 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit25 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar24.ErrPowerSupply = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 8) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar25 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common44 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit26 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar25.NotchAligned = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 128) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar26 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common45 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit27 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar26.ErrCutterLocked = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 1) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar27 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common46 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit28 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar27.ErrCutterCoverOpen = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 2) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar28 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common47 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit29 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar28.ErrRamCorrupted = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 4) > 0;
                        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar29 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.keywords.Common common48 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit30 = anywheresoftware.b4a.keywords.Common.Bit;
                        _kprinterstatusVar29.ErrEpromCorrupted = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 8) > 0;
                        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.PaperEnd || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.CoverOpened || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrHeadOverTemperature || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrPowerSupply || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrCutterLocked || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrCutterCoverOpen || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrRamCorrupted || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrEpromCorrupted;
                        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_lognf) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common49 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit31 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append14 = sb5.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[2], 1)));
                            anywheresoftware.b4a.keywords.Common common50 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit32 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append15 = append14.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[2], 4)));
                            anywheresoftware.b4a.keywords.Common common51 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit33 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append16 = append15.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[3], 1)));
                            anywheresoftware.b4a.keywords.Common common52 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit34 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append17 = append16.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 1)));
                            anywheresoftware.b4a.keywords.Common common53 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit35 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append18 = append17.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 8)));
                            anywheresoftware.b4a.keywords.Common common54 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit36 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append19 = append18.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 128)));
                            anywheresoftware.b4a.keywords.Common common55 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit37 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append20 = append19.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 1)));
                            anywheresoftware.b4a.keywords.Common common56 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit38 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append21 = append20.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 2)));
                            anywheresoftware.b4a.keywords.Common common57 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit39 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.StringBuilder append22 = append21.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 4)));
                            anywheresoftware.b4a.keywords.Common common58 = this.__c;
                            anywheresoftware.b4a.keywords.Bit bit40 = anywheresoftware.b4a.keywords.Common.Bit;
                            java.lang.String sb6 = append22.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 8))).toString();
                            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError) {
                                anywheresoftware.b4a.keywords.Common common59 = this.__c;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer in Error 2:" + sb6, true);
                            } else {
                                anywheresoftware.b4a.keywords.Common common60 = this.__c;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer Status 2:" + sb6, false);
                            }
                        }
                    }
                }
            }
        } else {
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), 1000);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common61 = this.__c;
            java.lang.StringBuilder append23 = sb7.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(16))));
            anywheresoftware.b4a.keywords.Common common62 = this.__c;
            java.lang.StringBuilder append24 = append23.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(4))));
            anywheresoftware.b4a.keywords.Common common63 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append24.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(20)))).toString());
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _kprinterstatusVar;
            cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar30 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.keywords.Common common64 = this.__c;
            _kprinterstatusVar30.OffLine = true;
            cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar31 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.keywords.Common common65 = this.__c;
            _kprinterstatusVar31.InError = true;
            try {
                ReadBytes2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ReadBytes(bArr, 0, bArr.length);
            } catch (java.lang.Exception e3) {
                this.ba.setLastException(e3);
                anywheresoftware.b4a.keywords.Common common66 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore ReadStatus 3", true);
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("") != 0) {
                    return "";
                }
                ReadBytes2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ReadBytes(bArr, 0, bArr.length);
            }
            if (ReadBytes2 == 6) {
                if (bArr[0] == 16 && bArr[1] == 15) {
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar32 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common67 = this.__c;
                    _kprinterstatusVar32.OffLine = false;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar33 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common68 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit41 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar33.PaperEnd = anywheresoftware.b4a.keywords.Bit.And(bArr[2], 1) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar34 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common69 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit42 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar34.PaperNearEnd = anywheresoftware.b4a.keywords.Bit.And(bArr[2], 4) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar35 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common70 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit43 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar35.CoverOpened = anywheresoftware.b4a.keywords.Bit.And(bArr[3], 1) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar36 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common71 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit44 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar36.ErrHeadOverTemperature = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 1) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar37 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common72 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit45 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar37.ErrPowerSupply = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 8) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar38 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common73 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit46 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar38.NotchAligned = anywheresoftware.b4a.keywords.Bit.And(bArr[4], 128) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar39 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common74 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit47 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar39.ErrCutterLocked = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 1) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar40 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common75 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit48 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar40.ErrCutterCoverOpen = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 2) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar41 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common76 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit49 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar41.ErrRamCorrupted = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 4) > 0;
                    cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar42 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.keywords.Common common77 = this.__c;
                    anywheresoftware.b4a.keywords.Bit bit50 = anywheresoftware.b4a.keywords.Common.Bit;
                    _kprinterstatusVar42.ErrEpromCorrupted = anywheresoftware.b4a.keywords.Bit.And(bArr[5], 8) > 0;
                    this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.PaperEnd || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.CoverOpened || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrHeadOverTemperature || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrPowerSupply || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrCutterLocked || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrCutterCoverOpen || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrRamCorrupted || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrEpromCorrupted;
                    cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_lognf) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        anywheresoftware.b4a.keywords.Common common78 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit51 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append25 = sb8.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[2], 1)));
                        anywheresoftware.b4a.keywords.Common common79 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit52 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append26 = append25.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[2], 4)));
                        anywheresoftware.b4a.keywords.Common common80 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit53 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append27 = append26.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[3], 1)));
                        anywheresoftware.b4a.keywords.Common common81 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit54 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append28 = append27.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 1)));
                        anywheresoftware.b4a.keywords.Common common82 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit55 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append29 = append28.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 8)));
                        anywheresoftware.b4a.keywords.Common common83 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit56 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append30 = append29.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[4], 128)));
                        anywheresoftware.b4a.keywords.Common common84 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit57 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append31 = append30.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 1)));
                        anywheresoftware.b4a.keywords.Common common85 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit58 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append32 = append31.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 2)));
                        anywheresoftware.b4a.keywords.Common common86 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit59 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.StringBuilder append33 = append32.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 4)));
                        anywheresoftware.b4a.keywords.Common common87 = this.__c;
                        anywheresoftware.b4a.keywords.Bit bit60 = anywheresoftware.b4a.keywords.Common.Bit;
                        java.lang.String sb9 = append33.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[5], 8))).toString();
                        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError) {
                            anywheresoftware.b4a.keywords.Common common88 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer in Error 3:" + sb9, true);
                        } else {
                            anywheresoftware.b4a.keywords.Common common89 = this.__c;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer Status 3:" + sb9, false);
                        }
                    }
                }
            } else if (ReadBytes2 == -1) {
                if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected()) {
                    anywheresoftware.b4a.keywords.Common common90 = this.__c;
                    cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar43 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common91 = this.__c;
                _kprinterstatusVar43.OffLine = false;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar44 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common92 = this.__c;
                _kprinterstatusVar44.InError = false;
                anywheresoftware.b4a.keywords.Common common93 = this.__c;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Printer Error in -1", true);
            }
        }
        return "";
    }

    public cassandraRisto.ital.ckprinter._kprinterstatus _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        int ReadBytes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(16))));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(4))));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(2)))).toString());
        byte[] bArr = new byte[1024];
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new cassandraRisto.ital.ckprinter._kprinterstatus();
        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        _kprinterstatusVar.OffLine = true;
        cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        _kprinterstatusVar2.InError = true;
        try {
            ReadBytes = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ReadBytes(bArr, 0, bArr.length);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore ReadStatusEP 1", true);
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("") != 0) {
                return this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            }
            ReadBytes = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ReadBytes(bArr, 0, bArr.length);
        }
        if (ReadBytes == 1) {
            cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            _kprinterstatusVar3.OffLine = false;
            if (bArr[0] != 18) {
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar4.CoverOpened = anywheresoftware.b4a.keywords.Bit.And(bArr[0], 4) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit2 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar5.PaperEnd = anywheresoftware.b4a.keywords.Bit.And(bArr[0], 32) > 0;
                cassandraRisto.ital.ckprinter._kprinterstatus _kprinterstatusVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit3 = anywheresoftware.b4a.keywords.Common.Bit;
                _kprinterstatusVar6.ErrPowerSupply = anywheresoftware.b4a.keywords.Bit.And(bArr[0], 64) > 0;
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.PaperEnd || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.CoverOpened || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrHeadOverTemperature || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrPowerSupply || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrCutterLocked || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrCutterCoverOpen || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrRamCorrupted || this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ErrEpromCorrupted;
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_lognf) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit4 = anywheresoftware.b4a.keywords.Common.Bit;
                java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[0], 4)));
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit5 = anywheresoftware.b4a.keywords.Common.Bit;
                java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[0], 32)));
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                anywheresoftware.b4a.keywords.Bit bit6 = anywheresoftware.b4a.keywords.Common.Bit;
                java.lang.String sb3 = append4.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Bit.And(bArr[0], 64))).toString();
                if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InError) {
                    anywheresoftware.b4a.keywords.Common common14 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("PrinterEP in Error :" + sb3, true);
                } else {
                    anywheresoftware.b4a.keywords.Common common15 = this.__c;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("PrinterEP Status :" + sb3, false);
                }
            }
        }
        return this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
    }

    public java.lang.String _sck_connected(boolean z) throws java.lang.Exception {
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, int i, boolean z) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        if (str.length() > 0) {
            int length = str.length();
            for (int i2 = 1; i2 <= length; i2++) {
                char charAt = str.charAt(i2 - 1);
                anywheresoftware.b4a.keywords.Common common = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Asc(charAt) >= 42) {
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Asc(charAt) <= 63) {
                        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(charAt)));
                    }
                }
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Asc(charAt) >= 65) {
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Asc(charAt) <= 90) {
                        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(charAt)));
                    }
                }
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Asc(charAt) >= 97) {
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Asc(charAt) <= 122) {
                        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(charAt)));
                    }
                }
                switch (anywheresoftware.b4a.BA.switchObjectToInt(java.lang.Character.valueOf(charAt), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("è")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("é")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("à")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ì")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ò")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ù")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("À")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Á")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("È")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("É")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ì")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Í")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ò")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ó")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ù")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ú")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("€")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("_")))) {
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

    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0190 A[EDGE_INSN: B:59:0x0190->B:60:0x0190 BREAK  A[LOOP:0: B:29:0x00b7->B:42:0x0185], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str) throws java.lang.Exception {
        int i;
        boolean z;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 > 0) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized())) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize();
            }
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized())) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
            }
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getSize() == 0) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Add(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Add(java.lang.Boolean.valueOf(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Add(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Add(java.lang.Integer.valueOf(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Add(java.lang.Integer.valueOf(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Add(java.lang.Boolean.valueOf(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Add(str);
            return 0;
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 > 0) {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized())) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Add(str);
            if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 == 2) {
                return 0;
            }
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str, false);
        boolean connected = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        if (connected) {
            i = 0;
        } else {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_disconnettiprt) {
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                boolean z2 = false;
                int i2 = 0;
                for (int i3 = 0; i3 <= 10; i3++) {
                    if (i3 == 1) {
                        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            anywheresoftware.b4a.keywords.Common common7 = this.__c;
                            if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.equals("")) {
                                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                anywheresoftware.b4a.BA activityBA = getActivityBA();
                                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verifica stampante in corso (" + this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 + ")");
                                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA, ObjectToCharSequence, false);
                            } else {
                                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                                anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Verifica stampante in corso ...");
                                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA2, ObjectToCharSequence2, false);
                            }
                            anywheresoftware.b4a.keywords.Common common12 = this.__c;
                            anywheresoftware.b4a.keywords.Common.DoEvents();
                            z2 = true;
                            i2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("");
                            if (i2 != 0) {
                                break;
                            }
                            if (i2 == 250) {
                                boolean z3 = z2;
                                i = i2;
                                z = z3;
                                break;
                            }
                        }
                    }
                    if (i3 > 1) {
                        cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            anywheresoftware.b4a.keywords.Common common13 = this.__c;
                            anywheresoftware.b4a.keywords.Common.DoEvents();
                        }
                    }
                    i2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("");
                    if (i2 != 0) {
                    }
                }
                boolean z4 = z2;
                i = i2;
                z = z4;
                if (z) {
                    anywheresoftware.b4a.keywords.Common common14 = this.__c;
                    anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
                }
            } else {
                i = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("");
            }
            if (i != 0) {
                return i;
            }
        }
        try {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.WriteBytes(str.getBytes("UTF8"), 0, str.length());
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Flush();
            return i;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common15 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore Flush", true);
            int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("");
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 == 0) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.WriteBytes(str.getBytes("UTF8"), 0, str.length());
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Flush();
                return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
            }
            return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r0 != 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6 A[EDGE_INSN: B:34:0x00e6->B:35:0x00e6 BREAK  A[LOOP:0: B:6:0x0029->B:19:0x00b6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(byte[] bArr) throws java.lang.Exception {
        int i;
        boolean z;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.String BytesToString = anywheresoftware.b4a.keywords.Common.BytesToString(bArr, 0, bArr.length, "UTF8");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(BytesToString, false);
        boolean connected = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getConnected();
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        if (connected) {
            i = 0;
        } else {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_disconnettiprt) {
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                boolean z2 = false;
                int i2 = 0;
                for (int i3 = 0; i3 <= 10; i3++) {
                    if (i3 == 1) {
                        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            anywheresoftware.b4a.keywords.Common common5 = this.__c;
                            if (!this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.equals("")) {
                                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                                anywheresoftware.b4a.BA activityBA = getActivityBA();
                                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verifica stampante in corso (" + this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 + ")");
                                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                                anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA, ObjectToCharSequence, false);
                            } else {
                                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                                anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Verifica stampante in corso ...");
                                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA2, ObjectToCharSequence2, false);
                            }
                            anywheresoftware.b4a.keywords.Common common10 = this.__c;
                            anywheresoftware.b4a.keywords.Common.DoEvents();
                            z2 = true;
                            i2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("");
                            if (i2 != 0) {
                                break;
                            }
                            if (i2 == 250) {
                                boolean z3 = z2;
                                i = i2;
                                z = z3;
                                break;
                            }
                        }
                    }
                    if (i3 > 1) {
                        cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            anywheresoftware.b4a.keywords.Common common11 = this.__c;
                            anywheresoftware.b4a.keywords.Common.DoEvents();
                        }
                    }
                    i2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("");
                    if (i2 != 0) {
                    }
                }
                boolean z4 = z2;
                i = i2;
                z = z4;
                if (z) {
                    anywheresoftware.b4a.keywords.Common common12 = this.__c;
                    anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
                }
            } else {
                i = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("");
            }
        }
        try {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.WriteBytes(bArr, 0, bArr.length);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore Invio Img", true);
            i = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4("");
            if (i == 0) {
                this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.WriteBytes(bArr, 0, bArr.length);
            }
        }
        return i;
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
