package cassandraRisto.ital;

/* loaded from: classes.dex */
public class httpclient extends android.app.Service {
    static cassandraRisto.ital.httpclient mostCurrent;
    public static anywheresoftware.b4a.BA processBA;
    private anywheresoftware.b4a.objects.ServiceHelper _service;
    public static int _vv1 = 0;
    public static anywheresoftware.b4a.objects.Timer _vv2 = null;
    public static anywheresoftware.b4a.objects.Timer _vv3 = null;
    public static boolean _vv4 = false;
    public static boolean _vv5 = false;
    public static boolean _vv6 = false;
    public static boolean _vv7 = false;
    public static int _vv0 = 0;
    public static int _vvv1 = 0;
    public static int _vvv2 = 0;
    public static int _vvv3 = 0;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public b4a.example.dateutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public ital.TotemLib.utility _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public ital.TotemLib.totemdata _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public ital.TotemLib.language _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public ital.TotemLib.acttotemmain _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.main _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.tabelle _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.configura _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
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

    public static class httpclient_BR extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            anywheresoftware.b4a.BA.LogInfo("** Receiver (httpclient) OnReceive **");
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) cassandraRisto.ital.httpclient.class);
            if (intent != null) {
                intent2.putExtra("b4a_internal_intent", intent);
            }
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startServiceFromReceiver(context, intent2, false, anywheresoftware.b4a.BA.class);
        }
    }

    public static java.lang.Class<?> getObject() {
        return cassandraRisto.ital.httpclient.class;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
            processBA = new anywheresoftware.b4a.BA(this, null, null, "cassandraRisto.ital", "cassandraRisto.ital.httpclient");
            if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false, new java.lang.Object[0]);
            }
            try {
                java.lang.Class.forName(anywheresoftware.b4a.BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals", new java.lang.Class[0]).invoke(null, null);
                processBA.loadHtSubs(getClass());
                anywheresoftware.b4a.objects.ServiceHelper.init();
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        this._service = new anywheresoftware.b4a.objects.ServiceHelper(this);
        processBA.service = this;
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(processBA)) {
            processBA.raiseEvent2(null, true, "CREATE", true, "cassandraRisto.ital.httpclient", processBA, this._service, java.lang.Float.valueOf(anywheresoftware.b4a.keywords.Common.Density));
        }
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false)) {
            processBA.setActivityPaused(false);
            anywheresoftware.b4a.BA.LogInfo("*** Service (httpclient) Create ***");
            processBA.raiseEvent(null, "service_create", new java.lang.Object[0]);
        }
        processBA.runHook("oncreate", this, null);
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i) {
        onStartCommand(intent, 0, 0);
    }

    class 1 implements java.lang.Runnable {
        final /* synthetic */ android.content.Intent val$intent;

        1(android.content.Intent intent) {
            this.val$intent = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            cassandraRisto.ital.httpclient.this.handleStart(this.val$intent);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        if (!anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.onStartCommand(processBA, new cassandraRisto.ital.httpclient.1(intent))) {
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.addWaitForLayout(new cassandraRisto.ital.httpclient.2(intent));
        }
        processBA.runHook("onstartcommand", this, new java.lang.Object[]{intent, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)});
        return 2;
    }

    class 2 implements java.lang.Runnable {
        final /* synthetic */ android.content.Intent val$intent;

        2(android.content.Intent intent) {
            this.val$intent = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            cassandraRisto.ital.httpclient.processBA.setActivityPaused(false);
            anywheresoftware.b4a.BA.LogInfo("** Service (httpclient) Create **");
            cassandraRisto.ital.httpclient.processBA.raiseEvent(null, "service_create", new java.lang.Object[0]);
            cassandraRisto.ital.httpclient.this.handleStart(this.val$intent);
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.removeWaitForLayout();
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        super.onTaskRemoved(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStart(android.content.Intent intent) {
        anywheresoftware.b4a.BA.LogInfo("** Service (httpclient) Start **");
        java.lang.reflect.Method method = processBA.htSubs.get("service_start");
        if (method != null) {
            if (method.getParameterTypes().length > 0) {
                processBA.raiseEvent(null, "service_start", anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.handleStartIntent(intent, this._service, processBA));
            } else {
                processBA.raiseEvent(null, "service_start", new java.lang.Object[0]);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        anywheresoftware.b4a.BA.LogInfo("** Service (httpclient) Destroy **");
        processBA.raiseEvent(null, "service_destroy", new java.lang.Object[0]);
        processBA.service = null;
        mostCurrent = null;
        processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x023e, code lost:
    
        if (cassandraRisto.ital.main._v_matricola.startsWith("ST") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.collections.Map map, boolean z) throws java.lang.Exception {
        boolean z2 = true;
        map.Put("TipoProgramma", 2);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("Matricola", cassandraRisto.ital.main._v_matricola);
        anywheresoftware.b4a.keywords.B4AApplication b4AApplication = anywheresoftware.b4a.keywords.Common.Application;
        map.Put("Versione", java.lang.Float.valueOf((float) java.lang.Double.parseDouble(anywheresoftware.b4a.keywords.B4AApplication.getVersionName())));
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("DataVersione", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.BA ba = processBA;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        map.Put("DataOra", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba, append.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString()));
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*)  FROM confstampe where stato =1")) > 0.0d) {
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select distinct(ip)  FROM confstampe where stato =1"));
            map.Put("NumeroStampantiNF", java.lang.Integer.valueOf(cursorWrapper2.getRowCount()));
            cursorWrapper2.Close();
        } else {
            map.Put("NumeroStampantiNF", 0);
        }
        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int parseDouble = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from Palmari where Attivo = 1"));
        map.Put("NumeroPalmari", java.lang.Integer.valueOf(parseDouble));
        if (z) {
            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            map.Put("PartitaIva", cassandraRisto.ital.main._v_webapipi);
        }
        cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("AnnoBS", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
        cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("InvioFE", java.lang.Boolean.valueOf(cassandraRisto.ital.main._v_inviofe));
        cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("Spooler", java.lang.Boolean.valueOf(cassandraRisto.ital.main._v_spooler));
        map.Put("Wpalmristorandro", java.lang.Boolean.valueOf(parseDouble > 0));
        cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_webapidatiretailer) {
            cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            anywheresoftware.b4a.BA ba2 = processBA;
            cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            map.Put("RagioneSociale", cassandraRisto.ital.modfunstr._left(ba2, cassandraRisto.ital.main._v_webapiragsoc, 50L));
            cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            map.Put("PartitaIvaRetailer", cassandraRisto.ital.main._v_webapipiesercente);
            cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            map.Put("CAP", cassandraRisto.ital.main._v_webapicapesercente);
        } else {
            map.Put("PartitaIvaRetailer", "");
            map.Put("RagioneSociale", "");
            map.Put("CAP", "");
        }
        cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("Uniandro", java.lang.Boolean.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
        cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("Server", java.lang.Boolean.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1));
        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("Client", java.lang.Boolean.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
        cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("Statistichedaremoto", java.lang.Boolean.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 == 1));
        cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("CashManagement", java.lang.Boolean.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
        cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("MotorePromozionale", java.lang.Boolean.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
        map.Put("FrontaliniEtichette", false);
        cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("Scadenzainchiaro", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.BA ba3 = processBA;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)).append(" ");
        anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        map.Put("DataScadenza", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba3, append2.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString()));
        cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        map.Put("Pro", java.lang.Boolean.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4));
        map.Put("Visibile", true);
        cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_codattivazione.equals("")) {
            cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        }
        z2 = false;
        map.Put("BaseST", java.lang.Boolean.valueOf(z2));
        return "";
    }

    public static void _aggiornastatoportale(boolean z) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_AggiornaStatoPortale(null, z).resume(processBA, null);
    }

    public static class ResumableSub_AggiornaStatoPortale extends anywheresoftware.b4a.BA.ResumableSub {
        boolean _bmsg;
        cassandraRisto.ital.httpclient parent;
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
        java.lang.String _stoken = "";
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsget = null;
        boolean _besiste = false;
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsputapi = null;
        boolean _bokputapi = false;
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rspostapi = null;
        boolean _bokpostapi = false;
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsgetaggiornamento = null;
        boolean _besisteagg = false;
        boolean _bres = false;

        public ResumableSub_AggiornaStatoPortale(cassandraRisto.ital.httpclient httpclientVar, boolean z) {
            this.parent = httpclientVar;
            this._bmsg = z;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 52;
                            this.catchState = 51;
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            this.catchState = 51;
                            break;
                        case 4:
                            this.state = 9;
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_webapipi.equals("")) {
                                cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                                cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (!cassandraRisto.ital.main._v_webapiindirizzo.equals("")) {
                                    cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                                    cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (!cassandraRisto.ital.main._v_matricola.equals("Demo  Demo")) {
                                        break;
                                    }
                                }
                            }
                            this.state = 6;
                            break;
                        case 6:
                            this.state = 9;
                            return;
                        case 9:
                            this.state = 10;
                            this._rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._rs = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cassandraRisto.ital.main._v_webapiindirizzo);
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rs);
                            this.state = 53;
                            return;
                        case 10:
                            this.state = 49;
                            if (this._stoken.equals("")) {
                                this.state = 12;
                                break;
                            } else {
                                this.state = 14;
                                break;
                            }
                        case 12:
                            this.state = 49;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Non è possibile ottenere un token dal server");
                            return;
                        case 14:
                            this.state = 15;
                            this._rsget = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            java.lang.String str = this._stoken;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("/Datimatricola/");
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._rsget = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str, append.append(cassandraRisto.ital.main._v_matricola).toString());
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rsget);
                            this.state = 54;
                            return;
                        case 15:
                            this.state = 32;
                            if (this._besiste) {
                                this.state = 17;
                                break;
                            } else {
                                this.state = 25;
                                break;
                            }
                        case 17:
                            this.state = 18;
                            this._rsputapi = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            this._rsputapi = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._stoken, "/Datimatricola");
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rsputapi);
                            this.state = 56;
                            return;
                        case 18:
                            this.state = 23;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._bokputapi)) {
                                break;
                            } else {
                                this.state = 20;
                                break;
                            }
                        case 20:
                            this.state = 23;
                            return;
                        case 23:
                            this.state = 32;
                            break;
                        case 25:
                            this.state = 26;
                            this._rspostapi = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            this._rspostapi = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(this._stoken);
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rspostapi);
                            this.state = 57;
                            return;
                        case 26:
                            this.state = 31;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._bokpostapi)) {
                                break;
                            } else {
                                this.state = 28;
                                break;
                            }
                        case 28:
                            this.state = 31;
                            return;
                        case 31:
                            this.state = 32;
                            break;
                        case 32:
                            this.state = 33;
                            anywheresoftware.b4a.keywords.Common.Sleep(cassandraRisto.ital.httpclient.processBA, this, 50);
                            this.state = 58;
                            return;
                        case 33:
                            this.state = 48;
                            if (this._besisteagg) {
                                this.state = 35;
                                break;
                            } else if (!this._bmsg) {
                                break;
                            } else {
                                this.state = 47;
                                break;
                            }
                        case 35:
                            this.state = 36;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._bres = anywheresoftware.b4a.BA.ObjectToBoolean(anywheresoftware.b4a.keywords.Common.CallSubNew(ba2, cassandraRisto.ital.main.getObject(), "AggiornaDaWebApi"));
                            break;
                        case 36:
                            this.state = 45;
                            if (this._bmsg && anywheresoftware.b4a.keywords.Common.Not(this._bres)) {
                                this.state = 38;
                                break;
                            }
                            break;
                        case 38:
                            this.state = 39;
                            break;
                        case 39:
                            this.state = 44;
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.httpclient._vv6)) {
                                break;
                            } else {
                                this.state = 41;
                                break;
                            }
                        case 41:
                            this.state = 44;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Non è stato eseguito nessun aggiornamento ");
                            break;
                        case 44:
                            this.state = 45;
                            break;
                        case 45:
                            this.state = 48;
                            break;
                        case 47:
                            this.state = 48;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Non esiste nessun aggiornamento dal server");
                            break;
                        case 48:
                            this.state = 49;
                            break;
                        case 49:
                            this.state = 52;
                            break;
                        case 51:
                            this.state = 52;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 52:
                            this.state = -1;
                            this.catchState = 0;
                            break;
                        case 53:
                            this.state = 10;
                            this._stoken = (java.lang.String) objArr[0];
                            break;
                        case 54:
                            this.state = 15;
                            this._besiste = ((java.lang.Boolean) objArr[0]).booleanValue();
                            anywheresoftware.b4a.keywords.Common.Sleep(cassandraRisto.ital.httpclient.processBA, this, 50);
                            this.state = 55;
                            return;
                        case 55:
                            this.state = 15;
                            break;
                        case 56:
                            this.state = 18;
                            this._bokputapi = ((java.lang.Boolean) objArr[0]).booleanValue();
                            break;
                        case 57:
                            this.state = 26;
                            this._bokpostapi = ((java.lang.Boolean) objArr[0]).booleanValue();
                            break;
                        case 58:
                            this.state = 33;
                            cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                            cassandraRisto.ital.httpclient._vv6 = false;
                            this._rsgetaggiornamento = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            java.lang.String str2 = this._stoken;
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("/Aggiornamentoapi?Matricola==");
                            cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                            cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._rsgetaggiornamento = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str2, append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cassandraRisto.ital.main._v_matricola)).append("&Stato==1").toString());
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rsgetaggiornamento);
                            this.state = 59;
                            return;
                        case 59:
                            this.state = 33;
                            this._besisteagg = ((java.lang.Boolean) objArr[0]).booleanValue();
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static void _complete(java.lang.String str) throws java.lang.Exception {
    }

    public static java.lang.String _cancelglory() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_ipvis.equals("")) {
            return "Configurare l'indirizzo Ip del VisionDroid";
        }
        if (!_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                httpjobVar._initialize(processBA, "glorySendImporto", getObject());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=cancel").toString(), "");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_logvd) {
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = processBA;
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=cancel").toString(), "");
                }
                return "CancelOK";
            }
        }
        return "il Cash Management risulta essere offline";
    }

    public static java.lang.String _chiamac(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "CameriereC", getObject());
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("http://" + str + ":12315/chiamac_" + str2, "");
        return "";
    }

    public static void _comunicaconinfinity(java.lang.String str) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_ComunicaConInfinity(null, str).resume(processBA, null);
    }

    public static class ResumableSub_ComunicaConInfinity extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _url;
        cassandraRisto.ital.httpclient parent;
        java.lang.String _sresult = "";
        cassandraRisto.ital.httpjob _j = null;
        java.lang.String _smsg = "";

        public ResumableSub_ComunicaConInfinity(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str) {
            this.parent = httpclientVar;
            this._url = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:79:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0014 A[SYNTHETIC] */
        @Override // anywheresoftware.b4a.BA.ResumableSub
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                } catch (java.lang.Exception e) {
                    if (this.catchState != 0) {
                    }
                }
                switch (this.state) {
                    case -1:
                        return;
                    case 0:
                        this.state = 1;
                        this._sresult = "";
                        continue;
                    case 1:
                        this.state = 22;
                        this.catchState = 21;
                        this.state = 3;
                        continue;
                    case 2:
                    case 5:
                    case 8:
                    case 11:
                    case 15:
                    case 17:
                    case 18:
                    case 20:
                    default:
                        continue;
                    case 3:
                        this.state = 4;
                        this.catchState = 21;
                        this._j = new cassandraRisto.ital.httpjob();
                        this._j._initialize(cassandraRisto.ital.httpclient.processBA, "", cassandraRisto.ital.httpclient.getObject());
                        this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(this._url);
                        anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._j);
                        this.state = 23;
                        return;
                    case 4:
                        this.state = 13;
                        if (this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                            this.state = 6;
                        } else {
                            this.state = 12;
                            continue;
                        }
                    case 6:
                        this.state = 7;
                        this._smsg = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        continue;
                    case 7:
                        this.state = 10;
                        if (this._smsg.equals("OK")) {
                            continue;
                        } else {
                            this.state = 9;
                        }
                    case 9:
                        this.state = 10;
                        this._sresult = this._smsg;
                        continue;
                    case 10:
                        this.state = 13;
                        continue;
                    case 12:
                        this.state = 13;
                        this._sresult = "Errore di comunicazione con il gestore del distributore automatico";
                        continue;
                    case 13:
                        this.state = 14;
                        this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        continue;
                    case 14:
                        this.state = 19;
                        if (this._sresult.equals("")) {
                            continue;
                        } else {
                            this.state = 16;
                        }
                    case 16:
                        this.state = 19;
                        anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._sresult);
                        continue;
                    case 19:
                        this.state = 22;
                        continue;
                    case 21:
                        this.state = 22;
                        this.catchState = 0;
                        cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                        continue;
                    case 22:
                        this.state = -1;
                        this.catchState = 0;
                        continue;
                    case 23:
                        this.state = 4;
                        this._j = (cassandraRisto.ital.httpjob) objArr[0];
                        continue;
                }
                if (this.catchState != 0) {
                    throw e;
                }
                this.state = this.catchState;
                cassandraRisto.ital.httpclient.processBA.setLastException(e);
            }
        }
    }

    public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _comunicaconinviafe(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        cassandraRisto.ital.httpclient.ResumableSub_ComunicaConInviaFE resumableSub_ComunicaConInviaFE = new cassandraRisto.ital.httpclient.ResumableSub_ComunicaConInviaFE(null, str, str2);
        resumableSub_ComunicaConInviaFE.resume(processBA, null);
        return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), resumableSub_ComunicaConInviaFE);
    }

    public static class ResumableSub_ComunicaConInviaFE extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _parametro;
        java.lang.String _url;
        int limit43;
        cassandraRisto.ital.httpclient parent;
        int step43;
        boolean _bok = false;
        java.lang.String _strmsg = "";
        java.lang.String _ts = "";
        boolean _bsetting = false;
        cassandraRisto.ital.httpjob _j = null;
        java.lang.String _msg = "";
        int _inumcicli = 0;
        int _x = 0;

        public ResumableSub_ComunicaConInviaFE(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str, java.lang.String str2) {
            this.parent = httpclientVar;
            this._url = str;
            this._parametro = str2;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, null);
                            return;
                        case 0:
                            this.state = 1;
                            this._bok = false;
                            this._strmsg = "";
                            break;
                        case 1:
                            this.state = 69;
                            this.catchState = 68;
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            this.catchState = 68;
                            this._ts = "";
                            this._bsetting = this._url.contains("Settings") || this._url.contains("_SQL");
                            break;
                        case 4:
                            this.state = 9;
                            if (anywheresoftware.b4a.keywords.Common.Not(this._bsetting)) {
                                this.state = 6;
                                break;
                            } else {
                                this.state = 8;
                                break;
                            }
                        case 6:
                            this.state = 9;
                            this._ts = this._url.replace("http://127.0.0.1:12512/R__INVIO__", "");
                            this._ts = this._ts.substring(3, 22);
                            break;
                        case 8:
                            this.state = 9;
                            this._url += "__ __";
                            break;
                        case 9:
                            this.state = 10;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append(this._url);
                            anywheresoftware.b4a.keywords.B4AApplication b4AApplication = anywheresoftware.b4a.keywords.Common.Application;
                            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.B4AApplication.getVersionCode())).append("__");
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._url = append2.append(anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 ? "C" : " ")).append("__").toString();
                            break;
                        case 10:
                            this.state = 15;
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            if (!anywheresoftware.b4a.objects.streams.File.Exists(sb.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/FE").toString(), "TmpRes.txt")) {
                                break;
                            } else {
                                this.state = 12;
                                break;
                            }
                        case 12:
                            this.state = 15;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Delete(sb2.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/FE").toString(), "TmpRes.txt");
                            break;
                        case 15:
                            this.state = 16;
                            this._j = new cassandraRisto.ital.httpjob();
                            this._j._initialize(cassandraRisto.ital.httpclient.processBA, "", cassandraRisto.ital.httpclient.getObject());
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(this._url);
                            break;
                        case 16:
                            this.state = 19;
                            cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_asyncfe > 0 && anywheresoftware.b4a.keywords.Common.Not(this._bsetting)) {
                                this.state = 18;
                                break;
                            }
                            break;
                        case 18:
                            this.state = 19;
                            anywheresoftware.b4a.keywords.Common.DoEvents();
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba2, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", true, "Attendere l'invio della fattura ...");
                            break;
                        case 19:
                            this.state = 20;
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._j);
                            this.state = 79;
                            return;
                        case 20:
                            this.state = 37;
                            if (anywheresoftware.b4a.keywords.Common.Not(this._bok)) {
                                this.state = 22;
                                break;
                            } else {
                                this.state = 28;
                                break;
                            }
                        case 22:
                            this.state = 23;
                            this._strmsg = "Errore di comunicazione con il programma InvioFE";
                            break;
                        case 23:
                            this.state = 26;
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_asyncfe != 0 && !this._bsetting) {
                                break;
                            } else {
                                this.state = 25;
                                break;
                            }
                        case 25:
                            this.state = 26;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._strmsg);
                            break;
                        case 26:
                            this.state = 37;
                            break;
                        case 28:
                            this.state = 29;
                            this._msg = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            this._strmsg = this._msg;
                            break;
                        case 29:
                            this.state = 36;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._msg.startsWith("OK"))) {
                                break;
                            } else {
                                this.state = 31;
                                break;
                            }
                        case 31:
                            this.state = 32;
                            break;
                        case 32:
                            this.state = 35;
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_asyncfe != 0 && !this._bsetting) {
                                break;
                            } else {
                                this.state = 34;
                                break;
                            }
                        case 34:
                            this.state = 35;
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba4, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._msg);
                            break;
                        case 35:
                            this.state = 36;
                            this._bok = false;
                            break;
                        case 36:
                            this.state = 37;
                            break;
                        case 37:
                            this.state = 38;
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            break;
                        case 38:
                            this.state = 43;
                            if (!this._bsetting) {
                                break;
                            } else {
                                this.state = 40;
                                break;
                            }
                        case 40:
                            this.state = 43;
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, "");
                            return;
                        case 43:
                            this.state = 44;
                            break;
                        case 44:
                            this.state = 66;
                            if (!this._bok) {
                                break;
                            } else {
                                this.state = 46;
                                break;
                            }
                        case 46:
                            this.state = 47;
                            this._inumcicli = 120;
                            break;
                        case 47:
                            this.state = 52;
                            cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_asyncfe <= 0) {
                                break;
                            } else {
                                this.state = 49;
                                break;
                            }
                        case 49:
                            this.state = 52;
                            cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._inumcicli = cassandraRisto.ital.main._v_asyncfe;
                            break;
                        case 52:
                            this.state = 53;
                            break;
                        case 53:
                            this.state = 65;
                            this.step43 = 1;
                            this.limit43 = this._inumcicli;
                            this._x = 0;
                            this.state = 80;
                            break;
                        case 55:
                            this.state = 56;
                            break;
                        case 56:
                            this.state = 59;
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                            if (!anywheresoftware.b4a.objects.streams.File.Exists(sb3.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/FE").toString(), "TmpRes" + this._ts + ".txt")) {
                                break;
                            } else {
                                this.state = 58;
                                break;
                            }
                        case 58:
                            this.state = 59;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(this._parametro, "TmpRes" + this._ts + ".txt");
                            this.state = 65;
                            break;
                        case 59:
                            this.state = 64;
                            cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                            cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_asyncfe <= 0) {
                                break;
                            } else {
                                this.state = 61;
                                break;
                            }
                        case 61:
                            this.state = 64;
                            anywheresoftware.b4a.keywords.Common.DoEvents();
                            break;
                        case 64:
                            this.state = 81;
                            anywheresoftware.b4a.keywords.Common.Sleep(cassandraRisto.ital.httpclient.processBA, this, 500);
                            this.state = 82;
                            return;
                        case 65:
                            this.state = 66;
                            break;
                        case 66:
                            this.state = 69;
                            break;
                        case 68:
                            this.state = 69;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 69:
                            this.state = 78;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                            cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_asyncfe <= 0) {
                                break;
                            } else {
                                this.state = 71;
                                break;
                            }
                        case 71:
                            this.state = 72;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba5, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                            break;
                        case 72:
                            this.state = 77;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._bok)) {
                                break;
                            } else {
                                this.state = 74;
                                break;
                            }
                        case 74:
                            this.state = 77;
                            anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba6, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._strmsg);
                            break;
                        case 77:
                            this.state = 78;
                            break;
                        case 78:
                            this.state = -1;
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, this._strmsg);
                            return;
                        case 79:
                            this.state = 20;
                            this._j = (cassandraRisto.ital.httpjob) objArr[0];
                            this._bok = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                            break;
                        case 80:
                            this.state = 65;
                            if ((this.step43 > 0 && this._x <= this.limit43) || (this.step43 < 0 && this._x >= this.limit43)) {
                                this.state = 55;
                                break;
                            }
                            break;
                        case 81:
                            this.state = 80;
                            this._x = this._x + 0 + this.step43;
                            break;
                        case 82:
                            this.state = 81;
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(cassandraRisto.ital.httpjob httpjobVar, anywheresoftware.b4a.objects.streams.File.InputStreamWrapper inputStreamWrapper, java.lang.String[] strArr) throws java.lang.Exception {
        try {
            new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput = anywheresoftware.b4a.objects.streams.File.OpenOutput(cassandraRisto.ital.mod1._vvvvv1, "Sospesi.zip", false);
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy2(inputStreamWrapper.getObject(), OpenOutput.getObject());
            OpenOutput.Close();
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.objects.streams.File.Size(cassandraRisto.ital.mod1._vvvvv1, "Sospesi.zip") > 0) {
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Sospesi.txt")) {
                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                    cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "Sospesi.txt");
                }
                flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
                try {
                    anywheresoftware.b4a.BA ba = processBA;
                    cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    java.lang.String str = cassandraRisto.ital.mod1._vvvvv1;
                    cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    archiverForB4A.UnZip(ba, str, "Sospesi.zip", cassandraRisto.ital.mod1._vvvvv1, "");
                    anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                    cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Sospesi.txt"))) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nella procedura di richiamo sospeso");
                        return false;
                    }
                    new anywheresoftware.b4a.objects.collections.List();
                    new anywheresoftware.b4a.objects.collections.List();
                    anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
                    cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    randomAccessFile.Initialize(cassandraRisto.ital.mod1._vvvvv1, "Sospesi.txt", false);
                    if (randomAccessFile.getSize() == 0) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nella procedura di richiamo sospeso");
                        return false;
                    }
                    anywheresoftware.b4a.objects.collections.List list = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List) randomAccessFile.ReadObject(randomAccessFile.CurrentPosition));
                    if (randomAccessFile.CurrentPosition == randomAccessFile.getSize()) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nella procedura di richiamo sospeso");
                        return false;
                    }
                    anywheresoftware.b4a.objects.collections.List list2 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List) randomAccessFile.ReadObject(randomAccessFile.CurrentPosition));
                    randomAccessFile.Close();
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("update headmovRecallAsporto set DaCancellare=1");
                    cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.BA ba2 = processBA;
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "headmovRecallAsporto", list);
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from headmovRecallAsporto where DaCancellare=1");
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("DROP TABLE IF EXISTS TEMP.VendutoRecallAsporto");
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("CREATE TEMP TABLE VendutoRecallAsporto (chiave INTEGER PRIMARY KEY ,\n\t\ttotcre nvarchar (10)  NULL,codint nvarchar (20)  NULL,descrizione\tnvarchar (50)  NULL\n\t\t,nmov numeric(18, 0) not NULL default 0,qta numeric(18, 3) not NULL default 0,importo numeric(18, 2) not NULL default 0,codice nvarchar (20)  NULL)");
                    cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.BA ba3 = processBA;
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "VendutoRecallAsporto", list2);
                    return true;
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nel formato del file arrivato dal server.");
                    return false;
                }
            }
        } catch (java.lang.Exception e2) {
            processBA.setLastException(e2);
            cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        return false;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.httpjob httpjobVar, anywheresoftware.b4a.objects.streams.File.InputStreamWrapper inputStreamWrapper, java.lang.String[] strArr) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput = anywheresoftware.b4a.objects.streams.File.OpenOutput(cassandraRisto.ital.mod1._vvvvv1, "Recall.zip", false);
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Copy2(inputStreamWrapper.getObject(), OpenOutput.getObject());
        OpenOutput.Close();
        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Size(cassandraRisto.ital.mod1._vvvvv1, "Recall.zip") > 0) {
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Recall.txt")) {
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "Recall.txt");
            }
            flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
            try {
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String str = cassandraRisto.ital.mod1._vvvvv1;
                cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                archiverForB4A.UnZip(ba, str, "Recall.zip", cassandraRisto.ital.mod1._vvvvv1, "");
                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Recall.txt"))) {
                    anywheresoftware.b4a.BA ba2 = processBA;
                    cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew3(ba2, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nella procedura di richiamo movimento");
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                    cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                        anywheresoftware.b4a.BA ba3 = processBA;
                        cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba3, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                    }
                } else {
                    cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvv2(processBA)) {
                        anywheresoftware.b4a.BA ba4 = processBA;
                        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba4, cassandraRisto.ital.main.getObject(), "fRecallMov");
                    }
                }
            } catch (java.lang.Exception e) {
                processBA.setLastException(e);
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nel formato del file arrivato dal server.");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                    anywheresoftware.b4a.BA ba5 = processBA;
                    cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba5, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                }
                anywheresoftware.b4a.BA ba6 = processBA;
                cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba6, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                return "";
            }
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cassandraRisto.ital.httpjob httpjobVar, anywheresoftware.b4a.objects.streams.File.InputStreamWrapper inputStreamWrapper, java.lang.String[] strArr) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput = anywheresoftware.b4a.objects.streams.File.OpenOutput(cassandraRisto.ital.mod1._vvvvv1, "Tavolo.zip", false);
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Copy2(inputStreamWrapper.getObject(), OpenOutput.getObject());
        OpenOutput.Close();
        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Size(cassandraRisto.ital.mod1._vvvvv1, "Tavolo.zip") > 0) {
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Tavolo.txt")) {
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "Tavolo.txt");
            }
            flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
            try {
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String str = cassandraRisto.ital.mod1._vvvvv1;
                cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                archiverForB4A.UnZip(ba, str, "Tavolo.zip", cassandraRisto.ital.mod1._vvvvv1, "");
                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Tavolo.txt"))) {
                    anywheresoftware.b4a.BA ba2 = processBA;
                    cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew3(ba2, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nella procedura di apertura tavolo");
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                    cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                        anywheresoftware.b4a.BA ba3 = processBA;
                        cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba3, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                    }
                } else {
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
                        anywheresoftware.b4a.BA ba4 = processBA;
                        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba4, cassandraRisto.ital.main.getObject(), "CheckOpenTable", strArr[1]);
                    }
                    cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvv3(processBA, strArr[1])) {
                        anywheresoftware.b4a.BA ba5 = processBA;
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba5, cassandraRisto.ital.main.getObject(), "ApriTavolo", strArr, false);
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
                            anywheresoftware.b4a.BA ba6 = processBA;
                            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba6, cassandraRisto.ital.main.getObject(), "SetNoUpdLastSalaaFalse");
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                processBA.setLastException(e);
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nel formato del file arrivato dal server.");
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                    anywheresoftware.b4a.BA ba7 = processBA;
                    cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba7, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                }
                anywheresoftware.b4a.BA ba8 = processBA;
                cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba8, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                return "";
            }
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(cassandraRisto.ital.httpjob httpjobVar, anywheresoftware.b4a.objects.streams.File.InputStreamWrapper inputStreamWrapper, boolean z) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput = anywheresoftware.b4a.objects.streams.File.OpenOutput(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip", false);
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Copy2(inputStreamWrapper.getObject(), OpenOutput.getObject());
        OpenOutput.Close();
        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Size(sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip") > 0) {
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.db")) {
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.objects.streams.File.Delete(sb4.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.db");
            }
            flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
            try {
                anywheresoftware.b4a.BA ba = processBA;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String sb6 = sb5.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                archiverForB4A.UnZip(ba, sb6, "Anagra.zip", sb7.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "");
                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(sb8.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.db"))) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nella procedura di invio delle variazioni");
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                    cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                        anywheresoftware.b4a.BA ba2 = processBA;
                        cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba2, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                    }
                } else {
                    anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.objects.streams.File.Size(sb9.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.db") == 0) {
                        anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                        cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.objects.streams.File.Delete(sb10.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.db");
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nella procedura di invio delle variazioni");
                        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                        cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            anywheresoftware.b4a.BA ba3 = processBA;
                            cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba3, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                        }
                    } else {
                        anywheresoftware.b4a.BA ba4 = processBA;
                        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba4, cassandraRisto.ital.main.getObject(), "ApplyVar", java.lang.Boolean.valueOf(z));
                    }
                }
            } catch (java.lang.Exception e) {
                processBA.setLastException(e);
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nel formato del file arrivato dal server.");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                    anywheresoftware.b4a.BA ba5 = processBA;
                    cassandraRisto.ital.mod1 mod1Var15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba5, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                }
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0242, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x024c, code lost:
    
        r0 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
        r0 = cassandraRisto.ital.httpclient.processBA;
        r3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r0, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x024a, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _estraifilevariazionitavoli(cassandraRisto.ital.httpjob httpjobVar, anywheresoftware.b4a.objects.streams.File.InputStreamWrapper inputStreamWrapper) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String sb2 = sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/UPDTAVOLI").toString();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput = anywheresoftware.b4a.objects.streams.File.OpenOutput(sb2, "SospesiT.zip", false);
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Copy2(inputStreamWrapper.getObject(), OpenOutput.getObject());
        OpenOutput.Close();
        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
        if (anywheresoftware.b4a.objects.streams.File.Size(sb2, "SospesiT.zip") > 0) {
            try {
                new flm.b4a.archiver.ArchiverForB4A().UnZip(processBA, sb2, "SospesiT.zip", sb2, "");
                new anywheresoftware.b4a.objects.collections.List().Initialize();
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(sb2);
                ListFiles.Sort(true);
                int size = ListFiles.getSize() - 1;
                for (int i = 0; i <= size; i++) {
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
                    java.util.Arrays.fill(new java.lang.String[0], "");
                    anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                    java.lang.String[] Split = anywheresoftware.b4a.keywords.Regex.Split("_", ObjectToString);
                    if (Split.length > 2) {
                        int parseDouble = (int) java.lang.Double.parseDouble(Split[1]);
                        if (_vvv2 != 0 && _vvv2 + 1 != parseDouble) {
                            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(processBA, "Errore numeratore :\nRichiesto " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(_vvv2 + 1)) + "\nTrovato " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(parseDouble)) + "\n\t\t\t\t\t");
                            _vvv2 = 0;
                            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
                                    cassandraRisto.ital.starter starterVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                                    cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setEnabled(false);
                                    int size2 = ListFiles.getSize() - 1;
                                    for (int i2 = 0; i2 <= size2; i2++) {
                                        java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i2));
                                        if (ObjectToString2.endsWith(".txt")) {
                                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                                            anywheresoftware.b4a.objects.streams.File.Delete(sb2, ObjectToString2);
                                        }
                                    }
                                    _getvariazionitavolidaclient(true);
                                    return "";
                                }
                            }
                            return "";
                        }
                        _vvv2 = parseDouble;
                    }
                    if (ObjectToString.endsWith(".txt")) {
                        new anywheresoftware.b4a.objects.collections.List().Initialize();
                        anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
                        randomAccessFile.Initialize(sb2, ObjectToString, false);
                        try {
                            if (randomAccessFile.getSize() > 0) {
                                java.lang.String ObjectToString3 = anywheresoftware.b4a.BA.ObjectToString(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition));
                                anywheresoftware.b4a.keywords.Regex regex2 = anywheresoftware.b4a.keywords.Common.Regex;
                                java.lang.String[] Split2 = anywheresoftware.b4a.keywords.Regex.Split("_", ObjectToString3);
                                for (int i3 = 0; randomAccessFile.CurrentPosition < randomAccessFile.getSize() && i3 <= Split2.length; i3++) {
                                    anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
                                    map.Initialize();
                                    map.Put("tavolo", Split2[i3]);
                                    new anywheresoftware.b4a.objects.collections.Map();
                                    anywheresoftware.b4a.objects.collections.Map map2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) randomAccessFile.ReadObject(randomAccessFile.CurrentPosition));
                                    cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                    anywheresoftware.b4a.BA ba = processBA;
                                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "tavoli", map2, map);
                                }
                                randomAccessFile.Close();
                                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                                anywheresoftware.b4a.objects.streams.File.Delete(sb2, ObjectToString);
                            } else {
                                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, "Errore durante l'invio del file");
                                return "";
                            }
                        } catch (java.lang.Exception e) {
                            processBA.setLastException(e);
                            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                            randomAccessFile.Close();
                            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Delete(sb2, ObjectToString);
                            return "";
                        }
                    }
                }
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            } catch (java.lang.Exception e2) {
                processBA.setLastException(e2);
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore nel formato del file arrivato dal server.");
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                    anywheresoftware.b4a.BA ba2 = processBA;
                    cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba2, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                }
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                return "";
            }
        }
        return "";
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.collections.List().Initialize();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
        if (ListFiles.getSize() <= 0) {
            return false;
        }
        int size = ListFiles.getSize() - 1;
        for (int i = 0; i <= size; i++) {
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
            if (ObjectToString.startsWith("V") && ObjectToString.endsWith(".txt")) {
                return true;
            }
        }
        return false;
    }

    public static void _exportpalmari(anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_ExportPalmari(null, cursorWrapper).resume(processBA, null);
    }

    public static class ResumableSub_ExportPalmari extends anywheresoftware.b4a.BA.ResumableSub {
        anywheresoftware.b4a.sql.SQL.CursorWrapper _cursorricerca;
        int limit1;
        cassandraRisto.ital.httpclient parent;
        int step1;
        int _i = 0;
        anywheresoftware.b4a.objects.collections.List _files = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        cassandraRisto.ital.httpjob _job2 = null;
        java.lang.String _mresult = "";

        public ResumableSub_ExportPalmari(cassandraRisto.ital.httpclient httpclientVar, anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper) {
            this.parent = httpclientVar;
            this._cursorricerca = cursorWrapper;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                switch (this.state) {
                    case -1:
                        return;
                    case 0:
                        this.state = 1;
                        break;
                    case 1:
                        this.state = 36;
                        this.step1 = 1;
                        this.limit1 = this._cursorricerca.getRowCount() - 1;
                        this._i = 0;
                        this.state = 37;
                        break;
                    case 3:
                        this.state = 4;
                        this._cursorricerca.setPosition(this._i);
                        break;
                    case 4:
                        this.state = 35;
                        if (this._cursorricerca.GetInt("Attivo") != 1) {
                            break;
                        } else {
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(this._cursorricerca.GetString("Serial")).toString(), "dati.zip")) {
                                break;
                            } else {
                                this.state = 6;
                                break;
                            }
                        }
                    case 6:
                        this.state = 7;
                        this._files = new anywheresoftware.b4a.objects.collections.List();
                        this._files.Initialize();
                        this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                        this._fd.Initialize();
                        cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                        cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        _multipartfiledataVar.Dir = sb2.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(this._cursorricerca.GetString("Serial")).toString();
                        this._fd.FileName = "dati.zip";
                        this._fd.KeyName = "upfile";
                        this._fd.ContentType = "application/octet-stream";
                        this._files.Add(this._fd);
                        this._nv = new anywheresoftware.b4a.objects.collections.Map();
                        this._nv.Initialize();
                        this._nv.Put("upfile", "dati.zip");
                        break;
                    case 7:
                        this.state = 10;
                        cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                        cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!cassandraRisto.ital.main._v_attivakeyhttp) {
                            break;
                        } else {
                            this.state = 9;
                            break;
                        }
                    case 9:
                        this.state = 10;
                        anywheresoftware.b4a.objects.collections.Map map = this._nv;
                        cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        map.Put("mk", cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv2(cassandraRisto.ital.httpclient.processBA));
                        this._nv.Put("CMD", "write");
                        break;
                    case 10:
                        this.state = 11;
                        this._job2 = new cassandraRisto.ital.httpjob();
                        this._job2._initialize(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.BA.NumberToString(this._cursorricerca.GetInt("Serial")), cassandraRisto.ital.httpclient.getObject());
                        break;
                    case 11:
                        this.state = 16;
                        cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                        cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_attivakeyhttp) {
                            this.state = 13;
                            break;
                        } else {
                            this.state = 15;
                            break;
                        }
                    case 13:
                        this.state = 16;
                        this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("http://" + this._cursorricerca.GetString("IP") + ":12315", this._nv, this._files);
                        break;
                    case 15:
                        this.state = 16;
                        this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("http://" + this._cursorricerca.GetString("IP") + ":12315/write", this._nv, this._files);
                        break;
                    case 16:
                        this.state = 17;
                        anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                        this.state = 39;
                        return;
                    case 17:
                        this.state = 34;
                        if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                            this.state = 19;
                            break;
                        } else {
                            this.state = 29;
                            break;
                        }
                    case 19:
                        this.state = 20;
                        this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        break;
                    case 20:
                        this.state = 27;
                        if (!this._mresult.equals("OK")) {
                            this.state = 22;
                            break;
                        } else {
                            break;
                        }
                    case 22:
                        this.state = 23;
                        break;
                    case 23:
                        this.state = 26;
                        cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("ConfPalmari")) {
                                break;
                            }
                        }
                        this.state = 25;
                        break;
                    case 25:
                        this.state = 26;
                        anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._mresult);
                        break;
                    case 26:
                        this.state = 27;
                        break;
                    case 27:
                        this.state = 34;
                        break;
                    case 29:
                        this.state = 30;
                        break;
                    case 30:
                        this.state = 33;
                        cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("ConfPalmari")) {
                                break;
                            }
                        }
                        this.state = 32;
                        break;
                    case 32:
                        this.state = 33;
                        anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Il palmare " + this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 + " non è stato aggiornato");
                        break;
                    case 33:
                        this.state = 34;
                        break;
                    case 34:
                        this.state = 35;
                        this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        break;
                    case 35:
                        this.state = 38;
                        break;
                    case 36:
                        this.state = -1;
                        break;
                    case 37:
                        this.state = 36;
                        if ((this.step1 > 0 && this._i <= this.limit1) || (this.step1 < 0 && this._i >= this.limit1)) {
                            this.state = 3;
                            break;
                        }
                        break;
                    case 38:
                        this.state = 37;
                        this._i = this._i + 0 + this.step1;
                        break;
                    case 39:
                        this.state = 17;
                        this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                        break;
                }
            }
        }
    }

    public static java.lang.String _gestionecentralizzataclienti(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "saldicliente", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/saldicliente_").append(str).toString());
        anywheresoftware.b4a.BA ba = processBA;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", true, "Richiesta saldo cliente in corso ...");
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws java.lang.Exception {
        _vv1++;
        java.lang.String str = "Errore di comunicazione con il 2° Tablet";
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_glory > 0) {
            str = "Errore di comunicazione con il Cash Management";
        }
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_logvd) {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(processBA, str, "");
        }
        anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(str), true);
        if (_vv1 > 500 && anywheresoftware.b4a.keywords.Common.Not(_vv7)) {
            _vv7 = true;
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", str);
                return "";
            }
            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(str), true);
            return "";
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str) throws java.lang.Exception {
        boolean z;
        if (str.equals("")) {
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
            if (str.equals("Errore di comunicazione con il server")) {
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
                        z = true;
                        if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                            anywheresoftware.b4a.BA ba = processBA;
                            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", str);
                            return "";
                        }
                    }
                }
            }
            z = false;
            if (anywheresoftware.b4a.keywords.Common.Not(z)) {
            }
        }
        anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(str), true);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
            anywheresoftware.b4a.BA ba = processBA;
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.mod1._vvv7, "AnnullaoRiprovaChiusuraTavoloDaClient");
            return "";
        }
        anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Errore di comunicazione con il server"), true);
        return "";
    }

    public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        cassandraRisto.ital.httpclient.ResumableSub_GetAPI resumableSub_GetAPI = new cassandraRisto.ital.httpclient.ResumableSub_GetAPI(null, str, str2);
        resumableSub_GetAPI.resume(processBA, null);
        return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), resumableSub_GetAPI);
    }

    public static class ResumableSub_GetAPI extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _api;
        java.lang.String _stoken;
        cassandraRisto.ital.httpclient parent;
        boolean _bexists = false;
        cassandraRisto.ital.httpjob _j = null;
        boolean _bsucces = false;
        java.lang.String _smsg = "";
        anywheresoftware.b4a.objects.collections.Map _myjson = null;
        anywheresoftware.b4a.objects.collections.JSONParser _json = null;
        anywheresoftware.b4a.objects.collections.List _m = null;
        anywheresoftware.b4a.objects.collections.Map _mtmpmap = null;
        anywheresoftware.b4a.objects.StringUtils _su = null;
        java.lang.String _stesto = "";
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsgetprg = null;
        boolean _besisteagg = false;
        java.lang.String _sbstmp = "";
        int _ifrom = 0;
        byte[] _buffer = null;
        java.lang.String _sfilename = "";

        public ResumableSub_GetAPI(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str, java.lang.String str2) {
            this.parent = httpclientVar;
            this._stoken = str;
            this._api = str2;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, null);
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 84;
                            this.catchState = 83;
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            this.catchState = 83;
                            this._bexists = false;
                            this._j = new cassandraRisto.ital.httpjob();
                            this._j._initialize(cassandraRisto.ital.httpclient.processBA, "GetAPI", cassandraRisto.ital.httpclient.getObject());
                            anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InitializeGet(sb.append(cassandraRisto.ital.main._v_webapiindirizzo).append(this._api).toString());
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1().SetHeader("Token", this._stoken);
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                            cassandraRisto.ital.httputils2service httputils2serviceVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba2, cassandraRisto.ital.httputils2service.getObject(), "SubmitJob", this._j);
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._j);
                            this.state = 85;
                            return;
                        case 4:
                            this.state = 81;
                            if (this._api.startsWith("/Aggiornamentoapi") && this._bsucces) {
                                this.state = 6;
                                break;
                            } else if (this._api.startsWith("/Programma/") && this._bsucces) {
                                this.state = 66;
                                break;
                            } else {
                                this.state = 80;
                                break;
                            }
                        case 6:
                            this.state = 7;
                            this._smsg = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            this._myjson = new anywheresoftware.b4a.objects.collections.Map();
                            this._json = new anywheresoftware.b4a.objects.collections.JSONParser();
                            this._json.Initialize(this._smsg);
                            this._myjson = this._json.NextObject();
                            this._m = new anywheresoftware.b4a.objects.collections.List();
                            break;
                        case 7:
                            this.state = 64;
                            if (!this._myjson.ContainsKey("Aggiornamentoapi")) {
                                break;
                            } else {
                                this.state = 9;
                                break;
                            }
                        case 9:
                            this.state = 10;
                            this._m = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List) this._myjson.Get("Aggiornamentoapi"));
                            this._bexists = true;
                            this._mtmpmap = new anywheresoftware.b4a.objects.collections.Map();
                            this._mtmpmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) this._m.Get(0));
                            this._su = new anywheresoftware.b4a.objects.StringUtils();
                            break;
                        case 10:
                            this.state = 23;
                            if (!this._mtmpmap.ContainsKey("Messaggio")) {
                                break;
                            } else {
                                this.state = 12;
                                break;
                            }
                        case 12:
                            this.state = 13;
                            this._stesto = anywheresoftware.b4a.BA.ObjectToString(this._mtmpmap.GetDefault("Messaggio", ""));
                            break;
                        case 13:
                            this.state = 22;
                            if (!this._stesto.equals("")) {
                                this.state = 15;
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            this.state = 16;
                            cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                            cassandraRisto.ital.httpclient._vv6 = true;
                            break;
                        case 16:
                            this.state = 21;
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                this.state = 18;
                                break;
                            } else {
                                this.state = 20;
                                break;
                            }
                        case 18:
                            this.state = 21;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._stesto);
                            break;
                        case 20:
                            this.state = 21;
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(this._stesto), true);
                            break;
                        case 21:
                            this.state = 22;
                            break;
                        case 22:
                            this.state = 23;
                            break;
                        case 23:
                            this.state = 30;
                            if (!this._mtmpmap.ContainsKey("Programma")) {
                                break;
                            } else {
                                this.state = 25;
                                break;
                            }
                        case 25:
                            this.state = 26;
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba4, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", true, "Attendere ... Download nuova versione in corso .....");
                            this._rsgetprg = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            this._rsgetprg = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(this._stoken, "/Programma/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Programma")) + "");
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rsgetprg);
                            this.state = 86;
                            return;
                        case 26:
                            this.state = 29;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._besisteagg)) {
                                break;
                            } else {
                                this.state = 28;
                                break;
                            }
                        case 28:
                            this.state = 29;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._stoken, "/Aggiornamentoapi/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Id")) + "?Stato=4");
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, false);
                            return;
                        case 29:
                            this.state = 30;
                            break;
                        case 30:
                            this.state = 37;
                            if (!this._mtmpmap.ContainsKey("Programma1")) {
                                break;
                            } else {
                                this.state = 32;
                                break;
                            }
                        case 32:
                            this.state = 33;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba5, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", true, "Attendere ... Download InvioFE in corso .....");
                            this._rsgetprg = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            this._rsgetprg = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(this._stoken, "/Programma/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Programma1")) + "");
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rsgetprg);
                            this.state = 87;
                            return;
                        case 33:
                            this.state = 36;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._besisteagg)) {
                                break;
                            } else {
                                this.state = 35;
                                break;
                            }
                        case 35:
                            this.state = 36;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._stoken, "/Aggiornamentoapi/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Id")) + "?Stato=4");
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, false);
                            return;
                        case 36:
                            this.state = 37;
                            break;
                        case 37:
                            this.state = 44;
                            if (!this._mtmpmap.ContainsKey("Programma2")) {
                                break;
                            } else {
                                this.state = 39;
                                break;
                            }
                        case 39:
                            this.state = 40;
                            anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba6, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", true, "Attendere ... Download wPalmRistorAndro in corso .....");
                            this._rsgetprg = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            this._rsgetprg = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(this._stoken, "/Programma/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Programma2")) + "");
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rsgetprg);
                            this.state = 88;
                            return;
                        case 40:
                            this.state = 43;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._besisteagg)) {
                                break;
                            } else {
                                this.state = 42;
                                break;
                            }
                        case 42:
                            this.state = 43;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._stoken, "/Aggiornamentoapi/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Id")) + "?Stato=4");
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, false);
                            return;
                        case 43:
                            this.state = 44;
                            break;
                        case 44:
                            this.state = 51;
                            if (!this._mtmpmap.ContainsKey("Programma4")) {
                                break;
                            } else {
                                this.state = 46;
                                break;
                            }
                        case 46:
                            this.state = 47;
                            anywheresoftware.b4a.BA ba7 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba7, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", true, "Attendere ... Download Spooler in corso .....");
                            this._rsgetprg = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            this._rsgetprg = cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(this._stoken, "/Programma/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Programma4")) + "");
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.httpclient.processBA, this, this._rsgetprg);
                            this.state = 89;
                            return;
                        case 47:
                            this.state = 50;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._besisteagg)) {
                                break;
                            } else {
                                this.state = 49;
                                break;
                            }
                        case 49:
                            this.state = 50;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._stoken, "/Aggiornamentoapi/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Id")) + "?Stato=4");
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, false);
                            return;
                        case 50:
                            this.state = 51;
                            break;
                        case 51:
                            this.state = 54;
                            if (!this._mtmpmap.ContainsKey("BasicSupport")) {
                                break;
                            } else {
                                this.state = 53;
                                break;
                            }
                        case 53:
                            this.state = 54;
                            this._sbstmp = anywheresoftware.b4a.BA.ObjectToString(this._mtmpmap.Get("BasicSupport"));
                            this._ifrom = this._sbstmp.indexOf("base64,") + 7;
                            this._buffer = this._su.DecodeBase64(this._sbstmp.substring(this._ifrom));
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.WriteString(sb2.append(anywheresoftware.b4a.objects.streams.File.getDirInternal()).append("/Updater/WebApi").toString(), "BasicSupport.bs", anywheresoftware.b4a.keywords.Common.BytesToString(this._buffer, 0, this._buffer.length, "UTF-8"));
                            break;
                        case 54:
                            this.state = 57;
                            if (!this._mtmpmap.ContainsKey("FileConfig")) {
                                break;
                            } else {
                                this.state = 56;
                                break;
                            }
                        case 56:
                            this.state = 57;
                            this._sbstmp = anywheresoftware.b4a.BA.ObjectToString(this._mtmpmap.Get("FileConfig"));
                            this._ifrom = this._sbstmp.indexOf("base64,") + 7;
                            this._buffer = this._su.DecodeBase64(this._sbstmp.substring(this._ifrom));
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.WriteString(sb3.append(anywheresoftware.b4a.objects.streams.File.getDirInternal()).append("/Updater/WebApi").toString(), "Config.txt", anywheresoftware.b4a.keywords.Common.BytesToString(this._buffer, 0, this._buffer.length, "UTF-8"));
                            break;
                        case 57:
                            this.state = 60;
                            if (!this._mtmpmap.ContainsKey("CodiceAttivazione")) {
                                break;
                            } else {
                                this.state = 59;
                                break;
                            }
                        case 59:
                            this.state = 60;
                            this._sbstmp = anywheresoftware.b4a.BA.ObjectToString(this._mtmpmap.Get("CodiceAttivazione"));
                            this._ifrom = this._sbstmp.indexOf("base64,") + 7;
                            this._buffer = this._su.DecodeBase64(this._sbstmp.substring(this._ifrom));
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.WriteString(sb4.append(anywheresoftware.b4a.objects.streams.File.getDirInternal()).append("/Updater/WebApi").toString(), "CodiceAttivazione.txt", anywheresoftware.b4a.keywords.Common.BytesToString(this._buffer, 0, this._buffer.length, "UTF-8"));
                            break;
                        case 60:
                            this.state = 63;
                            if (!this._mtmpmap.ContainsKey("SQL")) {
                                break;
                            } else {
                                this.state = 62;
                                break;
                            }
                        case 62:
                            this.state = 63;
                            this._sbstmp = anywheresoftware.b4a.BA.ObjectToString(this._mtmpmap.Get("SQL"));
                            this._ifrom = this._sbstmp.indexOf("base64,") + 7;
                            this._buffer = this._su.DecodeBase64(this._sbstmp.substring(this._ifrom));
                            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.WriteString(sb5.append(anywheresoftware.b4a.objects.streams.File.getDirInternal()).append("/Updater/WebApi").toString(), "Aggiorna.sql", anywheresoftware.b4a.keywords.Common.BytesToString(this._buffer, 0, this._buffer.length, "UTF-8"));
                            break;
                        case 63:
                            this.state = 64;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._stoken, "/Aggiornamentoapi/" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._mtmpmap.Get("Id")) + "?Stato=2");
                            break;
                        case 64:
                            this.state = 81;
                            break;
                        case 66:
                            this.state = 67;
                            this._smsg = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            this._myjson = new anywheresoftware.b4a.objects.collections.Map();
                            this._json = new anywheresoftware.b4a.objects.collections.JSONParser();
                            this._json.Initialize(this._smsg);
                            this._myjson = this._json.NextObject();
                            break;
                        case 67:
                            this.state = 78;
                            if (!this._myjson.ContainsKey("Fileapk")) {
                                break;
                            } else {
                                this.state = 69;
                                break;
                            }
                        case 69:
                            this.state = 70;
                            this._su = new anywheresoftware.b4a.objects.StringUtils();
                            this._sbstmp = anywheresoftware.b4a.BA.ObjectToString(this._myjson.Get("Fileapk"));
                            this._ifrom = this._sbstmp.indexOf("base64,") + 7;
                            this._buffer = this._su.DecodeBase64(this._sbstmp.substring(this._ifrom));
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._sfilename = sb6.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7).append("_").append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.BA.ObjectToNumber(this._myjson.GetDefault("Versione", 1)) * 100.0d)).append(".apk").toString();
                            break;
                        case 70:
                            this.state = 77;
                            if (4.0d != anywheresoftware.b4a.BA.ObjectToNumber(this._myjson.Get("TipoProgramma"))) {
                                if (3.0d != anywheresoftware.b4a.BA.ObjectToNumber(this._myjson.Get("TipoProgramma"))) {
                                    if (5.0d != anywheresoftware.b4a.BA.ObjectToNumber(this._myjson.Get("TipoProgramma"))) {
                                        break;
                                    } else {
                                        this.state = 76;
                                        break;
                                    }
                                } else {
                                    this.state = 74;
                                    break;
                                }
                            } else {
                                this.state = 72;
                                break;
                            }
                        case 72:
                            this.state = 77;
                            this._sfilename = "InvioFE_" + anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.BA.ObjectToNumber(this._myjson.GetDefault("Versione", 1)) * 100.0d) + ".apk";
                            break;
                        case 74:
                            this.state = 77;
                            this._sfilename = "wPalmRistorAndro_" + anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.BA.ObjectToNumber(this._myjson.GetDefault("Versione", 1)) * 100.0d) + ".apk";
                            break;
                        case 76:
                            this.state = 77;
                            this._sfilename = "Spooler_" + anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.BA.ObjectToNumber(this._myjson.GetDefault("Versione", 1)) * 100.0d) + ".apk";
                            break;
                        case 77:
                            this.state = 78;
                            anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.WriteBytes(sb7.append(anywheresoftware.b4a.objects.streams.File.getDirInternal()).append("/Updater/WebApi").toString(), this._sfilename, this._buffer);
                            anywheresoftware.b4a.BA ba8 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba8, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, true);
                            return;
                        case 78:
                            this.state = 81;
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, false);
                            return;
                        case 80:
                            this.state = 81;
                            this._bexists = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                            anywheresoftware.b4a.BA ba9 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba9, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            break;
                        case 81:
                            this.state = 84;
                            break;
                        case 83:
                            this.state = 84;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            anywheresoftware.b4a.BA ba10 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba10, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                            break;
                        case 84:
                            this.state = -1;
                            this.catchState = 0;
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, java.lang.Boolean.valueOf(this._bexists));
                            return;
                        case 85:
                            this.state = 4;
                            this._j = (cassandraRisto.ital.httpjob) objArr[0];
                            this._bsucces = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                            break;
                        case 86:
                            this.state = 26;
                            this._besisteagg = ((java.lang.Boolean) objArr[0]).booleanValue();
                            break;
                        case 87:
                            this.state = 33;
                            this._besisteagg = ((java.lang.Boolean) objArr[0]).booleanValue();
                            break;
                        case 88:
                            this.state = 40;
                            this._besisteagg = ((java.lang.Boolean) objArr[0]).booleanValue();
                            break;
                        case 89:
                            this.state = 47;
                            this._besisteagg = ((java.lang.Boolean) objArr[0]).booleanValue();
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.httpclient.ResumableSub_GetAPITokenas resumableSub_GetAPITokenas = new cassandraRisto.ital.httpclient.ResumableSub_GetAPITokenas(null, str);
        resumableSub_GetAPITokenas.resume(processBA, null);
        return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), resumableSub_GetAPITokenas);
    }

    public static class ResumableSub_GetAPITokenas extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _indirizzo;
        cassandraRisto.ital.httpclient parent;
        java.lang.String _stoken = "";
        cassandraRisto.ital.httpjob _j = null;
        java.lang.String _smsg = "";
        anywheresoftware.b4a.objects.collections.Map _myjson = null;
        anywheresoftware.b4a.objects.collections.JSONParser _json = null;

        public ResumableSub_GetAPITokenas(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str) {
            this.parent = httpclientVar;
            this._indirizzo = str;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, null);
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 16;
                            this.catchState = 15;
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            this.catchState = 15;
                            this._stoken = "";
                            this._j = new cassandraRisto.ital.httpjob();
                            this._j._initialize(cassandraRisto.ital.httpclient.processBA, "GetAPIToken", cassandraRisto.ital.httpclient.getObject());
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(this._indirizzo + "/Token/1");
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._j);
                            this.state = 17;
                            return;
                        case 4:
                            this.state = 13;
                            if (this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                                this.state = 6;
                                break;
                            } else {
                                this.state = 12;
                                break;
                            }
                        case 6:
                            this.state = 7;
                            this._smsg = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            this._myjson = new anywheresoftware.b4a.objects.collections.Map();
                            this._json = new anywheresoftware.b4a.objects.collections.JSONParser();
                            this._json.Initialize(this._smsg);
                            this._myjson = this._json.NextObject();
                            break;
                        case 7:
                            this.state = 10;
                            if (!this._myjson.ContainsKey("Token")) {
                                break;
                            } else {
                                this.state = 9;
                                break;
                            }
                        case 9:
                            this.state = 10;
                            this._stoken = anywheresoftware.b4a.BA.ObjectToString(this._myjson.Get("Token"));
                            break;
                        case 10:
                            this.state = 13;
                            break;
                        case 12:
                            this.state = 13;
                            this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            break;
                        case 13:
                            this.state = 16;
                            break;
                        case 15:
                            this.state = 16;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 16:
                            this.state = -1;
                            this.catchState = 0;
                            anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, this._stoken);
                            return;
                        case 17:
                            this.state = 4;
                            this._j = (cassandraRisto.ital.httpjob) objArr[0];
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static java.lang.String _getdatacashlogy() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_ipvis.equals("")) {
            return "Configurare l'indirizzo Ip del VisionDroid";
        }
        if (!_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                httpjobVar._initialize(processBA, "CashlogyGetData", getObject());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=getdata").toString(), "");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_logvd) {
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = processBA;
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=getdata").toString(), "");
                }
                return "";
            }
        }
        return "il Cash management risulta essere offline";
    }

    public static java.lang.String _getdaticliente(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "daticliente", getObject());
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("http://ec.europa.eu/taxation_customs/vies/services/checkVatService", str);
        return "";
    }

    public static java.lang.String _getlistaoraripernotazionidaclient() throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "getoraridaclient", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/orari").toString());
        return "";
    }

    public static java.lang.String _getlistaoraripernotazionidaclientpervisualizzazione() throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "getoraridaclientV", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/orari").toString());
        return "";
    }

    public static java.lang.String _getlistasospesidaclient() throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "getsospesidaclient", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/getsospesi_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append2.append(cassandraRisto.ital.main._v_numcassa).toString());
        return "";
    }

    public static java.lang.String _getsacchettone(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "sacchettone", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipserverbila).append(":").append("12399").append("/upload?type=sacchettone").toString(), str);
        return "";
    }

    public static java.lang.String _getvariazionidaclient(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, str, getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/getvar_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.main._v_mver).append("_");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append3.append(cassandraRisto.ital.main._v_numcassa).toString());
        return "";
    }

    public static java.lang.String _getvariazionitavolidaclient(boolean z) throws java.lang.Exception {
        cassandraRisto.ital.starter starterVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setEnabled(false);
        cassandraRisto.ital.starter starterVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = anywheresoftware.b4a.keywords.DateTime.getNow();
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "getvardaclientT", getObject());
        if (z) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/getvartAll_");
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append2.append(cassandraRisto.ital.main._v_numcassa).toString());
            return "";
        }
        java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append4 = append3.append(cassandraRisto.ital.main._v_ipserver).append(":12312/getvart_");
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append4.append(cassandraRisto.ital.main._v_numcassa).toString());
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!cassandraRisto.ital.main._v_ipvis.equals("") && !_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                httpjobVar._initialize(processBA, "restore2", getObject());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/DownloadBK").toString(), "");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_logvd) {
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = processBA;
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/DownloadBK").toString(), "");
                }
                return "";
            }
        }
        return "";
    }

    public static java.lang.String _grantcashology() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!cassandraRisto.ital.main._v_ipvis.equals("") && !_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                httpjobVar._initialize(processBA, "Cashlogy", getObject());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.String sb = append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=grant").toString();
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb, anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._operatore));
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_logvd) {
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = processBA;
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=bk").toString(), "get");
                }
                return "";
            }
        }
        return "";
    }

    public static java.lang.String _infinityeroga(anywheresoftware.b4a.objects.collections.Map map) throws java.lang.Exception {
        try {
            if (map.getSize() > 0) {
                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.String NumberToString = anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.DateTime.getNow());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipdistributore).append(":14532/Eroga_").append(NumberToString).append("_");
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._operatore)).append("_");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.String sb = append3.append(cassandraRisto.ital.main._v_numcassa).append("_").toString();
                anywheresoftware.b4a.BA.IterableList Keys = map.Keys();
                int size = Keys.getSize();
                int i = 0;
                while (i < size) {
                    java.lang.Object Get = Keys.Get(i);
                    i++;
                    sb = sb + anywheresoftware.b4a.BA.ObjectToString(Get) + "_" + anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.BA.ObjectToNumber(map.GetDefault(Get, 1)), 1, 0, 0, false) + "_";
                }
                if (sb.endsWith("_")) {
                    sb = sb.substring(0, sb.length() - "_".length());
                }
                _comunicaconinfinity(sb);
                return "";
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            anywheresoftware.b4a.keywords.Common.LogImpl("462062617", "TmpMapArticoliInfinity: " + anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage(), 0);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, "TmpMapArticoliInfinity: " + anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _inventarioglory() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_ipvis.equals("")) {
            return "Configurare l'indirizzo Ip del VisionDroid";
        }
        if (!_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                httpjobVar._initialize(processBA, "glorySendInventario", getObject());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=InventarioGlory").toString(), "");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_logvd) {
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = processBA;
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=InventarioGlory").toString(), "");
                }
                return "Richiesta Inventario Cash Management Inviata";
            }
        }
        return "il Cash Management risulta essere offline";
    }

    public static void _inviaclientealserver() throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_InviaClienteAlServer(null).resume(processBA, null);
    }

    public static class ResumableSub_InviaClienteAlServer extends anywheresoftware.b4a.BA.ResumableSub {
        int limit42;
        int limit6;
        cassandraRisto.ital.httpclient parent;
        int step42;
        int step6;
        java.lang.String[] _mfile = null;
        anywheresoftware.b4a.objects.collections.List _ls = null;
        int _i = 0;
        java.lang.String _zipname = "";
        flm.b4a.archiver.ArchiverForB4A _myzip = null;
        anywheresoftware.b4a.objects.collections.List _files = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        cassandraRisto.ital.httpjob _job2 = null;
        java.lang.String _mresult = "";
        int _x = 0;

        public ResumableSub_InviaClienteAlServer(cassandraRisto.ital.httpclient httpclientVar) {
            this.parent = httpclientVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:153:0x0411  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0052 A[SYNTHETIC] */
        @Override // anywheresoftware.b4a.BA.ResumableSub
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                } catch (java.lang.Exception e) {
                    if (this.catchState != 0) {
                    }
                }
                switch (this.state) {
                    case -1:
                        return;
                    case 0:
                        this.state = 1;
                        this._mfile = new java.lang.String[1];
                        java.util.Arrays.fill(this._mfile, "");
                        this._mfile[0] = "ModCliente.txt";
                        this._ls = new anywheresoftware.b4a.objects.collections.List();
                        this._ls.Initialize();
                        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar = this.parent;
                        cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._ls = anywheresoftware.b4a.objects.streams.File.ListFiles(sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString());
                        continue;
                    case 1:
                        this.state = 4;
                        this.step6 = 1;
                        this.limit6 = this._ls.getSize() - 1;
                        this._i = 0;
                        this.state = 35;
                        continue;
                    case 2:
                    case 6:
                    case 9:
                    case 12:
                    case 15:
                    case 17:
                    case 20:
                    case 23:
                    case 28:
                    case 31:
                    default:
                        continue;
                    case 3:
                        this.state = 36;
                        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                        cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.objects.streams.File.Delete(sb2.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString(), anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(this._i)));
                        continue;
                    case 4:
                        this.state = 5;
                        java.lang.StringBuilder append = new java.lang.StringBuilder().append("ModCliente");
                        cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                        cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._zipname = append.append(cassandraRisto.ital.main._v_numcassa).append(".zip").toString();
                        this._myzip = new flm.b4a.archiver.ArchiverForB4A();
                        flm.b4a.archiver.ArchiverForB4A archiverForB4A = this._myzip;
                        anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.String sb4 = sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/TMP").toString();
                        java.lang.String[] strArr = this._mfile;
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                        cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        archiverForB4A.ZipFiles(ba2, sb4, strArr, sb5.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString(), this._zipname, "");
                        continue;
                    case 5:
                        this.state = 34;
                        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                        cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (anywheresoftware.b4a.objects.streams.File.Exists(sb6.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString(), this._zipname)) {
                            this.state = 7;
                        } else {
                            continue;
                        }
                    case 7:
                        this.state = 8;
                        this._files = new anywheresoftware.b4a.objects.collections.List();
                        this._files.Initialize();
                        this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                        this._fd.Initialize();
                        cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                        cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        _multipartfiledataVar.Dir = sb7.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString();
                        this._fd.FileName = this._zipname;
                        this._fd.KeyName = "upfile";
                        this._fd.ContentType = "application/octet-stream";
                        this._files.Add(this._fd);
                        this._nv = new anywheresoftware.b4a.objects.collections.Map();
                        this._nv.Initialize();
                        this._nv.Put("upfile", this._zipname);
                        anywheresoftware.b4a.objects.collections.Map map = this._nv;
                        cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                        cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
                        this._job2 = new cassandraRisto.ital.httpjob();
                        this._job2._initialize(cassandraRisto.ital.httpclient.processBA, "1", cassandraRisto.ital.httpclient.getObject());
                        cassandraRisto.ital.httpjob httpjobVar = this._job2;
                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                        cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                        cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append2.append(cassandraRisto.ital.main._v_ipserver).append(":12312/updcliente").toString(), this._nv, this._files);
                        anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba3, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", true, "Invio Dati al server in Corso");
                        anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                        this.state = 37;
                        return;
                    case 8:
                        this.state = 33;
                        if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                            this.state = 10;
                        } else {
                            this.state = 32;
                            continue;
                        }
                    case 10:
                        this.state = 11;
                        continue;
                    case 11:
                        this.state = 30;
                        this.catchState = 29;
                        this.state = 13;
                        continue;
                    case 13:
                        this.state = 14;
                        this.catchState = 29;
                        this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        continue;
                    case 14:
                        this.state = 27;
                        if (!this._mresult.equals("OK")) {
                            this.state = 16;
                        } else {
                            this.state = 18;
                            continue;
                        }
                    case 16:
                        this.state = 27;
                        cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                        cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                        anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba4, cassandraRisto.ital.mod1._vvv7, "ErrInvioClienteAlserver");
                        continue;
                    case 18:
                        this.state = 19;
                        this._ls = new anywheresoftware.b4a.objects.collections.List();
                        this._ls.Initialize();
                        anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                        cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                        cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._ls = anywheresoftware.b4a.objects.streams.File.ListFiles(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
                        continue;
                    case 19:
                        this.state = 26;
                        if (this._ls.getSize() > 0) {
                            this.state = 21;
                        } else {
                            continue;
                        }
                    case 21:
                        this.state = 22;
                        continue;
                    case 22:
                        this.state = 25;
                        this.step42 = 1;
                        this.limit42 = this._ls.getSize() - 1;
                        this._x = 0;
                        this.state = 38;
                        continue;
                    case 24:
                        this.state = 39;
                        anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                        cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                        cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(this._x)));
                        continue;
                    case 25:
                        this.state = 26;
                        continue;
                    case 26:
                        this.state = 27;
                        cassandraRisto.ital.httpclient httpclientVar15 = this.parent;
                        cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
                        anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar16 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba5, cassandraRisto.ital.mod1._vvv7, "OKInvioClienteAlserver");
                        continue;
                    case 27:
                        this.state = 30;
                        anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar17 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba6, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        continue;
                    case 29:
                        this.state = 30;
                        this.catchState = 0;
                        cassandraRisto.ital.httpclient httpclientVar18 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                        continue;
                    case 30:
                        this.state = 33;
                        this.catchState = 0;
                        continue;
                    case 32:
                        this.state = 33;
                        cassandraRisto.ital.httpclient httpclientVar19 = this.parent;
                        cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                        anywheresoftware.b4a.BA ba7 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar20 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba7, cassandraRisto.ital.mod1._vvv7, "ErrInvioClienteAlserver");
                        anywheresoftware.b4a.BA ba8 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar21 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba8, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        continue;
                    case 33:
                        this.state = 34;
                        this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        continue;
                    case 34:
                        this.state = -1;
                        continue;
                    case 35:
                        this.state = 4;
                        if ((this.step6 > 0 && this._i <= this.limit6) || (this.step6 < 0 && this._i >= this.limit6)) {
                            this.state = 3;
                            continue;
                        }
                        break;
                    case 36:
                        this.state = 35;
                        this._i = this._i + 0 + this.step6;
                        continue;
                    case 37:
                        this.state = 8;
                        this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                        continue;
                    case 38:
                        this.state = 25;
                        if ((this.step42 > 0 && this._x <= this.limit42) || (this.step42 < 0 && this._x >= this.limit42)) {
                            this.state = 24;
                            continue;
                        }
                        break;
                    case 39:
                        this.state = 38;
                        this._x = this._x + 0 + this.step42;
                        continue;
                }
                if (this.catchState != 0) {
                    throw e;
                }
                this.state = this.catchState;
                cassandraRisto.ital.httpclient.processBA.setLastException(e);
            }
        }
    }

    public static void _inviavendutoclient(java.lang.String str) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_InviaVendutoClient(null, str).resume(processBA, null);
    }

    public static class ResumableSub_InviaVendutoClient extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _riaggiorna;
        int limit14;
        int limit25;
        int limit38;
        int limit43;
        int limit79;
        cassandraRisto.ital.httpclient parent;
        int step14;
        int step25;
        int step38;
        int step43;
        int step79;
        anywheresoftware.b4a.objects.collections.Map _tmplistunlocked = null;
        anywheresoftware.b4a.objects.collections.List _ls = null;
        anywheresoftware.b4a.objects.collections.List _ls2 = null;
        int _x = 0;
        java.lang.String _tmpname = "";
        java.lang.String[] _scol = null;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _tmpc = null;
        int _zz = 0;
        java.lang.String _tmpfn = "";
        java.lang.String[] _mfile = null;
        int _i = 0;
        java.lang.String _zipname = "";
        flm.b4a.archiver.ArchiverForB4A _myzip = null;
        anywheresoftware.b4a.objects.collections.List _files = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        cassandraRisto.ital.httpjob _job2 = null;
        java.lang.String _mresult = "";

        public ResumableSub_InviaVendutoClient(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str) {
            this.parent = httpclientVar;
            this._riaggiorna = str;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 109;
                            this.catchState = 102;
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            this.catchState = 102;
                            break;
                        case 4:
                            this.state = 7;
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
                                break;
                            } else {
                                this.state = 6;
                                break;
                            }
                        case 6:
                            this.state = 7;
                            cassandraRisto.ital.httpclient._sendhellodaclient();
                            return;
                        case 7:
                            this.state = 8;
                            this._tmplistunlocked = new anywheresoftware.b4a.objects.collections.Map();
                            this._tmplistunlocked.Initialize();
                            this._ls = new anywheresoftware.b4a.objects.collections.List();
                            this._ls.Initialize();
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._ls = anywheresoftware.b4a.objects.streams.File.ListFiles(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
                            break;
                        case 8:
                            this.state = 100;
                            if (this._ls.getSize() <= 0) {
                                cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                                cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select count(*) from unlocktbl")) <= 0.0d) {
                                    break;
                                }
                            }
                            this.state = 10;
                            break;
                        case 10:
                            this.state = 11;
                            this._ls2 = new anywheresoftware.b4a.objects.collections.List();
                            this._ls2.Initialize();
                            break;
                        case 11:
                            this.state = 24;
                            this.step14 = 1;
                            this.limit14 = this._ls.getSize() - 1;
                            this._x = 0;
                            this.state = 110;
                            break;
                        case 13:
                            this.state = 14;
                            this._tmpname = anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(this._x));
                            break;
                        case 14:
                            this.state = 23;
                            if (this._tmpname.startsWith("V") && this._tmpname.endsWith(".txt")) {
                                this.state = 16;
                                break;
                            }
                            break;
                        case 16:
                            this.state = 17;
                            this._ls2.Add(this._ls.Get(this._x));
                            this._scol = new java.lang.String[0];
                            java.util.Arrays.fill(this._scol, "");
                            anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                            this._scol = anywheresoftware.b4a.keywords.Regex.Split("_", anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(this._x)));
                            break;
                        case 17:
                            this.state = 22;
                            if (java.lang.Double.parseDouble(this._scol[1]) <= 0.0d) {
                                break;
                            } else {
                                this.state = 19;
                                break;
                            }
                        case 19:
                            this.state = 22;
                            this._tmplistunlocked.Put(this._scol[1], "");
                            break;
                        case 22:
                            this.state = 23;
                            break;
                        case 23:
                            this.state = 111;
                            break;
                        case 24:
                            this.state = 25;
                            this._tmpc = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmpc = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select * from unlocktbl"));
                            break;
                        case 25:
                            this.state = 42;
                            if (this._tmpc.getRowCount() <= 0) {
                                break;
                            } else {
                                this.state = 27;
                                break;
                            }
                        case 27:
                            this.state = 28;
                            break;
                        case 28:
                            this.state = 41;
                            this.step25 = 1;
                            this.limit25 = this._tmpc.getRowCount() - 1;
                            this._zz = 0;
                            this.state = 112;
                            break;
                        case 30:
                            this.state = 31;
                            this._tmpc.setPosition(this._zz);
                            break;
                        case 31:
                            this.state = 40;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._tmplistunlocked.ContainsKey(this._tmpc.GetString("tavolo")))) {
                                break;
                            } else {
                                this.state = 33;
                                break;
                            }
                        case 33:
                            this.state = 34;
                            this._tmpfn = cassandraRisto.ital.httpclient._sbloccatavolodaclient(this._tmpc.GetInt("tavolo"), false);
                            break;
                        case 34:
                            this.state = 39;
                            if (!this._tmpfn.equals("")) {
                                break;
                            } else {
                                this.state = 36;
                                break;
                            }
                        case 36:
                            this.state = 39;
                            return;
                        case 39:
                            this.state = 40;
                            this._ls2.Add(this._tmpfn);
                            break;
                        case 40:
                            this.state = 113;
                            break;
                        case 41:
                            this.state = 42;
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from unlocktbl");
                            break;
                        case 42:
                            this.state = 43;
                            this._tmpc.Close();
                            break;
                        case 43:
                            this.state = 48;
                            if (this._ls2.getSize() != 0) {
                                break;
                            } else {
                                this.state = 45;
                                break;
                            }
                        case 45:
                            this.state = 48;
                            return;
                        case 48:
                            this.state = 49;
                            this._mfile = new java.lang.String[this._ls2.getSize()];
                            java.util.Arrays.fill(this._mfile, "");
                            break;
                        case 49:
                            this.state = 52;
                            this.step38 = 1;
                            this.limit38 = this._ls2.getSize() - 1;
                            this._x = 0;
                            this.state = 114;
                            break;
                        case 51:
                            this.state = 115;
                            this._mfile[this._x] = anywheresoftware.b4a.BA.ObjectToString(this._ls2.Get(this._x));
                            break;
                        case 52:
                            this.state = 53;
                            this._ls.Initialize();
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._ls = anywheresoftware.b4a.objects.streams.File.ListFiles(sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString());
                            break;
                        case 53:
                            this.state = 56;
                            this.step43 = 1;
                            this.limit43 = this._ls.getSize() - 1;
                            this._i = 0;
                            this.state = 116;
                            break;
                        case 55:
                            this.state = 117;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.objects.streams.File.Delete(sb2.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString(), anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(this._i)));
                            break;
                        case 56:
                            this.state = 57;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("V");
                            cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            this._zipname = append.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(ba2, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.httpclient.processBA))).append(".zip").toString();
                            this._myzip = new flm.b4a.archiver.ArchiverForB4A();
                            flm.b4a.archiver.ArchiverForB4A archiverForB4A = this._myzip;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                            cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String str = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.String[] strArr = this._mfile;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                            cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            archiverForB4A.ZipFiles(ba3, str, strArr, sb3.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString(), this._zipname, "");
                            break;
                        case 57:
                            this.state = 99;
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                            cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.objects.streams.File.Exists(sb4.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString(), this._zipname)) {
                                break;
                            } else {
                                this.state = 59;
                                break;
                            }
                        case 59:
                            this.state = 60;
                            this._files = new anywheresoftware.b4a.objects.collections.List();
                            this._files.Initialize();
                            this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                            this._fd.Initialize();
                            cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            _multipartfiledataVar.Dir = sb5.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/TMP").toString();
                            this._fd.FileName = this._zipname;
                            this._fd.KeyName = "upfile";
                            this._fd.ContentType = "application/octet-stream";
                            this._files.Add(this._fd);
                            this._nv = new anywheresoftware.b4a.objects.collections.Map();
                            this._nv.Initialize();
                            this._nv.Put("upfile", this._zipname);
                            anywheresoftware.b4a.objects.collections.Map map = this._nv;
                            cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                            cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
                            this._job2 = new cassandraRisto.ital.httpjob();
                            this._job2._initialize(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.BA.NumberToString(1), cassandraRisto.ital.httpclient.getObject());
                            cassandraRisto.ital.httpjob httpjobVar = this._job2;
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar15 = this.parent;
                            cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append2.append(cassandraRisto.ital.main._v_ipserver).append(":12312/vendutoclient_").append(this._riaggiorna).toString(), this._nv, this._files);
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar16 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba4, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", true, "Invio Dati al server in Corso");
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                            this.state = 118;
                            return;
                        case 60:
                            this.state = 98;
                            if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                                this.state = 62;
                                break;
                            } else {
                                this.state = 93;
                                break;
                            }
                        case 62:
                            this.state = 63;
                            break;
                        case 63:
                            this.state = 91;
                            this.catchState = 90;
                            this.state = 65;
                            break;
                        case 65:
                            this.state = 66;
                            this.catchState = 90;
                            this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            break;
                        case 66:
                            this.state = 85;
                            if (!this._mresult.equals("OK")) {
                                this.state = 68;
                                break;
                            } else {
                                this.state = 76;
                                break;
                            }
                        case 68:
                            this.state = 69;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(this._mresult);
                            break;
                        case 69:
                            this.state = 74;
                            if (!this._mresult.equals("")) {
                                this.state = 71;
                                break;
                            } else {
                                break;
                            }
                        case 71:
                            this.state = 74;
                            cassandraRisto.ital.httpclient httpclientVar17 = this.parent;
                            cassandraRisto.ital.main mainVar14 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                            break;
                        case 74:
                            this.state = 85;
                            break;
                        case 76:
                            this.state = 77;
                            this._ls = new anywheresoftware.b4a.objects.collections.List();
                            this._ls.Initialize();
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.httpclient httpclientVar18 = this.parent;
                            cassandraRisto.ital.main mainVar15 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._ls = anywheresoftware.b4a.objects.streams.File.ListFiles(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
                            break;
                        case 77:
                            this.state = 84;
                            if (this._ls.getSize() <= 0) {
                                break;
                            } else {
                                this.state = 79;
                                break;
                            }
                        case 79:
                            this.state = 80;
                            break;
                        case 80:
                            this.state = 83;
                            this.step79 = 1;
                            this.limit79 = this._ls.getSize() - 1;
                            this._x = 0;
                            this.state = 119;
                            break;
                        case 82:
                            this.state = 120;
                            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.httpclient httpclientVar19 = this.parent;
                            cassandraRisto.ital.main mainVar16 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(this._x)));
                            break;
                        case 83:
                            this.state = 84;
                            break;
                        case 84:
                            this.state = 85;
                            cassandraRisto.ital.httpclient httpclientVar20 = this.parent;
                            cassandraRisto.ital.main mainVar17 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
                            break;
                        case 85:
                            this.state = 88;
                            cassandraRisto.ital.httpclient httpclientVar21 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                break;
                            } else {
                                this.state = 87;
                                break;
                            }
                        case 87:
                            this.state = 88;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar22 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba5, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                            anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar23 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba6, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                            break;
                        case 88:
                            this.state = 91;
                            break;
                        case 90:
                            this.state = 91;
                            this.catchState = 102;
                            cassandraRisto.ital.httpclient httpclientVar24 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 91:
                            this.state = 98;
                            this.catchState = 102;
                            break;
                        case 93:
                            this.state = 94;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di collegamento con il server");
                            cassandraRisto.ital.httpclient httpclientVar25 = this.parent;
                            cassandraRisto.ital.main mainVar18 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                            break;
                        case 94:
                            this.state = 97;
                            cassandraRisto.ital.httpclient httpclientVar26 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                break;
                            } else {
                                this.state = 96;
                                break;
                            }
                        case 96:
                            this.state = 97;
                            anywheresoftware.b4a.BA ba7 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar27 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba7, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                            anywheresoftware.b4a.BA ba8 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar28 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba8, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                            break;
                        case 97:
                            this.state = 98;
                            break;
                        case 98:
                            this.state = 99;
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            break;
                        case 99:
                            this.state = 100;
                            break;
                        case 100:
                            this.state = 109;
                            break;
                        case 102:
                            this.state = 103;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar29 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            cassandraRisto.ital.httpclient httpclientVar30 = this.parent;
                            cassandraRisto.ital.main mainVar19 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                            break;
                        case 103:
                            this.state = 108;
                            cassandraRisto.ital.httpclient httpclientVar31 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                break;
                            } else {
                                this.state = 105;
                                break;
                            }
                        case 105:
                            this.state = 108;
                            anywheresoftware.b4a.BA ba9 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar32 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var13 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba9, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                            break;
                        case 108:
                            this.state = 109;
                            break;
                        case 109:
                            this.state = -1;
                            this.catchState = 0;
                            break;
                        case 110:
                            this.state = 24;
                            if ((this.step14 > 0 && this._x <= this.limit14) || (this.step14 < 0 && this._x >= this.limit14)) {
                                this.state = 13;
                                break;
                            }
                            break;
                        case 111:
                            this.state = 110;
                            this._x = this._x + 0 + this.step14;
                            break;
                        case 112:
                            this.state = 41;
                            if ((this.step25 > 0 && this._zz <= this.limit25) || (this.step25 < 0 && this._zz >= this.limit25)) {
                                this.state = 30;
                                break;
                            }
                            break;
                        case 113:
                            this.state = 112;
                            this._zz = this._zz + 0 + this.step25;
                            break;
                        case 114:
                            this.state = 52;
                            if ((this.step38 > 0 && this._x <= this.limit38) || (this.step38 < 0 && this._x >= this.limit38)) {
                                this.state = 51;
                                break;
                            }
                            break;
                        case 115:
                            this.state = 114;
                            this._x = this._x + 0 + this.step38;
                            break;
                        case 116:
                            this.state = 56;
                            if ((this.step43 > 0 && this._i <= this.limit43) || (this.step43 < 0 && this._i >= this.limit43)) {
                                this.state = 55;
                                break;
                            }
                            break;
                        case 117:
                            this.state = 116;
                            this._i = this._i + 0 + this.step43;
                            break;
                        case 118:
                            this.state = 60;
                            this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                            break;
                        case 119:
                            this.state = 83;
                            if ((this.step79 > 0 && this._x <= this.limit79) || (this.step79 < 0 && this._x >= this.limit79)) {
                                this.state = 82;
                                break;
                            }
                            break;
                        case 120:
                            this.state = 119;
                            this._x = this._x + 0 + this.step79;
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static java.lang.String _jobdone(cassandraRisto.ital.httpjob httpjobVar) throws java.lang.Exception {
        r1 = false;
        r1 = false;
        boolean z = false;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub JobDone (Job As HttpJob)";
        try {
            if (anywheresoftware.b4a.keywords.Common.Not(httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(processBA, "Errore da Job " + httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                if (!httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("WebPrenota") && !httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("CameriereC")) {
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("glorySendImporto")) {
                        anywheresoftware.b4a.BA ba = processBA;
                        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.mod1._vvv7, "Anim_AnimationEnd");
                        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = -1;
                        anywheresoftware.b4a.BA ba2 = processBA;
                        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Errore di comunicazione con il Cash management");
                        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_logvd) {
                            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(processBA, "Errore di comunicazione con il Cash management", "");
                        }
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("restore")) {
                        anywheresoftware.b4a.BA ba3 = processBA;
                        cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Errore di comunicazione con VisionDroid");
                        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_logvd) {
                            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(processBA, "Errore di comunicazione con VisionDroid", "");
                        }
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("varclient")) {
                        if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.length() > 8) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il terminale " + httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.substring(9));
                            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clients set stato =3 where codice = " + httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.substring(9));
                            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clients order by codice"));
                        }
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("CashlogyGetData")) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il CashManagement");
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("getvardaclient") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("hello") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("getoraridaclient")) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il server");
                        if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("getvardaclientT")) {
                            cassandraRisto.ital.starter starterVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setEnabled(true);
                            anywheresoftware.b4a.BA ba4 = processBA;
                            cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba4, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        }
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("sacchettone") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("updbila")) {
                        anywheresoftware.b4a.BA ba5 = processBA;
                        cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba5, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il server bilance");
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("getvardaclientPC")) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il server");
                        anywheresoftware.b4a.BA ba6 = processBA;
                        cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba6, cassandraRisto.ital.main.getObject(), "EseguiChiusura", false, "");
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("saldicliente")) {
                        anywheresoftware.b4a.BA ba7 = processBA;
                        cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba7, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il server");
                        anywheresoftware.b4a.BA ba8 = processBA;
                        cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba8, cassandraRisto.ital.mod1._vvv7, "lblOperatore_Click");
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("daticliente")) {
                        anywheresoftware.b4a.BA ba9 = processBA;
                        cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba9, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2), true);
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("chiudimov") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("recmov") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("opertav") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("apritav") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("uniscidaclient") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("sbloccadaclient") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("spostadaclient") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("contodaclient") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("getsospesidaclient")) {
                        anywheresoftware.b4a.BA ba10 = processBA;
                        cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba10, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("chiudimov")) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il server\nPer chidere il movimento con un cliente selezionato è necessario attivare il collegamento con il Server");
                        } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("recmov")) {
                            anywheresoftware.b4a.BA ba11 = processBA;
                            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba11, cassandraRisto.ital.main.getObject(), "EsciDaMov", false);
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il server");
                        } else {
                            cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il server");
                        }
                        cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 && httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("apritav")) {
                            anywheresoftware.b4a.BA ba12 = processBA;
                            cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba12, cassandraRisto.ital.main.getObject(), "HideShowPnlRicercaT", true);
                        }
                        if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("apritav")) {
                            cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
                        }
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("sospenditav")) {
                        _vv5 = false;
                        anywheresoftware.b4a.BA ba13 = processBA;
                        cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba13, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5();
                    } else if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("Vis")) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
                    }
                }
                cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                    cassandraRisto.ital.mod1 mod1Var15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                        anywheresoftware.b4a.BA ba14 = processBA;
                        cassandraRisto.ital.mod1 mod1Var16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba14, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                    }
                }
            } else {
                if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("CashlogyGetData") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("updbila")) {
                    httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                    return "";
                }
                if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("WebPrenota") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("CameriereC") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("CashlogyGetData")) {
                    httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                    return "";
                }
                if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("glorySendImporto")) {
                    cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_logvd) {
                        cassandraRisto.ital.mod1 mod1Var17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(processBA, "OK", "");
                    }
                    java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.startsWith("GloryErrore:")) {
                        anywheresoftware.b4a.BA ba15 = processBA;
                        cassandraRisto.ital.mod1 mod1Var18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba15, cassandraRisto.ital.mod1._vvv7, "Anim_AnimationEnd");
                        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = -1;
                        anywheresoftware.b4a.BA ba16 = processBA;
                        cassandraRisto.ital.mod1 mod1Var19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba16, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.replace("GloryErrore", "Errore CashManagement"));
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                } else {
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("sacchettone")) {
                        if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2().startsWith("non trovato")) {
                            anywheresoftware.b4a.BA ba17 = processBA;
                            cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba17, cassandraRisto.ital.main.getObject(), "ElaboraSacchettone", false);
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("restore1")) {
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv22 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv22.trim().startsWith("Errore")) {
                            anywheresoftware.b4a.BA ba18 = processBA;
                            cassandraRisto.ital.mod1 mod1Var20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba18, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Non esiste nessun file da ripristinare .");
                        } else if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv22.equals("")) {
                            long parseDouble = (long) java.lang.Double.parseDouble(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv22);
                            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                            java.lang.String Date = anywheresoftware.b4a.keywords.DateTime.Date(parseDouble);
                            java.lang.String str = Date.substring(3, 5) + "/" + Date.substring(0, 2) + "/" + Date.substring(6, 10);
                            anywheresoftware.b4a.BA ba19 = processBA;
                            cassandraRisto.ital.mod1 mod1Var21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.String str2 = cassandraRisto.ital.mod1._vvv7;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Il File disponibile ha la data del ").append(str).append(" ");
                            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                            int ObjectToNumber = (int) anywheresoftware.b4a.BA.ObjectToNumber(anywheresoftware.b4a.keywords.Common.CallSubNew2(ba19, str2, "MsgboxAsk", append.append(anywheresoftware.b4a.keywords.DateTime.Time(parseDouble)).append("\n").append("Si desidera Continuare ? (TUTTI I DATI VERRANNO SOVRASCRITTI) ").toString()));
                            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                            if (ObjectToNumber == -1) {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            }
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("restore2")) {
                        new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
                        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        cassandraRisto.ital.mod1 mod1Var22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput = anywheresoftware.b4a.objects.streams.File.OpenOutput(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/files").toString(), "BKAnagra.zip", false);
                        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Copy2(httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0().getObject(), OpenOutput.getObject());
                        OpenOutput.Close();
                        anywheresoftware.b4a.BA ba20 = processBA;
                        cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba20, cassandraRisto.ital.main.getObject(), "RestoreFile");
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("varclient")) {
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv23 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv23.equals("")) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv23 + "(terminale " + httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.substring(9) + ")");
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("getvardaclient")) {
                        boolean equals = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("getvardaclientPR");
                        boolean equals2 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("getvardaclientPRP");
                        boolean equals3 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("getvardaclientT");
                        boolean equals4 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("getvardaclientPC");
                        cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
                        if (anywheresoftware.b4a.keywords.Common.Not(equals3)) {
                            anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
                            if (anywheresoftware.b4a.keywords.Common.Not(equals) && anywheresoftware.b4a.keywords.Common.Not(equals4) && anywheresoftware.b4a.keywords.Common.Not(equals2)) {
                                z = true;
                            }
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(httpjobVar, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, z);
                        }
                        if (equals || equals2) {
                            cassandraRisto.ital.mod1 mod1Var23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvv7(processBA, true);
                            if (equals) {
                                anywheresoftware.b4a.BA ba21 = processBA;
                                cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba21, cassandraRisto.ital.main.getObject(), "EseguiStampeDay", true);
                            } else {
                                anywheresoftware.b4a.BA ba22 = processBA;
                                cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew(ba22, cassandraRisto.ital.main.getObject(), "EseguiLetturaPersonalizzata");
                            }
                        } else if (equals4) {
                            cassandraRisto.ital.mod1 mod1Var24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvv7(processBA, true);
                            anywheresoftware.b4a.BA ba23 = processBA;
                            cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba23, cassandraRisto.ital.main.getObject(), "EseguiChiusura", false, "");
                        } else if (equals3) {
                            new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
                            anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv02 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv02.BytesAvailable() > 12) {
                                _estraifilevariazionitavoli(httpjobVar, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv02);
                            }
                            cassandraRisto.ital.starter starterVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setEnabled(true);
                            anywheresoftware.b4a.BA ba24 = processBA;
                            cassandraRisto.ital.mod1 mod1Var25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba24, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("saldicliente")) {
                        anywheresoftware.b4a.BA ba25 = processBA;
                        cassandraRisto.ital.mod1 mod1Var26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba25, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        java.util.Arrays.fill(new java.lang.String[0], "");
                        anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                        java.lang.String[] Split = anywheresoftware.b4a.keywords.Regex.Split("_", httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2());
                        if (Split.length > 1) {
                            anywheresoftware.b4a.BA ba26 = processBA;
                            cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba26, cassandraRisto.ital.main.getObject(), "ApplicaCliente", Split);
                        } else {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di comunicazione con il server");
                            anywheresoftware.b4a.BA ba27 = processBA;
                            cassandraRisto.ital.mod1 mod1Var27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba27, cassandraRisto.ital.mod1._vvv7, "lblOperatore_Click");
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("daticliente")) {
                        anywheresoftware.b4a.BA ba28 = processBA;
                        cassandraRisto.ital.mod1 mod1Var28 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba28, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv24 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        anywheresoftware.b4a.BA ba29 = processBA;
                        cassandraRisto.ital.clienti clientiVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba29, cassandraRisto.ital.clienti.getObject(), "GetStringaCliente", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv24);
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("chiudimov")) {
                        anywheresoftware.b4a.BA ba30 = processBA;
                        cassandraRisto.ital.mod1 mod1Var29 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba30, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv25 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv25.startsWith("Errore")) {
                            cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                            cassandraRisto.ital.mod1 mod1Var30 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                anywheresoftware.b4a.BA ba31 = processBA;
                                cassandraRisto.ital.mod1 mod1Var31 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.keywords.Common.CallSubNew(ba31, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                            }
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv25);
                        } else {
                            int parseDouble2 = (int) java.lang.Double.parseDouble(httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.substring(9));
                            anywheresoftware.b4a.BA ba32 = processBA;
                            cassandraRisto.ital.main mainVar25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba32, cassandraRisto.ital.main.getObject(), "StampaSco", java.lang.Integer.valueOf(parseDouble2), 0);
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("sospenditav") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("getoraridaclient")) {
                        _vv5 = false;
                        anywheresoftware.b4a.BA ba33 = processBA;
                        cassandraRisto.ital.mod1 mod1Var32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba33, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv26 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv26.startsWith("Errore")) {
                            cassandraRisto.ital.main mainVar26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                            cassandraRisto.ital.mod1 mod1Var33 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                anywheresoftware.b4a.BA ba34 = processBA;
                                cassandraRisto.ital.mod1 mod1Var34 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.keywords.Common.CallSubNew(ba34, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                            }
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv26);
                        } else {
                            if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("getoraridaclient")) {
                                cassandraRisto.ital.main mainVar27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Clear();
                                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv26.length() > 0) {
                                    java.util.Arrays.fill(new java.lang.String[0], "");
                                    anywheresoftware.b4a.keywords.Regex regex2 = anywheresoftware.b4a.keywords.Common.Regex;
                                    java.lang.String[] Split2 = anywheresoftware.b4a.keywords.Regex.Split("\t", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv26);
                                    cassandraRisto.ital.main mainVar28 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(Split2));
                                }
                            }
                            if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("getoraridaclient") || httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("sospenditav")) {
                                cassandraRisto.ital.main mainVar29 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = true;
                                anywheresoftware.b4a.BA ba35 = processBA;
                                cassandraRisto.ital.main mainVar30 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.Class<?> object = cassandraRisto.ital.main.getObject();
                                cassandraRisto.ital.main mainVar31 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba35, object, "EseguiFunzione", java.lang.Integer.valueOf(cassandraRisto.ital.main._f_sospendi));
                            } else {
                                anywheresoftware.b4a.BA ba36 = processBA;
                                cassandraRisto.ital.main mainVar32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba36, cassandraRisto.ital.main.getObject(), "AskOrario", true);
                            }
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("hello")) {
                        boolean equals5 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("helloVenduto");
                        new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
                        anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv03 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv03.BytesAvailable() > 100) {
                            cassandraRisto.ital.main mainVar33 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(httpjobVar, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv03, true);
                            cassandraRisto.ital.main mainVar34 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
                                cassandraRisto.ital.main mainVar35 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
                                cassandraRisto.ital.mod1 mod1Var35 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                    anywheresoftware.b4a.BA ba37 = processBA;
                                    cassandraRisto.ital.mod1 mod1Var36 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba37, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                                }
                            }
                        } else {
                            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv27 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv27.startsWith("Errore")) {
                                cassandraRisto.ital.main mainVar36 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                                cassandraRisto.ital.mod1 mod1Var37 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                    anywheresoftware.b4a.BA ba38 = processBA;
                                    cassandraRisto.ital.mod1 mod1Var38 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba38, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                                }
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv27);
                                equals5 = false;
                            }
                        }
                        if (anywheresoftware.b4a.keywords.Common.Not(equals5)) {
                            equals5 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        if (equals5) {
                            cassandraRisto.ital.main mainVar37 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4)) {
                                _inviavendutoclient("1");
                            }
                        }
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("uniscidaclient")) {
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv28 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        anywheresoftware.b4a.BA ba39 = processBA;
                        cassandraRisto.ital.mod1 mod1Var39 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba39, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv28.equals("OK")) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv28);
                        } else {
                            java.util.Arrays.fill(new java.lang.String[0], "");
                            anywheresoftware.b4a.keywords.Regex regex3 = anywheresoftware.b4a.keywords.Common.Regex;
                            java.lang.String[] Split3 = anywheresoftware.b4a.keywords.Regex.Split("_", httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            int parseDouble3 = (int) java.lang.Double.parseDouble(Split3[2]);
                            anywheresoftware.b4a.BA ba40 = processBA;
                            cassandraRisto.ital.main mainVar38 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba40, cassandraRisto.ital.main.getObject(), "UnisciTavolo", java.lang.Integer.valueOf(parseDouble3));
                            cassandraRisto.ital.main mainVar39 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_stampasposta) {
                                java.lang.String str3 = "Tavolo " + Split3[1] + " unito al " + Split3[2];
                                if (anywheresoftware.b4a.keywords.Common.IsNumber(Split3[1]) && anywheresoftware.b4a.keywords.Common.IsNumber(Split3[2]) && java.lang.Double.parseDouble(Split3[1]) < 20000.0d) {
                                    cassandraRisto.ital.main mainVar40 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_stampasala) {
                                        cassandraRisto.ital.mod1 mod1Var40 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        java.lang.String _vvvvvvvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(processBA, Split3[1]);
                                        cassandraRisto.ital.mod1 mod1Var41 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        str3 = _vvvvvvvvvvvvvvvvvv0 + " unito al " + cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(processBA, Split3[2]);
                                    }
                                    cassandraRisto.ital.mod1 mod1Var42 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv0(processBA, true, false, str3);
                                } else if (anywheresoftware.b4a.keywords.Common.IsNumber(Split3[1]) && anywheresoftware.b4a.keywords.Common.IsNumber(Split3[2])) {
                                    cassandraRisto.ital.main mainVar41 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                        cassandraRisto.ital.main mainVar42 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(" and tipo =");
                                        cassandraRisto.ital.main mainVar43 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = append2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(Split3[1]).append(" ").toString();
                                        anywheresoftware.b4a.BA ba41 = processBA;
                                        cassandraRisto.ital.main mainVar44 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba41, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
                                        cassandraRisto.ital.main mainVar45 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(" and tipo =");
                                        cassandraRisto.ital.main mainVar46 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = append3.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(Split3[2]).append(" ").toString();
                                        anywheresoftware.b4a.BA ba42 = processBA;
                                        cassandraRisto.ital.main mainVar47 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba42, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
                                        cassandraRisto.ital.main mainVar48 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
                                    }
                                }
                            }
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("spostadaclient")) {
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv29 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        anywheresoftware.b4a.BA ba43 = processBA;
                        cassandraRisto.ital.mod1 mod1Var43 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba43, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv29.equals("OK")) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv29);
                        } else {
                            java.util.Arrays.fill(new java.lang.String[0], "");
                            anywheresoftware.b4a.keywords.Regex regex4 = anywheresoftware.b4a.keywords.Common.Regex;
                            java.lang.String[] Split4 = anywheresoftware.b4a.keywords.Regex.Split("_", httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            int parseDouble4 = (int) java.lang.Double.parseDouble(Split4[2]);
                            anywheresoftware.b4a.BA ba44 = processBA;
                            cassandraRisto.ital.main mainVar49 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba44, cassandraRisto.ital.main.getObject(), "SpostaTavolo", java.lang.Integer.valueOf(parseDouble4));
                            cassandraRisto.ital.main mainVar50 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_stampasposta) {
                                java.lang.String str4 = "Tavolo " + Split4[1] + " si sposta sul " + Split4[2];
                                cassandraRisto.ital.main mainVar51 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_stampasala) {
                                    cassandraRisto.ital.mod1 mod1Var44 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    java.lang.String _vvvvvvvvvvvvvvvvvv02 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(processBA, Split4[1]);
                                    cassandraRisto.ital.mod1 mod1Var45 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    str4 = _vvvvvvvvvvvvvvvvvv02 + " si sposta su " + cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(processBA, Split4[2]);
                                }
                                cassandraRisto.ital.mod1 mod1Var46 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv0(processBA, true, false, str4);
                            }
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("sbloccadaclient")) {
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv210 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        anywheresoftware.b4a.BA ba45 = processBA;
                        cassandraRisto.ital.mod1 mod1Var47 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba45, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv210.equals("Ok")) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv210);
                        }
                        java.lang.String replace = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.replace("sbloccadaclient", "").replace("_", "");
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        cassandraRisto.ital.main mainVar52 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set inmodifica=0,lock=0,unlocktable=0,stampap=0 where tavolo = " + replace);
                        cassandraRisto.ital.main mainVar53 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.StringBuilder append4 = new java.lang.StringBuilder().append(" and tipo =");
                        cassandraRisto.ital.main mainVar54 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = append4.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(replace).append(" ").toString();
                        anywheresoftware.b4a.BA ba46 = processBA;
                        cassandraRisto.ital.main mainVar55 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba46, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
                        cassandraRisto.ital.main mainVar56 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("contodaclient")) {
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv211 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        anywheresoftware.b4a.BA ba47 = processBA;
                        cassandraRisto.ital.mod1 mod1Var48 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba47, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv211.toUpperCase().equals("OK")) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv211);
                        } else {
                            anywheresoftware.b4a.BA ba48 = processBA;
                            cassandraRisto.ital.main mainVar57 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba48, cassandraRisto.ital.main.getObject(), "RichiediConto", false);
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("opertav")) {
                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv212 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        anywheresoftware.b4a.BA ba49 = processBA;
                        cassandraRisto.ital.mod1 mod1Var49 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba49, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv212.toUpperCase().startsWith("ERRORE")) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv212);
                        } else {
                            java.util.Arrays.fill(new java.lang.String[0], "");
                            anywheresoftware.b4a.keywords.Regex regex5 = anywheresoftware.b4a.keywords.Common.Regex;
                            java.lang.String[] Split5 = anywheresoftware.b4a.keywords.Regex.Split("_", httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            java.lang.String[] strArr = new java.lang.String[4];
                            java.util.Arrays.fill(strArr, "");
                            int length = Split5.length - 1;
                            for (int i = 0; i <= length; i++) {
                                strArr[i] = Split5[i];
                            }
                            strArr[3] = "1";
                            anywheresoftware.b4a.BA ba50 = processBA;
                            cassandraRisto.ital.main mainVar58 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.Class<?> object2 = cassandraRisto.ital.main.getObject();
                            if (!anywheresoftware.b4a.keywords.Common.IsNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv212)) {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv212 = "";
                            }
                            if (anywheresoftware.b4a.BA.ObjectToBoolean(anywheresoftware.b4a.keywords.Common.CallSubNew2(ba50, object2, "ChiediOP", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv212))) {
                                anywheresoftware.b4a.BA ba51 = processBA;
                                cassandraRisto.ital.main mainVar59 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba51, cassandraRisto.ital.main.getObject(), "ApriTavolo", strArr, true);
                            }
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("apritav")) {
                        cassandraRisto.ital.main mainVar60 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
                        new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
                        anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv04 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv04.BytesAvailable() > 25) {
                            java.util.Arrays.fill(new java.lang.String[0], "");
                            anywheresoftware.b4a.keywords.Regex regex6 = anywheresoftware.b4a.keywords.Common.Regex;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(httpjobVar, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv04, anywheresoftware.b4a.keywords.Regex.Split("_", httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
                            anywheresoftware.b4a.BA ba52 = processBA;
                            cassandraRisto.ital.main mainVar61 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba52, cassandraRisto.ital.main.getObject(), "CallclienteTessera");
                            cassandraRisto.ital.main mainVar62 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                anywheresoftware.b4a.BA ba53 = processBA;
                                cassandraRisto.ital.main mainVar63 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba53, cassandraRisto.ital.main.getObject(), "HideShowPnlRicercaT", false);
                            }
                        } else {
                            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv213 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            anywheresoftware.b4a.BA ba54 = processBA;
                            cassandraRisto.ital.mod1 mod1Var50 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba54, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                            cassandraRisto.ital.main mainVar64 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) {
                                anywheresoftware.b4a.BA ba55 = processBA;
                                cassandraRisto.ital.main mainVar65 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba55, cassandraRisto.ital.main.getObject(), "HideShowPnlRicercaT", true);
                            }
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv213.startsWith("Err")) {
                                cassandraRisto.ital.main mainVar66 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                                cassandraRisto.ital.mod1 mod1Var51 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                    anywheresoftware.b4a.BA ba56 = processBA;
                                    cassandraRisto.ital.mod1 mod1Var52 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba56, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                                }
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di ricezione dati dal server");
                            } else {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv213);
                            }
                        }
                        cassandraRisto.ital.main mainVar67 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("recmov")) {
                        new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
                        anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv05 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv05.BytesAvailable() > 50) {
                            java.util.Arrays.fill(new java.lang.String[0], "");
                            anywheresoftware.b4a.keywords.Regex regex7 = anywheresoftware.b4a.keywords.Common.Regex;
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(httpjobVar, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv05, anywheresoftware.b4a.keywords.Regex.Split("_", httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
                        } else {
                            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv214 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv214.startsWith("Err")) {
                                cassandraRisto.ital.main mainVar68 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
                                cassandraRisto.ital.mod1 mod1Var53 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                    anywheresoftware.b4a.BA ba57 = processBA;
                                    cassandraRisto.ital.mod1 mod1Var54 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba57, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
                                }
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di ricezione dati dal server");
                            } else {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv214);
                            }
                            anywheresoftware.b4a.BA ba58 = processBA;
                            cassandraRisto.ital.main mainVar69 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba58, cassandraRisto.ital.main.getObject(), "EsciDaMov", false);
                        }
                        anywheresoftware.b4a.BA ba59 = processBA;
                        cassandraRisto.ital.mod1 mod1Var55 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba59, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                    if (httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startsWith("getsospesidaclient")) {
                        anywheresoftware.b4a.BA ba60 = processBA;
                        cassandraRisto.ital.mod1 mod1Var56 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba60, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                        new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
                        anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv06 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv06.BytesAvailable() > 25) {
                            java.util.Arrays.fill(new java.lang.String[0], "");
                            anywheresoftware.b4a.keywords.Regex regex8 = anywheresoftware.b4a.keywords.Common.Regex;
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(httpjobVar, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv06, anywheresoftware.b4a.keywords.Regex.Split("_", httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7))) {
                                anywheresoftware.b4a.BA ba61 = processBA;
                                cassandraRisto.ital.main mainVar70 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.keywords.Common.CallSubNew(ba61, cassandraRisto.ital.main.getObject(), "fRecallMov");
                            }
                        } else {
                            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv215 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            anywheresoftware.b4a.BA ba62 = processBA;
                            cassandraRisto.ital.mod1 mod1Var57 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba62, cassandraRisto.ital.mod1._vvv7, "ProgressOnly", false, "");
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv215.startsWith("Err")) {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di ricezione dati dal server");
                            } else {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv215);
                            }
                        }
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        return "";
                    }
                }
                java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216 = httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.startsWith("Glory")) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.substring(5);
                    if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.equals("OK")) {
                        cassandraRisto.ital.mod1 mod1Var58 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            anywheresoftware.b4a.BA ba63 = processBA;
                            cassandraRisto.ital.mod1 mod1Var59 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba63, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216);
                        } else {
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216), true);
                        }
                    }
                    cassandraRisto.ital.main mainVar71 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_logvd) {
                        cassandraRisto.ital.mod1 mod1Var60 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(processBA, "OK -- " + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216, "");
                    }
                } else if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.trim().startsWith("wait")) {
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.trim().startsWith("waitok")) {
                        _vv3.setEnabled(false);
                        cassandraRisto.ital.main mainVar72 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
                        cassandraRisto.ital.main mainVar73 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) java.lang.Double.parseDouble(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.substring(6));
                    }
                } else if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.startsWith("OK"))) {
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.equals("Refresh")) {
                        _updvis("");
                    } else {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
                    }
                } else if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.equals("OK")) {
                    _vv2.setEnabled(false);
                    cassandraRisto.ital.main mainVar74 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.contains(")");
                    cassandraRisto.ital.main mainVar75 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.replace(")", "");
                        _vv3.setEnabled(true);
                    }
                    if (anywheresoftware.b4a.keywords.Common.IsNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.substring(2))) {
                        double parseDouble5 = java.lang.Double.parseDouble(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.substring(2));
                        cassandraRisto.ital.main mainVar76 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (parseDouble5 != cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                            _vv2.setInterval(2000L);
                            _vv2.setEnabled(true);
                        }
                    }
                }
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv216.startsWith("OK")) {
                    cassandraRisto.ital.main mainVar77 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) {
                        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                        cassandraRisto.ital.mod1 mod1Var61 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "img.zip")) {
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Invio immagini a VisionDroid in corso ..."), true);
                            cassandraRisto.ital.main mainVar78 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.mod1 mod1Var62 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.String str5 = cassandraRisto.ital.mod1._vvvvv1;
                            cassandraRisto.ital.mod1 mod1Var63 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Copy(str5, "img.zip", cassandraRisto.ital.mod1._vvvvv1, "sendimg.zip");
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.mod1 mod1Var64 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "img.zip");
                            _updvis2("sendimg.zip", 21);
                        }
                    }
                }
            }
            httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var65 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
        }
        return "";
    }

    public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.httpclient.ResumableSub_PostAPI resumableSub_PostAPI = new cassandraRisto.ital.httpclient.ResumableSub_PostAPI(null, str);
        resumableSub_PostAPI.resume(processBA, null);
        return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), resumableSub_PostAPI);
    }

    public static class ResumableSub_PostAPI extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _stoken;
        cassandraRisto.ital.httpclient parent;
        boolean _bres = false;
        anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
        anywheresoftware.b4a.objects.collections.List _mlist = null;
        anywheresoftware.b4a.objects.collections.Map _mtmpmap = null;
        cassandraRisto.ital.httpjob _j = null;
        java.lang.String _sjson = "";
        java.lang.String _sm = "";

        public ResumableSub_PostAPI(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str) {
            this.parent = httpclientVar;
            this._stoken = str;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                switch (this.state) {
                    case -1:
                        anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, null);
                        return;
                    case 0:
                        this.state = 1;
                        this._bres = true;
                        this._jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
                        this._mlist = new anywheresoftware.b4a.objects.collections.List();
                        this._mtmpmap = new anywheresoftware.b4a.objects.collections.Map();
                        this._mlist.Initialize();
                        this._mtmpmap.Initialize();
                        cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(this._mtmpmap, true);
                        this._mlist.Add(this._mtmpmap.getObject());
                        this._jg.Initialize2(this._mlist);
                        this._j = new cassandraRisto.ital.httpjob();
                        this._j._initialize(cassandraRisto.ital.httpclient.processBA, "PostAPI", cassandraRisto.ital.httpclient.getObject());
                        this._sjson = this._jg.ToString();
                        this._sjson = this._sjson.substring(1, this._sjson.length() - 1);
                        anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar = this.parent;
                        cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.InitializePost2(sb.append(cassandraRisto.ital.main._v_webapiindirizzo).append("/Datimatricola").toString(), this._sjson.getBytes("UTF8"));
                        this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1().SetHeader("Token", this._stoken);
                        anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv12 = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
                        cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                        cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv12.SetHeader("PartitaIva", cassandraRisto.ital.main._v_webapipi);
                        this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1().SetContentType("application/json");
                        anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._j);
                        this.state = 15;
                        return;
                    case 1:
                        this.state = 14;
                        if (!anywheresoftware.b4a.keywords.Common.Not(this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                            break;
                        } else {
                            this.state = 3;
                            break;
                        }
                    case 3:
                        this.state = 4;
                        this._sm = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        break;
                    case 4:
                        this.state = 13;
                        if (!this._sm.equals("java.io.EOFException")) {
                            this.state = 6;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        this.state = 7;
                        break;
                    case 7:
                        this.state = 12;
                        if (this._sm.equals("Not Found")) {
                            this.state = 9;
                            break;
                        } else if (!this._sm.equals("Unauthorized")) {
                            break;
                        } else {
                            this.state = 11;
                            break;
                        }
                    case 9:
                        this.state = 12;
                        cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("La partita iva del concessionario non è stata trovata sul server");
                        this._bres = false;
                        break;
                    case 11:
                        this.state = 12;
                        cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Il Token non è valido");
                        this._bres = false;
                        break;
                    case 12:
                        this.state = 13;
                        cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cassandraRisto.ital.httpclient.processBA, "Errore aggiornamento stato portale \t" + this._sm);
                        break;
                    case 13:
                        this.state = 14;
                        break;
                    case 14:
                        this.state = -1;
                        this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, java.lang.Boolean.valueOf(this._bres));
                        return;
                    case 15:
                        this.state = 1;
                        this._j = (cassandraRisto.ital.httpjob) objArr[0];
                        break;
                }
            }
        }
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vv1 = 0;
        _vv2 = new anywheresoftware.b4a.objects.Timer();
        _vv3 = new anywheresoftware.b4a.objects.Timer();
        _vv4 = false;
        _vv5 = false;
        _vv6 = false;
        _vv7 = false;
        _vv0 = 0;
        _vvv1 = 0;
        _vvv2 = 0;
        _vvv3 = 0;
        return "";
    }

    public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        cassandraRisto.ital.httpclient.ResumableSub_PutAPI resumableSub_PutAPI = new cassandraRisto.ital.httpclient.ResumableSub_PutAPI(null, str, str2);
        resumableSub_PutAPI.resume(processBA, null);
        return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), resumableSub_PutAPI);
    }

    public static class ResumableSub_PutAPI extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _api;
        java.lang.String _stoken;
        cassandraRisto.ital.httpclient parent;
        boolean _bres = false;
        anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
        anywheresoftware.b4a.objects.collections.List _mlist = null;
        anywheresoftware.b4a.objects.collections.Map _mtmpmap = null;
        cassandraRisto.ital.httpjob _j = null;
        java.lang.String _sjson = "";
        java.lang.String _sm = "";

        public ResumableSub_PutAPI(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str, java.lang.String str2) {
            this.parent = httpclientVar;
            this._stoken = str;
            this._api = str2;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                switch (this.state) {
                    case -1:
                        anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, null);
                        return;
                    case 0:
                        this.state = 1;
                        this._bres = true;
                        this._jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
                        this._mlist = new anywheresoftware.b4a.objects.collections.List();
                        this._mtmpmap = new anywheresoftware.b4a.objects.collections.Map();
                        this._mlist.Initialize();
                        this._mtmpmap.Initialize();
                        cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(this._mtmpmap, false);
                        this._mlist.Add(this._mtmpmap.getObject());
                        this._jg.Initialize2(this._mlist);
                        this._j = new cassandraRisto.ital.httpjob();
                        this._j._initialize(cassandraRisto.ital.httpclient.processBA, "PutAPI", cassandraRisto.ital.httpclient.getObject());
                        this._sjson = this._jg.ToString();
                        this._sjson = this._sjson.substring(1, this._sjson.length() - 1);
                        cassandraRisto.ital.httpjob httpjobVar = this._j;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        cassandraRisto.ital.httpclient httpclientVar = this.parent;
                        cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(sb.append(cassandraRisto.ital.main._v_webapiindirizzo).append(this._api).toString(), this._sjson.getBytes("UTF8"));
                        this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1().SetHeader("Token", this._stoken);
                        anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
                        cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                        cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetHeader("PartitaIva", cassandraRisto.ital.main._v_webapipi);
                        this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1().SetContentType("application/json");
                        anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._j);
                        this.state = 15;
                        return;
                    case 1:
                        this.state = 14;
                        if (!anywheresoftware.b4a.keywords.Common.Not(this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                            break;
                        } else {
                            this.state = 3;
                            break;
                        }
                    case 3:
                        this.state = 4;
                        this._sm = this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        break;
                    case 4:
                        this.state = 13;
                        if (!this._sm.equals("java.io.EOFException")) {
                            this.state = 6;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        this.state = 7;
                        break;
                    case 7:
                        this.state = 12;
                        if (this._sm.equals("Not Found")) {
                            this.state = 9;
                            break;
                        } else if (!this._sm.equals("Unauthorized")) {
                            break;
                        } else {
                            this.state = 11;
                            break;
                        }
                    case 9:
                        this.state = 12;
                        cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("La partita iva del concessionario non è stata trovata sul server");
                        this._bres = false;
                        break;
                    case 11:
                        this.state = 12;
                        cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Il Token non è valido");
                        this._bres = false;
                        break;
                    case 12:
                        this.state = 13;
                        cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cassandraRisto.ital.httpclient.processBA, "Errore aggiornamento stato portale \t" + this._sm);
                        break;
                    case 13:
                        this.state = 14;
                        break;
                    case 14:
                        this.state = -1;
                        this._j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, java.lang.Boolean.valueOf(this._bres));
                        return;
                    case 15:
                        this.state = 1;
                        this._j = (cassandraRisto.ital.httpjob) objArr[0];
                        break;
                }
            }
        }
    }

    public static java.lang.String _resetglory() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_ipvis.equals("")) {
            return "Configurare l'indirizzo Ip del VisionDroid";
        }
        if (!_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                httpjobVar._initialize(processBA, "gloryExecReset", getObject());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=reset").toString(), "");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_logvd) {
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = processBA;
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=reset").toString(), "");
                }
                return "Reset Inviato";
            }
        }
        return "il Cash Management risulta essere offline";
    }

    public static java.lang.String _richiedicontodaclient(int i) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "contodaclient", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/conto2_").append(anywheresoftware.b4a.BA.NumberToString(i)).append("_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append2.append(cassandraRisto.ital.main._v_numcassa).toString(), "");
        return "";
    }

    public static java.lang.String _sbloccatavolodaclient(int i, boolean z) throws java.lang.Exception {
        java.lang.String str;
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
                _sendhellodaclient();
                str = "";
            } else {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select valore from progressivi where codice = 'SEND'");
                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(processBA, "00000000000" + ExecQuerySingleResult, 10L);
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("update progressivi set valore = valore+1 where codice = 'SEND'");
                java.lang.String NumberToString = anywheresoftware.b4a.BA.NumberToString(i);
                str = "V" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 + "_" + anywheresoftware.b4a.BA.NumberToString(i) + "_0_1_0_0_.txt";
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.objects.streams.File.WriteString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, str, "update tavoli set uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,unlocktable=0 where tavolo =" + NumberToString);
                if (z) {
                    _inviavendutoclient("1");
                }
            }
            return str;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = true;
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.mod1._vvv7, "ChangeStateClient");
            }
            return "";
        }
    }

    public static java.lang.String _sbloccatavolomanualedaclient(int i) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "sbloccadaclient_" + anywheresoftware.b4a.BA.NumberToString(i) + "_", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/sblocca_").append(anywheresoftware.b4a.BA.NumberToString(i)).append("_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append2.append(cassandraRisto.ital.main._v_numcassa).toString(), "");
        return "";
    }

    public static java.lang.String _senddatiscontrinodaclient(anywheresoftware.b4a.objects.collections.List list) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "senddatiscontrino", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/datiscontrino_").append(anywheresoftware.b4a.BA.ObjectToString(list.Get(0))).append("_").append(anywheresoftware.b4a.BA.ObjectToString(list.Get(1))).append("_").append(anywheresoftware.b4a.BA.ObjectToString(list.Get(2))).append("_").append(anywheresoftware.b4a.BA.ObjectToString(list.Get(3))).append("_").append(anywheresoftware.b4a.BA.ObjectToString(list.Get(4))).append("_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append2.append(cassandraRisto.ital.main._v_numcassa).toString(), "");
        return "";
    }

    public static java.lang.String _sendhellodaclient() throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "hello", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/hello_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.main._v_numcassa).append("_");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 ? "1" : "0")).append("_");
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append4.append(cassandraRisto.ital.main._v_mver).toString());
        return "";
    }

    public static java.lang.String _sendhellodaclientperaperturatavolo(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "apritav_" + str + "_" + str2, getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/apritav_").append(str).append("_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._operatore)).append("_");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append4 = append3.append(cassandraRisto.ital.main._v_numcassa).append("_");
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append4.append(cassandraRisto.ital.main._v_mver).toString());
        return "";
    }

    public static java.lang.String _sendhellodaclientperchiusuramov(int i) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "chiudimov" + anywheresoftware.b4a.BA.NumberToString(i), getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/hello_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.main._v_numcassa).append("_");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 ? "1" : "0")).append("_");
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append4.append(cassandraRisto.ital.main._v_mver).toString());
        return "";
    }

    public static java.lang.String _sendhellodaclientperrichiamomovimento(long j) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "recmov_" + anywheresoftware.b4a.BA.NumberToString(j), getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/recmov_").append(anywheresoftware.b4a.BA.NumberToString(j)).append("_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.main._v_numcassa).append("_");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append3.append(cassandraRisto.ital.main._v_mver).toString());
        return "";
    }

    public static java.lang.String _sendhellodaclientperrichiestaoperatore(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "opertav_" + str + "_" + str2, getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/opertav_").append(str).append("_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._operatore)).append("_");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append4 = append3.append(cassandraRisto.ital.main._v_numcassa).append("_");
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append4.append(cassandraRisto.ital.main._v_mver).toString());
        return "";
    }

    public static java.lang.String _sendhellodaclientpersospensionetavolo() throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "sospenditav", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/hello_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.main._v_numcassa).append("_");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 ? "1" : "0")).append("_");
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append4.append(cassandraRisto.ital.main._v_mver).toString());
        _vv5 = true;
        return "";
    }

    public static void _sendimgpalmari(java.lang.String str) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_SendImgPalmari(null, str).resume(processBA, null);
    }

    public static class ResumableSub_SendImgPalmari extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _seriale;
        cassandraRisto.ital.httpclient parent;
        java.lang.String _tmppath = "";
        anywheresoftware.b4a.objects.collections.List _ls = null;
        java.lang.String _txt = "";
        java.lang.String[] _mfile = null;
        flm.b4a.archiver.ArchiverForB4A _myzip = null;
        anywheresoftware.b4a.objects.collections.List _files = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        cassandraRisto.ital.httpjob _job2 = null;
        java.lang.String _ip = "";
        java.lang.String _mresult = "";

        public ResumableSub_SendImgPalmari(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str) {
            this.parent = httpclientVar;
            this._seriale = str;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 6;
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                                cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                                cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                    break;
                                }
                            }
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 6;
                            return;
                        case 6:
                            this.state = 7;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmppath = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(this._seriale).append("/ImgPalm/Send").toString();
                            this._ls = new anywheresoftware.b4a.objects.collections.List();
                            this._ls.Initialize();
                            anywheresoftware.b4a.objects.collections.List list = this._ls;
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            list.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(this._tmppath));
                            break;
                        case 7:
                            this.state = 26;
                            this.state = 9;
                            break;
                        case 9:
                            this.state = 10;
                            break;
                        case 10:
                            this.state = 25;
                            if (this._ls.getSize() > 0) {
                                this.state = 12;
                                break;
                            } else {
                                this.state = 24;
                                break;
                            }
                        case 12:
                            this.state = 13;
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Invio di " + anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0)) + " al palmare " + this._seriale), false);
                            break;
                        case 13:
                            this.state = 22;
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            if (anywheresoftware.b4a.objects.streams.File.Size(this._tmppath, anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0))) <= 1500000) {
                                break;
                            } else {
                                this.state = 15;
                                break;
                            }
                        case 15:
                            this.state = 16;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Delete(this._tmppath, anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0)));
                            this._txt = "Il file " + anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0)) + " risulta essere più grande di 1,5Mb(non verrà inviato al palmare).";
                            break;
                        case 16:
                            this.state = 21;
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                this.state = 18;
                                break;
                            } else {
                                this.state = 20;
                                break;
                            }
                        case 18:
                            this.state = 21;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._txt);
                            break;
                        case 20:
                            this.state = 21;
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(this._txt), true);
                            break;
                        case 21:
                            this.state = 22;
                            this._ls.Initialize();
                            anywheresoftware.b4a.objects.collections.List list2 = this._ls;
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            list2.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(this._tmppath));
                            this.state = 7;
                            break;
                        case 22:
                            this.state = 25;
                            this._mfile = new java.lang.String[0];
                            java.util.Arrays.fill(this._mfile, "");
                            this._mfile = new java.lang.String[]{anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0))};
                            this._myzip = new flm.b4a.archiver.ArchiverForB4A();
                            flm.b4a.archiver.ArchiverForB4A archiverForB4A = this._myzip;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.String str = this._tmppath;
                            java.lang.String[] strArr = this._mfile;
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            archiverForB4A.ZipFiles(ba3, str, strArr, cassandraRisto.ital.mod1._vvvvv1, "Immagini.zip", "");
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Delete(this._tmppath, anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0)));
                            this.state = 26;
                            break;
                        case 24:
                            this.state = 25;
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Procedura ultimata correttamente per il palmare " + this._seriale), true);
                            return;
                        case 25:
                            this.state = 7;
                            break;
                        case 26:
                            this.state = 27;
                            this._files = new anywheresoftware.b4a.objects.collections.List();
                            this._files.Initialize();
                            this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                            this._fd.Initialize();
                            cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            _multipartfiledataVar.Dir = cassandraRisto.ital.mod1._vvvvv1;
                            this._fd.FileName = "Immagini.zip";
                            this._fd.KeyName = "upfile";
                            this._fd.ContentType = "application/octet-stream";
                            this._files.Add(this._fd);
                            this._nv = new anywheresoftware.b4a.objects.collections.Map();
                            this._nv.Initialize();
                            this._nv.Put("upfile", "Immagini.zip");
                            this._job2 = new cassandraRisto.ital.httpjob();
                            this._job2._initialize(cassandraRisto.ital.httpclient.processBA, this._seriale, cassandraRisto.ital.httpclient.getObject());
                            cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._ip = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select IP from Palmari where Serial='" + this._seriale + "'");
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("http://" + this._ip + ":12315/Img", this._nv, this._files);
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                            this.state = 53;
                            return;
                        case 27:
                            this.state = 52;
                            if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                                this.state = 29;
                                break;
                            } else {
                                this.state = 47;
                                break;
                            }
                        case 29:
                            this.state = 30;
                            break;
                        case 30:
                            this.state = 45;
                            this.catchState = 44;
                            this.state = 32;
                            break;
                        case 32:
                            this.state = 33;
                            this.catchState = 44;
                            this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            break;
                        case 33:
                            this.state = 42;
                            if (!this._mresult.equals("OK")) {
                                this.state = 35;
                                break;
                            } else {
                                this.state = 41;
                                break;
                            }
                        case 35:
                            this.state = 36;
                            break;
                        case 36:
                            this.state = 39;
                            cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                                cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                if (!cassandraRisto.ital.mod1._vvv7.equals("ConfPalmari")) {
                                    break;
                                }
                            }
                            this.state = 38;
                            break;
                        case 38:
                            this.state = 39;
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba4, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._mresult);
                            break;
                        case 39:
                            this.state = 42;
                            break;
                        case 41:
                            this.state = 42;
                            cassandraRisto.ital.httpclient._sendimgpalmari(this._seriale);
                            break;
                        case 42:
                            this.state = 45;
                            break;
                        case 44:
                            this.state = 45;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 45:
                            this.state = 52;
                            this.catchState = 0;
                            break;
                        case 47:
                            this.state = 48;
                            break;
                        case 48:
                            this.state = 51;
                            cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                                cassandraRisto.ital.mod1 mod1Var11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                if (!cassandraRisto.ital.mod1._vvv7.equals("ConfPalmari")) {
                                    break;
                                }
                            }
                            this.state = 50;
                            break;
                        case 50:
                            this.state = 51;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar15 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba5, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Il palmare " + this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 + " non è stato aggiornato");
                            break;
                        case 51:
                            this.state = 52;
                            break;
                        case 52:
                            this.state = -1;
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            break;
                        case 53:
                            this.state = 27;
                            this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static void _sendlockpalmari(java.lang.String str, int i) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_SendLockPalmari(null, str, i).resume(processBA, null);
    }

    public static class ResumableSub_SendLockPalmari extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _ip;
        int _seriale;
        cassandraRisto.ital.httpclient parent;
        anywheresoftware.b4a.objects.collections.List _files = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        cassandraRisto.ital.httpjob _job2 = null;
        java.lang.String _mresult = "";

        public ResumableSub_SendLockPalmari(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str, int i) {
            this.parent = httpclientVar;
            this._ip = str;
            this._seriale = i;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                switch (this.state) {
                    case -1:
                        return;
                    case 0:
                        this.state = 1;
                        break;
                    case 1:
                        this.state = 22;
                        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                        cassandraRisto.ital.httpclient httpclientVar = this.parent;
                        cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Lock.zip")) {
                            break;
                        } else {
                            this.state = 3;
                            break;
                        }
                    case 3:
                        this.state = 4;
                        this._files = new anywheresoftware.b4a.objects.collections.List();
                        this._files.Initialize();
                        this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                        this._fd.Initialize();
                        cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                        cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                        cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        _multipartfiledataVar.Dir = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        this._fd.FileName = "Lock.zip";
                        this._fd.KeyName = "upfile";
                        this._fd.ContentType = "application/octet-stream";
                        this._files.Add(this._fd);
                        this._nv = new anywheresoftware.b4a.objects.collections.Map();
                        this._nv.Initialize();
                        this._nv.Put("upfile", "Lock.zip");
                        this._job2 = new cassandraRisto.ital.httpjob();
                        this._job2._initialize(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.BA.NumberToString(this._seriale), cassandraRisto.ital.httpclient.getObject());
                        this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("http://" + this._ip + ":12315/Lock", this._nv, this._files);
                        anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                        this.state = 23;
                        return;
                    case 4:
                        this.state = 21;
                        if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                            this.state = 6;
                            break;
                        } else {
                            this.state = 16;
                            break;
                        }
                    case 6:
                        this.state = 7;
                        this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        break;
                    case 7:
                        this.state = 14;
                        if (!this._mresult.equals("OK")) {
                            this.state = 9;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        this.state = 10;
                        break;
                    case 10:
                        this.state = 13;
                        cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("ConfPalmari")) {
                                break;
                            }
                        }
                        this.state = 12;
                        break;
                    case 12:
                        this.state = 13;
                        anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._mresult);
                        break;
                    case 13:
                        this.state = 14;
                        break;
                    case 14:
                        this.state = 21;
                        break;
                    case 16:
                        this.state = 17;
                        break;
                    case 17:
                        this.state = 20;
                        cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("ConfPalmari")) {
                                break;
                            }
                        }
                        this.state = 19;
                        break;
                    case 19:
                        this.state = 20;
                        anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Il palmare " + this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 + " non è stato aggiornato");
                        break;
                    case 20:
                        this.state = 21;
                        break;
                    case 21:
                        this.state = 22;
                        this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        break;
                    case 22:
                        this.state = -1;
                        break;
                    case 23:
                        this.state = 4;
                        this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                        break;
                }
            }
        }
    }

    public static void _sendmsgpalmari(java.lang.String str, int i) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_SendMsgPalmari(null, str, i).resume(processBA, null);
    }

    public static class ResumableSub_SendMsgPalmari extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _ip;
        int _seriale;
        cassandraRisto.ital.httpclient parent;
        anywheresoftware.b4a.objects.collections.List _files = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        cassandraRisto.ital.httpjob _job2 = null;
        java.lang.String _mresult = "";

        public ResumableSub_SendMsgPalmari(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str, int i) {
            this.parent = httpclientVar;
            this._ip = str;
            this._seriale = i;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                switch (this.state) {
                    case -1:
                        return;
                    case 0:
                        this.state = 1;
                        break;
                    case 1:
                        this.state = 22;
                        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                        cassandraRisto.ital.httpclient httpclientVar = this.parent;
                        cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Msg.zip")) {
                            break;
                        } else {
                            this.state = 3;
                            break;
                        }
                    case 3:
                        this.state = 4;
                        this._files = new anywheresoftware.b4a.objects.collections.List();
                        this._files.Initialize();
                        this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                        this._fd.Initialize();
                        cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                        cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                        cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        _multipartfiledataVar.Dir = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        this._fd.FileName = "Msg.zip";
                        this._fd.KeyName = "upfile";
                        this._fd.ContentType = "application/octet-stream";
                        this._files.Add(this._fd);
                        this._nv = new anywheresoftware.b4a.objects.collections.Map();
                        this._nv.Initialize();
                        this._nv.Put("upfile", "Msg.zip");
                        this._job2 = new cassandraRisto.ital.httpjob();
                        this._job2._initialize(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.BA.NumberToString(this._seriale), cassandraRisto.ital.httpclient.getObject());
                        this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("http://" + this._ip + ":12315/Msg", this._nv, this._files);
                        anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                        this.state = 23;
                        return;
                    case 4:
                        this.state = 21;
                        if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                            this.state = 6;
                            break;
                        } else {
                            this.state = 16;
                            break;
                        }
                    case 6:
                        this.state = 7;
                        this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                        break;
                    case 7:
                        this.state = 14;
                        if (!this._mresult.equals("OK")) {
                            this.state = 9;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        this.state = 10;
                        break;
                    case 10:
                        this.state = 13;
                        cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("ConfPalmari")) {
                                break;
                            }
                        }
                        this.state = 12;
                        break;
                    case 12:
                        this.state = 13;
                        anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._mresult);
                        break;
                    case 13:
                        this.state = 14;
                        break;
                    case 14:
                        this.state = 21;
                        break;
                    case 16:
                        this.state = 17;
                        break;
                    case 17:
                        this.state = 20;
                        cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (!cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!cassandraRisto.ital.mod1._vvv7.equals("ConfPalmari")) {
                                break;
                            }
                        }
                        this.state = 19;
                        break;
                    case 19:
                        this.state = 20;
                        anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                        cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Il palmare " + this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 + " non è stato aggiornato");
                        break;
                    case 20:
                        this.state = 21;
                        break;
                    case 21:
                        this.state = 22;
                        this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                        break;
                    case 22:
                        this.state = -1;
                        break;
                    case 23:
                        this.state = 4;
                        this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                        break;
                }
            }
        }
    }

    public static java.lang.String _sendprenotapalmari(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "WebPrenota", getObject());
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("http://" + str + ":12315/prenotaweb_" + str2, "");
        return "";
    }

    public static java.lang.String _sendrichiestavarclient() throws java.lang.Exception {
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip")) {
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip");
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
        return "";
    }

    public static void _sendscontrinoaiclient(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_SendScontrinoAiClient(null, str, str2).resume(processBA, null);
    }

    public static class ResumableSub_SendScontrinoAiClient extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _nmov;
        java.lang.String _scassa;
        cassandraRisto.ital.httpclient parent;
        java.lang.String[] _mfile = null;
        flm.b4a.archiver.ArchiverForB4A _myzip = null;
        anywheresoftware.b4a.objects.collections.List _files = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        int _icassa = 0;
        cassandraRisto.ital.httpjob _job2 = null;
        java.lang.String _mresult = "";

        public ResumableSub_SendScontrinoAiClient(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str, java.lang.String str2) {
            this.parent = httpclientVar;
            this._scassa = str;
            this._nmov = str2;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 47;
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Scontrino.job")) {
                                break;
                            } else {
                                this.state = 3;
                                break;
                            }
                        case 3:
                            this.state = 4;
                            break;
                        case 4:
                            this.state = 46;
                            this.catchState = 45;
                            this.state = 6;
                            break;
                        case 6:
                            this.state = 7;
                            this.catchState = 45;
                            break;
                        case 7:
                            this.state = 12;
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Scontrino.zip")) {
                                break;
                            } else {
                                this.state = 9;
                                break;
                            }
                        case 9:
                            this.state = 12;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Delete(sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Scontrino.zip");
                            break;
                        case 12:
                            this.state = 13;
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String str = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Copy(str, "Scontrino.job", sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Scontrino.job");
                            this._mfile = new java.lang.String[1];
                            java.util.Arrays.fill(this._mfile, "");
                            this._mfile[0] = "Scontrino.job";
                            this._myzip = new flm.b4a.archiver.ArchiverForB4A();
                            flm.b4a.archiver.ArchiverForB4A archiverForB4A = this._myzip;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String str2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.String[] strArr = this._mfile;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            archiverForB4A.ZipFiles(ba2, str2, strArr, sb4.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Scontrino.zip", "");
                            this._files = new anywheresoftware.b4a.objects.collections.List();
                            this._files.Initialize();
                            this._nv = new anywheresoftware.b4a.objects.collections.Map();
                            this._nv.Initialize();
                            break;
                        case 13:
                            this.state = 43;
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.objects.streams.File.Exists(sb5.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Scontrino.zip")) {
                                break;
                            } else {
                                this.state = 15;
                                break;
                            }
                        case 15:
                            this.state = 16;
                            this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                            this._fd.Initialize();
                            cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            _multipartfiledataVar.Dir = sb6.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString();
                            this._fd.FileName = "Scontrino.zip";
                            this._fd.KeyName = "upfile";
                            this._fd.ContentType = "application/octet-stream";
                            this._files.Add(this._fd);
                            this._nv.Put("upfile", "Scontrino.zip");
                            this._nv.Put("nmov", this._nmov);
                            this._icassa = (int) java.lang.Double.parseDouble(this._scassa);
                            cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setPosition(this._icassa - 1);
                            this._job2 = new cassandraRisto.ital.httpjob();
                            this._job2._initialize(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.BA.NumberToString(this._icassa), cassandraRisto.ital.httpclient.getObject());
                            cassandraRisto.ital.httpjob httpjobVar = this._job2;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("IP")).append(":12312/stampascontrino").toString(), this._nv, this._files);
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1().setTimeout(150000);
                            cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                            cassandraRisto.ital.httpclient._vv5 = true;
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                            this.state = 48;
                            return;
                        case 16:
                            this.state = 42;
                            if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                                this.state = 18;
                                break;
                            } else {
                                this.state = 35;
                                break;
                            }
                        case 18:
                            this.state = 19;
                            break;
                        case 19:
                            this.state = 33;
                            this.catchState = 32;
                            this.state = 21;
                            break;
                        case 21:
                            this.state = 22;
                            this.catchState = 32;
                            cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                            cassandraRisto.ital.httpclient._vv5 = false;
                            this._mresult = "";
                            break;
                        case 22:
                            this.state = 27;
                            this.catchState = 26;
                            this.state = 24;
                            break;
                        case 24:
                            this.state = 27;
                            this.catchState = 26;
                            this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            break;
                        case 26:
                            this.state = 27;
                            this.catchState = 32;
                            cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 27:
                            this.state = 30;
                            this.catchState = 32;
                            if (!this._mresult.equals("OK") && !this._mresult.equals("")) {
                                this.state = 29;
                                break;
                            }
                            break;
                        case 29:
                            this.state = 30;
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(this._mresult), true);
                            cassandraRisto.ital.httpclient httpclientVar15 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cassandraRisto.ital.httpclient.processBA, this._mresult);
                            cassandraRisto.ital.httpclient httpclientVar16 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clients set stato =3 where codice = " + this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.httpclient httpclientVar17 = this.parent;
                            cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.httpclient httpclientVar18 = this.parent;
                            cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clients order by codice"));
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar19 = this.parent;
                            cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.main.getObject(), "ResStampaSco", false);
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            return;
                        case 30:
                            this.state = 33;
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar20 = this.parent;
                            cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba4, cassandraRisto.ital.main.getObject(), "ResStampaSco", true);
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            return;
                        case 32:
                            this.state = 33;
                            this.catchState = 45;
                            cassandraRisto.ital.httpclient httpclientVar21 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 33:
                            this.state = 42;
                            this.catchState = 45;
                            break;
                        case 35:
                            this.state = 36;
                            break;
                        case 36:
                            this.state = 41;
                            this.catchState = 40;
                            this.state = 38;
                            break;
                        case 38:
                            this.state = 41;
                            this.catchState = 40;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0((int) java.lang.Double.parseDouble(this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7), false);
                            cassandraRisto.ital.httpclient httpclientVar22 = this.parent;
                            cassandraRisto.ital.httpclient._vv5 = false;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar23 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba5, cassandraRisto.ital.main.getObject(), "ResStampaSco", false);
                            break;
                        case 40:
                            this.state = 41;
                            this.catchState = 45;
                            cassandraRisto.ital.httpclient httpclientVar24 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 41:
                            this.state = 42;
                            this.catchState = 45;
                            break;
                        case 42:
                            this.state = 43;
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            return;
                        case 43:
                            this.state = 46;
                            break;
                        case 45:
                            this.state = 46;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar25 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 46:
                            this.state = 47;
                            this.catchState = 0;
                            break;
                        case 47:
                            this.state = -1;
                            anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar26 = this.parent;
                            cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba6, cassandraRisto.ital.main.getObject(), "ResStampaSco", false);
                            break;
                        case 48:
                            this.state = 16;
                            this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static java.lang.String _sendvariazionetavoloaiclient(int[] iArr, java.lang.String str) throws java.lang.Exception {
        java.lang.String str2;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clients where stato = 1 or stato =2")) > 0.0d) {
            anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(str).append("/Tavoli").toString();
            if (str.length() > 1) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.StringBuilder append = sb3.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                str2 = append.append(cassandraRisto.ital.main._v_numcassa).append("/Tavoli").toString();
            } else {
                str2 = sb2;
            }
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(str2, "Tavolo.txt")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(str2, "Tavolo.txt");
            }
            randomAccessFile.Initialize2(str2, "Tavolo.txt", false, false);
            new anywheresoftware.b4a.objects.collections.List().Initialize();
            new anywheresoftware.b4a.objects.collections.Map().Initialize();
            java.lang.String str3 = "";
            int length = iArr.length - 1;
            int i = 0;
            while (i <= length) {
                java.lang.String str4 = str3 + anywheresoftware.b4a.BA.NumberToString(iArr[i]) + "_";
                i++;
                str3 = str4;
            }
            randomAccessFile.WriteObject(str3, true, randomAccessFile.CurrentPosition);
            int length2 = iArr.length - 1;
            java.lang.String str5 = str3;
            for (int i2 = 0; i2 <= length2; i2++) {
                new anywheresoftware.b4a.objects.collections.Map().Initialize();
                cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select * from tavoli where tavolo = " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(iArr[i2])) + "", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                str5 = str5 + anywheresoftware.b4a.BA.NumberToString(iArr[i2]) + "_";
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
                    randomAccessFile.WriteObject(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject(), true, randomAccessFile.CurrentPosition);
                } else {
                    return "";
                }
            }
            randomAccessFile.Close();
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(str2, "Tavolo.txt")) {
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(str2, "Tavolo.txt")) {
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    int rowCount = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getRowCount() - 1;
                    boolean z = false;
                    for (int i3 = 0; i3 <= rowCount; i3++) {
                        cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setPosition(i3);
                        cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetInt("stato") != 0) {
                            cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetInt("stato") != 3) {
                                cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetInt("solotessere") != 1) {
                                    cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    java.lang.String GetString = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("codice");
                                    cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (!GetString.equals(cassandraRisto.ital.main._v_numcassa)) {
                                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        java.lang.StringBuilder append2 = sb4.append(cassandraRisto.ital.mod1._vvvvv1).append("/T");
                                        cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.String sb5 = append2.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("codice")).append("/TAVOLI").toString();
                                        cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                        anywheresoftware.b4a.BA ba2 = processBA;
                                        java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("0000000000");
                                        cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("T_").append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba2, append3.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("compare")).toString(), 10L)).append("_");
                                        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        anywheresoftware.b4a.BA ba3 = processBA;
                                        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        java.lang.String sb6 = append4.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(ba3, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append("_").append(str).append("_").append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Common.Rnd(0, 999))).toString();
                                        anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                                        anywheresoftware.b4a.objects.streams.File.Copy(str2, "Tavolo.txt", sb5, sb6 + ".tmp");
                                        anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                                        if (anywheresoftware.b4a.objects.streams.File.Exists(sb5, sb6 + ".tmp")) {
                                            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv4(processBA, sb5, sb6 + ".tmp", sb5, sb6 + ".txt");
                                        }
                                        cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                        java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("update clients set compare=compare+1 where codice = ");
                                        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        sql.ExecNonQuery(append5.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("codice")).toString());
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    if (z) {
                        cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized()) {
                            cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Close();
                        }
                        cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clients order by codice"));
                    }
                }
            } else {
                return "";
            }
        }
        return "";
    }

    public static void _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_SendVariazioniAiClient(null).resume(processBA, null);
    }

    public static class ResumableSub_SendVariazioniAiClient extends anywheresoftware.b4a.BA.ResumableSub {
        int limit11;
        int limit22;
        int limit45;
        cassandraRisto.ital.httpclient parent;
        int step11;
        int step22;
        int step45;
        anywheresoftware.b4a.objects.collections.List _tmplcopy = null;
        anywheresoftware.b4a.objects.collections.List _tmplist = null;
        int _i = 0;
        java.lang.String _myfile = "";
        java.lang.String[] _mfile = null;
        flm.b4a.archiver.ArchiverForB4A _myzip = null;
        anywheresoftware.b4a.objects.collections.List _files = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        int _x = 0;
        cassandraRisto.ital.httpjob _job2 = null;
        java.lang.String _mresult = "";

        public ResumableSub_SendVariazioniAiClient(cassandraRisto.ital.httpclient httpclientVar) {
            this.parent = httpclientVar;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 84;
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clients where stato = 1 or stato =2")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 3;
                                break;
                            }
                        case 3:
                            this.state = 4;
                            break;
                        case 4:
                            this.state = 83;
                            this.catchState = 82;
                            this.state = 6;
                            break;
                        case 6:
                            this.state = 7;
                            this.catchState = 82;
                            break;
                        case 7:
                            this.state = 26;
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip"))) {
                                break;
                            } else {
                                this.state = 9;
                                break;
                            }
                        case 9:
                            this.state = 10;
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.String dirDefaultExternal = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Copy(dirDefaultExternal, "Anagra.db", sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.db");
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.String dirDefaultExternal2 = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Copy(dirDefaultExternal2, "Config.txt", sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Config.txt");
                            this._tmplcopy = new anywheresoftware.b4a.objects.collections.List();
                            this._tmplcopy.Initialize();
                            this._tmplist = new anywheresoftware.b4a.objects.collections.List();
                            this._tmplist.Initialize();
                            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                            this._tmplcopy = anywheresoftware.b4a.objects.streams.File.ListFiles(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal());
                            break;
                        case 10:
                            this.state = 17;
                            this.step11 = 1;
                            this.limit11 = this._tmplcopy.getSize() - 1;
                            this._i = 0;
                            this.state = 85;
                            break;
                        case 12:
                            this.state = 13;
                            this._myfile = anywheresoftware.b4a.BA.ObjectToString(this._tmplcopy.Get(this._i));
                            break;
                        case 13:
                            this.state = 16;
                            if (this._myfile.startsWith("LayoutStampaTipo") && this._myfile.endsWith(".cfg")) {
                                this.state = 15;
                                break;
                            }
                            break;
                        case 15:
                            this.state = 16;
                            this._tmplist.Add(this._myfile);
                            anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.String dirDefaultExternal3 = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
                            java.lang.String str = this._myfile;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Copy(dirDefaultExternal3, str, sb4.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), this._myfile);
                            break;
                        case 16:
                            this.state = 86;
                            break;
                        case 17:
                            this.state = 18;
                            this._mfile = new java.lang.String[this._tmplist.getSize() + 2];
                            java.util.Arrays.fill(this._mfile, "");
                            this._mfile[0] = "Anagra.db";
                            this._mfile[1] = "Config.txt";
                            break;
                        case 18:
                            this.state = 25;
                            if (this._tmplist.getSize() <= 0) {
                                break;
                            } else {
                                this.state = 20;
                                break;
                            }
                        case 20:
                            this.state = 21;
                            break;
                        case 21:
                            this.state = 24;
                            this.step22 = 1;
                            this.limit22 = this._tmplist.getSize() - 1;
                            this._i = 0;
                            this.state = 87;
                            break;
                        case 23:
                            this.state = 88;
                            this._mfile[this._i + 2] = anywheresoftware.b4a.BA.ObjectToString(this._tmplist.Get(this._i));
                            break;
                        case 24:
                            this.state = 25;
                            break;
                        case 25:
                            this.state = 26;
                            this._myzip = new flm.b4a.archiver.ArchiverForB4A();
                            flm.b4a.archiver.ArchiverForB4A archiverForB4A = this._myzip;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.String sb6 = sb5.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString();
                            java.lang.String[] strArr = this._mfile;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            archiverForB4A.ZipFiles(ba2, sb6, strArr, sb7.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip", "");
                            break;
                        case 26:
                            this.state = 31;
                            cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized()) {
                                break;
                            } else {
                                this.state = 28;
                                break;
                            }
                        case 28:
                            this.state = 31;
                            cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Close();
                            break;
                        case 31:
                            this.state = 32;
                            cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clients order by codice"));
                            this._files = new anywheresoftware.b4a.objects.collections.List();
                            this._files.Initialize();
                            this._nv = new anywheresoftware.b4a.objects.collections.Map();
                            this._nv.Initialize();
                            cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                            cassandraRisto.ital.httpclient._vvv3 = 0;
                            break;
                        case 32:
                            this.state = 80;
                            anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (anywheresoftware.b4a.objects.streams.File.Exists(sb8.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip")) {
                                this.state = 34;
                                break;
                            } else {
                                this.state = 79;
                                break;
                            }
                        case 34:
                            this.state = 35;
                            this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                            this._fd.Initialize();
                            cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            _multipartfiledataVar.Dir = sb9.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString();
                            this._fd.FileName = "Anagra.zip";
                            this._fd.KeyName = "upfile";
                            this._fd.ContentType = "application/octet-stream";
                            this._files.Add(this._fd);
                            this._nv.Put("upfile", "Anagra.zip");
                            break;
                        case 35:
                            this.state = 77;
                            this.step45 = 1;
                            cassandraRisto.ital.httpclient httpclientVar15 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this.limit45 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getRowCount() - 1;
                            this._x = 0;
                            this.state = 89;
                            break;
                        case 37:
                            this.state = 38;
                            cassandraRisto.ital.httpclient httpclientVar16 = this.parent;
                            cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setPosition(this._x);
                            break;
                        case 38:
                            this.state = 43;
                            cassandraRisto.ital.httpclient httpclientVar17 = this.parent;
                            cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetInt("stato") != 0) {
                                cassandraRisto.ital.httpclient httpclientVar18 = this.parent;
                                cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetInt("stato") != 3) {
                                    break;
                                }
                            }
                            this.state = 40;
                            break;
                        case 40:
                            this.state = 43;
                            this.state = 90;
                            break;
                        case 43:
                            this.state = 44;
                            break;
                        case 44:
                            this.state = 49;
                            cassandraRisto.ital.httpclient httpclientVar19 = this.parent;
                            cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String GetString = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("codice");
                            cassandraRisto.ital.httpclient httpclientVar20 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!GetString.equals(cassandraRisto.ital.main._v_numcassa)) {
                                break;
                            } else {
                                this.state = 46;
                                break;
                            }
                        case 46:
                            this.state = 49;
                            this.state = 90;
                            break;
                        case 49:
                            this.state = 50;
                            this._job2 = new cassandraRisto.ital.httpjob();
                            cassandraRisto.ital.httpjob httpjobVar = this._job2;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar21 = this.parent;
                            cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar._initialize(ba3, anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetInt("codice")), cassandraRisto.ital.httpclient.getObject());
                            cassandraRisto.ital.httpjob httpjobVar2 = this._job2;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar22 = this.parent;
                            cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("IP")).append(":12312/updanagra").toString(), this._nv, this._files);
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1().setTimeout(150000);
                            cassandraRisto.ital.httpclient httpclientVar23 = this.parent;
                            cassandraRisto.ital.httpclient httpclientVar24 = this.parent;
                            cassandraRisto.ital.httpclient._vvv3++;
                            cassandraRisto.ital.httpclient httpclientVar25 = this.parent;
                            cassandraRisto.ital.httpclient._vv5 = true;
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                            this.state = 91;
                            return;
                        case 50:
                            this.state = 76;
                            if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                                this.state = 52;
                                break;
                            } else {
                                this.state = 69;
                                break;
                            }
                        case 52:
                            this.state = 53;
                            break;
                        case 53:
                            this.state = 67;
                            this.catchState = 66;
                            this.state = 55;
                            break;
                        case 55:
                            this.state = 56;
                            this.catchState = 66;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
                            this._mresult = "";
                            break;
                        case 56:
                            this.state = 61;
                            this.catchState = 60;
                            this.state = 58;
                            break;
                        case 58:
                            this.state = 61;
                            this.catchState = 60;
                            this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            break;
                        case 60:
                            this.state = 61;
                            this.catchState = 66;
                            cassandraRisto.ital.httpclient httpclientVar26 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 61:
                            this.state = 64;
                            this.catchState = 66;
                            if (!this._mresult.equals("OK") && !this._mresult.equals("")) {
                                this.state = 63;
                                break;
                            }
                            break;
                        case 63:
                            this.state = 64;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(this._mresult);
                            cassandraRisto.ital.httpclient httpclientVar27 = this.parent;
                            cassandraRisto.ital.main mainVar14 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clients set stato =3 where codice = " + this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.httpclient httpclientVar28 = this.parent;
                            cassandraRisto.ital.main mainVar15 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.httpclient httpclientVar29 = this.parent;
                            cassandraRisto.ital.main mainVar16 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clients order by codice"));
                            break;
                        case 64:
                            this.state = 67;
                            break;
                        case 66:
                            this.state = 67;
                            this.catchState = 82;
                            cassandraRisto.ital.httpclient httpclientVar30 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 67:
                            this.state = 76;
                            this.catchState = 82;
                            break;
                        case 69:
                            this.state = 70;
                            break;
                        case 70:
                            this.state = 75;
                            this.catchState = 74;
                            this.state = 72;
                            break;
                        case 72:
                            this.state = 75;
                            this.catchState = 74;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0((int) java.lang.Double.parseDouble(this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7), true);
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
                            break;
                        case 74:
                            this.state = 75;
                            this.catchState = 82;
                            cassandraRisto.ital.httpclient httpclientVar31 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 75:
                            this.state = 76;
                            this.catchState = 82;
                            break;
                        case 76:
                            this.state = 90;
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            break;
                        case 77:
                            this.state = 80;
                            break;
                        case 79:
                            this.state = 80;
                            return;
                        case 80:
                            this.state = 83;
                            break;
                        case 82:
                            this.state = 83;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar32 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 83:
                            this.state = 84;
                            this.catchState = 0;
                            break;
                        case 84:
                            this.state = -1;
                            break;
                        case 85:
                            this.state = 17;
                            if ((this.step11 > 0 && this._i <= this.limit11) || (this.step11 < 0 && this._i >= this.limit11)) {
                                this.state = 12;
                                break;
                            }
                            break;
                        case 86:
                            this.state = 85;
                            this._i = this._i + 0 + this.step11;
                            break;
                        case 87:
                            this.state = 24;
                            if ((this.step22 > 0 && this._i <= this.limit22) || (this.step22 < 0 && this._i >= this.limit22)) {
                                this.state = 23;
                                break;
                            }
                            break;
                        case 88:
                            this.state = 87;
                            this._i = this._i + 0 + this.step22;
                            break;
                        case 89:
                            this.state = 77;
                            if ((this.step45 > 0 && this._x <= this.limit45) || (this.step45 < 0 && this._x >= this.limit45)) {
                                this.state = 37;
                                break;
                            }
                            break;
                        case 90:
                            this.state = 89;
                            this._x = this._x + 0 + this.step45;
                            break;
                        case 91:
                            this.state = 50;
                            this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static java.lang.String _service_create() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _service_destroy() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _service_start(anywheresoftware.b4a.objects.IntentWrapper intentWrapper) throws java.lang.Exception {
        _vv2.Initialize(processBA, "TimerUpdVis", 2000L);
        _vv2.setEnabled(false);
        _vv3.Initialize(processBA, "TimerWaitGame", 2000L);
        _vv3.setEnabled(false);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            _sendhellodaclient();
        }
        if (_vv4) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
            return "";
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, int i, boolean z) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        if (str.length() > 0) {
            int length = str.length();
            for (int i2 = 1; i2 <= length; i2++) {
                char charAt = str.charAt(i2 - 1);
                if ((anywheresoftware.b4a.keywords.Common.Asc(charAt) < 42 || anywheresoftware.b4a.keywords.Common.Asc(charAt) > 63) && ((anywheresoftware.b4a.keywords.Common.Asc(charAt) < 65 || anywheresoftware.b4a.keywords.Common.Asc(charAt) > 90) && (anywheresoftware.b4a.keywords.Common.Asc(charAt) < 97 || anywheresoftware.b4a.keywords.Common.Asc(charAt) > 122))) {
                    switch (anywheresoftware.b4a.BA.switchObjectToInt(java.lang.Character.valueOf(charAt), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("è")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("é")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("à")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ì")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ò")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("ù")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("À")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Á")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("È")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("É")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ì")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Í")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ò")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ó")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ù")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("Ú")), java.lang.Character.valueOf(anywheresoftware.b4a.BA.ObjectToChar("€")))) {
                        case 0:
                        case 1:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("e");
                            break;
                        case 2:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("a");
                            break;
                        case 3:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("i");
                            break;
                        case 4:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("o");
                            break;
                        case 5:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("u");
                            break;
                        case 6:
                        case 7:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("A");
                            break;
                        case 8:
                        case 9:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("E");
                            break;
                        case 10:
                        case 11:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("I");
                            break;
                        case 12:
                        case 13:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("O");
                            break;
                        case 14:
                        case 15:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("U");
                            break;
                        case 16:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar("E");
                            break;
                        default:
                            charAt = anywheresoftware.b4a.BA.ObjectToChar(" ");
                            break;
                    }
                }
                stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(charAt)));
            }
            if (z) {
                while (stringBuilderWrapper.ToString().toUpperCase().contains("TOTALE")) {
                    int indexOf = stringBuilderWrapper.ToString().toUpperCase().indexOf("TOTALE") + 5;
                    stringBuilderWrapper.Remove(indexOf, indexOf + 1);
                    stringBuilderWrapper.Insert(indexOf, ".");
                }
            }
        }
        java.lang.String ToString = stringBuilderWrapper.ToString();
        if (ToString.length() > i) {
            return ToString.substring(0, i);
        }
        return ToString;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws java.lang.Exception {
        if (_vvv3 != 0) {
            _vvv3--;
            if (_vvv3 <= 0) {
                _vv5 = false;
                _vvv3 = 0;
                return "";
            }
            return "";
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(int i, boolean z) throws java.lang.Exception {
        if (z) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2("Errore di collegamento con il Terminale " + anywheresoftware.b4a.BA.NumberToString(i));
        } else {
            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Errore di collegamento con il Terminale " + anywheresoftware.b4a.BA.NumberToString(i)), true);
        }
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clients set stato =3 where codice = " + anywheresoftware.b4a.BA.NumberToString(i));
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clients order by codice"));
        return "";
    }

    public static java.lang.String _spostatavolodaclient(int i, int i2) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "spostadaclient_" + anywheresoftware.b4a.BA.NumberToString(i) + "_" + anywheresoftware.b4a.BA.NumberToString(i2) + "_", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/sposta_").append(anywheresoftware.b4a.BA.NumberToString(i)).append("_").append(anywheresoftware.b4a.BA.NumberToString(i2)).append("_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append2.append(cassandraRisto.ital.main._v_numcassa).toString(), "");
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        int i = 0;
        try {
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String ReadString = anywheresoftware.b4a.objects.streams.File.ReadString(sb.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/FE").toString(), str2);
            java.util.Arrays.fill(new java.lang.String[0], "");
            anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
            java.lang.String[] Split = anywheresoftware.b4a.keywords.Regex.Split("_", ReadString);
            if (!str.equals("")) {
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_stampafattura < 10) {
                        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_stampafattura < 19) {
                            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba = processBA;
                            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ckprinter _vvvvvvvvvvvvvvvvvvvvv3 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv3(ba, cassandraRisto.ital.main._v_stampafattura);
                            if (_vvvvvvvvvvvvvvvvvvvvv3 == null) {
                                return "";
                            }
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_inizio();
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_paginizio(false);
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_testostile(false, true, true, false, false, false, false, "");
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_testogiustifica(1);
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_testostampa("Esito Invio Fattura:");
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_testostile(false, true, false, false, false, false, false, "");
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_testostampa(str);
                            int length = Split.length - 1;
                            while (i <= length) {
                                java.lang.String replace = Split[i].replace("@@@UNDERSCORE@@@", "_");
                                if (replace.length() > 2) {
                                    if (replace.substring(0, 1).equals("1")) {
                                        _vvvvvvvvvvvvvvvvvvvvv3._doc_testostile(false, true, true, false, false, false, false, "");
                                    } else {
                                        _vvvvvvvvvvvvvvvvvvvvv3._doc_testostile(false, true, false, false, false, false, false, "");
                                    }
                                    _vvvvvvvvvvvvvvvvvvvvv3._doc_testostampa(replace.substring(1));
                                }
                                i++;
                            }
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_pagfine(false);
                            _vvvvvvvvvvvvvvvvvvvvv3._doc_fine();
                            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_disconnettiprt) {
                                _vvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            }
                        }
                    }
                }
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_apri(false);
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Esito Invio Fattura:", 4);
                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(str, 1);
                int length2 = Split.length - 1;
                while (i <= length2) {
                    java.lang.String replace2 = Split[i].replace("@@@UNDERSCORE@@@", "_");
                    if (replace2.length() > 2) {
                        cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(replace2.substring(1), (int) anywheresoftware.b4a.BA.ObjectToNumber(replace2.substring(0, 1).equals("1") ? 4 : 3));
                    }
                    i++;
                }
                cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_chiudi();
            }
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(sb2.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/FE").toString(), str2);
        return "";
    }

    public static java.lang.String _timerupdvis_tick() throws java.lang.Exception {
        _vv2.setEnabled(false);
        _updvis("");
        return "";
    }

    public static java.lang.String _timerwaitgame_tick() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!cassandraRisto.ital.main._v_ipvis.equals("") && !_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                httpjobVar._initialize(processBA, "Game", getObject());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/wait").toString(), "");
                return "";
            }
        }
        _vv3.setEnabled(false);
        return "";
    }

    public static java.lang.String _uniscitavolodaclient(int i, int i2) throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "uniscidaclient_" + anywheresoftware.b4a.BA.NumberToString(i) + "_" + anywheresoftware.b4a.BA.NumberToString(i2) + "_", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_ipserver).append(":12312/unisci_").append(anywheresoftware.b4a.BA.NumberToString(i)).append("_").append(anywheresoftware.b4a.BA.NumberToString(i2)).append("_");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append2.append(cassandraRisto.ital.main._v_numcassa).toString(), "");
        return "";
    }

    public static java.lang.String _updbila() throws java.lang.Exception {
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "updbila", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipserverbila).append(":").append("12399").append("/upload?type=updbila").toString(), "");
        return "";
    }

    public static java.lang.String _updcashology() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!cassandraRisto.ital.main._v_ipvis.equals("") && !_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                httpjobVar._initialize(processBA, "Cashlogy", getObject());
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=bk").toString(), "get");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_logvd) {
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = processBA;
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=bk").toString(), "get");
                }
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r1 == cassandraRisto.ital.main._cm_cashmatic) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _updglory(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_ipvis.equals("")) {
            return "Configurare l'indirizzo Ip del VisionDroid";
        }
        if (!_vv7) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                if (!str.equals("")) {
                    if (str.contains("-")) {
                        str = "-" + str.replace("-", "");
                    }
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    int i = cassandraRisto.ital.main._v_glory;
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (i != cassandraRisto.ital.main._cm_gloryvd) {
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        int i2 = cassandraRisto.ital.main._v_glory;
                        cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    }
                    str = "@Valore@=" + str;
                    cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
                    httpjobVar._initialize(processBA, "glorySendImporto", getObject());
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                    cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=importo").toString(), str);
                    cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_logvd) {
                        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA ba = processBA;
                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                        cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/upload?type=importo").toString(), str);
                    }
                }
                return "";
            }
        }
        return "il Cash management risulta essere offline";
    }

    public static void _updvis(java.lang.String str) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_UpdVis(null, str).resume(processBA, null);
    }

    public static class ResumableSub_UpdVis extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _stringa;
        int limit28;
        cassandraRisto.ital.httpclient parent;
        int step28;
        java.lang.String _m_port = "";
        cassandraRisto.ital.httpjob _job2 = null;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _curdisp = null;
        anywheresoftware.b4a.keywords.StringBuilderWrapper _mstringa = null;
        anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _tw = null;
        int _x = 0;
        anywheresoftware.b4a.objects.collections.List _files = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        java.lang.String _mresult = "";

        public ResumableSub_UpdVis(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str) {
            this.parent = httpclientVar;
            this._stringa = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:109:0x0281, code lost:
        
            if (cassandraRisto.ital.main._v_glory > 0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:300:0x07f9, code lost:
        
            if (r0 == cassandraRisto.ital.main._cm_cashmatic) goto L149;
         */
        /* JADX WARN: Removed duplicated region for block: B:113:0x02bc A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0002 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:304:0x0802 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:307:0x0002 A[SYNTHETIC] */
        @Override // anywheresoftware.b4a.BA.ResumableSub
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            boolean z;
            boolean z2;
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 6;
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_ipvis.equals("")) {
                                cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                                if (!cassandraRisto.ital.httpclient._vv7) {
                                    cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                                    cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                                        break;
                                    }
                                }
                            }
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 6;
                            return;
                        case 6:
                            this.state = 7;
                            this._m_port = "12398";
                            break;
                        case 7:
                            this.state = 34;
                            if (this._stringa.equals("")) {
                                cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                                cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_glory <= 0) {
                                    break;
                                }
                            }
                            this.state = 9;
                            break;
                        case 9:
                            this.state = 10;
                            this._job2 = new cassandraRisto.ital.httpjob();
                            this._job2._initialize(cassandraRisto.ital.httpclient.processBA, "Vis", cassandraRisto.ital.httpclient.getObject());
                            break;
                        case 10:
                            this.state = 33;
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_glory > 0) {
                                this.state = 12;
                                break;
                            } else {
                                this.state = 26;
                                break;
                            }
                        case 12:
                            this.state = 13;
                            break;
                        case 13:
                            this.state = 18;
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int i = cassandraRisto.ital.main._v_glory;
                            cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (i != cassandraRisto.ital.main._cm_gloryvd) {
                                cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                                cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int i2 = cassandraRisto.ital.main._v_glory;
                                cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                                cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (i2 != cassandraRisto.ital.main._cm_cashmatic) {
                                    break;
                                }
                            }
                            this.state = 15;
                            break;
                        case 15:
                            this.state = 18;
                            this._stringa = "@Valore@=" + this._stringa;
                            break;
                        case 18:
                            this.state = 19;
                            cassandraRisto.ital.httpjob httpjobVar = this._job2;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                            cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String sb = append.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/upload?type=text").toString();
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(this._stringa).append(",");
                            cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                            cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(sb, append2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5)).toString());
                            break;
                        case 19:
                            this.state = 24;
                            cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_logvd) {
                                break;
                            } else {
                                this.state = 21;
                                break;
                            }
                        case 21:
                            this.state = 24;
                            cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                            cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String sb2 = append3.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/upload?type=text").toString();
                            java.lang.StringBuilder append4 = new java.lang.StringBuilder().append(this._stringa).append(",");
                            cassandraRisto.ital.httpclient httpclientVar15 = this.parent;
                            cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba2, sb2, append4.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5)).toString());
                            break;
                        case 24:
                            this.state = 33;
                            break;
                        case 26:
                            this.state = 27;
                            cassandraRisto.ital.httpjob httpjobVar2 = this._job2;
                            java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar16 = this.parent;
                            cassandraRisto.ital.main mainVar14 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append5.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/").append(this._stringa).toString(), "");
                            break;
                        case 27:
                            this.state = 32;
                            cassandraRisto.ital.httpclient httpclientVar17 = this.parent;
                            cassandraRisto.ital.main mainVar15 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_logvd) {
                                break;
                            } else {
                                this.state = 29;
                                break;
                            }
                        case 29:
                            this.state = 32;
                            cassandraRisto.ital.httpclient httpclientVar18 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar19 = this.parent;
                            cassandraRisto.ital.main mainVar16 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba3, append6.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/").append(this._stringa).toString(), "");
                            break;
                        case 32:
                            this.state = 33;
                            break;
                        case 33:
                            this.state = 34;
                            break;
                        case 34:
                            this.state = 96;
                            if (this._stringa.equals("")) {
                                cassandraRisto.ital.httpclient httpclientVar20 = this.parent;
                                cassandraRisto.ital.main mainVar17 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                break;
                            }
                            cassandraRisto.ital.httpclient httpclientVar21 = this.parent;
                            cassandraRisto.ital.main mainVar18 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int i3 = cassandraRisto.ital.main._v_glory;
                            cassandraRisto.ital.httpclient httpclientVar22 = this.parent;
                            cassandraRisto.ital.main mainVar19 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (anywheresoftware.b4a.keywords.Common.Not(i3 == cassandraRisto.ital.main._cm_gloryvd)) {
                                cassandraRisto.ital.httpclient httpclientVar23 = this.parent;
                                cassandraRisto.ital.main mainVar20 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int i4 = cassandraRisto.ital.main._v_glory;
                                cassandraRisto.ital.httpclient httpclientVar24 = this.parent;
                                cassandraRisto.ital.main mainVar21 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (anywheresoftware.b4a.keywords.Common.Not(i4 == cassandraRisto.ital.main._cm_cashmatic)) {
                                    z2 = true;
                                    if (!anywheresoftware.b4a.keywords.Common.Not(z2)) {
                                        this.state = 36;
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z2 = false;
                            if (!anywheresoftware.b4a.keywords.Common.Not(z2)) {
                            }
                        case 36:
                            this.state = 37;
                            this._curdisp = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            break;
                        case 37:
                            this.state = 42;
                            cassandraRisto.ital.httpclient httpclientVar25 = this.parent;
                            cassandraRisto.ital.main mainVar22 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                                this.state = 39;
                                break;
                            } else {
                                this.state = 41;
                                break;
                            }
                        case 39:
                            this.state = 42;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.httpclient httpclientVar26 = this.parent;
                            cassandraRisto.ital.main mainVar23 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._curdisp = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from VenTmp where Qtad>0 order by chiave"));
                            break;
                        case 41:
                            this.state = 42;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.httpclient httpclientVar27 = this.parent;
                            cassandraRisto.ital.main mainVar24 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._curdisp = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from VenTmp order by chiave"));
                            break;
                        case 42:
                            this.state = 95;
                            if (this._curdisp.getRowCount() > 0) {
                                this.state = 44;
                                break;
                            } else {
                                this.state = 72;
                                break;
                            }
                        case 44:
                            this.state = 45;
                            this._curdisp.setPosition(0);
                            this._mstringa = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
                            this._mstringa.Initialize();
                            this._tw = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
                            anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = this._tw;
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            textWriterWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(anywheresoftware.b4a.objects.streams.File.getDirInternal(), "Refresh.txt", false).getObject());
                            break;
                        case 45:
                            this.state = 48;
                            this.step28 = 1;
                            this.limit28 = this._curdisp.getRowCount() - 1;
                            this._x = 0;
                            this.state = 97;
                            break;
                        case 47:
                            this.state = 98;
                            this._curdisp.setPosition(this._x);
                            this._mstringa.Append(this._curdisp.GetString("chiave")).Append(",");
                            this._mstringa.Append(cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(this._curdisp.GetString("descrizione"), 50, false).replace(",", ".").replace(" ", "_")).Append(",");
                            this._mstringa.Append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._curdisp.GetDouble("importo").doubleValue(), 1, 2, 2, false).replace(",", ".")).Append(",");
                            this._mstringa.Append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._curdisp.GetDouble("scov").doubleValue(), 1, 2, 2, false).replace(",", ".")).Append(",");
                            this._mstringa.Append(this._curdisp.GetString("codice").replace(" ", "_")).Append(",");
                            this._mstringa.Append(this._curdisp.GetString("qta").replace(",", ".")).Append(",");
                            this._mstringa.Append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._curdisp.GetDouble("prezzov").doubleValue(), 1, 2, 2, false).replace(",", ".")).Append(",");
                            this._mstringa.Append(this._curdisp.GetString("totcre").replace(",", ".")).Append("\n");
                            break;
                        case 48:
                            this.state = 49;
                            this._tw.Write(anywheresoftware.b4a.BA.ObjectToString(this._mstringa));
                            this._tw.Close();
                            this._files = new anywheresoftware.b4a.objects.collections.List();
                            this._files.Initialize();
                            this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                            this._fd.Initialize();
                            cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            _multipartfiledataVar.Dir = anywheresoftware.b4a.objects.streams.File.getDirInternal();
                            this._fd.FileName = "Refresh.txt";
                            this._fd.KeyName = "upfile";
                            this._fd.ContentType = "text/plain";
                            this._files.Add(this._fd);
                            this._nv = new anywheresoftware.b4a.objects.collections.Map();
                            this._nv.Initialize();
                            this._nv.Put("upfile", "Refresh.txt");
                            this._job2 = new cassandraRisto.ital.httpjob();
                            this._job2._initialize(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.BA.NumberToString(1), cassandraRisto.ital.httpclient.getObject());
                            cassandraRisto.ital.httpjob httpjobVar3 = this._job2;
                            java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar28 = this.parent;
                            cassandraRisto.ital.main mainVar25 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append7.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/write").toString(), this._nv, this._files);
                            break;
                        case 49:
                            this.state = 54;
                            cassandraRisto.ital.httpclient httpclientVar29 = this.parent;
                            cassandraRisto.ital.main mainVar26 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_logvd) {
                                break;
                            } else {
                                this.state = 51;
                                break;
                            }
                        case 51:
                            this.state = 54;
                            cassandraRisto.ital.httpclient httpclientVar30 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder append8 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar31 = this.parent;
                            cassandraRisto.ital.main mainVar27 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba4, append8.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/write").toString(), "MultipartPost");
                            break;
                        case 54:
                            this.state = 55;
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                            this.state = 99;
                            return;
                        case 55:
                            this.state = 70;
                            if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                                this.state = 57;
                                break;
                            } else {
                                this.state = 69;
                                break;
                            }
                        case 57:
                            this.state = 58;
                            break;
                        case 58:
                            this.state = 67;
                            this.catchState = 66;
                            this.state = 60;
                            break;
                        case 60:
                            this.state = 61;
                            this.catchState = 66;
                            this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            break;
                        case 61:
                            this.state = 64;
                            if (!this._mresult.equals("OK")) {
                                this.state = 63;
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            this.state = 64;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
                            break;
                        case 64:
                            this.state = 67;
                            break;
                        case 66:
                            this.state = 67;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar32 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 67:
                            this.state = 70;
                            this.catchState = 0;
                            break;
                        case 69:
                            this.state = 70;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
                            break;
                        case 70:
                            this.state = 95;
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            break;
                        case 72:
                            this.state = 73;
                            this._job2 = new cassandraRisto.ital.httpjob();
                            this._job2._initialize(cassandraRisto.ital.httpclient.processBA, "Vis", cassandraRisto.ital.httpclient.getObject());
                            break;
                        case 73:
                            this.state = 94;
                            cassandraRisto.ital.httpclient httpclientVar33 = this.parent;
                            cassandraRisto.ital.main mainVar28 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_glory > 0) {
                                cassandraRisto.ital.httpclient httpclientVar34 = this.parent;
                                cassandraRisto.ital.main mainVar29 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int i5 = cassandraRisto.ital.main._v_glory;
                                cassandraRisto.ital.httpclient httpclientVar35 = this.parent;
                                cassandraRisto.ital.main mainVar30 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (i5 != cassandraRisto.ital.main._cm_gloryvd) {
                                    cassandraRisto.ital.httpclient httpclientVar36 = this.parent;
                                    cassandraRisto.ital.main mainVar31 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    int i6 = cassandraRisto.ital.main._v_glory;
                                    cassandraRisto.ital.httpclient httpclientVar37 = this.parent;
                                    cassandraRisto.ital.main mainVar32 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (i6 != cassandraRisto.ital.main._cm_cashmatic) {
                                        this.state = 75;
                                        break;
                                    }
                                }
                            }
                            cassandraRisto.ital.httpclient httpclientVar38 = this.parent;
                            cassandraRisto.ital.main mainVar33 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int i7 = cassandraRisto.ital.main._v_glory;
                            cassandraRisto.ital.httpclient httpclientVar39 = this.parent;
                            cassandraRisto.ital.main mainVar34 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (i7 != cassandraRisto.ital.main._cm_gloryvd) {
                                cassandraRisto.ital.httpclient httpclientVar40 = this.parent;
                                cassandraRisto.ital.main mainVar35 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int i8 = cassandraRisto.ital.main._v_glory;
                                cassandraRisto.ital.httpclient httpclientVar41 = this.parent;
                                cassandraRisto.ital.main mainVar36 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (i8 != cassandraRisto.ital.main._cm_nessuno) {
                                    cassandraRisto.ital.httpclient httpclientVar42 = this.parent;
                                    cassandraRisto.ital.main mainVar37 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    int i9 = cassandraRisto.ital.main._v_glory;
                                    cassandraRisto.ital.httpclient httpclientVar43 = this.parent;
                                    cassandraRisto.ital.main mainVar38 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (i9 != cassandraRisto.ital.main._cm_cashmatic) {
                                        break;
                                    }
                                }
                            }
                            this.state = 83;
                            break;
                        case 75:
                            this.state = 76;
                            cassandraRisto.ital.httpjob httpjobVar4 = this._job2;
                            java.lang.StringBuilder append9 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar44 = this.parent;
                            cassandraRisto.ital.main mainVar39 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append9.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/upload?type=text").toString(), "del");
                            break;
                        case 76:
                            this.state = 81;
                            cassandraRisto.ital.httpclient httpclientVar45 = this.parent;
                            cassandraRisto.ital.main mainVar40 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_logvd) {
                                break;
                            } else {
                                this.state = 78;
                                break;
                            }
                        case 78:
                            this.state = 81;
                            cassandraRisto.ital.httpclient httpclientVar46 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder append10 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar47 = this.parent;
                            cassandraRisto.ital.main mainVar41 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba5, append10.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/upload?type=text").toString(), "del");
                            break;
                        case 81:
                            this.state = 94;
                            break;
                        case 83:
                            this.state = 84;
                            break;
                        case 84:
                            this.state = 93;
                            if (this._stringa.toUpperCase().contains("RESTO")) {
                                cassandraRisto.ital.httpclient httpclientVar48 = this.parent;
                                cassandraRisto.ital.main mainVar42 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int i10 = cassandraRisto.ital.main._v_glory;
                                cassandraRisto.ital.httpclient httpclientVar49 = this.parent;
                                cassandraRisto.ital.main mainVar43 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (i10 != cassandraRisto.ital.main._cm_gloryvd) {
                                    cassandraRisto.ital.httpclient httpclientVar50 = this.parent;
                                    cassandraRisto.ital.main mainVar44 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    int i11 = cassandraRisto.ital.main._v_glory;
                                    cassandraRisto.ital.httpclient httpclientVar51 = this.parent;
                                    cassandraRisto.ital.main mainVar45 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    break;
                                }
                                z = true;
                                if (!anywheresoftware.b4a.keywords.Common.Not(z)) {
                                    this.state = 86;
                                    break;
                                } else {
                                    break;
                                }
                            }
                            z = false;
                            if (!anywheresoftware.b4a.keywords.Common.Not(z)) {
                            }
                        case 86:
                            this.state = 87;
                            cassandraRisto.ital.httpjob httpjobVar5 = this._job2;
                            java.lang.StringBuilder append11 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar52 = this.parent;
                            cassandraRisto.ital.main mainVar46 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append11.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/del").toString(), "");
                            break;
                        case 87:
                            this.state = 92;
                            cassandraRisto.ital.httpclient httpclientVar53 = this.parent;
                            cassandraRisto.ital.main mainVar47 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_logvd) {
                                break;
                            } else {
                                this.state = 89;
                                break;
                            }
                        case 89:
                            this.state = 92;
                            cassandraRisto.ital.httpclient httpclientVar54 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar55 = this.parent;
                            cassandraRisto.ital.main mainVar48 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba6, append12.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/del").toString(), "");
                            break;
                        case 92:
                            this.state = 93;
                            break;
                        case 93:
                            this.state = 94;
                            break;
                        case 94:
                            this.state = 95;
                            break;
                        case 95:
                            this.state = 96;
                            this._curdisp.Close();
                            break;
                        case 96:
                            this.state = -1;
                            break;
                        case 97:
                            this.state = 48;
                            if ((this.step28 > 0 && this._x <= this.limit28) || (this.step28 < 0 && this._x >= this.limit28)) {
                                this.state = 47;
                                break;
                            }
                            break;
                        case 98:
                            this.state = 97;
                            this._x = this._x + 0 + this.step28;
                            break;
                        case 99:
                            this.state = 55;
                            this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static void _updvis2(java.lang.String str, int i) throws java.lang.Exception {
        new cassandraRisto.ital.httpclient.ResumableSub_UpdVis2(null, str, i).resume(processBA, null);
    }

    public static class ResumableSub_UpdVis2 extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _stringa;
        int _taskid;
        int limit23;
        int limit64;
        cassandraRisto.ital.httpclient parent;
        int step23;
        int step64;
        java.lang.String _m_port = "";
        boolean _firsttime = false;
        anywheresoftware.b4a.objects.collections.List _ls = null;
        cassandraRisto.ital.httpjob _job2 = null;
        int _i = 0;
        flm.b4a.archiver.ArchiverForB4A _myzip = null;
        java.lang.String _txt = "";
        int _newprogress = 0;
        anywheresoftware.b4a.objects.collections.List _ls2 = null;
        int _xx = 0;
        java.lang.String _tmps = "";
        java.lang.String[] _mfile = null;
        anywheresoftware.b4a.objects.collections.List _files = null;
        cassandraRisto.ital.httpjob._multipartfiledata _fd = null;
        anywheresoftware.b4a.objects.collections.Map _nv = null;
        java.lang.String _mcmd = "";
        java.lang.String _mresult = "";

        public ResumableSub_UpdVis2(cassandraRisto.ital.httpclient httpclientVar, java.lang.String str, int i) {
            this.parent = httpclientVar;
            this._stringa = str;
            this._taskid = i;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 6;
                            cassandraRisto.ital.httpclient httpclientVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_ipvis.equals("")) {
                                cassandraRisto.ital.httpclient httpclientVar2 = this.parent;
                                if (!cassandraRisto.ital.httpclient._vv7) {
                                    cassandraRisto.ital.httpclient httpclientVar3 = this.parent;
                                    cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                                        cassandraRisto.ital.httpclient httpclientVar4 = this.parent;
                                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                            break;
                                        }
                                    }
                                }
                            }
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 6;
                            return;
                        case 6:
                            this.state = 7;
                            this._m_port = "12398";
                            this._firsttime = this._taskid == 21;
                            break;
                        case 7:
                            this.state = 12;
                            if (this._taskid != 21) {
                                break;
                            } else {
                                this.state = 9;
                                break;
                            }
                        case 9:
                            this.state = 12;
                            this._taskid = 11;
                            break;
                        case 12:
                            this.state = 13;
                            break;
                        case 13:
                            this.state = 99;
                            if (this._taskid != 11) {
                                break;
                            } else {
                                this.state = 15;
                                break;
                            }
                        case 15:
                            this.state = 16;
                            break;
                        case 16:
                            this.state = 98;
                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.httpclient httpclientVar5 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "sendimg.zip")) {
                                break;
                            } else {
                                this.state = 18;
                                break;
                            }
                        case 18:
                            this.state = 19;
                            this._ls = new anywheresoftware.b4a.objects.collections.List();
                            break;
                        case 19:
                            this.state = 58;
                            if (!this._firsttime) {
                                break;
                            } else {
                                this.state = 21;
                                break;
                            }
                        case 21:
                            this.state = 22;
                            break;
                        case 22:
                            this.state = 41;
                            cassandraRisto.ital.httpclient httpclientVar6 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_glory == 0) {
                                break;
                            } else {
                                cassandraRisto.ital.httpclient httpclientVar7 = this.parent;
                                cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_glory == 3) {
                                    break;
                                } else {
                                    this.state = 24;
                                    break;
                                }
                            }
                        case 24:
                            this.state = 25;
                            break;
                        case 25:
                            this.state = 40;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._stringa.startsWith("BK"))) {
                                break;
                            } else {
                                this.state = 27;
                                break;
                            }
                        case 27:
                            this.state = 28;
                            this._job2 = new cassandraRisto.ital.httpjob();
                            this._job2._initialize(cassandraRisto.ital.httpclient.processBA, "Vis", cassandraRisto.ital.httpclient.getObject());
                            break;
                        case 28:
                            this.state = 33;
                            cassandraRisto.ital.httpclient httpclientVar8 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int i = cassandraRisto.ital.main._v_glory;
                            cassandraRisto.ital.httpclient httpclientVar9 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (i != cassandraRisto.ital.main._cm_gloryvd) {
                                cassandraRisto.ital.httpclient httpclientVar10 = this.parent;
                                cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int i2 = cassandraRisto.ital.main._v_glory;
                                cassandraRisto.ital.httpclient httpclientVar11 = this.parent;
                                cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (i2 != cassandraRisto.ital.main._cm_cashmatic) {
                                    break;
                                }
                            }
                            this.state = 30;
                            break;
                        case 30:
                            this.state = 33;
                            this._stringa = "@Valore@=" + this._stringa;
                            break;
                        case 33:
                            this.state = 34;
                            cassandraRisto.ital.httpjob httpjobVar = this._job2;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar12 = this.parent;
                            cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/upload?type=img").toString(), "get");
                            break;
                        case 34:
                            this.state = 39;
                            cassandraRisto.ital.httpclient httpclientVar13 = this.parent;
                            cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_logvd) {
                                break;
                            } else {
                                this.state = 36;
                                break;
                            }
                        case 36:
                            this.state = 39;
                            cassandraRisto.ital.httpclient httpclientVar14 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar15 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba2, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/upload?type=img").toString(), "get");
                            break;
                        case 39:
                            this.state = 40;
                            break;
                        case 40:
                            this.state = 41;
                            return;
                        case 41:
                            this.state = 42;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar16 = this.parent;
                            cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba3, cassandraRisto.ital.main.getObject(), "myProgressInit");
                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.httpclient httpclientVar17 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.MakeDir(cassandraRisto.ital.mod1._vvvvv1, "sendimg");
                            this._ls.Initialize();
                            anywheresoftware.b4a.objects.collections.List list = this._ls;
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar18 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            list.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString()));
                            break;
                        case 42:
                            this.state = 45;
                            this.step23 = 1;
                            this.limit23 = this._ls.getSize() - 1;
                            this._i = 0;
                            this.state = 143;
                            break;
                        case 44:
                            this.state = 144;
                            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar19 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Delete(sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString(), anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(this._i)));
                            break;
                        case 45:
                            this.state = 46;
                            this._myzip = new flm.b4a.archiver.ArchiverForB4A();
                            break;
                        case 46:
                            this.state = 57;
                            this.catchState = 50;
                            this.state = 48;
                            break;
                        case 48:
                            this.state = 57;
                            this.catchState = 50;
                            flm.b4a.archiver.ArchiverForB4A archiverForB4A = this._myzip;
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar20 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.String str = cassandraRisto.ital.mod1._vvvvv1;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar21 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            archiverForB4A.UnZip(ba4, str, "sendimg.zip", sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString(), "");
                            break;
                        case 50:
                            this.state = 51;
                            this.catchState = 0;
                            this._txt = "Errore nel formato del file img.zip";
                            break;
                        case 51:
                            this.state = 56;
                            cassandraRisto.ital.httpclient httpclientVar22 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                this.state = 53;
                                break;
                            } else {
                                this.state = 55;
                                break;
                            }
                        case 53:
                            this.state = 56;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar23 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba5, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._txt);
                            break;
                        case 55:
                            this.state = 56;
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(this._txt), true);
                            break;
                        case 56:
                            this.state = 57;
                            return;
                        case 57:
                            this.state = 58;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar24 = this.parent;
                            cassandraRisto.ital.httpclient._vvv1 = 0;
                            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                            cassandraRisto.ital.httpclient httpclientVar25 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var11 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "sendimg.zip");
                            break;
                        case 58:
                            this.state = 59;
                            this._ls.Initialize();
                            anywheresoftware.b4a.objects.collections.List list2 = this._ls;
                            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar26 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var12 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            list2.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(sb4.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString()));
                            break;
                        case 59:
                            this.state = 97;
                            this.state = 61;
                            break;
                        case 61:
                            this.state = 62;
                            break;
                        case 62:
                            this.state = 96;
                            if (this._ls.getSize() > 0) {
                                this.state = 64;
                                break;
                            } else if (!anywheresoftware.b4a.keywords.Common.Not(this._firsttime)) {
                                break;
                            } else {
                                this.state = 95;
                                break;
                            }
                        case 64:
                            this.state = 65;
                            break;
                        case 65:
                            this.state = 70;
                            if (!this._firsttime) {
                                break;
                            } else {
                                this.state = 67;
                                break;
                            }
                        case 67:
                            this.state = 70;
                            cassandraRisto.ital.httpclient httpclientVar27 = this.parent;
                            cassandraRisto.ital.httpclient._vv0 = this._ls.getSize();
                            break;
                        case 70:
                            this.state = 71;
                            cassandraRisto.ital.httpclient httpclientVar28 = this.parent;
                            double d = cassandraRisto.ital.httpclient._vvv1 * 100;
                            cassandraRisto.ital.httpclient httpclientVar29 = this.parent;
                            this._newprogress = (int) (d / cassandraRisto.ital.httpclient._vv0);
                            anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar30 = this.parent;
                            cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba6, cassandraRisto.ital.main.getObject(), "myProgressShow", "Invio di " + anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0)) + " a VisionDroid", java.lang.Integer.valueOf(this._newprogress));
                            cassandraRisto.ital.httpclient httpclientVar31 = this.parent;
                            cassandraRisto.ital.httpclient httpclientVar32 = this.parent;
                            cassandraRisto.ital.httpclient._vvv1++;
                            break;
                        case 71:
                            this.state = 80;
                            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar33 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var13 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (anywheresoftware.b4a.objects.streams.File.Size(sb5.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString(), anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0))) <= 2500000) {
                                break;
                            } else {
                                this.state = 73;
                                break;
                            }
                        case 73:
                            this.state = 74;
                            anywheresoftware.b4a.BA ba7 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar34 = this.parent;
                            cassandraRisto.ital.main mainVar14 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba7, cassandraRisto.ital.main.getObject(), "myProgressHide");
                            anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar35 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var14 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Delete(sb6.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString(), anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0)));
                            this._txt = "Il file " + anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(0)) + " risulta essere più grande di 2,5Mb(non verrà inviato a VisionDroid).";
                            break;
                        case 74:
                            this.state = 79;
                            cassandraRisto.ital.httpclient httpclientVar36 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var15 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                this.state = 76;
                                break;
                            } else {
                                this.state = 78;
                                break;
                            }
                        case 76:
                            this.state = 79;
                            anywheresoftware.b4a.BA ba8 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar37 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var16 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba8, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", this._txt);
                            break;
                        case 78:
                            this.state = 79;
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence(this._txt), true);
                            break;
                        case 79:
                            this.state = 80;
                            this._ls.Initialize();
                            anywheresoftware.b4a.objects.collections.List list3 = this._ls;
                            anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar38 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var17 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            list3.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(sb7.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString()));
                            this.state = 59;
                            break;
                        case 80:
                            this.state = 81;
                            this._ls2 = new anywheresoftware.b4a.objects.collections.List();
                            this._ls2.Initialize();
                            break;
                        case 81:
                            this.state = 88;
                            this.step64 = 1;
                            this.limit64 = this._ls.getSize() - 1;
                            this._xx = 0;
                            this.state = 145;
                            break;
                        case 83:
                            this.state = 84;
                            this._tmps = anywheresoftware.b4a.BA.ObjectToString(this._ls.Get(this._xx));
                            break;
                        case 84:
                            this.state = 87;
                            if (!this._tmps.toLowerCase().endsWith(".jpg") && !this._tmps.toLowerCase().endsWith(".wmv") && !this._tmps.toLowerCase().endsWith(".avi") && !this._tmps.toLowerCase().endsWith(".mp4")) {
                                break;
                            } else {
                                this.state = 86;
                                break;
                            }
                            break;
                        case 86:
                            this.state = 87;
                            this._ls2.Add(this._ls.Get(this._xx));
                            this.state = 88;
                            break;
                        case 87:
                            this.state = 146;
                            break;
                        case 88:
                            this.state = 93;
                            if (this._ls2.getSize() > 0) {
                                this.state = 90;
                                break;
                            } else {
                                this.state = 92;
                                break;
                            }
                        case 90:
                            this.state = 93;
                            this._mfile = new java.lang.String[0];
                            java.util.Arrays.fill(this._mfile, "");
                            this._mfile = new java.lang.String[]{anywheresoftware.b4a.BA.ObjectToString(this._ls2.Get(0))};
                            this._myzip = new flm.b4a.archiver.ArchiverForB4A();
                            flm.b4a.archiver.ArchiverForB4A archiverForB4A2 = this._myzip;
                            anywheresoftware.b4a.BA ba9 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar39 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var18 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.String sb9 = sb8.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString();
                            java.lang.String[] strArr = this._mfile;
                            cassandraRisto.ital.httpclient httpclientVar40 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var19 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            archiverForB4A2.ZipFiles(ba9, sb9, strArr, cassandraRisto.ital.mod1._vvvvv1, "sendimg.zip", "");
                            anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                            cassandraRisto.ital.httpclient httpclientVar41 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var20 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.objects.streams.File.Delete(sb10.append(cassandraRisto.ital.mod1._vvvvv1).append("/sendimg").toString(), anywheresoftware.b4a.BA.ObjectToString(this._ls2.Get(0)));
                            break;
                        case 92:
                            this.state = 93;
                            cassandraRisto.ital.httpclient._updvis("ElaboraImg");
                            anywheresoftware.b4a.BA ba10 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar42 = this.parent;
                            cassandraRisto.ital.main mainVar15 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba10, cassandraRisto.ital.main.getObject(), "myProgressHide");
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Procedura ultimata correttamente"), true);
                            return;
                        case 93:
                            this.state = 96;
                            this.state = 97;
                            break;
                        case 95:
                            this.state = 96;
                            cassandraRisto.ital.httpclient._updvis("ElaboraImg");
                            anywheresoftware.b4a.BA ba11 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar43 = this.parent;
                            cassandraRisto.ital.main mainVar16 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba11, cassandraRisto.ital.main.getObject(), "myProgressHide");
                            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Procedura ultimata correttamente"), true);
                            return;
                        case 96:
                            this.state = 59;
                            break;
                        case 97:
                            this.state = 98;
                            break;
                        case 98:
                            this.state = 99;
                            break;
                        case 99:
                            this.state = 100;
                            this._files = new anywheresoftware.b4a.objects.collections.List();
                            this._files.Initialize();
                            this._fd = new cassandraRisto.ital.httpjob._multipartfiledata();
                            this._fd.Initialize();
                            cassandraRisto.ital.httpjob._multipartfiledata _multipartfiledataVar = this._fd;
                            cassandraRisto.ital.httpclient httpclientVar44 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var21 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            _multipartfiledataVar.Dir = cassandraRisto.ital.mod1._vvvvv1;
                            this._fd.FileName = this._stringa;
                            this._fd.KeyName = "upfile";
                            this._fd.ContentType = "application/octet-stream";
                            this._files.Add(this._fd);
                            this._nv = new anywheresoftware.b4a.objects.collections.Map();
                            this._nv.Initialize();
                            this._nv.Put("upfile", this._stringa);
                            this._mcmd = "write2";
                            break;
                        case 100:
                            this.state = 105;
                            if (!this._stringa.startsWith("BK")) {
                                break;
                            } else {
                                this.state = 102;
                                break;
                            }
                        case 102:
                            this.state = 105;
                            this._mcmd = "write3";
                            break;
                        case 105:
                            this.state = 106;
                            this._job2 = new cassandraRisto.ital.httpjob();
                            this._job2._initialize(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.BA.NumberToString(this._taskid), cassandraRisto.ital.httpclient.getObject());
                            cassandraRisto.ital.httpjob httpjobVar2 = this._job2;
                            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar45 = this.parent;
                            cassandraRisto.ital.main mainVar17 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            httpjobVar2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(append3.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/").append(this._mcmd).toString(), this._nv, this._files);
                            break;
                        case 106:
                            this.state = 111;
                            cassandraRisto.ital.httpclient httpclientVar46 = this.parent;
                            cassandraRisto.ital.main mainVar18 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_logvd) {
                                break;
                            } else {
                                this.state = 108;
                                break;
                            }
                        case 108:
                            this.state = 111;
                            cassandraRisto.ital.httpclient httpclientVar47 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var22 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba12 = cassandraRisto.ital.httpclient.processBA;
                            java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("http://");
                            cassandraRisto.ital.httpclient httpclientVar48 = this.parent;
                            cassandraRisto.ital.main mainVar19 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba12, append4.append(cassandraRisto.ital.main._v_ipvis).append(":").append(this._m_port).append("/").append(this._mcmd).toString(), "MultipartPost");
                            break;
                        case 111:
                            this.state = 112;
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1().setTimeout(150000);
                            anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", cassandraRisto.ital.httpclient.processBA, this, this._job2);
                            this.state = 147;
                            return;
                        case 112:
                            this.state = 142;
                            if (this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                                this.state = 114;
                                break;
                            } else {
                                this.state = 132;
                                break;
                            }
                        case 114:
                            this.state = 115;
                            break;
                        case 115:
                            this.state = 130;
                            this.catchState = 129;
                            this.state = 117;
                            break;
                        case 117:
                            this.state = 118;
                            this.catchState = 129;
                            this._mresult = this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            break;
                        case 118:
                            this.state = 127;
                            if (!this._mresult.equals("OK")) {
                                this.state = 120;
                                break;
                            } else if (this._taskid != 11) {
                                break;
                            } else {
                                this.state = 126;
                                break;
                            }
                        case 120:
                            this.state = 121;
                            break;
                        case 121:
                            this.state = 124;
                            if (this._taskid != 11) {
                                break;
                            } else {
                                this.state = 123;
                                break;
                            }
                        case 123:
                            this.state = 124;
                            anywheresoftware.b4a.BA ba13 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar49 = this.parent;
                            cassandraRisto.ital.main mainVar20 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba13, cassandraRisto.ital.main.getObject(), "myProgressHide");
                            break;
                        case 124:
                            this.state = 127;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
                            break;
                        case 126:
                            this.state = 127;
                            cassandraRisto.ital.httpclient._updvis2("sendimg.zip", 11);
                            break;
                        case 127:
                            this.state = 130;
                            break;
                        case 129:
                            this.state = 130;
                            this.catchState = 0;
                            cassandraRisto.ital.httpclient httpclientVar50 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var23 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.httpclient.processBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.httpclient.processBA).getMessage());
                            break;
                        case 130:
                            this.state = 142;
                            this.catchState = 0;
                            break;
                        case 132:
                            this.state = 133;
                            break;
                        case 133:
                            this.state = 136;
                            if (this._taskid != 11) {
                                break;
                            } else {
                                this.state = 135;
                                break;
                            }
                        case 135:
                            this.state = 136;
                            anywheresoftware.b4a.BA ba14 = cassandraRisto.ital.httpclient.processBA;
                            cassandraRisto.ital.httpclient httpclientVar51 = this.parent;
                            cassandraRisto.ital.main mainVar21 = cassandraRisto.ital.httpclient.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba14, cassandraRisto.ital.main.getObject(), "myProgressHide");
                            break;
                        case 136:
                            this.state = 141;
                            if (this._taskid >= 10) {
                                break;
                            } else {
                                this.state = 138;
                                break;
                            }
                        case 138:
                            this.state = 141;
                            cassandraRisto.ital.httpclient._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
                            break;
                        case 141:
                            this.state = 142;
                            break;
                        case 142:
                            this.state = -1;
                            this._job2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
                            break;
                        case 143:
                            this.state = 45;
                            if ((this.step23 > 0 && this._i <= this.limit23) || (this.step23 < 0 && this._i >= this.limit23)) {
                                this.state = 44;
                                break;
                            }
                            break;
                        case 144:
                            this.state = 143;
                            this._i = this._i + 0 + this.step23;
                            break;
                        case 145:
                            this.state = 88;
                            if ((this.step64 > 0 && this._xx <= this.limit64) || (this.step64 < 0 && this._xx >= this.limit64)) {
                                this.state = 83;
                                break;
                            }
                            break;
                        case 146:
                            this.state = 145;
                            this._xx = this._xx + 0 + this.step64;
                            break;
                        case 147:
                            this.state = 112;
                            this._job2 = (cassandraRisto.ital.httpjob) objArr[0];
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.httpclient.processBA.setLastException(e);
                }
            }
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_ipvis.equals("") || _vv7) {
            return "";
        }
        cassandraRisto.ital.httpjob httpjobVar = new cassandraRisto.ital.httpjob();
        httpjobVar._initialize(processBA, "restore1", getObject());
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("http://");
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        httpjobVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(append.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/lastMod").toString(), "");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_logvd) {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba = processBA;
            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("http://");
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, append2.append(cassandraRisto.ital.main._v_ipvis).append(":").append("12398").append("/lastMod").toString(), "");
        }
        return "";
    }
}
