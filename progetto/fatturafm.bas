B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=13.1
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	Public vLst1 As List
	Public vBln1 As Boolean
	Public vBln2 As Boolean
	Public vBln3 As Boolean
	Public vStr1 As String
	Public vInt1 As Int
	Public vStr2 As String
	Public vStr3 As String = "F"
	Public vInt2 As Int = -1
	Public vStr4 As String
	Public vStr5 As String
	Public vStr6 As String
	Public vStr7 As String
	Public vDbl1 As Double
	Public vStr8 As String
	Public vStr9 As String
	Public vBln4 As Boolean
	Public vBln5 As Boolean
	Public vStr10 As String
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public aData As Button
	Public Chiudi As Button
	Public daData As Button
	Public vCSBuilder1 As CSBuilder
	Public dataFattura As Button
	Public PanelGrid As Panel
	Public Ricerca As Button
	Public vcustomlistviewold1 As customlistviewold
	Public vcustomlistviewold2 As customlistviewold
	Public vCur1 As Cursor
	Public bRistampa As Button
	Public vLbl1 As Label
	Public vLbl2 As Label
	Public vLbl3 As Label
	Public vLbl4 As Label
	Public vLbl5 As Label
	Public vcustomlistviewold3 As customlistviewold
	Public vCur2 As Cursor
	Public vCur3 As Cursor
	Public vPDFWriter1 As PDFWriter
	Public vPDFPaperSizes1 As PDFPaperSizes
	Public vSMTP1 As SMTP
	Public vIME1 As IME
	Public vCur4 As Cursor
	Public PnlList As Panel
	Public LblInfo As Label
	Public lblTitolo As Label
	Public vMap1 As Map
	Public edtImportoBollo As EditText
	Public edtCUP As EditText
	Public edtCIG As EditText
	Public pEIva2 As Spinner
	Public edtIDOrdAcq As EditText
	Public lblIDOrdAcq As Label
	Public lblCIG As Label
	Public lblCUP As Label
	Public edtMemo As EditText
	Public bNumeroCopie As Button
	Public edtMailFE As EditText
	Public bAddCopie As Button
	Public bLessCopie As Button
	Public lTipoDocumento As Label
	Public pTipoDocumento As Spinner
	Public lblGridIntestazione As Label
	Public pnlElencoRistampa As Panel
	Public btnGridOK As Button
	Public btnGridAnnulla As Button
End Sub

Sub Activity_Create(z As Boolean)
	If Main.vInt9 >= 19 Then
		Dim javaObject As JavaObject = Activity
		javaObject.RunMethod("setOnSystemUiVisibilityChangeListener", Array(javaObject.CreateEvent("android.view.View.OnSystemUiVisibilityChangeListener", "VisibilityChanged", Null)))
		Activity.Width = -1
		Activity.Height = -1
		mod1.Sub081
	End If
	mod1.Sub175
	If Main.v_attivaterminale Then
		Sub003()
		Return
	End If
End Sub

Sub Activity_KeyPress(i As Int) As Boolean
	If i <> 4 Then
		Return False
	End If
	ToastMessageShow("Non Consentito", False)
	Return True
End Sub

Sub Activity_Pause(z As Boolean)
	If Not(vBln1) And Not(vBln4) Then
		Log("appClosed")
		Return
	End If
End Sub

Sub Activity_Resume
	Dim vExecQuerySingleResult As String
	Dim str As String
	Dim vDate As String
	Dim str2 As String
	If vBln4 Then
		vBln4 = False
		Return
	End If
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			vBln1 = False
			mod1.vStr2 = "Activity_Resume"
			Try
				Sub014("FatturaFM")
				mod1.Sub165(Chiudi)
				vLbl1.Initialize("")
				vLbl1.Text = "Data"
				vLbl1.TextSize = 16
				vLbl1.TextColor = -1
				vLbl2.Initialize("")
				vLbl2.Text = "Importo"
				vLbl2.TextSize = 16
				vLbl2.TextColor = -1
				vLbl3.Initialize("")
				vLbl3.Text = "Cliente"
				vLbl3.TextSize = 16
				vLbl3.TextColor = -1
				vLbl4.Initialize("")
				vLbl4.Text = "Fatt.N."
				vLbl4.TextSize = 16
				vLbl4.TextColor = -1
				vLbl5.Initialize("")
				vLbl5.Text = ""
				vLbl5.TextSize = 20
				vLbl5.TextColor = -1
				btnGridAnnulla.TextColor = -1
				btnGridOK.TextColor = -1
				lblGridIntestazione.TextSize = 26
				lblGridIntestazione.TextColor = -1
				lblGridIntestazione.Text = "Ristampa Fattura"
				lblGridIntestazione.Gravity = 1
				pnlElencoRistampa.Background = mod1.Sub155(Colors.RGB(29, 12, 80), 0)
				btnGridAnnulla.Background = mod1.Sub155(-65536, 25)
				btnGridOK.Background = mod1.Sub155(-16711936, 25)
				vcustomlistviewold3.Initialize(Me, "clCli")
				vcustomlistviewold3.vInt3 = -16776961
				pnlElencoRistampa.AddView(vLbl1, DipToCurrent(30), PerYToCurrent(12), PerXToCurrent(20), PerYToCurrent(14))
				pnlElencoRistampa.AddView(vLbl2, PerXToCurrent(30), PerYToCurrent(12), PerXToCurrent(14), PerYToCurrent(14))
				pnlElencoRistampa.AddView(vLbl3, PerXToCurrent(47), PerYToCurrent(12), PerXToCurrent(26), PerYToCurrent(14))
				pnlElencoRistampa.AddView(vLbl4, PerXToCurrent(70), PerYToCurrent(12), PerXToCurrent(10), PerYToCurrent(14))
				pnlElencoRistampa.AddView(vLbl5, PerXToCurrent(5), PerYToCurrent(80), PerXToCurrent(80), PerYToCurrent(6))
				pnlElencoRistampa.AddView(vcustomlistviewold3.Sub003, PerXToCurrent(1), PerYToCurrent(15), PerXToCurrent(99), PerYToCurrent(62))
				vLst1.Initialize
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
				LblInfo.Color = Main.v_colormenutitle
				mod1.Sub173(LblInfo)
				vcustomlistviewold2.Initialize(Me, "clv3")
				vcustomlistviewold2.vInt3 = Colors.RGB(245, 245, 245)
				PnlList.AddView(vcustomlistviewold2.Sub003, DipToCurrent(0), PerYToCurrent(10), PnlList.Width, PnlList.Height - PerYToCurrent(28))
				vcustomlistviewold2.Sub004
				vStr1 = "CausaliPagamenti.codice=2 Or CausaliPagamenti.NonRiscosso=1 "
				If Main.vccefdll1.vBln15 Then
					vStr1 = "CausaliPagamenti.codice=2 "
					Dim cursorWrapper As Cursor
					Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codice from pagamenti where cassa =1 and RTPagamento=7 and codice <> 2")
					If cursorWrapper2.RowCount > 0 Then
						Dim rowCount As Int = cursorWrapper2.RowCount - 1
						Dim i As Int
						For i = 0 To rowCount
							cursorWrapper2.Position = i
							vStr1 = vStr1 & " or CausaliPagamenti.codice =" & cursorWrapper2.GetString("codice")
						Next
					End If
				End If
				Dim cursorWrapper3 As Cursor
				vCur3 = Main.vSql1.ExecQuery("Select * from iva order by codice")
				vExecQuerySingleResult = Main.vSql2.ExecQuerySingleResult("Select min(headmov.datam) from headmov inner join CausaliPagamenti on  CausaliPagamenti.nmov= headmov.nmov" & CRLF & TAB & TAB & "where (" & SmartStringFormatter("", vStr1) & ") and headmov.cliente<>'' and headmov.nfat=0 and  (nscontrinoffm >0 or  RicDaFatt=1) and nfat_fm=0")
				If vExecQuerySingleResult = Null Or vExecQuerySingleResult.Length < 8 Then
					vExecQuerySingleResult = "01/01/2000"
				End If
				str = vExecQuerySingleResult.SubString2(3, 5) & "/" & vExecQuerySingleResult.SubString2(0, 2) & "/" & vExecQuerySingleResult.SubString2(6, 10)
				vDate = DateTime.Date(mod1.Sub058)
				str2 = vDate.SubString2(3, 5) & "/" & vDate.SubString2(0, 2) & "/" & vDate.SubString2(6, 10)
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			If vExecQuerySingleResult.Length = 0 Then
				Dim vObjectToCharSequence As Object = "Non esiste nessun movimento da fatturare"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				vBln1 = True
				Activity.Finish
				mod1.Sub198("Main")
				Return
			End If
			lblTitolo.Text = "Fatturazione Fine Mese"
			daData.Tag = vExecQuerySingleResult.SubString2(6, 10) & "-" & vExecQuerySingleResult.SubString2(0, 2) & "-" & vExecQuerySingleResult.SubString2(3, 5) & " 00:00:00"
			daData.Text = "Dal " & str
			aData.Tag = vDate.SubString2(6, 10) & "-" & vDate.SubString2(0, 2) & "-" & vDate.SubString2(3, 5) & " 23:59:59"
			aData.Text = "Al " & str2
			dataFattura.Tag = vDate
			dataFattura.Text = "Data Fattura " & str2
			vcustomlistviewold1.Initialize(Me, "clv2")
			vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
			daData.Background = mod1.Sub155(-6572819, 25)
			bRistampa.Background = mod1.Sub155(-1335933, 25)
			aData.Background = mod1.Sub155(-6572819, 25)
			Ricerca.Background = mod1.Sub155(-1335933, 25)
			dataFattura.Background = mod1.Sub155(-6572819, 25)
			Sub020("")
			If Main.v_lastdatadocfm Then
				dataFattura.Enabled = False
				dataFattura.Text = "Data fattura: da documento"
			End If
			PanelGrid.AddView(vcustomlistviewold1.Sub003, 0, 0, PanelGrid.Width, PanelGrid.Height - PerYToCurrent(2))
			Sub022()
			mod1.Sub081
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub aData_Click
	Dim dateDialog As DateDialog
	Dim vObjectToString As String = aData.Tag
	dateDialog.Year = vObjectToString.SubString2(0, 4)
	dateDialog.DayOfMonth = vObjectToString.SubString2(9, 11)
	dateDialog.Month = vObjectToString.SubString2(5, 7)
	Dim vShow As Int = dateDialog.Show("Impostare la data di fine ricerca", "Imposta Filtro Data", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		aData.Tag = dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & " 23:59:59"
		aData.Text = "Al " & NumberFormat(dateDialog.DayOfMonth, 2, 0) & "/" & NumberFormat(dateDialog.Month, 2, 0) & "/" & dateDialog.Year
	End If
	mod1.Sub081
End Sub

Sub Sub001(i As Int, str As String, z As Boolean)
	Try
		Dim list As List
		list.Initialize
		Dim map As Map
		map.Initialize
		Main.vSql1.ExecNonQuery("delete from ExportFattureHead where nfat=" & i)
		Main.vSql1.ExecNonQuery("delete from ExportFattureDett where nfat=" & i)
		map.Put("nfat", i)
		Dim vObjectToString As String = dataFattura.Tag
		If z Then
			vObjectToString = vStr7
		End If
		map.Put("data", vObjectToString.SubString2(6, 10) & "-" & vObjectToString.SubString2(0, 2) & "-" & vObjectToString.SubString2(3, 5))
		map.Put("cliente", str)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "ExportFattureHead", list)
		list.Initialize
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql2.ExecQuery("Select codint, iva,importo,prezzov,qta from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & str.Trim & "' and nfat_fm =" & i & " and datfat_fm = '" & vObjectToString & "' order by dataeoraffm")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount
			cursorWrapper2.Position = i2
			map.Initialize
			map.Put("codint", cursorWrapper2.GetString("codint"))
			map.Put("nfat", i)
			map.Put("iva", cursorWrapper2.GetInt("iva"))
			map.Put("qta", cursorWrapper2.GetInt("qta"))
			map.Put("importo", cursorWrapper2.GetDouble("importo"))
			map.Put("prezzov", cursorWrapper2.GetDouble("prezzov"))
			list.Add(map)
		Next
		dbutil.Sub007(Main.vSql1, "ExportFattureDett", list)
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub AnnullaList_Click
	If Not(Main.v_riducimsg) Then
		Dim vObjectToCharSequence As Object = "Attenzione ... eventuali modifiche verranno annullate ..." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			Return
		End If
	End If
	PnlList.Visible = False
End Sub

Sub bCopie_Click
	Dim i As Int
	Dim buttonWrapper As Button = Sender
	Dim vObjectToNumber As Int = IIf(IsNumber(bNumeroCopie.Tag), bNumeroCopie.Tag, 0)
	If buttonWrapper.Tag = "less" Then
		i = vObjectToNumber - 1
	Else
		i = vObjectToNumber + 1
	End If
	Dim i2 As Int = IIf(i >= 0, i, 0)
	bNumeroCopie.Text = vCSBuilder1.Initialize.Size(14).Append("Numero di copie stampa di riepilogo: " & CRLF).Bold.Size(20).Append(i2).PopAll
	bNumeroCopie.Tag = i2
End Sub

Sub bNumeroCopie_Click
End Sub

Sub bRistampa_Click
	Dim dateDialog As DateDialog
	Dim dateDialog2 As DateDialog
	dateDialog.Year = DateTime.GetYear(mod1.Sub058)
	dateDialog.Month = DateTime.GetMonth(mod1.Sub058)
	dateDialog.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
	Dim vShow As Int = dateDialog.Show("Impostare la data di inizio ricerca ", "Filtro Data", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		dateDialog2.Year = DateTime.GetYear(mod1.Sub058)
		dateDialog2.Month = DateTime.GetMonth(mod1.Sub058)
		dateDialog2.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
		Dim vShow2 As Int = dateDialog2.Show("Impostare la data di fine ricerca ", "Filtro Data", "Ok", "Annulla", "", Main.vBmp1)
		If vShow2 = -1 Then
			Dim str As String = "substr(datfat_fm,7,4) || substr(datfat_fm,1,2) || substr(datfat_fm,4,2) >= '" & dateDialog.Year & NumberFormat(dateDialog.Month, 2, 0) & NumberFormat(dateDialog.DayOfMonth, 2, 0) & "' and substr(datfat_fm,7,4) || substr(datfat_fm,1,2) || substr(datfat_fm,4,2) <= '" & dateDialog2.Year & NumberFormat(dateDialog2.Month, 2, 0) & NumberFormat(dateDialog2.DayOfMonth, 2, 0) & "' and "
			Dim cursorWrapper As Cursor
			vCur2 = Main.vSql2.ExecQuery("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti inner join headmov As h2 on CausaliPagamenti.nmov= h2.nmov where h2.nfat_fm = headmov.nfat_fm  and substr(headmov.datam,7,4)=substr(h2.datam,7,4) and h2.cliente = headmov.cliente and (" & vStr1 & ") ) As totale,cliente,max(clides) as clides,nfat_fm As nfat,datfat_fm As datam from headmov  where " & str & "  headmov.nfat=0 and FattFM=1 And nfat_fm  >0 group by cliente,nfat_fm,datfat_fm order by substr(datfat_fm,7,4) || substr(datfat_fm,1,2) || substr(datfat_fm,4,2) desc,nfat_fm asc")
			vcustomlistviewold3.Sub004
			If vCur2.RowCount > 0 Then
				Dim rowCount As Int = vCur2.RowCount - 1
				Dim i As Int
				For i = 0 To rowCount
					vCur2.Position = i
					vcustomlistviewold3.Sub001(Sub010(i, DipToCurrent(70)), DipToCurrent(70), vCur2.GetString("cliente"))
				Next
				vcustomlistviewold3.Sub012(0)
			End If
			pnlElencoRistampa.SetVisibleAnimated(300, True)
			Return
		End If
		Return
	End If
End Sub

Sub btnGridAnnulla_Click
	vLbl5.Text = ""
	mod1.Sub081
	pnlElencoRistampa.SetVisibleAnimated(300, False)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub btnGridOK_Click
	Dim answ As Int
	Dim txt As String
	Dim rs As ResumableSub
	Dim result As Map
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				Continue
			Case 1
				rsState = 59
				If vStr5 <> "" Then
					rsState = 3
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 4
				answ = 0
				txt = ""
				txt = "Confermi la ristampa della fattura  " & vStr5 & " ?"
				Dim vObjectToCharSequence As Object = txt
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				answ = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
				Continue
			Case 4
				rsState = 58
				Dim i As Int = answ
				If i <> -1 Then
					Continue
				Else
					rsState = 6
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 7
				Continue
			Case 7
				rsState = 12
				If Not(Main.vBln30) Then
					If Main.v_stampafattura <> 100 Then
						rsState = 11
						Continue
					End If
				End If
				rsState = 9
				Continue
			Case 9
				rsState = 12
				txt = "Si desidera stampare la fattura " & vStr5 & " sul " & Main.vStr1 & " o Generare e inviare un PDF ?  "
				Dim vObjectToCharSequence3 As Object = txt
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				answ = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "MF", "Annulla", "PDF", Main.vBmp1)
				Continue
			Case 11
				rsState = 12
				txt = "Si desidera stampare la fattura " & vStr5 & " sulla Stampante Non Fiscale o Generare e inviare un PDF ?  "
				Dim vObjectToCharSequence5 As Object = txt
				Dim vObjectToCharSequence6 As Object = Main.vStr8
				answ = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Stampante Non Fiscale", "Annulla", "PDF", Main.vBmp1)
				Continue
			Case 12
				rsState = 21
				Dim i2 As Int = answ
				If i2 <> -1 Then
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
				rsState = 20
				If Not(Main.vBln30) Then
					If Main.v_stampafattura <> 100 Then
						If Main.v_stampafattura >= 19 Then
							Continue
						Else
							rsState = 19
							Continue
						End If
					End If
				End If
				rsState = 17
				Continue
			Case 17
				rsState = 20
				stampa(True)
				Continue
			Case 19
				rsState = 20
				stampaNF(True)
				Continue
			Case 20
				rsState = 21
				Continue
			Case 21
				rsState = 52
				Dim i3 As Int = answ
				If i3 <> -2 Then
					Continue
				Else
					rsState = 23
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 23
			Case 23
				rsState = 24
				Continue
			Case 24
				rsState = 51
				If Not(Main.v_attivafe) Then
					Continue
				Else
					rsState = 26
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 26
			Case 26
				rsState = 27
				vBln5 = False
				Continue
			Case 27
				rsState = 36
				rsState = 29
				Continue
			Case 29
				rsState = 30
				'rs = ResumableSub
				Dim parseDouble As Int = vStr5
				rs = ValidaDatiFattura(vStr6, True, parseDouble, False, vStr7, " where  FattFM=1 and  headmov.cliente = '" & vStr6.Trim & "' and " & vStr4)
				Wait For (rs) Complete (wf60_0 As Map)
				rsState = 60
				Continue
			Case 30
				rsState = 35
				If vBln5 And result.IsInitialized Then
					rsState = 32
					Continue
				Else
					rsState = 34
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 32
			Case 32
				rsState = 35
				vMap1 = result
				Continue
			Case 34
				rsState = 35
				rsState = 36
				Continue
			Case 35
				rsState = 27
				Continue
			Case 36
				rsState = 45
				If Not(result.IsInitialized) Then
					rsState = 38
					Continue
				Else
					rsState = 40
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 38
			Case 38
				rsState = 45
				Return
			Case 40
				rsState = 41
				vMap1 = result
				Continue
			Case 41
				rsState = 44
				If Not(vMap1.IsInitialized) Then
					Continue
				Else
					If vMap1.Size <> 0 Then
						Continue
					Else
						rsState = 43
						Continue
					End If
				End If
				'(fallthrough java verso il case successivo)
				rsState = 43
			Case 43
				rsState = 44
				vMap1 = Null
				Continue
			Case 44
				rsState = 45
				Continue
			Case 45
				rsState = 50
				If vMap1.IsInitialized Then
					Continue
				Else
					rsState = 47
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 47
			Case 47
				rsState = 50
				Return
			Case 50
				rsState = 51
				Continue
			Case 51
				rsState = 52
				Sub012(True, Sub002(True))
				Continue
			Case 52
				rsState = 57
				Dim i4 As Int = answ
				If i4 = -3 Then
					Continue
				Else
					rsState = 54
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 54
			Case 54
				rsState = 57
				Dim parseDouble2 As Int = vStr5
				Sub001(parseDouble2, vStr6, True)
				Continue
			Case 57
				rsState = 58
				Continue
			Case 58
				rsState = 59
				Continue
			Case 59
				rsState = -1
				vStr5 = ""
				vStr7 = ""
				vStr8 = ""
				vStr6 = ""
				vLbl5.Text = ""
				mod1.Sub081
				Continue
			Case 60
				rsState = 30
				result = wf60_0
				Continue
		End Select
	Loop
End Sub

Sub complete(map As Map)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub Buttonfun_Click
	Dim index As Int
	Dim pnl As Panel
	Dim lcurs As Label
	Dim txt As String
	Dim result As Int
	Dim nf As Int
	Dim codcliente As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 4
					If Not(vBln2) Then
						If Not(vBln3) Then
							Continue
						End If
					End If
					rsState = 3
					Continue
				Case 3
					rsState = 4
					Return
				Case 4
					rsState = 5
					vBln2 = True
					mod1.vStr2 = "  Sub buttonFun_Click"
					Continue
				Case 5
					rsState = 23
					rsCatchState = 22
					rsState = 7
					Continue
				Case 7
					rsState = 8
					rsCatchState = 22
					index = 0
					index = vcustomlistviewold1.Sub007(Sender)
					'pnl = Panel
					pnl = vcustomlistviewold1.getpanel(index)
					'lcurs = Label
					lcurs = pnl.GetView(6)
					vCur1.Position = lcurs.Text
					txt = ""
					txt = "Confermi l'emissione della fattura per  " & Sub018(vCur1.GetString("descrizione")) & " ?"
					Dim vObjectToCharSequence As Object = txt
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2Async(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1, False)
					Wait For (Null) Msgbox_Result (wf24_0 As Int)
					rsState = 24
					Continue
				Case 8
					rsState = 11
					Dim i As Int = result
					If i <> -2 Then
						Continue
					Else
						rsState = 10
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 10
				Case 10
					rsState = 11
					mod1.Sub081
					vBln2 = False
					Return
				Case 11
					rsState = 12
					nf = Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='" & vStr3 & "'")
					codcliente = vCur1.GetString("codiceCli")
					Continue
				Case 12
					rsState = 15
					If Sub017(index) Then
						Continue
					Else
						rsState = 14
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 14
				Case 14
					rsState = 15
					vBln2 = False
					Return
				Case 15
					rsState = 20
					If Main.v_stampafattura <> 100 Then
						If Not(Main.vBln30) Then
							If Main.v_stampafattura >= 19 Then
								Continue
							Else
								rsState = 19
								Continue
							End If
						End If
					End If
					rsState = 17
					Continue
				Case 17
					rsState = 20
					stampa(False)
					Continue
				Case 19
					rsState = 20
					stampaNF(False)
					Continue
				Case 20
					rsState = 23
					Sub001(nf, codcliente, False)
					mod1.Sub081
					Continue
				Case 22
					rsState = 23
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 23
					rsState = -1
					rsCatchState = 0
					vBln2 = False
					Continue
				Case 24
					rsState = 8
					result = wf24_0
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

Sub Msgbox_Result(i As Int)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub Buttonfun2_Click
	Dim index As Int
	Dim pnl As Panel
	Dim lcurs As Label
	Dim txt As String
	Dim resultmsg As Int
	Dim nf As Int
	Dim codcliente As String
	Dim rs As ResumableSub
	Dim result As Map
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 6
					If Not(vBln2) Then
						If Not(vBln3) Then
							Continue
						End If
					End If
					rsState = 3
					Continue
				Case 3
					rsState = 6
					Return
				Case 6
					rsState = 7
					mod1.vStr2 = "  Sub buttonFun2_Click"
					Continue
				Case 7
					rsState = 45
					rsCatchState = 44
					rsState = 9
					Continue
				Case 9
					rsState = 10
					rsCatchState = 44
					vBln2 = True
					index = 0
					index = vcustomlistviewold1.Sub007(Sender)
					'pnl = Panel
					pnl = vcustomlistviewold1.getpanel(index)
					'lcurs = Label
					lcurs = pnl.GetView(6)
					vCur1.Position = lcurs.Text
					txt = ""
					txt = "Confermi l'emissione della fattura per  " & Sub018(vCur1.GetString("descrizione")) & " ?"
					Dim vObjectToCharSequence As Object = txt
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2Async(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1, False)
					Wait For (Null) Msgbox_Result (wf46_0 As Int)
					rsState = 46
					Continue
				Case 10
					rsState = 13
					Dim i As Int = resultmsg
					If i <> -2 Then
						Continue
					Else
						rsState = 12
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 13
					mod1.Sub081
					vBln2 = False
					Return
				Case 13
					rsState = 14
					nf = Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='" & vStr3 & "'")
					codcliente = vCur1.GetString("codiceCli")
					Continue
				Case 14
					rsState = 17
					If Sub017(index) Then
						Continue
					Else
						rsState = 16
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 16
				Case 16
					rsState = 17
					vBln2 = False
					Return
				Case 17
					rsState = 42
					If Not(Main.v_attivafe) Then
						Continue
					Else
						rsState = 19
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 19
				Case 19
					rsState = 20
					vBln5 = False
					Continue
				Case 20
					rsState = 29
					rsState = 22
					Continue
				Case 22
					rsState = 23
					'rs = ResumableSub
					Dim str As String = codcliente
					Dim i2 As Int = nf
					rs = ValidaDatiFattura(str, False, i2, False, "", " where  FattFM=1 and  headmov.cliente = '" & vCur1.GetString("codiceCli").Trim & "' and " & vStr4)
					Wait For (rs) Complete (wf47_0 As Map)
					rsState = 47
					Continue
				Case 23
					rsState = 28
					If vBln5 And result.IsInitialized Then
						rsState = 25
						Continue
					Else
						rsState = 27
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 25
				Case 25
					rsState = 28
					vMap1 = result
					Continue
				Case 27
					rsState = 28
					rsState = 29
					Continue
				Case 28
					rsState = 20
					Continue
				Case 29
					rsState = 38
					If Not(result.IsInitialized) Then
						rsState = 31
						Continue
					Else
						rsState = 33
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 31
				Case 31
					rsState = 38
					vBln2 = False
					Return
				Case 33
					rsState = 34
					vMap1 = result
					Continue
				Case 34
					rsState = 37
					If Not(vMap1.IsInitialized) Then
						Continue
					Else
						If vMap1.Size <> 0 Then
							Continue
						Else
							rsState = 36
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 36
				Case 36
					rsState = 37
					vMap1 = Null
					Continue
				Case 37
					rsState = 38
					Continue
				Case 38
					rsState = 41
					If vMap1.IsInitialized Then
						Continue
					Else
						rsState = 40
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 40
				Case 40
					rsState = 41
					vBln2 = False
					Return
				Case 41
					rsState = 42
					Continue
				Case 42
					rsState = 45
					Sub012(False, Sub002(False))
					Sub001(nf, codcliente, False)
					mod1.Sub081
					Continue
				Case 44
					rsState = 45
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 45
					rsState = -1
					rsCatchState = 0
					vBln2 = False
					Continue
				Case 46
					rsState = 10
					resultmsg = wf46_0
					Continue
				Case 47
					rsState = 23
					result = wf47_0
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

Sub Buttonfun3_Click
	Dim vMsgbox2 As Int
	If vBln2 Or vBln3 Then
		Return
	End If
	mod1.vStr2 = "  Sub buttonFun3_Click"
	Try
		vBln2 = True
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		vCur1.Position = getpanel.GetView(6).Text
		Dim vObjectToCharSequence As Object = "Confermi la gestione dei movimenti per il cliente " & Sub018(vCur1.GetString("descrizione")) & " ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		vMsgbox2 = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vMsgbox2 = -2 Then
		vBln2 = False
		Return
	End If
	Dim sb As String = "select headmov.nmov,substr(cast(headmov.datam3 as nvarchar),9,2) ||'/'|| substr(cast(headmov.datam3 as nvarchar),6,2) ||'/'|| substr(cast(headmov.datam3 as nvarchar),1,4)|| substr(cast(headmov.datam3 as nvarchar),11,9) as datatmp,totale,FattFM" & CRLF & TAB & TAB & "from headmov inner join CausaliPagamenti on  CausaliPagamenti.nmov= headmov.nmov" & CRLF & TAB & TAB & "where (" & SmartStringFormatter("", vStr1) & ") And " & SmartStringFormatter("", vStr4.Replace("headmov.cliente<>''", "headmov.cliente='" & vCur1.GetString("codiceCli") & "'")) & ""
	Dim cursorWrapper As Cursor
	vCur4 = Main.vSql2.ExecQuery(sb)
	vcustomlistviewold2.Sub004
	If vCur4.RowCount > 0 Then
		Dim rowCount As Int = vCur4.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			vCur4.Position = i
			Dim str As String = "Mov.N." & vCur4.GetString("nmov") & " del " & vCur4.GetString("datatmp")
			vcustomlistviewold2.Sub001(Sub009(i, str, DipToCurrent(50), False, vCur4, False), DipToCurrent(50), str)
		Next
		LblInfo.Text = "Movimenti per " & Sub018(vCur1.GetString("descrizione"))
		PnlList.Visible = True
	End If
	Dim cursorWrapper2 As Cursor
	Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select nmov,substr(cast(datam3 as nvarchar),9,2) ||'/'|| substr(cast(datam3 as nvarchar),6,2) ||'/'|| substr(cast(datam3 as nvarchar),1,4)|| substr(cast(datam3 as nvarchar),11,9) as datatmp,totale,'1' as FattFM from  headmov where  (nscontrinoffm >0 or  RicDaFatt=1) and cliente ='" & vCur1.GetString("codiceCli") & "'")
	If cursorWrapper3.RowCount > 0 Then
		Dim rowCount2 As Int = cursorWrapper3.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount2
			cursorWrapper3.Position = i2
			Dim str2 As String = "Mov.N." & cursorWrapper3.GetString("nmov") & " del " & cursorWrapper3.GetString("datatmp")
			vcustomlistviewold2.Sub001(Sub009(i2, str2, DipToCurrent(50), True, cursorWrapper3, True), DipToCurrent(50), str2)
		Next
		LblInfo.Text = "Movimenti per " & Sub018(vCur1.GetString("descrizione"))
		PnlList.Visible = True
	End If
	vInt1 = cursorWrapper3.RowCount
	mod1.Sub081
	vBln2 = False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/fatturafm.java, metodo m3… (riga 1780).
Sub Sub002(z As Boolean) As Int
	Dim i As Int
	Dim parseDouble As Int
	Dim str As String
	Dim cursorWrapper As Cursor
	Dim z2 As Boolean
	Dim str2 As String
	Dim cursorWrapper2 As Cursor
	Try
		Dim vObjectToString As String = dataFattura.Tag
		i = 1
		parseDouble = Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='" & vStr3 & "'")
		If z Then
			parseDouble = vStr5
			Dim cursorWrapper3 As Cursor
			Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vStr6 & "'")
			cursorWrapper4.Position = 0
			str = vStr7
			cursorWrapper = cursorWrapper4
		Else
			Dim cursorWrapper5 As Cursor
			Dim cursorWrapper6 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vCur1.GetString("codiceCli") & "'")
			cursorWrapper6.Position = 0
			Main.vSql2.ExecNonQuery("update headmov set nfat_fm = " & parseDouble & ",sezionale='" & vStr2 & "',datfat_fm = '" & vObjectToString & "' where (select count(*) from CausaliPagamenti where CausaliPagamenti.nmov= headmov.nmov And (" & vStr1 & "))>0 And  FattFM=1 And  cliente = '" & vCur1.GetString("codiceCli").Trim & "' and " & vStr4)
			str = vObjectToString
			cursorWrapper = cursorWrapper6
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Main.v_fatturafmt2 Then
		If Not(cursorWrapper.GetInt("abpost") = 1 And cursorWrapper.GetDouble("fido") > 0) Then
			z2 = True
			If z2 Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" & SmartStringFormatter("", cursorWrapper.GetString("codice").Trim) & "' and fido >0") > 0 Then
					z2 = False
				End If
			End If
			If z2 Then
				str2 = "Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & vStr1 & ")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,headmov.memo as clides,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & parseDouble & " and datfat_fm = '" & str & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm"
			Else
				str2 = "Select sum(importo) as tot, headmov.nric as Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva,headmov.memo as clides from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & parseDouble & " and datfat_fm = '" & str & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap,venduto.iva  order by dataeoraffm"
			End If
			Dim cursorWrapper7 As Cursor
			cursorWrapper2 = Main.vSql2.ExecQuery(str2)
			If cursorWrapper2.RowCount > 0 Then
				vLst1.Clear
				Dim z3 As Boolean = False
				Dim i2 As Int
				For i2 = 0 To 30
					vLst1.Add(0)
				Next
				Dim i3 As Int = 0
				Dim d As Double = 0
				Do While Not(z3)
					Dim i4 As Int = 100
					If i3 - 1 >= cursorWrapper2.RowCount - 1 Then
						Return i
					End If
					Dim rowCount As Int = cursorWrapper2.RowCount - 1
					Dim i5 As Int = i3
					Do While True
						If i5 <= rowCount Then
							cursorWrapper2.Position = i5
							If cursorWrapper2.GetDouble("tot") <> 0 And cursorWrapper2.GetString("clides").Contains("Tess.") Then
								i4 = i4 + 7
								d = d + 0.5
							End If
							i4 = i4 + 15
							If d >= 28 Then
								i = i + 1
								i3 = i5 + 1
								d = 0
								Exit
							End If
							If i5 = cursorWrapper2.RowCount - 1 Then
								z3 = True
								Exit
							End If
							d = d + 1
							i5 = i5 + 1
						End If
					Loop
				Loop
				Return i
			End If
			Return 0
		End If
	End If
	z2 = False
	If z2 Then
	End If
	If z2 Then
	End If
	Dim cursorWrapper72 As Cursor
	cursorWrapper2 = Main.vSql2.ExecQuery(str2)
	If cursorWrapper2.RowCount > 0 Then
	End If
	Return 0
End Sub

Sub Sub003
	Initialize
	Dim vListFiles As List = File.ListFiles(vStr10)
	Dim size As Int = vListFiles.Size - 1
	Dim i As Int
	For i = 0 To size
		Dim vObjectToString As String = vListFiles.Get(i)
		If vObjectToString.ToLowerCase.StartsWith("dacasse") And vObjectToString.ToLowerCase.EndsWith(".tmp") Then
			File.Delete(vStr10, vObjectToString)
		End If
	Next
End Sub

Sub Sub004(stringBuilderWrapper As StringBuilder)
	If vMap1.GetDefault("ImportoBollo", "") = "" And vMap1.GetDefault("CIG", "") = "" And vMap1.GetDefault("CUP", "") = "" And vMap1.GetDefault("IDOrdAcq", "") = "" Then
		Return
	End If
	If stringBuilderWrapper.IsInitialized Then
		stringBuilderWrapper.Append("-- DATI AGGIUNTIVI -----------------------" & CRLF)
		If vMap1.GetDefault("CIG", "") <> "" Then
			stringBuilderWrapper.Append(modfunstr.left("Codice CIG " & SmartStringFormatter("", vMap1.GetDefault("CIG", "")) & "" & modfunstr.Sub004(42), 42)).Append(CRLF)
		End If
		If vMap1.GetDefault("CUP", "") <> "" Then
			stringBuilderWrapper.Append(modfunstr.left("Codice CUP " & SmartStringFormatter("", vMap1.GetDefault("CUP", "")) & "" & modfunstr.Sub004(42), 42)).Append(CRLF)
		End If
		If vMap1.GetDefault("IDOrdAcq", "") <> "" Then
			stringBuilderWrapper.Append(modfunstr.left("Ordine Acq. " & SmartStringFormatter("", vMap1.GetDefault("IDOrdAcq", "")) & "" & modfunstr.Sub004(42), 42)).Append(CRLF)
		End If
		If vMap1.GetDefault("ImportoBollo", "") <> "" And IsNumber(vMap1.GetDefault("ImportoBollo", "")) Then
			Dim vObjectToNumber As Double = vMap1.GetDefault("ImportoBollo", "0")
			stringBuilderWrapper.Append(modfunstr.left("Importo Bollo " & SmartStringFormatter("", NumberFormat2(vObjectToNumber, 1, 2, 2, False)) & "" & modfunstr.Sub004(42), 42)).Append(CRLF)
		End If
	Else
		Main.vccefdll1.ft_testo("-- DATI AGGIUNTIVI ---------------------------------", 4)
		If vMap1.GetDefault("CIG", "") <> "" Then
			Main.vccefdll1.ft_testo("Codice CIG " & SmartStringFormatter("", vMap1.GetDefault("CIG", "")) & "", 1)
		End If
		If vMap1.GetDefault("CUP", "") <> "" Then
			Main.vccefdll1.ft_testo("Codice CUP " & SmartStringFormatter("", vMap1.GetDefault("CUP", "")) & "", 1)
		End If
		If vMap1.GetDefault("IDOrdAcq", "") <> "" Then
			Main.vccefdll1.ft_testo("Ordine Acq. " & SmartStringFormatter("", vMap1.GetDefault("IDOrdAcq", "")) & "", 1)
		End If
		If vMap1.GetDefault("ImportoBollo", "") <> "" And IsNumber(vMap1.GetDefault("ImportoBollo", "")) Then
			Dim vObjectToNumber2 As Double = vMap1.GetDefault("ImportoBollo", "0")
			Main.vccefdll1.ft_testo("Importo Bollo " & SmartStringFormatter("", NumberFormat2(vObjectToNumber2, 1, 2, 2, False)) & "", 1)
		End If
	End If
End Sub

Sub Chiudi_Click
	vBln1 = True
	If Main.v_attivaterminale Then
		Sub006()
	End If
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub Sub005
	Dim vTmp As Int = vcustomlistviewold2.Sub008 - 1 - vInt1
	Dim i As Int
	For i = 0 To vTmp
		Dim checkBoxWrapper As CheckBox = vcustomlistviewold2.getpanel(i).GetView(0)
		vCur4.Position = i
		Main.vSql2.ExecNonQuery("update headmov set FattFM= " & IIf(checkBoxWrapper.Checked, "1", "0") & " where nmov = " & vCur4.GetString("nmov"))
	Next
End Sub

Sub Sub006
	Initialize
	Dim vListFiles As List = File.ListFiles(vStr10)
	Dim size As Int = vListFiles.Size - 1
	Dim i As Int
	For i = 0 To size
		Dim vObjectToString As String = vListFiles.Get(i)
		If vObjectToString.ToLowerCase.StartsWith("dacasse") And vObjectToString.ToLowerCase.EndsWith(".tmp") Then
			File.Copy(vStr10, vObjectToString, Main.vStr17, vObjectToString)
			File.Delete(vStr10, vObjectToString)
		End If
	Next
	If vListFiles.Size > 0 Then
		CallSub(ftpmanager, "tUpload")
		Return
	End If
End Sub

Sub Sub007(str As String, z As Boolean)
	If z Then
		Return
	End If
	If Main.v_attivafe Then
		Main.vSql2.ExecNonQuery("DROP TABLE IF EXISTS TEMP.TmpFattFM")
		Main.vSql2.ExecNonQuery("CREATE TEMP TABLE TmpFattFM AS  Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & SmartStringFormatter("", vStr1) & "))" & CRLF & TAB & TAB & "As importo,'msg' as codint" & CRLF & TAB & TAB & ", headmov.nric as nric ,nscontrinoffm as nscontrinoffm,nChiusura as nChiusura,headmov.dataeoraffm as dataeoraffm,headmov.datam as datam,headmov.datam3 as datam3," & CRLF & TAB & TAB & "matricolacassap,1 as qta, iva,'' as memo,0 as aliquota2,0 as scov,0 as brep from venduto inner join headmov on venduto.nmov = headmov.nmov " & SmartStringFormatter("", str) & "")
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/fatturafm.java, metodo m3… (riga 2071).
Sub Sub008(i As Int, str As String, i2 As Int) As Panel
	Dim imageViewWrapper As ImageView
	Dim z As Boolean
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = -1
	Try
		'imageViewWrapper = ImageView
		imageViewWrapper.Initialize("buttonFun")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "m_stampe.png")
		If Main.v_stampafattura <> 100 Then
			If Main.v_stampafattura >= 19 Then
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vCur1.GetDouble("totale") <> -9.9999999E7 Then
		z = True
		imageViewWrapper.Visible = z
		Dim imageViewWrapper2 As ImageView
		imageViewWrapper2.Initialize("buttonFun2")
		imageViewWrapper2.Bitmap = LoadBitmap(File.DirAssets, "pdfgrey.png")
		imageViewWrapper2.Visible = vCur1.GetDouble("totale") = -9.9999999E7
		imageViewWrapper2.Tag = 0
		Dim imageViewWrapper3 As ImageView
		imageViewWrapper3.Initialize("buttonFun3")
		imageViewWrapper3.Bitmap = LoadBitmap(File.DirAssets, "fun_modifica veloce.png")
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.Gravity = Bit.Or(16, 3)
		labelWrapper.Text = vCur1.GetString("codiceCli")
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.Text = Sub018(str)
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -16777216
		If Main.vSql1.ExecQuerySingleResult("select count(*) from clienti where codice='" & vCur1.GetString("codiceCli") & "'") > 0 Then
			If Main.vSql1.ExecQuerySingleResult("select count(*) from gruppocli inner join clienti on gruppocli.codice-1= clienti.grpcli where clienti.codice='" & vCur1.GetString("codiceCli") & "'") > 0 Then
				Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select gruppocli.descrizione from gruppocli inner join clienti on gruppocli.codice-1= clienti.grpcli where clienti.codice='" & vCur1.GetString("codiceCli") & "'")
				If Not(vExecQuerySingleResult.StartsWith("Gruppo")) Then
					labelWrapper2.Text = labelWrapper2.Text & " (" & vExecQuerySingleResult & ")"
				End If
			End If
			If Main.vSql1.ExecQuerySingleResult("select abpost from clienti where codice='" & vCur1.GetString("codiceCli") & "'") = 0 Then
				labelWrapper2.TextColor = -14338583
			End If
		End If
		If Main.v_lastdatadocfm And vInt2 = -1 And vCur1.GetDouble("totale") <> -9.9999999E7 Then
			vInt2 = i
			panelWrapper.Color = -16711936
		End If
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("")
		labelWrapper3.Gravity = Bit.Or(16, 1)
		If vCur1.GetDouble("totale") = -9.9999999E7 Then
			labelWrapper3.Text = NumberFormat2(vCur1.GetDouble("totale"), 1, 2, 2, False)
		Else
			labelWrapper3.Text = "0.00"
		End If
		labelWrapper3.TextColor = -16777216
		labelWrapper3.TextSize = 16
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("")
		labelWrapper4.Text = i
		labelWrapper4.Visible = False
		panelWrapper.AddView(labelWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(12), i2)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(14), DipToCurrent(2), PerXToCurrent(36), i2)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(50), DipToCurrent(2), PerXToCurrent(14), i2)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(64), DipToCurrent(2), PerXToCurrent(12), i2)
		panelWrapper.AddView(imageViewWrapper2, PerXToCurrent(76), DipToCurrent(2), PerXToCurrent(12), i2)
		panelWrapper.AddView(imageViewWrapper3, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i2)
		panelWrapper.AddView(labelWrapper4, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i2)
		Return panelWrapper
	End If
	z = False
	imageViewWrapper.Visible = z
	Dim imageViewWrapper22 As ImageView
	imageViewWrapper22.Initialize("buttonFun2")
	imageViewWrapper22.Bitmap = LoadBitmap(File.DirAssets, "pdfgrey.png")
	imageViewWrapper22.Visible = vCur1.GetDouble("totale") = -9.9999999E7
	imageViewWrapper22.Tag = 0
	Dim imageViewWrapper32 As ImageView
	imageViewWrapper32.Initialize("buttonFun3")
	imageViewWrapper32.Bitmap = LoadBitmap(File.DirAssets, "fun_modifica veloce.png")
	Dim labelWrapper5 As Label
	labelWrapper5.Initialize("")
	labelWrapper5.Gravity = Bit.Or(16, 3)
	labelWrapper5.Text = vCur1.GetString("codiceCli")
	labelWrapper5.TextSize = 16
	labelWrapper5.TextColor = -16777216
	labelWrapper5.Typeface = Typeface.DEFAULT_BOLD
	Dim labelWrapper22 As Label
	labelWrapper22.Initialize("")
	labelWrapper22.Gravity = Bit.Or(16, 3)
	labelWrapper22.Text = Sub018(str)
	labelWrapper22.TextSize = 16
	labelWrapper22.TextColor = -16777216
	If Main.vSql1.ExecQuerySingleResult("select count(*) from clienti where codice='" & vCur1.GetString("codiceCli") & "'") > 0 Then
	End If
	If Main.v_lastdatadocfm Then
		vInt2 = i
		panelWrapper.Color = -16711936
	End If
	Dim labelWrapper32 As Label
	labelWrapper32.Initialize("")
	labelWrapper32.Gravity = Bit.Or(16, 1)
	If vCur1.GetDouble("totale") = -9.9999999E7 Then
	End If
	labelWrapper32.TextColor = -16777216
	labelWrapper32.TextSize = 16
	Dim labelWrapper42 As Label
	labelWrapper42.Initialize("")
	labelWrapper42.Text = i
	labelWrapper42.Visible = False
	panelWrapper.AddView(labelWrapper5, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(12), i2)
	panelWrapper.AddView(labelWrapper22, PerXToCurrent(14), DipToCurrent(2), PerXToCurrent(36), i2)
	panelWrapper.AddView(labelWrapper32, PerXToCurrent(50), DipToCurrent(2), PerXToCurrent(14), i2)
	panelWrapper.AddView(imageViewWrapper, PerXToCurrent(64), DipToCurrent(2), PerXToCurrent(12), i2)
	panelWrapper.AddView(imageViewWrapper22, PerXToCurrent(76), DipToCurrent(2), PerXToCurrent(12), i2)
	panelWrapper.AddView(imageViewWrapper32, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i2)
	panelWrapper.AddView(labelWrapper42, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i2)
	Return panelWrapper
End Sub

Sub Sub009(str As String, str2 As String, i As Int, z As Boolean, cursorWrapper As Cursor, z2 As Boolean) As Panel
	Dim i2 As Int
	Dim parseDouble As Double
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		If z Then
			i2 = -7829368
		Else
			i2 = -1
		End If
		Dim vObjectToNumber As Int = i2
		panelWrapper.Background = mod1.Sub158(vObjectToNumber, Colors.RGB(222, 222, 222))
		Dim checkBoxWrapper As CheckBox
		checkBoxWrapper.Initialize("")
		checkBoxWrapper.Gravity = Bit.Or(16, 3)
		checkBoxWrapper.Text = str2
		checkBoxWrapper.TextColor = -16777216
		checkBoxWrapper.TextSize = 16
		checkBoxWrapper.Checked = cursorWrapper.GetInt("FattFM") = 1
		checkBoxWrapper.Enabled = Not(z)
		Dim labelWrapper As Label
		labelWrapper.Initialize("ViewArt")
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.Text = "Importo: " & NumberFormat2(cursorWrapper.GetDouble("totale"), 1, 2, 2, False)
		Try
			If z2 Then
				parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) End" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "from CausaliPagamenti inner join pagamenti on pagamenti.codice=CausaliPagamenti.codice" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " where CausaliPagamenti.nmov=" & SmartStringFormatter("", cursorWrapper.GetString("nmov")) & " and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "(CausaliPagamenti.codice=2 or pagamenti.cassa=1)")
			Else
				parseDouble = Main.vSql2.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) End" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "from CausaliPagamenti where CausaliPagamenti.nmov=" & SmartStringFormatter("", cursorWrapper.GetString("nmov")) & " and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "(" & SmartStringFormatter("", vStr1) & ")")
			End If
			If parseDouble > 0 And parseDouble <> cursorWrapper.GetDouble("totale") Then
				labelWrapper.Text = labelWrapper.Text & CRLF & "(a Credito " & NumberFormat2(parseDouble, 1, 2, 2, False) & ")"
			End If
		Catch
			mod1.Sub217(LastException.Message)
		End Try
		labelWrapper.TextColor = vObjectToNumber
		labelWrapper.Background = mod1.Sub155(-16711936, 25)
		labelWrapper.TextSize = 16
		labelWrapper.Tag = str
		labelWrapper.Enabled = Not(z)
		checkBoxWrapper.Background = mod1.Sub158(vObjectToNumber, Colors.RGB(222, 222, 222))
		checkBoxWrapper.Tag = str
		panelWrapper.AddView(checkBoxWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(60), i)
		panelWrapper.AddView(labelWrapper, PerXToCurrent(62), DipToCurrent(2), PerXToCurrent(20), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub010(str As String, i As Int) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Background = mod1.Sub155(-16776961, 0)
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.Gravity = Bit.Or(16, 3)
		labelWrapper.Text = vCur2.GetString("datam").SubString2(3, 5) & "/" & vCur2.GetString("datam").SubString2(0, 2) & "/" & vCur2.GetString("datam").SubString2(6, 10)
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -1
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper.Background = mod1.Sub155(-16776961, 25)
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("")
		labelWrapper2.Gravity = Bit.Or(16, 1)
		labelWrapper2.Text = NumberFormat2(vCur2.GetDouble("totale"), 1, 2, 2, False)
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -1
		labelWrapper2.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper2.Background = mod1.Sub155(-16776961, 25)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("")
		labelWrapper3.Gravity = Bit.Or(16, 1)
		labelWrapper3.Text = Sub018(vCur2.GetString("clides"))
		labelWrapper3.TextSize = 16
		labelWrapper3.TextColor = -1
		labelWrapper3.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper3.Background = mod1.Sub155(-16776961, 25)
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("selmovim")
		labelWrapper4.Gravity = Bit.Or(16, 1)
		labelWrapper4.Text = "Fatt. Numero " & vCur2.GetString("nfat")
		labelWrapper4.TextSize = 16
		labelWrapper4.TextColor = -1
		labelWrapper4.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper4.Background = mod1.Sub155(Colors.RGB(20, 145, 34), 25)
		Dim labelWrapper5 As Label
		labelWrapper5.Initialize("")
		labelWrapper5.Text = str
		labelWrapper5.Visible = False
		panelWrapper.AddView(labelWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(22), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(42), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper4, PerXToCurrent(62), DipToCurrent(2), PerXToCurrent(30), i)
		panelWrapper.AddView(labelWrapper5, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub daData_Click
	Dim dateDialog As DateDialog
	Dim vObjectToString As String = daData.Tag
	dateDialog.Year = vObjectToString.SubString2(0, 4)
	dateDialog.DayOfMonth = vObjectToString.SubString2(9, 11)
	dateDialog.Month = vObjectToString.SubString2(5, 7)
	Dim vShow As Int = dateDialog.Show("Impostare la data di inizio ricerca", "Imposta Filtro Data", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		daData.Tag = dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & " 00:00:00"
		daData.Text = "Dal " & NumberFormat(dateDialog.DayOfMonth, 2, 0) & "/" & NumberFormat(dateDialog.Month, 2, 0) & "/" & dateDialog.Year
	End If
	mod1.Sub081
End Sub

Sub dataFattura_Click
	Dim dateDialog As DateDialog
	Dim vObjectToString As String = dataFattura.Tag
	dateDialog.Year = vObjectToString.SubString2(6, 10)
	dateDialog.DayOfMonth = vObjectToString.SubString2(3, 5)
	dateDialog.Month = vObjectToString.SubString2(0, 2)
	Dim vShow As Int = dateDialog.Show("Impostare la data di registrazione della fattura", "Data Fattura", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		dataFattura.Tag = NumberFormat(dateDialog.Month, 2, 0) & "/" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & "/" & dateDialog.Year
		dataFattura.Text = "Data Fattura " & NumberFormat(dateDialog.DayOfMonth, 2, 0) & "/" & NumberFormat(dateDialog.Month, 2, 0) & "/" & dateDialog.Year
	End If
	mod1.Sub081
End Sub

Sub DelList_Click
	Dim vTmp As Int = vcustomlistviewold2.Sub008 - 1
	Dim i As Int
	For i = 0 To vTmp
		Dim checkBoxWrapper As CheckBox = vcustomlistviewold2.getpanel(i).GetView(0)
		If checkBoxWrapper.Checked Then
			checkBoxWrapper.Checked = False
		End If
	Next
End Sub

Sub edtCUP_EnterPressed
	Dim editTextWrapper As EditText = Sender
	Dim i As Int = 50
	Dim z As Boolean = False
	If IsNumber(editTextWrapper.Tag) Then
		i = modfunstr.Sub006(editTextWrapper.Tag)
	Else If editTextWrapper.Tag = "Mail" Then
		z = True
	End If
	editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "").Trim, i)
	If z And editTextWrapper.Text <> "" Then
		If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", editTextWrapper.Text)) Then
			ToastMessageShow("L'indirizzo email non è corretto", True)
			editTextWrapper.Text = ""
			CallSubDelayed(Me, "Hide_Keyboard")
			mod1.Sub081
			Return
		End If
	End If
End Sub

Sub edtCUP_FocusChanged(z As Boolean)
	Dim editTextWrapper As EditText = Sender
	Dim i As Int = 50
	Dim z2 As Boolean = False
	If IsNumber(editTextWrapper.Tag) Then
		i = modfunstr.Sub006(editTextWrapper.Tag)
	Else If editTextWrapper.Tag = "Mail" Then
		z2 = True
	End If
	If z Then
		vIME1.Initialize("IME")
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
	Else
		editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "").Trim, i)
		If z2 And editTextWrapper.Text <> "" Then
			If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", editTextWrapper.Text.ToLowerCase)) Then
				ToastMessageShow("L'indirizzo email non è corretto", True)
				editTextWrapper.Text = ""
				CallSubDelayed(Me, "Hide_Keyboard")
				mod1.Sub081
				Return
			End If
		End If
	End If
End Sub

Sub edtCUP_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	Dim i As Int = 50
	If IsNumber(editTextWrapper.Tag) Then
		i = modfunstr.Sub006(editTextWrapper.Tag)
	End If
	If str2.Length > i Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
End Sub

Sub edtImportoBollo_EnterPressed
	vIME1.HideKeyboard
	edtImportoBollo.Text = NumberFormat2(mod1.Sub056(edtImportoBollo.Text), 1, 2, 2, False)
	edtImportoBollo.Hint = edtImportoBollo.Text
End Sub

Sub edtImportoBollo_FocusChanged(z As Boolean)
	If z Then
		edtImportoBollo.Text = ""
		vIME1.Initialize("IME")
		Dim editText As EditText = edtImportoBollo
		Dim editTextWrapper As EditText = edtImportoBollo
		vIME1.SetCustomFilter(editText, 12290, "0123456789.")
		vIME1.ShowKeyboard(edtImportoBollo)
		Return
	End If
	edtImportoBollo.Text = NumberFormat2(mod1.Sub056(edtImportoBollo.Text), 1, 2, 2, False)
End Sub

Sub edtImportoBollo_TextChanged(str As String, str2 As String)
	If str2.Length > 8 Then
		edtImportoBollo.Text = str
		edtImportoBollo.SelectionStart = str.Length
		Return
	End If
End Sub

Sub errprtact(i As Int) As Int
	Dim vTmp As Int = mod1.Sub101(i)
	If vTmp > 0 Then
		Dim vObjectToCharSequence As Object = "Le stampe verranno inviate alla nuova stampante fino al prossimo riavvio del programma."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	Return vTmp
End Sub

Sub Sub011(map As Map)
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice = 'SEND'")
	stringBuilderWrapper.Append("ve" & TAB)
	stringBuilderWrapper.Append(Main.v_recordver & CRLF)
	stringBuilderWrapper.Append("nu" & TAB)
	stringBuilderWrapper.Append(parseDouble & CRLF)
	Dim str As String = map.Get("numero") & "_" & map.Get("dataFatt") & "_" & map.Get("negozio") & "_" & map.Get("cassa")
	stringBuilderWrapper.Append("FattFM" & TAB)
	stringBuilderWrapper.Append(map.Get("cliente") & TAB)
	stringBuilderWrapper.Append(map.Get("totale") & TAB)
	stringBuilderWrapper.Append(map.Get("datam") & TAB)
	stringBuilderWrapper.Append(map.Get("numero") & TAB)
	stringBuilderWrapper.Append(map.Get("dataFatt") & TAB)
	stringBuilderWrapper.Append(str & TAB)
	stringBuilderWrapper.Append(map.Get("negozio") & TAB)
	stringBuilderWrapper.Append(map.Get("cassa") & CRLF)
	Dim i As Int
	For i = 0 To 9
		stringBuilderWrapper.Append("CastellettoFM" & TAB)
		stringBuilderWrapper.Append(str & TAB)
		stringBuilderWrapper.Append(map.GetDefault("iva" & i, "-1") & TAB)
		stringBuilderWrapper.Append(map.GetDefault("aliquota" & i, "-1") & TAB)
		stringBuilderWrapper.Append(map.GetDefault("imponibile" & i, "-1") & TAB)
		stringBuilderWrapper.Append(map.GetDefault("imposta" & i, "-1") & CRLF)
	Next
	Main.vSql1.ExecNonQuery("update progressivi set valore = " & parseDouble + 1 & " where codice = 'SEND'")
	Dim textWriterWrapper As TextWriter
	textWriterWrapper.Initialize(File.OpenOutput(vStr10, "movimento.txt", False))
	textWriterWrapper.Write(stringBuilderWrapper)
	Dim vObjectToString As String = map.Get("cliente")
	mod1.Sub128(textWriterWrapper, vObjectToString, 1)
	textWriterWrapper.Close
	Dim vTmp As String = mod1.Sub059(mod1.Sub058)
	Dim archiverForB4A As ArchiverForB4A
	archiverForB4A.ZipFiles(vStr10, Array As String("movimento.txt"), vStr10, "DaCasse" & vTmp & "1.tmp", "")
	File.Delete(vStr10, "movimento.txt")
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/fatturafm.java, metodo m2… (riga 2663).
Sub Sub012(z As Boolean, i As Int)
	Dim map As Map
	Dim cursorWrapper As Cursor
	Dim i2 As Int
	Dim str As String
	Dim str2 As String
	Dim str3 As String
	Dim str4 As String
	Dim str5 As String
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim str6 As String
	Dim cursorWrapper2 As Cursor
	Dim str7 As String
	Dim i3 As Int
	Dim str8 As String
	Dim i4 As Int
	Dim z4 As Boolean
	Dim i5 As Int
	Dim str9 As String
	Dim d As Double
	Dim i6 As Int
	Dim str10 As String
	Dim doubleValue As Double
	Try
		'map = Map
		Dim paperSize As PDFPaperSizes = vPDFPaperSizes1
		Dim paperSize2 As PDFPaperSizes = vPDFPaperSizes1
		vPDFWriter1.Initialize("PDFWriter1", 595, 842)
		Dim standardFonts As PDFStandardFonts = Main.vPDFStandardFonts1
		Dim standardFonts2 As PDFStandardFonts = Main.vPDFStandardFonts1
		vPDFWriter1.setFont("Type1", "Courier-Bold")
		Dim vObjectToString As String = dataFattura.Tag
		Dim text As String = dataFattura.Text
		Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='" & vStr3 & "'")
		If z Then
			Dim parseDouble2 As Int = vStr5
			Dim cursorWrapper3 As Cursor
			Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vStr6 & "'")
			cursorWrapper4.Position = 0
			cursorWrapper = cursorWrapper4
			i2 = parseDouble2
			str = vStr8
			str2 = vStr7
		Else
			Dim cursorWrapper5 As Cursor
			Dim cursorWrapper6 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vCur1.GetString("codiceCli") & "'")
			cursorWrapper6.Position = 0
			cursorWrapper = cursorWrapper6
			i2 = parseDouble
			str = text
			str2 = vObjectToString
		End If
		str3 = ""
		If Not(Main.v_attivafe) Then
			str4 = ""
		Else
			Dim str13 As String = str2.SubString(6) & "-" & str2.SubString2(0, 2) & "-" & str2.SubString2(3, 5)
			If Not(vMap1.IsInitialized) Then
				Return
			End If
			If vMap1.GetDefault("Memo", "") <> "" Then
				str3 = vMap1.GetDefault("Memo", "")
			End If
			Main.vDbl2 = 0
			If 2 = vMap1.GetDefault("EsigibilitaIVA", 0) Then
				Main.vDbl2 = Sub019(" from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & i2 & " and datfat_fm = '" & str2 & "'")
			End If
			str4 = str13
		End If
		If Not(z) Then
			Main.vSql2.ExecNonQuery("update headmov set nfat_fm = " & i2 & ",sezionale='" & vStr2 & "',datfat_fm = '" & str2 & "' where (select count(*) from CausaliPagamenti where CausaliPagamenti.nmov= headmov.nmov And (" & vStr1 & "))>0 And  FattFM=1 And  cliente = '" & vCur1.GetString("codiceCli").Trim & "' and " & vStr4)
			Main.vSql1.ExecNonQuery("update  progressivi set valore = " & i2 + 1 & "  where codice ='" & vStr3 & "'")
		End If
		str5 = "where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & i2 & " and datfat_fm = '" & str2 & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm"
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Main.v_fatturafmt2 Then
		If Not(cursorWrapper.GetInt("abpost") = 1 And cursorWrapper.GetDouble("fido") > 0) Then
			z2 = True
			If z2 Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" & SmartStringFormatter("", cursorWrapper.GetString("codice").Trim) & "' and fido >0") > 0 Then
					z3 = False
					If Not(z3) Then
						str6 = "Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & vStr1 & ")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.nmov,headmov.dataeoraffm,headmov.datam,headmov.memo as clides,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & i2 & " and datfat_fm = '" & str2 & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm"
					Else
						str6 = "Select sum(importo) as tot, headmov.nric as Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.nmov,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva,headmov.memo as clides from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & i2 & " and datfat_fm = '" & str2 & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap,venduto.iva order by dataeoraffm"
					End If
					If Main.v_attivafe Then
						Dim cursorWrapper7 As Cursor
						Dim cursorWrapper8 As Cursor = Main.vSql2.ExecQuery("Select iva.codice as codice from venduto inner join iva on venduto.iva=iva.codice inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & i2 & " and datfat_fm = '" & str2 & "' ")
						If cursorWrapper8.RowCount > 0 Then
							Dim rowCount As Int = cursorWrapper8.RowCount - 1
							Dim i7 As Int
							For i7 = 0 To rowCount
								cursorWrapper8.Position = i7
								If Main.vSql1.ExecQuerySingleResult("select count(*) from iva where codice=" & cursorWrapper8.GetString("codice") & " and natura=6") > 0 Then
									Exit
								End If
							Next
						End If
					End If
					Dim cursorWrapper9 As Cursor
					cursorWrapper2 = Main.vSql2.ExecQuery(str6)
					If cursorWrapper2.RowCount > 0 Then
						If Not(Main.v_attivafe) Then
							Dim modalmlineVar As modalmline
							modalmlineVar.Initialize("FatturaFM", 28, Activity)
							Dim vRGB As Int = Colors.RGB(150, 150, 150)
							Dim vRGB2 As Int = Colors.RGB(150, 150, 150)
							modalmlineVar.Sub004(vRGB, vRGB2, -256)
							Dim str14 As String = ""
							If z Then
								If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='F_" & i2 & "'") > 0 Then
									str14 = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='F_" & i2 & "'")
								End If
							Else If cursorWrapper.GetString("codice").Trim <> "" Then
								If Main.vSql1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" & cursorWrapper.GetString("codice").Trim & "'") > 0 Then
									str14 = Main.vSql1.ExecQuerySingleResult("select testo from TestiCli where codice='" & cursorWrapper.GetString("codice").Trim & "'")
								End If
							End If
							If str14 = "" Then
								If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'") > 0 Then
									str14 = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'")
								End If
							End If
							str7 = modalmlineVar.Sub002("Testo aggiuntivo Fattura", "Aggiungi un testo", "", str14)
						Else
							str7 = str3
						End If
						Dim parseDouble3 As Double = Main.vSql2.ExecQuerySingleResult("Select case when sum(scov) is null then 0 else sum(scov) end  from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & i2 & " and datfat_fm = '" & str2 & "'")
						If i = 0 Then
							i = cursorWrapper2.RowCount / 29 + 1
						End If
						vLst1.Clear
						Dim i8 As Int
						For i8 = 0 To 30
							vLst1.Add(0)
						Next
						If Main.v_stampafattura = 300 Then
							If Main.v_iprpi = "" Then
								Dim vObjectToCharSequence As Object = "Non è stato configurato il ServiceBox." & CRLF & "La fattura verrà stampata con il sistema integrato"
								Dim vObjectToCharSequence2 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
							Else
								Dim dirDefaultExternal As String = File.DirDefaultExternal
								File.Copy(dirDefaultExternal, "Anagra.db", mod1.vStr4, "AnagraDocFM.db")
								Dim sql5 As SQL
								sql5.Initialize(mod1.vStr4, "AnagraDocFM.db", True)
								sql5.ExecNonQuery("delete from venduto")
								Dim cursorWrapper10 As Cursor
								Dim cursorWrapper11 As Cursor = Main.vSql2.ExecQuery("Select" & CRLF & TAB & TAB & TAB & TAB & "venduto.codint,venduto.codice,venduto.descrizione,venduto.brep," & CRLF & TAB & TAB & TAB & TAB & "venduto.qta,venduto.prezzov,venduto.reparto,venduto.iva," & CRLF & TAB & TAB & TAB & TAB & "venduto.importo,venduto.aliquota2,venduto.nmov from venduto " & CRLF & TAB & TAB & TAB & TAB & "inner join headmov on venduto.nmov = headmov.nmov " & CRLF & TAB & TAB & TAB & TAB & "inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov " & CRLF & TAB & TAB & TAB & TAB & "where CausaliPagamenti.codice=2 And  headmov.nfat=0 " & CRLF & TAB & TAB & TAB & TAB & "And  FattFM=1 And  nfat_fm =" & SmartStringFormatter("", i2) & " " & CRLF & TAB & TAB & TAB & TAB & "And datfat_fm = '" & SmartStringFormatter("", str2) & "' order by dataeoraffm")
								Dim list As List
								list.Initialize
								Dim rowCount2 As Int = cursorWrapper11.RowCount - 1
								Dim i9 As Int
								For i9 = 0 To rowCount2
									cursorWrapper11.Position = i9
									Dim map2 As Map
									map2.Initialize
									map2.Put("codint", cursorWrapper11.GetString("codint"))
									map2.Put("codice", cursorWrapper11.GetString("codice"))
									map2.Put("descrizione", cursorWrapper11.GetString("descrizione"))
									map2.Put("brep", cursorWrapper11.GetInt("brep"))
									map2.Put("reparto", cursorWrapper11.GetInt("reparto"))
									map2.Put("iva", cursorWrapper11.GetInt("iva"))
									map2.Put("nmov", cursorWrapper11.GetInt("nmov"))
									map2.Put("qta", cursorWrapper11.GetDouble("qta"))
									map2.Put("prezzov", cursorWrapper11.GetDouble("prezzov"))
									map2.Put("importo", cursorWrapper11.GetDouble("importo"))
									map2.Put("aliquota2", cursorWrapper11.GetDouble("aliquota2"))
									list.Add(map2)
								Next
								dbutil.Sub007(sql5, "venduto", list)
								cursorWrapper11.Close
								sql5.ExecNonQuery("CREATE TABLE vendutoFM (chiave INTEGER PRIMARY KEY ," & CRLF & TAB & TAB & TAB & TAB & "tot numeric(18,2) not null default 0,descrizione nvarchar(100) NOT NULL DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & "descrizioneCliente nvarchar(50) NOT NULL DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & "Ricevuta int not null default 0,nmov int not null default 0," & CRLF & TAB & TAB & TAB & TAB & "numero int not null default 0,dataeoraffm datetime,datam datetime," & CRLF & TAB & TAB & TAB & TAB & "matricolacassap nvarchar(20) not null default ''," & CRLF & TAB & TAB & TAB & TAB & "iva  int not null default 0,clides nvarchar(50) NOT NULL DEFAULT '')")
								Dim str15 As String = " del " & str.SubString(12).Trim
								If Main.v_orafatt Then
									str15 = str15 & " " & NumberFormat(DateTime.GetHour(mod1.Sub058), 2, 0) & ":" & NumberFormat(DateTime.GetMinute(mod1.Sub058), 2, 0)
								End If
								Sub020(str)
								If vStr2 <> "" Then
									str10 = "Fattura N." & i2 & "/" & vStr2 & str15
								Else
									str10 = "Fattura N." & i2 & str15
								End If
								Dim stringBuilderWrapper As StringBuilder
								stringBuilderWrapper.Initialize
								Sub021(str7, i2, stringBuilderWrapper, "stampaPDF")
								If z Then
									doubleValue = vDbl1
								Else
									doubleValue = vCur1.GetDouble("totale")
								End If
								Dim map3 As Map
								map3.Initialize
								map3.Put("nmov", "0")
								map3.Put("TmpHeadDoc", str10)
								map3.Put("Totale", NumberFormat2(doubleValue, 1, 2, 2, False))
								map3.Put("Cliente", cursorWrapper.GetString("codice"))
								map3.Put("TmpFattura", stringBuilderWrapper.ToString)
								map3.Put("v_Barra", vStr2)
								File.WriteMap(mod1.vStr4, "MappaDoc.txt", map3)
								Dim list2 As List
								list2.Initialize
								Dim rowCount3 As Int = cursorWrapper2.RowCount - 1
								Dim i10 As Int
								For i10 = 0 To rowCount3
									cursorWrapper2.Position = i10
									If cursorWrapper2.GetDouble("tot") <> 0 Then
										Dim vGetString As String = cursorWrapper2.GetString("dataeoraffm")
										Dim vGetString2 As String = cursorWrapper2.GetString("matricolacassap")
										If vGetString = Null Then
											vGetString = cursorWrapper2.GetString("datam")
										End If
										Dim str16 As String = IIf(vGetString2 = Null, "", vGetString2)
										Dim str17 As String = ""
										If cursorWrapper2.GetInt("numero") > 0 Then
											str17 = "SCO.:" & Sub013(cursorWrapper2) & " del " & vGetString.SubString2(3, 5) & "/" & vGetString.SubString2(0, 2) & "/" & vGetString.SubString(6) & " MF:" & str16
										Else If cursorWrapper2.GetInt("Ricevuta") > 0 Then
											vGetString = cursorWrapper2.GetString("datam")
											str17 = "RIC.:" & cursorWrapper2.GetString("Ricevuta") & " del " & vGetString.SubString2(3, 5) & "/" & vGetString.SubString2(0, 2) & "/" & vGetString.SubString(6)
										End If
										Dim vGetString3 As String = cursorWrapper2.GetString("clides")
										If vGetString3.Contains("Tess.") Then
											vGetString3 = vGetString3.SubString(vGetString3.IndexOf("Tess.")).Replace("(", "-").Replace(")", "-")
										End If
										Dim map4 As Map
										map4.Initialize
										map4.Put("tot", cursorWrapper2.GetDouble("tot"))
										map4.Put("Ricevuta", cursorWrapper2.GetInt("Ricevuta"))
										map4.Put("numero", cursorWrapper2.GetInt("numero"))
										map4.Put("nmov", cursorWrapper2.GetInt("nmov"))
										map4.Put("dataeoraffm", vGetString)
										map4.Put("descrizione", str17 & " " & vGetString3)
										map4.Put("datam", cursorWrapper2.GetString("datam"))
										map4.Put("matricolacassap", str16)
										map4.Put("iva", cursorWrapper2.GetInt("iva"))
										map4.Put("clides", cursorWrapper2.GetString("clides"))
										list2.Add(map4)
									End If
								Next
								dbutil.Sub007(sql5, "vendutoFM", list2)
								sql5.Close
								Dim strArr() As String = Array("AnagraDocFM.db", "MappaDoc.txt")
								Dim archiverForB4A As ArchiverForB4A
								archiverForB4A.ZipFiles(mod1.vStr4, strArr, mod1.vStr4, "BKAnagra.zip", "")
								CallSub2(rpidevice, "SendAnagraPerDoc", "TipoDocFatturaFM")
								Return
							End If
						End If
						Dim customprogressdialogVar As CustomProgressDialog
						Dim vPerYToCurrent As Double = PerYToCurrent(10)
						customprogressdialogVar._initialize(Activity, PerXToCurrent(60), (PerXToCurrent(100) - PerXToCurrent(60)) / 2, vPerYToCurrent, "", "", -12303292, 0, "Progress", False)
						Dim str19 As String = ""
						Dim d2 As Double = 0
						Dim i11 As Int = 0
						Dim z5 As Boolean = False
						Dim i12 As Int = 1
						Do While Not(z5)
							Sub016(i2, str, " Pag." & i12 & " di " & i, cursorWrapper)
							customprogressdialogVar._showprogress("Generazione PDF in corso ...", -1, i12 * 100 / i)
							DoEvents
							DoEvents
							If i11 - 1 >= cursorWrapper2.RowCount - 1 Then
								Exit
							End If
							Dim rowCount4 As Int = cursorWrapper2.RowCount - 1
							Dim i13 As Int = 100
							Dim i14 As Int = i11
							Dim str20 As String = str19
							Do While True
								If i14 > rowCount4 Then
									i4 = i11
									z4 = z5
									i5 = i12
									Exit
								End If
								cursorWrapper2.Position = i14
								If cursorWrapper2.GetDouble("tot") <> 0 Then
									Dim vGetString4 As String = cursorWrapper2.GetString("dataeoraffm")
									Dim vGetString5 As String = cursorWrapper2.GetString("matricolacassap")
									If vGetString4 = Null Then
										vGetString4 = cursorWrapper2.GetString("datam")
									End If
									Dim str21 As String = IIf(vGetString5 = Null, "", vGetString5)
									Dim str22 As String = ""
									If cursorWrapper2.GetInt("numero") > 0 Then
										str22 = "SCO.:" & Sub013(cursorWrapper2) & " del " & vGetString4.SubString2(3, 5) & "/" & vGetString4.SubString2(0, 2) & "/" & vGetString4.SubString(6) & " MF:" & str21
										str9 = vGetString4
									Else If cursorWrapper2.GetInt("Ricevuta") > 0 Then
										Dim vGetString6 As String = cursorWrapper2.GetString("datam")
										str22 = "RIC.:" & cursorWrapper2.GetString("Ricevuta") & " del " & vGetString6.SubString2(3, 5) & "/" & vGetString6.SubString2(0, 2) & "/" & vGetString6.SubString(6)
										str9 = vGetString6
									Else
										str9 = vGetString4
									End If
									Dim vGetString7 As String = cursorWrapper2.GetString("clides")
									Dim paperSize3 As PDFPaperSizes = vPDFPaperSizes1
									vPDFWriter1.addText(2380 / 100, 750 - i13, 11, str22)
									If vGetString7.Contains("Tess.") Then
										i6 = i13 + 7
										d = d2 + 0.5
										Dim paperSize4 As PDFPaperSizes = vPDFPaperSizes1
										vPDFWriter1.addText(2380 / 100, 750 - i6, 8, vGetString7.SubString(vGetString7.IndexOf("Tess.")).Replace("(", "-").Replace(")", "-"))
									Else
										d = d2
										i6 = i13
									End If
									Dim paperSize5 As PDFPaperSizes = vPDFPaperSizes1
									vPDFWriter1.addText(44625 / 100, 750 - i6, 11, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper2.GetDouble("tot"), 1, 2, 2, False), 9))
									Dim paperSize6 As PDFPaperSizes = vPDFPaperSizes1
									vPDFWriter1.addText(53550 / 100, 750 - i6, 11, NumberFormat2(cursorWrapper2.GetInt("iva"), 1, 0, 0, False))
									vLst1.Set(cursorWrapper2.GetInt("iva"), vLst1.Get(cursorWrapper2.GetInt("iva")) + cursorWrapper2.GetDouble("tot"))
									d2 = d
									i13 = i6
									str20 = str9
								End If
								Dim i15 As Int = i13 + 15
								If d2 >= 28 Then
									i4 = i14 + 1
									d2 = 0
									vPDFWriter1.newPage
									Dim standardFonts3 As PDFStandardFonts = Main.vPDFStandardFonts1
									Dim standardFonts4 As PDFStandardFonts = Main.vPDFStandardFonts1
									vPDFWriter1.setFont("Type1", "Courier-Bold")
									i5 = i12 + 1
									z4 = z5
									Exit
								End If
								If i14 = cursorWrapper2.RowCount - 1 Then
									z4 = True
									i5 = i12
									i4 = i11
									Exit
								End If
								d2 = d2 + 1
								i13 = i15
								i14 = i14 + 1
							Loop
							str19 = str20
							i11 = i4
							z5 = z4
							i12 = i5
						Loop
						If customprogressdialogVar.isshow Then
							customprogressdialogVar._hide
						End If
						Dim stringBuilderWrapper2 As StringBuilder
						stringBuilderWrapper2.Initialize
						Sub021(str7, i2, stringBuilderWrapper2, "stampaPDF")
						Dim i16 As Int = 150
						If stringBuilderWrapper2.ToString = "" Then
							i3 = 150
						Else
							Dim vSplit() As String = Regex.Split(CRLF, stringBuilderWrapper2.ToString)
							Dim paperSize7 As PDFPaperSizes = vPDFPaperSizes1
							vPDFWriter1.addText(1190 / 100, 150, 15, "Note:")
							Dim length As Int = vSplit.Length - 1
							Dim i17 As Int
							For i17 = 0 To length
								i16 = 138 - i17 * 12
								If vSplit(i17).Trim <> "" Then
									Dim paperSize8 As PDFPaperSizes = vPDFPaperSizes1
									vPDFWriter1.addText(1190 / 100, i16, 13, vSplit(i17))
								End If
							Next
							i3 = i16 - 12
						End If
						If parseDouble3 > 0 Then
							Dim paperSize9 As PDFPaperSizes = vPDFPaperSizes1
							vPDFWriter1.addText(1190 / 100, i3, 13, "Totale sconti applicati:" & NumberFormat2(parseDouble3, 1, 2, 2, False))
						End If
						Dim paperSize10 As PDFPaperSizes = vPDFPaperSizes1
						Dim paperSize11 As PDFPaperSizes = vPDFPaperSizes1
						vPDFWriter1.addRectangle(30345 / 100, 160, 26775 / 100, -150)
						Dim paperSize12 As PDFPaperSizes = vPDFPaperSizes1
						vPDFWriter1.addText(30940 / 100, 140, 13, "IVA")
						Dim paperSize13 As PDFPaperSizes = vPDFPaperSizes1
						vPDFWriter1.addText(35700 / 100, 140, 13, "Aliq.")
						Dim paperSize14 As PDFPaperSizes = vPDFPaperSizes1
						vPDFWriter1.addText(40460 / 100, 140, 13, "Imponibile")
						Dim paperSize15 As PDFPaperSizes = vPDFPaperSizes1
						vPDFWriter1.addText(49980 / 100, 140, 13, "Imposta")
						Dim paperSize16 As PDFPaperSizes = vPDFPaperSizes1
						Dim paperSize17 As PDFPaperSizes = vPDFPaperSizes1
						vPDFWriter1.addLine(30345 / 100, 138, 57120 / 100, 138)
						If Main.v_attivaterminale And Not(z) Then
							map.Initialize
							map.Put("cliente", cursorWrapper.GetString("codice"))
							If z Then
								map.Put("totale", vDbl1)
							Else
								map.Put("totale", vCur1.GetString("totale"))
							End If
							map.Put("datam", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
							map.Put("numero", i2)
							map.Put("dataFatt", str19.SubString2(3, 5) & "/" & str19.SubString2(0, 2) & "/" & str19.SubString2(6, 10))
							map.Put("negozio", Main.v_nnegozio)
							map.Put("cassa", Main.v_numcassa)
						End If
						Dim i18 As Int = 125
						Dim i19 As Int
						For i19 = 0 To 9
							If vLst1.Get(i19) > 0 Then
								vCur3.Position = i19
								Dim paperSize18 As PDFPaperSizes = vPDFPaperSizes1
								vPDFWriter1.addText(30940 / 100, i18, 13, vCur3.GetString("codice"))
								If vCur3.GetDouble("aliquota2") = 0 Then
									Dim paperSize19 As PDFPaperSizes = vPDFPaperSizes1
									vPDFWriter1.addText(35700 / 100, i18, 13, vCur3.GetString("descrizione"))
								Else
									Dim paperSize20 As PDFPaperSizes = vPDFPaperSizes1
									vPDFWriter1.addText(35700 / 100, i18, 13, mod1.Sub093(vCur3.GetDouble("aliquota2")) & " %")
								End If
								Dim vRound2 As Double = Round2(vLst1.Get(i19) - vLst1.Get(i19) / (1 + vCur3.GetDouble("aliquota2") / 100), 2)
								Dim paperSize21 As PDFPaperSizes = vPDFPaperSizes1
								vPDFWriter1.addText(40460 / 100, i18, 13, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(vLst1.Get(i19) - vRound2, 1, 2, 2, False), 9))
								Dim paperSize22 As PDFPaperSizes = vPDFPaperSizes1
								vPDFWriter1.addText(49385 / 100, i18, 13, modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(vRound2, 1, 2, 2, False), 9))
								i18 = i18 - 15
								If Main.v_attivaterminale And Not(z) Then
									map.Put("iva" & i19, vCur3.GetString("codice"))
									map.Put("aliquota" & i19, vCur3.GetString("aliquota2"))
									map.Put("imponibile" & i19, NumberFormat2(vLst1.Get(i19) - vRound2, 1, 2, 2, False))
									map.Put("imposta" & i19, NumberFormat2(vRound2, 1, 2, 2, False))
								End If
							End If
							i18 = i18
						Next
						Dim z6 As Boolean = True
						If Main.v_attivafe And z Then
							Dim vObjectToCharSequence3 As Object = "Si desidera anche rigenerare il file xml ?"
							Dim vObjectToCharSequence4 As Object = Main.vStr8
							Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
							z6 = (vMsgbox2 = -1)
						End If
						If Main.v_attivafe And z6 Then
							Dim list3 As List
							Sub007(str5, z3)
							Sub020(str)
							Dim trim As String = cursorWrapper.GetString("codice").Trim
							Dim str23 As String = " h.nfat=0 and  FattFM=1 and h.cliente ='" & cursorWrapper.GetString("codice").Trim & "' and nfat_fm =" & i2 & " and datfat_fm = '" & str2 & "'"
							Dim vTmp As String = mod1.Sub002(str4, i2, vMap1, trim, cursorWrapper, str23, True, list3, True, vStr2, Activity)
							If vTmp <> "" Then
								If File.Exists(File.DirDefaultExternal & "/FE", vTmp) Then
									If Main.v_inviofe Then
										Dim str24 As String = "Fattura Num." & i2
										Dim str25 As String = " del " & str.SubString(12).Trim
										If vStr2 <> "" Then
											str8 = "Fattura N." & i2 & "/" & vStr2
										Else
											str8 = "Fattura N." & i2
										End If
										Dim str26 As String = str8 & str25
										CallSub3(httpclient, "ComunicaConInviaFE", "http://127.0.0.1:12512/R__INVIO__" & vTmp & "__", str26)
									End If
								End If
							End If
						End If
						If z Then
							Dim paperSize23 As PDFPaperSizes = vPDFPaperSizes1
							vPDFWriter1.addText(30940 / 100, 20, 16, "Tot. Fattura EUR: " & NumberFormat2(vDbl1, 1, 2, 2, False))
						Else
							Dim paperSize24 As PDFPaperSizes = vPDFPaperSizes1
							vPDFWriter1.addText(30940 / 100, 20, 16, "Tot. Fattura EUR: " & NumberFormat2(vCur1.GetDouble("totale"), 1, 2, 2, False))
							If Main.v_attivaterminale Then
								Sub011(map)
							End If
						End If
						vPDFWriter1.ConverseDocument
						Dim vTmp_ As String = mod1.Sub039(cursorWrapper.GetString("descrizione"))
						Dim sb8 As String = mod1.vStr4 & "/fatture"
						Dim str27 As String = "Fatt.N." & i2 & " di " & vTmp_ & ".PDF"
						vPDFWriter1.outputToFile(sb8, str27, vStr9, "ISO-8859-1")
						If Main.v_usbpath <> "" Then
							Try
								Dim sb10 As String = mod1.vStr4 & "/fatture"
								Dim str28 As String = "Fatt.N." & i2 & " di " & vTmp_ & ".PDF"
								File.Copy(sb10, str28, Main.v_usbpath, "Fatt.N." & i2 & " di " & vTmp_ & ".PDF")
							Catch
								mod1.Sub217(LastException.Message)
							End Try
						End If
						preparamailvisualizza("Fatt.N." & i2 & " di " & vTmp_ & ".PDF", cursorWrapper.GetString("mail"))
					End If
					Return
				End If
			End If
			z3 = z2
			If Not(z3) Then
			End If
			If Main.v_attivafe Then
			End If
			Dim cursorWrapper92 As Cursor
			cursorWrapper2 = Main.vSql2.ExecQuery(str6)
			If cursorWrapper2.RowCount > 0 Then
			End If
			Return
		End If
	End If
	z2 = False
	If z2 Then
	End If
	z3 = z2
	If Not(z3) Then
	End If
	If Main.v_attivafe Then
	End If
	Dim cursorWrapper922 As Cursor
	cursorWrapper2 = Main.vSql2.ExecQuery(str6)
	If cursorWrapper2.RowCount > 0 Then
	End If
End Sub

Sub Sub013(cursorWrapper As Cursor) As String
	Dim vGetString As String = cursorWrapper.GetString("numero")
	If cursorWrapper.GetInt("nChiusura") > 0 Then
		Return cursorWrapper.GetString("nChiusura") & "-" & cursorWrapper.GetString("numero")
	End If
	Return vGetString
End Sub

Sub hide_keyboard
	Dim phone As Phone = Main.vPhone1
	Phone.HideKeyboard(Activity)
End Sub

Sub Sub014(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/fatturafm.java, metodo _mail (riga 3467).
Sub mail(str As String, str2 As String, str3 As String, str4 As String)
	Dim z As Boolean
	mod1.vStr2 = " Sub MailDB(Title As String ,smtp1 As SMTP,Testo As String,SendDb As Boolean)"
	Try
		If Main.v_attivafe And str3 = "" Then
			If Not(File.Exists(mod1.vStr7, mod1.vStr6.Replace(".xml", ".txt"))) Then
				Return
			End If
		End If
		If Main.v_mserver <> "" Then
			If Main.v_mporta <> "" Then
				If Main.v_muser <> "" Then
					If Main.v_mpwd <> "" Then
						If Main.v_md1 = "" Then
							If Main.v_md2 = "" Then
							End If
						End If
						ProgressDialogShow2("Invio in corso ...", False)
						Dim str6 As String = str2 & CRLF & "Inviato da : " & CRLF
						Dim cursorWrapper As Cursor
						Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from intesta order by codice")
						If cursorWrapper2.RowCount > 0 Then
							Dim i As Int = 0
							Do While i <= 5
								cursorWrapper2.Position = i
								i = i + 1
								str6 = str6 & cursorWrapper2.GetString("descrizione") & CRLF
							Loop
						End If
						Dim str7 As String = str6
						Dim parseDouble As Int = Main.v_mporta
						vSMTP1.Initialize(Main.v_mserver, parseDouble, Main.v_muser, Main.v_mpwd, "SMTP")
						Dim sMTPWrapper2 As SMTP = vSMTP1
						If Main.v_mporta <> 465 Then
							If Main.v_mporta <> 587 Then
								z = False
								sMTPWrapper2.UseSSL = z
								If Main.v_md1 <> "" Then
									mod1.Sub004(vSMTP1, Main.v_md1, False)
								End If
								If Main.v_md2 <> "" Then
									mod1.Sub004(vSMTP1, Main.v_md2, False)
								End If
								If str4 <> "" Then
									vSMTP1.To.Add(str4)
								End If
								vSMTP1.Subject = Main.v_mdesmittente & " " & str
								vSMTP1.Body = str7
								If str3 <> "" Then
									If File.Exists(mod1.vStr4 & "/fatture", str3) Then
										vSMTP1.AddAttachment(mod1.vStr4 & "/fatture", str3)
									End If
								End If
								If Main.v_attivafe And str3 = "" Then
									vSMTP1.AddAttachment(mod1.vStr7, mod1.vStr6.Replace(".xml", ".txt"))
								End If
								vSMTP1.Send
							End If
						End If
						z = True
						sMTPWrapper2.UseSSL = z
						If Main.v_md1 <> "" Then
						End If
						If Main.v_md2 <> "" Then
						End If
						If str4 <> "" Then
						End If
						vSMTP1.Subject = Main.v_mdesmittente & " " & str
						vSMTP1.Body = str7
						If str3 <> "" Then
						End If
						If Main.v_attivafe Then
							vSMTP1.AddAttachment(mod1.vStr7, mod1.vStr6.Replace(".xml", ".txt"))
						End If
						vSMTP1.Send
					End If
				End If
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub msgboxonly(str As String)
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "", "", "Ok", Main.vBmp1)
End Sub

Sub OkList_Click
	Sub005()
	Sub022()
	PnlList.Visible = False
End Sub

Sub Sub015(str As String)
	Dim intentWrapper As Intent
	intentWrapper.Initialize("android.intent.action.VIEW", str)
	intentWrapper.SetType("application/pdf")
	intentWrapper.WrapAsIntentChooser("Choose PDF Viewer")
	vBln4 = True
	StartActivity(intentWrapper)
End Sub

Sub Sub016(i As Int, str As String, str2 As String, cursorWrapper As Cursor)
	If File.Exists(mod1.vStr4, "LogoPrg.jpg") Then
		vPDFWriter1.addImage(4, 688, LoadBitmap(mod1.vStr4, "LogoPrg.jpg"))
	Else
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
		If cursorWrapper3.RowCount > 0 Then
			Dim i2 As Int = 790
			Dim i3 As Int
			For i3 = 0 To 5
				cursorWrapper3.Position = i3
				If i3 = 0 Then
					vPDFWriter1.addText(20, i2, 11, cursorWrapper3.GetString("descrizione"))
					i2 = i2 - 20
				Else
					vPDFWriter1.addText(20, i2, 9, cursorWrapper3.GetString("descrizione"))
					i2 = i2 - 15
				End If
			Next
		End If
	End If
	Dim str3 As String = " del " & str.SubString(12).Trim
	If Main.v_orafatt Then
		str3 = str3 & " " & NumberFormat(DateTime.GetHour(mod1.Sub058), 2, 0) & ":" & NumberFormat(DateTime.GetMinute(mod1.Sub058), 2, 0)
	End If
	Sub020(str)
	If vStr2 <> "" Then
		Dim paperSize As PDFPaperSizes = vPDFPaperSizes1
		vPDFWriter1.addText(30940 / 100, 793, 10, "Fattura N." & i & "/" & vStr2 & str3 & str2)
	Else
		Dim paperSize2 As PDFPaperSizes = vPDFPaperSizes1
		vPDFWriter1.addText(30940 / 100, 793, 10, "Fattura N." & i & str3 & str2)
	End If
	Dim paperSize3 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize4 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addRectangle(30345 / 100, 690, 26775 / 100, 130)
	Dim paperSize5 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addText(30940 / 100, 780, 11, "Destinatario: ")
	If Not(mod1.Sub222(cursorWrapper.GetString("descrizione"))) Then
		Dim i4 As Int = 11
		If cursorWrapper.GetString("descrizione").Length > 30 Then
			i4 = 9
		End If
		If cursorWrapper.GetString("descrizione").Length > 40 Then
			i4 = 8
		End If
		Dim paperSize6 As PDFPaperSizes = vPDFPaperSizes1
		vPDFWriter1.addText(30940 / 100, 760, i4, cursorWrapper.GetString("descrizione").Trim)
	End If
	If Not(mod1.Sub222(cursorWrapper.GetString("via"))) Then
		Dim i5 As Int = 11
		If cursorWrapper.GetString("via").Length > 30 Then
			i5 = 9
		End If
		If cursorWrapper.GetString("via").Length > 40 Then
			i5 = 8
		End If
		Dim paperSize7 As PDFPaperSizes = vPDFPaperSizes1
		vPDFWriter1.addText(30940 / 100, 740, i5, cursorWrapper.GetString("via").Trim)
	End If
	Dim str4 As String = ""
	If Not(mod1.Sub222(cursorWrapper.GetString("cap"))) Then
		str4 = cursorWrapper.GetString("cap").Trim & " "
	End If
	If Not(mod1.Sub222(cursorWrapper.GetString("citta"))) Then
		str4 = str4 & cursorWrapper.GetString("citta").Trim & " "
	End If
	If Not(mod1.Sub222(cursorWrapper.GetString("provincia"))) Then
		str4 = str4 & cursorWrapper.GetString("provincia").Trim & " "
	End If
	If Not(mod1.Sub222(str4)) Then
		Dim i6 As Int = 11
		If str4.Length > 30 Then
			i6 = 9
		End If
		If str4.Length > 40 Then
			i6 = 8
		End If
		Dim paperSize8 As PDFPaperSizes = vPDFPaperSizes1
		vPDFWriter1.addText(30940 / 100, 725, i6, str4)
	End If
	If Not(mod1.Sub222(cursorWrapper.GetString("piva"))) Then
		Dim paperSize9 As PDFPaperSizes = vPDFPaperSizes1
		vPDFWriter1.addText(30940 / 100, 710, 9, "P.IVA: " & cursorWrapper.GetString("piva").Trim)
	End If
	If Not(mod1.Sub222(cursorWrapper.GetString("codf"))) Then
		Dim paperSize10 As PDFPaperSizes = vPDFPaperSizes1
		vPDFWriter1.addText(30940 / 100, 695, 9, "C.F.: " & cursorWrapper.GetString("codf").Trim)
	End If
	Dim paperSize11 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize12 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addLine(1785 / 100, 683, 1785 / 100, 180)
	Dim paperSize13 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addText(2380 / 100, 670, 11, "Dati Documento (Scontrino o Ricevuta)")
	Dim paperSize14 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize15 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addLine(44030 / 100, 683, 44030 / 100, 180)
	Dim paperSize16 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addText(44625 / 100, 670, 11, "Importo")
	Dim paperSize17 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize18 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addLine(52955 / 100, 683, 52955 / 100, 180)
	Dim paperSize19 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addText(53550 / 100, 670, 11, "Iva")
	Dim paperSize20 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize21 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addLine(1785 / 100, 667, 57120 / 100, 667)
	Dim paperSize22 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize23 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addLine(1785 / 100, 683, 57120 / 100, 683)
	Dim paperSize24 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize25 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addLine(57120 / 100, 683, 57120 / 100, 180)
	Dim paperSize26 As PDFPaperSizes = vPDFPaperSizes1
	Dim paperSize27 As PDFPaperSizes = vPDFPaperSizes1
	vPDFWriter1.addLine(1785 / 100, 180, 57120 / 100, 180)
End Sub

Sub pdfwriter1_conversiondone(str As String)
	vStr9 = str
End Sub

Sub pnlElencoRistampa_Click
End Sub

Sub PnlList_Click
End Sub

Sub Sub017(i As Int) As Boolean
	mod1.vStr2 = "Sub PreparaLastDataDoc(index As Int) As Boolean"
	If Main.v_lastdatadocfm Then
		dataFattura.Tag = vCur1.GetString("MaxData").SubString2(5, 7) & "/" & vCur1.GetString("MaxData").SubString2(8, 10) & "/" & vCur1.GetString("MaxData").SubString2(0, 4)
		dataFattura.Text = "Data Fattura " & vCur1.GetString("MaxData").SubString2(8, 10) & "/" & vCur1.GetString("MaxData").SubString2(5, 7) & "/" & vCur1.GetString("MaxData").SubString2(0, 4)
		If vInt2 >= 0 And i <> vInt2 Then
			Dim vObjectToCharSequence As Object = "Attenzione... fatturando questo cliente non verrà rispettata la corretta sequenza di generazione delle fatture." & CRLF & "Si desidera continuare ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
			If vMsgbox2 <> -1 Then
				mod1.Sub081
				Return False
			End If
		End If
	End If
	Return True
End Sub

Sub preparamailvisualizza(str As String, str2 As String)
	If Not(str = "" And str2 = "") Then
		mail("Fattura", "Invio Fattura", str, str2)
	End If
	Sub022()
	If str = "" Then
		Return
	End If
	Sub015("file://" & File.Combine(mod1.vStr4 & "/fatture", str))
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/fatturafm.java, metodo _printlist_click (riga 3867).
Sub PrintList_Click
	Dim z As Boolean
	Dim cursorWrapper As Cursor
	Dim d As Double
	Dim cursorWrapper2 As Cursor
	Dim d2 As Double
	Dim vObjectToCharSequence As Object = "Attenzione ... Per stampare il riepilogo verranno confermate le eventuali modifiche." & CRLF & " Si desidera continuare ?  "
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 <> -1 Then
		Return
	End If
	Sub005()
	Dim cursorWrapper3 As Cursor
	Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vCur1.GetString("codiceCli") & "'")
	cursorWrapper4.Position = 0
	If Main.v_fatturafmt2 Then
		If Not(cursorWrapper4.GetInt("abpost") = 1 And cursorWrapper4.GetDouble("fido") > 0) Then
			z = True
			If z Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" & SmartStringFormatter("", cursorWrapper4.GetString("codice").Trim) & "' and fido >0") > 0 Then
				End If
			End If
			Dim cursorWrapper5 As Cursor
			cursorWrapper = Main.vSql2.ExecQuery("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & vStr1 & ")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva as iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  headmov.cliente ='" & cursorWrapper4.GetString("codice").Trim & "' and  " & vStr4 & " group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm")
			Dim str As String = "CausaliPagamenti.codice=2 or pagamenti.cassa=1"
			If Main.vccefdll1.vBln15 Then
				str = vStr1
			End If
			Dim cursorWrapper6 As Cursor
			Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti inner join pagamenti on pagamenti.codice = CausaliPagamenti.codice where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & str & ")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva as iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  headmov.cliente ='" & cursorWrapper4.GetString("codice").Trim & "' and  " & vStr4.Replace("FattFM=1 and", "") & " group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm")
			If cursorWrapper.RowCount > 0 Then
				Dim d3 As Double = 0
				Main.vccefdll1.nf_apri(True)
				Main.vccefdll1.nf_testo("********************************", 1)
				Main.vccefdll1.nf_testo("Stampa Riepilogo", 4)
				Main.vccefdll1.nf_testo("********************************", 1)
				If Not(mod1.Sub222(cursorWrapper4.GetString("descrizione"))) Then
					Main.vccefdll1.nf_testo(cursorWrapper4.GetString("descrizione").Trim, 4)
				End If
				If Not(mod1.Sub222(cursorWrapper4.GetString("via"))) Then
					Main.vccefdll1.nf_testo(cursorWrapper4.GetString("via").Trim, 1)
				End If
				Dim str2 As String = ""
				If Not(mod1.Sub222(cursorWrapper4.GetString("cap"))) Then
					str2 = cursorWrapper4.GetString("cap").Trim & " "
				End If
				If Not(mod1.Sub222(cursorWrapper4.GetString("citta"))) Then
					str2 = str2 & cursorWrapper4.GetString("citta").Trim & " "
				End If
				If Not(mod1.Sub222(cursorWrapper4.GetString("provincia"))) Then
					str2 = str2 & cursorWrapper4.GetString("provincia").Trim & " "
				End If
				If Not(mod1.Sub222(str2)) Then
					Main.vccefdll1.nf_testo(str2, 1)
				End If
				If Not(mod1.Sub222(cursorWrapper4.GetString("piva"))) Then
					Main.vccefdll1.nf_testo("P.IVA: " & cursorWrapper4.GetString("piva").Trim, 1)
				End If
				If Not(mod1.Sub222(cursorWrapper4.GetString("codf"))) Then
					Main.vccefdll1.nf_testo("C.F.: " & cursorWrapper4.GetString("codf").Trim, 1)
				End If
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo("********************************", 1)
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo("       Dati scontrino           ", 1)
				Main.vccefdll1.nf_testo("Descrizione        Importo   Iva", 1)
				Main.vccefdll1.nf_testo("--------------------------------", 1)
				Dim cursorWrapper8 As Cursor
				Dim i As Int = 0
				Dim str3 As String = ""
				Do While True
					d = d3
					If i > 1 Then
						Exit
					End If
					If i = 0 Then
						cursorWrapper2 = cursorWrapper
					Else
						cursorWrapper2 = IIf(i = 1, cursorWrapper7, cursorWrapper8)
					End If
					Dim rowCount As Int = cursorWrapper2.RowCount - 1
					Dim i2 As Int = 0
					d3 = d
					Dim str4 As String = str3
					Do While i2 <= rowCount
						cursorWrapper2.Position = i2
						If cursorWrapper2.GetDouble("tot") <> 0 Then
							Dim vGetString As String = cursorWrapper2.GetString("dataeoraffm")
							Dim vGetString2 As String = cursorWrapper2.GetString("matricolacassap")
							Dim vGetString3 As String = IIf(vGetString = Null, cursorWrapper2.GetString("datam"), vGetString)
							If vGetString2 = Null Then
								vGetString2 = ""
							End If
							Dim str5 As String = ""
							If cursorWrapper2.GetInt("numero") > 0 Then
								str5 = "SCO.N." & cursorWrapper2.GetString("numero") & " del " & vGetString3.SubString2(3, 5) & "/" & vGetString3.SubString2(0, 2) & "/" & vGetString3.SubString2(6, 10)
							Else If cursorWrapper2.GetInt("Ricevuta") > 0 Then
								Dim vGetString4 As String = cursorWrapper2.GetString("datam")
								str5 = "RIC.N." & cursorWrapper2.GetString("Ricevuta") & " del " & vGetString4.SubString2(3, 5) & "/" & vGetString4.SubString2(0, 2) & "/" & vGetString4.SubString2(6, 10)
							End If
							If cursorWrapper2.GetInt("numero") > 0 And str4 <> vGetString2 Then
								Main.vccefdll1.nf_testo("Scontrini del MF:" & vGetString2, 4)
							End If
							Dim sb3 As String = modfunstr.left(str5 & modfunstr.Sub004(9), 26) & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(cursorWrapper2.GetDouble("tot"), 1, 2, 2, False), 8) & " " & modfunstr.Sub003(modfunstr.Sub004(5) & NumberFormat2(cursorWrapper2.GetDouble("iva"), 1, 0, 0, False), 5)
							Main.vccefdll1.nf_testo(sb3, 3)
							d2 = Round2(cursorWrapper2.GetDouble("tot") + d3, 2)
							str4 = vGetString2
						Else
							d2 = d3
						End If
						i2 = i2 + 1
						d3 = d2
					Loop
					i = i + 1
					cursorWrapper8 = cursorWrapper2
					str3 = str4
				Loop
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo("********************************", 1)
				Main.vccefdll1.nf_testo("TOT. DA FATTURARE" & modfunstr.Sub003(modfunstr.Sub004(15) & NumberFormat2(d, 1, 2, 2, False), 15), 1)
				Main.vccefdll1.nf_testo("********************************", 1)
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo(" ", 1)
				Main.vccefdll1.nf_testo(Main.vStr19, 1)
				Main.vccefdll1.nf_chiudi
			End If
			Return
		End If
	End If
	z = False
	If z Then
	End If
	Dim cursorWrapper52 As Cursor
	cursorWrapper = Main.vSql2.ExecQuery("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & vStr1 & ")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva as iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  headmov.cliente ='" & cursorWrapper4.GetString("codice").Trim & "' and  " & vStr4 & " group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm")
	Dim str6 As String = "CausaliPagamenti.codice=2 or pagamenti.cassa=1"
	If Main.vccefdll1.vBln15 Then
	End If
	Dim cursorWrapper62 As Cursor
	Dim cursorWrapper72 As Cursor = Main.vSql1.ExecQuery("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti inner join pagamenti on pagamenti.codice = CausaliPagamenti.codice where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & str6 & ")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva as iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  headmov.cliente ='" & cursorWrapper4.GetString("codice").Trim & "' and  " & vStr4.Replace("FattFM=1 and", "") & " group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm")
	If cursorWrapper.RowCount > 0 Then
	End If
End Sub

Sub progressonly(z As Boolean, str As String)
	If z Then
		ProgressDialogShow2(str, False)
		DoEvents
		Return
	End If
	ProgressDialogHide
End Sub

Sub Ricerca_Click
	mod1.vStr2 = "Sub Ricerca_Click"
	Sub022()
End Sub

Sub Selmovim_Click
	vCur2.Position = vcustomlistviewold3.Sub007(Sender)
	vStr5 = vCur2.GetString("nfat")
	vStr6 = vCur2.GetString("cliente")
	vStr7 = vCur2.GetString("datam")
	vDbl1 = Round2(vCur2.GetDouble("totale"), 2)
	vStr8 = "Data Fattura " & vStr7.SubString2(3, 5) & "/" & vStr7.SubString2(0, 2) & "/" & vStr7.SubString2(6, 10)
	vLbl5.Text = "Selezionata la fattura num. " & vCur2.GetString("nfat")
End Sub

Sub Sub018(str As String) As String
	If str.Contains("Tess.") Then
		Return str.SubString2(0, str.IndexOf("Tess."))
	End If
	Return str
End Sub

Sub Sub019(str As String) As Double
	If 2 <> vMap1.GetDefault("EsigibilitaIVA", 0) Then
		Return 0
	End If
	If Main.vSql2.ExecQuerySingleResult("Select count(*) " & str) <= 0 Then
		Return 0
	End If
	Return Main.vSql2.ExecQuerySingleResult("Select sum(round(((((importo*1.00)*100)/((100+aliquota2)))/100)*((aliquota2*1.00)),4)) as Imposta " & str)
End Sub

Sub setinclosing
	vBln1 = True
End Sub

Sub Sub020(str As String)
	vStr2 = Main.v_barra
	If Main.v_attivasezionali Then
		vStr2 = Main.v_barra2
		vStr3 = "F2"
	End If
	If str.Length > 19 Then
		vStr2 = vStr2.Replace("yyyy", str.SubString(19))
		Return
	End If
End Sub

Sub Smtp_MessageSent(z As Boolean)
	If z Then
		ToastMessageShow("Mail inviata correttamente", True)
	Else
		Dim vObjectToCharSequence As Object = "Errore durante l'invio della Mail" & CRLF & CRLF & LastException.Message
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub217(LastException.Message)
	End If
	ProgressDialogHide
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub stampa(recall As Boolean)
	Dim limit102 As Int
	Dim limit152 As Int
	Dim limit215 As Int
	Dim limit242 As Int
	Dim limit285 As Int
	Dim step102 As Int
	Dim step152 As Int
	Dim step215 As Int
	Dim step242 As Int
	Dim step285 As Int
	Dim tmpeiva As String
	Dim mtdata As String
	Dim mtdatafe As String
	Dim mtdatatext As String
	Dim mexport As Map
	Dim stestofatt As String
	Dim cursanagcli As Cursor
	Dim nfattura As Int
	Dim bclienteita As Boolean
	Dim rs As ResumableSub
	Dim result As Map
	Dim cursvend As Cursor
	Dim swhere As String
	Dim bfattfmt2 As Boolean
	Dim tmpivaq As String
	Dim mml As modalmline
	Dim tmptf As String
	Dim totscoinfatt As Double
	Dim x As Int
	Dim tmpfattura As StringBuilder
	Dim sdatafatt As String
	Dim stestocliente As String
	Dim scolumn2() As String
	Dim xxxx As Int
	Dim stf As String
	Dim tmpcc As Cursor
	Dim mlastmatr As String
	Dim mdate As String
	Dim mmatr As String
	Dim mdettsco As String
	Dim tmpr As Cursor
	Dim s3 As String
	Dim xx As Int
	Dim mimpo As Double
	Dim mmqta As Double
	Dim tmpimposta As Double
	Dim imposta As Double
	Dim s4 As String
	Dim tmpes As String
	Dim bexportxml As Boolean
	Dim listofmapsf As List
	Dim tmpfn As String
	Dim tmppar As String
	Dim stmpmail As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					mod1.vStr2 = "Sub stampa(recall As Boolean)"
					Continue
				Case 1
					rsState = 353
					rsCatchState = 352
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 352
					tmpeiva = "I"
					mtdata = dataFattura.Tag
					mtdatafe = ""
					mtdatatext = dataFattura.Text
					'mexport = Map
					stestofatt = ""
					'cursanagcli = Cursor
					nfattura = Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='" & vStr3 & "'")
					bclienteita = True
					Continue
				Case 4
					rsState = 9
					If recall Then
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
					mtdata = vStr7
					mtdatatext = vStr8
					nfattura = vStr5
					Dim cursorWrapper As Cursor
					cursanagcli = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vStr6 & "'")
					cursanagcli.Position = 0
					bclienteita = (Main.vSql1.ExecQuerySingleResult("Select count(*) from FEdatiCli where NazioneCli='IT' and Codice ='" & SmartStringFormatter("", vStr6) & "'") > 0)
					Continue
				Case 8
					rsState = 9
					Dim cursorWrapper2 As Cursor
					cursanagcli = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vCur1.GetString("codiceCli") & "'")
					cursanagcli.Position = 0
					bclienteita = (Main.vSql1.ExecQuerySingleResult("Select count(*) from FEdatiCli where NazioneCli='IT' and Codice ='" & SmartStringFormatter("", vCur1.GetString("codiceCli")) & "'") > 0)
					Continue
				Case 9
					rsState = 48
					If Not(Main.v_attivafe) Then
						Continue
					Else
						rsState = 11
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 11
				Case 11
					rsState = 12
					mtdatafe = mtdata.SubString(6) & "-" & mtdata.SubString2(0, 2) & "-" & mtdata.SubString2(3, 5)
					Main.vBln35 = False
					vBln5 = False
					Continue
				Case 12
					rsState = 21
					rsState = 14
					Continue
				Case 14
					rsState = 15
					'rs = ResumableSub
					Dim trim As String = cursanagcli.GetString("codice").Trim
					Dim z2 As Boolean = recall
					Dim i As Int = nfattura
					rs = ValidaDatiFattura(trim, z2, i, True, vStr7, " where  FattFM=1 and  headmov.cliente = '" & cursanagcli.GetString("codice").Trim & "' and " & vStr4)
					Wait For (rs) Complete (wf354_0 As Map)
					rsState = 354
					Continue
				Case 15
					rsState = 20
					If vBln5 And result.IsInitialized Then
						rsState = 17
						Continue
					Else
						rsState = 19
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 17
				Case 17
					rsState = 20
					vMap1 = result
					Continue
				Case 19
					rsState = 20
					rsState = 21
					Continue
				Case 20
					rsState = 12
					Continue
				Case 21
					rsState = 32
					If Not(result.IsInitialized) Then
						rsState = 23
						Continue
					Else
						rsState = 25
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 23
				Case 23
					rsState = 32
					Return
				Case 25
					rsState = 26
					vMap1 = result
					Continue
				Case 26
					rsState = 31
					If vMap1.IsInitialized Then
						If vMap1.Size = 0 Then
							rsState = 28
							Continue
						End If
					End If
					rsState = 30
					Continue
				Case 28
					rsState = 31
					vMap1 = Null
					Continue
				Case 30
					rsState = 31
					Main.vBln35 = True
					Continue
				Case 31
					rsState = 32
					Continue
				Case 32
					rsState = 37
					If vMap1.IsInitialized Then
						Continue
					Else
						rsState = 34
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 34
				Case 34
					rsState = 37
					Return
				Case 37
					rsState = 38
					vBln3 = True
					Continue
				Case 38
					rsState = 41
					If vMap1.GetDefault("Memo", "") <> "" Then
						rsState = 40
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 40
				Case 40
					rsState = 41
					stestofatt = vMap1.GetDefault("Memo", "")
					Continue
				Case 41
					rsState = 42
					Main.vDbl2 = 0
					Continue
				Case 42
					rsState = 47
					If 2 <> vMap1.GetDefault("EsigibilitaIVA", 0) Then
						If 1 <> vMap1.GetDefault("EsigibilitaIVA", 0) Then
							Continue
						Else
							rsState = 46
							Continue
						End If
					Else
						rsState = 44
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 44
				Case 44
					rsState = 47
					tmpeiva = "S"
					Continue
				Case 46
					rsState = 47
					tmpeiva = "D"
					Continue
				Case 47
					rsState = 48
					Main.vccefdll1.vInt6 = vMap1.GetDefault("Copie", 0)
					Continue
				Case 48
					rsState = 51
					If recall Then
						Continue
					Else
						rsState = 50
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 50
				Case 50
					rsState = 51
					Main.vSql2.ExecNonQuery("update headmov set nfat_fm = " & nfattura & ",sezionale='" & vStr2 & "',datfat_fm = '" & mtdata & "' where (select count(*) from CausaliPagamenti where CausaliPagamenti.nmov= headmov.nmov And (" & vStr1 & "))>0 And  FattFM=1 And  cliente = '" & vCur1.GetString("codiceCli").Trim & "' and " & vStr4)
					Main.vSql1.ExecNonQuery("update  progressivi set valore = " & nfattura + 1 & "  where codice ='" & vStr3 & "'")
					Continue
				Case 51
					rsState = 54
					If Not(Main.v_attivafe) Then
						Continue
					Else
						If Not(vMap1.IsInitialized) Then
							Continue
						Else
							If 2 <> vMap1.GetDefault("EsigibilitaIVA", 0) Then
								Continue
							Else
								rsState = 53
								Continue
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 53
				Case 53
					rsState = 54
					Main.vDbl2 = Sub019(" from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "'")
					Continue
				Case 54
					rsState = 55
					'cursvend = Cursor
					swhere = "where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm"
					If Main.v_fatturafmt2 Then
						If Not(cursanagcli.GetInt("abpost") = 1 And cursanagcli.GetDouble("fido") > 0) Then
							z = True
							bfattfmt2 = z
							Continue
						End If
					End If
					z = False
					bfattfmt2 = z
					Continue
				Case 55
					rsState = 64
					If Not(bfattfmt2) Then
						Continue
					Else
						rsState = 57
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 57
				Case 57
					rsState = 58
					Continue
				Case 58
					rsState = 63
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" & SmartStringFormatter("", cursanagcli.GetString("codice").Trim) & "' and fido >0") <= 0 Then
						Continue
					Else
						rsState = 60
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 60
				Case 60
					rsState = 63
					bfattfmt2 = False
					Continue
				Case 63
					rsState = 64
					Continue
				Case 64
					rsState = 75
					If Not(bfattfmt2) Then
						rsState = 66
						Continue
					Else
						rsState = 68
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 66
				Case 66
					rsState = 75
					Dim cursorWrapper3 As Cursor
					cursvend = Main.vSql2.ExecQuery("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & vStr1 & ")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm")
					Continue
				Case 68
					rsState = 69
					tmpivaq = ",venduto.iva"
					Continue
				Case 69
					rsState = 74
					If Not(Main.v_attivafe) Then
						Continue
					Else
						rsState = 71
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 71
				Case 71
					rsState = 74
					tmpivaq = ""
					Continue
				Case 74
					rsState = 75
					Dim cursorWrapper4 As Cursor
					cursvend = Main.vSql2.ExecQuery("Select sum(importo) as tot, headmov.nric as Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where headmov.nfat=0 And  FattFM=1 And  venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap " & tmpivaq & "  order by dataeoraffm")
					Continue
				Case 75
					rsState = 350
					If cursvend.RowCount <= 0 Then
						Continue
					Else
						rsState = 77
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 77
				Case 77
					rsState = 78
					Continue
				Case 78
					rsState = 98
					If Main.v_attivafe Then
						Continue
					Else
						rsState = 80
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 80
				Case 80
					rsState = 81
					'mml = modalmline
					Dim modalmlineVar As modalmline = mml
					modalmlineVar.Initialize("FatturaFM", 28, Activity)
					Dim modalmlineVar2 As modalmline = mml
					Dim vRGB As Int = Colors.RGB(150, 150, 150)
					Dim vRGB2 As Int = Colors.RGB(150, 150, 150)
					modalmlineVar2.Sub004(vRGB, vRGB2, -256)
					tmptf = ""
					Continue
				Case 81
					rsState = 94
					If recall Then
						rsState = 83
						Continue
					Else If cursanagcli.GetString("codice").Trim <> "" Then
						rsState = 89
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 83
				Case 83
					rsState = 84
					Continue
				Case 84
					rsState = 87
					If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='F_" & nfattura & "'") <= 0 Then
						Continue
					Else
						rsState = 86
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 86
				Case 86
					rsState = 87
					tmptf = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='F_" & nfattura & "'")
					Continue
				Case 87
					rsState = 94
					Continue
				Case 89
					rsState = 90
					Continue
				Case 90
					rsState = 93
					If Main.vSql1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" & cursanagcli.GetString("codice").Trim & "'") <= 0 Then
						Continue
					Else
						rsState = 92
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 92
				Case 92
					rsState = 93
					tmptf = Main.vSql1.ExecQuerySingleResult("select testo from TestiCli where codice='" & cursanagcli.GetString("codice").Trim & "'")
					Continue
				Case 93
					rsState = 94
					Continue
				Case 94
					rsState = 97
					If tmptf <> "" Then
						Continue
					Else
						If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'") <= 0 Then
							Continue
						Else
							rsState = 96
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 96
				Case 96
					rsState = 97
					tmptf = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'")
					Continue
				Case 97
					rsState = 98
					stestofatt = mml.Sub002("Testo aggiuntivo Fattura", "Aggiungi un testo", "", tmptf)
					Continue
				Case 98
					rsState = 99
					totscoinfatt = Main.vSql2.ExecQuerySingleResult("Select case when sum(scov) is null then 0 else sum(scov) end  from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "'")
					vLst1.Clear
					Continue
				Case 99
					rsState = 102
					step102 = 1
					limit102 = 30
					x = 0
					rsState = 355
					Continue
				Case 101
					rsState = 356
					vLst1.Add(0)
					Continue
				Case 102
					rsState = 107
					If recall Then
						rsState = 104
						Continue
					Else
						rsState = 106
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 104
				Case 104
					rsState = 107
					Main.vccefdll1.ft_apri(Round2(vDbl1 * 100, 0))
					Continue
				Case 106
					rsState = 107
					Main.vccefdll1.ft_apri(Round2(vCur1.GetDouble("totale") * 100, 0))
					Continue
				Case 107
					rsState = 116
					If Main.v_attivafe Then
						rsState = 109
						Continue
					Else
						rsState = 115
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 109
				Case 109
					rsState = 110
					Main.vccefdll1.ft_testo("-- COPIA DI CORTESIA -------------------------------", 4)
					Continue
				Case 110
					rsState = 113
					If Not(bclienteita) Then
						Continue
					Else
						rsState = 112
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 112
				Case 112
					rsState = 113
					Main.vccefdll1.ft_testo("Non valida ai fini fiscali.", 1)
					Main.vccefdll1.ft_testo("La fattura verra' resa disponibile ", 1)
					Main.vccefdll1.ft_testo("mediante Sistema di Interscambio.", 1)
					Continue
				Case 113
					rsState = 116
					Main.vccefdll1.ft_testo(" ", 1)
					Continue
				Case 115
					rsState = 116
					Main.vccefdll1.ft_testo("********************************", 1)
					Continue
				Case 116
					rsState = 117
					'tmpfattura = StringBuilder
					tmpfattura.Initialize
					sdatafatt = ""
					sdatafatt = "del " & mtdatatext.SubString(12)
					Continue
				Case 117
					rsState = 122
					If Not(Main.v_orafatt) Then
						Continue
					Else
						rsState = 119
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 119
				Case 119
					rsState = 122
					sdatafatt = sdatafatt & " " & NumberFormat(DateTime.GetHour(mod1.Sub058), 2, 0) & ":" & NumberFormat(DateTime.GetMinute(mod1.Sub058), 2, 0)
					Continue
				Case 122
					rsState = 123
					Sub020(mtdatatext)
					Continue
				Case 123
					rsState = 134
					If vStr2 <> "" Then
						rsState = 125
						Continue
					Else
						rsState = 127
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 125
				Case 125
					rsState = 134
					Main.vccefdll1.ft_testo("Fattura N." & nfattura & " /" & vStr2, 1)
					Main.vccefdll1.ft_testo(sdatafatt.Trim, 1)
					Continue
				Case 127
					rsState = 128
					Continue
				Case 128
					rsState = 133
					If Main.v_orafatt Then
						rsState = 130
						Continue
					Else
						rsState = 132
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 130
				Case 130
					rsState = 133
					Main.vccefdll1.ft_testo("Fattura N." & nfattura, 1)
					Main.vccefdll1.ft_testo(sdatafatt.Trim, 1)
					Continue
				Case 132
					rsState = 133
					Main.vccefdll1.ft_testo("Fattura N." & nfattura & " " & sdatafatt, 1)
					Continue
				Case 133
					rsState = 134
					Continue
				Case 134
					rsState = 139
					If Main.v_attivafe Then
						rsState = 136
						Continue
					Else
						rsState = 138
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 136
				Case 136
					rsState = 139
					Main.vccefdll1.ft_testo(" ", 1)
					mod1.Sub144(Null, vMap1.GetDefault("TipoDocumento", ""))
					Main.vccefdll1.ft_testo(" ", 1)
					Main.vccefdll1.ft_testo("-- CESSIONARIO ---------------------------", 4)
					Continue
				Case 138
					rsState = 139
					Main.vccefdll1.ft_testo("********************************", 1)
					Main.vccefdll1.ft_testo("Destinatario", 1)
					Continue
				Case 139
					rsState = 150
					If mod1.Sub222(cursanagcli.GetString("descrizione")) Then
						Continue
					Else
						rsState = 141
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 141
				Case 141
					rsState = 142
					stestocliente = cursanagcli.GetString("descrizione")
					stestocliente = mod1.Sub213(stestocliente, 32, "")
					Dim scolumn2(0) As String
					scolumn2 = Regex.Split(CRLF, stestocliente)
					Continue
				Case 142
					rsState = 149
					step152 = 1
					limit152 = scolumn2.Length - 1
					xxxx = 0
					rsState = 357
					Continue
				Case 144
					rsState = 145
					Continue
				Case 145
					rsState = 148
					If scolumn2(xxxx) <> "" Then
						rsState = 147
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 147
				Case 147
					rsState = 148
					Main.vccefdll1.ft_testo(scolumn2(xxxx).Trim, 4)
					Continue
				Case 148
					rsState = 358
					Continue
				Case 149
					rsState = 150
					Continue
				Case 150
					rsState = 155
					If mod1.Sub222(cursanagcli.GetString("via")) Then
						Continue
					Else
						rsState = 152
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 152
				Case 152
					rsState = 155
					Main.vccefdll1.ft_testo(cursanagcli.GetString("via").Trim, 1)
					Continue
				Case 155
					rsState = 156
					stf = ""
					Continue
				Case 156
					rsState = 161
					If mod1.Sub222(cursanagcli.GetString("cap")) Then
						Continue
					Else
						rsState = 158
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 158
				Case 158
					rsState = 161
					stf = cursanagcli.GetString("cap").Trim & " "
					Continue
				Case 161
					rsState = 162
					Continue
				Case 162
					rsState = 167
					If mod1.Sub222(cursanagcli.GetString("citta")) Then
						Continue
					Else
						rsState = 164
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 164
				Case 164
					rsState = 167
					stf = stf & (cursanagcli.GetString("citta").Trim & " ")
					Continue
				Case 167
					rsState = 168
					Continue
				Case 168
					rsState = 173
					If mod1.Sub222(cursanagcli.GetString("provincia")) Then
						Continue
					Else
						rsState = 170
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 170
				Case 170
					rsState = 173
					stf = stf & (cursanagcli.GetString("provincia").Trim & " ")
					Continue
				Case 173
					rsState = 174
					Continue
				Case 174
					rsState = 179
					If mod1.Sub222(stf) Then
						Continue
					Else
						rsState = 176
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 176
				Case 176
					rsState = 179
					Main.vccefdll1.ft_testo(stf, 1)
					Continue
				Case 179
					rsState = 180
					Continue
				Case 180
					rsState = 185
					If mod1.Sub222(cursanagcli.GetString("piva")) Then
						Continue
					Else
						rsState = 182
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 182
				Case 182
					rsState = 185
					Main.vccefdll1.ft_testo("P.IVA: " & cursanagcli.GetString("piva").Trim, 1)
					Continue
				Case 185
					rsState = 186
					Continue
				Case 186
					rsState = 191
					If mod1.Sub222(cursanagcli.GetString("codf")) Then
						Continue
					Else
						rsState = 188
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 188
				Case 188
					rsState = 191
					Main.vccefdll1.ft_testo("C.F.: " & cursanagcli.GetString("codf").Trim, 1)
					Continue
				Case 191
					rsState = 192
					Continue
				Case 192
					rsState = 233
					If Not(Main.v_attivafe) Then
						Continue
					Else
						rsState = 194
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 194
				Case 194
					rsState = 195
					Continue
				Case 195
					rsState = 232
					If Main.vSql1.ExecQuerySingleResult("select count(*) from FEdatiCli where codice ='" & cursanagcli.GetString("codice") & "'") <= 0 Then
						Continue
					Else
						rsState = 197
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 197
				Case 197
					rsState = 198
					'tmpcc = Cursor
					Dim cursorWrapper5 As Cursor
					tmpcc = Main.vSql1.ExecQuery("select * from FEdatiCli where codice ='" & cursanagcli.GetString("codice") & "'")
					Continue
				Case 198
					rsState = 231
					If tmpcc.RowCount <= 0 Then
						Continue
					Else
						rsState = 200
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 200
				Case 200
					rsState = 201
					tmpcc.Position = 0
					Continue
				Case 201
					rsState = 206
					If mod1.Sub222(tmpcc.GetString("NomeCli")) Then
						Continue
					Else
						rsState = 203
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 203
				Case 203
					rsState = 206
					Main.vccefdll1.ft_testo("Nome: " & tmpcc.GetString("NomeCli").Trim, 1)
					Continue
				Case 206
					rsState = 207
					Continue
				Case 207
					rsState = 212
					If mod1.Sub222(tmpcc.GetString("CognomeCli")) Then
						Continue
					Else
						rsState = 209
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 209
				Case 209
					rsState = 212
					Main.vccefdll1.ft_testo("Cognome: " & tmpcc.GetString("CognomeCli").Trim, 1)
					Continue
				Case 212
					rsState = 213
					Continue
				Case 213
					rsState = 218
					If Not(mod1.Sub222(tmpcc.GetString("NazioneCli"))) And tmpcc.GetString("NazioneCli") <> "IT" Then
						rsState = 215
						Continue
					End If
					Continue
				Case 215
					rsState = 218
					Main.vccefdll1.ft_testo("Nazione: " & tmpcc.GetString("NazioneCli").Trim, 1)
					Continue
				Case 218
					rsState = 219
					Continue
				Case 219
					rsState = 224
					If mod1.Sub222(tmpcc.GetString("CodiceDestinatario")) Then
						Continue
					Else
						rsState = 221
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 221
				Case 221
					rsState = 224
					Main.vccefdll1.ft_testo("Codice Destinatario: " & tmpcc.GetString("CodiceDestinatario").Trim, 1)
					Continue
				Case 224
					rsState = 225
					Continue
				Case 225
					rsState = 230
					If mod1.Sub222(tmpcc.GetString("PEC")) Then
						Continue
					Else
						rsState = 227
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 227
				Case 227
					rsState = 230
					Main.vccefdll1.ft_testo("PEC: " & tmpcc.GetString("PEC").Trim, 1)
					Continue
				Case 230
					rsState = 231
					Continue
				Case 231
					rsState = 232
					tmpcc.Close
					Continue
				Case 232
					rsState = 233
					Continue
				Case 233
					rsState = 234
					Main.vccefdll1.ft_testo(" ", 1)
					Continue
				Case 234
					rsState = 239
					If vMap1.IsInitialized Then
						rsState = 236
						Continue
					Else
						rsState = 238
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 236
				Case 236
					rsState = 239
					Sub004(Null)
					Sub021(stestofatt, nfattura, tmpfattura, "stampaF")
					Main.vccefdll1.ft_testo(" ", 1)
					Main.vccefdll1.ft_testo("-- RIGHE ---------------------------------", 4)
					Continue
				Case 238
					rsState = 239
					Main.vccefdll1.ft_testo("********************************", 1)
					Sub021(stestofatt, nfattura, tmpfattura, "stampaF")
					Main.vccefdll1.ft_testo(" ", 1)
					Main.vccefdll1.ft_testo(" ", 1)
					Continue
				Case 239
					rsState = 240
					Main.vccefdll1.ft_testo("       Dati scontrino           ", 1)
					Continue
				Case 240
					rsState = 247
					If bfattfmt2 Then
						If Main.v_attivafe Then
							rsState = 242
							Continue
						End If
					End If
					If Not(bfattfmt2) Then
						If Main.v_attivafe Then
							rsState = 244
							Continue
						End If
					End If
					rsState = 246
					Continue
				Case 242
					rsState = 247
					Main.vccefdll1.ft_testo("          Descrizione ", 1)
					Main.vccefdll1.ft_testo(" IVA Prz.Unit      Qta Imponibile Importo", 3)
					Main.vccefdll1.ft_testo("-----------------------------------------", 1)
					Continue
				Case 244
					rsState = 247
					Main.vccefdll1.ft_testo("Descrizione                Importo    Iva", 3)
					Main.vccefdll1.ft_testo("-----------------------------------------", 1)
					Continue
				Case 246
					rsState = 247
					Main.vccefdll1.ft_testo("Descrizione        Importo   Iva", 1)
					Main.vccefdll1.ft_testo("--------------------------------", 1)
					Continue
				Case 247
					rsState = 248
					mlastmatr = ""
					Continue
				Case 248
					rsState = 251
					If Main.v_attivaterminale And Not(recall) Then
						rsState = 250
						Continue
					End If
					Continue
				Case 250
					rsState = 251
					mexport.Initialize
					Dim map As Map = mexport
					map.Put("cliente", vCur1.GetString("codiceCli"))
					Dim map2 As Map = mexport
					map2.Put("totale", vCur1.GetString("totale"))
					Dim map3 As Map = mexport
					map3.Put("datam", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
					mexport.Put("numero", nfattura)
					mexport.Put("dataFatt", mtdatatext.SubString(12))
					Dim map4 As Map = mexport
					map4.Put("negozio", Main.v_nnegozio)
					Dim map5 As Map = mexport
					map5.Put("cassa", Main.v_numcassa)
					Continue
				Case 251
					rsState = 307
					step215 = 1
					limit215 = cursvend.RowCount - 1
					x = 0
					rsState = 359
					Continue
				Case 253
					rsState = 254
					cursvend.Position = x
					Continue
				Case 254
					rsState = 306
					If cursvend.GetDouble("tot") = 0 Then
						Continue
					Else
						rsState = 256
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 256
				Case 256
					rsState = 257
					mdate = cursvend.GetString("dataeoraffm")
					mmatr = cursvend.GetString("matricolacassap")
					Continue
				Case 257
					rsState = 262
					If Not(mdate = Null) Then
						Continue
					Else
						rsState = 259
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 259
				Case 259
					rsState = 262
					mdate = cursvend.GetString("datam")
					Continue
				Case 262
					rsState = 263
					Continue
				Case 263
					rsState = 268
					If Not(mmatr = Null) Then
						Continue
					Else
						rsState = 265
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 265
				Case 265
					rsState = 268
					mmatr = ""
					Continue
				Case 268
					rsState = 269
					mdettsco = ""
					Continue
				Case 269
					rsState = 274
					If cursvend.GetInt("numero") > 0 Then
						rsState = 271
						Continue
					Else If cursvend.GetInt("Ricevuta") <= 0 Then
						Continue
					Else
						rsState = 273
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 271
				Case 271
					rsState = 274
					mdettsco = "SC." & Sub013(cursvend) & " del " & mdate.SubString2(3, 5) & "/" & mdate.SubString2(0, 2) & "/" & mdate.SubString2(6, 10)
					Continue
				Case 273
					rsState = 274
					mdate = cursvend.GetString("datam")
					mdettsco = "RIC.N." & cursvend.GetString("Ricevuta") & " del " & mdate.SubString2(3, 5) & "/" & mdate.SubString2(0, 2) & "/" & mdate.SubString2(6, 10)
					Continue
				Case 274
					rsState = 277
					If cursvend.GetInt("numero") > 0 And mlastmatr <> mmatr Then
						rsState = 276
						Continue
					End If
					Continue
				Case 276
					rsState = 277
					Main.vccefdll1.ft_testo("Scontrini del MF:" & mmatr, 2)
					Continue
				Case 277
					rsState = 278
					mlastmatr = mmatr
					Continue
				Case 278
					rsState = 305
					If bfattfmt2 Then
						If Main.v_attivafe And (cursvend.GetInt("numero") > 0 Or cursvend.GetInt("Ricevuta") > 0) Then
							rsState = 280
							Continue
						End If
					End If
					rsState = 304
					Continue
				Case 280
					rsState = 281
					'tmpr = Cursor
					Continue
				Case 281
					rsState = 286
					If cursvend.GetInt("numero") > 0 Then
						rsState = 283
						Continue
					Else If cursvend.GetInt("Ricevuta") <= 0 Then
						Continue
					Else
						rsState = 285
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 283
				Case 283
					rsState = 286
					Dim cursorWrapper6 As Cursor
					tmpr = Main.vSql2.ExecQuery("Select venduto.descrizione, iva,prezzov,venduto.qta,venduto.importo from venduto inner join headmov on venduto.nmov = headmov.nmov inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov where CausaliPagamenti.codice=2 And  headmov.nfat=0 And  FattFM=1 And  nfat_fm =" & nfattura & " And datfat_fm = '" & mtdata & "' and headmov.dataeoraffm='" & cursvend.GetString("dataeoraffm") & "' and headmov.nscontrinoffm=" & cursvend.GetString("numero") & " and headmov.nChiusura=" & cursvend.GetString("nChiusura"))
					Continue
				Case 285
					rsState = 286
					Dim cursorWrapper7 As Cursor
					tmpr = Main.vSql2.ExecQuery("Select venduto.descrizione, iva,prezzov,venduto.qta,venduto.importo from venduto inner join headmov on venduto.nmov = headmov.nmov inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov where CausaliPagamenti.codice=2 And  headmov.nfat=0 And  FattFM=1 And  nfat_fm =" & nfattura & " And datfat_fm = '" & mtdata & "' and headmov.nric=" & cursvend.GetString("Ricevuta"))
					Continue
				Case 286
					rsState = 287
					s3 = ""
					Main.vccefdll1.ft_testo(mdettsco, 2)
					Continue
				Case 287
					rsState = 296
					step242 = 1
					limit242 = tmpr.RowCount - 1
					xx = 0
					rsState = 361
					Continue
				Case 289
					rsState = 290
					tmpr.Position = xx
					mimpo = tmpr.GetDouble("importo")
					mmqta = tmpr.GetDouble("qta")
					s3 = ""
					vCur3.Position = tmpr.GetInt("iva")
					s3 = "  "
					s3 = s3 & (" " & tmpr.GetString("iva"))
					s3 = s3 & " " & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(mimpo / mmqta, 1, 2, 2, False), 8)
					Continue
				Case 290
					rsState = 295
					If mmqta * 1000 Mod 1000 = 0 Then
						rsState = 292
						Continue
					Else
						rsState = 294
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 292
				Case 292
					rsState = 295
					s3 = s3 & "  " & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat(mmqta, 1, 0), 7)
					Continue
				Case 294
					rsState = 295
					s3 = s3 & "  " & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(mmqta, 1, 3, 3, False), 7)
					Continue
				Case 295
					rsState = 362
					tmpimposta = Round2(mimpo, 4)
					Dim d As Double = tmpimposta
					Dim d2 As Double = tmpimposta
					tmpimposta = d - d2 / (1 + vCur3.GetDouble("aliquota2") / 100)
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(mimpo - tmpimposta, 1, 4, 4, False), 9)
					s3 = s3 & " " & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(mimpo, 1, 2, 2, False), 9)
					Main.vccefdll1.ft_testo(tmpr.GetString("descrizione"), 1)
					Main.vccefdll1.ft_testo(s3, 3)
					Dim vGetInt As Int = tmpr.GetInt("iva")
					vLst1.Set(vGetInt, vLst1.Get(tmpr.GetInt("iva")) + mimpo)
					Continue
				Case 296
					rsState = 297
					Main.vccefdll1.ft_testo("...........................................", 1)
					Continue
				Case 297
					rsState = 302
					If Not(tmpr.IsInitialized) Then
						Continue
					Else
						rsState = 299
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 299
				Case 299
					rsState = 302
					tmpr.Close
					Continue
				Case 302
					rsState = 305
					Continue
				Case 304
					rsState = 305
					s3 = ""
					s3 = modfunstr.left(mdettsco & modfunstr.Sub004(9), 26)
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(cursvend.GetDouble("tot"), 1, 2, 2, False), 8)
					s3 = s3 & " " & modfunstr.Sub003(modfunstr.Sub004(5) & NumberFormat2(cursvend.GetDouble("iva"), 1, 0, 0, False), 5)
					Main.vccefdll1.ft_testo(s3, 3)
					Dim vGetInt2 As Int = cursvend.GetInt("iva")
					vLst1.Set(vGetInt2, vLst1.Get(cursvend.GetInt("iva")) + cursvend.GetDouble("tot"))
					Continue
				Case 305
					rsState = 306
					Continue
				Case 306
					rsState = 360
					Continue
				Case 307
					rsState = 308
					Main.vccefdll1.ft_testo("********************************", 1)
					Continue
				Case 308
					rsState = 311
					If totscoinfatt <= 0 Then
						Continue
					Else
						rsState = 310
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 310
				Case 310
					rsState = 311
					Main.vccefdll1.ft_testo(modfunstr.left("Tot. Sconti applicati:" & modfunstr.Sub004(24), 24) & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(totscoinfatt, 1, 2, 2, False), 8), 1)
					Main.vccefdll1.ft_testo("********************************", 1)
					Continue
				Case 311
					rsState = 312
					Main.vccefdll1.ft_testo(" ", 1)
					Main.vccefdll1.ft_testo("E IVA   Aliq Imponibile  Imposta", 1)
					Main.vccefdll1.ft_testo("--------------------------------", 1)
					imposta = 0
					Continue
				Case 312
					rsState = 326
					step285 = 1
					limit285 = 9
					x = 0
					rsState = 363
					Continue
				Case 314
					rsState = 315
					Continue
				Case 315
					rsState = 325
					If vLst1.Get(x) <= 0 Then
						Continue
					Else
						rsState = 317
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 317
				Case 317
					rsState = 318
					s4 = tmpeiva & " "
					s4 = s4 & (" " & x)
					vCur3.Position = x
					s4 = s4 & " " & modfunstr.Sub003(modfunstr.Sub004(7) & mod1.Sub093(vCur3.GetDouble("aliquota2")) & " %", 7)
					Dim vObjectToNumber As Double = vLst1.Get(x)
					Dim vObjectToNumber2 As Double = vLst1.Get(x)
					imposta = Round2(vObjectToNumber - vObjectToNumber2 / (1 + vCur3.GetDouble("aliquota2") / 100), 2)
					s4 = s4 & " " & modfunstr.Sub003(modfunstr.Sub004(10) & NumberFormat2(vLst1.Get(x) - imposta, 1, 2, 2, False), 10)
					s4 = s4 & " " & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(imposta, 1, 2, 2, False), 8)
					Main.vccefdll1.ft_testo(s4, 1)
					Continue
				Case 318
					rsState = 321
					If Main.v_attivaterminale And Not(recall) Then
						rsState = 320
						Continue
					End If
					Continue
				Case 320
					rsState = 321
					Dim map6 As Map = mexport
					Dim str2 As String = "iva" & x
					map6.Put(str2, vCur3.GetString("codice"))
					Dim map7 As Map = mexport
					Dim str3 As String = "aliquota" & x
					map7.Put(str3, vCur3.GetString("aliquota2"))
					Dim map8 As Map = mexport
					Dim str4 As String = "imponibile" & x
					map8.Put(str4, NumberFormat2(vLst1.Get(x) - imposta, 1, 2, 2, False))
					mexport.Put("imposta" & x, NumberFormat2(imposta, 1, 2, 2, False))
					Continue
				Case 321
					rsState = 324
					If vCur3.GetDouble("aliquota2") <> 0 Then
						Continue
					Else
						If vCur3.GetInt("natura") <= 0 Then
							Continue
						Else
							rsState = 323
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 323
				Case 323
					rsState = 324
					tmpes = Main.vSql1.ExecQuerySingleResult("select descrizione from FEnaturaIVA where codice = " & vCur3.GetString("natura"))
					Main.vccefdll1.ft_testo("   " & mod1.Sub076(tmpes) & " - " & vCur3.GetString("descrizione"), 1)
					Continue
				Case 324
					rsState = 325
					Continue
				Case 325
					rsState = 364
					Continue
				Case 326
					rsState = 327
					Main.vccefdll1.ft_testo("================================", 1)
					Main.vccefdll1.ft_testo(" ", 1)
					Main.vccefdll1.ft_chiudi
					Continue
				Case 327
					rsState = 332
					If recall Then
						Continue
					Else
						If Not(Main.v_attivaterminale) Then
							Continue
						Else
							rsState = 329
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 329
				Case 329
					rsState = 332
					Sub011(mexport)
					Continue
				Case 332
					rsState = 333
					bexportxml = True
					Continue
				Case 333
					rsState = 336
					If Main.v_attivafe And recall Then
						rsState = 335
						Continue
					End If
					Continue
				Case 335
					rsState = 336
					Dim vObjectToCharSequence As Object = "Si desidera anche rigenerare il file xml ?"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
					bexportxml = (vMsgbox2 = -1)
					Continue
				Case 336
					rsState = 349
					If Main.v_attivafe And bexportxml Then
						rsState = 338
						Continue
					End If
					Continue
				Case 338
					rsState = 339
					'listofmapsf = List
					Sub007(swhere, bfattfmt2)
					Sub020(mtdatatext)
					Dim str5 As String = mtdatafe
					Dim i2 As Int = nfattura
					Dim trim2 As String = cursanagcli.GetString("codice").Trim
					Dim cursorWrapper8 As Cursor = cursanagcli
					Dim str6 As String = " h.nfat=0 and  FattFM=1 and h.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "'"
					Dim list3 As List = listofmapsf
					tmpfn = mod1.Sub002(str5, i2, vMap1, trim2, cursorWrapper8, str6, True, list3, True, vStr2, Activity)
					Continue
				Case 339
					rsState = 348
					If tmpfn <> "" Then
						If Not(File.Exists(File.DirDefaultExternal & "/FE", tmpfn)) Then
							Continue
						Else
							If Not(Main.v_inviofe) Then
								Continue
							Else
								rsState = 341
								Continue
							End If
						End If
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 341
				Case 341
					rsState = 342
					tmppar = "Fattura Num." & nfattura
					Continue
				Case 342
					rsState = 347
					If vStr2 <> "" Then
						rsState = 344
						Continue
					Else
						rsState = 346
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 344
				Case 344
					rsState = 347
					tmppar = "Fattura N." & nfattura & "/" & vStr2
					Continue
				Case 346
					rsState = 347
					tmppar = "Fattura N." & nfattura
					Continue
				Case 347
					rsState = 348
					tmppar = tmppar & sdatafatt
					CallSub3(httpclient, "ComunicaConInviaFE", "http://127.0.0.1:12512/R__INVIO__" & tmpfn & "__", tmppar)
					stmpmail = vMap1.GetDefault("Mail", "")
					preparamailvisualizza("", stmpmail)
					Continue
				Case 348
					rsState = 349
					Continue
				Case 349
					rsState = 350
					Sub022()
					Continue
				Case 350
					rsState = 353
					Continue
				Case 352
					rsState = 353
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 353
					rsState = -1
					rsCatchState = 0
					vBln3 = False
					Main.vDbl2 = 0
					Continue
				Case 354
					rsState = 15
					result = wf354_0
					Continue
				Case 355
					rsState = 102
					If (step102 > 0 And x <= limit102) Or (step102 < 0 And x >= limit102) Then
						rsState = 101
						Continue
					End If
					Continue
				Case 356
					rsState = 355
					x = x + 0 + step102
					Continue
				Case 357
					rsState = 149
					If (step152 > 0 And xxxx <= limit152) Or (step152 < 0 And xxxx >= limit152) Then
						rsState = 144
						Continue
					End If
					Continue
				Case 358
					rsState = 357
					xxxx = xxxx + 0 + step152
					Continue
				Case 359
					rsState = 307
					If (step215 > 0 And x <= limit215) Or (step215 < 0 And x >= limit215) Then
						rsState = 253
						Continue
					End If
					Continue
				Case 360
					rsState = 359
					x = x + 0 + step215
					Continue
				Case 361
					rsState = 296
					If (step242 > 0 And xx <= limit242) Or (step242 < 0 And xx >= limit242) Then
						rsState = 289
						Continue
					End If
					Continue
				Case 362
					rsState = 361
					xx = xx + 0 + step242
					Continue
				Case 363
					rsState = 326
					If (step285 > 0 And x <= limit285) Or (step285 < 0 And x >= limit285) Then
						rsState = 314
						Continue
					End If
					Continue
				Case 364
					rsState = 363
					x = x + 0 + step285
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

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub stampaNF(recall As Boolean)
	Dim limit130 As Int
	Dim limit187 As Int
	Dim limit214 As Int
	Dim limit263 As Int
	Dim limit99 As Int
	Dim step130 As Int
	Dim step187 As Int
	Dim step214 As Int
	Dim step263 As Int
	Dim step99 As Int
	Dim tmpeiva As String
	Dim mexport As Map
	Dim mtdata As String
	Dim mtdatafe As String
	Dim mtdatatext As String
	Dim stestofatt As String
	Dim cursanagcli As Cursor
	Dim nfattura As Int
	Dim bclienteita As Boolean
	Dim rs As ResumableSub
	Dim result As Map
	Dim cursvend As Cursor
	Dim swhere As String
	Dim bfattfmt2 As Boolean
	Dim tmpivaq As String
	Dim mml As modalmline
	Dim tmptf As String
	Dim totscoinfatt As Double
	Dim x As Int
	Dim tmpfattura As StringBuilder
	Dim sdatafatt As String
	Dim stestocliente As String
	Dim scolumn2() As String
	Dim xxxx As Int
	Dim stf As String
	Dim tmpcc As Cursor
	Dim mlastmatr As String
	Dim mdate As String
	Dim mmatr As String
	Dim mdettsco As String
	Dim tmpr As Cursor
	Dim s3 As String
	Dim xx As Int
	Dim mimpo As Double
	Dim mmqta As Double
	Dim tmpimposta As Double
	Dim imposta As Double
	Dim s4 As String
	Dim ncopie As Int
	Dim bexportxml As Boolean
	Dim listofmapsf As List
	Dim tmpfn As String
	Dim tmppar As String
	Dim stmpmail As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 370
					rsCatchState = 369
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 369
					tmpeiva = "I"
					'mexport = Map
					mtdata = dataFattura.Tag
					mtdatafe = ""
					mtdatatext = dataFattura.Text
					stestofatt = ""
					'cursanagcli = Cursor
					nfattura = Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='" & vStr3 & "'")
					bclienteita = True
					Continue
				Case 4
					rsState = 9
					If recall Then
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
					mtdata = vStr7
					mtdatatext = vStr8
					nfattura = vStr5
					Dim cursorWrapper As Cursor
					cursanagcli = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vStr6 & "'")
					cursanagcli.Position = 0
					bclienteita = (Main.vSql1.ExecQuerySingleResult("Select count(*) from FEdatiCli where NazioneCli='IT' and Codice ='" & SmartStringFormatter("", vStr6) & "'") > 0)
					Continue
				Case 8
					rsState = 9
					Dim cursorWrapper2 As Cursor
					cursanagcli = Main.vSql1.ExecQuery("Select * from clienti where codice ='" & vCur1.GetString("codiceCli") & "'")
					cursanagcli.Position = 0
					bclienteita = (Main.vSql1.ExecQuerySingleResult("Select count(*) from FEdatiCli where NazioneCli='IT' and Codice ='" & SmartStringFormatter("", vCur1.GetString("codiceCli")) & "'") > 0)
					Continue
				Case 9
					rsState = 48
					If Not(Main.v_attivafe) Then
						Continue
					Else
						rsState = 11
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 11
				Case 11
					rsState = 12
					Main.vBln35 = False
					mtdatafe = mtdata.SubString(6) & "-" & mtdata.SubString2(0, 2) & "-" & mtdata.SubString2(3, 5)
					vBln5 = False
					Continue
				Case 12
					rsState = 21
					rsState = 14
					Continue
				Case 14
					rsState = 15
					'rs = ResumableSub
					Dim trim As String = cursanagcli.GetString("codice").Trim
					Dim z2 As Boolean = recall
					Dim i As Int = nfattura
					rs = ValidaDatiFattura(trim, z2, i, True, vStr7, " where  FattFM=1 and  headmov.cliente = '" & cursanagcli.GetString("codice").Trim & "' and " & vStr4)
					Wait For (rs) Complete (wf371_0 As Map)
					rsState = 371
					Continue
				Case 15
					rsState = 20
					If vBln5 And result.IsInitialized Then
						rsState = 17
						Continue
					Else
						rsState = 19
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 17
				Case 17
					rsState = 20
					vMap1 = result
					Continue
				Case 19
					rsState = 20
					rsState = 21
					Continue
				Case 20
					rsState = 12
					Continue
				Case 21
					rsState = 32
					If Not(result.IsInitialized) Then
						rsState = 23
						Continue
					Else
						rsState = 25
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 23
				Case 23
					rsState = 32
					Return
				Case 25
					rsState = 26
					vMap1 = result
					Continue
				Case 26
					rsState = 31
					If vMap1.IsInitialized Then
						If vMap1.Size = 0 Then
							rsState = 28
							Continue
						End If
					End If
					rsState = 30
					Continue
				Case 28
					rsState = 31
					vMap1 = Null
					Continue
				Case 30
					rsState = 31
					Main.vBln35 = True
					Continue
				Case 31
					rsState = 32
					Continue
				Case 32
					rsState = 37
					If vMap1.IsInitialized Then
						Continue
					Else
						rsState = 34
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 34
				Case 34
					rsState = 37
					Return
				Case 37
					rsState = 38
					vBln3 = True
					Continue
				Case 38
					rsState = 41
					If vMap1.GetDefault("Memo", "") <> "" Then
						rsState = 40
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 40
				Case 40
					rsState = 41
					stestofatt = vMap1.GetDefault("Memo", "")
					Continue
				Case 41
					rsState = 42
					Main.vDbl2 = 0
					Continue
				Case 42
					rsState = 47
					If 2 <> vMap1.GetDefault("EsigibilitaIVA", 0) Then
						If 1 <> vMap1.GetDefault("EsigibilitaIVA", 0) Then
							Continue
						Else
							rsState = 46
							Continue
						End If
					Else
						rsState = 44
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 44
				Case 44
					rsState = 47
					tmpeiva = "S"
					Continue
				Case 46
					rsState = 47
					tmpeiva = "D"
					Continue
				Case 47
					rsState = 48
					Continue
				Case 48
					rsState = 51
					If recall Then
						Continue
					Else
						rsState = 50
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 50
				Case 50
					rsState = 51
					Main.vSql2.ExecNonQuery("update headmov set nfat_fm = " & nfattura & ",sezionale='" & vStr2 & "',datfat_fm = '" & mtdata & "' where (select count(*) from CausaliPagamenti where CausaliPagamenti.nmov= headmov.nmov And (" & vStr1 & "))>0 And  FattFM=1 And  cliente = '" & vCur1.GetString("codiceCli").Trim & "' and " & vStr4)
					Continue
				Case 51
					rsState = 54
					If Not(Main.v_attivafe) Then
						Continue
					Else
						If Not(vMap1.IsInitialized) Then
							Continue
						Else
							If 2 <> vMap1.GetDefault("EsigibilitaIVA", 0) Then
								Continue
							Else
								rsState = 53
								Continue
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 53
				Case 53
					rsState = 54
					Main.vDbl2 = Sub019(" from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "'")
					Continue
				Case 54
					rsState = 55
					'cursvend = Cursor
					swhere = "where venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and  nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm"
					If Main.v_fatturafmt2 Then
						If Not(cursanagcli.GetInt("abpost") = 1 And cursanagcli.GetDouble("fido") > 0) Then
							z = True
							bfattfmt2 = z
							Continue
						End If
					End If
					z = False
					bfattfmt2 = z
					Continue
				Case 55
					rsState = 64
					If Not(bfattfmt2) Then
						Continue
					Else
						rsState = 57
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 57
				Case 57
					rsState = 58
					Continue
				Case 58
					rsState = 63
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster='" & SmartStringFormatter("", cursanagcli.GetString("codice").Trim) & "' and fido >0") <= 0 Then
						Continue
					Else
						rsState = 60
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 60
				Case 60
					rsState = 63
					bfattfmt2 = False
					Continue
				Case 63
					rsState = 64
					Continue
				Case 64
					rsState = 75
					If Not(bfattfmt2) Then
						rsState = 66
						Continue
					Else
						rsState = 68
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 66
				Case 66
					rsState = 75
					Dim cursorWrapper3 As Cursor
					cursvend = Main.vSql2.ExecQuery("Select (select case when sum(importo) is null then 0 else sum(importo) End from CausaliPagamenti where headmov.cliente = headmov.cliente AND CausaliPagamenti.nmov= headmov.nmov AND (" & vStr1 & ")) As tot, headmov.nric As Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and  nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap order by dataeoraffm")
					Continue
				Case 68
					rsState = 69
					tmpivaq = ",venduto.iva"
					Continue
				Case 69
					rsState = 74
					If Not(Main.v_attivafe) Then
						Continue
					Else
						rsState = 71
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 71
				Case 71
					rsState = 74
					tmpivaq = ""
					Continue
				Case 74
					rsState = 75
					Dim cursorWrapper4 As Cursor
					cursvend = Main.vSql2.ExecQuery("Select sum(importo) as tot, headmov.nric as Ricevuta,headmov.nscontrinoffm as numero,headmov.nChiusura,headmov.dataeoraffm,headmov.datam,matricolacassap,venduto.iva from venduto inner join headmov on venduto.nmov = headmov.nmov where venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and  nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "' group by headmov.nric,nscontrinoffm,headmov.dataeoraffm,matricolacassap" & tmpivaq & " order by dataeoraffm")
					Continue
				Case 75
					rsState = 367
					If cursvend.RowCount <= 0 Then
						Continue
					Else
						rsState = 77
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 77
				Case 77
					rsState = 78
					Continue
				Case 78
					rsState = 98
					If Main.v_attivafe Then
						Continue
					Else
						rsState = 80
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 80
				Case 80
					rsState = 81
					'mml = modalmline
					Dim modalmlineVar As modalmline = mml
					modalmlineVar.Initialize("FatturaFM", 28, Activity)
					Dim modalmlineVar2 As modalmline = mml
					Dim vRGB As Int = Colors.RGB(150, 150, 150)
					Dim vRGB2 As Int = Colors.RGB(150, 150, 150)
					modalmlineVar2.Sub004(vRGB, vRGB2, -256)
					tmptf = ""
					Continue
				Case 81
					rsState = 94
					If recall Then
						rsState = 83
						Continue
					Else If cursanagcli.GetString("codice").Trim <> "" Then
						rsState = 89
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 83
				Case 83
					rsState = 84
					Continue
				Case 84
					rsState = 87
					If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='F_" & nfattura & "'") <= 0 Then
						Continue
					Else
						rsState = 86
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 86
				Case 86
					rsState = 87
					tmptf = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='F_" & nfattura & "'")
					Continue
				Case 87
					rsState = 94
					Continue
				Case 89
					rsState = 90
					Continue
				Case 90
					rsState = 93
					If Main.vSql1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" & cursanagcli.GetString("codice").Trim & "'") <= 0 Then
						Continue
					Else
						rsState = 92
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 92
				Case 92
					rsState = 93
					tmptf = Main.vSql1.ExecQuerySingleResult("select testo from TestiCli where codice='" & cursanagcli.GetString("codice").Trim & "'")
					Continue
				Case 93
					rsState = 94
					Continue
				Case 94
					rsState = 97
					If tmptf <> "" Then
						Continue
					Else
						If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'") <= 0 Then
							Continue
						Else
							rsState = 96
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 96
				Case 96
					rsState = 97
					tmptf = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'")
					Continue
				Case 97
					rsState = 98
					stestofatt = mml.Sub002("Testo aggiuntivo Fattura", "Aggiungi un testo", "", tmptf)
					Continue
				Case 98
					rsState = 99
					totscoinfatt = Main.vSql2.ExecQuerySingleResult("Select case when sum(scov) is null then 0 else sum(scov) end  from venduto inner join headmov on venduto.nmov = headmov.nmov where  headmov.nfat=0 and  FattFM=1 and  venduto.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "'")
					vLst1.Clear
					Continue
				Case 99
					rsState = 102
					step99 = 1
					limit99 = 30
					x = 0
					rsState = 372
					Continue
				Case 101
					rsState = 373
					vLst1.Add(0)
					Continue
				Case 102
					rsState = 103
					'tmpfattura = StringBuilder
					tmpfattura.Initialize
					Continue
				Case 103
					rsState = 112
					If Main.v_attivafe Then
						rsState = 105
						Continue
					Else
						rsState = 111
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 105
				Case 105
					rsState = 106
					tmpfattura.Append("-- COPIA DI CORTESIA ---------------------").Append(CRLF)
					Continue
				Case 106
					rsState = 109
					If Not(bclienteita) Then
						Continue
					Else
						rsState = 108
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 108
				Case 108
					rsState = 109
					tmpfattura.Append("Non valida ai fini fiscali.").Append(CRLF)
					tmpfattura.Append("La fattura verra' resa disponibile ").Append(CRLF)
					tmpfattura.Append("mediante Sistema di Interscambio.").Append(CRLF).Append(CRLF)
					Continue
				Case 109
					rsState = 112
					Continue
				Case 111
					rsState = 112
					tmpfattura.Append("-- DATI FATTURA --------------------------").Append(CRLF)
					Continue
				Case 112
					rsState = 113
					sdatafatt = ""
					sdatafatt = " del " & mtdatatext.SubString(12)
					Continue
				Case 113
					rsState = 118
					If Not(Main.v_orafatt) Then
						Continue
					Else
						rsState = 115
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 115
				Case 115
					rsState = 118
					sdatafatt = sdatafatt & " " & NumberFormat(DateTime.GetHour(mod1.Sub058), 2, 0) & ":" & NumberFormat(DateTime.GetMinute(mod1.Sub058), 2, 0)
					Continue
				Case 118
					rsState = 119
					Sub020(mtdatatext)
					Continue
				Case 119
					rsState = 124
					If vStr2 <> "" Then
						rsState = 121
						Continue
					Else
						rsState = 123
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 121
				Case 121
					rsState = 124
					Dim stringBuilderWrapper As StringBuilder = tmpfattura
					stringBuilderWrapper.Append("Fattura N." & nfattura & "/" & vStr2)
					tmpfattura.Append(sdatafatt).Append(CRLF)
					Continue
				Case 123
					rsState = 124
					tmpfattura.Append("Fattura N." & nfattura & sdatafatt).Append(CRLF)
					Continue
				Case 124
					rsState = 125
					tmpfattura.Append("-- CESSIONARIO ---------------------------" & CRLF)
					Continue
				Case 125
					rsState = 136
					If mod1.Sub222(cursanagcli.GetString("descrizione")) Then
						Continue
					Else
						rsState = 127
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 127
				Case 127
					rsState = 128
					stestocliente = cursanagcli.GetString("descrizione")
					stestocliente = mod1.Sub213(stestocliente, 40, "")
					Dim scolumn2(0) As String
					scolumn2 = Regex.Split(CRLF, stestocliente)
					Continue
				Case 128
					rsState = 135
					step130 = 1
					limit130 = scolumn2.Length - 1
					xxxx = 0
					rsState = 374
					Continue
				Case 130
					rsState = 131
					Continue
				Case 131
					rsState = 134
					If scolumn2(xxxx) <> "" Then
						rsState = 133
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 133
				Case 133
					rsState = 134
					tmpfattura.Append(scolumn2(xxxx).Trim & CRLF)
					Continue
				Case 134
					rsState = 375
					Continue
				Case 135
					rsState = 136
					Continue
				Case 136
					rsState = 141
					If mod1.Sub222(cursanagcli.GetString("via")) Then
						Continue
					Else
						rsState = 138
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 138
				Case 138
					rsState = 141
					tmpfattura.Append(cursanagcli.GetString("via").Trim).Append(CRLF)
					Continue
				Case 141
					rsState = 142
					stf = ""
					Continue
				Case 142
					rsState = 147
					If mod1.Sub222(cursanagcli.GetString("cap")) Then
						Continue
					Else
						rsState = 144
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 144
				Case 144
					rsState = 147
					stf = cursanagcli.GetString("cap").Trim & " "
					Continue
				Case 147
					rsState = 148
					Continue
				Case 148
					rsState = 153
					If mod1.Sub222(cursanagcli.GetString("citta")) Then
						Continue
					Else
						rsState = 150
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 150
				Case 150
					rsState = 153
					stf = stf & (cursanagcli.GetString("citta").Trim & " ")
					Continue
				Case 153
					rsState = 154
					Continue
				Case 154
					rsState = 159
					If mod1.Sub222(cursanagcli.GetString("provincia")) Then
						Continue
					Else
						rsState = 156
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 156
				Case 156
					rsState = 159
					stf = stf & (cursanagcli.GetString("provincia").Trim & " ")
					Continue
				Case 159
					rsState = 160
					Continue
				Case 160
					rsState = 165
					If mod1.Sub222(stf) Then
						Continue
					Else
						rsState = 162
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 162
				Case 162
					rsState = 165
					tmpfattura.Append(stf).Append(CRLF)
					Continue
				Case 165
					rsState = 166
					Continue
				Case 166
					rsState = 171
					If mod1.Sub222(cursanagcli.GetString("piva")) Then
						Continue
					Else
						rsState = 168
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 168
				Case 168
					rsState = 171
					tmpfattura.Append("P.IVA: " & cursanagcli.GetString("piva").Trim).Append(CRLF)
					Continue
				Case 171
					rsState = 172
					Continue
				Case 172
					rsState = 177
					If mod1.Sub222(cursanagcli.GetString("codf")) Then
						Continue
					Else
						rsState = 174
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 174
				Case 174
					rsState = 177
					tmpfattura.Append("C.F.: " & cursanagcli.GetString("codf").Trim).Append(CRLF)
					Continue
				Case 177
					rsState = 178
					Continue
				Case 178
					rsState = 219
					If Not(Main.v_attivafe) Then
						Continue
					Else
						rsState = 180
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 180
				Case 180
					rsState = 181
					Continue
				Case 181
					rsState = 218
					If Main.vSql1.ExecQuerySingleResult("select count(*) from FEdatiCli where codice ='" & cursanagcli.GetString("codice") & "'") <= 0 Then
						Continue
					Else
						rsState = 183
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 183
				Case 183
					rsState = 184
					'tmpcc = Cursor
					Dim cursorWrapper5 As Cursor
					tmpcc = Main.vSql1.ExecQuery("select * from FEdatiCli where codice ='" & cursanagcli.GetString("codice") & "'")
					Continue
				Case 184
					rsState = 217
					If tmpcc.RowCount <= 0 Then
						Continue
					Else
						rsState = 186
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 186
				Case 186
					rsState = 187
					tmpcc.Position = 0
					Continue
				Case 187
					rsState = 192
					If mod1.Sub222(tmpcc.GetString("NomeCli")) Then
						Continue
					Else
						rsState = 189
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 189
				Case 189
					rsState = 192
					tmpfattura.Append("Nome: " & tmpcc.GetString("NomeCli").Trim & CRLF)
					Continue
				Case 192
					rsState = 193
					Continue
				Case 193
					rsState = 198
					If mod1.Sub222(tmpcc.GetString("CognomeCli")) Then
						Continue
					Else
						rsState = 195
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 195
				Case 195
					rsState = 198
					tmpfattura.Append("Cognome: " & tmpcc.GetString("CognomeCli").Trim & CRLF)
					Continue
				Case 198
					rsState = 199
					Continue
				Case 199
					rsState = 204
					If Not(mod1.Sub222(tmpcc.GetString("NazioneCli"))) And tmpcc.GetString("NazioneCli") <> "IT" Then
						rsState = 201
						Continue
					End If
					Continue
				Case 201
					rsState = 204
					tmpfattura.Append("Nazione: " & tmpcc.GetString("NazioneCli").Trim & CRLF)
					Continue
				Case 204
					rsState = 205
					Continue
				Case 205
					rsState = 210
					If mod1.Sub222(tmpcc.GetString("CodiceDestinatario")) Then
						Continue
					Else
						rsState = 207
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 207
				Case 207
					rsState = 210
					tmpfattura.Append("Codice Destinatario: " & tmpcc.GetString("CodiceDestinatario").Trim & CRLF)
					Continue
				Case 210
					rsState = 211
					Continue
				Case 211
					rsState = 216
					If mod1.Sub222(tmpcc.GetString("PEC")) Then
						Continue
					Else
						rsState = 213
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 213
				Case 213
					rsState = 216
					tmpfattura.Append("PEC: " & tmpcc.GetString("PEC").Trim & CRLF)
					Continue
				Case 216
					rsState = 217
					Continue
				Case 217
					rsState = 218
					tmpcc.Close
					Continue
				Case 218
					rsState = 219
					Continue
				Case 219
					rsState = 220
					tmpfattura.Append(" ").Append(CRLF)
					Continue
				Case 220
					rsState = 223
					If Main.v_attivaterminale And Not(recall) Then
						rsState = 222
						Continue
					End If
					Continue
				Case 222
					rsState = 223
					mexport.Initialize
					Dim map As Map = mexport
					map.Put("cliente", vCur1.GetString("codiceCli"))
					Dim map2 As Map = mexport
					map2.Put("totale", vCur1.GetString("totale"))
					Dim map3 As Map = mexport
					map3.Put("datam", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
					mexport.Put("numero", nfattura)
					mexport.Put("dataFatt", mtdatatext.SubString(12))
					Dim map4 As Map = mexport
					map4.Put("negozio", Main.v_nnegozio)
					Dim map5 As Map = mexport
					map5.Put("cassa", Main.v_numcassa)
					Continue
				Case 223
					rsState = 226
					If Not(vMap1.IsInitialized) Then
						Continue
					Else
						rsState = 225
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 225
				Case 225
					rsState = 226
					Sub004(tmpfattura)
					Continue
				Case 226
					rsState = 227
					Sub021(stestofatt, nfattura, tmpfattura, "stampaNF")
					tmpfattura.Append("-- RIGHE ---------------------------------" & CRLF)
					Continue
				Case 227
					rsState = 234
					If bfattfmt2 Then
						If Main.v_attivafe Then
							rsState = 229
							Continue
						End If
					End If
					If Not(bfattfmt2) Then
						If Main.v_attivafe Then
							rsState = 231
							Continue
						End If
					End If
					rsState = 233
					Continue
				Case 229
					rsState = 234
					Dim stringBuilderWrapper2 As StringBuilder = tmpfattura
					stringBuilderWrapper2.Append("Descrizione" & modfunstr.Sub004(8) & " IVA  Prz.Un    Qta Imponib.  Importo" & CRLF)
					tmpfattura.Append("--------------------------------------------------------" & CRLF)
					Continue
				Case 231
					rsState = 234
					tmpfattura.Append("       Dati scontrino           ").Append(CRLF)
					tmpfattura.Append("Descriz.                   Importo   Iva").Append(CRLF)
					tmpfattura.Append("--------------------------------------------------------" & CRLF)
					Continue
				Case 233
					rsState = 234
					tmpfattura.Append("       Dati scontrino           ").Append(CRLF)
					tmpfattura.Append("Descrizione                Importo   Iva").Append(CRLF)
					tmpfattura.Append("--------------------------------------------------------" & CRLF)
					Continue
				Case 234
					rsState = 235
					mlastmatr = ""
					Continue
				Case 235
					rsState = 296
					step187 = 1
					limit187 = cursvend.RowCount - 1
					x = 0
					rsState = 376
					Continue
				Case 237
					rsState = 238
					cursvend.Position = x
					Continue
				Case 238
					rsState = 295
					If cursvend.GetDouble("tot") = 0 Then
						Continue
					Else
						rsState = 240
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 240
				Case 240
					rsState = 241
					mdate = cursvend.GetString("dataeoraffm")
					mmatr = cursvend.GetString("matricolacassap")
					Continue
				Case 241
					rsState = 246
					If Not(mdate = Null) Then
						Continue
					Else
						rsState = 243
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 243
				Case 243
					rsState = 246
					mdate = cursvend.GetString("datam")
					Continue
				Case 246
					rsState = 247
					Continue
				Case 247
					rsState = 252
					If Not(mmatr = Null) Then
						Continue
					Else
						rsState = 249
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 249
				Case 249
					rsState = 252
					mmatr = ""
					Continue
				Case 252
					rsState = 253
					mdettsco = ""
					Continue
				Case 253
					rsState = 258
					If cursvend.GetInt("numero") > 0 Then
						rsState = 255
						Continue
					Else If cursvend.GetInt("Ricevuta") <= 0 Then
						Continue
					Else
						rsState = 257
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 255
				Case 255
					rsState = 258
					mdettsco = "SC." & Sub013(cursvend) & " del " & mdate.SubString2(3, 5) & "/" & mdate.SubString2(0, 2) & "/" & mdate.SubString2(6, 10)
					Continue
				Case 257
					rsState = 258
					mdate = cursvend.GetString("datam")
					mdettsco = "RC.N." & cursvend.GetString("Ricevuta") & " del " & mdate.SubString2(3, 5) & "/" & mdate.SubString2(0, 2) & "/" & mdate.SubString2(6, 10)
					Continue
				Case 258
					rsState = 261
					If cursvend.GetInt("numero") > 0 And mlastmatr <> mmatr Then
						rsState = 260
						Continue
					End If
					Continue
				Case 260
					rsState = 261
					tmpfattura.Append("Scontrini del MF:" & mmatr).Append(CRLF)
					Continue
				Case 261
					rsState = 262
					mlastmatr = mmatr
					Continue
				Case 262
					rsState = 294
					If bfattfmt2 Then
						If Main.v_attivafe And (cursvend.GetInt("numero") > 0 Or cursvend.GetInt("Ricevuta") > 0) Then
							rsState = 264
							Continue
						End If
					End If
					rsState = 287
					Continue
				Case 264
					rsState = 265
					'tmpr = Cursor
					Continue
				Case 265
					rsState = 270
					If cursvend.GetInt("numero") > 0 Then
						rsState = 267
						Continue
					Else If cursvend.GetInt("Ricevuta") <= 0 Then
						Continue
					Else
						rsState = 269
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 267
				Case 267
					rsState = 270
					Dim cursorWrapper6 As Cursor
					tmpr = Main.vSql2.ExecQuery("Select venduto.descrizione, iva,prezzov,venduto.qta,venduto.importo from venduto inner join headmov on venduto.nmov = headmov.nmov inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov where CausaliPagamenti.codice=2 And  headmov.nfat=0 And  FattFM=1 And  nfat_fm =" & nfattura & " And datfat_fm = '" & mtdata & "' and headmov.dataeoraffm='" & cursvend.GetString("dataeoraffm") & "' and headmov.nscontrinoffm=" & cursvend.GetString("numero") & " and headmov.nChiusura=" & cursvend.GetString("nChiusura"))
					Continue
				Case 269
					rsState = 270
					Dim cursorWrapper7 As Cursor
					tmpr = Main.vSql2.ExecQuery("Select venduto.descrizione, iva,prezzov,venduto.qta,venduto.importo from venduto inner join headmov on venduto.nmov = headmov.nmov inner join CausaliPagamenti on causalipagamenti.nmov=headmov.nmov where CausaliPagamenti.codice=2 And  headmov.nfat=0 And  FattFM=1 And  nfat_fm =" & nfattura & " And datfat_fm = '" & mtdata & "' and headmov.nric=" & cursvend.GetString("Ricevuta"))
					Continue
				Case 270
					rsState = 271
					s3 = ""
					tmpfattura.Append(mdettsco).Append(CRLF)
					Continue
				Case 271
					rsState = 280
					step214 = 1
					limit214 = tmpr.RowCount - 1
					xx = 0
					rsState = 378
					Continue
				Case 273
					rsState = 274
					tmpr.Position = xx
					mimpo = tmpr.GetDouble("importo")
					mmqta = tmpr.GetDouble("qta")
					s3 = ""
					vCur3.Position = tmpr.GetInt("iva")
					s3 = modfunstr.left(tmpr.GetString("descrizione") & modfunstr.Sub004(19), 19)
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(4) & tmpr.GetString("iva"), 4)
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(mimpo / mmqta, 1, 2, 2, False), 8)
					Continue
				Case 274
					rsState = 279
					If mmqta * 1000 Mod 1000 = 0 Then
						rsState = 276
						Continue
					Else
						rsState = 278
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 276
				Case 276
					rsState = 279
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat(mmqta, 1, 0), 7)
					Continue
				Case 278
					rsState = 279
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(mmqta, 1, 3, 3, False), 7)
					Continue
				Case 279
					rsState = 379
					tmpimposta = Round2(mimpo, 4)
					Dim d As Double = tmpimposta
					Dim d2 As Double = tmpimposta
					tmpimposta = d - d2 / (1 + vCur3.GetDouble("aliquota2") / 100)
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(mimpo - tmpimposta, 1, 4, 4, False), 9)
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(mimpo, 1, 2, 2, False), 9)
					tmpfattura.Append(s3).Append(CRLF)
					Dim vGetInt As Int = tmpr.GetInt("iva")
					vLst1.Set(vGetInt, vLst1.Get(tmpr.GetInt("iva")) + mimpo)
					Continue
				Case 280
					rsState = 285
					If Not(tmpr.IsInitialized) Then
						Continue
					Else
						rsState = 282
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 282
				Case 282
					rsState = 285
					tmpr.Close
					Continue
				Case 285
					rsState = 294
					Continue
				Case 287
					rsState = 288
					s3 = ""
					Continue
				Case 288
					rsState = 293
					If Main.v_attivafe Then
						rsState = 290
						Continue
					Else
						rsState = 292
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 290
				Case 290
					rsState = 293
					s3 = modfunstr.left(mdettsco & modfunstr.Sub004(23), 23)
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(cursvend.GetDouble("tot"), 1, 2, 2, False), 8)
					s3 = s3 & " " & modfunstr.Sub003(modfunstr.Sub004(5) & NumberFormat2(cursvend.GetDouble("iva"), 1, 0, 0, False), 5)
					Continue
				Case 292
					rsState = 293
					s3 = modfunstr.left(mdettsco & modfunstr.Sub004(9), 26)
					s3 = s3 & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(cursvend.GetDouble("tot"), 1, 2, 2, False), 8)
					s3 = s3 & " " & modfunstr.Sub003(modfunstr.Sub004(5) & NumberFormat2(cursvend.GetDouble("iva"), 1, 0, 0, False), 5)
					Continue
				Case 293
					rsState = 294
					tmpfattura.Append(s3).Append(CRLF)
					Dim vGetInt2 As Int = cursvend.GetInt("iva")
					vLst1.Set(vGetInt2, vLst1.Get(cursvend.GetInt("iva")) + cursvend.GetDouble("tot"))
					Continue
				Case 294
					rsState = 295
					Continue
				Case 295
					rsState = 377
					Continue
				Case 296
					rsState = 297
					tmpfattura.Append("****************************************").Append(CRLF)
					Continue
				Case 297
					rsState = 300
					If totscoinfatt <= 0 Then
						Continue
					Else
						rsState = 299
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 299
				Case 299
					rsState = 300
					tmpfattura.Append(" ").Append(CRLF)
					tmpfattura.Append(" ").Append(CRLF)
					Dim stringBuilderWrapper3 As StringBuilder = tmpfattura
					stringBuilderWrapper3.Append(modfunstr.left("Tot. Sconti applicati:" & modfunstr.Sub004(26), 26) & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(totscoinfatt, 1, 2, 2, False), 8)).Append("      ").Append(CRLF)
					tmpfattura.Append("****************************************").Append(CRLF)
					Continue
				Case 300
					rsState = 301
					tmpfattura.Append(" ").Append(CRLF)
					tmpfattura.Append("E IVA   Aliq Imponibile  Imposta").Append(CRLF)
					tmpfattura.Append("--------------------------------").Append(CRLF)
					imposta = 0
					Continue
				Case 301
					rsState = 315
					step263 = 1
					limit263 = 9
					x = 0
					rsState = 380
					Continue
				Case 303
					rsState = 304
					Continue
				Case 304
					rsState = 314
					If vLst1.Get(x) <= 0 Then
						Continue
					Else
						rsState = 306
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 306
				Case 306
					rsState = 307
					s4 = tmpeiva & " "
					s4 = s4 & (" " & x)
					vCur3.Position = x
					s4 = s4 & " " & modfunstr.Sub003(modfunstr.Sub004(7) & mod1.Sub093(vCur3.GetDouble("aliquota2")) & " %", 7)
					Dim vObjectToNumber As Double = vLst1.Get(x)
					Dim vObjectToNumber2 As Double = vLst1.Get(x)
					imposta = Round2(vObjectToNumber - vObjectToNumber2 / (1 + vCur3.GetDouble("aliquota2") / 100), 2)
					s4 = s4 & " " & modfunstr.Sub003(modfunstr.Sub004(10) & NumberFormat2(vLst1.Get(x) - imposta, 1, 2, 2, False), 10)
					s4 = s4 & " " & modfunstr.Sub003(modfunstr.Sub004(8) & NumberFormat2(imposta, 1, 2, 2, False), 8)
					tmpfattura.Append(s4).Append(CRLF)
					Continue
				Case 307
					rsState = 310
					If Main.v_attivaterminale And Not(recall) Then
						rsState = 309
						Continue
					End If
					Continue
				Case 309
					rsState = 310
					Dim map6 As Map = mexport
					Dim str2 As String = "iva" & x
					map6.Put(str2, vCur3.GetString("codice"))
					Dim map7 As Map = mexport
					Dim str3 As String = "aliquota" & x
					map7.Put(str3, vCur3.GetString("aliquota2"))
					Dim map8 As Map = mexport
					Dim str4 As String = "imponibile" & x
					map8.Put(str4, NumberFormat2(vLst1.Get(x) - imposta, 1, 2, 2, False))
					mexport.Put("imposta" & x, NumberFormat2(imposta, 1, 2, 2, False))
					Continue
				Case 310
					rsState = 313
					If vCur3.GetDouble("aliquota2") <> 0 Then
						Continue
					Else
						If vCur3.GetInt("natura") <= 0 Then
							Continue
						Else
							rsState = 312
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 312
				Case 312
					rsState = 313
					Dim stringBuilderWrapper4 As StringBuilder = tmpfattura
					Dim vAppend As StringBuilder = stringBuilderWrapper4.Append(Main.vSql1.ExecQuerySingleResult("select descrizione from FEnaturaIVA where codice = " & vCur3.GetString("natura")))
					vAppend.Append(" --" & vCur3.GetString("descrizione")).Append(CRLF)
					Continue
				Case 313
					rsState = 314
					Continue
				Case 314
					rsState = 381
					Continue
				Case 315
					rsState = 316
					tmpfattura.Append("================================").Append(CRLF)
					tmpfattura.Append(" ").Append(CRLF)
					Continue
				Case 316
					rsState = 321
					If recall Then
						rsState = 318
						Continue
					Else
						rsState = 320
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 318
				Case 318
					rsState = 321
					Dim stringBuilderWrapper5 As StringBuilder = tmpfattura
					stringBuilderWrapper5.Append("TOTALE FATTURA:" & modfunstr.Sub003(modfunstr.Sub004(17) & NumberFormat2(vDbl1, 1, 2, 2, False), 17))
					Continue
				Case 320
					rsState = 321
					Dim stringBuilderWrapper6 As StringBuilder = tmpfattura
					stringBuilderWrapper6.Append("TOTALE FATTURA:" & modfunstr.Sub003(modfunstr.Sub004(17) & NumberFormat2(vCur1.GetDouble("totale"), 1, 2, 2, False), 17))
					Continue
				Case 321
					rsState = 330
					If Main.vDbl2 <= 0 Then
						Continue
					Else
						rsState = 323
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 323
				Case 323
					rsState = 324
					tmpfattura.Append(" ").Append(CRLF)
					tmpfattura.Append("Operazione assoggettata a  ").Append(CRLF)
					tmpfattura.Append("split payment con IVA non  ").Append(CRLF)
					tmpfattura.Append("incassata dal cedente ai sensi ").Append(CRLF)
					tmpfattura.Append("dell’ex art.Anon_17-ter DPR 633/1972").Append(CRLF)
					tmpfattura.Append(" ")
					Continue
				Case 324
					rsState = 329
					If recall Then
						rsState = 326
						Continue
					Else
						rsState = 328
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 326
				Case 326
					rsState = 329
					Dim stringBuilderWrapper7 As StringBuilder = tmpfattura
					stringBuilderWrapper7.Append("TOTALE DA PAGARE:" & modfunstr.Sub003(modfunstr.Sub004(15) & NumberFormat2(vDbl1 - Main.vDbl2, 1, 2, 2, False), 15))
					Continue
				Case 328
					rsState = 329
					Dim stringBuilderWrapper8 As StringBuilder = tmpfattura
					Dim doubleValue As Double = vCur1.GetDouble("totale")
					stringBuilderWrapper8.Append("TOTALE DA PAGARE:" & modfunstr.Sub003(modfunstr.Sub004(15) & NumberFormat2(doubleValue - Main.vDbl2, 1, 2, 2, False), 15))
					Continue
				Case 329
					rsState = 330
					Continue
				Case 330
					rsState = 331
					ncopie = 0
					Continue
				Case 331
					rsState = 336
					If Not(vMap1.IsInitialized) Then
						Continue
					Else
						rsState = 333
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 333
				Case 333
					rsState = 336
					ncopie = vMap1.GetDefault("Copie", 0)
					Continue
				Case 336
					rsState = 337
					Continue
				Case 337
					rsState = 340
					Dim vObjectToString As String = tmpfattura
					Dim i2 As Int = ncopie
					If mod1.Sub189(vObjectToString, True, i2, vMap1.GetDefault("TipoDocumento", "")) Then
						Continue
					Else
						rsState = 339
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 339
				Case 339
					rsState = 340
					Dim vObjectToCharSequence As Object = "La Fattura non è stata stampata a causa di un problema sulla stampante Non Fiscale."
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					Continue
				Case 340
					rsState = 349
					If recall Then
						Continue
					Else
						rsState = 342
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 342
				Case 342
					rsState = 343
					Main.vSql1.ExecNonQuery("update  progressivi set valore = " & nfattura + 1 & "  where codice ='" & vStr3 & "'")
					Continue
				Case 343
					rsState = 348
					If Not(Main.v_attivaterminale) Then
						Continue
					Else
						rsState = 345
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 345
				Case 345
					rsState = 348
					Sub011(mexport)
					Continue
				Case 348
					rsState = 349
					Continue
				Case 349
					rsState = 350
					bexportxml = True
					Continue
				Case 350
					rsState = 353
					If Main.v_attivafe And recall Then
						rsState = 352
						Continue
					End If
					Continue
				Case 352
					rsState = 353
					Dim vObjectToCharSequence3 As Object = "Si desidera anche rigenerare il file xml ?"
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
					bexportxml = (vMsgbox2 = -1)
					Continue
				Case 353
					rsState = 366
					If Main.v_attivafe And bexportxml Then
						rsState = 355
						Continue
					End If
					Continue
				Case 355
					rsState = 356
					'listofmapsf = List
					Sub007(swhere, bfattfmt2)
					Sub020(mtdatatext)
					Dim str5 As String = mtdatafe
					Dim i3 As Int = nfattura
					Dim trim2 As String = cursanagcli.GetString("codice").Trim
					Dim cursorWrapper8 As Cursor = cursanagcli
					Dim str6 As String = " h.nfat=0 and  FattFM=1 and h.cliente ='" & cursanagcli.GetString("codice").Trim & "' and nfat_fm =" & nfattura & " and datfat_fm = '" & mtdata & "'"
					Dim list3 As List = listofmapsf
					tmpfn = mod1.Sub002(str5, i3, vMap1, trim2, cursorWrapper8, str6, True, list3, True, vStr2, Activity)
					Continue
				Case 356
					rsState = 365
					If tmpfn <> "" Then
						If Not(File.Exists(File.DirDefaultExternal & "/FE", tmpfn)) Then
							Continue
						Else
							If Not(Main.v_inviofe) Then
								Continue
							Else
								rsState = 358
								Continue
							End If
						End If
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 358
				Case 358
					rsState = 359
					tmppar = "Fattura Num." & nfattura
					Continue
				Case 359
					rsState = 364
					If vStr2 <> "" Then
						rsState = 361
						Continue
					Else
						rsState = 363
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 361
				Case 361
					rsState = 364
					tmppar = "Fattura N." & nfattura & "/" & vStr2
					Continue
				Case 363
					rsState = 364
					tmppar = "Fattura N." & nfattura
					Continue
				Case 364
					rsState = 365
					tmppar = tmppar & sdatafatt
					CallSub3(httpclient, "ComunicaConInviaFE", "http://127.0.0.1:12512/R__INVIO__" & tmpfn & "__", tmppar)
					stmpmail = vMap1.GetDefault("Mail", "")
					preparamailvisualizza("", stmpmail)
					Continue
				Case 365
					rsState = 366
					Continue
				Case 366
					rsState = 367
					Sub022()
					Continue
				Case 367
					rsState = 370
					Continue
				Case 369
					rsState = 370
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 370
					rsState = -1
					rsCatchState = 0
					Main.vDbl2 = 0
					vBln3 = False
					Continue
				Case 371
					rsState = 15
					result = wf371_0
					Continue
				Case 372
					rsState = 102
					If (step99 > 0 And x <= limit99) Or (step99 < 0 And x >= limit99) Then
						rsState = 101
						Continue
					End If
					Continue
				Case 373
					rsState = 372
					x = x + 0 + step99
					Continue
				Case 374
					rsState = 135
					If (step130 > 0 And xxxx <= limit130) Or (step130 < 0 And xxxx >= limit130) Then
						rsState = 130
						Continue
					End If
					Continue
				Case 375
					rsState = 374
					xxxx = xxxx + 0 + step130
					Continue
				Case 376
					rsState = 296
					If (step187 > 0 And x <= limit187) Or (step187 < 0 And x >= limit187) Then
						rsState = 237
						Continue
					End If
					Continue
				Case 377
					rsState = 376
					x = x + 0 + step187
					Continue
				Case 378
					rsState = 280
					If (step214 > 0 And xx <= limit214) Or (step214 < 0 And xx >= limit214) Then
						rsState = 273
						Continue
					End If
					Continue
				Case 379
					rsState = 378
					xx = xx + 0 + step214
					Continue
				Case 380
					rsState = 315
					If (step263 > 0 And x <= limit263) Or (step263 < 0 And x >= limit263) Then
						rsState = 303
						Continue
					End If
					Continue
				Case 381
					rsState = 380
					x = x + 0 + step263
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

Sub Sub021(str As String, i As Int, stringBuilderWrapper As StringBuilder, str2 As String)
	Dim i2 As Int
	If str <> "" And str <> "Inserire Testo" Then
		If str <> -3 Then
			If str2 = "stampaF" Then
				i2 = 32
			Else If str2 = "stampaNF" Then
				i2 = 40
			Else If str2 = "stampaPDF" Then
				i2 = 35
			Else
				Return
			End If
			Main.vSql2.ExecNonQuery("delete from TestiDoc where nmov='F_" & i & "'")
			Main.vSql2.ExecNonQuery("insert into TestiDoc (nmov,testo) values('F_" & i & "','" & str & "')")
			Dim vTmp As String = mod1.Sub213(str, i2, "")
			Dim vSplit() As String = Regex.Split(CRLF, vTmp)
			Dim length As Int = vSplit.Length - 1
			Dim i3 As Int
			For i3 = 0 To length
				If vSplit(i3) <> "" Then
					If str2 = "stampaF" Then
						Main.vccefdll1.ft_testo(vSplit(i3).Trim, 1)
					Else
						stringBuilderWrapper.Append(vSplit(i3).Trim).Append(CRLF)
					End If
				End If
			Next
			If Not(Main.v_attivafe) Then
				If str2 = "stampaF" Then
					Main.vccefdll1.ft_testo("********************************", 1)
				Else
					stringBuilderWrapper.Append("********************************").Append(CRLF)
				End If
			End If
		End If
	End If
End Sub

Sub Sub022
	mod1.vStr2 = "Sub Trova"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If daData.Tag = "" Then
		Dim vObjectToCharSequence As Object = "Selezionare la data di inizio ricerca"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
	If aData.Tag = "" Then
		Dim vObjectToCharSequence3 As Object = "Selezionare la data di fine ricerca"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		Return
	End If
	vStr4 = " headmov.cliente<>'' and  headmov.nfat=0 and headmov.datam3 > '" & daData.Tag & "' and headmov.datam3 < '" & aData.Tag & "' and (nscontrinoffm >0 or  RicDaFatt=1) and nfat_fm=0"
	ProgressDialogShow("Attendere ... Estrazione dati in corso ...")
	DoEvents
	DoEvents
	Dim sb As String = "select cliente As codiceCli,Max(clides) As descrizione," & CRLF & TAB & TAB & "(Select Case when sum(importo) Is Null Then -99999999 Else sum(importo) End" & CRLF & TAB & TAB & "from CausaliPagamenti inner join headmov As h2 on CausaliPagamenti.nmov= h2.nmov" & CRLF & TAB & TAB & "where  h2.FattFM=1 And h2.cliente = headmov.cliente  And" & CRLF & TAB & TAB & "(" & SmartStringFormatter("", vStr1) & ")" & CRLF & TAB & TAB & "And " & SmartStringFormatter("", vStr4.Replace("headmov.datam3", "h2.datam3")) & ") As totale" & CRLF & TAB & TAB & "from headmov inner join CausaliPagamenti on  CausaliPagamenti.nmov= headmov.nmov" & CRLF & TAB & TAB & "where (" & SmartStringFormatter("", vStr1) & ") And " & SmartStringFormatter("", vStr4) & CRLF & TAB & TAB & "group by codiceCli order by upper(descrizione) "
	If Main.v_lastdatadocfm Then
		Main.vSql2.ExecNonQuery("delete from TmpClientiFM")
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql2.ExecQuery(sb)
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			Dim vExecQuerySingleResult As String = Main.vSql2.ExecQuerySingleResult("select max(headmov.datam3)" & CRLF & TAB & TAB & TAB & TAB & "from CausaliPagamenti inner join headmov  on CausaliPagamenti.nmov= headmov.nmov " & CRLF & TAB & TAB & TAB & TAB & TAB & "where  headmov.FattFM=1 and headmov.cliente ='" & SmartStringFormatter("", cursorWrapper2.GetString("codiceCli")) & "'  AND" & CRLF & TAB & TAB & TAB & TAB & TAB & "(" & SmartStringFormatter("", vStr1) & ") " & CRLF & TAB & TAB & TAB & TAB & TAB & "And  " & SmartStringFormatter("", vStr4) & "")
			If Not(vExecQuerySingleResult = Null) Then
				Main.vSql2.ExecNonQuery("insert into TmpClientiFM(codiceCli,descrizione,totale,MaxData)" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " values('" & SmartStringFormatter("", cursorWrapper2.GetString("codiceCli")) & "','" & SmartStringFormatter("", cursorWrapper2.GetString("descrizione")) & "'," & SmartStringFormatter("", cursorWrapper2.GetString("totale")) & ",'" & SmartStringFormatter("", vExecQuerySingleResult) & "')" & CRLF & TAB & TAB & TAB & TAB)
			End If
		Next
		Dim cursorWrapper3 As Cursor
		vCur1 = Main.vSql2.ExecQuery("select * from TmpClientiFM order by MaxData")
	Else
		Dim cursorWrapper4 As Cursor
		vCur1 = Main.vSql2.ExecQuery(sb)
	End If
	vcustomlistviewold1.Sub004
	If vCur1.RowCount > 0 Then
		If Main.v_lastdatadocfm Then
			vInt2 = -1
		End If
		Dim rowCount2 As Int = vCur1.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount2
			vCur1.Position = i2
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where abprep=1 and codice ='" & SmartStringFormatter("", vCur1.GetString("codiceCli")) & "'") <= 0 Then
				vcustomlistviewold1.Sub001(Sub008(i2, vCur1.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur1.GetString("descrizione"))
			End If
		Next
		vcustomlistviewold1.Sub012(0)
	End If
	ProgressDialogHide
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub ValidaDatiFattura(scodcli As String, recall As Boolean, nfattura As Int, bshowcopie As Boolean, datarecall As String, where As String) As ResumableSub
	Dim limit46 As Int
	Dim limit8 As Int
	Dim step46 As Int
	Dim step8 As Int
	Dim mapdatife As Map
	Dim bsplitpayment As Boolean
	Dim ctmp As Cursor
	Dim x As Int
	Dim tmpc As Cursor
	Dim tmpcli As Cursor
	Dim squery As String
	Dim ltipodoc As List
	Dim ctmptd As Cursor
	Dim scodicerecalltipodoc As String
	Dim iposizionerecalltipodoc As Int
	Dim tmpcrecall As Cursor
	Dim tmpk As String
	Dim icontaaggiunti As Int
	Dim xx As Int
	Dim stmpvalidacli As String
	Dim detailsdialog As CustomLayoutDialog
	Dim stmp As String
	Dim sf As Object
	Dim pnl As Panel
	Dim esigibilitacli As Int
	Dim tmptf As String
	Dim res As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return Null
			Case 0
				rsState = 1
				'mapdatife = Map
				Continue
			Case 1
				rsState = 156
				If Not(Main.v_attivafe) Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 4
				Continue
			Case 4
				rsState = 9
				If mod1.Sub208 Then
					Continue
				Else
					rsState = 6
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 9
				Return mapdatife
			Case 9
				rsState = 10
				bsplitpayment = True
				mod1.Sub003(scodcli)
				Continue
			Case 10
				rsState = 26
				If recall Then
					Continue
				Else
					rsState = 12
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 12
			Case 12
				rsState = 13
				'ctmp = Cursor
				Dim cursorWrapper As Cursor
				ctmp = Main.vSql2.ExecQuery("select venduto.codint,max(iva) as iva from headmov inner join venduto on venduto.nmov= headmov.nmov " & where & " group by venduto.codint")
				Continue
			Case 13
				rsState = 25
				step8 = 1
				limit8 = ctmp.RowCount - 1
				x = 0
				rsState = 157
				Continue
			Case 15
				rsState = 16
				ctmp.Position = x
				Continue
			Case 16
				rsState = 19
				If Main.vSql1.ExecQuerySingleResult("select count(*) from iva where codice = " & ctmp.GetString("iva") & " and  natura=0 and aliquota2=0") <= 0 Then
					Continue
				Else
					rsState = 18
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 18
			Case 18
				rsState = 19
				Dim vObjectToCharSequence As Object = "Nella configurazione delle aliquote IVA non sono stati inseriti i dati necessari sulla Natura(in caso di Aliquota=0)."
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Return mapdatife
			Case 19
				rsState = 24
				If Not(bsplitpayment) Then
					Continue
				Else
					If Main.vSql1.ExecQuerySingleResult("select count(*) from iva where codice = " & ctmp.GetString("iva") & " and  natura=6 and aliquota2=0") <= 0 Then
						Continue
					Else
						rsState = 21
						Continue
					End If
				End If
				'(fallthrough java verso il case successivo)
				rsState = 21
			Case 21
				rsState = 24
				bsplitpayment = False
				Continue
			Case 24
				rsState = 158
				Continue
			Case 25
				rsState = 26
				ctmp.Close
				Continue
			Case 26
				rsState = 27
				'tmpc = Cursor
				Dim cursorWrapper2 As Cursor
				tmpc = Main.vSql1.ExecQuery("Select * from FEdatiCli where Codice ='" & scodcli & "'")
				'tmpcli = Cursor
				Dim cursorWrapper3 As Cursor
				tmpcli = Main.vSql1.ExecQuery("Select piva,codf,descrizione,provincia,cap,via,citta,mail from clienti where Codice ='" & scodcli & "'")
				tmpc.Position = 0
				tmpcli.Position = 0
				squery = "select * from FECodiciDocumento where AttivoDifferita > 0  order by AttivoDifferita desc, documento"
				Continue
			Case 27
				rsState = 30
				If Main.vCur7.GetString("CodForn") = tmpcli.GetString("piva") And tmpcli.GetString("piva") <> "" Then
					rsState = 29
					Continue
				End If
				Continue
			Case 29
				rsState = 30
				squery = "select * from FECodiciDocumento where AttivoStessaPIDifferita> 0  order by AttivoStessaPIDifferita desc, documento"
				Continue
			Case 30
				rsState = 31
				'ltipodoc = List
				ltipodoc.Initialize
				'ctmptd = Cursor
				Dim cursorWrapper4 As Cursor
				ctmptd = Main.vSql1.ExecQuery(squery)
				scodicerecalltipodoc = ""
				iposizionerecalltipodoc = 0
				'tmpcrecall = Cursor
				Continue
			Case 31
				rsState = 43
				If vBln5 Then
					If vMap1.IsInitialized Then
						rsState = 33
						Continue
					End If
				End If
				If Not(recall) Then
					Continue
				Else
					rsState = 35
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 33
			Case 33
				rsState = 43
				scodicerecalltipodoc = vMap1.Get("TipoDocumento")
				Continue
			Case 35
				rsState = 36
				tmpk = ""
				Continue
			Case 36
				rsState = 39
				If datarecall.Length < 10 Then
					Continue
				Else
					rsState = 38
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 38
			Case 38
				rsState = 39
				tmpk = Main.v_nnegozio & "_" & Main.v_numcassa & "_" & vStr2 & "_" & datarecall.SubString(6) & "-" & datarecall.SubString2(0, 2) & "-" & datarecall.SubString2(3, 5) & "_" & nfattura
				Continue
			Case 39
				rsState = 42
				If tmpk.Length <= 0 Then
					Continue
				Else
					If Main.vSql2.ExecQuerySingleResult("Select count(*) from FEDatiMov where Chiave ='" & tmpk & "'") <= 0 Then
						Continue
					Else
						rsState = 41
						Continue
					End If
				End If
				'(fallthrough java verso il case successivo)
				rsState = 41
			Case 41
				rsState = 42
				Dim cursorWrapper5 As Cursor
				tmpcrecall = Main.vSql2.ExecQuery("Select * from FEDatiMov where Chiave ='" & tmpk & "'")
				tmpcrecall.Position = 0
				scodicerecalltipodoc = tmpcrecall.GetString("TipoDoc")
				Continue
			Case 42
				rsState = 43
				Continue
			Case 43
				rsState = 44
				icontaaggiunti = 0
				Continue
			Case 44
				rsState = 51
				step46 = 1
				limit46 = ctmptd.RowCount - 1
				xx = 0
				rsState = 159
				Continue
			Case 46
				rsState = 47
				ctmptd.Position = xx
				ltipodoc.Add(ctmptd.GetString("descrizione"))
				Continue
			Case 47
				rsState = 50
				If scodicerecalltipodoc <> ctmptd.GetString("documento") Then
					Continue
				Else
					rsState = 49
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 49
			Case 49
				rsState = 50
				iposizionerecalltipodoc = icontaaggiunti
				scodicerecalltipodoc = ""
				Continue
			Case 50
				rsState = 160
				icontaaggiunti = icontaaggiunti + 1
				Continue
			Case 51
				rsState = 52
				stmpvalidacli = mod1.Sub211(tmpc.GetInt("TipoSoggettoCli"), tmpc.GetString("NomeCli"), tmpc.GetString("CognomeCli"), tmpcli.GetString("piva"), tmpcli.GetString("codf"), tmpc.GetString("NazioneCli"), tmpc.GetString("CodiceDestinatario"), tmpcli.GetString("descrizione"), tmpcli.GetString("provincia"), tmpcli.GetString("via"), tmpcli.GetString("citta"))
				Continue
			Case 52
				rsState = 132
				If stmpvalidacli <> "" Then
					rsState = 54
					Continue
				Else If scodicerecalltipodoc <> "" Then
					rsState = 56
					Continue
				Else If ltipodoc.Size = 0 Then
					rsState = 58
					Continue
				Else
					rsState = 60
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 54
			Case 54
				rsState = 132
				Dim vObjectToCharSequence3 As Object = "ERRORE VALIDAZIONE DATI DEL CLIENTE:" & CRLF & stmpvalidacli
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				Continue
			Case 56
				rsState = 132
				Dim vObjectToCharSequence5 As Object = "Il tipo documento " & SmartStringFormatter("", scodicerecalltipodoc) & " non è disponibile"
				Dim vObjectToCharSequence6 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				Continue
			Case 58
				rsState = 132
				Dim vObjectToCharSequence7 As Object = "Non è disponibile nessun tipo documento per la generazione della fattura"
				Dim vObjectToCharSequence8 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
				Continue
			Case 60
				rsState = 61
				'detailsdialog = CustomLayoutDialog
				stmp = "Dati per l'emissione della fattura"
				Dim customLayoutDialog As CustomLayoutDialog = detailsdialog
				Dim str As String = stmp
				sf = customLayoutDialog.ShowAsync(str, "Ok", "Annulla", "", Main.vBmp1, True)
				detailsdialog.SetSize(PerXToCurrent(60), PerYToCurrent(90))
				Wait For (sf) Dialog_Ready (wf161_0 As Panel)
				rsState = 161
				Continue
			Case 61
				rsState = 66
				If Not(bsplitpayment) Then
					Continue
				Else
					rsState = 63
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 63
			Case 63
				rsState = 66
				pEIva2.Add("Split Payment")
				Continue
			Case 66
				rsState = 67
				pTipoDocumento.AddAll(ltipodoc)
				pTipoDocumento.SelectedIndex = 0
				Continue
			Case 67
				rsState = 72
				If tmpc.GetInt("TipoSoggettoCli") = 0 Then
					rsState = 69
					Continue
				Else
					rsState = 71
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 69
			Case 69
				rsState = 72
				Dim vSize As CSBuilder = vCSBuilder1.Initialize.Size(14).Append("Numero di copie stampa di riepilogo: " & CRLF).Bold.Size(20)
				bNumeroCopie.Text = vSize.Append(Main.v_copiefe2).PopAll
				bNumeroCopie.Tag = Main.v_copiefe2
				Continue
			Case 71
				rsState = 72
				Dim vSize2 As CSBuilder = vCSBuilder1.Initialize.Size(14).Append("Numero di copie stampa di riepilogo: " & CRLF).Bold.Size(20)
				bNumeroCopie.Text = vSize2.Append(Main.v_copiefe).PopAll
				bNumeroCopie.Tag = Main.v_copiefe
				Continue
			Case 72
				rsState = 73
				esigibilitacli = Main.vSql1.ExecQuerySingleResult("select EsigibilitaIVA from FEdatiCli where Codice ='" & scodcli & "'")
				Continue
			Case 73
				rsState = 78
				Dim i As Int = esigibilitacli
				If i <= pEIva2.Size - 1 Then
					rsState = 75
					Continue
				Else
					rsState = 77
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 75
			Case 75
				rsState = 78
				pEIva2.SelectedIndex = esigibilitacli
				Continue
			Case 77
				rsState = 78
				pEIva2.SelectedIndex = 0
				Continue
			Case 78
				rsState = 79
				bNumeroCopie.Visible = bshowcopie
				bAddCopie.Visible = bshowcopie
				bLessCopie.Visible = bshowcopie
				edtCIG.Text = ""
				edtCUP.Text = ""
				edtIDOrdAcq.Text = ""
				tmptf = ""
				Continue
			Case 79
				rsState = 105
				If vBln5 Then
					If vMap1.IsInitialized Then
						rsState = 81
						Continue
					End If
				End If
				If recall Then
					rsState = 83
					Continue
				Else If scodcli <> "" Then
					rsState = 100
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 81
			Case 81
				rsState = 105
				edtImportoBollo.Text = vMap1.Get("ImportoBollo")
				pEIva2.SelectedIndex = vMap1.Get("EsigibilitaIVA")
				edtMemo.Text = vMap1.Get("Memo")
				edtCIG.Text = vMap1.Get("CIG")
				edtCUP.Text = vMap1.Get("CUP")
				edtIDOrdAcq.Text = vMap1.Get("IDOrdAcq")
				bNumeroCopie.Tag = vMap1.Get("Copie")
				Dim vSize3 As CSBuilder = vCSBuilder1.Initialize.Size(14).Append("Numero di copie stampa di riepilogo: " & CRLF).Bold.Size(20)
				bNumeroCopie.Text = vSize3.Append(bNumeroCopie.Tag).PopAll
				edtMailFE.Text = vMap1.Get("Mail")
				pTipoDocumento.SelectedIndex = iposizionerecalltipodoc
				Continue
			Case 83
				rsState = 84
				Continue
			Case 84
				rsState = 95
				If tmpcrecall.IsInitialized And tmpcrecall.RowCount > 0 Then
					rsState = 86
					Continue
				End If
				Continue
			Case 86
				rsState = 87
				tmpcrecall.Position = 0
				edtImportoBollo.Text = tmpcrecall.GetString("ImportoBollo")
				edtIDOrdAcq.Text = tmpcrecall.GetString("IDOrdAcq")
				edtCUP.Text = tmpcrecall.GetString("CUP")
				edtCIG.Text = tmpcrecall.GetString("CIG")
				Continue
			Case 87
				rsState = 94
				If tmpcrecall.GetString("EsigibilitaIVA") = "I" Then
					rsState = 89
					Continue
				Else If tmpcrecall.GetString("EsigibilitaIVA") = "D" Then
					rsState = 91
					Continue
				Else If tmpcrecall.GetString("EsigibilitaIVA") <> "S" Then
					Continue
				Else
					rsState = 93
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 89
			Case 89
				rsState = 94
				pEIva2.SelectedIndex = 0
				Continue
			Case 91
				rsState = 94
				pEIva2.SelectedIndex = 1
				Continue
			Case 93
				rsState = 94
				pEIva2.SelectedIndex = 2
				Continue
			Case 94
				rsState = 95
				pTipoDocumento.SelectedIndex = iposizionerecalltipodoc
				Continue
			Case 95
				rsState = 98
				If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='F_" & nfattura & "'") <= 0 Then
					Continue
				Else
					rsState = 97
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 97
			Case 97
				rsState = 98
				tmptf = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='F_" & nfattura & "'")
				Continue
			Case 98
				rsState = 105
				Continue
			Case 100
				rsState = 101
				Continue
			Case 101
				rsState = 104
				If Main.vSql1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" & scodcli & "'") <= 0 Then
					Continue
				Else
					rsState = 103
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 103
			Case 103
				rsState = 104
				tmptf = Main.vSql1.ExecQuerySingleResult("select testo from TestiCli where codice='" & scodcli & "'")
				Continue
			Case 104
				rsState = 105
				Continue
			Case 105
				rsState = 108
				If tmptf <> "" Then
					Continue
				Else
					If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'") <= 0 Then
						Continue
					Else
						rsState = 107
						Continue
					End If
				End If
				'(fallthrough java verso il case successivo)
				rsState = 107
			Case 107
				rsState = 108
				tmptf = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'")
				Continue
			Case 108
				rsState = 117
				If vBln5 Then
					Continue
				Else
					rsState = 110
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 110
			Case 110
				rsState = 111
				edtMemo.Text = tmptf
				Continue
			Case 111
				rsState = 116
				If recall Then
					rsState = 113
					Continue
				Else
					rsState = 115
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 113
			Case 113
				rsState = 116
				edtMailFE.Text = ""
				edtMailFE.Enabled = False
				Continue
			Case 115
				rsState = 116
				edtMailFE.Text = tmpcli.GetString("mail")
				Continue
			Case 116
				rsState = 117
				Continue
			Case 117
				rsState = 118
				vBln5 = False
				Wait For (sf) Dialog_Result (wf162_0 As Int)
				rsState = 162
				Continue
			Case 118
				rsState = 131
				Dim i2 As Int = res
				If i2 <> -1 Then
					Continue
				Else
					rsState = 120
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 120
			Case 120
				rsState = 121
				Continue
			Case 121
				rsState = 124
				If edtCIG.Text = "" Then
					If edtCUP.Text = "" Then
						Continue
					End If
				End If
				If edtIDOrdAcq.Text <> "" Then
					Continue
				Else
					rsState = 123
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 123
			Case 123
				rsState = 124
				Dim vObjectToCharSequence9 As Object = "Indicando un CIG o CUP è obbligatorio inserire un Codice Ordine di Acquisto"
				Dim vObjectToCharSequence10 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
				vBln5 = True
				Continue
			Case 124
				rsState = 125
				mapdatife.Initialize
				Dim map As Map = mapdatife
				map.Put("ImportoBollo", edtImportoBollo.Text)
				Dim map2 As Map = mapdatife
				map2.Put("EsigibilitaIVA", pEIva2.SelectedIndex)
				Dim map3 As Map = mapdatife
				map3.Put("Memo", modfunstr.left(edtMemo.Text.Replace("'", "`").Replace("%", "").Replace("[", "").Replace("#", "").Replace(",", "").Replace(CRLF, " "), 1000))
				Dim map4 As Map = mapdatife
				map4.Put("CIG", edtCIG.Text)
				Dim map5 As Map = mapdatife
				map5.Put("CUP", edtCUP.Text)
				Dim map6 As Map = mapdatife
				map6.Put("IDOrdAcq", edtIDOrdAcq.Text)
				Dim map7 As Map = mapdatife
				map7.Put("IDOrdAcq", edtIDOrdAcq.Text)
				Dim map8 As Map = mapdatife
				map8.Put("TipoDocumento", pTipoDocumento.SelectedItem.SubString2(0, 4))
				Continue
			Case 125
				rsState = 130
				If recall Then
					rsState = 127
					Continue
				Else
					rsState = 129
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 127
			Case 127
				rsState = 130
				Dim map9 As Map = mapdatife
				map9.Put("Totale", vDbl1)
				Continue
			Case 129
				rsState = 130
				Dim map10 As Map = mapdatife
				map10.Put("Totale", vCur1.GetDouble("totale"))
				Continue
			Case 130
				rsState = 131
				Dim map11 As Map = mapdatife
				map11.Put("Copie", bNumeroCopie.Tag)
				Dim map12 As Map = mapdatife
				map12.Put("Mail", edtMailFE.Text)
				Continue
			Case 131
				rsState = 132
				Continue
			Case 132
				rsState = 137
				If Not(ctmptd.IsInitialized) Then
					Continue
				Else
					rsState = 134
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 134
			Case 134
				rsState = 137
				ctmptd.Close
				Continue
			Case 137
				rsState = 138
				Continue
			Case 138
				rsState = 143
				If Not(tmpcrecall.IsInitialized) Then
					Continue
				Else
					rsState = 140
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 140
			Case 140
				rsState = 143
				tmpcrecall.Close
				Continue
			Case 143
				rsState = 144
				Continue
			Case 144
				rsState = 149
				If Not(tmpc.IsInitialized) Then
					Continue
				Else
					rsState = 146
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 146
			Case 146
				rsState = 149
				tmpc.Close
				Continue
			Case 149
				rsState = 150
				Continue
			Case 150
				rsState = 155
				If Not(tmpcli.IsInitialized) Then
					Continue
				Else
					rsState = 152
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 152
			Case 152
				rsState = 155
				tmpcli.Close
				Continue
			Case 155
				rsState = 156
				Continue
			Case 156
				rsState = -1
				Return mapdatife
			Case 157
				rsState = 25
				If (step8 > 0 And x <= limit8) Or (step8 < 0 And x >= limit8) Then
					rsState = 15
					Continue
				End If
				Continue
			Case 158
				rsState = 157
				x = x + 0 + step8
				Continue
			Case 159
				rsState = 51
				If (step46 > 0 And xx <= limit46) Or (step46 < 0 And xx >= limit46) Then
					rsState = 46
					Continue
				End If
				Continue
			Case 160
				rsState = 159
				xx = xx + 0 + step46
				Continue
			Case 161
				rsState = 61
				pnl = wf161_0
				pnl.LoadLayout("schedaFatturaE")
				mod1.Sub081
				edtImportoBollo.Text = ""
				pEIva2.Add("Immediata")
				pEIva2.Add("Differita")
				Continue
			Case 162
				rsState = 118
				res = wf162_0
				Continue
		End Select
	Loop
End Sub

Sub Dialog_Ready(panelWrapper As Panel)
End Sub

Sub Dialog_Result(i As Int)
End Sub

Sub Viewart_Click
	mod1.vStr2 = "  Sub ViewArt_Click"
	Try
		vCur4.Position = vcustomlistviewold2.Sub007(Sender)
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql2.ExecQuery("Select descrizione,importo from venduto where nmov = " & vCur4.GetString("nmov"))
		If cursorWrapper2.RowCount > 0 Then
			Dim list As List
			list.Initialize
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				list.Add(cursorWrapper2.GetString("descrizione") & "    € " & NumberFormat2(cursorWrapper2.GetDouble("importo"), 1, 2, 2, False))
			Next
			idLib.InputList1(list, "Elenco articoli del movimento " & vCur4.GetString("nmov"))
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub visibilitychanged_event(str As String, objArr As Object()) As Object
	mod1.Sub081
	Return Null
End Sub

Sub onCreate
	Try
		If File.Exists(getFilesDir, "theme.txt") Then
			Main.theme_value = File.ReadString(getFilesDir, "theme.txt")
		End If
		If Main.theme_value <> 0 Then
			setTheme(Main.theme_value)
		End If
	Catch
		'### throw NEW:RuntimeException
	End Try
End Sub

