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
	Public vInt1 As Int
	Public v7 As Timer
	Public vBln1 As Boolean
	Public vStr1 As String
	Public vStr2 As String
	Public vInt2 As Int
	Public vInt3 As Int
	Public vBln2 As Boolean
	Public vStr3 As String
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public bData As Button
	Public Chiudi As Button
	Public vcustomlistviewold1 As customlistviewold
	Public vCur1 As Cursor
	Public vDateDialog1 As DateDialog
	Public vLst1 As List
	Public a1 As Animation
	Public vLbl1 As Label
	Public vLbl2 As Label
	Public TipoVis As Spinner
	Public vCur2 As Cursor
	Public lblTotale As Label
	Public Sala As Spinner
	Public Ordinamento As Spinner
	Public lblTitolo As Label
End Sub

Sub ac_itemclicked(menuItemWrapper As MenuItem)
	mod1.vStr2 = "  Sub AC_Click (Position As Int, ActionItemID As Int)"
	Try
		If vLst1.Get(menuItemWrapper.Id) <> "Chiudi Menu" Then
			vStr2 = vLst1.Get(menuItemWrapper.Id)
			v7.Initialize("Timer1", 500)
			v7.Enabled = True
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Activity_Create(z As Boolean)
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			If Main.vInt9 >= 19 Then
				Dim javaObject As JavaObject = Activity
				javaObject.RunMethod("setOnSystemUiVisibilityChangeListener", Array(javaObject.CreateEvent("android.view.View.OnSystemUiVisibilityChangeListener", "VisibilityChanged", Null)))
				Activity.Width = -1
				Activity.Height = -1
				mod1.Sub081
			End If
			mod1.Sub175
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Activity_KeyPress(i As Int) As Boolean
	If i <> 4 Then
		Return False
	End If
	ToastMessageShow("Non Consentito", False)
	Return True
End Sub

Sub Activity_Pause(z As Boolean)
	If Not(vBln1) Then
		mod1.vStr1 = ""
		mod1.vBln4 = True
		mod1.Sub220(False)
		mod1.vBln1 = True
		Activity.Finish
		ExitApplication
		Return
	End If
End Sub

Sub Activity_Resume
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			Try
				Sub003("Prenota")
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
				Dim concreteViewWrapper As View = bData
				mod1.Sub176(concreteViewWrapper, 1, 2, 2, -16777216)
				Dim concreteViewWrapper2 As View = Chiudi
				mod1.Sub176(concreteViewWrapper2, 1, 2, 2, -7829368)
				TipoVis.Clear
				TipoVis.Add("Visualizza tutti i Tavoli")
				TipoVis.Add("Visualizza solo i tavoli prenotati")
				TipoVis.Add("Visualizza solo i tavoli non prenotati")
				TipoVis.SelectedIndex = 0
				Ordinamento.Clear
				Ordinamento.Add("Ordinamento:Numero Tavolo")
				Ordinamento.Add("Ordinamento:Ora di arrivo")
				Ordinamento.Add("Ordinamento:Numero Coperti")
				Ordinamento.SelectedIndex = 0
				populatespinner(Sala)
				vLst1.Initialize
				vDateDialog1.Year = DateTime.GetYear(mod1.Sub058)
				vDateDialog1.Month = DateTime.GetMonth(mod1.Sub058)
				vDateDialog1.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
				bData.Text = "Data Attiva: " & vDateDialog1.DayOfMonth & "/" & vDateDialog1.Month & "/" & vDateDialog1.Year
				bData.Background = mod1.Sub155(-8524146, 25)
				DoEvents
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				vcustomlistviewold1.Initialize(Me, "clv2")
				vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
				Activity.AddView(vcustomlistviewold1.Sub003, 0, DipToCurrent(190), Activity.Width, Activity.Height - DipToCurrent(210))
				lblTitolo.Text = "Gestione Prenotazioni"
				mod1.vStr2 = "Activity_Resume"
				vBln1 = False
				ricerca()
				If vInt1 > 0 Then
					vStr2 = "Inserisci"
					v7.Initialize("Timer1", 500)
					v7.Enabled = True
					vInt1 = 0
				End If
				DoEvents
				mod1.Sub081
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub bData_Click
	vDateDialog1.Show("Indicare il giorno della prenotazione", "Giorno", "Ok", "", "", Main.vBmp1)
	bData.Text = "Data Attiva: " & vDateDialog1.DayOfMonth & "/" & vDateDialog1.Month & "/" & vDateDialog1.Year
	ricerca()
End Sub

Sub bStampa_Click
	Dim i As Int
	Dim i2 As Int
	mod1.vStr2 = "Sub bstampa_Click"
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from tavoli order by tavolo")
		If cursorWrapper2.RowCount > 0 Then
			Main.vccefdll1.nf_apri(Main.v_intestanf)
			Main.vccefdll1.nf_testo(lblTitolo.Text, 4)
			Main.vccefdll1.nf_testo(Main.vStr19, 1)
			Main.vccefdll1.nf_testo(bData.Text, 1)
			Main.vccefdll1.nf_testo(Main.vStr19, 1)
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i3 As Int = 0
			Dim i4 As Int = 0
			Dim i5 As Int = 0
			Do While i3 <= rowCount
				cursorWrapper2.Position = i3
				Dim vTmp As String = mod1.Sub107(cursorWrapper2.GetString("tavolo"))
				If Not(vTmp = Null) Then
					If vTmp.ToLowerCase <> "tavolo " & cursorWrapper2.GetString("tavolo") Then
						If Main.v_attivanumtavolo Then
							vTmp = vTmp & " (" & cursorWrapper2.GetString("tavolo") & ")"
						End If
					End If
					Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select pagina from pagine where pagina >=10  AND pagina <100 AND valore = " & cursorWrapper2.GetString("tavolo") & " AND tipo = 9 limit 1")
					Dim str As String = vTmp & " (" & Main.vSql1.ExecQuerySingleResult("select descrizione from despagine where codice = " & vExecQuerySingleResult) & ")"
					Dim str2 As String = IIf(cursorWrapper2.GetInt("sedie") > 0, str & CRLF & cursorWrapper2.GetString("sedie") & " Sedie", str)
					Dim cursorWrapper3 As Cursor
					Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from Prenota where tavolo = " & cursorWrapper2.GetString("tavolo") & " and  " & vStr1 & " order by data")
					If cursorWrapper4.RowCount > 0 Then
						Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
						Dim i6 As Int = 0
						Do While i6 <= rowCount2
							cursorWrapper4.Position = i6
							Main.vccefdll1.nf_testo(str2, 1)
							Main.vccefdll1.nf_testo("Orario: " & cursorWrapper4.GetString("data").SubString2(10, 16), 1)
							Main.vccefdll1.nf_testo("Coperti: " & cursorWrapper4.GetString("sedie"), 1)
							Main.vccefdll1.nf_testo(cursorWrapper4.GetString("memo"), 1)
							Main.vccefdll1.nf_testo(Main.vStr19, 1)
							i6 = i6 + 1
							i4 = cursorWrapper4.GetInt("sedie") + i4
							i5 = i5 + 1
						Loop
					End If
					i = i4
					i2 = i5
					cursorWrapper4.Close
				Else
					i = i4
					i2 = i5
				End If
				If i3 Mod 10 = 0 Then
					DoEvents
				End If
				i3 = i3 + 1
				i5 = i2
				i4 = i
			Loop
			Main.vccefdll1.nf_testo(Main.vStr19, 1)
			Main.vccefdll1.nf_testo("Tavoli Prenotati:" & i5, 1)
			Main.vccefdll1.nf_testo("Totale Coperti:" & i4, 1)
			Main.vccefdll1.nf_testo(" ", 10)
			Main.vccefdll1.nf_chiudi
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Buttonfun_Click
	Dim popupMenuWrapper As PopupMenu
	mod1.vStr2 = "  Sub buttonFun_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim imageViewWrapper As ImageView = getpanel.GetView(2)
		vLbl1 = getpanel.GetView(0)
		vLbl2 = getpanel.GetView(1)
		vCur1.Position = getpanel.GetView(3).Text
		vLst1.Clear
		vLst1.Add("Modifica")
		vLst1.Add("Elimina")
		vLst1.Add("Inserisci")
		vLst1.Add("Sedie")
		vLst1.Add("Esci")
		If vLst1.Size <= 1 Then
			popupMenuWrapper = Null
		Else
			Dim popupMenuWrapper2 As PopupMenu
			popupMenuWrapper2.Initialize("AC", imageViewWrapper)
			Dim size As Int = vLst1.Size - 1
			Dim i As Int
			For i = 0 To size
				Dim bitmapDrawable As BitmapDrawable
				Dim str As String = ""
				Select vLst1.Get(i)
					Case "Modifica"
						If vLbl1.Tag = "" Then
						Else
							str = "fun_pencil-red.png"
							Dim vObjectToString As String = vLst1.Get(i)
							bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
							popupMenuWrapper2.AddMenuItem(i, vObjectToString, bitmapDrawable)
						End If
					Case "Elimina"
						If vLbl1.Tag = "" Then
						Else
							str = "006.png"
							Dim vObjectToString2 As String = vLst1.Get(i)
							bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
							popupMenuWrapper2.AddMenuItem(i, vObjectToString2, bitmapDrawable)
						End If
					Case "Inserisci"
						str = "012.png"
						Dim vObjectToString22 As String = vLst1.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString22, bitmapDrawable)
					Case "Sedie"
						str = "fun_coperto.png"
						Dim vObjectToString222 As String = vLst1.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString222, bitmapDrawable)
					Case "Esci"
						str = "014.png"
						Dim vObjectToString2222 As String = vLst1.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString2222, bitmapDrawable)
					Case Else
						Dim vObjectToString22222 As String = vLst1.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString22222, bitmapDrawable)
				End Select
			Next
			popupMenuWrapper = popupMenuWrapper2
		End If
		Sub006(imageViewWrapper)
		popupMenuWrapper.Show
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub001
	vInt3 = Main.vSql1.ExecQuerySingleResult("select case when sum(sedie) is null then 0 else sum(sedie) end from Prenota where " & vStr1)
	vInt2 = Main.vSql1.ExecQuerySingleResult("select count(*) from Prenota where " & vStr1)
End Sub

Sub Chiudi_Click
	vBln1 = True
	Main.vBln37 = True
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub Sub002(str As String, str2 As String, i As Int) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Background = mod1.Sub155(Colors.RGB(245, 245, 245), 0)
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("buttonFun")
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from Prenota where tavolo = " & vCur1.GetString("tavolo") & " and  " & vStr1 & " order by data")
		If cursorWrapper2.RowCount > 0 Then
			cursorWrapper2.Position = 0
		End If
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.Gravity = Bit.Or(16, 3)
		labelWrapper.Text = str2
		labelWrapper.TextSize = 20
		labelWrapper.TextColor = -16777216
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		If cursorWrapper2.RowCount = 0 Then
			labelWrapper.Background = mod1.Sub155(-1, 0)
			labelWrapper.Tag = ""
		Else
			labelWrapper.Background = mod1.Sub155(-3355444, 0)
			labelWrapper.Tag = "1"
		End If
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.TextSize = 20
		labelWrapper2.TextColor = -16777216
		If cursorWrapper2.RowCount = 0 Then
			labelWrapper2.Background = mod1.Sub155(-1, 0)
			labelWrapper2.Text = "NON PRENOTATO"
		Else
			labelWrapper2.Background = mod1.Sub155(-3355444, 0)
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim str3 As String = ""
			Dim i2 As Int
			For i2 = 0 To rowCount
				cursorWrapper2.Position = i2
				Dim str4 As String = ""
				If cursorWrapper2.GetInt("sedie") > 0 Then
					str4 = cursorWrapper2.GetInt("sedie") & " Coperti ---- "
				End If
				str3 = str3 & "Orario: " & cursorWrapper2.GetString("data").SubString2(10, 16) & " ---- " & str4 & cursorWrapper2.GetString("memo") & CRLF
			Next
			labelWrapper2.Text = str3
		End If
		If vCur1.GetInt("tavolo") = vInt1 Then
			vLbl1 = labelWrapper
			vLbl2 = labelWrapper2
		End If
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "030.png")
		cursorWrapper2.Close
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("")
		labelWrapper3.Text = str
		labelWrapper3.Visible = False
		Dim concreteViewWrapper As View = labelWrapper
		mod1.Sub176(concreteViewWrapper, 1, 2, 2, -16777216)
		Dim concreteViewWrapper2 As View = labelWrapper2
		mod1.Sub176(concreteViewWrapper2, 1, 2, 2, -16777216)
		panelWrapper.AddView(labelWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(34), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(36), DipToCurrent(2), PerXToCurrent(51), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i)
		panelWrapper.AddView(labelWrapper3, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub003(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub Ordinamento_ItemClick(i As Int, obj As Object)
	ricerca()
End Sub

Sub populatespinner(spinnerWrapper As Spinner)
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		spinnerWrapper.Clear
		spinnerWrapper.Add("Tutte le Sale")
		Dim cursorWrapper As Cursor
		vCur2 = Main.vSql1.ExecQuery("select * from Despagine where codice >=10 and ((select count(*) from pagine where valore = Despagine.codice and tipo  = " & Main.t_pagina & ")>0 or (select count(*) from Toolbar where valore = Despagine.codice and tipo  = " & Main.t_pagina & ")>0)")
		Dim rowCount As Int = vCur2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			vCur2.Position = i
			spinnerWrapper.Add(vCur2.GetString("descrizione"))
		Next
		spinnerWrapper.SelectedIndex = 0
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/prenotazioni.java, metodo _ricerca (riga 1024).
Sub ricerca
	Dim i As Int
	Dim vTmp As String
	mod1.vStr2 = "Sub Init"
	Try
		ProgressDialogShow2("Attendere ...", False)
		Sub004()
		Dim str As String = " order by tavolo"
		Select Ordinamento.SelectedIndex
			Case 0
				str = " order by tavolo"
			Case 1
				str = " order by case when (select data from Prenota where tavolo = tavoli.tavolo and   " & vStr1 & ") is null then '9' else   (select data from Prenota where tavolo = tavoli.tavolo and   " & vStr1 & ") end "
			Case 2
				str = " order by (select sedie from Prenota where tavolo = tavoli.tavolo and   " & vStr1 & ") desc"
		End Select
		If vInt1 > 0 Then
			vStr3 = "Select * from tavoli where tavolo = " & vInt1
		Else If Sala.SelectedIndex = 0 Then
			vStr3 = "Select * from tavoli " & str
		Else
			vCur2.Position = Sala.SelectedIndex - 1
			vStr3 = "Select * from tavoli where (select count(*) from pagine where pagina= " & vCur2.GetString("codice") & " and tipo =" & Main.t_tavolo & " and valore =tavoli.tavolo)>0 " & str
		End If
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery(vStr3)
		vcustomlistviewold1.Sub004
		vInt2 = 0
		vInt3 = 0
		If vCur1.RowCount > 0 Then
			Dim rowCount As Int = vCur1.RowCount - 1
			Do While i <= rowCount
				vCur1.Position = i
				If TipoVis.SelectedIndex = 1 Then
					i = IIf(Main.vSql1.ExecQuerySingleResult("Select count(*) from Prenota where tavolo = " & vCur1.GetString("tavolo") & " and  " & vStr1) = 0, i + 1, 0)
					vTmp = mod1.Sub107(vCur1.GetString("tavolo"))
					If Not(vTmp = Null) Then
						If vTmp.ToLowerCase <> "tavolo " & vCur1.GetString("tavolo") Then
							If Main.v_attivanumtavolo Then
								vTmp = vTmp & " (" & vCur1.GetString("tavolo") & ")"
							End If
						End If
						If Not(Main.vSql1.ExecQuerySingleResult("select count(*) from pagine where pagina >=10  AND pagina <100 AND valore = " & vCur1.GetString("tavolo") & " AND tipo = 9 ") = 0) Then
							Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select pagina from pagine where pagina >=10  AND pagina <100 AND valore = " & vCur1.GetString("tavolo") & " AND tipo = 9 limit 1")
							Dim str2 As String = vTmp & " (" & Main.vSql1.ExecQuerySingleResult("select descrizione from despagine where codice = " & vExecQuerySingleResult) & ")"
							If vCur1.GetInt("sedie") > 0 Then
								str2 = str2 & CRLF & vCur1.GetString("sedie") & " Sedie"
							End If
							vcustomlistviewold1.Sub001(Sub002(i, str2, DipToCurrent(70)), DipToCurrent(70), str2)
						End If
					End If
					If i Mod 10 <> 0 Then
						DoEvents
					End If
				Else
					If TipoVis.SelectedIndex = 2 Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from Prenota where tavolo = " & vCur1.GetString("tavolo") & " and  " & vStr1) > 0 Then
						End If
					End If
					vTmp = mod1.Sub107(vCur1.GetString("tavolo"))
					If Not(vTmp = Null) Then
					End If
					If i Mod 10 <> 0 Then
					End If
				End If
			Loop
			vcustomlistviewold1.Sub012(0)
		End If
		Sub001()
		ProgressDialogHide
		Sub005()
	Catch
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
	End Try
	ProgressDialogHide
End Sub

Sub Sala_ItemClick(i As Int, obj As Object)
	ricerca()
End Sub

Sub Sub004
	Dim setdate As Long = DateUtils.setdate(vDateDialog1.Year, vDateDialog1.Month, vDateDialog1.DayOfMonth)
	vBln2 = DateUtils.issameday(mod1.Sub058, setdate)
	Dim periodVar As Period
	periodVar.Days = 1
	Dim addperiod As Long = DateUtils.addperiod(setdate, periodVar)
	vStr1 = " data > '" & vDateDialog1.Year & "-" & NumberFormat2(vDateDialog1.Month, 2, 0, 0, False) & "-" & NumberFormat2(vDateDialog1.DayOfMonth, 2, 0, 0, False) & " 00:00:00" & "' and data < '" & NumberFormat2(DateTime.GetYear(addperiod), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetMonth(addperiod), 2, 0, 0, False) & "-" & NumberFormat2(DateTime.GetDayOfMonth(addperiod), 2, 0, 0, False) & " 00:00:00" & "'"
End Sub

Sub Sub005
	Sub001()
	lblTotale.Text = "Tavoli Prenotati: " & vInt2 & CRLF & "Totale Coperti: " & vInt3
End Sub

Sub Sub006(concreteViewWrapper As View)
	a1.InitializeRotateCenter("", 0, 180, concreteViewWrapper)
	a1.Duration = 1000
	a1.RepeatCount = 1
	Dim animationWrapper2 As Animation = a1
	a1.RepeatMode = 2
	a1.Start(concreteViewWrapper)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/prenotazioni.java, metodo _timer1_tick (riga 1191).
Sub Timer1_Tick
	Dim c As Char
	Dim cursorWrapper As Cursor
	Dim str As String
	Dim str2 As String
	Dim str3 As String
	Dim i As Int = 0
	mod1.vStr2 = "Sub Timer1_Tick"
	Try
		v7.Enabled = False
		Dim inputDialog As InputDialog
		Dim numberDialog As NumberDialog
		Select vStr2
			Case "Modifica"
				c = 0
			Case "Elimina"
				c = 1
			Case "Inserisci"
				c = 2
			Case "Sedie"
				c = 3
			Case "Esci"
				c = 4
			Case Else
				c = 0
		End Select
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from Prenota where tavolo = " & vCur1.GetString("tavolo") & " and  " & vStr1 & " order by data")
		If cursorWrapper3.RowCount > 0 Then
			cursorWrapper3.Position = 0
		End If
		If c <> 0 And c <> 2 Then
			str = ""
		Else
			If c = 0 And cursorWrapper3.RowCount > 1 Then
				Dim list As List
				list.Initialize
				If cursorWrapper3.GetInt("sedie") <= 0 Then
					str2 = ""
				Else
					str2 = cursorWrapper3.GetInt("sedie") & " Coperti ---- "
				End If
				Dim rowCount As Int = cursorWrapper3.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount
					cursorWrapper3.Position = i2
					list.Add("Orario: " & cursorWrapper3.GetString("data").SubString2(10, 16) & " ---- " & str2 & cursorWrapper3.GetString("memo"))
				Next
				Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare la prenotazione da modificare")
				If vInputList1 < 0 Then
					Return
				End If
				cursorWrapper3.Position = vInputList1
			End If
			Dim vGetHour As Int = DateTime.GetHour(mod1.Sub058)
			Dim str4 As String = NumberFormat(vGetHour, 2, 0) & ":" & NumberFormat(DateTime.GetMinute(mod1.Sub058), 2, 0)
			If vBln2 Then
				Dim cursorWrapper4 As Cursor
				cursorWrapper = Main.vSql1.ExecQuery("select * from oraasporto where descrizione >'" & str4 & "' order by descrizione")
			Else
				Dim cursorWrapper5 As Cursor
				cursorWrapper = Main.vSql1.ExecQuery("select * from oraasporto order by descrizione")
			End If
			If cursorWrapper.RowCount > 0 Then
				Dim list2 As List
				list2.Initialize
				Dim cSBuilder As CSBuilder
				Dim rowCount2 As Int = cursorWrapper.RowCount - 1
				Dim i3 As Int
				For i3 = 0 To rowCount2
					cursorWrapper.Position = i3
					cSBuilder.Initialize.Size(18).Bold.Append("  " & cursorWrapper.GetString("descrizione"))
					Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select count(*) FROM Prenota  where " & vStr1 & " AND substr(data,12,5) ='" & cursorWrapper.GetString("descrizione") & "'")
					If parseDouble > 0 Then
						Dim parseDouble2 As Int = Main.vSql1.ExecQuerySingleResult("Select sum(sedie) FROM Prenota  where " & vStr1 & " AND substr(data,12,5) ='" & cursorWrapper.GetString("descrizione") & "'")
						Dim vSize As CSBuilder = cSBuilder.PopAll.Size(16)
						vSize.Color(-65536).Append(CRLF).Append("   Prenotati: " & parseDouble & " tavoli con " & parseDouble2 & "  coperti")
					End If
					list2.Add(cSBuilder.PopAll)
				Next
				Dim vInputList12 As Int = idLib.InputList1(list2, "Selezionare l'orario della prenotazione")
				If vInputList12 >= 0 Then
					cursorWrapper.Position = vInputList12
					Dim vGetString As String = cursorWrapper.GetString("descrizione")
					If Main.vSql1.ExecQuerySingleResult("Select count(*) FROM Prenota  where " & vStr1 & " AND substr(data,12,5) ='" & vGetString & "' and tavolo = " & vCur1.GetString("tavolo")) > 0 Then
						Dim vObjectToCharSequence As Object = "Attenzione... esiste già una prenotazione per il tavolo " & vCur1.GetString("tavolo") & " alle ore " & vGetString
						Dim vObjectToCharSequence2 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					Dim vGetInt As Int = IIf(c <> 0 Or cursorWrapper3.RowCount <= 1, 0, cursorWrapper3.GetInt("sedie"))
					numberDialog.Digits = 2
					numberDialog.Number = vGetInt
					numberDialog.Decimal = 0
					numberDialog.ShowSign = False
					Dim vShow As Int = numberDialog.Show("Inserire il numero di coperti per la prenotazione", "Ok", "Annulla", "", Main.vBmp1)
					If vShow = -1 Then
						If numberDialog.Number > 0 Then
							If vGetInt > 0 And numberDialog.Number > vGetInt Then
								Dim vObjectToCharSequence3 As Object = "Attenzione... il numero di coperti richiesto è maggiore del numero di sedie del tavolo ...Si desidera proseguire ? "
								Dim vObjectToCharSequence4 As Object = Main.vStr8
								Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
								If vMsgbox2 = -2 Then
									mod1.Sub081
									Return
								End If
							End If
							cursorWrapper.Close
							inputDialog.InputType = 1
							inputDialog.Input = ""
							If c = 0 Then
								inputDialog.Input = cursorWrapper3.GetString("memo")
							End If
							inputDialog.Hint = "Descrizione Prenotazione"
							inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
							inputDialog.PasswordMode = False
							Dim vShow2 As Int = inputDialog.Show("Inserire i dettagli della prenotazione ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
							If vShow2 <> -1 Then
								mod1.Sub081
								Return
							End If
							inputDialog.Input = modfunstr.left(inputDialog.Input, 190)
							str = vGetString
						Else
							mod1.Sub081
							Return
						End If
					Else
						mod1.Sub081
						Return
					End If
				Else
					mod1.Sub081
					Return
				End If
			Else
				mod1.Sub081
				Return
			End If
		End If
		Select c
			Case 0, 2
				If c = 0 And cursorWrapper3.RowCount > 0 Then
					Main.vSql1.ExecNonQuery("Delete from Prenota where chiave=" & cursorWrapper3.GetString("chiave"))
				End If
				Dim list3 As List
				list3.Initialize
				Dim map As Map
				map.Initialize
				map.Put("data", NumberFormat2(vDateDialog1.Year, 2, 0, 0, False) & "-" & NumberFormat2(vDateDialog1.Month, 2, 0, 0, False) & "-" & NumberFormat2(vDateDialog1.DayOfMonth, 2, 0, 0, False) & " " & str & ":00")
				map.Put("tavolo", vCur1.GetInt("tavolo"))
				map.Put("sedie", numberDialog.Number)
				map.Put("memo", inputDialog.Input)
				list3.Add(map)
				dbutil.Sub007(Main.vSql1, "Prenota", list3)
				Dim cursorWrapper6 As Cursor
				Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("Select * from Prenota where tavolo = " & vCur1.GetString("tavolo") & " and  " & vStr1 & " order by data")
				If cursorWrapper7.RowCount > 0 Then
					vLbl2.Background = mod1.Sub155(Colors.RGB(255, 110, 33), 0)
					Dim rowCount3 As Int = cursorWrapper7.RowCount - 1
					Dim str6 As String = ""
					Do While i <= rowCount3
						cursorWrapper7.Position = i
						Dim str7 As String = ""
						If cursorWrapper7.GetInt("sedie") > 0 Then
							str7 = cursorWrapper7.GetInt("sedie") & " Coperti ---- "
						End If
						i = i + 1
						str6 = str6 & "Orario: " & cursorWrapper7.GetString("data").SubString2(10, 16) & " ---- " & str7 & cursorWrapper7.GetString("memo") & CRLF
					Loop
					vLbl2.Text = str6
				End If
				vLbl1.Background = mod1.Sub155(Colors.RGB(255, 110, 33), 0)
				vLbl1.Tag = "1"
				cursorWrapper3 = cursorWrapper7
				cursorWrapper3.Close
				Sub005()
				mod1.Sub081
			Case 1
				If cursorWrapper3.RowCount > 1 Then
					Dim list4 As List
					list4.Initialize
					If cursorWrapper3.GetInt("sedie") <= 0 Then
						str3 = ""
					Else
						str3 = cursorWrapper3.GetInt("sedie") & " Coperti ---- "
					End If
					Dim rowCount4 As Int = cursorWrapper3.RowCount - 1
					Dim i4 As Int
					For i4 = 0 To rowCount4
						cursorWrapper3.Position = i4
						list4.Add("Orario: " & cursorWrapper3.GetString("data").SubString2(10, 16) & " ---- " & str3 & cursorWrapper3.GetString("memo"))
					Next
					Dim vInputList13 As Int = idLib.InputList1(list4, "Selezionare la prenotazione da eliminare")
					If vInputList13 < 0 Then
					Else
						cursorWrapper3.Position = vInputList13
					End If
				Else If cursorWrapper3.RowCount <> 1 Then
				Else
					cursorWrapper3.Position = 0
				End If
				Main.vSql1.ExecNonQuery("Delete from Prenota where chiave = " & cursorWrapper3.GetString("chiave"))
				Dim cursorWrapper8 As Cursor
				Dim cursorWrapper9 As Cursor = Main.vSql1.ExecQuery("Select * from Prenota where tavolo = " & vCur1.GetString("tavolo") & " and  " & vStr1)
				If cursorWrapper9.RowCount > 0 Then
					vLbl2.Background = mod1.Sub155(Colors.RGB(255, 110, 33), 0)
					Dim rowCount5 As Int = cursorWrapper9.RowCount - 1
					Dim str8 As String = ""
					Dim i5 As Int = 0
					Do While i5 <= rowCount5
						cursorWrapper9.Position = i5
						Dim str9 As String = ""
						If cursorWrapper9.GetInt("sedie") > 0 Then
							str9 = cursorWrapper9.GetInt("sedie") & " Coperti ---- "
						End If
						i5 = i5 + 1
						str8 = str8 & "Orario: " & cursorWrapper9.GetString("data").SubString2(10, 16) & " ---- " & str9 & cursorWrapper9.GetString("memo") & CRLF
					Loop
					vLbl2.Text = str8
					cursorWrapper3 = cursorWrapper9
				Else
					vLbl1.Background = mod1.Sub155(-16776961, 0)
					vLbl1.Tag = ""
					vLbl2.Background = mod1.Sub155(-16776961, 0)
					vLbl2.Text = "NON PRENOTATO"
					Sub001()
					cursorWrapper3 = cursorWrapper9
				End If
				cursorWrapper3.Close
				Sub005()
				mod1.Sub081
			Case 3
				Dim numberDialog2 As NumberDialog
				numberDialog2.Digits = 2
				numberDialog2.Number = vCur1.GetString("sedie")
				numberDialog2.Decimal = 0
				numberDialog2.ShowSign = False
				Dim str10 As String = "Inserire il numero di sedie per " & vLbl1.Text
				Dim vShow3 As Int = numberDialog2.Show(str10, "Ok", "Annulla", "Azzera", Main.vBmp1)
				If vShow3 <> -3 Then
					If numberDialog2.Number <= 0 Then
					End If
					If vShow3 = -2 Then
						numberDialog2.Number = 0
					End If
					Main.vSql1.ExecNonQuery("Update tavoli set sedie = " & numberDialog2.Number & " where tavolo = " & vCur1.GetString("tavolo"))
					Dim vTmp As String = mod1.Sub107(vCur1.GetString("tavolo"))
					If Not(vTmp = Null) Then
						If vTmp.ToLowerCase <> "tavolo " & vCur1.GetString("tavolo") Then
							If Main.v_attivanumtavolo Then
								vTmp = vTmp & " (" & vCur1.GetString("tavolo") & ")"
							End If
						End If
						Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select pagina from pagine where pagina >=10  AND pagina <100 AND valore = " & vCur1.GetString("tavolo") & " AND tipo = 9 limit 1")
						Dim str11 As String = vTmp & " (" & Main.vSql1.ExecQuerySingleResult("select descrizione from despagine where codice = " & vExecQuerySingleResult) & ")"
						If numberDialog2.Number > 0 Then
							str11 = str11 & CRLF & numberDialog2.Number & " sedie"
						End If
						Dim cursorWrapper10 As Cursor
						vCur1 = Main.vSql1.ExecQuery(vStr3)
						vLbl1.Text = str11
					End If
				End If
				cursorWrapper3.Close
				Sub005()
				mod1.Sub081
			Case Else
				cursorWrapper3.Close
				Sub005()
				mod1.Sub081
		End Select
		Return
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub TipoVis_ItemClick(i As Int, obj As Object)
	ricerca()
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

