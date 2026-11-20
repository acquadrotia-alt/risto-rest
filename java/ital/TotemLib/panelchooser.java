package ital.TotemLib;

/* loaded from: classes.dex */
public class panelchooser extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public java.lang.Object[] _vvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.PanelWrapper[] _vvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.LabelWrapper[] _vvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.drawable.ColorDrawable _mcolorbackgroud_seleted = null;
    public anywheresoftware.b4a.objects.drawable.ColorDrawable _mcolorbackgroud_deseleted = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.panelchooser");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.panelchooser.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv1 = new java.lang.Object[0];
        int length = this._vvvvvvvvvvvvvvvvvvvvvvvvvv1.length;
        for (int i = 0; i < length; i++) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvv1[i] = new java.lang.Object();
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.PanelWrapper[2];
        int length2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvv3.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvv3[i2] = new anywheresoftware.b4a.objects.PanelWrapper();
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.LabelWrapper[2];
        int length3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvv4.length;
        for (int i3 = 0; i3 < length3; i3++) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[i3] = new anywheresoftware.b4a.objects.LabelWrapper();
        }
        this._mcolorbackgroud_seleted = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        this._mcolorbackgroud_deseleted = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvv7(int i, int i2, java.lang.String str, int i3, java.lang.String str2, anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper bitmapWrapper, int i4) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        buttonWrapper.Initialize(this.ba, str2);
        buttonWrapper.setColor(i3);
        buttonWrapper.setTag(java.lang.Integer.valueOf(i4));
        buttonWrapper.SetBackgroundImageNew(bitmapWrapper.getObject());
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        buttonWrapper.setGravity(17);
        panelWrapper.AddView((android.view.View) buttonWrapper.getObject(), (int) (i2 * 0.1d), (int) (i2 * 0.1d), (int) (i2 * 0.8d), (int) (i2 * 0.8d));
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[i].Initialize(this.ba, "");
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[i].setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[i];
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper.setGravity(81);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[i].getObject(), 0, 0, i2, i2);
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvv0(int i, int i2, java.lang.String[] strArr, java.lang.String[] strArr2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        panelWrapper.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(0, 2, 2, -16777216);
        panelWrapper.setBackground(colorDrawable.getObject());
        int i3 = (int) (i2 * 0.8d);
        int i4 = (int) ((i2 - i3) / 2.0d);
        int i5 = (int) ((i - (2 * i3)) / 4);
        anywheresoftware.b4a.objects.PanelWrapper[] panelWrapperArr = this._vvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String str = strArr[0];
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        panelWrapperArr[0] = _vvvvvvvvvvvvvvvvvvvvvvvvv7(0, i3, str, -16776961, "panelButtons", anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.objects.streams.File.getDirAssets(), strArr2[0]), 0);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvvvv3[0].getObject(), i5, i4, i3, i3);
        anywheresoftware.b4a.objects.PanelWrapper[] panelWrapperArr2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String str2 = strArr[1];
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        panelWrapperArr2[1] = _vvvvvvvvvvvvvvvvvvvvvvvvv7(1, i3, str2, -16776961, "panelButtons", anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.objects.streams.File.getDirAssets(), strArr2[1]), 1);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvvvv3[1].getObject(), i3 + (i5 * 3), i4, i3, i3);
        return panelWrapper;
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        return this._vvvvvvvvvvvvvvvvvvvvvvvvvv2;
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, java.lang.Object[] objArr, int i, int i2, java.lang.String[] strArr, java.lang.String[] strArr2) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv1 = objArr;
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvvvvvvvvvvvvvvv0(i, i2, strArr, strArr2);
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = this._mcolorbackgroud_seleted;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(-16776961, 0, 0, 0);
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable2 = this._mcolorbackgroud_deseleted;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable2.Initialize2(0, 0, 0, 0);
        return "";
    }

    public java.lang.String _panelbuttons_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int ObjectToNumber = (int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(buttonWrapper, (android.widget.Button) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag());
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv3[0].setBackground(this._mcolorbackgroud_deseleted.getObject());
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv3[1].setBackground(this._mcolorbackgroud_deseleted.getObject());
        this._vvvvvvvvvvvvvvvvvvvvvvvvvv3[ObjectToNumber].setBackground(this._mcolorbackgroud_seleted.getObject());
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvv1[0] instanceof ital.TotemLib.totemdata._totemconsumptiontype) {
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            ital.TotemLib.totemdata._totemorderheadtype _totemorderheadtypeVar = ital.TotemLib.totemdata._vvv3;
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            _totemorderheadtypeVar.ConsumptionLocation = ital.TotemLib.totemdata._vvv1[ObjectToNumber];
        } else if (this._vvvvvvvvvvvvvvvvvvvvvvvvvv1[0] instanceof ital.TotemLib.totemdata._totempaymentconditionstype) {
            ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
            ital.TotemLib.totemdata._totemorderheadtype _totemorderheadtypeVar2 = ital.TotemLib.totemdata._vvv3;
            ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
            _totemorderheadtypeVar2.PaymentConditions = ital.TotemLib.totemdata._vv0[ObjectToNumber];
        }
        this._vvvvvvvvvv3._vvvvvvv5();
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvv1[0] instanceof ital.TotemLib.totemdata._totemconsumptiontype) {
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[0];
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            java.lang.String[] strArr = ital.TotemLib.totemdata._vvv1[0].Description;
            ital.TotemLib.language languageVar = this._vvvvvv1;
            labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[1];
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            java.lang.String[] strArr2 = ital.TotemLib.totemdata._vvv1[1].Description;
            ital.TotemLib.language languageVar2 = this._vvvvvv1;
            labelWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr2[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
            return "";
        }
        if (this._vvvvvvvvvvvvvvvvvvvvvvvvvv1[0] instanceof ital.TotemLib.totemdata._totempaymentconditionstype) {
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[0];
            ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
            java.lang.String[] strArr3 = ital.TotemLib.totemdata._vv0[0].Description;
            ital.TotemLib.language languageVar3 = this._vvvvvv1;
            labelWrapper3.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr3[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvv4[1];
            ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
            java.lang.String[] strArr4 = ital.TotemLib.totemdata._vv0[1].Description;
            ital.TotemLib.language languageVar4 = this._vvvvvv1;
            labelWrapper4.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr4[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
            return "";
        }
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
