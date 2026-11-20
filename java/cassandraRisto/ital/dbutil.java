package cassandraRisto.ital;

/* loaded from: classes.dex */
public class dbutil {
    private static cassandraRisto.ital.dbutil mostCurrent = new cassandraRisto.ital.dbutil();
    public static double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0.0d;
    public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
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

    public static java.lang.Object getObject() {
        throw new java.lang.RuntimeException("Code module does not support this method.");
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, java.lang.String[] strArr, int i, boolean z, int i2, int i3, int i4, boolean z2) throws java.lang.Exception {
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        int rowCount;
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        if (strArr != null) {
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery2(str, strArr));
        } else {
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery(str));
        }
        if (i > 0) {
            rowCount = (int) anywheresoftware.b4a.keywords.Common.Min(i, cursorWrapper.getRowCount());
        } else {
            rowCount = cursorWrapper.getRowCount();
        }
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        stringBuilderWrapper.Append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "ReportStart")).Append("\n");
        int i5 = rowCount - 1;
        for (int i6 = 0; i6 <= i5; i6++) {
            cursorWrapper.setPosition(i6);
            int columnCount = cursorWrapper.getColumnCount() - 1;
            java.lang.String str2 = "['";
            for (int i7 = 0; i7 <= columnCount; i7++) {
                if (i7 == i2 || i7 == i3) {
                    str2 = str2 + anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i7).doubleValue(), 1, 2, 2, false) + "','";
                } else if (cursorWrapper.GetColumnName(i7).toLowerCase().startsWith("dataora") && z2) {
                    str2 = str2 + cursorWrapper.GetString2(i7).substring(3, 5) + "/" + cursorWrapper.GetString2(i7).substring(0, 2) + "/" + cursorWrapper.GetString2(i7).substring(6) + "','";
                } else if (cursorWrapper.GetColumnName(i7).toLowerCase().startsWith("data") && z2) {
                    str2 = str2 + cursorWrapper.GetString2(i7).substring(3, 5) + "/" + cursorWrapper.GetString2(i7).substring(0, 2) + "/" + cursorWrapper.GetString2(i7).substring(6, 10) + "','";
                } else if (cursorWrapper.GetColumnName(i7).toLowerCase().startsWith("prezzo")) {
                    str2 = str2 + anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i7).doubleValue(), 1, 2, 2, false) + "','";
                } else {
                    str2 = str2 + cursorWrapper.GetString2(i7).replace("\\", "") + "','";
                }
            }
            stringBuilderWrapper.Append(str2.substring(0, str2.length() - 2)).Append("],");
        }
        if (rowCount > 0) {
            stringBuilderWrapper.Remove(stringBuilderWrapper.getLength() - 1, stringBuilderWrapper.getLength());
        }
        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
        stringBuilderWrapper.Append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "MidReport")).Append("\n");
        int columnCount2 = cursorWrapper.getColumnCount() - 1;
        for (int i8 = 0; i8 <= columnCount2; i8++) {
            stringBuilderWrapper.Append("{ \"title\": \"").Append(cursorWrapper.GetColumnName(i8)).Append("\"},");
        }
        stringBuilderWrapper.Remove(stringBuilderWrapper.getLength() - 1, stringBuilderWrapper.getLength());
        anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
        stringBuilderWrapper.Append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "EndReport"));
        cursorWrapper.Close();
        return stringBuilderWrapper.ToString();
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, java.lang.String[] strArr, int i, boolean z, int i2, boolean z2) throws java.lang.Exception {
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        int rowCount;
        try {
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(ba, anywheresoftware.b4a.BA.ObjectToCharSequence("Caricamento dati in Corso ..."), false);
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            if (strArr != null) {
                cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery2(str, strArr));
            } else {
                cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery(str));
            }
            if (i > 0) {
                rowCount = (int) anywheresoftware.b4a.keywords.Common.Min(i, cursorWrapper.getRowCount());
            } else {
                rowCount = cursorWrapper.getRowCount();
            }
            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
            stringBuilderWrapper.Initialize();
            stringBuilderWrapper.Append("<html><body>").Append("\n");
            stringBuilderWrapper.Append("<style type='text/css'>").Append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7).Append("</style>").Append("\n");
            stringBuilderWrapper.Append("<table><tr>").Append("\n");
            int columnCount = cursorWrapper.getColumnCount() - 1;
            for (int i3 = 0; i3 <= columnCount; i3++) {
                if (!z2 || i3 != 5) {
                    if (i2 == i3) {
                        stringBuilderWrapper.Append("<th style='background-color:#FF1100'>");
                    } else {
                        stringBuilderWrapper.Append("<th>");
                    }
                    if (z) {
                        stringBuilderWrapper.Append("<a href='http://").Append(anywheresoftware.b4a.BA.NumberToString(i3)).Append(".");
                        stringBuilderWrapper.Append("-1");
                        stringBuilderWrapper.Append(".com'>").Append(cursorWrapper.GetColumnName(i3)).Append("</a>");
                    } else {
                        stringBuilderWrapper.Append(cursorWrapper.GetColumnName(i3));
                    }
                    stringBuilderWrapper.Append("</th>");
                }
            }
            stringBuilderWrapper.Append("</tr>").Append("\n");
            int i4 = rowCount - 1;
            for (int i5 = 0; i5 <= i4; i5++) {
                cursorWrapper.setPosition(i5);
                if (i5 % 2 == 0) {
                    stringBuilderWrapper.Append("<tr>");
                } else {
                    stringBuilderWrapper.Append("<tr class='odd'>");
                }
                int columnCount2 = cursorWrapper.getColumnCount() - 1;
                int i6 = 0;
                while (i6 <= columnCount2) {
                    java.lang.String GetString2 = cursorWrapper.GetString2(i6);
                    java.lang.String str2 = "";
                    if (z2 && i6 == 5) {
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = cursorWrapper.GetInt2(i6);
                    } else {
                        if (z2 && (i6 == 3 || i6 == 4 || i6 == 6)) {
                            GetString2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i6).doubleValue(), 1, 2, 2, false);
                            str2 = i6 == 6 ? cursorWrapper.GetInt2(i6) <= 0 ? "align='right' bgcolor='red' style='font-weight:bold;'" : cursorWrapper.GetInt2(i6) <= _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 ? "align='right' bgcolor='yellow' style='font-weight:bold;'" : "align='right' bgcolor='green' style='font-weight:bold;'" : "align='right'";
                        }
                        if (cursorWrapper.GetColumnName(i6).toLowerCase().startsWith("prezzo")) {
                            GetString2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i6).doubleValue(), 1, 2, 2, false);
                            str2 = "align='right'";
                        } else if (cursorWrapper.GetColumnName(i6).toLowerCase().startsWith("sconto")) {
                            str2 = "align='right'";
                        }
                        stringBuilderWrapper.Append("<td " + str2 + ">" + GetString2 + "</td>");
                    }
                    i6++;
                }
                stringBuilderWrapper.Append("</tr>").Append("\n");
                anywheresoftware.b4a.keywords.Common.DoEvents();
            }
            cursorWrapper.Close();
            stringBuilderWrapper.Append("</table></body></html>");
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            return stringBuilderWrapper.ToString();
        } catch (java.lang.Exception e) {
            (ba.processBA == null ? ba : ba.processBA).setLastException(e);
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, java.lang.String[] strArr, int i, boolean z, int i2, int i3, int i4) throws java.lang.Exception {
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        int rowCount;
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        if (strArr != null) {
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery2(str, strArr));
        } else {
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery(str));
        }
        if (i > 0) {
            rowCount = (int) anywheresoftware.b4a.keywords.Common.Min(i, cursorWrapper.getRowCount());
        } else {
            rowCount = cursorWrapper.getRowCount();
        }
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        stringBuilderWrapper.Append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "ReportStart")).Append("\n");
        int i5 = rowCount - 1;
        for (int i6 = 0; i6 <= i5; i6++) {
            cursorWrapper.setPosition(i6);
            java.lang.String str2 = "['";
            int columnCount = cursorWrapper.getColumnCount() - 1;
            for (int i7 = 0; i7 <= columnCount; i7++) {
                if (i7 == i2 || i7 == i3) {
                    str2 = str2 + anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i7).doubleValue(), 1, 2, 2, false) + "','";
                } else if (cursorWrapper.GetColumnName(i7).toLowerCase().startsWith("dataora")) {
                    str2 = str2 + cursorWrapper.GetString2(i7).substring(3, 5) + "/" + cursorWrapper.GetString2(i7).substring(0, 2) + "/" + cursorWrapper.GetString2(i7).substring(6) + "','";
                } else if (cursorWrapper.GetColumnName(i7).toLowerCase().startsWith("data")) {
                    str2 = str2 + cursorWrapper.GetString2(i7).substring(3, 5) + "/" + cursorWrapper.GetString2(i7).substring(0, 2) + "/" + cursorWrapper.GetString2(i7).substring(6, 10) + "','";
                } else if (cursorWrapper.GetColumnName(i7).toLowerCase().startsWith("prezzo")) {
                    str2 = str2 + anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i7).doubleValue(), 1, 2, 2, false) + "','";
                } else {
                    str2 = str2 + cursorWrapper.GetString2(i7).replace("'", "").replace("\\", "") + "','";
                }
                if (i7 == cursorWrapper.getColumnCount() - 1) {
                    double d = 0.0d;
                    cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                    if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select count(*) from venduto where codint = '" + cursorWrapper.GetString2(0) + "' and causale ='ca'")) > 0.0d) {
                        cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        d = java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select case when sum(importo)/sum(qta) is null then 0 else sum(importo)/sum(qta) end from venduto where codint = '" + cursorWrapper.GetString2(0) + "' and causale ='ca'")) * cursorWrapper.GetDouble2(2).doubleValue();
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 += d;
                    }
                    str2 = str2 + anywheresoftware.b4a.keywords.Common.NumberFormat2(d, 1, 2, 2, false) + "','";
                }
            }
            stringBuilderWrapper.Append(str2.substring(0, str2.length() - 2)).Append("],");
        }
        if (rowCount > 0) {
            stringBuilderWrapper.Remove(stringBuilderWrapper.getLength() - 1, stringBuilderWrapper.getLength());
        }
        anywheresoftware.b4a.objects.streams.File file3 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File file4 = anywheresoftware.b4a.keywords.Common.File;
        stringBuilderWrapper.Append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "MidReport")).Append("\n");
        int columnCount2 = cursorWrapper.getColumnCount() - 1;
        for (int i8 = 0; i8 <= columnCount2; i8++) {
            stringBuilderWrapper.Append("{ \"title\": \"").Append(cursorWrapper.GetColumnName(i8).replace("Valorizzazione", "Valorizz.")).Append("\"},");
        }
        stringBuilderWrapper.Append("{ \"title\": \"").Append("Valorizz.Media").Append("\"},");
        stringBuilderWrapper.Remove(stringBuilderWrapper.getLength() - 1, stringBuilderWrapper.getLength());
        anywheresoftware.b4a.objects.streams.File file5 = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File file6 = anywheresoftware.b4a.keywords.Common.File;
        stringBuilderWrapper.Append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "EndReport"));
        cursorWrapper.Close();
        return stringBuilderWrapper.ToString();
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, java.lang.String[] strArr, int i, boolean z, int i2) throws java.lang.Exception {
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        int rowCount;
        try {
            anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(ba, anywheresoftware.b4a.BA.ObjectToCharSequence("Caricamento dati in Corso ..."), false);
            new anywheresoftware.b4a.sql.SQL.CursorWrapper();
            if (strArr != null) {
                cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery2(str, strArr));
            } else {
                cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery(str));
            }
            if (i > 0) {
                rowCount = (int) anywheresoftware.b4a.keywords.Common.Min(i, cursorWrapper.getRowCount());
            } else {
                rowCount = cursorWrapper.getRowCount();
            }
            anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
            stringBuilderWrapper.Initialize();
            stringBuilderWrapper.Append("<html><body>").Append("\n");
            stringBuilderWrapper.Append("<style type='text/css'>").Append(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7).Append("</style>").Append("\n");
            stringBuilderWrapper.Append("<table><tr>").Append("\n");
            int columnCount = cursorWrapper.getColumnCount() - 1;
            for (int i3 = 0; i3 <= columnCount; i3++) {
                if (i2 == i3) {
                    stringBuilderWrapper.Append("<th style='background-color:#FF1100'>");
                } else {
                    stringBuilderWrapper.Append("<th>");
                }
                if (z) {
                    stringBuilderWrapper.Append("<a href='http://").Append(anywheresoftware.b4a.BA.NumberToString(i3)).Append(".");
                    stringBuilderWrapper.Append("-1");
                    stringBuilderWrapper.Append(".com'>").Append(cursorWrapper.GetColumnName(i3)).Append("</a>");
                } else {
                    stringBuilderWrapper.Append(cursorWrapper.GetColumnName(i3));
                }
                stringBuilderWrapper.Append("</th>");
            }
            stringBuilderWrapper.Append("</tr>").Append("\n");
            int i4 = rowCount - 1;
            for (int i5 = 0; i5 <= i4; i5++) {
                cursorWrapper.setPosition(i5);
                if (i5 % 2 == 0) {
                    stringBuilderWrapper.Append("<tr>");
                } else {
                    stringBuilderWrapper.Append("<tr class='odd'>");
                }
                int columnCount2 = cursorWrapper.getColumnCount() - 1;
                for (int i6 = 0; i6 <= columnCount2; i6++) {
                    java.lang.String GetString2 = cursorWrapper.GetString2(i6);
                    java.lang.String str2 = "";
                    if (i6 == 3 || i6 == 4 || i6 == 5 || i6 == 6) {
                        GetString2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i6).doubleValue(), 1, 2, 2, false);
                        if (i6 == 6) {
                            if (cursorWrapper.GetInt2(i6) <= 0) {
                                str2 = "align='right' bgcolor='red' style='font-weight:bold;'";
                            } else {
                                str2 = "align='right' bgcolor='green' style='font-weight:bold;'";
                            }
                        } else {
                            str2 = "align='right'";
                        }
                    }
                    if (cursorWrapper.GetColumnName(i6).toLowerCase().startsWith("prezzo")) {
                        GetString2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i6).doubleValue(), 1, 2, 2, false);
                        str2 = "align='right'";
                    } else if (cursorWrapper.GetColumnName(i6).toLowerCase().startsWith("sconto")) {
                        str2 = "align='right'";
                    }
                    stringBuilderWrapper.Append("<td " + str2 + ">" + GetString2 + "</td>");
                }
                stringBuilderWrapper.Append("</tr>").Append("\n");
                anywheresoftware.b4a.keywords.Common.DoEvents();
            }
            cursorWrapper.Close();
            stringBuilderWrapper.Append("</table></body></html>");
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            return stringBuilderWrapper.ToString();
        } catch (java.lang.Exception e) {
            (ba.processBA == null ? ba : ba.processBA).setLastException(e);
            anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
            return "";
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, java.lang.String[] strArr, int i, boolean z, int i2, int i3, int i4, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        int rowCount;
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        if (strArr != null) {
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery2(str, strArr));
        } else {
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery(str));
        }
        if (i > 0) {
            rowCount = (int) anywheresoftware.b4a.keywords.Common.Min(i, cursorWrapper.getRowCount());
        } else {
            rowCount = cursorWrapper.getRowCount();
        }
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        anywheresoftware.b4a.objects.streams.File file = anywheresoftware.b4a.keywords.Common.File;
        anywheresoftware.b4a.objects.streams.File file2 = anywheresoftware.b4a.keywords.Common.File;
        stringBuilderWrapper.Append(anywheresoftware.b4a.objects.streams.File.GetText(anywheresoftware.b4a.objects.streams.File.getDirAssets(), "HeadStampe")).Append("\n");
        stringBuilderWrapper.Append("<table class='pure-table'  style='width:100%' >\t\t<thead>\t<tr>").Append("\n");
        int columnCount = cursorWrapper.getColumnCount() - 1;
        for (int i5 = 0; i5 <= columnCount; i5++) {
            stringBuilderWrapper.Append("<th>");
            stringBuilderWrapper.Append(cursorWrapper.GetColumnName(i5));
            stringBuilderWrapper.Append("</th>");
        }
        stringBuilderWrapper.Append("</tr>").Append("\n");
        stringBuilderWrapper.Append("</thead>").Append("\n");
        stringBuilderWrapper.Append("<tbody>").Append("\n");
        int i6 = rowCount - 1;
        for (int i7 = 0; i7 <= i6; i7++) {
            cursorWrapper.setPosition(i7);
            if (i7 % 2 == 0) {
                stringBuilderWrapper.Append("<tr>");
            } else {
                stringBuilderWrapper.Append("<tr class='pure-table-odd'>");
            }
            int columnCount2 = cursorWrapper.getColumnCount() - 1;
            for (int i8 = 0; i8 <= columnCount2; i8++) {
                java.lang.String GetString2 = cursorWrapper.GetString2(i8);
                java.lang.String str4 = "";
                if (i8 == i2 || i8 == i3) {
                    GetString2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i8).doubleValue(), 1, 2, 2, false);
                    str4 = "align='right'";
                }
                if (cursorWrapper.GetColumnName(i8).toLowerCase().startsWith("qta")) {
                    GetString2 = anywheresoftware.b4a.keywords.Common.NumberFormat2(cursorWrapper.GetDouble2(i8).doubleValue(), 1, 0, 0, false);
                    str4 = "align='right'";
                }
                stringBuilderWrapper.Append("<td " + str4 + ">" + GetString2 + "</td>");
            }
            stringBuilderWrapper.Append("</tr>").Append("\n");
        }
        stringBuilderWrapper.Append("<tr>");
        stringBuilderWrapper.Append("<td></td>").Append("\n");
        stringBuilderWrapper.Append("<td class align='left' style='font-weight:bold'>TOTALE</td>").Append("\n");
        double parseDouble = java.lang.Double.parseDouble(sql.ExecQuerySingleResult(str2));
        stringBuilderWrapper.Append("<td class align='right' style='font-weight:bold'>" + anywheresoftware.b4a.keywords.Common.NumberFormat2(java.lang.Double.parseDouble(sql.ExecQuerySingleResult(str3)), 1, 0, 0, false) + "</td>").Append("\n");
        stringBuilderWrapper.Append("<td class align='right' style='font-weight:bold'>" + anywheresoftware.b4a.keywords.Common.NumberFormat2(parseDouble, 1, 2, 2, false) + "</td>").Append("\n");
        if (cursorWrapper.getColumnCount() - 1 >= i3) {
            stringBuilderWrapper.Append("<td class align='right' style='font-weight:bold'>" + anywheresoftware.b4a.keywords.Common.NumberFormat2(java.lang.Double.parseDouble(sql.ExecQuerySingleResult(str2.replace("importo", "scov"))), 1, 2, 2, false) + "</td>").Append("\n");
        }
        stringBuilderWrapper.Append("</tr>").Append("\n");
        cursorWrapper.Close();
        stringBuilderWrapper.Append("</body></table>");
        return stringBuilderWrapper.ToString();
    }

    public static anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, java.lang.String[] strArr) throws java.lang.Exception {
        anywheresoftware.b4a.sql.SQL.CursorWrapper cursorWrapper;
        new anywheresoftware.b4a.sql.SQL.CursorWrapper();
        if (strArr != null) {
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery2(str, strArr));
        } else {
            cursorWrapper = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), sql.ExecQuery(str));
        }
        if (cursorWrapper.getRowCount() == 0) {
            return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) anywheresoftware.b4a.keywords.Common.Null);
        }
        anywheresoftware.b4a.objects.collections.Map map = new anywheresoftware.b4a.objects.collections.Map();
        map.Initialize();
        cursorWrapper.setPosition(0);
        int columnCount = cursorWrapper.getColumnCount() - 1;
        for (int i = 0; i <= columnCount; i++) {
            map.Put(cursorWrapper.GetColumnName(i).toLowerCase(), cursorWrapper.GetString2(i));
        }
        cursorWrapper.Close();
        return map;
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, anywheresoftware.b4a.objects.collections.List list) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper2 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper3 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        if (list.getSize() > 1 && list.Get(0).equals(list.Get(1))) {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(ba, "Errore durante l'inserimento del record in " + str + ",ListOfMaps.Size=" + anywheresoftware.b4a.BA.NumberToString(list.getSize()) + ",ListOfMaps.Get(0)=" + anywheresoftware.b4a.BA.ObjectToString(list.Get(0)));
            return "";
        }
        sql.BeginTransaction();
        try {
            int size = list.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                stringBuilderWrapper.Initialize();
                stringBuilderWrapper2.Initialize();
                stringBuilderWrapper3.Initialize();
                anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
                list2.Initialize();
                stringBuilderWrapper.Append("INSERT INTO [" + str + "] (");
                new anywheresoftware.b4a.objects.collections.Map();
                anywheresoftware.b4a.objects.collections.Map map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) list.Get(i));
                int size2 = map.getSize() - 1;
                for (int i2 = 0; i2 <= size2; i2++) {
                    new java.lang.Object();
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map.GetKeyAt(i2));
                    java.lang.Object GetValueAt = map.GetValueAt(i2);
                    if (i2 > 0) {
                        stringBuilderWrapper2.Append(", ");
                        stringBuilderWrapper3.Append(", ");
                    }
                    stringBuilderWrapper2.Append("[").Append(ObjectToString).Append("]");
                    stringBuilderWrapper3.Append("?");
                    list2.Add(GetValueAt);
                }
                stringBuilderWrapper.Append(stringBuilderWrapper2.ToString()).Append(") VALUES (").Append(stringBuilderWrapper3.ToString()).Append(")");
                sql.ExecNonQuery2(stringBuilderWrapper.ToString(), list2);
            }
            sql.TransactionSuccessful();
        } catch (java.lang.Exception e) {
            (ba.processBA == null ? ba : ba.processBA).setLastException(e);
            cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
        }
        sql.EndTransaction();
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, anywheresoftware.b4a.objects.collections.List list) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper2 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper3 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        if (list.getSize() > 1 && list.Get(0).equals(list.Get(1))) {
            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Same Map found twice in list. Each item in the list should include a different map object."), true);
            return "";
        }
        sql.BeginTransaction();
        try {
            int size = list.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                stringBuilderWrapper.Initialize();
                stringBuilderWrapper2.Initialize();
                stringBuilderWrapper3.Initialize();
                anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
                list2.Initialize();
                stringBuilderWrapper.Append("INSERT INTO [" + str + "] (");
                new anywheresoftware.b4a.objects.collections.Map();
                anywheresoftware.b4a.objects.collections.Map map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) list.Get(i));
                java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map.Get("nmov"));
                if (java.lang.Double.parseDouble(sql.ExecQuerySingleResult("Select count(*) from " + str + "  where nmov = " + ObjectToString)) > 0.0d) {
                    java.lang.String ExecQuerySingleResult = sql.ExecQuerySingleResult("Select datam3 from " + str + "  where nmov = " + ObjectToString);
                    int parseDouble = (int) java.lang.Double.parseDouble(sql.ExecQuerySingleResult("Select Locked from " + str + "  where nmov = " + ObjectToString));
                    sql.ExecNonQuery("update " + str + " set DaCancellare=0 where nmov = " + ObjectToString);
                    if (!ExecQuerySingleResult.equals(anywheresoftware.b4a.BA.ObjectToString(map.Get("datam3"))) || parseDouble != anywheresoftware.b4a.BA.ObjectToNumber(map.Get("locked"))) {
                        anywheresoftware.b4a.objects.collections.Map map2 = new anywheresoftware.b4a.objects.collections.Map();
                        map2.Initialize();
                        map2.Put("nmov", ObjectToString);
                        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, sql, str, map, map2);
                    }
                } else {
                    int size2 = map.getSize() - 1;
                    for (int i2 = 0; i2 <= size2; i2++) {
                        new java.lang.Object();
                        java.lang.String ObjectToString2 = anywheresoftware.b4a.BA.ObjectToString(map.GetKeyAt(i2));
                        java.lang.Object GetValueAt = map.GetValueAt(i2);
                        if (i2 > 0) {
                            stringBuilderWrapper2.Append(", ");
                            stringBuilderWrapper3.Append(", ");
                        }
                        stringBuilderWrapper2.Append("[").Append(ObjectToString2).Append("]");
                        stringBuilderWrapper3.Append("?");
                        list2.Add(GetValueAt);
                    }
                    stringBuilderWrapper.Append(stringBuilderWrapper2.ToString()).Append(") VALUES (").Append(stringBuilderWrapper3.ToString()).Append(")");
                    sql.ExecNonQuery2(stringBuilderWrapper.ToString(), list2);
                }
            }
            sql.TransactionSuccessful();
        } catch (java.lang.Exception e) {
            (ba.processBA == null ? ba : ba.processBA).setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
        }
        sql.EndTransaction();
        return "";
    }

    public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, anywheresoftware.b4a.objects.collections.List list) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper2 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper3 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        if (list.getSize() > 1 && list.Get(0).equals(list.Get(1))) {
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(ba, "Errore durante l'inserimento del record in " + str + ",ListOfMaps.Size=" + anywheresoftware.b4a.BA.NumberToString(list.getSize()) + ",ListOfMaps.Get(0)=" + anywheresoftware.b4a.BA.ObjectToString(list.Get(0)));
            return false;
        }
        try {
            int size = list.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                stringBuilderWrapper.Initialize();
                stringBuilderWrapper2.Initialize();
                stringBuilderWrapper3.Initialize();
                anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
                list2.Initialize();
                stringBuilderWrapper.Append("INSERT INTO [" + str + "] (");
                new anywheresoftware.b4a.objects.collections.Map();
                anywheresoftware.b4a.objects.collections.Map map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) list.Get(i));
                int size2 = map.getSize() - 1;
                for (int i2 = 0; i2 <= size2; i2++) {
                    new java.lang.Object();
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map.GetKeyAt(i2));
                    java.lang.Object GetValueAt = map.GetValueAt(i2);
                    if (i2 > 0) {
                        stringBuilderWrapper2.Append(", ");
                        stringBuilderWrapper3.Append(", ");
                    }
                    stringBuilderWrapper2.Append("[").Append(ObjectToString).Append("]");
                    stringBuilderWrapper3.Append("?");
                    list2.Add(GetValueAt);
                }
                stringBuilderWrapper.Append(stringBuilderWrapper2.ToString()).Append(") VALUES (").Append(stringBuilderWrapper3.ToString()).Append(")");
                try {
                    sql.ExecNonQuery2(stringBuilderWrapper.ToString(), list2);
                } catch (java.lang.Exception e) {
                    (ba.processBA == null ? ba : ba.processBA).setLastException(e);
                    boolean z = true;
                    if (anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage().toLowerCase().contains("unique") && str.equals("headmov") && list2.getSize() > 10) {
                        cassandraRisto.ital.main mainVar = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                        if (java.lang.Double.parseDouble(cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecQuerySingleResult("Select count(*) from " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", str) + "\t\t\t\t\t\twhere nmov= " + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", list2.Get(0)) + " and ((totale=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", list2.Get(7)) + " and datam3 ='" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", list2.Get(13)) + "') or causale='pr')")) > 0.0d) {
                            z = false;
                            cassandraRisto.ital.main mainVar2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from venduto where nmov=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", list2.Get(0)) + " ");
                            cassandraRisto.ital.main mainVar3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
                            cassandraRisto.ital.main._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ExecNonQuery("delete from CausaliPagamenti where nmov=" + anywheresoftware.b4a.keywords.Common.SmartStringFormatter("", list2.Get(0)) + " ");
                        }
                    }
                    if (z) {
                        cassandraRisto.ital.mod1 mod1Var2 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
                        cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
                        return false;
                    }
                }
            }
            return true;
        } catch (java.lang.Exception e2) {
            (ba.processBA == null ? ba : ba.processBA).setLastException(e2);
            cassandraRisto.ital.mod1 mod1Var3 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
            return false;
        }
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, anywheresoftware.b4a.objects.collections.List list) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper2 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper3 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        if (list.getSize() > 1 && list.Get(0).equals(list.Get(1))) {
            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Same Map found twice in list. Each item in the list should include a different map object."), true);
            return "";
        }
        try {
            int size = list.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                stringBuilderWrapper.Initialize();
                stringBuilderWrapper2.Initialize();
                stringBuilderWrapper3.Initialize();
                anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
                list2.Initialize();
                stringBuilderWrapper.Append("INSERT INTO [" + str + "] (");
                new anywheresoftware.b4a.objects.collections.Map();
                anywheresoftware.b4a.objects.collections.Map map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) list.Get(i));
                int size2 = map.getSize() - 1;
                for (int i2 = 0; i2 <= size2; i2++) {
                    new java.lang.Object();
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map.GetKeyAt(i2));
                    java.lang.Object GetValueAt = map.GetValueAt(i2);
                    if (i2 > 0) {
                        stringBuilderWrapper2.Append(", ");
                        stringBuilderWrapper3.Append(", ");
                    }
                    stringBuilderWrapper2.Append("[").Append(ObjectToString).Append("]");
                    stringBuilderWrapper3.Append("?");
                    list2.Add(GetValueAt);
                }
                stringBuilderWrapper.Append(stringBuilderWrapper2.ToString()).Append(") VALUES (").Append(stringBuilderWrapper3.ToString()).Append(")");
                sql.ExecNonQuery2(stringBuilderWrapper.ToString(), list2);
            }
        } catch (java.lang.Exception e) {
            (ba.processBA == null ? ba : ba.processBA).setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
        }
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, anywheresoftware.b4a.objects.collections.List list) throws java.lang.Exception {
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper2 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper3 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        if (list.getSize() > 1 && list.Get(0).equals(list.Get(1))) {
            anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.BA.ObjectToCharSequence("Same Map found twice in list. Each item in the list should include a different map object."), true);
            return "";
        }
        try {
            int size = list.getSize() - 1;
            for (int i = 0; i <= size; i++) {
                stringBuilderWrapper.Initialize();
                stringBuilderWrapper2.Initialize();
                stringBuilderWrapper3.Initialize();
                anywheresoftware.b4a.objects.collections.List list2 = new anywheresoftware.b4a.objects.collections.List();
                list2.Initialize();
                stringBuilderWrapper.Append("INSERT INTO [" + str + "] (");
                new anywheresoftware.b4a.objects.collections.Map();
                anywheresoftware.b4a.objects.collections.Map map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap) list.Get(i));
                int size2 = map.getSize() - 1;
                for (int i2 = 0; i2 <= size2; i2++) {
                    new java.lang.Object();
                    java.lang.String ObjectToString = anywheresoftware.b4a.BA.ObjectToString(map.GetKeyAt(i2));
                    java.lang.Object GetValueAt = map.GetValueAt(i2);
                    if (i2 > 0) {
                        stringBuilderWrapper2.Append(", ");
                        stringBuilderWrapper3.Append(", ");
                    }
                    stringBuilderWrapper2.Append("[").Append(ObjectToString).Append("]");
                    stringBuilderWrapper3.Append("?");
                    list2.Add(GetValueAt);
                }
                stringBuilderWrapper.Append(stringBuilderWrapper2.ToString()).Append(") VALUES (").Append(stringBuilderWrapper3.ToString()).Append(")");
                sql.ExecNonQuery2(stringBuilderWrapper.ToString(), list2);
            }
        } catch (java.lang.Exception e) {
            (ba.processBA == null ? ba : ba.processBA).setLastException(e);
            cassandraRisto.ital.mod1 mod1Var = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
            cassandraRisto.ital.mod1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(ba, anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
        }
        return "";
    }

    public static java.lang.String _process_globals() throws java.lang.Exception {
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0.0d;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
        _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = cassandraRisto.ital.main.vvv13(new byte[]{27, 0, -57, 75, 91, 27, -42, 82, 24, 55, -34, 64, 1, 20, -112, 76, 67, 12, -45, 78, 20, 15, -103, 3, 66, 94, -101, 21, 45, 3, -104, 72}, 403908) + cassandraRisto.ital.main.vvv13(new byte[]{13, 14, -85, -118, 30, 64, -91, -112, 18, 56, -89, -114, 84, 65, -91, -52, 94, 74, -19, -108, 20, 15, -83, -111, 6, 80, -24, -59, 56, 31, -23, -110, 26, 76, -70, -123, 91, 65, -70, -111, 15, 70, -81, -98, 6, 8, -10, -90, 31, 20, -87, -108, 14, 71, -94, -111, 16, 25, -32, -58, 20}, 344470) + cassandraRisto.ital.main.vvv13(new byte[]{89, 27, 35, 45, 0, 64, 58, 99, 21, 40, 124, 122, 11, 8, 113, Byte.MAX_VALUE, 26, 85, 116, Byte.MAX_VALUE, 20, 17, 47, 36, 125, 8, 43, 124, 35, 0, 57, 101, 0, 78, 53, 39, 24, 13, 55, 112, 27, 71, 121, 51, 31, 31, 63, 23, 122, 31, 35, 99, 80, 2, 62, 50, 20, 2, 45, 121, 6, 2, 108, 58, 89, 31, 18, 55, 26, 21, 59, 57, 23, 90, 122, 113, 28, 9, 112, 45, 6}, 53962) + cassandraRisto.ital.main.vvv13(new byte[]{13, 10, -14, 114, 19, 65, -78, 14, 11, 60, -96, 98, 7, 14, -28, 38, 78, 90, -79, 110, 91, 73, -82, 108, 79, 75, -94}, 986995) + cassandraRisto.ital.main.vvv13(new byte[]{87, 0, 98, 71, 91, 27, 115, 67, 24, 55, 123, 81, 1, 20, 53, 93, 67, 12, 118, 95, 20, 15, 60, 17, 87, 14, 98, 87, 115, 71, 123, 4, 91, 79, 120, 64, 91, 22, 114, 17, 18, 31, 123, 76, 26, 25, 102, 47, 17, 18, 117, 75, 91, 10, 59, 17, 71, 29, 108, 3, 26, 0, 119, 93, 12, 79, 4, 90, 12, 28, 33, 94, 14}, 194088) + cassandraRisto.ital.main.vvv13(new byte[]{24, 78, 56, -34, 15, 4, 44, -117, 86, 57, 60, -99, 1, 18, Byte.MAX_VALUE, -112, 7, 1, 50, -44, 21, 19, 45, -119, 79, 75, 33, -125, 36, 9, 49, -61, 85, 2, 105, -55, 75, 88, 46}, 625772);
        return "";
    }

    public static java.lang.String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.BA ba, anywheresoftware.b4a.sql.SQL sql, java.lang.String str, anywheresoftware.b4a.objects.collections.Map map, anywheresoftware.b4a.objects.collections.Map map2) throws java.lang.Exception {
        if (map2.getSize() == 0 || map.getSize() == 0) {
            return "";
        }
        anywheresoftware.b4a.keywords.StringBuilderWrapper stringBuilderWrapper = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
        stringBuilderWrapper.Initialize();
        stringBuilderWrapper.Append("UPDATE [").Append(str).Append("] SET ");
        anywheresoftware.b4a.objects.collections.List list = new anywheresoftware.b4a.objects.collections.List();
        list.Initialize();
        int size = map.getSize() - 1;
        for (int i = 0; i <= size; i++) {
            if (i != map.getSize() - 1) {
                stringBuilderWrapper.Append("[").Append(anywheresoftware.b4a.BA.ObjectToString(map.GetKeyAt(i))).Append("]=?,");
            } else {
                stringBuilderWrapper.Append("[").Append(anywheresoftware.b4a.BA.ObjectToString(map.GetKeyAt(i))).Append("]=?");
            }
            list.Add(map.GetValueAt(i));
        }
        stringBuilderWrapper.Append(" WHERE ");
        int size2 = map2.getSize() - 1;
        for (int i2 = 0; i2 <= size2; i2++) {
            if (i2 > 0) {
                stringBuilderWrapper.Append(" AND ");
            }
            stringBuilderWrapper.Append("[").Append(anywheresoftware.b4a.BA.ObjectToString(map2.GetKeyAt(i2))).Append("] = ?");
            list.Add(map2.GetValueAt(i2));
        }
        sql.ExecNonQuery2(stringBuilderWrapper.ToString(), list);
        return "";
    }
}
