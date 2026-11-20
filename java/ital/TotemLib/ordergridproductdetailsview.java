package ital.TotemLib;

/* loaded from: classes.dex */
public class ordergridproductdetailsview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.ScrollViewWrapper _vvvvvvvvvvvvvvvvvvvv6 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvv7 = null;
    public ital.TotemLib.totemdata._totemproducttype[] _vvvvvvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.totemdata._totemmenulistproducttype[] _vvvvvvvvvvvvvvvvvvvvv1 = null;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.ordergridproductdetailsview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.ordergridproductdetailsview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _buttonaddtoorder_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvv3._orderaddproduct_itemclick(this._vvvvvvvvvvvvvvvvvvvv0[(int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(buttonWrapper, (android.widget.Button) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag())]);
        return "";
    }

    public java.lang.String _buttoninfoproduct_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvv3._orderinfoproductshow_click(this._vvvvvvvvvvvvvvvvvvvv0[(int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(buttonWrapper, (android.widget.Button) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag())]);
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
        this._vvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvv0 = new ital.TotemLib.totemdata._totemproducttype[0];
        int length = this._vvvvvvvvvvvvvvvvvvvv0.length;
        for (int i = 0; i < length; i++) {
            this._vvvvvvvvvvvvvvvvvvvv0[i] = new ital.TotemLib.totemdata._totemproducttype();
        }
        this._vvvvvvvvvvvvvvvvvvvvv1 = new ital.TotemLib.totemdata._totemmenulistproducttype[0];
        int length2 = this._vvvvvvvvvvvvvvvvvvvvv1.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this._vvvvvvvvvvvvvvvvvvvvv1[i2] = new ital.TotemLib.totemdata._totemmenulistproducttype();
        }
        this._vvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.collections.List();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvv5(int i, int i2, int i3, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, double d) throws java.lang.Exception {
        boolean z2;
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
        new anywheresoftware.b4a.objects.ImageViewWrapper();
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = new anywheresoftware.b4a.objects.LabelWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        if (this._vvvvvvvvvvvvvvvvvvvv0 == null || !(this._vvvvvvvvvvvvvvvvvvvv0[i3].Variations == null || this._vvvvvvvvvvvvvvvvvvvv0[i3].Variations.length == 0)) {
            z2 = false;
        } else {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            z2 = true;
        }
        if (this._vvvvvvvvvvvvvvvvvvvvv1 != null) {
            panelWrapper.Initialize(this.ba, "MenuItemProduct");
            panelWrapper.setTag(java.lang.Integer.valueOf(i3));
        } else {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
                panelWrapper.Initialize(this.ba, "ItemProductVariation");
                panelWrapper.setTag(java.lang.Integer.valueOf(i3));
            } else {
                panelWrapper.Initialize(this.ba, "");
            }
        }
        panelWrapper.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-16776961);
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(0, 2, 2, -16777216);
        panelWrapper.setBackground(colorDrawable.getObject());
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        panelWrapper.AddView((android.view.View) ital.TotemLib.utility._v7(this.ba, str2, "", "", (int) (panelWrapper.getWidth() * 0.8d), (int) (panelWrapper.getHeight() * 0.6d)).getObject(), (int) (panelWrapper.getWidth() * 0.1d), (int) (panelWrapper.getHeight() * 0.1d), (int) (panelWrapper.getWidth() * 0.8d), (int) (panelWrapper.getHeight() * 0.6d));
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("discounted_product_");
        ital.TotemLib.language languageVar = this._vvvvvv1;
        java.lang.String sb = append.append(ital.TotemLib.language._vvvv6(this.ba)).append(".png").toString();
        if (z) {
            anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper = new anywheresoftware.b4a.objects.ImageViewWrapper();
            imageViewWrapper.Initialize(this.ba, "");
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            imageViewWrapper.setBitmap(anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.objects.streams.File.getDirAssets(), sb, (int) (panelWrapper.getWidth() * 0.2d), (int) (panelWrapper.getHeight() * 0.2d), true).getObject());
            panelWrapper.AddView((android.view.View) imageViewWrapper.getObject(), (int) (panelWrapper.getWidth() * 0.02d), (int) (panelWrapper.getHeight() * 0.02d), (int) (panelWrapper.getWidth() * 0.2d), (int) (panelWrapper.getHeight() * 0.2d));
        }
        labelWrapper2.Initialize(this.ba, "");
        labelWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str3));
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv2.ShowProductCode) {
            labelWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(labelWrapper2.getText() + " (" + str + ")"));
        }
        anywheresoftware.b4a.keywords.Common common10 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common11 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper2.setGravity(17);
        if (z2) {
            panelWrapper.AddView((android.view.View) labelWrapper2.getObject(), (int) (panelWrapper.getWidth() * 0.05d), (int) (panelWrapper.getHeight() * 0.65d), (int) (panelWrapper.getWidth() * 0.9d), (int) (panelWrapper.getHeight() * 0.15d));
        } else {
            panelWrapper.AddView((android.view.View) labelWrapper2.getObject(), (int) (panelWrapper.getWidth() * 0.05d), (int) (panelWrapper.getHeight() * 0.75d), (int) (panelWrapper.getWidth() * 0.9d), (int) (panelWrapper.getHeight() * 0.2d));
        }
        labelWrapper.Initialize(this.ba, "");
        ital.TotemLib.utility utilityVar2 = this._vvvvv7;
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.utility._vv3(this.ba, d)));
        anywheresoftware.b4a.keywords.Common common12 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common13 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper.setGravity(17);
        anywheresoftware.b4a.keywords.Common common14 = this.__c;
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
        labelWrapper.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
        labelWrapper.setTextSize((float) (i2 / 10.0d));
        panelWrapper.AddView((android.view.View) labelWrapper.getObject(), (int) (panelWrapper.getWidth() * 0.6d), (int) (panelWrapper.getHeight() * 0.05d), (int) (panelWrapper.getWidth() * 0.35d), (int) (panelWrapper.getHeight() * 0.15d));
        if (z2) {
            buttonWrapper.Initialize(this.ba, "buttonAddToOrder");
            buttonWrapper.setTag(java.lang.Integer.valueOf(i3));
            buttonWrapper.setTextSize((float) (i2 / 18.0d));
            panelWrapper.AddView((android.view.View) buttonWrapper.getObject(), (int) (panelWrapper.getWidth() * 0.05d), (int) (panelWrapper.getHeight() * 0.78d), (int) (panelWrapper.getWidth() * 0.4d), (int) (panelWrapper.getHeight() * 0.24d));
            this._vvvvvvvvvvvvvvvvvvvvv2.Add(buttonWrapper.getObject());
            buttonWrapper2.Initialize(this.ba, "buttonInfoProduct");
            buttonWrapper2.setTag(java.lang.Integer.valueOf(i3));
            buttonWrapper2.setTextSize((float) (i2 / 18.0d));
            panelWrapper.AddView((android.view.View) buttonWrapper2.getObject(), (int) (panelWrapper.getWidth() * 0.55d), (int) (panelWrapper.getHeight() * 0.78d), (int) (panelWrapper.getWidth() * 0.4d), (int) (panelWrapper.getHeight() * 0.24d));
            this._vvvvvvvvvvvvvvvvvvvvv3.Add(buttonWrapper2.getObject());
        }
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.ConcreteViewWrapper _vvvvv3() throws java.lang.Exception {
        return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) this._vvvvvvvvvvvvvvvvvvvv6.getObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2, int i3, ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr, ital.TotemLib.totemdata._totemmenulistproducttype[] _totemmenulistproducttypeVarArr) throws java.lang.Exception {
        int i4;
        int i5;
        int i6;
        int i7;
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvvvv0 = _totemproducttypeVarArr;
        this._vvvvvvvvvvvvvvvvvvvvv1 = _totemmenulistproducttypeVarArr;
        this._vvvvvvvvvvvvvvvvvvvvv2.Initialize();
        this._vvvvvvvvvvvvvvvvvvvvv3.Initialize();
        int i8 = (int) ((i / i3) - (i * 0.05d));
        if ((this._vvvvvvvvvvvvvvvvvvvv0 != null && this._vvvvvvvvvvvvvvvvvvvv0.length > 0) || (this._vvvvvvvvvvvvvvvvvvvvv1 != null && this._vvvvvvvvvvvvvvvvvvvvv1.length > 0)) {
            int i9 = (int) ((i - (i8 * i3)) / i3);
            this._vvvvvvvvvvvvvvvvvvvv7.Initialize(this.ba, "");
            int i10 = 0;
            int i11 = 0;
            if (_totemproducttypeVarArr != null) {
                i4 = this._vvvvvvvvvvvvvvvvvvvv0.length - 1;
            } else if (_totemmenulistproducttypeVarArr == null) {
                i4 = 0;
            } else {
                i4 = _totemmenulistproducttypeVarArr.length - 1;
            }
            int i12 = 0;
            int i13 = 0;
            while (i12 <= i4) {
                if (i13 == 0) {
                    i5 = (i8 + i9) * i11;
                    i10 = (int) (i9 / 2.0d);
                } else {
                    i5 = (i8 + i9) * i11;
                    i10 += i8 + i9;
                }
                anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
                if (_totemproducttypeVarArr != null) {
                    panelWrapper = _vvvvvvvvvvvvvvvvvvvv5(i8, i8, i12, this._vvvvvvvvvvvvvvvvvvvv0[i12].Code, this._vvvvvvvvvvvvvvvvvvvv0[i12].ImageFileName, this._vvvvvvvvvvvvvvvvvvvv0[i12].IsDiscounted, this._vvvvvvvvvvvvvvvvvvvv0[i12].Name, this._vvvvvvvvvvvvvvvvvvvv0[i12].Price);
                } else if (_totemmenulistproducttypeVarArr != null) {
                    panelWrapper = _vvvvvvvvvvvvvvvvvvvv5(i8, i8, i12, this._vvvvvvvvvvvvvvvvvvvvv1[i12].ProductMenu.Code, this._vvvvvvvvvvvvvvvvvvvvv1[i12].ProductMenu.ImageFileName, this._vvvvvvvvvvvvvvvvvvvvv1[i12].ProductMenu.IsDiscounted, this._vvvvvvvvvvvvvvvvvvvvv1[i12].ProductMenu.Name, this._vvvvvvvvvvvvvvvvvvvvv1[i12].ProductMenu.Price);
                }
                this._vvvvvvvvvvvvvvvvvvvv7.AddView((android.view.View) panelWrapper.getObject(), i10, i5, i8, i8);
                if (i13 < i3 - 1) {
                    i6 = i13 + 1;
                    i7 = i11;
                } else {
                    i6 = 0;
                    i7 = i11 + 1;
                }
                i12++;
                i13 = i6;
                i11 = i7;
            }
            if (i13 != 0) {
                i11++;
            }
            this._vvvvvvvvvvvvvvvvvvvv7.SetLayout(0, 0, i, (i8 + i9) * i11);
            this._vvvvvvvvvvvvvvvvvvvv6.Initialize(this.ba, 0);
            this._vvvvvvvvvvvvvvvvvvvv6.getPanel().AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvv7.getObject(), 0, 0, this._vvvvvvvvvvvvvvvvvvvv7.getWidth(), this._vvvvvvvvvvvvvvvvvvvv7.getHeight());
            this._vvvvvvvvvvvvvvvvvvvv6.getPanel().setHeight(this._vvvvvvvvvvvvvvvvvvvv7.getHeight());
        }
        _vvvvvv7();
        return "";
    }

    public java.lang.String _itemproductvariation_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvv3._orderproductvariationdetails_itemclick(this._vvvvvvvvvvvvvvvvvvvv0[(int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(panelWrapper, (android.view.ViewGroup) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag())]);
        return "";
    }

    public java.lang.String _menuitemproduct_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        this._vvvvvvvvvv3._ordermenuproductdetails_itemclick(this._vvvvvvvvvvvvvvvvvvvvv1[(int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(panelWrapper, (android.view.ViewGroup) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag())]);
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        ital.TotemLib.language languageVar = this._vvvvvv1;
        ital.TotemLib.language._vvvvv2(this.ba, this._vvvvvvvvvvvvvvvvvvvvv2, 0);
        ital.TotemLib.language languageVar2 = this._vvvvvv1;
        ital.TotemLib.language._vvvvv2(this.ba, this._vvvvvvvvvvvvvvvvvvvvv3, 4);
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
