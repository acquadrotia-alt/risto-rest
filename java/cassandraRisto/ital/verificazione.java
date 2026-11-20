package cassandraRisto.ital;

/* loaded from: classes.dex */
public class verificazione extends android.app.Activity implements anywheresoftware.b4a.B4AActivity {
    static boolean afterFirstLayout = false;
    public static boolean dontPause = false;
    public static final boolean fullScreen = false;
    public static final boolean includeTitle = true;
    public static cassandraRisto.ital.verificazione mostCurrent;
    public static java.lang.ref.WeakReference<android.app.Activity> previousOne;
    public static anywheresoftware.b4a.BA processBA;
    anywheresoftware.b4a.objects.ActivityWrapper _activity;
    anywheresoftware.b4a.BA activityBA;
    anywheresoftware.b4a.BALayout layout;
    java.util.ArrayList<anywheresoftware.b4a.B4AMenuItem> menuItems;
    static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
    private java.lang.Boolean onKeySubExist = null;
    private java.lang.Boolean onKeyUpSubExist = null;
    public anywheresoftware.b4a.keywords.Common __c = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_close1 = null;
    public anywheresoftware.b4a.objects.PanelWrapper _ver_pnlserv = null;
    public anywheresoftware.b4a.objects.PanelWrapper _ver_pnlver = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_close2 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_cf = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_dataora = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _ver_edt_descrriga = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_stampascontr = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _ver_edt_mfda = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _ver_edt_mfa = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _ver_edt_numdadgfe = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _ver_edt_numadgfe = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_stampadgfescontr = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _ver_edt_dgfechiusda = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _ver_edt_dgfechiusa = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_stampadgfechius = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_titolover = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_stampamfdate = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_stampamfnum = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_datada = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_dataa = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_giornodgfe = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _ver_edt_importo = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_panelserv = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_fisc = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_inizializza = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_panelver = null;
    public anywheresoftware.b4a.objects.CSBuilder _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.clsverificazione _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_setdataver = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_sendlogo = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _annullastampa = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _contrasto = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _intensita = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _luminosita = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_importo = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_descrriga = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_scontrprova = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_stampamf = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_datada = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_dataa = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_mfda = null;
    public anywheresoftware.b4a.objects.LabelWrapper _ver_lbl_mfa = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_panelrt = null;
    public anywheresoftware.b4a.objects.PanelWrapper _ver_pnlutilityrt = null;
    public anywheresoftware.b4a.objects.ListViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
    public java.lang.Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_closert = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_panelverrt = null;
    public anywheresoftware.b4a.objects.PanelWrapper _pnlcensimento = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_censimento_cft = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_censimento_pil = null;
    public anywheresoftware.b4a.objects.PanelWrapper _pnlattivazione = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _btn_attivazione_data = null;
    public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk_attivazione_telematico = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_attivazione_cft = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_attivazione_pil = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_attivazione_cfe = null;
    public anywheresoftware.b4a.objects.LabelWrapper _lblrt = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_inttecnico_cft = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_inttecnico_pil = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_inttecnico_note = null;
    public anywheresoftware.b4a.objects.PanelWrapper _pnlinttecnico = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _btn_inttecnico_cit = null;
    public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tgl_evento_fs = null;
    public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tgl_evento_d1 = null;
    public anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper _tgl_evento_d2 = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _btn_evento_cod = null;
    public anywheresoftware.b4a.objects.EditTextWrapper _edt_evento_des = null;
    public anywheresoftware.b4a.objects.PanelWrapper _pnlevento = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _ver_btn_infort = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _sbloccamemorie = null;
    public anywheresoftware.b4a.objects.ButtonWrapper _bloccamemorie = null;
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
    public cassandraRisto.ital.httputils2service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.xuiviewsutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.app.Activity activity;
        super.onCreate(bundle);
        mostCurrent = this;
        if (processBA == null) {
            processBA = new anywheresoftware.b4a.BA(getApplicationContext(), null, null, "cassandraRisto.ital", "cassandraRisto.ital.verificazione");
            processBA.loadHtSubs(getClass());
            anywheresoftware.b4a.BALayout.setDeviceScale(getApplicationContext().getResources().getDisplayMetrics().density);
        } else if (previousOne != null && (activity = previousOne.get()) != null && activity != this) {
            anywheresoftware.b4a.BA.LogInfo("Killing previous instance (verificazione).");
            activity.finish();
        }
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
        processBA.sharedProcessBA.activityBA = null;
        this.layout = new anywheresoftware.b4a.BALayout(this);
        setContentView(this.layout);
        afterFirstLayout = false;
        cassandraRisto.ital.verificazione.WaitForLayout waitForLayout = new cassandraRisto.ital.verificazione.WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, waitForLayout, false)) {
            anywheresoftware.b4a.BA.handler.postDelayed(waitForLayout, 5L);
        }
    }

    static class WaitForLayout implements java.lang.Runnable {
        WaitForLayout() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!cassandraRisto.ital.verificazione.afterFirstLayout && cassandraRisto.ital.verificazione.mostCurrent != null) {
                if (cassandraRisto.ital.verificazione.mostCurrent.layout.getWidth() == 0) {
                    anywheresoftware.b4a.BA.handler.postDelayed(this, 5L);
                    return;
                }
                cassandraRisto.ital.verificazione.mostCurrent.layout.getLayoutParams().height = cassandraRisto.ital.verificazione.mostCurrent.layout.getHeight();
                cassandraRisto.ital.verificazione.mostCurrent.layout.getLayoutParams().width = cassandraRisto.ital.verificazione.mostCurrent.layout.getWidth();
                cassandraRisto.ital.verificazione.afterFirstLayout = true;
                cassandraRisto.ital.verificazione.mostCurrent.afterFirstLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afterFirstLayout() {
        if (this == mostCurrent) {
            this.activityBA = new anywheresoftware.b4a.BA(this, this.layout, processBA, "cassandraRisto.ital", "cassandraRisto.ital.verificazione");
            processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<>(this.activityBA);
            anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
            this._activity = new anywheresoftware.b4a.objects.ActivityWrapper(this.activityBA, "activity");
            anywheresoftware.b4a.Msgbox.isDismissing = false;
            if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(processBA)) {
                if (isFirst) {
                    processBA.raiseEvent2(null, true, "SHELL", false, new java.lang.Object[0]);
                }
                processBA.raiseEvent2(null, true, "CREATE", true, "cassandraRisto.ital.verificazione", processBA, this.activityBA, this._activity, java.lang.Float.valueOf(anywheresoftware.b4a.keywords.Common.Density), mostCurrent);
                this._activity.reinitializeForShell(this.activityBA, "activity");
            }
            initializeProcessGlobals();
            initializeGlobals();
            anywheresoftware.b4a.BA.LogInfo("** Activity (verificazione) Create, isFirst = " + isFirst + " **");
            processBA.raiseEvent2(null, true, "activity_create", false, java.lang.Boolean.valueOf(isFirst));
            isFirst = false;
            if (this == mostCurrent) {
                processBA.setActivityPaused(false);
                anywheresoftware.b4a.BA.LogInfo("** Activity (verificazione) Resume **");
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
            add.setOnMenuItemClickListener(new cassandraRisto.ital.verificazione.B4AMenuItemsClickListener(next.eventName.toLowerCase(anywheresoftware.b4a.BA.cul)));
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
            cassandraRisto.ital.verificazione.processBA.raiseEventFromUI(menuItem.getTitle(), this.eventName + "_click", new java.lang.Object[0]);
            return true;
        }
    }

    public static java.lang.Class<?> getObject() {
        return cassandraRisto.ital.verificazione.class;
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
                cassandraRisto.ital.verificazione.HandleKeyDelayed handleKeyDelayed = new cassandraRisto.ital.verificazione.HandleKeyDelayed(this, null);
                handleKeyDelayed.kc = i;
                anywheresoftware.b4a.BA.handler.post(handleKeyDelayed);
                return true;
            }
            if (new cassandraRisto.ital.verificazione.HandleKeyDelayed(this, null).runDirectly(i)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private class HandleKeyDelayed implements java.lang.Runnable {
        int kc;

        private HandleKeyDelayed() {
        }

        /* synthetic */ HandleKeyDelayed(cassandraRisto.ital.verificazione verificazioneVar, cassandraRisto.ital.verificazione.1 r2) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            runDirectly(this.kc);
        }

        public boolean runDirectly(int i) {
            java.lang.Boolean bool = (java.lang.Boolean) cassandraRisto.ital.verificazione.processBA.raiseEvent2(cassandraRisto.ital.verificazione.this._activity, false, "activity_keypress", false, java.lang.Integer.valueOf(i));
            if (bool == null || bool.booleanValue()) {
                return true;
            }
            if (i != 4) {
                return false;
            }
            cassandraRisto.ital.verificazione.this.finish();
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
                anywheresoftware.b4a.BA.LogInfo("** Activity (verificazione) Pause, UserClosed = " + this.activityBA.activity.isFinishing() + " **");
            } else {
                anywheresoftware.b4a.BA.LogInfo("** Activity (verificazione) Pause event (activity is not paused). **");
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
            anywheresoftware.b4a.BA.handler.post(new cassandraRisto.ital.verificazione.ResumeMessage(mostCurrent));
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
            cassandraRisto.ital.verificazione verificazioneVar = cassandraRisto.ital.verificazione.mostCurrent;
            if (verificazioneVar != null && verificazioneVar == this.activity.get()) {
                cassandraRisto.ital.verificazione.processBA.setActivityPaused(false);
                anywheresoftware.b4a.BA.LogInfo("** Activity (verificazione) Resume **");
                if (verificazioneVar == cassandraRisto.ital.verificazione.mostCurrent) {
                    cassandraRisto.ital.verificazione.processBA.raiseEvent(verificazioneVar._activity, "activity_resume", (java.lang.Object[]) null);
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

    /* JADX WARN: Multi-variable type inference failed */
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
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6("Layout_VerificazioneMF");
                mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._initialize(processBA);
                mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize(mostCurrent.activityBA, "lv");
                anywheresoftware.b4a.objects.ListViewWrapper listViewWrapper = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.objects.CSBuilder Initialize = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize();
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
                listViewWrapper.AddSingleLine(anywheresoftware.b4a.BA.ObjectToCharSequence(Initialize.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Size(25).Color(-13860350).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Elenco Funzioni RT")).PopAll().getObject()));
                anywheresoftware.b4a.objects.ListViewWrapper listViewWrapper2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.objects.CSBuilder cSBuilder = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper2 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size = cSBuilder.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(16);
                anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(Size.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("     Genera chiave")).PopAll().getObject());
                anywheresoftware.b4a.objects.CSBuilder cSBuilder2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper3 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size2 = cSBuilder2.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(14);
                anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
                listViewWrapper2.AddTwoLines(ObjectToCharSequence, anywheresoftware.b4a.BA.ObjectToCharSequence(Size2.Color(-7829368).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("       Esegui la generazione della chiave privata")).PopAll().getObject()));
                anywheresoftware.b4a.objects.ListViewWrapper listViewWrapper3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.objects.CSBuilder cSBuilder3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper4 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size3 = cSBuilder3.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(16);
                anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(Size3.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("     Censimento")).PopAll().getObject());
                anywheresoftware.b4a.objects.CSBuilder cSBuilder4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper5 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size4 = cSBuilder4.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(14);
                anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
                listViewWrapper3.AddTwoLines(ObjectToCharSequence2, anywheresoftware.b4a.BA.ObjectToCharSequence(Size4.Color(-7829368).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("       Esegui il censimento")).PopAll().getObject()));
                anywheresoftware.b4a.objects.ListViewWrapper listViewWrapper4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.objects.CSBuilder cSBuilder5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper6 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size5 = cSBuilder5.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(16);
                anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
                java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence(Size5.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("     Attivazione")).PopAll().getObject());
                anywheresoftware.b4a.objects.CSBuilder cSBuilder6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper7 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size6 = cSBuilder6.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(14);
                anywheresoftware.b4a.keywords.constants.Colors colors6 = anywheresoftware.b4a.keywords.Common.Colors;
                listViewWrapper4.AddTwoLines(ObjectToCharSequence3, anywheresoftware.b4a.BA.ObjectToCharSequence(Size6.Color(-7829368).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("       Imposta anche la data di 'messa in servizio'")).PopAll().getObject()));
                anywheresoftware.b4a.objects.ListViewWrapper listViewWrapper5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.objects.CSBuilder cSBuilder7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper8 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size7 = cSBuilder7.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(16);
                anywheresoftware.b4a.keywords.constants.Colors colors7 = anywheresoftware.b4a.keywords.Common.Colors;
                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(Size7.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("     In Servizio")).PopAll().getObject());
                anywheresoftware.b4a.objects.CSBuilder cSBuilder8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper9 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size8 = cSBuilder8.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(14);
                anywheresoftware.b4a.keywords.constants.Colors colors8 = anywheresoftware.b4a.keywords.Common.Colors;
                listViewWrapper5.AddTwoLines(ObjectToCharSequence4, anywheresoftware.b4a.BA.ObjectToCharSequence(Size8.Color(-7829368).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("       Esegui la procedura di messa in servizio")).PopAll().getObject()));
                anywheresoftware.b4a.objects.ListViewWrapper listViewWrapper6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.objects.CSBuilder cSBuilder9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper10 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size9 = cSBuilder9.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(16);
                anywheresoftware.b4a.keywords.constants.Colors colors9 = anywheresoftware.b4a.keywords.Common.Colors;
                java.lang.CharSequence ObjectToCharSequence5 = anywheresoftware.b4a.BA.ObjectToCharSequence(Size9.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("     Intervento Tecnico")).PopAll().getObject());
                anywheresoftware.b4a.objects.CSBuilder cSBuilder10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper11 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size10 = cSBuilder10.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(14);
                anywheresoftware.b4a.keywords.constants.Colors colors10 = anywheresoftware.b4a.keywords.Common.Colors;
                listViewWrapper6.AddTwoLines(ObjectToCharSequence5, anywheresoftware.b4a.BA.ObjectToCharSequence(Size10.Color(-7829368).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("       Per gestire l'inizio e la fine della verifica")).PopAll().getObject()));
                anywheresoftware.b4a.objects.ListViewWrapper listViewWrapper7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
                anywheresoftware.b4a.objects.CSBuilder cSBuilder11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper12 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size11 = cSBuilder11.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(16);
                anywheresoftware.b4a.keywords.constants.Colors colors11 = anywheresoftware.b4a.keywords.Common.Colors;
                java.lang.CharSequence ObjectToCharSequence6 = anywheresoftware.b4a.BA.ObjectToCharSequence(Size11.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("     Evento")).PopAll().getObject());
                anywheresoftware.b4a.objects.CSBuilder cSBuilder12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper13 = anywheresoftware.b4a.keywords.Common.Typeface;
                anywheresoftware.b4a.objects.CSBuilder Size12 = cSBuilder12.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(14);
                anywheresoftware.b4a.keywords.constants.Colors colors12 = anywheresoftware.b4a.keywords.Common.Colors;
                listViewWrapper7.AddTwoLines(ObjectToCharSequence6, anywheresoftware.b4a.BA.ObjectToCharSequence(Size12.Color(-7829368).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("       Esegue uno degli eventi di cambio di stato")).PopAll().getObject()));
                mostCurrent._lblrt.setTextColor(-13860350);
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._rt_leggistato(false);
                mostCurrent._ver_pnlutilityrt.AddView((android.view.View) mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject(), 0, 0, anywheresoftware.b4a.keywords.Common.PerXToCurrent(50.0f, mostCurrent.activityBA), anywheresoftware.b4a.keywords.Common.PerYToCurrent(100.0f, mostCurrent.activityBA));
                mostCurrent._activity.setTitle(anywheresoftware.b4a.BA.ObjectToCharSequence("Verificazione SF"));
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                    cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.equals("")) {
                        anywheresoftware.b4a.objects.LabelWrapper labelWrapper = mostCurrent._ver_lbl_titolover;
                        java.lang.StringBuilder append = new java.lang.StringBuilder().append(mostCurrent._ver_lbl_titolover.getText()).append(" ");
                        cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        labelWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(append.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).toString()));
                    }
                }
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = mostCurrent._ver_btn_close1;
                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors13 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba, -65536, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = mostCurrent._ver_btn_close2;
                cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba2 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors14 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper2.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba2, -65536, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper3 = mostCurrent._ver_btn_closert;
                cassandraRisto.ital.mod1 mod1Var6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba3 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors15 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper3.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba3, -65536, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper4 = mostCurrent._ver_btn_cf;
                cassandraRisto.ital.mod1 mod1Var7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba4 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors16 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper4.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba4, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper5 = mostCurrent._ver_btn_dataora;
                cassandraRisto.ital.mod1 mod1Var8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba5 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors17 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper5.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba5, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper6 = mostCurrent._ver_btn_stampascontr;
                cassandraRisto.ital.mod1 mod1Var9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba6 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors18 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper6.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba6, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper7 = mostCurrent._ver_btn_infort;
                cassandraRisto.ital.mod1 mod1Var10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba7 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors19 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper7.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba7, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper8 = mostCurrent._ver_btn_stampadgfescontr;
                cassandraRisto.ital.mod1 mod1Var11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba8 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors20 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper8.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba8, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper9 = mostCurrent._ver_btn_stampadgfechius;
                cassandraRisto.ital.mod1 mod1Var12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba9 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors21 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper9.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba9, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper10 = mostCurrent._ver_btn_stampamfdate;
                cassandraRisto.ital.mod1 mod1Var13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba10 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors22 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper10.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba10, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper11 = mostCurrent._ver_btn_stampamfnum;
                cassandraRisto.ital.mod1 mod1Var14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba11 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors23 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper11.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba11, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper12 = mostCurrent._ver_btn_datada;
                cassandraRisto.ital.mod1 mod1Var15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba12 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors24 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper12.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba12, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper13 = mostCurrent._ver_btn_dataa;
                cassandraRisto.ital.mod1 mod1Var16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba13 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors25 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper13.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba13, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper14 = mostCurrent._ver_btn_giornodgfe;
                cassandraRisto.ital.mod1 mod1Var17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba14 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors26 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper14.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba14, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper15 = mostCurrent._ver_btn_panelserv;
                cassandraRisto.ital.mod1 mod1Var18 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba15 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors27 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper15.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba15, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper16 = mostCurrent._ver_btn_panelrt;
                cassandraRisto.ital.mod1 mod1Var19 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba16 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors28 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper16.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba16, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper17 = mostCurrent._ver_btn_panelverrt;
                cassandraRisto.ital.mod1 mod1Var20 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba17 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors29 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper17.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba17, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper18 = mostCurrent._ver_btn_fisc;
                cassandraRisto.ital.mod1 mod1Var21 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba18 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors30 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper18.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba18, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper19 = mostCurrent._ver_btn_setdataver;
                cassandraRisto.ital.mod1 mod1Var22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba19 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors31 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper19.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba19, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper20 = mostCurrent._ver_btn_inizializza;
                cassandraRisto.ital.mod1 mod1Var23 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba20 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors32 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper20.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba20, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper21 = mostCurrent._ver_btn_panelver;
                cassandraRisto.ital.mod1 mod1Var24 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba21 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors33 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper21.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba21, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper22 = mostCurrent._annullastampa;
                cassandraRisto.ital.mod1 mod1Var25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba22 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors34 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper22.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba22, -16711681, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper23 = mostCurrent._ver_btn_sendlogo;
                cassandraRisto.ital.mod1 mod1Var26 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba23 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors35 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper23.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba23, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper24 = mostCurrent._sbloccamemorie;
                cassandraRisto.ital.mod1 mod1Var27 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba24 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors36 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper24.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba24, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper25 = mostCurrent._bloccamemorie;
                cassandraRisto.ital.mod1 mod1Var28 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba25 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors37 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper25.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba25, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper26 = mostCurrent._ver_btn_sendlogo;
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                buttonWrapper26.setVisible(cassandraRisto.ital.main._v_tipointerfaccia != 1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper27 = mostCurrent._contrasto;
                cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                buttonWrapper27.setVisible(cassandraRisto.ital.main._v_matricola.startsWith("ST"));
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper28 = mostCurrent._luminosita;
                cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                buttonWrapper28.setVisible(cassandraRisto.ital.main._v_matricola.startsWith("ST"));
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper29 = mostCurrent._intensita;
                cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                buttonWrapper29.setVisible(cassandraRisto.ital.main._v_matricola.startsWith("ST"));
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper30 = mostCurrent._contrasto;
                cassandraRisto.ital.mod1 mod1Var29 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba26 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors38 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper30.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba26, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper31 = mostCurrent._luminosita;
                cassandraRisto.ital.mod1 mod1Var30 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba27 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors39 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper31.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba27, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper32 = mostCurrent._intensita;
                cassandraRisto.ital.mod1 mod1Var31 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                anywheresoftware.b4a.BA ba28 = mostCurrent.activityBA;
                anywheresoftware.b4a.keywords.constants.Colors colors40 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper32.setBackground(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvv0(ba28, -16776961, 25).getObject());
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper33 = mostCurrent._ver_btn_close2;
                anywheresoftware.b4a.keywords.constants.Colors colors41 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper33.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper34 = mostCurrent._ver_btn_cf;
                anywheresoftware.b4a.keywords.constants.Colors colors42 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper34.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper35 = mostCurrent._ver_btn_dataora;
                anywheresoftware.b4a.keywords.constants.Colors colors43 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper35.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper36 = mostCurrent._ver_btn_stampascontr;
                anywheresoftware.b4a.keywords.constants.Colors colors44 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper36.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper37 = mostCurrent._ver_btn_stampadgfescontr;
                anywheresoftware.b4a.keywords.constants.Colors colors45 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper37.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper38 = mostCurrent._ver_btn_stampadgfechius;
                anywheresoftware.b4a.keywords.constants.Colors colors46 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper38.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper39 = mostCurrent._ver_btn_stampamfdate;
                anywheresoftware.b4a.keywords.constants.Colors colors47 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper39.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper40 = mostCurrent._ver_btn_stampamfnum;
                anywheresoftware.b4a.keywords.constants.Colors colors48 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper40.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper41 = mostCurrent._ver_btn_datada;
                anywheresoftware.b4a.keywords.constants.Colors colors49 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper41.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper42 = mostCurrent._ver_btn_dataa;
                anywheresoftware.b4a.keywords.constants.Colors colors50 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper42.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper43 = mostCurrent._ver_btn_giornodgfe;
                anywheresoftware.b4a.keywords.constants.Colors colors51 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper43.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper44 = mostCurrent._ver_btn_panelserv;
                anywheresoftware.b4a.keywords.constants.Colors colors52 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper44.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper45 = mostCurrent._ver_btn_panelrt;
                anywheresoftware.b4a.keywords.constants.Colors colors53 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper45.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper46 = mostCurrent._ver_btn_panelverrt;
                anywheresoftware.b4a.keywords.constants.Colors colors54 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper46.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper47 = mostCurrent._ver_btn_setdataver;
                anywheresoftware.b4a.keywords.constants.Colors colors55 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper47.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper48 = mostCurrent._ver_btn_inizializza;
                anywheresoftware.b4a.keywords.constants.Colors colors56 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper48.setTextColor(-1);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper49 = mostCurrent._ver_btn_panelver;
                anywheresoftware.b4a.keywords.constants.Colors colors57 = anywheresoftware.b4a.keywords.Common.Colors;
                buttonWrapper49.setTextColor(-1);
                cassandraRisto.ital.mod1 mod1Var32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlserv.getObject()), 0.0f);
                cassandraRisto.ital.mod1 mod1Var33 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlutilityrt.getObject()), 0.0f);
                mostCurrent._ver_pnlserv.setVisible(false);
                mostCurrent._ver_pnlutilityrt.setVisible(false);
                cassandraRisto.ital.mod1 mod1Var34 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlver.getObject()), 7.0f);
                mostCurrent._ver_pnlver.setVisible(true);
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _activity_resume() throws java.lang.Exception {
        boolean z;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 1;
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.phone.Phone phone = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
        anywheresoftware.b4a.BA ba = processBA;
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.phone.Phone.SetScreenBrightness(ba, (float) cassandraRisto.ital.main._v_screenbrightness);
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
            mostCurrent._intensita.setTag(0);
            mostCurrent._contrasto.setTag(0);
            mostCurrent._luminosita.setTag(0);
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            int _mf_getdisplaystampa = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_getdisplaystampa("1");
            if (_mf_getdisplaystampa >= 0) {
                mostCurrent._intensita.setTag(java.lang.Integer.valueOf(_mf_getdisplaystampa));
                mostCurrent._intensita.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Intensità di stampa =" + anywheresoftware.b4a.BA.NumberToString(_mf_getdisplaystampa)));
            } else {
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Errore Richiesta dati");
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            }
            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            int _mf_getdisplaystampa2 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_getdisplaystampa("2");
            if (_mf_getdisplaystampa2 >= 0) {
                mostCurrent._contrasto.setTag(java.lang.Integer.valueOf(_mf_getdisplaystampa2));
                mostCurrent._contrasto.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Contrasto display =" + anywheresoftware.b4a.BA.NumberToString(_mf_getdisplaystampa2)));
            } else {
                java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Errore Richiesta dati");
                cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            }
            cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            int _mf_getdisplaystampa3 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_getdisplaystampa("3");
            if (_mf_getdisplaystampa3 >= 0) {
                mostCurrent._luminosita.setTag(java.lang.Integer.valueOf(_mf_getdisplaystampa3));
                mostCurrent._luminosita.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Luminosità display =" + anywheresoftware.b4a.BA.NumberToString(_mf_getdisplaystampa3)));
            } else {
                java.lang.CharSequence ObjectToCharSequence5 = anywheresoftware.b4a.BA.ObjectToCharSequence("Errore Richiesta dati");
                cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence6 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence5, ObjectToCharSequence6, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            }
            if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._rt_leggistato(false);
                _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
            }
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = mostCurrent._ver_btn_panelrt;
        cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.equals("")) {
            cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)) {
                z = true;
                buttonWrapper.setVisible(z);
                if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
                    mostCurrent._ver_btn_panelserv.setVisible(false);
                    mostCurrent._ver_btn_panelrt.setVisible(false);
                    mostCurrent._ver_lbl_titolover.setVisible(false);
                    mostCurrent._ver_btn_cf.setVisible(false);
                    mostCurrent._ver_btn_dataora.setVisible(false);
                    mostCurrent._ver_edt_descrriga.setVisible(false);
                    mostCurrent._ver_edt_importo.setVisible(false);
                    mostCurrent._ver_btn_stampascontr.setVisible(false);
                    mostCurrent._ver_lbl_importo.setVisible(false);
                    mostCurrent._ver_lbl_descrriga.setVisible(false);
                    mostCurrent._ver_lbl_scontrprova.setVisible(false);
                    mostCurrent._ver_lbl_stampamf.setVisible(false);
                    mostCurrent._ver_btn_datada.setVisible(false);
                    mostCurrent._ver_btn_dataa.setVisible(false);
                    mostCurrent._ver_lbl_datada.setVisible(false);
                    mostCurrent._ver_lbl_dataa.setVisible(false);
                    mostCurrent._ver_lbl_mfda.setVisible(false);
                    mostCurrent._ver_lbl_mfa.setVisible(false);
                    mostCurrent._ver_edt_mfa.setVisible(false);
                    mostCurrent._ver_edt_mfda.setVisible(false);
                    mostCurrent._ver_btn_stampamfdate.setVisible(false);
                    mostCurrent._ver_btn_stampamfnum.setVisible(false);
                }
                anywheresoftware.b4a.keywords.Common.DoEvents();
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
                return "";
            }
        }
        z = false;
        buttonWrapper.setVisible(z);
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
        }
        anywheresoftware.b4a.keywords.Common.DoEvents();
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _annullastampa_click() throws java.lang.Exception {
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Si desidera annullare la stampa ? ");
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "No", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Msgbox2 == -1) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("5005", 1);
            mostCurrent._annullastampa.setVisible(false);
            return "";
        }
        return "";
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToCharSequence("Esecuzione comando in corso ..."), false);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(true);
        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
    }

    public static java.lang.String _bloccamemorie_click() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(false);
        return "";
    }

    public static java.lang.String _btn_attivazione_click() throws java.lang.Exception {
        try {
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati errori ..."), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        if (mostCurrent._edt_attivazione_cft.getText().trim().equals("") || mostCurrent._edt_attivazione_pil.getText().trim().equals("") || mostCurrent._edt_attivazione_cfe.getText().trim().equals("") || anywheresoftware.b4a.keywords.Common.Not(mostCurrent._chk_attivazione_telematico.getChecked())) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire tutti i dati"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, mostCurrent._edt_attivazione_cft.getText().trim(), true))) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Codice Fiscale del tecnico non valido"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, mostCurrent._edt_attivazione_pil.getText().trim(), true))) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("P.Iva laboratorio non valida"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, mostCurrent._edt_attivazione_cfe.getText().trim(), true))) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Codice Fiscale esercente non valido"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        java.lang.String str = anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._edt_attivazione_cft.getText().length(), 2, 0, 0, false) + mostCurrent._edt_attivazione_cft.getText();
        java.lang.String str2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._edt_attivazione_pil.getText().length(), 2, 0, 0, false) + mostCurrent._edt_attivazione_pil.getText();
        java.lang.String str3 = anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._edt_attivazione_cfe.getText().length(), 2, 0, 0, false) + mostCurrent._edt_attivazione_cfe.getText();
        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(!mostCurrent._btn_attivazione_data.getTag().equals("") ? anywheresoftware.b4a.BA.ObjectToString(mostCurrent._btn_attivazione_data.getTag()) + "0" : "0000001");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("64013" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str.toUpperCase()) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str2.toUpperCase()) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str3.toUpperCase()) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ObjectToString) + "", 1) != 0) {
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati errori ...\nProvare ad eseguire una Chiusura Giornaliera"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1())) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati problemi nella procedura di attivazione"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
        } else {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Attivazione ultimata"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
        }
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _btn_attivazione_data_click() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        long _vvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA);
        anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog dateDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        dateDialog.setYear(anywheresoftware.b4a.keywords.DateTime.GetYear(_vvvvvvvvvvvvv0));
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        dateDialog.setMonth(anywheresoftware.b4a.keywords.DateTime.GetMonth(_vvvvvvvvvvvvv0));
        anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
        dateDialog.setDayOfMonth(anywheresoftware.b4a.keywords.DateTime.GetDayOfMonth(_vvvvvvvvvvvvv0));
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = dateDialog.Show("Impostare la data di messa in servizio", "data di messa in servizio", "Ok", "", "Annulla", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        mostCurrent._btn_attivazione_data.setTag("");
        mostCurrent._btn_attivazione_data.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Data messa in servizio: "));
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            java.lang.String NumberToString = anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear());
            java.lang.String str = anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + "/" + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + "/" + NumberToString;
            mostCurrent._btn_attivazione_data.setTag(anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getDayOfMonth(), 2, 0) + anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + NumberToString.substring(2, 4));
            mostCurrent._btn_attivazione_data.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Data messa in servizio: " + str));
        }
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _btn_censimento_click() throws java.lang.Exception {
        if (mostCurrent._edt_censimento_cft.getText().trim().equals("") || mostCurrent._edt_censimento_pil.getText().trim().equals("")) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire tutti i dati"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, mostCurrent._edt_censimento_cft.getText().trim(), true))) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Codice Fiscale del tecnico non valido"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, mostCurrent._edt_censimento_pil.getText().trim(), true))) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("P.Iva laboratorio non valida"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("64012" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._edt_censimento_cft.getText().length(), 2, 0, 0, false)) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._edt_censimento_cft.getText().toUpperCase()) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._edt_censimento_pil.getText().length(), 2, 0, 0, false)) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", mostCurrent._edt_censimento_pil.getText().toUpperCase()) + "", 1) == 0) {
            if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1())) {
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati problemi nella procedura di censimento"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            } else {
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Censimento ultimato"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            }
        }
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _btn_evento_click() throws java.lang.Exception {
        java.lang.String str;
        try {
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati errori ..."), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        if (mostCurrent._btn_evento_cod.getTag().equals("") || mostCurrent._edt_evento_des.getText().trim().equals("")) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire tutti i dati"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
            return "";
        }
        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._btn_evento_cod.getTag());
        cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        java.lang.String str2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(r8.length(), 2, 0, 0, false) + cassandraRisto.ital.modfunstr._left(mostCurrent.activityBA, mostCurrent._edt_evento_des.getText(), 50L);
        if (mostCurrent._tgl_evento_d1.getChecked()) {
            str = "2";
        } else if (!mostCurrent._tgl_evento_d2.getChecked()) {
            str = "1";
        } else {
            str = "3";
        }
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("6402" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ObjectToString) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str2.toUpperCase()) + "", 1) == 0) {
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1())) {
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati problemi nell'invio dell'evento"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            } else {
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Evento ultimato"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            }
        } else {
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati errori ...\nProvare ad eseguire una Chiusura Giornaliera"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
        }
        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _btn_evento_cod_click() throws java.lang.Exception {
        mostCurrent._btn_evento_cod.setTag("");
        mostCurrent._btn_evento_cod.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire il codice dell'evento"));
        mostCurrent._edt_evento_des.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        if (mostCurrent._tgl_evento_fs.getChecked()) {
            list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new java.lang.String[]{"00600 - Memoria esaurita", "00601 - Altro", "00607 - Malfunzionamento", "00608 - Magazzino"}));
        } else if (mostCurrent._tgl_evento_d1.getChecked()) {
            list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new java.lang.String[]{"00601 - Altro", "00603 - Cessione", "00604 - Furto"}));
        } else if (mostCurrent._tgl_evento_d2.getChecked()) {
            list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new java.lang.String[]{"00601 - Altro", "00606 - Smaltimento", "00609 - Memoria di riepilogo esaurita"}));
        }
        int InputList = anywheresoftware.b4a.keywords.Common.InputList(list, anywheresoftware.b4a.BA.ObjectToCharSequence("Codice evento"), -1, mostCurrent.activityBA);
        if (InputList >= 0) {
            java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(list.Get(InputList));
            mostCurrent._btn_evento_cod.setTag(ObjectToString.substring(0, 5));
            mostCurrent._btn_evento_cod.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Codice Evento:" + ObjectToString));
            mostCurrent._edt_evento_des.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ObjectToString.substring(8)));
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _btn_inttecnico_cit_click() throws java.lang.Exception {
        mostCurrent._btn_inttecnico_cit.setTag("");
        mostCurrent._btn_inttecnico_cit.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire il codice di intervento tecnico"));
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new java.lang.String[]{"1. Manutenzione", "2. Sostituzione memoria al dettaglio", "3. Verifica periodica positiva", "4. Verifica periodica negativa", "5. Verifica periodica ritiro appareccio", "6. Altro"}));
        int InputList = anywheresoftware.b4a.keywords.Common.InputList(list, anywheresoftware.b4a.BA.ObjectToCharSequence("Codice intervento tecnico"), -1, mostCurrent.activityBA);
        if (InputList >= 0) {
            mostCurrent._btn_inttecnico_cit.setTag(java.lang.Integer.valueOf(InputList + 1));
            mostCurrent._btn_inttecnico_cit.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Codice intervento tecnico:" + anywheresoftware.b4a.BA.ObjectToString(list.Get(InputList))));
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _btn_inttecnico_end_click() throws java.lang.Exception {
        if (mostCurrent._edt_inttecnico_cft.getText().trim().equals("") || mostCurrent._edt_inttecnico_pil.getText().trim().equals("") || mostCurrent._btn_inttecnico_cit.getTag().equals("") || mostCurrent._edt_inttecnico_note.getText().trim().equals("")) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire tutti i dati"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, mostCurrent._edt_inttecnico_cft.getText().trim(), true))) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Codice Fiscale del tecnico non valido"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvv0(mostCurrent.activityBA, mostCurrent._edt_inttecnico_pil.getText().trim(), true))) {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("P.Iva laboratorio non valida"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            return "";
        }
        java.lang.String str = anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._edt_inttecnico_cft.getText().length(), 2, 0, 0, false) + mostCurrent._edt_inttecnico_cft.getText();
        java.lang.String str2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._edt_inttecnico_pil.getText().length(), 2, 0, 0, false) + mostCurrent._edt_inttecnico_pil.getText();
        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(mostCurrent._btn_inttecnico_cit.getTag());
        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper = mostCurrent._edt_inttecnico_note;
        cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
        editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.modfunstr._left(mostCurrent.activityBA, mostCurrent._edt_inttecnico_note.getText(), 16L)));
        java.lang.String str3 = anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._edt_inttecnico_note.getText().length(), 2, 0, 0, false) + mostCurrent._edt_inttecnico_note.getText();
        try {
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("64041" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", ObjectToString) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str.toUpperCase()) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str2.toUpperCase()) + "" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str3.toUpperCase()) + "", 1) == 0) {
                if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1())) {
                    anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati problemi nel salvataggio dati"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                } else {
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                    anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToCharSequence("Esecuzione chiusura per fine intervento tecnico in corso ..."), false);
                    anywheresoftware.b4a.keywords.Common.DoEvents();
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_eod("ModVerificazione");
                    anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
                    anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Procedura ultimata correttamente.\nL'intervento è stato inserito nel file xml"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                    mostCurrent._edt_inttecnico_cft.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                    mostCurrent._edt_inttecnico_pil.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                    mostCurrent._btn_inttecnico_cit.setTag("");
                    mostCurrent._btn_inttecnico_cit.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire il codice di intervento tecnico"));
                    mostCurrent._edt_inttecnico_note.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
                }
            } else {
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati errori ...\nProvare ad eseguire una Chiusura Giornaliera"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            }
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati errori ..."), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
        }
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _btn_inttecnico_start_click() throws java.lang.Exception {
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Confermi l'inizio della procedura di verifica ? ");
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "No", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Msgbox2 == -1) {
            try {
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("64040", 1) == 0) {
                    anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Procedura di verifica iniziata"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                } else {
                    anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati errori ...\nProvare ad eseguire una Chiusura Giornaliera"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                }
            } catch (java.lang.Exception e) {
                processBA.setLastException(e);
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati errori ..."), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
            }
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
            return "";
        }
        return "";
    }

    public static java.lang.String _chk_attivazione_telematico_checkedchange(boolean z) throws java.lang.Exception {
        mostCurrent._btn_attivazione_data.setEnabled(z);
        return "";
    }

    public static java.lang.String _contrasto_click() throws java.lang.Exception {
        anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog numberDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog();
        numberDialog.setDigits(2);
        numberDialog.setNumber((int) anywheresoftware.b4a.BA.ObjectToNumber(mostCurrent._contrasto.getTag()));
        numberDialog.setDecimal(0);
        numberDialog.setShowSign(false);
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = numberDialog.Show("Inserire il valore di Contrasto del display (da 0 a 99)", "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            if (numberDialog.getNumber() < 0 || numberDialog.getNumber() > 99) {
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare i valori inseriti.");
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                return "";
            }
            mostCurrent._contrasto.setTag(java.lang.Integer.valueOf(numberDialog.getNumber()));
            mostCurrent._contrasto.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Contrasto display =" + anywheresoftware.b4a.BA.NumberToString(numberDialog.getNumber())));
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_setdisplaystampa("2", numberDialog.getNumber());
        }
        return "";
    }

    public static java.lang.Object _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws java.lang.Exception {
        anywheresoftware.b4j.object.JavaObject javaObject = new anywheresoftware.b4j.object.JavaObject();
        javaObject.InitializeStatic(anywheresoftware.b4a.BA.ObjectToString(getObject()).substring("class ".length()));
        return javaObject.GetField("processBA");
    }

    public static java.lang.String _globals() throws java.lang.Exception {
        mostCurrent._ver_btn_close1 = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_pnlserv = new anywheresoftware.b4a.objects.PanelWrapper();
        mostCurrent._ver_pnlver = new anywheresoftware.b4a.objects.PanelWrapper();
        mostCurrent._ver_btn_close2 = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_cf = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_dataora = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_edt_descrriga = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._ver_btn_stampascontr = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_edt_mfda = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._ver_edt_mfa = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._ver_edt_numdadgfe = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._ver_edt_numadgfe = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._ver_btn_stampadgfescontr = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_edt_dgfechiusda = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._ver_edt_dgfechiusa = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._ver_btn_stampadgfechius = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_lbl_titolover = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_btn_stampamfdate = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_stampamfnum = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_datada = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_dataa = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_giornodgfe = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_edt_importo = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._ver_btn_panelserv = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_fisc = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_inizializza = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_panelver = new anywheresoftware.b4a.objects.ButtonWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.CSBuilder();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new cassandraRisto.ital.clsverificazione();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        mostCurrent._ver_btn_setdataver = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_sendlogo = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._annullastampa = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._contrasto = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._intensita = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._luminosita = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_lbl_importo = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_lbl_descrriga = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_lbl_scontrprova = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_lbl_stampamf = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_lbl_datada = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_lbl_dataa = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_lbl_mfda = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_lbl_mfa = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._ver_btn_panelrt = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_pnlutilityrt = new anywheresoftware.b4a.objects.PanelWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.ListViewWrapper();
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new java.lang.Object();
        mostCurrent._ver_btn_closert = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._ver_btn_panelverrt = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._pnlcensimento = new anywheresoftware.b4a.objects.PanelWrapper();
        mostCurrent._edt_censimento_cft = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._edt_censimento_pil = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._pnlattivazione = new anywheresoftware.b4a.objects.PanelWrapper();
        mostCurrent._btn_attivazione_data = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._chk_attivazione_telematico = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
        mostCurrent._edt_attivazione_cft = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._edt_attivazione_pil = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._edt_attivazione_cfe = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._lblrt = new anywheresoftware.b4a.objects.LabelWrapper();
        mostCurrent._edt_inttecnico_cft = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._edt_inttecnico_pil = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._edt_inttecnico_note = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._pnlinttecnico = new anywheresoftware.b4a.objects.PanelWrapper();
        mostCurrent._btn_inttecnico_cit = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._tgl_evento_fs = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
        mostCurrent._tgl_evento_d1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
        mostCurrent._tgl_evento_d2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
        mostCurrent._btn_evento_cod = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._edt_evento_des = new anywheresoftware.b4a.objects.EditTextWrapper();
        mostCurrent._pnlevento = new anywheresoftware.b4a.objects.PanelWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
        mostCurrent._ver_btn_infort = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._sbloccamemorie = new anywheresoftware.b4a.objects.ButtonWrapper();
        mostCurrent._bloccamemorie = new anywheresoftware.b4a.objects.ButtonWrapper();
        return "";
    }

    public static java.lang.String _intensita_click() throws java.lang.Exception {
        anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog numberDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog();
        numberDialog.setDigits(2);
        numberDialog.setNumber((int) anywheresoftware.b4a.BA.ObjectToNumber(mostCurrent._intensita.getTag()));
        numberDialog.setDecimal(0);
        numberDialog.setShowSign(false);
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = numberDialog.Show("Inserire il valore per l'intensità di stampa (da 0 a 12)", "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            if (numberDialog.getNumber() < 0 || numberDialog.getNumber() > 12) {
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare i valori inseriti.");
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                return "";
            }
            mostCurrent._intensita.setTag(java.lang.Integer.valueOf(numberDialog.getNumber()));
            mostCurrent._intensita.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Intensità di stampa =" + anywheresoftware.b4a.BA.NumberToString(numberDialog.getNumber())));
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_setdisplaystampa("1", numberDialog.getNumber());
        }
        return "";
    }

    public static java.lang.Object _ion_event(java.lang.String str, java.lang.Object[] objArr) throws java.lang.Exception {
        if (-1.0d != anywheresoftware.b4a.BA.ObjectToNumber(objArr[0])) {
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati problemi in chiusura.");
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        }
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) {
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._rt_verificamagazzino();
            }
        }
        return anywheresoftware.b4a.keywords.Common.Null;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str) throws java.lang.Exception {
        for (int numberOfViews = mostCurrent._activity.getNumberOfViews() - 1; numberOfViews >= 0; numberOfViews--) {
            mostCurrent._activity.RemoveViewAt(numberOfViews);
        }
        mostCurrent._activity.LoadLayout(str, mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _luminosita_click() throws java.lang.Exception {
        anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog numberDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.NumberDialog();
        numberDialog.setDigits(2);
        numberDialog.setNumber((int) anywheresoftware.b4a.BA.ObjectToNumber(mostCurrent._luminosita.getTag()));
        numberDialog.setDecimal(0);
        numberDialog.setShowSign(false);
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = numberDialog.Show("Inserire il valore di luminosità del display (da 0 a 99)", "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            if (numberDialog.getNumber() < 0 || numberDialog.getNumber() > 99) {
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare i valori inseriti.");
                cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                return "";
            }
            mostCurrent._luminosita.setTag(java.lang.Integer.valueOf(numberDialog.getNumber()));
            mostCurrent._luminosita.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Luminosità display =" + anywheresoftware.b4a.BA.NumberToString(numberDialog.getNumber())));
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_setdisplaystampa("3", numberDialog.getNumber());
        }
        return "";
    }

    public static java.lang.String _lv_itemclick(int i, java.lang.Object obj) throws java.lang.Exception {
        java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(obj);
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
        mostCurrent._lblrt.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(ObjectToString));
        switch (anywheresoftware.b4a.BA.switchObjectToInt(ObjectToString.trim(), "Genera chiave", "Censimento", "Attivazione", "In Servizio", "Intervento Tecnico", "Evento")) {
            case 0:
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Confermi la generazione della chiave privata ? ");
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione");
                cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Si", "No", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                if (Msgbox2 == -1) {
                    cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("64011", 1) == 0) {
                        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1())) {
                            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati problemi nella procedura di generazione delle chiavi"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                            break;
                        } else {
                            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Generazione delle chiavi ultimata"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                            break;
                        }
                    }
                }
                break;
            case 1:
                mostCurrent._pnlcensimento.SetVisibleAnimated(300, true);
                break;
            case 2:
                mostCurrent._btn_attivazione_data.setTag("");
                mostCurrent._btn_attivazione_data.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Data messa in servizio:"));
                mostCurrent._pnlattivazione.SetVisibleAnimated(300, true);
                break;
            case 3:
                java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Confermi l'esecuzione della procedura di messa in servizio ? ");
                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int Msgbox22 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "Si", "No", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse2 = anywheresoftware.b4a.keywords.Common.DialogResponse;
                if (Msgbox22 == -1) {
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("64015000000", 1) == 0) {
                        if (anywheresoftware.b4a.keywords.Common.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1())) {
                            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Si sono verificati problemi nella procedura di messa in servizio"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                            break;
                        } else {
                            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Messa in servizio ultimata"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                            break;
                        }
                    }
                }
                break;
            case 4:
                mostCurrent._pnlinttecnico.SetVisibleAnimated(300, true);
                mostCurrent._btn_inttecnico_cit.setTag("");
                mostCurrent._btn_inttecnico_cit.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire il codice di intervento tecnico"));
                break;
            case 5:
                mostCurrent._pnlevento.SetVisibleAnimated(300, true);
                mostCurrent._btn_evento_cod.setTag("");
                mostCurrent._btn_evento_cod.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire il codice dell'evento"));
                break;
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _msgboxonly(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(str2);
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(str);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "", "", "Ok", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws java.lang.Exception {
        mostCurrent._pnlcensimento.setVisible(false);
        mostCurrent._pnlattivazione.setVisible(false);
        mostCurrent._pnlinttecnico.setVisible(false);
        mostCurrent._pnlevento.setVisible(false);
        return "";
    }

    public static java.lang.String _pnlcensimento_click() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _pnlevento_click() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _pnlinttecnico_click() throws java.lang.Exception {
        return "";
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        return "";
    }

    public static java.lang.String _sbloccamemorie_click() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(true);
        return "";
    }

    public static long[] _sceltadata(boolean z, java.lang.String str) throws java.lang.Exception {
        long[] jArr = new long[2];
        anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog dateDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
        anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog timeDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.TimeDialog();
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("dd/MM/yyyy");
        if (str.equals("")) {
            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            int GetDayOfMonth = anywheresoftware.b4a.keywords.DateTime.GetDayOfMonth(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA));
            anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            int GetMonth = anywheresoftware.b4a.keywords.DateTime.GetMonth(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA));
            anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            dateDialog.SetDate(GetDayOfMonth, GetMonth, anywheresoftware.b4a.keywords.DateTime.GetYear(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)));
        } else {
            anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
            dateDialog.setDateTicks(anywheresoftware.b4a.keywords.DateTime.DateParse(str));
        }
        jArr[0] = dateDialog.getDateTicks();
        dateDialog.Show("Scegliere la data", "Scelta della data", "OK", "Cancel", "", mostCurrent.activityBA, (android.graphics.Bitmap) anywheresoftware.b4a.keywords.Common.Null);
        int response = dateDialog.getResponse();
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (response == -1) {
            jArr[0] = dateDialog.getDateTicks();
        }
        if (z) {
            if (str.equals("")) {
                anywheresoftware.b4a.keywords.DateTime dateTime6 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                int GetHour = anywheresoftware.b4a.keywords.DateTime.GetHour(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA));
                anywheresoftware.b4a.keywords.DateTime dateTime7 = anywheresoftware.b4a.keywords.Common.DateTime;
                cassandraRisto.ital.mod1 mod1Var5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                timeDialog.SetTime(GetHour, anywheresoftware.b4a.keywords.DateTime.GetMinute(cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA)), true);
            } else {
                anywheresoftware.b4a.keywords.DateTime dateTime8 = anywheresoftware.b4a.keywords.Common.DateTime;
                timeDialog.setTimeTicks(anywheresoftware.b4a.keywords.DateTime.DateParse(str));
            }
            jArr[1] = timeDialog.getTimeTicks();
            timeDialog.Show("Scegliere l'ora", "Scelta dell'ora", "OK", "Cancel", "", mostCurrent.activityBA, (android.graphics.Bitmap) anywheresoftware.b4a.keywords.Common.Null);
            int response2 = timeDialog.getResponse();
            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse2 = anywheresoftware.b4a.keywords.Common.DialogResponse;
            if (response2 == -1) {
                jArr[1] = timeDialog.getTimeTicks();
            }
        }
        return jArr;
    }

    public static java.lang.String _startactivityforresult(anywheresoftware.b4a.objects.IntentWrapper intentWrapper) throws java.lang.Exception {
        new anywheresoftware.b4j.object.JavaObject();
        anywheresoftware.b4j.object.JavaObject javaObject = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5());
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = javaObject.CreateEvent(processBA, "anywheresoftware.b4a.IOnActivityResult", "ion", anywheresoftware.b4a.keywords.Common.Null);
        javaObject.RunMethod("startActivityForResult", new java.lang.Object[]{mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4, intentWrapper.getObject()});
        return "";
    }

    public static java.lang.String _tgl_evento_checkedchange(boolean z) throws java.lang.Exception {
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) {
            return "";
        }
        new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper();
        anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper toggleButtonWrapper = (anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.ToggleButtonWrapper(), (android.widget.ToggleButton) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA));
        int ObjectToNumber = (int) anywheresoftware.b4a.BA.ObjectToNumber(toggleButtonWrapper.getTag());
        if (z && ObjectToNumber == 2) {
            anywheresoftware.b4a.agraham.dialogs.InputDialog inputDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog();
            inputDialog.setInputType(2);
            inputDialog.setInput("");
            inputDialog.setPasswordMode(true);
            inputDialog.setHint("Password di accesso");
            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
            inputDialog.setHintColor(anywheresoftware.b4a.keywords.constants.Colors.ARGB(196, 255, 140, 0));
            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.String str = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
            anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            int Show = inputDialog.Show("Inserire la Password di accesso per il menù di dismissione", str, "Ok", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
            anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse2 = anywheresoftware.b4a.keywords.Common.DialogResponse;
            if (anywheresoftware.b4a.keywords.Common.Not(Show == -1 && (inputDialog.getInput().equals("147896") || inputDialog.getInput().equals("3698741")))) {
                mostCurrent._tgl_evento_d2.setChecked(false);
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
                return "";
            }
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = true;
        if (anywheresoftware.b4a.keywords.Common.Not(z)) {
            toggleButtonWrapper.setChecked(true);
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
            return "";
        }
        mostCurrent._btn_evento_cod.setTag("");
        mostCurrent._btn_evento_cod.setText(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire il codice dell'evento"));
        mostCurrent._edt_evento_des.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(""));
        switch (ObjectToNumber) {
            case 0:
                mostCurrent._tgl_evento_d1.setChecked(false);
                mostCurrent._tgl_evento_d2.setChecked(false);
                break;
            case 1:
                mostCurrent._tgl_evento_fs.setChecked(false);
                mostCurrent._tgl_evento_d2.setChecked(false);
                break;
            case 2:
                mostCurrent._tgl_evento_d1.setChecked(false);
                mostCurrent._tgl_evento_fs.setChecked(false);
                break;
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
        return "";
    }

    public static java.lang.String _ver_btn_cf_click() throws java.lang.Exception {
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Confermi la Chiusura Giornaliera?");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Conferma", "Annulla", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Msgbox2 == -1) {
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA, anywheresoftware.b4a.BA.ObjectToCharSequence("Invio dati di vendita in corso ..."), false);
            anywheresoftware.b4a.keywords.Common.DoEvents();
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_eod("ModVerificazione");
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Operazione completata");
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        } else {
            java.lang.CharSequence ObjectToCharSequence5 = anywheresoftware.b4a.BA.ObjectToCharSequence("Operazione annullata");
            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence6 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence5, ObjectToCharSequence6, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_close1_click() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("MM/dd/yyyy");
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "Main");
        } else {
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "Configura");
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        mostCurrent._activity.Finish();
        return "";
    }

    public static java.lang.String _ver_btn_close2_click() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("MM/dd/yyyy");
        if (mostCurrent._ver_pnlutilityrt.getVisible()) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._rt_leggistato(false);
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "Main");
        } else {
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, "Configura");
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
        mostCurrent._activity.Finish();
        return "";
    }

    public static java.lang.String _ver_btn_dataa_click() throws java.lang.Exception {
        long[] jArr = new long[2];
        long[] _sceltadata = _sceltadata(false, mostCurrent._ver_btn_dataa.getText());
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("dd/MM/yyyy");
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = mostCurrent._ver_btn_dataa;
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.DateTime.Date(_sceltadata[0])));
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_datada_click() throws java.lang.Exception {
        long[] jArr = new long[2];
        long[] _sceltadata = _sceltadata(false, mostCurrent._ver_btn_datada.getText());
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("dd/MM/yyyy");
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = mostCurrent._ver_btn_datada;
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.DateTime.Date(_sceltadata[0])));
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_dataora_click() throws java.lang.Exception {
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_fisc_click() throws java.lang.Exception {
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_giornodgfe_click() throws java.lang.Exception {
        long[] jArr = new long[2];
        long[] _sceltadata = _sceltadata(false, mostCurrent._ver_btn_giornodgfe.getText());
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("dd/MM/yyyy");
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = mostCurrent._ver_btn_giornodgfe;
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        buttonWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.DateTime.Date(_sceltadata[0])));
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_infort_click() throws java.lang.Exception {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            anywheresoftware.b4a.objects.CSBuilder cSBuilder = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper = anywheresoftware.b4a.keywords.Common.Typeface;
            anywheresoftware.b4a.objects.CSBuilder Size = cSBuilder.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Initialize().Size(16);
            anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
            Size.Color(-16777216);
            anywheresoftware.b4a.objects.CSBuilder cSBuilder2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper2 = anywheresoftware.b4a.keywords.Common.Typeface;
            anywheresoftware.b4a.objects.CSBuilder Typeface = cSBuilder2.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE);
            anywheresoftware.b4a.keywords.constants.Colors colors2 = anywheresoftware.b4a.keywords.Common.Colors;
            anywheresoftware.b4a.objects.CSBuilder Pop = Typeface.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Modalità Attivazione     ")).Pop();
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
                anywheresoftware.b4a.keywords.constants.Colors colors3 = anywheresoftware.b4a.keywords.Common.Colors;
                i = -16711936;
            } else {
                anywheresoftware.b4a.keywords.constants.Colors colors4 = anywheresoftware.b4a.keywords.Common.Colors;
                i = -65536;
            }
            anywheresoftware.b4a.objects.CSBuilder Color = Pop.Color((int) anywheresoftware.b4a.BA.ObjectToNumber(i));
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            Color.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 ? "RT" : "MF")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
            anywheresoftware.b4a.objects.CSBuilder cSBuilder3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper3 = anywheresoftware.b4a.keywords.Common.Typeface;
            anywheresoftware.b4a.objects.CSBuilder Typeface2 = cSBuilder3.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE);
            anywheresoftware.b4a.keywords.constants.Colors colors5 = anywheresoftware.b4a.keywords.Common.Colors;
            anywheresoftware.b4a.objects.CSBuilder Pop2 = Typeface2.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Chiavi generate          ")).Pop();
            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.generateChiavi) {
                anywheresoftware.b4a.keywords.constants.Colors colors6 = anywheresoftware.b4a.keywords.Common.Colors;
                i2 = -16711936;
            } else {
                anywheresoftware.b4a.keywords.constants.Colors colors7 = anywheresoftware.b4a.keywords.Common.Colors;
                i2 = -65536;
            }
            anywheresoftware.b4a.objects.CSBuilder Color2 = Pop2.Color((int) anywheresoftware.b4a.BA.ObjectToNumber(i2));
            cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            Color2.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.generateChiavi ? "SI" : "NO")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            anywheresoftware.b4a.objects.CSBuilder cSBuilder4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper4 = anywheresoftware.b4a.keywords.Common.Typeface;
            anywheresoftware.b4a.objects.CSBuilder Typeface3 = cSBuilder4.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE);
            anywheresoftware.b4a.keywords.constants.Colors colors8 = anywheresoftware.b4a.keywords.Common.Colors;
            anywheresoftware.b4a.objects.CSBuilder Pop3 = Typeface3.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Censita                  ")).Pop();
            cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Censita) {
                anywheresoftware.b4a.keywords.constants.Colors colors9 = anywheresoftware.b4a.keywords.Common.Colors;
                i3 = -16711936;
            } else {
                anywheresoftware.b4a.keywords.constants.Colors colors10 = anywheresoftware.b4a.keywords.Common.Colors;
                i3 = -65536;
            }
            anywheresoftware.b4a.objects.CSBuilder Color3 = Pop3.Color((int) anywheresoftware.b4a.BA.ObjectToNumber(i3));
            cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            Color3.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Censita ? "SI" : "NO")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            anywheresoftware.b4a.objects.CSBuilder cSBuilder5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper5 = anywheresoftware.b4a.keywords.Common.Typeface;
            anywheresoftware.b4a.objects.CSBuilder Typeface4 = cSBuilder5.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE);
            anywheresoftware.b4a.keywords.constants.Colors colors11 = anywheresoftware.b4a.keywords.Common.Colors;
            anywheresoftware.b4a.objects.CSBuilder Pop4 = Typeface4.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Attivata                 ")).Pop();
            cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Attivazione) {
                anywheresoftware.b4a.keywords.constants.Colors colors12 = anywheresoftware.b4a.keywords.Common.Colors;
                i4 = -16711936;
            } else {
                anywheresoftware.b4a.keywords.constants.Colors colors13 = anywheresoftware.b4a.keywords.Common.Colors;
                i4 = -65536;
            }
            anywheresoftware.b4a.objects.CSBuilder Color4 = Pop4.Color((int) anywheresoftware.b4a.BA.ObjectToNumber(i4));
            cassandraRisto.ital.main mainVar8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            Color4.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Attivazione ? "SI" : "NO")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            anywheresoftware.b4a.objects.CSBuilder cSBuilder6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
            anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper6 = anywheresoftware.b4a.keywords.Common.Typeface;
            anywheresoftware.b4a.objects.CSBuilder Typeface5 = cSBuilder6.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE);
            anywheresoftware.b4a.keywords.constants.Colors colors14 = anywheresoftware.b4a.keywords.Common.Colors;
            anywheresoftware.b4a.objects.CSBuilder Pop5 = Typeface5.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("In servizio              ")).Pop();
            cassandraRisto.ital.main mainVar9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.InService) {
                anywheresoftware.b4a.keywords.constants.Colors colors15 = anywheresoftware.b4a.keywords.Common.Colors;
                i5 = -16711936;
            } else {
                anywheresoftware.b4a.keywords.constants.Colors colors16 = anywheresoftware.b4a.keywords.Common.Colors;
                i5 = -65536;
            }
            anywheresoftware.b4a.objects.CSBuilder Color5 = Pop5.Color((int) anywheresoftware.b4a.BA.ObjectToNumber(i5));
            cassandraRisto.ital.main mainVar10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            Color5.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Attivazione ? "SI" : "NO")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
            cassandraRisto.ital.main mainVar11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.InServiceDa > 0) {
                cassandraRisto.ital.main mainVar12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                long j = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.InServiceDa;
                anywheresoftware.b4a.objects.CSBuilder cSBuilder7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                anywheresoftware.b4a.keywords.constants.Colors colors17 = anywheresoftware.b4a.keywords.Common.Colors;
                anywheresoftware.b4a.objects.CSBuilder Append = cSBuilder7.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Data messa in servizio   "));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append = sb.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.keywords.DateTime.GetDayOfMonth(j), 2, 0, 0, false)).append("/");
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.keywords.DateTime.GetMonth(j), 2, 0, 0, false)).append("/");
                anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                Append.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(append2.append(anywheresoftware.b4a.keywords.Common.NumberFormat2(anywheresoftware.b4a.keywords.DateTime.GetYear(j), 4, 0, 0, false)).toString())).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Pop();
                cassandraRisto.ital.main mainVar13 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.String _mf_leggidataora = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_leggidataora();
                anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                if (anywheresoftware.b4a.keywords.DateTime.DateTimeParse(_mf_leggidataora.substring(2, 4) + "/" + _mf_leggidataora.substring(0, 2) + "/20" + _mf_leggidataora.substring(4, 6), _mf_leggidataora.substring(6, 8) + ":" + _mf_leggidataora.substring(8, 10) + ":00") <= j) {
                    anywheresoftware.b4a.objects.CSBuilder Size2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n")).Size(20);
                    anywheresoftware.b4a.keywords.constants.Colors colors18 = anywheresoftware.b4a.keywords.Common.Colors;
                    Size2.Color(-16777216).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("Messa in servizio tra:")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                    anywheresoftware.b4a.objects.CSBuilder cSBuilder8 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper7 = anywheresoftware.b4a.keywords.Common.Typeface;
                    anywheresoftware.b4a.objects.CSBuilder Size3 = cSBuilder8.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Size(16);
                    b4a.example.dateutils dateutilsVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                    Size3.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(b4a.example.dateutils._periodbetweenindays(mostCurrent.activityBA, r8, j).Years, 2, 0, 0, false))).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("   Anni")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                    anywheresoftware.b4a.objects.CSBuilder cSBuilder9 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper8 = anywheresoftware.b4a.keywords.Common.Typeface;
                    anywheresoftware.b4a.objects.CSBuilder Size4 = cSBuilder9.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Size(16);
                    b4a.example.dateutils dateutilsVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                    Size4.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(b4a.example.dateutils._periodbetweenindays(mostCurrent.activityBA, r8, j).Months, 2, 0, 0, false))).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("   Mesi")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                    anywheresoftware.b4a.objects.CSBuilder cSBuilder10 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper9 = anywheresoftware.b4a.keywords.Common.Typeface;
                    anywheresoftware.b4a.objects.CSBuilder Size5 = cSBuilder10.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Size(16);
                    b4a.example.dateutils dateutilsVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                    Size5.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(b4a.example.dateutils._periodbetweenindays(mostCurrent.activityBA, r8, j).Days, 2, 0, 0, false))).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(" Giorni")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                    anywheresoftware.b4a.objects.CSBuilder cSBuilder11 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper10 = anywheresoftware.b4a.keywords.Common.Typeface;
                    anywheresoftware.b4a.objects.CSBuilder Size6 = cSBuilder11.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Size(16);
                    b4a.example.dateutils dateutilsVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                    Size6.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(b4a.example.dateutils._periodbetweenindays(mostCurrent.activityBA, r8, j).Hours, 2, 0, 0, false))).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("    Ore")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                    anywheresoftware.b4a.objects.CSBuilder cSBuilder12 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
                    anywheresoftware.b4a.keywords.constants.TypefaceWrapper typefaceWrapper11 = anywheresoftware.b4a.keywords.Common.Typeface;
                    anywheresoftware.b4a.objects.CSBuilder Size7 = cSBuilder12.Typeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper.MONOSPACE).Size(16);
                    b4a.example.dateutils dateutilsVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
                    Size7.Append(anywheresoftware.b4a.BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(b4a.example.dateutils._periodbetweenindays(mostCurrent.activityBA, r8, j).Minutes, 2, 0, 0, false))).Append(anywheresoftware.b4a.BA.ObjectToCharSequence(" Minuti")).Append(anywheresoftware.b4a.BA.ObjectToCharSequence("\n"));
                }
            }
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.PopAll().getObject());
            cassandraRisto.ital.main mainVar14 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar15 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            return "";
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Funzione non utilizzabile.");
            cassandraRisto.ital.main mainVar16 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar17 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
            return "";
        }
    }

    public static java.lang.String _ver_btn_inizializza_click() throws java.lang.Exception {
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String _ver_btn_panelrt_click() throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (anywheresoftware.b4a.keywords.Common.Not(cassandraRisto.ital.main._v_matricola.startsWith("ST"))) {
            mostCurrent._ver_pnlutilityrt.setVisible(true);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlutilityrt.getObject()), 7.0f);
            mostCurrent._ver_pnlver.setVisible(false);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlver.getObject()), 0.0f);
            return "";
        }
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = true;
        anywheresoftware.b4a.phone.PackageManagerWrapper packageManagerWrapper = new anywheresoftware.b4a.phone.PackageManagerWrapper();
        new anywheresoftware.b4a.objects.IntentWrapper();
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = true;
        anywheresoftware.b4a.keywords.Common.StartActivity(processBA, packageManagerWrapper.GetApplicationIntent("com.custom.utilityrt").getObject());
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.trim().equals("Spice T 12.00.44 11/12/20") != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String _ver_btn_panelserv_click() throws java.lang.Exception {
        boolean z;
        boolean z2 = true;
        mostCurrent._ver_pnlserv.setVisible(true);
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper = mostCurrent._sbloccamemorie;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            if (cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.trim().equals("Spice T 12.00.44 11/12/20")) {
                z = true;
                buttonWrapper.setVisible(z);
                anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper2 = mostCurrent._bloccamemorie;
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                    cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                }
                z2 = false;
                buttonWrapper2.setVisible(z2);
                cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlserv.getObject()), 7.0f);
                mostCurrent._ver_pnlver.setVisible(false);
                cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlver.getObject()), 0.0f);
                return "";
            }
        }
        z = false;
        buttonWrapper.setVisible(z);
        anywheresoftware.b4a.objects.ButtonWrapper buttonWrapper22 = mostCurrent._bloccamemorie;
        cassandraRisto.ital.main mainVar32 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
        }
        z2 = false;
        buttonWrapper22.setVisible(z2);
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlserv.getObject()), 7.0f);
        mostCurrent._ver_pnlver.setVisible(false);
        cassandraRisto.ital.mod1 mod1Var22 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlver.getObject()), 0.0f);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String _ver_btn_panelver_click() throws java.lang.Exception {
        mostCurrent._ver_pnlver.setVisible(true);
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlver.getObject()), 7.0f);
        mostCurrent._ver_pnlserv.setVisible(false);
        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlserv.getObject()), 0.0f);
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._rt_leggistato(false);
        mostCurrent._ver_pnlutilityrt.setVisible(false);
        cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvv6(mostCurrent.activityBA, (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View) mostCurrent._ver_pnlutilityrt.getObject()), 0.0f);
        return "";
    }

    public static java.lang.String _ver_btn_sendlogo_click() throws java.lang.Exception {
        anywheresoftware.b4a.agraham.dialogs.InputDialog.FileDialog fileDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.FileDialog();
        anywheresoftware.b4a.keywords.constants.Colors colors = anywheresoftware.b4a.keywords.Common.Colors;
        fileDialog.TextColor = -7829368;
        fileDialog.setFastScroll(true);
        fileDialog.setFileFilter(".bmp");
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (!cassandraRisto.ital.main._v_usbpath.equals("")) {
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            fileDialog.setFilePath(cassandraRisto.ital.main._v_usbpath);
        } else {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            fileDialog.setFilePath(cassandraRisto.ital.mod1._vvvvv1);
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append("Seleziona il file da inviare al ");
        cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(append.append(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).append(".").toString());
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = fileDialog.Show(ObjectToCharSequence, "OK", "Annulla", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(fileDialog.getFilePath(), fileDialog.getChosenName());
            return "";
        }
        return "";
    }

    public static java.lang.String _ver_btn_setdataver_click() throws java.lang.Exception {
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        long _vvvvvvvvvvvvv0 = cassandraRisto.ital.mod1._vvvvvvvvvvvvv0(mostCurrent.activityBA);
        b4a.example.dateutils._period _periodVar = new b4a.example.dateutils._period();
        _periodVar.Years = 1;
        b4a.example.dateutils dateutilsVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        long _addperiod = b4a.example.dateutils._addperiod(mostCurrent.activityBA, _vvvvvvvvvvvvv0, _periodVar);
        anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog dateDialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.DateDialog();
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        dateDialog.setYear(anywheresoftware.b4a.keywords.DateTime.GetYear(_addperiod));
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        dateDialog.setMonth(anywheresoftware.b4a.keywords.DateTime.GetMonth(_addperiod));
        anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
        dateDialog.setDayOfMonth(anywheresoftware.b4a.keywords.DateTime.GetDayOfMonth(_addperiod));
        anywheresoftware.b4a.BA ba = mostCurrent.activityBA;
        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        int Show = dateDialog.Show("Impostare la data della prossima Verifica Fiscale", "Data movimento", "Ok", "", "", ba, cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject());
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Show == -1) {
            mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.keywords.Common.NumberFormat(dateDialog.getMonth(), 2, 0) + anywheresoftware.b4a.BA.NumberToString(dateDialog.getYear()).substring(2));
            return "";
        }
        return "";
    }

    public static java.lang.String _ver_btn_stampadgfechius_click() throws java.lang.Exception {
        java.lang.String text = mostCurrent._ver_edt_dgfechiusda.getText();
        java.lang.String text2 = mostCurrent._ver_edt_dgfechiusa.getText();
        if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(text)) || anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(text2))) {
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare i valori inseriti.");
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        } else {
            int parseDouble = (int) java.lang.Double.parseDouble(text);
            int parseDouble2 = (int) java.lang.Double.parseDouble(text2);
            if (parseDouble >= 1 && parseDouble <= parseDouble2) {
                if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(false, 0L, parseDouble, parseDouble2)) {
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                        mostCurrent._annullastampa.setVisible(true);
                    }
                }
            } else {
                java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare numero iniziale.");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            }
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_stampadgfescontr_click() throws java.lang.Exception {
        java.lang.String text = mostCurrent._ver_edt_numdadgfe.getText();
        java.lang.String text2 = mostCurrent._ver_edt_numadgfe.getText();
        if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(text)) || anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(text2))) {
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare i valori inseriti.");
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        } else {
            int parseDouble = (int) java.lang.Double.parseDouble(text);
            int parseDouble2 = (int) java.lang.Double.parseDouble(text2);
            if (parseDouble < 1 || parseDouble > parseDouble2) {
                java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare numero iniziale.");
                cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            } else if (!mostCurrent._ver_btn_giornodgfe.getText().equals("") && mostCurrent._ver_btn_giornodgfe.getText() != null) {
                anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
                anywheresoftware.b4a.keywords.DateTime.setDateFormat("dd/MM/yyyy");
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                long DateParse = anywheresoftware.b4a.keywords.DateTime.DateParse(mostCurrent._ver_btn_giornodgfe.getText());
                anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                if (DateParse < anywheresoftware.b4a.keywords.DateTime.DateParse("01/01/2000")) {
                    anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Data non valida! Inserire una data successiva al 31/12/1999."), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
                } else {
                    cassandraRisto.ital.clsverificazione clsverificazioneVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
                    anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                    if (clsverificazioneVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(true, anywheresoftware.b4a.keywords.DateTime.DateParse(mostCurrent._ver_btn_giornodgfe.getText()), parseDouble, parseDouble2)) {
                        cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                            mostCurrent._annullastampa.setVisible(true);
                        }
                    }
                }
            } else {
                java.lang.CharSequence ObjectToCharSequence5 = anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire la data");
                cassandraRisto.ital.main mainVar6 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence6 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar7 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence5, ObjectToCharSequence6, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            }
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_stampamfdate_click() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("dd/MM/yyyy");
        if (!mostCurrent._ver_btn_datada.getText().equals("") && !mostCurrent._ver_btn_dataa.getText().equals("")) {
            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
            long DateParse = anywheresoftware.b4a.keywords.DateTime.DateParse(mostCurrent._ver_btn_datada.getText());
            anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
            if (DateParse > anywheresoftware.b4a.keywords.DateTime.DateParse(mostCurrent._ver_btn_dataa.getText())) {
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("La data iniziale è maggiore della data finale!"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            } else {
                anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                long DateParse2 = anywheresoftware.b4a.keywords.DateTime.DateParse(mostCurrent._ver_btn_datada.getText());
                anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
                if (DateParse2 >= anywheresoftware.b4a.keywords.DateTime.DateParse("01/01/2000")) {
                    anywheresoftware.b4a.keywords.DateTime dateTime6 = anywheresoftware.b4a.keywords.Common.DateTime;
                    long DateParse3 = anywheresoftware.b4a.keywords.DateTime.DateParse(mostCurrent._ver_btn_dataa.getText());
                    anywheresoftware.b4a.keywords.DateTime dateTime7 = anywheresoftware.b4a.keywords.Common.DateTime;
                    if (DateParse3 >= anywheresoftware.b4a.keywords.DateTime.DateParse("01/01/2000")) {
                        cassandraRisto.ital.clsverificazione clsverificazioneVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
                        anywheresoftware.b4a.keywords.DateTime dateTime8 = anywheresoftware.b4a.keywords.Common.DateTime;
                        long DateParse4 = anywheresoftware.b4a.keywords.DateTime.DateParse(mostCurrent._ver_btn_datada.getText());
                        anywheresoftware.b4a.keywords.DateTime dateTime9 = anywheresoftware.b4a.keywords.Common.DateTime;
                        if (clsverificazioneVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(true, DateParse4, anywheresoftware.b4a.keywords.DateTime.DateParse(mostCurrent._ver_btn_dataa.getText()), 0, 0)) {
                            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                                mostCurrent._annullastampa.setVisible(true);
                            }
                        }
                    }
                }
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Date non valide! Inserire delle date successive al 31/12/1999."), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
            }
        } else {
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Inserire delle date corrette!"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), mostCurrent.activityBA);
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_stampamfnum_click() throws java.lang.Exception {
        java.lang.String text = mostCurrent._ver_edt_mfda.getText();
        java.lang.String text2 = mostCurrent._ver_edt_mfa.getText();
        if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(text)) || anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(text2))) {
            java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare i valori inseriti.");
            cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
        } else {
            int parseDouble = (int) java.lang.Double.parseDouble(text);
            int parseDouble2 = (int) java.lang.Double.parseDouble(text2);
            if (parseDouble >= 1 && parseDouble <= parseDouble2) {
                if (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(false, 0L, 0L, (int) java.lang.Double.parseDouble(text), (int) java.lang.Double.parseDouble(text2))) {
                    cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (cassandraRisto.ital.main._v_matricola.startsWith("ST")) {
                        mostCurrent._annullastampa.setVisible(true);
                    }
                }
            } else {
                java.lang.CharSequence ObjectToCharSequence3 = anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare numero iniziale.");
                cassandraRisto.ital.main mainVar4 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                java.lang.CharSequence ObjectToCharSequence4 = anywheresoftware.b4a.BA.ObjectToCharSequence(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
                cassandraRisto.ital.main mainVar5 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence3, ObjectToCharSequence4, "OK", "", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), mostCurrent.activityBA);
            }
        }
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_btn_stampascontr_click() throws java.lang.Exception {
        mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(mostCurrent._ver_edt_descrriga.getText(), mostCurrent._ver_edt_importo.getText());
        cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvv1(mostCurrent.activityBA);
        return "";
    }

    public static java.lang.String _ver_edt_importo_textchanged(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        try {
        } catch (java.lang.Exception e) {
            processBA.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent.activityBA, anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        }
        if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
            return "";
        }
        new anywheresoftware.b4a.objects.EditTextWrapper();
        anywheresoftware.b4a.objects.EditTextWrapper editTextWrapper = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText) anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA));
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = true;
        if (editTextWrapper.getText().indexOf(",") > 0) {
            editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(editTextWrapper.getText().replace(",", ".")));
            editTextWrapper.setSelectionStart(editTextWrapper.getText().length());
        }
        if (!anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(editTextWrapper.getText()))) {
            cassandraRisto.ital.modfunstr modfunstrVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
            if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, editTextWrapper.getText()) <= 100.0d) {
                cassandraRisto.ital.modfunstr modfunstrVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
                if (cassandraRisto.ital.modfunstr._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(mostCurrent.activityBA, editTextWrapper.getText()) >= 0.0d) {
                    if (str2.length() > 5) {
                        editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str));
                        editTextWrapper.setSelectionStart(str.length());
                    }
                    _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
                    return "";
                }
            }
        }
        editTextWrapper.setText(anywheresoftware.b4a.BA.ObjectToCharSequence(str));
        editTextWrapper.setSelectionStart(str.length());
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
        return "";
    }

    public static java.lang.String _ver_pnlutilityrt_click() throws java.lang.Exception {
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
