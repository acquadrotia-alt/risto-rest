package cassandraRisto.ital;

/* loaded from: classes.dex */
public class funzioni extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public cassandraRisto.ital.fileprovider _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public b4a.example.dateutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.utility _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public ital.TotemLib.totemdata _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public ital.TotemLib.language _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.acttotemmain _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.main _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.tabelle _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.configura _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.httpclient _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.operatori _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.frmfraziona _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.mod1 _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.starter _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.cassetto _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.clienti _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.colorsroutine _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.confpalmari _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.confstampe _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.dbutil _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.fatturafm _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.filtro _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.ftpmanager _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.iniziative _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.magazzino _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.menu _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.modfunstr _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.offerte _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.ordini _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.prenotazioni _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.rpidevice _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.stampe _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.stampecustom _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.tabelleappoggio _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.usbpl2303 _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.usbpl2303service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.verificazione _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.httputils2service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.xuiviewsutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "cassandraRisto.ital.funzioni");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", cassandraRisto.ital.funzioni.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper, java.lang.String str, double d) throws java.lang.Exception {
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
        int rowCount = cursorWrapper.getRowCount() - 1;
        double d2 = d;
        for (int i = 0; i <= rowCount; i++) {
            cursorWrapper.setPosition(i);
            map.Initialize();
            map.Put("codice", cursorWrapper.GetString("codice"));
            map.Put("descrizione", cursorWrapper.GetString("descrizione"));
            map.Put("brep", java.lang.Integer.valueOf(cursorWrapper.GetInt("brep")));
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_turni) {
                map.Put("turno", java.lang.Integer.valueOf(cursorWrapper.GetInt("turno")));
                map.Put("lockturno", java.lang.Integer.valueOf(cursorWrapper.GetInt("lockturno")));
            }
            map.Put("idRiga", cursorWrapper.GetString("idRiga"));
            map.Put("qta", cursorWrapper.GetDouble("qta"));
            map.Put("prezzov", cursorWrapper.GetDouble("prezzov"));
            map.Put("reparto", java.lang.Integer.valueOf(cursorWrapper.GetInt("reparto")));
            map.Put("QtaConDecimali", cursorWrapper.GetDouble("QtaConDecimali"));
            map.Put("totcre", cursorWrapper.GetString("totcre"));
            map.Put("iva", java.lang.Integer.valueOf(cursorWrapper.GetInt("iva")));
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("datam", anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA())));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append(" ");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("datam2", append.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).toString());
            cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append2 = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append(" ");
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("datam3", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(activityBA, append2.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).toString()));
            map.Put("cliente", cursorWrapper.GetString("cliente"));
            map.Put("codint", cursorWrapper.GetString("codint"));
            map.Put("memo", cursorWrapper.GetString("memo"));
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
            map.Put("flgNF", java.lang.Integer.valueOf(cursorWrapper.GetInt("flgNF")));
            map.Put("Qtad", java.lang.Integer.valueOf(cursorWrapper.GetInt("Qtad")));
            map.Put("TipoSconto", java.lang.Integer.valueOf(cursorWrapper.GetInt("TipoSconto")));
            map.Put("importod", cursorWrapper.GetDouble("importod"));
            map.Put("scovd", cursorWrapper.GetDouble("scovd"));
            map.Put("importo2", cursorWrapper.GetDouble("importo2"));
            map.Put("ingredientisumf", java.lang.Integer.valueOf(cursorWrapper.GetInt("ingredientisumf")));
            map.Put("ingredientisunf", java.lang.Integer.valueOf(cursorWrapper.GetInt("ingredientisunf")));
            map.Put("stampaesclusiva", java.lang.Integer.valueOf(cursorWrapper.GetInt("stampaesclusiva")));
            map.Put("gruppomenu", cursorWrapper.GetString("gruppomenu"));
            map.Put("stampante2", java.lang.Integer.valueOf(cursorWrapper.GetInt("stampante2")));
            map.Put("uscita", java.lang.Integer.valueOf(cursorWrapper.GetInt("uscita")));
            if (str.equals("Venduto")) {
                cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(cursorWrapper.GetInt("iva"));
                cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                map.Put("aliquota2", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2"));
                cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                map.Put("aliquota", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2"));
                map.Put("scop", cursorWrapper.GetDouble("scop"));
                map.Put("scov", cursorWrapper.GetDouble("scov"));
                map.Put("flgmag", java.lang.Integer.valueOf(cursorWrapper.GetInt("flgmag")));
                map.Put("importo", cursorWrapper.GetDouble("importo"));
                map.Put("nmov", -100);
            } else {
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                double Round2 = anywheresoftware.b4a.keywords.Common.Round2(cursorWrapper.GetDouble("importo").doubleValue(), 2);
                cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                boolean equals = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from anagra where flgusointerno=1 and codint = '" + cursorWrapper.GetString("codint") + "'").equals(anywheresoftware.b4a.BA.NumberToString(1));
                cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                boolean equals2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from anagra where flgmag=1 and codint = '" + cursorWrapper.GetString("codint") + "'").equals(anywheresoftware.b4a.BA.NumberToString(1));
                if (d2 > 0.0d && cursorWrapper.GetInt("flgNF") == 0) {
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Not(equals) && cursorWrapper.GetDouble("qta").doubleValue() > 0.0d && Round2 <= d2) {
                        map.Put("scop", 100);
                        map.Put("scov", java.lang.Double.valueOf(cursorWrapper.GetDouble("prezzov").doubleValue() * cursorWrapper.GetDouble("qta").doubleValue()));
                        map.Put("importo", 0);
                        d2 -= Round2;
                        map.Put("flgusointerno", java.lang.Boolean.valueOf(equals));
                        map.Put("flgmag", java.lang.Boolean.valueOf(equals2));
                    }
                }
                if (d2 > 0.0d && cursorWrapper.GetInt("flgNF") == 0) {
                    anywheresoftware.b4a.keywords.Common common8 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Not(equals) && cursorWrapper.GetDouble("qta").doubleValue() > 0.0d && Round2 > d2 && d2 > 0.0d) {
                        anywheresoftware.b4a.keywords.Common common9 = this.__c;
                        double Round22 = anywheresoftware.b4a.keywords.Common.Round2(d2, 2);
                        anywheresoftware.b4a.keywords.Common common10 = this.__c;
                        double Round23 = anywheresoftware.b4a.keywords.Common.Round2(cursorWrapper.GetDouble("importo").doubleValue(), 2);
                        anywheresoftware.b4a.keywords.Common common11 = this.__c;
                        map.Put("scop", java.lang.Double.valueOf(anywheresoftware.b4a.keywords.Common.Round2((100.0d * Round22) / Round23, 2)));
                        map.Put("scov", java.lang.Double.valueOf(cursorWrapper.GetDouble("scov").doubleValue() + Round22));
                        map.Put("importo", java.lang.Double.valueOf(Round23 - Round22));
                        d2 = 0.0d;
                        map.Put("flgusointerno", java.lang.Boolean.valueOf(equals));
                        map.Put("flgmag", java.lang.Boolean.valueOf(equals2));
                    }
                }
                map.Put("scop", cursorWrapper.GetDouble("scop"));
                map.Put("scov", cursorWrapper.GetDouble("scov"));
                map.Put("importo", cursorWrapper.GetDouble("importo"));
                map.Put("flgusointerno", java.lang.Boolean.valueOf(equals));
                map.Put("flgmag", java.lang.Boolean.valueOf(equals2));
            }
            list.Add(map.getObject());
        }
        cassandraRisto.ital.dbutil dbutilVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        anywheresoftware.b4a.BA activityBA2 = getActivityBA();
        cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(activityBA2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, str, list);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper) throws java.lang.Exception {
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
        list.Initialize();
        map.Initialize();
        list.Clear();
        map.Clear();
        map.Put("codice", cursorWrapper.GetString("codice"));
        map.Put("descrizione", cursorWrapper.GetString("descrizione"));
        anywheresoftware.b4a.keywords.Common common = this.__c;
        map.Put("brep", true);
        map.Put("qta", cursorWrapper.GetDouble("qta"));
        map.Put("prezzov", cursorWrapper.GetDouble("prezzov"));
        map.Put("reparto", java.lang.Integer.valueOf(cursorWrapper.GetInt("reparto")));
        map.Put("iva", java.lang.Integer.valueOf(cursorWrapper.GetInt("iva")));
        map.Put("datam", cursorWrapper.GetString("datam"));
        map.Put("datam2", cursorWrapper.GetString("datam2"));
        map.Put("datam3", cursorWrapper.GetString("datam3"));
        map.Put("flgNF", java.lang.Integer.valueOf(cursorWrapper.GetInt("flgNF")));
        map.Put("codint", cursorWrapper.GetString("codint"));
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
        map.Put("scop", cursorWrapper.GetDouble("scop"));
        map.Put("scov", cursorWrapper.GetDouble("scov"));
        map.Put("importo", cursorWrapper.GetDouble("importo"));
        map.Put("turno", java.lang.Integer.valueOf(cursorWrapper.GetInt("turno")));
        map.Put("idRiga", cursorWrapper.GetString("idRiga"));
        map.Put("cameriere", java.lang.Integer.valueOf(cursorWrapper.GetInt("cameriere")));
        map.Put("sottoconto", java.lang.Integer.valueOf(cursorWrapper.GetInt("sottoconto")));
        map.Put("memo", cursorWrapper.GetString("memo"));
        list.Add(map.getObject());
        cassandraRisto.ital.dbutil dbutilVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        anywheresoftware.b4a.BA activityBA = getActivityBA();
        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(activityBA, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Ventmp", list);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(boolean z) throws java.lang.Exception {
        int i = 10;
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub AddSqlScript";
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.BeginTransaction();
        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.BeginTransaction();
        anywheresoftware.b4a.keywords.Common common = this.__c;
        if (anywheresoftware.b4a.keywords.Common.Not(z)) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow(getActivityBA(), anywheresoftware.b4a.BA.ObjectToCharSequence("Aggiornamento archivi in corso ..."));
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='versione'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE versione (versione Int  Null)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into versione(versione) values(0)");
        }
        cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.Common.DoEvents();
        cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 0) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampa ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm1 ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm2 ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm3 ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm4 ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm5 ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm6 ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD operatore int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD lockturno bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD lockturno bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD counter int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD cp1 bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD cp2 bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD turno int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD lockturno bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD lockturno bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagine ADD dll nvarchar (100) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD mf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Parameters ADD dll nvarchar (100) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE StampaCP (chiave INTEGER PRIMARY KEY ,nmov numeric(18,0) null,cp int not NULL default 0,tavolo int not null default 0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD guadagnop numeric(18, 2) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD guadagnov numeric(18, 2) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE reparti ADD guadagnop numeric(18, 2) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE reparti ADD guadagnov numeric(18, 2) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD prezzoa numeric(18, 2) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD prezzoa numeric(18, 2) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD prezzoa numeric(18, 2) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE ingredienti(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ");
            cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from ingredienti ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i2 = 0; i2 <= 99; i2++) {
                    cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into ingredienti(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i2) + ",'Ingrediente " + anywheresoftware.b4a.BA.NumberToString(i2) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE ingredientiplu(chiave INTEGER PRIMARY KEY,codice Int not null default -1 ,codint nvarchar (20) not NULL default '') ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into progressivi(codice,valore) values('AS',0)");
            cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from stampe where codice = 6").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione) values(6,'GUADAGNO REPARTI')");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD ingredientisumf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD ingredientisumf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD ingredientisumf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD ingredientisumf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampa ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm1 ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm2 ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm3 ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm4 ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm5 ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm6 ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD ingredientisunf bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD datam2 DateTime not null default '01/01/1900'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD datam2 DateTime not null default '01/01/1900'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD datam2 DateTime not null default '01/01/1900'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE venduto ADD datam2 DateTime not null default '01/01/1900'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD datam2 DateTime not null default '01/01/1900'");
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            map.Initialize();
            list.Initialize();
            map.Put("codint", "srv");
            map.Put("descrizione", "SERVIZIO");
            map.Put("reparto", 98);
            map.Put("iva", 1);
            map.Put("plupeso", 0);
            map.Put("list1", 0);
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            map.Put("flgusointerno", true);
            list.Add(map.getObject());
            cassandraRisto.ital.dbutil dbutilVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list);
            cassandraRisto.ital.main mainVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 1");
            cassandraRisto.ital.main mainVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 1) {
            cassandraRisto.ital.main mainVar15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select descrizione from pagamenti where codice = 30").equals("Buoni Emessi")) {
                cassandraRisto.ital.main mainVar16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update pagamenti set descrizione = 'Buoni Emessi' where codice = 30");
            }
            anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map2 = new anywheresoftware.b4a.objects.collections.Map();
            map2.Initialize();
            list2.Initialize();
            map2.Put("codint", "rgr");
            map2.Put("descrizione", "Ritiro Vincita");
            map2.Put("reparto", 98);
            map2.Put("iva", 1);
            map2.Put("plupeso", 0);
            map2.Put("list1", 0);
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            map2.Put("flgusointerno", true);
            list2.Add(map2.getObject());
            cassandraRisto.ital.dbutil dbutilVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
            cassandraRisto.ital.main mainVar17 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list2);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD RiepTurni bit not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD RiepTurniD bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD ApriCassetto bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD TagliaTurno bit not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE HeaddaStampare ADD memo nvarchar (50)  Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into progressivi(codice,valore) values('RIC',1)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD nric int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD nric int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD nric int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE venduto ADD nric int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD RicDaFatt bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD RicDaFatt bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE intestaNF (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',tipo int not NULL default 0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into intestaNF(codice,descrizione,tipo) values(0,'Italretail s.r.l.',2)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into intestaNF(codice,descrizione,tipo) values(1,'Via del Paracadutista 11-11A/B',1)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into intestaNF(codice,descrizione,tipo) values(2,'Reggio Emilia',1)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into intestaNF(codice,descrizione,tipo) values(3,'Tel.0522/232060-Fax.0522/232501',1)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into intestaNF(codice,descrizione,tipo) values(4,'info@italretail.it',6)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into intestaNF(codice,descrizione,tipo) values(5,'www.italretail.it',6)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD mail nvarchar (50) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD copie int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE distintabase(chiave INTEGER PRIMARY KEY,codint nvarchar (20) not NULL default '' ,codintpadre nvarchar (20) not NULL default '',qta numeric(18, 3) not NULL default 0) ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE distintabaseTmp(chiave INTEGER PRIMARY KEY,codint nvarchar (20) not NULL default '' ,codintpadre nvarchar (20) not NULL default '',qta numeric(18, 3) not NULL default 0) ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD distinta bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD distinta bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE venduto ADD distinta bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD distinta bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD NoStampaAsporto bit not null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD uscita bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD uscita bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD uscita bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE venduto ADD uscita bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tavoli ADD uscita bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD indice int not NULL default 0");
            cassandraRisto.ital.main mainVar18 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 2");
            cassandraRisto.ital.main mainVar19 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar20 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar21 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 2) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE  INDEX IX_TELEFONO ON clienti(telefono)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE  INDEX IX_FAX ON clienti(fax)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE  INDEX IX_vendutoIdRiga ON Venduto(idRiga)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE  INDEX IX_vendutoTotcre ON Venduto(totcre)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE telefonate(chiave INTEGER PRIMARY KEY,data DateTime null ,telefono nvarchar (50) not NULL default '',cliente nvarchar (20) not NULL default '') ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE telefonate ADD accettata bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE telefonate ADD descliente nvarchar (50) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE gruppovar(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ");
            cassandraRisto.ital.main mainVar22 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from gruppovar ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i3 = 0; i3 <= 13; i3++) {
                    cassandraRisto.ital.main mainVar23 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into gruppovar(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i3) + ",'Gruppo " + anywheresoftware.b4a.BA.NumberToString(i3) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD gruppov int not NULL default 0");
            cassandraRisto.ital.main mainVar24 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='msg'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                anywheresoftware.b4a.objects.collections.List list3 = new anywheresoftware.b4a.objects.collections.List();
                anywheresoftware.b4a.objects.collections.Map map3 = new anywheresoftware.b4a.objects.collections.Map();
                list3.Initialize();
                for (int i4 = 0; i4 <= 9; i4++) {
                    map3.Initialize();
                    map3.Put("codint", "msg" + anywheresoftware.b4a.BA.NumberToString(i4));
                    map3.Put("descrizione", "Messaggio " + anywheresoftware.b4a.BA.NumberToString(i4));
                    map3.Put("reparto", 97);
                    map3.Put("iva", 1);
                    map3.Put("plupeso", 0);
                    map3.Put("list1", 0);
                    anywheresoftware.b4a.keywords.Common common10 = this.__c;
                    map3.Put("flgusointerno", true);
                    map3.Put("codint", "msg" + anywheresoftware.b4a.BA.NumberToString(i4));
                    list3.Add(map3.getObject());
                }
                cassandraRisto.ital.dbutil dbutilVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA activityBA3 = getActivityBA();
                cassandraRisto.ital.main mainVar25 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list3);
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD variazioni bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD variazioni bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD datam3 DateTime not null default '1900-01-01'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD datam3 DateTime not null default '1900-01-01'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD datam3 DateTime not null default '1900-01-01'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE venduto ADD datam3 DateTime not null default '1900-01-01'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD datam3 DateTime not null default '1900-01-01'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE CausaliPagamenti ADD datam3 DateTime not null default '1900-01-01'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE CausaliPagamenti ADD datam3 DateTime not null default '1900-01-01'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update headmov set datam3 =substr(datam2,7,4) || '-' || substr(datam2,1,2) || '-'|| substr(datam2,4,2)|| ' '|| substr(datam2,11,9)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update venduto set datam3 =substr(datam2,7,4) || '-' || substr(datam2,1,2) || '-'|| substr(datam2,4,2)|| ' '|| substr(datam2,11,9)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update CausaliPagamenti set datam3 =substr(datam,7,4) || '-' || substr(datam,1,2) || '-'|| substr(datam,4,2)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("update headmov set datam3 =substr(datam2,7,4) || '-' || substr(datam2,1,2) || '-'|| substr(datam2,4,2)|| ' '|| substr(datam2,11,9)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("update venduto set datam3 =substr(datam2,7,4) || '-' || substr(datam2,1,2) || '-'|| substr(datam2,4,2)|| ' '|| substr(datam2,11,9)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("update CausaliPagamenti set datam3 =substr(datam,7,4) || '-' || substr(datam,1,2) || '-'|| substr(datam,4,2)");
            cassandraRisto.ital.main mainVar26 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 3");
            cassandraRisto.ital.main mainVar27 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar28 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar29 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 3) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD noazzera bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Stampe ADD flgmailc bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Stampe set flgmailc=flgchiusura");
            cassandraRisto.ital.main mainVar30 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 4");
            cassandraRisto.ital.main mainVar31 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar32 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar33 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 4) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Operatori set funzioni = substr(funzioni,1,37) || '0' || substr(funzioni,39,10) where substr(funzioni,38,1)='1' and length(funzioni) >47");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update operatori set funzioni = funzioni || '0' where length(funzioni)=37");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE oraasporto(codice nvarchar (5)  PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ");
            cassandraRisto.ital.main mainVar34 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from oraasporto ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i5 = 0; i5 <= 23; i5++) {
                    for (int i6 = 0; i6 <= 3; i6++) {
                        int i7 = i6 * 15;
                        cassandraRisto.ital.main mainVar35 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        java.lang.StringBuilder append = new java.lang.StringBuilder().append("insert into oraasporto(codice,descrizione) values('").append(anywheresoftware.b4a.BA.NumberToString(i5)).append(":").append(anywheresoftware.b4a.BA.NumberToString(i7)).append("','");
                        anywheresoftware.b4a.keywords.Common common13 = this.__c;
                        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat(i5, 2, 0)).append(":");
                        anywheresoftware.b4a.keywords.Common common14 = this.__c;
                        sql.ExecNonQuery(append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat(i7, 2, 0)).append("')").toString());
                    }
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD espandi bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampa ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm1 ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm2 ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm3 ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm4 ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm5 ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm6 ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD stampaesclusiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampa ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm1 ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm2 ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm3 ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm4 ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm5 ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm6 ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD stampante2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD listino int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tavoli ADD addturni bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD stampasubito bit not NULL default 0");
            cassandraRisto.ital.main mainVar36 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from Palmari where Serial = 10007").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i8 = 7; i8 <= 9; i8++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("Insert into \tPalmari(Serial) values(1000" + anywheresoftware.b4a.BA.NumberToString(i8) + ")");
                }
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE tmpStampaPalm7 (codice nvarchar (20)  Null ,\tdescrizione nvarchar (50)  Null ,qta numeric(18, 3) Null ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '',turno int NOT NULL DEFAULT 1, \tingredientisunf Bit Not Null DEFAULT 0, \tstampaesclusiva Bit Not Null DEFAULT 0, \tstampante2 Int Not Null DEFAULT 0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE tmpStampaPalm8 (codice nvarchar (20)  Null ,\tdescrizione nvarchar (50)  Null ,qta numeric(18, 3) Null ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '',turno int NOT NULL DEFAULT 1, \tingredientisunf Bit Not Null DEFAULT 0, \tstampaesclusiva Bit Not Null DEFAULT 0, \tstampante2 Int Not Null DEFAULT 0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE tmpStampaPalm9 (codice nvarchar (20)  Null ,\tdescrizione nvarchar (50)  Null ,qta numeric(18, 3) Null ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '',turno int NOT NULL DEFAULT 1, \tingredientisunf Bit Not Null DEFAULT 0, \tstampaesclusiva Bit Not Null DEFAULT 0, \tstampante2 Int Not Null DEFAULT 0)");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD tavoli bit not NULL default 1");
            cassandraRisto.ital.main mainVar37 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from stampe where codice = 10").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione) values(7,'REPARTI')");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione) values(8,'IVA')");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione) values(9,'ARTICOLI')");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione) values(10,'GUADAGNO REPARTI')");
            }
            cassandraRisto.ital.main mainVar38 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from confstampe where codice = 10").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i9 = 10; i9 <= 18; i9++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into confstampe(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i9) + ",'Stampante " + anywheresoftware.b4a.BA.NumberToString(i9) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [headmnu] (\t[codmnu] Int Not Null PRIMARY KEY, \t[descrizione] nvarchar(50) Not Null DEFAULT '', \t[attiva] Bit Not Null DEFAULT 0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [dettmnu] ( [codmnu] Int, \t[codint] nvarchar(20), \t[descrizione] nvarchar(50) Not Null DEFAULT '', \t[prezzo] numeric(18, 2) Not Null DEFAULT 0, \t[indice] int Not Null DEFAULT 0,[desreparto] nvarchar(50) Not Null DEFAULT '', \t[chiave] integer Not Null PRIMARY KEY AUTOINCREMENT)");
            cassandraRisto.ital.main mainVar39 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from headmnu").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i10 = 0; i10 <= 9; i10++) {
                    cassandraRisto.ital.main mainVar40 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into headmnu(codmnu,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i10) + ",'Menu " + anywheresoftware.b4a.BA.NumberToString(i10) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD indice int not NULL default 0");
            cassandraRisto.ital.main mainVar41 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='mnu'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                anywheresoftware.b4a.objects.collections.List list4 = new anywheresoftware.b4a.objects.collections.List();
                anywheresoftware.b4a.objects.collections.Map map4 = new anywheresoftware.b4a.objects.collections.Map();
                list4.Initialize();
                for (int i11 = 0; i11 <= 9; i11++) {
                    map4.Initialize();
                    map4.Put("codint", "mnu" + anywheresoftware.b4a.BA.NumberToString(i11));
                    map4.Put("descrizione", "Menu " + anywheresoftware.b4a.BA.NumberToString(i11));
                    map4.Put("reparto", 96);
                    map4.Put("iva", 1);
                    map4.Put("plupeso", 0);
                    map4.Put("list1", 0);
                    anywheresoftware.b4a.keywords.Common common15 = this.__c;
                    map4.Put("flgusointerno", true);
                    list4.Add(map4.getObject());
                }
                cassandraRisto.ital.dbutil dbutilVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA activityBA4 = getActivityBA();
                cassandraRisto.ital.main mainVar42 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA4, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list4);
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update reparti set indice =codice");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD asporto int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE HeaddaStampare ADD oldasporto int not NULL default -1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD asporto int not NULL default 0");
            for (int i12 = 201; i12 <= 300; i12++) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into tavoli(tavolo) values(" + anywheresoftware.b4a.BA.NumberToString(i12) + ")");
            }
            cassandraRisto.ital.main mainVar43 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 5");
            cassandraRisto.ital.main mainVar44 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar45 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common16 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar46 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 5) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD indice int not NULL default 9");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampa ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm1 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm2 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm3 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm4 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm5 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm6 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm7 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm8 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm9 ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD gruppomenu nvarchar (10) Not Null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE dettmnu ADD auto bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD escpos bit not NULL default 0");
            cassandraRisto.ital.main mainVar47 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from stampe where codice = 11").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione) values(11,'FINANZIARIO')");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Stampe ADD tipob bit not NULL default 0");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Stampe set tipob=1 where codice =7");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Stampe set tipob=1 where codice =8");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Stampe set tipob=1 where codice =9");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Stampe set tipob=1 where codice =10");
            }
            cassandraRisto.ital.main mainVar48 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from stampe where codice = 12").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione) values(12,'FASCE ORARIE')");
            }
            cassandraRisto.ital.main mainVar49 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from stampe where codice = 13").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione) values(13,'MOVIMENTI')");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD attivo bit not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD nopalmari bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD Oldqta numeric(18, 3) Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD QtaConDecimali numeric(18, 3) Not Null default 0 ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tavoli ADD manuallock bit not NULL default 0");
            cassandraRisto.ital.main mainVar50 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 6");
            cassandraRisto.ital.main mainVar51 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar52 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common17 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar53 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 6) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [headord] ([codordine] int NOT NULL PRIMARY KEY,[descrizione] nvarchar(50) NOT NULL DEFAULT '',[elaborato] numeric(18, 0) not NULL default 0)");
            for (int i13 = 0; i13 <= 9; i13++) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into headord(codordine,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i13) + ",'Ordine " + anywheresoftware.b4a.BA.NumberToString(i13) + "')");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE dettord (codordine int NULL ,codint nvarchar (20) null ,descrizione nvarchar (50) not NULL default '',qta int Not Null default 0,chiave INTEGER PRIMARY KEY)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD peso numeric(18, 3) Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD qtacartone int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD qtaottimale int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD qtaminima numeric(18, 3) Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE ean ADD qta numeric(18, 3) Not Null default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE ean ADD importo numeric(18, 2) Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE TmpFraziona ( codice nvarchar (20)  NULL ,descrizione nvarchar (50)  NULL ,codint nvarchar (30)  NULL ,prezzov numeric(18, 4) NULL, Sel numeric(18, 4) NOT NULL DEFAULT 0,chiave INTEGER PRIMARY KEY)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD fraziona bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD fraziona Bit Not Null default 0");
            cassandraRisto.ital.main mainVar54 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from headmnu")) <= 10.0d) {
                for (int i14 = 10; i14 <= 29; i14++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into headmnu(codmnu,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i14) + ",'Menu " + anywheresoftware.b4a.BA.NumberToString(i14) + "')");
                }
            }
            cassandraRisto.ital.main mainVar55 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='mnu'")) <= 10.0d) {
                anywheresoftware.b4a.objects.collections.List list5 = new anywheresoftware.b4a.objects.collections.List();
                anywheresoftware.b4a.objects.collections.Map map5 = new anywheresoftware.b4a.objects.collections.Map();
                list5.Initialize();
                for (int i15 = 10; i15 <= 29; i15++) {
                    map5.Initialize();
                    map5.Put("codint", "mnu" + anywheresoftware.b4a.BA.NumberToString(i15));
                    map5.Put("descrizione", "Menu " + anywheresoftware.b4a.BA.NumberToString(i15));
                    map5.Put("reparto", 96);
                    map5.Put("iva", 1);
                    map5.Put("plupeso", 0);
                    map5.Put("list1", 0);
                    anywheresoftware.b4a.keywords.Common common18 = this.__c;
                    map5.Put("flgusointerno", true);
                    list5.Add(map5.getObject());
                }
                cassandraRisto.ital.dbutil dbutilVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA activityBA5 = getActivityBA();
                cassandraRisto.ital.main mainVar56 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list5);
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update reparti set indice =codice");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Operatori set funzioni = rtrim(ltrim(substr(funzioni,1,39))) || '01111' where substr(funzioni,40,4)=''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD consolida bit not NULL default 0");
            cassandraRisto.ital.main mainVar57 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 7");
            cassandraRisto.ital.main mainVar58 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar59 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common19 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar60 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 7) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD riepAT bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update pagamenti set descrizione = 'Prepagato',obbligo=0,buonosr=0 where codice = 29 and descrizione = 'DA INSERIRE'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD obbligoprz bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD obbligoprz Bit Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD obbligoqta bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD obbligoqta Bit Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tavoli ADD stampap bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD servizio int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update operatori set funzioni = funzioni || '11111' where length(funzioni)<=39");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE daStampare ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm1 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm2 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm3 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm4 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm5 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm6 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm7 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm8 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampaPalm9 ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tmpStampa ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD totaleNF numeric(18, 4) not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD totaleNF numeric(18, 4) not Null default 0");
            cassandraRisto.ital.main mainVar61 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from stampe where codice = 14").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into Stampe(codice,descrizione,tipob) values(14,'FINANZIARIO',1)");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE Prenota (chiave INTEGER PRIMARY KEY ,data datetime NULL,memo nvarchar (200) not NULL default '',tavolo int not null default 0,sedie int not null default 0,cliente nvarchar (20) not NULL default '')");
            cassandraRisto.ital.main mainVar62 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 8");
            cassandraRisto.ital.main mainVar63 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar64 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common20 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar65 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 8) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tavoli ADD sedie int not NULL default 0");
            cassandraRisto.ital.main mainVar66 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from operatori where codice =10").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i16 = 10; i16 <= 40; i16++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [operatori] ([codice],[pwd],[descrizione],[funzioni]) VALUES(" + anywheresoftware.b4a.BA.NumberToString(i16) + ",'11111','operatore " + anywheresoftware.b4a.BA.NumberToString(i16) + "','11111111111111111111111     1111111111')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE HeaddaStampare ADD sospeso bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD FattFM bit not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD datapubblicazione nvarchar (8) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD periodicita int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Cassetto ADD memo nvarchar (100) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD stampariep int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD copiascontrino int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Stampe ADD flgcopia bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE LastTmp (tipomovimento  nvarchar (5) ,\tcliente nvarchar (20) not NULL default '' ,recall bit not NULL default 0,chiave INTEGER PRIMARY KEY)");
            cassandraRisto.ital.main mainVar67 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from LastTmp").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [LastTmp] (tipomovimento,cliente,recall) VALUES('','',0)");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD flgmag Bit Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD flgmag Bit Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Operatori set funzioni = substr(funzioni,1,27) || '1' || substr(funzioni,29,20)");
            cassandraRisto.ital.main mainVar68 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 9");
            cassandraRisto.ital.main mainVar69 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar70 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common21 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar71 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 9) {
            cassandraRisto.ital.main mainVar72 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='eliminati'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE eliminati (chiave INTEGER PRIMARY KEY ,codint nvarchar (20) not NULL default '',\n\t\t\t\t\tnmov numeric(18,0) not null default 0,datam datetime NULL ,operatore int not null default 1,\n\t\t\t\t\tqta numeric(18, 3) not null default 0,importo numeric(18, 2) not NULL default 0,tavolo int not null default 1)");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Palmari ADD IP nvarchar (20) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Palmari set Attivo = 0 where IP = ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD locked Bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagine ADD locked Bit not NULL default 0");
            cassandraRisto.ital.main mainVar73 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='ArtBloccati'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE ArtBloccati (chiave INTEGER PRIMARY KEY ,codint nvarchar (20) not NULL default '',\n\t\t\t\t\tcassa nvarchar (5) not NULL default '',dacancellare Bit not null default 0)");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tavoli ADD coperti int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE filtristampeBT (codice int NULL ,reparto int not NULL default 0 ,chiave INTEGER PRIMARY KEY ,descrizione nvarchar (50) not NULL default '' )");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Palmari ADD AttivaBT bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD dll nvarchar (100) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD textsize int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD colore int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD colorec int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD colores int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD coloret int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD TuttiTurni bit not NULL default 0");
            cassandraRisto.ital.main mainVar74 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from headmnu")) <= 30.0d) {
                for (int i17 = 30; i17 <= 99; i17++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into headmnu(codmnu,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i17) + ",'Menu " + anywheresoftware.b4a.BA.NumberToString(i17) + "')");
                }
            }
            cassandraRisto.ital.main mainVar75 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='mnu'")) <= 30.0d) {
                anywheresoftware.b4a.objects.collections.List list6 = new anywheresoftware.b4a.objects.collections.List();
                anywheresoftware.b4a.objects.collections.Map map6 = new anywheresoftware.b4a.objects.collections.Map();
                list6.Initialize();
                for (int i18 = 30; i18 <= 99; i18++) {
                    map6.Initialize();
                    map6.Put("codint", "mnu" + anywheresoftware.b4a.BA.NumberToString(i18));
                    map6.Put("descrizione", "Menu " + anywheresoftware.b4a.BA.NumberToString(i18));
                    map6.Put("reparto", 96);
                    map6.Put("iva", 1);
                    map6.Put("plupeso", 0);
                    map6.Put("list1", 0);
                    anywheresoftware.b4a.keywords.Common common22 = this.__c;
                    map6.Put("flgusointerno", true);
                    list6.Add(map6.getObject());
                }
                cassandraRisto.ital.dbutil dbutilVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA activityBA6 = getActivityBA();
                cassandraRisto.ital.main mainVar76 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA6, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list6);
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD eiva int not NULL default 0");
            cassandraRisto.ital.main mainVar77 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 10");
            cassandraRisto.ital.main mainVar78 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar79 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common23 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar80 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 10) {
            cassandraRisto.ital.main mainVar81 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from gruppovar ")) < 15.0d) {
                for (int i19 = 14; i19 <= 99; i19++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into gruppovar(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i19) + ",'Gruppo " + anywheresoftware.b4a.BA.NumberToString(i19) + "')");
                }
            }
            cassandraRisto.ital.main mainVar82 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from ingredienti ")) < 101.0d) {
                for (int i20 = 100; i20 <= 199; i20++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into ingredienti(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i20) + ",'Ingrediente " + anywheresoftware.b4a.BA.NumberToString(i20) + "')");
                }
            }
            anywheresoftware.b4a.objects.collections.List list7 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map7 = new anywheresoftware.b4a.objects.collections.Map();
            map7.Initialize();
            list7.Initialize();
            map7.Put("codint", "con");
            map7.Put("descrizione", "Convenzione");
            map7.Put("reparto", 98);
            map7.Put("iva", 1);
            map7.Put("plupeso", 0);
            map7.Put("list1", 0);
            anywheresoftware.b4a.keywords.Common common24 = this.__c;
            map7.Put("flgusointerno", true);
            list7.Add(map7.getObject());
            cassandraRisto.ital.dbutil dbutilVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA7 = getActivityBA();
            cassandraRisto.ital.main mainVar83 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA7, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list7);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD noturno bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD notaglio bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD datavolo int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD atavolo int not NULL default 0");
            cassandraRisto.ital.main mainVar84 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='clients'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE clients (codice int NOT NULL PRIMARY KEY,descrizione nvarchar(50) NOT NULL DEFAULT '',IP nvarchar(20) NOT NULL DEFAULT '',stato int not NULL default 0)");
                for (int i21 = 1; i21 <= 9; i21++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into clients(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i21) + ",'Terminale " + anywheresoftware.b4a.BA.NumberToString(i21) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clients ADD compare numeric(18,0) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE progressivi (codice nvarchar (2) PRIMARY KEY ,valore int NULL )");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("insert into progressivi(codice,valore) values('SEND',0)");
            cassandraRisto.ital.main mainVar85 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='unlocktbl'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE unlocktbl(tavolo int null,chiave INTEGER PRIMARY KEY)");
            }
            cassandraRisto.ital.main mainVar86 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='headmovRecallAsporto'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE [headmovRecallAsporto] (\n\t\t\t\t\t[nmov] numeric(18, 0) NOT NULL PRIMARY KEY, \n\t\t\t\t\t[nfat] int NOT NULL DEFAULT 0, \n\t\t\t\t\t[tavolo] int NOT NULL DEFAULT 0, \n\t\t\t\t\t[operatore] int NOT NULL DEFAULT 1, \n\t\t\t\t\t[opdes] nvarchar(50) NOT NULL DEFAULT '', \n\t\t\t\t\t[clides] nvarchar(50) NOT NULL DEFAULT '', \n\t\t\t\t\t[cliente] nvarchar(20) NOT NULL DEFAULT '', \n\t\t\t\t\t[flgNF] bit NOT NULL DEFAULT 0, \n\t\t\t\t\t[totale] numeric(18, 4), \n\t\t\t\t\t[prep] numeric(18, 2) NOT NULL DEFAULT 0, \n\t\t\t\t\t[punti] int NOT NULL DEFAULT 0, \n\t\t\t\t\t[datam] datetime, \n\t\t\t\t\t[cassa] nvarchar(100), \n\t\t\t\t\t[nfat_fm] int NOT NULL DEFAULT 0, \n\t\t\t\t\t[datfat_fm] datetime, \n\t\t\t\t\t[nscontrinoffm] int NOT NULL DEFAULT 0, \n\t\t\t\t\t[dataeoraffm] datetime, \n\t\t\t\t\t[matricolacassap] nvarchar(20), \n\t\t\t\t\t[memo] nvarchar(50) NOT NULL DEFAULT '', \n\t\t\t\t\t[sospeso] bit NOT NULL DEFAULT 0, \n\t\t\t\t\t[datam2] datetime NOT NULL DEFAULT '01/01/1900', \n\t\t\t\t\t[nric] int NOT NULL DEFAULT 0, \n\t\t\t\t\t[RicDaFatt] bit NOT NULL DEFAULT 0, \n\t\t\t\t\t[NoStampaAsporto] bit NOT NULL DEFAULT 0, \n\t\t\t\t\t[datam3] datetime NOT NULL DEFAULT '1900-01-01', \n\t\t\t\t\t[asporto] int NOT NULL DEFAULT 0, \n\t\t\t\t\t[totaleNF] numeric(18, 4) NOT NULL DEFAULT 0,\n\t\t\t\t\t[DaCancellare] bit NOT NULL DEFAULT 0 \n\t\t\t\t\t)\n\t\t\t\t");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("insert into progressivi(codice,valore) values('AS',0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("insert into progressivi(codice,valore) values('F',1)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("insert into progressivi(codice,valore) values('RIC',1)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD Locked bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmovRecallAsporto ADD Locked bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("insert into progressivi(codice,valore) values('V',1)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE TmpFinanziario(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',qta numeric(18, 3) not null default 0,importo numeric(18, 2) not NULL default 0) ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX IX_NmovHeadmov ON headmov (nmov)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX IX_NmovVenduto ON venduto (nmov)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX IX_NmovCP ON CausaliPagamenti (nmov)");
            cassandraRisto.ital.main mainVar87 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 11");
            cassandraRisto.ital.main mainVar88 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar89 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common25 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar90 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 11) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD resto Bit Not Null default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE INDEX IX_daStampare ON daStampare (Id,idRiga)");
            cassandraRisto.ital.main mainVar91 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 12");
            cassandraRisto.ital.main mainVar92 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar93 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common26 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar94 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 12) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD DaInviare bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD TurnoP int not NULL default 0");
            cassandraRisto.ital.main mainVar95 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='zon'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                anywheresoftware.b4a.objects.collections.List list8 = new anywheresoftware.b4a.objects.collections.List();
                anywheresoftware.b4a.objects.collections.Map map8 = new anywheresoftware.b4a.objects.collections.Map();
                list8.Initialize();
                for (int i22 = 1; i22 <= 9; i22++) {
                    map8.Initialize();
                    map8.Put("codint", "zon" + anywheresoftware.b4a.BA.NumberToString(i22));
                    map8.Put("descrizione", "Supplemento Zona " + anywheresoftware.b4a.BA.NumberToString(i22));
                    map8.Put("reparto", 95);
                    map8.Put("iva", 1);
                    map8.Put("plupeso", 0);
                    map8.Put("list1", 0);
                    anywheresoftware.b4a.keywords.Common common27 = this.__c;
                    map8.Put("flgusointerno", true);
                    list8.Add(map8.getObject());
                }
                cassandraRisto.ital.dbutil dbutilVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA activityBA8 = getActivityBA();
                cassandraRisto.ital.main mainVar96 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA8, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list8);
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD zona int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD CodMaster nvarchar (20) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE CausaliPagamenti ADD NonRiscosso bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD CausaleEft int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD IpEft nvarchar (20) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE operatori ADD CodAutomatico nvarchar (20) not NULL default ''");
            for (int i23 = 301; i23 <= 500; i23++) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into tavoli(tavolo) values(" + anywheresoftware.b4a.BA.NumberToString(i23) + ")");
            }
            cassandraRisto.ital.main mainVar97 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 14");
            cassandraRisto.ital.main mainVar98 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar99 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common28 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar100 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 14) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE operatori ADD Attivo bit not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD PortaEft int not NULL default 1000");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD GroupR bit not NULL default 0");
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD asportoS bit not NULL default 0")) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update confstampe set asportoS=asporto");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE Toolbar(chiave INTEGER PRIMARY KEY,codice Int not null default 0 ,descrizione nvarchar (50) not NULL default '',tipo int not null default 0,valore int not null default 0) ");
            cassandraRisto.ital.main mainVar101 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from Toolbar ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i24 = 0; i24 <= 20; i24++) {
                    cassandraRisto.ital.main mainVar102 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into Toolbar(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i24) + ",'Tasto " + anywheresoftware.b4a.BA.NumberToString(i24) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Operatori set funzioni = substr(funzioni,1,28) || '1' || substr(funzioni,30,20)");
            cassandraRisto.ital.main mainVar103 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 15");
            cassandraRisto.ital.main mainVar104 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar105 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common29 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar106 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 15) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Operatori set funzioni = '1111111111111111111111111111111111111010' where codice >9");
            cassandraRisto.ital.main mainVar107 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 16");
            cassandraRisto.ital.main mainVar108 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar109 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common30 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar110 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 16) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update pagine set dll= 'pag_' || substr(dll,3,5) where substr(dll,1,2)='p_'  and substr(dll,4,4)='.png'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE operatori ADD CodAutoPermanente bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD sent bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD SempreDocFisc bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD BuonoComeP int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update dettord set codint ='98' || substr('00000' || codint ,-5)  where (select count(*) from anagra where reparto=0 and  anagra.codint = dettord.codint) >0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update ean set codint ='98' || substr('00000' || codint ,-5)  where (select count(*) from anagra where reparto=0 and  anagra.codint = ean.codint) >0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update eliminati set codint ='98' || substr('00000' || codint ,-5)  where (select count(*) from anagra where reparto=0 and  anagra.codint = eliminati.codint) >0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update venduto set codint ='98' || substr('00000' || codint ,-5)  where reparto=0 ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("update venduto set codint ='98' || substr('00000' || codint ,-5)  where reparto=0 ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update pagine set valore = '98' || substr('00000' || cast(valore as nvarchar),-5) where tipo=2 and (select count(*) from anagra where reparto=0 and  anagra.codint = pagine.valore) >0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update anagra set codint ='98' || substr('00000' || codint ,-5)  where reparto=0 ");
            cassandraRisto.ital.main mainVar111 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 18");
            cassandraRisto.ital.main mainVar112 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar113 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common31 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar114 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 18) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE dettmnu ADD mnuattivo bit not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD obbligodes bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX IX_causaleHeadmov ON headmov (causale)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX IX_causaleVenduto ON venduto (causale)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX IX_datam3Headmov ON headmov (datam3)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX IX_datam3Venduto ON venduto (datam3)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE varauto(chiave INTEGER PRIMARY KEY,codint nvarchar (20) not NULL default '' ,codintvar nvarchar (20) not NULL default '') ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE varautoTmp(chiave INTEGER PRIMARY KEY,codint nvarchar (20) not NULL default '' ,codintvar nvarchar (20) not NULL default '') ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD variazioniauto bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE gruppovar ADD vEsclusive bit not NULL default 0");
            anywheresoftware.b4a.objects.collections.List list9 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map9 = new anywheresoftware.b4a.objects.collections.Map();
            map9.Initialize();
            list9.Initialize();
            map9.Put("codint", "888889");
            map9.Put("descrizione", "COPERTI BABY");
            map9.Put("reparto", 98);
            map9.Put("iva", 1);
            map9.Put("plupeso", 0);
            map9.Put("list1", 0);
            anywheresoftware.b4a.keywords.Common common32 = this.__c;
            map9.Put("flgusointerno", true);
            list9.Add(map9.getObject());
            cassandraRisto.ital.dbutil dbutilVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA9 = getActivityBA();
            cassandraRisto.ital.main mainVar115 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA9, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list9);
            cassandraRisto.ital.main mainVar116 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 19");
            cassandraRisto.ital.main mainVar117 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar118 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common33 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar119 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 19) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE gruppovar ADD indice int not NULL default 9");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE LinguaDescrizioniWeb(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE anagraDescrizioni(codint nvarchar (20) PRIMARY KEY ,descrizione1 nvarchar (50) not NULL default '',descrizione2 nvarchar (50) not NULL default '',descrizione3 nvarchar (50) not NULL default '',descrizione4 nvarchar (50) not NULL default '',descrizione5 nvarchar (50) not NULL default '', ingredienti1 text Not Null default '',ingredienti2 text not NULL default '',ingredienti3 text not NULL default '',ingredienti4 text not NULL default '',ingredienti5 text not NULL default '' ) ");
            cassandraRisto.ital.main mainVar120 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from LinguaDescrizioniWeb ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                cassandraRisto.ital.main mainVar121 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(1,'Italiano')");
                cassandraRisto.ital.main mainVar122 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(2,'Inglese')");
                cassandraRisto.ital.main mainVar123 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(3,'Francese')");
                cassandraRisto.ital.main mainVar124 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(4,'Tedesco')");
                cassandraRisto.ital.main mainVar125 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(5,'Spagnolo')");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD invioweb bit not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD invioweb bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD PwdWeb nvarchar (20) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headoff ADD attivaweb bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD cameriere int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD cameriere int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE venduto ADD cameriere int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD glory bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD fromweb bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD NoStampaAsporto bit not null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE TmpIva(codice nvarchar (50) not NULL default '' ,descrizione nvarchar (50) not NULL default '',qta numeric(18, 3) not null default 0,importo numeric(18, 2) not NULL default 0) ");
            cassandraRisto.ital.main mainVar126 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 20");
            cassandraRisto.ital.main mainVar127 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar128 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common34 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar129 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 20) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmovRecallAsporto ADD fromweb bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD FromWeb bit Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE versione ADD CodWeb nvarchar (5) not NULL default 'B32'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE allergeni(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ");
            cassandraRisto.ital.main mainVar130 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from allergeni ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i25 = 0; i25 <= 99; i25++) {
                    cassandraRisto.ital.main mainVar131 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into allergeni(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i25) + ",'allergene " + anywheresoftware.b4a.BA.NumberToString(i25) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE allergeniplu(chiave INTEGER PRIMARY KEY,codice Int not null default -1 ,codint nvarchar (20) not NULL default '') ");
            anywheresoftware.b4a.objects.collections.List list10 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map10 = new anywheresoftware.b4a.objects.collections.Map();
            map10.Initialize();
            list10.Initialize();
            map10.Put("codint", "variaweb");
            map10.Put("descrizione", "Variazione per Web");
            map10.Put("reparto", 98);
            map10.Put("iva", 1);
            map10.Put("plupeso", 0);
            map10.Put("list1", 0);
            anywheresoftware.b4a.keywords.Common common35 = this.__c;
            map10.Put("obbligodes", true);
            anywheresoftware.b4a.keywords.Common common36 = this.__c;
            map10.Put("flgusointerno", true);
            anywheresoftware.b4a.keywords.Common common37 = this.__c;
            map10.Put("bvar", true);
            list10.Add(map10.getObject());
            cassandraRisto.ital.dbutil dbutilVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA10 = getActivityBA();
            cassandraRisto.ital.main mainVar132 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA10, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list10);
            cassandraRisto.ital.main mainVar133 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 21");
            cassandraRisto.ital.main mainVar134 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar135 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common38 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar136 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 21) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE offerteUniandro (codint nvarchar (20) PRIMARY KEY ,campi nvarchar (200) not NULL default '',dadata DateTime not null default '1900-01-01',adata DateTime not null default '1900-01-01',list1 numeric(18, 2) not NULL default 0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Cereali contenenti glutine' where codice =0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Crostacei ' where codice =1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Uova ' where codice =2");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Pesce  ' where codice =3");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Arachidi  ' where codice =4");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Soia ' where codice =5");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Latte ' where codice =6");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Frutta a guscio ' where codice =7");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Sedano ' where codice =8");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Senape  ' where codice =9");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Semi di sesamo ' where codice =10");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Anidride solforosa e solfiti ' where codice =11");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Lupini ' where codice =12");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Molluschi  ' where codice =13");
            cassandraRisto.ital.main mainVar137 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 22");
            cassandraRisto.ital.main mainVar138 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar139 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common39 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar140 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 22) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE allergeni ADD tag bit Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Vegano ',tag=1 where codice =50");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Vegetariano  ',tag=1 where codice =51");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update allergeni set descrizione='Integrale  ',tag=1 where codice =52");
            cassandraRisto.ital.main mainVar141 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 23");
            cassandraRisto.ital.main mainVar142 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar143 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common40 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar144 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 23) {
            cassandraRisto.ital.main mainVar145 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from ingredienti ")) < 201.0d) {
                for (int i26 = 200; i26 <= 299; i26++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into ingredienti(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i26) + ",'Ingrediente " + anywheresoftware.b4a.BA.NumberToString(i26) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD abstampabuono bit not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD tesseraaggiuntiva bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD scadcliente DateTime not null default '2099-01-01'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD Kcal int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD punti Int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("UPDATE ANAGRA SET punti = 1,list1=0 where codint = 'pre'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD punti int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD punti int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD punti int not NULL default 0");
            cassandraRisto.ital.main mainVar146 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 24");
            cassandraRisto.ital.main mainVar147 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar148 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common41 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar149 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 24) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE TestiDoc ([nmov] nvarchar (20) not NULL PRIMARY KEY,testo ntext not null default '')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE TestiCli ([codice] nvarchar (20) not NULL PRIMARY KEY,testo ntext not null default '')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE TestiArt ([codice] nvarchar (20) not NULL PRIMARY KEY,testo ntext not null default '')");
            cassandraRisto.ital.main mainVar150 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 25");
            cassandraRisto.ital.main mainVar151 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar152 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common42 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar153 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 25) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD chiedimemo bit not NULL default 0");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.Common common43 = this.__c;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String sb2 = sb.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/ReportPersonalizzati").toString();
            anywheresoftware.b4a.keywords.Common common44 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common45 = this.__c;
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampacassetto.txt", sb2, "CF StampaCassetto.txt");
            anywheresoftware.b4a.keywords.Common common46 = this.__c;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common47 = this.__c;
            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampa tavolichiusi (sintetica).txt", sb2, "CF Stampa TavoliChiusi (sintetica).txt");
            anywheresoftware.b4a.keywords.Common common48 = this.__c;
            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common49 = this.__c;
            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampa sospesi.txt", sb2, "CF Stampa sospesi.txt");
            anywheresoftware.b4a.keywords.Common common50 = this.__c;
            anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common51 = this.__c;
            anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampa pagamenti-scontrini.txt", sb2, "CF Stampa pagamenti-scontrini.txt");
            anywheresoftware.b4a.keywords.Common common52 = this.__c;
            anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common53 = this.__c;
            anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampa movimenti fatture.txt", sb2, "CF Stampa movimenti fatture.txt");
            anywheresoftware.b4a.keywords.Common common54 = this.__c;
            anywheresoftware.b4a.objects.streams.File file12 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common55 = this.__c;
            anywheresoftware.b4a.objects.streams.File file13 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampa finananziario iva.txt", sb2, "CF Stampa finanziario iva.txt");
            anywheresoftware.b4a.keywords.Common common56 = this.__c;
            anywheresoftware.b4a.objects.streams.File file14 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common57 = this.__c;
            anywheresoftware.b4a.objects.streams.File file15 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampa finananziario iva tipo b.txt", sb2, "CF Stampa finanziario iva tipo b.txt");
            anywheresoftware.b4a.keywords.Common common58 = this.__c;
            anywheresoftware.b4a.objects.streams.File file16 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common59 = this.__c;
            anywheresoftware.b4a.objects.streams.File file17 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampa fasce orarie reparti(tutti i reparti).txt", sb2, "CF Stampa fasce orarie reparti(tutti i reparti).txt");
            anywheresoftware.b4a.keywords.Common common60 = this.__c;
            anywheresoftware.b4a.objects.streams.File file18 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common61 = this.__c;
            anywheresoftware.b4a.objects.streams.File file19 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf stampa camerieri.txt", sb2, "CF Stampa camerieri.txt");
            anywheresoftware.b4a.keywords.Common common62 = this.__c;
            anywheresoftware.b4a.objects.streams.File file20 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common63 = this.__c;
            anywheresoftware.b4a.objects.streams.File file21 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf articoli-iva.txt", sb2, "CF Articoli-iva.txt");
            anywheresoftware.b4a.keywords.Common common64 = this.__c;
            anywheresoftware.b4a.objects.streams.File file22 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common65 = this.__c;
            anywheresoftware.b4a.objects.streams.File file23 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "cf articoli dist.base.txt", sb2, "CF Articoli dist.base.txt");
            cassandraRisto.ital.main mainVar154 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 26");
            cassandraRisto.ital.main mainVar155 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar156 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common66 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar157 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 26) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD chiedimemo2 int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Despagine set chiedimemo2=chiedimemo");
            cassandraRisto.ital.main mainVar158 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 27");
            cassandraRisto.ital.main mainVar159 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar160 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common67 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar161 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 27) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update pagamenti set buonosr=0,BuonoComeP=0 where codice=0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD vincite bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD sottoconto int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD sottoconto int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE venduto ADD sottoconto int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE venduto ADD sottocontoT int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD sottocontoT int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE venduto ADD sottocontoT int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD righeinit int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD inviowebT bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update reparti set inviowebT =invioweb");
            cassandraRisto.ital.main mainVar162 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 28");
            cassandraRisto.ital.main mainVar163 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar164 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common68 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar165 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 28) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD nVariazioni Int Not Null default 0");
            cassandraRisto.ital.main mainVar166 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='chiaviClient'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE chiaviClient (chiave nvarchar (30) PRIMARY KEY ,data DateTime not null default '1900-01-01')");
            }
            cassandraRisto.ital.main mainVar167 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='ExportFattureHead'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE ExportFattureHead (nfat int PRIMARY KEY ,\n       \t\t\t\t   data DateTime not null default '1900-01-01',\n\t\t\t\t\t   cliente nvarchar (20) not null default '')");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE ExportFattureDett (chiave INTEGER PRIMARY KEY,\n       \t\t\t\t   nfat int not null default 0,\n\t\t\t\t\t   codint nvarchar (20) not null default '',\n\t\t\t\t\t   iva int not NULL default 0 ,\n\t\t\t\t\t   importo numeric(18, 4) not NULL default 0,\n                       prezzov numeric(18, 4) not NULL default 0,\n\t\t\t\t\t   qta numeric(18, 3) not NULL default 0\n\t\t\t\t\t    )");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD daTavolo Int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD aTavolo Int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD MaxImporto numeric(18, 2) not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Despagine ADD ImportoIngresso numeric(18, 2) not NULL default 0");
            cassandraRisto.ital.main mainVar168 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM Despagine where codice >=100").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i27 = 100; i27 <= 110; i27++) {
                    cassandraRisto.ital.main mainVar169 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into Despagine(codice,descrizione,obbligocoperti,nopalmari) values(" + anywheresoftware.b4a.BA.NumberToString(i27) + ",'Gruppo Tessere " + anywheresoftware.b4a.BA.NumberToString(i27 - 99) + "',1,1)");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clients ADD solotessere bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE dettmnu ADD elimina bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE eliminati ADD brep bit not NULL default 0");
            cassandraRisto.ital.main mainVar170 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 29");
            cassandraRisto.ital.main mainVar171 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar172 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common69 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar173 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 29) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE gruppocli(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ");
            cassandraRisto.ital.main mainVar174 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from gruppocli ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i28 = 1; i28 <= 9; i28++) {
                    cassandraRisto.ital.main mainVar175 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into gruppocli(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i28) + ",'Gruppo " + anywheresoftware.b4a.BA.NumberToString(i28) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD grpcli int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPIniziative] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[ElementoScontrino] nvarchar(5) NOT NULL DEFAULT '', \n\t\t\t\t\t[CodElementoScontrino] nvarchar(20) NOT NULL DEFAULT '', \n\t\t\t\t\t[Codice] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[ApplicazioneSconti] nvarchar(1) NOT NULL DEFAULT '0', \n\t\t\t\t\t[Linea] nvarchar(2) NOT NULL DEFAULT 'A', \n\t\t\t\t\t[DataInizio] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[DataFine] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[OraInizio] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[OraFine] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[GiorniValidita] nvarchar(7) NOT NULL DEFAULT '1111111', \n\t\t\t\t\t[Esclusivita] nvarchar(1) NOT NULL DEFAULT 'C', \n\t\t\t\t\t[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[Applicazione] nvarchar(1) NOT NULL DEFAULT '',\n\t\t\t\t\t[Priorita] nvarchar(2) NOT NULL DEFAULT '', \n\t\t\t\t\t[AmountType] nvarchar(1) NOT NULL DEFAULT '1'\n\t\t\t\t\t)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPVincoli] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[Codice] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[OggettoVincolo] nvarchar(5) NOT NULL DEFAULT '', \n\t\t\t\t\t[ElementoVincolo] nvarchar(20) NOT NULL DEFAULT '', \n\t\t\t\t\t[OperatoreVincolo] nvarchar(2) NOT NULL DEFAULT '', \n\t\t\t\t\t[ModalitaConfrontoVincolo] nvarchar(5) NOT NULL DEFAULT 'Q', \n\t\t\t\t\t[ConfrontoVincolo] numeric(18, 2) NOT NULL DEFAULT 0, \n\t\t\t\t\t[DataFineRedenzione] numeric(18, 0) NOT NULL DEFAULT 0,\n\t\t\t\t\t[GruppoVincolo] int not NULL default 0\n\t\t\t\t)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPRicompense] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[Codice] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[VeriabileRicompensa] nvarchar(5) NOT NULL DEFAULT '', \n\t\t\t\t\t[ElementoRicompensa] nvarchar(20) NOT NULL DEFAULT '', \n\t\t\t\t\t[SogliaRicompensa] nvarchar(1) NOT NULL DEFAULT '', \n\t\t\t\t\t[TipoRicompensa] nvarchar(2) NOT NULL DEFAULT '', \n\t\t\t\t\t[DataInizioRedenzione] numeric(18, 0) NOT NULL DEFAULT 0,\n\t\t\t\t\t[DataFineRedenzione] numeric(18, 0) NOT NULL DEFAULT 0,\n\t\t\t\t\t[CodiceMessaggioCoupon] nvarchar(20) NOT NULL DEFAULT '', \n\t\t\t\t\t[CumulabilitaRicompensa] nvarchar(1) NOT NULL DEFAULT '', \n\t\t\t\t\t[TipoCalcoloScontoRicompensa] nvarchar(1) NOT NULL DEFAULT '', \n\t\t\t\t\t[TipoStampaCouponRicompensa] nvarchar(1) NOT NULL DEFAULT '',\n\t\t\t\t\t[Priorita] int Not Null DEFAULT 0,\n\t\t\t\t\t[GruppoOrdinamentoRicompensa] nvarchar(5) NOT NULL DEFAULT '0'\n\t\t\t\t\t)\n\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPRicompenseGruppi] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[Codice] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', \n\t\t\t\t\t[CodiceGruppoRicompensa] nvarchar(5) NOT NULL DEFAULT '0', \n\t\t\t\t\t[NumeroRicompenseGruppo] int NOT NULL DEFAULT 0 \n\t\t\t\t\t)\n\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPLimitiRicompense] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[Codice] nvarchar(10) Not Null DEFAULT '',\n\t\t\t\t\t[CodiceCondizione] nvarchar(10) Not Null DEFAULT '',\n\t\t\t\t\t[InizioLR] int Not Null DEFAULT 0,\n\t\t\t\t\t[FineLR] int Not Null DEFAULT 0,\n\t\t\t\t\t[PassoLR] int Not Null DEFAULT 0,\n\t\t\t\t\t[ValoreLR] numeric(18, 2) Not Null DEFAULT 0,\n\t\t\t\t\t[SegnoLR] nvarchar(5) Not Null DEFAULT '',\n\t\t\t\t\t[Priorita] int Not Null DEFAULT 0\n\t\t\t\t\t\n\t\t\t\t\t)\n\t\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPTitoloIniziative] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[Codice] nvarchar(10) Not Null DEFAULT '',\n\t\t\t\t\t[Descrizione] nvarchar(50) NOT NULL DEFAULT ''\n\t\t\t\t\t)\n\t\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPPanieri] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[Codice] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[Tipo] nvarchar(1) Not Null DEFAULT '',\n\t\t\t\t\t[CodiceElemento] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[PaniereQta] numeric(18, 2) Not Null DEFAULT 0,\n\t\t\t\t\t[PaniereImporto] numeric(18, 2) Not Null DEFAULT 0\n\t\t\t\t\t)\n\t\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPMixArticoli] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[CodiceArticolo] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[MixCode] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[Codice] nvarchar(10) Not Null DEFAULT '',\n\t\t\t\t\t[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT ''\n\t\t\t\t\t)\n\t\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPMessaggiCoupon] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[CodiceCoupon] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[MessaggioCoupon] nvarchar(200) NOT NULL DEFAULT ''\n\t\t\t\t\t)\n\t\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPMessaggiCliente] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[CodiceMsg] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[MessaggioMsg] nvarchar(200) NOT NULL DEFAULT ''\n\t\t\t\t\t)\n\t\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [MPResetTable] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[Query] nvarchar(2000) Not Null DEFAULT ''\n\t\t\t\t\t)\n\t\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD noscontoF bit not NULL default 0");
            anywheresoftware.b4a.objects.collections.List list11 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map11 = new anywheresoftware.b4a.objects.collections.Map();
            map11.Initialize();
            list11.Initialize();
            map11.Put("codint", "cou");
            map11.Put("descrizione", "Coupon");
            map11.Put("reparto", 98);
            map11.Put("iva", 0);
            map11.Put("plupeso", 0);
            map11.Put("list1", 0);
            anywheresoftware.b4a.keywords.Common common70 = this.__c;
            map11.Put("flgusointerno", true);
            list11.Add(map11.getObject());
            cassandraRisto.ital.dbutil dbutilVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA11 = getActivityBA();
            cassandraRisto.ital.main mainVar176 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA11, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list11);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into progressivi(codice,valore) values('Z',1)");
            cassandraRisto.ital.main mainVar177 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 30");
            cassandraRisto.ital.main mainVar178 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar179 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common71 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar180 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 30) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD aliquota2 numeric(18, 4) NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update Venduto set aliquota2 =aliquota");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD aliquota2 numeric(18, 4) NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("update Venduto set aliquota2 =aliquota");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE iva ADD aliquota2 numeric(18, 4) NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update iva set aliquota2 =aliquota");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [DatiBilance] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[Codint] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[BilPlu] nvarchar(10) Not Null DEFAULT '',\n\t\t\t\t\t[BilGruppo] nvarchar(6) Not Null DEFAULT '1',\n\t\t\t\t\t[BilTara]  int Not Null DEFAULT 0,\n\t\t\t\t\t[BilGGCons]  int Not Null DEFAULT 0,\n\t\t\t\t\t[BilTipo]  int Not Null DEFAULT 0,\n\t\t\t\t\t[BilTestoGen1]  int Not Null DEFAULT 0,\n\t\t\t\t\t[BilTestoGen2]  int Not Null DEFAULT 0,\n\t\t\t\t\t[BilTestoGen3]  int Not Null DEFAULT 0,\n\t\t\t\t\t[BilTestoGen4]  int Not Null DEFAULT 0,\n\t\t\t\t\t[Aggiornamento] int Not Null DEFAULT 0\n\t\t\t\t\t)\n\t\t\t\t\t");
            cassandraRisto.ital.main mainVar181 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 31");
            cassandraRisto.ital.main mainVar182 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar183 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common72 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar184 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 31) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE DatiBilance ADD BilIngredienti ntext Not Null default ''");
            cassandraRisto.ital.main mainVar185 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from gruppocli ")) < 10.0d) {
                for (int i29 = 10; i29 <= 99; i29++) {
                    cassandraRisto.ital.main mainVar186 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into gruppocli(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i29) + ",'Gruppo " + anywheresoftware.b4a.BA.NumberToString(i29) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD scontabile bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update reparti set scontabile = not NF");
            cassandraRisto.ital.main mainVar187 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 32");
            cassandraRisto.ital.main mainVar188 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar189 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common73 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar190 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 32) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD residuoconvenzione int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update clienti set residuoconvenzione=abstampabuono");
            cassandraRisto.ital.main mainVar191 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 33");
            cassandraRisto.ital.main mainVar192 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar193 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common74 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar194 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 33) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into progressivi(codice,valore) values('TOTDimChar',0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into progressivi(codice,valore) values('TOTColor',0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD barcodeA bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE operatori ADD funzioni2  nvarchar (50) not NULL default '011111111111111111111111111111'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update operatori set funzioni2 =\n\t\tcase when substr(funzioni,33,1)='1' then\n\t\t'011111111111111111111111111111'\n\t\telse\n\t\t'000000000000000000000000000000'\n\t\tend\t");
            cassandraRisto.ital.main mainVar195 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 34");
            cassandraRisto.ital.main mainVar196 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar197 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common75 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar198 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 34) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD sezionale nvarchar(10) Not Null DEFAULT ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD sezionale nvarchar(10) Not Null DEFAULT ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD BeepStampante bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE StampaCP ADD FromDividi bit not NULL default 0");
            cassandraRisto.ital.main mainVar199 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 35");
            cassandraRisto.ital.main mainVar200 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar201 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common76 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar202 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 35) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [FEdatiCli] (\n\t[Codice] nvarchar(20) NOT NULL PRIMARY KEY, \n\t[TipoSoggettoCli] int NOT NULL, \n\t[NomeCli] nvarchar(60) NOT NULL, \n\t[CognomeCli] nvarchar(60) NOT NULL, \n\t[NazioneCli] nvarchar(2) NOT NULL,\n\t[CodiceDestinatario] nvarchar(7) NOT NULL,\n\t[EsigibilitaIVA] int NOT NULL,\n\t[PEC] nvarchar(256) NOT NULL\n)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE iva ADD natura int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [FEnaturaIVA] (\n\t[codice] int NOT NULL PRIMARY KEY, \n\t[descrizione] nvarchar(100) NOT NULL\n)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (0,'Nessuna')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (1,'N1 - Escluse ex art. 15')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (2,'N2 - Non soggette')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (3,'N3 - Non imponibili')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (4,'N4 - Esenti')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (5,'N5 - Regime del margine/IVA non esposta in fattura')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (6,'N6 - Inversione contabile')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (7,'N7 - IVA assolta in altro stato UE')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE [FEDatiMov] (\n\t[TipoDoc] nvarchar(4) NOT NULL, \n\t[IDPaeseTX] nvarchar(2) NOT NULL, \n\t[CodTX] nvarchar(28) NOT NULL, \n\t[ProgInvio] nvarchar(10) NOT NULL, \n\t[Divisa] nvarchar(3) NOT NULL DEFAULT 'EUR', \n\t[DataDoc] date NOT NULL, \n\t[NumeroDoc] int NOT NULL, \n\t[BolloVirtuale] bit NOT NULL DEFAULT 0, \n\t[ImportoBollo] decimal(14, 2) NOT NULL DEFAULT 00.00,\n\t[IDOrdAcq] nvarchar(20) NOT NULL,\n\t[CUP] nvarchar(15) NOT NULL,\n\t[CIG] nvarchar(15) NOT NULL,\n\t[EsigibilitaIVA] nvarchar(1) NOT NULL,\n\t[Database] int NOT NULL,\n\t[IDPaeseCli] nvarchar(2) NOT NULL, \n\t[CodCli] nvarchar(28) NOT NULL, \n\t[CFCli] nvarchar(16) NOT NULL, \n\t[DenominazioneCli] nvarchar(80) NOT NULL, \n\t[NomeCli] nvarchar(60) NOT NULL, \n\t[CognomeCli] nvarchar(60) NOT NULL, \n\t[IndirizzoCli] nvarchar(60) NOT NULL, \n\t[CAPCli] nvarchar(5) NOT NULL, \n\t[ComuneCli] nvarchar(60) NOT NULL, \n\t[ProvinciaCli] nvarchar(2) NOT NULL, \n\t[NazioneCli] nvarchar(2) NOT NULL, \n\t[Sezionale] nvarchar(15) NOT NULL,\n\t[NomeFile] nvarchar(50) NOT NULL,\n\t[Chiave] nvarchar(50) NOT NULL,\n\tCONSTRAINT [sqlite_autoindex_DatiFE_1] PRIMARY KEY ([Chiave]))");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [FERegFiscale] (\n\t[Codice] int NOT NULL PRIMARY KEY, \n\t[Sigla] nvarchar(4) NOT NULL, \n\t[Descrizione] nvarchar(100) NOT NULL\n)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (0,'','Nessuno')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (1,'RF01','Ordinario')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (2,'RF02','Contribuenti minimi')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (3,'RF04','Agricoltura e attività connesse e pesca')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (4,'RF05','Vendita sali e tabacchi')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (5,'RF06','Commercio fiammiferi')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (6,'RF07','Editoria')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (7,'RF08','Gestione servizi telefonia pubblica')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (8,'RF09','Rivendita documenti di trasporto pubblico e di sosta')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (9,'RF10','Intrattenimenti, giochi e altre attività di cui alla tariffa allegata al DPR 640/72')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (10,'RF11','Agenzie viaggi e turismo')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (11,'RF12','Agriturismo')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (12,'RF13','Vendite a domicilio')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (13,'RF14','Rivendita beni usati, oggetti d''arte, d''antiquariato o da collezione')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (14,'RF15','Agenzie di vendite all''asta di oggetti d''arte , antiquariato o da collezione')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (15,'RF16','IVA per cassa P.A.')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (16,'RF17','IVA per cassa')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (17,'RF18','Altro')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (18,'RF19','Regime forfettario')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [STATIISO] (\n\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t[ID] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[DESCRIZIONE] nvarchar(20) Not Null DEFAULT '',\n\t\t\t\t\t[ALPHA3] nvarchar(3) Not Null DEFAULT '',\n\t\t\t\t\t[CEE] bit Not Null DEFAULT 0\n\t\t\t\t\t)\n\t\t\t\t\t");
            cassandraRisto.ital.main mainVar203 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from STATIISO").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                new anywheresoftware.b4a.objects.collections.List();
                anywheresoftware.b4a.keywords.Common common77 = this.__c;
                anywheresoftware.b4a.objects.streams.File file24 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.keywords.Common common78 = this.__c;
                anywheresoftware.b4a.objects.streams.File file25 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.collections.List ReadList = anywheresoftware.b4a.objects.streams.File.ReadList(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "StatiIISO_Insert.sql");
                int size = ReadList.getSize() - 1;
                for (int i30 = 0; i30 <= size; i30++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA.ObjectToString(ReadList.Get(i30)));
                }
            }
            cassandraRisto.ital.main mainVar204 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 36");
            cassandraRisto.ital.main mainVar205 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar206 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common79 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar207 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 36) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE um(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ");
            cassandraRisto.ital.main mainVar208 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from um ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                cassandraRisto.ital.main mainVar209 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into um(codice,descrizione) values(0,'pezzo')");
                cassandraRisto.ital.main mainVar210 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into um(codice,descrizione) values(1,'kilogrammo')");
                cassandraRisto.ital.main mainVar211 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into um(codice,descrizione) values(2,'litro')");
                cassandraRisto.ital.main mainVar212 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into um(codice,descrizione) values(3,'metro')");
                for (int i31 = 4; i31 <= 9; i31++) {
                    cassandraRisto.ital.main mainVar213 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into um(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i31) + ",'U.M. " + anywheresoftware.b4a.BA.NumberToString(i31) + "')");
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD misura int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [FEDatiTX] (\n\t[TipoEser] int NOT NULL default 0, \n\t[IDPaeseTX] nvarchar(2) NOT NULL default '', \n\t[CodiceTX] nvarchar(28) NOT NULL default '', \n\t[NazioneEser] nvarchar(2) NOT NULL default 'IT', \n\t[CodForn] nvarchar(28) NOT NULL default '', \n\t[Tipo] nvarchar(2) NOT NULL default '', \n\t[CFEser] nvarchar(16) NOT NULL default '', \n\t[PIVAEser] nvarchar(16) NOT NULL default '', \n\t[DenEser] nvarchar(50) NOT NULL default '', \n\t[NomeEser] nvarchar(50) NOT NULL default '', \n\t[CognomeEser] nvarchar(50) NOT NULL default '', \n\t[ViaEser] nvarchar(60) NOT NULL default '', \n\t[CapEser] nvarchar(5) NOT NULL default '', \n\t[CittaEser] nvarchar(60) NOT NULL default '', \n\t[ProvinciaEser] nvarchar(2) NOT NULL default '', \n\t[RegFiscEser] int NOT NULL default 0,  \n\t[IDNazioneEser] nvarchar(2) NOT NULL default '', \n\t[UfficioREA] nvarchar(2) NOT NULL default '', \n\t[NumeroREA] nvarchar(20) NOT NULL default '', \n\t[CapSocREA] decimal(12, 2) NOT NULL default 0, \n\t[SocUnicoREA] int NOT NULL default 0, \n\t[StatoLiquidazioneREA] int NOT NULL default 0, \n\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT\n)");
            cassandraRisto.ital.main mainVar214 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from FEDatiTX ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                cassandraRisto.ital.main mainVar215 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("INSERT INTO [FEDatiTX]\t([TipoEser]) VALUES(0)");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into pagamenti(codice,descrizione,cassa) values(31,'Iva Split Payment',0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD MixCode int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE HeaddaStampare ADD RistampaTutto bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE versione ADD dataFE DateTime Not Null DEFAULT '01/01/2019'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD StampaImmagine bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update anagra set indice = indice + 990");
            cassandraRisto.ital.main mainVar216 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 37");
            cassandraRisto.ital.main mainVar217 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar218 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common80 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar219 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 37) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update operatori set funzioni2 =\n\t\tsubstr(funzioni2,1,17) || substr(funzioni,19,1)|| '11' || substr(funzioni,31,1) || '1' ||'11111111'");
            cassandraRisto.ital.main mainVar220 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 38");
            cassandraRisto.ital.main mainVar221 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar222 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common81 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar223 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 38) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE dettmnu ADD qtatmp int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE [Cassetto] (\n\t\t[Operatore] int NOT NULL DEFAULT 1, \n\t\t[TipoAttivita] char, \n\t\t[Importo] numeric(18, 2), \n\t\t[DataOra] datetime, \n\t\t[chiave] integer NOT NULL PRIMARY KEY AUTOINCREMENT, \n\t\t[TipoMoneta] int, \n\t\t[Qta] numeric(18, 0), \n\t\t[PrezzoUnitario] numeric(18, 2), \n\t\t[NumDistinta] numeric(18, 0), \n\t\t[Cassa] int NOT NULL DEFAULT 1, \n\t\t[memo] nvarchar(100) NOT NULL DEFAULT ''\n\t\t)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmovRecallAsporto ADD sezionale nvarchar(10) Not Null DEFAULT ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE [MPIniziative] ADD [limita] bit not null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD macroa int not null default -1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD macroc int not null default -1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD EseguitoSuPalmare bit not null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD EseguitoSuPalmare bit not null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE MacroHead (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE Macro(chiave INTEGER PRIMARY KEY,\n\t       codice int not NULL default 0,funzione int not NULL default 0,valore nvarchar (20) not NULL default '',qta int not null default 0) ");
            cassandraRisto.ital.main mainVar224 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from MacroHead").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i32 = 0; i32 <= 9; i32++) {
                    cassandraRisto.ital.main mainVar225 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into MacroHead(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i32) + ",'Macro num. " + anywheresoftware.b4a.BA.NumberToString(i32) + "')");
                    for (int i33 = 0; i33 <= 9; i33++) {
                        cassandraRisto.ital.main mainVar226 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into Macro(codice,funzione,valore,qta) values(" + anywheresoftware.b4a.BA.NumberToString(i32) + ",0,'',1)");
                    }
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Parameters ADD dll2 nvarchar (100) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD espandiT bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE iva ADD RTIva int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD RTPagamento int not NULL default 1");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update pagamenti set RTPagamento=1 where codice=0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update pagamenti set RTPagamento=7 where codice=2");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update pagamenti set RTPagamento=0 where codice<>2 and codice <>0");
            cassandraRisto.ital.main mainVar227 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 39");
            cassandraRisto.ital.main mainVar228 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar229 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common82 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar230 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 39) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD nChiusura int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD nChiusura int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX [IX_Telematico] ON [headmov] ([nscontrinoffm],[dataeoraffm],[nChiusura],[matricolacassap])");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE FEDatiTX ADD TerzoDenEser nvarchar(50) NOT NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE FEDatiTX ADD TerzoNomeEser nvarchar(50) NOT NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE FEDatiTX ADD TerzoCognomeEser nvarchar(50) NOT NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE FEDatiTX ADD TerzoCFEser nvarchar(16) NOT NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE FEDatiTX ADD TerzoCodiceTX nvarchar(28) NOT NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE FEDatiTX ADD TerzoIDPaeseTX nvarchar(2) NOT NULL default 'IT'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE FEDatiTX ADD TerzoTipoEser int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE INDEX [IX_MemoPerResoRT] ON [Venduto] ([memo])");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD TipoPrepagato int not NULL default 0");
            anywheresoftware.b4a.objects.collections.List list12 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map12 = new anywheresoftware.b4a.objects.collections.Map();
            map12.Initialize();
            list12.Initialize();
            map12.Put("codint", "com");
            map12.Put("descrizione", "Compensazione");
            map12.Put("reparto", 98);
            map12.Put("iva", 0);
            map12.Put("plupeso", 0);
            map12.Put("list1", 0);
            anywheresoftware.b4a.keywords.Common common83 = this.__c;
            map12.Put("flgusointerno", true);
            list12.Add(map12.getObject());
            cassandraRisto.ital.dbutil dbutilVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA12 = getActivityBA();
            cassandraRisto.ital.main mainVar231 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA12, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list12);
            cassandraRisto.ital.main mainVar232 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 40");
            cassandraRisto.ital.main mainVar233 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar234 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common84 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar235 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 40) {
            cassandraRisto.ital.main mainVar236 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,5))='zon10'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                anywheresoftware.b4a.objects.collections.List list13 = new anywheresoftware.b4a.objects.collections.List();
                anywheresoftware.b4a.objects.collections.Map map13 = new anywheresoftware.b4a.objects.collections.Map();
                list13.Initialize();
                for (int i34 = 10; i34 <= 19; i34++) {
                    map13.Initialize();
                    map13.Put("codint", "zon" + anywheresoftware.b4a.BA.NumberToString(i34));
                    map13.Put("descrizione", "Supplemento Zona " + anywheresoftware.b4a.BA.NumberToString(i34));
                    map13.Put("reparto", 95);
                    map13.Put("iva", 1);
                    map13.Put("plupeso", 0);
                    map13.Put("list1", 0);
                    anywheresoftware.b4a.keywords.Common common85 = this.__c;
                    map13.Put("flgusointerno", true);
                    list13.Add(map13.getObject());
                }
                cassandraRisto.ital.dbutil dbutilVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA activityBA13 = getActivityBA();
                cassandraRisto.ital.main mainVar237 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA13, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list13);
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmovRecallAsporto ADD nChiusura int not NULL default 0");
            cassandraRisto.ital.main mainVar238 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from progressivi where codice ='F2'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into progressivi(codice,valore) values('F2',1)");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE TmpClientiFM(\n\t       chiave INTEGER PRIMARY KEY,codiceCli nvarchar (20) Not Null default '',\n\t\t   descrizione nvarchar (50) Not Null default '',totale numeric(18, 2) not NULL default 0,MaxData DateTime not null default '1900-01-01')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clients ADD DaTavoloP int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clients ADD aTavoloP int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Parameters ADD dll3 nvarchar (100) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD passaggio int not null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD ClienteSlave nvarchar (20) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmovRecallAsporto ADD ClienteSlave nvarchar (20) not NULL default ''");
            cassandraRisto.ital.main mainVar239 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 41");
            cassandraRisto.ital.main mainVar240 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar241 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common86 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar242 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 41) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE [PrenotaRisorsa] (\n\t\t\t\t\t\t[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT,\n\t\t\t\t\t\t[ID] int Not Null DEFAULT 0,\n\t\t\t\t\t\t[Cliente] nvarchar(100) Not Null DEFAULT '',\n\t\t\t\t\t\t[Memo] nvarchar(200) Not Null DEFAULT '',\n\t\t\t\t\t\t[DataInizio] numeric(18, 0) NOT NULL DEFAULT 0,\n\t\t\t\t\t\t[DataFine] numeric(18, 0) NOT NULL DEFAULT 0,\n\t\t\t\t\t\t[IDCliente] nvarchar(20) Not Null DEFAULT ''\n\t\t\t\t\t\t) \n\t\t\t\t\t\t");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Parameters ADD dll4 nvarchar (100) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE PrenotaRisorsa ADD nmov numeric(18, 0) NOT NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD NDocStampato numeric(18, 0) NOT NULL default 0");
            cassandraRisto.ital.main mainVar243 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 42");
            cassandraRisto.ital.main mainVar244 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar245 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common87 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar246 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 42) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD contrassegno bit not null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE TestiPagamentiWeb (chiave INTEGER PRIMARY KEY,cliente nvarchar (20) not NULL default '',nmov numeric(18,0) not null default 0,testo ntext not null default '')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE anagra ADD variazioniWeb bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE TestiPagamentiWeb ADD Tipo int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tavoli ADD tPWD nvarchar (20) not NULL default ''");
            cassandraRisto.ital.main mainVar247 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set tPWD=random()");
            cassandraRisto.ital.main mainVar248 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 43");
            cassandraRisto.ital.main mainVar249 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar250 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common88 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar251 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 43) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE [tmpStampaWeb] (\n\t\t\t[codice] nvarchar(20), \n\t\t\t[descrizione] nvarchar(50), \n\t\t\t[qta] numeric(18, 3), \n\t\t\t[tavolo] int Not Null DEFAULT 0, \n\t\t\t[chiave] integer Not Null PRIMARY KEY AUTOINCREMENT, \n\t\t\t[totcre] nvarchar(10) Not Null DEFAULT '', \n\t\t\t[codint] nvarchar(20), \n\t\t\t[asporto] int Not Null DEFAULT -1, \n\t\t\t[reparto] int Not Null DEFAULT 1, \n\t\t\t[matricola] nvarchar(10) Not Null DEFAULT '', \n\t\t\t[idRiga] nvarchar(20) Not Null DEFAULT '', \n\t\t\t[turno] int Not Null DEFAULT 1, \n\t\t\t[ingredientisunf] Bit Not Null DEFAULT 0, \n\t\t\t[stampaesclusiva] Bit Not Null DEFAULT 0, \n\t\t\t[stampante2] int Not Null DEFAULT 0, \n\t\t\t[gruppomenu] nvarchar(10) Not Null DEFAULT '', \n\t\t\t[memo] nvarchar(200) Not Null DEFAULT ''\n\t\t)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD RiepAsporto bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD RiepAsportoD bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD GrpWeb int not NULL default 0");
            cassandraRisto.ital.main mainVar252 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 44");
            cassandraRisto.ital.main mainVar253 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar254 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common89 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar255 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 44) {
            cassandraRisto.ital.main mainVar256 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 45");
            cassandraRisto.ital.main mainVar257 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar258 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common90 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar259 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 45) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD NumMenu int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE reparti ADD verificaWeb bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE confstampe ADD mfWait bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE OpCM(codice int PRIMARY KEY ,\n       \t\t\t\t\t\t\t\tgPrelievo bit not NULL default 1,\n\t\t\t\t\t\t\t\t\tgTrasferimento bit not NULL default 1,\n\t\t\t\t\t\t\t\t\tgInventario bit not NULL default 1,\n\t\t\t\t\t\t\t\t\tgStato bit not NULL default 1,\n\t\t\t\t\t\t\t\t\tgDepositoManuale bit not NULL default 1,\n\t\t\t\t\t\t\t\t\tgSbloccaBanconote bit not NULL default 1,\n\t\t\t\t\t\t\t\t\tgScambio bit not NULL default 1,\n\t\t\t\t\t\t\t\t\tgSettings2 bit not NULL default 1\n\t\t\t\t\t\t\t\t\t)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into OpCM(codice) select codice from operatori");
            cassandraRisto.ital.main mainVar260 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 46");
            cassandraRisto.ital.main mainVar261 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar262 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common91 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar263 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 46) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE headmov ADD codLotteria nvarchar (8)  not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmov ADD codLotteria nvarchar (8)  not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD codLotteria nvarchar (8)  not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE TmpFraziona ADD memo nvarchar (200) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE TmpFraziona ADD ImportoV numeric(18, 2)  not NULL default 0");
            cassandraRisto.ital.main mainVar264 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from Palmari where Serial = 10010").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                for (int i35 = 10; i35 <= 19; i35++) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("Insert into \tPalmari(Serial) values(100" + anywheresoftware.b4a.BA.NumberToString(i35) + ")");
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE tmpStampaPalm" + anywheresoftware.b4a.BA.NumberToString(i35) + " (codice nvarchar (20)  Null ,\tdescrizione nvarchar (50)  Null ,qta numeric(18, 3) Null ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '',turno int NOT NULL DEFAULT 1, \tingredientisunf Bit Not Null DEFAULT 0, \tstampaesclusiva Bit Not Null DEFAULT 0, \tstampante2 Int Not Null DEFAULT 0,gruppomenu nvarchar (10) Not Null default '',memo nvarchar (200) not NULL default '')");
                }
            }
            cassandraRisto.ital.main mainVar265 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from MacroHead where codice >9").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                while (true) {
                    int i36 = i;
                    if (i36 > 39) {
                        break;
                    }
                    cassandraRisto.ital.main mainVar266 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into MacroHead(codice,descrizione) values(" + anywheresoftware.b4a.BA.NumberToString(i36) + ",'Macro num. " + anywheresoftware.b4a.BA.NumberToString(i36) + "')");
                    for (int i37 = 0; i37 <= 9; i37++) {
                        cassandraRisto.ital.main mainVar267 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into Macro(codice,funzione,valore,qta) values(" + anywheresoftware.b4a.BA.NumberToString(i36) + ",0,'',1)");
                    }
                    i = i36 + 1;
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE FECodiciDocumento(codice int PRIMARY KEY ,\n\t\t\t\t\t\t\t\t\tdocumento nvarchar (5) not null default '',\n       \t\t\t\t\t\t\t\tdescrizione nvarchar (100) Not Null default '',\n\t\t\t\t\t\t\t\t\tAttivoDiretta int not NULL default 0,AttivoDifferita int not NULL default 0,\n\t\t\t\t\t\t\t\t\tAttivoBuoniPasto bit not NULL default 0,AttivoStessaPIDiretta bit not NULL default 0,AttivoStessaPIDifferita bit not NULL default 0)");
            cassandraRisto.ital.main mainVar268 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from FECodiciDocumento").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(1,'TD01','TD01 Fattura',2,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(2,'TD02','TD02 Acconto - Anticipo su fattura',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(3,'TD03','TD03 Acconto - Anticipo su parcella',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(4,'TD04','TD04 Nota di Credito',1,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(5,'TD05','TD05 Nota di Debito',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(6,'TD06','TD06 Parcella',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(7,'TD10','TD10 Fattura per acquisto intracomunitario beni',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(8,'TD11','TD11 Fattura per acquisto intracomunitario servizi',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(9,'TD16','TD16 Autofattura reverse charge interno',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(10,'TD17','TD17 Autofattura per acquisti extra UE (alternativa ad esterometro)',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(11,'TD18','TD18 Autofattura per acquisto di beni intracomunitari (alternativa ad esterometro)',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(12,'TD19','TD19 Autofattura per acquisto di beni ex articolo 17 comma 2 DPR 633/72',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(13,'TD20','TD20 V.1.2.1 Autofattura denuncia ovvero per fattura non ricevuta o di importo inferiore',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(14,'TD21','TD21 Autofattura per splafonamento',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(15,'TD22','TD22 Autofattura per estrazione beni da Deposito Iva senza assoggettamento Iva',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(16,'TD23','TD23 Autofattura per estrazione beni da Deposito Iva con assoggettamento Iva',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(17,'TD24','TD24 Fattura Differita',0,2,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(18,'TD25','TD25 Fattura Differita (Dropshipping)',0,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(19,'TD26','TD26 Cessione beni ammortizzabili e passaggi interni',1,0,0)");
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(20,'TD27','TD27 Autofattura per autoconsumo',0,0,0)");
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (8,'N2.1 - non soggette ad IVA ai sensi degli artt. da 7 a 7-septies del DPR 633/72')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (9,'N2.2 - non soggette - altri casi')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (10,'N3.1 - non imponibili - esportazioni')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (11,'N3.2 - non imponibili - cessioni intracomunitarie')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (12,'N3.3 - non imponibili - cessioni verso San Marino')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (13,'N3.4 - non imponibili - operazioni assimilate alle cessioni all´esportazione')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (14,'N3.5 - non imponibili - a seguito di dichiarazioni d´intento')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (15,'N3.6 - non imponibili - altre operazioni che non concorrono alla formazione del plafond')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (16,'N6.1 - inversione contabile - cessione di rottami e altri materiali di recupero')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (17,'N6.2 - inversione contabile - cessione di oro e argento puro')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (18,'N6.3 - inversione contabile - subappalto nel settore edile')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (19,'N6.4 - inversione contabile - cessione di fabbricati')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (20,'N6.5 - inversione contabile - cessione di telefoni cellulari')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (21,'N6.6 - inversione contabile - cessione di prodotti elettronici')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (22,'N6.7 - inversione contabile - prestazioni comparto edile e settori connessi')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (23,'N6.8 - inversione contabile - operazioni settore energetico')");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (24,'N6.9 - inversione contabile - altri casi')");
            cassandraRisto.ital.main mainVar269 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 47");
            cassandraRisto.ital.main mainVar270 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar271 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common92 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar272 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 47) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("delete from FECodiciDocumento where codice >=9 and codice <= 16");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE headmovRecallAsporto ADD codLotteria nvarchar (8) not NULL default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE versione ADD ProgLotteriaST int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into pagamenti(codice,descrizione,cassa,RTPagamento) values(32,'Arrotondamento',0,14)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD TipoSconto int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Venduto ADD TipoSconto int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("ALTER TABLE Venduto ADD TipoSconto int not NULL default 0");
            cassandraRisto.ital.main mainVar273 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 48");
            cassandraRisto.ital.main mainVar274 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar275 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common93 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar276 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 48) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD pagamentopalmare bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE versione ADD FWVer nvarchar (20) not null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE crediti (chiave integer NOT NULL PRIMARY KEY AUTOINCREMENT,nmov numeric(18,0) not null default 0 ,totale numeric(18, 4) not NULL default 0,Data DateTime not null default '1900-01-01')");
            anywheresoftware.b4a.objects.collections.List list14 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map14 = new anywheresoftware.b4a.objects.collections.Map();
            map14.Initialize();
            list14.Initialize();
            map14.Put("codint", "sal");
            map14.Put("descrizione", "Saldo");
            map14.Put("reparto", 98);
            map14.Put("iva", 0);
            map14.Put("plupeso", 0);
            map14.Put("list1", 0);
            anywheresoftware.b4a.keywords.Common common94 = this.__c;
            map14.Put("flgusointerno", true);
            list14.Add(map14.getObject());
            cassandraRisto.ital.dbutil dbutilVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA14 = getActivityBA();
            cassandraRisto.ital.main mainVar277 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(activityBA14, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "anagra", list14);
            cassandraRisto.ital.main mainVar278 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 49");
            cassandraRisto.ital.main mainVar279 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar280 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common95 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar281 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 49) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("CREATE TABLE AzzeraProgressivi(Anno int PRIMARY KEY ,\n\t\t\t\t\t\t\t\t\tStato int not NULL default 0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE versione ADD ivacassa nvarchar (20) not null default ''");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Palmari ADD datachiave long Not Null DEFAULT 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD docPredefinito int  not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD dcompleanno DateTime not null default '01/01/1900'");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE clienti ADD VerificaGDPR bit not null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE pagamenti ADD GeneraPunti int not NULL default 1");
            for (int i38 = 501; i38 <= 1000; i38++) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("insert into tavoli(tavolo) values(" + anywheresoftware.b4a.BA.NumberToString(i38) + ")");
            }
            cassandraRisto.ital.main mainVar282 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 50");
            cassandraRisto.ital.main mainVar283 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar284 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common96 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar285 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 50) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE tavoli ADD copertiWeb int not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE Ventmp ADD Infinity bit not NULL default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("CREATE TABLE OffsetImmaginiPersonalizzate(NomeFile nvarchar (200) PRIMARY KEY ,\n\t\t\t\t\t\t\t\t\tOffsetX int not NULL default 0,OffsetY int not NULL default 0)");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("update operatori set funzioni2 =substr(funzioni2,1,24)||'0'|| substr(funzioni2,26,5)");
            cassandraRisto.ital.main mainVar286 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update versione set versione = 51");
            cassandraRisto.ital.main mainVar287 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar288 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select versione from versione"));
            anywheresoftware.b4a.keywords.Common common97 = this.__c;
            anywheresoftware.b4a.keywords.Common.DoEvents();
        }
        cassandraRisto.ital.main mainVar289 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 == 51) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE dettord ADD qtana int Not Null default 0");
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("ALTER TABLE eliminati ADD cassa int Not Null default 0");
        }
        anywheresoftware.b4a.keywords.Common common98 = this.__c;
        if (anywheresoftware.b4a.keywords.Common.Not(z)) {
            anywheresoftware.b4a.keywords.Common common99 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        }
        cassandraRisto.ital.main mainVar290 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.TransactionSuccessful();
        cassandraRisto.ital.main mainVar291 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.EndTransaction();
        cassandraRisto.ital.main mainVar292 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.TransactionSuccessful();
        cassandraRisto.ital.main mainVar293 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.EndTransaction();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.sql.SQL sql) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE headmov ADD codLotteria nvarchar (8)  not NULL default ''", sql);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE headmov ADD totaleNF numeric(18, 4) not Null default 0", sql);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE venduto ADD cameriere int Not Null default 1", sql);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE venduto ADD punti int not NULL default 0", sql);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE venduto ADD sottoconto int Not Null default 0", sql);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE venduto ADD sottocontoT int Not Null default 0", sql);
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE Venduto ADD aliquota2 numeric(18, 4) NULL default 0", sql)) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("update Venduto set aliquota2 =aliquota", sql);
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE headmov ADD sezionale nvarchar(10) Not Null DEFAULT ''", sql);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE headmov ADD nChiusura int not NULL default 0", sql);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("ALTER TABLE Venduto ADD TipoSconto int not NULL default 0", sql);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.objects.collections.Map map, java.lang.String str) throws java.lang.Exception {
        try {
            new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.collections.Map map2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) map.Get("anag"));
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(getActivityBA(), anywheresoftware.b4a.BA.ObjectToString(map2.GetDefault("denom", "")));
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map2.GetDefault("piva", ""));
            java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(map2.GetDefault("cf", ""));
            anywheresoftware.b4a.objects.collections.Map map3 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) map2.Get("domFisc"));
            java.lang.String ObjectToString3 = anywheresoftware.b4a.BA.ObjectToString(map3.GetDefault("prov", ""));
            java.lang.String ObjectToString4 = anywheresoftware.b4a.BA.ObjectToString(map3.GetDefault("cap", ""));
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv32 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(getActivityBA(), anywheresoftware.b4a.BA.ObjectToString(map3.GetDefault("com", "")));
            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv33 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(getActivityBA(), anywheresoftware.b4a.BA.ObjectToString(map3.GetDefault("ind", "")));
            anywheresoftware.b4a.objects.collections.Map map4 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) map.Get("SDI"));
            java.lang.String ObjectToString5 = anywheresoftware.b4a.BA.ObjectToString(map4.GetDefault("pec", ""));
            java.lang.String ObjectToString6 = anywheresoftware.b4a.BA.ObjectToString(map4.GetDefault("cod", ""));
            anywheresoftware.b4a.objects.collections.Map map5 = new anywheresoftware.b4a.objects.collections.Map();
            map5.Initialize();
            map5.Put("CodiceDestinatario", ObjectToString6);
            map5.Put("PEC", ObjectToString5);
            anywheresoftware.b4a.objects.collections.Map map6 = new anywheresoftware.b4a.objects.collections.Map();
            map6.Initialize();
            map6.Put("codice", str);
            cassandraRisto.ital.dbutil dbutilVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "FEdatiCli", map5, map6);
            map5.Initialize();
            map5.Put("descrizione", _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
            map5.Put("citta", _vvvvvvvvvvvvvvvvvvvvvvvvvvvv32);
            map5.Put("provincia", ObjectToString3);
            map5.Put("piva", ObjectToString);
            map5.Put("codf", ObjectToString2);
            map5.Put("via", _vvvvvvvvvvvvvvvvvvvvvvvvvvvv33);
            map5.Put("cap", ObjectToString4);
            map6.Initialize();
            map6.Put("codice", str);
            cassandraRisto.ital.dbutil dbutilVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA activityBA2 = getActivityBA();
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "clienti", map5, map6);
            return "";
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA3 = getActivityBA();
            anywheresoftware.b4a.keywords.Common common = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA3, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
            return "";
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int _rt_leggidocsospesilotteria = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._rt_leggidocsospesilotteria();
        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int parseDouble = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select ProgLotteriaST from versione"));
        if (_rt_leggidocsospesilotteria > 0 && _rt_leggidocsospesilotteria >= parseDouble) {
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _rt_leggidocsospesilotteria - parseDouble;
            return "";
        }
        if (_rt_leggidocsospesilotteria >= 0) {
            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("update versione set ProgLotteriaST =");
            anywheresoftware.b4a.keywords.Common common = this.__c;
            sql.ExecNonQuery(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(_rt_leggidocsospesilotteria))).append("").toString());
            return "";
        }
        return "";
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        boolean z;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        boolean z2 = false;
        anywheresoftware.b4a.phone.PackageManagerWrapper packageManagerWrapper = new anywheresoftware.b4a.phone.PackageManagerWrapper();
        new anywheresoftware.b4a.objects.collections.List().Initialize();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(str);
        int size = ListFiles.getSize() - 1;
        int i = 0;
        while (i <= size) {
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
            if (ObjectToString.startsWith(str2)) {
                java.lang.String replace = ObjectToString.replace(str2, "").replace(".apk", "").replace("_", "");
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.IsNumber(replace)) {
                    new anywheresoftware.b4a.objects.collections.List();
                    anywheresoftware.b4a.objects.collections.List GetInstalledPackages = packageManagerWrapper.GetInstalledPackages();
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    boolean z3 = false;
                    int size2 = GetInstalledPackages.getSize() - 1;
                    int i2 = 0;
                    while (true) {
                        if (i2 > size2) {
                            break;
                        }
                        if (!GetInstalledPackages.Get(i2).equals(str3)) {
                            i2++;
                        } else {
                            anywheresoftware.b4a.keywords.Common common5 = this.__c;
                            z3 = true;
                            break;
                        }
                    }
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    if (anywheresoftware.b4a.keywords.Common.Not(z3) || packageManagerWrapper.GetVersionCode(str3) <= java.lang.Double.parseDouble(replace)) {
                        if (str2.equals("wPalmRistorAndro")) {
                            anywheresoftware.b4a.keywords.Common common7 = this.__c;
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Copy(str, ObjectToString, str, "wPalmRistorAndro.apk");
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("UPGRADE");
                            anywheresoftware.b4a.keywords.Common common8 = this.__c;
                            double parseDouble = java.lang.Double.parseDouble(replace) / 100.0d;
                            anywheresoftware.b4a.keywords.Common common9 = this.__c;
                            java.lang.String sb = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(parseDouble, 1, 2, 2, false)).append(".zip").toString();
                            anywheresoftware.b4a.keywords.Common common10 = this.__c;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            if (anywheresoftware.b4a.objects.streams.File.Exists(str, sb)) {
                                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                                anywheresoftware.b4a.objects.streams.File.Delete(str, sb);
                            }
                            java.util.Arrays.fill(new java.lang.String[0], "");
                            flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
                            anywheresoftware.b4a.BA ba = this.ba;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            archiverForB4A.ZipFiles(ba, str, new java.lang.String[]{"wPalmRistorAndro.apk"}, sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/FWPalmari").toString(), sb, "");
                            z = z2;
                        } else {
                            anywheresoftware.b4a.keywords.Common common12 = this.__c;
                            z = true;
                            anywheresoftware.b4a.keywords.Common common13 = this.__c;
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Copy(str, ObjectToString, this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3, ObjectToString);
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ObjectToString);
                        }
                        anywheresoftware.b4a.keywords.Common common14 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Delete(str, ObjectToString);
                    }
                }
                z = z2;
                anywheresoftware.b4a.keywords.Common common142 = this.__c;
                anywheresoftware.b4a.objects.streams.File file62 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(str, ObjectToString);
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        return z2;
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws java.lang.Exception {
        boolean z;
        anywheresoftware.b4a.objects.collections.Map ReadMap;
        boolean z2 = true;
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!cassandraRisto.ital.main._v_webapipi.equals("")) {
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._v_webapiindirizzo.equals("")) {
                anywheresoftware.b4a.keywords.Common common = this.__c;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                java.lang.String sb2 = sb.append(anywheresoftware.b4a.objects.streams.File.getDirInternal()).append("/Updater/WebApi").toString();
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "CodiceAttivazione.txt")) {
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.String sb4 = sb3.append(anywheresoftware.b4a.objects.streams.File.getDirRootExternal()).append("/Licenze").toString();
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.StringBuilder append = sb5.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7).append("_");
                    cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.objects.streams.File.Copy(sb2, "CodiceAttivazione.txt", sb4, append.append(cassandraRisto.ital.main._v_matricola).append(".txt").toString());
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, "CodiceAttivazione.txt");
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    z = true;
                } else {
                    z = false;
                }
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "BasicSupport.bs")) {
                    anywheresoftware.b4a.keywords.Common common9 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    anywheresoftware.b4a.keywords.Common common10 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.String sb7 = sb6.append(anywheresoftware.b4a.objects.streams.File.getDirRootExternal()).append("/Licenze").toString();
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("BasicSupport_");
                    cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.objects.streams.File.Copy(sb2, "BasicSupport.bs", sb7, append2.append(cassandraRisto.ital.main._v_matricola).append(".bs").toString());
                    anywheresoftware.b4a.keywords.Common common11 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, "BasicSupport.bs");
                    anywheresoftware.b4a.keywords.Common common12 = this.__c;
                    z = true;
                }
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Aggiorna.sql")) {
                    cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA activityBA = getActivityBA();
                    anywheresoftware.b4a.keywords.Common common14 = this.__c;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvv5(activityBA, sb2, "Aggiorna.sql", "", true);
                    anywheresoftware.b4a.keywords.Common common15 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Aggiorna.sql");
                    anywheresoftware.b4a.keywords.Common common16 = this.__c;
                    z = true;
                }
                anywheresoftware.b4a.keywords.Common common17 = this.__c;
                anywheresoftware.b4a.objects.streams.File file12 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Config.txt")) {
                    try {
                        new anywheresoftware.b4a.objects.collections.Map();
                        anywheresoftware.b4a.keywords.Common common18 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file13 = anywheresoftware.b4a.keywords.Common.File;
                        ReadMap = anywheresoftware.b4a.objects.streams.File.ReadMap(sb2, "Config.txt");
                    } catch (java.lang.Exception e) {
                        this.ba.setLastException(e);
                        cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                        anywheresoftware.b4a.keywords.Common common19 = this.__c;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA2, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
                    }
                    if (ReadMap.getSize() > 0) {
                        new anywheresoftware.b4a.objects.collections.Map();
                        anywheresoftware.b4a.keywords.Common common20 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file14 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.keywords.Common common21 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file15 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.collections.Map ReadMap2 = anywheresoftware.b4a.objects.streams.File.ReadMap(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Config.txt");
                        int size = ReadMap.getSize() - 1;
                        for (int i = 0; i <= size; i++) {
                            ReadMap2.Put(ReadMap.GetKeyAt(i), ReadMap.GetValueAt(i));
                        }
                        anywheresoftware.b4a.keywords.Common common22 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file16 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.keywords.Common common23 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file17 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.WriteMap(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Config.txt", ReadMap2);
                        anywheresoftware.b4a.keywords.Common common24 = this.__c;
                        anywheresoftware.b4a.keywords.Common common25 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file18 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Config.txt");
                    }
                    z2 = z;
                    anywheresoftware.b4a.keywords.Common common252 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file182 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Config.txt");
                } else {
                    z2 = z;
                }
                boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb2, "InvioFE", "invioFE.ital");
                anywheresoftware.b4a.keywords.Common common26 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb2, "Spooler", "spooler.ital");
                }
                anywheresoftware.b4a.keywords.Common common27 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb2, "wPalmRistorAndro", "wpalm.ristorandro");
                }
                anywheresoftware.b4a.keywords.Common common28 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb2, "RistorAndro", "cassandraRisto.ital");
                }
                anywheresoftware.b4a.keywords.Common common29 = this.__c;
                return !anywheresoftware.b4a.keywords.Common.Not(z2) ? z2 : _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            }
        }
        anywheresoftware.b4a.keywords.Common common30 = this.__c;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x11d5, code lost:
    
        if (r3 == false) goto L250;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05b2 A[Catch: Exception -> 0x08a3, TryCatch #4 {Exception -> 0x08a3, blocks: (B:5:0x0058, B:7:0x0068, B:9:0x00e9, B:12:0x012f, B:14:0x0139, B:16:0x0143, B:18:0x0151, B:20:0x0159, B:22:0x0170, B:24:0x019e, B:26:0x01a6, B:28:0x01b4, B:29:0x01ba, B:48:0x0298, B:50:0x02fd, B:71:0x030a, B:72:0x0310, B:74:0x0317, B:75:0x0371, B:77:0x0398, B:79:0x03a1, B:81:0x045d, B:82:0x0468, B:84:0x04af, B:85:0x04df, B:87:0x04ec, B:89:0x0514, B:90:0x052d, B:92:0x053d, B:94:0x054b, B:96:0x0559, B:98:0x0561, B:101:0x0599, B:103:0x0592, B:106:0x059d, B:108:0x05a3, B:111:0x05ac, B:113:0x05b2, B:115:0x05d0, B:118:0x0621, B:120:0x062e, B:122:0x0634, B:123:0x0637, B:125:0x063f, B:126:0x0656, B:128:0x0663, B:130:0x066c, B:132:0x069f, B:133:0x06b0, B:135:0x0796, B:137:0x07a1, B:138:0x0896, B:141:0x08d0, B:143:0x08d6, B:146:0x08df, B:148:0x08e5, B:150:0x0903, B:154:0x0954, B:156:0x0978, B:158:0x0981, B:160:0x09b4, B:161:0x09c5, B:163:0x0b5c, B:165:0x0b68, B:167:0x0b6f, B:171:0x0b73, B:172:0x0b80, B:174:0x0b86, B:175:0x0b89, B:177:0x0bb0, B:179:0x0bd6, B:181:0x0c2b, B:183:0x0c37, B:192:0x0c62, B:194:0x0c72, B:196:0x0c7a, B:199:0x0cb2, B:201:0x0cab, B:205:0x0cba, B:207:0x0cdc, B:209:0x0ce2, B:212:0x0ceb, B:214:0x0cf1, B:216:0x0d0f, B:219:0x0d60, B:220:0x0d6d, B:222:0x0d70, B:224:0x0d76, B:226:0x0d7b, B:227:0x0d9c, B:229:0x0daf, B:230:0x0e92, B:232:0x0f94, B:234:0x0f9a, B:235:0x0f9d, B:237:0x0fa5, B:238:0x0fb1, B:240:0x0fbb, B:242:0x0fd2, B:244:0x0fe9, B:245:0x107c, B:247:0x1084, B:249:0x109a, B:251:0x10bf, B:255:0x10cb, B:253:0x12e7, B:258:0x13df, B:259:0x13ef, B:260:0x13e2, B:261:0x10ce, B:264:0x1123, B:266:0x1129, B:268:0x1133, B:273:0x1168, B:276:0x1197, B:278:0x11a8, B:281:0x12cb, B:283:0x12cf, B:285:0x12d6, B:287:0x11d7, B:289:0x1232, B:292:0x1245, B:295:0x12e2, B:297:0x087d, B:185:0x0c3e, B:187:0x0c46, B:190:0x0c5b), top: B:4:0x0058, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0621 A[Catch: Exception -> 0x08a3, TryCatch #4 {Exception -> 0x08a3, blocks: (B:5:0x0058, B:7:0x0068, B:9:0x00e9, B:12:0x012f, B:14:0x0139, B:16:0x0143, B:18:0x0151, B:20:0x0159, B:22:0x0170, B:24:0x019e, B:26:0x01a6, B:28:0x01b4, B:29:0x01ba, B:48:0x0298, B:50:0x02fd, B:71:0x030a, B:72:0x0310, B:74:0x0317, B:75:0x0371, B:77:0x0398, B:79:0x03a1, B:81:0x045d, B:82:0x0468, B:84:0x04af, B:85:0x04df, B:87:0x04ec, B:89:0x0514, B:90:0x052d, B:92:0x053d, B:94:0x054b, B:96:0x0559, B:98:0x0561, B:101:0x0599, B:103:0x0592, B:106:0x059d, B:108:0x05a3, B:111:0x05ac, B:113:0x05b2, B:115:0x05d0, B:118:0x0621, B:120:0x062e, B:122:0x0634, B:123:0x0637, B:125:0x063f, B:126:0x0656, B:128:0x0663, B:130:0x066c, B:132:0x069f, B:133:0x06b0, B:135:0x0796, B:137:0x07a1, B:138:0x0896, B:141:0x08d0, B:143:0x08d6, B:146:0x08df, B:148:0x08e5, B:150:0x0903, B:154:0x0954, B:156:0x0978, B:158:0x0981, B:160:0x09b4, B:161:0x09c5, B:163:0x0b5c, B:165:0x0b68, B:167:0x0b6f, B:171:0x0b73, B:172:0x0b80, B:174:0x0b86, B:175:0x0b89, B:177:0x0bb0, B:179:0x0bd6, B:181:0x0c2b, B:183:0x0c37, B:192:0x0c62, B:194:0x0c72, B:196:0x0c7a, B:199:0x0cb2, B:201:0x0cab, B:205:0x0cba, B:207:0x0cdc, B:209:0x0ce2, B:212:0x0ceb, B:214:0x0cf1, B:216:0x0d0f, B:219:0x0d60, B:220:0x0d6d, B:222:0x0d70, B:224:0x0d76, B:226:0x0d7b, B:227:0x0d9c, B:229:0x0daf, B:230:0x0e92, B:232:0x0f94, B:234:0x0f9a, B:235:0x0f9d, B:237:0x0fa5, B:238:0x0fb1, B:240:0x0fbb, B:242:0x0fd2, B:244:0x0fe9, B:245:0x107c, B:247:0x1084, B:249:0x109a, B:251:0x10bf, B:255:0x10cb, B:253:0x12e7, B:258:0x13df, B:259:0x13ef, B:260:0x13e2, B:261:0x10ce, B:264:0x1123, B:266:0x1129, B:268:0x1133, B:273:0x1168, B:276:0x1197, B:278:0x11a8, B:281:0x12cb, B:283:0x12cf, B:285:0x12d6, B:287:0x11d7, B:289:0x1232, B:292:0x1245, B:295:0x12e2, B:297:0x087d, B:185:0x0c3e, B:187:0x0c46, B:190:0x0c5b), top: B:4:0x0058, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08e5 A[Catch: Exception -> 0x08a3, TryCatch #4 {Exception -> 0x08a3, blocks: (B:5:0x0058, B:7:0x0068, B:9:0x00e9, B:12:0x012f, B:14:0x0139, B:16:0x0143, B:18:0x0151, B:20:0x0159, B:22:0x0170, B:24:0x019e, B:26:0x01a6, B:28:0x01b4, B:29:0x01ba, B:48:0x0298, B:50:0x02fd, B:71:0x030a, B:72:0x0310, B:74:0x0317, B:75:0x0371, B:77:0x0398, B:79:0x03a1, B:81:0x045d, B:82:0x0468, B:84:0x04af, B:85:0x04df, B:87:0x04ec, B:89:0x0514, B:90:0x052d, B:92:0x053d, B:94:0x054b, B:96:0x0559, B:98:0x0561, B:101:0x0599, B:103:0x0592, B:106:0x059d, B:108:0x05a3, B:111:0x05ac, B:113:0x05b2, B:115:0x05d0, B:118:0x0621, B:120:0x062e, B:122:0x0634, B:123:0x0637, B:125:0x063f, B:126:0x0656, B:128:0x0663, B:130:0x066c, B:132:0x069f, B:133:0x06b0, B:135:0x0796, B:137:0x07a1, B:138:0x0896, B:141:0x08d0, B:143:0x08d6, B:146:0x08df, B:148:0x08e5, B:150:0x0903, B:154:0x0954, B:156:0x0978, B:158:0x0981, B:160:0x09b4, B:161:0x09c5, B:163:0x0b5c, B:165:0x0b68, B:167:0x0b6f, B:171:0x0b73, B:172:0x0b80, B:174:0x0b86, B:175:0x0b89, B:177:0x0bb0, B:179:0x0bd6, B:181:0x0c2b, B:183:0x0c37, B:192:0x0c62, B:194:0x0c72, B:196:0x0c7a, B:199:0x0cb2, B:201:0x0cab, B:205:0x0cba, B:207:0x0cdc, B:209:0x0ce2, B:212:0x0ceb, B:214:0x0cf1, B:216:0x0d0f, B:219:0x0d60, B:220:0x0d6d, B:222:0x0d70, B:224:0x0d76, B:226:0x0d7b, B:227:0x0d9c, B:229:0x0daf, B:230:0x0e92, B:232:0x0f94, B:234:0x0f9a, B:235:0x0f9d, B:237:0x0fa5, B:238:0x0fb1, B:240:0x0fbb, B:242:0x0fd2, B:244:0x0fe9, B:245:0x107c, B:247:0x1084, B:249:0x109a, B:251:0x10bf, B:255:0x10cb, B:253:0x12e7, B:258:0x13df, B:259:0x13ef, B:260:0x13e2, B:261:0x10ce, B:264:0x1123, B:266:0x1129, B:268:0x1133, B:273:0x1168, B:276:0x1197, B:278:0x11a8, B:281:0x12cb, B:283:0x12cf, B:285:0x12d6, B:287:0x11d7, B:289:0x1232, B:292:0x1245, B:295:0x12e2, B:297:0x087d, B:185:0x0c3e, B:187:0x0c46, B:190:0x0c5b), top: B:4:0x0058, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0cf1 A[Catch: Exception -> 0x08a3, TryCatch #4 {Exception -> 0x08a3, blocks: (B:5:0x0058, B:7:0x0068, B:9:0x00e9, B:12:0x012f, B:14:0x0139, B:16:0x0143, B:18:0x0151, B:20:0x0159, B:22:0x0170, B:24:0x019e, B:26:0x01a6, B:28:0x01b4, B:29:0x01ba, B:48:0x0298, B:50:0x02fd, B:71:0x030a, B:72:0x0310, B:74:0x0317, B:75:0x0371, B:77:0x0398, B:79:0x03a1, B:81:0x045d, B:82:0x0468, B:84:0x04af, B:85:0x04df, B:87:0x04ec, B:89:0x0514, B:90:0x052d, B:92:0x053d, B:94:0x054b, B:96:0x0559, B:98:0x0561, B:101:0x0599, B:103:0x0592, B:106:0x059d, B:108:0x05a3, B:111:0x05ac, B:113:0x05b2, B:115:0x05d0, B:118:0x0621, B:120:0x062e, B:122:0x0634, B:123:0x0637, B:125:0x063f, B:126:0x0656, B:128:0x0663, B:130:0x066c, B:132:0x069f, B:133:0x06b0, B:135:0x0796, B:137:0x07a1, B:138:0x0896, B:141:0x08d0, B:143:0x08d6, B:146:0x08df, B:148:0x08e5, B:150:0x0903, B:154:0x0954, B:156:0x0978, B:158:0x0981, B:160:0x09b4, B:161:0x09c5, B:163:0x0b5c, B:165:0x0b68, B:167:0x0b6f, B:171:0x0b73, B:172:0x0b80, B:174:0x0b86, B:175:0x0b89, B:177:0x0bb0, B:179:0x0bd6, B:181:0x0c2b, B:183:0x0c37, B:192:0x0c62, B:194:0x0c72, B:196:0x0c7a, B:199:0x0cb2, B:201:0x0cab, B:205:0x0cba, B:207:0x0cdc, B:209:0x0ce2, B:212:0x0ceb, B:214:0x0cf1, B:216:0x0d0f, B:219:0x0d60, B:220:0x0d6d, B:222:0x0d70, B:224:0x0d76, B:226:0x0d7b, B:227:0x0d9c, B:229:0x0daf, B:230:0x0e92, B:232:0x0f94, B:234:0x0f9a, B:235:0x0f9d, B:237:0x0fa5, B:238:0x0fb1, B:240:0x0fbb, B:242:0x0fd2, B:244:0x0fe9, B:245:0x107c, B:247:0x1084, B:249:0x109a, B:251:0x10bf, B:255:0x10cb, B:253:0x12e7, B:258:0x13df, B:259:0x13ef, B:260:0x13e2, B:261:0x10ce, B:264:0x1123, B:266:0x1129, B:268:0x1133, B:273:0x1168, B:276:0x1197, B:278:0x11a8, B:281:0x12cb, B:283:0x12cf, B:285:0x12d6, B:287:0x11d7, B:289:0x1232, B:292:0x1245, B:295:0x12e2, B:297:0x087d, B:185:0x0c3e, B:187:0x0c46, B:190:0x0c5b), top: B:4:0x0058, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0d60 A[Catch: Exception -> 0x08a3, TryCatch #4 {Exception -> 0x08a3, blocks: (B:5:0x0058, B:7:0x0068, B:9:0x00e9, B:12:0x012f, B:14:0x0139, B:16:0x0143, B:18:0x0151, B:20:0x0159, B:22:0x0170, B:24:0x019e, B:26:0x01a6, B:28:0x01b4, B:29:0x01ba, B:48:0x0298, B:50:0x02fd, B:71:0x030a, B:72:0x0310, B:74:0x0317, B:75:0x0371, B:77:0x0398, B:79:0x03a1, B:81:0x045d, B:82:0x0468, B:84:0x04af, B:85:0x04df, B:87:0x04ec, B:89:0x0514, B:90:0x052d, B:92:0x053d, B:94:0x054b, B:96:0x0559, B:98:0x0561, B:101:0x0599, B:103:0x0592, B:106:0x059d, B:108:0x05a3, B:111:0x05ac, B:113:0x05b2, B:115:0x05d0, B:118:0x0621, B:120:0x062e, B:122:0x0634, B:123:0x0637, B:125:0x063f, B:126:0x0656, B:128:0x0663, B:130:0x066c, B:132:0x069f, B:133:0x06b0, B:135:0x0796, B:137:0x07a1, B:138:0x0896, B:141:0x08d0, B:143:0x08d6, B:146:0x08df, B:148:0x08e5, B:150:0x0903, B:154:0x0954, B:156:0x0978, B:158:0x0981, B:160:0x09b4, B:161:0x09c5, B:163:0x0b5c, B:165:0x0b68, B:167:0x0b6f, B:171:0x0b73, B:172:0x0b80, B:174:0x0b86, B:175:0x0b89, B:177:0x0bb0, B:179:0x0bd6, B:181:0x0c2b, B:183:0x0c37, B:192:0x0c62, B:194:0x0c72, B:196:0x0c7a, B:199:0x0cb2, B:201:0x0cab, B:205:0x0cba, B:207:0x0cdc, B:209:0x0ce2, B:212:0x0ceb, B:214:0x0cf1, B:216:0x0d0f, B:219:0x0d60, B:220:0x0d6d, B:222:0x0d70, B:224:0x0d76, B:226:0x0d7b, B:227:0x0d9c, B:229:0x0daf, B:230:0x0e92, B:232:0x0f94, B:234:0x0f9a, B:235:0x0f9d, B:237:0x0fa5, B:238:0x0fb1, B:240:0x0fbb, B:242:0x0fd2, B:244:0x0fe9, B:245:0x107c, B:247:0x1084, B:249:0x109a, B:251:0x10bf, B:255:0x10cb, B:253:0x12e7, B:258:0x13df, B:259:0x13ef, B:260:0x13e2, B:261:0x10ce, B:264:0x1123, B:266:0x1129, B:268:0x1133, B:273:0x1168, B:276:0x1197, B:278:0x11a8, B:281:0x12cb, B:283:0x12cf, B:285:0x12d6, B:287:0x11d7, B:289:0x1232, B:292:0x1245, B:295:0x12e2, B:297:0x087d, B:185:0x0c3e, B:187:0x0c46, B:190:0x0c5b), top: B:4:0x0058, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x1084 A[Catch: Exception -> 0x08a3, TryCatch #4 {Exception -> 0x08a3, blocks: (B:5:0x0058, B:7:0x0068, B:9:0x00e9, B:12:0x012f, B:14:0x0139, B:16:0x0143, B:18:0x0151, B:20:0x0159, B:22:0x0170, B:24:0x019e, B:26:0x01a6, B:28:0x01b4, B:29:0x01ba, B:48:0x0298, B:50:0x02fd, B:71:0x030a, B:72:0x0310, B:74:0x0317, B:75:0x0371, B:77:0x0398, B:79:0x03a1, B:81:0x045d, B:82:0x0468, B:84:0x04af, B:85:0x04df, B:87:0x04ec, B:89:0x0514, B:90:0x052d, B:92:0x053d, B:94:0x054b, B:96:0x0559, B:98:0x0561, B:101:0x0599, B:103:0x0592, B:106:0x059d, B:108:0x05a3, B:111:0x05ac, B:113:0x05b2, B:115:0x05d0, B:118:0x0621, B:120:0x062e, B:122:0x0634, B:123:0x0637, B:125:0x063f, B:126:0x0656, B:128:0x0663, B:130:0x066c, B:132:0x069f, B:133:0x06b0, B:135:0x0796, B:137:0x07a1, B:138:0x0896, B:141:0x08d0, B:143:0x08d6, B:146:0x08df, B:148:0x08e5, B:150:0x0903, B:154:0x0954, B:156:0x0978, B:158:0x0981, B:160:0x09b4, B:161:0x09c5, B:163:0x0b5c, B:165:0x0b68, B:167:0x0b6f, B:171:0x0b73, B:172:0x0b80, B:174:0x0b86, B:175:0x0b89, B:177:0x0bb0, B:179:0x0bd6, B:181:0x0c2b, B:183:0x0c37, B:192:0x0c62, B:194:0x0c72, B:196:0x0c7a, B:199:0x0cb2, B:201:0x0cab, B:205:0x0cba, B:207:0x0cdc, B:209:0x0ce2, B:212:0x0ceb, B:214:0x0cf1, B:216:0x0d0f, B:219:0x0d60, B:220:0x0d6d, B:222:0x0d70, B:224:0x0d76, B:226:0x0d7b, B:227:0x0d9c, B:229:0x0daf, B:230:0x0e92, B:232:0x0f94, B:234:0x0f9a, B:235:0x0f9d, B:237:0x0fa5, B:238:0x0fb1, B:240:0x0fbb, B:242:0x0fd2, B:244:0x0fe9, B:245:0x107c, B:247:0x1084, B:249:0x109a, B:251:0x10bf, B:255:0x10cb, B:253:0x12e7, B:258:0x13df, B:259:0x13ef, B:260:0x13e2, B:261:0x10ce, B:264:0x1123, B:266:0x1129, B:268:0x1133, B:273:0x1168, B:276:0x1197, B:278:0x11a8, B:281:0x12cb, B:283:0x12cf, B:285:0x12d6, B:287:0x11d7, B:289:0x1232, B:292:0x1245, B:295:0x12e2, B:297:0x087d, B:185:0x0c3e, B:187:0x0c46, B:190:0x0c5b), top: B:4:0x0058, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(boolean z, boolean z2) throws java.lang.Exception {
        boolean z3;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        boolean z4;
        boolean z5;
        boolean z6;
        java.lang.String str;
        boolean z7;
        boolean z8;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.BA activityBA = getActivityBA();
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Attendere ... Allineamento dati in corso ");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA, ObjectToCharSequence, false);
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.Common.DoEvents();
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (cassandraRisto.ital.mod1._vvvv3) {
            try {
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.EndTransaction();
                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.EndTransaction();
            } catch (java.lang.Exception e) {
                this.ba.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA2 = getActivityBA();
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("A1");
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA2, append.append(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage()).toString());
            }
        }
        cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        cassandraRisto.ital.mod1._vvvv3 = true;
        cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.BeginTransaction();
        cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.BeginTransaction();
        try {
            cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvv0 = "Public Sub AllineaArchivio";
            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
                cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from Venduto");
                cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov");
                cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from CausaliPagamenti");
                cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from Cassetto");
                cassandraRisto.ital.main mainVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from Cassetto");
                cassandraRisto.ital.main mainVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from daStampare");
                cassandraRisto.ital.main mainVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from StampaCP");
                cassandraRisto.ital.main mainVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from tmpStampa");
                cassandraRisto.ital.main mainVar15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from HeaddaStampare");
                cassandraRisto.ital.main mainVar16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from telefonate");
                cassandraRisto.ital.main mainVar17 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_azzeraasporto) {
                    cassandraRisto.ital.main mainVar18 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("update progressivi set valore = 0  where codice ='AS'");
                }
                return 1;
            }
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                    cassandraRisto.ital.main mainVar19 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (!cassandraRisto.ital.main._v_iprpi.equals("")) {
                        cassandraRisto.ital.main mainVar20 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_azzeradati) {
                            anywheresoftware.b4a.keywords.Common common9 = this.__c;
                            anywheresoftware.b4a.BA ba = this.ba;
                            cassandraRisto.ital.rpidevice rpideviceVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.rpidevice.getObject(), "SendObsoleti");
                            return 0;
                        }
                    }
                }
            }
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.sql.SQL sql = new anywheresoftware.b4a.sql.SQL();
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            boolean z9 = false;
            cassandraRisto.ital.main mainVar21 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String str2 = cassandraRisto.ital.main._v_percorsoazzera;
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                cassandraRisto.ital.main mainVar22 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_azzeradati) {
                    cassandraRisto.ital.main mainVar23 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (!cassandraRisto.ital.main._v_percorsoazzera.equals("")) {
                        anywheresoftware.b4a.keywords.Common common12 = this.__c;
                        boolean z10 = false;
                        boolean z11 = false;
                        while (true) {
                            anywheresoftware.b4a.keywords.Common common13 = this.__c;
                            if (!anywheresoftware.b4a.keywords.Common.Not(z10)) {
                                break;
                            }
                            try {
                                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                                anywheresoftware.b4a.keywords.Common common15 = this.__c;
                                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                            }
                            if (!anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(str2, "Venduto.db"))) {
                                anywheresoftware.b4a.keywords.Common common16 = this.__c;
                                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                                if (anywheresoftware.b4a.objects.streams.File.Size(str2, "Venduto.db") != 0) {
                                    anywheresoftware.b4a.keywords.Common common17 = this.__c;
                                    z7 = true;
                                    try {
                                        anywheresoftware.b4a.keywords.Common common18 = this.__c;
                                        z8 = true;
                                        z10 = z8;
                                        z11 = z7;
                                    } catch (java.lang.Exception e3) {
                                        e = e3;
                                        z11 = true;
                                        this.ba.setLastException(e);
                                        anywheresoftware.b4a.keywords.Common common19 = this.__c;
                                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Errore nella creazione  delle strutture DB (o chiave USB non inserita) per salvataggio dato obsoleti nel percorso: ");
                                        cassandraRisto.ital.main mainVar24 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.main._v_percorsoazzera);
                                        anywheresoftware.b4a.keywords.Common common20 = this.__c;
                                        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(append3.append("\n").append("Si desidera Riprovare ?").toString());
                                        cassandraRisto.ital.main mainVar25 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                        cassandraRisto.ital.main mainVar26 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence2, ObjectToCharSequence3, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                                        anywheresoftware.b4a.keywords.Common common21 = this.__c;
                                        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                                        if (Msgbox2 != -1) {
                                            anywheresoftware.b4a.keywords.Common common22 = this.__c;
                                            z10 = true;
                                            str = "";
                                        } else {
                                            str = str2;
                                        }
                                        str2 = str;
                                    }
                                }
                            }
                            anywheresoftware.b4a.keywords.Common common23 = this.__c;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.keywords.Common common24 = this.__c;
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Copy(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Venduto.db", str2, "Venduto.db");
                            anywheresoftware.b4a.keywords.Common common25 = this.__c;
                            anywheresoftware.b4a.keywords.Common common26 = this.__c;
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(str2, "Venduto.db"))) {
                                anywheresoftware.b4a.keywords.Common common27 = this.__c;
                                java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Errore nella creazione  delle strutture DB (o chiave USB non inserita) per salvataggio dato obsoleti nel percorso: ");
                                cassandraRisto.ital.main mainVar27 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.StringBuilder append5 = append4.append(cassandraRisto.ital.main._v_percorsoazzera);
                                anywheresoftware.b4a.keywords.Common common28 = this.__c;
                                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(append5.append("\n").append("Si desidera Riprovare ?").toString());
                                cassandraRisto.ital.main mainVar28 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.CharSequence ObjectToCharSequence5 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                cassandraRisto.ital.main mainVar29 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int Msgbox22 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence4, ObjectToCharSequence5, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                                anywheresoftware.b4a.keywords.Common common29 = this.__c;
                                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse2 = anywheresoftware.b4a.keywords.Common.DialogResponse;
                                if (Msgbox22 != -1) {
                                    anywheresoftware.b4a.keywords.Common common30 = this.__c;
                                    z8 = true;
                                    z7 = z11;
                                } else {
                                    z8 = z10;
                                    z7 = z11;
                                }
                            } else {
                                anywheresoftware.b4a.keywords.Common common31 = this.__c;
                                z7 = true;
                                anywheresoftware.b4a.keywords.Common common32 = this.__c;
                                z8 = true;
                            }
                            z10 = z8;
                            z11 = z7;
                        }
                        z9 = z11;
                    }
                }
            }
            if (z) {
                anywheresoftware.b4a.keywords.Common common33 = this.__c;
                z3 = false;
            } else {
                z3 = z9;
            }
            anywheresoftware.b4a.objects.collections.Map map2 = new anywheresoftware.b4a.objects.collections.Map();
            if (z3) {
                anywheresoftware.b4a.keywords.Common common34 = this.__c;
                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.keywords.Common common35 = this.__c;
                anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                java.lang.String dirDefaultExternal = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
                java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("anagra");
                cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA3 = getActivityBA();
                cassandraRisto.ital.mod1 mod1Var6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.objects.streams.File.Copy(dirDefaultExternal, "Anagra.db", str2, append6.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(activityBA3, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append(".db").toString());
                anywheresoftware.b4a.keywords.Common common36 = this.__c;
                sql.Initialize(str2, "Venduto.db", false);
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(sql);
                map2.Initialize();
            }
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar30 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("SELECT * FROM headmov where sospeso =0 order by nmov"));
            cursorWrapper3.setPosition(0);
            list.Initialize();
            list2.Initialize();
            if (cursorWrapper3.getRowCount() > 0) {
                int rowCount = cursorWrapper3.getRowCount() - 1;
                for (int i = 0; i <= rowCount; i++) {
                    cursorWrapper3.setPosition(i);
                    map.Initialize();
                    map.Put("nmov", cursorWrapper3.GetLong("nmov"));
                    map.Put("nfat", java.lang.Integer.valueOf(cursorWrapper3.GetInt("nfat")));
                    map.Put("nric", java.lang.Integer.valueOf(cursorWrapper3.GetInt("nric")));
                    map.Put("RicDaFatt", java.lang.Integer.valueOf(cursorWrapper3.GetInt("RicDaFatt")));
                    map.Put("cliente", cursorWrapper3.GetString("cliente"));
                    map.Put("clides", cursorWrapper3.GetString("clides"));
                    map.Put("flgNF", java.lang.Integer.valueOf(cursorWrapper3.GetInt("flgNF")));
                    map.Put("totale", cursorWrapper3.GetDouble("totale"));
                    map.Put("totaleNF", cursorWrapper3.GetDouble("totaleNF"));
                    map.Put("prep", cursorWrapper3.GetDouble("prep"));
                    map.Put("punti", cursorWrapper3.GetDouble("punti"));
                    map.Put("datam", cursorWrapper3.GetString("datam"));
                    map.Put("datam2", cursorWrapper3.GetString("datam2"));
                    map.Put("datam3", cursorWrapper3.GetString("datam3"));
                    cassandraRisto.ital.main mainVar31 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                        map.Put("cassa", cursorWrapper3.GetString("cassa"));
                    }
                    map.Put("memo", cursorWrapper3.GetString("memo"));
                    map.Put("sezionale", cursorWrapper3.GetString("sezionale"));
                    map.Put("operatore", java.lang.Integer.valueOf(cursorWrapper3.GetInt("operatore")));
                    map.Put("tavolo", java.lang.Integer.valueOf(cursorWrapper3.GetInt("tavolo")));
                    map.Put("opdes", cursorWrapper3.GetString("opdes"));
                    if (cursorWrapper3.GetInt("nscontrinoffm") > 0) {
                        map.Put("dataeoraffm", cursorWrapper3.GetString("dataeoraffm"));
                        map.Put("nscontrinoffm", java.lang.Integer.valueOf(cursorWrapper3.GetInt("nscontrinoffm")));
                        map.Put("matricolacassap", cursorWrapper3.GetString("matricolacassap"));
                        map.Put("nChiusura", cursorWrapper3.GetString("nChiusura"));
                    }
                    map.Put("codLotteria", cursorWrapper3.GetString("codLotteria"));
                    if (z3 && sql.ExecQuerySingleResult("select count(*) from headmov where nmov = " + cursorWrapper3.GetString("nmov")).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                        list2.Add(map.getObject());
                        java.lang.String GetString = cursorWrapper3.GetString("nmov");
                        anywheresoftware.b4a.keywords.Common common37 = this.__c;
                        map2.Put(GetString, true);
                    }
                    anywheresoftware.b4a.keywords.Common common38 = this.__c;
                    cassandraRisto.ital.main mainVar32 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_azzeradati) && !cursorWrapper3.GetString("memo").equals("Modifica Prepagato") && !cursorWrapper3.GetString("memo").equals("Modifica Punti")) {
                        cassandraRisto.ital.main mainVar33 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_azzeradati) {
                            cassandraRisto.ital.main mainVar34 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM Venduto inner join reparti on venduto.reparto = reparti.codice where not(venduto.flgnf=1 AND venduto.sospeso=0 AND reparti.NF=0) and sospeso =0 and venduto.nmov = " + anywheresoftware.b4a.BA.NumberToString(cursorWrapper3.GetLong("nmov")))) <= 0.0d) {
                            }
                        }
                    }
                    list.Add(map.getObject());
                }
                anywheresoftware.b4a.keywords.Common common39 = this.__c;
                if (z3) {
                    cassandraRisto.ital.main mainVar35 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_nodatiperiodo) {
                        z6 = true;
                        if (anywheresoftware.b4a.keywords.Common.Not(z6)) {
                            anywheresoftware.b4a.keywords.Common common40 = this.__c;
                            cassandraRisto.ital.dbutil dbutilVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            anywheresoftware.b4a.BA activityBA4 = getActivityBA();
                            cassandraRisto.ital.main mainVar36 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(activityBA4, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "headmov", list))) {
                                anywheresoftware.b4a.keywords.Common common41 = this.__c;
                                java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("Si sono verificati problemi durante la Chiusura Giornaliera.");
                                anywheresoftware.b4a.keywords.Common common42 = this.__c;
                                java.lang.CharSequence ObjectToCharSequence6 = anywheresoftware.b4a.BA.ObjectToCharSequence(append7.append("\n").append("CHIAMARE ASSISTENZA TECNICA").toString());
                                cassandraRisto.ital.main mainVar37 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.CharSequence ObjectToCharSequence7 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                cassandraRisto.ital.main mainVar38 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence6, ObjectToCharSequence7, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                                return 2;
                            }
                        }
                        if (z3) {
                            cassandraRisto.ital.dbutil dbutilVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), sql, "headmov", list2);
                        }
                    }
                }
                z6 = false;
                if (anywheresoftware.b4a.keywords.Common.Not(z6)) {
                }
                if (z3) {
                }
            }
            if (cursorWrapper3.IsInitialized()) {
                cursorWrapper3.Close();
            }
            cassandraRisto.ital.main mainVar39 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_azzeradati) {
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar40 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper4, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("SELECT venduto.* FROM Venduto inner join reparti on venduto.reparto = reparti.codice where not(venduto.flgnf=1 AND venduto.sospeso=0 AND reparti.NF=0) and sospeso =0 order by chiave"));
            } else {
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar41 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("SELECT * FROM Venduto where sospeso =0 order by chiave"));
            }
            cursorWrapper.setPosition(0);
            list.Initialize();
            if (cursorWrapper.getRowCount() > 0) {
                int rowCount2 = cursorWrapper.getRowCount() - 1;
                for (int i2 = 0; i2 <= rowCount2; i2++) {
                    cursorWrapper.setPosition(i2);
                    map.Initialize();
                    map.Put("codice", cursorWrapper.GetString("codice"));
                    map.Put("descrizione", cursorWrapper.GetString("descrizione"));
                    map.Put("brep", java.lang.Integer.valueOf(cursorWrapper.GetInt("brep")));
                    cassandraRisto.ital.main mainVar42 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_turni) {
                        map.Put("turno", java.lang.Integer.valueOf(cursorWrapper.GetInt("turno")));
                    }
                    map.Put("qta", cursorWrapper.GetDouble("qta"));
                    map.Put("prezzov", cursorWrapper.GetDouble("prezzov"));
                    map.Put("reparto", java.lang.Integer.valueOf(cursorWrapper.GetInt("reparto")));
                    map.Put("cameriere", java.lang.Integer.valueOf(cursorWrapper.GetInt("cameriere")));
                    map.Put("sottoconto", java.lang.Integer.valueOf(cursorWrapper.GetInt("sottoconto")));
                    map.Put("sottocontoT", java.lang.Integer.valueOf(cursorWrapper.GetInt("sottocontoT")));
                    map.Put("punti", java.lang.Integer.valueOf(cursorWrapper.GetInt("punti")));
                    map.Put("aliquota2", cursorWrapper.GetDouble("aliquota2"));
                    map.Put("aliquota", cursorWrapper.GetDouble("aliquota2"));
                    map.Put("iva", java.lang.Integer.valueOf(cursorWrapper.GetInt("iva")));
                    map.Put("importo", cursorWrapper.GetDouble("importo"));
                    map.Put("importo2", cursorWrapper.GetDouble("importo2"));
                    map.Put("datam", cursorWrapper.GetString("datam"));
                    map.Put("datam2", cursorWrapper.GetString("datam2"));
                    map.Put("datam3", cursorWrapper.GetString("datam3"));
                    map.Put("cliente", cursorWrapper.GetString("cliente"));
                    map.Put("codint", cursorWrapper.GetString("codint"));
                    map.Put("memo", cursorWrapper.GetString("memo"));
                    cassandraRisto.ital.main mainVar43 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                        map.Put("cassa", cursorWrapper.GetString("cassa"));
                    } else {
                        cassandraRisto.ital.main mainVar44 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
                    }
                    map.Put("scop", cursorWrapper.GetDouble("scop"));
                    map.Put("scov", cursorWrapper.GetDouble("scov"));
                    map.Put("ingredientisumf", java.lang.Integer.valueOf(cursorWrapper.GetInt("ingredientisumf")));
                    map.Put("ingredientisunf", java.lang.Integer.valueOf(cursorWrapper.GetInt("ingredientisunf")));
                    map.Put("stampaesclusiva", java.lang.Integer.valueOf(cursorWrapper.GetInt("stampaesclusiva")));
                    map.Put("gruppomenu", cursorWrapper.GetString("gruppomenu"));
                    map.Put("stampante2", java.lang.Integer.valueOf(cursorWrapper.GetInt("stampante2")));
                    map.Put("uscita", java.lang.Integer.valueOf(cursorWrapper.GetInt("uscita")));
                    map.Put("TipoSconto", java.lang.Integer.valueOf(cursorWrapper.GetInt("TipoSconto")));
                    map.Put("flgmag", java.lang.Integer.valueOf(cursorWrapper.GetInt("flgmag")));
                    map.Put("flgNF", java.lang.Integer.valueOf(cursorWrapper.GetInt("flgNF")));
                    map.Put("nmov", cursorWrapper.GetLong("nmov"));
                    map.Put("nfat", java.lang.Integer.valueOf(cursorWrapper.GetInt("nfat")));
                    map.Put("nric", java.lang.Integer.valueOf(cursorWrapper.GetInt("nric")));
                    map.Put("totcre", cursorWrapper.GetString("totcre"));
                    list.Add(map.getObject());
                }
                anywheresoftware.b4a.keywords.Common common43 = this.__c;
                if (z3) {
                    cassandraRisto.ital.main mainVar45 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_nodatiperiodo) {
                        z5 = true;
                        if (anywheresoftware.b4a.keywords.Common.Not(z5)) {
                            anywheresoftware.b4a.keywords.Common common44 = this.__c;
                            cassandraRisto.ital.dbutil dbutilVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            anywheresoftware.b4a.BA activityBA5 = getActivityBA();
                            cassandraRisto.ital.main mainVar46 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(activityBA5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Venduto", list))) {
                                anywheresoftware.b4a.keywords.Common common45 = this.__c;
                                java.lang.StringBuilder append8 = new java.lang.StringBuilder().append("Si sono verificati problemi durante la Chiusura Giornaliera.");
                                anywheresoftware.b4a.keywords.Common common46 = this.__c;
                                java.lang.CharSequence ObjectToCharSequence8 = anywheresoftware.b4a.BA.ObjectToCharSequence(append8.append("\n").append("CHIAMARE ASSISTENZA TECNICA").toString());
                                cassandraRisto.ital.main mainVar47 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.CharSequence ObjectToCharSequence9 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                cassandraRisto.ital.main mainVar48 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence8, ObjectToCharSequence9, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                                return 2;
                            }
                        }
                    }
                }
                z5 = false;
                if (anywheresoftware.b4a.keywords.Common.Not(z5)) {
                }
            }
            if (z3) {
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper6 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar49 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper6, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("SELECT * FROM Venduto where sospeso =0 order by chiave"));
                cursorWrapper.setPosition(0);
                list2.Initialize();
                if (cursorWrapper.getRowCount() > 0) {
                    int rowCount3 = cursorWrapper.getRowCount() - 1;
                    for (int i3 = 0; i3 <= rowCount3; i3++) {
                        cursorWrapper.setPosition(i3);
                        map.Initialize();
                        map.Put("codice", cursorWrapper.GetString("codice"));
                        map.Put("descrizione", cursorWrapper.GetString("descrizione"));
                        map.Put("brep", java.lang.Integer.valueOf(cursorWrapper.GetInt("brep")));
                        cassandraRisto.ital.main mainVar50 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_turni) {
                            map.Put("turno", java.lang.Integer.valueOf(cursorWrapper.GetInt("turno")));
                        }
                        map.Put("qta", cursorWrapper.GetDouble("qta"));
                        map.Put("prezzov", cursorWrapper.GetDouble("prezzov"));
                        map.Put("reparto", java.lang.Integer.valueOf(cursorWrapper.GetInt("reparto")));
                        map.Put("cameriere", java.lang.Integer.valueOf(cursorWrapper.GetInt("cameriere")));
                        map.Put("sottoconto", java.lang.Integer.valueOf(cursorWrapper.GetInt("sottoconto")));
                        map.Put("sottocontoT", java.lang.Integer.valueOf(cursorWrapper.GetInt("sottocontoT")));
                        map.Put("punti", java.lang.Integer.valueOf(cursorWrapper.GetInt("punti")));
                        map.Put("aliquota2", cursorWrapper.GetDouble("aliquota2"));
                        map.Put("aliquota", cursorWrapper.GetDouble("aliquota2"));
                        map.Put("iva", java.lang.Integer.valueOf(cursorWrapper.GetInt("iva")));
                        map.Put("importo", cursorWrapper.GetDouble("importo"));
                        map.Put("datam", cursorWrapper.GetString("datam"));
                        map.Put("datam2", cursorWrapper.GetString("datam2"));
                        map.Put("datam3", cursorWrapper.GetString("datam3"));
                        map.Put("cliente", cursorWrapper.GetString("cliente"));
                        map.Put("codint", cursorWrapper.GetString("codint"));
                        map.Put("memo", cursorWrapper.GetString("memo"));
                        cassandraRisto.ital.main mainVar51 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
                        map.Put("scop", cursorWrapper.GetDouble("scop"));
                        map.Put("scov", cursorWrapper.GetDouble("scov"));
                        map.Put("ingredientisumf", java.lang.Integer.valueOf(cursorWrapper.GetInt("ingredientisumf")));
                        map.Put("ingredientisunf", java.lang.Integer.valueOf(cursorWrapper.GetInt("ingredientisunf")));
                        map.Put("stampaesclusiva", java.lang.Integer.valueOf(cursorWrapper.GetInt("stampaesclusiva")));
                        map.Put("stampante2", java.lang.Integer.valueOf(cursorWrapper.GetInt("stampante2")));
                        map.Put("uscita", java.lang.Integer.valueOf(cursorWrapper.GetInt("uscita")));
                        map.Put("TipoSconto", java.lang.Integer.valueOf(cursorWrapper.GetInt("TipoSconto")));
                        map.Put("flgNF", java.lang.Integer.valueOf(cursorWrapper.GetInt("flgNF")));
                        map.Put("nmov", cursorWrapper.GetLong("nmov"));
                        map.Put("nfat", java.lang.Integer.valueOf(cursorWrapper.GetInt("nfat")));
                        map.Put("nric", java.lang.Integer.valueOf(cursorWrapper.GetInt("nric")));
                        map.Put("totcre", cursorWrapper.GetString("totcre"));
                        if (z3 && map2.ContainsKey(cursorWrapper.GetString("nmov"))) {
                            list2.Add(map.getObject());
                        }
                    }
                    cassandraRisto.ital.dbutil dbutilVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), sql, "Venduto", list2);
                }
            }
            if (cursorWrapper.IsInitialized()) {
                cursorWrapper.Close();
            }
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper7 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar52 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper8 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper7, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("SELECT * FROM CausaliPagamenti where sospeso =0 order by chiave"));
            cursorWrapper8.setPosition(0);
            list.Initialize();
            list2.Initialize();
            if (cursorWrapper8.getRowCount() > 0) {
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper9 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar53 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper10 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper9, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select cassa from pagamenti order by codice"));
                int rowCount4 = cursorWrapper8.getRowCount() - 1;
                for (int i4 = 0; i4 <= rowCount4; i4++) {
                    cursorWrapper8.setPosition(i4);
                    map.Initialize();
                    map.Put("nmov", cursorWrapper8.GetLong("nmov"));
                    map.Put("codice", cursorWrapper8.GetString("codice"));
                    map.Put("descrizione", cursorWrapper8.GetString("descrizione"));
                    map.Put("qta", cursorWrapper8.GetDouble("qta"));
                    map.Put("datam", cursorWrapper8.GetString("datam"));
                    map.Put("datam3", cursorWrapper8.GetString("datam3"));
                    map.Put("importo", cursorWrapper8.GetDouble("importo"));
                    if (z3 && map2.ContainsKey(cursorWrapper8.GetString("nmov"))) {
                        list2.Add(map.getObject());
                    }
                    try {
                        if (cursorWrapper8.GetInt("codice") > 0) {
                            cursorWrapper10.setPosition(cursorWrapper8.GetInt("codice"));
                            map.Put("NonRiscosso", java.lang.Boolean.valueOf(cursorWrapper10.GetInt("cassa") == 1));
                        }
                    } catch (java.lang.Exception e4) {
                        this.ba.setLastException(e4);
                        anywheresoftware.b4a.keywords.Common common47 = this.__c;
                        anywheresoftware.b4a.keywords.Common common48 = this.__c;
                        anywheresoftware.b4a.keywords.Common.LogImpl("4131072365", anywheresoftware.b4a.BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(getActivityBA())), 0);
                    }
                    anywheresoftware.b4a.keywords.Common common49 = this.__c;
                    cassandraRisto.ital.main mainVar54 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_azzeradati)) {
                        cassandraRisto.ital.main mainVar55 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_azzeradati) {
                            cassandraRisto.ital.main mainVar56 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("SELECT count(*) FROM Venduto inner join reparti on venduto.reparto = reparti.codice where not(venduto.flgnf=1 AND venduto.sospeso=0 AND reparti.NF=0) and sospeso =0 and venduto.nmov = " + anywheresoftware.b4a.BA.NumberToString(cursorWrapper8.GetLong("nmov")))) <= 0.0d) {
                            }
                        }
                    }
                    list.Add(map.getObject());
                }
                anywheresoftware.b4a.keywords.Common common50 = this.__c;
                if (z3) {
                    cassandraRisto.ital.main mainVar57 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_nodatiperiodo) {
                        z4 = true;
                        if (anywheresoftware.b4a.keywords.Common.Not(z4)) {
                            anywheresoftware.b4a.keywords.Common common51 = this.__c;
                            cassandraRisto.ital.dbutil dbutilVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            anywheresoftware.b4a.BA activityBA6 = getActivityBA();
                            cassandraRisto.ital.main mainVar58 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(activityBA6, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "CausaliPagamenti", list))) {
                                anywheresoftware.b4a.keywords.Common common52 = this.__c;
                                java.lang.StringBuilder append9 = new java.lang.StringBuilder().append("Si sono verificati problemi durante la Chiusura Giornaliera.");
                                anywheresoftware.b4a.keywords.Common common53 = this.__c;
                                java.lang.CharSequence ObjectToCharSequence10 = anywheresoftware.b4a.BA.ObjectToCharSequence(append9.append("\n").append("CHIAMARE ASSISTENZA TECNICA").toString());
                                cassandraRisto.ital.main mainVar59 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.CharSequence ObjectToCharSequence11 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                cassandraRisto.ital.main mainVar60 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence10, ObjectToCharSequence11, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                                return 2;
                            }
                        }
                        if (z3) {
                            cassandraRisto.ital.dbutil dbutilVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(getActivityBA(), sql, "CausaliPagamenti", list2);
                        }
                        cursorWrapper10.Close();
                    }
                }
                z4 = false;
                if (anywheresoftware.b4a.keywords.Common.Not(z4)) {
                }
                if (z3) {
                }
                cursorWrapper10.Close();
            }
            if (cursorWrapper8.IsInitialized()) {
                cursorWrapper8.Close();
            }
            if (z2) {
                cassandraRisto.ital.main mainVar61 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from venduto where sospeso=0");
                cassandraRisto.ital.main mainVar62 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where sospeso=0 ");
                cassandraRisto.ital.main mainVar63 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from CausaliPagamenti  where sospeso=0 ");
            } else {
                cassandraRisto.ital.main mainVar64 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from Despagine where noazzera =1").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                    cassandraRisto.ital.main mainVar65 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from tavoli where manuallock =1 ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                        cassandraRisto.ital.main mainVar66 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from Venduto");
                        cassandraRisto.ital.main mainVar67 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov");
                        cassandraRisto.ital.main mainVar68 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        java.lang.StringBuilder append10 = new java.lang.StringBuilder().append("update tavoli set copertiWeb=0,tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,memo='',unlocktable=0,timelast ='");
                        cassandraRisto.ital.mod1 mod1Var7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA activityBA7 = getActivityBA();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        anywheresoftware.b4a.keywords.Common common54 = this.__c;
                        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.StringBuilder append11 = sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append(" ");
                        anywheresoftware.b4a.keywords.Common common55 = this.__c;
                        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        sql2.ExecNonQuery(append10.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(activityBA7, append11.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).toString())).append("'").toString());
                        cassandraRisto.ital.main mainVar69 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common common56 = this.__c;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
                        cassandraRisto.ital.main mainVar70 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_numerott > 0) {
                            cassandraRisto.ital.main mainVar71 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from Despagine where codice >=100 and noazzera=1")) > 0.0d) {
                                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper11 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                cassandraRisto.ital.main mainVar72 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper12 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper11, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select noazzera,aTavolo,daTavolo from Despagine where codice >=100"));
                                int rowCount5 = cursorWrapper12.getRowCount() - 1;
                                for (int i5 = 0; i5 <= rowCount5; i5++) {
                                    cursorWrapper12.setPosition(i5);
                                    if (cursorWrapper12.GetInt("noazzera") != 1) {
                                        cassandraRisto.ital.main mainVar73 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                        java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("update tavoli set uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,memo='',unlocktable=0,timelast ='");
                                        cassandraRisto.ital.mod1 mod1Var10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        anywheresoftware.b4a.BA activityBA8 = getActivityBA();
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        anywheresoftware.b4a.keywords.Common common57 = this.__c;
                                        anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                                        cassandraRisto.ital.mod1 mod1Var11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        java.lang.StringBuilder append13 = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append(" ");
                                        anywheresoftware.b4a.keywords.Common common58 = this.__c;
                                        anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                                        cassandraRisto.ital.mod1 mod1Var12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        sql3.ExecNonQuery(append12.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(activityBA8, append13.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).toString())).append("' where tavolo >=").append(cursorWrapper12.GetString("daTavolo")).append(" and tavolo <=").append(cursorWrapper12.GetString("aTavolo")).toString());
                                        cassandraRisto.ital.main mainVar74 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from venduto where (Select count(*) from headmov where sospeso=0 and  venduto.nmov = headmov.nmov AND headmov.tavolo >=" + cursorWrapper12.GetString("daTavolo") + " AND headmov.tavolo <=" + cursorWrapper12.GetString("aTavolo") + ")>0");
                                        cassandraRisto.ital.main mainVar75 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where sospeso=0 and  tavolo >=" + cursorWrapper12.GetString("daTavolo") + " and tavolo <=" + cursorWrapper12.GetString("aTavolo"));
                                    }
                                }
                                cursorWrapper12.Close();
                            } else {
                                cassandraRisto.ital.main mainVar76 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.sql.SQL sql4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                java.lang.StringBuilder append14 = new java.lang.StringBuilder().append("update tavoli set uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,memo='',unlocktable=0,timelast ='");
                                cassandraRisto.ital.mod1 mod1Var13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.BA activityBA9 = getActivityBA();
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                anywheresoftware.b4a.keywords.Common common59 = this.__c;
                                anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
                                cassandraRisto.ital.mod1 mod1Var14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                java.lang.StringBuilder append15 = sb3.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append(" ");
                                anywheresoftware.b4a.keywords.Common common60 = this.__c;
                                anywheresoftware.b4a.keywords.DateTime dateTime6 = anywheresoftware.b4a.keywords.Common.DateTime;
                                cassandraRisto.ital.mod1 mod1Var15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                sql4.ExecNonQuery(append14.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(activityBA9, append15.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).toString())).append("' where tavolo >=20000").toString());
                                cassandraRisto.ital.main mainVar77 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from venduto where (Select count(*) from headmov where sospeso=0 and  venduto.nmov = headmov.nmov AND headmov.tavolo >=20000)>0");
                                cassandraRisto.ital.main mainVar78 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where sospeso=0 and  headmov.tavolo >=20000");
                            }
                        }
                        cassandraRisto.ital.main mainVar79 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from CausaliPagamenti");
                    }
                }
                cassandraRisto.ital.main mainVar80 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where sospeso=1 And (Select count(*) from tavoli where tavoli.rifheadmov = headmov.nmov )=0");
                cassandraRisto.ital.main mainVar81 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from venduto where (Select count(*) from headmov where venduto.nmov = headmov.nmov AND headmov.tavolo =0)>0 or (Select count(*) from headmov where venduto.nmov = headmov.nmov)=0");
                cassandraRisto.ital.main mainVar82 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where headmov.tavolo =0");
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper13 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar83 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper14 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper13, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select tavolo,rifheadmov,manuallock from tavoli"));
                cassandraRisto.ital.main mainVar84 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                boolean z12 = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from Despagine where chiedimemo2=2")) > 0.0d;
                if (cursorWrapper14.getRowCount() > 0) {
                    int rowCount6 = cursorWrapper14.getRowCount() - 1;
                    for (int i6 = 0; i6 <= rowCount6; i6++) {
                        cursorWrapper14.setPosition(i6);
                        cassandraRisto.ital.main mainVar85 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        boolean z13 = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult(new java.lang.StringBuilder().append("Select count(*) from pagine inner join Despagine on pagine.pagina = Despagine.codice where Despagine.noazzera=0 AND tipo =9 AND valore =").append(cursorWrapper14.GetString("tavolo")).toString())) > 0.0d;
                        java.lang.String str3 = ",memo=''";
                        if (z12) {
                            cassandraRisto.ital.main mainVar86 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from pagine inner join Despagine on pagine.pagina = Despagine.codice where Despagine.chiedimemo2=2 AND tipo =9 AND valore =" + cursorWrapper14.GetString("tavolo"))) > 0.0d) {
                                str3 = "";
                            }
                        }
                        if (!cursorWrapper14.GetString("rifheadmov").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                            cassandraRisto.ital.main mainVar87 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from headmov where sospeso=0 and headmov.tavolo =" + cursorWrapper14.GetString("tavolo"))) <= 0.0d) {
                            }
                        }
                        cassandraRisto.ital.main mainVar88 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from venduto where (Select count(*) from headmov where sospeso=0 and  venduto.nmov = headmov.nmov AND headmov.tavolo =" + cursorWrapper14.GetString("tavolo") + ")>0");
                        cassandraRisto.ital.main mainVar89 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where sospeso=0 and  headmov.tavolo =" + cursorWrapper14.GetString("tavolo"));
                        if (cursorWrapper14.GetString("manuallock").equals(anywheresoftware.b4a.BA.NumberToString(0)) && (cursorWrapper14.GetString("rifheadmov").equals(anywheresoftware.b4a.BA.NumberToString(0)) || z13)) {
                            cassandraRisto.ital.main mainVar90 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql5 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append16 = new java.lang.StringBuilder().append("update tavoli set copertiWeb=0,tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0").append(str3).append(",unlocktable=0,timelast ='");
                            cassandraRisto.ital.mod1 mod1Var16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA activityBA10 = getActivityBA();
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.Common common61 = this.__c;
                            anywheresoftware.b4a.keywords.DateTime dateTime7 = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.mod1 mod1Var17 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append17 = sb4.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append(" ");
                            anywheresoftware.b4a.keywords.Common common62 = this.__c;
                            anywheresoftware.b4a.keywords.DateTime dateTime8 = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.mod1 mod1Var18 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            sql5.ExecNonQuery(append16.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(activityBA10, append17.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).toString())).append("' where tavolo =").append(cursorWrapper14.GetString("tavolo")).toString());
                        }
                        if (i6 % 30 == 0) {
                            anywheresoftware.b4a.keywords.Common common63 = this.__c;
                            anywheresoftware.b4a.keywords.Common.DoEvents();
                        }
                    }
                }
                cursorWrapper14.Close();
                cassandraRisto.ital.main mainVar702 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_numerott > 0) {
                }
                cassandraRisto.ital.main mainVar792 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from CausaliPagamenti");
            }
            cassandraRisto.ital.main mainVar91 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from Cassetto");
            cassandraRisto.ital.main mainVar92 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_fondocassaauto > 0) {
                cassandraRisto.ital.main mainVar93 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql6 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append18 = new java.lang.StringBuilder().append("\n\t\t\t\t\t\t\t\t\t\t\t\tINSERT INTO [Cassetto]\n\t\t\t\t\t\t\t\t\t\t\t\t\t([Operatore]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[TipoAttivita]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[Importo]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[DataOra]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[TipoMoneta]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[Qta]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[PrezzoUnitario]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[NumDistinta]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[Cassa]\n\t\t\t\t\t\t\t\t\t\t\t\t\t,[memo])\n\t\t\t\t\t\t\t\t\t\t\t\tVALUES\n\t\t\t\t\t\t\t\t\t\t\t\t\t(");
                anywheresoftware.b4a.keywords.Common common64 = this.__c;
                cassandraRisto.ital.main mainVar94 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.StringBuilder append19 = append18.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(cassandraRisto.ital.main._operatore))).append("\n\t\t,'F'\n\t\t\t\t\t\t\t\t\t\t\t\t\t,");
                anywheresoftware.b4a.keywords.Common common65 = this.__c;
                cassandraRisto.ital.main mainVar95 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.StringBuilder append20 = append19.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(cassandraRisto.ital.main._v_fondocassaauto))).append("\n\t\t,'");
                anywheresoftware.b4a.keywords.Common common66 = this.__c;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common67 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime9 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var19 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append21 = sb5.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).append(" ");
                anywheresoftware.b4a.keywords.Common common68 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime10 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var20 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append22 = append20.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", append21.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()))).toString())).append("'\n\t\t\t\t\t\t\t\t\t\t\t\t\t,0\n\t\t\t\t\t\t\t\t\t\t\t\t\t,1\n\t\t\t\t\t\t\t\t\t\t\t\t\t,");
                anywheresoftware.b4a.keywords.Common common69 = this.__c;
                cassandraRisto.ital.main mainVar96 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.StringBuilder append23 = append22.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(cassandraRisto.ital.main._v_fondocassaauto))).append("\n\t\t\t\t\t\t\t\t\t\t\t\t\t,1\n\t\t\t\t\t\t\t\t\t\t\t\t\t,");
                anywheresoftware.b4a.keywords.Common common70 = this.__c;
                cassandraRisto.ital.main mainVar97 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                sql6.ExecNonQuery(append23.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cassandraRisto.ital.main._v_numcassa)).append("\n\t\t,'Versamento automatico')").toString());
            }
            cassandraRisto.ital.main mainVar98 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from daStampare");
            cassandraRisto.ital.main mainVar99 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from StampaCP");
            cassandraRisto.ital.main mainVar100 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from tmpStampa");
            cassandraRisto.ital.main mainVar101 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from HeaddaStampare");
            cassandraRisto.ital.main mainVar102 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from telefonate");
            cassandraRisto.ital.main mainVar103 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from ExportFattureHead");
            cassandraRisto.ital.main mainVar104 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from ExportFattureDett");
            b4a.example.dateutils._period _periodVar = new b4a.example.dateutils._period();
            _periodVar.Days = -1;
            b4a.example.dateutils dateutilsVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
            anywheresoftware.b4a.BA activityBA11 = getActivityBA();
            cassandraRisto.ital.mod1 mod1Var21 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            long _addperiod = b4a.example.dateutils._addperiod(activityBA11, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA()), _periodVar);
            cassandraRisto.ital.main mainVar105 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append24 = new java.lang.StringBuilder().append("delete from Prenota where data < '");
            anywheresoftware.b4a.keywords.Common common71 = this.__c;
            anywheresoftware.b4a.keywords.Common common72 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime11 = anywheresoftware.b4a.keywords.Common.DateTime;
            double GetYear = anywheresoftware.b4a.keywords.DateTime.GetYear(_addperiod);
            anywheresoftware.b4a.keywords.Common common73 = this.__c;
            java.lang.StringBuilder append25 = append24.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(GetYear, 2, 0, 0, false)).append("-");
            anywheresoftware.b4a.keywords.Common common74 = this.__c;
            anywheresoftware.b4a.keywords.Common common75 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime12 = anywheresoftware.b4a.keywords.Common.DateTime;
            double GetMonth = anywheresoftware.b4a.keywords.DateTime.GetMonth(_addperiod);
            anywheresoftware.b4a.keywords.Common common76 = this.__c;
            java.lang.StringBuilder append26 = append25.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(GetMonth, 2, 0, 0, false)).append("-");
            anywheresoftware.b4a.keywords.Common common77 = this.__c;
            anywheresoftware.b4a.keywords.Common common78 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime13 = anywheresoftware.b4a.keywords.Common.DateTime;
            double GetDayOfMonth = anywheresoftware.b4a.keywords.DateTime.GetDayOfMonth(_addperiod);
            anywheresoftware.b4a.keywords.Common common79 = this.__c;
            sql7.ExecNonQuery(append26.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(GetDayOfMonth, 2, 0, 0, false)).append(" 00:00:00'").toString());
            cassandraRisto.ital.main mainVar106 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update confstampe set counter = 1");
            if (z3 && sql.IsInitialized()) {
                sql.Close();
            }
            cassandraRisto.ital.main mainVar107 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_azzeraasporto) {
                cassandraRisto.ital.main mainVar108 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update progressivi set valore = 0  where codice ='AS'");
            }
            anywheresoftware.b4a.keywords.Common common80 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            return 3;
        } catch (java.lang.Exception e5) {
            this.ba.setLastException(e5);
            cassandraRisto.ital.mod1 mod1Var22 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA12 = getActivityBA();
            anywheresoftware.b4a.keywords.Common common81 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA12, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
            anywheresoftware.b4a.keywords.Common common82 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            return 2;
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        try {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_attivaterminale) {
                anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                long _vvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA());
                anywheresoftware.b4a.keywords.Common common = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String str = "DaCasseFull" + cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(getActivityBA(), _vvvvvvvvvvvvv0 - (0 * 86400000)) + ".tmp";
                cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                long _vvvvvvvvvvvvv02 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA());
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String str2 = "DaCasse" + cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(getActivityBA(), _vvvvvvvvvvvvv02 - (10 * 86400000)) + ".tmp";
                list.Initialize();
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                list.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/Sent").toString()));
                int size = list.getSize() - 1;
                for (int i = 0; i <= size; i++) {
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(list.Get(i));
                    if (ObjectToString.startsWith("DaCasse") && ObjectToString.endsWith(".tmp") && ObjectToString.compareTo(str2) < 0) {
                        anywheresoftware.b4a.keywords.Common common4 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.objects.streams.File.Delete(sb2.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/Sent").toString(), ObjectToString);
                    }
                }
            }
            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                for (int i2 = 1; i2 <= 9; i2++) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    java.lang.String sb4 = sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/T").append(anywheresoftware.b4a.BA.NumberToString(i2)).append("/TAVOLI").toString();
                    cassandraRisto.ital.mod1 mod1Var6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvv2(getActivityBA(), sb4);
                }
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                anywheresoftware.b4a.BA ba = this.ba;
                cassandraRisto.ital.httpclient httpclientVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.httpclient.getObject(), "SendRichiestaVarClient");
                return "";
            }
            return "";
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
            return "";
        }
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        try {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) FROM Ventmp where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" + str2 + " and totcre ='" + str3 + "'")) > 0.0d) {
                if (str.equals("rileggi")) {
                    cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    str = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select qta from Ventmp where  chiave =" + str2);
                }
                java.lang.String replace = str.replace(",", ".");
                cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update Ventmp set QTA = " + replace + ",importo = prezzov * " + replace + " where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" + str2 + " and totcre ='" + str3 + "'");
                cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update Ventmp set importo2 = (select case when sum(importo) is null then 0 else sum(importo) end from Ventmp where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" + str2 + " and totcre ='" + str3 + "') where chiave =" + str2);
                anywheresoftware.b4a.keywords.Common common = this.__c;
                return true;
            }
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        return false;
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(boolean z) throws java.lang.Exception {
        if (z) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            int Rnd = anywheresoftware.b4a.keywords.Common.Rnd(1, 3);
            for (int i = 1; i <= Rnd; i++) {
                anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
                cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                long _vvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(getActivityBA());
                anywheresoftware.b4a.keywords.Common common2 = this.__c;
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                java.lang.String sb2 = sb.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/LOG").toString();
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                textWriterWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(sb2, "CEFDLL_ERR.txt", true).getObject());
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append = sb3.append(anywheresoftware.b4a.keywords.DateTime.Date(_vvvvvvvvvvvvv0)).append(" ");
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.DateTime.Time(_vvvvvvvvvvvvv0));
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                java.lang.StringBuilder append3 = append2.append("\t").append("java.lang.StringIndexOutOfBoundsException: length=0; regionStart=0; regionLength=1");
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                java.lang.StringBuilder append4 = append3.append("\t");
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                textWriterWrapper.WriteLine(append4.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString());
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append5 = sb4.append(anywheresoftware.b4a.keywords.DateTime.Date(_vvvvvvvvvvvvv0)).append(" ");
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.keywords.DateTime.Time(_vvvvvvvvvvvvv0));
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                java.lang.StringBuilder append7 = append6.append("\t").append("java.net.SocketTimeoutException");
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                java.lang.StringBuilder append8 = append7.append("\t");
                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                textWriterWrapper.WriteLine(append8.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString());
                textWriterWrapper.Close();
                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                java.lang.StringBuilder append9 = new java.lang.StringBuilder().append("Stampante non pronta...");
                anywheresoftware.b4a.keywords.Common common14 = this.__c;
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(append9.append("\n").append("Premere 'Riprova' per ritentare la chisura").toString());
                cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Riprova", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA activityBA = getActivityBA();
                anywheresoftware.b4a.keywords.Common common15 = this.__c;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(activityBA, anywheresoftware.b4a.keywords.Common.Rnd(500, 2000));
                anywheresoftware.b4a.keywords.Common common16 = this.__c;
                anywheresoftware.b4a.keywords.Common.DoEvents();
                anywheresoftware.b4a.keywords.Common common17 = this.__c;
                anywheresoftware.b4a.keywords.Common.DoEvents();
            }
            anywheresoftware.b4a.keywords.Common common18 = this.__c;
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            return "";
        }
        return "";
    }

    public double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int i, double d) throws java.lang.Exception {
        int i2;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int Round2 = (int) anywheresoftware.b4a.keywords.Common.Round2((d * 100.0d) % 10.0d, 2);
        boolean z = Round2 < 0;
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        int Abs = anywheresoftware.b4a.keywords.Common.Abs(Round2);
        switch (i) {
            case 1:
                if (Abs > 7) {
                    Abs = 10 - Abs;
                    break;
                } else if (Abs > 2) {
                    Abs = 5 - Abs;
                    break;
                } else {
                    Abs *= -1;
                    break;
                }
            case 2:
                if (Abs > 5) {
                    Abs -= 5;
                }
                Abs *= -1;
                break;
            case 3:
                if (Abs > 5) {
                    Abs = 10 - Abs;
                    break;
                } else {
                    Abs = 5 - Abs;
                    break;
                }
        }
        if (z) {
            i2 = Abs * (-1);
            if (i > 1 && i2 > 0) {
                i2 = (5 - i2) * (-1);
            } else if (i == 3) {
                i2 += 5;
            }
        } else {
            i2 = Abs;
        }
        return i2 / 100.0d;
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new cassandraRisto.ital.fileprovider();
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files/").append(str).toString(), "")) {
            new anywheresoftware.b4a.objects.collections.List().Initialize();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files/").append(str).toString());
            int size = ListFiles.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String sb4 = sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files/").append(str).toString();
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Copy(sb4, ObjectToString, sb5.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/").append(str).toString(), ObjectToString);
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.objects.streams.File.Delete(sb6.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files/").append(str).toString(), ObjectToString);
            }
            return "";
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files/").append(str).toString(), "")) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.MakeDir(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), str);
            new anywheresoftware.b4a.objects.collections.List().Initialize();
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files/").append(str).toString());
            int size = ListFiles.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
                if (ObjectToString.contains(".")) {
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    java.lang.String sb4 = sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files/").append(str).toString();
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(sb4, ObjectToString, sb5.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/").append(str).toString(), ObjectToString);
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb6.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files/").append(str).toString(), ObjectToString);
                }
            }
            return "";
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws java.lang.Exception {
        for (int i = 1; i <= 19; i++) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i));
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i) + "/TMP");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i) + "/Tavoli");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.mod1._vvvvv1, "T" + anywheresoftware.b4a.BA.NumberToString(i));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.MakeDir(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/T").append(anywheresoftware.b4a.BA.NumberToString(i)).toString(), "OLD");
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.MakeDir(sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/T").append(anywheresoftware.b4a.BA.NumberToString(i)).toString(), "TAVOLI");
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i + 10000));
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i + 10000) + "/TMP");
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i + 10000) + "/VENDUTO");
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i + 10000) + "/VENDUTO/IMG");
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i + 10000) + "/VENDUTO/LISTA");
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            anywheresoftware.b4a.objects.streams.File file12 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i + 10000) + "/ImgPalm");
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            anywheresoftware.b4a.objects.streams.File file13 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.NumberToString(i + 10000) + "/ImgPalm/Send");
        }
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(int i, double d, java.lang.String str, double d2, java.lang.String str2) throws java.lang.Exception {
        double d3 = 0.0d;
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("Select count(*) from Ventmp where memo ='");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("' and iva=");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        if (java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(i))).append("").toString())) > 0.0d) {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("Select sum(importo) from Ventmp where memo ='");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("' and iva=");
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            d3 = anywheresoftware.b4a.keywords.Common.Abs(java.lang.Double.parseDouble(sql2.ExecQuerySingleResult(append4.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(i))).append("").toString())));
            d += d3;
        }
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        double Round2 = anywheresoftware.b4a.keywords.Common.Round2(d, 2);
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        if (Round2 <= anywheresoftware.b4a.keywords.Common.Round2(d2, 2)) {
            return "";
        }
        java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("Non è possibile rendere questo articolo perchè supera il totale iva del DCV originale (massimo importo per iva ").append(str2).append("% : ");
        anywheresoftware.b4a.keywords.Common common8 = this.__c;
        anywheresoftware.b4a.keywords.Common common9 = this.__c;
        return append5.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(d2 - d3, 1, 2, 2, false)).append("€ )").toString();
    }

    public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper b4XBitmapWrapper, float f) throws java.lang.Exception {
        anywheresoftware.b4a.objects.B4XViewWrapper.XUI xui = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        int DipToCurrent = anywheresoftware.b4a.keywords.Common.DipToCurrent(1);
        anywheresoftware.b4a.objects.B4XCanvas b4XCanvas = new anywheresoftware.b4a.objects.B4XCanvas();
        new anywheresoftware.b4a.objects.B4XViewWrapper();
        anywheresoftware.b4a.objects.B4XViewWrapper.XUI xui2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.objects.B4XViewWrapper CreatePanel = anywheresoftware.b4a.objects.B4XViewWrapper.XUI.CreatePanel(this.ba, "");
        CreatePanel.SetLayoutAnimated(0, 0, 0, (int) b4XBitmapWrapper.getWidth(), (int) b4XBitmapWrapper.getHeight());
        b4XCanvas.Initialize(CreatePanel);
        anywheresoftware.b4a.objects.B4XCanvas.B4XPath b4XPath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
        b4XPath.InitializeRoundedRect(b4XCanvas.getTargetRect(), f);
        b4XCanvas.ClipPath(b4XPath);
        anywheresoftware.b4a.objects.B4XCanvas.B4XRect targetRect = b4XCanvas.getTargetRect();
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        b4XCanvas.DrawRect(targetRect, -16777216, true, DipToCurrent);
        b4XCanvas.RemoveClip();
        anywheresoftware.b4a.objects.B4XCanvas.B4XRect b4XRect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
        b4XRect.Initialize(DipToCurrent, DipToCurrent, b4XCanvas.getTargetRect().getWidth() - DipToCurrent, b4XCanvas.getTargetRect().getHeight() - DipToCurrent);
        b4XPath.InitializeRoundedRect(b4XRect, (float) (f - (0.7d * DipToCurrent)));
        b4XCanvas.ClipPath(b4XPath);
        b4XCanvas.DrawBitmap(b4XBitmapWrapper.getObject(), b4XRect);
        b4XCanvas.RemoveClip();
        b4XCanvas.Invalidate();
        new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
        anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper CreateBitmap = b4XCanvas.CreateBitmap();
        b4XCanvas.Release();
        return CreateBitmap;
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str) throws java.lang.Exception {
        try {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery(str);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            return true;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            return false;
        }
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str, anywheresoftware.b4a.sql.SQL sql) throws java.lang.Exception {
        try {
            sql.ExecNonQuery(str);
            anywheresoftware.b4a.keywords.Common common = this.__c;
            return true;
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            return false;
        }
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str) throws java.lang.Exception {
        try {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery(str);
            return "";
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            return "";
        }
    }

    public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        java.lang.String replace = str.replace("/", "");
        java.lang.String str4 = replace.substring(0, 4) + replace.substring(6);
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("");
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str.substring(3, 5))).append("/");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str.substring(0, 2))).append("/");
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        java.lang.String sb = append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str.substring(6, 10))).append("").toString();
        java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Select count(*) from headmov where matricolacassap='");
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append5 = append4.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4)).append("' and substr(dataeoraffm,1,10)='");
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", sb)).append("' and nChiusura = ");
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        cassandraRisto.ital.modfunstr modfunstrVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        java.lang.StringBuilder append7 = append6.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Double.valueOf(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(getActivityBA(), str2)))).append(" and nscontrinoffm=");
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        cassandraRisto.ital.modfunstr modfunstrVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        java.lang.String sb2 = append7.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Double.valueOf(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(getActivityBA(), str3)))).append("").toString();
        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult(sb2)) > 0.0d) {
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            list.Add(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult(sb2.replace("count(*)", "nmov")));
            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            list.Add(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
        } else {
            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult(sb2)) > 0.0d) {
                cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                list.Add(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult(sb2.replace("count(*)", "nmov")));
                cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                list.Add(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
            }
        }
        return list;
    }

    public long _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str) throws java.lang.Exception {
        java.lang.String replace = str.replace(" ", "").replace("-", "").replace(":", "");
        b4a.example.dateutils dateutilsVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        return b4a.example.dateutils._setdateandtime(getActivityBA(), (int) java.lang.Double.parseDouble(replace.substring(0, 4)), (int) java.lang.Double.parseDouble(replace.substring(4, 6)), (int) java.lang.Double.parseDouble(replace.substring(6, 8)), (int) java.lang.Double.parseDouble(replace.substring(8, 10)), (int) java.lang.Double.parseDouble(replace.substring(10, 12)), (int) java.lang.Double.parseDouble(replace.substring(12, 14)));
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(int i, int i2) throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (i == cassandraRisto.ital.main._t_funzione) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar17 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar18 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar19 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar20 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar21 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar22 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar23 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar24 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar25 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar26 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar27 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar28 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar29 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar30 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar31 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar32 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar33 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar34 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar35 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar36 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar37 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar38 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar39 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar40 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar41 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar42 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar43 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar44 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar45 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar46 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar47 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar48 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar49 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar50 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar51 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar52 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar53 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar54 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar55 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar56 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar57 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar58 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar59 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar60 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar61 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar62 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar63 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar64 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar65 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main mainVar66 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            switch (anywheresoftware.b4a.BA.switchObjectToInt(valueOf, java.lang.Integer.valueOf(cassandraRisto.ital.main._f_abbuono), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_apricassetto), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_cancellatutto), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_sospendi), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_recallsospendi), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_operatore), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_scontrinoparlante), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_stampaoggi), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_letturadgfe), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ricercacliente), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_scontototale), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ricercaarticoli), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_reso), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_fattura), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_conto), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_stampaparziale), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_variaprezzo), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_recallmov), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ricarica), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_premio), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ricercabarcode), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_listino), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_scontrinolotteria), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_dividiconto), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_contoromana), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_segue), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_avantiturno), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_dividiconto), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_contoromana), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ritirovincita), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ricevuta), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_elencotelefonate), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_messaggio), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_tallon), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_nocomande), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ristampaveloce), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_menu), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_modificatore), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ristampacomanda), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_gruppo), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_maggiorazione), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_noservizio), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_infomovimento), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_modoperatore), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_noarticoliazero), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_bloccaarticolo), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_stampatutto), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_spostasutavolo), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_showsospesiasporto), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_shell), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_sospendiprenota), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_recallsospendiprenota), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_visualizzapwdweb), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_terminalino), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_allergeni), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_menucashology), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_risorsebalneari), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_sottoconto), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_vedisottoconti), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ricercatabacchi), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_ricercatavoli), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_verificainviofe), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_macro), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_annullart), java.lang.Integer.valueOf(cassandraRisto.ital.main._f_menuesercentert))) {
                case 0:
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("La funzione 'Abbuono' consente di effettuare uno sconto a valore sul totale. ");
                    anywheresoftware.b4a.keywords.Common common = this.__c;
                    java.lang.StringBuilder append2 = append.append("\n").append("Per utilizzare la funzione è necessario digitare l'importo poi premere il tasto Abbuono. ");
                    anywheresoftware.b4a.keywords.Common common2 = this.__c;
                    java.lang.StringBuilder append3 = append2.append("\n").append("L'importo scontato non viene ventilato sulle singole righe. ");
                    anywheresoftware.b4a.keywords.Common common3 = this.__c;
                    return append3.append("\n").append("E' possibile modificare iva ,reparto e descrizione del comando entrando in 'Configurazione Plu' (cercare il codice'abb')Questo comando puo essere inibito all'operatore entrando in 'Configura Operatori' ").toString();
                case 1:
                    java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Viene inviato il comando di apertura cassetto al ");
                    cassandraRisto.ital.main mainVar67 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.StringBuilder append5 = append4.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(". ");
                    anywheresoftware.b4a.keywords.Common common4 = this.__c;
                    return append5.append("\n").append("Questo comando puo essere inibito all'operatore entrando in 'Configura Operatori' ").toString();
                case 2:
                    java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("Consente la cancellazione di tutti gli articoli presenti nella griglia. ");
                    anywheresoftware.b4a.keywords.Common common5 = this.__c;
                    java.lang.StringBuilder append7 = append6.append("\n").append("Se il comando viene eseguito all'interno di un richiamo movimento viene eliminato anche il movimento salvato in precedenza. ");
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    return append7.append("\n").append("Questo comando puo essere inibito all'operatore entrando in 'Configura Operatori' ").toString();
                case 3:
                    java.lang.StringBuilder append8 = new java.lang.StringBuilder().append("Consente la sospensione dello stato attuale del programma (movimento ,listino,cliente ecc..)  ");
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    java.lang.StringBuilder append9 = append8.append("\n").append("per poi poterlo richiamare successivamente tramite il tasto 'Richiama Scontrino' ");
                    anywheresoftware.b4a.keywords.Common common8 = this.__c;
                    java.lang.StringBuilder append10 = append9.append("\n").append("Per sospendere è necessario inserire almento una riga. ");
                    anywheresoftware.b4a.keywords.Common common9 = this.__c;
                    java.lang.StringBuilder append11 = append10.append("\n").append("Non è possibile sospendere se si sta richiamando un movimento. ");
                    anywheresoftware.b4a.keywords.Common common10 = this.__c;
                    java.lang.StringBuilder append12 = append11.append("\n").append("E' possibile sospendere più volte lo stesso movimento applicando modifiche. ");
                    anywheresoftware.b4a.keywords.Common common11 = this.__c;
                    java.lang.StringBuilder append13 = append12.append("\n").append("La sospensione non genera nessun tipo di documento. ");
                    anywheresoftware.b4a.keywords.Common common12 = this.__c;
                    java.lang.StringBuilder append14 = append13.append("\n").append("Tutti i sospesi non richiamati vengono eliminati con la Chiusura Giornaliera. ");
                    anywheresoftware.b4a.keywords.Common common13 = this.__c;
                    return append14.append("\n").append("Questo comando puo essere inibito all'operatore entrando in 'Configura Operatori' ").toString();
                case 4:
                    java.lang.StringBuilder append15 = new java.lang.StringBuilder().append("Consente di richiamare i movimenti sospesi in precedenza(e relativo stato del programma al momento della sospensione). ");
                    anywheresoftware.b4a.keywords.Common common14 = this.__c;
                    java.lang.StringBuilder append16 = append15.append("\n").append("Non è possibile utilizzare questo comando se ci sono articoli selezionati.  ");
                    anywheresoftware.b4a.keywords.Common common15 = this.__c;
                    java.lang.StringBuilder append17 = append16.append("\n").append("Le modalità di richiamo possono essere 2:  ");
                    anywheresoftware.b4a.keywords.Common common16 = this.__c;
                    java.lang.StringBuilder append18 = append17.append("\n").append("1)Digitare il numero del movimento e poi premere il tasto 'Richiama Scontrino' (l'utente deve conoscere il numero da richiamare) ");
                    anywheresoftware.b4a.keywords.Common common17 = this.__c;
                    java.lang.StringBuilder append19 = append18.append("\n").append("2)Premere il tasto 'Richiama Scontrino' quindi selezionare dall'elenco il movimento desiderato. ");
                    anywheresoftware.b4a.keywords.Common common18 = this.__c;
                    java.lang.StringBuilder append20 = append19.append("\n").append("Una volta che il sospeso è stato recuperato è possibile annullare la procedura di richiamo premendo nuovamente il tasto 'Richiama Scontrino' (nessun dato verrà modificato).");
                    anywheresoftware.b4a.keywords.Common common19 = this.__c;
                    java.lang.StringBuilder append21 = append20.append("\n").append("Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common20 = this.__c;
                    return append21.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 5:
                    java.lang.StringBuilder append22 = new java.lang.StringBuilder().append("Consente di richiamare cambiare l'operatore attivo . ");
                    anywheresoftware.b4a.keywords.Common common21 = this.__c;
                    java.lang.StringBuilder append23 = append22.append("\n").append("Attraverso la 'Configurazione Operatori' si possono inibire funzionalità all'operatore.");
                    anywheresoftware.b4a.keywords.Common common22 = this.__c;
                    java.lang.StringBuilder append24 = append23.append("\n").append("Esiste la possibilità di verificare i movimenti effettuati attraverso le stampe giornaliere o periodiche ");
                    anywheresoftware.b4a.keywords.Common common23 = this.__c;
                    java.lang.StringBuilder append25 = append24.append("\n").append("Gli operatori disponibili sono 9 (con codice da 1 a 9) .");
                    anywheresoftware.b4a.keywords.Common common24 = this.__c;
                    return append25.append("\n").append("L'operatore 1 non ha password mentre per gli altri è necessario inserire un codice di 5 caratteri (configurabili).").toString();
                case 6:
                    java.lang.StringBuilder append26 = new java.lang.StringBuilder().append("Consente di inserire Partita Iva o il Codice Fiscale del cliente. ");
                    anywheresoftware.b4a.keywords.Common common25 = this.__c;
                    java.lang.StringBuilder append27 = append26.append("\n").append("Esiste una procedura di verifica della validità del codice inserito .");
                    anywheresoftware.b4a.keywords.Common common26 = this.__c;
                    java.lang.StringBuilder append28 = append27.append("\n").append("Nel caso in cui la  Partita Iva o il Codice Fiscale siano precedentemente inseriti all'interno della anagrafica cliente ,lo 'scontrino parlante' uscirà automaticamente.");
                    anywheresoftware.b4a.keywords.Common common27 = this.__c;
                    java.lang.StringBuilder append29 = append28.append("\n").append("Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common28 = this.__c;
                    return append29.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 7:
                    java.lang.StringBuilder append30 = new java.lang.StringBuilder().append("Offre una serie di report delle SOLE VENDITE fatte dopo l'ultima chiusura .");
                    anywheresoftware.b4a.keywords.Common common29 = this.__c;
                    java.lang.StringBuilder append31 = append30.append("\n").append("Questi report possono essere stampati su ");
                    cassandraRisto.ital.main mainVar68 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.StringBuilder append32 = append31.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" o inviati come posta elettronica.");
                    anywheresoftware.b4a.keywords.Common common30 = this.__c;
                    java.lang.StringBuilder append33 = append32.append("\n").append("Si possono applicare regole e filtri per ottenere i dati desiderati");
                    anywheresoftware.b4a.keywords.Common common31 = this.__c;
                    java.lang.StringBuilder append34 = append33.append("\n").append("Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common32 = this.__c;
                    return append34.append("\n").append("Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 8:
                    java.lang.StringBuilder append35 = new java.lang.StringBuilder().append("Consente di ristampare uno o più scontrini fiscali emessi in precedenza ,selezionando una delle opzioni proposte.");
                    anywheresoftware.b4a.keywords.Common common33 = this.__c;
                    java.lang.StringBuilder append36 = append35.append("\n").append("Questa funzione può essere utilizzata solo con cassa Fiscalizzata.");
                    anywheresoftware.b4a.keywords.Common common34 = this.__c;
                    java.lang.StringBuilder append37 = append36.append("\n").append("Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common35 = this.__c;
                    return append37.append("\n").append("Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 9:
                    java.lang.StringBuilder append38 = new java.lang.StringBuilder().append("I clienti possono essere richiamati in tre modalità differenti:");
                    anywheresoftware.b4a.keywords.Common common36 = this.__c;
                    java.lang.StringBuilder append39 = append38.append("\n").append("1)Digitare il codice del cliente quindi premere il tasto 'CLIENTE' ");
                    anywheresoftware.b4a.keywords.Common common37 = this.__c;
                    java.lang.StringBuilder append40 = append39.append("\n").append("2)Premere il tasto 'CLIENTE', cercare il cliente tramite i filtri disponibili, toccare poi il tasto con l'icona ingranaggio per effettuare la selezione. ");
                    anywheresoftware.b4a.keywords.Common common38 = this.__c;
                    java.lang.StringBuilder append41 = append40.append("\n").append("3)Utilizzare uno scanner per leggere una tessera con barcode che identifica il cliente; la codifica stampata sulla card dovrà iniziare con '111' e terminare con il codice cliente(es: con codice cliente =31 la tessera dovrà essere 1110031X dove X è il check digit).");
                    anywheresoftware.b4a.keywords.Common common39 = this.__c;
                    java.lang.StringBuilder append42 = append41.append("\n").append("E' possibile selezionare un cliente solo all'interno di un movimento di vendita. ");
                    anywheresoftware.b4a.keywords.Common common40 = this.__c;
                    java.lang.StringBuilder append43 = append42.append("\n").append("Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common41 = this.__c;
                    return append43.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 10:
                    java.lang.StringBuilder append44 = new java.lang.StringBuilder().append("Consente di effettuare uno sconto in percentuale degli articoli selezionati. ");
                    anywheresoftware.b4a.keywords.Common common42 = this.__c;
                    java.lang.StringBuilder append45 = append44.append("\n").append("A differenza dell'Abbuono ,lo sconto al Subtotale viene ventilato su ogni singola riga selezionata al momento (non per le successive)");
                    anywheresoftware.b4a.keywords.Common common43 = this.__c;
                    java.lang.StringBuilder append46 = append45.append("\n").append("Questo comportamento risulta essere diverso dallo sconto legato al cliente: in questo caso vengono scontati tutti gli articoli presenti nella transazione; 'Annullo cliente' storna lo sconto.  ");
                    anywheresoftware.b4a.keywords.Common common44 = this.__c;
                    java.lang.StringBuilder append47 = append46.append("\n").append("Per annullare un sconto è necessario premere il tasto 0 quindi 'Sconto Totale' ");
                    anywheresoftware.b4a.keywords.Common common45 = this.__c;
                    java.lang.StringBuilder append48 = append47.append("\n").append("Nel caso in cui esista solo uno sconto al Subtotale (nessuno sconto su riga), sullo scontrino fiscale verrà stampata una riga con la Somma riepilogativa di tutti gli sconti, diversamente viene stampata la ventilazione dello sconto a livello riga.  ");
                    anywheresoftware.b4a.keywords.Common common46 = this.__c;
                    return append48.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 11:
                    java.lang.StringBuilder append49 = new java.lang.StringBuilder().append("Gli articoli possono essere richiamati in 4 differenti modi:");
                    anywheresoftware.b4a.keywords.Common common47 = this.__c;
                    java.lang.StringBuilder append50 = append49.append("\n").append("1)Digitare il codice interno del PLU quindi premere il tasto 'Ricerca Articoli' ");
                    anywheresoftware.b4a.keywords.Common common48 = this.__c;
                    java.lang.StringBuilder append51 = append50.append("\n").append("2)Digitare l'eventuale codice a barre PLU quindi premere il tasto 'Ricerca Barcode' ");
                    anywheresoftware.b4a.keywords.Common common49 = this.__c;
                    java.lang.StringBuilder append52 = append51.append("\n").append("3)Premere il tasto 'Ricerca Articoli', cercare l'articolo tramite i filtri disponibili quindi toccare l tasto con l'ingranaggio per effettuare la selezione. ");
                    anywheresoftware.b4a.keywords.Common common50 = this.__c;
                    java.lang.StringBuilder append53 = append52.append("\n").append("4)Utilizzare lo scanner per leggere il barcode che identifica il prodotto (anche etichette a peso).");
                    anywheresoftware.b4a.keywords.Common common51 = this.__c;
                    java.lang.StringBuilder append54 = append53.append("\n").append("Il software consolida per Qtà in una singola riga l'ultimo articolo veduto ripetutamente");
                    anywheresoftware.b4a.keywords.Common common52 = this.__c;
                    return append54.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 12:
                    java.lang.StringBuilder append55 = new java.lang.StringBuilder().append("La procedura di reso consente di impostare la quantità dell'articolo in negativo.");
                    anywheresoftware.b4a.keywords.Common common53 = this.__c;
                    java.lang.StringBuilder append56 = append55.append("\n").append("Per eseguire un reso è necessario digitare la quantità, premere il tasto 'Reso' seguito dal PLU.");
                    anywheresoftware.b4a.keywords.Common common54 = this.__c;
                    return append56.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 13:
                    java.lang.StringBuilder append57 = new java.lang.StringBuilder().append("Consente la stampa di Fatture dirette dal ");
                    cassandraRisto.ital.main mainVar69 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.StringBuilder append58 = append57.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" o su stampante a4.");
                    anywheresoftware.b4a.keywords.Common common55 = this.__c;
                    java.lang.StringBuilder append59 = append58.append("\n").append("Per emettere una fattura premere il tasto 'Fattura' prima di chiudere la transazione con un pagamento idoneo.");
                    anywheresoftware.b4a.keywords.Common common56 = this.__c;
                    java.lang.StringBuilder append60 = append59.append("\n").append("La fattura può essere emessa solo all'interno di una transazione di vendita.");
                    anywheresoftware.b4a.keywords.Common common57 = this.__c;
                    java.lang.StringBuilder append61 = append60.append("\n").append("Se precedentemente la stampa è stato selezionato un cliente il documento verrà intestato automaticamente. In caso contrario lo spazio destinato all'intestazione verrà lasciato vuoto.");
                    anywheresoftware.b4a.keywords.Common common58 = this.__c;
                    java.lang.StringBuilder append62 = append61.append("\n").append("Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common59 = this.__c;
                    return append62.append("\n").append("Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 14:
                    java.lang.StringBuilder append63 = new java.lang.StringBuilder().append("Il movimento viene chiuso come 'Riepilogo' e viene stampato un tallon sul ");
                    cassandraRisto.ital.main mainVar70 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.StringBuilder append64 = append63.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(".");
                    anywheresoftware.b4a.keywords.Common common60 = this.__c;
                    java.lang.StringBuilder append65 = append64.append("\n").append("E' possibile effettuare il calcolo del resto digitando l'importo prima di premere il tasto 'Conto'.");
                    anywheresoftware.b4a.keywords.Common common61 = this.__c;
                    java.lang.StringBuilder append66 = append65.append("\n").append("Non può essere utilizzato in movimenti diversi dalla vendita, all'interno della procedura di 'Richiama Movimento' o 'Richiama Scontrino'.");
                    anywheresoftware.b4a.keywords.Common common62 = this.__c;
                    return append66.append("\n").append("Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 15:
                    java.lang.StringBuilder append67 = new java.lang.StringBuilder().append("Consente la stampa di un tallon riepilogativo del movimento in corso, senza cancellare la transazione.");
                    anywheresoftware.b4a.keywords.Common common63 = this.__c;
                    java.lang.StringBuilder append68 = append67.append("\n").append("Dopo l'uscita della stampa di riepilogo è possibile proseguire nell'inserimento di nuovi articoli. ");
                    anywheresoftware.b4a.keywords.Common common64 = this.__c;
                    return append68.append("\n").append("Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 16:
                    return " Consente la modifica del Prezzo di vendita di un singolo articolo presente in tastiera o prima che sia scannerizzato, selezionare la funzione ( un avviso a video avvisa che la funzione è attivata) digitare l’importo e selezionare l’articolo in tastiera o scannerizzare.\n\t\t\t\tQuesto comando può essere inibito all'operatore dal menu 'Configura Operatori'";
                case 17:
                    java.lang.StringBuilder append69 = new java.lang.StringBuilder().append("Consente di richiamare i movimenti (NON SOSPESI) elaborati in precedenza(e relativo stato del programma al momento della sospensione). ");
                    anywheresoftware.b4a.keywords.Common common65 = this.__c;
                    java.lang.StringBuilder append70 = append69.append("\n").append("Non è possibile utilizzare questo comando se ci sono articoli selezionati.  ");
                    anywheresoftware.b4a.keywords.Common common66 = this.__c;
                    java.lang.StringBuilder append71 = append70.append("\n").append("Le modalità di richiamo possono essere 2:  ");
                    anywheresoftware.b4a.keywords.Common common67 = this.__c;
                    java.lang.StringBuilder append72 = append71.append("\n").append("1)Digitare il numero del movimento poi premere il tasto 'Richiama Movimento'(il numero del movimento è riportato sullo scontrino nella riga che precede il Totale");
                    anywheresoftware.b4a.keywords.Common common68 = this.__c;
                    java.lang.StringBuilder append73 = append72.append("\n").append("2)Premere il tasto 'Richiama Movimento',Indicare se il movimento si trova tra i dati del giorno o tra quelli di giorni precedenti, quindi selezionare dalla lista il movimento richiesto. ");
                    anywheresoftware.b4a.keywords.Common common69 = this.__c;
                    java.lang.StringBuilder append74 = append73.append("\n").append("Se il movimento è stato richiamato è possibile annullare la procedura premendo nuovamente il tasto 'Richiama Movimento' (nessun dato verrà modificato).");
                    anywheresoftware.b4a.keywords.Common common70 = this.__c;
                    java.lang.StringBuilder append75 = append74.append("\n").append("Possiamo richiamare anche movimenti di tipologia diversa dalla vendita.");
                    anywheresoftware.b4a.keywords.Common common71 = this.__c;
                    java.lang.StringBuilder append76 = append75.append("\n").append("Confermando un movimento richiamato viene chiesto se ristampare il documento fiscale nel caso fosse stato emesso in precedenza. ");
                    anywheresoftware.b4a.keywords.Common common72 = this.__c;
                    java.lang.StringBuilder append77 = append76.append("\n").append("Nel caso in cui sia attiva la gestione di magazzino , confermando un movimento richiamato, il magazzino viene ricalcolato .");
                    anywheresoftware.b4a.keywords.Common common73 = this.__c;
                    java.lang.StringBuilder append78 = append77.append("\n").append("Nel caso in cui all'interno del movimento sia presente un cliente con la gestione dei punti o del prepagato, confermando un movimento richiamato, i montanti del cliente vengono ricalcolati .");
                    anywheresoftware.b4a.keywords.Common common74 = this.__c;
                    java.lang.StringBuilder append79 = append78.append("\n").append("Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common75 = this.__c;
                    return append79.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 18:
                    java.lang.StringBuilder append80 = new java.lang.StringBuilder().append("Consente di caricare un valore sul 'Prepagato' di un cliente . ");
                    anywheresoftware.b4a.keywords.Common common76 = this.__c;
                    java.lang.StringBuilder append81 = append80.append("\n").append("La ricarica  funziona solo su clienti col flag 'Prepagato' abilitato e solo all'interno di un movimento di vendita.  ");
                    anywheresoftware.b4a.keywords.Common common77 = this.__c;
                    java.lang.StringBuilder append82 = append81.append("\n").append("Una volta selezionato il cliente è sufficiente indicare l'importo da ricaricare quindi premere il tasto ricarica.  ");
                    anywheresoftware.b4a.keywords.Common common78 = this.__c;
                    java.lang.StringBuilder append83 = append82.append("\n").append("E' possibile effettuare ricariche e vendite all'interno dello stesso documento.");
                    anywheresoftware.b4a.keywords.Common common79 = this.__c;
                    java.lang.StringBuilder append84 = append83.append("\n").append("L'importo ricaricato viene sempre registrato con la causale 'Credito' ");
                    anywheresoftware.b4a.keywords.Common common80 = this.__c;
                    java.lang.StringBuilder append85 = append84.append("\n").append("E' possibile modificare iva ,reparto e descrizione del comando entrando in 'Configurazione Plu' (cercare il codice'ric')Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common81 = this.__c;
                    return append85.append("\n").append("Questo comando puo essere inibito all'operatore dal menù 'Configura Operatori' ").toString();
                case 19:
                    java.lang.StringBuilder append86 = new java.lang.StringBuilder().append("Consente di scalare i punti dal cliente abilitato alla gestione dei punti. ");
                    anywheresoftware.b4a.keywords.Common common82 = this.__c;
                    java.lang.StringBuilder append87 = append86.append("\n").append("Durante la vendita il cliente totalizza 1 punto ogni Euro acquistato.  ");
                    anywheresoftware.b4a.keywords.Common common83 = this.__c;
                    java.lang.StringBuilder append88 = append87.append("\n").append("Allo stesso modo il premio scarica 1 punto per ogno articolo premio selezionato: volendo scalare 20 punti è necessario digitare 20 x seguito dal tasto 'Premio'.  ");
                    anywheresoftware.b4a.keywords.Common common84 = this.__c;
                    java.lang.StringBuilder append89 = append88.append("\n").append("E' possibile modificare iva ,reparto , descrizione e un eventuale importo  del comando entrando in 'Configurazione Plu' (cercare il codice'pre').L'importo maggiore di zero consente di applicare uno sconto al momento del ritiro del premio (premio monetizzato). Seguendo quindi l'esempio precedente, impostando il prezzo di vendita a 0,10 ,oltre a scaricare 20 punti genera uno sconto di 2 Euro.  Il comando è attivo solo con la versione PRO.");
                    anywheresoftware.b4a.keywords.Common common85 = this.__c;
                    return append89.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 20:
                    java.lang.StringBuilder append90 = new java.lang.StringBuilder().append("Gli articoli possono essere richiamati in 4 differenti modi:");
                    anywheresoftware.b4a.keywords.Common common86 = this.__c;
                    java.lang.StringBuilder append91 = append90.append("\n").append("1)Digitare il codice interno del articolo quindi premere il tasto 'Ricerca Articoli' ");
                    anywheresoftware.b4a.keywords.Common common87 = this.__c;
                    java.lang.StringBuilder append92 = append91.append("\n").append("2)Digitare l'eventuale codice a barre articolo quindi premere il tasto 'Ricerca Barcode' ");
                    anywheresoftware.b4a.keywords.Common common88 = this.__c;
                    java.lang.StringBuilder append93 = append92.append("\n").append("3)Premere il tasto 'Ricerca Articoli', cercare l'articolo tramite i filtri disponibili quindi toccare l tasto con l'ingranaggio per effettuare la selezione. ");
                    anywheresoftware.b4a.keywords.Common common89 = this.__c;
                    java.lang.StringBuilder append94 = append93.append("\n").append("4)Utilizzare una scanner per leggere il barcode che identifica il prodotto (anche etichette a peso).");
                    anywheresoftware.b4a.keywords.Common common90 = this.__c;
                    return append94.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 21:
                    java.lang.StringBuilder append95 = new java.lang.StringBuilder().append("Consente di passare dal listino 1 al listino 2 e viceversa.");
                    anywheresoftware.b4a.keywords.Common common91 = this.__c;
                    java.lang.StringBuilder append96 = append95.append("\n").append("Il listino 2 dell'articolo può essere modificato manualmente all'interno della 'Configurazione PLU' oppure si può ricalcolare il listino 2 applicando maggiorazioni o sconti in percentuale rispetto al listino 1 (su tutta l'anagrafica).");
                    anywheresoftware.b4a.keywords.Common common92 = this.__c;
                    java.lang.StringBuilder append97 = append96.append("\n").append("Questa procedura può essere richiamata dal menu 'Configura'  ");
                    anywheresoftware.b4a.keywords.Common common93 = this.__c;
                    java.lang.StringBuilder append98 = append97.append("\n").append("Il cambio di Listino non ha effetto su articoli a peso e su battute a reparto ");
                    anywheresoftware.b4a.keywords.Common common94 = this.__c;
                    java.lang.StringBuilder append99 = append98.append("\n").append("Nel caso in cui siano stati selezionati articoli al momento del cambio del listino , verrà richiesto se applicare la variazione di prezzo anche agli articoli selezionati in precedenza.  ");
                    anywheresoftware.b4a.keywords.Common common95 = this.__c;
                    java.lang.StringBuilder append100 = append99.append("\n").append("Il comando è attivo solo all'interno del movimento dei Vendita.");
                    anywheresoftware.b4a.keywords.Common common96 = this.__c;
                    return append100.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 22:
                    java.lang.StringBuilder append101 = new java.lang.StringBuilder().append("Consente di inserire il Codice Lotteria del cliente. ");
                    anywheresoftware.b4a.keywords.Common common97 = this.__c;
                    java.lang.StringBuilder append102 = append101.append("\n").append("Esiste una procedura di verifica della validità del codice inserito .");
                    anywheresoftware.b4a.keywords.Common common98 = this.__c;
                    java.lang.StringBuilder append103 = append102.append("\n").append("Nel caso in cui il Codice Lotteria sia stato precedentemente inserito all'interno dell'anagrafica cliente , il documento commerciale verrà automaticamente abilitato per la partecipazione alla lotteria.");
                    anywheresoftware.b4a.keywords.Common common99 = this.__c;
                    return append103.append("\n").append("Il comando è attivo solo con la versione PRO.").toString();
                case 23:
                    java.lang.StringBuilder append104 = new java.lang.StringBuilder().append("Viene abilitata la possibilità di dividere il conto in più sottoconti .");
                    anywheresoftware.b4a.keywords.Common common100 = this.__c;
                    java.lang.StringBuilder append105 = append104.append("\n").append("Per utilizzare questa funzione è necessario inserire almeno 2 articoli");
                    anywheresoftware.b4a.keywords.Common common101 = this.__c;
                    java.lang.StringBuilder append106 = append105.append("\n").append("Tramite il nuovo tasto che apparirà in corrispondenza di ogni articolo si avrà la possibilità di indicare la quantità da selezionare.  ");
                    anywheresoftware.b4a.keywords.Common common102 = this.__c;
                    java.lang.StringBuilder append107 = append106.append("\n").append("Tenendo premuto questo tasto una eventuale precedente selezione verrà annullata. ");
                    anywheresoftware.b4a.keywords.Common common103 = this.__c;
                    java.lang.StringBuilder append108 = append107.append("\n").append("Per uscire dalla funzione senza selezionare tutti gli articoli è necessario premere nuovamente il tasto 'Dividi Conto'.  ");
                    anywheresoftware.b4a.keywords.Common common104 = this.__c;
                    java.lang.StringBuilder append109 = append108.append("\n").append("Nel caso in cui vengano selezionati tutti gli articoli , l'uscita dalla funzione sarà automatica.  ");
                    anywheresoftware.b4a.keywords.Common common105 = this.__c;
                    java.lang.StringBuilder append110 = append109.append("\n").append("Il comando è attivo solo all'interno del movimento dei Vendita.");
                    anywheresoftware.b4a.keywords.Common common106 = this.__c;
                    return append110.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 24:
                    java.lang.StringBuilder append111 = new java.lang.StringBuilder().append("Viene abilitata la possibilità di dividere il totale del conto in più sottoconti senza il dettaglio degli articoli .");
                    anywheresoftware.b4a.keywords.Common common107 = this.__c;
                    java.lang.StringBuilder append112 = append111.append("\n").append("Tramite il nuovo tasto che apparirà in corrispondenza di ogni riga si avrà la possibilità di effettuare la selezione .  ");
                    anywheresoftware.b4a.keywords.Common common108 = this.__c;
                    java.lang.StringBuilder append113 = append112.append("\n").append("Tenendo premuto questo tasto una eventuale precedente selezione verrà annullata. ");
                    anywheresoftware.b4a.keywords.Common common109 = this.__c;
                    java.lang.StringBuilder append114 = append113.append("\n").append("Per uscire dalla funzione senza selezionare tutti gli articoli è necessario premere nuovamente il tasto 'Conto alla Romana'.  ");
                    anywheresoftware.b4a.keywords.Common common110 = this.__c;
                    java.lang.StringBuilder append115 = append114.append("\n").append("In questo caso l'importo degli eventuali documenti emessi verrà applicato come sconto sul totaledel movimento.");
                    anywheresoftware.b4a.keywords.Common common111 = this.__c;
                    java.lang.StringBuilder append116 = append115.append("\n").append("Nel caso in cui vengano selezionati tutte le righe , l'uscita dalla funzione sarà automatica.  ");
                    anywheresoftware.b4a.keywords.Common common112 = this.__c;
                    java.lang.StringBuilder append117 = append116.append("\n").append("Il comando è attivo solo all'interno del movimento dei Vendita.");
                    anywheresoftware.b4a.keywords.Common common113 = this.__c;
                    return append117.append("\n").append("Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 25:
                    java.lang.StringBuilder append118 = new java.lang.StringBuilder().append("Il cameriere imputa una serie di piatti, i piatti partono automaticamente dal primo turno.");
                    anywheresoftware.b4a.keywords.Common common114 = this.__c;
                    java.lang.StringBuilder append119 = append118.append("\n").append("Sia sul Tablet che sui palmari ogni riga riporta a fianco il turno In cui è coinvolta.");
                    anywheresoftware.b4a.keywords.Common common115 = this.__c;
                    java.lang.StringBuilder append120 = append119.append("\n").append("Premendo tale funzione i piatti imputati inseguito riportano  a fianco il turno di preparazione successivo per la cucina.");
                    anywheresoftware.b4a.keywords.Common common116 = this.__c;
                    java.lang.StringBuilder append121 = append120.append("\n").append("In Cucina la comanda riporterà con taglio parziale la lista della preparazione divisa per turno.");
                    anywheresoftware.b4a.keywords.Common common117 = this.__c;
                    return append121.append("\n").append("Possono se flag attivo essere stampati anche i reparti coinvolti nello stesso turno").toString();
                case 26:
                    return "Il cameriere apre il tavolo e comanda l’avanti turno, generalmente questa operazione viene eseguita dal palmare : in cucina viene stampata la comanda che riporta il numero del tavolo e il turno di preparazione delle pietanze ai reparti coinvolti nella produzione.";
                case 27:
                    java.lang.StringBuilder append122 = new java.lang.StringBuilder().append("Questa funzione consente di dividere il conto in modo analitico, si scelgono le quantità dalle righe dello conto virtuale , e poi si decide quale tipo di documento se intestarlo (selezionando o inserendo un cliente) ed infine si esegue il pagamento nella forma mista o diretta che si desidera.");
                    anywheresoftware.b4a.keywords.Common common118 = this.__c;
                    return append122.append("\n").append("Il conto virtuale viene ridotto delle quantità e degli articoli processati ed è possibile procedere con la selezione e l’emissione di un nuovo conto o parcheggiare il conto sul tavolo (ad esempio una persona è andata via prima ed altre rimangono al tavolo) ; la procedura si itera fino alla chiusura del tavolo.").toString();
                case 28:
                    return "In questo caso è sufficiente specificare il numero dei conti da emettere; i conti possono essere poi emessi con tipologia di documento e pagamento anche diverso fra loro.";
                case 29:
                    java.lang.StringBuilder append123 = new java.lang.StringBuilder().append("Questa funzione consente il ritiro dell'eventuale vincita di un gratta e vinci da parte del cliente.");
                    anywheresoftware.b4a.keywords.Common common119 = this.__c;
                    return append123.append("\n").append("Prima di abilitare il pagamento viene verificato se il tagliando è legato ad un codice esistente, se stato venduto da un altro punto vendita ose è già stato incassato.").toString();
                case 30:
                    java.lang.StringBuilder append124 = new java.lang.StringBuilder().append("Consente la stampa di Ricevute su kPrinter.");
                    anywheresoftware.b4a.keywords.Common common120 = this.__c;
                    java.lang.StringBuilder append125 = append124.append("\n").append("Per emettere una ricevut premere il tasto 'Ricevuta' prima di chiudere la transazione con un pagamento idoneo.");
                    anywheresoftware.b4a.keywords.Common common121 = this.__c;
                    java.lang.StringBuilder append126 = append125.append("\n").append("La Ricevuta può essere emessa solo all'interno di una transazione di vendita.");
                    anywheresoftware.b4a.keywords.Common common122 = this.__c;
                    java.lang.StringBuilder append127 = append126.append("\n").append("Se precedentemente la stampa è stato selezionato un cliente il documento verrà intestato automaticamente. In caso contrario lo spazio destinato all'intestazione verrà lasciato vuoto.");
                    anywheresoftware.b4a.keywords.Common common123 = this.__c;
                    return append127.append("\n").append("Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' ").toString();
                case 31:
                    java.lang.StringBuilder append128 = new java.lang.StringBuilder().append("Per utilizzare questa funzione è necessario avere un cellulare android con 'Incoming' installato o un dispositivo adatto al riconoscimento telefonico su linea fissa.");
                    anywheresoftware.b4a.keywords.Common common124 = this.__c;
                    return append128.append("\n").append("Consente la gestione delle telefonate ricevute nella giornata :vengono evidenziate le telefonate che sono state accettate o meno con possibilità di richiamo").toString();
                case 32:
                    java.lang.StringBuilder append129 = new java.lang.StringBuilder().append("Consente l'inserimento di messaggi testuali fissi all'interno del documento.");
                    anywheresoftware.b4a.keywords.Common common125 = this.__c;
                    java.lang.StringBuilder append130 = append129.append("\n").append("Possono essere creati fino a un massimo di 9 messaggi.");
                    anywheresoftware.b4a.keywords.Common common126 = this.__c;
                    java.lang.StringBuilder append131 = append130.append("\n").append("I messaggi possono essere legati ad un reparto , quindi è possibile verificare il loro utilizzo attraverso le statistiche di vendita impostando i filtri corretti.");
                    anywheresoftware.b4a.keywords.Common common127 = this.__c;
                    java.lang.StringBuilder append132 = append131.append("\n").append("Vengono stampati sulle stampanti di produzione ma non sul ");
                    cassandraRisto.ital.main mainVar71 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    return append132.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append("").toString();
                case 33:
                    java.lang.StringBuilder append133 = new java.lang.StringBuilder().append("Questa funzione consente di modificare il normale comportamento del flag 'Stampa tallon per ogni prodotto' nella configurazione delle stampe per i centri di produzione:");
                    anywheresoftware.b4a.keywords.Common common128 = this.__c;
                    return append133.append("\n").append("è possibile forzare l'emissione dei tallon,inibire l'emissione o seguire il comportamento del flag in configurazione.").toString();
                case 34:
                    java.lang.StringBuilder append134 = new java.lang.StringBuilder().append("Questa funzione consente di inibire temporaneamente la stampa di tutte le comande che eventualmente sarebbero stampate nel conto in corso.");
                    anywheresoftware.b4a.keywords.Common common129 = this.__c;
                    return append134.append("\n").append("Alla chiusura del movimento viene riabilitata la stampa automaticamente.").toString();
                case 35:
                    return "Consente la stampa di un documento richiamando un movimento chiuso in precedenza con la funzione 'Conto'.";
                case 36:
                    java.lang.StringBuilder append135 = new java.lang.StringBuilder().append("A questa funzione si può legare uno dei menu del giorno creati attraverso l'apposita procedura di configurazione.");
                    anywheresoftware.b4a.keywords.Common common130 = this.__c;
                    return append135.append("\n").append("Premendo un tasto menu verrà richiesto di inserire uno o più articoli raggruppati per reparto.E' consentito utilizzare il moltiplicatore prima di selezionare la funzione.").toString();
                case 37:
                    return "Questa funzione dà la possibilità di gestire variazioni sulla quantità in eccesso o in difetto (es. pizza baby o pizza gigante).";
                case 38:
                    java.lang.StringBuilder append136 = new java.lang.StringBuilder().append("Consente la ristampa completa della comanda (funziona solo all'interno di un tavolo).");
                    anywheresoftware.b4a.keywords.Common common131 = this.__c;
                    return append136.append("\n").append("Una volta premuto il tasto la ristampa verrà eseguita al momento della sospensione del tavolo.").toString();
                case 39:
                    return "Richiama in tastiera gli articoli facenti parte del gruppo richiamato dalla funzione";
                case 40:
                    java.lang.StringBuilder append137 = new java.lang.StringBuilder().append("Questa funzione dà la possibilità di gestire impostare maggiorazioni al totale o sulla singola riga.");
                    anywheresoftware.b4a.keywords.Common common132 = this.__c;
                    anywheresoftware.b4a.keywords.Common common133 = this.__c;
                    return append137.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", "\n")).append("\n\t\t\t\t\tLa funzione può essere inserita anche con un valore predefinito.").toString();
                case 41:
                    return "Questa funzione consente di disabilitare temporaneamente la gestione del servizio.";
                case 42:
                    return "Questa funzione visualizza una serie di informazioni dettagliate relative al movimento che si sta componendo.";
                case 43:
                    return "Questa funzione dà la possibilità di assegnere l'operatore che effettua la consegna a domicilio, in un momemto successivo alla stampa del documento fiscale.";
                case 44:
                    return "Cancella tutti gli articoli a prezzo 0 presenti del conto prima dell'emissione del documento";
                case 45:
                    return "Consente il blocco e lo sblocco alla vendita di articoli esauriti (aggiorna anche i palmari se presenti)";
                case 46:
                    return "Consente la stampa automatica di tanti scontrini quanti sono i conti in attesa di elaborazione all'interno del conto alla romana";
                case 47:
                    return "Sposta gli articoli inseriti in modalità 'asporto' all'interno di un tavolo libero";
                case 48:
                    return "Visualizza il numero di articoli sospesi all'interno di ogni singolo step di minuti ,per la gestione dell'asporto";
                case 49:
                    return "Questa funzione da la possibilità di eseguire programmi direttamente dalla tastiera di RistorAndro";
                case 50:
                    return "Sospensione dell'asporto con la possibilità di indicare la data e l'ora del ritiro.\n\t\t\t\t\t\tViene richiesto anche l'inserimento di un testo 'memo' e la stampa di un tallon riepilogativo (oltre alla stampa nei centri di produzione se configurate)";
                case 51:
                    return "Consente il richiamo di asporti sospesi in date diverse:\n\t\t\t\t\t\tPer prima cosa vengono proposti filtri (data , movimento e cliente) per semplificare la ricerca del movimento.\n\t\t\t\t\t\tUna volta identificato il movimento è possibile modificarlo e risospenderlo (anche con data diversa),cancellarlo o confermare tutto emettendo un documento fiscale.";
                case 52:
                    return "Questa funzione consente la visualizzazione della password generata dal sistema per la data orierna ,necessaria per l'utilizzo del service box";
                case 53:
                    return "Questa funzione consente la ricezione dei dati rilevati dal terminalino portatile";
                case 54:
                    return "Inserendo questa funzione su un tasto è necessario selezionare un allergene o tag.\n\t\t\t\t\t\tPremendo questa funzione vengono evidenziati in tastiera tutti gli articoli contenenti l'allergene selezionato.";
                case 55:
                    return "Consente l'apertura del 'Funzioni per il gestore' utilizzando il terminale Cashlogy.";
                case 56:
                    return "Consente l'inserimento dei dati necessari per l'emissione di scontrino fiscale per Risorse balneari.";
                case 57:
                    return "Consente la modifica del numero di sottoconti all'interno di un tavolo ";
                case 58:
                    return "Attraverso questa funzione è possibile visualizzare il dettaglio e i totali di ogni sottoconto contenuto in un tavolo.Questa funzione utilizzata in fase di dividi conto ,seleziona il sottoconto per il pagamento. ";
                case 59:
                    return "Consente la ricerca di un articolo del reparto Tabacchi utilizzando il codice AAMS";
                case 60:
                    return "Questa funzione prevede 2 modalità di funzionamento:\n1)digitando il numero del tavolo seguito dal tasto 'Ricerca tavoli' il tavolo viene subito aperto\n2)permendo il tasto 'Ricerca tavoli' si apre una finestra che consente la visualizzazione dei tavoli in formato griglia;esistono diverse possibilità di ricerca e rimane possibile gestire i tavoli come nella modalità tradizionale";
                case 61:
                    return "Consente la visualizzazione dello stato di avanzamento invio delle fatture elettroniche.\nIl dettaglio dello stato è legato all'intermediario scelto come destinatario fattura.\nAttraverso questa funzione è anche possibile ristampare una copia della fattura ";
                case 62:
                    return "Possono essere gestite fino a 9 macro e ogni macro a sua volta può contenere fino a 9 comandi.\nI comandi possono eseere di questo tipo: \"Ricerca Articoli\",\"Abbuono\",\"Ricerca Cliente\",\"Fattura\",\"Ricevuta\",\"Menù\"\nper alcuni comandi possono essere richiesti parametri aggiuntivi (es:codice articolo ,quantità,codice cliente ....)\n\nUna volta che la macro è stata configurata può essere inserita in tastiera, legata ad un articolo o legata ad un cliente\nSe viene selezianato da palmare un articolo abbinato ad una macro,l'esecuzione della macro avviene alla prima apertura del tavolo dal terminale \n\t\t\t";
                case 63:
                    return "Questa funzione è utilizzabile solo in modalità RT.\nConsente l'annullo di un documento commerciale di vendita , generando un nuovo documento commerciale di annullo.\nViene eliminato anche il movimento nel DB del gestionale";
                case 64:
                    return "Questa funzione è utilizzabile solo in modalità RT.\n1)\"Stampa elenco chiusure eseguite (da chiusura a chiusura)\" stampa elenco su carta\n2)\"Stampa XML chiusure (da chiusura a chiusura)\" Stampa Xml da chiusura a chiusura su carta\n3)\"Esporta dati corrispettivi dalla Memoria di dettaglio\"\ncon questa funzione è possibile estrarre i file contenuti nel range indicato\nVengono estratti anche i file delle chiusure non inviate ad AE o scartati da AE\n4)\"Invia chiusure in sospeso al server AE\"\nViene verificato se esistono delle chiusure non ancora inviate ad AE e nel caso ne viene richiesto l'invio\n5)\"Comunica al Server AE la chiusura temporanea dell'attività \"\nDa utilizzare ad esempio per la chiusura estiva dell'attività\nSe la comunicazione ad AE ha esito positivo , la cassa non consente più l'emissione di DCV .\nPer uscire dallo stato di sospensione attività è necessario eseguire una chiusura .";
            }
        }
        return "";
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        innerInitialize(ba);
        this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._initialize(this.ba);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/files").toString(), "Anagra.db")) {
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb3 = sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/files").toString();
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(sb3, "Anagra.db", anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Anagra.db");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(sb4.append(cassandraRisto.ital.mod1._vvvvv1).append("/files").toString(), "Anagra.db");
        }
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb5.append(cassandraRisto.ital.mod1._vvvvv1).append("/files").toString(), "Venduto.db")) {
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb7 = sb6.append(cassandraRisto.ital.mod1._vvvvv1).append("/files").toString();
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(sb7, "Venduto.db", anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Venduto.db");
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(sb8.append(cassandraRisto.ital.mod1._vvvvv1).append("/files").toString(), "Venduto.db");
        }
        anywheresoftware.b4a.keywords.Common common9 = this.__c;
        anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb9.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "Anagra.db")) {
            anywheresoftware.b4a.keywords.Common common10 = this.__c;
            anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb11 = sb10.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString();
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(sb11, "Anagra.db", anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Anagra.db");
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            anywheresoftware.b4a.objects.streams.File file12 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(sb12.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "Anagra.db");
        }
        anywheresoftware.b4a.keywords.Common common13 = this.__c;
        anywheresoftware.b4a.objects.streams.File file13 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb13.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "Venduto.db")) {
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            anywheresoftware.b4a.objects.streams.File file14 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb15 = sb14.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString();
            anywheresoftware.b4a.keywords.Common common15 = this.__c;
            anywheresoftware.b4a.objects.streams.File file15 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(sb15, "Venduto.db", anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Venduto.db");
            anywheresoftware.b4a.keywords.Common common16 = this.__c;
            anywheresoftware.b4a.objects.streams.File file16 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(sb16.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "Venduto.db");
        }
        anywheresoftware.b4a.keywords.Common common17 = this.__c;
        anywheresoftware.b4a.objects.streams.File file17 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb17.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "esporta.db")) {
            anywheresoftware.b4a.keywords.Common common18 = this.__c;
            anywheresoftware.b4a.objects.streams.File file18 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb19 = sb18.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString();
            anywheresoftware.b4a.keywords.Common common19 = this.__c;
            anywheresoftware.b4a.objects.streams.File file19 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(sb19, "esporta.db", anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "esporta.db");
            anywheresoftware.b4a.keywords.Common common20 = this.__c;
            anywheresoftware.b4a.objects.streams.File file20 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(sb20.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "esporta.db");
        }
        anywheresoftware.b4a.keywords.Common common21 = this.__c;
        anywheresoftware.b4a.objects.streams.File file21 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb21.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "logo.jpg")) {
            anywheresoftware.b4a.keywords.Common common22 = this.__c;
            anywheresoftware.b4a.objects.streams.File file22 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var17 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb23 = sb22.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString();
            anywheresoftware.b4a.keywords.Common common23 = this.__c;
            anywheresoftware.b4a.objects.streams.File file23 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(sb23, "logo.jpg", anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "logo.jpg");
            anywheresoftware.b4a.keywords.Common common24 = this.__c;
            anywheresoftware.b4a.objects.streams.File file24 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var18 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(sb24.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "logo.jpg");
        }
        anywheresoftware.b4a.keywords.Common common25 = this.__c;
        anywheresoftware.b4a.objects.streams.File file25 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var19 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb25.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "logo.png")) {
            anywheresoftware.b4a.keywords.Common common26 = this.__c;
            anywheresoftware.b4a.objects.streams.File file26 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var20 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb27 = sb26.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString();
            anywheresoftware.b4a.keywords.Common common27 = this.__c;
            anywheresoftware.b4a.objects.streams.File file27 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(sb27, "logo.png", anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "logo.png");
            anywheresoftware.b4a.keywords.Common common28 = this.__c;
            anywheresoftware.b4a.objects.streams.File file28 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var21 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(sb28.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "logo.png");
        }
        anywheresoftware.b4a.keywords.Common common29 = this.__c;
        anywheresoftware.b4a.objects.streams.File file29 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var22 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb29.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), "")) {
            new anywheresoftware.b4a.objects.collections.List().Initialize();
            anywheresoftware.b4a.keywords.Common common30 = this.__c;
            anywheresoftware.b4a.objects.streams.File file30 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb30 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var23 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(sb30.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString());
            int size = ListFiles.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
                if ((ObjectToString.startsWith("Proc") && ObjectToString.endsWith(".txt")) || ObjectToString.equals("LogoPrg.jpg")) {
                    anywheresoftware.b4a.keywords.Common common31 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file31 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.StringBuilder sb31 = new java.lang.StringBuilder();
                    cassandraRisto.ital.mod1 mod1Var24 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    java.lang.String sb32 = sb31.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString();
                    anywheresoftware.b4a.keywords.Common common32 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file32 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(sb32, ObjectToString, anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), ObjectToString);
                    if (ObjectToString.equals("LogoPrg.jpg")) {
                        anywheresoftware.b4a.keywords.Common common33 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file33 = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.StringBuilder sb33 = new java.lang.StringBuilder();
                        cassandraRisto.ital.mod1 mod1Var25 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.String sb34 = sb33.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString();
                        cassandraRisto.ital.mod1 mod1Var26 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.objects.streams.File.Copy(sb34, ObjectToString, cassandraRisto.ital.mod1._vvvvv1, ObjectToString);
                        anywheresoftware.b4a.keywords.Common common34 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file34 = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.StringBuilder sb35 = new java.lang.StringBuilder();
                        cassandraRisto.ital.mod1 mod1Var27 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.String sb36 = sb35.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString();
                        anywheresoftware.b4a.keywords.Common common35 = this.__c;
                        anywheresoftware.b4a.objects.streams.File file35 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Copy(sb36, ObjectToString, anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), ObjectToString);
                    }
                    anywheresoftware.b4a.keywords.Common common36 = this.__c;
                    anywheresoftware.b4a.objects.streams.File file36 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.StringBuilder sb37 = new java.lang.StringBuilder();
                    cassandraRisto.ital.mod1 mod1Var28 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb37.append(cassandraRisto.ital.mod1._vvvvv1).append("/files/files").toString(), ObjectToString);
                }
            }
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Corrispettivi");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("ReportPersonalizzati");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("ProcedureSQL");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("Loghi");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("ImgStampe");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("ICO32");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("ICO48");
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.objects.IntentWrapper intentWrapper = new anywheresoftware.b4a.objects.IntentWrapper();
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 >= 24) {
            intentWrapper.Initialize("android.intent.action.INSTALL_PACKAGE", anywheresoftware.b4a.BA.ObjectToString(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str)));
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
            intentWrapper.setFlags(anywheresoftware.b4a.keywords.Bit.Or(intentWrapper.getFlags(), 1));
        } else {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("file://");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            intentWrapper.Initialize("android.intent.action.VIEW", append.append(anywheresoftware.b4a.objects.streams.File.Combine(this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3, str)).toString());
            intentWrapper.SetType("application/vnd.android.package-archive");
        }
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.Common.StartActivity(this.ba, intentWrapper.getObject());
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_attivaazzeramentoprogressivi) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
            int GetYear = anywheresoftware.b4a.keywords.DateTime.GetYear(anywheresoftware.b4a.keywords.DateTime.getNow());
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Select count(*) from AzzeraProgressivi where Anno =");
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            if (sql.ExecQuerySingleResult(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(GetYear - 1))).append("").toString()).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                return "";
            }
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Select count(*) from AzzeraProgressivi where Anno =");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            if (sql2.ExecQuerySingleResult(append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(GetYear))).append("").toString()).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("insert into AzzeraProgressivi(Anno,Stato) values(");
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                sql3.ExecNonQuery(append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(GetYear))).append(",0) ").toString());
            }
            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Select count(*) from AzzeraProgressivi where Anno =");
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            if (java.lang.Double.parseDouble(sql4.ExecQuerySingleResult(append4.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(GetYear))).append(" and stato =0").toString())) > 0.0d) {
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("Non sono ancora stati azzerati i progressivi delle fatture. ");
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", "\n")).append("Si desidera farlo adesso ? ").toString());
                cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "La prossima volta", "No,non chiedermelo più", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                if (Msgbox2 == -3) {
                    return "";
                }
                cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql5 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("update AzzeraProgressivi  set Stato=1 where Anno=");
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                sql5.ExecNonQuery(append6.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(GetYear))).append(" ").toString());
                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse2 = anywheresoftware.b4a.keywords.Common.DialogResponse;
                if (Msgbox2 == -1) {
                    cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update progressivi set valore = 1 where codice ='F2'");
                    cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update progressivi set valore = 1 where codice ='F'");
                    cassandraRisto.ital.main mainVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("update progressivi set valore = 1 where codice ='F2'");
                    cassandraRisto.ital.main mainVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("update progressivi set valore = 1 where codice ='F'");
                }
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v134 */
    /* JADX WARN: Type inference failed for: r3v85 */
    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.collections.Map map, java.lang.String str, anywheresoftware.b4a.objects.CSBuilder cSBuilder) throws java.lang.Exception {
        java.lang.Exception exc;
        int i;
        boolean z;
        ?? r3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        try {
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("select * from clienti where codice = '");
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, sql.ExecQuery(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("'").toString()));
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("select * from FEdatiCli where codice = '");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, sql2.ExecQuery(append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("'").toString()));
            if (cursorWrapper2.getRowCount() == 0 || cursorWrapper4.getRowCount() == 0) {
                return 2;
            }
            cursorWrapper4.setPosition(0);
            cursorWrapper2.setPosition(0);
            anywheresoftware.b4a.objects.CSBuilder Size = cSBuilder.Size(22).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Dati in Anagrafica:")).Size(15);
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            Size.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            anywheresoftware.b4a.objects.CSBuilder Append = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("descrizione")));
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            Append.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            anywheresoftware.b4a.objects.CSBuilder Append2 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("via")));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            Append2.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            java.lang.String str2 = "";
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), cursorWrapper2.GetString("cap")))) {
                str2 = cursorWrapper2.GetString("cap").trim() + " ";
            }
            anywheresoftware.b4a.keywords.Common common7 = this.__c;
            cassandraRisto.ital.mod1 mod1Var2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), cursorWrapper2.GetString("citta")))) {
                str2 = str2 + cursorWrapper2.GetString("citta").trim() + " ";
            }
            anywheresoftware.b4a.keywords.Common common8 = this.__c;
            cassandraRisto.ital.mod1 mod1Var3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), cursorWrapper2.GetString("provincia")))) {
                str2 = str2 + cursorWrapper2.GetString("provincia").trim() + " ";
            }
            anywheresoftware.b4a.keywords.Common common9 = this.__c;
            cassandraRisto.ital.mod1 mod1Var4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), str2))) {
                anywheresoftware.b4a.objects.CSBuilder Append3 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(str2));
                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                Append3.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            }
            anywheresoftware.b4a.objects.CSBuilder Append4 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("P.iva. ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("piva")));
            anywheresoftware.b4a.keywords.Common common11 = this.__c;
            Append4.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            anywheresoftware.b4a.objects.CSBuilder Append5 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Cod.Fisc. ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("codf")));
            anywheresoftware.b4a.keywords.Common common12 = this.__c;
            Append5.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            anywheresoftware.b4a.objects.CSBuilder Append6 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("PEC ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper4.GetString("PEC")));
            anywheresoftware.b4a.keywords.Common common13 = this.__c;
            Append6.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            anywheresoftware.b4a.objects.CSBuilder Append7 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Cod.Destinatario ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper4.GetString("CodiceDestinatario")));
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            Append7.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            anywheresoftware.b4a.keywords.Common common15 = this.__c;
            anywheresoftware.b4a.objects.CSBuilder Append8 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            anywheresoftware.b4a.keywords.Common common16 = this.__c;
            anywheresoftware.b4a.objects.CSBuilder Size2 = Append8.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Size(22).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Dati nel QRcode:")).Size(15);
            anywheresoftware.b4a.keywords.Common common17 = this.__c;
            Size2.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.collections.Map map2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) map.Get("anag"));
            cassandraRisto.ital.mod1 mod1Var5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(getActivityBA(), anywheresoftware.b4a.BA.ObjectToString(map2.GetDefault("denom", "")));
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map2.GetDefault("piva", ""));
            java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(map2.GetDefault("cf", ""));
            anywheresoftware.b4a.objects.collections.Map map3 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) map2.Get("domFisc"));
            java.lang.String ObjectToString3 = anywheresoftware.b4a.BA.ObjectToString(map3.GetDefault("prov", ""));
            java.lang.String ObjectToString4 = anywheresoftware.b4a.BA.ObjectToString(map3.GetDefault("cap", ""));
            cassandraRisto.ital.mod1 mod1Var6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv32 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(getActivityBA(), anywheresoftware.b4a.BA.ObjectToString(map3.GetDefault("com", "")));
            cassandraRisto.ital.mod1 mod1Var7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv33 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(getActivityBA(), anywheresoftware.b4a.BA.ObjectToString(map3.GetDefault("ind", "")));
            anywheresoftware.b4a.objects.collections.Map map4 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) map.Get("SDI"));
            java.lang.String ObjectToString5 = anywheresoftware.b4a.BA.ObjectToString(map4.GetDefault("pec", ""));
            java.lang.String ObjectToString6 = anywheresoftware.b4a.BA.ObjectToString(map4.GetDefault("cod", ""));
            anywheresoftware.b4a.keywords.Common common18 = this.__c;
            cassandraRisto.ital.mod1 mod1Var8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.LogImpl("4130875438", cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(getActivityBA(), anywheresoftware.b4a.BA.ObjectToString(map4.GetDefault("denom", ""))), 0);
            anywheresoftware.b4a.keywords.Common common19 = this.__c;
            anywheresoftware.b4a.keywords.Common.LogImpl("4130875439", cursorWrapper2.GetString("descrizione"), 0);
            anywheresoftware.b4a.keywords.Common common20 = this.__c;
            cassandraRisto.ital.mod1 mod1Var9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(getActivityBA(), cursorWrapper2.GetString("descrizione")))) {
                z = true;
            } else {
                r3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3.equals(cursorWrapper2.GetString("descrizione"));
                if (r3 != 0) {
                    anywheresoftware.b4a.objects.CSBuilder Append9 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("descrizione")));
                    anywheresoftware.b4a.keywords.Common common21 = this.__c;
                    Append9.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                    z = true;
                } else {
                    try {
                        z = false;
                        anywheresoftware.b4a.keywords.Common common22 = this.__c;
                        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                        anywheresoftware.b4a.objects.CSBuilder Append10 = cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
                        anywheresoftware.b4a.keywords.Common common23 = this.__c;
                        Append10.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
                    } catch (java.lang.Exception e) {
                        exc = e;
                        i = r3;
                        this.ba.setLastException(exc);
                        cassandraRisto.ital.mod1 mod1Var10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA activityBA = getActivityBA();
                        anywheresoftware.b4a.keywords.Common common24 = this.__c;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
                        return i;
                    }
                }
            }
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv33.equals(cursorWrapper2.GetString("via"))) {
                anywheresoftware.b4a.objects.CSBuilder Append11 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("via")));
                anywheresoftware.b4a.keywords.Common common25 = this.__c;
                Append11.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                z2 = z;
            } else {
                z2 = false;
                anywheresoftware.b4a.keywords.Common common26 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                anywheresoftware.b4a.objects.CSBuilder Append12 = cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvv33));
                anywheresoftware.b4a.keywords.Common common27 = this.__c;
                Append12.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            }
            if (ObjectToString4.equals(cursorWrapper2.GetString("cap"))) {
                cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("cap"))).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(" "));
                z3 = z2;
            } else {
                z3 = false;
                anywheresoftware.b4a.keywords.Common common28 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
                cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(ObjectToString4)).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(" ")).Pop();
            }
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv32.equals(cursorWrapper2.GetString("citta"))) {
                cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("citta"))).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(" "));
                z4 = z3;
            } else {
                z4 = false;
                anywheresoftware.b4a.keywords.Common common29 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
                cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvv32)).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(" ")).Pop();
            }
            if (ObjectToString3.equals(cursorWrapper2.GetString("provincia"))) {
                anywheresoftware.b4a.objects.CSBuilder Append13 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("provincia")));
                anywheresoftware.b4a.keywords.Common common30 = this.__c;
                Append13.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                z5 = z4;
            } else {
                z5 = false;
                anywheresoftware.b4a.keywords.Common common31 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
                anywheresoftware.b4a.objects.CSBuilder Append14 = cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(ObjectToString3));
                anywheresoftware.b4a.keywords.Common common32 = this.__c;
                Append14.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            }
            if (ObjectToString.equals(cursorWrapper2.GetString("piva"))) {
                anywheresoftware.b4a.objects.CSBuilder Append15 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("P.iva. ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("piva")));
                anywheresoftware.b4a.keywords.Common common33 = this.__c;
                Append15.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                z6 = z5;
            } else {
                z6 = false;
                anywheresoftware.b4a.keywords.Common common34 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors6 = anywheresoftware.b4a.keywords.Common.Colors;
                anywheresoftware.b4a.objects.CSBuilder Append16 = cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("P.iva. ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(ObjectToString));
                anywheresoftware.b4a.keywords.Common common35 = this.__c;
                Append16.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            }
            if (ObjectToString2.equals(cursorWrapper2.GetString("codf"))) {
                anywheresoftware.b4a.objects.CSBuilder Append17 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Cod.Fisc. ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper2.GetString("codf")));
                anywheresoftware.b4a.keywords.Common common36 = this.__c;
                Append17.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                z7 = z6;
            } else {
                z7 = false;
                anywheresoftware.b4a.keywords.Common common37 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors7 = anywheresoftware.b4a.keywords.Common.Colors;
                anywheresoftware.b4a.objects.CSBuilder Append18 = cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Cod.Fisc. ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(ObjectToString2));
                anywheresoftware.b4a.keywords.Common common38 = this.__c;
                Append18.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            }
            if (ObjectToString5.equals(cursorWrapper4.GetString("PEC"))) {
                anywheresoftware.b4a.objects.CSBuilder Append19 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("PEC ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper4.GetString("PEC")));
                anywheresoftware.b4a.keywords.Common common39 = this.__c;
                Append19.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                z8 = z7;
            } else {
                z8 = false;
                anywheresoftware.b4a.keywords.Common common40 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors8 = anywheresoftware.b4a.keywords.Common.Colors;
                anywheresoftware.b4a.objects.CSBuilder Append20 = cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("PEC ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(ObjectToString5));
                anywheresoftware.b4a.keywords.Common common41 = this.__c;
                Append20.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            }
            if (ObjectToString6.equals(cursorWrapper4.GetString("CodiceDestinatario"))) {
                anywheresoftware.b4a.objects.CSBuilder Append21 = cSBuilder.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Cod.Destinatario ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cursorWrapper4.GetString("CodiceDestinatario")));
                anywheresoftware.b4a.keywords.Common common42 = this.__c;
                Append21.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                r3 = z8;
            } else {
                r3 = 0;
                anywheresoftware.b4a.keywords.Common common43 = this.__c;
                anywheresoftware.b4a.keywords.constants.Colors colors9 = anywheresoftware.b4a.keywords.Common.Colors;
                anywheresoftware.b4a.objects.CSBuilder Append22 = cSBuilder.Color(-65536).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Cod.Destinatario ")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(ObjectToString6));
                anywheresoftware.b4a.keywords.Common common44 = this.__c;
                Append22.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            }
            cursorWrapper4.Close();
            cursorWrapper2.Close();
            return r3 == true ? 1 : 0;
        } catch (java.lang.Exception e2) {
            exc = e2;
            i = 1;
        }
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int i, anywheresoftware.b4a.objects.collections.List list, boolean z) throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") == 11) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                int size = list.getSize() - 1;
                for (int i2 = 0; i2 <= size; i2++) {
                    if (anywheresoftware.b4a.BA.ObjectToNumber(list.Get(i2)) != 0.0d) {
                        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setPosition(i2);
                        cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") == 7) {
                            anywheresoftware.b4a.keywords.Common common2 = this.__c;
                            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Non è possibile utilizzare una causale a credito di tipo NON RISCOSSO BENI quando è già stata utilizzata una causale a credito di tipo NON RISCOSSO SERVIZI");
                            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.main mainVar5 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                            anywheresoftware.b4a.keywords.Common common3 = this.__c;
                            return false;
                        }
                    }
                }
            }
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar6 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select codice from iva where RTIva = 12"));
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i3 = 0; i3 <= rowCount; i3++) {
                cursorWrapper2.setPosition(i3);
                java.lang.String str = "";
                cassandraRisto.ital.main mainVar7 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                    str = " and Qtad >0 ";
                }
                cassandraRisto.ital.main mainVar8 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("select count(*) from Ventmp where iva=");
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(cursorWrapper2.GetInt("codice")))).append("");
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                if (java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString())) > 0.0d) {
                    anywheresoftware.b4a.keywords.Common common6 = this.__c;
                    java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Non è possibile utilizzare una causale a credito di tipo NON RISCOSSO SERVIZI in presenza di articoli con la ventilazione iva");
                    cassandraRisto.ital.main mainVar9 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                    cassandraRisto.ital.main mainVar10 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                    anywheresoftware.b4a.keywords.Common common7 = this.__c;
                    return false;
                }
            }
            cursorWrapper2.Close();
        } else {
            cassandraRisto.ital.main mainVar11 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") == 7) {
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                    int size2 = list.getSize() - 1;
                    for (int i4 = 0; i4 <= size2; i4++) {
                        if (anywheresoftware.b4a.BA.ObjectToNumber(list.Get(i4)) != 0.0d) {
                            cassandraRisto.ital.main mainVar12 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setPosition(i4);
                            cassandraRisto.ital.main mainVar13 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") == 11) {
                                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                                java.lang.CharSequence ObjectToCharSequence5 = anywheresoftware.b4a.BA.ObjectToCharSequence("Non è possibile utilizzare una causale a credito di tipo NON RISCOSSO SERVIZI quando è già stata utilizzata una causale a credito di tipo NON RISCOSSO BENI");
                                cassandraRisto.ital.main mainVar14 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.CharSequence ObjectToCharSequence6 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                cassandraRisto.ital.main mainVar15 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence5, ObjectToCharSequence6, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                                anywheresoftware.b4a.keywords.Common common10 = this.__c;
                                return false;
                            }
                        }
                    }
                }
            }
            cassandraRisto.ital.main mainVar16 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") == 12) {
                anywheresoftware.b4a.keywords.Common common11 = this.__c;
                if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                    int size3 = list.getSize() - 1;
                    for (int i5 = 0; i5 <= size3; i5++) {
                        if (anywheresoftware.b4a.BA.ObjectToNumber(list.Get(i5)) != 0.0d) {
                            cassandraRisto.ital.main mainVar17 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setPosition(i5);
                            cassandraRisto.ital.main mainVar18 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") != 12) {
                                anywheresoftware.b4a.keywords.Common common12 = this.__c;
                                java.lang.CharSequence ObjectToCharSequence7 = anywheresoftware.b4a.BA.ObjectToCharSequence("Non è possibile utilizzare una causale a credito di tipo NON RISCOSSO SEGUE FATTURA quando è già stata utilizzata una causale di tipo diversa");
                                cassandraRisto.ital.main mainVar19 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.CharSequence ObjectToCharSequence8 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                cassandraRisto.ital.main mainVar20 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence7, ObjectToCharSequence8, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                                anywheresoftware.b4a.keywords.Common common13 = this.__c;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        cassandraRisto.ital.main mainVar21 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setPosition(i);
        cassandraRisto.ital.main mainVar22 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") != 12) {
            anywheresoftware.b4a.keywords.Common common14 = this.__c;
            if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                int size4 = list.getSize() - 1;
                for (int i6 = 0; i6 <= size4; i6++) {
                    if (anywheresoftware.b4a.BA.ObjectToNumber(list.Get(i6)) != 0.0d) {
                        cassandraRisto.ital.main mainVar23 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setPosition(i6);
                        cassandraRisto.ital.main mainVar24 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetInt("RTPagamento") == 12) {
                            anywheresoftware.b4a.keywords.Common common15 = this.__c;
                            java.lang.CharSequence ObjectToCharSequence9 = anywheresoftware.b4a.BA.ObjectToCharSequence("Non è possibile utilizzare una causale diversa dal credito di tipo NON RISCOSSO SEGUE FATTURA");
                            cassandraRisto.ital.main mainVar25 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.CharSequence ObjectToCharSequence10 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.main mainVar26 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence9, ObjectToCharSequence10, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                            anywheresoftware.b4a.keywords.Common common16 = this.__c;
                            return false;
                        }
                    }
                }
            }
        }
        anywheresoftware.b4a.keywords.Common common17 = this.__c;
        return true;
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
