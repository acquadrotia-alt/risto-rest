package ital.TotemLib;

/* loaded from: classes.dex */
public class orderheaderview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.orderview _vvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvv5 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvv6 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvv7 = null;
    public ital.TotemLib.languagechooserview _vvvvvvvvvv0 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderheaderview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderheaderview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _vvvvvvvvv3(ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int _vvvvvvvvv5 = _vvvvvvvvv5((ital.TotemLib.totemdata._totemproducttype) anywheresoftware.b4a.keywords.Common.Null, _totemmenulistproducttypeVar);
        if (_vvvvvvvvv5 > -1) {
            new ital.TotemLib.totemdata._totemorderrowtype();
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar = (ital.TotemLib.totemdata._totemorderrowtype) ital.TotemLib.totemdata._vvv3.RowsList.Get(_vvvvvvvvv5);
            _totemorderrowtypeVar.Quantity++;
            ital.TotemLib.utility utilityVar = this._vvvvv7;
            _totemorderrowtypeVar.SubTotal = ital.TotemLib.utility._v0(this.ba, _totemorderrowtypeVar.Quantity, _totemorderrowtypeVar.ProductListMenu);
        } else {
            ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar2 = new ital.TotemLib.totemdata._totemorderrowtype();
            _totemorderrowtypeVar2.Initialize();
            _totemorderrowtypeVar2.Quantity = 1;
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            _totemorderrowtypeVar2.Product = (ital.TotemLib.totemdata._totemproducttype) anywheresoftware.b4a.keywords.Common.Null;
            _totemorderrowtypeVar2.ProductListMenu = _totemmenulistproducttypeVar;
            ital.TotemLib.utility utilityVar2 = this._vvvvv7;
            _totemorderrowtypeVar2.SubTotal = ital.TotemLib.utility._v0(this.ba, _totemorderrowtypeVar2.Quantity, _totemorderrowtypeVar2.ProductListMenu);
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            ital.TotemLib.totemdata._vvv3.RowsList.Add(_totemorderrowtypeVar2);
        }
        _vvvvvvvvvv1();
        return "";
    }

    public java.lang.String _vvvvvvvvv4(ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int _vvvvvvvvv5 = _vvvvvvvvv5(_totemproducttypeVar, (ital.TotemLib.totemdata._totemmenulistproducttype) anywheresoftware.b4a.keywords.Common.Null);
        if (_vvvvvvvvv5 > -1) {
            new ital.TotemLib.totemdata._totemorderrowtype();
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar = (ital.TotemLib.totemdata._totemorderrowtype) ital.TotemLib.totemdata._vvv3.RowsList.Get(_vvvvvvvvv5);
            _totemorderrowtypeVar.Quantity++;
            ital.TotemLib.utility utilityVar = this._vvvvv7;
            _totemorderrowtypeVar.SubTotal = ital.TotemLib.utility._vv1(this.ba, _totemorderrowtypeVar.Quantity, _totemproducttypeVar, _totemorderrowtypeVar.Sconto);
        } else {
            ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar2 = new ital.TotemLib.totemdata._totemorderrowtype();
            _totemorderrowtypeVar2.Initialize();
            _totemorderrowtypeVar2.Quantity = 1;
            _totemorderrowtypeVar2.Product = _totemproducttypeVar;
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            _totemorderrowtypeVar2.ProductListMenu = (ital.TotemLib.totemdata._totemmenulistproducttype) anywheresoftware.b4a.keywords.Common.Null;
            _totemorderrowtypeVar2.Sconto = 0.0d;
            ital.TotemLib.utility utilityVar2 = this._vvvvv7;
            _totemorderrowtypeVar2.SubTotal = ital.TotemLib.utility._vv1(this.ba, _totemorderrowtypeVar2.Quantity, _totemproducttypeVar, _totemorderrowtypeVar2.Sconto);
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            ital.TotemLib.totemdata._vvv3.RowsList.Add(_totemorderrowtypeVar2);
        }
        _vvvvvvvvvv1();
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvv3 = new ital.TotemLib.orderview();
        this._vvvvvvvvvv4 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvv5 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvvvv6 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvv7 = new anywheresoftware.b4a.objects.LabelWrapper();
        this._vvvvvvvvvv0 = new ital.TotemLib.languagechooserview();
        return "";
    }

    public int _vvvvvvvvv5(ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar, ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv3.RowsList.getSize() > 0) {
            new ital.TotemLib.totemdata._totemorderrowtype();
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            int size = ital.TotemLib.totemdata._vvv3.RowsList.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
                ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar = (ital.TotemLib.totemdata._totemorderrowtype) ital.TotemLib.totemdata._vvv3.RowsList.Get(i);
                if (_totemproducttypeVar != null && _totemorderrowtypeVar.Product != null) {
                    ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
                    if (ital.TotemLib.totemdata._vvvv1(this.ba, _totemorderrowtypeVar.Product, _totemproducttypeVar)) {
                        return i;
                    }
                }
                if (_totemmenulistproducttypeVar != null && _totemorderrowtypeVar.ProductListMenu != null) {
                    ital.TotemLib.totemdata totemdataVar5 = this._vvvvv0;
                    if (ital.TotemLib.totemdata._vvv0(this.ba, _totemorderrowtypeVar.ProductListMenu, _totemmenulistproducttypeVar)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        return this._vvvvvvvvvv4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, ital.TotemLib.orderview orderviewVar, int i, int i2) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvv3 = orderviewVar;
        this._vvvvvvvvvv4.Initialize(this.ba, "");
        this._vvvvvvvvvv4.SetLayout(0, 0, i, i2);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvvvv4;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-256);
        this._vvvvvvvvvv0._initialize(this.ba, this._vvvvvvvvvv3, (int) (i * 0.45d), (int) (i2 * 0.98d));
        this._vvvvvvvvvv4.AddView((android.view.View) this._vvvvvvvvvv0._vvvvv3().getObject(), (int) (i * 0.05d), (int) (i2 * 0.01d), (int) (i * 0.45d), (int) (i2 * 0.98d));
        int i3 = (int) (i * 0.43d);
        int i4 = (int) (i2 * 0.98d);
        this._vvvvvvvvvv5.Initialize(this.ba, "");
        this._vvvvvvvvvv5.SetLayout(0, 0, i3, i4);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = this._vvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper2.setColor(-3355444);
        this._vvvvvvvvvv6.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvv6;
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
        _vvvvvvvvv0(labelWrapper, i2, -7829368);
        this._vvvvvvvvvv5.AddView((android.view.View) this._vvvvvvvvvv6.getObject(), (int) (this._vvvvvvvvvv5.getWidth() * 0.01d), (int) (this._vvvvvvvvvv5.getHeight() * 0.05d), (int) (this._vvvvvvvvvv5.getWidth() * 0.36d), (int) (this._vvvvvvvvvv5.getHeight() * 0.9d));
        this._vvvvvvvvvv7.Initialize(this.ba, "mPanelTotalAmount");
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = this._vvvvvvvvvv7;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
        _vvvvvvvvv0(labelWrapper2, i2, -12303292);
        this._vvvvvvvvvv5.AddView((android.view.View) this._vvvvvvvvvv7.getObject(), (int) (this._vvvvvvvvvv5.getWidth() * 0.38d), (int) (this._vvvvvvvvvv5.getHeight() * 0.05d), (int) (this._vvvvvvvvvv5.getWidth() * 0.61d), (int) (this._vvvvvvvvvv5.getHeight() * 0.9d));
        this._vvvvvvvvvv4.AddView((android.view.View) this._vvvvvvvvvv5.getObject(), (int) (i * 0.52d), (int) (i2 * 0.01d), i3, i4);
        _vvvvvvvvvv1();
        return "";
    }

    public java.lang.String _mpaneltotalamount_click() throws java.lang.Exception {
        this._vvvvvvvvvv3._ordershoppingcartshow_click();
        return "";
    }

    public java.lang.String _vvvvvvvvv6() throws java.lang.Exception {
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vvv3.RowsList.Clear();
        _vvvvvvvvvv1();
        return "";
    }

    public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvv7() throws java.lang.Exception {
        double d = 0.0d;
        anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
        map.Initialize();
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv3.RowsList.getSize() > 0) {
            new ital.TotemLib.totemdata._totemorderrowtype();
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            int size = ital.TotemLib.totemdata._vvv3.RowsList.getSize() - 1;
            int i = 0;
            for (int i2 = 0; i2 <= size; i2++) {
                ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
                ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar = (ital.TotemLib.totemdata._totemorderrowtype) ital.TotemLib.totemdata._vvv3.RowsList.Get(i2);
                ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar = _totemorderrowtypeVar.Product;
                map.Put("IdRow", java.lang.Integer.valueOf(i2));
                map.Put("Code_" + anywheresoftware.b4a.BA.NumberToString(i2), _totemproducttypeVar.Code);
                map.Put("Qty_" + anywheresoftware.b4a.BA.NumberToString(i2), java.lang.Integer.valueOf(_totemorderrowtypeVar.Quantity));
                i += _totemorderrowtypeVar.Quantity;
                d += _totemorderrowtypeVar.SubTotal;
            }
            ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
            map.Put("TotRows", java.lang.Integer.valueOf(ital.TotemLib.totemdata._vvv3.RowsList.getSize()));
        }
        return map;
    }

    public java.lang.String _vvvvvvvvv0(anywheresoftware.b4a.objects.LabelWrapper labelWrapper, int i, int i2) throws java.lang.Exception {
        labelWrapper.setColor(i2);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper.setGravity(17);
        labelWrapper.setTextSize((float) (i / 2.0d));
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
        labelWrapper.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
        return "";
    }

    public java.lang.String _vvvvvvvvvv1() throws java.lang.Exception {
        int i = 0;
        double d = 0.0d;
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv3.RowsList.getSize() > 0) {
            new ital.TotemLib.totemdata._totemorderrowtype();
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            int size = ital.TotemLib.totemdata._vvv3.RowsList.getSize() - 1;
            int i2 = 0;
            int i3 = 0;
            double d2 = 0.0d;
            while (i2 <= size) {
                ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
                ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar = (ital.TotemLib.totemdata._totemorderrowtype) ital.TotemLib.totemdata._vvv3.RowsList.Get(i2);
                int i4 = _totemorderrowtypeVar.Quantity + i3;
                i2++;
                d2 = _totemorderrowtypeVar.SubTotal + d2;
                i3 = i4;
            }
            double d3 = d2;
            i = i3;
            d = d3;
        }
        this._vvvvvvvvvv6.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(java.lang.Integer.valueOf(i)));
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = this._vvvvvvvvvv7;
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ital.TotemLib.utility._vv3(this.ba, d)));
        return "";
    }

    public java.lang.String _vvvvvvvvvv2(anywheresoftware.b4a.objects.collections.Map map) throws java.lang.Exception {
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        int size = ital.TotemLib.totemdata._vvv3.RowsList.getSize() - 1;
        for (int i = 0; i <= size; i++) {
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            ital.TotemLib.totemdata._totemorderrowtype _totemorderrowtypeVar = (ital.TotemLib.totemdata._totemorderrowtype) ital.TotemLib.totemdata._vvv3.RowsList.Get(i);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (!anywheresoftware.b4a.keywords.Common.Not(map.ContainsKey("Amount_" + anywheresoftware.b4a.BA.NumberToString(i)))) {
                double ObjectToNumber = anywheresoftware.b4a.BA.ObjectToNumber(map.GetDefault("Amount_" + anywheresoftware.b4a.BA.NumberToString(i), 0));
                ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar = _totemorderrowtypeVar.Product;
                if (ObjectToNumber < _totemorderrowtypeVar.SubTotal) {
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    _totemorderrowtypeVar.Sconto = anywheresoftware.b4a.keywords.Common.Round2((_totemproducttypeVar.Price * _totemorderrowtypeVar.Quantity) - ObjectToNumber, 2);
                    _totemorderrowtypeVar.SubTotal = ObjectToNumber;
                }
            }
        }
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
