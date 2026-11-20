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
	Public vBln1 As Boolean
	Public vBln2 As Boolean
End Sub

Sub Globals
	Public Button1 As Button
	Public f1 As CheckBox
	Public f10 As CheckBox
	Public f11 As CheckBox
	Public f12 As CheckBox
	Public f13 As CheckBox
	Public f14 As CheckBox
	Public f15 As CheckBox
	Public f16 As CheckBox
	Public f17 As CheckBox
	Public f2 As CheckBox
	Public f3 As CheckBox
	Public f4 As CheckBox
	Public f5 As CheckBox
	Public f6 As CheckBox
	Public f7 As CheckBox
	Public f8 As CheckBox
	Public f9 As CheckBox
	Public g1 As CheckBox
	Public g2 As CheckBox
	Public g3 As CheckBox
	Public g4 As CheckBox
	Public g5 As CheckBox
	Public lCodice As Label
	Public lPwd As Label
	Public pCodint As EditText
	Public pConferma As Button
	Public pDes As EditText
	Public pLista As Panel
	Public pPlu As Panel
	Public pPwd As EditText
	Public vcustomlistviewold1 As customlistviewold
	Public vCur1 As Cursor
	Public vPnl1 As Panel
	Public vIME1 As IME
	Public g6 As CheckBox
	Public g7 As CheckBox
	Public g8 As CheckBox
	Public g9 As CheckBox
	Public g10 As CheckBox
	Public f19 As CheckBox
	Public f20 As CheckBox
	Public f21 As CheckBox
	Public f22 As CheckBox
	Public f23 As CheckBox
	Public f24 As CheckBox
	Public f25 As CheckBox
	Public PagDefault As Spinner
	Public f26 As CheckBox
	Public f27 As CheckBox
	Public g11 As CheckBox
	Public f28 As CheckBox
	Public f29 As CheckBox
	Public pCodAutomatico As Button
	Public vcustomlistviewold2 As customlistviewold
	Public lblPagina As Label
	Public PnlHide As Panel
	Public lblTitolo As Label
	Public bAttivo As CheckBox
	Public pCashology As Button
	Public f2_2 As CheckBox
	Public f2_3 As CheckBox
	Public f2_1 As CheckBox
	Public f2_4 As CheckBox
	Public f2_5 As CheckBox
	Public f2_6 As CheckBox
	Public f2_7 As CheckBox
	Public f2_8 As CheckBox
	Public f2_9 As CheckBox
	Public f2_10 As CheckBox
	Public f2_11 As CheckBox
	Public f2_12 As CheckBox
	Public f2_13 As CheckBox
	Public f2_14 As CheckBox
	Public f2_15 As CheckBox
	Public f2_16 As CheckBox
	Public f2_17 As CheckBox
	Public f2_18 As CheckBox
	Public f2_19 As CheckBox
	Public f2_20 As CheckBox
	Public f2_21 As CheckBox
	Public f2_22 As CheckBox
	Public f2_23 As CheckBox
	Public f2_24 As CheckBox
	Public f2_25 As CheckBox
	Public Prelievo As CheckBox
	Public Trasferimento As CheckBox
	Public Stato As CheckBox
	Public Inventario As CheckBox
	Public DepositoManuale As CheckBox
	Public SbloccaBanconote As CheckBox
	Public Settings2 As CheckBox
	Public Scambio As CheckBox
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
	vBln2 = False
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			Try
				Sub004("Operatori")
				pCashology.Visible = Main.v_glory = Main.cm_azkoyen
				mod1.Sub165(pCashology)
				mod1.Sub165(pConferma)
				mod1.Sub165(Button1)
				vcustomlistviewold1.Initialize(Me, "clv2")
				vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
				vcustomlistviewold2.vInt3 = Colors.RGB(245, 245, 245)
				pCodAutomatico.Background = mod1.Sub155(-16776961, 25)
				pLista.AddView(vcustomlistviewold1.Sub003, 0, 0, pLista.Width, pLista.Height)
				vcustomlistviewold2.Initialize(Me, "clv22")
				pPlu.AddView(vcustomlistviewold2.Sub003, PerXToCurrent(0), PerYToCurrent(0), PerXToCurrent(50), PerYToCurrent(100) - DipToCurrent(70))
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
				Dim vGetAllViewsRecursive As IterableList = pPlu.GetAllViewsRecursive
				Dim size As Int = vGetAllViewsRecursive.Size
				Dim i2 As Int
				For i2 = 0 To size - 1
					Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i2)
					If concreteViewWrapper Is EditText Or concreteViewWrapper Is CheckBox Or concreteViewWrapper Is Button Or concreteViewWrapper Is TextView Or concreteViewWrapper Is B4ASpinner Then
						If concreteViewWrapper Is Button And Not(concreteViewWrapper Is CheckBox) Then
							Dim buttonWrapper3 As Button = concreteViewWrapper
							mod1.Sub165(buttonWrapper3)
							buttonWrapper3.TextSize = 14
							buttonWrapper3.TextColor = -16777216
							buttonWrapper3.Background = mod1.Sub155(-1, 20)
						Else If concreteViewWrapper Is TextView And Not(concreteViewWrapper Is EditText) And Not(concreteViewWrapper Is CheckBox) Then
							Dim labelWrapper2 As Label = concreteViewWrapper
							labelWrapper2.Gravity = Bit.Or(16, 5)
							labelWrapper2.Text = labelWrapper2.Text & ":  "
							labelWrapper2.Color = 0
							labelWrapper2.TextColor = -16777216
							labelWrapper2.TextSize = 14
						Else If concreteViewWrapper Is EditText Then
							Dim editTextWrapper As EditText = concreteViewWrapper
							editTextWrapper.TextColor = -16777216
							editTextWrapper.TextSize = 14
						Else If concreteViewWrapper Is CheckBox Then
							Dim checkBoxWrapper As CheckBox = concreteViewWrapper
							checkBoxWrapper.TextSize = 14
							checkBoxWrapper.TextColor = -16777216
						Else If concreteViewWrapper Is B4ASpinner Then
							concreteViewWrapper.TextSize = 14
						End If
					End If
				Next
				Sub001()
				pPlu.Background = mod1.Sub155(Colors.RGB(56, 54, 54), 0)
				PnlHide.Background = mod1.Sub155(Colors.RGB(56, 54, 54), 0)
				pLista.Background = mod1.Sub155(Colors.RGB(56, 54, 54), 0)
				mod1.vStr2 = "Activity_Resume"
				vBln1 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from Despagine where codice <100 order by codice")
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim i3 As Int
				For i3 = 0 To rowCount
					cursorWrapper2.Position = i3
					PagDefault.Add(cursorWrapper2.GetString("descrizione"))
				Next
				PagDefault.Add("Lascia invariata")
				PagDefault.Add("Ricerca Tavoli")
				Sub003(0)
				vBln2 = True
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Sub001
	Dim vDipToCurrent As Int = DipToCurrent(60)
	vcustomlistviewold2.Sub001(mod1.Sub048(vDipToCurrent, "Parametri:"), DipToCurrent(1) + vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, lCodice, pCodint), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub046(vDipToCurrent, pDes), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, lPwd, pPwd), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, bAttivo, -1), vDipToCurrent, "")
	Dim list As List
	Dim map As Map
	list.Initialize
	map.Initialize
	Dim numberOfViews As Int = pPlu.NumberOfViews - 1
	Dim i As Int
	For i = 0 To numberOfViews
		If pPlu.GetView(i) Is CheckBox Then
			Dim checkBoxWrapper2 As CheckBox = pPlu.GetView(i)
			If Not(checkBoxWrapper2.Tag = Null) And checkBoxWrapper2.Tag <> "" Then
				list.Add(checkBoxWrapper2.Text)
				map.Put(checkBoxWrapper2.Text, checkBoxWrapper2)
			End If
		End If
	Next
	list.Sort(True)
	Dim size As Int = list.Size - 1
	Dim i2 As Int
	For i2 = 0 To size
		Dim vObjectToString As String = list.Get(i2)
		If map.ContainsKey(vObjectToString) Then
			Dim checkBoxWrapper3 As CheckBox = map.Get(vObjectToString)
			vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, checkBoxWrapper3, -1), vDipToCurrent, "")
		End If
	Next
	If Main.v_glory = Main.cm_gloryvd Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, Prelievo, -1), vDipToCurrent, "")
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, Trasferimento, -1), vDipToCurrent, "")
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, Stato, -1), vDipToCurrent, "")
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, Inventario, -1), vDipToCurrent, "")
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, DepositoManuale, -1), vDipToCurrent, "")
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, SbloccaBanconote, -1), vDipToCurrent, "")
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, Settings2, -1), vDipToCurrent, "")
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, Scambio, -1), vDipToCurrent, "")
	End If
	vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, lblPagina, PagDefault, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pCodAutomatico, -1, "pCodAutomatico"), vDipToCurrent, "")
End Sub

Sub Bhelp_Click
	Dim str As String = ""
	Select Sender.Tag
		Case "pCodAutomatico"
			str = "Il codice inserito verrà utilizzato per il login automatico dell'operatore attraverso barcode o RFID (non inserire il prefisso)."
	End Select
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	mod1.Sub081
End Sub

Sub Button1_Click
	vBln1 = True
	Dim cursorWrapper As Cursor
	Main.vCur3 = Main.vSql1.ExecQuery("Select * from operatori order by codice")
	Main.vCur3.Position = Main.Operatore - 1
	Activity.Finish
	vIME1.HideKeyboard
	mod1.Sub198("Main")
End Sub

Sub Sub002(str As String, str2 As String, i As Int) As Panel
	Dim i2 As Int
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = -16777216
	Try
		If vCur1.GetInt("Attivo") = 0 Then
			i2 = -3355444
		Else
			i2 = -1
		End If
		Dim labelWrapper As Label
		labelWrapper.Initialize("selrow")
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.Text = vCur1.GetString("codice")
		labelWrapper.TextSize = 14
		labelWrapper.TextColor = -16777216
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper.Background = mod1.Sub155(i2, 0)
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("selrow")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.Text = str2
		labelWrapper2.TextSize = 14
		labelWrapper2.Background = mod1.Sub155(i2, 0)
		labelWrapper2.TextColor = -16777216
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("")
		labelWrapper3.Text = str
		labelWrapper3.Visible = False
		panelWrapper.AddView(labelWrapper, PerXToCurrent(0), 0, PerXToCurrent(10), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(10), 0, PerXToCurrent(40), i)
		panelWrapper.AddView(labelWrapper3, DipToCurrent(330), 0, DipToCurrent(10), i)
		If str = 0 Then
			vPnl1 = panelWrapper
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
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

Sub F1_CheckedChange(z As Boolean)
	pConferma.Enabled = True
End Sub

Sub F2_1_CheckedChange(z As Boolean)
	pConferma.Enabled = True
End Sub

Sub Sub003(i As Int)
	mod1.vStr2 = "Sub Init"
	Try
		ProgressDialogShow("Caricamento dati in corso ...")
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("Select * from operatori order by codice")
		vcustomlistviewold1.Sub004
		If vCur1.RowCount > 0 Then
			Dim rowCount As Int = vCur1.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount
				vCur1.Position = i2
				vcustomlistviewold1.Sub001(Sub002(i2, vCur1.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur1.GetString("descrizione"))
			Next
			vcustomlistviewold1.Sub012(i)
			Sub006(i)
			If i = 0 Then
				Sub005(vPnl1)
			End If
		End If
		ProgressDialogHide
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub004(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub PagDefault_ItemClick(i As Int, obj As Object)
	pConferma.Enabled = True
End Sub

Sub pCashology_Click
	Dim z As Boolean
	Dim packageManagerWrapper As PackageManager
	Dim vGetInstalledPackages As List = packageManagerWrapper.GetInstalledPackages
	Dim size As Int = vGetInstalledPackages.Size - 1
	Dim i As Int = 0
	Do While True
		If i > size Then
			z = False
			Exit
		End If
		If vGetInstalledPackages.Get(i) = "ital.cashology" Then
			z = True
			Exit
		End If
		i = i + 1
	Loop
	If z Then
		button1_click()
		Main.vBln15 = True
		Dim vGetApplicationIntent As Intent = packageManagerWrapper.GetApplicationIntent("ital.cashology")
		vGetApplicationIntent.PutExtra("Caller", File.DirDefaultExternal)
		vGetApplicationIntent.PutExtra("CallerLivelli", False)
		StartActivity(vGetApplicationIntent)
		Return
	End If
	Dim vObjectToCharSequence As Object = "Attenzione ... è necessario installare il programma per la gestione operatori Cashology."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/operatori.java, metodo _pcodautomatico_click (riga 1118).
Sub pCodAutomatico_Click
	Dim str As String
	Dim inputDialog As InputDialog
	inputDialog.InputType = 1
	inputDialog.Input = ""
	inputDialog.PasswordMode = False
	inputDialog.Hint = "Codice ..."
	inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = inputDialog.Show("Inserire il codice di ricerca automatica per l'operatore (Max 15 caratteri) ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim input As String = inputDialog.Input
		If input <> "" Then
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice ='" & Main.v_prefissocliente & input & "'") > 0 Then
				Dim vObjectToCharSequence As Object = "Non è possibile utilizzare questo codice in quanto già utilizzato per un cliente"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				input = ""
			End If
		End If
		If input = "" Then
			pCodAutomatico.Text = "Inserire il codice di ricerca automatica per l'operatore "
			pCodAutomatico.Tag = ""
		Else
			If input.StartsWith(Main.v_prefissocliente) Then
				Dim length As Int = input.Length
				If length > Main.v_prefissocliente.Length Then
					str = input.SubString2(Main.v_prefissocliente.Length, input.Length)
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from operatori where codice <> " & pCodint.Text & "  and CodAutomatico ='" & str & "'") <= 0 Then
						Dim vObjectToCharSequence3 As Object = "Non è possibile utilizzare questo codice in quanto già legato ad un altro operatore"
						Dim vObjectToCharSequence4 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
						pCodAutomatico.Text = "Inserire il codice di ricerca automatica per l'operatore "
						pCodAutomatico.Tag = ""
					Else
						Dim vObjectToCharSequence5 As Object = "Indicare se il cambio operatore debba essere temporaneo (fino alla chiusura del documento) o permanente"
						Dim vObjectToCharSequence6 As Object = Main.vStr8
						Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Temporaneo", "", "Permanente", Main.vBmp1)
						If vMsgbox2 = -3 Then
							Dim vObjectToCharSequence7 As Object = "Inserimento codice annullato"
							Dim vObjectToCharSequence8 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
							pCodAutomatico.Text = "Inserire il codice di ricerca automatica per l'operatore "
							pCodAutomatico.Tag = ""
						Else
							If vMsgbox2 = -1 Then
								pCodAutomatico.Text = "Codice di ricerca automatica (temporaneo):" & modfunstr.left(str, 15)
								pCodAutomatico.Tag = modfunstr.left(str, 15) & "_0"
							Else
								If vMsgbox2 = -2 Then
									pCodAutomatico.Text = "Codice di ricerca automatica (permanente):" & modfunstr.left(str, 15)
									pCodAutomatico.Tag = modfunstr.left(str, 15) & "_1"
								End If
							End If
						End If
					End If
				End If
			End If
			str = input
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from operatori where codice <> " & pCodint.Text & "  and CodAutomatico ='" & str & "'") <= 0 Then
			End If
		End If
		pConferma.Enabled = True
	Else
		pCodAutomatico.Text = "Inserire il codice di ricerca automatica per l'operatore "
		pCodAutomatico.Tag = ""
		pConferma.Enabled = True
	End If
	mod1.Sub081
End Sub

Sub pConferma_Click
	If Not(g4.Checked) Then
		Dim str As String = "Select count(*) from operatori where  codice <10 and  substr(funzioni,33,1)='1'"
		If Main.v_opextended Then
			str = "Select count(*) from operatori where   substr(funzioni,33,1)='1'"
		End If
		If Main.vSql1.ExecQuerySingleResult(str) <= 1 Then
			Dim vObjectToCharSequence As Object = "Non è possibile inibire la funzione 'Configura' a tutti gli operatori."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			g4.Checked = True
			mod1.Sub081
			Return
		End If
	End If
	Dim str2 As String = "" & IIf(f2_1.Checked, "1", "0") & IIf(f2_2.Checked, "1", "0") & IIf(f2_3.Checked, "1", "0") & IIf(f2_4.Checked, "1", "0") & IIf(f2_5.Checked, "1", "0") & IIf(f2_6.Checked, "1", "0") & IIf(f2_7.Checked, "1", "0") & IIf(f2_8.Checked, "1", "0") & IIf(f2_9.Checked, "1", "0") & IIf(f2_10.Checked, "1", "0") & IIf(f2_11.Checked, "1", "0") & IIf(f2_12.Checked, "1", "0") & IIf(f2_13.Checked, "1", "0") & IIf(f2_14.Checked, "1", "0") & IIf(f2_15.Checked, "1", "0") & IIf(f2_16.Checked, "1", "0") & IIf(f2_17.Checked, "1", "0") & IIf(f2_18.Checked, "1", "0") & IIf(f2_19.Checked, "1", "0") & IIf(f2_20.Checked, "1", "0") & IIf(f2_21.Checked, "1", "0") & IIf(f2_22.Checked, "1", "0") & IIf(f2_23.Checked, "1", "0") & IIf(f2_24.Checked, "1", "0") & IIf(f2_25.Checked, "1", "0")
	Dim left As String = modfunstr.left(str2 & "11111111111111111111111111111", 30)
	Dim str3 As String = "" & IIf(f1.Checked, "1", "0") & IIf(f2.Checked, "1", "0") & IIf(f3.Checked, "1", "0") & IIf(f4.Checked, "1", "0") & IIf(f5.Checked, "1", "0") & IIf(f6.Checked, "1", "0") & IIf(f7.Checked, "1", "0") & IIf(f8.Checked, "1", "0") & IIf(f9.Checked, "1", "0") & IIf(f10.Checked, "1", "0") & IIf(f11.Checked, "1", "0") & IIf(f12.Checked, "1", "0") & IIf(f13.Checked, "1", "0") & IIf(f14.Checked, "1", "0") & IIf(f15.Checked, "1", "0") & IIf(f16.Checked, "1", "0") & IIf(f17.Checked, "1", "0") & "1" & IIf(f19.Checked, "1", "0") & IIf(f20.Checked, "1", "0") & IIf(f21.Checked, "1", "0") & IIf(f22.Checked, "1", "0") & IIf(f23.Checked, "1", "0") & IIf(f24.Checked, "1", "0") & IIf(f25.Checked, "1", "0") & IIf(f26.Checked, "1", "0") & IIf(f27.Checked, "1", "0") & IIf(f28.Checked, "1", "0") & IIf(f29.Checked, "1", "0") & IIf(g1.Checked, "1", "0") & IIf(g2.Checked, "1", "0") & IIf(g3.Checked, "1", "0") & IIf(g4.Checked, "1", "0") & IIf(g5.Checked, "1", "0") & IIf(g6.Checked, "1", "0") & IIf(g7.Checked, "1", "0") & IIf(g8.Checked, "1", "0") & IIf(g9.Checked, "1", "0") & IIf(g10.Checked, "1", "0") & IIf(g11.Checked, "1", "0")
	pConferma.Enabled = False
	Dim selectedIndex As Int = PagDefault.SelectedIndex + 1
	Dim vSplit() As String = Regex.Split("_", pCodAutomatico.Tag)
	If vSplit.Length > 1 Then
		Main.vSql1.ExecNonQuery("update operatori set Attivo=" & IIf(bAttivo.Checked, "1", "0") & ",CodAutoPermanente=" & vSplit(1) & ", CodAutomatico='" & vSplit(0) & "', pagdefault =" & selectedIndex & ",descrizione='" & pDes.Text.Trim & "',pwd='" & pPwd.Text & "', funzioni2 = '" & left & "', funzioni = '" & str3 & "' where codice = " & vCur1.GetString("codice"))
	Else
		Main.vSql1.ExecNonQuery("update operatori set Attivo=" & IIf(bAttivo.Checked, "1", "0") & ",CodAutoPermanente=0, CodAutomatico='', pagdefault =" & selectedIndex & ",descrizione='" & pDes.Text.Trim & "',pwd='" & pPwd.Text & "', funzioni2 = '" & left & "', funzioni = '" & str3 & "' where codice = " & vCur1.GetString("codice"))
	End If
	If Main.v_glory = Main.cm_gloryvd Then
		Main.vSql1.ExecNonQuery("update OpCM set" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "gPrelievo=" & SmartStringFormatter("", IIf(Prelievo.Checked, "1", "0")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "gTrasferimento=" & SmartStringFormatter("", IIf(Trasferimento.Checked, "1", "0")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "gStato=" & SmartStringFormatter("", IIf(Stato.Checked, "1", "0")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "gInventario=" & SmartStringFormatter("", IIf(Inventario.Checked, "1", "0")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "gDepositoManuale=" & SmartStringFormatter("", IIf(DepositoManuale.Checked, "1", "0")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "gSbloccaBanconote=" & SmartStringFormatter("", IIf(SbloccaBanconote.Checked, "1", "0")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "gSettings2=" & SmartStringFormatter("", IIf(Settings2.Checked, "1", "0")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "gScambio=" & SmartStringFormatter("", IIf(Scambio.Checked, "1", "0")) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "where codice =" & SmartStringFormatter("", vCur1.GetString("codice")) & "")
	End If
	Sub003(vCur1.Position)
	mod1.Sub081
End Sub

Sub pDes_EnterPressed
	vIME1.HideKeyboard
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Trim, 50)
	pConferma.Enabled = True
End Sub

Sub pDes_FocusChanged(z As Boolean)
	If z Then
		vIME1.Initialize("IME")
		pConferma.Enabled = True
		pDes.SelectionStart = pDes.Text.Length
		Return
	End If
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Trim, 50)
End Sub

Sub pDes_TextChanged(str As String, str2 As String)
	If str2.Length > 50 And vBln2 Then
		pDes.Text = str
		pDes.SelectionStart = str.Length
		Return
	End If
End Sub

Sub PnlHide_Click
End Sub

Sub pPwd_EnterPressed
	vIME1.HideKeyboard
	pPwd.Text = modfunstr.left(pPwd.Text.Replace(",", "").Replace("'", "").Trim, 5)
	If pPwd.Text.Trim = "" Then
		pPwd.Text = "11111"
	End If
	pConferma.Enabled = True
End Sub

Sub pPwd_FocusChanged(z As Boolean)
	If z Then
		pConferma.Enabled = True
		vIME1.Initialize("IME")
		Dim editText As EditText = pPwd
		Dim editTextWrapper As EditText = pPwd
		vIME1.SetCustomFilter(editText, 2, "0123456789.")
		pPwd.SelectAll
		pPwd.SelectionStart = pPwd.Text.Length
		Return
	End If
	pPwd.Text = modfunstr.left(pPwd.Text.Replace(",", "").Replace("'", "").Trim, 5)
	If pPwd.Text.Trim = "" Then
		pPwd.Text = "11111"
		Return
	End If
End Sub

Sub pPwd_TextChanged(str As String, str2 As String)
	If str2.Length > 5 Then
		If Not(vBln2) Then
			pPwd.Text = "11111"
			Return
		End If
		pPwd.Text = str
		pPwd.SelectionStart = str.Length
	End If
End Sub

Sub Sub005(concreteViewWrapper As View)
	mod1.vStr2 = "Sub RowSelected(mSender As View)"
	Try
		pConferma.Enabled = False
		vIME1.HideKeyboard
		Sub006(vcustomlistviewold1.Sub007(concreteViewWrapper))
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Selrow_Click
	mod1.vStr2 = "Sub selrow_Click"
	Sub005(Sender)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/operatori.java, metodo m5… (riga 1411).
Sub Sub006(i As Int)
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	Dim z7 As Boolean
	Dim vTmp As Int
	Dim i2 As Int
	Dim i3 As Int
	Dim vTmp_ As Int
	Dim str As String
	vCur1.Position = i
	lblTitolo.Text = "Operatore Selezionato:" & vCur1.GetString("descrizione")
	pCodint.Text = vCur1.GetString("codice")
	pPwd.Text = vCur1.GetString("pwd")
	Dim editTextWrapper As EditText = pPwd
	If vCur1.GetString("codice").Trim <> "1" Then
		If vCur1.GetString("codice") >= 10 Then
		End If
		z = True
		editTextWrapper.Enabled = z
		Dim checkBoxWrapper As CheckBox = bAttivo
		If vCur1.GetString("codice").Trim <> "1" Then
			If vCur1.GetString("codice") >= 10 Then
			End If
			z2 = True
			checkBoxWrapper.Enabled = z2
			bAttivo.Checked = vCur1.GetInt("Attivo") = 1
			Dim checkBoxWrapper2 As CheckBox = g4
			If vCur1.GetString("codice") >= 10 Then
				If Not(Main.v_opextended) Then
					z3 = False
					checkBoxWrapper2.Visible = z3
					Dim checkBoxWrapper3 As CheckBox = g5
					If vCur1.GetString("codice") >= 10 Then
						If Not(Main.v_opextended) Then
							z4 = False
							checkBoxWrapper3.Visible = z4
							Dim spinnerWrapper As Spinner = PagDefault
							If vCur1.GetString("codice") >= 10 Then
								If Not(Main.v_opextended) Then
									z5 = False
									spinnerWrapper.Enabled = z5
									Dim buttonWrapper As Button = pCodAutomatico
									If vCur1.GetString("codice") >= 10 Then
										If Not(Main.v_opextended) Then
											z6 = False
											buttonWrapper.Visible = z6
											Dim panelWrapper As Panel = PnlHide
											If vCur1.GetInt("codice") >= 10 Then
												If Not(Main.v_opextended) Then
													z7 = True
													panelWrapper.Visible = z7
													If pCodAutomatico.Visible Then
														If vCur1.GetString("CodAutomatico") = "" Then
															pCodAutomatico.Text = "Inserire il codice di ricerca automatica per l'operatore "
															pCodAutomatico.Tag = ""
														Else
															pCodAutomatico.Text = "Codice di ricerca automatica (" & IIf(vCur1.GetInt("CodAutoPermanente") = 0, "temporaneo", "permanente") & "):" & vCur1.GetString("CodAutomatico")
															pCodAutomatico.Tag = vCur1.GetString("CodAutomatico") & "_" & vCur1.GetString("CodAutoPermanente")
														End If
													End If
													pCodint.Enabled = False
													pDes.Text = vCur1.GetString("descrizione")
													Dim vGetString As String = vCur1.GetString("funzioni")
													Dim vGetString2 As String = vCur1.GetString("funzioni2")
													vTmp = vcustomlistviewold2.Sub008 - 1
													For i2 = 0 To vTmp
														Dim getpanel As Panel = vcustomlistviewold2.getpanel(i2)
														If getpanel.GetView(0) Is CheckBox Then
															Dim checkBoxWrapper4 As CheckBox = getpanel.GetView(0)
															If Not(checkBoxWrapper4.Tag = Null) And checkBoxWrapper4.Tag <> "" Then
																Dim vObjectToString As String = checkBoxWrapper4.Tag
																If vObjectToString.StartsWith("f") Then
																	vTmp_ = modfunstr.Sub006(vObjectToString.SubString(1))
																	str = vGetString2
																Else
																	vTmp_ = modfunstr.Sub006(vObjectToString)
																	str = vGetString
																End If
																If vTmp_ <> 1000 Then
																	If vGetString.Length < vTmp_ Then
																		checkBoxWrapper4.Checked = False
																	Else
																		checkBoxWrapper4.Checked = str.SubString2(vTmp_ - 1, vTmp_) = "1"
																	End If
																End If
															End If
														End If
													Next
													i3 = Main.v_glory
													If i3 = Main.cm_gloryvd Then
														Dim cursorWrapper As Cursor
														Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from OpCM where codice = " & vCur1.GetString("codice"))
														cursorWrapper2.Position = 0
														Prelievo.Checked = cursorWrapper2.GetInt("gPrelievo") = 1
														Trasferimento.Checked = cursorWrapper2.GetInt("gTrasferimento") = 1
														Stato.Checked = cursorWrapper2.GetInt("gStato") = 1
														Inventario.Checked = cursorWrapper2.GetInt("gInventario") = 1
														DepositoManuale.Checked = cursorWrapper2.GetInt("gDepositoManuale") = 1
														SbloccaBanconote.Checked = cursorWrapper2.GetInt("gSbloccaBanconote") = 1
														Settings2.Checked = cursorWrapper2.GetInt("gSettings2") = 1
														Scambio.Checked = cursorWrapper2.GetInt("gScambio") = 1
														cursorWrapper2.Close
													End If
													If vCur1.GetInt("codice") >= 10 Then
														If Not(Main.v_opextended) Then
															vcustomlistviewold2.Sub012(0)
														End If
													End If
													PagDefault.SelectedIndex = vCur1.GetInt("pagdefault") - 1
													Return
												End If
											End If
											z7 = False
											panelWrapper.Visible = z7
											If pCodAutomatico.Visible Then
											End If
											pCodint.Enabled = False
											pDes.Text = vCur1.GetString("descrizione")
											Dim vGetString3 As String = vCur1.GetString("funzioni")
											Dim vGetString22 As String = vCur1.GetString("funzioni2")
											vTmp = vcustomlistviewold2.Sub008 - 1
											Do While i2 <= vTmp
											Loop
											i3 = Main.v_glory
											If i3 = Main.cm_gloryvd Then
											End If
											If vCur1.GetInt("codice") >= 10 Then
											End If
											PagDefault.SelectedIndex = vCur1.GetInt("pagdefault") - 1
											Return
										End If
									End If
									z6 = True
									buttonWrapper.Visible = z6
									If vCur1.GetInt("codice") >= 10 Then
									End If
									z7 = False
									PnlHide.Visible = z7
									If pCodAutomatico.Visible Then
									End If
									pCodint.Enabled = False
									pDes.Text = vCur1.GetString("descrizione")
									Dim vGetString32 As String = vCur1.GetString("funzioni")
									Dim vGetString222 As String = vCur1.GetString("funzioni2")
									vTmp = vcustomlistviewold2.Sub008 - 1
									Do While i2 <= vTmp
									Loop
									i3 = Main.v_glory
									If i3 = Main.cm_gloryvd Then
									End If
									If vCur1.GetInt("codice") >= 10 Then
									End If
									PagDefault.SelectedIndex = vCur1.GetInt("pagdefault") - 1
									Return
								End If
							End If
							z5 = True
							spinnerWrapper.Enabled = z5
							If vCur1.GetString("codice") >= 10 Then
							End If
							z6 = True
							pCodAutomatico.Visible = z6
							If vCur1.GetInt("codice") >= 10 Then
							End If
							z7 = False
							PnlHide.Visible = z7
							If pCodAutomatico.Visible Then
							End If
							pCodint.Enabled = False
							pDes.Text = vCur1.GetString("descrizione")
							Dim vGetString322 As String = vCur1.GetString("funzioni")
							Dim vGetString2222 As String = vCur1.GetString("funzioni2")
							vTmp = vcustomlistviewold2.Sub008 - 1
							Do While i2 <= vTmp
							Loop
							i3 = Main.v_glory
							If i3 = Main.cm_gloryvd Then
							End If
							If vCur1.GetInt("codice") >= 10 Then
							End If
							PagDefault.SelectedIndex = vCur1.GetInt("pagdefault") - 1
							Return
						End If
					End If
					z4 = True
					checkBoxWrapper3.Visible = z4
					If vCur1.GetString("codice") >= 10 Then
					End If
					z5 = True
					PagDefault.Enabled = z5
					If vCur1.GetString("codice") >= 10 Then
					End If
					z6 = True
					pCodAutomatico.Visible = z6
					If vCur1.GetInt("codice") >= 10 Then
					End If
					z7 = False
					PnlHide.Visible = z7
					If pCodAutomatico.Visible Then
					End If
					pCodint.Enabled = False
					pDes.Text = vCur1.GetString("descrizione")
					Dim vGetString3222 As String = vCur1.GetString("funzioni")
					Dim vGetString22222 As String = vCur1.GetString("funzioni2")
					vTmp = vcustomlistviewold2.Sub008 - 1
					Do While i2 <= vTmp
					Loop
					i3 = Main.v_glory
					If i3 = Main.cm_gloryvd Then
					End If
					If vCur1.GetInt("codice") >= 10 Then
					End If
					PagDefault.SelectedIndex = vCur1.GetInt("pagdefault") - 1
					Return
				End If
			End If
			z3 = True
			checkBoxWrapper2.Visible = z3
			If vCur1.GetString("codice") >= 10 Then
			End If
			z4 = True
			g5.Visible = z4
			If vCur1.GetString("codice") >= 10 Then
			End If
			z5 = True
			PagDefault.Enabled = z5
			If vCur1.GetString("codice") >= 10 Then
			End If
			z6 = True
			pCodAutomatico.Visible = z6
			If vCur1.GetInt("codice") >= 10 Then
			End If
			z7 = False
			PnlHide.Visible = z7
			If pCodAutomatico.Visible Then
			End If
			pCodint.Enabled = False
			pDes.Text = vCur1.GetString("descrizione")
			Dim vGetString32222 As String = vCur1.GetString("funzioni")
			Dim vGetString222222 As String = vCur1.GetString("funzioni2")
			vTmp = vcustomlistviewold2.Sub008 - 1
			Do While i2 <= vTmp
			Loop
			i3 = Main.v_glory
			If i3 = Main.cm_gloryvd Then
			End If
			If vCur1.GetInt("codice") >= 10 Then
			End If
			PagDefault.SelectedIndex = vCur1.GetInt("pagdefault") - 1
			Return
		End If
		z2 = False
		checkBoxWrapper.Enabled = z2
		bAttivo.Checked = vCur1.GetInt("Attivo") = 1
		If vCur1.GetString("codice") >= 10 Then
		End If
		z3 = True
		g4.Visible = z3
		If vCur1.GetString("codice") >= 10 Then
		End If
		z4 = True
		g5.Visible = z4
		If vCur1.GetString("codice") >= 10 Then
		End If
		z5 = True
		PagDefault.Enabled = z5
		If vCur1.GetString("codice") >= 10 Then
		End If
		z6 = True
		pCodAutomatico.Visible = z6
		If vCur1.GetInt("codice") >= 10 Then
		End If
		z7 = False
		PnlHide.Visible = z7
		If pCodAutomatico.Visible Then
		End If
		pCodint.Enabled = False
		pDes.Text = vCur1.GetString("descrizione")
		Dim vGetString322222 As String = vCur1.GetString("funzioni")
		Dim vGetString2222222 As String = vCur1.GetString("funzioni2")
		vTmp = vcustomlistviewold2.Sub008 - 1
		Do While i2 <= vTmp
		Loop
		i3 = Main.v_glory
		If i3 = Main.cm_gloryvd Then
		End If
		If vCur1.GetInt("codice") >= 10 Then
		End If
		PagDefault.SelectedIndex = vCur1.GetInt("pagdefault") - 1
		Return
	End If
	z = False
	editTextWrapper.Enabled = z
	If vCur1.GetString("codice").Trim <> "1" Then
	End If
	z2 = False
	bAttivo.Enabled = z2
	bAttivo.Checked = vCur1.GetInt("Attivo") = 1
	If vCur1.GetString("codice") >= 10 Then
	End If
	z3 = True
	g4.Visible = z3
	If vCur1.GetString("codice") >= 10 Then
	End If
	z4 = True
	g5.Visible = z4
	If vCur1.GetString("codice") >= 10 Then
	End If
	z5 = True
	PagDefault.Enabled = z5
	If vCur1.GetString("codice") >= 10 Then
	End If
	z6 = True
	pCodAutomatico.Visible = z6
	If vCur1.GetInt("codice") >= 10 Then
	End If
	z7 = False
	PnlHide.Visible = z7
	If pCodAutomatico.Visible Then
	End If
	pCodint.Enabled = False
	pDes.Text = vCur1.GetString("descrizione")
	Dim vGetString3222222 As String = vCur1.GetString("funzioni")
	Dim vGetString22222222 As String = vCur1.GetString("funzioni2")
	vTmp = vcustomlistviewold2.Sub008 - 1
	Do While i2 <= vTmp
	Loop
	i3 = Main.v_glory
	If i3 = Main.cm_gloryvd Then
	End If
	If vCur1.GetInt("codice") >= 10 Then
	End If
	PagDefault.SelectedIndex = vCur1.GetInt("pagdefault") - 1
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

