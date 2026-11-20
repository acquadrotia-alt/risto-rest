package ital.TotemLib;

/* loaded from: classes.dex */
public class loaddatasimulation extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public int _vvvvvvvvvvvvv2 = 0;
    public ital.TotemLib.utility _vvvvv7 = null;
    public ital.TotemLib.totemdata _vvvvv0 = null;
    public ital.TotemLib.language _vvvvvv1 = null;
    public ital.TotemLib.acttotemmain _vvvvvv2 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "ital.TotemLib.loaddatasimulation");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", ital.TotemLib.loaddatasimulation.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public ital.TotemLib.totemdata._totemallergenstype _vvvvvvvvvvv5(int i, java.lang.String str, java.lang.String[] strArr) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemallergenstype _totemallergenstypeVar = new ital.TotemLib.totemdata._totemallergenstype();
        _totemallergenstypeVar.Code = anywheresoftware.b4a.BA.NumberToString(i);
        _totemallergenstypeVar.ImageFileName = str;
        _totemallergenstypeVar.Name = strArr;
        return _totemallergenstypeVar;
    }

    public ital.TotemLib.totemdata._totemtagstype _vvvvvvvvvvv6(int i, java.lang.String str, java.lang.String[] strArr) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemtagstype _totemtagstypeVar = new ital.TotemLib.totemdata._totemtagstype();
        _totemtagstypeVar.Code = anywheresoftware.b4a.BA.NumberToString(i);
        _totemtagstypeVar.ImageFileName = str;
        _totemtagstypeVar.Name = strArr;
        return _totemtagstypeVar;
    }

    public java.lang.String _vvvvvvvvvvv7() throws java.lang.Exception {
        ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr = new ital.TotemLib.totemdata._totemcategorytype[1];
        int length = _totemcategorytypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemcategorytypeVarArr[i] = new ital.TotemLib.totemdata._totemcategorytype();
        }
        _totemcategorytypeVarArr[0].Code = "10";
        _totemcategorytypeVarArr[0].NameCategory = new java.lang.String[]{"Offerte Risparmio", "Savings Offers", "Offres d'épargne", "Sparangebote", "Ofertas de ahorro"};
        _totemcategorytypeVarArr[0].ImageFileName = "simulator_category_savings_offers.png";
        ital.TotemLib.totemdata._totemcategorytype _totemcategorytypeVar = _totemcategorytypeVarArr[0];
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        _totemcategorytypeVar.Products = ital.TotemLib.totemdata._vvv7(getActivityBA());
        ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
        ital.TotemLib.utility utilityVar = this._vvvvv7;
        anywheresoftware.b4a.BA activityBA = getActivityBA();
        ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
        ital.TotemLib.totemdata._vv4 = ital.TotemLib.utility._v5(activityBA, ital.TotemLib.totemdata._vv4, _totemcategorytypeVarArr);
        ital.TotemLib.totemdata totemdataVar4 = this._vvvvv0;
        if (ital.TotemLib.totemdata._vv7.length > 0) {
            ital.TotemLib.totemdata totemdataVar5 = this._vvvvv0;
            ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr2 = new ital.TotemLib.totemdata._totemcategorytype[ital.TotemLib.totemdata._vv7.length];
            int length2 = _totemcategorytypeVarArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                _totemcategorytypeVarArr2[i2] = new ital.TotemLib.totemdata._totemcategorytype();
            }
            ital.TotemLib.totemdata totemdataVar6 = this._vvvvv0;
            int length3 = ital.TotemLib.totemdata._vv7.length - 1;
            for (int i3 = 0; i3 <= length3; i3++) {
                ital.TotemLib.totemdata._totemcategorytype _totemcategorytypeVar2 = new ital.TotemLib.totemdata._totemcategorytype();
                ital.TotemLib.totemdata totemdataVar7 = this._vvvvv0;
                _totemcategorytypeVar2.Code = ital.TotemLib.totemdata._vv7[i3].Code;
                java.lang.String[] strArr = {ital.TotemLib.totemdata._vv7[i3].Name[0], ital.TotemLib.totemdata._vv7[i3].Name[1], ital.TotemLib.totemdata._vv7[i3].Name[2], ital.TotemLib.totemdata._vv7[i3].Name[3], ital.TotemLib.totemdata._vv7[i3].Name[4]};
                java.util.Arrays.fill(strArr, "");
                ital.TotemLib.totemdata totemdataVar8 = this._vvvvv0;
                ital.TotemLib.totemdata totemdataVar9 = this._vvvvv0;
                ital.TotemLib.totemdata totemdataVar10 = this._vvvvv0;
                ital.TotemLib.totemdata totemdataVar11 = this._vvvvv0;
                ital.TotemLib.totemdata totemdataVar12 = this._vvvvv0;
                _totemcategorytypeVar2.NameCategory = strArr;
                ital.TotemLib.totemdata totemdataVar13 = this._vvvvv0;
                _totemcategorytypeVar2.ImageFileName = ital.TotemLib.totemdata._vv7[i3].ImageFileName;
                ital.TotemLib.totemdata totemdataVar14 = this._vvvvv0;
                anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                ital.TotemLib.totemdata totemdataVar15 = this._vvvvv0;
                _totemcategorytypeVar2.Products = ital.TotemLib.totemdata._vvv6(activityBA2, ital.TotemLib.totemdata._vv7[i3]);
                _totemcategorytypeVarArr2[i3] = _totemcategorytypeVar2;
            }
            ital.TotemLib.totemdata totemdataVar16 = this._vvvvv0;
            ital.TotemLib.utility utilityVar2 = this._vvvvv7;
            anywheresoftware.b4a.BA activityBA3 = getActivityBA();
            ital.TotemLib.totemdata totemdataVar17 = this._vvvvv0;
            ital.TotemLib.totemdata._vv4 = ital.TotemLib.utility._v5(activityBA3, ital.TotemLib.totemdata._vv4, _totemcategorytypeVarArr2);
            return "";
        }
        return "";
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvvvvv2 = 100;
        return "";
    }

    public java.lang.String _vvvvvvvvvvv0() throws java.lang.Exception {
        this._vvvvvvvvvvvvv2++;
        return anywheresoftware.b4a.BA.NumberToString(this._vvvvvvvvvvvvv2);
    }

    public ital.TotemLib.totemdata._totemproducttype[] _vvvvvvvvvvvv1(java.lang.String str, int i, boolean z, boolean z2) throws java.lang.Exception {
        ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr = new ital.TotemLib.totemdata._totemproducttype[i];
        int length = _totemproducttypeVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            _totemproducttypeVarArr[i2] = new ital.TotemLib.totemdata._totemproducttype();
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 <= i3; i4++) {
            _totemproducttypeVarArr[i4].Code = _vvvvvvvvvvv0();
            _totemproducttypeVarArr[i4].Name = str + " " + anywheresoftware.b4a.BA.NumberToString(i4 + 1);
            java.lang.String[] strArr = {"Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit"};
            java.lang.String[] strArr2 = {r6.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(2, 6)]).toString(), r6.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(3, 6)]).toString(), r6.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(1, 5)]).toString(), r6.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(3, 6)]).toString(), r6.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(2, 8)]).toString()};
            java.util.Arrays.fill(strArr2, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            java.lang.StringBuilder append = sb.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(0, 5)]).append(" ");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            java.lang.StringBuilder append2 = append.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(5, 8)]).append(" ");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            java.lang.StringBuilder append3 = append2.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(0, 6)]).append(" ");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append4 = sb2.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(2, 4)]).append(" ");
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            java.lang.StringBuilder append5 = append4.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(2, 5)]).append(" ");
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            java.lang.StringBuilder append6 = append5.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(0, 8)]).append(" ");
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            java.lang.StringBuilder append7 = sb3.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(1, 3)]).append(" ");
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            java.lang.StringBuilder append8 = append7.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(1, 3)]).append(" ");
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            java.lang.StringBuilder append9 = append8.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(0, 2)]).append(" ");
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            java.lang.StringBuilder append10 = sb4.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(0, 1)]).append(" ");
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            java.lang.StringBuilder append11 = append10.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(0, 7)]).append(" ");
            anywheresoftware.b4a.keywords.Common common15 = this.__c;
            java.lang.StringBuilder append12 = append11.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(0, 1)]).append(" ");
            anywheresoftware.b4a.keywords.Common common16 = this.__c;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common17 = this.__c;
            java.lang.StringBuilder append13 = sb5.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(3, 8)]).append(" ");
            anywheresoftware.b4a.keywords.Common common18 = this.__c;
            java.lang.StringBuilder append14 = append13.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(3, 7)]).append(" ");
            anywheresoftware.b4a.keywords.Common common19 = this.__c;
            java.lang.StringBuilder append15 = append14.append(strArr[anywheresoftware.b4a.keywords.Common.Rnd(0, 7)]).append(" ");
            anywheresoftware.b4a.keywords.Common common20 = this.__c;
            _totemproducttypeVarArr[i4].Description = strArr2;
            ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar = _totemproducttypeVarArr[i4];
            java.lang.StringBuilder append16 = new java.lang.StringBuilder().append("simulator_").append(str);
            anywheresoftware.b4a.keywords.Common common21 = this.__c;
            _totemproducttypeVar.ImageFileName = append16.append(anywheresoftware.b4a.keywords.Common.NumberFormat(i4 + 1, 2, 0)).append(".png").toString();
            _totemproducttypeVarArr[i4].Price = _vvvvvvvvvvvv3(1, 18);
            anywheresoftware.b4a.keywords.Common common22 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Rnd(0, 2) == 0) {
                ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar2 = _totemproducttypeVarArr[i4];
                anywheresoftware.b4a.keywords.Common common23 = this.__c;
                _totemproducttypeVar2.IsDiscounted = false;
            } else {
                ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar3 = _totemproducttypeVarArr[i4];
                anywheresoftware.b4a.keywords.Common common24 = this.__c;
                _totemproducttypeVar3.IsDiscounted = true;
            }
            anywheresoftware.b4a.keywords.Common common25 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                if (z2) {
                    _totemproducttypeVarArr[i4].Variations = _vvvvvvvvvvvv5(_totemproducttypeVarArr[i4].Name);
                } else {
                    ital.TotemLib.totemdata._totemproducttype _totemproducttypeVar4 = _totemproducttypeVarArr[i4];
                    anywheresoftware.b4a.keywords.Common common26 = this.__c;
                    _totemproducttypeVar4.Variations = (ital.TotemLib.totemdata._totemproductvariationstype[]) anywheresoftware.b4a.keywords.Common.Null;
                }
                _totemproducttypeVarArr[i4].Allergens = _vvvvvvvvvvvv2();
                _totemproducttypeVarArr[i4].Tags = _vvvvvvvvvvvv4();
            }
        }
        return _totemproducttypeVarArr;
    }

    public ital.TotemLib.totemdata._totemallergenstype[] _vvvvvvvvvvvv2() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int Rnd = anywheresoftware.b4a.keywords.Common.Rnd(1, 6);
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr = new ital.TotemLib.totemdata._totemallergenstype[Rnd];
        int length = _totemallergenstypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemallergenstypeVarArr[i] = new ital.TotemLib.totemdata._totemallergenstype();
        }
        while (list.getSize() < Rnd) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            int Rnd2 = anywheresoftware.b4a.keywords.Common.Rnd(0, ital.TotemLib.totemdata._vv7.length);
            if (list.IndexOf(java.lang.Integer.valueOf(Rnd2)) == -1) {
                list.Add(java.lang.Integer.valueOf(Rnd2));
                int size = list.getSize() - 1;
                ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
                _totemallergenstypeVarArr[size] = ital.TotemLib.totemdata._vv6[Rnd2];
            }
        }
        return _totemallergenstypeVarArr;
    }

    public double _vvvvvvvvvvvv3(int i, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int Rnd = anywheresoftware.b4a.keywords.Common.Rnd(0, 100);
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        double Rnd2 = (Rnd / 100.0d) + anywheresoftware.b4a.keywords.Common.Rnd(i, i2 + 1);
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        return anywheresoftware.b4a.keywords.Common.Round2(Rnd2, 2);
    }

    public ital.TotemLib.totemdata._totemtagstype[] _vvvvvvvvvvvv4() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int Rnd = anywheresoftware.b4a.keywords.Common.Rnd(1, 6);
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr = new ital.TotemLib.totemdata._totemtagstype[Rnd];
        int length = _totemtagstypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemtagstypeVarArr[i] = new ital.TotemLib.totemdata._totemtagstype();
        }
        while (list.getSize() < Rnd) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
            int Rnd2 = anywheresoftware.b4a.keywords.Common.Rnd(0, ital.TotemLib.totemdata._vv7.length);
            if (list.IndexOf(java.lang.Integer.valueOf(Rnd2)) == -1) {
                list.Add(java.lang.Integer.valueOf(Rnd2));
                int size = list.getSize() - 1;
                ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
                _totemtagstypeVarArr[size] = ital.TotemLib.totemdata._vv7[Rnd2];
            }
        }
        return _totemtagstypeVarArr;
    }

    public ital.TotemLib.totemdata._totemproductvariationstype[] _vvvvvvvvvvvv5(java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int Rnd = anywheresoftware.b4a.keywords.Common.Rnd(1, 8);
        ital.TotemLib.totemdata._totemproductvariationstype[] _totemproductvariationstypeVarArr = new ital.TotemLib.totemdata._totemproductvariationstype[Rnd];
        int length = _totemproductvariationstypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemproductvariationstypeVarArr[i] = new ital.TotemLib.totemdata._totemproductvariationstype();
        }
        int i2 = Rnd - 1;
        for (int i3 = 0; i3 <= i2; i3++) {
            _totemproductvariationstypeVarArr[i3].Code = _vvvvvvvvvvv0();
            _totemproductvariationstypeVarArr[i3].Name = "[" + str + "] Variations " + anywheresoftware.b4a.BA.NumberToString(i3);
            java.lang.String[] strArr = {"it var", "uk var", "fr var", "de var", "es var"};
            java.util.Arrays.fill(strArr, "");
            _totemproductvariationstypeVarArr[i3].Description = strArr;
            _totemproductvariationstypeVarArr[i3].Price = _vvvvvvvvvvvv3(1, 5);
            double d = _totemproductvariationstypeVarArr[i3].Price * 0.25d;
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            _totemproductvariationstypeVarArr[i3].PriceExceeding = anywheresoftware.b4a.keywords.Common.Round2(d + _totemproductvariationstypeVarArr[i3].Price, 2);
        }
        return _totemproductvariationstypeVarArr;
    }

    public java.lang.String _vvvvvvvvvvvv6() throws java.lang.Exception {
        ital.TotemLib.totemdata._totemallergenstype[] _totemallergenstypeVarArr = new ital.TotemLib.totemdata._totemallergenstype[14];
        int length = _totemallergenstypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemallergenstypeVarArr[i] = new ital.TotemLib.totemdata._totemallergenstype();
        }
        _totemallergenstypeVarArr[0] = _vvvvvvvvvvv5(0, "simulator_allergens_00_cerals_containing_gluten.png", new java.lang.String[]{"Cereali contenenti glutine", "Cerals containing gluten", "Cereales contenant du gluten ", "Glutenhaltiges Getreide", "Cereales con Gluten"});
        _totemallergenstypeVarArr[1] = _vvvvvvvvvvv5(1, "simulator_allergens_01_crustaceans.png", new java.lang.String[]{"Crostacei", "Crustaceans", "Crustaces", "Krebstiere", "Crostaceos de Marisco"});
        _totemallergenstypeVarArr[2] = _vvvvvvvvvvv5(2, "simulator_allergens_02_eggs.png", new java.lang.String[]{"Uova e derivati", "Eggs", "Oeufs", "Eier", "Huveos"});
        _totemallergenstypeVarArr[3] = _vvvvvvvvvvv5(3, "simulator_allergens_03_fish.png", new java.lang.String[]{"Pesce", "Fish", "Poisson", "Fische", "Pescado"});
        _totemallergenstypeVarArr[4] = _vvvvvvvvvvv5(4, "simulator_allergens_04_peanuts.png", new java.lang.String[]{"Arachidi e derivati", "Peanuts", "Arachides", "Erdnusse", "Cacahuetes"});
        _totemallergenstypeVarArr[5] = _vvvvvvvvvvv5(5, "simulator_allergens_05_soyabeans.png", new java.lang.String[]{"Soia e derivati", "Soyabeans", "Soja", "Sojabohnen", "Soja"});
        _totemallergenstypeVarArr[6] = _vvvvvvvvvvv5(6, "simulator_allergens_06_milk.png", new java.lang.String[]{"Latte e derivati", "Milk", "Lait", "Milch", "Leche"});
        _totemallergenstypeVarArr[7] = _vvvvvvvvvvv5(7, "simulator_allergens_07_tree_nuts.png", new java.lang.String[]{"Frutta con guscio", "Tree nuts", "Shalenfruchte", "Frutos de Cascara"});
        _totemallergenstypeVarArr[8] = _vvvvvvvvvvv5(8, "simulator_allergens_08_celery.png", new java.lang.String[]{"Sedano", "Celery", "Fruits a coques", "Sellerie", "Apio"});
        _totemallergenstypeVarArr[9] = _vvvvvvvvvvv5(9, "simulator_allergens_09_mustard.png", new java.lang.String[]{"Senape", "Mustard", "Celeri", "Senf", "Mostaza"});
        _totemallergenstypeVarArr[10] = _vvvvvvvvvvv5(10, "simulator_allergens_10_sesame_seed.png", new java.lang.String[]{"Semi di Sesamo", "Sesame Seed", "Sesame", "Sesansamen", "Semillas de Sesamo"});
        _totemallergenstypeVarArr[11] = _vvvvvvvvvvv5(11, "simulator_allergens_11_sulphites.png", new java.lang.String[]{"Anidride solforosa e Solfiti", "Sulphites", "Sulfites", "Sulphite", "Dioxido de Axufre y Sulfitos "});
        _totemallergenstypeVarArr[12] = _vvvvvvvvvvv5(12, "simulator_allergens_12_lupin.png", new java.lang.String[]{"Lupini", "Lupin", "Lupin", "Lupinen", "Altramuces"});
        _totemallergenstypeVarArr[13] = _vvvvvvvvvvv5(13, "simulator_allergens_13_molluscs.png", new java.lang.String[]{"Molluschi", "Molluscs", "Mollosques", "Weichtiere", "Moluscos"});
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vv6 = _totemallergenstypeVarArr;
        return "";
    }

    public java.lang.String _vvvvvvvvvvvv7() throws java.lang.Exception {
        ital.TotemLib.totemdata._totemcategorytype[] _totemcategorytypeVarArr = new ital.TotemLib.totemdata._totemcategorytype[5];
        int length = _totemcategorytypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemcategorytypeVarArr[i] = new ital.TotemLib.totemdata._totemcategorytype();
        }
        _totemcategorytypeVarArr[0].Code = "0";
        _totemcategorytypeVarArr[0].NameCategory = new java.lang.String[]{"Menù", "Menu", "Menu", "Speisekarte", "Menú"};
        _totemcategorytypeVarArr[0].ImageFileName = "simulator_category_menu.png";
        _totemcategorytypeVarArr[1].Code = "1";
        _totemcategorytypeVarArr[1].NameCategory = new java.lang.String[]{"Hamburger", "Hamburger", "Hamburger", "Hamburger", "Hamburguesa"};
        _totemcategorytypeVarArr[1].ImageFileName = "simulator_category_hamburger.png";
        ital.TotemLib.totemdata._totemcategorytype _totemcategorytypeVar = _totemcategorytypeVarArr[1];
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        _totemcategorytypeVar.Products = _vvvvvvvvvvvv1("hamburger", 7, false, true);
        _totemcategorytypeVarArr[2].Code = "2";
        _totemcategorytypeVarArr[2].NameCategory = new java.lang.String[]{"Patatine fritte", "Chips", "French fries", "Chips", "Papas fritas"};
        _totemcategorytypeVarArr[2].ImageFileName = "simulator_category_chips.png";
        ital.TotemLib.totemdata._totemcategorytype _totemcategorytypeVar2 = _totemcategorytypeVarArr[2];
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        _totemcategorytypeVar2.Products = _vvvvvvvvvvvv1("chips", 2, false, false);
        _totemcategorytypeVarArr[3].Code = "3";
        _totemcategorytypeVarArr[3].NameCategory = new java.lang.String[]{"Bevande analcoliche", "Soft Drinks", "Boissons non alcoolisées", "Alkoholfreie Getränke", "Bebidas sin alcohol"};
        _totemcategorytypeVarArr[3].ImageFileName = "simulator_category_soft_drinks.png";
        ital.TotemLib.totemdata._totemcategorytype _totemcategorytypeVar3 = _totemcategorytypeVarArr[3];
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        _totemcategorytypeVar3.Products = _vvvvvvvvvvvv1("soft_drinks", 3, false, false);
        _totemcategorytypeVarArr[4].Code = "4";
        _totemcategorytypeVarArr[4].NameCategory = new java.lang.String[]{"Caffè", "Coffee", "Café", "Kaffee", "Café"};
        _totemcategorytypeVarArr[4].ImageFileName = "simulator_category_coffee.png";
        ital.TotemLib.totemdata._totemcategorytype _totemcategorytypeVar4 = _totemcategorytypeVarArr[4];
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        _totemcategorytypeVar4.Products = _vvvvvvvvvvvv1("coffee", 3, false, false);
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vv4 = _totemcategorytypeVarArr;
        _vvvvvvvvvvv7();
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        innerInitialize(ba);
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vvv3.Initialize();
        ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
        ital.TotemLib.totemdata._vvv3.RowsList.Initialize();
        _vvvvvvvvvvvv6();
        _vvvvvvvvvvvvv1();
        _vvvvvvvvvvvv7();
        _vvvvvvvvvvvv0();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvv0() throws java.lang.Exception {
        ital.TotemLib.totemdata._totemmenulistproducttype[] _totemmenulistproducttypeVarArr = new ital.TotemLib.totemdata._totemmenulistproducttype[7];
        int length = _totemmenulistproducttypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemmenulistproducttypeVarArr[i] = new ital.TotemLib.totemdata._totemmenulistproducttype();
        }
        for (int i2 = 1; i2 <= 7; i2++) {
            ital.TotemLib.totemdata._totemproductmenutype _totemproductmenutypeVar = new ital.TotemLib.totemdata._totemproductmenutype();
            _totemproductmenutypeVar.Code = _vvvvvvvvvvv0();
            _totemproductmenutypeVar.Name = "Menu " + anywheresoftware.b4a.BA.NumberToString(i2);
            java.lang.String[] strArr = {r9.append(ital.TotemLib.language._vvvv5(getActivityBA(), 1)).toString(), r9.append(ital.TotemLib.language._vvvv5(getActivityBA(), 2)).toString(), r9.append(ital.TotemLib.language._vvvv5(getActivityBA(), 3)).toString(), r9.append(ital.TotemLib.language._vvvv5(getActivityBA(), 4)).toString(), r9.append(ital.TotemLib.language._vvvv5(getActivityBA(), 5)).toString()};
            java.util.Arrays.fill(strArr, "");
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Descr Menu ").append(anywheresoftware.b4a.BA.NumberToString(i2)).append(" ");
            ital.TotemLib.language languageVar = this._vvvvvv1;
            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Descr Menu ").append(anywheresoftware.b4a.BA.NumberToString(i2)).append(" ");
            ital.TotemLib.language languageVar2 = this._vvvvvv1;
            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("Descr Menu ").append(anywheresoftware.b4a.BA.NumberToString(i2)).append(" ");
            ital.TotemLib.language languageVar3 = this._vvvvvv1;
            java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Descr Menu ").append(anywheresoftware.b4a.BA.NumberToString(i2)).append(" ");
            ital.TotemLib.language languageVar4 = this._vvvvvv1;
            java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("Descr Menu ").append(anywheresoftware.b4a.BA.NumberToString(i2)).append(" ");
            ital.TotemLib.language languageVar5 = this._vvvvvv1;
            _totemproductmenutypeVar.Description = strArr;
            _totemproductmenutypeVar.Price = _vvvvvvvvvvvv3(20, 210);
            java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("simulator_menu");
            anywheresoftware.b4a.keywords.Common common = this.__c;
            _totemproductmenutypeVar.ImageFileName = append6.append(anywheresoftware.b4a.keywords.Common.NumberFormat(i2, 2, 0)).append(".png").toString();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Rnd(0, 2) == 0) {
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                _totemproductmenutypeVar.IsDiscounted = false;
            } else {
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                _totemproductmenutypeVar.IsDiscounted = true;
            }
            _totemmenulistproducttypeVarArr[i2 - 1].ProductMenu = _totemproductmenutypeVar;
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            int i3 = anywheresoftware.b4a.keywords.Common.Rnd(0, 2) == 1 ? 4 : 3;
            ital.TotemLib.totemdata._totemproducttype[] _totemproducttypeVarArr = new ital.TotemLib.totemdata._totemproducttype[i3];
            int length2 = _totemproducttypeVarArr.length;
            for (int i4 = 0; i4 < length2; i4++) {
                _totemproducttypeVarArr[i4] = new ital.TotemLib.totemdata._totemproducttype();
            }
            for (int i5 = 1; i5 <= i3; i5++) {
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
                int Rnd = anywheresoftware.b4a.keywords.Common.Rnd(0, ital.TotemLib.totemdata._vv4[i5].Products.length);
                ital.TotemLib.totemdata totemdataVar2 = this._vvvvv0;
                _totemproducttypeVarArr[i5 - 1] = ital.TotemLib.totemdata._vv4[i5].Products[Rnd];
            }
            _totemmenulistproducttypeVarArr[i2 - 1].Products = _totemproducttypeVarArr;
        }
        ital.TotemLib.totemdata totemdataVar3 = this._vvvvv0;
        ital.TotemLib.totemdata._vv5 = _totemmenulistproducttypeVarArr;
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvv1() throws java.lang.Exception {
        ital.TotemLib.totemdata._totemtagstype[] _totemtagstypeVarArr = new ital.TotemLib.totemdata._totemtagstype[5];
        int length = _totemtagstypeVarArr.length;
        for (int i = 0; i < length; i++) {
            _totemtagstypeVarArr[i] = new ital.TotemLib.totemdata._totemtagstype();
        }
        _totemtagstypeVarArr[0] = _vvvvvvvvvvv6(50, "simulator_tags_50.png", new java.lang.String[]{"Vegano", "Vegan", "Vegan", "Vegan", "Vegan"});
        _totemtagstypeVarArr[1] = _vvvvvvvvvvv6(51, "simulator_tags_51.png", new java.lang.String[]{"Vegetariano", "Vegetarian", "Vegeterien", "Vegtarier", "Vegetariano"});
        _totemtagstypeVarArr[2] = _vvvvvvvvvvv6(52, "simulator_tags_52.png", new java.lang.String[]{"Integrale", "Whole food", "Complete", "Vollkorn", "Integral"});
        _totemtagstypeVarArr[3] = _vvvvvvvvvvv6(53, "simulator_tags_53.png", new java.lang.String[]{"Decongelato", "Defrosted", "Decongele", "Aufgetaut", "Descongelado"});
        _totemtagstypeVarArr[4] = _vvvvvvvvvvv6(54, "simulator_tags_54.png", new java.lang.String[]{"Prodotto locale", "Local product", "Produit local", "Lokales produkt", "Producto local"});
        ital.TotemLib.totemdata totemdataVar = this._vvvvv0;
        ital.TotemLib.totemdata._vv7 = _totemtagstypeVarArr;
        return "";
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
