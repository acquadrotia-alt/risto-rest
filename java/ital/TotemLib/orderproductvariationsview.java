package ital.TotemLib;

/* loaded from: classes.dex */
public class orderproductvariationsview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public ital.TotemLib.totemdata._totemproducttype _vvvvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.totemdata._totemmenulistproducttype _vvvvvvvvvvvvvvvvv1 = null;
    public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _vvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] _vvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderproductvariationsview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderproductvariationsview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _checkboxvariationsboxadd_checkedchange(boolean z) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int ObjectToNumber = (int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(checkBoxWrapper, (android.widget.CheckBox) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag());
        if (z) {
            ital.TotemLib.totemdata._totemproductvariationstype _totemproductvariationstypeVar = this._vvvvvvvvvvvvvvvvvv0.Variations[ObjectToNumber];
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            _totemproductvariationstypeVar.FlgSelected = true;
            anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper2 = this._vvvvvvvvvvvvvvvvvvvvvvvvv1[ObjectToNumber];
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            checkBoxWrapper2.setEnabled(true);
        } else {
            ital.TotemLib.totemdata._totemproductvariationstype _totemproductvariationstypeVar2 = this._vvvvvvvvvvvvvvvvvv0.Variations[ObjectToNumber];
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            _totemproductvariationstypeVar2.FlgSelected = false;
            anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper3 = this._vvvvvvvvvvvvvvvvvvvvvvvvv1[ObjectToNumber];
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            checkBoxWrapper3.setChecked(false);
            anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper4 = this._vvvvvvvvvvvvvvvvvvvvvvvvv1[ObjectToNumber];
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            checkBoxWrapper4.setEnabled(false);
        }
        _vvvvvvvvvvvvvvvvvvvvvvvv6();
        this._vvvvvvvvvv3._vvvvvvv5();
        return "";
    }

    public java.lang.String _checkboxvariationsboxaddexceeding_checkedchange(boolean z) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int ObjectToNumber = (int) anywheresoftware.b4a.BA.ObjectToNumber(((anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(checkBoxWrapper, (android.widget.CheckBox) anywheresoftware.b4a.keywords.Common.Sender(this.ba))).getTag());
        if (z) {
            ital.TotemLib.totemdata._totemproductvariationstype _totemproductvariationstypeVar = this._vvvvvvvvvvvvvvvvvv0.Variations[ObjectToNumber];
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            _totemproductvariationstypeVar.FlgExceedingSelected = true;
        } else {
            ital.TotemLib.totemdata._totemproductvariationstype _totemproductvariationstypeVar2 = this._vvvvvvvvvvvvvvvvvv0.Variations[ObjectToNumber];
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            _totemproductvariationstypeVar2.FlgExceedingSelected = false;
        }
        _vvvvvvvvvvvvvvvvvvvvvvvv6();
        this._vvvvvvvvvv3._vvvvvvv5();
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvvvvvv0 = new ital.TotemLib.totemdata._totemproducttype();
        this._vvvvvvvvvvvvvvvvv1 = new ital.TotemLib.totemdata._totemmenulistproducttype();
        this._vvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[0];
        int length = this._vvvvvvvvvvvvvvvvvvvvvvvv0.length;
        for (int i = 0; i < length; i++) {
            this._vvvvvvvvvvvvvvvvvvvvvvvv0[i] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        }
        this._vvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[0];
        int length2 = this._vvvvvvvvvvvvvvvvvvvvvvvvv1.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this._vvvvvvvvvvvvvvvvvvvvvvvvv1[i2] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvv4(int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.ScrollViewWrapper scrollViewWrapper = new anywheresoftware.b4a.objects.ScrollViewWrapper();
        new anywheresoftware.b4a.objects.PanelWrapper();
        anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvv5(i, i2);
        scrollViewWrapper.Initialize(this.ba, 0);
        scrollViewWrapper.getPanel().AddView((android.view.View) _vvvvvvvvvvvvvvvvvvvvvvvv5.getObject(), 0, 0, _vvvvvvvvvvvvvvvvvvvvvvvv5.getWidth(), _vvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
        scrollViewWrapper.getPanel().setHeight(_vvvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
        return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup) scrollViewWrapper.getObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvv5(int i, int i2) throws java.lang.Exception {
        int i3;
        int i4 = (int) (i2 / 3.0d);
        new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper2 = anywheresoftware.b4a.keywords.Common.Typeface;
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper3 = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(typefaceWrapper, anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(this.ba, "");
        if (this._vvvvvvvvvvvvvvvvvv0.Variations != null && this._vvvvvvvvvvvvvvvvvv0.Variations.length > 0) {
            anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] checkBoxWrapperArr = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[this._vvvvvvvvvvvvvvvvvv0.Variations.length];
            int length = checkBoxWrapperArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                checkBoxWrapperArr[i5] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
            }
            anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[] checkBoxWrapperArr2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper[this._vvvvvvvvvvvvvvvvvv0.Variations.length];
            int length2 = checkBoxWrapperArr2.length;
            for (int i6 = 0; i6 < length2; i6++) {
                checkBoxWrapperArr2[i6] = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
            }
            int length3 = this._vvvvvvvvvvvvvvvvvv0.Variations.length - 1;
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 > length3) {
                    break;
                }
                anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = new anywheresoftware.b4a.objects.PanelWrapper();
                panelWrapper2.Initialize(this.ba, "");
                panelWrapper2.SetLayout(0, 0, i, i2);
                checkBoxWrapperArr[i8].Initialize(this.ba, "checkBoxVariationsBoxAdd");
                checkBoxWrapperArr[i8].setTag(java.lang.Integer.valueOf(i8));
                checkBoxWrapperArr[i8].setTypeface(typefaceWrapper3.getObject());
                checkBoxWrapperArr[i8].setTextSize(i4);
                panelWrapper2.AddView((android.view.View) checkBoxWrapperArr[i8].getObject(), (int) (panelWrapper2.getWidth() * 0.02d), (int) (panelWrapper2.getHeight() * 0.12f), (int) (panelWrapper2.getWidth() * 0.47d), (int) (panelWrapper2.getHeight() * 0.76f));
                checkBoxWrapperArr2[i8].Initialize(this.ba, "checkBoxVariationsBoxAddExceeding");
                checkBoxWrapperArr2[i8].setTag(java.lang.Integer.valueOf(i8));
                anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper = checkBoxWrapperArr2[i8];
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                checkBoxWrapper.setEnabled(false);
                checkBoxWrapperArr2[i8].setTypeface(typefaceWrapper3.getObject());
                checkBoxWrapperArr2[i8].setTextSize(i4);
                panelWrapper2.AddView((android.view.View) checkBoxWrapperArr2[i8].getObject(), (int) (panelWrapper2.getWidth() * 0.65d), (int) (panelWrapper2.getHeight() * 0.12f), (int) (panelWrapper2.getWidth() * 0.34d), (int) (panelWrapper2.getHeight() * 0.76f));
                if (i8 % 2 == 0) {
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                    i3 = -3355444;
                } else {
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                    i3 = -7829368;
                }
                panelWrapper2.setColor(i3);
                panelWrapper.AddView((android.view.View) panelWrapper2.getObject(), 0, i8 * i2, i, i2);
                i7 = i8 + 1;
            }
            this._vvvvvvvvvvvvvvvvvvvvvvvv0 = checkBoxWrapperArr;
            this._vvvvvvvvvvvvvvvvvvvvvvvvv1 = checkBoxWrapperArr2;
            panelWrapper.SetLayout(0, 0, i, this._vvvvvvvvvvvvvvvvvv0.Variations.length * i2);
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper.setColor(-16776961);
            panelWrapper.setPadding(new int[]{2, 2, 2, 2});
        }
        _vvvvvv7();
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.ConcreteViewWrapper _vvvvv3() throws java.lang.Exception {
        return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) this._vvvvvvvvvvvvvvvvvvvvvvvv7.getObject());
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, anywheresoftware.b4a.objects.LabelWrapper labelWrapper, int i, int i2, ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar, ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvvvvvvv3 = labelWrapper;
        this._vvvvvvvvvvvvvvvvvv0 = _totemproducttypeVar;
        this._vvvvvvvvvvvvvvvvv1 = _totemmenulistproducttypeVar;
        this._vvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvv4(i, i2);
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvvv0.Variations != null && this._vvvvvvvvvvvvvvvvvv0.Variations.length > 0) {
            int length = this._vvvvvvvvvvvvvvvvvv0.Variations.length - 1;
            for (int i = 0; i <= length; i++) {
                anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper = this._vvvvvvvvvvvvvvvvvvvvvvvv0[i];
                java.lang.StringBuilder append = new java.lang.StringBuilder().append(this._vvvvvvvvvvvvvvvvvv0.Variations[i].Name).append(" (");
                java.lang.String[] strArr = this._vvvvvvvvvvvvvvvvvv0.Variations[i].Description;
                ital.TotemLib.language languageVar = this._vvvvvv1;
                checkBoxWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(append.append(strArr[(int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba))]).append(")").toString()));
                anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper2 = this._vvvvvvvvvvvvvvvvvvvvvvvvv1[i];
                ital.TotemLib.language languageVar2 = this._vvvvvv1;
                checkBoxWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 1)));
            }
            return "";
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        if (this._vvvvvvvvvvvvvvvvv1 != null && this._vvvvvvvvvvvvvvvvv1.IsInitialized) {
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvvvvvvvvvv3;
            ital.TotemLib.utility utilityVar = this._vvvvv7;
            anywheresoftware.b4a.BA ba = this.ba;
            ital.TotemLib.utility utilityVar2 = this._vvvvv7;
            labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.utility._vv3(ba, ital.TotemLib.utility._v0(this.ba, 1, this._vvvvvvvvvvvvvvvvv1))));
            return "";
        }
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = this._vvvvvvvvvvvvvvvvvvv3;
        ital.TotemLib.utility utilityVar3 = this._vvvvv7;
        anywheresoftware.b4a.BA ba2 = this.ba;
        ital.TotemLib.utility utilityVar4 = this._vvvvv7;
        labelWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.utility._vv3(ba2, ital.TotemLib.utility._vv1(this.ba, 1, this._vvvvvvvvvvvvvvvvvv0, 0.0d))));
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
