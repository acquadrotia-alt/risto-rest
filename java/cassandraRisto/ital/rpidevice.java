package cassandraRisto.ital;

/* loaded from: classes.dex */
public class rpidevice extends android.app.Service {
    static cassandraRisto.ital.rpidevice mostCurrent;
    public static anywheresoftware.b4a.BA processBA;
    private anywheresoftware.b4a.objects.ServiceHelper _service;
    public static anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public static anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public static anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
    public static boolean _vv4 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
    public static anywheresoftware.b4j.objects.MqttAsyncClientWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
    public static anywheresoftware.b4a.randomaccessfile.B4XSerializator _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
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
    public cassandraRisto.ital.stampe _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.stampecustom _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.tabelleappoggio _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.usbpl2303 _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.usbpl2303service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.verificazione _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.httputils2service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.xuiviewsutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;

    public static class rpidevice_BR extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            anywheresoftware.b4a.BA.LogInfo("** Receiver (rpidevice) OnReceive **");
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) cassandraRisto.ital.rpidevice.class);
            if (intent != null) {
                intent2.putExtra("b4a_internal_intent", intent);
            }
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startServiceFromReceiver(context, intent2, false, anywheresoftware.b4a.BA.class);
        }
    }

    public static java.lang.Class<?> getObject() {
        return cassandraRisto.ital.rpidevice.class;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
            processBA = new anywheresoftware.b4a.BA(this, null, null, "cassandraRisto.ital", "cassandraRisto.ital.rpidevice");
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
            processBA.raiseEvent2(null, true, "CREATE", true, "cassandraRisto.ital.rpidevice", processBA, this._service, java.lang.Float.valueOf(anywheresoftware.b4a.keywords.Common.Density));
        }
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false)) {
            processBA.setActivityPaused(false);
            anywheresoftware.b4a.BA.LogInfo("*** Service (rpidevice) Create ***");
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
            cassandraRisto.ital.rpidevice.this.handleStart(this.val$intent);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        if (!anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.onStartCommand(processBA, new cassandraRisto.ital.rpidevice.1(intent))) {
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.addWaitForLayout(new cassandraRisto.ital.rpidevice.2(intent));
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
            cassandraRisto.ital.rpidevice.processBA.setActivityPaused(false);
            anywheresoftware.b4a.BA.LogInfo("** Service (rpidevice) Create **");
            cassandraRisto.ital.rpidevice.processBA.raiseEvent(null, "service_create", new java.lang.Object[0]);
            cassandraRisto.ital.rpidevice.this.handleStart(this.val$intent);
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.removeWaitForLayout();
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        super.onTaskRemoved(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStart(android.content.Intent intent) {
        anywheresoftware.b4a.BA.LogInfo("** Service (rpidevice) Start **");
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
        anywheresoftware.b4a.BA.LogInfo("** Service (rpidevice) Destroy **");
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

    public static java.lang.String _client_connected(boolean z) throws java.lang.Exception {
        try {
            if (z) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Subscribe("all/Term/#", 0);
                if (_vv4) {
                    _vv4 = false;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Srv/Restore", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ConvertObjectToBytes(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
                } else {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Srv/connect", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ConvertObjectToBytes(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
                }
            } else {
                anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Errore di connessione al ServiceBox (" + anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage() + ")"), true);
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _client_disconnected() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0101, code lost:
    
        if (r4 != anywheresoftware.b4a.objects.streams.File.LastModified(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Anagra.db")) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0149, code lost:
    
        if (r4 != anywheresoftware.b4a.objects.streams.File.LastModified(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Venduto.db")) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _client_messagearrived(java.lang.String str, byte[] bArr) throws java.lang.Exception {
        java.util.Arrays.fill(new java.lang.String[0], "");
        anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
        java.lang.String[] Split = anywheresoftware.b4a.keywords.Regex.Split("/", str);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setEnabled(false);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(false);
        switch (anywheresoftware.b4a.BA.switchObjectToInt(Split[3], "GetDB", "OKStampaDoc", "OKStampaDocC", "OKGetOb", "ErrGetOb", "ErrStampaDoc", "ErrObsoleti", "OKObsoleti", "OK", "ReturnListaBK", "FileRestoreBK", "FileRestore", "ErrRestore", "ErrRestoreBK", "Msg")) {
            case 0:
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 == 0) {
                    _sendcmd("", "ErrLicenza");
                    return "";
                }
                new anywheresoftware.b4a.objects.collections.Map();
                anywheresoftware.b4a.objects.collections.Map map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ConvertBytesToObject(bArr));
                anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                list.Initialize();
                anywheresoftware.b4a.objects.collections.Map map2 = new anywheresoftware.b4a.objects.collections.Map();
                map2.Initialize();
                map2.Put("anagra", map.Get("anagra"));
                map2.Put("venduto", map.Get("venduto"));
                long ObjectToLongNumber = anywheresoftware.b4a.BA.ObjectToLongNumber(map.Get("anagra"));
                if (0.0d != anywheresoftware.b4a.BA.ObjectToNumber(map.Get("anagra"))) {
                    anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                    break;
                }
                list.Add("Anagra.db");
                anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                map2.Put("anagra", java.lang.Long.valueOf(anywheresoftware.b4a.objects.streams.File.LastModified(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Anagra.db")));
                long ObjectToLongNumber2 = anywheresoftware.b4a.BA.ObjectToLongNumber(map.Get("venduto"));
                if (0.0d != anywheresoftware.b4a.BA.ObjectToNumber(map.Get("venduto"))) {
                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                    anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                    break;
                }
                list.Add("Venduto.db");
                anywheresoftware.b4a.objects.streams.File file7 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File file8 = anywheresoftware.b4a.keywords.Common.File;
                map2.Put("venduto", java.lang.Long.valueOf(anywheresoftware.b4a.objects.streams.File.LastModified(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Venduto.db")));
                if (list.getSize() == 0) {
                    _sendcmd("", "Allineati");
                } else {
                    if (list.getSize() == 1) {
                        java.lang.String[] strArr = {anywheresoftware.b4a.BA.ObjectToString(list.Get(0)), "Mappa.txt", "Config.txt"};
                        java.util.Arrays.fill(strArr, "");
                        anywheresoftware.b4a.objects.streams.File file9 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File file10 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.WriteMap(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Mappa.txt", map2);
                        flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
                        anywheresoftware.b4a.BA ba = processBA;
                        anywheresoftware.b4a.objects.streams.File file11 = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.String dirDefaultExternal = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
                        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        archiverForB4A.ZipFiles(ba, dirDefaultExternal, strArr, cassandraRisto.ital.mod1._vvvvv1, "UpdAnagra.zip", "");
                    } else {
                        java.lang.String[] strArr2 = {anywheresoftware.b4a.BA.ObjectToString(list.Get(0)), anywheresoftware.b4a.BA.ObjectToString(list.Get(1)), "Mappa.txt", "Config.txt"};
                        java.util.Arrays.fill(strArr2, "");
                        anywheresoftware.b4a.objects.streams.File file12 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File file13 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.WriteMap(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal(), "Mappa.txt", map2);
                        flm.b4a.archiver.ArchiverForB4A archiverForB4A2 = new flm.b4a.archiver.ArchiverForB4A();
                        anywheresoftware.b4a.BA ba2 = processBA;
                        anywheresoftware.b4a.objects.streams.File file14 = anywheresoftware.b4a.keywords.Common.File;
                        java.lang.String dirDefaultExternal2 = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
                        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        archiverForB4A2.ZipFiles(ba2, dirDefaultExternal2, strArr2, cassandraRisto.ital.mod1._vvvvv1, "UpdAnagra.zip", "");
                    }
                    anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
                    anywheresoftware.b4a.objects.streams.File file15 = anywheresoftware.b4a.keywords.Common.File;
                    cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Srv/File/UpdAnagra.zip", anywheresoftware.b4a.keywords.Bit.InputStreamToBytes(anywheresoftware.b4a.objects.streams.File.OpenInput(cassandraRisto.ital.mod1._vvvvv1, "UpdAnagra.zip").getObject()));
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setInterval(30000L);
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setEnabled(true);
                }
                return "";
            case 1:
            case 2:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String sb2 = sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/TMP").toString();
                new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
                anywheresoftware.b4a.objects.streams.File file16 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput = anywheresoftware.b4a.objects.streams.File.OpenOutput(sb2, "doc.zip", false);
                OpenOutput.WriteBytes(bArr, 0, bArr.length);
                OpenOutput.Flush();
                OpenOutput.Close();
                anywheresoftware.b4a.objects.streams.File file17 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "doc.zip")) {
                    try {
                        new flm.b4a.archiver.ArchiverForB4A().UnZip(processBA, sb2, "doc.zip", sb2, "");
                    } catch (java.lang.Exception e) {
                        processBA.setLastException(e);
                        anywheresoftware.b4a.BA ba3 = processBA;
                        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "La stampa generata dal ServiceBox non è corretta");
                        cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
                    }
                    anywheresoftware.b4a.objects.streams.File file18 = anywheresoftware.b4a.keywords.Common.File;
                    if (anywheresoftware.b4a.objects.streams.File.Exists(sb2, "doc.pdf")) {
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("TipoDocFatturaFM")) {
                            anywheresoftware.b4a.BA ba4 = processBA;
                            cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.keywords.Common.CallSubNew(ba4, cassandraRisto.ital.fatturafm.getObject(), "SetInClosing");
                        }
                        if (Split[3].equals("OKStampaDocC") && Split.length > 5) {
                            java.lang.String str2 = Split[4];
                            boolean equals = Split[5].equals("1");
                            java.lang.String str3 = "";
                            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where codice ='" + str2 + "'")) > 0.0d) {
                                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                str3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select mail from clienti where codice ='" + str2 + "'");
                            }
                            if (!str3.equals("")) {
                                cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.BA ba5 = processBA;
                                cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                java.lang.String _vvvvvvvvvvvvvv1 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(ba5, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA));
                                cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                cassandraRisto.ital.mod1._vvvvv7 = "Fattura__" + _vvvvvvvvvvvvvv1 + ".pdf";
                                anywheresoftware.b4a.objects.streams.File file19 = anywheresoftware.b4a.keywords.Common.File;
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                java.lang.String sb4 = sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/fatture").toString();
                                cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.objects.streams.File.Copy(sb2, "doc.pdf", sb4, cassandraRisto.ital.mod1._vvvvv7);
                                if (equals) {
                                    anywheresoftware.b4a.BA ba6 = processBA;
                                    cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    java.lang.Class<?> object = cassandraRisto.ital.fatturafm.getObject();
                                    cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.keywords.Common.CallSubDelayed3(ba6, object, "PreparaMailVisualizza", cassandraRisto.ital.mod1._vvvvv7, str3);
                                    cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    cassandraRisto.ital.mod1._vvvvv7 = "";
                                    return "";
                                }
                            }
                        }
                        cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        anywheresoftware.b4a.BA ba7 = processBA;
                        java.lang.StringBuilder append = new java.lang.StringBuilder().append("file://");
                        anywheresoftware.b4a.objects.streams.File file20 = anywheresoftware.b4a.keywords.Common.File;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvv2(ba7, append.append(anywheresoftware.b4a.objects.streams.File.Combine(sb2, "doc.pdf")).toString());
                    }
                } else {
                    anywheresoftware.b4a.BA ba8 = processBA;
                    cassandraRisto.ital.mod1 mod1Var15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba8, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "La stampa generata dal ServiceBox non è corretta");
                }
                return "";
            case 3:
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                cassandraRisto.ital.mod1 mod1Var16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String sb6 = sb5.append(cassandraRisto.ital.mod1._vvvvv1).append("/TMP").toString();
                new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
                anywheresoftware.b4a.objects.streams.File file21 = anywheresoftware.b4a.keywords.Common.File;
                anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput2 = anywheresoftware.b4a.objects.streams.File.OpenOutput(sb6, "Tmp2.txt", false);
                OpenOutput2.WriteBytes(bArr, 0, bArr.length);
                OpenOutput2.Flush();
                OpenOutput2.Close();
                anywheresoftware.b4a.objects.streams.File file22 = anywheresoftware.b4a.keywords.Common.File;
                if (anywheresoftware.b4a.objects.streams.File.Exists(sb6, "Tmp2.txt")) {
                    new flm.b4a.archiver.ArchiverForB4A().UnZip(processBA, sb6, "Tmp2.txt", sb6, "");
                    anywheresoftware.b4a.objects.streams.File file23 = anywheresoftware.b4a.keywords.Common.File;
                    if (anywheresoftware.b4a.objects.streams.File.Exists(sb6, "VendutoTipo2.db")) {
                        anywheresoftware.b4a.objects.streams.File file24 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Copy(sb6, "VendutoTipo2.db", sb6, "Venduto.db");
                        anywheresoftware.b4a.objects.streams.File file25 = anywheresoftware.b4a.keywords.Common.File;
                        anywheresoftware.b4a.objects.streams.File.Delete(sb6, "VendutoTipo2.db");
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "VendutoP2";
                        anywheresoftware.b4a.BA ba9 = processBA;
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew(ba9, cassandraRisto.ital.main.getObject(), "LanciaStampa");
                    }
                } else {
                    anywheresoftware.b4a.BA ba10 = processBA;
                    cassandraRisto.ital.mod1 mod1Var17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba10, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Il file sul ServiceBox non è corretto");
                }
                return "";
            case 4:
                anywheresoftware.b4a.BA ba11 = processBA;
                cassandraRisto.ital.mod1 mod1Var18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba11, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Non è stato trovato il salvataggio sul ServiceBox");
                return "";
            case 5:
                anywheresoftware.b4a.BA ba12 = processBA;
                cassandraRisto.ital.mod1 mod1Var19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba12, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "errore durante la generazione del documento sul ServiceBox");
                return "";
            case 6:
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ConvertBytesToObject(bArr)));
                return "";
            case 7:
                anywheresoftware.b4a.objects.streams.File file26 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "temp.txt")) {
                    anywheresoftware.b4a.objects.streams.File file27 = anywheresoftware.b4a.keywords.Common.File;
                    cassandraRisto.ital.mod1 mod1Var21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "temp.txt");
                }
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.equals("RunObsoleti")) {
                    anywheresoftware.b4a.BA ba13 = processBA;
                    cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba13, cassandraRisto.ital.main.getObject(), "RunObsoleti", true);
                } else {
                    cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.equals("AllineaArchivio")) {
                        anywheresoftware.b4a.BA ba14 = processBA;
                        cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew2(ba14, cassandraRisto.ital.main.getObject(), "CallAllineaArchivio", true);
                        cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
                    } else {
                        anywheresoftware.b4a.BA ba15 = processBA;
                        cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.CallSubNew3(ba15, cassandraRisto.ital.main.getObject(), "EseguiChiusura", true, "");
                    }
                }
                return "";
            case 8:
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                    cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.mod1 mod1Var22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.main._v_datalastbackup = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA);
                    cassandraRisto.ital.mod1 mod1Var23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(processBA);
                    anywheresoftware.b4a.BA ba16 = processBA;
                    cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba16, cassandraRisto.ital.main.getObject(), "closeBK");
                } else if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) {
                    anywheresoftware.b4a.BA ba17 = processBA;
                    cassandraRisto.ital.mod1 mod1Var24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba17, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Dati inviati correttamente ...");
                }
                return "";
            case 9:
                new anywheresoftware.b4a.objects.collections.List();
                anywheresoftware.b4a.objects.collections.List list2 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List) _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ConvertBytesToObject(bArr));
                anywheresoftware.b4a.BA ba18 = processBA;
                cassandraRisto.ital.configura configuraVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba18, cassandraRisto.ital.configura.getObject(), "ChiediFileddaRipristinare", list2);
                return "";
            case 10:
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
                    anywheresoftware.b4a.objects.streams.File file28 = anywheresoftware.b4a.keywords.Common.File;
                    cassandraRisto.ital.mod1 mod1Var25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput3 = anywheresoftware.b4a.objects.streams.File.OpenOutput(cassandraRisto.ital.mod1._vvvvv1, "Tmpdb.zip", false);
                    OpenOutput3.WriteBytes(bArr, 0, bArr.length);
                    OpenOutput3.Flush();
                    OpenOutput3.Close();
                    anywheresoftware.b4a.BA ba19 = processBA;
                    cassandraRisto.ital.configura configuraVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba19, cassandraRisto.ital.configura.getObject(), "RipristinaIlFile");
                }
                return "";
            case 11:
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
                    anywheresoftware.b4a.objects.streams.File file29 = anywheresoftware.b4a.keywords.Common.File;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    cassandraRisto.ital.mod1 mod1Var26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper OpenOutput4 = anywheresoftware.b4a.objects.streams.File.OpenOutput(sb7.append(cassandraRisto.ital.mod1._vvvvv1).append("/files").toString(), "BKAnagra.zip", false);
                    OpenOutput4.WriteBytes(bArr, 0, bArr.length);
                    OpenOutput4.Flush();
                    OpenOutput4.Close();
                    anywheresoftware.b4a.BA ba20 = processBA;
                    cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.CallSubNew(ba20, cassandraRisto.ital.main.getObject(), "RestoreFile");
                }
                return "";
            case 12:
            case 13:
                anywheresoftware.b4a.BA ba21 = processBA;
                cassandraRisto.ital.mod1 mod1Var27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba21, cassandraRisto.ital.mod1._vvv7, "MsgboxOnly", "Non è stato trovato il salvataggio sul ServiceBox");
                return "";
            default:
                return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str, byte[] bArr) throws java.lang.Exception {
        try {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Publish2(str, bArr, 0, false);
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        try {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = str2;
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Close();
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize(processBA, "client", "tcp://" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str + ":" + anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6)) + "", "Term");
            anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper mqttConnectOptionsWrapper = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper();
            java.lang.String str3 = "!QAZxsw2";
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._v_sbpwd.equals("")) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                str3 = cassandraRisto.ital.main._v_sbpwd;
            }
            mqttConnectOptionsWrapper.Initialize("utentE", str3);
            mqttConnectOptionsWrapper.SetLastWill("all/Srv/disconnect", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ConvertObjectToBytes(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2), 0, false);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Connect2(mqttConnectOptionsWrapper.getObject());
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        try {
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Close();
                return "";
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(processBA, anywheresoftware.b4a.BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.BA ba = processBA;
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String _vvvvvvvvvvvvvv1 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(ba, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(processBA));
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "temp.txt")) {
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.String str = cassandraRisto.ital.mod1._vvvvv1;
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Copy(str, "temp.txt", cassandraRisto.ital.mod1._vvvvv1, "temp" + _vvvvvvvvvvvvvv1 + ".txt");
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.objects.streams.File.Delete(cassandraRisto.ital.mod1._vvvvv1, "temp.txt");
            return "";
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
        anywheresoftware.b4a.BA ba = processBA;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        int ObjectToNumber = (int) anywheresoftware.b4a.BA.ObjectToNumber(anywheresoftware.b4a.keywords.Common.CallSubNew2(ba, cassandraRisto.ital.mod1._vvv7, "MsgboxAsk", str + "\nSi desidera proseguire ugualmente ? "));
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (ObjectToNumber == -1) {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.equals("RunObsoleti")) {
                anywheresoftware.b4a.BA ba2 = processBA;
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.CallSubNew2(ba2, cassandraRisto.ital.main.getObject(), "RunObsoleti", true);
            } else {
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.equals("AllineaArchivio")) {
                    anywheresoftware.b4a.BA ba3 = processBA;
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.main.getObject(), "CallAllineaArchivio", true);
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
                } else {
                    anywheresoftware.b4a.BA ba4 = processBA;
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.CallSubNew3(ba4, cassandraRisto.ital.main.getObject(), "EseguiChiusura", true, "");
                }
            }
        }
        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        return "";
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.Timer();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.Timer();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.Timer();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
        _vv4 = false;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 13693;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
        return "";
    }

    public static java.lang.String _sendanagraperdoc(java.lang.String str) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = str;
        anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Srv/File/" + str, anywheresoftware.b4a.keywords.Bit.InputStreamToBytes(anywheresoftware.b4a.objects.streams.File.OpenInput(cassandraRisto.ital.mod1._vvvvv1, "BKAnagra.zip").getObject()));
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setInterval(30000L);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setEnabled(true);
        return "";
    }

    public static boolean _sendcmd(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Srv/" + str2, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ConvertObjectToBytes(str));
            if (str.endsWith("obsoleti")) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(true);
                return true;
            }
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setEnabled(true);
            return true;
        }
        return false;
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            return false;
        }
        anywheresoftware.b4a.keywords.Common.LogImpl("4156106754", "all/Order/" + str2, 0);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Order/" + str2, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ConvertObjectToBytes(str));
        return true;
    }

    public static java.lang.String _sendobsoleti() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.collections.List().Initialize();
        java.lang.String[] strArr = {"Anagra.db"};
        java.util.Arrays.fill(strArr, "");
        flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
        anywheresoftware.b4a.BA ba = processBA;
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        java.lang.String dirDefaultExternal = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        archiverForB4A.ZipFiles(ba, dirDefaultExternal, strArr, cassandraRisto.ital.mod1._vvvvv1, "temp.txt", "");
        anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Srv/File/dbobsoleti", anywheresoftware.b4a.keywords.Bit.InputStreamToBytes(anywheresoftware.b4a.objects.streams.File.OpenInput(cassandraRisto.ital.mod1._vvvvv1, "temp.txt").getObject()));
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(true);
        return "";
    }

    public static java.lang.String _service_create() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize(processBA, "timerWaitmqtt", 30000L);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setEnabled(false);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(processBA, "timerWaitobsoleti", 15000L);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(false);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Initialize(processBA, "timerHellomqtt", 60000L);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setEnabled(true);
        anywheresoftware.b4a.objects.NotificationWrapper notificationWrapper = new anywheresoftware.b4a.objects.NotificationWrapper();
        notificationWrapper.Initialize();
        notificationWrapper.setIcon("icon");
        anywheresoftware.b4a.BA ba = processBA;
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Server RPI in esecuzione");
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        notificationWrapper.SetInfoNew(ba, ObjectToCharSequence, ObjectToCharSequence2, cassandraRisto.ital.main.getObject());
        anywheresoftware.b4a.objects.ServiceHelper serviceHelper = mostCurrent._service;
        anywheresoftware.b4a.objects.ServiceHelper serviceHelper2 = mostCurrent._service;
        serviceHelper.AutomaticForegroundMode = 3;
        mostCurrent._service.StartForeground(1, (android.app.Notification) notificationWrapper.getObject());
        return "";
    }

    public static java.lang.String _service_destroy() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _service_start(anywheresoftware.b4a.objects.IntentWrapper intentWrapper) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(cassandraRisto.ital.main._v_iprpi, "Term");
        return "";
    }

    public static java.lang.String _timerhellomqtt_tick() throws java.lang.Exception {
        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)) {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(cassandraRisto.ital.main._v_iprpi, "Term");
            return "";
        }
        return "";
    }

    public static java.lang.String _timerwaitmqtt_tick() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setEnabled(false);
        anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("L'applicazione Server non risulta essere attiva"), true);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
            anywheresoftware.b4a.BA ba = processBA;
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.main.getObject(), "closeBK");
            return "";
        }
        return "";
    }

    public static java.lang.String _timerwaitobsoleti_tick() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setEnabled(false);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6("Non è stato possibile aggiornare i dati obsoleti .");
        return "";
    }

    public static boolean _tupload(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = str2.endsWith("DB.zip");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = str2.equals("UpdWeb.zip");
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            if (anywheresoftware.b4a.objects.streams.File.Exists(str, str2)) {
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                    anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
                    anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Srv/File/" + str2, anywheresoftware.b4a.keywords.Bit.InputStreamToBytes(anywheresoftware.b4a.objects.streams.File.OpenInput(str, str2).getObject()));
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setInterval(120000L);
                } else {
                    anywheresoftware.b4a.keywords.Bit bit2 = anywheresoftware.b4a.keywords.Common.Bit;
                    anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("all/Order/File/" + str2, anywheresoftware.b4a.keywords.Bit.InputStreamToBytes(anywheresoftware.b4a.objects.streams.File.OpenInput(str, str2).getObject()));
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setInterval(30000L);
                }
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setEnabled(true);
                return true;
            }
        }
        return false;
    }
}
