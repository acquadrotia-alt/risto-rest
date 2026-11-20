package ital.TotemLib;

/* loaded from: classes.dex */
public class totemdata {
    public anywheresoftware.b4a.keywords.Common __c = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;
    private static ital.TotemLib.totemdata mostCurrent = new ital.TotemLib.totemdata();
    public static ital.TotemLib.totemdata._totemcategorytype[] _vv4 = null;
    public static ital.TotemLib.totemdata._totemmenulistproducttype[] _vv5 = null;
    public static ital.TotemLib.totemdata._totemallergenstype[] _vv6 = null;
    public static ital.TotemLib.totemdata._totemtagstype[] _vv7 = null;
    public static ital.TotemLib.totemdata._totempaymentconditionstype[] _vv0 = null;
    public static ital.TotemLib.totemdata._totemconsumptiontype[] _vvv1 = null;
    public static ital.TotemLib.totemdata._totemparamtype _vvv2 = null;
    public static ital.TotemLib.totemdata._totemorderheadtype _vvv3 = null;

    public static java.lang.Object getObject() {
        throw new java.lang.RuntimeException("Code module does not support this method.");
    }

    public static class _totemcategorytype {
        public java.lang.String Code;
        public java.lang.String ImageFileName;
        public boolean IsInitialized;
        public java.lang.String[] NameCategory;
        public ital.TotemLib.totemdata._totemproducttype[] Products;

        public void Initialize() {
            this.IsInitialized = true;
            this.Code = "";
            this.NameCategory = new java.lang.String[5];
            java.util.Arrays.fill(this.NameCategory, "");
            this.ImageFileName = "";
            this.Products = new ital.TotemLib.totemdata._totemproducttype[0];
            int length = this.Products.length;
            for (int i = 0; i < length; i++) {
                this.Products[i] = new ital.TotemLib.totemdata._totemproducttype();
            }
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemproducttype {
        public ital.TotemLib.totemdata._totemallergenstype[] Allergens;
        public java.lang.String Code;
        public java.lang.String[] Description;
        public java.lang.String ImageFileName;
        public boolean IsDiscounted;
        public boolean IsInitialized;
        public java.lang.String Name;
        public double Price;
        public ital.TotemLib.totemdata._totemtagstype[] Tags;
        public ital.TotemLib.totemdata._totemproductvariationstype[] Variations;

        public void Initialize() {
            this.IsInitialized = true;
            this.Code = "";
            this.Name = "";
            this.Description = new java.lang.String[5];
            java.util.Arrays.fill(this.Description, "");
            this.ImageFileName = "";
            this.Price = 0.0d;
            this.IsDiscounted = false;
            this.Variations = new ital.TotemLib.totemdata._totemproductvariationstype[0];
            int length = this.Variations.length;
            for (int i = 0; i < length; i++) {
                this.Variations[i] = new ital.TotemLib.totemdata._totemproductvariationstype();
            }
            this.Allergens = new ital.TotemLib.totemdata._totemallergenstype[0];
            int length2 = this.Allergens.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.Allergens[i2] = new ital.TotemLib.totemdata._totemallergenstype();
            }
            this.Tags = new ital.TotemLib.totemdata._totemtagstype[0];
            int length3 = this.Tags.length;
            for (int i3 = 0; i3 < length3; i3++) {
                this.Tags[i3] = new ital.TotemLib.totemdata._totemtagstype();
            }
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemproductvariationstype {
        public java.lang.String Code;
        public java.lang.String[] Description;
        public boolean FlgExceedingSelected;
        public boolean FlgSelected;
        public boolean IsInitialized;
        public java.lang.String Name;
        public double Price;
        public double PriceExceeding;

        public void Initialize() {
            this.IsInitialized = true;
            this.Code = "";
            this.Name = "";
            this.Description = new java.lang.String[5];
            java.util.Arrays.fill(this.Description, "");
            this.Price = 0.0d;
            this.PriceExceeding = 0.0d;
            this.FlgSelected = false;
            this.FlgExceedingSelected = false;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemproductmenutype {
        public java.lang.String Code;
        public java.lang.String[] Description;
        public java.lang.String ImageFileName;
        public boolean IsDiscounted;
        public boolean IsInitialized;
        public java.lang.String Name;
        public double Price;

        public void Initialize() {
            this.IsInitialized = true;
            this.Code = "";
            this.Name = "";
            this.Description = new java.lang.String[5];
            java.util.Arrays.fill(this.Description, "");
            this.ImageFileName = "";
            this.Price = 0.0d;
            this.IsDiscounted = false;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemmenulistproducttype {
        public boolean IsInitialized;
        public ital.TotemLib.totemdata._totemproductmenutype ProductMenu;
        public ital.TotemLib.totemdata._totemproducttype[] Products;

        public void Initialize() {
            this.IsInitialized = true;
            this.ProductMenu = new ital.TotemLib.totemdata._totemproductmenutype();
            this.Products = new ital.TotemLib.totemdata._totemproducttype[0];
            int length = this.Products.length;
            for (int i = 0; i < length; i++) {
                this.Products[i] = new ital.TotemLib.totemdata._totemproducttype();
            }
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemallergenstype {
        public java.lang.String Code;
        public java.lang.String ImageFileName;
        public boolean IsInitialized;
        public java.lang.String[] Name;

        public void Initialize() {
            this.IsInitialized = true;
            this.Code = "";
            this.ImageFileName = "";
            this.Name = new java.lang.String[5];
            java.util.Arrays.fill(this.Name, "");
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemtagstype {
        public java.lang.String Code;
        public java.lang.String ImageFileName;
        public boolean IsInitialized;
        public java.lang.String[] Name;

        public void Initialize() {
            this.IsInitialized = true;
            this.Code = "";
            this.ImageFileName = "";
            this.Name = new java.lang.String[5];
            java.util.Arrays.fill(this.Name, "");
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemorderheadtype {
        public ital.TotemLib.totemdata._totemconsumptiontype ConsumptionLocation;
        public boolean IsInitialized;
        public ital.TotemLib.totemdata._totempaymentconditionstype PaymentConditions;
        public anywheresoftware.b4a.objects.collections.List RowsList;

        public void Initialize() {
            this.IsInitialized = true;
            this.ConsumptionLocation = new ital.TotemLib.totemdata._totemconsumptiontype();
            this.PaymentConditions = new ital.TotemLib.totemdata._totempaymentconditionstype();
            this.RowsList = new anywheresoftware.b4a.objects.collections.List();
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemorderrowtype {
        public boolean IsInitialized;
        public ital.TotemLib.totemdata._totemproducttype Product;
        public ital.TotemLib.totemdata._totemmenulistproducttype ProductListMenu;
        public int Quantity;
        public double Sconto;
        public double SubTotal;

        public void Initialize() {
            this.IsInitialized = true;
            this.Quantity = 0;
            this.Product = new ital.TotemLib.totemdata._totemproducttype();
            this.ProductListMenu = new ital.TotemLib.totemdata._totemmenulistproducttype();
            this.SubTotal = 0.0d;
            this.Sconto = 0.0d;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totempaymentconditionstype {
        public java.lang.String[] Description;
        public int IdCode;
        public boolean IsInitialized;

        public void Initialize() {
            this.IsInitialized = true;
            this.IdCode = 0;
            this.Description = new java.lang.String[5];
            java.util.Arrays.fill(this.Description, "");
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemconsumptiontype {
        public java.lang.String[] Description;
        public int IdCode;
        public boolean IsInitialized;

        public void Initialize() {
            this.IsInitialized = true;
            this.IdCode = 0;
            this.Description = new java.lang.String[5];
            java.util.Arrays.fill(this.Description, "");
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static class _totemparamtype {
        public boolean IsInitialized;
        public boolean IsSimulation;
        public java.lang.String PathImages;
        public boolean ShowProductCode;

        public void Initialize() {
            this.IsInitialized = true;
            this.PathImages = "";
            this.IsSimulation = false;
            this.ShowProductCode = false;
        }

        public java.lang.String toString() {
            return anywheresoftware.b4a.BA.TypeToString(this, false);
        }
    }

    public static ital.TotemLib.totemdata._totemallergenstype[] _vvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr) throws java.lang.Exception {
        int i = 0;
        ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr2 = new ital.TotemLib.totemdata._totemallergenstype[0];
        int length = _totemallergenstypeVarArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            _totemallergenstypeVarArr2[i2] = new ital.TotemLib.totemdata._totemallergenstype();
        }
        if (_totemallergenstypeVarArr != null) {
            if (_totemallergenstypeVarArr.length > 0) {
                ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr3 = new ital.TotemLib.totemdata._totemallergenstype[_totemallergenstypeVarArr.length];
                int length2 = _totemallergenstypeVarArr3.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    _totemallergenstypeVarArr3[i3] = new ital.TotemLib.totemdata._totemallergenstype();
                }
                int length3 = _totemallergenstypeVarArr.length - 1;
                while (i <= length3) {
                    ital.TotemLib.totemdata._totemallergenstype _totemallergenstypeVar = new ital.TotemLib.totemdata._totemallergenstype();
                    _totemallergenstypeVar.Initialize();
                    _totemallergenstypeVar.Name = _totemallergenstypeVarArr[i].Name;
                    _totemallergenstypeVar.ImageFileName = _totemallergenstypeVarArr[i].ImageFileName;
                    _totemallergenstypeVar.Code = _totemallergenstypeVarArr[i].Code;
                    _totemallergenstypeVarArr3[i] = _totemallergenstypeVar;
                    i++;
                }
                return _totemallergenstypeVarArr3;
            }
            ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr4 = new ital.TotemLib.totemdata._totemallergenstype[0];
            int length4 = _totemallergenstypeVarArr4.length;
            while (i < length4) {
                _totemallergenstypeVarArr4[i] = new ital.TotemLib.totemdata._totemallergenstype();
                i++;
            }
            return _totemallergenstypeVarArr4;
        }
        return (ital.TotemLib.totemdata._totemallergenstype[]) anywheresoftware.b4a.keywords.Common.Null;
    }

    public static ital.TotemLib.totemdata._totemproducttype _vvv4(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar2 = new ital.TotemLib.totemdata._totemproducttype();
        _totemproducttypeVar2.Initialize();
        _totemproducttypeVar2.Code = _totemproducttypeVar.Code;
        _totemproducttypeVar2.Name = _totemproducttypeVar.Name;
        _totemproducttypeVar2.Description = _totemproducttypeVar.Description;
        _totemproducttypeVar2.ImageFileName = _totemproducttypeVar.ImageFileName;
        _totemproducttypeVar2.IsDiscounted = _totemproducttypeVar.IsDiscounted;
        _totemproducttypeVar2.Price = _totemproducttypeVar.Price;
        _totemproducttypeVar2.Variations = _vvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba, _totemproducttypeVar.Variations);
        _totemproducttypeVar2.Allergens = _vvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba, _totemproducttypeVar.Allergens);
        _totemproducttypeVar2.Tags = _vvvvvvvvvvvvvvvvvvvvvvvvvvv0(ba, _totemproducttypeVar.Tags);
        return _totemproducttypeVar2;
    }

    public static ital.TotemLib.totemdata._totemmenulistproducttype _vvv5(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr;
        int i = 0;
        ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar2 = new ital.TotemLib.totemdata._totemmenulistproducttype();
        _totemmenulistproducttypeVar2.Initialize();
        ital.TotemLib.totemdata._totemproductmenutype _totemproductmenutypeVar = new ital.TotemLib.totemdata._totemproductmenutype();
        _totemproductmenutypeVar.Initialize();
        _totemproductmenutypeVar.Code = _totemmenulistproducttypeVar.ProductMenu.Code;
        _totemproductmenutypeVar.Name = _totemmenulistproducttypeVar.ProductMenu.Name;
        _totemproductmenutypeVar.Description = _totemmenulistproducttypeVar.ProductMenu.Description;
        _totemproductmenutypeVar.ImageFileName = _totemmenulistproducttypeVar.ProductMenu.ImageFileName;
        _totemproductmenutypeVar.IsDiscounted = _totemmenulistproducttypeVar.ProductMenu.IsDiscounted;
        _totemproductmenutypeVar.Price = _totemmenulistproducttypeVar.ProductMenu.Price;
        _totemmenulistproducttypeVar2.ProductMenu = _totemproductmenutypeVar;
        ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr2 = new ital.TotemLib.totemdata._totemproducttype[0];
        int length = _totemproducttypeVarArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            _totemproducttypeVarArr2[i2] = new ital.TotemLib.totemdata._totemproducttype();
        }
        if (_totemmenulistproducttypeVar.Products != null) {
            if (_totemmenulistproducttypeVar.Products.length > 0) {
                _totemproducttypeVarArr = new ital.TotemLib.totemdata._totemproducttype[_totemmenulistproducttypeVar.Products.length];
                int length2 = _totemproducttypeVarArr.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    _totemproducttypeVarArr[i3] = new ital.TotemLib.totemdata._totemproducttype();
                }
                int length3 = _totemproducttypeVarArr.length - 1;
                while (i <= length3) {
                    _totemproducttypeVarArr[i] = _vvv4(ba, _totemmenulistproducttypeVar.Products[i]);
                    i++;
                }
            } else {
                _totemproducttypeVarArr = new ital.TotemLib.totemdata._totemproducttype[0];
                int length4 = _totemproducttypeVarArr.length;
                while (i < length4) {
                    _totemproducttypeVarArr[i] = new ital.TotemLib.totemdata._totemproducttype();
                    i++;
                }
            }
        } else {
            _totemproducttypeVarArr = (ital.TotemLib.totemdata._totemproducttype[]) anywheresoftware.b4a.keywords.Common.Null;
        }
        _totemmenulistproducttypeVar2.Products = _totemproducttypeVarArr;
        return _totemmenulistproducttypeVar2;
    }

    public static ital.TotemLib.totemdata._totemtagstype[] _vvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr) throws java.lang.Exception {
        int i = 0;
        ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr2 = new ital.TotemLib.totemdata._totemtagstype[0];
        int length = _totemtagstypeVarArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            _totemtagstypeVarArr2[i2] = new ital.TotemLib.totemdata._totemtagstype();
        }
        if (_totemtagstypeVarArr != null) {
            if (_totemtagstypeVarArr.length > 0) {
                ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr3 = new ital.TotemLib.totemdata._totemtagstype[_totemtagstypeVarArr.length];
                int length2 = _totemtagstypeVarArr3.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    _totemtagstypeVarArr3[i3] = new ital.TotemLib.totemdata._totemtagstype();
                }
                int length3 = _totemtagstypeVarArr.length - 1;
                while (i <= length3) {
                    ital.TotemLib.totemdata._totemtagstype _totemtagstypeVar = new ital.TotemLib.totemdata._totemtagstype();
                    _totemtagstypeVar.Initialize();
                    _totemtagstypeVar.Name = _totemtagstypeVarArr[i].Name;
                    _totemtagstypeVar.ImageFileName = _totemtagstypeVarArr[i].ImageFileName;
                    _totemtagstypeVar.Code = _totemtagstypeVarArr[i].Code;
                    _totemtagstypeVarArr3[i] = _totemtagstypeVar;
                    i++;
                }
                return _totemtagstypeVarArr3;
            }
            ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr4 = new ital.TotemLib.totemdata._totemtagstype[0];
            int length4 = _totemtagstypeVarArr4.length;
            while (i < length4) {
                _totemtagstypeVarArr4[i] = new ital.TotemLib.totemdata._totemtagstype();
                i++;
            }
            return _totemtagstypeVarArr4;
        }
        return (ital.TotemLib.totemdata._totemtagstype[]) anywheresoftware.b4a.keywords.Common.Null;
    }

    public static ital.TotemLib.totemdata._totemproductvariationstype[] _vvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemproductvariationstype[] _totemproductvariationstypeVarArr) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemproductvariationstype[] _totemproductvariationstypeVarArr2 = new ital.TotemLib.totemdata._totemproductvariationstype[0];
        int length = _totemproductvariationstypeVarArr2.length;
        for (int i = 0; i < length; i++) {
            _totemproductvariationstypeVarArr2[i] = new ital.TotemLib.totemdata._totemproductvariationstype();
        }
        if (_totemproductvariationstypeVarArr != null) {
            if (_totemproductvariationstypeVarArr.length > 0) {
                ital.TotemLib.totemdata._totemproductvariationstype[] _totemproductvariationstypeVarArr3 = new ital.TotemLib.totemdata._totemproductvariationstype[_totemproductvariationstypeVarArr.length];
                int length2 = _totemproductvariationstypeVarArr3.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    _totemproductvariationstypeVarArr3[i2] = new ital.TotemLib.totemdata._totemproductvariationstype();
                }
                int length3 = _totemproductvariationstypeVarArr.length - 1;
                for (int i3 = 0; i3 <= length3; i3++) {
                    ital.TotemLib.totemdata._totemproductvariationstype _totemproductvariationstypeVar = new ital.TotemLib.totemdata._totemproductvariationstype();
                    _totemproductvariationstypeVar.Initialize();
                    _totemproductvariationstypeVar.Code = _totemproductvariationstypeVarArr[i3].Code;
                    _totemproductvariationstypeVar.Name = _totemproductvariationstypeVarArr[i3].Name;
                    java.lang.String[] strArr = {_totemproductvariationstypeVarArr[i3].Description[0], _totemproductvariationstypeVarArr[i3].Description[1], _totemproductvariationstypeVarArr[i3].Description[2], _totemproductvariationstypeVarArr[i3].Description[3], _totemproductvariationstypeVarArr[i3].Description[4]};
                    java.util.Arrays.fill(strArr, "");
                    _totemproductvariationstypeVar.Description = strArr;
                    _totemproductvariationstypeVar.Price = _totemproductvariationstypeVarArr[i3].Price;
                    _totemproductvariationstypeVar.PriceExceeding = _totemproductvariationstypeVarArr[i3].PriceExceeding;
                    _totemproductvariationstypeVar.FlgSelected = _totemproductvariationstypeVarArr[i3].FlgSelected;
                    _totemproductvariationstypeVar.FlgExceedingSelected = _totemproductvariationstypeVarArr[i3].FlgExceedingSelected;
                    _totemproductvariationstypeVarArr3[i3] = _totemproductvariationstypeVar;
                }
                return _totemproductvariationstypeVarArr3;
            }
            ital.TotemLib.totemdata._totemproductvariationstype[] _totemproductvariationstypeVarArr4 = new ital.TotemLib.totemdata._totemproductvariationstype[0];
            int length4 = _totemproductvariationstypeVarArr4.length;
            for (int i4 = 0; i4 < length4; i4++) {
                _totemproductvariationstypeVarArr4[i4] = new ital.TotemLib.totemdata._totemproductvariationstype();
            }
            return _totemproductvariationstypeVarArr4;
        }
        return (ital.TotemLib.totemdata._totemproductvariationstype[]) anywheresoftware.b4a.keywords.Common.Null;
    }

    public static ital.TotemLib.totemdata._totemproducttype[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.objects.collections.List list) throws java.lang.Exception {
        if (list.getSize() > 0) {
            ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr = new ital.TotemLib.totemdata._totemproducttype[list.getSize()];
            int length = _totemproducttypeVarArr.length;
            for (int i = 0; i < length; i++) {
                _totemproducttypeVarArr[i] = new ital.TotemLib.totemdata._totemproducttype();
            }
            int size = list.getSize() - 1;
            for (int i2 = 0; i2 <= size; i2++) {
                _totemproducttypeVarArr[i2] = (ital.TotemLib.totemdata._totemproducttype) list.Get(i2);
            }
            return _totemproducttypeVarArr;
        }
        ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr2 = new ital.TotemLib.totemdata._totemproducttype[0];
        int length2 = _totemproducttypeVarArr2.length;
        for (int i3 = 0; i3 < length2; i3++) {
            _totemproducttypeVarArr2[i3] = new ital.TotemLib.totemdata._totemproducttype();
        }
        return _totemproducttypeVarArr2;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemconsumptiontype _totemconsumptiontypeVar = new ital.TotemLib.totemdata._totemconsumptiontype();
        _totemconsumptiontypeVar.IdCode = 1;
        ital.TotemLib.language languageVar = mostCurrent._vvvvvv1;
        _totemconsumptiontypeVar.Description = ital.TotemLib.language._vvvv4(ba, 10);
        _vvv1[0] = _totemconsumptiontypeVar;
        ital.TotemLib.totemdata._totemconsumptiontype _totemconsumptiontypeVar2 = new ital.TotemLib.totemdata._totemconsumptiontype();
        _totemconsumptiontypeVar2.IdCode = 2;
        ital.TotemLib.language languageVar2 = mostCurrent._vvvvvv1;
        _totemconsumptiontypeVar2.Description = ital.TotemLib.language._vvvv4(ba, 11);
        _vvv1[1] = _totemconsumptiontypeVar2;
        return "";
    }

    public static anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.BA ba, boolean z, ital.TotemLib.totemdata._totemtagstype _totemtagstypeVar) throws java.lang.Exception {
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        if (_vv4.length > 0) {
            int length = _vv4.length - 1;
            for (int i = 0; i <= length; i++) {
                if (_vv4[i].Products != null && _vv4[i].Products.length > 0) {
                    int length2 = _vv4[i].Products.length - 1;
                    for (int i2 = 0; i2 <= length2; i2++) {
                        if (z && _vv4[i].Products[i2].IsDiscounted) {
                            list.Add(_vv4[i].Products[i2]);
                        }
                        if (_totemtagstypeVar != null && _vv4[i].Products[i2].Tags != null && _vv4[i].Products[i2].Tags.length > 0) {
                            int length3 = _vv4[i].Products[i2].Tags.length - 1;
                            for (int i3 = 0; i3 <= length3; i3++) {
                                if (_vv4[i].Products[i2].Tags[i3].equals(_totemtagstypeVar) && list.IndexOf(_vv4[i].Products[i2]) == -1) {
                                    list.Add(_vv4[i].Products[i2]);
                                }
                            }
                        }
                    }
                }
            }
        }
        return list;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        ital.TotemLib.totemdata._totempaymentconditionstype _totempaymentconditionstypeVar = new ital.TotemLib.totemdata._totempaymentconditionstype();
        _totempaymentconditionstypeVar.IdCode = 1;
        ital.TotemLib.language languageVar = mostCurrent._vvvvvv1;
        _totempaymentconditionstypeVar.Description = ital.TotemLib.language._vvvv4(ba, 8);
        _vv0[0] = _totempaymentconditionstypeVar;
        ital.TotemLib.totemdata._totempaymentconditionstype _totempaymentconditionstypeVar2 = new ital.TotemLib.totemdata._totempaymentconditionstype();
        _totempaymentconditionstypeVar2.IdCode = 2;
        ital.TotemLib.language languageVar2 = mostCurrent._vvvvvv1;
        _totempaymentconditionstypeVar2.Description = ital.TotemLib.language._vvvv4(ba, 9);
        _vv0[1] = _totempaymentconditionstypeVar2;
        return "";
    }

    public static ital.TotemLib.totemdata._totemproducttype[] _vvv6(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemtagstype _totemtagstypeVar) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.collections.List();
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv1(ba, _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, false, _totemtagstypeVar));
    }

    public static ital.TotemLib.totemdata._totemproducttype[] _vvv7(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.collections.List();
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvv1(ba, _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, true, (ital.TotemLib.totemdata._totemtagstype) anywheresoftware.b4a.keywords.Common.Null));
    }

    public static boolean _vvv0(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar, ital.TotemLib.totemdata._totemmenulistproducttype _totemmenulistproducttypeVar2) throws java.lang.Exception {
        if (_totemmenulistproducttypeVar.ProductMenu.Code.equals(_totemmenulistproducttypeVar2.ProductMenu.Code) && _totemmenulistproducttypeVar.Products.length == _totemmenulistproducttypeVar2.Products.length && _totemmenulistproducttypeVar.Products.length > 0) {
            boolean z = true;
            for (int i = 0; z && i < _totemmenulistproducttypeVar.Products.length; i++) {
                z = _vvvv1(ba, _totemmenulistproducttypeVar.Products[i], _totemmenulistproducttypeVar2.Products[i]);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean _vvvv1(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar, ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar2) throws java.lang.Exception {
        if (!_totemproducttypeVar.Code.equals(_totemproducttypeVar2.Code)) {
            return false;
        }
        if (_totemproducttypeVar.Variations != null && _totemproducttypeVar2.Variations != null && _totemproducttypeVar.Variations.length == _totemproducttypeVar2.Variations.length && _totemproducttypeVar2.Variations.length > 0) {
            return _vvvv2(ba, _totemproducttypeVar.Variations, _totemproducttypeVar2.Variations);
        }
        return true;
    }

    public static boolean _vvvv2(anywheresoftware.b4a.BA ba, ital.TotemLib.totemdata._totemproductvariationstype[] _totemproductvariationstypeVarArr, ital.TotemLib.totemdata._totemproductvariationstype[] _totemproductvariationstypeVarArr2) throws java.lang.Exception {
        if (_totemproductvariationstypeVarArr.length != _totemproductvariationstypeVarArr2.length || _totemproductvariationstypeVarArr.length <= 0) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (i < _totemproductvariationstypeVarArr.length && z) {
            int i2 = 0;
            while (true) {
                if (i2 >= _totemproductvariationstypeVarArr2.length) {
                    z = false;
                    break;
                }
                if (_totemproductvariationstypeVarArr[i].Code.equals(_totemproductvariationstypeVarArr2[i2].Code) && _totemproductvariationstypeVarArr[i].FlgSelected == _totemproductvariationstypeVarArr2[i2].FlgSelected && _totemproductvariationstypeVarArr[i].FlgExceedingSelected == _totemproductvariationstypeVarArr2[i2].FlgExceedingSelected) {
                    z = true;
                    break;
                }
                i2++;
            }
            i++;
        }
        if (i == _totemproductvariationstypeVarArr.length && z) {
            return z;
        }
        return false;
    }

    public static java.lang.String _vvvv3(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvv2(ba);
        return "";
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vv4 = new ital.TotemLib.totemdata._totemcategorytype[0];
        int length = _vv4.length;
        for (int i = 0; i < length; i++) {
            _vv4[i] = new ital.TotemLib.totemdata._totemcategorytype();
        }
        _vv5 = new ital.TotemLib.totemdata._totemmenulistproducttype[0];
        int length2 = _vv5.length;
        for (int i2 = 0; i2 < length2; i2++) {
            _vv5[i2] = new ital.TotemLib.totemdata._totemmenulistproducttype();
        }
        _vv6 = new ital.TotemLib.totemdata._totemallergenstype[0];
        int length3 = _vv6.length;
        for (int i3 = 0; i3 < length3; i3++) {
            _vv6[i3] = new ital.TotemLib.totemdata._totemallergenstype();
        }
        _vv7 = new ital.TotemLib.totemdata._totemtagstype[0];
        int length4 = _vv7.length;
        for (int i4 = 0; i4 < length4; i4++) {
            _vv7[i4] = new ital.TotemLib.totemdata._totemtagstype();
        }
        _vv0 = new ital.TotemLib.totemdata._totempaymentconditionstype[2];
        int length5 = _vv0.length;
        for (int i5 = 0; i5 < length5; i5++) {
            _vv0[i5] = new ital.TotemLib.totemdata._totempaymentconditionstype();
        }
        _vvv1 = new ital.TotemLib.totemdata._totemconsumptiontype[2];
        int length6 = _vvv1.length;
        for (int i6 = 0; i6 < length6; i6++) {
            _vvv1[i6] = new ital.TotemLib.totemdata._totemconsumptiontype();
        }
        _vvv2 = new ital.TotemLib.totemdata._totemparamtype();
        _vvv3 = new ital.TotemLib.totemdata._totemorderheadtype();
        return "";
    }
}
