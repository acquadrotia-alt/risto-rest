package ital.TotemLib;

/* loaded from: classes.dex */
public class orderview extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvv6 = null;
    public ital.TotemLib.orderheaderview _vvvvvvv7 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvv0 = null;
    public ital.TotemLib.ordercategoryview _vvvvvvvv1 = null;
    public ital.TotemLib.orderview._ordercontentview _vvvvvvvv2 = null;
    public ital.TotemLib.orderbottomview _vvvvvvvv3 = null;
    public ital.TotemLib.ordershoppingcartview _vvvvvvvv4 = null;
    public ital.TotemLib.orderproductinfoview _vvvvvvvv5 = null;
    public ital.TotemLib.orderdetailsview _vvvvvvvv6 = null;
    public ital.TotemLib.publicityview _vvvvvvvv7 = null;
    public java.lang.Object _vvvvvvvv0 = null;
    public ital.TotemLib.timeoutoperation _vvvvvvvvv1 = null;
    public int _order_step_publicity = 0;
    public int _order_step_compose = 0;
    public int _order_step_summary = 0;
    public int _vvvvvvvvv2 = 0;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.orderview");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.orderview.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public static class _ordercontentview {
        public ital.TotemLib.orderdetailsmenuproductview DetailsMenuProduct;
        public ital.TotemLib.orderdetailsproductvariationsview DetailsProductVariations;
        public ital.TotemLib.ordergridproductdetailsview GridProductDetails;
        public boolean IsInitialized;
        public anywheresoftware.b4a.objects.PanelWrapper PanelContent;

        public void Initialize() {
            this.IsInitialized = true;
            this.PanelContent = new anywheresoftware.b4a.objects.PanelWrapper();
            this.DetailsMenuProduct = new ital.TotemLib.orderdetailsmenuproductview();
            this.DetailsProductVariations = new ital.TotemLib.orderdetailsproductvariationsview();
            this.GridProductDetails = new ital.TotemLib.ordergridproductdetailsview();
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvv6 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvv7 = new ital.TotemLib.orderheaderview();
        this._vvvvvvv0 = new anywheresoftware.b4a.objects.PanelWrapper();
        this._vvvvvvvv1 = new ital.TotemLib.ordercategoryview();
        this._vvvvvvvv2 = new ital.TotemLib.orderview._ordercontentview();
        this._vvvvvvvv3 = new ital.TotemLib.orderbottomview();
        this._vvvvvvvv4 = new ital.TotemLib.ordershoppingcartview();
        this._vvvvvvvv5 = new ital.TotemLib.orderproductinfoview();
        this._vvvvvvvv6 = new ital.TotemLib.orderdetailsview();
        this._vvvvvvvv7 = new ital.TotemLib.publicityview();
        this._vvvvvvvv0 = new java.lang.Object();
        this._vvvvvvvvv1 = new ital.TotemLib.timeoutoperation();
        this._order_step_publicity = 0;
        this._order_step_compose = 1;
        this._order_step_summary = 2;
        this._vvvvvvvvv2 = 0;
        return "";
    }

    public anywheresoftware.b4a.objects.PanelWrapper _vvvvv3() throws java.lang.Exception {
        return this._vvvvvvv6;
    }

    public java.lang.String _vvvvvv3(anywheresoftware.b4a.sql.SQL sql) throws java.lang.Exception {
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vvvv3(this.ba);
        ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
        if (ital.TotemLib.totemdata._vvv2.IsSimulation) {
            new ital.TotemLib.loaddatasimulation()._initialize(this.ba);
            return "";
        }
        new ital.TotemLib.loaddatafromdatabase()._initialize(this.ba, sql);
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, boolean z, java.lang.String str, boolean z2, java.lang.Object obj) throws java.lang.Exception {
        innerInitialize(ba);
        _vvvvvv5(z, str, z2);
        _vvvvvv3(sql);
        this._vvvvvvvv0 = obj;
        this._vvvvvvv6.Initialize(this.ba, "PanelOrder");
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvv6;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-7829368);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = this._vvvvvvv6;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        int PerXToCurrent = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        panelWrapper2.SetLayout(0, 0, PerXToCurrent, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        this._vvvvvvvv7._initialize(this.ba, this);
        this._vvvvvvvvv1._initialize(this.ba, this, 300, 600);
        _vvvvvvv2();
        ital.TotemLib.language languageVar = this._vvvvvv1;
        ital.TotemLib.language._vvvvv1(this.ba, 1);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _vvvvvv4() throws java.lang.Exception {
        this._vvvvvvv6.RemoveAllViews();
        ital.TotemLib.orderheaderview orderheaderviewVar = this._vvvvvvv7;
        anywheresoftware.b4a.BA ba = this.ba;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int PerXToCurrent = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        orderheaderviewVar._initialize(ba, this, PerXToCurrent, anywheresoftware.b4a.keywords.Common.PerYToCurrent(10.0f, this.ba));
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvv6;
        android.view.View view = (android.view.View) this._vvvvvvv7._vvvvv3().getObject();
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        int PerXToCurrent2 = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        panelWrapper.AddView(view, 0, 0, PerXToCurrent2, anywheresoftware.b4a.keywords.Common.PerYToCurrent(10.0f, this.ba));
        ital.TotemLib.orderbottomview orderbottomviewVar = this._vvvvvvvv3;
        anywheresoftware.b4a.BA ba2 = this.ba;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        int PerXToCurrent3 = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        orderbottomviewVar._initialize(ba2, this, PerXToCurrent3, anywheresoftware.b4a.keywords.Common.PerYToCurrent(10.0f, this.ba));
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper2 = this._vvvvvvv6;
        android.view.View view2 = (android.view.View) this._vvvvvvvv3._vvvvv3().getObject();
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        int PerYToCurrent = anywheresoftware.b4a.keywords.Common.PerYToCurrent(90.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        int PerXToCurrent4 = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common9 = this.__c;
        panelWrapper2.AddView(view2, 0, PerYToCurrent, PerXToCurrent4, anywheresoftware.b4a.keywords.Common.PerYToCurrent(10.0f, this.ba));
        this._vvvvvvv0.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper3 = this._vvvvvvv6;
        android.view.View view3 = (android.view.View) this._vvvvvvv0.getObject();
        anywheresoftware.b4a.keywords.Common common10 = this.__c;
        int PerYToCurrent2 = anywheresoftware.b4a.keywords.Common.PerYToCurrent(10.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common11 = this.__c;
        int PerXToCurrent5 = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common12 = this.__c;
        panelWrapper3.AddView(view3, 0, PerYToCurrent2, PerXToCurrent5, anywheresoftware.b4a.keywords.Common.PerYToCurrent(80.0f, this.ba));
        ital.TotemLib.ordershoppingcartview ordershoppingcartviewVar = this._vvvvvvvv4;
        anywheresoftware.b4a.BA ba3 = this.ba;
        anywheresoftware.b4a.keywords.Common common13 = this.__c;
        int PerXToCurrent6 = anywheresoftware.b4a.keywords.Common.PerXToCurrent(40.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common14 = this.__c;
        ordershoppingcartviewVar._initialize(ba3, this, PerXToCurrent6, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        this._vvvvvvvv5._initialize(this.ba, this);
        this._vvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvvvvvv7();
        return "";
    }

    public java.lang.String _vvvvvv5(boolean z, java.lang.String str, boolean z2) throws java.lang.Exception {
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vvv2.Initialize();
        ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
        ital.TotemLib.totemdata._vvv2.IsSimulation = z;
        ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
        ital.TotemLib.totemdata._vvv2.PathImages = str;
        ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
        ital.TotemLib.totemdata._vvv2.ShowProductCode = z2;
        return "";
    }

    public java.lang.String _orderaddmenuproduct_itemclick(ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        this._vvvvvvv7._vvvvvvvvv3(_totemmenulistproducttypeVar);
        _vvvvvvv5();
        return "";
    }

    public java.lang.String _orderaddproduct_itemclick(ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        this._vvvvvvv7._vvvvvvvvv4(_totemproducttypeVar);
        _vvvvvvv5();
        return "";
    }

    public java.lang.String _ordercancel_click() throws java.lang.Exception {
        if (this._vvvvvvvvv2 == this._order_step_compose) {
            this._vvvvvvv7._vvvvvvvvv6();
        } else if (this._vvvvvvvvv2 == this._order_step_summary) {
            _vvvvvv0();
        }
        _vvvvvvv5();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _ordercategory_itemclick(int i) throws java.lang.Exception {
        int width = this._vvvvvvvv2.PanelContent.getWidth();
        int height = this._vvvvvvvv2.PanelContent.getHeight();
        _vvvvvv6(3);
        if (i == 0) {
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            if (ital.TotemLib.totemdata._vv5.length > 0) {
                ital.TotemLib.ordergridproductdetailsview ordergridproductdetailsviewVar = this._vvvvvvvv2.GridProductDetails;
                anywheresoftware.b4a.BA ba = this.ba;
                anywheresoftware.b4a.keywords.Common common = this.__c;
                ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr = (ital.TotemLib.totemdata._totemproducttype[]) anywheresoftware.b4a.keywords.Common.Null;
                ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
                ordergridproductdetailsviewVar._initialize(ba, this, width, height, 3, _totemproducttypeVarArr, ital.TotemLib.totemdata._vv5);
                this._vvvvvvvv2.PanelContent.AddView((android.view.View) this._vvvvvvvv2.GridProductDetails._vvvvv3().getObject(), 0, 0, this._vvvvvvvv2.PanelContent.getWidth(), this._vvvvvvvv2.PanelContent.getHeight());
            }
        } else {
            ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
            if (ital.TotemLib.totemdata._vv4[i].Products.length > 0) {
                ital.TotemLib.ordergridproductdetailsview ordergridproductdetailsviewVar2 = this._vvvvvvvv2.GridProductDetails;
                anywheresoftware.b4a.BA ba2 = this.ba;
                ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
                ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr2 = ital.TotemLib.totemdata._vv4[i].Products;
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                ordergridproductdetailsviewVar2._initialize(ba2, this, width, height, 3, _totemproducttypeVarArr2, (ital.TotemLib.totemdata._totemmenulistproducttype[]) anywheresoftware.b4a.keywords.Common.Null);
                this._vvvvvvvv2.PanelContent.AddView((android.view.View) this._vvvvvvvv2.GridProductDetails._vvvvv3().getObject(), 0, 0, this._vvvvvvvv2.PanelContent.getWidth(), this._vvvvvvvv2.PanelContent.getHeight());
            }
        }
        _vvvvvvv5();
        return "";
    }

    public java.lang.String _orderconfirm_click() throws java.lang.Exception {
        try {
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            if (ital.TotemLib.totemdata._vvv3.RowsList.getSize() > 0) {
                if (this._vvvvvvvvv2 == this._order_step_compose) {
                    new anywheresoftware.b4a.objects.collections.Map();
                    anywheresoftware.b4a.objects.collections.Map _vvvvvvvvv7 = this._vvvvvvv7._vvvvvvvvv7();
                    new anywheresoftware.b4a.objects.collections.Map();
                    anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
                    anywheresoftware.b4a.keywords.Common common = this.__c;
                    anywheresoftware.b4a.objects.collections.Map map2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(map, (anywheresoftware.b4a.objects.collections.Map.MyMap) anywheresoftware.b4a.keywords.Common.CallSubNew2(this.ba, this._vvvvvvvv0, "GetTotem_Transaction", _vvvvvvvvv7));
                    if (map2.getSize() > 0) {
                        this._vvvvvvv7._vvvvvvvvvv2(map2);
                        _vvvvvvv1();
                    }
                } else if (this._vvvvvvvvv2 == this._order_step_summary) {
                    ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
                    ital.TotemLib.totemdata._totempaymentconditionstype _totempaymentconditionstypeVar = ital.TotemLib.totemdata._vvv3.PaymentConditions;
                    if (_totempaymentconditionstypeVar == null) {
                        anywheresoftware.b4a.keywords.Common common2 = this.__c;
                        anywheresoftware.b4a.keywords.Common.MsgboxAsync(anywheresoftware.b4a.BA.ObjectToCharSequence("Selezionare un pagamento"), anywheresoftware.b4a.BA.ObjectToCharSequence("Messaggio"), this.ba);
                        return "";
                    }
                    ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
                    if (ital.TotemLib.totemdata._vvv3.RowsList.getSize() == 0) {
                        anywheresoftware.b4a.keywords.Common common3 = this.__c;
                        anywheresoftware.b4a.keywords.Common.MsgboxAsync(anywheresoftware.b4a.BA.ObjectToCharSequence("Selezionare almeno un articolo"), anywheresoftware.b4a.BA.ObjectToCharSequence("Messaggio"), this.ba);
                        return "";
                    }
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    anywheresoftware.b4a.keywords.Common.CallSubNew2(this.ba, this._vvvvvvvv0, "CloseTotem_Document", java.lang.Integer.valueOf(_totempaymentconditionstypeVar.IdCode));
                    this._vvvvvvv7._vvvvvvvvv6();
                    _vvvvvv0();
                }
            }
            _vvvvvvv5();
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("41638443", anywheresoftware.b4a.BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(this.ba)), 0);
        }
        return "";
    }

    public java.lang.String _orderinfoproductclose_click() throws java.lang.Exception {
        this._vvvvvvvv5._vvvvv3().RemoveView();
        _vvvvvvv5();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _orderinfoproductshow_click(ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        this._vvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvv5(_totemproducttypeVar);
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvv6;
        android.view.View view = (android.view.View) this._vvvvvvvv5._vvvvv3().getObject();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int PerXToCurrent = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        panelWrapper.AddView(view, 0, 0, PerXToCurrent, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        _vvvvvvv5();
        return "";
    }

    public java.lang.String _vvvvvv6(int i) throws java.lang.Exception {
        this._vvvvvvvv2.PanelContent.RemoveAllViews();
        switch (i) {
            case 0:
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common = this.__c;
                _ordercontentviewVar.DetailsMenuProduct = (ital.TotemLib.orderdetailsmenuproductview) anywheresoftware.b4a.keywords.Common.Null;
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar2 = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                _ordercontentviewVar2.DetailsProductVariations = (ital.TotemLib.orderdetailsproductvariationsview) anywheresoftware.b4a.keywords.Common.Null;
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar3 = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                _ordercontentviewVar3.GridProductDetails = (ital.TotemLib.ordergridproductdetailsview) anywheresoftware.b4a.keywords.Common.Null;
                break;
            case 1:
                this._vvvvvvvv2.DetailsMenuProduct = new ital.TotemLib.orderdetailsmenuproductview();
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar4 = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                _ordercontentviewVar4.DetailsProductVariations = (ital.TotemLib.orderdetailsproductvariationsview) anywheresoftware.b4a.keywords.Common.Null;
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar5 = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                _ordercontentviewVar5.GridProductDetails = (ital.TotemLib.ordergridproductdetailsview) anywheresoftware.b4a.keywords.Common.Null;
                break;
            case 2:
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar6 = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                _ordercontentviewVar6.DetailsMenuProduct = (ital.TotemLib.orderdetailsmenuproductview) anywheresoftware.b4a.keywords.Common.Null;
                this._vvvvvvvv2.DetailsProductVariations = new ital.TotemLib.orderdetailsproductvariationsview();
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar7 = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                _ordercontentviewVar7.GridProductDetails = (ital.TotemLib.ordergridproductdetailsview) anywheresoftware.b4a.keywords.Common.Null;
                break;
            case 3:
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar8 = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                _ordercontentviewVar8.DetailsMenuProduct = (ital.TotemLib.orderdetailsmenuproductview) anywheresoftware.b4a.keywords.Common.Null;
                ital.TotemLib.orderview._ordercontentview _ordercontentviewVar9 = this._vvvvvvvv2;
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                _ordercontentviewVar9.DetailsProductVariations = (ital.TotemLib.orderdetailsproductvariationsview) anywheresoftware.b4a.keywords.Common.Null;
                this._vvvvvvvv2.GridProductDetails = new ital.TotemLib.ordergridproductdetailsview();
                break;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _ordermenuproductdetails_itemclick(ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        if (_totemmenulistproducttypeVar != null && _totemmenulistproducttypeVar.Products.length > 0) {
            _vvvvvv6(1);
            ital.TotemLib.orderdetailsmenuproductview orderdetailsmenuproductviewVar = this._vvvvvvvv2.DetailsMenuProduct;
            anywheresoftware.b4a.BA ba = this.ba;
            int width = this._vvvvvvvv2.PanelContent.getWidth();
            int height = this._vvvvvvvv2.PanelContent.getHeight();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            orderdetailsmenuproductviewVar._initialize(ba, this, width, height, anywheresoftware.b4a.keywords.Common.PerYToCurrent(32.0f, this.ba), _totemmenulistproducttypeVar);
            this._vvvvvvvv2.PanelContent.AddView((android.view.View) this._vvvvvvvv2.DetailsMenuProduct._vvvvvvvvvvvvvvv0().getObject(), 0, 0, this._vvvvvvvv2.PanelContent.getWidth(), this._vvvvvvvv2.PanelContent.getHeight());
        }
        _vvvvvvv5();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _orderproductvariationdetails_itemclick(ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        if (_totemproducttypeVar != null) {
            _vvvvvv6(2);
            this._vvvvvvvv2.DetailsProductVariations._initialize(this.ba, this, this._vvvvvvvv2.PanelContent.getWidth(), this._vvvvvvvv2.PanelContent.getHeight(), _totemproducttypeVar);
            this._vvvvvvvv2.PanelContent.AddView((android.view.View) this._vvvvvvvv2.DetailsProductVariations._vvvvvvvvvvvvvvv0().getObject(), 0, 0, this._vvvvvvvv2.PanelContent.getWidth(), this._vvvvvvvv2.PanelContent.getHeight());
        }
        _vvvvvvv5();
        return "";
    }

    public java.lang.String _ordershoppingcartclose_click() throws java.lang.Exception {
        this._vvvvvvvv4._vvvvv3().RemoveView();
        _orderupdatecounter_click();
        _vvvvvvv5();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _ordershoppingcartshow_click() throws java.lang.Exception {
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvv6;
        android.view.View view = (android.view.View) this._vvvvvvvv4._vvvvv3().getObject();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int PerXToCurrent = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        panelWrapper.AddView(view, 0, 0, PerXToCurrent, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        _vvvvvvv5();
        return "";
    }

    public java.lang.String _orderupdatecounter_click() throws java.lang.Exception {
        this._vvvvvvv7._vvvvvvvvvv1();
        return "";
    }

    public java.lang.String _panelorder_click() throws java.lang.Exception {
        return "";
    }

    public java.lang.String _vvvvvv7() throws java.lang.Exception {
        this._vvvvvvvv1._vvvvvv7();
        if (this._vvvvvvvv2.DetailsProductVariations != null) {
            this._vvvvvvvv2.DetailsProductVariations._vvvvvv7();
        } else if (this._vvvvvvvv2.DetailsMenuProduct != null) {
            this._vvvvvvvv2.DetailsMenuProduct._vvvvvv7();
        } else if (this._vvvvvvvv2.GridProductDetails != null) {
            this._vvvvvvvv2.GridProductDetails._vvvvvv7();
        }
        if (this._vvvvvvvv6.IsInitialized()) {
            this._vvvvvvvv6._vvvvvv7();
        }
        this._vvvvvvvv3._vvvvvv7();
        _vvvvvvv5();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _vvvvvv0() throws java.lang.Exception {
        this._vvvvvvvvv2 = this._order_step_compose;
        _vvvvvv4();
        this._vvvvvvv0.RemoveAllViews();
        int height = this._vvvvvvv0.getHeight();
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        this._vvvvvvvv1._initialize(this.ba, this, (int) (this._vvvvvvv0.getWidth() * 0.15d), height, ital.TotemLib.totemdata._vv4);
        this._vvvvvvv0.AddView((android.view.View) this._vvvvvvvv1._vvvvv3().getObject(), 0, 0, (int) (this._vvvvvvv0.getWidth() * 0.15d), this._vvvvvvv0.getHeight());
        this._vvvvvvvv2.Initialize();
        this._vvvvvvvv2.PanelContent.Initialize(this.ba, "");
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvvv2.PanelContent;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-16711936);
        _vvvvvv6(0);
        this._vvvvvvv0.AddView((android.view.View) this._vvvvvvvv2.PanelContent.getObject(), (int) (this._vvvvvvv0.getWidth() * 0.15d), 0, (int) (this._vvvvvvv0.getWidth() * 0.85d), this._vvvvvvv0.getHeight());
        _vvvvvv7();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _vvvvvvv1() throws java.lang.Exception {
        this._vvvvvvvvv2 = this._order_step_summary;
        _vvvvvv4();
        this._vvvvvvv0.RemoveAllViews();
        this._vvvvvvvv6._initialize(this.ba, this, this._vvvvvvv0.getWidth(), this._vvvvvvv0.getHeight());
        this._vvvvvvv0.AddView((android.view.View) this._vvvvvvvv6._vvvvv3().getObject(), 0, 0, this._vvvvvvv0.getWidth(), this._vvvvvvv0.getHeight());
        _vvvvvv7();
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String _vvvvvvv2() throws java.lang.Exception {
        this._vvvvvvvvv2 = this._order_step_publicity;
        this._vvvvvvv6.RemoveAllViews();
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = this._vvvvvvv6;
        android.view.View view = (android.view.View) this._vvvvvvvv7._vvvvv3().getObject();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int PerXToCurrent = anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, this.ba);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        panelWrapper.AddView(view, 0, 0, PerXToCurrent, anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, this.ba));
        return "";
    }

    public java.lang.String _vvvvv4(boolean z) throws java.lang.Exception {
        this._vvvvvvv6.SetVisibleAnimated(500, z);
        return "";
    }

    public java.lang.String _vvvvvvv3() throws java.lang.Exception {
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._totemorderheadtype _totemorderheadtypeVar = ital.TotemLib.totemdata._vvv3;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        _totemorderheadtypeVar.ConsumptionLocation = (ital.TotemLib.totemdata._totemconsumptiontype) anywheresoftware.b4a.keywords.Common.Null;
        ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
        ital.TotemLib.totemdata._totemorderheadtype _totemorderheadtypeVar2 = ital.TotemLib.totemdata._vvv3;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        _totemorderheadtypeVar2.PaymentConditions = (ital.TotemLib.totemdata._totempaymentconditionstype) anywheresoftware.b4a.keywords.Common.Null;
        ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
        ital.TotemLib.totemdata._vvv3.RowsList.Clear();
        _vvvvvv0();
        return "";
    }

    public java.lang.String _vvvvvvv4() throws java.lang.Exception {
        _vvvvvvv2();
        return "";
    }

    public java.lang.String _vvvvvvv5() throws java.lang.Exception {
        this._vvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvvvvvv6();
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
