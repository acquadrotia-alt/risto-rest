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
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
	Public vBln2 As Boolean = True
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public vcustomlistviewold1 As customlistviewold
	Public LPrz As Label
	Public lRep As Label
	Public vcustomlistviewold2 As customlistviewold
	Public vcustomlistviewold3 As customlistviewold
	Public pCodint As EditText
	Public pConferma As Button
	Public pDes As EditText
	Public pLista As Panel
	Public pLayout As Spinner
	Public pRep As Button
	Public vCur1 As Cursor
	Public vCur2 As Cursor
	Public vLst1 As List
	Public vLbl1 As Label
	Public vLbl2 As Label
	Public vIME1 As IME
	Public vLst2 As List
	Public vLst3 As List
	Public vLst4 As List
	Public vPnl1 As Panel
	Public PIP As EditText
	Public sStato As Spinner
	Public vMap1 As Map
	Public vLbl3 As Label
	Public vImg1 As ImageView
	Public vImg2 As ImageView
	Public vImg3 As ImageView
	Public vBtn1 As Button
	Public vBtn2 As Button
	Public vBtn3 As Button
	Public vBtn4 As Button
	Public vBtn5 As Button
	Public vBtn6 As Button
	Public vBtn7 As Button
	Public vBtn8 As Button
	Public vBtn9 As Button
	Public vBtn10 As Button
	Public vBtn11 As Button
	Public vBtn12 As Button
	Public vBtn13 As Button
	Public vBtn14 As Button
	Public vBtn15 As Button
	Public vBtn16 As Button
	Public vBtn17 As Button
	Public vBtn18 As Button
	Public vBtn19 As Button
	Public vBtn20 As Button
	Public vBtn21 As Button
	Public vBtn22 As Button
	Public vBtn23 As Button
	Public vBtn24 As Button
	Public vBtn25 As Button
	Public vBtn26 As Button
	Public vBtn27 As Button
	Public cAsporto As CheckBox
	Public cMf As CheckBox
	Public Label1 As Label
	Public cp1 As CheckBox
	Public cp2 As CheckBox
	Public pPlu As Panel
	Public ApriCassetto As CheckBox
	Public RiepTurni As CheckBox
	Public RiepTurniD As CheckBox
	Public TagliaTurno As CheckBox
	Public pCopie As Spinner
	Public Espandi As CheckBox
	Public cTavoli As CheckBox
	Public EscPos As CheckBox
	Public Consolida As CheckBox
	Public riepAT As CheckBox
	Public PnlRep As Panel
	Public LabelCopie As Label
	Public TuttiTurni As CheckBox
	Public NoTurno As CheckBox
	Public NoTaglio As CheckBox
	Public pTavolo As Button
	Public Label2 As Label
	Public LDes As Label
	Public lblTitolo As Label
	Public GroupR As CheckBox
	Public cAsportoS As CheckBox
	Public lblTitle As Label
	Public pnlPersonalizzaPRM As Panel
	Public Righeinit As Spinner
	Public LabelRighe As Label
	Public cBarcodeAsporto As CheckBox
	Public BeepStampante As CheckBox
	Public StampaImmagine As CheckBox
	Public EspandiT As CheckBox
	Public RiepAsportoD As CheckBox
	Public RiepAsporto As CheckBox
	Public cMFWait As CheckBox
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
			mod1.vStr2 = "Activity_Resume"
			Try
				Sub007("ConfStampe")
				PnlRep.Visible = False
				vLst1.Initialize
				Dim vGetAllViewsRecursive As IterableList = pPlu.GetAllViewsRecursive
				Dim size As Int = vGetAllViewsRecursive.Size
				Dim i As Int
				For i = 0 To size - 1
					Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i)
					If concreteViewWrapper Is EditText Or concreteViewWrapper Is CheckBox Or concreteViewWrapper Is Button Or concreteViewWrapper Is TextView Or concreteViewWrapper Is B4ASpinner Then
						If concreteViewWrapper Is Button And Not(concreteViewWrapper Is CheckBox) Then
							Dim buttonWrapper As Button = concreteViewWrapper
							mod1.Sub165(buttonWrapper)
							buttonWrapper.TextSize = 14
							buttonWrapper.TextColor = -16777216
							buttonWrapper.Background = mod1.Sub155(-1, 20)
						Else If concreteViewWrapper Is TextView And Not(concreteViewWrapper Is EditText) And Not(concreteViewWrapper Is CheckBox) Then
							Dim labelWrapper As Label = concreteViewWrapper
							labelWrapper.Gravity = Bit.Or(16, 5)
							labelWrapper.Text = labelWrapper.Text & ":  "
							labelWrapper.Color = 0
							labelWrapper.TextColor = -16777216
							labelWrapper.TextSize = 14
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
				vcustomlistviewold2.Initialize(Me, "clv22")
				pPlu.AddView(vcustomlistviewold2.Sub003, PerXToCurrent(0), PerYToCurrent(0), PerXToCurrent(50), PerYToCurrent(100) - DipToCurrent(70))
				vcustomlistviewold2.Sub020(Colors.RGB(245, 245, 245))
				vcustomlistviewold3.Initialize(Me, "clv32")
				pnlPersonalizzaPRM.AddView(vcustomlistviewold3.Sub003, PerXToCurrent(0), PerYToCurrent(0), PerXToCurrent(50), PerYToCurrent(100) - DipToCurrent(70))
				vcustomlistviewold3.Sub020(Colors.RGB(245, 245, 245))
				Sub006()
				Sub001()
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
				lblTitle.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitle)
				vLst2.Initialize
				vLst2.AddAll(ArrayToList(Array As String("Non Attiva", "Attiva", "Guasta")))
				sStato.AddAll(vLst2)
				vLst3.Initialize
				vLst3.AddAll(ArrayToList(Array As String("Stampa Tipo 1", "Stampa Tipo 2", "Stampa Tipo 3", "Stampa Tipo 4", "Stampa Tipo 5", "Stampa Tipo 6", "Stampa Tipo 7", "Stampa Tipo 8", "Stampa Tipo 9", "Stampa Tipo 10", "Stampa Tipo 11", "Stampa Tipo 12", "Stampa Tipo 13", "Stampa Tipo 14", "Stampa Tipo 15", "Stampa Tipo 16", "Stampa Tipo 17", "Stampa Tipo 18", "Stampa Tipo 19", "Stampa Tipo 20 (Reverse con Spooler)", "Stampa Tipo 21 (Reverse con Spooler)", "Stampa Tipo 22 (Come Tipo 7 ma con intestazione)", "Stampa Tipo 23 (Numero pezzi nel footer e nome cliente nell'intestazione)")))
				pLayout.AddAll(vLst3)
				vLst4.Initialize
				If Main.v_turni Then
					vLst4.AddAll(ArrayToList(Array As String("1", "2 per Asporto , 1 per la gestione tavoli", "3 per Asporto , 1 per la gestione tavoli")))
				Else
					vLst4.AddAll(ArrayToList(Array As String("1", "2", "3")))
				End If
				pCopie.AddAll(vLst4)
				Righeinit.AddAll(ArrayToList(Array As String("Inizia subito la stampa", "Lascia 1 spazio", "Lascia 2 spazi ", "Lascia 3 spazi", "Lascia 4 spazi", "Lascia 5 spazi", "Lascia 6 spazi", "Lascia 7 spazi", "Lascia 8 spazi", "Lascia 9 spazi", "Lascia 10 spazi", "Lascia 11 spazi", "Lascia 12 spazi", "Lascia 13 spazi", "Lascia 14 spazi", "Lascia 15 spazi")))
				vcustomlistviewold1.Initialize(Me, "clv2")
				vcustomlistviewold1.vInt3 = -16776961
				pLista.AddView(vcustomlistviewold1.Sub003, 0, DipToCurrent(0), pLista.Width, pLista.Height)
				vcustomlistviewold1.Sub019(0)
				lblTitolo.Text = "Stampe centri di produzione"
				DoEvents
				vBln1 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				DoEvents
				Sub005()
				mod1.Sub081
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
	vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, LDes, pDes), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, Label1, PIP), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub051(vDipToCurrent, lRep, pRep, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pTavolo, -1, ""), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, LPrz, pLayout, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, Label2, sStato, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, LabelCopie, pCopie, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, LabelRighe, Righeinit, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, cAsporto, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, cAsportoS, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, cBarcodeAsporto, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, Espandi, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, EspandiT, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, cTavoli, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, cp1, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, cp2, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, RiepTurni, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, RiepTurniD, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, RiepAsporto, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, RiepAsportoD, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, TagliaTurno, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, TuttiTurni, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, NoTurno, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, riepAT, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, ApriCassetto, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, BeepStampante, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, StampaImmagine, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, NoTaglio, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, cMf, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, cMFWait, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, GroupR, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, EscPos, -1), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, Consolida, -1), vDipToCurrent, "")
End Sub

Sub Sub002
	Dim vDipToCurrent As Int = DipToCurrent(60)
	vcustomlistviewold3.Sub001(mod1.Sub049(vDipToCurrent, "Personalizza Stampa:", vLbl3), DipToCurrent(1) + vDipToCurrent, "")
	vcustomlistviewold3.Sub001(Sub004(vDipToCurrent, vImg2, vImg1, vImg3), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn1, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn2, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn3, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn4, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn5, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn6, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn7, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn8, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn9, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn10, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn11, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn12, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn13, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn14, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn15, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn16, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn17, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn18, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn19, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn20, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn21, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn22, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn23, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn24, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn25, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn26, -1, ""), vDipToCurrent, "")
	vcustomlistviewold3.Sub001(mod1.Sub045(vDipToCurrent, vBtn27, -1, ""), vDipToCurrent, "")
End Sub

Sub ApriCassetto_CheckedChange(z As Boolean)
	pConferma.Enabled = True
	If z And Not(vBln2) Then
		Dim vObjectToCharSequence As Object = "Attenzione.... Per applicare questa modifica è necessario riavviare il programma."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
End Sub

Sub bChiudiRep_Click
	PnlRep.Visible = False
	vInt1 = 0
	Dim size As Int = vLst1.Size - 1
	Dim i As Int
	For i = 0 To size
		If vLst1.Get(i).Checked Then
			vInt1 = vInt1 + 1
		End If
	Next
	Sub009()
End Sub

Sub Button1_Click
	vBln1 = True
	mod1.Sub124
	Activity.Finish
	mod1.Sub198("Main")
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/confstampe.java, metodo _casporto_checkedchange (riga 1099).
Sub cAsporto_CheckedChange(z As Boolean)
	Dim z2 As Boolean = True
	pConferma.Enabled = True
	Sub009()
	Espandi.Visible = z
	cAsportoS.Visible = z
	If z Then
		If Not(Main.vBln25) Then
		End If
	End If
	z2 = False
	cBarcodeAsporto.Visible = z2
End Sub

Sub cBarcodeAsporto_CheckedChange(z As Boolean)
	pConferma.Enabled = True
	If z And Espandi.Checked Then
		Dim vObjectToCharSequence As Object = "Attenzione.... Questo flag non è attivabile con la stampa tallon attiva."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		cBarcodeAsporto.Checked = False
		Return
	End If
End Sub

Sub cMf_CheckedChange(z As Boolean)
	pConferma.Enabled = True
	PIP.Visible = Not(cMf.Checked)
	Label1.Visible = Not(cMf.Checked)
	cp1.Enabled = Not(z)
	cp2.Enabled = Not(z)
	cMFWait.Visible = z
	ApriCassetto.Enabled = Not(cMf.Checked)
	BeepStampante.Enabled = Not(cMf.Checked)
	StampaImmagine.Enabled = Not(cMf.Checked)
	TuttiTurni.Visible = RiepTurniD.Checked And Not(cMf.Checked)
	pTavolo.Visible = Not(cMf.Checked)
	If Not(z) Then
		TuttiTurni.Checked = False
		Return
	End If
	vInt2 = 0
	vInt3 = 0
End Sub

Sub cMFWait_CheckedChange(z As Boolean)
	pConferma.Enabled = True
End Sub

Sub Cp1_CheckedChange(z As Boolean)
	pConferma.Enabled = True
	If z Then
		cp2.Checked = False
		Return
	End If
End Sub

Sub Cp2_CheckedChange(z As Boolean)
	pConferma.Enabled = True
	If z Then
		cp1.Checked = False
		Return
	End If
End Sub

Sub Sub003(str As String, str2 As String, i As Int) As Panel
	Dim i2 As Int
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Color = -1
		If vCur2.GetInt("stato") = 0 Then
			i2 = -3355444
		Else If vCur2.GetInt("stato") = 1 Then
			i2 = -9187933
		Else
			i2 = IIf(vCur2.GetInt("stato") = 2, -3440271, -1)
		End If
		Dim labelWrapper As Label
		labelWrapper.Initialize("selrow")
		labelWrapper.Gravity = Bit.Or(16, 17)
		labelWrapper.Text = vCur2.GetString("codice")
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper.Background = mod1.Sub155(i2, 0)
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("selrow")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.Text = str2
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(i2, 0)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("")
		labelWrapper3.Text = str
		labelWrapper3.Visible = False
		panelWrapper.AddView(labelWrapper, PerXToCurrent(0), DipToCurrent(0), PerXToCurrent(8), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(8), DipToCurrent(0), PerXToCurrent(42), i)
		panelWrapper.AddView(labelWrapper3, DipToCurrent(330), DipToCurrent(0), DipToCurrent(10), i)
		If str = 0 Then
			vPnl1 = panelWrapper
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub004(i As Int, imageViewWrapper As ImageView, imageViewWrapper2 As ImageView, imageViewWrapper3 As ImageView) As Panel
	mod1.vStr2 = "CreateListItemFLGeBTN"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Color = -1051728
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(16.33), i)
		panelWrapper.AddView(imageViewWrapper2, PerXToCurrent(16.33), DipToCurrent(0), PerXToCurrent(16.33), i)
		panelWrapper.AddView(imageViewWrapper3, PerXToCurrent(32.66), DipToCurrent(0), PerXToCurrent(16.33), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/confstampe.java, metodo _ctavoli_checkedchange (riga 1264).
Sub cTavoli_CheckedChange(z As Boolean)
	Dim z2 As Boolean = True
	pConferma.Enabled = True
	If z Then
		If Not(Main.v_turni) Then
		End If
	End If
	z2 = False
	EspandiT.Visible = z2
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

Sub Espandi_CheckedChange(z As Boolean)
	Dim checkBoxWrapper As CheckBox = Sender
	If pLayout.SelectedIndex = 13 And z Then
		Dim vObjectToCharSequence As Object = "Attenzione.... Questo flag non è attivabile con la stampa Tipo 14."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Espandi.Checked = False
		EspandiT.Checked = False
	End If
	If checkBoxWrapper.Text.ToLowerCase.Contains("asporto") And z Then
		cBarcodeAsporto.Checked = False
	End If
	pConferma.Enabled = True
End Sub

Sub Sub005
	mod1.vStr2 = "Sub Init"
	Try
		ProgressDialogShow("Caricamento dati in corso ...")
		If Not(Main.vBln16) Then
			Main.vSql1.ExecNonQuery("update confstampe set stato =0  where codice > 2")
			Dim cursorWrapper As Cursor
			vCur2 = Main.vSql1.ExecQuery("Select * from confstampe where codice <=2 order by codice")
		Else
			Dim cursorWrapper2 As Cursor
			vCur2 = Main.vSql1.ExecQuery("Select * from confstampe  order by codice")
		End If
		vcustomlistviewold1.Sub004
		If vCur2.RowCount > 0 Then
			Dim rowCount As Int = vCur2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				vCur2.Position = i
				vcustomlistviewold1.Sub001(Sub003(i, vCur2.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur2.GetString("descrizione"))
			Next
			vcustomlistviewold1.Sub012(0)
			Sub008(vPnl1)
		End If
		ProgressDialogHide
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub006
	vLbl3.Initialize("")
	vImg1.Initialize("ppConferma")
	vImg2.Initialize("ppAnnulla")
	vImg3.Initialize("ppCancella")
	vBtn1.Initialize("parametriP")
	vBtn2.Initialize("parametriP")
	vBtn3.Initialize("parametriP")
	vBtn4.Initialize("parametriP")
	vBtn5.Initialize("parametriP")
	vBtn6.Initialize("parametriP")
	vBtn7.Initialize("parametriP")
	vBtn8.Initialize("parametriP")
	vBtn9.Initialize("parametriP")
	vBtn10.Initialize("parametriP")
	vBtn11.Initialize("parametriP")
	vBtn12.Initialize("parametriP")
	vBtn13.Initialize("parametriP")
	vBtn14.Initialize("parametriP")
	vBtn15.Initialize("parametriP")
	vBtn16.Initialize("parametriP")
	vBtn17.Initialize("parametriP")
	vBtn18.Initialize("parametriP")
	vBtn19.Initialize("parametriP")
	vBtn20.Initialize("parametriP")
	vBtn21.Initialize("parametriP")
	vBtn22.Initialize("parametriP")
	vBtn23.Initialize("parametriP")
	vBtn25.Initialize("parametriP")
	vBtn24.Initialize("parametriP")
	vBtn26.Initialize("parametriP")
	vBtn27.Initialize("parametriP")
	vBtn1.Tag = "HTestataDellaStampa"
	vBtn2.Tag = "HDicituraSalaAsportoTavolo"
	vBtn3.Tag = "FNumeroComandaCoperti"
	vBtn4.Tag = "FMemo"
	vBtn5.Tag = "FPrenotazioneNumero"
	vBtn6.Tag = "FPrenotazioneData"
	vBtn7.Tag = "DStampaSeparatoreTurno"
	vBtn8.Tag = "DStampaAvantiTurno"
	vBtn9.Tag = "DStampaSalaSuTurno"
	vBtn10.Tag = "DStampaTavoloSuTurno"
	vBtn11.Tag = "DStampaConTurniDaAvanzare"
	vBtn12.Tag = "DStampaTavolo"
	vBtn13.Tag = "DStampaSala"
	vBtn14.Tag = "DStampaRigaDettaglio"
	vBtn15.Tag = "DStampaDescrizioneReparto"
	vBtn16.Tag = "DStampaDescrizioneGruppo"
	vBtn17.Tag = "DStampaRigaImporto"
	vBtn18.Tag = "DStampaRigaCancellazione"
	vBtn19.Tag = "DStampaRigaMsgoMnu"
	vBtn20.Tag = "DStampaVariazioniSuFrazione"
	vBtn21.Tag = "DStampaIngredienti"
	vBtn22.Tag = "DStampaVariazioni"
	vBtn23.Tag = "DStampaRiepTurniHead"
	vBtn25.Tag = "DStampaRiepTurniNegativo"
	vBtn24.Tag = "DStampaRiepTurniNormale"
	vBtn26.Tag = "DStampaRiepTurniVariazione"
	vBtn27.Tag = "DStampaRiepTurniMSG"
	vLbl3.Tag = ""
	vBtn1.Text = "Testata della stampa"
	vBtn2.Text = "Dicitura sala asporto o tavolo"
	vBtn3.Text = "Numero comanda o coperti"
	vBtn4.Text = "Memo nel piede della comanda"
	vBtn5.Text = "Numero della prenotazione"
	vBtn6.Text = "Data della prenotazione"
	vBtn7.Text = "Separatore del turno"
	vBtn8.Text = "Avanti turno"
	vBtn9.Text = "Sala all'interno del turno"
	vBtn10.Text = "Tavolo all'interno del turno"
	vBtn11.Text = "Con turni ancora da avanzare"
	vBtn12.Text = "Indicazione del tavolo"
	vBtn13.Text = "Indicazione della sala"
	vBtn14.Text = "Dettaglio articolo"
	vBtn15.Text = "Descrizione Reparto"
	vBtn16.Text = "Descrizione gruppo"
	vBtn17.Text = "Articolo con importo"
	vBtn18.Text = "Cancellazione articolo"
	vBtn19.Text = "Messaggio o Menu"
	vBtn20.Text = "Variazioni su frazionato"
	vBtn21.Text = "Ingredienti"
	vBtn22.Text = "Variazioni"
	vBtn23.Text = "Riepilogo Turni su avanti turno (TESTATA) "
	vBtn24.Text = "Riepilogo Turni su avanti turno (RIGA DI VENDITA) "
	vBtn26.Text = "Riepilogo Turni su avanti turno (VARIAZIONE) "
	vBtn25.Text = "Riepilogo Turni su avanti turno (IMPORTO NEGATIVO) "
	vBtn27.Text = "Riepilogo Turni su avanti turno (MESSAGGIO O MENU') "
	vLbl3.TextColor = -16777216
	vBtn1.TextColor = -16777216
	vBtn2.TextColor = -16777216
	vBtn3.TextColor = -16777216
	vBtn4.TextColor = -16777216
	vBtn5.TextColor = -16777216
	vBtn6.TextColor = -16777216
	vBtn7.TextColor = -16777216
	vBtn8.TextColor = -16777216
	vBtn9.TextColor = -16777216
	vBtn10.TextColor = -16777216
	vBtn11.TextColor = -16777216
	vBtn12.TextColor = -16777216
	vBtn13.TextColor = -16777216
	vBtn14.TextColor = -16777216
	vBtn15.TextColor = -16777216
	vBtn16.TextColor = -16777216
	vBtn17.TextColor = -16777216
	vBtn18.TextColor = -16777216
	vBtn19.TextColor = -16777216
	vBtn20.TextColor = -16777216
	vBtn21.TextColor = -16777216
	vBtn22.TextColor = -16777216
	vBtn23.TextColor = -16777216
	vBtn25.TextColor = -16777216
	vBtn24.TextColor = -16777216
	vBtn26.TextColor = -16777216
	vBtn27.TextColor = -16777216
	vImg2.SetBackgroundImageNew(LoadBitmap(File.DirAssets, "014.png"))
	vImg3.SetBackgroundImageNew(LoadBitmap(File.DirAssets, "006.png"))
	vImg1.SetBackgroundImageNew(LoadBitmap(File.DirAssets, "012.png"))
	vImg1.Gravity = 17
	vImg3.Gravity = 17
	vImg2.Gravity = 17
	Sub002()
End Sub

Sub Sub007(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub Ltutti_Click
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub Parametrip_Click
	Dim vNumberToString As String
	Dim str As String
	Dim str2 As String
	Dim str3 As String
	Dim str4 As String
	Dim str5 As String
	Dim str6 As String
	Dim str7 As String
	Dim buttonWrapper As Button = Sender
	Dim vObjectToString As String = buttonWrapper.Tag
	Dim map As Map
	map.Initialize
	map.Put("Font a dimensione ridotta", False)
	map.Put("Grassetto", False)
	map.Put("Doppia altezza", False)
	map.Put("Doppia larghezza", False)
	map.Put("Corsivo", False)
	map.Put("Sottolineato", False)
	map.Put("Reverse", False)
	map.Put("Non Visibile", False)
	If vMap1.Size > 0 And vMap1.ContainsKey(vObjectToString) Then
		Dim vObjectToString2 As String = vMap1.Get(vObjectToString)
		If vObjectToString2.Length >= 7 Then
			map.Put("Font a dimensione ridotta", vObjectToString2.CharAt(0) = "1")
			map.Put("Grassetto", vObjectToString2.CharAt(1) = "1")
			map.Put("Doppia altezza", vObjectToString2.CharAt(2) = "1")
			map.Put("Doppia larghezza", vObjectToString2.CharAt(3) = "1")
			map.Put("Corsivo", vObjectToString2.CharAt(4) = "1")
			map.Put("Sottolineato", vObjectToString2.CharAt(5) = "1")
			map.Put("Reverse", vObjectToString2.CharAt(6) = "1")
			If vObjectToString2.Length = 7 Then
				map.Put("Non Visibile", True)
			Else
				map.Put("Non Visibile", vObjectToString2.CharAt(7) = "1")
			End If
		End If
	End If
	InputMap(map, "Modifica :" & buttonWrapper.Text)
	If map.Get("Font a dimensione ridotta") Then
		vNumberToString = "1"
	Else
		vNumberToString = 0
	End If
	If map.Get("Grassetto") Then
		str = vNumberToString & "1"
	Else
		str = vNumberToString & "0"
	End If
	If map.Get("Doppia altezza") Then
		str2 = str & "1"
	Else
		str2 = str & "0"
	End If
	If map.Get("Doppia larghezza") Then
		str3 = str2 & "1"
	Else
		str3 = str2 & "0"
	End If
	If map.Get("Corsivo") Then
		str4 = str3 & "1"
	Else
		str4 = str3 & "0"
	End If
	If map.Get("Sottolineato") Then
		str5 = str4 & "1"
	Else
		str5 = str4 & "0"
	End If
	If map.Get("Reverse") Then
		str6 = str5 & "1"
	Else
		str6 = str5 & "0"
	End If
	If map.Get("Non Visibile") Then
		str7 = str6 & "1"
	Else
		str7 = str6 & "0"
	End If
	vMap1.Put(vObjectToString, str7)
	buttonWrapper.Background = mod1.Sub155(-7802474, 25)
End Sub

Sub Parametrip_LongClick
	Dim buttonWrapper As Button = Sender
	Dim vObjectToString As String = buttonWrapper.Tag
	If vMap1.Size > 0 And vMap1.ContainsKey(vObjectToString) Then
		buttonWrapper.Background = mod1.Sub155(-1, 25)
		vMap1.Remove(vObjectToString)
		Return
	End If
End Sub

Sub pCFGStampe_Click
	If Not(pnlPersonalizzaPRM.Visible) Then
		Dim list As List
		list.Initialize2(ArrayToList(Array As String("Stampa Tipo 1", "Stampa Tipo 2", "Stampa Tipo 3", "Stampa Tipo 4", "Stampa Tipo 5", "Stampa Tipo 6", "Stampa Tipo 7", "Stampa Tipo 8", "Stampa Tipo 9", "Stampa Tipo 10", "Stampa Tipo 11", "Stampa Tipo 12", "Stampa Tipo 13", "Stampa Tipo 14", "Stampa Tipo 15", "Stampa Tipo 16", "Stampa Tipo 17", "Stampa Tipo 18", "Stampa Tipo 19", "Stampa Tipo 20 (Reverse con Spooler)", "Stampa Tipo 21 (Reverse con Spooler)", "Stampa Tipo 22 (Come Tipo 7 ma con intestazione)", "Stampa Tipo 23 (Numero pezzi nel footer e nome cliente nell'intestazione)")))
		Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il tipo stampa da modificare")
		If vInputList1 >= 0 Then
			Dim vGetAllViewsRecursive As IterableList = pnlPersonalizzaPRM.GetAllViewsRecursive
			Dim size As Int = vGetAllViewsRecursive.Size
			Dim i As Int
			For i = 0 To size - 1
				Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i)
				If concreteViewWrapper Is Button Then
					Dim buttonWrapper As Button = concreteViewWrapper
					If buttonWrapper.Tag <> "N" Then
						buttonWrapper.Background = mod1.Sub155(-1, 25)
					End If
				End If
			Next
			vLbl3.Text = "Personalizza stampa " & list.Get(vInputList1)
			vLbl3.Tag = "LayoutStampaTipo" & vInputList1 + 1 & ".cfg"
			pnlPersonalizzaPRM.Visible = True
			If File.Exists(File.DirDefaultExternal, "LayoutStampaTipo" & vInputList1 + 1 & ".cfg") Then
				vMap1 = File.ReadMap(File.DirDefaultExternal, "LayoutStampaTipo" & vInputList1 + 1 & ".cfg")
				If vMap1.Size > 0 Then
					Dim vGetAllViewsRecursive2 As IterableList = pnlPersonalizzaPRM.GetAllViewsRecursive
					Dim size2 As Int = vGetAllViewsRecursive2.Size
					Dim i2 As Int
					For i2 = 0 To size2 - 1
						Dim concreteViewWrapper2 As View = vGetAllViewsRecursive2.Get(i2)
						If concreteViewWrapper2 Is Button Then
							Dim buttonWrapper2 As Button = concreteViewWrapper2
							If vMap1.ContainsKey(buttonWrapper2.Tag) Then
								buttonWrapper2.Background = mod1.Sub155(-7802474, 25)
							End If
						End If
					Next
				End If
			Else
				vMap1.Initialize
			End If
			Return
		End If
	End If
	pnlPersonalizzaPRM.Visible = False
End Sub

Sub pConferma_Click
	Dim i As Int
	mod1.vStr2 = "Sub pConferma_Click"
	Try
		vIME1.HideKeyboard
		If pDes.Text = "" Then
			ToastMessageShow("Inserire una descrizione per l'articolo", True)
		Else
			If Not(mod1.Sub129(PIP.Text)) And Not(cMf.Checked) Then
				ToastMessageShow("Inserire un indirizzo ip valido", True)
			Else If cAsporto.Checked And vLst1.Size = 0 Then
				ToastMessageShow("Selezionare i Reparti da attivare", True)
			Else
				Main.vSql1.ExecNonQuery("update confstampe set indice =0 where codice ='" & pCodint.Text & "'")
				If Not(cMf.Checked) Then
					Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select case when max(codice) >0  then max(codice) else 0 end  from confstampe where indice=0 and mf=0 and codice <>'" & pCodint.Text & "' and ip = '" & PIP.Text & "'")
					If parseDouble > 0 Then
						Main.vSql1.ExecNonQuery("update confstampe set indice =" & parseDouble & " where codice ='" & pCodint.Text & "'")
					End If
				End If
				If cp2.Checked Then
					Main.vSql1.ExecNonQuery("update confstampe set cp2 = 0")
					Main.vSql1.ExecNonQuery("update confstampe set cp2 = 1,cp1=0  where codice ='" & pCodint.Text & "'")
				End If
				If cp1.Checked Then
					Main.vSql1.ExecNonQuery("update confstampe set cp1 = 0")
					Main.vSql1.ExecNonQuery("update confstampe set cp1 = 1,cp2=0  where codice ='" & pCodint.Text & "'")
				End If
				If Not(cp1.Checked) And Not(cp2.Checked) Then
					Main.vSql1.ExecNonQuery("update confstampe set cp1 = 0,cp2=0  where codice ='" & pCodint.Text & "'")
				End If
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from confstampe where codice ='" & pCodint.Text & "'") > 0 Then
					If Main.vSql1.ExecQuerySingleResult("Select stato from confstampe where codice ='" & pCodint.Text & "'") <> sStato.SelectedIndex Then
						mod1.Sub215("Stampante " & SmartStringFormatter("", pDes.Text) & " passa allo stato " & SmartStringFormatter("", sStato.SelectedItem) & "")
					End If
				End If
				Main.vSql1.ExecNonQuery("update confstampe set GroupR= " & IIf(GroupR.Checked, "1", "0") & ",tavoli = " & IIf(cTavoli.Checked, "1", "0") & ",StampaImmagine = " & IIf(StampaImmagine.Checked, "1", "0") & ",BeepStampante = " & IIf(BeepStampante.Checked, "1", "0") & ",ApriCassetto = " & IIf(ApriCassetto.Checked, "1", "0") & ",riepAT = " & IIf(riepAT.Checked, "1", "0") & ",atavolo = " & vInt3 & ",datavolo = " & vInt2 & ",notaglio = " & IIf(NoTaglio.Checked, "1", "0") & ",noturno = " & IIf(NoTurno.Checked, "1", "0") & ",TagliaTurno = " & IIf(TagliaTurno.Checked, "1", "0") & ",TuttiTurni = " & IIf(TuttiTurni.Checked, "1", "0") & ",RiepTurniD = " & IIf(RiepTurniD.Checked, "1", "0") & ",RiepTurni = " & IIf(RiepTurni.Checked, "1", "0") & ",RiepAsportoD = " & IIf(RiepAsportoD.Checked, "1", "0") & ",RiepAsporto = " & IIf(RiepAsporto.Checked, "1", "0") & ",mfWait = " & IIf(cMFWait.Checked, "1", "0") & ",mf = " & IIf(cMf.Checked, "1", "0") & ",consolida = " & IIf(Consolida.Checked, "1", "0") & ",escpos = " & IIf(EscPos.Checked, "1", "0") & ",espandiT = " & IIf(EspandiT.Checked, "1", "0") & ",espandi = " & IIf(Espandi.Checked, "1", "0") & ", barcodeA = " & IIf(cBarcodeAsporto.Checked, "1", "0") & ", asportoS = " & IIf(cAsportoS.Checked, "1", "0") & ", asporto = " & IIf(cAsporto.Checked, "1", "0") & ",descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',copie =" & pCopie.SelectedIndex & ",righeinit =" & Righeinit.SelectedIndex & ",layout =" & pLayout.SelectedIndex & ",ip = '" & PIP.Text & "',stato = " & sStato.SelectedIndex & " where codice ='" & pCodint.Text & "'")
				Main.vSql1.ExecNonQuery("delete from filtristampe where codice = '" & pCodint.Text & "'")
				If Main.vMap2.ContainsKey(modfunstr.Sub006(pCodint.Text)) And sStato.SelectedIndex = 1 Then
					Main.vMap2.Remove(modfunstr.Sub006(pCodint.Text))
				End If
				If vLst1.Size > 0 Then
					Dim size As Int = vLst1.Size - 1
					Dim i2 As Int
					For i2 = 0 To size
						Dim checkBoxWrapper As CheckBox = vLst1.Get(i2)
						If checkBoxWrapper.Checked Then
							Main.vSql1.ExecNonQuery("insert into filtristampe(codice,reparto,descrizione) values('" & pCodint.Text & "'," & checkBoxWrapper.Tag & ",'" & checkBoxWrapper.Text & "')")
						End If
					Next
				End If
				vLbl1.Text = pDes.Text.Trim
				Dim position As Int = vCur2.Position
				Dim cursorWrapper As Cursor
				vCur2 = Main.vSql1.ExecQuery("Select * from confstampe order by codice")
				vCur2.Position = position
				If vCur2.GetInt("stato") = 0 Then
					i = -3355444
				Else If vCur2.GetInt("stato") = 1 Then
					i = -9187933
				Else
					i = IIf(vCur2.GetInt("stato") = 2, -3440271, -16776961)
				End If
				vLbl1.Background = mod1.Sub155(i, 0)
				vLbl2.Background = mod1.Sub155(i, 0)
			End If
		End If
		pConferma.Enabled = False
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub pCopie_ItemClick(i As Int, obj As Object)
	pConferma.Enabled = True
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
	If str2.Length > 50 Then
		pDes.Text = str
		pDes.SelectionStart = str.Length
		Return
	End If
End Sub

Sub PIP_EnterPressed
	vIME1.HideKeyboard
	pConferma.Enabled = True
End Sub

Sub PIP_FocusChanged(z As Boolean)
	If z Then
		vIME1.Initialize("IME")
		pConferma.Enabled = True
		PIP.SelectionStart = PIP.Text.Length
		Return
	End If
End Sub

Sub PIP_TextChanged(str As String, str2 As String)
	If str2.Length > 50 Then
		PIP.Text = str
		PIP.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pLayout_ItemClick(i As Int, obj As Object)
	If i = 13 And (Espandi.Checked Or EspandiT.Checked) Then
		Dim vObjectToCharSequence As Object = "Attenzione.... Questa stampa non è attivabile con il flag 'Stampa un tallon per ogni prodotto'."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		pLayout.SelectedIndex = 0
	End If
	pConferma.Enabled = True
End Sub

Sub pnlPersonalizzaPRM_Click
End Sub

Sub PnlRep_Click
End Sub

Sub populatespinner
	Dim i As Int
	Dim i2 As Int
	Dim i3 As Int = 1
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		Dim numberOfViews As Int
		For numberOfViews = PnlRep.NumberOfViews - 1 To 0 Step -1
			If PnlRep.GetView(numberOfViews) Is ScrollView Then
				PnlRep.RemoveViewAt(numberOfViews)
			End If
		Next
		Dim scrollViewWrapper As ScrollView
		scrollViewWrapper.Initialize(0)
		PnlRep.AddView(scrollViewWrapper, 0, DipToCurrent(70), PerXToCurrent(100), PerYToCurrent(100) - DipToCurrent(70))
		Dim panel As Panel = scrollViewWrapper.Panel
		vLst1.Clear
		vInt1 = 0
		Dim map As Map
		map.Initialize
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("select reparti.codice,reparti.descrizione from reparti   order by reparti.descrizione")
		Dim rowCount As Int = vCur1.RowCount - 1
		Dim i4 As Int
		For i4 = 0 To rowCount
			DoEvents
			vCur1.Position = i4
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from filtristampe where codice = " & pCodint.Text & " and reparto = " & vCur1.GetString("codice")) > 0 Then
				Dim checkBoxWrapper As CheckBox
				checkBoxWrapper.Initialize("")
				checkBoxWrapper.Text = vCur1.GetString("descrizione")
				checkBoxWrapper.TextColor = -16777216
				checkBoxWrapper.Tag = vCur1.GetInt("codice")
				checkBoxWrapper.Checked = True
				vLst1.Add(checkBoxWrapper)
				panel.AddView(checkBoxWrapper, 0, DipToCurrent(50) * (i3 - 1), PerXToCurrent(100), DipToCurrent(50))
				i2 = i3 + 1
				map.Put(i4, "")
				vInt1 = vInt1 + 1
			Else
				i2 = i3
			End If
			i3 = i2
		Next
		Dim rowCount2 As Int = vCur1.RowCount - 1
		Dim i5 As Int
		For i5 = 0 To rowCount2
			DoEvents
			vCur1.Position = i5
			If Not(map.ContainsKey(i5)) And Not(vCur1.GetString("descrizione").ToLowerCase.StartsWith("reparto ")) Then
				Dim checkBoxWrapper2 As CheckBox
				checkBoxWrapper2.Initialize("")
				checkBoxWrapper2.Text = vCur1.GetString("descrizione")
				checkBoxWrapper2.Tag = vCur1.GetInt("codice")
				checkBoxWrapper2.TextColor = -16777216
				checkBoxWrapper2.Checked = False
				vLst1.Add(checkBoxWrapper2)
				panel.AddView(checkBoxWrapper2, 0, DipToCurrent(50) * (i3 - 1), PerXToCurrent(100), DipToCurrent(50))
				i = i3 + 1
			Else
				i = i3
			End If
			i3 = i
		Next
		Sub009()
		panel.Height = vLst1.Size * DipToCurrent(50)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
		Return
	End Try
End Sub

Sub Ppannulla_Click
	pnlPersonalizzaPRM.Visible = False
End Sub

Sub Ppcancella_Click
	Dim vObjectToCharSequence As Object = "Confermi la cancellazione di tutti i parametri ?"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 <> -1 Then
		Return
	End If
	If vLbl3.Tag <> "" Then
		File.Delete(File.DirDefaultExternal, vLbl3.Tag)
		pnlPersonalizzaPRM.Visible = False
	End If
	pnlPersonalizzaPRM.Visible = False
End Sub

Sub Ppconferma_Click
	If vLbl3.Tag <> "" Then
		File.WriteMap(File.DirDefaultExternal, vLbl3.Tag, vMap1)
		pnlPersonalizzaPRM.Visible = False
	End If
	pnlPersonalizzaPRM.Visible = False
End Sub

Sub pRep_Click
	PnlRep.Visible = True
	pConferma.Enabled = True
End Sub

Sub pTavolo_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = 1
	Dim vShow As Int = numberDialog.Show("Selezionare il numero del tavolo di partenza del filtro:", "Conferma", "Annulla", "Azzera Filtro", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number > 0 Then
			Dim number As Int = numberDialog.Number
			Do While True
				Dim vShow2 As Int = numberDialog.Show("Selezionare il numero del tavolo finale del filtro:", "Conferma", "Annulla", "", Main.vBmp1)
				If vShow2 = -1 And numberDialog.Number >= number Then
					Exit
				End If
				numberDialog.Number = number
			Loop
			Dim number2 As Int = numberDialog.Number
			vInt2 = number
			vInt3 = number2
		Else
			Dim vObjectToCharSequence As Object = "Valore non valido!"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		End If
	Else
		If vShow = -2 Then
			vInt2 = 0
			vInt3 = 0
		End If
	End If
	Sub010()
	pConferma.Enabled = True
End Sub

Sub RiepAsporto_CheckedChange(z As Boolean)
	pConferma.Enabled = True
	RiepAsportoD.Visible = z
	If Not(z) Then
		RiepAsportoD.Checked = False
		Return
	End If
End Sub

Sub RiepAsportoD_CheckedChange(z As Boolean)
	pConferma.Enabled = True
End Sub

Sub RiepTurni_CheckedChange(z As Boolean)
	pConferma.Enabled = True
	RiepTurniD.Visible = z
	TuttiTurni.Visible = RiepTurniD.Checked And Not(cMf.Checked) And z
	If Not(z) Then
		RiepTurniD.Checked = False
		TuttiTurni.Checked = False
		Return
	End If
End Sub

Sub RiepTurniD_CheckedChange(z As Boolean)
	pConferma.Enabled = True
	TuttiTurni.Visible = RiepTurniD.Checked And Not(cMf.Checked)
	If Not(z) Then
		TuttiTurni.Checked = False
		Return
	End If
End Sub

Sub Sub008(concreteViewWrapper As View)
	mod1.vStr2 = "Sub RowSelected(mSender As View)"
	Try
		ProgressDialogShow2("Attendere", False)
		pConferma.Enabled = False
		vIME1.HideKeyboard
		Dim vTmp As Int = vcustomlistviewold1.Sub007(concreteViewWrapper)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		vLbl2 = getpanel.GetView(0)
		vLbl1 = getpanel.GetView(1)
		Sub011(getpanel.GetView(2).Text)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
		Return
	End Try
End Sub

Sub Selrow_Click
	mod1.vStr2 = "Sub selrow_Click"
	Sub008(Sender)
End Sub

Sub Sub009
	pRep.Text = "Reparti Selezionati :" & vInt1
	If cAsporto.Checked And vInt1 = 0 Then
		pRep.Text = "Selezionare i Reparti"
		pRep.Background = mod1.Sub155(-3440271, 0)
		Return
	End If
	pRep.Background = mod1.Sub155(-1, 0)
End Sub

Sub Sub010
	If vInt2 = 0 Then
		pTavolo.Text = "Filtro Tavolo: " & CRLF & "Non è stato impostato nessun filtro legato al tavolo "
		pTavolo.Background = mod1.Sub155(-1, 0)
		Return
	End If
	pTavolo.Text = "Filtro Tavolo:  " & SmartStringFormatter("", CRLF) & "  dal tavolo " & SmartStringFormatter("", vInt2) & " al tavolo " & SmartStringFormatter("", vInt3) & ""
	pTavolo.Background = mod1.Sub155(-3440271, 0)
End Sub

Sub SoloConferma_CheckedChange(z As Boolean)
	pConferma.Enabled = True
End Sub

Sub sStato_ItemClick(i As Int, obj As Object)
	pConferma.Enabled = True
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/confstampe.java, metodo m5… (riga 2354).
Sub Sub011(i As Int)
	Dim z As Boolean
	Dim z2 As Boolean
	Dim i2 As Int
	Dim textColor As Int
	vCur2.Position = i
	lblTitolo.Text = "Stampa Selezionata:" & vCur2.GetString("descrizione")
	pCodint.Text = vCur2.GetString("codice")
	pCodint.Enabled = False
	pDes.Text = vCur2.GetString("descrizione")
	vInt2 = vCur2.GetInt("datavolo")
	vInt3 = vCur2.GetInt("atavolo")
	Sub010()
	CallSubDelayed(Me, "PopulateSpinner")
	pLayout.SelectedIndex = vCur2.GetInt("layout")
	pCopie.SelectedIndex = vCur2.GetInt("copie")
	Righeinit.SelectedIndex = vCur2.GetInt("righeinit")
	PIP.Text = vCur2.GetString("ip")
	cAsporto.Checked = vCur2.GetInt("asporto") = 1
	cAsportoS.Checked = vCur2.GetInt("asportoS") = 1 And cAsporto.Checked
	cAsportoS.Visible = cAsporto.Checked
	cTavoli.Checked = vCur2.GetInt("tavoli") = 1
	cBarcodeAsporto.Checked = vCur2.GetInt("barcodeA") = 1
	Dim checkBoxWrapper As CheckBox = cBarcodeAsporto
	If cAsporto.Checked Then
		If Not(Main.vBln25) Then
			If Not(Main.vBln24) Then
				z = True
				checkBoxWrapper.Visible = z
				Espandi.Visible = vCur2.GetInt("asporto") <> 1
				Espandi.Checked = vCur2.GetInt("espandi") <> 1
				Dim checkBoxWrapper2 As CheckBox = EspandiT
				If vCur2.GetInt("tavoli") = 1 Then
					If Not(Main.v_turni) Then
						If Not(Main.v_sottoconti) Then
							z2 = True
							checkBoxWrapper2.Visible = z2
							EspandiT.Checked = vCur2.GetInt("espandiT") = 1
							EscPos.Checked = vCur2.GetInt("escpos") = 1
							TagliaTurno.Checked = vCur2.GetInt("TagliaTurno") = 1
							NoTurno.Checked = vCur2.GetInt("noturno") = 1
							NoTaglio.Checked = vCur2.GetInt("notaglio") = 1
							Consolida.Checked = vCur2.GetInt("consolida") = 1
							cMf.Checked = vCur2.GetInt("mf") = 1
							cMFWait.Checked = vCur2.GetInt("mfWait") = 1
							cMFWait.Visible = vCur2.GetInt("mf") = 1
							cp1.Checked = vCur2.GetInt("cp1") = 1
							cp2.Checked = vCur2.GetInt("cp2") = 1
							GroupR.Checked = vCur2.GetInt("GroupR") = 1
							RiepTurni.Checked = vCur2.GetInt("RiepTurni") = 1
							RiepAsporto.Checked = vCur2.GetInt("RiepAsporto") = 1
							RiepTurniD.Visible = RiepTurni.Checked
							RiepAsportoD.Visible = RiepAsporto.Checked
							RiepTurniD.Checked = vCur2.GetInt("RiepTurniD") = 1
							RiepAsportoD.Checked = vCur2.GetInt("RiepAsportoD") = 1
							pTavolo.Visible = Not(cMf.Checked)
							TuttiTurni.Visible = Not(RiepTurniD.Checked) And Not(cMf.Checked)
							TuttiTurni.Checked = vCur2.GetInt("TuttiTurni") <> 1 And Not(cMf.Checked)
							riepAT.Checked = vCur2.GetInt("riepAT") = 1
							vBln2 = True
							ApriCassetto.Checked = vCur2.GetInt("ApriCassetto") = 1
							BeepStampante.Checked = vCur2.GetInt("BeepStampante") = 1
							StampaImmagine.Checked = vCur2.GetInt("StampaImmagine") = 1
							vBln2 = False
							PIP.Visible = Not(cMf.Checked)
							Dim editTextWrapper As EditText = PIP
							If vCur2.GetInt("indice") = 0 Then
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from confstampe where ip='" & PIP.Text & "' and indice =1") > 0 Then
									i2 = -65536
									editTextWrapper.TextColor = i2
									PIP.Enabled = True
									textColor = PIP.TextColor
									If textColor = -65536 Then
										PIP.Enabled = False
										ToastMessageShow("Non è possibile modificare l'indirizzo di questa stampante senza prima eliminare il riferimento delle altre stampanti.", False)
									End If
									Label1.Visible = Not(cMf.Checked)
									cp1.Enabled = Not(cMf.Checked)
									cp2.Enabled = Not(cMf.Checked)
									ApriCassetto.Enabled = Not(cMf.Checked)
									BeepStampante.Enabled = Not(cMf.Checked)
									StampaImmagine.Enabled = Not(cMf.Checked)
									sStato.SelectedIndex = vCur2.GetInt("stato")
									vcustomlistviewold3.Sub012(0)
									ProgressDialogHide
									Return
								End If
							End If
							i2 = -16777216
							editTextWrapper.TextColor = i2
							PIP.Enabled = True
							textColor = PIP.TextColor
							If textColor = -65536 Then
							End If
							Label1.Visible = Not(cMf.Checked)
							cp1.Enabled = Not(cMf.Checked)
							cp2.Enabled = Not(cMf.Checked)
							ApriCassetto.Enabled = Not(cMf.Checked)
							BeepStampante.Enabled = Not(cMf.Checked)
							StampaImmagine.Enabled = Not(cMf.Checked)
							sStato.SelectedIndex = vCur2.GetInt("stato")
							vcustomlistviewold3.Sub012(0)
							ProgressDialogHide
							Return
						End If
					End If
				End If
				z2 = False
				checkBoxWrapper2.Visible = z2
				EspandiT.Checked = vCur2.GetInt("espandiT") = 1
				EscPos.Checked = vCur2.GetInt("escpos") = 1
				TagliaTurno.Checked = vCur2.GetInt("TagliaTurno") = 1
				NoTurno.Checked = vCur2.GetInt("noturno") = 1
				NoTaglio.Checked = vCur2.GetInt("notaglio") = 1
				Consolida.Checked = vCur2.GetInt("consolida") = 1
				cMf.Checked = vCur2.GetInt("mf") = 1
				cMFWait.Checked = vCur2.GetInt("mfWait") = 1
				cMFWait.Visible = vCur2.GetInt("mf") = 1
				cp1.Checked = vCur2.GetInt("cp1") = 1
				cp2.Checked = vCur2.GetInt("cp2") = 1
				GroupR.Checked = vCur2.GetInt("GroupR") = 1
				RiepTurni.Checked = vCur2.GetInt("RiepTurni") = 1
				RiepAsporto.Checked = vCur2.GetInt("RiepAsporto") = 1
				RiepTurniD.Visible = RiepTurni.Checked
				RiepAsportoD.Visible = RiepAsporto.Checked
				RiepTurniD.Checked = vCur2.GetInt("RiepTurniD") = 1
				RiepAsportoD.Checked = vCur2.GetInt("RiepAsportoD") = 1
				pTavolo.Visible = Not(cMf.Checked)
				TuttiTurni.Visible = Not(RiepTurniD.Checked) And Not(cMf.Checked)
				TuttiTurni.Checked = vCur2.GetInt("TuttiTurni") <> 1 And Not(cMf.Checked)
				riepAT.Checked = vCur2.GetInt("riepAT") = 1
				vBln2 = True
				ApriCassetto.Checked = vCur2.GetInt("ApriCassetto") = 1
				BeepStampante.Checked = vCur2.GetInt("BeepStampante") = 1
				StampaImmagine.Checked = vCur2.GetInt("StampaImmagine") = 1
				vBln2 = False
				PIP.Visible = Not(cMf.Checked)
				If vCur2.GetInt("indice") = 0 Then
				End If
				i2 = -16777216
				PIP.TextColor = i2
				PIP.Enabled = True
				textColor = PIP.TextColor
				If textColor = -65536 Then
				End If
				Label1.Visible = Not(cMf.Checked)
				cp1.Enabled = Not(cMf.Checked)
				cp2.Enabled = Not(cMf.Checked)
				ApriCassetto.Enabled = Not(cMf.Checked)
				BeepStampante.Enabled = Not(cMf.Checked)
				StampaImmagine.Enabled = Not(cMf.Checked)
				sStato.SelectedIndex = vCur2.GetInt("stato")
				vcustomlistviewold3.Sub012(0)
				ProgressDialogHide
				Return
			End If
		End If
	End If
	z = False
	checkBoxWrapper.Visible = z
	Espandi.Visible = vCur2.GetInt("asporto") <> 1
	Espandi.Checked = vCur2.GetInt("espandi") <> 1
	If vCur2.GetInt("tavoli") = 1 Then
	End If
	z2 = False
	EspandiT.Visible = z2
	EspandiT.Checked = vCur2.GetInt("espandiT") = 1
	EscPos.Checked = vCur2.GetInt("escpos") = 1
	TagliaTurno.Checked = vCur2.GetInt("TagliaTurno") = 1
	NoTurno.Checked = vCur2.GetInt("noturno") = 1
	NoTaglio.Checked = vCur2.GetInt("notaglio") = 1
	Consolida.Checked = vCur2.GetInt("consolida") = 1
	cMf.Checked = vCur2.GetInt("mf") = 1
	cMFWait.Checked = vCur2.GetInt("mfWait") = 1
	cMFWait.Visible = vCur2.GetInt("mf") = 1
	cp1.Checked = vCur2.GetInt("cp1") = 1
	cp2.Checked = vCur2.GetInt("cp2") = 1
	GroupR.Checked = vCur2.GetInt("GroupR") = 1
	RiepTurni.Checked = vCur2.GetInt("RiepTurni") = 1
	RiepAsporto.Checked = vCur2.GetInt("RiepAsporto") = 1
	RiepTurniD.Visible = RiepTurni.Checked
	RiepAsportoD.Visible = RiepAsporto.Checked
	RiepTurniD.Checked = vCur2.GetInt("RiepTurniD") = 1
	RiepAsportoD.Checked = vCur2.GetInt("RiepAsportoD") = 1
	pTavolo.Visible = Not(cMf.Checked)
	TuttiTurni.Visible = Not(RiepTurniD.Checked) And Not(cMf.Checked)
	TuttiTurni.Checked = vCur2.GetInt("TuttiTurni") <> 1 And Not(cMf.Checked)
	riepAT.Checked = vCur2.GetInt("riepAT") = 1
	vBln2 = True
	ApriCassetto.Checked = vCur2.GetInt("ApriCassetto") = 1
	BeepStampante.Checked = vCur2.GetInt("BeepStampante") = 1
	StampaImmagine.Checked = vCur2.GetInt("StampaImmagine") = 1
	vBln2 = False
	PIP.Visible = Not(cMf.Checked)
	If vCur2.GetInt("indice") = 0 Then
	End If
	i2 = -16777216
	PIP.TextColor = i2
	PIP.Enabled = True
	textColor = PIP.TextColor
	If textColor = -65536 Then
	End If
	Label1.Visible = Not(cMf.Checked)
	cp1.Enabled = Not(cMf.Checked)
	cp2.Enabled = Not(cMf.Checked)
	ApriCassetto.Enabled = Not(cMf.Checked)
	BeepStampante.Enabled = Not(cMf.Checked)
	StampaImmagine.Enabled = Not(cMf.Checked)
	sStato.SelectedIndex = vCur2.GetInt("stato")
	vcustomlistviewold3.Sub012(0)
	ProgressDialogHide
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

