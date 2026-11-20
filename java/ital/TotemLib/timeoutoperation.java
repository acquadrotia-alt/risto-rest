package ital.TotemLib;

/* loaded from: classes.dex */
public class timeoutoperation extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
    public anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public long _vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.timeoutoperation");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.timeoutoperation.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.Timer();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0L;
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        if (i2 < i) {
            i2 = i;
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = i;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv2 = i2;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize(this.ba, "TimeOut", 1000L);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0L;
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0L;
        anywheresoftware.b4a.objects.Timer timer = this._vvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        timer.setEnabled(true);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvv0() throws java.lang.Exception {
        anywheresoftware.b4a.objects.Timer timer = this._vvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        timer.setEnabled(false);
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (ital.TotemLib.totemdata._vvv3.RowsList.getSize() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _timeout_tick() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvv4++;
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvv4 > this._vvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvvv4 <= this._vvvvvvvvvvvvvvvvvvvvvvvvvvv2) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvv0();
        this._vvvvvvvvvv3._vvvvvvv4();
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
