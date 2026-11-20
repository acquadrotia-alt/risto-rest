package cassandraRisto.ital;

/* loaded from: classes.dex */
public class usbpl2303service extends android.app.Service {
    public static cassandraRisto.ital.usbpl2303._rxdatablock _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    static cassandraRisto.ital.usbpl2303service mostCurrent;
    public static anywheresoftware.b4a.BA processBA;
    private anywheresoftware.b4a.objects.ServiceHelper _service;
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
    public cassandraRisto.ital.rpidevice _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public cassandraRisto.ital.stampe _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.stampecustom _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public cassandraRisto.ital.tabelleappoggio _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
    public cassandraRisto.ital.usbpl2303 _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public cassandraRisto.ital.verificazione _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.httputils2service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.xuiviewsutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;

    public static class usbpl2303service_BR extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            anywheresoftware.b4a.BA.LogInfo("** Receiver (usbpl2303service) OnReceive **");
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) cassandraRisto.ital.usbpl2303service.class);
            if (intent != null) {
                intent2.putExtra("b4a_internal_intent", intent);
            }
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startServiceFromReceiver(context, intent2, false, anywheresoftware.b4a.BA.class);
        }
    }

    public static java.lang.Class<?> getObject() {
        return cassandraRisto.ital.usbpl2303service.class;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
            processBA = new anywheresoftware.b4a.BA(this, null, null, "cassandraRisto.ital", "cassandraRisto.ital.usbpl2303service");
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
            processBA.raiseEvent2(null, true, "CREATE", true, "cassandraRisto.ital.usbpl2303service", processBA, this._service, java.lang.Float.valueOf(anywheresoftware.b4a.keywords.Common.Density));
        }
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false)) {
            processBA.setActivityPaused(false);
            anywheresoftware.b4a.BA.LogInfo("*** Service (usbpl2303service) Create ***");
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
            cassandraRisto.ital.usbpl2303service.this.handleStart(this.val$intent);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        if (!anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.onStartCommand(processBA, new cassandraRisto.ital.usbpl2303service.1(intent))) {
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.addWaitForLayout(new cassandraRisto.ital.usbpl2303service.2(intent));
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
            cassandraRisto.ital.usbpl2303service.processBA.setActivityPaused(false);
            anywheresoftware.b4a.BA.LogInfo("** Service (usbpl2303service) Create **");
            cassandraRisto.ital.usbpl2303service.processBA.raiseEvent(null, "service_create", new java.lang.Object[0]);
            cassandraRisto.ital.usbpl2303service.this.handleStart(this.val$intent);
            anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.removeWaitForLayout();
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        super.onTaskRemoved(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStart(android.content.Intent intent) {
        anywheresoftware.b4a.BA.LogInfo("** Service (usbpl2303service) Start **");
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
        anywheresoftware.b4a.BA.LogInfo("** Service (usbpl2303service) Destroy **");
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

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new cassandraRisto.ital.usbpl2303._rxdatablock();
        return "";
    }

    public static java.lang.String _read(int i) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
        int i2 = 0;
        boolean z = false;
        int i3 = 1;
        while (true) {
            cassandraRisto.ital.usbpl2303 usbpl2303Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (i3 <= cassandraRisto.ital.usbpl2303._max_timer_reads) {
                cassandraRisto.ital.usbpl2303 usbpl2303Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                byte[] bArr = new byte[cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7];
                cassandraRisto.ital.usbpl2303 usbpl2303Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper usbDeviceConnectionWrapper = cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                cassandraRisto.ital.usbpl2303 usbpl2303Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                android.hardware.usb.UsbEndpoint object = cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getObject();
                int length = bArr.length;
                cassandraRisto.ital.usbpl2303 usbpl2303Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                int BulkTransfer = usbDeviceConnectionWrapper.BulkTransfer(object, bArr, length, cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
                if (BulkTransfer > 0) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.bytecount = BulkTransfer;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.data = bArr;
                    if (z) {
                        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.bytecount > 0) {
                            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(anywheresoftware.b4a.keywords.Common.BytesToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.data, 0, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.bytecount, "UTF8")).toString();
                        }
                    } else if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.bytecount > 0) {
                        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = anywheresoftware.b4a.keywords.Common.BytesToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.data, 0, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.bytecount, "UTF8");
                    }
                    int i4 = i2 + BulkTransfer;
                    if (i < 0) {
                        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length() > 0) {
                            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String str = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int length2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length() - 1;
                            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (str.substring(length2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length()).equals(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(3))))) {
                                return "";
                            }
                        }
                        i2 = i4;
                        z = true;
                    } else {
                        cassandraRisto.ital.usbpl2303 usbpl2303Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        if (BulkTransfer != cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 && i4 >= i) {
                            if (i != 1) {
                                return "";
                            }
                            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.substring(0, 1).equals(anywheresoftware.b4a.BA.ObjectToString(java.lang.Character.valueOf(anywheresoftware.b4a.keywords.Common.Chr(6))))) {
                                return "";
                            }
                        }
                        i2 = i4;
                        z = true;
                    }
                } else {
                    int i5 = i3 + 1;
                    if (i5 > 5 && i == 200) {
                        return "";
                    }
                    i3 = i5;
                }
            } else {
                return "";
            }
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws java.lang.Exception {
        anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper.UsbRequestWrapper usbRequestWrapper = new anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper.UsbRequestWrapper();
        cassandraRisto.ital.usbpl2303 usbpl2303Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper usbDeviceConnectionWrapper = cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        cassandraRisto.ital.usbpl2303 usbpl2303Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        usbRequestWrapper.Initialize(usbDeviceConnectionWrapper, cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getObject());
        cassandraRisto.ital.usbpl2303 usbpl2303Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        byte[] bArr = new byte[cassandraRisto.ital.usbpl2303._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getMaxPacketSize()];
        usbRequestWrapper.Queue(bArr, bArr.length);
        return "";
    }

    public static java.lang.String _service_create() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _service_destroy() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _service_start(anywheresoftware.b4a.objects.IntentWrapper intentWrapper) throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5();
        return "";
    }

    public static java.lang.String _usbpl2303_newdata(anywheresoftware.b4a.objects.usb.UsbDeviceConnectionWrapper.UsbRequestWrapper usbRequestWrapper, boolean z) throws java.lang.Exception {
        return "";
    }
}
