package ital.TotemLib;

/* loaded from: classes.dex */
public class orderlistdetailsview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvv4 = null;
    public int _vvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public int _vvvvvvvvvvvvvvvvvvvvvv6 = 0;
    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvv7 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderlistdetailsview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderlistdetailsview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _buttonremove_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        _vvvvvvvvvvvvvvvvvvvvvv2((int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(buttonWrapper, (android.widget.Button) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag()));
        _vvvvvvvvvvvvvvvvvvvvvv1();
        this._vvvvvvvvvv3._orderupdatecounter_click();
        this._vvvvvvvvvv3._vvvvvvv5();
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvv5 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvv6 = 0;
        this._vvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.List();
        this._vvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.LabelWrapper();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvv4(int i, int i2, ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar, int i3) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-12303292);
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(0, 2, 2, -16777216);
        panelWrapper.setBackground(colorDrawable.getObject());
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        _vvvvvvvvvvvvvvvvvvvvvv3(labelWrapper, anywheresoftware.b4a.BA.NumberToString(_totemorderrowtypeVar.Quantity), (int) (i2 / 2.0d), 5);
        panelWrapper.AddView((android.view.View) labelWrapper.getObject(), 0, 0, (int) (i * 0.2d), i2);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = new anywheresoftware.b4a.objects.LabelWrapper();
        java.lang.String str = "";
        if (_totemorderrowtypeVar.Product != null) {
            str = _totemorderrowtypeVar.Product.Name;
        } else if (_totemorderrowtypeVar.ProductListMenu != null) {
            str = _totemorderrowtypeVar.ProductListMenu.ProductMenu.Name;
        }
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        _vvvvvvvvvvvvvvvvvvvvvv3(labelWrapper2, str, (int) (i2 / 2.0d), 3);
        panelWrapper.AddView((android.view.View) labelWrapper2.getObject(), (int) (i * 0.22d), 0, (int) (i * 0.4d), i2);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper3 = new anywheresoftware.b4a.objects.LabelWrapper();
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
        _vvvvvvvvvvvvvvvvvvvvvv3(labelWrapper3, ital.TotemLib.utility._vv3(this.ba, _totemorderrowtypeVar.SubTotal), (int) (i2 / 2.0d), 5);
        panelWrapper.AddView((android.view.View) labelWrapper3.getObject(), (int) (i * 0.72d), 0, (int) (i * 0.25d), i2);
        panelWrapper.setHeight(i2);
        int i4 = (int) (i * 0.2d);
        int i5 = (int) (i * 0.79d);
        if (_totemorderrowtypeVar.ProductListMenu != null) {
            new anywheresoftware.b4a.objects.PanelWrapper();
            anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvv6(i5, i2, _totemorderrowtypeVar.ProductListMenu);
            panelWrapper.AddView((android.view.View) _vvvvvvvvvvvvvvvvvvvvv6.getObject(), i4, i2, _vvvvvvvvvvvvvvvvvvvvv6.getWidth(), _vvvvvvvvvvvvvvvvvvvvv6.getHeight());
            panelWrapper.setHeight(panelWrapper.getHeight() + _vvvvvvvvvvvvvvvvvvvvv6.getHeight());
        }
        if (_totemorderrowtypeVar.Product != null && _totemorderrowtypeVar.Product.Variations != null && _totemorderrowtypeVar.Product.Variations.length > 0) {
            new anywheresoftware.b4a.objects.PanelWrapper();
            anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvv6(i5, i2, _totemorderrowtypeVar.Product.Variations);
            panelWrapper.AddView((android.view.View) _vvvvvvvvvvvvvvvvvv6.getObject(), i4, i2, _vvvvvvvvvvvvvvvvvv6.getWidth(), _vvvvvvvvvvvvvvvvvv6.getHeight());
            panelWrapper.setHeight(panelWrapper.getHeight() + _vvvvvvvvvvvvvvvvvv6.getHeight());
        }
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        buttonWrapper.Initialize(this.ba, "buttonRemove");
        buttonWrapper.setTag(java.lang.Integer.valueOf(i3));
        buttonWrapper.setTextSize((float) (i2 / 2.8d));
        this._vvvvvvvvvvvvvvvvvvvvvv7.Add(buttonWrapper.getObject());
        panelWrapper.AddView((android.view.View) buttonWrapper.getObject(), (int) (i * 0.2d), panelWrapper.getHeight(), (int) (i * 0.6d), (int) (i2 + (i2 * 0.2d)));
        panelWrapper.setHeight(panelWrapper.getHeight() + buttonWrapper.getHeight());
        panelWrapper.SetLayout(0, 0, i, panelWrapper.getHeight());
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.ScrollViewWrapper _vvvvvvvvvvvvvvvvvvvvv5(int i, int i2) throws java.lang.Exception {
        int i3;
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        int i4 = (int) (i2 * 0.005d);
        this._vvvvvvvvvvvvvvvvvvvvvv7.Clear();
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv3.RowsList.getSize() > 0) {
            new ital.TotemLib.totemdata._totemorderrowtype();
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            int size = ital.TotemLib.totemdata._vvv3.RowsList.getSize() - 1;
            i3 = 0;
            for (int i5 = 0; i5 <= size; i5++) {
                ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
                ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar = (ital.TotemLib.totemdata._totemorderrowtype) ital.TotemLib.totemdata._vvv3.RowsList.Get(i5);
                new anywheresoftware.b4a.objects.PanelWrapper();
                anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvvvvvv4(i, (int) (i2 / 20.0d), _totemorderrowtypeVar, i5);
                panelWrapper.AddView((android.view.View) _vvvvvvvvvvvvvvvvvvvvv4.getObject(), 0, i3, i, _vvvvvvvvvvvvvvvvvvvvv4.getHeight());
                i3 = _vvvvvvvvvvvvvvvvvvvvv4.getHeight() + i3 + i4;
            }
        } else {
            i3 = 0;
        }
        new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvv7(i, (int) (i2 / 18.0d), _vvvvvvvvvvvvvvvvvvvvv0());
        panelWrapper.AddView((android.view.View) _vvvvvvvvvvvvvvvvvvvvv7.getObject(), 0, i3, _vvvvvvvvvvvvvvvvvvvvv7.getWidth(), _vvvvvvvvvvvvvvvvvvvvv7.getHeight());
        int height = _vvvvvvvvvvvvvvvvvvvvv7.getHeight() + i3;
        panelWrapper.setWidth(i);
        panelWrapper.setHeight(height);
        anywheresoftware.b4a.objects.ScrollViewWrapper scrollViewWrapper = new anywheresoftware.b4a.objects.ScrollViewWrapper();
        scrollViewWrapper.Initialize(this.ba, 0);
        scrollViewWrapper.getPanel().AddView((android.view.View) panelWrapper.getObject(), 0, 0, i, panelWrapper.getHeight());
        scrollViewWrapper.getPanel().setHeight(panelWrapper.getHeight());
        return scrollViewWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvv6(int i, int i2, ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-3355444);
        int i3 = (int) (i2 / 1.2d);
        if (_totemmenulistproducttypeVar.Products.length > 0) {
            int i4 = 0;
            int length = _totemmenulistproducttypeVar.Products.length - 1;
            for (int i5 = 0; i5 <= length; i5++) {
                anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
                _vvvvvvvvvvvvvvvvvvvvvv3(labelWrapper, _totemmenulistproducttypeVar.Products[i5].Name, (int) (i3 / 2.0d), 3);
                panelWrapper.AddView((android.view.View) labelWrapper.getObject(), 0, i4, i, i3);
                i4 += i3;
                if (_totemmenulistproducttypeVar.Products[i5].Variations != null && _totemmenulistproducttypeVar.Products[i5].Variations.length > 0) {
                    new anywheresoftware.b4a.objects.PanelWrapper();
                    anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvv6((int) (i * 0.8d), i3, _totemmenulistproducttypeVar.Products[i5].Variations);
                    panelWrapper.AddView((android.view.View) _vvvvvvvvvvvvvvvvvv6.getObject(), (int) (i * 0.2d), i4, _vvvvvvvvvvvvvvvvvv6.getWidth(), _vvvvvvvvvvvvvvvvvv6.getHeight());
                    i4 += _vvvvvvvvvvvvvvvvvv6.getHeight();
                }
            }
            panelWrapper.SetLayout(0, 0, i, i4);
        }
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvv6(int i, int i2, ital.TotemLib.totemdata._totemproductvariationstype[] _totemproductvariationstypeVarArr) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-65281);
        if (_totemproductvariationstypeVarArr.length > 0) {
            int length = _totemproductvariationstypeVarArr.length - 1;
            int i3 = 0;
            for (int i4 = 0; i4 <= length; i4++) {
                if (_totemproductvariationstypeVarArr[i4].FlgSelected) {
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append(_totemproductvariationstypeVarArr[i4].Name).append(" (");
                    java.lang.String[] strArr = _totemproductvariationstypeVarArr[i4].Description;
                    ital.TotemLib.language languageVar = this._vvvvvv1;
                    java.lang.String sb = append.append(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]).append(")").toString();
                    if (_totemproductvariationstypeVarArr[i4].FlgExceedingSelected) {
                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(sb).append(" ");
                        ital.TotemLib.language languageVar2 = this._vvvvvv1;
                        sb = append2.append(ital.TotemLib.language._vvvv0(this.ba, 1)).toString();
                    }
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
                    _vvvvvvvvvvvvvvvvvvvvvv3(labelWrapper, sb, (int) (i2 / 2.4d), 3);
                    panelWrapper.AddView((android.view.View) labelWrapper.getObject(), 0, i3, i, i2);
                    i3 += i2;
                }
            }
            panelWrapper.SetLayout(0, 0, i, i3);
        }
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvv7(int i, int i2, java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-7829368);
        panelWrapper.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        _vvvvvvvvvvvvvvvvvvvvvv3(this._vvvvvvvvvvvvvvvvvvvvvv0, "", (int) (i2 / 2.0d), 19);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvv0.getObject(), (int) (panelWrapper.getWidth() * 0.02d), 0, (int) (panelWrapper.getWidth() * 0.46d), i2);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
        _vvvvvvvvvvvvvvvvvvvvvv3(labelWrapper, str, (int) (i2 / 2.0d), 21);
        panelWrapper.AddView((android.view.View) labelWrapper.getObject(), (int) (panelWrapper.getWidth() * 0.5d), 0, (int) (panelWrapper.getWidth() * 0.46d), i2);
        return panelWrapper;
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvv0() throws java.lang.Exception {
        double d = 0.0d;
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv3.RowsList.getSize() > 0) {
            new ital.TotemLib.totemdata._totemorderrowtype();
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            int size = ital.TotemLib.totemdata._vvv3.RowsList.getSize() - 1;
            double d2 = 0.0d;
            for (int i = 0; i <= size; i++) {
                ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
                d2 += ((ital.TotemLib.totemdata._totemorderrowtype) ital.TotemLib.totemdata._vvv3.RowsList.Get(i)).SubTotal;
            }
            d = d2;
        }
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        return ital.TotemLib.utility._vv3(this.ba, d);
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvv1();
        return this._vvvvvvvvvvvvvvvvvvvvvv4;
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvvvvvv4.Initialize(this.ba, "");
        this._vvvvvvvvvvvvvvvvvvvvvv5 = i;
        this._vvvvvvvvvvvvvvvvvvvvvv6 = i2;
        this._vvvvvvvvvvvvvvvvvvvvvv7.Initialize();
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvvvvvvvvv0;
        ital.TotemLib.language languageVar = this._vvvvvv1;
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 7)));
        ital.TotemLib.language languageVar2 = this._vvvvvv1;
        ital.TotemLib.language._vvvvv2(this.ba, this._vvvvvvvvvvvvvvvvvvvvvv7, 12);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvv1() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvv4.RemoveAllViews();
        this._vvvvvvvvvvvvvvvvvvvvvv4.AddView((android.view.View) _vvvvvvvvvvvvvvvvvvvvv5(this._vvvvvvvvvvvvvvvvvvvvvv5, this._vvvvvvvvvvvvvvvvvvvvvv6).getObject(), 0, 0, this._vvvvvvvvvvvvvvvvvvvvvv5, this._vvvvvvvvvvvvvvvvvvvvvv6);
        _vvvvvv7();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvv2(int i) throws java.lang.Exception {
        if (i > -1) {
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            ital.TotemLib.totemdata._vvv3.RowsList.RemoveAt(i);
            return "";
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.LabelWrapper labelWrapper, java.lang.String str, int i, int i2) throws java.lang.Exception {
        labelWrapper.Initialize(this.ba, "");
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str));
        labelWrapper.setTextSize(i);
        labelWrapper.setPadding(new int[]{2, 0, 2, 0});
        labelWrapper.setGravity(i2);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper.setTextColor(-16777216);
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
