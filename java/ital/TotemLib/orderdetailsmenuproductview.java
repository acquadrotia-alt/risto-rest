package ital.TotemLib;

/* loaded from: classes.dex */
public class orderdetailsmenuproductview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.totemdata._totemmenulistproducttype _vvvvvvvvvvvvvvvvv1 = null;
    public ital.TotemLib.totemdata._totemmenulistproducttype _vvvvvvvvvvvvvvvvv2 = null;
    public ital.TotemLib.orderproductvariationsview[] _vvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvv5 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvv6 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvv7 = null;
    public int _vvvvvvvvvvvvvvvvv0 = 0;
    public int _vvvvvvvvvvvvvvvvvv1 = 0;
    public anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _vvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.PanelWrapper[] _vvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper[] _vvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _vvvvvvvvvvvvvvvvvv5 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderdetailsmenuproductview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderdetailsmenuproductview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _buttonaddmenutoorder_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._orderaddmenuproduct_itemclick(this._vvvvvvvvvvvvvvvvv2);
        _vvvvvvvvvvvvvvvv4();
        return "";
    }

    public java.lang.String _buttoninfomenuproduct_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvv3._orderinfoproductshow_click(this._vvvvvvvvvvvvvvvvv2.Products[(int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(buttonWrapper, (android.widget.Button) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag())]);
        return "";
    }

    public java.lang.String _buttonnavigationnext_click() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvv0 < this._vvvvvvvvvvvvvvvvv2.Products.length - 1) {
            this._vvvvvvvvvvvvvvvvv0++;
        }
        _vvvvvvvvvvvvvvvv6(this._vvvvvvvvvvvvvvvvv0);
        return "";
    }

    public java.lang.String _buttonnavigationprevius_click() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvv0 > 0) {
            this._vvvvvvvvvvvvvvvvv0--;
        }
        _vvvvvvvvvvvvvvvv6(this._vvvvvvvvvvvvvvvvv0);
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvv1 = new ital.TotemLib.totemdata._totemmenulistproducttype();
        this._vvvvvvvvvvvvvvvvv2 = new ital.TotemLib.totemdata._totemmenulistproducttype();
        this._vvvvvvvvvvvvvvvvv3 = new ital.TotemLib.orderproductvariationsview[0];
        int length = this._vvvvvvvvvvvvvvvvv3.length;
        for (int i = 0; i < length; i++) {
            this._vvvvvvvvvvvvvvvvv3[i] = new ital.TotemLib.orderproductvariationsview();
        }
        this._vvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvv0 = 0;
        this._vvvvvvvvvvvvvvvvvv1 = 0;
        this._vvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
        this._vvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.PanelWrapper[0];
        int length2 = this._vvvvvvvvvvvvvvvvvv3.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this._vvvvvvvvvvvvvvvvvv3[i2] = new anywheresoftware.b4a.objects.PanelWrapper();
        }
        this._vvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.ButtonWrapper[0];
        int length3 = this._vvvvvvvvvvvvvvvvvv4.length;
        for (int i3 = 0; i3 < length3; i3++) {
            this._vvvvvvvvvvvvvvvvvv4[i3] = new anywheresoftware.b4a.objects.ButtonWrapper();
        }
        this._vvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.ButtonWrapper();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvv6(int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        panelWrapper.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(anywheresoftware.b4a.keywords.constants.Colors.ARGB(0, 25, 25, 25));
        int i3 = (int) (i * 0.3d);
        int i4 = (int) (i2 * 0.1d);
        this._vvvvvvvvvvvvvvvvvv5.Initialize(this.ba, "buttonAddMenuToOrder");
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvv5.getObject(), i3, i4, panelWrapper.getWidth() - (i3 * 2), panelWrapper.getHeight() - (i4 * 2));
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvv7(int i) throws java.lang.Exception {
        int i2 = (int) (this._vvvvvvvvvvvvvvvvvv1 / 4.0d);
        int i3 = this._vvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        buttonWrapper.Initialize(this.ba, "buttonNavigationPrevius");
        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("<"));
        panelWrapper.AddView((android.view.View) buttonWrapper.getObject(), 0, 0, i2, i3);
        new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvv3();
        panelWrapper.AddView((android.view.View) _vvvvvvvvvvvvvvvv3.getObject(), i2, 0, i - (i2 * 2), i3);
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = new anywheresoftware.b4a.objects.ButtonWrapper();
        buttonWrapper2.Initialize(this.ba, "buttonNavigationNext");
        buttonWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(">"));
        panelWrapper.AddView((android.view.View) buttonWrapper2.getObject(), buttonWrapper.getWidth() + _vvvvvvvvvvvvvvvv3.getWidth(), 0, i2, i3);
        return panelWrapper;
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvv0() throws java.lang.Exception {
        return this._vvvvvvvvvvvvvvvv0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvv1(ital.TotemLib.totemdata._totemproductmenutype _totemproductmenutypeVar, int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(anywheresoftware.b4a.keywords.constants.Colors.RGB(34, 12, 67));
        panelWrapper.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
        labelWrapper.Initialize(this.ba, "");
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(_totemproductmenutypeVar.Name));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper.setTextColor(-1);
        labelWrapper.setTextSize((float) (i2 / 2.0d));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper.setColor(0);
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
        labelWrapper.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper.setGravity(17);
        panelWrapper.AddView((android.view.View) labelWrapper.getObject(), (int) (i * 0.02d), 0, (int) (i * 0.8d), i2);
        this._vvvvvvvvvvvvvvvvv5.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = this._vvvvvvvvvvvvvvvvv5;
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        labelWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.utility._vv3(this.ba, _totemproductmenutypeVar.Price)));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper3 = this._vvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper3.setTextColor(-1);
        this._vvvvvvvvvvvvvvvvv5.setTextSize((float) (i2 / 2.0d));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper4 = this._vvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper4.setColor(-65536);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper5 = this._vvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common common9 = this.__c;
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper2 = anywheresoftware.b4a.keywords.Common.Typeface;
        labelWrapper5.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper6 = this._vvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common common10 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common11 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper6.setGravity(17);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvv5.getObject(), (int) (i * 0.82d), 0, (int) (i * 0.16d), i2);
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvv2(int i) throws java.lang.Exception {
        int i2 = (int) ((this._vvvvvvvvvvvvvvvvvv1 - (this._vvvvvvvvvvvvvvvvvv1 * 0.6f)) / 2.0d);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "TopMenuProduct");
        panelWrapper.setTag(java.lang.Integer.valueOf(i));
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(0, 2, 2, -16777216);
        panelWrapper.setBackground(colorDrawable.getObject());
        new anywheresoftware.b4a.objects.ImageViewWrapper();
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        panelWrapper.AddView((android.view.View) ital.TotemLib.utility._v7(this.ba, this._vvvvvvvvvvvvvvvvv2.Products[i].ImageFileName, "", "", (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.6f), (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.6f)).getObject(), i2, (int) (i2 / 2.0d), (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.6f), (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.6f));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
        labelWrapper.Initialize(this.ba, "");
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._vvvvvvvvvvvvvvvvv2.Products[i].Name));
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv2.ShowProductCode) {
            labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(labelWrapper.getText() + " (" + this._vvvvvvvvvvvvvvvvv2.Products[i].Code + ")"));
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper.setGravity(81);
        labelWrapper.setPadding(new int[]{2, i2, 2, (int) (i2 / 2.0d)});
        labelWrapper.setTextSize((float) (this._vvvvvvvvvvvvvvvvvv1 / 10.0d));
        panelWrapper.AddView((android.view.View) labelWrapper.getObject(), 0, 0, this._vvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvv1);
        this._vvvvvvvvvvvvvvvvvv4[i].Initialize(this.ba, "buttonInfoMenuProduct");
        this._vvvvvvvvvvvvvvvvvv4[i].setTag(java.lang.Integer.valueOf(i));
        this._vvvvvvvvvvvvvvvvvv4[i].setTextSize((float) (this._vvvvvvvvvvvvvvvvvv1 / 22.0d));
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvv4[i].getObject(), (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.72d), (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.01d), (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.28d), (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.3d));
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvv3() throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        panelWrapper.SetLayout(0, 0, this._vvvvvvvvvvvvvvvvv2.Products.length * this._vvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvv1);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-16776961);
        anywheresoftware.b4a.objects.PanelWrapper[] panelWrapperArr = new anywheresoftware.b4a.objects.PanelWrapper[this._vvvvvvvvvvvvvvvvv2.Products.length];
        int length = panelWrapperArr.length;
        for (int i = 0; i < length; i++) {
            panelWrapperArr[i] = new anywheresoftware.b4a.objects.PanelWrapper();
        }
        this._vvvvvvvvvvvvvvvvvv3 = panelWrapperArr;
        if (this._vvvvvvvvvvvvvvvvv2.Products.length > 0) {
            anywheresoftware.b4a.objects.ButtonWrapper[] buttonWrapperArr = new anywheresoftware.b4a.objects.ButtonWrapper[this._vvvvvvvvvvvvvvvvv2.Products.length];
            int length2 = buttonWrapperArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                buttonWrapperArr[i2] = new anywheresoftware.b4a.objects.ButtonWrapper();
            }
            this._vvvvvvvvvvvvvvvvvv4 = buttonWrapperArr;
            int length3 = this._vvvvvvvvvvvvvvvvv2.Products.length - 1;
            for (int i3 = 0; i3 <= length3; i3++) {
                this._vvvvvvvvvvvvvvvvvv3[i3] = _vvvvvvvvvvvvvvvv2(i3);
                panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvv3[i3].getObject(), this._vvvvvvvvvvvvvvvvvv1 * i3, 0, this._vvvvvvvvvvvvvvvvvv1, this._vvvvvvvvvvvvvvvvvv1);
            }
        }
        this._vvvvvvvvvvvvvvvvvv2.Initialize(this.ba, 0, "");
        this._vvvvvvvvvvvvvvvvvv2.getPanel().AddView((android.view.View) panelWrapper.getObject(), 0, 0, panelWrapper.getWidth(), panelWrapper.getHeight());
        this._vvvvvvvvvvvvvvvvvv2.getPanel().setWidth(panelWrapper.getWidth());
        return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup) this._vvvvvvvvvvvvvvvvvv2.getObject());
    }

    public java.lang.String _vvvvvvvvvvvvvvvv4() throws java.lang.Exception {
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        this._vvvvvvvvvvvvvvvvv2 = ital.TotemLib.totemdata._vvv5(this.ba, this._vvvvvvvvvvvvvvvvv1);
        this._vvvvvvvvvvvvvvvv0.RemoveAllViews();
        _vvvvvvvvvvvvvvvv7();
        _vvvvvv7();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvv5() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvv2.Products.length > 0) {
            this._vvvvvvvvvvvvvvvvv3 = new ital.TotemLib.orderproductvariationsview[this._vvvvvvvvvvvvvvvvv2.Products.length];
            int length = this._vvvvvvvvvvvvvvvvv3.length;
            for (int i = 0; i < length; i++) {
                this._vvvvvvvvvvvvvvvvv3[i] = new ital.TotemLib.orderproductvariationsview();
            }
            int length2 = this._vvvvvvvvvvvvvvvvv2.Products.length - 1;
            for (int i2 = 0; i2 <= length2; i2++) {
                ital.TotemLib.orderproductvariationsview orderproductvariationsviewVar = new ital.TotemLib.orderproductvariationsview();
                orderproductvariationsviewVar._initialize(this.ba, this._vvvvvvvvvv3, this._vvvvvvvvvvvvvvvvv5, this._vvvvvvvvvvvvvvvv0.getWidth(), (int) (this._vvvvvvvvvvvvvvvvvv1 / 5.0d), this._vvvvvvvvvvvvvvvvv2.Products[i2], this._vvvvvvvvvvvvvvvvv2);
                this._vvvvvvvvvvvvvvvvv3[i2] = orderproductvariationsviewVar;
                anywheresoftware.b4a.objects.ConcreteViewWrapper _vvvvv3 = this._vvvvvvvvvvvvvvvvv3[i2]._vvvvv3();
                anywheresoftware.b4a.keywords.Common common = this.__c;
                _vvvvv3.setVisible(false);
            }
            return "";
        }
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2, int i3, ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvv1 = _totemmenulistproducttypeVar;
        this._vvvvvvvvvvvvvvvvvv1 = i3;
        this._vvvvvvvvvvvvvvvv0.Initialize(this.ba, "mPanelMenuProduct");
        this._vvvvvvvvvvvvvvvv0.SetLayout(0, 0, i, i2);
        _vvvvvvvvvvvvvvvv4();
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvv3.length > 0) {
            int length = this._vvvvvvvvvvvvvvvvv3.length - 1;
            for (int i = 0; i <= length; i++) {
                this._vvvvvvvvvvvvvvvvv3[i]._vvvvvv7();
            }
        }
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = this._vvvvvvvvvvvvvvvvvv5;
        ital.TotemLib.language languageVar = this._vvvvvv1;
        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 0)));
        int length2 = this._vvvvvvvvvvvvvvvvvv4.length - 1;
        for (int i2 = 0; i2 <= length2; i2++) {
            anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = this._vvvvvvvvvvvvvvvvvv4[i2];
            ital.TotemLib.language languageVar2 = this._vvvvvv1;
            buttonWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 4)));
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvv6(int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvv2.Products.length > 0) {
            int length = this._vvvvvvvvvvvvvvvvv2.Products.length - 1;
            for (int i2 = 0; i2 <= length; i2++) {
                anywheresoftware.b4a.objects.ConcreteViewWrapper _vvvvv3 = this._vvvvvvvvvvvvvvvvv3[i2]._vvvvv3();
                anywheresoftware.b4a.keywords.Common common = this.__c;
                _vvvvv3.setVisible(false);
                anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvvvvvvvvvvvv3[i2];
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                panelWrapper.setColor(0);
            }
            anywheresoftware.b4a.objects.ConcreteViewWrapper _vvvvv32 = this._vvvvvvvvvvvvvvvvv3[i]._vvvvv3();
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            _vvvvv32.setVisible(true);
            anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = this._vvvvvvvvvvvvvvvvvv3[i];
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper2.setColor(-3355444);
            this._vvvvvvvvvvvvvvvvvv2.setScrollPosition(this._vvvvvvvvvvvvvvvvv0 * this._vvvvvvvvvvvvvvvvvv1);
            return "";
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _vvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvvvvvvvvvv0;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-7829368);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(0, 2, 2, -16777216);
        this._vvvvvvvvvvvvvvvv0.setBackground(colorDrawable.getObject());
        int i = (int) (this._vvvvvvvvvvvvvvvvvv1 * 0.15d);
        this._vvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvv1(this._vvvvvvvvvvvvvvvvv2.ProductMenu, this._vvvvvvvvvvvvvvvv0.getWidth(), i);
        this._vvvvvvvvvvvvvvvv0.AddView((android.view.View) this._vvvvvvvvvvvvvvvvv4.getObject(), 0, 0, this._vvvvvvvvvvvvvvvv0.getWidth(), i);
        int i2 = this._vvvvvvvvvvvvvvvvvv1;
        this._vvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvv7(this._vvvvvvvvvvvvvvvv0.getWidth());
        this._vvvvvvvvvvvvvvvv0.AddView((android.view.View) this._vvvvvvvvvvvvvvvvv6.getObject(), 0, i, this._vvvvvvvvvvvvvvvv0.getWidth(), i2);
        int i3 = (int) (this._vvvvvvvvvvvvvvvvvv1 / 2.0d);
        this._vvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvv6(this._vvvvvvvvvvvvvvvv0.getWidth(), i3);
        this._vvvvvvvvvvvvvvvv0.AddView((android.view.View) this._vvvvvvvvvvvvvvvvv7.getObject(), 0, this._vvvvvvvvvvvvvvvv0.getHeight() - i3, this._vvvvvvvvvvvvvvvv0.getWidth(), i3);
        int height = ((this._vvvvvvvvvvvvvvvv0.getHeight() - i) - i2) - i3;
        _vvvvvvvvvvvvvvvv5();
        if (this._vvvvvvvvvvvvvvvvv2.Products.length > 0) {
            int length = this._vvvvvvvvvvvvvvvvv2.Products.length - 1;
            for (int i4 = 0; i4 <= length; i4++) {
                this._vvvvvvvvvvvvvvvv0.AddView((android.view.View) this._vvvvvvvvvvvvvvvvv3[i4]._vvvvv3().getObject(), 0, i + i2, this._vvvvvvvvvvvvvvvv0.getWidth(), height);
            }
            _vvvvvvvvvvvvvvvv6(0);
            return "";
        }
        return "";
    }

    public java.lang.String _topmenuproduct_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvvvvvvvvv0 = (int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(panelWrapper, (android.view.ViewGroup) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag());
        _vvvvvvvvvvvvvvvv6(this._vvvvvvvvvvvvvvvvv0);
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
