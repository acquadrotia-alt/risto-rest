package ital.TotemLib;

/* loaded from: classes.dex */
public class orderdetailsview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvv0 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvv1 = null;
    public ital.TotemLib.orderlistdetailsview _vvvvvvvvvvvvvvvvvvvv2 = null;
    public ital.TotemLib.panelchooser _vvvvvvvvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.panelchooser _vvvvvvvvvvvvvvvvvvvv4 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderdetailsview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderdetailsview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvv2 = new ital.TotemLib.orderlistdetailsview();
        this._vvvvvvvvvvvvvvvvvvvv3 = new ital.TotemLib.panelchooser();
        this._vvvvvvvvvvvvvvvvvvvv4 = new ital.TotemLib.panelchooser();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvv7(int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(0, 2, 2, -16777216);
        panelWrapper.setBackground(colorDrawable.getObject());
        int i3 = (int) (i * 0.98d);
        int i4 = (int) (i2 * 0.98d);
        this._vvvvvvvvvvvvvvvvvvvv2._initialize(this.ba, this._vvvvvvvvvv3, i3, i4);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvv2._vvvvv3().getObject(), (int) (i * 0.01d), (int) (i2 * 0.01d), i3, i4);
        return panelWrapper;
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        return this._vvvvvvvvvvvvvvvvvvv0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvvv0.Initialize(this.ba, "");
        this._vvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvv7((int) (i * 0.4d), (int) (i2 * 0.9d));
        this._vvvvvvvvvvvvvvvvvvv0.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvv1.getObject(), (int) (i * 0.05d), (int) (i2 * 0.05d), (int) (i * 0.4d), (int) (i2 * 0.9d));
        ital.TotemLib.panelchooser panelchooserVar = this._vvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.BA ba2 = this.ba;
        ital.TotemLib.orderview orderviewVar2 = this._vvvvvvvvvv3;
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        panelchooserVar._initialize(ba2, orderviewVar2, ital.TotemLib.totemdata._vvv1, (int) (i * 0.4d), (int) (i2 * 0.35d), new java.lang.String[]{"Eat In", "Take Away"}, new java.lang.String[]{"consumption_eat-in.png", "consumption_take-away.png"});
        this._vvvvvvvvvvvvvvvvvvv0.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvv3._vvvvv3().getObject(), (int) (i * 0.55d), (int) (i2 * 0.05d), (int) (i * 0.4d), (int) (i2 * 0.35d));
        ital.TotemLib.panelchooser panelchooserVar2 = this._vvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.BA ba3 = this.ba;
        ital.TotemLib.orderview orderviewVar3 = this._vvvvvvvvvv3;
        ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
        panelchooserVar2._initialize(ba3, orderviewVar3, ital.TotemLib.totemdata._vv0, (int) (i * 0.4d), (int) (i2 * 0.35d), new java.lang.String[]{"Cash", "Credit Card / Bancomat"}, new java.lang.String[]{"payment-cash.png", "payment-credit-card.png"});
        this._vvvvvvvvvvvvvvvvvvv0.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvv4._vvvvv3().getObject(), (int) (i * 0.55d), (int) (i2 * 0.5d), (int) (i * 0.4d), (int) (i2 * 0.35d));
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvv2._vvvvvv7();
        this._vvvvvvvvvvvvvvvvvvvv3._vvvvvv7();
        this._vvvvvvvvvvvvvvvvvvvv4._vvvvvv7();
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
