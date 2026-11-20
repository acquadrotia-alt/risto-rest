package cassandraRisto.ital;

/* loaded from: classes.dex */
public class httpjob extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
    public java.lang.String _password = "";
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
    public java.lang.Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
    public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public java.lang.Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
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
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "cassandraRisto.ital.httpjob");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", cassandraRisto.ital.httpjob.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public static class _multipartfiledata {
        public java.lang.String ContentType;
        public java.lang.String Dir;
        public java.lang.String FileName;
        public boolean IsInitialized;
        public java.lang.String KeyName;

        public void Initialize() {
            this.IsInitialized = true;
            this.Dir = "";
            this.FileName = "";
            this.KeyName = "";
            this.ContentType = "";
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str) throws java.lang.Exception {
        return (this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.equals("") || str.contains(":")) ? str : this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 + "://" + str;
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
        this._password = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new java.lang.Object();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new java.lang.Object();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "https://invalid-url/";
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "https";
        return "";
    }

    public java.lang.String _complete(int i) throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = anywheresoftware.b4a.BA.NumberToString(i);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(this.ba, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3, "JobDone", this);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str) throws java.lang.Exception {
        try {
            str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeDelete(str);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Invalid link: ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9173998085", append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString(), 0);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeDelete(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.BA ba = this.ba;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str, java.lang.String[] strArr) throws java.lang.Exception {
        try {
            str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeDelete(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str, strArr));
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Invalid link: ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9174063621", append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString(), 0);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeDelete(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, strArr));
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.BA ba = this.ba;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str) throws java.lang.Exception {
        try {
            str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeGet(str);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Invalid link: ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9173801477", append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString(), 0);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeGet(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.BA ba = this.ba;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str, java.lang.String[] strArr) throws java.lang.Exception {
        try {
            str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeGet(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str, strArr));
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Invalid link: ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9173867013", append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString(), 0);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeGet(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, strArr));
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.BA ba = this.ba;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, java.lang.String[] strArr) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        stringBuilderWrapper.Append(str);
        if (strArr.length > 0) {
            stringBuilderWrapper.Append("?");
        }
        anywheresoftware.b4a.objects.StringUtils stringUtils = new anywheresoftware.b4a.objects.StringUtils();
        int length = strArr.length - 1;
        for (int i = 0; i <= length; i += 2) {
            if (i > 0) {
                stringBuilderWrapper.Append("&");
            }
            stringBuilderWrapper.Append(stringUtils.EncodeUrl(strArr[i], "UTF8")).Append("=");
            stringBuilderWrapper.Append(stringUtils.EncodeUrl(strArr[i + 1], "UTF8"));
        }
        return stringBuilderWrapper.ToString();
    }

    public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        return anywheresoftware.b4a.keywords.Common.LoadBitmap(cassandraRisto.ital.httputils2service._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
    }

    public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(int i, int i2, boolean z) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        return anywheresoftware.b4a.keywords.Common.LoadBitmapResize(cassandraRisto.ital.httputils2service._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4, i, i2, z);
    }

    public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        return anywheresoftware.b4a.keywords.Common.LoadBitmapSample(cassandraRisto.ital.httputils2service._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4, i, i2);
    }

    public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        return anywheresoftware.b4a.objects.streams.File.OpenInput(cassandraRisto.ital.httputils2service._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
    }

    public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws java.lang.Exception {
        return this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("UTF8");
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.objects.streams.File.TextReaderWrapper textReaderWrapper = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        textReaderWrapper.Initialize2(anywheresoftware.b4a.objects.streams.File.OpenInput(cassandraRisto.ital.httputils2service._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4).getObject(), str);
        java.lang.String ReadAll = textReaderWrapper.ReadAll();
        textReaderWrapper.Close();
        return ReadAll;
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str) throws java.lang.Exception {
        try {
            str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeHead(str);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Invalid link: ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9173539333", append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString(), 0);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializeHead(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.BA ba = this.ba;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, java.lang.String str, java.lang.Object obj) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = str;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = obj;
        return "";
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper outputStreamWrapper, boolean z) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        if (!z) {
            outputStreamWrapper.WriteBytes(new byte[]{13, 10}, 0, 2);
            return z;
        }
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        return false;
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str, byte[] bArr) throws java.lang.Exception {
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
        try {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializePatch2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, bArr);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Invalid link: ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9173473804", append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)).append("").toString(), 0);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializePatch2(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, bArr);
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.BA ba = this.ba;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(str, str2.getBytes("UTF8"));
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str, byte[] bArr) throws java.lang.Exception {
        try {
            str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializePost2(str, bArr);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Invalid link: ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9173211653", append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString(), 0);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializePost2(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, bArr);
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.BA ba = this.ba;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        if (str2.equals(anywheresoftware.b4a.objects.streams.File.getDirAssets())) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9173735944", "Cannot send files from the assets folder.", 0);
            return "";
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        int Size = (int) anywheresoftware.b4a.objects.streams.File.Size(str2, str3);
        new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.InputStreamWrapper OpenInput = anywheresoftware.b4a.objects.streams.File.OpenInput(str2, str3);
        if (Size < 1000000) {
            anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper outputStreamWrapper = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
            outputStreamWrapper.InitializeToBytesArray(Size);
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy2(OpenInput.getObject(), outputStreamWrapper.getObject());
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, outputStreamWrapper.ToBytesArray());
        } else {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializePost(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, OpenInput.getObject(), Size);
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.BA ba = this.ba;
            cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
            anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str, anywheresoftware.b4a.objects.collections.Map map, anywheresoftware.b4a.objects.collections.List list) throws java.lang.Exception {
        anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper outputStreamWrapper = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
        outputStreamWrapper.InitializeToBytesArray(0);
        byte[] bArr = new byte[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(13))));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.String sb2 = append.append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(10)))).toString();
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        boolean z = true;
        if (map != null && map.IsInitialized()) {
            anywheresoftware.b4a.BA.IterableList Keys = map.Keys();
            int size = Keys.getSize();
            int i = 0;
            while (i < size) {
                java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(Keys.Get(i));
                java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(map.Get(ObjectToString));
                boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(outputStreamWrapper, z);
                java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("--");
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", "---------------------------1461124740692")).append("\nContent-Disposition: form-data; name=\"");
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ObjectToString)).append("\"\n\n");
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                java.lang.String sb3 = append4.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ObjectToString2)).append("").toString();
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                byte[] bytes = sb3.replace("\n", sb2).getBytes("UTF8");
                outputStreamWrapper.WriteBytes(bytes, 0, bytes.length);
                i++;
                z = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            }
        }
        if (list != null && list.IsInitialized()) {
            int size2 = list.getSize();
            int i2 = 0;
            boolean z2 = z;
            while (i2 < size2) {
                cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = (cassandraRisto.ital.httpjob._multipartfiledata) list.Get(i2);
                boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(outputStreamWrapper, z2);
                java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("--");
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", "---------------------------1461124740692")).append("\nContent-Disposition: form-data; name=\"");
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _multipartfiledataVar.KeyName)).append("\"; filename=\"");
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                java.lang.StringBuilder append8 = append7.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _multipartfiledataVar.FileName)).append("\"\nContent-Type: ");
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                java.lang.String sb4 = append8.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _multipartfiledataVar.ContentType)).append("\n\n").toString();
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                byte[] bytes2 = sb4.replace("\n", sb2).getBytes("UTF8");
                outputStreamWrapper.WriteBytes(bytes2, 0, bytes2.length);
                new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.InputStreamWrapper OpenInput = anywheresoftware.b4a.objects.streams.File.OpenInput(_multipartfiledataVar.Dir, _multipartfiledataVar.FileName);
                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Copy2(OpenInput.getObject(), outputStreamWrapper.getObject());
                i2++;
                z2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52;
            }
            z = z2;
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(outputStreamWrapper, z);
        java.lang.StringBuilder append9 = new java.lang.StringBuilder().append("--");
        anywheresoftware.b4a.keywords.Common common15 = this.__c;
        java.lang.String sb5 = append9.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", "---------------------------1461124740692")).append("--\n").toString();
        anywheresoftware.b4a.keywords.Common common16 = this.__c;
        byte[] bytes3 = sb5.replace("\n", sb2).getBytes("UTF8");
        outputStreamWrapper.WriteBytes(bytes3, 0, bytes3.length);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(str, outputStreamWrapper.ToBytesArray());
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetContentType("multipart/form-data; boundary=---------------------------1461124740692");
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetContentEncoding("UTF8");
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(str, str2.getBytes("UTF8"));
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, byte[] bArr) throws java.lang.Exception {
        try {
            str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializePut2(str, bArr);
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Invalid link: ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("9173342725", append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString(), 0);
            this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.InitializePut2(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, bArr);
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.BA ba = this.ba;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str, str2.getBytes("UTF8"));
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.httputils2service httputils2serviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.httputils2service._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
