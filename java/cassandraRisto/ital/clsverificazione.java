package cassandraRisto.ital;

/* loaded from: classes.dex */
public class clsverificazione extends anywheresoftware.b4a.B4AClass.ImplB4AClass implements anywheresoftware.b4a.BA.SubDelegator {
    private static java.util.HashMap<java.lang.String, java.lang.reflect.Method> htSubs;
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
    public cassandraRisto.ital.usbpl2303service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
    public cassandraRisto.ital.verificazione _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
    public cassandraRisto.ital.httputils2service _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
    public cassandraRisto.ital.xuiviewsutils _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;

    private void innerInitialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        if (this.ba == null) {
            this.ba = new anywheresoftware.b4a.BA(ba, this, htSubs, "cassandraRisto.ital.clsverificazione");
            if (htSubs == null) {
                this.ba.loadHtSubs(getClass());
                htSubs = this.ba.htSubs;
            }
        }
        if (anywheresoftware.b4a.BA.isShellModeRuntimeCheck(this.ba)) {
            getClass().getMethod("_class_globals", cassandraRisto.ital.clsverificazione.class).invoke(this, null);
        } else {
            this.ba.raiseEvent2(null, true, "class_globals", false, new java.lang.Object[0]);
        }
    }

    public java.lang.String _class_globals() throws java.lang.Exception {
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Confermi la fiscalizzazione del misuratore?");
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Conferma", "", "Annulla", (android.graphics.Bitmap) anywheresoftware.b4a.keywords.Common.Null, getActivityBA());
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Msgbox2 == -1) {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("2005", 1);
            return "";
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Operazione annullata!"), anywheresoftware.b4a.BA.ObjectToCharSequence("Avviso"), getActivityBA());
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws java.lang.Exception {
        try {
            long[] jArr = new long[2];
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.BA ba = this.ba;
            cassandraRisto.ital.verificazione verificazioneVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            java.lang.Class<?> object = cassandraRisto.ital.verificazione.getObject();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            long[] jArr2 = (long[]) anywheresoftware.b4a.keywords.Common.CallSubNew3(ba, object, "SceltaData", true, "");
            long j = jArr2[0];
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
            if (j < anywheresoftware.b4a.keywords.DateTime.DateParse("01/01/2000")) {
                anywheresoftware.b4a.keywords.Common common4 = this.__c;
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Data non valida! Inserire una data successiva al 31/12/1999."), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), getActivityBA());
                anywheresoftware.b4a.keywords.Common common5 = this.__c;
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Operazione annullata"), anywheresoftware.b4a.BA.ObjectToCharSequence("Avviso"), getActivityBA());
            } else {
                anywheresoftware.b4a.keywords.Common common6 = this.__c;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append("Confermi l'impostazione di data e ora ");
                anywheresoftware.b4a.keywords.Common common7 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.DateTime.Date(jArr2[0])).append(" ");
                anywheresoftware.b4a.keywords.Common common8 = this.__c;
                anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
                java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence(append2.append(anywheresoftware.b4a.keywords.DateTime.Time(jArr2[1])).toString());
                java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Conferma impostazione data");
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Conferma", "Annulla", "", cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject(), getActivityBA());
                anywheresoftware.b4a.keywords.Common common9 = this.__c;
                anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
                if (Msgbox2 == -1) {
                    anywheresoftware.b4a.keywords.Common common10 = this.__c;
                    anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
                    anywheresoftware.b4a.keywords.DateTime.setDateFormat("ddMMyy");
                    anywheresoftware.b4a.keywords.Common common11 = this.__c;
                    anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
                    java.lang.String Date = anywheresoftware.b4a.keywords.DateTime.Date(jArr2[0]);
                    anywheresoftware.b4a.keywords.Common common12 = this.__c;
                    anywheresoftware.b4a.keywords.DateTime dateTime6 = anywheresoftware.b4a.keywords.Common.DateTime;
                    anywheresoftware.b4a.keywords.DateTime.setDateFormat("HHmm");
                    java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(Date);
                    anywheresoftware.b4a.keywords.Common common13 = this.__c;
                    anywheresoftware.b4a.keywords.DateTime dateTime7 = anywheresoftware.b4a.keywords.Common.DateTime;
                    java.lang.String sb = append3.append(anywheresoftware.b4a.keywords.DateTime.Date(jArr2[1])).toString();
                    cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("2001" + sb, 5);
                    cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    switch (anywheresoftware.b4a.BA.switchObjectToInt(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._read(), "0", "1", "2")) {
                        case 0:
                            anywheresoftware.b4a.keywords.Common common14 = this.__c;
                            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Data e ora impostate."), anywheresoftware.b4a.BA.ObjectToCharSequence("Avviso"), getActivityBA());
                            break;
                        case 1:
                        case 2:
                            anywheresoftware.b4a.keywords.Common common15 = this.__c;
                            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Operazione annullata"), anywheresoftware.b4a.BA.ObjectToCharSequence("Avviso"), getActivityBA());
                            break;
                    }
                } else {
                    anywheresoftware.b4a.keywords.Common common16 = this.__c;
                    anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Operazione annullata"), anywheresoftware.b4a.BA.ObjectToCharSequence("Avviso"), getActivityBA());
                }
            }
            return "";
        } catch (java.lang.Exception e) {
            this.ba.setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            anywheresoftware.b4a.keywords.Common common17 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
            return "";
        }
    }

    public java.lang.String _initialize(anywheresoftware.b4a.BA ba) throws java.lang.Exception {
        innerInitialize(ba);
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws java.lang.Exception {
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Confermi l'inizializzazione di un nuovo DGFE?");
        java.lang.CharSequence ObjectToCharSequence2 = anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        int Msgbox2 = anywheresoftware.b4a.keywords.Common.Msgbox2(ObjectToCharSequence, ObjectToCharSequence2, "Conferma", "", "Annulla", (android.graphics.Bitmap) anywheresoftware.b4a.keywords.Common.Null, getActivityBA());
        anywheresoftware.b4a.keywords.Common common3 = this.__c;
        anywheresoftware.b4a.keywords.constants.DialogResponse dialogResponse = anywheresoftware.b4a.keywords.Common.DialogResponse;
        if (Msgbox2 == -1) {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("8007", 1);
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("Seguire le istruzioni");
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            java.lang.StringBuilder append2 = append.append("\n").append("che verranno stampate");
            anywheresoftware.b4a.keywords.Common common6 = this.__c;
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence(append2.append("\n").append("sullo scontrino.").toString()), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), getActivityBA());
            return "";
        }
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Operazione annullata!"), anywheresoftware.b4a.BA.ObjectToCharSequence("Avviso"), getActivityBA());
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        boolean _mf_dayisopen;
        try {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            try {
                cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                _mf_dayisopen = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_dayisopen();
            } catch (java.lang.Exception e) {
                this.ba.setLastException(e);
                cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                _mf_dayisopen = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_dayisopen();
            }
        } catch (java.lang.Exception e2) {
            this.ba.setLastException(e2);
            cassandraRisto.ital.mod1 mod1Var = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            anywheresoftware.b4a.BA activityBA = getActivityBA();
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(activityBA, anywheresoftware.b4a.keywords.Common.LastException(getActivityBA()).getMessage());
        }
        if (_mf_dayisopen) {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione ... è necessaria una Chiusura Giornaliera."), anywheresoftware.b4a.BA.ObjectToCharSequence("Avviso"), getActivityBA());
            return "";
        }
        anywheresoftware.b4a.keywords.Common common4 = this.__c;
        anywheresoftware.b4a.BA activityBA2 = getActivityBA();
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Attendere ... invio in corso");
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(activityBA2, ObjectToCharSequence, false);
        anywheresoftware.b4a.keywords.Common common6 = this.__c;
        anywheresoftware.b4a.keywords.Common.DoEvents();
        cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._mf_writelogo(str, str2);
        anywheresoftware.b4a.keywords.Common common7 = this.__c;
        anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
        return "";
    }

    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(java.lang.String str) throws java.lang.Exception {
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("2006" + str, 1);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        java.lang.CharSequence ObjectToCharSequence = anywheresoftware.b4a.BA.ObjectToCharSequence("Attendere la stampa dello scontrino di riepilogo.");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.Common.ToastMessageShow(ObjectToCharSequence, false);
        return "";
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(boolean z, long j, int i, int i2) throws java.lang.Exception {
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
        java.lang.String str = "0000" + anywheresoftware.b4a.BA.NumberToString(i).trim();
        int length = str.length();
        java.lang.String substring = str.substring(length - 4, length);
        java.lang.String str2 = "0000" + anywheresoftware.b4a.BA.NumberToString(i2).trim();
        int length2 = str2.length();
        java.lang.String substring2 = str2.substring(length2 - 4, length2);
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("ddMMyy");
        if (z) {
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.ccefdll ccefdllVar = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("8002");
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = ccefdllVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append.append(anywheresoftware.b4a.keywords.DateTime.Date(j)).append(substring).append(substring2).append("0").toString(), 1);
        } else {
            if (((int) java.lang.Double.parseDouble(substring2)) > _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2()) {
                anywheresoftware.b4a.keywords.Common common3 = this.__c;
                anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Numero ultima chiusura: " + anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2())), anywheresoftware.b4a.BA.ObjectToCharSequence("Avviso"), getActivityBA());
                java.lang.String str3 = "0000" + anywheresoftware.b4a.BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2()).trim();
                int length3 = str3.length();
                substring2 = str3.substring(length3 - 4, length3);
            }
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("8003" + substring + substring2 + "0000", 1);
        }
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0;
    }

    public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(boolean z, long j, long j2, int i, int i2) throws java.lang.Exception {
        int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
        anywheresoftware.b4a.keywords.Common common = this.__c;
        anywheresoftware.b4a.keywords.DateTime dateTime = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("ddMMyy");
        anywheresoftware.b4a.keywords.Common common2 = this.__c;
        anywheresoftware.b4a.keywords.DateTime dateTime2 = anywheresoftware.b4a.keywords.Common.DateTime;
        anywheresoftware.b4a.keywords.DateTime.setDateFormat("dd/MM/yyyy");
        if (z) {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime3 = anywheresoftware.b4a.keywords.Common.DateTime;
            anywheresoftware.b4a.keywords.DateTime.setDateFormat("ddMMyy");
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.ccefdll ccefdllVar = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
            java.lang.StringBuilder append = new java.lang.StringBuilder().append("5002");
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime4 = anywheresoftware.b4a.keywords.Common.DateTime;
            java.lang.StringBuilder append2 = append.append(anywheresoftware.b4a.keywords.DateTime.Date(j));
            anywheresoftware.b4a.keywords.Common common5 = this.__c;
            anywheresoftware.b4a.keywords.DateTime dateTime5 = anywheresoftware.b4a.keywords.Common.DateTime;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = ccefdllVar._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(append2.append(anywheresoftware.b4a.keywords.DateTime.Date(j2)).toString(), 1);
        } else {
            java.lang.String str = "0000" + anywheresoftware.b4a.BA.NumberToString(i).trim();
            int length = str.length();
            java.lang.String substring = str.substring(length - 4, length);
            java.lang.String str2 = "0000" + anywheresoftware.b4a.BA.NumberToString(i2).trim();
            int length2 = str2.length();
            java.lang.String substring2 = str2.substring(length2 - 4, length2);
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("5001" + substring + substring2, 1);
        }
        return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.IsNumber(r10)) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String substring;
        java.lang.String str3 = str + "                      ";
        if (!str2.equals("")) {
            anywheresoftware.b4a.keywords.Common common = this.__c;
            anywheresoftware.b4a.keywords.Common common2 = this.__c;
        }
        str2 = "0";
        double parseDouble = java.lang.Double.parseDouble(str2.replace(",", "."));
        if (parseDouble > 0.0d) {
            anywheresoftware.b4a.keywords.Common common3 = this.__c;
            anywheresoftware.b4a.keywords.Common common4 = this.__c;
            java.lang.String replace = anywheresoftware.b4a.keywords.Common.NumberFormat2(parseDouble * 100.0d, 1, 0, 0, false).replace(",", "").replace("-", "");
            if (replace.length() < 9) {
                substring = "000000000" + replace;
            } else {
                substring = replace.substring(0, 9);
            }
            java.lang.String trim = substring.trim();
            int length = trim.length();
            java.lang.String substring2 = trim.substring(length - 9, length);
            cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3001122" + str3.substring(0, 22) + substring2.substring(0, 9), 1);
            cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3011", 1);
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("3013", 1);
            return "";
        }
        anywheresoftware.b4a.keywords.Common common5 = this.__c;
        anywheresoftware.b4a.keywords.Common.Msgbox(anywheresoftware.b4a.BA.ObjectToCharSequence("Verificare l'importo inserito!"), anywheresoftware.b4a.BA.ObjectToCharSequence("Attenzione!"), getActivityBA());
        return "";
    }

    public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws java.lang.Exception {
        java.lang.String _read;
        cassandraRisto.ital.main mainVar = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7("1104", 9);
        cassandraRisto.ital.main mainVar2 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
        if (cassandraRisto.ital.main._v_tipointerfaccia == 1) {
            cassandraRisto.ital.main mainVar3 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _read = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
        } else {
            cassandraRisto.ital.main mainVar4 = this._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
            _read = cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._read();
        }
        if (_read.substring(0, 4).equals("1104") && _read.length() == 12) {
            return (int) java.lang.Double.parseDouble(_read.substring(4, 8));
        }
        return (int) java.lang.Double.parseDouble(_read.substring(0, 4));
    }

    @Override // anywheresoftware.b4a.BA.SubDelegator
    public java.lang.Object callSub(java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        anywheresoftware.b4a.BA.senderHolder.set(obj);
        return anywheresoftware.b4a.BA.SubDelegator.SubNotFound;
    }
}
