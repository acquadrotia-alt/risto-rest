package ital.TotemLib;

/* loaded from: classes.dex */
public class publicityview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.publicityview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.publicityview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.PanelWrapper();
        return "";
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        return this._vvvvvvvvvvvvvvvvvvvvvvvvvv5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int PerXToCurrent = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        panelWrapper.SetLayout(0, 0, PerXToCurrent, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
        labelWrapper.Initialize(this.ba, "labelPublicity");
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("Totem");
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(append.append("\n").append("ItalRetail").toString()));
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        labelWrapper.setSingleLine(false);
        labelWrapper.setTextSize(38.0f);
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper.setGravity(17);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvv5;
        android.view.View view = (android.view.View) labelWrapper.getObject();
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        int PerXToCurrent2 = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        panelWrapper2.AddView(view, 0, 0, PerXToCurrent2, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        return "";
    }

    public java.lang.String _labelpublicity_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._vvvvvvv3();
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
