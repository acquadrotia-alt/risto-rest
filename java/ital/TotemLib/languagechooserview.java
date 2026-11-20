package ital.TotemLib;

/* loaded from: classes.dex */
public class languagechooserview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvv2 = null;
    public int _max_language = 0;
    public anywheresoftware.b4a.objects.ImageViewWrapper[] _vvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.LabelWrapper[] _vvvvvvvvvvv4 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.languagechooserview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.languagechooserview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvv2 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._max_language = 5;
        this._vvvvvvvvvvv3 = new anywheresoftware.b4a.objects.ImageViewWrapper[this._max_language];
        int length = this._vvvvvvvvvvv3.length;
        for (int i = 0; i < length; i++) {
            this._vvvvvvvvvvv3[i] = new anywheresoftware.b4a.objects.ImageViewWrapper();
        }
        this._vvvvvvvvvvv4 = new anywheresoftware.b4a.objects.LabelWrapper[this._max_language];
        int length2 = this._vvvvvvvvvvv4.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this._vvvvvvvvvvv4[i2] = new anywheresoftware.b4a.objects.LabelWrapper();
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public anywheresoftware.b4a.objects.ConcreteViewWrapper _vvvvv3() throws java.lang.Exception {
        return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) this._vvvvvvvvvvv2.getObject());
    }

    public java.lang.String _imageflags_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.ImageViewWrapper();
        anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper = new anywheresoftware.b4a.objects.ImageViewWrapper();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper2 = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(imageViewWrapper, (android.widget.ImageView) anywheresoftware.b4a.keywords.Common.Sender(this.ba));
        _vvvvvvvvvvv1((int) anywheresoftware.b4a.BA.ObjectToNumber(imageViewWrapper2.getTag()));
        ital.TotemLib.language languageVar = this._vvvvvv1;
        ital.TotemLib.language._vvvvv1(this.ba, (int) (anywheresoftware.b4a.BA.ObjectToNumber(imageViewWrapper2.getTag()) + 1.0d));
        this._vvvvvvvvvv3._vvvvvv7();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvv2.Initialize(this.ba, "");
        this._vvvvvvvvvvv2.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvvvvv2;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-16776961);
        anywheresoftware.b4a.objects.drawable.ColorDrawable colorDrawable = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        colorDrawable.Initialize2(0, 2, 2, -16777216);
        this._vvvvvvvvvvv2.setBackground(colorDrawable.getObject());
        int i3 = (int) (i / this._max_language);
        int i4 = (int) (i3 * 0.1d);
        int i5 = (int) (i4 / 2.0d);
        int i6 = 0;
        while (true) {
            int i7 = i6;
            int i8 = i5;
            if (i7 < this._max_language) {
                anywheresoftware.b4a.objects.ImageViewWrapper[] imageViewWrapperArr = this._vvvvvvvvvvv3;
                ital.TotemLib.utility utilityVar = this._vvvvv7;
                anywheresoftware.b4a.BA ba2 = this.ba;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("flag_");
                ital.TotemLib.language languageVar = this._vvvvvv1;
                imageViewWrapperArr[i7] = ital.TotemLib.utility._v7(ba2, append.append(ital.TotemLib.language._vvvv5(this.ba, i7 + 1)).append(".png").toString(), "imageFlags", anywheresoftware.b4a.BA.NumberToString(i7), i3 - i4, (int) (i2 * 0.7d));
                this._vvvvvvvvvvv2.AddView((android.view.View) this._vvvvvvvvvvv3[i7].getObject(), i8, (int) (i2 * 0.1d), i3 - i4, (int) (i2 * 0.7d));
                this._vvvvvvvvvvv4[i7].Initialize(this.ba, "labelFlagsHighLights");
                this._vvvvvvvvvvv2.AddView((android.view.View) this._vvvvvvvvvvv4[i7].getObject(), i8, (int) (i2 * 0.85d), i3 - i4, (int) (i2 * 0.1d));
                i5 = i8 + i3;
                i6 = i7 + 1;
            } else {
                ital.TotemLib.language languageVar2 = this._vvvvvv1;
                _vvvvvvvvvvv1((int) java.lang.Double.parseDouble(ital.TotemLib.language._vvvv7(this.ba)));
                return "";
            }
        }
    }

    public java.lang.String _vvvvvvvvvvv1(int i) throws java.lang.Exception {
        if (this._vvvvvvvvvvv4.length > 0) {
            int length = this._vvvvvvvvvvv4.length - 1;
            for (int i2 = 0; i2 <= length; i2++) {
                anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvvv4[i2];
                anywheresoftware.b4a.keywords.Common common = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                labelWrapper.setColor(0);
            }
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = this._vvvvvvvvvvv4[i];
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper2.setColor(-65536);
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
