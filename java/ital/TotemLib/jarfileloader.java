package ital.TotemLib;

/* loaded from: classes.dex */
public class jarfileloader extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public boolean _vvvvvvvvvvvvv5 = false;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.jarfileloader");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.jarfileloader.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvvvvv5 = false;
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, boolean z) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvvvvv5 = z;
        return "";
    }

    public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _vvvvvvvvvvvvv3(java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper bitmapWrapper = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
        new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
        anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvv4 = _vvvvvvvvvvvvv4(str);
        bitmapWrapper.Initialize2(_vvvvvvvvvvvvv4.getObject());
        _vvvvvvvvvvvvv4.Close();
        return bitmapWrapper;
    }

    public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvv4(java.lang.String str) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvv5) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            return anywheresoftware.b4a.objects.streams.File.OpenInput(anywheresoftware.b4a.objects.streams.File.getDirAssets(), str);
        }
        if (this._vvvvvvvvvvvvv5) {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            return anywheresoftware.b4a.objects.streams.File.OpenInput(anywheresoftware.b4a.objects.streams.File.getDirAssets(), str);
        }
        anywheresoftware.b4a.agraham.reflection.Reflection reflection = new anywheresoftware.b4a.agraham.reflection.Reflection();
        reflection.Target = this;
        reflection.Target = reflection.RunMethod("getClass");
        new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
        anywheresoftware.b4a.objects.streams.File.InputStreamWrapper inputStreamWrapper = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream) reflection.RunMethod2("getResourceAsStream", "/" + str, "java.lang.String"));
        boolean IsInitialized = inputStreamWrapper.IsInitialized();
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        if (!IsInitialized) {
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
            anywheresoftware.b4a.keywords.Common.LogImpl("46684680", "Cannot find file: " + str, -65536);
            return inputStreamWrapper;
        }
        return inputStreamWrapper;
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
