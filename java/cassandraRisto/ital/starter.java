package cassandraRisto.ital;

/* loaded from: classes.dex */
public class starter extends android.app.Service {
    static cassandraRisto.ital.starter mostCurrent;
    public static anywheresoftware.b4a.BA processBA;
    private anywheresoftware.b4a.objects.ServiceHelper _service;
    public static anywheresoftware.b4a.objects.HttpServer _server = null;
    public static anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
    public static anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
    public static anywheresoftware.b4a.objects.Timer _v7 = null;
    public static anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public static long _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
    public static anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
    public static anywheresoftware.b4a.agraham.threading.Threading.SemaphoreWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public static anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public anywheresoftware.b4a.keywords.Common __c = null;
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

    public static class starter_BR extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            anywheresoftware.b4a.BA.LogInfo("** Receiver (starter) OnReceive **");
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) cassandraRisto.ital.starter.class);
            if (intent != null) {
                intent2.putExtra("b4a_internal_intent", intent);
            }
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startServiceFromReceiver(context, intent2, true, anywheresoftware.b4a.BA.class);
        }
    }

    public static java.lang.Class<?> getObject() {
        return cassandraRisto.ital.starter.class;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
            processBA = new anywheresoftware.b4a.BA(this, null, null, "cassandraRisto.ital", "cassandraRisto.ital.starter");
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
            processBA.raiseEvent2(null, true, "CREATE", true, "cassandraRisto.ital.starter", processBA, this._service, java.lang.Float.valueOf(anywheresoftware.b4a.keywords.Common.Density));
        }
        processBA.setActivityPaused(false);
        anywheresoftware.b4a.BA.LogInfo("*** Service (starter) Create ***");
        processBA.raiseEvent(null, "service_create", new java.lang.Object[0]);
        processBA.runHook("oncreate", this, null);
        anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.runWaitForLayouts();
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
            cassandraRisto.ital.starter.this.handleStart(this.val$intent);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        if (!anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.onStartCommand(processBA, new cassandraRisto.ital.starter.1(intent))) {
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.addWaitForLayout(new cassandraRisto.ital.starter.2(intent));
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
            cassandraRisto.ital.starter.processBA.setActivityPaused(false);
            anywheresoftware.b4a.BA.LogInfo("** Service (starter) Create **");
            cassandraRisto.ital.starter.processBA.raiseEvent(null, "service_create", new java.lang.Object[0]);
            cassandraRisto.ital.starter.this.handleStart(this.val$intent);
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.removeWaitForLayout();
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        super.onTaskRemoved(intent);
        processBA.raiseEvent(null, "service_taskremoved", new java.lang.Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStart(android.content.Intent intent) {
        anywheresoftware.b4a.BA.LogInfo("** Service (starter) Start **");
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
        anywheresoftware.b4a.BA.LogInfo("** Service (starter) Destroy (ignored)**");
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(int i, double d, int i2, int i3, boolean z, boolean z2, long j, java.lang.String str) throws java.lang.Exception {
        try {
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            list.Clear();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            map.Initialize();
            map.Put("nmov", java.lang.Integer.valueOf(i));
            map.Put("nfat", 0);
            if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.equals("")) {
                map.Put("cliente", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select descrizione from clienti where codice ='" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 + "'");
                if (ExecQuerySingleResult != null && !ExecQuerySingleResult.equals("")) {
                    cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    map.Put("clides", cassandraRisto.ital.modfunstr._left(processBA, ExecQuerySingleResult, 50L));
                }
            }
            map.Put("flgNF", true);
            map.Put("operatore", java.lang.Integer.valueOf(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1));
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 > 0 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 <= 9) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setPosition(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 - 1);
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                map.Put("opdes", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetString("descrizione").trim());
            } else {
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                map.Put("opdes", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("descrizione").trim());
            }
            map.Put("totale", java.lang.Double.valueOf(d));
            map.Put("sospeso", java.lang.Boolean.valueOf(z2));
            if (i2 != 10000) {
                map.Put("tavolo", java.lang.Integer.valueOf(i2));
            } else {
                map.Put("tavolo", 0);
            }
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("datam", anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)));
            if (i2 == 10000 && !_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.equals("")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                map.Put("datam2", sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ").append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString());
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
                anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                map.Put("datam2", append.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString());
            }
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba = processBA;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append2 = sb3.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
            anywheresoftware.b4a.keywords.DateTime dateTime6 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("datam3", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba, append2.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString()));
            if (i2 == 10000 && !_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.equals("")) {
                map.Put("memo", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            }
            if (j > 0) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.DateTime dateTime7 = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append3 = sb4.append(anywheresoftware.b4a.keywords.DateTime.Date(j)).append(" ");
                anywheresoftware.b4a.keywords.DateTime dateTime8 = anywheresoftware.b4a.keywords.Common.DateTime;
                map.Put("datam2", append3.append(anywheresoftware.b4a.keywords.DateTime.Time(j)).toString());
                map.Put("causale", "pr");
                map.Put("memo", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            } else {
                map.Put("fromweb", java.lang.Boolean.valueOf(z));
            }
            list.Add(map.getObject());
            if (j > 0) {
                cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA ba2 = processBA;
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "headmov", list);
            } else {
                cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA ba3 = processBA;
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "headmov", list);
            }
            if (i3 > 0) {
                java.lang.String NumberToString = anywheresoftware.b4a.BA.NumberToString(i3);
                java.lang.String NumberToString2 = anywheresoftware.b4a.BA.NumberToString(i);
                java.lang.String str2 = "";
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 > 0 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 <= 9) {
                    cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetString("funzioni2").substring(24, 25).equals("1")) {
                        str2 = " lock = 1,";
                    }
                } else {
                    cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("funzioni2").substring(24, 25).equals("1")) {
                        str2 = " lock = 1,";
                    }
                }
                if (NumberToString.endsWith("9") || i3 == 7) {
                    if (NumberToString.startsWith("8") || i3 == 7) {
                        cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0 where rifheadmov=" + NumberToString2);
                        cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update headmov set sospeso=0 where nmov=" + NumberToString2);
                        cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update venduto set flgNF=1 ,sospeso=0 where nmov=" + NumberToString2);
                        cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvv7(processBA, NumberToString2);
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2((int) java.lang.Double.parseDouble(NumberToString2), d);
                    } else {
                        cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set " + str2 + " stampap=1 where tavolo = " + anywheresoftware.b4a.BA.NumberToString(i2));
                    }
                } else {
                    if (NumberToString.startsWith("9")) {
                        cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set " + str2 + " stampap=1 where tavolo = " + anywheresoftware.b4a.BA.NumberToString(i2));
                    }
                    cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into StampaCP(nmov ,cp ,tavolo,FromDividi) values(" + anywheresoftware.b4a.BA.NumberToString(i) + "," + anywheresoftware.b4a.BA.NumberToString(i3) + "," + anywheresoftware.b4a.BA.NumberToString(i2) + "," + str + ")");
                }
            }
            if (anywheresoftware.b4a.keywords.Common.Not(z2) || i3 == 10 || i3 == 80) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(i, d);
                return "";
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01fd, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() > 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04dc A[Catch: Exception -> 0x05bc, TryCatch #0 {Exception -> 0x05bc, blocks: (B:3:0x000c, B:5:0x0070, B:8:0x0080, B:9:0x0089, B:11:0x0098, B:12:0x00c1, B:14:0x00fe, B:17:0x01ac, B:19:0x01e3, B:21:0x01f3, B:23:0x01ff, B:25:0x0215, B:27:0x022b, B:29:0x0247, B:30:0x025f, B:34:0x027c, B:37:0x0295, B:39:0x029d, B:41:0x02d8, B:43:0x03a3, B:45:0x03d8, B:46:0x0464, B:48:0x048e, B:50:0x0492, B:52:0x04a6, B:54:0x04bb, B:55:0x04d0, B:57:0x04dc, B:58:0x04e2, B:60:0x04f7, B:62:0x0507, B:64:0x051c, B:66:0x0522, B:67:0x0528, B:69:0x0534, B:70:0x053a, B:72:0x0546, B:73:0x0571, B:75:0x057d, B:76:0x0586, B:80:0x05f1, B:83:0x05ff, B:85:0x0609, B:87:0x0615, B:88:0x065d, B:89:0x0501, B:90:0x05e5, B:92:0x058f, B:93:0x05d6), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0534 A[Catch: Exception -> 0x05bc, TryCatch #0 {Exception -> 0x05bc, blocks: (B:3:0x000c, B:5:0x0070, B:8:0x0080, B:9:0x0089, B:11:0x0098, B:12:0x00c1, B:14:0x00fe, B:17:0x01ac, B:19:0x01e3, B:21:0x01f3, B:23:0x01ff, B:25:0x0215, B:27:0x022b, B:29:0x0247, B:30:0x025f, B:34:0x027c, B:37:0x0295, B:39:0x029d, B:41:0x02d8, B:43:0x03a3, B:45:0x03d8, B:46:0x0464, B:48:0x048e, B:50:0x0492, B:52:0x04a6, B:54:0x04bb, B:55:0x04d0, B:57:0x04dc, B:58:0x04e2, B:60:0x04f7, B:62:0x0507, B:64:0x051c, B:66:0x0522, B:67:0x0528, B:69:0x0534, B:70:0x053a, B:72:0x0546, B:73:0x0571, B:75:0x057d, B:76:0x0586, B:80:0x05f1, B:83:0x05ff, B:85:0x0609, B:87:0x0615, B:88:0x065d, B:89:0x0501, B:90:0x05e5, B:92:0x058f, B:93:0x05d6), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0546 A[Catch: Exception -> 0x05bc, TryCatch #0 {Exception -> 0x05bc, blocks: (B:3:0x000c, B:5:0x0070, B:8:0x0080, B:9:0x0089, B:11:0x0098, B:12:0x00c1, B:14:0x00fe, B:17:0x01ac, B:19:0x01e3, B:21:0x01f3, B:23:0x01ff, B:25:0x0215, B:27:0x022b, B:29:0x0247, B:30:0x025f, B:34:0x027c, B:37:0x0295, B:39:0x029d, B:41:0x02d8, B:43:0x03a3, B:45:0x03d8, B:46:0x0464, B:48:0x048e, B:50:0x0492, B:52:0x04a6, B:54:0x04bb, B:55:0x04d0, B:57:0x04dc, B:58:0x04e2, B:60:0x04f7, B:62:0x0507, B:64:0x051c, B:66:0x0522, B:67:0x0528, B:69:0x0534, B:70:0x053a, B:72:0x0546, B:73:0x0571, B:75:0x057d, B:76:0x0586, B:80:0x05f1, B:83:0x05ff, B:85:0x0609, B:87:0x0615, B:88:0x065d, B:89:0x0501, B:90:0x05e5, B:92:0x058f, B:93:0x05d6), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x057d A[Catch: Exception -> 0x05bc, TryCatch #0 {Exception -> 0x05bc, blocks: (B:3:0x000c, B:5:0x0070, B:8:0x0080, B:9:0x0089, B:11:0x0098, B:12:0x00c1, B:14:0x00fe, B:17:0x01ac, B:19:0x01e3, B:21:0x01f3, B:23:0x01ff, B:25:0x0215, B:27:0x022b, B:29:0x0247, B:30:0x025f, B:34:0x027c, B:37:0x0295, B:39:0x029d, B:41:0x02d8, B:43:0x03a3, B:45:0x03d8, B:46:0x0464, B:48:0x048e, B:50:0x0492, B:52:0x04a6, B:54:0x04bb, B:55:0x04d0, B:57:0x04dc, B:58:0x04e2, B:60:0x04f7, B:62:0x0507, B:64:0x051c, B:66:0x0522, B:67:0x0528, B:69:0x0534, B:70:0x053a, B:72:0x0546, B:73:0x0571, B:75:0x057d, B:76:0x0586, B:80:0x05f1, B:83:0x05ff, B:85:0x0609, B:87:0x0615, B:88:0x065d, B:89:0x0501, B:90:0x05e5, B:92:0x058f, B:93:0x05d6), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0615 A[Catch: Exception -> 0x05bc, TryCatch #0 {Exception -> 0x05bc, blocks: (B:3:0x000c, B:5:0x0070, B:8:0x0080, B:9:0x0089, B:11:0x0098, B:12:0x00c1, B:14:0x00fe, B:17:0x01ac, B:19:0x01e3, B:21:0x01f3, B:23:0x01ff, B:25:0x0215, B:27:0x022b, B:29:0x0247, B:30:0x025f, B:34:0x027c, B:37:0x0295, B:39:0x029d, B:41:0x02d8, B:43:0x03a3, B:45:0x03d8, B:46:0x0464, B:48:0x048e, B:50:0x0492, B:52:0x04a6, B:54:0x04bb, B:55:0x04d0, B:57:0x04dc, B:58:0x04e2, B:60:0x04f7, B:62:0x0507, B:64:0x051c, B:66:0x0522, B:67:0x0528, B:69:0x0534, B:70:0x053a, B:72:0x0546, B:73:0x0571, B:75:0x057d, B:76:0x0586, B:80:0x05f1, B:83:0x05ff, B:85:0x0609, B:87:0x0615, B:88:0x065d, B:89:0x0501, B:90:0x05e5, B:92:0x058f, B:93:0x05d6), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String[] strArr, int i, java.lang.String str, int i2, boolean z, long j, boolean z2) throws java.lang.Exception {
        java.lang.String str2;
        anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
        map.Initialize();
        try {
            map.Put("codice", strArr[0]);
            map.Put("descrizione", strArr[1]);
            map.Put("brep", false);
            map.Put("qta", strArr[2]);
            map.Put("prezzov", strArr[3]);
            map.Put("importo", strArr[7]);
            map.Put("reparto", strArr[5]);
            map.Put("QtaConDecimali", strArr[11]);
            map.Put("sospeso", true);
            map.Put("cameriere", java.lang.Integer.valueOf(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1));
            map.Put("flgNF", false);
            if (z2) {
                map.Put("EseguitoSuPalmare", true);
            }
            if (j == 0) {
                map.Put("FromWeb", java.lang.Boolean.valueOf(z));
            }
            if (strArr[14].equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                map.Put("totcre", cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(processBA, "1234" + strArr[9], 9L));
            } else if (i2 > 0) {
                map.Put("totcre", java.lang.Double.valueOf(java.lang.Double.parseDouble(strArr[9]) + i2));
                map.Put("QtaConDecimali", java.lang.Double.valueOf(java.lang.Double.parseDouble(strArr[11]) + i2));
            } else {
                map.Put("totcre", strArr[9]);
            }
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select iva,ingredientisumf,ingredientisunf,uscita,stampaesclusiva,stampante2,flgmag,distinta,punti,scov,scop,reparto from anagra where codint = '" + strArr[8] + "'"));
            if (cursorWrapper2.getRowCount() > 0) {
                cursorWrapper2.setPosition(0);
                map.Put("iva", java.lang.Integer.valueOf(cursorWrapper2.GetInt("iva")));
                map.Put("ingredientisumf", java.lang.Integer.valueOf(cursorWrapper2.GetInt("ingredientisumf")));
                map.Put("ingredientisunf", java.lang.Integer.valueOf(cursorWrapper2.GetInt("ingredientisunf")));
                map.Put("stampaesclusiva", java.lang.Integer.valueOf(cursorWrapper2.GetInt("stampaesclusiva")));
                map.Put("flgmag", java.lang.Integer.valueOf(cursorWrapper2.GetInt("flgmag")));
                map.Put("stampante2", java.lang.Integer.valueOf(cursorWrapper2.GetInt("stampante2")));
                map.Put("uscita", java.lang.Integer.valueOf(cursorWrapper2.GetInt("uscita")));
                map.Put("distinta", java.lang.Integer.valueOf(cursorWrapper2.GetInt("distinta")));
                map.Put("punti", java.lang.Integer.valueOf(cursorWrapper2.GetInt("punti")));
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setPosition(cursorWrapper2.GetInt("reparto"));
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                map.Put("flgNF", java.lang.Boolean.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.GetInt("NF") == 1));
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(cursorWrapper2.GetInt("iva"));
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                map.Put("aliquota2", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2"));
                if (cursorWrapper2.GetDouble("scop").doubleValue() <= 0.0d && cursorWrapper2.GetDouble("scov").doubleValue() <= 0.0d) {
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                double doubleValue = cursorWrapper2.GetDouble("scop").doubleValue();
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize() > 0) {
                    cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.ContainsKey(java.lang.Integer.valueOf(cursorWrapper2.GetInt("reparto")))) {
                        cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (doubleValue < anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get(java.lang.Integer.valueOf(cursorWrapper2.GetInt("reparto"))))) {
                            cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            doubleValue = anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get(java.lang.Integer.valueOf(cursorWrapper2.GetInt("reparto"))));
                        }
                    }
                }
                double parseDouble = java.lang.Double.parseDouble(strArr[7]);
                if (cursorWrapper2.GetDouble("scov").doubleValue() > 0.0d && doubleValue == 0.0d) {
                    doubleValue = anywheresoftware.b4a.keywords.Common.Round2((100.0d * cursorWrapper2.GetDouble("scov").doubleValue()) / parseDouble, 2);
                }
                if (doubleValue > 0.0d && cursorWrapper2.GetInt("reparto") > 0) {
                    map.Put("scop", java.lang.Double.valueOf(doubleValue));
                    map.Put("scov", java.lang.Double.valueOf(anywheresoftware.b4a.keywords.Common.Round2(parseDouble - ((1.0d - (doubleValue / 100.0d)) * parseDouble), 2)));
                    map.Put("importo", java.lang.Double.valueOf(parseDouble - anywheresoftware.b4a.keywords.Common.Round2(parseDouble - ((1.0d - (doubleValue / 100.0d)) * parseDouble), 2)));
                }
            }
            cursorWrapper2.Close();
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("datam", anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
            anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("datam2", append.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString());
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba = processBA;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append2 = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
            anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("datam3", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba, append2.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString()));
            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb3 = append3.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString();
            if (strArr[13].equals("1")) {
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(str + "/IMG", strArr[18] + "tmp.png")) {
                    anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(str + "/IMG", strArr[18] + "tmp.png", str + "/IMG", sb3 + ".png");
                    anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(str + "/IMG", strArr[18] + "tmp.png");
                }
            }
            map.Put("idRiga", sb3);
            map.Put("codint", strArr[8]);
            cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
            map.Put("nmov", java.lang.Integer.valueOf(i));
            cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        if (cassandraRisto.ital.main._v_turni && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 > 0) {
            cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, strArr[19]) > 0.0d) {
                cassandraRisto.ital.modfunstr modfunstrVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, strArr[19]) <= _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    map.Put("turno", java.lang.Integer.valueOf(((int) java.lang.Double.parseDouble(strArr[19])) * (-1)));
                    if (strArr[20].equals("0")) {
                        strArr[20] = "";
                    }
                    map.Put("gruppomenu", strArr[20]);
                    if (!strArr[21].equals("0") || !_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.equals("")) {
                        strArr[21] = "";
                    }
                    map.Put("memo", strArr[21]);
                    if (strArr[22].equals("") && anywheresoftware.b4a.keywords.Common.Not(z)) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = strArr[22];
                    } else if (!strArr[22].equals("") && z && !_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.equals("")) {
                        str2 = strArr[22];
                        if (str2.contains("__")) {
                            int parseDouble2 = ((int) java.lang.Double.parseDouble(str2.substring(str2.lastIndexOf("__") + 2))) + 1;
                            map.Put("sottoconto", java.lang.Integer.valueOf(parseDouble2));
                            str2 = "-Sottoconto " + anywheresoftware.b4a.BA.NumberToString(parseDouble2) + str2.substring(0, str2.lastIndexOf("__")) + "-";
                        }
                        map.Put("memo", str2);
                    }
                    if (!strArr[23].equals("0")) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = strArr[23];
                    }
                    if (!strArr[24].equals("0")) {
                        map.Put("sottoconto", strArr[24]);
                        map.Put("memo", "-Sottoconto " + strArr[24] + "-");
                    }
                    if (!strArr[25].equals("0")) {
                        map.Put("sottocontoT", strArr[25]);
                    }
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5++;
                    return map;
                }
            }
        }
        map.Put("turno", strArr[19]);
        if (strArr[20].equals("0")) {
        }
        map.Put("gruppomenu", strArr[20]);
        if (!strArr[21].equals("0")) {
        }
        strArr[21] = "";
        map.Put("memo", strArr[21]);
        if (strArr[22].equals("")) {
        }
        if (!strArr[22].equals("")) {
            str2 = strArr[22];
            if (str2.contains("__")) {
            }
            map.Put("memo", str2);
        }
        if (!strArr[23].equals("0")) {
        }
        if (!strArr[24].equals("0")) {
        }
        if (!strArr[25].equals("0")) {
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5++;
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008d A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:3:0x0005, B:5:0x0036, B:7:0x0065, B:9:0x0079, B:11:0x008d, B:13:0x0097, B:14:0x00a5, B:15:0x00a7, B:19:0x015d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015d A[Catch: Exception -> 0x0180, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0180, blocks: (B:3:0x0005, B:5:0x0036, B:7:0x0065, B:9:0x0079, B:11:0x008d, B:13:0x0097, B:14:0x00a5, B:15:0x00a7, B:19:0x015d), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(int i, double d) throws java.lang.Exception {
        int i2;
        java.lang.String ExecQuerySingleResult;
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) FROM Venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(i) + " and codice ='msg10002'")) > 0.0d) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select descrizione FROM Venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(i) + " and codice ='msg10002'").equals("1")) {
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) FROM pagamenti where pagamentopalmare=1 and (RTPagamento=8 or RTPagamento=3)")) > 0.0d) {
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        i2 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select codice FROM pagamenti where pagamentopalmare=1 and (RTPagamento=8 or RTPagamento=3) limit 1"));
                        if (i2 != 0) {
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.equals("")) {
                                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select descrizione from pagamenti where codice =0");
                            }
                            ExecQuerySingleResult = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                        } else {
                            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select descrizione from pagamenti where codice =" + anywheresoftware.b4a.BA.NumberToString(i2));
                        }
                        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                        list.Initialize();
                        list.Clear();
                        anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
                        map.Initialize();
                        map.Initialize();
                        map.Put("nmov", java.lang.Integer.valueOf(i));
                        map.Put("codice", java.lang.Integer.valueOf(i2));
                        map.Put("descrizione", ExecQuerySingleResult);
                        map.Put("qta", 1);
                        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        map.Put("datam", anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)));
                        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA ba = processBA;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
                        anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        map.Put("datam3", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba, append.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString()));
                        map.Put("importo", java.lang.Double.valueOf(d));
                        list.Add(map.getObject());
                        cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        anywheresoftware.b4a.BA ba2 = processBA;
                        cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "CausaliPagamenti", list);
                        return "";
                    }
                }
            }
            i2 = 0;
            if (i2 != 0) {
            }
            anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
            list2.Initialize();
            list2.Clear();
            anywheresoftware.b4a.objects.collections.Map map2 = new anywheresoftware.b4a.objects.collections.Map();
            map2.Initialize();
            map2.Initialize();
            map2.Put("nmov", java.lang.Integer.valueOf(i));
            map2.Put("codice", java.lang.Integer.valueOf(i2));
            map2.Put("descrizione", ExecQuerySingleResult);
            map2.Put("qta", 1);
            anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map2.Put("datam", anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)));
            cassandraRisto.ital.mod1 mod1Var22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba3 = processBA;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            anywheresoftware.b4a.keywords.DateTime dateTime22 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append2 = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
            anywheresoftware.b4a.keywords.DateTime dateTime32 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var42 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map2.Put("datam3", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba3, append2.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString()));
            map2.Put("importo", java.lang.Double.valueOf(d));
            list2.Add(map2.getObject());
            cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA ba22 = processBA;
            cassandraRisto.ital.main mainVar72 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba22, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "CausaliPagamenti", list2);
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String[] strArr) throws java.lang.Exception {
        try {
            if (strArr.length == 7) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.keywords.DateTime.Date((long) java.lang.Double.parseDouble(strArr[4]))).append(" ");
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.String sb2 = append.append(anywheresoftware.b4a.keywords.DateTime.Time((long) java.lang.Double.parseDouble(strArr[4]))).toString();
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update headmov set cassa=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", strArr[6]) + " , dataeoraffm ='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", sb2) + "',\n\t\t\t\t\t\t\t\t\t\t\t\tnscontrinoffm=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", strArr[1]) + ",nChiusura=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", strArr[2]) + " ,\n\t\t\t\t\t\t\t\t\t\t\t\tmatricolacassap='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", strArr[3]) + "' where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", strArr[5]) + "");
                return "";
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static boolean _application_error(anywheresoftware.b4a.objects.B4AException b4AException, java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(processBA, "From Starter:\n" + b4AException.getMessage());
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(processBA, str);
        return true;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws java.lang.Exception {
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r3.equals("") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r0 = new flm.b4a.archiver.ArchiverForB4A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r8 > 10) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r0.UnZip(cassandraRisto.ital.starter.processBA, r14, r3, r14, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r0 = anywheresoftware.b4a.keywords.Common.File;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(r14, "vend.csv")) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r0 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        return "chkErrore di comunicazione";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0112, code lost:
    
        r2 = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
        r0 = anywheresoftware.b4a.keywords.Common.File;
        r2.Initialize(anywheresoftware.b4a.objects.streams.File.OpenInput(r14, "vend.csv").getObject());
        r2.ReadLine();
        r1 = r2.ReadLine();
        r0 = "";
        r4 = new anywheresoftware.b4a.objects.collections.Map();
        r5 = new anywheresoftware.b4a.objects.collections.Map();
        r4.Initialize();
        r5.Initialize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0144, code lost:
    
        if (r1 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014b, code lost:
    
        if (r1.length() >= 3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01b1, code lost:
    
        if (r1.length() <= 5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b3, code lost:
    
        java.util.Arrays.fill(new java.lang.String[0], "");
        r8 = anywheresoftware.b4a.keywords.Common.Regex;
        r1 = anywheresoftware.b4a.keywords.Regex.Split(",", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01cd, code lost:
    
        if (r1[0].startsWith("vv") != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d9, code lost:
    
        if (r1[0].startsWith("zon1") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01e1, code lost:
    
        r4.Put(r1[0], java.lang.Double.valueOf(anywheresoftware.b4a.BA.ObjectToNumber(r4.GetDefault(r1[0], 0)) + java.lang.Double.parseDouble(r1[2])));
        r5.Put(r1[0], r1[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020c, code lost:
    
        r1 = r2.ReadLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01db, code lost:
    
        r1 = r2.ReadLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
    
        r2.Close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0154, code lost:
    
        if (r4.getSize() <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0156, code lost:
    
        r2 = r4.Keys();
        r8 = r2.getSize();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015f, code lost:
    
        if (r1 >= r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0161, code lost:
    
        r7 = anywheresoftware.b4a.BA.ObjectToString(r2.Get(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017a, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(r7, (int) anywheresoftware.b4a.BA.ObjectToNumber(r4.Get(r7)))) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
    
        r0 = r0 + "L'articolo " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", r5.Get(r7)) + " non è più disponibile\n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a9, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0218, code lost:
    
        if (r0.equals("") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0220, code lost:
    
        if (cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ContainsKey(r15) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0222, code lost:
    
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Remove(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0227, code lost:
    
        r1 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r14, "vend.csv");
        r1 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return "chkProblema disponibilità articoli:\n" + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024f, code lost:
    
        if (r3.equals("") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0251, code lost:
    
        r0 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r14, "vend.csv");
        r0 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return "chk";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return "chk";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f0, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f1, code lost:
    
        cassandraRisto.ital.starter.processBA.setLastException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f8, code lost:
    
        if (r8 == 9) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0102, code lost:
    
        r1 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(cassandraRisto.ital.starter.processBA, 500);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        r0 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return "chkErrore di comunicazione";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0261, code lost:
    
        return "chkErrore Verifica Disponibilità";
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.Exception e;
        java.lang.String str3;
        java.lang.String str4 = "";
        java.lang.String str5 = "";
        try {
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            list.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(str));
            str4 = "chk";
            int size = list.getSize() - 1;
            int i = 0;
            while (true) {
                if (i > size) {
                    break;
                }
                java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(list.Get(i));
                try {
                    if (ObjectToString.contains("_") && ObjectToString.startsWith("Vend")) {
                        java.util.Arrays.fill(new java.lang.String[0], "");
                        anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                        java.lang.String[] Split = anywheresoftware.b4a.keywords.Regex.Split("_", ObjectToString);
                        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ContainsKey(str2))) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Put(str2, Split[1]);
                            str5 = ObjectToString;
                        } else {
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get(str2).equals(Split[1])) {
                                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                                anywheresoftware.b4a.objects.streams.File.Delete(str, ObjectToString);
                                return ObjectToString;
                            }
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Put(str2, Split[1]);
                            str5 = ObjectToString;
                        }
                    } else {
                        str5 = "";
                        i++;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    str5 = ObjectToString;
                    str3 = "chk";
                    processBA.setLastException(e);
                    if (!str5.equals("")) {
                        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Delete(str, "vend.csv");
                        anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Delete(str, str5);
                    }
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                    return str3;
                }
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            str3 = str4;
            processBA.setLastException(e);
            if (!str5.equals("")) {
            }
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return str3;
        }
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        for (int i = 0; i <= 5; i++) {
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(str, str2)) {
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(processBA, 500);
            } else {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, boolean z) throws java.lang.Exception {
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        if (!cassandraRisto.ital.main._v_musers.equals("")) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._v_mpwds.equals("")) {
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 == 0 && z) {
                    return "<DIV align=center><B><font size='6' color='red'>Richiedere codice attivazione per utilizzare questa funzione ...</font></B></DIV>";
                }
                java.lang.String GetParameter = servletRequestWrapper.GetParameter("SID");
                if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.ContainsKey(GetParameter))) {
                    return "<DIV align=center><B><font size='6' color='red'>Sessione non valida ...</font></B></DIV>";
                }
                long parseDouble = (long) java.lang.Double.parseDouble(GetParameter);
                b4a.example.dateutils dateutilsVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (b4a.example.dateutils._periodbetweenindays(ba, parseDouble, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)).Hours > 1) {
                    return "<DIV align=center><B><font size='6' color='red'>Sessione Scaduta ...</font></B></DIV>";
                }
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = GetParameter;
                return "";
            }
        }
        return "<DIV align=center><B><font size='6' color='red'>Configurare UserName e Password per attivare il sistema ...</font></B></DIV>";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str) throws java.lang.Exception {
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select Serial,IP from Palmari where Attivo = 1 order by Serial"));
        if (cursorWrapper2.getRowCount() > 0) {
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i = 0; i <= rowCount; i++) {
                cursorWrapper2.setPosition(i);
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba, cassandraRisto.ital.httpclient.getObject(), "ChiamaC", cursorWrapper2.GetString("IP"), str);
            }
        }
        cursorWrapper2.Close();
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str) throws java.lang.Exception {
        try {
            if (str.length() < 2) {
                str = "Numero Nascosto";
            }
            anywheresoftware.b4a.keywords.Common.CallSubNew3(processBA, "Main", "GestisciTelefonata", str, true);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                anywheresoftware.b4a.keywords.Common.CallSubNew3(processBA, "Main", "GestisciTelefonata", str, true);
            } else {
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvv5(processBA, str, true);
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        java.lang.String str;
        int i;
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        try {
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("select * from Despagine where nopalmari=0 and codice >=10 and ((select count(*) from pagine where valore = Despagine.codice and tipo  = ");
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_pagina)).append(")>0 or (select count(*) from Toolbar where valore = Despagine.codice and tipo  = ");
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, sql.ExecQuery(append2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_pagina)).append(")>0)").toString()));
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.collections.Map map2 = new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.collections.Map map3 = new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.collections.Map map4 = new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.collections.Map map5 = new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.collections.Map map6 = new anywheresoftware.b4a.objects.collections.Map();
            map2.Initialize();
            map.Initialize();
            map3.Initialize();
            map4.Initialize();
            map5.Initialize();
            map6.Initialize();
            try {
                if (cursorWrapper2.getRowCount() > 0) {
                    int rowCount = cursorWrapper2.getRowCount() - 1;
                    for (int i2 = 0; i2 <= rowCount; i2++) {
                        cursorWrapper2.setPosition(i2);
                        int parseDouble = (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("codice"));
                        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("select * from pagine where pagina = ").append(anywheresoftware.b4a.BA.NumberToString(parseDouble)).append("  and tipo = ");
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, sql2.ExecQuery(append3.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append("  order by valore").toString()));
                        if (cursorWrapper4.getRowCount() > 0) {
                            map.Put(java.lang.Integer.valueOf(parseDouble), cursorWrapper4.getObject());
                            map2.Put(java.lang.Integer.valueOf(parseDouble), cursorWrapper2.GetString("descrizione"));
                        }
                    }
                } else {
                    new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("select * from pagine where pagina = ").append(anywheresoftware.b4a.BA.NumberToString(0)).append("  and tipo = ");
                    cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    map.Put(-1, ((anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, sql3.ExecQuery(append4.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append("  order by valore").toString()))).getObject());
                }
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper6 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper7 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper6, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select tavolo,timelast,rifheadmov,ricconto,stampap,lock,inmodifica,uscita,addturni,coperti,importo from tavoli order by tavolo"));
                int i3 = 0;
                int rowCount2 = cursorWrapper7.getRowCount() - 1;
                int i4 = 0;
                while (i4 <= rowCount2) {
                    cursorWrapper7.setPosition(i4);
                    int i5 = i3 + 1;
                    int ObjectToNumber = (int) anywheresoftware.b4a.BA.ObjectToNumber(cursorWrapper7.GetLong("rifheadmov").longValue() == 0 ? 4 : 5);
                    if (ObjectToNumber == 4) {
                        cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                            cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ContainsKey(cursorWrapper7.GetString("tavolo"))) {
                                try {
                                    cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper8 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cursorWrapper8.setPosition((int) anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get(cursorWrapper7.GetString("tavolo"))));
                                    cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    java.lang.String GetString = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.GetString("data");
                                    b4a.example.dateutils dateutilsVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                    long _setdateandtime = b4a.example.dateutils._setdateandtime(processBA, (int) java.lang.Double.parseDouble(GetString.substring(0, 4)), (int) java.lang.Double.parseDouble(GetString.substring(5, 7)), (int) java.lang.Double.parseDouble(GetString.substring(8, 10)), (int) java.lang.Double.parseDouble(GetString.substring(11, 13)), (int) java.lang.Double.parseDouble(GetString.substring(14, 16)), 0);
                                    b4a.example.dateutils dateutilsVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                    anywheresoftware.b4a.BA ba = processBA;
                                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    b4a.example.dateutils._period _periodbetweenindays = b4a.example.dateutils._periodbetweenindays(ba, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA), _setdateandtime);
                                    int i6 = _periodbetweenindays.Minutes + (_periodbetweenindays.Hours * 60);
                                    if (i6 >= 0 && i6 < 120) {
                                        str = " - In arrivo tra " + anywheresoftware.b4a.BA.NumberToString(i6) + " minuti";
                                        i = 11;
                                    } else if (i6 >= 0 || i6 <= -60) {
                                        str = "";
                                        i = ObjectToNumber;
                                    } else {
                                        str = " - RITARDO DI " + anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Common.Abs(i6)) + " MINUTI";
                                        i = 12;
                                    }
                                    ObjectToNumber = i;
                                } catch (java.lang.Exception e) {
                                    processBA.setLastException(e);
                                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                                    str = "";
                                }
                                map5.Put(java.lang.Integer.valueOf(cursorWrapper7.GetInt("tavolo")), str);
                            }
                        }
                    }
                    int i7 = ObjectToNumber;
                    if (cursorWrapper7.GetInt("ricconto") == 1 && i7 == 5) {
                        i7 = 6;
                    }
                    if (cursorWrapper7.GetInt("stampap") == 1 && (i7 == 5 || i7 == 6)) {
                        i7 = 10;
                    }
                    if (i7 == 5) {
                        double doubleValue = cursorWrapper7.GetDouble("importo").doubleValue();
                        cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (doubleValue > cassandraRisto.ital.main._v_maximptavolo) {
                            i7 = 14;
                        }
                    }
                    if (cursorWrapper7.GetInt("lock") == 1 || cursorWrapper7.GetInt("inmodifica") == 1) {
                        if (cursorWrapper7.GetInt("lock") == 1 && !cursorWrapper7.GetString("rifheadmov").equals("0")) {
                            cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from headmov where fromweb=1 and nmov = " + cursorWrapper7.GetString("rifheadmov"))) > 0.0d) {
                                i7 = 2;
                            }
                        }
                        i7 = 9;
                    }
                    if (i7 == 5) {
                        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_mintavololento > 0 && cursorWrapper7.GetString("timelast") != null) {
                            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv7(processBA, cursorWrapper7.GetString("timelast"))) {
                                i7 = 15;
                            }
                        }
                        if (cursorWrapper7.GetInt("uscita") == 1) {
                            i7 = 8;
                        }
                    }
                    map3.Put(java.lang.Integer.valueOf(cursorWrapper7.GetInt("tavolo")), java.lang.Integer.valueOf(i7));
                    if (i7 != 4 && cursorWrapper7.GetInt("coperti") > 0) {
                        map4.Put(java.lang.Integer.valueOf(cursorWrapper7.GetInt("tavolo")), " (Cop." + cursorWrapper7.GetString("coperti") + ")");
                    } else {
                        map4.Put(java.lang.Integer.valueOf(cursorWrapper7.GetInt("tavolo")), "");
                    }
                    if (java.lang.Double.parseDouble(cursorWrapper7.GetString("rifheadmov")) > 0.0d) {
                        cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_turni && cursorWrapper7.GetInt("addturni") == 1) {
                            map6.Put(java.lang.Integer.valueOf(cursorWrapper7.GetInt("tavolo")), "");
                        }
                    }
                    i4++;
                    i3 = i5;
                }
                cursorWrapper7.Close();
                int i8 = 0;
                stringBuilderWrapper.Initialize();
                if (map.ContainsKey(-1)) {
                    stringBuilderWrapper.Append("SALA,Sala Unica\n");
                    new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper9 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor) map.Get(-1));
                    if (cursorWrapper9.getRowCount() > 0) {
                        int rowCount3 = cursorWrapper9.getRowCount() - 1;
                        for (int i9 = 0; i9 <= rowCount3; i9++) {
                            cursorWrapper9.setPosition(i9);
                            if (i8 != cursorWrapper9.GetInt("valore")) {
                                java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map3.Get(java.lang.Integer.valueOf(cursorWrapper9.GetInt("valore"))));
                                i8 = cursorWrapper9.GetInt("valore");
                                stringBuilderWrapper.Append(anywheresoftware.b4a.BA.NumberToString(cursorWrapper9.GetInt("valore")) + ",");
                                stringBuilderWrapper.Append(ObjectToString + ",");
                                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                java.lang.String _vvvvvvvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(processBA, java.lang.Integer.valueOf(cursorWrapper9.GetInt("valore")));
                                if ((ObjectToString.equals("11") || ObjectToString.equals("12")) && map5.ContainsKey(java.lang.Integer.valueOf(cursorWrapper9.GetInt("valore")))) {
                                    _vvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvv0 + anywheresoftware.b4a.BA.ObjectToString(map5.Get(java.lang.Integer.valueOf(cursorWrapper9.GetInt("valore"))));
                                }
                                if (!_vvvvvvvvvvvvvvvvvv0.toLowerCase().equals("tavolo " + anywheresoftware.b4a.BA.NumberToString(cursorWrapper9.GetInt("valore")))) {
                                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_attivanumtavolo) {
                                        _vvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvv0 + " (" + anywheresoftware.b4a.BA.NumberToString(cursorWrapper9.GetInt("valore")) + ")";
                                    }
                                }
                                if (map6.ContainsKey(java.lang.Integer.valueOf(cursorWrapper9.GetInt("valore")))) {
                                    _vvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvv0 + " *** ";
                                }
                                stringBuilderWrapper.Append((_vvvvvvvvvvvvvvvvvv0 + anywheresoftware.b4a.BA.ObjectToString(map4.Get(java.lang.Integer.valueOf(cursorWrapper9.GetInt("valore"))))) + "\n");
                            }
                        }
                    }
                    cursorWrapper9.Close();
                } else {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 > 20) {
                            break;
                        }
                        if (map.ContainsKey(java.lang.Integer.valueOf(i11))) {
                            stringBuilderWrapper.Append("SALA," + anywheresoftware.b4a.BA.ObjectToString(map2.Get(java.lang.Integer.valueOf(i11))) + "\n");
                            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper10 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor) map.Get(java.lang.Integer.valueOf(i11)));
                            if (cursorWrapper10.getRowCount() > 0) {
                                int rowCount4 = cursorWrapper10.getRowCount() - 1;
                                int i12 = 0;
                                for (int i13 = 0; i13 <= rowCount4; i13++) {
                                    cursorWrapper10.setPosition(i13);
                                    if (i12 != cursorWrapper10.GetInt("valore")) {
                                        java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(map3.Get(java.lang.Integer.valueOf(cursorWrapper10.GetInt("valore"))));
                                        i12 = cursorWrapper10.GetInt("valore");
                                        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.NumberToString(cursorWrapper10.GetInt("valore")) + ",");
                                        stringBuilderWrapper.Append(ObjectToString2 + ",");
                                        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        java.lang.String _vvvvvvvvvvvvvvvvvv02 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(processBA, java.lang.Integer.valueOf(cursorWrapper10.GetInt("valore")));
                                        if ((ObjectToString2.equals("11") || ObjectToString2.equals("12")) && map5.ContainsKey(java.lang.Integer.valueOf(cursorWrapper10.GetInt("valore")))) {
                                            _vvvvvvvvvvvvvvvvvv02 = _vvvvvvvvvvvvvvvvvv02 + anywheresoftware.b4a.BA.ObjectToString(map5.Get(java.lang.Integer.valueOf(cursorWrapper10.GetInt("valore"))));
                                        }
                                        if (!_vvvvvvvvvvvvvvvvvv02.toLowerCase().equals("tavolo " + anywheresoftware.b4a.BA.NumberToString(cursorWrapper10.GetInt("valore")))) {
                                            cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (cassandraRisto.ital.main._v_attivanumtavolo) {
                                                _vvvvvvvvvvvvvvvvvv02 = _vvvvvvvvvvvvvvvvvv02 + " (" + anywheresoftware.b4a.BA.NumberToString(cursorWrapper10.GetInt("valore")) + ")";
                                            }
                                        }
                                        if (map6.ContainsKey(java.lang.Integer.valueOf(cursorWrapper10.GetInt("valore")))) {
                                            _vvvvvvvvvvvvvvvvvv02 = _vvvvvvvvvvvvvvvvvv02 + " *** ";
                                        }
                                        stringBuilderWrapper.Append((_vvvvvvvvvvvvvvvvvv02 + anywheresoftware.b4a.BA.ObjectToString(map4.Get(java.lang.Integer.valueOf(cursorWrapper10.GetInt("valore"))))) + "\n");
                                    }
                                }
                            }
                            cursorWrapper10.Close();
                        }
                        i10 = i11 + 1;
                    }
                }
                cursorWrapper2.Close();
                java.lang.String ObjectToString3 = anywheresoftware.b4a.BA.ObjectToString(stringBuilderWrapper);
                cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String NumberToString = anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.mod1._vvvvvvvvvv3(processBA, ObjectToString3.getBytes("UTF8")));
                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA ba2 = processBA;
                java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(NumberToString);
                cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                return cassandraRisto.ital.modfunstr._left(ba2, append5.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(processBA, 20)).toString(), 20L) + anywheresoftware.b4a.BA.ObjectToString(stringBuilderWrapper);
            } catch (java.lang.Exception e2) {
                processBA.setLastException(e2);
                return "Errore Esportazione dati";
            }
        } catch (java.lang.Exception e3) {
            processBA.setLastException(e3);
            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "Errore Esportazione dati";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str) throws java.lang.Exception {
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from headmov where causale='pr' and nmov=" + str);
            return "OK";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "Errore";
        }
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        try {
            anywheresoftware.b4a.objects.streams.File.TextReaderWrapper textReaderWrapper = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            textReaderWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenInput(str, str2).getObject());
            textReaderWrapper.Close();
            return false;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            return true;
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(int i) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " + anywheresoftware.b4a.BA.NumberToString(i)).equals(anywheresoftware.b4a.BA.NumberToString(1))) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                long parseDouble = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " + anywheresoftware.b4a.BA.NumberToString(i)));
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from venduto where nmov =" + anywheresoftware.b4a.BA.NumberToString(parseDouble) + " order by totcre,codice asc"));
                if (cursorWrapper2.getRowCount() > 0) {
                    stringBuilderWrapper.Initialize();
                    int rowCount = cursorWrapper2.getRowCount() - 1;
                    for (int i2 = 0; i2 <= rowCount; i2++) {
                        cursorWrapper2.setPosition(i2);
                        if (cursorWrapper2.GetString("codice").toLowerCase().startsWith("vv")) {
                            stringBuilderWrapper.Append("       ");
                        } else {
                            stringBuilderWrapper.Append(cursorWrapper2.GetString("qta").replace(",", ".") + " X ");
                        }
                        stringBuilderWrapper.Append(cursorWrapper2.GetString("descrizione")).Append("\n");
                    }
                    stringBuilderWrapper.Append("CHIUDI  -->    ").Append("\n");
                    return anywheresoftware.b4a.BA.ObjectToString(stringBuilderWrapper);
                }
                return "";
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        try {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String str = cassandraRisto.ital.mod1._vvvvv1;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(str, "ElencoPrenotazioni.txt")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(str, "ElencoPrenotazioni.txt");
            }
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(str, "ElencoPrenotazioni.zip")) {
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(str, "ElencoPrenotazioni.zip");
            }
            anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
            randomAccessFile.Initialize2(str, "ElencoPrenotazioni.txt", false, false);
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            map.Initialize();
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select nmov from headmov where causale='pr' limit 500"));
            if (cursorWrapper2.getRowCount() > 0) {
                int rowCount = cursorWrapper2.getRowCount() - 1;
                anywheresoftware.b4a.objects.collections.Map map2 = map;
                int i = 0;
                while (i <= rowCount) {
                    cursorWrapper2.setPosition(i);
                    map2.Initialize();
                    cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.BA ba = processBA;
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Select cliente,clides,totale,memo,datam2,nmov from headmov where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("nmov")) + "", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
                        list.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject());
                    }
                    i++;
                    map2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                randomAccessFile.WriteObject(list.getObject(), true, randomAccessFile.CurrentPosition);
                randomAccessFile.Close();
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(str, "ElencoPrenotazioni.txt")) {
                    java.util.Arrays.fill(new java.lang.String[0], "");
                    new flm.b4a.archiver.ArchiverForB4A().ZipFiles(processBA, str, new java.lang.String[]{"ElencoPrenotazioni.txt"}, str, "ElencoPrenotazioni.zip", "");
                    servletResponseWrapper.SendFile(str, "ElencoPrenotazioni.zip");
                    return "";
                }
                servletResponseWrapper.SendString("Err");
                return "";
            }
            servletResponseWrapper.SendString("Nessuna prenotazione dal server");
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(int i) throws java.lang.Exception {
        java.lang.String str;
        try {
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from tavoli where rifheadmov > 0 and tavolo = " + anywheresoftware.b4a.BA.NumberToString(i)));
            if (cursorWrapper2.getRowCount() > 0) {
                cursorWrapper2.setPosition(0);
                java.lang.String str2 = "Ordinato € " + anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper2.GetDouble("importo").doubleValue(), 1, 2, 2, false) + ";";
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int parseDouble = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " + cursorWrapper2.GetString("rifheadmov")));
                if (parseDouble > 0) {
                    str2 = str2 + "Coperti " + anywheresoftware.b4a.BA.NumberToString(parseDouble) + ";";
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (!cassandraRisto.ital.main._v_desatesta.equals("")) {
                        java.lang.StringBuilder append = new java.lang.StringBuilder().append(str2);
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        str2 = append.append(cassandraRisto.ital.main._v_desatesta).append(" € ").append(anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.keywords.Common.Round2(cursorWrapper2.GetDouble("importo").doubleValue() / parseDouble, 2), 1, 2, 2, false)).append(";").toString();
                    }
                }
                if (cursorWrapper2.GetString("timein") != null) {
                    b4a.example.dateutils dateutilsVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                    long _setdateandtime = b4a.example.dateutils._setdateandtime(processBA, (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timein").substring(0, 4)), (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timein").substring(5, 7)), (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timein").substring(8, 10)), (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timein").substring(11, 13)), (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timein").substring(14, 16)), 0);
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(str2).append("Ingresso:");
                    anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                    str2 = append2.append(anywheresoftware.b4a.keywords.DateTime.Time(_setdateandtime).substring(0, 5)).append(";").toString();
                }
                if (cursorWrapper2.GetString("timelast") != null) {
                    b4a.example.dateutils dateutilsVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                    long _setdateandtime2 = b4a.example.dateutils._setdateandtime(processBA, (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timelast").substring(0, 4)), (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timelast").substring(5, 7)), (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timelast").substring(8, 10)), (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timelast").substring(11, 13)), (int) java.lang.Double.parseDouble(cursorWrapper2.GetString("timelast").substring(14, 16)), 0);
                    java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(str2).append("Ultimo Ordine:");
                    anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                    str = append3.append(anywheresoftware.b4a.keywords.DateTime.Time(_setdateandtime2).substring(0, 5)).append(";").toString();
                } else {
                    str = str2;
                }
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_turni) {
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from venduto where turno <0 and nmov = " + cursorWrapper2.GetString("rifheadmov"))) > 0.0d) {
                        cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        int parseDouble2 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select turno from venduto where turno <0 and nmov = " + cursorWrapper2.GetString("rifheadmov") + " order by turno asc limit 1"));
                        if (parseDouble2 < 0) {
                            str = str + "Turno Attivo:" + anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Common.Abs(parseDouble2)) + "\n";
                        }
                    }
                }
                cursorWrapper2.Close();
                return str;
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x011c, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010b, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where codice <> '" + r13 + "' and telefono ='" + r9 + "'")) > 0.0d) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0158, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where mail ='" + r11 + "'")) <= 0.0d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0199, code lost:
    
        cassandraRisto.ital.starter._v7.setEnabled(true);
        r19.SendString("ErrMail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0197, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where codice <> '" + r13 + "' and mail ='" + r11 + "'")) > 0.0d) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00cc, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where telefono ='" + r9 + "'")) <= 0.0d) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x010d, code lost:
    
        cassandraRisto.ital.starter._v7.setEnabled(true);
        r19.SendString("Telefono gia inserito su un altro cliente");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        try {
            java.lang.String str = "";
            java.lang.String GetParameter = servletRequestWrapper.GetParameter("descrizione");
            java.lang.String GetParameter2 = servletRequestWrapper.GetParameter("via");
            java.lang.String GetParameter3 = servletRequestWrapper.GetParameter("PwdWeb");
            java.lang.String GetParameter4 = servletRequestWrapper.GetParameter("citta");
            java.lang.String GetParameter5 = servletRequestWrapper.GetParameter("telefono");
            java.lang.String GetParameter6 = servletRequestWrapper.GetParameter("fax");
            java.lang.String GetParameter7 = servletRequestWrapper.GetParameter("mail");
            int parseDouble = (int) java.lang.Double.parseDouble(servletRequestWrapper.GetParameter("attivo"));
            int parseDouble2 = (int) java.lang.Double.parseDouble(servletRequestWrapper.GetParameter("Guest2"));
            java.lang.String replace = servletRequestWrapper.GetParameter("CodCliente").replace(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(13))), "").replace(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(10))), "");
            if (parseDouble2 == 0) {
                if (replace.equals("")) {
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                if (!replace.equals("")) {
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                if (!GetParameter7.equals("")) {
                    if (replace.equals("")) {
                        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    }
                    if (!replace.equals("")) {
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    }
                }
            }
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            long parseDouble3 = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select valore from progressivi where codice ='C'"));
            while (str.equals("")) {
                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" + anywheresoftware.b4a.BA.NumberToString(parseDouble3) + "'")) == 0.0d) {
                    str = anywheresoftware.b4a.BA.NumberToString(parseDouble3);
                    parseDouble3++;
                    cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update progressivi set valore =" + anywheresoftware.b4a.BA.NumberToString(parseDouble3) + " where codice ='C'");
                } else {
                    parseDouble3++;
                }
            }
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            map.Initialize();
            map.Put("codice", str);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            map.Put("descrizione", cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, GetParameter));
            map.Put("citta", GetParameter4);
            map.Put("telefono", GetParameter5);
            map.Put("PwdWeb", GetParameter3);
            map.Put("mail", GetParameter7);
            map.Put("via", GetParameter2);
            map.Put("fax", GetParameter6);
            map.Put("attivo", java.lang.Integer.valueOf(parseDouble));
            list.Add(map.getObject());
            if (!replace.equals("")) {
                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clienti set descrizione='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", map.GetDefault("descrizione", "")) + "',   via='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", map.GetDefault("via", "")) + "', citta='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", map.GetDefault("citta", "")) + "', PwdWeb='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", map.GetDefault("PwdWeb", "")) + "', fax='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", map.GetDefault("fax", "")) + "', telefono='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", map.GetDefault("telefono", "")) + "', mail='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", map.GetDefault("mail", "")) + "' where codice = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", replace) + "'");
            } else {
                cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA ba2 = processBA;
                cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "clienti", list);
            }
            _v7.setEnabled(true);
            servletResponseWrapper.SendString("OK" + str);
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            servletResponseWrapper.SendString("Err");
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        try {
            java.lang.String str = "";
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select codice,pwd,funzioni from operatori order by codice"));
            if (cursorWrapper2.getRowCount() != 0) {
                int rowCount = cursorWrapper2.getRowCount() - 1;
                java.lang.String str2 = "";
                for (int i = 0; i <= rowCount; i++) {
                    cursorWrapper2.setPosition(i);
                    new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select * from OpCM where codice=" + cursorWrapper2.GetString("codice")));
                    if (cursorWrapper4.getRowCount() > 0) {
                        cursorWrapper4.setPosition(0);
                        str2 = str2 + cursorWrapper2.GetString("codice") + "@_@_@SeparatoreDati@_@_@" + cursorWrapper2.GetString("pwd") + "@_@_@SeparatoreDati@_@_@" + (cursorWrapper4.GetString("gPrelievo") + cursorWrapper4.GetString("gTrasferimento") + cursorWrapper4.GetString("gInventario") + cursorWrapper4.GetString("gStato") + cursorWrapper4.GetString("gDepositoManuale") + cursorWrapper4.GetString("gSbloccaBanconote") + cursorWrapper4.GetString("gScambio") + cursorWrapper4.GetString("gSettings2")) + "@_@_@SeparatoreOperatori@_@_@";
                    }
                    cursorWrapper4.Close();
                }
                str = str2;
            }
            cursorWrapper2.Close();
            servletResponseWrapper.SendString(str);
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            servletResponseWrapper.SendString("Errore");
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        try {
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "BKAnagra.zip")) {
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                servletResponseWrapper.SendFile(cassandraRisto.ital.mod1._vvvvv1, "BKAnagra.zip");
            } else {
                servletResponseWrapper.SendString("Errore:File BKAnagra.zip non trovato");
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            servletResponseWrapper.SendString("Errore");
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper, java.lang.String str) throws java.lang.Exception {
        int i = 0;
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select count(*) from headmov  where " + str).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                servletResponseWrapper.SendString("Nessun documento sospeso");
                return "";
            }
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String str2 = cassandraRisto.ital.mod1._vvvvv1;
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(str2, "DBV.txt")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(str2, "DBV.txt");
            }
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(str2, "DBV.zip")) {
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(str2, "DBV.zip");
            }
            anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
            randomAccessFile.Initialize2(str2, "DBV.txt", false, false);
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            map.Initialize();
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select nmov from headmov  where " + str + "  limit 500"));
            if (cursorWrapper2.getRowCount() > 0) {
                int rowCount = cursorWrapper2.getRowCount() - 1;
                anywheresoftware.b4a.objects.collections.Map map2 = map;
                while (i <= rowCount) {
                    cursorWrapper2.setPosition(i);
                    map2.Initialize();
                    cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.BA ba = processBA;
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select * from headmov where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("nmov")) + "", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
                        list.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject());
                    }
                    i++;
                    map2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                randomAccessFile.WriteObject(list.getObject(), true, randomAccessFile.CurrentPosition);
                randomAccessFile.Close();
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(str2, "DBV.txt")) {
                    java.util.Arrays.fill(new java.lang.String[0], "");
                    new flm.b4a.archiver.ArchiverForB4A().ZipFiles(processBA, str2, new java.lang.String[]{"DBV.txt"}, str2, "DBV.zip", "");
                    servletResponseWrapper.SendFile(str2, "DBV.zip");
                } else {
                    servletResponseWrapper.SendString("Err");
                }
            } else {
                servletResponseWrapper.SendString("Nessuna prenotazione per le date indicate");
            }
            cursorWrapper2.Close();
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            servletResponseWrapper.SendString("Err");
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x033d, code lost:
    
        if (r1 == cassandraRisto.ital.main._cm_cashmatic) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _handleglory(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String str3;
        if (!str.equals("Errore Glory")) {
            str3 = str2;
            str2 = "";
        } else {
            str3 = "";
        }
        if (str.equals("0") || str.equals("9001") || str.startsWith("10") || str.startsWith("9_")) {
            double d = 0.0d;
            if (str.startsWith("10") || str.startsWith("9_")) {
                java.util.Arrays.fill(new java.lang.String[0], "");
                anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                java.lang.String[] Split = anywheresoftware.b4a.keywords.Regex.Split("_", str);
                if (Split.length == 2) {
                    d = java.lang.Double.parseDouble(Split[1]) / 100.0d;
                }
                str = Split[0];
            }
            if (str.equals("9001")) {
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.httpclient.getObject(), "GetDataCashlogy");
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvv2 = false;
                return "";
            }
            anywheresoftware.b4a.BA ba2 = processBA;
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba2, cassandraRisto.ital.mod1._vvv7, "Anim_AnimationEnd");
            if (anywheresoftware.b4a.keywords.Common.Not(str.startsWith("9"))) {
                anywheresoftware.b4a.BA ba3 = processBA;
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.CallSubNew(ba3, cassandraRisto.ital.main.getObject(), "CallStampa");
            } else {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = -1;
            }
            if (!str.equals("0")) {
                anywheresoftware.b4a.BA ba4 = processBA;
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba4, cassandraRisto.ital.mod1._vvv7, "MsgboxOnlyA", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str), true);
            }
            if (d > 0.0d) {
                anywheresoftware.b4a.BA ba5 = processBA;
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba5, cassandraRisto.ital.main.getObject(), "StampaBuonoGlory", java.lang.Double.valueOf(d));
            }
        } else if (str.startsWith("9100")) {
            java.lang.String substring = str.substring(4);
            anywheresoftware.b4a.BA ba6 = processBA;
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba6, cassandraRisto.ital.main.getObject(), "StampaTallonCM", substring);
        } else if (str.equals("2")) {
            anywheresoftware.b4a.BA ba7 = processBA;
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba7, cassandraRisto.ital.mod1._vvv7, "Anim_AnimationEnd");
            anywheresoftware.b4a.BA ba8 = processBA;
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba8, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str));
            anywheresoftware.b4a.BA ba9 = processBA;
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba9, cassandraRisto.ital.main.getObject(), "CallStampa");
        } else if (str.equals("8888")) {
            anywheresoftware.b4a.BA ba10 = processBA;
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba10, cassandraRisto.ital.mod1._vvv7, "Anim_AnimationEnd");
            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = -1;
            anywheresoftware.b4a.BA ba11 = processBA;
            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba11, cassandraRisto.ital.mod1._vvv7, "MsgboxOnlyA", "Timeout nella procedura di annullo", true);
        } else if (str.equals("Timeout Glory")) {
            anywheresoftware.b4a.BA ba12 = processBA;
            cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba12, cassandraRisto.ital.mod1._vvv7, "Anim_AnimationEnd");
            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = -1;
            anywheresoftware.b4a.BA ba13 = processBA;
            cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba13, cassandraRisto.ital.mod1._vvv7, "MsgboxOnlyA", "Timeout nella procedura di pagamento.\n\nPagamento annullato.", true);
        } else if (!str.equals("Livelli Bassi")) {
            if (str.equals("riepilogoGlory")) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str3);
                str3 = "";
            } else if (str.equals("Livelli Glory")) {
                anywheresoftware.b4a.BA ba14 = processBA;
                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba14, cassandraRisto.ital.main.getObject(), "VisualizzaInventarioGlory", str3, true);
                str3 = "";
            } else if (str.equals("Inventario Glory")) {
                anywheresoftware.b4a.BA ba15 = processBA;
                cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba15, cassandraRisto.ital.main.getObject(), "VisualizzaInventarioGlory", str3, false);
                str3 = "";
            } else if (str.equals("Errore di comunicazione")) {
                anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Errore di comunicazione con il Cash Management"), true);
            } else if (str.equals("Errore Glory")) {
                cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)) {
                    cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = true;
                    java.lang.String replace = str2.replace("@_@_@SEPARATORE@_@_@", "\n");
                    if (replace.contains("@_@_@SEPARATOREURL@_@_@")) {
                        anywheresoftware.b4a.BA ba16 = processBA;
                        cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba16, cassandraRisto.ital.mod1._vvv7, "msgboxActCM", 0, "Cash Management Errore\n" + replace);
                    } else {
                        anywheresoftware.b4a.BA ba17 = processBA;
                        cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba17, cassandraRisto.ital.mod1._vvv7, "msgboxActCM", 1, "Cash Management Errore\n" + replace);
                    }
                }
            } else {
                cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = -1;
                anywheresoftware.b4a.BA ba18 = processBA;
                cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba18, cassandraRisto.ital.main.getObject(), "DisattivaAttesaCashManagement", false);
                anywheresoftware.b4a.BA ba19 = processBA;
                cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba19, cassandraRisto.ital.mod1._vvv7, "MsgboxOnlyA", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str), true);
            }
        }
        if (!str3.equals("") && !str3.equals("null")) {
            anywheresoftware.b4a.keywords.Regex regex2 = anywheresoftware.b4a.keywords.Common.Regex;
            java.lang.String[] Split2 = anywheresoftware.b4a.keywords.Regex.Split(",", str3);
            int length = Split2.length - 1;
            int i = 0;
            java.lang.String str4 = "\n";
            while (i <= length) {
                java.lang.String str5 = str4 + anywheresoftware.b4a.keywords.Common.NumberFormat2(java.lang.Double.parseDouble(Split2[i]) / 100.0d, 1, 2, 2, false) + " €\n";
                i++;
                str4 = str5;
            }
            cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int i2 = cassandraRisto.ital.main._v_glory;
                cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (i2 != cassandraRisto.ital.main._cm_gloryvd) {
                    cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    int i3 = cassandraRisto.ital.main._v_glory;
                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                anywheresoftware.b4a.BA ba20 = processBA;
                cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba20, cassandraRisto.ital.mod1._vvv7, "MsgboxOnlyA", "Cash Management\nRisultano bassi i livelli dei seguenti tagli:" + str4, true);
            }
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        try {
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "sendimg.zip")) {
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                servletResponseWrapper.SendFile(cassandraRisto.ital.mod1._vvvvv1, "sendimg.zip");
            } else {
                servletResponseWrapper.SendString("Errore:File SendImg.zip non trovato");
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            servletResponseWrapper.SendString("Errore");
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(int i, java.lang.String str, int i2) throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5)) {
            return "Errore Licenza";
        }
        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(str, i, i2);
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("") ? "" : _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5)) {
            return "";
        }
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where PwdWeb <>'guest' and abprep=1 and codice = " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "")) > 0.0d) {
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            double parseDouble = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select prep from clienti where PwdWeb <>'guest' and abprep=1 and codice = " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + ""));
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from headmov where sospeso=1 and cliente=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "")) > 0.0d) {
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select totale,nmov from headmov where sospeso=1 and cliente=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + ""));
                if (cursorWrapper2.getRowCount() > 0) {
                    int rowCount = cursorWrapper2.getRowCount() - 1;
                    for (int i = 0; i <= rowCount; i++) {
                        cursorWrapper2.setPosition(i);
                        cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from TestiPagamentiWeb where Tipo=0 and nmov=" + cursorWrapper2.GetString("nmov")).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                            parseDouble = anywheresoftware.b4a.keywords.Common.Round2(parseDouble - cursorWrapper2.GetDouble("totale").doubleValue(), 2);
                        }
                    }
                }
                cursorWrapper2.Close();
            }
            return anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(parseDouble, 2));
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper, java.lang.String str) throws java.lang.Exception {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/FWPalmari").toString();
            new anywheresoftware.b4a.objects.collections.List().Initialize();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(sb2);
            ListFiles.Sort(true);
            java.lang.String str2 = "";
            if (ListFiles.getSize() > 0) {
                int size = ListFiles.getSize() - 1;
                for (int i = 0; i <= size; i++) {
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
                    if (ObjectToString.toUpperCase().endsWith(".ZIP") && ObjectToString.toUpperCase().startsWith("UPGRADE")) {
                        str2 = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
                    }
                }
            }
            if (!str2.equals("")) {
                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(processBA, str2.toUpperCase().replace(".ZIP", ""), 4L)))) {
                    servletResponseWrapper.SendString("Il nome file per l'aggiornamento non è valido");
                    return "";
                }
                cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                if (java.lang.Double.parseDouble(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(processBA, str2.toUpperCase().replace(".ZIP", ""), 4L)) < java.lang.Double.parseDouble(str)) {
                    servletResponseWrapper.SendString("non sono consentiti i downgrade");
                    return "";
                }
                servletResponseWrapper.SendFile(sb2, str2);
            } else {
                servletResponseWrapper.SendString("File aggiornamento non trovato");
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            servletResponseWrapper.SendString("Errore nella verifica file di upgrade");
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        boolean z;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(str2).append("/TMP").toString();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Recall.txt")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Recall.txt");
            }
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Recall.zip")) {
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Recall.zip");
            }
            anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
            randomAccessFile.Initialize2(sb2, "Recall.txt", false, false);
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
            list2.Initialize();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            map.Initialize();
            if (anywheresoftware.b4a.keywords.Common.IsNumber(str)) {
                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, str) > 0.0d) {
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from headmov where Locked=1 and nmov = " + str)) > 0.0d) {
                        servletResponseWrapper.SendString("Il movimento richiesto risulta essere bloccato");
                        return "";
                    }
                    map.Initialize();
                    cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.BA ba = processBA;
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select * from headmov where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
                        list.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject());
                        randomAccessFile.WriteObject(list.getObject(), true, randomAccessFile.CurrentPosition);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select chiave from venduto where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + " order by chiave"));
                        if (cursorWrapper2.getRowCount() > 0) {
                            int rowCount = cursorWrapper2.getRowCount() - 1;
                            anywheresoftware.b4a.objects.collections.Map map2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int i = 0;
                            while (i <= rowCount) {
                                cursorWrapper2.setPosition(i);
                                map2.Initialize();
                                cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                anywheresoftware.b4a.BA ba2 = processBA;
                                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select * from venduto where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + " and chiave =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("chiave")) + " ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52.IsInitialized()) {
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52.Remove("chiave");
                                    list2.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52.getObject());
                                }
                                i++;
                                map2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52;
                            }
                            randomAccessFile.WriteObject(list2.getObject(), true, randomAccessFile.CurrentPosition);
                        }
                        cursorWrapper2.Close();
                    }
                }
            }
            randomAccessFile.Close();
            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Recall.txt")) {
                java.util.Arrays.fill(new java.lang.String[0], "");
                new flm.b4a.archiver.ArchiverForB4A().ZipFiles(processBA, sb2, new java.lang.String[]{"Recall.txt"}, sb2, "Recall.zip", "");
                servletResponseWrapper.SendFile(sb2, "Recall.zip");
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update headmov set Locked = 1 where nmov=" + str);
            } else {
                servletResponseWrapper.SendString("Err");
            }
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            servletResponseWrapper.SendString("Err");
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper, java.lang.String str) throws java.lang.Exception {
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from headmov  where sospeso =1 and tavolo = 0 ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                servletResponseWrapper.SendString("Nessun documento sospeso");
                return "";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(str).append("/TMP").toString();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Sospesi.txt")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Sospesi.txt");
            }
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Sospesi.zip")) {
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Sospesi.zip");
            }
            anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
            randomAccessFile.Initialize2(sb2, "Sospesi.txt", false, false);
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            list2.Initialize();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            map.Initialize();
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select nmov from headmov  where sospeso =1 and tavolo = 0  limit 500"));
            if (cursorWrapper2.getRowCount() > 0) {
                int rowCount = cursorWrapper2.getRowCount() - 1;
                int i = 0;
                anywheresoftware.b4a.objects.collections.Map map2 = map;
                while (i <= rowCount) {
                    cursorWrapper2.setPosition(i);
                    map2.Initialize();
                    cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.BA ba = processBA;
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select * from headmov where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("nmov")) + "", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                    if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
                        list.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject());
                        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select chiave from venduto where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("nmov")) + " order by chiave"));
                        if (cursorWrapper4.getRowCount() > 0) {
                            int rowCount2 = cursorWrapper4.getRowCount() - 1;
                            for (int i2 = 0; i2 <= rowCount2; i2++) {
                                cursorWrapper4.setPosition(i2);
                                new anywheresoftware.b4a.objects.collections.Map().Initialize();
                                cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                anywheresoftware.b4a.BA ba2 = processBA;
                                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select nmov,totcre,codint,descrizione,importo,codice,qta from venduto where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("nmov")) + " and chiave =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper4.GetString("chiave")) + " ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52.IsInitialized()) {
                                    list2.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52.getObject());
                                }
                            }
                        }
                    }
                    i++;
                    map2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                randomAccessFile.WriteObject(list.getObject(), true, randomAccessFile.CurrentPosition);
                randomAccessFile.WriteObject(list2.getObject(), true, randomAccessFile.CurrentPosition);
                randomAccessFile.Close();
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Sospesi.txt")) {
                    java.util.Arrays.fill(new java.lang.String[0], "");
                    new flm.b4a.archiver.ArchiverForB4A().ZipFiles(processBA, sb2, new java.lang.String[]{"Sospesi.txt"}, sb2, "Sospesi.zip", "");
                    servletResponseWrapper.SendFile(sb2, "Sospesi.zip");
                } else {
                    servletResponseWrapper.SendString("Err");
                }
            } else {
                servletResponseWrapper.SendString("Err");
            }
            cursorWrapper2.Close();
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            servletResponseWrapper.SendString("Err");
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        java.lang.String str;
        java.lang.String GetParameter;
        java.lang.String sb;
        try {
            java.lang.String GetUploadedFile = servletRequestWrapper.GetUploadedFile("upfile");
            str = "Scontrino" + servletRequestWrapper.GetParameter("nmov") + ".job";
            GetParameter = servletRequestWrapper.GetParameter("upfile");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            sb = sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb, "Scontrino.zip")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, "Scontrino.zip");
            }
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb, "Scontrino.job")) {
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, "Scontrino.job");
            }
            for (int i = 0; i <= 30; i++) {
                try {
                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(_server.TempFolder, GetUploadedFile, sb, GetParameter);
                    break;
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(processBA, 300);
                }
            }
            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
        } catch (java.lang.Exception e2) {
            processBA.setLastException(e2);
            servletResponseWrapper.SendString("Errore ");
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        if (anywheresoftware.b4a.objects.streams.File.Size(sb, GetParameter) > 0) {
            try {
                new flm.b4a.archiver.ArchiverForB4A().UnZip(processBA, sb, GetParameter, sb, "");
                anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, GetParameter);
                anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                if (!anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(sb, "Scontrino.job"))) {
                    anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
                    if (anywheresoftware.b4a.objects.streams.File.Size(sb, "Scontrino.job") != 0) {
                        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
                                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                    anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
                                    randomAccessFile.Initialize(sb, "Scontrino.job", false);
                                    int size = (int) randomAccessFile.getSize();
                                    randomAccessFile.Close();
                                    if (size == 0) {
                                        servletResponseWrapper.SendString("Errore nella struttura dello scontrino inviato");
                                        return "";
                                    }
                                    anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.objects.streams.File.Copy(sb, "Scontrino.job", sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/SCONTRINI").toString(), str);
                                    servletResponseWrapper.SendString("OK");
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(true);
                                    return "";
                                }
                            }
                        }
                        servletResponseWrapper.SendString("Il client non è in grado di stampare scontrini in questo momento");
                        return "";
                    }
                }
                servletResponseWrapper.SendString("Errore durante l'invio del file");
                return "";
            } catch (java.lang.Exception e3) {
                processBA.setLastException(e3);
                anywheresoftware.b4a.objects.streams.File file12 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, GetParameter);
                servletResponseWrapper.SendString("Errore durante l'invio del file");
                return "";
            }
        }
        servletResponseWrapper.SendString("Errore durante l'invio del file");
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0401, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x040b, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r2 = new java.lang.StringBuilder().append(" and tipo =");
        r5 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(r18).append(" ").toString();
        r2 = cassandraRisto.ital.starter.processBA;
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r2, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x045b, code lost:
    
        r17.SendFile(r4, "Tavolo.zip");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0409, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        boolean z;
        boolean z2;
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e) {
            e = e;
            z = false;
        }
        if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + str).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("select count(*) from pagine where pagina >=10 and pagina <100 and tipo = ");
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!sql.ExecQuerySingleResult(append.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and  valore = ").append(str).toString()).equals(anywheresoftware.b4a.BA.NumberToString(0)) || java.lang.Double.parseDouble(str) >= 20000.0d) {
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where lock=0 and inmodifica=0 and tavolo = " + str).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                    servletResponseWrapper.SendString("TAVOLO BLOCCATO");
                    return "";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.String sb2 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(str2).append("/TMP").toString();
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Tavolo.txt")) {
                    anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Tavolo.txt");
                }
                anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Tavolo.zip")) {
                    anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, "Tavolo.zip");
                }
                anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
                randomAccessFile.Initialize2(sb2, "Tavolo.txt", false, false);
                anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                list.Initialize();
                anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
                list2.Initialize();
                anywheresoftware.b4a.objects.collections.List list3 = new anywheresoftware.b4a.objects.collections.List();
                list3.Initialize();
                new anywheresoftware.b4a.objects.collections.Map().Initialize();
                cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select * from tavoli where tavolo = " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()) {
                    list.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject());
                    randomAccessFile.WriteObject(list.getObject(), true, randomAccessFile.CurrentPosition);
                    cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "");
                    if (anywheresoftware.b4a.keywords.Common.IsNumber(ExecQuerySingleResult)) {
                        cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, ExecQuerySingleResult) > 0.0d) {
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize();
                            cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            anywheresoftware.b4a.BA ba2 = processBA;
                            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select * from headmov where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ExecQuerySingleResult) + "", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                            if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52.IsInitialized()) {
                                z2 = false;
                            } else {
                                list2.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52.getObject());
                                randomAccessFile.WriteObject(list2.getObject(), true, randomAccessFile.CurrentPosition);
                                z2 = true;
                            }
                            if (z2) {
                                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select chiave from venduto where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ExecQuerySingleResult) + " order by chiave"));
                                if (cursorWrapper2.getRowCount() > 0) {
                                    int rowCount = cursorWrapper2.getRowCount() - 1;
                                    anywheresoftware.b4a.objects.collections.Map map = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv52;
                                    int i = 0;
                                    while (i <= rowCount) {
                                        cursorWrapper2.setPosition(i);
                                        map.Initialize();
                                        cassandraRisto.ital.dbutil dbutilVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        anywheresoftware.b4a.BA ba3 = processBA;
                                        cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv53 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(ba3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select * from venduto where nmov =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ExecQuerySingleResult) + " and chiave =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("chiave")) + " ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv53.IsInitialized()) {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv53.Remove("chiave");
                                            list3.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv53.getObject());
                                        }
                                        i++;
                                        map = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv53;
                                    }
                                    randomAccessFile.WriteObject(list3.getObject(), true, randomAccessFile.CurrentPosition);
                                }
                                cursorWrapper2.Close();
                            }
                        }
                    }
                    randomAccessFile.Close();
                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                    if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "Tavolo.txt")) {
                        java.util.Arrays.fill(new java.lang.String[0], "");
                        new flm.b4a.archiver.ArchiverForB4A().ZipFiles(processBA, sb2, new java.lang.String[]{"Tavolo.txt"}, sb2, "Tavolo.zip", "");
                        cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.BeginTransaction();
                        z = true;
                        try {
                            cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " + str).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("update tavoli set timein = '");
                                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.BA ba4 = processBA;
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                java.lang.StringBuilder append3 = sb3.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
                                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                sql2.ExecNonQuery(append2.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba4, append3.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString())).append("' where tavolo =").append(str).toString());
                                cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set inmodifica =1,timelast=timein where tavolo =" + str);
                            } else {
                                cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("update tavoli set inmodifica =1,timelast ='");
                                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.BA ba5 = processBA;
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                                cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                java.lang.StringBuilder append5 = sb4.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
                                anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                                cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                sql3.ExecNonQuery(append4.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba5, append5.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString())).append("' where tavolo =").append(str).toString());
                            }
                            cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.TransactionSuccessful();
                            cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.EndTransaction();
                            z = false;
                            int[] iArr = {(int) java.lang.Double.parseDouble(str)};
                            anywheresoftware.b4a.BA ba6 = processBA;
                            cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba6, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", iArr, str2);
                            cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                                cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            }
                            cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            processBA.setLastException(e);
                            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                            if (z) {
                                cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.EndTransaction();
                            }
                            servletResponseWrapper.SendString("Err");
                            return "";
                        }
                    } else {
                        servletResponseWrapper.SendString("Err");
                    }
                    return "";
                }
                servletResponseWrapper.SendString("Err");
                randomAccessFile.Close();
                return "";
            }
        }
        servletResponseWrapper.SendString("TAVOLO NON TROVATO");
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        java.lang.String GetParameter;
        java.lang.String sb;
        try {
            java.lang.String GetUploadedFile = servletRequestWrapper.GetUploadedFile("upfile");
            GetParameter = servletRequestWrapper.GetParameter("upfile");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            sb = sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb, "Anagra.zip")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, "Anagra.zip");
            }
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb, "Anagra.db")) {
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, "Anagra.db");
            }
            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(sb, "Config.txt")) {
                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, "Config.txt");
            }
            for (int i = 0; i <= 30; i++) {
                try {
                    anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(_server.TempFolder, GetUploadedFile, sb, GetParameter);
                    break;
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(processBA, 300);
                }
            }
            anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
            anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
        } catch (java.lang.Exception e2) {
            processBA.setLastException(e2);
            servletResponseWrapper.SendString("Errore ");
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        if (anywheresoftware.b4a.objects.streams.File.Size(sb, GetParameter) > 0) {
            try {
                new flm.b4a.archiver.ArchiverForB4A().UnZip(processBA, sb, GetParameter, sb, "");
                anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, GetParameter);
                anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
                if (!anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(sb, "Anagra.db"))) {
                    anywheresoftware.b4a.objects.streams.File file12 = anywheresoftware.b4a.keywords.Common.File;
                    if (anywheresoftware.b4a.objects.streams.File.Size(sb, "Anagra.db") != 0) {
                        anywheresoftware.b4a.BA ba = processBA;
                        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.main.getObject(), "ApplyVar", true);
                        servletResponseWrapper.SendString("OK");
                        return "";
                    }
                }
                servletResponseWrapper.SendString("Errore durante l'invio del file");
                return "";
            } catch (java.lang.Exception e3) {
                processBA.setLastException(e3);
                anywheresoftware.b4a.objects.streams.File file13 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb, GetParameter);
                servletResponseWrapper.SendString("Errore durante l'invio del file");
                return "";
            }
        }
        servletResponseWrapper.SendString("Errore durante l'invio del file");
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b1, code lost:
    
        if (cassandraRisto.ital.main._v_websospenditavolo == 2) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        try {
            java.lang.String GetUploadedFile = servletRequestWrapper.GetUploadedFile("upfile");
            java.lang.String GetParameter = servletRequestWrapper.GetParameter("matricola");
            int i = 0;
            long j = 0;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(GetParameter).toString();
            if (GetParameter.startsWith("Cli")) {
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.MakeDir(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, "VENDUTO");
            }
            for (int i2 = 0; i2 <= 30; i2++) {
                try {
                    anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(_server.TempFolder, GetUploadedFile, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 + "/VENDUTO", servletRequestWrapper.GetParameter("upfile"));
                    break;
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(processBA, 300);
                }
            }
            if (GetParameter.startsWith("Cli")) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5)) {
                    anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
                    _v7.setEnabled(true);
                    servletResponseWrapper.SendString("Non si dispone della licenza necessaria");
                    return "";
                }
                java.lang.String GetParameter2 = servletRequestWrapper.GetParameter("pwd");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (!cassandraRisto.ital.main._v_sbpwd.equals(GetParameter2)) {
                    anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
                    _v7.setEnabled(true);
                    servletResponseWrapper.SendString("La password per le comunicazioni non è corretta");
                    return "";
                }
                java.lang.String GetParameter3 = servletRequestWrapper.GetParameter("versione");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (!GetParameter3.equals(cassandraRisto.ital.main._v_mver) && !GetParameter3.equals("9.99")) {
                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
                    _v7.setEnabled(true);
                    servletResponseWrapper.SendString("Le versioni non sono allineate");
                    return "";
                }
                if (!servletRequestWrapper.GetParameter("tavolo").equals("10000")) {
                    i = 1;
                }
                if (i == 1) {
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_websospenditavolo == 3) {
                        i = 2;
                    } else {
                        cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_websospenditavolo != 1) {
                            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        }
                        cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        int parseDouble = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select pagina from pagine where pagina >=10  AND pagina <100 AND valore = " + servletRequestWrapper.GetParameter("tavolo") + " AND tipo = 9 limit 1"));
                        cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_websospenditavolo == 2) {
                            cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_gestionespiagge) {
                                cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from Despagine where chiedimemo2=2 and codice = " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(parseDouble)) + " ")) > 0.0d) {
                                    i = 2;
                                }
                            }
                        } else {
                            cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from Despagine where chiedimemo2<>2 and codice = " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(parseDouble)) + " ")) > 0.0d) {
                                i = 2;
                            }
                        }
                    }
                }
                j = (long) java.lang.Double.parseDouble(servletRequestWrapper.GetParameter("dataP"));
                if (j > 0) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = GetParameter.substring(3);
                }
                java.lang.String GetParameter4 = servletRequestWrapper.GetParameter("datiPag");
                if (((int) java.lang.Double.parseDouble(servletRequestWrapper.GetParameter("disponibilita"))) == 1) {
                    anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
                    _v7.setEnabled(true);
                    servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 + "/VENDUTO", servletRequestWrapper.GetParameter("matricola")));
                    return "";
                }
                if (!GetParameter4.equals("")) {
                    cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(GetParameter4, (long) (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'")) + 1.0d));
                }
                java.lang.String GetParameter5 = servletRequestWrapper.GetParameter("Via");
                java.lang.String GetParameter6 = servletRequestWrapper.GetParameter("Citta");
                if (!GetParameter5.equals("")) {
                    java.lang.String replace = GetParameter.replace("Cli", "");
                    cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("insert into TestiPagamentiWeb(cliente ,nmov ,testo,Tipo) values('").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", replace)).append("',");
                    cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    sql.ExecNonQuery(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Double.valueOf(java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'")) + 1.0d))).append(",'").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", (GetParameter5 + "\n" + GetParameter6).replace("'", "`").replace("%", "").replace(",", ""))).append("',1)").toString());
                }
                java.lang.String GetParameter7 = servletRequestWrapper.GetParameter("Lastnmov");
                if (!GetParameter7.equals("") && java.lang.Double.parseDouble(GetParameter7) > 0.0d) {
                    cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from headmov where nmov=" + GetParameter7);
                    cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from venduto where nmov=" + GetParameter7);
                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from CausaliPagamenti where nmov=" + GetParameter7);
                }
                if (i > 0) {
                    java.lang.String GetParameter8 = servletRequestWrapper.GetParameter("tavolo");
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    java.lang.String _vvvvvvvvvvv2 = cassandraRisto.ital.mod1._vvvvvvvvvvv2(processBA, GetParameter8, GetParameter.substring(3));
                    if (!_vvvvvvvvvvv2.equals("")) {
                        anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
                        _v7.setEnabled(true);
                        servletResponseWrapper.SendString(_vvvvvvvvvvv2);
                        return "";
                    }
                    if (i == 1) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(GetParameter8);
                    }
                    java.lang.String GetParameter9 = servletRequestWrapper.GetParameter("memo");
                    if (!GetParameter9.equals("")) {
                        cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("update tavoli set memo='");
                        cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        sql2.ExecNonQuery(append2.append(cassandraRisto.ital.modfunstr._left(processBA, GetParameter9, 50L)).append("' where tavolo = ").append(GetParameter8).toString());
                    }
                }
            }
            anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
            java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 + "/VENDUTO", servletRequestWrapper.GetParameter("matricola"), true, i, j);
            if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.equals("Err")) {
                servletResponseWrapper.SendString("del_all" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
            } else {
                servletResponseWrapper.SendString("Errore di comunicazione ..");
            }
            _v7.setEnabled(true);
        } catch (java.lang.Exception e2) {
            processBA.setLastException(e2);
            servletResponseWrapper.SendString("Err");
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        return "";
    }

    public static java.lang.String _handleuploadbila(java.lang.String str) throws java.lang.Exception {
        try {
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Tmp.zip")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "Tmp.zip");
            }
            for (int i = 0; i <= 30; i++) {
                try {
                    anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.String str2 = _server.TempFolder;
                    cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.objects.streams.File.Copy(str2, str, cassandraRisto.ital.mod1._vvvvv1, "Tmp.zip");
                    break;
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(processBA, 200);
                }
            }
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, str);
            flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Tmp.job")) {
                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "Tmp.job");
            }
            try {
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String str3 = cassandraRisto.ital.mod1._vvvvv1;
                cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                archiverForB4A.UnZip(ba, str3, "Tmp.zip", cassandraRisto.ital.mod1._vvvvv1, "");
                anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "Tmp.job")) {
                    anywheresoftware.b4a.BA ba2 = processBA;
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.main.getObject(), "ElaboraSacchettone", true);
                }
            } catch (java.lang.Exception e2) {
                processBA.setLastException(e2);
                cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                    anywheresoftware.b4a.BA ba3 = processBA;
                    cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Errore nel formato del file sacchettone");
                } else {
                    anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Errore nel formato del file sacchettone"), true);
                }
                return "";
            }
        } catch (java.lang.Exception e3) {
            processBA.setLastException(e3);
            cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        java.lang.Exception e;
        java.lang.String str;
        java.lang.String str2 = "";
        try {
            str2 = "Errore";
            java.lang.String GetUploadedFile = servletRequestWrapper.GetUploadedFile("upfile");
            java.lang.String GetParameter = servletRequestWrapper.GetParameter("upfile");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(servletRequestWrapper.GetParameter("cassa")).append("/TMP").toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String sb4 = sb3.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(servletRequestWrapper.GetParameter("cassa")).toString();
            new anywheresoftware.b4a.objects.collections.List().Initialize();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(sb2);
            if (ListFiles.getSize() > 0) {
                int size = ListFiles.getSize() - 1;
                for (int i = 0; i <= size; i++) {
                    anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i)));
                }
            }
            for (int i2 = 0; i2 <= 30; i2++) {
                try {
                    anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(_server.TempFolder, GetUploadedFile, sb2, GetParameter);
                    break;
                } catch (java.lang.Exception e2) {
                    processBA.setLastException(e2);
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(processBA, 300);
                }
            }
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
            try {
                new flm.b4a.archiver.ArchiverForB4A().UnZip(processBA, sb2, GetParameter, sb2, "");
            } catch (java.lang.Exception e3) {
                processBA.setLastException(e3);
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb2, GetParameter);
                servletResponseWrapper.SendString("Errore durante l'invio del file");
            }
            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(sb2, GetParameter);
            ListFiles.Initialize();
            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.collections.List ListFiles2 = anywheresoftware.b4a.objects.streams.File.ListFiles(sb2);
            if (ListFiles2.getSize() > 0) {
                int size2 = ListFiles2.getSize() - 1;
                for (int i3 = 0; i3 <= size2; i3++) {
                    anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(sb2, anywheresoftware.b4a.BA.ObjectToString(ListFiles2.Get(i3)), sb4, anywheresoftware.b4a.BA.ObjectToString(ListFiles2.Get(i3)));
                    anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, anywheresoftware.b4a.BA.ObjectToString(ListFiles2.Get(i3)));
                }
            }
            anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
            if (!anywheresoftware.b4a.objects.streams.File.Exists(sb4, "ModCliente.txt")) {
                str = "Errore";
            } else {
                anywheresoftware.b4a.randomaccessfile.RandomAccessFile randomAccessFile = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
                randomAccessFile.Initialize(sb4, "ModCliente.txt", false);
                anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                list.Initialize();
                new anywheresoftware.b4a.objects.collections.Map();
                anywheresoftware.b4a.objects.collections.Map map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) randomAccessFile.ReadObject(randomAccessFile.CurrentPosition));
                list.Add(map.getObject());
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from clienti where codice = '" + anywheresoftware.b4a.BA.ObjectToString(map.Get("codice")) + "'");
                cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "clienti", list);
                list.Initialize();
                anywheresoftware.b4a.objects.collections.Map map2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) randomAccessFile.ReadObject(randomAccessFile.CurrentPosition));
                list.Add(map2.getObject());
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from FEdatiCli where codice = '" + anywheresoftware.b4a.BA.ObjectToString(map2.Get("codice")) + "'");
                cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA ba2 = processBA;
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "FEdatiCli", list);
                str = "OK";
                try {
                    anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb4, "ModCliente.txt");
                } catch (java.lang.Exception e4) {
                    e = e4;
                    processBA.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                    servletResponseWrapper.SendString(str);
                    return "";
                }
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            str = str2;
        }
        servletResponseWrapper.SendString(str);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        try {
            java.lang.String GetUploadedFile = servletRequestWrapper.GetUploadedFile("upfile");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(servletRequestWrapper.GetParameter("matricola")).toString();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Copy(_server.TempFolder, GetUploadedFile, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 + "/VENDUTO/IMG", servletRequestWrapper.GetParameter("upfile"));
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 + "/VENDUTO", servletRequestWrapper.GetParameter("matricola"), true, 0, 0L);
            _v7.setEnabled(true);
            servletResponseWrapper.SendString("del_img");
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            servletResponseWrapper.SendString("Err");
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper, java.lang.String str) throws java.lang.Exception {
        try {
            java.lang.String GetUploadedFile = servletRequestWrapper.GetUploadedFile("upfile");
            java.lang.String GetParameter = servletRequestWrapper.GetParameter("upfile");
            int parseDouble = (int) java.lang.Double.parseDouble(servletRequestWrapper.GetParameter("cassa"));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(servletRequestWrapper.GetParameter("cassa")).append("/TMP").toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String sb4 = sb3.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(servletRequestWrapper.GetParameter("cassa")).toString();
            new anywheresoftware.b4a.objects.collections.List().Initialize();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(sb2);
            if (ListFiles.getSize() > 0) {
                int size = ListFiles.getSize() - 1;
                for (int i = 0; i <= size; i++) {
                    anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i)));
                }
            }
            for (int i2 = 0; i2 <= 30; i2++) {
                try {
                    anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(_server.TempFolder, GetUploadedFile, sb2, GetParameter);
                    break;
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(processBA, 300);
                }
            }
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(_server.TempFolder, GetUploadedFile);
            try {
                new flm.b4a.archiver.ArchiverForB4A().UnZip(processBA, sb2, GetParameter, sb2, "");
            } catch (java.lang.Exception e2) {
                processBA.setLastException(e2);
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(sb2, GetParameter);
                servletResponseWrapper.SendString("Errore durante l'invio del file");
            }
            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(sb2, GetParameter);
            ListFiles.Initialize();
            anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.collections.List ListFiles2 = anywheresoftware.b4a.objects.streams.File.ListFiles(sb2);
            if (ListFiles2.getSize() > 0) {
                int size2 = ListFiles2.getSize() - 1;
                for (int i3 = 0; i3 <= size2; i3++) {
                    anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Copy(sb2, anywheresoftware.b4a.BA.ObjectToString(ListFiles2.Get(i3)), sb4, anywheresoftware.b4a.BA.ObjectToString(ListFiles2.Get(i3)));
                    anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, anywheresoftware.b4a.BA.ObjectToString(ListFiles2.Get(i3)));
                }
            }
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv4(processBA, parseDouble, str);
            servletResponseWrapper.SendString("OK");
            return "";
        } catch (java.lang.Exception e3) {
            processBA.setLastException(e3);
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            servletResponseWrapper.SendString("Errore ");
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper, java.lang.String str) throws java.lang.Exception {
        try {
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String dirDefaultExternal = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Copy(dirDefaultExternal, "Anagra.db", sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.db");
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String dirDefaultExternal2 = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Copy(dirDefaultExternal2, "Config.txt", sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Config.txt");
            new anywheresoftware.b4a.objects.collections.List().Initialize();
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal());
            int size = ListFiles.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
                if (ObjectToString.startsWith("LayoutStampaTipo") && ObjectToString.endsWith(".cfg")) {
                    list.Add(ObjectToString);
                    anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.String dirDefaultExternal3 = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.objects.streams.File.Copy(dirDefaultExternal3, ObjectToString, sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), ObjectToString);
                }
            }
            java.lang.String[] strArr = new java.lang.String[list.getSize() + 2];
            java.util.Arrays.fill(strArr, "");
            strArr[0] = "Anagra.db";
            strArr[1] = "Config.txt";
            if (list.getSize() > 0) {
                int size2 = list.getSize() - 1;
                for (int i2 = 0; i2 <= size2; i2++) {
                    strArr[i2 + 2] = anywheresoftware.b4a.BA.ObjectToString(list.Get(i2));
                }
            }
            flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
            anywheresoftware.b4a.BA ba = processBA;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb5 = sb4.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            archiverForB4A.ZipFiles(ba, sb5, strArr, sb6.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip", "");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            servletResponseWrapper.SendFile(sb7.append(cassandraRisto.ital.mod1._vvvvv1).append("/SEND").toString(), "Anagra.zip");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb9 = sb8.append(cassandraRisto.ital.mod1._vvvvv1).append("/T").append(str).append("/TAVOLI").toString();
            cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvv2(processBA, sb9);
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            servletResponseWrapper.SendString("Errore");
            cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper, java.lang.String str, boolean z) throws java.lang.Exception {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String sb2 = sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/T").append(str).append("/TAVOLI").toString();
            if (z) {
                anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                list.Initialize();
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                list.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(sb2));
                int size = list.getSize() - 1;
                for (int i = 0; i <= size; i++) {
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(list.Get(i));
                    if (ObjectToString.endsWith(".txt")) {
                        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                        if (anywheresoftware.b4a.objects.streams.File.Size(sb2, ObjectToString) > 0) {
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Delete(sb2, ObjectToString);
                        }
                    }
                }
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select valore from pagine where pagina >=10  AND pagina <100  AND tipo = 9"));
                int[] iArr = new int[cursorWrapper2.getRowCount()];
                int rowCount = cursorWrapper2.getRowCount() - 1;
                for (int i2 = 0; i2 <= rowCount; i2++) {
                    cursorWrapper2.setPosition(i2);
                    iArr[i2] = cursorWrapper2.GetInt("valore");
                }
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", iArr, str);
            }
            anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
            list2.Initialize();
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            list2.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(sb2));
            anywheresoftware.b4a.objects.collections.List list3 = new anywheresoftware.b4a.objects.collections.List();
            list3.Initialize();
            int size2 = list2.getSize() - 1;
            for (int i3 = 0; i3 <= size2; i3++) {
                java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(list2.Get(i3));
                if (ObjectToString2.endsWith(".txt")) {
                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                    if (anywheresoftware.b4a.objects.streams.File.Size(sb2, ObjectToString2) > 0) {
                        list3.Add(ObjectToString2);
                    }
                }
            }
            if (list3.getSize() > 0) {
                java.lang.String[] strArr = new java.lang.String[list3.getSize()];
                java.util.Arrays.fill(strArr, "");
                int size3 = list3.getSize() - 1;
                for (int i4 = 0; i4 <= size3; i4++) {
                    strArr[i4] = anywheresoftware.b4a.BA.ObjectToString(list3.Get(i4));
                }
                new flm.b4a.archiver.ArchiverForB4A().ZipFiles(processBA, sb2, strArr, sb2, "SospesiT.zip", "");
                int size4 = list3.getSize() - 1;
                for (int i5 = 0; i5 <= size4; i5++) {
                    anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File.Delete(sb2, anywheresoftware.b4a.BA.ObjectToString(list3.Get(i5)));
                }
                servletResponseWrapper.SendFile(sb2, "SospesiT.zip");
                return "";
            }
            servletResponseWrapper.SendString("OK");
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            servletResponseWrapper.SendString("Errore");
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str, long j) throws java.lang.Exception {
        try {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("TMP");
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            java.lang.String sb = append.append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.DateTime.getNow())).append(anywheresoftware.b4a.BA.NumberToString(anywheresoftware.b4a.keywords.Common.Rnd(1, 1000))).toString();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.WriteString(anywheresoftware.b4a.objects.streams.File.getDirInternal(), sb, str);
            new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(anywheresoftware.b4a.objects.streams.File.ReadMap(anywheresoftware.b4a.objects.streams.File.getDirInternal(), sb).GetDefault("custom", ""));
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("insert into TestiPagamentiWeb(cliente ,nmov ,testo) values('" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ObjectToString) + "'," + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Long.valueOf(j)) + ",'" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str.replace("'", "`").replace("%", "").replace(",", "")) + "')");
            anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(anywheresoftware.b4a.objects.streams.File.getDirInternal(), sb);
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str) throws java.lang.Exception {
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select Serial,IP from Palmari where Attivo = 1 order by Serial"));
        if (cursorWrapper2.getRowCount() > 0) {
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i = 0; i <= rowCount; i++) {
                cursorWrapper2.setPosition(i);
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba, cassandraRisto.ital.httpclient.getObject(), "SendPrenotaPalmari", cursorWrapper2.GetString("IP"), str);
            }
        }
        cursorWrapper2.Close();
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0340, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x034a, code lost:
    
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r6 = new java.lang.StringBuilder().append(" and tipo =");
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r6.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(anywheresoftware.b4a.BA.NumberToString(r12)).append(" ").toString();
        r6 = cassandraRisto.ital.starter.processBA;
        r9 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r6, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x039c, code lost:
    
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r8 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select timelast from tavoli where tavolo = " + anywheresoftware.b4a.BA.NumberToString(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03bd, code lost:
    
        if (r2 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03bf, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03e9, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " + anywheresoftware.b4a.BA.NumberToString(r12)).equals(anywheresoftware.b4a.BA.NumberToString(1)) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return "_OKNEW" + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03ef, code lost:
    
        if (r0 <= 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03f1, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x03f2, code lost:
    
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        r0 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        r1 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(r0, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from venduto where nmov =" + anywheresoftware.b4a.BA.NumberToString(r6) + " order by totcre,codice asc"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x042d, code lost:
    
        if (r0.getRowCount() <= 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x042f, code lost:
    
        r1 = anywheresoftware.b4a.BA.NumberToString(r12) + "_" + anywheresoftware.b4a.BA.NumberToString(r6) + "_" + r13;
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvv1(cassandraRisto.ital.starter.processBA, true, r1);
        r5.Initialize();
        r5.Append(r8).Append("\n");
        r6 = r0.getRowCount() - 1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0475, code lost:
    
        if (r1 > r6) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0477, code lost:
    
        r0.setPosition(r1);
        r2 = r0.GetString("codice").trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x048a, code lost:
    
        if (r2.equals("") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x048c, code lost:
    
        r2 = r0.GetString("codint").trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0496, code lost:
    
        r5.Append(r0.GetString("qta").replace(",", ".") + ",");
        r5.Append(r2 + ",");
        r5.Append(r0.GetString("descrizione").trim() + ",");
        r5.Append(r0.GetString("qta").replace(",", ".") + ",");
        r5.Append(r0.GetString("prezzov").replace(",", ".") + ",");
        r5.Append(r0.GetString("idRiga") + ",");
        r5.Append(r0.GetString("reparto") + ",");
        r5.Append(r0.GetString("iva") + ",");
        r5.Append(r0.GetString("importo").replace(",", ".") + ",");
        r5.Append(r0.GetString("codint").trim() + ",");
        r5.Append(anywheresoftware.b4a.BA.NumberToString(r12) + ",");
        r5.Append(r0.GetString("QtaConDecimali").replace(",", ".") + ",");
        r5.Append(r0.GetString("totcre").trim() + ",");
        r5.Append(r0.GetString("turno").trim() + ",");
        r7 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0665, code lost:
    
        if (r0.GetString("gruppomenu").trim().equals("") == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0667, code lost:
    
        r2 = "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0669, code lost:
    
        r5.Append(r7.append(anywheresoftware.b4a.BA.ObjectToString(r2)).append(",").toString());
        r7 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0693, code lost:
    
        if (r0.GetString("memo").trim().equals("") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0695, code lost:
    
        r2 = "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0697, code lost:
    
        r5.Append(r7.append(anywheresoftware.b4a.BA.ObjectToString(r2)).append(",").toString());
        r5.Append(anywheresoftware.b4a.BA.ObjectToString(java.lang.Boolean.valueOf(r3)) + ",");
        r5.Append(r0.GetString("FromWeb") + ",");
        r5.Append(r0.GetString("sottoconto") + ",");
        r5.Append(r0.GetString("sottocontoT")).Append("\n");
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x07e1, code lost:
    
        r2 = r0.GetString("memo").trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x07d5, code lost:
    
        r2 = r0.GetString("gruppomenu").trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x07ed, code lost:
    
        r0 = anywheresoftware.b4a.BA.ObjectToString(r5);
        r1 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r0 = anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.mod1._vvvvvvvvvv3(cassandraRisto.ital.starter.processBA, r0.getBytes("UTF8")));
        r1 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        r1 = cassandraRisto.ital.starter.processBA;
        r0 = new java.lang.StringBuilder().append(r0);
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return cassandraRisto.ital.modfunstr._left(r1, r0.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA, 20)).toString(), 20) + anywheresoftware.b4a.BA.ObjectToString(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return "_OKNEW" + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x07ac, code lost:
    
        r0 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r6 = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " + anywheresoftware.b4a.BA.NumberToString(r12)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0348, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int i, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        boolean z = false;
        long j = 0;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_opobbligatorio) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            z = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " + anywheresoftware.b4a.BA.NumberToString(i)).equals(anywheresoftware.b4a.BA.NumberToString(1));
            if (z) {
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                j = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " + anywheresoftware.b4a.BA.NumberToString(i)));
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from venduto where nmov =" + anywheresoftware.b4a.BA.NumberToString(j))) > 0.0d) {
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select operatore from headmov where nmov = " + anywheresoftware.b4a.BA.NumberToString(j));
                    if (!ExecQuerySingleResult.equals(str2)) {
                        return "Solo l'operatore " + ExecQuerySingleResult + " può aprire questo tavolo.";
                    }
                }
            }
        }
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + anywheresoftware.b4a.BA.NumberToString(i)).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("select count(*) from pagine where pagina >=10 and pagina <100 and tipo = ");
            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!sql.ExecQuerySingleResult(append.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and  valore = ").append(anywheresoftware.b4a.BA.NumberToString(i)).toString()).equals(anywheresoftware.b4a.BA.NumberToString(0)) || i >= 20000) {
                boolean z2 = false;
                cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where lock=0 and inmodifica=0 and tavolo = " + anywheresoftware.b4a.BA.NumberToString(i)).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                    cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.String ExecQuerySingleResult2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " + anywheresoftware.b4a.BA.NumberToString(i));
                    if (!ExecQuerySingleResult2.equals("0")) {
                        cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        z2 = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult(new java.lang.StringBuilder().append("Select count(*) from headmov where fromweb=1 and nmov = ").append(ExecQuerySingleResult2).toString())) > 0.0d;
                    }
                    if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
                        return "TAVOLO BLOCCATO";
                    }
                }
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(str.trim()).toString(), "venduto.csv")) {
                    return "TAVOLO NON ANCORA ELABORATO DAL SERVER";
                }
                cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from Palmari where  Serial = '" + str + "'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                    return "Inserire la matricola sul server ";
                }
                cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.BeginTransaction();
                try {
                    cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " + anywheresoftware.b4a.BA.NumberToString(i)).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("update tavoli set timein = '");
                        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA ba = processBA;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.StringBuilder append3 = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
                        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        sql2.ExecNonQuery(append2.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba, append3.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString())).append("' where tavolo =").append(anywheresoftware.b4a.BA.NumberToString(i)).toString());
                        cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set inmodifica =1,timelast=timein where tavolo =" + anywheresoftware.b4a.BA.NumberToString(i));
                    } else {
                        cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("update tavoli set inmodifica =1,timelast ='");
                        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA ba2 = processBA;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.StringBuilder append5 = sb3.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
                        anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        sql3.ExecNonQuery(append4.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba2, append5.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString())).append("' where tavolo =").append(anywheresoftware.b4a.BA.NumberToString(i)).toString());
                    }
                    cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.TransactionSuccessful();
                    cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.EndTransaction();
                    cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                        anywheresoftware.b4a.BA ba3 = processBA;
                        cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba3, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", new int[]{i}, str);
                    }
                    cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                        cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    }
                    cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    if (1 != 0) {
                        cassandraRisto.ital.main mainVar25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.EndTransaction();
                    }
                    cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                    return "Errore esportazione dati";
                }
            }
        }
        return "TAVOLO NON TROVATO";
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _server = new anywheresoftware.b4a.objects.HttpServer();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.Map();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 12312;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.collections.Map();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = cassandraRisto.ital.main.vvv13(new byte[]{48, 0, 40, 118}, 620623);
        _v7 = new anywheresoftware.b4a.objects.Timer();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.Timer();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0L;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.Timer();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 1;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = cassandraRisto.ital.main.vvv13(new byte[]{26, 15, 57, 44, 91, 22, 53, 45, 21, 125, 60, 38, 25, 5, 101, 123, 29, 27, 55, 42, 15, 14, 98, 45, 17, 5, 47, 46, 60, 9, 100, 45, 26, 69, 57, 45, 30, 79, 107, 119, 91, 85, 113, 105, 89, 11, 46, 79, 83, 8, 37, 48, 90, 70, 125, 123, 19, 0, 43, 44, 73, 31, 35, 63, 72, 11, 5, 55}, 645473);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.agraham.threading.Threading.SemaphoreWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
        return "";
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str, int i) throws java.lang.Exception {
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'")) > 0.0d) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult(new java.lang.StringBuilder().append("Select count(*) from anagra where flgmag=1 and codint = '").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("'").toString())) > 0.0d) {
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    double parseDouble = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select giac from anagra where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'"));
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    double parseDouble2 = (parseDouble - java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Venduto inner join headmov on venduto.nmov=headmov.nmov where headmov.sospeso=1  AND codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'"))) - i;
                    if (parseDouble2 < 0.0d) {
                        anywheresoftware.b4a.keywords.Common.LogImpl("490701834", anywheresoftware.b4a.BA.NumberToString(parseDouble2), 0);
                        return false;
                    }
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from distintabase where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'")) > 0.0d) {
                        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select codintpadre from distintabase where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'"));
                        int rowCount = cursorWrapper2.getRowCount() - 1;
                        for (int i2 = 0; i2 <= rowCount; i2++) {
                            cursorWrapper2.setPosition(i2);
                            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            double parseDouble3 = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select giac from anagra where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) + "'"));
                            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select codint,qta from distintabase where codintpadre = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) + "'"));
                            int rowCount2 = cursorWrapper4.getRowCount() - 1;
                            for (int i3 = 0; i3 <= rowCount2; i3++) {
                                cursorWrapper4.setPosition(i3);
                                cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                parseDouble3 = anywheresoftware.b4a.keywords.Common.Round2(parseDouble3 - (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Venduto inner join headmov on venduto.nmov=headmov.nmov where headmov.sospeso=1  AND codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper4.GetString("codint")) + "'")) * cursorWrapper4.GetDouble("qta").doubleValue()), 3);
                            }
                            cursorWrapper4.Close();
                            if (parseDouble3 < 0.0d) {
                                cursorWrapper2.Close();
                                return false;
                            }
                        }
                        cursorWrapper2.Close();
                    }
                    return true;
                }
                return true;
            }
            return false;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            return anywheresoftware.b4a.BA.ObjectToBoolean("Errore Lettura Disponibilità");
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str) throws java.lang.Exception {
        java.lang.String str2;
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'")) > 0.0d) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                boolean z = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult(new java.lang.StringBuilder().append("Select count(*) from anagra where flgmag=1 and codint = '").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("'").toString())) > 0.0d;
                if (z) {
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("Disponibilità ");
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.String sb = append.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'")).append(":  ").toString();
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    double parseDouble = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select giac from anagra where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'"));
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    double parseDouble2 = parseDouble - java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Venduto inner join headmov on venduto.nmov=headmov.nmov where headmov.sospeso=1  AND codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'"));
                    if (parseDouble2 % 1.0d == 0.0d) {
                        str2 = sb + anywheresoftware.b4a.keywords.Common.NumberFormat(parseDouble2, 1, 0);
                    } else {
                        str2 = sb + anywheresoftware.b4a.keywords.Common.NumberFormat2(parseDouble2, 1, 3, 3, false);
                    }
                } else {
                    str2 = "Articolo non abilitato alla gestione del magazzino";
                }
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from distintabase where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'")) <= 0.0d) {
                    return str2;
                }
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select codintpadre from distintabase where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "'"));
                if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                    str2 = "";
                }
                int rowCount = cursorWrapper2.getRowCount() - 1;
                java.lang.String str3 = str2;
                for (int i = 0; i <= rowCount; i++) {
                    cursorWrapper2.setPosition(i);
                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(str3).append("\n").append("Disponibilità ");
                    cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.String sb2 = append2.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) + "'")).append(":  ").toString();
                    cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    double parseDouble3 = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select giac from anagra where codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) + "'"));
                    new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select codint,qta from distintabase where codintpadre = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) + "'"));
                    int rowCount2 = cursorWrapper4.getRowCount() - 1;
                    int i2 = 0;
                    double d = parseDouble3;
                    while (i2 <= rowCount2) {
                        cursorWrapper4.setPosition(i2);
                        cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        i2++;
                        d = anywheresoftware.b4a.keywords.Common.Round2(d - (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Venduto inner join headmov on venduto.nmov=headmov.nmov where headmov.sospeso=1  AND codint = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper4.GetString("codint")) + "'")) * cursorWrapper4.GetDouble("qta").doubleValue()), 3);
                    }
                    cursorWrapper4.Close();
                    if (d % 1.0d == 0.0d) {
                        str3 = sb2 + anywheresoftware.b4a.keywords.Common.NumberFormat(d, 1, 0);
                    } else {
                        str3 = sb2 + anywheresoftware.b4a.keywords.Common.NumberFormat2(d, 1, 3, 3, false);
                    }
                }
                cursorWrapper2.Close();
                return str3;
            }
            return "Articolo non trovato";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            return "Errore Lettura Giacenza";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x07a9, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x08ef, code lost:
    
        if (r2 > cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getRowCount()) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0d18, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0df9, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0f54, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0f5e, code lost:
    
        r0 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r0 = new java.lang.StringBuilder().append(" and tipo =");
        r1 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r0.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(r11[1]).append(" ").toString();
        r0 = cassandraRisto.ital.starter.processBA;
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r0, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r0 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0faf, code lost:
    
        r0 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0fb5, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0fb7, code lost:
    
        r0 = new int[]{(int) java.lang.Double.parseDouble(r11[1])};
        r1 = cassandraRisto.ital.starter.processBA;
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        r2 = cassandraRisto.ital.httpclient.getObject();
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew3(r1, r2, "SendVariazioneTavoloAiClient", r0, cassandraRisto.ital.main._v_numcassa);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0fda, code lost:
    
        r15.SendString("Ok");
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0f5c, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 != false) goto L289;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:3:0x0033, B:5:0x0060, B:7:0x006c, B:11:0x007b, B:13:0x0087, B:15:0x008f, B:17:0x0097, B:19:0x009f, B:21:0x00a7, B:23:0x00af, B:25:0x00b7, B:27:0x00bd, B:29:0x00c5, B:31:0x00ce, B:33:0x00d6, B:35:0x00de, B:37:0x00e6, B:39:0x00ee, B:41:0x00fb, B:43:0x0109, B:45:0x011d, B:47:0x012c, B:48:0x0132, B:50:0x0138, B:51:0x02db, B:52:0x02de, B:54:0x02e7, B:55:0x1699, B:56:0x0417, B:58:0x0464, B:59:0x0474, B:60:0x0479, B:62:0x047c, B:64:0x0485, B:66:0x0498, B:67:0x04bc, B:69:0x04e6, B:71:0x04e9, B:73:0x04f4, B:74:0x0556, B:75:0x058e, B:76:0x05af, B:77:0x05b6, B:79:0x05c7, B:82:0x05f1, B:83:0x05f6, B:84:0x0634, B:85:0x066a, B:86:0x0672, B:87:0x068e, B:88:0x06a3, B:90:0x06a6, B:92:0x06c6, B:94:0x06ce, B:95:0x06d5, B:96:0x06b5, B:98:0x06b8, B:99:0x06bf, B:100:0x06de, B:101:0x06e6, B:102:0x06eb, B:103:0x06f0, B:104:0x06f5, B:105:0x0716, B:106:0x0719, B:107:0x0741, B:109:0x0749, B:110:0x075a, B:112:0x0762, B:113:0x0778, B:115:0x078c, B:118:0x0795, B:120:0x079b, B:122:0x07a3, B:124:0x07ab, B:126:0x07b1, B:128:0x07bc, B:130:0x07c7, B:132:0x07d6, B:133:0x07dd, B:134:0x07e8, B:136:0x07f7, B:137:0x07fe, B:139:0x0828, B:141:0x084f, B:142:0x0856, B:143:0x087c, B:144:0x0883, B:146:0x0892, B:147:0x0899, B:148:0x08a4, B:150:0x08b0, B:152:0x08bf, B:154:0x08c2, B:156:0x08cf, B:158:0x08db, B:160:0x099a, B:162:0x09c8, B:163:0x09e9, B:165:0x09f7, B:167:0x0a4a, B:169:0x0a58, B:170:0x0a5f, B:171:0x0a05, B:172:0x08f1, B:174:0x0900, B:175:0x0905, B:177:0x090d, B:179:0x0919, B:180:0x0958, B:182:0x0964, B:183:0x096a, B:185:0x0976, B:187:0x098c, B:188:0x0993, B:189:0x0a66, B:190:0x0a71, B:191:0x0a79, B:192:0x0a7e, B:193:0x0a86, B:194:0x0a8b, B:195:0x0a90, B:197:0x0a93, B:198:0x0a9a, B:200:0x0aa8, B:202:0x0ab3, B:203:0x0b05, B:204:0x0b57, B:206:0x0b62, B:208:0x0b6d, B:209:0x0bfe, B:210:0x0c88, B:212:0x0c97, B:213:0x0c9e, B:214:0x0ca6, B:215:0x0caf, B:216:0x0cb8, B:218:0x0cbb, B:220:0x0cd1, B:221:0x0cca, B:222:0x0cdd, B:323:0x0d06, B:325:0x0d10, B:327:0x0d22, B:328:0x0d73, B:329:0x0d1a, B:331:0x0da7, B:337:0x0de7, B:339:0x0df1, B:341:0x0e03, B:342:0x0e54, B:344:0x0e5c, B:345:0x0e7f, B:346:0x0dfb, B:348:0x0e93, B:223:0x0eb3, B:224:0x0ec9, B:225:0x0fe1, B:227:0x0fe9, B:228:0x0ff2, B:229:0x0ff9, B:230:0x1012, B:232:0x1020, B:233:0x1027, B:234:0x103f, B:235:0x1049, B:236:0x105b, B:237:0x106d, B:238:0x1072, B:239:0x1077, B:241:0x107a, B:243:0x1090, B:245:0x1098, B:246:0x109f, B:247:0x1089, B:248:0x10a6, B:249:0x10ab, B:250:0x10b7, B:251:0x10c8, B:253:0x10d5, B:254:0x1103, B:255:0x110d, B:256:0x1133, B:258:0x1143, B:260:0x1199, B:262:0x11b2, B:264:0x11fd, B:265:0x118f, B:266:0x11be, B:267:0x1151, B:268:0x126b, B:270:0x1278, B:271:0x12a8, B:272:0x12b2, B:274:0x12c2, B:275:0x12de, B:276:0x12e8, B:278:0x12f5, B:279:0x1325, B:280:0x132f, B:282:0x133c, B:283:0x1347, B:284:0x1351, B:286:0x135e, B:287:0x1369, B:288:0x1373, B:290:0x1380, B:291:0x138b, B:292:0x1395, B:294:0x13a2, B:295:0x1424, B:296:0x142e, B:298:0x143b, B:299:0x14a9, B:300:0x14b3, B:302:0x14c0, B:303:0x1542, B:304:0x154c, B:306:0x1559, B:307:0x159d, B:308:0x15a7, B:310:0x15b4, B:311:0x15f8, B:312:0x1602, B:314:0x160f, B:315:0x1653, B:316:0x165d, B:317:0x1664, B:319:0x1677, B:320:0x168a, B:334:0x0d9b, B:351:0x0e87, B:368:0x0f16, B:369:0x02fc, B:374:0x0308, B:376:0x034b, B:377:0x0353, B:381:0x038b, B:382:0x03b2, B:384:0x03fd, B:385:0x0409, B:386:0x040f, B:387:0x00f6, B:322:0x0ce6, B:336:0x0dc7, B:353:0x0ed7, B:355:0x0f0e, B:356:0x0f22, B:358:0x0f4c, B:360:0x0f5e, B:361:0x0faf, B:363:0x0fb7, B:364:0x0fda, B:365:0x0f56), top: B:2:0x0033, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x079b A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:3:0x0033, B:5:0x0060, B:7:0x006c, B:11:0x007b, B:13:0x0087, B:15:0x008f, B:17:0x0097, B:19:0x009f, B:21:0x00a7, B:23:0x00af, B:25:0x00b7, B:27:0x00bd, B:29:0x00c5, B:31:0x00ce, B:33:0x00d6, B:35:0x00de, B:37:0x00e6, B:39:0x00ee, B:41:0x00fb, B:43:0x0109, B:45:0x011d, B:47:0x012c, B:48:0x0132, B:50:0x0138, B:51:0x02db, B:52:0x02de, B:54:0x02e7, B:55:0x1699, B:56:0x0417, B:58:0x0464, B:59:0x0474, B:60:0x0479, B:62:0x047c, B:64:0x0485, B:66:0x0498, B:67:0x04bc, B:69:0x04e6, B:71:0x04e9, B:73:0x04f4, B:74:0x0556, B:75:0x058e, B:76:0x05af, B:77:0x05b6, B:79:0x05c7, B:82:0x05f1, B:83:0x05f6, B:84:0x0634, B:85:0x066a, B:86:0x0672, B:87:0x068e, B:88:0x06a3, B:90:0x06a6, B:92:0x06c6, B:94:0x06ce, B:95:0x06d5, B:96:0x06b5, B:98:0x06b8, B:99:0x06bf, B:100:0x06de, B:101:0x06e6, B:102:0x06eb, B:103:0x06f0, B:104:0x06f5, B:105:0x0716, B:106:0x0719, B:107:0x0741, B:109:0x0749, B:110:0x075a, B:112:0x0762, B:113:0x0778, B:115:0x078c, B:118:0x0795, B:120:0x079b, B:122:0x07a3, B:124:0x07ab, B:126:0x07b1, B:128:0x07bc, B:130:0x07c7, B:132:0x07d6, B:133:0x07dd, B:134:0x07e8, B:136:0x07f7, B:137:0x07fe, B:139:0x0828, B:141:0x084f, B:142:0x0856, B:143:0x087c, B:144:0x0883, B:146:0x0892, B:147:0x0899, B:148:0x08a4, B:150:0x08b0, B:152:0x08bf, B:154:0x08c2, B:156:0x08cf, B:158:0x08db, B:160:0x099a, B:162:0x09c8, B:163:0x09e9, B:165:0x09f7, B:167:0x0a4a, B:169:0x0a58, B:170:0x0a5f, B:171:0x0a05, B:172:0x08f1, B:174:0x0900, B:175:0x0905, B:177:0x090d, B:179:0x0919, B:180:0x0958, B:182:0x0964, B:183:0x096a, B:185:0x0976, B:187:0x098c, B:188:0x0993, B:189:0x0a66, B:190:0x0a71, B:191:0x0a79, B:192:0x0a7e, B:193:0x0a86, B:194:0x0a8b, B:195:0x0a90, B:197:0x0a93, B:198:0x0a9a, B:200:0x0aa8, B:202:0x0ab3, B:203:0x0b05, B:204:0x0b57, B:206:0x0b62, B:208:0x0b6d, B:209:0x0bfe, B:210:0x0c88, B:212:0x0c97, B:213:0x0c9e, B:214:0x0ca6, B:215:0x0caf, B:216:0x0cb8, B:218:0x0cbb, B:220:0x0cd1, B:221:0x0cca, B:222:0x0cdd, B:323:0x0d06, B:325:0x0d10, B:327:0x0d22, B:328:0x0d73, B:329:0x0d1a, B:331:0x0da7, B:337:0x0de7, B:339:0x0df1, B:341:0x0e03, B:342:0x0e54, B:344:0x0e5c, B:345:0x0e7f, B:346:0x0dfb, B:348:0x0e93, B:223:0x0eb3, B:224:0x0ec9, B:225:0x0fe1, B:227:0x0fe9, B:228:0x0ff2, B:229:0x0ff9, B:230:0x1012, B:232:0x1020, B:233:0x1027, B:234:0x103f, B:235:0x1049, B:236:0x105b, B:237:0x106d, B:238:0x1072, B:239:0x1077, B:241:0x107a, B:243:0x1090, B:245:0x1098, B:246:0x109f, B:247:0x1089, B:248:0x10a6, B:249:0x10ab, B:250:0x10b7, B:251:0x10c8, B:253:0x10d5, B:254:0x1103, B:255:0x110d, B:256:0x1133, B:258:0x1143, B:260:0x1199, B:262:0x11b2, B:264:0x11fd, B:265:0x118f, B:266:0x11be, B:267:0x1151, B:268:0x126b, B:270:0x1278, B:271:0x12a8, B:272:0x12b2, B:274:0x12c2, B:275:0x12de, B:276:0x12e8, B:278:0x12f5, B:279:0x1325, B:280:0x132f, B:282:0x133c, B:283:0x1347, B:284:0x1351, B:286:0x135e, B:287:0x1369, B:288:0x1373, B:290:0x1380, B:291:0x138b, B:292:0x1395, B:294:0x13a2, B:295:0x1424, B:296:0x142e, B:298:0x143b, B:299:0x14a9, B:300:0x14b3, B:302:0x14c0, B:303:0x1542, B:304:0x154c, B:306:0x1559, B:307:0x159d, B:308:0x15a7, B:310:0x15b4, B:311:0x15f8, B:312:0x1602, B:314:0x160f, B:315:0x1653, B:316:0x165d, B:317:0x1664, B:319:0x1677, B:320:0x168a, B:334:0x0d9b, B:351:0x0e87, B:368:0x0f16, B:369:0x02fc, B:374:0x0308, B:376:0x034b, B:377:0x0353, B:381:0x038b, B:382:0x03b2, B:384:0x03fd, B:385:0x0409, B:386:0x040f, B:387:0x00f6, B:322:0x0ce6, B:336:0x0dc7, B:353:0x0ed7, B:355:0x0f0e, B:356:0x0f22, B:358:0x0f4c, B:360:0x0f5e, B:361:0x0faf, B:363:0x0fb7, B:364:0x0fda, B:365:0x0f56), top: B:2:0x0033, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0e5c A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:3:0x0033, B:5:0x0060, B:7:0x006c, B:11:0x007b, B:13:0x0087, B:15:0x008f, B:17:0x0097, B:19:0x009f, B:21:0x00a7, B:23:0x00af, B:25:0x00b7, B:27:0x00bd, B:29:0x00c5, B:31:0x00ce, B:33:0x00d6, B:35:0x00de, B:37:0x00e6, B:39:0x00ee, B:41:0x00fb, B:43:0x0109, B:45:0x011d, B:47:0x012c, B:48:0x0132, B:50:0x0138, B:51:0x02db, B:52:0x02de, B:54:0x02e7, B:55:0x1699, B:56:0x0417, B:58:0x0464, B:59:0x0474, B:60:0x0479, B:62:0x047c, B:64:0x0485, B:66:0x0498, B:67:0x04bc, B:69:0x04e6, B:71:0x04e9, B:73:0x04f4, B:74:0x0556, B:75:0x058e, B:76:0x05af, B:77:0x05b6, B:79:0x05c7, B:82:0x05f1, B:83:0x05f6, B:84:0x0634, B:85:0x066a, B:86:0x0672, B:87:0x068e, B:88:0x06a3, B:90:0x06a6, B:92:0x06c6, B:94:0x06ce, B:95:0x06d5, B:96:0x06b5, B:98:0x06b8, B:99:0x06bf, B:100:0x06de, B:101:0x06e6, B:102:0x06eb, B:103:0x06f0, B:104:0x06f5, B:105:0x0716, B:106:0x0719, B:107:0x0741, B:109:0x0749, B:110:0x075a, B:112:0x0762, B:113:0x0778, B:115:0x078c, B:118:0x0795, B:120:0x079b, B:122:0x07a3, B:124:0x07ab, B:126:0x07b1, B:128:0x07bc, B:130:0x07c7, B:132:0x07d6, B:133:0x07dd, B:134:0x07e8, B:136:0x07f7, B:137:0x07fe, B:139:0x0828, B:141:0x084f, B:142:0x0856, B:143:0x087c, B:144:0x0883, B:146:0x0892, B:147:0x0899, B:148:0x08a4, B:150:0x08b0, B:152:0x08bf, B:154:0x08c2, B:156:0x08cf, B:158:0x08db, B:160:0x099a, B:162:0x09c8, B:163:0x09e9, B:165:0x09f7, B:167:0x0a4a, B:169:0x0a58, B:170:0x0a5f, B:171:0x0a05, B:172:0x08f1, B:174:0x0900, B:175:0x0905, B:177:0x090d, B:179:0x0919, B:180:0x0958, B:182:0x0964, B:183:0x096a, B:185:0x0976, B:187:0x098c, B:188:0x0993, B:189:0x0a66, B:190:0x0a71, B:191:0x0a79, B:192:0x0a7e, B:193:0x0a86, B:194:0x0a8b, B:195:0x0a90, B:197:0x0a93, B:198:0x0a9a, B:200:0x0aa8, B:202:0x0ab3, B:203:0x0b05, B:204:0x0b57, B:206:0x0b62, B:208:0x0b6d, B:209:0x0bfe, B:210:0x0c88, B:212:0x0c97, B:213:0x0c9e, B:214:0x0ca6, B:215:0x0caf, B:216:0x0cb8, B:218:0x0cbb, B:220:0x0cd1, B:221:0x0cca, B:222:0x0cdd, B:323:0x0d06, B:325:0x0d10, B:327:0x0d22, B:328:0x0d73, B:329:0x0d1a, B:331:0x0da7, B:337:0x0de7, B:339:0x0df1, B:341:0x0e03, B:342:0x0e54, B:344:0x0e5c, B:345:0x0e7f, B:346:0x0dfb, B:348:0x0e93, B:223:0x0eb3, B:224:0x0ec9, B:225:0x0fe1, B:227:0x0fe9, B:228:0x0ff2, B:229:0x0ff9, B:230:0x1012, B:232:0x1020, B:233:0x1027, B:234:0x103f, B:235:0x1049, B:236:0x105b, B:237:0x106d, B:238:0x1072, B:239:0x1077, B:241:0x107a, B:243:0x1090, B:245:0x1098, B:246:0x109f, B:247:0x1089, B:248:0x10a6, B:249:0x10ab, B:250:0x10b7, B:251:0x10c8, B:253:0x10d5, B:254:0x1103, B:255:0x110d, B:256:0x1133, B:258:0x1143, B:260:0x1199, B:262:0x11b2, B:264:0x11fd, B:265:0x118f, B:266:0x11be, B:267:0x1151, B:268:0x126b, B:270:0x1278, B:271:0x12a8, B:272:0x12b2, B:274:0x12c2, B:275:0x12de, B:276:0x12e8, B:278:0x12f5, B:279:0x1325, B:280:0x132f, B:282:0x133c, B:283:0x1347, B:284:0x1351, B:286:0x135e, B:287:0x1369, B:288:0x1373, B:290:0x1380, B:291:0x138b, B:292:0x1395, B:294:0x13a2, B:295:0x1424, B:296:0x142e, B:298:0x143b, B:299:0x14a9, B:300:0x14b3, B:302:0x14c0, B:303:0x1542, B:304:0x154c, B:306:0x1559, B:307:0x159d, B:308:0x15a7, B:310:0x15b4, B:311:0x15f8, B:312:0x1602, B:314:0x160f, B:315:0x1653, B:316:0x165d, B:317:0x1664, B:319:0x1677, B:320:0x168a, B:334:0x0d9b, B:351:0x0e87, B:368:0x0f16, B:369:0x02fc, B:374:0x0308, B:376:0x034b, B:377:0x0353, B:381:0x038b, B:382:0x03b2, B:384:0x03fd, B:385:0x0409, B:386:0x040f, B:387:0x00f6, B:322:0x0ce6, B:336:0x0dc7, B:353:0x0ed7, B:355:0x0f0e, B:356:0x0f22, B:358:0x0f4c, B:360:0x0f5e, B:361:0x0faf, B:363:0x0fb7, B:364:0x0fda, B:365:0x0f56), top: B:2:0x0033, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:3:0x0033, B:5:0x0060, B:7:0x006c, B:11:0x007b, B:13:0x0087, B:15:0x008f, B:17:0x0097, B:19:0x009f, B:21:0x00a7, B:23:0x00af, B:25:0x00b7, B:27:0x00bd, B:29:0x00c5, B:31:0x00ce, B:33:0x00d6, B:35:0x00de, B:37:0x00e6, B:39:0x00ee, B:41:0x00fb, B:43:0x0109, B:45:0x011d, B:47:0x012c, B:48:0x0132, B:50:0x0138, B:51:0x02db, B:52:0x02de, B:54:0x02e7, B:55:0x1699, B:56:0x0417, B:58:0x0464, B:59:0x0474, B:60:0x0479, B:62:0x047c, B:64:0x0485, B:66:0x0498, B:67:0x04bc, B:69:0x04e6, B:71:0x04e9, B:73:0x04f4, B:74:0x0556, B:75:0x058e, B:76:0x05af, B:77:0x05b6, B:79:0x05c7, B:82:0x05f1, B:83:0x05f6, B:84:0x0634, B:85:0x066a, B:86:0x0672, B:87:0x068e, B:88:0x06a3, B:90:0x06a6, B:92:0x06c6, B:94:0x06ce, B:95:0x06d5, B:96:0x06b5, B:98:0x06b8, B:99:0x06bf, B:100:0x06de, B:101:0x06e6, B:102:0x06eb, B:103:0x06f0, B:104:0x06f5, B:105:0x0716, B:106:0x0719, B:107:0x0741, B:109:0x0749, B:110:0x075a, B:112:0x0762, B:113:0x0778, B:115:0x078c, B:118:0x0795, B:120:0x079b, B:122:0x07a3, B:124:0x07ab, B:126:0x07b1, B:128:0x07bc, B:130:0x07c7, B:132:0x07d6, B:133:0x07dd, B:134:0x07e8, B:136:0x07f7, B:137:0x07fe, B:139:0x0828, B:141:0x084f, B:142:0x0856, B:143:0x087c, B:144:0x0883, B:146:0x0892, B:147:0x0899, B:148:0x08a4, B:150:0x08b0, B:152:0x08bf, B:154:0x08c2, B:156:0x08cf, B:158:0x08db, B:160:0x099a, B:162:0x09c8, B:163:0x09e9, B:165:0x09f7, B:167:0x0a4a, B:169:0x0a58, B:170:0x0a5f, B:171:0x0a05, B:172:0x08f1, B:174:0x0900, B:175:0x0905, B:177:0x090d, B:179:0x0919, B:180:0x0958, B:182:0x0964, B:183:0x096a, B:185:0x0976, B:187:0x098c, B:188:0x0993, B:189:0x0a66, B:190:0x0a71, B:191:0x0a79, B:192:0x0a7e, B:193:0x0a86, B:194:0x0a8b, B:195:0x0a90, B:197:0x0a93, B:198:0x0a9a, B:200:0x0aa8, B:202:0x0ab3, B:203:0x0b05, B:204:0x0b57, B:206:0x0b62, B:208:0x0b6d, B:209:0x0bfe, B:210:0x0c88, B:212:0x0c97, B:213:0x0c9e, B:214:0x0ca6, B:215:0x0caf, B:216:0x0cb8, B:218:0x0cbb, B:220:0x0cd1, B:221:0x0cca, B:222:0x0cdd, B:323:0x0d06, B:325:0x0d10, B:327:0x0d22, B:328:0x0d73, B:329:0x0d1a, B:331:0x0da7, B:337:0x0de7, B:339:0x0df1, B:341:0x0e03, B:342:0x0e54, B:344:0x0e5c, B:345:0x0e7f, B:346:0x0dfb, B:348:0x0e93, B:223:0x0eb3, B:224:0x0ec9, B:225:0x0fe1, B:227:0x0fe9, B:228:0x0ff2, B:229:0x0ff9, B:230:0x1012, B:232:0x1020, B:233:0x1027, B:234:0x103f, B:235:0x1049, B:236:0x105b, B:237:0x106d, B:238:0x1072, B:239:0x1077, B:241:0x107a, B:243:0x1090, B:245:0x1098, B:246:0x109f, B:247:0x1089, B:248:0x10a6, B:249:0x10ab, B:250:0x10b7, B:251:0x10c8, B:253:0x10d5, B:254:0x1103, B:255:0x110d, B:256:0x1133, B:258:0x1143, B:260:0x1199, B:262:0x11b2, B:264:0x11fd, B:265:0x118f, B:266:0x11be, B:267:0x1151, B:268:0x126b, B:270:0x1278, B:271:0x12a8, B:272:0x12b2, B:274:0x12c2, B:275:0x12de, B:276:0x12e8, B:278:0x12f5, B:279:0x1325, B:280:0x132f, B:282:0x133c, B:283:0x1347, B:284:0x1351, B:286:0x135e, B:287:0x1369, B:288:0x1373, B:290:0x1380, B:291:0x138b, B:292:0x1395, B:294:0x13a2, B:295:0x1424, B:296:0x142e, B:298:0x143b, B:299:0x14a9, B:300:0x14b3, B:302:0x14c0, B:303:0x1542, B:304:0x154c, B:306:0x1559, B:307:0x159d, B:308:0x15a7, B:310:0x15b4, B:311:0x15f8, B:312:0x1602, B:314:0x160f, B:315:0x1653, B:316:0x165d, B:317:0x1664, B:319:0x1677, B:320:0x168a, B:334:0x0d9b, B:351:0x0e87, B:368:0x0f16, B:369:0x02fc, B:374:0x0308, B:376:0x034b, B:377:0x0353, B:381:0x038b, B:382:0x03b2, B:384:0x03fd, B:385:0x0409, B:386:0x040f, B:387:0x00f6, B:322:0x0ce6, B:336:0x0dc7, B:353:0x0ed7, B:355:0x0f0e, B:356:0x0f22, B:358:0x0f4c, B:360:0x0f5e, B:361:0x0faf, B:363:0x0fb7, B:364:0x0fda, B:365:0x0f56), top: B:2:0x0033, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _server_handlerequest(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, anywheresoftware.b4a.objects.Servlet.ServletResponseWrapper servletResponseWrapper) throws java.lang.Exception {
        java.lang.String[] Split;
        java.lang.String remoteAddress;
        boolean z;
        boolean z2;
        java.lang.String sb;
        boolean z3;
        java.lang.String str;
        boolean z4 = true;
        try {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Lock();
            java.lang.String replace = servletRequestWrapper.getRequestURI().replace("/", "");
            java.util.Arrays.fill(new java.lang.String[0], "");
            anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
            Split = anywheresoftware.b4a.keywords.Regex.Split("_", replace);
            remoteAddress = servletRequestWrapper.getRemoteAddress();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            servletResponseWrapper.setStatus(500);
            servletResponseWrapper.SendString("Errore: " + anywheresoftware.b4a.BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Unlock();
            return "";
        }
        if (cassandraRisto.ital.main._v_attivakeyhttp) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IsInitialized()) {
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.ContainsKey(remoteAddress)) {
                    z = true;
                    if (z) {
                        java.lang.String str2 = Split[0];
                        if (str2.equals("write") || str2.equals("orari") || str2.equals("giac") || str2.equals("getprg") || str2.equals("GetArticoli") || str2.equals("getcodtavoli") || str2.equals("apri") || anywheresoftware.b4a.keywords.Common.IsNumber(str2) || str2.equals("lista") || str2.equals("unisci") || str2.equals("sposta") || str2.equals("conto") || str2.equals("sblocca") || str2.equals("GetTotali") || str2.equals("setcodtavoli")) {
                            Split[0] = "";
                        }
                        java.lang.String GetParameter = servletRequestWrapper.GetParameter("mk");
                        if (!GetParameter.equals("")) {
                            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.String _vvvvvvvvvvvvvv4 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvv4(processBA, GetParameter);
                            if (_vvvvvvvvvvvvvv4.length() > 15) {
                                if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(_vvvvvvvvvvvvvv4.substring(5)))) {
                                    servletResponseWrapper.SendString("Il formato della data nella chiave non è corretto.");
                                    z2 = true;
                                } else {
                                    long parseDouble = (long) java.lang.Double.parseDouble(_vvvvvvvvvvvvvv4.substring(5));
                                    java.lang.String substring = _vvvvvvvvvvvvvv4.substring(0, 5);
                                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from Palmari where Serial = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", substring) + "'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                        servletResponseWrapper.SendString("La matricola contenuta nella chiave non esiste sul server .");
                                        z2 = true;
                                    } else {
                                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        long parseDouble2 = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select datachiave from Palmari where Serial = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", substring) + "'"));
                                        if (parseDouble2 > 0 && parseDouble2 >= parseDouble) {
                                            servletResponseWrapper.SendString("La data contenuta nella chiave non è corretta ." + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", "\n") + "Eseguire il reset della chiave del palmare su RistorAndro per risolvere il problema.");
                                            z2 = true;
                                        } else {
                                            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("update Palmari set datachiave=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Long.valueOf(parseDouble)) + " where Serial = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", substring) + "'");
                                            if (!servletRequestWrapper.GetParameter("CMD").equals("")) {
                                                Split[0] = servletRequestWrapper.GetParameter("CMD");
                                                z2 = false;
                                            } else {
                                                Split[0] = str2;
                                                z2 = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                servletResponseWrapper.SendString("Il formato della chiave non è corretto .");
                                z2 = true;
                            }
                            if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
                                switch (anywheresoftware.b4a.BA.switchObjectToInt(Split[0], "verkeys", "GetArticoli", "addcliweb", "getcodtavoli", "setcodtavoli", "setcoperti", "ChiamaC", "orariweb", "getsaldo", "lista", "getprg", "getimg", "getbk", "autenticazioneGlory", "InfinityManager", "esitoGlory", "apritav", "opertav", "recmov", "hello", "GetDBV", "getsospesi", "updcliente", "vendutoclient", "updanagra", "stampascontrino", "saldicliente", "getvar", "getvart", "getvartAll", "giac", "totali", "conto2", "conto", "errprt", "helloprt", "sblocca", "orari", "sacchettone", "clientvar", "datiscontrino", "sposta", "unisci", "write", "writeimg", "apri", "GetPrenota", "DelPrenota", "GetTotali", "StoriciFiltro.htm", "Login", "Login.htm", "login", "Accesso", "RepartiStorici", "ArticoliStorici", "IvaStorici", "PagamentiStorici", "ClientiStorici", "OperatoriStorici", "RepartiOggi", "ArticoliOggi", "IvaOggi", "PagamentiOggi", "ClientiOggi", "OperatoriOggi", "favicon.ico", "phone")) {
                                    case 0:
                                        servletResponseWrapper.SendString("OK");
                                        break;
                                    case 1:
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2((int) java.lang.Double.parseDouble(Split[2])));
                                        break;
                                    case 2:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(servletRequestWrapper, servletResponseWrapper);
                                        break;
                                    case 3:
                                        if (Split.length >= 2) {
                                            if (anywheresoftware.b4a.keywords.Common.IsNumber(Split[2])) {
                                                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                                if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, Split[2]) == -1.0d) {
                                                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("OK");
                                                    cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    servletResponseWrapper.SendString(append.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select CodWeb from versione")).toString());
                                                    break;
                                                }
                                            }
                                            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + Split[2])) > 0.0d) {
                                                if (Split.length >= 3 && Split[3].equals("1")) {
                                                    java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("OK");
                                                    cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select tPWD from tavoli where tavolo = " + Split[2])).append("_");
                                                    cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    servletResponseWrapper.SendString(append3.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select copertiWeb from tavoli where tavolo = " + Split[2])).toString());
                                                    break;
                                                } else {
                                                    java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("OK");
                                                    cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    servletResponseWrapper.SendString(append4.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select tPWD from tavoli where tavolo = " + Split[2])).toString());
                                                    break;
                                                }
                                            } else {
                                                servletResponseWrapper.SendString("Errore : Il tavolo " + Split[2] + " non è stato trovato");
                                                break;
                                            }
                                        } else {
                                            servletResponseWrapper.SendString("Errore : Il comando inviato non è corretto");
                                            break;
                                        }
                                        break;
                                    case 4:
                                        if (anywheresoftware.b4a.keywords.Common.Not(Split[3].startsWith("ReseT"))) {
                                            cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select tPWD from tavoli where tavolo = " + Split[2]).equals("")) {
                                                str = "Errore";
                                                servletResponseWrapper.SendString(str);
                                                break;
                                            }
                                        }
                                        Split[3] = Split[3].replace("ReseT", "");
                                        cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set  tPWD='" + Split[3] + "',memo='' where tavolo = " + Split[2]);
                                        str = "OK";
                                        servletResponseWrapper.SendString(str);
                                    case 5:
                                        cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set copertiWeb=" + Split[3] + " where tavolo = " + Split[2]);
                                        servletResponseWrapper.SendString("OK");
                                        break;
                                    case 6:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(Split[2]);
                                        break;
                                    case 7:
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2((int) java.lang.Double.parseDouble(Split[2]), Split[3], (int) java.lang.Double.parseDouble(Split[4])));
                                        break;
                                    case 8:
                                        anywheresoftware.b4a.keywords.Common.LogImpl("488539293", Split[1], 0);
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(Split[1]));
                                        break;
                                    case 9:
                                        if (Split.length != 2) {
                                            java.lang.String str3 = Split[2];
                                            cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (str3.equals(cassandraRisto.ital.main._v_mver)) {
                                                cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                                    servletResponseWrapper.SendString("Non è possibile collegarsi ad un client");
                                                    break;
                                                } else {
                                                    servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7());
                                                    break;
                                                }
                                            }
                                        }
                                        if (Split.length == 2) {
                                            servletResponseWrapper.SendString("Errore dati dal server");
                                            break;
                                        } else {
                                            servletResponseWrapper.SendString("Errore Versione Programma");
                                            break;
                                        }
                                    case 10:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(servletResponseWrapper, Split[2]);
                                        break;
                                    case 11:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(servletResponseWrapper);
                                        break;
                                    case 12:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletResponseWrapper);
                                        break;
                                    case 13:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletResponseWrapper);
                                        break;
                                    case 14:
                                        java.lang.String GetParameter2 = servletRequestWrapper.GetParameter("Comando");
                                        java.lang.String GetParameter3 = servletRequestWrapper.GetParameter("Esito");
                                        switch (anywheresoftware.b4a.BA.switchObjectToInt(GetParameter2.trim(), "Eroga", "Messaggio")) {
                                            case 0:
                                                if (!GetParameter3.equals("")) {
                                                    anywheresoftware.b4a.BA ba = processBA;
                                                    cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.main.getObject(), "MessaggioErogazioneInfinity", GetParameter3);
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (!GetParameter3.equals("")) {
                                                    anywheresoftware.b4a.BA ba2 = processBA;
                                                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    anywheresoftware.b4a.keywords.Common.CallSubNew3(ba2, cassandraRisto.ital.main.getObject(), "MsgboxOnlyA", GetParameter3, false);
                                                    break;
                                                }
                                                break;
                                            default:
                                                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, "Comando Infinity Manager non gestito: " + GetParameter2 + " - " + GetParameter3);
                                                break;
                                        }
                                    case 15:
                                        java.lang.String GetParameter4 = servletRequestWrapper.GetParameter("esito");
                                        java.lang.String GetParameter5 = servletRequestWrapper.GetParameter("resuduo");
                                        if (GetParameter4.contains("Livelli Bassi")) {
                                            cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                                                z3 = true;
                                                if (anywheresoftware.b4a.keywords.Common.Not(z3)) {
                                                    if (GetParameter4.contains("Errore Glory")) {
                                                        cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                        break;
                                                    }
                                                    z4 = false;
                                                    if (anywheresoftware.b4a.keywords.Common.Not(z4)) {
                                                        anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA, getObject(), "HandleGlory", GetParameter4, GetParameter5);
                                                    }
                                                }
                                                servletResponseWrapper.SendString("OK");
                                                break;
                                            }
                                        }
                                        z3 = false;
                                        if (anywheresoftware.b4a.keywords.Common.Not(z3)) {
                                        }
                                        servletResponseWrapper.SendString("OK");
                                    case 16:
                                        java.lang.String str4 = Split[4];
                                        cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!str4.equals(cassandraRisto.ital.main._v_mver)) {
                                            servletResponseWrapper.SendString("Errore Versione Programma");
                                            break;
                                        } else {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(servletResponseWrapper, Split[1], Split[3]);
                                            break;
                                        }
                                    case 17:
                                        java.lang.String str5 = Split[4];
                                        cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!str5.equals(cassandraRisto.ital.main._v_mver)) {
                                            servletResponseWrapper.SendString("Errore Versione Programma");
                                            break;
                                        } else {
                                            cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo =" + Split[1])) > 0.0d) {
                                                cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                int parseDouble3 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo =" + Split[1]));
                                                if (parseDouble3 == 0) {
                                                    servletResponseWrapper.SendString("Nessuno");
                                                    break;
                                                } else {
                                                    cassandraRisto.ital.main mainVar25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    servletResponseWrapper.SendString(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select operatore from headmov where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble3)));
                                                    break;
                                                }
                                            } else {
                                                servletResponseWrapper.SendString("Errore Tavolo non trovato");
                                                break;
                                            }
                                        }
                                    case 18:
                                        java.lang.String str6 = Split[3];
                                        cassandraRisto.ital.main mainVar26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!str6.equals(cassandraRisto.ital.main._v_mver)) {
                                            servletResponseWrapper.SendString("Errore Versione Programma");
                                            break;
                                        } else {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(servletResponseWrapper, Split[1], Split[2]);
                                            break;
                                        }
                                    case 19:
                                        cassandraRisto.ital.main mainVar27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                                            java.lang.String str7 = Split[3];
                                            cassandraRisto.ital.main mainVar28 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (str7.equals(cassandraRisto.ital.main._v_mver) && Split.length == 4 && java.lang.Double.parseDouble(Split[1]) >= 1.0d) {
                                                cassandraRisto.ital.main mainVar29 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized()) {
                                                    double parseDouble4 = java.lang.Double.parseDouble(Split[1]);
                                                    cassandraRisto.ital.main mainVar30 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    break;
                                                }
                                                cassandraRisto.ital.main mainVar31 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setPosition((int) (java.lang.Double.parseDouble(Split[1]) - 1.0d));
                                                cassandraRisto.ital.main mainVar32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetString("IP").trim().equals(servletRequestWrapper.getRemoteAddress())) {
                                                    servletResponseWrapper.SendString("Errore .... Il terminale " + Split[1] + " risulta avere un indirizzo IP diverso.");
                                                    break;
                                                } else {
                                                    cassandraRisto.ital.main mainVar33 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetInt("stato") > 1 || Split[2].equals(anywheresoftware.b4a.BA.NumberToString(1))) {
                                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletResponseWrapper, Split[1]);
                                                        cassandraRisto.ital.main mainVar34 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clients set stato =1 where codice = " + Split[1]);
                                                        cassandraRisto.ital.main mainVar35 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                                        cassandraRisto.ital.main mainVar36 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clients order by codice"));
                                                        break;
                                                    } else {
                                                        cassandraRisto.ital.main mainVar37 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetInt("stato") == 0) {
                                                            servletResponseWrapper.SendString("Errore .... Il terminale non risulta essere abilitato sul server.");
                                                            break;
                                                        } else {
                                                            servletResponseWrapper.SendString("OK");
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        java.lang.String str8 = Split[3];
                                        cassandraRisto.ital.main mainVar38 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!str8.equals(cassandraRisto.ital.main._v_mver)) {
                                            servletResponseWrapper.SendString("Errore Versione Programma");
                                        } else {
                                            cassandraRisto.ital.main mainVar39 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
                                                servletResponseWrapper.SendString("Errore: Il server risulta essere in fase di avvio");
                                            } else {
                                                cassandraRisto.ital.main mainVar40 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized()) {
                                                    double parseDouble5 = java.lang.Double.parseDouble(Split[1]);
                                                    cassandraRisto.ital.main mainVar41 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    if (parseDouble5 > cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getRowCount()) {
                                                        servletResponseWrapper.SendString("Errore: Il codice del terminale non è valido");
                                                    }
                                                }
                                                servletResponseWrapper.SendString("Errore Struttura dati inviati al server");
                                            }
                                        }
                                        cassandraRisto.ital.main mainVar42 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                                            cassandraRisto.ital.main mainVar43 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized()) {
                                                cassandraRisto.ital.main mainVar44 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clients set stato =3 where codice = " + Split[1]);
                                                cassandraRisto.ital.main mainVar45 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                                cassandraRisto.ital.main mainVar46 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clients order by codice"));
                                                break;
                                            }
                                        }
                                        break;
                                    case 20:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(servletResponseWrapper, servletRequestWrapper.GetParameter("query"));
                                        break;
                                    case 21:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletResponseWrapper, Split[1]);
                                        break;
                                    case 22:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(servletRequestWrapper, servletResponseWrapper);
                                        break;
                                    case 23:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(servletRequestWrapper, servletResponseWrapper, Split[1]);
                                        break;
                                    case 24:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(servletRequestWrapper, servletResponseWrapper);
                                        break;
                                    case 25:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletRequestWrapper, servletResponseWrapper);
                                        break;
                                    case 26:
                                        if (Split.length < 2) {
                                            servletResponseWrapper.SendString("Errore di comunicazione con il server...");
                                            break;
                                        } else {
                                            java.lang.String str9 = Split[3];
                                            if (Split[2].startsWith("get")) {
                                                if (Split[2].endsWith("punti")) {
                                                    java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("cliente_").append(Split[2]).append("_").append(str9).append("_");
                                                    cassandraRisto.ital.main mainVar47 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    servletResponseWrapper.SendString(append5.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select punti from clienti where codice = '" + str9 + "'")).toString());
                                                    break;
                                                } else {
                                                    java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("cliente_").append(Split[2]).append("_").append(str9).append("_");
                                                    cassandraRisto.ital.main mainVar48 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    servletResponseWrapper.SendString(append6.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select prep from clienti where codice = '" + str9 + "'")).toString());
                                                    break;
                                                }
                                            } else if (Split[2].startsWith("set")) {
                                                if (Split[2].endsWith("punti")) {
                                                    cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                                    int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int) cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, Split[4]);
                                                    cassandraRisto.ital.main mainVar49 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clienti set punti = punti + " + anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) + " where codice = '" + str9 + "'");
                                                    java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("cliente_").append(Split[2]).append("_").append(str9).append("_");
                                                    cassandraRisto.ital.main mainVar50 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    servletResponseWrapper.SendString(append7.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select punti from clienti where codice = '" + str9 + "'")).toString());
                                                    break;
                                                } else {
                                                    double parseDouble6 = java.lang.Double.parseDouble(Split[4]);
                                                    cassandraRisto.ital.main mainVar51 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update clienti set prep = prep + " + anywheresoftware.b4a.BA.NumberToString(parseDouble6) + " where codice = '" + str9 + "'");
                                                    java.lang.StringBuilder append8 = new java.lang.StringBuilder().append("cliente_").append(Split[2]).append("_").append(str9).append("_");
                                                    cassandraRisto.ital.main mainVar52 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    servletResponseWrapper.SendString(append8.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select prep from clienti where codice = '" + str9 + "'")).toString());
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 27:
                                        java.lang.String str10 = Split[1];
                                        cassandraRisto.ital.main mainVar53 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!str10.equals(cassandraRisto.ital.main._v_mver)) {
                                            servletResponseWrapper.SendString("Errore Versione Programma");
                                            break;
                                        } else {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletResponseWrapper, Split[2]);
                                            break;
                                        }
                                    case 28:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletResponseWrapper, Split[1], false);
                                        break;
                                    case 29:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletResponseWrapper, Split[1], true);
                                        break;
                                    case 30:
                                        if (Split.length != 2) {
                                            java.lang.String str11 = Split[2];
                                            cassandraRisto.ital.main mainVar54 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (str11.equals(cassandraRisto.ital.main._v_mver)) {
                                                servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(Split[1]));
                                                break;
                                            }
                                        }
                                        servletResponseWrapper.SendString("Errore Versione Programma");
                                        break;
                                    case 31:
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4());
                                        break;
                                    case 32:
                                        try {
                                            cassandraRisto.ital.main mainVar55 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set ricconto=1 where tavolo = " + Split[1]);
                                        } catch (java.lang.Exception e2) {
                                            processBA.setLastException(e2);
                                            servletResponseWrapper.SendString("Errore");
                                        }
                                        cassandraRisto.ital.main mainVar56 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                                            cassandraRisto.ital.main mainVar57 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            break;
                                        }
                                        cassandraRisto.ital.main mainVar58 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                            anywheresoftware.b4a.keywords.Common.CallSubNew2(processBA, "Main", "ShowMsgConto", "Richiesto il conto dal tavolo " + Split[1]);
                                            int[] iArr = {(int) java.lang.Double.parseDouble(Split[1])};
                                            java.lang.String str12 = Split[2];
                                            anywheresoftware.b4a.BA ba3 = processBA;
                                            cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba3, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", iArr, str12);
                                            servletResponseWrapper.SendString("Ok");
                                            break;
                                        }
                                        cassandraRisto.ital.main mainVar59 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.StringBuilder append9 = new java.lang.StringBuilder().append(" and tipo =");
                                        cassandraRisto.ital.main mainVar60 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = append9.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(Split[1]).append(" ").toString();
                                        anywheresoftware.b4a.BA ba4 = processBA;
                                        cassandraRisto.ital.main mainVar61 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba4, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
                                        cassandraRisto.ital.main mainVar62 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
                                        int[] iArr2 = {(int) java.lang.Double.parseDouble(Split[1])};
                                        java.lang.String str122 = Split[2];
                                        anywheresoftware.b4a.BA ba32 = processBA;
                                        cassandraRisto.ital.httpclient httpclientVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba32, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", iArr2, str122);
                                        servletResponseWrapper.SendString("Ok");
                                    case 33:
                                        try {
                                            cassandraRisto.ital.main mainVar63 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set ricconto=1 where tavolo = " + Split[1]);
                                        } catch (java.lang.Exception e3) {
                                            processBA.setLastException(e3);
                                            servletResponseWrapper.SendString("Errore");
                                        }
                                        cassandraRisto.ital.main mainVar64 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                                            cassandraRisto.ital.main mainVar65 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            break;
                                        }
                                        cassandraRisto.ital.main mainVar66 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                            anywheresoftware.b4a.keywords.Common.CallSubNew2(processBA, "Main", "ShowMsgConto", "Richiesto il conto dal tavolo " + Split[1]);
                                            cassandraRisto.ital.main mainVar67 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                                                int[] iArr3 = {(int) java.lang.Double.parseDouble(Split[1])};
                                                anywheresoftware.b4a.BA ba5 = processBA;
                                                cassandraRisto.ital.httpclient httpclientVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                                java.lang.Class<?> object = cassandraRisto.ital.httpclient.getObject();
                                                cassandraRisto.ital.main mainVar68 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                anywheresoftware.b4a.keywords.Common.CallSubNew3(ba5, object, "SendVariazioneTavoloAiClient", iArr3, cassandraRisto.ital.main._v_numcassa);
                                            }
                                            servletResponseWrapper.SendString("Ok");
                                            break;
                                        }
                                        cassandraRisto.ital.main mainVar69 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.StringBuilder append10 = new java.lang.StringBuilder().append(" and tipo =");
                                        cassandraRisto.ital.main mainVar70 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = append10.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(Split[1]).append(" ").toString();
                                        anywheresoftware.b4a.BA ba6 = processBA;
                                        cassandraRisto.ital.main mainVar71 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba6, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
                                        cassandraRisto.ital.main mainVar72 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
                                        cassandraRisto.ital.main mainVar672 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                                        }
                                        servletResponseWrapper.SendString("Ok");
                                    case 34:
                                        servletResponseWrapper.SendString("Ok");
                                        anywheresoftware.b4a.BA ba7 = processBA;
                                        cassandraRisto.ital.main mainVar73 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba7, cassandraRisto.ital.main.getObject(), "UpdTabStampe");
                                        break;
                                    case 35:
                                        servletResponseWrapper.SendString("Ok");
                                        cassandraRisto.ital.main mainVar74 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
                                        break;
                                    case 36:
                                        try {
                                            cassandraRisto.ital.main mainVar75 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", Split[1]) + " and inmodifica=0 and lock=1").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                                servletResponseWrapper.SendString("Non è possibile sbloccare il tavolo");
                                                break;
                                            } else {
                                                cassandraRisto.ital.main mainVar76 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set inmodifica=0,lock=0,unlocktable=0,stampap=0 where tavolo = " + Split[1]);
                                                cassandraRisto.ital.main mainVar77 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                                                    cassandraRisto.ital.main mainVar78 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    break;
                                                }
                                                cassandraRisto.ital.main mainVar79 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                break;
                                            }
                                        } catch (java.lang.Exception e4) {
                                            processBA.setLastException(e4);
                                            servletResponseWrapper.SendString("Errore");
                                            break;
                                        }
                                    case 37:
                                        cassandraRisto.ital.main mainVar80 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._v_asportoora) {
                                            servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4());
                                            break;
                                        } else {
                                            servletResponseWrapper.SendString("disabilitato");
                                            break;
                                        }
                                    case 38:
                                        java.lang.String GetUploadedFile = servletRequestWrapper.GetUploadedFile("upfile");
                                        servletResponseWrapper.SendString("OK");
                                        anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA, getObject(), "HandleUploadBila", GetUploadedFile);
                                        break;
                                    case 39:
                                        cassandraRisto.ital.main mainVar81 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._v_ipserver.equals("")) {
                                            servletResponseWrapper.SendString("Impostare l'indirizzo IP sul Client ");
                                            break;
                                        } else {
                                            servletResponseWrapper.SendString("");
                                            anywheresoftware.b4a.BA ba8 = processBA;
                                            cassandraRisto.ital.httpclient httpclientVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                            anywheresoftware.b4a.keywords.Common.CallSubNew2(ba8, cassandraRisto.ital.httpclient.getObject(), "GetVariazioniDaClient", "getvardaclient");
                                            break;
                                        }
                                    case 40:
                                        servletResponseWrapper.SendString("ok");
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(Split);
                                        break;
                                    case 41:
                                        servletResponseWrapper.SendString(_spostatavolo(Split[1], Split[2], Split[3]));
                                        break;
                                    case 42:
                                        servletResponseWrapper.SendString(_uniscitavolo(Split[1], Split[2], Split[3]));
                                        break;
                                    case 43:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(servletRequestWrapper, servletResponseWrapper);
                                        break;
                                    case 44:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(servletRequestWrapper, servletResponseWrapper);
                                        break;
                                    case 45:
                                        if (Split.length != 1) {
                                            java.lang.String str13 = Split[1];
                                            cassandraRisto.ital.main mainVar82 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (str13.equals(cassandraRisto.ital.main._v_mver)) {
                                                cassandraRisto.ital.main mainVar83 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                                    servletResponseWrapper.SendString("Non è possibile collegarsi ad un client");
                                                    break;
                                                } else {
                                                    servletResponseWrapper.SendString("okapri");
                                                    break;
                                                }
                                            }
                                        }
                                        servletResponseWrapper.SendString("Errore Versione Programma");
                                        break;
                                    case 46:
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(servletResponseWrapper);
                                        break;
                                    case 47:
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(Split[1]));
                                        break;
                                    case 48:
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4((int) java.lang.Double.parseDouble(Split[1])));
                                        break;
                                    case 49:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, true);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.equals("")) {
                                            java.lang.String GetParameter6 = servletRequestWrapper.GetParameter("rpt");
                                            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                                            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                                            java.lang.String GetText = anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "StoriciFiltro.htm");
                                            cassandraRisto.ital.main mainVar84 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = GetText.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", GetParameter6).replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                                        break;
                                    case 50:
                                    case 51:
                                    case 52:
                                        servletResponseWrapper.SetContentType("text/html");
                                        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                                        anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                                        java.lang.String GetText2 = anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "Login.htm");
                                        cassandraRisto.ital.main mainVar85 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        servletResponseWrapper.SendString(GetText2.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente));
                                        break;
                                    case 53:
                                        cassandraRisto.ital.main mainVar86 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (!cassandraRisto.ital.main._v_musers.equals("")) {
                                            cassandraRisto.ital.main mainVar87 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            if (!cassandraRisto.ital.main._v_mpwds.equals("")) {
                                                java.lang.String GetParameter7 = servletRequestWrapper.GetParameter("username");
                                                java.lang.String GetParameter8 = servletRequestWrapper.GetParameter("password");
                                                cassandraRisto.ital.main mainVar88 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                if (GetParameter7.equals(cassandraRisto.ital.main._v_musers)) {
                                                    cassandraRisto.ital.main mainVar89 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    if (GetParameter8.equals(cassandraRisto.ital.main._v_mpwds)) {
                                                        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                                        java.lang.String NumberToString = anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA));
                                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Put(NumberToString, java.lang.Integer.valueOf(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getSize()));
                                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                        anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                                                        anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                                                        java.lang.StringBuilder append11 = sb2.append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "HeadStampe"));
                                                        anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                                                        anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                                                        java.lang.String replace2 = append11.append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "FootStampe")).toString().replace("%FILTRO%", "Selezionare una stampa dall'elenco");
                                                        cassandraRisto.ital.main mainVar90 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                        sb = replace2.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", "").replace("%TICK%", NumberToString);
                                                        servletResponseWrapper.SetContentType("text/html");
                                                        servletResponseWrapper.SendString(sb);
                                                        break;
                                                    }
                                                }
                                                java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("<DIV align=center><B><font size='6' color='red'>Nome utente o Password non corretti ...</font></B></DIV>");
                                                anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                                                anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
                                                java.lang.String GetText3 = anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "Login.htm");
                                                cassandraRisto.ital.main mainVar91 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                sb = append12.append(GetText3.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente)).toString();
                                                servletResponseWrapper.SetContentType("text/html");
                                                servletResponseWrapper.SendString(sb);
                                            }
                                        }
                                        java.lang.StringBuilder append13 = new java.lang.StringBuilder().append("<DIV align=center><B><font size='6' color='red'>Configurare UserName e Password per attivare il sistema ...</font></B></DIV>");
                                        anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
                                        anywheresoftware.b4a.objects.streams.File file12 = anywheresoftware.b4a.keywords.Common.File;
                                        java.lang.String GetText4 = anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "Login.htm");
                                        cassandraRisto.ital.main mainVar92 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        sb = append13.append(GetText4.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente)).toString();
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(sb);
                                    case 54:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv62 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, true);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv62.equals("")) {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv62 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletRequestWrapper, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv62, Split[0], "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") Is Null Then 0 Else sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") End  from Venduto where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg'");
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv62);
                                        break;
                                    case 55:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv63 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, true);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv63.equals("")) {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv63 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletRequestWrapper, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv63, Split[0], "Select  case when sum(importo+importo2) Is Null Then 0 Else sum(importo+importo2) End  from Venduto where sospeso =0 and brep = 0", "Select  case when sum(qta) Is Null Then 0 Else sum(qta) End  from Venduto where sospeso =0 And brep = 0\n\t\t\t\t\t\t\t\t\t\t\t\tAnd lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' \n \t\t\t\t\t\t\t\t\t\t\t\tAnd lower(substr(venduto.codice,1,2))<>'vv' ");
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv63);
                                        break;
                                    case 56:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv64 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, true);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv64.equals("")) {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv64 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletRequestWrapper, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv64, Split[0], "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") Is Null Then 0 Else sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") End  from Venduto where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg'");
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv64);
                                        break;
                                    case 57:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv65 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, true);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv65.equals("")) {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv65 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletRequestWrapper, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv65, Split[0], "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from CausaliPagamenti where sospeso =0 ", "Select  case when sum(qta) Is Null Then 0 Else sum(qta) End  from CausaliPagamenti where sospeso =0 ");
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv65);
                                        break;
                                    case 58:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv66 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, true);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv66.equals("")) {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv66 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletRequestWrapper, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv66, Split[0], "Select  case when sum(totale) Is Null Then 0 Else sum(totale) End  from headmov where sospeso =0 ", "Select  count(*)  from headmov where sospeso =0 ");
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv66);
                                        break;
                                    case 59:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv67 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, true);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv67.equals("")) {
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv67 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(servletRequestWrapper, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv67, Split[0], "Select  case when sum(totale) Is Null Then 0 Else sum(totale) End  from headmov where sospeso =0 ", "Select  count(*)  from headmov where sospeso =0 ");
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv67);
                                        break;
                                    case 60:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv68 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, false);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv68.equals("")) {
                                            cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                            anywheresoftware.b4a.BA ba9 = processBA;
                                            cassandraRisto.ital.main mainVar93 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            java.lang.String replace3 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba9, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select  reparto as Codice,max(reparti.descrizione) as descrizione,sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join reparti on reparti.codice = venduto.reparto  where sospeso =0 and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg' group by reparto order by reparto ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") Is Null Then 0 Else sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") End  from Venduto where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg'").replace("%FILTRO%", "");
                                            cassandraRisto.ital.main mainVar94 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv68 = replace3.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", Split[0]).replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv68);
                                        break;
                                    case 61:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv69 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, false);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv69.equals("")) {
                                            cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                            anywheresoftware.b4a.BA ba10 = processBA;
                                            cassandraRisto.ital.main mainVar95 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            java.lang.String replace4 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba10, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select  codint as Codice,descrizione,sum(qta) As Qta,sum(importo+importo2) as Importo ,\tsum(prezzov*qta) - sum(importo) As Sconto  from Venduto where sospeso =0 And brep = 0\n\t\t\t\t\t\t\t\t\t\t\t\tAnd lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' \n \t\t\t\t\t\t\t\t\t\t\t\tAnd lower(substr(venduto.codice,1,2))<>'vv'  group by codint,descrizione order by Qta desc limit 1000 ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(qta) Is Null Then 0 Else sum(qta) End  from Venduto where sospeso =0 And brep = 0\n\t\t\t\t\t\t\t\t\t\t\t\tAnd lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' \n \t\t\t\t\t\t\t\t\t\t\t\tAnd lower(substr(venduto.codice,1,2))<>'vv' ").replace("%FILTRO%", "");
                                            cassandraRisto.ital.main mainVar96 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv69 = replace4.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", "Articoli più venduti (Massimo 1000 righe)").replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv69);
                                        break;
                                    case 62:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv610 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, false);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv610.equals("")) {
                                            cassandraRisto.ital.dbutil dbutilVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                            anywheresoftware.b4a.BA ba11 = processBA;
                                            cassandraRisto.ital.main mainVar97 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            java.lang.String replace5 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba11, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select  iva as Codice,max(iva.descrizione) as descrizione,sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join iva on iva.codice = venduto.iva  where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' group by iva order by iva ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") Is Null Then 0 Else sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") End  from Venduto where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg'").replace("%FILTRO%", "");
                                            cassandraRisto.ital.main mainVar98 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv610 = replace5.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", Split[0]).replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv610);
                                        break;
                                    case 63:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv611 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, false);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv611.equals("")) {
                                            cassandraRisto.ital.dbutil dbutilVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                            anywheresoftware.b4a.BA ba12 = processBA;
                                            cassandraRisto.ital.main mainVar99 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            java.lang.String replace6 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba12, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select  Codice,max(descrizione) as descrizione,sum(qta) As Qta,sum(importo) as Importo  from CausaliPagamenti  where sospeso =0  group by codice order by codice", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from CausaliPagamenti where sospeso =0 ", "Select  case when sum(qta) Is Null Then 0 Else sum(qta) End  from CausaliPagamenti where sospeso =0 ").replace("%FILTRO%", "");
                                            cassandraRisto.ital.main mainVar100 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv611 = replace6.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", Split[0]).replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv611);
                                        break;
                                    case 64:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv612 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, false);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv612.equals("")) {
                                            cassandraRisto.ital.dbutil dbutilVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                            anywheresoftware.b4a.BA ba13 = processBA;
                                            cassandraRisto.ital.main mainVar101 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            java.lang.String replace7 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba13, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select  cliente as Codice,max(clides) as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov  where sospeso =0  group by codice order by codice ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, "Select  case when sum(totale) Is Null Then 0 Else sum(totale) End  from headmov where sospeso =0 ", "Select  count(*)  from headmov where sospeso =0 ").replace("%FILTRO%", "");
                                            cassandraRisto.ital.main mainVar102 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv612 = replace7.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", Split[0]).replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv612);
                                        break;
                                    case 65:
                                        java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv613 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(servletRequestWrapper, false);
                                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv613.equals("")) {
                                            cassandraRisto.ital.dbutil dbutilVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                            anywheresoftware.b4a.BA ba14 = processBA;
                                            cassandraRisto.ital.main mainVar103 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            java.lang.String replace8 = cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba14, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Select  operatore as Codice,opdes as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov  where sospeso =0  group by codice,opdes order by codice ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, "Select  case when sum(totale) Is Null Then 0 Else sum(totale) End  from headmov where sospeso =0 ", "Select  count(*)  from headmov where sospeso =0 ").replace("%FILTRO%", "");
                                            cassandraRisto.ital.main mainVar104 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv613 = replace8.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", Split[0]).replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                                        }
                                        servletResponseWrapper.SetContentType("text/html");
                                        servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv613);
                                        break;
                                    case 66:
                                        servletResponseWrapper.SendString("");
                                        break;
                                    case 67:
                                        servletResponseWrapper.SendString("ok");
                                        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        if (cassandraRisto.ital.mod1._vvv7.equals("Main")) {
                                            anywheresoftware.b4a.keywords.Common.CallSubNew3(processBA, "Main", "GestisciTelefonata", Split[1], true);
                                            break;
                                        } else {
                                            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            cassandraRisto.ital.mod1._vvvvvvvvv5(processBA, Split[1], true);
                                            break;
                                        }
                                    default:
                                        if (anywheresoftware.b4a.keywords.Common.IsNumber(Split[0])) {
                                            servletResponseWrapper.SendString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((int) java.lang.Double.parseDouble(Split[0]), Split[1], Split[2]));
                                            break;
                                        } else {
                                            servletResponseWrapper.SendString("Errore ");
                                            break;
                                        }
                                }
                                processBA.setLastException(e);
                                cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                                servletResponseWrapper.setStatus(500);
                                servletResponseWrapper.SendString("Errore: " + anywheresoftware.b4a.BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Unlock();
                                return "";
                            }
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Unlock();
                            return "";
                        }
                    }
                    z2 = false;
                    if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
                    }
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Unlock();
                    return "";
                }
            }
        }
        z = false;
        if (z) {
        }
        z2 = false;
        if (anywheresoftware.b4a.keywords.Common.Not(z2)) {
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Unlock();
        return "";
    }

    public static java.lang.String _service_create() throws java.lang.Exception {
        _server.Initialize(processBA, "Server");
        _server.Start(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize();
        anywheresoftware.b4a.objects.NotificationWrapper notificationWrapper = new anywheresoftware.b4a.objects.NotificationWrapper();
        notificationWrapper.Initialize();
        notificationWrapper.setIcon("icon");
        anywheresoftware.b4a.BA ba = processBA;
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Http Server in esecuzione");
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        notificationWrapper.SetInfoNew(ba, ObjectToCharSequence, ObjectToCharSequence2, cassandraRisto.ital.main.getObject());
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize();
        mostCurrent._service.StartForeground(1, (android.app.Notification) notificationWrapper.getObject());
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize(true);
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize(processBA, "udpCallerID", 3520, 8000);
        }
        _v7.Initialize(processBA, "Timer1", 15000L);
        _v7.setEnabled(true);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(processBA, "TimerUpdStatoTavoli", 50000L);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setEnabled(true);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(processBA, "TimerScontrinoAuto", 1000L);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(false);
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.BA ba2 = processBA;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba2, anywheresoftware.b4a.objects.streams.File.ReadString(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "01-01-StrutturaRicevuta.txt"), "nf0èc2m3c3f xc");
        return "";
    }

    public static java.lang.String _service_destroy() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _service_start(anywheresoftware.b4a.objects.IntentWrapper intentWrapper) throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _service_taskremoved() throws java.lang.Exception {
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0598, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05a2, code lost:
    
        if (r3 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x05a4, code lost:
    
        r3 = cassandraRisto.ital.starter.processBA;
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r3, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05bf, code lost:
    
        r2.Close();
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x05c8, code lost:
    
        if (cassandraRisto.ital.main._v_stampasposta == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x05ca, code lost:
    
        r2 = "Tavolo " + r17 + " si sposta sul " + r18;
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x05f1, code lost:
    
        if (cassandraRisto.ital.main._v_stampasala == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05f3, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r2 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA, r17);
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r2 = r2 + " si sposta su " + cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x062d, code lost:
    
        if (java.lang.Double.parseDouble(r19) < 10000.0d) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x062f, code lost:
    
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA, true, false, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return "OK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x06c7, code lost:
    
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r3 = new java.lang.StringBuilder().append(" and tipo =");
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r3.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(r17).append(" ").toString();
        r3 = cassandraRisto.ital.starter.processBA;
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r3, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r3 = new java.lang.StringBuilder().append(" and tipo =");
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r3.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(r18).append(" ").toString();
        r3 = cassandraRisto.ital.starter.processBA;
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r3, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x05a0, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[Catch: Exception -> 0x026f, TryCatch #0 {Exception -> 0x026f, blocks: (B:3:0x000c, B:5:0x0021, B:8:0x002b, B:10:0x0040, B:13:0x004a, B:17:0x007d, B:21:0x00aa, B:23:0x00b0, B:27:0x00df, B:31:0x00ef, B:33:0x011f, B:35:0x0161, B:39:0x01b5, B:41:0x01ec, B:43:0x0201, B:50:0x0256, B:53:0x028c, B:54:0x0328, B:56:0x049f, B:58:0x04c8, B:60:0x0509, B:62:0x051c, B:64:0x0560, B:68:0x0572, B:69:0x0586, B:71:0x0590, B:74:0x05a4, B:75:0x05bf, B:77:0x05ca, B:79:0x05f3, B:80:0x0622, B:82:0x062f, B:86:0x06c7, B:87:0x059a, B:89:0x063e, B:91:0x0648, B:93:0x0670, B:94:0x069a, B:45:0x0204), top: B:2:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[Catch: Exception -> 0x026f, TryCatch #0 {Exception -> 0x026f, blocks: (B:3:0x000c, B:5:0x0021, B:8:0x002b, B:10:0x0040, B:13:0x004a, B:17:0x007d, B:21:0x00aa, B:23:0x00b0, B:27:0x00df, B:31:0x00ef, B:33:0x011f, B:35:0x0161, B:39:0x01b5, B:41:0x01ec, B:43:0x0201, B:50:0x0256, B:53:0x028c, B:54:0x0328, B:56:0x049f, B:58:0x04c8, B:60:0x0509, B:62:0x051c, B:64:0x0560, B:68:0x0572, B:69:0x0586, B:71:0x0590, B:74:0x05a4, B:75:0x05bf, B:77:0x05ca, B:79:0x05f3, B:80:0x0622, B:82:0x062f, B:86:0x06c7, B:87:0x059a, B:89:0x063e, B:91:0x0648, B:93:0x0670, B:94:0x069a, B:45:0x0204), top: B:2:0x000c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _spostatavolo(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        boolean z;
        boolean z2;
        java.lang.String str4;
        try {
            cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, str3) < 10000.0d) {
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                    z = true;
                    cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, str3) > 10000.0d) {
                        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                            z2 = true;
                            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + str2).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                return "TAVOLO NON TROVATO";
                            }
                            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where lock=0 and inmodifica=0 and tavolo = " + str2).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                return "TAVOLO BLOCCATO";
                            }
                            if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(str3.trim()).toString(), "venduto.csv")) {
                                    return "TAVOLO NON ANCORA ELABORATO DAL SERVER";
                                }
                            }
                            if (str2.equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                return "TAVOLO NON VALIDO";
                            }
                            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from tavoli where tavolo = " + str2 + " and inmodifica =0 and lock=0").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                java.lang.StringBuilder append = new java.lang.StringBuilder().append("select count(*) from pagine where pagina >=10 and pagina <100 and tipo = ");
                                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (!sql.ExecQuerySingleResult(append.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and  valore = ").append(str2).toString()).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                    cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    long parseDouble = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " + str));
                                    cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    long parseDouble2 = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " + str2));
                                    if (parseDouble > 0 && parseDouble2 > 0) {
                                        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                        cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select qtacondecimali,totcre,chiave from venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble)));
                                        if (cursorWrapper2.getRowCount() > 0) {
                                            long parseDouble3 = (long) (java.lang.Double.parseDouble(str) * 10000.0d);
                                            int rowCount = cursorWrapper2.getRowCount() - 1;
                                            for (int i = 0; i <= rowCount; i++) {
                                                cursorWrapper2.setPosition(i);
                                                try {
                                                    int GetInt = (int) (cursorWrapper2.GetInt("totcre") + parseDouble3);
                                                    cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update venduto set qtacondecimali= " + anywheresoftware.b4a.BA.NumberToString(GetInt) + ",totcre='" + anywheresoftware.b4a.BA.NumberToString(GetInt) + "' where chiave=" + anywheresoftware.b4a.BA.NumberToString(cursorWrapper2.GetLong("chiave")));
                                                } catch (java.lang.Exception e) {
                                                    processBA.setLastException(e);
                                                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                                                }
                                            }
                                        }
                                        cursorWrapper2.Close();
                                        cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update venduto set nmov =  " + anywheresoftware.b4a.BA.NumberToString(parseDouble) + " where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble2));
                                        cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select sum(importo) from venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble));
                                        cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set importo = " + ExecQuerySingleResult + " where tavolo = " + str);
                                        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble2));
                                    }
                                    new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                    cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from tavoli where tavolo = " + str));
                                    cursorWrapper4.setPosition(0);
                                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    java.lang.String ExecQuerySingleResult2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " + cursorWrapper4.GetString("rifheadmov"));
                                    cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set uscita=" + cursorWrapper4.GetString("uscita") + ",stampap=" + cursorWrapper4.GetString("stampap") + ",ricconto=" + cursorWrapper4.GetString("ricconto") + ",rifheadmov=" + cursorWrapper4.GetString("rifheadmov") + ",coperti=" + ExecQuerySingleResult2 + ",addturni=" + cursorWrapper4.GetString("addturni") + ",importo = " + cursorWrapper4.GetString("importo").replace(",", ".") + ",unlocktable = " + cursorWrapper4.GetString("unlocktable") + " where tavolo = " + str2);
                                    cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set timein=(select timein from tavoli where tavolo = " + str + ") where tavolo = " + str2);
                                    cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set timelast=(select timelast from tavoli where tavolo = " + str + ") where tavolo = " + str2);
                                    cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set tPWD=random(),uscita=0,rifheadmov=0,coperti=0,addturni=0,importo =0,unlocktable = 0,ricconto=0,stampap=0 where tavolo = " + str);
                                    boolean z3 = false;
                                    cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                                        cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where unlocktable =" + str)) > 0.0d) {
                                            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                            cassandraRisto.ital.main mainVar25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper6 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select tavolo from tavoli where unlocktable =" + str));
                                            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                                            list.Initialize();
                                            int rowCount2 = cursorWrapper6.getRowCount() - 1;
                                            for (int i2 = 0; i2 <= rowCount2; i2++) {
                                                cursorWrapper6.setPosition(i2);
                                                list.Add(java.lang.Integer.valueOf(cursorWrapper6.GetInt("tavolo")));
                                            }
                                            list.Add(str);
                                            list.Add(str2);
                                            cassandraRisto.ital.main mainVar26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set unlocktable=" + str2 + " where unlocktable = " + str);
                                            int[] iArr = new int[list.getSize()];
                                            int size = list.getSize() - 1;
                                            for (int i3 = 0; i3 <= size; i3++) {
                                                iArr[i3] = (int) anywheresoftware.b4a.BA.ObjectToNumber(list.Get(i3));
                                            }
                                            if (z) {
                                                str4 = str3;
                                            } else {
                                                cassandraRisto.ital.main mainVar27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                                str4 = cassandraRisto.ital.main._v_numcassa;
                                            }
                                            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(str4);
                                            anywheresoftware.b4a.BA ba = processBA;
                                            cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", iArr, ObjectToString);
                                            z3 = true;
                                        } else if (z) {
                                            int[] iArr2 = {(int) java.lang.Double.parseDouble(str), (int) java.lang.Double.parseDouble(str2)};
                                            anywheresoftware.b4a.BA ba2 = processBA;
                                            cassandraRisto.ital.httpclient httpclientVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba2, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", iArr2, str3);
                                        } else if (z2) {
                                            int[] iArr3 = {(int) java.lang.Double.parseDouble(str), (int) java.lang.Double.parseDouble(str2)};
                                            anywheresoftware.b4a.BA ba3 = processBA;
                                            cassandraRisto.ital.httpclient httpclientVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                            java.lang.Class<?> object = cassandraRisto.ital.httpclient.getObject();
                                            cassandraRisto.ital.main mainVar28 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba3, object, "SendVariazioneTavoloAiClient", iArr3, cassandraRisto.ital.main._v_numcassa);
                                        }
                                    } else {
                                        cassandraRisto.ital.main mainVar29 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set unlocktable = " + str2 + " where unlocktable = " + str);
                                    }
                                    cassandraRisto.ital.main mainVar30 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                                        cassandraRisto.ital.main mainVar31 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    }
                                    cassandraRisto.ital.main mainVar32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                }
                            }
                            return "TAVOLO NON DISPONIBILE";
                        }
                    }
                    z2 = false;
                    cassandraRisto.ital.main mainVar33 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + str2).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                    }
                }
            }
            z = false;
            cassandraRisto.ital.modfunstr modfunstrVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, str3) > 10000.0d) {
            }
            z2 = false;
            cassandraRisto.ital.main mainVar332 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + str2).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
            }
        } catch (java.lang.Exception e2) {
            processBA.setLastException(e2);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static void _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str) throws java.lang.Exception {
        new cassandraRisto.ital.starter.ResumableSub_StampaRiepilogoGestioneGlory(null, str).resume(processBA, null);
    }

    public static class ResumableSub_StampaRiepilogoGestioneGlory extends anywheresoftware.b4a.BA.ResumableSub {
        java.lang.String _stringainventario;
        int limit12;
        int limit25;
        int limit40;
        int limit48;
        int limit64;
        int limit85;
        cassandraRisto.ital.starter parent;
        int step12;
        int step25;
        int step40;
        int step48;
        int step64;
        int step85;
        java.lang.String _nomesub = "";
        anywheresoftware.b4a.objects.collections.Map _inventaridispositivi = null;
        java.lang.String[] _inventaritemp = null;
        java.lang.String[] _dispositivotemp = null;
        int _i = 0;
        int _qtatotale = 0;
        double _totalegenerale = 0.0d;
        anywheresoftware.b4a.objects.collections.Map _strutturainventario = null;
        int _numerodispositivo = 0;
        anywheresoftware.b4a.objects.collections.Map _strutturainventariostacker = null;
        java.lang.String[] _msg = null;
        java.lang.String[] _msg2 = null;
        java.lang.String[] _msg3 = null;
        java.lang.String[] _msg4 = null;
        double _stotale = 0.0d;
        int _x = 0;
        java.lang.String[] _sfield = null;
        java.lang.String _sdes = "";

        public ResumableSub_StampaRiepilogoGestioneGlory(cassandraRisto.ital.starter starterVar, java.lang.String str) {
            this.parent = starterVar;
            this._stringainventario = str;
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
                            this._nomesub = "StampaRiepilogoGestioneGlory";
                            break;
                        case 1:
                            this.state = 78;
                            this.catchState = 77;
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            this.catchState = 77;
                            this._inventaridispositivi = new anywheresoftware.b4a.objects.collections.Map();
                            this._inventaritemp = new java.lang.String[0];
                            java.util.Arrays.fill(this._inventaritemp, "");
                            this._dispositivotemp = new java.lang.String[0];
                            java.util.Arrays.fill(this._dispositivotemp, "");
                            anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                            this._inventaritemp = anywheresoftware.b4a.keywords.Regex.Split("@_@_SeparatoreInventario_@_@", this._stringainventario.trim());
                            break;
                        case 4:
                            this.state = 9;
                            if (this._inventaritemp.length > 0) {
                                this.state = 6;
                                break;
                            } else {
                                this.state = 8;
                                break;
                            }
                        case 6:
                            this.state = 9;
                            this._inventaridispositivi.Initialize();
                            break;
                        case 8:
                            this.state = 9;
                            return;
                        case 9:
                            this.state = 20;
                            this.step12 = 1;
                            this.limit12 = this._inventaritemp.length - 1;
                            this._i = 0;
                            this.state = 79;
                            break;
                        case 11:
                            this.state = 12;
                            anywheresoftware.b4a.keywords.Regex regex2 = anywheresoftware.b4a.keywords.Common.Regex;
                            this._dispositivotemp = anywheresoftware.b4a.keywords.Regex.Split("@_@_NDISPOSITIVO_@_@", this._inventaritemp[this._i]);
                            break;
                        case 12:
                            this.state = 19;
                            if (this._dispositivotemp.length != 2) {
                                break;
                            } else {
                                this.state = 14;
                                break;
                            }
                        case 14:
                            this.state = 15;
                            break;
                        case 15:
                            this.state = 18;
                            if (!this._dispositivotemp[0].trim().equals("") && !this._dispositivotemp[1].trim().equals("")) {
                                this.state = 17;
                                break;
                            }
                            break;
                        case 17:
                            this.state = 18;
                            this._inventaridispositivi.Put(this._dispositivotemp[0], this._dispositivotemp[1]);
                            break;
                        case 18:
                            this.state = 19;
                            break;
                        case 19:
                            this.state = 80;
                            break;
                        case 20:
                            this.state = 75;
                            if (this._inventaridispositivi.getSize() > 0) {
                                this.state = 22;
                                break;
                            } else {
                                this.state = 74;
                                break;
                            }
                        case 22:
                            this.state = 23;
                            break;
                        case 23:
                            this.state = 26;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.starter.processBA;
                            cassandraRisto.ital.starter starterVar = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.keywords.Common.IsPaused(ba2, cassandraRisto.ital.main.getObject())) {
                                break;
                            } else {
                                this.state = 25;
                                break;
                            }
                        case 25:
                            this.state = 23;
                            anywheresoftware.b4a.keywords.Common.Sleep(cassandraRisto.ital.starter.processBA, this, 1000);
                            this.state = 81;
                            return;
                        case 26:
                            this.state = 27;
                            anywheresoftware.b4a.keywords.Common.Sleep(cassandraRisto.ital.starter.processBA, this, 1000);
                            this.state = 82;
                            return;
                        case 27:
                            this.state = 72;
                            this.step25 = 1;
                            this.limit25 = this._inventaridispositivi.getSize() - 1;
                            this._i = 0;
                            this.state = 83;
                            break;
                        case 29:
                            this.state = 30;
                            this._qtatotale = 0;
                            this._totalegenerale = 0.0d;
                            this._strutturainventario = new anywheresoftware.b4a.objects.collections.Map();
                            this._strutturainventario.Initialize();
                            this._numerodispositivo = 0;
                            this._strutturainventariostacker = new anywheresoftware.b4a.objects.collections.Map();
                            this._strutturainventariostacker.Initialize();
                            this._msg = new java.lang.String[0];
                            java.util.Arrays.fill(this._msg, "");
                            this._msg2 = new java.lang.String[0];
                            java.util.Arrays.fill(this._msg2, "");
                            this._msg3 = new java.lang.String[0];
                            java.util.Arrays.fill(this._msg3, "");
                            this._msg4 = new java.lang.String[0];
                            java.util.Arrays.fill(this._msg4, "");
                            anywheresoftware.b4a.keywords.Regex regex3 = anywheresoftware.b4a.keywords.Common.Regex;
                            this._msg3 = anywheresoftware.b4a.keywords.Regex.Split("@_@_SEPARATORE_@_@", anywheresoftware.b4a.BA.ObjectToString(this._inventaridispositivi.GetValueAt(this._i)));
                            this._numerodispositivo = (int) anywheresoftware.b4a.BA.ObjectToNumber(this._inventaridispositivi.GetKeyAt(this._i));
                            anywheresoftware.b4a.keywords.Regex regex4 = anywheresoftware.b4a.keywords.Common.Regex;
                            this._msg = anywheresoftware.b4a.keywords.Regex.Split(",", this._msg3[0]);
                            break;
                        case 30:
                            this.state = 37;
                            this.step40 = 1;
                            this.limit40 = this._msg.length - 1;
                            this._i = 0;
                            this.state = 85;
                            break;
                        case 32:
                            this.state = 33;
                            break;
                        case 33:
                            this.state = 36;
                            if (!this._msg[this._i].trim().equals("")) {
                                this.state = 35;
                                break;
                            } else {
                                break;
                            }
                        case 35:
                            this.state = 36;
                            anywheresoftware.b4a.keywords.Regex regex5 = anywheresoftware.b4a.keywords.Common.Regex;
                            this._msg2 = anywheresoftware.b4a.keywords.Regex.Split("_", this._msg[this._i]);
                            this._strutturainventario.Put(this._msg2[0], this._msg2);
                            break;
                        case 36:
                            this.state = 86;
                            break;
                        case 37:
                            this.state = 48;
                            if (this._msg3.length <= 1) {
                                break;
                            } else {
                                this.state = 39;
                                break;
                            }
                        case 39:
                            this.state = 40;
                            anywheresoftware.b4a.keywords.Regex regex6 = anywheresoftware.b4a.keywords.Common.Regex;
                            this._msg4 = anywheresoftware.b4a.keywords.Regex.Split(",", this._msg3[1]);
                            break;
                        case 40:
                            this.state = 47;
                            this.step48 = 1;
                            this.limit48 = this._msg4.length - 1;
                            this._i = 0;
                            this.state = 87;
                            break;
                        case 42:
                            this.state = 43;
                            break;
                        case 43:
                            this.state = 46;
                            if (!this._msg4[this._i].trim().equals("")) {
                                this.state = 45;
                                break;
                            } else {
                                break;
                            }
                        case 45:
                            this.state = 46;
                            anywheresoftware.b4a.keywords.Regex regex7 = anywheresoftware.b4a.keywords.Common.Regex;
                            this._msg2 = anywheresoftware.b4a.keywords.Regex.Split("_", this._msg4[this._i]);
                            this._strutturainventariostacker.Put(this._msg2[0], this._msg2);
                            break;
                        case 46:
                            this.state = 88;
                            break;
                        case 47:
                            this.state = 48;
                            break;
                        case 48:
                            this.state = 71;
                            if (this._strutturainventario.getSize() != 0 || this._strutturainventariostacker.getSize() != 0) {
                                this.state = 50;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 50:
                            this.state = 51;
                            cassandraRisto.ital.starter starterVar2 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            cassandraRisto.ital.starter starterVar3 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            ccefdllVar._nf_apri(cassandraRisto.ital.main._v_intestanf);
                            cassandraRisto.ital.starter starterVar4 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Riepilogo Operazioni CM(ID: " + anywheresoftware.b4a.BA.NumberToString(this._numerodispositivo) + "):", 4);
                            cassandraRisto.ital.starter starterVar5 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                            break;
                        case 51:
                            this.state = 60;
                            if (this._strutturainventario.getSize() != 0) {
                                this.state = 53;
                                break;
                            } else {
                                this.state = 59;
                                break;
                            }
                        case 53:
                            this.state = 54;
                            cassandraRisto.ital.starter starterVar6 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Riciclatori:", 2);
                            cassandraRisto.ital.starter starterVar7 = this.parent;
                            cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Taglio      Qta    Importo", 1);
                            cassandraRisto.ital.starter starterVar8 = this.parent;
                            cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                            this._stotale = 0.0d;
                            break;
                        case 54:
                            this.state = 57;
                            this.step64 = 1;
                            this.limit64 = this._strutturainventario.getSize() - 1;
                            this._x = 0;
                            this.state = 89;
                            break;
                        case 56:
                            this.state = 90;
                            this._sfield = new java.lang.String[4];
                            java.util.Arrays.fill(this._sfield, "");
                            this._sfield = (java.lang.String[]) this._strutturainventario.GetValueAt(this._x);
                            this._sdes = "Euro " + anywheresoftware.b4a.keywords.Common.NumberFormat2(java.lang.Double.parseDouble(this._sfield[0]) / 100.0d, 1, 2, 2, false);
                            cassandraRisto.ital.starter starterVar9 = this.parent;
                            cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.starter starterVar10 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append = sb.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv5(cassandraRisto.ital.starter.processBA, this._sdes, 12, anywheresoftware.b4a.BA.ObjectToChar(" ")));
                            cassandraRisto.ital.starter starterVar11 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, this._sfield[3], 3, anywheresoftware.b4a.BA.ObjectToChar(" "))).append(" ");
                            cassandraRisto.ital.starter starterVar12 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            ccefdllVar2._nf_testo(append2.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, anywheresoftware.b4a.keywords.Common.NumberFormat2(java.lang.Double.parseDouble(this._sfield[2]), 1, 2, 2, false), 10, anywheresoftware.b4a.BA.ObjectToChar(" "))).toString(), 1);
                            this._stotale += java.lang.Double.parseDouble(this._sfield[2]);
                            this._qtatotale = (int) (this._qtatotale + java.lang.Double.parseDouble(this._sfield[3]));
                            break;
                        case 57:
                            this.state = 60;
                            cassandraRisto.ital.starter starterVar13 = this.parent;
                            cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                            cassandraRisto.ital.starter starterVar14 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("TOT. Riciclatori");
                            cassandraRisto.ital.starter starterVar15 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            ccefdllVar3._nf_testo(append3.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, anywheresoftware.b4a.keywords.Common.NumberFormat2(this._stotale, 1, 2, 2, false), 16, anywheresoftware.b4a.BA.ObjectToChar(" "))).toString(), 2);
                            this._totalegenerale = this._stotale;
                            break;
                        case 59:
                            this.state = 60;
                            cassandraRisto.ital.starter starterVar16 = this.parent;
                            cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("TOT. Riciclatori");
                            cassandraRisto.ital.starter starterVar17 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            ccefdllVar4._nf_testo(append4.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, anywheresoftware.b4a.keywords.Common.NumberFormat2(0.0d, 1, 2, 2, false), 16, anywheresoftware.b4a.BA.ObjectToChar(" "))).toString(), 2);
                            this._totalegenerale = 0.0d;
                            break;
                        case 60:
                            this.state = 61;
                            cassandraRisto.ital.starter starterVar18 = this.parent;
                            cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                            break;
                        case 61:
                            this.state = 70;
                            if (this._strutturainventariostacker.getSize() != 0) {
                                this.state = 63;
                                break;
                            } else {
                                this.state = 69;
                                break;
                            }
                        case 63:
                            this.state = 64;
                            cassandraRisto.ital.starter starterVar19 = this.parent;
                            cassandraRisto.ital.main mainVar14 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Stacker:", 2);
                            cassandraRisto.ital.starter starterVar20 = this.parent;
                            cassandraRisto.ital.main mainVar15 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Taglio      Qta    Importo", 1);
                            cassandraRisto.ital.starter starterVar21 = this.parent;
                            cassandraRisto.ital.main mainVar16 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                            this._stotale = 0.0d;
                            break;
                        case 64:
                            this.state = 67;
                            this.step85 = 1;
                            this.limit85 = this._strutturainventariostacker.getSize() - 1;
                            this._x = 0;
                            this.state = 91;
                            break;
                        case 66:
                            this.state = 92;
                            this._sfield = new java.lang.String[4];
                            java.util.Arrays.fill(this._sfield, "");
                            this._sfield = (java.lang.String[]) this._strutturainventariostacker.GetValueAt(this._x);
                            this._sdes = "Euro " + anywheresoftware.b4a.keywords.Common.NumberFormat2(java.lang.Double.parseDouble(this._sfield[0]) / 100.0d, 1, 2, 2, false);
                            cassandraRisto.ital.starter starterVar22 = this.parent;
                            cassandraRisto.ital.main mainVar17 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar5 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            cassandraRisto.ital.starter starterVar23 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append5 = sb2.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv5(cassandraRisto.ital.starter.processBA, this._sdes, 12, anywheresoftware.b4a.BA.ObjectToChar(" ")));
                            cassandraRisto.ital.starter starterVar24 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append6 = append5.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, this._sfield[3], 3, anywheresoftware.b4a.BA.ObjectToChar(" "))).append(" ");
                            cassandraRisto.ital.starter starterVar25 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            ccefdllVar5._nf_testo(append6.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, anywheresoftware.b4a.keywords.Common.NumberFormat2(java.lang.Double.parseDouble(this._sfield[2]), 1, 2, 2, false), 10, anywheresoftware.b4a.BA.ObjectToChar(" "))).toString(), 1);
                            this._stotale += java.lang.Double.parseDouble(this._sfield[2]);
                            this._qtatotale = (int) (this._qtatotale + java.lang.Double.parseDouble(this._sfield[3]));
                            break;
                        case 67:
                            this.state = 70;
                            cassandraRisto.ital.starter starterVar26 = this.parent;
                            cassandraRisto.ital.main mainVar18 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                            cassandraRisto.ital.starter starterVar27 = this.parent;
                            cassandraRisto.ital.main mainVar19 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar6 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("TOT. Stacker    ");
                            cassandraRisto.ital.starter starterVar28 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            ccefdllVar6._nf_testo(append7.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, anywheresoftware.b4a.keywords.Common.NumberFormat2(this._stotale, 1, 2, 2, false), 16, anywheresoftware.b4a.BA.ObjectToChar(" "))).toString(), 2);
                            this._totalegenerale += this._stotale;
                            cassandraRisto.ital.starter starterVar29 = this.parent;
                            cassandraRisto.ital.main mainVar20 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("________________________________", 1);
                            cassandraRisto.ital.starter starterVar30 = this.parent;
                            cassandraRisto.ital.main mainVar21 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder append8 = new java.lang.StringBuilder().append("TOT. Generale   ");
                            cassandraRisto.ital.starter starterVar31 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            ccefdllVar7._nf_testo(append8.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, anywheresoftware.b4a.keywords.Common.NumberFormat2(this._totalegenerale, 1, 2, 2, false), 16, anywheresoftware.b4a.BA.ObjectToChar(" "))).toString(), 2);
                            break;
                        case 69:
                            this.state = 70;
                            cassandraRisto.ital.starter starterVar32 = this.parent;
                            cassandraRisto.ital.main mainVar22 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar8 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder append9 = new java.lang.StringBuilder().append("TOT. Stacker    ");
                            cassandraRisto.ital.starter starterVar33 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var11 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            ccefdllVar8._nf_testo(append9.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, anywheresoftware.b4a.keywords.Common.NumberFormat2(0.0d, 1, 2, 2, false), 16, anywheresoftware.b4a.BA.ObjectToChar(" "))).toString(), 2);
                            cassandraRisto.ital.starter starterVar34 = this.parent;
                            cassandraRisto.ital.main mainVar23 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("________________________________", 1);
                            cassandraRisto.ital.starter starterVar35 = this.parent;
                            cassandraRisto.ital.main mainVar24 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar9 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder append10 = new java.lang.StringBuilder().append("TOT. Generale   ");
                            cassandraRisto.ital.starter starterVar36 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var12 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            ccefdllVar9._nf_testo(append10.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv4(cassandraRisto.ital.starter.processBA, anywheresoftware.b4a.keywords.Common.NumberFormat2(this._totalegenerale, 1, 2, 2, false), 16, anywheresoftware.b4a.BA.ObjectToChar(" "))).toString(), 2);
                            break;
                        case 70:
                            this.state = 71;
                            cassandraRisto.ital.starter starterVar37 = this.parent;
                            cassandraRisto.ital.main mainVar25 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                            cassandraRisto.ital.starter starterVar38 = this.parent;
                            cassandraRisto.ital.main mainVar26 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_chiudi();
                            break;
                        case 71:
                            this.state = 84;
                            break;
                        case 72:
                            this.state = 75;
                            break;
                        case 74:
                            this.state = 75;
                            return;
                        case 75:
                            this.state = 78;
                            break;
                        case 77:
                            this.state = 78;
                            this.catchState = 0;
                            anywheresoftware.b4a.keywords.Common.LogImpl("491553974", this._nomesub + ": " + anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.starter.processBA).getMessage(), 0);
                            cassandraRisto.ital.starter starterVar39 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var13 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.starter.processBA, this._nomesub + ": " + anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.starter.processBA).getMessage());
                            break;
                        case 78:
                            this.state = -1;
                            this.catchState = 0;
                            break;
                        case 79:
                            this.state = 20;
                            if ((this.step12 > 0 && this._i <= this.limit12) || (this.step12 < 0 && this._i >= this.limit12)) {
                                this.state = 11;
                                break;
                            }
                            break;
                        case 80:
                            this.state = 79;
                            this._i = this._i + 0 + this.step12;
                            break;
                        case 81:
                            this.state = 23;
                            break;
                        case 82:
                            this.state = 27;
                            break;
                        case 83:
                            this.state = 72;
                            if ((this.step25 > 0 && this._i <= this.limit25) || (this.step25 < 0 && this._i >= this.limit25)) {
                                this.state = 29;
                                break;
                            }
                            break;
                        case 84:
                            this.state = 83;
                            this._i = this._i + 0 + this.step25;
                            break;
                        case 85:
                            this.state = 37;
                            if ((this.step40 > 0 && this._i <= this.limit40) || (this.step40 < 0 && this._i >= this.limit40)) {
                                this.state = 32;
                                break;
                            }
                            break;
                        case 86:
                            this.state = 85;
                            this._i = this._i + 0 + this.step40;
                            break;
                        case 87:
                            this.state = 47;
                            if ((this.step48 > 0 && this._i <= this.limit48) || (this.step48 < 0 && this._i >= this.limit48)) {
                                this.state = 42;
                                break;
                            }
                            break;
                        case 88:
                            this.state = 87;
                            this._i = this._i + 0 + this.step48;
                            break;
                        case 89:
                            this.state = 57;
                            if ((this.step64 > 0 && this._x <= this.limit64) || (this.step64 < 0 && this._x >= this.limit64)) {
                                this.state = 56;
                                break;
                            }
                            break;
                        case 90:
                            this.state = 89;
                            this._x = this._x + 0 + this.step64;
                            break;
                        case 91:
                            this.state = 67;
                            if ((this.step85 > 0 && this._x <= this.limit85) || (this.step85 < 0 && this._x >= this.limit85)) {
                                this.state = 66;
                                break;
                            }
                            break;
                        case 92:
                            this.state = 91;
                            this._x = this._x + 0 + this.step85;
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.starter.processBA.setLastException(e);
                }
            }
        }
    }

    public static java.lang.String _timer1_tick() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub Timer1_Tick";
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
        }
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            if (_v7.getInterval() != 92000) {
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv7(processBA, true, true, false);
                _v7.setInterval(92000L);
                return "";
            }
            anywheresoftware.b4a.BA ba = processBA;
            cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.httpclient.getObject(), "SendHelloDaClient");
            return "";
        }
        if (_v7.getInterval() == 92000) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_verificastampanti)) {
                return "";
            }
        }
        if (_v7.getInterval() != 92000) {
            _v7.setInterval(92000L);
        }
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from Palmari where Attivo = 1  order by Serial"));
        if (cursorWrapper2.getRowCount() > 0) {
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i = 0; i <= rowCount; i++) {
                cursorWrapper2.setPosition(i);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(cursorWrapper2.GetString("Serial")).toString();
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 + "/VENDUTO", cursorWrapper2.GetString("Serial"), false, 0, 0L);
            }
        }
        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv7(processBA, true, true, false);
        cursorWrapper2.Close();
        return "";
    }

    public static java.lang.String _timerscontrinoauto_tick() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(false);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            anywheresoftware.b4a.BA ba = processBA;
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.main.getObject(), "StampaScontrinoDaServer");
            return "";
        }
        anywheresoftware.b4a.BA ba2 = processBA;
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew(ba2, cassandraRisto.ital.main.getObject(), "StampaScontrinoAuto");
        return "";
    }

    public static java.lang.String _timerupdstatotavoli_tick() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setEnabled(false);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
                anywheresoftware.b4a.BA ba = processBA;
                cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.httpclient.getObject(), "GetVariazioniTavoliDaClient", false);
                return "";
            }
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str) throws java.lang.Exception {
        int i = 12345;
        try {
            if (anywheresoftware.b4a.keywords.Common.IsNumber(str)) {
                i = (int) java.lang.Double.parseDouble(str);
            }
            switch (i) {
                case 0:
                    return "OK";
                case 1:
                    return "Cash management\nTransazione annullata con successo";
                case 2:
                    return "Cash management\nTransazione completata a seguito di un reset macchina (valore possibile in caso di errori in fase di vendita)";
                case 9:
                    return "Cash management\nImpossibile restituire tutto il contante versato a seguito di annullo transazione";
                case 10:
                    return "Cash management\nResto insufficiente";
                case 11:
                    return "Cash management\nImpossibile iniziare il pagamento";
                case 12:
                    return "Cash management\nErrore durante l’erogazione del resto";
                case 99:
                    return "Cash management\nErrore generico";
                case 100:
                    return "Cash management\nErrore macchina (inceppamento)";
                case 1111:
                    return "Cash management\nErrore di comunicazione con il dispositivo";
                case 2222:
                    return "Cash management\nLo stacker risulta aperto oppure necessita di essere vuotato";
                case 2223:
                    return "Cash management\nIl cassetto è stato rimosso";
                case 2224:
                    return "Cash management\nIl cassetto è stato inserito";
                case 3333:
                    return "Cash management\nIl dispositivo risulta occupato";
                case 4444:
                    return "Cash management\nRegistrazione del Cash Management non effettuata";
                case 9000:
                    return "Cash management\nTransazione annullata dal cliente";
                case 9001:
                    return "Cash management\nATTENZIONE ... Livelli bassi di denaro";
                case 9002:
                    return "Cash management\nErrore Hardware";
                case 9003:
                    return "Cash management\nIl Driver risulta essere occupato";
                case 9004:
                    return "Cash management\nIl comando inviato non è corretto";
                case 9005:
                    return "Cash management\nLo stato del Cash Management non è corretto";
                case 9006:
                case 9007:
                    return "Cash management\nErrore generico";
                default:
                    return "Cash management\nErrore non riconosciuto";
            }
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            anywheresoftware.b4a.keywords.Common.LogImpl("491357248", "TranslateErrCodeGlory: " + anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage(), 0);
            return "Cash management\nErrore non riconosciuto";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        int GetHour = anywheresoftware.b4a.keywords.DateTime.GetHour(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA));
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String str = anywheresoftware.b4a.keywords.Common.NumberFormat(GetHour, 2, 0) + ":" + anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetMinute(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)), 2, 0);
        java.lang.String str2 = "";
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select * from oraasporto where descrizione >'" + str + "' order by descrizione"));
        if (cursorWrapper2.getRowCount() > 0) {
            int rowCount = cursorWrapper2.getRowCount() - 1;
            java.lang.String str3 = "";
            for (int i = 0; i <= rowCount; i++) {
                cursorWrapper2.setPosition(i);
                java.lang.String str4 = cursorWrapper2.GetString("descrizione") + "\n";
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select reparti.descrizione as Des,case when sum(qta) is null then 0 else sum(qta) end as Tot FROM [Venduto] inner join headmov on headmov.nmov = venduto.nmov inner join reparti on venduto.reparto = reparti.codice where headmov.sospeso =1 AND headmov.tavolo = 0 AND brep = 0 AND lower(substr(venduto.codint,1,3))<>'mnu' AND lower(substr(venduto.codint,1,3))<>'msg' AND lower(substr(venduto.codice,1,2))<>'vv' and lower(substr(venduto.codice,1,2))<>'ww' and substr(headmov.datam2,12,5) ='" + cursorWrapper2.GetString("descrizione") + "' group by reparti.descrizione"));
                if (cursorWrapper4.getRowCount() > 0) {
                    int rowCount2 = cursorWrapper4.getRowCount() - 1;
                    int i2 = 0;
                    while (i2 <= rowCount2) {
                        cursorWrapper4.setPosition(i2);
                        i2++;
                        str4 = str4 + "      Ordinati " + cursorWrapper4.GetString("Tot") + " articoli " + cursorWrapper4.GetString("Des") + "\n";
                    }
                }
                cursorWrapper4.Close();
                str3 = str3 + str4 + "\t";
            }
            str2 = str3;
        }
        cursorWrapper2.Close();
        return str2;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(java.lang.String str, int i, int i2) throws java.lang.Exception {
        java.lang.String str2;
        int i3;
        java.lang.String str3 = "(reparti.codice =" + str + ")";
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.equals("Init")) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select codice from reparti where verificaWeb=1"));
            if (cursorWrapper2.getRowCount() > 0) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "(";
                int rowCount = cursorWrapper2.getRowCount() - 1;
                for (int i4 = 0; i4 <= rowCount; i4++) {
                    cursorWrapper2.setPosition(i4);
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 += "reparti.codice =" + cursorWrapper2.GetString("codice") + " or ";
                }
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.substring(0, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.length() - 4) + ")";
            }
            cursorWrapper2.Close();
        }
        if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.equals("")) {
            str3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        }
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        int GetHour = anywheresoftware.b4a.keywords.DateTime.GetHour(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA));
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String str4 = anywheresoftware.b4a.keywords.Common.NumberFormat(GetHour, 2, 0) + ":" + anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetMinute(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)), 2, 0);
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select * from oraasporto where descrizione >'" + str4 + "' order by descrizione"));
        if (cursorWrapper4.getRowCount() <= 0) {
            str2 = "Orari\n";
        } else {
            int rowCount2 = cursorWrapper4.getRowCount() - 1;
            java.lang.String str5 = "Orari\n";
            for (int i5 = 0; i5 <= rowCount2; i5++) {
                cursorWrapper4.setPosition(i5);
                java.lang.String str6 = cursorWrapper4.GetString("descrizione") + "_OK\n";
                if (i <= 0 || str.equals("-1")) {
                    i3 = 0;
                } else {
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    i3 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as Tot FROM [Venduto] inner join headmov on headmov.nmov = venduto.nmov inner join reparti on venduto.reparto = reparti.codice where " + str3 + " And headmov.sospeso =1 And headmov.tavolo = 0 And brep = 0 And lower(substr(venduto.codint,1,3))<>'mnu' AND lower(substr(venduto.codint,1,3))<>'msg' AND lower(substr(venduto.codice,1,2))<>'vv' and lower(substr(venduto.codice,1,2))<>'ww' and substr(headmov.datam2,12,5) ='" + cursorWrapper4.GetString("descrizione") + "'"));
                }
                if (i3 > i) {
                    str6 = str6.replace("_OK", "_NO");
                } else if (i2 > 0) {
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (((int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) as Tot FROM headmov where sospeso =1 AND tavolo = 0 and substr(datam2,12,5) ='" + cursorWrapper4.GetString("descrizione") + "'"))) > i2) {
                        str6 = str6.replace("_OK", "_NO");
                    }
                }
                str5 = str5 + str6;
            }
            str2 = str5;
        }
        cursorWrapper4.Close();
        return str2;
    }

    public static java.lang.String _udpcallerid_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket uDPPacket) throws java.lang.Exception {
        try {
            if (uDPPacket.getLength() != 83) {
                anywheresoftware.b4a.keywords.Common.CallSubNew2(processBA, "Main", "RicercaBarcodeRemote", anywheresoftware.b4a.keywords.Common.BytesToString(uDPPacket.getData(), 0, uDPPacket.getLength(), "UTF8"));
            } else {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.keywords.Common.BytesToString(uDPPacket.getData(), uDPPacket.getOffset() + 21 + 32, 14, "UTF8").trim());
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0571, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r2 = new java.lang.StringBuilder().append(" and tipo =");
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(r17).append(" ").toString();
        r2 = cassandraRisto.ital.starter.processBA;
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r2, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r2 = new java.lang.StringBuilder().append(" and tipo =");
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(r18).append(" ").toString();
        r2 = cassandraRisto.ital.starter.processBA;
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r2, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0609, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x060f, code lost:
    
        if (cassandraRisto.ital.main._v_stampasposta == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0611, code lost:
    
        r2 = "Tavolo " + r17 + " unito al tavolo " + r18;
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0638, code lost:
    
        if (cassandraRisto.ital.main._v_stampasala == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x063a, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r2 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA, r17);
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r2 = r2 + " unito a " + cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0674, code lost:
    
        if (java.lang.Double.parseDouble(r19) < 10000.0d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0676, code lost:
    
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA, false, true, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0681, code lost:
    
        if (r6 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0683, code lost:
    
        r2 = new int[]{(int) java.lang.Double.parseDouble(r17), (int) java.lang.Double.parseDouble(r18)};
        r3 = cassandraRisto.ital.starter.processBA;
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        anywheresoftware.b4a.keywords.Common.CallSubNew3(r3, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", r2, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return "OK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0725, code lost:
    
        if (r5 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0727, code lost:
    
        r2 = new int[]{(int) java.lang.Double.parseDouble(r17), (int) java.lang.Double.parseDouble(r18)};
        r3 = cassandraRisto.ital.starter.processBA;
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        r4 = cassandraRisto.ital.httpclient.getObject();
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew3(r3, r4, "SendVariazioneTavoloAiClient", r2, cassandraRisto.ital.main._v_numcassa);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x056f, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0567, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:3:0x000c, B:5:0x0021, B:8:0x002b, B:10:0x0040, B:13:0x004a, B:17:0x007d, B:21:0x00aa, B:25:0x00d6, B:29:0x0103, B:31:0x0109, B:35:0x0139, B:39:0x014a, B:43:0x017e, B:47:0x01ab, B:51:0x01b9, B:53:0x01e8, B:55:0x0250, B:57:0x026d, B:59:0x029d, B:61:0x02b4, B:63:0x02da, B:65:0x02e3, B:67:0x02fc, B:69:0x0338, B:71:0x0341, B:73:0x034a, B:75:0x0353, B:77:0x0360, B:81:0x03b7, B:83:0x03ee, B:85:0x0403, B:92:0x0458, B:95:0x048e, B:96:0x052a, B:98:0x055f, B:100:0x0571, B:101:0x0609, B:103:0x0611, B:105:0x063a, B:106:0x0669, B:108:0x0676, B:110:0x0683, B:114:0x0727, B:115:0x0569, B:121:0x06b7, B:87:0x0406), top: B:2:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:3:0x000c, B:5:0x0021, B:8:0x002b, B:10:0x0040, B:13:0x004a, B:17:0x007d, B:21:0x00aa, B:25:0x00d6, B:29:0x0103, B:31:0x0109, B:35:0x0139, B:39:0x014a, B:43:0x017e, B:47:0x01ab, B:51:0x01b9, B:53:0x01e8, B:55:0x0250, B:57:0x026d, B:59:0x029d, B:61:0x02b4, B:63:0x02da, B:65:0x02e3, B:67:0x02fc, B:69:0x0338, B:71:0x0341, B:73:0x034a, B:75:0x0353, B:77:0x0360, B:81:0x03b7, B:83:0x03ee, B:85:0x0403, B:92:0x0458, B:95:0x048e, B:96:0x052a, B:98:0x055f, B:100:0x0571, B:101:0x0609, B:103:0x0611, B:105:0x063a, B:106:0x0669, B:108:0x0676, B:110:0x0683, B:114:0x0727, B:115:0x0569, B:121:0x06b7, B:87:0x0406), top: B:2:0x000c, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _uniscitavolo(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        boolean z;
        boolean z2;
        try {
            cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, str3) < 10000.0d) {
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                    z = true;
                    cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, str3) > 10000.0d) {
                        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                            z2 = true;
                            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + str2).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                return "TAVOLO NON TROVATO";
                            }
                            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where lock=0 and inmodifica=0 and tavolo = " + str2).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                return "TAVOLO BLOCCATO";
                            }
                            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where manuallock=1 and tavolo = " + str2)) > 0.0d) {
                                return "Impossibile unire con un tavolo che non viene azzerato in chiusura";
                            }
                            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where manuallock=1 and tavolo = " + str)) > 0.0d) {
                                return "Impossibile unire quando uno dei tavoli non viene azzerato in chiusura";
                            }
                            if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (anywheresoftware.b4a.objects.streams.File.Exists(sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/").append(str3.trim()).toString(), "venduto.csv")) {
                                    return "TAVOLO NON ANCORA ELABORATO DAL SERVER";
                                }
                            }
                            if (str2.equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                return "Errore";
                            }
                            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from tavoli where tavolo = " + str2 + " and inmodifica =0 and lock=0 ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                return "TAVOLO NON DISPONIBILE";
                            }
                            cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where unlocktable =" + str)) > 0.0d) {
                                return "A questo tavolo sono già legati altri tavoli.\nImpossibile unirlo ad un altro";
                            }
                            if (str2.equals(str)) {
                                return "Il tavolo di origine corrisponde a quello di destinazione";
                            }
                            cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from pagine where pagina >=10  AND pagina <100 AND valore = " + str + " AND tipo = 9 limit 1")) > 0.0d) {
                                cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int parseDouble = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select pagina from pagine where pagina >=10  AND pagina <100 AND valore = " + str + " AND tipo = 9 limit 1"));
                                cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from pagine where pagina =" + anywheresoftware.b4a.BA.NumberToString(parseDouble) + " AND valore = " + str2 + " AND tipo = 9").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                    return "Il tavolo " + str2 + " non esiste in questa sala.";
                                }
                            }
                            cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from tavoli where tavolo = " + str2 + " and unlocktable=0 ").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                                return "Questo tavolo non può essere unito al tavolo " + str2;
                            }
                            cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int parseDouble2 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select unlocktable from  tavoli where tavolo = " + str));
                            if (parseDouble2 > 0 && parseDouble2 != java.lang.Double.parseDouble(str2)) {
                                return "Risulta già essere unito al tavolo " + anywheresoftware.b4a.BA.NumberToString(parseDouble2);
                            }
                            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from  tavoli where tavolo = " + str));
                            cursorWrapper2.setPosition(0);
                            if (cursorWrapper2.GetInt("stampap") == 1 || cursorWrapper2.GetInt("ricconto") == 1 || cursorWrapper2.GetInt("lock") == 1 || cursorWrapper2.GetInt("unlocktable") > 0 || cursorWrapper2.GetInt("inmodifica") == 1) {
                                return "Il tavolo non può essere unito.";
                            }
                            cursorWrapper2.Close();
                            cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            long parseDouble3 = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " + str2));
                            cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            long parseDouble4 = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " + str));
                            if (parseDouble3 > 0 && parseDouble4 > 0) {
                                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select qtacondecimali,totcre,chiave from venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble3)));
                                if (cursorWrapper4.getRowCount() > 0) {
                                    long parseDouble5 = (long) (java.lang.Double.parseDouble(str) * 10000.0d);
                                    int rowCount = cursorWrapper4.getRowCount() - 1;
                                    for (int i = 0; i <= rowCount; i++) {
                                        cursorWrapper4.setPosition(i);
                                        try {
                                            int GetInt = (int) (cursorWrapper4.GetInt("totcre") + parseDouble5);
                                            cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update venduto set qtacondecimali= " + anywheresoftware.b4a.BA.NumberToString(GetInt) + ",totcre='" + anywheresoftware.b4a.BA.NumberToString(GetInt) + "' where chiave=" + anywheresoftware.b4a.BA.NumberToString(cursorWrapper4.GetLong("chiave")));
                                        } catch (java.lang.Exception e) {
                                            processBA.setLastException(e);
                                            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                                        }
                                    }
                                }
                                cursorWrapper4.Close();
                                cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update venduto set nmov =  " + anywheresoftware.b4a.BA.NumberToString(parseDouble3) + " where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble4));
                                cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select sum(importo) from venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble3));
                                cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set importo = " + ExecQuerySingleResult + " where tavolo = " + str2);
                                cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble4));
                            } else if (parseDouble3 == 0 && parseDouble4 > 0) {
                                cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.String ExecQuerySingleResult2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " + anywheresoftware.b4a.BA.NumberToString(parseDouble4));
                                cassandraRisto.ital.main mainVar25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                java.lang.StringBuilder append = new java.lang.StringBuilder().append("update tavoli set rifheadmov=").append(anywheresoftware.b4a.BA.NumberToString(parseDouble4)).append(",coperti=").append(ExecQuerySingleResult2).append(",addturni= ");
                                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                sql.ExecNonQuery(append.append(cassandraRisto.ital.mod1._vvvvvvvv7(processBA, parseDouble4)).append(" where tavolo = ").append(str2).toString());
                            }
                            cassandraRisto.ital.main mainVar26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set tPWD=random(),unlocktable=" + str2 + " ,uscita=0,lock=1,rifheadmov=0,coperti=0,addturni=0,importo=0 where tavolo = " + str);
                            cassandraRisto.ital.main mainVar27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                                cassandraRisto.ital.main mainVar28 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            }
                            cassandraRisto.ital.main mainVar29 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        }
                    }
                    z2 = false;
                    cassandraRisto.ital.main mainVar32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + str2).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                    }
                }
            }
            z = false;
            cassandraRisto.ital.modfunstr modfunstrVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, str3) > 10000.0d) {
            }
            z2 = false;
            cassandraRisto.ital.main mainVar322 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " + str2).equals(anywheresoftware.b4a.BA.NumberToString(0))) {
            }
        } catch (java.lang.Exception e2) {
            processBA.setLastException(e2);
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0dfa, code lost:
    
        r12 = cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0e03, code lost:
    
        if (cassandraRisto.ital.main._v_opextended == false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0e05, code lost:
    
        r10 = 40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0e11, code lost:
    
        if (r12 <= anywheresoftware.b4a.BA.ObjectToNumber(r10)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0e1b, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update venduto set FromWeb=0,cameriere=" + anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) + " where nmov = " + anywheresoftware.b4a.BA.NumberToString(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x11be, code lost:
    
        r10 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0e13, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = cassandraRisto.ital.main._operatore;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0e50, code lost:
    
        if (r6 != 0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0e52, code lost:
    
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r6 = ((long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'"))) + 1;
        r9 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update  progressivi set valore = valore +1  where codice ='V'");
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0ec5, code lost:
    
        if (r0 > anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.main._v_opextended ? 40 : 9)) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x014c, code lost:
    
        if (r5.equals("") != false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x11e1, code lost:
    
        if (r45 <= 0) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x11e3, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x1208, code lost:
    
        r2 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select max(cast(totcre as float)) from venduto where nmov= " + anywheresoftware.b4a.BA.NumberToString(r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x014e, code lost:
    
        r2 = new flm.b4a.archiver.ArchiverForB4A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x1210, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x1211, code lost:
    
        cassandraRisto.ital.starter.processBA.setLastException(r2);
        r2 = anywheresoftware.b4a.keywords.Common.Rnd(0, 1000) + 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x11c6, code lost:
    
        if (r45 <= 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x11d2, code lost:
    
        if (r17[21].startsWith("WEB\t") == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x11d4, code lost:
    
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = r17[21].substring(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x135b, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x135e, code lost:
    
        r25 = r4;
        r26 = r6;
        r4 = r2;
        r40 = r12;
        r12 = r7;
        r6 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x136a, code lost:
    
        r27 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0153, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0b81, code lost:
    
        if (r17[1].equals(anywheresoftware.b4a.BA.NumberToString(10000)) != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0b83, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r10 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        r11 = new java.lang.StringBuilder().append("update tavoli set timelast = '");
        r14 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r14 = cassandraRisto.ital.starter.processBA;
        r15 = new java.lang.StringBuilder();
        r18 = anywheresoftware.b4a.keywords.Common.DateTime;
        r0 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r15 = r15.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA))).append(" ");
        r18 = anywheresoftware.b4a.keywords.Common.DateTime;
        r0 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r10.ExecNonQuery(r11.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(r14, r15.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.starter.processBA))).toString())).append("',inmodifica =0 where tavolo =").append(r17[1]).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0bfc, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0c04, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 < 10) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0c06, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0c0e, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 < 100) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0c25, code lost:
    
        if (r17[1].equals(anywheresoftware.b4a.BA.NumberToString(10000)) != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0c27, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r10 = new java.lang.StringBuilder().append(" and tipo =");
        r11 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r10.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(r17[1]).append(" ").toString();
        r10 = cassandraRisto.ital.starter.processBA;
        r15 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r10, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0c78, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0c7e, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0c8d, code lost:
    
        if (r17[1].equals(anywheresoftware.b4a.BA.NumberToString(10000)) != false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0c8f, code lost:
    
        r10 = new int[]{(int) java.lang.Double.parseDouble(r17[1])};
        r11 = cassandraRisto.ital.starter.processBA;
        r14 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        anywheresoftware.b4a.keywords.Common.CallSubNew3(r11, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", r10, r43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0cae, code lost:
    
        r10 = r29.ReadLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0c10, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0c16, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0157, code lost:
    
        if (r9 > 10) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0a54, code lost:
    
        r29.Close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0a5b, code lost:
    
        if (r30.getSize() <= 0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0a5d, code lost:
    
        r7 = r30.getSize() - 1;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0a65, code lost:
    
        if (r3 > r7) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0a67, code lost:
    
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        r2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(r2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from Venduto where lower(substr(codice,1,2))<>'vv' and lower(substr(codice,1,2))<>'ww' and nmov = \t" + anywheresoftware.b4a.BA.ObjectToString(r30.Get(r3))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0aa2, code lost:
    
        if (r2.getRowCount() <= 0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0aa4, code lost:
    
        r8 = r2.getRowCount() - 1;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0aab, code lost:
    
        if (r4 > r8) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0aad, code lost:
    
        r2.setPosition(r4);
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0b00, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) FROM Venduto where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" + r2.GetString("chiave") + " and totcre ='" + r2.GetString("totcre") + "' and nmov = " + anywheresoftware.b4a.BA.ObjectToString(r30.Get(r3)))) <= 0.0d) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0b02, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update Venduto set importo2 = (Select Case when sum(importo) Is Null Then 0 Else sum(importo) End from Venduto where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" + r2.GetString("chiave") + " AND totcre ='" + r2.GetString("totcre") + "' and nmov = " + anywheresoftware.b4a.BA.ObjectToString(r30.Get(r3)) + ") where chiave =" + r2.GetString("chiave"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0b5a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x12d6, code lost:
    
        r2.Close();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0159, code lost:
    
        r2.UnZip(cassandraRisto.ital.starter.processBA, r42, r5, r42, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x12e2, code lost:
    
        if (r31.getSize() <= 0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x12e4, code lost:
    
        r3 = r31.getSize() - 1;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x12eb, code lost:
    
        if (r2 > r3) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x12ed, code lost:
    
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r4 = cassandraRisto.ital.starter.processBA;
        r10 = anywheresoftware.b4a.BA.ObjectToLongNumber(r31.Get(r2));
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv2(r4, r10, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x130f, code lost:
    
        if (r5.equals("") != false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x1311, code lost:
    
        r2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r42, "vend.csv");
        r2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r42, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x1322, code lost:
    
        if (r44 == false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x1327, code lost:
    
        if (r45 == 1) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x1329, code lost:
    
        cassandraRisto.ital.starter._v7.setEnabled(false);
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv7(cassandraRisto.ital.starter.processBA, true, false, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x133a, code lost:
    
        if (r9 == false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x133c, code lost:
    
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05f6, code lost:
    
        r2 = r29.ReadLine();
        r4 = anywheresoftware.b4a.keywords.Common.Regex;
        r2 = anywheresoftware.b4a.keywords.Regex.Split(",", r2);
        r18 = anywheresoftware.b4a.BA.NumberToString((int) java.lang.Double.parseDouble(r43.substring(3)));
        r19 = r2[0].equals("-");
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r20 = ((long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'"))) + 1;
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update  progressivi set valore = valore +1  where codice ='V'");
        r4 = r29.ReadLine();
        r2 = 0;
        r16 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0645, code lost:
    
        if (r4 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x064c, code lost:
    
        if (r4.length() >= 3) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0663, code lost:
    
        java.util.Arrays.fill(new java.lang.String[0], "");
        r6 = anywheresoftware.b4a.keywords.Common.Regex;
        r7 = anywheresoftware.b4a.keywords.Regex.Split(",", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0674, code lost:
    
        if (r7.length <= 5) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0676, code lost:
    
        r4 = (int) java.lang.Double.parseDouble(r7[17]);
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0685, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0164, code lost:
    
        r2 = anywheresoftware.b4a.keywords.Common.File;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0689, code lost:
    
        if (r4 != 10) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x068b, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x068e, code lost:
    
        if (r4 != 80) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0690, code lost:
    
        r4 = 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0694, code lost:
    
        if (r4 != 10) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0696, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0697, code lost:
    
        r2 = (int) java.lang.Double.parseDouble(r7[10]);
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int) java.lang.Double.parseDouble(r7[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06ad, code lost:
    
        if (cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 <= 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0173, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(r42, "vend.csv")) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06af, code lost:
    
        r8 = cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x06b8, code lost:
    
        if (cassandraRisto.ital.main._v_opextended == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x06ba, code lost:
    
        r6 = 40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06c6, code lost:
    
        if (r8 <= anywheresoftware.b4a.BA.ObjectToNumber(r6)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06d0, code lost:
    
        new anywheresoftware.b4a.objects.collections.Map();
        r6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(r7, (int) r20, r42, 0, false, 0, false);
        r6.Put("sospeso", false);
        r6.Put("flgNF", true);
        r8 = anywheresoftware.b4a.BA.ObjectToNumber(r6.Get("importo")) + r16;
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0737, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from tmpStampaPalm" + r18 + " where idRiga=" + r7[4])) <= 0.0d) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0739, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r10 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select gruppomenu from tmpStampaPalm" + r18 + " where idRiga=" + r7[4]);
        r11 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select totcre from tmpStampaPalm" + r18 + " where idRiga=" + r7[4]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0797, code lost:
    
        if (r10.equals("") == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0799, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tmpStampaPalm" + r18 + " set qta=qta+" + anywheresoftware.b4a.BA.ObjectToString(r6.GetDefault("qta", 1)) + " where qta < 0 and totcre='" + r7 + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0175, code lost:
    
        r2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r42, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x08e5, code lost:
    
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tmpStampaPalm" + r18 + " set qta=qta+" + anywheresoftware.b4a.BA.ObjectToString(r6.GetDefault("qta", 1)) + " where qta < 0 and gruppomenu='" + r10 + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x07e1, code lost:
    
        r28.Add(r6.getObject());
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x07eb, code lost:
    
        r4 = r29.ReadLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x07ef, code lost:
    
        if (r4 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x07f6, code lost:
    
        if (r4.length() >= 3) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x136e, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017e, code lost:
    
        return "Err";
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x07fc, code lost:
    
        if (r28.getSize() <= 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x07fe, code lost:
    
        if (r2 <= 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0800, code lost:
    
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        r6 = cassandraRisto.ital.starter.processBA;
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(r6, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Venduto", r28);
        r28.Clear();
        r7 = (int) r20;
        r10 = r2 - 20000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x081e, code lost:
    
        if (r45 != 1) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0820, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0821, code lost:
    
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(r7, r8, r10, r11, r12, false, 0, "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x095d, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0829, code lost:
    
        if (r19 == false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x082b, code lost:
    
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from tmpStampaPalm" + r18);
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0 where tavolo=" + anywheresoftware.b4a.BA.NumberToString(r2 - 20000));
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r6 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " + anywheresoftware.b4a.BA.NumberToString(r2 - 20000));
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0895, code lost:
    
        if (r6.equals("") != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0897, code lost:
    
        if (r6 == null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x089f, code lost:
    
        if (r6.equals("0") != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x08a1, code lost:
    
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where nmov=" + r6);
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from venduto where nmov=" + r6);
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0203, code lost:
    
        r8.Initialize();
        r29 = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
        r2 = anywheresoftware.b4a.keywords.Common.File;
        r29.Initialize(anywheresoftware.b4a.objects.streams.File.OpenInput(r42, "vend.csv").getObject());
        r6 = 0;
        r3 = false;
        r11 = 0;
        r4 = r29.ReadLine();
        java.util.Arrays.fill(new java.lang.String[0], "");
        r9 = anywheresoftware.b4a.keywords.Common.Regex;
        r9 = anywheresoftware.b4a.keywords.Regex.Split(",", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x08dd, code lost:
    
        r6 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x06c8, code lost:
    
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = cassandraRisto.ital.main._operatore;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x1372, code lost:
    
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x092f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0930, code lost:
    
        cassandraRisto.ital.starter.processBA.setLastException(r2);
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.starter.processBA, "Errore importazione dati per Dividi conto da palmare \n" + anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.starter.processBA).getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0241, code lost:
    
        r2 = r29.ReadLine();
        r3 = anywheresoftware.b4a.keywords.Common.Regex;
        anywheresoftware.b4a.keywords.Regex.Split(",", r2);
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x025c, code lost:
    
        r18 = ((long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'"))) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0261, code lost:
    
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update  progressivi set valore = valore +1  where codice ='V'");
        r4 = r2;
        r2 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0271, code lost:
    
        if (r4 == null) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x023f, code lost:
    
        if (r46 <= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0278, code lost:
    
        if (r4.length() >= 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0405, code lost:
    
        java.util.Arrays.fill(new java.lang.String[0], "");
        r6 = anywheresoftware.b4a.keywords.Common.Regex;
        r7 = anywheresoftware.b4a.keywords.Regex.Split(",", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0416, code lost:
    
        if (r7.length <= 5) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0418, code lost:
    
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int) java.lang.Double.parseDouble(r7[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0425, code lost:
    
        if (cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 <= 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0427, code lost:
    
        r8 = cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0430, code lost:
    
        if (cassandraRisto.ital.main._v_opextended == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0432, code lost:
    
        r4 = 40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x043e, code lost:
    
        if (r8 <= anywheresoftware.b4a.BA.ObjectToNumber(r4)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0448, code lost:
    
        new anywheresoftware.b4a.objects.collections.Map();
        r4 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(r7, (int) r18, r42, 0, false, r46, false);
        r4.Put("sospeso", false);
        r4.Put("flgNF", true);
        r8 = r2 + anywheresoftware.b4a.BA.ObjectToNumber(r4.Get("importo"));
        r28.Add(r4.getObject());
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0484, code lost:
    
        r3 = r29.ReadLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0488, code lost:
    
        if (r3 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x048f, code lost:
    
        if (r3.length() >= 3) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x1376, code lost:
    
        r4 = r3;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x05f4, code lost:
    
        if (r9[0].trim().equals("DIVIDI") == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0495, code lost:
    
        if (r28.getSize() <= 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0497, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        r2 = cassandraRisto.ital.starter.processBA;
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(r2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Venduto", r28);
        r28.Clear();
        r7 = (int) r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x04b5, code lost:
    
        if (r45 != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x04b7, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x04b8, code lost:
    
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(r7, r8, 0, 0, r12, false, r46, "0");
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        r2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(r2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select * from Venduto where lower(substr(codice,1,2))<>'vv' and lower(substr(codice,1,2))<>'ww' and nmov = \t" + anywheresoftware.b4a.BA.NumberToString(r18)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04f5, code lost:
    
        if (r2.getRowCount() <= 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04f7, code lost:
    
        r6 = r2.getRowCount() - 1;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04fe, code lost:
    
        if (r4 > r6) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0500, code lost:
    
        r2.setPosition(r4);
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x054d, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) FROM Venduto where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" + r2.GetString("chiave") + " and totcre ='" + r2.GetString("totcre") + "' and nmov = " + anywheresoftware.b4a.BA.NumberToString(r18))) <= 0.0d) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x054f, code lost:
    
        r7 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("update Venduto set importo2 = (Select Case when sum(importo) Is Null Then 0 Else sum(importo) End from Venduto where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" + r2.GetString("chiave") + " AND totcre ='" + r2.GetString("totcre") + "' and nmov = " + anywheresoftware.b4a.BA.NumberToString(r18) + ") where chiave =" + r2.GetString("chiave"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x05a1, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x05b0, code lost:
    
        r2.Close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0969, code lost:
    
        if (r9[0].equals("10000") != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x05b3, code lost:
    
        r4 = r3;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x05ad, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x05a5, code lost:
    
        r4 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0440, code lost:
    
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = cassandraRisto.ital.main._operatore;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x137a, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x027a, code lost:
    
        r38 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x027c, code lost:
    
        r29.Close();
        r2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r42, r5);
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x028c, code lost:
    
        if (cassandraRisto.ital.main._v_stampaconto > 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x028e, code lost:
    
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        r2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r8 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(r2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select * from venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(r38)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x02c3, code lost:
    
        if (r8.getRowCount() > 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x02c5, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select datam2 from headmov where nmov = " + anywheresoftware.b4a.BA.NumberToString(r38));
        r29 = ("Ordine Web N." + anywheresoftware.b4a.BA.NumberToString(r38) + "\ndel " + r2.substring(3, 5) + "/" + r2.substring(0, 2) + "/" + r2.substring(6) + "\n") + "Cliente " + cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 + "\n";
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0384, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" + cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 + "'")) > 0.0d) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0386, code lost:
    
        r2 = new java.lang.StringBuilder().append(r29);
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r29 = r2.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select descrizione from clienti where codice = '" + cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 + "'")).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x03be, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        r7 = cassandraRisto.ital.starter.processBA;
        r10 = cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        r11 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor) anywheresoftware.b4a.keywords.Common.Null);
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvv1(r7, r8, 0, r10, r11, 0, 0.0d, 0.0d, 0, false, 0.0d, 0, 0.0d, 0.0d, false, r29, cassandraRisto.ital.main._v_stampaconto, "", 0.0d, 0, 0.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x03fb, code lost:
    
        r8.Close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:?, code lost:
    
        return anywheresoftware.b4a.BA.NumberToString(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0972, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.IsNumber(r9[0]) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x1344, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x1345, code lost:
    
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x05b8, code lost:
    
        cassandraRisto.ital.starter.processBA.setLastException(r2);
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.starter.processBA, "Errore importazione prenotazione dal Web \n" + anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.starter.processBA).getMessage());
        r38 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x05b7, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01df, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01e0, code lost:
    
        cassandraRisto.ital.starter.processBA.setLastException(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01e7, code lost:
    
        if (r9 == 9) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0974, code lost:
    
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r10 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select timelast from tavoli where tavolo = " + r9[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01f3, code lost:
    
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv6(cassandraRisto.ital.starter.processBA, 500);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01e9, code lost:
    
        r2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r42, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:?, code lost:
    
        return "Err";
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x099d, code lost:
    
        if (r9[1].equals("") != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x09a9, code lost:
    
        if (r9[1].equals("web") != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x09b4, code lost:
    
        if (r9[1].equals("azzera") != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x09bd, code lost:
    
        if (r9[1].equals(r10) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0a0d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x09c4, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Not(r4) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x09c6, code lost:
    
        r29.Close();
        r2 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File.Delete(r42, r5);
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(cassandraRisto.ital.starter.processBA, "Importazione da Palmare annullata:\nParametro1=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", r9[1]) + "\nParametro2=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", r10) + "\t\t\n\t\t");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x09bf, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0a0f, code lost:
    
        r9 = r29.ReadLine();
        r30 = new anywheresoftware.b4a.objects.collections.List();
        r31 = new anywheresoftware.b4a.objects.collections.List();
        r30.Initialize();
        r31.Initialize();
        r16 = true;
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
        r10 = r9;
        r9 = false;
        r3 = "";
        r2 = 0;
        r4 = 0;
        r6 = false;
        r7 = false;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0a3b, code lost:
    
        if (r10 == null) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0a42, code lost:
    
        if (r10.length() < 3) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0a52, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Asc(anywheresoftware.b4a.BA.ObjectToChar(r10.substring(0, 1))) != 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0b5e, code lost:
    
        java.util.Arrays.fill(new java.lang.String[0], "");
        r11 = anywheresoftware.b4a.keywords.Common.Regex;
        r17 = anywheresoftware.b4a.keywords.Regex.Split(",", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0b72, code lost:
    
        if (r17.length != 2) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0cb4, code lost:
    
        r11 = (int) java.lang.Double.parseDouble(r17[10]);
        r15 = (int) java.lang.Double.parseDouble(r17[17]);
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0ccc, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0cd0, code lost:
    
        if (r15 != 10) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0cd2, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0cd5, code lost:
    
        if (r15 != 80) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0cd7, code lost:
    
        r15 = 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0cdb, code lost:
    
        if (r15 != 10) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0cdd, code lost:
    
        r27 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0ceb, code lost:
    
        if (java.lang.Double.parseDouble(r17[2]) <= 0.0d) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0ced, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0cef, code lost:
    
        if (r45 != 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0cfb, code lost:
    
        if (r17[21].startsWith("WEB\t") == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0d05, code lost:
    
        if (cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.equals("") == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0d07, code lost:
    
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = r17[21].substring(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0d12, code lost:
    
        if (r4 == r11) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0d14, code lost:
    
        r4 = r17[14].equals(anywheresoftware.b4a.BA.NumberToString(0));
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0d2c, code lost:
    
        if (r11 == 10000) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0d2e, code lost:
    
        r6 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r6 = (long) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " + anywheresoftware.b4a.BA.NumberToString(r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0d54, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0d5a, code lost:
    
        if (cassandraRisto.ital.main._v_turni == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0d5c, code lost:
    
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0d5f, code lost:
    
        if (r45 != 0) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0d65, code lost:
    
        if (r6 <= 0) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0d67, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0d6d, code lost:
    
        if (cassandraRisto.ital.main._v_turni == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0d6f, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv1(cassandraRisto.ital.starter.processBA, (int) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0d7c, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select cliente from headmov where nmov = " + anywheresoftware.b4a.BA.NumberToString(r6));
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0dc8, code lost:
    
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from headmov where fromweb=1 and nmov = " + anywheresoftware.b4a.BA.NumberToString(r6))) <= 0.0d) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0dca, code lost:
    
        r10 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set lock=0,memo='' where tavolo = " + anywheresoftware.b4a.BA.NumberToString(r11));
        cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int) java.lang.Double.parseDouble(r17[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0df8, code lost:
    
        if (cassandraRisto.ital.starter._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 <= 0) goto L259;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0e8a A[Catch: Exception -> 0x0198, TryCatch #3 {Exception -> 0x0198, blocks: (B:3:0x0022, B:5:0x004f, B:6:0x00ea, B:8:0x0106, B:10:0x0116, B:13:0x011e, B:15:0x013c, B:416:0x017f, B:418:0x0190, B:420:0x01cd, B:422:0x01d9, B:16:0x0146, B:18:0x014e, B:26:0x0164, B:28:0x0175, B:31:0x0203, B:389:0x027c, B:391:0x028e, B:393:0x02c5, B:395:0x0386, B:396:0x03be, B:397:0x03fb, B:398:0x03fe, B:404:0x05b8, B:34:0x05e7, B:325:0x064e, B:327:0x065a, B:36:0x0960, B:38:0x096b, B:40:0x0974, B:42:0x099f, B:44:0x09ab, B:46:0x09b6, B:49:0x09c0, B:51:0x09c6, B:54:0x0a0f, B:56:0x0a3d, B:58:0x0a44, B:60:0x0b5e, B:201:0x0b74, B:203:0x0b83, B:204:0x0bfc, B:206:0x0c06, B:208:0x0c18, B:210:0x0c27, B:211:0x0c78, B:213:0x0c80, B:215:0x0c8f, B:216:0x0cae, B:218:0x0c10, B:63:0x0cb4, B:74:0x0ce0, B:78:0x0cf1, B:80:0x0cfd, B:82:0x0d07, B:84:0x0d14, B:86:0x0d2e, B:87:0x0d54, B:89:0x0d5c, B:93:0x0d67, B:95:0x0d6f, B:96:0x0d7c, B:98:0x0dca, B:100:0x0dfa, B:102:0x0e05, B:103:0x0e0b, B:105:0x0e1b, B:106:0x11be, B:107:0x0e13, B:110:0x0e52, B:111:0x0e73, B:115:0x0e82, B:117:0x0e8a, B:119:0x0e92, B:120:0x0e9b, B:122:0x0eac, B:124:0x0eb9, B:125:0x0ebf, B:128:0x0ed4, B:130:0x0ef1, B:131:0x0efa, B:133:0x0f00, B:135:0x0f30, B:137:0x0f5e, B:139:0x0f9c, B:140:0x0fe3, B:142:0x100f, B:143:0x102c, B:145:0x1076, B:147:0x10a4, B:148:0x1228, B:149:0x10d1, B:150:0x1171, B:152:0x1177, B:154:0x117e, B:161:0x1291, B:167:0x12a6, B:157:0x118e, B:171:0x1247, B:174:0x1251, B:176:0x126c, B:179:0x1276, B:181:0x1220, B:182:0x0ec7, B:192:0x1211, B:194:0x11c8, B:196:0x11d4, B:221:0x0a54, B:223:0x0a5d, B:225:0x0a67, B:227:0x0aa4, B:229:0x0aad, B:231:0x0b02, B:233:0x0b5a, B:236:0x12d6, B:239:0x12de, B:241:0x12e4, B:243:0x12ed, B:245:0x1309, B:247:0x1311, B:251:0x1329, B:253:0x133c, B:333:0x0930, B:408:0x01e0, B:412:0x01e9, B:410:0x01f3, B:186:0x11e3, B:259:0x05f6, B:261:0x0647, B:265:0x0663, B:267:0x0676, B:278:0x0697, B:280:0x06af, B:282:0x06ba, B:283:0x06c0, B:285:0x06d0, B:287:0x0739, B:289:0x0799, B:290:0x08e5, B:291:0x07e1, B:292:0x07eb, B:294:0x07f1, B:300:0x07f8, B:303:0x0800, B:306:0x0821, B:309:0x082b, B:312:0x0899, B:315:0x08a1, B:321:0x08dd, B:322:0x06c8, B:23:0x0159), top: B:2:0x0022, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0eac A[Catch: Exception -> 0x0198, TryCatch #3 {Exception -> 0x0198, blocks: (B:3:0x0022, B:5:0x004f, B:6:0x00ea, B:8:0x0106, B:10:0x0116, B:13:0x011e, B:15:0x013c, B:416:0x017f, B:418:0x0190, B:420:0x01cd, B:422:0x01d9, B:16:0x0146, B:18:0x014e, B:26:0x0164, B:28:0x0175, B:31:0x0203, B:389:0x027c, B:391:0x028e, B:393:0x02c5, B:395:0x0386, B:396:0x03be, B:397:0x03fb, B:398:0x03fe, B:404:0x05b8, B:34:0x05e7, B:325:0x064e, B:327:0x065a, B:36:0x0960, B:38:0x096b, B:40:0x0974, B:42:0x099f, B:44:0x09ab, B:46:0x09b6, B:49:0x09c0, B:51:0x09c6, B:54:0x0a0f, B:56:0x0a3d, B:58:0x0a44, B:60:0x0b5e, B:201:0x0b74, B:203:0x0b83, B:204:0x0bfc, B:206:0x0c06, B:208:0x0c18, B:210:0x0c27, B:211:0x0c78, B:213:0x0c80, B:215:0x0c8f, B:216:0x0cae, B:218:0x0c10, B:63:0x0cb4, B:74:0x0ce0, B:78:0x0cf1, B:80:0x0cfd, B:82:0x0d07, B:84:0x0d14, B:86:0x0d2e, B:87:0x0d54, B:89:0x0d5c, B:93:0x0d67, B:95:0x0d6f, B:96:0x0d7c, B:98:0x0dca, B:100:0x0dfa, B:102:0x0e05, B:103:0x0e0b, B:105:0x0e1b, B:106:0x11be, B:107:0x0e13, B:110:0x0e52, B:111:0x0e73, B:115:0x0e82, B:117:0x0e8a, B:119:0x0e92, B:120:0x0e9b, B:122:0x0eac, B:124:0x0eb9, B:125:0x0ebf, B:128:0x0ed4, B:130:0x0ef1, B:131:0x0efa, B:133:0x0f00, B:135:0x0f30, B:137:0x0f5e, B:139:0x0f9c, B:140:0x0fe3, B:142:0x100f, B:143:0x102c, B:145:0x1076, B:147:0x10a4, B:148:0x1228, B:149:0x10d1, B:150:0x1171, B:152:0x1177, B:154:0x117e, B:161:0x1291, B:167:0x12a6, B:157:0x118e, B:171:0x1247, B:174:0x1251, B:176:0x126c, B:179:0x1276, B:181:0x1220, B:182:0x0ec7, B:192:0x1211, B:194:0x11c8, B:196:0x11d4, B:221:0x0a54, B:223:0x0a5d, B:225:0x0a67, B:227:0x0aa4, B:229:0x0aad, B:231:0x0b02, B:233:0x0b5a, B:236:0x12d6, B:239:0x12de, B:241:0x12e4, B:243:0x12ed, B:245:0x1309, B:247:0x1311, B:251:0x1329, B:253:0x133c, B:333:0x0930, B:408:0x01e0, B:412:0x01e9, B:410:0x01f3, B:186:0x11e3, B:259:0x05f6, B:261:0x0647, B:265:0x0663, B:267:0x0676, B:278:0x0697, B:280:0x06af, B:282:0x06ba, B:283:0x06c0, B:285:0x06d0, B:287:0x0739, B:289:0x0799, B:290:0x08e5, B:291:0x07e1, B:292:0x07eb, B:294:0x07f1, B:300:0x07f8, B:303:0x0800, B:306:0x0821, B:309:0x082b, B:312:0x0899, B:315:0x08a1, B:321:0x08dd, B:322:0x06c8, B:23:0x0159), top: B:2:0x0022, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0ef1 A[Catch: Exception -> 0x0198, TryCatch #3 {Exception -> 0x0198, blocks: (B:3:0x0022, B:5:0x004f, B:6:0x00ea, B:8:0x0106, B:10:0x0116, B:13:0x011e, B:15:0x013c, B:416:0x017f, B:418:0x0190, B:420:0x01cd, B:422:0x01d9, B:16:0x0146, B:18:0x014e, B:26:0x0164, B:28:0x0175, B:31:0x0203, B:389:0x027c, B:391:0x028e, B:393:0x02c5, B:395:0x0386, B:396:0x03be, B:397:0x03fb, B:398:0x03fe, B:404:0x05b8, B:34:0x05e7, B:325:0x064e, B:327:0x065a, B:36:0x0960, B:38:0x096b, B:40:0x0974, B:42:0x099f, B:44:0x09ab, B:46:0x09b6, B:49:0x09c0, B:51:0x09c6, B:54:0x0a0f, B:56:0x0a3d, B:58:0x0a44, B:60:0x0b5e, B:201:0x0b74, B:203:0x0b83, B:204:0x0bfc, B:206:0x0c06, B:208:0x0c18, B:210:0x0c27, B:211:0x0c78, B:213:0x0c80, B:215:0x0c8f, B:216:0x0cae, B:218:0x0c10, B:63:0x0cb4, B:74:0x0ce0, B:78:0x0cf1, B:80:0x0cfd, B:82:0x0d07, B:84:0x0d14, B:86:0x0d2e, B:87:0x0d54, B:89:0x0d5c, B:93:0x0d67, B:95:0x0d6f, B:96:0x0d7c, B:98:0x0dca, B:100:0x0dfa, B:102:0x0e05, B:103:0x0e0b, B:105:0x0e1b, B:106:0x11be, B:107:0x0e13, B:110:0x0e52, B:111:0x0e73, B:115:0x0e82, B:117:0x0e8a, B:119:0x0e92, B:120:0x0e9b, B:122:0x0eac, B:124:0x0eb9, B:125:0x0ebf, B:128:0x0ed4, B:130:0x0ef1, B:131:0x0efa, B:133:0x0f00, B:135:0x0f30, B:137:0x0f5e, B:139:0x0f9c, B:140:0x0fe3, B:142:0x100f, B:143:0x102c, B:145:0x1076, B:147:0x10a4, B:148:0x1228, B:149:0x10d1, B:150:0x1171, B:152:0x1177, B:154:0x117e, B:161:0x1291, B:167:0x12a6, B:157:0x118e, B:171:0x1247, B:174:0x1251, B:176:0x126c, B:179:0x1276, B:181:0x1220, B:182:0x0ec7, B:192:0x1211, B:194:0x11c8, B:196:0x11d4, B:221:0x0a54, B:223:0x0a5d, B:225:0x0a67, B:227:0x0aa4, B:229:0x0aad, B:231:0x0b02, B:233:0x0b5a, B:236:0x12d6, B:239:0x12de, B:241:0x12e4, B:243:0x12ed, B:245:0x1309, B:247:0x1311, B:251:0x1329, B:253:0x133c, B:333:0x0930, B:408:0x01e0, B:412:0x01e9, B:410:0x01f3, B:186:0x11e3, B:259:0x05f6, B:261:0x0647, B:265:0x0663, B:267:0x0676, B:278:0x0697, B:280:0x06af, B:282:0x06ba, B:283:0x06c0, B:285:0x06d0, B:287:0x0739, B:289:0x0799, B:290:0x08e5, B:291:0x07e1, B:292:0x07eb, B:294:0x07f1, B:300:0x07f8, B:303:0x0800, B:306:0x0821, B:309:0x082b, B:312:0x0899, B:315:0x08a1, B:321:0x08dd, B:322:0x06c8, B:23:0x0159), top: B:2:0x0022, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0f00 A[Catch: Exception -> 0x0198, TryCatch #3 {Exception -> 0x0198, blocks: (B:3:0x0022, B:5:0x004f, B:6:0x00ea, B:8:0x0106, B:10:0x0116, B:13:0x011e, B:15:0x013c, B:416:0x017f, B:418:0x0190, B:420:0x01cd, B:422:0x01d9, B:16:0x0146, B:18:0x014e, B:26:0x0164, B:28:0x0175, B:31:0x0203, B:389:0x027c, B:391:0x028e, B:393:0x02c5, B:395:0x0386, B:396:0x03be, B:397:0x03fb, B:398:0x03fe, B:404:0x05b8, B:34:0x05e7, B:325:0x064e, B:327:0x065a, B:36:0x0960, B:38:0x096b, B:40:0x0974, B:42:0x099f, B:44:0x09ab, B:46:0x09b6, B:49:0x09c0, B:51:0x09c6, B:54:0x0a0f, B:56:0x0a3d, B:58:0x0a44, B:60:0x0b5e, B:201:0x0b74, B:203:0x0b83, B:204:0x0bfc, B:206:0x0c06, B:208:0x0c18, B:210:0x0c27, B:211:0x0c78, B:213:0x0c80, B:215:0x0c8f, B:216:0x0cae, B:218:0x0c10, B:63:0x0cb4, B:74:0x0ce0, B:78:0x0cf1, B:80:0x0cfd, B:82:0x0d07, B:84:0x0d14, B:86:0x0d2e, B:87:0x0d54, B:89:0x0d5c, B:93:0x0d67, B:95:0x0d6f, B:96:0x0d7c, B:98:0x0dca, B:100:0x0dfa, B:102:0x0e05, B:103:0x0e0b, B:105:0x0e1b, B:106:0x11be, B:107:0x0e13, B:110:0x0e52, B:111:0x0e73, B:115:0x0e82, B:117:0x0e8a, B:119:0x0e92, B:120:0x0e9b, B:122:0x0eac, B:124:0x0eb9, B:125:0x0ebf, B:128:0x0ed4, B:130:0x0ef1, B:131:0x0efa, B:133:0x0f00, B:135:0x0f30, B:137:0x0f5e, B:139:0x0f9c, B:140:0x0fe3, B:142:0x100f, B:143:0x102c, B:145:0x1076, B:147:0x10a4, B:148:0x1228, B:149:0x10d1, B:150:0x1171, B:152:0x1177, B:154:0x117e, B:161:0x1291, B:167:0x12a6, B:157:0x118e, B:171:0x1247, B:174:0x1251, B:176:0x126c, B:179:0x1276, B:181:0x1220, B:182:0x0ec7, B:192:0x1211, B:194:0x11c8, B:196:0x11d4, B:221:0x0a54, B:223:0x0a5d, B:225:0x0a67, B:227:0x0aa4, B:229:0x0aad, B:231:0x0b02, B:233:0x0b5a, B:236:0x12d6, B:239:0x12de, B:241:0x12e4, B:243:0x12ed, B:245:0x1309, B:247:0x1311, B:251:0x1329, B:253:0x133c, B:333:0x0930, B:408:0x01e0, B:412:0x01e9, B:410:0x01f3, B:186:0x11e3, B:259:0x05f6, B:261:0x0647, B:265:0x0663, B:267:0x0676, B:278:0x0697, B:280:0x06af, B:282:0x06ba, B:283:0x06c0, B:285:0x06d0, B:287:0x0739, B:289:0x0799, B:290:0x08e5, B:291:0x07e1, B:292:0x07eb, B:294:0x07f1, B:300:0x07f8, B:303:0x0800, B:306:0x0821, B:309:0x082b, B:312:0x0899, B:315:0x08a1, B:321:0x08dd, B:322:0x06c8, B:23:0x0159), top: B:2:0x0022, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x126c A[Catch: Exception -> 0x0198, TryCatch #3 {Exception -> 0x0198, blocks: (B:3:0x0022, B:5:0x004f, B:6:0x00ea, B:8:0x0106, B:10:0x0116, B:13:0x011e, B:15:0x013c, B:416:0x017f, B:418:0x0190, B:420:0x01cd, B:422:0x01d9, B:16:0x0146, B:18:0x014e, B:26:0x0164, B:28:0x0175, B:31:0x0203, B:389:0x027c, B:391:0x028e, B:393:0x02c5, B:395:0x0386, B:396:0x03be, B:397:0x03fb, B:398:0x03fe, B:404:0x05b8, B:34:0x05e7, B:325:0x064e, B:327:0x065a, B:36:0x0960, B:38:0x096b, B:40:0x0974, B:42:0x099f, B:44:0x09ab, B:46:0x09b6, B:49:0x09c0, B:51:0x09c6, B:54:0x0a0f, B:56:0x0a3d, B:58:0x0a44, B:60:0x0b5e, B:201:0x0b74, B:203:0x0b83, B:204:0x0bfc, B:206:0x0c06, B:208:0x0c18, B:210:0x0c27, B:211:0x0c78, B:213:0x0c80, B:215:0x0c8f, B:216:0x0cae, B:218:0x0c10, B:63:0x0cb4, B:74:0x0ce0, B:78:0x0cf1, B:80:0x0cfd, B:82:0x0d07, B:84:0x0d14, B:86:0x0d2e, B:87:0x0d54, B:89:0x0d5c, B:93:0x0d67, B:95:0x0d6f, B:96:0x0d7c, B:98:0x0dca, B:100:0x0dfa, B:102:0x0e05, B:103:0x0e0b, B:105:0x0e1b, B:106:0x11be, B:107:0x0e13, B:110:0x0e52, B:111:0x0e73, B:115:0x0e82, B:117:0x0e8a, B:119:0x0e92, B:120:0x0e9b, B:122:0x0eac, B:124:0x0eb9, B:125:0x0ebf, B:128:0x0ed4, B:130:0x0ef1, B:131:0x0efa, B:133:0x0f00, B:135:0x0f30, B:137:0x0f5e, B:139:0x0f9c, B:140:0x0fe3, B:142:0x100f, B:143:0x102c, B:145:0x1076, B:147:0x10a4, B:148:0x1228, B:149:0x10d1, B:150:0x1171, B:152:0x1177, B:154:0x117e, B:161:0x1291, B:167:0x12a6, B:157:0x118e, B:171:0x1247, B:174:0x1251, B:176:0x126c, B:179:0x1276, B:181:0x1220, B:182:0x0ec7, B:192:0x1211, B:194:0x11c8, B:196:0x11d4, B:221:0x0a54, B:223:0x0a5d, B:225:0x0a67, B:227:0x0aa4, B:229:0x0aad, B:231:0x0b02, B:233:0x0b5a, B:236:0x12d6, B:239:0x12de, B:241:0x12e4, B:243:0x12ed, B:245:0x1309, B:247:0x1311, B:251:0x1329, B:253:0x133c, B:333:0x0930, B:408:0x01e0, B:412:0x01e9, B:410:0x01f3, B:186:0x11e3, B:259:0x05f6, B:261:0x0647, B:265:0x0663, B:267:0x0676, B:278:0x0697, B:280:0x06af, B:282:0x06ba, B:283:0x06c0, B:285:0x06d0, B:287:0x0739, B:289:0x0799, B:290:0x08e5, B:291:0x07e1, B:292:0x07eb, B:294:0x07f1, B:300:0x07f8, B:303:0x0800, B:306:0x0821, B:309:0x082b, B:312:0x0899, B:315:0x08a1, B:321:0x08dd, B:322:0x06c8, B:23:0x0159), top: B:2:0x0022, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str, java.lang.String str2, boolean z, int i, long j) throws java.lang.Exception {
        anywheresoftware.b4a.objects.streams.File.TextReaderWrapper textReaderWrapper;
        boolean z2;
        anywheresoftware.b4a.objects.collections.List list;
        anywheresoftware.b4a.objects.collections.List list2;
        boolean z3;
        java.lang.String str3;
        boolean z4;
        java.lang.String str4;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        long j2;
        java.lang.String[] Split;
        int parseDouble;
        int parseDouble2;
        boolean z7;
        int i4;
        boolean z8;
        int i5;
        boolean z9;
        long j3;
        boolean z10;
        java.lang.String ReadLine;
        boolean equals;
        java.lang.String str5 = "";
        try {
            anywheresoftware.b4a.objects.collections.List list3 = new anywheresoftware.b4a.objects.collections.List();
            list3.Initialize();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(str + "/IMG", "Miotmp.png")) {
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("Messaggio dal terminale ").append(str2).append("\n").append(" Inviato alle ");
                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetHour(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)), 2, 0)).append(":");
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String sb = append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetMinute(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA)), 2, 0)).toString();
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str + "/IMG", "Miotmp.png");
                anywheresoftware.b4a.keywords.Common.CallSubNew3(processBA, "Main", "ShowMsgPalm", "Miotmp.png\t" + str + "/IMG", sb);
            }
            anywheresoftware.b4a.objects.collections.List list4 = new anywheresoftware.b4a.objects.collections.List();
            list4.Initialize();
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            list4.AddAll(anywheresoftware.b4a.objects.streams.File.ListFiles(str));
            int size = list4.getSize() - 1;
            int i6 = 0;
            while (true) {
                if (i6 > size) {
                    break;
                }
                str5 = anywheresoftware.b4a.BA.ObjectToString(list4.Get(i6));
                if (str5.contains("_") && str5.startsWith("Vend")) {
                    java.util.Arrays.fill(new java.lang.String[0], "");
                    anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                    java.lang.String[] Split2 = anywheresoftware.b4a.keywords.Regex.Split("_", str5);
                    if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ContainsKey(str2))) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Put(str2, Split2[1]);
                    } else {
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get(str2).equals(Split2[1])) {
                            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                            anywheresoftware.b4a.objects.streams.File.Delete(str, str5);
                            return str5;
                        }
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Put(str2, Split2[1]);
                    }
                } else {
                    str5 = "";
                    i6++;
                }
            }
            if (i2 > 0) {
                i2++;
                z9 = false;
                list.Add(java.lang.Long.valueOf(j3));
                if (parseDouble2 > 0 && parseDouble2 != 90) {
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_attivaterminale) {
                        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                            list2.Add(java.lang.Long.valueOf(j3));
                        }
                    }
                }
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int) java.lang.Double.parseDouble(Split[16]);
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 > 0) {
                    double d = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = cassandraRisto.ital.main._operatore;
                i4 = parseDouble;
                z8 = equals;
                i5 = i2;
                anywheresoftware.b4a.BA.NumberToString(0);
                map.Put(Split[4], 1);
                if (!Split[9].trim().equals(str4)) {
                    str4 = Split[9].trim();
                }
                if (!anywheresoftware.b4a.keywords.Common.Not(z9)) {
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from Venduto where idRiga = '" + Split[4] + "'")) > 0.0d) {
                        java.lang.String str6 = "tmpStampaPalm" + anywheresoftware.b4a.BA.NumberToString((int) java.lang.Double.parseDouble(str2.substring(3)));
                        cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_regcancellazioni) {
                            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            double parseDouble3 = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select case when qta is null then 0 else qta end from Venduto where idRiga = '" + Split[4] + "'"));
                            cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int) (parseDouble3 - cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA, Split[2]));
                            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 > 0) {
                                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv3(processBA, "Select codint,round(prezzov * " + anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) + " ,2) as importo," + anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) + " as qta,brep from venduto where idRiga = '" + Split[4] + "'", j3, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, parseDouble);
                            }
                        }
                        java.lang.String str7 = " totcre ='" + Split[9] + "'";
                        if (Split[14].equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                            str7 = " totcre ='1234" + Split[9] + "'";
                        }
                        cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update " + str6 + " set " + str7 + " where idRiga = '" + Split[4] + "'");
                        java.lang.String str8 = "";
                        if (java.lang.Double.parseDouble(Split[24]) > 0.0d) {
                            cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select memo from Venduto  where idRiga = '" + Split[4] + "'");
                            if (ExecQuerySingleResult.contains("(")) {
                                str8 = ",memo='-Sottoconto " + Split[24] + ExecQuerySingleResult.substring(ExecQuerySingleResult.lastIndexOf("(") - 1) + "'";
                            } else {
                                str8 = ",memo='-Sottoconto " + Split[24] + "-' ";
                            }
                        }
                        cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update Venduto set " + str7 + ",codice='" + Split[0] + "',descrizione='" + Split[1] + "',qta=" + Split[2] + " ,prezzov=" + Split[3] + ",importo=" + Split[7] + ",turno = " + Split[19] + ",sottoconto = " + Split[24] + ",sottocontoT = " + Split[25] + str8 + " where idRiga = '" + Split[4] + "'");
                        z10 = true;
                    } else {
                        list3.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(Split, (int) j3, str, i5, i == 1, 0L, true).getObject());
                        z10 = true;
                    }
                } else {
                    list3.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(Split, (int) j3, str, i5, i == 1, 0L, true).getObject());
                    z10 = true;
                }
                ReadLine = textReaderWrapper.ReadLine();
                if (ReadLine != null || ReadLine.length() < 3 || anywheresoftware.b4a.keywords.Common.Asc(anywheresoftware.b4a.BA.ObjectToChar(ReadLine.substring(0, 1))) == 0) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(j3, map, list3, z10, parseDouble, z9, str2, (int) java.lang.Double.parseDouble(Split[15]), parseDouble2, z3, Split[14].equals(anywheresoftware.b4a.BA.NumberToString(0)), i);
                    z4 = z7;
                    str3 = ReadLine;
                    i2 = i5;
                    i3 = i4;
                    long j4 = j3;
                    z5 = z8;
                    z6 = z9;
                    j2 = j4;
                } else {
                    anywheresoftware.b4a.keywords.Regex regex2 = anywheresoftware.b4a.keywords.Common.Regex;
                    java.lang.String[] Split3 = anywheresoftware.b4a.keywords.Regex.Split(",", ReadLine);
                    if (((int) java.lang.Double.parseDouble(Split3[10])) != parseDouble) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(j3, map, list3, z10, parseDouble, z9, str2, (int) java.lang.Double.parseDouble(Split3[15]), parseDouble2, z3, Split3[14].equals(anywheresoftware.b4a.BA.NumberToString(0)), i);
                        z4 = z7;
                        str3 = ReadLine;
                        i2 = i5;
                        i3 = i4;
                        long j5 = j3;
                        z5 = z8;
                        z6 = z9;
                        j2 = j5;
                    } else {
                        z4 = z7;
                        str3 = ReadLine;
                        i2 = i5;
                        i3 = i4;
                        long j6 = j3;
                        z5 = z8;
                        z6 = z9;
                        j2 = j6;
                    }
                }
            }
            z9 = false;
            list.Add(java.lang.Long.valueOf(j3));
            if (parseDouble2 > 0) {
                cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_attivaterminale) {
                }
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int) java.lang.Double.parseDouble(Split[16]);
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 > 0) {
            }
            cassandraRisto.ital.main mainVar42 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = cassandraRisto.ital.main._operatore;
            i4 = parseDouble;
            z8 = equals;
            i5 = i2;
            anywheresoftware.b4a.BA.NumberToString(0);
            map.Put(Split[4], 1);
            if (!Split[9].trim().equals(str4)) {
            }
            if (!anywheresoftware.b4a.keywords.Common.Not(z9)) {
            }
            ReadLine = textReaderWrapper.ReadLine();
            if (ReadLine != null) {
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(j3, map, list3, z10, parseDouble, z9, str2, (int) java.lang.Double.parseDouble(Split[15]), parseDouble2, z3, Split[14].equals(anywheresoftware.b4a.BA.NumberToString(0)), i);
            z4 = z7;
            str3 = ReadLine;
            i2 = i5;
            i3 = i4;
            long j42 = j3;
            z5 = z8;
            z6 = z9;
            j2 = j42;
            textReaderWrapper.Close();
            anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
            anywheresoftware.b4a.objects.streams.File.Delete(str, str5);
            if (z2) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(true);
                return str5;
            }
            return str5;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            if (!str5.equals("")) {
                anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(str, "vend.csv");
                anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.Delete(str, str5);
            }
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "Err";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.Servlet.ServletRequestWrapper servletRequestWrapper, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws java.lang.Exception {
        java.lang.String str5 = "";
        java.lang.String str6 = "";
        java.lang.String GetParameter = servletRequestWrapper.GetParameter("dadata");
        java.lang.String GetParameter2 = servletRequestWrapper.GetParameter("adata");
        java.lang.String GetParameter3 = servletRequestWrapper.GetParameter("reparto");
        java.lang.String GetParameter4 = servletRequestWrapper.GetParameter("movimento");
        java.lang.String GetParameter5 = servletRequestWrapper.GetParameter("documento");
        java.lang.String GetParameter6 = servletRequestWrapper.GetParameter("articolo");
        java.lang.String GetParameter7 = servletRequestWrapper.GetParameter("cliente");
        java.lang.String GetParameter8 = servletRequestWrapper.GetParameter("operatore");
        if (GetParameter.length() == 10 && GetParameter2.length() == 10) {
            str5 = "datam3 > '" + GetParameter.substring(6, 10) + "-" + GetParameter.substring(3, 5) + "-" + GetParameter.substring(0, 2) + " 00:00:00' and datam3 < '" + GetParameter2.substring(6, 10) + "-" + GetParameter2.substring(3, 5) + "-" + GetParameter2.substring(0, 2) + " 23:59:59' and ";
            str6 = " Data compresa tra " + GetParameter + " e " + GetParameter2 + " - ";
        }
        if ((str2.equals("RepartiStorici") || str2.equals("ArticoliStorici") || str2.equals("IvaStorici")) && GetParameter3.length() > 0 && GetParameter3.length() < 3 && anywheresoftware.b4a.keywords.Common.IsNumber(GetParameter3)) {
            str5 = str5 + "reparto =" + GetParameter3 + " and ";
            str6 = str6 + " reparto = " + GetParameter3 + " - ";
        }
        if ((str2.equals("RepartiStorici") || str2.equals("ArticoliStorici") || str2.equals("IvaStorici") || str2.equals("PagamentiStorici") || str2.equals("ClientiStorici") || str2.equals("OperatoriStorici")) && GetParameter4.length() > 0 && GetParameter4.length() < 10 && anywheresoftware.b4a.keywords.Common.IsNumber(GetParameter4)) {
            str5 = str5 + "nmov =" + GetParameter4 + " and ";
            str6 = str6 + " Movimento num. " + GetParameter4 + " - ";
        }
        if (str2.equals("RepartiStorici") || str2.equals("ArticoliStorici") || str2.equals("IvaStorici") || str2.equals("ClientiStorici") || str2.equals("OperatoriStorici")) {
            str5 = str5 + " causale ='sc' and ";
            if (GetParameter5.length() == 1) {
                if (GetParameter5.equals("S")) {
                    str5 = str5 + "venduto.flgNF =0 and nfat =0 and nric =0 and ";
                    str6 = str6 + " Documenti = Scontrini - ";
                }
                if (GetParameter5.equals("F")) {
                    str5 = str5 + "  nfat >0 and ";
                    str6 = str6 + " Documenti = Fatture - ";
                }
                if (GetParameter5.equals("N")) {
                    str5 = str5 + "venduto.flgNF =1 and nfat =0 and nric =0 and ";
                    str6 = str6 + " Documenti = Altro - ";
                }
                if (GetParameter5.equals("R")) {
                    str5 = str5 + " nric >0 AND ";
                    str6 = str6 + " Documenti = Ricevute - ";
                }
                if (GetParameter5.equals("B")) {
                    str5 = str5 + "not(venduto.flgNF =1 and nfat =0 and nric =0) and ";
                    str6 = str6 + " Documenti = Scontrino,Fattura,Ricevuta - ";
                }
            }
        }
        if ((str2.equals("RepartiStorici") || str2.equals("ArticoliStorici") || str2.equals("IvaStorici")) && GetParameter6.length() > 0 && GetParameter6.length() <= 20) {
            str5 = str5 + "venduto.codint =" + GetParameter6 + " and ";
            str6 = str6 + " Codice Articolo = " + GetParameter6 + " - ";
        }
        if ((str2.equals("RepartiStorici") || str2.equals("ArticoliStorici") || str2.equals("IvaStorici") || str2.equals("ClientiStorici") || str2.equals("OperatoriStorici")) && GetParameter7.length() > 0 && GetParameter7.length() <= 20 && anywheresoftware.b4a.keywords.Common.IsNumber(GetParameter7)) {
            str5 = str5 + "venduto.cliente =" + GetParameter7 + " and ";
            str6 = str6 + " Codice cliente = " + GetParameter7 + " - ";
        }
        if ((str2.equals("RepartiStorici") || str2.equals("ArticoliStorici") || str2.equals("IvaStorici")) && GetParameter8.length() > 0 && GetParameter7.length() <= 2 && anywheresoftware.b4a.keywords.Common.IsNumber(GetParameter8)) {
            str5 = str5 + "(Select count(*) from headmov where headmov.nmov = venduto.nmov AND Operatore =" + GetParameter8 + ") >0 AND ";
            str6 = str6 + " Operatore = " + GetParameter8 + " - ";
        }
        if (str5.length() > 4) {
            java.lang.String substring = str5.substring(0, str5.length() - 4);
            java.lang.String substring2 = str6.substring(0, str6.length() - 3);
            if (substring.equals("")) {
                return str + "<DIV align=center><B><font size='6' color='red'> è necessario passare un filtro a questa stampa ...</font></B></DIV>";
            }
            try {
                switch (anywheresoftware.b4a.BA.switchObjectToInt(str2, "RepartiStorici", "ArticoliStorici", "IvaStorici", "PagamentiStorici", "ClientiStorici", "OperatoriStorici")) {
                    case 0:
                        java.lang.StringBuilder append = new java.lang.StringBuilder().append(str);
                        cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        anywheresoftware.b4a.BA ba = processBA;
                        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        str = append.append(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Select  reparto as Codice,max(reparti.descrizione) as descrizione,sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join reparti on reparti.codice = venduto.reparto  where sospeso =0 and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg' and " + substring + " group by reparto order by reparto ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, str3 + " and " + substring, str4 + " and " + substring)).toString();
                        break;
                    case 1:
                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append(str);
                        cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        anywheresoftware.b4a.BA ba2 = processBA;
                        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        str = append2.append(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Select codint as Codice,descrizione,sum(qta) As qta,sum(importo+importo2) as importo,sum(prezzov*qta) - sum(importo) as sconto from Venduto  where sospeso =0 and brep = 0  and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg' And lower(substr(venduto.codice,1,2))<>'vv' and " + substring + "  group by codint,descrizione order by Qta desc limit 1000 ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, str3 + " and " + substring, str4 + " and " + substring)).toString();
                        break;
                    case 2:
                        java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(str);
                        cassandraRisto.ital.dbutil dbutilVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        anywheresoftware.b4a.BA ba3 = processBA;
                        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        str = append3.append(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Select  iva as Codice,max(iva.descrizione) as descrizione,sum(" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 + ") As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join iva on iva.codice = venduto.iva  where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' and " + substring + "  group by iva order by iva ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, str3 + " and " + substring, str4 + " and " + substring)).toString();
                        break;
                    case 3:
                        java.lang.StringBuilder append4 = new java.lang.StringBuilder().append(str);
                        cassandraRisto.ital.dbutil dbutilVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        anywheresoftware.b4a.BA ba4 = processBA;
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        str = append4.append(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba4, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Select  Codice,max(descrizione) as descrizione,sum(qta) As Qta,sum(importo) as Importo  from CausaliPagamenti  where sospeso =0  and " + substring + "   group by codice order by codice", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, str3 + " and " + substring, str4 + " and " + substring)).toString();
                        break;
                    case 4:
                        java.lang.String replace = substring.replace("venduto.", "headmov.");
                        java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(str);
                        cassandraRisto.ital.dbutil dbutilVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        anywheresoftware.b4a.BA ba5 = processBA;
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        str = append5.append(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Select  cliente as Codice,max(clides) as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov  where sospeso =0  and " + replace + "   group by codice order by codice ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, str3 + " and " + replace, str4 + " and " + replace)).toString();
                        break;
                    case 5:
                        java.lang.String replace2 = substring.replace("venduto.", "headmov.");
                        java.lang.StringBuilder append6 = new java.lang.StringBuilder().append(str);
                        cassandraRisto.ital.dbutil dbutilVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                        anywheresoftware.b4a.BA ba6 = processBA;
                        cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        str = append6.append(cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(ba6, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, "Select  operatore as Codice,opdes as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov  where sospeso =0   and " + replace2 + " group by codice,opdes order by codice ", (java.lang.String[]) anywheresoftware.b4a.keywords.Common.Null, 0, false, 3, 4, -1, str3 + " and " + replace2, str4 + " and " + replace2)).toString();
                        break;
                }
                java.lang.StringBuilder append7 = new java.lang.StringBuilder().append(str);
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                java.lang.String sb = append7.append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "FootStampe")).toString();
                if (str2.equals("ArticoliStorici")) {
                    java.lang.String replace3 = sb.replace("%FILTRO%", substring2);
                    cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    return replace3.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", "Articoli Storici più venduti (massimo 1000 righe)").replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                }
                java.lang.String replace4 = sb.replace("%FILTRO%", substring2);
                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                return replace4.replace("%NOMENEGOZIO%", cassandraRisto.ital.main._v_mdesmittente).replace("%NOMERAPPORTO%", str2).replace("%TICK%", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
            } catch (java.lang.Exception e) {
                processBA.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                return str;
            }
        }
        return str + "<DIV align=center><B><font size='6' color='red'>E' necessairo applicare almeno un filtro ...</font></B></DIV>";
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x03ad, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 100) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03b7, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        r2 = new java.lang.StringBuilder().append(" and tipo =");
        r3 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = r2.append(anywheresoftware.b4a.BA.NumberToString(cassandraRisto.ital.main._t_tavolo)).append(" and valore = ").append(anywheresoftware.b4a.BA.NumberToString(r19)).append(" ").toString();
        r2 = cassandraRisto.ital.starter.processBA;
        r5 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.CallSubNew2(r2, "Main", "CambiaPagina", java.lang.Integer.valueOf(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0409, code lost:
    
        r2 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x040f, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0415, code lost:
    
        if (r19 == 10000) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0417, code lost:
    
        r3 = cassandraRisto.ital.starter.processBA;
        r4 = cassandraRisto.ital.starter.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        anywheresoftware.b4a.keywords.Common.CallSubNew3(r3, cassandraRisto.ital.httpclient.getObject(), "SendVariazioneTavoloAiClient", new int[]{r19}, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03b5, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0686 A[Catch: Exception -> 0x00da, TryCatch #1 {Exception -> 0x00da, blocks: (B:5:0x0012, B:7:0x0018, B:9:0x004f, B:11:0x0058, B:13:0x006d, B:16:0x00ae, B:18:0x007f, B:20:0x0085, B:22:0x00b1, B:25:0x00f6, B:26:0x00f9, B:27:0x0165, B:29:0x016b, B:30:0x018b, B:32:0x0191, B:34:0x01e4, B:36:0x01ed, B:38:0x02b8, B:42:0x02c3, B:48:0x043c, B:52:0x0477, B:55:0x0582, B:50:0x05ab, B:64:0x0591, B:66:0x02f1, B:67:0x05dc, B:70:0x0608, B:78:0x0322, B:80:0x035b, B:81:0x039b, B:83:0x03a5, B:85:0x03b7, B:86:0x0409, B:90:0x0417, B:96:0x03af, B:103:0x0625, B:108:0x066f, B:110:0x0677, B:113:0x0680, B:115:0x0686, B:121:0x06a6, B:122:0x024b, B:125:0x0287, B:59:0x0444), top: B:2:0x000e, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(long j, anywheresoftware.b4a.objects.collections.Map map, anywheresoftware.b4a.objects.collections.List list, boolean z, int i, boolean z2, java.lang.String str, int i2, int i3, boolean z3, boolean z4, int i4) throws java.lang.Exception {
        boolean z5;
        java.lang.String str2;
        try {
            if (i != 10000 && i4 == 0) {
                if (anywheresoftware.b4a.keywords.Common.Not(z4)) {
                    new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select idRiga,qta from Venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(j)));
                    if (cursorWrapper2.getRowCount() > 0) {
                        int rowCount = cursorWrapper2.getRowCount() - 1;
                        for (int i5 = 0; i5 <= rowCount; i5++) {
                            cursorWrapper2.setPosition(i5);
                            if (anywheresoftware.b4a.keywords.Common.Not(map.ContainsKey(cursorWrapper2.GetString("idRiga"))) || cursorWrapper2.GetDouble("qta").doubleValue() == 0.0d) {
                                if (z3 && list.getSize() == 0) {
                                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update venduto set qta =0 where idRiga = '" + cursorWrapper2.GetString("idRiga") + "'");
                                } else {
                                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from venduto where idRiga = '" + cursorWrapper2.GetString("idRiga") + "'");
                                }
                            }
                        }
                    }
                    cursorWrapper2.Close();
                } else {
                    java.lang.String str3 = anywheresoftware.b4a.BA.NumberToString(i) + "_" + anywheresoftware.b4a.BA.NumberToString(j) + "_" + str;
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvv1(processBA, true, str3);
                }
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("update tavoli set timelast ='");
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba = processBA;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.StringBuilder append2 = sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                sql.ExecNonQuery(append.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba, append2.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString())).append("',inmodifica =0 where tavolo =").append(anywheresoftware.b4a.BA.NumberToString(i)).toString());
            } else if (i4 == 2) {
                java.lang.String str4 = anywheresoftware.b4a.BA.NumberToString(i) + "_" + anywheresoftware.b4a.BA.NumberToString(j) + "_Web";
                cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvv1(processBA, true, str4);
            }
            if (anywheresoftware.b4a.keywords.Common.Not(z3)) {
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where nmov = " + anywheresoftware.b4a.BA.NumberToString(j));
            }
            if (list.getSize() > 0) {
                cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.BA ba2 = processBA;
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "Venduto", list);
                list.Clear();
                new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select codice,totcre,stampante2,stampaesclusiva from Venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(j) + " and lower(substr(venduto.codice,1,2))<>'vv' and stampante2 > 0"));
                if (cursorWrapper4.getRowCount() > 0) {
                    int rowCount2 = cursorWrapper4.getRowCount() - 1;
                    for (int i6 = 0; i6 <= rowCount2; i6++) {
                        cursorWrapper4.setPosition(i6);
                        cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update venduto set stampante2 = " + cursorWrapper4.GetString("stampante2") + ",stampaesclusiva = " + cursorWrapper4.GetString("stampaesclusiva") + " where nmov = " + anywheresoftware.b4a.BA.NumberToString(j) + " AND lower(substr(venduto.codice,1,2))='vv' and totcre ='" + cursorWrapper4.GetString("totcre") + "'");
                    }
                }
                cursorWrapper4.Close();
            }
            if (z) {
                if (i != 10000) {
                    cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(j)).equals(anywheresoftware.b4a.BA.NumberToString(0)) || z3) {
                        cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update tavoli set tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0 where tavolo = " + anywheresoftware.b4a.BA.NumberToString(i));
                    } else {
                        java.lang.String str5 = " uscita = 0,";
                        if (i4 != 1) {
                            str2 = "";
                        } else {
                            str2 = " lock = 1,";
                        }
                        cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_changeuscita) {
                            try {
                                cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select uscita from venduto where chiave=(select max(chiave) from venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(j) + ")")) > 0.0d) {
                                    str5 = " uscita = 1,";
                                }
                            } catch (java.lang.Exception e) {
                                processBA.setLastException(e);
                                cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
                            }
                        } else {
                            cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from venduto where uscita=1 and nmov = " + anywheresoftware.b4a.BA.NumberToString(j))) > 0.0d) {
                                str5 = " uscita = 1,";
                            }
                        }
                        cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select case when sum(importo) is null then 0 else sum(importo) end from Venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(j));
                        cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.String ExecQuerySingleResult2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " + anywheresoftware.b4a.BA.NumberToString(j));
                        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("update tavoli set ").append(str5).append(" rifheadmov = ").append(anywheresoftware.b4a.BA.NumberToString(j)).append(",").append(str2).append("coperti=").append(ExecQuerySingleResult2).append(",addturni= ");
                        cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.StringBuilder append4 = append3.append(cassandraRisto.ital.mod1._vvvvvvvv7(processBA, j)).append(",inmodifica=0,timelast='");
                        cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA ba3 = processBA;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        java.lang.StringBuilder append5 = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).append(" ");
                        anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                        cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        sql2.ExecNonQuery(append4.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba3, append5.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA))).toString())).append("',importo = ").append(ExecQuerySingleResult.replace(",", ".")).append(" where tavolo = ").append(anywheresoftware.b4a.BA.NumberToString(i)).toString());
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0((int) j, java.lang.Double.parseDouble(ExecQuerySingleResult), i, i3, i4 == 1, true, 0L, "0");
                    }
                } else {
                    cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0((int) j, java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select case when sum(importo) is null then 0 else sum(importo) end from Venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(j))), i, i3, i4 == 1, true, 0L, "0");
                }
            }
            if (i2 == 1 && i != 10000 && i4 == 2) {
                cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv7(processBA, z2, "1_" + anywheresoftware.b4a.BA.NumberToString(j) + "_" + anywheresoftware.b4a.BA.NumberToString(i) + "_Web", false);
            } else if (i2 == 1 && i != 10000 && i4 == 0) {
                cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv7(processBA, z2, "1_" + anywheresoftware.b4a.BA.NumberToString(j) + "_" + anywheresoftware.b4a.BA.NumberToString(i) + "_" + str, false);
            } else {
                if (i2 == 1 && i == 10000) {
                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_asportoora) {
                        cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_asportoanticipo > 0) {
                            z5 = true;
                            if (anywheresoftware.b4a.keywords.Common.Not(z5)) {
                                cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv0(processBA, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7, anywheresoftware.b4a.BA.NumberToString(j), false, true, true);
                            }
                        }
                    }
                    z5 = false;
                    if (anywheresoftware.b4a.keywords.Common.Not(z5)) {
                    }
                }
                if (i2 == 0 && i != 10000 && i4 == 0) {
                    cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(processBA, "Stampa disabilitata da palmare sul tavolo " + anywheresoftware.b4a.BA.NumberToString(i) + " dal terminale " + str);
                }
            }
            if (z3) {
                cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from headmov where nmov = " + anywheresoftware.b4a.BA.NumberToString(j));
                cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from venduto where nmov = " + anywheresoftware.b4a.BA.NumberToString(j));
            }
            cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 10) {
                cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            }
            cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e2) {
            processBA.setLastException(e2);
            cassandraRisto.ital.mod1 mod1Var15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }
}
