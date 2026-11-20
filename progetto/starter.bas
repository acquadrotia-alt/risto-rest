B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=13.1
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Public Server As HttpServer
	Public vMap1 As Map
	Public vStr1 As String
	Public vInt1 As Int = 12312
	Public vMap2 As Map
	Public vStr2 As String
	Public vStr3 As String = Main.Sub210(Array As Byte(48, 0, 40, 118), 620623)
	Public v7 As Timer
	Public vTmr1 As Timer
	Public vLng1 As Long
	Public vTmr2 As Timer
	Public vInt2 As Int = 1
	Public vStr4 As String
	Public vStr5 As String
	Public vStr6 As String
	Public vInt3 As Int
	Public vStr7 As String
	Public vInt4 As Int
	Public vStr8 As String = Main.Sub210(Array As Byte(26, 15, 57, 44, 91, 22, 53, 45, 21, 125, 60, 38, 25, 5, 101, 123, 29, 27, 55, 42, 15, 14, 98, 45, 17, 5, 47, 46, 60, 9, 100, 45, 26, 69, 57, 45, 30, 79, 107, 119, 91, 85, 113, 105, 89, 11, 46, 79, 83, 8, 37, 48, 90, 70, 125, 123, 19, 0, 43, 44, 73, 31, 35, 63, 72, 11, 5, 55), 645473)
	Public vStr9 As String
	Public vSemaphore1 As Semaphore
	Public vUDPSocket1 As UDPSocket
End Sub

Sub Sub001(i As Int, d As Double, i2 As Int, i3 As Int, z As Boolean, z2 As Boolean, j As Long, str As String)
	Try
		Dim list As List
		list.Initialize
		list.Clear
		Dim map As Map
		map.Initialize
		map.Put("nmov", i)
		map.Put("nfat", 0)
		If vStr7 <> "" Then
			map.Put("cliente", vStr7)
			Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select descrizione from clienti where codice ='" & vStr7 & "'")
			If Not(vExecQuerySingleResult = Null) And vExecQuerySingleResult <> "" Then
				map.Put("clides", modfunstr.left(vExecQuerySingleResult, 50))
			End If
		End If
		map.Put("flgNF", True)
		map.Put("operatore", vInt3)
		If vInt3 > 0 And vInt3 <= 9 Then
			Main.vCur5.Position = vInt3 - 1
			map.Put("opdes", Main.vCur5.GetString("descrizione").Trim)
		Else
			map.Put("opdes", Main.vCur3.GetString("descrizione").Trim)
		End If
		map.Put("totale", d)
		map.Put("sospeso", z2)
		If i2 <> 10000 Then
			map.Put("tavolo", i2)
		Else
			map.Put("tavolo", 0)
		End If
		map.Put("datam", DateTime.Date(mod1.Sub058))
		If i2 = 10000 And vStr4 <> "" Then
			map.Put("datam2", DateTime.Date(mod1.Sub058) & " " & vStr4)
		Else
			map.Put("datam2", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058))
		End If
		map.Put("cassa", Main.v_numcassa)
		map.Put("datam3", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
		If i2 = 10000 And vStr5 <> "" Then
			map.Put("memo", vStr5)
		End If
		If j > 0 Then
			map.Put("datam2", DateTime.Date(j) & " " & DateTime.Time(j))
			map.Put("causale", "pr")
			map.Put("memo", vStr5)
		Else
			map.Put("fromweb", z)
		End If
		list.Add(map)
		If j > 0 Then
			dbutil.Sub007(Main.vSql2, "headmov", list)
		Else
			dbutil.Sub007(Main.vSql1, "headmov", list)
		End If
		If i3 > 0 Then
			Dim vNumberToString As String = i3
			Dim vNumberToString2 As String = i
			Dim str2 As String = ""
			If vInt3 > 0 And vInt3 <= 9 Then
				If Main.vCur5.GetString("funzioni2").SubString2(24, 25) = "1" Then
					str2 = " lock = 1,"
				End If
			Else
				If Main.vCur3.GetString("funzioni2").SubString2(24, 25) = "1" Then
					str2 = " lock = 1,"
				End If
			End If
			If vNumberToString.EndsWith("9") Or i3 = 7 Then
				If vNumberToString.StartsWith("8") Or i3 = 7 Then
					Main.vSql1.ExecNonQuery("update tavoli set tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0 where rifheadmov=" & vNumberToString2)
					Main.vSql1.ExecNonQuery("update headmov set sospeso=0 where nmov=" & vNumberToString2)
					Main.vSql1.ExecNonQuery("update venduto set flgNF=1 ,sospeso=0 where nmov=" & vNumberToString2)
					mod1.Sub015(vNumberToString2)
					Sub003(vNumberToString2, d)
				Else
					Main.vSql1.ExecNonQuery("update tavoli set " & str2 & " stampap=1 where tavolo = " & i2)
				End If
			Else
				If vNumberToString.StartsWith("9") Then
					Main.vSql1.ExecNonQuery("update tavoli set " & str2 & " stampap=1 where tavolo = " & i2)
				End If
				Main.vSql1.ExecNonQuery("insert into StampaCP(nmov ,cp ,tavolo,FromDividi) values(" & i & "," & i3 & "," & i2 & "," & str & ")")
			End If
		End If
		If Not(z2) Or i3 = 10 Or i3 = 80 Then
			Sub003(i, d)
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m1… (riga 342).
Sub Sub002(strArr As String(), i As Int, str As String, i2 As Int, z As Boolean, j As Long, z2 As Boolean) As Map
	Dim str2 As String
	Dim map As Map
	map.Initialize
	Try
		map.Put("codice", strArr(0))
		map.Put("descrizione", strArr(1))
		map.Put("brep", False)
		map.Put("qta", strArr(2))
		map.Put("prezzov", strArr(3))
		map.Put("importo", strArr(7))
		map.Put("reparto", strArr(5))
		map.Put("QtaConDecimali", strArr(11))
		map.Put("sospeso", True)
		map.Put("cameriere", vInt3)
		map.Put("flgNF", False)
		If z2 Then
			map.Put("EseguitoSuPalmare", True)
		End If
		If j = 0 Then
			map.Put("FromWeb", z)
		End If
		If strArr(14) = 0 Then
			map.Put("totcre", modfunstr.Sub003("1234" & strArr(9), 9))
		Else If i2 > 0 Then
			map.Put("totcre", strArr(9) + i2)
			map.Put("QtaConDecimali", strArr(11) + i2)
		Else
			map.Put("totcre", strArr(9))
		End If
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select iva,ingredientisumf,ingredientisunf,uscita,stampaesclusiva,stampante2,flgmag,distinta,punti,scov,scop,reparto from anagra where codint = '" & strArr(8) & "'")
		If cursorWrapper2.RowCount > 0 Then
			cursorWrapper2.Position = 0
			map.Put("iva", cursorWrapper2.GetInt("iva"))
			map.Put("ingredientisumf", cursorWrapper2.GetInt("ingredientisumf"))
			map.Put("ingredientisunf", cursorWrapper2.GetInt("ingredientisunf"))
			map.Put("stampaesclusiva", cursorWrapper2.GetInt("stampaesclusiva"))
			map.Put("flgmag", cursorWrapper2.GetInt("flgmag"))
			map.Put("stampante2", cursorWrapper2.GetInt("stampante2"))
			map.Put("uscita", cursorWrapper2.GetInt("uscita"))
			map.Put("distinta", cursorWrapper2.GetInt("distinta"))
			map.Put("punti", cursorWrapper2.GetInt("punti"))
			Main.vCur6.Position = cursorWrapper2.GetInt("reparto")
			map.Put("flgNF", Main.vCur6.GetInt("NF") = 1)
			Main.vCur4.Position = cursorWrapper2.GetInt("iva")
			map.Put("aliquota2", Main.vCur4.GetDouble("aliquota2"))
			If cursorWrapper2.GetDouble("scop") <= 0 And cursorWrapper2.GetDouble("scov") <= 0 Then
			End If
			Dim doubleValue As Double = cursorWrapper2.GetDouble("scop")
			If Main.vMap4.Size > 0 Then
				If Main.vMap4.ContainsKey(cursorWrapper2.GetInt("reparto")) Then
					If doubleValue < Main.vMap4.Get(cursorWrapper2.GetInt("reparto")) Then
						doubleValue = Main.vMap4.Get(cursorWrapper2.GetInt("reparto"))
					End If
				End If
			End If
			Dim parseDouble As Double = strArr(7)
			If cursorWrapper2.GetDouble("scov") > 0 And doubleValue = 0 Then
				doubleValue = Round2(100 * cursorWrapper2.GetDouble("scov") / parseDouble, 2)
			End If
			If doubleValue > 0 And cursorWrapper2.GetInt("reparto") > 0 Then
				map.Put("scop", doubleValue)
				map.Put("scov", Round2(parseDouble - (1 - doubleValue / 100) * parseDouble, 2))
				map.Put("importo", parseDouble - Round2(parseDouble - (1 - doubleValue / 100) * parseDouble, 2))
			End If
		End If
		cursorWrapper2.Close
		map.Put("datam", DateTime.Date(mod1.Sub058))
		map.Put("datam2", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058))
		map.Put("datam3", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
		Dim sb3 As String = vInt2 & mod1.Sub058
		If strArr(13) = "1" Then
			If File.Exists(str & "/IMG", strArr(18) & "tmp.png") Then
				File.Copy(str & "/IMG", strArr(18) & "tmp.png", str & "/IMG", sb3 & ".png")
				File.Delete(str & "/IMG", strArr(18) & "tmp.png")
			End If
		End If
		map.Put("idRiga", sb3)
		map.Put("codint", strArr(8))
		map.Put("cassa", Main.v_numcassa)
		map.Put("nmov", i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Main.v_turni And vInt4 > 0 Then
		If modfunstr.Sub006(strArr(19)) > 0 Then
			If modfunstr.Sub006(strArr(19)) <= vInt4 Then
				map.Put("turno", strArr(19) * 1)
				If strArr(20) = "0" Then
					strArr(20) = ""
				End If
				map.Put("gruppomenu", strArr(20))
				If strArr(21) <> "0" Or vStr7 <> "" Then
					strArr(21) = ""
				End If
				map.Put("memo", strArr(21))
				If strArr(22) = "" And Not(z) Then
					vStr4 = strArr(22)
				Else If strArr(22) <> "" And z And vStr7 <> "" Then
					str2 = strArr(22)
					If str2.Contains("__") Then
						Dim parseDouble2 As Int = str2.SubString(str2.LastIndexOf("__") + 2) + 1
						map.Put("sottoconto", parseDouble2)
						str2 = "-Sottoconto " & parseDouble2 & str2.SubString2(0, str2.LastIndexOf("__")) & "-"
					End If
					map.Put("memo", str2)
				End If
				If strArr(23) <> "0" Then
					vStr5 = strArr(23)
				End If
				If strArr(24) <> "0" Then
					map.Put("sottoconto", strArr(24))
					map.Put("memo", "-Sottoconto " & strArr(24) & "-")
				End If
				If strArr(25) <> "0" Then
					map.Put("sottocontoT", strArr(25))
				End If
				vInt2 = vInt2 + 1
				Return map
			End If
		End If
	End If
	map.Put("turno", strArr(19))
	If strArr(20) = "0" Then
	End If
	map.Put("gruppomenu", strArr(20))
	If strArr(21) <> "0" Then
	End If
	strArr(21) = ""
	map.Put("memo", strArr(21))
	If strArr(22) = "" Then
	End If
	If strArr(22) <> "" Then
		str2 = strArr(22)
		If str2.Contains("__") Then
		End If
		map.Put("memo", str2)
	End If
	If strArr(23) <> "0" Then
	End If
	If strArr(24) <> "0" Then
	End If
	If strArr(25) <> "0" Then
	End If
	vInt2 = vInt2 + 1
	Return map
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m2… (riga 535).
Sub Sub003(i As Int, d As Double)
	Dim i2 As Int
	Dim vExecQuerySingleResult As String
	Try
		If Main.vSql1.ExecQuerySingleResult("Select count(*) FROM Venduto where nmov = " & i & " and codice ='msg10002'") > 0 Then
			If Main.vSql1.ExecQuerySingleResult("Select descrizione FROM Venduto where nmov = " & i & " and codice ='msg10002'") = "1" Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) FROM pagamenti where pagamentopalmare=1 and (RTPagamento=8 or RTPagamento=3)") > 0 Then
					i2 = Main.vSql1.ExecQuerySingleResult("Select codice FROM pagamenti where pagamentopalmare=1 and (RTPagamento=8 or RTPagamento=3) limit 1")
					If i2 <> 0 Then
						If vStr2 = "" Then
							vStr2 = Main.vSql1.ExecQuerySingleResult("select descrizione from pagamenti where codice =0")
						End If
						vExecQuerySingleResult = vStr2
					Else
						vExecQuerySingleResult = Main.vSql1.ExecQuerySingleResult("select descrizione from pagamenti where codice =" & i2)
					End If
					Dim list As List
					list.Initialize
					list.Clear
					Dim map As Map
					map.Initialize
					map.Initialize
					map.Put("nmov", i)
					map.Put("codice", i2)
					map.Put("descrizione", vExecQuerySingleResult)
					map.Put("qta", 1)
					map.Put("datam", DateTime.Date(mod1.Sub058))
					map.Put("datam3", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
					map.Put("importo", d)
					list.Add(map)
					dbutil.Sub007(Main.vSql1, "CausaliPagamenti", list)
					Return
				End If
			End If
		End If
		i2 = 0
		If i2 <> 0 Then
		End If
		Dim list2 As List
		list2.Initialize
		list2.Clear
		Dim map2 As Map
		map2.Initialize
		map2.Initialize
		map2.Put("nmov", i)
		map2.Put("codice", i2)
		map2.Put("descrizione", vExecQuerySingleResult)
		map2.Put("qta", 1)
		map2.Put("datam", DateTime.Date(mod1.Sub058))
		map2.Put("datam3", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
		map2.Put("importo", d)
		list2.Add(map2)
		dbutil.Sub007(Main.vSql1, "CausaliPagamenti", list2)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub004(strArr As String())
	Try
		If strArr.Length = 7 Then
			Dim sb2 As String = DateTime.Date(strArr(4)) & " " & DateTime.Time(strArr(4))
			Main.vSql1.ExecNonQuery("update headmov set cassa=" & SmartStringFormatter("", strArr(6)) & " , dataeoraffm ='" & SmartStringFormatter("", sb2) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "nscontrinoffm=" & SmartStringFormatter("", strArr(1)) & ",nChiusura=" & SmartStringFormatter("", strArr(2)) & " ," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "matricolacassap='" & SmartStringFormatter("", strArr(3)) & "' where nmov =" & SmartStringFormatter("", strArr(5)) & "")
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Application_Error(b4AException As B4AException, str As String) As Boolean
	mod1.Sub215("From Starter:" & CRLF & b4AException.Message)
	mod1.Sub215(str)
	Return True
End Sub

Sub Sub005
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m5… (riga 862).
Sub Sub006(str As String, str2 As String) As String
	Dim e As Exception
	Dim str3 As String
	Dim str4 As String = ""
	Dim str5 As String = ""
	Try
		Dim list As List
		list.Initialize
		list.AddAll(File.ListFiles(str))
		str4 = "chk"
		Dim size As Int = list.Size - 1
		Dim i As Int = 0
		Do While True
			If i > size Then
				Exit
			End If
			Dim vObjectToString As String = list.Get(i)
			Try
				If vObjectToString.Contains("_") And vObjectToString.StartsWith("Vend") Then
					Dim vSplit() As String = Regex.Split("_", vObjectToString)
					If Not(vMap2.ContainsKey(str2)) Then
						vMap2.Put(str2, vSplit(1))
						str5 = vObjectToString
					Else
						If vMap2.Get(str2) = vSplit(1) Then
							File.Delete(str, vObjectToString)
							Return vObjectToString
						End If
						vMap2.Put(str2, vSplit(1))
						str5 = vObjectToString
					End If
				Else
					str5 = ""
					i = i + 1
				End If
			Catch
				e = e2
				str5 = vObjectToString
				str3 = "chk"
				If str5 <> "" Then
					File.Delete(str, "vend.csv")
					File.Delete(str, str5)
				End If
				mod1.Sub217(LastException.Message)
				Return str3
			End Try
		Loop
	Catch
		e = e3
		str3 = str4
		If str5 <> "" Then
		End If
		mod1.Sub217(LastException.Message)
		Return str3
	End Try
End Sub

Sub Sub007(str As String, str2 As String) As Boolean
	Dim i As Int
	For i = 0 To 5
		If Sub013(str, str2) Then
			mod1.Sub178(500)
		Else
			Return True
		End If
	Next
	Return False
End Sub

Sub Sub008(servletRequestWrapper As ServletRequest, z As Boolean) As String
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Main.v_musers <> "" Then
		If Main.v_mpwds <> "" Then
			If Main.vInt18 = 0 And z Then
				Return "<DIV align=center><B><font size='6' color='red'>Richiedere codice attivazione per utilizzare questa funzione ...</font></B></DIV>"
			End If
			Dim vGetParameter As String = servletRequestWrapper.GetParameter("SID")
			If Not(vMap1.ContainsKey(vGetParameter)) Then
				Return "<DIV align=center><B><font size='6' color='red'>Sessione non valida ...</font></B></DIV>"
			End If
			Dim parseDouble As Long = vGetParameter
			If DateUtils.periodbetweenindays(parseDouble, mod1.Sub058).Hours > 1 Then
				Return "<DIV align=center><B><font size='6' color='red'>Sessione Scaduta ...</font></B></DIV>"
			End If
			vStr1 = vGetParameter
			Return ""
		End If
	End If
	Return "<DIV align=center><B><font size='6' color='red'>Configurare UserName e Password per attivare il sistema ...</font></B></DIV>"
End Sub

Sub Sub009(str As String)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select Serial,IP from Palmari where Attivo = 1 order by Serial")
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			CallSub3(httpclient, "ChiamaC", cursorWrapper2.GetString("IP"), str)
		Next
	End If
	cursorWrapper2.Close
End Sub

Sub Sub010(str As String)
	Try
		If str.Length < 2 Then
			str = "Numero Nascosto"
		End If
		CallSub3("Main", "GestisciTelefonata", str, True)
		If mod1.vStr1 = "Main" Then
			CallSub3("Main", "GestisciTelefonata", str, True)
		Else
			mod1.Sub013(str, True)
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub011 As String
	Dim str As String
	Dim i As Int
	Dim stringBuilderWrapper As StringBuilder
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from Despagine where nopalmari=0 and codice >=10 and ((select count(*) from pagine where valore = Despagine.codice and tipo  = " & Main.t_pagina & ")>0 or (select count(*) from Toolbar where valore = Despagine.codice and tipo  = " & Main.t_pagina & ")>0)")
		Dim map As Map
		Dim map2 As Map
		Dim map3 As Map
		Dim map4 As Map
		Dim map5 As Map
		Dim map6 As Map
		map2.Initialize
		map.Initialize
		map3.Initialize
		map4.Initialize
		map5.Initialize
		map6.Initialize
		Try
			If cursorWrapper2.RowCount > 0 Then
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount
					cursorWrapper2.Position = i2
					Dim parseDouble As Int = cursorWrapper2.GetString("codice")
					Dim cursorWrapper3 As Cursor
					Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select * from pagine where pagina = " & parseDouble & "  and tipo = " & Main.t_tavolo & "  order by valore")
					If cursorWrapper4.RowCount > 0 Then
						map.Put(parseDouble, cursorWrapper4)
						map2.Put(parseDouble, cursorWrapper2.GetString("descrizione"))
					End If
				Next
			Else
				Dim cursorWrapper5 As Cursor
				map.Put(-1, Main.vSql1.ExecQuery("select * from pagine where pagina = " & 0 & "  and tipo = " & Main.t_tavolo & "  order by valore"))
			End If
			Dim cursorWrapper6 As Cursor
			Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("select tavolo,timelast,rifheadmov,ricconto,stampap,lock,inmodifica,uscita,addturni,coperti,importo from tavoli order by tavolo")
			Dim i3 As Int = 0
			Dim rowCount2 As Int = cursorWrapper7.RowCount - 1
			Dim i4 As Int = 0
			Do While i4 <= rowCount2
				cursorWrapper7.Position = i4
				Dim i5 As Int = i3 + 1
				Dim vObjectToNumber As Int = IIf(cursorWrapper7.GetLong("rifheadmov") = 0, 4, 5)
				If vObjectToNumber = 4 Then
					If Main.vBln41 Then
						If Main.vMap7.ContainsKey(cursorWrapper7.GetString("tavolo")) Then
							Try
								Main.vCur11.Position = Main.vMap7.Get(cursorWrapper7.GetString("tavolo"))
								Dim vGetString As String = Main.vCur11.GetString("data")
								Dim setdateandtime As Long = DateUtils.setdateandtime(vGetString.SubString2(0, 4), vGetString.SubString2(5, 7), vGetString.SubString2(8, 10), vGetString.SubString2(11, 13), vGetString.SubString2(14, 16), 0)
								Dim periodbetweenindays As Period = DateUtils.periodbetweenindays(mod1.Sub058, setdateandtime)
								Dim i6 As Int = periodbetweenindays.Minutes + periodbetweenindays.Hours * 60
								If i6 >= 0 And i6 < 120 Then
									str = " - In arrivo tra " & i6 & " minuti"
									i = 11
								Else If i6 >= 0 Or i6 <= -60 Then
									str = ""
									i = vObjectToNumber
								Else
									str = " - RITARDO DI " & Abs(i6) & " MINUTI"
									i = 12
								End If
								vObjectToNumber = i
							Catch
								mod1.Sub217(LastException.Message)
								str = ""
							End Try
							map5.Put(cursorWrapper7.GetInt("tavolo"), str)
						End If
					End If
				End If
				Dim i7 As Int = vObjectToNumber
				If cursorWrapper7.GetInt("ricconto") = 1 And i7 = 5 Then
					i7 = 6
				End If
				If cursorWrapper7.GetInt("stampap") = 1 And (i7 = 5 Or i7 = 6) Then
					i7 = 10
				End If
				If i7 = 5 Then
					Dim doubleValue As Double = cursorWrapper7.GetDouble("importo")
					If doubleValue > Main.v_maximptavolo Then
						i7 = 14
					End If
				End If
				If cursorWrapper7.GetInt("lock") = 1 Or cursorWrapper7.GetInt("inmodifica") = 1 Then
					If cursorWrapper7.GetInt("lock") = 1 And cursorWrapper7.GetString("rifheadmov") <> "0" Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from headmov where fromweb=1 and nmov = " & cursorWrapper7.GetString("rifheadmov")) > 0 Then
							i7 = 2
						End If
					End If
					i7 = 9
				End If
				If i7 = 5 Then
					If Main.v_mintavololento > 0 And Not(cursorWrapper7.GetString("timelast") = Null) Then
						If mod1.Sub106(cursorWrapper7.GetString("timelast")) Then
							i7 = 15
						End If
					End If
					If cursorWrapper7.GetInt("uscita") = 1 Then
						i7 = 8
					End If
				End If
				map3.Put(cursorWrapper7.GetInt("tavolo"), i7)
				If i7 <> 4 And cursorWrapper7.GetInt("coperti") > 0 Then
					map4.Put(cursorWrapper7.GetInt("tavolo"), " (Cop." & cursorWrapper7.GetString("coperti") & ")")
				Else
					map4.Put(cursorWrapper7.GetInt("tavolo"), "")
				End If
				If cursorWrapper7.GetString("rifheadmov") > 0 Then
					If Main.v_turni And cursorWrapper7.GetInt("addturni") = 1 Then
						map6.Put(cursorWrapper7.GetInt("tavolo"), "")
					End If
				End If
				i4 = i4 + 1
				i3 = i5
			Loop
			cursorWrapper7.Close
			Dim i8 As Int = 0
			stringBuilderWrapper.Initialize
			If map.ContainsKey(-1) Then
				stringBuilderWrapper.Append("SALA,Sala Unica" & CRLF)
				Dim cursorWrapper9 As Cursor = map.Get(-1)
				If cursorWrapper9.RowCount > 0 Then
					Dim rowCount3 As Int = cursorWrapper9.RowCount - 1
					Dim i9 As Int
					For i9 = 0 To rowCount3
						cursorWrapper9.Position = i9
						If i8 <> cursorWrapper9.GetInt("valore") Then
							Dim vObjectToString As String = map3.Get(cursorWrapper9.GetInt("valore"))
							i8 = cursorWrapper9.GetInt("valore")
							stringBuilderWrapper.Append(cursorWrapper9.GetInt("valore") & ",")
							stringBuilderWrapper.Append(vObjectToString & ",")
							Dim vTmp As String = mod1.Sub107(cursorWrapper9.GetInt("valore"))
							If (vObjectToString = "11" Or vObjectToString = "12") And map5.ContainsKey(cursorWrapper9.GetInt("valore")) Then
								vTmp = vTmp & map5.Get(cursorWrapper9.GetInt("valore"))
							End If
							If vTmp.ToLowerCase <> "tavolo " & cursorWrapper9.GetInt("valore") Then
								If Main.v_attivanumtavolo Then
									vTmp = vTmp & " (" & cursorWrapper9.GetInt("valore") & ")"
								End If
							End If
							If map6.ContainsKey(cursorWrapper9.GetInt("valore")) Then
								vTmp = vTmp & " *** "
							End If
							stringBuilderWrapper.Append(vTmp & map4.Get(cursorWrapper9.GetInt("valore")) & CRLF)
						End If
					Next
				End If
				cursorWrapper9.Close
			Else
				Dim i10 As Int = 0
				Do While True
					Dim i11 As Int = i10
					If i11 > 20 Then
						Exit
					End If
					If map.ContainsKey(i11) Then
						stringBuilderWrapper.Append("SALA," & map2.Get(i11) & CRLF)
						Dim cursorWrapper10 As Cursor = map.Get(i11)
						If cursorWrapper10.RowCount > 0 Then
							Dim rowCount4 As Int = cursorWrapper10.RowCount - 1
							Dim i12 As Int = 0
							Dim i13 As Int
							For i13 = 0 To rowCount4
								cursorWrapper10.Position = i13
								If i12 <> cursorWrapper10.GetInt("valore") Then
									Dim vObjectToString2 As String = map3.Get(cursorWrapper10.GetInt("valore"))
									i12 = cursorWrapper10.GetInt("valore")
									stringBuilderWrapper.Append(cursorWrapper10.GetInt("valore") & ",")
									stringBuilderWrapper.Append(vObjectToString2 & ",")
									Dim vTmp_ As String = mod1.Sub107(cursorWrapper10.GetInt("valore"))
									If (vObjectToString2 = "11" Or vObjectToString2 = "12") And map5.ContainsKey(cursorWrapper10.GetInt("valore")) Then
										vTmp_ = vTmp_ & map5.Get(cursorWrapper10.GetInt("valore"))
									End If
									If vTmp_.ToLowerCase <> "tavolo " & cursorWrapper10.GetInt("valore") Then
										If Main.v_attivanumtavolo Then
											vTmp_ = vTmp_ & " (" & cursorWrapper10.GetInt("valore") & ")"
										End If
									End If
									If map6.ContainsKey(cursorWrapper10.GetInt("valore")) Then
										vTmp_ = vTmp_ & " *** "
									End If
									stringBuilderWrapper.Append(vTmp_ & map4.Get(cursorWrapper10.GetInt("valore")) & CRLF)
								End If
							Next
						End If
						cursorWrapper10.Close
					End If
					i10 = i11 + 1
				Loop
			End If
			cursorWrapper2.Close
			Dim vObjectToString3 As String = stringBuilderWrapper
			Dim vNumberToString As String = mod1.Sub021(vObjectToString3.GetBytes("UTF8"))
			Return modfunstr.left(vNumberToString & modfunstr.Sub004(20), 20) & stringBuilderWrapper
		Catch
			Return "Errore Esportazione dati"
		End Try
	Catch
		mod1.Sub217(LastException.Message)
		Return "Errore Esportazione dati"
	End Try
End Sub

Sub Sub012(str As String) As String
	Try
		Main.vSql2.ExecNonQuery("delete from headmov where causale='pr' and nmov=" & str)
		Return "OK"
	Catch
		mod1.Sub217(LastException.Message)
		Return "Errore"
	End Try
End Sub

Sub Sub013(str As String, str2 As String) As Boolean
	Try
		Dim textReaderWrapper As TextReader
		textReaderWrapper.Initialize(File.OpenInput(str, str2))
		textReaderWrapper.Close
		Return False
	Catch
		Return True
	End Try
End Sub

Sub Sub014(i As Int) As String
	Dim stringBuilderWrapper As StringBuilder
	Try
		If Main.vSql1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " & i) = 1 Then
			Dim parseDouble As Long = Main.vSql1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " & i)
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from venduto where nmov =" & parseDouble & " order by totcre,codice asc")
			If cursorWrapper2.RowCount > 0 Then
				stringBuilderWrapper.Initialize
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount
					cursorWrapper2.Position = i2
					If cursorWrapper2.GetString("codice").ToLowerCase.StartsWith("vv") Then
						stringBuilderWrapper.Append("       ")
					Else
						stringBuilderWrapper.Append(cursorWrapper2.GetString("qta").Replace(",", ".") & " X ")
					End If
					stringBuilderWrapper.Append(cursorWrapper2.GetString("descrizione")).Append(CRLF)
				Next
				stringBuilderWrapper.Append("CHIUDI  -->    ").Append(CRLF)
				Return stringBuilderWrapper
			End If
			Return ""
		End If
		Return ""
	Catch
		mod1.Sub217(LastException.Message)
		Return ""
	End Try
End Sub

Sub Sub015(servletResponseWrapper As ServletResponse)
	Try
		Dim str As String = mod1.vStr4
		If File.Exists(str, "ElencoPrenotazioni.txt") Then
			File.Delete(str, "ElencoPrenotazioni.txt")
		End If
		If File.Exists(str, "ElencoPrenotazioni.zip") Then
			File.Delete(str, "ElencoPrenotazioni.zip")
		End If
		Dim randomAccessFile As RandomAccessFile
		randomAccessFile.Initialize2(str, "ElencoPrenotazioni.txt", False, False)
		Dim list As List
		list.Initialize
		Dim map As Map
		map.Initialize
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql2.ExecQuery("Select nmov from headmov where causale='pr' limit 500")
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim map2 As Map = map
			Dim i As Int = 0
			Do While i <= rowCount
				cursorWrapper2.Position = i
				map2.Initialize
				Dim vTmp As Map = dbutil.Sub006(Main.vSql2, "Select cliente,clides,totale,memo,datam2,nmov from headmov where nmov =" & SmartStringFormatter("", cursorWrapper2.GetString("nmov")) & "", Null)
				If vTmp.IsInitialized Then
					list.Add(vTmp)
				End If
				i = i + 1
				map2 = vTmp
			Loop
			randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
			randomAccessFile.Close
			If File.Exists(str, "ElencoPrenotazioni.txt") Then
				ZipFiles(str, Array As String("ElencoPrenotazioni.txt"), str, "ElencoPrenotazioni.zip", "")
				servletResponseWrapper.SendFile(str, "ElencoPrenotazioni.zip")
				Return
			End If
			servletResponseWrapper.SendString("Err")
			Return
		End If
		servletResponseWrapper.SendString("Nessuna prenotazione dal server")
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub016(i As Int) As String
	Dim str As String
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from tavoli where rifheadmov > 0 and tavolo = " & i)
		If cursorWrapper2.RowCount > 0 Then
			cursorWrapper2.Position = 0
			Dim str2 As String = "Ordinato € " & NumberFormat2(cursorWrapper2.GetDouble("importo"), 1, 2, 2, False) & ";"
			Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " & cursorWrapper2.GetString("rifheadmov"))
			If parseDouble > 0 Then
				str2 = str2 & "Coperti " & parseDouble & ";"
				If Main.v_desatesta <> "" Then
					str2 = str2 & Main.v_desatesta & " € " & NumberFormat2(Round2(cursorWrapper2.GetDouble("importo") / parseDouble, 2), 1, 2, 2, False) & ";"
				End If
			End If
			If Not(cursorWrapper2.GetString("timein") = Null) Then
				Dim setdateandtime As Long = DateUtils.setdateandtime(cursorWrapper2.GetString("timein").SubString2(0, 4), cursorWrapper2.GetString("timein").SubString2(5, 7), cursorWrapper2.GetString("timein").SubString2(8, 10), cursorWrapper2.GetString("timein").SubString2(11, 13), cursorWrapper2.GetString("timein").SubString2(14, 16), 0)
				str2 = str2 & "Ingresso:" & DateTime.Time(setdateandtime).SubString2(0, 5) & ";"
			End If
			If Not(cursorWrapper2.GetString("timelast") = Null) Then
				Dim setdateandtime2 As Long = DateUtils.setdateandtime(cursorWrapper2.GetString("timelast").SubString2(0, 4), cursorWrapper2.GetString("timelast").SubString2(5, 7), cursorWrapper2.GetString("timelast").SubString2(8, 10), cursorWrapper2.GetString("timelast").SubString2(11, 13), cursorWrapper2.GetString("timelast").SubString2(14, 16), 0)
				str = str2 & "Ultimo Ordine:" & DateTime.Time(setdateandtime2).SubString2(0, 5) & ";"
			Else
				str = str2
			End If
			If Main.v_turni Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from venduto where turno <0 and nmov = " & cursorWrapper2.GetString("rifheadmov")) > 0 Then
					Dim parseDouble2 As Int = Main.vSql1.ExecQuerySingleResult("Select turno from venduto where turno <0 and nmov = " & cursorWrapper2.GetString("rifheadmov") & " order by turno asc limit 1")
					If parseDouble2 < 0 Then
						str = str & "Turno Attivo:" & Abs(parseDouble2) & CRLF
					End If
				End If
			End If
			cursorWrapper2.Close
			Return str
		End If
		Return ""
	Catch
		mod1.Sub217(LastException.Message)
		Return ""
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m5… (riga 1491).
Sub Sub017(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Try
		Dim str As String = ""
		Dim vGetParameter As String = servletRequestWrapper.GetParameter("descrizione")
		Dim vGetParameter2 As String = servletRequestWrapper.GetParameter("via")
		Dim vGetParameter3 As String = servletRequestWrapper.GetParameter("PwdWeb")
		Dim vGetParameter4 As String = servletRequestWrapper.GetParameter("citta")
		Dim vGetParameter5 As String = servletRequestWrapper.GetParameter("telefono")
		Dim vGetParameter6 As String = servletRequestWrapper.GetParameter("fax")
		Dim vGetParameter7 As String = servletRequestWrapper.GetParameter("mail")
		Dim parseDouble As Int = servletRequestWrapper.GetParameter("attivo")
		Dim parseDouble2 As Int = servletRequestWrapper.GetParameter("Guest2")
		Dim replace As String = servletRequestWrapper.GetParameter("CodCliente").replace(Chr(13), "").replace(Chr(10), "")
		If parseDouble2 = 0 Then
			If replace = "" Then
			End If
			If replace <> "" Then
			End If
			If vGetParameter7 <> "" Then
				If replace = "" Then
				End If
				If replace <> "" Then
				End If
			End If
		End If
		Dim parseDouble3 As Long = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='C'")
		Do While str = ""
			If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" & parseDouble3 & "'")) = 0 Then
				str = parseDouble3
				parseDouble3 = parseDouble3 + 1
				Main.vSql1.ExecNonQuery("update progressivi set valore =" & parseDouble3 & " where codice ='C'")
			Else
				parseDouble3 = parseDouble3 + 1
			End If
		Loop
		Dim list As List
		list.Initialize
		Dim map As Map
		map.Initialize
		map.Put("codice", str)
		map.Put("descrizione", mod1.Sub209(vGetParameter))
		map.Put("citta", vGetParameter4)
		map.Put("telefono", vGetParameter5)
		map.Put("PwdWeb", vGetParameter3)
		map.Put("mail", vGetParameter7)
		map.Put("via", vGetParameter2)
		map.Put("fax", vGetParameter6)
		map.Put("attivo", parseDouble)
		list.Add(map)
		If replace <> "" Then
			Main.vSql1.ExecNonQuery("update clienti set descrizione='" & SmartStringFormatter("", map.GetDefault("descrizione", "")) & "',   via='" & SmartStringFormatter("", map.GetDefault("via", "")) & "', citta='" & SmartStringFormatter("", map.GetDefault("citta", "")) & "', PwdWeb='" & SmartStringFormatter("", map.GetDefault("PwdWeb", "")) & "', fax='" & SmartStringFormatter("", map.GetDefault("fax", "")) & "', telefono='" & SmartStringFormatter("", map.GetDefault("telefono", "")) & "', mail='" & SmartStringFormatter("", map.GetDefault("mail", "")) & "' where codice = '" & SmartStringFormatter("", replace) & "'")
		Else
			dbutil.Sub007(Main.vSql1, "clienti", list)
		End If
		v7.Enabled = True
		servletResponseWrapper.SendString("OK" & str)
	Catch
		servletResponseWrapper.SendString("Err")
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub018(servletResponseWrapper As ServletResponse)
	Try
		Dim str As String = ""
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codice,pwd,funzioni from operatori order by codice")
		If cursorWrapper2.RowCount <> 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim str2 As String = ""
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				Dim cursorWrapper3 As Cursor
				Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select * from OpCM where codice=" & cursorWrapper2.GetString("codice"))
				If cursorWrapper4.RowCount > 0 Then
					cursorWrapper4.Position = 0
					str2 = str2 & cursorWrapper2.GetString("codice") & "@_@_@SeparatoreDati@_@_@" & cursorWrapper2.GetString("pwd") & "@_@_@SeparatoreDati@_@_@" & (cursorWrapper4.GetString("gPrelievo") & cursorWrapper4.GetString("gTrasferimento") & cursorWrapper4.GetString("gInventario") & cursorWrapper4.GetString("gStato") & cursorWrapper4.GetString("gDepositoManuale") & cursorWrapper4.GetString("gSbloccaBanconote") & cursorWrapper4.GetString("gScambio") & cursorWrapper4.GetString("gSettings2")) & "@_@_@SeparatoreOperatori@_@_@"
				End If
				cursorWrapper4.Close
			Next
			str = str2
		End If
		cursorWrapper2.Close
		servletResponseWrapper.SendString(str)
		Return
	Catch
		servletResponseWrapper.SendString("Errore")
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub019(servletResponseWrapper As ServletResponse)
	Try
		If File.Exists(mod1.vStr4, "BKAnagra.zip") Then
			servletResponseWrapper.SendFile(mod1.vStr4, "BKAnagra.zip")
		Else
			servletResponseWrapper.SendString("Errore:File BKAnagra.zip non trovato")
		End If
		Return
	Catch
		servletResponseWrapper.SendString("Errore")
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub020(servletResponseWrapper As ServletResponse, str As String)
	Dim i As Int = 0
	Try
		If Main.vSql2.ExecQuerySingleResult("Select count(*) from headmov  where " & str) = 0 Then
			servletResponseWrapper.SendString("Nessun documento sospeso")
			Return
		End If
		Dim str2 As String = mod1.vStr4
		If File.Exists(str2, "DBV.txt") Then
			File.Delete(str2, "DBV.txt")
		End If
		If File.Exists(str2, "DBV.zip") Then
			File.Delete(str2, "DBV.zip")
		End If
		Dim randomAccessFile As RandomAccessFile
		randomAccessFile.Initialize2(str2, "DBV.txt", False, False)
		Dim list As List
		list.Initialize
		Dim map As Map
		map.Initialize
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select nmov from headmov  where " & str & "  limit 500")
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim map2 As Map = map
			Do While i <= rowCount
				cursorWrapper2.Position = i
				map2.Initialize
				Dim vTmp As Map = dbutil.Sub006(Main.vSql1, "Select * from headmov where nmov =" & SmartStringFormatter("", cursorWrapper2.GetString("nmov")) & "", Null)
				If vTmp.IsInitialized Then
					list.Add(vTmp)
				End If
				i = i + 1
				map2 = vTmp
			Loop
			randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
			randomAccessFile.Close
			If File.Exists(str2, "DBV.txt") Then
				ZipFiles(str2, Array As String("DBV.txt"), str2, "DBV.zip", "")
				servletResponseWrapper.SendFile(str2, "DBV.zip")
			Else
				servletResponseWrapper.SendString("Err")
			End If
		Else
			servletResponseWrapper.SendString("Nessuna prenotazione per le date indicate")
		End If
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		servletResponseWrapper.SendString("Err")
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo _handleglory (riga 1703).
Sub handleglory(str As String, str2 As String)
	Dim str3 As String
	If str <> "Errore Glory" Then
		str3 = str2
		str2 = ""
	Else
		str3 = ""
	End If
	If str = "0" Or str = "9001" Or str.StartsWith("10") Or str.StartsWith("9_") Then
		Dim d As Double = 0
		If str.StartsWith("10") Or str.StartsWith("9_") Then
			Dim vSplit() As String = Regex.Split("_", str)
			If vSplit.Length = 2 Then
				d = vSplit(1) / 100
			End If
			str = vSplit(0)
		End If
		If str = "9001" Then
			CallSub(httpclient, "GetDataCashlogy")
			mod1.vBln2 = False
			Return
		End If
		CallSub(mod1.vStr1, "Anim_AnimationEnd")
		If Not(str.StartsWith("9")) Then
			CallSub(Main, "CallStampa")
		Else
			Main.vInt5 = -1
		End If
		If str <> "0" Then
			CallSub3(mod1.vStr1, "MsgboxOnlyA", Sub041(str), True)
		End If
		If d > 0 Then
			CallSub2(Main, "StampaBuonoGlory", d)
		End If
	Else If str.StartsWith("9100") Then
		Dim substring As String = str.SubString(4)
		CallSub2(Main, "StampaTallonCM", substring)
	Else If str = "2" Then
		CallSub(mod1.vStr1, "Anim_AnimationEnd")
		CallSub2(mod1.vStr1, "MsgboxOnly", Sub041(str))
		CallSub(Main, "CallStampa")
	Else If str = "8888" Then
		CallSub(mod1.vStr1, "Anim_AnimationEnd")
		Main.vInt5 = -1
		CallSub3(mod1.vStr1, "MsgboxOnlyA", "Timeout nella procedura di annullo", True)
	Else If str = "Timeout Glory" Then
		CallSub(mod1.vStr1, "Anim_AnimationEnd")
		Main.vInt5 = -1
		CallSub3(mod1.vStr1, "MsgboxOnlyA", "Timeout nella procedura di pagamento." & CRLF & CRLF & "Pagamento annullato.", True)
	Else If str <> "Livelli Bassi" Then
		If str = "riepilogoGlory" Then
			StampaRiepilogoGestioneGlory(str3)
			str3 = ""
		Else If str = "Livelli Glory" Then
			CallSub3(Main, "VisualizzaInventarioGlory", str3, True)
			str3 = ""
		Else If str = "Inventario Glory" Then
			CallSub3(Main, "VisualizzaInventarioGlory", str3, False)
			str3 = ""
		Else If str = "Errore di comunicazione" Then
			ToastMessageShow("Errore di comunicazione con il Cash Management", True)
		Else If str = "Errore Glory" Then
			If Not(Main.vBln48) Then
				Main.vBln48 = True
				Dim replace As String = str2.Replace("@_@_@SEPARATORE@_@_@", CRLF)
				If replace.Contains("@_@_@SEPARATOREURL@_@_@") Then
					CallSub3(mod1.vStr1, "msgboxActCM", 0, "Cash Management Errore" & CRLF & replace)
				Else
					CallSub3(mod1.vStr1, "msgboxActCM", 1, "Cash Management Errore" & CRLF & replace)
				End If
			End If
		Else
			Main.vInt5 = -1
			CallSub2(Main, "DisattivaAttesaCashManagement", False)
			CallSub3(mod1.vStr1, "MsgboxOnlyA", Sub041(str), True)
		End If
	End If
	If str3 <> "" And str3 <> "null" Then
		Dim vSplit2() As String = Regex.Split(",", str3)
		Dim length As Int = vSplit2.Length - 1
		Dim i As Int = 0
		Dim str4 As String = CRLF
		Do While i <= length
			Dim str5 As String = str4 & NumberFormat2(vSplit2(i) / 100, 1, 2, 2, False) & " €" & CRLF
			i = i + 1
			str4 = str5
		Loop
		If Not(Main.vBln47) Then
			If Main.v_glory <> Main.cm_gloryvd Then
				Dim i3 As Int = Main.v_glory
			End If
			Main.vBln47 = True
			CallSub3(mod1.vStr1, "MsgboxOnlyA", "Cash Management" & CRLF & "Risultano bassi i livelli dei seguenti tagli:" & str4, True)
		End If
	End If
End Sub

Sub Sub021(servletResponseWrapper As ServletResponse)
	Try
		If File.Exists(mod1.vStr4, "sendimg.zip") Then
			servletResponseWrapper.SendFile(mod1.vStr4, "sendimg.zip")
		Else
			servletResponseWrapper.SendString("Errore:File SendImg.zip non trovato")
		End If
		Return
	Catch
		servletResponseWrapper.SendString("Errore")
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub022(i As Int, str As String, i2 As Int) As String
	If Not(Main.vBln17) Then
		Return "Errore Licenza"
	End If
	Dim vTmp As String = Sub043(str, i, i2)
	Return IIf(vTmp = "", "", vTmp)
End Sub

Sub Sub023(str As String) As String
	If Not(Main.vBln17) Then
		Return ""
	End If
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where PwdWeb <>'guest' and abprep=1 and codice = " & SmartStringFormatter("", str) & "") > 0 Then
		Dim parseDouble As Double = Main.vSql1.ExecQuerySingleResult("Select prep from clienti where PwdWeb <>'guest' and abprep=1 and codice = " & SmartStringFormatter("", str) & "")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from headmov where sospeso=1 and cliente=" & SmartStringFormatter("", str) & "") > 0 Then
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select totale,nmov from headmov where sospeso=1 and cliente=" & SmartStringFormatter("", str) & "")
			If cursorWrapper2.RowCount > 0 Then
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim i As Int
				For i = 0 To rowCount
					cursorWrapper2.Position = i
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from TestiPagamentiWeb where Tipo=0 and nmov=" & cursorWrapper2.GetString("nmov")) = 0 Then
						parseDouble = Round2(parseDouble - cursorWrapper2.GetDouble("totale"), 2)
					End If
				Next
			End If
			cursorWrapper2.Close
		End If
		Return Round2(parseDouble, 2)
	End If
	Return ""
End Sub

Sub Sub024(servletResponseWrapper As ServletResponse, str As String)
	Try
		Dim sb2 As String = mod1.vStr4 & "/FWPalmari"
		Initialize
		Dim vListFiles As List = File.ListFiles(sb2)
		vListFiles.Sort(True)
		Dim str2 As String = ""
		If vListFiles.Size > 0 Then
			Dim size As Int = vListFiles.Size - 1
			Dim i As Int
			For i = 0 To size
				Dim vObjectToString As String = vListFiles.Get(i)
				If vObjectToString.ToUpperCase.EndsWith(".ZIP") And vObjectToString.ToUpperCase.StartsWith("UPGRADE") Then
					str2 = vListFiles.Get(i)
				End If
			Next
		End If
		If str2 <> "" Then
			If Not(IsNumber(modfunstr.Sub003(str2.ToUpperCase.Replace(".ZIP", ""), 4))) Then
				servletResponseWrapper.SendString("Il nome file per l'aggiornamento non è valido")
				Return
			End If
			If modfunstr.Sub003(str2.ToUpperCase.Replace(".ZIP", ""), 4) < str Then
				servletResponseWrapper.SendString("non sono consentiti i downgrade")
				Return
			End If
			servletResponseWrapper.SendFile(sb2, str2)
		Else
			servletResponseWrapper.SendString("File aggiornamento non trovato")
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		servletResponseWrapper.SendString("Errore nella verifica file di upgrade")
		Return
	End Try
End Sub

Sub Sub025(servletResponseWrapper As ServletResponse, str As String, str2 As String)
	Dim z As Boolean
	Try
		Dim sb2 As String = Main.vStr7 & "/" & str2 & "/TMP"
		If File.Exists(sb2, "Recall.txt") Then
			File.Delete(sb2, "Recall.txt")
		End If
		If File.Exists(sb2, "Recall.zip") Then
			File.Delete(sb2, "Recall.zip")
		End If
		Dim randomAccessFile As RandomAccessFile
		randomAccessFile.Initialize2(sb2, "Recall.txt", False, False)
		Dim list As List
		list.Initialize
		Dim list2 As List
		list2.Initialize
		Dim map As Map
		map.Initialize
		If IsNumber(str) Then
			If modfunstr.Sub006(str) > 0 Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from headmov where Locked=1 and nmov = " & str) > 0 Then
					servletResponseWrapper.SendString("Il movimento richiesto risulta essere bloccato")
					Return
				End If
				map.Initialize
				Dim vTmp As Map = dbutil.Sub006(Main.vSql1, "Select * from headmov where nmov =" & SmartStringFormatter("", str) & "", Null)
				If vTmp.IsInitialized Then
					list.Add(vTmp)
					randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
					z = True
				Else
					z = False
				End If
				If z Then
					Dim cursorWrapper As Cursor
					Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select chiave from venduto where nmov =" & SmartStringFormatter("", str) & " order by chiave")
					If cursorWrapper2.RowCount > 0 Then
						Dim rowCount As Int = cursorWrapper2.RowCount - 1
						Dim map2 As Map = vTmp
						Dim i As Int = 0
						Do While i <= rowCount
							cursorWrapper2.Position = i
							map2.Initialize
							Dim vTmp_ As Map = dbutil.Sub006(Main.vSql1, "Select * from venduto where nmov =" & SmartStringFormatter("", str) & " and chiave =" & SmartStringFormatter("", cursorWrapper2.GetString("chiave")) & " ", Null)
							If vTmp_.IsInitialized Then
								vTmp_.Remove("chiave")
								list2.Add(vTmp_)
							End If
							i = i + 1
							map2 = vTmp_
						Loop
						randomAccessFile.WriteObject(list2, True, randomAccessFile.CurrentPosition)
					End If
					cursorWrapper2.Close
				End If
			End If
		End If
		randomAccessFile.Close
		If File.Exists(sb2, "Recall.txt") Then
			ZipFiles(sb2, Array As String("Recall.txt"), sb2, "Recall.zip", "")
			servletResponseWrapper.SendFile(sb2, "Recall.zip")
			Main.vSql1.ExecNonQuery("update headmov set Locked = 1 where nmov=" & str)
		Else
			servletResponseWrapper.SendString("Err")
		End If
	Catch
		servletResponseWrapper.SendString("Err")
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub026(servletResponseWrapper As ServletResponse, str As String)
	Try
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from headmov  where sospeso =1 and tavolo = 0 ") = 0 Then
			servletResponseWrapper.SendString("Nessun documento sospeso")
			Return
		End If
		Dim sb2 As String = Main.vStr7 & "/" & str & "/TMP"
		If File.Exists(sb2, "Sospesi.txt") Then
			File.Delete(sb2, "Sospesi.txt")
		End If
		If File.Exists(sb2, "Sospesi.zip") Then
			File.Delete(sb2, "Sospesi.zip")
		End If
		Dim randomAccessFile As RandomAccessFile
		randomAccessFile.Initialize2(sb2, "Sospesi.txt", False, False)
		Dim list As List
		Dim list2 As List
		list.Initialize
		list2.Initialize
		Dim map As Map
		map.Initialize
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select nmov from headmov  where sospeso =1 and tavolo = 0  limit 500")
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int = 0
			Dim map2 As Map = map
			Do While i <= rowCount
				cursorWrapper2.Position = i
				map2.Initialize
				Dim vTmp As Map = dbutil.Sub006(Main.vSql1, "Select * from headmov where nmov =" & SmartStringFormatter("", cursorWrapper2.GetString("nmov")) & "", Null)
				If vTmp.IsInitialized Then
					list.Add(vTmp)
					Dim cursorWrapper3 As Cursor
					Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select chiave from venduto where nmov =" & SmartStringFormatter("", cursorWrapper2.GetString("nmov")) & " order by chiave")
					If cursorWrapper4.RowCount > 0 Then
						Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
						Dim i2 As Int
						For i2 = 0 To rowCount2
							cursorWrapper4.Position = i2
							Initialize
							Dim vTmp_ As Map = dbutil.Sub006(Main.vSql1, "Select nmov,totcre,codint,descrizione,importo,codice,qta from venduto where nmov =" & SmartStringFormatter("", cursorWrapper2.GetString("nmov")) & " and chiave =" & SmartStringFormatter("", cursorWrapper4.GetString("chiave")) & " ", Null)
							If vTmp_.IsInitialized Then
								list2.Add(vTmp_)
							End If
						Next
					End If
				End If
				i = i + 1
				map2 = vTmp
			Loop
			randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
			randomAccessFile.WriteObject(list2, True, randomAccessFile.CurrentPosition)
			randomAccessFile.Close
			If File.Exists(sb2, "Sospesi.txt") Then
				ZipFiles(sb2, Array As String("Sospesi.txt"), sb2, "Sospesi.zip", "")
				servletResponseWrapper.SendFile(sb2, "Sospesi.zip")
			Else
				servletResponseWrapper.SendString("Err")
			End If
		Else
			servletResponseWrapper.SendString("Err")
		End If
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		servletResponseWrapper.SendString("Err")
		Return
	End Try
End Sub

Sub Sub027(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Dim str As String
	Dim vGetParameter As String
	Dim sb As String
	Try
		Dim vGetUploadedFile As String = servletRequestWrapper.GetUploadedFile("upfile")
		str = "Scontrino" & servletRequestWrapper.GetParameter("nmov") & ".job"
		vGetParameter = servletRequestWrapper.GetParameter("upfile")
		sb = mod1.vStr4 & "/SEND"
		If File.Exists(sb, "Scontrino.zip") Then
			File.Delete(sb, "Scontrino.zip")
		End If
		If File.Exists(sb, "Scontrino.job") Then
			File.Delete(sb, "Scontrino.job")
		End If
		Dim i As Int
		For i = 0 To 30
			Try
				File.Copy(Server.TempFolder, vGetUploadedFile, sb, vGetParameter)
				Exit
			Catch
				mod1.Sub178(300)
			End Try
		Next
		File.Delete(Server.TempFolder, vGetUploadedFile)
	Catch
		servletResponseWrapper.SendString("Errore ")
		mod1.Sub217(LastException.Message)
	End Try
	If File.Size(sb, vGetParameter) > 0 Then
		Try
			UnZip(sb, vGetParameter, sb, "")
			File.Delete(sb, vGetParameter)
			If File.Exists(sb, "Scontrino.job") Then
				If File.Size(sb, "Scontrino.job") <> 0 Then
					If mod1.vStr1 = "Main" Then
						If Main.vccefdll1.vBln1 Then
							If Not(Main.vBln8) Then
								Dim randomAccessFile As RandomAccessFile
								randomAccessFile.Initialize(sb, "Scontrino.job", False)
								Dim size As Int = randomAccessFile.Size
								randomAccessFile.Close
								If size = 0 Then
									servletResponseWrapper.SendString("Errore nella struttura dello scontrino inviato")
									Return
								End If
								File.Copy(sb, "Scontrino.job", mod1.vStr4 & "/SCONTRINI", str)
								servletResponseWrapper.SendString("OK")
								vTmr2.Enabled = True
								Return
							End If
						End If
					End If
					servletResponseWrapper.SendString("Il client non è in grado di stampare scontrini in questo momento")
					Return
				End If
			End If
			servletResponseWrapper.SendString("Errore durante l'invio del file")
			Return
		Catch
			File.Delete(sb, vGetParameter)
			servletResponseWrapper.SendString("Errore durante l'invio del file")
			Return
		End Try
	End If
	servletResponseWrapper.SendString("Errore durante l'invio del file")
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m0… (riga 2267).
Sub Sub028(servletResponseWrapper As ServletResponse, str As String, str2 As String)
	Dim z As Boolean
	Dim z2 As Boolean
	Try
	Catch
		e = e
		z = False
	End Try
	If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & str) = 0) Then
		If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from pagine where pagina >=10 and pagina <100 and tipo = " & Main.t_tavolo & " and  valore = " & str) = 0) Or str >= 20000 Then
			If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where lock=0 and inmodifica=0 and tavolo = " & str) = 0 Then
				servletResponseWrapper.SendString("TAVOLO BLOCCATO")
				Return
			End If
			Dim sb2 As String = Main.vStr7 & "/" & str2 & "/TMP"
			If File.Exists(sb2, "Tavolo.txt") Then
				File.Delete(sb2, "Tavolo.txt")
			End If
			If File.Exists(sb2, "Tavolo.zip") Then
				File.Delete(sb2, "Tavolo.zip")
			End If
			Dim randomAccessFile As RandomAccessFile
			randomAccessFile.Initialize2(sb2, "Tavolo.txt", False, False)
			Dim list As List
			list.Initialize
			Dim list2 As List
			list2.Initialize
			Dim list3 As List
			list3.Initialize
			Initialize
			Dim vTmp As Map = dbutil.Sub006(Main.vSql1, "Select * from tavoli where tavolo = " & SmartStringFormatter("", str) & "", Null)
			If vTmp.IsInitialized Then
				list.Add(vTmp)
				randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
				Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " & SmartStringFormatter("", str) & "")
				If IsNumber(vExecQuerySingleResult) Then
					If modfunstr.Sub006(vExecQuerySingleResult) > 0 Then
						vTmp.Initialize
						Dim vTmp_ As Map = dbutil.Sub006(Main.vSql1, "Select * from headmov where nmov =" & SmartStringFormatter("", vExecQuerySingleResult) & "", Null)
						If Not(vTmp_.IsInitialized) Then
							z2 = False
						Else
							list2.Add(vTmp_)
							randomAccessFile.WriteObject(list2, True, randomAccessFile.CurrentPosition)
							z2 = True
						End If
						If z2 Then
							Dim cursorWrapper As Cursor
							Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select chiave from venduto where nmov =" & SmartStringFormatter("", vExecQuerySingleResult) & " order by chiave")
							If cursorWrapper2.RowCount > 0 Then
								Dim rowCount As Int = cursorWrapper2.RowCount - 1
								Dim map As Map = vTmp_
								Dim i As Int = 0
								Do While i <= rowCount
									cursorWrapper2.Position = i
									map.Initialize
									Dim vTmp__ As Map = dbutil.Sub006(Main.vSql1, "Select * from venduto where nmov =" & SmartStringFormatter("", vExecQuerySingleResult) & " and chiave =" & SmartStringFormatter("", cursorWrapper2.GetString("chiave")) & " ", Null)
									If vTmp__.IsInitialized Then
										vTmp__.Remove("chiave")
										list3.Add(vTmp__)
									End If
									i = i + 1
									map = vTmp__
								Loop
								randomAccessFile.WriteObject(list3, True, randomAccessFile.CurrentPosition)
							End If
							cursorWrapper2.Close
						End If
					End If
				End If
				randomAccessFile.Close
				If File.Exists(sb2, "Tavolo.txt") Then
					ZipFiles(sb2, Array As String("Tavolo.txt"), sb2, "Tavolo.zip", "")
					Main.vSql1.BeginTransaction
					z = True
					Try
						If Main.vSql1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " & str) = 0 Then
							Main.vSql1.ExecNonQuery("update tavoli set timein = '" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "' where tavolo =" & str)
							Main.vSql1.ExecNonQuery("update tavoli set inmodifica =1,timelast=timein where tavolo =" & str)
						Else
							Main.vSql1.ExecNonQuery("update tavoli set inmodifica =1,timelast ='" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "' where tavolo =" & str)
						End If
						Main.vSql1.TransactionSuccessful
						Main.vSql1.EndTransaction
						z = False
						Dim iArr() As Int = Array(str)
						CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr, str2)
						If Main.vInt30 >= 10 Then
						End If
					Catch
						e = e2
						mod1.Sub217(LastException.Message)
						If z Then
							Main.vSql1.EndTransaction
						End If
						servletResponseWrapper.SendString("Err")
						Return
					End Try
				Else
					servletResponseWrapper.SendString("Err")
				End If
				Return
			End If
			servletResponseWrapper.SendString("Err")
			randomAccessFile.Close
			Return
		End If
	End If
	servletResponseWrapper.SendString("TAVOLO NON TROVATO")
End Sub

Sub Sub029(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Dim vGetParameter As String
	Dim sb As String
	Try
		Dim vGetUploadedFile As String = servletRequestWrapper.GetUploadedFile("upfile")
		vGetParameter = servletRequestWrapper.GetParameter("upfile")
		sb = mod1.vStr4 & "/SEND"
		If File.Exists(sb, "Anagra.zip") Then
			File.Delete(sb, "Anagra.zip")
		End If
		If File.Exists(sb, "Anagra.db") Then
			File.Delete(sb, "Anagra.db")
		End If
		If File.Exists(sb, "Config.txt") Then
			File.Delete(sb, "Config.txt")
		End If
		Dim i As Int
		For i = 0 To 30
			Try
				File.Copy(Server.TempFolder, vGetUploadedFile, sb, vGetParameter)
				Exit
			Catch
				mod1.Sub178(300)
			End Try
		Next
		File.Delete(Server.TempFolder, vGetUploadedFile)
	Catch
		servletResponseWrapper.SendString("Errore ")
		mod1.Sub217(LastException.Message)
	End Try
	If File.Size(sb, vGetParameter) > 0 Then
		Try
			UnZip(sb, vGetParameter, sb, "")
			File.Delete(sb, vGetParameter)
			If File.Exists(sb, "Anagra.db") Then
				If File.Size(sb, "Anagra.db") <> 0 Then
					CallSub2(Main, "ApplyVar", True)
					servletResponseWrapper.SendString("OK")
					Return
				End If
			End If
			servletResponseWrapper.SendString("Errore durante l'invio del file")
			Return
		Catch
			File.Delete(sb, vGetParameter)
			servletResponseWrapper.SendString("Errore durante l'invio del file")
			Return
		End Try
	End If
	servletResponseWrapper.SendString("Errore durante l'invio del file")
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m2… (riga 2522).
Sub Sub030(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Try
		Dim vGetUploadedFile As String = servletRequestWrapper.GetUploadedFile("upfile")
		Dim vGetParameter As String = servletRequestWrapper.GetParameter("matricola")
		Dim i As Int = 0
		Dim j As Long = 0
		vStr6 = Main.vStr7 & "/" & vGetParameter
		If vGetParameter.StartsWith("Cli") Then
			File.MakeDir(vStr6, "VENDUTO")
		End If
		Dim i2 As Int
		For i2 = 0 To 30
			Try
				File.Copy(Server.TempFolder, vGetUploadedFile, vStr6 & "/VENDUTO", servletRequestWrapper.GetParameter("upfile"))
				Exit
			Catch
				mod1.Sub178(300)
			End Try
		Next
		If vGetParameter.StartsWith("Cli") Then
			If Not(Main.vBln17) Then
				File.Delete(Server.TempFolder, vGetUploadedFile)
				v7.Enabled = True
				servletResponseWrapper.SendString("Non si dispone della licenza necessaria")
				Return
			End If
			Dim vGetParameter2 As String = servletRequestWrapper.GetParameter("pwd")
			If Main.v_sbpwd <> vGetParameter2 Then
				File.Delete(Server.TempFolder, vGetUploadedFile)
				v7.Enabled = True
				servletResponseWrapper.SendString("La password per le comunicazioni non è corretta")
				Return
			End If
			Dim vGetParameter3 As String = servletRequestWrapper.GetParameter("versione")
			If vGetParameter3 <> Main.v_mver And vGetParameter3 <> "9.99" Then
				File.Delete(Server.TempFolder, vGetUploadedFile)
				v7.Enabled = True
				servletResponseWrapper.SendString("Le versioni non sono allineate")
				Return
			End If
			If servletRequestWrapper.GetParameter("tavolo") <> "10000" Then
				i = 1
			End If
			If i = 1 Then
				If Main.v_websospenditavolo = 3 Then
					i = 2
				Else
					If Main.v_websospenditavolo <> 1 Then
					End If
					Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select pagina from pagine where pagina >=10  AND pagina <100 AND valore = " & servletRequestWrapper.GetParameter("tavolo") & " AND tipo = 9 limit 1")
					If Main.v_websospenditavolo = 2 Then
						If Main.v_gestionespiagge Then
							If Main.vSql1.ExecQuerySingleResult("Select count(*) from Despagine where chiedimemo2=2 and codice = " & SmartStringFormatter("", parseDouble) & " ") > 0 Then
								i = 2
							End If
						End If
					Else
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from Despagine where chiedimemo2<>2 and codice = " & SmartStringFormatter("", parseDouble) & " ") > 0 Then
							i = 2
						End If
					End If
				End If
			End If
			j = servletRequestWrapper.GetParameter("dataP")
			If j > 0 Then
				vStr7 = vGetParameter.SubString(3)
			End If
			Dim vGetParameter4 As String = servletRequestWrapper.GetParameter("datiPag")
			If servletRequestWrapper.GetParameter("disponibilita") = 1 Then
				File.Delete(Server.TempFolder, vGetUploadedFile)
				v7.Enabled = True
				servletResponseWrapper.SendString(Sub006(vStr6 & "/VENDUTO", servletRequestWrapper.GetParameter("matricola")))
				Return
			End If
			If vGetParameter4 <> "" Then
				Sub036(vGetParameter4, Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'") + 1)
			End If
			Dim vGetParameter5 As String = servletRequestWrapper.GetParameter("Via")
			Dim vGetParameter6 As String = servletRequestWrapper.GetParameter("Citta")
			If vGetParameter5 <> "" Then
				Dim replace As String = vGetParameter.Replace("Cli", "")
				Main.vSql1.ExecNonQuery("insert into TestiPagamentiWeb(cliente ,nmov ,testo,Tipo) values('" & SmartStringFormatter("", replace) & "'," & SmartStringFormatter("", Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'") + 1) & ",'" & SmartStringFormatter("", vGetParameter5 & CRLF & vGetParameter6) & "',1)")
			End If
			Dim vGetParameter7 As String = servletRequestWrapper.GetParameter("Lastnmov")
			If vGetParameter7 <> "" And vGetParameter7 > 0 Then
				Main.vSql2.ExecNonQuery("delete from headmov where nmov=" & vGetParameter7)
				Main.vSql2.ExecNonQuery("delete from venduto where nmov=" & vGetParameter7)
				Main.vSql2.ExecNonQuery("delete from CausaliPagamenti where nmov=" & vGetParameter7)
			End If
			If i > 0 Then
				Dim vGetParameter8 As String = servletRequestWrapper.GetParameter("tavolo")
				Dim vTmp As String = mod1.Sub031(vGetParameter8, vGetParameter.SubString(3))
				If vTmp <> "" Then
					File.Delete(Server.TempFolder, vGetUploadedFile)
					v7.Enabled = True
					servletResponseWrapper.SendString(vTmp)
					Return
				End If
				If i = 1 Then
					Sub037(vGetParameter8)
				End If
				Dim vGetParameter9 As String = servletRequestWrapper.GetParameter("memo")
				If vGetParameter9 <> "" Then
					Main.vSql1.ExecNonQuery("update tavoli set memo='" & modfunstr.left(vGetParameter9, 50) & "' where tavolo = " & vGetParameter8)
				End If
			End If
		End If
		File.Delete(Server.TempFolder, vGetUploadedFile)
		Dim vTmp_ As String = Sub044(vStr6 & "/VENDUTO", servletRequestWrapper.GetParameter("matricola"), True, i, j)
		If vTmp_ <> "Err" Then
			servletResponseWrapper.SendString("del_all" & vTmp_)
		Else
			servletResponseWrapper.SendString("Errore di comunicazione ..")
		End If
		v7.Enabled = True
	Catch
		servletResponseWrapper.SendString("Err")
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub handleuploadbila(str As String)
	Try
		If File.Exists(mod1.vStr4, "Tmp.zip") Then
			File.Delete(mod1.vStr4, "Tmp.zip")
		End If
		Dim i As Int
		For i = 0 To 30
			Try
				File.Copy(Server.TempFolder, str, mod1.vStr4, "Tmp.zip")
				Exit
			Catch
				mod1.Sub178(200)
			End Try
		Next
		File.Delete(Server.TempFolder, str)
		Dim archiverForB4A As ArchiverForB4A
		If File.Exists(mod1.vStr4, "Tmp.job") Then
			File.Delete(mod1.vStr4, "Tmp.job")
		End If
		Try
			archiverForB4A.UnZip(mod1.vStr4, "Tmp.zip", mod1.vStr4, "")
			If File.Exists(mod1.vStr4, "Tmp.job") Then
				CallSub2(Main, "ElaboraSacchettone", True)
			End If
		Catch
			If mod1.vStr1 = "Main" Then
				CallSub2(mod1.vStr1, "MsgboxOnly", "Errore nel formato del file sacchettone")
			Else
				ToastMessageShow("Errore nel formato del file sacchettone", True)
			End If
			Return
		End Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub031(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Dim e As Exception
	Dim str As String
	Dim str2 As String = ""
	Try
		str2 = "Errore"
		Dim vGetUploadedFile As String = servletRequestWrapper.GetUploadedFile("upfile")
		Dim vGetParameter As String = servletRequestWrapper.GetParameter("upfile")
		Dim sb2 As String = Main.vStr7 & "/" & servletRequestWrapper.GetParameter("cassa") & "/TMP"
		Dim sb4 As String = Main.vStr7 & "/" & servletRequestWrapper.GetParameter("cassa")
		Initialize
		Dim vListFiles As List = File.ListFiles(sb2)
		If vListFiles.Size > 0 Then
			Dim size As Int = vListFiles.Size - 1
			Dim i As Int
			For i = 0 To size
				File.Delete(sb2, vListFiles.Get(i))
			Next
		End If
		Dim i2 As Int
		For i2 = 0 To 30
			Try
				File.Copy(Server.TempFolder, vGetUploadedFile, sb2, vGetParameter)
				Exit
			Catch
				mod1.Sub178(300)
			End Try
		Next
		File.Delete(Server.TempFolder, vGetUploadedFile)
		Try
			UnZip(sb2, vGetParameter, sb2, "")
		Catch
			File.Delete(sb2, vGetParameter)
			servletResponseWrapper.SendString("Errore durante l'invio del file")
		End Try
		File.Delete(sb2, vGetParameter)
		vListFiles.Initialize
		Dim vListFiles2 As List = File.ListFiles(sb2)
		If vListFiles2.Size > 0 Then
			Dim size2 As Int = vListFiles2.Size - 1
			Dim i3 As Int
			For i3 = 0 To size2
				File.Copy(sb2, vListFiles2.Get(i3), sb4, vListFiles2.Get(i3))
				File.Delete(sb2, vListFiles2.Get(i3))
			Next
		End If
		If Not(File.Exists(sb4, "ModCliente.txt")) Then
			str = "Errore"
		Else
			Dim randomAccessFile As RandomAccessFile
			randomAccessFile.Initialize(sb4, "ModCliente.txt", False)
			Dim list As List
			list.Initialize
			Dim map As Map = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
			list.Add(map)
			Main.vSql1.ExecNonQuery("delete from clienti where codice = '" & map.Get("codice") & "'")
			dbutil.Sub007(Main.vSql1, "clienti", list)
			list.Initialize
			Dim map2 As Map = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
			list.Add(map2)
			Main.vSql1.ExecNonQuery("delete from FEdatiCli where codice = '" & map2.Get("codice") & "'")
			dbutil.Sub007(Main.vSql1, "FEdatiCli", list)
			str = "OK"
			Try
				File.Delete(sb4, "ModCliente.txt")
			Catch
				e = e4
				mod1.Sub217(LastException.Message)
				servletResponseWrapper.SendString(str)
				Return
			End Try
		End If
	Catch
		e = e5
		str = str2
	End Try
	servletResponseWrapper.SendString(str)
End Sub

Sub Sub032(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Try
		Dim vGetUploadedFile As String = servletRequestWrapper.GetUploadedFile("upfile")
		vStr6 = Main.vStr7 & "/" & servletRequestWrapper.GetParameter("matricola")
		File.Copy(Server.TempFolder, vGetUploadedFile, vStr6 & "/VENDUTO/IMG", servletRequestWrapper.GetParameter("upfile"))
		File.Delete(Server.TempFolder, vGetUploadedFile)
		Sub044(vStr6 & "/VENDUTO", servletRequestWrapper.GetParameter("matricola"), True, 0, 0)
		v7.Enabled = True
		servletResponseWrapper.SendString("del_img")
		Return
	Catch
		servletResponseWrapper.SendString("Err")
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub033(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse, str As String)
	Try
		Dim vGetUploadedFile As String = servletRequestWrapper.GetUploadedFile("upfile")
		Dim vGetParameter As String = servletRequestWrapper.GetParameter("upfile")
		Dim parseDouble As Int = servletRequestWrapper.GetParameter("cassa")
		Dim sb2 As String = Main.vStr7 & "/" & servletRequestWrapper.GetParameter("cassa") & "/TMP"
		Dim sb4 As String = Main.vStr7 & "/" & servletRequestWrapper.GetParameter("cassa")
		Initialize
		Dim vListFiles As List = File.ListFiles(sb2)
		If vListFiles.Size > 0 Then
			Dim size As Int = vListFiles.Size - 1
			Dim i As Int
			For i = 0 To size
				File.Delete(sb2, vListFiles.Get(i))
			Next
		End If
		Dim i2 As Int
		For i2 = 0 To 30
			Try
				File.Copy(Server.TempFolder, vGetUploadedFile, sb2, vGetParameter)
				Exit
			Catch
				mod1.Sub178(300)
			End Try
		Next
		File.Delete(Server.TempFolder, vGetUploadedFile)
		Try
			UnZip(sb2, vGetParameter, sb2, "")
		Catch
			File.Delete(sb2, vGetParameter)
			servletResponseWrapper.SendString("Errore durante l'invio del file")
		End Try
		File.Delete(sb2, vGetParameter)
		vListFiles.Initialize
		Dim vListFiles2 As List = File.ListFiles(sb2)
		If vListFiles2.Size > 0 Then
			Dim size2 As Int = vListFiles2.Size - 1
			Dim i3 As Int
			For i3 = 0 To size2
				File.Copy(sb2, vListFiles2.Get(i3), sb4, vListFiles2.Get(i3))
				File.Delete(sb2, vListFiles2.Get(i3))
			Next
		End If
		mod1.Sub210(parseDouble, str)
		servletResponseWrapper.SendString("OK")
		Return
	Catch
		mod1.Sub217(LastException.Message)
		servletResponseWrapper.SendString("Errore ")
		Return
	End Try
End Sub

Sub Sub034(servletResponseWrapper As ServletResponse, str As String)
	Try
		Dim dirDefaultExternal As String = File.DirDefaultExternal
		File.Copy(dirDefaultExternal, "Anagra.db", mod1.vStr4 & "/SEND", "Anagra.db")
		Dim dirDefaultExternal2 As String = File.DirDefaultExternal
		File.Copy(dirDefaultExternal2, "Config.txt", mod1.vStr4 & "/SEND", "Config.txt")
		Initialize
		Dim list As List
		list.Initialize
		Dim vListFiles As List = File.ListFiles(File.DirDefaultExternal)
		Dim size As Int = vListFiles.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim vObjectToString As String = vListFiles.Get(i)
			If vObjectToString.StartsWith("LayoutStampaTipo") And vObjectToString.EndsWith(".cfg") Then
				list.Add(vObjectToString)
				Dim dirDefaultExternal3 As String = File.DirDefaultExternal
				File.Copy(dirDefaultExternal3, vObjectToString, mod1.vStr4 & "/SEND", vObjectToString)
			End If
		Next
		Dim strArr(list.Size + 2) As String
		strArr(0) = "Anagra.db"
		strArr(1) = "Config.txt"
		If list.Size > 0 Then
			Dim size2 As Int = list.Size - 1
			Dim i2 As Int
			For i2 = 0 To size2
				strArr(i2 + 2) = list.Get(i2)
			Next
		End If
		Dim archiverForB4A As ArchiverForB4A
		Dim sb5 As String = mod1.vStr4 & "/SEND"
		archiverForB4A.ZipFiles(sb5, strArr, mod1.vStr4 & "/SEND", "Anagra.zip", "")
		servletResponseWrapper.SendFile(mod1.vStr4 & "/SEND", "Anagra.zip")
		Dim sb9 As String = mod1.vStr4 & "/T" & str & "/TAVOLI"
		mod1.Sub070(sb9)
		Return
	Catch
		servletResponseWrapper.SendString("Errore")
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub035(servletResponseWrapper As ServletResponse, str As String, z As Boolean)
	Try
		Dim sb2 As String = mod1.vStr4 & "/T" & str & "/TAVOLI"
		If z Then
			Dim list As List
			list.Initialize
			list.AddAll(File.ListFiles(sb2))
			Dim size As Int = list.Size - 1
			Dim i As Int
			For i = 0 To size
				Dim vObjectToString As String = list.Get(i)
				If vObjectToString.EndsWith(".txt") Then
					If File.Size(sb2, vObjectToString) > 0 Then
						File.Delete(sb2, vObjectToString)
					End If
				End If
			Next
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select valore from pagine where pagina >=10  AND pagina <100  AND tipo = 9")
			Dim iArr(cursorWrapper2.RowCount) As Int
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount
				cursorWrapper2.Position = i2
				iArr(i2) = cursorWrapper2.GetInt("valore")
			Next
			CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr, str)
		End If
		Dim list2 As List
		list2.Initialize
		list2.AddAll(File.ListFiles(sb2))
		Dim list3 As List
		list3.Initialize
		Dim size2 As Int = list2.Size - 1
		Dim i3 As Int
		For i3 = 0 To size2
			Dim vObjectToString2 As String = list2.Get(i3)
			If vObjectToString2.EndsWith(".txt") Then
				If File.Size(sb2, vObjectToString2) > 0 Then
					list3.Add(vObjectToString2)
				End If
			End If
		Next
		If list3.Size > 0 Then
			Dim strArr(list3.Size) As String
			Dim size3 As Int = list3.Size - 1
			Dim i4 As Int
			For i4 = 0 To size3
				strArr(i4) = list3.Get(i4)
			Next
			ZipFiles(sb2, strArr, sb2, "SospesiT.zip", "")
			Dim size4 As Int = list3.Size - 1
			Dim i5 As Int
			For i5 = 0 To size4
				File.Delete(sb2, list3.Get(i5))
			Next
			servletResponseWrapper.SendFile(sb2, "SospesiT.zip")
			Return
		End If
		servletResponseWrapper.SendString("OK")
		Return
	Catch
		servletResponseWrapper.SendString("Errore")
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub036(str As String, j As Long)
	Try
		Dim sb As String = "TMP" & DateTime.Now & Rnd(1, 1000)
		File.WriteString(File.DirInternal, sb, str)
		Dim vObjectToString As String = File.ReadMap(File.DirInternal, sb).GetDefault("custom", "")
		Main.vSql1.ExecNonQuery("insert into TestiPagamentiWeb(cliente ,nmov ,testo) values('" & SmartStringFormatter("", vObjectToString) & "'," & SmartStringFormatter("", j) & ",'" & SmartStringFormatter("", str.Replace("'", "`").Replace("%", "").Replace(",", "")) & "')")
		File.Delete(File.DirInternal, sb)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub037(str As String)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select Serial,IP from Palmari where Attivo = 1 order by Serial")
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			CallSub3(httpclient, "SendPrenotaPalmari", cursorWrapper2.GetString("IP"), str)
		Next
	End If
	cursorWrapper2.Close
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m1… (riga 3304).
Sub Sub038(i As Int, str As String, str2 As String) As String
	Dim z As Boolean = False
	Dim j As Long = 0
	If Main.v_opobbligatorio Then
		z = (Main.vSql1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " & i) = 1)
		If z Then
			j = Main.vSql1.ExecQuerySingleResult("Select rifheadmov from tavoli where tavolo = " & i)
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from venduto where nmov =" & j) > 0 Then
				Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select operatore from headmov where nmov = " & j)
				If vExecQuerySingleResult <> str2 Then
					Return "Solo l'operatore " & vExecQuerySingleResult & " può aprire questo tavolo."
				End If
			End If
		End If
	End If
	Dim stringBuilderWrapper As StringBuilder
	If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & i) = 0) Then
		If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from pagine where pagina >=10 and pagina <100 and tipo = " & Main.t_tavolo & " and  valore = " & i) = 0) Or i >= 20000 Then
			Dim z2 As Boolean = False
			If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where lock=0 and inmodifica=0 and tavolo = " & i) = 0 Then
				Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " & i)
				If vExecQuerySingleResult2 <> "0" Then
					z2 = (Main.vSql1.ExecQuerySingleResult("Select count(*) from headmov where fromweb=1 and nmov = " & vExecQuerySingleResult2) > 0)
				End If
				If Not(z2) Then
					Return "TAVOLO BLOCCATO"
				End If
			End If
			If File.Exists(Main.vStr7 & "/" & str.Trim, "venduto.csv") Then
				Return "TAVOLO NON ANCORA ELABORATO DAL SERVER"
			End If
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from Palmari where  Serial = '" & str & "'") = 0 Then
				Return "Inserire la matricola sul server "
			End If
			Main.vSql1.BeginTransaction
			Try
				If Main.vSql1.ExecQuerySingleResult("Select count(*) as tot from tavoli where rifheadmov >0 and tavolo = " & i) = 0 Then
					Main.vSql1.ExecNonQuery("update tavoli set timein = '" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "' where tavolo =" & i)
					Main.vSql1.ExecNonQuery("update tavoli set inmodifica =1,timelast=timein where tavolo =" & i)
				Else
					Main.vSql1.ExecNonQuery("update tavoli set inmodifica =1,timelast ='" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "' where tavolo =" & i)
				End If
				Main.vSql1.TransactionSuccessful
				Main.vSql1.EndTransaction
				If Main.vBln24 Then
					CallSub3(httpclient, "SendVariazioneTavoloAiClient", Array As Int(i), str)
				End If
				If Main.vInt30 >= 10 Then
				End If
			Catch
				If 1 <> 0 Then
					Main.vSql1.EndTransaction
				End If
				mod1.Sub217(LastException.Message)
				Return "Errore esportazione dati"
			End Try
		End If
	End If
	Return "TAVOLO NON TROVATO"
End Sub

Sub Sub039(str As String, i As Int) As Boolean
	Try
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" & SmartStringFormatter("", str) & "'") > 0 Then
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where flgmag=1 and codint = '" & SmartStringFormatter("", str) & "'") > 0 Then
				Dim parseDouble As Double = Main.vSql1.ExecQuerySingleResult("Select giac from anagra where codint = '" & SmartStringFormatter("", str) & "'")
				Dim parseDouble2 As Double = parseDouble - Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Venduto inner join headmov on venduto.nmov=headmov.nmov where headmov.sospeso=1  AND codint = '" & SmartStringFormatter("", str) & "'") - i
				If parseDouble2 < 0 Then
					Log(parseDouble2)
					Return False
				End If
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from distintabase where codint = '" & SmartStringFormatter("", str) & "'") > 0 Then
					Dim cursorWrapper As Cursor
					Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codintpadre from distintabase where codint = '" & SmartStringFormatter("", str) & "'")
					Dim rowCount As Int = cursorWrapper2.RowCount - 1
					Dim i2 As Int
					For i2 = 0 To rowCount
						cursorWrapper2.Position = i2
						Dim parseDouble3 As Double = Main.vSql1.ExecQuerySingleResult("Select giac from anagra where codint = '" & SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) & "'")
						Dim cursorWrapper3 As Cursor
						Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select codint,qta from distintabase where codintpadre = '" & SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) & "'")
						Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
						Dim i3 As Int
						For i3 = 0 To rowCount2
							cursorWrapper4.Position = i3
							parseDouble3 = Round2(parseDouble3 - Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Venduto inner join headmov on venduto.nmov=headmov.nmov where headmov.sospeso=1  AND codint = '" & SmartStringFormatter("", cursorWrapper4.GetString("codint")) & "'") * cursorWrapper4.GetDouble("qta"), 3)
						Next
						cursorWrapper4.Close
						If parseDouble3 < 0 Then
							cursorWrapper2.Close
							Return False
						End If
					Next
					cursorWrapper2.Close
				End If
				Return True
			End If
			Return True
		End If
		Return False
	Catch
		Return "Errore Lettura Disponibilità"
	End Try
End Sub

Sub Sub040(str As String) As String
	Dim str2 As String
	Try
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" & SmartStringFormatter("", str) & "'") > 0 Then
			Dim z As Boolean = Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where flgmag=1 and codint = '" & SmartStringFormatter("", str) & "'") > 0
			If z Then
				Dim sb As String = "Disponibilità " & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & SmartStringFormatter("", str) & "'") & ":  "
				Dim parseDouble As Double = Main.vSql1.ExecQuerySingleResult("Select giac from anagra where codint = '" & SmartStringFormatter("", str) & "'")
				Dim parseDouble2 As Double = parseDouble - Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Venduto inner join headmov on venduto.nmov=headmov.nmov where headmov.sospeso=1  AND codint = '" & SmartStringFormatter("", str) & "'")
				If parseDouble2 Mod 1 = 0 Then
					str2 = sb & NumberFormat(parseDouble2, 1, 0)
				Else
					str2 = sb & NumberFormat2(parseDouble2, 1, 3, 3, False)
				End If
			Else
				str2 = "Articolo non abilitato alla gestione del magazzino"
			End If
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from distintabase where codint = '" & SmartStringFormatter("", str) & "'") <= 0 Then
				Return str2
			End If
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codintpadre from distintabase where codint = '" & SmartStringFormatter("", str) & "'")
			If Not(z) Then
				str2 = ""
			End If
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim str3 As String = str2
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				Dim sb2 As String = str3 & CRLF & "Disponibilità " & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) & "'") & ":  "
				Dim parseDouble3 As Double = Main.vSql1.ExecQuerySingleResult("Select giac from anagra where codint = '" & SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) & "'")
				Dim cursorWrapper3 As Cursor
				Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select codint,qta from distintabase where codintpadre = '" & SmartStringFormatter("", cursorWrapper2.GetString("codintpadre")) & "'")
				Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
				Dim i2 As Int = 0
				Dim d As Double = parseDouble3
				Do While i2 <= rowCount2
					cursorWrapper4.Position = i2
					i2 = i2 + 1
					d = Round2(d - Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from Venduto inner join headmov on venduto.nmov=headmov.nmov where headmov.sospeso=1  AND codint = '" & SmartStringFormatter("", cursorWrapper4.GetString("codint")) & "'") * cursorWrapper4.GetDouble("qta"), 3)
				Loop
				cursorWrapper4.Close
				If d Mod 1 = 0 Then
					str3 = sb2 & NumberFormat(d, 1, 0)
				Else
					str3 = sb2 & NumberFormat2(d, 1, 3, 3, False)
				End If
			Next
			cursorWrapper2.Close
			Return str3
		End If
		Return "Articolo non trovato"
	Catch
		Return "Errore Lettura Giacenza"
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo _server_handlerequest (riga 3635).
Sub Server_HandleRequest(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Dim vSplit As String()
	Dim remoteAddress As String
	Dim z As Boolean
	Dim z2 As Boolean
	Dim sb As String
	Dim z3 As Boolean
	Dim str As String
	Dim z4 As Boolean = True
	Try
		vSemaphore1.Lock
		Dim replace As String = servletRequestWrapper.RequestURI.replace("/", "")
		vSplit = Regex.Split("_", replace)
		remoteAddress = servletRequestWrapper.RemoteAddress
	Catch
		mod1.Sub217(LastException.Message)
		servletResponseWrapper.Status = 500
		servletResponseWrapper.SendString("Errore: " & LastException)
		vSemaphore1.Unlock
		Return
	End Try
	If Main.v_attivakeyhttp Then
		If Main.vMap1.IsInitialized Then
			If Main.vMap1.ContainsKey(remoteAddress) Then
				z = True
				If z Then
					Dim str2 As String = vSplit(0)
					If str2 = "write" Or str2 = "orari" Or str2 = "giac" Or str2 = "getprg" Or str2 = "GetArticoli" Or str2 = "getcodtavoli" Or str2 = "apri" Or IsNumber(str2) Or str2 = "lista" Or str2 = "unisci" Or str2 = "sposta" Or str2 = "conto" Or str2 = "sblocca" Or str2 = "GetTotali" Or str2 = "setcodtavoli" Then
						vSplit(0) = ""
					End If
					Dim vGetParameter As String = servletRequestWrapper.GetParameter("mk")
					If vGetParameter <> "" Then
						Dim vTmp As String = mod1.Sub062(vGetParameter)
						If vTmp.Length > 15 Then
							If Not(IsNumber(vTmp.SubString(5))) Then
								servletResponseWrapper.SendString("Il formato della data nella chiave non è corretto.")
								z2 = True
							Else
								Dim parseDouble As Long = vTmp.SubString(5)
								Dim substring As String = vTmp.SubString2(0, 5)
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from Palmari where Serial = '" & SmartStringFormatter("", substring) & "'") = 0 Then
									servletResponseWrapper.SendString("La matricola contenuta nella chiave non esiste sul server .")
									z2 = True
								Else
									Dim parseDouble2 As Long = Main.vSql1.ExecQuerySingleResult("Select datachiave from Palmari where Serial = '" & SmartStringFormatter("", substring) & "'")
									If parseDouble2 > 0 And parseDouble2 >= parseDouble Then
										servletResponseWrapper.SendString("La data contenuta nella chiave non è corretta ." & SmartStringFormatter("", CRLF) & "Eseguire il reset della chiave del palmare su RistorAndro per risolvere il problema.")
										z2 = True
									Else
										Main.vSql1.ExecQuerySingleResult("update Palmari set datachiave=" & SmartStringFormatter("", parseDouble) & " where Serial = '" & SmartStringFormatter("", substring) & "'")
										If servletRequestWrapper.GetParameter("CMD") <> "" Then
											vSplit(0) = servletRequestWrapper.GetParameter("CMD")
											z2 = False
										Else
											vSplit(0) = str2
											z2 = False
										End If
									End If
								End If
							End If
						Else
							servletResponseWrapper.SendString("Il formato della chiave non è corretto .")
							z2 = True
						End If
						If Not(z2) Then
							Select vSplit(0)
								Case "verkeys"
									servletResponseWrapper.SendString("OK")
								Case "GetArticoli"
									servletResponseWrapper.SendString(Sub014(vSplit(2)))
								Case "addcliweb"
									Sub017(servletRequestWrapper, servletResponseWrapper)
								Case "getcodtavoli"
									If vSplit.Length >= 2 Then
										If IsNumber(vSplit(2)) Then
											If modfunstr.Sub006(vSplit(2)) = -1 Then
												servletResponseWrapper.SendString("OK" & Main.vSql1.ExecQuerySingleResult("select CodWeb from versione"))
											End If
										End If
										If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & vSplit(2)) > 0 Then
											If vSplit.Length >= 3 And vSplit(3) = "1" Then
												servletResponseWrapper.SendString("OK" & Main.vSql1.ExecQuerySingleResult("select tPWD from tavoli where tavolo = " & vSplit(2)) & "_" & Main.vSql1.ExecQuerySingleResult("select copertiWeb from tavoli where tavolo = " & vSplit(2)))
											Else
												servletResponseWrapper.SendString("OK" & Main.vSql1.ExecQuerySingleResult("select tPWD from tavoli where tavolo = " & vSplit(2)))
											End If
										Else
											servletResponseWrapper.SendString("Errore : Il tavolo " & vSplit(2) & " non è stato trovato")
										End If
									Else
										servletResponseWrapper.SendString("Errore : Il comando inviato non è corretto")
									End If
								Case "setcodtavoli"
									If Not(vSplit(3).StartsWith("ReseT")) Then
										If Not(Main.vSql1.ExecQuerySingleResult("select tPWD from tavoli where tavolo = " & vSplit(2)) = "") Then
											str = "Errore"
											servletResponseWrapper.SendString(str)
										End If
									End If
									vSplit(3) = vSplit(3).Replace("ReseT", "")
									Main.vSql1.ExecNonQuery("update tavoli set  tPWD='" & vSplit(3) & "',memo='' where tavolo = " & vSplit(2))
									str = "OK"
									servletResponseWrapper.SendString(str)
								Case "setcoperti"
									Main.vSql1.ExecNonQuery("update tavoli set copertiWeb=" & vSplit(3) & " where tavolo = " & vSplit(2))
									servletResponseWrapper.SendString("OK")
								Case "ChiamaC"
									Sub009(vSplit(2))
								Case "orariweb"
									servletResponseWrapper.SendString(Sub022(vSplit(2), vSplit(3), vSplit(4)))
								Case "getsaldo"
									Log(vSplit(1))
									servletResponseWrapper.SendString(Sub023(vSplit(1)))
								Case "lista"
									If vSplit.Length <> 2 Then
										Dim str3 As String = vSplit(2)
										If str3 = Main.v_mver Then
											If Main.vBln25 Then
												servletResponseWrapper.SendString("Non è possibile collegarsi ad un client")
											Else
												servletResponseWrapper.SendString(Sub011())
											End If
										End If
									End If
									If vSplit.Length = 2 Then
										servletResponseWrapper.SendString("Errore dati dal server")
									Else
										servletResponseWrapper.SendString("Errore Versione Programma")
									End If
								Case "getprg"
									Sub024(servletResponseWrapper, vSplit(2))
								Case "getimg"
									Sub021(servletResponseWrapper)
								Case "getbk"
									Sub019(servletResponseWrapper)
								Case "autenticazioneGlory"
									Sub018(servletResponseWrapper)
								Case "InfinityManager"
									Dim vGetParameter2 As String = servletRequestWrapper.GetParameter("Comando")
									Dim vGetParameter3 As String = servletRequestWrapper.GetParameter("Esito")
									Select vGetParameter2.Trim
										Case "Eroga"
											If vGetParameter3 <> "" Then
												CallSub2(Main, "MessaggioErogazioneInfinity", vGetParameter3)
											End If
										Case "Messaggio"
											If vGetParameter3 <> "" Then
												CallSub3(Main, "MsgboxOnlyA", vGetParameter3, False)
											End If
										Case Else
											mod1.Sub217("Comando Infinity Manager non gestito: " & vGetParameter2 & " - " & vGetParameter3)
									End Select
								Case "esitoGlory"
									Dim vGetParameter4 As String = servletRequestWrapper.GetParameter("esito")
									Dim vGetParameter5 As String = servletRequestWrapper.GetParameter("resuduo")
									If vGetParameter4.Contains("Livelli Bassi") Then
										If Main.vBln47 Then
											z3 = True
											If Not(z3) Then
												If vGetParameter4.Contains("Errore Glory") Then
												End If
												z4 = False
												If Not(z4) Then
													CallSubDelayed3(Me, "HandleGlory", vGetParameter4, vGetParameter5)
												End If
											End If
											servletResponseWrapper.SendString("OK")
										End If
									End If
									z3 = False
									If Not(z3) Then
									End If
									servletResponseWrapper.SendString("OK")
								Case "apritav"
									Dim str4 As String = vSplit(4)
									If str4 <> Main.v_mver Then
										servletResponseWrapper.SendString("Errore Versione Programma")
									Else
										Sub028(servletResponseWrapper, vSplit(1), vSplit(3))
									End If
								Case "opertav"
									Dim str5 As String = vSplit(4)
									If str5 <> Main.v_mver Then
										servletResponseWrapper.SendString("Errore Versione Programma")
									Else
										If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo =" & vSplit(1)) > 0 Then
											Dim parseDouble3 As Int = Main.vSql1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo =" & vSplit(1))
											If parseDouble3 = 0 Then
												servletResponseWrapper.SendString("Nessuno")
											Else
												servletResponseWrapper.SendString(Main.vSql1.ExecQuerySingleResult("Select operatore from headmov where nmov = " & parseDouble3))
											End If
										Else
											servletResponseWrapper.SendString("Errore Tavolo non trovato")
										End If
									End If
								Case "recmov"
									Dim str6 As String = vSplit(3)
									If str6 <> Main.v_mver Then
										servletResponseWrapper.SendString("Errore Versione Programma")
									Else
										Sub025(servletResponseWrapper, vSplit(1), vSplit(2))
									End If
								Case "hello"
									If Main.vBln24 Then
										Dim str7 As String = vSplit(3)
										If str7 = Main.v_mver And vSplit.Length = 4 And vSplit(1) >= 1 Then
											If Main.vCur1.IsInitialized Then
												Dim parseDouble4 As Double = vSplit(1)
											End If
											Main.vCur1.Position = vSplit(1) - 1
											If Main.vCur1.GetString("IP").Trim <> servletRequestWrapper.RemoteAddress Then
												servletResponseWrapper.SendString("Errore .... Il terminale " & vSplit(1) & " risulta avere un indirizzo IP diverso.")
											Else
												If Main.vCur1.GetInt("stato") > 1 Or vSplit(2) = 1 Then
													Sub034(servletResponseWrapper, vSplit(1))
													Main.vSql1.ExecNonQuery("update clients set stato =1 where codice = " & vSplit(1))
													Dim cursorWrapper As Cursor
													Main.vCur1 = Main.vSql1.ExecQuery("Select * from clients order by codice")
												Else
													If Main.vCur1.GetInt("stato") = 0 Then
														servletResponseWrapper.SendString("Errore .... Il terminale non risulta essere abilitato sul server.")
													Else
														servletResponseWrapper.SendString("OK")
													End If
												End If
											End If
										End If
									End If
									Dim str8 As String = vSplit(3)
									If str8 <> Main.v_mver Then
										servletResponseWrapper.SendString("Errore Versione Programma")
									Else
										If Not(Main.vBln24) Then
											servletResponseWrapper.SendString("Errore: Il server risulta essere in fase di avvio")
										Else
											If Main.vCur1.IsInitialized Then
												Dim parseDouble5 As Double = vSplit(1)
												If parseDouble5 > Main.vCur1.RowCount Then
													servletResponseWrapper.SendString("Errore: Il codice del terminale non è valido")
												End If
											End If
											servletResponseWrapper.SendString("Errore Struttura dati inviati al server")
										End If
									End If
									If Main.vBln24 Then
										If Main.vCur1.IsInitialized Then
											Main.vSql1.ExecNonQuery("update clients set stato =3 where codice = " & vSplit(1))
											Dim cursorWrapper2 As Cursor
											Main.vCur1 = Main.vSql1.ExecQuery("Select * from clients order by codice")
										End If
									End If
								Case "GetDBV"
									Sub020(servletResponseWrapper, servletRequestWrapper.GetParameter("query"))
								Case "getsospesi"
									Sub026(servletResponseWrapper, vSplit(1))
								Case "updcliente"
									Sub031(servletRequestWrapper, servletResponseWrapper)
								Case "vendutoclient"
									Sub033(servletRequestWrapper, servletResponseWrapper, vSplit(1))
								Case "updanagra"
									Sub029(servletRequestWrapper, servletResponseWrapper)
								Case "stampascontrino"
									Sub027(servletRequestWrapper, servletResponseWrapper)
								Case "saldicliente"
									If vSplit.Length < 2 Then
										servletResponseWrapper.SendString("Errore di comunicazione con il server...")
									Else
										Dim str9 As String = vSplit(3)
										If vSplit(2).StartsWith("get") Then
											If vSplit(2).EndsWith("punti") Then
												servletResponseWrapper.SendString("cliente_" & vSplit(2) & "_" & str9 & "_" & Main.vSql1.ExecQuerySingleResult("Select punti from clienti where codice = '" & str9 & "'"))
											Else
												servletResponseWrapper.SendString("cliente_" & vSplit(2) & "_" & str9 & "_" & Main.vSql1.ExecQuerySingleResult("Select prep from clienti where codice = '" & str9 & "'"))
											End If
										Else If vSplit(2).StartsWith("set") Then
											If vSplit(2).EndsWith("punti") Then
												Dim vTmp_ As Int = modfunstr.Sub006(vSplit(4))
												Main.vSql1.ExecNonQuery("update clienti set punti = punti + " & vTmp_ & " where codice = '" & str9 & "'")
												servletResponseWrapper.SendString("cliente_" & vSplit(2) & "_" & str9 & "_" & Main.vSql1.ExecQuerySingleResult("Select punti from clienti where codice = '" & str9 & "'"))
											Else
												Dim parseDouble6 As Double = vSplit(4)
												Main.vSql1.ExecNonQuery("update clienti set prep = prep + " & parseDouble6 & " where codice = '" & str9 & "'")
												servletResponseWrapper.SendString("cliente_" & vSplit(2) & "_" & str9 & "_" & Main.vSql1.ExecQuerySingleResult("Select prep from clienti where codice = '" & str9 & "'"))
											End If
										End If
									End If
								Case "getvar"
									Dim str10 As String = vSplit(1)
									If str10 <> Main.v_mver Then
										servletResponseWrapper.SendString("Errore Versione Programma")
									Else
										Sub034(servletResponseWrapper, vSplit(2))
									End If
								Case "getvart"
									Sub035(servletResponseWrapper, vSplit(1), False)
								Case "getvartAll"
									Sub035(servletResponseWrapper, vSplit(1), True)
								Case "giac"
									If vSplit.Length <> 2 Then
										Dim str11 As String = vSplit(2)
										If str11 = Main.v_mver Then
											servletResponseWrapper.SendString(Sub040(vSplit(1)))
										End If
									End If
									servletResponseWrapper.SendString("Errore Versione Programma")
								Case "totali"
									servletResponseWrapper.SendString(Sub005())
								Case "conto2"
									Try
										Main.vSql1.ExecNonQuery("update tavoli set ricconto=1 where tavolo = " & vSplit(1))
									Catch
										servletResponseWrapper.SendString("Errore")
									End Try
									If Main.vInt30 >= 10 Then
									End If
									If Not(Main.vBln36) Then
										CallSub2("Main", "ShowMsgConto", "Richiesto il conto dal tavolo " & vSplit(1))
										Dim iArr() As Int = Array(vSplit(1))
										Dim str12 As String = vSplit(2)
										CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr, str12)
										servletResponseWrapper.SendString("Ok")
									End If
									Main.vStr18 = " and tipo =" & Main.t_tavolo & " and valore = " & vSplit(1) & " "
									CallSub2("Main", "CambiaPagina", Main.vInt30)
									Main.vStr18 = ""
									Dim iArr2() As Int = Array(vSplit(1))
									Dim str122 As String = vSplit(2)
									CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr2, str122)
									servletResponseWrapper.SendString("Ok")
								Case "conto"
									Try
										Main.vSql1.ExecNonQuery("update tavoli set ricconto=1 where tavolo = " & vSplit(1))
									Catch
										servletResponseWrapper.SendString("Errore")
									End Try
									If Main.vInt30 >= 10 Then
									End If
									If Not(Main.vBln36) Then
										CallSub2("Main", "ShowMsgConto", "Richiesto il conto dal tavolo " & vSplit(1))
										If Main.vBln24 Then
											Dim iArr3() As Int = Array(vSplit(1))
											Dim object As Class = httpclient
											CallSub3(object, "SendVariazioneTavoloAiClient", iArr3, Main.v_numcassa)
										End If
										servletResponseWrapper.SendString("Ok")
									End If
									Main.vStr18 = " and tipo =" & Main.t_tavolo & " and valore = " & vSplit(1) & " "
									CallSub2("Main", "CambiaPagina", Main.vInt30)
									Main.vStr18 = ""
									If Main.vBln24 Then
									End If
									servletResponseWrapper.SendString("Ok")
								Case "errprt"
									servletResponseWrapper.SendString("Ok")
									CallSub(Main, "UpdTabStampe")
								Case "helloprt"
									servletResponseWrapper.SendString("Ok")
									Main.vInt16 = 0
								Case "sblocca"
									Try
										If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & SmartStringFormatter("", vSplit(1)) & " and inmodifica=0 and lock=1") = 0 Then
											servletResponseWrapper.SendString("Non è possibile sbloccare il tavolo")
										Else
											Main.vSql1.ExecNonQuery("update tavoli set inmodifica=0,lock=0,unlocktable=0,stampap=0 where tavolo = " & vSplit(1))
											If Main.vInt30 >= 10 Then
											End If
										End If
									Catch
										servletResponseWrapper.SendString("Errore")
									End Try
								Case "orari"
									If Main.v_asportoora Then
										servletResponseWrapper.SendString(Sub042())
									Else
										servletResponseWrapper.SendString("disabilitato")
									End If
								Case "sacchettone"
									Dim vGetUploadedFile As String = servletRequestWrapper.GetUploadedFile("upfile")
									servletResponseWrapper.SendString("OK")
									CallSubDelayed2(Me, "HandleUploadBila", vGetUploadedFile)
								Case "clientvar"
									If Main.v_ipserver = "" Then
										servletResponseWrapper.SendString("Impostare l'indirizzo IP sul Client ")
									Else
										servletResponseWrapper.SendString("")
										CallSub2(httpclient, "GetVariazioniDaClient", "getvardaclient")
									End If
								Case "datiscontrino"
									servletResponseWrapper.SendString("ok")
									Sub004(vSplit)
								Case "sposta"
									servletResponseWrapper.SendString(spostatavolo(vSplit(1), vSplit(2), vSplit(3)))
								Case "unisci"
									servletResponseWrapper.SendString(uniscitavolo(vSplit(1), vSplit(2), vSplit(3)))
								Case "write"
									Sub030(servletRequestWrapper, servletResponseWrapper)
								Case "writeimg"
									Sub032(servletRequestWrapper, servletResponseWrapper)
								Case "apri"
									If vSplit.Length <> 1 Then
										Dim str13 As String = vSplit(1)
										If str13 = Main.v_mver Then
											If Main.vBln25 Then
												servletResponseWrapper.SendString("Non è possibile collegarsi ad un client")
											Else
												servletResponseWrapper.SendString("okapri")
											End If
										End If
									End If
									servletResponseWrapper.SendString("Errore Versione Programma")
								Case "GetPrenota"
									Sub015(servletResponseWrapper)
								Case "DelPrenota"
									servletResponseWrapper.SendString(Sub012(vSplit(1)))
								Case "GetTotali"
									servletResponseWrapper.SendString(Sub016(vSplit(1)))
								Case "StoriciFiltro.htm"
									Dim vTmp__ As String = Sub008(servletRequestWrapper, True)
									If vTmp__ = "" Then
										Dim vGetParameter6 As String = servletRequestWrapper.GetParameter("rpt")
										Dim vGetText As String = File.GetText(File.DirAssets, "StoriciFiltro.htm")
										vTmp__ = vGetText.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", vGetParameter6).Replace("%TICK%", vStr1)
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp__)
								Case "Login", "Login.htm", "login"
									servletResponseWrapper.SetContentType("text/html")
									Dim vGetText2 As String = File.GetText(File.DirAssets, "Login.htm")
									servletResponseWrapper.SendString(vGetText2.Replace("%NOMENEGOZIO%", Main.v_mdesmittente))
								Case "Accesso"
									If Main.v_musers <> "" Then
										If Main.v_mpwds <> "" Then
											Dim vGetParameter7 As String = servletRequestWrapper.GetParameter("username")
											Dim vGetParameter8 As String = servletRequestWrapper.GetParameter("password")
											If vGetParameter7 = Main.v_musers Then
												If vGetParameter8 = Main.v_mpwds Then
													Dim vNumberToString As String = mod1.Sub058
													vMap1.Put(vNumberToString, vMap1.Size)
													Dim replace2 As String = (File.GetText(File.DirAssets, "HeadStampe") & File.GetText(File.DirAssets, "FootStampe")).Replace("%FILTRO%", "Selezionare una stampa dall'elenco")
													sb = replace2.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", "").Replace("%TICK%", vNumberToString)
													servletResponseWrapper.SetContentType("text/html")
													servletResponseWrapper.SendString(sb)
												End If
											End If
											Dim vGetText3 As String = File.GetText(File.DirAssets, "Login.htm")
											sb = "<DIV align=center><B><font size='6' color='red'>Nome utente o Password non corretti ...</font></B></DIV>" & vGetText3.Replace("%NOMENEGOZIO%", Main.v_mdesmittente)
											servletResponseWrapper.SetContentType("text/html")
											servletResponseWrapper.SendString(sb)
										End If
									End If
									Dim vGetText4 As String = File.GetText(File.DirAssets, "Login.htm")
									sb = "<DIV align=center><B><font size='6' color='red'>Configurare UserName e Password per attivare il sistema ...</font></B></DIV>" & vGetText4.Replace("%NOMENEGOZIO%", Main.v_mdesmittente)
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(sb)
								Case "RepartiStorici"
									Dim vTmp___ As String = Sub008(servletRequestWrapper, True)
									If vTmp___ = "" Then
										vTmp___ = Sub045(servletRequestWrapper, vTmp___, vSplit(0), "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(" & vStr8 & ") Is Null Then 0 Else sum(" & vStr8 & ") End  from Venduto where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg'")
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp___)
								Case "ArticoliStorici"
									Dim vTmp____ As String = Sub008(servletRequestWrapper, True)
									If vTmp____ = "" Then
										vTmp____ = Sub045(servletRequestWrapper, vTmp____, vSplit(0), "Select  case when sum(importo+importo2) Is Null Then 0 Else sum(importo+importo2) End  from Venduto where sospeso =0 and brep = 0", "Select  case when sum(qta) Is Null Then 0 Else sum(qta) End  from Venduto where sospeso =0 And brep = 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "And lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' " & CRLF & " " & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "And lower(substr(venduto.codice,1,2))<>'vv' ")
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp____)
								Case "IvaStorici"
									Dim vTmp_____ As String = Sub008(servletRequestWrapper, True)
									If vTmp_____ = "" Then
										vTmp_____ = Sub045(servletRequestWrapper, vTmp_____, vSplit(0), "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(" & vStr8 & ") Is Null Then 0 Else sum(" & vStr8 & ") End  from Venduto where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg'")
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp_____)
								Case "PagamentiStorici"
									Dim vTmp______ As String = Sub008(servletRequestWrapper, True)
									If vTmp______ = "" Then
										vTmp______ = Sub045(servletRequestWrapper, vTmp______, vSplit(0), "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from CausaliPagamenti where sospeso =0 ", "Select  case when sum(qta) Is Null Then 0 Else sum(qta) End  from CausaliPagamenti where sospeso =0 ")
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp______)
								Case "ClientiStorici"
									Dim vTmp_______ As String = Sub008(servletRequestWrapper, True)
									If vTmp_______ = "" Then
										vTmp_______ = Sub045(servletRequestWrapper, vTmp_______, vSplit(0), "Select  case when sum(totale) Is Null Then 0 Else sum(totale) End  from headmov where sospeso =0 ", "Select  count(*)  from headmov where sospeso =0 ")
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp_______)
								Case "OperatoriStorici"
									Dim vTmp________ As String = Sub008(servletRequestWrapper, True)
									If vTmp________ = "" Then
										vTmp________ = Sub045(servletRequestWrapper, vTmp________, vSplit(0), "Select  case when sum(totale) Is Null Then 0 Else sum(totale) End  from headmov where sospeso =0 ", "Select  count(*)  from headmov where sospeso =0 ")
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp________)
								Case "RepartiOggi"
									Dim vTmp_________ As String = Sub008(servletRequestWrapper, False)
									If vTmp_________ = "" Then
										Dim replace3 As String = dbutil.Sub005(Main.vSql1, "Select  reparto as Codice,max(reparti.descrizione) as descrizione,sum(" & vStr8 & ") As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join reparti on reparti.codice = venduto.reparto  where sospeso =0 and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg' group by reparto order by reparto ", Null, 0, False, 3, 4, -1, "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(" & vStr8 & ") Is Null Then 0 Else sum(" & vStr8 & ") End  from Venduto where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg'").Replace("%FILTRO%", "")
										vTmp_________ = replace3.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", vSplit(0)).Replace("%TICK%", vStr1)
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp_________)
								Case "ArticoliOggi"
									Dim vTmp__________ As String = Sub008(servletRequestWrapper, False)
									If vTmp__________ = "" Then
										Dim replace4 As String = dbutil.Sub005(Main.vSql1, "Select  codint as Codice,descrizione,sum(qta) As Qta,sum(importo+importo2) as Importo ," & TAB & "sum(prezzov*qta) - sum(importo) As Sconto  from Venduto where sospeso =0 And brep = 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "And lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' " & CRLF & " " & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "And lower(substr(venduto.codice,1,2))<>'vv'  group by codint,descrizione order by Qta desc limit 1000 ", Null, 0, False, 3, 4, -1, "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(qta) Is Null Then 0 Else sum(qta) End  from Venduto where sospeso =0 And brep = 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "And lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' " & CRLF & " " & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "And lower(substr(venduto.codice,1,2))<>'vv' ").Replace("%FILTRO%", "")
										vTmp__________ = replace4.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", "Articoli più venduti (Massimo 1000 righe)").Replace("%TICK%", vStr1)
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp__________)
								Case "IvaOggi"
									Dim vTmp___________ As String = Sub008(servletRequestWrapper, False)
									If vTmp___________ = "" Then
										Dim replace5 As String = dbutil.Sub005(Main.vSql1, "Select  iva as Codice,max(iva.descrizione) as descrizione,sum(" & vStr8 & ") As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join iva on iva.codice = venduto.iva  where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' group by iva order by iva ", Null, 0, False, 3, 4, -1, "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from Venduto where sospeso =0 ", "Select  case when sum(" & vStr8 & ") Is Null Then 0 Else sum(" & vStr8 & ") End  from Venduto where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg'").Replace("%FILTRO%", "")
										vTmp___________ = replace5.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", vSplit(0)).Replace("%TICK%", vStr1)
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp___________)
								Case "PagamentiOggi"
									Dim vTmp____________ As String = Sub008(servletRequestWrapper, False)
									If vTmp____________ = "" Then
										Dim replace6 As String = dbutil.Sub005(Main.vSql1, "Select  Codice,max(descrizione) as descrizione,sum(qta) As Qta,sum(importo) as Importo  from CausaliPagamenti  where sospeso =0  group by codice order by codice", Null, 0, False, 3, 4, -1, "Select  case when sum(importo) Is Null Then 0 Else sum(importo) End  from CausaliPagamenti where sospeso =0 ", "Select  case when sum(qta) Is Null Then 0 Else sum(qta) End  from CausaliPagamenti where sospeso =0 ").Replace("%FILTRO%", "")
										vTmp____________ = replace6.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", vSplit(0)).Replace("%TICK%", vStr1)
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp____________)
								Case "ClientiOggi"
									Dim vTmp_____________ As String = Sub008(servletRequestWrapper, False)
									If vTmp_____________ = "" Then
										Dim replace7 As String = dbutil.Sub005(Main.vSql1, "Select  cliente as Codice,max(clides) as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov  where sospeso =0  group by codice order by codice ", Null, 0, False, 3, 4, -1, "Select  case when sum(totale) Is Null Then 0 Else sum(totale) End  from headmov where sospeso =0 ", "Select  count(*)  from headmov where sospeso =0 ").Replace("%FILTRO%", "")
										vTmp_____________ = replace7.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", vSplit(0)).Replace("%TICK%", vStr1)
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp_____________)
								Case "OperatoriOggi"
									Dim vTmp______________ As String = Sub008(servletRequestWrapper, False)
									If vTmp______________ = "" Then
										Dim replace8 As String = dbutil.Sub005(Main.vSql1, "Select  operatore as Codice,opdes as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov  where sospeso =0  group by codice,opdes order by codice ", Null, 0, False, 3, 4, -1, "Select  case when sum(totale) Is Null Then 0 Else sum(totale) End  from headmov where sospeso =0 ", "Select  count(*)  from headmov where sospeso =0 ").Replace("%FILTRO%", "")
										vTmp______________ = replace8.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", vSplit(0)).Replace("%TICK%", vStr1)
									End If
									servletResponseWrapper.SetContentType("text/html")
									servletResponseWrapper.SendString(vTmp______________)
								Case "favicon.ico"
									servletResponseWrapper.SendString("")
								Case "phone"
									servletResponseWrapper.SendString("ok")
									If mod1.vStr1 = "Main" Then
										CallSub3("Main", "GestisciTelefonata", vSplit(1), True)
									Else
										mod1.Sub013(vSplit(1), True)
									End If
								Case Else
									If IsNumber(vSplit(0)) Then
										servletResponseWrapper.SendString(Sub038(vSplit(0), vSplit(1), vSplit(2)))
									Else
										servletResponseWrapper.SendString("Errore ")
									End If
							End Select
							mod1.Sub217(LastException.Message)
							servletResponseWrapper.Status = 500
							servletResponseWrapper.SendString("Errore: " & LastException)
							vSemaphore1.Unlock
							Return
						End If
						vSemaphore1.Unlock
						Return
					End If
				End If
				z2 = False
				If Not(z2) Then
				End If
				vSemaphore1.Unlock
				Return
			End If
		End If
	End If
	z = False
	If z Then
	End If
	z2 = False
	If Not(z2) Then
	End If
	vSemaphore1.Unlock
End Sub

Sub Service_Create
	Server.Initialize("Server")
	Server.Start(vInt1)
	vMap1.Initialize
	Dim notificationWrapper As Notification
	notificationWrapper.Initialize
	notificationWrapper.Icon = "icon"
	Dim vObjectToCharSequence As Object = "Http Server in esecuzione"
	Dim vObjectToCharSequence2 As Object = ""
	notificationWrapper.SetInfoNew(vObjectToCharSequence, vObjectToCharSequence2, Main)
	vMap2.Initialize
	Service.StartForeground(1, notificationWrapper)
	vSemaphore1.Initialize(True)
	If Not(Main.vBln25) Then
		vUDPSocket1.Initialize("udpCallerID", 3520, 8000)
	End If
	v7.Initialize("Timer1", 15000)
	v7.Enabled = True
	vTmr1.Initialize("TimerUpdStatoTavoli", 50000)
	vTmr1.Enabled = True
	vTmr2.Initialize("TimerScontrinoAuto", 1000)
	vTmr2.Enabled = False
	vStr9 = mod1.Sub221(File.ReadString(File.DirAssets, "01-01-StrutturaRicevuta.txt"), "nf0èc2m3c3f xc")
End Sub

Sub Service_Destroy
End Sub

Sub Service_Start(intentWrapper As Intent)
End Sub

Sub service_taskremoved
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo _spostatavolo (riga 4634).
Sub spostatavolo(str As String, str2 As String, str3 As String) As String
	Dim z As Boolean
	Dim z2 As Boolean
	Dim str4 As String
	Try
		If modfunstr.Sub006(str3) < 10000 Then
			If Main.vBln24 Then
				z = True
				If modfunstr.Sub006(str3) > 10000 Then
					If Main.vBln24 Then
						z2 = True
						If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & str2) = 0 Then
							Return "TAVOLO NON TROVATO"
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where lock=0 and inmodifica=0 and tavolo = " & str2) = 0 Then
							Return "TAVOLO BLOCCATO"
						End If
						If Not(z) Then
							If File.Exists(Main.vStr7 & "/" & str3.Trim, "venduto.csv") Then
								Return "TAVOLO NON ANCORA ELABORATO DAL SERVER"
							End If
						End If
						If str2 = 0 Then
							Return "TAVOLO NON VALIDO"
						End If
						If Not(Main.vSql1.ExecQuerySingleResult("Select count(*) from tavoli where tavolo = " & str2 & " and inmodifica =0 and lock=0") = 0) Then
							If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from pagine where pagina >=10 and pagina <100 and tipo = " & Main.t_tavolo & " and  valore = " & str2) = 0) Then
								Dim parseDouble As Long = Main.vSql1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " & str)
								Dim parseDouble2 As Long = Main.vSql1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " & str2)
								If parseDouble > 0 And parseDouble2 > 0 Then
									Dim cursorWrapper As Cursor
									Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select qtacondecimali,totcre,chiave from venduto where nmov = " & parseDouble)
									If cursorWrapper2.RowCount > 0 Then
										Dim parseDouble3 As Long = str * 10000
										Dim rowCount As Int = cursorWrapper2.RowCount - 1
										Dim i As Int
										For i = 0 To rowCount
											cursorWrapper2.Position = i
											Try
												Dim vGetInt As Int = cursorWrapper2.GetInt("totcre") + parseDouble3
												Main.vSql1.ExecNonQuery("update venduto set qtacondecimali= " & vGetInt & ",totcre='" & vGetInt & "' where chiave=" & cursorWrapper2.GetLong("chiave"))
											Catch
												mod1.Sub217(LastException.Message)
											End Try
										Next
									End If
									cursorWrapper2.Close
									Main.vSql1.ExecNonQuery("update venduto set nmov =  " & parseDouble & " where nmov = " & parseDouble2)
									Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select sum(importo) from venduto where nmov = " & parseDouble)
									Main.vSql1.ExecNonQuery("update tavoli set importo = " & vExecQuerySingleResult & " where tavolo = " & str)
									Main.vSql1.ExecNonQuery("delete from headmov where nmov = " & parseDouble2)
								End If
								Dim cursorWrapper3 As Cursor
								Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from tavoli where tavolo = " & str)
								cursorWrapper4.Position = 0
								Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " & cursorWrapper4.GetString("rifheadmov"))
								Main.vSql1.ExecNonQuery("update tavoli set uscita=" & cursorWrapper4.GetString("uscita") & ",stampap=" & cursorWrapper4.GetString("stampap") & ",ricconto=" & cursorWrapper4.GetString("ricconto") & ",rifheadmov=" & cursorWrapper4.GetString("rifheadmov") & ",coperti=" & vExecQuerySingleResult2 & ",addturni=" & cursorWrapper4.GetString("addturni") & ",importo = " & cursorWrapper4.GetString("importo").Replace(",", ".") & ",unlocktable = " & cursorWrapper4.GetString("unlocktable") & " where tavolo = " & str2)
								Main.vSql1.ExecNonQuery("update tavoli set timein=(select timein from tavoli where tavolo = " & str & ") where tavolo = " & str2)
								Main.vSql1.ExecNonQuery("update tavoli set timelast=(select timelast from tavoli where tavolo = " & str & ") where tavolo = " & str2)
								Main.vSql1.ExecNonQuery("update tavoli set tPWD=random(),uscita=0,rifheadmov=0,coperti=0,addturni=0,importo =0,unlocktable = 0,ricconto=0,stampap=0 where tavolo = " & str)
								Dim z3 As Boolean = False
								If Main.vBln24 Then
									If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where unlocktable =" & str) > 0 Then
										Dim cursorWrapper5 As Cursor
										Dim cursorWrapper6 As Cursor = Main.vSql1.ExecQuery("select tavolo from tavoli where unlocktable =" & str)
										Dim list As List
										list.Initialize
										Dim rowCount2 As Int = cursorWrapper6.RowCount - 1
										Dim i2 As Int
										For i2 = 0 To rowCount2
											cursorWrapper6.Position = i2
											list.Add(cursorWrapper6.GetInt("tavolo"))
										Next
										list.Add(str)
										list.Add(str2)
										Main.vSql1.ExecNonQuery("update tavoli set unlocktable=" & str2 & " where unlocktable = " & str)
										Dim iArr(list.Size) As Int
										Dim size As Int = list.Size - 1
										Dim i3 As Int
										For i3 = 0 To size
											iArr(i3) = list.Get(i3)
										Next
										If z Then
											str4 = str3
										Else
											str4 = Main.v_numcassa
										End If
										Dim vObjectToString As String = str4
										CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr, vObjectToString)
										z3 = True
									Else If z Then
										Dim iArr2() As Int = Array(str, str2)
										CallSub3(httpclient, "SendVariazioneTavoloAiClient", iArr2, str3)
									Else If z2 Then
										Dim iArr3() As Int = Array(str, str2)
										Dim object As Class = httpclient
										CallSub3(object, "SendVariazioneTavoloAiClient", iArr3, Main.v_numcassa)
									End If
								Else
									Main.vSql1.ExecNonQuery("update tavoli set unlocktable = " & str2 & " where unlocktable = " & str)
								End If
								If Main.vInt30 >= 10 Then
								End If
							End If
						End If
						Return "TAVOLO NON DISPONIBILE"
					End If
				End If
				z2 = False
				If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & str2) = 0 Then
				End If
			End If
		End If
		z = False
		If modfunstr.Sub006(str3) > 10000 Then
		End If
		z2 = False
		If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & str2) = 0 Then
		End If
	Catch
		mod1.Sub217(LastException.Message)
		Return ""
	End Try
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub StampaRiepilogoGestioneGlory(stringainventario As String)
	Dim limit12 As Int
	Dim limit25 As Int
	Dim limit40 As Int
	Dim limit48 As Int
	Dim limit64 As Int
	Dim limit85 As Int
	Dim step12 As Int
	Dim step25 As Int
	Dim step40 As Int
	Dim step48 As Int
	Dim step64 As Int
	Dim step85 As Int
	Dim nomesub As String
	Dim inventaridispositivi As Map
	Dim inventaritemp() As String
	Dim dispositivotemp() As String
	Dim i As Int
	Dim qtatotale As Int
	Dim totalegenerale As Double
	Dim strutturainventario As Map
	Dim numerodispositivo As Int
	Dim strutturainventariostacker As Map
	Dim msg() As String
	Dim msg2() As String
	Dim msg3() As String
	Dim msg4() As String
	Dim stotale As Double
	Dim x As Int
	Dim sfield() As String
	Dim sdes As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					nomesub = "StampaRiepilogoGestioneGlory"
					Continue
				Case 1
					rsState = 78
					rsCatchState = 77
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 77
					'inventaridispositivi = Map
					Dim inventaritemp(0) As String
					Dim dispositivotemp(0) As String
					inventaritemp = Regex.Split("@_@_SeparatoreInventario_@_@", stringainventario.Trim)
					Continue
				Case 4
					rsState = 9
					If inventaritemp.Length > 0 Then
						rsState = 6
						Continue
					Else
						rsState = 8
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 9
					inventaridispositivi.Initialize
					Continue
				Case 8
					rsState = 9
					Return
				Case 9
					rsState = 20
					step12 = 1
					limit12 = inventaritemp.Length - 1
					i = 0
					rsState = 79
					Continue
				Case 11
					rsState = 12
					dispositivotemp = Regex.Split("@_@_NDISPOSITIVO_@_@", inventaritemp(i))
					Continue
				Case 12
					rsState = 19
					If dispositivotemp.Length <> 2 Then
						Continue
					Else
						rsState = 14
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 14
				Case 14
					rsState = 15
					Continue
				Case 15
					rsState = 18
					If dispositivotemp(0).Trim <> "" And dispositivotemp(1).Trim <> "" Then
						rsState = 17
						Continue
					End If
					Continue
				Case 17
					rsState = 18
					inventaridispositivi.Put(dispositivotemp(0), dispositivotemp(1))
					Continue
				Case 18
					rsState = 19
					Continue
				Case 19
					rsState = 80
					Continue
				Case 20
					rsState = 75
					If inventaridispositivi.Size > 0 Then
						rsState = 22
						Continue
					Else
						rsState = 74
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 22
				Case 22
					rsState = 23
					Continue
				Case 23
					rsState = 26
					If Not(IsPaused(Main)) Then
						Continue
					Else
						rsState = 25
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 25
				Case 25
					rsState = 23
					Sleep(1000)
					rsState = 81
					Continue
				Case 26
					rsState = 27
					Sleep(1000)
					rsState = 82
					Continue
				Case 27
					rsState = 72
					step25 = 1
					limit25 = inventaridispositivi.Size - 1
					i = 0
					rsState = 83
					Continue
				Case 29
					rsState = 30
					qtatotale = 0
					totalegenerale = 0
					'strutturainventario = Map
					strutturainventario.Initialize
					numerodispositivo = 0
					'strutturainventariostacker = Map
					strutturainventariostacker.Initialize
					Dim msg(0) As String
					Dim msg2(0) As String
					Dim msg3(0) As String
					Dim msg4(0) As String
					msg3 = Regex.Split("@_@_SEPARATORE_@_@", inventaridispositivi.GetValueAt(i))
					numerodispositivo = inventaridispositivi.GetKeyAt(i)
					msg = Regex.Split(",", msg3(0))
					Continue
				Case 30
					rsState = 37
					step40 = 1
					limit40 = msg.Length - 1
					i = 0
					rsState = 85
					Continue
				Case 32
					rsState = 33
					Continue
				Case 33
					rsState = 36
					If msg(i).Trim <> "" Then
						rsState = 35
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 35
				Case 35
					rsState = 36
					msg2 = Regex.Split("_", msg(i))
					strutturainventario.Put(msg2(0), msg2)
					Continue
				Case 36
					rsState = 86
					Continue
				Case 37
					rsState = 48
					If msg3.Length <= 1 Then
						Continue
					Else
						rsState = 39
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 39
				Case 39
					rsState = 40
					msg4 = Regex.Split(",", msg3(1))
					Continue
				Case 40
					rsState = 47
					step48 = 1
					limit48 = msg4.Length - 1
					i = 0
					rsState = 87
					Continue
				Case 42
					rsState = 43
					Continue
				Case 43
					rsState = 46
					If msg4(i).Trim <> "" Then
						rsState = 45
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 45
				Case 45
					rsState = 46
					msg2 = Regex.Split("_", msg4(i))
					strutturainventariostacker.Put(msg2(0), msg2)
					Continue
				Case 46
					rsState = 88
					Continue
				Case 47
					rsState = 48
					Continue
				Case 48
					rsState = 71
					If strutturainventario.Size <> 0 Or strutturainventariostacker.Size <> 0 Then
						rsState = 50
						Continue
					Else
						Continue
					End If
					Continue
				Case 50
					rsState = 51
					Main.vccefdll1.nf_apri(Main.v_intestanf)
					Main.vccefdll1.nf_testo("Riepilogo Operazioni CM(ID: " & numerodispositivo & "):", 4)
					Main.vccefdll1.nf_testo(" ", 1)
					Continue
				Case 51
					rsState = 60
					If strutturainventario.Size <> 0 Then
						rsState = 53
						Continue
					Else
						rsState = 59
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 53
				Case 53
					rsState = 54
					Main.vccefdll1.nf_testo("Riciclatori:", 2)
					Main.vccefdll1.nf_testo("Taglio      Qta    Importo", 1)
					Main.vccefdll1.nf_testo(" ", 1)
					stotale = 0
					Continue
				Case 54
					rsState = 57
					step64 = 1
					limit64 = strutturainventario.Size - 1
					x = 0
					rsState = 89
					Continue
				Case 56
					rsState = 90
					Dim sfield(4) As String
					sfield = strutturainventario.GetValueAt(x)
					sdes = "Euro " & NumberFormat2(sfield(0) / 100, 1, 2, 2, False)
					Main.vccefdll1.nf_testo(mod1.Sub140(sdes, 12, " ") & mod1.Sub139(sfield(3), 3, " ") & " " & mod1.Sub139(NumberFormat2(sfield(2), 1, 2, 2, False), 10, " "), 1)
					stotale = stotale + sfield(2)
					qtatotale = qtatotale + sfield(3)
					Continue
				Case 57
					rsState = 60
					Main.vccefdll1.nf_testo(" ", 1)
					Main.vccefdll1.nf_testo("TOT. Riciclatori" & mod1.Sub139(NumberFormat2(stotale, 1, 2, 2, False), 16, " "), 2)
					totalegenerale = stotale
					Continue
				Case 59
					rsState = 60
					Main.vccefdll1.nf_testo("TOT. Riciclatori" & mod1.Sub139(NumberFormat2(0, 1, 2, 2, False), 16, " "), 2)
					totalegenerale = 0
					Continue
				Case 60
					rsState = 61
					Main.vccefdll1.nf_testo(" ", 1)
					Continue
				Case 61
					rsState = 70
					If strutturainventariostacker.Size <> 0 Then
						rsState = 63
						Continue
					Else
						rsState = 69
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 63
				Case 63
					rsState = 64
					Main.vccefdll1.nf_testo("Stacker:", 2)
					Main.vccefdll1.nf_testo("Taglio      Qta    Importo", 1)
					Main.vccefdll1.nf_testo(" ", 1)
					stotale = 0
					Continue
				Case 64
					rsState = 67
					step85 = 1
					limit85 = strutturainventariostacker.Size - 1
					x = 0
					rsState = 91
					Continue
				Case 66
					rsState = 92
					Dim sfield(4) As String
					sfield = strutturainventariostacker.GetValueAt(x)
					sdes = "Euro " & NumberFormat2(sfield(0) / 100, 1, 2, 2, False)
					Main.vccefdll1.nf_testo(mod1.Sub140(sdes, 12, " ") & mod1.Sub139(sfield(3), 3, " ") & " " & mod1.Sub139(NumberFormat2(sfield(2), 1, 2, 2, False), 10, " "), 1)
					stotale = stotale + sfield(2)
					qtatotale = qtatotale + sfield(3)
					Continue
				Case 67
					rsState = 70
					Main.vccefdll1.nf_testo(" ", 1)
					Main.vccefdll1.nf_testo("TOT. Stacker    " & mod1.Sub139(NumberFormat2(stotale, 1, 2, 2, False), 16, " "), 2)
					totalegenerale = totalegenerale + stotale
					Main.vccefdll1.nf_testo("________________________________", 1)
					Main.vccefdll1.nf_testo("TOT. Generale   " & mod1.Sub139(NumberFormat2(totalegenerale, 1, 2, 2, False), 16, " "), 2)
					Continue
				Case 69
					rsState = 70
					Main.vccefdll1.nf_testo("TOT. Stacker    " & mod1.Sub139(NumberFormat2(0, 1, 2, 2, False), 16, " "), 2)
					Main.vccefdll1.nf_testo("________________________________", 1)
					Main.vccefdll1.nf_testo("TOT. Generale   " & mod1.Sub139(NumberFormat2(totalegenerale, 1, 2, 2, False), 16, " "), 2)
					Continue
				Case 70
					rsState = 71
					Main.vccefdll1.nf_testo(" ", 1)
					Main.vccefdll1.nf_chiudi
					Continue
				Case 71
					rsState = 84
					Continue
				Case 72
					rsState = 75
					Continue
				Case 74
					rsState = 75
					Return
				Case 75
					rsState = 78
					Continue
				Case 77
					rsState = 78
					rsCatchState = 0
					Log(nomesub & ": " & LastException.Message)
					mod1.Sub217(nomesub & ": " & LastException.Message)
					Continue
				Case 78
					rsState = -1
					rsCatchState = 0
					Continue
				Case 79
					rsState = 20
					If (step12 > 0 And i <= limit12) Or (step12 < 0 And i >= limit12) Then
						rsState = 11
						Continue
					End If
					Continue
				Case 80
					rsState = 79
					i = i + 0 + step12
					Continue
				Case 81
					rsState = 23
					Continue
				Case 82
					rsState = 27
					Continue
				Case 83
					rsState = 72
					If (step25 > 0 And i <= limit25) Or (step25 < 0 And i >= limit25) Then
						rsState = 29
						Continue
					End If
					Continue
				Case 84
					rsState = 83
					i = i + 0 + step25
					Continue
				Case 85
					rsState = 37
					If (step40 > 0 And i <= limit40) Or (step40 < 0 And i >= limit40) Then
						rsState = 32
						Continue
					End If
					Continue
				Case 86
					rsState = 85
					i = i + 0 + step40
					Continue
				Case 87
					rsState = 47
					If (step48 > 0 And i <= limit48) Or (step48 < 0 And i >= limit48) Then
						rsState = 42
						Continue
					End If
					Continue
				Case 88
					rsState = 87
					i = i + 0 + step48
					Continue
				Case 89
					rsState = 57
					If (step64 > 0 And x <= limit64) Or (step64 < 0 And x >= limit64) Then
						rsState = 56
						Continue
					End If
					Continue
				Case 90
					rsState = 89
					x = x + 0 + step64
					Continue
				Case 91
					rsState = 67
					If (step85 > 0 And x <= limit85) Or (step85 < 0 And x >= limit85) Then
						rsState = 66
						Continue
					End If
					Continue
				Case 92
					rsState = 91
					x = x + 0 + step85
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub Timer1_Tick
	mod1.vStr2 = "Sub Timer1_Tick"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Main.vBln25 Then
		If v7.Interval <> 92000 Then
			mod1.Sub180(True, True, False)
			v7.Interval = 92000
			Return
		End If
		CallSub(httpclient, "SendHelloDaClient")
		Return
	End If
	If v7.Interval = 92000 Then
		If Not(Main.v_verificastampanti) Then
			Return
		End If
	End If
	If v7.Interval <> 92000 Then
		v7.Interval = 92000
	End If
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from Palmari where Attivo = 1  order by Serial")
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			vStr6 = Main.vStr7 & "/" & cursorWrapper2.GetString("Serial")
			Sub044(vStr6 & "/VENDUTO", cursorWrapper2.GetString("Serial"), False, 0, 0)
		Next
	End If
	mod1.Sub180(True, True, False)
	cursorWrapper2.Close
End Sub

Sub Timerscontrinoauto_Tick
	vTmr2.Enabled = False
	If Main.vBln25 Then
		CallSub(Main, "StampaScontrinoDaServer")
		Return
	End If
	CallSub(Main, "StampaScontrinoAuto")
End Sub

Sub Timerupdstatotavoli_Tick
	vTmr1.Enabled = False
	If Main.vBln25 Then
		If Not(Main.vBln26) Then
			CallSub2(httpclient, "GetVariazioniTavoliDaClient", False)
			Return
		End If
	End If
End Sub

Sub Sub041(str As String) As String
	Dim i As Int = 12345
	Try
		If IsNumber(str) Then
			i = str
		End If
		Select i
			Case 0
				Return "OK"
			Case 1
				Return "Cash management" & CRLF & "Transazione annullata con successo"
			Case 2
				Return "Cash management" & CRLF & "Transazione completata a seguito di un reset macchina (valore possibile in caso di errori in fase di vendita)"
			Case 9
				Return "Cash management" & CRLF & "Impossibile restituire tutto il contante versato a seguito di annullo transazione"
			Case 10
				Return "Cash management" & CRLF & "Resto insufficiente"
			Case 11
				Return "Cash management" & CRLF & "Impossibile iniziare il pagamento"
			Case 12
				Return "Cash management" & CRLF & "Errore durante l’erogazione del resto"
			Case 99
				Return "Cash management" & CRLF & "Errore generico"
			Case 100
				Return "Cash management" & CRLF & "Errore macchina (inceppamento)"
			Case 1111
				Return "Cash management" & CRLF & "Errore di comunicazione con il dispositivo"
			Case 2222
				Return "Cash management" & CRLF & "Lo stacker risulta aperto oppure necessita di essere vuotato"
			Case 2223
				Return "Cash management" & CRLF & "Il cassetto è stato rimosso"
			Case 2224
				Return "Cash management" & CRLF & "Il cassetto è stato inserito"
			Case 3333
				Return "Cash management" & CRLF & "Il dispositivo risulta occupato"
			Case 4444
				Return "Cash management" & CRLF & "Registrazione del Cash Management non effettuata"
			Case 9000
				Return "Cash management" & CRLF & "Transazione annullata dal cliente"
			Case 9001
				Return "Cash management" & CRLF & "ATTENZIONE ... Livelli bassi di denaro"
			Case 9002
				Return "Cash management" & CRLF & "Errore Hardware"
			Case 9003
				Return "Cash management" & CRLF & "Il Driver risulta essere occupato"
			Case 9004
				Return "Cash management" & CRLF & "Il comando inviato non è corretto"
			Case 9005
				Return "Cash management" & CRLF & "Lo stato del Cash Management non è corretto"
			Case 9006, 9007
				Return "Cash management" & CRLF & "Errore generico"
			Case Else
				Return "Cash management" & CRLF & "Errore non riconosciuto"
		End Select
	Catch
		Log("TranslateErrCodeGlory: " & LastException.Message)
		Return "Cash management" & CRLF & "Errore non riconosciuto"
	End Try
End Sub

Sub Sub042 As String
	Dim vGetHour As Int = DateTime.GetHour(mod1.Sub058)
	Dim str As String = NumberFormat(vGetHour, 2, 0) & ":" & NumberFormat(DateTime.GetMinute(mod1.Sub058), 2, 0)
	Dim str2 As String = ""
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from oraasporto where descrizione >'" & str & "' order by descrizione")
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim str3 As String = ""
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			Dim str4 As String = cursorWrapper2.GetString("descrizione") & CRLF
			Dim cursorWrapper3 As Cursor
			Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select reparti.descrizione as Des,case when sum(qta) is null then 0 else sum(qta) end as Tot FROM [Venduto] inner join headmov on headmov.nmov = venduto.nmov inner join reparti on venduto.reparto = reparti.codice where headmov.sospeso =1 AND headmov.tavolo = 0 AND brep = 0 AND lower(substr(venduto.codint,1,3))<>'mnu' AND lower(substr(venduto.codint,1,3))<>'msg' AND lower(substr(venduto.codice,1,2))<>'vv' and lower(substr(venduto.codice,1,2))<>'ww' and substr(headmov.datam2,12,5) ='" & cursorWrapper2.GetString("descrizione") & "' group by reparti.descrizione")
			If cursorWrapper4.RowCount > 0 Then
				Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
				Dim i2 As Int = 0
				Do While i2 <= rowCount2
					cursorWrapper4.Position = i2
					i2 = i2 + 1
					str4 = str4 & "      Ordinati " & cursorWrapper4.GetString("Tot") & " articoli " & cursorWrapper4.GetString("Des") & CRLF
				Loop
			End If
			cursorWrapper4.Close
			str3 = str3 & str4 & TAB
		Next
		str2 = str3
	End If
	cursorWrapper2.Close
	Return str2
End Sub

Sub Sub043(str As String, i As Int, i2 As Int) As String
	Dim str2 As String
	Dim i3 As Int
	Dim str3 As String = "(reparti.codice =" & str & ")"
	If vStr3 = "Init" Then
		vStr3 = ""
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select codice from reparti where verificaWeb=1")
		If cursorWrapper2.RowCount > 0 Then
			vStr3 = "("
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i4 As Int
			For i4 = 0 To rowCount
				cursorWrapper2.Position = i4
				vStr3 = vStr3 & ("reparti.codice =" & cursorWrapper2.GetString("codice") & " or ")
			Next
			vStr3 = vStr3.SubString2(0, vStr3.Length - 4) & ")"
		End If
		cursorWrapper2.Close
	End If
	If vStr3 <> "" Then
		str3 = vStr3
	End If
	Dim vGetHour As Int = DateTime.GetHour(mod1.Sub058)
	Dim str4 As String = NumberFormat(vGetHour, 2, 0) & ":" & NumberFormat(DateTime.GetMinute(mod1.Sub058), 2, 0)
	Dim cursorWrapper3 As Cursor
	Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select * from oraasporto where descrizione >'" & str4 & "' order by descrizione")
	If cursorWrapper4.RowCount <= 0 Then
		str2 = "Orari" & CRLF
	Else
		Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
		Dim str5 As String = "Orari" & CRLF
		Dim i5 As Int
		For i5 = 0 To rowCount2
			cursorWrapper4.Position = i5
			Dim str6 As String = cursorWrapper4.GetString("descrizione") & "_OK" & CRLF
			If i <= 0 Or str = "-1" Then
				i3 = 0
			Else
				i3 = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as Tot FROM [Venduto] inner join headmov on headmov.nmov = venduto.nmov inner join reparti on venduto.reparto = reparti.codice where " & str3 & " And headmov.sospeso =1 And headmov.tavolo = 0 And brep = 0 And lower(substr(venduto.codint,1,3))<>'mnu' AND lower(substr(venduto.codint,1,3))<>'msg' AND lower(substr(venduto.codice,1,2))<>'vv' and lower(substr(venduto.codice,1,2))<>'ww' and substr(headmov.datam2,12,5) ='" & cursorWrapper4.GetString("descrizione") & "'")
			End If
			If i3 > i Then
				str6 = str6.Replace("_OK", "_NO")
			Else If i2 > 0 Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) as Tot FROM headmov where sospeso =1 AND tavolo = 0 and substr(datam2,12,5) ='" & cursorWrapper4.GetString("descrizione") & "'") > i2 Then
					str6 = str6.Replace("_OK", "_NO")
				End If
			End If
			str5 = str5 & str6
		Next
		str2 = str5
	End If
	cursorWrapper4.Close
	Return str2
End Sub

Sub Udpcallerid_PacketArrived(uDPPacket As UDPPacket)
	Try
		If uDPPacket.Length <> 83 Then
			CallSub2("Main", "RicercaBarcodeRemote", BytesToString(uDPPacket.Data, 0, uDPPacket.Length, "UTF8"))
		Else
			Sub010(BytesToString(uDPPacket.Data, uDPPacket.Offset + 21 + 32, 14, "UTF8").Trim)
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo _uniscitavolo (riga 5744).
Sub uniscitavolo(str As String, str2 As String, str3 As String) As String
	Dim z As Boolean
	Dim z2 As Boolean
	Try
		If modfunstr.Sub006(str3) < 10000 Then
			If Main.vBln24 Then
				z = True
				If modfunstr.Sub006(str3) > 10000 Then
					If Main.vBln24 Then
						z2 = True
						If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & str2) = 0 Then
							Return "TAVOLO NON TROVATO"
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where lock=0 and inmodifica=0 and tavolo = " & str2) = 0 Then
							Return "TAVOLO BLOCCATO"
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where manuallock=1 and tavolo = " & str2) > 0 Then
							Return "Impossibile unire con un tavolo che non viene azzerato in chiusura"
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where manuallock=1 and tavolo = " & str) > 0 Then
							Return "Impossibile unire quando uno dei tavoli non viene azzerato in chiusura"
						End If
						If Not(z) Then
							If File.Exists(Main.vStr7 & "/" & str3.Trim, "venduto.csv") Then
								Return "TAVOLO NON ANCORA ELABORATO DAL SERVER"
							End If
						End If
						If str2 = 0 Then
							Return "Errore"
						End If
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from tavoli where tavolo = " & str2 & " and inmodifica =0 and lock=0 ") = 0 Then
							Return "TAVOLO NON DISPONIBILE"
						End If
						If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where unlocktable =" & str) > 0 Then
							Return "A questo tavolo sono già legati altri tavoli." & CRLF & "Impossibile unirlo ad un altro"
						End If
						If str2 = str Then
							Return "Il tavolo di origine corrisponde a quello di destinazione"
						End If
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from pagine where pagina >=10  AND pagina <100 AND valore = " & str & " AND tipo = 9 limit 1") > 0 Then
							Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select pagina from pagine where pagina >=10  AND pagina <100 AND valore = " & str & " AND tipo = 9 limit 1")
							If Main.vSql1.ExecQuerySingleResult("select count(*) from pagine where pagina =" & parseDouble & " AND valore = " & str2 & " AND tipo = 9") = 0 Then
								Return "Il tavolo " & str2 & " non esiste in questa sala."
							End If
						End If
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from tavoli where tavolo = " & str2 & " and unlocktable=0 ") = 0 Then
							Return "Questo tavolo non può essere unito al tavolo " & str2
						End If
						Dim parseDouble2 As Int = Main.vSql1.ExecQuerySingleResult("Select unlocktable from  tavoli where tavolo = " & str)
						If parseDouble2 > 0 And parseDouble2 <> str2 Then
							Return "Risulta già essere unito al tavolo " & parseDouble2
						End If
						Dim cursorWrapper As Cursor
						Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from  tavoli where tavolo = " & str)
						cursorWrapper2.Position = 0
						If cursorWrapper2.GetInt("stampap") = 1 Or cursorWrapper2.GetInt("ricconto") = 1 Or cursorWrapper2.GetInt("lock") = 1 Or cursorWrapper2.GetInt("unlocktable") > 0 Or cursorWrapper2.GetInt("inmodifica") = 1 Then
							Return "Il tavolo non può essere unito."
						End If
						cursorWrapper2.Close
						Dim parseDouble3 As Long = Main.vSql1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " & str2)
						Dim parseDouble4 As Long = Main.vSql1.ExecQuerySingleResult("select rifheadmov from tavoli where tavolo = " & str)
						If parseDouble3 > 0 And parseDouble4 > 0 Then
							Dim cursorWrapper3 As Cursor
							Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select qtacondecimali,totcre,chiave from venduto where nmov = " & parseDouble3)
							If cursorWrapper4.RowCount > 0 Then
								Dim parseDouble5 As Long = str * 10000
								Dim rowCount As Int = cursorWrapper4.RowCount - 1
								Dim i As Int
								For i = 0 To rowCount
									cursorWrapper4.Position = i
									Try
										Dim vGetInt As Int = cursorWrapper4.GetInt("totcre") + parseDouble5
										Main.vSql1.ExecNonQuery("update venduto set qtacondecimali= " & vGetInt & ",totcre='" & vGetInt & "' where chiave=" & cursorWrapper4.GetLong("chiave"))
									Catch
										mod1.Sub217(LastException.Message)
									End Try
								Next
							End If
							cursorWrapper4.Close
							Main.vSql1.ExecNonQuery("update venduto set nmov =  " & parseDouble3 & " where nmov = " & parseDouble4)
							Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select sum(importo) from venduto where nmov = " & parseDouble3)
							Main.vSql1.ExecNonQuery("update tavoli set importo = " & vExecQuerySingleResult & " where tavolo = " & str2)
							Main.vSql1.ExecNonQuery("delete from headmov where nmov = " & parseDouble4)
						Else If parseDouble3 = 0 And parseDouble4 > 0 Then
							Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " & parseDouble4)
							Main.vSql1.ExecNonQuery("update tavoli set rifheadmov=" & parseDouble4 & ",coperti=" & vExecQuerySingleResult2 & ",addturni= " & mod1.Sub005(parseDouble4) & " where tavolo = " & str2)
						End If
						Main.vSql1.ExecNonQuery("update tavoli set tPWD=random(),unlocktable=" & str2 & " ,uscita=0,lock=1,rifheadmov=0,coperti=0,addturni=0,importo=0 where tavolo = " & str)
						If Main.vInt30 >= 10 Then
						End If
					End If
				End If
				z2 = False
				If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & str2) = 0 Then
				End If
			End If
		End If
		z = False
		If modfunstr.Sub006(str3) > 10000 Then
		End If
		z2 = False
		If Main.vSql1.ExecQuerySingleResult("select count(*) from tavoli where tavolo = " & str2) = 0 Then
		End If
	Catch
		mod1.Sub217(LastException.Message)
		Return ""
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m6… (riga 7009).
Sub Sub044(str As String, str2 As String, z As Boolean, i As Int, j As Long) As String
	Dim textReaderWrapper As TextReader
	Dim z2 As Boolean
	Dim list As List
	Dim list2 As List
	Dim z3 As Boolean
	Dim str3 As String
	Dim z4 As Boolean
	Dim str4 As String
	Dim i2 As Int
	Dim i3 As Int
	Dim z5 As Boolean
	Dim z6 As Boolean
	Dim j2 As Long
	Dim vSplit As String()
	Dim parseDouble As Int
	Dim parseDouble2 As Int
	Dim z7 As Boolean
	Dim i4 As Int
	Dim z8 As Boolean
	Dim i5 As Int
	Dim z9 As Boolean
	Dim j3 As Long
	Dim z10 As Boolean
	Dim vReadLine As String
	Dim equals As Boolean
	Dim str5 As String = ""
	Try
		Dim list3 As List
		list3.Initialize
		Dim map As Map
		If File.Exists(str & "/IMG", "Miotmp.png") Then
			Dim sb As String = "Messaggio dal terminale " & str2 & CRLF & " Inviato alle " & NumberFormat(DateTime.GetHour(mod1.Sub058), 2, 0) & ":" & NumberFormat(DateTime.GetMinute(mod1.Sub058), 2, 0)
			Sub007(str & "/IMG", "Miotmp.png")
			CallSub3("Main", "ShowMsgPalm", "Miotmp.png" & TAB & str & "/IMG", sb)
		End If
		Dim list4 As List
		list4.Initialize
		list4.AddAll(File.ListFiles(str))
		Dim size As Int = list4.Size - 1
		Dim i6 As Int = 0
		Do While True
			If i6 > size Then
				Exit
			End If
			str5 = list4.Get(i6)
			If str5.Contains("_") And str5.StartsWith("Vend") Then
				Dim vSplit2() As String = Regex.Split("_", str5)
				If Not(vMap2.ContainsKey(str2)) Then
					vMap2.Put(str2, vSplit2(1))
				Else
					If vMap2.Get(str2) = vSplit2(1) Then
						File.Delete(str, str5)
						Return str5
					End If
					vMap2.Put(str2, vSplit2(1))
				End If
			Else
				str5 = ""
				i6 = i6 + 1
			End If
		Loop
		If i2 > 0 Then
			i2 = i2 + 1
			z9 = False
			list.Add(j3)
			If parseDouble2 > 0 And parseDouble2 <> 90 Then
				If Main.v_attivaterminale Then
					If Main.vBln20 Then
						list2.Add(j3)
					End If
				End If
			End If
			vInt3 = vSplit(16)
			If vInt3 > 0 Then
				Dim d As Double = vInt3
			End If
			vInt3 = Main.Operatore
			i4 = parseDouble
			z8 = equals
			i5 = i2
			0
			map.Put(vSplit(4), 1)
			If vSplit(9).Trim <> str4 Then
				str4 = vSplit(9).Trim
			End If
			If z9 Then
				If Main.vSql1.ExecQuerySingleResult("select count(*) from Venduto where idRiga = '" & vSplit(4) & "'") > 0 Then
					Dim str6 As String = "tmpStampaPalm" & str2.SubString(3)
					If Main.v_regcancellazioni Then
						Dim parseDouble3 As Double = Main.vSql1.ExecQuerySingleResult("select case when qta is null then 0 else qta end from Venduto where idRiga = '" & vSplit(4) & "'")
						Dim vTmp As Int = parseDouble3 - modfunstr.Sub006(vSplit(2))
						If vTmp > 0 Then
							mod1.Sub146("Select codint,round(prezzov * " & vTmp & " ,2) as importo," & vTmp & " as qta,brep from venduto where idRiga = '" & vSplit(4) & "'", j3, vInt3, parseDouble)
						End If
					End If
					Dim str7 As String = " totcre ='" & vSplit(9) & "'"
					If vSplit(14) = 0 Then
						str7 = " totcre ='1234" & vSplit(9) & "'"
					End If
					Main.vSql1.ExecNonQuery("update " & str6 & " set " & str7 & " where idRiga = '" & vSplit(4) & "'")
					Dim str8 As String = ""
					If vSplit(24) > 0 Then
						Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select memo from Venduto  where idRiga = '" & vSplit(4) & "'")
						If vExecQuerySingleResult.Contains("(") Then
							str8 = ",memo='-Sottoconto " & vSplit(24) & vExecQuerySingleResult.SubString(vExecQuerySingleResult.LastIndexOf("(") - 1) & "'"
						Else
							str8 = ",memo='-Sottoconto " & vSplit(24) & "-' "
						End If
					End If
					Main.vSql1.ExecNonQuery("update Venduto set " & str7 & ",codice='" & vSplit(0) & "',descrizione='" & vSplit(1) & "',qta=" & vSplit(2) & " ,prezzov=" & vSplit(3) & ",importo=" & vSplit(7) & ",turno = " & vSplit(19) & ",sottoconto = " & vSplit(24) & ",sottocontoT = " & vSplit(25) & str8 & " where idRiga = '" & vSplit(4) & "'")
					z10 = True
				Else
					list3.Add(Sub002(vSplit, j3, str, i5, i = 1, 0, True))
					z10 = True
				End If
			Else
				list3.Add(Sub002(vSplit, j3, str, i5, i = 1, 0, True))
				z10 = True
			End If
			vReadLine = textReaderWrapper.ReadLine
			If Not(vReadLine = Null) Or vReadLine.Length < 3 Or Asc(vReadLine.SubString2(0, 1)) = 0 Then
				Sub046(j3, map, list3, z10, parseDouble, z9, str2, vSplit(15), parseDouble2, z3, vSplit(14) = 0, i)
				z4 = z7
				str3 = vReadLine
				i2 = i5
				i3 = i4
				z5 = z8
				z6 = z9
				j2 = j3
			Else
				Dim vSplit3() As String = Regex.Split(",", vReadLine)
				If vSplit3(10) <> parseDouble Then
					Sub046(j3, map, list3, z10, parseDouble, z9, str2, vSplit3(15), parseDouble2, z3, vSplit3(14) = 0, i)
					z4 = z7
					str3 = vReadLine
					i2 = i5
					i3 = i4
					z5 = z8
					z6 = z9
					j2 = j3
				Else
					z4 = z7
					str3 = vReadLine
					i2 = i5
					i3 = i4
					z5 = z8
					z6 = z9
					j2 = j3
				End If
			End If
		End If
		z9 = False
		list.Add(j3)
		If parseDouble2 > 0 Then
			If Main.v_attivaterminale Then
			End If
		End If
		vInt3 = vSplit(16)
		If vInt3 > 0 Then
		End If
		vInt3 = Main.Operatore
		i4 = parseDouble
		z8 = equals
		i5 = i2
		0
		map.Put(vSplit(4), 1)
		If vSplit(9).Trim <> str4 Then
		End If
		If z9 Then
		End If
		vReadLine = textReaderWrapper.ReadLine
		If Not(vReadLine = Null) Then
		End If
		Sub046(j3, map, list3, z10, parseDouble, z9, str2, vSplit(15), parseDouble2, z3, vSplit(14) = 0, i)
		z4 = z7
		str3 = vReadLine
		i2 = i5
		i3 = i4
		z5 = z8
		z6 = z9
		j2 = j3
		textReaderWrapper.Close
		File.Delete(str, str5)
		If z2 Then
			vTmr2.Enabled = True
			Return str5
		End If
		Return str5
	Catch
		If str5 <> "" Then
			File.Delete(str, "vend.csv")
			File.Delete(str, str5)
		End If
		mod1.Sub217(LastException.Message)
		Return "Err"
	End Try
End Sub

Sub Sub045(servletRequestWrapper As ServletRequest, str As String, str2 As String, str3 As String, str4 As String) As String
	Dim str5 As String = ""
	Dim str6 As String = ""
	Dim vGetParameter As String = servletRequestWrapper.GetParameter("dadata")
	Dim vGetParameter2 As String = servletRequestWrapper.GetParameter("adata")
	Dim vGetParameter3 As String = servletRequestWrapper.GetParameter("reparto")
	Dim vGetParameter4 As String = servletRequestWrapper.GetParameter("movimento")
	Dim vGetParameter5 As String = servletRequestWrapper.GetParameter("documento")
	Dim vGetParameter6 As String = servletRequestWrapper.GetParameter("articolo")
	Dim vGetParameter7 As String = servletRequestWrapper.GetParameter("cliente")
	Dim vGetParameter8 As String = servletRequestWrapper.GetParameter("operatore")
	If vGetParameter.Length = 10 And vGetParameter2.Length = 10 Then
		str5 = "datam3 > '" & vGetParameter.SubString2(6, 10) & "-" & vGetParameter.SubString2(3, 5) & "-" & vGetParameter.SubString2(0, 2) & " 00:00:00' and datam3 < '" & vGetParameter2.SubString2(6, 10) & "-" & vGetParameter2.SubString2(3, 5) & "-" & vGetParameter2.SubString2(0, 2) & " 23:59:59' and "
		str6 = " Data compresa tra " & vGetParameter & " e " & vGetParameter2 & " - "
	End If
	If (str2 = "RepartiStorici" Or str2 = "ArticoliStorici" Or str2 = "IvaStorici") And vGetParameter3.Length > 0 And vGetParameter3.Length < 3 And IsNumber(vGetParameter3) Then
		str5 = str5 & "reparto =" & vGetParameter3 & " and "
		str6 = str6 & " reparto = " & vGetParameter3 & " - "
	End If
	If (str2 = "RepartiStorici" Or str2 = "ArticoliStorici" Or str2 = "IvaStorici" Or str2 = "PagamentiStorici" Or str2 = "ClientiStorici" Or str2 = "OperatoriStorici") And vGetParameter4.Length > 0 And vGetParameter4.Length < 10 And IsNumber(vGetParameter4) Then
		str5 = str5 & "nmov =" & vGetParameter4 & " and "
		str6 = str6 & " Movimento num. " & vGetParameter4 & " - "
	End If
	If str2 = "RepartiStorici" Or str2 = "ArticoliStorici" Or str2 = "IvaStorici" Or str2 = "ClientiStorici" Or str2 = "OperatoriStorici" Then
		str5 = str5 & " causale ='sc' and "
		If vGetParameter5.Length = 1 Then
			If vGetParameter5 = "S" Then
				str5 = str5 & "venduto.flgNF =0 and nfat =0 and nric =0 and "
				str6 = str6 & " Documenti = Scontrini - "
			End If
			If vGetParameter5 = "F" Then
				str5 = str5 & "  nfat >0 and "
				str6 = str6 & " Documenti = Fatture - "
			End If
			If vGetParameter5 = "N" Then
				str5 = str5 & "venduto.flgNF =1 and nfat =0 and nric =0 and "
				str6 = str6 & " Documenti = Altro - "
			End If
			If vGetParameter5 = "R" Then
				str5 = str5 & " nric >0 AND "
				str6 = str6 & " Documenti = Ricevute - "
			End If
			If vGetParameter5 = "B" Then
				str5 = str5 & "not(venduto.flgNF =1 and nfat =0 and nric =0) and "
				str6 = str6 & " Documenti = Scontrino,Fattura,Ricevuta - "
			End If
		End If
	End If
	If (str2 = "RepartiStorici" Or str2 = "ArticoliStorici" Or str2 = "IvaStorici") And vGetParameter6.Length > 0 And vGetParameter6.Length <= 20 Then
		str5 = str5 & "venduto.codint =" & vGetParameter6 & " and "
		str6 = str6 & " Codice Articolo = " & vGetParameter6 & " - "
	End If
	If (str2 = "RepartiStorici" Or str2 = "ArticoliStorici" Or str2 = "IvaStorici" Or str2 = "ClientiStorici" Or str2 = "OperatoriStorici") And vGetParameter7.Length > 0 And vGetParameter7.Length <= 20 And IsNumber(vGetParameter7) Then
		str5 = str5 & "venduto.cliente =" & vGetParameter7 & " and "
		str6 = str6 & " Codice cliente = " & vGetParameter7 & " - "
	End If
	If (str2 = "RepartiStorici" Or str2 = "ArticoliStorici" Or str2 = "IvaStorici") And vGetParameter8.Length > 0 And vGetParameter7.Length <= 2 And IsNumber(vGetParameter8) Then
		str5 = str5 & "(Select count(*) from headmov where headmov.nmov = venduto.nmov AND Operatore =" & vGetParameter8 & ") >0 AND "
		str6 = str6 & " Operatore = " & vGetParameter8 & " - "
	End If
	If str5.Length > 4 Then
		Dim substring As String = str5.SubString2(0, str5.Length - 4)
		Dim substring2 As String = str6.SubString2(0, str6.Length - 3)
		If substring = "" Then
			Return str & "<DIV align=center><B><font size='6' color='red'> è necessario passare un filtro a questa stampa ...</font></B></DIV>"
		End If
		Try
			Select str2
				Case "RepartiStorici"
					str = str & dbutil.Sub005(Main.vSql2, "Select  reparto as Codice,max(reparti.descrizione) as descrizione,sum(" & vStr8 & ") As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join reparti on reparti.codice = venduto.reparto  where sospeso =0 and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg' and " & substring & " group by reparto order by reparto ", Null, 0, False, 3, 4, -1, str3 & " and " & substring, str4 & " and " & substring)
				Case "ArticoliStorici"
					str = str & dbutil.Sub005(Main.vSql2, "Select codint as Codice,descrizione,sum(qta) As qta,sum(importo+importo2) as importo,sum(prezzov*qta) - sum(importo) as sconto from Venduto  where sospeso =0 and brep = 0  and lower(substr(venduto.codint,1,3))<>'mnu' and lower(substr(venduto.codint,1,3))<>'msg' And lower(substr(venduto.codice,1,2))<>'vv' and " & substring & "  group by codint,descrizione order by Qta desc limit 1000 ", Null, 0, False, 3, 4, -1, str3 & " and " & substring, str4 & " and " & substring)
				Case "IvaStorici"
					str = str & dbutil.Sub005(Main.vSql2, "Select  iva as Codice,max(iva.descrizione) as descrizione,sum(" & vStr8 & ") As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join iva on iva.codice = venduto.iva  where sospeso =0  and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' and " & substring & "  group by iva order by iva ", Null, 0, False, 3, 4, -1, str3 & " and " & substring, str4 & " and " & substring)
				Case "PagamentiStorici"
					str = str & dbutil.Sub005(Main.vSql2, "Select  Codice,max(descrizione) as descrizione,sum(qta) As Qta,sum(importo) as Importo  from CausaliPagamenti  where sospeso =0  and " & substring & "   group by codice order by codice", Null, 0, False, 3, 4, -1, str3 & " and " & substring, str4 & " and " & substring)
				Case "ClientiStorici"
					Dim replace As String = substring.Replace("venduto.", "headmov.")
					str = str & dbutil.Sub005(Main.vSql2, "Select  cliente as Codice,max(clides) as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov  where sospeso =0  and " & replace & "   group by codice order by codice ", Null, 0, False, 3, 4, -1, str3 & " and " & replace, str4 & " and " & replace)
				Case "OperatoriStorici"
					Dim replace2 As String = substring.Replace("venduto.", "headmov.")
					str = str & dbutil.Sub005(Main.vSql2, "Select  operatore as Codice,opdes as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov  where sospeso =0   and " & replace2 & " group by codice,opdes order by codice ", Null, 0, False, 3, 4, -1, str3 & " and " & replace2, str4 & " and " & replace2)
			End Select
			Dim sb As String = str & File.GetText(File.DirAssets, "FootStampe")
			If str2 = "ArticoliStorici" Then
				Dim replace3 As String = sb.Replace("%FILTRO%", substring2)
				Return replace3.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", "Articoli Storici più venduti (massimo 1000 righe)").Replace("%TICK%", vStr1)
			End If
			Dim replace4 As String = sb.Replace("%FILTRO%", substring2)
			Return replace4.Replace("%NOMENEGOZIO%", Main.v_mdesmittente).Replace("%NOMERAPPORTO%", str2).Replace("%TICK%", vStr1)
		Catch
			mod1.Sub217(LastException.Message)
			Return str
		End Try
	End If
	Return str & "<DIV align=center><B><font size='6' color='red'>E' necessairo applicare almeno un filtro ...</font></B></DIV>"
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/starter.java, metodo m0… (riga 7432).
Sub Sub046(j As Long, map As Map, list As List, z As Boolean, i As Int, z2 As Boolean, str As String, i2 As Int, i3 As Int, z3 As Boolean, z4 As Boolean, i4 As Int)
	Dim z5 As Boolean
	Dim str2 As String
	Try
		If i <> 10000 And i4 = 0 Then
			If Not(z4) Then
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select idRiga,qta from Venduto where nmov = " & j)
				If cursorWrapper2.RowCount > 0 Then
					Dim rowCount As Int = cursorWrapper2.RowCount - 1
					Dim i5 As Int
					For i5 = 0 To rowCount
						cursorWrapper2.Position = i5
						If Not(map.ContainsKey(cursorWrapper2.GetString("idRiga"))) Or cursorWrapper2.GetDouble("qta") = 0 Then
							If z3 And list.Size = 0 Then
								Main.vSql1.ExecNonQuery("update venduto set qta =0 where idRiga = '" & cursorWrapper2.GetString("idRiga") & "'")
							Else
								Main.vSql1.ExecNonQuery("delete from venduto where idRiga = '" & cursorWrapper2.GetString("idRiga") & "'")
							End If
						End If
					Next
				End If
				cursorWrapper2.Close
			Else
				Dim str3 As String = i & "_" & j & "_" & str
				mod1.Sub089(True, str3)
			End If
			Main.vSql1.ExecNonQuery("update tavoli set timelast ='" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "',inmodifica =0 where tavolo =" & i)
		Else If i4 = 2 Then
			Dim str4 As String = i & "_" & j & "_Web"
			mod1.Sub089(True, str4)
		End If
		If Not(z3) Then
			Main.vSql1.ExecNonQuery("delete from headmov where nmov = " & j)
		End If
		If list.Size > 0 Then
			dbutil.Sub007(Main.vSql1, "Venduto", list)
			list.Clear
			Dim cursorWrapper3 As Cursor
			Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select codice,totcre,stampante2,stampaesclusiva from Venduto where nmov = " & j & " and lower(substr(venduto.codice,1,2))<>'vv' and stampante2 > 0")
			If cursorWrapper4.RowCount > 0 Then
				Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
				Dim i6 As Int
				For i6 = 0 To rowCount2
					cursorWrapper4.Position = i6
					Main.vSql1.ExecNonQuery("update venduto set stampante2 = " & cursorWrapper4.GetString("stampante2") & ",stampaesclusiva = " & cursorWrapper4.GetString("stampaesclusiva") & " where nmov = " & j & " AND lower(substr(venduto.codice,1,2))='vv' and totcre ='" & cursorWrapper4.GetString("totcre") & "'")
				Next
			End If
			cursorWrapper4.Close
		End If
		If z Then
			If i <> 10000 Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from venduto where nmov = " & j) = 0 Or z3 Then
					Main.vSql1.ExecNonQuery("update tavoli set tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0 where tavolo = " & i)
				Else
					Dim str5 As String = " uscita = 0,"
					If i4 <> 1 Then
						str2 = ""
					Else
						str2 = " lock = 1,"
					End If
					If Main.v_changeuscita Then
						Try
							If Main.vSql1.ExecQuerySingleResult("Select uscita from venduto where chiave=(select max(chiave) from venduto where nmov = " & j & ")") > 0 Then
								str5 = " uscita = 1,"
							End If
						Catch
							mod1.Sub217(LastException.Message)
						End Try
					Else
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from venduto where uscita=1 and nmov = " & j) > 0 Then
							str5 = " uscita = 1,"
						End If
					End If
					Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select case when sum(importo) is null then 0 else sum(importo) end from Venduto where nmov = " & j)
					Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end as tot from venduto where (codint ='888888' or codint ='888889') and nmov = " & j)
					Main.vSql1.ExecNonQuery("update tavoli set " & str5 & " rifheadmov = " & j & "," & str2 & "coperti=" & vExecQuerySingleResult2 & ",addturni= " & mod1.Sub005(j) & ",inmodifica=0,timelast='" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "',importo = " & vExecQuerySingleResult.Replace(",", ".") & " where tavolo = " & i)
					Sub001(j, vExecQuerySingleResult, i, i3, i4 = 1, True, 0, "0")
				End If
			Else
				Sub001(j, Main.vSql1.ExecQuerySingleResult("select case when sum(importo) is null then 0 else sum(importo) end from Venduto where nmov = " & j), i, i3, i4 = 1, True, 0, "0")
			End If
		End If
		If i2 = 1 And i <> 10000 And i4 = 2 Then
			mod1.Sub087(z2, "1_" & j & "_" & i & "_Web", False)
		Else If i2 = 1 And i <> 10000 And i4 = 0 Then
			mod1.Sub087(z2, "1_" & j & "_" & i & "_" & str, False)
		Else
			If i2 = 1 And i = 10000 Then
				If Main.v_asportoora Then
					If Main.v_asportoanticipo > 0 Then
						z5 = True
						If Not(z5) Then
							mod1.Sub088(vStr5, j, False, True, True)
						End If
					End If
				End If
				z5 = False
				If Not(z5) Then
				End If
			End If
			If i2 = 0 And i <> 10000 And i4 = 0 Then
				mod1.Sub215("Stampa disabilitata da palmare sul tavolo " & i & " dal terminale " & str)
			End If
		End If
		If z3 Then
			Main.vSql1.ExecNonQuery("delete from headmov where nmov = " & j)
			Main.vSql1.ExecNonQuery("delete from venduto where nmov = " & j)
		End If
		If Main.vInt30 >= 10 Then
		End If
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

