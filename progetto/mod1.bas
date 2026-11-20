B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Type tnazione(CEE As Boolean, alpha3 As String, descrizione As String, id As String)
	Type mdatidocsb(Cliente As String, DaVenduto As Boolean, TipoDoc As String, TmpFattura As String, TmpHeadDoc As String, Totale As Double, nFattura As String, nmov As String)
	Public vStr1 As String = Main.Sub210(Array As Byte(52, 14, 50, 54), 90362)
	Public vStr2 As String
	Public vBln1 As Boolean
	Public vBln2 As Boolean = True
	Public vBln3 As Boolean
	Public vBln4 As Boolean
	Public vBln5 As Boolean
	Public vStr3 As String
	Public vBln6 As Boolean
	Public vBln7 As Boolean
	Public vStr4 As String
	Public vMap1 As Map
	Public vBln8 As Boolean
	Public vLst1 As List
	Public vBln9 As Boolean
	Public vBln10 As Boolean
	Public vStr5 As String
	Public vStr6 As String
	Public vStr7 As String
	Public vcgs1databar1 As cgs1databar
	Public vSMTP1 As SMTP
	Public vInt1 As Int
	Public vStr8 As String
	Public vByteArr1(0) As Byte
	Public vBln11 As Boolean
	Public vInt2 As Int
	Public vStr9 As String
	Public vPDFPaperSizes1 As PDFPaperSizes
	Public r2(15) As Reflector
	Public vStringArr1(15) As String
	Public vIntArr1(15) As Int
	Public vIntArr2(15) As Int
	Public vMap2 As Map
	Public vInt3 As Int = -1
	Public vBln12 As Boolean
	Public vMap3 As Map
	Public vMap4 As Map
	Public vInt4 As Int
	Public vLst2 As List
	Public vMap5 As Map
	Public vInt5 As Int
End Sub

Sub Sub001(cursorWrapper As Cursor) As String
	Dim str As String
	Dim str2 As String
	Dim str3 As String
	Dim str4 As String
	Dim str5 As String
	Dim str6 As String
	Dim str7 As String
	Try
		Dim str8 As String = cursorWrapper.GetString("codice").Trim & TAB & cursorWrapper.GetString("descrizione").Trim & TAB & cursorWrapper.GetString("via").Trim & TAB & cursorWrapper.GetString("cap").Trim & TAB & cursorWrapper.GetString("citta").Trim & TAB & cursorWrapper.GetString("provincia").Trim & TAB & cursorWrapper.GetString("telefono").Trim & TAB & cursorWrapper.GetString("fax").Trim & TAB & cursorWrapper.GetString("piva").Trim & TAB & cursorWrapper.GetString("abpunti").Trim & TAB & cursorWrapper.GetString("abprep").Trim & TAB & cursorWrapper.GetString("abpost").Trim & TAB & cursorWrapper.GetString("mail").Trim & TAB & cursorWrapper.GetString("codf").Trim
		Dim vNumberToString As String = 2
		Dim vNumberToString2 As String = 0
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from FEdatiCli where Codice = '" & cursorWrapper.GetString("codice") & "'")
		If cursorWrapper3.RowCount <= 0 Then
			str = vNumberToString2
			str2 = ""
			str3 = "0000000"
			str4 = ""
			str5 = ""
			str6 = vNumberToString
			str7 = "IT"
		Else
			cursorWrapper3.Position = 0
			str7 = cursorWrapper3.GetString("NazioneCli")
			str6 = cursorWrapper3.GetString("TipoSoggettoCli")
			Dim vGetString As String = cursorWrapper3.GetString("EsigibilitaIVA")
			str5 = cursorWrapper3.GetString("NomeCli")
			str4 = cursorWrapper3.GetString("CognomeCli")
			str2 = cursorWrapper3.GetString("PEC")
			str3 = cursorWrapper3.GetString("CodiceDestinatario")
			str = vGetString
		End If
		Dim str9 As String = str8 & TAB & str7 & TAB & str6 & TAB & str5 & TAB & str4 & TAB & str3 & TAB & str2 & TAB & str & TAB & cursorWrapper.GetString("codLotteria").Trim & CRLF
		If Main.v_sendclienti = 0 Then
			Main.vSql1.ExecNonQuery("update clienti set DaInviare=0 where codice = '" & cursorWrapper.GetString("codice").Trim & "'")
			Return str9
		End If
		Return str9
	Catch
		Sub217(LastException.Message)
		Return ""
	End Try
End Sub

Sub Sub002(str As String, i As Int, map As Map, str2 As String, cursorWrapper As Cursor, str3 As String, z As Boolean, list As List, z2 As Boolean, str4 As String, activityWrapper As Activity) As String
	Dim map2 As Map
	Dim substring As String = str.SubString2(0, 10)
	list.Initialize
	map2.Initialize
	If Not(map.IsInitialized) Then
		Return ""
	End If
	Dim sb2 As String = Main.v_nnegozio & "_" & Main.v_numcassa & "_" & Main.v_barra & "_" & substring & "_" & i
	Dim cursorWrapper2 As Cursor
	Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from FEdatiCli where Codice ='" & SmartStringFormatter("", str2) & "'")
	If cursorWrapper3.RowCount <= 0 Then
		Return ""
	End If
	cursorWrapper3.Position = 0
	map2.Put("TipoDoc", map.GetDefault("TipoDocumento", "TD01"))
	map2.Put("IDPaeseTX", "")
	map2.Put("CodTX", "")
	map2.Put("DataDoc", substring)
	Dim setdateandtime As Long = DateUtils.setdateandtime(2017, 1, 1, 0, 0, 0)
	Dim now As Long = DateTime.Now
	Dim d As Double = now - setdateandtime
	Dim vTmp As String = modfunstr.Sub003("000000" & Sub040(d / 1000, 36), 6)
	Dim j As Long = 1
	If IsNumber(Main.v_nnegozio) Then
		j = Main.v_nnegozio
	End If
	Dim j2 As Long = 1
	If IsNumber(Main.v_numcassa) Then
		j2 = Main.v_numcassa
	End If
	Dim vTmp_ As String = modfunstr.Sub003("00" & Sub040(j, 36), 2)
	map2.Put("ProgInvio", vTmp_ & modfunstr.Sub003("00" & Sub040(j2, 36), 2) & vTmp)
	map2.Put("NumeroDoc", i)
	Dim d2 As Double = 0
	If IsNumber(map.GetDefault("ImportoBollo", "")) Then
		d2 = map.Get("ImportoBollo")
	End If
	map2.Put("BolloVirtuale", d2 > 0)
	map2.Put("ImportoBollo", d2)
	map2.Put("CUP", map.GetDefault("CUP", ""))
	map2.Put("CIG", map.GetDefault("CIG", ""))
	map2.Put("IDOrdAcq", map.GetDefault("IDOrdAcq", ""))
	Dim str5 As String = "I"
	If 1 = map.GetDefault("EsigibilitaIVA", "0") Then
		str5 = "D"
	Else If 2 = map.GetDefault("EsigibilitaIVA", "0") Then
		str5 = "S"
	End If
	map2.Put("EsigibilitaIVA", str5)
	map2.Put("Database", 1)
	Dim trim As String = cursorWrapper.GetString("piva").Trim
	If trim.StartsWith("_") And trim.Length > 2 Then
		trim = trim.SubString(1)
	End If
	If trim.ToLowerCase.StartsWith("it") Or myispi_it(trim, True) Then
		map2.Put("IDPaeseCli", "IT")
	Else
		map2.Put("IDPaeseCli", trim.SubString2(0, 2))
	End If
	map2.Put("CodCli", trim)
	map2.Put("CFCli", cursorWrapper.GetString("codf"))
	map2.Put("DenominazioneCli", cursorWrapper.GetString("descrizione"))
	map2.Put("NomeCli", cursorWrapper3.GetString("NomeCli"))
	map2.Put("CognomeCli", cursorWrapper3.GetString("CognomeCli"))
	map2.Put("IndirizzoCli", cursorWrapper.GetString("via"))
	map2.Put("CAPCli", cursorWrapper.GetString("cap"))
	map2.Put("ComuneCli", cursorWrapper.GetString("citta"))
	map2.Put("ProvinciaCli", cursorWrapper.GetString("provincia"))
	map2.Put("NazioneCli", cursorWrapper3.GetString("NazioneCli"))
	map2.Put("Sezionale", str4)
	map2.Put("NomeFile", "")
	cursorWrapper3.Close
	If Main.vSql2.ExecQuerySingleResult("Select count(*) from FEDatiMov where Chiave ='" & sb2 & "'") = 0 Then
		map2.Put("Chiave", sb2)
		list.Add(map2)
		Log("Ins")
		dbutil.Sub007(Main.vSql2, "FEDatiMov", list)
	Else
		Log("Upd")
		Dim map3 As Map
		map3.Initialize
		map3.Put("Chiave", sb2)
		dbutil.Sub012(Main.vSql2, "FEDatiMov", map2, map3)
	End If
	map2.Put("Memo", map.GetDefault("Memo", ""))
	If z2 Then
		Return Sub068(Main.vSql2, str3, z, map2, substring, z2, activityWrapper)
	End If
	Return Sub068(Main.vSql1, str3, z, map2, substring, z2, activityWrapper)
End Sub

Sub Sub003(str As String)
	If Main.vSql1.ExecQuerySingleResult("select count(*) from FEdatiCli where Codice ='" & str & "'") = 0 Then
		Dim list As List
		list.Initialize
		Dim map As Map
		map.Initialize
		map.Put("codice", str)
		map.Put("TipoSoggettoCli", 2)
		map.Put("NazioneCli", "IT")
		map.Put("NomeCli", "")
		map.Put("CognomeCli", "")
		map.Put("CodiceDestinatario", "0000000")
		map.Put("PEC", "")
		map.Put("EsigibilitaIVA", 0)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "FEdatiCli", list)
		Return
	End If
End Sub

Sub Sub004(sMTPWrapper As SMTP, str As String, z As Boolean)
	Dim vSplit() As String = Regex.Split(";", str)
	Dim length As Int = vSplit.Length - 1
	Dim i As Int
	For i = 0 To length
		If z Then
			sMTPWrapper.BCC.Add(vSplit(i))
		Else
			sMTPWrapper.To.Add(vSplit(i))
		End If
	Next
End Sub

Sub Sub005(j As Long) As String
	If Main.v_turni Then
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from venduto where nmov = " & j & " and turno >1") > 0 Then
			Return "1"
		End If
	End If
	Return "0"
End Sub

Sub Sub006 As String
	If Not(Main.vBln25) Then
		Return Sub058()
	End If
	Return Main.v_numcassa & Sub058()
End Sub

Sub Sub007(stringBuilderWrapper As StringBuilder, map As Map)
	stringBuilderWrapper.Append("pag" & TAB)
	stringBuilderWrapper.Append(map.Get("nmov") & TAB)
	stringBuilderWrapper.Append(map.Get("codice") & TAB)
	stringBuilderWrapper.Append(map.Get("descrizione") & TAB)
	vStr8 = map.Get("qta")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	vStr8 = map.Get("importo")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & CRLF)
End Sub

Sub Sub008(stringBuilderWrapper As StringBuilder, map As Map)
	Try
		stringBuilderWrapper.Append("cancellazione" & TAB)
		stringBuilderWrapper.Append(map.Get("nmov") & TAB)
		stringBuilderWrapper.Append(map.Get("codint") & TAB)
		stringBuilderWrapper.Append(map.Get("datam") & TAB)
		stringBuilderWrapper.Append(map.Get("operatore") & TAB)
		stringBuilderWrapper.Append(map.Get("qta") & TAB)
		stringBuilderWrapper.Append(map.Get("brep") & TAB)
		stringBuilderWrapper.Append(map.Get("importo") & TAB)
		stringBuilderWrapper.Append(map.Get("tavolo") & TAB)
		stringBuilderWrapper.Append(map.Get("cassa") & CRLF)
		Return
	Catch
		Log("AddRowEliminati: " & LastException.Message)
		Sub217("AddRowEliminati: " & LastException.Message)
		Return
	End Try
End Sub

Sub Sub009(stringBuilderWrapper As StringBuilder, map As Map)
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice = 'SEND'")
	stringBuilderWrapper.Append("ve" & TAB)
	stringBuilderWrapper.Append(Main.v_recordver & TAB & "R" & CRLF)
	stringBuilderWrapper.Append("nu" & TAB)
	stringBuilderWrapper.Append(parseDouble & CRLF)
	stringBuilderWrapper.Append("head" & TAB)
	stringBuilderWrapper.Append(map.Get("nmov") & TAB)
	If map.Get("nfat") > 0 Then
		stringBuilderWrapper.Append("F_" & map.Get("nfat") & TAB)
	Else If map.Get("nric") > 0 Then
		stringBuilderWrapper.Append("R_" & map.Get("nric") & TAB)
	Else
		stringBuilderWrapper.Append("0" & TAB)
	End If
	stringBuilderWrapper.Append(map.Get("cliente") & TAB)
	stringBuilderWrapper.Append(map.Get("clides") & TAB)
	stringBuilderWrapper.Append(map.Get("flgNF") & TAB)
	vStr8 = map.Get("totale")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	vStr8 = map.Get("prep")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	vStr8 = map.Get("punti")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	stringBuilderWrapper.Append(map.Get("datam") & " " & DateTime.Time(Sub058()) & TAB)
	stringBuilderWrapper.Append(map.Get("memo") & TAB)
	stringBuilderWrapper.Append(map.Get("operatore") & TAB)
	stringBuilderWrapper.Append(map.Get("opdes") & TAB)
	stringBuilderWrapper.Append(map.Get("dataeoraffm") & TAB)
	stringBuilderWrapper.Append(map.Get("nscontrinoffm") & TAB)
	stringBuilderWrapper.Append(map.Get("matricolacassap") & TAB)
	stringBuilderWrapper.Append(Main.v_nnegozio & TAB)
	stringBuilderWrapper.Append(map.Get("cassa") & TAB)
	stringBuilderWrapper.Append(DateTime.Date(Sub058()) & "_" & map.Get("nmov") & "_" & Main.v_numcassa & "_" & Main.v_nnegozio & TAB)
	stringBuilderWrapper.Append(Main.vStr6 & TAB)
	stringBuilderWrapper.Append(map.Get("datam3") & TAB)
	stringBuilderWrapper.Append(map.Get("nscontrinoffm") & "-" & map.Get("nChiusura") & TAB)
	stringBuilderWrapper.Append(map.Get("codLotteria") & CRLF)
	Main.vSql1.ExecNonQuery("update progressivi set valore = " & parseDouble + 1 & " where codice = 'SEND'")
End Sub

Sub Sub010(strArr As String(), str As String)
	Dim parseDouble As Double = strArr(strArr.Length - 1)
	Dim str2 As String = strArr(strArr.Length - 2)
	Dim str3 As String = strArr(strArr.Length - 3)
	Dim str4 As String = str3.SubString2(6, 10) & "-" & str3.SubString2(3, 5) & "-" & str3.SubString2(0, 2) & " 00:00:00"
	Dim str5 As String = str2.SubString2(6, 10) & "-" & str2.SubString2(3, 5) & "-" & str2.SubString2(0, 2) & " 23:59:00"
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from offerteUniandro where codint = '" & strArr(1) & "'") > 0 Then
		Main.vSql1.ExecNonQuery("delete from offerteUniandro where codint = '" & strArr(1) & "'")
	End If
	Dim list As List
	list.Initialize
	list.Clear
	Dim map As Map
	map.Initialize
	map.Put("codint", strArr(1))
	map.Put("campi", str)
	map.Put("dadata", str4)
	map.Put("adata", str5)
	map.Put("list1", parseDouble)
	list.Add(map)
	dbutil.Sub011(Main.vSql1, "offerteUniandro", list)
End Sub

Sub Sub011(stringBuilderWrapper As StringBuilder, map As Map)
	stringBuilderWrapper.Append("vend" & TAB)
	stringBuilderWrapper.Append(map.Get("codice") & TAB)
	stringBuilderWrapper.Append(map.Get("descrizione") & TAB)
	stringBuilderWrapper.Append(map.Get("brep") & TAB)
	vStr8 = map.Get("qta")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	vStr8 = map.Get("prezzov")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	stringBuilderWrapper.Append(map.Get("reparto") & TAB)
	stringBuilderWrapper.Append(map.Get("aliquota2") & TAB)
	stringBuilderWrapper.Append(map.Get("iva") & TAB)
	vStr8 = map.Get("importo")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	stringBuilderWrapper.Append(map.Get("codint") & TAB)
	vStr8 = map.Get("scop")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	vStr8 = map.Get("scov")
	stringBuilderWrapper.Append(vStr8.Replace(",", ".") & TAB)
	stringBuilderWrapper.Append(map.Get("flgNF") & TAB)
	stringBuilderWrapper.Append(map.Get("nmov") & TAB)
	stringBuilderWrapper.Append(map.Get("TipoSconto") & CRLF)
End Sub

Sub Sub012(str As String, str2 As String, str3 As String, i As Int, j As Long, str4 As String)
	Dim list As List
	list.Initialize
	Dim map As Map
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from " & str2 & " " & str3.Replace(" and ", " where ") & " and tavolo = " & i)
	If cursorWrapper2.RowCount > 0 Then
		Main.vSql1.ExecNonQuery("insert into HeaddaStampare(codstampa,id,nmov) values(" & str4 & ",'" & str & "'," & j & ")")
		Dim z As Boolean = False
		list.Clear
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i2 As Int = 0
		Dim i3 As Int = 0
		Do While i3 <= rowCount
			cursorWrapper2.Position = i3
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from daStampare  where id = '" & str & "' and idRiga ='" & cursorWrapper2.GetString("idRiga") & "'") = 0 Then
				map.Initialize
				If i2 = 0 Then
					i2 = Main.vSql1.ExecQuerySingleResult("select operatore from headmov where nmov = " & j)
				End If
				map.Put("codice", cursorWrapper2.GetString("codice"))
				map.Put("descrizione", cursorWrapper2.GetString("descrizione"))
				map.Put("qta", cursorWrapper2.GetDouble("qta"))
				map.Put("tavolo", i)
				map.Put("totcre", cursorWrapper2.GetString("totcre"))
				map.Put("codint", cursorWrapper2.GetString("codint"))
				map.Put("idRiga", cursorWrapper2.GetString("idRiga"))
				map.Put("reparto", cursorWrapper2.GetInt("reparto"))
				map.Put("matricola", Main.v_numcassa)
				map.Put("id", str)
				If Main.v_turni Then
					map.Put("turno", cursorWrapper2.GetInt("turno"))
				End If
				map.Put("operatore", i2)
				map.Put("ingredientisunf", cursorWrapper2.GetInt("ingredientisunf"))
				list.Add(map)
				z = True
			End If
			i3 = i3 + 1
			i2 = i2
			z = z
		Loop
		If z Then
			dbutil.Sub007(Main.vSql1, "daStampare", list)
		End If
	End If
	cursorWrapper2.Close
End Sub

Sub Sub013(str As String, z As Boolean)
	vStr2 = "Sub GestisciTelefonata(NTel As String,bDaTelefonata As Boolean)"
	Try
		Dim str2 As String = ""
		Dim str3 As String = ""
		Dim str4 As String = ""
		If str <> "Numero Nascosto" Then
			If Main.vSql1.ExecQuerySingleResult("select count(*) from clienti where telefono ='" & str & "' or fax ='" & str & "'") > 0 Then
				str2 = Main.vSql1.ExecQuerySingleResult("select codice from clienti where telefono ='" & str & "' or fax ='" & str & "' limit 1")
				If z Then
					If Main.vSql1.ExecQuerySingleResult("select count(*) from clienti where telefono ='" & str & "' and fax ='_w_' and attivo=0") > 0 Then
						Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select descrizione from clienti where codice ='" & str2 & "'")
						Main.vSql1.ExecNonQuery("insert into telefonate(data,telefono,cliente,descliente) values('" & Sub057(DateTime.Date(Sub058()) & " " & DateTime.Time(Sub058())) & "','" & str & "','" & str2 & "','" & vExecQuerySingleResult & "')")
						Main.vSql1.ExecNonQuery("update clienti set attivo=1,fax='' where codice ='" & str2 & "'")
						CallSub3(rpidevice, "SendCMD", str2, "AttivaCli")
						Return
					End If
				End If
			End If
		End If
		Dim str5 As String = str2
		If str5 <> "" Then
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select descrizione,via,citta from clienti where codice ='" & str5 & "'")
			If cursorWrapper2.RowCount > 0 Then
				cursorWrapper2.Position = 0
				str3 = cursorWrapper2.GetString("descrizione")
				If cursorWrapper2.GetString("via") <> "" Then
					str4 = cursorWrapper2.GetString("via")
				End If
				If cursorWrapper2.GetString("citta") <> "" Then
					str4 = str4 & " " & cursorWrapper2.GetString("citta")
				End If
				If str4 <> "" Then
					Dim str6 As String = " (" & str4 & ")."
				End If
			End If
			cursorWrapper2.Close
		End If
		If z Then
			Main.vSql1.ExecNonQuery("insert into telefonate(data,telefono,cliente,descliente) values('" & Sub057(DateTime.Date(Sub058()) & " " & DateTime.Time(Sub058())) & "','" & str & "','" & str5 & "','" & str3 & "')")
		End If
	Catch
		Sub217(LastException.Message)
	End Try
End Sub

Sub Sub014(i As Int)
	If Main.vSql2.ExecQuerySingleResult("select count(*) from unlocktbl where tavolo = " & i) = 0 Then
		Main.vSql2.ExecNonQuery("insert into unlocktbl(tavolo) values(" & i & ")")
		Return
	End If
End Sub

Sub Sub015(str As String)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select flgmag,qta,brep,codint from venduto where nmov=" & SmartStringFormatter("", str) & "")
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			If cursorWrapper2.GetInt("brep") = 0 And cursorWrapper2.GetInt("flgmag") = 1 Then
				Main.vSql1.ExecNonQuery("update anagra set giac=round(giac - " & SmartStringFormatter("", cursorWrapper2.GetDouble("qta")) & ",3) where  codint ='" & SmartStringFormatter("", cursorWrapper2.GetString("codint")) & "'")
			End If
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where distinta = 1 and codint ='" & cursorWrapper2.GetString("codint") & "'") > 0 Then
				Dim cursorWrapper3 As Cursor
				Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from distintabase where codint = '" & cursorWrapper2.GetString("codint") & "'")
				If cursorWrapper4.RowCount > 0 Then
					Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
					Dim i2 As Int
					For i2 = 0 To rowCount2
						cursorWrapper4.Position = i2
						Dim replace As String = NumberFormat2(cursorWrapper4.GetDouble("qta") * cursorWrapper2.GetDouble("qta"), 1, 3, 3, False).Replace(",", ".")
						Main.vSql1.ExecNonQuery("update anagra set  giac=round(giac - " & replace & " ,3) where  codint ='" & cursorWrapper4.GetString("codintpadre") & "'")
					Next
				End If
				cursorWrapper4.Close
			End If
		Next
	End If
	cursorWrapper2.Close
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m2… (riga 694).
Sub Sub016(cursorWrapper As Cursor, str As String, i As Int) As Boolean
	Dim str2 As String
	Dim str3 As String
	Dim str4 As String
	Dim obj As Object
	Dim z As Boolean
	Dim cursorWrapper2 As Cursor
	Dim d As Double
	Dim z2 As Boolean
	Dim parseDouble As Double
	Dim vGetInt As Int
	Dim d2 As Double
	Dim vGetInt2 As Int
	Dim z3 As Boolean
	Dim str5 As String
	Dim d3 As Double
	Dim vGetInt3 As Int
	Dim z4 As Boolean
	Dim d4 As Double
	Dim vGetInt4 As Int
	Dim z5 As Boolean
	Dim str6 As String
	Dim d5 As Double
	Dim i2 As Int
	Dim vGetInt5 As Int
	Dim z6 As Boolean
	Dim cursorWrapper3 As Cursor
	Dim z7 As Boolean
	Dim z8 As Boolean
	Dim i3 As Int
	Dim i4 As Int
	Dim z9 As Boolean
	Dim i5 As Int
	Dim i6 As Int
	Dim i7 As Int
	Dim cursorWrapper4 As Cursor
	Dim vGetInt6 As Int
	Dim z10 As Boolean = False
	Dim i8 As Int = 0
	Dim i9 As Int = 0
	Dim i10 As Int = 0
	Try
		Dim list As List
		Dim cursorWrapper5 As Cursor
		Dim cursorWrapper6 As Cursor = Main.vSql1.ExecQuery("Select * from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", cursorWrapper.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", cursorWrapper.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", cursorWrapper.GetString("Priorita")) & " order by InizioLR")
		Dim cursorWrapper7 As Cursor
		If Not(Main.vBln12) Then
			str2 = "importo"
			str3 = "scov"
			str4 = "qta"
			obj = "Select chiave,qta,scov from Ventmp where "
		Else
			str2 = "importod"
			str3 = "scovd"
			str4 = "Qtad"
			obj = "Select chiave,Qtad as qta,scovd as scov from Ventmp where Qtad >0 and "
		End If
		If (cursorWrapper.GetString("VeriabileRicompensa") = "ART" Or cursorWrapper.GetString("VeriabileRicompensa") = "REP" Or cursorWrapper.GetString("VeriabileRicompensa") = "GRP") And (cursorWrapper.GetString("TipoRicompensa") = "SV" Or cursorWrapper.GetString("TipoRicompensa") = "EV" Or cursorWrapper.GetString("TipoRicompensa") = "BV" Or cursorWrapper.GetString("TipoRicompensa") = "RV" Or cursorWrapper.GetString("TipoRicompensa") = "CV" Or cursorWrapper.GetString("TipoRicompensa") = "uV" Or cursorWrapper.GetString("TipoRicompensa") = "MO" Or cursorWrapper.GetString("TipoRicompensa") = "MS") Then
			z = True
		Else If cursorWrapper.GetString("VeriabileRicompensa") = "ART" Or cursorWrapper.GetString("VeriabileRicompensa") = "REP" Or cursorWrapper.GetString("VeriabileRicompensa") = "GRP" Then
			Dim cursorWrapper8 As Cursor
			z = False
			cursorWrapper7 = Main.vSql1.ExecQuery("" & SmartStringFormatter("", obj) & " " & SmartStringFormatter("", str) & " order by chiave asc")
		Else If cursorWrapper.GetString("VeriabileRicompensa") <> "SCO" Or (cursorWrapper.GetString("TipoRicompensa") <> "SQ" And cursorWrapper.GetString("TipoRicompensa") <> "BQ") Then
			z = True
		Else
			str = " flgusointerno=0  and noscontoF=0  and flgNF=0 "
			Dim cursorWrapper9 As Cursor
			z = False
			cursorWrapper7 = Main.vSql1.ExecQuery("" & SmartStringFormatter("", obj) & " " & SmartStringFormatter("", " flgusointerno=0  and noscontoF=0  and flgNF=0 ") & " order by chiave asc")
		End If
		list.Initialize
		Dim i11 As Int = 0
		Dim z11 As Boolean = False
		Dim z12 As Boolean = False
		Dim i12 As Int = 0
		Dim d6 As Double = 0
		Dim equals As Boolean = cursorWrapper.GetString("SogliaRicompensa") = "1"
		If equals Then
			Dim parseDouble2 As Int = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Ventmp where " & SmartStringFormatter("", str) & "")
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPLimitiRicompense where" & TAB & "Codice ='" & SmartStringFormatter("", cursorWrapper.GetString("Codice")) & "' and CodiceCondizione='" & SmartStringFormatter("", cursorWrapper.GetString("CodiceCondizione")) & "' and" & TAB & "Priorita=" & SmartStringFormatter("", cursorWrapper.GetString("Priorita")) & " and FineLR >" & SmartStringFormatter("", parseDouble2) & " and InizioLR <=" & SmartStringFormatter("", parseDouble2) & "") = 0 Then
				If cursorWrapper7.IsInitialized Then
					cursorWrapper7.Close
				End If
				If cursorWrapper6.IsInitialized Then
					cursorWrapper6.Close
				End If
				Return False
			End If
			Dim parseDouble3 As Long = Main.vSql1.ExecQuerySingleResult("Select min(FineLR) from MPLimitiRicompense where" & TAB & "Codice ='" & SmartStringFormatter("", cursorWrapper.GetString("Codice")) & "' and" & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", cursorWrapper.GetString("CodiceCondizione")) & "' and" & TAB & "Priorita=" & SmartStringFormatter("", cursorWrapper.GetString("Priorita")) & " and FineLR >" & SmartStringFormatter("", parseDouble2) & "")
			Dim cursorWrapper10 As Cursor
			cursorWrapper2 = Main.vSql1.ExecQuery("Select * from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", cursorWrapper.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", cursorWrapper.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", cursorWrapper.GetString("Priorita")) & " and FineLR=" & SmartStringFormatter("", parseDouble3) & "")
		Else
			cursorWrapper2 = cursorWrapper6
		End If
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i13 As Int = 0
		Do While i13 <= rowCount
			cursorWrapper2.Position = i13
			Dim vGetInt7 As Int = cursorWrapper2.GetInt("InizioLR")
			If cursorWrapper7.IsInitialized And Not(z) Then
				If equals Then
					i11 = 0
					i10 = 0
					list.Clear
				End If
				Dim z13 As Boolean = z12
				Dim i14 As Int = 0
				Dim cursorWrapper11 As Cursor = cursorWrapper7
				Dim i15 As Int = i9
				Dim i16 As Int = vGetInt7
				Dim z14 As Boolean = z10
				Dim i17 As Int = i11
				Dim i18 As Int = i10
				Dim i19 As Int = i8
				Dim i20 As Int = i12
				Dim z16 As Boolean = z11
				Do While True
					If i17 <= cursorWrapper11.RowCount - 1 Then
						cursorWrapper11.Position = i17
						Dim i21 As Int = IIf(equals, 0, i16)
						If cursorWrapper2.GetInt("FineLR") - i21 <= i14 Then
							i18 = 0
							If Not(equals) Then
								list.Clear
								cursorWrapper7 = cursorWrapper11
								i10 = 0
								i11 = i17
								i12 = i20
								i8 = i19
								z11 = z16
								z2 = z14
								i9 = i15
								z12 = z13
								d = d6
							Else If z13 And list.Size > 0 Then
								list.RemoveAt(list.Size - 1)
								cursorWrapper7 = cursorWrapper11
								i10 = 0
								i11 = i17
								i12 = i20
								i8 = i19
								z11 = z16
								z2 = z14
								i9 = i15
								z12 = z13
								d = d6
							End If
						Else
							z13 = False
							If i <= 0 Or cursorWrapper11.GetInt("qta") + i15 <= i Then
								i2 = 0
								vGetInt5 = cursorWrapper11.GetInt("qta")
							Else
								Dim i22 As Int = i - i15
								Dim vGetInt8 As Int = cursorWrapper11.GetInt("qta") + i15 - i
								If i22 = 0 Then
									i17 = i17 + 1
									i16 = i21
								Else
									i2 = vGetInt8
									vGetInt5 = i22
								End If
							End If
							Dim i23 As Int = i19 + vGetInt5
							Dim i24 As Int = i15 + vGetInt5
							Dim i25 As Int = i14 + vGetInt5
							If Not(z16) And i21 > 0 And i21 - i20 < i25 And vGetInt5 > 1 Then
								Dim i26 As Int = i25 - i21 + i20
								Sub066(cursorWrapper11.GetString("chiave"), i26 + i2, "")
								If vGetInt5 - i26 > 0 Then
									Main.vSql1.ExecNonQuery("update Ventmp set noscontoF=1," & str4 & " = " & vGetInt5 - i26 & " ," & str2 & " = round(prezzov * " & vGetInt5 - i26 & "+0.000000001,2) - " & str3 & " where  chiave =" & cursorWrapper11.GetString("chiave"))
								Else
									Main.vSql1.ExecNonQuery("update Ventmp set " & str3 & " = " & cursorWrapper11.GetString("scov") & " where  chiave =(select max(chiave) from Ventmp)")
									Main.vSql1.ExecNonQuery("delete from Ventmp  where  chiave =" & cursorWrapper11.GetString("chiave"))
								End If
								Main.vSql1.ExecNonQuery("update Ventmp set " & str2 & " = round(prezzov * " & str4 & "+0.000000001,2) - " & str3 & " where  chiave =(select max(chiave) from Ventmp)")
								i15 = i24 - i26
								z16 = True
								Dim cursorWrapper12 As Cursor
								cursorWrapper11 = Main.vSql1.ExecQuery("" & SmartStringFormatter("", obj) & " " & SmartStringFormatter("", str) & " order by chiave asc")
								cursorWrapper11.Position = i17
								i14 = 0
								i19 = i23
								i16 = i21
							Else If Not(z16) And i21 > 0 And i21 >= i23 Then
								i20 = i20 + vGetInt5
								Main.vSql1.ExecNonQuery("update Ventmp set noscontoF=1 where  chiave =" & cursorWrapper11.GetString("chiave"))
								Dim cursorWrapper13 As Cursor
								cursorWrapper11 = Main.vSql1.ExecQuery("" & SmartStringFormatter("", obj) & " " & SmartStringFormatter("", str) & " order by chiave asc")
								cursorWrapper11.Position = i17
								i14 = 0
								i15 = i24
								i19 = i23
								i16 = i21
							Else
								If i21 > i23 Then
									z6 = z14
									cursorWrapper3 = cursorWrapper11
									z7 = False
									z8 = z16
									i3 = i18
									i4 = i24
								Else
									z16 = True
									If cursorWrapper2.GetInt("FineLR") - i21 >= i25 Then
										z9 = False
										i5 = i23
										i6 = i24
										i7 = i25
										cursorWrapper4 = cursorWrapper11
									Else
										Dim vGetInt9 As Int = i25 - (cursorWrapper2.GetInt("FineLR") - i21)
										Sub066(cursorWrapper11.GetString("chiave"), vGetInt9 + i2, "")
										Main.vSql1.ExecNonQuery("update Ventmp set " & str4 & " = " & vGetInt5 - vGetInt9 & " ," & str2 & " = round(prezzov * " & vGetInt5 - vGetInt9 & "+0.000000001,2) - " & str3 & " where  chiave =" & cursorWrapper11.GetString("chiave"))
										Main.vSql1.ExecNonQuery("update Ventmp set " & str2 & " = round(prezzov * " & str4 & "+0.000000001,2) - " & str3 & " where  chiave =(select max(chiave) from Ventmp)")
										Dim i27 As Int = i23 - vGetInt9
										i6 = i24 - vGetInt9
										i7 = i25 - vGetInt9
										Dim cursorWrapper14 As Cursor
										Dim cursorWrapper15 As Cursor = Main.vSql1.ExecQuery("" & SmartStringFormatter("", obj) & " " & SmartStringFormatter("", str) & " order by chiave asc")
										cursorWrapper15.Position = i17
										cursorWrapper4 = cursorWrapper15
										i5 = i27
										z9 = True
									End If
									Dim i28 As Int = i18 + vGetInt5
									If (i17 = 0 And i2 > 0) Or (cursorWrapper2.GetInt("PassoLR") > 1 And i28 > cursorWrapper2.GetInt("PassoLR") And i28 Mod cursorWrapper2.GetInt("PassoLR") <> 0) Then
										Dim vGetInt10 As Int = i28 Mod cursorWrapper2.GetInt("PassoLR")
										Sub066(cursorWrapper4.GetString("chiave"), i2 + vGetInt10, IIf(z9, " , noscontoF=1 ", ""))
										Main.vSql1.ExecNonQuery("update Ventmp set " & str4 & " = " & vGetInt5 - vGetInt10 & " ," & str2 & " = round(prezzov * " & vGetInt5 - vGetInt10 & "+0.000000001,2) - " & str3 & " where  chiave =" & cursorWrapper4.GetString("chiave"))
										Main.vSql1.ExecNonQuery("update Ventmp set " & str2 & " = round(prezzov * " & str4 & "+0.000000001,2) - " & str3 & " where  chiave =(select max(chiave) from Ventmp)")
										i7 = i7 - vGetInt10
										If z9 Then
											i7 = cursorWrapper2.GetInt("FineLR") - i21
										End If
										Dim cursorWrapper16 As Cursor
										Dim cursorWrapper17 As Cursor = Main.vSql1.ExecQuery("" & SmartStringFormatter("", obj) & " " & SmartStringFormatter("", str) & " order by chiave asc")
										cursorWrapper17.Position = i17
										cursorWrapper4 = cursorWrapper17
									End If
									i18 = i18 + vGetInt5
									list.Add(cursorWrapper4.GetString("chiave"))
									If i18 >= cursorWrapper2.GetInt("PassoLR") Then
										z14 = True
										Select cursorWrapper.GetString("TipoRicompensa")
											Case "AQ"
												If cursorWrapper.GetString("VeriabileRicompensa") = "REP" Or cursorWrapper.GetString("VeriabileRicompensa") = "GRP" Then
													i17 = i17 + 1
													cursorWrapper11 = cursorWrapper4
													i14 = i7
													i15 = i6
													i19 = i5
													i16 = i21
												Else
													Dim vGetInt11 As Int = cursorWrapper2.GetInt("ValoreLR") * (i18 / cursorWrapper2.GetInt("PassoLR"))
													Dim size As Int = list.Size - 1
													Dim i29 As Int = vGetInt11
													Dim i30 As Int = 0
													Do While True
														If i30 <= size Then
															Dim parseDouble4 As Int = Main.vSql1.ExecQuerySingleResult("select " & str4 & " from Ventmp where chiave =" & list.Get(i30))
															Dim i31 As Int = 100
															If IsNumber(cursorWrapper2.GetString("SegnoLR")) And cursorWrapper2.GetInt("SegnoLR") >= 0 And cursorWrapper2.GetInt("SegnoLR") <= 100 Then
																i31 = cursorWrapper2.GetInt("SegnoLR")
															End If
															If parseDouble4 <= i29 Then
																Dim vRound2 As Double = Round2(Main.vSql1.ExecQuerySingleResult("Select (prezzov * " & str4 & " ) as tt from Ventmp  where chiave =" & list.Get(i30)), 2)
																Dim vRound22 As Double = Round2(vRound2 - (1 - i31 / 100) * vRound2, Main.v_arrotondav)
																Main.vSql1.ExecNonQuery("update Ventmp set scop= " & i31 & " , " & str3 & "= " & vRound22 & " where " & str4 & " >0 and  flgNF =0 and flgusointerno =0 and chiave =" & list.Get(i30))
																Main.vSql1.ExecNonQuery("update Ventmp set " & str2 & " = round(prezzov * " & str4 & "+0.000000001 ,2) - " & str3 & " where chiave =" & list.Get(i30))
																i29 = i29 - parseDouble4
																If i29 > 0 Then
																	i30 = i30 + 1
																End If
															Else
																Sub066(list.Get(i30), i29, " , noscontoF=1 ")
																Main.vSql1.ExecNonQuery("update Ventmp set " & str4 & " = " & parseDouble4 - i29 & " ," & str2 & " = round(prezzov * " & parseDouble4 - i29 & "+0.000000001,2) - scov where  chiave =" & list.Get(i30))
																Dim parseDouble5 As Int = Main.vSql1.ExecQuerySingleResult("Select max(chiave) from Ventmp")
																Dim vRound23 As Double = Round2(Main.vSql1.ExecQuerySingleResult("Select (prezzov * " & str4 & " ) as tt from Ventmp  where chiave =" & parseDouble5), 2)
																Dim vRound24 As Double = Round2(vRound23 - (1 - i31 / 100) * vRound23, Main.v_arrotondav)
																Main.vSql1.ExecNonQuery("update Ventmp set " & str2 & " = round(prezzov * " & str4 & "+0.000000001,2) - " & str3 & " where  chiave =" & parseDouble5)
																Main.vSql1.ExecNonQuery("update Ventmp set scop= " & i31 & " , " & str3 & " " & vRound24 & " where " & str4 & " >0 and  flgNF =0 and flgusointerno =0 and chiave =" & parseDouble5)
																Main.vSql1.ExecNonQuery("update Ventmp set " & str2 & " = round(prezzov * " & str4 & "+0.000000001 ,2) - " & str3 & " where chiave =" & parseDouble5)
															End If
														End If
													Loop
													If Not(equals) Then
														i4 = i6
														i23 = i5
														z6 = True
														i3 = 0
														z7 = False
														z8 = True
														cursorWrapper3 = cursorWrapper4
														i25 = i7
													Else
														list.Clear
														i4 = i6
														i23 = i5
														z6 = True
														i3 = 0
														z7 = False
														z8 = True
														cursorWrapper3 = cursorWrapper4
														i25 = i7
													End If
												End If
											Case "LQ"
												If cursorWrapper.GetString("VeriabileRicompensa") = "REP" Or cursorWrapper.GetString("VeriabileRicompensa") = "GRP" Then
													i17 = i17 + 1
													cursorWrapper11 = cursorWrapper4
													i14 = i7
													i15 = i6
													i19 = i5
													i16 = i21
												Else
													Dim vGetString As String = cursorWrapper2.GetString("ValoreLR")
													Dim size2 As Int = list.Size - 1
													Dim i34 As Int
													For i34 = 0 To size2
														Main.vSql1.ExecNonQuery("update Ventmp set prezzov= " & vGetString & " ," & str2 & " = round(" & vGetString & " * " & str4 & "+0.000000001 ,2) -" & str3 & " where chiave =" & list.Get(i34))
													Next
													If Not(equals) Then
													End If
												End If
											Case "SQ"
												Dim vGetInt12 As Int = cursorWrapper2.GetInt("ValoreLR")
												Dim size3 As Int = list.Size - 1
												Dim i35 As Int
												For i35 = 0 To size3
													If vGetInt12 >= 0 And vGetInt12 <= 100 Then
														Dim vRound25 As Double = Round2(Main.vSql1.ExecQuerySingleResult("Select (prezzov * " & str4 & " ) as tt from Ventmp  where chiave =" & list.Get(i35)), 2)
														Dim vRound26 As Double = Round2(vRound25 - (1 - vGetInt12 / 100) * vRound25, Main.v_arrotondav)
														Main.vSql1.ExecNonQuery("update Ventmp set scop= " & vGetInt12 & " , " & str3 & "= " & vRound26 & " where " & str4 & " >0 and  flgNF =0 and flgusointerno =0 and chiave =" & list.Get(i35))
														Main.vSql1.ExecNonQuery("update Ventmp set " & str2 & " = round(prezzov * " & str4 & "+0.000000001 ,2) - " & str3 & " where chiave =" & list.Get(i35))
													End If
												Next
												If Not(equals) Then
												End If
											Case "BQ"
												Dim vGetInt13 As Int = cursorWrapper2.GetInt("ValoreLR") * (i18 / cursorWrapper2.GetInt("PassoLR"))
												If list.Size > 0 And vGetInt13 >= 0 Then
													Dim vRound27 As Double = Round2(vGetInt13 * 100 / Round2(Main.vSql1.ExecQuerySingleResult("Select (prezzov * " & str4 & " ) as tt from Ventmp  where chiave =" & list.Get(0)), 2), 2)
													Main.vSql1.ExecNonQuery("update Ventmp set scop= " & vRound27 & " , " & str3 & "= " & vGetInt13 & " where " & str4 & " >0 and  flgNF =0 and flgusointerno =0 and chiave =" & list.Get(0))
													Main.vSql1.ExecNonQuery("update Ventmp set " & str2 & " = round(prezzov * " & str4 & "+0.000000001 ,2) - " & str3 & " where chiave =" & list.Get(0))
												End If
												If Not(equals) Then
												End If
											Case "eQ"
												Dim vGetInt14 As Int = cursorWrapper2.GetInt("ValoreLR")
												If CallSub2(Main, "PrerequisitoAccumulatoreMP", "PUNTI") Then
													Dim size4 As Int = list.Size - 1
													Dim i36 As Int
													For i36 = 0 To size4
														If vGetInt14 > 0 Then
															Main.vSql1.ExecNonQuery("update Ventmp set punti=punti " & cursorWrapper2.GetString("SegnoLR") & " (" & vGetInt14 & ") where " & str4 & " >0 and  flgNF =0 and flgusointerno =0 and chiave =" & list.Get(i36))
														End If
													Next
												End If
												If Not(equals) Then
												End If
											Case "RQ"
												Dim vGetInt15 As Int = cursorWrapper2.GetInt("ValoreLR")
												If CallSub2(Main, "PrerequisitoAccumulatoreMP", "PREP") And vGetInt6 = i18 / cursorWrapper2.GetInt("PassoLR") > 0 Then
													Dim i37 As Int = vGetInt6 - 1
													Dim i38 As Int
													For i38 = 0 To i37
														If vGetInt15 > 0 Then
															vInt4 = vInt4 + vGetInt15
														End If
													Next
												End If
												If Not(equals) Then
												End If
											Case "uQ"
												Sub151(cursorWrapper.GetString("CodiceMessaggioCoupon"), i18 / cursorWrapper2.GetInt("PassoLR"))
												If Not(equals) Then
												End If
											Case "CQ"
												Sub152(cursorWrapper.GetString("CodiceMessaggioCoupon"), i18 / cursorWrapper2.GetInt("PassoLR"))
												If Not(equals) Then
												End If
											Case "mq", "MQ"
												Dim str7 As String = cursorWrapper.GetString("TipoRicompensa") & "_" & cursorWrapper.GetString("chiave")
												If Not(vMap5.ContainsKey(str7)) Then
													vMap5.Put(str7, cursorWrapper.GetString("CodiceMessaggioCoupon"))
												End If
												If Not(equals) Then
												End If
											Case Else
												If Not(equals) Then
												End If
										End Select
									Else If Not(equals) Then
										z7 = False
										z8 = True
										cursorWrapper3 = cursorWrapper4
										i25 = i7
										i3 = i18
										i4 = i6
										i23 = i5
										z6 = z14
									Else
										z7 = True
										z8 = True
										cursorWrapper3 = cursorWrapper4
										i25 = i7
										i3 = i18
										i4 = i6
										i23 = i5
										z6 = z14
									End If
								End If
								i17 = i17 + 1
								i14 = i25
								z14 = z6
								i15 = i4
								i18 = i3
								i19 = i23
								i16 = i21
								z13 = z7
								cursorWrapper11 = cursorWrapper3
								z16 = z8
							End If
						End If
					End If
				Loop
				cursorWrapper7 = cursorWrapper11
				i10 = i18
				i11 = i17
				i12 = i20
				i8 = i19
				z11 = z16
				z2 = z14
				i9 = i15
				z12 = z13
				d = d6
			Else
				If z Then
					Select cursorWrapper.GetString("VeriabileRicompensa")
						Case "SCO"
							parseDouble = Main.vDbl1
						Case "ART", "REP", "GRP"
							If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where " & SmartStringFormatter("", str) & "") > 0 Then
								parseDouble = Main.vSql1.ExecQuerySingleResult("Select sum(" & SmartStringFormatter("", str2) & ") from Ventmp where " & SmartStringFormatter("", str) & "")
							End If
						Case Else
							parseDouble = 0
					End Select
					Select cursorWrapper.GetString("TipoRicompensa")
						Case "BV"
							Dim z22 As Boolean = False
							If cursorWrapper2.GetInt("PassoLR") = 0 Then
								If parseDouble > cursorWrapper2.GetInt("FineLR") Then
									d5 = cursorWrapper2.GetInt("FineLR") - vGetInt7
								Else
									d5 = parseDouble - vGetInt7
									z22 = True
								End If
								If d5 >= 0 Then
									d = Round2(d6 + cursorWrapper2.GetDouble("ValoreLR"), 2)
									z5 = z22
								Else
									d = d6
									z5 = z22
								End If
							Else
								If parseDouble > cursorWrapper2.GetInt("FineLR") Then
									vGetInt4 = (cursorWrapper2.GetInt("FineLR") - vGetInt7) / cursorWrapper2.GetInt("PassoLR")
								Else
									vGetInt4 = (parseDouble - vGetInt7) / cursorWrapper2.GetInt("PassoLR")
									z22 = True
								End If
								d = Round2(d6 + vGetInt4 * cursorWrapper2.GetDouble("ValoreLR"), 2)
								z5 = z22
							End If
							If i13 = cursorWrapper2.RowCount - 1 Or z5 Then
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPTitoloIniziative where codice = '" & cursorWrapper.GetString("Codice") & "'") <= 0 Then
									str6 = ""
								Else
									str6 = Main.vSql1.ExecQuerySingleResult("Select descrizione from MPTitoloIniziative where codice = '" & cursorWrapper.GetString("Codice") & "'")
								End If
								CallSub3(Main, "AddAbbuonoFidelity", d, str6)
								Sub071(cursorWrapper7, cursorWrapper2)
								Return True
							End If
							z2 = z10
						Case "uV", "CV", "RV"
							Dim z26 As Boolean = False
							If cursorWrapper2.GetInt("PassoLR") = 0 Then
								If parseDouble > cursorWrapper2.GetInt("FineLR") Then
									d4 = cursorWrapper2.GetInt("FineLR") - vGetInt7
								Else
									d4 = parseDouble - vGetInt7
									z26 = True
								End If
								If d4 >= 0 Then
									d = Round2(d6 + cursorWrapper2.GetDouble("ValoreLR"), 2)
									z4 = z26
								Else
									d = d6
									z4 = z26
								End If
							Else
								If parseDouble > cursorWrapper2.GetInt("FineLR") Then
									vGetInt3 = (cursorWrapper2.GetInt("FineLR") - vGetInt7) / cursorWrapper2.GetInt("PassoLR")
								Else
									vGetInt3 = (parseDouble - vGetInt7) / cursorWrapper2.GetInt("PassoLR")
									z26 = True
								End If
								d = Round2(d6 + vGetInt3 * cursorWrapper2.GetDouble("ValoreLR"), 2)
								z4 = z26
							End If
							If i13 = cursorWrapper2.RowCount - 1 Or z4 Then
								Dim i39 As Int = d
								If cursorWrapper.GetString("TipoRicompensa") = "RV" Then
									If CallSub2(Main, "PrerequisitoAccumulatoreMP", "PREP") Then
										vInt4 = vInt4 + i39
									End If
								Else If cursorWrapper.GetString("TipoRicompensa") = "CV" Then
									Sub152(cursorWrapper.GetString("CodiceMessaggioCoupon"), i39)
								Else
									Sub151(cursorWrapper.GetString("CodiceMessaggioCoupon"), i39)
								End If
								Sub071(cursorWrapper7, cursorWrapper2)
								Return True
							End If
							z2 = z10
						Case "SV"
							Dim z30 As Boolean = False
							Dim doubleValue As Double = cursorWrapper2.GetDouble("ValoreLR")
							If cursorWrapper2.GetInt("PassoLR") = 0 Then
								If parseDouble > cursorWrapper2.GetInt("FineLR") Then
									d3 = cursorWrapper2.GetInt("FineLR") - vGetInt7
								Else
									d3 = parseDouble - vGetInt7
									z30 = True
								End If
								d = Round2(d6 + d3 - d3 * (1 - doubleValue / 100), Main.v_arrotondav)
								z3 = z30
							Else
								If parseDouble > cursorWrapper2.GetInt("FineLR") Then
									vGetInt2 = (cursorWrapper2.GetInt("FineLR") - vGetInt7) / cursorWrapper2.GetInt("PassoLR")
								Else
									vGetInt2 = (parseDouble - vGetInt7) / cursorWrapper2.GetInt("PassoLR")
									z30 = True
								End If
								If cursorWrapper2.GetInt("PassoLR") > 0 Then
									vGetInt2 = vGetInt2 * cursorWrapper2.GetInt("PassoLR")
								End If
								Dim d10 As Double = d6 + vGetInt2 - vGetInt2 * (1 - doubleValue / 100)
								d = Round2(d10, Main.v_arrotondav)
								z3 = z30
							End If
							If i13 = cursorWrapper2.RowCount - 1 Or z3 Then
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPTitoloIniziative where codice = '" & cursorWrapper.GetString("Codice") & "'") <= 0 Then
									str5 = ""
								Else
									str5 = Main.vSql1.ExecQuerySingleResult("Select descrizione from MPTitoloIniziative where codice = '" & cursorWrapper.GetString("Codice") & "'")
								End If
								CallSub3(Main, "AddAbbuonoFidelity", d, str5)
								Sub071(cursorWrapper7, cursorWrapper2)
								Return True
							End If
							z2 = z10
						Case "EV"
							If CallSub2(Main, "PrerequisitoAccumulatoreMP", "PUNTI") Then
								Dim z33 As Boolean = False
								If cursorWrapper2.GetInt("PassoLR") = 0 Then
									If parseDouble > cursorWrapper2.GetInt("FineLR") Then
										d2 = cursorWrapper2.GetInt("FineLR") - vGetInt7
									Else
										d2 = parseDouble - vGetInt7
										z33 = True
									End If
									If d2 >= 0 Then
										Dim vGetInt16 As Int = cursorWrapper2.GetInt("ValoreLR")
										If cursorWrapper2.GetString("SegnoLR").Trim = "-" Then
											vInt5 = vInt5 - vGetInt16
										Else
											vInt5 = vGetInt16 + vInt5
										End If
									End If
								Else
									If parseDouble > cursorWrapper2.GetInt("FineLR") Then
										vGetInt = (cursorWrapper2.GetInt("FineLR") - vGetInt7) / cursorWrapper2.GetInt("PassoLR")
									Else
										vGetInt = (parseDouble - vGetInt7) / cursorWrapper2.GetInt("PassoLR")
										z33 = True
									End If
									Dim vGetInt17 As Int = cursorWrapper2.GetInt("ValoreLR")
									If cursorWrapper2.GetString("SegnoLR").Trim = "-" Then
										vInt5 = vInt5 - vGetInt * vGetInt17
									Else
										vInt5 = vGetInt * vGetInt17 + vInt5
									End If
								End If
								If i13 = cursorWrapper2.RowCount - 1 Or z33 Then
									Sub071(cursorWrapper7, cursorWrapper2)
									Return True
								End If
							End If
						Case "MO", "MS"
							If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", cursorWrapper.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", cursorWrapper.GetString("CodiceCondizione")) & "'") > 0 Then
								If Main.vSql1.ExecQuerySingleResult("Select min(InizioLR) from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", cursorWrapper.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", cursorWrapper.GetString("CodiceCondizione")) & "' and Priorita=" & SmartStringFormatter("", cursorWrapper.GetString("Priorita")) & "") < parseDouble Then
									Dim str8 As String = cursorWrapper.GetString("TipoRicompensa") & "_" & cursorWrapper.GetString("chiave")
									If Not(vMap5.ContainsKey(str8)) Then
										vMap5.Put(str8, cursorWrapper.GetString("CodiceMessaggioCoupon"))
									End If
								End If
							End If
					End Select
				End If
				d = d6
				z2 = z10
			End If
			i13 = i13 + 1
			z10 = z2
			d6 = d
		Loop
		Main.vSql1.ExecNonQuery("update Ventmp set noscontoF=0 where noscontoF=1")
		If cursorWrapper7.IsInitialized Then
			cursorWrapper7.Close
		End If
		If cursorWrapper2.IsInitialized Then
			cursorWrapper2.Close
			Return z10
		End If
		Return z10
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub017
	Initialize
	Dim str As String = vStr4 & "/Spooler"
	Dim vListFiles As List = File.ListFiles(str)
	If vListFiles.Size > 0 Then
		vListFiles.Sort(True)
		Dim size As Int = vListFiles.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim vObjectToString As String = vListFiles.Get(i)
			If vObjectToString.StartsWith("-PausaIp") Or vObjectToString.EndsWith(".job") Then
				File.Delete(str, vObjectToString)
			End If
		Next
		Return
	End If
End Sub

Sub Sub018
	Dim i As Int
	Dim list As List
	list.Initialize
	list.AddAll(File.ListFiles(File.DirDefaultExternal & "/dayDB"))
	Dim size As Int = list.Size - 1
	Dim i2 As Int = 0
	Dim i3 As Int = 0
	Do While True
		If i2 > size Then
			i = 50
			Exit
		End If
		Dim vObjectToString As String = list.Get(i2)
		If vObjectToString.StartsWith("BKAnagra") And vObjectToString.EndsWith(".zip") Then
			i3 = i3 + File.Size(File.DirDefaultExternal & "/dayDB", vObjectToString)
			If i3 > 5000000 Then
				i = i2 - 1
				Exit
			End If
		End If
		i2 = i2 + 1
	Loop
	If i = 0 Then
		i = 1
	End If
	Dim vTmp As Long = Sub058()
	Dim str As String = "BKAnagra" & Sub059(vTmp - 30 * 86400000) & ".zip"
	Dim list2 As List
	list2.Initialize
	list2.AddAll(File.ListFiles(File.DirDefaultExternal & "/dayDB"))
	list2.Sort(False)
	Dim size2 As Int = list2.Size - 1
	Dim i4 As Int = 0
	Dim i5 As Int
	For i5 = 0 To size2
		Dim vObjectToString2 As String = list2.Get(i5)
		If vObjectToString2.StartsWith("BKAnagra") And vObjectToString2.EndsWith(".zip") Then
			If vObjectToString2.CompareTo(str) < 0 Or i4 >= i Then
				File.Delete(File.DirDefaultExternal & "/dayDB", vObjectToString2)
			Else
				i4 = i4 + 1
			End If
		End If
	Next
	Dim str2 As String = "BKAnagra" & Sub059(Sub058()) & ".zip"
	Dim dirDefaultExternal As String = File.DirDefaultExternal
	File.Copy(dirDefaultExternal, "Anagra.db", File.DirDefaultExternal, "AnagraCP.db")
	Dim strArr() As String = Array("AnagraCP.db", "Config.txt")
	Dim archiverForB4A As ArchiverForB4A
	Dim dirDefaultExternal2 As String = File.DirDefaultExternal
	archiverForB4A.ZipFiles(dirDefaultExternal2, strArr, File.DirDefaultExternal & "/dayDB", str2, "")
End Sub

Sub Sub019 As Boolean
	Dim z As Boolean = True
	If Not(Main.vBln16) Then
		Return False
	End If
	Try
		Dim periodVar As Period
		periodVar.Hours = Main.v_iniziogiorno * 1
		Dim i As Int = Main.v_dalle(DateTime.GetDayOfWeek(DateUtils.addperiod(Sub058(), periodVar)))
		Dim i2 As Int = Main.v_alle(DateTime.GetDayOfWeek(DateUtils.addperiod(Sub058(), periodVar)))
		If i <> i2 Then
			Dim vGetHour As Int = DateTime.GetHour(Sub058()) * 100
			Dim vGetMinute As Int = vGetHour + DateTime.GetMinute(Sub058())
			If i2 < i Then
				i2 = i2 + 2400
				If vGetMinute + 2400 > i And vGetMinute + 2400 < i2 Then
					vGetMinute = vGetMinute + 2400
				End If
			End If
			If vGetMinute < i Or vGetMinute >= i2 Then
				z = False
			End If
		End If
	Catch
		Sub217(LastException.Message)
	End Try
	Return z
End Sub

Sub Sub020(str As String, str2 As String, bArr As Byte())
	Dim vOpenOutput As OutputStream = File.OpenOutput(str, str2, False)
	vOpenOutput.WriteBytes(bArr, 0, bArr.Length)
	vOpenOutput.Close
End Sub

Sub Sub021(bArr As Byte()) As Long
	Dim reflection As Reflector
	reflection.Target = reflection.CreateObject("java.util.zip.CRC32")
	reflection.RunMethod4("update", Array(bArr), Array As String("[B"))
	Return reflection.RunMethod("getValue")
End Sub

Sub Sub022(str As String) As String
	Dim length As Int
	If str.Trim.Length < 7 Or Not((length = str.Trim.Length = 7 Or length = 12) And IsNumber(str)) Then
		Return ""
	End If
	If length = 7 Then
		str = "00000" & str
	End If
	Dim i As Int = 0
	Dim i2 As Int = 0
	Dim i3 As Int
	For i3 = 1 To 12
		If i3 = 1 Or i3 = 3 Or i3 = 5 Or i3 = 7 Or i3 = 9 Or i3 = 11 Then
			i = i + modfunstr.Sub006(modfunstr.Sub002(str, i3, 1))
		End If
		If i3 = 2 Or i3 = 4 Or i3 = 6 Or i3 = 8 Or i3 = 10 Or i3 = 12 Then
			i2 = i2 + modfunstr.Sub006(modfunstr.Sub002(str, i3, 1))
		End If
	Next
	Dim vNumberToString As String = modfunstr.Sub006(i2) * 3 + i
	Dim vTmp As String = modfunstr.Sub003(vNumberToString.Trim, 1)
	Dim vTmp_ As Int = 10 - modfunstr.Sub006(vTmp)
	If vTmp_ = 10 Then
		vTmp_ = 0
	End If
	Return str & vTmp_.Trim
End Sub

Sub Sub023(str As String) As Double
	vStr2 = "CalcolaCoefficente2(Descrizione As String) As Double"
	Select str.SubString2(0, 3)
		Case "1/1"
			Return 1
		Case "1/2"
			Return 0.5
		Case "1/3"
			Return 0.3333
		Case "1/4"
			Return 0.25
		Case "2/3"
			Return 0.6666
		Case "3/4"
			Return 0.75
	End Select
End Sub

Sub Sub024(sql As SQL, str As String, str2 As String) As Double
	Dim d As Double
	Dim cursorWrapper As Cursor = sql.ExecQuery(str)
	If cursorWrapper.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper.RowCount - 1
		d = 0
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper.Position = i
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from reparti where NF = " & str2 & " and codice = " & cursorWrapper.GetString("reparto")) > 0 Then
				d = d + cursorWrapper.GetDouble("T")
			End If
		Next
	Else
		d = 0
	End If
	cursorWrapper.Close
	Return d
End Sub

Sub Sub025(str As String, str2 As String) As Boolean
	If str.Length <> str2.Length Then
		Return False
	End If
	Dim length As Int = str.Length
	Dim i As Int
	For i = 1 To length
		Dim upperCase As String = modfunstr.Sub002(str, i, 1).ToUpperCase
		Select modfunstr.Sub002(str2, i, 1)
			Case "9"
				If Not(IsNumber(upperCase)) Or upperCase < "0" Or upperCase > "9" Then
					Return False
				End If
			Case "L"
				If Asc(upperCase) < Asc("A") Or Asc(upperCase) > Asc("Z") Then
					Return False
				End If
			Case "X"
				If (Asc(upperCase) < Asc("A") Or Asc(upperCase) > Asc("Z")) And (Asc(upperCase) < Asc("0") Or Asc(upperCase) > Asc("9")) Then
					Return False
				End If
			Case "S"
				If (Asc(upperCase) < Asc("A") Or Asc(upperCase) > Asc("Z")) And (Asc(upperCase) < Asc("0") Or Asc(upperCase) > Asc("9")) And Asc(upperCase) <> Asc("+") And Asc(upperCase) <> Asc("*") Then
					Return False
				End If
		End Select
	Next
	Return True
End Sub

Sub Sub026(str As String, i As Int) As Boolean
	If i > 99 Then
		Return True
	End If
	If str.StartsWith("F2") Then
		str = str.SubString(2)
	End If
	Return Not(str.SubString2(i + 1, i) <> "1")
End Sub

Sub Sub027(str As String) As Int
	Dim str2 As String = ""
	Dim lowerCase As String = str.ToLowerCase
	If lowerCase.Length > 0 Then
		Dim length As Int = lowerCase.Length
		Dim i As Int
		For i = 1 To length
			If i Mod 2 <> 0 Then
				Select lowerCase.CharAt(i - 1)
					Case "a"
						str2 = str2 & "0"
					Case "b"
						str2 = str2 & "1"
					Case "c"
						str2 = str2 & "2"
					Case "d"
						str2 = str2 & "3"
					Case "e"
						str2 = str2 & "4"
					Case "f"
						str2 = str2 & "5"
					Case "g"
						str2 = str2 & "6"
					Case "h"
						str2 = str2 & "7"
					Case "i"
						str2 = str2 & "8"
					Case "j"
						str2 = str2 & "9"
					Case Else
						"0"
				End Select
			End If
		Next
	End If
	If IsNumber(str2) Then
		Return str2
	End If
	Return 0
End Sub

Sub Sub028(str As String) As Boolean
	Return str.StartsWith("mnu")
End Sub

Sub Sub029(str As String) As Boolean
	Return str.StartsWith("msg") And str.Length = 4
End Sub

Sub Sub030(obj As Object, obj2 As Object, str As String) As Boolean
	Select str
		Case "LQ"
			Return Not(obj <= obj2)
		Case "GQ"
			Return Not(obj >= obj2)
		Case "LT"
			Return Not(obj < obj2)
		Case "GT"
			Return Not(obj > obj2)
		Case "NQ"
			Return Not(IIf(obj = obj2, False, True))
		Case Else
			Return obj <> obj2
	End Select
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m2… (riga 1802).
Sub Sub031(str As String, str2 As String) As String
	Dim str3 As String
	Dim z As Boolean = True
	Dim str4 As String = "Errore nel salvare i dati sul tavolo " & str
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from tavoli where tavolo = " & str)
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		If cursorWrapper2.GetInt("inmodifica") = 1 Then
			str3 = "Il tavolo risulta essere in modifica da un altro utente"
		Else
			If cursorWrapper2.GetInt("lock") = 1 Then
				If cursorWrapper2.GetInt("rifheadmov") > 0 Then
				End If
				z = False
				If Not(z) Then
					str3 = "Il tavolo risulta essere bloccato"
				End If
			End If
			str3 = ""
		End If
	Else
		str3 = str4
	End If
	cursorWrapper2.Close
	Return str3
End Sub

Sub Sub032(str As String, str2 As String, str3 As String) As Boolean
	If str = "DE" Then
		Main.vSql1.ExecQuerySingleResult(str2)
		Return True
	End If
	If str = "DT" Then
		Main.vSql1.ExecQuerySingleResult(str3)
		Return True
	End If
	Return False
End Sub

Sub Sub033(str As String, str2 As String, list As List) As Boolean
	Dim str3 As String
	Dim str4 As String
	Dim i As Int
	Dim z As Boolean = False
	Try
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPVincoli where codice ='" & str & "' and CodiceCondizione='" & str2 & "'") > 0 Then
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from MPVincoli where codice ='" & str & "' and CodiceCondizione='" & str2 & "'")
			Main.vSql1.ExecNonQuery("delete from TmpVincoli")
			Dim z2 As Boolean = False
			If Not(Main.vBln12) Then
				str3 = "qta"
				str4 = "importo"
			Else
				str3 = "Qtad"
				str4 = "importod"
			End If
			If cursorWrapper2.RowCount > 0 Then
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim i2 As Int = 0
				Do While i2 <= rowCount
					cursorWrapper2.Position = i2
					Dim z3 As Boolean = False
					Dim vGetString As String = cursorWrapper2.GetString("ModalitaConfrontoVincolo")
					Dim vGetInt As Int = cursorWrapper2.GetInt("ConfrontoVincolo")
					Select cursorWrapper2.GetString("OggettoVincolo")
						Case "ART", "REP", "GRP"
							Dim vGetString2 As String = cursorWrapper2.GetString("ElementoVincolo")
							Dim str5 As String = "codint ='" & vGetString2 & "'"
							If cursorWrapper2.GetString("OggettoVincolo") = "REP" Then
								str5 = "reparto =" & vGetString2 & " "
							End If
							Dim str6 As String = IIf(cursorWrapper2.GetString("OggettoVincolo") = "GRP", "(Select count(*) from anagra where" & TAB & "Ventmp.codint=anagra.codint And anagra.gruppov=" & SmartStringFormatter("", vGetString2) & ")>0 ", str5)
							If vGetString = "V" Then
								Dim d As Double = 0
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where " & str6) > 0 Then
									d = Main.vSql1.ExecQuerySingleResult("Select sum(" & str4 & ") from Ventmp where " & str6)
								End If
								If d = 0 Then
									z3 = True
								Else
									Dim doubleValue As Double = cursorWrapper2.GetDouble("ConfrontoVincolo")
									z3 = Sub030(d, doubleValue, cursorWrapper2.GetString("OperatoreVincolo"))
									If list.IsInitialized Then
										list.Add(Sub133(d, doubleValue, cursorWrapper2.GetString("OperatoreVincolo")))
									End If
								End If
							Else
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where " & str6) <= 0 Then
									i = 0
								Else
									i = Main.vSql1.ExecQuerySingleResult("Select sum(" & str3 & ") from Ventmp where " & str6)
								End If
								If i = 0 Then
									z3 = True
								Else
									z3 = Sub030(i, vGetInt, cursorWrapper2.GetString("OperatoreVincolo"))
									If list.IsInitialized Then
										list.Add(Sub133(i, vGetInt, cursorWrapper2.GetString("OperatoreVincolo")))
									End If
								End If
							End If
						Case "SCO"
							Dim doubleValue2 As Double = cursorWrapper2.GetDouble("ConfrontoVincolo")
							If vGetString = "V" Then
								z3 = Sub030(Main.vDbl1, doubleValue2, cursorWrapper2.GetString("OperatoreVincolo"))
								If list.IsInitialized Then
									list.Add(Sub133(Main.vDbl1, doubleValue2, cursorWrapper2.GetString("OperatoreVincolo")))
								End If
							End If
						Case "COU"
							If vGetString.Contains("Q") Then
								z3 = Not(Sub035(cursorWrapper2))
							End If
						Case "ACM"
							If vGetString.Contains("Q") Then
								z3 = Sub034(cursorWrapper2)
							End If
					End Select
					Main.vSql1.ExecNonQuery("insert into TmpVincoli(GruppoVincolo,Esito)" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "values(" & SmartStringFormatter("", cursorWrapper2.GetString("GruppoVincolo")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", IIf(z3, 0, 1)) & ")")
					i2 = i2 + 1
					z2 = True
				Loop
			End If
			cursorWrapper2.Close
			z = z2
		End If
		If z Then
			Dim cursorWrapper3 As Cursor
			Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select distinct(GruppoVincolo) from TmpVincoli")
			Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
			Dim i3 As Int
			For i3 = 0 To rowCount2
				cursorWrapper4.Position = i3
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from TmpVincoli where GruppoVincolo=" & SmartStringFormatter("", cursorWrapper4.GetString("GruppoVincolo")) & "  and Esito=1") = 0 Then
					Return False
				End If
			Next
		End If
		Return True
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub034(cursorWrapper As Cursor) As Boolean
	Try
		If Not(CallSub2(Main, "PrerequisitoAccumulatoreMP", "PUNTI")) Then
			Return True
		End If
		Dim vObjectToString As String = CallSub2(Main, "GetAccumulatoreMP", "PUNTI")
		If Not(IsNumber(vObjectToString)) Then
			Return True
		End If
		Return Sub030(vObjectToString, cursorWrapper.GetInt("ConfrontoVincolo"), cursorWrapper.GetString("OperatoreVincolo"))
	Catch
		Sub217(LastException.Message)
		Return True
	End Try
End Sub

Sub Sub035(cursorWrapper As Cursor) As Boolean
	Try
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where codint='cou'") = 0 Then
			Return False
		End If
		Dim vGetString As String = cursorWrapper.GetString("ModalitaConfrontoVincolo")
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select codice,chiave from Ventmp where codint='cou'")
		Dim vGetString2 As String = cursorWrapper.GetString("ElementoVincolo")
		Dim list As List
		list.Initialize
		Dim rowCount As Int = cursorWrapper3.RowCount - 1
		Dim i As Int = 0
		Dim i2 As Int = 0
		Dim i3 As Int = 0
		Dim i4 As Int
		For i4 = 0 To rowCount
			cursorWrapper3.Position = i4
			If modfunstr.Sub006(cursorWrapper3.GetString("codice").SubString2(4, 9)) = vGetString2 Then
				i3 = i3 + 1
				list.Add(cursorWrapper3.GetString("chiave"))
			End If
			If vGetString.Contains("T") Then
				Dim parseDouble As Int = cursorWrapper3.GetString("codice").SubString(12)
				If Sub030(parseDouble, Main.vDbl1 * 100, cursorWrapper.GetString("OperatoreVincolo")) Then
					i2 = i2 + 1
				End If
			End If
			If vGetString.Contains("N") Then
				Dim vNumberToString As String = modfunstr.Sub006(cursorWrapper3.GetString("codice").SubString2(9, 12))
				If vNumberToString = Main.v_nnegozio Then
					i = i + 1
				End If
			End If
		Next
		If i3 < cursorWrapper.GetInt("ConfrontoVincolo") Or ((vGetString.Contains("T") And i2 < cursorWrapper.GetInt("ConfrontoVincolo")) Or (vGetString.Contains("N") And i < cursorWrapper.GetInt("ConfrontoVincolo"))) Then
			cursorWrapper3.Close
			Return False
		End If
		Dim vGetInt As Int = cursorWrapper.GetInt("ConfrontoVincolo") - 1
		Dim i5 As Int
		For i5 = 0 To vGetInt
			Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select memo from Ventmp where chiave=" & list.Get(i5))
			If vExecQuerySingleResult.StartsWith(Main.v_prefissocoupon) Then
				Main.vSql1.ExecNonQuery("update Ventmp set memo=memo || '(V)' where chiave=" & list.Get(i5))
			Else
				Main.vSql1.ExecNonQuery("update Ventmp set memo='' where chiave=" & list.Get(i5))
			End If
		Next
		cursorWrapper3.Close
		Return True
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub036(str As String) As Boolean
	Return str.StartsWith("zon")
End Sub

Sub Sub037 As String
	Dim inputDialog As InputDialog
	inputDialog.InputType = 1
	inputDialog.Input = ""
	inputDialog.PasswordMode = False
	inputDialog.Hint = "Inserire una descrizione"
	inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim str As String = ""
	Dim z As Boolean = False
	Do While Not(z)
		Dim vShow As Int = inputDialog.Show("Inserire una descrizione valida (almeno 4 caratteri) ", Main.vStr8, "Ok", "", "", Main.vBmp1)
		If vShow = -1 And inputDialog.Input.Length > 3 Then
			Dim input As String = inputDialog.Input
			Dim left As String = modfunstr.left(input.Replace(",", "").Replace("'", "").Trim, 50)
			If left.Length > 3 Then
				str = left
				z = True
			Else
				str = left
			End If
		End If
	Loop
	Sub081()
	Return str
End Sub

Sub Sub038(str As String, i As Int, z As Boolean) As String
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	If str.Length > 0 Then
		Dim length As Int = str.Length
		Dim i2 As Int
		For i2 = 1 To length
			Dim charAt As Char = str.CharAt(i2 - 1)
			If (Asc(charAt) < 45 Or Asc(charAt) > 90) And (Asc(charAt) < 97 Or Asc(charAt) > 122) And (Not(z) Or (Asc(charAt) <> 123 And Asc(charAt) <> 125)) Then
				Select charAt
					Case "è", "é"
						charAt = "e"
					Case "à"
						charAt = "a"
					Case "ì"
						charAt = "i"
					Case "ò"
						charAt = "o"
					Case "ù"
						charAt = "u"
					Case "À", "Á"
						charAt = "A"
					Case "È", "É"
						charAt = "E"
					Case "Ì", "Í"
						charAt = "I"
					Case "Ò", "Ó"
						charAt = "O"
					Case "Ù", "Ú"
						charAt = "U"
					Case "€"
						charAt = "E"
					Case Else
						charAt = " "
				End Select
			End If
			stringBuilderWrapper.Append(charAt)
		Next
	End If
	Dim vToString As String = stringBuilderWrapper.ToString
	If vToString.Length > i Then
		Return vToString.SubString2(0, i)
	End If
	Return vToString
End Sub

Sub Sub039(str As String) As String
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	If str.Length > 0 Then
		Dim length As Int = str.Length
		Dim i As Int
		For i = 1 To length
			Dim charAt As Char = str.CharAt(i - 1)
			Select charAt
				Case "/", "\", "?", ":", "*", QUOTE, "<", ">", "|"
					charAt = " "
			End Select
			stringBuilderWrapper.Append(charAt)
		Next
	End If
	Return stringBuilderWrapper.ToString
End Sub

Sub consolida(str As String)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from daStampare where memo='' and lower(substr(codice,1,2))<>'vv' and lower(substr(codice,1,2))<>'ww' and lower(substr(codice,1,3))<>'mnu' and lower(substr(codice,1,3))<>'msg' and qta >0 and (qta*1000) % 1000=0 and id = '" & str & "' order by codint")
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from daStampare where chiave = " & cursorWrapper2.GetString("chiave")) = 0) Then
				If Main.vSql1.ExecQuerySingleResult("select count(*) from daStampare where (memo<>''  or lower(substr(codice,1,2))='vv'  or lower(substr(codice,1,2))='ww' or lower(substr(codice,1,3))='mnu' or lower(substr(codice,1,3))='msg') and totcre='" & cursorWrapper2.GetString("totcre") & "'") <= 0 Then
					Dim cursorWrapper3 As Cursor
					Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select * from daStampare where turno = " & cursorWrapper2.GetString("turno") & " and chiave <> " & cursorWrapper2.GetString("chiave") & " and descrizione='" & cursorWrapper2.GetString("descrizione") & "' and codint='" & cursorWrapper2.GetString("codint") & "' and memo='' and lower(substr(codice,1,2))<>'vv' and lower(substr(codice,1,2))<>'ww' and lower(substr(codice,1,3))<>'mnu' and lower(substr(codice,1,3))<>'msg' and qta >0 and (qta*1000) % 1000=0 and id = '" & str & "' order by codint")
					If cursorWrapper4.RowCount > 0 Then
						Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
						Dim i2 As Int
						For i2 = 0 To rowCount2
							cursorWrapper4.Position = i2
							If Main.vSql1.ExecQuerySingleResult("select count(*) from daStampare where (lower(substr(codice,1,2))='vv'  or lower(substr(codice,1,2))='ww' or lower(substr(codice,1,3))='mnu' or lower(substr(codice,1,3))='msg') and memo='' and totcre='" & cursorWrapper4.GetString("totcre") & "'") = 0 And cursorWrapper4.GetString("memo").Trim = "" Then
								Main.vSql1.ExecNonQuery("update daStampare set qta=qta+" & cursorWrapper4.GetString("qta").Replace(",", ".") & " where chiave = " & cursorWrapper2.GetString("chiave"))
								Main.vSql1.ExecNonQuery("update daStampare set qta=0 where chiave = " & cursorWrapper4.GetString("chiave"))
							End If
						Next
					End If
					cursorWrapper4.Close
				End If
			End If
		Next
	End If
	cursorWrapper2.Close
End Sub

Sub Sub040(j As Long, i As Int) As String
	If i < 2 Or i > "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".Length Then
		Return ""
	End If
	Dim str As String = ""
	Do While j >= i
		Dim i2 As Int = j Mod i
		str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".SubString2(i2, i2 + 1) & str
		j = (j - i2) / i
	Loop
	If j > 0 Then
		str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".SubString2(j, 1 + j) & str
	End If
	If str = "" Then
		Return "0"
	End If
	Return str
End Sub

Sub Sub041(str As String, str2 As String)
	Dim vListFiles As List = File.ListFiles(str)
	Dim size As Int = vListFiles.Size
	Dim i As Int
	For i = 0 To size - 1
		Dim vObjectToString As String = vListFiles.Get(i)
		If File.IsDirectory(str, vObjectToString) Then
			Dim vCombine As String = File.Combine(str, vObjectToString)
			Sub041(vCombine, File.Combine(str2, vObjectToString))
		Else
			File.Copy(str, vObjectToString, str2, vObjectToString)
		End If
	Next
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m0… (riga 2283).
Sub Sub042(i As Int)
	Dim i2 As Int
	Dim i3 As Int
	Dim i4 As Int
	Dim i5 As Int
	Dim str As String
	Dim i6 As Int
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	vStr2 = "Sub CreaPagina(pagina As Int)"
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM reparti order by codice")
		Dim i7 As Int = 0
		Dim i8 As Int = 0
		Dim i9 As Int = Main.vInt12 - 1
		Dim i10 As Int
		For i10 = 0 To i9
			Dim i11 As Int = Main.vInt13 - 1
			Dim i12 As Int = 0
			Do While i12 <= i11
				Select i10
					Case 0
						If i12 = 0 Then
							i2 = 1
							i3 = Main.c_rosso
							i4 = Main.t_tastierino
							i5 = 0
							str = "C"
							i6 = i8
						Else If i12 = 1 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "0"
							i6 = i8
						Else If i12 = 2 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "00"
							i6 = i8
						Else
							If i12 = 3 Then
								If Main.vInt12 - Main.vInt14 = 4 Then
									i2 = 1
									i3 = Main.c_blu
									i4 = Main.t_funzione
									i5 = Main.f_ricercaarticoli
									str = "Ricerca Articoli"
									i6 = i8
								End If
							End If
							If i12 = Main.vInt13 - 2 Then
								i2 = 2
								i3 = Main.c_rosso
								i4 = Main.t_pagamento
								i5 = 0
								str = "Contanti"
								i6 = i8
							Else
								If i = 1 Then
									If i12 < Main.vInt13 - 2 Then
										Dim i19 As Int = i12 + 1
										If i19 <= Main.vInt15 Then
											Dim i20 As Int = Main.vInt12 - i10
											If i20 <= Main.vInt14 Then
												z5 = True
												If Not(z5) Then
													Dim i21 As Int = i8 + 1
													If i21 > 98 Then
														i21 = 1
													End If
													cursorWrapper2.Position = i21
													i2 = 1
													i3 = Main.c_azzurro
													i4 = Main.t_reparto
													i5 = i21
													i6 = i21
													str = cursorWrapper2.GetString("descrizione")
												End If
											End If
										End If
										z5 = False
										If Not(z5) Then
										End If
									End If
								End If
								i2 = 1
								i3 = Main.c_nero
								i4 = Main.t_nulla
								i5 = 0
								cursorWrapper2.Position = 0
								str = ""
								i6 = i8
							End If
						End If
					Case 1
						If i12 = 0 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "1"
							i6 = i8
						Else If i12 = 1 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "2"
							i6 = i8
						Else If i12 = 2 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "3"
							i6 = i8
						Else
							If i12 = 3 Then
								If Main.vInt12 - Main.vInt14 = 4 Then
									i2 = 1
									i3 = Main.c_blu
									i4 = Main.t_funzione
									i5 = Main.f_ricercacliente
									str = "Cliente"
									i6 = i8
								End If
							End If
							If i12 = Main.vInt13 - 2 Then
								i2 = 1
								i3 = Main.c_blu
								i4 = Main.t_funzione
								i5 = Main.f_annullapagamenti
								str = "Annulla Pagamenti"
								i6 = i8
							Else
								If i12 = Main.vInt13 - 1 Then
									i2 = 1
									i3 = Main.c_blu
									i4 = Main.t_funzione
									i5 = Main.f_apricassetto
									str = "Apri Cassetto"
									i6 = i8
								Else
									If i = 1 Then
										Dim i32 As Int = i12 + 1
										If i32 <= Main.vInt15 Then
											Dim i33 As Int = Main.vInt12 - i10
											If i33 <= Main.vInt14 Then
												z4 = True
												If Not(z4) Then
													Dim i34 As Int = i8 + 1
													If i34 > 98 Then
														i34 = 1
													End If
													cursorWrapper2.Position = i34
													i2 = 1
													i3 = Main.c_azzurro
													i4 = Main.t_reparto
													i5 = i34
													i6 = i34
													str = cursorWrapper2.GetString("descrizione")
												End If
											End If
										End If
										z4 = False
										If Not(z4) Then
										End If
									End If
									i2 = 1
									i3 = Main.c_nero
									i4 = Main.t_nulla
									i5 = 0
									cursorWrapper2.Position = 0
									str = ""
									i6 = i8
								End If
							End If
						End If
					Case 2
						If i12 = 0 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "4"
							i6 = i8
						Else If i12 = 1 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "5"
							i6 = i8
						Else If i12 = 2 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "6"
							i6 = i8
						Else
							If i12 = 3 Then
								If Main.vInt12 - Main.vInt14 = 4 Then
									i2 = 1
									i3 = Main.c_grigio
									i4 = Main.t_tastierino
									i5 = 0
									str = "X"
									i6 = i8
								End If
							End If
							If i12 = Main.vInt13 - 2 Then
								i2 = 1
								i3 = Main.c_blu
								i4 = Main.t_funzione
								i5 = Main.f_cancellatutto
								str = "Cancella Tutto"
								i6 = i8
							Else
								If i12 = Main.vInt13 - 1 Then
									i2 = 1
									i3 = Main.c_blu
									i4 = Main.t_funzione
									i5 = Main.f_scontototale
									str = "Sconto Totale"
									i6 = i8
								Else
									If i = 1 Then
										Dim i45 As Int = i12 + 1
										If i45 <= Main.vInt15 Then
											Dim i46 As Int = Main.vInt12 - i10
											If i46 <= Main.vInt14 Then
												z3 = True
												If Not(z3) Then
													Dim i47 As Int = i8 + 1
													If i47 > 98 Then
														i47 = 1
													End If
													cursorWrapper2.Position = i47
													i2 = 1
													i3 = Main.c_azzurro
													i4 = Main.t_reparto
													i5 = i47
													i6 = i47
													str = cursorWrapper2.GetString("descrizione")
												End If
											End If
										End If
										z3 = False
										If Not(z3) Then
										End If
									End If
									i2 = 1
									i3 = Main.c_nero
									i4 = Main.t_nulla
									i5 = 0
									cursorWrapper2.Position = 0
									str = ""
									i6 = i8
								End If
							End If
						End If
					Case 3
						If i12 = 0 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "7"
							i6 = i8
						Else If i12 = 1 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "8"
							i6 = i8
						Else If i12 = 2 Then
							i2 = 1
							i3 = Main.c_grigio
							i4 = Main.t_tastierino
							i5 = 0
							str = "9"
							i6 = i8
						Else
							If i12 = 3 Then
								If Main.vInt12 - Main.vInt14 = 4 Then
									i2 = 1
									i3 = Main.c_grigio
									i4 = Main.t_tastierino
									i5 = 0
									str = ","
									i6 = i8
								End If
							End If
							If i12 = Main.vInt13 - 2 Then
								i2 = 1
								i3 = Main.c_blu
								i4 = Main.t_funzione
								If Main.vInt12 - Main.vInt14 = 4 Then
									i5 = Main.f_scontrinoparlante
									str = "Scontrino Parlante"
									i6 = i8
								Else
									i5 = Main.f_ricercaarticoli
									str = "Ricerca Articoli"
									i6 = i8
								End If
							Else
								If i12 = Main.vInt13 - 1 Then
									i2 = 1
									i3 = Main.c_blu
									i4 = Main.t_funzione
									i5 = Main.f_stampaoggi
									str = "Statistiche di Vendita"
									i6 = i8
								Else
									If i = 1 Then
										Dim i60 As Int = i12 + 1
										If i60 <= Main.vInt15 Then
											Dim i61 As Int = Main.vInt12 - i10
											If i61 <= Main.vInt14 Then
												z2 = True
												If Not(z2) Then
													Dim i62 As Int = i8 + 1
													If i62 > 98 Then
														i62 = 1
													End If
													cursorWrapper2.Position = i62
													i2 = 1
													i3 = Main.c_azzurro
													i4 = Main.t_reparto
													i5 = i62
													i6 = i62
													str = cursorWrapper2.GetString("descrizione")
												End If
											End If
										End If
										z2 = False
										If Not(z2) Then
										End If
									End If
									i2 = 1
									i3 = Main.c_nero
									i4 = Main.t_nulla
									i5 = 0
									cursorWrapper2.Position = 0
									str = ""
									i6 = i8
								End If
							End If
						End If
					Case 4
						If i12 = 0 Then
							If Main.vInt12 - Main.vInt14 > 4 Then
								i2 = 1
								i3 = Main.c_grigio
								i4 = Main.t_tastierino
								i5 = 0
								str = "X"
								i6 = i8
							End If
						End If
						If i12 = 1 Then
							If Main.vInt12 - Main.vInt14 > 4 Then
								i2 = 1
								i3 = Main.c_grigio
								i4 = Main.t_tastierino
								i5 = 0
								str = ","
								i6 = i8
							End If
						End If
						If i12 = 2 Then
							If Main.vInt12 - Main.vInt14 > 4 Then
								i2 = 1
								i3 = Main.c_blu
								i4 = Main.t_funzione
								i5 = Main.f_ricercacliente
								str = "Cliente"
								i6 = i8
							End If
						End If
						If i12 = Main.vInt13 - 2 Then
							i2 = 1
							i3 = Main.c_blu
							i4 = Main.t_funzione
							i5 = Main.f_recallmov
							str = "Richiamo Movimento"
							i6 = i8
						Else
							If i12 = Main.vInt13 - 1 Then
								i2 = 1
								i3 = Main.c_blu
								i4 = Main.t_funzione
								i5 = Main.f_fattura
								str = "Fattura"
								i6 = i8
							Else
								If i = 1 Then
									Dim i74 As Int = i12 + 1
									If i74 <= Main.vInt15 Then
										Dim i75 As Int = Main.vInt12 - i10
										If i75 <= Main.vInt14 Then
											z = True
											If Not(z) Then
												Dim i76 As Int = i8 + 1
												If i76 > 98 Then
													i76 = 1
												End If
												cursorWrapper2.Position = i76
												i2 = 1
												i3 = Main.c_azzurro
												i4 = Main.t_reparto
												i5 = i76
												i6 = i76
												str = cursorWrapper2.GetString("descrizione")
											End If
										End If
									End If
									z = False
									If Not(z) Then
									End If
								End If
								i2 = 1
								i3 = Main.c_nero
								i4 = Main.t_nulla
								i5 = 0
								cursorWrapper2.Position = 0
								str = ""
								i6 = i8
							End If
						End If
					Case Else
						If i = 1 Then
							Dim i80 As Int = i12 + 1
							If i80 <= Main.vInt15 Then
								Dim i81 As Int = Main.vInt12 - i10
								If i81 <= Main.vInt14 Then
									z6 = True
									If Not(z6) Then
										Dim i82 As Int = i8 + 1
										If i82 > 98 Then
											i82 = 1
										End If
										cursorWrapper2.Position = i82
										i2 = 1
										i3 = Main.c_azzurro
										i4 = Main.t_reparto
										i5 = i82
										i6 = i82
										str = cursorWrapper2.GetString("descrizione")
									End If
								End If
							End If
							z6 = False
							If Not(z6) Then
							End If
						End If
						i2 = 1
						i3 = Main.c_nero
						i4 = Main.t_nulla
						i5 = 0
						cursorWrapper2.Position = 0
						str = ""
						i6 = i8
				End Select
				Main.vSql1.ExecNonQuery("insert into pagine(riga,colonna,pagina ,tasto , dimensione ,colore ,testo ,tipo ,valore,icona) values(" & i10 & "," & i12 & ", " & i & " , " & i7 & " , " & i2 & " , " & i3 & " , '" & str & "' , " & i4 & " , " & i5 & ",0)")
				i7 = i7 + 1
				i12 = i12 + 1
				i8 = i6
			Loop
		Next
		cursorWrapper2.Close
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub043
	Dim i As Int
	Dim i2 As Int
	Dim i3 As Int
	Dim i4 As Int
	Dim str As String
	vStr2 = "Sub CreaPagina(pagina As Int)"
	Try
		Dim i5 As Int = 0
		Dim i6 As Int = Main.vInt12 - 1
		Dim i7 As Int
		For i7 = 0 To i6
			Dim i8 As Int = Main.vInt13 - 1
			Dim i9 As Int
			For i9 = 0 To i8
				Dim valueOf As Int = i7
				Select valueOf
					Case 0
						If i9 = 0 Then
							i = 1
							i2 = Main.c_rosso
							i3 = Main.t_tastierino
							i4 = 0
							str = "C"
						Else If i9 = 1 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "0"
						Else If i9 = 2 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "00"
						Else
							If i9 = Main.vInt13 - 2 Then
								i = 2
								i2 = Main.c_rosso
								i3 = Main.t_pagamento
								i4 = 0
								str = "Contanti"
							Else
								i = 1
								i2 = Main.c_marrone
								i3 = Main.t_plu
								i4 = 0
								str = ""
							End If
						End If
					Case 1
						If i9 = 0 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "1"
						Else If i9 = 1 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "2"
						Else If i9 = 2 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "3"
						Else
							If i9 = Main.vInt13 - 2 Then
								i = 1
								i2 = Main.c_blu
								i3 = Main.t_funzione
								i4 = Main.f_annullapagamenti
								str = "Annulla Pagamenti"
							Else
								i = 1
								i2 = Main.c_marrone
								i3 = Main.t_plu
								i4 = 0
								str = ""
							End If
						End If
					Case 2
						If i9 = 0 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "4"
						Else If i9 = 1 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "5"
						Else If i9 = 2 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "6"
						Else
							If i9 = Main.vInt13 - 2 Then
								i = 1
								i2 = Main.c_blu
								i3 = Main.t_funzione
								i4 = Main.f_cancellatutto
								str = "Cancella Tutto"
							Else
								If i9 = Main.vInt13 - 1 Then
									i = 1
									i2 = Main.c_blu
									i3 = Main.t_funzione
									i4 = Main.f_scontototale
									str = "Sconto Totale"
								Else
									i = 1
									i2 = Main.c_marrone
									i3 = Main.t_plu
									i4 = 0
									str = ""
								End If
							End If
						End If
					Case 3
						If i9 = 0 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "7"
						Else If i9 = 1 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "8"
						Else If i9 = 2 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "9"
						Else
							If i9 = Main.vInt13 - 2 Then
								i = 1
								i2 = Main.c_blu
								i3 = Main.t_funzione
								i4 = Main.f_ricercaarticoli
								str = "Ricerca Articoli"
							Else
								If i9 = Main.vInt13 - 1 Then
									i = 1
									i2 = Main.c_blu
									i3 = Main.t_funzione
									i4 = Main.f_stampaoggi
									str = "Statistiche di Vendita"
								Else
									i = 1
									i2 = Main.c_marrone
									i3 = Main.t_plu
									i4 = 0
									str = ""
								End If
							End If
						End If
					Case 4
						If i9 = 0 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = "X"
						Else If i9 = 1 Then
							i = 1
							i2 = Main.c_grigio
							i3 = Main.t_tastierino
							i4 = 0
							str = ","
						Else If i9 = 2 Then
							i = 1
							i2 = Main.c_blu
							i3 = Main.t_funzione
							i4 = Main.f_ricercacliente
							str = "Cliente"
						Else
							If i9 = Main.vInt13 - 2 Then
								i = 1
								i2 = Main.c_blu
								i3 = Main.t_funzione
								i4 = Main.f_recallmov
								str = "Richiamo Movimento"
							Else
								If i9 = Main.vInt13 - 1 Then
									i = 1
									i2 = Main.c_blu
									i3 = Main.t_funzione
									i4 = Main.f_fattura
									str = "Fattura"
								Else
									i = 1
									i2 = Main.c_marrone
									i3 = Main.t_plu
									i4 = 0
									str = ""
								End If
							End If
						End If
					Case Main.vInt12 - 1
						If i9 = Main.vInt13 - 3 Then
							i = 1
							i2 = Main.c_azzurro
							i3 = Main.t_funzione
							i4 = Main.f_prev
							str = "Indietro"
						Else
							If i9 = Main.vInt13 - 2 Then
								i = 1
								i2 = Main.c_azzurro
								i3 = Main.t_funzione
								i4 = Main.f_next
								str = "Avanti"
							Else
								If i9 = Main.vInt13 - 1 Then
									i = 1
									i2 = Main.c_blu
									i3 = Main.t_funzione
									i4 = Main.f_chiudirep
									str = "Chiudi"
								Else
									i = 1
									i2 = Main.c_marrone
									i3 = Main.t_plu
									i4 = 0
									str = ""
								End If
							End If
						End If
					Case Else
						i = 1
						i2 = Main.c_marrone
						i3 = Main.t_plu
						i4 = 0
						str = ""
				End Select
				Main.vSql1.ExecNonQuery("insert into pagine(riga,colonna,pagina ,tasto , dimensione ,colore ,testo ,tipo ,valore,icona) values(" & i7 & "," & i9 & ", 100 , " & i5 & " , " & i & " , " & i2 & " , '" & str & "' , " & i3 & " , " & i4 & ",0)")
				i5 = i5 + 1
			Next
		Next
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub044
	vStr2 = "Sub CreaTabelle"
	Try
		Main.vSql1.ExecNonQuery("CREATE TABLE anagra (codint nvarchar (20) PRIMARY KEY ,descrizione nvarchar (50) not NULL default '', reparto int not NULL default 1  , iva int not NULL default 0  , gruppo nvarchar (20) , list1 numeric(18, 2) not NULL default 0,list2 numeric(18, 2) not NULL default 0,list3 numeric(18, 2) not NULL default 0,list4 numeric(18, 2) not NULL default 0,list5 numeric(18, 2) not NULL default 0 ,giac numeric(18, 3) not NULL default 0,sottoscorta int not NULL default 0,plupeso int not NULL default 0,flgvar bit not NULL default 0,flgmag bit not NULL default 0,flgnoreso bit not NULL default 0,flgusointerno bit not NULL default 0)")
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE tavoli (tavolo int PRIMARY KEY ,memo nvarchar (200) not NULL default '', prenotato bit not NULL default 0,ricconto bit not NULL default 0 , timein datetime NULL , importo numeric(18, 2) not NULL default 0,inmodifica bit not NULL default 0 ,rifheadmov numeric(18, 0) not NULL default 0,lock bit not NULL default 0 ,unlocktable int not NULL default 0 ,timelast datetime NULL  )")
		Dim i As Int
		For i = 1 To 200
			Main.vSql1.ExecNonQuery("insert into tavoli(tavolo) values(" & i & ")")
		Next
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE confstampe (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '', layout int not NULL default 0, ip nvarchar (50) not NULL default '', asporto bit Not Null default 0, stato int not NULL default 0 )")
		Dim i2 As Int
		For i2 = 1 To 9
			Main.vSql1.ExecNonQuery("insert into confstampe(codice,descrizione) values(" & i2 & ",'Stampante " & i2 & "')")
		Next
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE filtristampe (codice int NULL ,reparto int not NULL default 0 ,chiave INTEGER PRIMARY KEY ,descrizione nvarchar (50) not NULL default '' )")
		Main.vSql1.ExecNonQuery("CREATE TABLE daStampare (codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,qta numeric(18, 3) NULL ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,idRiga nvarchar (20) not NULL default '',reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',id nvarchar (20)  NULL )")
		Main.vSql1.ExecNonQuery("CREATE TABLE tmpStampa (codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,qta numeric(18, 3) NULL ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '')")
		Main.vSql1.ExecNonQuery("CREATE TABLE tmpStampaPalm1 (codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,qta numeric(18, 3) NULL ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '')")
		Main.vSql1.ExecNonQuery("CREATE TABLE tmpStampaPalm2 (codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,qta numeric(18, 3) NULL ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '')")
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE tmpStampaPalm3 (codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,qta numeric(18, 3) NULL ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '')")
		Main.vSql1.ExecNonQuery("CREATE TABLE tmpStampaPalm4 (codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,qta numeric(18, 3) NULL ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '')")
		Main.vSql1.ExecNonQuery("CREATE TABLE tmpStampaPalm5 (codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,qta numeric(18, 3) NULL ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '')")
		Main.vSql1.ExecNonQuery("CREATE TABLE tmpStampaPalm6 (codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,qta numeric(18, 3) NULL ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '')")
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE HeaddaStampare (codstampa int not NULL default 1,chiave INTEGER PRIMARY KEY ,id nvarchar (20)  NULL ,nmov numeric(18,0) null)")
		Dim list As List
		Dim map As Map
		map.Initialize
		list.Initialize
		map.Put("codint", "abb")
		map.Put("descrizione", "ABBUONO")
		map.Put("reparto", 99)
		map.Put("iva", 1)
		map.Put("plupeso", 0)
		map.Put("list1", 0)
		map.Put("flgusointerno", True)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "anagra", list)
		map.Initialize
		list.Initialize
		map.Put("codint", "pco")
		map.Put("descrizione", "PASTO COMPLETO")
		map.Put("reparto", 98)
		map.Put("iva", 1)
		map.Put("plupeso", 0)
		map.Put("list1", 0)
		map.Put("flgusointerno", True)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "anagra", list)
		map.Initialize
		list.Initialize
		map.Put("codint", "888888")
		map.Put("descrizione", "COPERTO")
		map.Put("reparto", 98)
		map.Put("iva", 1)
		map.Put("plupeso", 0)
		map.Put("list1", 0)
		map.Put("flgusointerno", False)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "anagra", list)
		map.Initialize
		list.Initialize
		map.Put("codint", "pre")
		map.Put("descrizione", "PREMIO")
		map.Put("reparto", 98)
		map.Put("iva", 1)
		map.Put("plupeso", 0)
		map.Put("list1", 0)
		map.Put("flgusointerno", True)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "anagra", list)
		map.Initialize
		list.Initialize
		map.Put("codint", "ric")
		map.Put("descrizione", "RICARICA")
		map.Put("reparto", 98)
		map.Put("iva", 1)
		map.Put("plupeso", 0)
		map.Put("list1", 0)
		map.Put("flgusointerno", True)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "anagra", list)
		Main.vSql1.ExecNonQuery("CREATE TABLE ean (chiave INTEGER PRIMARY KEY,codint nvarchar (20)  ,codice nvarchar (20) not NULL default '')")
		Main.vSql1.ExecNonQuery("CREATE  INDEX IX_CODICE ON ean(codice)")
		Main.vSql1.ExecNonQuery("CREATE TABLE progressivi (codice nvarchar (2) PRIMARY KEY ,valore int NULL )")
		Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('R',1)")
		Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('A',1)")
		Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('I',1)")
		Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('O',1)")
		Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('V',1)")
		Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('F',1)")
		Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('C',1)")
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE reparti (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',maximpo numeric(18, 2) not NULL default 999,iva int not NULL default 0  )")
		Main.vSql1.ExecNonQuery("insert into reparti(codice,descrizione,iva) values(0,'Tabacchi Lavorati',3)")
		Dim i3 As Int
		For i3 = 1 To 97
			Main.vSql1.ExecNonQuery("insert into reparti(codice,descrizione,iva) values(" & i3 & ",'Reparto " & i3 & "',1)")
		Next
		Main.vSql1.ExecNonQuery("insert into reparti(codice,descrizione) values(98,'NESSUNO')")
		Main.vSql1.ExecNonQuery("insert into reparti(codice,descrizione) values(99,'Abbuono')")
		Main.vSql1.ExecNonQuery("CREATE TABLE operatori (codice int PRIMARY KEY ,pwd nvarchar (5) not NULL default '11111',descrizione nvarchar (50) not NULL default '',funzioni  nvarchar (50) not NULL default '111111111111111111111111111111111111111011111111')")
		Dim i4 As Int
		For i4 = 1 To 9
			Main.vSql1.ExecNonQuery("insert into operatori(codice,descrizione) values(" & i4 & ",'Operatore " & i4 & "')")
		Next
		Main.vSql1.ExecNonQuery("CREATE TABLE clienti (" & TAB & "codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50) not NULL default '' ,citta nvarchar (50)  not NULL default '' ,provincia nvarchar (4)  not NULL default '' ,piva nvarchar (20)  not NULL default '' ,codf nvarchar (20)  not NULL default '' ,telefono nvarchar (20)  not NULL default '' ,fax nvarchar (20)  not NULL default '' , via nvarchar (50)  not NULL default '' ,cap nvarchar (50)  not NULL default '' ,listino int not NULL default 0,sconto int not NULL default 0,punti int not NULL default 0, prep numeric(18, 2) not NULL default 0, fido numeric(18, 2) not NULL default 0 ,chiave INTEGER PRIMARY KEY ,abpunti bit not NULL default 0," & TAB & "abprep bit not NULL default 0,abpost bit not NULL default 0)")
		Main.vSql1.ExecNonQuery("CREATE  INDEX IX_CODCLI ON clienti(codice)")
		Main.vSql1.ExecNonQuery("CREATE TABLE Ventmp (" & TAB & "codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,flgusointerno bit not NULL default 0,idRiga nvarchar (20) not NULL default '',cliente nvarchar (20) not NULL default '',plupeso int not NULL default 0,flgNF bit not NULL default 0,flgmag bit not NULL default 0,brep bit not NULL default 0,qta numeric(18, 3) NULL ," & TAB & "prezzov numeric(18, 4) NULL ," & TAB & "reparto int not NULL default 1 ," & TAB & "iva int not NULL default 0 ,importo numeric(18, 4) NULL ," & TAB & "datam datetime NULL ," & TAB & "codint nvarchar (20)  NULL ," & TAB & "cassa nvarchar (100) NULL ,chiave INTEGER PRIMARY KEY ," & TAB & "scop numeric(18, 2) not NULL default 0 ,scov numeric(18, 2) not NULL default 0,scop2 numeric(18, 2) not NULL default 0 ,scov2 numeric(18, 2) not NULL default 0)")
		Main.vSql1.ExecNonQuery("CREATE TABLE headmov (nmov numeric(18,0) PRIMARY KEY ," & TAB & "nfat int not NULL default 0 ,tavolo int not NULL default 0,operatore int not NULL default 1,opdes nvarchar (50) not NULL default '',clides nvarchar (50) not NULL default '',cliente nvarchar (20) not NULL default '',flgNF bit not NULL default 0,totale numeric(18, 4) NULL ,prep numeric(18, 2) not NULL  default 0, punti int not NULL default 0," & TAB & "datam datetime NULL ," & TAB & "cassa nvarchar (100) NULL ,nfat_fm int not NULL default 0,datfat_fm datetime NULL ,nscontrinoffm int not NULL default 0,dataeoraffm datetime NULL ,matricolacassap nvarchar (20)  NULL,memo nvarchar (50)  not NULL default '')")
		Main.vSql1.ExecNonQuery("CREATE TABLE Venduto (" & TAB & "codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,cliente nvarchar (20) not NULL default '',idRiga nvarchar (20) not NULL default '',plupeso int not NULL default 0,flgNF bit not NULL default 0,brep bit not NULL default 0,qta numeric(18, 3) NULL ," & TAB & "prezzov numeric(18, 4) NULL ," & TAB & "reparto int not NULL default 1 ," & TAB & "iva int not NULL default 0 ,importo numeric(18, 4) NULL ," & TAB & "datam datetime NULL ," & TAB & "codint nvarchar (20)  NULL ," & TAB & "cassa nvarchar (100) NULL ,nmov numeric(18,0) null,aliquota numeric(18, 1) NULL default 0,nfat int not NULL default 0,chiave INTEGER PRIMARY KEY ," & TAB & "scop numeric(18, 2) not NULL default 0 ,scov numeric(18, 2) not NULL default 0,scop2 numeric(18, 2) not NULL default 0 ,scov2 numeric(18, 2) not NULL default 0)")
		Main.vSql2.ExecNonQuery("CREATE TABLE Venduto (" & TAB & "codice nvarchar (20)  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,causale nvarchar (2) not NULL default 'sc',idRiga nvarchar (20) not NULL default '',cliente nvarchar (20) not NULL default '',plupeso int not NULL default 0,flgNF bit not NULL default 0,brep bit not NULL default 0,qta numeric(18, 3) NULL ," & TAB & "prezzov numeric(18, 4) NULL ," & TAB & "reparto int not NULL default 1 ," & TAB & "iva int not NULL default 0 ,importo numeric(18, 4) NULL ," & TAB & "datam datetime NULL ," & TAB & "codint nvarchar (20)  NULL ," & TAB & "cassa nvarchar (100) NULL ,nmov numeric(18,0) null,aliquota numeric(18, 1) NULL default 0,nfat int not NULL default 0,chiave INTEGER PRIMARY KEY ," & TAB & "scop numeric(18, 2) not NULL default 0 ,scov numeric(18, 2) not NULL default 0,scop2 numeric(18, 2) not NULL default 0 ,scov2 numeric(18, 2) not NULL default 0)")
		Main.vSql2.ExecNonQuery("CREATE TABLE headmov (nmov numeric(18,0) PRIMARY KEY ," & TAB & "nfat int not NULL default 0 ,tavolo int not NULL default 0,causale nvarchar (2) not NULL default 'sc',operatore int not NULL default 1,opdes nvarchar (50) not NULL default '',clides nvarchar (50) not NULL default '',cliente nvarchar (20) not NULL default '',flgNF bit not NULL default 0,totale numeric(18, 4) NULL ,prep numeric(18, 2) not NULL  default 0, punti int not NULL default 0," & TAB & "datam datetime NULL ," & TAB & "cassa nvarchar (100) NULL ,nfat_fm int not NULL default 0,datfat_fm datetime NULL ,nscontrinoffm int not NULL default 0,dataeoraffm datetime NULL ,matricolacassap nvarchar (20)  NULL,memo nvarchar (50)  not NULL default '')")
		Main.vSql2.ExecNonQuery("CREATE TABLE CausaliPagamenti (" & TAB & "codice int  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,datam datetime NULL ,nmov numeric(18,0) null,qta int NULL ," & TAB & "importo numeric(18, 4) NULL ,chiave INTEGER PRIMARY KEY)")
		Main.vSql1.ExecNonQuery("CREATE TABLE DatiFattFM (nmov numeric(18,0) null,chiave INTEGER PRIMARY KEY ,datac datetime NULL,matricola nvarchar (50) NULL,nscontr int NULL)")
		Main.vSql1.ExecNonQuery("CREATE TABLE CausaliPagamenti (" & TAB & "codice int  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,datam datetime NULL ,nmov numeric(18,0) null,qta int NULL ," & TAB & "importo numeric(18, 4) NULL ,chiave INTEGER PRIMARY KEY)")
		Main.vSql1.ExecNonQuery("CREATE TABLE Stampe (" & TAB & "codice int  NULL ," & TAB & "descrizione nvarchar (50)  NULL ,flgchiusura bit not NULL default 0,flgattiva bit not NULL default 1,flgmail bit not NULL default 0,chiave INTEGER PRIMARY KEY)")
		DoEvents
		Main.vSql1.ExecNonQuery("insert into Stampe(codice,descrizione) values(0,'REPARTI')")
		Main.vSql1.ExecNonQuery("insert into Stampe(codice,descrizione) values(1,'IVA')")
		Main.vSql1.ExecNonQuery("insert into Stampe(codice,descrizione) values(2,'PAGAMENTI')")
		Main.vSql1.ExecNonQuery("insert into Stampe(codice,descrizione) values(3,'ARTICOLI')")
		Main.vSql1.ExecNonQuery("insert into Stampe(codice,descrizione) values(4,'CLIENTI')")
		Main.vSql1.ExecNonQuery("insert into Stampe(codice,descrizione) values(5,'OPERATORI')")
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE pagamenti (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',cassa int not NULL default 0,obbligo bit not NULL default 0,buonosr bit not NULL default 0,RTPagamento int not NULL default 0)")
		Main.vSql1.ExecNonQuery("insert into pagamenti(codice,descrizione,cassa,RTPagamento) values(0,'CONTANTI',0,1)")
		Main.vSql1.ExecNonQuery("insert into pagamenti(codice,descrizione,cassa,RTPagamento) values(1,'ASSEGNI',0,0)")
		Main.vSql1.ExecNonQuery("insert into pagamenti(codice,descrizione,cassa,RTPagamento) values(2,'CREDITO',1,7)")
		Main.vSql1.ExecNonQuery("insert into pagamenti(codice,descrizione,cassa,RTPagamento) values(3,'C.CREDITO',0,0)")
		Main.vSql1.ExecNonQuery("insert into pagamenti(codice,descrizione,cassa,RTPagamento) values(4,'BANCOMAT',0,0)")
		Dim i5 As Int
		For i5 = 5 To 30
			Main.vSql1.ExecNonQuery("insert into pagamenti(codice,descrizione,cassa) values(" & i5 & ",'DA INSERIRE',0)")
		Next
		Main.vSql1.ExecNonQuery("CREATE TABLE intesta (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',tipo int not NULL default 0)")
		Main.vSql1.ExecNonQuery("insert into intesta(codice,descrizione,tipo) values(0,'Italretail s.r.l.',2)")
		Main.vSql1.ExecNonQuery("insert into intesta(codice,descrizione,tipo) values(1,'Via del Paracadutista 11-11A/B',1)")
		Main.vSql1.ExecNonQuery("insert into intesta(codice,descrizione,tipo) values(2,'Reggio Emilia',1)")
		Main.vSql1.ExecNonQuery("insert into intesta(codice,descrizione,tipo) values(3,'Tel.Anon_0522/232060-Fax.Anon_0522/232501',1)")
		Main.vSql1.ExecNonQuery("insert into intesta(codice,descrizione,tipo) values(4,'info@italretail.it',6)")
		Main.vSql1.ExecNonQuery("insert into intesta(codice,descrizione,tipo) values(5,'www.italretail.it',6)")
		Main.vSql1.ExecNonQuery("insert into intesta(codice,descrizione,tipo) values(6,'',6)")
		Main.vSql1.ExecNonQuery("insert into intesta(codice,descrizione,tipo) values(7,'',6)")
		Main.vSql1.ExecNonQuery("CREATE TABLE iva (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',aliquota numeric(18, 1) NULL,natura int not NULL default 0 )")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(0,'Iva 22',22)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(1,'Iva 10',10)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(2,'Iva 4',4)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota,natura) values(3,'Esclusa - art.Anon_74 DPR 633/1972',0,2)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(4,'Da inserire',0)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(5,'Da inserire',0)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(6,'Da inserire',0)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(7,'Da inserire',0)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(8,'Da inserire',0)")
		Main.vSql1.ExecNonQuery("insert into iva(codice,descrizione,aliquota) values(9,'Da inserire',0)")
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE pagine (chiave INTEGER PRIMARY KEY,pagina int Null  ,tasto int Null  , riga int null , colonna int null, dimensione int Null  ,colore int NULL ,testo nvarchar (50)  NULL,tipo int NULL,valore int NULL,icona int NULL,plurep bit not NULL default 0)")
		Main.vSql1.ExecNonQuery("CREATE TABLE Despagine (codice Int  Null ," & TAB & "descrizione nvarchar (50)  Null ,obbligocoperti bit not NULL default 0,listinocoperti int not NULL default 0,chiave INTEGER PRIMARY KEY)")
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from Despagine") = 0 Then
			Dim i6 As Int
			For i6 = 1 To 9
				Main.vSql1.ExecNonQuery("insert into Despagine(codice,descrizione) values(" & i6 & ",'Pagina " & i6 & "')")
			Next
			Dim i7 As Int
			For i7 = 10 To 20
				Main.vSql1.ExecNonQuery("insert into Despagine(codice,descrizione) values(" & i7 & ",'Sala Tavoli " & i7 - 9 & "')")
			Next
		End If
		Main.vSql1.ExecNonQuery("ALTER TABLE reparti ADD NF bit not NULL default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE reparti ADD Palmari bit not NULL default 0")
		Main.vSql1.ExecNonQuery("update reparti set NF =1 where codice = 0")
		Main.vSql1.ExecNonQuery("update reparti set Palmari =1 where codice = 98")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD memo nvarchar (200) not NULL default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD memo nvarchar (200) not NULL default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE anagra ADD scop numeric(18, 2) Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE anagra ADD scov numeric(18, 2) Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE headmov ADD sospeso bit not NULL default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE venduto ADD sospeso bit not NULL default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE CausaliPagamenti ADD sospeso bit not NULL default 0")
		Main.vSql1.ExecNonQuery("CREATE TABLE Parameters (DataPro datetime NULL)")
		Main.vSql1.ExecNonQuery("CREATE TABLE GruppiVariazioniArt (codint nvarchar (20) not NULL default '' ,reparto int not NULL default 1  , chiave INTEGER PRIMARY KEY )")
		Main.vSql1.ExecNonQuery("ALTER TABLE anagra ADD bvar bit not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from Parameters") = 0 Then
			Main.vSql1.ExecNonQuery("insert into Parameters(DataPro) values('01/01/1990')")
		End If
		Main.vSql2.ExecNonQuery("ALTER TABLE headmov ADD sospeso bit not NULL default 0")
		Main.vSql2.ExecNonQuery("ALTER TABLE venduto ADD sospeso bit not NULL default 0")
		Main.vSql2.ExecNonQuery("ALTER TABLE CausaliPagamenti ADD sospeso bit not NULL default 0")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD memo nvarchar (200) not NULL default ''")
		Main.vSql2.ExecNonQuery("CREATE TABLE reparti (codice Int PRIMARY KEY ,descrizione nvarchar (50) Not Null default '')")
		Main.vSql2.ExecNonQuery("CREATE TABLE iva (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '')")
		Dim i8 As Int
		For i8 = 0 To 9
			Main.vSql2.ExecNonQuery("insert into iva(codice,descrizione) values(" & i8 & ",'iva " & i8 & "')")
		Next
		Dim i9 As Int
		For i9 = 0 To 99
			Main.vSql2.ExecNonQuery("insert into reparti(codice,descrizione) values(" & i9 & ",'Reparto " & i9 & "')")
		Next
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from progressivi where codice ='SEND'") = 0 Then
			Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('SEND',0)")
		End If
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from progressivi where codice ='RECEIVE'") = 0 Then
			Main.vSql1.ExecNonQuery("insert into progressivi(codice,valore) values('RECEIVE',0)")
		End If
		Main.vSql1.ExecNonQuery("CREATE TABLE headoff (codofferta int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',attiva bit not NULL default 0)")
		Dim i10 As Int
		For i10 = 0 To 9
			Main.vSql1.ExecNonQuery("insert into headoff(codofferta,descrizione) values(" & i10 & ",'Offerta " & i10 & "')")
		Next
		DoEvents
		Main.vSql1.ExecNonQuery("CREATE TABLE dettoff (codofferta int NULL ,codint nvarchar (20) null ,descrizione nvarchar (50) not NULL default '',scop numeric(18, 2) Not Null default 0,scop2 numeric(18, 2) Not Null default 0,scov numeric(18, 2) Not Null default 0,scov2 numeric(18, 2) Not Null default 0,prezzo numeric(18, 2) Not Null default 0,prezzo2 numeric(18, 2) Not Null default 0,attiva Bit Not Null default 0,chiave INTEGER PRIMARY KEY)")
		Main.vSql1.ExecNonQuery("ALTER TABLE pagine ADD colorec int not NULL default -10")
		Main.vSql1.ExecNonQuery("ALTER TABLE pagine ADD colores int not NULL default -10")
		Main.vSql1.ExecNonQuery("ALTER TABLE pagine ADD coloret int not NULL default -10")
		Main.vSql1.ExecNonQuery("ALTER TABLE pagine ADD importo numeric(18, 2) not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE pagine ADD textsize int not NULL default 0")
		Main.vSql1.ExecNonQuery("update pagine set importo =0 where importo is null")
		Main.vSql1.ExecNonQuery("CREATE TABLE Cassetto (Operatore Int Not Null default 1, TipoAttivita Char(1)  Null,Importo numeric(18, 2) Null,  DataOra DateTime Null,  chiave INTEGER PRIMARY KEY,  TipoMoneta Int Null,Qta numeric(18, 0) Null,  PrezzoUnitario numeric(18, 2) Null,  NumDistinta numeric(18, 0) Null,  Cassa Int Not Null DEFAULT 1)")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD QtaConDecimali numeric(18, 3) Null")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD QtaConDecimali numeric(18, 3) Null ")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD des2 nvarchar (50) not NULL default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Anagra ADD des2 nvarchar (50) not NULL default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD des2 nvarchar (50) not NULL default '' ")
		Main.vSql1.ExecNonQuery("ALTER TABLE Anagra ADD des1 [nvarchar] (10) Not Null default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD des1 [nvarchar] (10) Not Null default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD des1 [nvarchar] (10) Not Null default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Anagra ADD Style [nvarchar] (10) Not Null default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD Style [nvarchar] (10) Not Null default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD Style [nvarchar] (10) Not Null default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD totcre [nvarchar] (10) Not Null default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD totcre [nvarchar] (10) Not Null default ''")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD importo2 numeric(18, 2) Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD importo2 numeric(18, 2) Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD Qtad int Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD importod numeric(18, 2) Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE Ventmp ADD scovd numeric(18, 2) Not Null default 0")
		DoEvents
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD Qtad int Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD importod numeric(18, 2) Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE Venduto ADD scovd numeric(18, 2) Not Null default 0")
		Main.vSql1.ExecNonQuery("ALTER TABLE operatori ADD pagdefault int not NULL default 1")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD QtaConDecimali numeric(18, 3) Null")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD des2 nvarchar (50) not NULL default '' ")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD des1 [nvarchar] (10) Not Null default ''")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD Style [nvarchar] (10) Not Null default ''")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD totcre [nvarchar] (10) Not Null default ''")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD importo2 numeric(18, 2) Not Null default 0")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD Qtad int Not Null default 0")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD importod numeric(18, 2) Not Null default 0")
		Main.vSql2.ExecNonQuery("ALTER TABLE Venduto ADD scovd numeric(18, 2) Not Null default 0")
		Main.vSql1.ExecNonQuery("CREATE TABLE MenuCard" & TAB & "(" & TAB & "chiave INTEGER PRIMARY KEY," & TAB & "Serial nvarchar(15) NULL," & TAB & "Scancode int NULL,Descrizione nvarchar(50) NULL,Tipo nvarchar(3) NULL," & TAB & "Codice nvarchar(20) NULL,LocationSize nvarchar(50) not NULL default '',Image nvarchar(10) not NULL default '',BtnStyle nvarchar(50) not NULL default ''" & TAB & ")")
		list.Initialize
		Dim i11 As Int
		For i11 = 0 To 50
			map.Initialize
			map.Put("Scancode", i11)
			map.Put("Descrizione", "")
			map.Put("Tipo", "PLU")
			map.Put("Codice", i11)
			map.Put("LocationSize", "1,1")
			map.Put("BtnStyle", "")
			list.Add(map)
		Next
		dbutil.Sub007(Main.vSql1, "MenuCard", list)
		Main.vSql1.ExecNonQuery("CREATE TABLE Palmari (  Serial nvarchar(15)  NULL,  Operatore int not NULL default 1,  chiave INTEGER PRIMARY KEY,DateLastLogin datetime NULL,  NeedUpd Bit Not Null default 0,Attivo Bit Not Null default 0,  TipoLogin Int Not Null default 0 ,  ObbligoCoperto Bit Not Null DEFAULT 0 ,  Preconto Int Not Null DEFAULT 0 )")
		list.Initialize
		Dim i12 As Int
		For i12 = 1 To 6
			Main.vSql1.ExecNonQuery("Insert into " & TAB & "Palmari(Serial) values(1000" & i12 & ")")
		Next
		DoEvents
		Sub042(1)
		DoEvents
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub045(i As Int, buttonWrapper As Button, i2 As Int, str As String) As Panel
	vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		buttonWrapper.RemoveView
		buttonWrapper.Background = Sub155(i2, 20)
		If str <> "" Then
			Dim imageViewWrapper As ImageView
			imageViewWrapper.Initialize("bHelp")
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
			imageViewWrapper.Visible = str <> "NO" And buttonWrapper.Visible
			panelWrapper.AddView(buttonWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(44), i)
			panelWrapper.AddView(imageViewWrapper, PerXToCurrent(44), DipToCurrent(0), PerXToCurrent(6), i)
		Else
			panelWrapper.AddView(buttonWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(48), i)
		End If
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub046(i As Int, editTextWrapper As EditText) As Panel
	vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		editTextWrapper.RemoveView
		panelWrapper.AddView(editTextWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(49), i)
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub047(i As Int, checkBoxWrapper As CheckBox, i2 As Int) As Panel
	vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		checkBoxWrapper.RemoveView
		checkBoxWrapper.Color = i2
		panelWrapper.AddView(checkBoxWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(49), i)
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub048(i As Int, str As String) As Panel
	vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.Text = str
		labelWrapper.TextSize = 20
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.TextColor = -12303292
		panelWrapper.AddView(labelWrapper, PerXToCurrent(5), DipToCurrent(0), PerXToCurrent(45), i)
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub049(i As Int, str As String, labelWrapper As Label) As Panel
	vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		labelWrapper.Text = str
		labelWrapper.TextSize = 20
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.TextColor = -12303292
		panelWrapper.AddView(labelWrapper, PerXToCurrent(5), DipToCurrent(0), PerXToCurrent(45), i)
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub050(i As Int, labelWrapper As Label, i2 As Int, str As String) As Panel
	vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		labelWrapper.RemoveView
		labelWrapper.Background = Sub157(i2, 20, 2)
		labelWrapper.Gravity = Bit.Or(16, 1)
		If str <> "" Then
			Dim imageViewWrapper As ImageView
			imageViewWrapper.Initialize("bHelp")
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
			imageViewWrapper.Visible = str <> "NO" And labelWrapper.Visible
			panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(44), i)
			panelWrapper.AddView(imageViewWrapper, PerXToCurrent(44), DipToCurrent(0), PerXToCurrent(6), i)
		Else
			panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(48), i)
		End If
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub051(i As Int, labelWrapper As Label, buttonWrapper As Button, i2 As Int) As Panel
	vStr2 = "CreateListItemLBLeEDT"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		buttonWrapper.RemoveView
		buttonWrapper.Background = Sub155(i2, 20)
		labelWrapper.RemoveView
		labelWrapper.Color = 0
		panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(15), i)
		panelWrapper.AddView(buttonWrapper, PerXToCurrent(16), DipToCurrent(0), PerXToCurrent(34), i)
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub052(i As Int, labelWrapper As Label, editTextWrapper As EditText) As Panel
	vStr2 = "CreateListItemLBLeEDT"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		editTextWrapper.RemoveView
		labelWrapper.RemoveView
		labelWrapper.Color = 0
		panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(15), i)
		panelWrapper.AddView(editTextWrapper, PerXToCurrent(16), DipToCurrent(0), PerXToCurrent(34), i)
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub053(i As Int, labelWrapper As Label, spinnerWrapper As Spinner, i2 As Int) As Panel
	vStr2 = "CreateListItemLBLeEDT"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		spinnerWrapper.RemoveView
		spinnerWrapper.Color = i2
		labelWrapper.RemoveView
		labelWrapper.Color = 0
		panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(15), i)
		panelWrapper.AddView(spinnerWrapper, PerXToCurrent(16), DipToCurrent(0), PerXToCurrent(34), i)
	Catch
		Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub054(bitmapWrapper As Bitmap, i As Int, i2 As Int) As Bitmap
	Dim reflection As Reflector
	Return reflection.RunStaticMethod("android.graphics.Bitmap", "createScaledBitmap", Array(bitmapWrapper, i, i2, True), Array As String("android.graphics.Bitmap", "java.lang.int", "java.lang.int", "java.lang.boolean"))
End Sub

Sub Sub055(j As Long) As String
	Dim str As String
	Dim str2 As String = ""
	Try
		str2 = j
		Dim length As Int = str2.Length - 1
		str = ""
		Dim i As Int = 0
		Do While i <= length
			Dim vRnd As Int = Rnd(0, 10)
			Dim str3 As String = str & "labcdefghil".SubString2(vRnd, vRnd + 1) & "labcdefghil".SubString2(str2.SubString2(i, i + 1), str2.SubString2(i, i + 1) + 1)
			i = i + 1
			str = str3
		Loop
	Catch
		str = str2
		If Not( = Null) Then
			 = 
		End If
	End Try
	Return str
End Sub

Sub Sub056(str As String) As Double
	If str.IndexOf(".") >= 0 Then
		Return Round2(modfunstr.Sub006(str), 2)
	End If
	If Main.v_consideraprzintero Then
		Return modfunstr.Sub006(str)
	End If
	Return modfunstr.Sub006(str) / 100
End Sub

Sub Sub057(str As String) As String
	Return str.SubString2(6, 10) & "-" & str.SubString2(0, 2) & "-" & str.SubString2(3, 5) & " " & str.SubString(11)
End Sub

Sub Sub058 As Long
	If Main.v_dataoranoroot Then
		If Main.vPeriod1.Minutes <> 0 Then
			Dim now As Long = DateTime.Now
			Return DateUtils.addperiod(now, Main.vPeriod1)
		End If
	End If
	Return DateTime.Now
End Sub

Sub Sub059(j As Long) As String
	Return NumberFormat2(DateTime.GetYear(j), 4, 0, 0, False) & NumberFormat2(DateTime.GetMonth(j), 2, 0, 0, False) & NumberFormat2(DateTime.GetDayOfMonth(j), 2, 0, 0, False) & NumberFormat2(DateTime.GetHour(j), 2, 0, 0, False) & NumberFormat2(DateTime.GetMinute(j), 2, 0, 0, False) & NumberFormat2(DateTime.GetSecond(j), 2, 0, 0, False)
End Sub

Sub Sub060(j As Long) As String
	Return NumberFormat2(DateTime.GetYear(j), 4, 0, 0, False) & "/" & NumberFormat2(DateTime.GetMonth(j), 2, 0, 0, False) & "/" & NumberFormat2(DateTime.GetDayOfMonth(j), 2, 0, 0, False) & " " & NumberFormat2(DateTime.GetHour(j), 2, 0, 0, False) & ":" & NumberFormat2(DateTime.GetMinute(j), 2, 0, 0, False) & ":" & NumberFormat2(DateTime.GetSecond(j), 2, 0, 0, False)
End Sub

Sub Sub061(j As Long) As String
	Return NumberFormat2(DateTime.GetDayOfMonth(j), 2, 0, 0, False) & "/" & NumberFormat2(DateTime.GetMonth(j), 2, 0, 0, False) & "/" & NumberFormat2(DateTime.GetYear(j), 4, 0, 0, False) & " " & NumberFormat2(DateTime.GetHour(j), 2, 0, 0, False) & ":" & NumberFormat2(DateTime.GetMinute(j), 2, 0, 0, False) & "." & NumberFormat2(DateTime.GetSecond(j), 2, 0, 0, False)
End Sub

Sub Sub062(str As String) As String
	Try
		Dim bArr(0) As Byte
		Dim bArr2(0) As Byte
		Dim byteConverter As ByteConverter
		Dim keyGeneratorWrapper As KeyGenerator
		Dim cipherWrapper As Cipher
		cipherWrapper.Initialize("DES/CBC/PKCS5Padding")
		cipherWrapper.InitialisationVector = Array As Byte(21, 32, 43, 54, 65, 76, 87, 98)
		keyGeneratorWrapper.Initialize("DES")
		If vByteArr1.Length = 0 Then
			vByteArr1 = byteConverter.StringToBytes(File.ReadString(File.DirAssets, "01-01-StrutturaRicevuta.txt"), "UTF8")
		End If
		keyGeneratorWrapper.KeyFromBytes(vByteArr1)
		Return byteConverter.StringFromBytes(cipherWrapper.Decrypt(byteConverter.HexToBytes(str), keyGeneratorWrapper.Key, True), "UTF8").ToUpperCase.Trim
	Catch
		Sub217(LastException.Message)
		Return ""
	End Try
End Sub

Sub Sub063(i As Int)
	Main.vSql2.ExecNonQuery("delete from unlocktbl where tavolo = " & i)
End Sub

Sub Sub064
	Dim javaObject As JavaObject
	javaObject.InitializeStatic("android.os.Build.VERSION")
	If javaObject.GetField("SDK_INT") > 9 Then
		InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy", Array(InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder", Null).RunMethodJO("permitAll", Null).RunMethodJO("build", Null)))
		Return
	End If
End Sub

Sub Sub065(obj As Object, str As String) As httpjob
	Dim httpjobVar As httpjob
	If Not( = Null) Then
		 = 
	End If
	httpjobVar.Initialize("", obj)
	httpjobVar.Sub004(str)
	Return httpjobVar
End Sub

Sub Sub066(str As String, i As Int, str2 As String)
	Main.vSql1.ExecNonQuery("CREATE TEMPORARY TABLE tmp AS SELECT * FROM Ventmp where chiave=" & str)
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select max(chiave) from Ventmp") + 1
	Main.vSql1.ExecNonQuery("UPDATE tmp SET chiave=" & parseDouble & str2 & ",scov=0,scop=0, qta=" & i)
	Main.vSql1.ExecNonQuery("INSERT INTO Ventmp SELECT * FROM tmp")
	Main.vSql1.ExecNonQuery("DROP TABLE tmp")
End Sub

Sub Sub067(editTextWrapper As EditText, i As Int)
	editTextWrapper.RunMethod("setCompoundDrawablesWithIntrinsicBounds", Array(Sub130(i), Null, Null, Null))
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m6… (riga 4282).
Sub Sub068(sql As SQL, str As String, z As Boolean, map As Map, str2 As String, z2 As Boolean, activityWrapper As Activity) As String
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor
	Dim exc As Exception
	Dim z3 As Boolean
	Dim replace As String
	Dim sb As String
	Dim replace2 As String
	Dim cursorWrapper3 As Cursor
	Dim upperCase As String
	Dim replace3 As String
	Dim replace4 As String
	Dim replace5 As String
	Dim replace6 As String
	Dim replace7 As String
	Dim vExecQuerySingleResult As String
	Dim replace8 As String
	Dim trim As String
	Dim replace9 As String
	Dim replace10 As String
	Dim replace11 As String
	Dim replace12 As String
	Dim replace13 As String
	Dim vObjectToString As String
	Dim replace14 As String
	Dim vObjectToString2 As String
	Dim replace15 As String
	Dim replace16 As String
	Dim vObjectToString3 As String
	Dim replace17 As String
	Dim replace18 As String
	Dim replace19 As String
	Dim replace20 As String
	Dim replace21 As String
	Dim vObjectToString4 As String
	Dim replace22 As String
	Dim vObjectToString5 As String
	Dim replace23 As String
	Dim vObjectToString6 As String
	Dim replace24 As String
	Dim cursorWrapper4 As Cursor
	Dim i As Int
	Dim str3 As String
	Dim i2 As Int
	Dim rowCount As Int
	Dim i3 As Int
	Dim i4 As Int
	Dim z4 As Boolean
	Dim str4 As String
	Dim replace25 As String
	Dim replace26 As String
	Dim replace27 As String
	Dim d As Double
	Dim replace28 As String
	Dim replace29 As String
	Dim vGetString As String
	Dim replace30 As String
	Dim str5 As String
	Dim replace31 As String
	Dim replace32 As String
	Dim d2 As Double
	Dim vNumberFormat2 As String
	Dim vNumberFormat22 As String
	Dim str6 As String
	Dim replace33 As String
	Dim replace34 As String
	Dim z5 As Boolean
	Dim replace35 As String
	Dim replace36 As String
	Dim replace37 As String
	Dim replace38 As String
	Dim sb3 As String = File.DirDefaultExternal & "/FE"
	Dim str7 As String = ""
	Try
		'cursorWrapper2 = Cursor
		Try
			'cursorWrapper = Cursor
			Try
				Dim textWriterWrapper As TextWriter
				Dim vObjectToNumber As Int = IIf(map.GetDefault("TipoDoc", "") = "TD04", -1, 1)
				cursorWrapper2 = sql.ExecQuery("select totale*" & vObjectToNumber & " as totale,cliente from  headmov as h where @NumeroDoc@")
				If cursorWrapper2.RowCount > 0 Then
					cursorWrapper2.Position = 0
					Dim trim2 As String = map.GetDefault("EsigibilitaIVA", "").Trim
					Try
						If z Then
							If Main.vSql2.ExecQuerySingleResult("Select count(*) from sqlite_temp_master where name='TmpFattFM'") > 0 Then
								z3 = True
								replace = map.GetDefault("Sezionale", "").Replace("/", "").Replace("\", "").Replace(">", "").Replace("<", "").Replace(":", "").Replace("*", "").Replace("?", "").Replace(QUOTE, "").Replace("@", "").Replace(CRLF, "")
								If replace = "" Then
									replace = "-"
								End If
								sb = "FE_" & str2 & " " & DateTime.Time(DateTime.Now) & "_" & map.GetDefault("NumeroDoc", "") & "_" & replace & "_" & map.GetDefault("ProgInvio", "") & ".xml"
								vStr6 = sb.Replace(":", "-")
								If File.Exists(vStr7, "Tmp.MF") Then
									File.Copy(vStr7, "Tmp.MF", vStr7, vStr6.Replace(".xml", ".MF"))
									File.Delete(vStr7, "Tmp.MF")
								End If
								If File.Exists(vStr7, "Tmp.txt") Then
									File.Copy(vStr7, "Tmp.txt", vStr7, vStr6.Replace(".xml", ".txt"))
									File.Delete(vStr7, "Tmp.txt")
								End If
								If File.Exists(vStr7, "Tmp.NF") Then
									File.Copy(vStr7, "Tmp.NF", vStr7, vStr6.Replace(".xml", ".NF"))
									File.Delete(vStr7, "Tmp.NF")
								End If
								Dim vObjectToString7 As String = Main.vMap3.GetDefault("01-00-StrutturaFattura", "")
								Dim replace39 As String = vObjectToString7.Replace("@_Header_@", Main.vMap3.GetDefault("01-01-00-Header", ""))
								If Main.vCur7.GetString("IDPaeseTX") <> "" Then
									If Main.vCur7.GetString("CodiceTX") <> "" Then
										Dim replace40 As String = replace39.Replace("@_IDPaeseTrasmittente_@", Main.vCur7.GetString("IDPaeseTX"))
										replace2 = replace40.Replace("@_CodiceTrasmittente_@", Main.vCur7.GetString("CodiceTX").ToUpperCase).Replace("@_ProgInvio_@", map.GetDefault("ProgInvio", ""))
										Dim cursorWrapper5 As Cursor
										cursorWrapper3 = Main.vSql1.ExecQuery("select * from FEdatiCli where codice ='" & cursorWrapper2.GetString("cliente") & "'")
										cursorWrapper3.Position = 0
										Select cursorWrapper3.GetInt("TipoSoggettoCli")
											Case 0, 1, 2, 4
												replace2 = replace2.Replace("@_FormatoTrasmissione_@", "FPR12")
											Case 3, 5
												replace2 = replace2.Replace("@_FormatoTrasmissione_@", "FPA12")
										End Select
										upperCase = cursorWrapper3.GetString("CodiceDestinatario").ToUpperCase
										If cursorWrapper3.GetString("NazioneCli") = "" And cursorWrapper3.GetString("NazioneCli") <> "IT" And upperCase = "0000000" Then
											upperCase = "XXXXXXX"
										Else If cursorWrapper3.GetString("NazioneCli") = "IT" And upperCase = "XXXXXXX" Then
											upperCase = "0000000"
										End If
										replace3 = replace2.Replace("@_CodDestinatario_@", Sub148(upperCase.Trim))
										If upperCase.Trim <> "0000000" And cursorWrapper3.GetString("PEC").Trim <> "" Then
											replace4 = replace3.Replace("@_BloccoPEC_@", Main.vMap3.GetDefault("01-01-01-PEC", "")).Replace("@_PECDestinatario_@", Sub148(cursorWrapper3.GetString("PEC").Trim))
										Else
											replace4 = replace3.Replace("@_BloccoPEC_@", "")
										End If
										If Main.vCur7.GetInt("TipoEser") <> 0 Then
											If Main.vCur7.GetInt("TipoEser") <> 4 Then
												Dim replace41 As String = replace4.Replace("@_BloccoIDFiscaleIVAFornitore_@", Main.vMap3.GetDefault("01-01-11-BloccoIDFiscaleIVAFornitore", ""))
												Dim replace42 As String = replace41.Replace("@_IDPaeseFornitore_@", Main.vCur7.GetString("IDNazioneEser").Trim)
												replace5 = replace42.Replace("@_CodiceFornitore_@", Main.vCur7.GetString("CodForn").Trim)
												If Main.vCur7.GetString("CFEser").Trim = "" Then
													Dim replace43 As String = replace5.Replace("@_CodF-Fornitore_@", Main.vMap3.GetDefault("01-01-02-CFFornitore", ""))
													replace6 = replace43.Replace("@_CFFornitore_@", Main.vCur7.GetString("CFEser").Trim.ToUpperCase)
												Else
													replace6 = replace5.Replace("@_CodF-Fornitore_@", "")
												End If
												If Main.vCur7.GetString("DenEser").Trim <> "" Then
													Dim replace44 As String = replace6.Replace("@_AnagraficaFornitore_@", Main.vMap3.GetDefault("01-01-04-AnagraficaFornitoreNC", ""))
													Dim replace45 As String = replace44.Replace("@_NomeFornitore_@", Sub148(Main.vCur7.GetString("NomeEser").Trim))
													replace7 = replace45.Replace("@_CognomeFornitore_@", Sub148(Main.vCur7.GetString("CognomeEser").Trim))
												Else
													Dim replace46 As String = replace6.Replace("@_AnagraficaFornitore_@", Main.vMap3.GetDefault("01-01-03-AnagraficaFornitoreDen", ""))
													replace7 = replace46.Replace("@_DenominazioneFornitore_@", Sub148(Main.vCur7.GetString("DenEser").Trim))
												End If
												vExecQuerySingleResult = Main.vSql1.ExecQuerySingleResult("Select Sigla from FERegFiscale where Codice =" & Main.vCur7.GetString("RegFiscEser"))
												If Not(vExecQuerySingleResult = Null) Or vExecQuerySingleResult = "" Then
													vExecQuerySingleResult = "RF01"
												End If
												Dim replace47 As String = replace7.Replace("@_RegimeFiscale_@", vExecQuerySingleResult.Trim.ToUpperCase)
												replace8 = replace47.Replace("@_IndirizzoFornitore_@", Sub148(Main.vCur7.GetString("ViaEser").Trim))
												trim = Main.vCur7.GetString("CapEser").Trim
												If Not(IsNumber(trim)) And trim.Length = 5 Then
													replace9 = replace8.Replace("@_CAPFornitore_@", Main.vCur7.GetString("CapEser").Trim)
												Else
													replace9 = replace8.Replace("@_CAPFornitore_@", "00000")
												End If
												Dim replace48 As String = replace9.Replace("@_ComuneFornitore_@", Sub148(Main.vCur7.GetString("CittaEser").Trim))
												If Main.vCur7.GetString("NazioneEser").Trim.ToUpperCase <> "IT" Then
													Dim replace49 As String = replace48.Replace("@_BloccoProvinciaFornitore_@", Main.vMap3.GetDefault("01-01-09-BloccoProvinciaFornitore", ""))
													replace10 = replace49.Replace("@_ProvinciaFornitore_@", Sub148(Main.vCur7.GetString("ProvinciaEser").Trim.ToUpperCase))
												Else
													replace10 = replace48.Replace("@_BloccoProvinciaFornitore_@", "")
												End If
												Dim replace50 As String = replace10.Replace("@_NazioneFornitore_@", Main.vCur7.GetString("NazioneEser").Trim.ToUpperCase)
												If Main.vCur7.GetString("NumeroREA").Trim = "" Then
													Dim replace51 As String = replace50.Replace("@_BloccoREA_@", Main.vMap3.GetDefault("01-01-05-00-BloccoREA", ""))
													Dim replace52 As String = replace51.Replace("@_UfficioREA_@", Sub148(Main.vCur7.GetString("UfficioREA").ToUpperCase))
													Dim replace53 As String = replace52.Replace("@_NumeroREA_@", Sub148(Main.vCur7.GetString("NumeroREA")))
													If Main.vCur7.GetString("CapSocREA").Trim <> "" Then
														Dim replace54 As String = replace53.Replace("@_BloccoCapitaleSocialeREA_@", Main.vMap3.GetDefault("01-01-05-01-CapitaleSocialeREA", ""))
														replace37 = replace54.Replace("@_CapitaleSociale_@", NumberFormat2(Main.vCur7.GetDouble("CapSocREA"), 1, 2, 2, False))
													Else
														replace37 = replace53.Replace("@_BloccoCapitaleSocialeREA_@", "")
													End If
													If Main.vCur7.GetString("SocUnicoREA").Trim <> "0" Then
														If Main.vCur7.GetInt("TipoEser") = 2 Then
															Dim replace55 As String = replace37.Replace("@_BloccoSocioUnicoREA_@", Main.vMap3.GetDefault("01-01-05-02-SocioUnicoREA", ""))
															If Main.vCur7.GetString("SocUnicoREA").Trim = "1" Then
																replace38 = replace55.Replace("@_SocioUnico_@", "SU")
															Else
																replace38 = replace55.Replace("@_SocioUnico_@", "SM")
															End If
															If Main.vCur7.GetInt("TipoEser") = 2 Then
																replace11 = replace38.Replace("@_StatoLiquidazione_@", "LN")
															Else
																If Main.vCur7.GetString("StatoLiquidazioneREA").Trim = "0" Then
																	replace11 = replace38.Replace("@_StatoLiquidazione_@", "LN")
																Else
																	replace11 = replace38.Replace("@_StatoLiquidazione_@", "LS")
																End If
															End If
														End If
													End If
													replace38 = replace37.Replace("@_BloccoSocioUnicoREA_@", "")
													If Main.vCur7.GetInt("TipoEser") = 2 Then
													End If
												Else
													replace11 = replace50.Replace("@_BloccoREA_@", "")
												End If
												If Main.vCur7.GetInt("TerzoTipoEser") > 0 Then
													If Main.vCur7.GetString("TerzoDenEser") <> "" Then
														Dim replace56 As String = replace11.Replace("@_TerzoIntermediarioOSoggettoEmittente_@", Main.vMap3.GetDefault("01-01-10-00-BloccoTerzoIntermediario", ""))
														If Main.vCur7.GetInt("TerzoTipoEser") <> 4 Then
															Dim replace57 As String = replace56.Replace("@_BloccoIDFiscaleIVA-TerzoIntermediario_@", Main.vMap3.GetDefault("01-01-10-01-Blocco-IDFiscaleIVA-TerzoIntermediario", ""))
															If Main.vCur7.GetString("TerzoIDPaeseTX") <> "" Then
																If Main.vCur7.GetString("TerzoCodiceTX") <> "" Then
																	Dim replace58 As String = replace57.Replace("@_IdPaeseTerzoIntermediario_@", Main.vCur7.GetString("TerzoIDPaeseTX").ToUpperCase)
																	replace35 = replace58.Replace("@_CodiceTerzoIntermediario_@", Main.vCur7.GetString("TerzoCodiceTX").ToUpperCase)
																End If
															End If
															replace35 = replace57.Replace("@_IdPaeseTerzoIntermediario_@", "").Replace("@_CodiceTerzoIntermediario_@", "")
														Else
															replace35 = replace56.Replace("@_BloccoIDFiscaleIVA-TerzoIntermediario_@", "")
														End If
														If Main.vCur7.GetString("TerzoCFEser") <> "" Then
															Dim replace59 As String = replace35.Replace("@_BloccoCodF-TerzoIntermediario_@", Main.vMap3.GetDefault("01-01-10-02-Blocco-CF-TerzoIntermediario", ""))
															replace36 = replace59.Replace("@_CFTerzoIntermediario_@", Main.vCur7.GetString("TerzoCFEser").ToUpperCase)
														Else
															replace36 = replace35.Replace("@_BloccoCodF-TerzoIntermediario_@", "")
														End If
														Dim replace60 As String = replace36.Replace("@_AnagraficaTerzoIntermediario_@", Main.vMap3.GetDefault("01-01-10-03-Blocco-Anagrafica-TerzoIntermediario-Denominazione", ""))
														replace12 = replace60.Replace("@_DenominazioneTerzoIntermediario_@", Sub148(Main.vCur7.GetString("TerzoDenEser").ToUpperCase))
														If cursorWrapper3.GetInt("TipoSoggettoCli") = 0 And cursorWrapper3.GetInt("TipoSoggettoCli") <> 4 And cursorWrapper3.GetInt("TipoSoggettoCli") <> 5 Then
															Dim replace61 As String = replace12.Replace("@_BloccoIDFiscaleIVACliente_@", Main.vMap3.GetDefault("01-01-12-BloccoIDFiscaleIVACliente", ""))
															Dim upperCase2 As String = map.GetDefault("IDPaeseCli", "").Trim.ToUpperCase
															replace13 = replace61.Replace("@_IDPaeseCliente_@", upperCase2).Replace("@_CodiceCliente_@", map.GetDefault("CodCli", "").Trim.ToUpperCase.Replace(upperCase2, ""))
														Else
															replace13 = replace12.Replace("@_BloccoIDFiscaleIVACliente_@", "")
														End If
														vObjectToString = map.GetDefault("CFCli", "")
														If vObjectToString.Trim <> "" Then
															replace14 = replace13.Replace("@_CodF-Cliente_@", Main.vMap3.GetDefault("01-01-06-CFCliente", "")).Replace("@_CodiceFiscaleCliente_@", vObjectToString.Trim.ToUpperCase.Replace("_", ""))
														Else
															replace14 = replace13.Replace("@_CodF-Cliente_@", "")
														End If
														vObjectToString2 = map.GetDefault("DenominazioneCli", "")
														If vObjectToString2.Trim = "" Then
															replace15 = replace14.Replace("@_AnagraficaCliente_@", Main.vMap3.GetDefault("01-01-08-AnagraficaClienteNC", "")).Replace("@_NomeCliente_@", Sub148(map.GetDefault("NomeCli", "").Trim)).Replace("@_CognomeCliente_@", Sub148(map.GetDefault("CognomeCli", "").Trim))
														Else
															replace15 = replace14.Replace("@_AnagraficaCliente_@", Main.vMap3.GetDefault("01-01-07-AnagraficaClienteDen", "")).Replace("@_DenominazioneCliente_@", Sub148(vObjectToString2.Trim))
														End If
														replace16 = replace15.Replace("@_IndirizzoCliente_@", Sub148(map.GetDefault("IndirizzoCli", "").Trim))
														vObjectToString3 = map.GetDefault("CAPCli", "")
														If Not(IsNumber(vObjectToString3)) And vObjectToString3.Length = 5 Then
															replace17 = replace16.Replace("@_CAPCliente_@", vObjectToString3.Trim)
														Else
															replace17 = replace16.Replace("@_CAPCliente_@", "00000")
														End If
														Dim replace62 As String = replace17.Replace("@_ComuneCliente_@", Sub148(map.GetDefault("ComuneCli", "").Trim))
														If map.GetDefault("NazioneCli", "").Trim.ToUpperCase = "IT" Then
															replace18 = replace62.Replace("@_BloccoProvinciaCliente_@", Main.vMap3.GetDefault("01-01-10-BloccoProvinciaCliente", "")).Replace("@_ProvinciaCliente_@", Sub148(map.GetDefault("ProvinciaCli", "").Trim.ToUpperCase))
														Else
															replace18 = replace62.Replace("@_BloccoProvinciaCliente_@", "")
														End If
														Dim replace63 As String = replace18.Replace("@_NazioneCliente_@", map.GetDefault("NazioneCli", "").Trim.ToUpperCase)
														Dim replace64 As String = replace63.Replace("@_Body_@", Main.vMap3.GetDefault("01-02-00-Body", "")).Replace("@_TipoDocumento_@", map.GetDefault("TipoDoc", "")).Trim.Replace("@_DivisaDocumento_@", "EUR").Trim.Replace("@_DataDocumento_@", map.GetDefault("DataDoc", "").Trim.SubString2(0, 10))
														Dim vObjectToString8 As String = map.GetDefault("NumeroDoc", "")
														If map.GetDefault("Sezionale", "") <> "" Then
															vObjectToString8 = vObjectToString8 & "/" & map.GetDefault("Sezionale", "")
														End If
														replace19 = replace64.Replace("@_NumeroDocumento_@", Sub148(vObjectToString8.Trim))
														If Not(map.GetDefault("BolloVirtuale", False)) And 0 <> map.GetDefault("ImportoBollo", "") Then
															replace20 = replace19.Replace("@_DatiBollo_@", Main.vMap3.GetDefault("01-02-01-DatiBollo", "")).Replace("@_BolloVirtuale_@", "SI").Replace("@_ImportoBollo_@", NumberFormat2(map.GetDefault("ImportoBollo", ""), 1, 2, 2, False))
														Else
															replace20 = replace19.Replace("@_DatiBollo_@", "")
														End If
														cursorWrapper = sql.ExecQuery("select case when sum(importo) is null then 0.00 else sum(importo) end as TotAbbuoni,case when sum(qta) is null then 0.00 else sum(qta) end as QtaAbbuoni from headmov as h inner join venduto as v on v.nmov=h.nmov where @NumeroDoc@ and codint='abb'".Replace("@NumeroDoc@", str))
														If cursorWrapper.RowCount <> 0 Then
															cursorWrapper.Position = 0
															replace21 = replace20.Replace("@_ScontoMaggiorazione_@", "")
														Else
															replace21 = replace20.Replace("@_ScontoMaggiorazione_@", "")
														End If
														cursorWrapper.Close
														If map.GetDefault("IDOrdAcq", "") = "" Or map.GetDefault("CUP", "") <> "" Or map.GetDefault("CIG", "") <> "" Then
															Dim replace65 As String = replace21.Replace("@_DatiOrdineAcquisto_@", Main.vMap3.GetDefault("01-02-03-DatiOrdineAcquisto", ""))
															vObjectToString4 = map.GetDefault("IDOrdAcq", "")
															If vObjectToString4 = "" Then
																replace22 = replace65.Replace("<IdDocumento>@_IDOrdAcquisto_@</IdDocumento>", "")
															Else
																replace22 = replace65.Replace("@_IDOrdAcquisto_@", Sub148(vObjectToString4.Trim))
															End If
															vObjectToString5 = map.GetDefault("CUP", "")
															If vObjectToString5 = "" Then
																replace23 = replace22.Replace("<CodiceCUP>@_CodiceCUP_@</CodiceCUP>", "")
															Else
																replace23 = replace22.Replace("@_CodiceCUP_@", Sub148(vObjectToString5.Trim))
															End If
															vObjectToString6 = map.GetDefault("CIG", "")
															If vObjectToString6 = "" Then
																replace24 = replace23.Replace("<CodiceCIG>@_CodiceCIG_@</CodiceCIG>", "")
															Else
																replace24 = replace23.Replace("@_CodiceCIG_@", Sub148(vObjectToString6.Trim))
															End If
														Else
															replace24 = replace21.Replace("@_DatiOrdineAcquisto_@", "")
														End If
														Dim replace66 As String = replace24.Replace("@_DatiDDT_@", "")
														Dim customprogressdialogVar As CustomProgressDialog
														If z Then
															Dim vPerYToCurrent As Double = PerYToCurrent(10)
															customprogressdialogVar._initialize(activityWrapper, PerXToCurrent(60), (PerXToCurrent(100) - PerXToCurrent(60)) / 2, vPerYToCurrent, "", "", -12303292, 0, "Progress", False)
														End If
														If z3 Then
															cursorWrapper4 = sql.ExecQuery("select * from TmpFattFM")
														Else
															cursorWrapper4 = sql.ExecQuery("select codint,descrizione,qta*" & vObjectToNumber & " as qta,prezzov,(importo)*" & vObjectToNumber & " as importo,aliquota2,scov,iva,h.nric,h.nChiusura,h.nscontrinoffm,h.dataeoraffm,h.matricolacassap,h.datam3,venduto.memo,venduto.brep from venduto inner join headmov As h on h.nmov= venduto.nmov where " & str & " order by h.nric ,venduto.chiave")
														End If
														Dim stringBuilderWrapper As StringBuilder
														stringBuilderWrapper.Initialize
														If cursorWrapper4.RowCount <= 150 Then
															i = 4
														Else
															i = 8
														End If
														str3 = ""
														i2 = -1
														rowCount = cursorWrapper4.RowCount - 1
														i3 = 0
														i4 = 1
														z4 = False
														Do While True
															Dim i5 As Int = i2
															If i3 <= rowCount Then
																cursorWrapper4.Position = i3
																If z And i3 Mod 30 = 0 Then
																	customprogressdialogVar._showprogress("Generazione xml in corso ...", -1, i3 * 100 / (cursorWrapper4.RowCount - 1))
																	DoEvents
																End If
																Dim z6 As Boolean = cursorWrapper4.GetString("codint") = "abb" Or (cursorWrapper4.GetDouble("importo") < 0 And cursorWrapper4.GetDouble("qta") > 0)
																Dim equals As Boolean = cursorWrapper4.GetString("codint") = "com"
																Dim equals2 As Boolean = cursorWrapper4.GetString("codint") = "pre"
																Dim replace67 As String = Main.vMap3.GetDefault("01-02-05-00-DettaglioLinee", "").Replace("@_NumRigaDettaglio_@", i4).Replace("@_BloccoTipoCessione_@", IIf(z4 Or (equals And cursorWrapper4.GetDouble("importo") < 0), CRLF & "        <TipoCessionePrestazione>SC</TipoCessionePrestazione>", "")).Replace("@_TipoCessioneAbbuono_@", IIf(z6, CRLF & "        <TipoCessionePrestazione>SC</TipoCessionePrestazione>", ""))
																If Not(Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where flgusointerno=1 and codint='" & SmartStringFormatter("", cursorWrapper4.GetString("codint")) & "'") > 0) And Not(cursorWrapper4.GetString("codint").StartsWith("mnu")) And Not(cursorWrapper4.GetString("codint").StartsWith("msg")) Then
																	replace29 = replace67.Replace("@_CodiceInterno_@", CRLF & "        <CodiceArticolo>" & CRLF & TAB & "        <CodiceTipo>Codice Interno</CodiceTipo>" & CRLF & TAB & "        <CodiceValore>" & SmartStringFormatter("", Sub148(cursorWrapper4.GetString("codint"))) & "</CodiceValore>" & TAB & TAB & CRLF & "         </CodiceArticolo>")
																Else
																	replace29 = replace67.Replace("@_CodiceInterno_@", "")
																End If
																If z4 Then
																	replace30 = replace29.Replace("@_DescrizioneDettaglio_@", "SCONTO")
																Else
																	If z3 Then
																		Dim vGetString2 As String = cursorWrapper4.GetString("datam")
																		If cursorWrapper4.GetInt("nric") = 0 Then
																			Dim vGetString3 As String = cursorWrapper4.GetString("nscontrinoffm")
																			If cursorWrapper4.GetInt("nChiusura") > 0 Then
																				vGetString3 = cursorWrapper4.GetString("nChiusura") & "-" & cursorWrapper4.GetString("nscontrinoffm")
																			End If
																			str5 = "SC." & vGetString3 & " del " & vGetString2.SubString2(3, 5) & "/" & vGetString2.SubString2(0, 2) & "/" & vGetString2.SubString2(6, 10) & " MF " & cursorWrapper4.GetString("matricolacassap")
																		Else
																			Dim vGetString4 As String = cursorWrapper4.GetString("datam")
																			str5 = "RIC." & cursorWrapper4.GetString("nric") & " del " & vGetString4.SubString2(3, 5) & "/" & vGetString4.SubString2(0, 2) & "/" & vGetString4.SubString2(6, 10)
																		End If
																		vGetString = str5 & " CORRISPETTIVO NON RISCOSSO"
																	Else
																		vGetString = cursorWrapper4.GetString("descrizione")
																		If cursorWrapper4.GetString("memo") <> "" Then
																			vGetString = vGetString & " - " & cursorWrapper4.GetString("memo")
																		End If
																	End If
																	replace30 = replace29.Replace("@_DescrizioneDettaglio_@", Sub148(vGetString))
																End If
																Dim doubleValue As Double = cursorWrapper4.GetDouble("qta")
																If (z6 And doubleValue < 0) Or (equals2 And doubleValue < 0) Then
																	doubleValue = doubleValue * -1
																End If
																Dim replace68 As String = NumberFormat2(doubleValue, 1, 3, 3, False).Replace(",", ".")
																If z4 Or equals Then
																	replace31 = replace30.Replace("<Quantita>@_QuantitaDettaglio_@</Quantita>", "")
																Else
																	replace31 = replace30.Replace("@_QuantitaDettaglio_@", replace68)
																End If
																Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("Select um.descrizione from anagra inner join um on um.codice = anagra.misura where codint = '" & cursorWrapper4.GetString("codint") & "'")
																If vExecQuerySingleResult2 = Null Or vExecQuerySingleResult2.Trim = "" Then
																	vExecQuerySingleResult2 = "Pezzo"
																End If
																If vExecQuerySingleResult2.Trim <> "-" And vExecQuerySingleResult2.Trim <> "" And Not(z4) And cursorWrapper4.GetInt("brep") = 0 And Not(equals) Then
																	replace32 = replace31.Replace("@_BloccoUnitaMisura_@", Main.vMap3.GetDefault("01-02-05-03-BloccoUnitaMisura", "")).Replace("@_UnitaMisura_@", Sub148(vExecQuerySingleResult2))
																Else
																	replace32 = replace31.Replace("@_BloccoUnitaMisura_@", "")
																End If
																Dim vAbs As Double = Abs(Round2((cursorWrapper4.GetDouble("importo") + cursorWrapper4.GetDouble("scov")) / cursorWrapper4.GetDouble("qta"), i))
																Dim doubleValue2 As Double = cursorWrapper4.GetDouble("aliquota2")
																If z3 Then
																	Main.vCur4.Position = cursorWrapper4.GetInt("iva")
																	d2 = Main.vCur4.GetDouble("aliquota2")
																Else
																	d2 = doubleValue2
																End If
																Dim d3 As Double = 100 * vAbs / (100 + d2)
																Dim doubleValue3 As Double = cursorWrapper4.GetDouble("scov")
																Dim doubleValue4 As Double = doubleValue3 / cursorWrapper4.GetDouble("qta") * 100 / (100 + d2)
																If z4 Then
																	vNumberFormat2 = NumberFormat2(cursorWrapper4.GetDouble("qta") * doubleValue4 * 1, 1, i, i, False)
																Else
																	If (z6 Or ((equals And cursorWrapper4.GetDouble("importo") < 0) Or (equals2 And cursorWrapper4.GetDouble("importo") < 0))) And d3 > 0 Then
																		d3 = d3 * -1
																	End If
																	vNumberFormat2 = NumberFormat2(d3, 1, i, i, False)
																End If
																Dim parseDouble As Double = vNumberFormat2
																Dim replace69 As String = replace32.Replace("@_PrezzoUnitario_@", vNumberFormat2.Replace(",", "."))
																If z4 Then
																	vNumberFormat22 = NumberFormat2(cursorWrapper4.GetDouble("qta") * doubleValue4 * 1, 1, i, i, False)
																Else
																	Dim doubleValue5 As Double = cursorWrapper4.GetDouble("qta") * parseDouble
																	If (z6 And cursorWrapper4.GetDouble("qta") < 0) Or ((equals2 Or equals) And cursorWrapper4.GetDouble("importo") < 0 And doubleValue5 > 0) Then
																		doubleValue5 = doubleValue5 * -1
																	End If
																	vNumberFormat22 = NumberFormat2(doubleValue5, 1, i, i, False)
																End If
																Dim replace70 As String = replace69.Replace("@_PrezzoTotLinea_@", vNumberFormat22.Replace(",", "."))
																Dim replace71 As String = NumberFormat2(d2, 1, 2, 2, False).Replace(",", ".")
																If str3 = "" Then
																	i2 = cursorWrapper4.GetInt("iva")
																	str6 = replace71
																Else
																	i2 = i5
																	str6 = str3
																End If
																Dim replace72 As String = replace70.Replace("@_AliquotaLinea_@", replace71)
																If d2 = 0 Then
																	Dim vExecQuerySingleResult3 As String = Main.vSql1.ExecQuerySingleResult("Select natura from iva where codice = " & cursorWrapper4.GetInt("iva"))
																	Dim vExecQuerySingleResult4 As String = Main.vSql1.ExecQuerySingleResult("Select descrizione from FEnaturaIVA where codice = " & vExecQuerySingleResult3)
																	If Not(vExecQuerySingleResult4 = Null) And vExecQuerySingleResult4.Trim <> "" Then
																		replace33 = replace72.Replace("@_BloccoNaturaIVADettaglio_@", Main.vMap3.GetDefault("01-02-05-02-NaturaIVADettaglio", "")).Replace("@_NaturaIVALinea_@", Sub076(vExecQuerySingleResult4.ToUpperCase))
																	Else
																		replace33 = replace72.Replace("@_BloccoNaturaIVADettaglio_@", "")
																	End If
																Else
																	replace33 = replace72.Replace("@_BloccoNaturaIVADettaglio_@", "")
																End If
																If cursorWrapper4.GetInt("nscontrinoffm") > 0 And Not(cursorWrapper4.GetString("dataeoraffm") = Null) Then
																	Dim replace73 As String = replace33.Replace("@_BloccoAltriDatiGestionali_@", Main.vMap3.GetDefault("01-02-05-03-bloccoaltridatigestionali", ""))
																	Dim vGetString5 As String = cursorWrapper4.GetString("dataeoraffm")
																	Dim str8 As String = vGetString5.SubString2(6, 10) & "-" & vGetString5.SubString2(0, 2) & "-" & vGetString5.SubString2(3, 5)
																	Dim str9 As String = "Numero " & SmartStringFormatter("", cursorWrapper4.GetString("nscontrinoffm")) & " del " & SmartStringFormatter("", str8) & " Matricola:" & SmartStringFormatter("", cursorWrapper4.GetString("matricolacassap")) & ""
																	If cursorWrapper4.GetInt("nChiusura") > 0 Then
																		str9 = "Numero " & SmartStringFormatter("", cursorWrapper4.GetString("nChiusura")) & "-" & SmartStringFormatter("", cursorWrapper4.GetString("nscontrinoffm")) & " del " & SmartStringFormatter("", str8) & " Matricola:" & SmartStringFormatter("", cursorWrapper4.GetString("matricolacassap")) & ""
																	End If
																	replace34 = replace73.Replace("@_TipoDatoFiscale_@", "SCONTRINO").Replace("@_RiferimentoTestoGestionale_@", str9)
																Else If cursorWrapper4.GetInt("nric") > 0 Then
																	replace34 = replace33.Replace("@_BloccoAltriDatiGestionali_@", Main.vMap3.GetDefault("01-02-05-03-bloccoaltridatigestionali", "")).Replace("@_TipoDatoFiscale_@", "RICEVUTA").Replace("@_RiferimentoTestoGestionale_@", "Numero " & SmartStringFormatter("", cursorWrapper4.GetString("nric")) & " del " & SmartStringFormatter("", cursorWrapper4.GetString("datam3").SubString2(0, 10)) & "")
																Else
																	replace34 = replace33.Replace("@_BloccoAltriDatiGestionali_@", "")
																End If
																If doubleValue3 <> 0 And Not(z4) Then
																	i3 = i3 - 1
																	z5 = True
																Else
																	z5 = False
																End If
																Dim i6 As Int = i4 + 1
																stringBuilderWrapper.Append(replace34)
																i3 = i3 + 1
																str3 = str6
																i4 = i6
																z4 = z5
															Else
																If Main.v_noteinfe Then
																	Dim vObjectToString9 As String = map.GetDefault("Memo", "")
																	If vObjectToString9 <> "" And vObjectToString9 <> "Inserire Testo" Then
																		Dim replace74 As String = Main.vMap3.GetDefault("StrutturaNoteFE", "").Replace("@_NumLinea_@", i4).Replace("@_Iva_@", str3)
																		Dim d4 As Double = -1
																		If IsNumber(str3) Then
																			d4 = str3
																		End If
																		If d4 = 0 And i5 >= 0 Then
																			Dim vExecQuerySingleResult5 As String = Main.vSql1.ExecQuerySingleResult("Select natura from iva where codice = " & i5)
																			Dim vExecQuerySingleResult6 As String = Main.vSql1.ExecQuerySingleResult("Select descrizione from FEnaturaIVA where codice = " & vExecQuerySingleResult5)
																			If Not(vExecQuerySingleResult6 = Null) And vExecQuerySingleResult6.Trim <> "" Then
																				replace28 = replace74.Replace("@_BloccoNaturaIVADettaglio_@", Main.vMap3.GetDefault("01-02-05-02-NaturaIVADettaglio", "")).Replace("@_NaturaIVALinea_@", Sub076(vExecQuerySingleResult6.ToUpperCase))
																			Else
																				replace28 = replace74.Replace("@_BloccoNaturaIVADettaglio_@", "")
																			End If
																		Else
																			replace28 = replace74.Replace("@_BloccoNaturaIVADettaglio_@", "")
																		End If
																		stringBuilderWrapper.Append(replace28.Replace("@_TestoNota_@", Sub148(map.GetDefault("Memo", ""))))
																	End If
																End If
																If z And customprogressdialogVar.isshow Then
																	customprogressdialogVar._hide
																End If
																Dim replace75 As String = replace66.Replace("@_DettaglioLinee_@", stringBuilderWrapper.ToString)
																If z2 Then
																	sql.ExecNonQuery("attach database '" & File.DirDefaultExternal & "/anagra.db' as AnagraDB")
																	cursorWrapper2 = sql.ExecQuery("select sum(Importo) * " & vObjectToNumber & " As ImportoTot,i.aliquota2 as AliquotaV,i.natura as NaturaIVA,i.codice as CodiceV,sum(round(((((v.importo*1.00)*100)/((100+v.aliquota2)))/100)*((v.aliquota2*1.00)),4))*" & vObjectToNumber & " as Imposta,max(i.descrizione) as RiferimentoNormativo from headmov as h inner join venduto as v on h.nmov=v.nmov inner join AnagraDB.iva as i on v.iva=i.codice where @NumeroDoc@ group by CodiceV,naturaIVA")
																Else
																	cursorWrapper2 = sql.ExecQuery("select sum(Importo)*" & vObjectToNumber & " As ImportoTot,i.aliquota2 as AliquotaV,i.natura as NaturaIVA,i.codice as CodiceV,sum(round(((((v.importo*1.00)*100)/((100+v.aliquota2)))/100)*((v.aliquota2*1.00)),4))*" & vObjectToNumber & " as Imposta,max(i.descrizione) as RiferimentoNormativo from headmov as h inner join venduto as v on h.nmov=v.nmov inner join iva as i on v.iva=i.codice where @NumeroDoc@ group by CodiceV,naturaIVA")
																End If
																Dim d5 As Double = 0
																If z3 Then
																	If fatturafm.vLst1.IsInitialized Then
																		If fatturafm.vLst1.Size > 0 Then
																			Dim i7 As Int = 0
																			str4 = replace75
																			Do While i7 <= 9
																				If 0 = fatturafm.vLst1.Get(i7) Then
																					replace27 = str4
																					d = d5
																				Else
																					Main.vCur4.Position = i7
																					Dim replace76 As String = str4.Replace("@_DatiRiepilogo_@", Main.vMap3.GetDefault("01-02-06-00-DatiRiepilogo", "") & CRLF & "@_DatiRiepilogo_@")
																					Dim replace77 As String = replace76.Replace("@_AliquotaRiepilogo_@", NumberFormat2(Main.vCur4.GetDouble("aliquota2"), 1, 2, 2, False).Replace(",", "."))
																					If Main.vCur4.GetDouble("aliquota2") = 0 Then
																						Dim replace78 As String = replace77.Replace("@_BloccoNaturaIVARiepilogo_@", Main.vMap3.GetDefault("01-02-06-01-NaturaIVARiepilogo", ""))
																						replace26 = replace78.Replace("@_NaturaIVARiepilogo_@", Sub076(Main.vSql1.ExecQuerySingleResult("Select descrizione from FEnaturaIVA where codice = " & Main.vCur4.GetString("natura")).ToUpperCase))
																					Else
																						replace26 = replace77.Replace("@_BloccoNaturaIVARiepilogo_@", "")
																					End If
																					Dim vObjectToNumber2 As Double = fatturafm.vLst1.Get(i7)
																					Dim vObjectToNumber3 As Double = fatturafm.vLst1.Get(i7)
																					Dim vRound2 As Double = Round2(vObjectToNumber2 - vObjectToNumber3 / (1 + Main.vCur4.GetDouble("aliquota2") / 100), 2)
																					Dim replace79 As String = replace26.Replace("@_TotaleImponibile_@", NumberFormat2(fatturafm.vLst1.Get(i7) - vRound2, 1, 2, 2, False).Replace(",", "."))
																					Dim vObjectToNumber4 As Double = d5 + fatturafm.vLst1.Get(i7)
																					Dim replace80 As String = replace79.Replace("@_TotaleImposta_@", NumberFormat2(vRound2, 1, 2, 2, False).Replace(",", "."))
																					Dim replace81 As String = replace80.Replace("@_BloccoEsigibilitaRiepilogo_@", Main.vMap3.GetDefault("01-02-06-03-EsigibilitaRiepilogo", "")).Replace("@_Esigibilita_@", trim2.ToUpperCase)
																					If Main.vCur4.GetDouble("aliquota2") = 0 Then
																						replace27 = replace81.Replace("@_RifNormativo_@", Sub148(Main.vCur4.GetString("descrizione").Trim))
																						d = vObjectToNumber4
																					Else
																						replace27 = replace81.Replace("<RiferimentoNormativo>@_RifNormativo_@</RiferimentoNormativo>", "")
																						d = vObjectToNumber4
																					End If
																				End If
																				i7 = i7 + 1
																				d5 = d
																				str4 = replace27
																			Loop
																			Dim replace82 As String = str4.Replace("@_ImpTotDocumento_@", NumberFormat2(d5, 1, 2, 2, False))
																			If z2 Then
																				sql.ExecNonQuery("DETACH DATABASE 'AnagraDB'")
																			End If
																			Dim replace83 As String = replace82.Replace("@_DatiRiepilogo_@", "").Replace("@_DatiPagamento_@", "").Replace(CRLF & CRLF, CRLF)
																			str7 = sb.Replace(" ", "_").Replace(":", "-")
																			textWriterWrapper.Initialize2(File.OpenOutput(sb3, str7, False), "UTF-8")
																			textWriterWrapper.Write(replace83)
																			textWriterWrapper.Close
																			If Main.vBln25 And Not(z) Then
																				File.Copy(sb3, str7, sb3, str7.Replace(".xml", ".cpy"))
																			End If
																			ToastMessageShow("Salvataggio del file eseguito correttamente.", False)
																		End If
																	End If
																End If
																Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
																str4 = replace75
																Dim i8 As Int
																For i8 = 0 To rowCount2
																	cursorWrapper2.Position = i8
																	Dim replace84 As String = str4.Replace("@_DatiRiepilogo_@", Main.vMap3.GetDefault("01-02-06-00-DatiRiepilogo", "") & CRLF & "@_DatiRiepilogo_@").Replace("@_AliquotaRiepilogo_@", NumberFormat2(cursorWrapper2.GetDouble("AliquotaV"), 1, 2, 2, False).Replace(",", "."))
																	If cursorWrapper2.GetDouble("AliquotaV") = 0 Then
																		Dim replace85 As String = replace84.Replace("@_BloccoNaturaIVARiepilogo_@", Main.vMap3.GetDefault("01-02-06-01-NaturaIVARiepilogo", ""))
																		replace25 = replace85.Replace("@_NaturaIVARiepilogo_@", Sub076(Main.vSql1.ExecQuerySingleResult("Select descrizione from FEnaturaIVA where codice = " & cursorWrapper2.GetString("NaturaIVA")).ToUpperCase))
																	Else
																		replace25 = replace84.Replace("@_BloccoNaturaIVARiepilogo_@", "")
																	End If
																	d5 = d5 + cursorWrapper2.GetDouble("ImportoTot")
																	Dim replace86 As String = replace25.Replace("@_TotaleImponibile_@", NumberFormat2(cursorWrapper2.GetDouble("ImportoTot") - cursorWrapper2.GetDouble("Imposta"), 1, 2, 2, False).Replace(",", ".")).Replace("@_TotaleImposta_@", NumberFormat2(cursorWrapper2.GetDouble("Imposta"), 1, 2, 2, False).Replace(",", "."))
																	Dim replace87 As String = replace86.Replace("@_BloccoEsigibilitaRiepilogo_@", Main.vMap3.GetDefault("01-02-06-03-EsigibilitaRiepilogo", "")).Replace("@_Esigibilita_@", trim2.ToUpperCase)
																	If cursorWrapper2.GetDouble("AliquotaV") = 0 Then
																		str4 = replace87.Replace("@_RifNormativo_@", Sub148(cursorWrapper2.GetString("RiferimentoNormativo").Trim))
																	Else
																		str4 = replace87.Replace("<RiferimentoNormativo>@_RifNormativo_@</RiferimentoNormativo>", "")
																	End If
																Next
																Dim replace822 As String = str4.Replace("@_ImpTotDocumento_@", NumberFormat2(d5, 1, 2, 2, False))
																If z2 Then
																End If
																Dim replace832 As String = replace822.Replace("@_DatiRiepilogo_@", "").Replace("@_DatiPagamento_@", "").Replace(CRLF & CRLF, CRLF)
																str7 = sb.Replace(" ", "_").Replace(":", "-")
																textWriterWrapper.Initialize2(File.OpenOutput(sb3, str7, False), "UTF-8")
																textWriterWrapper.Write(replace832)
																textWriterWrapper.Close
																If Main.vBln25 Then
																	File.Copy(sb3, str7, sb3, str7.Replace(".xml", ".cpy"))
																End If
																ToastMessageShow("Salvataggio del file eseguito correttamente.", False)
															End If
														Loop
													End If
												End If
												replace12 = replace11.Replace("@_TerzoIntermediarioOSoggettoEmittente_@", "")
												If cursorWrapper3.GetInt("TipoSoggettoCli") = 0 Then
												End If
												replace13 = replace12.Replace("@_BloccoIDFiscaleIVACliente_@", "")
												vObjectToString = map.GetDefault("CFCli", "")
												If vObjectToString.Trim <> "" Then
												End If
												vObjectToString2 = map.GetDefault("DenominazioneCli", "")
												If vObjectToString2.Trim = "" Then
												End If
												replace16 = replace15.Replace("@_IndirizzoCliente_@", Sub148(map.GetDefault("IndirizzoCli", "").Trim))
												vObjectToString3 = map.GetDefault("CAPCli", "")
												If Not(IsNumber(vObjectToString3)) Then
												End If
												replace17 = replace16.Replace("@_CAPCliente_@", "00000")
												Dim replace622 As String = replace17.Replace("@_ComuneCliente_@", Sub148(map.GetDefault("ComuneCli", "").Trim))
												If map.GetDefault("NazioneCli", "").Trim.ToUpperCase = "IT" Then
												End If
												Dim replace632 As String = replace18.Replace("@_NazioneCliente_@", map.GetDefault("NazioneCli", "").Trim.ToUpperCase)
												Dim replace642 As String = replace632.Replace("@_Body_@", Main.vMap3.GetDefault("01-02-00-Body", "")).Replace("@_TipoDocumento_@", map.GetDefault("TipoDoc", "")).Trim.Replace("@_DivisaDocumento_@", "EUR").Trim.Replace("@_DataDocumento_@", map.GetDefault("DataDoc", "").Trim.SubString2(0, 10))
												Dim vObjectToString82 As String = map.GetDefault("NumeroDoc", "")
												If map.GetDefault("Sezionale", "") <> "" Then
												End If
												replace19 = replace642.Replace("@_NumeroDocumento_@", Sub148(vObjectToString82.Trim))
												If Not(map.GetDefault("BolloVirtuale", False)) Then
												End If
												replace20 = replace19.Replace("@_DatiBollo_@", "")
												cursorWrapper = sql.ExecQuery("select case when sum(importo) is null then 0.00 else sum(importo) end as TotAbbuoni,case when sum(qta) is null then 0.00 else sum(qta) end as QtaAbbuoni from headmov as h inner join venduto as v on v.nmov=h.nmov where @NumeroDoc@ and codint='abb'".Replace("@NumeroDoc@", str))
												If cursorWrapper.RowCount <> 0 Then
												End If
												cursorWrapper.Close
												If map.GetDefault("IDOrdAcq", "") = "" Then
												End If
												Dim replace652 As String = replace21.Replace("@_DatiOrdineAcquisto_@", Main.vMap3.GetDefault("01-02-03-DatiOrdineAcquisto", ""))
												vObjectToString4 = map.GetDefault("IDOrdAcq", "")
												If vObjectToString4 = "" Then
												End If
												vObjectToString5 = map.GetDefault("CUP", "")
												If vObjectToString5 = "" Then
												End If
												vObjectToString6 = map.GetDefault("CIG", "")
												If vObjectToString6 = "" Then
												End If
												Dim replace662 As String = replace24.Replace("@_DatiDDT_@", "")
												Dim customprogressdialogVar2 As CustomProgressDialog
												If z Then
												End If
												If z3 Then
												End If
												Dim stringBuilderWrapper2 As StringBuilder
												stringBuilderWrapper2.Initialize
												If cursorWrapper4.RowCount <= 150 Then
												End If
												str3 = ""
												i2 = -1
												rowCount = cursorWrapper4.RowCount - 1
												i3 = 0
												i4 = 1
												z4 = False
												Do While True
													Dim i52 As Int = i2
													If i3 <= rowCount Then
													End If
													i3 = i3 + 1
													str3 = str6
													i4 = i6
													z4 = z5
												Loop
											End If
										End If
										replace5 = replace4.Replace("@_BloccoIDFiscaleIVAFornitore_@", "")
										If Main.vCur7.GetString("CFEser").Trim = "" Then
										End If
										If Main.vCur7.GetString("DenEser").Trim <> "" Then
										End If
										vExecQuerySingleResult = Main.vSql1.ExecQuerySingleResult("Select Sigla from FERegFiscale where Codice =" & Main.vCur7.GetString("RegFiscEser"))
										If Not(vExecQuerySingleResult = Null) Then
										End If
										vExecQuerySingleResult = "RF01"
										Dim replace472 As String = replace7.Replace("@_RegimeFiscale_@", vExecQuerySingleResult.Trim.ToUpperCase)
										replace8 = replace472.Replace("@_IndirizzoFornitore_@", Sub148(Main.vCur7.GetString("ViaEser").Trim))
										trim = Main.vCur7.GetString("CapEser").Trim
										If Not(IsNumber(trim)) Then
										End If
										replace9 = replace8.Replace("@_CAPFornitore_@", "00000")
										Dim replace482 As String = replace9.Replace("@_ComuneFornitore_@", Sub148(Main.vCur7.GetString("CittaEser").Trim))
										If Main.vCur7.GetString("NazioneEser").Trim.ToUpperCase <> "IT" Then
										End If
										Dim replace502 As String = replace10.Replace("@_NazioneFornitore_@", Main.vCur7.GetString("NazioneEser").Trim.ToUpperCase)
										If Main.vCur7.GetString("NumeroREA").Trim = "" Then
										End If
										If Main.vCur7.GetInt("TerzoTipoEser") > 0 Then
										End If
										replace12 = replace11.Replace("@_TerzoIntermediarioOSoggettoEmittente_@", "")
										If cursorWrapper3.GetInt("TipoSoggettoCli") = 0 Then
										End If
										replace13 = replace12.Replace("@_BloccoIDFiscaleIVACliente_@", "")
										vObjectToString = map.GetDefault("CFCli", "")
										If vObjectToString.Trim <> "" Then
										End If
										vObjectToString2 = map.GetDefault("DenominazioneCli", "")
										If vObjectToString2.Trim = "" Then
										End If
										replace16 = replace15.Replace("@_IndirizzoCliente_@", Sub148(map.GetDefault("IndirizzoCli", "").Trim))
										vObjectToString3 = map.GetDefault("CAPCli", "")
										If Not(IsNumber(vObjectToString3)) Then
										End If
										replace17 = replace16.Replace("@_CAPCliente_@", "00000")
										Dim replace6222 As String = replace17.Replace("@_ComuneCliente_@", Sub148(map.GetDefault("ComuneCli", "").Trim))
										If map.GetDefault("NazioneCli", "").Trim.ToUpperCase = "IT" Then
										End If
										Dim replace6322 As String = replace18.Replace("@_NazioneCliente_@", map.GetDefault("NazioneCli", "").Trim.ToUpperCase)
										Dim replace6422 As String = replace6322.Replace("@_Body_@", Main.vMap3.GetDefault("01-02-00-Body", "")).Replace("@_TipoDocumento_@", map.GetDefault("TipoDoc", "")).Trim.Replace("@_DivisaDocumento_@", "EUR").Trim.Replace("@_DataDocumento_@", map.GetDefault("DataDoc", "").Trim.SubString2(0, 10))
										Dim vObjectToString822 As String = map.GetDefault("NumeroDoc", "")
										If map.GetDefault("Sezionale", "") <> "" Then
										End If
										replace19 = replace6422.Replace("@_NumeroDocumento_@", Sub148(vObjectToString822.Trim))
										If Not(map.GetDefault("BolloVirtuale", False)) Then
										End If
										replace20 = replace19.Replace("@_DatiBollo_@", "")
										cursorWrapper = sql.ExecQuery("select case when sum(importo) is null then 0.00 else sum(importo) end as TotAbbuoni,case when sum(qta) is null then 0.00 else sum(qta) end as QtaAbbuoni from headmov as h inner join venduto as v on v.nmov=h.nmov where @NumeroDoc@ and codint='abb'".Replace("@NumeroDoc@", str))
										If cursorWrapper.RowCount <> 0 Then
										End If
										cursorWrapper.Close
										If map.GetDefault("IDOrdAcq", "") = "" Then
										End If
										Dim replace6522 As String = replace21.Replace("@_DatiOrdineAcquisto_@", Main.vMap3.GetDefault("01-02-03-DatiOrdineAcquisto", ""))
										vObjectToString4 = map.GetDefault("IDOrdAcq", "")
										If vObjectToString4 = "" Then
										End If
										vObjectToString5 = map.GetDefault("CUP", "")
										If vObjectToString5 = "" Then
										End If
										vObjectToString6 = map.GetDefault("CIG", "")
										If vObjectToString6 = "" Then
										End If
										Dim replace6622 As String = replace24.Replace("@_DatiDDT_@", "")
										Dim customprogressdialogVar22 As CustomProgressDialog
										If z Then
										End If
										If z3 Then
										End If
										Dim stringBuilderWrapper22 As StringBuilder
										stringBuilderWrapper22.Initialize
										If cursorWrapper4.RowCount <= 150 Then
										End If
										str3 = ""
										i2 = -1
										rowCount = cursorWrapper4.RowCount - 1
										i3 = 0
										i4 = 1
										z4 = False
										Do While True
											Dim i522 As Int = i2
											If i3 <= rowCount Then
											End If
											i3 = i3 + 1
											str3 = str6
											i4 = i6
											z4 = z5
										Loop
									End If
								End If
								replace2 = replace39.Replace("<IdPaese>@_IDPaeseTrasmittente_@</IdPaese>", "").Replace("<IdCodice>@_CodiceTrasmittente_@</IdCodice>", "").Replace("<ProgressivoInvio>@_ProgInvio_@</ProgressivoInvio>", "").Replace("<IdTrasmittente>", "").Replace("</IdTrasmittente>", "")
								Dim cursorWrapper52 As Cursor
								cursorWrapper3 = Main.vSql1.ExecQuery("select * from FEdatiCli where codice ='" & cursorWrapper2.GetString("cliente") & "'")
								cursorWrapper3.Position = 0
								Select cursorWrapper3.GetInt("TipoSoggettoCli")
								End Select
								upperCase = cursorWrapper3.GetString("CodiceDestinatario").ToUpperCase
								If cursorWrapper3.GetString("NazioneCli") = "" Then
								End If
								If cursorWrapper3.GetString("NazioneCli") = "IT" Then
									upperCase = "0000000"
								End If
								replace3 = replace2.Replace("@_CodDestinatario_@", Sub148(upperCase.Trim))
								If upperCase.Trim <> "0000000" Then
								End If
								replace4 = replace3.Replace("@_BloccoPEC_@", "")
								If Main.vCur7.GetInt("TipoEser") <> 0 Then
								End If
								replace5 = replace4.Replace("@_BloccoIDFiscaleIVAFornitore_@", "")
								If Main.vCur7.GetString("CFEser").Trim = "" Then
								End If
								If Main.vCur7.GetString("DenEser").Trim <> "" Then
								End If
								vExecQuerySingleResult = Main.vSql1.ExecQuerySingleResult("Select Sigla from FERegFiscale where Codice =" & Main.vCur7.GetString("RegFiscEser"))
								If Not(vExecQuerySingleResult = Null) Then
								End If
								vExecQuerySingleResult = "RF01"
								Dim replace4722 As String = replace7.Replace("@_RegimeFiscale_@", vExecQuerySingleResult.Trim.ToUpperCase)
								replace8 = replace4722.Replace("@_IndirizzoFornitore_@", Sub148(Main.vCur7.GetString("ViaEser").Trim))
								trim = Main.vCur7.GetString("CapEser").Trim
								If Not(IsNumber(trim)) Then
								End If
								replace9 = replace8.Replace("@_CAPFornitore_@", "00000")
								Dim replace4822 As String = replace9.Replace("@_ComuneFornitore_@", Sub148(Main.vCur7.GetString("CittaEser").Trim))
								If Main.vCur7.GetString("NazioneEser").Trim.ToUpperCase <> "IT" Then
								End If
								Dim replace5022 As String = replace10.Replace("@_NazioneFornitore_@", Main.vCur7.GetString("NazioneEser").Trim.ToUpperCase)
								If Main.vCur7.GetString("NumeroREA").Trim = "" Then
								End If
								If Main.vCur7.GetInt("TerzoTipoEser") > 0 Then
								End If
								replace12 = replace11.Replace("@_TerzoIntermediarioOSoggettoEmittente_@", "")
								If cursorWrapper3.GetInt("TipoSoggettoCli") = 0 Then
								End If
								replace13 = replace12.Replace("@_BloccoIDFiscaleIVACliente_@", "")
								vObjectToString = map.GetDefault("CFCli", "")
								If vObjectToString.Trim <> "" Then
								End If
								vObjectToString2 = map.GetDefault("DenominazioneCli", "")
								If vObjectToString2.Trim = "" Then
								End If
								replace16 = replace15.Replace("@_IndirizzoCliente_@", Sub148(map.GetDefault("IndirizzoCli", "").Trim))
								vObjectToString3 = map.GetDefault("CAPCli", "")
								If Not(IsNumber(vObjectToString3)) Then
								End If
								replace17 = replace16.Replace("@_CAPCliente_@", "00000")
								Dim replace62222 As String = replace17.Replace("@_ComuneCliente_@", Sub148(map.GetDefault("ComuneCli", "").Trim))
								If map.GetDefault("NazioneCli", "").Trim.ToUpperCase = "IT" Then
								End If
								Dim replace63222 As String = replace18.Replace("@_NazioneCliente_@", map.GetDefault("NazioneCli", "").Trim.ToUpperCase)
								Dim replace64222 As String = replace63222.Replace("@_Body_@", Main.vMap3.GetDefault("01-02-00-Body", "")).Replace("@_TipoDocumento_@", map.GetDefault("TipoDoc", "")).Trim.Replace("@_DivisaDocumento_@", "EUR").Trim.Replace("@_DataDocumento_@", map.GetDefault("DataDoc", "").Trim.SubString2(0, 10))
								Dim vObjectToString8222 As String = map.GetDefault("NumeroDoc", "")
								If map.GetDefault("Sezionale", "") <> "" Then
								End If
								replace19 = replace64222.Replace("@_NumeroDocumento_@", Sub148(vObjectToString8222.Trim))
								If Not(map.GetDefault("BolloVirtuale", False)) Then
								End If
								replace20 = replace19.Replace("@_DatiBollo_@", "")
								cursorWrapper = sql.ExecQuery("select case when sum(importo) is null then 0.00 else sum(importo) end as TotAbbuoni,case when sum(qta) is null then 0.00 else sum(qta) end as QtaAbbuoni from headmov as h inner join venduto as v on v.nmov=h.nmov where @NumeroDoc@ and codint='abb'".Replace("@NumeroDoc@", str))
								If cursorWrapper.RowCount <> 0 Then
								End If
								cursorWrapper.Close
								If map.GetDefault("IDOrdAcq", "") = "" Then
								End If
								Dim replace65222 As String = replace21.Replace("@_DatiOrdineAcquisto_@", Main.vMap3.GetDefault("01-02-03-DatiOrdineAcquisto", ""))
								vObjectToString4 = map.GetDefault("IDOrdAcq", "")
								If vObjectToString4 = "" Then
								End If
								vObjectToString5 = map.GetDefault("CUP", "")
								If vObjectToString5 = "" Then
								End If
								vObjectToString6 = map.GetDefault("CIG", "")
								If vObjectToString6 = "" Then
								End If
								Dim replace66222 As String = replace24.Replace("@_DatiDDT_@", "")
								Dim customprogressdialogVar222 As CustomProgressDialog
								If z Then
								End If
								If z3 Then
								End If
								Dim stringBuilderWrapper222 As StringBuilder
								stringBuilderWrapper222.Initialize
								If cursorWrapper4.RowCount <= 150 Then
								End If
								str3 = ""
								i2 = -1
								rowCount = cursorWrapper4.RowCount - 1
								i3 = 0
								i4 = 1
								z4 = False
								Do While True
									Dim i5222 As Int = i2
									If i3 <= rowCount Then
									End If
									i3 = i3 + 1
									str3 = str6
									i4 = i6
									z4 = z5
								Loop
							End If
						End If
						vStr6 = sb.Replace(":", "-")
						If File.Exists(vStr7, "Tmp.MF") Then
						End If
						If File.Exists(vStr7, "Tmp.txt") Then
						End If
						If File.Exists(vStr7, "Tmp.NF") Then
						End If
						Dim vObjectToString72 As String = Main.vMap3.GetDefault("01-00-StrutturaFattura", "")
						Dim replace392 As String = vObjectToString72.Replace("@_Header_@", Main.vMap3.GetDefault("01-01-00-Header", ""))
						If Main.vCur7.GetString("IDPaeseTX") <> "" Then
						End If
						replace2 = replace392.Replace("<IdPaese>@_IDPaeseTrasmittente_@</IdPaese>", "").Replace("<IdCodice>@_CodiceTrasmittente_@</IdCodice>", "").Replace("<ProgressivoInvio>@_ProgInvio_@</ProgressivoInvio>", "").Replace("<IdTrasmittente>", "").Replace("</IdTrasmittente>", "")
						Dim cursorWrapper522 As Cursor
						cursorWrapper3 = Main.vSql1.ExecQuery("select * from FEdatiCli where codice ='" & cursorWrapper2.GetString("cliente") & "'")
						cursorWrapper3.Position = 0
						Select cursorWrapper3.GetInt("TipoSoggettoCli")
						End Select
						upperCase = cursorWrapper3.GetString("CodiceDestinatario").ToUpperCase
						If cursorWrapper3.GetString("NazioneCli") = "" Then
						End If
						If cursorWrapper3.GetString("NazioneCli") = "IT" Then
						End If
						replace3 = replace2.Replace("@_CodDestinatario_@", Sub148(upperCase.Trim))
						If upperCase.Trim <> "0000000" Then
						End If
						replace4 = replace3.Replace("@_BloccoPEC_@", "")
						If Main.vCur7.GetInt("TipoEser") <> 0 Then
						End If
						replace5 = replace4.Replace("@_BloccoIDFiscaleIVAFornitore_@", "")
						If Main.vCur7.GetString("CFEser").Trim = "" Then
						End If
						If Main.vCur7.GetString("DenEser").Trim <> "" Then
						End If
						vExecQuerySingleResult = Main.vSql1.ExecQuerySingleResult("Select Sigla from FERegFiscale where Codice =" & Main.vCur7.GetString("RegFiscEser"))
						If Not(vExecQuerySingleResult = Null) Then
						End If
						vExecQuerySingleResult = "RF01"
						Dim replace47222 As String = replace7.Replace("@_RegimeFiscale_@", vExecQuerySingleResult.Trim.ToUpperCase)
						replace8 = replace47222.Replace("@_IndirizzoFornitore_@", Sub148(Main.vCur7.GetString("ViaEser").Trim))
						trim = Main.vCur7.GetString("CapEser").Trim
						If Not(IsNumber(trim)) Then
						End If
						replace9 = replace8.Replace("@_CAPFornitore_@", "00000")
						Dim replace48222 As String = replace9.Replace("@_ComuneFornitore_@", Sub148(Main.vCur7.GetString("CittaEser").Trim))
						If Main.vCur7.GetString("NazioneEser").Trim.ToUpperCase <> "IT" Then
						End If
						Dim replace50222 As String = replace10.Replace("@_NazioneFornitore_@", Main.vCur7.GetString("NazioneEser").Trim.ToUpperCase)
						If Main.vCur7.GetString("NumeroREA").Trim = "" Then
						End If
						If Main.vCur7.GetInt("TerzoTipoEser") > 0 Then
						End If
						replace12 = replace11.Replace("@_TerzoIntermediarioOSoggettoEmittente_@", "")
						If cursorWrapper3.GetInt("TipoSoggettoCli") = 0 Then
						End If
						replace13 = replace12.Replace("@_BloccoIDFiscaleIVACliente_@", "")
						vObjectToString = map.GetDefault("CFCli", "")
						If vObjectToString.Trim <> "" Then
						End If
						vObjectToString2 = map.GetDefault("DenominazioneCli", "")
						If vObjectToString2.Trim = "" Then
						End If
						replace16 = replace15.Replace("@_IndirizzoCliente_@", Sub148(map.GetDefault("IndirizzoCli", "").Trim))
						vObjectToString3 = map.GetDefault("CAPCli", "")
						If Not(IsNumber(vObjectToString3)) Then
						End If
						replace17 = replace16.Replace("@_CAPCliente_@", "00000")
						Dim replace622222 As String = replace17.Replace("@_ComuneCliente_@", Sub148(map.GetDefault("ComuneCli", "").Trim))
						If map.GetDefault("NazioneCli", "").Trim.ToUpperCase = "IT" Then
						End If
						Dim replace632222 As String = replace18.Replace("@_NazioneCliente_@", map.GetDefault("NazioneCli", "").Trim.ToUpperCase)
						Dim replace642222 As String = replace632222.Replace("@_Body_@", Main.vMap3.GetDefault("01-02-00-Body", "")).Replace("@_TipoDocumento_@", map.GetDefault("TipoDoc", "")).Trim.Replace("@_DivisaDocumento_@", "EUR").Trim.Replace("@_DataDocumento_@", map.GetDefault("DataDoc", "").Trim.SubString2(0, 10))
						Dim vObjectToString82222 As String = map.GetDefault("NumeroDoc", "")
						If map.GetDefault("Sezionale", "") <> "" Then
						End If
						replace19 = replace642222.Replace("@_NumeroDocumento_@", Sub148(vObjectToString82222.Trim))
						If Not(map.GetDefault("BolloVirtuale", False)) Then
						End If
						replace20 = replace19.Replace("@_DatiBollo_@", "")
						cursorWrapper = sql.ExecQuery("select case when sum(importo) is null then 0.00 else sum(importo) end as TotAbbuoni,case when sum(qta) is null then 0.00 else sum(qta) end as QtaAbbuoni from headmov as h inner join venduto as v on v.nmov=h.nmov where @NumeroDoc@ and codint='abb'".Replace("@NumeroDoc@", str))
						If cursorWrapper.RowCount <> 0 Then
						End If
						cursorWrapper.Close
						If map.GetDefault("IDOrdAcq", "") = "" Then
						End If
						Dim replace652222 As String = replace21.Replace("@_DatiOrdineAcquisto_@", Main.vMap3.GetDefault("01-02-03-DatiOrdineAcquisto", ""))
						vObjectToString4 = map.GetDefault("IDOrdAcq", "")
						If vObjectToString4 = "" Then
						End If
						vObjectToString5 = map.GetDefault("CUP", "")
						If vObjectToString5 = "" Then
						End If
						vObjectToString6 = map.GetDefault("CIG", "")
						If vObjectToString6 = "" Then
						End If
						Dim replace662222 As String = replace24.Replace("@_DatiDDT_@", "")
						Dim customprogressdialogVar2222 As CustomProgressDialog
						If z Then
						End If
						If z3 Then
						End If
						Dim stringBuilderWrapper2222 As StringBuilder
						stringBuilderWrapper2222.Initialize
						If cursorWrapper4.RowCount <= 150 Then
						End If
						str3 = ""
						i2 = -1
						rowCount = cursorWrapper4.RowCount - 1
						i3 = 0
						i4 = 1
						z4 = False
						Do While True
							Dim i52222 As Int = i2
							If i3 <= rowCount Then
							End If
							i3 = i3 + 1
							str3 = str6
							i4 = i6
							z4 = z5
						Loop
					Catch
						exc = e
						str7 = sb
						ProgressDialogHide
						Sub217(LastException.Message)
						If cursorWrapper2.IsInitialized Then
						End If
						If cursorWrapper.IsInitialized Then
						End If
						Main.vSql2.ExecNonQuery("DROP TABLE IF EXISTS TEMP.TmpFattFM")
						ProgressDialogHide
						Return str7
					End Try
					z3 = False
					replace = map.GetDefault("Sezionale", "").Replace("/", "").Replace("\", "").Replace(">", "").Replace("<", "").Replace(":", "").Replace("*", "").Replace("?", "").Replace(QUOTE, "").Replace("@", "").Replace(CRLF, "")
					If replace = "" Then
					End If
					sb = "FE_" & str2 & " " & DateTime.Time(DateTime.Now) & "_" & map.GetDefault("NumeroDoc", "") & "_" & replace & "_" & map.GetDefault("ProgInvio", "") & ".xml"
				End If
			Catch
				exc = e2
			End Try
		Catch
			cursorWrapper = Null
			exc = e3
		End Try
	Catch
		cursorWrapper = Null
		cursorWrapper2 = Null
		exc = e4
	End Try
	If cursorWrapper2.IsInitialized Then
		cursorWrapper2.Close
	End If
	If cursorWrapper.IsInitialized Then
		cursorWrapper.Close
	End If
	Main.vSql2.ExecNonQuery("DROP TABLE IF EXISTS TEMP.TmpFattFM")
	ProgressDialogHide
	Return str7
End Sub

Sub Sub069
	Dim vTmp As String = Sub057(DateTime.Date(Sub058()) & " " & DateTime.Time(Sub058()))
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codint from offerteUniandro where campi <>'' and dadata< '" & vTmp & "' and adata >'" & vTmp & "'")
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select campi from offerteUniandro where codint ='" & cursorWrapper2.GetString("codint") & "'")
			Main.vSql1.ExecNonQuery(vExecQuerySingleResult)
		Next
		Main.vSql1.ExecNonQuery("update offerteUniandro set campi='' where campi <>'' and dadata< '" & vTmp & "' and adata >'" & vTmp & "'")
	End If
	Dim cursorWrapper3 As Cursor
	Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select codint from offerteUniandro where adata <'" & vTmp & "'")
	If cursorWrapper4.RowCount > 0 Then
		Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount2
			cursorWrapper4.Position = i2
			Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("Select list1 from offerteUniandro where codint ='" & cursorWrapper4.GetString("codint") & "'")
			Main.vSql1.ExecNonQuery("update anagra set scop =0,scov=0, list1 =" & vExecQuerySingleResult2.Trim.Replace(",", ".") & " where codint ='" & cursorWrapper4.GetString("codint") & "'")
		Next
		Main.vSql1.ExecNonQuery("delete from offerteUniandro where adata <'" & vTmp & "'")
	End If
	cursorWrapper4.Close
End Sub

Sub Sub070(str As String)
	Dim list As List
	list.Initialize
	list.AddAll(File.ListFiles(str))
	Initialize
	Dim size As Int = list.Size - 1
	Dim i As Int
	For i = 0 To size
		Dim vObjectToString As String = list.Get(i)
		If vObjectToString.EndsWith(".txt") Or vObjectToString.EndsWith(".tmp") Then
			File.Delete(str, vObjectToString)
		End If
	Next
End Sub

Sub Sub071(cursorWrapper As Cursor, cursorWrapper2 As Cursor)
	Main.vSql1.ExecNonQuery("update Ventmp set noscontoF=0 where noscontoF=1")
	If cursorWrapper.IsInitialized Then
		cursorWrapper.Close
	End If
	If cursorWrapper2.IsInitialized Then
		cursorWrapper2.Close
		Return
	End If
End Sub

Sub Sub072
	If vMap4.IsInitialized And vMap4.Size > 0 Then
		Dim str As String = ""
		Dim size As Int = vMap4.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim vObjectToNumber As Int = vMap4.GetValueAt(i)
			Dim vObjectToString As String = vMap4.GetKeyAt(i)
			If vObjectToNumber > 0 Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from MacroHead where codice = " & vObjectToString) > 0 Then
					Dim str2 As String = "1 volta"
					If vObjectToNumber > 1 Then
						str2 = vObjectToNumber & " volte"
					End If
					Dim sb As String = str & Main.vSql1.ExecQuerySingleResult("Select descrizione from MacroHead where codice = " & vObjectToString) & " (" & str2 & ")" & CRLF
					Dim i2 As Int = vObjectToNumber - 1
					Dim i3 As Int
					For i3 = 0 To i2
						CallSub2(Main, "EseguiMacro", vObjectToString)
					Next
					str = sb
				End If
			End If
		Next
		If str <> "" Then
			Dim cSBuilder As CSBuilder
			Dim vSize As CSBuilder = cSBuilder.Initialize.Size(24)
			vSize.Color(-65536).Append("Messaggio Fidelity").Append(CRLF).Pop
			cSBuilder.Size(20).Append("Sono state eseguite le seguenti macro:").Append(CRLF)
			cSBuilder.Size(16).Append(str).PopAll
			Dim vObjectToCharSequence As Object = cSBuilder
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2Async(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1, True)
			Return
		End If
		Return
	End If
End Sub

Sub Sub073
	If vInt4 > 0 Then
		Dim parseDouble As Double = Main.vSql1.ExecQuerySingleResult("select case when sum(importo) is null then 0 else sum(importo) end as tot from Ventmp where codint ='ric'")
		If parseDouble > 0 Then
			Dim vRound2 As Double = Round2(parseDouble * vInt4 / 100, 2)
			If vRound2 > 0 Then
				If Not( = Null) Then
					 = 
				End If
				CallSub2(Main, "AddRicaricaFid", vRound2)
				Dim cSBuilder As CSBuilder
				Dim vSize As CSBuilder = cSBuilder.Initialize.Size(24)
				vSize.Color(-65536).Append("Messaggio Fidelity").Append(CRLF).Pop
				cSBuilder.Size(20).Append("E' stata eseguita una maggiorazione ricarica di " & NumberFormat2(vRound2, 1, 2, 2, False) & " €").Append(CRLF)
				ToastMessageShow(cSBuilder.PopAll, True)
				Return
			End If
			Return
		End If
		Return
	End If
End Sub

Sub Sub074(z As Boolean) As Boolean
	Dim i As Int
	Try
		vStr2 = "Sub EsportaKeyboard"
		If z Then
			Dim vObjectToCharSequence As Object = "Confermi l'esportazione della configurazione della tastiera nel file " & CRLF & File.DirRootExternal & "/keyboard.txt ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			i = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		Else
			i = -1
		End If
		If i = -1 Then
			Dim randomAccessFile As RandomAccessFile
			If File.Exists(File.DirRootExternal, "keyboard.txt") Then
				File.Delete(File.DirRootExternal, "keyboard.txt")
			End If
			randomAccessFile.Initialize2(File.DirRootExternal, "keyboard.txt", False, False)
			randomAccessFile.WriteObject("anagra", True, randomAccessFile.CurrentPosition)
			Dim map As Map
			map.Initialize
			map.Put("Programma", Main.vStr8)
			map.Put("Versione", "1")
			map.Put("nRows", Main.vInt12)
			map.Put("nRowGrid", Main.vInt14)
			map.Put("nCols", Main.vInt13)
			map.Put("nColGrid", Main.vInt15)
			If z Then
				ProgressDialogShow2("Esportazione in corso ...", False)
			End If
			DoEvents
			DoEvents
			randomAccessFile.WriteObject(map, True, randomAccessFile.CurrentPosition)
			Dim list As List
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select chiave from pagine ")
			If cursorWrapper2.RowCount > 0 Then
				randomAccessFile.WriteObject("pagine", True, randomAccessFile.CurrentPosition)
				list.Initialize
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount
					cursorWrapper2.Position = i2
					Dim vTmp As Map = dbutil.Sub006(Main.vSql1, "Select * from pagine where chiave =" & SmartStringFormatter("", cursorWrapper2.GetString("chiave")) & "", Null)
					If vTmp.ContainsKey("chiave") Then
						vTmp.Remove("chiave")
					End If
					list.Add(vTmp)
				Next
				randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
			End If
			cursorWrapper2.Close
			If z Then
				ProgressDialogHide
				Dim vObjectToCharSequence3 As Object = "Esportazione tastiera ultimata."
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			End If
		End If
		If z Then
			Sub081()
		End If
		Return True
	Catch
		If z Then
			ProgressDialogHide
		End If
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub075 As Boolean
	If Main.vInt20 = 0 Then
		Dim vObjectToCharSequence As Object = "Non si dispone della licenza necessaria."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return False
	End If
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from Palmari where Attivo = 1") = 0 Then
		Dim vObjectToCharSequence3 As Object = "Prima di inviare l'anagrafica è necessario attivare almeno un palmare in configurazione."
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		Return False
	End If
	ProgressDialogShow2("Esportazione dati in corso ...", False)
	DoEvents
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from Palmari order by Serial")
	Dim cursorWrapper3 As Cursor
	Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select codint as codice,list1,list2,list3,list4,codint,bvar,anagra.nVariazioni, anagra.descrizione,reparto,reparto as gruppo,'NESSUNO' as gruppo2,'NESSUNO' as gruppo3,'NESSUNO' as gruppo4,'NESSUNO' as gruppo5,variazioni as flgArtReparto,flgvar,'0' as flgNoreso,stampasubito,anagra.indice,gruppov,variazioni,fraziona,variazioniauto,obbligoprz,obbligodes,obbligoqta,reparti.TurnoP as TP,(select count(*) from ArtBloccati where ArtBloccati.codint = anagra.codint) as Locked   from anagra inner join reparti on reparti.codice=anagra.reparto where  reparti.Palmari =1  and (flgusointerno = 0 or substr(codint,1,3)='msg' or substr(codint,1,3)='mnu' or substr(codint,1,3)='srv') order by upper(anagra.descrizione)")
	Dim str As String = "Select * from operatori where codice <10 order by codice"
	If Main.v_opextended Then
		str = "Select * from operatori order by codice"
	End If
	Dim cursorWrapper5 As Cursor
	Dim cursorWrapper6 As Cursor = Main.vSql1.ExecQuery(str)
	Dim cursorWrapper7 As Cursor
	Dim cursorWrapper8 As Cursor = Main.vSql1.ExecQuery("select * from MenuCard Order by Scancode")
	Dim cursorWrapper9 As Cursor
	Dim cursorWrapper10 As Cursor = Main.vSql1.ExecQuery("select tavolo from tavoli order by tavolo")
	Dim cursorWrapper11 As Cursor
	Dim cursorWrapper12 As Cursor = Main.vSql1.ExecQuery("Select * from GruppiVariazioniArt")
	Dim cursorWrapper13 As Cursor
	Dim cursorWrapper14 As Cursor = Main.vSql1.ExecQuery("Select * from Despagine where codice >=10 and nopalmari=0 and codice <100")
	Dim cursorWrapper15 As Cursor
	Dim cursorWrapper16 As Cursor = Main.vSql1.ExecQuery("Select * from Despagine where codice >=100")
	Dim cursorWrapper17 As Cursor
	Dim cursorWrapper18 As Cursor = Main.vSql1.ExecQuery("select codint,codice from allergeniplu  order by codice")
	Dim cursorWrapper19 As Cursor
	Dim cursorWrapper20 As Cursor = Main.vSql1.ExecQuery("select codice,descrizione,tag from allergeni  order by allergeni.codice")
	Dim cursorWrapper21 As Cursor
	Dim cursorWrapper22 As Cursor = Main.vSql1.ExecQuery("select ingredientiplu.codint,descrizione from ingredienti inner join ingredientiplu on ingredienti.codice = ingredientiplu.codice  order by ingredienti.codice")
	Dim cursorWrapper23 As Cursor
	Dim cursorWrapper24 As Cursor = Main.vSql1.ExecQuery("select codmnu,codint,descrizione,prezzo,indice,desreparto,auto from dettmnu where  mnuattivo=1 ")
	Dim cursorWrapper25 As Cursor
	Dim cursorWrapper26 As Cursor = Main.vSql1.ExecQuery("select codint,codintvar from varauto ")
	Dim cursorWrapper27 As Cursor
	Dim cursorWrapper28 As Cursor = Main.vSql1.ExecQuery("select * from gruppovar ")
	Try
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			If cursorWrapper2.GetInt("Attivo") <> 0 Then
				Dim sb2 As String = Main.vStr7 & "/" & cursorWrapper2.GetString("Serial") & "/TMP"
				If File.Exists(sb2, "dati.csv") Then
					File.Delete(sb2, "dati.csv")
				End If
				Dim list As List
				list.Initialize
				list.Add("Inizio," & Main.vSql1.ExecQuerySingleResult("select count(*) from Despagine where obbligocoperti =1"))
				list.Add("conf," & Main.vSql1.ExecQuerySingleResult("select count(*) from Despagine where obbligocoperti =1"))
				list.Add("conf," & Main.v_frazionaconimporto & "_" & Main.v_tipofrazionamentovariazioni & "_" & Main.v_valorizzazioneprezzofrazione)
				list.Add("conf,1")
				list.Add("conf," & Main.v_dalle(0) & "_" & Main.v_dalle(1) & "_" & Main.v_dalle(2) & "_" & Main.v_dalle(3) & "_" & Main.v_dalle(4) & "_" & Main.v_dalle(5) & "_" & Main.v_dalle(6) & "_" & Main.v_dalle(7))
				list.Add("conf," & Main.v_alle(0) & "_" & Main.v_alle(1) & "_" & Main.v_alle(2) & "_" & Main.v_alle(3) & "_" & Main.v_alle(4) & "_" & Main.v_alle(5) & "_" & Main.v_alle(6) & "_" & Main.v_alle(7))
				list.Add("conf," & Main.v_listinoh(0) & "_" & Main.v_listinoh(1) & "_" & Main.v_listinoh(2) & "_" & Main.v_listinoh(3) & "_" & Main.v_listinoh(4) & "_" & Main.v_listinoh(5) & "_" & Main.v_listinoh(6) & "_" & Main.v_listinoh(7) & "_" & Main.v_iniziogiorno)
				list.Add("conf," & cursorWrapper2.GetString("Preconto"))
				list.Add("conf," & IIf(Main.v_turni, "1", "0"))
				list.Add("conf," & cursorWrapper2.GetString("AttivaBT"))
				list.Add("conf," & IIf(Main.v_varautocp, "1", "0"))
				list.Add("conf," & IIf(Main.v_gestcoperti2, "1", "0"))
				list.Add("conf," & IIf(Main.v_sottoconti, "1", "0"))
				list.Add("conf," & Main.v_maximpo)
				list.Add("conf," & Main.v_numerott)
				list.Add("conf," & Main.v_prefissott)
				list.Add("conf,0")
				list.Add("conf," & IIf(Main.v_visualizzavariazioni, "1", "0"))
				list.Add("conf," & IIf(Main.vccefdll1.vBln13, "1", "0"))
				list.Add("conf," & Main.vSql1.ExecQuerySingleResult("Select count(*) FROM pagamenti where pagamentopalmare=1 and (RTPagamento=8 or RTPagamento=3)"))
				list.Add("conf," & Main.v_matricola)
				list.Add("conf," & IIf(Main.v_attivakeyhttp, "1", "0"))
				If cursorWrapper4.RowCount > 0 Then
					Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
					Dim i2 As Int
					For i2 = 0 To rowCount2
						cursorWrapper4.Position = i2
						Dim doubleValue As Double = cursorWrapper4.GetDouble("list2")
						Dim doubleValue2 As Double = cursorWrapper4.GetDouble("list3")
						Dim doubleValue3 As Double = cursorWrapper4.GetDouble("list4")
						cursorWrapper4.GetDouble("list1")
						Dim doubleValue4 As Double = cursorWrapper4.GetDouble("list2")
						If cursorWrapper4.GetInt("bvar") = 1 Then
							If Main.v_listmolto > 0 Then
								Dim doubleValue5 As Double = cursorWrapper4.GetDouble("list1")
								doubleValue2 = Round2(doubleValue5 * (1 + Main.v_listmolto / 100), 2)
							End If
							If Main.v_listpoco > 0 Then
								Dim doubleValue6 As Double = cursorWrapper4.GetDouble("list1")
								Dim doubleValue7 As Double = cursorWrapper4.GetDouble("list1")
								doubleValue3 = Round2(doubleValue6 - doubleValue7 * Main.v_listpoco / 100, 2)
							Else
								doubleValue3 = cursorWrapper4.GetDouble("list1")
							End If
						End If
						Dim vNumberToString As String = doubleValue
						Dim vNumberToString2 As String = doubleValue2
						Dim vNumberToString3 As String = doubleValue3
						Dim vNumberToString4 As String = doubleValue4
						Dim vGetString As String = cursorWrapper4.GetString("codint")
						If cursorWrapper4.GetInt("bvar") = 1 Then
							vGetString = "vv" & cursorWrapper4.GetString("codint")
						Else If vGetString = "888888" Then
							vGetString = "coperto"
						Else If vGetString = "888889" Then
							vGetString = "coperto2"
						End If
						list.Add("anagra," & cursorWrapper4.GetString("codint") & "," & cursorWrapper4.GetString("descrizione").Replace("'", "").Replace(",", "") & "," & cursorWrapper4.GetString("reparto") & "," & cursorWrapper4.GetString("gruppo") & "," & cursorWrapper4.GetString("gruppo2") & "," & cursorWrapper4.GetString("gruppo3") & "," & cursorWrapper4.GetString("gruppo4") & "," & cursorWrapper4.GetString("gruppo5") & "," & cursorWrapper4.GetString("list1").Trim.Replace(",", ".") & "," & vNumberToString.Trim.Replace(",", ".") & "," & vNumberToString2.Trim.Replace(",", ".") & "," & vNumberToString3.Trim.Replace(",", ".") & "," & vNumberToString4.Trim.Replace(",", ".") & "," & vGetString & "," & cursorWrapper4.GetString("flgvar") & "," & cursorWrapper4.GetString("flgArtReparto") & "," & cursorWrapper4.GetString("flgNoreso") & "," & "0," & cursorWrapper4.GetString("stampasubito") & "," & cursorWrapper4.GetString("indice") & "," & cursorWrapper4.GetString("gruppov") & "," & cursorWrapper4.GetString("variazioni") & "," & cursorWrapper4.GetString("fraziona") & "," & cursorWrapper4.GetString("obbligoprz") & "," & cursorWrapper4.GetString("obbligoqta") & "," & cursorWrapper4.GetString("TP") & "," & cursorWrapper4.GetString("Locked") & "," & cursorWrapper4.GetString("obbligodes") & "," & cursorWrapper4.GetString("variazioniauto") & "," & cursorWrapper4.GetString("nVariazioni"))
						DoEvents
					Next
				End If
				If cursorWrapper26.RowCount > 0 Then
					Dim rowCount3 As Int = cursorWrapper26.RowCount - 1
					Dim i3 As Int
					For i3 = 0 To rowCount3
						cursorWrapper26.Position = i3
						list.Add("varauto," & cursorWrapper26.GetString("codint") & "," & cursorWrapper26.GetString("codintvar").Trim)
					Next
				End If
				If cursorWrapper28.RowCount > 0 Then
					Dim rowCount4 As Int = cursorWrapper28.RowCount - 1
					Dim i4 As Int
					For i4 = 0 To rowCount4
						cursorWrapper28.Position = i4
						list.Add("gruppi," & cursorWrapper28.GetString("codice") & "," & cursorWrapper28.GetString("vEsclusive") & "," & cursorWrapper28.GetString("descrizione") & "," & cursorWrapper28.GetString("indice"))
					Next
				End If
				If cursorWrapper8.RowCount > 0 Then
					Dim rowCount5 As Int = cursorWrapper8.RowCount - 1
					Dim i5 As Int
					For i5 = 0 To rowCount5
						cursorWrapper8.Position = i5
						list.Add("Menucard," & IIf(cursorWrapper8.GetString("Descrizione").Trim = "", "0", cursorWrapper8.GetString("Descrizione").Trim) & "," & cursorWrapper8.GetInt("Scancode") + 61 & "," & cursorWrapper8.GetString("Tipo").Trim & "," & cursorWrapper8.GetString("Codice").Trim & "," & cursorWrapper8.GetString("LocationSize").Trim.Replace(",", ".") & "," & "," & IIf(cursorWrapper8.GetString("BtnStyle").Trim = "", "0", cursorWrapper8.GetString("BtnStyle").Trim))
					Next
				End If
				If cursorWrapper10.RowCount > 0 Then
					Dim rowCount6 As Int = cursorWrapper10.RowCount - 1
					Dim i6 As Int
					For i6 = 0 To rowCount6
						cursorWrapper10.Position = i6
						Dim vNumberToString5 As String = 10
						If Main.vSql1.ExecQuerySingleResult("select count(*) from pagine where pagina >=10  and pagina <100 and valore = " & cursorWrapper10.GetString("tavolo") & " and tipo = 9") > 0 Then
							vNumberToString5 = Main.vSql1.ExecQuerySingleResult("select pagina from pagine where pagina >=10  and pagina <100 and valore = " & cursorWrapper10.GetString("tavolo") & " and tipo = 9 limit 1")
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from Despagine where nopalmari=0 and codice =" & vNumberToString5) <> 0 Then
							list.Add("tavoli," & cursorWrapper10.GetString("tavolo") & "," & vNumberToString5)
						End If
					Next
				End If
				If cursorWrapper6.RowCount > 0 Then
					Dim rowCount7 As Int = cursorWrapper6.RowCount - 1
					Dim i7 As Int
					For i7 = 0 To rowCount7
						cursorWrapper6.Position = i7
						Dim str2 As String = "11111111"
						If cursorWrapper6.GetString("pwd") <> "11111" Then
							str2 = cursorWrapper6.GetString("pwd")
						End If
						Dim vGetString2 As String = cursorWrapper6.GetString("funzioni")
						Dim vGetString3 As String = cursorWrapper6.GetString("funzioni")
						list.Add("operatori," & cursorWrapper6.GetString("codice") & "," & cursorWrapper6.GetString("descrizione") & "," & str2 & "," & IIf(Sub026(cursorWrapper6.GetString("funzioni"), 35), "1", "0") & "," & IIf(Sub026(vGetString2, Main.f_cancellatutto), "1", "0") & "," & IIf(Sub026(cursorWrapper6.GetString("funzioni"), 35), "1", "0") & "," & "1," & IIf(Sub026(vGetString3, Main.f_variaprezzo), "1", "0") & "," & "1," & "1," & "1," & cursorWrapper6.GetString("Attivo"))
					Next
				End If
				If cursorWrapper12.RowCount > 0 Then
					Dim rowCount8 As Int = cursorWrapper12.RowCount - 1
					Dim i8 As Int
					For i8 = 0 To rowCount8
						cursorWrapper12.Position = i8
						list.Add("GruppiVariazioniArt," & cursorWrapper12.GetString("reparto") & "," & cursorWrapper12.GetString("codint"))
					Next
				End If
				Dim cursorWrapper29 As Cursor
				Dim cursorWrapper30 As Cursor = Main.vSql1.ExecQuery("select reparto from filtristampeBT where codice = " & cursorWrapper2.GetString("Serial"))
				If cursorWrapper30.RowCount > 0 Then
					Dim rowCount9 As Int = cursorWrapper30.RowCount - 1
					Dim i9 As Int
					For i9 = 0 To rowCount9
						cursorWrapper30.Position = i9
						list.Add("FiltriBT," & cursorWrapper30.GetString("reparto"))
					Next
				End If
				If cursorWrapper14.RowCount > 0 Then
					Dim rowCount10 As Int = cursorWrapper14.RowCount - 1
					Dim i10 As Int
					For i10 = 0 To rowCount10
						cursorWrapper14.Position = i10
						list.Add("Despagine," & cursorWrapper14.GetString("codice") & "," & cursorWrapper14.GetString("obbligocoperti") & "," & cursorWrapper14.GetString("listinocoperti") & "," & cursorWrapper14.GetString("listino") & "," & cursorWrapper14.GetString("servizio"))
					Next
				End If
				If cursorWrapper22.RowCount > 0 Then
					Dim rowCount11 As Int = cursorWrapper22.RowCount - 1
					Dim i11 As Int
					For i11 = 0 To rowCount11
						cursorWrapper22.Position = i11
						list.Add("Ingredienti," & cursorWrapper22.GetString("codint") & "," & cursorWrapper22.GetString("descrizione"))
					Next
				End If
				If cursorWrapper18.RowCount > 0 Then
					Dim rowCount12 As Int = cursorWrapper18.RowCount - 1
					Dim i12 As Int
					For i12 = 0 To rowCount12
						cursorWrapper18.Position = i12
						list.Add("Allergeni," & cursorWrapper18.GetString("codint") & "," & cursorWrapper18.GetString("codice"))
					Next
				End If
				If cursorWrapper20.RowCount > 0 Then
					Dim rowCount13 As Int = cursorWrapper20.RowCount - 1
					Dim i13 As Int
					For i13 = 0 To rowCount13
						cursorWrapper20.Position = i13
						list.Add("Allergenitab," & cursorWrapper20.GetString("codice") & "," & cursorWrapper20.GetString("descrizione") & "," & cursorWrapper20.GetString("tag"))
					Next
				End If
				If cursorWrapper24.RowCount > 0 Then
					Dim rowCount14 As Int = cursorWrapper24.RowCount - 1
					Dim i14 As Int
					For i14 = 0 To rowCount14
						cursorWrapper24.Position = i14
						list.Add("Menu," & cursorWrapper24.GetString("codmnu") & "," & cursorWrapper24.GetString("codint") & "," & cursorWrapper24.GetString("descrizione") & "," & cursorWrapper24.GetString("prezzo") & "," & cursorWrapper24.GetString("indice") & "," & cursorWrapper24.GetString("desreparto") & "," & cursorWrapper24.GetString("auto"))
					Next
				End If
				If cursorWrapper16.RowCount > 0 Then
					Dim rowCount15 As Int = cursorWrapper16.RowCount - 1
					Dim i15 As Int
					For i15 = 0 To rowCount15
						cursorWrapper16.Position = i15
						list.Add("DespagineTessere," & cursorWrapper16.GetString("codice") & "," & cursorWrapper16.GetString("daTavolo") & "," & cursorWrapper16.GetString("aTavolo") & "," & cursorWrapper16.GetString("MaxImporto") & "," & cursorWrapper16.GetString("ImportoIngresso") & "," & cursorWrapper16.GetString("listino"))
					Next
				End If
				Dim randomAccessFile As RandomAccessFile
				randomAccessFile.Initialize(sb2, "dati.csv", False)
				Dim object As List = list
				randomAccessFile.WriteEncryptedObject(object, Sub221(File.ReadString(File.DirAssets, "01-01-StrutturaRicevuta.txt"), "nf0èc2m3c3f xc"), randomAccessFile.CurrentPosition)
				randomAccessFile.Close
				If File.Exists(sb2, "dati.csv") Then
					File.Copy(sb2, "dati.csv", Main.vStr7 & "/" & cursorWrapper2.GetString("Serial"), "dati.csv")
					Dim strArr() As String = Array("dati.csv")
					Dim archiverForB4A As ArchiverForB4A
					Dim sb5 As String = Main.vStr7 & "/" & cursorWrapper2.GetString("Serial")
					archiverForB4A.ZipFiles(sb5, strArr, Main.vStr7 & "/" & cursorWrapper2.GetString("Serial"), "dati.zip", "")
				End If
			End If
		Next
		ProgressDialogHide
		cursorWrapper6.Close
		cursorWrapper8.Close
		cursorWrapper10.Close
		cursorWrapper12.Close
		cursorWrapper16.Close
		cursorWrapper14.Close
		cursorWrapper22.Close
		cursorWrapper24.Close
		cursorWrapper26.Close
		cursorWrapper28.Close
		cursorWrapper2.Close
		Return True
	Catch
		If Not( = Null) Then
			 = 
		End If
		ProgressDialogHide
		Return False
	End Try
End Sub

Sub Sub076(str As String) As String
	Dim indexOf As Int = str.IndexOf("-")
	If indexOf > 0 Then
		Return str.SubString2(0, indexOf - 1)
	End If
	Return str
End Sub

Sub Sub077
	Dim i As Int = 1
	Do While True
		Dim i2 As Int = i
		If i2 <= 14 Then
			vStringArr1(i2) = r2(i2).GetStaticField("anywheresoftware.b4a.BA", "packageName")
			If Main.v_temag = 0 Then
				vIntArr1(i2) = r2(i2).GetStaticField(vStringArr1(i2) & ".R$drawable", "btn" & i2)
				vIntArr2(i2) = r2(i2).GetStaticField(vStringArr1(i2) & ".R$drawable", "btn" & i2 & "p")
			Else
				Dim iArr() As Int = vIntArr1
				Dim reflection As Reflector = r2(i2)
				Dim str As String = vStringArr1(i2) & ".R$drawable"
				iArr(i2) = reflection.GetStaticField(str, "btn" & Main.v_temag & "_" & i2)
				Dim iArr2() As Int = vIntArr2
				Dim reflection2 As Reflector = r2(i2)
				Dim str2 As String = vStringArr1(i2) & ".R$drawable"
				iArr2(i2) = reflection2.GetStaticField(str2, "btn" & Main.v_temag & "_" & i2 & "p")
			End If
			r2(i2).Target = r2(i2).GetContext
			r2(i2).Target = r2(i2).RunMethod("getResources")
			i = i2 + 1
		Else
			Return
		End If
	Loop
End Sub

Sub Sub078(z As Boolean)
	Dim cursorWrapper As Cursor
	Try
		Dim list As List
		list.Initialize
		Dim map As Map
		map.Initialize
		If z Then
			Main.vSql1.ExecNonQuery("delete from cassetto")
			Dim cursorWrapper2 As Cursor
			cursorWrapper = Main.vSql2.ExecQuery("Select * from cassetto")
		Else
			Main.vSql2.ExecNonQuery("delete from cassetto")
			Dim cursorWrapper3 As Cursor
			cursorWrapper = Main.vSql1.ExecQuery("Select * from cassetto")
		End If
		Dim rowCount As Int = cursorWrapper.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper.Position = i
			map.Initialize
			map.Put("Operatore", cursorWrapper.GetInt("Operatore"))
			map.Put("TipoAttivita", cursorWrapper.GetString("TipoAttivita"))
			map.Put("Importo", cursorWrapper.GetDouble("Importo"))
			map.Put("PrezzoUnitario", cursorWrapper.GetDouble("PrezzoUnitario"))
			map.Put("NumDistinta", cursorWrapper.GetDouble("NumDistinta"))
			map.Put("Qta", cursorWrapper.GetDouble("Qta"))
			map.Put("DataOra", cursorWrapper.GetString("DataOra"))
			map.Put("memo", cursorWrapper.GetString("memo"))
			map.Put("TipoMoneta", cursorWrapper.GetInt("TipoMoneta"))
			map.Put("Cassa", cursorWrapper.GetInt("Cassa"))
			list.Add(map)
		Next
		If list.Size > 0 And z Then
			dbutil.Sub007(Main.vSql1, "cassetto", list)
		End If
		If list.Size > 0 And Not(z) Then
			dbutil.Sub007(Main.vSql2, "cassetto", list)
		End If
		cursorWrapper.Close
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub079(str As String) As String
	Dim str2 As String
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select cliente,sospeso,datam2,memo from headmov where nmov =  " & str)
		If cursorWrapper2.RowCount > 0 Then
			cursorWrapper2.Position = 0
			Dim vGetString As String = cursorWrapper2.GetString("cliente")
			If IsNumber(vGetString) Then
				Dim cursorWrapper3 As Cursor
				Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice = '" & vGetString & "'")
				If cursorWrapper4.RowCount <= 0 Then
					str2 = ""
				Else
					cursorWrapper4.Position = 0
					str2 = Sub094("", cursorWrapper4, cursorWrapper2)
				End If
				cursorWrapper4.Close
				Return str2
			End If
		End If
		Return ""
	Catch
		Sub217("FillCursCliente: " & LastException.Message)
		Log("FillCursCliente: " & LastException.Message)
		Return ""
	End Try
End Sub

Sub Sub080(randomAccessFile As RandomAccessFile) As Boolean
	Return randomAccessFile.Size <= randomAccessFile.CurrentPosition
End Sub

Sub Sub081
	If Main.vInt9 < 19 Then
		Return
	End If
	Dim reflection As Reflector
	If Not( = Null) Then
		 = 
	End If
	reflection.Target = reflection.GetActivity
	reflection.Target = reflection.RunMethod("getWindow")
	reflection.Target = reflection.RunMethod("getDecorView")
	reflection.RunMethod2("setSystemUiVisibility", 5894, "java.lang.int")
End Sub

Sub Sub082 As String
	Dim byteConverter As ByteConverter
	Dim bArr(0) As Byte
	Dim bArr2(0) As Byte
	Dim keyGeneratorWrapper As KeyGenerator
	Dim cipherWrapper As Cipher
	cipherWrapper.Initialize("DES/CBC/PKCS5Padding")
	cipherWrapper.InitialisationVector = Array As Byte(21, 32, 43, 54, 65, 76, 87, 98)
	keyGeneratorWrapper.Initialize("DES")
	If vByteArr1.Length = 0 Then
		vByteArr1 = byteConverter.StringToBytes(File.ReadString(File.DirAssets, "01-01-StrutturaRicevuta.txt"), "UTF8")
	End If
	keyGeneratorWrapper.KeyFromBytes(vByteArr1)
	Dim vNumberToString As String = Sub058()
	Dim vHexFromBytes As String = byteConverter.HexFromBytes(cipherWrapper.Encrypt(byteConverter.StringToBytes(Main.v_matricola & vNumberToString, "UTF8"), keyGeneratorWrapper.Key, True))
	If vHexFromBytes <> "" Then
		If Main.v_matricola <> "" Then
			If Not(Main.vBln8) Then
				Return vHexFromBytes
			End If
		End If
	End If
	Return ""
End Sub

Sub Sub083(i As Int)
	Try
		Dim vExecQuerySingleResult As String = Main.vSql2.ExecQuerySingleResult("Select valore from progressivi where codice = 'SEND'")
		Dim vTmp As String = modfunstr.Sub003("00000000000" & vExecQuerySingleResult, 10)
		Main.vSql2.ExecNonQuery("update progressivi set valore = valore+1 where codice = 'SEND'")
		Dim vNumberToString As String = i
		Dim str As String = "V" & vTmp & "_" & i & "_0_1_0_0_.txt"
		File.WriteString(Main.vStr17, str, "update tavoli set inmodifica=0 where tavolo =" & vNumberToString)
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub084(sql As SQL, str As String, z As Boolean)
	Dim vExecQuerySingleResult As String
	Dim vExecQuerySingleResult2 As String
	Main.vSql1.ExecNonQuery("delete from TmpFinanziario")
	If str = "" Then
		str = " headmov.sospeso =0 "
	End If
	Dim replace As String = str.Replace(" sospeso =0", " headmov.sospeso=0").Replace(" datam3", " headmov.datam3").Replace(" causale", " headmov.causale")
	Dim str2 As String = ""
	Dim str3 As String = " CausaliPagamenti.NonRiscosso "
	If sql = Main.vSql1 Then
		str2 = " inner join pagamenti on pagamenti.codice=CausaliPagamenti.codice "
		str3 = " pagamenti.cassa "
	End If
	If sql.ExecQuerySingleResult("Select count(*) from CausaliPagamenti inner join headmov on headmov.nmov = CausaliPagamenti.nmov " & SmartStringFormatter("", str2) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Where headmov.flgNF =0 and causalipagamenti.codice <>30 And headmov.nfat =0 And headmov.nric =0 And " & SmartStringFormatter("", str3) & "=0 " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " And " & SmartStringFormatter("", replace) & " and CausaliPagamenti.sospeso=0") > 0 Then
		Dim parseDouble As Double = sql.ExecQuerySingleResult("Select count(distinct(headmov.nmov)) as qta from CausaliPagamenti inner join headmov on headmov.nmov = CausaliPagamenti.nmov " & SmartStringFormatter("", str2) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where headmov.flgNF =0 and causalipagamenti.codice <>30  AND headmov.nfat =0 AND headmov.nric =0 AND " & SmartStringFormatter("", str3) & "=0 " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " and " & SmartStringFormatter("", replace) & " and CausaliPagamenti.sospeso=0")
		Dim parseDouble2 As Double = sql.ExecQuerySingleResult("Select round(sum(importo)-sum(headmov.totaleNF),2) from CausaliPagamenti inner join headmov on headmov.nmov = CausaliPagamenti.nmov " & SmartStringFormatter("", str2) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where headmov.flgNF =0 and causalipagamenti.codice <>30  AND headmov.nfat =0 AND headmov.nric =0 AND " & SmartStringFormatter("", str3) & "=0 " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " and " & SmartStringFormatter("", replace) & "")
		Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(1,'Scontrino'," & SmartStringFormatter("", parseDouble) & "," & SmartStringFormatter("", parseDouble2) & ")")
	End If
	If sql.ExecQuerySingleResult("Select count(*) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nfat >0 and " & TAB & SmartStringFormatter("", replace) & "") > 0 Then
		Dim parseDouble3 As Double = sql.ExecQuerySingleResult("Select count(distinct(headmov.nmov)) as qta from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nfat >0 and " & TAB & SmartStringFormatter("", replace) & "")
		Dim parseDouble4 As Double = sql.ExecQuerySingleResult("Select sum(importo) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nfat >0 and " & TAB & SmartStringFormatter("", replace) & "")
		If sql = Main.vSql1 Then
			vExecQuerySingleResult2 = sql.ExecQuerySingleResult("select 'Fattura(da ' ||  (select min(nfat) from headmov where nfat >0)  || ' a ' ||  (select max(nfat) from headmov where nfat >0) || ')'")
		Else
			vExecQuerySingleResult2 = sql.ExecQuerySingleResult("select 'Fattura(da ' ||  (select min(nfat) from headmov where nfat >0 and " & SmartStringFormatter("", replace) & ")  || ' a ' ||  (select max(nfat) from headmov where nfat >0 and " & SmartStringFormatter("", replace) & ") || ')'")
		End If
		Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(2,'" & SmartStringFormatter("", vExecQuerySingleResult2) & "'," & SmartStringFormatter("", parseDouble3) & "," & SmartStringFormatter("", parseDouble4) & ")")
	End If
	If sql.ExecQuerySingleResult("Select count(*) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nric >0 and " & TAB & SmartStringFormatter("", replace) & "") > 0 Then
		Dim parseDouble5 As Double = sql.ExecQuerySingleResult("Select sum(qta) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nric >0 and " & TAB & SmartStringFormatter("", replace) & "")
		Dim parseDouble6 As Double = sql.ExecQuerySingleResult("Select sum(importo) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nric >0 and " & TAB & SmartStringFormatter("", replace) & "")
		If sql = Main.vSql1 Then
			vExecQuerySingleResult = sql.ExecQuerySingleResult("select 'Ricevuta(da ' ||  (select min(nric) from headmov where nric >0)  || ' a ' ||  (select max(nric) from headmov where nric >0) || ')'")
		Else
			vExecQuerySingleResult = sql.ExecQuerySingleResult("select 'Ricevuta(da ' ||  (select min(nric) from headmov where nric >0 and " & SmartStringFormatter("", replace) & ")  || ' a ' ||  (select max(nric) from headmov where nric >0 and " & SmartStringFormatter("", replace) & ") || ')'")
		End If
		Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(3,'" & SmartStringFormatter("", vExecQuerySingleResult) & "'," & SmartStringFormatter("", parseDouble5) & "," & SmartStringFormatter("", parseDouble6) & ")")
	End If
	If sql.ExecQuerySingleResult("Select count(*) from CausaliPagamenti inner join headmov on headmov.nmov = CausaliPagamenti.nmov " & SmartStringFormatter("", str2) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where headmov.flgNF =0 AND headmov.nfat =0 AND headmov.nric =0 AND " & SmartStringFormatter("", str3) & ">0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and CausaliPagamenti.sospeso=0") > 0 Then
		Dim parseDouble7 As Double = sql.ExecQuerySingleResult("Select count(distinct(headmov.nmov)) as qta from CausaliPagamenti inner join headmov on headmov.nmov = CausaliPagamenti.nmov " & SmartStringFormatter("", str2) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where headmov.flgNF =0 AND headmov.nfat =0 AND headmov.nric =0 AND " & SmartStringFormatter("", str3) & ">0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and CausaliPagamenti.sospeso=0")
		Dim d As Double = 0
		Dim cursorWrapper As Cursor = sql.ExecQuery("Select sum(importo) as importo,CausaliPagamenti.nmov as nmov from CausaliPagamenti inner join headmov on headmov.nmov = CausaliPagamenti.nmov " & SmartStringFormatter("", str2) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where headmov.flgNF =0 AND headmov.nfat =0 AND headmov.nric =0 AND " & SmartStringFormatter("", str3) & ">0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and CausaliPagamenti.sospeso=0 group by CausaliPagamenti.nmov")
		Dim rowCount As Int = cursorWrapper.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper.Position = i
			d = d + cursorWrapper.GetDouble("importo")
			If cursorWrapper.GetDouble("importo") > sql.ExecQuerySingleResult("Select totale from headmov where nmov = " & SmartStringFormatter("", cursorWrapper.GetString("nmov")) & "") Then
				Dim str4 As String = "Select count(*) from CausaliPagamenti as cp2" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "Where  cp2.nmov = " & SmartStringFormatter("", cursorWrapper.GetString("nmov")) & " and cp2.codice=30 and cp2.importo <0 "
				If sql.ExecQuerySingleResult(str4) > 0 Then
					d = d + sql.ExecQuerySingleResult(str4.Replace("count(*)", "sum(importo)"))
				End If
			End If
		Next
		Dim vRound2 As Double = Round2(d, 2)
		cursorWrapper.Close
		Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(4,'Scontrino a Credito'," & SmartStringFormatter("", parseDouble7) & "," & SmartStringFormatter("", vRound2) & ")")
	End If
	Dim vTmp As Double = Sub024(sql, "Select count(distinct(headmov.nmov)) as T,reparto from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1  and " & SmartStringFormatter("", replace) & " group by reparto", "1")
	If vTmp > 0 Then
		Dim vTmp_ As Double = Sub024(sql, "Select sum(importo) as T,reparto from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1   and " & SmartStringFormatter("", replace) & " group by reparto", "1")
		Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(5,'Non Fiscale'," & SmartStringFormatter("", vTmp) & "," & SmartStringFormatter("", vTmp_) & ")")
	End If
	If Not(z) Then
		Dim vTmp__ As Double = Sub024(sql, "Select count(distinct(headmov.nmov)) as T,reparto from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1 and " & TAB & SmartStringFormatter("", replace) & "  group by reparto", "0")
		If vTmp__ > 0 Then
			Dim vTmp___ As Double = Sub024(sql, "Select sum(importo) as T,reparto from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1 and " & TAB & SmartStringFormatter("", replace) & "  group by reparto", "0")
			Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(6,'Altro'," & SmartStringFormatter("", vTmp__) & "," & SmartStringFormatter("", vTmp___) & ")")
			Return
		End If
		Return
	End If
End Sub

Sub Sub085(sql As SQL, str As String)
	Dim vExecQuerySingleResult As String
	Dim vExecQuerySingleResult2 As String
	Main.vSql1.ExecNonQuery("delete from TmpFinanziario")
	Dim replace As String = str.Replace(" sospeso =0", " headmov.sospeso=0").Replace(" datam3", " headmov.datam3").Replace(" causale", " headmov.causale")
	Dim str2 As String = "(Select COUNT(*) FROM CausaliPagamenti Where CausaliPagamenti.NonRiscosso=1 AND CausaliPagamenti.nmov = headmov.nmov)"
	If sql = Main.vSql1 Then
		str2 = "(Select COUNT(*) FROM CausaliPagamenti inner join pagamenti on pagamenti.codice=CausaliPagamenti.codice Where Pagamenti.cassa=1 AND CausaliPagamenti.nmov = headmov.nmov)"
	End If
	Dim i As Int
	For i = 1 To 9
		Main.vCur1.Position = i - 1
		If Main.v_numcassa <> i Then
			If Main.vCur1.GetInt("stato") = 0 Then
			End If
		End If
		If sql.ExecQuerySingleResult("Select count(*) from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =0 AND venduto.nfat =0 AND venduto.nric =0 AND " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", str2) & "=0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i) & "") > 0 Then
			Dim parseDouble As Double = sql.ExecQuerySingleResult("Select count(distinct(headmov.nmov)) as qta from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =0 AND venduto.nfat =0 AND venduto.nric =0 AND " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", str2) & "=0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i) & "")
			Dim parseDouble2 As Double = sql.ExecQuerySingleResult("Select sum(importo) from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =0 AND venduto.nfat =0 AND venduto.nric =0 AND " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", str2) & "=0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i) & "")
			Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(10+" & SmartStringFormatter("", i) & ",'Scontrino C." & SmartStringFormatter("", i) & "'," & SmartStringFormatter("", parseDouble) & "," & SmartStringFormatter("", parseDouble2) & ")")
		End If
	Next
	Dim i2 As Int = 1
	Do While True
		Dim i3 As Int = i2
		If i3 > 9 Then
			Exit
		End If
		Main.vCur1.Position = i3 - 1
		If Main.v_numcassa <> i3 Then
			If Main.vCur1.GetInt("stato") = 0 Then
				i2 = i3 + 1
			End If
		End If
		If sql.ExecQuerySingleResult("Select count(*) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nfat >0 and " & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i3) & "") > 0 Then
			Dim parseDouble3 As Double = sql.ExecQuerySingleResult("Select count(distinct(headmov.nmov)) as qta from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nfat >0 and " & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i3) & "")
			Dim parseDouble4 As Double = sql.ExecQuerySingleResult("Select sum(importo) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nfat >0 and " & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i3) & "")
			If sql = Main.vSql1 Then
				vExecQuerySingleResult2 = sql.ExecQuerySingleResult("select 'Fattura(da ' ||  (select min(nfat) from headmov where nfat >0  and headmov.cassa=" & SmartStringFormatter("", i3) & ")  || ' a ' ||  (select max(nfat) from headmov where nfat >0  and headmov.cassa=" & SmartStringFormatter("", i3) & ") || ')' || ' C." & SmartStringFormatter("", i3) & "'")
			Else
				vExecQuerySingleResult2 = sql.ExecQuerySingleResult("select 'Fattura(da ' ||  (select min(nfat) from headmov where nfat >0 and " & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i3) & ")  || ' a ' ||  (select max(nfat) from headmov where nfat >0  and headmov.cassa=" & SmartStringFormatter("", i3) & ") || ')' || ' C." & SmartStringFormatter("", i3) & "'")
			End If
			Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(20+" & SmartStringFormatter("", i3) & ",'" & SmartStringFormatter("", vExecQuerySingleResult2) & "'," & SmartStringFormatter("", parseDouble3) & "," & SmartStringFormatter("", parseDouble4) & ")")
		End If
		i2 = i3 + 1
	Loop
	Dim i4 As Int = 1
	Do While True
		Dim i5 As Int = i4
		If i5 > 9 Then
			Exit
		End If
		Main.vCur1.Position = i5 - 1
		If Main.v_numcassa <> i5 Then
			If Main.vCur1.GetInt("stato") = 0 Then
				i4 = i5 + 1
			End If
		End If
		If sql.ExecQuerySingleResult("Select count(*) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nric >0 and " & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i5) & "") > 0 Then
			Dim parseDouble5 As Double = sql.ExecQuerySingleResult("Select sum(qta) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nric >0 and " & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i5) & "")
			Dim parseDouble6 As Double = sql.ExecQuerySingleResult("Select sum(importo) from venduto inner join headmov on headmov.nmov = venduto.nmov" & TAB & "where venduto.nric >0 and " & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i5) & "")
			If sql = Main.vSql1 Then
				vExecQuerySingleResult = sql.ExecQuerySingleResult("select 'Ricevuta(da ' ||  (select min(nric) from headmov where nric >0 and headmov.cassa=" & SmartStringFormatter("", i5) & ")  || ' a ' ||  (select max(nric) from headmov where nric >0 and headmov.cassa=" & SmartStringFormatter("", i5) & ") || ')' || ' C." & SmartStringFormatter("", i5) & "'")
			Else
				vExecQuerySingleResult = sql.ExecQuerySingleResult("select 'Ricevuta(da ' ||  (select min(nric) from headmov where nric >0 and " & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i5) & ")  || ' a ' ||  (select max(nric) from headmov where nric >0 and " & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i5) & ") || ')' || ' C." & SmartStringFormatter("", i5) & "'")
			End If
			Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(30+" & SmartStringFormatter("", i5) & ",'" & SmartStringFormatter("", vExecQuerySingleResult) & "'," & SmartStringFormatter("", parseDouble5) & "," & SmartStringFormatter("", parseDouble6) & ")")
		End If
		i4 = i5 + 1
	Loop
	Dim i6 As Int
	For i6 = 1 To 9
		Main.vCur1.Position = i6 - 1
		If Main.v_numcassa <> i6 Then
			If Main.vCur1.GetInt("stato") = 0 Then
			End If
		End If
		If sql.ExecQuerySingleResult("Select count(*) from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =0 AND venduto.nfat =0 AND venduto.nric =0 AND " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", str2) & ">0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i6) & "") > 0 Then
			Dim parseDouble7 As Double = sql.ExecQuerySingleResult("Select count(distinct(headmov.nmov)) as qta from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =0 AND venduto.nfat =0 AND venduto.nric =0 AND " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", str2) & ">0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i6) & "")
			Dim parseDouble8 As Double = sql.ExecQuerySingleResult("Select sum(importo) from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =0 AND venduto.nfat =0 AND venduto.nric =0 AND " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", str2) & ">0 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i6) & "")
			Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(40+" & SmartStringFormatter("", i6) & ",'Scontrino a Credito C." & SmartStringFormatter("", i6) & "'," & SmartStringFormatter("", parseDouble7) & "," & SmartStringFormatter("", parseDouble8) & ")")
		End If
	Next
	Dim i7 As Int
	For i7 = 1 To 9
		Main.vCur1.Position = i7 - 1
		If Main.v_numcassa <> i7 Then
			If Main.vCur1.GetInt("stato") = 0 Then
			End If
		End If
		If sql.ExecQuerySingleResult("Select count(*) from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1  and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i7) & "") > 0 Then
			Dim vTmp As Double = Sub024(sql, "Select count(distinct(headmov.nmov)) as T,reparto from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i7) & " group by reparto", "1")
			Dim vTmp_ As Double = Sub024(sql, "Select sum(importo) as T,reparto from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1  and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i7) & " group by reparto", "1")
			If vTmp > 0 Then
				Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(50+" & SmartStringFormatter("", i7) & ",'Non Fiscale C." & SmartStringFormatter("", i7) & "'," & SmartStringFormatter("", vTmp) & "," & SmartStringFormatter("", vTmp_) & ")")
			End If
		End If
	Next
	Dim i8 As Int
	For i8 = 1 To 9
		Main.vCur1.Position = i8 - 1
		If Main.v_numcassa <> i8 Then
			If Main.vCur1.GetInt("stato") = 0 Then
			End If
		End If
		If sql.ExecQuerySingleResult("Select count(*) from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1 and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i8) & " ") > 0 Then
			Dim vTmp__ As Double = Sub024(sql, "Select count(distinct(headmov.nmov)) as T,reparto from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1   and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i8) & "   group by reparto", "0")
			Dim vTmp___ As Double = Sub024(sql, "Select sum(importo) as T,reparto from venduto inner join headmov on headmov.nmov = venduto.nmov" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where venduto.flgNF =1   and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", replace) & " and headmov.cassa=" & SmartStringFormatter("", i8) & "   group by reparto", "0")
			If vTmp__ > 0 Then
				Main.vSql1.ExecNonQuery("Insert into TmpFinanziario (codice,descrizione,qta,importo) values(60+" & SmartStringFormatter("", i8) & ",'Altro C." & SmartStringFormatter("", i8) & "'," & SmartStringFormatter("", vTmp__) & "," & SmartStringFormatter("", vTmp___) & ")")
			End If
		End If
	Next
End Sub

Sub Sub086(sql As SQL, str As String, z As Boolean)
	Dim vTmp As Boolean
	Main.vSql1.ExecNonQuery("delete from TmpIva")
	Dim replace As String = str.Replace(" sospeso =0", " headmov.sospeso=0").Replace(" datam3", " headmov.datam3").Replace(" causale", " headmov.causale")
	If sql.ExecQuerySingleResult("select count(*) from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where headmov.nfat=0 and headmov.nric=0 and venduto.flgNF=0 and headmov.flgNF=0 and " & SmartStringFormatter("", replace) & "") > 0 Then
		Dim cursorWrapper As Cursor = sql.ExecQuery("select 'Scontrini' as Codice,i.descrizione as Descrizione," & TAB & "count(*) as Qta , sum(importo) as Importo,sum((prezzov*qta)- importo) as Sconto from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where headmov.nfat=0 and headmov.nric=0 and venduto.flgNF=0 and headmov.flgNF=0 and  " & SmartStringFormatter("", replace) & " group by iva")
		If cursorWrapper.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper.Position = i
				Main.vSql1.ExecNonQuery("Insert into TmpIva (codice,descrizione,qta,importo) values('" & SmartStringFormatter("", cursorWrapper.GetString("Codice")) & "','" & SmartStringFormatter("", cursorWrapper.GetString("Descrizione")) & "'," & SmartStringFormatter("", cursorWrapper.GetString("Qta")) & "," & SmartStringFormatter("", cursorWrapper.GetString("Importo")) & ")")
			Next
		End If
		cursorWrapper.Close
	End If
	If sql.ExecQuerySingleResult("select count(*) from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where headmov.nfat>0 and headmov.nric=0 and venduto.flgNF=0 and headmov.flgNF=0 and  " & SmartStringFormatter("", replace) & "") > 0 Then
		Dim cursorWrapper2 As Cursor = sql.ExecQuery("select 'Fatture' as Codice,i.descrizione as Descrizione," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "count(*) as Qta , sum(importo) as Importo,sum((prezzov*qta)- importo) as Sconto " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "headmov.nfat>0 and headmov.nric=0 and venduto.flgNF=0 and headmov.flgNF=0 and  " & SmartStringFormatter("", replace) & " group by iva")
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount2
				cursorWrapper2.Position = i2
				Main.vSql1.ExecNonQuery("Insert into TmpIva (codice,descrizione,qta,importo) values('" & SmartStringFormatter("", cursorWrapper2.GetString("Codice")) & "','" & SmartStringFormatter("", cursorWrapper2.GetString("Descrizione")) & "'," & SmartStringFormatter("", cursorWrapper2.GetString("Qta")) & "," & SmartStringFormatter("", cursorWrapper2.GetString("Importo")) & ")")
			Next
		End If
		cursorWrapper2.Close
	End If
	If sql.ExecQuerySingleResult("select count(*) from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where headmov.nfat=0 and headmov.nric>0 and venduto.flgNF=0 and headmov.flgNF=0 and  " & SmartStringFormatter("", replace) & "") > 0 Then
		Dim cursorWrapper3 As Cursor = sql.ExecQuery("select 'Ricevute' as Codice,i.descrizione as Descrizione," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "count(*) as Qta , sum(importo) as Importo,sum((prezzov*qta)- importo) as Sconto " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "headmov.nfat=0 and headmov.nric>0 and venduto.flgNF=0 and headmov.flgNF=0 and  " & SmartStringFormatter("", replace) & " group by iva")
		If cursorWrapper3.RowCount > 0 Then
			Dim rowCount3 As Int = cursorWrapper3.RowCount - 1
			Dim i3 As Int
			For i3 = 0 To rowCount3
				cursorWrapper3.Position = i3
				Main.vSql1.ExecNonQuery("Insert into TmpIva (codice,descrizione,qta,importo) values('" & SmartStringFormatter("", cursorWrapper3.GetString("Codice")) & "','" & SmartStringFormatter("", cursorWrapper3.GetString("Descrizione")) & "'," & SmartStringFormatter("", cursorWrapper3.GetString("Qta")) & "," & SmartStringFormatter("", cursorWrapper3.GetString("Importo")) & ")")
			Next
		End If
		cursorWrapper3.Close
	End If
	Dim str2 As String = ""
	Dim cursorWrapper4 As Cursor
	Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("select codice from reparti where NF =1")
	If cursorWrapper5.RowCount > 0 Then
		Dim rowCount4 As Int = cursorWrapper5.RowCount - 1
		Dim i4 As Int
		For i4 = 0 To rowCount4
			cursorWrapper5.Position = i4
			str2 = str2 & cursorWrapper5.GetString("codice") & ","
		Next
	End If
	If str2 <> "" Then
		str2 = "and reparto in (" & str2.SubString2(0, str2.Length - 1) & ")"
	End If
	cursorWrapper5.Close
	If sql = Main.vSql1 Then
		vTmp = (sql.ExecQuerySingleResult("select count(*) from venduto inner join reparti as r on r.codice=reparto where r.NF=1") > 0)
	Else
		vTmp = Sub203(sql, "select venduto.reparto from headmov  inner join venduto on headmov.nmov=venduto.nmov where " & SmartStringFormatter("", replace) & " group by reparto")
	End If
	If vTmp And sql.ExecQuerySingleResult("select count(*) from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where venduto.flgNF=1 " & SmartStringFormatter("", str2) & " and  " & SmartStringFormatter("", replace) & "") > 0 Then
		Dim cursorWrapper6 As Cursor = sql.ExecQuery("select 'Non Fiscale' as Codice,i.descrizione as Descrizione," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "count(*) as Qta , sum(importo) as Importo,sum((prezzov*qta)- importo) as Sconto " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " venduto.flgNF=1 " & SmartStringFormatter("", str2) & "  and  " & SmartStringFormatter("", replace) & " group by iva")
		If cursorWrapper6.RowCount > 0 Then
			Dim rowCount5 As Int = cursorWrapper6.RowCount - 1
			Dim i5 As Int
			For i5 = 0 To rowCount5
				cursorWrapper6.Position = i5
				Main.vSql1.ExecNonQuery("Insert into TmpIva (codice,descrizione,qta,importo) values('" & SmartStringFormatter("", cursorWrapper6.GetString("Codice")) & "','" & SmartStringFormatter("", cursorWrapper6.GetString("Descrizione")) & "'," & SmartStringFormatter("", cursorWrapper6.GetString("Qta")) & "," & SmartStringFormatter("", cursorWrapper6.GetString("Importo")) & ")")
			Next
		End If
		cursorWrapper6.Close
	End If
	If z Then
		Dim replace2 As String = str2.Replace("and reparto in ", "and reparto not in ")
		If sql.ExecQuerySingleResult("select count(*) from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where venduto.flgNF=1 " & SmartStringFormatter("", replace2) & " and  " & SmartStringFormatter("", replace) & "") > 0 Then
			Dim cursorWrapper7 As Cursor = sql.ExecQuery("select 'Altro' as Codice,i.descrizione as Descrizione," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "count(*) as Qta , sum(importo) as Importo,sum((prezzov*qta)- importo) as Sconto " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "from headmov  inner join venduto on headmov.nmov=venduto.nmov inner join iva as i on i.codice=iva where " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " venduto.flgNF=1 " & SmartStringFormatter("", replace2) & "  and  " & SmartStringFormatter("", replace) & " group by iva")
			If cursorWrapper7.RowCount > 0 Then
				Dim rowCount6 As Int = cursorWrapper7.RowCount - 1
				Dim i6 As Int
				For i6 = 0 To rowCount6
					cursorWrapper7.Position = i6
					Main.vSql1.ExecNonQuery("Insert into TmpIva (codice,descrizione,qta,importo) values('" & SmartStringFormatter("", cursorWrapper7.GetString("Codice")) & "','" & SmartStringFormatter("", cursorWrapper7.GetString("Descrizione")) & "'," & SmartStringFormatter("", cursorWrapper7.GetString("Qta")) & "," & SmartStringFormatter("", cursorWrapper7.GetString("Importo")) & ")")
				Next
			End If
			cursorWrapper7.Close
			Return
		End If
		Return
	End If
End Sub

Sub Sub087(z As Boolean, str As String, z2 As Boolean)
	Dim i As Int
	Dim str2 As String = ""
	Try
		Dim cursorWrapper As Cursor
		str2 = "tmpStampa"
		Dim list As List
		list.Initialize
		Dim vSplit() As String = Regex.Split("_", str)
		Dim equals As Boolean = vSplit(0) = 1
		Dim parseDouble As Long = vSplit(1)
		Dim parseDouble2 As Int = vSplit(2)
		If equals Then
			If vSplit(3) = "Web" Then
				str2 = "tmpStampaWeb"
			Else
				str2 = "tmpStampaPalm" & vSplit(3).SubString(3)
			End If
		End If
		Dim vNumberToString As String = Sub058()
		Dim map As Map
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe order by codice")
		Dim rowCount As Int = cursorWrapper3.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount
			cursorWrapper3.Position = i2
			If cursorWrapper3.GetInt("stato") = 1 And cursorWrapper3.GetInt("tavoli") <> 0 Then
				Dim str3 As String = " where nmov = " & parseDouble
				Dim str4 As String = ""
				Dim str5 As String = ""
				Dim cursorWrapper4 As Cursor
				cursorWrapper = Main.vSql1.ExecQuery("select * from filtristampe where codice = " & cursorWrapper3.GetString("codice"))
				If cursorWrapper.RowCount > 0 Then
					Dim str6 As String = " and (case when stampante2=0 then "
					Dim rowCount2 As Int = cursorWrapper.RowCount - 1
					Dim str7 As String = ""
					Dim i3 As Int
					For i3 = 0 To rowCount2
						cursorWrapper.Position = i3
						str7 = str7 & " reparto = " & cursorWrapper.GetString("reparto") & "   or "
						str5 = str5 & " stampante2 = " & cursorWrapper.GetString("reparto") & "   or "
					Next
					Dim substring As String = str7.SubString2(0, str7.Length - 4)
					Dim substring2 As String = str5.SubString2(0, str5.Length - 4)
					str4 = str6 & substring & " else case when stampaesclusiva =0 then " & substring & " or " & substring2 & " else case when stampaesclusiva =1  then " & substring2 & " end end end)"
				End If
				Dim str8 As String = str3 & str4
				Dim str9 As String = cursorWrapper3.GetString("codice") & vNumberToString
				Dim cursorWrapper5 As Cursor
				Dim cursorWrapper6 As Cursor = Main.vSql1.ExecQuery("select * from venduto" & str8)
				If cursorWrapper6.RowCount = 0 Then
					cursorWrapper6.Close
					If Main.vSql1.ExecQuerySingleResult("select count(*) from " & str2 & " " & str4.Replace(" and ", " where ") & " and tavolo = " & parseDouble2) > 0 Then
						Sub012(str9, str2, str4, parseDouble2, parseDouble, cursorWrapper3.GetString("codice"))
					End If
				Else
					Main.vSql1.ExecNonQuery("insert into HeaddaStampare(codstampa,id,nmov,RistampaTutto) values(" & cursorWrapper3.GetString("codice") & ",'" & str9 & "'," & parseDouble & "," & IIf(z2, "1", "0") & ")")
					list.Clear
					Dim i4 As Int = 0
					If Main.v_turni And str2 <> "tmpStampaWeb" Then
						Dim map2 As Map
						map2.Initialize
						Dim rowCount3 As Int = cursorWrapper6.RowCount - 1
						Dim i5 As Int = 0
						Dim i6 As Int
						For i6 = 0 To rowCount3
							cursorWrapper6.Position = i6
							If Not(cursorWrapper6.GetString("codice").StartsWith("vv")) And Not(cursorWrapper6.GetString("codice").StartsWith("ww")) And cursorWrapper6.GetInt("turno") < 0 And Not(map2.ContainsKey(cursorWrapper6.GetInt("turno"))) Then
								map2.Put(cursorWrapper6.GetInt("turno"), "Turno ")
								If Main.vSql1.ExecQuerySingleResult("select count(*) from venduto" & str8 & " and (turno = " & cursorWrapper6.GetInt("turno") & " or turno = " & cursorWrapper6.GetInt("turno") * 1 & ")") > 0 Then
									If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from venduto" & str8 & " and lockturno = 1 and (turno = " & cursorWrapper6.GetInt("turno") & " or turno = " & cursorWrapper6.GetInt("turno") * 1 & ")") = 0) Then
										If Main.vSql1.ExecQuerySingleResult("select count(*) from venduto" & str8 & " and lockturno = 0 and (turno = " & Abs(cursorWrapper6.GetInt("turno")) * 1 & ")") <= 0 And Not(z2) Then
										End If
									End If
									If i5 = 0 Then
										i5 = Main.vSql1.ExecQuerySingleResult("select operatore from headmov where nmov = " & cursorWrapper6.GetInt("nmov"))
									End If
									map.Initialize
									map.Put("codice", "Turno " & cursorWrapper6.GetInt("turno") * 1)
									map.Put("descrizione", "Turno " & cursorWrapper6.GetInt("turno") * 1)
									map.Put("qta", 1)
									map.Put("tavolo", parseDouble2)
									map.Put("totcre", cursorWrapper6.GetInt("turno"))
									map.Put("codint", "Turno")
									map.Put("idRiga", cursorWrapper6.GetInt("turno"))
									map.Put("reparto", 1)
									map.Put("matricola", Main.v_numcassa)
									map.Put("id", str9)
									map.Put("turno", cursorWrapper6.GetInt("turno"))
									map.Put("operatore", i5)
									map.Put("ingredientisunf", cursorWrapper6.GetInt("ingredientisunf"))
									map.Put("stampaesclusiva", cursorWrapper6.GetInt("stampaesclusiva"))
									map.Put("gruppomenu", cursorWrapper6.GetString("gruppomenu"))
									map.Put("stampante2", cursorWrapper6.GetInt("stampante2"))
									map.Put("QtaConDecimali", -1)
									list.Add(map)
								End If
							End If
						Next
						i4 = i5
					End If
					Dim rowCount4 As Int = cursorWrapper6.RowCount - 1
					Dim i7 As Int = 0
					Do While i7 <= rowCount4
						cursorWrapper6.Position = i7
						If i4 = 0 Then
							i = Main.vSql1.ExecQuerySingleResult("select operatore from headmov where nmov = " & cursorWrapper6.GetInt("nmov"))
						Else
							i = i4
						End If
						map.Initialize
						map.Put("codice", cursorWrapper6.GetString("codice"))
						map.Put("descrizione", cursorWrapper6.GetString("descrizione"))
						If cursorWrapper6.GetString("memo") <> "" Then
							map.Put("memo", cursorWrapper6.GetString("memo"))
						End If
						map.Put("qta", cursorWrapper6.GetDouble("qta"))
						map.Put("tavolo", parseDouble2)
						map.Put("totcre", cursorWrapper6.GetString("totcre"))
						map.Put("codint", cursorWrapper6.GetString("codint"))
						map.Put("idRiga", cursorWrapper6.GetString("idRiga"))
						map.Put("reparto", cursorWrapper6.GetInt("reparto"))
						map.Put("matricola", Main.v_numcassa)
						map.Put("id", str9)
						If Main.v_turni Then
							map.Put("turno", cursorWrapper6.GetInt("turno"))
						End If
						map.Put("operatore", i)
						map.Put("ingredientisunf", cursorWrapper6.GetInt("ingredientisunf"))
						map.Put("stampaesclusiva", cursorWrapper6.GetInt("stampaesclusiva"))
						map.Put("gruppomenu", cursorWrapper6.GetString("gruppomenu"))
						map.Put("stampante2", cursorWrapper6.GetInt("stampante2"))
						map.Put("QtaConDecimali", cursorWrapper6.GetDouble("QtaConDecimali"))
						list.Add(map)
						i7 = i7 + 1
						i4 = i
					Loop
					dbutil.Sub007(Main.vSql1, "daStampare", list)
					If Not(z) Then
						Dim cursorWrapper7 As Cursor
						Dim cursorWrapper8 As Cursor = Main.vSql1.ExecQuery("select * from daStampare where id = '" & str9 & "'")
						Dim cursorWrapper9 As Cursor
						Dim cursorWrapper10 As Cursor = Main.vSql1.ExecQuery("select * from " & str2 & " " & str4.Replace(" and ", " where "))
						If cursorWrapper8.RowCount > 0 Then
							Try
								Main.vSql1.BeginTransaction
								Dim rowCount5 As Int = cursorWrapper8.RowCount - 1
								Dim i8 As Int
								For i8 = 0 To rowCount5
									cursorWrapper8.Position = i8
									Dim vRound2 As Double = Round2(Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from " & str2 & " where idRiga ='" & cursorWrapper8.GetString("idRiga") & "'"), 3)
									If vRound2 <> 0 Then
										Main.vSql1.ExecNonQuery("update daStampare set qta= qta + " & vRound2 & " where id = '" & str9 & "' and idRiga ='" & cursorWrapper8.GetString("idRiga") & "'")
									End If
								Next
								Main.vSql1.TransactionSuccessful
								Main.vSql1.EndTransaction
							Catch
								Main.vSql1.EndTransaction
								Sub217(LastException.Message)
							End Try
						End If
						If cursorWrapper10.RowCount > 0 Then
							Dim z3 As Boolean = False
							list.Clear
							Dim rowCount6 As Int = cursorWrapper10.RowCount - 1
							Dim i9 As Int
							For i9 = 0 To rowCount6
								cursorWrapper10.Position = i9
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from daStampare  where id = '" & str9 & "' and idRiga ='" & cursorWrapper10.GetString("idRiga") & "'") = 0 Then
									map.Initialize
									If i4 = 0 Then
										i4 = Main.vSql1.ExecQuerySingleResult("select operatore from headmov where nmov = " & cursorWrapper8.GetInt("nmov"))
									End If
									map.Put("codice", cursorWrapper10.GetString("codice"))
									map.Put("descrizione", cursorWrapper10.GetString("descrizione"))
									map.Put("qta", cursorWrapper10.GetDouble("qta"))
									map.Put("tavolo", parseDouble2)
									map.Put("totcre", cursorWrapper10.GetString("totcre"))
									map.Put("codint", cursorWrapper10.GetString("codint"))
									map.Put("idRiga", cursorWrapper10.GetString("idRiga"))
									map.Put("reparto", cursorWrapper10.GetInt("reparto"))
									map.Put("matricola", Main.v_numcassa)
									map.Put("id", str9)
									If Main.v_turni Then
										map.Put("turno", cursorWrapper10.GetInt("turno"))
									End If
									map.Put("operatore", i4)
									map.Put("ingredientisunf", cursorWrapper10.GetInt("ingredientisunf"))
									map.Put("stampaesclusiva", cursorWrapper8.GetInt("stampaesclusiva"))
									map.Put("gruppomenu", cursorWrapper8.GetString("gruppomenu"))
									map.Put("stampante2", cursorWrapper8.GetInt("stampante2"))
									map.Put("QtaConDecimali", cursorWrapper8.GetDouble("QtaConDecimali"))
									list.Add(map)
									z3 = True
								End If
							Next
							If z3 Then
								dbutil.Sub007(Main.vSql1, "daStampare", list)
							End If
						End If
						cursorWrapper8.Close
						cursorWrapper10.Close
					End If
					cursorWrapper6.Close
				End If
			End If
		Next
		If Not(equals) Then
			Sub180(False, True, False)
		End If
		If cursorWrapper.IsInitialized Then
			cursorWrapper.Close
		End If
		cursorWrapper3.Close
		Main.vSql1.ExecNonQuery("delete  from " & str2)
		Return
	Catch
		Sub217(LastException.Message)
		Main.vSql1.ExecNonQuery("delete  from " & str2)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m0… (riga 6966).
Sub Sub088(str As String, str2 As String, z As Boolean, z2 As Boolean, z3 As Boolean)
	Dim parseDouble As Int
	Dim z4 As Boolean
	Dim str3 As String
	Dim cursorWrapper As Cursor
	Dim z5 As Boolean
	Try
		Dim cursorWrapper2 As Cursor
		Dim z6 As Boolean = False
		Dim vNumberToString As String = Sub058()
		Dim list As List
		list.Initialize
		Dim map As Map
		Dim cursorWrapper3 As Cursor
		Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe order by codice")
		If Main.vBln25 Then
			parseDouble = Main.vSql2.ExecQuerySingleResult("Select valore from progressivi where  codice ='AS'")
		Else
			parseDouble = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where  codice ='AS'")
		End If
		Dim i As Int = parseDouble + 1
		Dim i2 As Int = IIf(i >= 100, 1, i)
		Dim rowCount As Int = cursorWrapper4.RowCount - 1
		Dim i3 As Int = 0
		Do While i3 <= rowCount
			cursorWrapper4.Position = i3
			If Main.vInt10 = 1 Then
				If cursorWrapper4.GetInt("stato") <> 1 Then
					If cursorWrapper4.GetInt("stato") = 0 Then
					End If
				End If
				If cursorWrapper4.GetInt("asporto") = 1 And cursorWrapper4.GetInt("mf") = 1 Then
					z4 = True
					If Not(z4) Then
						If cursorWrapper4.GetInt("stato") = 1 And cursorWrapper4.GetInt("asporto") <> 0 Then
							If Main.vInt10 = 2 Then
								z5 = z6
								i3 = i3 + 1
								z6 = z5
							End If
						End If
						z5 = z6
						i3 = i3 + 1
						z6 = z5
					End If
					Dim str4 As String = " where nmov = " & str2
					Dim cursorWrapper5 As Cursor
					cursorWrapper2 = Main.vSql1.ExecQuery("select * from filtristampe where codice = " & cursorWrapper4.GetString("codice"))
					If cursorWrapper2.RowCount <= 0 Then
						Dim str5 As String = " and (case when stampante2=0 then "
						Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
						Dim str6 As String = ""
						Dim str7 As String = ""
						Dim i4 As Int
						For i4 = 0 To rowCount2
							cursorWrapper2.Position = i4
							str7 = str7 & " reparto = " & cursorWrapper2.GetString("reparto") & "   or "
							str6 = str6 & " stampante2 = " & cursorWrapper2.GetString("reparto") & "   or "
						Next
						Dim substring As String = str7.SubString2(0, str7.Length - 4)
						Dim substring2 As String = str6.SubString2(0, str6.Length - 4)
						str3 = str5 & substring & " else case when stampaesclusiva =0 then " & substring & " or " & substring2 & " else case when stampaesclusiva =1  then " & substring2 & " end end end)"
					Else
						str3 = ""
					End If
					Dim str8 As String = cursorWrapper4.GetString("codice") & vNumberToString
					Dim cursorWrapper6 As Cursor
					cursorWrapper = Main.vSql1.ExecQuery("select * from venduto" & (str4 & str3))
					If cursorWrapper.RowCount <> 0 Then
						z5 = z6
						i3 = i3 + 1
						z6 = z5
					Else
						Main.vSql1.ExecNonQuery("insert into HeaddaStampare(codstampa,id,nmov,memo,oldasporto,sospeso) values(" & cursorWrapper4.GetString("codice") & ",'" & str8 & "'," & str2 & ",'" & str & "',-1,0)")
						z6 = True
						list.Clear
						Dim rowCount3 As Int = cursorWrapper.RowCount - 1
						Dim i5 As Int = 0
						Dim i6 As Int
						For i6 = 0 To rowCount3
							cursorWrapper.Position = i6
							If i5 = 0 Then
								i5 = Main.vSql1.ExecQuerySingleResult("select operatore from headmov where nmov = " & cursorWrapper.GetInt("nmov"))
							End If
							map.Initialize
							map.Put("codice", cursorWrapper.GetString("codice"))
							map.Put("descrizione", cursorWrapper.GetString("descrizione"))
							If cursorWrapper.GetString("memo") <> "" Then
								map.Put("memo", cursorWrapper.GetString("memo"))
							End If
							map.Put("qta", cursorWrapper.GetDouble("qta"))
							map.Put("tavolo", -1)
							map.Put("totcre", cursorWrapper.GetString("totcre"))
							map.Put("gruppomenu", cursorWrapper.GetString("gruppomenu"))
							map.Put("asporto", i2)
							map.Put("codint", cursorWrapper.GetString("codint"))
							map.Put("idRiga", cursorWrapper.GetString("idRiga"))
							map.Put("reparto", cursorWrapper.GetInt("reparto"))
							map.Put("ingredientisunf", cursorWrapper.GetInt("ingredientisunf"))
							map.Put("stampaesclusiva", cursorWrapper.GetInt("stampaesclusiva"))
							map.Put("stampante2", cursorWrapper.GetInt("stampante2"))
							map.Put("QtaConDecimali", cursorWrapper.GetDouble("QtaConDecimali"))
							map.Put("operatore", i5)
							map.Put("matricola", Main.v_numcassa)
							map.Put("id", str8)
							list.Add(map)
						Next
						dbutil.Sub007(Main.vSql1, "daStampare", list)
						cursorWrapper.Close
						z5 = z6
						i3 = i3 + 1
						z6 = z5
					End If
				End If
			End If
			z4 = False
			If Not(z4) Then
			End If
			Dim str42 As String = " where nmov = " & str2
			Dim cursorWrapper52 As Cursor
			cursorWrapper2 = Main.vSql1.ExecQuery("select * from filtristampe where codice = " & cursorWrapper4.GetString("codice"))
			If cursorWrapper2.RowCount <= 0 Then
			End If
			Dim str82 As String = cursorWrapper4.GetString("codice") & vNumberToString
			Dim cursorWrapper62 As Cursor
			cursorWrapper = Main.vSql1.ExecQuery("select * from venduto" & (str42 & str3))
			If cursorWrapper.RowCount <> 0 Then
			End If
		Loop
		Main.vSql1.ExecNonQuery("update headmov set NoStampaAsporto=1 where nmov = " & str2)
		If z6 And Not(z) Then
			If Main.vBln25 Then
				Main.vSql2.ExecNonQuery("update progressivi set valore = " & i2 & "  where codice ='AS'")
			Else
				Main.vSql1.ExecNonQuery("update progressivi set valore = " & i2 & "  where codice ='AS'")
			End If
			If Not(z2) Then
				If Main.v_notallon Then
					If Main.vInt10 <> 1 Then
						Main.vccefdll1.nf_apri(False)
						If Main.v_disconnettiprt Then
							Main.vccefdll1.nf_testo("Attendere il proprio numero: " & Chr(64 + Main.v_numcassa) & i2, 4)
						Else
							Main.vccefdll1.nf_testo("Attendere il proprio numero: " & i2, 4)
						End If
						Main.vccefdll1.nf_testo("", 4)
						Main.vccefdll1.nf_chiudi
					End If
				End If
			End If
			If z3 Then
				Main.vSql1.ExecNonQuery("update headmov set asporto = " & i2 & "  where nmov = " & str2)
			End If
			Starter.v7.Interval = 200
		End If
		If cursorWrapper2.IsInitialized Then
			cursorWrapper2.Close
		End If
		cursorWrapper4.Close
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub089(z As Boolean, str As String)
	Dim list As List
	Dim parseDouble As Int
	Dim str2 As String
	Dim cursorWrapper As Cursor
	Try
		'list = List
		list.Initialize
		Dim vSplit() As String = Regex.Split("_", str)
		parseDouble = vSplit(0)
		Dim parseDouble2 As Int = vSplit(1)
		If Not(z) Then
			str2 = "tmpStampa"
		Else If vSplit(2) = "Web" Then
			str2 = "tmpStampaWeb"
		Else
			str2 = "tmpStampaPalm" & vSplit(2).SubString(3)
		End If
		Main.vSql1.ExecNonQuery("delete  from " & str2)
		Dim cursorWrapper2 As Cursor
		cursorWrapper = Main.vSql1.ExecQuery("Select * from Venduto where FromWeb=0 and  sospeso =1 and nmov = " & parseDouble2)
	Catch
		Sub217(LastException.Message)
	End Try
	If cursorWrapper.RowCount = 0 Then
		cursorWrapper.Close
		Return
	End If
	Dim map As Map
	list.Clear
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		map.Initialize
		map.Put("codice", cursorWrapper.GetString("codice"))
		map.Put("descrizione", cursorWrapper.GetString("descrizione"))
		If cursorWrapper.GetString("memo") <> "" Then
			map.Put("memo", cursorWrapper.GetString("memo"))
		End If
		map.Put("qta", cursorWrapper.GetDouble("qta") * 1)
		map.Put("tavolo", parseDouble)
		map.Put("totcre", cursorWrapper.GetString("totcre"))
		map.Put("codint", cursorWrapper.GetString("codint"))
		map.Put("reparto", cursorWrapper.GetInt("reparto"))
		map.Put("ingredientisunf", cursorWrapper.GetInt("ingredientisunf"))
		map.Put("stampaesclusiva", cursorWrapper.GetInt("stampaesclusiva"))
		map.Put("gruppomenu", cursorWrapper.GetString("gruppomenu"))
		map.Put("stampante2", cursorWrapper.GetInt("stampante2"))
		map.Put("matricola", Main.v_numcassa)
		map.Put("idRiga", cursorWrapper.GetString("idRiga"))
		If Main.v_turni Then
			map.Put("turno", cursorWrapper.GetInt("turno"))
		End If
		list.Add(map)
	Next
	dbutil.Sub007(Main.vSql1, str2, list)
	cursorWrapper.Close
End Sub

Sub Sub090 As Boolean
	Return Phone.GetSettings("airplane_mode_on") = 1
End Sub

Sub Sub091(str As String, str2 As String, i As Int, customprogressdialogVar As CustomProgressDialog, str3 As String, str4 As String)
	Try
		Dim vRGB As Int = Colors.RGB(133, 133, 133)
		Dim vLoadBitmap As Bitmap = LoadBitmap(str, str2)
		Dim width As Int = vLoadBitmap.Width
		Dim height As Int = vLoadBitmap.Height
		If width > 500 Then
			Dim i2 As Int = 50000 / width
			width = 500
			height = height * i2 / 100
		End If
		If height > 200 Then
			Dim i3 As Int = 20000 / height
			height = 200
			width = width * i3 / 100
		End If
		Dim bitmapWrapper As Bitmap
		bitmapWrapper.InitializeMutable(width, height)
		Dim canvasWrapper As Canvas
		canvasWrapper.Initialize2(bitmapWrapper)
		Dim rectWrapper As Rect
		rectWrapper.Initialize(0, 0, bitmapWrapper.Width, bitmapWrapper.Height)
		Dim object As Rect = rectWrapper
		canvasWrapper.DrawRect(object, 0, True, 0)
		Dim rectWrapper2 As Rect
		rectWrapper2.Initialize(0, 0, canvasWrapper.Bitmap.Width, canvasWrapper.Bitmap.Height)
		canvasWrapper.DrawBitmap(LoadBitmap(str, str2), Null, rectWrapper2)
		Log("rastering2 bitmap: width=" & bitmapWrapper.Width & " height=" & bitmapWrapper.Height)
		Dim outputStreamWrapper As OutputStream
		outputStreamWrapper.InitializeToBytesArray(0)
		Dim vAnd As Int = Bit.And(i, 65528)
		outputStreamWrapper.WriteBytes(Array As Byte(29, 118, 48, 48), 0, 4)
		Dim width2 As Int = (bitmapWrapper.Width + 7) / 8 + vAnd / 8
		Dim vAnd2 As Int = Bit.And(width2, 255)
		Dim vShiftRight As Int = Bit.ShiftRight(width2, 8)
		Dim vAnd3 As Int = Bit.And(bitmapWrapper.Height, 255)
		outputStreamWrapper.WriteBytes(Array As Byte(vAnd2, vShiftRight, vAnd3, Bit.ShiftRight(bitmapWrapper.Height, 8)), 0, 4)
		Dim height2 As Int = bitmapWrapper.Height - 1
		Dim i4 As Int
		For i4 = 0 To height2
			If i4 Mod 10 = 0 Then
				customprogressdialogVar._showprogress("Conversione file in corso ...", -1, i4 * 100 / bitmapWrapper.Height)
				DoEvents
			End If
			Dim i5 As Int = vAnd / 8 - 1
			Dim i6 As Int
			For i6 = 0 To i5
				outputStreamWrapper.WriteBytes(Array As Byte(0), 0, 1)
			Next
			Dim width3 As Int = bitmapWrapper.Width - 1
			Dim i7 As Int
			For i7 = 0 To width3 Step 8
				Dim b As Byte = 0
				Dim i8 As Int
				For i8 = 0 To 7
					If i7 + i8 < bitmapWrapper.Width Then
						If bitmapWrapper.GetPixel(i7 + i8, i4) > vRGB Then
							canvasWrapper.DrawPoint(i7 + i8, i4, -1)
						Else
							canvasWrapper.DrawPoint(i7 + i8, i4, -16777216)
						End If
						If Bit.And(bitmapWrapper.GetPixel(i7 + i8, i4), 16777215) <> 16777215 Then
							b = Bit.Or(b, Bit.ShiftRight(128, i8))
						End If
					End If
				Next
				outputStreamWrapper.WriteBytes(Array As Byte(b), 0, 1)
			Next
		Next
		Sub020(str4, str3 & ".buf", outputStreamWrapper.ToBytesArray)
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub092(i As Int) As Int
	Select i
		Case 0
		Case 1
		Case 2
		Case 3
		Case Else
	End Select
	Return -1
End Sub

Sub Sub093(d As Double) As String
	Dim vNumberFormat2 As String = NumberFormat2(d, 1, 0, 0, False)
	If d Mod 100 <> 0 Then
		vNumberFormat2 = NumberFormat2(d, 1, 2, 2, False)
	End If
	If vNumberFormat2 = 0 Then
		Return "0"
	End If
	Return vNumberFormat2
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m6… (riga 7364).
Sub Sub094(str As String, cursorWrapper As Cursor, cursorWrapper2 As Cursor) As String
	Dim str2 As String
	Dim str3 As String
	Dim str4 As String
	Dim str5 As String
	Dim str6 As String
	Dim vGetString As String = cursorWrapper.GetString("via")
	Dim vGetString2 As String = cursorWrapper.GetString("cap")
	Dim vGetString3 As String = cursorWrapper.GetString("citta")
	Dim vGetString4 As String = cursorWrapper.GetString("provincia")
	Dim z As Boolean = False
	If cursorWrapper2.GetString("memo").StartsWith("WEB") Then
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from TestiPagamentiWeb where Tipo=1 and nmov=" & cursorWrapper2.GetString("nmov")) > 0 Then
			Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select testo from TestiPagamentiWeb where Tipo=1 and  nmov=" & cursorWrapper2.GetString("nmov"))
			If vExecQuerySingleResult <> "" Then
				Dim vSplit() As String = Regex.Split(CRLF, vExecQuerySingleResult)
				If vSplit.Length = 2 Then
					vGetString = vSplit(0)
					vGetString3 = vSplit(1)
				Else If vSplit.Length = 1 Then
					vGetString = vSplit(0)
					vGetString3 = ""
				End If
				str2 = ""
				str3 = vGetString
				str4 = vGetString3
				str5 = ""
				z = (Main.vSql1.ExecQuerySingleResult("Select count(*) from TestiPagamentiWeb where Tipo=0 and nmov=" & cursorWrapper2.GetString("nmov")) <= 0)
			End If
		End If
		str2 = vGetString2
		str3 = vGetString
		str4 = vGetString3
		str5 = vGetString4
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from TestiPagamentiWeb where Tipo=0 and nmov=" & cursorWrapper2.GetString("nmov")) <= 0 Then
		End If
	Else
		str2 = vGetString2
		str3 = vGetString
		str4 = vGetString3
		str5 = vGetString4
	End If
	If Not(Sub222(cursorWrapper.GetString("descrizione"))) Then
		str = str & cursorWrapper.GetString("descrizione").Trim & CRLF
	End If
	If Not(Sub222(str3)) Then
		str = str & str3.Trim & CRLF
	End If
	If Not(Sub222(cursorWrapper.GetString("telefono"))) Then
		str = str & "Tel." & cursorWrapper.GetString("telefono").Trim & CRLF
	End If
	If Sub222(str2) Then
		str6 = ""
	Else
		str6 = str2.Trim & " "
	End If
	If Not(Sub222(str4)) Then
		str6 = str6 & str4.Trim & " "
	End If
	If Not(Sub222(str5)) Then
		str6 = str6 & str5.Trim & " "
	End If
	Dim str7 As String = IIf(Not(Sub222(str6)), str & str6 & CRLF, str)
	If z Then
		Return str7 & CRLF & "**************" & CRLF & "*            *" & CRLF & "*   PAGATO   *" & CRLF & "*            *" & CRLF
	End If
	Return str7
End Sub

Sub Sub095(map As Map, str As String, str2 As String, i As Int) As String
	If map.GetDefault("TestataCampo" & str2, "") <> "" Then
		str = map.GetDefault("TestataCampo" & str2, "")
	End If
	Return modfunstr.left(str, i)
End Sub

Sub Sub096(map As Map, str As String) As String
	Return IIf(map.Size <= 0 Or Not(map.ContainsKey(str)), "", map.Get(str))
End Sub

Sub Sub097(i As Int, i2 As Int) As String
	Dim str As String
	vStr2 = "Private Sub GetFunzioneString(tipo As Int,codice As Int) As String"
	Try
	Catch
		Sub217(LastException.Message)
	End Try
	If i = 1 Then
		Dim valueOf As Int = i2
		Select valueOf
			Case Main.t_funzione
				Return "Funzione"
			Case Main.t_nulla
				Return "Vuoto"
			Case Main.t_pagina
				If Main.vInt30 >= 10 Then
					If Main.vInt30 < 100 Then
						str = "Sala"
						Return str
					End If
				End If
				str = "Pagina"
				Return str
			Case Main.t_plu
				Return "Plu"
			Case Main.t_reparto
				Return "Reparto"
			Case Main.t_tastierino
				Return "Pad Numerico"
			Case Main.t_pagamento
				Return "Pagamento"
			Case Main.t_tavolo
				Return "Tavolo"
			Case Else
				Return "Vuoto"
		End Select
	End If
	If i = 2 Then
		Select i2
			Case 0
				Return "Nascosto"
			Case 1
				Return "1x1"
			Case 2
				Return "2x1(orizzontale)"
			Case 3
				Return "1x2(verticale)"
			Case 4
				Return "2x2"
			Case Else
				Return "Nascosto"
		End Select
	End If
	If i = 3 Then
		Dim valueOf2 As Int = i2
		Select valueOf2
			Case Main.c_rosso
				Return "Rosso"
			Case Main.c_blu
				Return "Blu"
			Case Main.c_verde
				Return "Verde"
			Case Main.c_giallo
				Return "Giallo"
			Case Main.c_arancione
				Return "Arancione"
			Case Main.c_bianco
				Return "Bianco"
			Case Main.c_grigio
				Return "Grigio"
			Case Main.c_marrone
				Return "Marrone"
			Case Main.c_azzurro
				Return "Azzurro"
			Case Main.c_verdechiaro
				Return "Verde Chiaro"
			Case Main.c_verdesmeraldo
				Return "Verde Smeraldo"
			Case Main.c_viola
				Return "Viola"
			Case Main.c_rosa
				Return "Rosa"
			Case Main.c_nero
				Return "Nero"
			Case Else
				Return "Personalizzato"
		End Select
	End If
	If i = Main.t_funzione Then
		Dim valueOf3 As Int = i2
		Select valueOf3
			Case Main.f_apricassetto
				Return "Apri Cassetto"
			Case Main.f_cancellatutto
				Return "Cancella Tutto"
			Case Main.f_listino
				Return "Listino"
			Case Main.f_stampaoggi
				Return "Statistiche di Vendita"
			Case Main.f_scontototale
				Return "Sconto Totale"
			Case Main.f_maggiorazione
				Return "Maggiorazione Totale"
			Case Main.f_modificatore
				Return "Modificatore"
			Case Main.f_ristampacomanda
				Return "Ristampa Comanda"
			Case Main.f_scontrinoparlante
				Return "Scontrino Parlante"
			Case Main.f_ricercaarticoli
				Return "Ricerca Articoli"
			Case Main.f_ricercabarcode
				Return "Ricerca Codice a Barre"
			Case Main.f_premio
				Return "Ritiro premio"
			Case Main.f_ricarica
				Return "Ricarica"
			Case Main.f_recallmov
				Return "Richiama Movimento"
			Case Main.f_operatore
				Return "Operatore"
			Case Main.f_sospendi
				Return "Sospendi Scontrino"
			Case Main.f_recallsospendi
				Return "Richiama Scontrino"
			Case Main.f_sospendiprenota
				Return "Sospendi Prenotazione"
			Case Main.f_recallsospendiprenota
				Return "Richiama Prenotazione"
			Case Main.f_visualizzapwdweb
				Return "Password Web di oggi"
			Case Main.f_terminalino
				Return "Importa Rilevazioni"
			Case Main.f_menucashology
				Return "Backoffice Cashmanagement"
			Case Main.f_sottoconto
				Return "Sottoconto N."
			Case Main.f_ricercatabacchi
				Return "Ricerca Tabacchi"
			Case Main.f_chiusuraparziale
				Return "Chiusura Parziale"
			Case Main.f_macro
				Return "Esegui una macro"
			Case Main.f_annullart
				Return "Annulla Documento RT"
			Case Main.f_menuesercentert
				Return "Funzioni RT"
			Case Main.f_avanzamentocarta
				Return "Avanzamento Carta"
			Case Main.f_plannerspiaggia
				Return "Planner Spiaggia"
			Case Main.f_inventarioglory
				Return "Inventario CashManagement"
			Case Main.f_scontrinolotteria
				Return "Codice Lotteria"
			Case Main.f_serviziomanuale
				Return "Servizio Manuale"
			Case Main.f_verificainviofe
				Return "Esito invio Fatture Elettroniche"
			Case Main.f_esportacausali
				Return "Esporta Movimenti"
			Case Main.f_ricercatavoli
				Return "Ricerca Tavoli"
			Case Main.f_vedisottoconti
				Return "Dettaglio Sottoconti"
			Case Main.f_risorsebalneari
				Return "Risorse balneari"
			Case Main.f_allergeni
				Return "Allergeni e Tag"
			Case Main.f_conto
				Return "Conto"
			Case Main.f_stampaparziale
				Return "Stampa Parziale"
			Case Main.f_variaprezzo
				Return "Varia Prezzo PLU"
			Case Main.f_abbuono
				Return "Abbuono"
			Case Main.f_annullapagamenti
				Return "Annulla Pagamenti"
			Case Main.f_ricercacliente
				Return "Cliente"
			Case Main.f_reso
				Return "Reso"
			Case Main.f_fattura
				Return "Fattura"
			Case Main.f_letturadgfe
				Return "Ristampa"
			Case Main.f_esportacausali
				Return "Esporta Movimenti"
			Case Main.f_shell
				Return "Procedura Esterna"
			Case Main.f_contoromana
				Return "Conto alla Romana"
			Case Main.f_dividiconto
				Return "Dividi Conto"
			Case Main.f_ritirovincita
				Return "Ritiro Vincita"
			Case Main.f_ricevuta
				Return "Ricevuta"
			Case Main.f_elencotelefonate
				Return "Telefonate Ricevute"
			Case Main.f_messaggio
				Return "Messaggi"
			Case Main.f_gruppo
				Return "Gruppo"
			Case Main.f_menu
				Return "Menù"
			Case Main.f_tallon
				Return "Gestione Tallon"
			Case Main.f_nocomande
				Return "Non stampare comande"
			Case Main.f_noservizio
				Return "Attiva-Disattiva Servizio"
			Case Main.f_infomovimento
				Return "Info Movimento"
			Case Main.f_modoperatore
				Return "Associa Operatore"
			Case Main.f_noarticoliazero
				Return "Elimina Articoli a Zero €"
			Case Main.f_bloccaarticolo
				Return "Articolo Esaurito"
			Case Main.f_spostasutavolo
				Return "Sposta su Tavolo"
			Case Main.f_showsospesiasporto
				Return "Visualizza Sospesi Asporto"
			Case Main.f_ristampaveloce
				Return "Riprendi Conto"
			Case Main.f_segue
				Return "Segue Turno"
			Case Main.f_avantiturno
				Return "Avanti Turno"
			Case Main.f_infotavolo
				Return "Info Tavoli"
			Case Main.f_stampatutto
				Return "Stampa tutti i Documenti"
			Case Else
				Return ""
		End Select
	End If
	Return ""
End Sub

Sub Sub098 As Int
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where qta>0") <= 0 Then
		Return 0
	End If
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select Max(turno) from Ventmp where qta>0")
	Dim parseDouble2 As Int = Main.vSql1.ExecQuerySingleResult("Select min(turno) from Ventmp where qta>0")
	If parseDouble2 < 0 Then
		parseDouble2 = parseDouble2 * -1
	End If
	Return IIf(parseDouble2 > parseDouble, parseDouble2, parseDouble)
End Sub

Sub Sub099(i As Int) As Int
	Dim str As String = "Ventmp where turno <0 and qta>0"
	If i > 0 Then
		str = "Venduto where turno <0 and qta>0 and nmov=" & i
	End If
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from " & str) <= 0 Then
		Return 0
	End If
	Return Abs(Main.vSql1.ExecQuerySingleResult("Select case when min(turno) is null then 0 else min(turno) end from " & str))
End Sub

Sub Sub100 As Int
	Dim i As Int
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where turno <0 and qta>0") > 0 Then
		i = Abs(Main.vSql1.ExecQuerySingleResult("Select case when turno is null then 0 else min(turno) end from Ventmp where turno <0 and qta>0"))
	Else
		i = 0
	End If
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where turno >" & i & " and qta>0 ") <= 0 Then
		Return 0
	End If
	Return Main.vSql1.ExecQuerySingleResult("Select Min(turno) from Ventmp where turno >" & i & " and qta>0 ")
End Sub

Sub Sub101(i As Int) As Int
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe where codice <> " & i & " and mf=0 and stato = 1")
	Dim map As Map
	map.Initialize
	Dim list As List
	list.Initialize
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount
			cursorWrapper2.Position = i2
			list.Add(cursorWrapper2.GetString("descrizione"))
			map.Put(i2, cursorWrapper2.GetInt("codice"))
		Next
		Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare la stampante alternativa")
		If vInputList1 >= 0 Then
			If Main.v_spooler Then
				Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select ip from confstampe where codice = " & i)
				cursorWrapper2.Position = vInputList1
				Sub179(vExecQuerySingleResult, cursorWrapper2.GetString("ip"))
			End If
			cursorWrapper2.Close
			Return map.Get(vInputList1)
		End If
	End If
	cursorWrapper2.Close
	Return 0
End Sub

Sub Sub102(i As Int) As ckprinter
	Select i
		Case 1
		Case 2
		Case 3
		Case 4
		Case 5
		Case 6
		Case 7
		Case 8
		Case 9
		Case 10
		Case 11
		Case 12
		Case 13
		Case 14
		Case 15
		Case 16
		Case 17
		Case 18
		Case Else
	End Select
	Return Main.vckprinter1
End Sub

Sub Sub103(ckprinterVar As ckprinter) As String
	ckprinterVar.Sub005
	Return "" & IIf(ckprinterVar.vkprinterstatus1.InError, "Errore Stampante" & CRLF, "") & IIf(ckprinterVar.vkprinterstatus1.OffLine, "Stampante Spenta o Scollegata" & CRLF, "") & IIf(ckprinterVar.vkprinterstatus1.CoverOpened, "Coperchio Aperto" & CRLF, "") & IIf(ckprinterVar.vkprinterstatus1.PaperEnd, "Fine Carta Stampante" & CRLF, "") & IIf(ckprinterVar.vkprinterstatus1.PaperNearEnd, "Quasi Fine Carta", "")
End Sub

Sub Sub104(str As String, str2 As String) As String
	Select str2
		Case "ca", "re"
			Return "giac=round(giac + " & str & " ,3)"
		Case "au", "rf"
			Return "giac=round(giac - " & str & " ,3)"
		Case "pr"
			Return "giac=giac"
		Case "in"
			Return "giac=round(" & str & " ,3)"
		Case Else
			Return "giac=round(giac - " & str & " ,3)"
	End Select
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m6… (riga 7962).
Sub Sub105(i As Int, str As String) As String
	Dim str2 As String
	vStr2 = "Private Sub GetFunzioneString(tipo As Int,codice As Int) As String"
	Try
	Catch
		Sub217(LastException.Message)
		str2 = ""
	End Try
	If i = Main.t_funzione Then
		Select str
			Case "Apri Cassetto"
				str2 = Main.f_apricassetto
			Case "Cancella Tutto"
				str2 = Main.f_cancellatutto
			Case "Listino"
				str2 = Main.f_listino
			Case "Statistiche di Vendita"
				str2 = Main.f_stampaoggi
			Case "Sconto Totale"
				str2 = Main.f_scontototale
			Case "Maggiorazione Totale"
				str2 = Main.f_maggiorazione
			Case "Modificatore"
				str2 = Main.f_modificatore
			Case "Ristampa Comanda"
				str2 = Main.f_ristampacomanda
			Case "Scontrino Parlante"
				str2 = Main.f_scontrinoparlante
			Case "Ricerca Articoli"
				str2 = Main.f_ricercaarticoli
			Case "Ricerca Codice a Barre"
				str2 = Main.f_ricercabarcode
			Case "Ritiro premio"
				str2 = Main.f_premio
			Case "Ricarica"
				str2 = Main.f_ricarica
			Case "Richiama Movimento"
				str2 = Main.f_recallmov
			Case "Operatore"
				str2 = Main.f_operatore
			Case "Sospendi Scontrino"
				str2 = Main.f_sospendi
			Case "Sospendi Prenotazione"
				str2 = Main.f_sospendiprenota
			Case "Richiama Scontrino"
				str2 = Main.f_recallsospendi
			Case "Richiama Prenotazione"
				str2 = Main.f_recallsospendiprenota
			Case "Password Web di oggi"
				str2 = Main.f_visualizzapwdweb
			Case "Importa Rilevazioni"
				str2 = Main.f_terminalino
			Case "Backoffice Cashmanagement"
				str2 = Main.f_menucashology
			Case "Risorse balneari"
				str2 = Main.f_risorsebalneari
			Case "Dettaglio Sottoconti"
				str2 = Main.f_vedisottoconti
			Case "Ricerca Tabacchi"
				str2 = Main.f_ricercatabacchi
			Case "Chiusura Parziale"
				str2 = Main.f_chiusuraparziale
			Case "Esito invio Fatture Elettroniche"
				str2 = Main.f_verificainviofe
			Case "Annulla Documento RT"
				str2 = Main.f_annullart
			Case "Funzioni RT"
				str2 = Main.f_menuesercentert
			Case "Servizio Manuale"
				str2 = Main.f_serviziomanuale
			Case "Avanzamento Carta"
				str2 = Main.f_avanzamentocarta
			Case "Planner Spiaggia"
				str2 = Main.f_plannerspiaggia
			Case "Inventario CashManagement"
				str2 = Main.f_inventarioglory
			Case "Codice Lotteria"
				str2 = Main.f_scontrinolotteria
			Case "Esegui una macro"
				str2 = Main.f_macro
			Case "Esporta Movimenti"
				str2 = Main.f_esportacausali
			Case "Ricerca Tavoli"
				str2 = Main.f_ricercatavoli
			Case "Sottoconto N."
				str2 = Main.f_sottoconto
			Case "Allergeni e Tag"
				str2 = Main.f_allergeni
			Case "Conto"
				str2 = Main.f_conto
			Case "Stampa Parziale"
				str2 = Main.f_stampaparziale
			Case "Varia Prezzo PLU"
				str2 = Main.f_variaprezzo
			Case "Abbuono"
				str2 = Main.f_abbuono
			Case "Annulla Pagamenti"
				str2 = Main.f_annullapagamenti
			Case "Cliente"
				str2 = Main.f_ricercacliente
			Case "Reso"
				str2 = Main.f_reso
			Case "Fattura"
				str2 = Main.f_fattura
			Case "Menù"
				str2 = Main.f_menu
			Case "Ristampa"
				str2 = Main.f_letturadgfe
			Case "Esporta Movimenti"
				str2 = Main.f_esportacausali
			Case "Procedura Esterna"
				str2 = Main.f_shell
			Case "Conto alla Romana"
				str2 = Main.f_contoromana
			Case "Dividi Conto"
				str2 = Main.f_dividiconto
			Case "Ritiro Vincita"
				str2 = Main.f_ritirovincita
			Case "Ricevuta"
				str2 = Main.f_ricevuta
			Case "Telefonate Ricevute"
				str2 = Main.f_elencotelefonate
			Case "Messaggi"
				str2 = Main.f_messaggio
			Case "Gruppo"
				str2 = Main.f_gruppo
			Case "Gestione Tallon"
				str2 = Main.f_tallon
			Case "Non stampare comande"
				str2 = Main.f_nocomande
			Case "Attiva-Disattiva Servizio"
				str2 = Main.f_noservizio
			Case "Info Movimento"
				str2 = Main.f_infomovimento
			Case "Associa Operatore"
				str2 = Main.f_modoperatore
			Case "Elimina Articoli a Zero €"
				str2 = Main.f_noarticoliazero
			Case "Articolo Esaurito"
				str2 = Main.f_bloccaarticolo
			Case "Stampa tutti i Documenti"
				str2 = Main.f_stampatutto
			Case "Sposta su Tavolo"
				str2 = Main.f_spostasutavolo
			Case "Visualizza Sospesi Asporto"
				str2 = Main.f_showsospesiasporto
			Case "Riprendi Conto"
				str2 = Main.f_ristampaveloce
			Case "Segue Turno"
				str2 = Main.f_segue
			Case "Avanti Turno"
				str2 = Main.f_avantiturno
			Case Else
				str2 = 0
		End Select
		Return str2
	End If
	str2 = ""
	Return str2
End Sub

Sub Sub106(str As String) As Boolean
	Try
		Dim setdateandtime As Long = DateUtils.setdateandtime(str.SubString2(0, 4), str.SubString2(5, 7), str.SubString2(8, 10), str.SubString2(11, 13), str.SubString2(14, 16), 0)
		Dim periodVar As Period
		periodVar.Minutes = Main.v_mintavololento
		If Sub058() > DateUtils.addperiod(setdateandtime, periodVar) Then
			Return True
		End If
	Catch
		Sub217(LastException.Message)
	End Try
	Return False
End Sub

Sub Sub107(obj As Object) As String
	Dim vObjectToString As String = obj
	If IsNumber(vObjectToString) And vObjectToString >= 20000 Then
		Return "Tessera " & vObjectToString
	End If
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select case when testo Is Null then 'Tavolo " & vObjectToString & "' else testo end from pagine where pagina >=10  AND pagina <100 AND valore = " & vObjectToString & " AND tipo = 9 limit 1")
	If vExecQuerySingleResult = Null Then
		Return "Tavolo " & vObjectToString
	End If
	Return vExecQuerySingleResult
End Sub

Sub Sub108(i As Int) As Int
	Select Main.v_temag
		Case 0, 1
			Dim valueOf As Int = i
			Select valueOf
				Case Main.c_bianco, Main.c_giallo, Main.c_azzurro
					Return -16777216
				Case Else
					Return -1
			End Select
		Case 2, 4, 5, 6
			Dim valueOf2 As Int = i
			Select valueOf2
				Case Main.c_bianco, Main.c_giallo, Main.c_azzurro, Main.c_verdechiaro
					Return -16777216
				Case Else
					Return -1
			End Select
		Case 3
			Dim valueOf3 As Int = i
			Select valueOf3
				Case Main.c_nero, Main.c_grigio, Main.c_blu
					Return -1
				Case Else
					Return -16777216
			End Select
		Case Else
			If i = Main.c_giallo Then
				Return -16777216
			End If
			Return -1
	End Select
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m4… (riga 8374).
Sub Sub109(str As String, str2 As String, i As Int, z As Boolean, i2 As Int, str3 As String, str4 As String, i3 As Int) As Boolean
	Dim z2 As Boolean
	Dim j As Long
	Dim z3 As Boolean
	Dim size As Int
	Dim i4 As Int
	Dim list As List
	Dim z4 As Boolean
	Dim stringBuilderWrapper As StringBuilder
	Dim stringBuilderWrapper2 As StringBuilder
	Dim stringBuilderWrapper3 As StringBuilder
	Dim i5 As Int = i3 + 1
	Dim i6 As Int = i3 + 2
	Dim list2 As List
	Try
		list2.Initialize
		If Not(z) Then
			Dim randomAccessFile As RandomAccessFile
			randomAccessFile.Initialize(str2, str, False)
			If i3 < 2 Then
				i3 = 2
			End If
			Dim parseDouble As Long = str3
			If i = 0 And parseDouble > 0 Then
				Dim parseDouble2 As Long = str3
				Main.vSql1.ExecNonQuery("delete from headmov where nmov=" & parseDouble2)
				Main.vSql1.ExecNonQuery("delete from venduto where nmov=" & parseDouble2)
				Main.vSql1.ExecNonQuery("delete from CausaliPagamenti where nmov=" & parseDouble2)
				j = parseDouble2
			Else
				Dim parseDouble3 As Long = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'") + 1
				Main.vSql1.ExecNonQuery("update  progressivi set valore = valore +1  where codice ='V'")
				j = parseDouble3
			End If
			list2.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
			If str.StartsWith("VDel") Then
				If randomAccessFile.Size <> randomAccessFile.CurrentPosition Then
					Sub215("Manca parte del file Del")
					File.Delete(str2, str)
					Return False
				End If
				If list2.Size > 0 Then
					dbutil.Sub007(Main.vSql1, "Eliminati", list2.Get(0))
				End If
				File.Delete(str2, str)
				Return False
			End If
			If randomAccessFile.Size <= randomAccessFile.CurrentPosition Then
				Sub215("Manca parte del file (1)")
				File.Delete(str2, str)
				Return False
			End If
			Dim i7 As Int = i3 - 1
			Dim i8 As Int
			For i8 = 0 To i7
				list2.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
				If randomAccessFile.Size <= randomAccessFile.CurrentPosition Then
					Sub215("Manca parte del file (2)")
					File.Delete(str2, str)
					Return False
				End If
			Next
			list2.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
			If randomAccessFile.Size <= randomAccessFile.CurrentPosition Then
				Sub215("Manca parte del file (3)")
				File.Delete(str2, str)
				Return False
			End If
			list2.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
			Dim z5 As Boolean = False
			If Main.vBln20 Then
				If Main.v_attivaterminale Then
					Dim list3 As List = list2.Get(i5)
					If list3.Size > 0 Then
						stringBuilderWrapper.Initialize
						stringBuilderWrapper2.Initialize
						stringBuilderWrapper3.Initialize
						Dim map As Map = list3.Get(0)
						If map.ContainsKey("sospeso") Then
							z3 = map.Get("sospeso")
						Else
							z3 = False
						End If
						size = list2.Size - 1
						i4 = 0
						Do While i4 <= size
							Dim list4 As List = list2.Get(i4)
							Dim list5 As List
							list5.Initialize
							If list4.Size = 0 Then
								z4 = z5
							Else
								Dim size2 As Int = list4.Size - 1
								Dim z6 As Boolean = z5
								Dim i9 As Int
								For i9 = 0 To size2
									Dim map2 As Map = list4.Get(i9)
									If i4 = 0 And (Not(map2.ContainsKey("sospeso")) Or Not(map2.Get("sospeso"))) Then
										Log(1)
										If 1 = map2.Get("flgmag") And 0 = map2.Get("brep") Then
											Main.vSql1.ExecNonQuery("update anagra set giac=round(giac - " & map2.Get("qta") & " ,3) where  codint ='" & map2.Get("codint") & "'")
										End If
										If 1 = map2.Get("distinta") Then
											Dim cursorWrapper As Cursor
											Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from distintabase where codint = '" & map2.Get("codint") & "'")
											If cursorWrapper2.RowCount > 0 Then
												Dim rowCount As Int = cursorWrapper2.RowCount - 1
												Dim i10 As Int
												For i10 = 0 To rowCount
													cursorWrapper2.Position = i10
													Dim replace As String = NumberFormat2(cursorWrapper2.GetDouble("qta") * map2.Get("qta"), 1, 3, 3, False).Replace(",", ".")
													Main.vSql1.ExecNonQuery("update anagra set giac=round(giac - " & replace & " ,3) where  codint ='" & cursorWrapper2.GetInt("codintpadre") & "'")
												Next
											End If
											cursorWrapper2.Close
										End If
									End If
									If i4 <> i6 Then
										If i4 = i5 Then
											map2.Put("memo", IIf(map2.Get("memo") = Null, "", map2.Get("memo")) & " Cassa " & i2 & ": " & map2.Get("nmov"))
											map2.Put("asporto", str4)
											z6 = (map2.GetDefault("nfat", 0) > 0)
										End If
										map2.Put("nmov", j)
									Else If map2.Get("rifheadmov") > 0 Then
										map2.Put("rifheadmov", j)
									Else
										If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where unlocktable =" & map2.Get("tavolo")) > 0 Then
											Dim cursorWrapper3 As Cursor
											Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select tavolo from tavoli where unlocktable =" & map2.Get("tavolo"))
											Dim list6 As List
											list6.Initialize
											Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
											Dim i11 As Int
											For i11 = 0 To rowCount2
												cursorWrapper4.Position = i11
												list6.Add(cursorWrapper4.GetInt("tavolo"))
											Next
											cursorWrapper4.Close
											Main.vSql1.ExecNonQuery("update tavoli set unlocktable=0,lock=0 where unlocktable = " & map2.Get("tavolo"))
											Dim iArr(list6.Size) As Int
											Dim size3 As Int = list6.Size - 1
											Dim i12 As Int
											For i12 = 0 To size3
												iArr(i12) = list6.Get(i12)
											Next
											Dim vNumberToString As String = i2
											CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr, vNumberToString)
											If Main.vInt30 >= 10 Then
												If Main.vInt30 < 100 Then
													CallSub2("Main", "CambiaPagina", Main.vInt30)
												End If
											End If
											map2.Put("unlocktable", 0)
										End If
									End If
									If Not(z3) Then
										If i4 = 0 Then
											Sub011(stringBuilderWrapper, map2)
										Else If i4 = i5 Then
											Sub009(stringBuilderWrapper2, map2)
											Dim textWriterWrapper As TextWriter
											textWriterWrapper.Initialize(File.OpenOutput(Main.vStr17, "movimento.txt", False))
											textWriterWrapper.Write(stringBuilderWrapper2 & stringBuilderWrapper & stringBuilderWrapper3)
											Sub128(textWriterWrapper, map2.Get("cliente"), map2.Get("nfat"))
											textWriterWrapper.Close
											Dim vTmp As String = Sub059(Sub058())
											Dim strArr() As String = Array("movimento.txt")
											Dim archiverForB4A As ArchiverForB4A
											Dim str5 As String = "DaCasse" & vTmp & "20001.tmp"
											If File.Exists(Main.vStr17, str5) Then
												str5 = Sub202(vTmp)
											End If
											archiverForB4A.ZipFiles(Main.vStr17, strArr, Main.vStr17, str5, "")
											File.Delete(Main.vStr17, "movimento.txt")
											CallSub(ftpmanager, "tUpload")
										Else If i4 > 0 And i4 <= i3 Then
											Sub007(stringBuilderWrapper3, map2)
										End If
									Else If i4 = 0 Then
										If Main.v_turni And i > 0 And map2.Get("turno") < 0 Then
											map2.Put("lockturno", 1)
										End If
									End If
									list5.Add(map2)
								Next
								If i4 <> i6 Then
									If i4 = 0 Then
										dbutil.Sub007(Main.vSql1, "Venduto", list5)
										z4 = z6
									Else If i4 > 0 And i4 <= i3 Then
										dbutil.Sub007(Main.vSql1, "CausaliPagamenti", list5)
										z4 = z6
									Else
										If i4 = i5 Then
											dbutil.Sub007(Main.vSql1, "headmov", list5)
										End If
										z4 = z6
									End If
								Else
									Dim map3 As Map
									map3.Initialize
									map3.Put("tavolo", i)
									Dim map4 As Map = list5.Get(0)
									dbutil.Sub012(Main.vSql1, "tavoli", map4, map3)
									z4 = z6
								End If
							End If
							i4 = i4 + 1
							z5 = z4
						Loop
						If z5 And randomAccessFile.Size > randomAccessFile.CurrentPosition Then
							Try
								list = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
								If list.IsInitialized And list.Size = 1 Then
									dbutil.Sub007(Main.vSql2, "FEDatiMov", list)
								End If
								Dim vObjectToString As String = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
								If randomAccessFile.Size > randomAccessFile.CurrentPosition Then
									Sub215("Manca il file xml")
								Else
									Dim bArr() As Byte = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
									File.WriteBytes(File.DirDefaultExternal & "/FE/Backup", vObjectToString, bArr)
									Dim vObjectToString2 As String = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
									Dim bArr2() As Byte = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
									Dim str7 As String = vObjectToString.SubString2(0, 13) & " " & vObjectToString.SubString(14)
									File.WriteBytes(vStr7, str7.Replace("xml", vObjectToString2), bArr2)
								End If
							Catch
								Sub217(LastException.Message)
							End Try
						End If
						randomAccessFile.Close
					End If
				End If
			End If
			z3 = True
			size = list2.Size - 1
			i4 = 0
			Do While i4 <= size
			Loop
			If z5 Then
				list = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
				If list.IsInitialized Then
					dbutil.Sub007(Main.vSql2, "FEDatiMov", list)
				End If
				Dim vObjectToString3 As String = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
				If randomAccessFile.Size > randomAccessFile.CurrentPosition Then
				End If
			End If
			randomAccessFile.Close
		Else
			Dim vReadString As String = File.ReadString(str2, str)
			If vReadString.Length > 0 Then
				Main.vSql1.ExecNonQuery(vReadString)
			End If
		End If
		z2 = True
	Catch
		Sub217(LastException.Message)
		z2 = False
	End Try
	File.Delete(str2, str)
	If Main.vInt30 >= 10 Then
	End If
	If Not(Main.vBln36) Then
		Return z2
	End If
	Main.vStr18 = " and tipo =" & Main.t_tavolo & " and valore = " & i & " "
	If Not( = Null) Then
		 = 
	End If
	CallSub2("Main", "CambiaPagina", Main.vInt30)
	Main.vStr18 = ""
	Return z2
End Sub

Sub Sub110 As Boolean
	Dim exc As Exception
	Dim randomAccessFile As RandomAccessFile
	Dim randomAccessFile2 As RandomAccessFile
	Dim z As Boolean
	Dim list As List
	Try
		Main.vSql1.ExecNonQuery("delete from Venduto")
		Main.vSql1.ExecNonQuery("delete from headmov")
		Main.vSql1.ExecNonQuery("delete from CausaliPagamenti")
		Main.vSql1.ExecNonQuery("delete from tmpStampa")
		Main.vBln29 = False
		'list = List
		list.Initialize
		'randomAccessFile = RandomAccessFile
	Catch
		exc = e
		randomAccessFile = Null
	End Try
	Try
		randomAccessFile.Initialize(vStr4, "Recall.txt", False)
		list.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
		list.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
		Dim size As Int = list.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim list2 As List = list.Get(i)
			If i = 0 Then
				dbutil.Sub007(Main.vSql1, "headmov", list2)
			Else If i = 1 Then
				dbutil.Sub007(Main.vSql1, "venduto", list2)
			End If
		Next
		randomAccessFile2 = randomAccessFile
		z = True
	Catch
		exc = e2
		Sub217(LastException.Message)
		randomAccessFile2 = randomAccessFile
		z = False
		randomAccessFile2.Close
		Return z
	End Try
	randomAccessFile2.Close
	Return z
End Sub

Sub Sub111(str As String) As Boolean
	Dim exc As Exception
	Dim randomAccessFile As RandomAccessFile
	Dim randomAccessFile2 As RandomAccessFile
	Dim z As Boolean
	Dim list As List
	Try
		Main.vSql1.ExecNonQuery("delete from Venduto")
		Main.vSql1.ExecNonQuery("delete from headmov")
		Main.vSql1.ExecNonQuery("delete from CausaliPagamenti")
		Main.vSql1.ExecNonQuery("delete from tmpStampa")
		Main.vBln29 = False
		'list = List
		list.Initialize
		'randomAccessFile = RandomAccessFile
	Catch
		exc = e
		randomAccessFile = Null
	End Try
	Try
		randomAccessFile.Initialize(vStr4, "Tavolo.txt", False)
		list.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
		If randomAccessFile.CurrentPosition < randomAccessFile.Size Then
			list.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
			If randomAccessFile.CurrentPosition < randomAccessFile.Size Then
				list.Add(randomAccessFile.ReadObject(randomAccessFile.CurrentPosition))
			End If
		End If
		Dim size As Int = list.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim list2 As List = list.Get(i)
			If i = 0 Then
				Dim map As Map
				map.Initialize
				map.Put("tavolo", str)
				Dim map2 As Map = list2.Get(i)
				dbutil.Sub012(Main.vSql1, "tavoli", map2, map)
			Else If i = 1 Then
				dbutil.Sub007(Main.vSql1, "headmov", list2)
			Else If i = 2 Then
				dbutil.Sub007(Main.vSql1, "venduto", list2)
			End If
		Next
		randomAccessFile2 = randomAccessFile
		z = True
	Catch
		exc = e2
		Sub217(LastException.Message)
		randomAccessFile2 = randomAccessFile
		z = False
		randomAccessFile2.Close
		Return z
	End Try
	randomAccessFile2.Close
	Return z
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m4… (riga 8876).
Sub Sub112(z As Boolean, str As String) As Boolean
	Dim strArr As String()
	Dim z2 As Boolean
	Dim str2 As String
	Dim vTmp As Int
	Dim vTmp_ As Int
	Main.vSql1.BeginTransaction
	Try
		ProgressDialogShow2("Importazione in corso del file " & CRLF & str, False)
		DoEvents
		Dim textReaderWrapper As TextReader
		textReaderWrapper.Initialize(File.OpenInput(vStr4 & "/V", "variazioni.txt"))
		Dim vReadLine As String = textReaderWrapper.ReadLine
		Dim list As List
		list.Initialize
		Dim list2 As List
		list2.Initialize
		Dim map As Map
		Dim z3 As Boolean = True
		Dim i As Int = 0
		vInt2 = 0
		Dim map2 As Map
		map2.Initialize
		Dim map3 As Map
		Dim map4 As Map
		map4.Initialize
		map3.Initialize
		Do While Not(vReadLine = Null)
			Dim i2 As Int = i + 1
			vInt2 = vInt2 + 1
			Dim vSplit() As String = Regex.Split(TAB, vReadLine)
			If z3 Then
				If z Then
					If vSplit(0).Trim = "ve" Then
						If Main.v_recordver > vSplit(1) Then
							Main.vSql1.EndTransaction
							Dim vObjectToCharSequence As Object = "Il tracciato record non è compatibile ."
							Dim vObjectToCharSequence2 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
							ProgressDialogHide
							vInt2 = 0
							Return False
						End If
						Dim vReadLine2 As String = textReaderWrapper.ReadLine
						vInt2 = vInt2 + 1
						vSplit = Regex.Split(TAB, vReadLine2)
					End If
					If vSplit(0).Trim = "ne" Then
						If Main.v_nnegozio <> vSplit(1) Then
							Main.vSql1.EndTransaction
							Dim vObjectToCharSequence3 As Object = "Il codice negozio del file " & str & " non è corretto (Valore nel file:" & vSplit(1) & ")"
							Dim vObjectToCharSequence4 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
							vInt2 = 0
							ProgressDialogHide
							Return False
						End If
						Dim vReadLine3 As String = textReaderWrapper.ReadLine
						vInt2 = vInt2 + 1
						vSplit = Regex.Split(TAB, vReadLine3)
					End If
					If vSplit(0).Trim = "nu" Or vSplit(0).Trim = "fo" Then
						Dim parseDouble As Int = vSplit(1)
						If vSplit(0).Trim = "nu" Then
							If parseDouble <> Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice = 'RECEIVE'") Then
								Main.vSql1.EndTransaction
								Dim vObjectToCharSequence5 As Object = "Il numero della variazione nel file " & str & " non è corretto (Valore nel file:" & parseDouble & ")"
								Dim vObjectToCharSequence6 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
								vInt2 = 0
								ProgressDialogHide
								Return False
							End If
						End If
						Main.vSql1.ExecNonQuery("update progressivi set valore = " & parseDouble + 1 & " where codice = 'RECEIVE'")
					Else
						Dim vObjectToCharSequence7 As Object = "Il file inviato non è corretto"
						Dim vObjectToCharSequence8 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
						Main.vSql1.EndTransaction
						ProgressDialogHide
						Return False
					End If
				End If
				strArr = vSplit
				z2 = False
			Else
				strArr = vSplit
				z2 = z3
			End If
			Select strArr(0).Trim
				Case "an"
					Dim i3 As Int = 0
					If strArr(5).Trim = "P" Then
						i3 = 1
					Else If strArr(5).Trim = "W" Then
						i3 = 2
					Else If strArr(5).Trim = "B" Then
						i3 = 3
					End If
					If i3 > 0 Then
						strArr(10) = "0"
					End If
					Dim vSplit2() As String = Regex.Split("-", strArr(3))
					If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where codint ='" & strArr(1).Trim & "'") = 0 Then
						Main.vSql1.ExecNonQuery("INSERT INTO anagra (codint,descrizione,reparto,iva,plupeso,gruppov,variazioni,obbligoprz,Kcal,peso,obbligodes,punti,nVariazioni,misura)  VALUES('" & strArr(1) & "','" & strArr(2) & "','" & vSplit2(0) & "','" & strArr(4) & "'," & i3 & "," & strArr(6) & "," & strArr(7) & "," & strArr(10) & "," & strArr(11) & "," & strArr(16) & "," & strArr(17) & "," & strArr(18) & "," & strArr(19) & "," & strArr(20) & ")")
					Else
						Main.vSql1.ExecNonQuery("update anagra set descrizione='" & strArr(2) & "',reparto='" & vSplit2(0) & "',iva='" & strArr(4) & "',plupeso=" & i3 & ",gruppov=" & strArr(6) & ",variazioni=" & strArr(7) & ",Kcal=" & strArr(11) & ",misura=" & strArr(20) & ",obbligoprz=" & strArr(10) & ",peso=" & strArr(16) & ",obbligodes=" & strArr(17) & ",punti=" & strArr(18) & ",nVariazioni=" & strArr(19) & "   where codint ='" & strArr(1) & "'")
						If Main.vSql1.ExecQuerySingleResult("select count(*) from allergeniplu where codint ='" & strArr(1).Trim & "'") > 0 And Not(map4.ContainsKey(strArr(1))) Then
							Main.vSql1.ExecNonQuery("delete from allergeniplu where codint ='" & SmartStringFormatter("", strArr(1)) & "'")
							map4.Put(strArr(1), "")
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from ingredientiplu where codint ='" & strArr(1).Trim & "'") > 0 And Not(map4.ContainsKey(strArr(1))) Then
							Main.vSql1.ExecNonQuery("delete from ingredientiplu where codint ='" & SmartStringFormatter("", strArr(1)) & "'")
							map3.Put(strArr(1), "")
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where variazioniauto=1 and codint ='" & strArr(1).Trim & "'") > 0 And Not(map2.ContainsKey(strArr(1))) Then
							Main.vSql1.ExecNonQuery("delete from varauto where codint ='" & SmartStringFormatter("", strArr(1)) & "'")
							Main.vSql1.ExecNonQuery("update anagra set variazioniauto=0 where codint ='" & SmartStringFormatter("", strArr(1)) & "'")
							map2.Put(strArr(1), "")
						End If
					End If
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "GruppiVariazioniArt where codint = '" & SmartStringFormatter("", strArr(1)) & "'") > 0 Then
						Main.vSql1.ExecNonQuery("delete from GruppiVariazioniArt where codint='" & SmartStringFormatter("", strArr(1)) & "'")
					End If
					If vSplit2.Length > 1 Then
						For Each str3 As String In vSplit2
							If Main.vSql1.ExecQuerySingleResult("Select count(*) from " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "GruppiVariazioniArt where codint = '" & SmartStringFormatter("", strArr(1)) & "' " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "and reparto =" & SmartStringFormatter("", str3) & "") = 0 Then
								Main.vSql1.ExecNonQuery("insert into GruppiVariazioniArt(codint,reparto) values('" & SmartStringFormatter("", strArr(1)) & "'," & SmartStringFormatter("", str3) & ")")
							End If
						Next
					End If
					If i2 < 100 Then
						DoEvents
						i = 0
					Else
						i = i2
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "va"
					Dim vNumberToString As String = Round2(strArr(2), 2)
					Dim vNumberToString2 As String = Round2(strArr(3), 2)
					Dim vNumberToString3 As String = Round2(strArr(4), 2)
					If strArr(5).Trim = "0" Then
						Main.vSql1.ExecNonQuery("delete from anagra  where codint ='" & strArr(1) & "'")
						Main.vSql1.ExecNonQuery("delete from ean where codint = '" & strArr(1) & "'")
						Main.vSql1.ExecNonQuery("delete from Testiart where codice='" & strArr(1) & "'")
						Main.vSql1.ExecNonQuery("delete from Artbloccati where codint ='" & strArr(1) & "'")
					Else
						Main.vSql1.ExecNonQuery("update anagra set list1=" & vNumberToString.Replace(",", ".") & ",list2=" & vNumberToString2.Replace(",", ".") & ",list5=" & vNumberToString3.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ea"
					Dim z4 As Boolean = Main.vSql1.ExecQuerySingleResult("select count(*) from ean where codice ='" & strArr(2).Trim & "' and codint ='" & strArr(1).Trim & "'") > 0
					Dim z5 As Boolean = Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where codint ='" & strArr(1).Trim & "'") > 0
					If Not(z4) And z5 Then
						Main.vSql1.ExecNonQuery("delete from ean where codice='" & strArr(2) & "'")
						If strArr(2).StartsWith("BILA") Then
							Main.vSql1.ExecNonQuery("delete from ean where codice ='" & strArr(2) & "'")
							Main.vSql1.ExecNonQuery("delete from ean where substr(codice,1,4) ='BILA' and codint ='" & strArr(1) & "'")
						End If
						If strArr(3).Trim <> "1" Then
							Main.vSql1.ExecNonQuery("INSERT INTO ean (codint,codice,qta,importo)  VALUES('" & strArr(1) & "','" & strArr(2) & "'," & strArr(3) & "," & IIf(Not(IsNumber(strArr(4))), "0", strArr(4)) & ")")
						Else
							Main.vSql1.ExecNonQuery("INSERT INTO ean (codint,codice)  VALUES('" & strArr(1) & "','" & strArr(2) & "')")
						End If
					Else If z4 And z5 Then
						If strArr(3).Trim = "0" Then
							Main.vSql1.ExecNonQuery("delete from ean where codint='" & strArr(1) & "' and codice='" & strArr(2) & "'")
						Else If strArr(3).Trim <> "1" Then
							Main.vSql1.ExecNonQuery("update ean set qta=" & strArr(3) & ",importo=" & IIf(Not(IsNumber(strArr(4))), "0", strArr(4)) & " where codice ='" & strArr(2).Trim & "' and codint ='" & strArr(1).Trim & "'")
						Else
							Main.vSql1.ExecNonQuery("update ean set qta=1,importo=0 where qta<>1 and codice ='" & strArr(2).Trim & "' and codint ='" & strArr(1).Trim & "'")
						End If
					End If
					If strArr(2).StartsWith("BILA") Then
						Main.vSql1.ExecNonQuery("delete from DatiBilance where Codint ='" & strArr(1) & "'")
						Main.vSql1.ExecNonQuery("INSERT INTO [DatiBilance]" & CRLF & TAB & TAB & "([Codint]" & CRLF & TAB & TAB & ",[BilPlu]" & CRLF & TAB & TAB & ",[BilGruppo]" & CRLF & TAB & TAB & ",[BilTara]" & CRLF & TAB & TAB & ",[BilGGCons]" & CRLF & TAB & TAB & ",[BilTipo]" & CRLF & TAB & TAB & ",[BilTestoGen1]" & CRLF & TAB & TAB & ",[BilTestoGen2]" & CRLF & TAB & TAB & ",[BilTestoGen3]" & CRLF & TAB & TAB & ",[BilTestoGen4]" & CRLF & TAB & TAB & ",[Aggiornamento]" & CRLF & TAB & TAB & ",[BilIngredienti])" & CRLF & TAB & "VALUES" & CRLF & TAB & TAB & "('" & SmartStringFormatter("", strArr(1).Trim) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", strArr(7).Trim) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", strArr(8).Trim) & "'" & CRLF & TAB & TAB & "," & SmartStringFormatter("", strArr(9).Trim) & CRLF & TAB & TAB & "," & SmartStringFormatter("", strArr(10).Trim) & CRLF & TAB & TAB & "," & SmartStringFormatter("", strArr(11).Trim) & CRLF & TAB & TAB & "," & SmartStringFormatter("", strArr(12).Trim) & CRLF & TAB & TAB & "," & SmartStringFormatter("", strArr(13).Trim) & CRLF & TAB & TAB & "," & SmartStringFormatter("", strArr(14).Trim) & CRLF & TAB & TAB & "," & SmartStringFormatter("", strArr(15).Trim) & CRLF & TAB & TAB & ",1" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", strArr(16).Trim.Replace("'", "")) & "'" & CRLF & TAB & TAB & ")" & CRLF)
					End If
					If strArr(2).ToLowerCase.StartsWith("vv") Then
						Main.vSql1.ExecNonQuery("update anagra set bvar=1 where codint ='" & strArr(1) & "'")
					Else
						Dim vNumberToString4 As String = Round2(strArr(5), 2)
						Dim vNumberToString5 As String = Round2(strArr(6), 2)
						Main.vSql1.ExecNonQuery("update anagra set list3=" & vNumberToString4.Replace(",", ".") & ",list4=" & vNumberToString5.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ms"
					Main.vSql1.ExecNonQuery("update clienti set CodMaster='" & SmartStringFormatter("", strArr(1)) & "',tesseraaggiuntiva=" & SmartStringFormatter("", IIf(strArr(3) = "0", "0", "1")) & " where codice ='" & SmartStringFormatter("", strArr(2)) & "'")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ig"
					If Not(map2.ContainsKey(strArr(1))) Then
						Main.vSql1.ExecNonQuery("delete from varauto where codint ='" & SmartStringFormatter("", strArr(1)) & "'")
						map2.Put(strArr(1), "")
					End If
					Main.vSql1.ExecNonQuery("update anagra set variazioniauto=1 where codint ='" & SmartStringFormatter("", strArr(1)) & "'")
					Main.vSql1.ExecNonQuery("insert into varauto (codint,codintvar) values('" & SmartStringFormatter("", strArr(1)) & "','" & SmartStringFormatter("", strArr(2)) & "')")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ie"
					Main.vSql1.ExecNonQuery("update ingredienti set descrizione='" & SmartStringFormatter("", strArr(2)) & "' where codice =" & SmartStringFormatter("", strArr(1)) & "")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ae"
					Main.vSql1.ExecNonQuery("update allergeni set descrizione='" & SmartStringFormatter("", strArr(2)) & "',tag=" & SmartStringFormatter("", strArr(3)) & " where codice =" & SmartStringFormatter("", strArr(1)) & "")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ia"
					If Not(map3.ContainsKey(strArr(1))) Then
						Main.vSql1.ExecNonQuery("delete from ingredientiplu where codint ='" & SmartStringFormatter("", strArr(1)) & "'")
						map3.Put(strArr(1), "")
					End If
					Main.vSql1.ExecNonQuery("insert into ingredientiplu (codint,codice) values('" & SmartStringFormatter("", strArr(1)) & "','" & SmartStringFormatter("", strArr(2)) & "')")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "al"
					If Not(map4.ContainsKey(strArr(1))) Then
						Main.vSql1.ExecNonQuery("delete from allergeniplu where codint ='" & SmartStringFormatter("", strArr(1)) & "'")
						map4.Put(strArr(1), "")
					End If
					Main.vSql1.ExecNonQuery("insert into allergeniplu (codint,codice) values('" & SmartStringFormatter("", strArr(1)) & "','" & SmartStringFormatter("", strArr(2)) & "')")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "hm"
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettmnu where codmnu =" & SmartStringFormatter("", strArr(1)) & "") > 0 Then
						Main.vSql1.ExecQuerySingleResult("delete from dettmnu where codmnu =" & SmartStringFormatter("", strArr(1)) & "")
					End If
					If strArr(3) = "1" Then
						Main.vSql1.ExecNonQuery("update headmnu set descrizione ='" & SmartStringFormatter("", strArr(2).Trim.Replace("'", "").Replace(",", "")) & "' where codmnu =" & SmartStringFormatter("", strArr(1)) & "")
						Main.vSql1.ExecNonQuery("update anagra set descrizione ='" & SmartStringFormatter("", strArr(2).Trim.Replace("'", "").Replace(",", "")) & "' where" & TAB & "codint ='mnu" & SmartStringFormatter("", strArr(1)) & "'")
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "hd"
					Dim str4 As String = "0"
					Dim str5 As String = ""
					If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra inner join reparti on reparti.codice = anagra.reparto where codint ='" & strArr(2) & "'") > 0 Then
						str5 = Main.vSql1.ExecQuerySingleResult("select reparti.descrizione from anagra inner join reparti on reparti.codice = anagra.reparto where codint ='" & strArr(2) & "'")
						str4 = Main.vSql1.ExecQuerySingleResult("select reparti.indice from anagra inner join reparti on reparti.codice = anagra.reparto where codint ='" & strArr(2) & "'")
					End If
					Main.vSql1.ExecNonQuery("insert into dettmnu (codmnu,codint,descrizione,prezzo,indice,desreparto,auto) values(" & SmartStringFormatter("", strArr(1)) & ",'" & SmartStringFormatter("", strArr(2)) & "','" & SmartStringFormatter("", strArr(3).Replace("'", "").Replace(",", "")) & "'," & SmartStringFormatter("", strArr(4)) & "," & SmartStringFormatter("", str4) & ",'" & SmartStringFormatter("", str5) & "'," & SmartStringFormatter("", strArr(5)) & ")")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "query"
					Try
						Main.vSql1.ExecNonQuery(strArr(1))
					Catch
						Dim vObjectToCharSequence9 As Object = "Errore nella query arrivata dalla sede:" & CRLF & strArr(1)
						Dim vObjectToCharSequence10 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
						Sub217(LastException.Message)
					End Try
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "re"
					Main.vSql1.ExecNonQuery("update reparti set descrizione='" & strArr(2) & "',indice = " & strArr(3) & ",maximpo = " & strArr(4) & ",guadagnop = " & strArr(5) & ",guadagnov = " & strArr(6) & ",iva = " & strArr(7) & ",TurnoP = " & strArr(8) & ",NF = " & strArr(9) & ",vincite = " & strArr(10) & ",Palmari = " & strArr(11) & " where codice =" & strArr(1))
					Main.vSql1.ExecNonQuery("update pagine set testo = '" & Sub209(strArr(2).Trim) & "' where valore =" & strArr(1) & " and tipo =3")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "op"
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from operatori where codice = " & Main.Operatore) > 0 Then
						Dim str6 As String = ""
						If strArr.Length > 4 Then
							Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select funzioni from operatori where codice = " & Main.Operatore)
							str6 = ",funzioni = '" & (strArr(4) & IIf(vExecQuerySingleResult.Length > strArr(4).Length, vExecQuerySingleResult.SubString(strArr(4).Length), "")) & "'"
						End If
						Main.vSql1.ExecNonQuery("update operatori set descrizione='" & strArr(2) & "',pwd='" & strArr(3) & "' " & str6 & " where codice = " & strArr(1))
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "op2"
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from operatori where codice = " & Main.Operatore) > 0 And strArr.Length = 8 Then
						Dim str7 As String = ""
						Dim str8 As String = strArr(2)
						Dim str9 As String = IIf(strArr(1) = "1", "11111", strArr(3))
						Dim vObjectToString As String = IIf(strArr(4) = "-1", "1", "0")
						Dim vSplit3() As String = Regex.Split("\|", strArr(7))
						If strArr.Length > 4 And vSplit3.Length = 2 Then
							Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("Select funzioni from operatori where codice = " & strArr(1))
							Dim vExecQuerySingleResult3 As String = Main.vSql1.ExecQuerySingleResult("Select funzioni2 from operatori where codice = " & strArr(1))
							str7 = ",funzioni = '" & (vSplit3(0) & IIf(vExecQuerySingleResult2.Length > vSplit3(0).Length, vExecQuerySingleResult2.SubString(vSplit3(0).Length), "")) & "',funzioni2 = '" & (vSplit3(1) & IIf(vExecQuerySingleResult3.Length > vSplit3(1).Length, vExecQuerySingleResult3.SubString(vSplit3(1).Length), "")) & "'"
						End If
						Main.vSql1.ExecNonQuery("update operatori set Attivo=" & vObjectToString & " ,descrizione='" & str8 & "',pwd='" & str9 & "' " & str7 & " where codice = " & strArr(1))
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "pa"
					Dim str10 As String = IIf(strArr.Length > 6, ",GeneraPunti=" & strArr(6).Trim, "")
					Main.vSql1.ExecNonQuery("update pagamenti set descrizione ='" & strArr(2).Trim & "',obbligo = " & IIf(strArr(3).Trim = "0", "0", "1") & ",buonosr = " & IIf(strArr(4).Trim = "0", "0", "1") & ",RTPagamento=" & strArr(5).Trim & str10 & " where codice ='" & strArr(1) & "'")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "iv"
					Dim str11 As String = strArr(3)
					If strArr.Length > 4 And strArr(4) > 0 Then
						str11 = NumberFormat2(strArr(4) / 100, 1, 2, 2, False)
					End If
					Main.vSql1.ExecNonQuery("update iva set descrizione ='" & strArr(2).Trim & "',RTIva=" & strArr(6) & ",natura=" & strArr(5) & ",aliquota2 =" & str11 & " where codice ='" & strArr(1) & "'")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "gr"
					Main.vSql1.ExecNonQuery("update gruppovar set descrizione ='" & strArr(2).Trim & "',indice =" & strArr(3).Trim & ",vEsclusive =" & strArr(4).Trim & " where codice ='" & strArr(1) & "'")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ofsc"
					If strArr(4).Length <= 1 Then
						Main.vSql1.ExecNonQuery("update anagra set scop =" & strArr(2).Trim.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					Else
						Sub010(strArr, "update anagra set scop =" & strArr(2).Trim.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "um"
					Main.vSql1.ExecNonQuery("update um set descrizione='" & strArr(2) & "' where codice = " & strArr(1))
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ofsv"
					If strArr(4).Length <= 1 Then
						Main.vSql1.ExecNonQuery("update anagra set scov =" & strArr(2).Trim.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					Else
						Sub010(strArr, "update anagra set scov =" & strArr(2).Trim.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "oftg"
					If strArr(3).Length <= 1 Then
						Main.vSql1.ExecNonQuery("update anagra set list1 =" & strArr(2).Trim.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					Else
						Sub010(strArr, "update anagra set list1 =" & strArr(2).Trim.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "ofen"
					Main.vSql1.ExecNonQuery("update anagra set scop =0,scov=0, list1 =" & strArr(2).Trim.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "giac"
					If strArr(2) <> "0.000" Then
						Main.vSql1.ExecNonQuery("update anagra set flgmag=1, giac = " & strArr(2).Trim.Replace(",", ".") & " where  codint ='" & strArr(1) & "'")
					Else
						Main.vSql1.ExecNonQuery("update anagra set giac = " & strArr(2).Trim.Replace(",", ".") & " where codint ='" & strArr(1) & "'")
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "cl"
					map.Initialize
					map.Put("codice", strArr(1).Trim)
					map.Put("descrizione", strArr(2).Trim)
					map.Put("citta", strArr(3).Trim)
					map.Put("provincia", strArr(4).Trim)
					map.Put("piva", strArr(5).Trim)
					map.Put("codf", strArr(6).Trim)
					map.Put("telefono", strArr(7).Trim)
					map.Put("fax", strArr(8).Trim)
					map.Put("via", strArr(9).Trim)
					map.Put("cap", strArr(10).Trim)
					If modfunstr.Sub006(strArr(11)) <> 1 Then
						If modfunstr.Sub006(strArr(11)) <> 2 Then
							str2 = "0"
							map.Put("listino", str2)
							map.Put("sconto", IIf(strArr(12).Trim = "0", strArr(12).Trim, "0"))
							map.Put("fido", IIf(strArr(13) <> "", "0", strArr(13)))
							map.Put("abpunti", IIf(strArr(14).Trim = "0", 1, 0))
							map.Put("abprep", IIf(strArr(15).Trim = "0", 1, 0))
							map.Put("abpost", IIf(strArr(16).Trim = "0", 1, 0))
							If strArr.Length > 27 And (strArr(27).Trim.Length = 0 Or strArr(27).Trim.Length = 8) Then
								map.Put("codLotteria", strArr(27).Trim)
							End If
							If strArr.Length > 28 And strArr(28).Trim.Length = 1 And IsNumber(strArr(28)) Then
								vTmp_ = modfunstr.Sub006(strArr(28))
								If vTmp_ > 3 Then
									vTmp_ = vTmp_ - 1
								End If
								map.Put("docPredefinito", vTmp_)
							End If
							If strArr.Length > 29 And strArr(29).Trim.Length = 8 And strArr(29).Trim <> "00000000" Then
								map.Put("dcompleanno", strArr(29).SubString2(4, 6) & "/" & strArr(29).SubString(6) & "/" & strArr(29).SubString2(0, 4))
							End If
							If strArr.Length > 30 And strArr(30).Trim.Length = 1 Then
								map.Put("VerificaGDPR", IIf(strArr(30).Trim <> "0", 0, 1))
							End If
							vTmp = modfunstr.Sub006(strArr(17))
							If vTmp >= 0 And vTmp < 10 Then
								map.Put("grpcli", vTmp)
							End If
							If Main.vSql1.ExecQuerySingleResult("select count(*) from clienti where codice ='" & strArr(1).Trim & "'") <> 0 Then
								list.Add(map)
							Else
								Dim map5 As Map
								map5.Initialize
								map5.Put("codice", strArr(1).Trim)
								dbutil.Sub012(Main.vSql1, "clienti", map, map5)
							End If
							Dim map6 As Map
							map6.Initialize
							map6.Put("Codice", strArr(1).Trim)
							map6.Put("TipoSoggettoCli", strArr(20))
							map6.Put("NomeCli", strArr(21))
							map6.Put("CognomeCli", strArr(22))
							map6.Put("NazioneCli", strArr(23))
							map6.Put("EsigibilitaIVA", strArr(24))
							map6.Put("PEC", strArr(25).Trim)
							map6.Put("CodiceDestinatario", strArr(26))
							If Main.vSql1.ExecQuerySingleResult("select count(*) from FEdatiCli where codice ='" & strArr(1).Trim & "'") <> 0 Then
								list2.Add(map6)
							Else
								Dim map7 As Map
								map7.Initialize
								map7.Put("codice", strArr(1).Trim)
								dbutil.Sub012(Main.vSql1, "FEdatiCli", map6, map7)
							End If
							If strArr.Length > 18 And strArr(18).Trim <> "" Then
								Main.vSql1.ExecNonQuery("delete from TestiCli where codice='" & strArr(1).Trim & "'")
								If strArr(18).Trim <> "delete" Then
									Main.vSql1.ExecNonQuery("insert into TestiCli(codice,testo) values('" & strArr(1).Trim & "','" & strArr(18).Trim.Replace("'", "") & "')")
								End If
							End If
							If i2 < 100 Then
							End If
							vReadLine = textReaderWrapper.ReadLine
							z3 = z2
						End If
					End If
					str2 = strArr(11)
					map.Put("listino", str2)
					map.Put("sconto", IIf(strArr(12).Trim = "0", strArr(12).Trim, "0"))
					map.Put("fido", IIf(strArr(13) <> "", "0", strArr(13)))
					map.Put("abpunti", IIf(strArr(14).Trim = "0", 1, 0))
					map.Put("abprep", IIf(strArr(15).Trim = "0", 1, 0))
					map.Put("abpost", IIf(strArr(16).Trim = "0", 1, 0))
					If strArr.Length > 27 Then
						map.Put("codLotteria", strArr(27).Trim)
					End If
					If strArr.Length > 28 Then
						vTmp_ = modfunstr.Sub006(strArr(28))
						If vTmp_ > 3 Then
						End If
						map.Put("docPredefinito", vTmp_)
					End If
					If strArr.Length > 29 Then
						map.Put("dcompleanno", strArr(29).SubString2(4, 6) & "/" & strArr(29).SubString(6) & "/" & strArr(29).SubString2(0, 4))
					End If
					If strArr.Length > 30 Then
						map.Put("VerificaGDPR", IIf(strArr(30).Trim <> "0", 0, 1))
					End If
					vTmp = modfunstr.Sub006(strArr(17))
					If vTmp >= 0 Then
						map.Put("grpcli", vTmp)
					End If
					If Main.vSql1.ExecQuerySingleResult("select count(*) from clienti where codice ='" & strArr(1).Trim & "'") <> 0 Then
					End If
					Dim map62 As Map
					map62.Initialize
					map62.Put("Codice", strArr(1).Trim)
					map62.Put("TipoSoggettoCli", strArr(20))
					map62.Put("NomeCli", strArr(21))
					map62.Put("CognomeCli", strArr(22))
					map62.Put("NazioneCli", strArr(23))
					map62.Put("EsigibilitaIVA", strArr(24))
					map62.Put("PEC", strArr(25).Trim)
					map62.Put("CodiceDestinatario", strArr(26))
					If Main.vSql1.ExecQuerySingleResult("select count(*) from FEdatiCli where codice ='" & strArr(1).Trim & "'") <> 0 Then
					End If
					If strArr.Length > 18 Then
						Main.vSql1.ExecNonQuery("delete from TestiCli where codice='" & strArr(1).Trim & "'")
						If strArr(18).Trim <> "delete" Then
						End If
					End If
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "INZ"
					Sub115(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "VIN"
					Sub123(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "RIC"
					Sub119(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "GRP"
					Sub114(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "MIX"
					Sub116(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "MSC"
					Sub117(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "MSG"
					Sub118(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "BAS"
					Sub113(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case "TIA"
					Sub122(strArr)
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
				Case Else
					If i2 < 100 Then
					End If
					vReadLine = textReaderWrapper.ReadLine
					z3 = z2
			End Select
			Return False
		Loop
		If list.Size > 0 Then
			dbutil.Sub011(Main.vSql1, "clienti", list)
		End If
		If list2.Size > 0 Then
			dbutil.Sub011(Main.vSql1, "FEdatiCli", list2)
		End If
		textReaderWrapper.Close
		Main.vSql1.TransactionSuccessful
		Main.vSql1.EndTransaction
		If Not(Main.v_attivamp) Then
			Sub069()
		End If
		ProgressDialogHide
		Return True
	Catch
		ToastMessageShow(LastException.Message, True)
		Main.vSql1.EndTransaction
		ProgressDialogHide
		Return False
	End Try
End Sub

Sub Sub113(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPPanieri")
	Else
		Dim str2 As String = strArr(2)
		If Not(Sub032(str, "delete from MPPanieri where codice ='" & str2 & "'", "delete from MPPanieri where codice ='" & str2 & "'")) Then
			Dim list As List
			list.Initialize
			Dim map As Map
			map.Initialize
			map.Put("Codice", strArr(2))
			map.Put("Tipo", strArr(3))
			map.Put("CodiceElemento", strArr(4))
			map.Put("PaniereQta", strArr(4) / 100)
			map.Put("PaniereImporto", strArr(4) / 100)
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPPanieri where codice ='" & str2 & "'") > 0 Then
				Main.vSql1.ExecNonQuery("delete from MPPanieri where codice ='" & str2 & "'")
			End If
			list.Add(map)
			dbutil.Sub011(Main.vSql1, "MPPanieri", list)
		End If
	End If
	Return True
End Sub

Sub Sub114(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPRicompenseGruppi")
	Else
		Dim str2 As String = strArr(2)
		If Not(Sub032(str, "delete from MPRicompenseGruppi where codice ='" & str2 & "'", "delete from MPRicompenseGruppi where codice ='" & str2 & "'")) Then
			Dim list As List
			list.Initialize
			Dim map As Map
			map.Initialize
			map.Put("Codice", strArr(2))
			map.Put("CodiceCondizione", strArr(3))
			map.Put("CodiceGruppoRicompensa", strArr(4))
			map.Put("NumeroRicompenseGruppo", strArr(5))
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPRicompenseGruppi where  codice ='" & str2 & "' and CodiceCondizione='" & strArr(3) & "' and CodiceGruppoRicompensa = " & strArr(4)) > 0 Then
				Main.vSql1.ExecNonQuery("delete from MPRicompenseGruppi where  codice ='" & str2 & "' and CodiceCondizione='" & strArr(3) & "' and CodiceGruppoRicompensa = " & strArr(4))
			End If
			list.Add(map)
			dbutil.Sub011(Main.vSql1, "MPRicompenseGruppi", list)
		End If
	End If
	Return True
End Sub

Sub Sub115(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPIniziative")
	Else
		Dim str2 As String = strArr(4)
		If Not(Sub032(str, "delete from MPIniziative where codice ='" & str2 & "' and CodiceCondizione='" & strArr(13) & "'", "delete from MPIniziative where ElementoScontrino='" & strArr(2) & "' and CodElementoScontrino='" & strArr(3) & "' And codice ='" & str2 & "'")) Then
			Dim list As List
			list.Initialize
			Dim map As Map
			map.Initialize
			map.Put("ElementoScontrino", strArr(2))
			map.Put("CodElementoScontrino", strArr(3))
			map.Put("Codice", strArr(4))
			map.Put("ApplicazioneSconti", strArr(5))
			map.Put("Linea", strArr(6))
			map.Put("DataInizio", strArr(7).SubString(4) & strArr(7).SubString2(2, 4) & strArr(7).SubString2(0, 2))
			map.Put("OraInizio", strArr(9))
			map.Put("DataFine", strArr(8).SubString(4) & strArr(8).SubString2(2, 4) & strArr(8).SubString2(0, 2))
			map.Put("OraFine", strArr(10))
			map.Put("GiorniValidita", strArr(11))
			map.Put("Esclusivita", strArr(12))
			map.Put("CodiceCondizione", strArr(13))
			map.Put("Applicazione", strArr(14))
			map.Put("Priorita", strArr(15))
			map.Put("AmountType", strArr(16))
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPIniziative where CodElementoScontrino='" & strArr(3) & "' and  ElementoScontrino='" & strArr(2) & "' and codice ='" & strArr(4) & "' and CodiceCondizione='" & strArr(13) & "'") > 0 Then
				Main.vSql1.ExecNonQuery("delete from MPIniziative  where CodElementoScontrino='" & strArr(3) & "' and  ElementoScontrino='" & strArr(2) & "' and codice ='" & strArr(4) & "' and CodiceCondizione='" & strArr(13) & "'")
			End If
			list.Add(map)
			dbutil.Sub011(Main.vSql1, "MPIniziative", list)
		End If
	End If
	Return True
End Sub

Sub Sub116(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPMixArticoli")
	Else
		Dim str2 As String = strArr(4)
		Dim str3 As String = strArr(5)
		If Not(Sub032(str, "delete from MPMixArticoli where codice ='" & str2 & "' and CodiceCondizione='" & str3 & "'", "delete from MPMixArticoli where CodiceArticolo='" & strArr(2) & "' And codice ='" & str2 & "' and CodiceCondizione='" & str3 & "'")) Then
			Dim list As List
			list.Initialize
			Dim map As Map
			map.Initialize
			map.Put("CodiceArticolo", strArr(2))
			map.Put("MixCode", strArr(3))
			map.Put("Codice", strArr(4))
			map.Put("CodiceCondizione", strArr(5))
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPMixArticoli where CodiceArticolo='" & strArr(2) & "' and codice ='" & str2 & "' and CodiceCondizione='" & str3 & "'") > 0 Then
				Main.vSql1.ExecNonQuery("delete from MPMixArticoli where CodiceArticolo='" & strArr(2) & "' and codice ='" & str2 & "' and CodiceCondizione='" & str3 & "'")
			End If
			list.Add(map)
			dbutil.Sub011(Main.vSql1, "MPMixArticoli", list)
		End If
	End If
	Return True
End Sub

Sub Sub117(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPMessaggiCoupon")
	Else
		Dim str2 As String = strArr(2)
		If Not(Sub032(str, "delete from MPMessaggiCoupon where CodiceCoupon ='" & str2 & "'", "delete from MPMessaggiCoupon where CodiceCoupon ='" & str2 & "'")) Then
			Dim list As List
			list.Initialize
			Dim map As Map
			map.Initialize
			map.Put("CodiceCoupon", str2)
			map.Put("MessaggioCoupon", strArr(3))
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPMessaggiCoupon where CodiceCoupon ='" & str2 & "'") > 0 Then
				Main.vSql1.ExecNonQuery("delete from MPMessaggiCoupon where CodiceCoupon ='" & str2 & "'")
			End If
			list.Add(map)
			dbutil.Sub011(Main.vSql1, "MPMessaggiCoupon", list)
		End If
	End If
	Return True
End Sub

Sub Sub118(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPMessaggiCliente")
	Else
		Dim str2 As String = strArr(2)
		If Not(Sub032(str, "delete from MPMessaggiCliente where CodiceMsg ='" & str2 & "'", "delete from MPMessaggiCliente where CodiceMsg ='" & str2 & "'")) Then
			Dim list As List
			list.Initialize
			Dim map As Map
			map.Initialize
			map.Put("CodiceMsg", str2)
			map.Put("MessaggioMsg", strArr(3))
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPMessaggiCliente where CodiceMsg ='" & str2 & "'") > 0 Then
				Main.vSql1.ExecNonQuery("delete from MPMessaggiCliente where CodiceMsg ='" & str2 & "'")
			End If
			list.Add(map)
			dbutil.Sub011(Main.vSql1, "MPMessaggiCliente", list)
		End If
	End If
	Return True
End Sub

Sub Sub119(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPRicompense")
		Return True
	End If
	Dim str2 As String = strArr(2)
	Dim str3 As String = strArr(3)
	Dim str4 As String = strArr(strArr.Length - 2)
	Dim str5 As String = strArr(strArr.Length - 1)
	If Sub032(str, "delete from MPRicompense where codice ='" & str2 & "' and CodiceCondizione='" & str3 & "'", "delete from MPRicompense where VeriabileRicompensa='" & strArr(4) & "' and ElementoRicompensa='" & strArr(5) & "' And codice ='" & str2 & "'") Then
		Return True
	End If
	Dim list As List
	list.Initialize
	Dim map As Map
	map.Initialize
	map.Put("Codice", str2)
	map.Put("CodiceCondizione", str3)
	map.Put("VeriabileRicompensa", strArr(4))
	map.Put("ElementoRicompensa", strArr(5))
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPLimitiRicompense where codice ='" & str2 & "' and CodiceCondizione='" & str3 & "' and Priorita = " & str4) > 0 Then
		Main.vSql1.ExecNonQuery("delete from MPLimitiRicompense where codice ='" & str2 & "' and CodiceCondizione='" & str3 & "' and Priorita = " & str4)
	End If
	Dim s As Short = 6
	Dim i As Int
	For i = 1 To 30
		Main.vSql1.ExecNonQuery("insert into MPLimitiRicompense(Codice," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "InizioLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "FineLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "PassoLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ValoreLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "SegnoLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " values('" & SmartStringFormatter("", str2) & "'," & CRLF & TAB & TAB & "'" & SmartStringFormatter("", str3) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", strArr(s)) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", strArr(s + 1)) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", strArr(s + 2)) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", strArr(s + 3) / 100) & "," & CRLF & TAB & TAB & "'" & SmartStringFormatter("", strArr(s + 4)) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", str4) & ")")
		s = s + 5
		If strArr(s - 4) = 0 Or strArr(s - 4) = 99999999 Then
			Exit
		End If
	Next
	map.Put("SogliaRicompensa", strArr(s))
	Dim s2 As Short = s + 1
	map.Put("TipoRicompensa", strArr(s2))
	Dim s3 As Short = s2 + 1
	If strArr(s3).Length = 8 And strArr(s3) <> "00000000" Then
		map.Put("DataInizioRedenzione", DateUtils.setdate(strArr(s3).SubString(4), strArr(s3).SubString2(2, 4), strArr(s3).SubString2(0, 2)))
	End If
	Dim s4 As Short = s3 + 1
	If strArr(s4).Length = 8 And strArr(s4) <> "00000000" Then
		map.Put("DataFineRedenzione", DateUtils.setdate(strArr(s4).SubString(4), strArr(s4).SubString2(2, 4), strArr(s4).SubString2(0, 2)))
	End If
	Dim s5 As Short = s4 + 1
	map.Put("CodiceMessaggioCoupon", strArr(s5))
	Dim s6 As Short = s5 + 1
	map.Put("CumulabilitaRicompensa", strArr(s6))
	Dim s7 As Short = s6 + 1
	map.Put("TipoCalcoloScontoRicompensa", strArr(s7))
	map.Put("TipoStampaCouponRicompensa", strArr(s7 + 1))
	map.Put("Priorita", str4)
	map.Put("GruppoOrdinamentoRicompensa", str5)
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPRicompense where  codice ='" & str2 & "' and CodiceCondizione='" & str3 & "' and Priorita = " & str4) > 0 Then
		Main.vSql1.ExecNonQuery("delete from MPRicompense where  codice ='" & str2 & "' and CodiceCondizione='" & str3 & "' and Priorita = " & str4)
	End If
	list.Add(map)
	dbutil.Sub011(Main.vSql1, "MPRicompense", list)
	Return True
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m5… (riga 9921).
Sub Sub120(str As String, str2 As String, str3 As String, z As Boolean)
	Dim vSplit As String()
	Dim i As Int
	Dim i2 As Int = 0
	Dim zArr(2) As Boolean
	ProgressDialogShow2("Attendere ... elaborazione in corso ...", True)
	Try
		Dim vReadString As String = File.ReadString(str, str2)
		vSplit = Regex.Split(CRLF, vReadString)
	Catch
		Dim exc As Exception = e
	End Try
	If vSplit.Length > 0 Then
		Dim length As Int = vSplit.Length - 1
		Dim i3 As Int = 0
		Dim str4 As String = ""
		Dim i4 As Int = 0
		Do While i3 <= length
			vSplit(i3) = vSplit(i3).Replace(Chr(10), "").Replace(Chr(13), "")
			If i3 = 0 Then
				If vSplit(i3).ToLowerCase <> "anagra" And vSplit(i3).ToLowerCase <> "venduto" Then
					ProgressDialogHide
					Dim vObjectToCharSequence As Object = "Non è stato trovato il nome del DB (anagra o venduto) da inserire nella prima riga del file."
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					Return
				End If
				If vSplit(i3).ToLowerCase = "anagra" And Not(zArr(0)) Then
					zArr(0) = True
					Main.vSql1.BeginTransaction
				End If
				If vSplit(i3).ToLowerCase = "venduto" And Not(zArr(1)) Then
					zArr(1) = True
					Main.vSql2.BeginTransaction
				End If
				str4 = vSplit(i3).ToLowerCase
				i = i2
			Else
				If vSplit(i3).Length < 4 Then
					i = i2
				Else If vSplit(i3).ToLowerCase = "anagra" Or vSplit(i3).ToLowerCase = "venduto" Then
					If vSplit(i3).ToLowerCase = "anagra" And Not(zArr(0)) Then
						zArr(0) = True
						Main.vSql1.BeginTransaction
					End If
					If vSplit(i3).ToLowerCase = "venduto" And Not(zArr(1)) Then
						zArr(1) = True
						Main.vSql2.BeginTransaction
					End If
					str4 = vSplit(i3).ToLowerCase
					i = i2
				Else
					If str4 = "anagra" Then
						Try
							Dim str5 As String = vSplit(i3)
							Dim replace As String = str5.Replace("%opattivo%", Main.Operatore)
							Main.vSql1.ExecNonQuery(replace.Replace("%numcassa%", Main.v_numcassa).Replace("%cliente%", str3))
							i = i2 + 1
						Catch
							i4 = i4 + 1
							Sub217(LastException.Message)
							i = i2
						End Try
					Else
						Try
							Dim str6 As String = vSplit(i3)
							Dim replace2 As String = str6.Replace("%opattivo%", Main.Operatore)
							Main.vSql2.ExecNonQuery(replace2.Replace("%numcassa%", Main.v_numcassa).Replace("%cliente%", str3))
							i = i2 + 1
						Catch
							i4 = i4 + 1
							Sub217(LastException.Message)
							i = i2
						End Try
					End If
					Dim exc2 As Exception = e
					If zArr(0) Then
						Main.vSql1.EndTransaction
					End If
					If zArr(1) Then
						Main.vSql2.EndTransaction
					End If
					Dim vObjectToCharSequence3 As Object = "Errore nell'esecuzione delle query " & IIf(i2 > 0, CRLF & "Riga numero:" & i2, "") & CRLF & "Nome file: " & str2
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				End If
				i3 = i3 + 1
				i2 = i
			End If
			If i3 Mod 30 = 0 Then
				DoEvents
			End If
			i3 = i3 + 1
			i2 = i
		Loop
		If zArr(0) Then
			Main.vSql1.TransactionSuccessful
			Main.vSql1.EndTransaction
		End If
		If zArr(1) Then
			Main.vSql2.TransactionSuccessful
			Main.vSql2.EndTransaction
		End If
		If z Then
			Sub215("Query eseguite correttamente:" & i2 & CRLF & "Query eseguite senza successo:" & i4)
		Else
			Dim vObjectToCharSequence5 As Object = "Query eseguite correttamente:" & i2 & CRLF & "Query eseguite senza successo:" & i4
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		End If
	End If
	ProgressDialogHide
End Sub

Sub Sub121(str As String, str2 As String, z As Boolean, z2 As Boolean) As String
	Dim exc As Exception
	Dim sql As SQL
	Dim str3 As String
	Dim randomAccessFile As RandomAccessFile
	Dim sql2 As SQL = Null
	ProgressDialogShow2("Attendere ... elaborazione in corso ...", True)
	Try
		'randomAccessFile = RandomAccessFile
		randomAccessFile.Initialize(str, str2, False)
	Catch
		exc = e
		sql = sql2
	End Try
	If Sub080(randomAccessFile) Then
		Dim vObjectToCharSequence As Object = "Non è stato trovato il nome del DB (anagra o venduto) da inserire nella prima riga del file."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		str3 = ""
	Else
		Dim vObjectToString As String = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
		If vObjectToString <> "anagra" And vObjectToString <> "venduto" Then
			Dim vObjectToCharSequence3 As Object = "Non è stato trovato il nome del DB (anagra o venduto) da inserire nella prima riga del file."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			str3 = ""
		Else
			sql2 = Main.vSql1
			If z2 Then
				Try
					If Sub080(randomAccessFile) Then
						Dim vObjectToCharSequence5 As Object = "La struttura del file non è corretta."
						Dim vObjectToCharSequence6 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
						str3 = ""
					Else
						Dim map As Map = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
						Dim vGetDefault As Object = map.GetDefault("Programma", "")
						If vGetDefault <> Main.vStr8 Then
							Dim vObjectToCharSequence7 As Object = "Il file è stato generato per un altro tipo di programma."
							Dim vObjectToCharSequence8 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
							str3 = ""
						Else If map.GetDefault("Versione", "") <> "1" Then
							Dim vObjectToCharSequence9 As Object = "La versione del file non corrisponde."
							Dim vObjectToCharSequence10 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
							str3 = ""
						Else
							If Main.vInt12 = map.GetDefault("nRows", 0) Then
								If Main.vInt14 = map.GetDefault("nRowGrid", 0) Then
									If Main.vInt13 = map.GetDefault("nCols", 0) Then
										If Main.vInt15 = map.GetDefault("nColGrid", 0) Then
											Main.vSql1.ExecNonQuery("delete from pagine")
										End If
									End If
								End If
							End If
							Dim vObjectToCharSequence11 As Object = "Il layout di tastiera non corrisponde a quello contenuto nel file."
							Dim vObjectToCharSequence12 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
							str3 = ""
						End If
					End If
				Catch
					exc = e2
					sql = sql2
					sql.EndTransaction
					Dim vObjectToCharSequence13 As Object = "Errore nell'esecuzione delle query " & CRLF & "Nome file: " & str2
					Dim vObjectToCharSequence14 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
					ProgressDialogHide
					str3 = ""
					Return str3
				End Try
			End If
			If vObjectToString = "anagra" Then
				sql2 = Main.vSql1
			Else
				sql2 = Main.vSql2
			End If
			sql2.BeginTransaction
			Do While Not(Sub080(randomAccessFile))
				Dim vObjectToString2 As String = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
				If Sub080(randomAccessFile) Then
					Exit
				End If
				If vObjectToString2 = "" Then
					Try
						Dim vObjectToString3 As String = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
						Log(vObjectToString3)
						sql2.ExecNonQuery(vObjectToString3)
					Catch
						Sub217(LastException.Message)
					End Try
				Else
					Dim list As List = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
					If list.IsInitialized And list.Size > 0 Then
						dbutil.Sub011(sql2, vObjectToString2, list)
					End If
				End If
				DoEvents
			Loop
			sql2.TransactionSuccessful
			sql2.EndTransaction
			If z Then
				Dim vObjectToCharSequence15 As Object = "Procedura ultimata correttamente"
				Dim vObjectToCharSequence16 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "OK", "", "", Main.vBmp1)
			End If
			ProgressDialogHide
			str3 = ""
		End If
	End If
	Return str3
End Sub

Sub Sub122(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPTitoloIniziative")
	Else
		Dim str2 As String = strArr(2)
		If Not(Sub032(str, "delete from MPTitoloIniziative where codice ='" & str2 & "'", "delete from MPTitoloIniziative where codice ='" & str2 & "'")) Then
			Dim list As List
			list.Initialize
			Dim map As Map
			map.Initialize
			map.Put("Codice", strArr(2))
			map.Put("Descrizione", strArr(3))
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPTitoloIniziative where codice ='" & str2 & "'") > 0 Then
				Main.vSql1.ExecNonQuery("delete from MPTitoloIniziative where codice ='" & str2 & "'")
			End If
			list.Add(map)
			dbutil.Sub011(Main.vSql1, "MPTitoloIniziative", list)
		End If
	End If
	Return True
End Sub

Sub Sub123(strArr As String()) As Boolean
	Dim str As String = strArr(1)
	If str = "D*" Then
		Main.vSql1.ExecQuerySingleResult("delete from MPVincoli")
	Else
		Dim str2 As String = strArr(2)
		Dim str3 As String = strArr(3)
		If Not(Sub032(str, "delete from MPVincoli where codice ='" & str2 & "' and CodiceCondizione='" & str3 & "'", "delete from MPVincoli where OggettoVincolo='" & strArr(4) & "' and ElementoVincolo='" & strArr(5) & "' and codice ='" & str2 & "'")) Then
			Dim list As List
			list.Initialize
			Dim map As Map
			map.Initialize
			map.Put("Codice", str2)
			map.Put("CodiceCondizione", str3)
			map.Put("OggettoVincolo", strArr(4))
			map.Put("ElementoVincolo", strArr(5))
			map.Put("OperatoreVincolo", strArr(6))
			map.Put("ModalitaConfrontoVincolo", strArr(7))
			map.Put("ConfrontoVincolo", strArr(8) / 100)
			If strArr(9).Length = 8 And strArr(9) <> "00000000" Then
				map.Put("DataFineRedenzione", DateUtils.setdate(strArr(9).SubString(4), strArr(9).SubString2(2, 4), strArr(9).SubString2(0, 2)))
			End If
			map.Put("GruppoVincolo", strArr(10))
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPVincoli where OperatoreVincolo='" & strArr(6) & "' and OggettoVincolo='" & strArr(4) & "' and ElementoVincolo='" & strArr(5) & "' and codice ='" & strArr(2) & "' and CodiceCondizione='" & strArr(3) & "'") > 0 Then
				Main.vSql1.ExecNonQuery("delete from MPVincoli  where OperatoreVincolo='" & strArr(6) & "' and OggettoVincolo='" & strArr(4) & "' and ElementoVincolo='" & strArr(5) & "' and codice ='" & strArr(2) & "' and CodiceCondizione='" & strArr(3) & "'")
			End If
			list.Add(map)
			dbutil.Sub011(Main.vSql1, "MPVincoli", list)
		End If
	End If
	Return True
End Sub

Sub Sub124
	vMap2.Initialize
	Dim i As Int
	For i = 1 To 23
		If File.Exists(File.DirDefaultExternal, "LayoutStampaTipo" & i & ".cfg") Then
			vMap2.Put(i, File.ReadMap(File.DirDefaultExternal, "LayoutStampaTipo" & i & ".cfg"))
		End If
	Next
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m0… (riga 10320).
Sub Sub125 As Boolean
	Dim z As Boolean
	Dim i As Int
	If File.Exists(File.DirDefaultExternal, "Config.txt") Then
		Dim vReadMap As Map = File.ReadMap(File.DirDefaultExternal, "Config.txt")
		Main.v_mserver = vReadMap.GetDefault("mServer", "smtp.gmail.com")
		Main.v_mporta = vReadMap.GetDefault("mPorta", "465")
		Main.v_muser = vReadMap.GetDefault("mUser", "")
		Main.v_mpwd = vReadMap.GetDefault("mPwd", "")
		Main.v_musers = vReadMap.GetDefault("mUserS", "")
		Main.v_mpwds = vReadMap.GetDefault("mPwdS", "")
		Main.v_mdesmittente = vReadMap.GetDefault("mDesMittente", "")
		Main.v_webapiindirizzo = vReadMap.GetDefault("WebApiIndirizzo", "https://one.italretail.it/TWO")
		Main.v_webapipi = vReadMap.GetDefault("WebApiPI", "")
		Main.v_webapipiesercente = vReadMap.GetDefault("WebApiPIEsercente", "")
		Main.v_webapicapesercente = vReadMap.GetDefault("WebApiCAPEsercente", "")
		Main.v_webapiragsoc = vReadMap.GetDefault("WebApiRagSoc", "")
		Main.v_webapidatiretailer = vReadMap.GetDefault("WebApiDatiRetailer", False)
		Main.v_ipeftsm = vReadMap.GetDefault("IPEFTSM", "")
		Main.v_portaeftsm = vReadMap.GetDefault("PORTAEFTSM", 5000)
		Main.v_eftsm = vReadMap.GetDefault("EFTSM", False)
		Main.v_eftsmstampa = vReadMap.GetDefault("EFTSMStampa", False)
		Main.v_eftsmsconti = vReadMap.GetDefault("EFTSMSCONTI", False)
		Main.v_ipeftm(1) = vReadMap.GetDefault("IpEft1", "")
		Main.v_ipeftm(2) = vReadMap.GetDefault("IpEft2", "")
		Main.v_ipeftm(3) = vReadMap.GetDefault("IpEft3", "")
		Main.v_ipeftm(4) = vReadMap.GetDefault("IpEft4", "")
		Main.v_ipeftm(5) = vReadMap.GetDefault("IpEft5", "")
		Main.v_ipeftm(6) = vReadMap.GetDefault("IpEft6", "")
		Main.v_ipeftm(7) = vReadMap.GetDefault("IpEft7", "")
		Main.v_ipeftm(8) = vReadMap.GetDefault("IpEft8", "")
		Main.v_ipeftm(9) = vReadMap.GetDefault("IpEft9", "")
		Main.v_procauto(1) = vReadMap.GetDefault("ProcAuto1", "")
		Main.v_procauto(2) = vReadMap.GetDefault("ProcAuto2", "")
		Main.v_procauto(3) = vReadMap.GetDefault("ProcAuto3", "")
		Main.v_procauto(4) = vReadMap.GetDefault("ProcAuto4", "")
		Main.v_procauto(5) = vReadMap.GetDefault("ProcAuto5", "")
		Main.v_md1 = vReadMap.GetDefault("mD1", "")
		Main.v_md2 = vReadMap.GetDefault("mD2", "")
		Main.v_md3 = vReadMap.GetDefault("mD3", "")
		Main.v_md4 = vReadMap.GetDefault("mD4", "")
		Main.v_md5 = vReadMap.GetDefault("mD5", "")
		Main.v_barra = vReadMap.GetDefault("barra", "")
		Main.v_barra2 = vReadMap.GetDefault("barra2", "")
		Main.v_barrareal = vReadMap.GetDefault("barra", "")
		Main.v_barrareal2 = vReadMap.GetDefault("barra2", "")
		Main.v_attivaterminale = vReadMap.GetDefault("AttivaTerminale", False)
		Main.v_solovenduto = vReadMap.GetDefault("SoloVenduto", False)
		Main.v_azzeradati = vReadMap.GetDefault("AzzeraDati", False)
		Main.v_nodatiperiodo = vReadMap.GetDefault("NoDatiPeriodo", False)
		Main.v_ipserver = vReadMap.GetDefault("Server", "192.168.1.110")
		If Main.v_ipserver.Trim = "" Then
			Main.v_ipserver = "192.168.1.110"
		End If
		Main.v_ipserverbila = vReadMap.GetDefault("ServerBila", "")
		Main.v_attivamp = vReadMap.GetDefault("AttivaMP", False)
		Main.v_attivakeyhttp = vReadMap.GetDefault("AttivaKeyHTTP", True)
		Main.v_attivainserimentocliente = vReadMap.GetDefault("AttivaInserimentoCliente", False)
		Main.v_attivasezionali = vReadMap.GetDefault("AttivaSezionali", False)
		Main.v_attivaazzeramentoprogressivi = vReadMap.GetDefault("AttivaAzzeramentoProgressivi", False)
		Main.v_noteinfe = vReadMap.GetDefault("noteInFE", False)
		Main.v_lastdatadocfm = vReadMap.GetDefault("LastDataDocFM", False)
		Main.v_prefissocoupon = vReadMap.GetDefault("PrefissoCoupon", "313")
		Main.v_paginapagamenti = vReadMap.GetDefault("PaginaPagamenti", 0)
		Main.v_ipcassa = vReadMap.GetDefault("IPCassa", "")
		Main.v_ipvis = vReadMap.GetDefault("IPVis", "")
		Main.v_iprpi = vReadMap.GetDefault("IPRPI", "")
		Main.v_percorsoazzera = vReadMap.GetDefault("PercorsoAzzera", "")
		Main.v_usbpath = vReadMap.GetDefault("UsbPath", "")
		If Not(File.Exists(Main.v_usbpath, "")) Then
			Main.v_usbpath = ""
		End If
		Main.v_opobbligatorio = vReadMap.GetDefault("OpObbligatorio", False)
		Main.v_terminalino = vReadMap.GetDefault("Terminalino", False)
		Main.v_daticompletidc = vReadMap.GetDefault("DatiCompletiDC", False)
		Main.v_regcancellazioni = vReadMap.GetDefault("RegCancellazioni", False)
		Main.v_logmf = vReadMap.GetDefault("LogMF", False)
		Main.v_logvd = vReadMap.GetDefault("LogVD", False)
		Main.v_lognf = vReadMap.GetDefault("LogNF", False)
		Main.v_mantieninopaginati = vReadMap.GetDefault("MantieniNoPaginati", False)
		Main.v_prefissocliente = vReadMap.GetDefault("PrefissoCliente", "111")
		Main.v_prefissott = vReadMap.GetDefault("PrefissoTT", "112")
		Main.v_maximpo = vReadMap.GetDefault("MaxImpo", 9999)
		Main.v_fondocassaauto = vReadMap.GetDefault("FondoCassaAuto", 0)
		Main.v_maximptavolo = vReadMap.GetDefault("MaxImpTavolo", 999)
		Main.v_tipofrazionamentovariazioni = vReadMap.GetDefault("TipoFrazionamentoVariazioni", 0)
		Main.v_valorizzazioneprezzofrazione = vReadMap.GetDefault("ValorizzazionePrezzoFrazione", 0)
		Main.v_websospenditavolo = vReadMap.GetDefault("WebSospendiTavolo", 0)
		Main.v_mintavololento = vReadMap.GetDefault("MinTavoloLento", 0)
		Main.v_copiefe = vReadMap.GetDefault("CopieFE", 0)
		Main.v_numeroscontrinist = vReadMap.GetDefault("NumeroScontriniST", 0)
		Main.v_copiefe2 = vReadMap.GetDefault("CopieFE2", 1)
		Main.v_modificamovimento = vReadMap.GetDefault("ModificaMovimento", False)
		Main.v_importazioneauto = vReadMap.GetDefault("ImportazioneAuto", False)
		Main.v_centralizzadoc = vReadMap.GetDefault("CentralizzaDoc", False)
		If vReadMap.GetDefault("GiacSede", False) Then
			If Main.v_attivaterminale Then
				z = True
				Main.v_giacsede = z
				Main.v_listpoco = vReadMap.GetDefault("ListPoco", 0)
				Main.v_iniziogiorno = vReadMap.GetDefault("InizioGiorno", 0)
				Main.v_altezzavariazioni = vReadMap.GetDefault("AltezzaVariazioni", 55)
				Main.v_asportoanticipo = vReadMap.GetDefault("AsportoAnticipo", 0)
				Main.v_minutiss = vReadMap.GetDefault("MinutiSS", 4)
				Main.v_prenotagiorniapertura = vReadMap.GetDefault("PrenotaGiorniApertura", "1111111")
				Main.v_prenotagiorni = vReadMap.GetDefault("PrenotaGiorni", 0)
				Main.v_numerott = vReadMap.GetDefault("NumeroTT", 0)
				Main.v_listmolto = vReadMap.GetDefault("ListMolto", 0)
				For i = 0 To 7
					Main.v_dalle(i) = vReadMap.GetDefault("Dalle" & i, vReadMap.GetDefault("Dalle", -1))
					Main.v_alle(i) = vReadMap.GetDefault("Alle" & i, vReadMap.GetDefault("Alle", -1))
					Main.v_listinoh(i) = vReadMap.GetDefault("ListinoH" & i, 0)
					If Main.v_dalle(i) >= 0 Then
						If Main.v_listinoh(i) = 0 Then
							Main.v_listinoh(i) = 1
						End If
					End If
				Next
				Main.v_salvaora = vReadMap.GetDefault("SalvaOra", -1)
				Main.v_codattivazione = vReadMap.GetDefault("CodAttivazione", "")
				Main.v_codattivazionesb = vReadMap.GetDefault("CodAttivazioneSB", "")
				Main.v_codattivazionebs = vReadMap.GetDefault("CodAttivazioneBS", "")
				If Not(vReadMap.ContainsKey("Glory")) Then
					If Not(vReadMap.GetDefault("Glory", False)) Then
						Main.v_glory = 0
					Else
						Main.v_glory = Main.cm_gloryold
						Dim packageManagerWrapper As PackageManager
						Dim vGetInstalledPackages As List = packageManagerWrapper.GetInstalledPackages
						Dim size As Int = vGetInstalledPackages.Size - 1
						Dim i2 As Int = 0
						Do While True
							If i2 > size Then
								Exit
							End If
							If vGetInstalledPackages.Get(i2) <> "ital.cashology" Then
								i2 = i2 + 1
							Else
								Main.v_glory = Main.cm_azkoyen
								Exit
							End If
						Loop
					End If
				Else
					Main.v_glory = vReadMap.GetDefault("GloryN", 0)
				End If
				Main.v_tallonpremio = vReadMap.GetDefault("TallonPremio", True)
				Main.v_listino2azero = vReadMap.GetDefault("Listino2aZero", False)
				Main.v_controllaprezziazero = vReadMap.GetDefault("ControllaPrezziaZero", False)
				Main.v_fatturafmt2 = vReadMap.GetDefault("FatturaFMT2", False)
				Main.v_attivafe = vReadMap.GetDefault("AttivaFE", False)
				Main.v_pausafe = vReadMap.GetDefault("PausaFE", False)
				Main.v_asyncfe = vReadMap.GetDefault("AsyncFE", 10)
				If Main.v_attivafe Then
					Main.v_barra = Main.v_barra.Replace("-yyyy-", DateTime.GetYear(Sub058()))
					Main.v_barra2 = Main.v_barra2.Replace("-yyyy-", DateTime.GetYear(Sub058()))
				End If
				If Not(vReadMap.ContainsKey("RiepNF")) Then
					If vReadMap.GetDefault("RiepNF", False) = False Then
						Main.v_riepnf = 0
					Else
						Main.v_riepnf = 1
					End If
				Else
					Main.v_riepnf = vReadMap.GetDefault("RiepNFN", 0)
				End If
				Main.v_errmail = vReadMap.GetDefault("ErrMail", False)
				Main.v_leggicodlotteria = vReadMap.GetDefault("LeggiCodLotteria", False)
				Main.v_solochiusura = vReadMap.GetDefault("SoloChiusura", False)
				Main.v_tema2 = vReadMap.GetDefault("Tema2", False)
				Main.v_temag = vReadMap.GetDefault("TemaG", 5)
				Main.v_sfondo = vReadMap.GetDefault("Sfondo", 1)
				Main.v_tastiera = vReadMap.GetDefault("Tastiera", 0)
				Main.v_colonnevarianti = vReadMap.GetDefault("ColonneVarianti", 0)
				Main.v_articolizero = vReadMap.GetDefault("ArticoliZero", 1)
				If Not(vReadMap.ContainsKey("MFSeriale")) Then
					If Not(vReadMap.GetDefault("MFSeriale", False)) Then
						Main.v_tipointerfaccia = 0
					Else
						Main.v_tipointerfaccia = 1
					End If
				Else
					Main.v_tipointerfaccia = vReadMap.GetDefault("TipoInterfaccia", 0)
				End If
				Main.v_gdfolderid = vReadMap.GetDefault("GDFolderID", "")
				Main.v_consolidaincassi = vReadMap.GetDefault("ConsolidaIncassi", False)
				Main.v_tipoimptabacchi = vReadMap.GetDefault("TipoImpTabacchi", 0)
				Main.v_sendclienti = vReadMap.GetDefault("SendClienti", 0)
				Main.v_ivadefault = vReadMap.GetDefault("IvaDefault", 1)
				Main.v_pagamentoprep = vReadMap.GetDefault("PagamentoPrep", 2)
				Main.v_ordinamentosc = vReadMap.GetDefault("OrdinamentoSc", 0)
				Main.v_arrotondav = vReadMap.GetDefault("ArrotondaV", 2)
				Main.v_arrotondacontantirt = vReadMap.GetDefault("ArrotondaContantiRT", 0)
				Main.v_fontsizec = vReadMap.GetDefault("FontSizeC", 2)
				Main.v_stampaconto = vReadMap.GetDefault("StampaConto", 0)
				Main.v_tabacchi = vReadMap.GetDefault("Tabacchi", True)
				Main.v_gestionespiagge = vReadMap.GetDefault("GestioneSpiagge", False)
				Main.v_xpunti = vReadMap.GetDefault("XPunti", 1)
				Main.v_marginetabacchi = vReadMap.GetDefault("MargineTabacchi", 0)
				Main.v_ognoeuro = vReadMap.GetDefault("OgnoEuro", 1)
				Main.v_termsala = vReadMap.GetDefault("TermSala", False)
				If Not(vReadMap.ContainsKey("TermSalaB")) Then
					If vReadMap.GetDefault("TermSalaB", False) = False Then
						Main.v_termsalab = 0
					Else
						Main.v_termsalab = 1
					End If
				Else
					Main.v_termsalab = vReadMap.GetDefault("TermSalaBN", 0)
				End If
				Main.v_termsalaop = vReadMap.GetDefault("TermSalaOp", 0)
				Main.v_salvataggio = vReadMap.GetDefault("Salvataggio", 5)
				Main.v_sbpwd = vReadMap.GetDefault("SBPWD", "")
				Main.v_serversave = vReadMap.GetDefault("ServerSave", "")
				Main.v_utentesave = vReadMap.GetDefault("UtenteSave", "italretail")
				Main.v_passwordsave = vReadMap.GetDefault("PasswordSave", "italretail")
				Main.v_prefixftpsave = vReadMap.GetDefault("PrefixFTPSave", "")
				Main.v_stampasala = vReadMap.GetDefault("StampaSala", False)
				Main.v_stampa66char = vReadMap.GetDefault("Stampa66Char", False)
				Main.v_repartogv = vReadMap.GetDefault("RepartoGV", -1)
				Main.v_nsalva = vReadMap.GetDefault("nSalva", 9)
				Main.v_stampafattura = vReadMap.GetDefault("StampaFattura", 0)
				Main.v_ipricevute = vReadMap.GetDefault("IpRicevute", "")
				Main.v_ipdistributore = vReadMap.GetDefault("ipDistributore", "")
				Main.v_desasporto = vReadMap.GetDefault("DesAsporto", "Asporto")
				Main.v_despreconto = vReadMap.GetDefault("DesPreconto", "RIEPILOGO PARZIALE")
				Main.v_desatesta = vReadMap.GetDefault("DesATesta", "A testa ")
				Main.v_ricevutadapdv = vReadMap.GetDefault("RicevutaDaPdv", 0)
				Main.v_ricevutaapdv = vReadMap.GetDefault("RicevutaAPdv", 0)
				Main.v_ricevutadacli = vReadMap.GetDefault("RicevutaDaCli", 8)
				Main.v_ricevutaacli = vReadMap.GetDefault("RicevutaACli", 12)
				Main.v_ricevutadacor = vReadMap.GetDefault("RicevutaDaCor", 13)
				Main.v_ricevutaacor = vReadMap.GetDefault("RicevutaACor", 36)
				Main.v_ricevutaspaziomf = vReadMap.GetDefault("RicevutaSpazioMF", 6)
				Main.v_intestanf = vReadMap.GetDefault("IntestaNF", False)
				Main.v_riepnfdett = vReadMap.GetDefault("RiepNFDett", True)
				Main.v_exportcorrispettivi = vReadMap.GetDefault("ExportCorrispettivi", False)
				Main.v_changeuscita = vReadMap.GetDefault("ChangeUscita", False)
				Main.v_eula = vReadMap.GetDefault("Eula", False)
				Main.v_stampacomande = vReadMap.GetDefault("StampaComande", False)
				Main.v_turni = vReadMap.GetDefault("Turni", False)
				Main.v_asportoora = vReadMap.GetDefault("AsportoOra", False)
				If Not(vReadMap.ContainsKey("SalvaVD")) Then
					If vReadMap.GetDefault("SalvaVD", False) = False Then
						Main.v_salvavd = 0
					Else
						Main.v_salvavd = 1
					End If
				Else
					Main.v_salvavd = vReadMap.GetDefault("SalvaVDN", 0)
				End If
				Main.v_consolida = vReadMap.GetDefault("Consolida", False)
				Main.v_consolidasc = vReadMap.GetDefault("ConsolidaSc", False)
				Main.v_varautocp = vReadMap.GetDefault("VarAutoCP", False)
				Main.v_visualizzavariazioni = vReadMap.GetDefault("VisualizzaVariazioni", False)
				Main.v_ordinainserimentovariazioni = vReadMap.GetDefault("OrdinaInserimentoVariazioni", False)
				Main.v_gestcoperti2 = vReadMap.GetDefault("GestCoperti2", False)
				Main.v_consolidalast = vReadMap.GetDefault("ConsolidaLast", True)
				Main.v_obbligoop = vReadMap.GetDefault("ObbligoOp", False)
				Main.v_obbligoopavvio = vReadMap.GetDefault("ObbligoOpAvvio", False)
				Main.v_obbligoopmovimento = vReadMap.GetDefault("ObbligoOpMovimento", False)
				Main.v_opextended = vReadMap.GetDefault("OpExtended", False)
				Main.v_riducimsg = vReadMap.GetDefault("RiduciMsg", False)
				Main.v_noforcecoperti = vReadMap.GetDefault("NoForceCoperti", False)
				Main.v_rieponly = vReadMap.GetDefault("RiepOnly", False)
				Main.v_verificastampanti = vReadMap.GetDefault("VerificaStampanti", False)
				Main.v_azzeraasporto = vReadMap.GetDefault("AzzeraAsporto", False)
				Main.v_chiedinasporto = vReadMap.GetDefault("ChiediNAsporto", False)
				Main.v_icone2 = vReadMap.GetDefault("Icone2", False)
				Main.v_rootdatetime = vReadMap.GetDefault("RootDateTime", False)
				Main.v_dataoranoroot = vReadMap.GetDefault("DataOraNoRoot", False)
				Main.v_attivanumtavolo = vReadMap.GetDefault("AttivaNumTavolo", True)
				Main.v_sottoconti = vReadMap.GetDefault("Sottoconti", False)
				Main.v_adddisponibilita = vReadMap.GetDefault("AddDisponibilita", False)
				If Not(vReadMap.ContainsKey("FrazionaConImporto")) Then
					If vReadMap.GetDefault("FrazionaConImporto", False) = False Then
						Main.v_frazionaconimporto = 0
					Else
						Main.v_frazionaconimporto = 1
					End If
				Else
					Main.v_frazionaconimporto = vReadMap.GetDefault("FrazionaConImportoN", 0)
				End If
				Main.v_imposuqta = vReadMap.GetDefault("ImpoSuQta", False)
				Main.v_consideraprzintero = vReadMap.GetDefault("ConsideraPrzIntero", False)
				Main.v_tastiombreggiati = vReadMap.GetDefault("TastiOmbreggiati", False)
				Main.v_disconnettiprt = vReadMap.GetDefault("DisconnettiPRT", False)
				Main.v_incassooperatori = vReadMap.GetDefault("IncassoOperatori", False)
				Main.v_riccredito = vReadMap.GetDefault("RicCredito", False)
				Main.v_icone2upd = vReadMap.GetDefault("Icone2UPD", False)
				Main.v_orafatt = vReadMap.GetDefault("OraFatt", False)
				Main.v_stampasposta = vReadMap.GetDefault("StampaSposta", False)
				Main.v_emergenza = vReadMap.GetDefault("Emergenza", False)
				Main.v_totem = vReadMap.GetDefault("Totem", False)
				Main.v_controlloturni = vReadMap.GetDefault("ControlloTurni", False)
				Main.v_avantiturnoauto = vReadMap.GetDefault("AvantiTurnoAuto", False)
				Main.v_turno1sempre = vReadMap.GetDefault("Turno1Sempre", False)
				Main.v_spooler = vReadMap.GetDefault("Spooler", False)
				If Main.v_spooler Then
					Main.v_disconnettiprt = True
				End If
				Main.v_checkvarianti = vReadMap.GetDefault("CheckVarianti", False)
				Main.v_tallonsempre = vReadMap.GetDefault("TallonSempre", False)
				Main.v_cassettosubito = vReadMap.GetDefault("CassettoSubito", False)
				Main.v_suonodacassa = vReadMap.GetDefault("SuonoDaCassa", False)
				Main.v_notallon = vReadMap.GetDefault("Tallon", 0)
				Main.v_stampareport = vReadMap.GetDefault("StampaReport", 0)
				If Not(vReadMap.ContainsKey("StampaNomeCli")) Then
					If vReadMap.GetDefault("StampaNomeCli", False) = False Then
						Main.v_stampanomecli = 0
					Else
						Main.v_stampanomecli = 1
					End If
				Else
					Main.v_stampanomecli = vReadMap.GetDefault("StampaNomeCliN", 0)
				End If
				Main.v_numcassa = vReadMap.GetDefault("NumCassa", "1")
				Main.v_nnegozio = vReadMap.GetDefault("nNegozio", "1")
				Main.v_screenbrightness = vReadMap.GetDefault("ScreenBrightness", 0.75)
				Main.v_datalastbackup = vReadMap.GetDefault("DataLastBackup", Sub058())
				Main.v_uid = vReadMap.GetDefault("Utente", "Inserire")
				Main.v_pwd = vReadMap.GetDefault("Password", "Inserire")
				Main.v_obbligoclientef = vReadMap.GetDefault("ObbligoClienteF", False)
				Main.v_intesta = vReadMap.GetDefault("Intesta", False)
				Main.vInt11 = vReadMap.GetDefault("ntasti", 70)
				Main.vInt12 = vReadMap.GetDefault("nRows", 10)
				Main.vInt13 = vReadMap.GetDefault("nCols", 7)
				Main.vInt14 = vReadMap.GetDefault("nRowGrid", 5)
				Main.vInt15 = vReadMap.GetDefault("nColGrid", 4)
				Main.vInt27 = vReadMap.GetDefault("RowH", DipToCurrent(70))
				If Main.vInt12 = 0 Then
					Main.vInt12 = 10
				End If
				If Main.vInt13 = 0 Then
					Main.vInt13 = 7
				End If
				If Main.vInt14 = 0 Then
					Main.vInt14 = 5
				End If
				If Main.vInt15 = 0 Then
					Main.vInt15 = 4
				End If
			End If
		End If
		z = False
		Main.v_giacsede = z
		Main.v_listpoco = vReadMap.GetDefault("ListPoco", 0)
		Main.v_iniziogiorno = vReadMap.GetDefault("InizioGiorno", 0)
		Main.v_altezzavariazioni = vReadMap.GetDefault("AltezzaVariazioni", 55)
		Main.v_asportoanticipo = vReadMap.GetDefault("AsportoAnticipo", 0)
		Main.v_minutiss = vReadMap.GetDefault("MinutiSS", 4)
		Main.v_prenotagiorniapertura = vReadMap.GetDefault("PrenotaGiorniApertura", "1111111")
		Main.v_prenotagiorni = vReadMap.GetDefault("PrenotaGiorni", 0)
		Main.v_numerott = vReadMap.GetDefault("NumeroTT", 0)
		Main.v_listmolto = vReadMap.GetDefault("ListMolto", 0)
		Do While i <= 7
		Loop
		Main.v_salvaora = vReadMap.GetDefault("SalvaOra", -1)
		Main.v_codattivazione = vReadMap.GetDefault("CodAttivazione", "")
		Main.v_codattivazionesb = vReadMap.GetDefault("CodAttivazioneSB", "")
		Main.v_codattivazionebs = vReadMap.GetDefault("CodAttivazioneBS", "")
		If Not(vReadMap.ContainsKey("Glory")) Then
		End If
		Main.v_tallonpremio = vReadMap.GetDefault("TallonPremio", True)
		Main.v_listino2azero = vReadMap.GetDefault("Listino2aZero", False)
		Main.v_controllaprezziazero = vReadMap.GetDefault("ControllaPrezziaZero", False)
		Main.v_fatturafmt2 = vReadMap.GetDefault("FatturaFMT2", False)
		Main.v_attivafe = vReadMap.GetDefault("AttivaFE", False)
		Main.v_pausafe = vReadMap.GetDefault("PausaFE", False)
		Main.v_asyncfe = vReadMap.GetDefault("AsyncFE", 10)
		If Main.v_attivafe Then
		End If
		If Not(vReadMap.ContainsKey("RiepNF")) Then
		End If
		Main.v_errmail = vReadMap.GetDefault("ErrMail", False)
		Main.v_leggicodlotteria = vReadMap.GetDefault("LeggiCodLotteria", False)
		Main.v_solochiusura = vReadMap.GetDefault("SoloChiusura", False)
		Main.v_tema2 = vReadMap.GetDefault("Tema2", False)
		Main.v_temag = vReadMap.GetDefault("TemaG", 5)
		Main.v_sfondo = vReadMap.GetDefault("Sfondo", 1)
		Main.v_tastiera = vReadMap.GetDefault("Tastiera", 0)
		Main.v_colonnevarianti = vReadMap.GetDefault("ColonneVarianti", 0)
		Main.v_articolizero = vReadMap.GetDefault("ArticoliZero", 1)
		If Not(vReadMap.ContainsKey("MFSeriale")) Then
		End If
		Main.v_gdfolderid = vReadMap.GetDefault("GDFolderID", "")
		Main.v_consolidaincassi = vReadMap.GetDefault("ConsolidaIncassi", False)
		Main.v_tipoimptabacchi = vReadMap.GetDefault("TipoImpTabacchi", 0)
		Main.v_sendclienti = vReadMap.GetDefault("SendClienti", 0)
		Main.v_ivadefault = vReadMap.GetDefault("IvaDefault", 1)
		Main.v_pagamentoprep = vReadMap.GetDefault("PagamentoPrep", 2)
		Main.v_ordinamentosc = vReadMap.GetDefault("OrdinamentoSc", 0)
		Main.v_arrotondav = vReadMap.GetDefault("ArrotondaV", 2)
		Main.v_arrotondacontantirt = vReadMap.GetDefault("ArrotondaContantiRT", 0)
		Main.v_fontsizec = vReadMap.GetDefault("FontSizeC", 2)
		Main.v_stampaconto = vReadMap.GetDefault("StampaConto", 0)
		Main.v_tabacchi = vReadMap.GetDefault("Tabacchi", True)
		Main.v_gestionespiagge = vReadMap.GetDefault("GestioneSpiagge", False)
		Main.v_xpunti = vReadMap.GetDefault("XPunti", 1)
		Main.v_marginetabacchi = vReadMap.GetDefault("MargineTabacchi", 0)
		Main.v_ognoeuro = vReadMap.GetDefault("OgnoEuro", 1)
		Main.v_termsala = vReadMap.GetDefault("TermSala", False)
		If Not(vReadMap.ContainsKey("TermSalaB")) Then
		End If
		Main.v_termsalaop = vReadMap.GetDefault("TermSalaOp", 0)
		Main.v_salvataggio = vReadMap.GetDefault("Salvataggio", 5)
		Main.v_sbpwd = vReadMap.GetDefault("SBPWD", "")
		Main.v_serversave = vReadMap.GetDefault("ServerSave", "")
		Main.v_utentesave = vReadMap.GetDefault("UtenteSave", "italretail")
		Main.v_passwordsave = vReadMap.GetDefault("PasswordSave", "italretail")
		Main.v_prefixftpsave = vReadMap.GetDefault("PrefixFTPSave", "")
		Main.v_stampasala = vReadMap.GetDefault("StampaSala", False)
		Main.v_stampa66char = vReadMap.GetDefault("Stampa66Char", False)
		Main.v_repartogv = vReadMap.GetDefault("RepartoGV", -1)
		Main.v_nsalva = vReadMap.GetDefault("nSalva", 9)
		Main.v_stampafattura = vReadMap.GetDefault("StampaFattura", 0)
		Main.v_ipricevute = vReadMap.GetDefault("IpRicevute", "")
		Main.v_ipdistributore = vReadMap.GetDefault("ipDistributore", "")
		Main.v_desasporto = vReadMap.GetDefault("DesAsporto", "Asporto")
		Main.v_despreconto = vReadMap.GetDefault("DesPreconto", "RIEPILOGO PARZIALE")
		Main.v_desatesta = vReadMap.GetDefault("DesATesta", "A testa ")
		Main.v_ricevutadapdv = vReadMap.GetDefault("RicevutaDaPdv", 0)
		Main.v_ricevutaapdv = vReadMap.GetDefault("RicevutaAPdv", 0)
		Main.v_ricevutadacli = vReadMap.GetDefault("RicevutaDaCli", 8)
		Main.v_ricevutaacli = vReadMap.GetDefault("RicevutaACli", 12)
		Main.v_ricevutadacor = vReadMap.GetDefault("RicevutaDaCor", 13)
		Main.v_ricevutaacor = vReadMap.GetDefault("RicevutaACor", 36)
		Main.v_ricevutaspaziomf = vReadMap.GetDefault("RicevutaSpazioMF", 6)
		Main.v_intestanf = vReadMap.GetDefault("IntestaNF", False)
		Main.v_riepnfdett = vReadMap.GetDefault("RiepNFDett", True)
		Main.v_exportcorrispettivi = vReadMap.GetDefault("ExportCorrispettivi", False)
		Main.v_changeuscita = vReadMap.GetDefault("ChangeUscita", False)
		Main.v_eula = vReadMap.GetDefault("Eula", False)
		Main.v_stampacomande = vReadMap.GetDefault("StampaComande", False)
		Main.v_turni = vReadMap.GetDefault("Turni", False)
		Main.v_asportoora = vReadMap.GetDefault("AsportoOra", False)
		If Not(vReadMap.ContainsKey("SalvaVD")) Then
		End If
		Main.v_consolida = vReadMap.GetDefault("Consolida", False)
		Main.v_consolidasc = vReadMap.GetDefault("ConsolidaSc", False)
		Main.v_varautocp = vReadMap.GetDefault("VarAutoCP", False)
		Main.v_visualizzavariazioni = vReadMap.GetDefault("VisualizzaVariazioni", False)
		Main.v_ordinainserimentovariazioni = vReadMap.GetDefault("OrdinaInserimentoVariazioni", False)
		Main.v_gestcoperti2 = vReadMap.GetDefault("GestCoperti2", False)
		Main.v_consolidalast = vReadMap.GetDefault("ConsolidaLast", True)
		Main.v_obbligoop = vReadMap.GetDefault("ObbligoOp", False)
		Main.v_obbligoopavvio = vReadMap.GetDefault("ObbligoOpAvvio", False)
		Main.v_obbligoopmovimento = vReadMap.GetDefault("ObbligoOpMovimento", False)
		Main.v_opextended = vReadMap.GetDefault("OpExtended", False)
		Main.v_riducimsg = vReadMap.GetDefault("RiduciMsg", False)
		Main.v_noforcecoperti = vReadMap.GetDefault("NoForceCoperti", False)
		Main.v_rieponly = vReadMap.GetDefault("RiepOnly", False)
		Main.v_verificastampanti = vReadMap.GetDefault("VerificaStampanti", False)
		Main.v_azzeraasporto = vReadMap.GetDefault("AzzeraAsporto", False)
		Main.v_chiedinasporto = vReadMap.GetDefault("ChiediNAsporto", False)
		Main.v_icone2 = vReadMap.GetDefault("Icone2", False)
		Main.v_rootdatetime = vReadMap.GetDefault("RootDateTime", False)
		Main.v_dataoranoroot = vReadMap.GetDefault("DataOraNoRoot", False)
		Main.v_attivanumtavolo = vReadMap.GetDefault("AttivaNumTavolo", True)
		Main.v_sottoconti = vReadMap.GetDefault("Sottoconti", False)
		Main.v_adddisponibilita = vReadMap.GetDefault("AddDisponibilita", False)
		If Not(vReadMap.ContainsKey("FrazionaConImporto")) Then
		End If
		Main.v_imposuqta = vReadMap.GetDefault("ImpoSuQta", False)
		Main.v_consideraprzintero = vReadMap.GetDefault("ConsideraPrzIntero", False)
		Main.v_tastiombreggiati = vReadMap.GetDefault("TastiOmbreggiati", False)
		Main.v_disconnettiprt = vReadMap.GetDefault("DisconnettiPRT", False)
		Main.v_incassooperatori = vReadMap.GetDefault("IncassoOperatori", False)
		Main.v_riccredito = vReadMap.GetDefault("RicCredito", False)
		Main.v_icone2upd = vReadMap.GetDefault("Icone2UPD", False)
		Main.v_orafatt = vReadMap.GetDefault("OraFatt", False)
		Main.v_stampasposta = vReadMap.GetDefault("StampaSposta", False)
		Main.v_emergenza = vReadMap.GetDefault("Emergenza", False)
		Main.v_totem = vReadMap.GetDefault("Totem", False)
		Main.v_controlloturni = vReadMap.GetDefault("ControlloTurni", False)
		Main.v_avantiturnoauto = vReadMap.GetDefault("AvantiTurnoAuto", False)
		Main.v_turno1sempre = vReadMap.GetDefault("Turno1Sempre", False)
		Main.v_spooler = vReadMap.GetDefault("Spooler", False)
		If Main.v_spooler Then
		End If
		Main.v_checkvarianti = vReadMap.GetDefault("CheckVarianti", False)
		Main.v_tallonsempre = vReadMap.GetDefault("TallonSempre", False)
		Main.v_cassettosubito = vReadMap.GetDefault("CassettoSubito", False)
		Main.v_suonodacassa = vReadMap.GetDefault("SuonoDaCassa", False)
		Main.v_notallon = vReadMap.GetDefault("Tallon", 0)
		Main.v_stampareport = vReadMap.GetDefault("StampaReport", 0)
		If Not(vReadMap.ContainsKey("StampaNomeCli")) Then
		End If
		Main.v_numcassa = vReadMap.GetDefault("NumCassa", "1")
		Main.v_nnegozio = vReadMap.GetDefault("nNegozio", "1")
		Main.v_screenbrightness = vReadMap.GetDefault("ScreenBrightness", 0.75)
		Main.v_datalastbackup = vReadMap.GetDefault("DataLastBackup", Sub058())
		Main.v_uid = vReadMap.GetDefault("Utente", "Inserire")
		Main.v_pwd = vReadMap.GetDefault("Password", "Inserire")
		Main.v_obbligoclientef = vReadMap.GetDefault("ObbligoClienteF", False)
		Main.v_intesta = vReadMap.GetDefault("Intesta", False)
		Main.vInt11 = vReadMap.GetDefault("ntasti", 70)
		Main.vInt12 = vReadMap.GetDefault("nRows", 10)
		Main.vInt13 = vReadMap.GetDefault("nCols", 7)
		Main.vInt14 = vReadMap.GetDefault("nRowGrid", 5)
		Main.vInt15 = vReadMap.GetDefault("nColGrid", 4)
		Main.vInt27 = vReadMap.GetDefault("RowH", DipToCurrent(70))
		If Main.vInt12 = 0 Then
		End If
		If Main.vInt13 = 0 Then
		End If
		If Main.vInt14 = 0 Then
		End If
		If Main.vInt15 = 0 Then
		End If
	Else
		Main.v_mserver = "smtp.gmail.com"
		Main.v_mporta = "465"
		Main.v_muser = ""
		Main.v_mpwd = ""
		Main.v_musers = ""
		Main.v_mpwds = ""
		Main.v_mdesmittente = ""
		Main.v_md1 = ""
		Main.v_md2 = ""
		Main.v_md3 = ""
		Main.v_md4 = ""
		Main.v_md5 = ""
		Main.v_barra = ""
		Main.v_barra2 = ""
		Main.v_attivasezionali = False
		Main.v_attivaazzeramentoprogressivi = False
		Main.v_noteinfe = False
		Main.v_lastdatadocfm = False
		Main.v_tastiera = 0
		Main.v_colonnevarianti = 0
		Main.v_articolizero = 1
		Main.v_tipointerfaccia = 0
		Main.v_tipoimptabacchi = 0
		Main.v_sendclienti = 0
		Main.v_ivadefault = 1
		Main.v_pagamentoprep = 2
		Main.v_ordinamentosc = 0
		Main.v_arrotondav = 2
		Main.v_arrotondacontantirt = 0
		Main.v_fontsizec = 2
		Main.v_stampaconto = 0
		Main.v_stampafattura = 0
		Main.v_xpunti = 1
		Main.v_marginetabacchi = 0
		Main.v_ognoeuro = 1
		Main.v_consolidaincassi = False
		Main.v_gdfolderid = ""
		Main.v_opobbligatorio = False
		Main.v_terminalino = False
		Main.v_daticompletidc = False
		Main.v_regcancellazioni = False
		Main.v_logmf = False
		Main.v_logvd = False
		Main.v_lognf = False
		Main.v_ipricevute = ""
		Main.v_ipdistributore = ""
		Main.v_desasporto = "Asporto"
		Main.v_despreconto = "RIEPILOGO PARZIALE"
		Main.v_desatesta = "A testa"
		Main.v_webapiindirizzo = "https://one.italretail.it/TWO"
		Main.v_webapipi = ""
		Main.v_webapidatiretailer = False
		Main.v_webapipiesercente = ""
		Main.v_webapicapesercente = ""
		Main.v_webapiragsoc = ""
		Main.v_ipeftsm = ""
		Main.v_ipeftm(1) = ""
		Main.v_ipeftm(2) = ""
		Main.v_ipeftm(3) = ""
		Main.v_ipeftm(4) = ""
		Main.v_ipeftm(5) = ""
		Main.v_ipeftm(6) = ""
		Main.v_ipeftm(7) = ""
		Main.v_ipeftm(8) = ""
		Main.v_ipeftm(9) = ""
		Main.v_procauto(1) = ""
		Main.v_procauto(2) = ""
		Main.v_procauto(3) = ""
		Main.v_procauto(4) = ""
		Main.v_procauto(5) = ""
		Main.v_portaeftsm = "5000"
		Main.v_eftsm = False
		Main.v_eftsmstampa = False
		Main.v_eftsmsconti = False
		Main.v_ricevutadapdv = 0
		Main.v_ricevutaapdv = 0
		Main.v_ricevutadacli = 8
		Main.v_ricevutaacli = 12
		Main.v_ricevutadacor = 13
		Main.v_ricevutaacor = 36
		Main.v_ricevutaspaziomf = 6
		Main.v_importazioneauto = False
		Main.v_modificamovimento = False
		Main.v_centralizzadoc = False
		Main.v_giacsede = False
		Main.v_tallonpremio = True
		Main.v_listino2azero = False
		Main.v_controllaprezziazero = False
		Main.v_glory = Main.cm_nessuno
		Main.v_fatturafmt2 = False
		Main.v_attivafe = False
		Main.v_pausafe = False
		Main.v_asyncfe = 10
		Main.v_riepnf = 0
		Main.v_errmail = False
		Main.v_leggicodlotteria = False
		Main.v_solochiusura = False
		Main.v_tabacchi = True
		Main.v_gestionespiagge = False
		Main.v_termsala = False
		Main.v_termsalab = 0
		Main.v_mantieninopaginati = False
		Main.v_termsalaop = 0
		Main.v_prefissocliente = "111"
		Main.v_prefissott = "112"
		Main.v_stampasala = False
		Main.v_stampa66char = False
		Main.v_repartogv = -1
		Main.v_nsalva = 9
		Main.v_tema2 = False
		Main.v_temag = 5
		Main.v_sfondo = 1
		Main.v_listpoco = 0
		Main.v_iniziogiorno = 0
		Main.v_altezzavariazioni = 55
		Main.v_listmolto = 0
		Main.v_asportoanticipo = 0
		Main.v_minutiss = 4
		Main.v_prenotagiorni = 0
		Main.v_prenotagiorniapertura = "1111111"
		Main.v_numerott = 0
		Dim i3 As Int
		For i3 = 0 To 7
			Main.v_dalle(i3) = -1
			Main.v_alle(i3) = -1
			Main.v_listinoh(i3) = 0
		Next
		Main.v_salvaora = -1
		Main.v_intestanf = False
		Main.v_riepnfdett = True
		Main.v_exportcorrispettivi = False
		Main.v_changeuscita = False
		Main.v_eula = False
		Main.v_stampacomande = False
		Main.v_turni = False
		Main.v_asportoora = False
		Main.v_salvavd = 0
		Main.v_consolida = False
		Main.v_consolidasc = False
		Main.v_varautocp = False
		Main.v_visualizzavariazioni = False
		Main.v_ordinainserimentovariazioni = False
		Main.v_gestcoperti2 = False
		Main.v_consolidalast = True
		Main.v_obbligoop = False
		Main.v_obbligoopavvio = False
		Main.v_obbligoopmovimento = False
		Main.v_opextended = False
		Main.v_riducimsg = False
		Main.v_noforcecoperti = False
		Main.v_rieponly = False
		Main.v_verificastampanti = False
		Main.v_azzeraasporto = False
		Main.v_chiedinasporto = False
		Main.v_icone2 = False
		Main.v_rootdatetime = False
		Main.v_dataoranoroot = False
		Main.v_attivanumtavolo = True
		Main.v_sottoconti = False
		Main.v_adddisponibilita = False
		Main.v_frazionaconimporto = 0
		Main.v_imposuqta = False
		Main.v_consideraprzintero = False
		Main.v_tastiombreggiati = False
		Main.v_disconnettiprt = False
		Main.v_incassooperatori = False
		Main.v_riccredito = False
		Main.v_icone2upd = False
		Main.v_orafatt = False
		Main.v_stampasposta = False
		Main.v_emergenza = False
		Main.v_totem = False
		Main.v_controlloturni = False
		Main.v_avantiturnoauto = False
		Main.v_turno1sempre = False
		Main.v_spooler = False
		Main.v_checkvarianti = False
		Main.v_notallon = 0
		Main.v_stampareport = 0
		Main.v_tallonsempre = False
		Main.v_cassettosubito = False
		Main.v_suonodacassa = False
		Main.v_stampanomecli = 0
		Main.v_attivaterminale = False
		Main.v_solovenduto = False
		Main.v_azzeradati = False
		Main.v_nodatiperiodo = False
		Main.v_ipcassa = ""
		Main.v_ipvis = ""
		Main.v_iprpi = ""
		Main.v_usbpath = ""
		Main.v_salvataggio = 5
		Main.v_serversave = ""
		Main.v_utentesave = "italretail"
		Main.v_passwordsave = "italretail"
		Main.v_prefixftpsave = ""
		Main.v_percorsoazzera = ""
		Main.v_maximpo = 9999
		Main.v_fondocassaauto = 0
		Main.v_maximptavolo = 999
		Main.v_tipofrazionamentovariazioni = 0
		Main.v_valorizzazioneprezzofrazione = 0
		Main.v_websospenditavolo = 0
		Main.v_mintavololento = 0
		Main.v_copiefe = 0
		Main.v_numeroscontrinist = 0
		Main.v_copiefe2 = 1
		Main.v_codattivazione = ""
		Main.v_codattivazionesb = ""
		Main.v_codattivazionebs = ""
		Main.v_numcassa = "1"
		Main.v_nnegozio = "1"
		Main.v_ipserver = "192.168.1.110"
		Main.v_ipserverbila = ""
		Main.v_attivamp = False
		Main.v_attivakeyhttp = True
		Main.v_attivainserimentocliente = False
		Main.v_prefissocoupon = "313"
		Main.v_paginapagamenti = 0
		Main.v_screenbrightness = 0.75
		Main.v_uid = "InsUtente"
		Main.v_pwd = "InsPassword"
		Main.v_obbligoclientef = False
		Main.v_intesta = False
		Main.vInt27 = DipToCurrent(70)
		Main.v_datalastbackup = Sub058()
		Dim list As List
		list.Initialize
		list.Add("Orientamento dello schermo Verticale")
		list.Add("Orientamento dello schermo Orizzontale")
		list.Add("Orientamento dello schermo Verticale 180°")
		list.Add("Orientamento dello schermo Orizzontale 180°")
		Dim i4 As Int = -1
		Do While i4 < 0
			i4 = idLib.InputList1(list, "Effettuare una selezione :")
			If i4 >= 0 Then
				Main.v_tastiera = i4
				Dim list2 As List
				list2.Initialize
				If i4 = 1 Or i4 = 3 Then
					list2.Add("Minipos 10" & QUOTE)
					list2.Add("SpiceT")
					list2.Add("All-in-One 15" & QUOTE)
				Else
					list2.Add("Tablet 13" & QUOTE)
					list2.Add("Tablet 10" & QUOTE & " o Andromeda")
				End If
				Dim i5 As Int = -1
				Do While i5 < 0
					i5 = idLib.InputList1(list2, "Effettuare una selezione quindi attendere (alcuni secondi) la chiusura del programma.")
					If i5 >= 0 Then
						If i4 = 1 Or i4 = 3 Then
							If i5 < 2 Then
								Main.vInt12 = 7
								Main.vInt13 = 11
								Main.vInt14 = 3
								Main.vInt15 = 4
								Main.vInt11 = Main.vInt12 * Main.vInt13
								If i5 = 1 Then
									Main.v_tipointerfaccia = 2
								End If
							Else
								Main.vInt12 = 9
								Main.vInt13 = 13
								Main.vInt14 = 4
								Main.vInt15 = 5
								Main.vInt11 = Main.vInt12 * Main.vInt13
							End If
						Else If i5 = 0 Then
							Main.vInt12 = 12
							Main.vInt13 = 9
							Main.vInt14 = 7
							Main.vInt15 = 4
							Main.vInt11 = Main.vInt12 * Main.vInt13
						Else
							Main.vInt12 = 11
							Main.vInt13 = 8
							Main.vInt14 = 6
							Main.vInt15 = 4
							Main.vInt11 = Main.vInt12 * Main.vInt13
						End If
						Sub216()
						Return False
					End If
				Loop
			End If
		Loop
	End If
	Return True
End Sub

Sub Sub126(str As String, str2 As String, str3 As String)
	Dim list As List
	list.Initialize
	list.Add(str)
	list.Add(str2)
	list.Add(str3)
	list.Add(Main.v_numcassa)
	list.Add(0)
	If Not( = Null) Then
		 = 
	End If
	CallSub3(ftpmanager, "SendObjBO", list, "EsitoManutenzione")
End Sub

Sub Sub127(j As Long, sql As SQL)
	Dim str As String
	Dim stringBuilderWrapper As StringBuilder
	Dim stringBuilderWrapper2 As StringBuilder
	Dim stringBuilderWrapper3 As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper2.Initialize
	stringBuilderWrapper3.Initialize
	Dim cursorWrapper As Cursor = sql.ExecQuery("Select chiave from CausaliPagamenti where nmov=" & j)
	If cursorWrapper.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper.Position = i
			Dim vTmp As Map = dbutil.Sub006(sql, "Select * from CausaliPagamenti where chiave=" & cursorWrapper.GetString("chiave"), Null)
			If vTmp.IsInitialized And vTmp.Size > 0 Then
				Sub007(stringBuilderWrapper3, vTmp)
			End If
		Next
	End If
	cursorWrapper.Close
	Dim cursorWrapper2 As Cursor = sql.ExecQuery("Select chiave from Venduto where nmov=" & j)
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount2
			cursorWrapper2.Position = i2
			Dim vTmp_ As Map = dbutil.Sub006(sql, "Select * from Venduto where chiave=" & cursorWrapper2.GetString("chiave"), Null)
			If vTmp_.IsInitialized And vTmp_.Size > 0 Then
				Sub011(stringBuilderWrapper, vTmp_)
			End If
		Next
	End If
	cursorWrapper2.Close
	Dim vTmp__ As Map = dbutil.Sub006(sql, "Select * from headmov where nmov=" & j, Null)
	If vTmp__.IsInitialized And vTmp__.Size > 0 Then
		Sub009(stringBuilderWrapper2, vTmp__)
	End If
	Dim textWriterWrapper As TextWriter
	If sql <> Main.vSql2 Then
		str = "movimento.txt"
	Else
		str = "movimento_" & sql.ExecQuerySingleResult("Select causale from headmov where nmov= " & j) & ".txt"
	End If
	textWriterWrapper.Initialize(File.OpenOutput(Main.vStr17, str, False))
	textWriterWrapper.Write(stringBuilderWrapper2 & stringBuilderWrapper & stringBuilderWrapper3)
	textWriterWrapper.Close
	Dim vTmp___ As String = Sub059(Sub058())
	Dim strArr() As String = Array(str)
	Dim archiverForB4A As ArchiverForB4A
	archiverForB4A.ZipFiles(Main.vStr17, strArr, Main.vStr17, "DaCasse" & vTmp___ & "1.tmp", "")
	File.Delete(Main.vStr17, str)
	If Not( = Null) Then
		 = 
	End If
	CallSub(ftpmanager, "tUpload")
	If sql = Main.vSql2 Then
		sql.ExecNonQuery("update headmov set sent=1 where nmov= " & j)
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m3… (riga 11908).
Sub Sub128(textWriterWrapper As TextWriter, str As String, i As Int)
	Dim z As Boolean = True
	If str <> "" Then
		If Main.v_sendclienti <> 3 Then
			If Main.v_sendclienti = 0 Then
			End If
			If Main.v_sendclienti <> 1 Or i <= 0 Then
				If Main.v_sendclienti <> 2 Then
					z = False
				End If
			End If
			If z Then
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice = '" & str & "'")
				If cursorWrapper2.RowCount > 0 Then
					cursorWrapper2.Position = 0
					textWriterWrapper.Write("cl" & TAB & Sub001(cursorWrapper2))
				End If
				cursorWrapper2.Close
			End If
			Return
		End If
	End If
End Sub

Sub Sub129(str As String) As Boolean
	Dim vMatcher As Matcher = Regex.Matcher("^(\d+)\.(\d+)\.(\d+)\.(\d+)$", str)
	If Not(vMatcher.Find) Then
		Return False
	End If
	Dim i As Int
	For i = 1 To 4
		If vMatcher.Group(i) > 255 Or vMatcher.Group(i) < 0 Then
			Return False
		End If
	Next
	Return True
End Sub

Sub Sub130(i As Int) As Object
	Dim reflection As Reflector
	If Not( = Null) Then
		 = 
	End If
	reflection.Target = reflection.GetContext
	reflection.Target = reflection.RunMethod("getResources")
	Return reflection.RunMethod2("getDrawable", i, "java.lang.int")
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo _mail (riga 11981).
Sub mail(z As Boolean, str As String, list As List, cursorWrapper As Cursor, cursorWrapper2 As Cursor, z2 As Boolean, str2 As String, sMTPWrapper As SMTP, mypdfwriter As PDFWriter, str3 As String)
	Dim z3 As Boolean
	Dim vMsgbox2 As Int
	Dim i As Int
	Dim vTmp As Int
	Dim vTmp_ As Int
	Dim str4 As String
	Dim vTmp__ As Int
	Dim i2 As Int
	Dim str5 As String
	Dim str6 As String
	Dim i3 As Int
	Dim z4 As Boolean
	vStr2 = "Sub Mail"
	Try
		If Main.v_mserver <> "" Then
			If Main.v_mporta <> "" Then
				If Main.v_muser <> "" Then
					If Main.v_mpwd <> "" Then
						If Main.v_md1 = "" Then
						End If
						If str3.Contains("M") Then
							z3 = True
							If Not(z3) Or str3.Contains("C") Then
								Dim str7 As String = "Confermi l'invio della mail ? "
								If str3 <> "MC" Then
									str7 = "Confermi l'invio della mail e la copia dei file su chiave USB ? "
								Else If str3 = "C" Then
									str7 = "Confermi la copia dei file su chiave USB ? "
								End If
								If Not(z) Then
									vMsgbox2 = -1
								Else
									Dim vObjectToCharSequence As Object = str7
									Dim vObjectToCharSequence2 As Object = Main.vStr8
									vMsgbox2 = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
								End If
								If vMsgbox2 <> -1 Then
									If Not(z) And z3 Then
										ProgressDialogShow2("Invio in corso ...", False)
									End If
									If z3 Then
										Dim parseDouble As Int = Main.v_mporta
										sMTPWrapper.Initialize(Main.v_mserver, parseDouble, Main.v_muser, Main.v_mpwd, "SMTP")
										If Main.v_mporta <> 465 Then
											If Main.v_mporta <> 587 Then
												z4 = False
												sMTPWrapper.UseSSL = z4
												If Main.v_md1 <> "" Then
													Sub004(sMTPWrapper, Main.v_md1, False)
												End If
												If Main.v_md2 <> "" Then
													Sub004(sMTPWrapper, Main.v_md2, False)
												End If
												sMTPWrapper.Subject = Main.v_mdesmittente & " " & str2
											End If
										End If
										z4 = True
										sMTPWrapper.UseSSL = z4
										If Main.v_md1 <> "" Then
										End If
										If Main.v_md2 <> "" Then
										End If
										sMTPWrapper.Subject = Main.v_mdesmittente & " " & str2
									End If
									Dim vTmp___ As String = Sub061(Sub058())
									Dim writableWorkbookWrapper As WritableWorkbook
									writableWorkbookWrapper.Initialize(vStr4, str2 & ".xls")
									Dim vAddSheet As WritableSheet = writableWorkbookWrapper.AddSheet(str2, 0)
									Dim writableCellFormatWrapper As WritableCellFormat
									writableCellFormatWrapper.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 13, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
									Dim writableCellFormatWrapper2 As WritableCellFormat
									writableCellFormatWrapper2.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
									writableCellFormatWrapper2.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
									Dim writableCellFormatWrapper3 As WritableCellFormat
									writableCellFormatWrapper3.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
									Dim writableCellFormatWrapper4 As WritableCellFormat
									writableCellFormatWrapper4.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
									Dim writableCellWrapper As WritableCell
									writableCellWrapper.InitializeText(0, 0, str2)
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
									vAddSheet.AddCell(writableCellWrapper)
									writableCellWrapper.InitializeText(2, 0, vTmp___)
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
									vAddSheet.AddCell(writableCellWrapper)
									vAddSheet.SetRowHeight(0, 18)
									Dim paperSize As PDFPaperSizes = Main.vPDFPaperSizes1
									Dim paperSize2 As PDFPaperSizes = Main.vPDFPaperSizes1
									mypdfwriter.Initialize("PDFWriter1", 595, 842)
									Dim standardFonts As PDFStandardFonts = Main.vPDFStandardFonts1
									Dim standardFonts2 As PDFStandardFonts = Main.vPDFStandardFonts1
									mypdfwriter.setFont("Symbol", "Times-Bold")
									Dim standardFonts3 As PDFStandardFonts = Main.vPDFStandardFonts1
									Dim standardFonts4 As PDFStandardFonts = Main.vPDFStandardFonts1
									mypdfwriter.setFont("Type1", "Times-Bold")
									mypdfwriter.addText(100, 600, 33, str2)
									Dim stringBuilderWrapper As StringBuilder
									stringBuilderWrapper.Initialize
									stringBuilderWrapper.Append(str2).Append(CRLF)
									stringBuilderWrapper.Append("").Append(CRLF)
									stringBuilderWrapper.Append("Data e ora di stampa: " & vTmp___).Append(CRLF)
									stringBuilderWrapper.Append("Inviato da : ").Append(CRLF)
									Dim cursorWrapper3 As Cursor
									Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from intesta order by codice")
									If cursorWrapper4.RowCount > 0 Then
										Dim i4 As Int
										For i4 = 0 To 5
											cursorWrapper4.Position = i4
											stringBuilderWrapper.Append(cursorWrapper4.GetString("descrizione")).Append(CRLF)
										Next
									End If
									stringBuilderWrapper.Append(" ").Append(CRLF)
									Dim standardFonts5 As PDFStandardFonts = Main.vPDFStandardFonts1
									Dim standardFonts6 As PDFStandardFonts = Main.vPDFStandardFonts1
									mypdfwriter.setFont("Symbol", "Helvetica")
									Dim standardFonts7 As PDFStandardFonts = Main.vPDFStandardFonts1
									Dim standardFonts8 As PDFStandardFonts = Main.vPDFStandardFonts1
									mypdfwriter.setFont("Type1", "Helvetica")
									Dim vSplit() As String = Regex.Split(CRLF, stringBuilderWrapper)
									mypdfwriter.addText(100, 530, 13, vSplit(2))
									mypdfwriter.addText(100, 515, 13, vSplit(3))
									mypdfwriter.addText(100, 500, 13, vSplit(4))
									mypdfwriter.addText(100, 485, 13, vSplit(5))
									mypdfwriter.addText(100, 470, 13, vSplit(6))
									mypdfwriter.addText(100, 455, 13, vSplit(7))
									mypdfwriter.addText(100, 440, 13, vSplit(8))
									mypdfwriter.addText(100, 425, 13, vSplit(9))
									mypdfwriter.addText(100, 410, 13, vSplit(10))
									If str = "I2" Or str = "A" Or str = "R" Or str = "RG" Or str = "FC" Then
										Dim i5 As Int = 20
										If list.Size > 0 Then
											stringBuilderWrapper.Append("Filtro: ").Append(CRLF)
											mypdfwriter.addText(100, 380, 13, "Filtro: ")
											writableCellWrapper.InitializeText(0, 2, "Filtro: ")
											writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
											vAddSheet.AddCell(writableCellWrapper)
											Dim size As Int = list.Size - 1
											Dim i6 As Int = 2
											Dim i7 As Int = 0
											Do While i7 <= size
												stringBuilderWrapper.Append(list.Get(i7)).Append(CRLF)
												writableCellWrapper.InitializeText(1, i6, list.Get(i7))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												i6 = i6 + 1
												mypdfwriter.addText(100, 380 - i5, 13, list.Get(i7))
												i7 = i7 + 1
												i5 = i5 + 20
											Loop
											stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
											i = i6 + 2
										Else
											mypdfwriter.addText(100, 380, 13, "Filtro: Nessuno")
											stringBuilderWrapper.Append("Filtro: Nessuno").Append(CRLF)
											stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
											writableCellWrapper.InitializeText(0, 2, "Filtro: Nessuno")
											writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
											vAddSheet.AddCell(writableCellWrapper)
											i = 4
										End If
										If str = "RG" Then
											stringBuilderWrapper.Append(modfunstr.left("DESCRIZIONE" & modfunstr.Sub004(33), 33) & modfunstr.Sub003(modfunstr.Sub004(9) & "GUADAGNO", 9) & modfunstr.Sub003(modfunstr.Sub004(9) & "QTA", 9) & modfunstr.Sub003(modfunstr.Sub004(9) & "IMPORTO", 9)).Append(CRLF)
										Else
											stringBuilderWrapper.Append(modfunstr.left("DESCRIZIONE" & modfunstr.Sub004(33), 33) & modfunstr.Sub003(modfunstr.Sub004(9) & "SCONTI", 9) & modfunstr.Sub003(modfunstr.Sub004(9) & "QTA", 9) & modfunstr.Sub003(modfunstr.Sub004(9) & "IMPORTO", 9)).Append(CRLF)
										End If
										stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
										writableCellWrapper.InitializeText(0, i, "Codice")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeText(1, i, "Descrizione")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										If str = "RG" Then
											writableCellWrapper.InitializeText(2, i, "Guadagno")
											writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
											vAddSheet.AddCell(writableCellWrapper)
										Else
											writableCellWrapper.InitializeText(2, i, "Sconti")
											writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
											vAddSheet.AddCell(writableCellWrapper)
										End If
										writableCellWrapper.InitializeText(3, i, "Qta")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeText(4, i, "Importo")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										vAddSheet.SetColumnWidth(0, 20)
										vAddSheet.SetColumnWidth(1, 35)
										vAddSheet.SetColumnWidth(4, 13)
										Dim rowCount As Int = cursorWrapper.RowCount - 1
										Dim d As Double = 0
										Dim d2 As Double = 0
										Dim i8 As Int = 0
										Dim i9 As Int = i + 1
										Dim i10 As Int = 640
										Dim d3 As Double = 0
										Do While i8 <= rowCount
											If str = "RG" Then
												vTmp__ = Sub136(i10, mypdfwriter, 2)
											Else
												vTmp__ = Sub136(i10, mypdfwriter, 1)
											End If
											cursorWrapper.Position = i8
											Dim vTmp____ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("qta"), 1, 3, 3, False), 9)
											Dim vTmp_____ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("sconto"), 1, 2, 2, False), 9)
											If cursorWrapper.GetDouble("qta") * 1000 Mod 1000 = 0 Then
												vTmp____ = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("qta"), 1, 0, 0, False), 9)
											End If
											If str = "A" Or str = "C" Or str = "F" Or str = "FC" Or str = "MO" Then
												stringBuilderWrapper.Append(modfunstr.left(cursorWrapper.GetString("descrizione").Trim & modfunstr.Sub004(33), 33) & vTmp_____ & vTmp____ & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9)).Append(CRLF)
												mypdfwriter.addText(10, 720 - vTmp__, 8, cursorWrapper.GetString("codice").Trim)
												Dim paperSize3 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(8925 / 100, 720 - vTmp__, 8, cursorWrapper.GetString("descrizione").Trim)
												Dim paperSize4 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(24395 / 100, 720 - vTmp__, 10, vTmp_____)
												Dim paperSize5 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(30345 / 100, 720 - vTmp__, 10, vTmp____)
												Dim paperSize6 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(36295 / 100, 720 - vTmp__, 10, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9))
												writableCellWrapper.InitializeText(0, i9, cursorWrapper.GetString("codice").Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeText(1, i9, cursorWrapper.GetString("descrizione").Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(2, i9, Round2(cursorWrapper.GetDouble("sconto"), 2))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(3, i9, cursorWrapper.GetDouble("qta"))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(4, i9, Round2(cursorWrapper.GetDouble("importo"), 2))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												i9 = i9 + 1
											Else
												cursorWrapper2.Position = cursorWrapper.GetInt("codice")
												stringBuilderWrapper.Append(modfunstr.left(cursorWrapper2.GetString("descrizione").Trim & modfunstr.Sub004(33), 33) & vTmp_____ & vTmp____ & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9)).Append(CRLF)
												mypdfwriter.addText(10, 720 - vTmp__, 8, cursorWrapper.GetString("codice").Trim)
												Dim paperSize7 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(8925 / 100, 720 - vTmp__, 8, cursorWrapper2.GetString("descrizione").Trim)
												Dim paperSize8 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(24395 / 100, 720 - vTmp__, 10, vTmp_____)
												Dim paperSize9 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(30345 / 100, 720 - vTmp__, 10, vTmp____)
												Dim paperSize10 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(36295 / 100, 720 - vTmp__, 10, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9))
												writableCellWrapper.InitializeText(0, i9, cursorWrapper.GetString("codice").Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeText(1, i9, cursorWrapper2.GetString("descrizione").Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(2, i9, Round2(cursorWrapper.GetDouble("sconto"), 2))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(3, i9, cursorWrapper.GetDouble("qta"))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(4, i9, Round2(cursorWrapper.GetDouble("importo"), 2))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												i9 = i9 + 1
											End If
											Dim vRound2 As Double = d3 + Round2(cursorWrapper.GetDouble("importo"), 2)
											Dim doubleValue As Double = d2 + cursorWrapper.GetDouble("qta")
											d = Round2(cursorWrapper.GetDouble("sconto"), 2) + d
											d2 = doubleValue
											i8 = i8 + 1
											i10 = vTmp__ + 20
											d3 = vRound2
										Loop
										If str = "RG" Then
											vTmp = Sub136(i10, mypdfwriter, 2)
										Else
											vTmp = Sub136(i10, mypdfwriter, 1)
										End If
										mypdfwriter.addLine(10, 720 - vTmp, PerXToCurrent(99), 720 - vTmp)
										Dim i11 As Int = vTmp + 20
										If str = "RG" Then
											vTmp_ = Sub136(i11, mypdfwriter, 2)
										Else
											vTmp_ = Sub136(i11, mypdfwriter, 1)
										End If
										mypdfwriter.addLine(10, 720 - vTmp_, PerXToCurrent(99), 720 - vTmp_)
										Dim i12 As Int = vTmp_ + 20
										stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
										stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
										Dim vTmp______ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d2, 1, 3, 3, False), 9)
										Dim vTmp_______ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d, 1, 2, 2, False), 9)
										If 1000 * d2 Mod 1000 = 0 Then
											str4 = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d2, 1, 0, 0, False), 9)
										Else
											str4 = vTmp______
										End If
										mypdfwriter.addText(10, 720 - i12, 15, "TOTALI")
										Dim paperSize11 As PDFPaperSizes = vPDFPaperSizes1
										mypdfwriter.addText(24395 / 100, 720 - i12, 13, vTmp_______)
										Dim paperSize12 As PDFPaperSizes = vPDFPaperSizes1
										mypdfwriter.addText(30345 / 100, 720 - i12, 13, str4)
										Dim paperSize13 As PDFPaperSizes = vPDFPaperSizes1
										mypdfwriter.addText(36295 / 100, 720 - i12, 13, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d3, 1, 2, 2, False), 9))
										Dim i13 As Int = i9 + 1
										writableCellWrapper.InitializeText(1, i13, "TOTALI")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeNumber(2, i13, d)
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeNumber(3, i13, d2)
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeNumber(4, i13, d3)
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
										vAddSheet.AddCell(writableCellWrapper)
										Dim i14 As Int = i13 + 1
										stringBuilderWrapper.Append(modfunstr.left("TOTALI" & modfunstr.Sub004(33), 33) & vTmp_______ & str4 & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d3, 1, 2, 2, False), 9)).Append(CRLF)
										If z3 Then
											sMTPWrapper.Body = stringBuilderWrapper
										End If
									Else
										Dim i15 As Int = 20
										If list.Size > 0 Then
											stringBuilderWrapper.Append("Filtro: ").Append(CRLF)
											mypdfwriter.addText(100, 380, 13, "Filtro: ")
											writableCellWrapper.InitializeText(0, 2, "Filtro: ")
											writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
											vAddSheet.AddCell(writableCellWrapper)
											Dim size2 As Int = list.Size - 1
											Dim i16 As Int = 2
											Dim i17 As Int = 0
											Do While i17 <= size2
												stringBuilderWrapper.Append(list.Get(i17)).Append(CRLF)
												writableCellWrapper.InitializeText(1, i16, list.Get(i17))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												i16 = i16 + 1
												mypdfwriter.addText(100, 380 - i15, 13, list.Get(i17))
												i17 = i17 + 1
												i15 = i15 + 20
											Loop
											stringBuilderWrapper.Append("------------------------------------------").Append(CRLF)
											i2 = i16 + 2
										Else
											mypdfwriter.addText(100, 380, 13, "Filtro: Nessuno")
											stringBuilderWrapper.Append("Filtro: Nessuno").Append(CRLF)
											stringBuilderWrapper.Append("------------------------------------------").Append(CRLF)
											writableCellWrapper.InitializeText(0, 2, "Filtro: Nessuno")
											writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
											vAddSheet.AddCell(writableCellWrapper)
											i2 = 4
										End If
										stringBuilderWrapper.Append(modfunstr.left("DESCRIZIONE" & modfunstr.Sub004(24), 24) & modfunstr.Sub003(modfunstr.Sub004(9) & "QTA", 9) & modfunstr.Sub003(modfunstr.Sub004(9) & "IMPORTO", 9)).Append(CRLF)
										stringBuilderWrapper.Append("------------------------------------------").Append(CRLF)
										writableCellWrapper.InitializeText(0, i2, "Codice")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeText(1, i2, "Descrizione")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeText(2, i2, "")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeText(3, i2, "Qta")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeText(4, i2, "Importo")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										vAddSheet.SetColumnWidth(0, 20)
										vAddSheet.SetColumnWidth(1, 35)
										vAddSheet.SetColumnWidth(4, 13)
										Dim rowCount2 As Int = cursorWrapper.RowCount - 1
										Dim d4 As Double = 0
										Dim i18 As Int = 0
										Dim i19 As Int = i2 + 1
										Dim i20 As Int = 640
										Dim d5 As Double = 0
										Do While i18 <= rowCount2
											Dim vTmp________ As Int = Sub136(i20, mypdfwriter, 0)
											cursorWrapper.Position = i18
											Dim vTmp_________ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("qta"), 1, 3, 3, False), 9)
											If cursorWrapper.GetDouble("qta") * 1000 Mod 1000 = 0 Then
												str6 = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("qta"), 1, 0, 0, False), 9)
											Else
												str6 = vTmp_________
											End If
											If str = "I" Or str = "O" Or str = "C" Or str = "F" Or str = "MO" Then
												stringBuilderWrapper.Append(modfunstr.left(cursorWrapper.GetString("descrizione").Trim & modfunstr.Sub004(24), 24) & str6 & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9)).Append(CRLF)
												mypdfwriter.addText(10, 720 - vTmp________, 8, cursorWrapper.GetString("codice").Trim)
												Dim paperSize14 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(8925 / 100, 720 - vTmp________, 8, cursorWrapper.GetString("descrizione").Trim)
												Dim paperSize15 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(30345 / 100, 720 - vTmp________, 10, str6)
												Dim paperSize16 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(36295 / 100, 720 - vTmp________, 10, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9))
												writableCellWrapper.InitializeText(0, i19, cursorWrapper.GetString("codice").Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeText(1, i19, cursorWrapper.GetString("descrizione").Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(3, i19, cursorWrapper.GetDouble("qta"))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(4, i19, Round2(cursorWrapper.GetDouble("importo"), 2))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												i3 = i19 + 1
											Else
												cursorWrapper2.Position = cursorWrapper.GetInt("codice")
												stringBuilderWrapper.Append(modfunstr.left(cursorWrapper2.GetString("descrizione").Trim & modfunstr.Sub004(24), 24) & str6 & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9)).Append(CRLF)
												mypdfwriter.addText(10, 720 - vTmp________, 8, cursorWrapper2.GetString("codice").Trim)
												Dim paperSize17 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(8925 / 100, 720 - vTmp________, 8, cursorWrapper2.GetString("descrizione").Trim)
												Dim paperSize18 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(30345 / 100, 720 - vTmp________, 10, str6)
												Dim paperSize19 As PDFPaperSizes = vPDFPaperSizes1
												mypdfwriter.addText(36295 / 100, 720 - vTmp________, 10, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9))
												writableCellWrapper.InitializeText(0, i19, cursorWrapper2.GetString("codice").Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeText(1, i19, cursorWrapper2.GetString("descrizione").Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(3, i19, cursorWrapper.GetDouble("qta"))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												writableCellWrapper.InitializeNumber(4, i19, Round2(cursorWrapper.GetDouble("importo"), 2))
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
												vAddSheet.AddCell(writableCellWrapper)
												i3 = i19 + 1
											End If
											Dim vRound22 As Double = Round2(cursorWrapper.GetDouble("importo"), 2) + d5
											d4 = cursorWrapper.GetDouble("qta") + d4
											i18 = i18 + 1
											i19 = i3
											d5 = vRound22
											i20 = vTmp________ + 20
										Loop
										Dim vTmp__________ As Int = Sub136(i20, mypdfwriter, 0)
										mypdfwriter.addLine(10, 720 - vTmp__________, PerXToCurrent(99), 720 - vTmp__________)
										Dim vTmp___________ As Int = Sub136(vTmp__________ + 20, mypdfwriter, 0)
										mypdfwriter.addLine(10, 720 - vTmp___________, PerXToCurrent(99), 720 - vTmp___________)
										Dim i21 As Int = vTmp___________ + 20
										stringBuilderWrapper.Append("------------------------------------------").Append(CRLF)
										stringBuilderWrapper.Append("------------------------------------------").Append(CRLF)
										Dim vTmp____________ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d4, 1, 3, 3, False), 9)
										If 1000 * d4 Mod 1000 = 0 Then
											str5 = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d4, 1, 0, 0, False), 9)
										Else
											str5 = vTmp____________
										End If
										mypdfwriter.addText(10, 720 - i21, 15, "TOTALI")
										Dim paperSize20 As PDFPaperSizes = vPDFPaperSizes1
										mypdfwriter.addText(30345 / 100, 720 - i21, 13, str5)
										Dim paperSize21 As PDFPaperSizes = vPDFPaperSizes1
										mypdfwriter.addText(36295 / 100, 720 - i21, 13, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d5, 1, 2, 2, False), 9))
										Dim i22 As Int = i19 + 1
										writableCellWrapper.InitializeText(1, i22, "TOTALI")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeNumber(3, i22, d4)
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
										vAddSheet.AddCell(writableCellWrapper)
										writableCellWrapper.InitializeNumber(4, i22, d5)
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
										vAddSheet.AddCell(writableCellWrapper)
										Dim i23 As Int = i22 + 1
										stringBuilderWrapper.Append(modfunstr.left("TOTALI" & modfunstr.Sub004(24), 24) & str5 & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d5, 1, 2, 2, False), 9)).Append(CRLF)
										If z3 Then
											sMTPWrapper.Body = stringBuilderWrapper
										End If
									End If
									cursorWrapper4.Close
									writableWorkbookWrapper.Write
									writableWorkbookWrapper.Close
									mypdfwriter.ConverseDocument
									mypdfwriter.outputToFile(vStr4, str2 & ".PDF", vStr3, "ISO-8859-1")
									If z3 Then
										sMTPWrapper.AddAttachment(vStr4, str2 & ".PDF")
										sMTPWrapper.AddAttachment(vStr4, str2 & ".xls")
										sMTPWrapper.Send
									End If
									If Main.v_usbpath <> "" And str3.Contains("C") Then
										Try
											File.Copy(vStr4, str2 & ".PDF", Main.v_usbpath, str2 & " del " & vTmp___.Replace("/", "-").Replace(":", ".") & ".PDF")
											File.Copy(vStr4, str2 & ".xls", Main.v_usbpath, str2 & " del " & vTmp___.Replace("/", "-").Replace(":", ".") & ".xls")
											If Not(z) Then
												Dim vObjectToCharSequence3 As Object = "Copia effettuata correttamente"
												Dim vObjectToCharSequence4 As Object = Main.vStr8
												Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
												Return
											End If
											Return
										Catch
											Sub217(LastException.Message)
											Return
										End Try
									End If
									Return
								End If
								Return
							End If
							Return
						End If
					End If
				End If
			End If
		End If
		z3 = False
		If Not(z3) Then
		End If
		Dim str72 As String = "Confermi l'invio della mail ? "
		If str3 <> "MC" Then
		End If
		If Not(z) Then
		End If
		If vMsgbox2 <> -1 Then
		End If
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m6… (riga 12711).
Sub Sub131(str As String, str2 As String, str3 As String, sMTPWrapper As SMTP, z As Boolean)
	Dim z2 As Boolean
	vStr2 = " Sub MailDB(Title As String ,smtp1 As SMTP,Testo As String,SendDb As Boolean)"
	Try
		If str3 = "" Then
			Return
		End If
		If Main.v_mserver = "" Then
			Return
		End If
		If Main.v_mporta = "" Then
			Return
		End If
		If Main.v_muser = "" Then
			Return
		End If
		If Main.v_mpwd <> "" Then
			If Main.v_md1 = "" Then
				If Main.v_md2 = "" Then
					If Not(Main.v_attivafe) Then
						Return
					End If
				End If
			End If
			Dim str4 As String = str2 & CRLF & "Inviato da : " & CRLF
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from intesta order by codice")
			If cursorWrapper2.RowCount > 0 Then
				Dim i As Int = 0
				Do While i <= 5
					cursorWrapper2.Position = i
					i = i + 1
					str4 = str4 & cursorWrapper2.GetString("descrizione") & CRLF
				Loop
			End If
			Dim str5 As String = str4
			cursorWrapper2.Close
			Dim parseDouble As Int = Main.v_mporta
			sMTPWrapper.Initialize(Main.v_mserver, parseDouble, Main.v_muser, Main.v_mpwd, "SMTP")
			If Main.v_mporta <> 465 Then
				If Main.v_mporta <> 587 Then
					z2 = False
					sMTPWrapper.UseSSL = z2
					If Main.v_md1 <> "" Then
						Sub004(sMTPWrapper, Main.v_md1, True)
					End If
					If Main.v_md2 <> "" Then
						Sub004(sMTPWrapper, Main.v_md2, True)
					End If
					If str3 <> "" Then
						sMTPWrapper.To.Add(str3)
					End If
					sMTPWrapper.Subject = Main.v_mdesmittente & " " & str
					sMTPWrapper.Body = str5
					If vStr5.Trim <> "" Then
						If File.Exists(vStr4 & "/fatture", vStr5) Then
							sMTPWrapper.AddAttachment(vStr4 & "/fatture", vStr5)
						End If
					End If
					If z Then
						sMTPWrapper.AddAttachment(vStr7, vStr6.Replace(".xml", ".txt"))
					End If
					sMTPWrapper.Send
					Return
				End If
			End If
			z2 = True
			sMTPWrapper.UseSSL = z2
			If Main.v_md1 <> "" Then
			End If
			If Main.v_md2 <> "" Then
			End If
			If str3 <> "" Then
			End If
			sMTPWrapper.Subject = Main.v_mdesmittente & " " & str
			sMTPWrapper.Body = str5
			If vStr5.Trim <> "" Then
			End If
			If z Then
			End If
			sMTPWrapper.Send
			Return
		End If
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m7… (riga 12837).
Sub Sub132(str As String, sMTPWrapper As SMTP, str2 As String, z As Boolean)
	Dim str3 As String
	Dim z2 As Boolean
	vStr2 = "Sub Mail"
	Try
		If Main.v_mserver = "" Then
			Return
		End If
		If Main.v_mporta = "" Then
			Return
		End If
		If Main.v_muser = "" Then
			Return
		End If
		If Main.v_mpwd = "" Then
			Return
		End If
		If Main.v_md3 <> "" Then
			If z Then
				ProgressDialogShow2("Invio in corso ...", False)
			End If
			Dim str4 As String = str2 & CRLF & "Inviato da : " & CRLF
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from intesta order by codice")
			If cursorWrapper2.RowCount > 0 Then
				Dim str5 As String = str4
				Dim i As Int = 0
				Do While i <= 5
					cursorWrapper2.Position = i
					i = i + 1
					str5 = str5 & cursorWrapper2.GetString("descrizione") & CRLF
				Loop
				str3 = str5
			Else
				str3 = str4
			End If
			Dim parseDouble As Int = Main.v_mporta
			sMTPWrapper.Initialize(Main.v_mserver, parseDouble, Main.v_muser, Main.v_mpwd, "SMTP")
			If Main.v_mporta <> 465 Then
				If Main.v_mporta <> 587 Then
					z2 = False
					sMTPWrapper.UseSSL = z2
					If Main.v_md3 <> "" Then
						Dim to_ As List = sMTPWrapper.To
						to_.Add(Main.v_md3)
					End If
					sMTPWrapper.Subject = Main.v_mdesmittente & " " & str
					sMTPWrapper.Body = str3
					If z Then
						If File.Exists(File.DirRootExternal, "LastLOG.zi_") Then
							sMTPWrapper.AddAttachment(File.DirRootExternal, "LastLOG.zi_")
						End If
						If File.Exists(File.DirRootExternal, "LastDB.zi_") Then
							sMTPWrapper.AddAttachment(File.DirRootExternal, "LastDB.zi_")
						End If
					End If
					sMTPWrapper.Send
					cursorWrapper2.Close
					Return
				End If
			End If
			z2 = True
			sMTPWrapper.UseSSL = z2
			If Main.v_md3 <> "" Then
			End If
			sMTPWrapper.Subject = Main.v_mdesmittente & " " & str
			sMTPWrapper.Body = str3
			If z Then
			End If
			sMTPWrapper.Send
			cursorWrapper2.Close
			Return
		End If
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub133(obj As Object, obj2 As Object, str As String) As Int
	Dim i As Int = 0
	Try
		Select str
			Case "LQ"
				i = obj2 / obj
			Case "GQ"
				i = obj / obj2
			Case "LT"
				i = obj2 / obj
			Case "GT"
				i = obj / obj2
		End Select
	Catch
		If Not( = Null) Then
			 = 
		End If
	End Try
	Return i
End Sub

Sub Sub134(str As String, z As Boolean) As Boolean
	Dim indexOf As Int
	If (str.Length <= 3 Or str.SubString2(0, 1) <> "_") And str.Trim <> "" Then
		Dim trim As String = str.Trim
		If trim.Length = 16 Then
			Dim i As Int = 0
			Dim i2 As Int = 1
			Do While i2 <= 15
				Dim upperCase As String = modfunstr.Sub002(trim, i2, 1).ToUpperCase
				If "0123456789".IndexOf(upperCase) + 1 <> 0 Then
					upperCase = Chr(r8 + 65 - 1)
				End If
				If "ABCDEFGHIJKLMNOPQRSTUVWXYZ".IndexOf(upperCase) + 1 = 0 Then
					If Not(z) Then
						Dim vObjectToCharSequence As Object = "Codice non valido"
						Dim vObjectToCharSequence2 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					End If
					Return False
				End If
				If i2 Mod 2 = 0 Then
					indexOf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".IndexOf(upperCase)
				Else
					indexOf = "BAKPLCQDREVOSFTGUHMINJWZYX".IndexOf(upperCase)
				End If
				i2 = i2 + 1
				i = indexOf + i
			Loop
			Dim vChr As Char = Chr(i Mod 26 + 65)
			If modfunstr.Sub003(trim, 1).ToUpperCase = vChr Then
				Return True
			End If
			If Not(z) Then
				Dim vObjectToCharSequence3 As Object = "Codice non valido"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			End If
			Return False
		End If
		If Sub135(trim, True) Then
			Return True
		End If
		If Not(z) Then
			Dim vObjectToCharSequence5 As Object = "Codice non valido"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		End If
		Return False
	End If
	Return True
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m1… (riga 13051).
Sub Sub135(str As String, z As Boolean) As Boolean
	Dim z2 As Boolean = True
	Try
		Dim trim As String = str.Trim
		If trim.Length < 3 Then
			Return False
		End If
		If trim.Length = 11 Then
			If IsNumber(modfunstr.left(trim, 2)) Then
				Return myispi_it(trim, z)
			End If
		End If
		Select modfunstr.left(trim, 2).ToUpperCase
			Case "IT"
				z2 = myispi_it(modfunstr.Sub002(trim, 3, trim.Length - 2), True)
			Case "SM"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999")
			Case "AT"
				If trim.Length >= 4 Then
					If Sub025(modfunstr.Sub002(trim, 4, trim.Length - 3), "99999999") Then
					End If
					z2 = False
				Else
					z2 = False
				End If
			Case "BE"
				If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")) Then
					If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "9999999999")) Then
						z2 = False
					End If
				End If
			Case "CY"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999L")
			Case "CZ"
				If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999")) Then
					If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")) Then
						If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "9999999999")) Then
							z2 = False
						End If
					End If
				End If
			Case "DE"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")
			Case "DK"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999")
			Case "EE"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")
			Case "EL"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")
			Case "ES"
				If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "L99999999")) Then
					If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999L")) Then
						If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "L9999999L")) Then
							z2 = False
						End If
					End If
				End If
			Case "FI"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999")
			Case "FR"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "XX999999999")
			Case "GB"
				If trim.Length >= 6 Then
					If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")) Then
						If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999999")) Then
							If Sub025(modfunstr.Sub002(trim, 5, trim.Length - 2), "999") Then
							End If
							If Sub025(modfunstr.Sub002(trim, 5, trim.Length - 2), "999") Then
							End If
							z2 = False
						End If
					End If
				Else
					z2 = False
				End If
			Case "HU"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999")
			Case "IE"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "9S99999L")
			Case "LT"
				If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")) Then
					If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999999")) Then
						z2 = False
					End If
				End If
			Case "LU"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999")
			Case "LV"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999999")
			Case "MT"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999")
			Case "NL"
				If Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999L99") Then
				End If
				z2 = False
			Case "PL"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "9999999999")
			Case "PT"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")
			Case "SE"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999999")
			Case "SI"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999")
			Case "SK"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "9999999999")
			Case "RU"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999999")
			Case "RO"
				If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99")) Then
					If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999")) Then
						If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "9999")) Then
							If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999")) Then
								If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999")) Then
									If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "9999999")) Then
										If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "99999999")) Then
											If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999999")) Then
												If Not(Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "9999999999")) Then
													z2 = False
												End If
											End If
										End If
									End If
								End If
							End If
						End If
					End If
				End If
			Case "CH"
				z2 = Sub025(modfunstr.Sub002(trim, 3, trim.Length - 2), "999999")
				If modfunstr.left(trim, 3).ToUpperCase = "CHE" And trim.Length = 12 Then
					z2 = Sub025(modfunstr.Sub002(trim, 4, 9), "999999999")
				End If
			Case Else
				z2 = False
		End Select
		If z Or Not(z2) Then
		End If
		Return z2
	Catch
		Sub217(LastException)
		Return False
	End Try
End Sub

Sub myispi_it(str As String, z As Boolean) As Boolean
	If str.Trim = "" Then
		Return True
	End If
	If Not(Sub025(str, "99999999999")) Then
		If Not(z) Then
		End If
		Return False
	End If
	Dim i As Int = 0
	Dim i2 As Int
	For i2 = 1 To 10
		Dim vTmp As Int = modfunstr.Sub006(modfunstr.Sub002(str, i2, 1))
		If i2 Mod 2 = 0 Then
			Dim vNumberToString As String = vTmp * 2
			If vNumberToString.Length <> 1 Then
				Dim vTmp_ As Double = i + modfunstr.Sub006(modfunstr.left(vNumberToString, 1))
				i = modfunstr.Sub006(modfunstr.Sub003(vNumberToString, 1)) + vTmp_
			Else
				i = i + vTmp * 2
			End If
		Else
			i = i + vTmp
		End If
	Next
	Dim vNumberToString2 As String = i
	Dim vTmp__ As Int = (10 - modfunstr.Sub006(modfunstr.Sub003(vNumberToString2, 1))) Mod 10
	If modfunstr.Sub006(modfunstr.Sub003(str, 1)) = vTmp__ Then
		Return True
	End If
	If Not(z) Then
	End If
	Return False
End Sub

Sub Sub136(i As Int, mypdfwriter As PDFWriter, i2 As Int) As Int
	If i > 620 Then
		mypdfwriter.newPage
		Dim standardFonts As PDFStandardFonts = Main.vPDFStandardFonts1
		Dim standardFonts2 As PDFStandardFonts = Main.vPDFStandardFonts1
		mypdfwriter.setFont("Symbol", "Helvetica")
		Dim standardFonts3 As PDFStandardFonts = Main.vPDFStandardFonts1
		Dim standardFonts4 As PDFStandardFonts = Main.vPDFStandardFonts1
		mypdfwriter.setFont("Type1", "Helvetica")
		mypdfwriter.addText(10, 760, 15, "COD.")
		Dim paperSize As PDFPaperSizes = vPDFPaperSizes1
		mypdfwriter.addText(8925 / 100, 760, 15, "DESCRIZIONE")
		If i2 = 1 Then
			Dim paperSize2 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(23800 / 100, 760, 15, "SCONTI")
		End If
		If i2 = 2 Then
			Dim paperSize3 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(23205 / 100, 760, 15, "GUADAGNO")
		End If
		Dim paperSize4 As PDFPaperSizes = vPDFPaperSizes1
		mypdfwriter.addText(30345 / 100, 760, 15, "QTA")
		Dim paperSize5 As PDFPaperSizes = vPDFPaperSizes1
		mypdfwriter.addText(35700 / 100, 760, 15, "IMPORTO")
		Return 0
	End If
	Return i
End Sub

Sub Sub137(str As String)
	Dim intentWrapper As Intent
	intentWrapper.Initialize("android.intent.action.VIEW", str)
	intentWrapper.SetType("application/pdf")
	intentWrapper.WrapAsIntentChooser("Scegli il PDF Viewer")
	If Not( = Null) Then
		 = 
	End If
	StartActivity(intentWrapper)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m3… (riga 13387).
Sub Sub138(i As Int) As ckprinter
	Dim vTmp As ckprinter
	Dim i2 As Int
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe where codice = " & i)
	cursorWrapper2.Position = 0
	If cursorWrapper2.GetInt("stato") <> 1 Then
		Return Null
	End If
	If cursorWrapper2.GetInt("mf") = 1 Then
		Return Null
	End If
	If Main.vMap2.ContainsKey(i) Then
		vTmp = Sub102(Main.vMap2.Get(i))
	Else
		vTmp = Sub102(i)
	End If
	If Not(vTmp.vBln5) Then
		Return Null
	End If
	Dim vTmp_ As String = Sub103(vTmp)
	If vTmp_.StartsWith("Errore") Then
		Dim i3 As Int = 1
		Dim str As String = vTmp_
		Dim i4 As Int = -1
		Do While True
			If i4 <> -1 Then
				i2 = i3
				Exit
			End If
			i4 = -2
			If str.StartsWith("Errore") Then
				If Main.v_disconnettiprt Then
					vTmp.Sub001
				End If
				Dim str2 As String = str & CRLF & "Stampante  " & cursorWrapper2.GetString("descrizione") & CRLF & "Si desidera riprovare o considerare la stampante 'Guasta' ?"
				vBln8 = True
				If vStr1 = "" Then
					ToastMessageShow(str2, True)
					i2 = 1
					Exit
				End If
				i4 = CallSub2(vStr1, "msgboxAct", str2)
				If i4 = -3 Then
					i4 = -1
				End If
				If i4 <> -1 Then
					If vStr1 <> "" Then
						Dim vObjectToNumber As Int = CallSub2(vStr1, "ErrPrtAct", i)
						If vObjectToNumber > 0 Then
							Main.vMap2.Put(i, vObjectToNumber)
							i2 = 1
							If Main.v_errmail Then
								If Main.v_md3 <> "" Then
									Sub132("Errore Stampante", vSMTP1, str2, False)
								End If
							End If
						End If
					End If
					i2 = 2
					If Main.v_errmail Then
					End If
				Else
					str = Sub103(vTmp)
					i3 = 2
				End If
			Else
				i3 = 1
			End If
		Loop
		vBln8 = False
		If Main.v_lognf And i2 = 2 Then
			vTmp.Sub003("Stampante impostata su GUASTA dall'utente", True)
		End If
		Main.vSql1.ExecNonQuery("update confstampe set stato = " & i2 & " where codice = " & cursorWrapper2.GetString("codice"))
	Else
		If vTmp_ <> "" Then
			ToastMessageShow("Stampante  " & cursorWrapper2.GetString("descrizione") & CRLF & vTmp_, True)
		End If
		i2 = 1
	End If
	If i2 = 2 Then
		Dim cursorWrapper3 As Cursor
		If Main.v_disconnettiprt Then
			vTmp.Sub001
		End If
		Return Null
	End If
	cursorWrapper2.Close
	Return vTmp
End Sub

Sub Sub139(str As String, i As Int, c As Char) As String
	If Not(str = Null) And str.Length < i Then
		Dim length As Int = i - str.Length
		Dim str2 As String = ""
		Dim i2 As Int
		For i2 = 1 To length
			str2 = str2 & c
		Next
		Return str2 & str
	End If
	Return str.SubString2(0, i)
End Sub

Sub Sub140(str As String, i As Int, c As Char) As String
	If Not(str = Null) And str.Length < i Then
		Dim length As Int = i - str.Length
		Dim str2 As String = ""
		Dim i2 As Int
		For i2 = 1 To length
			str2 = str2 & c
		Next
		Return str & str2
	End If
	Return str.SubString2(0, i)
End Sub

Sub Sub141(str As String, str2 As String, cursorWrapper As Cursor, str3 As String, mypdfwriter As PDFWriter)
	If File.Exists(vStr4, "LogoPrg.jpg") Then
		mypdfwriter.addImage(4, 688, LoadBitmap(vStr4, "LogoPrg.jpg"))
	Else
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
		If cursorWrapper3.RowCount > 0 Then
			Dim i As Int = 790
			Dim i2 As Int
			For i2 = 0 To 5
				cursorWrapper3.Position = i2
				If i2 = 0 Then
					mypdfwriter.addText(20, i, 11, cursorWrapper3.GetString("descrizione"))
					i = i - 20
				Else
					mypdfwriter.addText(20, i, 9, cursorWrapper3.GetString("descrizione"))
					i = i - 15
				End If
			Next
		End If
		cursorWrapper3.Close
	End If
	Dim replace As String = str.Replace("N.", "")
	Dim paperSize As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(30940 / 100, 800, 9, replace & str2)
	Dim paperSize2 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize3 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addRectangle(30345 / 100, 690, 26775 / 100, 130)
	Dim paperSize4 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(30940 / 100, 780, 9, "Destinatario: ")
	If str3 <> "" Then
		If Not(Sub222(cursorWrapper.GetString("descrizione"))) Then
			Dim i3 As Int = 11
			If cursorWrapper.GetString("descrizione").Length > 30 Then
				i3 = 9
			End If
			If cursorWrapper.GetString("descrizione").Length > 40 Then
				i3 = 8
			End If
			Dim paperSize5 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(30940 / 100, 760, i3, cursorWrapper.GetString("descrizione").Trim)
		End If
		If Not(Sub222(cursorWrapper.GetString("via"))) Then
			Dim i4 As Int = 11
			If cursorWrapper.GetString("via").Length > 30 Then
				i4 = 9
			End If
			If cursorWrapper.GetString("via").Length > 40 Then
				i4 = 8
			End If
			Dim paperSize6 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(30940 / 100, 740, i4, cursorWrapper.GetString("via").Trim)
		End If
		Dim str4 As String = ""
		If Not(Sub222(cursorWrapper.GetString("cap"))) Then
			str4 = cursorWrapper.GetString("cap").Trim & " "
		End If
		If Not(Sub222(cursorWrapper.GetString("citta"))) Then
			str4 = str4 & cursorWrapper.GetString("citta").Trim & " "
		End If
		If Not(Sub222(cursorWrapper.GetString("provincia"))) Then
			str4 = str4 & cursorWrapper.GetString("provincia").Trim & " "
		End If
		If Not(Sub222(str4)) Then
			Dim i5 As Int = 11
			If str4.Length > 30 Then
				i5 = 9
			End If
			If str4.Length > 40 Then
				i5 = 8
			End If
			Dim paperSize7 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(30940 / 100, 725, i5, str4)
		End If
		If Not(Sub222(cursorWrapper.GetString("piva"))) Then
			Dim paperSize8 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(30940 / 100, 710, 9, "P.IVA: " & cursorWrapper.GetString("piva").Trim)
		End If
		If Not(Sub222(cursorWrapper.GetString("codf"))) Then
			Dim paperSize9 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(30940 / 100, 695, 9, "C.F.: " & cursorWrapper.GetString("codf").Trim)
		End If
	End If
	Dim paperSize10 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(2380 / 100, 670, 11, "Codice")
	Dim paperSize11 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize12 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(8330 / 100, 683, 8330 / 100, 180)
	Dim paperSize13 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(8925 / 100, 670, 11, "Descrizione")
	Dim paperSize14 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize15 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(29155 / 100, 683, 29155 / 100, 180)
	Dim paperSize16 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(29750 / 100, 670, 11, "Prezzo Unit.")
	Dim paperSize17 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize18 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(39270 / 100, 683, 39270 / 100, 180)
	Dim paperSize19 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(41055 / 100, 670, 11, "Qta")
	Dim paperSize20 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize21 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(47005 / 100, 683, 47005 / 100, 180)
	Dim paperSize22 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(48195 / 100, 670, 11, "Importo")
	Dim paperSize23 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize24 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(54145 / 100, 683, 54145 / 100, 180)
	Dim paperSize25 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(54740 / 100, 670, 11, "Iva")
	Dim paperSize26 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize27 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(1785 / 100, 683, 1785 / 100, 180)
	Dim paperSize28 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize29 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(1785 / 100, 667, 57120 / 100, 667)
	Dim paperSize30 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize31 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(1785 / 100, 683, 57120 / 100, 683)
	Dim paperSize32 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize33 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(57120 / 100, 683, 57120 / 100, 180)
	Dim paperSize34 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize35 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(1785 / 100, 180, 57120 / 100, 180)
End Sub

Sub Sub142(str As String, str2 As String, i As Int, i2 As Int, z As Boolean) As String
	Dim str3 As String = ""
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	If str2 = "Report" Then
		str3 = " -v "
	End If
	If str2 = "Summary" Or str2 = "Status" Then
		str3 = " -q "
	End If
	Phone.Shell("ping -c " & i & " -W " & i2 & str3 & str, Null, stringBuilderWrapper, Null)
	If stringBuilderWrapper.Length = 0 Or stringBuilderWrapper.ToString.contains("Unreachable") Or stringBuilderWrapper.ToString.ToLowerCase.Contains("100% packet loss") Or stringBuilderWrapper.ToString.ToLowerCase.Contains("0 received") Then
		Return "Host unreachable"
	End If
	Log(stringBuilderWrapper.ToString)
	If str2 <> "Status" Then
		Return stringBuilderWrapper.ToString
	End If
	Return "Host online"
End Sub

Sub Sub143(str As String, str2 As String) As Int
	vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		Dim list As List
		list.Initialize
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("SELECT * FROM " & str & " order by codice")
		Dim list2 As List
		list2.Initialize
		list2.Clear
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int = 0
		Dim i2 As Int
		For i2 = 0 To rowCount
			DoEvents
			cursorWrapper2.Position = i2
			If cursorWrapper2.GetString("descrizione").Trim.ToUpperCase <> "ALLERGENE" And cursorWrapper2.GetString("descrizione").Trim.ToUpperCase <> "DA INSERIRE" And cursorWrapper2.GetString("descrizione").Trim <> "" And (str <> "pagamenti" Or i2 <> 30) Then
				list.Add(cursorWrapper2.GetString("descrizione"))
				list2.InsertAt(i, i2)
				i = i + 1
			End If
		Next
		cursorWrapper2.Close
		Dim vInputList1 As Int = idLib.InputList1(list, str2)
		If vInputList1 < 0 Then
			Return -1
		End If
		Return list2.Get(vInputList1)
	Catch
		Sub217(LastException.Message)
		Return 0
	End Try
End Sub

Sub Sub144(ckprinterVar As ckprinter, str As String)
	If str <> "" Then
		Sub153("Tipo documento: " & str, 1, ckprinterVar)
	End If
	Sub153("-- CEDENTE -------------------------------", 4, ckprinterVar)
	If Main.vCur7.GetString("DenEser").Trim = "" Then
		Sub153(Main.vCur7.GetString("NomeEser") & " " & Main.vCur7.GetString("CognomeEser"), 4, ckprinterVar)
	Else
		Sub153(Main.vCur7.GetString("DenEser"), 4, ckprinterVar)
	End If
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select Sigla from FERegFiscale where Codice =" & Main.vCur7.GetString("RegFiscEser"))
	If vExecQuerySingleResult = Null Or vExecQuerySingleResult = "" Then
	End If
	If Not(Sub222(Main.vCur7.GetString("ViaEser"))) Then
		Sub153(Main.vCur7.GetString("ViaEser").Trim, 1, ckprinterVar)
	End If
	Dim str2 As String = ""
	If Not(Sub222(Main.vCur7.GetString("CapEser"))) Then
		str2 = Main.vCur7.GetString("CapEser").Trim & " "
	End If
	If Not(Sub222(Main.vCur7.GetString("CittaEser"))) Then
		str2 = str2 & Main.vCur7.GetString("CittaEser").Trim & " "
	End If
	If Not(Sub222(Main.vCur7.GetString("ProvinciaEser"))) Then
		str2 = str2 & Main.vCur7.GetString("ProvinciaEser").Trim & " "
	End If
	If Not(Sub222(Main.vCur7.GetString("NazioneEser"))) Then
		str2 = str2 & Main.vCur7.GetString("NazioneEser").Trim & " "
	End If
	If Not(Sub222(str2)) Then
		Sub153(str2, 1, ckprinterVar)
	End If
	If Main.vCur7.GetInt("TipoEser") <> 0 Then
		Sub153("Partita iva: " & Main.vCur7.GetString("CodForn"), 1, ckprinterVar)
	End If
	If Main.vCur7.GetString("CFEser").Trim <> "" Then
		Sub153("Codice fiscale: " & Main.vCur7.GetString("CFEser"), 1, ckprinterVar)
	End If
	If Main.vCur7.GetString("NumeroREA").Trim <> "" Then
		Sub153("Ufficio REA: " & Main.vCur7.GetString("UfficioREA"), 1, ckprinterVar)
		Sub153("Numero REA: " & Main.vCur7.GetString("NumeroREA"), 1, ckprinterVar)
	End If
	If Main.vCur7.GetString("CapSocREA").Trim <> "" Then
		Sub153("Capitale Sociale: " & NumberFormat2(Main.vCur7.GetDouble("CapSocREA"), 1, 2, 2, False), 1, ckprinterVar)
	End If
	If Main.vCur7.GetString("SocUnicoREA").Trim <> "0" Then
		If Main.vCur7.GetInt("TipoEser") = 2 Then
			If Main.vCur7.GetString("SocUnicoREA").Trim = "1" Then
				Sub153("Numero Soci:Socio Unico ", 1, ckprinterVar)
			Else
				Sub153("Numero Soci:Piu' soci", 1, ckprinterVar)
			End If
		End If
	End If
	If Main.vCur7.GetInt("TipoEser") = 2 Then
		If Main.vCur7.GetString("StatoLiquidazioneREA").Trim = "0" Then
			Sub153("Azienda Non in liquidazione", 1, ckprinterVar)
			Return
		End If
		Sub153("Azienda In liquidazione", 1, ckprinterVar)
		Return
	End If
End Sub

Sub Sub145(str As String) As Boolean
	Return Main.vInt25 <> 0 And vMap1.ContainsKey(str)
End Sub

Sub Sub146(str As String, j As Long, i As Int, i2 As Int)
	vStr2 = "Sub RegistraCancellazione(Query As String)"
	Try
		Dim list As List
		list.Initialize
		list.Clear
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery(str)
		Dim map As Map
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i3 As Int
			For i3 = 0 To rowCount
				cursorWrapper2.Position = i3
				map.Initialize
				map.Put("nmov", j)
				map.Put("codint", cursorWrapper2.GetString("codint"))
				map.Put("datam", Sub057(DateTime.Date(Sub058()) & " " & DateTime.Time(Sub058())))
				map.Put("operatore", i)
				map.Put("qta", cursorWrapper2.GetDouble("qta"))
				map.Put("brep", cursorWrapper2.GetInt("brep"))
				map.Put("importo", Round2(cursorWrapper2.GetDouble("importo"), 2))
				map.Put("tavolo", i2)
				map.Put("cassa", Main.v_numcassa)
				list.Add(map)
			Next
		End If
		cursorWrapper2.Close
		If list.Size > 0 Then
			dbutil.Sub007(Main.vSql1, "eliminati", list)
			If Main.vBln25 Then
				Dim parseDouble As Int = Main.vSql2.ExecQuerySingleResult("Select valore from progressivi where codice ='V'")
				Dim randomAccessFile As RandomAccessFile
				Dim str2 As String = "VDel" & Sub059(Sub058()) & "M" & parseDouble & "_" & i2 & "_" & j & "_0_" & 0 & "_0_.txt"
				randomAccessFile.Initialize2(Main.vStr17, str2, False, False)
				randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
				Return
			End If
			Return
		End If
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub147(str As String, str2 As String, str3 As String, str4 As String) As Boolean
	Dim reflection As Reflector
	If str2 = Null Or str4 = Null Or str = Null Or str3 = Null Then
		Return False
	End If
	If Not(File.Exists(str, str2)) Then
		Return False
	End If
	If File.Exists(str3, str4) Then
		Return False
	End If
	Dim vCombine As String = File.Combine(str3, str4)
	Dim vCombine2 As String = File.Combine(str, str2)
	If Not(vCombine <> vCombine2) Then
		Return False
	End If
	Dim vCreateObject2 As Object = reflection.CreateObject2("java.io.File", Array(vCombine), Array As String("java.lang.String"))
	reflection.Target = reflection.CreateObject2("java.io.File", Array(vCombine2), Array As String("java.lang.String"))
	Return reflection.RunMethod4("renameTo", Array(vCreateObject2), Array As String("java.io.File"))
End Sub

Sub Sub148(str As String) As String
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	If str.Length > 0 Then
		Dim length As Int = str.Length - 1
		Dim i As Int
		For i = 0 To length
			Dim vObjectToString As String = str.CharAt(i)
			Select vObjectToString
				Case "&"
					vObjectToString = "&amp;"
				Case "<"
					vObjectToString = "&lt;"
				Case ">"
					vObjectToString = "&gt;"
				Case QUOTE
					vObjectToString = "&quot;"
				Case "'"
					vObjectToString = "&apos;"
				Case Chr(180), Chr(96)
					vObjectToString = "&apos;"
				Case "€"
					vObjectToString = "EURO"
				Case Else
					If Asc(vObjectToString) > 255 Then
						vObjectToString = " "
					Else If Asc(vObjectToString) > 128 Then
						vObjectToString = "&#" & Asc(vObjectToString) & ";"
					Else
					End If
			End Select
			stringBuilderWrapper.Append(vObjectToString)
		Next
	End If
	Return stringBuilderWrapper.ToString
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m5… (riga 14018).
Sub Sub149(str As String, i As Int)
	Try
		vBln12 = False
		vMap3.Initialize
		vMap4.Initialize
		vInt4 = 0
		vLst2.Initialize
		vMap5.Initialize
		vInt5 = 0
		Dim sb2 As String = DateTime.GetYear(Sub058()) & NumberFormat2(DateTime.GetMonth(Sub058()), 2, 0, 0, False) & NumberFormat2(DateTime.GetDayOfMonth(Sub058()), 2, 0, 0, False)
		Dim vGetDayOfWeek As Int = DateTime.GetDayOfWeek(DateTime.Now)
		Dim sb4 As String = NumberFormat2(DateTime.GetHour(DateTime.Now), 2, 0, 0, False) & NumberFormat2(DateTime.GetMinute(DateTime.Now), 2, 0, 0, False)
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from MPIniziative where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "DataInizio<= '" & SmartStringFormatter("", sb2) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "DataFine >='" & SmartStringFormatter("", sb2) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "OraInizio<= '" & SmartStringFormatter("", sb4) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "OraFine >'" & SmartStringFormatter("", sb4) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "substr(GiorniValidita," & SmartStringFormatter("", vGetDayOfWeek) & ",1)='1' " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "order by Priorita")
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount
				cursorWrapper2.Position = i2
				If (cursorWrapper2.GetString("Linea") <> "B" Or str <> "") And (cursorWrapper2.GetString("Linea") <> "C" Or str = "") Then
					If modfunstr.Sub006(cursorWrapper2.GetString("Linea")) > 0 Then
						If modfunstr.Sub006(cursorWrapper2.GetString("Linea")) < 10 Then
							Dim d As Double = i + 1
							If d <> modfunstr.Sub006(cursorWrapper2.GetString("Linea")) Then
								Continue
							End If
						End If
					End If
					Dim vGetString As String = cursorWrapper2.GetString("CodElementoScontrino")
					If cursorWrapper2.GetString("ElementoScontrino") = "ART" Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where codint ='" & vGetString & "'") = 0 Then
							Continue
						End If
						Dim list As List
						list.Initialize
						If cursorWrapper2.GetInt("limita") = 1 Then
							If Not(Sub033(cursorWrapper2.GetString("Codice"), cursorWrapper2.GetString("CodiceCondizione"), list)) Then
								Continue
							End If
							Dim i3 As Int = 0
							If list.Size > 0 Then
								list.Sort(True)
								i3 = list.Get(0)
							End If
							Sub174(cursorWrapper2.GetString("Codice"), cursorWrapper2.GetString("CodiceCondizione"), cursorWrapper2.GetString("AmountType"), i3)
							If cursorWrapper2.GetString("Esclusivita") <> "F" Then
								Exit
							End If
						Else
							If Not(Sub033(cursorWrapper2.GetString("Codice"), cursorWrapper2.GetString("CodiceCondizione"), Null)) Then
							End If
							Dim i32 As Int = 0
							If list.Size > 0 Then
							End If
							Sub174(cursorWrapper2.GetString("Codice"), cursorWrapper2.GetString("CodiceCondizione"), cursorWrapper2.GetString("AmountType"), i32)
							If cursorWrapper2.GetString("Esclusivita") <> "F" Then
							End If
						End If
					Else If cursorWrapper2.GetString("ElementoScontrino") = "REP" Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where reparto =" & vGetString) = 0 Then
						End If
						Dim list2 As List
						list2.Initialize
						If cursorWrapper2.GetInt("limita") = 1 Then
						End If
					Else
						If cursorWrapper2.GetString("ElementoScontrino") = "GRP" Then
							If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "(select count(*) from anagra where " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Ventmp.codint=anagra.codint and anagra.gruppov=" & SmartStringFormatter("", vGetString) & ")>0") = 0 Then
							End If
						End If
						Dim list22 As List
						list22.Initialize
						If cursorWrapper2.GetInt("limita") = 1 Then
						End If
					End If
				End If
			Next
			If Not(vBln12) Then
				vBln12 = (Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where codint ='cou' ") > 0)
				If vBln12 Then
					Main.vSql1.ExecNonQuery("delete from Ventmp where codint ='cou' ")
					Dim vObjectToCharSequence As Object = "Attenzione ..." & CRLF & "Non si è attivata nessuna ricompensa." & CRLF & "Rendere al cliente i coupon inseriti."
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				End If
			Else
				If Main.vSql1.ExecQuerySingleResult("select count(*) from Ventmp where codint ='cou'") > 0 Then
					Dim cursorWrapper3 As Cursor
					Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select chiave,memo,codice from Ventmp where codint ='cou'")
					Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
					Dim i4 As Int
					For i4 = 0 To rowCount2
						cursorWrapper4.Position = i4
						Dim vGetString2 As String = cursorWrapper4.GetString("memo")
						If vGetString2.StartsWith(Main.v_prefissocoupon) And Not(vGetString2.EndsWith("(V)")) Then
							Main.vSql1.ExecNonQuery("update Ventmp set memo = 'NON NECESSARIO (" & vGetString2 & ")' WHERE chiave = " & cursorWrapper4.GetString("chiave"))
						Else If vGetString2.EndsWith("(V)") Then
							vLst2.Add(vGetString2.Replace("(V)", ""))
						End If
					Next
					cursorWrapper4.Close
					Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select count(*) from Ventmp where codint ='cou' and SUBSTR(memo,1,14) ='NON NECESSARIO'")
					If parseDouble > 0 Then
						Dim vObjectToCharSequence3 As Object = "Attenzione ..." & CRLF & "Sono stati inseriti " & SmartStringFormatter("", parseDouble) & " coupon non necessari." & CRLF & "Verificare nella griglia quali coupon rendere al cliente."
						Dim vObjectToCharSequence4 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					End If
				End If
			End If
			If vBln12 Then
				If Main.vSql1.ExecQuerySingleResult("select count(*) from Ventmp where importo<0 and scov>0 and flgusointerno=0") > 0 Then
					Main.vSql1.ExecNonQuery("update Ventmp set importo=0,scov=round(prezzov*qta,2),scop=100  where importo<0 and scov>0 and flgusointerno=0")
				End If
			End If
			CallSub2(Main, "RefillTableList", True)
			Dim vTmp As String = modfunstr.Sub004(20)
			Main.vccefdll1.mf_display(vTmp, "TOTALE" & modfunstr.Sub003(modfunstr.Sub004(14) & NumberFormat2(Main.vDbl1, 1, 2, 2, False), 14))
		End If
		cursorWrapper2.Close
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub150
	Dim cursorWrapper As Cursor
	Dim i As Int = -2
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from headmov where sospeso=0") <= 0 Then
		Dim i2 As Int = -3
		Do While True
			If i2 = -1 Then
				Exit
			End If
			If i2 = -2 Then
				Exit
			End If
			Dim vObjectToCharSequence As Object = "Confermi il ricalcolo delle giacenze ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			i2 = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		Loop
		If i2 = -1 Then
			ProgressDialogShow("Elaborazione in corso ...")
			DoEvents
			Try
				Main.vSql1.BeginTransaction
				Main.vSql1.ExecNonQuery("update anagra set giac = 0 where flgusointerno=0 and flgmag =1")
				Dim cursorWrapper2 As Cursor
				Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("select codint,distinta from anagra where flgusointerno=0 and flgmag =1")
				If cursorWrapper3.RowCount > 0 Then
					Dim rowCount As Int = cursorWrapper3.RowCount - 1
					Dim i3 As Int
					For i3 = 0 To rowCount
						cursorWrapper3.Position = i3
						Dim cursorWrapper4 As Cursor
						Dim cursorWrapper5 As Cursor = Main.vSql2.ExecQuery("select qta,causale,nmov,codint from venduto where brep=0 and codint = '" & cursorWrapper3.GetString("codint") & "' order by datam3 asc,nmov asc")
						If cursorWrapper5.RowCount > 0 Then
							Dim cursorWrapper6 As Cursor
							Dim rowCount2 As Int = cursorWrapper5.RowCount - 1
							Dim cursorWrapper7 As Cursor = cursorWrapper6
							Dim i4 As Int
							For i4 = 0 To rowCount2
								cursorWrapper5.Position = i4
								Dim vGetString As String = cursorWrapper5.GetString("qta")
								If cursorWrapper5.GetString("causale") = "in" Then
									vGetString = Main.vSql2.ExecQuerySingleResult("Select sum(qta) from Venduto  where brep=0 and  nmov=" & cursorWrapper5.GetString("nmov") & " and codint ='" & cursorWrapper5.GetString("codint") & "'")
								End If
								Main.vSql1.ExecNonQuery("update anagra set " & Sub104(vGetString, cursorWrapper5.GetString("causale")) & " where codint ='" & cursorWrapper3.GetString("codint") & "'")
								If cursorWrapper3.GetInt("distinta") = 1 And cursorWrapper5.GetString("causale") <> "in" Then
									If i4 = 0 Then
										Dim cursorWrapper8 As Cursor
										cursorWrapper = Main.vSql1.ExecQuery("Select * from distintabase where codint = '" & cursorWrapper3.GetString("codint") & "'")
									Else
										cursorWrapper = cursorWrapper7
									End If
									If cursorWrapper.RowCount > 0 Then
										Dim rowCount3 As Int = cursorWrapper.RowCount - 1
										Dim i5 As Int
										For i5 = 0 To rowCount3
											cursorWrapper.Position = i5
											Dim replace As String = NumberFormat2(cursorWrapper.GetDouble("qta") * cursorWrapper5.GetDouble("qta"), 1, 3, 3, False).Replace(",", ".")
											Main.vSql1.ExecNonQuery("update anagra set " & Sub104(replace, cursorWrapper5.GetString("causale")) & " where codint ='" & cursorWrapper.GetString("codintpadre") & "'")
										Next
									End If
									cursorWrapper7 = cursorWrapper
								End If
							Next
						End If
						cursorWrapper5.Close
						If i3 Mod 100 = 0 Then
							DoEvents
						End If
					Next
				End If
				cursorWrapper3.Close
				ProgressDialogHide
				Main.vSql1.TransactionSuccessful
				Main.vSql1.EndTransaction
				Dim vObjectToCharSequence3 As Object = "Procedura ultimata correttamente."
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			Catch
				Sub217(LastException.Message)
				Main.vSql1.EndTransaction
			End Try
		End If
		Return
	End If
	Do While True
		If i <> -1 Then
			Dim vObjectToCharSequence5 As Object = "Attenzione.. " & CRLF & "Per eseguire il ricalcolo giacenze è necessario eseguire una Chiusura Giornaliera"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			i = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		Else
			Return
		End If
	Loop
End Sub

Sub Sub151(str As String, i As Int)
	Dim i2 As Int = 0
	If vMap3.ContainsKey(str) Then
		i2 = vMap3.Get(str)
	End If
	vMap3.Put(str, i2 + i)
End Sub

Sub Sub152(str As String, i As Int)
	Dim i2 As Int = 0
	If vMap4.ContainsKey(str) Then
		i2 = vMap4.Get(str)
	End If
	vMap4.Put(str, i2 + i)
End Sub

Sub Sub153(str As String, i As Int, ckprinterVar As ckprinter)
	If Main.vBln30 Then
		Main.vccefdll1.ft_testo(str, i)
		Return
	End If
	If Main.v_stampafattura < 19 And ckprinterVar.IsInitialized Then
		ckprinterVar.doc_testostile(False, True, i <> 1, False, False, False, False, "")
		ckprinterVar.doc_testostampa(str)
		Return
	End If
End Sub

Sub Sub154(z As Boolean)
	If z = Sub090() Then
		Return
	End If
	Dim reflection As Reflector
	If Not( = Null) Then
		 = 
	End If
	reflection.Target = reflection.GetContext
	reflection.RunStaticMethod("android.provider.Settings$System", "putInt", Array(reflection.RunMethod("getContentResolver"), "airplane_mode_on", IIf(z, 1, 0)), Array As String("android.content.ContentResolver", "java.lang.String", "java.lang.int"))
	Dim intentWrapper As Intent
	intentWrapper.Initialize("android.intent.action.AIRPLANE_MODE", "")
	intentWrapper.PutExtra("state", "" & z)
	Phone.SendBroadcastIntent(intentWrapper)
End Sub

Sub Sub155(i As Int, i2 As Int) As StateListDrawable
	Dim hsb_to_color As Int
	Dim iArr(4) As Int
	Dim z As Boolean = Main.v_tema2 And vStr1 = "Main"
	If i = -16711936 Then
		i = Colors.RGB(45, 130, 69)
	End If
	If Not(z) Then
		If vBln6 Then
			iArr(0) = i
			iArr(1) = i
			iArr(2) = i
			iArr(3) = -7829368
		Else
			Dim iArr2(0) As Int
			Dim vTmp() As Int = colorsroutine.Sub001(i)
			Dim dArr(0) As Double
			Dim rgb_to_hsb() As Double = colorsroutine.rgb_to_hsb(vTmp(1), vTmp(2), vTmp(3))
			If rgb_to_hsb(1) <> 0 Then
				hsb_to_color = colorsroutine.hsb_to_color(rgb_to_hsb(0), rgb_to_hsb(1) / 3, rgb_to_hsb(2))
			Else
				Dim d As Double = 2 * rgb_to_hsb(2)
				If d > 100 Then
					d = 100
				End If
				hsb_to_color = colorsroutine.hsb_to_color(rgb_to_hsb(0), rgb_to_hsb(1), d)
			End If
			Dim hsb_to_color2 As Int = colorsroutine.hsb_to_color(rgb_to_hsb(0), rgb_to_hsb(1), rgb_to_hsb(2) / 2)
			iArr(0) = hsb_to_color
			iArr(1) = i
			iArr(2) = i
			iArr(3) = hsb_to_color2
		End If
	End If
	Dim stateListDrawable As StateListDrawable
	Dim iArr3(3) As Int
	If Not(z) Then
		If vBln6 Then
			iArr3(0) = i
			iArr3(1) = Colors.RGB(0, 0, 0)
			iArr3(2) = i
		Else
			iArr3(0) = iArr(2)
			iArr3(1) = iArr(2)
			iArr3(2) = iArr(2)
		End If
	End If
	Dim gradientDrawable As GradientDrawable
	Dim colorDrawable As ColorDrawable
	Dim gradientDrawable2 As GradientDrawable
	Dim colorDrawable2 As ColorDrawable
	If Not(z) Then
		gradientDrawable2.Initialize("TOP_BOTTOM", iArr)
		gradientDrawable2.CornerRadius = i2
		gradientDrawable.Initialize("TOP_BOTTOM", iArr3)
		gradientDrawable.CornerRadius = i2
		stateListDrawable.Initialize
		stateListDrawable.AddState2(Array As Int(16842910, -16842919), gradientDrawable2)
		vBln6 = False
		stateListDrawable.AddState2(Array As Int(16842919), gradientDrawable)
	Else
		If vBln7 Then
			colorDrawable2.Initialize2(-16777216, i2, 3, -16777216)
		Else
			colorDrawable2.Initialize2(i, i2, 3, -1)
		End If
		If i = -1 Then
			colorDrawable.Initialize2(-7829368, i2, 3, i)
		Else
			colorDrawable.Initialize2(-1, i2, 3, i)
		End If
		stateListDrawable.Initialize
		stateListDrawable.AddState2(Array As Int(16842910, -16842919), colorDrawable2)
		vBln6 = False
		vBln7 = False
		stateListDrawable.AddState2(Array As Int(16842919), colorDrawable)
	End If
	Return stateListDrawable
End Sub

Sub Sub156(i As Int, i2 As Int, i3 As Int) As StateListDrawable
	If i = -16711936 Then
		i = Colors.RGB(45, 130, 69)
	End If
	Dim stateListDrawable As StateListDrawable
	Dim colorDrawable As ColorDrawable
	Dim colorDrawable2 As ColorDrawable
	If vBln7 Then
		colorDrawable2.Initialize2(-16777216, i2, i3, -16777216)
	Else
		colorDrawable2.Initialize2(i, i2, i3, -1)
	End If
	If i = -1 Then
		colorDrawable.Initialize2(-7829368, i2, i3, i)
	Else
		colorDrawable.Initialize2(-1, i2, i3, i)
	End If
	stateListDrawable.Initialize
	stateListDrawable.AddState2(Array As Int(16842910, -16842919), colorDrawable2)
	vBln6 = False
	vBln7 = False
	stateListDrawable.AddState2(Array As Int(16842919), colorDrawable)
	Return stateListDrawable
End Sub

Sub Sub157(i As Int, i2 As Int, i3 As Int) As StateListDrawable
	If i = -16711936 Then
		i = Colors.RGB(45, 130, 69)
	End If
	Dim stateListDrawable As StateListDrawable
	Dim colorDrawable As ColorDrawable
	Dim colorDrawable2 As ColorDrawable
	colorDrawable2.Initialize2(i, i2, i3, -16777216)
	colorDrawable.Initialize2(-7829368, i2, i3, i)
	stateListDrawable.Initialize
	stateListDrawable.AddState2(Array As Int(16842910, -16842919), colorDrawable2)
	stateListDrawable.AddState2(Array As Int(16842919), colorDrawable)
	Return stateListDrawable
End Sub

Sub Sub158(i As Int, i2 As Int) As StateListDrawable
	Dim iArr(2) As Int
	If Not(Main.v_tema2) And vStr1 = "Main" Then
		i2 = i
	End If
	iArr(0) = i
	iArr(1) = i2
	Dim stateListDrawable As StateListDrawable
	Dim gradientDrawable As GradientDrawable
	gradientDrawable.Initialize("TOP_BOTTOM", iArr)
	gradientDrawable.CornerRadius = 0
	Dim gradientDrawable2 As GradientDrawable
	gradientDrawable2.Initialize("TOP_BOTTOM", Array As Int(i, -16777216))
	gradientDrawable2.CornerRadius = 0
	stateListDrawable.Initialize
	stateListDrawable.AddState2(Array As Int(16842910, -16842919), gradientDrawable)
	stateListDrawable.AddState2(Array As Int(16842919), gradientDrawable2)
	Return stateListDrawable
End Sub

Sub Sub159(i As Int, labelWrapper As Label) As Int
	Dim i2 As Int
	Dim i3 As Int
	Dim i4 As Int = -16776961
	labelWrapper.TextColor = -1
	If i = 14 Then
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = Sub155(-3355444, 50)
		labelWrapper.Gravity = Bit.Or(16, 17)
		Return -3355444
	End If
	Dim i5 As Int = i Mod 14
	If i5 <= 0 Or i5 >= 15 Then
		i2 = i5
	Else
		Dim valueOf As Int = i5
		Select valueOf
			Case Main.c_rosso
				i4 = -65536
			Case Main.c_blu
				i4 = Colors.RGB(94, 169, 255)
			Case Main.c_verde
				i4 = -16711936
			Case Main.c_giallo
				i4 = -256
				labelWrapper.TextColor = -16777216
			Case Main.c_arancione
				i4 = Colors.RGB(255, 153, 50)
			Case Main.c_bianco
				labelWrapper.TextColor = -16777216
				i4 = -1
			Case Main.c_grigio
				i4 = -7829368
				labelWrapper.TextColor = -16777216
			Case Main.c_marrone
				i4 = Colors.RGB(167, 25, 36)
			Case Main.c_azzurro
				i4 = -16711681
				labelWrapper.TextColor = -16777216
			Case Main.c_verdesmeraldo
				i4 = Colors.RGB(0, 255, 89)
			Case Main.c_verdechiaro
				i4 = Colors.RGB(178, 255, 102)
				labelWrapper.TextColor = -16777216
			Case Main.c_viola
				i4 = Colors.RGB(178, 0, 255)
			Case Main.c_rosa
				i4 = Colors.RGB(255, 127, 237)
			Case Main.c_nero
				i4 = Colors.RGB(0, 0, 0)
		End Select
		i2 = i4
	End If
	labelWrapper.Background = Sub155(i2, 50)
	Dim textColor As Int = labelWrapper.TextColor
	If textColor = -1 Then
		Dim concreteViewWrapper As View = labelWrapper
		Sub176(concreteViewWrapper, 1, 2, 2, -16777216)
	Else
		Dim concreteViewWrapper2 As View = labelWrapper
		If i5 = Main.c_bianco Then
			i3 = -7829368
		Else
			i3 = -1
		End If
		Sub176(concreteViewWrapper2, 1, 2, 2, i3)
	End If
	labelWrapper.Gravity = Bit.Or(16, 17)
	Return i2
End Sub

Sub Sub160(i As Int, i2 As Int, labelWrapper As Label, z As Boolean)
	Dim textColor As Int = labelWrapper.TextColor
	If z Then
		If textColor <> -1 Then
			textColor = -7829368
		End If
	Else
		textColor = -1
	End If
	If i = textColor Then
		i = -1
	End If
	labelWrapper.TextColor = i
	Dim stateListDrawable As StateListDrawable
	Dim colorDrawable As ColorDrawable
	Dim colorDrawable2 As ColorDrawable
	colorDrawable2.Initialize2(textColor, i2, 3, -16777216)
	colorDrawable.Initialize2(-1, i2, 3, textColor)
	stateListDrawable.Initialize
	stateListDrawable.AddState2(Array As Int(16842910, -16842919), colorDrawable2)
	vBln6 = False
	vBln7 = False
	stateListDrawable.AddState2(Array As Int(16842919), colorDrawable)
	labelWrapper.Background = stateListDrawable
End Sub

Sub Sub161(concreteViewWrapper As View, f As Float)
	If Main.vInt9 >= 21 Then
		concreteViewWrapper.RunMethod("setElevation", Array(f))
		Return
	End If
	If f >= 5 Then
		concreteViewWrapper.BringToFront
		Return
	End If
	concreteViewWrapper.SendToBack
End Sub

Sub Sub162
	Try
	Catch
		Sub217(LastException.Message)
	End Try
	If Main.v_gestionespiagge Then
		Sub163()
		Main.vBln41 = False
		Return
	End If
	Main.vBln42 = False
	vStr2 = "Public Sub SetExistPrenota"
	Dim vTmp As Long = Sub058()
	Dim periodVar As Period
	periodVar.Days = 1
	Dim periodVar2 As Period
	periodVar2.Minutes = -20
	Dim addperiod As Long = DateUtils.addperiod(vTmp, periodVar)
	Dim addperiod2 As Long = DateUtils.addperiod(vTmp, periodVar2)
	Main.vBln41 = (Main.vSql1.ExecQuerySingleResult("Select count(*) from tavoli inner join Prenota on prenota.tavolo =tavoli.tavolo where  data > '" & NumberFormat2(DateTime.GetYear(addperiod2), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetMonth(addperiod2), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetDayOfMonth(addperiod2), 2, 0, 0, False) & " " & NumberFormat2(DateTime.GetHour(addperiod2), 2, 0, 0, False) & ":" & NumberFormat2(DateTime.GetMinute(addperiod2), 2, 0, 0, False) & ":00' and data < '" & NumberFormat2(DateTime.GetYear(addperiod), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetMonth(addperiod), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetDayOfMonth(addperiod), 2, 0, 0, False) & " 00:00:00" & "'") > 0)
	If Main.vBln41 Then
		Main.vMap7.Initialize
		Dim cursorWrapper As Cursor
		Main.vCur11 = Main.vSql1.ExecQuery("Select Prenota.memo,Prenota.data,Prenota.sedie,tavoli.tavolo  from tavoli inner join Prenota on prenota.tavolo =tavoli.tavolo where  data > '" & NumberFormat2(DateTime.GetYear(addperiod2), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetMonth(addperiod2), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetDayOfMonth(addperiod2), 2, 0, 0, False) & " " & NumberFormat2(DateTime.GetHour(addperiod2), 2, 0, 0, False) & ":" & NumberFormat2(DateTime.GetMinute(addperiod2), 2, 0, 0, False) & ":00' and data < '" & NumberFormat2(DateTime.GetYear(addperiod), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetMonth(addperiod), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetDayOfMonth(addperiod), 2, 0, 0, False) & " 00:00:00" & "' order by tavoli.tavolo,data")
		If Main.vCur11.RowCount > 0 Then
			Dim str As String = ""
			Dim rowCount As Int = Main.vCur11.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				Main.vCur11.Position = i
				If str <> Main.vCur11.GetString("tavolo") Then
					str = Main.vCur11.GetString("tavolo")
					Main.vMap7.Put(Main.vCur11.GetString("tavolo"), i)
				End If
			Next
		Else
			Main.vBln41 = False
		End If
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m0… (riga 14815).
Sub Sub163
	Dim z As Boolean
	Try
		vStr2 = "Public Sub SetExistPrenotaRisorse"
		Dim vTmp As Long = Sub058()
		Dim vGetYear As Int = DateTime.GetYear(vTmp)
		Dim vGetMonth As Int = DateTime.GetMonth(vTmp)
		Dim setdate As Long = DateUtils.setdate(vGetYear, vGetMonth, DateTime.GetDayOfMonth(vTmp))
		Dim str As String = "where DataInizio <= " & setdate & " And DataFine >=" & setdate
		If Main.v_gestionespiagge Then
			If Main.vSql2.ExecQuerySingleResult("Select count(*) from PrenotaRisorsa " & str) > 0 Then
				z = True
				Main.vBln42 = z
				If Not(Main.vBln42) Then
					Main.vMap8.Initialize
					If Main.vCur12.IsInitialized Then
						Main.vCur12.Close
					End If
					Dim cursorWrapper As Cursor
					Main.vCur12 = Main.vSql2.ExecQuery("Select *  from PrenotaRisorsa " & str)
					If Main.vCur12.RowCount > 0 Then
						Dim rowCount As Int = Main.vCur12.RowCount - 1
						Dim i As Int
						For i = 0 To rowCount
							Main.vCur12.Position = i
							Main.vMap8.Put(Main.vCur12.GetString("ID"), i)
						Next
						Return
					End If
					Main.vBln42 = False
					Return
				End If
				Return
			End If
		End If
		z = False
		Main.vBln42 = z
		If Not(Main.vBln42) Then
		End If
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub164(labelWrapper As Label, i As Int)
	If Not(Main.v_tema2) Then
		Dim stateListDrawable As StateListDrawable
		Dim colorDrawable As ColorDrawable
		Dim colorDrawable2 As ColorDrawable
		colorDrawable2.Initialize2(i, 0, 1, -1)
		colorDrawable.Initialize2(-7829368, 0, 1, i)
		stateListDrawable.Initialize
		stateListDrawable.AddState2(Array As Int(16842910, -16842919), colorDrawable2)
		stateListDrawable.AddState2(Array As Int(16842919), colorDrawable)
		labelWrapper.Background = stateListDrawable
		Return
	End If
	labelWrapper.Background = Sub155(i, 0)
End Sub

Sub Sub165(concreteViewWrapper As View)
	Dim reflection As Reflector
	reflection.Target = concreteViewWrapper
	Dim objArr(4) As Object
	Dim i As Int
	For i = 0 To objArr.Length - 1
		objArr(i) = Null
	Next
	Dim strArr() As String = Array("java.lang.int", "java.lang.int", "java.lang.int", "java.lang.int")
	objArr(0) = DipToCurrent(2)
	objArr(1) = DipToCurrent(2)
	objArr(2) = DipToCurrent(2)
	objArr(3) = DipToCurrent(2)
	reflection.RunMethod4("setPadding", objArr, strArr)
End Sub

Sub Sub166(concreteViewWrapper As View)
	Dim reflection As Reflector
	reflection.Target = concreteViewWrapper
	Dim objArr(4) As Object
	Dim i As Int
	For i = 0 To objArr.Length - 1
		objArr(i) = Null
	Next
	Dim strArr() As String = Array("java.lang.int", "java.lang.int", "java.lang.int", "java.lang.int")
	objArr(0) = DipToCurrent(100)
	objArr(1) = DipToCurrent(2)
	objArr(2) = DipToCurrent(2)
	objArr(3) = DipToCurrent(2)
	reflection.RunMethod4("setPadding", objArr, strArr)
End Sub

Sub Sub167(concreteViewWrapper As View)
	If Main.v_tema2 Then
		Return
	End If
	Dim reflection As Reflector
	reflection.Target = concreteViewWrapper
	Dim objArr(4) As Object
	Dim i As Int
	For i = 0 To objArr.Length - 1
		objArr(i) = Null
	Next
	Dim strArr(4) As String
	If Main.v_temag = 0 Then
		objArr(0) = DipToCurrent(3)
		objArr(1) = DipToCurrent(2)
		objArr(2) = DipToCurrent(7)
		objArr(3) = DipToCurrent(7)
	Else
		If Main.v_temag = 1 Then
			objArr(0) = DipToCurrent(8)
			objArr(1) = DipToCurrent(11)
			objArr(2) = DipToCurrent(17)
			objArr(3) = DipToCurrent(14)
		Else
			If Main.v_temag = 2 Then
				objArr(0) = DipToCurrent(7)
				objArr(1) = DipToCurrent(11)
				objArr(2) = DipToCurrent(12)
				objArr(3) = DipToCurrent(14)
			Else
				If Main.v_temag = 3 Then
					objArr(0) = DipToCurrent(9)
					objArr(1) = DipToCurrent(33)
					objArr(2) = DipToCurrent(9)
					objArr(3) = DipToCurrent(5)
				Else
					If Main.v_temag <> 4 Then
						If Main.v_temag <> 5 Then
							If Main.v_temag = 6 Then
								objArr(0) = DipToCurrent(6)
								objArr(1) = DipToCurrent(6)
								objArr(2) = DipToCurrent(11)
								objArr(3) = DipToCurrent(10)
							End If
						End If
					End If
					objArr(0) = DipToCurrent(9)
					objArr(1) = DipToCurrent(11)
					objArr(2) = DipToCurrent(10)
					objArr(3) = DipToCurrent(10)
				End If
			End If
		End If
	End If
	strArr(0) = "java.lang.int"
	strArr(1) = "java.lang.int"
	strArr(2) = "java.lang.int"
	strArr(3) = "java.lang.int"
	reflection.RunMethod4("setPadding", objArr, strArr)
End Sub

Sub Sub168(concreteViewWrapper As View, i As Int, i2 As Int, i3 As Int, i4 As Int)
	Dim reflection As Reflector
	reflection.Target = concreteViewWrapper
	Dim objArr(4) As Object
	Dim i5 As Int
	For i5 = 0 To objArr.Length - 1
		objArr(i5) = Null
	Next
	Dim strArr() As String = Array("java.lang.int", "java.lang.int", "java.lang.int", "java.lang.int")
	objArr(0) = i
	objArr(1) = i2
	objArr(2) = i3
	objArr(3) = i4
	reflection.RunMethod4("setPadding", objArr, strArr)
End Sub

Sub Sub169(concreteViewWrapper As View)
	Dim reflection As Reflector
	reflection.Target = concreteViewWrapper
	Dim objArr(4) As Object
	Dim i As Int
	For i = 0 To objArr.Length - 1
		objArr(i) = Null
	Next
	Dim strArr() As String = Array("java.lang.int", "java.lang.int", "java.lang.int", "java.lang.int")
	objArr(0) = DipToCurrent(4)
	objArr(1) = DipToCurrent(2)
	objArr(2) = DipToCurrent(4)
	objArr(3) = DipToCurrent(2)
	reflection.RunMethod4("setPadding", objArr, strArr)
End Sub

Sub Sub170(str As String, buttonWrapper As Button, str2 As String) As String
	If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where timelast <> timein and tavolo =" & str) > 0 Then
		Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select timelast from tavoli where tavolo =" & str)
		If vExecQuerySingleResult.Length > 15 Then
			Dim setdateandtime As Long = DateUtils.setdateandtime(vExecQuerySingleResult.SubString2(0, 4), vExecQuerySingleResult.SubString2(5, 7), vExecQuerySingleResult.SubString2(8, 10), vExecQuerySingleResult.SubString2(11, 13), vExecQuerySingleResult.SubString2(14, 16), 0)
			Dim periodVar As Period
			periodVar.Hours = -1
			Dim addperiod As Long = DateUtils.addperiod(setdateandtime, periodVar)
			Dim periodbetweenindays As Period = DateUtils.periodbetweenindays(addperiod, Sub058())
			If buttonWrapper = Null Then
				Return str2 & periodbetweenindays.Minutes + (periodbetweenindays.Hours - 1) * 60 & " minuti" & CRLF & buttonWrapper.Text
			End If
			buttonWrapper.Text = str2 & periodbetweenindays.Minutes + (periodbetweenindays.Hours - 1) * 60 & " minuti" & CRLF & buttonWrapper.Text
		End If
	End If
	Return ""
End Sub

Sub Sub171(buttonWrapper As Button, i As Int)
	Dim stateListDrawable As StateListDrawable
	stateListDrawable.Initialize
	stateListDrawable.AddState(16842919, r2(i).RunMethod2("getDrawable", vIntArr2(i), "java.lang.int"))
	stateListDrawable.AddCatchAllState(r2(i).RunMethod2("getDrawable", vIntArr1(i), "java.lang.int"))
	buttonWrapper.Background = stateListDrawable
End Sub

Sub Sub172(concreteViewWrapper As View, str As String)
	Dim reflection As Reflector
	Dim vObjectToNumber As Int = reflection.GetStaticField(reflection.GetStaticField("anywheresoftware.b4a.BA", "packageName") & ".R$drawable", str)
	If Not( = Null) Then
		 = 
	End If
	reflection.Target = reflection.GetContext
	reflection.Target = reflection.RunMethod("getResources")
	concreteViewWrapper.Background = reflection.RunMethod2("getDrawable", vObjectToNumber, "java.lang.int")
End Sub

Sub Sub173(labelWrapper As Label)
	If Main.v_tastiera <> 0 Then
		If Main.v_tastiera <> 2 Then
			labelWrapper.Gravity = Bit.Or(16, 1)
			Return
		End If
	End If
	labelWrapper.Gravity = Bit.Or(16, 3)
	Sub166(labelWrapper)
End Sub

Sub Sub174(str As String, str2 As String, str3 As String, i As Int)
	Dim str4 As String
	Try
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPRicompense where codice ='" & str & "' and CodiceCondizione='" & str2 & "'") > 0 Then
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from MPRicompense where codice ='" & str & "' and CodiceCondizione='" & str2 & "' order by Priorita")
			If cursorWrapper2.RowCount > 0 Then
				Dim map As Map
				map.Initialize
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount
					cursorWrapper2.Position = i2
					Dim vGetString As String = cursorWrapper2.GetString("GruppoOrdinamentoRicompensa")
					If map.GetDefault(vGetString, 0) > 0 Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPRicompenseGruppi where codice ='" & str & "' and CodiceCondizione='" & str2 & "' and CodiceGruppoRicompensa='" & vGetString & "'") > 0 Then
							If map.GetDefault(vGetString, 0) >= Main.vSql1.ExecQuerySingleResult("Select NumeroRicompenseGruppo from MPRicompenseGruppi where codice ='" & str & "' and CodiceCondizione='" & str2 & "' and CodiceGruppoRicompensa='" & vGetString & "' limit 1") Then
								Continue
							End If
						End If
					End If
					Select cursorWrapper2.GetString("VeriabileRicompensa")
						Case "ART"
							Dim vGetString2 As String = cursorWrapper2.GetString("ElementoRicompensa")
							If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPMixArticoli" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " where  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", str) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", str2) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceArticolo='" & SmartStringFormatter("", vGetString2) & "'") <= 0 Then
								str4 = ""
							Else
								str4 = Main.vSql1.ExecQuerySingleResult("Select MixCode from MPMixArticoli where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", str) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", str2) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceArticolo='" & SmartStringFormatter("", vGetString2) & "'")
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where mixcode=" & SmartStringFormatter("", str4) & "") > 0 Then
									Return
								End If
								Dim cursorWrapper3 As Cursor
								Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select CodiceArticolo,MixCode from MPMixArticoli" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", str) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", str2) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "MixCode='" & SmartStringFormatter("", str4) & "'")
								Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
								Dim i3 As Int
								For i3 = 0 To rowCount2
									cursorWrapper4.Position = i3
									Main.vSql1.ExecNonQuery("update Ventmp set mixcode = '" & str4 & "' where codint ='" & cursorWrapper4.GetString("CodiceArticolo") & "'")
								Next
							End If
							If str4 <> "" Then
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where mixcode ='" & str4 & "'") = 0 Then
								End If
							End If
							If str4 = "" Then
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where codint ='" & vGetString2 & "'") = 0 Then
								End If
							End If
							Dim str5 As String = "codint ='" & vGetString2 & "'"
							If str4 <> "" Then
								str5 = "mixcode ='" & str4 & "'"
							End If
							Dim str6 As String = str5 & " and noscontoF=0 "
							If str3 = "1" Then
								str6 = str6 & " and flgNF=0 "
							End If
							If Sub016(cursorWrapper2, str6, i) Then
								map.Put(vGetString, map.GetDefault(vGetString, 0) + 1)
								vBln12 = True
							Else
							End If
						Case "REP", "GRP"
							Dim vGetString3 As String = cursorWrapper2.GetString("ElementoRicompensa")
							Dim str7 As String = "reparto =" & vGetString3 & " "
							If cursorWrapper2.GetString("VeriabileRicompensa") = "GRP" Then
								str7 = "(Select count(*) from anagra where" & TAB & "Ventmp.codint=anagra.codint And anagra.gruppov=" & SmartStringFormatter("", vGetString3) & ")>0 "
							End If
							Main.vStr5 = vGetString3
							Dim str8 As String = str7 & " and noscontoF=0 "
							If str3 = "1" Then
								str8 = str8 & " and flgNF=0 "
							End If
							If Sub016(cursorWrapper2, str8, i) Then
								map.Put(vGetString, map.GetDefault(vGetString, 0) + 1)
								vBln12 = True
							End If
							Main.vStr5 = ""
						Case "SCO"
							If Sub016(cursorWrapper2, "", 0) Then
								map.Put(vGetString, map.GetDefault(vGetString, 0) + 1)
								vBln12 = True
							Else
							End If
					End Select
				Next
				If vMap5.IsInitialized And vMap5.Size > 0 Then
					Dim size As Int = vMap5.Size - 1
					Dim i4 As Int
					For i4 = 0 To size
						Dim vObjectToString As String = vMap5.GetValueAt(i4)
						Dim vObjectToString2 As String = vMap5.GetKeyAt(i4)
						Dim substring As String = vObjectToString2.SubString2(0, vObjectToString2.IndexOf("_"))
						Dim str9 As String = ""
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPTitoloIniziative where codice = (select Codice from MPRicompense where  ElementoRicompensa ='" & vObjectToString & "' limit 1)") > 0 Then
							str9 = Main.vSql1.ExecQuerySingleResult("Select Descrizione from MPTitoloIniziative where codice = (select Codice from MPRicompense where  ElementoRicompensa ='" & vObjectToString & "' limit 1)")
						End If
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPMessaggiCliente where CodiceMsg='" & vObjectToString & "'") > 0 Then
							Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select MessaggioMsg from MPMessaggiCliente where CodiceMsg='" & vObjectToString & "'")
							If substring = "MO" Or substring = "mq" Then
								Dim cSBuilder As CSBuilder
								Dim vSize As CSBuilder = cSBuilder.Initialize.Size(24)
								vSize.Color(-65536).Append("Messaggio Fidelity").Append(CRLF).Pop
								cSBuilder.Size(20).Append(str9).Append(CRLF)
								cSBuilder.Size(16).Append(vExecQuerySingleResult).PopAll
								Dim vObjectToCharSequence As Object = cSBuilder
								Dim vObjectToCharSequence2 As Object = Main.vStr8
								Msgbox2Async(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1, True)
							End If
						End If
					Next
				End If
				Sub072()
				Sub073()
				vMap5.Initialize
				vMap4.Initialize
				vInt4 = 0
			End If
			cursorWrapper2.Close
		End If
		Return
	Catch
		Sub217(LastException.Message)
		Main.vStr5 = ""
		Return
	End Try
End Sub

Sub Sub175
	Try
		Select Main.v_tastiera
			Case 0
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenOrientation(1)
			Case 2
				Dim phone2 As Phone = Main.vPhone1
				Phone.SetScreenOrientation(9)
			Case 1
				Dim phone3 As Phone = Main.vPhone1
				Phone.SetScreenOrientation(0)
			Case 3
				Dim phone4 As Phone = Main.vPhone1
				Phone.SetScreenOrientation(8)
		End Select
		DoEvents
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub176(concreteViewWrapper As View, f As Float, f2 As Float, f3 As Float, i As Int)
	If Not(Main.v_tastiombreggiati) Then
		Return
	End If
	concreteViewWrapper.RunMethod("setShadowLayer", Array(f, f2, f3, i))
End Sub

Sub Sub177 As Boolean
	Return Main.vSql1.ExecQuerySingleResult("select count(*) from telefonate where telefono <>'Numero Nascosto' and accettata = 0") > 0
End Sub

Sub Sub178(i As Int)
	If i <= 0 Then
		Return
	End If
	If 1000 > 0 Then
		Dim semaphoreWrapper As Semaphore
		semaphoreWrapper.Initialize(True)
		semaphoreWrapper.WaitFor(1000 / 1000 * i)
		semaphoreWrapper.Unlock
		Return
	End If
End Sub

Sub Sub179(str As String, str2 As String)
	Initialize
	Dim str3 As String = vStr4 & "/Spooler"
	Dim vListFiles As List = File.ListFiles(str3)
	If vListFiles.Size > 0 Then
		vListFiles.Sort(True)
		Dim size As Int = vListFiles.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim vObjectToString As String = vListFiles.Get(i)
			If vObjectToString.Contains(str) And Not(vObjectToString.StartsWith("-PausaIp")) Then
				Sub147(str3, vObjectToString, str3, vObjectToString.Replace(str, str2))
			End If
		Next
		Return
	End If
End Sub

Sub stampa(str As String, list As List, cursorWrapper As Cursor, cursorWrapper2 As Cursor, str2 As String, map As Map)
	Dim z As Boolean
	Dim exc As Exception
	Dim z2 As Boolean
	Dim str3 As String
	Dim i As Int
	Dim str4 As String
	Dim str5 As String
	vStr2 = "Sub stampa"
	If Main.vccefdll1.vBln10 Then
		Return
	End If
	Try
		Dim z3 As Boolean = Main.v_stampa66char
		Dim z4 As Boolean = Main.v_stampareport > 0
		Main.vccefdll1.vBln7 = z4
		Try
			If str = "I2" Or str = "A" Or str = "R" Or str = "RG" Or str = "FC" Then
				Main.vccefdll1.nf_apri(Main.v_intestanf And map.GetDefault("StampaHeader", True))
				If z4 Then
					If Not(Main.vccefdll1.vBln7) Then
						ToastMessageShow("La stampante indicata per i report risulta essere non attiva o non funzionante.", True)
						Return
					End If
				End If
				Main.vccefdll1.nf_testo(str2, 4)
				If Not(z4) Then
					str3 = "------------------------------------------------------------------"
				Else
					str3 = "--------------------------------------------------------"
				End If
				If z3 Or z4 Then
					Main.vccefdll1.nf_testo(str3, 11)
				Else
					Main.vccefdll1.nf_testo(Main.vStr19, 1)
				End If
				If map.GetDefault("StampaFiltro", True) Then
					If list.Size > 0 Then
						Main.vccefdll1.nf_testo("Filtro: ", IIf(z3 Or z4, 3, 1))
						Dim size As Int = list.Size - 1
						Dim i2 As Int
						For i2 = 0 To size
							Dim trim As String = list.Get(i2).Trim
							If trim.Contains(" oppure ") Then
								Dim vSplit() As String = Regex.Split(" oppure ", trim)
								Dim length As Int = vSplit.Length - 1
								Dim i3 As Int = 0
								Do While i3 <= length
									Main.vccefdll1.nf_testo(vSplit(i3) & IIf(i3 <> vSplit.Length + 1, " oppure ", ""), IIf(z3 Or z4, 3, 1))
									i3 = i3 + 1
								Loop
							Else
								Main.vccefdll1.nf_testo(trim, IIf(z3 Or z4, 3, 1))
							End If
						Next
						If z3 Or z4 Then
							Main.vccefdll1.nf_testo(str3, 11)
						Else
							Main.vccefdll1.nf_testo(Main.vStr19, 1)
						End If
					Else If z3 Or z4 Then
						Main.vccefdll1.nf_testo("Filtro: Nessuno", 3)
						Main.vccefdll1.nf_testo(str3, 11)
					Else
						Main.vccefdll1.nf_testo("Filtro: Nessuno", 1)
						Main.vccefdll1.nf_testo(Main.vStr19, 1)
					End If
				End If
				If Not(z4) Then
					i = 38
				Else
					i = 28
				End If
				If z3 Or z4 Then
					If str = "RG" Then
						Main.vccefdll1.nf_testo(modfunstr.left(Sub095(map, "DESCRIZIONE", 1, i) & modfunstr.Sub004(i), i) & modfunstr.Sub003(modfunstr.Sub004(9) & Sub095(map, "GUADAGNO", 2, 9), 9) & modfunstr.Sub003(modfunstr.Sub004(9) & Sub095(map, "QTA", 3, 9), 9) & modfunstr.Sub003(modfunstr.Sub004(10) & Sub095(map, "IMPORTO", 4, 10), 10), 11)
					Else
						Main.vccefdll1.nf_testo(modfunstr.left(Sub095(map, "DESCRIZIONE", 1, i) & modfunstr.Sub004(i), i) & modfunstr.Sub003(modfunstr.Sub004(9) & Sub095(map, "SCONTI", 2, 9), 9) & modfunstr.Sub003(modfunstr.Sub004(9) & Sub095(map, "QTA", 3, 9), 9) & modfunstr.Sub003(modfunstr.Sub004(10) & Sub095(map, "IMPORTO", 4, 10), 10), 11)
					End If
					Main.vccefdll1.nf_testo(str3, 11)
				Else
					Dim vNumberToString As String = 1
					Dim sb11 As String = Sub095(map, "DESCRIZIONE", vNumberToString, Main.vInt31 + 23) & modfunstr.Sub004(Main.vInt31 + 23)
					Main.vccefdll1.nf_testo(modfunstr.left(sb11, Main.vInt31 + 23) & modfunstr.Sub003(modfunstr.Sub004(9) & Sub095(map, "IMPORTO", 2, 9), 9), 1)
					Main.vccefdll1.nf_testo(Main.vStr19, 1)
				End If
				Dim rowCount As Int = cursorWrapper.RowCount - 1
				Dim i4 As Int = 0
				Dim d As Double = 0
				Dim d2 As Double = 0
				Dim d3 As Double = 0
				Do While i4 <= rowCount
					cursorWrapper.Position = i4
					Dim vTmp As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("qta"), 1, 2, 2, False), 9)
					Dim vTmp_ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("sconto"), 1, 2, 2, False), 9)
					If cursorWrapper.GetDouble("qta") * 1000 Mod 1000 = 0 Then
						str5 = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("qta"), 1, 0, 0, False), 9)
					Else
						str5 = vTmp
					End If
					If str = "A" Or str = "C" Or str = "F" Or str = "FC" Or str = "MO" Then
						If z3 Or z4 Then
							Main.vccefdll1.nf_testo(modfunstr.left(cursorWrapper.GetString("descrizione").Trim & modfunstr.Sub004(i), i) & vTmp_ & str5 & modfunstr.Sub003(modfunstr.Sub004(10) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 10), 11)
						Else
							Dim sb19 As String = cursorWrapper.GetString("descrizione").Trim & modfunstr.Sub004(Main.vInt31 + 23)
							Main.vccefdll1.nf_testo(modfunstr.left(sb19, Main.vInt31 + 23) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9), 1)
						End If
					Else
						cursorWrapper2.Position = cursorWrapper.GetInt("codice")
						If z3 Or z4 Then
							Main.vccefdll1.nf_testo(modfunstr.left(cursorWrapper2.GetString("descrizione").Trim & modfunstr.Sub004(i), i) & vTmp_ & str5 & modfunstr.Sub003(modfunstr.Sub004(10) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 10), 11)
						Else
							Dim sb24 As String = cursorWrapper2.GetString("descrizione").Trim & modfunstr.Sub004(Main.vInt31 + 23)
							Main.vccefdll1.nf_testo(modfunstr.left(sb24, Main.vInt31 + 23) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9), 1)
						End If
					End If
					Dim vRound2 As Double = d3 + Round2(cursorWrapper.GetDouble("importo"), 2)
					Dim doubleValue As Double = d2 + cursorWrapper.GetDouble("qta")
					i4 = i4 + 1
					d = Round2(cursorWrapper.GetDouble("sconto"), 2) + d
					d2 = doubleValue
					d3 = vRound2
				Loop
				If z3 Or z4 Then
					Main.vccefdll1.nf_testo(str3, 11)
					Main.vccefdll1.nf_testo(str3, 11)
				Else
					Main.vccefdll1.nf_testo(Main.vStr19, 1)
					Main.vccefdll1.nf_testo(Main.vStr19, 1)
				End If
				If map.GetDefault("StampaTotali", True) Then
					Dim vTmp__ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d2, 1, 2, 2, False), 9)
					Dim vTmp___ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d, 1, 2, 2, False), 9)
					If 1000 * d2 Mod 1000 = 0 Then
						str4 = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d2, 1, 0, 0, False), 9)
					Else
						str4 = vTmp__
					End If
					If z3 Or z4 Then
						Main.vccefdll1.nf_testo(modfunstr.left("TOTALI" & modfunstr.Sub004(i), i) & vTmp___ & str4 & modfunstr.Sub003(modfunstr.Sub004(10) & NumberFormat2(d3, 1, 2, 2, False), 10), 11)
					Else
						Dim sb32 As String = modfunstr.Sub004(Main.vInt31 + 28) & NumberFormat2(d3, 1, 2, 2, False)
						Main.vccefdll1.nf_testo("TOT." & modfunstr.Sub003(sb32, Main.vInt31 + 28), 1)
					End If
				End If
				Main.vccefdll1.nf_testo(" ", 10)
				Main.vccefdll1.nf_testo("Op." & Main.Operatore & "  -  C." & Main.v_numcassa, 1)
				If z4 Then
					Main.vccefdll1.nf_testo(Sub061(Sub058()), 1)
				End If
				Main.vccefdll1.nf_chiudi
			Else
				Main.vccefdll1.nf_apri(Main.v_intestanf And map.GetDefault("StampaHeader", True))
				If z4 Then
					If Not(Main.vccefdll1.vBln7) Then
						ToastMessageShow("La stampante indicata per i report risulta essere non attiva o non funzionante.", True)
						Return
					End If
				End If
				Main.vccefdll1.nf_testo(str2, 4)
				Dim z5 As Boolean = IIf(z4, True, z3)
				If z5 Then
					Main.vccefdll1.nf_testo("------------------------------------------", 3)
				Else
					Main.vccefdll1.nf_testo(Main.vStr19, 1)
				End If
				If map.GetDefault("StampaFiltro", True) Then
					If list.Size > 0 Then
						If z5 Then
							Main.vccefdll1.nf_testo("Filtro: ", 3)
						Else
							Main.vccefdll1.nf_testo("Filtro: ", 1)
						End If
						Dim size2 As Int = list.Size - 1
						Dim i5 As Int
						For i5 = 0 To size2
							If z5 Then
								Main.vccefdll1.nf_testo(list.Get(i5), 3)
							Else
								Main.vccefdll1.nf_testo(list.Get(i5), 1)
							End If
						Next
						If z5 Then
							Main.vccefdll1.nf_testo("------------------------------------------", 3)
						Else
							Main.vccefdll1.nf_testo(Main.vStr19, 1)
						End If
					Else If z5 Then
						Main.vccefdll1.nf_testo("Filtro: Nessuno", 3)
						Main.vccefdll1.nf_testo("------------------------------------------", 3)
					Else
						Main.vccefdll1.nf_testo("Filtro: Nessuno", 1)
						Main.vccefdll1.nf_testo(Main.vStr19, 1)
					End If
				End If
				If z5 Then
					Main.vccefdll1.nf_testo(modfunstr.left(Sub095(map, "DESCRIZIONE", 1, 24) & modfunstr.Sub004(24), 24) & modfunstr.Sub003(modfunstr.Sub004(9) & Sub095(map, "QTA", 2, 9), 9) & modfunstr.Sub003(modfunstr.Sub004(9) & Sub095(map, "IMPORTO", 3, 9), 9), 3)
					Main.vccefdll1.nf_testo("------------------------------------------", 3)
				Else
					Dim vNumberToString2 As String = 1
					Dim sb38 As String = Sub095(map, "DESCRIZIONE", vNumberToString2, Main.vInt31 + 23) & modfunstr.Sub004(Main.vInt31 + 23)
					Main.vccefdll1.nf_testo(modfunstr.left(sb38, Main.vInt31 + 23) & modfunstr.Sub003(modfunstr.Sub004(9) & Sub095(map, "IMPORTO", 2, 9), 9), 1)
					Main.vccefdll1.nf_testo(Main.vStr19, 1)
				End If
				Dim rowCount2 As Int = cursorWrapper.RowCount - 1
				Dim d4 As Double = 0
				Dim d5 As Double = 0
				Dim i6 As Int
				For i6 = 0 To rowCount2
					cursorWrapper.Position = i6
					Dim vTmp____ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("qta"), 1, 2, 2, False), 9)
					If cursorWrapper.GetDouble("qta") * 1000 Mod 1000 = 0 Then
						vTmp____ = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("qta"), 1, 0, 0, False), 9)
					End If
					If str = "I" Then
						If z5 Then
							Main.vccefdll1.nf_testo(modfunstr.left(cursorWrapper.GetString("codice") & " " & cursorWrapper.GetString("descrizione").Trim & modfunstr.Sub004(24), 24) & vTmp____ & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9), 3)
						Else
							Dim sb45 As String = cursorWrapper.GetString("codice") & " " & cursorWrapper.GetString("descrizione").Trim & modfunstr.Sub004(Main.vInt31 + 23)
							Main.vccefdll1.nf_testo(modfunstr.left(sb45, Main.vInt31 + 23) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9), 1)
						End If
					Else If str = "O" Or str = "C" Or str = "F" Or str = "MO" Then
						If z5 Then
							Main.vccefdll1.nf_testo(modfunstr.left(cursorWrapper.GetString("descrizione").Trim & modfunstr.Sub004(24), 24) & vTmp____ & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9), 3)
						Else
							Dim sb50 As String = cursorWrapper.GetString("descrizione").Trim & modfunstr.Sub004(Main.vInt31 + 23)
							Main.vccefdll1.nf_testo(modfunstr.left(sb50, Main.vInt31 + 23) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9), 1)
						End If
					Else
						cursorWrapper2.Position = cursorWrapper.GetInt("codice")
						If z5 Then
							Main.vccefdll1.nf_testo(modfunstr.left(cursorWrapper2.GetString("descrizione").Trim & modfunstr.Sub004(24), 24) & vTmp____ & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9), 3)
						Else
							Dim sb55 As String = cursorWrapper2.GetString("descrizione").Trim & modfunstr.Sub004(Main.vInt31 + 23)
							Main.vccefdll1.nf_testo(modfunstr.left(sb55, Main.vInt31 + 23) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper.GetDouble("importo"), 1, 2, 2, False), 9), 1)
						End If
					End If
					Dim vRound22 As Double = d5 + Round2(cursorWrapper.GetDouble("importo"), 2)
					d4 = cursorWrapper.GetDouble("qta") + d4
					d5 = vRound22
				Next
				If z5 Then
					Main.vccefdll1.nf_testo("------------------------------------------", 3)
					Main.vccefdll1.nf_testo("------------------------------------------", 3)
				Else
					Main.vccefdll1.nf_testo(Main.vStr19, 1)
					Main.vccefdll1.nf_testo(Main.vStr19, 1)
				End If
				If map.GetDefault("StampaTotali", True) Then
					Dim vTmp_____ As String = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d4, 1, 2, 2, False), 9)
					If 1000 * d4 Mod 1000 = 0 Then
						vTmp_____ = modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d4, 1, 0, 0, False), 9)
					End If
					If z5 Then
						Main.vccefdll1.nf_testo(modfunstr.left("TOTALI" & modfunstr.Sub004(24), 24) & vTmp_____ & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d5, 1, 2, 2, False), 9), 3)
					Else
						Dim sb62 As String = modfunstr.Sub004(Main.vInt31 + 28) & NumberFormat2(d5, 1, 2, 2, False)
						Main.vccefdll1.nf_testo("TOT." & modfunstr.Sub003(sb62, Main.vInt31 + 28), 1)
					End If
				End If
				Main.vccefdll1.nf_testo("Op." & Main.Operatore & "     C." & Main.v_numcassa, 1)
				If z4 Then
					Main.vccefdll1.nf_testo(Sub061(Sub058()), 1)
				End If
				Main.vccefdll1.nf_chiudi
			End If
		Catch
			exc = e
			z = z2
			Sub217(LastException.Message)
			If z Then
				Main.vccefdll1.nf_chiudi
			End If
			Main.vccefdll1.vBln7 = False
			Return
		End Try
	Catch
		z = False
		exc = e2
	End Try
	Main.vccefdll1.vBln7 = False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m7… (riga 16027).
Sub Sub180(z As Boolean, z2 As Boolean, z3 As Boolean)
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim vTmp As ckprinter
	Dim i As Int
	Dim i2 As Int
	Dim z6 As Boolean
	Dim str As String
	Dim str2 As String
	Dim d As Double
	Dim i3 As Int
	Dim str3 As String
	Dim str4 As String
	Dim str5 As String
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor
	Dim z7 As Boolean
	Dim str6 As String
	Dim i4 As Int
	Dim z8 As Boolean
	Dim str7 As String
	Dim str8 As String
	Dim i5 As Int
	Dim i6 As Int
	Dim i7 As Int
	Dim vRound2 As Double
	Dim str9 As String
	Dim str10 As String
	Dim d2 As Double
	Dim str11 As String
	Dim str12 As String
	Dim str13 As String
	Dim i8 As Int
	Dim i9 As Int
	Dim str14 As String
	Dim z9 As Boolean
	Dim d3 As Double
	Dim d4 As Double
	Dim str15 As String
	Dim str16 As String
	Dim i10 As Int
	Dim str17 As String
	Dim z10 As Boolean
	Dim i11 As Int
	Dim z11 As Boolean
	Dim z12 As Boolean
	Dim z13 As Boolean
	Dim i12 As Int = 0
	Try
		Dim cursorWrapper3 As Cursor
		Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe order by codice")
		Dim str18 As String = ""
		Dim d5 As Double = 0
		Dim str19 As String = ""
		Dim z14 As Boolean = False
		Dim i13 As Int = -1
		If Main.v_turni Then
			vLst1.Initialize
		End If
		Dim rowCount As Int = cursorWrapper4.RowCount - 1
		Dim i14 As Int = 0
		Do While i14 <= rowCount
			cursorWrapper4.Position = i14
			Dim z15 As Boolean = cursorWrapper4.GetInt("espandi") = 1 And cursorWrapper4.GetInt("asporto") = 1
			If cursorWrapper4.GetInt("espandiT") = 1 And cursorWrapper4.GetInt("tavoli") = 1 Then
				If Not(Main.v_turni) Then
					If Not(Main.v_sottoconti) Then
						z4 = True
						If Main.vInt10 = 1 Then
							If cursorWrapper4.GetInt("stato") <> 1 Then
								If cursorWrapper4.GetInt("stato") = 0 Then
								End If
							End If
							If cursorWrapper4.GetInt("asporto") = 1 And cursorWrapper4.GetInt("mf") = 1 Then
								z5 = True
								If Not(z5) Or cursorWrapper4.GetInt("stato") = 1 Then
									If Main.vSql1.ExecQuerySingleResult("select count(*) from HeaddaStampare where codstampa = " & i14 + 1) = 0 Then
										If cursorWrapper4.GetInt("cp1") = 1 Or cursorWrapper4.GetInt("cp2") = 1 Then
											If Main.vSql1.ExecQuerySingleResult("Select count(*) from StampaCP where cp <>10 ") > 0 Then
												z13 = True
												If Not(z13) Then
													i3 = i13
													z6 = z14
													str = str19
													str2 = str18
													d = d5
												End If
											End If
										End If
										z13 = False
										If Not(z13) Then
										End If
									End If
									If cursorWrapper4.GetInt("mf") <> 1 Then
										Dim vGetInt As Int = IIf(cursorWrapper4.GetInt("indice") > 0, cursorWrapper4.GetInt("indice"), i14 + 1)
										If Main.vMap2.ContainsKey(vGetInt) Then
											vTmp = Sub102(Main.vMap2.Get(vGetInt))
										Else
											vTmp = Sub102(vGetInt)
										End If
										If Main.v_spooler Then
											If vTmp.vStr2 = "" Then
												vTmp.vStr2 = cursorWrapper4.GetString("descrizione")
											End If
											vTmp.vInt3 = vGetInt
										Else If Not(vTmp.vBln5) Then
											i3 = i13
											z6 = z14
											str = str19
											str2 = str18
											d = d5
										Else
											If Main.v_disconnettiprt And vTmp.vStr2 = "" Then
												vTmp.vStr2 = cursorWrapper4.GetString("descrizione")
											End If
											If Not(z2) And vTmp.vkprinterstatus1.InError Then
												Starter.v7.Interval = 1500
												i3 = i13
												z6 = z14
												str = str19
												str2 = str18
												d = d5
											Else
												Dim vTmp_ As String = Sub103(vTmp)
												i12 = 1
												If vTmp_.StartsWith("Errore") Then
													If Not(z2) Then
														Starter.v7.Interval = 1500
														i3 = i13
														z6 = z14
														str = str19
														str2 = str18
														d = d5
													Else
														Dim i15 As Int = -1
														Do While True
															If i15 <> -1 Then
																Exit
															End If
															i15 = -2
															i12 = 1
															If vTmp_.StartsWith("Errore") Then
																If Main.v_disconnettiprt Then
																	vTmp.Sub001
																End If
																i12 = 2
																cursorWrapper4.Position = i14
																Dim str20 As String = vTmp_ & CRLF & "Stampante  " & cursorWrapper4.GetString("descrizione") & CRLF & "Si desidera riprovare o considerare la stampante 'Guasta' ?"
																vBln8 = True
																If vStr1 = "" Then
																	ToastMessageShow(str20, True)
																	i12 = 1
																	Exit
																End If
																i15 = CallSub2(vStr1, "msgboxAct", str20)
																If i15 = -3 Then
																	i15 = -1
																End If
																If i15 <> -1 Then
																	If vStr1 <> "" Then
																		Dim vObjectToNumber As Int = CallSub2(vStr1, "ErrPrtAct", vGetInt)
																		If vObjectToNumber > 0 Then
																			Main.vMap2.Put(vGetInt, vObjectToNumber)
																			i12 = 1
																		End If
																	End If
																	If Main.v_errmail Then
																		If Main.v_md3 <> "" Then
																			Sub132("Errore Stampante", vSMTP1, str20, False)
																		End If
																	End If
																Else
																	vTmp_ = Sub103(vTmp)
																End If
															End If
														Loop
														vBln8 = False
														If Main.v_lognf And i12 = 2 Then
															vTmp.Sub003("Stampante impostata su GUASTA dall'utente", True)
														End If
														Main.vSql1.ExecNonQuery("update confstampe set stato = " & i12 & " where codice = " & cursorWrapper4.GetString("codice"))
														i = i12
													End If
												Else If vTmp_ <> "" Then
													ToastMessageShow("Stampante  " & cursorWrapper4.GetString("descrizione") & CRLF & vTmp_, True)
													i = 1
												End If
												If i <> 2 Then
													Dim cursorWrapper5 As Cursor
													If Main.v_turni Then
														Dim size As Int = vLst1.Size - 1
														Dim i16 As Int
														For i16 = 0 To size
															Main.vSql1.ExecNonQuery("delete from HeaddaStampare where id = '" & vLst1.Get(i16) & "'")
															Main.vSql1.ExecNonQuery("delete from daStampare where id = '" & vLst1.Get(i16) & "'")
														Next
													End If
													If Main.v_disconnettiprt Then
														vTmp.Sub001
													End If
													Return
												End If
												Dim vGetInt2 As Int = cursorWrapper4.GetInt("layout")
												Dim map As Map
												If vMap2.Size <= 0 Or Not(vMap2.ContainsKey(vGetInt2 + 1)) Then
													map.Initialize
												Else
													map = vMap2.Get(vGetInt2 + 1)
												End If
												Dim z16 As Boolean = cursorWrapper4.GetInt("GroupR") = 1
												Dim cursorWrapper6 As Cursor
												Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("select * from HeaddaStampare where codstampa = " & i14 + 1 & "  order by id asc")
												If cursorWrapper7.RowCount > 0 Then
													Dim rowCount2 As Int = cursorWrapper7.RowCount - 1
													Dim i17 As Int = 0
													Dim str21 As String = str18
													Dim str22 As String = str19
													Dim z17 As Boolean = z14
													Dim i18 As Int = i13
													Dim z18 As Boolean = z15
													Do While i17 <= rowCount2
														Dim z19 As Boolean = IIf(vGetInt2 = 10, False, z17)
														cursorWrapper7.Position = i17
														Dim str23 As String = ""
														If cursorWrapper4.GetInt("noturno") = 1 Then
															If Main.v_turni Then
																str23 = " and codint <>'Turno' "
															End If
														End If
														If cursorWrapper4.GetInt("datavolo") > 0 And cursorWrapper4.GetInt("atavolo") > 0 Then
															If Main.vSql1.ExecQuerySingleResult("Select case when max(tavolo) is null then 0 else max(tavolo) end from daStampare where id = '" & cursorWrapper7.GetString("id") & "' and qta <> 0 ") > 0 Then
																str23 = str23 & " and (tavolo >=" & SmartStringFormatter("", cursorWrapper4.GetInt("datavolo")) & " and tavolo <=" & SmartStringFormatter("", cursorWrapper4.GetInt("atavolo")) & ") "
															End If
														End If
														If Main.vSql1.ExecQuerySingleResult("select count(*) from daStampare where id = '" & cursorWrapper7.GetString("id") & "' and qta <> 0 " & str23) = 0 Then
															If Main.v_turni Then
																vLst1.Add(cursorWrapper7.GetString("id"))
																str6 = str22
																z7 = z18
																i4 = i18
																z8 = z19
																str7 = str21
															Else
																Main.vSql1.ExecNonQuery("delete from HeaddaStampare where id = '" & cursorWrapper7.GetString("id") & "'")
																Main.vSql1.ExecNonQuery("delete from daStampare where id = '" & cursorWrapper7.GetString("id") & "'")
																str6 = str22
																z7 = z18
																i4 = i18
																z8 = z19
																str7 = str21
															End If
														Else
															Dim z20 As Boolean = False
															Dim str24 As String = ""
															If cursorWrapper4.GetInt("consolida") = 1 And vGetInt2 <> 6 Then
																consolida(cursorWrapper7.GetString("id"))
															End If
															Dim str25 As String = IIf(vGetInt2 = 5, "case when lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww' then '1' else'0' end || case when substr(descrizione,4,1)='*' then '.' else (select substr(gruppovar.descrizione,1,3) from anagra inner join gruppovar on gruppovar.codice = anagra.gruppov where anagra.codint = daStampare.codint) end || descrizione asc", "codice asc")
															If vGetInt2 = 13 Or vGetInt2 = 22 Then
																str25 = "case when lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww' then '1' else'0' end || (select gruppovar.indice || gruppovar.descrizione from anagra inner join gruppovar on gruppovar.codice = anagra.gruppov where anagra.codint = daStampare.codint) || descrizione asc"
																If vGetInt2 = 13 Then
																	str3 = "case when lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww' then '1' else'0' end || (select gruppovar.indice || gruppovar.descrizione from anagra inner join gruppovar on gruppovar.codice = anagra.gruppov where anagra.codint = daStampare.codint) || descrizione asc"
																	str4 = ""
																	str5 = "*,(select gruppovar.descrizione from anagra inner join gruppovar on gruppovar.codice = anagra.gruppov where anagra.codint = daStampare.codint) as grpdes "
																	If Main.v_turni Then
																		If z16 Then
																			Try
																				Dim cursorWrapper8 As Cursor
																				cursorWrapper2 = Main.vSql1.ExecQuery("select " & str5 & " from daStampare where id = '" & cursorWrapper7.GetString("id") & "' order by (select indice from reparti where reparti.codice = daStampare.reparto) ,cast(totcre as number),codice asc")
																			Catch
																				Dim cursorWrapper9 As Cursor
																				cursorWrapper = Main.vSql1.ExecQuery("select " & str5 & " from daStampare where id = '" & cursorWrapper7.GetString("id") & "' order by QtaConDecimali,totcre," & str3)
																			End Try
																		Else If vGetInt2 = 16 Then
																			Dim cursorWrapper10 As Cursor
																			cursorWrapper2 = Main.vSql1.ExecQuery("select " & str5 & " from daStampare where id = '" & cursorWrapper7.GetString("id") & "' order by substr('0000000000000000000000000000000000000000' || case when codint='Turno' then '-' else case when substr(codice,1,2)='vv'  or substr(codice,1,2)='ww' then (Select codint from daStampare As Ds where Ds.totcre=daStampare.totcre And substr(codice,1,2)<>'vv' and substr(codice,1,2)<>'ww') Else codint end end,-40) ,cast(totcre As number),codice asc")
																		Else
																			Dim cursorWrapper11 As Cursor
																			cursorWrapper2 = Main.vSql1.ExecQuery("select " & str5 & " from daStampare where id = '" & cursorWrapper7.GetString("id") & "' order by QtaConDecimali,cast(totcre as number)," & str3)
																		End If
																		cursorWrapper = cursorWrapper2
																	Else If z16 Then
																		Dim cursorWrapper12 As Cursor
																		cursorWrapper = Main.vSql1.ExecQuery("select " & str5 & " from daStampare where id = '" & cursorWrapper7.GetString("id") & "' order by turno,(case when lower(substr(codice,1,6)) ='turno ' then 0 else (select indice from reparti where reparti.codice = daStampare.reparto) end) , totcre,codice asc")
																	Else If vGetInt2 = 16 Then
																		Dim cursorWrapper13 As Cursor
																		cursorWrapper = Main.vSql1.ExecQuery("select " & str5 & " from daStampare where id = '" & cursorWrapper7.GetString("id") & "' order by turno,substr('0000000000000000000000000000000000000000' || case when codint='Turno' then '-' else case when substr(codice,1,2)='vv'  or substr(codice,1,2)='ww' then (Select codint from daStampare As Ds where Ds.totcre=daStampare.totcre And substr(codice,1,2)<>'vv' and substr(codice,1,2)<>'ww') Else codint end end,-40) , QtaConDecimali,totcre," & str3)
																	Else
																		Dim cursorWrapper14 As Cursor
																		cursorWrapper = Main.vSql1.ExecQuery("select " & str5 & " from daStampare where id = '" & cursorWrapper7.GetString("id") & "' order by turno,QtaConDecimali,totcre," & str3)
																	End If
																	If cursorWrapper.RowCount <= 0 Then
																		Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select case when sum(qta) is null then 0 else sum(qta) end from venduto where (codint ='888888' or codint ='888889') and nmov = " & cursorWrapper7.GetString("nmov"))
																		Dim vGetInt3 As Int = cursorWrapper4.GetInt("copie")
																		cursorWrapper.Position = 0
																		Dim i19 As Int = IIf(Not(Main.v_turni) Or cursorWrapper.GetInt("tavolo") <= 0, vGetInt3, 0)
																		Dim z21 As Boolean = IIf(cursorWrapper.GetInt("tavolo") > 0, z4, z18)
																		Dim str26 As String = ""
																		Dim i20 As Int = 0
																		i4 = i18
																		Dim z22 As Boolean = z19
																		Dim str27 As String = str4
																		Dim d6 As Double = d5
																		Dim str28 As String = str21
																		Do While i20 <= i19
																			Dim i21 As Int = IIf(z16, -1, i4)
																			Dim d7 As Double = 0
																			Try
																				If Not(z21) Then
																					vTmp.doc_inizio
																					vTmp.doc_paginizio(vGetInt2 = 19 Or vGetInt2 = 20)
																					Dim vGetInt4 As Int = cursorWrapper.GetInt("tavolo")
																					Dim vGetInt5 As Int = cursorWrapper.GetInt("asporto")
																					Dim vGetString As String = cursorWrapper4.GetString("descrizione")
																					Sub182(vTmp, vGetInt4, vGetInt5, vGetString, vGetInt2, Main.v_turni And cursorWrapper.GetInt("tavolo") > 0, cursorWrapper7, map, cursorWrapper4.GetInt("righeinit"), cursorWrapper4.GetInt("barcodeA") = 1)
																					If cursorWrapper.GetInt("tavolo") = -1 And cursorWrapper4.GetInt("RiepAsporto") = 1 Then
																						Sub195(cursorWrapper4, vTmp, vGetInt2, cursorWrapper, cursorWrapper7, i14, "RiepAsporto")
																					End If
																				End If
																				Dim z23 As Boolean = cursorWrapper.GetInt("tavolo") <= 0
																				Dim i22 As Int = 0
																				Dim map2 As Map
																				If vGetInt2 = 18 Then
																					map2.Initialize
																				End If
																				Dim vGetInt6 As Int = cursorWrapper.GetInt("operatore")
																				Dim rowCount3 As Int = cursorWrapper.RowCount - 1
																				Dim i23 As Int = 0
																				Dim i24 As Int = i21
																				Do While i23 <= rowCount3
																					Try
																						cursorWrapper.Position = i23
																						Dim vGetString2 As String = IIf(cursorWrapper4.GetInt("StampaImmagine") = 1, cursorWrapper.GetString("codint"), "")
																						If Main.v_turni And cursorWrapper.GetInt("tavolo") > 0 Then
																							If cursorWrapper.GetString("turno") < 0 Then
																								Main.vSql1.ExecNonQuery("update venduto set lockturno=1 where idRiga = '" & cursorWrapper.GetString("idRiga") & "'")
																							End If
																							If Round2(cursorWrapper.GetDouble("qta"), 3) <> 0 Then
																								If i22 <> cursorWrapper.GetInt("turno") Then
																									i11 = IIf(z16, -1, i24)
																									If cursorWrapper.GetString("turno") < 0 Then
																										If i22 <> 0 Then
																											If cursorWrapper4.GetInt("TagliaTurno") = 1 Then
																												Sub181(vTmp, cursorWrapper7.GetInt("codstampa"), vGetInt6, parseDouble, vGetInt2, "", 0, cursorWrapper7.GetString("nmov"), map, cursorWrapper7.GetString("id"))
																												vTmp.doc_pagfine(cursorWrapper4.GetInt("notaglio") = 1)
																												Sub182(vTmp, cursorWrapper.GetInt("tavolo"), cursorWrapper.GetInt("asporto"), cursorWrapper4.GetString("descrizione"), vGetInt2, True, cursorWrapper7, map, cursorWrapper4.GetInt("righeinit"), cursorWrapper4.GetInt("barcodeA") = 1)
																											Else If vGetInt2 = 12 Then
																												vTmp.doc_testostile(False, False, False, False, False, False, True, Sub096(map, "DStampaSeparatoreTurno"))
																												vTmp.doc_testostampa(modfunstr.Sub004(42))
																											Else
																												vTmp.doc_testostile(vGetInt2 = 1, False, False, False, False, False, False, Sub096(map, "DStampaSeparatoreTurno"))
																												vTmp.doc_testostampa("------------------------------------------" & CRLF)
																											End If
																										End If
																										vTmp.doc_testogiustifica(1)
																										If vGetInt2 <> 4 And vGetInt2 <> 5 And vGetInt2 <> 9 Then
																											vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 <> 2, False, False, True, Sub096(map, "DStampaAvantiTurno"))
																											If vGetInt2 = 11 And cursorWrapper.GetInt("turno") = -1 Then
																												vTmp.doc_testostampa("Pietanze veloci")
																											Else
																												vTmp.doc_testostampa("Avanti Turno " & cursorWrapper.GetInt("turno") * 1)
																											End If
																											If cursorWrapper4.GetInt("riepAT") = 1 Then
																												Sub194(vTmp, cursorWrapper7.GetString("nmov"), vGetInt2, cursorWrapper.GetString("turno"), cursorWrapper7.GetString("id"), cursorWrapper4.GetString("codice"), map)
																											End If
																										End If
																										vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, Sub096(map, "DStampaSalaSuTurno"))
																										vTmp.doc_testogiustifica(0)
																										If vGetInt6 > 1 Then
																											If vGetInt6 <= IIf(Main.v_opextended, 40, 9) Then
																												i9 = vGetInt6
																												Main.vCur5.Position = i9 - 1
																												z11 = True
																												If Main.v_stampasala Then
																													If Main.vMap5.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																														If vGetInt2 = 3 Or vGetInt2 = 6 Or vGetInt2 = 21 Or vGetInt2 = 10 Then
																															If vGetInt2 <> 10 Or Not(z22) Then
																																vTmp.doc_testogiustifica(1)
																																vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, Sub096(map, "DStampaSalaSuTurno"))
																																vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & "  -  Cam.:" & Main.vCur5.GetString("descrizione"))
																																vTmp.doc_testostile(False, True, True, True, False, False, False, Sub096(map, "DStampaTavoloSuTurno"))
																																If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																																	vTmp.doc_testostampa(Main.vMap6.Get(cursorWrapper.GetInt("tavolo")))
																																Else
																																	vTmp.doc_testostampa("Tavolo:" & cursorWrapper.GetInt("tavolo"))
																																End If
																																vTmp.doc_testogiustifica(0)
																															End If
																															If vGetInt2 = 10 Then
																																z12 = True
																																z22 = z12
																																z11 = False
																															End If
																															z12 = z22
																															z22 = z12
																															z11 = False
																														Else
																															If vGetInt2 = 19 Or vGetInt2 = 20 Then
																																vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 <> 2, False, False, True, Sub096(map, "DStampaTavoloSuTurno"))
																																If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																																	vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & ": " & Main.vMap6.Get(cursorWrapper.GetInt("tavolo")))
																																Else
																																	vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & ": Tav." & cursorWrapper.GetInt("tavolo"))
																																End If
																																vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, Sub096(map, "DStampaSalaSuTurno"))
																															Else If vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																																vTmp.doc_testogiustifica(1)
																																vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 <> 2, False, False, True, Sub096(map, "DStampaTavoloSuTurno"))
																																If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																																	vTmp.doc_testostampa(Main.vMap6.Get(cursorWrapper.GetInt("tavolo")) & "-Avanti T." & cursorWrapper.GetString("turno") * 1)
																																Else
																																	vTmp.doc_testostampa(Main.vMap5.Get("Tav." & cursorWrapper.GetInt("tavolo") & "-Avanti T." & cursorWrapper.GetString("turno") * 1))
																																End If
																																If cursorWrapper4.GetInt("riepAT") = 1 Then
																																	Sub194(vTmp, cursorWrapper7.GetString("nmov"), vGetInt2, cursorWrapper.GetString("turno"), cursorWrapper7.GetString("id"), cursorWrapper4.GetString("codice"), map)
																																End If
																																vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, Sub096(map, "DStampaSalaSuTurno"))
																																vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & "  -  Cam.:" & Main.vCur5.GetString("descrizione"))
																															Else
																																If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																																	vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & ": " & Main.vMap6.Get(cursorWrapper.GetInt("tavolo")))
																																Else
																																	vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & ": Tav." & cursorWrapper.GetInt("tavolo"))
																																End If
																															End If
																															If vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																																vTmp.doc_testogiustifica(0)
																																z12 = z22
																																z22 = z12
																																z11 = False
																															Else
																																vTmp.doc_testostampa("Op:" & Main.vCur5.GetString("descrizione") & " " & DateTime.Time(Sub058()))
																																z12 = z22
																																z22 = z12
																																z11 = False
																															End If
																														End If
																													End If
																												End If
																												If z11 Then
																													If vGetInt2 = 3 Or vGetInt2 = 6 Or vGetInt2 = 21 Or vGetInt2 = 10 Or vGetInt2 = 19 Or vGetInt2 = 20 Then
																														If vGetInt2 <> 10 Or Not(z22) Then
																															vTmp.doc_testostile(True, True, True, True, False, False, False, Sub096(map, "DStampaTavoloSuTurno"))
																															vTmp.doc_testogiustifica(1)
																															vTmp.doc_testostampa("Tavolo:" & cursorWrapper.GetInt("tavolo"))
																															vTmp.doc_testogiustifica(0)
																															vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, "")
																														End If
																														If vGetInt2 = 10 Then
																															z22 = True
																														End If
																													Else If vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																														vTmp.doc_testogiustifica(1)
																														vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 <> 2, False, False, vGetInt2 <> 12, Sub096(map, "DStampaTavoloSuTurno"))
																														vTmp.doc_testostampa("Tav." & cursorWrapper.GetInt("tavolo") & " - Avanti T." & cursorWrapper.GetString("turno") * 1)
																														If cursorWrapper4.GetInt("riepAT") = 1 Then
																															Sub194(vTmp, cursorWrapper7.GetString("nmov"), vGetInt2, cursorWrapper.GetString("turno"), cursorWrapper7.GetString("id"), cursorWrapper4.GetString("codice"), map)
																														End If
																														vTmp.doc_testogiustifica(0)
																														vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, "")
																													Else
																														vTmp.doc_testostampa("Tav:" & cursorWrapper.GetInt("tavolo") & " Op:" & Main.vCur5.GetString("descrizione") & " " & DateTime.Time(Sub058()))
																													End If
																												End If
																												If cursorWrapper4.GetInt("RiepTurni") = 1 Then
																													Sub195(cursorWrapper4, vTmp, vGetInt2, cursorWrapper, cursorWrapper7, i14, "RiepTurni")
																												End If
																												vTmp.doc_testostampa(CRLF & CRLF)
																												i8 = cursorWrapper.GetInt("turno")
																												If cursorWrapper.GetString("codint") <> "Turno" And z3 Then
																													z9 = z20
																													d3 = d6
																													d4 = d7
																													str15 = str28
																													i10 = i11
																													str16 = str27
																													str14 = str24
																												Else If Round2(cursorWrapper.GetDouble("qta"), 3) > 0 Or z3 Then
																													vGetInt6 = i9
																												Else
																													z9 = z20
																													d3 = d6
																													d4 = d7
																													str15 = str28
																													i10 = i11
																													str16 = str27
																													str14 = str24
																												End If
																												i23 = i23 + 1
																												i22 = i8
																												str24 = str14
																												z20 = z9
																												str27 = str16
																												d6 = d3
																												str28 = str15
																												i24 = i10
																												vGetInt6 = i9
																												d7 = d4
																											End If
																										End If
																										i9 = Main.Operatore
																										Main.vCur5.Position = i9 - 1
																										z11 = True
																										If Main.v_stampasala Then
																										End If
																										If z11 Then
																										End If
																										If cursorWrapper4.GetInt("RiepTurni") = 1 Then
																										End If
																										vTmp.doc_testostampa(CRLF & CRLF)
																										i8 = cursorWrapper.GetInt("turno")
																										If cursorWrapper.GetString("codint") <> "Turno" Then
																										End If
																										If Round2(cursorWrapper.GetDouble("qta"), 3) > 0 Then
																										End If
																										vGetInt6 = i9
																									Else
																										If i22 <> 0 Then
																											If cursorWrapper4.GetInt("TagliaTurno") = 1 Then
																												Sub181(vTmp, cursorWrapper7.GetInt("codstampa"), vGetInt6, parseDouble, vGetInt2, "", 0, cursorWrapper7.GetString("nmov"), map, cursorWrapper7.GetString("id"))
																												vTmp.doc_pagfine(cursorWrapper4.GetInt("notaglio") = 1)
																												Sub182(vTmp, cursorWrapper.GetInt("tavolo"), cursorWrapper.GetInt("asporto"), cursorWrapper4.GetString("descrizione"), vGetInt2, True, cursorWrapper7, map, cursorWrapper4.GetInt("righeinit"), cursorWrapper4.GetInt("barcodeA") = 1)
																											Else If vGetInt2 = 12 Then
																												vTmp.doc_testostile(False, False, False, False, False, False, True, "")
																												vTmp.doc_testostampa(modfunstr.Sub004(42))
																											Else
																												vTmp.doc_testostile(vGetInt2 = 1, False, False, False, False, False, False, Sub096(map, "DStampaSeparatoreTurno"))
																												vTmp.doc_testostampa("------------------------------------------" & CRLF)
																											End If
																										End If
																										vTmp.doc_testogiustifica(1)
																										If vGetInt2 <> 4 And vGetInt2 <> 12 Then
																											vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 <> 2, False, False, cursorWrapper.GetInt("turno") = 1, Sub096(map, "DStampaConTurniDaAvanzare"))
																											vTmp.doc_testostampa("**** Turno " & cursorWrapper.GetString("turno") & " ****")
																										End If
																										vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, "")
																										vTmp.doc_testogiustifica(0)
																										If vGetInt6 > 1 Then
																											Dim d9 As Double = vGetInt6
																										End If
																										vGetInt6 = Main.Operatore
																										Main.vCur5.Position = vGetInt6 - 1
																										Dim z24 As Boolean = True
																										If Main.v_stampasala Then
																											If Main.vMap5.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																												If vGetInt2 = 3 Or vGetInt2 = 6 Or vGetInt2 = 21 Or vGetInt2 = 10 Then
																													If vGetInt2 <> 10 Or Not(z22) Then
																														vTmp.doc_testogiustifica(1)
																														vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, Sub096(map, "DStampaSala"))
																														vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & "  -  Cam.:" & Main.vCur5.GetString("descrizione"))
																														vTmp.doc_testostile(False, True, True, True, False, False, False, Sub096(map, "DStampaTavolo"))
																														If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																															vTmp.doc_testostampa(Main.vMap6.Get(cursorWrapper.GetInt("tavolo")))
																														Else
																															vTmp.doc_testostampa("Tavolo:" & cursorWrapper.GetInt("tavolo"))
																														End If
																														vTmp.doc_testogiustifica(0)
																													End If
																													If vGetInt2 = 10 Then
																														z22 = True
																													End If
																												Else
																													If vGetInt2 = 19 Or vGetInt2 = 20 Then
																														If vGetInt2 = 20 Then
																															vTmp.doc_testostile(False, True, True, True, False, False, False, "")
																															vTmp.doc_testostampa(" ")
																															vTmp.doc_testostampa(" ")
																															vTmp.doc_testogiustifica(1)
																														End If
																														vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 <> 2, False, False, True, Sub096(map, "DStampaTavoloSuTurno"))
																														If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																															vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & ": " & Main.vMap6.Get(cursorWrapper.GetInt("tavolo")))
																														Else
																															vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & ": Tav." & cursorWrapper.GetInt("tavolo"))
																														End If
																														If vGetInt2 = 20 Then
																															vTmp.doc_testostile(False, True, True, True, False, False, False, "")
																															vTmp.doc_testostampa(" ")
																															vTmp.doc_testostampa(" ")
																															vTmp.doc_testogiustifica(0)
																														End If
																														vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, Sub096(map, "DStampaSalaSuTurno"))
																													Else If vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																														vTmp.doc_testogiustifica(1)
																														vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 <> 2, False, False, cursorWrapper.GetInt("turno") = 1 And vGetInt2 <> 12, Sub096(map, "DStampaTavolo"))
																														If vGetInt2 = 12 Then
																															If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																																vTmp.doc_testostampa(Main.vMap6.Get(cursorWrapper.GetInt("tavolo")))
																															Else
																																vTmp.doc_testostampa("Tavolo" & cursorWrapper.GetInt("tavolo"))
																															End If
																														Else
																															If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																																vTmp.doc_testostampa(Main.vMap6.Get(cursorWrapper.GetInt("tavolo")) & " - Turno " & cursorWrapper.GetString("turno"))
																															Else
																																vTmp.doc_testostampa("Tav." & cursorWrapper.GetInt("tavolo") & " - Turno " & cursorWrapper.GetString("turno"))
																															End If
																														End If
																														vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, Sub096(map, "DStampaSala"))
																														vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & "  -  Cam.:" & Main.vCur5.GetString("descrizione"))
																													Else
																														If vGetInt2 = 14 Then
																															vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, Sub096(map, "HDicituraSalaAsportoTavolo"))
																														End If
																														If Main.vMap6.ContainsKey(cursorWrapper.GetInt("tavolo")) Then
																															vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & ": " & Main.vMap6.Get(cursorWrapper.GetInt("tavolo")))
																														Else
																															vTmp.doc_testostampa(Main.vMap5.Get(cursorWrapper.GetInt("tavolo")) & ": Tav." & cursorWrapper.GetInt("tavolo"))
																														End If
																														If vGetInt2 = 14 Then
																															vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, "")
																														End If
																													End If
																													If vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																														vTmp.doc_testogiustifica(0)
																													Else
																														vTmp.doc_testostampa("Op:" & Main.vCur5.GetString("descrizione") & " " & DateTime.Time(Sub058()))
																													End If
																												End If
																												z24 = False
																											End If
																										End If
																										If z24 Then
																											If vGetInt2 = 3 Or vGetInt2 = 6 Or vGetInt2 = 21 Or vGetInt2 = 10 Or vGetInt2 = 19 Or vGetInt2 = 20 Then
																												If vGetInt2 <> 10 Or Not(z22) Then
																													vTmp.doc_testostile(True, True, True, True, False, False, False, "")
																													vTmp.doc_testogiustifica(1)
																													vTmp.doc_testostampa("Tavolo:" & cursorWrapper.GetInt("tavolo"))
																													vTmp.doc_testogiustifica(0)
																													vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, "")
																												End If
																												If vGetInt2 = 10 Then
																													z22 = True
																												End If
																											Else If vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																												vTmp.doc_testogiustifica(1)
																												vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 <> 2, False, False, cursorWrapper.GetInt("turno") = 1 And vGetInt2 <> 12, Sub096(map, "DStampaTavolo"))
																												If vGetInt2 = 12 Then
																													vTmp.doc_testostampa("Tavolo:" & cursorWrapper.GetInt("tavolo"))
																												Else
																													vTmp.doc_testostampa("Tav:" & cursorWrapper.GetInt("tavolo") & " - Turno " & cursorWrapper.GetString("turno"))
																												End If
																												vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, False, False, False, "")
																												vTmp.doc_testogiustifica(0)
																											Else
																												vTmp.doc_testostampa("Tav:" & cursorWrapper.GetInt("tavolo") & " Op:" & Main.vCur5.GetString("descrizione") & " " & DateTime.Time(Sub058()))
																											End If
																										End If
																										If cursorWrapper4.GetInt("RiepTurni") = 1 Then
																											Sub195(cursorWrapper4, vTmp, vGetInt2, cursorWrapper, cursorWrapper7, i14, "RiepTurni")
																										End If
																										vTmp.doc_testostampa(CRLF & CRLF)
																									End If
																									i22 = cursorWrapper.GetInt("turno")
																									i5 = vGetInt6
																									i6 = i11
																								Else
																									If cursorWrapper.GetString("turno") < 0 Then
																										i8 = cursorWrapper.GetInt("turno")
																										If Round2(cursorWrapper.GetDouble("qta"), 3) = 0 Then
																											i9 = vGetInt6
																											str14 = str24
																											d4 = d7
																											str15 = str28
																											str16 = str27
																											z9 = z20
																											i10 = i24
																											d3 = d6
																										Else If cursorWrapper.GetString("codint") = "Turno" Then
																											i9 = vGetInt6
																											str14 = str24
																											d4 = d7
																											str15 = str28
																											str16 = str27
																											z9 = z20
																											i10 = i24
																											d3 = d6
																										End If
																										i23 = i23 + 1
																										i22 = i8
																										str24 = str14
																										z20 = z9
																										str27 = str16
																										d6 = d3
																										str28 = str15
																										i24 = i10
																										vGetInt6 = i9
																										d7 = d4
																									End If
																									i11 = i24
																									i22 = cursorWrapper.GetInt("turno")
																									i5 = vGetInt6
																									i6 = i11
																								End If
																								If i5 = 0 Then
																									Try
																										i5 = cursorWrapper.GetInt("operatore")
																									Catch
																										i21 = i6
																										e = e2
																										Sub217(LastException.Message)
																										i4 = i21
																										z8 = z22
																										str6 = str27
																										d5 = d6
																										str7 = str28
																										If Main.v_turni Then
																										End If
																										Main.vSql1.ExecNonQuery("update confstampe set counter = counter +1 where codice = " & cursorWrapper7.GetInt("codstampa"))
																										z7 = z21
																										cursorWrapper.Close
																										i17 = i17 + 1
																										str21 = str7
																										z18 = z7
																										str22 = str6
																										z17 = z8
																										i18 = i4
																									End Try
																								End If
																								If Round2(cursorWrapper.GetDouble("qta"), 3) <> 0 Then
																									i9 = i5
																									str14 = str24
																									z9 = z20
																									d3 = d6
																									d4 = d7
																									str15 = str28
																									i10 = i6
																									str16 = str27
																									i8 = i22
																								Else
																									If z21 Then
																										If cursorWrapper.GetString("codice").Trim.StartsWith("vv") Then
																											i9 = i5
																											str14 = str24
																											z9 = z20
																											d3 = d6
																											d4 = d7
																											str15 = str28
																											i10 = i6
																											str16 = str27
																											i8 = i22
																										Else If cursorWrapper.GetString("codice").Trim.StartsWith("ww") Then
																											i9 = i5
																											str14 = str24
																											z9 = z20
																											d3 = d6
																											d4 = d7
																											str15 = str28
																											i10 = i6
																											str16 = str27
																											i8 = i22
																										Else
																											vTmp.doc_inizio
																											vTmp.doc_paginizio(vGetInt2 = 19 Or vGetInt2 = 20)
																											Dim vGetInt7 As Int = cursorWrapper.GetInt("tavolo")
																											Dim vGetInt8 As Int = cursorWrapper.GetInt("asporto")
																											Dim vGetString3 As String = cursorWrapper4.GetString("descrizione")
																											Sub182(vTmp, vGetInt7, vGetInt8, vGetString3, vGetInt2, Main.v_turni And cursorWrapper.GetInt("tavolo") > 0, cursorWrapper7, map, cursorWrapper4.GetInt("righeinit"), cursorWrapper4.GetInt("barcodeA") = 1)
																										End If
																									End If
																									If vGetInt2 = 5 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																										If str28 <> "" Then
																										End If
																										If str28 = "" Then
																											If Not(cursorWrapper.GetString("codice").Trim.StartsWith("vv")) Then
																											End If
																										End If
																									End If
																									vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13, False, False, False, Sub096(map, "DStampaRigaDettaglio"))
																									Dim sb15 As String = "  " & modfunstr.left(cursorWrapper.GetString("qta") & modfunstr.Sub004(5), 5)
																									If vGetInt2 = 7 Then
																										If Not(cursorWrapper.GetString("codice").Trim.StartsWith("vv") Or cursorWrapper.GetString("codice").Trim.StartsWith("ww")) Then
																											sb15 = "  " & modfunstr.left(cursorWrapper.GetString("qta") & " X   ", 5)
																										End If
																									End If
																									If vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																										sb15 = " " & sb15.Trim & " "
																									End If
																									If Not(z16) Or i6 = cursorWrapper.GetInt("reparto") Then
																										i7 = i6
																									Else
																										Main.vCur6.Position = cursorWrapper.GetInt("reparto")
																										vTmp.doc_testostile(False, True, True, True, False, False, False, Sub096(map, "DStampaDescrizioneReparto"))
																										vTmp.doc_testostampa(Main.vCur6.GetString("descrizione"))
																										vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 13, False, False, False, Sub096(map, "DStampaRigaDettaglio"))
																										i7 = cursorWrapper.GetInt("reparto")
																									End If
																									Try
																										Dim trim As String = cursorWrapper.GetString("descrizione").Trim
																										If cursorWrapper.GetString("memo") <> "" And vGetInt2 <> 6 And vGetInt2 <> 8 Then
																											trim = trim & cursorWrapper.GetString("memo")
																										End If
																										If vGetInt2 = 6 Or vGetInt2 = 21 Or vGetInt2 = 8 Then
																											Dim d10 As Double = -1000
																											Dim d11 As Double = 1
																											If Main.vSql1.ExecQuerySingleResult("select count(*) from venduto where nmov = " & cursorWrapper7.GetString("nmov") & " and " & TAB & "idRiga='" & cursorWrapper.GetString("idRiga") & "'") > 0 Then
																												d10 = Main.vSql1.ExecQuerySingleResult("select case when importo is null then -1000 else importo end from venduto where nmov = " & cursorWrapper7.GetString("nmov") & " and " & TAB & "idRiga='" & cursorWrapper.GetString("idRiga") & "'")
																												d11 = Main.vSql1.ExecQuerySingleResult("select case when qta is null then 1 else qta end from venduto where nmov = " & cursorWrapper7.GetString("nmov") & " and " & TAB & "idRiga='" & cursorWrapper.GetString("idRiga") & "'")
																											Else
																												If Main.vSql2.ExecQuerySingleResult("select count(*) from venduto where nmov = " & cursorWrapper7.GetString("nmov") & " and " & TAB & "idRiga='" & cursorWrapper.GetString("idRiga") & "'") > 0 Then
																													d10 = Main.vSql2.ExecQuerySingleResult("select case when importo is null then -1000 else importo end from venduto where nmov = " & cursorWrapper7.GetString("nmov") & " and " & TAB & "idRiga='" & cursorWrapper.GetString("idRiga") & "'")
																													d11 = Main.vSql2.ExecQuerySingleResult("select case when qta is null then 1 else qta end from venduto where nmov = " & cursorWrapper7.GetString("nmov") & " and " & TAB & "idRiga='" & cursorWrapper.GetString("idRiga") & "'")
																												End If
																											End If
																											If d10 = -1000 Then
																												vRound2 = Main.vSql1.ExecQuerySingleResult("select case when list1 is null then 0 else list1 end  from anagra where codint  ='" & cursorWrapper.GetString("codint") & "'")
																												If cursorWrapper.GetInt("qta") < 0 Then
																													vRound2 = vRound2 * -1
																												End If
																											Else
																												vRound2 = Round2(d10 / d11 * cursorWrapper.GetDouble("qta"), 2)
																											End If
																											If vGetInt2 = 8 Then
																												If vRound2 > 0 Then
																													vTmp.doc_testostile(False, True, True, True, False, False, False, Sub096(map, "DStampaRigaImporto"))
																												End If
																												sb15 = " " & sb15.Trim & " "
																											Else
																												If cursorWrapper.GetString("codice").Trim.StartsWith("vv") Or cursorWrapper.GetString("codice").Trim.StartsWith("ww") Then
																													trim = modfunstr.left(trim & modfunstr.Sub004(20), 20) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(vRound2, 1, 2, 2, False), 9)
																												Else
																													trim = modfunstr.left(trim & modfunstr.Sub004(23), 23) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(vRound2, 1, 2, 2, False), 9)
																												End If
																												If Not(z21 And cursorWrapper.GetInt("asporto") >= 0) Then
																													If Not(z4 And cursorWrapper.GetInt("tavolo") > 0) Then
																														d7 = d7 + vRound2
																													End If
																												End If
																											End If
																										End If
																										If cursorWrapper.GetString("codice").Trim.StartsWith("vv") Or cursorWrapper.GetString("codice").Trim.StartsWith("ww") Then
																											If vGetInt2 = 18 Then
																												If map2.ContainsKey(cursorWrapper.GetString("idRiga")) Then
																													i8 = i22
																													i9 = i5
																													str14 = str24
																													z9 = z20
																													d3 = d6
																													d4 = d7
																													str15 = str28
																													str16 = str27
																													i10 = i7
																												End If
																											Else If vGetInt2 = 13 Then
																												If str27 <> cursorWrapper.GetString("grpdes") Then
																													vTmp.doc_testostile(False, False, False, False, False, False, False, "")
																													vTmp.doc_testostampa("------------------------------------")
																													vTmp.doc_testostile(False, True, True, False, False, False, False, Sub096(map, "DStampaDescrizioneGruppo"))
																													vTmp.doc_testostampa("   " & cursorWrapper.GetString("grpdes") & " :")
																													str27 = cursorWrapper.GetString("grpdes")
																												End If
																											End If
																											If vGetInt2 = 5 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																												str28 = cursorWrapper.GetString("totcre")
																												If cursorWrapper.GetDouble("qta") <= 1 Then
																													sb15 = "   "
																												End If
																												If trim.StartsWith("+ ") Then
																													trim = trim.SubString(2)
																												End If
																											Else If (d6 = 1 And cursorWrapper.GetDouble("qta") = 1 And vGetInt2 <> 6) Or vGetInt2 = 22 Then
																												sb15 = "   "
																											End If
																											If Main.vSql1.ExecQuerySingleResult("select count(*) from daStampare where id = '" & cursorWrapper7.GetString("id") & "' and qta <> 0  and substr(codice,0,3)<>'vv' and substr(codice,0,3)<>'ww'  and totcre = '" & cursorWrapper.GetString("totcre") & "'") = 0 Then
																												Try
																													If Main.vSql1.ExecQuerySingleResult("select count(*) from daStampare where id = '" & cursorWrapper7.GetString("id") & "'  and substr(codice,0,3)<>'vv' and substr(codice,0,3)<>'ww'  and totcre = '" & cursorWrapper.GetString("totcre") & "'") > 0 Then
																														str13 = Main.vSql1.ExecQuerySingleResult("select descrizione from daStampare where id = '" & cursorWrapper7.GetString("id") & "'  and substr(codice,0,3)<>'vv' and substr(codice,0,3)<>'ww'  and totcre = '" & cursorWrapper.GetString("totcre") & "'")
																														If str26 <> str13 Then
																															vTmp.doc_testostampa("Modifica Variazioni a " & str13)
																														End If
																													Else
																														vTmp.doc_testostampa("Modifica Variazioni :")
																														str13 = str26
																													End If
																													str26 = str13
																												Catch
																													Sub217(LastException.Message)
																												End Try
																												vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 >= 3, vGetInt2 >= 3 And vGetInt2 <> 13, vGetInt2 = 9, False, False, False, Sub096(map, "DStampaVariazioni"))
																												str9 = trim
																												str10 = str27
																												d2 = d6
																												str11 = str28
																												str12 = sb15
																											Else
																												Dim str29 As String = IIf(vGetInt2 = 9, "   " & sb15.Trim, "   " & sb15)
																												If vGetInt2 = 5 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																													If trim.Contains("*") Then
																														str9 = trim.Trim.Replace("*", "")
																														str12 = "  "
																													Else
																														str12 = str29
																														str9 = trim
																													End If
																													vTmp.doc_testostile(False, True, vGetInt2 <> 13, cursorWrapper.GetString("descrizione").Contains("*"), False, False, False, Sub096(map, "DStampaVariazioni"))
																												Else
																													vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9, vGetInt2 = 9, vGetInt2 < 3, False, False, Sub096(map, "DStampaVariazioni"))
																													str12 = str29
																													str9 = trim
																												End If
																												str26 = ""
																												str10 = str27
																												d2 = d6
																												str11 = str28
																											End If
																										Else If Not(Sub029(cursorWrapper.GetString("codint"))) And Not(Sub028(cursorWrapper.GetString("codint"))) Then
																											If vGetInt2 = 14 Then
																												str9 = cursorWrapper.GetString("codint").Trim & "-" & trim
																											Else If vGetInt2 = 15 Then
																												str9 = "x  " & cursorWrapper.GetString("codint").Trim
																											Else
																												If vGetInt2 = 18 Then
																													If Main.vSql1.ExecQuerySingleResult("select count(*) from venduto where nmov = " & cursorWrapper7.GetString("nmov") & " and " & TAB & "totcre='" & cursorWrapper.GetString("totcre") & "' and  lower(substr(codice,1,2))='vv'") > 0 Then
																														Dim cursorWrapper15 As Cursor
																														Dim cursorWrapper16 As Cursor = Main.vSql1.ExecQuery("select descrizione,idRiga from venduto where nmov = " & cursorWrapper7.GetString("nmov") & " and " & TAB & "totcre='" & cursorWrapper.GetString("totcre") & "' and  lower(substr(codice,1,2))='vv'  order by (select gruppovar.indice || gruppovar.descrizione from anagra inner join gruppovar on gruppovar.codice = anagra.gruppov where anagra.codint = venduto.codint) || descrizione asc  ")
																														If cursorWrapper16.RowCount > 0 Then
																															Dim rowCount4 As Int = cursorWrapper16.RowCount - 1
																															Dim i26 As Int = 0
																															Do While i26 <= rowCount4
																																cursorWrapper16.Position = i26
																																Dim str32 As String = trim & " " & cursorWrapper16.GetString("descrizione").Replace("+", "")
																																map2.Put(cursorWrapper16.GetString("idRiga"), " ")
																																i26 = i26 + 1
																																trim = str32
																															Loop
																														End If
																														cursorWrapper16.Close
																													End If
																												End If
																												str9 = trim
																											End If
																											vInt1 = vInt1 + Round2(cursorWrapper.GetDouble("qta"), 3)
																											str26 = ""
																											str12 = sb15
																											str10 = str27
																											d2 = cursorWrapper.GetDouble("qta")
																											str11 = ""
																										Else
																											str26 = ""
																											str9 = trim
																											str10 = str27
																											d2 = cursorWrapper.GetDouble("qta")
																											str11 = ""
																											str12 = sb15
																										End If
																										Try
																											If modfunstr.Sub006(str12) < 0 Then
																												vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, False, False, False, True, Sub096(map, "DStampaRigaCancellazione"))
																											End If
																											If Sub029(cursorWrapper.GetString("codint")) Or Sub028(cursorWrapper.GetString("codint")) Then
																												If modfunstr.Sub006(str12) > 0 Then
																													str12 = "**** "
																													vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, True, False, False, True, Sub096(map, "DStampaRigaMsgoMnu"))
																												End If
																											End If
																											If cursorWrapper.GetString("codice").Trim.StartsWith("ww") Then
																												str17 = modfunstr.Sub004(str12.Length)
																											Else
																												str17 = str12
																											End If
																											Dim replace As String = IIf(Main.v_sottoconti, str9.Replace("Sottoconto", "Sc."), str9)
																											If vGetInt2 = 4 Or vGetInt2 = 5 Or vGetInt2 = 9 Or vGetInt2 = 12 Or vGetInt2 = 13 Then
																												If cursorWrapper.GetString("memo").Contains(TAB) Then
																													Dim vSplit() As String = Regex.Split(TAB, replace)
																													Dim length As Int = vSplit.Length - 1
																													Dim i27 As Int = 0
																													Do While True
																														Dim i28 As Int = i27
																														If i28 > length Then
																															Exit
																														End If
																														If i28 = 0 Then
																															Dim trim2 As String = vSplit(i28).Trim
																															Dim vObjectToNumber2 As Int = IIf(vTmp.vBln3, 21, 42) - str17.Length
																															Sub197(str17 & Sub213(trim2, vObjectToNumber2, modfunstr.Sub004(str17.Length)), vTmp, "")
																														Else
																															vTmp.doc_testostile(False, True, vGetInt2 >= 3 And vGetInt2 <> 13, vGetInt2 = 9, False, False, False, Sub096(map, "DStampaVariazioniSuFrazione"))
																															Dim str33 As String = "    "
																															Dim i29 As Int = 42
																															If vTmp.vBln3 Then
																																str33 = ""
																																i29 = 21
																															End If
																															Sub197(Sub213(modfunstr.Sub004(str17.Length) & str33 & vSplit(i28).Trim, i29, "  "), vTmp, "")
																														End If
																														i27 = i28 + 1
																													Loop
																													vTmp.doc_testostampa("    ")
																												Else
																													Dim vObjectToNumber3 As Int = IIf(vTmp.vBln3, 21, 42) - str17.Length
																													Sub197(str17 & Sub213(replace, vObjectToNumber3, modfunstr.Sub004(str17.Length)), vTmp, vGetString2)
																												End If
																											Else If cursorWrapper.GetString("memo").Contains(TAB) Then
																												If vGetInt2 = 6 Or vGetInt2 = 8 Then
																													Dim vObjectToNumber4 As Int = IIf(vTmp.vBln3, 21, 42) - str17.Length
																													Sub197(str17 & Sub213(replace, vObjectToNumber4, modfunstr.Sub004(str17.Length)), vTmp, "")
																													Dim vSplit2() As String = Regex.Split(TAB, cursorWrapper.GetString("memo"))
																													Dim length2 As Int = vSplit2.Length - 1
																													Dim i30 As Int
																													For i30 = 0 To length2
																														If vSplit2(i30).Trim <> "" Then
																															Dim trim3 As String = vSplit2(i30).Trim
																															Dim vObjectToNumber5 As Int = IIf(vTmp.vBln3, 21, 42) - str17.Length + 2
																															Sub197(modfunstr.Sub004(str17.Length) & "  " & Sub213(trim3, vObjectToNumber5, modfunstr.Sub004(str17.Length + 2)), vTmp, "")
																														End If
																													Next
																												Else
																													Dim vSplit3() As String = Regex.Split(TAB, replace)
																													Dim length3 As Int = vSplit3.Length - 1
																													Dim i31 As Int
																													For i31 = 0 To length3
																														If i31 = 0 Then
																															Dim trim4 As String = vSplit3(i31).Trim
																															Dim vObjectToNumber6 As Int = IIf(vTmp.vBln3, 21, 42) - str17.Length
																															Sub197(str17 & Sub213(trim4, vObjectToNumber6, modfunstr.Sub004(str17.Length)), vTmp, "")
																														Else
																															vTmp.doc_testostile(False, True, vGetInt2 >= 3 And vGetInt2 <> 13, vGetInt2 = 9, False, False, False, Sub096(map, "DStampaVariazioniSuFrazione"))
																															Dim str34 As String = "    "
																															Dim i32 As Int = 42
																															If vTmp.vBln3 Then
																																str34 = ""
																																i32 = 21
																															End If
																															Sub197(Sub213(modfunstr.Sub004(str17.Length) & str34 & vSplit3(i31).Trim, i32, "  "), vTmp, "")
																														End If
																													Next
																													vTmp.doc_testostampa("    ")
																												End If
																											Else If vGetInt2 = 6 Or vGetInt2 = 1 Then
																												vTmp.doc_testostampa(str17 & replace)
																											Else
																												Dim vObjectToNumber7 As Int = IIf(vTmp.vBln3, 21, 42) - str17.Length
																												Sub197(str17 & Sub213(replace, vObjectToNumber7, modfunstr.Sub004(str17.Length)), vTmp, vGetString2)
																											End If
																											If cursorWrapper.GetInt("ingredientisunf") = 1 Then
																												Dim cursorWrapper17 As Cursor
																												Dim cursorWrapper18 As Cursor = Main.vSql1.ExecQuery("select descrizione from ingredienti inner join ingredientiplu on ingredienti.codice = ingredientiplu.codice where ingredientiplu.codint = '" & cursorWrapper.GetString("codint") & "' order by ingredienti.codice")
																												If cursorWrapper18.RowCount > 0 Then
																													vTmp.doc_testostile(vGetInt2 = 1, False, False, False, True, False, False, Sub096(map, "DStampaIngredienti"))
																													Dim rowCount5 As Int = cursorWrapper18.RowCount - 1
																													Dim i33 As Int
																													For i33 = 0 To rowCount5
																														cursorWrapper18.Position = i33
																														vTmp.doc_testostampa("   " & cursorWrapper18.GetString("descrizione").Trim)
																													Next
																													vTmp.doc_testostampa("   ")
																												End If
																												cursorWrapper18.Close
																											End If
																											If z21 Then
																												Dim cursorWrapper19 As Cursor
																												Dim cursorWrapper20 As Cursor = Main.vSql1.ExecQuery("select * from daStampare where id = '" & cursorWrapper7.GetString("id") & "' and (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and totcre ='" & cursorWrapper.GetString("totcre") & "' order by totcre,codice asc")
																												If cursorWrapper20.RowCount > 0 Then
																													Dim rowCount6 As Int = cursorWrapper20.RowCount - 1
																													Dim i34 As Int
																													For i34 = 0 To rowCount6
																														cursorWrapper20.Position = i34
																														Dim sb23 As String = "     " & modfunstr.left(cursorWrapper20.GetString("qta") & modfunstr.Sub004(5), 5)
																														Dim trim5 As String = cursorWrapper20.GetString("descrizione").Trim
																														vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, False, False, vGetInt2 <> 3, False, False, "")
																														If modfunstr.Sub006(sb23) < 0 Then
																															vTmp.doc_testostile(vGetInt2 = 1, vGetInt2 <> 2, vGetInt2 <> 1, False, False, False, True, "")
																														End If
																														vTmp.doc_testostampa(sb23 & trim5)
																													Next
																												End If
																												cursorWrapper20.Close
																												If vGetInt2 = 1 And Not(z20) Then
																													If cursorWrapper7.GetString("memo") <> "" Then
																														str24 = str24 & cursorWrapper7.GetString("memo") & CRLF
																													End If
																													str14 = str24 & Sub079(cursorWrapper7.GetString("nmov"))
																													z10 = True
																												Else
																													str14 = str24
																													z10 = z20
																												End If
																												Sub181(vTmp, cursorWrapper7.GetInt("codstampa"), i5, parseDouble, vGetInt2, str14, d7, cursorWrapper7.GetString("nmov"), map, cursorWrapper7.GetString("id"))
																												vTmp.doc_pagfine(cursorWrapper4.GetInt("notaglio") = 1)
																												vTmp.doc_fine
																												i8 = i22
																												i9 = i5
																												z9 = z10
																												str15 = str11
																												d3 = d2
																												d4 = d7
																												str16 = str10
																												i10 = i7
																											Else
																												i8 = i22
																												i9 = i5
																												str14 = str24
																												z9 = z20
																												d3 = d2
																												str15 = str11
																												i10 = i7
																												str16 = str10
																												d4 = d7
																											End If
																										Catch
																											e = e4
																											i21 = i7
																											str27 = str10
																											d6 = d2
																											str28 = str11
																											Sub217(LastException.Message)
																											i4 = i21
																											z8 = z22
																											str6 = str27
																											d5 = d6
																											str7 = str28
																											If Main.v_turni Then
																											End If
																											Main.vSql1.ExecNonQuery("update confstampe set counter = counter +1 where codice = " & cursorWrapper7.GetInt("codstampa"))
																											z7 = z21
																											cursorWrapper.Close
																											i17 = i17 + 1
																											str21 = str7
																											z18 = z7
																											str22 = str6
																											z17 = z8
																											i18 = i4
																										End Try
																									Catch
																										e = e5
																										i21 = i7
																										Sub217(LastException.Message)
																										i4 = i21
																										z8 = z22
																										str6 = str27
																										d5 = d6
																										str7 = str28
																										If Main.v_turni Then
																										End If
																										Main.vSql1.ExecNonQuery("update confstampe set counter = counter +1 where codice = " & cursorWrapper7.GetInt("codstampa"))
																										z7 = z21
																										cursorWrapper.Close
																										i17 = i17 + 1
																										str21 = str7
																										z18 = z7
																										str22 = str6
																										z17 = z8
																										i18 = i4
																									End Try
																								End If
																								i23 = i23 + 1
																								i22 = i8
																								str24 = str14
																								z20 = z9
																								str27 = str16
																								d6 = d3
																								str28 = str15
																								i24 = i10
																								vGetInt6 = i9
																								d7 = d4
																							End If
																						End If
																						i5 = vGetInt6
																						i6 = i24
																						If i5 = 0 Then
																						End If
																						If Round2(cursorWrapper.GetDouble("qta"), 3) <> 0 Then
																						End If
																						i23 = i23 + 1
																						i22 = i8
																						str24 = str14
																						z20 = z9
																						str27 = str16
																						d6 = d3
																						str28 = str15
																						i24 = i10
																						vGetInt6 = i9
																						d7 = d4
																					Catch
																						e = e6
																						i21 = i24
																					End Try
																				Loop
																				Dim str36 As String = ""
																				If cursorWrapper7.GetString("memo") <> "" And vGetInt2 <> 22 Then
																					str36 = "" & cursorWrapper7.GetString("memo")
																				End If
																				If z23 Then
																					str8 = str36 & " -" & cursorWrapper7.GetString("nmov") & "-"
																					Dim cursorWrapper21 As Cursor
																					Dim cursorWrapper22 As Cursor = Main.vSql1.ExecQuery("Select cliente,sospeso,datam2 from headmov where nmov =  " & cursorWrapper7.GetString("nmov"))
																					If cursorWrapper22.RowCount > 0 Then
																						cursorWrapper22.Position = 0
																						Dim vGetString4 As String = cursorWrapper22.GetString("cliente")
																						If IsNumber(vGetString4) And vGetInt2 <> 22 Then
																							Dim cursorWrapper23 As Cursor
																							Dim cursorWrapper24 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice = '" & vGetString4 & "'")
																							If cursorWrapper24.RowCount > 0 Then
																								cursorWrapper24.Position = 0
																								str8 = Sub094(IIf(vGetInt2 <> 1, str8 & " " & CRLF & "******************************" & CRLF, str8 & " " & CRLF), cursorWrapper24, cursorWrapper7)
																								If vGetInt2 <> 1 Then
																									str8 = str8 & "******************************" & CRLF
																								End If
																							End If
																							cursorWrapper24.Close
																						End If
																						Dim str37 As String = str8
																						str8 = IIf(Main.v_asportoora And (cursorWrapper22.GetInt("sospeso") = 1 Or cursorWrapper7.GetInt("sospeso") = 1), str37 & " " & CRLF & "******************************" & CRLF & "Ora Ritiro: " & cursorWrapper22.GetString("datam2").SubString(10) & CRLF & "******************************" & CRLF, str37)
																					End If
																					cursorWrapper22.Close
																				Else
																					str8 = str36
																				End If
																				If i19 > 0 Then
																					str8 = str8 & " " & CRLF & "******************************" & CRLF & "COPIA " & i20 + 1 & CRLF & "******************************" & CRLF
																				End If
																				If Not(z21) Then
																					Sub181(vTmp, cursorWrapper7.GetInt("codstampa"), vGetInt6, parseDouble, vGetInt2, str8, d7, cursorWrapper7.GetString("nmov"), map, cursorWrapper7.GetString("id"))
																					vTmp.doc_pagfine(cursorWrapper4.GetInt("notaglio") = 1)
																					vTmp.doc_fine
																				End If
																				i20 = i20 + 1
																				i4 = i24
																			Catch
																				e = e7
																			End Try
																		Loop
																		z8 = z22
																		str6 = str27
																		d5 = d6
																		str7 = str28
																		If Main.v_turni Then
																			Main.vSql1.ExecNonQuery("delete from HeaddaStampare where id = '" & cursorWrapper7.GetString("id") & "'")
																			Main.vSql1.ExecNonQuery("delete from daStampare where id = '" & cursorWrapper7.GetString("id") & "'")
																		Else
																			vLst1.Add(cursorWrapper7.GetString("id"))
																		End If
																		Main.vSql1.ExecNonQuery("update confstampe set counter = counter +1 where codice = " & cursorWrapper7.GetInt("codstampa"))
																		z7 = z21
																	Else
																		z7 = z18
																		str6 = str4
																		i4 = i18
																		z8 = z19
																		str7 = str21
																	End If
																	cursorWrapper.Close
																End If
															End If
															str3 = str25
															str4 = str22
															str5 = "*"
															If Main.v_turni Then
															End If
															If cursorWrapper.RowCount <= 0 Then
															End If
															cursorWrapper.Close
														End If
														i17 = i17 + 1
														str21 = str7
														z18 = z7
														str22 = str6
														z17 = z8
														i18 = i4
													Loop
													z6 = z17
													d = d5
													str2 = str21
													str = str22
													i2 = i18
												Else
													i2 = i13
													z6 = z14
													str = str19
													str2 = str18
													d = d5
												End If
												Dim i36 As Int = IIf(cursorWrapper4.GetInt("cp1") = 1, 1, 0)
												If cursorWrapper4.GetInt("cp2") = 1 Then
													i36 = 2
												End If
												If Main.v_spooler Then
													vTmp.vInt3 = 0
												End If
												Sub186(i36, vTmp)
												cursorWrapper7.Close
												If Main.v_disconnettiprt Then
													vTmp.Sub001
												End If
												i3 = i2
												i12 = i
											End If
										End If
										i = i12
										If i <> 2 Then
										End If
									Else If z2 Then
										CallSub2("Main", "StampaComandaSuMF", i14)
										i3 = i13
										z6 = z14
										str = str19
										str2 = str18
										d = d5
									Else
										Starter.v7.Interval = 1500
										i3 = i13
										z6 = z14
										str = str19
										str2 = str18
										d = d5
									End If
								Else
									i3 = i13
									z6 = z14
									str = str19
									str2 = str18
									d = d5
								End If
								i14 = i14 + 1
								d5 = d
								str18 = str2
								str19 = str
								z14 = z6
								i13 = i3
							End If
						End If
						z5 = False
						If Not(z5) Then
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from HeaddaStampare where codstampa = " & i14 + 1) = 0 Then
						End If
						If cursorWrapper4.GetInt("mf") <> 1 Then
						End If
						i14 = i14 + 1
						d5 = d
						str18 = str2
						str19 = str
						z14 = z6
						i13 = i3
					End If
				End If
			End If
			z4 = False
			If Main.vInt10 = 1 Then
			End If
			z5 = False
			If Not(z5) Then
			End If
			If Main.vSql1.ExecQuerySingleResult("select count(*) from HeaddaStampare where codstampa = " & i14 + 1) = 0 Then
			End If
			If cursorWrapper4.GetInt("mf") <> 1 Then
			End If
			i14 = i14 + 1
			d5 = d
			str18 = str2
			str19 = str
			z14 = z6
			i13 = i3
		Loop
		If Main.v_turni Then
			Dim size2 As Int = vLst1.Size - 1
			Dim i37 As Int
			For i37 = 0 To size2
				Main.vSql1.ExecNonQuery("delete from HeaddaStampare where id = '" & vLst1.Get(i37) & "'")
				Main.vSql1.ExecNonQuery("delete from daStampare where id = '" & vLst1.Get(i37) & "'")
			Next
		End If
		cursorWrapper4.Close
	Catch
		Sub217(LastException.Message)
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m4… (riga 17654).
Sub Sub181(ckprinterVar As ckprinter, str As String, str2 As String, i As Int, i2 As Int, str3 As String, d As Double, str4 As String, map As Map, str5 As String)
	If i2 <> 1 Then
		ckprinterVar.doc_testostampa(" ")
	End If
	ckprinterVar.doc_testogiustifica(1)
	If i2 = 12 Then
		ckprinterVar.doc_testostile(False, True, True, False, False, False, False, Sub096(map, "FNumeroComandaCoperti"))
		If i > 0 Then
			ckprinterVar.doc_testostampa("Coperti:" & i)
		End If
		ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
	Else
		ckprinterVar.doc_testostile(i2 = 1, i2 <> 2, False, False, False, False, False, Sub096(map, "FNumeroComandaCoperti"))
		If i > 0 Then
			ckprinterVar.doc_testostampa("Coperti:" & i)
		End If
	End If
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select counter from confstampe where codice = " & str)
	If str2 > 1 Then
		Dim parseDouble2 As Double = str2
	End If
	str2 = Main.Operatore
	Main.vCur5.Position = str2 - 1
	If str3 <> "" Then
		If str3.Contains(CRLF) Then
			Dim vSplit() As String = Regex.Split(CRLF, str3)
			If vSplit.Length > 0 Then
				Dim length As Int = vSplit.Length - 1
				Dim i3 As Int
				For i3 = 0 To length
					If (i2 = 4 Or i2 = 5) And Not(vSplit(i3).StartsWith("******************************")) Then
						ckprinterVar.doc_testostile(False, True, True, False, False, False, False, Sub096(map, "FMemo"))
						ckprinterVar.doc_testostampa(vSplit(i3))
					Else
						ckprinterVar.doc_testostile(i2 = 1, i2 <> 2, False, False, False, False, False, Sub096(map, "FMemo"))
						ckprinterVar.doc_testostampa(vSplit(i3))
					End If
				Next
			End If
		Else
			ckprinterVar.doc_testostile(i2 = 1, i2 <> 2, False, False, False, False, False, Sub096(map, "FMemo"))
			ckprinterVar.doc_testostampa(str3)
		End If
		ckprinterVar.doc_testostile(i2 = 1, i2 <> 2, False, False, False, False, False, Sub096(map, "FNumeroComandaCoperti"))
	End If
	If i2 = 6 And d > 0 Then
		ckprinterVar.doc_testostile(False, True, True, False, False, False, False, Sub096(map, "FMemo"))
		ckprinterVar.doc_testostampa("------------------------------------")
		ckprinterVar.doc_testostampa(modfunstr.left("TOTALE" & modfunstr.Sub004(27), 27) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d, 1, 2, 2, False), 9))
		ckprinterVar.doc_testostile(False, True, False, False, False, False, False, Sub096(map, "FNumeroComandaCoperti"))
		ckprinterVar.doc_testostampa("Art." & vInt1 & "  Comanda:" & parseDouble & "  M." & str4)
		ckprinterVar.doc_testostile(False, True, True, False, False, False, False, Sub096(map, "FNumeroComandaCoperti"))
		ckprinterVar.doc_testostampa(Main.vCur5.GetString("descrizione"))
	Else If vInt3 = -5 Then
		ckprinterVar.doc_testostampa("Art." & vInt1 & "  " & Main.vCur5.GetString("descrizione"))
	Else
		ckprinterVar.doc_testostampa("Art." & vInt1 & "  Comanda:" & parseDouble & "  " & Main.vCur5.GetString("descrizione") & "  M." & str4)
	End If
	If i2 = 22 Then
		Dim parseDouble3 As Int = Main.vSql1.ExecQuerySingleResult("select case when sum(qta) is null then 0 else sum(qta) end as tot from daStampare where id = '" & str5 & "'  and lower(substr(codice,1,2))<>'vv' and lower(substr(codice,1,2))<>'ww'")
		ckprinterVar.doc_testostile(False, True, True, False, False, False, False, "")
		If parseDouble3 = 1 Then
			ckprinterVar.doc_testostampa(parseDouble3 & " Pezzo")
		Else
			ckprinterVar.doc_testostampa(parseDouble3 & " Pezzi")
		End If
	End If
	vInt1 = 0
End Sub

Sub Sub182(ckprinterVar As ckprinter, i As Int, i2 As Int, str As String, i3 As Int, z As Boolean, cursorWrapper As Cursor, map As Map, i4 As Int, z2 As Boolean)
	vInt3 = i2
	If i4 > 0 Then
		ckprinterVar.doc_testostampanrighevuote(i4)
	End If
	ckprinterVar.doc_testogiustifica(1)
	If i3 = 21 Then
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
		If cursorWrapper3.RowCount > 0 Then
			ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
			Dim i5 As Int
			For i5 = 0 To 5
				cursorWrapper3.Position = i5
				ckprinterVar.doc_testostampa(cursorWrapper3.GetString("descrizione"))
			Next
			ckprinterVar.doc_testostampa(" ")
		End If
		cursorWrapper3.Close
	End If
	vInt1 = 0
	Dim sb2 As String = DateTime.Date(Sub058()).SubString2(3, 5) & "/" & DateTime.Date(Sub058()).SubString2(0, 2) & DateTime.Date(Sub058()).SubString(5)
	If Not(Main.vBln25) Then
		If Not(Main.vBln24) And z2 And Not(z) And i <= 0 And i2 <> -5 Then
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from headmov where sospeso=1 and nmov =  " & cursorWrapper.GetString("nmov")) > 0 Then
				Dim vTmp As String = Sub022("44444" & modfunstr.Sub003("00000000" & cursorWrapper.GetString("nmov"), 7))
				If vTmp.Length = 13 Then
					ckprinterVar.doc_barcodeean13stampa(vTmp)
				End If
				ckprinterVar.doc_testostampa(" ")
				ckprinterVar.doc_testostampa(" ")
				ckprinterVar.doc_testostampa(" ")
			End If
		End If
	End If
	If i3 = 3 Then
		ckprinterVar.doc_testostile(False, True, True, False, False, False, False, "")
		ckprinterVar.doc_testostampa(str)
		ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
		ckprinterVar.doc_testostampa("Ore " & DateTime.Time(Sub058()))
		ckprinterVar.doc_testostile(i3 = 1, i3 <> 2, False, False, False, False, False, Sub096(map, "HTestataDellaStampa"))
	Else
		ckprinterVar.doc_testostile(i3 = 1, i3 <> 2, False, False, False, False, False, Sub096(map, "HTestataDellaStampa"))
		If i3 <> 22 Then
			ckprinterVar.doc_testostampa(sb2 & " " & DateTime.Time(Sub058()) & "   " & str)
		Else
			ckprinterVar.doc_testostampa(sb2 & " " & DateTime.Time(Sub058()))
		End If
	End If
	If i3 = 6 Then
		ckprinterVar.doc_testostile(False, True, True, False, False, False, False, Sub096(map, "HTestataDellaStampa"))
		ckprinterVar.doc_testostampa("RITIRARE LO SCONTRINO FISCALE ALLA CASSA")
	End If
	If cursorWrapper.GetInt("RistampaTutto") = 1 Then
		ckprinterVar.doc_testostampa("********************")
		ckprinterVar.doc_testostampa("***** RISTAMPA *****")
		ckprinterVar.doc_testostampa("********************")
	End If
	If Not(z) Then
		If i3 <> 1 And i3 <> 22 Then
			ckprinterVar.doc_testostampa(" ")
		End If
		ckprinterVar.doc_testostile(i3 = 1, i3 <> 2, i3 <> 1, i3 <> 2, False, False, False, Sub096(map, "HDicituraSalaAsportoTavolo"))
		If i > 0 Then
			If Main.v_stampasala Then
				If Main.vMap5.ContainsKey(i) Then
					ckprinterVar.doc_testostampa("Sala " & Main.vMap5.Get(i))
				Else
					Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select descrizione from Despagine inner join pagine on pagine.pagina = despagine.codice where pagine.tipo =9 AND valore = " & i & " limit 1")
					If vExecQuerySingleResult <> Null Then
						Main.vMap5.Put(i, vExecQuerySingleResult)
						ckprinterVar.doc_testostampa("Sala " & vExecQuerySingleResult)
					End If
				End If
				If Main.vMap6.ContainsKey(i) Then
					ckprinterVar.doc_testostampa(Main.vMap6.Get(i))
				Else
					Dim vTmp_ As String = Sub107(i)
					If vTmp_ <> Null Then
						Main.vMap6.Put(i, vTmp_)
						ckprinterVar.doc_testostampa(vTmp_)
					End If
				End If
			Else
				ckprinterVar.doc_testostampa("Tavolo " & i)
			End If
		Else
			If cursorWrapper.GetInt("oldasporto") >= 0 And i2 <> -5 Then
				ckprinterVar.doc_testostampa(" ***** ")
				ckprinterVar.doc_testostampa("Annulla Asporto " & cursorWrapper.GetInt("oldasporto"))
				ckprinterVar.doc_testostampa(" ***** ")
			End If
			If i2 = -5 Then
				Dim cursorWrapper4 As Cursor
				Dim cursorWrapper5 As Cursor = Main.vSql2.ExecQuery("Select datam2,clides from headmov where nmov = " & cursorWrapper.GetString("nmov"))
				If cursorWrapper5.RowCount > 0 Then
					cursorWrapper5.Position = 0
					Dim vGetString As String = cursorWrapper5.GetString("datam2")
					Dim vGetString2 As String = cursorWrapper5.GetString("clides")
					If Not(vGetString = Null) And vGetString.Length > 16 Then
						ckprinterVar.doc_testostile(False, True, True, True, False, False, False, Sub096(map, "FPrenotazioneNumero"))
						If Main.vStr8.ToLowerCase = "lavandro" Then
							ckprinterVar.doc_testostampa("Ritiro " & cursorWrapper.GetString("nmov"))
						Else
							ckprinterVar.doc_testostampa("Prenotazione " & cursorWrapper.GetString("nmov"))
						End If
						Dim sb3 As String = vGetString.SubString2(3, 5) & "/" & vGetString.SubString2(0, 2) & "/" & IIf(Main.v_asportoora, vGetString.SubString(6), vGetString.SubString2(6, 10))
						Dim parseDouble As Long = Main.vSql2.ExecQuerySingleResult("Select NDocStampato from headmov where  nmov = " & cursorWrapper.GetString("nmov"))
						ckprinterVar.doc_testostile(False, True, True, False, False, False, False, Sub096(map, "FPrenotazioneData"))
						ckprinterVar.doc_testostampa(IIf(parseDouble > 0, sb3 & " -Doc. " & parseDouble & "-", sb3))
						If vGetString2 <> "" Then
							ckprinterVar.doc_testostampa("Cli. " & vGetString2)
						End If
					End If
				End If
				cursorWrapper5.Close
			Else If i3 <> 22 Then
				If i2 = -10 Then
					ckprinterVar.doc_testostampa("DOMICILIO")
				Else
					If Main.v_disconnettiprt Then
						ckprinterVar.doc_testostampa(Main.v_desasporto & " " & Chr(64 + Main.v_numcassa) & i2)
					Else
						ckprinterVar.doc_testostampa(Main.v_desasporto & " " & i2)
					End If
				End If
			End If
		End If
		If i3 <> 1 Then
			ckprinterVar.doc_testostampa("  ")
		End If
		If i3 = 22 Then
			Sub187(cursorWrapper, ckprinterVar)
		End If
		ckprinterVar.doc_testogiustifica(0)
	Else
		If Main.v_stampasala And i > 0 Then
			If Not(Main.vMap5.ContainsKey(i)) Then
				Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("select descrizione from Despagine inner join pagine on pagine.pagina = despagine.codice where pagine.tipo =9 AND valore = " & i & " limit 1")
				If vExecQuerySingleResult2 <> Null Then
					Main.vMap5.Put(i, vExecQuerySingleResult2)
				End If
			End If
			If Not(Main.vMap6.ContainsKey(i)) Then
				Dim vTmp__ As String = Sub107(i)
				If vTmp__ <> Null Then
					Main.vMap6.Put(i, vTmp__)
				End If
			End If
		End If
	End If
	If i3 = 17 Then
		Dim vExecQuerySingleResult3 As String = Main.vSql1.ExecQuerySingleResult("Select memo from tavoli where tavolo = " & i)
		If Not(vExecQuerySingleResult3 = Null) And vExecQuerySingleResult3 <> "" Then
			ckprinterVar.doc_testostile(False, True, True, False, False, False, False, Sub096(map, "HTestataDellaStampa"))
			ckprinterVar.doc_testostampa(vExecQuerySingleResult3)
			Return
		End If
		Return
	End If
End Sub

Sub Sub183(z As Boolean, z2 As Boolean, str As String)
	Dim vTmp As ckprinter
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe order by codice")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			If cursorWrapper2.GetInt("stato") = 1 Then
				Dim vGetInt As Int = IIf(cursorWrapper2.GetInt("indice") > 0, cursorWrapper2.GetInt("indice"), i + 1)
				If Main.vMap2.ContainsKey(vGetInt) Then
					vTmp = Sub102(Main.vMap2.Get(vGetInt))
				Else
					vTmp = Sub102(vGetInt)
				End If
				If vTmp.vBln5 And (z2 Or Not(vTmp.vkprinterstatus1.InError)) Then
					Dim vTmp_ As String = Sub103(vTmp)
					Dim i2 As Int = 1
					If vTmp_.StartsWith("Errore") Then
						If Not(z2) Then
							Continue
						Else
							Dim i3 As Int = -1
							Do While True
								If i3 <> -1 Then
									Exit
								End If
								i3 = -2
								i2 = 1
								If vTmp_.StartsWith("Errore") Then
									If Main.v_disconnettiprt Then
										vTmp.Sub001
									End If
									i2 = 2
									cursorWrapper2.Position = i
									Dim str2 As String = vTmp_ & CRLF & "Stampante  " & cursorWrapper2.GetString("descrizione") & CRLF & "Si desidera riprovare o considerare la stampante 'Guasta' ?"
									vBln8 = True
									If vStr1 = "" Then
										ToastMessageShow(str2, True)
										i2 = 1
										Exit
									End If
									i3 = CallSub2(vStr1, "msgboxAct", str2)
									If i3 = -3 Then
										i3 = -1
									End If
									If i3 <> -1 Then
										If vStr1 <> "" Then
											Dim vObjectToNumber As Int = CallSub2(vStr1, "ErrPrtAct", vGetInt)
											If vObjectToNumber > 0 Then
												Main.vMap2.Put(vGetInt, vObjectToNumber)
												i2 = 1
											End If
										End If
										If Main.v_errmail Then
											If Main.v_md3 <> "" Then
												Sub132("Errore Stampante", vSMTP1, str2, False)
											End If
										End If
									Else
										vTmp_ = Sub103(vTmp)
									End If
								End If
							Loop
							vBln8 = False
							If Main.v_lognf And i2 = 2 Then
								vTmp.Sub003("Stampante impostata su GUASTA dall'utente", True)
							End If
							Main.vSql1.ExecNonQuery("update confstampe set stato = " & i2 & " where codice = " & cursorWrapper2.GetString("codice"))
						End If
					Else If vTmp_ <> "" Then
						ToastMessageShow("Stampante  " & cursorWrapper2.GetString("descrizione") & CRLF & vTmp_, True)
					End If
					If i2 = 2 Then
						Dim cursorWrapper3 As Cursor
						If Main.v_disconnettiprt Then
							vTmp.Sub001
						End If
						Return
					End If
					vTmp.doc_testostile(False, True, False, False, False, False, False, "")
					vTmp.doc_testogiustifica(1)
					vTmp.doc_testostampa(DateTime.Date(Sub058()).SubString2(3, 5) & "/" & DateTime.Date(Sub058()).SubString2(0, 2) & DateTime.Date(Sub058()).SubString(5) & " " & DateTime.Time(Sub058()) & "   " & cursorWrapper2.GetString("descrizione"))
					vTmp.doc_testostile(False, True, True, False, False, False, False, "")
					vTmp.doc_testostampa(" ")
					vTmp.doc_testostampa("------------------------------------")
					Dim vSplit() As String = Regex.Split(CRLF, str)
					Dim length As Int = vSplit.Length - 1
					Dim i4 As Int
					For i4 = 0 To length
						vTmp.doc_testostampa(vSplit(i4))
					Next
					vTmp.doc_testostampa("------------------------------------")
					vTmp.doc_pagfine(False)
					vTmp.doc_fine
					If Main.v_disconnettiprt Then
						vTmp.Sub001
					End If
				End If
			End If
		Next
		cursorWrapper2.Close
	Catch
		Sub217(LastException.Message)
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m1… (riga 18096).
Sub Sub184(cursorWrapper As Cursor, i As Int, str As String, cursorWrapper2 As Cursor, j As Long, d As Double, d2 As Double, j2 As Long, z As Boolean, d3 As Double, i2 As Int, d4 As Double, d5 As Double, z2 As Boolean, str2 As String, i3 As Int, str3 As String, d6 As Double, i4 As Int, d7 As Double) As Boolean
	Dim vTmp As ckprinter
	Dim d8 As Double
	Dim parseDouble As Double
	Dim parseDouble2 As Int
	Dim d9 As Double
	Dim d10 As Double
	Dim z3 As Boolean
	Try
		Dim cursorWrapper3 As Cursor
		Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe where codice = " & i3)
		If j > 0 Then
			z2 = False
		End If
		cursorWrapper4.Position = 0
		If cursorWrapper4.GetInt("stato") = 1 And cursorWrapper4.GetInt("mf") <> 1 Then
			If Main.vMap2.ContainsKey(i3) Then
				vTmp = Sub102(Main.vMap2.Get(i3))
			Else
				vTmp = Sub102(i3)
			End If
			If Not(vTmp.vBln5) Then
				Return False
			End If
			Dim vTmp_ As String = Sub103(vTmp)
			Dim i5 As Int = 1
			If vTmp_.StartsWith("Errore") Then
				Dim i6 As Int = -1
				Do While True
					If i6 <> -1 Then
						Exit
					End If
					If Not(vTmp_.StartsWith("Errore")) Then
						i5 = 1
						i6 = -2
					Else
						If Main.v_disconnettiprt Then
							vTmp.Sub001
						End If
						Dim str4 As String = vTmp_ & CRLF & "Stampante  " & cursorWrapper4.GetString("descrizione") & CRLF & "Si desidera riprovare o considerare la stampante 'Guasta' ?"
						vBln8 = True
						If vStr1 = "" Then
							ToastMessageShow(str4, True)
							i5 = 1
							Exit
						End If
						Dim vObjectToNumber As Int = CallSub2(vStr1, "msgboxAct", str4)
						If vObjectToNumber = -3 Then
							vObjectToNumber = -1
						End If
						If vObjectToNumber <> -1 Then
							If vStr1 <> "" Then
								Dim vObjectToNumber2 As Int = CallSub2(vStr1, "ErrPrtAct", i3)
								If vObjectToNumber2 > 0 Then
									Main.vMap2.Put(i3, vObjectToNumber2)
									i5 = 1
									If Main.v_errmail Then
										If Main.v_md3 <> "" Then
											Sub132("Errore Stampante", vSMTP1, str4, False)
										End If
									End If
								End If
							End If
							i5 = 2
							If Main.v_errmail Then
							End If
						Else
							vTmp_ = Sub103(vTmp)
							i5 = 2
							i6 = vObjectToNumber
						End If
					End If
				Loop
				vBln8 = False
				If Main.v_lognf And i5 = 2 Then
					vTmp.Sub003("Stampante impostata su GUASTA dall'utente", True)
				End If
				Main.vSql1.ExecNonQuery("update confstampe set stato = " & i5 & " where codice = " & cursorWrapper4.GetString("codice"))
			Else If vTmp_ <> "" Then
				ToastMessageShow("Stampante  " & cursorWrapper4.GetString("descrizione") & CRLF & vTmp_, True)
			End If
			If i5 = 2 Then
				Dim cursorWrapper5 As Cursor
				If Main.v_disconnettiprt Then
					vTmp.Sub001
				End If
				Return False
			End If
			If cursorWrapper.RowCount > 0 Then
				vTmp.doc_inizio
				vTmp.doc_paginizio(False)
				If File.Exists(File.DirDefaultExternal & "/Loghi", "LogoK.buf") Then
					vTmp.doc_img("LogoK.buf", File.DirDefaultExternal & "/Loghi")
				End If
				If Main.v_intestanf Then
					Dim cursorWrapper6 As Cursor
					Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
					If cursorWrapper7.RowCount > 0 Then
						vTmp.doc_testostile(False, True, False, False, False, False, False, "")
						Dim i8 As Int
						For i8 = 0 To 5
							cursorWrapper7.Position = i8
							vTmp.doc_testogiustifica(1)
							vTmp.doc_testostampa(cursorWrapper7.GetString("descrizione"))
						Next
					End If
				End If
				vTmp.doc_testostile(False, True, True, False, False, False, False, "")
				vTmp.doc_testogiustifica(1)
				Sub197(str2, vTmp, "")
				If i > 0 Then
					vTmp.doc_testostampa(Sub107(i))
				End If
				If str3 <> "" And str = "" Then
					vTmp.doc_testostampa("*********************")
					vTmp.doc_testostampa("  COD.FIS. / P.IVA   ")
					vTmp.doc_testostampa(str3.ToUpperCase)
					vTmp.doc_testostampa("*********************")
				End If
				vTmp.doc_testostampa("------------------------------------")
				vTmp.doc_testostile(False, True, False, False, False, False, False, "")
				Dim rowCount As Int = cursorWrapper.RowCount - 1
				Dim d11 As Double = 0
				Dim i9 As Int
				For i9 = 0 To rowCount
					cursorWrapper.Position = i9
					Dim doubleValue As Double = cursorWrapper.GetDouble("qta")
					Dim doubleValue2 As Double = cursorWrapper.GetDouble("importo")
					If z2 Then
						Dim doubleValue3 As Double = cursorWrapper.GetDouble("Qtad")
						d9 = cursorWrapper.GetDouble("importod")
						d10 = doubleValue3
					Else
						d9 = doubleValue2
						d10 = doubleValue
					End If
					If Main.v_articolizero <> 0 Then
						If Main.v_articolizero <> 2 Then
							z3 = False
							If d10 <> 1 And (d9 <> 0 Or z3 Or cursorWrapper.GetString("codint") = "888889" Or cursorWrapper.GetString("codint") = "888888") And Not(Sub029(cursorWrapper.GetString("codint"))) And Not(Sub028(cursorWrapper.GetString("codint"))) Then
								If cursorWrapper.GetString("codint") <> "rgr" Or d10 Mod 1 = 0 Then
									vTmp.doc_testostampa(NumberFormat(d10, 1, 0) & " x " & NumberFormat2(cursorWrapper.GetDouble("prezzov"), 1, 2, 2, False))
								Else
									vTmp.doc_testostampa(NumberFormat2(d10, 1, 2, 2, False) & " x " & NumberFormat2(cursorWrapper.GetDouble("prezzov"), 1, 2, 2, False))
								End If
							End If
							If d9 = 0 Or z3 Or cursorWrapper.GetString("codint") = "888889" Or cursorWrapper.GetString("codint") = "888888" Then
								vTmp.doc_testostampa(modfunstr.left(modfunstr.left(cursorWrapper.GetString("descrizione"), 29) & modfunstr.Sub004(29), 29) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(d9, 1, 2, 2, False), 7))
							End If
							If cursorWrapper.GetString("memo") = "" Then
								vTmp.doc_testostampa(cursorWrapper.GetString("memo").Trim)
								vTmp.doc_testostampa(" ")
							End If
							d11 = Round2(d11 + d9, 2)
						End If
					End If
					z3 = True
					If d10 <> 1 Then
						If cursorWrapper.GetString("codint") <> "rgr" Then
						End If
						vTmp.doc_testostampa(NumberFormat(d10, 1, 0) & " x " & NumberFormat2(cursorWrapper.GetDouble("prezzov"), 1, 2, 2, False))
					End If
					If d9 = 0 Then
					End If
					vTmp.doc_testostampa(modfunstr.left(modfunstr.left(cursorWrapper.GetString("descrizione"), 29) & modfunstr.Sub004(29), 29) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(d9, 1, 2, 2, False), 7))
					If cursorWrapper.GetString("memo") = "" Then
					End If
					d11 = Round2(d11 + d9, 2)
				Next
				If d2 <= 0 Or j <> 0 Then
					d8 = d11
				Else
					vTmp.doc_testostampa(modfunstr.left(modfunstr.left("Servizio", 29) & modfunstr.Sub004(29), 29) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(d2, 1, 2, 2, False), 7))
					d8 = Round2(d11 + d2, 2)
				End If
				Dim str5 As String = "scov"
				If z2 Then
					str5 = "scovd"
				End If
				If j > 0 Then
					parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(" & str5 & ") is null then 0 else sum(" & str5 & ") end from Venduto where flgNF = 1 and nmov = " & j)
				Else
					parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(" & str5 & ") is null then 0 else sum(" & str5 & ") end from Ventmp")
				End If
				If parseDouble > 0 Then
					vTmp.doc_testostampa("------------------------------------")
					vTmp.doc_testostampa("Sconti:" & modfunstr.Sub004(22) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(parseDouble, 1, 2, 2, False).Replace(".", ","), 7))
					vTmp.doc_testostampa("------------------------------------")
				End If
				If j > 0 Then
					parseDouble2 = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " & j)
				Else
					parseDouble2 = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from Ventmp where (codint ='888888' or codint ='888889')")
				End If
				If parseDouble2 > 0 Then
					If Not(Main.vBln12) Then
						If Main.v_desatesta <> "" Then
							vTmp.doc_testostampa("------------------------------------")
							vTmp.doc_testostampa(Main.v_desatesta & ":" & modfunstr.Sub004(28 - Main.v_desatesta.Length) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(Round2(d8 / parseDouble2, 2), 1, 2, 2, False).Replace(".", ","), 7))
							vTmp.doc_testostampa("------------------------------------")
						End If
					End If
				End If
				Sub192(j, vTmp, i, str, cursorWrapper2, j2, z, d3, i2, d4, d5, d6, False, i4, d7)
				vTmp.doc_testostampa("------------------------------------")
				vTmp.doc_testostile(False, True, True, False, False, False, False, "")
				vTmp.doc_testostampa("TOT." & modfunstr.Sub003(modfunstr.Sub004(32) & NumberFormat2(d8, 1, 2, 2, False), 32))
				If j > 0 And d > 0 And d > d8 Then
					vTmp.doc_testostile(False, True, False, False, False, False, False, "")
					Dim cursorWrapper8 As Cursor
					Dim cursorWrapper9 As Cursor = Main.vSql1.ExecQuery("Select descrizione from causalipagamenti where nmov = " & j)
					If cursorWrapper9.RowCount > 0 Then
						cursorWrapper9.Position = 0
						vTmp.doc_testostampa(modfunstr.left(cursorWrapper9.GetString("descrizione").Trim & modfunstr.Sub004(27), 27) & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(d, 1, 2, 2, False).Replace(".", ","), 9))
					End If
					vTmp.doc_testostampa("RESTO" & modfunstr.Sub003(modfunstr.Sub004(31) & NumberFormat2(Abs(d - d8), 1, 2, 2, False).Replace(".", ","), 31))
				End If
				Dim sb17 As String = DateTime.Date(Sub058()).SubString2(3, 5) & "/" & DateTime.Date(Sub058()).SubString2(0, 2) & DateTime.Date(Sub058()).SubString(5)
				vTmp.doc_testostile(False, False, False, False, False, False, False, "")
				vTmp.doc_testostampa(sb17 & " " & DateTime.Time(Sub058()) & modfunstr.Sub004(36 - modfunstr.Sub001(sb17 & " " & DateTime.Time(Sub058()))))
				vTmp.doc_pagfine(False)
				vTmp.doc_fine
				If Main.v_disconnettiprt Then
					vTmp.Sub001
				End If
				cursorWrapper4.Close
				Return True
			End If
			If Main.v_disconnettiprt Then
				vTmp.Sub001
			End If
			cursorWrapper4.Close
			Return False
		End If
		Return False
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub185(j As Long, d As Double, str As String, z As Boolean) As Boolean
	If Main.v_stampafattura = 300 Then
		If Main.v_iprpi = "" Then
			Dim vObjectToCharSequence As Object = "Non è stato configurato il ServiceBox." & CRLF & "Il conto verrà stampato con il sistema integrato"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Else
			Dim mdatidocsbVar As mdatidocsb
			mdatidocsbVar.Cliente = str
			mdatidocsbVar.DaVenduto = z
			mdatidocsbVar.nFattura = ""
			mdatidocsbVar.nmov = j
			mdatidocsbVar.TmpFattura = ""
			mdatidocsbVar.TmpHeadDoc = ""
			mdatidocsbVar.Totale = NumberFormat2(d, 1, 2, 2, False)
			mdatidocsbVar.TipoDoc = "TipoDocConto"
			If Not( = Null) Then
				 = 
			End If
			CallSubDelayed2(Main, "PreparaFileSB", mdatidocsbVar)
			Return True
		End If
	End If
	Return False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m6… (riga 18526).
Sub Sub186(i As Int, ckprinterVar As ckprinter)
	Dim parseDouble As Int
	If i = 0 Then
		Return
	End If
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from StampaCP where cp <>10 ")
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount
				cursorWrapper2.Position = i2
				If (i <> 1 Or Not(cursorWrapper2.GetString("cp").EndsWith("1"))) And (i <> 2 Or Not(cursorWrapper2.GetString("cp").EndsWith("0"))) Then
					If cursorWrapper2.GetString("cp").StartsWith("9") Or cursorWrapper2.GetString("cp").StartsWith("8") Then
						Dim cursorWrapper3 As Cursor
						Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from venduto where nmov=" & cursorWrapper2.GetString("nmov"))
						If cursorWrapper4.RowCount > 0 Then
							ckprinterVar.doc_inizio
							ckprinterVar.doc_paginizio(False)
							If File.Exists(File.DirDefaultExternal & "/Loghi", "LogoK.buf") Then
								ckprinterVar.doc_img("LogoK.buf", File.DirDefaultExternal & "/Loghi")
							End If
							If Main.v_intestanf Then
								Dim cursorWrapper5 As Cursor
								Dim cursorWrapper6 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
								If cursorWrapper6.RowCount > 0 Then
									ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
									Dim i3 As Int
									For i3 = 0 To 5
										cursorWrapper6.Position = i3
										ckprinterVar.doc_testogiustifica(1)
										ckprinterVar.doc_testostampa(cursorWrapper6.GetString("descrizione"))
									Next
								End If
								cursorWrapper6.Close
							End If
							ckprinterVar.doc_testostile(False, True, True, False, False, False, False, "")
							ckprinterVar.doc_testogiustifica(1)
							ckprinterVar.doc_testostampa(Main.v_despreconto)
							If cursorWrapper2.GetInt("tavolo") > 0 Then
								ckprinterVar.doc_testostampa(Sub107(cursorWrapper2.GetString("tavolo")))
							End If
							ckprinterVar.doc_testostampa("------------------------------------")
							ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
							Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
							Dim i4 As Int = 0
							Dim d As Double = 0
							Dim i5 As Int = 0
							Do While i4 <= rowCount2
								cursorWrapper4.Position = i4
								If cursorWrapper4.GetDouble("qta") <> 1 And cursorWrapper4.GetDouble("importo") <> 0 And Not(Sub029(cursorWrapper4.GetString("codint"))) And Not(Sub028(cursorWrapper4.GetString("codint"))) Then
									ckprinterVar.doc_testostampa(NumberFormat2(cursorWrapper4.GetDouble("qta"), 1, 2, 2, False) & " x " & NumberFormat2(cursorWrapper4.GetDouble("prezzov"), 1, 2, 2, False))
								End If
								If cursorWrapper4.GetDouble("importo") <> 0 Then
									ckprinterVar.doc_testostampa(modfunstr.left(modfunstr.left(cursorWrapper4.GetString("descrizione"), 29) & modfunstr.Sub004(29), 29) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(cursorWrapper4.GetDouble("importo"), 1, 2, 2, False), 7))
								End If
								If cursorWrapper4.GetString("memo") <> "" Then
									ckprinterVar.doc_testostampa(cursorWrapper4.GetString("memo").Trim)
									ckprinterVar.doc_testostampa(" ")
								End If
								Dim vRound2 As Double = Round2(cursorWrapper4.GetDouble("importo") + d, 2)
								i4 = i4 + 1
								i5 = cursorWrapper4.GetInt("cameriere")
								d = vRound2
							Loop
							ckprinterVar.doc_testostampa("--------------------------------")
							ckprinterVar.doc_testostile(False, True, True, False, False, False, False, "")
							ckprinterVar.doc_testostampa("TOT." & modfunstr.Sub003(modfunstr.Sub004(32) & NumberFormat2(d, 1, 2, 2, False), 32))
							If cursorWrapper2.GetString("nmov") > 0 Then
								parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " & cursorWrapper2.GetString("nmov"))
							Else
								parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from Ventmp where (codint ='888888' or codint ='888889')")
							End If
							If parseDouble > 0 Then
								If Main.v_desatesta <> "" Then
									ckprinterVar.doc_testostampa("------------------------------------")
									ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
									ckprinterVar.doc_testostampa(Main.v_desatesta & ":" & modfunstr.Sub004(28 - Main.v_desatesta.Length) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(Round2(d / parseDouble, 2), 1, 2, 2, False).Replace(".", ","), 7))
									ckprinterVar.doc_testostampa(" ")
								End If
							End If
							Dim sb10 As String = DateTime.Date(Sub058()).SubString2(3, 5) & "/" & DateTime.Date(Sub058()).SubString2(0, 2) & DateTime.Date(Sub058()).SubString(5)
							ckprinterVar.doc_testostile(False, False, False, False, False, False, False, "")
							ckprinterVar.doc_testostampa(sb10 & " " & DateTime.Time(Sub058()) & " Tavolo " & cursorWrapper2.GetString("tavolo"))
							If i5 > 0 Then
								If i5 <= IIf(Main.v_opextended, 40, 9) Then
									Main.vCur5.Position = i5 - 1
									ckprinterVar.doc_testostampa("Cam.:" & Main.vCur5.GetString("descrizione"))
								End If
							End If
							ckprinterVar.doc_pagfine(False)
							ckprinterVar.doc_fine
						End If
						Dim z As Boolean = False
						If cursorWrapper2.GetString("cp").StartsWith("8") Then
							Main.vSql1.ExecNonQuery("update tavoli set tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,unlocktable=0 where rifheadmov=" & cursorWrapper2.GetString("nmov"))
							Main.vSql1.ExecNonQuery("update headmov set sospeso=0 where nmov=" & cursorWrapper2.GetString("nmov"))
							Main.vSql1.ExecNonQuery("update venduto set flgNF=1 ,sospeso=0 where nmov=" & cursorWrapper2.GetString("nmov"))
							Sub015(cursorWrapper2.GetString("nmov"))
							z = Sub204(cursorWrapper2.GetString("tavolo"))
						Else
							Main.vSql1.ExecNonQuery("update tavoli set stampap=1 where tavolo = " & cursorWrapper2.GetString("tavolo"))
						End If
						If Main.vInt30 >= 10 Then
						End If
					End If
					Main.vSql1.ExecNonQuery("delete from StampaCP where nmov=" & cursorWrapper2.GetString("nmov"))
				End If
			Next
		End If
		cursorWrapper2.Close
	Catch
		Sub217(LastException.Message)
	End Try
End Sub

Sub Sub187(cursorWrapper As Cursor, ckprinterVar As ckprinter)
	Dim cursorWrapper2 As Cursor
	Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select cliente,sospeso,datam2 from headmov where nmov =  " & cursorWrapper.GetString("nmov"))
	If cursorWrapper3.RowCount > 0 Then
		cursorWrapper3.Position = 0
		Dim vGetString As String = cursorWrapper3.GetString("cliente")
		If IsNumber(vGetString) Then
			Dim cursorWrapper4 As Cursor
			Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice = '" & vGetString & "'")
			If cursorWrapper5.RowCount > 0 Then
				cursorWrapper5.Position = 0
				Dim vGetString2 As String = cursorWrapper5.GetString("via")
				Dim vGetString3 As String = cursorWrapper5.GetString("cap")
				Dim vGetString4 As String = cursorWrapper5.GetString("citta")
				Dim vGetString5 As String = cursorWrapper5.GetString("provincia")
				If Not(Sub222(cursorWrapper5.GetString("descrizione"))) Then
					ckprinterVar.doc_testostile(False, True, True, False, False, False, False, "")
					ckprinterVar.doc_testostampa(cursorWrapper5.GetString("descrizione").Trim)
				End If
				ckprinterVar.doc_testostile(False, False, False, False, False, False, False, "")
				If Not(Sub222(vGetString2)) Then
					ckprinterVar.doc_testostampa(vGetString2.Trim)
				End If
				If Not(Sub222(cursorWrapper5.GetString("telefono"))) Then
					ckprinterVar.doc_testostampa("Tel." & cursorWrapper5.GetString("telefono").Trim)
				End If
				Dim str As String = ""
				If Not(Sub222(vGetString3)) Then
					str = vGetString3.Trim & " "
				End If
				If Not(Sub222(vGetString4)) Then
					str = str & vGetString4.Trim & " "
				End If
				If Not(Sub222(vGetString5)) Then
					str = str & vGetString5.Trim & " "
				End If
				If Not(Sub222(str)) Then
					ckprinterVar.doc_testostampa(str)
				End If
			End If
			cursorWrapper5.Close
		End If
		If cursorWrapper.GetString("memo") <> "" Then
			ckprinterVar.doc_testostile(False, False, True, False, False, False, False, "")
			Sub197(Sub213(cursorWrapper.GetString("memo"), 42, ""), ckprinterVar, "")
		End If
		ckprinterVar.doc_testostampa("*********************")
	End If
	cursorWrapper3.Close
End Sub

Sub Sub188(str As String, str2 As String, sql As SQL, str3 As String, cursorWrapper As Cursor, d As Double, str4 As String, mypdfwriter As PDFWriter, stringBuilderWrapper As StringBuilder, z As Boolean, z2 As Boolean) As Boolean
	Dim i As Int
	Dim i2 As Int
	Dim z3 As Boolean
	Dim vExecQuerySingleResult As String
	Dim i3 As Int
	Dim i4 As Int
	Dim i5 As Int
	Dim i6 As Int
	If z Then
		Try
			If Main.v_iprpi = "" Then
				Dim vObjectToCharSequence As Object = "Non è stato configurato il ServiceBox." & CRLF & "La fattura verrà stampata con il sistema integrato"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else
				Dim mdatidocsbVar As mdatidocsb
				mdatidocsbVar.Cliente = str4
				mdatidocsbVar.DaVenduto = z2
				mdatidocsbVar.nFattura = str3
				mdatidocsbVar.nmov = str
				mdatidocsbVar.TmpFattura = stringBuilderWrapper.ToString
				mdatidocsbVar.TmpHeadDoc = str2
				mdatidocsbVar.Totale = d
				mdatidocsbVar.TipoDoc = "TipoDocFattura"
				CallSubDelayed2(Main, "PreparaFileSB", mdatidocsbVar)
				Return True
			End If
		Catch
			Sub217(LastException.Message)
			vStr5 = ""
			Return False
		End Try
	End If
	Dim paperSize As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize2 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.Initialize("PDFWriter1", 595, 842)
	Dim standardFonts As PDFStandardFonts = Main.vPDFStandardFonts1
	Dim standardFonts2 As PDFStandardFonts = Main.vPDFStandardFonts1
	mypdfwriter.setFont("Type1", "Courier-Bold")
	Dim list As List
	list.Initialize
	Dim cursorWrapper2 As Cursor = sql.ExecQuery("Select * from venduto where nmov= " & str & " order by QtaConDecimali,totcre,codice")
	If cursorWrapper2.RowCount = 0 Then
		Return False
	End If
	Dim rowCount As Int = cursorWrapper2.RowCount / 29 + 1
	list.Clear
	Dim z4 As Boolean = False
	Dim i7 As Int
	For i7 = 0 To 30
		list.Add(0)
	Next
	Dim i8 As Int = 0
	Dim i9 As Int = 0
	Dim i10 As Int = 1
	Dim d2 As Double = 0
	Do While Not(z4)
		Sub141(str2, "  Pag." & i10 & " di " & rowCount, cursorWrapper, str4, mypdfwriter)
		If i9 - 1 >= cursorWrapper2.RowCount - 1 Then
			Exit
		End If
		Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
		Dim i11 As Int = i8
		Dim i12 As Int = i9
		Dim i13 As Int = i10
		Dim d3 As Double = d2
		Dim i14 As Int = 100
		Dim i15 As Int = i9
		Do While True
			If i15 > rowCount2 Then
				z3 = z4
				Exit
			End If
			cursorWrapper2.Position = i15
			Dim doubleValue As Double = d3 + cursorWrapper2.GetDouble("scov")
			Dim paperSize3 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(2380 / 100, 750 - i14, 9, cursorWrapper2.GetString("codint"))
			Dim vSplit() As String = Regex.Split(CRLF, Sub213(cursorWrapper2.GetString("descrizione").Trim, 34, ""))
			Dim length As Int = vSplit.Length - 1
			Dim i16 As Int = 0
			Dim i17 As Int = i11
			Dim i18 As Int = i12
			Dim i19 As Int = i13
			Do While i16 <= length
				Dim paperSize4 As PDFPaperSizes = vPDFPaperSizes1
				mypdfwriter.addText(8925 / 100, 750 - i14, 9, vSplit(i16).Replace(")", "]").Replace("(", "["))
				If i16 = 0 And vSplit.Length = 2 Then
					Dim i20 As Int = i14 + 15
					i3 = i17 + 1
					If i3 < 28 Then
						i5 = i20
						i6 = i19
						i4 = i18
						i16 = i16 + 1
						i17 = i3
						i18 = i4
						i14 = i5
						i19 = i6
					Else
						i19 = i19 + 1
						i18 = i15 + 1
						i17 = 0
						mypdfwriter.newPage
						i14 = 100
						Sub141(str2, "  Pag." & i19 & " di " & rowCount, cursorWrapper, str4, mypdfwriter)
					End If
				End If
				i3 = i17
				i4 = i18
				i5 = i14
				i6 = i19
				i16 = i16 + 1
				i17 = i3
				i18 = i4
				i14 = i5
				i19 = i6
			Loop
			Dim paperSize5 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(30345 / 100, 750 - i14, 9, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper2.GetDouble("prezzov"), 1, 2, 2, False), 9))
			If cursorWrapper2.GetDouble("qta") * 1000 Mod 1000 = 0 Then
				Dim paperSize6 As PDFPaperSizes = vPDFPaperSizes1
				mypdfwriter.addText(39270 / 100, 750 - i14, 9, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper2.GetDouble("qta"), 1, 0, 0, False), 9))
			Else
				Dim paperSize7 As PDFPaperSizes = vPDFPaperSizes1
				mypdfwriter.addText(39270 / 100, 750 - i14, 9, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper2.GetDouble("qta"), 1, 3, 3, False), 9))
			End If
			Dim paperSize8 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(47600 / 100, 750 - i14, 9, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper2.GetDouble("importo"), 1, 2, 2, False), 9))
			Dim paperSize9 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(55335 / 100, 750 - i14, 9, cursorWrapper2.GetDouble("iva"))
			list.Set(cursorWrapper2.GetInt("iva"), list.Get(cursorWrapper2.GetInt("iva")) + cursorWrapper2.GetDouble("importo"))
			Dim z5 As Boolean = Main.vSql1.ExecQuerySingleResult("select count(*) from TestiArt where codice='" & cursorWrapper2.GetString("codint") & "'") > 0
			i12 = i18
			Dim i21 As Int = i14
			i13 = i19
			i11 = i17
			Dim i22 As Int
			For i22 = 0 To 1
				If (cursorWrapper2.GetString("memo") <> "" And i22 = 0) Or (z5 And i22 = 1) Then
					If i22 = 0 Then
						vExecQuerySingleResult = cursorWrapper2.GetString("memo").Trim
					Else
						vExecQuerySingleResult = Main.vSql1.ExecQuerySingleResult("select testo from TestiArt where codice='" & cursorWrapper2.GetString("codint") & "'")
					End If
					Dim vObjectToString As String = vExecQuerySingleResult
					Dim vSplit2() As String = Regex.Split(CRLF, Sub213(vObjectToString, 50, ""))
					Dim length2 As Int = vSplit2.Length - 1
					Dim i23 As Int
					For i23 = 0 To length2
						i21 = i21 + 7
						Dim paperSize10 As PDFPaperSizes = vPDFPaperSizes1
						mypdfwriter.addText(8925 / 100, 750 - i21, 6, vSplit2(i23).Replace(")", "]").Replace("(", "["))
						If i23 Mod 2 = 0 Then
							i11 = i11 + 1
						End If
						If i11 >= 28 Then
							Dim i24 As Int = i13 + 1
							mypdfwriter.newPage
							Sub141(str2, "  Pag." & i24 & " di " & rowCount, cursorWrapper, str4, mypdfwriter)
							i11 = 0
							i12 = i15 + 1
							i21 = 100
							i13 = i24
						End If
					Next
				End If
			Next
			i14 = i21 + 15
			If i11 >= 28 Then
				i13 = i13 + 1
				i12 = i15 + 1
				i11 = 0
				mypdfwriter.newPage
				Dim standardFonts3 As PDFStandardFonts = Main.vPDFStandardFonts1
				Dim standardFonts4 As PDFStandardFonts = Main.vPDFStandardFonts1
				mypdfwriter.setFont("Type1", "Courier-Bold")
				z3 = z4
				d3 = doubleValue
				Exit
			End If
			If i15 = cursorWrapper2.RowCount - 1 Then
				z3 = True
				d3 = doubleValue
				Exit
			End If
			i11 = i11 + 1
			i15 = i15 + 1
			d3 = doubleValue
		Loop
		i8 = i11
		i9 = i12
		z4 = z3
		i10 = i13
		d2 = d3
	Loop
	Dim i25 As Int = 150
	If stringBuilderWrapper.ToString = "" Then
		i = 150
	Else
		Dim vSplit3() As String = Regex.Split(CRLF, stringBuilderWrapper.ToString)
		Dim paperSize11 As PDFPaperSizes = vPDFPaperSizes1
		mypdfwriter.addText(1190 / 100, 150, 15, "Note:")
		Dim length3 As Int = vSplit3.Length - 1
		Dim i26 As Int
		For i26 = 0 To length3
			i25 = 138 - i26 * 12
			If vSplit3(i26).Trim <> "" Then
				Dim paperSize12 As PDFPaperSizes = vPDFPaperSizes1
				mypdfwriter.addText(1190 / 100, i25, 10, vSplit3(i26))
			End If
		Next
		i = i25 - 12
	End If
	If d2 > 0 Then
		Dim paperSize13 As PDFPaperSizes = vPDFPaperSizes1
		mypdfwriter.addText(1190 / 100, i, 13, "Totale sconti applicati:" & NumberFormat2(d2, 1, 2, 2, False))
	End If
	Dim paperSize14 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize15 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addRectangle(30345 / 100, 160, 26775 / 100, -140)
	Dim paperSize16 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(30940 / 100, 140, 11, "IVA")
	Dim paperSize17 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(35700 / 100, 140, 11, "Aliq.")
	Dim paperSize18 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(40460 / 100, 140, 11, "Imponibile")
	Dim paperSize19 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(49385 / 100, 140, 11, "Imposta")
	Dim paperSize20 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize21 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addLine(30345 / 100, 138, 57120 / 100, 138)
	Dim i27 As Int = 125
	Dim i28 As Int
	For i28 = 0 To 9
		If 0 <> list.Get(i28) Then
			Main.vCur4.Position = i28
			Dim paperSize22 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(30940 / 100, i27, 11, Main.vCur4.GetString("codice"))
			If Main.vCur4.GetDouble("aliquota2") = 0 Then
				Dim paperSize23 As PDFPaperSizes = vPDFPaperSizes1
				mypdfwriter.addText(35700 / 100, i27, 11, Main.vCur4.GetString("descrizione"))
			Else
				Dim paperSize24 As PDFPaperSizes = vPDFPaperSizes1
				mypdfwriter.addText(35700 / 100, i27, 11, Sub093(Main.vCur4.GetDouble("aliquota2")) & " %")
			End If
			Dim vObjectToNumber As Double = list.Get(i28)
			Dim vObjectToNumber2 As Double = list.Get(i28)
			Dim vRound2 As Double = Round2(vObjectToNumber - vObjectToNumber2 / (1 + Main.vCur4.GetDouble("aliquota2") / 100), 2)
			Dim paperSize25 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(40460 / 100, i27, 11, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(list.Get(i28) - vRound2, 1, 2, 2, False), 9))
			Dim paperSize26 As PDFPaperSizes = vPDFPaperSizes1
			mypdfwriter.addText(49385 / 100, i27, 11, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(vRound2, 1, 2, 2, False), 9))
			i2 = i27 - 15
		Else
			i2 = i27
		End If
		i27 = i2
	Next
	Dim paperSize27 As PDFPaperSizes = vPDFPaperSizes1
	mypdfwriter.addText(30940 / 100, 30, 16, "Tot. Fattura EUR: " & NumberFormat2(d, 1, 2, 2, False))
	mypdfwriter.ConverseDocument
	Dim str5 As String = "Fatt.N." & str3 & ".PDF"
	If str4 <> "" Then
		str5 = "Fatt.N." & str3 & " di " & Sub039(cursorWrapper.GetString("descrizione")) & ".PDF"
	End If
	mypdfwriter.outputToFile(vStr4 & "/fatture", str5, vStr3, "ISO-8859-1")
	vStr5 = str5
	Return True
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m4… (riga 19082).
Sub Sub189(str As String, z As Boolean, i As Int, str2 As String) As Boolean
	Dim z2 As Boolean
	Dim vTmp As ckprinter
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	Try
		If Not(Main.vBln35) Then
			z2 = False
		Else If i > 0 Then
			i = i - 1
			z2 = False
		Else
			i = 0
			z2 = True
		End If
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe where codice = " & Main.v_stampafattura)
		Dim i2 As Int = 0
		Dim z7 As Boolean = False
		Do While i2 <= i
			cursorWrapper2.Position = 0
			If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") <> 1 Then
				If Main.vMap2.ContainsKey(Main.v_stampafattura) Then
					vTmp = Sub102(Main.vMap2.Get(Main.v_stampafattura))
				Else
					vTmp = Sub102(Main.v_stampafattura)
				End If
				If Not(vTmp.vBln5) Then
					Return False
				End If
				Dim vTmp_ As String = Sub103(vTmp)
				Dim i3 As Int = 1
				If vTmp_.StartsWith("Errore") Then
					Dim i4 As Int = -1
					Do While True
						If i4 <> -1 Then
							Exit
						End If
						i4 = -2
						i3 = 1
						If vTmp_.StartsWith("Errore") Then
							If Main.v_disconnettiprt Then
								vTmp.Sub001
							End If
							i3 = 2
							Dim str3 As String = vTmp_ & CRLF & "Stampante  " & cursorWrapper2.GetString("descrizione") & CRLF & "Si desidera riprovare o considerare la stampante 'Guasta' ?"
							vBln8 = True
							If vStr1 = "" Then
								ToastMessageShow(str3, True)
								i3 = 1
								Exit
							End If
							i4 = CallSub2(vStr1, "msgboxAct", str3)
							If i4 = -3 Then
								i4 = -1
							End If
							If i4 <> -1 Then
								If vStr1 <> "" Then
									Dim vObjectToNumber As Int = CallSub2(vStr1, "ErrPrtAct", Main.v_stampafattura)
									If vObjectToNumber > 0 Then
										Main.vMap2.Put(Main.v_stampafattura, vObjectToNumber)
										i3 = 1
									End If
								End If
								If Main.v_errmail Then
									If Main.v_md3 <> "" Then
										Sub132("Errore Stampante", vSMTP1, str3, False)
									End If
								End If
							Else
								vTmp_ = Sub103(vTmp)
							End If
						End If
					Loop
					vBln8 = False
					If Main.v_lognf And i3 = 2 Then
						vTmp.Sub003("Stampante impostata su GUASTA dall'utente", True)
					End If
					Main.vSql1.ExecNonQuery("update confstampe set stato = " & i3 & " where codice = " & cursorWrapper2.GetString("codice"))
				Else If vTmp_ <> "" Then
					ToastMessageShow("Stampante  " & cursorWrapper2.GetString("descrizione") & CRLF & vTmp_, True)
				End If
				If i3 = 2 Then
					Dim cursorWrapper3 As Cursor
					If Main.v_disconnettiprt Then
						vTmp.Sub001
					End If
					Return False
				End If
				Dim vSplit() As String = Regex.Split(CRLF, str)
				If vSplit.Length > 0 Then
					If z2 Then
						vTmp.vInt7 = 2
					Else
						vTmp.vInt7 = 1
					End If
					vTmp.doc_inizio
					vTmp.doc_paginizio(False)
					If Not(z2) Then
						If File.Exists(File.DirDefaultExternal & "/Loghi", "LogoK.buf") Then
							vTmp.doc_img("LogoK.buf", File.DirDefaultExternal & "/Loghi")
						End If
					End If
					If Main.v_attivafe Then
						vTmp.doc_testogiustifica(1)
						Sub144(vTmp, str2)
					Else
						Dim cursorWrapper4 As Cursor
						Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
						If cursorWrapper5.RowCount > 0 Then
							vTmp.doc_testostile(False, True, False, False, False, False, False, "")
							Dim i5 As Int
							For i5 = 0 To 5
								cursorWrapper5.Position = i5
								vTmp.doc_testogiustifica(1)
								vTmp.doc_testostampa(cursorWrapper5.GetString("descrizione"))
							Next
						End If
						cursorWrapper5.Close
					End If
					vTmp.doc_testogiustifica(1)
					vTmp.doc_testostile(False, True, False, False, False, False, False, "")
					Dim length As Int = vSplit.Length - 1
					Dim i6 As Int
					For i6 = 0 To length
						Dim str5 As String = vSplit(i6)
						If z Then
							If Main.v_attivafe Then
								If Not(Main.v_fatturafmt2) And (str5.StartsWith("RC.N.") Or str5.StartsWith("SC.N.") Or str5.StartsWith("Scontrini del")) Then
									z4 = True
									If Not(z4) Then
										str5 = "   " & str5
										vTmp.doc_testogiustifica(0)
										vTmp.doc_testostile(False, True, False, False, False, False, False, "")
									Else
										If z Then
											If Not(Main.v_attivafe) Then
												z5 = True
												If z5 And str5.StartsWith("Descrizione   ") Then
													vTmp.doc_testostile(True, False, False, False, False, False, False, "")
												Else
													If z Then
														If Not(Main.v_attivafe) Then
															z6 = True
															If z6 And str5.StartsWith("E IVA ") Then
																vTmp.doc_testostile(False, True, False, False, False, False, False, "")
															Else If Not(str5.StartsWith("TOTALE FATTURA")) Or str5.Trim.StartsWith("TOTALE DA PAGARE") Or str5.Trim.StartsWith("TOT. NOTA") Then
																vTmp.doc_testostile(False, True, True, False, False, False, False, "")
																str5 = str5.Replace(",", "")
															Else If str5.StartsWith("-- ") Then
																vTmp.doc_testostampa(" ")
																vTmp.doc_testostile(False, True, True, False, False, False, False, "")
															End If
														End If
													End If
													z6 = False
													If z6 Then
													End If
													If Not(str5.StartsWith("TOTALE FATTURA")) Then
													End If
													vTmp.doc_testostile(False, True, True, False, False, False, False, "")
													str5 = str5.Replace(",", "")
												End If
											End If
										End If
										z5 = False
										If z5 Then
										End If
										If z Then
										End If
										z6 = False
										If z6 Then
										End If
										If Not(str5.StartsWith("TOTALE FATTURA")) Then
										End If
										vTmp.doc_testostile(False, True, True, False, False, False, False, "")
										str5 = str5.Replace(",", "")
									End If
									vTmp.doc_testostampa(str5)
									If str5.StartsWith("-- ") Then
										vTmp.doc_testostile(False, True, False, False, False, False, False, "")
									End If
									If str5.StartsWith("TOTALE FATTURA") Then
										vTmp.doc_testostile(False, True, False, False, False, False, False, "")
									End If
									If Not(z4) Then
										vTmp.doc_testogiustifica(1)
										vTmp.doc_testostile(True, False, False, False, False, False, False, "")
									End If
								End If
							End If
						End If
						z4 = False
						If Not(z4) Then
						End If
						vTmp.doc_testostampa(str5)
						If str5.StartsWith("-- ") Then
						End If
						If str5.StartsWith("TOTALE FATTURA") Then
						End If
						If Not(z4) Then
						End If
					Next
					vTmp.doc_pagfine(False)
					vTmp.doc_fine
					vTmp.vInt7 = 0
					z3 = True
				Else
					z3 = False
				End If
				If Main.v_disconnettiprt Then
					vTmp.Sub001
				End If
				i2 = i2 + 1
				z7 = z3
			End If
			Return False
		Loop
		cursorWrapper2.Close
		Return z7
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub190(str As String, str2 As String, str3 As String, cursorWrapper As Cursor, str4 As String, z As Boolean, str5 As String, str6 As String, z2 As Boolean) As Boolean
	Dim i As Int
	Dim i2 As Int
	Dim i3 As Int
	Dim d As Double
	Dim d2 As Double
	Try
		If Main.v_stampafattura = 300 And z Then
			If Main.v_iprpi = "" Then
				Dim vObjectToCharSequence As Object = "Non è stato configurato il ServiceBox." & CRLF & "La fattura verrà stampata con il sistema integrato"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else
				File.Copy(File.DirDefaultExternal, "Anagra.db", vStr4, "AnagraDoc.db")
				Sub212(str5, z2)
				Dim map As Map
				map.Initialize
				Dim vSplit() As String = Regex.Split(CRLF, str3)
				Dim parseDouble As Double = vSplit(1).Replace(" TOTALE RICEVUTA:", "").Trim
				Dim d3 As Double = 0
				Dim d4 As Double = 0
				Dim i4 As Int = 2
				Do While i4 <= 3
					If vSplit.Length > i4 Then
						If vSplit(i4).Contains("Non Riscosso") Then
							d = vSplit(i4).Replace("Non Riscosso", "").Trim
							d2 = d3
						Else If vSplit(i4).Contains("Riscosso") Then
							d2 = vSplit(i4).Replace("Riscosso", "").Trim
							d = d4
						End If
						i4 = i4 + 1
						d3 = d2
						d4 = d
					End If
					d = d4
					d2 = d3
					i4 = i4 + 1
					d3 = d2
					d4 = d
				Loop
				map.Put("nmov", str5)
				map.Put("TmpHeadDoc", str6)
				map.Put("nFattura", str4)
				map.Put("Totale", NumberFormat2(parseDouble, 1, 2, 2, False))
				map.Put("Cliente", str)
				map.Put("TmpFattura", "")
				map.Put("v_Barra", Main.v_barra)
				map.Put("Riscosso", NumberFormat2(d3, 1, 2, 2, False))
				map.Put("NonRiscosso", NumberFormat2(d4, 1, 2, 2, False))
				File.WriteMap(vStr4, "MappaDoc.txt", map)
				Dim strArr() As String = Array("AnagraDoc.db", "MappaDoc.txt")
				ZipFiles(vStr4, strArr, vStr4, "BKAnagra.zip", "")
				CallSub2(rpidevice, "SendAnagraPerDoc", "TipoDocRicevuta")
				Return True
			End If
		End If
		If Not(Main.vckprinter19.IsInitialized) Then
			Main.vckprinter19.Initialize(False)
			Main.vckprinter19.vInt1 = 0
			Main.vckprinter19.vInt2 = 0
			Main.vckprinter19.vBln2 = True
		End If
		If Not(Main.vckprinter19.vBln5) Then
			Main.vckprinter19.Sub004(Main.v_ipricevute)
		End If
		Dim vTmp As String = Sub103(Main.vckprinter19)
		Dim c As Char = 1
		If vTmp.StartsWith("Errore") Then
			Dim i5 As Int = -1
			Do While True
				If i5 <> -1 Then
					Exit
				End If
				If Not(vTmp.StartsWith("Errore")) Then
					c = 1
					i5 = -2
				Else
					If Main.v_disconnettiprt Then
						Main.vckprinter19.Sub001
					End If
					c = 2
					Dim str7 As String = vTmp & CRLF & "Errore Stampante Ricevute e Fatture . Si desidera riprovare o considerare la stampante 'Guasta' ? "
					vBln8 = True
					If vStr1 = "" Then
						ToastMessageShow(str7, True)
						c = 1
						Exit
					End If
					i5 = CallSub2(vStr1, "msgboxAct", str7)
					If i5 = -3 Then
						i5 = -1
					End If
					If i5 <> -1 Then
						If Main.v_errmail Then
							If Main.v_md3 <> "" Then
								Sub132("Errore Stampante", vSMTP1, str7, False)
							End If
						End If
					Else
						vTmp = Sub103(Main.vckprinter19)
					End If
				End If
			Loop
			vBln8 = False
		Else If vTmp <> "" Then
			ToastMessageShow("Stampante Ricevute e Fatture ." & CRLF & vTmp, True)
		End If
		If c = 2 Then
			If Main.v_disconnettiprt Then
				Main.vckprinter19.Sub001
			End If
			Return False
		End If
		Dim vSplit2() As String = Regex.Split(CRLF, str2)
		Dim vSplit3() As String = Regex.Split(CRLF, str3)
		If vSplit2.Length > 0 Then
			Dim cursorWrapper2 As Cursor
			Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
			Dim list As List
			Dim list2 As List
			If str <> "" Then
				list.Initialize
				If Not(Sub222(cursorWrapper.GetString("descrizione"))) Then
					list.Add(modfunstr.left(cursorWrapper.GetString("descrizione").Trim, 43))
				End If
				If Not(Sub222(cursorWrapper.GetString("via"))) Then
					list.Add(modfunstr.left(cursorWrapper.GetString("via").Trim, 43))
				End If
				Dim str8 As String = ""
				If Not(Sub222(cursorWrapper.GetString("cap"))) Then
					str8 = cursorWrapper.GetString("cap").Trim & " "
				End If
				If Not(Sub222(cursorWrapper.GetString("citta"))) Then
					str8 = str8 & cursorWrapper.GetString("citta").Trim & " "
				End If
				If Not(Sub222(cursorWrapper.GetString("provincia"))) Then
					str8 = str8 & cursorWrapper.GetString("provincia").Trim & " "
				End If
				If Not(Sub222(str8)) Then
					list.Add(str8)
				End If
				Dim str9 As String = ""
				If Not(Sub222(cursorWrapper.GetString("piva"))) Then
					str9 = "P.IVA: " & cursorWrapper.GetString("piva").Trim
				End If
				If Not(Sub222(cursorWrapper.GetString("codf"))) Then
					If str9 <> "" Then
						str9 = str9 & "   C.F.: " & cursorWrapper.GetString("codf").Trim
					Else
						str9 = "C.F.: " & cursorWrapper.GetString("codf").Trim
					End If
				End If
				If Not(Sub222(str9)) Then
					list.Add(str9)
				End If
			End If
			Dim i6 As Int = 0
			Main.vckprinter19.doc_inizio
			Dim z3 As Boolean = True
			Do While z3
				list2.Initialize
				Dim i7 As Int = 0
				Dim i8 As Int = 0
				Main.vckprinter19.doc_paginizio(False)
				Main.vckprinter19.doc_testogiustifica(1)
				list2.Add("_1")
				Dim i9 As Int = 1
				Do While True
					If i9 > 40 Then
						z3 = False
						Exit
					End If
					If i9 >= Main.v_ricevutadapdv Then
						If i9 <= Main.v_ricevutaapdv Then
							If Main.v_ricevutadapdv > 0 Then
								If cursorWrapper3.RowCount > 0 And i7 <= 5 Then
									cursorWrapper3.Position = i7
									Main.vckprinter19.doc_testostampa(cursorWrapper3.GetString("descrizione"))
									list2.Add(cursorWrapper3.GetString("descrizione"))
									i2 = i7 + 1
									i3 = i6
									i = i8
								Else
									Main.vckprinter19.doc_testostampa(" ")
									list2.Add(" ")
									i = i8
									i2 = i7
									i3 = i6
								End If
								i8 = i
								i7 = i2
								i6 = i3
								i9 = i9 + 1
							End If
						End If
					End If
					If i9 >= Main.v_ricevutadacli Then
						If i9 <= Main.v_ricevutaacli Then
							If Main.v_ricevutadacli > 0 Then
								If str <> "" And i8 <= list.Size - 1 Then
									Main.vckprinter19.doc_testostile(False, True, False, False, False, False, False, "")
									list2.Add("_b")
									Main.vckprinter19.doc_testostampa(list.Get(i8))
									list2.Add(list.Get(i8))
									i = i8 + 1
									i2 = i7
									i3 = i6
								Else
									Main.vckprinter19.doc_testostampa(" ")
									list2.Add(" ")
									i = i8
									i2 = i7
									i3 = i6
								End If
								i8 = i
								i7 = i2
								i6 = i3
								i9 = i9 + 1
							End If
						End If
					End If
					If i9 >= Main.v_ricevutadacor Then
						If i9 <= Main.v_ricevutaacor And i6 <= vSplit2.Length Then
							If i9 = Main.v_ricevutadacor Then
								Main.vckprinter19.doc_testostile(False, True, False, False, False, False, False, "")
								list2.Add("_b")
								Main.vckprinter19.doc_testostampa(str4)
								list2.Add(str4)
							End If
							Main.vckprinter19.doc_testostile(False, False, False, False, False, False, False, "")
							list2.Add("_n")
							If i6 < vSplit2.Length Then
								Dim str10 As String = vSplit2(i6) & " "
								i6 = i6 + 1
								Main.vckprinter19.doc_testostampa(str10)
								list2.Add(str10)
							End If
							If i6 >= vSplit2.Length Then
								If Main.v_ricevutaacor - i9 - vSplit3.Length > 0 Then
									Log(vSplit2.Length)
									Dim length As Int = Main.v_ricevutaacor - i9 - vSplit3.Length - 1
									Dim i10 As Int
									For i10 = 0 To length
										Main.vckprinter19.doc_testostampa(" ")
										list2.Add(" ")
									Next
									If vSplit3.Length > 0 Then
										Dim length2 As Int = vSplit3.Length - 1
										Dim i11 As Int
										For i11 = 0 To length2
											If vSplit3(i11).Trim.StartsWith("TOTALE ") Then
												Main.vckprinter19.doc_testostile(False, True, False, False, False, False, False, "")
												list2.Add("_b")
											End If
											Main.vckprinter19.doc_testostampa(vSplit3(i11))
											list2.Add(vSplit3(i11))
										Next
									End If
									Dim i13 As Int
									For i13 = 0 To Main.v_ricevutaspaziomf
										Main.vckprinter19.doc_testostampa(" ")
									Next
									Dim size As Int = list2.Size - 1
									Dim i14 As Int
									For i14 = 0 To size
										If list2.Get(i14) = "_b" Then
											Main.vckprinter19.doc_testostile(False, True, False, False, False, False, False, "")
										Else If list2.Get(i14) = "_n" Then
											Main.vckprinter19.doc_testostile(False, False, False, False, False, False, False, "")
										Else If list2.Get(i14) = "_0" Then
											Main.vckprinter19.doc_testogiustifica(0)
										Else If list2.Get(i14) = "_1" Then
											Main.vckprinter19.doc_testogiustifica(1)
										Else
											Main.vckprinter19.doc_testostampa(list2.Get(i14))
										End If
									Next
									z3 = False
								End If
							End If
							If Main.v_ricevutaacor - i9 - vSplit3.Length <= 0 Then
								Main.vckprinter19.doc_testostampa("Continua ...")
								list2.Add("Continua ...")
								If vSplit3.Length - 2 >= 0 Then
									Dim length3 As Int = vSplit3.Length - 2
									Dim i15 As Int
									For i15 = 0 To length3
										Main.vckprinter19.doc_testostampa(" ")
										list2.Add(" ")
									Next
								End If
								Dim i17 As Int
								For i17 = 0 To Main.v_ricevutaspaziomf
									Main.vckprinter19.doc_testostampa(" ")
								Next
								Dim size2 As Int = list2.Size - 1
								Dim i18 As Int
								For i18 = 0 To size2
									If list2.Get(i18) = "_b" Then
										Main.vckprinter19.doc_testostile(False, True, False, False, False, False, False, "")
									Else If list2.Get(i18) = "_n" Then
										Main.vckprinter19.doc_testostile(False, False, False, False, False, False, False, "")
									Else If list2.Get(i18) = "_0" Then
										Main.vckprinter19.doc_testogiustifica(0)
									Else If list2.Get(i18) = "_1" Then
										Main.vckprinter19.doc_testogiustifica(1)
									Else
										Main.vckprinter19.doc_testostampa(list2.Get(i18))
									End If
								Next
								Main.vckprinter19.doc_pagfine(False)
								z3 = True
							End If
							i = i8
							i2 = i7
							i3 = i6
							i8 = i
							i7 = i2
							i6 = i3
							i9 = i9 + 1
						End If
					End If
					Main.vckprinter19.doc_testostampa(" ")
					list2.Add(" ")
					i = i8
					i2 = i7
					i3 = i6
					i8 = i
					i7 = i2
					i6 = i3
					i9 = i9 + 1
				Loop
			Loop
			cursorWrapper3.Close
		End If
		Main.vckprinter19.doc_pagfine(False)
		Main.vckprinter19.doc_fine
		Return True
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m6… (riga 19748).
Sub Sub191(list As List) As Boolean
	Dim vTmp As ckprinter
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe where codice = " & Main.v_stampaconto)
		cursorWrapper2.Position = 0
		If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") <> 1 Then
			If Main.vMap2.ContainsKey(Main.v_stampaconto) Then
				vTmp = Sub102(Main.vMap2.Get(Main.v_stampaconto))
			Else
				vTmp = Sub102(Main.v_stampaconto)
			End If
			If Not(vTmp.vBln5) Then
				Return False
			End If
			Dim vTmp_ As String = Sub103(vTmp)
			Dim i As Int = 1
			If vTmp_.StartsWith("Errore") Then
				Dim i2 As Int = -1
				Do While True
					If i2 <> -1 Then
						Exit
					End If
					If Not(vTmp_.StartsWith("Errore")) Then
						i = 1
						i2 = -2
					Else
						If Main.v_disconnettiprt Then
							vTmp.Sub001
						End If
						Dim str As String = vTmp_ & CRLF & "Stampante  " & cursorWrapper2.GetString("descrizione") & CRLF & "Si desidera riprovare o considerare la stampante 'Guasta' ?"
						vBln8 = True
						If vStr1 = "" Then
							ToastMessageShow(str, True)
							i = 1
							Exit
						End If
						Dim vObjectToNumber As Int = CallSub2(vStr1, "msgboxAct", str)
						If vObjectToNumber = -3 Then
							vObjectToNumber = -1
						End If
						If vObjectToNumber <> -1 Then
							If vStr1 <> "" Then
								Dim vObjectToNumber2 As Int = CallSub2(vStr1, "ErrPrtAct", Main.v_stampaconto)
								If vObjectToNumber2 > 0 Then
									Main.vMap2.Put(Main.v_stampaconto, vObjectToNumber2)
									i = 1
									If Main.v_errmail Then
										If Main.v_md3 <> "" Then
											Sub132("Errore Stampante", vSMTP1, str, False)
										End If
									End If
								End If
							End If
							i = 2
							If Main.v_errmail Then
							End If
						Else
							vTmp_ = Sub103(vTmp)
							i = 2
							i2 = vObjectToNumber
						End If
					End If
				Loop
				vBln8 = False
				If Main.v_lognf And i = 2 Then
					vTmp.Sub003("Stampante impostata su GUASTA dall'utente", True)
				End If
				Main.vSql1.ExecNonQuery("update confstampe set stato = " & i & " where codice = " & cursorWrapper2.GetString("codice"))
			Else If vTmp_ <> "" Then
				ToastMessageShow("Stampante  " & cursorWrapper2.GetString("descrizione") & CRLF & vTmp_, True)
			End If
			If i = 2 Then
				Dim cursorWrapper3 As Cursor
				If Main.v_disconnettiprt Then
					vTmp.Sub001
				End If
				Return False
			End If
			If list.Size > 0 Then
				vTmp.doc_inizio
				vTmp.doc_paginizio(False)
				If Main.v_intestanf Then
					Dim cursorWrapper4 As Cursor
					Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
					If cursorWrapper5.RowCount > 0 Then
						vTmp.doc_testostile(False, True, False, False, False, False, False, "")
						Dim i4 As Int
						For i4 = 0 To 5
							cursorWrapper5.Position = i4
							vTmp.doc_testogiustifica(1)
							vTmp.doc_testostampa(cursorWrapper5.GetString("descrizione"))
						Next
					End If
				End If
				vTmp.doc_testostile(False, True, True, False, False, False, False, "")
				vTmp.doc_testogiustifica(1)
				vTmp.doc_testostampa("------------------------------------")
				Dim size As Int = list.Size - 1
				Dim i5 As Int
				For i5 = 0 To size
					Dim vObjectToString As String = list.Get(i5)
					Dim parseDouble As Int = vObjectToString.SubString2(0, 1)
					Dim substring As String = vObjectToString.SubString(1)
					vTmp.doc_testostile(False, parseDouble > 1, True, parseDouble = 4, False, False, parseDouble = 3, "")
					vTmp.doc_testostampa(substring)
				Next
				vTmp.doc_testostampa("------------------------------------")
				vTmp.doc_pagfine(False)
				vTmp.doc_fine
				If Main.v_disconnettiprt Then
					vTmp.Sub001
				End If
				cursorWrapper2.Close
				Return True
			End If
			If Main.v_disconnettiprt Then
				vTmp.Sub001
			End If
			cursorWrapper2.Close
			Return False
		End If
		Return False
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m7… (riga 19927).
Sub Sub192(j As Long, ckprinterVar As ckprinter, i As Int, str As String, cursorWrapper As Cursor, j2 As Long, z As Boolean, d As Double, i2 As Int, d2 As Double, d3 As Double, d4 As Double, z2 As Boolean, i3 As Int, d5 As Double) As String
	Dim str2 As String
	Dim z3 As Boolean
	Dim i4 As Int
	Dim z4 As Boolean
	vStr2 = "Public Sub StampaMessaggisuNF "
	Try
		Dim sb As String = "Op." & Main.Operatore
		If j > 0 Then
			If Main.v_azzeradati Then
				sb = "Op." & Main.Operatore & " CK:" & Sub055(j)
			Else
				sb = "M." & j & sb
			End If
		End If
		If Main.v_attivaterminale Then
		End If
		If Not(Main.vBln25) Then
			If Not(Main.vBln24) Then
				str2 = sb
				ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
				ckprinterVar.doc_testostampa(str2 & modfunstr.Sub004(36 - modfunstr.Sub001(str2)))
				If i > 0 Then
					Dim vTmp As String = Sub107(i)
					ckprinterVar.doc_testostile(False, True, True, False, False, False, False, "")
					ckprinterVar.doc_testostampa(vTmp & modfunstr.Sub004(36 - modfunstr.Sub001(vTmp)))
					If Main.v_stampasala Then
						Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select descrizione from Despagine inner join pagine on pagine.pagina = despagine.codice where pagine.tipo =9 AND valore = " & i & " limit 1")
						If vExecQuerySingleResult <> Null Then
							ckprinterVar.doc_testostampa(vExecQuerySingleResult & modfunstr.Sub004(36 - modfunstr.Sub001(vExecQuerySingleResult)))
						End If
					End If
				End If
				If str = "" And cursorWrapper.IsInitialized Then
					ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
					If Main.v_stampanomecli > 0 Then
						ckprinterVar.doc_testostampa("******************************")
						ckprinterVar.doc_testostampa("Tess. " & str)
						If Not(Sub222(cursorWrapper.GetString("descrizione"))) Then
							ckprinterVar.doc_testostampa(cursorWrapper.GetString("descrizione").Trim)
						End If
						If Not(z2) Then
							If Not(Sub222(cursorWrapper.GetString("via"))) Then
								ckprinterVar.doc_testostampa(cursorWrapper.GetString("via").Trim)
							End If
							Dim str3 As String = ""
							If Not(Sub222(cursorWrapper.GetString("cap"))) Then
								str3 = cursorWrapper.GetString("cap").Trim & " "
							End If
							If Not(Sub222(cursorWrapper.GetString("citta"))) Then
								str3 = str3 & cursorWrapper.GetString("citta").Trim & " "
							End If
							If Not(Sub222(cursorWrapper.GetString("provincia"))) Then
								str3 = str3 & cursorWrapper.GetString("provincia").Trim & " "
							End If
							If Not(Sub222(str3)) Then
								ckprinterVar.doc_testostampa(str3)
							End If
							If Not(Sub222(cursorWrapper.GetString("telefono"))) Then
								ckprinterVar.doc_testostampa("Tel. " & cursorWrapper.GetString("telefono").Trim)
							End If
							If Not(Sub222(cursorWrapper.GetString("piva"))) Then
								ckprinterVar.doc_testostampa("P.IVA: " & cursorWrapper.GetString("piva").Trim)
							End If
							If Not(Sub222(cursorWrapper.GetString("codf"))) Then
								ckprinterVar.doc_testostampa("C.F.: " & cursorWrapper.GetString("codf").Trim)
							End If
						End If
						ckprinterVar.doc_testostampa("******************************")
					End If
					If j2 <> 0 Then
						If Main.vInt25 <= 0 Then
							Return ""
						End If
					End If
					If j > 0 And Not(z2) Then
						ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
						If cursorWrapper.GetInt("abpunti") = 1 And Not(z) Then
							Dim vNumberToString As String = i2
							Dim i5 As Int = d3 - d - d5
							If cursorWrapper.GetInt("abprep") = 1 Then
								If Main.vBln20 Then
									If Main.v_centralizza Then
										If Main.vBln14 Then
											z4 = True
											If Not(z4) Then
												i5 = i5 - Main.vSql1.ExecQuerySingleResult("select case when sum(importo) is null then 0 else sum(importo) end from Venduto where codint='ric' and nmov = " & j)
											End If
										End If
									End If
								End If
								z4 = False
								If Not(z4) Then
								End If
							End If
							If Main.v_xpunti <> 0 Then
								If Main.v_ognoeuro <> 0 Then
									i4 = i5 / Main.v_ognoeuro * Main.v_xpunti
									Dim vNumberToString2 As String = i4
									Dim vNumberToString3 As String = cursorWrapper.GetString("punti") + i4 + i2 + i3
									ckprinterVar.doc_testostampa(Main.vStr19 & modfunstr.Sub004(36 - modfunstr.Sub001(Main.vStr19)))
									If i2 < 0 Then
										ckprinterVar.doc_testostampa("RITIRO PREMIO" & modfunstr.Sub003(modfunstr.Sub004(19) & vNumberToString, 19))
									End If
									If i3 > 0 Then
										ckprinterVar.doc_testostampa("PUNTI ARTICOLO" & modfunstr.Sub003(modfunstr.Sub004(18) & i3, 18))
									End If
									ckprinterVar.doc_testostampa("PUNTI SPESA" & modfunstr.Sub003(modfunstr.Sub004(21) & vNumberToString2, 21))
									ckprinterVar.doc_testostampa("PUNTI PREC." & modfunstr.Sub003(modfunstr.Sub004(21) & cursorWrapper.GetString("punti"), 21))
									ckprinterVar.doc_testostampa("PUNTI ATT. " & modfunstr.Sub003(modfunstr.Sub004(21) & vNumberToString3, 21))
									ckprinterVar.doc_testostampa(Main.vStr19)
								End If
							End If
							i4 = 0
							Dim vNumberToString22 As String = i4
							Dim vNumberToString32 As String = cursorWrapper.GetString("punti") + i4 + i2 + i3
							ckprinterVar.doc_testostampa(Main.vStr19 & modfunstr.Sub004(36 - modfunstr.Sub001(Main.vStr19)))
							If i2 < 0 Then
							End If
							If i3 > 0 Then
							End If
							ckprinterVar.doc_testostampa("PUNTI SPESA" & modfunstr.Sub003(modfunstr.Sub004(21) & vNumberToString22, 21))
							ckprinterVar.doc_testostampa("PUNTI PREC." & modfunstr.Sub003(modfunstr.Sub004(21) & cursorWrapper.GetString("punti"), 21))
							ckprinterVar.doc_testostampa("PUNTI ATT. " & modfunstr.Sub003(modfunstr.Sub004(21) & vNumberToString32, 21))
							ckprinterVar.doc_testostampa(Main.vStr19)
						Else If cursorWrapper.GetInt("abpunti") = 1 And z Then
							ckprinterVar.doc_testostampa(Main.vStr19)
							ckprinterVar.doc_testostampa("TERMINALE TEMPORANEAMENTE")
							ckprinterVar.doc_testostampa("OFFLINE")
							ckprinterVar.doc_testostampa(Main.vStr19)
						End If
						If cursorWrapper.GetInt("abprep") = 1 Then
							If Main.vBln20 Then
								If Main.v_centralizza Then
									If Main.vBln14 Then
										z3 = True
										If z3 Then
											Dim vNumberFormat2 As String = NumberFormat2(d2, 1, 2, 2, False)
											Dim vRound2 As Double = Round2(d3 - d2 + d4, 2)
											Dim d6 As Double = IIf(vRound2 >= 0 Or d3 <= 0 Or d2 <= d3, vRound2, 0)
											Dim vNumberFormat22 As String = NumberFormat2(cursorWrapper.GetDouble("prep"), 1, 2, 2, False)
											Dim vNumberFormat23 As String = NumberFormat2(Round2(cursorWrapper.GetDouble("prep") - d6 + d2, 2), 1, 2, 2, False)
											ckprinterVar.doc_testostampa(Main.vStr19)
											If d2 > 0 Then
												ckprinterVar.doc_testostampa("RICARICA     " & modfunstr.Sub003(modfunstr.Sub004(19) & vNumberFormat2, 19))
											End If
											ckprinterVar.doc_testostampa("SALDO PREC." & modfunstr.Sub003(modfunstr.Sub004(21) & vNumberFormat22, 21))
											ckprinterVar.doc_testostampa("SALDO ATT. " & modfunstr.Sub003(modfunstr.Sub004(21) & vNumberFormat23, 21))
											ckprinterVar.doc_testostampa(Main.vStr19)
											Return ""
										End If
										Return ""
									End If
								End If
							End If
							z3 = False
							If z3 Then
							End If
						Else
							Return ""
						End If
					Else
						Return ""
					End If
				End If
			End If
		End If
		str2 = sb & " C." & Main.v_numcassa
		ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
		ckprinterVar.doc_testostampa(str2 & modfunstr.Sub004(36 - modfunstr.Sub001(str2)))
		If i > 0 Then
		End If
		Return IIf(str = "", "", "")
	Catch
		Sub217(LastException.Message)
		Return ""
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m0… (riga 20211).
Sub Sub193(cursorWrapper As Cursor, str As String, cursorWrapper2 As Cursor, j As Long, d As Double, i As Int, str2 As String, str3 As String, str4 As String) As Boolean
	Dim vTmp As ckprinter
	Dim parseDouble As Double
	Try
		Dim cursorWrapper3 As Cursor
		Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from confstampe where codice = " & i)
		cursorWrapper4.Position = 0
		If cursorWrapper4.GetInt("stato") = 1 And cursorWrapper4.GetInt("mf") <> 1 Then
			If Main.vMap2.ContainsKey(i) Then
				vTmp = Sub102(Main.vMap2.Get(i))
			Else
				vTmp = Sub102(i)
			End If
			If Not(vTmp.vBln5) Then
				Return False
			End If
			Dim vTmp_ As String = Sub103(vTmp)
			Dim i2 As Int = 1
			If vTmp_.StartsWith("Errore") Then
				Dim i3 As Int = -1
				Do While True
					If i3 <> -1 Then
						Exit
					End If
					If Not(vTmp_.StartsWith("Errore")) Then
						i2 = 1
						i3 = -2
					Else
						If Main.v_disconnettiprt Then
							vTmp.Sub001
						End If
						Dim str5 As String = vTmp_ & CRLF & "Stampante  " & cursorWrapper4.GetString("descrizione") & CRLF & "Si desidera riprovare o considerare la stampante 'Guasta' ?"
						vBln8 = True
						If vStr1 = "" Then
							ToastMessageShow(str5, True)
							i2 = 1
							Exit
						End If
						Dim vObjectToNumber As Int = CallSub2(vStr1, "msgboxAct", str5)
						If vObjectToNumber = -3 Then
							vObjectToNumber = -1
						End If
						If vObjectToNumber <> -1 Then
							If vStr1 <> "" Then
								Dim vObjectToNumber2 As Int = CallSub2(vStr1, "ErrPrtAct", i)
								If vObjectToNumber2 > 0 Then
									Main.vMap2.Put(i, vObjectToNumber2)
									i2 = 1
									If Main.v_errmail Then
										If Main.v_md3 <> "" Then
											Sub132("Errore Stampante", vSMTP1, str5, False)
										End If
									End If
								End If
							End If
							i2 = 2
							If Main.v_errmail Then
							End If
						Else
							vTmp_ = Sub103(vTmp)
							i2 = 2
							i3 = vObjectToNumber
						End If
					End If
				Loop
				vBln8 = False
				If Main.v_lognf And i2 = 2 Then
					vTmp.Sub003("Stampante impostata su GUASTA dall'utente", True)
				End If
				Main.vSql1.ExecNonQuery("update confstampe set stato = " & i2 & " where codice = " & cursorWrapper4.GetString("codice"))
			Else If vTmp_ <> "" Then
				ToastMessageShow("Stampante  " & cursorWrapper4.GetString("descrizione") & CRLF & vTmp_, True)
			End If
			If i2 = 2 Then
				Dim cursorWrapper5 As Cursor
				If Main.v_disconnettiprt Then
					vTmp.Sub001
				End If
				Return False
			End If
			If cursorWrapper.RowCount > 0 Then
				vTmp.doc_inizio
				vTmp.doc_paginizio(False)
				If File.Exists(File.DirDefaultExternal & "/Loghi", "LogoK.buf") Then
					vTmp.doc_img("LogoK.buf", File.DirDefaultExternal & "/Loghi")
				End If
				If Main.v_intestanf Then
					Dim cursorWrapper6 As Cursor
					Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
					If cursorWrapper7.RowCount > 0 Then
						vTmp.doc_testostile(False, True, False, False, False, False, False, "")
						Dim i5 As Int
						For i5 = 0 To 5
							cursorWrapper7.Position = i5
							vTmp.doc_testogiustifica(1)
							vTmp.doc_testostampa(cursorWrapper7.GetString("descrizione"))
						Next
					End If
				End If
				vTmp.doc_testostile(False, True, True, False, False, False, False, "")
				If Main.vStr8.ToLowerCase = "lavandro" Then
					vTmp.doc_testostampa("Ritiro")
				Else
					vTmp.doc_testostampa("Prenotazione")
				End If
				vTmp.doc_testostampa(str2)
				vTmp.doc_testostile(False, True, True, False, False, False, False, "")
				vTmp.doc_testogiustifica(1)
				vTmp.doc_testostampa("------------------------------------")
				vTmp.doc_testostile(False, True, False, False, False, False, False, "")
				Dim rowCount As Int = cursorWrapper.RowCount - 1
				Dim i6 As Int = 0
				Dim d2 As Double = 0
				Do While i6 <= rowCount
					cursorWrapper.Position = i6
					Dim doubleValue As Double = cursorWrapper.GetDouble("qta")
					Dim doubleValue2 As Double = cursorWrapper.GetDouble("importo")
					If doubleValue <> 1 And (doubleValue2 <> 0 Or cursorWrapper.GetString("codint") = "888889" Or cursorWrapper.GetString("codint") = "888888") And Not(Sub029(cursorWrapper.GetString("codint"))) And Not(Sub028(cursorWrapper.GetString("codint"))) Then
						If cursorWrapper.GetString("codint") = "rgr" Or doubleValue Mod 1 = 0 Then
							vTmp.doc_testostampa(NumberFormat(doubleValue, 1, 0) & " x " & NumberFormat2(cursorWrapper.GetDouble("prezzov"), 1, 2, 2, False))
						Else
							vTmp.doc_testostampa(NumberFormat2(doubleValue, 1, 2, 2, False) & " x " & NumberFormat2(cursorWrapper.GetDouble("prezzov"), 1, 2, 2, False))
						End If
					End If
					If doubleValue2 <> 0 Or cursorWrapper.GetString("codint") = "888889" Or cursorWrapper.GetString("codint") = "888888" Then
						vTmp.doc_testostampa(modfunstr.left(modfunstr.left(cursorWrapper.GetString("descrizione"), 29) & modfunstr.Sub004(29), 29) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(doubleValue2, 1, 2, 2, False), 7))
					End If
					If cursorWrapper.GetString("memo") <> "" Then
						vTmp.doc_testostampa(cursorWrapper.GetString("memo").Trim)
						vTmp.doc_testostampa(" ")
					End If
					i6 = i6 + 1
					d2 = Round2(d2 + doubleValue2, 2)
				Loop
				If j > 0 Then
					parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(scov) is null then 0 else sum(scov) end from Venduto where flgNF = 1 and nmov = " & j)
				Else
					parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(scov) is null then 0 else sum(scov) end from Ventmp")
				End If
				If parseDouble > 0 Then
					vTmp.doc_testostampa("------------------------------------")
					vTmp.doc_testostampa("Sconti:" & modfunstr.Sub004(22) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(parseDouble, 1, 2, 2, False).Replace(".", ","), 7))
					vTmp.doc_testostampa("------------------------------------")
				End If
				vTmp.doc_testostampa(str4)
				Sub192(j, vTmp, 0, str, cursorWrapper2, 0, False, 0, 0, 0, d, 0, True, 0, 0)
				vTmp.doc_testostampa("------------------------------------")
				vTmp.doc_testostile(False, True, True, False, False, False, False, "")
				vTmp.doc_testostampa("TOT." & modfunstr.Sub003(modfunstr.Sub004(32) & NumberFormat2(d2, 1, 2, 2, False), 32))
				vTmp.doc_barcodeitfstampa(str3)
				vTmp.doc_pagfine(False)
				vTmp.doc_fine
				If Main.v_disconnettiprt Then
					vTmp.Sub001
				End If
				cursorWrapper4.Close
				Return True
			End If
			If Main.v_disconnettiprt Then
				vTmp.Sub001
			End If
			cursorWrapper4.Close
			Return False
		End If
		Return False
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub194(ckprinterVar As ckprinter, str As String, i As Int, str2 As String, str3 As String, i2 As Int, map As Map)
	Dim str4 As String
	Dim str5 As String
	Dim d As Double
	Try
	Catch
		Sub217(LastException.Message)
	End Try
	If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from daStampare where id = '" & str3 & "' and turno = " & str2) = 0) Then
		If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from venduto where turno = " & str2 & " and nmov = " & str) = 0) Then
			If i <> 5 And i <> 13 Then
				str4 = "codice asc"
			Else
				str4 = "case when lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww' then '1' else'0' end || descrizione asc"
			End If
			Dim str6 As String = " where nmov = " & str
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from filtristampe where codice = " & i2)
			If cursorWrapper2.RowCount > 0 Then
				Dim str7 As String = " and (case when stampante2=0 then "
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim str8 As String = ""
				Dim str9 As String = ""
				Dim i3 As Int
				For i3 = 0 To rowCount
					cursorWrapper2.Position = i3
					str9 = str9 & " reparto = " & cursorWrapper2.GetString("reparto") & "   or "
					str8 = str8 & " stampante2 = " & cursorWrapper2.GetString("reparto") & "   or "
				Next
				Dim substring As String = str9.SubString2(0, str9.Length - 4)
				Dim substring2 As String = str8.SubString2(0, str8.Length - 4)
				str5 = str7 & substring & " else case when stampaesclusiva =0 then " & substring & " or " & substring2 & " else case when stampaesclusiva =1  then " & substring2 & " end end end)"
			Else
				str5 = ""
			End If
			Dim str10 As String = str6 & str5
			Dim d2 As Double = 0
			Try
				d2 = Main.vSql1.ExecQuerySingleResult("select sum(qta) from venduto " & str10 & " and turno = " & str2)
				d = Main.vSql1.ExecQuerySingleResult("select sum(qta) from daStampare where id = '" & str3 & "' and turno = " & str2) - 1
			Catch
				Sub217(LastException.Message)
				d = 0
			End Try
			If d = d2 Then
				cursorWrapper2.Close
				Return
			End If
			Dim cursorWrapper3 As Cursor
			Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select * from venduto " & str10 & " and turno = " & str2 & " order by turno,QtaConDecimali,totcre," & str4)
			If cursorWrapper4.RowCount > 0 Then
				ckprinterVar.doc_testogiustifica(0)
				ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
				ckprinterVar.doc_testostampa("---------------------------------")
				ckprinterVar.doc_testostile(False, True, False, False, False, False, False, Sub096(map, "DStampaRiepTurniHead"))
				ckprinterVar.doc_testostampa(" Riepilogo Turno:")
				Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
				Dim i4 As Int
				For i4 = 0 To rowCount2
					cursorWrapper4.Position = i4
					Dim sb As String = " " & modfunstr.left(cursorWrapper4.GetString("qta") & modfunstr.Sub004(5), 5)
					Dim trim As String = cursorWrapper4.GetString("descrizione").Trim
					ckprinterVar.doc_testostile(False, True, False, False, False, False, False, Sub096(map, "DStampaRiepTurniNormale"))
					If cursorWrapper4.GetString("codice").Trim.StartsWith("vv") Or cursorWrapper4.GetString("codice").Trim.StartsWith("ww") Then
						sb = "    " & modfunstr.left(cursorWrapper4.GetString("qta") & modfunstr.Sub004(5), 5)
						ckprinterVar.doc_testostile(False, False, False, False, False, False, False, Sub096(map, "DStampaRiepTurniVariazione"))
					End If
					If modfunstr.Sub006(sb) < 0 Then
						ckprinterVar.doc_testostile(False, False, False, False, False, False, True, Sub096(map, "DStampaRiepTurniNegativo"))
					End If
					If Sub029(cursorWrapper4.GetString("codint")) Or Sub028(cursorWrapper4.GetString("codint")) Then
						If modfunstr.Sub006(sb) > 0 Then
							sb = "**** "
							ckprinterVar.doc_testostile(False, False, False, False, False, False, True, Sub096(map, "DStampaRiepTurniMSG"))
						End If
					End If
					Dim str11 As String = sb
					If cursorWrapper4.GetString("codice").Trim.StartsWith("ww") Then
						str11 = modfunstr.Sub004(str11.Length)
					End If
					ckprinterVar.doc_testostampa(str11 & trim)
				Next
				ckprinterVar.doc_testostile(False, True, False, False, False, False, False, "")
				ckprinterVar.doc_testostampa("---------------------------------")
				ckprinterVar.doc_testogiustifica(1)
			End If
			cursorWrapper2.Close
			cursorWrapper4.Close
			Return
		End If
	End If
End Sub

Sub Sub195(cursorWrapper As Cursor, ckprinterVar As ckprinter, i As Int, cursorWrapper2 As Cursor, cursorWrapper3 As Cursor, i2 As Int, str As String)
	Dim cursorWrapper4 As Cursor
	Dim z As Boolean
	Try
		If Main.v_rieponly Then
			Dim cursorWrapper5 As Cursor
			cursorWrapper4 = Main.vSql1.ExecQuery("select codstampa,id from HeaddaStampare inner join confstampe on confstampe.codice = HeaddaStampare.codstampa where confstampe." & str & "=1 and  nmov = " & cursorWrapper3.GetString("nmov") & " and codstampa <> " & i2 + 1 & "  order by id asc")
		Else
			Dim cursorWrapper6 As Cursor
			cursorWrapper4 = Main.vSql1.ExecQuery("select codstampa,id from HeaddaStampare where (select count(*) from confstampe where confstampe." & str & "=1 and confstampe.codice = " & i2 + 1 & ")>0 and  nmov = " & cursorWrapper3.GetString("nmov") & " and codstampa <> " & i2 + 1 & "  order by id asc")
		End If
		Dim equals As Boolean = str = "RiepAsporto"
		If cursorWrapper4.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper4.RowCount - 1
			Dim z2 As Boolean = False
			Dim i3 As Int
			For i3 = 0 To rowCount
				cursorWrapper4.Position = i3
				Dim str2 As String = "select count(*) from daStampare where turno = " & cursorWrapper2.GetString("turno") & " and id = '" & cursorWrapper4.GetString("id") & "' and qta <> 0 "
				If equals Or cursorWrapper.GetInt("TuttiTurni") = 1 Then
					str2 = "select count(*) from daStampare where id = '" & cursorWrapper4.GetString("id") & "' and qta <> 0 "
				End If
				cursorWrapper.Position = cursorWrapper4.GetInt("codstampa") - 1
				If cursorWrapper.GetInt("datavolo") > 0 And cursorWrapper.GetInt("atavolo") > 0 Then
					If Main.vSql1.ExecQuerySingleResult("Select case when max(tavolo) is null then 0 else max(tavolo) end from daStampare where id = '" & cursorWrapper3.GetString("id") & "' and qta <> 0 ") > 0 Then
						str2 = str2 & " and (tavolo >=" & SmartStringFormatter("", cursorWrapper.GetInt("datavolo")) & " and tavolo <=" & SmartStringFormatter("", cursorWrapper.GetInt("atavolo")) & ") "
					End If
				End If
				cursorWrapper.Position = i2
				If Main.vSql1.ExecQuerySingleResult(str2) > 0 Then
					If Not(z2) Then
						ckprinterVar.doc_testostile(i = 1, True, True, False, False, False, False, "")
						ckprinterVar.doc_testostampa("***************************************")
						z = True
					Else
						z = z2
					End If
					ckprinterVar.doc_testostile(i = 1, cursorWrapper.GetInt("TuttiTurni") = 1, False, False, False, False, False, "")
					cursorWrapper.Position = cursorWrapper4.GetInt("codstampa") - 1
					Dim vGetInt As Int = cursorWrapper.GetInt("layout")
					ckprinterVar.doc_testostampa(" --> " & cursorWrapper.GetString("descrizione"))
					cursorWrapper.Position = i2
					If cursorWrapper.GetInt(str & "D") = 1 Then
						If Not(equals) And cursorWrapper.GetInt("TuttiTurni") = 1 Then
							Dim cursorWrapper7 As Cursor
							Dim cursorWrapper8 As Cursor = Main.vSql1.ExecQuery("select qta,descrizione,turno,codint from daStampare where id = '" & cursorWrapper4.GetString("id") & "' and qta <> 0 order by turno,reparto ")
							If cursorWrapper8.RowCount > 0 Then
								Dim rowCount2 As Int = cursorWrapper8.RowCount - 1
								Dim i4 As Int = -123
								Dim i5 As Int
								For i5 = 0 To rowCount2
									cursorWrapper8.Position = i5
									If Round2(cursorWrapper8.GetDouble("qta"), 3) <> 0 And cursorWrapper8.GetString("codint") <> "Turno" Then
										If i4 <> cursorWrapper8.GetString("turno") Then
											Dim parseDouble As Int = cursorWrapper8.GetString("turno")
											ckprinterVar.doc_testostile(i = 1, True, False, False, False, False, parseDouble = cursorWrapper2.GetString("turno"), "")
											If vGetInt = 11 And cursorWrapper8.GetString("turno") = -1 Then
												ckprinterVar.doc_testostile(i = 1, True, True, False, False, False, True, "")
												ckprinterVar.doc_testostampa(" **** Turno Veloce **** ")
												ckprinterVar.doc_testostile(i = 1, True, False, False, False, False, parseDouble = cursorWrapper2.GetString("turno"), "")
											Else
												ckprinterVar.doc_testostampa("   Turno " & Abs(cursorWrapper8.GetInt("turno")))
											End If
											ckprinterVar.doc_testostile(parseDouble <> cursorWrapper2.GetString("turno"), parseDouble = cursorWrapper2.GetString("turno"), False, False, False, False, False, "")
											i4 = parseDouble
										End If
										ckprinterVar.doc_testostampa(modfunstr.Sub004(6) & modfunstr.left(cursorWrapper8.GetString("qta") & modfunstr.Sub004(5), 5) & cursorWrapper8.GetString("descrizione"))
									End If
								Next
								ckprinterVar.doc_testostampa(" -------------------------------- ")
							End If
							cursorWrapper8.Close
							z2 = z
						Else
							Dim cursorWrapper9 As Cursor
							Dim cursorWrapper10 As Cursor = Main.vSql1.ExecQuery("select qta,descrizione,codint from daStampare where turno = " & cursorWrapper2.GetString("turno") & " and id = '" & cursorWrapper4.GetString("id") & "' and qta <> 0 order by reparto ")
							If cursorWrapper10.RowCount > 0 Then
								Dim rowCount3 As Int = cursorWrapper10.RowCount - 1
								Dim i6 As Int
								For i6 = 0 To rowCount3
									cursorWrapper10.Position = i6
									If Round2(cursorWrapper10.GetDouble("qta"), 3) <> 0 And cursorWrapper10.GetString("codint") <> "Turno" Then
										ckprinterVar.doc_testostampa(modfunstr.Sub004(5) & modfunstr.left(cursorWrapper10.GetString("qta") & modfunstr.Sub004(5), 5) & cursorWrapper10.GetString("descrizione"))
									End If
								Next
							End If
							cursorWrapper10.Close
						End If
					End If
					z2 = z
				End If
			Next
			If z2 Then
				ckprinterVar.doc_testostile(i = 1, True, True, False, False, False, False, "")
				ckprinterVar.doc_testostampa("***************************************")
			End If
		End If
		cursorWrapper4.Close
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub196(i As Int) As Boolean
	Try
		Dim vTmp As ckprinter = Sub138(Main.v_notallon - 1)
		If vTmp = Null Then
			Return False
		End If
		vTmp.doc_inizio
		vTmp.doc_paginizio(False)
		vTmp.doc_testostile(False, True, True, False, False, False, False, "")
		vTmp.doc_testogiustifica(1)
		vTmp.doc_testostampa("------------------------------------")
		If Main.v_disconnettiprt Then
			vTmp.doc_testostampa("Attendere il proprio numero: " & Chr(64 + Main.v_numcassa) & i)
		Else
			vTmp.doc_testostampa("Attendere il proprio numero: " & i)
		End If
		vTmp.doc_testostampa("------------------------------------")
		vTmp.doc_pagfine(False)
		vTmp.doc_fine
		If Main.v_disconnettiprt Then
			vTmp.Sub001
		End If
		Return True
	Catch
		Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub197(str As String, ckprinterVar As ckprinter, str2 As String)
	If str.Contains(CRLF) Then
		Dim vSplit() As String = Regex.Split(CRLF, str)
		Dim length As Int = vSplit.Length - 1
		Dim i As Int
		For i = 0 To length
			ckprinterVar.doc_testostampa(vSplit(i))
		Next
	Else
		ckprinterVar.doc_testostampa(str)
	End If
	If File.Exists(File.DirDefaultExternal & "/ImgStampe", str2 & ".buf") Then
		ckprinterVar.doc_img(str2 & ".buf", File.DirDefaultExternal & "/ImgStampe")
		Return
	End If
End Sub

Sub Sub198(str As String)
	vStr1 = str
	If Not( = Null) Then
		 = 
	End If
	StartActivity(str)
End Sub

Sub Sub199(str As String) As List
	Dim list As List
	list.Initialize
	Dim indexOf As Int = str.IndexOf(" ")
	Do While indexOf > -1
		Dim substring As String = str.SubString2(0, indexOf)
		str = str.SubString(indexOf + 1)
		list.Add(substring)
		indexOf = str.IndexOf(" ")
	Loop
	list.Add(str)
	Return list
End Sub

Sub Sub200(map As Map) As Boolean
	Dim size As Int = map.Size - 1
	Dim i As Int
	For i = 0 To size
		If map.GetValueAt(i) Then
			Return True
		End If
	Next
	Return False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m5… (riga 20783).
Sub Sub201(map As Map, cursorWrapper As Cursor, str As String, str2 As String, buttonWrapper As Button) As Boolean
	Dim vNumberToString As String
	Dim str3 As String
	Dim str4 As String
	Dim i As Int
	Dim valueOf As Int
	Dim z As Boolean
	Dim str5 As String
	Dim str6 As String = ""
	Dim inputDialog As InputDialog
	Dim z2 As Boolean = False
	If Sub200(map) And cursorWrapper.IsInitialized And cursorWrapper.RowCount > 0 Then
		Dim str7 As String = ""
		Dim str8 As String = ""
		Dim str9 As String = "0"
		If map.Get("Copia la funzione") Then
			Dim vGetString As String = cursorWrapper.GetString("tipo")
			Select vGetString
				Case Main.t_tastierino
					Dim list As List
					list.Initialize
					list.AddAll(ArrayToList(Array As String("1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "00", "C", ",", "X")))
					Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il valore del tasto:")
					If vInputList1 >= 0 Then
						str6 = ",importo = " & cursorWrapper.GetString("importo").Replace(",", ".") & ",valore = 0,tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
						str7 = list.Get(vInputList1)
						buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
					End If
				Case Main.t_funzione
					Dim vGetString2 As String = cursorWrapper.GetString("valore")
					If vGetString2 <> Main.f_gruppo Then
						Dim vGetString3 As String = cursorWrapper.GetString("valore")
						If vGetString3 <> Main.f_allergeni Then
							Dim vInputList12 As Int = idLib.InputList1(Main.vLst1, "Selezionare la funzione:")
							If vInputList12 >= 0 Then
								Dim parseDouble As Int = Sub105(Main.t_funzione, Main.vLst1.Get(vInputList12))
								i = parseDouble
								str4 = Main.vLst1.Get(vInputList12)
								Dim vNumberToString2 As String = i
								valueOf = i
								Select valueOf
									Case Main.f_maggiorazione
										inputDialog.InputType = 2
										inputDialog.Input = ""
										inputDialog.Hint = "% Maggiorazione"
										inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
										inputDialog.PasswordMode = False
										Dim vShow As Int = inputDialog.Show("Indicare la % di Maggiorazione (0=Maggiorazione Libera)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
										If vShow = -1 And IsNumber(inputDialog.Input) Then
											str4 = "Maggiorazione Totale"
											Dim parseDouble2 As Double = inputDialog.Input
											If parseDouble2 >= 0 And parseDouble2 <= 100 Then
												Dim vNumberFormat2 As String = NumberFormat2(parseDouble2, 1, 0, 0, False)
												str4 = "Maggiorazione Totale " & vNumberFormat2 & " Perc."
												str5 = ", importo=" & vNumberFormat2.Replace(",", ".") & ",valore = " & i & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
												z = True
												If Not(z) Then
													str7 = str4
													str6 = str5
													str9 = vNumberToString2
													buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
												End If
											End If
										End If
										z = False
										str5 = ""
										If Not(z) Then
										End If
									Case Main.f_scontototale
										inputDialog.InputType = 2
										inputDialog.Input = ""
										inputDialog.Hint = "% Sconto"
										inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
										inputDialog.PasswordMode = False
										Dim vShow2 As Int = inputDialog.Show("Indicare la % di sconto (0=Sconto Libero)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
										If vShow2 = -1 And IsNumber(inputDialog.Input) Then
											str4 = "Sconto Totale"
											Dim parseDouble3 As Double = inputDialog.Input
											If parseDouble3 >= 0 And parseDouble3 <= 100 Then
												Dim vNumberFormat22 As String = NumberFormat2(parseDouble3, 1, 0, 0, False)
												str4 = "Sconto Totale " & vNumberFormat22 & " Perc."
												str6 = ", importo=" & vNumberFormat22.Replace(",", ".") & ",valore = " & i & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
												z2 = True
											End If
										End If
										If Not(z2) Then
										End If
										str7 = str4
										str9 = vNumberToString2
										buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
									Case Main.f_abbuono
										inputDialog.InputType = 12290
										inputDialog.Input = ""
										inputDialog.Hint = "Valore Abbuono"
										inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
										inputDialog.PasswordMode = False
										Dim vShow3 As Int = inputDialog.Show("Indicare l'importo dell'abbouno (Max 500€ -- 0= Libero)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
										If vShow3 = -1 And IsNumber(inputDialog.Input) Then
											str4 = "Abbuono"
											Dim parseDouble4 As Double = inputDialog.Input
											If parseDouble4 >= 0 And parseDouble4 <= 100 Then
												Dim vNumberFormat23 As String = NumberFormat2(parseDouble4, 1, 0, 0, False)
												str4 = "Abbuono " & vNumberFormat23 & " €"
												str6 = ", importo=" & vNumberFormat23.Replace(",", ".") & ",valore = " & i & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
												z2 = True
											End If
										End If
										If Not(z2) Then
										End If
										str7 = str4
										str9 = vNumberToString2
										buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
									Case Main.f_modificatore
										Dim numberDialog As NumberDialog
										numberDialog.Digits = 4
										numberDialog.Number = 0
										numberDialog.Decimal = 0
										numberDialog.ShowSign = True
										Dim vShow4 As Int = numberDialog.Show("Indicare la variazione %(in positivo o in negativo) della quantità", "Ok", "Annulla", "", Main.vBmp1)
										If vShow4 = -1 And numberDialog.Number >= -100 And numberDialog.Number <= 100 Then
											str6 = ", importo=" & numberDialog.Number & ",valore = " & i & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
											z2 = True
										End If
										If Not(z2) Then
										End If
										str7 = str4
										str9 = vNumberToString2
										buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
									Case Main.f_messaggio
										Dim list2 As List
										list2.Initialize
										Dim cursorWrapper2 As Cursor
										Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select codint,descrizione from anagra where flgusointerno = 1 and lower(substr(codint,1,3))='msg' order by codint")
										If cursorWrapper3.RowCount > 0 Then
											Dim rowCount As Int = cursorWrapper3.RowCount - 1
											Dim i3 As Int
											For i3 = 0 To rowCount
												cursorWrapper3.Position = i3
												list2.Add(cursorWrapper3.GetString("descrizione"))
											Next
										End If
										cursorWrapper3.Close
										If list2.Size <> 0 Then
											Dim vInputList13 As Int = idLib.InputList1(list2, "Selezionare il messaggio da inserire:")
											If vInputList13 >= 0 Then
												str4 = Main.vSql1.ExecQuerySingleResult("select descrizione from anagra where codint = 'msg" & vInputList13 & "'")
												str6 = ", importo=" & vInputList13 & ",valore = " & i & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
												z2 = True
											End If
											If Not(z2) Then
											End If
											str7 = str4
											str9 = vNumberToString2
											buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
										End If
									Case Main.f_gruppo
										Dim list3 As List
										list3.Initialize
										Dim cursorWrapper4 As Cursor
										Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione from gruppovar order by codice")
										If cursorWrapper5.RowCount > 0 Then
											Dim rowCount2 As Int = cursorWrapper5.RowCount - 1
											Dim i4 As Int
											For i4 = 0 To rowCount2
												cursorWrapper5.Position = i4
												list3.Add(cursorWrapper5.GetString("descrizione"))
											Next
										End If
										If list3.Size <> 0 Then
											Dim vInputList14 As Int = idLib.InputList1(list3, "Selezionare il gruppo da inserire:")
											If vInputList14 >= 0 Then
												cursorWrapper5.Position = vInputList14
												str4 = cursorWrapper5.GetString("descrizione")
												str6 = ", importo=" & vInputList14 & ",valore = " & i & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
												z2 = True
											End If
											cursorWrapper5.Close
											If Not(z2) Then
											End If
											str7 = str4
											str9 = vNumberToString2
											buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
										End If
									Case Main.f_allergeni
										Dim list4 As List
										list4.Initialize
										Dim cursorWrapper6 As Cursor
										Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione from allergeni order by codice")
										If cursorWrapper7.RowCount > 0 Then
											Dim rowCount3 As Int = cursorWrapper7.RowCount - 1
											Dim i5 As Int
											For i5 = 0 To rowCount3
												cursorWrapper7.Position = i5
												list4.Add(cursorWrapper7.GetString("descrizione"))
											Next
										End If
										If list4.Size <> 0 Then
											Dim vInputList15 As Int = idLib.InputList1(list4, "Selezionare L'allergene o Tag:")
											If vInputList15 >= 0 Then
												cursorWrapper7.Position = vInputList15
												str4 = cursorWrapper7.GetString("descrizione")
												str6 = ", importo=" & vInputList15 & ",valore = " & i & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
												z2 = True
											End If
											cursorWrapper7.Close
											If Not(z2) Then
											End If
											str7 = str4
											str9 = vNumberToString2
											buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
										End If
									Case Else
										str6 = ",importo = " & cursorWrapper.GetString("importo").Replace(",", ".") & ",valore = " & i & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
										str7 = str4
										str9 = vNumberToString2
										buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
								End Select
							End If
						End If
					End If
					Dim vGetString4 As String = cursorWrapper.GetString("valore")
					If vGetString4 = Main.f_gruppo Then
						i = Main.f_gruppo
						str4 = "Gruppo"
					Else
						Dim vGetString5 As String = cursorWrapper.GetString("valore")
						If vGetString5 <> Main.f_allergeni Then
							str4 = ""
							i = -1
						Else
							i = Main.f_allergeni
							str4 = "Allergeni e Tag"
						End If
					End If
					Dim vNumberToString22 As String = i
					valueOf = i
					Select valueOf
					End Select
				Case Main.t_pagamento
					If cursorWrapper.GetDouble("importo") > 0 And cursorWrapper.GetInt("valore") = 0 Then
						Dim list5 As List
						list5.Initialize
						list5.AddAll(ArrayToList(Array As String("0,05 €", "0,10 €", "0,20 €", "0,50 €", "1,00 €", "2,00 €", "5,00 €", "10,00 €", "20,00 €", "50,00 €", "100,00 €", "200,00 €", "500,00 €")))
						Dim vInputList16 As Int = idLib.InputList1(list5, "Indicare il valore in contanti del tasto")
						If vInputList16 >= 0 Then
							Dim list6 As List
							list6.Initialize
							list6.Clear
							Dim size As Int = Main.vLst3.Size - 1
							Dim i6 As Int = 0
							Dim i7 As Int
							For i7 = 0 To size
								Dim vObjectToString As String = Main.vLst3.Get(i7)
								If vObjectToString.ToLowerCase.StartsWith("pag_") And vObjectToString.ToLowerCase.EndsWith("png") Then
									list6.InsertAt(i6, vObjectToString)
									i6 = i6 + 1
								End If
							Next
							Dim vObjectToString2 As String = list5.Get(vInputList16)
							Dim vObjectToString3 As String = list6.Get(vInputList16)
							z2 = True
							str7 = list5.Get(vInputList16)
							str6 = ",importo=" & vObjectToString2.SubString2(0, 4).Replace(",", ".") & ",valore = 0,tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
							str3 = vObjectToString3
							vNumberToString = "0"
							If Not(z2) Then
							End If
						End If
						vNumberToString = "0"
						str3 = ""
						If Not(z2) Then
						End If
					Else If cursorWrapper.GetDouble("importo") > 0 Then
						inputDialog.InputType = 12290
						inputDialog.Input = ""
						inputDialog.Hint = "importo"
						inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
						inputDialog.PasswordMode = False
						Dim vShow5 As Int = inputDialog.Show("Indicare il valore del pagamento(0=pagamento libero)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
						If vShow5 = -1 And IsNumber(inputDialog.Input) Then
							str7 = Main.vSql1.ExecQuerySingleResult("Select descrizione from pagamenti where codice = " & cursorWrapper.GetString("valore"))
							Dim vTmp As Double = Sub056(inputDialog.Input)
							If vTmp >= 0 And vTmp <= 1000 Then
								Dim vNumberFormat24 As String = NumberFormat2(vTmp, 1, 2, 2, False)
								str7 = str7 & " (" & vNumberFormat24 & " €)"
								vNumberToString = cursorWrapper.GetString("valore")
								str6 = ", importo=" & vNumberFormat24.Replace(",", ".") & ",valore = " & cursorWrapper.GetString("valore") & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
								z2 = True
								str3 = ""
								If Not(z2) Then
									str9 = vNumberToString
									str8 = str3
									buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
								End If
							End If
						End If
						vNumberToString = "0"
						str3 = ""
						If Not(z2) Then
						End If
					Else
						Dim vTmp_ As Int = Sub143("pagamenti", "Selezionare il pagamento dall'elenco")
						If vTmp_ >= 0 Then
							z2 = True
							str7 = Main.vSql1.ExecQuerySingleResult("Select descrizione from pagamenti where codice = " & vTmp_)
							vNumberToString = vTmp_
							str6 = ",valore = " & vTmp_ & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
							str3 = ""
							If Not(z2) Then
							End If
						End If
						vNumberToString = "0"
						str3 = ""
						If Not(z2) Then
						End If
					End If
				Case Main.t_reparto
					Dim vTmp__ As Int = Sub143("reparti", "Selezionare il reparto dall'elenco")
					If vTmp__ >= 0 Then
						z2 = True
						str9 = vTmp__
						str7 = Main.vSql1.ExecQuerySingleResult("Select descrizione from reparti where codice = " & vTmp__)
						str6 = ",valore = " & vTmp__ & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
					End If
					If Not(z2) Then
					End If
					buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
				Case Main.t_pagina
					Dim vInputList17 As Int = idLib.InputList1(Main.vLst4, "Selezionare la pagina")
					If vInputList17 >= 0 Then
						z2 = True
						str7 = Main.vLst4.Get(vInputList17)
						str9 = vInputList17 + 1
						str6 = ",valore = " & vInputList17 + 1 & ",tipo =" & cursorWrapper.GetString("tipo") & ",plurep=" & cursorWrapper.GetString("plurep")
					End If
					If Not(z2) Then
					End If
					buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
				Case Main.t_plu
					If Main.vBln46 Then
						str7 = Sub209(Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & Main.vStr14 & "'"))
						str9 = Main.vStr14
						str6 = ",plurep=0,valore = " & Main.vStr14 & ",tipo =" & cursorWrapper.GetString("tipo")
						buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
					Else
						Dim parseDouble5 As Int = Main.vSql1.ExecQuerySingleResult("Select reparto from anagra where codint='" & cursorWrapper.GetString("valore") & "'")
						If Not( = Null) Then
							 = 
						End If
						CallSub2(Main, "AddPluFromCopia", parseDouble5)
					End If
				Case Else
					buttonWrapper.Tag = cursorWrapper.GetString("tipo") & "," & str9 & "," & str & "," & str2
			End Select
			Return False
		End If
		If map.Get("Copia la dimensione del carattere") Then
			str6 = str6 & ",textsize = " & cursorWrapper.GetString("textsize")
		End If
		If str7 <> "" Then
			str6 = str6 & ",testo ='" & str7 & "'"
		Else If map.Get("Copia il testo") Then
			str6 = str6 & ",testo ='" & cursorWrapper.GetString("testo") & "'"
		End If
		If map.Get("Copia la dimensione") Then
			Dim z3 As Boolean = False
			If cursorWrapper.GetInt("dimensione") = 2 Then
				Dim parseDouble6 As Double = str2 + 1
				If parseDouble6 >= Main.vInt13 Then
					z3 = True
				End If
			End If
			If cursorWrapper.GetInt("dimensione") = 3 And str - 1 < 0 Then
				z3 = True
			End If
			If cursorWrapper.GetInt("dimensione") = 4 Then
				If str - 1 >= 0 Then
					Dim parseDouble7 As Double = str2 + 1
				End If
				z3 = True
			End If
			If z3 Then
				Dim vObjectToCharSequence As Object = "Non è possibile incollare su questo tasto"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Return False
			End If
			str6 = str6 & ",dimensione = " & cursorWrapper.GetString("dimensione")
		End If
		If map.Get("Copia il colore") Then
			str6 = str6 & ",colore  =  " & cursorWrapper.GetString("colore") & ", coloret=" & cursorWrapper.GetString("coloret")
		End If
		If map.Get("Copia l'icona") Or str8 <> "" Then
			If str8 = "" Then
				str6 = str6 & ",dll ='" & cursorWrapper.GetString("dll") & "',icona =" & cursorWrapper.GetString("icona")
			Else
				str6 = str6 & ",dll ='" & str8 & "',icona =" & cursorWrapper.GetString("icona")
			End If
		End If
		Dim sb As String = "update pagine set " & str6.SubString2(1, str6.Length) & " where pagina = " & Main.vInt30 & " and riga = " & str & " and colonna = " & str2
		Main.vSql1.ExecNonQuery(sb)
		Return True
	End If
	Return False
End Sub

Sub Sub202(str As String) As String
	Dim i As Int = 2001
	Do While True
		Dim i2 As Int = i
		If i2 <= 5000 Then
			Dim str2 As String = "DaCasse" & str & i2 & "1.tmp"
			If File.Exists(Main.vStr17, str2) Then
				i = i2 + 1
			Else
				Return str2
			End If
		Else
			Return "DaCasse" & str & "1.tmp"
		End If
	Loop
End Sub

Sub Sub203(sql As SQL, str As String) As Boolean
	Dim cursorWrapper As Cursor = sql.ExecQuery(str)
	If cursorWrapper.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper.Position = i
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from reparti where NF = 1 and codice = " & cursorWrapper.GetString("reparto")) > 0 Then
				Return True
			End If
		Next
	End If
	cursorWrapper.Close
	Return False
End Sub

Sub Sub204(str As String) As Boolean
	Dim z As Boolean = Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where unlocktable =" & str) > 0
	If Main.vBln24 Then
		If z Then
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select tavolo from tavoli where unlocktable =" & str)
			Dim list As List
			list.Initialize
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				list.Add(cursorWrapper2.GetInt("tavolo"))
			Next
			cursorWrapper2.Close
			list.Add(str)
			Main.vSql1.ExecNonQuery("update tavoli set unlocktable=0,lock=0 where unlocktable = " & str)
			Dim iArr(list.Size) As Int
			Dim size As Int = list.Size - 1
			Dim i2 As Int
			For i2 = 0 To size
				iArr(i2) = list.Get(i2)
			Next
			If Not( = Null) Then
				 = 
			End If
			CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr, Main.v_numcassa)
			Return True
		End If
		Dim iArr2() As Int = Array(str)
		If Not( = Null) Then
			 = 
		End If
		CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr2, Main.v_numcassa)
	Else
		Main.vSql1.ExecNonQuery("update tavoli set unlocktable=0,lock=0 where unlocktable = " & str)
	End If
	Return z
End Sub

Sub Sub205(str As String, str2 As String, str3 As String)
	If vStr9 <> str & str2 & str3 Then
		Main.vSql1.ExecNonQuery("update LastTmp set tipomovimento ='" & str & "',cliente ='" & str2 & "',recall=" & str3)
		vStr9 = str & str2 & str3
		Return
	End If
End Sub

Sub Sub206
	Try
		Main.vMap4.Initialize
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select codint,scop from headoff inner join dettoff on dettoff.codofferta = headoff.codofferta where scop>0 and headoff.attiva=1 and lower(substr(codint,1,5))='_rep_'")
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				Dim parseDouble As Int = cursorWrapper2.GetString("codint").Replace("_rep_", "")
				Main.vMap4.Put(parseDouble, cursorWrapper2.GetInt("scop"))
			Next
		End If
		cursorWrapper2.Close
		Return
	Catch
		Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub207(str As String)
	Dim str2 As String = "20" & str.SubString2(4, 6) & str.SubString2(2, 4) & str.SubString2(0, 2) & "." & str.SubString2(6, 8) & str.SubString2(8, 10) & "00"
	Dim stringBuilderWrapper As StringBuilder
	Dim stringBuilderWrapper2 As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper2.Initialize
	Dim vCombine As String = File.Combine(File.DirInternalCache, "runner")
	Dim vCombine2 As String = File.Combine(File.DirInternalCache, "command")
	File.WriteString(File.DirInternalCache, "runner", "su < " & vCombine2)
	File.WriteString(File.DirInternalCache, "command", "date -s " & QUOTE & str2 & QUOTE)
	Phone.Shell("sh", Array As String(vCombine), stringBuilderWrapper, stringBuilderWrapper2)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m2… (riga 21473).
Sub Sub208 As Boolean
	Dim z As Boolean = True
	If Main.vCur7.GetInt("TerzoTipoEser") > 0 Then
		If Main.vCur7.GetInt("TerzoTipoEser") <> 4 Then
			If Main.vCur7.GetString("TerzoCodiceTX") <> "" Then
			End If
			Dim vObjectToCharSequence As Object = "Verifica Dati Terzo intermediario o Emittente:" & CRLF & "E' obbligatorio inserire una partita iva valida."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return False
		End If
		If Main.vCur7.GetInt("TerzoTipoEser") <> 4 Then
			If Main.vCur7.GetString("TerzoCodiceTX") <> "" Then
			End If
			Dim vObjectToCharSequence3 As Object = "Verifica Dati Terzo intermediario o Emittente:" & CRLF & "E' obbligatorio inserire una partita iva valida."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			Return False
		End If
		If Main.vCur7.GetInt("TerzoTipoEser") = 4 Then
			If Main.vCur7.GetString("TerzoCFEser").Length = 11 Then
			End If
			Dim vObjectToCharSequence5 As Object = "Verifica Dati Terzo intermediario o Emittente:" & CRLF & "Per le persone giuridiche, obbligatorio inserire un codice fiscale lungo 11 caratteri."
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
			Return False
		End If
		If Main.vCur7.GetString("TerzoDenEser") = "" Then
			Dim vObjectToCharSequence7 As Object = "Verifica Dati Terzo intermediario o Emittente:" & CRLF & "E' obbligatorio inserire la denominazione."
			Dim vObjectToCharSequence8 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
			Return False
		End If
	End If
	If Main.vCur7.GetInt("RegFiscEser") = 0 Then
		Dim vObjectToCharSequence9 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio indicare un regime fiscale."
		Dim vObjectToCharSequence10 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
		z = False
	Else
		If Main.vCur7.GetString("NazioneEser") = "IT" Then
			If Main.vCur7.GetString("ProvinciaEser") = "" Then
				Dim vObjectToCharSequence11 As Object = "Verifica dati esercente:" & CRLF & "Non è stata indicare la provincia."
				Dim vObjectToCharSequence12 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
				z = False
			End If
		End If
		If Main.vCur7.GetInt("TipoEser") = 0 Then
			If Main.vCur7.GetString("CognomeEser") <> "" Then
			End If
			Dim vObjectToCharSequence13 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire il nome e il cognome."
			Dim vObjectToCharSequence14 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
			z = False
		End If
		If Main.vCur7.GetInt("TipoEser") > 0 Then
			If Main.vCur7.GetString("PIVAEser") <> "" Then
			End If
			Dim vObjectToCharSequence15 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire una partita iva valida."
			Dim vObjectToCharSequence16 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "OK", "", "", Main.vBmp1)
			z = False
		End If
		If Main.vCur7.GetInt("TipoEser") = 0 Then
			If Main.vCur7.GetString("CFEser") <> "" Then
				If Not(Sub134(Main.vCur7.GetString("CFEser"), True)) Then
				End If
			End If
			Dim vObjectToCharSequence17 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire un codice fiscale valido."
			Dim vObjectToCharSequence18 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence17, vObjectToCharSequence18, "OK", "", "", Main.vBmp1)
			z = False
		End If
		If Main.vCur7.GetInt("TipoEser") = 2 Then
			If Main.vCur7.GetString("UfficioREA") <> "" Then
				If Main.vCur7.GetString("NumeroREA") = "" Then
					Dim vObjectToCharSequence19 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire il Capitale Sociale REA."
					Dim vObjectToCharSequence20 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence19, vObjectToCharSequence20, "OK", "", "", Main.vBmp1)
					z = False
				End If
			End If
		End If
		If Main.vCur7.GetInt("SocUnicoREA") > 0 Then
			If Main.vCur7.GetInt("TipoEser") <> 2 Then
				Dim vObjectToCharSequence21 As Object = "Verifica dati esercente:" & CRLF & "Il socio unico può essere valorizzato solo in caso di società."
				Dim vObjectToCharSequence22 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence21, vObjectToCharSequence22, "OK", "", "", Main.vBmp1)
				z = False
			End If
		End If
		If Main.vCur7.GetInt("StatoLiquidazioneREA") = 1 Then
			If Main.vCur7.GetInt("TipoEser") <> 2 Then
				Dim vObjectToCharSequence23 As Object = "Verifica dati esercente:" & CRLF & "Lo stato 'In liquidazione' è attivabile solo per le società."
				Dim vObjectToCharSequence24 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence23, vObjectToCharSequence24, "OK", "", "", Main.vBmp1)
				z = False
			End If
		End If
		If Main.vCur7.GetString("DenEser") = "" Then
			Dim vObjectToCharSequence25 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire la denominazione."
			Dim vObjectToCharSequence26 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence25, vObjectToCharSequence26, "OK", "", "", Main.vBmp1)
			z = False
		Else
			If Main.vCur7.GetString("ViaEser") = "" Then
				Dim vObjectToCharSequence27 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire l'indirizzo."
				Dim vObjectToCharSequence28 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence27, vObjectToCharSequence28, "OK", "", "", Main.vBmp1)
				z = False
			Else
				If Main.vCur7.GetString("CittaEser") = "" Then
					Dim vObjectToCharSequence29 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire la località."
					Dim vObjectToCharSequence30 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence29, vObjectToCharSequence30, "OK", "", "", Main.vBmp1)
					z = False
				End If
			End If
		End If
	End If
	Return z
End Sub

Sub Sub209(str As String) As String
	If str.Length > 50 Then
		str = modfunstr.left(str, 50)
	End If
	If str = "" Then
		str = "Inserire Testo"
	End If
	Return str.Replace("'", "`").Replace("%", "").Replace("[", "").Replace("#", "").Replace(",", "").Replace(CRLF, "")
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/mod1.java, metodo m4… (riga 21679).
Sub Sub210(i As Int, str As String)
	Main.vCur1.Position = i - 1
	If Main.vCur1.GetInt("stato") <> 1 Then
		Return
	End If
	Dim vGetString As String = Main.vCur1.GetString("codice")
	Dim sb2 As String = Main.vStr7 & "/" & vGetString
	Initialize
	Dim vListFiles As List = File.ListFiles(sb2)
	If vListFiles.Size > 0 Then
		vListFiles.Sort(True)
		Dim size As Int = vListFiles.Size - 1
		Dim i2 As Int
		For i2 = 0 To size
			Dim vObjectToString As String = vListFiles.Get(i2)
			If vObjectToString.StartsWith("V") And vObjectToString.EndsWith(".txt") Then
				Dim vSplit() As String = Regex.Split("_", vObjectToString)
				Dim str2 As String = i & "_" & vSplit(0).SubString(1)
				If vSplit.Length = 7 Then
					If vSplit(0).Length > 11 Then
					End If
					Dim parseDouble As Int = vSplit(1)
					Dim equals As Boolean = vSplit(3) = 1
					Dim str3 As String = vSplit(2)
					Dim str4 As String = vSplit(5)
					If Sub109(vObjectToString, sb2, parseDouble, equals, i, str3, str4, modfunstr.Sub006(vSplit(4))) Then
						Dim iArr() As Int = Array(vSplit(1))
						Dim vNumberToString As String = i
						If str = "1" Then
							vNumberToString = Main.v_numcassa
						End If
						CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr, vNumberToString)
					End If
					If vSplit(0).Length > 11 Then
						Main.vSql1.ExecNonQuery("insert into chiaviClient(chiave,data) values('" & str2 & "','" & Sub057(DateTime.Date(Sub058()) & " " & DateTime.Time(Sub058())) & "')")
					End If
				End If
				If File.Exists(sb2, vObjectToString) Then
					File.Delete(sb2, vObjectToString)
				End If
			End If
		Next
	End If
End Sub

Sub Sub211(i As Int, str As String, str2 As String, str3 As String, str4 As String, str5 As String, str6 As String, str7 As String, str8 As String, str9 As String, str10 As String) As String
	Dim z As Boolean = Not(str3.Length > 3 And str3.SubString2(0, 1) = "_") And Not(Sub135(str3, True))
	Select i
		Case 0
			If str.Trim.Length = 0 Then
				Return "Inserire il nome del cliente."
			End If
			If str2.Trim.Length = 0 Then
				Return "Inserire il cognome del cliente."
			End If
			If str4.Trim.Length = 0 Then
				Return "Inserire il Codice Fiscale."
			End If
			If str5 = "IT" And Not(Sub134(str4.Trim, True)) Then
				Return "Codice Fiscale non valido"
			End If
			If str6.Trim.Length <> 7 Then
				Return "Codice Destinatario non valido(Deve essere composto da 7 caratteri)."
			End If
		Case 1
			If str.Trim.Length = 0 Then
				Return "Inserire il nome del cliente."
			End If
			If str.Trim.Length = 0 Then
				Return "Inserire il cognome del cliente."
			End If
			If str4.Trim.Length = 0 Then
				Return "Inserire il Codice Fiscale."
			End If
			If str5 = "IT" And str4.Trim.Length <> 16 Then
				Return "Codice Fiscale non valido"
			End If
			If z Then
				Return "Partita IVA non valida"
			End If
			If str6.Trim.Length <> 7 Then
				Return "Codice Destinatario non valido(Deve essere composto da 7 caratteri)."
			End If
		Case 2
			If str7.Trim = "" Then
				Return "Inserire la descrizione del cliente"
			End If
			If z Then
				Return "Partita IVA non valida"
			End If
			If str6.Trim.Length <> 7 Then
				Return "Codice Destinatario non valido(Deve essere composto da 7 caratteri)."
			End If
		Case 3, 5
			If str7.Trim = "" Then
				Return "Inserire la descrizione del cliente"
			End If
			If str5 <> "IT" Then
				Return "Paese non valido. Per la tipologia Pubblica Amministrazione, l'unico paese valido è l'Italia."
			End If
			If i = 5 Then
				If Not(Sub134(str4.Trim, True)) Then
					Return "Codice Fiscale non valido"
				End If
				If str4.Trim.Length <> 11 Then
					Return "Il Codice Fiscale deve essere lungo 11 caratteri (per le PA senza partita iva)"
				End If
				If str3 <> "" Then
					Return "A questa tipologia di cliente non può essere legata una partita iva"
				End If
			Else If z Then
				Return "Partita IVA non valida"
			End If
			If str6.Trim.Length <> 6 Then
				Return "Codice Destinatario non valido(Per la Pubblica Amministrazione deve essere composto da 6 caratteri)."
			End If
		Case 4
			If str7.Trim = "" Then
				Return "Inserire la descrizione del cliente"
			End If
			If str5 <> "IT" Then
				Return "La persona giuridica può essere selezionata sono con nazionalità italiana"
			End If
			If Not(Sub134(str4.Trim, True)) Then
				Return "Codice Fiscale non valido"
			End If
			If str4.Trim.Length <> 11 Then
				Return "Il Codice Fiscale deve essere lungo 11 caratteri (per le Persone giuridiche)"
			End If
			If str6.Trim.Length <> 7 Then
				Return "Codice Destinatario non valido(Deve essere composto da 7 caratteri)."
			End If
			If str3 <> "" Then
				Return "A questa tipologia di cliente non può essere legata una partita iva"
			End If
		Case Else
			Return "Selezionare una tipologia per il cliente"
	End Select
	If str5 = "" Then
		Return "Selezionare un paese per il cliente."
	End If
	If str5 = "IT" And str8.Trim.Length <> 2 Then
		Return "Inserire una provincia per l'indirizzo del cliente(2 lettere)."
	End If
	If str9.Trim.Length = 0 Then
		Return "Inserire un indirizzo"
	End If
	If str10.Trim.Length = 0 Then
		Return "Inserire una località"
	End If
	Return ""
End Sub

Sub Sub212(str As String, z As Boolean)
	Dim sql As SQL
	sql.Initialize(vStr4, "AnagraDoc.db", True)
	If Not(z) Then
		sql.ExecNonQuery("delete from venduto where nmov<>" & str)
		sql.ExecNonQuery("delete from headmov where nmov<>" & str)
		sql.ExecNonQuery("delete from CausaliPagamenti where nmov<>" & str)
	Else
		sql.ExecNonQuery("DROP TABLE IF EXISTS venduto")
		sql.ExecNonQuery("DROP TABLE IF EXISTS headmov ")
		sql.ExecNonQuery("DROP TABLE IF EXISTS CausaliPagamenti ")
		sql.ExecNonQuery("DROP TABLE IF EXISTS venduto ")
		sql.ExecNonQuery("attach database '" & File.DirDefaultExternal & "/venduto.db' as VendutoDB")
		sql.ExecNonQuery("CREATE TABLE venduto AS SELECT * FROM VendutoDB.venduto where nmov=" & str)
		sql.ExecNonQuery("CREATE TABLE headmov AS SELECT * FROM VendutoDB.headmov where nmov=" & str)
		sql.ExecNonQuery("CREATE TABLE CausaliPagamenti AS SELECT * FROM VendutoDB.CausaliPagamenti where nmov=" & str)
		sql.ExecNonQuery("DETACH DATABASE 'VendutoDB'")
	End If
	sql.Close
End Sub

Sub Sub213(str As String, i As Int, str2 As String) As String
	Dim str3 As String
	If str.Length >= i Then
		Dim vTmp As List = Sub199(str)
		Dim size As Int = vTmp.Size - 1
		Dim i2 As Int = 0
		str = ""
		Dim i3 As Int = i
		Do While i2 <= size
			Dim vObjectToString As String = vTmp.Get(i2)
			If vObjectToString.Length + 1 > i3 Then
				Dim str4 As String = CRLF & str2 & vObjectToString
				i3 = i - str4.Length
				str3 = str & str4
			Else
				i3 = i3 - (vObjectToString.Length + 1)
				If str <> "" Then
					str3 = str & " " & vObjectToString
				Else
					str3 = str & vObjectToString
				End If
			End If
			i2 = i2 + 1
			str = str3
		Loop
	End If
	Return str
End Sub

Sub Sub214
	If Not(vBln1) Then
		Dim vTmp As Long = Sub058()
		Dim textWriterWrapper As TextWriter
		textWriterWrapper.Initialize(File.OpenOutput(File.DirDefaultExternal & "/LOG", "Log.txt", True))
		textWriterWrapper.WriteLine("Ingresso procedura" & TAB & Main.vStr25 & TAB & Sub060(vTmp))
		textWriterWrapper.Close
		Return
	End If
End Sub

Sub Sub215(str As String)
	If Not(vBln1) Then
		Dim vTmp As Long = Sub058()
		Dim textWriterWrapper As TextWriter
		textWriterWrapper.Initialize(File.OpenOutput(File.DirDefaultExternal & "/LOG", "Log.txt", True))
		textWriterWrapper.WriteLine(Main.vStr25 & TAB & Sub060(vTmp) & TAB & str)
		textWriterWrapper.Close
		Return
	End If
End Sub

Sub Sub216
	Dim map As Map
	map.Initialize
	map.Put("RowH", Main.vInt27)
	map.Put("IPCassa", Main.v_ipcassa)
	map.Put("IPVis", Main.v_ipvis)
	map.Put("IPRPI", Main.v_iprpi)
	map.Put("UsbPath", Main.v_usbpath)
	map.Put("PrefissoCliente", Main.v_prefissocliente)
	map.Put("PrefissoTT", Main.v_prefissott)
	map.Put("MantieniNoPaginati", Main.v_mantieninopaginati)
	map.Put("PercorsoAzzera", Main.v_percorsoazzera)
	map.Put("MaxImpo", Main.v_maximpo)
	map.Put("FondoCassaAuto", Main.v_fondocassaauto)
	map.Put("MaxImpTavolo", Main.v_maximptavolo)
	map.Put("TipoFrazionamentoVariazioni", Main.v_tipofrazionamentovariazioni)
	map.Put("ValorizzazionePrezzoFrazione", Main.v_valorizzazioneprezzofrazione)
	map.Put("WebSospendiTavolo", Main.v_websospenditavolo)
	map.Put("MinTavoloLento", Main.v_mintavololento)
	map.Put("NumeroScontriniST", Main.v_numeroscontrinist)
	map.Put("CopieFE", Main.v_copiefe)
	map.Put("CopieFE2", Main.v_copiefe2)
	map.Put("ListPoco", Main.v_listpoco)
	map.Put("InizioGiorno", Main.v_iniziogiorno)
	map.Put("AltezzaVariazioni", Main.v_altezzavariazioni)
	map.Put("ListMolto", Main.v_listmolto)
	map.Put("AsportoAnticipo", Main.v_asportoanticipo)
	map.Put("MinutiSS", Main.v_minutiss)
	map.Put("PrenotaGiorni", Main.v_prenotagiorni)
	map.Put("PrenotaGiorniApertura", Main.v_prenotagiorniapertura)
	map.Put("NumeroTT", Main.v_numerott)
	map.Put("CodAttivazione", Main.v_codattivazione)
	map.Put("CodAttivazioneSB", Main.v_codattivazionesb)
	map.Put("CodAttivazioneBS", Main.v_codattivazionebs)
	map.Put("Tabacchi", Main.v_tabacchi)
	map.Put("GestioneSpiagge", Main.v_gestionespiagge)
	map.Put("TermSala", Main.v_termsala)
	map.Put("TermSalaBN", Main.v_termsalab)
	map.Put("TermSalaOp", Main.v_termsalaop)
	map.Put("Salvataggio", Main.v_salvataggio)
	map.Put("SBPWD", Main.v_sbpwd)
	map.Put("ServerSave", Main.v_serversave)
	map.Put("UtenteSave", Main.v_utentesave)
	map.Put("PasswordSave", Main.v_passwordsave)
	map.Put("PrefixFTPSave", Main.v_prefixftpsave)
	map.Put("StampaSala", Main.v_stampasala)
	map.Put("Stampa66Char", Main.v_stampa66char)
	map.Put("RepartoGV", Main.v_repartogv)
	map.Put("nSalva", Main.v_nsalva)
	map.Put("RiepNFN", Main.v_riepnf)
	map.Put("ErrMail", Main.v_errmail)
	Dim i As Int
	For i = 0 To 7
		Dim str As String = "Dalle" & i
		map.Put(str, Main.v_dalle(i))
		Dim str2 As String = "Alle" & i
		map.Put(str2, Main.v_alle(i))
		Dim str3 As String = "ListinoH" & i
		map.Put(str3, Main.v_listinoh(i))
	Next
	map.Put("SalvaOra", Main.v_salvaora)
	map.Put("GloryN", Main.v_glory)
	map.Put("TallonPremio", Main.v_tallonpremio)
	map.Put("Listino2aZero", Main.v_listino2azero)
	map.Put("ControllaPrezziaZero", Main.v_controllaprezziazero)
	map.Put("FatturaFMT2", Main.v_fatturafmt2)
	map.Put("AttivaFE", Main.v_attivafe)
	map.Put("PausaFE", Main.v_pausafe)
	map.Put("AsyncFE", Main.v_asyncfe)
	map.Put("Tema2", Main.v_tema2)
	map.Put("TemaG", Main.v_temag)
	map.Put("Sfondo", Main.v_sfondo)
	map.Put("Tastiera", Main.v_tastiera)
	map.Put("ColonneVarianti", Main.v_colonnevarianti)
	map.Put("ArticoliZero", Main.v_articolizero)
	map.Put("TipoInterfaccia", Main.v_tipointerfaccia)
	map.Put("LeggiCodLotteria", Main.v_leggicodlotteria)
	map.Put("SoloChiusura", Main.v_solochiusura)
	map.Put("TipoImpTabacchi", Main.v_tipoimptabacchi)
	map.Put("SendClienti", Main.v_sendclienti)
	map.Put("IvaDefault", Main.v_ivadefault)
	map.Put("PagamentoPrep", Main.v_pagamentoprep)
	map.Put("OrdinamentoSc", Main.v_ordinamentosc)
	map.Put("XPunti", Main.v_xpunti)
	map.Put("MargineTabacchi", Main.v_marginetabacchi)
	map.Put("OgnoEuro", Main.v_ognoeuro)
	map.Put("ArrotondaV", Main.v_arrotondav)
	map.Put("ArrotondaContantiRT", Main.v_arrotondacontantirt)
	map.Put("FontSizeC", Main.v_fontsizec)
	map.Put("StampaConto", Main.v_stampaconto)
	map.Put("StampaFattura", Main.v_stampafattura)
	map.Put("ConsolidaIncassi", Main.v_consolidaincassi)
	map.Put("OpObbligatorio", Main.v_opobbligatorio)
	map.Put("Terminalino", Main.v_terminalino)
	map.Put("DatiCompletiDC", Main.v_daticompletidc)
	map.Put("RegCancellazioni", Main.v_regcancellazioni)
	map.Put("LogMF", Main.v_logmf)
	map.Put("LogVD", Main.v_logvd)
	map.Put("LogNF", Main.v_lognf)
	map.Put("EFTSM", Main.v_eftsm)
	map.Put("EFTSMStampa", Main.v_eftsmstampa)
	map.Put("EFTSMSCONTI", Main.v_eftsmsconti)
	map.Put("IPEFTSM", Main.v_ipeftsm)
	map.Put("PORTAEFTSM", Main.v_portaeftsm)
	map.Put("WebApiDatiRetailer", Main.v_webapidatiretailer)
	map.Put("WebApiIndirizzo", Main.v_webapiindirizzo)
	map.Put("WebApiPI", Main.v_webapipi)
	map.Put("WebApiPIEsercente", Main.v_webapipiesercente)
	map.Put("WebApiCAPEsercente", Main.v_webapicapesercente)
	map.Put("WebApiRagSoc", Main.v_webapiragsoc)
	map.Put("PrefissoCoupon", Main.v_prefissocoupon)
	map.Put("PaginaPagamenti", Main.v_paginapagamenti)
	map.Put("AttivaMP", Main.v_attivamp)
	map.Put("AttivaKeyHTTP", Main.v_attivakeyhttp)
	map.Put("AttivaInserimentoCliente", Main.v_attivainserimentocliente)
	map.Put("barra2", Main.v_barrareal2)
	map.Put("AttivaSezionali", Main.v_attivasezionali)
	map.Put("AttivaAzzeramentoProgressivi", Main.v_attivaazzeramentoprogressivi)
	map.Put("noteInFE", Main.v_noteinfe)
	map.Put("LastDataDocFM", Main.v_lastdatadocfm)
	map.Put("ServerBila", Main.v_ipserverbila)
	map.Put("IpEft1", Main.v_ipeftm(1))
	map.Put("IpEft2", Main.v_ipeftm(2))
	map.Put("IpEft3", Main.v_ipeftm(3))
	map.Put("IpEft4", Main.v_ipeftm(4))
	map.Put("IpEft5", Main.v_ipeftm(5))
	map.Put("IpEft6", Main.v_ipeftm(6))
	map.Put("IpEft7", Main.v_ipeftm(7))
	map.Put("IpEft8", Main.v_ipeftm(8))
	map.Put("IpEft9", Main.v_ipeftm(9))
	map.Put("ProcAuto1", Main.v_procauto(1))
	map.Put("ProcAuto2", Main.v_procauto(2))
	map.Put("ProcAuto3", Main.v_procauto(3))
	map.Put("ProcAuto4", Main.v_procauto(4))
	map.Put("ProcAuto5", Main.v_procauto(5))
	map.Put("IpRicevute", Main.v_ipricevute)
	map.Put("ipDistributore", Main.v_ipdistributore)
	map.Put("DesAsporto", Main.v_desasporto)
	map.Put("DesPreconto", Main.v_despreconto)
	map.Put("DesATesta", Main.v_desatesta)
	map.Put("RicevutaDaPdv", Main.v_ricevutadapdv)
	map.Put("RicevutaAPdv", Main.v_ricevutaapdv)
	map.Put("RicevutaDaCli", Main.v_ricevutadacli)
	map.Put("RicevutaACli", Main.v_ricevutaacli)
	map.Put("RicevutaDaCor", Main.v_ricevutadacor)
	map.Put("RicevutaACor", Main.v_ricevutaacor)
	map.Put("RicevutaSpazioMF", Main.v_ricevutaspaziomf)
	map.Put("nRowGrid", Main.vInt14)
	map.Put("nRows", Main.vInt12)
	map.Put("nColGrid", Main.vInt15)
	map.Put("nCols", Main.vInt13)
	map.Put("ntasti", Main.vInt11)
	map.Put("IntestaNF", Main.v_intestanf)
	map.Put("RiepNFDett", Main.v_riepnfdett)
	map.Put("ExportCorrispettivi", Main.v_exportcorrispettivi)
	map.Put("ChangeUscita", Main.v_changeuscita)
	map.Put("Eula", Main.v_eula)
	map.Put("StampaComande", Main.v_stampacomande)
	map.Put("Turni", Main.v_turni)
	map.Put("AsportoOra", Main.v_asportoora)
	map.Put("SalvaVDN", Main.v_salvavd)
	map.Put("Consolida", Main.v_consolida)
	map.Put("ConsolidaSc", Main.v_consolidasc)
	map.Put("VarAutoCP", Main.v_varautocp)
	map.Put("VisualizzaVariazioni", Main.v_visualizzavariazioni)
	map.Put("OrdinaInserimentoVariazioni", Main.v_ordinainserimentovariazioni)
	map.Put("GestCoperti2", Main.v_gestcoperti2)
	map.Put("ConsolidaLast", Main.v_consolidalast)
	map.Put("ObbligoOp", Main.v_obbligoop)
	map.Put("ObbligoOpAvvio", Main.v_obbligoopavvio)
	map.Put("ObbligoOpMovimento", Main.v_obbligoopmovimento)
	map.Put("OpExtended", Main.v_opextended)
	map.Put("RiduciMsg", Main.v_riducimsg)
	map.Put("NoForceCoperti", Main.v_noforcecoperti)
	map.Put("RiepOnly", Main.v_rieponly)
	map.Put("VerificaStampanti", Main.v_verificastampanti)
	map.Put("AzzeraAsporto", Main.v_azzeraasporto)
	map.Put("ChiediNAsporto", Main.v_chiedinasporto)
	map.Put("Icone2", Main.v_icone2)
	map.Put("RootDateTime", Main.v_rootdatetime)
	map.Put("DataOraNoRoot", Main.v_dataoranoroot)
	map.Put("AttivaNumTavolo", Main.v_attivanumtavolo)
	map.Put("Sottoconti", Main.v_sottoconti)
	map.Put("AddDisponibilita", Main.v_adddisponibilita)
	map.Put("FrazionaConImportoN", Main.v_frazionaconimporto)
	map.Put("ImpoSuQta", Main.v_imposuqta)
	map.Put("ConsideraPrzIntero", Main.v_consideraprzintero)
	map.Put("TastiOmbreggiati", Main.v_tastiombreggiati)
	map.Put("DisconnettiPRT", Main.v_disconnettiprt)
	map.Put("IncassoOperatori", Main.v_incassooperatori)
	map.Put("RicCredito", Main.v_riccredito)
	map.Put("Icone2UPD", Main.v_icone2upd)
	map.Put("OraFatt", Main.v_orafatt)
	map.Put("StampaSposta", Main.v_stampasposta)
	map.Put("Emergenza", Main.v_emergenza)
	map.Put("Totem", Main.v_totem)
	map.Put("ControlloTurni", Main.v_controlloturni)
	map.Put("AvantiTurnoAuto", Main.v_avantiturnoauto)
	map.Put("Turno1Sempre", Main.v_turno1sempre)
	map.Put("Spooler", Main.v_spooler)
	map.Put("CheckVarianti", Main.v_checkvarianti)
	map.Put("Tallon", Main.v_notallon)
	map.Put("StampaReport", Main.v_stampareport)
	map.Put("TallonSempre", Main.v_tallonsempre)
	map.Put("CassettoSubito", Main.v_cassettosubito)
	map.Put("SuonoDaCassa", Main.v_suonodacassa)
	map.Put("StampaNomeCliN", Main.v_stampanomecli)
	map.Put("ModificaMovimento", Main.v_modificamovimento)
	map.Put("ImportazioneAuto", Main.v_importazioneauto)
	map.Put("CentralizzaDoc", Main.v_centralizzadoc)
	map.Put("GiacSede", Main.v_giacsede)
	map.Put("NumCassa", Main.v_numcassa)
	map.Put("nNegozio", Main.v_nnegozio)
	map.Put("ScreenBrightness", Main.v_screenbrightness)
	map.Put("Utente", Main.v_uid)
	map.Put("Password", Main.v_pwd)
	map.Put("ObbligoClienteF", Main.v_obbligoclientef)
	map.Put("Intesta", Main.v_intesta)
	map.Put("Server", Main.v_ipserver)
	map.Put("barra", Main.v_barrareal)
	map.Put("mServer", Main.v_mserver)
	map.Put("AttivaTerminale", Main.v_attivaterminale)
	map.Put("SoloVenduto", Main.v_solovenduto)
	map.Put("AzzeraDati", Main.v_azzeradati)
	map.Put("NoDatiPeriodo", Main.v_nodatiperiodo)
	map.Put("mPorta", Main.v_mporta)
	map.Put("mUser", Main.v_muser)
	map.Put("mPwd", Main.v_mpwd)
	map.Put("mUserS", Main.v_musers)
	map.Put("mPwdS", Main.v_mpwds)
	map.Put("mDesMittente", Main.v_mdesmittente)
	map.Put("mD1", Main.v_md1)
	map.Put("mD2", Main.v_md2)
	map.Put("mD3", Main.v_md3)
	map.Put("mD4", Main.v_md4)
	map.Put("mD5", Main.v_md5)
	map.Put("DataLastBackup", Main.v_datalastbackup)
	File.WriteMap(File.DirDefaultExternal, "Config.txt", map)
End Sub

Sub Sub217(str As String)
	If Not(vBln1) Then
		Dim vTmp As Long = Sub058()
		Dim textWriterWrapper As TextWriter
		textWriterWrapper.Initialize(File.OpenOutput(File.DirDefaultExternal & "/LOG", "Log.txt", True))
		textWriterWrapper.WriteLine(Main.vStr25 & TAB & Sub060(vTmp) & TAB & "Modulo: " & vStr1 & "   Sub: " & vStr2 & TAB & str)
		Dim exceptionWrapper As Exception
		If LastException.IsInitialized Then
			exceptionWrapper = LastException
			textWriterWrapper.WriteLine(exceptionWrapper.Message)
			textWriterWrapper.WriteLine(exceptionWrapper.StackTrace)
			textWriterWrapper.WriteLine("************************************************************")
		End If
		textWriterWrapper.Close
		If Not(Main.v_errmail) Then
			Return
		End If
		If Main.v_md3 <> "" Then
			If Not(Main.v_md3.ToLowerCase.Contains("sidemilia")) Then
				If Not(Main.v_md3.ToLowerCase.Contains("sidmodena")) Then
					If Not(Main.v_md3.ToLowerCase.Contains("italretail")) Then
						Return
					End If
				End If
			End If
			Sub132("Errore", vSMTP1, "Errore:" & CRLF & ("************************************************************" & CRLF & DateTime.Date(vTmp) & "  " & DateTime.Time(vTmp) & CRLF & "Modulo: " & vStr1 & "   Sub: " & vStr2 & CRLF & exceptionWrapper.Message & CRLF & exceptionWrapper.StackTrace & CRLF & "************************************************************"), False)
			Return
		End If
		Return
	End If
End Sub

Sub Sub218(str As String, str2 As String, str3 As String)
	Dim now As Long = DateTime.Now
	Dim textWriterWrapper As TextWriter
	textWriterWrapper.Initialize(File.OpenOutput(File.DirDefaultExternal, "LogComms.txt", True))
	textWriterWrapper.WriteLine(SmartStringFormatter("", DateTime.Date(now)) & "  " & SmartStringFormatter("", DateTime.Time(now)) & "" & SmartStringFormatter("", TAB) & "" & SmartStringFormatter("", str) & "" & SmartStringFormatter("", TAB) & "" & SmartStringFormatter("", str2) & "" & SmartStringFormatter("", TAB) & "" & SmartStringFormatter("", str3) & " ")
	textWriterWrapper.Close
End Sub

Sub Sub219(str As String, str2 As String)
	If Not(vBln1) Then
		Dim vTmp As Long = Sub058()
		Dim textWriterWrapper As TextWriter
		textWriterWrapper.Initialize(File.OpenOutput(File.DirDefaultExternal & "/LOG", "LogVD.txt", True))
		textWriterWrapper.WriteLine(Main.vStr25 & TAB & Sub060(vTmp) & TAB & str & TAB & str2)
		textWriterWrapper.Close
		Return
	End If
End Sub

Sub Sub220(z As Boolean)
	If Not(vBln1) Then
		Dim vTmp As Long = Sub058()
		Dim textWriterWrapper As TextWriter
		textWriterWrapper.Initialize(File.OpenOutput(File.DirDefaultExternal & "/LOG", "Log.txt", True))
		If z Then
			textWriterWrapper.WriteLine("Il programma è stato chiuso" & TAB & Main.vStr25 & TAB & Sub060(vTmp))
		Else
			textWriterWrapper.WriteLine("Uscita procedura" & TAB & Main.vStr25 & TAB & Sub060(vTmp))
		End If
		textWriterWrapper.Close
		Return
	End If
End Sub

Sub Sub221(str As String, str2 As String) As String
	Dim byteConverter As ByteConverter
	Dim bytes() As Byte = str2.GetBytes("UTF-8")
	Dim bytes2() As Byte = str.GetBytes("UTF-8")
	Initialize
	Dim length As Int = bytes.Length - 1
	Dim i As Int
	For i = 0 To length
		bytes(i) = Bit.Xor(bytes2(i Mod bytes2.Length), bytes(i))
	Next
	Return byteConverter.HexFromBytes(bytes)
End Sub

Sub Sub222(obj As Object) As Boolean
	If obj = Null Then
		Return True
	End If
	If obj Is Boolean Then
		If obj = False Then
			Return True
		End If
	Else If obj Is String Then
		If modfunstr.Sub005(obj) = "" Then
			Return True
		End If
	Else
		If modfunstr.Sub006(obj) = 0 Then
			Return True
		End If
	End If
	Return False
End Sub

