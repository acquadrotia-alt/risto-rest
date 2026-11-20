package cassandraRisto.ital;

/* loaded from: classes.dex */
public class magazzino extends android.app.Activity implements anywheresoftware.b4a.B4AActivity {
    static boolean afterFirstLayout;
    public static boolean dontPause;
    public static final boolean fullScreen = false;
    public static final boolean includeTitle = false;
    public static cassandraRisto.ital.magazzino mostCurrent;
    public static java.lang.ref.WeakReference<android.app.Activity> previousOne;
    public static anywheresoftware.b4a.BA processBA;
    anywheresoftware.b4a.objects.ActivityWrapper _activity;
    anywheresoftware.b4a.BA activityBA;
    anywheresoftware.b4a.BALayout layout;
    java.util.ArrayList<anywheresoftware.b4a.B4AMenuItem> menuItems;
    static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
    private java.lang.Boolean onKeySubExist = null;
    private java.lang.Boolean onKeyUpSubExist = null;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _bautoconsumo = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _bcarico = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _binventario = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _bresofornitore = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _brettifica = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _bricalcola = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _stampagiacenze = null;
    public anywheresoftware.b4a.objects.LabelWrapper _lbltitolo = null;
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

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.app.Activity activity;
        super.onCreate(bundle);
        mostCurrent = this;
        if (processBA == null) {
            processBA = new anywheresoftware.b4a.BA(getApplicationContext(), null, null, "cassandraRisto.ital", "cassandraRisto.ital.magazzino");
            processBA.loadHtSubs(getClass());
            anywheresoftware.b4a.BALayout.setDeviceScale(getApplicationContext().getResources().getDisplayMetrics().density);
        } else if (previousOne != null && (activity = previousOne.get()) != null && activity != this) {
            anywheresoftware.b4a.BA.LogInfo("Killing previous instance (magazzino).");
            activity.finish();
        }
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
        getWindow().requestFeature(1);
        processBA.sharedProcessBA.activityBA = null;
        this.layout = new anywheresoftware.b4a.BALayout(this);
        setContentView(this.layout);
        afterFirstLayout = false;
        cassandraRisto.ital.magazzino.WaitForLayout waitForLayout = new cassandraRisto.ital.magazzino.WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, waitForLayout, false)) {
            anywheresoftware.b4a.BA.handler.postDelayed(waitForLayout, 5L);
        }
    }

    static class WaitForLayout implements java.lang.Runnable {
        WaitForLayout() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!cassandraRisto.ital.magazzino.afterFirstLayout && cassandraRisto.ital.magazzino.mostCurrent != null) {
                if (cassandraRisto.ital.magazzino.mostCurrent.layout.getWidth() == 0) {
                    anywheresoftware.b4a.BA.handler.postDelayed(this, 5L);
                    return;
                }
                cassandraRisto.ital.magazzino.mostCurrent.layout.getLayoutParams().height = cassandraRisto.ital.magazzino.mostCurrent.layout.getHeight();
                cassandraRisto.ital.magazzino.mostCurrent.layout.getLayoutParams().width = cassandraRisto.ital.magazzino.mostCurrent.layout.getWidth();
                cassandraRisto.ital.magazzino.afterFirstLayout = true;
                cassandraRisto.ital.magazzino.mostCurrent.afterFirstLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afterFirstLayout() {
        if (this == mostCurrent) {
            this.activityBA = new anywheresoftware.b4a.BA(this, this.layout, processBA, "cassandraRisto.ital", "cassandraRisto.ital.magazzino");
            processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<>(this.activityBA);
            anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
            this._activity = new anywheresoftware.b4a.objects.ActivityWrapper(this.activityBA, "activity");
            anywheresoftware.b4a.Msgbox.isDismissing = false;
            if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(processBA)) {
                if (isFirst) {
                    processBA.raiseEvent2(null, true, "SHELL", false, new java.lang.Object[0]);
                }
                processBA.raiseEvent2(null, true, "CREATE", true, "cassandraRisto.ital.magazzino", processBA, this.activityBA, this._activity, java.lang.Float.valueOf(anywheresoftware.b4a.keywords.Common.Density), mostCurrent);
                this._activity.reinitializeForShell(this.activityBA, "activity");
            }
            initializeProcessGlobals();
            initializeGlobals();
            anywheresoftware.b4a.BA.LogInfo("** Activity (magazzino) Create, isFirst = " + isFirst + " **");
            processBA.raiseEvent2(null, true, "activity_create", false, java.lang.Boolean.valueOf(isFirst));
            isFirst = false;
            if (this == mostCurrent) {
                processBA.setActivityPaused(false);
                anywheresoftware.b4a.BA.LogInfo("** Activity (magazzino) Resume **");
                processBA.raiseEvent(null, "activity_resume", new java.lang.Object[0]);
                if (android.os.Build.VERSION.SDK_INT >= 11) {
                    try {
                        android.app.Activity.class.getMethod("invalidateOptionsMenu", new java.lang.Class[0]).invoke(this, (java.lang.Object[]) null);
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // anywheresoftware.b4a.B4AActivity
    public void addMenuItem(anywheresoftware.b4a.B4AMenuItem b4AMenuItem) {
        if (this.menuItems == null) {
            this.menuItems = new java.util.ArrayList<>();
        }
        this.menuItems.add(b4AMenuItem);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                java.lang.Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", java.lang.Boolean.TYPE).invoke(getClass().getMethod("getActionBar", new java.lang.Class[0]).invoke(this, new java.lang.Object[0]), true);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new java.lang.Object[]{menu})) {
            return true;
        }
        if (this.menuItems == null) {
            return false;
        }
        java.util.Iterator<anywheresoftware.b4a.B4AMenuItem> it = this.menuItems.iterator();
        while (it.hasNext()) {
            anywheresoftware.b4a.B4AMenuItem next = it.next();
            android.view.MenuItem add = menu.add(next.title);
            if (next.drawable != null) {
                add.setIcon(next.drawable);
            }
            if (android.os.Build.VERSION.SDK_INT >= 11) {
                try {
                    if (next.addToBar) {
                        android.view.MenuItem.class.getMethod("setShowAsAction", java.lang.Integer.TYPE).invoke(add, 1);
                    }
                } catch (java.lang.Exception e2) {
                    e2.printStackTrace();
                }
            }
            add.setOnMenuItemClickListener(new cassandraRisto.ital.magazzino.B4AMenuItemsClickListener(next.eventName.toLowerCase(anywheresoftware.b4a.BA.cul)));
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        processBA.raiseEvent(null, "activity_actionbarhomeclick", new java.lang.Object[0]);
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        super.onPrepareOptionsMenu(menu);
        processBA.runHook("onprepareoptionsmenu", this, new java.lang.Object[]{menu});
        return true;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        processBA.runHook("onstart", this, null);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        processBA.runHook("onstop", this, null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (processBA.subExists("activity_windowfocuschanged")) {
            processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, java.lang.Boolean.valueOf(z));
        }
    }

    private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        private final java.lang.String eventName;

        public B4AMenuItemsClickListener(java.lang.String str) {
            this.eventName = str;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            cassandraRisto.ital.magazzino.processBA.raiseEventFromUI(menuItem.getTitle(), this.eventName + "_click", new java.lang.Object[0]);
            return true;
        }
    }

    public static java.lang.Class<?> getObject() {
        return cassandraRisto.ital.magazzino.class;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (processBA.runHook("onkeydown", this, new java.lang.Object[]{java.lang.Integer.valueOf(i), keyEvent})) {
            return true;
        }
        if (this.onKeySubExist == null) {
            this.onKeySubExist = java.lang.Boolean.valueOf(processBA.subExists("activity_keypress"));
        }
        if (this.onKeySubExist.booleanValue()) {
            if (i == 4 && android.os.Build.VERSION.SDK_INT >= 18) {
                cassandraRisto.ital.magazzino.HandleKeyDelayed handleKeyDelayed = new cassandraRisto.ital.magazzino.HandleKeyDelayed(this, null);
                handleKeyDelayed.kc = i;
                anywheresoftware.b4a.BA.handler.post(handleKeyDelayed);
                return true;
            }
            if (new cassandraRisto.ital.magazzino.HandleKeyDelayed(this, null).runDirectly(i)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private class HandleKeyDelayed implements java.lang.Runnable {
        int kc;

        private HandleKeyDelayed() {
        }

        /* synthetic */ HandleKeyDelayed(cassandraRisto.ital.magazzino magazzinoVar, cassandraRisto.ital.magazzino.1 r2) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            runDirectly(this.kc);
        }

        public boolean runDirectly(int i) {
            java.lang.Boolean bool = (java.lang.Boolean) cassandraRisto.ital.magazzino.processBA.raiseEvent2(cassandraRisto.ital.magazzino.this._activity, false, "activity_keypress", false, java.lang.Integer.valueOf(i));
            if (bool == null || bool.booleanValue()) {
                return true;
            }
            if (i != 4) {
                return false;
            }
            cassandraRisto.ital.magazzino.this.finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        java.lang.Boolean bool;
        if (processBA.runHook("onkeyup", this, new java.lang.Object[]{java.lang.Integer.valueOf(i), keyEvent})) {
            return true;
        }
        if (this.onKeyUpSubExist == null) {
            this.onKeyUpSubExist = java.lang.Boolean.valueOf(processBA.subExists("activity_keyup"));
        }
        if (this.onKeyUpSubExist.booleanValue() && ((bool = (java.lang.Boolean) processBA.raiseEvent2(this._activity, false, "activity_keyup", false, java.lang.Integer.valueOf(i))) == null || bool.booleanValue())) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        processBA.runHook("onnewintent", this, new java.lang.Object[]{intent});
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (this._activity != null && this == mostCurrent) {
            anywheresoftware.b4a.Msgbox.dismiss(true);
            if (!dontPause) {
                anywheresoftware.b4a.BA.LogInfo("** Activity (magazzino) Pause, UserClosed = " + this.activityBA.activity.isFinishing() + " **");
            } else {
                anywheresoftware.b4a.BA.LogInfo("** Activity (magazzino) Pause event (activity is not paused). **");
            }
            if (mostCurrent != null) {
                processBA.raiseEvent2(this._activity, true, "activity_pause", false, java.lang.Boolean.valueOf(this.activityBA.activity.isFinishing()));
            }
            if (!dontPause) {
                processBA.setActivityPaused(true);
                mostCurrent = null;
            }
            if (!this.activityBA.activity.isFinishing()) {
                previousOne = new java.lang.ref.WeakReference<>(this);
            }
            anywheresoftware.b4a.Msgbox.isDismissing = false;
            processBA.runHook("onpause", this, null);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        previousOne = null;
        processBA.runHook("ondestroy", this, null);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (this.activityBA != null) {
            anywheresoftware.b4a.BA.handler.post(new cassandraRisto.ital.magazzino.ResumeMessage(mostCurrent));
        }
        processBA.runHook("onresume", this, null);
    }

    private static class ResumeMessage implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<android.app.Activity> activity;

        public ResumeMessage(android.app.Activity activity) {
            this.activity = new java.lang.ref.WeakReference<>(activity);
        }

        @Override // java.lang.Runnable
        public void run() {
            cassandraRisto.ital.magazzino magazzinoVar = cassandraRisto.ital.magazzino.mostCurrent;
            if (magazzinoVar != null && magazzinoVar == this.activity.get()) {
                cassandraRisto.ital.magazzino.processBA.setActivityPaused(false);
                anywheresoftware.b4a.BA.LogInfo("** Activity (magazzino) Resume **");
                if (magazzinoVar == cassandraRisto.ital.magazzino.mostCurrent) {
                    cassandraRisto.ital.magazzino.processBA.raiseEvent(magazzinoVar._activity, "activity_resume", (java.lang.Object[]) null);
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        processBA.onActivityResult(i, i2, intent);
        processBA.runHook("onactivityresult", this, new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)});
    }

    private static void initializeGlobals() {
        processBA.raiseEvent2(null, true, "globals", false, (java.lang.Object[]) null);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = strArr[i2];
            objArr[1] = java.lang.Boolean.valueOf(iArr[i2] == 0);
            processBA.raiseEventFromDifferentThread(null, null, 0, "activity_permissionresult", true, objArr);
        }
    }

    public static void initializeProcessGlobals() {
        try {
            java.lang.Class.forName(anywheresoftware.b4a.BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals", new java.lang.Class[0]).invoke(null, null);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static java.lang.String _activity_create(boolean z) throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (!cassandraRisto.ital.mod1._vvvv4) {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized())) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 >= 19) {
                    new anywheresoftware.b4j.object.JavaObject();
                    anywheresoftware.b4j.object.JavaObject javaObject = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), mostCurrent._activity.getObject());
                    javaObject.RunMethod("setOnSystemUiVisibilityChangeListener", new java.lang.Object[]{javaObject.CreateEvent(processBA, "android.view.View.OnSystemUiVisibilityChangeListener", "VisibilityChanged", anywheresoftware.b4a.keywords.Common.Null)});
                    mostCurrent._activity.setWidth(-1);
                    mostCurrent._activity.setHeight(-1);
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
                }
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA);
                return "";
            }
        }
        mostCurrent._activity.Finish();
        return "";
    }

    public static boolean _activity_keypress(int i) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.constants.KeyCodes keyCodes = anywheresoftware.b4a.keywords.Common.KeyCodes;
        if (i != 4) {
            return false;
        }
        anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Non Consentito"), false);
        return true;
    }

    public static java.lang.String _activity_pause(boolean z) throws java.lang.Exception {
        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvv7 = "";
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvv4 = true;
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, false);
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvv1 = true;
            mostCurrent._activity.Finish();
            anywheresoftware.b4a.keywords.Common.ExitApplication();
            return "";
        }
        return "";
    }

    public static java.lang.String _activity_resume() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (!cassandraRisto.ital.mod1._vvvv4) {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized())) {
                try {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6("Magazzino");
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = mostCurrent._bcarico;
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba, -16776961, 25).getObject());
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = mostCurrent._brettifica;
                    cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper2.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba2, -16776961, 25).getObject());
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper3 = mostCurrent._bautoconsumo;
                    cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba3 = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper3.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba3, -65536, 25).getObject());
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper4 = mostCurrent._bresofornitore;
                    cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba4 = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper4.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba4, -65536, 25).getObject());
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper5 = mostCurrent._binventario;
                    cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba5 = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper5.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba5, -16711936, 25).getObject());
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper6 = mostCurrent._bricalcola;
                    cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba6 = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors6 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper6.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba6, -65281, 25).getObject());
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper7 = mostCurrent._stampagiacenze;
                    cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba7 = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors7 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper7.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba7, -65281, 25).getObject());
                    anywheresoftware.b4a.keywords.Common.DoEvents();
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.phone.Phone phone = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                    anywheresoftware.b4a.BA ba8 = processBA;
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.phone.Phone.SetScreenBrightness(ba8, (float) cassandraRisto.ital.main._v_screenbrightness);
                    mostCurrent._lbltitolo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Gestione Magazzino"));
                    cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvv0 = "Activity_Resume";
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper = mostCurrent._lbltitolo;
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    labelWrapper.setColor(cassandraRisto.ital.main._v_colormenutitle);
                    cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, mostCurrent._lbltitolo);
                    anywheresoftware.b4a.keywords.Common.DoEvents();
                    cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
                }
                return "";
            }
        }
        mostCurrent._activity.Finish();
        return "";
    }

    public static java.lang.String _bcarico_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA));
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = anywheresoftware.b4a.BA.ObjectToString(buttonWrapper.getTag());
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv7(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToString(buttonWrapper.getTag()), "", anywheresoftware.b4a.BA.NumberToString(0));
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        mostCurrent._activity.Finish();
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "Main");
        return "";
    }

    public static java.lang.String _bchiudi_click() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        mostCurrent._activity.Finish();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "Main");
        return "";
    }

    public static java.lang.String _bricalcola_click() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA);
        return "";
    }

    public static int _errprtact(int i) throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        int _vvvvvvvvvvvvvvvvvv3 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, i);
        if (_vvvvvvvvvvvvvvvvvv3 > 0) {
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Le stampe verranno inviate alla nuova stampante fino al prossimo riavvio del programma.");
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        }
        return _vvvvvvvvvvvvvvvvvv3;
    }

    public static java.lang.String _globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        mostCurrent._bautoconsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._bcarico = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._binventario = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._bresofornitore = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._brettifica = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._bricalcola = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._stampagiacenze = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._lbltitolo = new anywheresoftware.b4a.objects.LabelWrapper();
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str) throws java.lang.Exception {
        for (int numberOfViews = mostCurrent._activity.getNumberOfViews() - 1; numberOfViews >= 0; numberOfViews--) {
            mostCurrent._activity.RemoveViewAt(numberOfViews);
        }
        mostCurrent._activity.LoadLayout(str, mostCurrent.activityBA);
        return "";
    }

    public static int _msgboxact(java.lang.String str) throws java.lang.Exception {
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(str);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        return anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Riprova", "", "Guasta", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _stampagiacenze_click() throws java.lang.Exception {
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new java.lang.String[]{"=", "Diverso", "Maggiore", "Minore", "Sottoscorta"}));
        anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
        list2.Initialize();
        list2.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new java.lang.String[]{"=", "<>", ">", "<"}));
        new com.maximus.id.id();
        int InputList1 = com.maximus.id.id.InputList1(list, "Selezionare il Filtro per la Giacenza: ", mostCurrent.activityBA);
        if (InputList1 >= 0) {
            if (InputList1 == 4) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                cassandraRisto.ital.stampecustom stampecustomVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "stampaGiacenze";
                cassandraRisto.ital.stampecustom stampecustomVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = " < sottoscorta ";
                cassandraRisto.ital.stampecustom stampecustomVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "Giacenza in Sottoscorta ";
                cassandraRisto.ital.stampecustom stampecustomVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "Stampa Giacenze ";
                cassandraRisto.ital.stampecustom stampecustomVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 3;
                cassandraRisto.ital.stampecustom stampecustomVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                cassandraRisto.ital.stampecustom stampecustomVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "Magazzino";
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "StampeCustom");
            } else {
                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog numberDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog();
                numberDialog.setDigits(3);
                numberDialog.setNumber(0);
                numberDialog.setDecimal(0);
                numberDialog.setShowSign(true);
                anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int Show = numberDialog.Show("Inserire la giacenza", "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse2 = anywheresoftware.b4a.keywords.Common.DialogResponse;
                if (Show == -1) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                    cassandraRisto.ital.stampecustom stampecustomVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "stampaGiacenze";
                    cassandraRisto.ital.stampecustom stampecustomVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = anywheresoftware.b4a.BA.ObjectToString(list2.Get(InputList1)) + anywheresoftware.b4a.BA.NumberToString(numberDialog.getNumber());
                    cassandraRisto.ital.stampecustom stampecustomVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "Giacenza " + anywheresoftware.b4a.BA.ObjectToString(list.Get(InputList1)) + " " + anywheresoftware.b4a.BA.NumberToString(numberDialog.getNumber());
                    cassandraRisto.ital.stampecustom stampecustomVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "Stampa Giacenze ";
                    cassandraRisto.ital.stampecustom stampecustomVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 3;
                    cassandraRisto.ital.stampecustom stampecustomVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    cassandraRisto.ital.stampecustom stampecustomVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    cassandraRisto.ital.stampecustom._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "Magazzino";
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "StampeCustom");
                } else {
                    return "";
                }
            }
        }
        return "";
    }

    public static java.lang.Object _visibilitychanged_event(java.lang.String str, java.lang.Object[] objArr) throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return null;
    }

    public void _onCreate() {
        try {
            if (anywheresoftware.b4a.objects.streams.File.Exists(getFilesDir().toString(), "theme.txt")) {
                cassandraRisto.ital.main._theme_value = java.lang.Integer.parseInt(anywheresoftware.b4a.objects.streams.File.ReadString(getFilesDir().toString(), "theme.txt"));
            }
            if (cassandraRisto.ital.main._theme_value != 0) {
                setTheme(cassandraRisto.ital.main._theme_value);
            }
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
