package ital.TotemLib;

/* loaded from: classes.dex */
public class loaddatafromdatabase extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public anywheresoftware.b4a.sql.SQL _vvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.loaddatafromdatabase");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.loaddatafromdatabase.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _vvvvvvvvvvv7() throws java.lang.Exception {
        ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr = new ital.TotemLib.totemdata._totemcategorytype[1];
        int length = _totemcategorytypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemcategorytypeVarArr[i] = new ital.TotemLib.totemdata._totemcategorytype();
        }
        _totemcategorytypeVarArr[0].Code = "Menu";
        _totemcategorytypeVarArr[0].NameCategory = new java.lang.String[]{"Menù", "Menu", "Menu", "Speisekarte", "Menú"};
        _totemcategorytypeVarArr[0].ImageFileName = "reparto_menu.png";
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        anywheresoftware.b4a.BA activityBA = getActivityBA();
        ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
        ital.TotemLib.totemdata._vv4 = ital.TotemLib.utility._v5(activityBA, _totemcategorytypeVarArr, ital.TotemLib.totemdata._vv4);
        ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr2 = new ital.TotemLib.totemdata._totemcategorytype[1];
        int length2 = _totemcategorytypeVarArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            _totemcategorytypeVarArr2[i2] = new ital.TotemLib.totemdata._totemcategorytype();
        }
        _totemcategorytypeVarArr2[0].Code = "SpecialOffer";
        _totemcategorytypeVarArr2[0].NameCategory = new java.lang.String[]{"Offerte Risparmio", "Savings Offers", "Offres d'épargne", "Sparangebote", "Ofertas de ahorro"};
        _totemcategorytypeVarArr2[0].ImageFileName = "reparto_savings_offers.png";
        ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
        ital.TotemLib.utility utilityVar2 = this._vvvvv7;
        anywheresoftware.b4a.BA activityBA2 = getActivityBA();
        ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
        ital.TotemLib.totemdata._vv4 = ital.TotemLib.utility._v5(activityBA2, ital.TotemLib.totemdata._vv4, _totemcategorytypeVarArr2);
        ital.TotemLib.totemdata totemdataVar5 = this._vvvvv0;
        if (ital.TotemLib.totemdata._vv7.length > 0) {
            ital.TotemLib.totemdata totemdataVar6 = this._vvvvv0;
            ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr3 = new ital.TotemLib.totemdata._totemcategorytype[ital.TotemLib.totemdata._vv7.length];
            int length3 = _totemcategorytypeVarArr3.length;
            for (int i3 = 0; i3 < length3; i3++) {
                _totemcategorytypeVarArr3[i3] = new ital.TotemLib.totemdata._totemcategorytype();
            }
            ital.TotemLib.totemdata totemdataVar7 = this._vvvvv0;
            int length4 = ital.TotemLib.totemdata._vv7.length - 1;
            for (int i4 = 0; i4 <= length4; i4++) {
                ital.TotemLib.totemdata._totemcategorytype _totemcategorytypeVar = new ital.TotemLib.totemdata._totemcategorytype();
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("tags");
                ital.TotemLib.totemdata totemdataVar8 = this._vvvvv0;
                _totemcategorytypeVar.Code = append.append(ital.TotemLib.totemdata._vv7[i4].Code).toString();
                java.lang.String[] strArr = {ital.TotemLib.totemdata._vv7[i4].Name[0], ital.TotemLib.totemdata._vv7[i4].Name[1], ital.TotemLib.totemdata._vv7[i4].Name[2], ital.TotemLib.totemdata._vv7[i4].Name[3], ital.TotemLib.totemdata._vv7[i4].Name[4]};
                java.util.Arrays.fill(strArr, "");
                ital.TotemLib.totemdata totemdataVar9 = this._vvvvv0;
                ital.TotemLib.totemdata totemdataVar10 = this._vvvvv0;
                ital.TotemLib.totemdata totemdataVar11 = this._vvvvv0;
                ital.TotemLib.totemdata totemdataVar12 = this._vvvvv0;
                ital.TotemLib.totemdata totemdataVar13 = this._vvvvv0;
                _totemcategorytypeVar.NameCategory = strArr;
                _totemcategorytypeVar.ImageFileName = _totemcategorytypeVar.Code + ".png";
                ital.TotemLib.totemdata totemdataVar14 = this._vvvvv0;
                anywheresoftware.b4a.BA activityBA3 = getActivityBA();
                ital.TotemLib.totemdata totemdataVar15 = this._vvvvv0;
                _totemcategorytypeVar.Products = ital.TotemLib.totemdata._vvv6(activityBA3, ital.TotemLib.totemdata._vv7[i4]);
                _totemcategorytypeVarArr3[i4] = _totemcategorytypeVar;
            }
            ital.TotemLib.totemdata totemdataVar16 = this._vvvvv0;
            ital.TotemLib.utility utilityVar3 = this._vvvvv7;
            anywheresoftware.b4a.BA activityBA4 = getActivityBA();
            ital.TotemLib.totemdata totemdataVar17 = this._vvvvv0;
            ital.TotemLib.totemdata._vv4 = ital.TotemLib.utility._v5(activityBA4, ital.TotemLib.totemdata._vv4, _totemcategorytypeVarArr3);
            return "";
        }
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvvvvvv3 = new anywheresoftware.b4a.sql.SQL();
        return "";
    }

    public ital.TotemLib.totemdata._totemallergenstype _vvvvvvvvvvvvv6(java.lang.String str) throws java.lang.Exception {
        new ital.TotemLib.totemdata._totemallergenstype();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        ital.TotemLib.totemdata._totemallergenstype _totemallergenstypeVar = (ital.TotemLib.totemdata._totemallergenstype) anywheresoftware.b4a.keywords.Common.Null;
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vv6.length > 0) {
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            int length = ital.TotemLib.totemdata._vv6.length - 1;
            for (int i = 0; i <= length; i++) {
                ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
                if (ital.TotemLib.totemdata._vv6[i].Code.equals(str)) {
                    ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
                    return ital.TotemLib.totemdata._vv6[i];
                }
            }
            return _totemallergenstypeVar;
        }
        return _totemallergenstypeVar;
    }

    public ital.TotemLib.totemdata._totemallergenstype[] _vvvvvvvvvvvvv7(ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr = new ital.TotemLib.totemdata._totemallergenstype[0];
        int length = _totemallergenstypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemallergenstypeVarArr[i] = new ital.TotemLib.totemdata._totemallergenstype();
        }
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL sql = this._vvvvvvvvvvvvvv3;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("SELECT p.codice\n\t\t\t\t\t\t\t\t\t    FROM allergeniPLU p\n\t\t\t\t\t\t\t\t\t\tINNER JOIN allergeni al ON al.codice = p.codice\n\t\t\t\t\t\t\t\t\t\tWHERE p.codint = ");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, sql.ExecQuery(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _totemproducttypeVar.Code)).append("\n\t\t\t\t\t\t\t\t\t\t  AND al.tag = 0\n\t\t\t\t\t\t\t\t\t\tORDER BY p.codice").toString()));
        if (cursorWrapper2.getRowCount() > 0) {
            _totemallergenstypeVarArr = new ital.TotemLib.totemdata._totemallergenstype[cursorWrapper2.getRowCount()];
            int length2 = _totemallergenstypeVarArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                _totemallergenstypeVarArr[i2] = new ital.TotemLib.totemdata._totemallergenstype();
            }
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("47602190", "Product " + _totemproducttypeVar.Code + " " + _totemproducttypeVar.Description[0], 0);
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i3 = 0; i3 <= rowCount; i3++) {
                cursorWrapper2.setPosition(i3);
                new ital.TotemLib.totemdata._totemallergenstype();
                ital.TotemLib.totemdata._totemallergenstype _vvvvvvvvvvvvv6 = _vvvvvvvvvvvvv6(cursorWrapper2.GetString("codice"));
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.keywords.Common.LogImpl("47602198", "Allergens " + _vvvvvvvvvvvvv6.Code + " " + _vvvvvvvvvvvvv6.Name[0], 0);
                _totemallergenstypeVarArr[i3] = _vvvvvvvvvvvvv6;
            }
        }
        cursorWrapper2.Close();
        return _totemallergenstypeVarArr;
    }

    public ital.TotemLib.totemdata._totemproducttype[] _vvvvvvvvvvvv1(java.lang.String str) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr = new ital.TotemLib.totemdata._totemproducttype[0];
        int length = _totemproducttypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemproducttypeVarArr[i] = new ital.TotemLib.totemdata._totemproducttype();
        }
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL sql = this._vvvvvvvvvvvvvv3;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("SELECT a.codint, a.descrizione, a.list1 As Price, \t\n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione1,\"\") as descrizione1,  \n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione2,\"\") as descrizione2, \n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione3,\"\") as descrizione3,  \n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione4,\"\") as descrizione4,  \n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione5,\"\") as descrizione5\n\t\t\t\t\t\t\t\t\t\t\tFROM anagra a  \n\t\t\t\t\t\t\t\t\t\t\t LEFT JOIN anagraDescrizioni d ON a.codint = d.codint \n\t\t\t\t\t\t\t\t\t\t\tWHERE a.reparto > 0\n\t\t\t\t\t\t\t\t\t\t\t  AND a.flgusointerno = 0\n\t\t\t\t\t\t\t\t\t\t\t  AND a.reparto = ");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, sql.ExecQuery(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append(" \n\t\t\t\t\t\t\t\t\t\t\t  And a.bvar = 0\n\t\t\t\t\t\t\t\t\t\t\tORDER BY a.codint ").toString()));
        if (cursorWrapper2.getRowCount() > 0) {
            _totemproducttypeVarArr = new ital.TotemLib.totemdata._totemproducttype[cursorWrapper2.getRowCount()];
            int length2 = _totemproducttypeVarArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                _totemproducttypeVarArr[i2] = new ital.TotemLib.totemdata._totemproducttype();
            }
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i3 = 0; i3 <= rowCount; i3++) {
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.keywords.Common.LogImpl("47471128", "*******************************", 0);
                cursorWrapper2.setPosition(i3);
                _totemproducttypeVarArr[i3].Code = cursorWrapper2.GetString("codint");
                _totemproducttypeVarArr[i3].Name = cursorWrapper2.GetString("descrizione");
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.keywords.Common.LogImpl("47471134", "Product " + _totemproducttypeVarArr[i3].Code + " " + _totemproducttypeVarArr[i3].Name, 0);
                java.lang.String[] strArr = {cursorWrapper2.GetString("descrizione1"), cursorWrapper2.GetString("descrizione2"), cursorWrapper2.GetString("descrizione3"), cursorWrapper2.GetString("descrizione4"), cursorWrapper2.GetString("descrizione5")};
                java.util.Arrays.fill(strArr, "");
                _totemproducttypeVarArr[i3].Description = strArr;
                _totemproducttypeVarArr[i3].Price = cursorWrapper2.GetDouble("Price").doubleValue();
                _totemproducttypeVarArr[i3].ImageFileName = _totemproducttypeVarArr[i3].Code + ".png";
                ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar = _totemproducttypeVarArr[i3];
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                _totemproducttypeVar.IsDiscounted = false;
                _totemproducttypeVarArr[i3].Allergens = _vvvvvvvvvvvvv7(_totemproducttypeVarArr[i3]);
                _totemproducttypeVarArr[i3].Tags = _vvvvvvvvvvvvvv1(_totemproducttypeVarArr[i3]);
            }
        }
        cursorWrapper2.Close();
        return _totemproducttypeVarArr;
    }

    public ital.TotemLib.totemdata._totemtagstype _vvvvvvvvvvvvv0(java.lang.String str) throws java.lang.Exception {
        new ital.TotemLib.totemdata._totemtagstype();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        ital.TotemLib.totemdata._totemtagstype _totemtagstypeVar = (ital.TotemLib.totemdata._totemtagstype) anywheresoftware.b4a.keywords.Common.Null;
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        if (ital.TotemLib.totemdata._vv7.length > 0) {
            ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
            int length = ital.TotemLib.totemdata._vv7.length - 1;
            for (int i = 0; i <= length; i++) {
                ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
                if (ital.TotemLib.totemdata._vv7[i].Code.equals(str)) {
                    ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
                    return ital.TotemLib.totemdata._vv7[i];
                }
            }
            return _totemtagstypeVar;
        }
        return _totemtagstypeVar;
    }

    public ital.TotemLib.totemdata._totemtagstype[] _vvvvvvvvvvvvvv1(ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr = new ital.TotemLib.totemdata._totemtagstype[0];
        int length = _totemtagstypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemtagstypeVarArr[i] = new ital.TotemLib.totemdata._totemtagstype();
        }
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL sql = this._vvvvvvvvvvvvvv3;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("SELECT p.codice\n\t\t\t\t\t\t\t\t\t    FROM allergeniPLU p\n\t\t\t\t\t\t\t\t\t\tINNER JOIN allergeni al ON al.codice = p.codice\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\tWHERE p.codint = ");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, sql.ExecQuery(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _totemproducttypeVar.Code)).append("\n\t\t\t\t\t\t\t\t\t\t  AND al.tag = 1\n\t\t\t\t\t\t\t\t\t\tORDER BY p.codice").toString()));
        if (cursorWrapper2.getRowCount() > 0) {
            _totemtagstypeVarArr = new ital.TotemLib.totemdata._totemtagstype[cursorWrapper2.getRowCount()];
            int length2 = _totemtagstypeVarArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                _totemtagstypeVarArr[i2] = new ital.TotemLib.totemdata._totemtagstype();
            }
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("47733262", "Product " + _totemproducttypeVar.Code + " " + _totemproducttypeVar.Description[0], 0);
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i3 = 0; i3 <= rowCount; i3++) {
                cursorWrapper2.setPosition(i3);
                new ital.TotemLib.totemdata._totemtagstype();
                ital.TotemLib.totemdata._totemtagstype _vvvvvvvvvvvvv0 = _vvvvvvvvvvvvv0(cursorWrapper2.GetString("codice"));
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.keywords.Common.LogImpl("47733270", "Tag " + _vvvvvvvvvvvvv0.Code + " " + _vvvvvvvvvvvvv0.Name[0], 0);
                _totemtagstypeVarArr[i3] = _vvvvvvvvvvvvv0;
            }
        }
        cursorWrapper2.Close();
        return _totemtagstypeVarArr;
    }

    public java.lang.String _vvvvvvvvvvvvvv2() throws java.lang.Exception {
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), this._vvvvvvvvvvvvvv3.ExecQuery("SELECT (SELECT COUNT(a.tag) FROM allergeni a WHERE a.tag = 0 ) AS NumAllergeni,\n\t\t\t\t\t\t\t\t\t\t\t\t\t      (SELECT COUNT(a.tag) FROM allergeni a WHERE a.tag = 1) AS NumTag\n\t\t\t\t\t\t\t\t\t\t\t\t"));
        if (cursorWrapper.getRowCount() > 0) {
            cursorWrapper.setPosition(0);
            int GetInt = cursorWrapper.GetInt("NumAllergeni");
            int GetInt2 = cursorWrapper.GetInt("NumTag");
            ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr = new ital.TotemLib.totemdata._totemallergenstype[GetInt];
            int length = _totemallergenstypeVarArr.length;
            for (int i = 0; i < length; i++) {
                _totemallergenstypeVarArr[i] = new ital.TotemLib.totemdata._totemallergenstype();
            }
            ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr = new ital.TotemLib.totemdata._totemtagstype[GetInt2];
            int length2 = _totemtagstypeVarArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                _totemtagstypeVarArr[i2] = new ital.TotemLib.totemdata._totemtagstype();
            }
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), this._vvvvvvvvvvvvvv3.ExecQuery("SELECT a.codice, a.tag, \"All\" || a.codice AS IdDescr,  a.descrizione,\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione1,\"\") as descrizione1,  \n\t\t\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione2,\"\") as descrizione2, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione3,\"\") as descrizione3,  \n\t\t\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione4,\"\") as descrizione4,  \n\t\t\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione5,\"\") as descrizione5\n\t\t\t\t\t\t\t\t\t\t\tFROM allergeni a\t\t\t\t\t\t  \n\t\t\t\t\t\t\t\t\t\t\t  LEFT JOIN anagraDescrizioni d ON d.codint = IdDescr\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\tORDER BY a.codice\n\t\t\t\t\t\t\t\t\t\t\t\t"));
            if (cursorWrapper.getRowCount() > 0) {
                int rowCount = cursorWrapper.getRowCount() - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 <= rowCount; i5++) {
                    cursorWrapper.setPosition(i5);
                    if (cursorWrapper.GetInt("tag") == 0) {
                        ital.TotemLib.totemdata._totemallergenstype _totemallergenstypeVar = new ital.TotemLib.totemdata._totemallergenstype();
                        _totemallergenstypeVar.Code = cursorWrapper.GetString("codice");
                        _totemallergenstypeVar.ImageFileName = "allergeni" + _totemallergenstypeVar.Code + ".png";
                        java.lang.String[] strArr = {cursorWrapper.GetString("descrizione1"), cursorWrapper.GetString("descrizione2"), cursorWrapper.GetString("descrizione3"), cursorWrapper.GetString("descrizione4"), cursorWrapper.GetString("descrizione5")};
                        java.util.Arrays.fill(strArr, "");
                        _totemallergenstypeVar.Name = strArr;
                        if (_totemallergenstypeVar.Name[0].equals("")) {
                            _totemallergenstypeVar.Name[0] = cursorWrapper.GetString("descrizione");
                        }
                        _totemallergenstypeVarArr[i4] = _totemallergenstypeVar;
                        i4++;
                    } else if (cursorWrapper.GetInt("tag") == 1) {
                        ital.TotemLib.totemdata._totemtagstype _totemtagstypeVar = new ital.TotemLib.totemdata._totemtagstype();
                        _totemtagstypeVar.Code = cursorWrapper.GetString("codice");
                        _totemtagstypeVar.ImageFileName = "tags" + _totemtagstypeVar.Code + ".png";
                        java.lang.String[] strArr2 = {cursorWrapper.GetString("descrizione1"), cursorWrapper.GetString("descrizione2"), cursorWrapper.GetString("descrizione3"), cursorWrapper.GetString("descrizione4"), cursorWrapper.GetString("descrizione5")};
                        java.util.Arrays.fill(strArr2, "");
                        _totemtagstypeVar.Name = strArr2;
                        if (_totemtagstypeVar.Name[0].equals("")) {
                            _totemtagstypeVar.Name[0] = cursorWrapper.GetString("descrizione");
                        }
                        _totemtagstypeVarArr[i3] = _totemtagstypeVar;
                        i3++;
                    }
                }
                ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
                ital.TotemLib.totemdata._vv6 = _totemallergenstypeVarArr;
                ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
                ital.TotemLib.totemdata._vv7 = _totemtagstypeVarArr;
            }
        }
        cursorWrapper.Close();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvv7() throws java.lang.Exception {
        ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr = null;
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), this._vvvvvvvvvvvvvv3.ExecQuery("SELECT DISTINCT r.codice, r.descrizione, \"Rep\" || r.codice AS IdDescr,\n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione1,\"\") as descrizione1,  \n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione2,\"\") as descrizione2, \n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione3,\"\") as descrizione3,  \n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione4,\"\") as descrizione4,  \n\t\t\t\t\t\t\t\t\t\t\t\tIFNULL(d.descrizione5,\"\") as descrizione5\t\n\t\t\t\t\t\t\t\t\t\t\tFROM reparti r\n\t\t\t\t\t\t\t\t\t\t\t INNER JOIN anagra a ON a.reparto = r.codice\n\t\t\t\t\t\t\t\t\t\t\t LEFT JOIN anagraDescrizioni d ON d.codint = IdDescr\t\n\t\t\t\t\t\t\t\t\t\t\tWHERE a.reparto > 0\n\t\t\t\t\t\t\t\t\t\t\t  AND a.flgusointerno = 0 \n\t\t\t\t\t\t\t\t\t\t\t  AND a.bvar = 0\n\t\t\t\t\t\t\t\t\t\t\tORDER BY r.codice\n\t\t\t\t\t\t\t\t\t"));
        if (cursorWrapper.getRowCount() > 0) {
            _totemcategorytypeVarArr = new ital.TotemLib.totemdata._totemcategorytype[cursorWrapper.getRowCount()];
            int length = _totemcategorytypeVarArr.length;
            for (int i = 0; i < length; i++) {
                _totemcategorytypeVarArr[i] = new ital.TotemLib.totemdata._totemcategorytype();
            }
            int rowCount = cursorWrapper.getRowCount() - 1;
            for (int i2 = 0; i2 <= rowCount; i2++) {
                cursorWrapper.setPosition(i2);
                ital.TotemLib.totemdata._totemcategorytype _totemcategorytypeVar = new ital.TotemLib.totemdata._totemcategorytype();
                _totemcategorytypeVar.Initialize();
                _totemcategorytypeVar.Code = cursorWrapper.GetString("codice");
                java.lang.String[] strArr = {cursorWrapper.GetString("descrizione1"), cursorWrapper.GetString("descrizione2"), cursorWrapper.GetString("descrizione3"), cursorWrapper.GetString("descrizione4"), cursorWrapper.GetString("descrizione5")};
                java.util.Arrays.fill(strArr, "");
                _totemcategorytypeVar.NameCategory = strArr;
                if (_totemcategorytypeVar.NameCategory[0].equals("")) {
                    _totemcategorytypeVar.NameCategory[0] = cursorWrapper.GetString("descrizione");
                }
                _totemcategorytypeVar.ImageFileName = "reparto" + _totemcategorytypeVar.Code + ".png";
                _totemcategorytypeVar.Products = _vvvvvvvvvvvv1(_totemcategorytypeVar.Code);
                _totemcategorytypeVarArr[i2] = _totemcategorytypeVar;
            }
        }
        cursorWrapper.Close();
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vv4 = _totemcategorytypeVarArr;
        _vvvvvvvvvvv7();
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvvvvvv3 = sql;
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vvv3.Initialize();
        ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
        ital.TotemLib.totemdata._vvv3.RowsList.Initialize();
        _vvvvvvvvvvvvvv2();
        _vvvvvvvvvvvv7();
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
