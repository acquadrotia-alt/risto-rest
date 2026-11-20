package ital.TotemLib;

/* loaded from: classes.dex */
public class ordershoppingcartview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public ital.TotemLib.orderlistdetailsview _vvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public int _vvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public int _vvvvvvvvvvvvvvvvvvvvvv6 = 0;
    public int _mpanel_items_left = 0;
    public int _mpanel_items_width = 0;
    public int _mpanel_items_top = 0;
    public int _mpanel_items_height = 0;
    public anywheresoftware.b4a.objects.ButtonWrapper _vvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.ordershoppingcartview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.ordershoppingcartview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvv5 = new ital.TotemLib.orderlistdetailsview();
        this._vvvvvvvvvvvvvvvvvvvvvv5 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvv6 = 0;
        this._mpanel_items_left = 0;
        this._mpanel_items_width = 0;
        this._mpanel_items_top = 0;
        this._mpanel_items_height = 0;
        this._vvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.ButtonWrapper();
        return "";
    }

    public java.lang.String _eventshoppingcartclose_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._ordershoppingcartclose_click();
        return "";
    }

    public java.lang.String _eventshoppingcartelevation_click() throws java.lang.Exception {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvv2(int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int PerXToCurrent = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        panelWrapper.SetLayout(0, 0, PerXToCurrent, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        this._vvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(this.ba, "EventShoppingCartElevation");
        this._vvvvvvvvvvvvvvvvvvvvvvvvv4.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(-16776961, 2, 2, -16777216);
        this._vvvvvvvvvvvvvvvvvvvvvvvvv4.setBackground(colorDrawable.getObject());
        this._vvvvvvvvvvvvvvvvvvvvvvvvv4.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvv3().getObject(), this._mpanel_items_left, this._mpanel_items_top, this._mpanel_items_width, this._mpanel_items_height);
        this._vvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize(this.ba, "EventShoppingCartClose");
        this._vvvvvvvvvvvvvvvvvvvvvvvvv4.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvvv6.getObject(), 0, (int) (i2 * 0.9d), i, (int) (i2 * 0.1d));
        android.view.View view = (android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvvv4.getObject();
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        panelWrapper.AddView(view, anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba) - i, 0, i, i2);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper2.Initialize(this.ba, "EventShoppingCartClose");
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper2.setColor(anywheresoftware.b4a.keywords.constants.Colors.ARGB(75, 0, 0, 0));
        android.view.View view2 = (android.view.View) panelWrapper2.getObject();
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        int PerXToCurrent2 = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba) - this._vvvvvvvvvvvvvvvvvvvvvvvvv4.getWidth();
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        panelWrapper.AddView(view2, 0, 0, PerXToCurrent2, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        anywheresoftware.b4a.keywords.Common common9 = this.__c;
        panelWrapper.setElevation(anywheresoftware.b4a.keywords.Common.DipToCurrent(4));
        return panelWrapper;
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvv1();
        _vvvvvv7();
        return this._vvvvvvvvvvvvvvvvvvvvvvvvv3;
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvvvvvv5 = i;
        this._vvvvvvvvvvvvvvvvvvvvvv6 = i2;
        this._mpanel_items_left = (int) (this._vvvvvvvvvvvvvvvvvvvvvv5 * 0.01d);
        this._mpanel_items_width = (int) (this._vvvvvvvvvvvvvvvvvvvvvv5 * 0.98d);
        this._mpanel_items_top = (int) (this._vvvvvvvvvvvvvvvvvvvvvv6 * 0.01d);
        this._mpanel_items_height = (int) (this._vvvvvvvvvvvvvvvvvvvvvv6 * 0.89d);
        this._vvvvvvvvvvvvvvvvvvvvvvvvv5._initialize(this.ba, this._vvvvvvvvvv3, this._mpanel_items_width, this._mpanel_items_height);
        this._vvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvv2(this._vvvvvvvvvvvvvvvvvvvvvv5, this._vvvvvvvvvvvvvvvvvvvvvv6);
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = this._vvvvvvvvvvvvvvvvvvvvvvvvv6;
        ital.TotemLib.language languageVar = this._vvvvvv1;
        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 6)));
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
