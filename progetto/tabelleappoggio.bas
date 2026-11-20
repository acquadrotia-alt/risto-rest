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
	Type tmacro(funzione As Int, qta As Int, valore As String)
	Public vBln1 As Boolean
	Public vStr1 As String
	Public vStr2 As String
	Public vStr3 As String
	Public vBln2 As Boolean
	Public vStr4 As String
	Public vStr5 As String
	Public vBln3 As Boolean
	Public vBln4 As Boolean
	Public vStr6 As String = " order by codice"
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public vcustomlistviewold1 As customlistviewold
	Public LPrz As Label
	Public lRep As Label
	Public pCodint As EditText
	Public pConferma As Button
	Public pDes As EditText
	Public pLista As Panel
	Public pEft As Spinner
	Public LEFT As Label
	Public pPrezzo As EditText
	Public pRep As Spinner
	Public vCur1 As Cursor
	Public vCur2 As Cursor
	Public vLbl1 As Label
	Public vLbl2 As Label
	Public vIME1 As IME
	Public ChkObbligo As CheckBox
	Public vPnl1 As Panel
	Public chkBuonosr As CheckBox
	Public GuadagnoP As EditText
	Public GuadagnoV As EditText
	Public Label1 As Label
	Public Label2 As Label
	Public pPlu As Panel
	Public pIndice As Button
	Public LCopia As Label
	Public pCopia As Spinner
	Public LIP As Label
	Public PIP As EditText
	Public ChkResto As CheckBox
	Public pTA As Spinner
	Public LTA As Label
	Public pIpEft As Button
	Public vcustomlistviewold2 As customlistviewold
	Public lCodice As Label
	Public lblTitolo As Label
	Public pPortaEft As Button
	Public SempreDocFisc As CheckBox
	Public pBuonoComePag As Spinner
	Public lBuono As Label
	Public chkGlory As CheckBox
	Public pWebDes3 As Button
	Public pWebDes4 As Button
	Public pWebDes5 As Button
	Public pWebDes2 As Button
	Public pWebDes1 As Button
	Public vCur3 As Cursor
	Public vDlg1 As InputDialog
	Public vCustomLayoutDialog1 As CustomLayoutDialog
	Public vcustomlistviewold3 As customlistviewold
	Public pnlMenu As Panel
	Public vCur4 As Cursor
	Public vMap1 As Map
	Public vMap2 As Map
	Public vLst1 As List
	Public pImport As Button
	Public chkVincite As CheckBox
	Public InvioWebT As CheckBox
	Public chkScontabile As CheckBox
	Public pNaturaIva As Spinner
	Public lNaturaIva As Label
	Public pRTIva As Spinner
	Public lRTIva As Label
	Public pIvaRT As Button
	Public pTipoPrepagato As Spinner
	Public lTipoPrepatago As Label
	Public pGrpWeb As Button
	Public NumMenu As Button
	Public verificaWeb As CheckBox
	Public PagamentoPalmare As CheckBox
	Public chkGeneraPunti As CheckBox
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
				Sub011("tabelleappoggio")
				pPlu.Visible = False
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
				pIvaRT.Background = mod1.Sub157(0, 0, 1)
				vcustomlistviewold1.Initialize(Me, "clv2")
				vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
				vcustomlistviewold2.vInt3 = Colors.RGB(245, 245, 245)
				vcustomlistviewold2.Initialize(Me, "clv22")
				pPlu.AddView(vcustomlistviewold2.Sub003, PerXToCurrent(0), PerYToCurrent(0), PerXToCurrent(50), PerYToCurrent(100) - DipToCurrent(70))
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
				pIpEft.Background = mod1.Sub155(-16776961, 25)
				pPortaEft.Background = mod1.Sub155(-16776961, 25)
				If Main.vBln25 Then
					pConferma.Visible = False
				End If
				pLista.AddView(vcustomlistviewold1.Sub003, 0, DipToCurrent(0), pLista.Width, pLista.Height)
				DoEvents
				vBln3 = False
				vBln1 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				DoEvents
				Sub010()
				mod1.Sub081
				pPlu.Visible = True
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelleappoggio.java, metodo m6… (riga 676).
Sub Sub001
	Dim vDipToCurrent As Int = DipToCurrent(60)
	vcustomlistviewold2.Sub001(mod1.Sub048(vDipToCurrent, "Parametri:"), DipToCurrent(1) + vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, lCodice, pCodint), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub046(vDipToCurrent, pDes), vDipToCurrent, "")
	If PIP.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, LIP, PIP), vDipToCurrent, "")
	End If
	If pPrezzo.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, LPrz, pPrezzo), vDipToCurrent, "")
	End If
	If GuadagnoP.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, Label1, GuadagnoP), vDipToCurrent, "")
	End If
	If GuadagnoV.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub052(vDipToCurrent, Label2, GuadagnoV), vDipToCurrent, "")
	End If
	If pIndice.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pIndice, -1, ""), vDipToCurrent, "")
	End If
	If pRep.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, lRep, pRep, -1), vDipToCurrent, "")
	End If
	If pCopia.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, LCopia, pCopia, -1), vDipToCurrent, "")
	End If
	If pBuonoComePag.Visible Then
		If Main.vInt24 = Main.d_documentifattura Then
			vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, lBuono, pBuonoComePag, -1), vDipToCurrent, "")
		End If
	End If
	If pTipoPrepagato.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, lTipoPrepatago, pTipoPrepagato, -1), vDipToCurrent, "")
	End If
	If pTA.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, LTA, pTA, -1), vDipToCurrent, "")
	End If
	If ChkObbligo.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, ChkObbligo, -1), vDipToCurrent, "")
	End If
	If chkVincite.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, chkVincite, -1), vDipToCurrent, "")
	End If
	If chkBuonosr.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, chkBuonosr, -1), vDipToCurrent, "")
	End If
	If pBuonoComePag.Visible Then
		If Main.vInt24 <> Main.d_documentifattura Then
			vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, lBuono, pBuonoComePag, -1), vDipToCurrent, "")
		End If
	End If
	If pNaturaIva.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, lNaturaIva, pNaturaIva, -1), vDipToCurrent, "")
	End If
	If pRTIva.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, lRTIva, pRTIva, -1), vDipToCurrent, "")
	End If
	If Main.vInt24 = Main.d_pagamenti Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, PagamentoPalmare, -1), vDipToCurrent, "")
	End If
	If SempreDocFisc.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, SempreDocFisc, -1), vDipToCurrent, "")
	End If
	If chkScontabile.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, chkScontabile, -1), vDipToCurrent, "")
	End If
	If ChkResto.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, ChkResto, -1), vDipToCurrent, "")
	End If
	If chkGeneraPunti.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, chkGeneraPunti, -1), vDipToCurrent, "")
	End If
	If InvioWebT.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, InvioWebT, -1), vDipToCurrent, "")
	End If
	If Main.vInt24 <> Main.d_reparti Then
		If Main.vInt24 <> Main.d_ingredienti Then
			Dim i6 As Int = Main.vInt24
		End If
	End If
	If pGrpWeb.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pGrpWeb, -1, ""), vDipToCurrent, "")
	End If
	If NumMenu.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, NumMenu, -1, ""), vDipToCurrent, "")
	End If
	If verificaWeb.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, verificaWeb, -1), vDipToCurrent, "")
	End If
	vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pWebDes1, -1, ""), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pWebDes2, -1, ""), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pWebDes3, -1, ""), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pWebDes4, -1, ""), vDipToCurrent, "")
	vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pWebDes5, -1, ""), vDipToCurrent, "")
	If chkGlory.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub047(vDipToCurrent, chkGlory, -1), vDipToCurrent, "")
	End If
	If pEft.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub053(vDipToCurrent, LEFT, pEft, -1), vDipToCurrent, "")
	End If
	If pIpEft.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pIpEft, -1, ""), vDipToCurrent, "")
	End If
	If pPortaEft.Visible Then
		vcustomlistviewold2.Sub001(mod1.Sub045(vDipToCurrent, pPortaEft, -1, ""), vDipToCurrent, "")
		Return
	End If
End Sub

Sub Sub002(z As Boolean)
	pRTIva.Clear
	vStr2 = Main.vccefdll1.mf_leggiiva
	If vStr2 = "" Then
		pRTIva.AddAll(ArrayToList(Array As String("Codice iva RT non selezionato", "1", "2", "3", "4", "5", "6 (IVA Esente)", "7 (Esclusa)", "8 (Non soggetta IVA)", "9 (Non imponibile)", "10 (Regime del margine)", "11 (Operazione non IVA)", "12 VI Ventilazione Iva")))
	Else
		pRTIva.AddAll(ArrayToList(Array As String("Codice iva RT non selezionato", Sub007(1), Sub007(2), Sub007(3), Sub007(4), Sub007(5), "6 (IVA Esente)", "7 (Esclusa)", "8 (Non soggetta IVA)", "9 (Non imponibile)", "10 (Regime del margine)", "11 (Operazione non IVA)", "12 VI Ventilazione Iva")))
		If z Then
			Main.vSql1.ExecNonQuery("update versione set ivacassa='" & SmartStringFormatter("", modfunstr.left(vStr2, 20)) & "'")
		End If
	End If
	If Main.vccefdll1.vInt7 < 7 Then
		pRTIva.RemoveAt(12)
		Return
	End If
End Sub

Sub Sub003(spinnerWrapper As Spinner, labelWrapper As Label, i As Int, labelWrapper2 As Label)
	Dim vTmp As String = Sub008(vMap1.GetValueAt(spinnerWrapper.SelectedIndex))
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = vTmp
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim str As String = "Inserire il " & vTmp.Replace(":", "")
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "Ok", "", "Annulla", Main.vBmp1)
	If vShow = -1 Then
		Dim input As String = vDlg1.Input
		If IsNumber(input) Then
			Dim str3 As String = ""
			If Main.f_ricercaarticoli = vMap1.GetValueAt(spinnerWrapper.SelectedIndex) Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where bvar=0 and  obbligoprz=0 and obbligoqta=0 and obbligodes=0 and variazioni=0 and fraziona=0 and codint = '" & input & "'") = 0 Then
					Dim vObjectToCharSequence As Object = "Articolo non trovato." & CRLF & "Attenzione ... è possibile selezionare articoli dove tutte le richieste automatiche sono disabilitate."
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					Return
				End If
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" & input & "' and macroa >=0") > 0 Then
					Dim vObjectToCharSequence3 As Object = "Non è possibile selezionare l'articolo " & input & " essendo legato ad una macro in anagrafica articoli."
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Return
				End If
				str3 = " (" & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & input & "'") & ")"
			Else
				If Main.f_ricercacliente = vMap1.GetValueAt(spinnerWrapper.SelectedIndex) Then
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" & input & "'") = 0 Then
						Dim vObjectToCharSequence5 As Object = "Cliente non trovato."
						Dim vObjectToCharSequence6 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
						Return
					End If
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" & input & "' and macroc >=0") > 0 Then
						Dim vObjectToCharSequence7 As Object = "Non è possibile selezionare il cliente " & input & " essendo legato ad una macro in anagrafica clienti."
						Dim vObjectToCharSequence8 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
						Return
					End If
					str3 = " (" & Main.vSql1.ExecQuerySingleResult("Select descrizione from clienti where codice = '" & input & "'") & ")"
				Else
					If Main.f_menu = vMap1.GetValueAt(spinnerWrapper.SelectedIndex) Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = 'mnu" & input & "'") = 0 Then
							Dim vObjectToCharSequence9 As Object = "Menù non trovato." & CRLF & "Attenzione ... i codici dei menù vanno da 0 a 99."
							Dim vObjectToCharSequence10 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
							Return
						End If
						str3 = " (" & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where  codint = 'mnu" & input & "'") & ")"
					End If
				End If
			End If
			labelWrapper.Text = vTmp & CRLF & input & str3
			labelWrapper.Tag = input
			Dim tmacroVar As tmacro
			tmacroVar.funzione = vMap1.GetValueAt(spinnerWrapper.SelectedIndex)
			tmacroVar.valore = labelWrapper.Tag
			tmacroVar.qta = labelWrapper2.Tag
			vMap2.Put(i, tmacroVar)
		End If
	End If
End Sub

Sub Button1_Click
	vBln1 = True
	mod1.Sub198("Main")
	Activity.Finish
End Sub

Sub Sub004(buttonWrapper As Button)
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = buttonWrapper.Tag
	vDlg1.Hint = "descrizione ..."
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	vDlg1.PasswordMode = False
	Dim str As String = "Inserire la descrizione per la lingua " & vCur3.GetString("descrizione")
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		buttonWrapper.Tag = mod1.Sub038(vDlg1.Input, 50, False)
		buttonWrapper.Text = "Descrizione Web " & vCur3.GetString("descrizione") & " = " & IIf(buttonWrapper.Tag = "", "da inserire", buttonWrapper.Tag)
		Return
	End If
End Sub

Sub chkBuonosr_CheckedChange(z As Boolean)
	If Not(vBln2) Then
		pConferma.Enabled = True
	End If
	If z Then
		pBuonoComePag.SelectedIndex = 0
		Return
	End If
End Sub

Sub chkGeneraPunti_CheckedChange(z As Boolean)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub chkGlory_CheckedChange(z As Boolean)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub ChkObbligo_CheckedChange(z As Boolean)
	If Main.vInt24 = Main.d_allergeni And pCodint.Text < "50" And z Then
		Dim vObjectToCharSequence As Object = "Non è possibile inserire un tag articolo su un codice inferiore al 50."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		ChkObbligo.Checked = False
	End If
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelleappoggio.java, metodo _chkresto_checkedchange (riga 1193).
Sub ChkResto_CheckedChange(z As Boolean)
	Dim z2 As Boolean = True
	If Not(vBln2) Then
		pConferma.Enabled = True
	End If
	If Main.vInt24 = Main.d_reparti Then
		If ChkResto.Checked Or InvioWebT.Checked Then
		End If
		z2 = False
		pWebDes1.Visible = z2
		pWebDes2.Visible = z2
		pWebDes3.Visible = z2
		pWebDes4.Visible = z2
		pWebDes5.Visible = z2
		pGrpWeb.Visible = z2
		verificaWeb.Visible = z2
		NumMenu.Visible = z2
		Sub019("Rep")
		Return
	End If
End Sub

Sub chkScontabile_CheckedChange(z As Boolean)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub chkVincite_CheckedChange(z As Boolean)
	If Not(vBln4) Then
		If z Then
			Dim vObjectToCharSequence As Object = "Attenzione ... abilitando questo parametro, gli articoli del reparto verranno utilizzati come vincite lotto,slot machine, superenalotto ... (non serve per la gestione gratta e vinci) Si desidera proseguire ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
			If vMsgbox2 = -1 Then
				ChkObbligo.Checked = True
			Else
				chkVincite.Checked = False
			End If
		End If
		pConferma.Enabled = True
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelleappoggio.java, metodo m3… (riga 1257).
Sub Sub005(str As String, str2 As String, i As Int) As Panel
	Dim i2 As Int
	Dim i3 As Int
	Dim i4 As Int
	Dim i5 As Int = -1
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	Try
		panelWrapper.Initialize("")
		panelWrapper.Color = -16777216
		i2 = Main.vInt24
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If i2 = Main.d_ive Then
		If Main.vccefdll1.vStr4 <> "" Then
			If vCur2.GetString("descrizione").ToLowerCase = "da inserire" Then
				i5 = -7237231
			Else If vCur2.GetInt("RTIva") = 0 Then
				str2 = str2 & " (configurare il codice Iva RT)"
				i5 = -65536
			End If
			Dim labelWrapper As Label
			labelWrapper.Initialize("selrow")
			labelWrapper.Gravity = Bit.Or(16, 17)
			labelWrapper.Text = vCur2.GetString("codice")
			labelWrapper.TextSize = 14
			labelWrapper.TextColor = -1
			labelWrapper.Typeface = Typeface.DEFAULT_BOLD
			labelWrapper.Background = mod1.Sub155(i5, 0)
			labelWrapper.TextColor = -16777216
			Dim labelWrapper2 As Label
			labelWrapper2.Initialize("selrow")
			labelWrapper2.Gravity = Bit.Or(16, 3)
			labelWrapper2.Text = str2
			i3 = Main.vInt24
			If i3 = Main.d_clients Then
				If Main.v_numcassa <> vCur2.GetString("codice") Then
					labelWrapper2.Text = str2 & "(Pacchetti inviati: " & vCur2.GetString("compare") & ")"
					labelWrapper2.TextSize = 14
					labelWrapper2.TextColor = -1
					labelWrapper2.Background = mod1.Sub155(i5, 0)
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
					Return panelWrapper
				End If
			End If
			i4 = Main.vInt24
			If i4 = Main.d_clients Then
				labelWrapper2.Text = str2 & "(Server)"
			Else
				If Main.vInt24 = Main.d_reparti And vCur2.GetInt("codice") = 0 Then
					labelWrapper2.Text = str2 & " (NON UTILIZZABILE PER LE VARIAZIONI)"
				End If
			End If
			labelWrapper2.TextSize = 14
			labelWrapper2.TextColor = -1
			labelWrapper2.Background = mod1.Sub155(i5, 0)
			labelWrapper2.TextColor = -16777216
			Dim labelWrapper32 As Label
			labelWrapper32.Initialize("")
			labelWrapper32.Text = str
			labelWrapper32.Visible = False
			panelWrapper.AddView(labelWrapper, PerXToCurrent(0), 0, PerXToCurrent(10), i)
			panelWrapper.AddView(labelWrapper2, PerXToCurrent(10), 0, PerXToCurrent(40), i)
			panelWrapper.AddView(labelWrapper32, DipToCurrent(330), 0, DipToCurrent(10), i)
			If str = 0 Then
			End If
			Return panelWrapper
		End If
	End If
	If Main.vInt24 = Main.d_pagamenti Then
		If Main.vccefdll1.vStr4 <> "" Then
			If vCur2.GetString("descrizione").ToLowerCase = "da inserire" Then
				i5 = -7237231
			Else If vCur2.GetInt("RTPagamento") = 0 Then
				str2 = str2 & " (configurare il codice pagamento RT)"
				i5 = -65536
			End If
			Dim labelWrapper4 As Label
			labelWrapper4.Initialize("selrow")
			labelWrapper4.Gravity = Bit.Or(16, 17)
			labelWrapper4.Text = vCur2.GetString("codice")
			labelWrapper4.TextSize = 14
			labelWrapper4.TextColor = -1
			labelWrapper4.Typeface = Typeface.DEFAULT_BOLD
			labelWrapper4.Background = mod1.Sub155(i5, 0)
			labelWrapper4.TextColor = -16777216
			Dim labelWrapper22 As Label
			labelWrapper22.Initialize("selrow")
			labelWrapper22.Gravity = Bit.Or(16, 3)
			labelWrapper22.Text = str2
			i3 = Main.vInt24
			If i3 = Main.d_clients Then
			End If
			i4 = Main.vInt24
			If i4 = Main.d_clients Then
			End If
			labelWrapper22.TextSize = 14
			labelWrapper22.TextColor = -1
			labelWrapper22.Background = mod1.Sub155(i5, 0)
			labelWrapper22.TextColor = -16777216
			Dim labelWrapper322 As Label
			labelWrapper322.Initialize("")
			labelWrapper322.Text = str
			labelWrapper322.Visible = False
			panelWrapper.AddView(labelWrapper4, PerXToCurrent(0), 0, PerXToCurrent(10), i)
			panelWrapper.AddView(labelWrapper22, PerXToCurrent(10), 0, PerXToCurrent(40), i)
			panelWrapper.AddView(labelWrapper322, DipToCurrent(330), 0, DipToCurrent(10), i)
			If str = 0 Then
			End If
			Return panelWrapper
		End If
	End If
	If Main.vInt24 = Main.d_documentifattura Then
		If vCur2.GetInt("AttivoDiretta") > 0 Or vCur2.GetInt("AttivoDifferita") > 0 Then
			i5 = -11337984
		Else If vCur2.GetInt("AttivoStessaPIDifferita") > 0 Or vCur2.GetInt("AttivoStessaPIDiretta") > 0 Then
			i5 = -1638637
		End If
	Else
		If Main.vInt24 = Main.d_clients Then
			If vCur2.GetInt("stato") = 3 Then
				i5 = -65536
			Else If vCur2.GetInt("stato") = 0 Then
				i5 = -7829368
			Else If vCur2.GetInt("stato") = 1 Then
				i5 = -16711936
			Else If vCur2.GetInt("stato") = 2 Then
				i5 = -16776961
			Else
				If Main.v_numcassa = vCur2.GetString("codice") Then
					i5 = -16777216
				End If
			End If
		End If
	End If
	Dim labelWrapper42 As Label
	labelWrapper42.Initialize("selrow")
	labelWrapper42.Gravity = Bit.Or(16, 17)
	labelWrapper42.Text = vCur2.GetString("codice")
	labelWrapper42.TextSize = 14
	labelWrapper42.TextColor = -1
	labelWrapper42.Typeface = Typeface.DEFAULT_BOLD
	labelWrapper42.Background = mod1.Sub155(i5, 0)
	labelWrapper42.TextColor = -16777216
	Dim labelWrapper222 As Label
	labelWrapper222.Initialize("selrow")
	labelWrapper222.Gravity = Bit.Or(16, 3)
	labelWrapper222.Text = str2
	i3 = Main.vInt24
	If i3 = Main.d_clients Then
	End If
	i4 = Main.vInt24
	If i4 = Main.d_clients Then
	End If
	labelWrapper222.TextSize = 14
	labelWrapper222.TextColor = -1
	labelWrapper222.Background = mod1.Sub155(i5, 0)
	labelWrapper222.TextColor = -16777216
	Dim labelWrapper3222 As Label
	labelWrapper3222.Initialize("")
	labelWrapper3222.Text = str
	labelWrapper3222.Visible = False
	panelWrapper.AddView(labelWrapper42, PerXToCurrent(0), 0, PerXToCurrent(10), i)
	panelWrapper.AddView(labelWrapper222, PerXToCurrent(10), 0, PerXToCurrent(40), i)
	panelWrapper.AddView(labelWrapper3222, DipToCurrent(330), 0, DipToCurrent(10), i)
	If str = 0 Then
	End If
	Return panelWrapper
End Sub

Sub Sub006(i As Int, i2 As Int, cursorWrapper As Cursor) As Panel
	Dim i3 As Int
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	Try
		panelWrapper.Initialize("noevent")
		panelWrapper.Color = 0
		If cursorWrapper.GetInt("funzione") > 0 Then
			Dim size As Int = vMap1.Size - 1
			i3 = 0
			Do While i3 <= size
				If cursorWrapper.GetInt("funzione") = vMap1.Get(i3) Then
					Exit
				End If
				i3 = i3 + 1
			Loop
		End If
		i3 = 0
		Dim spinnerWrapper As Spinner
		spinnerWrapper.Initialize("FunMacro")
		spinnerWrapper.AddAll(vLst1)
		spinnerWrapper.SelectedIndex = i3
		Dim tmacroVar As tmacro
		tmacroVar.funzione = cursorWrapper.GetInt("funzione")
		tmacroVar.valore = cursorWrapper.GetString("valore")
		tmacroVar.qta = cursorWrapper.GetString("qta")
		vMap2.Put(i, tmacroVar)
		Dim labelWrapper As Label
		labelWrapper.Initialize("ValMacro")
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.Background = mod1.Sub157(-3355444, 2, 2)
		labelWrapper.TextColor = -16777216
		labelWrapper.TextSize = 16
		Dim vTmp As String = Sub008(cursorWrapper.GetInt("funzione"))
		Dim str As String = ""
		Dim vGetInt As Int = cursorWrapper.GetInt("funzione")
		If vGetInt = Main.f_ricercaarticoli Then
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" & cursorWrapper.GetString("valore") & "'") > 0 Then
				str = " (" & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & cursorWrapper.GetString("valore") & "'") & ")"
			End If
		Else
			Dim vGetInt2 As Int = cursorWrapper.GetInt("funzione")
			If vGetInt2 = Main.f_ricercacliente Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" & cursorWrapper.GetString("valore") & "'") > 0 Then
					str = " (" & Main.vSql1.ExecQuerySingleResult("Select descrizione from clienti where codice = '" & cursorWrapper.GetString("valore") & "'") & ")"
				End If
			Else
				Dim vGetInt3 As Int = cursorWrapper.GetInt("funzione")
				If vGetInt3 = Main.f_menu Then
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where  codint = 'mnu" & cursorWrapper.GetString("valore") & "'") > 0 Then
						str = " (" & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where  codint = 'mnu" & cursorWrapper.GetString("valore") & "'") & ")"
					End If
				End If
			End If
		End If
		If vTmp <> "" Then
			labelWrapper.Text = vTmp & CRLF & cursorWrapper.GetString("valore") & str
		Else
			labelWrapper.Text = ""
			labelWrapper.Enabled = False
		End If
		labelWrapper.Tag = cursorWrapper.GetString("valore")
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("QtaMacro")
		labelWrapper2.Gravity = Bit.Or(16, 1)
		labelWrapper2.Background = mod1.Sub157(-3355444, 2, 2)
		labelWrapper2.TextColor = -16777216
		labelWrapper2.TextSize = 16
		Dim vGetInt4 As Int = cursorWrapper.GetInt("funzione")
		If vGetInt4 = Main.f_ricercaarticoli Then
			labelWrapper2.Text = "Qta:" & CRLF & cursorWrapper.GetString("qta")
		Else
			labelWrapper2.Text = 0
			labelWrapper2.Enabled = False
		End If
		labelWrapper2.Tag = cursorWrapper.GetString("qta")
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("DelMacro")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "006.png")
		panelWrapper.AddView(spinnerWrapper, DipToCurrent(2), DipToCurrent(0), PerXToCurrent(30), i2)
		panelWrapper.AddView(labelWrapper, PerXToCurrent(30), DipToCurrent(0), PerXToCurrent(30), i2 - DipToCurrent(4))
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(60), DipToCurrent(0), PerXToCurrent(10), i2 - DipToCurrent(4))
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(70), DipToCurrent(0), PerXToCurrent(10), i2)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Delmacro_Click
	Dim vTmp As Int
	mod1.vStr2 = "Sub DelMacro_Click"
	Try
		vTmp = vcustomlistviewold3.Sub007(Sender)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vTmp < 0 Then
		Return
	End If
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(1)
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	Dim spinnerWrapper As Spinner = getpanel.GetView(0)
	labelWrapper.Text = ""
	labelWrapper2.Text = ""
	labelWrapper.Tag = ""
	labelWrapper2.Tag = 0
	labelWrapper.Enabled = False
	labelWrapper2.Enabled = False
	spinnerWrapper.SelectedIndex = 0
	Dim tmacroVar As tmacro
	tmacroVar.funzione = 0
	tmacroVar.valore = 0
	tmacroVar.qta = 0
	vMap2.Put(vTmp, tmacroVar)
End Sub

Sub errprtact(i As Int) As Int
	Dim vTmp As Int = mod1.Sub101(i)
	If vTmp > 0 Then
		Dim vObjectToCharSequence As Object = "Le stampe verranno inviate alla nuova stampante fino al prossimo riavvio del programma."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
	Return vTmp
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelleappoggio.java, metodo _funmacro_itemclick (riga 1705).
Sub Funmacro_ItemClick(i As Int, obj As Object)
	Dim vTmp As Int
	Try
		vTmp = vcustomlistviewold3.Sub007(Sender)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vTmp < 0 Then
		Return
	End If
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim spinnerWrapper As Spinner = getpanel.GetView(0)
	Dim labelWrapper As Label = getpanel.GetView(1)
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	vCur4.Position = vTmp
	If Main.f_menu = vMap1.GetValueAt(spinnerWrapper.SelectedIndex) Then
		Dim size As Int = vMap2.Size - 1
		Dim i2 As Int
		For i2 = 0 To size
			If vMap2.Get(i2).funzione = vMap1.GetValueAt(spinnerWrapper.SelectedIndex) Then
				Dim vObjectToCharSequence As Object = "All'interno della macro può essere inserito solo un menù"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				spinnerWrapper.SelectedIndex = 0
				Return
			End If
		Next
	End If
	Dim vTmp_ As String = Sub008(vMap1.GetValueAt(i))
	labelWrapper.Tag = ""
	labelWrapper.Text = vTmp_ & CRLF & labelWrapper.Tag
	labelWrapper2.Tag = 1
	labelWrapper2.Text = "Qta:" & CRLF & labelWrapper2.Tag
	If vTmp_ <> "" Then
		labelWrapper.Enabled = True
	Else
		labelWrapper.Enabled = False
		labelWrapper.Text = ""
	End If
	If Main.f_ricercaarticoli = vMap1.GetValueAt(i) Then
		labelWrapper2.Enabled = True
	Else
		labelWrapper2.Enabled = False
		labelWrapper2.Text = ""
	End If
	Dim tmacroVar As tmacro
	tmacroVar.funzione = vMap1.GetValueAt(i)
	tmacroVar.valore = labelWrapper.Tag
	tmacroVar.qta = labelWrapper2.Tag
	vMap2.Put(vTmp, tmacroVar)
	If Main.f_ricercaarticoli <> vMap1.GetValueAt(i) Then
		If Main.f_abbuono <> vMap1.GetValueAt(i) Then
			If Main.f_ricercacliente <> vMap1.GetValueAt(i) Then
			End If
		End If
	End If
	Sub003(spinnerWrapper, labelWrapper, vTmp, labelWrapper2)
End Sub

Sub Sub007(i As Int) As String
	Dim vNumberToString As String = i
	Try
		If vStr2 <> "" Then
			Dim length As Int = vStr2.Length - 1
			Dim i2 As Int
			For i2 = 0 To length Step 4
				Dim parseDouble As Int = vStr2.SubString2(i2, i2 + 2)
				If i2 / 4 + 1 = i Then
					If parseDouble = 0 Then
						Return vNumberToString & " (NON CONFIGURATA)"
					End If
					Return vNumberToString & " (aliquota " & parseDouble & " %)"
				End If
			Next
			Return vNumberToString
		End If
		Return vNumberToString
	Catch
		Log(LastException.Message)
		Return vNumberToString
	End Try
End Sub

Sub Sub008(i As Int)
	Dim valueOf As Int = i
	Select valueOf
	End Select
End Sub

Sub Sub009(i As Int) As String
	Select i
		Case 1
			Return "Secondo Menù"
		Case 2
			Return "Primo e Secondo Menù"
		Case Else
			Return "Primo Menù"
	End Select
End Sub

Sub GuadagnoP_EnterPressed
	vIME1.HideKeyboard
	If GuadagnoP.Text = "" Then
		If vStr5 <> "" Then
			If vStr5 <> "0" Then
				If vStr5 <> "0.00" Then
					GuadagnoP.Text = vStr5
					Return
				End If
			End If
		End If
	End If
	If Main.vInt24 <> Main.d_tavolitessere Then
		If Main.vInt24 <> Main.d_clients Then
			GuadagnoP.Text = NumberFormat2(Sub021(GuadagnoP.Text), 1, 2, 2, False)
			GuadagnoP.Hint = GuadagnoP.Text
			Return
		End If
	End If
	If Not(IsNumber(GuadagnoP.Text)) Then
		GuadagnoP.Text = "0"
	End If
	GuadagnoP.Hint = GuadagnoP.Text
End Sub

Sub GuadagnoP_FocusChanged(z As Boolean)
	If z Then
		vStr5 = GuadagnoP.Text
		GuadagnoP.Text = ""
		vIME1.Initialize("IME")
		If Main.vInt24 <> Main.d_tavolitessere Then
			If Main.vInt24 <> Main.d_clients Then
				Dim editText As EditText = GuadagnoP
				Dim editTextWrapper As EditText = GuadagnoP
				vIME1.SetCustomFilter(editText, 12290, "0123456789.")
				pConferma.Enabled = True
			End If
		End If
		Dim editText2 As EditText = GuadagnoP
		Dim editTextWrapper2 As EditText = GuadagnoP
		vIME1.SetCustomFilter(editText2, 2, "0123456789")
		pConferma.Enabled = True
	Else
		If GuadagnoP.Text = "" Then
			If vStr5 <> "" Then
				If vStr5 <> "0" Then
					If vStr5 <> "0.00" Then
						GuadagnoP.Text = vStr5
						Return
					End If
				End If
			End If
		End If
		If Main.vInt24 <> Main.d_tavolitessere Then
			If Main.vInt24 <> Main.d_clients Then
				GuadagnoP.Text = NumberFormat2(Sub021(GuadagnoP.Text), 1, 2, 2, False)
				GuadagnoP.Hint = GuadagnoP.Text
			End If
		End If
		If Not(IsNumber(GuadagnoP.Text)) Then
			GuadagnoP.Text = "0"
		End If
		GuadagnoP.Hint = GuadagnoP.Text
	End If
End Sub

Sub GuadagnoP_TextChanged(str As String, str2 As String)
	If Not(vBln4) And Not(pConferma.Enabled) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub GuadagnoV_EnterPressed
	vIME1.HideKeyboard
	If GuadagnoV.Text = "" Then
		If vStr5 <> "" Then
			If vStr5 <> "0" Then
				If vStr5 <> "0.00" Then
					GuadagnoV.Text = vStr5
					Return
				End If
			End If
		End If
	End If
	If Main.vInt24 <> Main.d_tavolitessere Then
		If Main.vInt24 <> Main.d_clients Then
			GuadagnoV.Text = NumberFormat2(Sub021(GuadagnoV.Text), 1, 2, 2, False)
			GuadagnoV.Hint = GuadagnoV.Text
			Return
		End If
	End If
	If Not(IsNumber(GuadagnoV.Text)) Then
		GuadagnoV.Text = "0"
	End If
	GuadagnoV.Hint = GuadagnoV.Text
End Sub

Sub GuadagnoV_FocusChanged(z As Boolean)
	If z Then
		vStr5 = GuadagnoV.Text
		GuadagnoV.Text = ""
		vIME1.Initialize("IME")
		If Main.vInt24 <> Main.d_tavolitessere Then
			If Main.vInt24 <> Main.d_clients Then
				Dim editText As EditText = GuadagnoV
				Dim editTextWrapper As EditText = GuadagnoV
				vIME1.SetCustomFilter(editText, 12290, "0123456789.")
				pConferma.Enabled = True
			End If
		End If
		Dim editText2 As EditText = GuadagnoV
		Dim editTextWrapper2 As EditText = GuadagnoV
		vIME1.SetCustomFilter(editText2, 2, "0123456789")
		pConferma.Enabled = True
	Else
		If GuadagnoV.Text = "" Then
			If vStr5 <> "" Then
				If vStr5 <> "0" Then
					If vStr5 <> "0.00" Then
						GuadagnoV.Text = vStr5
						Return
					End If
				End If
			End If
		End If
		If Main.vInt24 <> Main.d_tavolitessere Then
			If Main.vInt24 <> Main.d_clients Then
				GuadagnoV.Text = NumberFormat2(Sub021(GuadagnoV.Text), 1, 2, 2, False)
				GuadagnoV.Hint = GuadagnoV.Text
			End If
		End If
		If Not(IsNumber(GuadagnoV.Text)) Then
			GuadagnoV.Text = "0"
		End If
		GuadagnoV.Hint = GuadagnoV.Text
	End If
End Sub

Sub GuadagnoV_TextChanged(str As String, str2 As String)
	If Not(vBln4) And Not(pConferma.Enabled) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelleappoggio.java, metodo m6… (riga 2195).
Sub Sub010
	Dim z As Boolean
	Dim i As Int
	Dim z2 As Boolean
	Dim i2 As Int
	Dim z3 As Boolean
	Dim i3 As Int
	Dim z4 As Boolean
	Dim i4 As Int
	Dim z5 As Boolean
	Dim i5 As Int
	Dim z6 As Boolean
	Dim i6 As Int
	Dim z7 As Boolean
	Dim valueOf As Int
	Dim i7 As Int
	mod1.vStr2 = "Sub Init"
	Try
		ProgressDialogShow("Caricamento dati in corso ...")
		ChkObbligo.Visible = False
		chkVincite.Visible = False
		chkBuonosr.Visible = False
		ChkResto.Visible = False
		chkGeneraPunti.Visible = False
		pIndice.Visible = False
		pGrpWeb.Visible = False
		NumMenu.Visible = False
		LIP.Visible = False
		PIP.Visible = False
		SempreDocFisc.Visible = False
		Dim editTextWrapper As EditText = GuadagnoP
		If Main.vInt24 <> Main.d_reparti Then
			If Main.vInt24 <> Main.d_tavolitessere Then
				If Main.vInt24 <> Main.d_clients Then
					z = False
					editTextWrapper.Visible = z
					InvioWebT.Visible = Main.vInt24 <> Main.d_reparti
					chkScontabile.Visible = Main.vInt24 <> Main.d_reparti
					verificaWeb.Visible = Main.vInt24 <> Main.d_reparti
					Dim editTextWrapper2 As EditText = GuadagnoV
					i = Main.vInt24
					If i <> Main.d_reparti Then
						If Main.vInt24 <> Main.d_tavolitessere Then
							If Main.vInt24 <> Main.d_clients Then
								z2 = False
								editTextWrapper2.Visible = z2
								Dim labelWrapper As Label = Label1
								i2 = Main.vInt24
								If i2 <> Main.d_reparti Then
									If Main.vInt24 <> Main.d_tavolitessere Then
										If Main.vInt24 <> Main.d_clients Then
											z3 = False
											labelWrapper.Visible = z3
											Dim labelWrapper2 As Label = Label2
											i3 = Main.vInt24
											If i3 <> Main.d_reparti Then
												If Main.vInt24 <> Main.d_tavolitessere Then
													If Main.vInt24 <> Main.d_clients Then
														z4 = False
														labelWrapper2.Visible = z4
														LEFT.Visible = Main.vInt24 = Main.d_pagamenti
														pEft.Visible = Main.vInt24 = Main.d_pagamenti
														Dim labelWrapper4 As Label = lRTIva
														i4 = Main.vInt24
														If i4 <> Main.d_ive Then
															If Main.vInt24 <> Main.d_pagamenti Then
																z5 = False
																labelWrapper4.Visible = z5
																Dim spinnerWrapper2 As Spinner = pRTIva
																i5 = Main.vInt24
																If i5 <> Main.d_ive Then
																	If Main.vInt24 <> Main.d_pagamenti Then
																		z6 = False
																		spinnerWrapper2.Visible = z6
																		Dim buttonWrapper As Button = pIvaRT
																		i6 = Main.vInt24
																		If i6 = Main.d_ive Then
																			If Main.vccefdll1.vStr4 <> "" Then
																				z7 = True
																				buttonWrapper.Visible = z7
																				pBuonoComePag.Visible = Main.vInt24 <> Main.d_pagamenti
																				pNaturaIva.Visible = Main.vInt24 <> Main.d_ive
																				lNaturaIva.Visible = Main.vInt24 <> Main.d_ive
																				pIpEft.Visible = Main.vInt24 <> Main.d_pagamenti
																				pPortaEft.Visible = Main.vInt24 <> Main.d_pagamenti
																				LCopia.Visible = Main.vInt24 <> Main.d_pagamenti
																				pCopia.Visible = Main.vInt24 <> Main.d_pagamenti
																				lTipoPrepatago.Visible = Main.vInt24 <> Main.d_pagamenti
																				pTipoPrepagato.Visible = Main.vInt24 <> Main.d_pagamenti
																				LTA.Visible = Main.vInt24 <> Main.d_reparti
																				pTA.Visible = Main.vInt24 <> Main.d_reparti
																				chkGlory.Visible = Main.vInt24 <> Main.d_pagamenti
																				pImport.Visible = Main.vInt24 = Main.d_ingredienti
																				pWebDes1.Visible = False
																				pWebDes2.Visible = False
																				pWebDes3.Visible = False
																				pWebDes4.Visible = False
																				pWebDes5.Visible = False
																				valueOf = Main.vInt24
																				Select valueOf
																					Case Main.d_clients
																						lblTitolo.Text = "Gestione Tabella Client"
																						lblTitolo.Tag = "Gestione Tabella Client"
																						lRep.Text = "Stato Terminale:"
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						Sub012(pRep)
																						vStr3 = "clients"
																						ChkObbligo.Visible = True
																						ChkObbligo.Text = "Terminale lettura tessere"
																						LIP.Visible = True
																						PIP.Visible = True
																						Label1.Text = "Scontrino Da Tavolo" & CRLF & "(per palmare)"
																						Label2.Text = "Scontrino A Tavolo" & CRLF & "(per palmare)"
																					Case Main.d_reparti
																						lblTitolo.Text = "Gestione Reparti"
																						vStr1 = "Gestione Reparti"
																						Dim cursorWrapper As Cursor
																						vCur3 = Main.vSql1.ExecQuery("Select * from LinguaDescrizioniWeb order by codice")
																						lRep.Text = "iva:"
																						LPrz.Text = "Max Importo:"
																						populatespinner(pRep, "iva", True)
																						vStr3 = "reparti"
																						ChkObbligo.Visible = True
																						chkVincite.Visible = True
																						ChkObbligo.Text = "Non Fiscale"
																						pIndice.Visible = True
																						pGrpWeb.Visible = True
																						NumMenu.Visible = True
																						chkBuonosr.Visible = True
																						chkBuonosr.Text = "Abilita esportazione Palmari"
																						ChkResto.Visible = True
																						ChkResto.Text = "Abilita esportazione verso Applicazione Web (ASPORTO)"
																						InvioWebT.Text = "Abilita esportazione verso Applicazione Web (TAVOLI)"
																						pTA.Clear
																						pTA.Add("Nessun turno automatico")
																						pTA.Add("Proponi Turno 1 nei Menù")
																						pTA.Add("Proponi Turno 2 nei Menù")
																						pTA.Add("Proponi Turno 3 nei Menù")
																						pTA.Add("Proponi Turno 4 nei Menù")
																						pTA.Add("Proponi Turno 5 nei Menù")
																						pTA.Add("Proponi sempre il Turno 1")
																						pTA.Add("Proponi sempre il Turno 2")
																						pTA.Add("Proponi sempre il Turno 3")
																						pTA.Add("Proponi sempre il Turno 4")
																						pTA.Add("Proponi sempre il Turno 5")
																						pTA.SelectedIndex = 0
																					Case Main.d_um
																						lblTitolo.Text = "Unità di Misura"
																						vStr1 = "Unità di Misura"
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						vStr3 = "um"
																					Case Main.d_macro
																						lblTitolo.Text = "Gestione Macro"
																						vStr1 = "Gestione Macro"
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						pIndice.Visible = True
																						vStr3 = "MacroHead"
																						vMap1.Initialize
																						vMap2.Initialize
																						vLst1.Initialize
																						vMap1.Put(0, 0)
																						vMap1.Put(1, Main.f_ricercaarticoli)
																						vMap1.Put(2, Main.f_abbuono)
																						vMap1.Put(3, Main.f_ricercacliente)
																						vMap1.Put(4, Main.f_fattura)
																						vMap1.Put(5, Main.f_ricevuta)
																						vMap1.Put(6, Main.f_menu)
																						vLst1.AddAll(ArrayToList(Array As String("Nessuna Funzione", "Ricerca Articoli", "Abbuono", "Ricerca Cliente", "Fattura", "Ricevuta", "Menù")))
																					Case Main.d_documentifattura
																						lblTitolo.Text = "Gestione Documenti fattura"
																						vStr1 = "Gestione Documenti fattura"
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						pDes.SingleLine = False
																						pDes.Enabled = False
																						LCopia.Visible = True
																						LCopia.Text = "In fattura diretta:"
																						pCopia.Visible = True
																						pCopia.Clear
																						pCopia.Add("Non Visibile")
																						pCopia.Add("Visibile")
																						pCopia.Add("Visibile e Attivato")
																						pCopia.SelectedIndex = 0
																						lBuono.Visible = True
																						lBuono.Text = "In fattura differita:"
																						pBuonoComePag.Visible = True
																						pBuonoComePag.Clear
																						pBuonoComePag.Add("Non Visibile")
																						pBuonoComePag.Add("Visibile")
																						pBuonoComePag.Add("Visibile e Attivato")
																						pBuonoComePag.SelectedIndex = 0
																						lNaturaIva.Visible = True
																						lNaturaIva.Text = "In fattura diretta quando partita iva cliente = esercente "
																						pNaturaIva.Visible = True
																						pNaturaIva.Clear
																						pNaturaIva.Add("Non Visibile")
																						pNaturaIva.Add("Visibile")
																						pNaturaIva.Add("Visibile e Attivato")
																						pNaturaIva.SelectedIndex = 0
																						lRTIva.Visible = True
																						lRTIva.Text = "In fattura differita quando partita iva cliente = esercente "
																						pRTIva.Visible = True
																						pRTIva.Clear
																						pRTIva.Add("Non Visibile")
																						pRTIva.Add("Visibile")
																						pRTIva.Add("Visibile e Attivato")
																						pRTIva.SelectedIndex = 0
																						lRTIva.Typeface = Typeface.DEFAULT
																						vStr3 = "FECodiciDocumento"
																					Case Main.d_ive
																						lblTitolo.Text = "Gestione ive"
																						vStr1 = "Gestione ive"
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Text = "Aliquota:"
																						lNaturaIva.Text = "Natura Iva per Fattura:"
																						vStr3 = "iva"
																						pNaturaIva.Clear
																						populatespinner(pNaturaIva, "FEnaturaIVA", False)
																						Sub002(False)
																					Case Main.d_gruppocli
																						lblTitolo.Text = "Gruppi Cliente"
																						vStr1 = "Gruppi Cliente"
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						vStr3 = "gruppocli"
																					Case Main.d_ingredienti
																						lblTitolo.Text = "Gestione Ingredienti"
																						vStr1 = "Gestione Ingredienti"
																						Dim cursorWrapper2 As Cursor
																						vCur3 = Main.vSql1.ExecQuery("Select * from LinguaDescrizioniWeb order by codice")
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						vStr3 = "ingredienti"
																					Case Main.d_tavolitessere
																						lblTitolo.Text = "Gestione Tavoli-Tessere"
																						vStr1 = "Gestione Tavoli-Tessere"
																						Label1.Text = "Da Tavolo-Tessera"
																						Label2.Text = "A Tavolo-Tessera"
																						pIndice.Visible = True
																						LPrz.Text = "Max Importo:"
																						LIP.Visible = True
																						PIP.Visible = True
																						LIP.Text = "Importo all'ingresso:"
																						lRep.Visible = False
																						pRep.Visible = False
																						ChkResto.Visible = True
																						ChkResto.Text = "Non azzerare i dati in Chiusura Giornaliera"
																						vStr3 = "Despagine"
																					Case Main.d_allergeni
																						lblTitolo.Text = "Gestione Allergeni"
																						vStr1 = "Gestione Allergeni"
																						Dim cursorWrapper3 As Cursor
																						vCur3 = Main.vSql1.ExecQuery("Select * from LinguaDescrizioniWeb order by codice")
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						ChkObbligo.Visible = True
																						ChkObbligo.Text = "Tag Articolo"
																						vStr3 = "allergeni"
																					Case Main.d_linguew
																						lblTitolo.Text = "Gestione descrizione lingue per Web"
																						vStr1 = "Gestione Lingue Web"
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						vStr3 = "LinguaDescrizioniWeb"
																					Case Main.d_grvariazioni
																						lblTitolo.Text = "Gestione Gruppi"
																						vStr1 = "Gestione Gruppi"
																						lRep.Visible = False
																						pRep.Visible = False
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						chkBuonosr.Visible = True
																						pIndice.Visible = True
																						chkBuonosr.Text = "Le variazioni di questo gruppo sono esclusive (solo 1 abilitata)"
																						vStr3 = "gruppovar"
																					Case Main.d_pagamenti
																						lblTitolo.Text = "Gestione Pagamenti"
																						vStr1 = "Gestione Pagamenti"
																						lRep.Text = "Corrispettivo:"
																						LPrz.Visible = False
																						pPrezzo.Visible = False
																						Sub014(pRep)
																						pCopia.Clear
																						pCopia.Add("Non stampare la copia scontrino")
																						pCopia.Add("Stampa la copia scontrino con importi")
																						pCopia.Add("Stampa la copia scontrino senza importi")
																						pCopia.SelectedIndex = 0
																						pTipoPrepagato.Clear
																						pTipoPrepagato.Add("Tipo Pagamento predefinito")
																						pTipoPrepagato.Add("Pagamento utilizzabile solo con prepagato")
																						pTipoPrepagato.Add("Pagamento utilizzabile solo con postpagato")
																						pTipoPrepagato.Add("Pagamento NON utilizzabile con prepagato o postpagato")
																						pTipoPrepagato.SelectedIndex = 0
																						lRTIva.Text = "Codice pagamento RT"
																						vStr3 = "pagamenti"
																						Sub013(pEft)
																						pBuonoComePag.Clear
																						pBuonoComePag.Add("Nessuno")
																						populatespinner(pBuonoComePag, "pagamenti", False)
																						Sub015(pRTIva)
																						ChkObbligo.Visible = True
																						chkBuonosr.Visible = True
																						ChkResto.Visible = True
																						chkGeneraPunti.Visible = True
																						SempreDocFisc.Visible = True
																						ChkObbligo.Text = "Importo Obbligatorio"
																				End Select
																				Sub001()
																				DoEvents
																				i7 = Main.vInt24
																				If i7 <> Main.d_tavolitessere Then
																					vStr4 = " where codice >= 100 "
																				Else
																					vStr4 = ""
																				End If
																				Sub020()
																				ProgressDialogHide
																				Return
																			End If
																		End If
																		z7 = False
																		buttonWrapper.Visible = z7
																		pBuonoComePag.Visible = Main.vInt24 <> Main.d_pagamenti
																		pNaturaIva.Visible = Main.vInt24 <> Main.d_ive
																		lNaturaIva.Visible = Main.vInt24 <> Main.d_ive
																		pIpEft.Visible = Main.vInt24 <> Main.d_pagamenti
																		pPortaEft.Visible = Main.vInt24 <> Main.d_pagamenti
																		LCopia.Visible = Main.vInt24 <> Main.d_pagamenti
																		pCopia.Visible = Main.vInt24 <> Main.d_pagamenti
																		lTipoPrepatago.Visible = Main.vInt24 <> Main.d_pagamenti
																		pTipoPrepagato.Visible = Main.vInt24 <> Main.d_pagamenti
																		LTA.Visible = Main.vInt24 <> Main.d_reparti
																		pTA.Visible = Main.vInt24 <> Main.d_reparti
																		chkGlory.Visible = Main.vInt24 <> Main.d_pagamenti
																		pImport.Visible = Main.vInt24 = Main.d_ingredienti
																		pWebDes1.Visible = False
																		pWebDes2.Visible = False
																		pWebDes3.Visible = False
																		pWebDes4.Visible = False
																		pWebDes5.Visible = False
																		valueOf = Main.vInt24
																		Select valueOf
																		End Select
																		Sub001()
																		DoEvents
																		i7 = Main.vInt24
																		If i7 <> Main.d_tavolitessere Then
																		End If
																		Sub020()
																		ProgressDialogHide
																		Return
																	End If
																End If
																z6 = True
																spinnerWrapper2.Visible = z6
																i6 = Main.vInt24
																If i6 = Main.d_ive Then
																End If
																z7 = False
																pIvaRT.Visible = z7
																pBuonoComePag.Visible = Main.vInt24 <> Main.d_pagamenti
																pNaturaIva.Visible = Main.vInt24 <> Main.d_ive
																lNaturaIva.Visible = Main.vInt24 <> Main.d_ive
																pIpEft.Visible = Main.vInt24 <> Main.d_pagamenti
																pPortaEft.Visible = Main.vInt24 <> Main.d_pagamenti
																LCopia.Visible = Main.vInt24 <> Main.d_pagamenti
																pCopia.Visible = Main.vInt24 <> Main.d_pagamenti
																lTipoPrepatago.Visible = Main.vInt24 <> Main.d_pagamenti
																pTipoPrepagato.Visible = Main.vInt24 <> Main.d_pagamenti
																LTA.Visible = Main.vInt24 <> Main.d_reparti
																pTA.Visible = Main.vInt24 <> Main.d_reparti
																chkGlory.Visible = Main.vInt24 <> Main.d_pagamenti
																pImport.Visible = Main.vInt24 = Main.d_ingredienti
																pWebDes1.Visible = False
																pWebDes2.Visible = False
																pWebDes3.Visible = False
																pWebDes4.Visible = False
																pWebDes5.Visible = False
																valueOf = Main.vInt24
																Select valueOf
																End Select
																Sub001()
																DoEvents
																i7 = Main.vInt24
																If i7 <> Main.d_tavolitessere Then
																End If
																Sub020()
																ProgressDialogHide
																Return
															End If
														End If
														z5 = True
														labelWrapper4.Visible = z5
														i5 = Main.vInt24
														If i5 <> Main.d_ive Then
														End If
														z6 = True
														pRTIva.Visible = z6
														i6 = Main.vInt24
														If i6 = Main.d_ive Then
														End If
														z7 = False
														pIvaRT.Visible = z7
														pBuonoComePag.Visible = Main.vInt24 <> Main.d_pagamenti
														pNaturaIva.Visible = Main.vInt24 <> Main.d_ive
														lNaturaIva.Visible = Main.vInt24 <> Main.d_ive
														pIpEft.Visible = Main.vInt24 <> Main.d_pagamenti
														pPortaEft.Visible = Main.vInt24 <> Main.d_pagamenti
														LCopia.Visible = Main.vInt24 <> Main.d_pagamenti
														pCopia.Visible = Main.vInt24 <> Main.d_pagamenti
														lTipoPrepatago.Visible = Main.vInt24 <> Main.d_pagamenti
														pTipoPrepagato.Visible = Main.vInt24 <> Main.d_pagamenti
														LTA.Visible = Main.vInt24 <> Main.d_reparti
														pTA.Visible = Main.vInt24 <> Main.d_reparti
														chkGlory.Visible = Main.vInt24 <> Main.d_pagamenti
														pImport.Visible = Main.vInt24 = Main.d_ingredienti
														pWebDes1.Visible = False
														pWebDes2.Visible = False
														pWebDes3.Visible = False
														pWebDes4.Visible = False
														pWebDes5.Visible = False
														valueOf = Main.vInt24
														Select valueOf
														End Select
														Sub001()
														DoEvents
														i7 = Main.vInt24
														If i7 <> Main.d_tavolitessere Then
														End If
														Sub020()
														ProgressDialogHide
														Return
													End If
												End If
											End If
											z4 = True
											labelWrapper2.Visible = z4
											LEFT.Visible = Main.vInt24 = Main.d_pagamenti
											pEft.Visible = Main.vInt24 = Main.d_pagamenti
											i4 = Main.vInt24
											If i4 <> Main.d_ive Then
											End If
											z5 = True
											lRTIva.Visible = z5
											i5 = Main.vInt24
											If i5 <> Main.d_ive Then
											End If
											z6 = True
											pRTIva.Visible = z6
											i6 = Main.vInt24
											If i6 = Main.d_ive Then
											End If
											z7 = False
											pIvaRT.Visible = z7
											pBuonoComePag.Visible = Main.vInt24 <> Main.d_pagamenti
											pNaturaIva.Visible = Main.vInt24 <> Main.d_ive
											lNaturaIva.Visible = Main.vInt24 <> Main.d_ive
											pIpEft.Visible = Main.vInt24 <> Main.d_pagamenti
											pPortaEft.Visible = Main.vInt24 <> Main.d_pagamenti
											LCopia.Visible = Main.vInt24 <> Main.d_pagamenti
											pCopia.Visible = Main.vInt24 <> Main.d_pagamenti
											lTipoPrepatago.Visible = Main.vInt24 <> Main.d_pagamenti
											pTipoPrepagato.Visible = Main.vInt24 <> Main.d_pagamenti
											LTA.Visible = Main.vInt24 <> Main.d_reparti
											pTA.Visible = Main.vInt24 <> Main.d_reparti
											chkGlory.Visible = Main.vInt24 <> Main.d_pagamenti
											pImport.Visible = Main.vInt24 = Main.d_ingredienti
											pWebDes1.Visible = False
											pWebDes2.Visible = False
											pWebDes3.Visible = False
											pWebDes4.Visible = False
											pWebDes5.Visible = False
											valueOf = Main.vInt24
											Select valueOf
											End Select
											Sub001()
											DoEvents
											i7 = Main.vInt24
											If i7 <> Main.d_tavolitessere Then
											End If
											Sub020()
											ProgressDialogHide
											Return
										End If
									End If
								End If
								z3 = True
								labelWrapper.Visible = z3
								i3 = Main.vInt24
								If i3 <> Main.d_reparti Then
								End If
								z4 = True
								Label2.Visible = z4
								LEFT.Visible = Main.vInt24 = Main.d_pagamenti
								pEft.Visible = Main.vInt24 = Main.d_pagamenti
								i4 = Main.vInt24
								If i4 <> Main.d_ive Then
								End If
								z5 = True
								lRTIva.Visible = z5
								i5 = Main.vInt24
								If i5 <> Main.d_ive Then
								End If
								z6 = True
								pRTIva.Visible = z6
								i6 = Main.vInt24
								If i6 = Main.d_ive Then
								End If
								z7 = False
								pIvaRT.Visible = z7
								pBuonoComePag.Visible = Main.vInt24 <> Main.d_pagamenti
								pNaturaIva.Visible = Main.vInt24 <> Main.d_ive
								lNaturaIva.Visible = Main.vInt24 <> Main.d_ive
								pIpEft.Visible = Main.vInt24 <> Main.d_pagamenti
								pPortaEft.Visible = Main.vInt24 <> Main.d_pagamenti
								LCopia.Visible = Main.vInt24 <> Main.d_pagamenti
								pCopia.Visible = Main.vInt24 <> Main.d_pagamenti
								lTipoPrepatago.Visible = Main.vInt24 <> Main.d_pagamenti
								pTipoPrepagato.Visible = Main.vInt24 <> Main.d_pagamenti
								LTA.Visible = Main.vInt24 <> Main.d_reparti
								pTA.Visible = Main.vInt24 <> Main.d_reparti
								chkGlory.Visible = Main.vInt24 <> Main.d_pagamenti
								pImport.Visible = Main.vInt24 = Main.d_ingredienti
								pWebDes1.Visible = False
								pWebDes2.Visible = False
								pWebDes3.Visible = False
								pWebDes4.Visible = False
								pWebDes5.Visible = False
								valueOf = Main.vInt24
								Select valueOf
								End Select
								Sub001()
								DoEvents
								i7 = Main.vInt24
								If i7 <> Main.d_tavolitessere Then
								End If
								Sub020()
								ProgressDialogHide
								Return
							End If
						End If
					End If
					z2 = True
					editTextWrapper2.Visible = z2
					i2 = Main.vInt24
					If i2 <> Main.d_reparti Then
					End If
					z3 = True
					Label1.Visible = z3
					i3 = Main.vInt24
					If i3 <> Main.d_reparti Then
					End If
					z4 = True
					Label2.Visible = z4
					LEFT.Visible = Main.vInt24 = Main.d_pagamenti
					pEft.Visible = Main.vInt24 = Main.d_pagamenti
					i4 = Main.vInt24
					If i4 <> Main.d_ive Then
					End If
					z5 = True
					lRTIva.Visible = z5
					i5 = Main.vInt24
					If i5 <> Main.d_ive Then
					End If
					z6 = True
					pRTIva.Visible = z6
					i6 = Main.vInt24
					If i6 = Main.d_ive Then
					End If
					z7 = False
					pIvaRT.Visible = z7
					pBuonoComePag.Visible = Main.vInt24 <> Main.d_pagamenti
					pNaturaIva.Visible = Main.vInt24 <> Main.d_ive
					lNaturaIva.Visible = Main.vInt24 <> Main.d_ive
					pIpEft.Visible = Main.vInt24 <> Main.d_pagamenti
					pPortaEft.Visible = Main.vInt24 <> Main.d_pagamenti
					LCopia.Visible = Main.vInt24 <> Main.d_pagamenti
					pCopia.Visible = Main.vInt24 <> Main.d_pagamenti
					lTipoPrepatago.Visible = Main.vInt24 <> Main.d_pagamenti
					pTipoPrepagato.Visible = Main.vInt24 <> Main.d_pagamenti
					LTA.Visible = Main.vInt24 <> Main.d_reparti
					pTA.Visible = Main.vInt24 <> Main.d_reparti
					chkGlory.Visible = Main.vInt24 <> Main.d_pagamenti
					pImport.Visible = Main.vInt24 = Main.d_ingredienti
					pWebDes1.Visible = False
					pWebDes2.Visible = False
					pWebDes3.Visible = False
					pWebDes4.Visible = False
					pWebDes5.Visible = False
					valueOf = Main.vInt24
					Select valueOf
					End Select
					Sub001()
					DoEvents
					i7 = Main.vInt24
					If i7 <> Main.d_tavolitessere Then
					End If
					Sub020()
					ProgressDialogHide
					Return
				End If
			End If
		End If
		z = True
		editTextWrapper.Visible = z
		InvioWebT.Visible = Main.vInt24 <> Main.d_reparti
		chkScontabile.Visible = Main.vInt24 <> Main.d_reparti
		verificaWeb.Visible = Main.vInt24 <> Main.d_reparti
		i = Main.vInt24
		If i <> Main.d_reparti Then
		End If
		z2 = True
		GuadagnoV.Visible = z2
		i2 = Main.vInt24
		If i2 <> Main.d_reparti Then
		End If
		z3 = True
		Label1.Visible = z3
		i3 = Main.vInt24
		If i3 <> Main.d_reparti Then
		End If
		z4 = True
		Label2.Visible = z4
		LEFT.Visible = Main.vInt24 = Main.d_pagamenti
		pEft.Visible = Main.vInt24 = Main.d_pagamenti
		i4 = Main.vInt24
		If i4 <> Main.d_ive Then
		End If
		z5 = True
		lRTIva.Visible = z5
		i5 = Main.vInt24
		If i5 <> Main.d_ive Then
		End If
		z6 = True
		pRTIva.Visible = z6
		i6 = Main.vInt24
		If i6 = Main.d_ive Then
		End If
		z7 = False
		pIvaRT.Visible = z7
		pBuonoComePag.Visible = Main.vInt24 <> Main.d_pagamenti
		pNaturaIva.Visible = Main.vInt24 <> Main.d_ive
		lNaturaIva.Visible = Main.vInt24 <> Main.d_ive
		pIpEft.Visible = Main.vInt24 <> Main.d_pagamenti
		pPortaEft.Visible = Main.vInt24 <> Main.d_pagamenti
		LCopia.Visible = Main.vInt24 <> Main.d_pagamenti
		pCopia.Visible = Main.vInt24 <> Main.d_pagamenti
		lTipoPrepatago.Visible = Main.vInt24 <> Main.d_pagamenti
		pTipoPrepagato.Visible = Main.vInt24 <> Main.d_pagamenti
		LTA.Visible = Main.vInt24 <> Main.d_reparti
		pTA.Visible = Main.vInt24 <> Main.d_reparti
		chkGlory.Visible = Main.vInt24 <> Main.d_pagamenti
		pImport.Visible = Main.vInt24 = Main.d_ingredienti
		pWebDes1.Visible = False
		pWebDes2.Visible = False
		pWebDes3.Visible = False
		pWebDes4.Visible = False
		pWebDes5.Visible = False
		valueOf = Main.vInt24
		Select valueOf
		End Select
		Sub001()
		DoEvents
		i7 = Main.vInt24
		If i7 <> Main.d_tavolitessere Then
		End If
		Sub020()
		ProgressDialogHide
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub011(str As String)
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

Sub msgboxonly(str As String, str2 As String)
	Dim vObjectToCharSequence As Object = str2
	Dim vObjectToCharSequence2 As Object = str
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "", "", "Ok", Main.vBmp1)
End Sub

Sub Noevent_Click
End Sub

Sub NumMenu_Click
	Dim list As List
	list.Initialize
	list.Add("Attiva il Primo Menu")
	list.Add("Attiva il Secondo Menu")
	list.Add("Attiva il Primo e il Secondo Menu")
	Dim vInputList As Int = InputList(list, "Seleziona una configurazione di menù", NumMenu.Tag)
	NumMenu.Tag = vInputList
	NumMenu.Text = "Menù Attivo:" & Sub009(vInputList)
	pConferma.Enabled = True
End Sub

Sub PagamentoPalmare_CheckedChange(z As Boolean)
	If z Then
		Dim str As String = "RTPagamento=" & pRTIva.SelectedIndex
		If pRTIva.SelectedIndex = 8 Or pRTIva.SelectedIndex = 3 Then
			str = "(RTPagamento=8 or RTPagamento=3) "
		End If
		Main.vSql1.ExecNonQuery("update " & vStr3 & " set pagamentopalmare =0 where " & str & " and codice <>'" & pCodint.Text & "'")
		Dim position As Int = vCur2.Position
		Dim cursorWrapper As Cursor
		vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & " order by codice")
		vCur2.Position = position
	End If
	pConferma.Enabled = True
End Sub

Sub pBuonoComePag_ItemClick(i As Int, obj As Object)
	If i > 0 Then
		chkBuonosr.Checked = False
		ChkResto.Checked = True
	End If
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub pConferma_Click
	Dim tc As Int
	Dim listofmaps As List
	Dim m As Map
	Dim itmpmaxt As Int
	Dim tmpda As Int
	Dim tmpa As Int
	Dim mcolor As Int
	Dim tmpaliquota As Double
	Dim tmpprefisso As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					mod1.vStr2 = "Sub pConferma_Click"
					Continue
				Case 1
					rsState = 182
					rsCatchState = 181
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 181
					pDes.RequestFocus
					Sleep(100)
					rsState = 183
					Continue
				Case 4
					rsState = 9
					If pPrezzo.Text <> "" Then
						Continue
					Else
						rsState = 6
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 9
					pPrezzo.Text = "0"
					Continue
				Case 9
					rsState = 10
					vIME1.HideKeyboard
					Continue
				Case 10
					rsState = 174
					Dim valueOf As Int = Main.vInt24
					Select valueOf
						Case Main.d_reparti
							rsState = 12
						Case Main.d_clients
							rsState = 43
						Case Main.d_tavolitessere
							rsState = 79
						Case Main.d_ive
							rsState = 91
						Case Main.d_ingredienti, Main.d_allergeni, Main.d_grvariazioni, Main.d_linguew, Main.d_gruppocli, Main.d_um, Main.d_macro
							rsState = 117
						Case Main.d_documentifattura
							rsState = 136
						Case Main.d_pagamenti
							rsState = 157
					End Select
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 13
					Continue
				Case 13
					rsState = 16
					If Sub021(pPrezzo.Text) <> "0" Then
						Continue
					Else
						rsState = 15
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 15
				Case 15
					rsState = 16
					ToastMessageShow("Inserire un Importo massimo valido", True)
					pPrezzo.Text = ""
					Return
				Case 16
					rsState = 21
					If GuadagnoP.Text <> "" Then
						Continue
					Else
						rsState = 18
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 18
				Case 18
					rsState = 21
					GuadagnoP.Text = "0"
					Continue
				Case 21
					rsState = 22
					Continue
				Case 22
					rsState = 27
					If GuadagnoV.Text <> "" Then
						Continue
					Else
						rsState = 24
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 24
				Case 24
					rsState = 27
					GuadagnoV.Text = "0"
					Continue
				Case 27
					rsState = 28
					Continue
				Case 28
					rsState = 33
					If GuadagnoP.Text <> "0" Then
						If GuadagnoP.Text <> "0.00" Then
							rsState = 30
							Continue
						Else
							Continue
						End If
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 30
				Case 30
					rsState = 33
					GuadagnoV.Text = "0"
					Continue
				Case 33
					rsState = 34
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set TurnoP = " & pTA.SelectedIndex & " ,guadagnop = " & GuadagnoP.Text & " ,guadagnov = " & GuadagnoV.Text & ",descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',maximpo =" & pPrezzo.Text & ",verificaWeb = " & IIf(verificaWeb.Checked, "1", "0") & ",vincite = " & IIf(chkVincite.Checked, "1", "0") & ",NF = " & IIf(ChkObbligo.Checked, "1", "0") & ",NumMenu = " & NumMenu.Tag & ",GrpWeb = " & pGrpWeb.Tag & ",indice = " & pIndice.Tag & ",iva = " & pRep.SelectedIndex & ",inviowebT = " & IIf(InvioWebT.Checked, "1", "0") & ",scontabile = " & IIf(chkScontabile.Checked, "1", "0") & ",invioweb = " & IIf(ChkResto.Checked, "1", "0") & ",Palmari = " & IIf(chkBuonosr.Checked, "1", "0") & " where codice ='" & pCodint.Text & "'")
					Main.vSql2.ExecNonQuery("update " & vStr3 & " set guadagnop = " & GuadagnoP.Text & " ,guadagnov = " & GuadagnoV.Text & ",descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "' where codice ='" & pCodint.Text & "'")
					Main.vSql1.ExecNonQuery("update pagine set testo = '" & mod1.Sub209(pDes.Text.Trim) & "' where valore =" & pCodint.Text & " and tipo =3")
					Continue
				Case 34
					rsState = 37
					If Not(vBln3) Then
						Continue
					Else
						rsState = 36
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 36
				Case 36
					rsState = 37
					vBln3 = False
					Main.vSql1.ExecNonQuery("update dettmnu set indice = " & pIndice.Tag & "  where (select count(*) from anagra where anagra.codint = dettmnu.codint and anagra.reparto = " & pCodint.Text & ") > 0")
					Continue
				Case 37
					rsState = 38
					vLbl1.Text = pDes.Text.Trim
					tc = 0
					tc = vCur2.Position
					Dim cursorWrapper As Cursor
					vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & vStr6)
					vCur2.Position = tc
					Continue
				Case 38
					rsState = 41
					If Not(ChkResto.Checked) Then
						If Not(InvioWebT.Checked) Then
							Continue
						End If
					End If
					If Main.v_iprpi <> "" Then
						rsState = 40
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 40
				Case 40
					rsState = 41
					Main.vSql1.ExecNonQuery("delete from anagraDescrizioni where codint = 'Rep" & pCodint.Text & "'")
					'listofmaps = List
					listofmaps.Initialize
					'm = Map
					m.Initialize
					Dim map As Map = m
					map.Put("codint", "Rep" & pCodint.Text)
					Dim map2 As Map = m
					map2.Put("descrizione1", pWebDes1.Tag)
					Dim map3 As Map = m
					map3.Put("descrizione2", pWebDes2.Tag)
					Dim map4 As Map = m
					map4.Put("descrizione3", pWebDes3.Tag)
					Dim map5 As Map = m
					map5.Put("descrizione4", pWebDes4.Tag)
					Dim map6 As Map = m
					map6.Put("descrizione5", pWebDes5.Tag)
					listofmaps.Add(m)
					dbutil.Sub007(Main.vSql1, "anagraDescrizioni", listofmaps)
					Continue
				Case 41
					rsState = 174
					Continue
				Case 43
					rsState = 44
					Continue
				Case 44
					rsState = 47
					If mod1.Sub129(PIP.Text) Then
						Continue
					Else
						rsState = 46
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 46
				Case 46
					rsState = 47
					ToastMessageShow("Inserire un indirizzo IP valido", True)
					PIP.Text = ""
					Return
				Case 47
					rsState = 48
					itmpmaxt = 500
					Continue
				Case 48
					rsState = 53
					If Main.vBln16 Then
						Continue
					Else
						rsState = 50
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 50
				Case 50
					rsState = 53
					itmpmaxt = 25
					Continue
				Case 53
					rsState = 54
					tmpda = 0
					tmpa = 0
					Continue
				Case 54
					rsState = 57
					If Not(IsNumber(GuadagnoP.Text.Replace(",", "."))) Then
						Continue
					Else
						rsState = 56
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 56
				Case 56
					rsState = 57
					tmpda = GuadagnoP.Text
					Continue
				Case 57
					rsState = 60
					If Not(IsNumber(GuadagnoV.Text.Replace(",", "."))) Then
						Continue
					Else
						rsState = 59
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 59
				Case 59
					rsState = 60
					tmpa = GuadagnoV.Text
					Continue
				Case 60
					rsState = 63
					If tmpda <> 0 And tmpa <> 0 And (tmpa < tmpda Or tmpda < 1 Or tmpa > itmpmaxt) Then
						rsState = 62
						Continue
					End If
					Continue
				Case 62
					rsState = 63
					Dim vObjectToCharSequence As Object = "Verificare i valori del range." & CRLF & "Il valore minimo è 1, il massimo è " & itmpmaxt
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					Return
				Case 63
					rsState = 64
					If IsNumber(GuadagnoP.Text.Replace(",", ".")) Then
						str3 = GuadagnoP.Text
					Else
						str3 = "0"
					End If
					If IsNumber(GuadagnoV.Text.Replace(",", ".")) Then
						str4 = GuadagnoV.Text
					Else
						str4 = "0"
					End If
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set DaTavoloP =" & str3 & ",aTavoloP =" & str4 & ", descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',IP='" & PIP.Text & "',stato =" & pRep.SelectedIndex & ",solotessere = " & IIf(ChkObbligo.Checked, "1", "0") & " where codice =" & pCodint.Text)
					tc = 0
					tc = vCur2.Position
					Dim cursorWrapper2 As Cursor
					vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & vStr6)
					vCur2.Position = tc
					vLbl1.Text = pDes.Text.Trim & "(Pacchetti inviati: " & vCur2.GetString("compare") & ")"
					mcolor = -16776961
					Continue
				Case 64
					rsState = 77
					If Main.vInt24 <> Main.d_clients Then
						Continue
					Else
						rsState = 66
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 66
				Case 66
					rsState = 67
					Continue
				Case 67
					rsState = 76
					If Main.v_numcassa <> vCur2.GetString("codice") Then
						If vCur2.GetInt("stato") <> 3 Then
							If vCur2.GetInt("stato") = 0 Then
								rsState = 71
								Continue
							Else
								If vCur2.GetInt("stato") = 1 Then
									rsState = 73
									Continue
								Else
									If vCur2.GetInt("stato") <> 2 Then
										Continue
									Else
										rsState = 75
										Continue
									End If
								End If
							End If
						End If
					End If
					rsState = 69
					Continue
				Case 69
					rsState = 76
					mcolor = -65536
					Continue
				Case 71
					rsState = 76
					mcolor = -7829368
					Continue
				Case 73
					rsState = 76
					mcolor = -16711936
					Continue
				Case 75
					rsState = 76
					mcolor = -16776961
					Continue
				Case 76
					rsState = 77
					Continue
				Case 77
					rsState = 174
					vLbl1.Background = mod1.Sub155(mcolor, 0)
					vLbl2.Background = mod1.Sub155(mcolor, 0)
					Continue
				Case 79
					rsState = 80
					pDes.RequestFocus
					DoEvents
					tmpda = 0
					tmpa = 0
					Continue
				Case 80
					rsState = 83
					If Not(IsNumber(GuadagnoP.Text.Replace(",", "."))) Then
						Continue
					Else
						rsState = 82
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 82
				Case 82
					rsState = 83
					tmpda = GuadagnoP.Text
					Continue
				Case 83
					rsState = 86
					If Not(IsNumber(GuadagnoV.Text.Replace(",", "."))) Then
						Continue
					Else
						rsState = 85
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 85
				Case 85
					rsState = 86
					tmpa = GuadagnoV.Text
					Continue
				Case 86
					rsState = 89
					If tmpa >= tmpda And tmpda >= 20000 And tmpa >= 20000 Then
						Dim i2 As Int = tmpda
						If i2 <= Main.v_numerott + 20000 Then
							Dim i3 As Int = tmpa
							If i3 <= Main.v_numerott + 20000 Then
								Continue
							End If
						End If
					End If
					rsState = 88
					Continue
				Case 88
					rsState = 89
					Dim vObjectToCharSequence3 As Object = "Verificare i valori del range." & CRLF & "Il valore minimo è 20000, il massimo è " & Main.v_numerott + 20000
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Return
				Case 89
					rsState = 174
					If IsNumber(GuadagnoP.Text.Replace(",", ".")) Then
						str = GuadagnoP.Text
					Else
						str = "0"
					End If
					If IsNumber(GuadagnoV.Text.Replace(",", ".")) Then
						str2 = GuadagnoV.Text
					Else
						str2 = "0"
					End If
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',noazzera = " & IIf(ChkResto.Checked, "1", "0") & ",daTavolo =" & str & ",aTavolo =" & str2 & ",listino=" & pIndice.Tag & ",ImportoIngresso=" & Sub021(PIP.Text) & ",MaxImporto=" & Sub021(pPrezzo.Text) & " where codice ='" & pCodint.Text & "'")
					vLbl1.Text = pDes.Text.Trim
					tc = 0
					tc = vCur2.Position
					Dim cursorWrapper3 As Cursor
					vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & vStr6)
					vCur2.Position = tc
					Continue
				Case 91
					rsState = 92
					tmpaliquota = 0
					Continue
				Case 92
					rsState = 95
					If Not(IsNumber(pPrezzo.Text.Replace(",", "."))) Then
						Continue
					Else
						rsState = 94
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 94
				Case 94
					rsState = 95
					tmpaliquota = pPrezzo.Text
					Continue
				Case 95
					rsState = 96
					tmpaliquota = Round2(tmpaliquota, 2)
					Continue
				Case 96
					rsState = 99
					If tmpaliquota >= 0 And tmpaliquota < 100 Then
						Continue
					Else
						rsState = 98
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 98
				Case 98
					rsState = 99
					ToastMessageShow("Inserire una aliquota valida", True)
					pPrezzo.Text = ""
					Return
				Case 99
					rsState = 100
					Sub022()
					Continue
				Case 100
					rsState = 105
					If tmpaliquota <= 0 Then
						Continue
					Else
						rsState = 102
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 102
				Case 102
					rsState = 105
					pNaturaIva.SelectedIndex = 0
					Continue
				Case 105
					rsState = 106
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',RTIva=" & pRTIva.SelectedIndex & ",natura =" & pNaturaIva.SelectedIndex & ",aliquota2 =" & pPrezzo.Text & " where codice ='" & pCodint.Text & "'")
					vLbl1.Text = pDes.Text.Trim
					tc = 0
					tc = vCur2.Position
					Dim cursorWrapper4 As Cursor
					vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & vStr6)
					vCur2.Position = tc
					Continue
				Case 106
					rsState = 115
					If Main.vccefdll1.vStr4 <> "" Then
						rsState = 108
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 108
				Case 108
					rsState = 109
					mcolor = -1
					Continue
				Case 109
					rsState = 114
					If vCur2.GetString("descrizione").ToLowerCase = "da inserire" Then
						rsState = 111
						Continue
					Else
						If vCur2.GetInt("RTIva") <> 0 Then
							Continue
						Else
							rsState = 113
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 111
				Case 111
					rsState = 114
					mcolor = -7237231
					Continue
				Case 113
					rsState = 114
					mcolor = -65536
					vLbl1.Text = vLbl1.Text & " (configurare il codice Iva RT)"
					Continue
				Case 114
					rsState = 115
					vLbl1.Background = mod1.Sub155(mcolor, 0)
					vLbl2.Background = mod1.Sub155(mcolor, 0)
					Continue
				Case 115
					rsState = 174
					Continue
				Case 117
					rsState = 118
					Continue
				Case 118
					rsState = 125
					If Main.vInt24 = Main.d_grvariazioni Then
						rsState = 120
						Continue
					Else
						If Main.vInt24 = Main.d_allergeni Then
							rsState = 122
							Continue
						Else
							rsState = 124
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 120
				Case 120
					rsState = 125
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',vEsclusive = " & IIf(chkBuonosr.Checked, "1", "0") & ",indice = " & pIndice.Tag & " where codice ='" & pCodint.Text & "'")
					Continue
				Case 122
					rsState = 125
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',tag = " & IIf(ChkObbligo.Checked, "1", "0") & " where codice ='" & pCodint.Text & "'")
					Continue
				Case 124
					rsState = 125
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "' where codice ='" & pCodint.Text & "'")
					Continue
				Case 125
					rsState = 134
					If Main.vInt24 <> Main.d_ingredienti Then
						If Main.vInt24 <> Main.d_allergeni Then
							Continue
						End If
					End If
					If Main.v_iprpi <> "" Then
						rsState = 127
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 127
				Case 127
					rsState = 128
					tmpprefisso = "Ing"
					Continue
				Case 128
					rsState = 133
					If Main.vInt24 <> Main.d_allergeni Then
						Continue
					Else
						rsState = 130
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 130
				Case 130
					rsState = 133
					tmpprefisso = "All"
					Continue
				Case 133
					rsState = 134
					Main.vSql1.ExecNonQuery("delete from anagraDescrizioni where codint = '" & tmpprefisso & pCodint.Text & "'")
					'listofmaps = List
					listofmaps.Initialize
					'm = Map
					m.Initialize
					Dim map7 As Map = m
					map7.Put("codint", tmpprefisso & pCodint.Text)
					Dim map8 As Map = m
					map8.Put("descrizione1", pWebDes1.Tag)
					Dim map9 As Map = m
					map9.Put("descrizione2", pWebDes2.Tag)
					Dim map10 As Map = m
					map10.Put("descrizione3", pWebDes3.Tag)
					Dim map11 As Map = m
					map11.Put("descrizione4", pWebDes4.Tag)
					Dim map12 As Map = m
					map12.Put("descrizione5", pWebDes5.Tag)
					listofmaps.Add(m)
					dbutil.Sub007(Main.vSql1, "anagraDescrizioni", listofmaps)
					Continue
				Case 134
					rsState = 174
					vLbl1.Text = pDes.Text.Trim
					tc = 0
					tc = vCur2.Position
					Dim cursorWrapper5 As Cursor
					vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & vStr6)
					vCur2.Position = tc
					Continue
				Case 136
					rsState = 137
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',AttivoStessaPIDiretta = " & pNaturaIva.SelectedIndex & ",AttivoStessaPIDifferita = " & pRTIva.SelectedIndex & ",AttivoDiretta = " & pCopia.SelectedIndex & ",AttivoDifferita = " & pBuonoComePag.SelectedIndex & " where codice ='" & pCodint.Text & "'")
					Continue
				Case 137
					rsState = 140
					If pCopia.SelectedIndex <> 2 Then
						Continue
					Else
						rsState = 139
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 139
				Case 139
					rsState = 140
					Main.vSql1.ExecNonQuery("update " & SmartStringFormatter("", vStr3) & " set AttivoDiretta=1 where AttivoDiretta=2 and codice <> " & SmartStringFormatter("", pCodint.Text) & "")
					Continue
				Case 140
					rsState = 143
					If pBuonoComePag.SelectedIndex <> 2 Then
						Continue
					Else
						rsState = 142
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 142
				Case 142
					rsState = 143
					Main.vSql1.ExecNonQuery("update " & SmartStringFormatter("", vStr3) & " set AttivoDifferita=1 where AttivoDifferita=2 and codice <> " & SmartStringFormatter("", pCodint.Text) & "")
					Continue
				Case 143
					rsState = 146
					If pNaturaIva.SelectedIndex <> 2 Then
						Continue
					Else
						rsState = 145
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 145
				Case 145
					rsState = 146
					Main.vSql1.ExecNonQuery("update " & SmartStringFormatter("", vStr3) & " set AttivoStessaPIDiretta=1 where AttivoStessaPIDiretta=2 and codice <> " & SmartStringFormatter("", pCodint.Text) & "")
					Continue
				Case 146
					rsState = 149
					If pRTIva.SelectedIndex <> 2 Then
						Continue
					Else
						rsState = 148
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 148
				Case 148
					rsState = 149
					Main.vSql1.ExecNonQuery("update " & SmartStringFormatter("", vStr3) & " set AttivoStessaPIDifferita=1 where AttivoStessaPIDifferita=2 and codice <> " & SmartStringFormatter("", pCodint.Text) & "")
					Continue
				Case 149
					rsState = 150
					vLbl1.Text = pDes.Text.Trim
					tc = 0
					tc = vCur2.Position
					Dim cursorWrapper6 As Cursor
					vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & vStr6)
					vCur2.Position = tc
					mcolor = -1
					Continue
				Case 150
					rsState = 155
					If vCur2.GetInt("AttivoDiretta") <= 0 Then
						If vCur2.GetInt("AttivoDifferita") <= 0 Then
							If vCur2.GetInt("AttivoStessaPIDifferita") <= 0 Then
								If vCur2.GetInt("AttivoStessaPIDiretta") <= 0 Then
									Continue
								End If
							End If
							rsState = 154
							Continue
						End If
					End If
					rsState = 152
					Continue
				Case 152
					rsState = 155
					mcolor = -11337984
					Continue
				Case 154
					rsState = 155
					mcolor = -1638637
					Continue
				Case 155
					rsState = 174
					vLbl1.Background = mod1.Sub155(mcolor, 0)
					vLbl2.Background = mod1.Sub155(mcolor, 0)
					Continue
				Case 157
					rsState = 158
					Continue
				Case 158
					rsState = 163
					If pCodint.Text = "30" Then
						rsState = 160
						Continue
					Else
						rsState = 162
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 160
				Case 160
					rsState = 163
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set TipoPrepagato=" & pTipoPrepagato.SelectedIndex & ",GeneraPunti = " & IIf(chkGeneraPunti.Checked, "1", "0") & ", copiascontrino=" & pCopia.SelectedIndex & ",RTPagamento=" & pRTIva.SelectedIndex & ", cassa =" & pRep.SelectedIndex & ",pagamentopalmare = " & IIf(PagamentoPalmare.Checked, "1", "0") & ",glory = " & IIf(chkGlory.Checked, "1", "0") & ",resto = " & IIf(ChkResto.Checked, "1", "0") & ",SempreDocFisc = " & IIf(SempreDocFisc.Checked, "1", "0") & ",obbligo = " & IIf(ChkObbligo.Checked, "1", "0") & ",buonosr = " & IIf(chkBuonosr.Checked, "1", "0") & " where codice ='" & pCodint.Text & "'")
					Continue
				Case 162
					rsState = 163
					Main.vSql1.ExecNonQuery("update " & vStr3 & " set PortaEft=" & pPortaEft.Tag & ",GeneraPunti = " & IIf(chkGeneraPunti.Checked, "1", "0") & ",RTPagamento=" & pRTIva.SelectedIndex & ",pagamentopalmare = " & IIf(PagamentoPalmare.Checked, "1", "0") & ", IpEft='" & pIpEft.Tag & "',SempreDocFisc = " & IIf(SempreDocFisc.Checked, "1", "0") & ",BuonoComeP =" & pBuonoComePag.SelectedIndex & ", CausaleEft =" & pEft.SelectedIndex & ",descrizione ='" & mod1.Sub209(pDes.Text.Trim) & "',TipoPrepagato=" & pTipoPrepagato.SelectedIndex & ",copiascontrino=" & pCopia.SelectedIndex & ",cassa =" & pRep.SelectedIndex & ",glory = " & IIf(chkGlory.Checked, "1", "0") & ",resto = " & IIf(ChkResto.Checked, "1", "0") & ",obbligo = " & IIf(ChkObbligo.Checked, "1", "0") & ",buonosr = " & IIf(chkBuonosr.Checked, "1", "0") & " where codice ='" & pCodint.Text & "'")
					Continue
				Case 163
					rsState = 164
					vLbl1.Text = pDes.Text.Trim
					tc = 0
					tc = vCur2.Position
					Dim cursorWrapper7 As Cursor
					vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & " order by codice")
					vCur2.Position = tc
					pBuonoComePag.Clear
					pBuonoComePag.Add("Nessuno")
					populatespinner(pBuonoComePag, "pagamenti", False)
					pBuonoComePag.SelectedIndex = vCur2.GetInt("BuonoComeP")
					Continue
				Case 164
					rsState = 173
					If Main.vccefdll1.vStr4 <> "" Then
						rsState = 166
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 166
				Case 166
					rsState = 167
					mcolor = -1
					Continue
				Case 167
					rsState = 172
					If vCur2.GetString("descrizione").ToLowerCase = "da inserire" Then
						rsState = 169
						Continue
					Else
						If vCur2.GetInt("RTPagamento") <> 0 Then
							Continue
						Else
							rsState = 171
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 169
				Case 169
					rsState = 172
					mcolor = -7237231
					Continue
				Case 171
					rsState = 172
					mcolor = -65536
					vLbl1.Text = vLbl1.Text & " (configurare il codice pagamento RT)"
					Continue
				Case 172
					rsState = 173
					vLbl1.Background = mod1.Sub155(mcolor, 0)
					vLbl2.Background = mod1.Sub155(mcolor, 0)
					Continue
				Case 173
					rsState = 174
					Continue
				Case 174
					rsState = 179
					If Main.vInt24 = Main.d_linguew Then
						Continue
					Else
						If Main.vInt24 = Main.d_allergeni Then
							Continue
						Else
							If Main.vInt24 = Main.d_ingredienti Then
								Continue
							Else
								If Main.vInt24 = Main.d_grvariazioni Then
									Continue
								Else
									rsState = 176
									Continue
								End If
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 176
				Case 176
					rsState = 179
					pConferma.Enabled = False
					Continue
				Case 179
					rsState = 182
					mod1.Sub081
					Continue
				Case 181
					rsState = 182
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 182
					rsState = -1
					rsCatchState = 0
					Continue
				Case 183
					rsState = 4
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

Sub pCopia_ItemClick(i As Int, obj As Object)
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
		If Main.vInt24 <> Main.d_documentifattura Then
			pDes.Text = str
			pDes.SelectionStart = str.Length
		End If
	End If
	If Not(vBln4) And Not(pConferma.Enabled) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub pEft_ItemClick(i As Int, obj As Object)
	pConferma.Enabled = True
	pIpEft.Visible = i > 0
	pPortaEft.Visible = i > 0
	If i > 0 Then
		pipeft_click()
		pportaeft_click()
		Return
	End If
End Sub

Sub pGrpWeb_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 1
	numberDialog.Number = pGrpWeb.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	pConferma.Enabled = True
	Dim vShow As Int = numberDialog.Show("Inserire il codice di gruppo per il Web del reparto  ", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		pGrpWeb.Text = "Codice di Gruppo Web del reparto: " & numberDialog.Number
		pGrpWeb.Tag = numberDialog.Number
		Return
	End If
End Sub

Sub pImport_Click
	Dim vObjectToCharSequence As Object = "Attenzione ... Questa procedura importa nuovi ingredienti (con le relative lingue) e elimina quelli eventualmente inseriti. Si desidera proseguire ?"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		vDlg1.Input = ""
		vDlg1.PasswordMode = True
		vDlg1.Hint = "Password di accesso"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire la Password di accesso ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			If vDlg1.Input = "147896" Or vDlg1.Input = "3698741" Then
				ProgressDialogShow2("Attendere  ... elaborazione in corso ", False)
				mod1.Sub120(File.DirAssets, "ingredienti.sql", "", False)
				Dim cursorWrapper As Cursor
				vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & vStr6)
				vcustomlistviewold1.Sub004
				If vCur2.RowCount > 0 Then
					Dim rowCount As Int = vCur2.RowCount - 1
					Dim i As Int
					For i = 0 To rowCount
						vCur2.Position = i
						vcustomlistviewold1.Sub001(Sub005(i, vCur2.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur2.GetString("descrizione"))
					Next
					vcustomlistviewold1.Sub012(0)
					Sub018(0)
					Sub016(vPnl1)
				End If
				ProgressDialogHide
				Return
			End If
			Return
		End If
		Return
	End If
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub pIndice_Click
	Dim limit13 As Int
	Dim limit19 As Int
	Dim step13 As Int
	Dim step19 As Int
	Dim sf As Object
	Dim pnl As Panel
	Dim i As Int
	Dim res As Int
	Dim x As Int
	Dim stmpmacro As tmacro
	Dim lslistino As List
	Dim mpx As id
	Dim m As Int
	Dim nd As NumberDialog
	Dim txt1 As String
	Dim txt2 As String
	Dim ret As Int
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
					rsState = 44
					If Main.vInt24 = Main.d_macro Then
						rsState = 3
						Continue
					Else
						If Main.vInt24 = Main.d_tavolitessere Then
							rsState = 23
							Continue
						Else
							rsState = 35
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 3
				Case 3
					rsState = 4
					Continue
				Case 4
					rsState = 21
					rsCatchState = 20
					rsState = 6
					Continue
				Case 6
					rsState = 7
					rsCatchState = 20
					sf = vCustomLayoutDialog1.ShowAsync("Inserire le funzioni alla macro ", "Ok", "Annulla", "", Main.vBmp1, True)
					vCustomLayoutDialog1.SetSize(PerXToCurrent(80), PerYToCurrent(90))
					Wait For (sf) Dialog_Ready (wf45_0 As Panel)
					rsState = 45
					Continue
				Case 7
					rsState = 10
					step13 = 1
					limit13 = vCur4.RowCount - 1
					i = 0
					rsState = 46
					Continue
				Case 9
					rsState = 47
					vCur4.Position = i
					Dim i3 As Int = i
					Dim vDipToCurrent As Int = DipToCurrent(50)
					vcustomlistviewold3.Sub001(Sub006(i3, vDipToCurrent, vCur4), DipToCurrent(50), "")
					Continue
				Case 10
					rsState = 11
					Wait For (sf) Dialog_Result (wf48_0 As Int)
					rsState = 48
					Continue
				Case 11
					rsState = 18
					Dim i4 As Int = res
					If i4 <> -1 Then
						Continue
					Else
						rsState = 13
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 13
				Case 13
					rsState = 14
					Continue
				Case 14
					rsState = 17
					step19 = 1
					limit19 = vMap2.Size - 1
					x = 0
					rsState = 49
					Continue
				Case 16
					rsState = 50
					vCur4.Position = x
					stmpmacro = vMap2.Get(x)
					Main.vSql1.ExecNonQuery("update Macro set qta=" & SmartStringFormatter("", stmpmacro.qta) & ",funzione=" & SmartStringFormatter("", stmpmacro.funzione) & ",valore='" & SmartStringFormatter("", stmpmacro.valore) & "' where chiave = " & SmartStringFormatter("", vCur4.GetString("chiave")) & "")
					Continue
				Case 17
					rsState = 18
					Continue
				Case 18
					rsState = 21
					Continue
				Case 20
					rsState = 21
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 21
					rsState = 44
					rsCatchState = 0
					Continue
				Case 23
					rsState = 24
					'lslistino = List
					lslistino.Initialize
					lslistino.AddAll(ArrayToList(Array As String("Lascia Invariato", "Listino 1", "Listino 2", "Listino 3", "Listino 4")))
					'mpx = id
					Dim idVar As id = mpx
					m = idLib.InputList1(lslistino, "Selezionare il listino per questo gruppo")
					Continue
				Case 24
					rsState = 33
					If m < 0 Then
						Continue
					Else
						rsState = 26
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 26
				Case 26
					rsState = 27
					Continue
				Case 27
					rsState = 32
					If m = 0 Then
						rsState = 29
						Continue
					Else
						rsState = 31
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 29
				Case 29
					rsState = 32
					pIndice.Text = "Listino attivo per questo range di tavoli-tessere: Lascia invariato"
					Continue
				Case 31
					rsState = 32
					pIndice.Text = "Listino attivo per questo range di tavoli-tessere: " & m
					Continue
				Case 32
					rsState = 33
					pIndice.Tag = m
					Continue
				Case 33
					rsState = 44
					Continue
				Case 35
					rsState = 36
					'nd = NumberDialog
					nd.Digits = 3
					Dim numberDialog As NumberDialog = nd
					numberDialog.Number = pIndice.Tag
					nd.Decimal = 0
					nd.ShowSign = False
					pConferma.Enabled = True
					txt1 = "Inserire l'indice di ordinamento del reparto (per il menù del giorno) "
					txt2 = "Indice per menù del Giorno o stampa documento:"
					Continue
				Case 36
					rsState = 39
					If Main.vInt24 <> Main.d_grvariazioni Then
						Continue
					Else
						rsState = 38
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 38
				Case 38
					rsState = 39
					txt1 = "Inserire l'indice di ordinamento per le variazioni "
					txt2 = "Indice per ordinamento variazioni:"
					nd.Digits = 1
					Continue
				Case 39
					rsState = 40
					Dim numberDialog2 As NumberDialog = nd
					Dim str As String = txt1
					ret = numberDialog2.Show(str, "Ok", "Annulla", "", Main.vBmp1)
					Continue
				Case 40
					rsState = 43
					Dim i6 As Int = ret
					If i6 <> -1 Then
						Continue
					Else
						rsState = 42
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 42
				Case 42
					rsState = 43
					pIndice.Text = txt2 & nd.Number
					pIndice.Tag = nd.Number
					vBln3 = True
					Continue
				Case 43
					rsState = 44
					Continue
				Case 44
					rsState = -1
					mod1.Sub081
					Continue
				Case 45
					rsState = 7
					pnl = wf45_0
					pnl.LoadLayout("schedamenu")
					vMap2.Initialize
					vcustomlistviewold3.Initialize(pnlMenu, "clvm")
					vcustomlistviewold3.vInt3 = -16776961
					Dim view As View = vcustomlistviewold3.Sub003
					Dim vPerXToCurrent As Int = PerXToCurrent(80)
					pnlMenu.AddView(view, 0, 0, vPerXToCurrent, pnlMenu.Height)
					vcustomlistviewold3.Sub021(-1)
					Dim cursorWrapper As Cursor
					vCur4 = Main.vSql1.ExecQuery("select * from Macro where codice = " & pCodint.Text)
					Continue
				Case 46
					rsState = 10
					If (step13 > 0 And i <= limit13) Or (step13 < 0 And i >= limit13) Then
						rsState = 9
						Continue
					End If
					Continue
				Case 47
					rsState = 46
					i = i + 0 + step13
					Continue
				Case 48
					rsState = 11
					res = wf48_0
					Continue
				Case 49
					rsState = 17
					If (step19 > 0 And x <= limit19) Or (step19 < 0 And x >= limit19) Then
						rsState = 16
						Continue
					End If
					Continue
				Case 50
					rsState = 49
					x = x + 0 + step19
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

Sub Dialog_Ready(panelWrapper As Panel)
End Sub

Sub Dialog_Result(i As Int)
End Sub

Sub PIP_EnterPressed
	If Main.vInt24 <> Main.d_tavolitessere Then
		Return
	End If
	vIME1.HideKeyboard
	If PIP.Text = "" Then
		If vStr5 <> "" Then
			If vStr5 <> "0.00" Then
				PIP.Text = vStr5
				Return
			End If
		End If
	End If
	PIP.Text = NumberFormat2(Sub021(PIP.Text), 1, 2, 2, False)
	PIP.Hint = PIP.Text
End Sub

Sub PIP_FocusChanged(z As Boolean)
	If Main.vInt24 <> Main.d_tavolitessere Then
		Return
	End If
	If z Then
		vStr5 = PIP.Text
		PIP.Text = ""
		vIME1.Initialize("IME")
		Dim editText As EditText = PIP
		Dim editTextWrapper As EditText = PIP
		vIME1.SetCustomFilter(editText, 12290, "0123456789.")
		pConferma.Enabled = True
	Else
		If PIP.Text = "" Then
			If vStr5 <> "" Then
				If vStr5 <> "0.00" Then
					PIP.Text = vStr5
					PIP.Hint = PIP.Text
				End If
			End If
		End If
		PIP.Text = NumberFormat2(Sub021(PIP.Text), 1, 2, 2, False)
		PIP.Hint = PIP.Text
	End If
End Sub

Sub PIP_TextChanged(str As String, str2 As String)
	If str2.Length > 19 Then
		PIP.Text = str
		PIP.SelectionStart = str.Length
	End If
	If Not(pConferma.Enabled) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelleappoggio.java, metodo _pipeft_click (riga 5891).
Sub pIpEft_Click
	Dim vShow As Int
	Dim parseDouble As Int
	Dim z As Boolean
	'vDlg1 = InputDialog
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = pIpEft.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Indirizzo IP"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	If Not(Main.vBln25) Then
		If Not(Main.vBln24) Then
			Dim str As String = "Inserire l'indirizzo Ip per il terminale EFT della causale " & pDes.Text
			vShow = vDlg1.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow = -1 And vDlg1.Input <> "" Then
				If mod1.Sub129(vDlg1.Input) Then
					If Not(Main.vBln25) Then
					End If
					If IsNumber(vDlg1.Input) And parseDouble = vDlg1.Input > 0 And parseDouble < 10 Then
						If Main.v_ipeftm(parseDouble) <> "" Then
							pIpEft.Text = "Indice: " & parseDouble & " (Indirizzo Ip:" & Main.v_ipeftm(parseDouble) & ")"
							pIpEft.Tag = vDlg1.Input
							z = False
							If z Then
								Dim vObjectToCharSequence As Object = "inserire un indirizzo IP non valido"
								Dim vObjectToCharSequence2 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
								pIpEft.Text = "Inserire l'indirizzo Ip per il Terminale EFT"
								pIpEft.Tag = ""
							End If
						End If
					End If
					z = True
					If z Then
					End If
				Else
					pIpEft.Text = "Indirizzo Ip:" & vDlg1.Input
					pIpEft.Tag = vDlg1.Input
				End If
				pConferma.Enabled = True
			End If
			mod1.Sub081
			Return
		End If
	End If
	Dim str3 As String = "Inserire l'indirizzo Ip o l'indice per il terminale EFT della causale " & pDes.Text
	vShow = vDlg1.Show(str3, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If mod1.Sub129(vDlg1.Input) Then
		End If
		pConferma.Enabled = True
	End If
	mod1.Sub081
End Sub

Sub pIvaRT_Click
	Try
		Main.vccefdll1.vInt5 = 2
		Dim vObjectToCharSequence As Object = "Comunicazione con il Registratore telematico:" & CRLF & "Attraverso questa procedura è possibile " & SmartStringFormatter("", IIf(Main.vBln25, "", "leggere e")) & " scrivere la tabella iva del registratore." & TAB
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vObjectToString As String = IIf(Main.vBln25, "", "Leggi Tabella")
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, vObjectToString, "Annulla", "Scrivi Tabella", Main.vBmp1)
		If vMsgbox2 = -1 Then
			Dim mf_leggiiva As String = Main.vccefdll1.mf_leggiiva
			If mf_leggiiva <> "" Then
				Dim length As Int = mf_leggiiva.Length - 1
				Dim i As Int
				For i = 0 To length Step 4
					Dim parseDouble As Int = mf_leggiiva.SubString2(i, i + 2)
					If parseDouble <> 0 Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from iva where aliquota2=" & SmartStringFormatter("", parseDouble) & "") = 0 Then
							Dim vObjectToCharSequence3 As Object = "Il registratore telematico contiene l'iva " & SmartStringFormatter("", parseDouble) & " non presente in questa tabella"
							Dim vObjectToCharSequence4 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
						Else
							Main.vSql1.ExecNonQuery("Update iva set RTIva=" & SmartStringFormatter("", i / 4 + 1) & " where aliquota2=" & SmartStringFormatter("", parseDouble) & "")
						End If
					End If
				Next
				Dim vObjectToCharSequence5 As Object = "Configurare manualmente i tipi di esenzione RT per le aliquote a 0."
				Dim vObjectToCharSequence6 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				Main.vSql1.ExecNonQuery("update versione set ivacassa='" & SmartStringFormatter("", modfunstr.left(mf_leggiiva, 20)) & "'")
				Sub020()
			End If
		Else
			If vMsgbox2 = -2 Then
				If Main.vccefdll1.mf_dayisopen Then
					Dim vObjectToCharSequence7 As Object = "Il cambio iva sul Registratore telematico è possibile solo dopo un azzeramento"
					Dim vObjectToCharSequence8 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				Dim stringBuilderWrapper As StringBuilder
				stringBuilderWrapper.Initialize
				Dim i2 As Int
				For i2 = 1 To 5
					Main.vSql1.ExecQuerySingleResult("Select aliquota2 from iva where RTIva<=5")
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from iva where RTIva=" & SmartStringFormatter("", i2) & "") > 0 Then
						stringBuilderWrapper.Append(NumberFormat2(Round2(Main.vSql1.ExecQuerySingleResult("Select aliquota2 from iva where RTIva=" & SmartStringFormatter("", i2) & "") * 100, 0), 4, 0, 0, False))
					Else
						stringBuilderWrapper.Append("0000")
					End If
				Next
				stringBuilderWrapper.Append("000000000000000000000000")
				Main.vccefdll1.vBln14 = True
				Main.vccefdll1.Sub026("220207", 1)
				Main.vccefdll1.vBln14 = False
				Main.vccefdll1.mf_scriviiva(stringBuilderWrapper.ToString)
				Sub002(True)
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Main.vccefdll1.vInt5 = 0
	mod1.Sub081
End Sub

Sub pNaturaIva_ItemClick(i As Int, obj As Object)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub populatespinner(spinnerWrapper As Spinner, str As String, z As Boolean)
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	If z Then
		Try
			spinnerWrapper.Clear
		Catch
			mod1.Sub217(LastException.Message)
			Return
		End Try
	End If
	If str = "pagamenti" Then
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("SELECT * FROM " & str & " where codice <32 order by codice")
	Else
		Dim cursorWrapper2 As Cursor
		vCur1 = Main.vSql1.ExecQuery("SELECT * FROM " & str & " order by codice")
	End If
	Dim rowCount As Int = vCur1.RowCount - 1
	Dim i As Int = 0
	Do While i <= rowCount
		DoEvents
		vCur1.Position = i
		If str = "FERegFiscale" Then
			spinnerWrapper.Add(IIf(i > 0, vCur1.GetString("Sigla") & " - " & vCur1.GetString("Descrizione"), vCur1.GetString("Descrizione")))
		Else
			spinnerWrapper.Add(vCur1.GetString("descrizione"))
		End If
		i = i + 1
	Loop
	vCur1.Close
End Sub

Sub Sub012(spinnerWrapper As Spinner)
	mod1.vStr2 = "Sub PopulateSpinnerPag(TmpSpin As Spinner)"
	Try
		spinnerWrapper.Clear
		spinnerWrapper.Add("Non Attivo")
		spinnerWrapper.Add("Attivo")
		spinnerWrapper.Add("Da Aggiornare")
		spinnerWrapper.Add("In errore")
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub013(spinnerWrapper As Spinner)
	mod1.vStr2 = "Sub PopulateSpinnerPag(TmpSpin As Spinner)"
	Try
		spinnerWrapper.Clear
		spinnerWrapper.Add("NESSUNO")
		spinnerWrapper.Add("Bancomat")
		spinnerWrapper.Add("Carte di Credito")
		spinnerWrapper.Add("Altra Carta")
		spinnerWrapper.Add("Riconoscimento Automatico")
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub014(spinnerWrapper As Spinner)
	mod1.vStr2 = "Sub PopulateSpinnerPag(TmpSpin As Spinner)"
	Try
		spinnerWrapper.Clear
		spinnerWrapper.Add("Riscosso")
		spinnerWrapper.Add("Non Riscosso")
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub015(spinnerWrapper As Spinner)
	mod1.vStr2 = "Sub PopulateSpinnerPagRT(TmpSpin As Spinner)"
	Try
		spinnerWrapper.Clear
		spinnerWrapper.Add(" 0 - NON CONFIGURATO")
		spinnerWrapper.Add(" 1 - CONTANTI")
		spinnerWrapper.Add(" 2 - ASSEGNI")
		spinnerWrapper.Add(" 3 - CARTA DI CREDITO")
		spinnerWrapper.Add(" 4 - PAGAMENTO GENERICO")
		spinnerWrapper.Add(" 5 - PAGAMENTO BUONO PASTO")
		spinnerWrapper.Add(" 6 - SOSPESO")
		spinnerWrapper.Add(" 7 - NON RISCOSSO BENI")
		spinnerWrapper.Add(" 8 - BANCOMAT")
		spinnerWrapper.Add(" 9 - PAGAMENTO 9")
		spinnerWrapper.Add("10 - PAGAMENTO 10")
		spinnerWrapper.Add("50 - NON RISCOSSO SERVIZI")
		spinnerWrapper.Add("51 - NON RISCOSSO FATTURE")
		spinnerWrapper.Add("52 - NON RISCOSSO DCR A SSN")
		spinnerWrapper.Add("53 - SCONTO A PAGARE")
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub pOrdina_Click
	If vStr6 = " order by descrizione" Then
		vStr6 = " order by codice"
	Else
		vStr6 = " order by descrizione"
	End If
	Sub020()
End Sub

Sub pPortaEft_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 5
	numberDialog.Number = pPortaEft.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	pConferma.Enabled = True
	Dim vShow As Int = numberDialog.Show("Inserire la porta per il lettore EFT (default 1000)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number > 0 And numberDialog.Number < 65535 Then
			pPortaEft.Text = "Porta EFT:" & numberDialog.Number
			pPortaEft.Tag = numberDialog.Number
			pConferma.Enabled = True
		Else
			Dim vObjectToCharSequence As Object = "Valore di porta non valido"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

Sub pPrezzo_EnterPressed
	vIME1.HideKeyboard
	If pPrezzo.Text = "" Then
		If vStr5 <> "" Then
			If vStr5 <> "0.00" Then
				pPrezzo.Text = vStr5
				Return
			End If
		End If
	End If
	If Main.vInt24 = Main.d_ive Then
		If IsNumber(pPrezzo.Text.Replace(",", ".")) Then
			pPrezzo.Text = NumberFormat2(pPrezzo.Text.Replace(",", "."), 1, 2, 2, False)
		Else
			pPrezzo.Text = 0
		End If
		If pPrezzo.Text > 0 Then
			pNaturaIva.SelectedIndex = 0
			pNaturaIva.Visible = False
		Else
			pNaturaIva.Visible = True
		End If
		lNaturaIva.Visible = pNaturaIva.Visible
	Else
		pPrezzo.Text = NumberFormat2(Sub021(pPrezzo.Text), 1, 2, 2, False)
	End If
	pConferma.Enabled = True
	pPrezzo.Hint = pPrezzo.Text
End Sub

Sub pPrezzo_FocusChanged(z As Boolean)
	If z Then
		vStr5 = pPrezzo.Text
		pPrezzo.Text = ""
		vIME1.Initialize("IME")
		Dim editText As EditText = pPrezzo
		Dim editTextWrapper As EditText = pPrezzo
		vIME1.SetCustomFilter(editText, 12290, "0123456789.")
		pConferma.Enabled = True
		Return
	End If
	If pPrezzo.Text = "" Or pPrezzo.Text = "0" Then
		If vStr5 <> "" Then
			If vStr5 <> "0.00" Then
				If vStr5 <> "0" Then
					pPrezzo.Text = vStr5
					pPrezzo.Hint = pPrezzo.Text
					Return
				End If
			End If
		End If
	End If
	If Main.vInt24 = Main.d_ive Then
		If IsNumber(pPrezzo.Text.Replace(",", ".")) Then
			pPrezzo.Text = NumberFormat2(pPrezzo.Text.Replace(",", "."), 1, 2, 2, False)
		Else
			pPrezzo.Text = 0
		End If
		If pPrezzo.Text > 0 Then
			pNaturaIva.SelectedIndex = 0
			pNaturaIva.Visible = False
		Else
			pNaturaIva.Visible = True
		End If
		lNaturaIva.Visible = pNaturaIva.Visible
	Else
		pPrezzo.Text = NumberFormat2(Sub021(pPrezzo.Text), 1, 2, 2, False)
	End If
	pPrezzo.Hint = pPrezzo.Text
End Sub

Sub pPrezzo_TextChanged(str As String, str2 As String)
	If str2.Length > 8 Then
		pPrezzo.Text = str
		pPrezzo.SelectionStart = str.Length
	End If
	If Not(vBln4) And Not(pConferma.Enabled) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub pRep_ItemClick(i As Int, obj As Object)
	If Main.vInt24 = Main.d_clients And i > 0 And PIP.Text = "" Then
		Dim vObjectToCharSequence As Object = "Impostare l'indirizzo IP del terminale prima di attivarlo."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		pRep.SelectedIndex = 0
	End If
	pConferma.Enabled = True
	mod1.Sub081
End Sub

Sub pRTIva_ItemClick(i As Int, obj As Object)
	Sub017(i)
	PagamentoPalmare.Checked = False
	pConferma.Enabled = True
End Sub

Sub pTA_ItemClick(i As Int, obj As Object)
	pConferma.Enabled = True
End Sub

Sub pTipoPrepagato_ItemClick(i As Int, obj As Object)
	pConferma.Enabled = True
End Sub

Sub pWebDes1_Click
	Dim buttonWrapper As Button = Sender
	vCur3.Position = 0
	Sub004(buttonWrapper)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub pWebDes2_Click
	Dim buttonWrapper As Button = Sender
	vCur3.Position = 1
	Sub004(buttonWrapper)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub pWebDes3_Click
	Dim buttonWrapper As Button = Sender
	vCur3.Position = 2
	Sub004(buttonWrapper)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub pWebDes4_Click
	Dim buttonWrapper As Button = Sender
	vCur3.Position = 3
	Sub004(buttonWrapper)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub pWebDes5_Click
	Dim buttonWrapper As Button = Sender
	vCur3.Position = 4
	Sub004(buttonWrapper)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub Qtamacro_Click
	Dim vTmp As Int
	mod1.vStr2 = "Sub ValMacro_Click"
	Try
		vTmp = vcustomlistviewold3.Sub007(Sender)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vTmp < 0 Then
		Return
	End If
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim spinnerWrapper As Spinner = getpanel.GetView(0)
	Dim labelWrapper As Label = getpanel.GetView(1)
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	vCur4.Position = vTmp
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = labelWrapper2.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire la quantità ", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And numberDialog.Number > 0 Then
		labelWrapper2.Tag = numberDialog.Number
		labelWrapper2.Text = "Qta:" & CRLF & labelWrapper2.Tag
		Dim tmacroVar As tmacro
		tmacroVar.funzione = vMap1.GetValueAt(spinnerWrapper.SelectedIndex)
		tmacroVar.valore = labelWrapper.Tag
		tmacroVar.qta = labelWrapper2.Tag
		vMap2.Put(vTmp, tmacroVar)
	End If
End Sub

Sub Sub016(concreteViewWrapper As View)
	mod1.vStr2 = "Sub RowSelected(mSender As View)"
	Try
		If Main.vInt24 <> Main.d_linguew Then
			If Main.vInt24 <> Main.d_ingredienti Then
				If Main.vInt24 <> Main.d_allergeni Then
					If Main.vInt24 <> Main.d_grvariazioni Then
						pConferma.Enabled = False
					End If
				End If
			End If
		End If
		vIME1.HideKeyboard
		Dim vTmp As Int = vcustomlistviewold1.Sub007(concreteViewWrapper)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		vLbl2 = getpanel.GetView(0)
		vLbl1 = getpanel.GetView(1)
		Sub018(getpanel.GetView(2).Text)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Selrow_Click
	mod1.vStr2 = "Sub selrow_Click"
	Sub016(Sender)
End Sub

Sub Selrow_LongClick
	If Main.vInt24 <> Main.d_clients Then
		Return
	End If
	mod1.vStr2 = "Sub selrow_LongClick"
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	vLbl2 = getpanel.GetView(0)
	vLbl1 = getpanel.GetView(1)
	Sub018(getpanel.GetView(2).Text)
	If Main.v_numcassa = vCur2.GetString("codice") Then
		Return
	End If
	Dim vObjectToCharSequence As Object = "Confermi l'azzeramento del numero dei pacchetti inviati ?"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Main.vSql1.ExecNonQuery("update clients set compare =0 where codice = " & vCur2.GetString("codice"))
		vLbl1.Text = vCur2.GetString("descrizione") & "(Pacchetti inviati: 0)"
	End If
End Sub

Sub SempreDocFisc_CheckedChange(z As Boolean)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
End Sub

Sub Sub017(i As Int)
	If i = 1 Then
		PagamentoPalmare.Visible = True
		PagamentoPalmare.Text = "Pagamento per DCV in contanti generati dal palmare"
		Return
	End If
	If i = 3 Or i = 8 Then
		PagamentoPalmare.Visible = True
		PagamentoPalmare.Text = "Pagamento per DCV con pagamento elettronico generati dal palmare"
		Return
	End If
	PagamentoPalmare.Visible = False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelleappoggio.java, metodo m5… (riga 6615).
Sub Sub018(i As Int)
	Dim parseDouble As Int
	Dim z As Boolean
	mod1.vStr2 = "Sub updCtrls(indice As Int)"
	Try
		vBln4 = True
		vCur2.Position = i
		pCodint.Text = vCur2.GetString("codice")
		pCodint.Enabled = False
		pDes.Text = vCur2.GetString("descrizione")
		lblTitolo.Text = vStr1 & " " & pDes.Text
		If Main.vInt24 = Main.d_documentifattura Then
			lblTitolo.Text = vStr1 & " " & pDes.Text.SubString2(0, 4)
		End If
		Dim valueOf As Int = Main.vInt24
		Select valueOf
			Case Main.d_clients
				pRep.SelectedIndex = vCur2.GetInt("stato")
				PIP.Text = vCur2.GetString("IP")
				pRep.Enabled = Main.v_numcassa <> vCur2.GetString("codice")
				PIP.Enabled = Main.v_numcassa <> vCur2.GetString("codice")
				pDes.Enabled = Main.v_numcassa <> vCur2.GetString("codice")
				ChkObbligo.Enabled = Main.v_numcassa <> vCur2.GetString("codice")
				ChkObbligo.Checked = vCur2.GetInt("solotessere") = 1
				GuadagnoP.Text = vCur2.GetString("DaTavoloP")
				GuadagnoV.Text = vCur2.GetString("aTavoloP")
			Case Main.d_reparti
				pRep.SelectedIndex = vCur2.GetInt("iva")
				pPrezzo.Text = NumberFormat2(vCur2.GetString("maximpo"), 1, 2, 2, False)
				GuadagnoP.Text = NumberFormat2(vCur2.GetString("guadagnop"), 1, 2, 2, False)
				GuadagnoV.Text = NumberFormat2(vCur2.GetString("guadagnov"), 1, 2, 2, False)
				ChkObbligo.Checked = vCur2.GetInt("NF") = 1
				chkVincite.Checked = vCur2.GetInt("vincite") = 1
				pIndice.Text = "Indice per menù del Giorno o stampa documento: " & vCur2.GetString("indice")
				pGrpWeb.Text = "Codice di Gruppo Web del reparto: " & vCur2.GetString("GrpWeb")
				pIndice.Tag = vCur2.GetString("indice")
				pGrpWeb.Tag = vCur2.GetString("GrpWeb")
				NumMenu.Tag = vCur2.GetInt("NumMenu")
				NumMenu.Text = "Menù Attivo:" & Sub009(vCur2.GetInt("NumMenu"))
				chkBuonosr.Checked = vCur2.GetInt("Palmari") = 1
				ChkResto.Checked = vCur2.GetInt("invioweb") = 1
				InvioWebT.Checked = vCur2.GetInt("inviowebT") = 1
				chkScontabile.Checked = vCur2.GetInt("scontabile") = 1
				verificaWeb.Checked = vCur2.GetInt("verificaWeb") = 1
				If ChkResto.Checked Or InvioWebT.Checked Then
				End If
				If Not(Main.v_totem) Then
					r6 = False
				End If
				pWebDes1.Visible = r6
				pWebDes2.Visible = r6
				pWebDes3.Visible = r6
				pWebDes4.Visible = r6
				pWebDes5.Visible = r6
				If ChkResto.Checked Or InvioWebT.Checked Then
					Sub019("Rep")
				End If
				vBln3 = False
				pTA.SelectedIndex = vCur2.GetInt("TurnoP")
			Case Main.d_tavolitessere
				GuadagnoP.Text = vCur2.GetString("daTavolo")
				GuadagnoV.Text = vCur2.GetString("aTavolo")
				If vCur2.GetInt("listino") = 0 Then
					pIndice.Text = "Listino attivo per questo range di tavoli-tessere: Lascia invariato"
				Else
					pIndice.Text = "Listino attivo per questo range di tavoli-tessere: " & vCur2.GetString("listino")
				End If
				pIndice.Tag = vCur2.GetString("listino")
				ChkResto.Checked = vCur2.GetInt("noazzera") = 1
				PIP.Text = NumberFormat2(vCur2.GetDouble("ImportoIngresso"), 1, 2, 2, False)
				pPrezzo.Text = NumberFormat2(vCur2.GetDouble("MaxImporto"), 1, 2, 2, False)
			Case Main.d_macro
				pIndice.Text = "Gestisci la Macro attiva ..."
			Case Main.d_ingredienti
				If Main.v_iprpi = "" Then
					If Not(Main.v_totem) Then
						r6 = False
					End If
				End If
				pWebDes1.Visible = r6
				pWebDes2.Visible = r6
				pWebDes3.Visible = r6
				pWebDes4.Visible = r6
				pWebDes5.Visible = r6
				Sub019("Ing")
			Case Main.d_allergeni
				If Main.v_iprpi = "" Then
					If Not(Main.v_totem) Then
						z = False
						pWebDes1.Visible = z
						pWebDes2.Visible = z
						pWebDes3.Visible = z
						pWebDes4.Visible = z
						pWebDes5.Visible = z
						ChkObbligo.Checked = vCur2.GetInt("tag") = 1
						Sub019("All")
					End If
				End If
				z = True
				pWebDes1.Visible = z
				pWebDes2.Visible = z
				pWebDes3.Visible = z
				pWebDes4.Visible = z
				pWebDes5.Visible = z
				ChkObbligo.Checked = vCur2.GetInt("tag") = 1
				Sub019("All")
			Case Main.d_ive
				pPrezzo.Text = mod1.Sub093(vCur2.GetDouble("aliquota2"))
				pNaturaIva.SelectedIndex = vCur2.GetInt("natura")
				pNaturaIva.Visible = vCur2.GetDouble("aliquota2") = 0
				lNaturaIva.Visible = vCur2.GetDouble("aliquota2") = 0
				pRTIva.SelectedIndex = vCur2.GetInt("RTIva")
			Case Main.d_grvariazioni
				chkBuonosr.Checked = vCur2.GetInt("vEsclusive") = 1
				pIndice.Text = "Indice per ordinamento variazioni: " & vCur2.GetString("indice")
				pIndice.Tag = vCur2.GetString("indice")
			Case Main.d_documentifattura
				pCopia.SelectedIndex = vCur2.GetInt("AttivoDiretta")
				pBuonoComePag.SelectedIndex = vCur2.GetInt("AttivoDifferita")
				pNaturaIva.SelectedIndex = vCur2.GetInt("AttivoStessaPIDiretta")
				pRTIva.SelectedIndex = vCur2.GetInt("AttivoStessaPIDifferita")
			Case Main.d_pagamenti
				vBln2 = True
				pRep.SelectedIndex = vCur2.GetInt("cassa")
				pRep.Enabled = i <> 2
				pBuonoComePag.SelectedIndex = vCur2.GetInt("BuonoComeP")
				pEft.SelectedIndex = vCur2.GetInt("CausaleEft")
				pIpEft.Visible = pEft.SelectedIndex > 0
				pPortaEft.Visible = pEft.SelectedIndex > 0
				pEft.Enabled = i <> 30
				chkGlory.Checked = vCur2.GetInt("glory") = 1
				pRTIva.SelectedIndex = vCur2.GetInt("RTPagamento")
				PagamentoPalmare.Checked = vCur2.GetInt("pagamentopalmare") = 1
				Sub017(vCur2.GetInt("RTPagamento"))
				If vCur2.GetString("IpEft") = "" Then
					If Not(Main.vBln25) Then
						If Not(Main.vBln24) Then
							pIpEft.Text = "Inserire l'indirizzo Ip per il Terminale EFT"
							pIpEft.Tag = ""
						End If
					End If
					pIpEft.Text = "Inserire l'indirizzo Ip o l'indice per il Terminale EFT"
					pIpEft.Tag = ""
				Else
					Dim str As String = "Indirizzo Ip:" & vCur2.GetString("IpEft")
					If Not(Main.vBln25) Then
					End If
					If vCur2.GetString("IpEft").Length = 1 And IsNumber(vCur2.GetString("IpEft")) And parseDouble = vCur2.GetString("IpEft") > 0 And parseDouble < 10 Then
						If Main.v_ipeftm(parseDouble) <> "" Then
							str = "Indice: " & parseDouble & " (Indirizzo Ip:" & Main.v_ipeftm(parseDouble) & ")"
						End If
					End If
					pIpEft.Text = str
					pIpEft.Tag = vCur2.GetString("IpEft")
				End If
				pPortaEft.Tag = vCur2.GetString("PortaEft")
				pPortaEft.Text = "Porta EFT:" & pPortaEft.Tag
				pCopia.SelectedIndex = vCur2.GetInt("copiascontrino")
				pTipoPrepagato.SelectedIndex = vCur2.GetInt("TipoPrepagato")
				chkBuonosr.Checked = vCur2.GetInt("buonosr") = 1
				ChkObbligo.Checked = vCur2.GetInt("obbligo") = 1
				SempreDocFisc.Checked = vCur2.GetInt("SempreDocFisc") = 1
				ChkResto.Checked = vCur2.GetInt("resto") = 1
				chkGeneraPunti.Checked = vCur2.GetInt("GeneraPunti") = 1
				pBuonoComePag.Visible = pCodint.Text <> "0"
				chkBuonosr.Visible = pCodint.Text <> "0"
				lBuono.Visible = pCodint.Text <> "0"
				vBln2 = False
		End Select
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	vBln4 = False
End Sub

Sub Sub019(str As String)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from anagraDescrizioni where codint ='" & str & pCodint.Text & "'")
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		pWebDes1.Tag = cursorWrapper2.GetString("descrizione1")
		pWebDes2.Tag = cursorWrapper2.GetString("descrizione2")
		pWebDes3.Tag = cursorWrapper2.GetString("descrizione3")
		pWebDes4.Tag = cursorWrapper2.GetString("descrizione4")
		pWebDes5.Tag = cursorWrapper2.GetString("descrizione5")
	Else
		pWebDes1.Tag = ""
		pWebDes2.Tag = ""
		pWebDes3.Tag = ""
		pWebDes4.Tag = ""
		pWebDes5.Tag = ""
	End If
	vCur3.Position = 0
	pWebDes1.Text = "Descrizione Web " & vCur3.GetString("descrizione") & " : " & IIf(pWebDes1.Tag = "", "da inserire", pWebDes1.Tag)
	vCur3.Position = 1
	pWebDes2.Text = "Descrizione Web " & vCur3.GetString("descrizione") & " : " & IIf(pWebDes2.Tag = "", "da inserire", pWebDes2.Tag)
	vCur3.Position = 2
	pWebDes3.Text = "Descrizione Web " & vCur3.GetString("descrizione") & " : " & IIf(pWebDes3.Tag = "", "da inserire", pWebDes3.Tag)
	vCur3.Position = 3
	pWebDes4.Text = "Descrizione Web " & vCur3.GetString("descrizione") & " : " & IIf(pWebDes4.Tag = "", "da inserire", pWebDes4.Tag)
	vCur3.Position = 4
	pWebDes5.Text = "Descrizione Web " & vCur3.GetString("descrizione") & " : " & IIf(pWebDes5.Tag = "", "da inserire", pWebDes5.Tag)
	cursorWrapper2.Close
End Sub

Sub Sub020
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select * from " & vStr3 & vStr4 & vStr6)
	vcustomlistviewold1.Sub004
	If vCur2.RowCount > 0 Then
		Dim rowCount As Int = vCur2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			vCur2.Position = i
			vcustomlistviewold1.Sub001(Sub005(i, vCur2.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur2.GetString("descrizione"))
		Next
		vcustomlistviewold1.Sub012(0)
		Sub018(0)
		Sub016(vPnl1)
		Return
	End If
End Sub

Sub Sub021(str As String) As String
	If Not(IsNumber(str.Replace(",", "."))) Then
		Return "0"
	End If
	Return mod1.Sub056(str)
End Sub

Sub Valmacro_Click
	Dim vTmp As Int
	mod1.vStr2 = "Sub ValMacro_Click"
	Try
		vTmp = vcustomlistviewold3.Sub007(Sender)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vTmp < 0 Then
		Return
	End If
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim spinnerWrapper As Spinner = getpanel.GetView(0)
	Dim labelWrapper As Label = getpanel.GetView(1)
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	vCur4.Position = vTmp
	Sub003(spinnerWrapper, labelWrapper, vTmp, labelWrapper2)
End Sub

Sub Sub022
	If vStr2 = "" Or pRTIva.SelectedItem.contains("Non configurata") Then
		Return
	End If
	Dim length As Int = vStr2.Length - 1
	Dim i As Int
	For i = 0 To length Step 4
		Dim parseDouble As Int = vStr2.SubString2(i, i + 2)
		Dim parseDouble2 As Int = pPrezzo.Text
		If i / 4 + 1 = pRTIva.SelectedIndex And parseDouble2 <> parseDouble Then
			Dim vObjectToCharSequence As Object = "L'aliquota inserita non corrisponde a quella programmata su registratore"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
	Next
End Sub

Sub verificaWeb_CheckedChange(z As Boolean)
	If Not(vBln2) Then
		pConferma.Enabled = True
		Return
	End If
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

