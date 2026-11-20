package cassandraRisto.ital;

/* loaded from: classes.dex */
public class fatturafm extends android.app.Activity implements anywheresoftware.b4a.B4AActivity {
    static boolean afterFirstLayout;
    public static boolean dontPause;
    public static final boolean fullScreen = false;
    public static final boolean includeTitle = false;
    public static cassandraRisto.ital.fatturafm mostCurrent;
    public static java.lang.ref.WeakReference<android.app.Activity> previousOne;
    public static anywheresoftware.b4a.BA processBA;
    anywheresoftware.b4a.objects.ActivityWrapper _activity;
    anywheresoftware.b4a.BA activityBA;
    anywheresoftware.b4a.BALayout layout;
    java.util.ArrayList<anywheresoftware.b4a.B4AMenuItem> menuItems;
    static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
    public static anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
    public static double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0.0d;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
    public static java.lang.String _vvvv6 = "";
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
    private java.lang.Boolean onKeySubExist = null;
    private java.lang.Boolean onKeyUpSubExist = null;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _adata = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _chiudi = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _dadata = null;
    public anywheresoftware.b4a.objects.CSBuilder _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _datafattura = null;
    public anywheresoftware.b4a.objects.PanelWrapper _panelgrid = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ricerca = null;
    public cassandraRisto.ital.customlistviewold _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.customlistviewold _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public anywheresoftware.b4a.sql.SQL.CursorWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _bristampa = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public cassandraRisto.ital.customlistviewold _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public anywheresoftware.b4a.sql.SQL.CursorWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
    public anywheresoftware.b4a.sql.SQL.CursorWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
    public com.rootsoft.pdfwriter.myPDFWriter _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public com.rootsoft.pdfwriter.PaperSize _vvvvvv0 = null;
    public anywheresoftware.b4a.net.SMTPWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.IME _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.sql.SQL.CursorWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _pnllist = null;
    public anywheresoftware.b4a.objects.LabelWrapper _lblinfo = null;
    public anywheresoftware.b4a.objects.LabelWrapper _lbltitolo = null;
    public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edtimportobollo = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edtcup = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edtcig = null;
    public anywheresoftware.b4a.objects.SpinnerWrapper _peiva2 = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edtidordacq = null;
    public anywheresoftware.b4a.objects.LabelWrapper _lblidordacq = null;
    public anywheresoftware.b4a.objects.LabelWrapper _lblcig = null;
    public anywheresoftware.b4a.objects.LabelWrapper _lblcup = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edtmemo = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _bnumerocopie = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edtmailfe = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _baddcopie = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _blesscopie = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ltipodocumento = null;
    public anywheresoftware.b4a.objects.SpinnerWrapper _ptipodocumento = null;
    public anywheresoftware.b4a.objects.LabelWrapper _lblgridintestazione = null;
    public anywheresoftware.b4a.objects.PanelWrapper _pnlelencoristampa = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _btngridok = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _btngridannulla = null;
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

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.app.Activity activity;
        super.onCreate(bundle);
        mostCurrent = this;
        if (processBA == null) {
            processBA = new anywheresoftware.b4a.BA(getApplicationContext(), null, null, "cassandraRisto.ital", "cassandraRisto.ital.fatturafm");
            processBA.loadHtSubs(getClass());
            anywheresoftware.b4a.BALayout.setDeviceScale(getApplicationContext().getResources().getDisplayMetrics().density);
        } else if (previousOne != null && (activity = previousOne.get()) != null && activity != this) {
            anywheresoftware.b4a.BA.LogInfo("Killing previous instance (fatturafm).");
            activity.finish();
        }
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
        getWindow().requestFeature(1);
        processBA.sharedProcessBA.activityBA = null;
        this.layout = new anywheresoftware.b4a.BALayout(this);
        setContentView(this.layout);
        afterFirstLayout = false;
        cassandraRisto.ital.fatturafm.WaitForLayout waitForLayout = new cassandraRisto.ital.fatturafm.WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, waitForLayout, false)) {
            anywheresoftware.b4a.BA.handler.postDelayed(waitForLayout, 5L);
        }
    }

    static class WaitForLayout implements java.lang.Runnable {
        WaitForLayout() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!cassandraRisto.ital.fatturafm.afterFirstLayout && cassandraRisto.ital.fatturafm.mostCurrent != null) {
                if (cassandraRisto.ital.fatturafm.mostCurrent.layout.getWidth() == 0) {
                    anywheresoftware.b4a.BA.handler.postDelayed(this, 5L);
                    return;
                }
                cassandraRisto.ital.fatturafm.mostCurrent.layout.getLayoutParams().height = cassandraRisto.ital.fatturafm.mostCurrent.layout.getHeight();
                cassandraRisto.ital.fatturafm.mostCurrent.layout.getLayoutParams().width = cassandraRisto.ital.fatturafm.mostCurrent.layout.getWidth();
                cassandraRisto.ital.fatturafm.afterFirstLayout = true;
                cassandraRisto.ital.fatturafm.mostCurrent.afterFirstLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afterFirstLayout() {
        if (this == mostCurrent) {
            this.activityBA = new anywheresoftware.b4a.BA(this, this.layout, processBA, "cassandraRisto.ital", "cassandraRisto.ital.fatturafm");
            processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<>(this.activityBA);
            anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
            this._activity = new anywheresoftware.b4a.objects.ActivityWrapper(this.activityBA, "activity");
            anywheresoftware.b4a.Msgbox.isDismissing = false;
            if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(processBA)) {
                if (isFirst) {
                    processBA.raiseEvent2(null, true, "SHELL", false, new java.lang.Object[0]);
                }
                processBA.raiseEvent2(null, true, "CREATE", true, "cassandraRisto.ital.fatturafm", processBA, this.activityBA, this._activity, java.lang.Float.valueOf(anywheresoftware.b4a.keywords.Common.Density), mostCurrent);
                this._activity.reinitializeForShell(this.activityBA, "activity");
            }
            initializeProcessGlobals();
            initializeGlobals();
            anywheresoftware.b4a.BA.LogInfo("** Activity (fatturafm) Create, isFirst = " + isFirst + " **");
            processBA.raiseEvent2(null, true, "activity_create", false, java.lang.Boolean.valueOf(isFirst));
            isFirst = false;
            if (this == mostCurrent) {
                processBA.setActivityPaused(false);
                anywheresoftware.b4a.BA.LogInfo("** Activity (fatturafm) Resume **");
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
            add.setOnMenuItemClickListener(new cassandraRisto.ital.fatturafm.B4AMenuItemsClickListener(next.eventName.toLowerCase(anywheresoftware.b4a.BA.cul)));
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
            cassandraRisto.ital.fatturafm.processBA.raiseEventFromUI(menuItem.getTitle(), this.eventName + "_click", new java.lang.Object[0]);
            return true;
        }
    }

    public static java.lang.Class<?> getObject() {
        return cassandraRisto.ital.fatturafm.class;
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
                cassandraRisto.ital.fatturafm.HandleKeyDelayed handleKeyDelayed = new cassandraRisto.ital.fatturafm.HandleKeyDelayed(this, null);
                handleKeyDelayed.kc = i;
                anywheresoftware.b4a.BA.handler.post(handleKeyDelayed);
                return true;
            }
            if (new cassandraRisto.ital.fatturafm.HandleKeyDelayed(this, null).runDirectly(i)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private class HandleKeyDelayed implements java.lang.Runnable {
        int kc;

        private HandleKeyDelayed() {
        }

        /* synthetic */ HandleKeyDelayed(cassandraRisto.ital.fatturafm fatturafmVar, cassandraRisto.ital.fatturafm.1 r2) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            runDirectly(this.kc);
        }

        public boolean runDirectly(int i) {
            java.lang.Boolean bool = (java.lang.Boolean) cassandraRisto.ital.fatturafm.processBA.raiseEvent2(cassandraRisto.ital.fatturafm.this._activity, false, "activity_keypress", false, java.lang.Integer.valueOf(i));
            if (bool == null || bool.booleanValue()) {
                return true;
            }
            if (i != 4) {
                return false;
            }
            cassandraRisto.ital.fatturafm.this.finish();
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
                anywheresoftware.b4a.BA.LogInfo("** Activity (fatturafm) Pause, UserClosed = " + this.activityBA.activity.isFinishing() + " **");
            } else {
                anywheresoftware.b4a.BA.LogInfo("** Activity (fatturafm) Pause event (activity is not paused). **");
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
            anywheresoftware.b4a.BA.handler.post(new cassandraRisto.ital.fatturafm.ResumeMessage(mostCurrent));
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
            cassandraRisto.ital.fatturafm fatturafmVar = cassandraRisto.ital.fatturafm.mostCurrent;
            if (fatturafmVar != null && fatturafmVar == this.activity.get()) {
                cassandraRisto.ital.fatturafm.processBA.setActivityPaused(false);
                anywheresoftware.b4a.BA.LogInfo("** Activity (fatturafm) Resume **");
                if (fatturafmVar == cassandraRisto.ital.fatturafm.mostCurrent) {
                    cassandraRisto.ital.fatturafm.processBA.raiseEvent(fatturafmVar._activity, "activity_resume", (java.lang.Object[]) null);
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
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 >= 19) {
            new anywheresoftware.b4j.object.JavaObject();
            anywheresoftware.b4j.object.JavaObject javaObject = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), mostCurrent._activity.getObject());
            javaObject.RunMethod("setOnSystemUiVisibilityChangeListener", new java.lang.Object[]{javaObject.CreateEvent(processBA, "android.view.View.OnSystemUiVisibilityChangeListener", "VisibilityChanged", anywheresoftware.b4a.keywords.Common.Null)});
            mostCurrent._activity.setWidth(-1);
            mostCurrent._activity.setHeight(-1);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        }
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA);
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_attivaterminale) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
            return "";
        }
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
        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) && anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)) {
            anywheresoftware.b4a.keywords.Common.LogImpl("4122159113", "appClosed", 0);
            return "";
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String _activity_resume() throws java.lang.Exception {
        java.lang.String ExecQuerySingleResult;
        java.lang.String str;
        java.lang.String Date;
        java.lang.String str2;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (!cassandraRisto.ital.mod1._vvvv4) {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized())) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvv0 = "Activity_Resume";
                try {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6("FatturaFM");
                    cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._chiudi.getObject()));
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(mostCurrent.activityBA, "");
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Data"));
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setTextSize(16.0f);
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                    labelWrapper.setTextColor(-1);
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize(mostCurrent.activityBA, "");
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Importo"));
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.setTextSize(16.0f);
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                    labelWrapper2.setTextColor(-1);
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(mostCurrent.activityBA, "");
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Cliente"));
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.setTextSize(16.0f);
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                    anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
                    labelWrapper3.setTextColor(-1);
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize(mostCurrent.activityBA, "");
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Fatt.N."));
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTextSize(16.0f);
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
                    labelWrapper4.setTextColor(-1);
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize(mostCurrent.activityBA, "");
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTextSize(20.0f);
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
                    anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
                    labelWrapper5.setTextColor(-1);
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = mostCurrent._btngridannulla;
                    anywheresoftware.b4a.keywords.constants.Colors colors6 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper.setTextColor(-1);
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = mostCurrent._btngridok;
                    anywheresoftware.b4a.keywords.constants.Colors colors7 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper2.setTextColor(-1);
                    mostCurrent._lblgridintestazione.setTextSize(26.0f);
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper6 = mostCurrent._lblgridintestazione;
                    anywheresoftware.b4a.keywords.constants.Colors colors8 = anywheresoftware.b4a.keywords.Common.Colors;
                    labelWrapper6.setTextColor(-1);
                    mostCurrent._lblgridintestazione.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Ristampa Fattura"));
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper7 = mostCurrent._lblgridintestazione;
                    anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
                    labelWrapper7.setGravity(1);
                    anywheresoftware.b4a.objects.PanelWrapper panelWrapper = mostCurrent._pnlelencoristampa;
                    cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors9 = anywheresoftware.b4a.keywords.Common.Colors;
                    panelWrapper.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba, anywheresoftware.b4a.keywords.constants.Colors.RGB(29, 12, 80), 0).getObject());
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper3 = mostCurrent._btngridannulla;
                    cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors10 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper3.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba2, -65536, 25).getObject());
                    anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper4 = mostCurrent._btngridok;
                    cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    anywheresoftware.b4a.BA ba3 = mostCurrent.activityBA;
                    anywheresoftware.b4a.keywords.constants.Colors colors11 = anywheresoftware.b4a.keywords.Common.Colors;
                    buttonWrapper4.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba3, -16711936, 25).getObject());
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._initialize(mostCurrent.activityBA, getObject(), "clCli");
                    cassandraRisto.ital.customlistviewold customlistviewoldVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    anywheresoftware.b4a.keywords.constants.Colors colors12 = anywheresoftware.b4a.keywords.Common.Colors;
                    customlistviewoldVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = -16776961;
                    mostCurrent._pnlelencoristampa.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), anywheresoftware.b4a.keywords.Common.DipToCurrent(30), anywheresoftware.b4a.keywords.Common.PerYToCurrent(12.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerXToCurrent(20.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(14.0f, mostCurrent.activityBA));
                    mostCurrent._pnlelencoristampa.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(30.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(12.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerXToCurrent(14.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(14.0f, mostCurrent.activityBA));
                    mostCurrent._pnlelencoristampa.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(47.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(12.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerXToCurrent(26.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(14.0f, mostCurrent.activityBA));
                    mostCurrent._pnlelencoristampa.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(70.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(12.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerXToCurrent(10.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(14.0f, mostCurrent.activityBA));
                    mostCurrent._pnlelencoristampa.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(5.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(80.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerXToCurrent(80.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(6.0f, mostCurrent.activityBA));
                    mostCurrent._pnlelencoristampa.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7().getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(1.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(15.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerXToCurrent(99.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(62.0f, mostCurrent.activityBA));
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper8 = mostCurrent._lbltitolo;
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    labelWrapper8.setColor(cassandraRisto.ital.main._v_colormenutitle);
                    cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, mostCurrent._lbltitolo);
                    anywheresoftware.b4a.objects.LabelWrapper labelWrapper9 = mostCurrent._lblinfo;
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    labelWrapper9.setColor(cassandraRisto.ital.main._v_colormenutitle);
                    cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, mostCurrent._lblinfo);
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._initialize(mostCurrent.activityBA, getObject(), "clv3");
                    cassandraRisto.ital.customlistviewold customlistviewoldVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    anywheresoftware.b4a.keywords.constants.Colors colors13 = anywheresoftware.b4a.keywords.Common.Colors;
                    customlistviewoldVar2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = anywheresoftware.b4a.keywords.constants.Colors.RGB(245, 245, 245);
                    mostCurrent._pnllist.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7().getObject(), anywheresoftware.b4a.keywords.Common.DipToCurrent(0), anywheresoftware.b4a.keywords.Common.PerYToCurrent(10.0f, mostCurrent.activityBA), mostCurrent._pnllist.getWidth(), mostCurrent._pnllist.getHeight() - anywheresoftware.b4a.keywords.Common.PerYToCurrent(28.0f, mostCurrent.activityBA));
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
                    cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "CausaliPagamenti.codice=2 Or CausaliPagamenti.NonRiscosso=1 ";
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                        cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "CausaliPagamenti.codice=2 ";
                        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select codice from pagamenti where cassa =1 and RTPagamento=7 and codice <> 2"));
                        if (cursorWrapper2.getRowCount() > 0) {
                            int rowCount = cursorWrapper2.getRowCount() - 1;
                            for (int i = 0; i <= rowCount; i++) {
                                cursorWrapper2.setPosition(i);
                                cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = sb.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(" or CausaliPagamenti.codice =").append(cursorWrapper2.GetString("codice")).toString();
                            }
                        }
                    }
                    cassandraRisto.ital.fatturafm fatturafmVar5 = mostCurrent;
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    fatturafmVar5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from iva order by codice"));
                    cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("Select min(headmov.datam) from headmov inner join CausaliPagamenti on  CausaliPagamenti.nmov= headmov.nmov\n\t\twhere (");
                    cassandraRisto.ital.fatturafm fatturafmVar6 = mostCurrent;
                    ExecQuerySingleResult = sql.ExecQuerySingleResult(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append(") and headmov.cliente<>'' and headmov.nfat=0 and  (nscontrinoffm >0 or  RicDaFatt=1) and nfat_fm=0").toString());
                    if (ExecQuerySingleResult == null || ExecQuerySingleResult.length() < 8) {
                        ExecQuerySingleResult = "01/01/2000";
                    }
                    str = ExecQuerySingleResult.substring(3, 5) + "/" + ExecQuerySingleResult.substring(0, 2) + "/" + ExecQuerySingleResult.substring(6, 10);
                    anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                    cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    Date = anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA));
                    str2 = Date.substring(3, 5) + "/" + Date.substring(0, 2) + "/" + Date.substring(6, 10);
                } catch (java.lang.Exception e) {
                    processBA.setLastException(e);
                    cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
                }
                if (ExecQuerySingleResult.length() == 0) {
                    java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Non esiste nessun movimento da fatturare");
                    cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                    cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                    mostCurrent._activity.Finish();
                    cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "Main");
                    return "";
                }
                mostCurrent._lbltitolo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Fatturazione Fine Mese"));
                mostCurrent._dadata.setTag(ExecQuerySingleResult.substring(6, 10) + "-" + ExecQuerySingleResult.substring(0, 2) + "-" + ExecQuerySingleResult.substring(3, 5) + " 00:00:00");
                mostCurrent._dadata.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Dal " + str));
                mostCurrent._adata.setTag(Date.substring(6, 10) + "-" + Date.substring(0, 2) + "-" + Date.substring(3, 5) + " 23:59:59");
                mostCurrent._adata.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Al " + str2));
                mostCurrent._datafattura.setTag(Date);
                mostCurrent._datafattura.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Data Fattura " + str2));
                mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._initialize(mostCurrent.activityBA, getObject(), "clv2");
                cassandraRisto.ital.customlistviewold customlistviewoldVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.keywords.constants.Colors colors14 = anywheresoftware.b4a.keywords.Common.Colors;
                customlistviewoldVar3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = anywheresoftware.b4a.keywords.constants.Colors.RGB(245, 245, 245);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper5 = mostCurrent._dadata;
                cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                buttonWrapper5.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, -6572819, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper6 = mostCurrent._bristampa;
                cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                buttonWrapper6.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, -1335933, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper7 = mostCurrent._adata;
                cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                buttonWrapper7.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, -6572819, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper8 = mostCurrent._ricerca;
                cassandraRisto.ital.mod1 mod1Var15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                buttonWrapper8.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, -1335933, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper9 = mostCurrent._datafattura;
                cassandraRisto.ital.mod1 mod1Var16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                buttonWrapper9.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, -6572819, 25).getObject());
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1("");
                cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_lastdatadocfm) {
                    mostCurrent._datafattura.setEnabled(false);
                    mostCurrent._datafattura.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Data fattura: da documento"));
                }
                mostCurrent._panelgrid.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7().getObject(), 0, 0, mostCurrent._panelgrid.getWidth(), mostCurrent._panelgrid.getHeight() - anywheresoftware.b4a.keywords.Common.PerYToCurrent(2.0f, mostCurrent.activityBA));
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                cassandraRisto.ital.mod1 mod1Var17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
                return "";
            }
        }
        mostCurrent._activity.Finish();
        return "";
    }

    public static java.lang.String _adata_click() throws java.lang.Exception {
        anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog dateDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._adata.getTag());
        dateDialog.setYear((int) java.lang.Double.parseDouble(ObjectToString.substring(0, 4)));
        dateDialog.setDayOfMonth((int) java.lang.Double.parseDouble(ObjectToString.substring(9, 11)));
        dateDialog.setMonth((int) java.lang.Double.parseDouble(ObjectToString.substring(5, 7)));
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = dateDialog.Show("Impostare la data di fine ricerca", "Imposta Filtro Data", "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            mostCurrent._adata.setTag(anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear()) + "-" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + "-" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + " 23:59:59");
            mostCurrent._adata.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Al " + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + "/" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + "/" + anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear())));
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(int i, java.lang.String str, boolean z) throws java.lang.Exception {
        try {
            anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
            list.Initialize();
            anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
            map.Initialize();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from ExportFattureHead where nfat=" + anywheresoftware.b4a.BA.NumberToString(i));
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("delete from ExportFattureDett where nfat=" + anywheresoftware.b4a.BA.NumberToString(i));
            map.Put("nfat", java.lang.Integer.valueOf(i));
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._datafattura.getTag());
            if (z) {
                cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
                ObjectToString = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
            }
            map.Put("data", ObjectToString.substring(6, 10) + "-" + ObjectToString.substring(0, 2) + "-" + ObjectToString.substring(3, 5));
            map.Put("cliente", str);
            list.Add(map.getObject());
            cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "ExportFattureHead", list);
            list.Initialize();
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select codint, iva,importo,prezzov,qta from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + str.trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(i) + " and datfat_fm = '" + ObjectToString + "' order by dataeoraffm"));
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i2 = 0; i2 <= rowCount; i2++) {
                cursorWrapper2.setPosition(i2);
                map.Initialize();
                map.Put("codint", cursorWrapper2.GetString("codint"));
                map.Put("nfat", java.lang.Integer.valueOf(i));
                map.Put("iva", java.lang.Integer.valueOf(cursorWrapper2.GetInt("iva")));
                map.Put("qta", java.lang.Integer.valueOf(cursorWrapper2.GetInt("qta")));
                map.Put("importo", cursorWrapper2.GetDouble("importo"));
                map.Put("prezzov", cursorWrapper2.GetDouble("prezzov"));
                list.Add(map.getObject());
            }
            cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1, "ExportFattureDett", list);
            cursorWrapper2.Close();
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _annullalist_click() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_riducimsg)) {
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione ... eventuali modifiche verranno annullate ...\nSi desidera proseguire ?");
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
            if (Msgbox2 != -1) {
                return "";
            }
        }
        mostCurrent._pnllist.setVisible(false);
        return "";
    }

    public static java.lang.String _bcopie_click() throws java.lang.Exception {
        int i;
        new anywheresoftware.b4a.objects.ButtonWrapper();
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA));
        int ObjectToNumber = anywheresoftware.b4a.keywords.Common.IsNumber(anywheresoftware.b4a.BA.ObjectToString(mostCurrent._bnumerocopie.getTag())) ? (int) anywheresoftware.b4a.BA.ObjectToNumber(mostCurrent._bnumerocopie.getTag()) : 0;
        if (buttonWrapper.getTag().equals("less")) {
            i = ObjectToNumber - 1;
        } else {
            i = ObjectToNumber + 1;
        }
        int i2 = i >= 0 ? i : 0;
        mostCurrent._bnumerocopie.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize().Size(14).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Numero di copie stampa di riepilogo: \n")).Bold().Size(20).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(java.lang.Integer.valueOf(i2))).PopAll().getObject()));
        mostCurrent._bnumerocopie.setTag(java.lang.Integer.valueOf(i2));
        return "";
    }

    public static java.lang.String _bnumerocopie_click() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _bristampa_click() throws java.lang.Exception {
        anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog dateDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
        anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog dateDialog2 = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        dateDialog.setYear(anywheresoftware.b4a.keywords.DateTime.GetYear(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)));
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        dateDialog.setMonth(anywheresoftware.b4a.keywords.DateTime.GetMonth(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)));
        anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        dateDialog.setDayOfMonth(anywheresoftware.b4a.keywords.DateTime.GetDayOfMonth(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)));
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = dateDialog.Show("Impostare la data di inizio ricerca ", "Filtro Data", "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            dateDialog2.setYear(anywheresoftware.b4a.keywords.DateTime.GetYear(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)));
            anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            dateDialog2.setMonth(anywheresoftware.b4a.keywords.DateTime.GetMonth(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)));
            anywheresoftware.b4a.keywords.DateTime dateTime6 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            dateDialog2.setDayOfMonth(anywheresoftware.b4a.keywords.DateTime.GetDayOfMonth(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)));
            anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            int Show2 = dateDialog2.Show("Impostare la data di fine ricerca ", "Filtro Data", "Ok", "Annulla", "", ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse2 = anywheresoftware.b4a.keywords.Common.DialogResponse;
            if (Show2 == -1) {
                java.lang.String str = "substr(datfat_fm,7,4) || substr(datfat_fm,1,2) || substr(datfat_fm,4,2) >= '" + anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear()) + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + "' and substr(datfat_fm,7,4) || substr(datfat_fm,1,2) || substr(datfat_fm,4,2) <= '" + anywheresoftware.b4a.BA.NumberToString(dateDialog2.getYear()) + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog2.getMonth(), 2, 0) + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog2.getDayOfMonth(), 2, 0) + "' and ";
                cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti inner join headmov As h2 on CausaliPagamenti.nmov= h2.nmov where h2.nfat_fm = headmov.nfat_fm  and substr(headmov.datam,7,4)=substr(h2.datam,7,4) and h2.cliente = headmov.cliente and (");
                cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
                fatturafmVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, sql.ExecQuery(append.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(") ) As totale,cliente,max(clides) as clides,nfat_fm As nfat,datfat_fm As datam from headmov  where ").append(str).append("  headmov.nfat=0 and FattFM=1 And nfat_fm  >0 group by cliente,nfat_fm,datfat_fm order by substr(datfat_fm,7,4) || substr(datfat_fm,1,2) || substr(datfat_fm,4,2) desc,nfat_fm asc").toString()));
                mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
                if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getRowCount() > 0) {
                    int rowCount = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getRowCount() - 1;
                    for (int i = 0; i <= rowCount; i++) {
                        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setPosition(i);
                        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.BA.NumberToString(i), anywheresoftware.b4a.keywords.Common.DipToCurrent(70)), anywheresoftware.b4a.keywords.Common.DipToCurrent(70), mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("cliente"));
                    }
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(0);
                }
                mostCurrent._pnlelencoristampa.SetVisibleAnimated(300, true);
                return "";
            }
            return "";
        }
        return "";
    }

    public static java.lang.String _btngridannulla_click() throws java.lang.Exception {
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        mostCurrent._pnlelencoristampa.SetVisibleAnimated(300, false);
        return "";
    }

    public static void _btngridok_click() throws java.lang.Exception {
        new cassandraRisto.ital.fatturafm.ResumableSub_btnGridOK_Click(null).resume(processBA, null);
    }

    public static class ResumableSub_btnGridOK_Click extends anywheresoftware.b4a.BA.ResumableSub {
        cassandraRisto.ital.fatturafm parent;
        int _answ = 0;
        java.lang.String _txt = "";
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
        anywheresoftware.b4a.objects.collections.Map _result = null;

        public ResumableSub_btnGridOK_Click(cassandraRisto.ital.fatturafm fatturafmVar) {
            this.parent = fatturafmVar;
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
                        this.state = 59;
                        cassandraRisto.ital.fatturafm fatturafmVar = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar2 = cassandraRisto.ital.fatturafm.mostCurrent;
                        if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.equals("")) {
                            this.state = 3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.state = 4;
                        this._answ = 0;
                        this._txt = "";
                        java.lang.StringBuilder append = new java.lang.StringBuilder().append("Confermi la ristampa della fattura  ");
                        cassandraRisto.ital.fatturafm fatturafmVar3 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar4 = cassandraRisto.ital.fatturafm.mostCurrent;
                        this._txt = append.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" ?").toString();
                        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(this._txt);
                        cassandraRisto.ital.fatturafm fatturafmVar5 = this.parent;
                        cassandraRisto.ital.main mainVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                        cassandraRisto.ital.fatturafm fatturafmVar6 = this.parent;
                        cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._answ = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        break;
                    case 4:
                        this.state = 58;
                        int i = this._answ;
                        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                        if (i != -1) {
                            break;
                        } else {
                            this.state = 6;
                            break;
                        }
                    case 6:
                        this.state = 7;
                        break;
                    case 7:
                        this.state = 12;
                        cassandraRisto.ital.fatturafm fatturafmVar7 = this.parent;
                        cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                            cassandraRisto.ital.fatturafm fatturafmVar8 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_stampafattura != 100) {
                                this.state = 11;
                                break;
                            }
                        }
                        this.state = 9;
                        break;
                    case 9:
                        this.state = 12;
                        java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Si desidera stampare la fattura ");
                        cassandraRisto.ital.fatturafm fatturafmVar9 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar10 = cassandraRisto.ital.fatturafm.mostCurrent;
                        java.lang.StringBuilder append3 = append2.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" sul ");
                        cassandraRisto.ital.fatturafm fatturafmVar11 = this.parent;
                        cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._txt = append3.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" o Generare e inviare un PDF ?  ").toString();
                        java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence(this._txt);
                        cassandraRisto.ital.fatturafm fatturafmVar12 = this.parent;
                        cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                        cassandraRisto.ital.fatturafm fatturafmVar13 = this.parent;
                        cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._answ = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "MF", "Annulla", "PDF", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        break;
                    case 11:
                        this.state = 12;
                        java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Si desidera stampare la fattura ");
                        cassandraRisto.ital.fatturafm fatturafmVar14 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar15 = cassandraRisto.ital.fatturafm.mostCurrent;
                        this._txt = append4.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(" sulla Stampante Non Fiscale o Generare e inviare un PDF ?  ").toString();
                        java.lang.CharSequence ObjectToCharSequence5 = anywheresoftware.b4a.BA.ObjectToCharSequence(this._txt);
                        cassandraRisto.ital.fatturafm fatturafmVar16 = this.parent;
                        cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.CharSequence ObjectToCharSequence6 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                        cassandraRisto.ital.fatturafm fatturafmVar17 = this.parent;
                        cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._answ = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence5, ObjectToCharSequence6, "Stampante Non Fiscale", "Annulla", "PDF", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        break;
                    case 12:
                        this.state = 21;
                        int i2 = this._answ;
                        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse2 = anywheresoftware.b4a.keywords.Common.DialogResponse;
                        if (i2 != -1) {
                            break;
                        } else {
                            this.state = 14;
                            break;
                        }
                    case 14:
                        this.state = 15;
                        break;
                    case 15:
                        this.state = 20;
                        cassandraRisto.ital.fatturafm fatturafmVar18 = this.parent;
                        cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                            cassandraRisto.ital.fatturafm fatturafmVar19 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_stampafattura != 100) {
                                cassandraRisto.ital.fatturafm fatturafmVar20 = this.parent;
                                cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_stampafattura >= 19) {
                                    break;
                                } else {
                                    this.state = 19;
                                    break;
                                }
                            }
                        }
                        this.state = 17;
                        break;
                    case 17:
                        this.state = 20;
                        cassandraRisto.ital.fatturafm._stampa(true);
                        break;
                    case 19:
                        this.state = 20;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(true);
                        break;
                    case 20:
                        this.state = 21;
                        break;
                    case 21:
                        this.state = 52;
                        int i3 = this._answ;
                        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse3 = anywheresoftware.b4a.keywords.Common.DialogResponse;
                        if (i3 != -2) {
                            break;
                        } else {
                            this.state = 23;
                            break;
                        }
                    case 23:
                        this.state = 24;
                        break;
                    case 24:
                        this.state = 51;
                        cassandraRisto.ital.fatturafm fatturafmVar21 = this.parent;
                        cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!cassandraRisto.ital.main._v_attivafe) {
                            break;
                        } else {
                            this.state = 26;
                            break;
                        }
                    case 26:
                        this.state = 27;
                        cassandraRisto.ital.fatturafm fatturafmVar22 = this.parent;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
                        break;
                    case 27:
                        this.state = 36;
                        this.state = 29;
                        break;
                    case 29:
                        this.state = 30;
                        this._rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                        cassandraRisto.ital.fatturafm fatturafmVar23 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar24 = cassandraRisto.ital.fatturafm.mostCurrent;
                        java.lang.String str = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                        cassandraRisto.ital.fatturafm fatturafmVar25 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar26 = cassandraRisto.ital.fatturafm.mostCurrent;
                        int parseDouble = (int) java.lang.Double.parseDouble(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                        cassandraRisto.ital.fatturafm fatturafmVar27 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar28 = cassandraRisto.ital.fatturafm.mostCurrent;
                        java.lang.String str2 = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                        java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(" where  FattFM=1 and  headmov.cliente = '");
                        cassandraRisto.ital.fatturafm fatturafmVar29 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar30 = cassandraRisto.ital.fatturafm.mostCurrent;
                        java.lang.StringBuilder append6 = append5.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.trim()).append("' and ");
                        cassandraRisto.ital.fatturafm fatturafmVar31 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar32 = cassandraRisto.ital.fatturafm.mostCurrent;
                        this._rs = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(str, true, parseDouble, false, str2, append6.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).toString());
                        anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.fatturafm.processBA, this, this._rs);
                        this.state = 60;
                        return;
                    case 30:
                        this.state = 35;
                        cassandraRisto.ital.fatturafm fatturafmVar33 = this.parent;
                        if (cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 && this._result.IsInitialized()) {
                            this.state = 32;
                            break;
                        } else {
                            this.state = 34;
                            break;
                        }
                    case 32:
                        this.state = 35;
                        cassandraRisto.ital.fatturafm fatturafmVar34 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = this._result;
                        break;
                    case 34:
                        this.state = 35;
                        this.state = 36;
                        break;
                    case 35:
                        this.state = 27;
                        break;
                    case 36:
                        this.state = 45;
                        if (anywheresoftware.b4a.keywords.Common.Not(this._result.IsInitialized())) {
                            this.state = 38;
                            break;
                        } else {
                            this.state = 40;
                            break;
                        }
                    case 38:
                        this.state = 45;
                        return;
                    case 40:
                        this.state = 41;
                        cassandraRisto.ital.fatturafm fatturafmVar35 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = this._result;
                        break;
                    case 41:
                        this.state = 44;
                        cassandraRisto.ital.fatturafm fatturafmVar36 = this.parent;
                        if (!cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                            break;
                        } else {
                            cassandraRisto.ital.fatturafm fatturafmVar37 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getSize() != 0) {
                                break;
                            } else {
                                this.state = 43;
                                break;
                            }
                        }
                    case 43:
                        this.state = 44;
                        cassandraRisto.ital.fatturafm fatturafmVar38 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) anywheresoftware.b4a.keywords.Common.Null);
                        break;
                    case 44:
                        this.state = 45;
                        break;
                    case 45:
                        this.state = 50;
                        cassandraRisto.ital.fatturafm fatturafmVar39 = this.parent;
                        if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized())) {
                            break;
                        } else {
                            this.state = 47;
                            break;
                        }
                    case 47:
                        this.state = 50;
                        return;
                    case 50:
                        this.state = 51;
                        break;
                    case 51:
                        this.state = 52;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(true, cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(true));
                        break;
                    case 52:
                        this.state = 57;
                        int i4 = this._answ;
                        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse4 = anywheresoftware.b4a.keywords.Common.DialogResponse;
                        if (i4 == -3) {
                            break;
                        } else {
                            this.state = 54;
                            break;
                        }
                    case 54:
                        this.state = 57;
                        cassandraRisto.ital.fatturafm fatturafmVar40 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar41 = cassandraRisto.ital.fatturafm.mostCurrent;
                        int parseDouble2 = (int) java.lang.Double.parseDouble(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                        cassandraRisto.ital.fatturafm fatturafmVar42 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar43 = cassandraRisto.ital.fatturafm.mostCurrent;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(parseDouble2, cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0, true);
                        break;
                    case 57:
                        this.state = 58;
                        break;
                    case 58:
                        this.state = 59;
                        break;
                    case 59:
                        this.state = -1;
                        cassandraRisto.ital.fatturafm fatturafmVar44 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar45 = cassandraRisto.ital.fatturafm.mostCurrent;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
                        cassandraRisto.ital.fatturafm fatturafmVar46 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar47 = cassandraRisto.ital.fatturafm.mostCurrent;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
                        cassandraRisto.ital.fatturafm fatturafmVar48 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar49 = cassandraRisto.ital.fatturafm.mostCurrent;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
                        cassandraRisto.ital.fatturafm fatturafmVar50 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar51 = cassandraRisto.ital.fatturafm.mostCurrent;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
                        cassandraRisto.ital.fatturafm fatturafmVar52 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                        cassandraRisto.ital.fatturafm fatturafmVar53 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        break;
                    case 60:
                        this.state = 30;
                        this._result = (anywheresoftware.b4a.objects.collections.Map) objArr[0];
                        break;
                }
            }
        }
    }

    public static void _complete(anywheresoftware.b4a.objects.collections.Map map) throws java.lang.Exception {
    }

    public static void _buttonfun_click() throws java.lang.Exception {
        new cassandraRisto.ital.fatturafm.ResumableSub_buttonFun_Click(null).resume(processBA, null);
    }

    public static class ResumableSub_buttonFun_Click extends anywheresoftware.b4a.BA.ResumableSub {
        cassandraRisto.ital.fatturafm parent;
        int _index = 0;
        anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
        anywheresoftware.b4a.objects.LabelWrapper _lcurs = null;
        java.lang.String _txt = "";
        int _result = 0;
        int _nf = 0;
        java.lang.String _codcliente = "";

        public ResumableSub_buttonFun_Click(cassandraRisto.ital.fatturafm fatturafmVar) {
            this.parent = fatturafmVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                            this.state = 4;
                            cassandraRisto.ital.fatturafm fatturafmVar = this.parent;
                            if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                                cassandraRisto.ital.fatturafm fatturafmVar2 = this.parent;
                                if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
                                    break;
                                }
                            }
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            return;
                        case 4:
                            this.state = 5;
                            cassandraRisto.ital.fatturafm fatturafmVar3 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                            cassandraRisto.ital.fatturafm fatturafmVar4 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvv0 = "  Sub buttonFun_Click";
                            break;
                        case 5:
                            this.state = 23;
                            this.catchState = 22;
                            this.state = 7;
                            break;
                        case 7:
                            this.state = 8;
                            this.catchState = 22;
                            this._index = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar5 = this.parent;
                            this._index = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) anywheresoftware.b4a.keywords.Common.Sender(cassandraRisto.ital.fatturafm.mostCurrent.activityBA)));
                            this._pnl = new anywheresoftware.b4a.objects.PanelWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar6 = this.parent;
                            this._pnl = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._getpanel(this._index);
                            this._lcurs = new anywheresoftware.b4a.objects.LabelWrapper();
                            this._lcurs = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView) this._pnl.GetView(6).getObject());
                            cassandraRisto.ital.fatturafm fatturafmVar7 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setPosition((int) java.lang.Double.parseDouble(this._lcurs.getText()));
                            this._txt = "";
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Confermi l'emissione della fattura per  ");
                            cassandraRisto.ital.fatturafm fatturafmVar8 = this.parent;
                            this._txt = append.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("descrizione"))).append(" ?").toString();
                            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(this._txt);
                            cassandraRisto.ital.fatturafm fatturafmVar9 = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.fatturafm fatturafmVar10 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.Msgbox2Async(ObjectToCharSequence, ObjectToCharSequence2, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, cassandraRisto.ital.fatturafm.processBA, false);
                            anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", cassandraRisto.ital.fatturafm.processBA, this, null);
                            this.state = 24;
                            return;
                        case 8:
                            this.state = 11;
                            int i = this._result;
                            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                            if (i != -2) {
                                break;
                            } else {
                                this.state = 10;
                                break;
                            }
                        case 10:
                            this.state = 11;
                            cassandraRisto.ital.fatturafm fatturafmVar11 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                            cassandraRisto.ital.fatturafm fatturafmVar12 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                            return;
                        case 11:
                            this.state = 12;
                            cassandraRisto.ital.fatturafm fatturafmVar13 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("select valore from progressivi where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar14 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar15 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._nf = (int) java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append2.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
                            cassandraRisto.ital.fatturafm fatturafmVar16 = this.parent;
                            this._codcliente = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli");
                            break;
                        case 12:
                            this.state = 15;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(this._index))) {
                                break;
                            } else {
                                this.state = 14;
                                break;
                            }
                        case 14:
                            this.state = 15;
                            cassandraRisto.ital.fatturafm fatturafmVar17 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                            return;
                        case 15:
                            this.state = 20;
                            cassandraRisto.ital.fatturafm fatturafmVar18 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_stampafattura != 100) {
                                cassandraRisto.ital.fatturafm fatturafmVar19 = this.parent;
                                cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                                    cassandraRisto.ital.fatturafm fatturafmVar20 = this.parent;
                                    cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_stampafattura >= 19) {
                                        break;
                                    } else {
                                        this.state = 19;
                                        break;
                                    }
                                }
                            }
                            this.state = 17;
                            break;
                        case 17:
                            this.state = 20;
                            cassandraRisto.ital.fatturafm._stampa(false);
                            break;
                        case 19:
                            this.state = 20;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(false);
                            break;
                        case 20:
                            this.state = 23;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(this._nf, this._codcliente, false);
                            cassandraRisto.ital.fatturafm fatturafmVar21 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                            break;
                        case 22:
                            this.state = 23;
                            this.catchState = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar22 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.fatturafm.mostCurrent.activityBA).getMessage());
                            break;
                        case 23:
                            this.state = -1;
                            this.catchState = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar23 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                            break;
                        case 24:
                            this.state = 8;
                            this._result = ((java.lang.Integer) objArr[0]).intValue();
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.fatturafm.processBA.setLastException(e);
                }
            }
        }
    }

    public static void _msgbox_result(int i) throws java.lang.Exception {
    }

    public static void _buttonfun2_click() throws java.lang.Exception {
        new cassandraRisto.ital.fatturafm.ResumableSub_buttonFun2_Click(null).resume(processBA, null);
    }

    public static class ResumableSub_buttonFun2_Click extends anywheresoftware.b4a.BA.ResumableSub {
        cassandraRisto.ital.fatturafm parent;
        int _index = 0;
        anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
        anywheresoftware.b4a.objects.LabelWrapper _lcurs = null;
        java.lang.String _txt = "";
        int _resultmsg = 0;
        int _nf = 0;
        java.lang.String _codcliente = "";
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
        anywheresoftware.b4a.objects.collections.Map _result = null;

        public ResumableSub_buttonFun2_Click(cassandraRisto.ital.fatturafm fatturafmVar) {
            this.parent = fatturafmVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                            cassandraRisto.ital.fatturafm fatturafmVar = this.parent;
                            if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) {
                                cassandraRisto.ital.fatturafm fatturafmVar2 = this.parent;
                                if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
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
                            cassandraRisto.ital.fatturafm fatturafmVar3 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvv0 = "  Sub buttonFun2_Click";
                            break;
                        case 7:
                            this.state = 45;
                            this.catchState = 44;
                            this.state = 9;
                            break;
                        case 9:
                            this.state = 10;
                            this.catchState = 44;
                            cassandraRisto.ital.fatturafm fatturafmVar4 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                            this._index = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar5 = this.parent;
                            this._index = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) anywheresoftware.b4a.keywords.Common.Sender(cassandraRisto.ital.fatturafm.mostCurrent.activityBA)));
                            this._pnl = new anywheresoftware.b4a.objects.PanelWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar6 = this.parent;
                            this._pnl = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._getpanel(this._index);
                            this._lcurs = new anywheresoftware.b4a.objects.LabelWrapper();
                            this._lcurs = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView) this._pnl.GetView(6).getObject());
                            cassandraRisto.ital.fatturafm fatturafmVar7 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setPosition((int) java.lang.Double.parseDouble(this._lcurs.getText()));
                            this._txt = "";
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Confermi l'emissione della fattura per  ");
                            cassandraRisto.ital.fatturafm fatturafmVar8 = this.parent;
                            this._txt = append.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("descrizione"))).append(" ?").toString();
                            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(this._txt);
                            cassandraRisto.ital.fatturafm fatturafmVar9 = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.fatturafm fatturafmVar10 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.Msgbox2Async(ObjectToCharSequence, ObjectToCharSequence2, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, cassandraRisto.ital.fatturafm.processBA, false);
                            anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", cassandraRisto.ital.fatturafm.processBA, this, null);
                            this.state = 46;
                            return;
                        case 10:
                            this.state = 13;
                            int i = this._resultmsg;
                            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                            if (i != -2) {
                                break;
                            } else {
                                this.state = 12;
                                break;
                            }
                        case 12:
                            this.state = 13;
                            cassandraRisto.ital.fatturafm fatturafmVar11 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                            cassandraRisto.ital.fatturafm fatturafmVar12 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                            return;
                        case 13:
                            this.state = 14;
                            cassandraRisto.ital.fatturafm fatturafmVar13 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("select valore from progressivi where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar14 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar15 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._nf = (int) java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append2.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
                            cassandraRisto.ital.fatturafm fatturafmVar16 = this.parent;
                            this._codcliente = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli");
                            break;
                        case 14:
                            this.state = 17;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(this._index))) {
                                break;
                            } else {
                                this.state = 16;
                                break;
                            }
                        case 16:
                            this.state = 17;
                            cassandraRisto.ital.fatturafm fatturafmVar17 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                            return;
                        case 17:
                            this.state = 42;
                            cassandraRisto.ital.fatturafm fatturafmVar18 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                this.state = 19;
                                break;
                            }
                        case 19:
                            this.state = 20;
                            cassandraRisto.ital.fatturafm fatturafmVar19 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
                            break;
                        case 20:
                            this.state = 29;
                            this.state = 22;
                            break;
                        case 22:
                            this.state = 23;
                            this._rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            java.lang.String str = this._codcliente;
                            int i2 = this._nf;
                            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(" where  FattFM=1 and  headmov.cliente = '");
                            cassandraRisto.ital.fatturafm fatturafmVar20 = this.parent;
                            java.lang.StringBuilder append4 = append3.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli").trim()).append("' and ");
                            cassandraRisto.ital.fatturafm fatturafmVar21 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar22 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._rs = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(str, false, i2, false, "", append4.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).toString());
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.fatturafm.processBA, this, this._rs);
                            this.state = 47;
                            return;
                        case 23:
                            this.state = 28;
                            cassandraRisto.ital.fatturafm fatturafmVar23 = this.parent;
                            if (cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 && this._result.IsInitialized()) {
                                this.state = 25;
                                break;
                            } else {
                                this.state = 27;
                                break;
                            }
                        case 25:
                            this.state = 28;
                            cassandraRisto.ital.fatturafm fatturafmVar24 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = this._result;
                            break;
                        case 27:
                            this.state = 28;
                            this.state = 29;
                            break;
                        case 28:
                            this.state = 20;
                            break;
                        case 29:
                            this.state = 38;
                            if (anywheresoftware.b4a.keywords.Common.Not(this._result.IsInitialized())) {
                                this.state = 31;
                                break;
                            } else {
                                this.state = 33;
                                break;
                            }
                        case 31:
                            this.state = 38;
                            cassandraRisto.ital.fatturafm fatturafmVar25 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                            return;
                        case 33:
                            this.state = 34;
                            cassandraRisto.ital.fatturafm fatturafmVar26 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = this._result;
                            break;
                        case 34:
                            this.state = 37;
                            cassandraRisto.ital.fatturafm fatturafmVar27 = this.parent;
                            if (!cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                break;
                            } else {
                                cassandraRisto.ital.fatturafm fatturafmVar28 = this.parent;
                                if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getSize() != 0) {
                                    break;
                                } else {
                                    this.state = 36;
                                    break;
                                }
                            }
                        case 36:
                            this.state = 37;
                            cassandraRisto.ital.fatturafm fatturafmVar29 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) anywheresoftware.b4a.keywords.Common.Null);
                            break;
                        case 37:
                            this.state = 38;
                            break;
                        case 38:
                            this.state = 41;
                            cassandraRisto.ital.fatturafm fatturafmVar30 = this.parent;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized())) {
                                break;
                            } else {
                                this.state = 40;
                                break;
                            }
                        case 40:
                            this.state = 41;
                            cassandraRisto.ital.fatturafm fatturafmVar31 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                            return;
                        case 41:
                            this.state = 42;
                            break;
                        case 42:
                            this.state = 45;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(false, cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(false));
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(this._nf, this._codcliente, false);
                            cassandraRisto.ital.fatturafm fatturafmVar32 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                            break;
                        case 44:
                            this.state = 45;
                            this.catchState = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar33 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.fatturafm.mostCurrent.activityBA).getMessage());
                            break;
                        case 45:
                            this.state = -1;
                            this.catchState = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar34 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
                            break;
                        case 46:
                            this.state = 10;
                            this._resultmsg = ((java.lang.Integer) objArr[0]).intValue();
                            break;
                        case 47:
                            this.state = 23;
                            this._result = (anywheresoftware.b4a.objects.collections.Map) objArr[0];
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.fatturafm.processBA.setLastException(e);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String _buttonfun3_click() throws java.lang.Exception {
        int Msgbox2;
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) {
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "  Sub buttonFun3_Click";
        try {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
            int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
            new anywheresoftware.b4a.objects.PanelWrapper();
            anywheresoftware.b4a.objects.PanelWrapper _getpanel = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._getpanel(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
            new anywheresoftware.b4a.objects.LabelWrapper();
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setPosition((int) java.lang.Double.parseDouble(((anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView) _getpanel.GetView(6).getObject())).getText()));
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Confermi la gestione dei movimenti per il cliente " + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("descrizione")) + " ?");
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        if (Msgbox2 == -2) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            return "";
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("select headmov.nmov,substr(cast(headmov.datam3 as nvarchar),9,2) ||'/'|| substr(cast(headmov.datam3 as nvarchar),6,2) ||'/'|| substr(cast(headmov.datam3 as nvarchar),1,4)|| substr(cast(headmov.datam3 as nvarchar),11,9) as datatmp,totale,FattFM\n\t\tfrom headmov inner join CausaliPagamenti on  CausaliPagamenti.nmov= headmov.nmov\n\t\twhere (");
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append(") And ");
        cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
        java.lang.String sb = append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.replace("headmov.cliente<>''", "headmov.cliente='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'"))).append("").toString();
        cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        fatturafmVar3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery(sb));
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
        if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getRowCount() > 0) {
            int rowCount = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getRowCount() - 1;
            for (int i = 0; i <= rowCount; i++) {
                mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setPosition(i);
                java.lang.String str = "Mov.N." + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetString("nmov") + " del " + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetString("datatmp");
                mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.BA.NumberToString(i), str, anywheresoftware.b4a.keywords.Common.DipToCurrent(50), false, mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, false), anywheresoftware.b4a.keywords.Common.DipToCurrent(50), str);
            }
            mostCurrent._lblinfo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Movimenti per " + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("descrizione"))));
            mostCurrent._pnllist.setVisible(true);
        }
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select nmov,substr(cast(datam3 as nvarchar),9,2) ||'/'|| substr(cast(datam3 as nvarchar),6,2) ||'/'|| substr(cast(datam3 as nvarchar),1,4)|| substr(cast(datam3 as nvarchar),11,9) as datatmp,totale,'1' as FattFM from  headmov where  (nscontrinoffm >0 or  RicDaFatt=1) and cliente ='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'"));
        if (cursorWrapper3.getRowCount() > 0) {
            int rowCount2 = cursorWrapper3.getRowCount() - 1;
            for (int i2 = 0; i2 <= rowCount2; i2++) {
                cursorWrapper3.setPosition(i2);
                java.lang.String str2 = "Mov.N." + cursorWrapper3.GetString("nmov") + " del " + cursorWrapper3.GetString("datatmp");
                mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.BA.NumberToString(i2), str2, anywheresoftware.b4a.keywords.Common.DipToCurrent(50), true, cursorWrapper3, true), anywheresoftware.b4a.keywords.Common.DipToCurrent(50), str2);
            }
            mostCurrent._lblinfo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Movimenti per " + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("descrizione"))));
            mostCurrent._pnllist.setVisible(true);
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = cursorWrapper3.getRowCount();
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf A[Catch: Exception -> 0x02dc, TryCatch #0 {Exception -> 0x02dc, blocks: (B:3:0x0008, B:5:0x0048, B:6:0x008d, B:8:0x009c, B:10:0x00a5, B:13:0x00b6, B:17:0x00bf, B:20:0x00fd, B:22:0x0103, B:23:0x014c, B:25:0x0167, B:28:0x0172, B:32:0x0280, B:34:0x028d, B:36:0x0296, B:38:0x02aa, B:40:0x02b8, B:41:0x02bd, B:52:0x02c5, B:43:0x02cc, B:62:0x0232, B:65:0x017f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0103 A[Catch: Exception -> 0x02dc, TryCatch #0 {Exception -> 0x02dc, blocks: (B:3:0x0008, B:5:0x0048, B:6:0x008d, B:8:0x009c, B:10:0x00a5, B:13:0x00b6, B:17:0x00bf, B:20:0x00fd, B:22:0x0103, B:23:0x014c, B:25:0x0167, B:28:0x0172, B:32:0x0280, B:34:0x028d, B:36:0x0296, B:38:0x02aa, B:40:0x02b8, B:41:0x02bd, B:52:0x02c5, B:43:0x02cc, B:62:0x0232, B:65:0x017f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0167 A[Catch: Exception -> 0x02dc, TryCatch #0 {Exception -> 0x02dc, blocks: (B:3:0x0008, B:5:0x0048, B:6:0x008d, B:8:0x009c, B:10:0x00a5, B:13:0x00b6, B:17:0x00bf, B:20:0x00fd, B:22:0x0103, B:23:0x014c, B:25:0x0167, B:28:0x0172, B:32:0x0280, B:34:0x028d, B:36:0x0296, B:38:0x02aa, B:40:0x02b8, B:41:0x02bd, B:52:0x02c5, B:43:0x02cc, B:62:0x0232, B:65:0x017f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0232 A[Catch: Exception -> 0x02dc, TryCatch #0 {Exception -> 0x02dc, blocks: (B:3:0x0008, B:5:0x0048, B:6:0x008d, B:8:0x009c, B:10:0x00a5, B:13:0x00b6, B:17:0x00bf, B:20:0x00fd, B:22:0x0103, B:23:0x014c, B:25:0x0167, B:28:0x0172, B:32:0x0280, B:34:0x028d, B:36:0x0296, B:38:0x02aa, B:40:0x02b8, B:41:0x02bd, B:52:0x02c5, B:43:0x02cc, B:62:0x0232, B:65:0x017f), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(boolean z) throws java.lang.Exception {
        int i;
        int parseDouble;
        java.lang.String str;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        boolean z2;
        java.lang.String str2;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2;
        try {
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._datafattura.getTag());
            i = 1;
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("select valore from progressivi where codice ='");
            cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
            parseDouble = (int) java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
            if (z) {
                cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
                java.lang.String str3 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
                parseDouble = (int) java.lang.Double.parseDouble(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Select * from clienti where codice ='");
                cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, sql2.ExecQuery(append2.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
                cursorWrapper4.setPosition(0);
                str = str3;
                cursorWrapper = cursorWrapper4;
            } else {
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper6 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clienti where codice ='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'"));
                cursorWrapper6.setPosition(0);
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("update headmov set nfat_fm = ").append(anywheresoftware.b4a.BA.NumberToString(parseDouble)).append(",sezionale='");
                cassandraRisto.ital.fatturafm fatturafmVar5 = mostCurrent;
                java.lang.StringBuilder append4 = append3.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).append("',datfat_fm = '").append(ObjectToString).append("' where (select count(*) from CausaliPagamenti where CausaliPagamenti.nmov= headmov.nmov And (");
                cassandraRisto.ital.fatturafm fatturafmVar6 = mostCurrent;
                java.lang.StringBuilder append5 = append4.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("))>0 And  FattFM=1 And  cliente = '").append(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli").trim()).append("' and ");
                cassandraRisto.ital.fatturafm fatturafmVar7 = mostCurrent;
                sql3.ExecNonQuery(append5.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).toString());
                str = ObjectToString;
                cursorWrapper = cursorWrapper6;
            }
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        if (cassandraRisto.ital.main._v_fatturafmt2) {
            if (anywheresoftware.b4a.keywords.Common.Not(cursorWrapper.GetInt("abpost") == 1 && cursorWrapper.GetDouble("fido").doubleValue() > 0.0d)) {
                z2 = true;
                if (z2) {
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper.GetString("codice").trim()) + "' and fido >0")) > 0.0d) {
                        z2 = false;
                    }
                }
                if (!anywheresoftware.b4a.keywords.Common.Not(z2)) {
                    java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (");
                    cassandraRisto.ital.fatturafm fatturafmVar8 = mostCurrent;
                    str2 = append6.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,headmov.memo as clides,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='").append(cursorWrapper.GetString("codice").trim()).append("' and nfat_fm =").append(anywheresoftware.b4a.BA.NumberToString(parseDouble)).append(" and datfat_fm = '").append(str).append("' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm").toString();
                } else {
                    str2 = "Select sum(importo) as tot, headmov.nric as Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva,headmov.memo as clides from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + cursorWrapper.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(parseDouble) + " and datfat_fm = '" + str + "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap,venduto.iva  order by dataeoraffm";
                }
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper7 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper7, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery(str2));
                if (cursorWrapper2.getRowCount() > 0) {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Clear();
                    boolean z3 = false;
                    for (int i2 = 0; i2 <= 30; i2++) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Add(0);
                    }
                    int i3 = 0;
                    double d = 0.0d;
                    while (!z3) {
                        int i4 = 100;
                        if (i3 - 1 >= cursorWrapper2.getRowCount() - 1) {
                            return i;
                        }
                        int rowCount = cursorWrapper2.getRowCount() - 1;
                        int i5 = i3;
                        while (true) {
                            if (i5 <= rowCount) {
                                cursorWrapper2.setPosition(i5);
                                if (cursorWrapper2.GetDouble("tot").doubleValue() != 0.0d && cursorWrapper2.GetString("clides").contains("Tess.")) {
                                    i4 += 7;
                                    d += 0.5d;
                                }
                                i4 += 15;
                                if (d >= 28.0d) {
                                    i++;
                                    i3 = i5 + 1;
                                    d = 0.0d;
                                    break;
                                }
                                if (i5 == cursorWrapper2.getRowCount() - 1) {
                                    z3 = true;
                                    break;
                                }
                                d += 1.0d;
                                i5++;
                            }
                        }
                    }
                    return i;
                }
                return 0;
            }
        }
        z2 = false;
        if (z2) {
        }
        if (!anywheresoftware.b4a.keywords.Common.Not(z2)) {
        }
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper72 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar72 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper72, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery(str2));
        if (cursorWrapper2.getRowCount() > 0) {
        }
        return 0;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.collections.List().Initialize();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
        int size = ListFiles.getSize() - 1;
        for (int i = 0; i <= size; i++) {
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
            if (ObjectToString.toLowerCase().startsWith("dacasse") && ObjectToString.toLowerCase().endsWith(".tmp")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
                anywheresoftware.b4a.objects.streams.File.Delete(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6, ObjectToString);
            }
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper) throws java.lang.Exception {
        if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("ImportoBollo", "").equals("") && mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CIG", "").equals("") && mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CUP", "").equals("") && mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("IDOrdAcq", "").equals("")) {
            return "";
        }
        if (stringBuilderWrapper.IsInitialized()) {
            stringBuilderWrapper.Append("-- DATI AGGIUNTIVI -----------------------\n");
            if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CIG", "").equals("")) {
                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("Codice CIG ").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CIG", ""))).append("");
                cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                stringBuilderWrapper.Append(cassandraRisto.ital.modfunstr._left(ba, append.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 42)).toString(), 42L)).Append("\n");
            }
            if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CUP", "").equals("")) {
                cassandraRisto.ital.modfunstr modfunstrVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
                java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Codice CUP ").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CUP", ""))).append("");
                cassandraRisto.ital.modfunstr modfunstrVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                stringBuilderWrapper.Append(cassandraRisto.ital.modfunstr._left(ba2, append2.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 42)).toString(), 42L)).Append("\n");
            }
            if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("IDOrdAcq", "").equals("")) {
                cassandraRisto.ital.modfunstr modfunstrVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA ba3 = mostCurrent.activityBA;
                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("Ordine Acq. ").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("IDOrdAcq", ""))).append("");
                cassandraRisto.ital.modfunstr modfunstrVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                stringBuilderWrapper.Append(cassandraRisto.ital.modfunstr._left(ba3, append3.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 42)).toString(), 42L)).Append("\n");
            }
            if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("ImportoBollo", "").equals("") && anywheresoftware.b4a.keywords.Common.IsNumber(anywheresoftware.b4a.BA.ObjectToString(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("ImportoBollo", "")))) {
                double ObjectToNumber = anywheresoftware.b4a.BA.ObjectToNumber(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("ImportoBollo", "0"));
                cassandraRisto.ital.modfunstr modfunstrVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                anywheresoftware.b4a.BA ba4 = mostCurrent.activityBA;
                java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Importo Bollo ").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(ObjectToNumber, 1, 2, 2, false))).append("");
                cassandraRisto.ital.modfunstr modfunstrVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                stringBuilderWrapper.Append(cassandraRisto.ital.modfunstr._left(ba4, append4.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 42)).toString(), 42L)).Append("\n");
            }
        } else {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("-- DATI AGGIUNTIVI ---------------------------------", 4);
            if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CIG", "").equals("")) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Codice CIG " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CIG", "")) + "", 1);
            }
            if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CUP", "").equals("")) {
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Codice CUP " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("CUP", "")) + "", 1);
            }
            if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("IDOrdAcq", "").equals("")) {
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Ordine Acq. " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("IDOrdAcq", "")) + "", 1);
            }
            if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("ImportoBollo", "").equals("") && anywheresoftware.b4a.keywords.Common.IsNumber(anywheresoftware.b4a.BA.ObjectToString(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("ImportoBollo", "")))) {
                double ObjectToNumber2 = anywheresoftware.b4a.BA.ObjectToNumber(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("ImportoBollo", "0"));
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Importo Bollo " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(ObjectToNumber2, 1, 2, 2, false)) + "", 1);
            }
        }
        return "";
    }

    public static java.lang.String _chiudi_click() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_attivaterminale) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
        }
        mostCurrent._activity.Finish();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "Main");
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.PanelWrapper();
        new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() - 1) - _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        for (int i = 0; i <= _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5; i++) {
            anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._getpanel(i).GetView(0).getObject());
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setPosition(i);
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("update headmov set FattFM= " + anywheresoftware.b4a.BA.ObjectToString(checkBoxWrapper.getChecked() ? "1" : "0") + " where nmov = " + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetString("nmov"));
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.collections.List().Initialize();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        anywheresoftware.b4a.objects.collections.List ListFiles = anywheresoftware.b4a.objects.streams.File.ListFiles(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
        int size = ListFiles.getSize() - 1;
        for (int i = 0; i <= size; i++) {
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(ListFiles.Get(i));
            if (ObjectToString.toLowerCase().startsWith("dacasse") && ObjectToString.toLowerCase().endsWith(".tmp")) {
                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
                java.lang.String str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.objects.streams.File.Copy(str, ObjectToString, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2, ObjectToString);
                anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
                anywheresoftware.b4a.objects.streams.File.Delete(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6, ObjectToString);
            }
        }
        if (ListFiles.getSize() > 0) {
            anywheresoftware.b4a.BA ba = processBA;
            cassandraRisto.ital.ftpmanager ftpmanagerVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.CallSubNew(ba, cassandraRisto.ital.ftpmanager.getObject(), "tUpload");
            return "";
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str, boolean z) throws java.lang.Exception {
        if (!anywheresoftware.b4a.keywords.Common.Not(z)) {
            return "";
        }
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_attivafe) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("DROP TABLE IF EXISTS TEMP.TmpFattFM");
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("CREATE TEMP TABLE TmpFattFM AS  Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (");
            cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
            sql.ExecNonQuery(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append("))\n\t\tAs importo,'msg' as codint\n\t\t, headmov.nric as nric ,nscontrinoffm as nscontrinoffm,nChiusura as nChiusura,headmov.dataeoraffm as dataeoraffm,headmov.datam as datam,headmov.datam3 as datam3,\n\t\tmatricolacassap,1 as qta, iva,'' as memo,0 as aliquota2,0 as scov,0 as brep from venduto inner join headmov on venduto.nmov = headmov.nmov ").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str)).append("").toString());
            return "";
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0191 A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x001e, B:5:0x004b, B:7:0x0055, B:10:0x0076, B:13:0x00b5, B:15:0x0191, B:17:0x01c8, B:19:0x0201, B:20:0x0229, B:22:0x0261, B:23:0x0267, B:25:0x026f, B:27:0x0274, B:29:0x028c, B:30:0x0296, B:32:0x02cc, B:33:0x02ea, B:37:0x0415, B:39:0x005d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02cc A[Catch: Exception -> 0x0420, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x001e, B:5:0x004b, B:7:0x0055, B:10:0x0076, B:13:0x00b5, B:15:0x0191, B:17:0x01c8, B:19:0x0201, B:20:0x0229, B:22:0x0261, B:23:0x0267, B:25:0x026f, B:27:0x0274, B:29:0x028c, B:30:0x0296, B:32:0x02cc, B:33:0x02ea, B:37:0x0415, B:39:0x005d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0415 A[Catch: Exception -> 0x0420, TRY_LEAVE, TryCatch #0 {Exception -> 0x0420, blocks: (B:3:0x001e, B:5:0x004b, B:7:0x0055, B:10:0x0076, B:13:0x00b5, B:15:0x0191, B:17:0x01c8, B:19:0x0201, B:20:0x0229, B:22:0x0261, B:23:0x0267, B:25:0x026f, B:27:0x0274, B:29:0x028c, B:30:0x0296, B:32:0x02cc, B:33:0x02ea, B:37:0x0415, B:39:0x005d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(int i, java.lang.String str, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper;
        boolean z;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel";
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(mostCurrent.activityBA, "");
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        panelWrapper.setColor(-1);
        try {
            imageViewWrapper = new anywheresoftware.b4a.objects.ImageViewWrapper();
            imageViewWrapper.Initialize(mostCurrent.activityBA, "buttonFun");
            anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
            imageViewWrapper.setBitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "m_stampe.png").getObject());
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_stampafattura != 100) {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_stampafattura >= 19) {
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
            }
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue() != -9.9999999E7d) {
            z = true;
            imageViewWrapper.setVisible(z);
            anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
            imageViewWrapper2.Initialize(mostCurrent.activityBA, "buttonFun2");
            anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
            imageViewWrapper2.setBitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "pdfgrey.png").getObject());
            imageViewWrapper2.setVisible(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue() == -9.9999999E7d);
            imageViewWrapper2.setTag(0);
            anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper3 = new anywheresoftware.b4a.objects.ImageViewWrapper();
            imageViewWrapper3.Initialize(mostCurrent.activityBA, "buttonFun3");
            anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
            imageViewWrapper3.setBitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "fun_modifica veloce.png").getObject());
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper.Initialize(mostCurrent.activityBA, "");
            anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
            labelWrapper.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 3));
            labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli")));
            labelWrapper.setTextSize(16.0f);
            anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper.setTextColor(-16777216);
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
            labelWrapper.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper2.Initialize(mostCurrent.activityBA, "");
            anywheresoftware.b4a.keywords.Bit bit2 = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
            labelWrapper2.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 3));
            labelWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str)));
            labelWrapper2.setTextSize(16.0f);
            anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper2.setTextColor(-16777216);
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from clienti where codice='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'")) > 0.0d) {
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from gruppocli inner join clienti on gruppocli.codice-1= clienti.grpcli where clienti.codice='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'")) > 0.0d) {
                    cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    java.lang.String ExecQuerySingleResult = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select gruppocli.descrizione from gruppocli inner join clienti on gruppocli.codice-1= clienti.grpcli where clienti.codice='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'");
                    if (anywheresoftware.b4a.keywords.Common.Not(ExecQuerySingleResult.startsWith("Gruppo"))) {
                        labelWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(labelWrapper2.getText() + " (" + ExecQuerySingleResult + ")"));
                    }
                }
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select abpost from clienti where codice='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'").equals(anywheresoftware.b4a.BA.NumberToString(0))) {
                    labelWrapper2.setTextColor(-14338583);
                }
            }
            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_lastdatadocfm && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 == -1 && mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue() != -9.9999999E7d) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = i;
                anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
                panelWrapper.setColor(-16711936);
            }
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper3 = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper3.Initialize(mostCurrent.activityBA, "");
            anywheresoftware.b4a.keywords.Bit bit3 = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity5 = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity6 = anywheresoftware.b4a.keywords.Common.Gravity;
            labelWrapper3.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 1));
            if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue() == -9.9999999E7d) {
                labelWrapper3.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue(), 1, 2, 2, false)));
            } else {
                labelWrapper3.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("0.00"));
            }
            anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper3.setTextColor(-16777216);
            labelWrapper3.setTextSize(16.0f);
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper4 = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper4.Initialize(mostCurrent.activityBA, "");
            labelWrapper4.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(java.lang.Integer.valueOf(i)));
            labelWrapper4.setVisible(false);
            panelWrapper.AddView((android.view.View) labelWrapper.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(2.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(12.0f, mostCurrent.activityBA), i2);
            panelWrapper.AddView((android.view.View) labelWrapper2.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(14.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(36.0f, mostCurrent.activityBA), i2);
            panelWrapper.AddView((android.view.View) labelWrapper3.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(50.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(14.0f, mostCurrent.activityBA), i2);
            panelWrapper.AddView((android.view.View) imageViewWrapper.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(64.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(12.0f, mostCurrent.activityBA), i2);
            panelWrapper.AddView((android.view.View) imageViewWrapper2.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(76.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(12.0f, mostCurrent.activityBA), i2);
            panelWrapper.AddView((android.view.View) imageViewWrapper3.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(88.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(12.0f, mostCurrent.activityBA), i2);
            panelWrapper.AddView((android.view.View) labelWrapper4.getObject(), anywheresoftware.b4a.keywords.Common.DipToCurrent(330), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.DipToCurrent(10), i2);
            return panelWrapper;
        }
        z = false;
        imageViewWrapper.setVisible(z);
        anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper22 = new anywheresoftware.b4a.objects.ImageViewWrapper();
        imageViewWrapper22.Initialize(mostCurrent.activityBA, "buttonFun2");
        anywheresoftware.b4a.objects.streams.File file22 = anywheresoftware.b4a.keywords.Common.File;
        imageViewWrapper22.setBitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "pdfgrey.png").getObject());
        imageViewWrapper22.setVisible(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue() == -9.9999999E7d);
        imageViewWrapper22.setTag(0);
        anywheresoftware.b4a.objects.ImageViewWrapper imageViewWrapper32 = new anywheresoftware.b4a.objects.ImageViewWrapper();
        imageViewWrapper32.Initialize(mostCurrent.activityBA, "buttonFun3");
        anywheresoftware.b4a.objects.streams.File file32 = anywheresoftware.b4a.keywords.Common.File;
        imageViewWrapper32.setBitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "fun_modifica veloce.png").getObject());
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper5 = new anywheresoftware.b4a.objects.LabelWrapper();
        labelWrapper5.Initialize(mostCurrent.activityBA, "");
        anywheresoftware.b4a.keywords.Bit bit4 = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.constants.Gravity gravity7 = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.constants.Gravity gravity22 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper5.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 3));
        labelWrapper5.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli")));
        labelWrapper5.setTextSize(16.0f);
        anywheresoftware.b4a.keywords.constants.Colors colors22 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper5.setTextColor(-16777216);
        anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper2 = anywheresoftware.b4a.keywords.Common.Typeface;
        labelWrapper5.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper22 = new anywheresoftware.b4a.objects.LabelWrapper();
        labelWrapper22.Initialize(mostCurrent.activityBA, "");
        anywheresoftware.b4a.keywords.Bit bit22 = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.constants.Gravity gravity32 = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.constants.Gravity gravity42 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper22.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 3));
        labelWrapper22.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(str)));
        labelWrapper22.setTextSize(16.0f);
        anywheresoftware.b4a.keywords.constants.Colors colors32 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper22.setTextColor(-16777216);
        cassandraRisto.ital.main mainVar42 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from clienti where codice='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'")) > 0.0d) {
        }
        cassandraRisto.ital.main mainVar82 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_lastdatadocfm) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = i;
            anywheresoftware.b4a.keywords.constants.Colors colors42 = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper.setColor(-16711936);
        }
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper32 = new anywheresoftware.b4a.objects.LabelWrapper();
        labelWrapper32.Initialize(mostCurrent.activityBA, "");
        anywheresoftware.b4a.keywords.Bit bit32 = anywheresoftware.b4a.keywords.Common.Bit;
        anywheresoftware.b4a.keywords.constants.Gravity gravity52 = anywheresoftware.b4a.keywords.Common.Gravity;
        anywheresoftware.b4a.keywords.constants.Gravity gravity62 = anywheresoftware.b4a.keywords.Common.Gravity;
        labelWrapper32.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 1));
        if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue() == -9.9999999E7d) {
        }
        anywheresoftware.b4a.keywords.constants.Colors colors52 = anywheresoftware.b4a.keywords.Common.Colors;
        labelWrapper32.setTextColor(-16777216);
        labelWrapper32.setTextSize(16.0f);
        anywheresoftware.b4a.objects.LabelWrapper labelWrapper42 = new anywheresoftware.b4a.objects.LabelWrapper();
        labelWrapper42.Initialize(mostCurrent.activityBA, "");
        labelWrapper42.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(java.lang.Integer.valueOf(i)));
        labelWrapper42.setVisible(false);
        panelWrapper.AddView((android.view.View) labelWrapper5.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(2.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(12.0f, mostCurrent.activityBA), i2);
        panelWrapper.AddView((android.view.View) labelWrapper22.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(14.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(36.0f, mostCurrent.activityBA), i2);
        panelWrapper.AddView((android.view.View) labelWrapper32.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(50.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(14.0f, mostCurrent.activityBA), i2);
        panelWrapper.AddView((android.view.View) imageViewWrapper.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(64.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(12.0f, mostCurrent.activityBA), i2);
        panelWrapper.AddView((android.view.View) imageViewWrapper22.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(76.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(12.0f, mostCurrent.activityBA), i2);
        panelWrapper.AddView((android.view.View) imageViewWrapper32.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(88.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(12.0f, mostCurrent.activityBA), i2);
        panelWrapper.AddView((android.view.View) labelWrapper42.getObject(), anywheresoftware.b4a.keywords.Common.DipToCurrent(330), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.DipToCurrent(10), i2);
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(java.lang.String str, java.lang.String str2, int i, boolean z, anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper, boolean z2) throws java.lang.Exception {
        int i2;
        double parseDouble;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel";
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(mostCurrent.activityBA, "");
        try {
            if (z) {
                anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                i2 = -7829368;
            } else {
                anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                i2 = -1;
            }
            int ObjectToNumber = (int) anywheresoftware.b4a.BA.ObjectToNumber(i2);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
            anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv3(ba, ObjectToNumber, anywheresoftware.b4a.keywords.constants.Colors.RGB(222, 222, 222)).getObject());
            anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
            checkBoxWrapper.Initialize(mostCurrent.activityBA, "");
            anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
            checkBoxWrapper.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 3));
            checkBoxWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str2));
            anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
            checkBoxWrapper.setTextColor(-16777216);
            checkBoxWrapper.setTextSize(16.0f);
            checkBoxWrapper.setChecked(cursorWrapper.GetInt("FattFM") == 1);
            checkBoxWrapper.setEnabled(anywheresoftware.b4a.keywords.Common.Not(z));
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper.Initialize(mostCurrent.activityBA, "ViewArt");
            anywheresoftware.b4a.keywords.Bit bit2 = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
            labelWrapper.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 1));
            labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Importo: " + anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble("totale").doubleValue(), 1, 2, 2, false)));
            try {
                if (z2) {
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    parseDouble = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) End\n\t\t\t\t\t\t\t\t\t\t\t\tfrom CausaliPagamenti inner join pagamenti on pagamenti.codice=CausaliPagamenti.codice\n\t\t\t\t\t\t\t\t\t\t\t\t where CausaliPagamenti.nmov=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper.GetString("nmov")) + " and\n\t\t\t\t\t\t\t\t\t\t\t\t(CausaliPagamenti.codice=2 or pagamenti.cassa=1)"));
                } else {
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    java.lang.StringBuilder append = new java.lang.StringBuilder().append("Select case when sum(importo) is null then 0 else sum(importo) End\n\t\t\t\t\t\t\t\t\t\t\t\tfrom CausaliPagamenti where CausaliPagamenti.nmov=").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper.GetString("nmov"))).append(" and\n\t\t\t\t\t\t\t\t\t\t\t\t(");
                    cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
                    parseDouble = java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append(")").toString()));
                }
                if (parseDouble > 0.0d && parseDouble != cursorWrapper.GetDouble("totale").doubleValue()) {
                    labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(labelWrapper.getText() + "\n(a Credito " + anywheresoftware.b4a.keywords.Common.NumberFormat2(parseDouble, 1, 2, 2, false) + ")"));
                }
            } catch (java.lang.Exception e) {
                processBA.setLastException(e);
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
            }
            labelWrapper.setTextColor(ObjectToNumber);
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
            anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba2, -16711936, 25).getObject());
            labelWrapper.setTextSize(16.0f);
            labelWrapper.setTag(str);
            labelWrapper.setEnabled(anywheresoftware.b4a.keywords.Common.Not(z));
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba3 = mostCurrent.activityBA;
            anywheresoftware.b4a.keywords.constants.Colors colors6 = anywheresoftware.b4a.keywords.Common.Colors;
            checkBoxWrapper.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv3(ba3, ObjectToNumber, anywheresoftware.b4a.keywords.constants.Colors.RGB(222, 222, 222)).getObject());
            checkBoxWrapper.setTag(str);
            panelWrapper.AddView((android.view.View) checkBoxWrapper.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(2.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(60.0f, mostCurrent.activityBA), i);
            panelWrapper.AddView((android.view.View) labelWrapper.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(62.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(20.0f, mostCurrent.activityBA), i);
        } catch (java.lang.Exception e2) {
            processBA.setLastException(e2);
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        return panelWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(java.lang.String str, int i) throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel";
        anywheresoftware.b4a.objects.PanelWrapper panelWrapper = new anywheresoftware.b4a.objects.PanelWrapper();
        panelWrapper.Initialize(mostCurrent.activityBA, "");
        try {
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
            panelWrapper.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba, -16776961, 0).getObject());
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper.Initialize(mostCurrent.activityBA, "");
            anywheresoftware.b4a.keywords.Bit bit = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity2 = anywheresoftware.b4a.keywords.Common.Gravity;
            labelWrapper.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 3));
            labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("datam").substring(3, 5) + "/" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("datam").substring(0, 2) + "/" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("datam").substring(6, 10)));
            labelWrapper.setTextSize(16.0f);
            anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper.setTextColor(-1);
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
            labelWrapper.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
            anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba2, -16776961, 25).getObject());
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper2 = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper2.Initialize(mostCurrent.activityBA, "");
            anywheresoftware.b4a.keywords.Bit bit2 = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity3 = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity4 = anywheresoftware.b4a.keywords.Common.Gravity;
            labelWrapper2.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 1));
            labelWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetDouble("totale").doubleValue(), 1, 2, 2, false)));
            labelWrapper2.setTextSize(16.0f);
            anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper2.setTextColor(-1);
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper2 = anywheresoftware.b4a.keywords.Common.Typeface;
            labelWrapper2.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba3 = mostCurrent.activityBA;
            anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper2.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba3, -16776961, 25).getObject());
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper3 = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper3.Initialize(mostCurrent.activityBA, "");
            anywheresoftware.b4a.keywords.Bit bit3 = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity5 = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity6 = anywheresoftware.b4a.keywords.Common.Gravity;
            labelWrapper3.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 1));
            labelWrapper3.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("clides"))));
            labelWrapper3.setTextSize(16.0f);
            anywheresoftware.b4a.keywords.constants.Colors colors6 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper3.setTextColor(-1);
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper3 = anywheresoftware.b4a.keywords.Common.Typeface;
            labelWrapper3.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
            cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba4 = mostCurrent.activityBA;
            anywheresoftware.b4a.keywords.constants.Colors colors7 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper3.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba4, -16776961, 25).getObject());
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper4 = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper4.Initialize(mostCurrent.activityBA, "selmovim");
            anywheresoftware.b4a.keywords.Bit bit4 = anywheresoftware.b4a.keywords.Common.Bit;
            anywheresoftware.b4a.keywords.constants.Gravity gravity7 = anywheresoftware.b4a.keywords.Common.Gravity;
            anywheresoftware.b4a.keywords.constants.Gravity gravity8 = anywheresoftware.b4a.keywords.Common.Gravity;
            labelWrapper4.setGravity(anywheresoftware.b4a.keywords.Bit.Or(16, 1));
            labelWrapper4.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Fatt. Numero " + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("nfat")));
            labelWrapper4.setTextSize(16.0f);
            anywheresoftware.b4a.keywords.constants.Colors colors8 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper4.setTextColor(-1);
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper4 = anywheresoftware.b4a.keywords.Common.Typeface;
            labelWrapper4.setTypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.DEFAULT_BOLD);
            cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA ba5 = mostCurrent.activityBA;
            anywheresoftware.b4a.keywords.constants.Colors colors9 = anywheresoftware.b4a.keywords.Common.Colors;
            labelWrapper4.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba5, anywheresoftware.b4a.keywords.constants.Colors.RGB(20, 145, 34), 25).getObject());
            anywheresoftware.b4a.objects.LabelWrapper labelWrapper5 = new anywheresoftware.b4a.objects.LabelWrapper();
            labelWrapper5.Initialize(mostCurrent.activityBA, "");
            labelWrapper5.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str));
            labelWrapper5.setVisible(false);
            panelWrapper.AddView((android.view.View) labelWrapper.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(2.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(20.0f, mostCurrent.activityBA), i);
            panelWrapper.AddView((android.view.View) labelWrapper2.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(22.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(20.0f, mostCurrent.activityBA), i);
            panelWrapper.AddView((android.view.View) labelWrapper3.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(42.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(20.0f, mostCurrent.activityBA), i);
            panelWrapper.AddView((android.view.View) labelWrapper4.getObject(), anywheresoftware.b4a.keywords.Common.PerXToCurrent(62.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.PerXToCurrent(30.0f, mostCurrent.activityBA), i);
            panelWrapper.AddView((android.view.View) labelWrapper5.getObject(), anywheresoftware.b4a.keywords.Common.DipToCurrent(330), anywheresoftware.b4a.keywords.Common.DipToCurrent(2), anywheresoftware.b4a.keywords.Common.DipToCurrent(10), i);
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        return panelWrapper;
    }

    public static java.lang.String _dadata_click() throws java.lang.Exception {
        anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog dateDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._dadata.getTag());
        dateDialog.setYear((int) java.lang.Double.parseDouble(ObjectToString.substring(0, 4)));
        dateDialog.setDayOfMonth((int) java.lang.Double.parseDouble(ObjectToString.substring(9, 11)));
        dateDialog.setMonth((int) java.lang.Double.parseDouble(ObjectToString.substring(5, 7)));
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = dateDialog.Show("Impostare la data di inizio ricerca", "Imposta Filtro Data", "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            mostCurrent._dadata.setTag(anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear()) + "-" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + "-" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + " 00:00:00");
            mostCurrent._dadata.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Dal " + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + "/" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + "/" + anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear())));
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _datafattura_click() throws java.lang.Exception {
        anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog dateDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._datafattura.getTag());
        dateDialog.setYear((int) java.lang.Double.parseDouble(ObjectToString.substring(6, 10)));
        dateDialog.setDayOfMonth((int) java.lang.Double.parseDouble(ObjectToString.substring(3, 5)));
        dateDialog.setMonth((int) java.lang.Double.parseDouble(ObjectToString.substring(0, 2)));
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = dateDialog.Show("Impostare la data di registrazione della fattura", "Data Fattura", "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            mostCurrent._datafattura.setTag(anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + "/" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + "/" + anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear()));
            mostCurrent._datafattura.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Data Fattura " + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + "/" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + "/" + anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear())));
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String _dellist_click() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.PanelWrapper();
        new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() - 1;
        for (int i = 0; i <= _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5; i++) {
            anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper checkBoxWrapper = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._getpanel(i).GetView(0).getObject());
            if (checkBoxWrapper.getChecked()) {
                checkBoxWrapper.setChecked(false);
            }
        }
        return "";
    }

    public static java.lang.String _edtcup_enterpressed() throws java.lang.Exception {
        new anywheresoftware.b4a.objects.EditTextWrapper();
        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA));
        int i = 50;
        boolean z = false;
        if (anywheresoftware.b4a.keywords.Common.IsNumber(anywheresoftware.b4a.BA.ObjectToString(editTextWrapper.getTag()))) {
            cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            i = (int) cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToString(editTextWrapper.getTag()));
        } else if (editTextWrapper.getTag().equals("Mail")) {
            z = true;
        }
        cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.modfunstr._left(mostCurrent.activityBA, editTextWrapper.getText().replace(",", "").replace("'", "").trim(), i)));
        if (z && !editTextWrapper.getText().equals("")) {
            anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
            if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", editTextWrapper.getText()))) {
                anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("L'indirizzo email non è corretto"), true);
                editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA, getObject(), "Hide_Keyboard");
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
                return "";
            }
        }
        return "";
    }

    public static java.lang.String _edtcup_focuschanged(boolean z) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.EditTextWrapper();
        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA));
        int i = 50;
        boolean z2 = false;
        if (anywheresoftware.b4a.keywords.Common.IsNumber(anywheresoftware.b4a.BA.ObjectToString(editTextWrapper.getTag()))) {
            cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            i = (int) cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToString(editTextWrapper.getTag()));
        } else if (editTextWrapper.getTag().equals("Mail")) {
            z2 = true;
        }
        if (z) {
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize("IME");
            editTextWrapper.setSelectionStart(editTextWrapper.getText().length());
        } else {
            cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.modfunstr._left(mostCurrent.activityBA, editTextWrapper.getText().replace(",", "").replace("'", "").trim(), i)));
            if (z2 && !editTextWrapper.getText().equals("")) {
                anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", editTextWrapper.getText().toLowerCase()))) {
                    anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("L'indirizzo email non è corretto"), true);
                    editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                    anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA, getObject(), "Hide_Keyboard");
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
                    return "";
                }
            }
        }
        return "";
    }

    public static java.lang.String _edtcup_textchanged(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        new anywheresoftware.b4a.objects.EditTextWrapper();
        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA));
        int i = 50;
        if (anywheresoftware.b4a.keywords.Common.IsNumber(anywheresoftware.b4a.BA.ObjectToString(editTextWrapper.getTag()))) {
            cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            i = (int) cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToString(editTextWrapper.getTag()));
        }
        if (str2.length() > i) {
            editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str));
            editTextWrapper.setSelectionStart(str.length());
            return "";
        }
        return "";
    }

    public static java.lang.String _edtimportobollo_enterpressed() throws java.lang.Exception {
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.HideKeyboard(mostCurrent.activityBA);
        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper = mostCurrent._edtimportobollo;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(cassandraRisto.ital.mod1._vvvvvvvvvvvvv6(mostCurrent.activityBA, mostCurrent._edtimportobollo.getText()), 1, 2, 2, false)));
        mostCurrent._edtimportobollo.setHint(mostCurrent._edtimportobollo.getText());
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String _edtimportobollo_focuschanged(boolean z) throws java.lang.Exception {
        if (z) {
            mostCurrent._edtimportobollo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize("IME");
            anywheresoftware.b4a.objects.IME ime = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
            android.widget.EditText editText = (android.widget.EditText) mostCurrent._edtimportobollo.getObject();
            anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper = mostCurrent._edtimportobollo;
            ime.SetCustomFilter(editText, 12290, "0123456789.");
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.ShowKeyboard((android.view.View) mostCurrent._edtimportobollo.getObject());
            return "";
        }
        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper2 = mostCurrent._edtimportobollo;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        editTextWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(cassandraRisto.ital.mod1._vvvvvvvvvvvvv6(mostCurrent.activityBA, mostCurrent._edtimportobollo.getText()), 1, 2, 2, false)));
        return "";
    }

    public static java.lang.String _edtimportobollo_textchanged(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (str2.length() > 8) {
            mostCurrent._edtimportobollo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str));
            mostCurrent._edtimportobollo.setSelectionStart(str.length());
            return "";
        }
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

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.collections.Map map) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int parseDouble = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select valore from progressivi where codice = 'SEND'"));
        stringBuilderWrapper.Append("ve\t");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        stringBuilderWrapper.Append(sb.append(cassandraRisto.ital.main._v_recordver).append("\n").toString());
        stringBuilderWrapper.Append("nu\t");
        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.NumberToString(parseDouble) + "\n");
        java.lang.String str = anywheresoftware.b4a.BA.ObjectToString(map.Get("numero")) + "_" + anywheresoftware.b4a.BA.ObjectToString(map.Get("dataFatt")) + "_" + anywheresoftware.b4a.BA.ObjectToString(map.Get("negozio")) + "_" + anywheresoftware.b4a.BA.ObjectToString(map.Get("cassa"));
        stringBuilderWrapper.Append("FattFM\t");
        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.Get("cliente")) + "\t");
        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.Get("totale")) + "\t");
        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.Get("datam")) + "\t");
        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.Get("numero")) + "\t");
        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.Get("dataFatt")) + "\t");
        stringBuilderWrapper.Append(str + "\t");
        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.Get("negozio")) + "\t");
        stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.Get("cassa")) + "\n");
        for (int i = 0; i <= 9; i++) {
            stringBuilderWrapper.Append("CastellettoFM\t");
            stringBuilderWrapper.Append(str + "\t");
            stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.GetDefault("iva" + anywheresoftware.b4a.BA.NumberToString(i), "-1")) + "\t");
            stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.GetDefault("aliquota" + anywheresoftware.b4a.BA.NumberToString(i), "-1")) + "\t");
            stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.GetDefault("imponibile" + anywheresoftware.b4a.BA.NumberToString(i), "-1")) + "\t");
            stringBuilderWrapper.Append(anywheresoftware.b4a.BA.ObjectToString(map.GetDefault("imposta" + anywheresoftware.b4a.BA.NumberToString(i), "-1")) + "\n");
        }
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecNonQuery("update progressivi set valore = " + anywheresoftware.b4a.BA.NumberToString(parseDouble + 1) + " where codice = 'SEND'");
        anywheresoftware.b4a.objects.streams.File.TextWriterWrapper textWriterWrapper = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        textWriterWrapper.Initialize(anywheresoftware.b4a.objects.streams.File.OpenOutput(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6, "movimento.txt", false).getObject());
        textWriterWrapper.Write(anywheresoftware.b4a.BA.ObjectToString(stringBuilderWrapper));
        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map.Get("cliente"));
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, textWriterWrapper, ObjectToString, 1);
        textWriterWrapper.Close();
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        java.lang.String _vvvvvvvvvvvvvv1 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvv1(ba, cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA));
        java.util.Arrays.fill(new java.lang.String[0], "");
        flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
        anywheresoftware.b4a.BA ba2 = processBA;
        cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
        java.lang.String str2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
        cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
        archiverForB4A.ZipFiles(ba2, str2, new java.lang.String[]{"movimento.txt"}, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6, "DaCasse" + _vvvvvvvvvvvvvv1 + "1.tmp", "");
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
        anywheresoftware.b4a.objects.streams.File.Delete(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6, "movimento.txt");
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x05dd A[Catch: Exception -> 0x1340, TryCatch #0 {Exception -> 0x1340, blocks: (B:3:0x001e, B:5:0x009c, B:6:0x00eb, B:8:0x00f5, B:12:0x0184, B:14:0x0198, B:15:0x01a8, B:17:0x01c9, B:19:0x0214, B:21:0x021a, B:22:0x02c0, B:24:0x030f, B:26:0x031a, B:29:0x032d, B:33:0x0336, B:36:0x0378, B:38:0x037e, B:39:0x03cc, B:41:0x03d4, B:43:0x0433, B:45:0x043c, B:47:0x062b, B:50:0x0472, B:52:0x0490, B:54:0x049c, B:56:0x04d3, B:58:0x0504, B:59:0x052b, B:61:0x0533, B:63:0x0549, B:64:0x0555, B:65:0x0561, B:67:0x05b0, B:68:0x05be, B:71:0x05ca, B:73:0x06ad, B:75:0x06bb, B:77:0x06c9, B:78:0x0824, B:80:0x08af, B:82:0x094e, B:84:0x098d, B:85:0x09e0, B:87:0x09ef, B:88:0x0a19, B:90:0x0a2c, B:91:0x0a2e, B:93:0x0a8e, B:95:0x0aa6, B:97:0x0ab8, B:100:0x0ac5, B:102:0x0ad1, B:103:0x0b21, B:105:0x0b31, B:106:0x0b4b, B:109:0x0c21, B:111:0x0c2b, B:108:0x0bed, B:115:0x0c7f, B:117:0x0c10, B:118:0x0bf2, B:119:0x06f2, B:121:0x074a, B:123:0x0cd1, B:126:0x0ce1, B:128:0x0cfb, B:130:0x0d0d, B:133:0x0d1a, B:135:0x0d26, B:136:0x0d77, B:138:0x0da8, B:139:0x0de3, B:141:0x0eef, B:143:0x0ef9, B:146:0x0ebb, B:156:0x0ec3, B:148:0x0f4e, B:150:0x0f5d, B:162:0x07a1, B:164:0x07a5, B:165:0x07a8, B:167:0x07c7, B:169:0x07f9, B:171:0x080b, B:173:0x0821, B:176:0x0f67, B:179:0x0f70, B:180:0x0fa1, B:182:0x104f, B:184:0x1055, B:186:0x1069, B:187:0x1077, B:188:0x132b, B:192:0x112d, B:194:0x113d, B:196:0x1176, B:197:0x1195, B:199:0x127e, B:201:0x1284, B:206:0x1361, B:203:0x1324, B:209:0x13a5, B:212:0x13b2, B:216:0x13e2, B:219:0x13ec, B:221:0x146e, B:223:0x148f, B:225:0x1497, B:227:0x14da, B:228:0x14ff, B:229:0x168c, B:231:0x153a, B:232:0x156d, B:234:0x1655, B:239:0x16f3, B:240:0x16a5, B:242:0x16ed, B:245:0x062f, B:247:0x0643, B:249:0x067c, B:252:0x05dd, B:257:0x013e, B:236:0x15e3), top: B:2:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0336 A[Catch: Exception -> 0x1340, TryCatch #0 {Exception -> 0x1340, blocks: (B:3:0x001e, B:5:0x009c, B:6:0x00eb, B:8:0x00f5, B:12:0x0184, B:14:0x0198, B:15:0x01a8, B:17:0x01c9, B:19:0x0214, B:21:0x021a, B:22:0x02c0, B:24:0x030f, B:26:0x031a, B:29:0x032d, B:33:0x0336, B:36:0x0378, B:38:0x037e, B:39:0x03cc, B:41:0x03d4, B:43:0x0433, B:45:0x043c, B:47:0x062b, B:50:0x0472, B:52:0x0490, B:54:0x049c, B:56:0x04d3, B:58:0x0504, B:59:0x052b, B:61:0x0533, B:63:0x0549, B:64:0x0555, B:65:0x0561, B:67:0x05b0, B:68:0x05be, B:71:0x05ca, B:73:0x06ad, B:75:0x06bb, B:77:0x06c9, B:78:0x0824, B:80:0x08af, B:82:0x094e, B:84:0x098d, B:85:0x09e0, B:87:0x09ef, B:88:0x0a19, B:90:0x0a2c, B:91:0x0a2e, B:93:0x0a8e, B:95:0x0aa6, B:97:0x0ab8, B:100:0x0ac5, B:102:0x0ad1, B:103:0x0b21, B:105:0x0b31, B:106:0x0b4b, B:109:0x0c21, B:111:0x0c2b, B:108:0x0bed, B:115:0x0c7f, B:117:0x0c10, B:118:0x0bf2, B:119:0x06f2, B:121:0x074a, B:123:0x0cd1, B:126:0x0ce1, B:128:0x0cfb, B:130:0x0d0d, B:133:0x0d1a, B:135:0x0d26, B:136:0x0d77, B:138:0x0da8, B:139:0x0de3, B:141:0x0eef, B:143:0x0ef9, B:146:0x0ebb, B:156:0x0ec3, B:148:0x0f4e, B:150:0x0f5d, B:162:0x07a1, B:164:0x07a5, B:165:0x07a8, B:167:0x07c7, B:169:0x07f9, B:171:0x080b, B:173:0x0821, B:176:0x0f67, B:179:0x0f70, B:180:0x0fa1, B:182:0x104f, B:184:0x1055, B:186:0x1069, B:187:0x1077, B:188:0x132b, B:192:0x112d, B:194:0x113d, B:196:0x1176, B:197:0x1195, B:199:0x127e, B:201:0x1284, B:206:0x1361, B:203:0x1324, B:209:0x13a5, B:212:0x13b2, B:216:0x13e2, B:219:0x13ec, B:221:0x146e, B:223:0x148f, B:225:0x1497, B:227:0x14da, B:228:0x14ff, B:229:0x168c, B:231:0x153a, B:232:0x156d, B:234:0x1655, B:239:0x16f3, B:240:0x16a5, B:242:0x16ed, B:245:0x062f, B:247:0x0643, B:249:0x067c, B:252:0x05dd, B:257:0x013e, B:236:0x15e3), top: B:2:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x037e A[Catch: Exception -> 0x1340, TryCatch #0 {Exception -> 0x1340, blocks: (B:3:0x001e, B:5:0x009c, B:6:0x00eb, B:8:0x00f5, B:12:0x0184, B:14:0x0198, B:15:0x01a8, B:17:0x01c9, B:19:0x0214, B:21:0x021a, B:22:0x02c0, B:24:0x030f, B:26:0x031a, B:29:0x032d, B:33:0x0336, B:36:0x0378, B:38:0x037e, B:39:0x03cc, B:41:0x03d4, B:43:0x0433, B:45:0x043c, B:47:0x062b, B:50:0x0472, B:52:0x0490, B:54:0x049c, B:56:0x04d3, B:58:0x0504, B:59:0x052b, B:61:0x0533, B:63:0x0549, B:64:0x0555, B:65:0x0561, B:67:0x05b0, B:68:0x05be, B:71:0x05ca, B:73:0x06ad, B:75:0x06bb, B:77:0x06c9, B:78:0x0824, B:80:0x08af, B:82:0x094e, B:84:0x098d, B:85:0x09e0, B:87:0x09ef, B:88:0x0a19, B:90:0x0a2c, B:91:0x0a2e, B:93:0x0a8e, B:95:0x0aa6, B:97:0x0ab8, B:100:0x0ac5, B:102:0x0ad1, B:103:0x0b21, B:105:0x0b31, B:106:0x0b4b, B:109:0x0c21, B:111:0x0c2b, B:108:0x0bed, B:115:0x0c7f, B:117:0x0c10, B:118:0x0bf2, B:119:0x06f2, B:121:0x074a, B:123:0x0cd1, B:126:0x0ce1, B:128:0x0cfb, B:130:0x0d0d, B:133:0x0d1a, B:135:0x0d26, B:136:0x0d77, B:138:0x0da8, B:139:0x0de3, B:141:0x0eef, B:143:0x0ef9, B:146:0x0ebb, B:156:0x0ec3, B:148:0x0f4e, B:150:0x0f5d, B:162:0x07a1, B:164:0x07a5, B:165:0x07a8, B:167:0x07c7, B:169:0x07f9, B:171:0x080b, B:173:0x0821, B:176:0x0f67, B:179:0x0f70, B:180:0x0fa1, B:182:0x104f, B:184:0x1055, B:186:0x1069, B:187:0x1077, B:188:0x132b, B:192:0x112d, B:194:0x113d, B:196:0x1176, B:197:0x1195, B:199:0x127e, B:201:0x1284, B:206:0x1361, B:203:0x1324, B:209:0x13a5, B:212:0x13b2, B:216:0x13e2, B:219:0x13ec, B:221:0x146e, B:223:0x148f, B:225:0x1497, B:227:0x14da, B:228:0x14ff, B:229:0x168c, B:231:0x153a, B:232:0x156d, B:234:0x1655, B:239:0x16f3, B:240:0x16a5, B:242:0x16ed, B:245:0x062f, B:247:0x0643, B:249:0x067c, B:252:0x05dd, B:257:0x013e, B:236:0x15e3), top: B:2:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03d4 A[Catch: Exception -> 0x1340, TryCatch #0 {Exception -> 0x1340, blocks: (B:3:0x001e, B:5:0x009c, B:6:0x00eb, B:8:0x00f5, B:12:0x0184, B:14:0x0198, B:15:0x01a8, B:17:0x01c9, B:19:0x0214, B:21:0x021a, B:22:0x02c0, B:24:0x030f, B:26:0x031a, B:29:0x032d, B:33:0x0336, B:36:0x0378, B:38:0x037e, B:39:0x03cc, B:41:0x03d4, B:43:0x0433, B:45:0x043c, B:47:0x062b, B:50:0x0472, B:52:0x0490, B:54:0x049c, B:56:0x04d3, B:58:0x0504, B:59:0x052b, B:61:0x0533, B:63:0x0549, B:64:0x0555, B:65:0x0561, B:67:0x05b0, B:68:0x05be, B:71:0x05ca, B:73:0x06ad, B:75:0x06bb, B:77:0x06c9, B:78:0x0824, B:80:0x08af, B:82:0x094e, B:84:0x098d, B:85:0x09e0, B:87:0x09ef, B:88:0x0a19, B:90:0x0a2c, B:91:0x0a2e, B:93:0x0a8e, B:95:0x0aa6, B:97:0x0ab8, B:100:0x0ac5, B:102:0x0ad1, B:103:0x0b21, B:105:0x0b31, B:106:0x0b4b, B:109:0x0c21, B:111:0x0c2b, B:108:0x0bed, B:115:0x0c7f, B:117:0x0c10, B:118:0x0bf2, B:119:0x06f2, B:121:0x074a, B:123:0x0cd1, B:126:0x0ce1, B:128:0x0cfb, B:130:0x0d0d, B:133:0x0d1a, B:135:0x0d26, B:136:0x0d77, B:138:0x0da8, B:139:0x0de3, B:141:0x0eef, B:143:0x0ef9, B:146:0x0ebb, B:156:0x0ec3, B:148:0x0f4e, B:150:0x0f5d, B:162:0x07a1, B:164:0x07a5, B:165:0x07a8, B:167:0x07c7, B:169:0x07f9, B:171:0x080b, B:173:0x0821, B:176:0x0f67, B:179:0x0f70, B:180:0x0fa1, B:182:0x104f, B:184:0x1055, B:186:0x1069, B:187:0x1077, B:188:0x132b, B:192:0x112d, B:194:0x113d, B:196:0x1176, B:197:0x1195, B:199:0x127e, B:201:0x1284, B:206:0x1361, B:203:0x1324, B:209:0x13a5, B:212:0x13b2, B:216:0x13e2, B:219:0x13ec, B:221:0x146e, B:223:0x148f, B:225:0x1497, B:227:0x14da, B:228:0x14ff, B:229:0x168c, B:231:0x153a, B:232:0x156d, B:234:0x1655, B:239:0x16f3, B:240:0x16a5, B:242:0x16ed, B:245:0x062f, B:247:0x0643, B:249:0x067c, B:252:0x05dd, B:257:0x013e, B:236:0x15e3), top: B:2:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0490 A[Catch: Exception -> 0x1340, TryCatch #0 {Exception -> 0x1340, blocks: (B:3:0x001e, B:5:0x009c, B:6:0x00eb, B:8:0x00f5, B:12:0x0184, B:14:0x0198, B:15:0x01a8, B:17:0x01c9, B:19:0x0214, B:21:0x021a, B:22:0x02c0, B:24:0x030f, B:26:0x031a, B:29:0x032d, B:33:0x0336, B:36:0x0378, B:38:0x037e, B:39:0x03cc, B:41:0x03d4, B:43:0x0433, B:45:0x043c, B:47:0x062b, B:50:0x0472, B:52:0x0490, B:54:0x049c, B:56:0x04d3, B:58:0x0504, B:59:0x052b, B:61:0x0533, B:63:0x0549, B:64:0x0555, B:65:0x0561, B:67:0x05b0, B:68:0x05be, B:71:0x05ca, B:73:0x06ad, B:75:0x06bb, B:77:0x06c9, B:78:0x0824, B:80:0x08af, B:82:0x094e, B:84:0x098d, B:85:0x09e0, B:87:0x09ef, B:88:0x0a19, B:90:0x0a2c, B:91:0x0a2e, B:93:0x0a8e, B:95:0x0aa6, B:97:0x0ab8, B:100:0x0ac5, B:102:0x0ad1, B:103:0x0b21, B:105:0x0b31, B:106:0x0b4b, B:109:0x0c21, B:111:0x0c2b, B:108:0x0bed, B:115:0x0c7f, B:117:0x0c10, B:118:0x0bf2, B:119:0x06f2, B:121:0x074a, B:123:0x0cd1, B:126:0x0ce1, B:128:0x0cfb, B:130:0x0d0d, B:133:0x0d1a, B:135:0x0d26, B:136:0x0d77, B:138:0x0da8, B:139:0x0de3, B:141:0x0eef, B:143:0x0ef9, B:146:0x0ebb, B:156:0x0ec3, B:148:0x0f4e, B:150:0x0f5d, B:162:0x07a1, B:164:0x07a5, B:165:0x07a8, B:167:0x07c7, B:169:0x07f9, B:171:0x080b, B:173:0x0821, B:176:0x0f67, B:179:0x0f70, B:180:0x0fa1, B:182:0x104f, B:184:0x1055, B:186:0x1069, B:187:0x1077, B:188:0x132b, B:192:0x112d, B:194:0x113d, B:196:0x1176, B:197:0x1195, B:199:0x127e, B:201:0x1284, B:206:0x1361, B:203:0x1324, B:209:0x13a5, B:212:0x13b2, B:216:0x13e2, B:219:0x13ec, B:221:0x146e, B:223:0x148f, B:225:0x1497, B:227:0x14da, B:228:0x14ff, B:229:0x168c, B:231:0x153a, B:232:0x156d, B:234:0x1655, B:239:0x16f3, B:240:0x16a5, B:242:0x16ed, B:245:0x062f, B:247:0x0643, B:249:0x067c, B:252:0x05dd, B:257:0x013e, B:236:0x15e3), top: B:2:0x001e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(boolean z, int i) throws java.lang.Exception {
        anywheresoftware.b4a.objects.collections.Map map;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        int i2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z2;
        boolean z3;
        java.lang.String str6;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2;
        java.lang.String str7;
        int i3;
        java.lang.String str8;
        int i4;
        boolean z4;
        int i5;
        java.lang.String str9;
        double d;
        int i6;
        java.lang.String str10;
        double doubleValue;
        try {
            map = new anywheresoftware.b4a.objects.collections.Map();
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.BA ba = processBA;
            com.rootsoft.pdfwriter.PaperSize paperSize = mostCurrent._vvvvvv0;
            com.rootsoft.pdfwriter.PaperSize paperSize2 = mostCurrent._vvvvvv0;
            mypdfwriter.Initialize(ba, "PDFWriter1", 595, 842);
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            com.rootsoft.pdfwriter.StandardFonts standardFonts = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            com.rootsoft.pdfwriter.StandardFonts standardFonts2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            mypdfwriter2.setFont("Type1", "Courier-Bold");
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._datafattura.getTag());
            java.lang.String text = mostCurrent._datafattura.getText();
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("select valore from progressivi where codice ='");
            cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
            int parseDouble = (int) java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            if (z) {
                cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
                java.lang.String str11 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
                java.lang.String str12 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
                int parseDouble2 = (int) java.lang.Double.parseDouble(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Select * from clienti where codice ='");
                cassandraRisto.ital.fatturafm fatturafmVar5 = mostCurrent;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, sql2.ExecQuery(append2.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
                cursorWrapper4.setPosition(0);
                cursorWrapper = cursorWrapper4;
                i2 = parseDouble2;
                str = str12;
                str2 = str11;
            } else {
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper6 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clienti where codice ='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'"));
                cursorWrapper6.setPosition(0);
                cursorWrapper = cursorWrapper6;
                i2 = parseDouble;
                str = text;
                str2 = ObjectToString;
            }
            str3 = "";
            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._v_attivafe) {
                str4 = "";
            } else {
                java.lang.String str13 = str2.substring(6) + "-" + str2.substring(0, 2) + "-" + str2.substring(3, 5);
                if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized())) {
                    return "";
                }
                if (!mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Memo", "").equals("")) {
                    str3 = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Memo", ""));
                }
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0.0d;
                if (2.0d == anywheresoftware.b4a.BA.ObjectToNumber(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("EsigibilitaIVA", 0))) {
                    cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(" from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + cursorWrapper.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(i2) + " and datfat_fm = '" + str2 + "'");
                }
                str4 = str13;
            }
            if (anywheresoftware.b4a.keywords.Common.Not(z)) {
                cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("update headmov set nfat_fm = ").append(anywheresoftware.b4a.BA.NumberToString(i2)).append(",sezionale='");
                cassandraRisto.ital.fatturafm fatturafmVar6 = mostCurrent;
                java.lang.StringBuilder append4 = append3.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).append("',datfat_fm = '").append(str2).append("' where (select count(*) from CausaliPagamenti where CausaliPagamenti.nmov= headmov.nmov And (");
                cassandraRisto.ital.fatturafm fatturafmVar7 = mostCurrent;
                java.lang.StringBuilder append5 = append4.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("))>0 And  FattFM=1 And  cliente = '").append(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli").trim()).append("' and ");
                cassandraRisto.ital.fatturafm fatturafmVar8 = mostCurrent;
                sql3.ExecNonQuery(append5.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).toString());
                cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append6 = new java.lang.StringBuilder().append("update  progressivi set valore = ").append(anywheresoftware.b4a.BA.NumberToString(i2 + 1)).append("  where codice ='");
                cassandraRisto.ital.fatturafm fatturafmVar9 = mostCurrent;
                sql4.ExecNonQuery(append6.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString());
            }
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            str5 = "where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + cursorWrapper.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(i2) + " and datfat_fm = '" + str2 + "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm";
            cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        if (cassandraRisto.ital.main._v_fatturafmt2) {
            if (anywheresoftware.b4a.keywords.Common.Not(cursorWrapper.GetInt("abpost") == 1 && cursorWrapper.GetDouble("fido").doubleValue() > 0.0d)) {
                z2 = true;
                if (z2) {
                    cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper.GetString("codice").trim()) + "' and fido >0")) > 0.0d) {
                        z3 = false;
                        if (anywheresoftware.b4a.keywords.Common.Not(z3)) {
                            java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (");
                            cassandraRisto.ital.fatturafm fatturafmVar10 = mostCurrent;
                            str6 = append7.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.nmov,headmov.dataeoraffm,headmov.datam,headmov.memo as clides,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='").append(cursorWrapper.GetString("codice").trim()).append("' and nfat_fm =").append(anywheresoftware.b4a.BA.NumberToString(i2)).append(" and datfat_fm = '").append(str2).append("' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm").toString();
                        } else {
                            str6 = "Select sum(importo) as tot, headmov.nric as Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.nmov,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva,headmov.memo as clides from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + cursorWrapper.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(i2) + " and datfat_fm = '" + str2 + "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap,venduto.iva order by dataeoraffm";
                        }
                        cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_attivafe) {
                            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper7 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper8 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper7, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select iva.codice as codice from venduto inner join iva on venduto.iva=iva.codice inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + cursorWrapper.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(i2) + " and datfat_fm = '" + str2 + "' "));
                            if (cursorWrapper8.getRowCount() > 0) {
                                int rowCount = cursorWrapper8.getRowCount() - 1;
                                for (int i7 = 0; i7 <= rowCount; i7++) {
                                    cursorWrapper8.setPosition(i7);
                                    cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from iva where codice=" + cursorWrapper8.GetString("codice") + " and natura=6")) > 0.0d) {
                                        break;
                                    }
                                }
                            }
                        }
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper9 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper9, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery(str6));
                        if (cursorWrapper2.getRowCount() > 0) {
                            cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_attivafe)) {
                                cassandraRisto.ital.modalmline modalmlineVar = new cassandraRisto.ital.modalmline();
                                modalmlineVar._initialize(mostCurrent.activityBA, "FatturaFM", 28, mostCurrent._activity);
                                anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                                int RGB = anywheresoftware.b4a.keywords.constants.Colors.RGB(150, 150, 150);
                                anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                                int RGB2 = anywheresoftware.b4a.keywords.constants.Colors.RGB(150, 150, 150);
                                anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
                                modalmlineVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(RGB, RGB2, -256);
                                java.lang.String str14 = "";
                                if (z) {
                                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(i2) + "'")) > 0.0d) {
                                        cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        str14 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select testo from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(i2) + "'");
                                    }
                                } else if (!cursorWrapper.GetString("codice").trim().equals("")) {
                                    cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" + cursorWrapper.GetString("codice").trim() + "'")) > 0.0d) {
                                        cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        str14 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select testo from TestiCli where codice='" + cursorWrapper.GetString("codice").trim() + "'");
                                    }
                                }
                                if (str14.equals("")) {
                                    cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'")) > 0.0d) {
                                        cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        str14 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'");
                                    }
                                }
                                str7 = modalmlineVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("Testo aggiuntivo Fattura", "Aggiungi un testo", "", str14);
                            } else {
                                str7 = str3;
                            }
                            cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            double parseDouble3 = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select case when sum(scov) is null then 0 else sum(scov) end  from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + cursorWrapper.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(i2) + " and datfat_fm = '" + str2 + "'"));
                            if (i == 0) {
                                i = (int) ((cursorWrapper2.getRowCount() / 29.0d) + 1.0d);
                            }
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Clear();
                            for (int i8 = 0; i8 <= 30; i8++) {
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Add(0);
                            }
                            cassandraRisto.ital.main mainVar25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_stampafattura == 300) {
                                cassandraRisto.ital.main mainVar26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_iprpi.equals("")) {
                                    java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Non è stato configurato il ServiceBox.\nLa fattura verrà stampata con il sistema integrato");
                                    cassandraRisto.ital.main mainVar27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                    cassandraRisto.ital.main mainVar28 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                                } else {
                                    anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                                    anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                                    java.lang.String dirDefaultExternal = anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal();
                                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.objects.streams.File.Copy(dirDefaultExternal, "Anagra.db", cassandraRisto.ital.mod1._vvvvv1, "AnagraDocFM.db");
                                    anywheresoftware.b4a.sql.SQL sql5 = new anywheresoftware.b4a.sql.SQL();
                                    cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    sql5.Initialize(cassandraRisto.ital.mod1._vvvvv1, "AnagraDocFM.db", true);
                                    sql5.ExecNonQuery("delete from venduto");
                                    new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper10 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                                    cassandraRisto.ital.main mainVar29 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper11 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper10, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select\n\t\t\t\tvenduto.codint,venduto.codice,venduto.descrizione,venduto.brep,\n\t\t\t\tvenduto.qta,venduto.prezzov,venduto.reparto,venduto.iva,\n\t\t\t\tvenduto.importo,venduto.aliquota2,venduto.nmov from venduto \n\t\t\t\tinner join headmov on venduto.nmov = headmov.nmov \n\t\t\t\tinner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov \n\t\t\t\twhere CausaliPagamenti.codice=2 And  headmov.nfat=0 \n\t\t\t\tAnd  FattFM=1 And  nfat_fm =" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", java.lang.Integer.valueOf(i2)) + " \n\t\t\t\tAnd datfat_fm = '" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str2) + "' order by dataeoraffm"));
                                    anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                                    list.Initialize();
                                    int rowCount2 = cursorWrapper11.getRowCount() - 1;
                                    for (int i9 = 0; i9 <= rowCount2; i9++) {
                                        cursorWrapper11.setPosition(i9);
                                        anywheresoftware.b4a.objects.collections.Map map2 = new anywheresoftware.b4a.objects.collections.Map();
                                        map2.Initialize();
                                        map2.Put("codint", cursorWrapper11.GetString("codint"));
                                        map2.Put("codice", cursorWrapper11.GetString("codice"));
                                        map2.Put("descrizione", cursorWrapper11.GetString("descrizione"));
                                        map2.Put("brep", java.lang.Integer.valueOf(cursorWrapper11.GetInt("brep")));
                                        map2.Put("reparto", java.lang.Integer.valueOf(cursorWrapper11.GetInt("reparto")));
                                        map2.Put("iva", java.lang.Integer.valueOf(cursorWrapper11.GetInt("iva")));
                                        map2.Put("nmov", java.lang.Integer.valueOf(cursorWrapper11.GetInt("nmov")));
                                        map2.Put("qta", cursorWrapper11.GetDouble("qta"));
                                        map2.Put("prezzov", cursorWrapper11.GetDouble("prezzov"));
                                        map2.Put("importo", cursorWrapper11.GetDouble("importo"));
                                        map2.Put("aliquota2", cursorWrapper11.GetDouble("aliquota2"));
                                        list.Add(map2.getObject());
                                    }
                                    cassandraRisto.ital.dbutil dbutilVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                    cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, sql5, "venduto", list);
                                    cursorWrapper11.Close();
                                    sql5.ExecNonQuery("CREATE TABLE vendutoFM (chiave INTEGER PRIMARY KEY ,\n\t\t\t\ttot numeric(18,2) not null default 0,descrizione nvarchar(100) NOT NULL DEFAULT '',\n\t\t\t\tdescrizioneCliente nvarchar(50) NOT NULL DEFAULT '',\n\t\t\t\tRicevuta int not null default 0,nmov int not null default 0,\n\t\t\t\tnumero int not null default 0,dataeoraffm datetime,datam datetime,\n\t\t\t\tmatricolacassap nvarchar(20) not null default '',\n\t\t\t\tiva  int not null default 0,clides nvarchar(50) NOT NULL DEFAULT '')");
                                    java.lang.String str15 = " del " + str.substring(12).trim();
                                    cassandraRisto.ital.main mainVar30 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_orafatt) {
                                        java.lang.StringBuilder append8 = new java.lang.StringBuilder().append(str15).append(" ");
                                        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                                        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        java.lang.StringBuilder append9 = append8.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetHour(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)), 2, 0)).append(":");
                                        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                                        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        str15 = append9.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetMinute(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)), 2, 0)).toString();
                                    }
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(str);
                                    cassandraRisto.ital.fatturafm fatturafmVar11 = mostCurrent;
                                    if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("")) {
                                        java.lang.StringBuilder append10 = new java.lang.StringBuilder().append("Fattura N.").append(anywheresoftware.b4a.BA.NumberToString(i2)).append("/");
                                        cassandraRisto.ital.fatturafm fatturafmVar12 = mostCurrent;
                                        str10 = append10.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).append(str15).toString();
                                    } else {
                                        str10 = "Fattura N." + anywheresoftware.b4a.BA.NumberToString(i2) + str15;
                                    }
                                    anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
                                    stringBuilderWrapper.Initialize();
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str7, i2, stringBuilderWrapper, "stampaPDF");
                                    if (z) {
                                        doubleValue = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    } else {
                                        doubleValue = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue();
                                    }
                                    anywheresoftware.b4a.objects.collections.Map map3 = new anywheresoftware.b4a.objects.collections.Map();
                                    map3.Initialize();
                                    map3.Put("nmov", "0");
                                    map3.Put("TmpHeadDoc", str10);
                                    map3.Put("Totale", anywheresoftware.b4a.keywords.Common.NumberFormat2(doubleValue, 1, 2, 2, false));
                                    map3.Put("Cliente", cursorWrapper.GetString("codice"));
                                    map3.Put("TmpFattura", stringBuilderWrapper.ToString());
                                    cassandraRisto.ital.fatturafm fatturafmVar13 = mostCurrent;
                                    map3.Put("v_Barra", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
                                    anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
                                    cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    anywheresoftware.b4a.objects.streams.File.WriteMap(cassandraRisto.ital.mod1._vvvvv1, "MappaDoc.txt", map3);
                                    anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
                                    list2.Initialize();
                                    int rowCount3 = cursorWrapper2.getRowCount() - 1;
                                    for (int i10 = 0; i10 <= rowCount3; i10++) {
                                        cursorWrapper2.setPosition(i10);
                                        if (cursorWrapper2.GetDouble("tot").doubleValue() != 0.0d) {
                                            java.lang.String GetString = cursorWrapper2.GetString("dataeoraffm");
                                            java.lang.String GetString2 = cursorWrapper2.GetString("matricolacassap");
                                            if (GetString == null) {
                                                GetString = cursorWrapper2.GetString("datam");
                                            }
                                            java.lang.String str16 = GetString2 == null ? "" : GetString2;
                                            java.lang.String str17 = "";
                                            if (cursorWrapper2.GetInt("numero") > 0) {
                                                str17 = "SCO.:" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(cursorWrapper2) + " del " + GetString.substring(3, 5) + "/" + GetString.substring(0, 2) + "/" + GetString.substring(6) + " MF:" + str16;
                                            } else if (cursorWrapper2.GetInt("Ricevuta") > 0) {
                                                GetString = cursorWrapper2.GetString("datam");
                                                str17 = "RIC.:" + cursorWrapper2.GetString("Ricevuta") + " del " + GetString.substring(3, 5) + "/" + GetString.substring(0, 2) + "/" + GetString.substring(6);
                                            }
                                            java.lang.String GetString3 = cursorWrapper2.GetString("clides");
                                            if (GetString3.contains("Tess.")) {
                                                GetString3 = GetString3.substring(GetString3.indexOf("Tess.")).replace("(", "-").replace(")", "-");
                                            }
                                            anywheresoftware.b4a.objects.collections.Map map4 = new anywheresoftware.b4a.objects.collections.Map();
                                            map4.Initialize();
                                            map4.Put("tot", cursorWrapper2.GetDouble("tot"));
                                            map4.Put("Ricevuta", java.lang.Integer.valueOf(cursorWrapper2.GetInt("Ricevuta")));
                                            map4.Put("numero", java.lang.Integer.valueOf(cursorWrapper2.GetInt("numero")));
                                            map4.Put("nmov", java.lang.Integer.valueOf(cursorWrapper2.GetInt("nmov")));
                                            map4.Put("dataeoraffm", GetString);
                                            map4.Put("descrizione", str17 + " " + GetString3);
                                            map4.Put("datam", cursorWrapper2.GetString("datam"));
                                            map4.Put("matricolacassap", str16);
                                            map4.Put("iva", java.lang.Integer.valueOf(cursorWrapper2.GetInt("iva")));
                                            map4.Put("clides", cursorWrapper2.GetString("clides"));
                                            list2.Add(map4.getObject());
                                        }
                                    }
                                    cassandraRisto.ital.dbutil dbutilVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                    cassandraRisto.ital.dbutil._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, sql5, "vendutoFM", list2);
                                    sql5.Close();
                                    java.lang.String[] strArr = {"AnagraDocFM.db", "MappaDoc.txt"};
                                    java.util.Arrays.fill(strArr, "");
                                    flm.b4a.archiver.ArchiverForB4A archiverForB4A = new flm.b4a.archiver.ArchiverForB4A();
                                    anywheresoftware.b4a.BA ba2 = processBA;
                                    cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    java.lang.String str18 = cassandraRisto.ital.mod1._vvvvv1;
                                    cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    archiverForB4A.ZipFiles(ba2, str18, strArr, cassandraRisto.ital.mod1._vvvvv1, "BKAnagra.zip", "");
                                    anywheresoftware.b4a.BA ba3 = processBA;
                                    cassandraRisto.ital.rpidevice rpideviceVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    anywheresoftware.b4a.keywords.Common.CallSubNew2(ba3, cassandraRisto.ital.rpidevice.getObject(), "SendAnagraPerDoc", "TipoDocFatturaFM");
                                    return "";
                                }
                            }
                            njdude.custom.progressdialog.customprogressdialog customprogressdialogVar = new njdude.custom.progressdialog.customprogressdialog();
                            double PerYToCurrent = anywheresoftware.b4a.keywords.Common.PerYToCurrent(10.0f, mostCurrent.activityBA);
                            anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
                            customprogressdialogVar._initialize(mostCurrent.activityBA, mostCurrent._activity, anywheresoftware.b4a.keywords.Common.PerXToCurrent(60.0f, mostCurrent.activityBA), (anywheresoftware.b4a.keywords.Common.PerXToCurrent(100.0f, mostCurrent.activityBA) - anywheresoftware.b4a.keywords.Common.PerXToCurrent(60.0f, mostCurrent.activityBA)) / 2.0d, PerYToCurrent, "", "", -12303292, 0, "Progress", false);
                            java.lang.String str19 = "";
                            double d2 = 0.0d;
                            int i11 = 0;
                            boolean z5 = false;
                            int i12 = 1;
                            while (!z5) {
                                _vvvvvvvvvvvvvvvvvvvvv6(i2, str, " Pag." + anywheresoftware.b4a.BA.NumberToString(i12) + " di " + anywheresoftware.b4a.BA.NumberToString(i), cursorWrapper);
                                anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
                                customprogressdialogVar._showprogress("Generazione PDF in corso ...", -1, (int) ((i12 * 100) / i));
                                anywheresoftware.b4a.keywords.Common.DoEvents();
                                anywheresoftware.b4a.keywords.Common.DoEvents();
                                if (i11 - 1 >= cursorWrapper2.getRowCount() - 1) {
                                    break;
                                }
                                int rowCount4 = cursorWrapper2.getRowCount() - 1;
                                int i13 = 100;
                                int i14 = i11;
                                java.lang.String str20 = str19;
                                while (true) {
                                    if (i14 > rowCount4) {
                                        i4 = i11;
                                        z4 = z5;
                                        i5 = i12;
                                        break;
                                    }
                                    cursorWrapper2.setPosition(i14);
                                    if (cursorWrapper2.GetDouble("tot").doubleValue() != 0.0d) {
                                        java.lang.String GetString4 = cursorWrapper2.GetString("dataeoraffm");
                                        java.lang.String GetString5 = cursorWrapper2.GetString("matricolacassap");
                                        if (GetString4 == null) {
                                            GetString4 = cursorWrapper2.GetString("datam");
                                        }
                                        java.lang.String str21 = GetString5 == null ? "" : GetString5;
                                        java.lang.String str22 = "";
                                        if (cursorWrapper2.GetInt("numero") > 0) {
                                            str22 = "SCO.:" + _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(cursorWrapper2) + " del " + GetString4.substring(3, 5) + "/" + GetString4.substring(0, 2) + "/" + GetString4.substring(6) + " MF:" + str21;
                                            str9 = GetString4;
                                        } else if (cursorWrapper2.GetInt("Ricevuta") > 0) {
                                            java.lang.String GetString6 = cursorWrapper2.GetString("datam");
                                            str22 = "RIC.:" + cursorWrapper2.GetString("Ricevuta") + " del " + GetString6.substring(3, 5) + "/" + GetString6.substring(0, 2) + "/" + GetString6.substring(6);
                                            str9 = GetString6;
                                        } else {
                                            str9 = GetString4;
                                        }
                                        java.lang.String GetString7 = cursorWrapper2.GetString("clides");
                                        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        com.rootsoft.pdfwriter.PaperSize paperSize3 = mostCurrent._vvvvvv0;
                                        mypdfwriter3.addText((int) (2380 / 100.0d), 750 - i13, 11, str22);
                                        if (GetString7.contains("Tess.")) {
                                            i6 = i13 + 7;
                                            d = d2 + 0.5d;
                                            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                            com.rootsoft.pdfwriter.PaperSize paperSize4 = mostCurrent._vvvvvv0;
                                            mypdfwriter4.addText((int) (2380 / 100.0d), 750 - i6, 8, GetString7.substring(GetString7.indexOf("Tess.")).replace("(", "-").replace(")", "-"));
                                        } else {
                                            d = d2;
                                            i6 = i13;
                                        }
                                        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        com.rootsoft.pdfwriter.PaperSize paperSize5 = mostCurrent._vvvvvv0;
                                        cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                        anywheresoftware.b4a.BA ba4 = mostCurrent.activityBA;
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                        mypdfwriter5.addText((int) (44625 / 100.0d), 750 - i6, 11, cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba4, sb.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 9)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper2.GetDouble("tot").doubleValue(), 1, 2, 2, false)).toString(), 9L));
                                        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        com.rootsoft.pdfwriter.PaperSize paperSize6 = mostCurrent._vvvvvv0;
                                        mypdfwriter6.addText((int) (53550 / 100.0d), 750 - i6, 11, anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper2.GetInt("iva"), 1, 0, 0, false));
                                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Set(cursorWrapper2.GetInt("iva"), java.lang.Double.valueOf(anywheresoftware.b4a.BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(cursorWrapper2.GetInt("iva"))) + cursorWrapper2.GetDouble("tot").doubleValue()));
                                        d2 = d;
                                        i13 = i6;
                                        str20 = str9;
                                    }
                                    int i15 = i13 + 15;
                                    if (d2 >= 28.0d) {
                                        i4 = i14 + 1;
                                        d2 = 0.0d;
                                        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.newPage();
                                        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        cassandraRisto.ital.main mainVar31 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        com.rootsoft.pdfwriter.StandardFonts standardFonts3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        cassandraRisto.ital.main mainVar32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        com.rootsoft.pdfwriter.StandardFonts standardFonts4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        mypdfwriter7.setFont("Type1", "Courier-Bold");
                                        i5 = i12 + 1;
                                        z4 = z5;
                                        break;
                                    }
                                    if (i14 == cursorWrapper2.getRowCount() - 1) {
                                        z4 = true;
                                        i5 = i12;
                                        i4 = i11;
                                        break;
                                    }
                                    d2 += 1.0d;
                                    i13 = i15;
                                    i14++;
                                }
                                str19 = str20;
                                i11 = i4;
                                z5 = z4;
                                i12 = i5;
                            }
                            if (customprogressdialogVar._isshow) {
                                customprogressdialogVar._hide();
                            }
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper2 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
                            stringBuilderWrapper2.Initialize();
                            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(str7, i2, stringBuilderWrapper2, "stampaPDF");
                            int i16 = 150;
                            if (stringBuilderWrapper2.ToString().equals("")) {
                                i3 = 150;
                            } else {
                                java.util.Arrays.fill(new java.lang.String[0], "");
                                anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                                java.lang.String[] Split = anywheresoftware.b4a.keywords.Regex.Split("\n", stringBuilderWrapper2.ToString());
                                com.rootsoft.pdfwriter.myPDFWriter mypdfwriter8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                com.rootsoft.pdfwriter.PaperSize paperSize7 = mostCurrent._vvvvvv0;
                                mypdfwriter8.addText((int) (1190 / 100.0d), 150, 15, "Note:");
                                int length = Split.length - 1;
                                for (int i17 = 0; i17 <= length; i17++) {
                                    i16 = 138 - (i17 * 12);
                                    if (!Split[i17].trim().equals("")) {
                                        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        com.rootsoft.pdfwriter.PaperSize paperSize8 = mostCurrent._vvvvvv0;
                                        mypdfwriter9.addText((int) (1190 / 100.0d), i16, 13, Split[i17]);
                                    }
                                }
                                i3 = i16 - 12;
                            }
                            if (parseDouble3 > 0.0d) {
                                com.rootsoft.pdfwriter.myPDFWriter mypdfwriter10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                com.rootsoft.pdfwriter.PaperSize paperSize9 = mostCurrent._vvvvvv0;
                                mypdfwriter10.addText((int) (1190 / 100.0d), i3, 13, "Totale sconti applicati:" + anywheresoftware.b4a.keywords.Common.NumberFormat2(parseDouble3, 1, 2, 2, false));
                            }
                            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            com.rootsoft.pdfwriter.PaperSize paperSize10 = mostCurrent._vvvvvv0;
                            com.rootsoft.pdfwriter.PaperSize paperSize11 = mostCurrent._vvvvvv0;
                            mypdfwriter11.addRectangle((int) (30345 / 100.0d), 160, (int) (26775 / 100.0d), -150);
                            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            com.rootsoft.pdfwriter.PaperSize paperSize12 = mostCurrent._vvvvvv0;
                            mypdfwriter12.addText((int) (30940 / 100.0d), 140, 13, "IVA");
                            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            com.rootsoft.pdfwriter.PaperSize paperSize13 = mostCurrent._vvvvvv0;
                            mypdfwriter13.addText((int) (35700 / 100.0d), 140, 13, "Aliq.");
                            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            com.rootsoft.pdfwriter.PaperSize paperSize14 = mostCurrent._vvvvvv0;
                            mypdfwriter14.addText((int) (40460 / 100.0d), 140, 13, "Imponibile");
                            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            com.rootsoft.pdfwriter.PaperSize paperSize15 = mostCurrent._vvvvvv0;
                            mypdfwriter15.addText((int) (49980 / 100.0d), 140, 13, "Imposta");
                            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            com.rootsoft.pdfwriter.PaperSize paperSize16 = mostCurrent._vvvvvv0;
                            com.rootsoft.pdfwriter.PaperSize paperSize17 = mostCurrent._vvvvvv0;
                            mypdfwriter16.addLine((int) (30345 / 100.0d), 138, (int) (57120 / 100.0d), 138);
                            cassandraRisto.ital.main mainVar33 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivaterminale && anywheresoftware.b4a.keywords.Common.Not(z)) {
                                map.Initialize();
                                map.Put("cliente", cursorWrapper.GetString("codice"));
                                if (z) {
                                    map.Put("totale", java.lang.Double.valueOf(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
                                } else {
                                    map.Put("totale", mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("totale"));
                                }
                                cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.BA ba5 = mostCurrent.activityBA;
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                                cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                java.lang.StringBuilder append11 = sb2.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA))).append(" ");
                                anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                                cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                map.Put("datam", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba5, append11.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA))).toString()));
                                map.Put("numero", java.lang.Integer.valueOf(i2));
                                map.Put("dataFatt", str19.substring(3, 5) + "/" + str19.substring(0, 2) + "/" + str19.substring(6, 10));
                                cassandraRisto.ital.main mainVar34 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                map.Put("negozio", cassandraRisto.ital.main._v_nnegozio);
                                cassandraRisto.ital.main mainVar35 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                map.Put("cassa", cassandraRisto.ital.main._v_numcassa);
                            }
                            int i18 = 125;
                            for (int i19 = 0; i19 <= 9; i19++) {
                                if (anywheresoftware.b4a.BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(i19)) > 0.0d) {
                                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(i19);
                                    com.rootsoft.pdfwriter.myPDFWriter mypdfwriter17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                    com.rootsoft.pdfwriter.PaperSize paperSize18 = mostCurrent._vvvvvv0;
                                    mypdfwriter17.addText((int) (30940 / 100.0d), i18, 13, mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("codice"));
                                    if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue() == 0.0d) {
                                        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        com.rootsoft.pdfwriter.PaperSize paperSize19 = mostCurrent._vvvvvv0;
                                        mypdfwriter18.addText((int) (35700 / 100.0d), i18, 13, mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("descrizione"));
                                    } else {
                                        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        com.rootsoft.pdfwriter.PaperSize paperSize20 = mostCurrent._vvvvvv0;
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                        cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        mypdfwriter19.addText((int) (35700 / 100.0d), i18, 13, sb3.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvv5(mostCurrent.activityBA, mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue())).append(" %").toString());
                                    }
                                    double Round2 = anywheresoftware.b4a.keywords.Common.Round2(anywheresoftware.b4a.BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(i19)) - (anywheresoftware.b4a.BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(i19)) / (1.0d + (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue() / 100.0d))), 2);
                                    com.rootsoft.pdfwriter.myPDFWriter mypdfwriter20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                    com.rootsoft.pdfwriter.PaperSize paperSize21 = mostCurrent._vvvvvv0;
                                    cassandraRisto.ital.modfunstr modfunstrVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                    anywheresoftware.b4a.BA ba6 = mostCurrent.activityBA;
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                    cassandraRisto.ital.modfunstr modfunstrVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                    mypdfwriter20.addText((int) (40460 / 100.0d), i18, 13, cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba6, sb4.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 9)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(i19)) - Round2, 1, 2, 2, false)).toString(), 9L));
                                    com.rootsoft.pdfwriter.myPDFWriter mypdfwriter21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                    com.rootsoft.pdfwriter.PaperSize paperSize22 = mostCurrent._vvvvvv0;
                                    cassandraRisto.ital.modfunstr modfunstrVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                    anywheresoftware.b4a.BA ba7 = mostCurrent.activityBA;
                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                    cassandraRisto.ital.modfunstr modfunstrVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                    mypdfwriter21.addText((int) (49385 / 100.0d), i18, 13, cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba7, sb5.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 9)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(Round2, 1, 2, 2, false)).toString(), 9L));
                                    i18 -= 15;
                                    cassandraRisto.ital.main mainVar36 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_attivaterminale && anywheresoftware.b4a.keywords.Common.Not(z)) {
                                        map.Put("iva" + anywheresoftware.b4a.BA.NumberToString(i19), mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("codice"));
                                        map.Put("aliquota" + anywheresoftware.b4a.BA.NumberToString(i19), mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("aliquota2"));
                                        map.Put("imponibile" + anywheresoftware.b4a.BA.NumberToString(i19), anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(i19)) - Round2, 1, 2, 2, false));
                                        map.Put("imposta" + anywheresoftware.b4a.BA.NumberToString(i19), anywheresoftware.b4a.keywords.Common.NumberFormat2(Round2, 1, 2, 2, false));
                                    }
                                }
                                i18 = i18;
                            }
                            boolean z6 = true;
                            cassandraRisto.ital.main mainVar37 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe && z) {
                                java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Si desidera anche rigenerare il file xml ?");
                                cassandraRisto.ital.main mainVar38 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                                cassandraRisto.ital.main mainVar39 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                                z6 = Msgbox2 == -1;
                            }
                            cassandraRisto.ital.main mainVar40 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe && z6) {
                                anywheresoftware.b4a.objects.collections.List list3 = new anywheresoftware.b4a.objects.collections.List();
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(str5, z3);
                                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(str);
                                cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                anywheresoftware.b4a.BA ba8 = mostCurrent.activityBA;
                                anywheresoftware.b4a.objects.collections.Map map5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                java.lang.String trim = cursorWrapper.GetString("codice").trim();
                                java.lang.String str23 = " h.nfat=0 and  FattFM=1 and h.cliente ='" + cursorWrapper.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(i2) + " and datfat_fm = '" + str2 + "'";
                                cassandraRisto.ital.fatturafm fatturafmVar14 = mostCurrent;
                                java.lang.String _vvvvvvvv4 = cassandraRisto.ital.mod1._vvvvvvvv4(ba8, str4, i2, map5, trim, cursorWrapper, str23, true, list3, true, _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5, mostCurrent._activity);
                                if (!_vvvvvvvv4.equals("")) {
                                    anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
                                    if (anywheresoftware.b4a.objects.streams.File.Exists(sb6.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/FE").toString(), _vvvvvvvv4)) {
                                        cassandraRisto.ital.main mainVar41 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        if (cassandraRisto.ital.main._v_inviofe) {
                                            java.lang.String str24 = "Fattura Num." + anywheresoftware.b4a.BA.NumberToString(i2);
                                            java.lang.String str25 = " del " + str.substring(12).trim();
                                            cassandraRisto.ital.fatturafm fatturafmVar15 = mostCurrent;
                                            if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("")) {
                                                java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("Fattura N.").append(anywheresoftware.b4a.BA.NumberToString(i2)).append("/");
                                                cassandraRisto.ital.fatturafm fatturafmVar16 = mostCurrent;
                                                str8 = append12.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).toString();
                                            } else {
                                                str8 = "Fattura N." + anywheresoftware.b4a.BA.NumberToString(i2);
                                            }
                                            java.lang.String str26 = str8 + str25;
                                            anywheresoftware.b4a.BA ba9 = processBA;
                                            cassandraRisto.ital.httpclient httpclientVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba9, cassandraRisto.ital.httpclient.getObject(), "ComunicaConInviaFE", "http://127.0.0.1:12512/R__INVIO__" + _vvvvvvvv4 + "__", str26);
                                        }
                                    }
                                }
                            }
                            if (z) {
                                com.rootsoft.pdfwriter.myPDFWriter mypdfwriter22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                com.rootsoft.pdfwriter.PaperSize paperSize23 = mostCurrent._vvvvvv0;
                                mypdfwriter22.addText((int) (30940 / 100.0d), 20, 16, "Tot. Fattura EUR: " + anywheresoftware.b4a.keywords.Common.NumberFormat2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5, 1, 2, 2, false));
                            } else {
                                com.rootsoft.pdfwriter.myPDFWriter mypdfwriter23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                com.rootsoft.pdfwriter.PaperSize paperSize24 = mostCurrent._vvvvvv0;
                                mypdfwriter23.addText((int) (30940 / 100.0d), 20, 16, "Tot. Fattura EUR: " + anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue(), 1, 2, 2, false));
                                cassandraRisto.ital.main mainVar42 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_attivaterminale) {
                                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(map);
                                }
                            }
                            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ConverseDocument();
                            cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.String _vvvvvvvvvvv6 = cassandraRisto.ital.mod1._vvvvvvvvvvv6(mostCurrent.activityBA, cursorWrapper.GetString("descrizione"));
                            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            cassandraRisto.ital.mod1 mod1Var15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.String sb8 = sb7.append(cassandraRisto.ital.mod1._vvvvv1).append("/fatture").toString();
                            java.lang.String str27 = "Fatt.N." + anywheresoftware.b4a.BA.NumberToString(i2) + " di " + _vvvvvvvvvvv6 + ".PDF";
                            cassandraRisto.ital.fatturafm fatturafmVar17 = mostCurrent;
                            mypdfwriter24.outputToFile(sb8, str27, _vvvv6, "ISO-8859-1");
                            cassandraRisto.ital.main mainVar43 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_usbpath.equals("")) {
                                try {
                                    anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
                                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                                    cassandraRisto.ital.mod1 mod1Var16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    java.lang.String sb10 = sb9.append(cassandraRisto.ital.mod1._vvvvv1).append("/fatture").toString();
                                    java.lang.String str28 = "Fatt.N." + anywheresoftware.b4a.BA.NumberToString(i2) + " di " + _vvvvvvvvvvv6 + ".PDF";
                                    cassandraRisto.ital.main mainVar44 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    anywheresoftware.b4a.objects.streams.File.Copy(sb10, str28, cassandraRisto.ital.main._v_usbpath, "Fatt.N." + anywheresoftware.b4a.BA.NumberToString(i2) + " di " + _vvvvvvvvvvv6 + ".PDF");
                                } catch (java.lang.Exception e2) {
                                    processBA.setLastException(e2);
                                    cassandraRisto.ital.mod1 mod1Var17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
                                }
                            }
                            _preparamailvisualizza("Fatt.N." + anywheresoftware.b4a.BA.NumberToString(i2) + " di " + _vvvvvvvvvvv6 + ".PDF", cursorWrapper.GetString("mail"));
                        }
                        return "";
                    }
                }
                z3 = z2;
                if (anywheresoftware.b4a.keywords.Common.Not(z3)) {
                }
                cassandraRisto.ital.main mainVar132 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_attivafe) {
                }
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper92 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar162 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper92, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery(str6));
                if (cursorWrapper2.getRowCount() > 0) {
                }
                return "";
            }
        }
        z2 = false;
        if (z2) {
        }
        z3 = z2;
        if (anywheresoftware.b4a.keywords.Common.Not(z3)) {
        }
        cassandraRisto.ital.main mainVar1322 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_attivafe) {
        }
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper922 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar1622 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper922, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery(str6));
        if (cursorWrapper2.getRowCount() > 0) {
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper) throws java.lang.Exception {
        java.lang.String GetString = cursorWrapper.GetString("numero");
        if (cursorWrapper.GetInt("nChiusura") > 0) {
            return cursorWrapper.GetString("nChiusura") + "-" + cursorWrapper.GetString("numero");
        }
        return GetString;
    }

    public static java.lang.String _globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
        mostCurrent._adata = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._chiudi = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._dadata = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.CSBuilder();
        mostCurrent._datafattura = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._panelgrid = new anywheresoftware.b4a.objects.PanelWrapper();
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
        mostCurrent._ricerca = new anywheresoftware.b4a.objects.ButtonWrapper();
        cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = "";
        cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "F";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = -1;
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new cassandraRisto.ital.customlistviewold();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new cassandraRisto.ital.customlistviewold();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
        mostCurrent._bristampa = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new cassandraRisto.ital.customlistviewold();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.fatturafm fatturafmVar5 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = "";
        cassandraRisto.ital.fatturafm fatturafmVar6 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
        cassandraRisto.ital.fatturafm fatturafmVar7 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0.0d;
        cassandraRisto.ital.fatturafm fatturafmVar8 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new com.rootsoft.pdfwriter.myPDFWriter();
        mostCurrent._vvvvvv0 = new com.rootsoft.pdfwriter.PaperSize();
        cassandraRisto.ital.fatturafm fatturafmVar9 = mostCurrent;
        _vvvv6 = "";
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.net.SMTPWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.IME();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        mostCurrent._pnllist = new anywheresoftware.b4a.objects.PanelWrapper();
        mostCurrent._lblinfo = new anywheresoftware.b4a.objects.LabelWrapper();
        cassandraRisto.ital.fatturafm fatturafmVar10 = mostCurrent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = sb.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).append("/Fatture").toString();
        mostCurrent._lbltitolo = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.Map();
        mostCurrent._edtimportobollo = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._edtcup = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._edtcig = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._peiva2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
        mostCurrent._edtidordacq = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._lblidordacq = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._lblcig = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._lblcup = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._edtmemo = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._bnumerocopie = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._edtmailfe = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._baddcopie = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._blesscopie = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ltipodocumento = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ptipodocumento = new anywheresoftware.b4a.objects.SpinnerWrapper();
        mostCurrent._lblgridintestazione = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._pnlelencoristampa = new anywheresoftware.b4a.objects.PanelWrapper();
        mostCurrent._btngridok = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._btngridannulla = new anywheresoftware.b4a.objects.ButtonWrapper();
        return "";
    }

    public static java.lang.String _hide_keyboard() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.phone.Phone phone = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.phone.Phone.HideKeyboard(mostCurrent._activity);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str) throws java.lang.Exception {
        for (int numberOfViews = mostCurrent._activity.getNumberOfViews() - 1; numberOfViews >= 0; numberOfViews--) {
            mostCurrent._activity.RemoveViewAt(numberOfViews);
        }
        mostCurrent._activity.LoadLayout(str, mostCurrent.activityBA);
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (cassandraRisto.ital.main._v_attivafe != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e A[Catch: Exception -> 0x027a, TryCatch #0 {Exception -> 0x027a, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x0019, B:11:0x003c, B:13:0x004a, B:15:0x0058, B:17:0x0066, B:19:0x0074, B:21:0x0082, B:23:0x0090, B:25:0x0098, B:30:0x00f8, B:32:0x011d, B:34:0x015a, B:37:0x016d, B:39:0x017e, B:40:0x0194, B:42:0x01a2, B:43:0x01b8, B:45:0x01c0, B:46:0x01cb, B:48:0x01fe, B:50:0x021f, B:51:0x023f, B:53:0x0247, B:55:0x024f, B:56:0x026a), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2 A[Catch: Exception -> 0x027a, TryCatch #0 {Exception -> 0x027a, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x0019, B:11:0x003c, B:13:0x004a, B:15:0x0058, B:17:0x0066, B:19:0x0074, B:21:0x0082, B:23:0x0090, B:25:0x0098, B:30:0x00f8, B:32:0x011d, B:34:0x015a, B:37:0x016d, B:39:0x017e, B:40:0x0194, B:42:0x01a2, B:43:0x01b8, B:45:0x01c0, B:46:0x01cb, B:48:0x01fe, B:50:0x021f, B:51:0x023f, B:53:0x0247, B:55:0x024f, B:56:0x026a), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c0 A[Catch: Exception -> 0x027a, TryCatch #0 {Exception -> 0x027a, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x0019, B:11:0x003c, B:13:0x004a, B:15:0x0058, B:17:0x0066, B:19:0x0074, B:21:0x0082, B:23:0x0090, B:25:0x0098, B:30:0x00f8, B:32:0x011d, B:34:0x015a, B:37:0x016d, B:39:0x017e, B:40:0x0194, B:42:0x01a2, B:43:0x01b8, B:45:0x01c0, B:46:0x01cb, B:48:0x01fe, B:50:0x021f, B:51:0x023f, B:53:0x0247, B:55:0x024f, B:56:0x026a), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fe A[Catch: Exception -> 0x027a, TryCatch #0 {Exception -> 0x027a, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x0019, B:11:0x003c, B:13:0x004a, B:15:0x0058, B:17:0x0066, B:19:0x0074, B:21:0x0082, B:23:0x0090, B:25:0x0098, B:30:0x00f8, B:32:0x011d, B:34:0x015a, B:37:0x016d, B:39:0x017e, B:40:0x0194, B:42:0x01a2, B:43:0x01b8, B:45:0x01c0, B:46:0x01cb, B:48:0x01fe, B:50:0x021f, B:51:0x023f, B:53:0x0247, B:55:0x024f, B:56:0x026a), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _mail(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws java.lang.Exception {
        boolean z;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = " Sub MailDB(Title As String ,smtp1 As SMTP,Testo As String,SendDb As Boolean)";
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_attivafe && str3.equals("")) {
                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String str5 = cassandraRisto.ital.mod1._vvvvvv1;
                cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.objects.streams.File.Exists(str5, cassandraRisto.ital.mod1._vvvvv0.replace(".xml", ".txt")))) {
                    return "";
                }
            }
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (!cassandraRisto.ital.main._v_mserver.equals("")) {
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (!cassandraRisto.ital.main._v_mporta.equals("")) {
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (!cassandraRisto.ital.main._v_muser.equals("")) {
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!cassandraRisto.ital.main._v_mpwd.equals("")) {
                            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_md1.equals("")) {
                                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_md2.equals("")) {
                                    cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                }
                            }
                            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToCharSequence("Invio in corso ..."), false);
                            java.lang.String str6 = (str2 + "\n") + "Inviato da : \n";
                            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from intesta order by codice"));
                            if (cursorWrapper2.getRowCount() > 0) {
                                int i = 0;
                                while (i <= 5) {
                                    cursorWrapper2.setPosition(i);
                                    i++;
                                    str6 = str6 + cursorWrapper2.GetString("descrizione") + "\n";
                                }
                            }
                            java.lang.String str7 = str6;
                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String str8 = cassandraRisto.ital.main._v_mserver;
                            cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int parseDouble = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._v_mporta);
                            cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.String str9 = cassandraRisto.ital.main._v_muser;
                            cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            sMTPWrapper.Initialize(str8, parseDouble, str9, cassandraRisto.ital.main._v_mpwd, "SMTP");
                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_mporta.equals(anywheresoftware.b4a.BA.NumberToString(465))) {
                                cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (!cassandraRisto.ital.main._v_mporta.equals(anywheresoftware.b4a.BA.NumberToString(587))) {
                                    z = false;
                                    sMTPWrapper2.setUseSSL(z);
                                    cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (!cassandraRisto.ital.main._v_md1.equals("")) {
                                        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
                                        anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.mod1._vvvvvvvv6(ba, sMTPWrapper3, cassandraRisto.ital.main._v_md1, false);
                                    }
                                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (!cassandraRisto.ital.main._v_md2.equals("")) {
                                        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
                                        anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                        cassandraRisto.ital.mod1._vvvvvvvv6(ba2, sMTPWrapper4, cassandraRisto.ital.main._v_md2, false);
                                    }
                                    if (!str4.equals("")) {
                                        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getTo().Add(str4);
                                    }
                                    anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    sMTPWrapper5.setSubject(sb.append(cassandraRisto.ital.main._v_mdesmittente).append(" ").append(str).toString());
                                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setBody(str7);
                                    if (!str3.equals("")) {
                                        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        if (anywheresoftware.b4a.objects.streams.File.Exists(sb2.append(cassandraRisto.ital.mod1._vvvvv1).append("/fatture").toString(), str3)) {
                                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                            cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                            sMTPWrapper6.AddAttachment(sb3.append(cassandraRisto.ital.mod1._vvvvv1).append("/fatture").toString(), str3);
                                        }
                                    }
                                    cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (cassandraRisto.ital.main._v_attivafe && str3.equals("")) {
                                        anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                        cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        java.lang.String str10 = cassandraRisto.ital.mod1._vvvvvv1;
                                        cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                        sMTPWrapper7.AddAttachment(str10, cassandraRisto.ital.mod1._vvvvv0.replace(".xml", ".txt"));
                                    }
                                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Send(processBA);
                                }
                            }
                            z = true;
                            sMTPWrapper2.setUseSSL(z);
                            cassandraRisto.ital.main mainVar162 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_md1.equals("")) {
                            }
                            cassandraRisto.ital.main mainVar182 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_md2.equals("")) {
                            }
                            if (!str4.equals("")) {
                            }
                            anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper52 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            cassandraRisto.ital.main mainVar202 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            sMTPWrapper52.setSubject(sb4.append(cassandraRisto.ital.main._v_mdesmittente).append(" ").append(str).toString());
                            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setBody(str7);
                            if (!str3.equals("")) {
                            }
                            cassandraRisto.ital.main mainVar212 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe) {
                                anywheresoftware.b4a.net.SMTPWrapper sMTPWrapper72 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                                cassandraRisto.ital.mod1 mod1Var82 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                java.lang.String str102 = cassandraRisto.ital.mod1._vvvvvv1;
                                cassandraRisto.ital.mod1 mod1Var92 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                                sMTPWrapper72.AddAttachment(str102, cassandraRisto.ital.mod1._vvvvv0.replace(".xml", ".txt"));
                            }
                            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Send(processBA);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        return "";
    }

    public static int _msgboxact(java.lang.String str) throws java.lang.Exception {
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(str);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        return anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Riprova", "", "Guasta", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
    }

    public static java.lang.String _msgboxonly(java.lang.String str) throws java.lang.Exception {
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(str);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "", "", "Ok", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _oklist_click() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
        mostCurrent._pnllist.setVisible(false);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvv2(java.lang.String str) throws java.lang.Exception {
        anywheresoftware.b4a.objects.IntentWrapper intentWrapper = new anywheresoftware.b4a.objects.IntentWrapper();
        intentWrapper.Initialize("android.intent.action.VIEW", str);
        intentWrapper.SetType("application/pdf");
        intentWrapper.WrapAsIntentChooser("Choose PDF Viewer");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        anywheresoftware.b4a.keywords.Common.StartActivity(processBA, intentWrapper.getObject());
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvv6(int i, java.lang.String str, java.lang.String str2, anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper) throws java.lang.Exception {
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.objects.streams.File.Exists(cassandraRisto.ital.mod1._vvvvv1, "LogoPrg.jpg")) {
            new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.addImage(4, 688, anywheresoftware.b4a.keywords.Common.LoadBitmap(cassandraRisto.ital.mod1._vvvvv1, "LogoPrg.jpg").getObject());
        } else {
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from intestaNF order by codice"));
            if (cursorWrapper3.getRowCount() > 0) {
                int i2 = 790;
                for (int i3 = 0; i3 <= 5; i3++) {
                    cursorWrapper3.setPosition(i3);
                    if (i3 == 0) {
                        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.addText(20, i2, 11, cursorWrapper3.GetString("descrizione"));
                        i2 -= 20;
                    } else {
                        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.addText(20, i2, 9, cursorWrapper3.GetString("descrizione"));
                        i2 -= 15;
                    }
                }
            }
        }
        java.lang.String str3 = " del " + str.substring(12).trim();
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_orafatt) {
            java.lang.StringBuilder append = new java.lang.StringBuilder().append(str3).append(" ");
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetHour(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)), 2, 0)).append(":");
            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            str3 = append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetMinute(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)), 2, 0)).toString();
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(str);
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        if (!_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("")) {
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            com.rootsoft.pdfwriter.PaperSize paperSize = mostCurrent._vvvvvv0;
            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("Fattura N.").append(anywheresoftware.b4a.BA.NumberToString(i)).append("/");
            cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
            mypdfwriter.addText((int) (30940 / 100.0d), 793, 10, append3.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).append(str3).append(str2).toString());
        } else {
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            com.rootsoft.pdfwriter.PaperSize paperSize2 = mostCurrent._vvvvvv0;
            mypdfwriter2.addText((int) (30940 / 100.0d), 793, 10, "Fattura N." + anywheresoftware.b4a.BA.NumberToString(i) + str3 + str2);
        }
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize3 = mostCurrent._vvvvvv0;
        com.rootsoft.pdfwriter.PaperSize paperSize4 = mostCurrent._vvvvvv0;
        mypdfwriter3.addRectangle((int) (30345 / 100.0d), 690, (int) (26775 / 100.0d), 130);
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize5 = mostCurrent._vvvvvv0;
        mypdfwriter4.addText((int) (30940 / 100.0d), 780, 11, "Destinatario: ");
        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper.GetString("descrizione")))) {
            int i4 = 11;
            if (cursorWrapper.GetString("descrizione").length() > 30) {
                i4 = 9;
            }
            if (cursorWrapper.GetString("descrizione").length() > 40) {
                i4 = 8;
            }
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            com.rootsoft.pdfwriter.PaperSize paperSize6 = mostCurrent._vvvvvv0;
            mypdfwriter5.addText((int) (30940 / 100.0d), 760, i4, cursorWrapper.GetString("descrizione").trim());
        }
        cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper.GetString("via")))) {
            int i5 = 11;
            if (cursorWrapper.GetString("via").length() > 30) {
                i5 = 9;
            }
            if (cursorWrapper.GetString("via").length() > 40) {
                i5 = 8;
            }
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            com.rootsoft.pdfwriter.PaperSize paperSize7 = mostCurrent._vvvvvv0;
            mypdfwriter6.addText((int) (30940 / 100.0d), 740, i5, cursorWrapper.GetString("via").trim());
        }
        java.lang.String str4 = "";
        cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper.GetString("cap")))) {
            str4 = cursorWrapper.GetString("cap").trim() + " ";
        }
        cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper.GetString("citta")))) {
            str4 = str4 + cursorWrapper.GetString("citta").trim() + " ";
        }
        cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper.GetString("provincia")))) {
            str4 = str4 + cursorWrapper.GetString("provincia").trim() + " ";
        }
        cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, str4))) {
            int i6 = 11;
            if (str4.length() > 30) {
                i6 = 9;
            }
            if (str4.length() > 40) {
                i6 = 8;
            }
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            com.rootsoft.pdfwriter.PaperSize paperSize8 = mostCurrent._vvvvvv0;
            mypdfwriter7.addText((int) (30940 / 100.0d), 725, i6, str4);
        }
        cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper.GetString("piva")))) {
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            com.rootsoft.pdfwriter.PaperSize paperSize9 = mostCurrent._vvvvvv0;
            mypdfwriter8.addText((int) (30940 / 100.0d), 710, 9, "P.IVA: " + cursorWrapper.GetString("piva").trim());
        }
        cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper.GetString("codf")))) {
            com.rootsoft.pdfwriter.myPDFWriter mypdfwriter9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            com.rootsoft.pdfwriter.PaperSize paperSize10 = mostCurrent._vvvvvv0;
            mypdfwriter9.addText((int) (30940 / 100.0d), 695, 9, "C.F.: " + cursorWrapper.GetString("codf").trim());
        }
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize11 = mostCurrent._vvvvvv0;
        com.rootsoft.pdfwriter.PaperSize paperSize12 = mostCurrent._vvvvvv0;
        mypdfwriter10.addLine((int) (1785 / 100.0d), 683, (int) (1785 / 100.0d), 180);
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize13 = mostCurrent._vvvvvv0;
        mypdfwriter11.addText((int) (2380 / 100.0d), 670, 11, "Dati Documento (Scontrino o Ricevuta)");
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize14 = mostCurrent._vvvvvv0;
        com.rootsoft.pdfwriter.PaperSize paperSize15 = mostCurrent._vvvvvv0;
        mypdfwriter12.addLine((int) (44030 / 100.0d), 683, (int) (44030 / 100.0d), 180);
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize16 = mostCurrent._vvvvvv0;
        mypdfwriter13.addText((int) (44625 / 100.0d), 670, 11, "Importo");
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize17 = mostCurrent._vvvvvv0;
        com.rootsoft.pdfwriter.PaperSize paperSize18 = mostCurrent._vvvvvv0;
        mypdfwriter14.addLine((int) (52955 / 100.0d), 683, (int) (52955 / 100.0d), 180);
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize19 = mostCurrent._vvvvvv0;
        mypdfwriter15.addText((int) (53550 / 100.0d), 670, 11, "Iva");
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize20 = mostCurrent._vvvvvv0;
        com.rootsoft.pdfwriter.PaperSize paperSize21 = mostCurrent._vvvvvv0;
        mypdfwriter16.addLine((int) (1785 / 100.0d), 667, (int) (57120 / 100.0d), 667);
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize22 = mostCurrent._vvvvvv0;
        com.rootsoft.pdfwriter.PaperSize paperSize23 = mostCurrent._vvvvvv0;
        mypdfwriter17.addLine((int) (1785 / 100.0d), 683, (int) (57120 / 100.0d), 683);
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize24 = mostCurrent._vvvvvv0;
        com.rootsoft.pdfwriter.PaperSize paperSize25 = mostCurrent._vvvvvv0;
        mypdfwriter18.addLine((int) (57120 / 100.0d), 683, (int) (57120 / 100.0d), 180);
        com.rootsoft.pdfwriter.myPDFWriter mypdfwriter19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        com.rootsoft.pdfwriter.PaperSize paperSize26 = mostCurrent._vvvvvv0;
        com.rootsoft.pdfwriter.PaperSize paperSize27 = mostCurrent._vvvvvv0;
        mypdfwriter19.addLine((int) (1785 / 100.0d), 180, (int) (57120 / 100.0d), 180);
        return "";
    }

    public static java.lang.String _pdfwriter1_conversiondone(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        _vvvv6 = str;
        return "";
    }

    public static java.lang.String _pnlelencoristampa_click() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _pnllist_click() throws java.lang.Exception {
        return "";
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int i) throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub PreparaLastDataDoc(index As Int) As Boolean";
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_lastdatadocfm) {
            mostCurrent._datafattura.setTag(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("MaxData").substring(5, 7) + "/" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("MaxData").substring(8, 10) + "/" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("MaxData").substring(0, 4));
            mostCurrent._datafattura.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Data Fattura " + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("MaxData").substring(8, 10) + "/" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("MaxData").substring(5, 7) + "/" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("MaxData").substring(0, 4)));
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 >= 0 && i != _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) {
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione... fatturando questo cliente non verrà rispettata la corretta sequenza di generazione delle fatture.\nSi desidera continuare ?");
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                if (Msgbox2 != -1) {
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
                    return false;
                }
            }
        }
        return true;
    }

    public static java.lang.String _preparamailvisualizza(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (anywheresoftware.b4a.keywords.Common.Not(str.equals("") && str2.equals(""))) {
            _mail("Fattura", "Invio Fattura", str, str2);
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
        if (str.equals("")) {
            return "";
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("file://");
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        _vvvvvvvvvvvvvvvvvvvvv2(append.append(anywheresoftware.b4a.objects.streams.File.Combine(sb.append(cassandraRisto.ital.mod1._vvvvv1).append("/fatture").toString(), str)).toString());
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _printlist_click() throws java.lang.Exception {
        boolean z;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        double d;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2;
        double d2;
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione ... Per stampare il riepilogo verranno confermate le eventuali modifiche.\n Si desidera continuare ?  ");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Msgbox2 != -1) {
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from clienti where codice ='" + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli") + "'"));
        cursorWrapper4.setPosition(0);
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_fatturafmt2) {
            if (anywheresoftware.b4a.keywords.Common.Not(cursorWrapper4.GetInt("abpost") == 1 && cursorWrapper4.GetDouble("fido").doubleValue() > 0.0d)) {
                z = true;
                if (z) {
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper4.GetString("codice").trim()) + "' and fido >0")) > 0.0d) {
                    }
                }
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (");
                cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
                java.lang.StringBuilder append2 = append.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva as iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  headmov.cliente ='").append(cursorWrapper4.GetString("codice").trim()).append("' and  ");
                cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
                cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, sql.ExecQuery(append2.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).append(" group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm").toString()));
                java.lang.String str = "CausaliPagamenti.codice=2 or pagamenti.cassa=1";
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                    cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
                    str = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                }
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper6 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti inner join pagamenti on pagamenti.codice = CausaliPagamenti.codice where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (").append(str).append(")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva as iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  headmov.cliente ='").append(cursorWrapper4.GetString("codice").trim()).append("' and  ");
                cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
                anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper7 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper6, sql2.ExecQuery(append3.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.replace("FattFM=1 and", "")).append(" group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm").toString()));
                if (cursorWrapper.getRowCount() > 0) {
                    double d3 = 0.0d;
                    cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_apri(true);
                    cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("********************************", 1);
                    cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Stampa Riepilogo", 4);
                    cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("********************************", 1);
                    cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper4.GetString("descrizione")))) {
                        cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(cursorWrapper4.GetString("descrizione").trim(), 4);
                    }
                    cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper4.GetString("via")))) {
                        cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(cursorWrapper4.GetString("via").trim(), 1);
                    }
                    java.lang.String str2 = "";
                    cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper4.GetString("cap")))) {
                        str2 = cursorWrapper4.GetString("cap").trim() + " ";
                    }
                    cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper4.GetString("citta")))) {
                        str2 = str2 + cursorWrapper4.GetString("citta").trim() + " ";
                    }
                    cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper4.GetString("provincia")))) {
                        str2 = str2 + cursorWrapper4.GetString("provincia").trim() + " ";
                    }
                    cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, str2))) {
                        cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(str2, 1);
                    }
                    cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper4.GetString("piva")))) {
                        cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("P.IVA: " + cursorWrapper4.GetString("piva").trim(), 1);
                    }
                    cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                    if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, cursorWrapper4.GetString("codf")))) {
                        cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("C.F.: " + cursorWrapper4.GetString("codf").trim(), 1);
                    }
                    cassandraRisto.ital.main mainVar18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("********************************", 1);
                    cassandraRisto.ital.main mainVar21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("       Dati scontrino           ", 1);
                    cassandraRisto.ital.main mainVar24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Descrizione        Importo   Iva", 1);
                    cassandraRisto.ital.main mainVar25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("--------------------------------", 1);
                    anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper8 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                    int i = 0;
                    java.lang.String str3 = "";
                    while (true) {
                        d = d3;
                        if (i > 1) {
                            break;
                        }
                        if (i == 0) {
                            cursorWrapper2 = cursorWrapper;
                        } else {
                            cursorWrapper2 = i == 1 ? cursorWrapper7 : cursorWrapper8;
                        }
                        int rowCount = cursorWrapper2.getRowCount() - 1;
                        int i2 = 0;
                        d3 = d;
                        java.lang.String str4 = str3;
                        while (i2 <= rowCount) {
                            cursorWrapper2.setPosition(i2);
                            if (cursorWrapper2.GetDouble("tot").doubleValue() != 0.0d) {
                                java.lang.String GetString = cursorWrapper2.GetString("dataeoraffm");
                                java.lang.String GetString2 = cursorWrapper2.GetString("matricolacassap");
                                java.lang.String GetString3 = GetString == null ? cursorWrapper2.GetString("datam") : GetString;
                                if (GetString2 == null) {
                                    GetString2 = "";
                                }
                                java.lang.String str5 = "";
                                if (cursorWrapper2.GetInt("numero") > 0) {
                                    str5 = "SCO.N." + cursorWrapper2.GetString("numero") + " del " + GetString3.substring(3, 5) + "/" + GetString3.substring(0, 2) + "/" + GetString3.substring(6, 10);
                                } else if (cursorWrapper2.GetInt("Ricevuta") > 0) {
                                    java.lang.String GetString4 = cursorWrapper2.GetString("datam");
                                    str5 = "RIC.N." + cursorWrapper2.GetString("Ricevuta") + " del " + GetString4.substring(3, 5) + "/" + GetString4.substring(0, 2) + "/" + GetString4.substring(6, 10);
                                }
                                if (cursorWrapper2.GetInt("numero") > 0 && !str4.equals(GetString2)) {
                                    cassandraRisto.ital.main mainVar26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("Scontrini del MF:" + GetString2, 4);
                                }
                                cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
                                java.lang.StringBuilder append4 = new java.lang.StringBuilder().append(str5);
                                cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(cassandraRisto.ital.modfunstr._left(ba, append4.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 9)).toString(), 26L));
                                cassandraRisto.ital.modfunstr modfunstrVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                cassandraRisto.ital.modfunstr modfunstrVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                java.lang.StringBuilder append6 = new java.lang.StringBuilder().append(append5.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba2, sb.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper2.GetDouble("tot").doubleValue(), 1, 2, 2, false)).toString(), 8L)).toString()).append(" ");
                                cassandraRisto.ital.modfunstr modfunstrVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                anywheresoftware.b4a.BA ba3 = mostCurrent.activityBA;
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                cassandraRisto.ital.modfunstr modfunstrVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                                java.lang.String sb3 = append6.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba3, sb2.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 5)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper2.GetDouble("iva").doubleValue(), 1, 0, 0, false)).toString(), 5L)).toString();
                                cassandraRisto.ital.main mainVar27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(sb3, 3);
                                d2 = anywheresoftware.b4a.keywords.Common.Round2(cursorWrapper2.GetDouble("tot").doubleValue() + d3, 2);
                                str4 = GetString2;
                            } else {
                                d2 = d3;
                            }
                            i2++;
                            d3 = d2;
                        }
                        i++;
                        cursorWrapper8 = cursorWrapper2;
                        str3 = str4;
                    }
                    cassandraRisto.ital.main mainVar28 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar29 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar30 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("********************************", 1);
                    cassandraRisto.ital.main mainVar31 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.ccefdll ccefdllVar = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("TOT. DA FATTURARE");
                    cassandraRisto.ital.modfunstr modfunstrVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    anywheresoftware.b4a.BA ba4 = mostCurrent.activityBA;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    cassandraRisto.ital.modfunstr modfunstrVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                    ccefdllVar._nf_testo(append7.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba4, sb4.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, 15)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(d, 1, 2, 2, false)).toString(), 15L)).toString(), 1);
                    cassandraRisto.ital.main mainVar32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo("********************************", 1);
                    cassandraRisto.ital.main mainVar33 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar34 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar35 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar36 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_testo(" ", 1);
                    cassandraRisto.ital.main mainVar37 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.ccefdll ccefdllVar2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                    cassandraRisto.ital.main mainVar38 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    ccefdllVar2._nf_testo(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6, 1);
                    cassandraRisto.ital.main mainVar39 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._nf_chiudi();
                }
                return "";
            }
        }
        z = false;
        if (z) {
        }
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper52 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar62 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
        java.lang.StringBuilder append8 = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (");
        cassandraRisto.ital.fatturafm fatturafmVar5 = mostCurrent;
        java.lang.StringBuilder append22 = append8.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva as iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  headmov.cliente ='").append(cursorWrapper4.GetString("codice").trim()).append("' and  ");
        cassandraRisto.ital.fatturafm fatturafmVar22 = mostCurrent;
        cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper52, sql3.ExecQuery(append22.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).append(" group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm").toString()));
        java.lang.String str6 = "CausaliPagamenti.codice=2 or pagamenti.cassa=1";
        cassandraRisto.ital.main mainVar72 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
        }
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper62 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        cassandraRisto.ital.main mainVar82 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.sql.SQL sql22 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        java.lang.StringBuilder append32 = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti inner join pagamenti on pagamenti.codice = CausaliPagamenti.codice where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (").append(str6).append(")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva as iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  headmov.cliente ='").append(cursorWrapper4.GetString("codice").trim()).append("' and  ");
        cassandraRisto.ital.fatturafm fatturafmVar42 = mostCurrent;
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper72 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper62, sql22.ExecQuery(append32.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.replace("FattFM=1 and", "")).append(" group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm").toString()));
        if (cursorWrapper.getRowCount() > 0) {
        }
        return "";
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.List();
        return "";
    }

    public static java.lang.String _progressonly(boolean z, java.lang.String str) throws java.lang.Exception {
        if (z) {
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToCharSequence(str), false);
            anywheresoftware.b4a.keywords.Common.DoEvents();
            return "";
        }
        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        return "";
    }

    public static java.lang.String _ricerca_click() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub Ricerca_Click";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
        return "";
    }

    public static java.lang.String _selmovim_click() throws java.lang.Exception {
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setPosition(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("nfat");
        cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("cliente");
        cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("datam");
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = anywheresoftware.b4a.keywords.Common.Round2(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetDouble("totale").doubleValue(), 2);
        cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("Data Fattura ");
        cassandraRisto.ital.fatturafm fatturafmVar5 = mostCurrent;
        java.lang.StringBuilder append2 = append.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.substring(3, 5)).append("/");
        cassandraRisto.ital.fatturafm fatturafmVar6 = mostCurrent;
        java.lang.StringBuilder append3 = append2.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.substring(0, 2)).append("/");
        cassandraRisto.ital.fatturafm fatturafmVar7 = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = append3.append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.substring(6, 10)).toString();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Selezionata la fattura num. " + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.GetString("nfat")));
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(java.lang.String str) throws java.lang.Exception {
        if (str.contains("Tess.")) {
            return str.substring(0, str.indexOf("Tess."));
        }
        return str;
    }

    public static double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(java.lang.String str) throws java.lang.Exception {
        if (2.0d != anywheresoftware.b4a.BA.ObjectToNumber(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("EsigibilitaIVA", 0))) {
            return 0.0d;
        }
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select count(*) " + str)) <= 0.0d) {
            return 0.0d;
        }
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        return java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select sum(round(((((importo*1.00)*100)/((100+aliquota2)))/100)*((aliquota2*1.00)),4)) as Imposta " + str));
    }

    public static java.lang.String _setinclosing() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.main._v_barra;
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_attivasezionali) {
            cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = cassandraRisto.ital.main._v_barra2;
            cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "F2";
        }
        if (str.length() > 19) {
            cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
            cassandraRisto.ital.fatturafm fatturafmVar5 = mostCurrent;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.replace("yyyy", str.substring(19));
            return "";
        }
        return "";
    }

    public static java.lang.String _smtp_messagesent(boolean z) throws java.lang.Exception {
        if (z) {
            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Mail inviata correttamente"), true);
        } else {
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Errore durante l'invio della Mail\n\n" + anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        return "";
    }

    public static void _stampa(boolean z) throws java.lang.Exception {
        new cassandraRisto.ital.fatturafm.ResumableSub_stampa(null, z).resume(processBA, null);
    }

    public static class ResumableSub_stampa extends anywheresoftware.b4a.BA.ResumableSub {
        boolean _recall;
        int limit102;
        int limit152;
        int limit215;
        int limit242;
        int limit285;
        cassandraRisto.ital.fatturafm parent;
        int step102;
        int step152;
        int step215;
        int step242;
        int step285;
        java.lang.String _tmpeiva = "";
        java.lang.String _mtdata = "";
        java.lang.String _mtdatafe = "";
        java.lang.String _mtdatatext = "";
        anywheresoftware.b4a.objects.collections.Map _mexport = null;
        java.lang.String _stestofatt = "";
        anywheresoftware.b4a.sql.SQL.CursorWrapper _cursanagcli = null;
        int _nfattura = 0;
        boolean _bclienteita = false;
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
        anywheresoftware.b4a.objects.collections.Map _result = null;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _cursvend = null;
        java.lang.String _swhere = "";
        boolean _bfattfmt2 = false;
        java.lang.String _tmpivaq = "";
        cassandraRisto.ital.modalmline _mml = null;
        java.lang.String _tmptf = "";
        double _totscoinfatt = 0.0d;
        int _x = 0;
        anywheresoftware.b4a.keywords.StringBuilderWrapper _tmpfattura = null;
        java.lang.String _sdatafatt = "";
        java.lang.String _stestocliente = "";
        java.lang.String[] _scolumn2 = null;
        int _xxxx = 0;
        java.lang.String _stf = "";
        anywheresoftware.b4a.sql.SQL.CursorWrapper _tmpcc = null;
        java.lang.String _mlastmatr = "";
        java.lang.String _mdate = "";
        java.lang.String _mmatr = "";
        java.lang.String _mdettsco = "";
        anywheresoftware.b4a.sql.SQL.CursorWrapper _tmpr = null;
        java.lang.String _s3 = "";
        int _xx = 0;
        double _mimpo = 0.0d;
        double _mmqta = 0.0d;
        double _tmpimposta = 0.0d;
        double _imposta = 0.0d;
        java.lang.String _s4 = "";
        java.lang.String _tmpes = "";
        boolean _bexportxml = false;
        anywheresoftware.b4a.objects.collections.List _listofmapsf = null;
        java.lang.String _tmpfn = "";
        java.lang.String _tmppar = "";
        java.lang.String _stmpmail = "";

        public ResumableSub_stampa(cassandraRisto.ital.fatturafm fatturafmVar, boolean z) {
            this.parent = fatturafmVar;
            this._recall = z;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            boolean z;
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            cassandraRisto.ital.fatturafm fatturafmVar = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvv0 = "Sub stampa(recall As Boolean)";
                            break;
                        case 1:
                            this.state = 353;
                            this.catchState = 352;
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            this.catchState = 352;
                            this._tmpeiva = "I";
                            cassandraRisto.ital.fatturafm fatturafmVar2 = this.parent;
                            this._mtdata = anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._datafattura.getTag());
                            this._mtdatafe = "";
                            cassandraRisto.ital.fatturafm fatturafmVar3 = this.parent;
                            this._mtdatatext = cassandraRisto.ital.fatturafm.mostCurrent._datafattura.getText();
                            this._mexport = new anywheresoftware.b4a.objects.collections.Map();
                            this._stestofatt = "";
                            this._cursanagcli = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar4 = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("select valore from progressivi where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar5 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar6 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._nfattura = (int) java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
                            this._bclienteita = true;
                            break;
                        case 4:
                            this.state = 9;
                            if (this._recall) {
                                this.state = 6;
                                break;
                            } else {
                                this.state = 8;
                                break;
                            }
                        case 6:
                            this.state = 9;
                            cassandraRisto.ital.fatturafm fatturafmVar7 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar8 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._mtdata = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            cassandraRisto.ital.fatturafm fatturafmVar9 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar10 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._mtdatatext = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            cassandraRisto.ital.fatturafm fatturafmVar11 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar12 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._nfattura = (int) java.lang.Double.parseDouble(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar13 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Select * from clienti where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar14 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar15 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._cursanagcli = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, sql2.ExecQuery(append2.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
                            this._cursanagcli.setPosition(0);
                            cassandraRisto.ital.fatturafm fatturafmVar16 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("Select count(*) from FEdatiCli where NazioneCli='IT' and Codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar17 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar18 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._bclienteita = java.lang.Double.parseDouble(sql3.ExecQuerySingleResult(append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append("'").toString())) > 0.0d;
                            break;
                        case 8:
                            this.state = 9;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar19 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Select * from clienti where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar20 = this.parent;
                            this._cursanagcli = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, sql4.ExecQuery(append4.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli")).append("'").toString()));
                            this._cursanagcli.setPosition(0);
                            cassandraRisto.ital.fatturafm fatturafmVar21 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql5 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("Select count(*) from FEdatiCli where NazioneCli='IT' and Codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar22 = this.parent;
                            this._bclienteita = java.lang.Double.parseDouble(sql5.ExecQuerySingleResult(append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli"))).append("'").toString())) > 0.0d;
                            break;
                        case 9:
                            this.state = 48;
                            cassandraRisto.ital.fatturafm fatturafmVar23 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                this.state = 11;
                                break;
                            }
                        case 11:
                            this.state = 12;
                            this._mtdatafe = this._mtdata.substring(6) + "-" + this._mtdata.substring(0, 2) + "-" + this._mtdata.substring(3, 5);
                            cassandraRisto.ital.fatturafm fatturafmVar24 = this.parent;
                            cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
                            cassandraRisto.ital.fatturafm fatturafmVar25 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
                            break;
                        case 12:
                            this.state = 21;
                            this.state = 14;
                            break;
                        case 14:
                            this.state = 15;
                            this._rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            java.lang.String trim = this._cursanagcli.GetString("codice").trim();
                            boolean z2 = this._recall;
                            int i = this._nfattura;
                            cassandraRisto.ital.fatturafm fatturafmVar26 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar27 = cassandraRisto.ital.fatturafm.mostCurrent;
                            java.lang.String str = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            java.lang.StringBuilder append6 = new java.lang.StringBuilder().append(" where  FattFM=1 and  headmov.cliente = '").append(this._cursanagcli.GetString("codice").trim()).append("' and ");
                            cassandraRisto.ital.fatturafm fatturafmVar28 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar29 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._rs = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(trim, z2, i, true, str, append6.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).toString());
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.fatturafm.processBA, this, this._rs);
                            this.state = 354;
                            return;
                        case 15:
                            this.state = 20;
                            cassandraRisto.ital.fatturafm fatturafmVar30 = this.parent;
                            if (cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 && this._result.IsInitialized()) {
                                this.state = 17;
                                break;
                            } else {
                                this.state = 19;
                                break;
                            }
                        case 17:
                            this.state = 20;
                            cassandraRisto.ital.fatturafm fatturafmVar31 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = this._result;
                            break;
                        case 19:
                            this.state = 20;
                            this.state = 21;
                            break;
                        case 20:
                            this.state = 12;
                            break;
                        case 21:
                            this.state = 32;
                            if (anywheresoftware.b4a.keywords.Common.Not(this._result.IsInitialized())) {
                                this.state = 23;
                                break;
                            } else {
                                this.state = 25;
                                break;
                            }
                        case 23:
                            this.state = 32;
                            return;
                        case 25:
                            this.state = 26;
                            cassandraRisto.ital.fatturafm fatturafmVar32 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = this._result;
                            break;
                        case 26:
                            this.state = 31;
                            cassandraRisto.ital.fatturafm fatturafmVar33 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                cassandraRisto.ital.fatturafm fatturafmVar34 = this.parent;
                                if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getSize() == 0) {
                                    this.state = 28;
                                    break;
                                }
                            }
                            this.state = 30;
                            break;
                        case 28:
                            this.state = 31;
                            cassandraRisto.ital.fatturafm fatturafmVar35 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) anywheresoftware.b4a.keywords.Common.Null);
                            break;
                        case 30:
                            this.state = 31;
                            cassandraRisto.ital.fatturafm fatturafmVar36 = this.parent;
                            cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = true;
                            break;
                        case 31:
                            this.state = 32;
                            break;
                        case 32:
                            this.state = 37;
                            cassandraRisto.ital.fatturafm fatturafmVar37 = this.parent;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized())) {
                                break;
                            } else {
                                this.state = 34;
                                break;
                            }
                        case 34:
                            this.state = 37;
                            return;
                        case 37:
                            this.state = 38;
                            cassandraRisto.ital.fatturafm fatturafmVar38 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = true;
                            break;
                        case 38:
                            this.state = 41;
                            cassandraRisto.ital.fatturafm fatturafmVar39 = this.parent;
                            if (!cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Memo", "").equals("")) {
                                this.state = 40;
                                break;
                            } else {
                                break;
                            }
                        case 40:
                            this.state = 41;
                            cassandraRisto.ital.fatturafm fatturafmVar40 = this.parent;
                            this._stestofatt = anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Memo", ""));
                            break;
                        case 41:
                            this.state = 42;
                            cassandraRisto.ital.fatturafm fatturafmVar41 = this.parent;
                            cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0.0d;
                            break;
                        case 42:
                            this.state = 47;
                            cassandraRisto.ital.fatturafm fatturafmVar42 = this.parent;
                            if (2.0d != anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("EsigibilitaIVA", 0))) {
                                cassandraRisto.ital.fatturafm fatturafmVar43 = this.parent;
                                if (1.0d != anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("EsigibilitaIVA", 0))) {
                                    break;
                                } else {
                                    this.state = 46;
                                    break;
                                }
                            } else {
                                this.state = 44;
                                break;
                            }
                        case 44:
                            this.state = 47;
                            this._tmpeiva = "S";
                            break;
                        case 46:
                            this.state = 47;
                            this._tmpeiva = "D";
                            break;
                        case 47:
                            this.state = 48;
                            cassandraRisto.ital.fatturafm fatturafmVar44 = this.parent;
                            cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            cassandraRisto.ital.fatturafm fatturafmVar45 = this.parent;
                            ccefdllVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Copie", 0));
                            break;
                        case 48:
                            this.state = 51;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                                break;
                            } else {
                                this.state = 50;
                                break;
                            }
                        case 50:
                            this.state = 51;
                            cassandraRisto.ital.fatturafm fatturafmVar46 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql6 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("update headmov set nfat_fm = ").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).append(",sezionale='");
                            cassandraRisto.ital.fatturafm fatturafmVar47 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar48 = cassandraRisto.ital.fatturafm.mostCurrent;
                            java.lang.StringBuilder append8 = append7.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).append("',datfat_fm = '").append(this._mtdata).append("' where (select count(*) from CausaliPagamenti where CausaliPagamenti.nmov= headmov.nmov And (");
                            cassandraRisto.ital.fatturafm fatturafmVar49 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar50 = cassandraRisto.ital.fatturafm.mostCurrent;
                            java.lang.StringBuilder append9 = append8.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("))>0 And  FattFM=1 And  cliente = '");
                            cassandraRisto.ital.fatturafm fatturafmVar51 = this.parent;
                            java.lang.StringBuilder append10 = append9.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli").trim()).append("' and ");
                            cassandraRisto.ital.fatturafm fatturafmVar52 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar53 = cassandraRisto.ital.fatturafm.mostCurrent;
                            sql6.ExecNonQuery(append10.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).toString());
                            cassandraRisto.ital.fatturafm fatturafmVar54 = this.parent;
                            cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append11 = new java.lang.StringBuilder().append("update  progressivi set valore = ").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura + 1)).append("  where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar55 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar56 = cassandraRisto.ital.fatturafm.mostCurrent;
                            sql7.ExecNonQuery(append11.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString());
                            break;
                        case 51:
                            this.state = 54;
                            cassandraRisto.ital.fatturafm fatturafmVar57 = this.parent;
                            cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                cassandraRisto.ital.fatturafm fatturafmVar58 = this.parent;
                                if (!cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                    break;
                                } else {
                                    cassandraRisto.ital.fatturafm fatturafmVar59 = this.parent;
                                    if (2.0d != anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("EsigibilitaIVA", 0))) {
                                        break;
                                    } else {
                                        this.state = 53;
                                        break;
                                    }
                                }
                            }
                        case 53:
                            this.state = 54;
                            cassandraRisto.ital.fatturafm fatturafmVar60 = this.parent;
                            cassandraRisto.ital.main mainVar14 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(" from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "'");
                            break;
                        case 54:
                            this.state = 55;
                            this._cursvend = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            this._swhere = "where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm";
                            cassandraRisto.ital.fatturafm fatturafmVar61 = this.parent;
                            cassandraRisto.ital.main mainVar15 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_fatturafmt2) {
                                if (anywheresoftware.b4a.keywords.Common.Not(this._cursanagcli.GetInt("abpost") == 1 && this._cursanagcli.GetDouble("fido").doubleValue() > 0.0d)) {
                                    z = true;
                                    this._bfattfmt2 = z;
                                    break;
                                }
                            }
                            z = false;
                            this._bfattfmt2 = z;
                            break;
                        case 55:
                            this.state = 64;
                            if (!this._bfattfmt2) {
                                break;
                            } else {
                                this.state = 57;
                                break;
                            }
                        case 57:
                            this.state = 58;
                            break;
                        case 58:
                            this.state = 63;
                            cassandraRisto.ital.fatturafm fatturafmVar62 = this.parent;
                            cassandraRisto.ital.main mainVar16 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._cursanagcli.GetString("codice").trim()) + "' and fido >0")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 60;
                                break;
                            }
                        case 60:
                            this.state = 63;
                            this._bfattfmt2 = false;
                            break;
                        case 63:
                            this.state = 64;
                            break;
                        case 64:
                            this.state = 75;
                            if (anywheresoftware.b4a.keywords.Common.Not(this._bfattfmt2)) {
                                this.state = 66;
                                break;
                            } else {
                                this.state = 68;
                                break;
                            }
                        case 66:
                            this.state = 75;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar63 = this.parent;
                            cassandraRisto.ital.main mainVar17 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql8 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.StringBuilder append12 = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (");
                            cassandraRisto.ital.fatturafm fatturafmVar64 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar65 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._cursvend = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, sql8.ExecQuery(append12.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='").append(this._cursanagcli.GetString("codice").trim()).append("' and nfat_fm =").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).append(" and datfat_fm = '").append(this._mtdata).append("' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm").toString()));
                            break;
                        case 68:
                            this.state = 69;
                            this._tmpivaq = ",venduto.iva";
                            break;
                        case 69:
                            this.state = 74;
                            cassandraRisto.ital.fatturafm fatturafmVar66 = this.parent;
                            cassandraRisto.ital.main mainVar18 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                this.state = 71;
                                break;
                            }
                        case 71:
                            this.state = 74;
                            this._tmpivaq = "";
                            break;
                        case 74:
                            this.state = 75;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar67 = this.parent;
                            cassandraRisto.ital.main mainVar19 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._cursvend = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper4, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select sum(importo) as tot, headmov.nric as Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where headmov.nfat=0 And  FattFM=1 And  venduto.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap " + this._tmpivaq + "  order by dataeoraffm"));
                            break;
                        case 75:
                            this.state = 350;
                            if (this._cursvend.getRowCount() <= 0) {
                                break;
                            } else {
                                this.state = 77;
                                break;
                            }
                        case 77:
                            this.state = 78;
                            break;
                        case 78:
                            this.state = 98;
                            cassandraRisto.ital.fatturafm fatturafmVar68 = this.parent;
                            cassandraRisto.ital.main mainVar20 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_attivafe)) {
                                break;
                            } else {
                                this.state = 80;
                                break;
                            }
                        case 80:
                            this.state = 81;
                            this._mml = new cassandraRisto.ital.modalmline();
                            cassandraRisto.ital.modalmline modalmlineVar = this._mml;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            cassandraRisto.ital.fatturafm fatturafmVar69 = this.parent;
                            modalmlineVar._initialize(ba2, "FatturaFM", 28, cassandraRisto.ital.fatturafm.mostCurrent._activity);
                            cassandraRisto.ital.modalmline modalmlineVar2 = this._mml;
                            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                            int RGB = anywheresoftware.b4a.keywords.constants.Colors.RGB(150, 150, 150);
                            anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                            int RGB2 = anywheresoftware.b4a.keywords.constants.Colors.RGB(150, 150, 150);
                            anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
                            modalmlineVar2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(RGB, RGB2, -256);
                            this._tmptf = "";
                            break;
                        case 81:
                            this.state = 94;
                            if (this._recall) {
                                this.state = 83;
                                break;
                            } else if (!this._cursanagcli.GetString("codice").trim().equals("")) {
                                this.state = 89;
                                break;
                            } else {
                                break;
                            }
                        case 83:
                            this.state = 84;
                            break;
                        case 84:
                            this.state = 87;
                            cassandraRisto.ital.fatturafm fatturafmVar70 = this.parent;
                            cassandraRisto.ital.main mainVar21 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + "'")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 86;
                                break;
                            }
                        case 86:
                            this.state = 87;
                            cassandraRisto.ital.fatturafm fatturafmVar71 = this.parent;
                            cassandraRisto.ital.main mainVar22 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select testo from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + "'");
                            break;
                        case 87:
                            this.state = 94;
                            break;
                        case 89:
                            this.state = 90;
                            break;
                        case 90:
                            this.state = 93;
                            cassandraRisto.ital.fatturafm fatturafmVar72 = this.parent;
                            cassandraRisto.ital.main mainVar23 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" + this._cursanagcli.GetString("codice").trim() + "'")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 92;
                                break;
                            }
                        case 92:
                            this.state = 93;
                            cassandraRisto.ital.fatturafm fatturafmVar73 = this.parent;
                            cassandraRisto.ital.main mainVar24 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select testo from TestiCli where codice='" + this._cursanagcli.GetString("codice").trim() + "'");
                            break;
                        case 93:
                            this.state = 94;
                            break;
                        case 94:
                            this.state = 97;
                            if (!this._tmptf.equals("")) {
                                break;
                            } else {
                                cassandraRisto.ital.fatturafm fatturafmVar74 = this.parent;
                                cassandraRisto.ital.main mainVar25 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'")) <= 0.0d) {
                                    break;
                                } else {
                                    this.state = 96;
                                    break;
                                }
                            }
                        case 96:
                            this.state = 97;
                            cassandraRisto.ital.fatturafm fatturafmVar75 = this.parent;
                            cassandraRisto.ital.main mainVar26 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'");
                            break;
                        case 97:
                            this.state = 98;
                            this._stestofatt = this._mml._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("Testo aggiuntivo Fattura", "Aggiungi un testo", "", this._tmptf);
                            break;
                        case 98:
                            this.state = 99;
                            cassandraRisto.ital.fatturafm fatturafmVar76 = this.parent;
                            cassandraRisto.ital.main mainVar27 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._totscoinfatt = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select case when sum(scov) is null then 0 else sum(scov) end  from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "'"));
                            cassandraRisto.ital.fatturafm fatturafmVar77 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Clear();
                            break;
                        case 99:
                            this.state = 102;
                            this.step102 = 1;
                            this.limit102 = 30;
                            this._x = 0;
                            this.state = 355;
                            break;
                        case 101:
                            this.state = 356;
                            cassandraRisto.ital.fatturafm fatturafmVar78 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Add(0);
                            break;
                        case 102:
                            this.state = 107;
                            if (this._recall) {
                                this.state = 104;
                                break;
                            } else {
                                this.state = 106;
                                break;
                            }
                        case 104:
                            this.state = 107;
                            cassandraRisto.ital.fatturafm fatturafmVar79 = this.parent;
                            cassandraRisto.ital.main mainVar28 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            cassandraRisto.ital.fatturafm fatturafmVar80 = this.parent;
                            ccefdllVar2._ft_apri((int) anywheresoftware.b4a.keywords.Common.Round2(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 * 100.0d, 0));
                            break;
                        case 106:
                            this.state = 107;
                            cassandraRisto.ital.fatturafm fatturafmVar81 = this.parent;
                            cassandraRisto.ital.main mainVar29 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            cassandraRisto.ital.fatturafm fatturafmVar82 = this.parent;
                            ccefdllVar3._ft_apri((int) anywheresoftware.b4a.keywords.Common.Round2(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue() * 100.0d, 0));
                            break;
                        case 107:
                            this.state = 116;
                            cassandraRisto.ital.fatturafm fatturafmVar83 = this.parent;
                            cassandraRisto.ital.main mainVar30 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe) {
                                this.state = 109;
                                break;
                            } else {
                                this.state = 115;
                                break;
                            }
                        case 109:
                            this.state = 110;
                            cassandraRisto.ital.fatturafm fatturafmVar84 = this.parent;
                            cassandraRisto.ital.main mainVar31 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("-- COPIA DI CORTESIA -------------------------------", 4);
                            break;
                        case 110:
                            this.state = 113;
                            if (!this._bclienteita) {
                                break;
                            } else {
                                this.state = 112;
                                break;
                            }
                        case 112:
                            this.state = 113;
                            cassandraRisto.ital.fatturafm fatturafmVar85 = this.parent;
                            cassandraRisto.ital.main mainVar32 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Non valida ai fini fiscali.", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar86 = this.parent;
                            cassandraRisto.ital.main mainVar33 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("La fattura verra' resa disponibile ", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar87 = this.parent;
                            cassandraRisto.ital.main mainVar34 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("mediante Sistema di Interscambio.", 1);
                            break;
                        case 113:
                            this.state = 116;
                            cassandraRisto.ital.fatturafm fatturafmVar88 = this.parent;
                            cassandraRisto.ital.main mainVar35 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            break;
                        case 115:
                            this.state = 116;
                            cassandraRisto.ital.fatturafm fatturafmVar89 = this.parent;
                            cassandraRisto.ital.main mainVar36 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("********************************", 1);
                            break;
                        case 116:
                            this.state = 117;
                            this._tmpfattura = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
                            this._tmpfattura.Initialize();
                            this._sdatafatt = "";
                            this._sdatafatt = "del " + this._mtdatatext.substring(12);
                            break;
                        case 117:
                            this.state = 122;
                            cassandraRisto.ital.fatturafm fatturafmVar90 = this.parent;
                            cassandraRisto.ital.main mainVar37 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_orafatt) {
                                break;
                            } else {
                                this.state = 119;
                                break;
                            }
                        case 119:
                            this.state = 122;
                            java.lang.StringBuilder append13 = new java.lang.StringBuilder().append(this._sdatafatt).append(" ");
                            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.fatturafm fatturafmVar91 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append14 = append13.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetHour(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA)), 2, 0)).append(":");
                            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.fatturafm fatturafmVar92 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            this._sdatafatt = append14.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetMinute(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA)), 2, 0)).toString();
                            break;
                        case 122:
                            this.state = 123;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(this._mtdatatext);
                            break;
                        case 123:
                            this.state = 134;
                            cassandraRisto.ital.fatturafm fatturafmVar93 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar94 = cassandraRisto.ital.fatturafm.mostCurrent;
                            if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("")) {
                                this.state = 125;
                                break;
                            } else {
                                this.state = 127;
                                break;
                            }
                        case 125:
                            this.state = 134;
                            cassandraRisto.ital.fatturafm fatturafmVar95 = this.parent;
                            cassandraRisto.ital.main mainVar38 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder append15 = new java.lang.StringBuilder().append("Fattura N.").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).append(" /");
                            cassandraRisto.ital.fatturafm fatturafmVar96 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar97 = cassandraRisto.ital.fatturafm.mostCurrent;
                            ccefdllVar4._ft_testo(append15.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).toString(), 1);
                            cassandraRisto.ital.fatturafm fatturafmVar98 = this.parent;
                            cassandraRisto.ital.main mainVar39 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._sdatafatt.trim(), 1);
                            break;
                        case 127:
                            this.state = 128;
                            break;
                        case 128:
                            this.state = 133;
                            cassandraRisto.ital.fatturafm fatturafmVar99 = this.parent;
                            cassandraRisto.ital.main mainVar40 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_orafatt) {
                                this.state = 130;
                                break;
                            } else {
                                this.state = 132;
                                break;
                            }
                        case 130:
                            this.state = 133;
                            cassandraRisto.ital.fatturafm fatturafmVar100 = this.parent;
                            cassandraRisto.ital.main mainVar41 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Fattura N." + anywheresoftware.b4a.BA.NumberToString(this._nfattura), 1);
                            cassandraRisto.ital.fatturafm fatturafmVar101 = this.parent;
                            cassandraRisto.ital.main mainVar42 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._sdatafatt.trim(), 1);
                            break;
                        case 132:
                            this.state = 133;
                            cassandraRisto.ital.fatturafm fatturafmVar102 = this.parent;
                            cassandraRisto.ital.main mainVar43 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Fattura N." + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " " + this._sdatafatt, 1);
                            break;
                        case 133:
                            this.state = 134;
                            break;
                        case 134:
                            this.state = 139;
                            cassandraRisto.ital.fatturafm fatturafmVar103 = this.parent;
                            cassandraRisto.ital.main mainVar44 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe) {
                                this.state = 136;
                                break;
                            } else {
                                this.state = 138;
                                break;
                            }
                        case 136:
                            this.state = 139;
                            cassandraRisto.ital.fatturafm fatturafmVar104 = this.parent;
                            cassandraRisto.ital.main mainVar45 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar105 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            cassandraRisto.ital.ckprinter ckprinterVar = (cassandraRisto.ital.ckprinter) anywheresoftware.b4a.keywords.Common.Null;
                            cassandraRisto.ital.fatturafm fatturafmVar106 = this.parent;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv1(ba3, ckprinterVar, anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("TipoDocumento", "")));
                            cassandraRisto.ital.fatturafm fatturafmVar107 = this.parent;
                            cassandraRisto.ital.main mainVar46 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar108 = this.parent;
                            cassandraRisto.ital.main mainVar47 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("-- CESSIONARIO ---------------------------", 4);
                            break;
                        case 138:
                            this.state = 139;
                            cassandraRisto.ital.fatturafm fatturafmVar109 = this.parent;
                            cassandraRisto.ital.main mainVar48 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("********************************", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar110 = this.parent;
                            cassandraRisto.ital.main mainVar49 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Destinatario", 1);
                            break;
                        case 139:
                            this.state = 150;
                            cassandraRisto.ital.fatturafm fatturafmVar111 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("descrizione")))) {
                                break;
                            } else {
                                this.state = 141;
                                break;
                            }
                        case 141:
                            this.state = 142;
                            this._stestocliente = this._cursanagcli.GetString("descrizione");
                            cassandraRisto.ital.fatturafm fatturafmVar112 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            this._stestocliente = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv7(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._stestocliente, 32, "");
                            this._scolumn2 = new java.lang.String[0];
                            java.util.Arrays.fill(this._scolumn2, "");
                            anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                            this._scolumn2 = anywheresoftware.b4a.keywords.Regex.Split("\n", this._stestocliente);
                            break;
                        case 142:
                            this.state = 149;
                            this.step152 = 1;
                            this.limit152 = this._scolumn2.length - 1;
                            this._xxxx = 0;
                            this.state = 357;
                            break;
                        case 144:
                            this.state = 145;
                            break;
                        case 145:
                            this.state = 148;
                            if (!this._scolumn2[this._xxxx].equals("")) {
                                this.state = 147;
                                break;
                            } else {
                                break;
                            }
                        case 147:
                            this.state = 148;
                            cassandraRisto.ital.fatturafm fatturafmVar113 = this.parent;
                            cassandraRisto.ital.main mainVar50 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._scolumn2[this._xxxx].trim(), 4);
                            break;
                        case 148:
                            this.state = 358;
                            break;
                        case 149:
                            this.state = 150;
                            break;
                        case 150:
                            this.state = 155;
                            cassandraRisto.ital.fatturafm fatturafmVar114 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("via")))) {
                                break;
                            } else {
                                this.state = 152;
                                break;
                            }
                        case 152:
                            this.state = 155;
                            cassandraRisto.ital.fatturafm fatturafmVar115 = this.parent;
                            cassandraRisto.ital.main mainVar51 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._cursanagcli.GetString("via").trim(), 1);
                            break;
                        case 155:
                            this.state = 156;
                            this._stf = "";
                            break;
                        case 156:
                            this.state = 161;
                            cassandraRisto.ital.fatturafm fatturafmVar116 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("cap")))) {
                                break;
                            } else {
                                this.state = 158;
                                break;
                            }
                        case 158:
                            this.state = 161;
                            this._stf = this._cursanagcli.GetString("cap").trim() + " ";
                            break;
                        case 161:
                            this.state = 162;
                            break;
                        case 162:
                            this.state = 167;
                            cassandraRisto.ital.fatturafm fatturafmVar117 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("citta")))) {
                                break;
                            } else {
                                this.state = 164;
                                break;
                            }
                        case 164:
                            this.state = 167;
                            this._stf += this._cursanagcli.GetString("citta").trim() + " ";
                            break;
                        case 167:
                            this.state = 168;
                            break;
                        case 168:
                            this.state = 173;
                            cassandraRisto.ital.fatturafm fatturafmVar118 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("provincia")))) {
                                break;
                            } else {
                                this.state = 170;
                                break;
                            }
                        case 170:
                            this.state = 173;
                            this._stf += this._cursanagcli.GetString("provincia").trim() + " ";
                            break;
                        case 173:
                            this.state = 174;
                            break;
                        case 174:
                            this.state = 179;
                            cassandraRisto.ital.fatturafm fatturafmVar119 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var11 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._stf))) {
                                break;
                            } else {
                                this.state = 176;
                                break;
                            }
                        case 176:
                            this.state = 179;
                            cassandraRisto.ital.fatturafm fatturafmVar120 = this.parent;
                            cassandraRisto.ital.main mainVar52 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._stf, 1);
                            break;
                        case 179:
                            this.state = 180;
                            break;
                        case 180:
                            this.state = 185;
                            cassandraRisto.ital.fatturafm fatturafmVar121 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var12 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("piva")))) {
                                break;
                            } else {
                                this.state = 182;
                                break;
                            }
                        case 182:
                            this.state = 185;
                            cassandraRisto.ital.fatturafm fatturafmVar122 = this.parent;
                            cassandraRisto.ital.main mainVar53 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("P.IVA: " + this._cursanagcli.GetString("piva").trim(), 1);
                            break;
                        case 185:
                            this.state = 186;
                            break;
                        case 186:
                            this.state = 191;
                            cassandraRisto.ital.fatturafm fatturafmVar123 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var13 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("codf")))) {
                                break;
                            } else {
                                this.state = 188;
                                break;
                            }
                        case 188:
                            this.state = 191;
                            cassandraRisto.ital.fatturafm fatturafmVar124 = this.parent;
                            cassandraRisto.ital.main mainVar54 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("C.F.: " + this._cursanagcli.GetString("codf").trim(), 1);
                            break;
                        case 191:
                            this.state = 192;
                            break;
                        case 192:
                            this.state = 233;
                            cassandraRisto.ital.fatturafm fatturafmVar125 = this.parent;
                            cassandraRisto.ital.main mainVar55 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                this.state = 194;
                                break;
                            }
                        case 194:
                            this.state = 195;
                            break;
                        case 195:
                            this.state = 232;
                            cassandraRisto.ital.fatturafm fatturafmVar126 = this.parent;
                            cassandraRisto.ital.main mainVar56 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from FEdatiCli where codice ='" + this._cursanagcli.GetString("codice") + "'")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 197;
                                break;
                            }
                        case 197:
                            this.state = 198;
                            this._tmpcc = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar127 = this.parent;
                            cassandraRisto.ital.main mainVar57 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmpcc = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select * from FEdatiCli where codice ='" + this._cursanagcli.GetString("codice") + "'"));
                            break;
                        case 198:
                            this.state = 231;
                            if (this._tmpcc.getRowCount() <= 0) {
                                break;
                            } else {
                                this.state = 200;
                                break;
                            }
                        case 200:
                            this.state = 201;
                            this._tmpcc.setPosition(0);
                            break;
                        case 201:
                            this.state = 206;
                            cassandraRisto.ital.fatturafm fatturafmVar128 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var14 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("NomeCli")))) {
                                break;
                            } else {
                                this.state = 203;
                                break;
                            }
                        case 203:
                            this.state = 206;
                            cassandraRisto.ital.fatturafm fatturafmVar129 = this.parent;
                            cassandraRisto.ital.main mainVar58 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Nome: " + this._tmpcc.GetString("NomeCli").trim(), 1);
                            break;
                        case 206:
                            this.state = 207;
                            break;
                        case 207:
                            this.state = 212;
                            cassandraRisto.ital.fatturafm fatturafmVar130 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var15 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("CognomeCli")))) {
                                break;
                            } else {
                                this.state = 209;
                                break;
                            }
                        case 209:
                            this.state = 212;
                            cassandraRisto.ital.fatturafm fatturafmVar131 = this.parent;
                            cassandraRisto.ital.main mainVar59 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Cognome: " + this._tmpcc.GetString("CognomeCli").trim(), 1);
                            break;
                        case 212:
                            this.state = 213;
                            break;
                        case 213:
                            this.state = 218;
                            cassandraRisto.ital.fatturafm fatturafmVar132 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var16 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("NazioneCli"))) && !this._tmpcc.GetString("NazioneCli").equals("IT")) {
                                this.state = 215;
                                break;
                            }
                            break;
                        case 215:
                            this.state = 218;
                            cassandraRisto.ital.fatturafm fatturafmVar133 = this.parent;
                            cassandraRisto.ital.main mainVar60 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Nazione: " + this._tmpcc.GetString("NazioneCli").trim(), 1);
                            break;
                        case 218:
                            this.state = 219;
                            break;
                        case 219:
                            this.state = 224;
                            cassandraRisto.ital.fatturafm fatturafmVar134 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var17 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("CodiceDestinatario")))) {
                                break;
                            } else {
                                this.state = 221;
                                break;
                            }
                        case 221:
                            this.state = 224;
                            cassandraRisto.ital.fatturafm fatturafmVar135 = this.parent;
                            cassandraRisto.ital.main mainVar61 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Codice Destinatario: " + this._tmpcc.GetString("CodiceDestinatario").trim(), 1);
                            break;
                        case 224:
                            this.state = 225;
                            break;
                        case 225:
                            this.state = 230;
                            cassandraRisto.ital.fatturafm fatturafmVar136 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var18 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("PEC")))) {
                                break;
                            } else {
                                this.state = 227;
                                break;
                            }
                        case 227:
                            this.state = 230;
                            cassandraRisto.ital.fatturafm fatturafmVar137 = this.parent;
                            cassandraRisto.ital.main mainVar62 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("PEC: " + this._tmpcc.GetString("PEC").trim(), 1);
                            break;
                        case 230:
                            this.state = 231;
                            break;
                        case 231:
                            this.state = 232;
                            this._tmpcc.Close();
                            break;
                        case 232:
                            this.state = 233;
                            break;
                        case 233:
                            this.state = 234;
                            cassandraRisto.ital.fatturafm fatturafmVar138 = this.parent;
                            cassandraRisto.ital.main mainVar63 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            break;
                        case 234:
                            this.state = 239;
                            cassandraRisto.ital.fatturafm fatturafmVar139 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                this.state = 236;
                                break;
                            } else {
                                this.state = 238;
                                break;
                            }
                        case 236:
                            this.state = 239;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5((anywheresoftware.b4a.keywords.StringBuilderWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.StringBuilderWrapper(), (java.lang.StringBuilder) anywheresoftware.b4a.keywords.Common.Null));
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(this._stestofatt, this._nfattura, this._tmpfattura, "stampaF");
                            cassandraRisto.ital.fatturafm fatturafmVar140 = this.parent;
                            cassandraRisto.ital.main mainVar64 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar141 = this.parent;
                            cassandraRisto.ital.main mainVar65 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("-- RIGHE ---------------------------------", 4);
                            break;
                        case 238:
                            this.state = 239;
                            cassandraRisto.ital.fatturafm fatturafmVar142 = this.parent;
                            cassandraRisto.ital.main mainVar66 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("********************************", 1);
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(this._stestofatt, this._nfattura, this._tmpfattura, "stampaF");
                            cassandraRisto.ital.fatturafm fatturafmVar143 = this.parent;
                            cassandraRisto.ital.main mainVar67 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar144 = this.parent;
                            cassandraRisto.ital.main mainVar68 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            break;
                        case 239:
                            this.state = 240;
                            cassandraRisto.ital.fatturafm fatturafmVar145 = this.parent;
                            cassandraRisto.ital.main mainVar69 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("       Dati scontrino           ", 1);
                            break;
                        case 240:
                            this.state = 247;
                            if (this._bfattfmt2) {
                                cassandraRisto.ital.fatturafm fatturafmVar146 = this.parent;
                                cassandraRisto.ital.main mainVar70 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_attivafe) {
                                    this.state = 242;
                                    break;
                                }
                            }
                            if (anywheresoftware.b4a.keywords.Common.Not(this._bfattfmt2)) {
                                cassandraRisto.ital.fatturafm fatturafmVar147 = this.parent;
                                cassandraRisto.ital.main mainVar71 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_attivafe) {
                                    this.state = 244;
                                    break;
                                }
                            }
                            this.state = 246;
                            break;
                        case 242:
                            this.state = 247;
                            cassandraRisto.ital.fatturafm fatturafmVar148 = this.parent;
                            cassandraRisto.ital.main mainVar72 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("          Descrizione ", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar149 = this.parent;
                            cassandraRisto.ital.main mainVar73 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" IVA Prz.Unit      Qta Imponibile Importo", 3);
                            cassandraRisto.ital.fatturafm fatturafmVar150 = this.parent;
                            cassandraRisto.ital.main mainVar74 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("-----------------------------------------", 1);
                            break;
                        case 244:
                            this.state = 247;
                            cassandraRisto.ital.fatturafm fatturafmVar151 = this.parent;
                            cassandraRisto.ital.main mainVar75 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Descrizione                Importo    Iva", 3);
                            cassandraRisto.ital.fatturafm fatturafmVar152 = this.parent;
                            cassandraRisto.ital.main mainVar76 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("-----------------------------------------", 1);
                            break;
                        case 246:
                            this.state = 247;
                            cassandraRisto.ital.fatturafm fatturafmVar153 = this.parent;
                            cassandraRisto.ital.main mainVar77 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Descrizione        Importo   Iva", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar154 = this.parent;
                            cassandraRisto.ital.main mainVar78 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("--------------------------------", 1);
                            break;
                        case 247:
                            this.state = 248;
                            this._mlastmatr = "";
                            break;
                        case 248:
                            this.state = 251;
                            cassandraRisto.ital.fatturafm fatturafmVar155 = this.parent;
                            cassandraRisto.ital.main mainVar79 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivaterminale && anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                                this.state = 250;
                                break;
                            }
                            break;
                        case 250:
                            this.state = 251;
                            this._mexport.Initialize();
                            anywheresoftware.b4a.objects.collections.Map map = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar156 = this.parent;
                            map.Put("cliente", cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli"));
                            anywheresoftware.b4a.objects.collections.Map map2 = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar157 = this.parent;
                            map2.Put("totale", cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("totale"));
                            anywheresoftware.b4a.objects.collections.Map map3 = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar158 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var19 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.fatturafm fatturafmVar159 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var20 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append16 = sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA))).append(" ");
                            anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.fatturafm fatturafmVar160 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var21 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            map3.Put("datam", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba4, append16.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA))).toString()));
                            this._mexport.Put("numero", java.lang.Integer.valueOf(this._nfattura));
                            this._mexport.Put("dataFatt", this._mtdatatext.substring(12));
                            anywheresoftware.b4a.objects.collections.Map map4 = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar161 = this.parent;
                            cassandraRisto.ital.main mainVar80 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            map4.Put("negozio", cassandraRisto.ital.main._v_nnegozio);
                            anywheresoftware.b4a.objects.collections.Map map5 = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar162 = this.parent;
                            cassandraRisto.ital.main mainVar81 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            map5.Put("cassa", cassandraRisto.ital.main._v_numcassa);
                            break;
                        case 251:
                            this.state = 307;
                            this.step215 = 1;
                            this.limit215 = this._cursvend.getRowCount() - 1;
                            this._x = 0;
                            this.state = 359;
                            break;
                        case 253:
                            this.state = 254;
                            this._cursvend.setPosition(this._x);
                            break;
                        case 254:
                            this.state = 306;
                            if (this._cursvend.GetDouble("tot").doubleValue() == 0.0d) {
                                break;
                            } else {
                                this.state = 256;
                                break;
                            }
                        case 256:
                            this.state = 257;
                            this._mdate = this._cursvend.GetString("dataeoraffm");
                            this._mmatr = this._cursvend.GetString("matricolacassap");
                            break;
                        case 257:
                            this.state = 262;
                            if (this._mdate != null) {
                                break;
                            } else {
                                this.state = 259;
                                break;
                            }
                        case 259:
                            this.state = 262;
                            this._mdate = this._cursvend.GetString("datam");
                            break;
                        case 262:
                            this.state = 263;
                            break;
                        case 263:
                            this.state = 268;
                            if (this._mmatr != null) {
                                break;
                            } else {
                                this.state = 265;
                                break;
                            }
                        case 265:
                            this.state = 268;
                            this._mmatr = "";
                            break;
                        case 268:
                            this.state = 269;
                            this._mdettsco = "";
                            break;
                        case 269:
                            this.state = 274;
                            if (this._cursvend.GetInt("numero") > 0) {
                                this.state = 271;
                                break;
                            } else if (this._cursvend.GetInt("Ricevuta") <= 0) {
                                break;
                            } else {
                                this.state = 273;
                                break;
                            }
                        case 271:
                            this.state = 274;
                            this._mdettsco = "SC." + cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(this._cursvend) + " del " + this._mdate.substring(3, 5) + "/" + this._mdate.substring(0, 2) + "/" + this._mdate.substring(6, 10);
                            break;
                        case 273:
                            this.state = 274;
                            this._mdate = this._cursvend.GetString("datam");
                            this._mdettsco = "RIC.N." + this._cursvend.GetString("Ricevuta") + " del " + this._mdate.substring(3, 5) + "/" + this._mdate.substring(0, 2) + "/" + this._mdate.substring(6, 10);
                            break;
                        case 274:
                            this.state = 277;
                            if (this._cursvend.GetInt("numero") > 0 && !this._mlastmatr.equals(this._mmatr)) {
                                this.state = 276;
                                break;
                            }
                            break;
                        case 276:
                            this.state = 277;
                            cassandraRisto.ital.fatturafm fatturafmVar163 = this.parent;
                            cassandraRisto.ital.main mainVar82 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("Scontrini del MF:" + this._mmatr, 2);
                            break;
                        case 277:
                            this.state = 278;
                            this._mlastmatr = this._mmatr;
                            break;
                        case 278:
                            this.state = 305;
                            if (this._bfattfmt2) {
                                cassandraRisto.ital.fatturafm fatturafmVar164 = this.parent;
                                cassandraRisto.ital.main mainVar83 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_attivafe && (this._cursvend.GetInt("numero") > 0 || this._cursvend.GetInt("Ricevuta") > 0)) {
                                    this.state = 280;
                                    break;
                                }
                            }
                            this.state = 304;
                            break;
                        case 280:
                            this.state = 281;
                            this._tmpr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            break;
                        case 281:
                            this.state = 286;
                            if (this._cursvend.GetInt("numero") > 0) {
                                this.state = 283;
                                break;
                            } else if (this._cursvend.GetInt("Ricevuta") <= 0) {
                                break;
                            } else {
                                this.state = 285;
                                break;
                            }
                        case 283:
                            this.state = 286;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper6 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar165 = this.parent;
                            cassandraRisto.ital.main mainVar84 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmpr = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper6, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select venduto.descrizione, iva,prezzov,venduto.qta,venduto.importo from venduto inner join headmov on venduto.nmov = headmov.nmov inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov where CausaliPagamenti.codice=2 And  headmov.nfat=0 And  FattFM=1 And  nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " And datfat_fm = '" + this._mtdata + "' and headmov.dataeoraffm='" + this._cursvend.GetString("dataeoraffm") + "' and headmov.nscontrinoffm=" + this._cursvend.GetString("numero") + " and headmov.nChiusura=" + this._cursvend.GetString("nChiusura")));
                            break;
                        case 285:
                            this.state = 286;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper7 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar166 = this.parent;
                            cassandraRisto.ital.main mainVar85 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmpr = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper7, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select venduto.descrizione, iva,prezzov,venduto.qta,venduto.importo from venduto inner join headmov on venduto.nmov = headmov.nmov inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov where CausaliPagamenti.codice=2 And  headmov.nfat=0 And  FattFM=1 And  nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " And datfat_fm = '" + this._mtdata + "' and headmov.nric=" + this._cursvend.GetString("Ricevuta")));
                            break;
                        case 286:
                            this.state = 287;
                            this._s3 = "";
                            cassandraRisto.ital.fatturafm fatturafmVar167 = this.parent;
                            cassandraRisto.ital.main mainVar86 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._mdettsco, 2);
                            break;
                        case 287:
                            this.state = 296;
                            this.step242 = 1;
                            this.limit242 = this._tmpr.getRowCount() - 1;
                            this._xx = 0;
                            this.state = 361;
                            break;
                        case 289:
                            this.state = 290;
                            this._tmpr.setPosition(this._xx);
                            this._mimpo = this._tmpr.GetDouble("importo").doubleValue();
                            this._mmqta = this._tmpr.GetDouble("qta").doubleValue();
                            this._s3 = "";
                            cassandraRisto.ital.fatturafm fatturafmVar168 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(this._tmpr.GetInt("iva"));
                            this._s3 = "  ";
                            this._s3 += " " + this._tmpr.GetString("iva");
                            java.lang.StringBuilder append17 = new java.lang.StringBuilder().append(this._s3).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar169 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar170 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append17.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba5, sb2.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._mimpo / this._mmqta, 1, 2, 2, false)).toString(), 8L)).toString();
                            break;
                        case 290:
                            this.state = 295;
                            if ((this._mmqta * 1000.0d) % 1000.0d == 0.0d) {
                                this.state = 292;
                                break;
                            } else {
                                this.state = 294;
                                break;
                            }
                        case 292:
                            this.state = 295;
                            java.lang.StringBuilder append18 = new java.lang.StringBuilder().append(this._s3).append("  ");
                            cassandraRisto.ital.fatturafm fatturafmVar171 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar172 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append18.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba6, sb3.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 7)).append(anywheresoftware.b4a.keywords.Common.NumberFormat(this._mmqta, 1, 0)).toString(), 7L)).toString();
                            break;
                        case 294:
                            this.state = 295;
                            java.lang.StringBuilder append19 = new java.lang.StringBuilder().append(this._s3).append("  ");
                            cassandraRisto.ital.fatturafm fatturafmVar173 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba7 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar174 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append19.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba7, sb4.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 7)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._mmqta, 1, 3, 3, false)).toString(), 7L)).toString();
                            break;
                        case 295:
                            this.state = 362;
                            this._tmpimposta = anywheresoftware.b4a.keywords.Common.Round2(this._mimpo, 4);
                            double d = this._tmpimposta;
                            double d2 = this._tmpimposta;
                            cassandraRisto.ital.fatturafm fatturafmVar175 = this.parent;
                            this._tmpimposta = d - (d2 / (1.0d + (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue() / 100.0d)));
                            java.lang.StringBuilder append20 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar176 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar7 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba8 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar177 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar8 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append20.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba8, sb5.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 9)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._mimpo - this._tmpimposta, 1, 4, 4, false)).toString(), 9L)).toString();
                            java.lang.StringBuilder append21 = new java.lang.StringBuilder().append(this._s3).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar178 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba9 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar179 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar10 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append21.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba9, sb6.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 9)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._mimpo, 1, 2, 2, false)).toString(), 9L)).toString();
                            cassandraRisto.ital.fatturafm fatturafmVar180 = this.parent;
                            cassandraRisto.ital.main mainVar87 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._tmpr.GetString("descrizione"), 1);
                            cassandraRisto.ital.fatturafm fatturafmVar181 = this.parent;
                            cassandraRisto.ital.main mainVar88 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._s3, 3);
                            cassandraRisto.ital.fatturafm fatturafmVar182 = this.parent;
                            anywheresoftware.b4a.objects.collections.List list = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            int GetInt = this._tmpr.GetInt("iva");
                            cassandraRisto.ital.fatturafm fatturafmVar183 = this.parent;
                            list.Set(GetInt, java.lang.Double.valueOf(anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._tmpr.GetInt("iva"))) + this._mimpo));
                            break;
                        case 296:
                            this.state = 297;
                            cassandraRisto.ital.fatturafm fatturafmVar184 = this.parent;
                            cassandraRisto.ital.main mainVar89 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("...........................................", 1);
                            break;
                        case 297:
                            this.state = 302;
                            if (!this._tmpr.IsInitialized()) {
                                break;
                            } else {
                                this.state = 299;
                                break;
                            }
                        case 299:
                            this.state = 302;
                            this._tmpr.Close();
                            break;
                        case 302:
                            this.state = 305;
                            break;
                        case 304:
                            this.state = 305;
                            this._s3 = "";
                            cassandraRisto.ital.fatturafm fatturafmVar185 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar11 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba10 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder append22 = new java.lang.StringBuilder().append(this._mdettsco);
                            cassandraRisto.ital.fatturafm fatturafmVar186 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar12 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = cassandraRisto.ital.modfunstr._left(ba10, append22.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 9)).toString(), 26L);
                            java.lang.StringBuilder append23 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar187 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar13 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba11 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar188 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar14 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append23.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba11, sb7.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._cursvend.GetDouble("tot").doubleValue(), 1, 2, 2, false)).toString(), 8L)).toString();
                            java.lang.StringBuilder append24 = new java.lang.StringBuilder().append(this._s3).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar189 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar15 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba12 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar190 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar16 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append24.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba12, sb8.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 5)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._cursvend.GetDouble("iva").doubleValue(), 1, 0, 0, false)).toString(), 5L)).toString();
                            cassandraRisto.ital.fatturafm fatturafmVar191 = this.parent;
                            cassandraRisto.ital.main mainVar90 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._s3, 3);
                            cassandraRisto.ital.fatturafm fatturafmVar192 = this.parent;
                            anywheresoftware.b4a.objects.collections.List list2 = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            int GetInt2 = this._cursvend.GetInt("iva");
                            cassandraRisto.ital.fatturafm fatturafmVar193 = this.parent;
                            list2.Set(GetInt2, java.lang.Double.valueOf(anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._cursvend.GetInt("iva"))) + this._cursvend.GetDouble("tot").doubleValue()));
                            break;
                        case 305:
                            this.state = 306;
                            break;
                        case 306:
                            this.state = 360;
                            break;
                        case 307:
                            this.state = 308;
                            cassandraRisto.ital.fatturafm fatturafmVar194 = this.parent;
                            cassandraRisto.ital.main mainVar91 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("********************************", 1);
                            break;
                        case 308:
                            this.state = 311;
                            if (this._totscoinfatt <= 0.0d) {
                                break;
                            } else {
                                this.state = 310;
                                break;
                            }
                        case 310:
                            this.state = 311;
                            cassandraRisto.ital.fatturafm fatturafmVar195 = this.parent;
                            cassandraRisto.ital.main mainVar92 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar5 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar196 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar17 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba13 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder append25 = new java.lang.StringBuilder().append("Tot. Sconti applicati:");
                            cassandraRisto.ital.fatturafm fatturafmVar197 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar18 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append26 = sb9.append(cassandraRisto.ital.modfunstr._left(ba13, append25.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 24)).toString(), 24L));
                            cassandraRisto.ital.fatturafm fatturafmVar198 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar19 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba14 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar199 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar20 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            ccefdllVar5._ft_testo(append26.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba14, sb10.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._totscoinfatt, 1, 2, 2, false)).toString(), 8L)).toString(), 1);
                            cassandraRisto.ital.fatturafm fatturafmVar200 = this.parent;
                            cassandraRisto.ital.main mainVar93 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("********************************", 1);
                            break;
                        case 311:
                            this.state = 312;
                            cassandraRisto.ital.fatturafm fatturafmVar201 = this.parent;
                            cassandraRisto.ital.main mainVar94 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar202 = this.parent;
                            cassandraRisto.ital.main mainVar95 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("E IVA   Aliq Imponibile  Imposta", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar203 = this.parent;
                            cassandraRisto.ital.main mainVar96 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("--------------------------------", 1);
                            this._imposta = 0.0d;
                            break;
                        case 312:
                            this.state = 326;
                            this.step285 = 1;
                            this.limit285 = 9;
                            this._x = 0;
                            this.state = 363;
                            break;
                        case 314:
                            this.state = 315;
                            break;
                        case 315:
                            this.state = 325;
                            cassandraRisto.ital.fatturafm fatturafmVar204 = this.parent;
                            if (anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x)) <= 0.0d) {
                                break;
                            } else {
                                this.state = 317;
                                break;
                            }
                        case 317:
                            this.state = 318;
                            this._s4 = this._tmpeiva + " ";
                            this._s4 += " " + anywheresoftware.b4a.BA.NumberToString(this._x);
                            cassandraRisto.ital.fatturafm fatturafmVar205 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(this._x);
                            java.lang.StringBuilder append27 = new java.lang.StringBuilder().append(this._s4).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar206 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar21 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba15 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar207 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar22 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append28 = sb11.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 7));
                            cassandraRisto.ital.fatturafm fatturafmVar208 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var22 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba16 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            cassandraRisto.ital.fatturafm fatturafmVar209 = this.parent;
                            this._s4 = append27.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba15, append28.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvv5(ba16, cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue())).append(" %").toString(), 7L)).toString();
                            cassandraRisto.ital.fatturafm fatturafmVar210 = this.parent;
                            double ObjectToNumber = anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x));
                            cassandraRisto.ital.fatturafm fatturafmVar211 = this.parent;
                            double ObjectToNumber2 = anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x));
                            cassandraRisto.ital.fatturafm fatturafmVar212 = this.parent;
                            this._imposta = anywheresoftware.b4a.keywords.Common.Round2(ObjectToNumber - (ObjectToNumber2 / (1.0d + (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue() / 100.0d))), 2);
                            java.lang.StringBuilder append29 = new java.lang.StringBuilder().append(this._s4).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar213 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar23 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba17 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar214 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar24 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append30 = sb12.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 10));
                            cassandraRisto.ital.fatturafm fatturafmVar215 = this.parent;
                            this._s4 = append29.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba17, append30.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x)) - this._imposta, 1, 2, 2, false)).toString(), 10L)).toString();
                            java.lang.StringBuilder append31 = new java.lang.StringBuilder().append(this._s4).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar216 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar25 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba18 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar217 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar26 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s4 = append31.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba18, sb13.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._imposta, 1, 2, 2, false)).toString(), 8L)).toString();
                            cassandraRisto.ital.fatturafm fatturafmVar218 = this.parent;
                            cassandraRisto.ital.main mainVar97 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(this._s4, 1);
                            break;
                        case 318:
                            this.state = 321;
                            cassandraRisto.ital.fatturafm fatturafmVar219 = this.parent;
                            cassandraRisto.ital.main mainVar98 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivaterminale && anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                                this.state = 320;
                                break;
                            }
                            break;
                        case 320:
                            this.state = 321;
                            anywheresoftware.b4a.objects.collections.Map map6 = this._mexport;
                            java.lang.String str2 = "iva" + anywheresoftware.b4a.BA.NumberToString(this._x);
                            cassandraRisto.ital.fatturafm fatturafmVar220 = this.parent;
                            map6.Put(str2, cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("codice"));
                            anywheresoftware.b4a.objects.collections.Map map7 = this._mexport;
                            java.lang.String str3 = "aliquota" + anywheresoftware.b4a.BA.NumberToString(this._x);
                            cassandraRisto.ital.fatturafm fatturafmVar221 = this.parent;
                            map7.Put(str3, cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("aliquota2"));
                            anywheresoftware.b4a.objects.collections.Map map8 = this._mexport;
                            java.lang.String str4 = "imponibile" + anywheresoftware.b4a.BA.NumberToString(this._x);
                            cassandraRisto.ital.fatturafm fatturafmVar222 = this.parent;
                            map8.Put(str4, anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x)) - this._imposta, 1, 2, 2, false));
                            this._mexport.Put("imposta" + anywheresoftware.b4a.BA.NumberToString(this._x), anywheresoftware.b4a.keywords.Common.NumberFormat2(this._imposta, 1, 2, 2, false));
                            break;
                        case 321:
                            this.state = 324;
                            cassandraRisto.ital.fatturafm fatturafmVar223 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue() != 0.0d) {
                                break;
                            } else {
                                cassandraRisto.ital.fatturafm fatturafmVar224 = this.parent;
                                if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetInt("natura") <= 0) {
                                    break;
                                } else {
                                    this.state = 323;
                                    break;
                                }
                            }
                        case 323:
                            this.state = 324;
                            cassandraRisto.ital.fatturafm fatturafmVar225 = this.parent;
                            cassandraRisto.ital.main mainVar99 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql9 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append32 = new java.lang.StringBuilder().append("select descrizione from FEnaturaIVA where codice = ");
                            cassandraRisto.ital.fatturafm fatturafmVar226 = this.parent;
                            this._tmpes = sql9.ExecQuerySingleResult(append32.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("natura")).toString());
                            cassandraRisto.ital.fatturafm fatturafmVar227 = this.parent;
                            cassandraRisto.ital.main mainVar100 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.ccefdll ccefdllVar6 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                            java.lang.StringBuilder append33 = new java.lang.StringBuilder().append("   ");
                            cassandraRisto.ital.fatturafm fatturafmVar228 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var23 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append34 = append33.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvv5(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpes)).append(" - ");
                            cassandraRisto.ital.fatturafm fatturafmVar229 = this.parent;
                            ccefdllVar6._ft_testo(append34.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("descrizione")).toString(), 1);
                            break;
                        case 324:
                            this.state = 325;
                            break;
                        case 325:
                            this.state = 364;
                            break;
                        case 326:
                            this.state = 327;
                            cassandraRisto.ital.fatturafm fatturafmVar230 = this.parent;
                            cassandraRisto.ital.main mainVar101 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("================================", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar231 = this.parent;
                            cassandraRisto.ital.main mainVar102 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(" ", 1);
                            cassandraRisto.ital.fatturafm fatturafmVar232 = this.parent;
                            cassandraRisto.ital.main mainVar103 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_chiudi();
                            break;
                        case 327:
                            this.state = 332;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                                break;
                            } else {
                                cassandraRisto.ital.fatturafm fatturafmVar233 = this.parent;
                                cassandraRisto.ital.main mainVar104 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (!cassandraRisto.ital.main._v_attivaterminale) {
                                    break;
                                } else {
                                    this.state = 329;
                                    break;
                                }
                            }
                        case 329:
                            this.state = 332;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(this._mexport);
                            break;
                        case 332:
                            this.state = 333;
                            this._bexportxml = true;
                            break;
                        case 333:
                            this.state = 336;
                            cassandraRisto.ital.fatturafm fatturafmVar234 = this.parent;
                            cassandraRisto.ital.main mainVar105 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe && this._recall) {
                                this.state = 335;
                                break;
                            }
                            break;
                        case 335:
                            this.state = 336;
                            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Si desidera anche rigenerare il file xml ?");
                            cassandraRisto.ital.fatturafm fatturafmVar235 = this.parent;
                            cassandraRisto.ital.main mainVar106 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.fatturafm fatturafmVar236 = this.parent;
                            cassandraRisto.ital.main mainVar107 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                            this._bexportxml = Msgbox2 == -1;
                            break;
                        case 336:
                            this.state = 349;
                            cassandraRisto.ital.fatturafm fatturafmVar237 = this.parent;
                            cassandraRisto.ital.main mainVar108 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe && this._bexportxml) {
                                this.state = 338;
                                break;
                            }
                            break;
                        case 338:
                            this.state = 339;
                            this._listofmapsf = new anywheresoftware.b4a.objects.collections.List();
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(this._swhere, this._bfattfmt2);
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(this._mtdatatext);
                            cassandraRisto.ital.fatturafm fatturafmVar238 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var24 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba19 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.String str5 = this._mtdatafe;
                            int i2 = this._nfattura;
                            cassandraRisto.ital.fatturafm fatturafmVar239 = this.parent;
                            anywheresoftware.b4a.objects.collections.Map map9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.String trim2 = this._cursanagcli.GetString("codice").trim();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper8 = this._cursanagcli;
                            java.lang.String str6 = " h.nfat=0 and  FattFM=1 and h.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "'";
                            anywheresoftware.b4a.objects.collections.List list3 = this._listofmapsf;
                            cassandraRisto.ital.fatturafm fatturafmVar240 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar241 = cassandraRisto.ital.fatturafm.mostCurrent;
                            java.lang.String str7 = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.fatturafm fatturafmVar242 = this.parent;
                            this._tmpfn = cassandraRisto.ital.mod1._vvvvvvvv4(ba19, str5, i2, map9, trim2, cursorWrapper8, str6, true, list3, true, str7, cassandraRisto.ital.fatturafm.mostCurrent._activity);
                            break;
                        case 339:
                            this.state = 348;
                            if (!this._tmpfn.equals("")) {
                                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                                java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                                if (!anywheresoftware.b4a.objects.streams.File.Exists(sb14.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/FE").toString(), this._tmpfn)) {
                                    break;
                                } else {
                                    cassandraRisto.ital.fatturafm fatturafmVar243 = this.parent;
                                    cassandraRisto.ital.main mainVar109 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (!cassandraRisto.ital.main._v_inviofe) {
                                        break;
                                    } else {
                                        this.state = 341;
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        case 341:
                            this.state = 342;
                            this._tmppar = "Fattura Num." + anywheresoftware.b4a.BA.NumberToString(this._nfattura);
                            break;
                        case 342:
                            this.state = 347;
                            cassandraRisto.ital.fatturafm fatturafmVar244 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar245 = cassandraRisto.ital.fatturafm.mostCurrent;
                            if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("")) {
                                this.state = 344;
                                break;
                            } else {
                                this.state = 346;
                                break;
                            }
                        case 344:
                            this.state = 347;
                            java.lang.StringBuilder append35 = new java.lang.StringBuilder().append("Fattura N.").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).append("/");
                            cassandraRisto.ital.fatturafm fatturafmVar246 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar247 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._tmppar = append35.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).toString();
                            break;
                        case 346:
                            this.state = 347;
                            this._tmppar = "Fattura N." + anywheresoftware.b4a.BA.NumberToString(this._nfattura);
                            break;
                        case 347:
                            this.state = 348;
                            this._tmppar += this._sdatafatt;
                            anywheresoftware.b4a.BA ba20 = cassandraRisto.ital.fatturafm.processBA;
                            cassandraRisto.ital.fatturafm fatturafmVar248 = this.parent;
                            cassandraRisto.ital.httpclient httpclientVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba20, cassandraRisto.ital.httpclient.getObject(), "ComunicaConInviaFE", "http://127.0.0.1:12512/R__INVIO__" + this._tmpfn + "__", this._tmppar);
                            cassandraRisto.ital.fatturafm fatturafmVar249 = this.parent;
                            this._stmpmail = anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Mail", ""));
                            cassandraRisto.ital.fatturafm._preparamailvisualizza("", this._stmpmail);
                            break;
                        case 348:
                            this.state = 349;
                            break;
                        case 349:
                            this.state = 350;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            break;
                        case 350:
                            this.state = 353;
                            break;
                        case 352:
                            this.state = 353;
                            this.catchState = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar250 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var25 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.fatturafm.mostCurrent.activityBA).getMessage());
                            break;
                        case 353:
                            this.state = -1;
                            this.catchState = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar251 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
                            cassandraRisto.ital.fatturafm fatturafmVar252 = this.parent;
                            cassandraRisto.ital.main mainVar110 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0.0d;
                            break;
                        case 354:
                            this.state = 15;
                            this._result = (anywheresoftware.b4a.objects.collections.Map) objArr[0];
                            break;
                        case 355:
                            this.state = 102;
                            if ((this.step102 > 0 && this._x <= this.limit102) || (this.step102 < 0 && this._x >= this.limit102)) {
                                this.state = 101;
                                break;
                            }
                            break;
                        case 356:
                            this.state = 355;
                            this._x = this._x + 0 + this.step102;
                            break;
                        case 357:
                            this.state = 149;
                            if ((this.step152 > 0 && this._xxxx <= this.limit152) || (this.step152 < 0 && this._xxxx >= this.limit152)) {
                                this.state = 144;
                                break;
                            }
                            break;
                        case 358:
                            this.state = 357;
                            this._xxxx = this._xxxx + 0 + this.step152;
                            break;
                        case 359:
                            this.state = 307;
                            if ((this.step215 > 0 && this._x <= this.limit215) || (this.step215 < 0 && this._x >= this.limit215)) {
                                this.state = 253;
                                break;
                            }
                            break;
                        case 360:
                            this.state = 359;
                            this._x = this._x + 0 + this.step215;
                            break;
                        case 361:
                            this.state = 296;
                            if ((this.step242 > 0 && this._xx <= this.limit242) || (this.step242 < 0 && this._xx >= this.limit242)) {
                                this.state = 289;
                                break;
                            }
                            break;
                        case 362:
                            this.state = 361;
                            this._xx = this._xx + 0 + this.step242;
                            break;
                        case 363:
                            this.state = 326;
                            if ((this.step285 > 0 && this._x <= this.limit285) || (this.step285 < 0 && this._x >= this.limit285)) {
                                this.state = 314;
                                break;
                            }
                            break;
                        case 364:
                            this.state = 363;
                            this._x = this._x + 0 + this.step285;
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.fatturafm.processBA.setLastException(e);
                }
            }
        }
    }

    public static void _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(boolean z) throws java.lang.Exception {
        new cassandraRisto.ital.fatturafm.ResumableSub_stampaNF(null, z).resume(processBA, null);
    }

    public static class ResumableSub_stampaNF extends anywheresoftware.b4a.BA.ResumableSub {
        boolean _recall;
        int limit130;
        int limit187;
        int limit214;
        int limit263;
        int limit99;
        cassandraRisto.ital.fatturafm parent;
        int step130;
        int step187;
        int step214;
        int step263;
        int step99;
        java.lang.String _tmpeiva = "";
        anywheresoftware.b4a.objects.collections.Map _mexport = null;
        java.lang.String _mtdata = "";
        java.lang.String _mtdatafe = "";
        java.lang.String _mtdatatext = "";
        java.lang.String _stestofatt = "";
        anywheresoftware.b4a.sql.SQL.CursorWrapper _cursanagcli = null;
        int _nfattura = 0;
        boolean _bclienteita = false;
        anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
        anywheresoftware.b4a.objects.collections.Map _result = null;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _cursvend = null;
        java.lang.String _swhere = "";
        boolean _bfattfmt2 = false;
        java.lang.String _tmpivaq = "";
        cassandraRisto.ital.modalmline _mml = null;
        java.lang.String _tmptf = "";
        double _totscoinfatt = 0.0d;
        int _x = 0;
        anywheresoftware.b4a.keywords.StringBuilderWrapper _tmpfattura = null;
        java.lang.String _sdatafatt = "";
        java.lang.String _stestocliente = "";
        java.lang.String[] _scolumn2 = null;
        int _xxxx = 0;
        java.lang.String _stf = "";
        anywheresoftware.b4a.sql.SQL.CursorWrapper _tmpcc = null;
        java.lang.String _mlastmatr = "";
        java.lang.String _mdate = "";
        java.lang.String _mmatr = "";
        java.lang.String _mdettsco = "";
        anywheresoftware.b4a.sql.SQL.CursorWrapper _tmpr = null;
        java.lang.String _s3 = "";
        int _xx = 0;
        double _mimpo = 0.0d;
        double _mmqta = 0.0d;
        double _tmpimposta = 0.0d;
        double _imposta = 0.0d;
        java.lang.String _s4 = "";
        int _ncopie = 0;
        boolean _bexportxml = false;
        anywheresoftware.b4a.objects.collections.List _listofmapsf = null;
        java.lang.String _tmpfn = "";
        java.lang.String _tmppar = "";
        java.lang.String _stmpmail = "";

        public ResumableSub_stampaNF(cassandraRisto.ital.fatturafm fatturafmVar, boolean z) {
            this.parent = fatturafmVar;
            this._recall = z;
        }

        @Override // anywheresoftware.b4a.BA.ResumableSub
        public void resume(anywheresoftware.b4a.BA ba, java.lang.Object[] objArr) throws java.lang.Exception {
            boolean z;
            while (true) {
                try {
                    switch (this.state) {
                        case -1:
                            return;
                        case 0:
                            this.state = 1;
                            break;
                        case 1:
                            this.state = 370;
                            this.catchState = 369;
                            this.state = 3;
                            break;
                        case 3:
                            this.state = 4;
                            this.catchState = 369;
                            this._tmpeiva = "I";
                            this._mexport = new anywheresoftware.b4a.objects.collections.Map();
                            cassandraRisto.ital.fatturafm fatturafmVar = this.parent;
                            this._mtdata = anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._datafattura.getTag());
                            this._mtdatafe = "";
                            cassandraRisto.ital.fatturafm fatturafmVar2 = this.parent;
                            this._mtdatatext = cassandraRisto.ital.fatturafm.mostCurrent._datafattura.getText();
                            this._stestofatt = "";
                            this._cursanagcli = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar3 = this.parent;
                            cassandraRisto.ital.main mainVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append = new java.lang.StringBuilder().append("select valore from progressivi where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar4 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar5 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._nfattura = (int) java.lang.Double.parseDouble(sql.ExecQuerySingleResult(append.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
                            this._bclienteita = true;
                            break;
                        case 4:
                            this.state = 9;
                            if (this._recall) {
                                this.state = 6;
                                break;
                            } else {
                                this.state = 8;
                                break;
                            }
                        case 6:
                            this.state = 9;
                            cassandraRisto.ital.fatturafm fatturafmVar6 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar7 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._mtdata = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            cassandraRisto.ital.fatturafm fatturafmVar8 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar9 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._mtdatatext = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            cassandraRisto.ital.fatturafm fatturafmVar10 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar11 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._nfattura = (int) java.lang.Double.parseDouble(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar12 = this.parent;
                            cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append2 = new java.lang.StringBuilder().append("Select * from clienti where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar13 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar14 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._cursanagcli = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, sql2.ExecQuery(append2.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString()));
                            this._cursanagcli.setPosition(0);
                            cassandraRisto.ital.fatturafm fatturafmVar15 = this.parent;
                            cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append("Select count(*) from FEdatiCli where NazioneCli='IT' and Codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar16 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar17 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._bclienteita = java.lang.Double.parseDouble(sql3.ExecQuerySingleResult(append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append("'").toString())) > 0.0d;
                            break;
                        case 8:
                            this.state = 9;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar18 = this.parent;
                            cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql4 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append4 = new java.lang.StringBuilder().append("Select * from clienti where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar19 = this.parent;
                            this._cursanagcli = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, sql4.ExecQuery(append4.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli")).append("'").toString()));
                            this._cursanagcli.setPosition(0);
                            cassandraRisto.ital.fatturafm fatturafmVar20 = this.parent;
                            cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql5 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("Select count(*) from FEdatiCli where NazioneCli='IT' and Codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar21 = this.parent;
                            this._bclienteita = java.lang.Double.parseDouble(sql5.ExecQuerySingleResult(append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli"))).append("'").toString())) > 0.0d;
                            break;
                        case 9:
                            this.state = 48;
                            cassandraRisto.ital.fatturafm fatturafmVar22 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                this.state = 11;
                                break;
                            }
                        case 11:
                            this.state = 12;
                            cassandraRisto.ital.fatturafm fatturafmVar23 = this.parent;
                            cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
                            this._mtdatafe = this._mtdata.substring(6) + "-" + this._mtdata.substring(0, 2) + "-" + this._mtdata.substring(3, 5);
                            cassandraRisto.ital.fatturafm fatturafmVar24 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
                            break;
                        case 12:
                            this.state = 21;
                            this.state = 14;
                            break;
                        case 14:
                            this.state = 15;
                            this._rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
                            java.lang.String trim = this._cursanagcli.GetString("codice").trim();
                            boolean z2 = this._recall;
                            int i = this._nfattura;
                            cassandraRisto.ital.fatturafm fatturafmVar25 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar26 = cassandraRisto.ital.fatturafm.mostCurrent;
                            java.lang.String str = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            java.lang.StringBuilder append6 = new java.lang.StringBuilder().append(" where  FattFM=1 and  headmov.cliente = '").append(this._cursanagcli.GetString("codice").trim()).append("' and ");
                            cassandraRisto.ital.fatturafm fatturafmVar27 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar28 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._rs = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(trim, z2, i, true, str, append6.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).toString());
                            anywheresoftware.b4a.keywords.Common.WaitFor("complete", cassandraRisto.ital.fatturafm.processBA, this, this._rs);
                            this.state = 371;
                            return;
                        case 15:
                            this.state = 20;
                            cassandraRisto.ital.fatturafm fatturafmVar29 = this.parent;
                            if (cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 && this._result.IsInitialized()) {
                                this.state = 17;
                                break;
                            } else {
                                this.state = 19;
                                break;
                            }
                        case 17:
                            this.state = 20;
                            cassandraRisto.ital.fatturafm fatturafmVar30 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = this._result;
                            break;
                        case 19:
                            this.state = 20;
                            this.state = 21;
                            break;
                        case 20:
                            this.state = 12;
                            break;
                        case 21:
                            this.state = 32;
                            if (anywheresoftware.b4a.keywords.Common.Not(this._result.IsInitialized())) {
                                this.state = 23;
                                break;
                            } else {
                                this.state = 25;
                                break;
                            }
                        case 23:
                            this.state = 32;
                            return;
                        case 25:
                            this.state = 26;
                            cassandraRisto.ital.fatturafm fatturafmVar31 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = this._result;
                            break;
                        case 26:
                            this.state = 31;
                            cassandraRisto.ital.fatturafm fatturafmVar32 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                cassandraRisto.ital.fatturafm fatturafmVar33 = this.parent;
                                if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getSize() == 0) {
                                    this.state = 28;
                                    break;
                                }
                            }
                            this.state = 30;
                            break;
                        case 28:
                            this.state = 31;
                            cassandraRisto.ital.fatturafm fatturafmVar34 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) anywheresoftware.b4a.keywords.Common.Null);
                            break;
                        case 30:
                            this.state = 31;
                            cassandraRisto.ital.fatturafm fatturafmVar35 = this.parent;
                            cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = true;
                            break;
                        case 31:
                            this.state = 32;
                            break;
                        case 32:
                            this.state = 37;
                            cassandraRisto.ital.fatturafm fatturafmVar36 = this.parent;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized())) {
                                break;
                            } else {
                                this.state = 34;
                                break;
                            }
                        case 34:
                            this.state = 37;
                            return;
                        case 37:
                            this.state = 38;
                            cassandraRisto.ital.fatturafm fatturafmVar37 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = true;
                            break;
                        case 38:
                            this.state = 41;
                            cassandraRisto.ital.fatturafm fatturafmVar38 = this.parent;
                            if (!cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Memo", "").equals("")) {
                                this.state = 40;
                                break;
                            } else {
                                break;
                            }
                        case 40:
                            this.state = 41;
                            cassandraRisto.ital.fatturafm fatturafmVar39 = this.parent;
                            this._stestofatt = anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Memo", ""));
                            break;
                        case 41:
                            this.state = 42;
                            cassandraRisto.ital.fatturafm fatturafmVar40 = this.parent;
                            cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0.0d;
                            break;
                        case 42:
                            this.state = 47;
                            cassandraRisto.ital.fatturafm fatturafmVar41 = this.parent;
                            if (2.0d != anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("EsigibilitaIVA", 0))) {
                                cassandraRisto.ital.fatturafm fatturafmVar42 = this.parent;
                                if (1.0d != anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("EsigibilitaIVA", 0))) {
                                    break;
                                } else {
                                    this.state = 46;
                                    break;
                                }
                            } else {
                                this.state = 44;
                                break;
                            }
                        case 44:
                            this.state = 47;
                            this._tmpeiva = "S";
                            break;
                        case 46:
                            this.state = 47;
                            this._tmpeiva = "D";
                            break;
                        case 47:
                            this.state = 48;
                            break;
                        case 48:
                            this.state = 51;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                                break;
                            } else {
                                this.state = 50;
                                break;
                            }
                        case 50:
                            this.state = 51;
                            cassandraRisto.ital.fatturafm fatturafmVar43 = this.parent;
                            cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql6 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.StringBuilder append7 = new java.lang.StringBuilder().append("update headmov set nfat_fm = ").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).append(",sezionale='");
                            cassandraRisto.ital.fatturafm fatturafmVar44 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar45 = cassandraRisto.ital.fatturafm.mostCurrent;
                            java.lang.StringBuilder append8 = append7.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).append("',datfat_fm = '").append(this._mtdata).append("' where (select count(*) from CausaliPagamenti where CausaliPagamenti.nmov= headmov.nmov And (");
                            cassandraRisto.ital.fatturafm fatturafmVar46 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar47 = cassandraRisto.ital.fatturafm.mostCurrent;
                            java.lang.StringBuilder append9 = append8.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("))>0 And  FattFM=1 And  cliente = '");
                            cassandraRisto.ital.fatturafm fatturafmVar48 = this.parent;
                            java.lang.StringBuilder append10 = append9.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli").trim()).append("' and ");
                            cassandraRisto.ital.fatturafm fatturafmVar49 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar50 = cassandraRisto.ital.fatturafm.mostCurrent;
                            sql6.ExecNonQuery(append10.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).toString());
                            break;
                        case 51:
                            this.state = 54;
                            cassandraRisto.ital.fatturafm fatturafmVar51 = this.parent;
                            cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                cassandraRisto.ital.fatturafm fatturafmVar52 = this.parent;
                                if (!cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                    break;
                                } else {
                                    cassandraRisto.ital.fatturafm fatturafmVar53 = this.parent;
                                    if (2.0d != anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("EsigibilitaIVA", 0))) {
                                        break;
                                    } else {
                                        this.state = 53;
                                        break;
                                    }
                                }
                            }
                        case 53:
                            this.state = 54;
                            cassandraRisto.ital.fatturafm fatturafmVar54 = this.parent;
                            cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(" from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "'");
                            break;
                        case 54:
                            this.state = 55;
                            this._cursvend = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            this._swhere = "where venduto.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and  nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm";
                            cassandraRisto.ital.fatturafm fatturafmVar55 = this.parent;
                            cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_fatturafmt2) {
                                if (anywheresoftware.b4a.keywords.Common.Not(this._cursanagcli.GetInt("abpost") == 1 && this._cursanagcli.GetDouble("fido").doubleValue() > 0.0d)) {
                                    z = true;
                                    this._bfattfmt2 = z;
                                    break;
                                }
                            }
                            z = false;
                            this._bfattfmt2 = z;
                            break;
                        case 55:
                            this.state = 64;
                            if (!this._bfattfmt2) {
                                break;
                            } else {
                                this.state = 57;
                                break;
                            }
                        case 57:
                            this.state = 58;
                            break;
                        case 58:
                            this.state = 63;
                            cassandraRisto.ital.fatturafm fatturafmVar56 = this.parent;
                            cassandraRisto.ital.main mainVar14 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._cursanagcli.GetString("codice").trim()) + "' and fido >0")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 60;
                                break;
                            }
                        case 60:
                            this.state = 63;
                            this._bfattfmt2 = false;
                            break;
                        case 63:
                            this.state = 64;
                            break;
                        case 64:
                            this.state = 75;
                            if (anywheresoftware.b4a.keywords.Common.Not(this._bfattfmt2)) {
                                this.state = 66;
                                break;
                            } else {
                                this.state = 68;
                                break;
                            }
                        case 66:
                            this.state = 75;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar57 = this.parent;
                            cassandraRisto.ital.main mainVar15 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.StringBuilder append11 = new java.lang.StringBuilder().append("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (");
                            cassandraRisto.ital.fatturafm fatturafmVar58 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar59 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._cursvend = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, sql7.ExecQuery(append11.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append(")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where venduto.cliente ='").append(this._cursanagcli.GetString("codice").trim()).append("' and  nfat_fm =").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).append(" and datfat_fm = '").append(this._mtdata).append("' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm").toString()));
                            break;
                        case 68:
                            this.state = 69;
                            this._tmpivaq = ",venduto.iva";
                            break;
                        case 69:
                            this.state = 74;
                            cassandraRisto.ital.fatturafm fatturafmVar60 = this.parent;
                            cassandraRisto.ital.main mainVar16 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                this.state = 71;
                                break;
                            }
                        case 71:
                            this.state = 74;
                            this._tmpivaq = "";
                            break;
                        case 74:
                            this.state = 75;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar61 = this.parent;
                            cassandraRisto.ital.main mainVar17 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._cursvend = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper4, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select sum(importo) as tot, headmov.nric as Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where venduto.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and  nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap" + this._tmpivaq + " order by dataeoraffm"));
                            break;
                        case 75:
                            this.state = 367;
                            if (this._cursvend.getRowCount() <= 0) {
                                break;
                            } else {
                                this.state = 77;
                                break;
                            }
                        case 77:
                            this.state = 78;
                            break;
                        case 78:
                            this.state = 98;
                            cassandraRisto.ital.fatturafm fatturafmVar62 = this.parent;
                            cassandraRisto.ital.main mainVar18 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_attivafe)) {
                                break;
                            } else {
                                this.state = 80;
                                break;
                            }
                        case 80:
                            this.state = 81;
                            this._mml = new cassandraRisto.ital.modalmline();
                            cassandraRisto.ital.modalmline modalmlineVar = this._mml;
                            anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            cassandraRisto.ital.fatturafm fatturafmVar63 = this.parent;
                            modalmlineVar._initialize(ba2, "FatturaFM", 28, cassandraRisto.ital.fatturafm.mostCurrent._activity);
                            cassandraRisto.ital.modalmline modalmlineVar2 = this._mml;
                            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                            int RGB = anywheresoftware.b4a.keywords.constants.Colors.RGB(150, 150, 150);
                            anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                            int RGB2 = anywheresoftware.b4a.keywords.constants.Colors.RGB(150, 150, 150);
                            anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
                            modalmlineVar2._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(RGB, RGB2, -256);
                            this._tmptf = "";
                            break;
                        case 81:
                            this.state = 94;
                            if (this._recall) {
                                this.state = 83;
                                break;
                            } else if (!this._cursanagcli.GetString("codice").trim().equals("")) {
                                this.state = 89;
                                break;
                            } else {
                                break;
                            }
                        case 83:
                            this.state = 84;
                            break;
                        case 84:
                            this.state = 87;
                            cassandraRisto.ital.fatturafm fatturafmVar64 = this.parent;
                            cassandraRisto.ital.main mainVar19 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + "'")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 86;
                                break;
                            }
                        case 86:
                            this.state = 87;
                            cassandraRisto.ital.fatturafm fatturafmVar65 = this.parent;
                            cassandraRisto.ital.main mainVar20 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select testo from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + "'");
                            break;
                        case 87:
                            this.state = 94;
                            break;
                        case 89:
                            this.state = 90;
                            break;
                        case 90:
                            this.state = 93;
                            cassandraRisto.ital.fatturafm fatturafmVar66 = this.parent;
                            cassandraRisto.ital.main mainVar21 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" + this._cursanagcli.GetString("codice").trim() + "'")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 92;
                                break;
                            }
                        case 92:
                            this.state = 93;
                            cassandraRisto.ital.fatturafm fatturafmVar67 = this.parent;
                            cassandraRisto.ital.main mainVar22 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select testo from TestiCli where codice='" + this._cursanagcli.GetString("codice").trim() + "'");
                            break;
                        case 93:
                            this.state = 94;
                            break;
                        case 94:
                            this.state = 97;
                            if (!this._tmptf.equals("")) {
                                break;
                            } else {
                                cassandraRisto.ital.fatturafm fatturafmVar68 = this.parent;
                                cassandraRisto.ital.main mainVar23 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'")) <= 0.0d) {
                                    break;
                                } else {
                                    this.state = 96;
                                    break;
                                }
                            }
                        case 96:
                            this.state = 97;
                            cassandraRisto.ital.fatturafm fatturafmVar69 = this.parent;
                            cassandraRisto.ital.main mainVar24 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'");
                            break;
                        case 97:
                            this.state = 98;
                            this._stestofatt = this._mml._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("Testo aggiuntivo Fattura", "Aggiungi un testo", "", this._tmptf);
                            break;
                        case 98:
                            this.state = 99;
                            cassandraRisto.ital.fatturafm fatturafmVar70 = this.parent;
                            cassandraRisto.ital.main mainVar25 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._totscoinfatt = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select case when sum(scov) is null then 0 else sum(scov) end  from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "'"));
                            cassandraRisto.ital.fatturafm fatturafmVar71 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Clear();
                            break;
                        case 99:
                            this.state = 102;
                            this.step99 = 1;
                            this.limit99 = 30;
                            this._x = 0;
                            this.state = 372;
                            break;
                        case 101:
                            this.state = 373;
                            cassandraRisto.ital.fatturafm fatturafmVar72 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Add(0);
                            break;
                        case 102:
                            this.state = 103;
                            this._tmpfattura = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
                            this._tmpfattura.Initialize();
                            break;
                        case 103:
                            this.state = 112;
                            cassandraRisto.ital.fatturafm fatturafmVar73 = this.parent;
                            cassandraRisto.ital.main mainVar26 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe) {
                                this.state = 105;
                                break;
                            } else {
                                this.state = 111;
                                break;
                            }
                        case 105:
                            this.state = 106;
                            this._tmpfattura.Append("-- COPIA DI CORTESIA ---------------------").Append("\n");
                            break;
                        case 106:
                            this.state = 109;
                            if (!this._bclienteita) {
                                break;
                            } else {
                                this.state = 108;
                                break;
                            }
                        case 108:
                            this.state = 109;
                            this._tmpfattura.Append("Non valida ai fini fiscali.").Append("\n");
                            this._tmpfattura.Append("La fattura verra' resa disponibile ").Append("\n");
                            this._tmpfattura.Append("mediante Sistema di Interscambio.").Append("\n").Append("\n");
                            break;
                        case 109:
                            this.state = 112;
                            break;
                        case 111:
                            this.state = 112;
                            this._tmpfattura.Append("-- DATI FATTURA --------------------------").Append("\n");
                            break;
                        case 112:
                            this.state = 113;
                            this._sdatafatt = "";
                            this._sdatafatt = " del " + this._mtdatatext.substring(12);
                            break;
                        case 113:
                            this.state = 118;
                            cassandraRisto.ital.fatturafm fatturafmVar74 = this.parent;
                            cassandraRisto.ital.main mainVar27 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_orafatt) {
                                break;
                            } else {
                                this.state = 115;
                                break;
                            }
                        case 115:
                            this.state = 118;
                            java.lang.StringBuilder append12 = new java.lang.StringBuilder().append(this._sdatafatt).append(" ");
                            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.fatturafm fatturafmVar75 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append13 = append12.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetHour(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA)), 2, 0)).append(":");
                            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.fatturafm fatturafmVar76 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            this._sdatafatt = append13.append(anywheresoftware.b4a.keywords.Common.NumberFormat(anywheresoftware.b4a.keywords.DateTime.GetMinute(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA)), 2, 0)).toString();
                            break;
                        case 118:
                            this.state = 119;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(this._mtdatatext);
                            break;
                        case 119:
                            this.state = 124;
                            cassandraRisto.ital.fatturafm fatturafmVar77 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar78 = cassandraRisto.ital.fatturafm.mostCurrent;
                            if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("")) {
                                this.state = 121;
                                break;
                            } else {
                                this.state = 123;
                                break;
                            }
                        case 121:
                            this.state = 124;
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = this._tmpfattura;
                            java.lang.StringBuilder append14 = new java.lang.StringBuilder().append("Fattura N.").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).append("/");
                            cassandraRisto.ital.fatturafm fatturafmVar79 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar80 = cassandraRisto.ital.fatturafm.mostCurrent;
                            stringBuilderWrapper.Append(append14.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).toString());
                            this._tmpfattura.Append(this._sdatafatt).Append("\n");
                            break;
                        case 123:
                            this.state = 124;
                            this._tmpfattura.Append("Fattura N." + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + this._sdatafatt).Append("\n");
                            break;
                        case 124:
                            this.state = 125;
                            this._tmpfattura.Append("-- CESSIONARIO ---------------------------\n");
                            break;
                        case 125:
                            this.state = 136;
                            cassandraRisto.ital.fatturafm fatturafmVar81 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("descrizione")))) {
                                break;
                            } else {
                                this.state = 127;
                                break;
                            }
                        case 127:
                            this.state = 128;
                            this._stestocliente = this._cursanagcli.GetString("descrizione");
                            cassandraRisto.ital.fatturafm fatturafmVar82 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            this._stestocliente = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv7(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._stestocliente, 40, "");
                            this._scolumn2 = new java.lang.String[0];
                            java.util.Arrays.fill(this._scolumn2, "");
                            anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                            this._scolumn2 = anywheresoftware.b4a.keywords.Regex.Split("\n", this._stestocliente);
                            break;
                        case 128:
                            this.state = 135;
                            this.step130 = 1;
                            this.limit130 = this._scolumn2.length - 1;
                            this._xxxx = 0;
                            this.state = 374;
                            break;
                        case 130:
                            this.state = 131;
                            break;
                        case 131:
                            this.state = 134;
                            if (!this._scolumn2[this._xxxx].equals("")) {
                                this.state = 133;
                                break;
                            } else {
                                break;
                            }
                        case 133:
                            this.state = 134;
                            this._tmpfattura.Append(this._scolumn2[this._xxxx].trim() + "\n");
                            break;
                        case 134:
                            this.state = 375;
                            break;
                        case 135:
                            this.state = 136;
                            break;
                        case 136:
                            this.state = 141;
                            cassandraRisto.ital.fatturafm fatturafmVar83 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("via")))) {
                                break;
                            } else {
                                this.state = 138;
                                break;
                            }
                        case 138:
                            this.state = 141;
                            this._tmpfattura.Append(this._cursanagcli.GetString("via").trim()).Append("\n");
                            break;
                        case 141:
                            this.state = 142;
                            this._stf = "";
                            break;
                        case 142:
                            this.state = 147;
                            cassandraRisto.ital.fatturafm fatturafmVar84 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("cap")))) {
                                break;
                            } else {
                                this.state = 144;
                                break;
                            }
                        case 144:
                            this.state = 147;
                            this._stf = this._cursanagcli.GetString("cap").trim() + " ";
                            break;
                        case 147:
                            this.state = 148;
                            break;
                        case 148:
                            this.state = 153;
                            cassandraRisto.ital.fatturafm fatturafmVar85 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var7 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("citta")))) {
                                break;
                            } else {
                                this.state = 150;
                                break;
                            }
                        case 150:
                            this.state = 153;
                            this._stf += this._cursanagcli.GetString("citta").trim() + " ";
                            break;
                        case 153:
                            this.state = 154;
                            break;
                        case 154:
                            this.state = 159;
                            cassandraRisto.ital.fatturafm fatturafmVar86 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var8 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("provincia")))) {
                                break;
                            } else {
                                this.state = 156;
                                break;
                            }
                        case 156:
                            this.state = 159;
                            this._stf += this._cursanagcli.GetString("provincia").trim() + " ";
                            break;
                        case 159:
                            this.state = 160;
                            break;
                        case 160:
                            this.state = 165;
                            cassandraRisto.ital.fatturafm fatturafmVar87 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._stf))) {
                                break;
                            } else {
                                this.state = 162;
                                break;
                            }
                        case 162:
                            this.state = 165;
                            this._tmpfattura.Append(this._stf).Append("\n");
                            break;
                        case 165:
                            this.state = 166;
                            break;
                        case 166:
                            this.state = 171;
                            cassandraRisto.ital.fatturafm fatturafmVar88 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var10 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("piva")))) {
                                break;
                            } else {
                                this.state = 168;
                                break;
                            }
                        case 168:
                            this.state = 171;
                            this._tmpfattura.Append("P.IVA: " + this._cursanagcli.GetString("piva").trim()).Append("\n");
                            break;
                        case 171:
                            this.state = 172;
                            break;
                        case 172:
                            this.state = 177;
                            cassandraRisto.ital.fatturafm fatturafmVar89 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var11 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._cursanagcli.GetString("codf")))) {
                                break;
                            } else {
                                this.state = 174;
                                break;
                            }
                        case 174:
                            this.state = 177;
                            this._tmpfattura.Append("C.F.: " + this._cursanagcli.GetString("codf").trim()).Append("\n");
                            break;
                        case 177:
                            this.state = 178;
                            break;
                        case 178:
                            this.state = 219;
                            cassandraRisto.ital.fatturafm fatturafmVar90 = this.parent;
                            cassandraRisto.ital.main mainVar28 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivafe) {
                                break;
                            } else {
                                this.state = 180;
                                break;
                            }
                        case 180:
                            this.state = 181;
                            break;
                        case 181:
                            this.state = 218;
                            cassandraRisto.ital.fatturafm fatturafmVar91 = this.parent;
                            cassandraRisto.ital.main mainVar29 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from FEdatiCli where codice ='" + this._cursanagcli.GetString("codice") + "'")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 183;
                                break;
                            }
                        case 183:
                            this.state = 184;
                            this._tmpcc = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar92 = this.parent;
                            cassandraRisto.ital.main mainVar30 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmpcc = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("select * from FEdatiCli where codice ='" + this._cursanagcli.GetString("codice") + "'"));
                            break;
                        case 184:
                            this.state = 217;
                            if (this._tmpcc.getRowCount() <= 0) {
                                break;
                            } else {
                                this.state = 186;
                                break;
                            }
                        case 186:
                            this.state = 187;
                            this._tmpcc.setPosition(0);
                            break;
                        case 187:
                            this.state = 192;
                            cassandraRisto.ital.fatturafm fatturafmVar93 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var12 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("NomeCli")))) {
                                break;
                            } else {
                                this.state = 189;
                                break;
                            }
                        case 189:
                            this.state = 192;
                            this._tmpfattura.Append("Nome: " + this._tmpcc.GetString("NomeCli").trim() + "\n");
                            break;
                        case 192:
                            this.state = 193;
                            break;
                        case 193:
                            this.state = 198;
                            cassandraRisto.ital.fatturafm fatturafmVar94 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var13 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("CognomeCli")))) {
                                break;
                            } else {
                                this.state = 195;
                                break;
                            }
                        case 195:
                            this.state = 198;
                            this._tmpfattura.Append("Cognome: " + this._tmpcc.GetString("CognomeCli").trim() + "\n");
                            break;
                        case 198:
                            this.state = 199;
                            break;
                        case 199:
                            this.state = 204;
                            cassandraRisto.ital.fatturafm fatturafmVar95 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var14 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("NazioneCli"))) && !this._tmpcc.GetString("NazioneCli").equals("IT")) {
                                this.state = 201;
                                break;
                            }
                            break;
                        case 201:
                            this.state = 204;
                            this._tmpfattura.Append("Nazione: " + this._tmpcc.GetString("NazioneCli").trim() + "\n");
                            break;
                        case 204:
                            this.state = 205;
                            break;
                        case 205:
                            this.state = 210;
                            cassandraRisto.ital.fatturafm fatturafmVar96 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var15 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("CodiceDestinatario")))) {
                                break;
                            } else {
                                this.state = 207;
                                break;
                            }
                        case 207:
                            this.state = 210;
                            this._tmpfattura.Append("Codice Destinatario: " + this._tmpcc.GetString("CodiceDestinatario").trim() + "\n");
                            break;
                        case 210:
                            this.state = 211;
                            break;
                        case 211:
                            this.state = 216;
                            cassandraRisto.ital.fatturafm fatturafmVar97 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var16 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpcc.GetString("PEC")))) {
                                break;
                            } else {
                                this.state = 213;
                                break;
                            }
                        case 213:
                            this.state = 216;
                            this._tmpfattura.Append("PEC: " + this._tmpcc.GetString("PEC").trim() + "\n");
                            break;
                        case 216:
                            this.state = 217;
                            break;
                        case 217:
                            this.state = 218;
                            this._tmpcc.Close();
                            break;
                        case 218:
                            this.state = 219;
                            break;
                        case 219:
                            this.state = 220;
                            this._tmpfattura.Append(" ").Append("\n");
                            break;
                        case 220:
                            this.state = 223;
                            cassandraRisto.ital.fatturafm fatturafmVar98 = this.parent;
                            cassandraRisto.ital.main mainVar31 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivaterminale && anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                                this.state = 222;
                                break;
                            }
                            break;
                        case 222:
                            this.state = 223;
                            this._mexport.Initialize();
                            anywheresoftware.b4a.objects.collections.Map map = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar99 = this.parent;
                            map.Put("cliente", cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli"));
                            anywheresoftware.b4a.objects.collections.Map map2 = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar100 = this.parent;
                            map2.Put("totale", cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("totale"));
                            anywheresoftware.b4a.objects.collections.Map map3 = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar101 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var17 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.fatturafm fatturafmVar102 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var18 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            java.lang.StringBuilder append15 = sb.append(anywheresoftware.b4a.keywords.DateTime.Date(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA))).append(" ");
                            anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                            cassandraRisto.ital.fatturafm fatturafmVar103 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var19 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            map3.Put("datam", cassandraRisto.ital.mod1._vvvvvvvvvvvvv7(ba3, append15.append(anywheresoftware.b4a.keywords.DateTime.Time(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA))).toString()));
                            this._mexport.Put("numero", java.lang.Integer.valueOf(this._nfattura));
                            this._mexport.Put("dataFatt", this._mtdatatext.substring(12));
                            anywheresoftware.b4a.objects.collections.Map map4 = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar104 = this.parent;
                            cassandraRisto.ital.main mainVar32 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            map4.Put("negozio", cassandraRisto.ital.main._v_nnegozio);
                            anywheresoftware.b4a.objects.collections.Map map5 = this._mexport;
                            cassandraRisto.ital.fatturafm fatturafmVar105 = this.parent;
                            cassandraRisto.ital.main mainVar33 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            map5.Put("cassa", cassandraRisto.ital.main._v_numcassa);
                            break;
                        case 223:
                            this.state = 226;
                            cassandraRisto.ital.fatturafm fatturafmVar106 = this.parent;
                            if (!cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                break;
                            } else {
                                this.state = 225;
                                break;
                            }
                        case 225:
                            this.state = 226;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(this._tmpfattura);
                            break;
                        case 226:
                            this.state = 227;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(this._stestofatt, this._nfattura, this._tmpfattura, "stampaNF");
                            this._tmpfattura.Append("-- RIGHE ---------------------------------\n");
                            break;
                        case 227:
                            this.state = 234;
                            if (this._bfattfmt2) {
                                cassandraRisto.ital.fatturafm fatturafmVar107 = this.parent;
                                cassandraRisto.ital.main mainVar34 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_attivafe) {
                                    this.state = 229;
                                    break;
                                }
                            }
                            if (anywheresoftware.b4a.keywords.Common.Not(this._bfattfmt2)) {
                                cassandraRisto.ital.fatturafm fatturafmVar108 = this.parent;
                                cassandraRisto.ital.main mainVar35 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_attivafe) {
                                    this.state = 231;
                                    break;
                                }
                            }
                            this.state = 233;
                            break;
                        case 229:
                            this.state = 234;
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper2 = this._tmpfattura;
                            java.lang.StringBuilder append16 = new java.lang.StringBuilder().append("Descrizione");
                            cassandraRisto.ital.fatturafm fatturafmVar109 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            stringBuilderWrapper2.Append(append16.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(" IVA  Prz.Un    Qta Imponib.  Importo").append("\n").toString());
                            this._tmpfattura.Append("--------------------------------------------------------\n");
                            break;
                        case 231:
                            this.state = 234;
                            this._tmpfattura.Append("       Dati scontrino           ").Append("\n");
                            this._tmpfattura.Append("Descriz.                   Importo   Iva").Append("\n");
                            this._tmpfattura.Append("--------------------------------------------------------\n");
                            break;
                        case 233:
                            this.state = 234;
                            this._tmpfattura.Append("       Dati scontrino           ").Append("\n");
                            this._tmpfattura.Append("Descrizione                Importo   Iva").Append("\n");
                            this._tmpfattura.Append("--------------------------------------------------------\n");
                            break;
                        case 234:
                            this.state = 235;
                            this._mlastmatr = "";
                            break;
                        case 235:
                            this.state = 296;
                            this.step187 = 1;
                            this.limit187 = this._cursvend.getRowCount() - 1;
                            this._x = 0;
                            this.state = 376;
                            break;
                        case 237:
                            this.state = 238;
                            this._cursvend.setPosition(this._x);
                            break;
                        case 238:
                            this.state = 295;
                            if (this._cursvend.GetDouble("tot").doubleValue() == 0.0d) {
                                break;
                            } else {
                                this.state = 240;
                                break;
                            }
                        case 240:
                            this.state = 241;
                            this._mdate = this._cursvend.GetString("dataeoraffm");
                            this._mmatr = this._cursvend.GetString("matricolacassap");
                            break;
                        case 241:
                            this.state = 246;
                            if (this._mdate != null) {
                                break;
                            } else {
                                this.state = 243;
                                break;
                            }
                        case 243:
                            this.state = 246;
                            this._mdate = this._cursvend.GetString("datam");
                            break;
                        case 246:
                            this.state = 247;
                            break;
                        case 247:
                            this.state = 252;
                            if (this._mmatr != null) {
                                break;
                            } else {
                                this.state = 249;
                                break;
                            }
                        case 249:
                            this.state = 252;
                            this._mmatr = "";
                            break;
                        case 252:
                            this.state = 253;
                            this._mdettsco = "";
                            break;
                        case 253:
                            this.state = 258;
                            if (this._cursvend.GetInt("numero") > 0) {
                                this.state = 255;
                                break;
                            } else if (this._cursvend.GetInt("Ricevuta") <= 0) {
                                break;
                            } else {
                                this.state = 257;
                                break;
                            }
                        case 255:
                            this.state = 258;
                            this._mdettsco = "SC." + cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(this._cursvend) + " del " + this._mdate.substring(3, 5) + "/" + this._mdate.substring(0, 2) + "/" + this._mdate.substring(6, 10);
                            break;
                        case 257:
                            this.state = 258;
                            this._mdate = this._cursvend.GetString("datam");
                            this._mdettsco = "RC.N." + this._cursvend.GetString("Ricevuta") + " del " + this._mdate.substring(3, 5) + "/" + this._mdate.substring(0, 2) + "/" + this._mdate.substring(6, 10);
                            break;
                        case 258:
                            this.state = 261;
                            if (this._cursvend.GetInt("numero") > 0 && !this._mlastmatr.equals(this._mmatr)) {
                                this.state = 260;
                                break;
                            }
                            break;
                        case 260:
                            this.state = 261;
                            this._tmpfattura.Append("Scontrini del MF:" + this._mmatr).Append("\n");
                            break;
                        case 261:
                            this.state = 262;
                            this._mlastmatr = this._mmatr;
                            break;
                        case 262:
                            this.state = 294;
                            if (this._bfattfmt2) {
                                cassandraRisto.ital.fatturafm fatturafmVar110 = this.parent;
                                cassandraRisto.ital.main mainVar36 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                if (cassandraRisto.ital.main._v_attivafe && (this._cursvend.GetInt("numero") > 0 || this._cursvend.GetInt("Ricevuta") > 0)) {
                                    this.state = 264;
                                    break;
                                }
                            }
                            this.state = 287;
                            break;
                        case 264:
                            this.state = 265;
                            this._tmpr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            break;
                        case 265:
                            this.state = 270;
                            if (this._cursvend.GetInt("numero") > 0) {
                                this.state = 267;
                                break;
                            } else if (this._cursvend.GetInt("Ricevuta") <= 0) {
                                break;
                            } else {
                                this.state = 269;
                                break;
                            }
                        case 267:
                            this.state = 270;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper6 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar111 = this.parent;
                            cassandraRisto.ital.main mainVar37 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmpr = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper6, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select venduto.descrizione, iva,prezzov,venduto.qta,venduto.importo from venduto inner join headmov on venduto.nmov = headmov.nmov inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov where CausaliPagamenti.codice=2 And  headmov.nfat=0 And  FattFM=1 And  nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " And datfat_fm = '" + this._mtdata + "' and headmov.dataeoraffm='" + this._cursvend.GetString("dataeoraffm") + "' and headmov.nscontrinoffm=" + this._cursvend.GetString("numero") + " and headmov.nChiusura=" + this._cursvend.GetString("nChiusura")));
                            break;
                        case 269:
                            this.state = 270;
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper7 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                            cassandraRisto.ital.fatturafm fatturafmVar112 = this.parent;
                            cassandraRisto.ital.main mainVar38 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            this._tmpr = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper7, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select venduto.descrizione, iva,prezzov,venduto.qta,venduto.importo from venduto inner join headmov on venduto.nmov = headmov.nmov inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov where CausaliPagamenti.codice=2 And  headmov.nfat=0 And  FattFM=1 And  nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " And datfat_fm = '" + this._mtdata + "' and headmov.nric=" + this._cursvend.GetString("Ricevuta")));
                            break;
                        case 270:
                            this.state = 271;
                            this._s3 = "";
                            this._tmpfattura.Append(this._mdettsco).Append("\n");
                            break;
                        case 271:
                            this.state = 280;
                            this.step214 = 1;
                            this.limit214 = this._tmpr.getRowCount() - 1;
                            this._xx = 0;
                            this.state = 378;
                            break;
                        case 273:
                            this.state = 274;
                            this._tmpr.setPosition(this._xx);
                            this._mimpo = this._tmpr.GetDouble("importo").doubleValue();
                            this._mmqta = this._tmpr.GetDouble("qta").doubleValue();
                            this._s3 = "";
                            cassandraRisto.ital.fatturafm fatturafmVar113 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(this._tmpr.GetInt("iva"));
                            cassandraRisto.ital.fatturafm fatturafmVar114 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba4 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder append17 = new java.lang.StringBuilder().append(this._tmpr.GetString("descrizione"));
                            cassandraRisto.ital.fatturafm fatturafmVar115 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = cassandraRisto.ital.modfunstr._left(ba4, append17.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 19)).toString(), 19L);
                            java.lang.StringBuilder append18 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar116 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba5 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar117 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append18.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba5, sb2.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 4)).append(this._tmpr.GetString("iva")).toString(), 4L)).toString();
                            java.lang.StringBuilder append19 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar118 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba6 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar119 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar7 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append19.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba6, sb3.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._mimpo / this._mmqta, 1, 2, 2, false)).toString(), 8L)).toString();
                            break;
                        case 274:
                            this.state = 279;
                            if ((this._mmqta * 1000.0d) % 1000.0d == 0.0d) {
                                this.state = 276;
                                break;
                            } else {
                                this.state = 278;
                                break;
                            }
                        case 276:
                            this.state = 279;
                            java.lang.StringBuilder append20 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar120 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar8 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba7 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar121 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append20.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba7, sb4.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 7)).append(anywheresoftware.b4a.keywords.Common.NumberFormat(this._mmqta, 1, 0)).toString(), 7L)).toString();
                            break;
                        case 278:
                            this.state = 279;
                            java.lang.StringBuilder append21 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar122 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar10 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba8 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar123 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar11 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append21.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba8, sb5.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 7)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._mmqta, 1, 3, 3, false)).toString(), 7L)).toString();
                            break;
                        case 279:
                            this.state = 379;
                            this._tmpimposta = anywheresoftware.b4a.keywords.Common.Round2(this._mimpo, 4);
                            double d = this._tmpimposta;
                            double d2 = this._tmpimposta;
                            cassandraRisto.ital.fatturafm fatturafmVar124 = this.parent;
                            this._tmpimposta = d - (d2 / (1.0d + (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue() / 100.0d)));
                            java.lang.StringBuilder append22 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar125 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar12 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba9 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar126 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar13 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append22.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba9, sb6.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 9)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._mimpo - this._tmpimposta, 1, 4, 4, false)).toString(), 9L)).toString();
                            java.lang.StringBuilder append23 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar127 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar14 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba10 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar128 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar15 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append23.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba10, sb7.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 9)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._mimpo, 1, 2, 2, false)).toString(), 9L)).toString();
                            this._tmpfattura.Append(this._s3).Append("\n");
                            cassandraRisto.ital.fatturafm fatturafmVar129 = this.parent;
                            anywheresoftware.b4a.objects.collections.List list = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            int GetInt = this._tmpr.GetInt("iva");
                            cassandraRisto.ital.fatturafm fatturafmVar130 = this.parent;
                            list.Set(GetInt, java.lang.Double.valueOf(anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._tmpr.GetInt("iva"))) + this._mimpo));
                            break;
                        case 280:
                            this.state = 285;
                            if (!this._tmpr.IsInitialized()) {
                                break;
                            } else {
                                this.state = 282;
                                break;
                            }
                        case 282:
                            this.state = 285;
                            this._tmpr.Close();
                            break;
                        case 285:
                            this.state = 294;
                            break;
                        case 287:
                            this.state = 288;
                            this._s3 = "";
                            break;
                        case 288:
                            this.state = 293;
                            cassandraRisto.ital.fatturafm fatturafmVar131 = this.parent;
                            cassandraRisto.ital.main mainVar39 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe) {
                                this.state = 290;
                                break;
                            } else {
                                this.state = 292;
                                break;
                            }
                        case 290:
                            this.state = 293;
                            cassandraRisto.ital.fatturafm fatturafmVar132 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar16 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba11 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder append24 = new java.lang.StringBuilder().append(this._mdettsco);
                            cassandraRisto.ital.fatturafm fatturafmVar133 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar17 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = cassandraRisto.ital.modfunstr._left(ba11, append24.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 23)).toString(), 23L);
                            java.lang.StringBuilder append25 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar134 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar18 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba12 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar135 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar19 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append25.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba12, sb8.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._cursvend.GetDouble("tot").doubleValue(), 1, 2, 2, false)).toString(), 8L)).toString();
                            java.lang.StringBuilder append26 = new java.lang.StringBuilder().append(this._s3).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar136 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar20 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba13 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar137 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar21 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append26.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba13, sb9.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 5)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._cursvend.GetDouble("iva").doubleValue(), 1, 0, 0, false)).toString(), 5L)).toString();
                            break;
                        case 292:
                            this.state = 293;
                            cassandraRisto.ital.fatturafm fatturafmVar138 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar22 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba14 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder append27 = new java.lang.StringBuilder().append(this._mdettsco);
                            cassandraRisto.ital.fatturafm fatturafmVar139 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar23 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = cassandraRisto.ital.modfunstr._left(ba14, append27.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 9)).toString(), 26L);
                            java.lang.StringBuilder append28 = new java.lang.StringBuilder().append(this._s3);
                            cassandraRisto.ital.fatturafm fatturafmVar140 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar24 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba15 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar141 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar25 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append28.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba15, sb10.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._cursvend.GetDouble("tot").doubleValue(), 1, 2, 2, false)).toString(), 8L)).toString();
                            java.lang.StringBuilder append29 = new java.lang.StringBuilder().append(this._s3).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar142 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar26 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba16 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar143 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar27 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s3 = append29.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba16, sb11.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 5)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._cursvend.GetDouble("iva").doubleValue(), 1, 0, 0, false)).toString(), 5L)).toString();
                            break;
                        case 293:
                            this.state = 294;
                            this._tmpfattura.Append(this._s3).Append("\n");
                            cassandraRisto.ital.fatturafm fatturafmVar144 = this.parent;
                            anywheresoftware.b4a.objects.collections.List list2 = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
                            int GetInt2 = this._cursvend.GetInt("iva");
                            cassandraRisto.ital.fatturafm fatturafmVar145 = this.parent;
                            list2.Set(GetInt2, java.lang.Double.valueOf(anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._cursvend.GetInt("iva"))) + this._cursvend.GetDouble("tot").doubleValue()));
                            break;
                        case 294:
                            this.state = 295;
                            break;
                        case 295:
                            this.state = 377;
                            break;
                        case 296:
                            this.state = 297;
                            this._tmpfattura.Append("****************************************").Append("\n");
                            break;
                        case 297:
                            this.state = 300;
                            if (this._totscoinfatt <= 0.0d) {
                                break;
                            } else {
                                this.state = 299;
                                break;
                            }
                        case 299:
                            this.state = 300;
                            this._tmpfattura.Append(" ").Append("\n");
                            this._tmpfattura.Append(" ").Append("\n");
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper3 = this._tmpfattura;
                            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar146 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar28 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba17 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder append30 = new java.lang.StringBuilder().append("Tot. Sconti applicati:");
                            cassandraRisto.ital.fatturafm fatturafmVar147 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar29 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append31 = sb12.append(cassandraRisto.ital.modfunstr._left(ba17, append30.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 26)).toString(), 26L));
                            cassandraRisto.ital.fatturafm fatturafmVar148 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar30 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba18 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar149 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar31 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            stringBuilderWrapper3.Append(append31.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba18, sb13.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._totscoinfatt, 1, 2, 2, false)).toString(), 8L)).toString()).Append("      ").Append("\n");
                            this._tmpfattura.Append("****************************************").Append("\n");
                            break;
                        case 300:
                            this.state = 301;
                            this._tmpfattura.Append(" ").Append("\n");
                            this._tmpfattura.Append("E IVA   Aliq Imponibile  Imposta").Append("\n");
                            this._tmpfattura.Append("--------------------------------").Append("\n");
                            this._imposta = 0.0d;
                            break;
                        case 301:
                            this.state = 315;
                            this.step263 = 1;
                            this.limit263 = 9;
                            this._x = 0;
                            this.state = 380;
                            break;
                        case 303:
                            this.state = 304;
                            break;
                        case 304:
                            this.state = 314;
                            cassandraRisto.ital.fatturafm fatturafmVar150 = this.parent;
                            if (anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x)) <= 0.0d) {
                                break;
                            } else {
                                this.state = 306;
                                break;
                            }
                        case 306:
                            this.state = 307;
                            this._s4 = this._tmpeiva + " ";
                            this._s4 += " " + anywheresoftware.b4a.BA.NumberToString(this._x);
                            cassandraRisto.ital.fatturafm fatturafmVar151 = this.parent;
                            cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setPosition(this._x);
                            java.lang.StringBuilder append32 = new java.lang.StringBuilder().append(this._s4).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar152 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar32 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba19 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar153 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar33 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append33 = sb14.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 7));
                            cassandraRisto.ital.fatturafm fatturafmVar154 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var20 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba20 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            cassandraRisto.ital.fatturafm fatturafmVar155 = this.parent;
                            this._s4 = append32.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba19, append33.append(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvv5(ba20, cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue())).append(" %").toString(), 7L)).toString();
                            cassandraRisto.ital.fatturafm fatturafmVar156 = this.parent;
                            double ObjectToNumber = anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x));
                            cassandraRisto.ital.fatturafm fatturafmVar157 = this.parent;
                            double ObjectToNumber2 = anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x));
                            cassandraRisto.ital.fatturafm fatturafmVar158 = this.parent;
                            this._imposta = anywheresoftware.b4a.keywords.Common.Round2(ObjectToNumber - (ObjectToNumber2 / (1.0d + (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue() / 100.0d))), 2);
                            java.lang.StringBuilder append34 = new java.lang.StringBuilder().append(this._s4).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar159 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar34 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba21 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar160 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar35 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append35 = sb15.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 10));
                            cassandraRisto.ital.fatturafm fatturafmVar161 = this.parent;
                            this._s4 = append34.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba21, append35.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x)) - this._imposta, 1, 2, 2, false)).toString(), 10L)).toString();
                            java.lang.StringBuilder append36 = new java.lang.StringBuilder().append(this._s4).append(" ");
                            cassandraRisto.ital.fatturafm fatturafmVar162 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar36 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba22 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar163 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar37 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            this._s4 = append36.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba22, sb16.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 8)).append(anywheresoftware.b4a.keywords.Common.NumberFormat2(this._imposta, 1, 2, 2, false)).toString(), 8L)).toString();
                            this._tmpfattura.Append(this._s4).Append("\n");
                            break;
                        case 307:
                            this.state = 310;
                            cassandraRisto.ital.fatturafm fatturafmVar164 = this.parent;
                            cassandraRisto.ital.main mainVar40 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivaterminale && anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                                this.state = 309;
                                break;
                            }
                            break;
                        case 309:
                            this.state = 310;
                            anywheresoftware.b4a.objects.collections.Map map6 = this._mexport;
                            java.lang.String str2 = "iva" + anywheresoftware.b4a.BA.NumberToString(this._x);
                            cassandraRisto.ital.fatturafm fatturafmVar165 = this.parent;
                            map6.Put(str2, cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("codice"));
                            anywheresoftware.b4a.objects.collections.Map map7 = this._mexport;
                            java.lang.String str3 = "aliquota" + anywheresoftware.b4a.BA.NumberToString(this._x);
                            cassandraRisto.ital.fatturafm fatturafmVar166 = this.parent;
                            map7.Put(str3, cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("aliquota2"));
                            anywheresoftware.b4a.objects.collections.Map map8 = this._mexport;
                            java.lang.String str4 = "imponibile" + anywheresoftware.b4a.BA.NumberToString(this._x);
                            cassandraRisto.ital.fatturafm fatturafmVar167 = this.parent;
                            map8.Put(str4, anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get(this._x)) - this._imposta, 1, 2, 2, false));
                            this._mexport.Put("imposta" + anywheresoftware.b4a.BA.NumberToString(this._x), anywheresoftware.b4a.keywords.Common.NumberFormat2(this._imposta, 1, 2, 2, false));
                            break;
                        case 310:
                            this.state = 313;
                            cassandraRisto.ital.fatturafm fatturafmVar168 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetDouble("aliquota2").doubleValue() != 0.0d) {
                                break;
                            } else {
                                cassandraRisto.ital.fatturafm fatturafmVar169 = this.parent;
                                if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetInt("natura") <= 0) {
                                    break;
                                } else {
                                    this.state = 312;
                                    break;
                                }
                            }
                        case 312:
                            this.state = 313;
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper4 = this._tmpfattura;
                            cassandraRisto.ital.fatturafm fatturafmVar170 = this.parent;
                            cassandraRisto.ital.main mainVar41 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql8 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append37 = new java.lang.StringBuilder().append("select descrizione from FEnaturaIVA where codice = ");
                            cassandraRisto.ital.fatturafm fatturafmVar171 = this.parent;
                            anywheresoftware.b4a.keywords.StringBuilderWrapper Append = stringBuilderWrapper4.Append(sql8.ExecQuerySingleResult(append37.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("natura")).toString()));
                            java.lang.StringBuilder append38 = new java.lang.StringBuilder().append(" --");
                            cassandraRisto.ital.fatturafm fatturafmVar172 = this.parent;
                            Append.Append(append38.append(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.GetString("descrizione")).toString()).Append("\n");
                            break;
                        case 313:
                            this.state = 314;
                            break;
                        case 314:
                            this.state = 381;
                            break;
                        case 315:
                            this.state = 316;
                            this._tmpfattura.Append("================================").Append("\n");
                            this._tmpfattura.Append(" ").Append("\n");
                            break;
                        case 316:
                            this.state = 321;
                            if (this._recall) {
                                this.state = 318;
                                break;
                            } else {
                                this.state = 320;
                                break;
                            }
                        case 318:
                            this.state = 321;
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper5 = this._tmpfattura;
                            java.lang.StringBuilder append39 = new java.lang.StringBuilder().append("TOTALE FATTURA:");
                            cassandraRisto.ital.fatturafm fatturafmVar173 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar38 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba23 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar174 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar39 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append40 = sb17.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 17));
                            cassandraRisto.ital.fatturafm fatturafmVar175 = this.parent;
                            stringBuilderWrapper5.Append(append39.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba23, append40.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5, 1, 2, 2, false)).toString(), 17L)).toString());
                            break;
                        case 320:
                            this.state = 321;
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper6 = this._tmpfattura;
                            java.lang.StringBuilder append41 = new java.lang.StringBuilder().append("TOTALE FATTURA:");
                            cassandraRisto.ital.fatturafm fatturafmVar176 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar40 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba24 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar177 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar41 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append42 = sb18.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 17));
                            cassandraRisto.ital.fatturafm fatturafmVar178 = this.parent;
                            stringBuilderWrapper6.Append(append41.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba24, append42.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue(), 1, 2, 2, false)).toString(), 17L)).toString());
                            break;
                        case 321:
                            this.state = 330;
                            cassandraRisto.ital.fatturafm fatturafmVar179 = this.parent;
                            cassandraRisto.ital.main mainVar42 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 <= 0.0d) {
                                break;
                            } else {
                                this.state = 323;
                                break;
                            }
                        case 323:
                            this.state = 324;
                            this._tmpfattura.Append(" ").Append("\n");
                            this._tmpfattura.Append("Operazione assoggettata a  ").Append("\n");
                            this._tmpfattura.Append("split payment con IVA non  ").Append("\n");
                            this._tmpfattura.Append("incassata dal cedente ai sensi ").Append("\n");
                            this._tmpfattura.Append("dell’ex art.17-ter DPR 633/1972").Append("\n");
                            this._tmpfattura.Append(" ");
                            break;
                        case 324:
                            this.state = 329;
                            if (this._recall) {
                                this.state = 326;
                                break;
                            } else {
                                this.state = 328;
                                break;
                            }
                        case 326:
                            this.state = 329;
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper7 = this._tmpfattura;
                            java.lang.StringBuilder append43 = new java.lang.StringBuilder().append("TOTALE DA PAGARE:");
                            cassandraRisto.ital.fatturafm fatturafmVar180 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar42 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba25 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar181 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar43 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append44 = sb19.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 15));
                            cassandraRisto.ital.fatturafm fatturafmVar182 = this.parent;
                            double d3 = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.fatturafm fatturafmVar183 = this.parent;
                            cassandraRisto.ital.main mainVar43 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            stringBuilderWrapper7.Append(append43.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba25, append44.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(d3 - cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4, 1, 2, 2, false)).toString(), 15L)).toString());
                            break;
                        case 328:
                            this.state = 329;
                            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper8 = this._tmpfattura;
                            java.lang.StringBuilder append45 = new java.lang.StringBuilder().append("TOTALE DA PAGARE:");
                            cassandraRisto.ital.fatturafm fatturafmVar184 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar44 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            anywheresoftware.b4a.BA ba26 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
                            cassandraRisto.ital.fatturafm fatturafmVar185 = this.parent;
                            cassandraRisto.ital.modfunstr modfunstrVar45 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append46 = sb20.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, 15));
                            cassandraRisto.ital.fatturafm fatturafmVar186 = this.parent;
                            double doubleValue = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale").doubleValue();
                            cassandraRisto.ital.fatturafm fatturafmVar187 = this.parent;
                            cassandraRisto.ital.main mainVar44 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            stringBuilderWrapper8.Append(append45.append(cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(ba26, append46.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(doubleValue - cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4, 1, 2, 2, false)).toString(), 15L)).toString());
                            break;
                        case 329:
                            this.state = 330;
                            break;
                        case 330:
                            this.state = 331;
                            this._ncopie = 0;
                            break;
                        case 331:
                            this.state = 336;
                            cassandraRisto.ital.fatturafm fatturafmVar188 = this.parent;
                            if (!cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                break;
                            } else {
                                this.state = 333;
                                break;
                            }
                        case 333:
                            this.state = 336;
                            cassandraRisto.ital.fatturafm fatturafmVar189 = this.parent;
                            this._ncopie = (int) anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Copie", 0));
                            break;
                        case 336:
                            this.state = 337;
                            break;
                        case 337:
                            this.state = 340;
                            cassandraRisto.ital.fatturafm fatturafmVar190 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var21 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba27 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(this._tmpfattura);
                            int i2 = this._ncopie;
                            cassandraRisto.ital.fatturafm fatturafmVar191 = this.parent;
                            if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvv4(ba27, ObjectToString, true, i2, anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("TipoDocumento", ""))))) {
                                break;
                            } else {
                                this.state = 339;
                                break;
                            }
                        case 339:
                            this.state = 340;
                            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("La Fattura non è stata stampata a causa di un problema sulla stampante Non Fiscale.");
                            cassandraRisto.ital.fatturafm fatturafmVar192 = this.parent;
                            cassandraRisto.ital.main mainVar45 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.fatturafm fatturafmVar193 = this.parent;
                            cassandraRisto.ital.main mainVar46 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                            break;
                        case 340:
                            this.state = 349;
                            if (!anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                                break;
                            } else {
                                this.state = 342;
                                break;
                            }
                        case 342:
                            this.state = 343;
                            cassandraRisto.ital.fatturafm fatturafmVar194 = this.parent;
                            cassandraRisto.ital.main mainVar47 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            anywheresoftware.b4a.sql.SQL sql9 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                            java.lang.StringBuilder append47 = new java.lang.StringBuilder().append("update  progressivi set valore = ").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura + 1)).append("  where codice ='");
                            cassandraRisto.ital.fatturafm fatturafmVar195 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar196 = cassandraRisto.ital.fatturafm.mostCurrent;
                            sql9.ExecNonQuery(append47.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).append("'").toString());
                            break;
                        case 343:
                            this.state = 348;
                            cassandraRisto.ital.fatturafm fatturafmVar197 = this.parent;
                            cassandraRisto.ital.main mainVar48 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (!cassandraRisto.ital.main._v_attivaterminale) {
                                break;
                            } else {
                                this.state = 345;
                                break;
                            }
                        case 345:
                            this.state = 348;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(this._mexport);
                            break;
                        case 348:
                            this.state = 349;
                            break;
                        case 349:
                            this.state = 350;
                            this._bexportxml = true;
                            break;
                        case 350:
                            this.state = 353;
                            cassandraRisto.ital.fatturafm fatturafmVar198 = this.parent;
                            cassandraRisto.ital.main mainVar49 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe && this._recall) {
                                this.state = 352;
                                break;
                            }
                            break;
                        case 352:
                            this.state = 353;
                            java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Si desidera anche rigenerare il file xml ?");
                            cassandraRisto.ital.fatturafm fatturafmVar199 = this.parent;
                            cassandraRisto.ital.main mainVar50 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                            cassandraRisto.ital.fatturafm fatturafmVar200 = this.parent;
                            cassandraRisto.ital.main mainVar51 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "Si", "", "No", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                            this._bexportxml = Msgbox2 == -1;
                            break;
                        case 353:
                            this.state = 366;
                            cassandraRisto.ital.fatturafm fatturafmVar201 = this.parent;
                            cassandraRisto.ital.main mainVar52 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_attivafe && this._bexportxml) {
                                this.state = 355;
                                break;
                            }
                            break;
                        case 355:
                            this.state = 356;
                            this._listofmapsf = new anywheresoftware.b4a.objects.collections.List();
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(this._swhere, this._bfattfmt2);
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(this._mtdatatext);
                            cassandraRisto.ital.fatturafm fatturafmVar202 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var22 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            anywheresoftware.b4a.BA ba28 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                            java.lang.String str5 = this._mtdatafe;
                            int i3 = this._nfattura;
                            cassandraRisto.ital.fatturafm fatturafmVar203 = this.parent;
                            anywheresoftware.b4a.objects.collections.Map map9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                            java.lang.String trim2 = this._cursanagcli.GetString("codice").trim();
                            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper8 = this._cursanagcli;
                            java.lang.String str6 = " h.nfat=0 and  FattFM=1 and h.cliente ='" + this._cursanagcli.GetString("codice").trim() + "' and nfat_fm =" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + " and datfat_fm = '" + this._mtdata + "'";
                            anywheresoftware.b4a.objects.collections.List list3 = this._listofmapsf;
                            cassandraRisto.ital.fatturafm fatturafmVar204 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar205 = cassandraRisto.ital.fatturafm.mostCurrent;
                            java.lang.String str7 = cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.fatturafm fatturafmVar206 = this.parent;
                            this._tmpfn = cassandraRisto.ital.mod1._vvvvvvvv4(ba28, str5, i3, map9, trim2, cursorWrapper8, str6, true, list3, true, str7, cassandraRisto.ital.fatturafm.mostCurrent._activity);
                            break;
                        case 356:
                            this.state = 365;
                            if (!this._tmpfn.equals("")) {
                                anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
                                java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
                                anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
                                if (!anywheresoftware.b4a.objects.streams.File.Exists(sb21.append(anywheresoftware.b4a.objects.streams.File.getDirDefaultExternal()).append("/FE").toString(), this._tmpfn)) {
                                    break;
                                } else {
                                    cassandraRisto.ital.fatturafm fatturafmVar207 = this.parent;
                                    cassandraRisto.ital.main mainVar53 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                                    if (!cassandraRisto.ital.main._v_inviofe) {
                                        break;
                                    } else {
                                        this.state = 358;
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        case 358:
                            this.state = 359;
                            this._tmppar = "Fattura Num." + anywheresoftware.b4a.BA.NumberToString(this._nfattura);
                            break;
                        case 359:
                            this.state = 364;
                            cassandraRisto.ital.fatturafm fatturafmVar208 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar209 = cassandraRisto.ital.fatturafm.mostCurrent;
                            if (!cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.equals("")) {
                                this.state = 361;
                                break;
                            } else {
                                this.state = 363;
                                break;
                            }
                        case 361:
                            this.state = 364;
                            java.lang.StringBuilder append48 = new java.lang.StringBuilder().append("Fattura N.").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).append("/");
                            cassandraRisto.ital.fatturafm fatturafmVar210 = this.parent;
                            cassandraRisto.ital.fatturafm fatturafmVar211 = cassandraRisto.ital.fatturafm.mostCurrent;
                            this._tmppar = append48.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).toString();
                            break;
                        case 363:
                            this.state = 364;
                            this._tmppar = "Fattura N." + anywheresoftware.b4a.BA.NumberToString(this._nfattura);
                            break;
                        case 364:
                            this.state = 365;
                            this._tmppar += this._sdatafatt;
                            anywheresoftware.b4a.BA ba29 = cassandraRisto.ital.fatturafm.processBA;
                            cassandraRisto.ital.fatturafm fatturafmVar212 = this.parent;
                            cassandraRisto.ital.httpclient httpclientVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                            anywheresoftware.b4a.keywords.Common.CallSubNew3(ba29, cassandraRisto.ital.httpclient.getObject(), "ComunicaConInviaFE", "http://127.0.0.1:12512/R__INVIO__" + this._tmpfn + "__", this._tmppar);
                            cassandraRisto.ital.fatturafm fatturafmVar213 = this.parent;
                            this._stmpmail = anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault("Mail", ""));
                            cassandraRisto.ital.fatturafm._preparamailvisualizza("", this._stmpmail);
                            break;
                        case 365:
                            this.state = 366;
                            break;
                        case 366:
                            this.state = 367;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
                            break;
                        case 367:
                            this.state = 370;
                            break;
                        case 369:
                            this.state = 370;
                            this.catchState = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar214 = this.parent;
                            cassandraRisto.ital.mod1 mod1Var23 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(cassandraRisto.ital.fatturafm.mostCurrent.activityBA).getMessage());
                            break;
                        case 370:
                            this.state = -1;
                            this.catchState = 0;
                            cassandraRisto.ital.fatturafm fatturafmVar215 = this.parent;
                            cassandraRisto.ital.main mainVar54 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0.0d;
                            cassandraRisto.ital.fatturafm fatturafmVar216 = this.parent;
                            cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
                            break;
                        case 371:
                            this.state = 15;
                            this._result = (anywheresoftware.b4a.objects.collections.Map) objArr[0];
                            break;
                        case 372:
                            this.state = 102;
                            if ((this.step99 > 0 && this._x <= this.limit99) || (this.step99 < 0 && this._x >= this.limit99)) {
                                this.state = 101;
                                break;
                            }
                            break;
                        case 373:
                            this.state = 372;
                            this._x = this._x + 0 + this.step99;
                            break;
                        case 374:
                            this.state = 135;
                            if ((this.step130 > 0 && this._xxxx <= this.limit130) || (this.step130 < 0 && this._xxxx >= this.limit130)) {
                                this.state = 130;
                                break;
                            }
                            break;
                        case 375:
                            this.state = 374;
                            this._xxxx = this._xxxx + 0 + this.step130;
                            break;
                        case 376:
                            this.state = 296;
                            if ((this.step187 > 0 && this._x <= this.limit187) || (this.step187 < 0 && this._x >= this.limit187)) {
                                this.state = 237;
                                break;
                            }
                            break;
                        case 377:
                            this.state = 376;
                            this._x = this._x + 0 + this.step187;
                            break;
                        case 378:
                            this.state = 280;
                            if ((this.step214 > 0 && this._xx <= this.limit214) || (this.step214 < 0 && this._xx >= this.limit214)) {
                                this.state = 273;
                                break;
                            }
                            break;
                        case 379:
                            this.state = 378;
                            this._xx = this._xx + 0 + this.step214;
                            break;
                        case 380:
                            this.state = 315;
                            if ((this.step263 > 0 && this._x <= this.limit263) || (this.step263 < 0 && this._x >= this.limit263)) {
                                this.state = 303;
                                break;
                            }
                            break;
                        case 381:
                            this.state = 380;
                            this._x = this._x + 0 + this.step263;
                            break;
                    }
                } catch (java.lang.Exception e) {
                    if (this.catchState == 0) {
                        throw e;
                    }
                    this.state = this.catchState;
                    cassandraRisto.ital.fatturafm.processBA.setLastException(e);
                }
            }
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(java.lang.String str, int i, anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper, java.lang.String str2) throws java.lang.Exception {
        int i2;
        if (!str.equals("") && !str.equals("Inserire Testo")) {
            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
            if (!str.equals(anywheresoftware.b4a.BA.NumberToString(-3))) {
                if (str2.equals("stampaF")) {
                    i2 = 32;
                } else if (str2.equals("stampaNF")) {
                    i2 = 40;
                } else if (str2.equals("stampaPDF")) {
                    i2 = 35;
                } else {
                    return "";
                }
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(i) + "'");
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("insert into TestiDoc (nmov,testo) values('F_" + anywheresoftware.b4a.BA.NumberToString(i) + "','" + str + "')");
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv7(mostCurrent.activityBA, str, i2, "");
                java.util.Arrays.fill(new java.lang.String[0], "");
                anywheresoftware.b4a.keywords.Regex regex = anywheresoftware.b4a.keywords.Common.Regex;
                java.lang.String[] Split = anywheresoftware.b4a.keywords.Regex.Split("\n", _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                int length = Split.length - 1;
                for (int i3 = 0; i3 <= length; i3++) {
                    if (!Split[i3].equals("")) {
                        if (str2.equals("stampaF")) {
                            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo(Split[i3].trim(), 1);
                        } else {
                            stringBuilderWrapper.Append(Split[i3].trim()).Append("\n");
                        }
                    }
                }
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_attivafe)) {
                    if (str2.equals("stampaF")) {
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._ft_testo("********************************", 1);
                    } else {
                        stringBuilderWrapper.Append("********************************").Append("\n");
                    }
                }
            }
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "Sub Trova";
        try {
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        if (mostCurrent._dadata.getTag().equals("")) {
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Selezionare la data di inizio ricerca");
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            return "";
        }
        if (mostCurrent._adata.getTag().equals("")) {
            java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Selezionare la data di fine ricerca");
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.fatturafm fatturafmVar = mostCurrent;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = " headmov.cliente<>'' and  headmov.nfat=0 and headmov.datam3 > '" + anywheresoftware.b4a.BA.ObjectToString(mostCurrent._dadata.getTag()) + "' and headmov.datam3 < '" + anywheresoftware.b4a.BA.ObjectToString(mostCurrent._adata.getTag()) + "' and (nscontrinoffm >0 or  RicDaFatt=1) and nfat_fm=0";
        anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToCharSequence("Attendere ... Estrazione dati in corso ..."));
        anywheresoftware.b4a.keywords.Common.DoEvents();
        anywheresoftware.b4a.keywords.Common.DoEvents();
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("select cliente As codiceCli,Max(clides) As descrizione,\n\t\t(Select Case when sum(importo) Is Null Then -99999999 Else sum(importo) End\n\t\tfrom CausaliPagamenti inner join headmov As h2 on CausaliPagamenti.nmov= h2.nmov\n\t\twhere  h2.FattFM=1 And h2.cliente = headmov.cliente  And\n\t\t(");
        cassandraRisto.ital.fatturafm fatturafmVar2 = mostCurrent;
        java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append(")\n\t\tAnd ");
        cassandraRisto.ital.fatturafm fatturafmVar3 = mostCurrent;
        java.lang.StringBuilder append3 = append2.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.replace("headmov.datam3", "h2.datam3"))).append(") As totale\n\t\tfrom headmov inner join CausaliPagamenti on  CausaliPagamenti.nmov= headmov.nmov\n\t\twhere (");
        cassandraRisto.ital.fatturafm fatturafmVar4 = mostCurrent;
        java.lang.StringBuilder append4 = append3.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append(") And ");
        cassandraRisto.ital.fatturafm fatturafmVar5 = mostCurrent;
        java.lang.String sb = append4.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)).append("\n\t\tgroup by codiceCli order by upper(descrizione) ").toString();
        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_lastdatadocfm) {
            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from TmpClientiFM");
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery(sb));
            int rowCount = cursorWrapper2.getRowCount() - 1;
            for (int i = 0; i <= rowCount; i++) {
                cursorWrapper2.setPosition(i);
                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.sql.SQL sql = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                java.lang.StringBuilder append5 = new java.lang.StringBuilder().append("select max(headmov.datam3)\n\t\t\t\tfrom CausaliPagamenti inner join headmov  on CausaliPagamenti.nmov= headmov.nmov \n\t\t\t\t\twhere  headmov.FattFM=1 and headmov.cliente ='").append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("codiceCli"))).append("'  AND\n\t\t\t\t\t(");
                cassandraRisto.ital.fatturafm fatturafmVar6 = mostCurrent;
                java.lang.StringBuilder append6 = append5.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)).append(") \n\t\t\t\t\tAnd  ");
                cassandraRisto.ital.fatturafm fatturafmVar7 = mostCurrent;
                java.lang.String ExecQuerySingleResult = sql.ExecQuerySingleResult(append6.append(anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)).append("").toString());
                if (ExecQuerySingleResult != null) {
                    cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("insert into TmpClientiFM(codiceCli,descrizione,totale,MaxData)\n\t\t\t\t\t\t\t\t\t\t\t values('" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("codiceCli")) + "','" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("descrizione")) + "'," + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", cursorWrapper2.GetString("totale")) + ",'" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ExecQuerySingleResult) + "')\n\t\t\t\t");
                }
            }
            cassandraRisto.ital.fatturafm fatturafmVar8 = mostCurrent;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            fatturafmVar8._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("select * from TmpClientiFM order by MaxData"));
        } else {
            cassandraRisto.ital.fatturafm fatturafmVar9 = mostCurrent;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            fatturafmVar9._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper4, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery(sb));
        }
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
        if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getRowCount() > 0) {
            cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._v_lastdatadocfm) {
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = -1;
            }
            int rowCount2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getRowCount() - 1;
            for (int i2 = 0; i2 <= rowCount2; i2++) {
                mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setPosition(i2);
                cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("Select count(*) from clienti where abprep=1 and codice ='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("codiceCli")) + "'")) <= 0.0d) {
                    mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(i2, mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("descrizione"), anywheresoftware.b4a.keywords.Common.DipToCurrent(60)), anywheresoftware.b4a.keywords.Common.DipToCurrent(60), mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetString("descrizione"));
                }
            }
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(0);
        }
        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        return "";
    }

    public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str, boolean z, int i, boolean z2, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        cassandraRisto.ital.fatturafm.ResumableSub_ValidaDatiFattura resumableSub_ValidaDatiFattura = new cassandraRisto.ital.fatturafm.ResumableSub_ValidaDatiFattura(null, str, z, i, z2, str2, str3);
        resumableSub_ValidaDatiFattura.resume(processBA, null);
        return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), resumableSub_ValidaDatiFattura);
    }

    public static class ResumableSub_ValidaDatiFattura extends anywheresoftware.b4a.BA.ResumableSub {
        boolean _bshowcopie;
        java.lang.String _datarecall;
        int _nfattura;
        boolean _recall;
        java.lang.String _scodcli;
        java.lang.String _where;
        int limit46;
        int limit8;
        cassandraRisto.ital.fatturafm parent;
        int step46;
        int step8;
        anywheresoftware.b4a.objects.collections.Map _mapdatife = null;
        boolean _bsplitpayment = false;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _ctmp = null;
        int _x = 0;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _tmpc = null;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _tmpcli = null;
        java.lang.String _squery = "";
        anywheresoftware.b4a.objects.collections.List _ltipodoc = null;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _ctmptd = null;
        java.lang.String _scodicerecalltipodoc = "";
        int _iposizionerecalltipodoc = 0;
        anywheresoftware.b4a.sql.SQL.CursorWrapper _tmpcrecall = null;
        java.lang.String _tmpk = "";
        int _icontaaggiunti = 0;
        int _xx = 0;
        java.lang.String _stmpvalidacli = "";
        anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _detailsdialog = null;
        java.lang.String _stmp = "";
        java.lang.Object _sf = null;
        anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
        int _esigibilitacli = 0;
        java.lang.String _tmptf = "";
        int _res = 0;

        public ResumableSub_ValidaDatiFattura(cassandraRisto.ital.fatturafm fatturafmVar, java.lang.String str, boolean z, int i, boolean z2, java.lang.String str2, java.lang.String str3) {
            this.parent = fatturafmVar;
            this._scodcli = str;
            this._recall = z;
            this._nfattura = i;
            this._bshowcopie = z2;
            this._datarecall = str2;
            this._where = str3;
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
                        this._mapdatife = new anywheresoftware.b4a.objects.collections.Map();
                        break;
                    case 1:
                        this.state = 156;
                        cassandraRisto.ital.fatturafm fatturafmVar = this.parent;
                        cassandraRisto.ital.main mainVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (!cassandraRisto.ital.main._v_attivafe) {
                            break;
                        } else {
                            this.state = 3;
                            break;
                        }
                    case 3:
                        this.state = 4;
                        break;
                    case 4:
                        this.state = 9;
                        cassandraRisto.ital.fatturafm fatturafmVar2 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv2(cassandraRisto.ital.fatturafm.mostCurrent.activityBA))) {
                            break;
                        } else {
                            this.state = 6;
                            break;
                        }
                    case 6:
                        this.state = 9;
                        anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, this._mapdatife);
                        return;
                    case 9:
                        this.state = 10;
                        this._bsplitpayment = true;
                        cassandraRisto.ital.fatturafm fatturafmVar3 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvv5(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._scodcli);
                        break;
                    case 10:
                        this.state = 26;
                        if (!anywheresoftware.b4a.keywords.Common.Not(this._recall)) {
                            break;
                        } else {
                            this.state = 12;
                            break;
                        }
                    case 12:
                        this.state = 13;
                        this._ctmp = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.fatturafm fatturafmVar4 = this.parent;
                        cassandraRisto.ital.main mainVar2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._ctmp = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("select venduto.codint,max(iva) as iva from headmov inner join venduto on venduto.nmov= headmov.nmov " + this._where + " group by venduto.codint"));
                        break;
                    case 13:
                        this.state = 25;
                        this.step8 = 1;
                        this.limit8 = this._ctmp.getRowCount() - 1;
                        this._x = 0;
                        this.state = 157;
                        break;
                    case 15:
                        this.state = 16;
                        this._ctmp.setPosition(this._x);
                        break;
                    case 16:
                        this.state = 19;
                        cassandraRisto.ital.fatturafm fatturafmVar5 = this.parent;
                        cassandraRisto.ital.main mainVar3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from iva where codice = " + this._ctmp.GetString("iva") + " and  natura=0 and aliquota2=0")) <= 0.0d) {
                            break;
                        } else {
                            this.state = 18;
                            break;
                        }
                    case 18:
                        this.state = 19;
                        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Nella configurazione delle aliquote IVA non sono stati inseriti i dati necessari sulla Natura(in caso di Aliquota=0).");
                        cassandraRisto.ital.fatturafm fatturafmVar6 = this.parent;
                        cassandraRisto.ital.main mainVar4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                        cassandraRisto.ital.fatturafm fatturafmVar7 = this.parent;
                        cassandraRisto.ital.main mainVar5 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, this._mapdatife);
                        return;
                    case 19:
                        this.state = 24;
                        if (!this._bsplitpayment) {
                            break;
                        } else {
                            cassandraRisto.ital.fatturafm fatturafmVar8 = this.parent;
                            cassandraRisto.ital.main mainVar6 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from iva where codice = " + this._ctmp.GetString("iva") + " and  natura=6 and aliquota2=0")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 21;
                                break;
                            }
                        }
                    case 21:
                        this.state = 24;
                        this._bsplitpayment = false;
                        break;
                    case 24:
                        this.state = 158;
                        break;
                    case 25:
                        this.state = 26;
                        this._ctmp.Close();
                        break;
                    case 26:
                        this.state = 27;
                        this._tmpc = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.fatturafm fatturafmVar9 = this.parent;
                        cassandraRisto.ital.main mainVar7 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._tmpc = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select * from FEdatiCli where Codice ='" + this._scodcli + "'"));
                        this._tmpcli = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.fatturafm fatturafmVar10 = this.parent;
                        cassandraRisto.ital.main mainVar8 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._tmpcli = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper3, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery("Select piva,codf,descrizione,provincia,cap,via,citta,mail from clienti where Codice ='" + this._scodcli + "'"));
                        this._tmpc.setPosition(0);
                        this._tmpcli.setPosition(0);
                        this._squery = "select * from FECodiciDocumento where AttivoDifferita > 0  order by AttivoDifferita desc, documento";
                        break;
                    case 27:
                        this.state = 30;
                        cassandraRisto.ital.fatturafm fatturafmVar11 = this.parent;
                        cassandraRisto.ital.main mainVar9 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.GetString("CodForn").equals(this._tmpcli.GetString("piva")) && !this._tmpcli.GetString("piva").equals("")) {
                            this.state = 29;
                            break;
                        }
                        break;
                    case 29:
                        this.state = 30;
                        this._squery = "select * from FECodiciDocumento where AttivoStessaPIDifferita> 0  order by AttivoStessaPIDifferita desc, documento";
                        break;
                    case 30:
                        this.state = 31;
                        this._ltipodoc = new anywheresoftware.b4a.objects.collections.List();
                        this._ltipodoc.Initialize();
                        this._ctmptd = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper4 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.fatturafm fatturafmVar12 = this.parent;
                        cassandraRisto.ital.main mainVar10 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._ctmptd = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper4, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuery(this._squery));
                        this._scodicerecalltipodoc = "";
                        this._iposizionerecalltipodoc = 0;
                        this._tmpcrecall = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        break;
                    case 31:
                        this.state = 43;
                        cassandraRisto.ital.fatturafm fatturafmVar13 = this.parent;
                        if (cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                            cassandraRisto.ital.fatturafm fatturafmVar14 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                this.state = 33;
                                break;
                            }
                        }
                        if (!this._recall) {
                            break;
                        } else {
                            this.state = 35;
                            break;
                        }
                    case 33:
                        this.state = 43;
                        cassandraRisto.ital.fatturafm fatturafmVar15 = this.parent;
                        this._scodicerecalltipodoc = anywheresoftware.b4a.BA.ObjectToString(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("TipoDocumento"));
                        break;
                    case 35:
                        this.state = 36;
                        this._tmpk = "";
                        break;
                    case 36:
                        this.state = 39;
                        if (this._datarecall.length() < 10) {
                            break;
                        } else {
                            this.state = 38;
                            break;
                        }
                    case 38:
                        this.state = 39;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        cassandraRisto.ital.fatturafm fatturafmVar16 = this.parent;
                        cassandraRisto.ital.main mainVar11 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.StringBuilder append = sb.append(cassandraRisto.ital.main._v_nnegozio).append("_");
                        cassandraRisto.ital.fatturafm fatturafmVar17 = this.parent;
                        cassandraRisto.ital.main mainVar12 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.StringBuilder append2 = append.append(cassandraRisto.ital.main._v_numcassa).append("_");
                        cassandraRisto.ital.fatturafm fatturafmVar18 = this.parent;
                        cassandraRisto.ital.fatturafm fatturafmVar19 = cassandraRisto.ital.fatturafm.mostCurrent;
                        this._tmpk = append2.append(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).append("_").append(this._datarecall.substring(6)).append("-").append(this._datarecall.substring(0, 2)).append("-").append(this._datarecall.substring(3, 5)).append("_").append(anywheresoftware.b4a.BA.NumberToString(this._nfattura)).toString();
                        break;
                    case 39:
                        this.state = 42;
                        if (this._tmpk.length() <= 0) {
                            break;
                        } else {
                            cassandraRisto.ital.fatturafm fatturafmVar20 = this.parent;
                            cassandraRisto.ital.main mainVar13 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select count(*) from FEDatiMov where Chiave ='" + this._tmpk + "'")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 41;
                                break;
                            }
                        }
                    case 41:
                        this.state = 42;
                        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper5 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
                        cassandraRisto.ital.fatturafm fatturafmVar21 = this.parent;
                        cassandraRisto.ital.main mainVar14 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._tmpcrecall = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper5, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select * from FEDatiMov where Chiave ='" + this._tmpk + "'"));
                        this._tmpcrecall.setPosition(0);
                        this._scodicerecalltipodoc = this._tmpcrecall.GetString("TipoDoc");
                        break;
                    case 42:
                        this.state = 43;
                        break;
                    case 43:
                        this.state = 44;
                        this._icontaaggiunti = 0;
                        break;
                    case 44:
                        this.state = 51;
                        this.step46 = 1;
                        this.limit46 = this._ctmptd.getRowCount() - 1;
                        this._xx = 0;
                        this.state = 159;
                        break;
                    case 46:
                        this.state = 47;
                        this._ctmptd.setPosition(this._xx);
                        this._ltipodoc.Add(this._ctmptd.GetString("descrizione"));
                        break;
                    case 47:
                        this.state = 50;
                        if (!this._scodicerecalltipodoc.equals(this._ctmptd.GetString("documento"))) {
                            break;
                        } else {
                            this.state = 49;
                            break;
                        }
                    case 49:
                        this.state = 50;
                        this._iposizionerecalltipodoc = this._icontaaggiunti;
                        this._scodicerecalltipodoc = "";
                        break;
                    case 50:
                        this.state = 160;
                        this._icontaaggiunti++;
                        break;
                    case 51:
                        this.state = 52;
                        cassandraRisto.ital.fatturafm fatturafmVar22 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        this._stmpvalidacli = cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(cassandraRisto.ital.fatturafm.mostCurrent.activityBA, this._tmpc.GetInt("TipoSoggettoCli"), this._tmpc.GetString("NomeCli"), this._tmpc.GetString("CognomeCli"), this._tmpcli.GetString("piva"), this._tmpcli.GetString("codf"), this._tmpc.GetString("NazioneCli"), this._tmpc.GetString("CodiceDestinatario"), this._tmpcli.GetString("descrizione"), this._tmpcli.GetString("provincia"), this._tmpcli.GetString("via"), this._tmpcli.GetString("citta"));
                        break;
                    case 52:
                        this.state = 132;
                        if (!this._stmpvalidacli.equals("")) {
                            this.state = 54;
                            break;
                        } else if (!this._scodicerecalltipodoc.equals("")) {
                            this.state = 56;
                            break;
                        } else if (this._ltipodoc.getSize() == 0) {
                            this.state = 58;
                            break;
                        } else {
                            this.state = 60;
                            break;
                        }
                    case 54:
                        this.state = 132;
                        java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("ERRORE VALIDAZIONE DATI DEL CLIENTE:\n" + this._stmpvalidacli);
                        cassandraRisto.ital.fatturafm fatturafmVar23 = this.parent;
                        cassandraRisto.ital.main mainVar15 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                        cassandraRisto.ital.fatturafm fatturafmVar24 = this.parent;
                        cassandraRisto.ital.main mainVar16 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        break;
                    case 56:
                        this.state = 132;
                        java.lang.CharSequence ObjectToCharSequence5 = anywheresoftware.b4a.BA.ObjectToCharSequence("Il tipo documento " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", this._scodicerecalltipodoc) + " non è disponibile");
                        cassandraRisto.ital.fatturafm fatturafmVar25 = this.parent;
                        cassandraRisto.ital.main mainVar17 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.CharSequence ObjectToCharSequence6 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                        cassandraRisto.ital.fatturafm fatturafmVar26 = this.parent;
                        cassandraRisto.ital.main mainVar18 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence5, ObjectToCharSequence6, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        break;
                    case 58:
                        this.state = 132;
                        java.lang.CharSequence ObjectToCharSequence7 = anywheresoftware.b4a.BA.ObjectToCharSequence("Non è disponibile nessun tipo documento per la generazione della fattura");
                        cassandraRisto.ital.fatturafm fatturafmVar27 = this.parent;
                        cassandraRisto.ital.main mainVar19 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.CharSequence ObjectToCharSequence8 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                        cassandraRisto.ital.fatturafm fatturafmVar28 = this.parent;
                        cassandraRisto.ital.main mainVar20 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence7, ObjectToCharSequence8, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        break;
                    case 60:
                        this.state = 61;
                        this._detailsdialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
                        this._stmp = "Dati per l'emissione della fattura";
                        anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog customLayoutDialog = this._detailsdialog;
                        java.lang.String str = this._stmp;
                        anywheresoftware.b4a.BA ba2 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                        cassandraRisto.ital.fatturafm fatturafmVar29 = this.parent;
                        cassandraRisto.ital.main mainVar21 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._sf = customLayoutDialog.ShowAsync(str, "Ok", "Annulla", "", ba2, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), true);
                        this._detailsdialog.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent(60.0f, cassandraRisto.ital.fatturafm.mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(90.0f, cassandraRisto.ital.fatturafm.mostCurrent.activityBA));
                        anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", cassandraRisto.ital.fatturafm.processBA, this, this._sf);
                        this.state = 161;
                        return;
                    case 61:
                        this.state = 66;
                        if (!this._bsplitpayment) {
                            break;
                        } else {
                            this.state = 63;
                            break;
                        }
                    case 63:
                        this.state = 66;
                        cassandraRisto.ital.fatturafm fatturafmVar30 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._peiva2.Add("Split Payment");
                        break;
                    case 66:
                        this.state = 67;
                        cassandraRisto.ital.fatturafm fatturafmVar31 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._ptipodocumento.AddAll(this._ltipodoc);
                        cassandraRisto.ital.fatturafm fatturafmVar32 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._ptipodocumento.setSelectedIndex(0);
                        break;
                    case 67:
                        this.state = 72;
                        if (this._tmpc.GetInt("TipoSoggettoCli") == 0) {
                            this.state = 69;
                            break;
                        } else {
                            this.state = 71;
                            break;
                        }
                    case 69:
                        this.state = 72;
                        cassandraRisto.ital.fatturafm fatturafmVar33 = this.parent;
                        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie;
                        cassandraRisto.ital.fatturafm fatturafmVar34 = this.parent;
                        anywheresoftware.b4a.objects.CSBuilder Size = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize().Size(14).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Numero di copie stampa di riepilogo: \n")).Bold().Size(20);
                        cassandraRisto.ital.fatturafm fatturafmVar35 = this.parent;
                        cassandraRisto.ital.main mainVar22 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(Size.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(java.lang.Integer.valueOf(cassandraRisto.ital.main._v_copiefe2))).PopAll().getObject()));
                        cassandraRisto.ital.fatturafm fatturafmVar36 = this.parent;
                        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie;
                        cassandraRisto.ital.fatturafm fatturafmVar37 = this.parent;
                        cassandraRisto.ital.main mainVar23 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        buttonWrapper2.setTag(java.lang.Integer.valueOf(cassandraRisto.ital.main._v_copiefe2));
                        break;
                    case 71:
                        this.state = 72;
                        cassandraRisto.ital.fatturafm fatturafmVar38 = this.parent;
                        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper3 = cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie;
                        cassandraRisto.ital.fatturafm fatturafmVar39 = this.parent;
                        anywheresoftware.b4a.objects.CSBuilder Size2 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize().Size(14).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Numero di copie stampa di riepilogo: \n")).Bold().Size(20);
                        cassandraRisto.ital.fatturafm fatturafmVar40 = this.parent;
                        cassandraRisto.ital.main mainVar24 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        buttonWrapper3.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(Size2.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(java.lang.Integer.valueOf(cassandraRisto.ital.main._v_copiefe))).PopAll().getObject()));
                        cassandraRisto.ital.fatturafm fatturafmVar41 = this.parent;
                        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper4 = cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie;
                        cassandraRisto.ital.fatturafm fatturafmVar42 = this.parent;
                        cassandraRisto.ital.main mainVar25 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        buttonWrapper4.setTag(java.lang.Integer.valueOf(cassandraRisto.ital.main._v_copiefe));
                        break;
                    case 72:
                        this.state = 73;
                        cassandraRisto.ital.fatturafm fatturafmVar43 = this.parent;
                        cassandraRisto.ital.main mainVar26 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._esigibilitacli = (int) java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select EsigibilitaIVA from FEdatiCli where Codice ='" + this._scodcli + "'"));
                        break;
                    case 73:
                        this.state = 78;
                        int i = this._esigibilitacli;
                        cassandraRisto.ital.fatturafm fatturafmVar44 = this.parent;
                        if (i <= cassandraRisto.ital.fatturafm.mostCurrent._peiva2.getSize() - 1) {
                            this.state = 75;
                            break;
                        } else {
                            this.state = 77;
                            break;
                        }
                    case 75:
                        this.state = 78;
                        cassandraRisto.ital.fatturafm fatturafmVar45 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._peiva2.setSelectedIndex(this._esigibilitacli);
                        break;
                    case 77:
                        this.state = 78;
                        cassandraRisto.ital.fatturafm fatturafmVar46 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._peiva2.setSelectedIndex(0);
                        break;
                    case 78:
                        this.state = 79;
                        cassandraRisto.ital.fatturafm fatturafmVar47 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie.setVisible(this._bshowcopie);
                        cassandraRisto.ital.fatturafm fatturafmVar48 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._baddcopie.setVisible(this._bshowcopie);
                        cassandraRisto.ital.fatturafm fatturafmVar49 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._blesscopie.setVisible(this._bshowcopie);
                        cassandraRisto.ital.fatturafm fatturafmVar50 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtcig.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                        cassandraRisto.ital.fatturafm fatturafmVar51 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtcup.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                        cassandraRisto.ital.fatturafm fatturafmVar52 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtidordacq.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                        this._tmptf = "";
                        break;
                    case 79:
                        this.state = 105;
                        cassandraRisto.ital.fatturafm fatturafmVar53 = this.parent;
                        if (cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                            cassandraRisto.ital.fatturafm fatturafmVar54 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.IsInitialized()) {
                                this.state = 81;
                                break;
                            }
                        }
                        if (this._recall) {
                            this.state = 83;
                            break;
                        } else if (!this._scodcli.equals("")) {
                            this.state = 100;
                            break;
                        } else {
                            break;
                        }
                    case 81:
                        this.state = 105;
                        cassandraRisto.ital.fatturafm fatturafmVar55 = this.parent;
                        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper = cassandraRisto.ital.fatturafm.mostCurrent._edtimportobollo;
                        cassandraRisto.ital.fatturafm fatturafmVar56 = this.parent;
                        editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("ImportoBollo")));
                        cassandraRisto.ital.fatturafm fatturafmVar57 = this.parent;
                        anywheresoftware.b4a.objects.SpinnerWrapper spinnerWrapper = cassandraRisto.ital.fatturafm.mostCurrent._peiva2;
                        cassandraRisto.ital.fatturafm fatturafmVar58 = this.parent;
                        spinnerWrapper.setSelectedIndex((int) anywheresoftware.b4a.BA.ObjectToNumber(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("EsigibilitaIVA")));
                        cassandraRisto.ital.fatturafm fatturafmVar59 = this.parent;
                        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper2 = cassandraRisto.ital.fatturafm.mostCurrent._edtmemo;
                        cassandraRisto.ital.fatturafm fatturafmVar60 = this.parent;
                        editTextWrapper2.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("Memo")));
                        cassandraRisto.ital.fatturafm fatturafmVar61 = this.parent;
                        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper3 = cassandraRisto.ital.fatturafm.mostCurrent._edtcig;
                        cassandraRisto.ital.fatturafm fatturafmVar62 = this.parent;
                        editTextWrapper3.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("CIG")));
                        cassandraRisto.ital.fatturafm fatturafmVar63 = this.parent;
                        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper4 = cassandraRisto.ital.fatturafm.mostCurrent._edtcup;
                        cassandraRisto.ital.fatturafm fatturafmVar64 = this.parent;
                        editTextWrapper4.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("CUP")));
                        cassandraRisto.ital.fatturafm fatturafmVar65 = this.parent;
                        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper5 = cassandraRisto.ital.fatturafm.mostCurrent._edtidordacq;
                        cassandraRisto.ital.fatturafm fatturafmVar66 = this.parent;
                        editTextWrapper5.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("IDOrdAcq")));
                        cassandraRisto.ital.fatturafm fatturafmVar67 = this.parent;
                        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper5 = cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie;
                        cassandraRisto.ital.fatturafm fatturafmVar68 = this.parent;
                        buttonWrapper5.setTag(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("Copie"));
                        cassandraRisto.ital.fatturafm fatturafmVar69 = this.parent;
                        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper6 = cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie;
                        cassandraRisto.ital.fatturafm fatturafmVar70 = this.parent;
                        anywheresoftware.b4a.objects.CSBuilder Size3 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize().Size(14).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Numero di copie stampa di riepilogo: \n")).Bold().Size(20);
                        cassandraRisto.ital.fatturafm fatturafmVar71 = this.parent;
                        buttonWrapper6.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(Size3.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie.getTag())).PopAll().getObject()));
                        cassandraRisto.ital.fatturafm fatturafmVar72 = this.parent;
                        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper6 = cassandraRisto.ital.fatturafm.mostCurrent._edtmailfe;
                        cassandraRisto.ital.fatturafm fatturafmVar73 = this.parent;
                        editTextWrapper6.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get("Mail")));
                        cassandraRisto.ital.fatturafm fatturafmVar74 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._ptipodocumento.setSelectedIndex(this._iposizionerecalltipodoc);
                        break;
                    case 83:
                        this.state = 84;
                        break;
                    case 84:
                        this.state = 95;
                        if (this._tmpcrecall.IsInitialized() && this._tmpcrecall.getRowCount() > 0) {
                            this.state = 86;
                            break;
                        }
                        break;
                    case 86:
                        this.state = 87;
                        this._tmpcrecall.setPosition(0);
                        cassandraRisto.ital.fatturafm fatturafmVar75 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtimportobollo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._tmpcrecall.GetString("ImportoBollo")));
                        cassandraRisto.ital.fatturafm fatturafmVar76 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtidordacq.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._tmpcrecall.GetString("IDOrdAcq")));
                        cassandraRisto.ital.fatturafm fatturafmVar77 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtcup.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._tmpcrecall.GetString("CUP")));
                        cassandraRisto.ital.fatturafm fatturafmVar78 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtcig.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._tmpcrecall.GetString("CIG")));
                        break;
                    case 87:
                        this.state = 94;
                        if (this._tmpcrecall.GetString("EsigibilitaIVA").equals("I")) {
                            this.state = 89;
                            break;
                        } else if (this._tmpcrecall.GetString("EsigibilitaIVA").equals("D")) {
                            this.state = 91;
                            break;
                        } else if (!this._tmpcrecall.GetString("EsigibilitaIVA").equals("S")) {
                            break;
                        } else {
                            this.state = 93;
                            break;
                        }
                    case 89:
                        this.state = 94;
                        cassandraRisto.ital.fatturafm fatturafmVar79 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._peiva2.setSelectedIndex(0);
                        break;
                    case 91:
                        this.state = 94;
                        cassandraRisto.ital.fatturafm fatturafmVar80 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._peiva2.setSelectedIndex(1);
                        break;
                    case 93:
                        this.state = 94;
                        cassandraRisto.ital.fatturafm fatturafmVar81 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._peiva2.setSelectedIndex(2);
                        break;
                    case 94:
                        this.state = 95;
                        cassandraRisto.ital.fatturafm fatturafmVar82 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._ptipodocumento.setSelectedIndex(this._iposizionerecalltipodoc);
                        break;
                    case 95:
                        this.state = 98;
                        cassandraRisto.ital.fatturafm fatturafmVar83 = this.parent;
                        cassandraRisto.ital.main mainVar27 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + "'")) <= 0.0d) {
                            break;
                        } else {
                            this.state = 97;
                            break;
                        }
                    case 97:
                        this.state = 98;
                        cassandraRisto.ital.fatturafm fatturafmVar84 = this.parent;
                        cassandraRisto.ital.main mainVar28 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select testo from TestiDoc where nmov='F_" + anywheresoftware.b4a.BA.NumberToString(this._nfattura) + "'");
                        break;
                    case 98:
                        this.state = 105;
                        break;
                    case 100:
                        this.state = 101;
                        break;
                    case 101:
                        this.state = 104;
                        cassandraRisto.ital.fatturafm fatturafmVar85 = this.parent;
                        cassandraRisto.ital.main mainVar29 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" + this._scodcli + "'")) <= 0.0d) {
                            break;
                        } else {
                            this.state = 103;
                            break;
                        }
                    case 103:
                        this.state = 104;
                        cassandraRisto.ital.fatturafm fatturafmVar86 = this.parent;
                        cassandraRisto.ital.main mainVar30 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ExecQuerySingleResult("select testo from TestiCli where codice='" + this._scodcli + "'");
                        break;
                    case 104:
                        this.state = 105;
                        break;
                    case 105:
                        this.state = 108;
                        if (!this._tmptf.equals("")) {
                            break;
                        } else {
                            cassandraRisto.ital.fatturafm fatturafmVar87 = this.parent;
                            cassandraRisto.ital.main mainVar31 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'")) <= 0.0d) {
                                break;
                            } else {
                                this.state = 107;
                                break;
                            }
                        }
                    case 107:
                        this.state = 108;
                        cassandraRisto.ital.fatturafm fatturafmVar88 = this.parent;
                        cassandraRisto.ital.main mainVar32 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        this._tmptf = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'");
                        break;
                    case 108:
                        this.state = 117;
                        cassandraRisto.ital.fatturafm fatturafmVar89 = this.parent;
                        if (!anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)) {
                            break;
                        } else {
                            this.state = 110;
                            break;
                        }
                    case 110:
                        this.state = 111;
                        cassandraRisto.ital.fatturafm fatturafmVar90 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtmemo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._tmptf));
                        break;
                    case 111:
                        this.state = 116;
                        if (this._recall) {
                            this.state = 113;
                            break;
                        } else {
                            this.state = 115;
                            break;
                        }
                    case 113:
                        this.state = 116;
                        cassandraRisto.ital.fatturafm fatturafmVar91 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtmailfe.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                        cassandraRisto.ital.fatturafm fatturafmVar92 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtmailfe.setEnabled(false);
                        break;
                    case 115:
                        this.state = 116;
                        cassandraRisto.ital.fatturafm fatturafmVar93 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtmailfe.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(this._tmpcli.GetString("mail")));
                        break;
                    case 116:
                        this.state = 117;
                        break;
                    case 117:
                        this.state = 118;
                        cassandraRisto.ital.fatturafm fatturafmVar94 = this.parent;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
                        anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", cassandraRisto.ital.fatturafm.processBA, this, this._sf);
                        this.state = 162;
                        return;
                    case 118:
                        this.state = 131;
                        int i2 = this._res;
                        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                        if (i2 != -1) {
                            break;
                        } else {
                            this.state = 120;
                            break;
                        }
                    case 120:
                        this.state = 121;
                        break;
                    case 121:
                        this.state = 124;
                        cassandraRisto.ital.fatturafm fatturafmVar95 = this.parent;
                        if (cassandraRisto.ital.fatturafm.mostCurrent._edtcig.getText().equals("")) {
                            cassandraRisto.ital.fatturafm fatturafmVar96 = this.parent;
                            if (cassandraRisto.ital.fatturafm.mostCurrent._edtcup.getText().equals("")) {
                                break;
                            }
                        }
                        cassandraRisto.ital.fatturafm fatturafmVar97 = this.parent;
                        if (!cassandraRisto.ital.fatturafm.mostCurrent._edtidordacq.getText().equals("")) {
                            break;
                        } else {
                            this.state = 123;
                            break;
                        }
                    case 123:
                        this.state = 124;
                        java.lang.CharSequence ObjectToCharSequence9 = anywheresoftware.b4a.BA.ObjectToCharSequence("Indicando un CIG o CUP è obbligatorio inserire un Codice Ordine di Acquisto");
                        cassandraRisto.ital.fatturafm fatturafmVar98 = this.parent;
                        cassandraRisto.ital.main mainVar33 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        java.lang.CharSequence ObjectToCharSequence10 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                        cassandraRisto.ital.fatturafm fatturafmVar99 = this.parent;
                        cassandraRisto.ital.main mainVar34 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence9, ObjectToCharSequence10, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        cassandraRisto.ital.fatturafm fatturafmVar100 = this.parent;
                        cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = true;
                        break;
                    case 124:
                        this.state = 125;
                        this._mapdatife.Initialize();
                        anywheresoftware.b4a.objects.collections.Map map = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar101 = this.parent;
                        map.Put("ImportoBollo", cassandraRisto.ital.fatturafm.mostCurrent._edtimportobollo.getText());
                        anywheresoftware.b4a.objects.collections.Map map2 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar102 = this.parent;
                        map2.Put("EsigibilitaIVA", java.lang.Integer.valueOf(cassandraRisto.ital.fatturafm.mostCurrent._peiva2.getSelectedIndex()));
                        anywheresoftware.b4a.objects.collections.Map map3 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar103 = this.parent;
                        cassandraRisto.ital.modfunstr modfunstrVar = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                        anywheresoftware.b4a.BA ba3 = cassandraRisto.ital.fatturafm.mostCurrent.activityBA;
                        cassandraRisto.ital.fatturafm fatturafmVar104 = this.parent;
                        map3.Put("Memo", cassandraRisto.ital.modfunstr._left(ba3, cassandraRisto.ital.fatturafm.mostCurrent._edtmemo.getText().replace("'", "`").replace("%", "").replace("[", "").replace("#", "").replace(",", "").replace("\n", " "), 1000L));
                        anywheresoftware.b4a.objects.collections.Map map4 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar105 = this.parent;
                        map4.Put("CIG", cassandraRisto.ital.fatturafm.mostCurrent._edtcig.getText());
                        anywheresoftware.b4a.objects.collections.Map map5 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar106 = this.parent;
                        map5.Put("CUP", cassandraRisto.ital.fatturafm.mostCurrent._edtcup.getText());
                        anywheresoftware.b4a.objects.collections.Map map6 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar107 = this.parent;
                        map6.Put("IDOrdAcq", cassandraRisto.ital.fatturafm.mostCurrent._edtidordacq.getText());
                        anywheresoftware.b4a.objects.collections.Map map7 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar108 = this.parent;
                        map7.Put("IDOrdAcq", cassandraRisto.ital.fatturafm.mostCurrent._edtidordacq.getText());
                        anywheresoftware.b4a.objects.collections.Map map8 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar109 = this.parent;
                        map8.Put("TipoDocumento", cassandraRisto.ital.fatturafm.mostCurrent._ptipodocumento.getSelectedItem().substring(0, 4));
                        break;
                    case 125:
                        this.state = 130;
                        if (this._recall) {
                            this.state = 127;
                            break;
                        } else {
                            this.state = 129;
                            break;
                        }
                    case 127:
                        this.state = 130;
                        anywheresoftware.b4a.objects.collections.Map map9 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar110 = this.parent;
                        map9.Put("Totale", java.lang.Double.valueOf(cassandraRisto.ital.fatturafm._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
                        break;
                    case 129:
                        this.state = 130;
                        anywheresoftware.b4a.objects.collections.Map map10 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar111 = this.parent;
                        map10.Put("Totale", cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.GetDouble("totale"));
                        break;
                    case 130:
                        this.state = 131;
                        anywheresoftware.b4a.objects.collections.Map map11 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar112 = this.parent;
                        map11.Put("Copie", cassandraRisto.ital.fatturafm.mostCurrent._bnumerocopie.getTag());
                        anywheresoftware.b4a.objects.collections.Map map12 = this._mapdatife;
                        cassandraRisto.ital.fatturafm fatturafmVar113 = this.parent;
                        map12.Put("Mail", cassandraRisto.ital.fatturafm.mostCurrent._edtmailfe.getText());
                        break;
                    case 131:
                        this.state = 132;
                        break;
                    case 132:
                        this.state = 137;
                        if (!this._ctmptd.IsInitialized()) {
                            break;
                        } else {
                            this.state = 134;
                            break;
                        }
                    case 134:
                        this.state = 137;
                        this._ctmptd.Close();
                        break;
                    case 137:
                        this.state = 138;
                        break;
                    case 138:
                        this.state = 143;
                        if (!this._tmpcrecall.IsInitialized()) {
                            break;
                        } else {
                            this.state = 140;
                            break;
                        }
                    case 140:
                        this.state = 143;
                        this._tmpcrecall.Close();
                        break;
                    case 143:
                        this.state = 144;
                        break;
                    case 144:
                        this.state = 149;
                        if (!this._tmpc.IsInitialized()) {
                            break;
                        } else {
                            this.state = 146;
                            break;
                        }
                    case 146:
                        this.state = 149;
                        this._tmpc.Close();
                        break;
                    case 149:
                        this.state = 150;
                        break;
                    case 150:
                        this.state = 155;
                        if (!this._tmpcli.IsInitialized()) {
                            break;
                        } else {
                            this.state = 152;
                            break;
                        }
                    case 152:
                        this.state = 155;
                        this._tmpcli.Close();
                        break;
                    case 155:
                        this.state = 156;
                        break;
                    case 156:
                        this.state = -1;
                        anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this, this._mapdatife);
                        return;
                    case 157:
                        this.state = 25;
                        if ((this.step8 > 0 && this._x <= this.limit8) || (this.step8 < 0 && this._x >= this.limit8)) {
                            this.state = 15;
                            break;
                        }
                        break;
                    case 158:
                        this.state = 157;
                        this._x = this._x + 0 + this.step8;
                        break;
                    case 159:
                        this.state = 51;
                        if ((this.step46 > 0 && this._xx <= this.limit46) || (this.step46 < 0 && this._xx >= this.limit46)) {
                            this.state = 46;
                            break;
                        }
                        break;
                    case 160:
                        this.state = 159;
                        this._xx = this._xx + 0 + this.step46;
                        break;
                    case 161:
                        this.state = 61;
                        this._pnl = (anywheresoftware.b4a.objects.PanelWrapper) objArr[0];
                        this._pnl.LoadLayout("schedaFatturaE", cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        cassandraRisto.ital.fatturafm fatturafmVar114 = this.parent;
                        cassandraRisto.ital.mod1 mod1Var4 = cassandraRisto.ital.fatturafm.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(cassandraRisto.ital.fatturafm.mostCurrent.activityBA);
                        cassandraRisto.ital.fatturafm fatturafmVar115 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._edtimportobollo.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                        cassandraRisto.ital.fatturafm fatturafmVar116 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._peiva2.Add("Immediata");
                        cassandraRisto.ital.fatturafm fatturafmVar117 = this.parent;
                        cassandraRisto.ital.fatturafm.mostCurrent._peiva2.Add("Differita");
                        break;
                    case 162:
                        this.state = 118;
                        this._res = ((java.lang.Integer) objArr[0]).intValue();
                        break;
                }
            }
        }
    }

    public static void _dialog_ready(anywheresoftware.b4a.objects.PanelWrapper panelWrapper) throws java.lang.Exception {
    }

    public static void _dialog_result(int i) throws java.lang.Exception {
    }

    public static java.lang.String _viewart_click() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvv0 = "  Sub ViewArt_Click";
        try {
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setPosition(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(cursorWrapper, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuery("Select descrizione,importo from venduto where nmov = " + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetString("nmov")));
            if (cursorWrapper2.getRowCount() > 0) {
                anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
                list.Initialize();
                int rowCount = cursorWrapper2.getRowCount() - 1;
                for (int i = 0; i <= rowCount; i++) {
                    cursorWrapper2.setPosition(i);
                    list.Add(cursorWrapper2.GetString("descrizione") + "    € " + anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper2.GetDouble("importo").doubleValue(), 1, 2, 2, false));
                }
                new com.maximus.id.id();
                com.maximus.id.id.InputList1(list, "Elenco articoli del movimento " + mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetString("nmov"), mostCurrent.activityBA);
                return "";
            }
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
            return "";
        }
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
