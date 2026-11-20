package ital.TotemLib;

/* loaded from: classes.dex */
public class orderdetailsproductvariationsview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvv7 = null;
    public ital.TotemLib.totemdata._totemproducttype _vvvvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.totemdata._totemproducttype _vvvvvvvvvvvvvvvvvvv1 = null;
    public anywheresoftware.b4a.objects.ImageViewWrapper _vvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _vvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvv5 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvv6 = null;
    public ital.TotemLib.orderproductvariationsview _vvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _vvvvvvvvvvvvvvvvvv5 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderdetailsproductvariationsview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderdetailsproductvariationsview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _buttonaddproductwithvariationtoorder_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._orderaddproduct_itemclick(this._vvvvvvvvvvvvvvvvvvv1);
        _vvvvvvvvvvvvvvvv4();
        return "";
    }

    public java.lang.String _buttoninfoproduct_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._orderinfoproductshow_click(this._vvvvvvvvvvvvvvvvvv0);
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvv0 = new ital.TotemLib.totemdata._totemproducttype();
        this._vvvvvvvvvvvvvvvvvvv1 = new ital.TotemLib.totemdata._totemproducttype();
        this._vvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
        this._vvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.ButtonWrapper();
        this._vvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvvvvvvvvv3 = new ital.TotemLib.orderproductvariationsview();
        this._vvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.ButtonWrapper();
        return "";
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvv0() throws java.lang.Exception {
        return this._vvvvvvvvvvvvvvvvvv7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvv6(int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        panelWrapper.SetLayout(0, 0, i, i2);
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        this._vvvvvvvvvvvvvvvvvvv2 = ital.TotemLib.utility._v7(this.ba, this._vvvvvvvvvvvvvvvvvvv1.ImageFileName, "", "", (int) (panelWrapper.getWidth() * 0.45d), (int) (panelWrapper.getHeight() * 0.45d));
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvv2.getObject(), (int) (panelWrapper.getWidth() * 0.02d), (int) (panelWrapper.getHeight() * 0.02d), (int) (panelWrapper.getWidth() * 0.45d), (int) (panelWrapper.getHeight() * 0.45d));
        this._vvvvvvvvvvvvvvvvvvv3.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvvvvvv3;
        ital.TotemLib.utility utilityVar2 = this._vvvvv7;
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.utility._vv3(this.ba, this._vvvvvvvvvvvvvvvvvvv1.Price)));
        this._vvvvvvvvvvvvvvvvvvv3.setTextSize((float) (i2 / 14.0d));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = this._vvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
        labelWrapper2.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper3 = this._vvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper3.setGravity(21);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvv3.getObject(), (int) (panelWrapper.getWidth() * 0.1d), (int) (panelWrapper.getHeight() * 0.02d), (int) (panelWrapper.getWidth() * 0.35d), (int) (panelWrapper.getHeight() * 0.1d));
        this._vvvvvvvvvvvvvvvvvvv5.Initialize(this.ba, "");
        this._vvvvvvvvvvvvvvvvvvv5.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._vvvvvvvvvvvvvvvvvvv1.Name));
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv2.ShowProductCode) {
            this._vvvvvvvvvvvvvvvvvvv5.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._vvvvvvvvvvvvvvvvvvv5.getText() + " (" + this._vvvvvvvvvvvvvvvvvvv1.Code + ")"));
        }
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper4 = this._vvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper4.setTextColor(-16777216);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper5 = this._vvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper5.setColor(-3355444);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvv5.getObject(), (int) (panelWrapper.getWidth() * 0.5d), (int) (panelWrapper.getHeight() * 0.05d), (int) (panelWrapper.getWidth() * 0.4d), (int) (panelWrapper.getHeight() * 0.1d));
        this._vvvvvvvvvvvvvvvvvvv6.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper6 = this._vvvvvvvvvvvvvvvvvvv6;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper6.setTextColor(-16777216);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper7 = this._vvvvvvvvvvvvvvvvvvv6;
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper7.setColor(-3355444);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvv6.getObject(), (int) (panelWrapper.getWidth() * 0.5d), (int) (panelWrapper.getHeight() * 0.17d), (int) (panelWrapper.getWidth() * 0.4d), (int) (panelWrapper.getHeight() * 0.22d));
        this._vvvvvvvvvvvvvvvvvvv4.Initialize(this.ba, "buttonInfoProduct");
        this._vvvvvvvvvvvvvvvvvvv4.setTextSize((float) (i2 / 30.0d));
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvv4.getObject(), (int) (panelWrapper.getWidth() * 0.53d), (int) (panelWrapper.getHeight() * 0.4d), (int) (panelWrapper.getWidth() * 0.32d), (int) (panelWrapper.getHeight() * 0.1d));
        ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar = this._vvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        this._vvvvvvvvvvvvvvvvv3._initialize(this.ba, this._vvvvvvvvvv3, this._vvvvvvvvvvvvvvvvvvv3, (int) (i * 0.85d), (int) (i2 * 0.08d), _totemproducttypeVar, (ital.TotemLib.totemdata._totemmenulistproducttype) anywheresoftware.b4a.keywords.Common.Null);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvv3._vvvvv3().getObject(), (int) (panelWrapper.getWidth() * 0.05d), (int) (panelWrapper.getHeight() * 0.5d), (int) (panelWrapper.getWidth() * 0.85d), (int) (panelWrapper.getHeight() * 0.4d));
        this._vvvvvvvvvvvvvvvvvv5.Initialize(this.ba, "buttonAddProductWithVariationToOrder");
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvv5.getObject(), (int) (panelWrapper.getWidth() * 0.3d), (int) (panelWrapper.getHeight() * 0.9d), (int) (panelWrapper.getWidth() * 0.4d), (int) (panelWrapper.getHeight() * 0.1d));
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _vvvvvvvvvvvvvvvv4() throws java.lang.Exception {
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        this._vvvvvvvvvvvvvvvvvvv1 = ital.TotemLib.totemdata._vvv4(this.ba, this._vvvvvvvvvvvvvvvvvv0);
        this._vvvvvvvvvvvvvvvvvv7.RemoveAllViews();
        new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvv7.AddView((android.view.View) _vvvvvvvvvvvvvvvvvv6(this._vvvvvvvvvvvvvvvvvv7.getWidth(), this._vvvvvvvvvvvvvvvvvv7.getHeight()).getObject(), 0, 0, this._vvvvvvvvvvvvvvvvvv7.getWidth(), this._vvvvvvvvvvvvvvvvvv7.getHeight());
        _vvvvvv7();
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2, ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvv0 = _totemproducttypeVar;
        this._vvvvvvvvvvvvvvvvvv7.Initialize(this.ba, "");
        this._vvvvvvvvvvvvvvvvvv7.SetLayout(0, 0, i, i2);
        _vvvvvvvvvvvvvvvv4();
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvvvvvv6;
        java.lang.String[] strArr = this._vvvvvvvvvvvvvvvvvvv1.Description;
        ital.TotemLib.language languageVar = this._vvvvvv1;
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = this._vvvvvvvvvvvvvvvvvvv4;
        ital.TotemLib.language languageVar2 = this._vvvvvv1;
        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 4)));
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = this._vvvvvvvvvvvvvvvvvv5;
        ital.TotemLib.language languageVar3 = this._vvvvvv1;
        buttonWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 0)));
        this._vvvvvvvvvvvvvvvvv3._vvvvvv7();
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
