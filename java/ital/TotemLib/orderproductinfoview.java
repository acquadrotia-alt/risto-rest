package ital.TotemLib;

/* loaded from: classes.dex */
public class orderproductinfoview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _vvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderproductinfoview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderproductinfoview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.ButtonWrapper();
        return "";
    }

    public java.lang.String _eventinfoproductclose_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._orderinfoproductclose_click();
        return "";
    }

    public java.lang.String _eventinfoproductelevation_click() throws java.lang.Exception {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvv1(ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr, int i) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        float f = (float) (i * 0.1d);
        float f2 = (float) (i * 0.6d);
        float f3 = (float) (i * 0.6d);
        float f4 = (float) (i * 0.3d);
        if (_totemallergenstypeVarArr.length > 0) {
            panelWrapper.Initialize(this.ba, "");
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper.setColor(-16776961);
            panelWrapper.SetLayout(0, 0, _totemallergenstypeVarArr.length * i, i);
            int length = _totemallergenstypeVarArr.length - 1;
            for (int i2 = 0; i2 <= length; i2++) {
                new anywheresoftware.b4a.objects.ImageViewWrapper();
                ital.TotemLib.utility utilityVar = this._vvvvv7;
                anywheresoftware.b4a.objects.ImageViewWrapper _v7 = ital.TotemLib.utility._v7(this.ba, _totemallergenstypeVarArr[i2].ImageFileName, "", "", i, (int) f2);
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
                _v7.setGravity(49);
                panelWrapper.AddView((android.view.View) _v7.getObject(), i2 * i, (int) f, i, (int) f2);
                anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
                labelWrapper.Initialize(this.ba, "");
                java.lang.String[] strArr = _totemallergenstypeVarArr[i2].Name;
                ital.TotemLib.language languageVar = this._vvvvvv1;
                labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                labelWrapper.setTextColor(-1);
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
                labelWrapper.setGravity(81);
                panelWrapper.AddView((android.view.View) labelWrapper.getObject(), i2 * i, (int) f3, i, (int) f4);
            }
        }
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _vvvvvvvvvvvvvvvvvvvvvvv2(ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr, ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr, int i) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper;
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = null;
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper3 = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper3.Initialize(this.ba, "");
        if (_totemallergenstypeVarArr.length > 0) {
            new anywheresoftware.b4a.objects.PanelWrapper();
            panelWrapper = _vvvvvvvvvvvvvvvvvvvvvvv1(_totemallergenstypeVarArr, i);
            panelWrapper3.AddView((android.view.View) panelWrapper.getObject(), 0, 0, panelWrapper.getWidth(), panelWrapper.getHeight());
        } else {
            panelWrapper = null;
        }
        if (_totemtagstypeVarArr.length > 0) {
            new anywheresoftware.b4a.objects.PanelWrapper();
            panelWrapper2 = _vvvvvvvvvvvvvvvvvvvvvvv4(_totemtagstypeVarArr, i);
            panelWrapper3.AddView((android.view.View) panelWrapper2.getObject(), 0, 0, panelWrapper2.getWidth(), panelWrapper2.getHeight());
        }
        if (_totemallergenstypeVarArr.length > 0 && _totemtagstypeVarArr.length > 0) {
            panelWrapper2.setLeft(panelWrapper.getWidth());
            panelWrapper3.SetLayout(0, 0, panelWrapper.getWidth() + panelWrapper2.getWidth(), i);
        } else if (_totemallergenstypeVarArr.length > 0) {
            panelWrapper3.SetLayout(0, 0, panelWrapper.getWidth(), i);
        } else if (_totemtagstypeVarArr.length > 0) {
            panelWrapper3.SetLayout(0, 0, panelWrapper2.getWidth(), i);
        }
        anywheresoftware.b4a.objects.HorizontalScrollViewWrapper horizontalScrollViewWrapper = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
        horizontalScrollViewWrapper.Initialize(this.ba, 0, "");
        horizontalScrollViewWrapper.getPanel().AddView((android.view.View) panelWrapper3.getObject(), 0, 0, panelWrapper3.getWidth(), panelWrapper3.getHeight());
        horizontalScrollViewWrapper.getPanel().setWidth(panelWrapper3.getWidth());
        return horizontalScrollViewWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvv3() throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "EventInfoProductClose");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        panelWrapper.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba));
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        panelWrapper.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(anywheresoftware.b4a.keywords.constants.Colors.ARGB(75, 0, 0, 0));
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper2.Initialize(this.ba, "EventInfoProductElevation");
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        panelWrapper2.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent(84.0f, this.ba));
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        panelWrapper2.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent(72.0f, this.ba));
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(-1, 2, 2, -16777216);
        panelWrapper2.setBackground(colorDrawable.getObject());
        this._vvvvvvvvvvvvvvvvvvvvvvv0.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common9 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable2.Initialize2(-1, 2, 2, -16777216);
        this._vvvvvvvvvvvvvvvvvvvvvvv0.setBackground(colorDrawable2.getObject());
        panelWrapper2.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvv0.getObject(), (int) (panelWrapper2.getWidth() * 0.05d), (int) (panelWrapper2.getHeight() * 0.1d), (int) (panelWrapper2.getWidth() * 0.4d), (int) (panelWrapper2.getHeight() * 0.4d));
        this._vvvvvvvvvvvvvvvvvvvvvvv7.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvvvvvvvvvv7;
        anywheresoftware.b4a.keywords.Common common10 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors6 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper.setTextColor(-16777216);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = this._vvvvvvvvvvvvvvvvvvvvvvv7;
        anywheresoftware.b4a.keywords.Common common11 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors7 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper2.setColor(-3355444);
        panelWrapper2.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvv7.getObject(), (int) (panelWrapper2.getWidth() * 0.5d), (int) (panelWrapper2.getHeight() * 0.1d), (int) (panelWrapper2.getWidth() * 0.4d), (int) (panelWrapper2.getHeight() * 0.1d));
        this._vvvvvvvvvvvvvvvvvvvvvvvv1.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper3 = this._vvvvvvvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.keywords.Common common12 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors8 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper3.setTextColor(-16777216);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper4 = this._vvvvvvvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.keywords.Common common13 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors9 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper4.setColor(-3355444);
        panelWrapper2.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvv1.getObject(), (int) (panelWrapper2.getWidth() * 0.5d), (int) (panelWrapper2.getHeight() * 0.25d), (int) (panelWrapper2.getWidth() * 0.4d), (int) (panelWrapper2.getHeight() * 0.25d));
        this._vvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper3 = this._vvvvvvvvvvvvvvvvvvvvvvvv2;
        anywheresoftware.b4a.keywords.Common common14 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors10 = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper3.setColor(-16776961);
        panelWrapper2.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), (int) (panelWrapper2.getWidth() * 0.05d), (int) (panelWrapper2.getHeight() * 0.55d), (int) (panelWrapper2.getWidth() * 0.85d), (int) (panelWrapper2.getHeight() * 0.25d));
        this._vvvvvvvvvvvvvvvvvvvvvvvv3.Initialize(this.ba, "EventInfoProductClose");
        panelWrapper2.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvv3.getObject(), (int) (panelWrapper2.getWidth() * 0.2d), (int) (panelWrapper2.getHeight() * 0.85d), (int) (panelWrapper2.getWidth() * 0.6d), (int) (panelWrapper2.getHeight() * 0.12d));
        anywheresoftware.b4a.keywords.Common common15 = this.__c;
        anywheresoftware.b4a.keywords.Common common16 = this.__c;
        panelWrapper.AddView((android.view.View) panelWrapper2.getObject(), (int) ((anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba) - panelWrapper2.getWidth()) / 2.0d), (int) ((anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba) - panelWrapper2.getHeight()) / 2.0d), panelWrapper2.getWidth(), panelWrapper2.getHeight());
        anywheresoftware.b4a.keywords.Common common17 = this.__c;
        panelWrapper.setElevation(anywheresoftware.b4a.keywords.Common.DipToCurrent(4));
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvv4(ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr, int i) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        float f = (float) (i * 0.1d);
        float f2 = (float) (i * 0.6d);
        float f3 = (float) (i * 0.6d);
        float f4 = (float) (i * 0.3d);
        if (_totemtagstypeVarArr.length > 0) {
            panelWrapper.Initialize(this.ba, "");
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper.setColor(-65536);
            panelWrapper.SetLayout(0, 0, _totemtagstypeVarArr.length * i, i);
            int length = _totemtagstypeVarArr.length - 1;
            for (int i2 = 0; i2 <= length; i2++) {
                new anywheresoftware.b4a.objects.ImageViewWrapper();
                ital.TotemLib.utility utilityVar = this._vvvvv7;
                anywheresoftware.b4a.objects.ImageViewWrapper _v7 = ital.TotemLib.utility._v7(this.ba, _totemtagstypeVarArr[i2].ImageFileName, "", "", i, (int) f2);
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
                _v7.setGravity(49);
                panelWrapper.AddView((android.view.View) _v7.getObject(), i2 * i, (int) f, i, (int) f2);
                anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
                labelWrapper.Initialize(this.ba, "");
                java.lang.String[] strArr = _totemtagstypeVarArr[i2].Name;
                ital.TotemLib.language languageVar = this._vvvvvv1;
                labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
                labelWrapper.setGravity(81);
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                labelWrapper.setTextColor(-16777216);
                panelWrapper.AddView((android.view.View) labelWrapper.getObject(), i2 * i, (int) f3, i, (int) f4);
            }
        }
        return panelWrapper;
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        return this._vvvvvvvvvvvvvvvvvvvvvvv6;
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvv3();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvv5(ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvv7.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(_totemproducttypeVar.Name));
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv2.ShowProductCode) {
            this._vvvvvvvvvvvvvvvvvvvvvvv7.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._vvvvvvvvvvvvvvvvvvvvvvv7.getText() + " (" + _totemproducttypeVar.Code + ")"));
        }
        this._vvvvvvvvvvvvvvvvvvvvvvv0.RemoveAllViews();
        new anywheresoftware.b4a.objects.ImageViewWrapper();
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        this._vvvvvvvvvvvvvvvvvvvvvvv0.AddView((android.view.View) ital.TotemLib.utility._v7(this.ba, _totemproducttypeVar.ImageFileName, "", "", (int) (this._vvvvvvvvvvvvvvvvvvvvvvv0.getWidth() * 0.96d), (int) (this._vvvvvvvvvvvvvvvvvvvvvvv0.getHeight() * 0.96d)).getObject(), (int) (this._vvvvvvvvvvvvvvvvvvvvvvv0.getWidth() * 0.02d), (int) (this._vvvvvvvvvvvvvvvvvvvvvvv0.getHeight() * 0.02d), (int) (this._vvvvvvvvvvvvvvvvvvvvvvv0.getWidth() * 0.96d), (int) (this._vvvvvvvvvvvvvvvvvvvvvvv0.getHeight() * 0.96d));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvvvvvvvvvvv1;
        java.lang.String[] strArr = _totemproducttypeVar.Description;
        ital.TotemLib.language languageVar = this._vvvvvv1;
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
        this._vvvvvvvvvvvvvvvvvvvvvvvv2.RemoveAllViews();
        new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvv2.AddView((android.view.View) ((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup) _vvvvvvvvvvvvvvvvvvvvvvv2(_totemproducttypeVar.Allergens, _totemproducttypeVar.Tags, this._vvvvvvvvvvvvvvvvvvvvvvvv2.getHeight()).getObject())).getObject(), 0, 0, this._vvvvvvvvvvvvvvvvvvvvvvvv2.getWidth(), this._vvvvvvvvvvvvvvvvvvvvvvvv2.getHeight());
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = this._vvvvvvvvvvvvvvvvvvvvvvvv3;
        ital.TotemLib.language languageVar2 = this._vvvvvv1;
        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 5)));
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
