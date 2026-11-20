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
	Public vCur1 As Cursor
	Public vStr1 As String
	Public vInt1 As Int = 2
	Public vBln1 As Boolean
	Public vBln2 As Boolean
	Public vChr1 As Char
	Public vSht1 As Short
	Public vDbl1 As Double
	Public vDbl2 As Double
	Public vInt2 As Int
	Public vBln3 As Boolean
	Public vDbl3 As Double
End Sub

Sub Globals
	Public vcustomlistviewold1 As customlistviewold
	Public vcustomlistviewold2 As customlistviewold
	Public BtnHideSearch As Button
	Public Button37 As Button
	Public Button38 As Button
	Public Button39 As Button
	Public Button40 As Button
	Public Button41 As Button
	Public Button42 As Button
	Public Button43 As Button
	Public Button44 As Button
	Public Button45 As Button
	Public Button46 As Button
	Public Button47 As Button
	Public Button48 As Button
	Public Button49 As Button
	Public Button50 As Button
	Public Button51 As Button
	Public Button52 As Button
	Public Button53 As Button
	Public Button54 As Button
	Public Button55 As Button
	Public Button56 As Button
	Public Button57 As Button
	Public Button58 As Button
	Public Button59 As Button
	Public Button60 As Button
	Public Button61 As Button
	Public Button62 As Button
	Public Button63 As Button
	Public Button64 As Button
	Public Button65 As Button
	Public Button66 As Button
	Public P_list1 As Panel
	Public P_List2 As Panel
	Public RB12 As RadioButton
	Public RB13 As RadioButton
	Public RB14 As RadioButton
	Public RB23 As RadioButton
	Public RB34 As RadioButton
	Public RBIntero As RadioButton
	Public Tannulla As Button
	Public TConferma As Button
	Public TPRicerca As Panel
	Public vCur2 As Cursor
	Public vLst1 As List
	Public vMap1 As Map
	Public NoLimite As ToggleButton
	Public Consolida As ToggleButton
	Public lblTitolo As Label
	Public P_List2V As Panel
	Public TB1 As ToggleButton
	Public TB2 As ToggleButton
	Public TB3 As ToggleButton
	Public lblTotaleV As Label
	Public LblDesVariazioniV As Label
	Public tAnnullaV As Button
	Public TConfermaV As Button
	Public TSplitV As Button
	Public PVariazioni As Panel
	Public vLst2 As List
	Public vLst3 As List
	Public vLst4 As List
	Public vMap2 As Map
	Public vcustomlistviewold3 As customlistviewold
	Public vMap3 As Map
	Public vMap4 As Map
End Sub

Sub Activity_Create(z As Boolean)
	mod1.vStr2 = "Activity_Create(FirstTime As Boolean)"
	If mod1.vBln4 Then
		Activity.Finish
		Return
	End If
	If Main.vInt9 >= 19 Then
		Dim javaObject As JavaObject = Activity
		javaObject.RunMethod("setOnSystemUiVisibilityChangeListener", Array(javaObject.CreateEvent("android.view.View.OnSystemUiVisibilityChangeListener", "VisibilityChanged", Null)))
		Activity.Width = -1
		Activity.Height = -1
		mod1.Sub081
	End If
	Sub015("frmFraziona")
	mod1.Sub165(Tannulla)
	mod1.Sub165(tAnnullaV)
	mod1.Sub165(TConferma)
	mod1.Sub165(TConfermaV)
	Button37.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button38.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button39.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button40.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button41.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button42.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button43.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button44.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button45.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button46.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button47.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button48.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button49.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button50.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button51.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button52.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button53.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button54.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button55.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button56.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button57.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button58.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button59.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button60.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button61.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button62.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button63.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button64.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button65.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Button66.Background = mod1.Sub155(Colors.RGB(20, 128, 28), 25)
	Dim colorDrawable As ColorDrawable
	Dim colorDrawable2 As ColorDrawable
	Dim vRGB As Int = Colors.RGB(17, 87, 3)
	colorDrawable.Initialize2(vRGB, 25, 1, -16777216)
	colorDrawable2.Initialize2(-65536, 25, 1, -16777216)
	Dim stateListDrawable As StateListDrawable
	stateListDrawable.Initialize
	stateListDrawable.AddState(16842912, colorDrawable)
	stateListDrawable.AddState(-16842912, colorDrawable2)
	Consolida.Background = stateListDrawable
	Dim stateListDrawable2 As StateListDrawable
	stateListDrawable2.Initialize
	stateListDrawable2.AddState(16842912, colorDrawable2)
	stateListDrawable2.AddState(-16842912, colorDrawable)
	NoLimite.Background = stateListDrawable2
	Consolida.Checked = True
	NoLimite.Checked = False
	NoLimite.Visible = Main.v_frazionaconimporto = 0
	vcustomlistviewold1.Initialize(Me, "clv2")
	vcustomlistviewold2.Initialize(Me, "clv3")
	vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
	vcustomlistviewold2.vInt3 = Colors.RGB(245, 245, 245)
	lblTitolo.Color = Main.v_colormenutitle
	mod1.Sub173(lblTitolo)
	P_list1.AddView(vcustomlistviewold1.Sub003, 0, PerYToCurrent(18), PerXToCurrent(60), P_list1.Height - PerYToCurrent(18))
	P_List2.AddView(vcustomlistviewold2.Sub003, 0, 0, P_List2.Width, P_List2.Height)
	vBln1 = True
	vBln2 = False
	vChr1 = ""
	vSht1 = 0
	vLst1.Initialize
	vcustomlistviewold3.Initialize(Me, "clv22")
	vcustomlistviewold3.vInt3 = -16776961
	P_List2V.AddView(vcustomlistviewold3.Sub003, 0, DipToCurrent(0), P_List2V.Width, P_List2V.Height - DipToCurrent(70))
	vLst2.Initialize
	vLst3.Initialize
	vLst4.Initialize
	vMap2.Initialize
	vLst1.Initialize
	Dim bitmapDrawable As BitmapDrawable
	Dim bitmapDrawable2 As BitmapDrawable
	bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, "okgreen.png"))
	bitmapDrawable.Gravity = 5
	bitmapDrawable2.Initialize(LoadBitmap(File.DirAssets, "okGrey.png"))
	bitmapDrawable2.Gravity = 5
	Dim stateListDrawable3 As StateListDrawable
	stateListDrawable3.Initialize
	stateListDrawable3.AddState(16842912, bitmapDrawable)
	stateListDrawable3.AddState(-16842912, bitmapDrawable2)
	TB1.Background = stateListDrawable3
	Dim stateListDrawable4 As StateListDrawable
	stateListDrawable4.Initialize
	stateListDrawable4.AddState(16842912, bitmapDrawable)
	stateListDrawable4.AddState(-16842912, bitmapDrawable2)
	TB2.Background = stateListDrawable4
	Dim stateListDrawable5 As StateListDrawable
	stateListDrawable5.Initialize
	stateListDrawable5.AddState(16842912, bitmapDrawable)
	stateListDrawable5.AddState(-16842912, bitmapDrawable2)
	TB3.Background = stateListDrawable5
End Sub

Sub Activity_KeyPress(i As Int) As Boolean
	If i <> 4 Then
		Return False
	End If
	ToastMessageShow("Non Consentito", False)
	Return True
End Sub

Sub Activity_Pause(z As Boolean)
End Sub

Sub Activity_Resume
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			mod1.vStr2 = "Activity_Resume"
			If vBln2 Then
				Return
			End If
			Try
				Main.vSql1.ExecNonQuery("delete from  TmpFraziona")
				vBln1 = True
				vMap1.Initialize
				Dim vGetString As String = vCur1.GetString("totcre")
				If Not(vGetString.ToUpperCase.StartsWith("VV")) And vCur1.GetString("reparto").ToUpperCase <> "NESSUNO" Then
					Dim cursorWrapper As Cursor
					Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from Ventmp where substr(codice,1,2) ='ww' and totcre='" & vGetString & "'")
					Dim d As Double = 0
					If cursorWrapper2.RowCount > 0 Then
						Dim rowCount As Int = cursorWrapper2.RowCount - 1
						Dim i As Int
						For i = 0 To rowCount
							cursorWrapper2.Position = i
							Dim vTmp As Double = mod1.Sub023(cursorWrapper2.GetString("descrizione").Trim)
							Dim vNumberToString As String = vTmp
							Main.vSql1.ExecNonQuery("insert into TmpFraziona(codint,descrizione,codice,sel) values('','" & cursorWrapper2.GetString("descrizione").Trim & "','" & cursorWrapper2.GetString("codice").Trim & "'," & vNumberToString.Trim.Replace(",", ".") & ")")
							vMap1.Put(i, cursorWrapper2.GetString("idRiga"))
							d = d + vTmp
						Next
					End If
				End If
				Sub006()
				Sub018()
				Sub016(-1, True)
				Sub008()
				BtnHideSearch.Tag = "N"
				TPRicerca.Visible = False
				RB12.Checked = False
				RB13.Checked = False
				RB14.Checked = False
				RB23.Checked = False
				RB34.Checked = False
				RBIntero.Checked = False
				Select vInt1
					Case 2
						RB12.Checked = True
					Case 3
						RB13.Checked = True
					Case 4
						RB14.Checked = True
					Case Else
						RB12.Checked = True
				End Select
				vBln1 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				lblTitolo.Text = vStr1
				mod1.Sub081
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Sub001(cursorWrapper As Cursor, d As Double, j As Long, str As String, str2 As String, str3 As String)
	Dim str4 As String
	Dim f As Float
	Dim f2 As Float
	Dim str5 As String
	Dim vNumberToString As String
	Dim f3 As Float
	Dim f4 As Float
	Dim replace As String = cursorWrapper.GetString("codice").ToLowerCase.Replace("ww", "")
	mod1.vStr2 = "AddRecord"
	Try
		Dim list As List
		Dim map As Map
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where lower(ltrim(rtrim(codint))) = '" & replace.ToLowerCase.Trim & "'")
		If cursorWrapper3.RowCount > 0 Then
			cursorWrapper3.Position = 0
			Dim trim As String = cursorWrapper3.GetString("codint").Trim
			Dim i As Int = Main.vInt6
			If Main.v_frazionaconimporto >= 2 Then
				i = Main.v_frazionaconimporto - 1
			End If
			Dim parseDouble As Float = cursorWrapper3.GetString("list" & i).Trim
			If vDbl3 < cursorWrapper3.GetDouble("list" & i) Then
				vDbl3 = cursorWrapper3.GetDouble("list" & i)
			End If
			Dim f5 As Float = parseDouble * d
			Dim trim2 As String = cursorWrapper3.GetString("descrizione").Trim
			If str = "" Then
				str4 = trim
				f = parseDouble
				f2 = f5
				str5 = trim2
			Else If j <> 0 Then
				If Main.v_frazionaconimporto > 0 Then
					Dim vTmp As Double = parseDouble * mod1.Sub023(str) + cursorWrapper.GetDouble("ImportoV")
					f3 = Round2(vTmp, Main.v_arrotondav)
					f4 = f3 * d
				Else
					f3 = 0
					f4 = 0
				End If
				f = f3
				str4 = modfunstr.left("ww" & cursorWrapper3.GetString("codint").Trim, 20)
				f2 = f4
				str5 = str
			Else
				f2 = f5
				str4 = trim
				str5 = str
				f = parseDouble
			End If
			Dim substring As String = IIf(str2 <> "", str5 & " [" & str2.Trim & "]", str5)
			If d > 99 Then
				vNumberToString = "99"
			Else
				vNumberToString = d
			End If
			Dim replace2 As String = vNumberToString.Replace(",", ".")
			Dim replace3 As String = f.Replace(",", ".")
			Dim replace4 As String = f2.Replace(",", ".")
			list.Initialize
			map.Initialize
			map.Clear
			map.Put("codice", str4)
			map.Put("descrizione", substring.Trim)
			map.Put("brep", False)
			If Main.v_turni Then
				map.Put("turno", Main.vInt7)
			End If
			map.Put("qta", replace2)
			map.Put("prezzov", replace3)
			map.Put("reparto", cursorWrapper3.GetInt("reparto"))
			map.Put("iva", cursorWrapper3.GetInt("iva"))
			map.Put("importo", replace4)
			map.Put("datam", DateTime.Date(mod1.Sub058))
			map.Put("datam2", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058))
			map.Put("datam3", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
			map.Put("flgusointerno", cursorWrapper3.GetInt("flgusointerno"))
			map.Put("flgmag", cursorWrapper3.GetInt("flgmag"))
			If str3 <> "" Then
				map.Put("idRiga", str3)
			Else
				map.Put("idRiga", mod1.Sub058)
			End If
			map.Put("codint", cursorWrapper3.GetString("codint"))
			map.Put("plupeso", cursorWrapper3.GetInt("plupeso"))
			map.Put("cassa", Main.v_numcassa)
			map.Put("flgNF", False)
			map.Put("scop", 0)
			map.Put("scov", 0)
			If cursorWrapper.GetString("memo") <> "" Then
				map.Put("memo", cursorWrapper.GetString("memo"))
			End If
			list.Add(map)
			dbutil.Sub007(Main.vSql1, "Ventmp", list)
			Dim parseDouble2 As Long = Main.vSql1.ExecQuerySingleResult("select max(chiave) from Ventmp ")
			If j = 0 Then
				Main.vSql1.ExecNonQuery("update Ventmp set  qtacondecimali = chiave,totcre=chiave where chiave = " & parseDouble2)
			Else
				Dim cursorWrapper4 As Cursor
				Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("select reparto,stampante2,stampaesclusiva from Ventmp  where chiave = " & vCur1.GetString("chiave"))
				cursorWrapper5.Position = 0
				If Main.v_turni Then
					Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select turno from Ventmp  where chiave = " & vCur1.GetString("chiave"))
					Main.vSql1.ExecNonQuery("update Ventmp set turno = " & vExecQuerySingleResult & ", qtacondecimali = " & j & ",totcre='" & j & "',reparto = " & cursorWrapper5.GetString("reparto") & ",stampante2 = " & cursorWrapper5.GetString("stampante2") & ",stampaesclusiva = " & cursorWrapper5.GetString("stampaesclusiva") & " where chiave = " & parseDouble2)
				Else
					Main.vSql1.ExecNonQuery("update Ventmp set  qtacondecimali = " & j & ",totcre='" & j & "',reparto = " & cursorWrapper5.GetString("reparto") & ",stampante2 = " & cursorWrapper5.GetString("stampante2") & ",stampaesclusiva = " & cursorWrapper5.GetString("stampaesclusiva") & " where chiave = " & parseDouble2)
				End If
				cursorWrapper5.Close
			End If
		End If
		cursorWrapper3.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/frmfraziona.java, metodo _btnadd_click (riga 1006).
Sub Btnadd_Click
	Dim z As Boolean
	Dim i As Int = 4
	mod1.vStr2 = "Sub BtnAdd_Click"
	Try
		Dim labelWrapper As Label = Sender
		If labelWrapper.Left > PerXToCurrent(70) Then
			i = 6
		Else If labelWrapper.Left <= PerXToCurrent(45) Then
			i = IIf(labelWrapper.Left > PerXToCurrent(20), 2, 0)
		End If
		Dim vTmp As Int = vcustomlistviewold2.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
		Dim labelWrapper2 As Label = getpanel.GetView(i + 1)
		Main.vCur10.Position = labelWrapper2.Text
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Not(RB12.Visible) And Not(RB13.Visible) And Not(RB14.Visible) And Not(RBIntero.Visible) And Not(RB23.Visible) And Not(RB34.Visible) Then
		Return
	End If
	If RBIntero.Checked Then
		vSht1 = 3
	End If
	If RB12.Checked Then
		vSht1 = 0
	End If
	If RB13.Checked Then
		vSht1 = 1
	End If
	If RB14.Checked Then
		vSht1 = 2
	End If
	If RB23.Checked Then
		vSht1 = 4
	End If
	If RB34.Checked Then
		vSht1 = 5
	End If
	If vCur2.RowCount > 0 And Consolida.Checked And Not(NoLimite.Checked) Then
		If Main.vCur10.GetInt("obbligodes") <> 1 Then
			Dim rowCount As Int = vCur2.RowCount - 1
			z = False
			Dim i2 As Int
			For i2 = 0 To rowCount
				vCur2.Position = i2
				Dim vGetString As String = vCur2.GetString("codice")
				If vGetString = Main.vCur10.GetString("codice") Then
					Main.vSql1.ExecNonQuery("update tmpfraziona set sel = sel + " & Sub002(vSht1) & " where codice = '" & vCur2.GetString("codice") & "'")
					z = True
				End If
			Next
			If Not(z) Then
				Dim vGetString2 As String = Main.vCur10.GetString("descrizione")
				If Main.vCur10.GetInt("obbligodes") = 1 Then
					vGetString2 = mod1.Sub037
				End If
				Main.vSql1.ExecNonQuery("insert into tmpfraziona(codint,descrizione,codice,sel) values('','" & vGetString2 & "','" & Main.vCur10.GetString("codice") & "'," & Sub002(vSht1) & ")")
			End If
			Sub018()
			Return
		End If
	End If
	z = False
	If Not(z) Then
	End If
	Sub018()
End Sub

Sub BtnHideSearchV_Click
	mod1.vStr2 = "BtnHideSearchV_Click"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Not(BtnHideSearch.Enabled) Then
		Return
	End If
	BtnHideSearch.Enabled = False
	DoEvents
	If BtnHideSearch.Tag = "S" Then
		BtnHideSearch.Tag = "N"
		Dim rowCount As Int = Main.vCur10.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			Main.vCur10.Position = i
			vLst1.Set(Main.vCur10.Position, "")
		Next
		Sub016(-1, False)
	Else
		BtnHideSearch.Tag = "S"
	End If
	TPRicerca.Visible = BtnHideSearch.Tag = "S"
	BtnHideSearch.Enabled = True
End Sub

Sub BtnK_Click
	Dim buttonWrapper As Button
	Dim z As Boolean = False
	mod1.vStr2 = "BtnK_click"
	Try
		buttonWrapper = Sender
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Not(buttonWrapper.Enabled) Then
		Return
	End If
	buttonWrapper.Enabled = False
	DoEvents
	If buttonWrapper.Text <> "" Then
		vChr1 = buttonWrapper.Text.Trim
		Dim rowCount As Int = Main.vCur10.RowCount - 1
		Dim i As Int = 0
		Dim i2 As Int = 0
		Dim i3 As Int = 0
		Do While i <= rowCount
			Main.vCur10.Position = i
			Dim upperCase As String = Main.vCur10.GetString("descrizione").Trim.SubString2(0, 1).ToUpperCase
			If vChr1 = " " And Not(z) Then
				If vLst1.Get(Main.vCur10.Position) = "F" Then
					vLst1.Set(Main.vCur10.Position, "")
					z = True
					i3 = i2
				End If
				z = True
				i3 = i2
			Else If upperCase = vChr1 And Not(z) Then
				If vLst1.Get(Main.vCur10.Position) = "" Then
					vLst1.Set(Main.vCur10.Position, "F")
					z = True
					i3 = i2
				End If
				z = True
				i3 = i2
			Else If upperCase = vChr1 Then
				If vLst1.Get(Main.vCur10.Position) = "" Then
					vLst1.Set(Main.vCur10.Position, "F")
				End If
			Else
				If vLst1.Get(Main.vCur10.Position) = "F" Then
					vLst1.Set(Main.vCur10.Position, "")
				End If
			End If
			i = i + 1
			i2 = i2 + 1
		Loop
		If z Then
			Sub016(i3, False)
		End If
	End If
	buttonWrapper.Enabled = True
End Sub

Sub Btnvar_LongClick
	mod1.vStr2 = "BtnVar_LongClick"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		vCur2.Position = getpanel.GetView(2).Text
		Sub003()
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/frmfraziona.java, metodo _buttonaddanag_click (riga 1235).
Sub Buttonaddanag_Click
	Dim labelWrapper As Label
	Dim getpanel As Panel
	Dim i As Int
	Dim z As Boolean
	Dim vObjectToString As String
	Dim list As List
	mod1.vStr2 = "buttonAddAnag_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold3.Sub007(Sender)
		labelWrapper = Sender
		getpanel = vcustomlistviewold3.getpanel(vTmp)
		Dim vGetAllViewsRecursive As IterableList = getpanel.GetAllViewsRecursive
		Dim size As Int = vGetAllViewsRecursive.Size
		Dim i2 As Int = 0
		i = 0
		Do While True
			If i2 >= size Then
				z = False
				Exit
			End If
			If vGetAllViewsRecursive.Get(i2) = labelWrapper Then
				z = True
				Exit
			End If
			i2 = i2 + 1
			i = i + 1
		Loop
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Not(z) Then
		Return
	End If
	Dim imageViewWrapper As ImageView = getpanel.GetView(i + 2)
	Dim labelWrapper2 As Label = getpanel.GetView(i + 1)
	Main.vCur9.Position = labelWrapper2.Text
	If vLst2.Get(Main.vCur9.Position) = "" Then
		If labelWrapper2.Tag >= 0 And vMap3.Size > 0 Then
			Dim vObjectToNumber As Int = labelWrapper2.Tag
			If vMap3.ContainsKey(vObjectToNumber) And labelWrapper <> vMap3.Get(vObjectToNumber) Then
				Dim vObjectToCharSequence As Object = "La variazione selezionata fa parte di un gruppo abilitato alla selezione di un elemento alla volta."
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Return
			End If
			If Not(vMap3.ContainsKey(vObjectToNumber)) Then
				vMap3.Put(Main.vCur9.GetInt("gruppov"), labelWrapper)
			End If
		Else If labelWrapper2.Tag >= 0 Then
			vMap3.Put(Main.vCur9.GetInt("gruppov"), labelWrapper)
		End If
	End If
	If labelWrapper.Tag = "3" Then
		Sub020()
		Return
	End If
	If labelWrapper.Tag = "2" Then
		If Sub004() = "+ " Then
			If vLst2.Get(Main.vCur9.Position) = "+ " Then
				vLst2.Set(Main.vCur9.Position, "- ")
			Else
				vLst2.Set(Main.vCur9.Position, "")
				vLst3.Set(Main.vCur9.Position, "")
				If labelWrapper2.Tag >= 0 And vMap3.Size > 0 Then
					Dim vObjectToNumber2 As Int = labelWrapper2.Tag
					If vMap3.ContainsKey(vObjectToNumber2) And labelWrapper = vMap3.Get(vObjectToNumber2) Then
						vMap3.Remove(vObjectToNumber2)
					End If
				End If
			End If
		Else
			vLst2.Set(Main.vCur9.Position, Sub004())
		End If
	Else
		vLst2.Set(Main.vCur9.Position, Sub004())
	End If
	Dim vTmp_ As Int = mod1.Sub159(Main.vCur9.GetInt("gruppov") + 1, labelWrapper)
	labelWrapper.Tag = "0"
	If vLst2.Get(Main.vCur9.Position) <> "" Then
		If vLst2.Get(Main.vCur9.Position) <> "D" Then
			Dim vTmp__ As String = modfunstr.Sub004(6 - modfunstr.Sub001(vLst2.Get(Main.vCur9.Position)))
			If Main.vCur9.GetInt("obbligodes") = 1 Then
				If vLst2.Get(Main.vCur9.Position) = "+ " Then
					Dim position As Int = Main.vCur9.Position
					vLst4.Set(position, mod1.Sub037)
				End If
			End If
			Dim vObjectToString2 As String = vLst4.Get(Main.vCur9.Position)
			If (vObjectToString2.StartsWith("+ ") Or vObjectToString2.StartsWith("- ")) And vObjectToString2.Length > 2 Then
				vObjectToString2 = vObjectToString2.SubString(2)
			End If
			labelWrapper.Text = vLst2.Get(Main.vCur9.Position) & vTmp__ & vObjectToString2
			vObjectToString = vLst3.Get(Main.vCur9.Position)
			If vObjectToString.Trim <> "" Then
				Dim vObjectToString3 As String = vLst4.Get(Main.vCur9.Position)
				If vObjectToString3.Trim.IndexOf("[[") >= 0 Then
					labelWrapper.Text = modfunstr.left(vObjectToString3.SubString2(0, vObjectToString3.Trim.IndexOf("[[")) & " " & vObjectToString3.Trim, 50)
				Else
					labelWrapper.Text = modfunstr.left(labelWrapper.Text + " " + vObjectToString.Trim, 50).Trim
				End If
			End If
			labelWrapper.Text = modfunstr.left(labelWrapper.Text, 50)
			imageViewWrapper.Visible = False
			mod1.Sub169(labelWrapper)
			list = vLst2
			If list.Get(Main.vCur9.Position) = "" Then
				If vLst2.Get(Main.vCur9.Position) = "D" Then
					mod1.vBln6 = True
					Dim concreteViewWrapper As View = labelWrapper
					mod1.Sub176(concreteViewWrapper, 1, 2, 2, -16777216)
					mod1.Sub160(-7829368, 50, labelWrapper, True)
					labelWrapper.Tag = "3"
				Else
					Select vLst2.Get(Main.vCur9.Position)
						Case "Molto", "Poco", "+ "
							Dim concreteViewWrapper2 As View = labelWrapper
							mod1.Sub176(concreteViewWrapper2, 1, 2, 2, -16777216)
							mod1.vBln6 = True
							mod1.Sub160(vTmp_, 50, labelWrapper, True)
							If vLst2.Get(Main.vCur9.Position) = "+ " Then
								imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_segno piu.png")
								imageViewWrapper.Visible = True
								labelWrapper.Text = labelWrapper.Text.SubString(2)
							End If
						Case "- "
							mod1.vBln6 = True
							Dim concreteViewWrapper3 As View = labelWrapper
							mod1.Sub176(concreteViewWrapper3, 1, 2, 2, -16777216)
							mod1.Sub160(vTmp_, 50, labelWrapper, True)
							imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_segno meno.png")
							imageViewWrapper.Visible = True
							labelWrapper.Text = labelWrapper.Text.SubString(2)
					End Select
					TB1.Checked = False
					TB2.Checked = False
					TB3.Checked = False
					labelWrapper.Tag = "2"
					Sub020()
					Return
				End If
			Else
				If vLst1.Get(Main.vCur9.Position) <> "" Then
					mod1.vBln6 = True
					Dim concreteViewWrapper4 As View = labelWrapper
					mod1.Sub176(concreteViewWrapper4, 1, 2, 2, -16777216)
					mod1.Sub160(vTmp_, 50, labelWrapper, True)
					labelWrapper.Tag = "4"
				End If
			End If
			Sub020()
			Return
		End If
	End If
	labelWrapper.Text = vLst4.Get(Main.vCur9.Position)
	If (labelWrapper.Text.StartsWith("+ ") Or labelWrapper.Text.StartsWith("- ")) And labelWrapper.Text.Length > 2 Then
		labelWrapper.Text = labelWrapper.Text.Replace("+ ", "").Replace("- ", "")
	End If
	vObjectToString = vLst3.Get(Main.vCur9.Position)
	If vObjectToString.Trim <> "" Then
	End If
	labelWrapper.Text = modfunstr.left(labelWrapper.Text, 50)
	imageViewWrapper.Visible = False
	mod1.Sub169(labelWrapper)
	list = vLst2
	If list.Get(Main.vCur9.Position) = "" Then
	End If
	Sub020()
End Sub

Sub Buttondel_Click
	mod1.vStr2 = "buttonDel_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		vCur2.Position = getpanel.GetView(2).Text
		Main.vSql1.ExecNonQuery("delete from tmpfraziona where chiave =" & vCur2.GetString("chiave"))
		Sub018()
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub002(s As Short) As String
	Select s
		Case 0
			Return "0.5"
		Case 1
			Return "0.3333"
		Case 2
			Return "0.25"
		Case 3
			Return "1"
		Case 4
			Return "0.6666"
		Case 5
			Return "0.75"
		Case Else
			Return "1"
	End Select
End Sub

Sub Sub003 As Boolean
	mod1.vStr2 = "Sub CercaVariazioni As Boolean"
	Try
		Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select reparto from anagra where codint ='" & vCur2.GetString("codice").Trim.Replace("ww", "") & "'")
		If vExecQuerySingleResult.Trim <> "" And vExecQuerySingleResult.Trim <> "0" Then
			If Main.vCur9.IsInitialized Then
				Main.vCur9.Close
			End If
			Dim cursorWrapper As Cursor
			Main.vCur9 = Main.vSql1.ExecQuery("Select distinct(ANAGRA.codint),ANAGRA.descrizione,des1,style,des2,gruppov,obbligodes from ANAGRA inner join gruppovar on gruppovar.codice=anagra.gruppov left join GruppiVariazioniArt on GruppiVariazioniArt.codint = ANAGRA.codint  where anagra.bvar=1 and ANAGRA.reparto  >0 and (ANAGRA.reparto = " & vExecQuerySingleResult & " or GruppiVariazioniArt.reparto ='" & vExecQuerySingleResult & "') order by gruppovar.indice, anagra.gruppov, upper(ANAGRA.descrizione) asc ,ANAGRA.codint")
			If Main.vCur9.RowCount > 0 Then
				vInt2 = 0
				vDbl1 = 1
				vDbl2 = vCur2.GetDouble("Sel")
				TSplitV.Visible = False
				LblDesVariazioniV.Text = "            Variazioni Disponibili per " & vCur2.GetString("descrizione")
				Sub014()
				Return True
			End If
		End If
		Return False
	Catch
		mod1.Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub004 As String
	mod1.vStr2 = "CheckChecked"
	Try
		If TB1.Checked Then
			Return "- "
		End If
		If TB2.Checked Then
			Return "Molto"
		End If
		If TB3.Checked Then
			Return "Poco"
		End If
		Return "+ "
	Catch
		mod1.Sub217(LastException.Message)
		Return "+ "
	End Try
End Sub

Sub Sub005
	Dim vSplit As String()
	Dim str As String
	Dim d As Double
	Dim str2 As String
	Dim f As Float
	mod1.vStr2 = "conferma"
	Try
		vSplit = Regex.Split("_", lblTotaleV.Tag)
		If IsNumber(vSplit(0)) Then
			Dim parseDouble As Double = vSplit(0)
			If parseDouble > Main.v_maximpo Then
				Dim vObjectToCharSequence As Object = "è stato superato l'importo massimo per l'articolo."
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				mod1.Sub081
				Return
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vSplit(1) <> "OK" Then
		Dim vObjectToCharSequence3 As Object = vSplit(1)
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	TConfermaV.Enabled = False
	Dim d2 As Double = 0
	Dim rowCount As Int = Main.vCur9.RowCount - 1
	Dim i As Int = 0
	Dim s As Short = 0
	Dim str3 As String = ""
	Do While i <= rowCount
		Main.vCur9.Position = i
		Dim vObjectToNumber As Double = IIf(Main.v_checkvarianti, vDbl1, 1)
		Dim vObjectToString As String = vLst4.Get(Main.vCur9.Position)
		Dim vObjectToString2 As String = vLst2.Get(Main.vCur9.Position)
		Dim vObjectToString3 As String = vLst3.Get(Main.vCur9.Position)
		If vObjectToString2.Trim = "" Then
			str = str3
			d = d2
		Else
			If vObjectToString2.Trim <> "D" Then
				str2 = vObjectToString2
			Else If vObjectToString.ToLowerCase.Trim.StartsWith("abb.") Or vObjectToString.Trim.ToLowerCase.IndexOf("(molto)") > 0 Then
				str2 = "Molto"
			Else If vObjectToString.Trim.ToLowerCase.StartsWith("poco") Or vObjectToString.Trim.ToLowerCase.IndexOf("(poco)") > 0 Then
				str2 = "Poco"
			Else If vObjectToString.Trim.ToLowerCase.StartsWith("+") Then
				str2 = "+ "
			Else If vObjectToString.Trim.ToLowerCase.StartsWith("-") Then
				str2 = "- "
			Else
				str2 = "+ "
			End If
			Dim str4 As String = str3 & " " & str2 & " " & vObjectToString
			If vObjectToString3.Trim <> "" Then
				str4 = str4 & " [" & vObjectToString3.Trim & "]"
			End If
			Dim str5 As String = str4 & TAB
			If str5 <> "" Then
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where list1 >0 and  lower(ltrim(rtrim(codint))) = '" & Main.vCur9.GetString("codint").ToLowerCase.Trim & "'")
				If cursorWrapper2.RowCount > 0 Then
					cursorWrapper2.Position = 0
					Dim parseDouble2 As Float = cursorWrapper2.GetString("list1").Trim
					Dim f2 As Float = parseDouble2 * vObjectToNumber
					If str2.Trim.ToLowerCase = "meno" Or str2.Trim.ToLowerCase = "-" Then
						Dim parseDouble3 As Float = cursorWrapper2.GetString("list2")
						Dim f3 As Float = vObjectToNumber * parseDouble3
						Dim f4 As Float = parseDouble3 * 1
						f = f3
					Else If str2.Trim.ToLowerCase = "molto" Then
						If Main.v_listmolto <> 0 Then
							parseDouble2 = Round2(parseDouble2 * (1 + Main.v_listmolto / 100), 2)
						End If
						f = vObjectToNumber * parseDouble2
					Else If str2.Trim.ToLowerCase = "poco" Then
						If Main.v_listpoco <> 0 Then
							parseDouble2 = Round2(parseDouble2 - parseDouble2 * Main.v_listpoco / 100, 2)
						End If
						f = vObjectToNumber * parseDouble2
					Else
						f = f2
					End If
					If Main.v_tipofrazionamentovariazioni = 3 Then
						d2 = d2 + Round2(f, Main.v_arrotondav)
					Else
						If Main.v_tipofrazionamentovariazioni <> 1 Then
							Dim d5 As Double = f * vDbl2
							d2 = d2 + Round2(d5, Main.v_arrotondav)
						End If
					End If
				End If
				cursorWrapper2.Close
			End If
			d = d2
			str = str5
		End If
		i = i + 1
		s = s + 1
		str3 = str
		d2 = d
	Loop
	Main.vSql1.ExecNonQuery("update tmpfraziona set memo ='" & str3 & "',ImportoV=" & d2 & " where chiave = " & vCur2.GetString("chiave"))
	Sub018()
	PVariazioni.SetVisibleAnimated(300, False)
End Sub

Sub Sub006
	Dim zArr As Boolean()
	mod1.vStr2 = "Crealistap1()"
	Try
		Dim zArr(6) As Boolean
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If NoLimite.Checked Then
		Return
	End If
	Dim parseDouble As Double = Main.vSql1.ExecQuerySingleResult("Select CASE WHEN  round(sum(sel),4)  is null then 0 else round(sum(sel),4) end as tot from tmpfraziona")
	zArr(0) = True
	zArr(1) = True
	zArr(2) = True
	zArr(3) = True
	zArr(4) = True
	zArr(5) = True
	If parseDouble > 0 Then
		If parseDouble = 0.25 Or parseDouble = 0.5 Or parseDouble = 0.75 Then
			zArr(1) = False
		End If
		If parseDouble = 0.6666 Or parseDouble = 0.3333 Then
			zArr(2) = False
		End If
		If parseDouble = 0.6666 Or parseDouble = 0.75 Or parseDouble = 0.3333 Then
			zArr(0) = False
		End If
		If parseDouble = 0.5 Or parseDouble = 0.6666 Or parseDouble = 0.75 Or parseDouble = 0.3333 Then
			zArr(5) = False
		End If
		If parseDouble = 0.25 Or parseDouble = 0.5 Or parseDouble = 0.6666 Or parseDouble = 0.75 Then
			zArr(4) = False
		End If
		zArr(3) = False
		If parseDouble > 0.98 Then
			RB12.Visible = False
			RB13.Visible = False
			RB14.Visible = False
			RBIntero.Visible = False
			RB23.Visible = False
			RB34.Visible = False
			Return
		End If
	End If
	If zArr(0) Or zArr(1) Or zArr(2) Or zArr(3) Or zArr(4) Or zArr(5) Then
		Dim radioButtonWrapper As RadioButton
		If RBIntero.Checked Then
			radioButtonWrapper = RBIntero
		End If
		If RB12.Checked Then
			radioButtonWrapper = RB12
		End If
		If RB13.Checked Then
			radioButtonWrapper = RB13
		End If
		If RB14.Checked Then
			radioButtonWrapper = RB14
		End If
		If RB23.Checked Then
			radioButtonWrapper = RB23
		End If
		If RB34.Checked Then
			radioButtonWrapper = RB34
		End If
		Dim i As Int
		For i = 0 To 5
			If i = 0 Then
				RB12.Visible = zArr(i)
				If RB12.Visible Then
					RB12.Checked = True
				End If
			Else If i = 1 Then
				RB13.Visible = zArr(i)
				If RB13.Visible Then
					RB13.Checked = True
				End If
			Else If i = 2 Then
				RB14.Visible = zArr(i)
				If RB14.Visible Then
					RB14.Checked = True
				End If
			Else If i = 3 Then
				RBIntero.Visible = zArr(i)
				If RBIntero.Visible Then
					RBIntero.Checked = True
				End If
			Else If i = 4 Then
				RB23.Visible = zArr(i)
				If RB23.Visible Then
					RB23.Checked = True
				End If
			Else If i = 5 Then
				RB34.Visible = zArr(i)
				If RB34.Visible Then
					RB34.Checked = True
				End If
			End If
		Next
		If radioButtonWrapper.IsInitialized And radioButtonWrapper.Visible Then
			radioButtonWrapper.Checked = True
		End If
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/frmfraziona.java, metodo m6… (riga 1879).
Sub Sub007(str As String, str2 As String, i As Int, panelWrapper As Panel) As Panel
	Dim labelWrapper As Label
	Dim labelWrapper2 As Label
	Dim i2 As Int
	Dim d As Double
	Dim vTmp As Int
	Dim list As List
	Dim vObjectToString As String
	Dim list2 As List
	Try
		'labelWrapper = Label
		labelWrapper.Initialize("buttonAddAnag")
		Dim i3 As Int = Main.v_colonnevarianti + 4
		labelWrapper.Text = str2
		labelWrapper.TextSize = 20 - i3 / 2
		labelWrapper.TextColor = -1
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper.Tag = "0"
		mod1.Sub169(labelWrapper)
		'labelWrapper2 = Label
		labelWrapper2.Initialize("")
		labelWrapper2.Text = str
		labelWrapper2.Visible = False
		labelWrapper2.Tag = -1
		i2 = 0
		Dim vPerXToCurrent As Double = PerXToCurrent(24)
		Select i3
			Case 4
				If str Mod i3 <> 1 Then
					If str Mod i3 <> 2 Then
						If str Mod i3 <> 3 Then
							If str Mod i3 = 0 Then
								i2 = PerXToCurrent(2)
								d = vPerXToCurrent
							End If
							d = vPerXToCurrent
						Else
							i2 = PerXToCurrent(74)
							d = vPerXToCurrent
						End If
					Else
						i2 = PerXToCurrent(50)
						d = vPerXToCurrent
					End If
				Else
					i2 = PerXToCurrent(26)
					d = vPerXToCurrent
				End If
			Case 5
				vPerXToCurrent = PerXToCurrent(19.2)
				If str Mod i3 <> 1 Then
					If str Mod i3 <> 2 Then
						If str Mod i3 <> 3 Then
							If str Mod i3 <> 4 Then
								If str Mod i3 = 0 Then
									i2 = PerXToCurrent(2)
									d = vPerXToCurrent
								End If
								d = vPerXToCurrent
							Else
								i2 = PerXToCurrent(78.8)
								d = vPerXToCurrent
							End If
						Else
							i2 = PerXToCurrent(59.6)
							d = vPerXToCurrent
						End If
					Else
						i2 = PerXToCurrent(40.4)
						d = vPerXToCurrent
					End If
				Else
					i2 = PerXToCurrent(21.2)
					d = vPerXToCurrent
				End If
			Case 6
				vPerXToCurrent = PerXToCurrent(16)
				If str Mod i3 <> 1 Then
					If str Mod i3 <> 2 Then
						If str Mod i3 <> 3 Then
							If str Mod i3 <> 4 Then
								If str Mod i3 <> 5 Then
									If str Mod i3 = 0 Then
										i2 = PerXToCurrent(2)
										d = vPerXToCurrent
									End If
									d = vPerXToCurrent
								Else
									i2 = PerXToCurrent(82)
									d = vPerXToCurrent
								End If
							Else
								i2 = PerXToCurrent(66)
								d = vPerXToCurrent
							End If
						Else
							i2 = PerXToCurrent(50)
							d = vPerXToCurrent
						End If
					Else
						i2 = PerXToCurrent(34)
						d = vPerXToCurrent
					End If
				Else
					i2 = PerXToCurrent(18)
					d = vPerXToCurrent
				End If
			Case 7
				vPerXToCurrent = PerXToCurrent(13.5)
				If str Mod i3 <> 1 Then
					If str Mod i3 <> 2 Then
						If str Mod i3 <> 3 Then
							If str Mod i3 <> 4 Then
								If str Mod i3 <> 5 Then
									If str Mod i3 <> 6 Then
										If str Mod i3 = 0 Then
											i2 = PerXToCurrent(2)
											d = vPerXToCurrent
										End If
										d = vPerXToCurrent
									Else
										i2 = PerXToCurrent(83)
										d = vPerXToCurrent
									End If
								Else
									i2 = PerXToCurrent(69.5)
									d = vPerXToCurrent
								End If
							Else
								i2 = PerXToCurrent(56)
								d = vPerXToCurrent
							End If
						Else
							i2 = PerXToCurrent(42.5)
							d = vPerXToCurrent
						End If
					Else
						i2 = PerXToCurrent(29)
						d = vPerXToCurrent
					End If
				Else
					i2 = PerXToCurrent(15.5)
					d = vPerXToCurrent
				End If
			Case 8
				vPerXToCurrent = PerXToCurrent(12.5)
				If str Mod i3 <> 1 Then
					If str Mod i3 <> 2 Then
						If str Mod i3 <> 3 Then
							If str Mod i3 <> 4 Then
								If str Mod i3 <> 5 Then
									If str Mod i3 <> 6 Then
										If str Mod i3 <> 7 Then
											If str Mod i3 = 0 Then
												i2 = PerXToCurrent(0)
												d = vPerXToCurrent
											End If
											d = vPerXToCurrent
										Else
											i2 = PerXToCurrent(87.5)
											d = vPerXToCurrent
										End If
									Else
										i2 = PerXToCurrent(75)
										d = vPerXToCurrent
									End If
								Else
									i2 = PerXToCurrent(62.5)
									d = vPerXToCurrent
								End If
							Else
								i2 = PerXToCurrent(50)
								d = vPerXToCurrent
							End If
						Else
							i2 = PerXToCurrent(37.5)
							d = vPerXToCurrent
						End If
					Else
						i2 = PerXToCurrent(25)
						d = vPerXToCurrent
					End If
				Else
					i2 = PerXToCurrent(12.5)
					d = vPerXToCurrent
				End If
			Case 9
				vPerXToCurrent = PerXToCurrent(11)
				If str Mod i3 <> 1 Then
					If str Mod i3 <> 2 Then
						If str Mod i3 <> 3 Then
							If str Mod i3 <> 4 Then
								If str Mod i3 <> 5 Then
									If str Mod i3 <> 6 Then
										If str Mod i3 <> 7 Then
											If str Mod i3 <> 8 Then
												If str Mod i3 = 0 Then
													i2 = PerXToCurrent(0.5)
													d = vPerXToCurrent
												End If
												d = vPerXToCurrent
											Else
												i2 = PerXToCurrent(88.5)
												d = vPerXToCurrent
											End If
										Else
											i2 = PerXToCurrent(77.5)
											d = vPerXToCurrent
										End If
									Else
										i2 = PerXToCurrent(66.5)
										d = vPerXToCurrent
									End If
								Else
									i2 = PerXToCurrent(55.5)
									d = vPerXToCurrent
								End If
							Else
								i2 = PerXToCurrent(44.5)
								d = vPerXToCurrent
							End If
						Else
							i2 = PerXToCurrent(33.5)
							d = vPerXToCurrent
						End If
					Else
						i2 = PerXToCurrent(22.5)
						d = vPerXToCurrent
					End If
				Else
					i2 = PerXToCurrent(11.5)
					d = vPerXToCurrent
				End If
			Case 10
				vPerXToCurrent = PerXToCurrent(10)
				If str Mod i3 <> 1 Then
					If str Mod i3 <> 2 Then
						If str Mod i3 <> 3 Then
							If str Mod i3 <> 4 Then
								If str Mod i3 <> 5 Then
									If str Mod i3 <> 6 Then
										If str Mod i3 <> 7 Then
											If str Mod i3 <> 8 Then
												If str Mod i3 <> 9 Then
													If str Mod i3 = 0 Then
														i2 = PerXToCurrent(0)
														d = vPerXToCurrent
													End If
													d = vPerXToCurrent
												Else
													i2 = PerXToCurrent(90)
													d = vPerXToCurrent
												End If
											Else
												i2 = PerXToCurrent(80)
												d = vPerXToCurrent
											End If
										Else
											i2 = PerXToCurrent(70)
											d = vPerXToCurrent
										End If
									Else
										i2 = PerXToCurrent(60)
										d = vPerXToCurrent
									End If
								Else
									i2 = PerXToCurrent(50)
									d = vPerXToCurrent
								End If
							Else
								i2 = PerXToCurrent(40)
								d = vPerXToCurrent
							End If
						Else
							i2 = PerXToCurrent(30)
							d = vPerXToCurrent
						End If
					Else
						i2 = PerXToCurrent(20)
						d = vPerXToCurrent
					End If
				Else
					i2 = PerXToCurrent(10)
					d = vPerXToCurrent
				End If
			Case Else
				d = vPerXToCurrent
		End Select
		vTmp = mod1.Sub159(Main.vCur9.GetInt("gruppov") + 1, labelWrapper)
		list = vLst2
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If list.Get(Main.vCur9.Position) <> "" Then
		If vLst2.Get(Main.vCur9.Position) <> "D" Then
			Dim vTmp_ As String = modfunstr.Sub004(6 - modfunstr.Sub001(vLst2.Get(Main.vCur9.Position)))
			labelWrapper.Text = vLst2.Get(Main.vCur9.Position) & vTmp_ & vLst4.Get(Main.vCur9.Position)
			vObjectToString = vLst3.Get(Main.vCur9.Position)
			If vObjectToString.Trim <> "" Then
				Dim vObjectToString2 As String = vLst4.Get(Main.vCur9.Position)
				If vObjectToString2.Trim.IndexOf("[[") >= 0 Then
					labelWrapper.Text = modfunstr.left(vObjectToString2.SubString2(0, vObjectToString2.Trim.IndexOf("[[")) & " " & vObjectToString2.Trim, 50)
				Else
					labelWrapper.Text = modfunstr.left(labelWrapper.Text + " " + vObjectToString.Trim, 50).Trim
				End If
			End If
			labelWrapper.Text = modfunstr.left(labelWrapper.Text, 50)
			list2 = vLst2
			If list2.Get(Main.vCur9.Position) = "" Then
				If vLst2.Get(Main.vCur9.Position) = "D" Then
					mod1.Sub160(-7829368, 50, labelWrapper, False)
					vLst4.Set(Main.vCur9.Position, str2)
					labelWrapper.Text = vLst4.Get(Main.vCur9.Position)
					labelWrapper.Tag = "3"
				Else
					mod1.Sub160(vTmp, 50, labelWrapper, False)
					labelWrapper.Tag = "2"
					panelWrapper.AddView(labelWrapper, i2, DipToCurrent(0), d, i)
					panelWrapper.AddView(labelWrapper2, DipToCurrent(330), DipToCurrent(0), DipToCurrent(10), DipToCurrent(46))
					Dim imageViewWrapper As ImageView
					imageViewWrapper.Initialize("")
					imageViewWrapper.Gravity = 119
					If vLst2.Get(Main.vCur9.Position) = "+ " Then
						imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_segno piu.png")
						imageViewWrapper.Visible = True
						labelWrapper.Text = labelWrapper.Text.SubString(2)
					Else
						If vLst2.Get(Main.vCur9.Position) = "- " Then
							imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_segno meno.png")
							imageViewWrapper.Visible = True
							labelWrapper.Text = labelWrapper.Text.SubString(2)
						End If
					End If
					panelWrapper.AddView(imageViewWrapper, i2 + DipToCurrent(3), i / 2 - DipToCurrent(15), DipToCurrent(30), DipToCurrent(30))
					Return panelWrapper
				End If
			Else
				If vLst1.Get(Main.vCur9.Position) <> "" Then
					mod1.Sub160(vTmp, 50, labelWrapper, False)
					labelWrapper.Tag = "4"
				End If
			End If
			panelWrapper.AddView(labelWrapper, i2, DipToCurrent(0), d, i)
			panelWrapper.AddView(labelWrapper2, DipToCurrent(330), DipToCurrent(0), DipToCurrent(10), DipToCurrent(46))
			Dim imageViewWrapper2 As ImageView
			imageViewWrapper2.Initialize("")
			imageViewWrapper2.Gravity = 119
			panelWrapper.AddView(imageViewWrapper2, i2, DipToCurrent(0), DipToCurrent(30), DipToCurrent(25))
			Return panelWrapper
		End If
	End If
	labelWrapper.Text = vLst4.Get(Main.vCur9.Position)
	If (labelWrapper.Text.StartsWith("+ ") Or labelWrapper.Text.StartsWith("- ")) And labelWrapper.Text.Length > 2 Then
		labelWrapper.Text = labelWrapper.Text.Replace("+ ", "").Replace("- ", "")
	End If
	vObjectToString = vLst3.Get(Main.vCur9.Position)
	If vObjectToString.Trim <> "" Then
	End If
	labelWrapper.Text = modfunstr.left(labelWrapper.Text, 50)
	list2 = vLst2
	If list2.Get(Main.vCur9.Position) = "" Then
	End If
	panelWrapper.AddView(labelWrapper, i2, DipToCurrent(0), d, i)
	panelWrapper.AddView(labelWrapper2, DipToCurrent(330), DipToCurrent(0), DipToCurrent(10), DipToCurrent(46))
	Dim imageViewWrapper22 As ImageView
	imageViewWrapper22.Initialize("")
	imageViewWrapper22.Gravity = 119
	panelWrapper.AddView(imageViewWrapper22, i2, DipToCurrent(0), DipToCurrent(30), DipToCurrent(25))
	Return panelWrapper
End Sub

Sub Sub008
	BtnHideSearch.Visible = True
	vChr1 = ""
End Sub

Sub Sub009(str As String, i As Int) As Panel
	Dim vGetString As String = vCur2.GetString("descrizione")
	Dim cSBuilder As CSBuilder
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = -1
	Try
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("buttonDel")
		imageViewWrapper.Visible = True
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "006.png")
		Dim labelWrapper As Label
		labelWrapper.Initialize("BtnVar")
		labelWrapper.Gravity = Bit.Or(16, 17)
		labelWrapper.TextSize = 20
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = mod1.Sub155(-3355444, 25)
		Dim str2 As String = ""
		Dim doubleValue As Double = vCur2.GetDouble("Sel")
		If doubleValue = 0.5 Then
			str2 = "1/2   "
		Else If doubleValue = 0.3333 Then
			str2 = "1/3   "
		Else If doubleValue = 0.25 Then
			str2 = "1/4   "
		Else If doubleValue > 0.98 Then
			str2 = "1/1   "
		Else If doubleValue = 0.6666 Then
			str2 = "2/3   "
		Else If doubleValue = 0.75 Then
			str2 = "3/4   "
		End If
		If vBln1 And str2 = "" And NoLimite.Enabled Then
			NoLimite.Checked = True
		End If
		If vGetString.Trim.StartsWith("1/") Or vGetString.Trim.StartsWith("2/") Or vGetString.Trim.StartsWith("3/") Then
			str2 = ""
		End If
		If NoLimite.Checked Then
			str2 = ""
		End If
		cSBuilder.Initialize.Size(20).Append(str2 & vGetString).Pop
		If vCur2.GetString("memo") <> "" Then
			cSBuilder.Size(16).Color(-15504896).Append(CRLF & vCur2.GetString("memo"))
		End If
		labelWrapper.Text = cSBuilder.PopAll
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("")
		labelWrapper2.Text = str
		labelWrapper2.Visible = False
		panelWrapper.AddView(labelWrapper, DipToCurrent(2), DipToCurrent(2), PerXToCurrent(46), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(48), DipToCurrent(2), PerXToCurrent(12), DipToCurrent(46))
		panelWrapper.AddView(labelWrapper2, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub010(str As String, str2 As String, i As Int) As Panel
	Dim i2 As Int = 0
	mod1.vStr2 = "Sub CreateListItem2(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = -1
	Try
		Dim labelWrapper As Label
		labelWrapper.Initialize("btnAdd")
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.Text = str2
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = mod1.Sub155(-1, 25)
		If str Mod 4 = 1 Then
			i2 = PerXToCurrent(26)
		Else If str Mod 4 = 2 Then
			i2 = PerXToCurrent(50)
		Else If str Mod 4 = 3 Then
			i2 = PerXToCurrent(74)
		Else If str Mod 4 = 0 Then
			i2 = PerXToCurrent(2)
		End If
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("")
		labelWrapper2.Text = str
		labelWrapper2.Visible = False
		If vLst1.Get(Main.vCur10.Position) <> "" Then
			labelWrapper.Background = mod1.Sub155(-16711936, 25)
		End If
		panelWrapper.AddView(labelWrapper, i2, DipToCurrent(2), PerXToCurrent(24), i)
		panelWrapper.AddView(labelWrapper2, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub011(str As String, str2 As String, i As Int, panelWrapper As Panel)
	Dim i2 As Int = 0
	mod1.vStr2 = "Sub CreateListItem2(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Try
		Dim labelWrapper As Label
		labelWrapper.Initialize("btnAdd")
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.Text = str2
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = mod1.Sub155(-1, 25)
		If str Mod 4 = 1 Then
			i2 = PerXToCurrent(26)
		Else If str Mod 4 = 2 Then
			i2 = PerXToCurrent(50)
		Else If str Mod 4 = 3 Then
			i2 = PerXToCurrent(74)
		Else If str Mod 4 = 0 Then
			i2 = PerXToCurrent(2)
		End If
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("")
		labelWrapper2.Text = str
		labelWrapper2.Visible = False
		If vLst1.Get(Main.vCur10.Position) <> "" Then
			labelWrapper.Background = mod1.Sub155(-16711936, 25)
		End If
		panelWrapper.AddView(labelWrapper, i2, DipToCurrent(2), PerXToCurrent(24), i)
		panelWrapper.AddView(labelWrapper2, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub012(str As String, str2 As String, i As Int) As Panel
	Dim exc As Exception
	Dim panelWrapper As Panel
	mod1.vStr2 = "CreateListItemAnag"
	Try
		Dim panelWrapper2 As Panel
		Try
			panelWrapper2.Initialize("")
			panelWrapper2.Color = 0
			Return Sub007(str, str2, i, panelWrapper2)
		Catch
			panelWrapper = panelWrapper2
			exc = e
			mod1.Sub217(LastException.Message)
			Return panelWrapper
		End Try
	Catch
		exc = e2
		panelWrapper = Null
	End Try
End Sub

Sub Sub013(str As String, str2 As String, i As Int, panelWrapper As Panel)
	mod1.vStr2 = "CreateListItemAnag"
	Sub007(str, str2, i, panelWrapper)
End Sub

Sub Sub014
	mod1.vStr2 = "Sub ElabVariazioni"
	Try
		vLst2.Clear
		vLst3.Clear
		vLst4.Clear
		vMap2.Clear
		vLst1.Clear
		vMap1.Initialize
		Dim rowCount As Int = Main.vCur9.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			Main.vCur9.Position = i
			vLst2.Add("")
			vLst3.Add("")
			vLst4.Add(Main.vCur9.GetString("descrizione"))
			vLst1.Add(Main.vCur9.GetString("Style"))
		Next
		Main.vCur9.Position = 0
		vBln3 = False
		TB1.Checked = False
		TB2.Checked = False
		TB3.Checked = False
		TConfermaV.Enabled = True
		lblTotaleV.Text = "Totale Articolo: 0.00 €"
		lblTotaleV.Tag = "0_OK"
		Activity.Title = "VARIAZIONI PER " & vCur2.GetString("descrizione")
		P_List2V.Top = PerYToCurrent(10)
		P_List2V.Height = PerYToCurrent(80)
		vcustomlistviewold3.Sub013(P_List2V.Height - PerYToCurrent(5))
		vMap3.Initialize
		Sub017(-1)
		If Main.vCur9.RowCount > 0 Then
			Main.vCur9.Position = 0
			vcustomlistviewold3.Sub012(0)
		End If
		PVariazioni.SetVisibleAnimated(300, True)
		mod1.Sub161(PVariazioni, 7)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub015(str As String)
	mod1.vStr2 = "Sub loadLayout(mLayout As String)"
	Try
		Dim numberOfViews As Int
		For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
			Activity.RemoveViewAt(numberOfViews)
		Next
		Activity.LoadLayout(str)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub NoLimite_CheckedChange(z As Boolean)
	If vcustomlistviewold1.Sub008 > 0 Then
		Dim vObjectToCharSequence As Object = "Non possibile con articoli selezionati"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		NoLimite.Checked = Not(z)
		Return
	End If
	Consolida.Visible = Not(z)
	If z Then
		vcustomlistviewold1.Sub015(0)
		vcustomlistviewold1.Sub013(PerYToCurrent(34))
	Else
		vcustomlistviewold1.Sub015(PerYToCurrent(18))
		vcustomlistviewold1.Sub013(PerYToCurrent(18))
	End If
End Sub

Sub PVariazioni_Click
End Sub

Sub Sub016(i As Int, z As Boolean)
	Dim i2 As Int = 0
	mod1.vStr2 = "refill166(FromRow As Int) As Boolean"
	Try
		vcustomlistviewold2.Sub004
		If Main.vCur10.RowCount > 0 Then
			If z Then
				vLst1.Clear
			End If
			Dim rowCount As Int = Main.vCur10.RowCount - 1
			Dim i3 As Int
			For i3 = 0 To rowCount
				Main.vCur10.Position = i3
				If z Then
					vLst1.Add(Main.vCur10.GetString("Style"))
				End If
				If (i3 + 1) Mod 4 = 1 Then
					i2 = i2 + 1
					Dim vNumberToString As String = i3
					Dim vTmp As Panel = Sub010(vNumberToString, Main.vCur10.GetString("descrizione"), DipToCurrent(70))
					Dim vDipToCurrent As Int = DipToCurrent(70)
					vcustomlistviewold2.Sub001(vTmp, vDipToCurrent, Main.vCur10.GetString("descrizione"))
				Else
					Dim getpanel As Panel = vcustomlistviewold2.getpanel(i2 - 1)
					Dim vNumberToString2 As String = i3
					Sub011(vNumberToString2, Main.vCur10.GetString("descrizione"), DipToCurrent(70), getpanel)
				End If
			Next
			If i >= 0 Then
				vcustomlistviewold2.Sub012(i / 4)
				Return
			End If
			vcustomlistviewold2.Sub012(0)
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub017(i As Int)
	Dim i2 As Int = 0
	mod1.vStr2 = "Refill166"
	Try
		vcustomlistviewold3.Sub004
		Dim rowCount As Int = Main.vCur9.RowCount - 1
		Dim i3 As Int
		For i3 = 0 To rowCount
			Main.vCur9.Position = i3
			If (i3 + 1) Mod (Main.v_colonnevarianti + 4) = 1 Then
				i2 = i2 + 1
				Dim vNumberToString As String = i3
				Dim vGetString As String = Main.vCur9.GetString("descrizione")
				Dim vTmp As Panel = Sub012(vNumberToString, vGetString, Main.v_altezzavariazioni)
				vcustomlistviewold3.Sub001(vTmp, Main.v_altezzavariazioni, Main.vCur9.GetString("descrizione"))
			Else
				Dim getpanel As Panel = vcustomlistviewold3.getpanel(i2 - 1)
				Dim vNumberToString2 As String = i3
				Dim vGetString2 As String = Main.vCur9.GetString("descrizione")
				Sub013(vNumberToString2, vGetString2, Main.v_altezzavariazioni, getpanel)
			End If
		Next
		If i >= 0 Then
			Main.vCur9.Position = i
			vcustomlistviewold3.Sub012(i)
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub018
	mod1.vStr2 = "RefillList()"
	Try
		vcustomlistviewold1.Sub004
		Dim cursorWrapper As Cursor
		vCur2 = Main.vSql1.ExecQuery("Select * from tmpfraziona")
		If vCur2.RowCount > 0 Then
			Dim rowCount As Int = vCur2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				vCur2.Position = i
				vcustomlistviewold1.Sub001(Sub009(i, DipToCurrent(60)), DipToCurrent(60), vCur2.GetString("descrizione"))
			Next
			vcustomlistviewold1.Sub012(vCur2.RowCount - 1)
		End If
		Sub006()
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub019
	mod1.vStr2 = "SalvaRecord()"
	Try
		If Main.v_frazionaconimporto > 0 Then
			If Main.vSql1.ExecQuerySingleResult("Select  CASE WHEN  round(sum(sel),4)  is null then 0 else round(sum(sel),4) end as tot from tmpfraziona") < 0.98 Then
				vBln2 = True
				Dim vObjectToCharSequence As Object = "Completare la composizione."
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				vBln2 = False
				Return
			End If
		End If
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from tmpfraziona")
		If cursorWrapper2.RowCount > 0 Then
			vDbl3 = 0
			Main.vSql1.ExecNonQuery("delete from Ventmp where substr(codice,1,2) ='ww' and totcre='" & vCur1.GetString("totcre") & "'")
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				Dim str As String = ""
				Dim doubleValue As Double = cursorWrapper2.GetDouble("Sel")
				If doubleValue = 0.5 Then
					str = "1/2   "
				Else If doubleValue = 0.3333 Then
					str = "1/3   "
				Else If doubleValue = 0.25 Then
					str = "1/4   "
				Else If doubleValue > 0.98 Then
					str = "1/1   "
				Else If doubleValue = 0.6666 Then
					str = "2/3   "
				Else If doubleValue = 0.75 Then
					str = "3/4   "
				End If
				If cursorWrapper2.GetString("descrizione").Trim.StartsWith("1/") Or cursorWrapper2.GetString("descrizione").Trim.StartsWith("2/") Or cursorWrapper2.GetString("descrizione").Trim.StartsWith("3/") Then
					str = ""
				End If
				If NoLimite.Checked Then
					str = ""
				End If
				Dim str2 As String = ""
				If vMap1.ContainsKey(i) Then
					str2 = vMap1.Get(i)
				End If
				Sub001(cursorWrapper2, vCur1.GetString("qta"), vCur1.GetString("totcre"), str & cursorWrapper2.GetString("descrizione").Trim, "", str2)
			Next
			If Main.v_valorizzazioneprezzofrazione = 1 Then
				Dim cursorWrapper3 As Cursor
				Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select codint,chiave,qta,importo from Ventmp where lower(substr(codice,1,2))='ww' and chiave <>" & vCur1.GetString("chiave") & " AND totcre ='" & vCur1.GetString("totcre") & "'")
				Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount2
					cursorWrapper4.Position = i2
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from tmpfraziona where codice = '" & SmartStringFormatter("", cursorWrapper4.GetString("codint")) & "'") > 0 Then
						Dim parseDouble As Double = Main.vSql1.ExecQuerySingleResult("Select Sel from tmpfraziona where codice = '" & SmartStringFormatter("", cursorWrapper4.GetString("codint")) & "'")
						Dim vRound2 As Double = Round2((parseDouble * vDbl3 + Main.vSql1.ExecQuerySingleResult("Select ImportoV from tmpfraziona where codice = '" & SmartStringFormatter("", cursorWrapper4.GetString("codint")) & "'")) * cursorWrapper4.GetInt("qta"), 2)
						Main.vSql1.ExecNonQuery("update Ventmp set prezzov=" & Round2(vRound2 / cursorWrapper4.GetInt("qta"), 2) & " , importo = " & vRound2 & "  where chiave =" & cursorWrapper4.GetString("chiave"))
					End If
				Next
				cursorWrapper4.Close
			End If
			Main.vSql1.ExecNonQuery("update Ventmp set importo2 = (Select Case when sum(importo) Is Null Then 0 Else sum(importo) End from Ventmp where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" & vCur1.GetString("chiave") & " AND totcre ='" & vCur1.GetString("totcre") & "') where chiave =" & vCur1.GetString("chiave"))
		End If
		Activity.Finish
		mod1.Sub198("Main")
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/frmfraziona.java, metodo m3… (riga 2999).
Sub Sub020
	Dim str As String
	Dim d As Double
	Dim i As Int
	Dim f As Float
	mod1.vStr2 = "Sub ShowTotArticolo"
	Dim i2 As Int = 0
	Try
		Dim rowCount As Int = Main.vCur9.RowCount - 1
		Dim d2 As Double = 0
		Dim i3 As Int = 0
		Do While i3 <= rowCount
			Main.vCur9.Position = i3
			Dim vObjectToNumber As Double = IIf(Main.v_checkvarianti, vDbl1, 1)
			Dim vObjectToString As String = vLst2.Get(Main.vCur9.Position)
			Dim f2 As Float = 0
			If vObjectToString.Trim <> "" Then
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select bvar,list1,list2,list3,list4,list5 from anagra where lower(ltrim(rtrim(codint))) = '" & Main.vCur9.GetString("codint") & "'")
				If cursorWrapper2.RowCount > 0 Then
					cursorWrapper2.Position = 0
					f2 = cursorWrapper2.GetDouble("list1") * vObjectToNumber
					i2 = i2 + 1
					If cursorWrapper2.GetInt("bvar") = 1 Then
						If vObjectToString.Trim.ToLowerCase = "-" Then
							f2 = vObjectToNumber * cursorWrapper2.GetDouble("list2")
						Else If vObjectToString.Trim.ToLowerCase = "molto" Then
							If Main.v_listmolto > 0 Then
								Dim doubleValue As Double = cursorWrapper2.GetDouble("list1")
								f2 = vObjectToNumber * Round2(doubleValue * (1 + Main.v_listmolto / 100), 2)
							End If
						Else If vObjectToString.Trim.ToLowerCase = "poco" Then
							If Main.v_listpoco > 0 Then
								Dim doubleValue2 As Double = cursorWrapper2.GetDouble("list1")
								Dim doubleValue3 As Double = cursorWrapper2.GetDouble("list1")
								f2 = Round2(doubleValue2 - doubleValue3 * Main.v_listpoco / 100, 2)
							End If
						End If
					End If
				End If
				cursorWrapper2.Close
				If vBln3 Then
					If vMap4.ContainsKey(Main.vCur9.GetString("codint")) Then
						f = 0
						If Main.v_tipofrazionamentovariazioni <> 3 Then
							d = d2 + Round2(f, Main.v_arrotondav)
							i = i2
						Else
							If Main.v_tipofrazionamentovariazioni <> 1 Then
								Dim d4 As Double = f * vDbl2
								d = d2 + Round2(d4, Main.v_arrotondav)
								i = i2
							End If
						End If
						i3 = i3 + 1
						d2 = d
						i2 = i
					End If
				End If
				f = f2
				If Main.v_tipofrazionamentovariazioni <> 3 Then
				End If
				i3 = i3 + 1
				d2 = d
				i2 = i
			End If
			d = d2
			i = i2
			i3 = i3 + 1
			d2 = d
			i2 = i
		Loop
		If vInt2 > 0 Then
			If vInt2 <= 10 Then
				If i2 > vInt2 Then
					str = "_Superato il numero massimo di variazioni per questo articolo"
					lblTotaleV.Text = "Totale Articolo: " & NumberFormat2(d2, 1, 2, 2, False) & " €"
					lblTotaleV.Tag = d2 & str
					Return
				End If
			Else If vInt2 > 10 And i2 <> vInt2 - 10 Then
				str = "_Devi inserire " & vInt2 - 10 & " variazioni"
				lblTotaleV.Text = "Totale Articolo: " & NumberFormat2(d2, 1, 2, 2, False) & " €"
				lblTotaleV.Tag = d2 & str
				Return
			End If
		End If
		str = "_OK"
		lblTotaleV.Text = "Totale Articolo: " & NumberFormat2(d2, 1, 2, 2, False) & " €"
		lblTotaleV.Tag = d2 & str
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Tannulla_Click
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub tAnnullaV_Click
	PVariazioni.SetVisibleAnimated(300, False)
	Dim vSetBackgroundImageNew As BitmapDrawable = TSplitV.SetBackgroundImageNew(LoadBitmap(File.DirAssets, "checkedwhite.png"))
	vSetBackgroundImageNew.Gravity = 17
	TSplitV.Tag = 0
End Sub

Sub TConferma_Click
	Sub019()
End Sub

Sub TConfermaV_Click
	Sub005()
	Dim vSetBackgroundImageNew As BitmapDrawable = TSplitV.SetBackgroundImageNew(LoadBitmap(File.DirAssets, "checkedwhite.png"))
	vSetBackgroundImageNew.Gravity = 17
	TSplitV.Tag = 0
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

