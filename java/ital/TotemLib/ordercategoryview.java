package ital.TotemLib;

/* loaded from: classes.dex */
public class ordercategoryview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.ScrollViewWrapper _vvvvvvvvvvvvvvv1 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.PanelWrapper[] _vvvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.totemdata._totemcategorytype[] _vvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.LabelWrapper[] _vvvvvvvvvvvvvvv5 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.ordercategoryview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.ordercategoryview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
        this._vvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.PanelWrapper[0];
        int length = this._vvvvvvvvvvvvvvv3.length;
        for (int i = 0; i < length; i++) {
            this._vvvvvvvvvvvvvvv3[i] = new anywheresoftware.b4a.objects.PanelWrapper();
        }
        this._vvvvvvvvvvvvvvv4 = new ital.TotemLib.totemdata._totemcategorytype[0];
        int length2 = this._vvvvvvvvvvvvvvv4.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this._vvvvvvvvvvvvvvv4[i2] = new ital.TotemLib.totemdata._totemcategorytype();
        }
        this._vvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.LabelWrapper[0];
        int length3 = this._vvvvvvvvvvvvvvv5.length;
        for (int i3 = 0; i3 < length3; i3++) {
            this._vvvvvvvvvvvvvvv5[i3] = new anywheresoftware.b4a.objects.LabelWrapper();
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvv7(int i, int i2, int i3) throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        new anywheresoftware.b4a.objects.ImageViewWrapper();
        panelWrapper.Initialize(this.ba, "oPanelCategory");
        panelWrapper.setTag(java.lang.Integer.valueOf(i3));
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(0, 2, 2, -16777216);
        panelWrapper.setBackground(colorDrawable.getObject());
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        panelWrapper.AddView((android.view.View) ital.TotemLib.utility._v7(this.ba, this._vvvvvvvvvvvvvvv4[i3].ImageFileName, "", "", (int) (i * 0.9d), (int) (i2 * 0.7d)).getObject(), (int) (i * 0.05d), (int) (i2 * 0.05d), (int) (i * 0.9d), (int) (i2 * 0.7d));
        this._vvvvvvvvvvvvvvv5[i3].Initialize(this.ba, "");
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvv5[i3];
        java.lang.String[] strArr = this._vvvvvvvvvvvvvvv4[i3].NameCategory;
        ital.TotemLib.language languageVar = this._vvvvvv1;
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = this._vvvvvvvvvvvvvvv5[i3];
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper2.setGravity(17);
        panelWrapper.AddView((android.view.View) this._vvvvvvvvvvvvvvv5[i3].getObject(), 0, (int) (i2 * 0.75d), i, (int) (i2 * 0.25d));
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.ConcreteViewWrapper _vvvvv3() throws java.lang.Exception {
        return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) this._vvvvvvvvvvvvvvv1.getObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2, ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvv4 = _totemcategorytypeVarArr;
        if (this._vvvvvvvvvvvvvvv4.length > 0) {
            anywheresoftware.b4a.objects.LabelWrapper[] labelWrapperArr = new anywheresoftware.b4a.objects.LabelWrapper[this._vvvvvvvvvvvvvvv4.length];
            int length = labelWrapperArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                labelWrapperArr[i3] = new anywheresoftware.b4a.objects.LabelWrapper();
            }
            this._vvvvvvvvvvvvvvv5 = labelWrapperArr;
            int i4 = (int) (i - (i * 0.05d));
            int length2 = (int) ((i2 / this._vvvvvvvvvvvvvvv4.length) / 20.0d);
            this._vvvvvvvvvvvvvvv2.Initialize(this.ba, "mPanelSlideShow");
            this._vvvvvvvvvvvvvvv2.SetLayout(0, 0, i, (i4 + length2) * this._vvvvvvvvvvvvvvv4.length);
            anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper.setColor(-65536);
            anywheresoftware.b4a.objects.PanelWrapper[] panelWrapperArr = new anywheresoftware.b4a.objects.PanelWrapper[this._vvvvvvvvvvvvvvv4.length];
            int length3 = panelWrapperArr.length;
            for (int i5 = 0; i5 < length3; i5++) {
                panelWrapperArr[i5] = new anywheresoftware.b4a.objects.PanelWrapper();
            }
            this._vvvvvvvvvvvvvvv3 = panelWrapperArr;
            int length4 = this._vvvvvvvvvvvvvvv4.length - 1;
            for (int i6 = 0; i6 <= length4; i6++) {
                this._vvvvvvvvvvvvvvv3[i6] = _vvvvvvvvvvvvvv7(i4, i4, i6);
                this._vvvvvvvvvvvvvvv2.AddView((android.view.View) this._vvvvvvvvvvvvvvv3[i6].getObject(), (int) ((i / 2.0d) - (i4 / 2.0d)), (i4 + length2) * i6, i4, i4);
            }
            this._vvvvvvvvvvvvvvv1.Initialize(this.ba, 0);
            this._vvvvvvvvvvvvvvv1.getPanel().AddView((android.view.View) this._vvvvvvvvvvvvvvv2.getObject(), 0, 0, this._vvvvvvvvvvvvvvv2.getWidth(), this._vvvvvvvvvvvvvvv2.getHeight());
            this._vvvvvvvvvvvvvvv1.getPanel().setHeight(this._vvvvvvvvvvvvvvv2.getHeight());
            return "";
        }
        return "";
    }

    public java.lang.String _opanelcategory_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(panelWrapper, (android.view.ViewGroup) anywheresoftware.b4a.keywords.Common.Sender(this.ba));
        _vvvvvvvvvvvvvv0((int) anywheresoftware.b4a.BA.ObjectToNumber(panelWrapper2.getTag()));
        this._vvvvvvvvvv3._ordercategory_itemclick((int) anywheresoftware.b4a.BA.ObjectToNumber(panelWrapper2.getTag()));
        this._vvvvvvvvvv3._vvvvvvv5();
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvv4.length > 0) {
            int length = this._vvvvvvvvvvvvvvv4.length - 1;
            for (int i = 0; i <= length; i++) {
                anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvv5[i];
                java.lang.String[] strArr = this._vvvvvvvvvvvvvvv4[i].NameCategory;
                ital.TotemLib.language languageVar = this._vvvvvv1;
                labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]));
            }
            return "";
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvv0(int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvv4.length > 0) {
            int length = this._vvvvvvvvvvvvvvv4.length - 1;
            for (int i2 = 0; i2 <= length; i2++) {
                anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvvvvvvvvv3[i2];
                anywheresoftware.b4a.keywords.Common common = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                panelWrapper.setColor(0);
            }
            anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = this._vvvvvvvvvvvvvvv3[i];
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper2.setColor(-3355444);
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
