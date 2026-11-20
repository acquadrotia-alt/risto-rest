package ital.TotemLib;

/* loaded from: classes.dex */
public class orderbottomview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _vvvvvvvvvvvvvv5 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _vvvvvvvvvvvvvv6 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderbottomview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderbottomview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _buttonordercancel_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._ordercancel_click();
        return "";
    }

    public java.lang.String _buttonorderconfirm_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._orderconfirm_click();
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.ButtonWrapper();
        this._vvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.ButtonWrapper();
        return "";
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        return this._vvvvvvvvvvvvvv4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvvvvvv4.Initialize(this.ba, "");
        this._vvvvvvvvvvvvvv4.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-251);
        this._vvvvvvvvvvvvvv5.Initialize(this.ba, "buttonOrderCancel");
        this._vvvvvvvvvvvvvv4.AddView((android.view.View) this._vvvvvvvvvvvvvv5.getObject(), (int) (this._vvvvvvvvvvvvvv4.getWidth() * 0.05d), (int) (this._vvvvvvvvvvvvvv4.getHeight() * 0.02d), (int) (this._vvvvvvvvvvvvvv4.getWidth() * 0.4d), (int) (this._vvvvvvvvvvvvvv4.getHeight() * 0.98d));
        this._vvvvvvvvvvvvvv6.Initialize(this.ba, "buttonOrderConfirm");
        this._vvvvvvvvvvvvvv4.AddView((android.view.View) this._vvvvvvvvvvvvvv6.getObject(), (int) (this._vvvvvvvvvvvvvv4.getWidth() * 0.55d), (int) (this._vvvvvvvvvvvvvv4.getHeight() * 0.02d), (int) (this._vvvvvvvvvvvvvv4.getWidth() * 0.4d), (int) (this._vvvvvvvvvvvvvv4.getHeight() * 0.98d));
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        if (this._vvvvvvvvvv3._vvvvvvvvv2 == this._vvvvvvvvvv3._order_step_compose) {
            anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = this._vvvvvvvvvvvvvv5;
            ital.TotemLib.language languageVar = this._vvvvvv1;
            buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 3)));
        } else if (this._vvvvvvvvvv3._vvvvvvvvv2 == this._vvvvvvvvvv3._order_step_summary) {
            anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = this._vvvvvvvvvvvvvv5;
            ital.TotemLib.language languageVar2 = this._vvvvvv1;
            buttonWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 13)));
        }
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper3 = this._vvvvvvvvvvvvvv6;
        ital.TotemLib.language languageVar3 = this._vvvvvv1;
        buttonWrapper3.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.language._vvvv0(this.ba, 2)));
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
