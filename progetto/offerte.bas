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
	Public vBln1 As Boolean = True
	Public vBln2 As Boolean
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public vcustomlistviewold1 As customlistviewold
	Public pCodint As EditText
	Public pDes As EditText
	Public pLista As Panel
	Public vCur1 As Cursor
	Public vCur2 As Cursor
	Public vIME1 As IME
	Public chkBuonosr As CheckBox
	Public vDlg1 As InputDialog
	Public vLst1 As List
	Public vCur3 As Cursor
	Public lblTitolo As Label
	Public AttivaWeb As CheckBox
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
			Sub004("Offerte")
			vcustomlistviewold1.Initialize(Me, "clv2")
			vcustomlistviewold1.vInt3 = -16776961
			lblTitolo.Color = Main.v_colormenutitle
			mod1.Sub173(lblTitolo)
			pLista.AddView(vcustomlistviewold1.Sub003, 0, 0, pLista.Width, pLista.Height)
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
	If Not(vBln2) Then
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
				DoEvents
				If Main.vStr14 <> "" Then
					Dim cursorWrapper As Cursor
					Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where codint ='" & Main.vStr14 & "'")
					If Main.vBln33 And cursorWrapper2.RowCount > 0 Then
						cursorWrapper2.Position = 0
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettoff where codint = '" & Main.vStr14 & "'") > 0 Then
							Dim vObjectToCharSequence As Object = "Articolo già presente in offerta"
							Dim vObjectToCharSequence2 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
							Main.vBln33 = False
							Main.vStr14 = ""
							Return
						End If
						Sub006(cursorWrapper2, False, Main.vStr14)
					End If
					Main.vBln33 = False
					Main.vStr14 = ""
					Sub003(False)
				Else
					Sub003(True)
				End If
				Dim cursorWrapper3 As Cursor
				vCur3 = Main.vSql1.ExecQuery("SELECT * FROM reparti order by codice")
				mod1.Sub081
				vBln2 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				DoEvents
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub AttivaWeb_CheckedChange(z As Boolean)
	Main.vSql1.ExecNonQuery("update headoff set attivaweb=" & IIf(AttivaWeb.Checked, "1", "0") & " where codofferta =" & pCodint.Text)
End Sub

Sub bNew_Click
	Main.vBln33 = True
	Main.vInt26 = 1
	Main.vBln32 = True
	Main.vInt24 = Main.d_plu
	vBln2 = True
	mod1.Sub198("tabelle")
End Sub

Sub bNewRep_Click
	Dim vTmp As Int = Sub005()
	If vTmp >= 0 Then
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettoff where codint = '_rep_" & vTmp & "'") > 0 Then
			Dim vObjectToCharSequence As Object = "Reparto già presente in offerta"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
		Sub007(False, vTmp)
		Sub003(False)
	End If
End Sub

Sub bSeleziona_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst1, "L'offerta da richiamare")
	If vInputList1 >= 0 Then
		vCur2.Position = vInputList1
		pDes.Text = vCur2.GetString("descrizione")
		pCodint.Text = vInputList1
		lblTitolo.Text = "Offerta Attiva : " & vCur2.GetString("descrizione")
		chkBuonosr.Checked = vCur2.GetInt("attiva") = 1
		AttivaWeb.Checked = vCur2.GetInt("attivaweb") = 1
		Sub003(True)
	End If
	mod1.Sub081
End Sub

Sub Button1_Click
	Main.vBln33 = False
	Main.vStr14 = ""
	vBln2 = True
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub Sub001(str As String)
	If Not(chkBuonosr.Checked) Then
		Return
	End If
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from dettoff where codint  ='" & str & "' and codofferta =" & pCodint.Text)
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Main.vSql1.ExecNonQuery("update anagra set scop  = 0,scov=0 where codint  ='" & str & "'")
		If cursorWrapper2.GetDouble("prezzo") > 0 Then
			Main.vSql1.ExecNonQuery("update anagra set list1  = " & cursorWrapper2.GetString("prezzo2").Replace(",", ".") & " where codint  ='" & str & "'")
		End If
	End If
End Sub

Sub chkBuonosr_CheckedChange(z As Boolean)
	Main.vSql1.ExecNonQuery("update headoff set  attiva =" & IIf(chkBuonosr.Checked, "1", "0") & " where codofferta =" & pCodint.Text)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from dettoff where codofferta = " & pCodint.Text)
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			If z Then
				If cursorWrapper2.GetString("scop") > 0 Then
					Main.vSql1.ExecNonQuery("update anagra set scop  = " & cursorWrapper2.GetString("scop") & ",scov=0 where codint  ='" & cursorWrapper2.GetString("codint") & "'")
				End If
				If cursorWrapper2.GetString("scov") > 0 Then
					Main.vSql1.ExecNonQuery("update anagra set scov  = " & cursorWrapper2.GetString("scov").Replace(",", ".") & ",scop=0 where codint  ='" & cursorWrapper2.GetString("codint") & "'")
				End If
				If cursorWrapper2.GetString("prezzo") > 0 Then
					Main.vSql1.ExecNonQuery("update anagra set list1  = " & cursorWrapper2.GetString("prezzo").Replace(",", ".") & " where codint  ='" & cursorWrapper2.GetString("codint") & "'")
				End If
			Else
				Main.vSql1.ExecNonQuery("update anagra set scop = 0,scov=0 where codint  ='" & cursorWrapper2.GetString("codint") & "'")
				If cursorWrapper2.GetString("prezzo") > 0 Then
					Main.vSql1.ExecNonQuery("update anagra set list1  = " & cursorWrapper2.GetString("prezzo2").Replace(",", ".") & " where codint  ='" & cursorWrapper2.GetString("codint") & "'")
				End If
			End If
		Next
		Return
	End If
End Sub

Sub Sub002(str As String, str2 As String, i As Int) As Panel
	Dim str3 As String
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Color = -1
		Dim labelWrapper As Label
		labelWrapper.Initialize("selrow")
		labelWrapper.Gravity = Bit.Or(16, 3)
		If vCur1.GetString("codint").StartsWith("_rep_") Then
			labelWrapper.Text = "Reparto " & vCur1.GetString("codint").Replace("_rep_", "")
			labelWrapper.Tag = vCur1.GetString("codint").Replace("_rep_", "")
			labelWrapper.Background = mod1.Sub155(-3355444, 0)
		Else
			labelWrapper.Tag = ""
			labelWrapper.Text = vCur1.GetString("codint")
			labelWrapper.Background = mod1.Sub155(-1, 0)
		End If
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("selrow")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.Text = str2
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(-1, 0)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("modoff")
		labelWrapper3.Gravity = Bit.Or(16, 3)
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from dettoff where codofferta = " & pCodint.Text & " and codint ='" & vCur1.GetString("codint") & "'")
		If cursorWrapper2.RowCount <= 0 Then
			str3 = ""
		Else
			cursorWrapper2.Position = 0
			If cursorWrapper2.GetInt("scop") <= 0 Then
				str3 = ""
			Else
				str3 = "Sconto del " & cursorWrapper2.GetInt("scop") & "%"
			End If
			If cursorWrapper2.GetDouble("scov") > 0 Then
				str3 = "Sconto di € " & NumberFormat2(cursorWrapper2.GetDouble("scov"), 1, 2, 2, False)
			End If
			If cursorWrapper2.GetDouble("prezzo") > 0 Then
				str3 = "Importo a " & NumberFormat2(cursorWrapper2.GetDouble("prezzo"), 1, 2, 2, False) & CRLF & "Originale " & NumberFormat2(cursorWrapper2.GetDouble("prezzo2"), 1, 2, 2, False)
			End If
		End If
		labelWrapper3.Text = str3
		labelWrapper3.TextSize = 16
		labelWrapper3.TextColor = -16777216
		labelWrapper3.Background = mod1.Sub155(-543307, 0)
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("")
		labelWrapper4.Text = str
		labelWrapper4.Visible = False
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("ModDel")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "006.png")
		panelWrapper.AddView(labelWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(8), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(10), DipToCurrent(2), PerXToCurrent(40), i)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(50), DipToCurrent(2), PerXToCurrent(38), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i)
		panelWrapper.AddView(labelWrapper4, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
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
		mod1.Sub081
	End If
	Return vTmp
End Sub

Sub Sub003(z As Boolean)
	Dim i As Int
	mod1.vStr2 = "Sub Init"
	Try
		ProgressDialogShow("Caricamento dati in corso ...")
		Activity.Title = "Gestione Offerte"
		If vBln1 Then
			Sub008()
			vCur2.Position = 0
			pDes.Text = vCur2.GetString("descrizione")
			pCodint.Text = "0"
			lblTitolo.Text = "Offerta Attiva : " & vCur2.GetString("descrizione")
			pCodint.Enabled = False
			chkBuonosr.Checked = vCur2.GetInt("attiva") = 1
			AttivaWeb.Checked = vCur2.GetInt("attivaweb") = 1
		End If
		If Not(vCur1.IsInitialized) Then
			i = -1
		Else
			i = vCur1.Position
		End If
		vBln1 = False
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("Select * from dettoff where codofferta = " & pCodint.Text & " order by chiave")
		If z Then
			vcustomlistviewold1.Sub004
		End If
		If vCur1.RowCount > 0 Then
			If Not(z) Then
				Dim rowCount As Int = vCur1.RowCount - 1
				Dim vTmp As Int
				For vTmp = vcustomlistviewold1.Sub008 To rowCount
					vCur1.Position = vTmp
					vcustomlistviewold1.Sub001(Sub002(vTmp, vCur1.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur1.GetString("descrizione"))
				Next
				vcustomlistviewold1.Sub012(vCur1.RowCount - 1)
			Else
				Dim rowCount2 As Int = vCur1.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount2
					vCur1.Position = i2
					vcustomlistviewold1.Sub001(Sub002(i2, vCur1.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur1.GetString("descrizione"))
				Next
				If i < 0 Then
					vcustomlistviewold1.Sub012(vCur1.RowCount - 1)
				Else
					vcustomlistviewold1.Sub012(i)
				End If
			End If
		End If
		ProgressDialogHide
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub lblTitolo_Click
End Sub

Sub Sub004(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub Moddel_Click
	mod1.vStr2 = "Sub ElencoFiltroDel_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(0)
		If chkBuonosr.Checked And labelWrapper.Tag = "" Then
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from dettoff where codofferta = " & pCodint.Text & " and codint ='" & labelWrapper.Text & "'")
			If cursorWrapper2.RowCount > 0 Then
				cursorWrapper2.Position = 0
				Main.vSql1.ExecNonQuery("update anagra set scop  = 0,scov=0 where codint  ='" & labelWrapper.Text & "'")
				If cursorWrapper2.GetDouble("prezzo") > 0 Then
					Main.vSql1.ExecNonQuery("update anagra set list1  = " & cursorWrapper2.GetString("prezzo2").Replace(",", ".") & " where codint  ='" & labelWrapper.Text & "'")
				End If
			End If
		End If
		If labelWrapper.Tag = "" Then
			Main.vSql1.ExecNonQuery("DELETE FROM  dettoff WHERE codofferta=" & pCodint.Text & " AND codint ='" & labelWrapper.Text & "'")
		Else
			Main.vSql1.ExecNonQuery("DELETE FROM  dettoff WHERE codofferta=" & pCodint.Text & " AND codint ='_rep_" & labelWrapper.Tag & "'")
		End If
		Sub003(True)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Modoff_Click
	Dim str As String
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(0)
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	If labelWrapper.Tag <> "" Then
		If Sub007(True, labelWrapper.Tag) Then
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from dettoff where codofferta = " & pCodint.Text & " and codint ='_rep_" & labelWrapper.Tag & "'")
			If cursorWrapper2.RowCount > 0 Then
				cursorWrapper2.Position = 0
				If cursorWrapper2.GetInt("scop") > 0 Then
					str = "Sconto del " & cursorWrapper2.GetInt("scop") & "%"
					labelWrapper2.Text = str
				End If
			End If
			str = ""
			labelWrapper2.Text = str
		End If
		Return
	End If
	Dim cursorWrapper3 As Cursor
	Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where codint ='" & labelWrapper.Text & "'")
	If cursorWrapper4.RowCount > 0 Then
		cursorWrapper4.Position = 0
		Dim cursorWrapper5 As Cursor
		Dim cursorWrapper6 As Cursor = Main.vSql1.ExecQuery("select * from dettoff where codofferta = " & pCodint.Text & " and codint ='" & labelWrapper.Text & "'")
		If Sub006(cursorWrapper4, True, labelWrapper.Text) Then
			Dim str2 As String = ""
			If cursorWrapper6.RowCount > 0 Then
				cursorWrapper6.Position = 0
				If cursorWrapper6.GetInt("scop") > 0 Then
					str2 = "Sconto del " & cursorWrapper6.GetInt("scop") & "%"
				End If
				If cursorWrapper6.GetDouble("scov") > 0 Then
					str2 = "Sconto di € " & NumberFormat2(cursorWrapper6.GetDouble("scov"), 1, 2, 2, False)
				End If
				If cursorWrapper6.GetDouble("prezzo") > 0 Then
					str2 = "Importo a " & NumberFormat2(cursorWrapper6.GetDouble("prezzo"), 1, 2, 2, False) & CRLF & "Originale " & NumberFormat2(cursorWrapper6.GetDouble("prezzo2"), 1, 2, 2, False)
				End If
			End If
			labelWrapper2.Text = str2
		End If
	End If
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub pDes_EnterPressed
	vIME1.HideKeyboard
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Trim, 50)
	Main.vSql1.ExecNonQuery("update headoff set descrizione ='" & pDes.Text & "' where codofferta =" & pCodint.Text)
	Sub008()
End Sub

Sub pDes_FocusChanged(z As Boolean)
	If z Then
		vIME1.Initialize("IME")
		pDes.SelectionStart = pDes.Text.Length
		Return
	End If
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Trim, 50)
	vIME1.HideKeyboard
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Trim, 50)
	Main.vSql1.ExecNonQuery("update headoff set descrizione ='" & pDes.Text & "' where codofferta =" & pCodint.Text)
	Sub008()
End Sub

Sub pDes_TextChanged(str As String, str2 As String)
	If str2.Length > 50 Then
		pDes.Text = str
		pDes.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pLista_Click
End Sub

Sub Sub005 As Int
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		Dim list As List
		list.Initialize
		Dim list2 As List
		list2.Initialize
		list2.Clear
		Dim rowCount As Int = vCur3.RowCount - 1
		Dim i As Int = 0
		Dim i2 As Int
		For i2 = 0 To rowCount
			DoEvents
			vCur3.Position = i2
			If vCur3.GetString("descrizione").Trim.ToUpperCase <> "DA INSERIRE" And vCur3.GetString("descrizione").Trim <> "" Then
				list.Add(vCur3.GetString("descrizione"))
				list2.InsertAt(i, i2)
				i = i + 1
			End If
		Next
		Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il reparto dall'elenco")
		mod1.Sub081
		If vInputList1 < 0 Then
			Return -1
		End If
		Return list2.Get(vInputList1)
	Catch
		mod1.Sub217(LastException.Message)
		Return 0
	End Try
End Sub

Sub pPlu_Click
End Sub

Sub Sub006(cursorWrapper As Cursor, z As Boolean, str As String) As Boolean
	Dim list As List
	list.Initialize
	list.Add("Sconto in %")
	list.Add("Sconto a Valore")
	list.Add("Taglio Prezzo")
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il tipo di Offerta")
	Do While Not(False)
		Select vInputList1
			Case 0
				Dim numberDialog As NumberDialog
				numberDialog.Digits = 3
				numberDialog.Number = 0
				numberDialog.Decimal = 0
				numberDialog.ShowSign = False
				Dim str2 As String = "Inserire lo sconto in % per l'articolo " & cursorWrapper.GetString("descrizione") & " ( Prezzo " & NumberFormat2(cursorWrapper.GetDouble("list1"), 1, 2, 2, False) & " €)"
				Dim vShow As Int = numberDialog.Show(str2, "Ok", "Annulla", "", Main.vBmp1)
				If vShow = -1 And numberDialog.Number > 0 And numberDialog.Number <= 100 Then
					Dim vNumberToString As String = cursorWrapper.GetDouble("scop")
					If z Then
						Sub001(str)
						Main.vSql1.ExecNonQuery("update dettoff set scop  = " & numberDialog.Number & ",scop2 =" & vNumberToString.Replace(",", ".") & ",scov=0,scov2=0,prezzo=0  where codint  ='" & str & "' and codofferta=" & pCodint.Text)
					Else
						Main.vSql1.ExecNonQuery("insert into dettoff (codofferta,codint,descrizione,scop,scop2,prezzo2) values(" & pCodint.Text & ",'" & str & "','" & cursorWrapper.GetString("descrizione") & "'," & numberDialog.Number & "," & vNumberToString.Replace(",", ".") & "," & cursorWrapper.GetString("list1") & ")")
					End If
					If chkBuonosr.Checked Then
						Main.vSql1.ExecNonQuery("update anagra set scop  = " & numberDialog.Number & " where codint  ='" & str & "'")
					End If
					mod1.Sub081
					Return True
				End If
				mod1.Sub081
				Return False
			Case 1
				Dim inputDialog2 As InputDialog = vDlg1
				vDlg1.InputType = 12290
				vDlg1.Input = ""
				vDlg1.PasswordMode = False
				vDlg1.Hint = "Sconto valore ( Prezzo " & NumberFormat2(cursorWrapper.GetDouble("list1"), 1, 2, 2, False) & " €)"
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				Dim str3 As String = "Inserire lo sconto a Valore per " & cursorWrapper.GetString("descrizione") & " ( Prezzo " & NumberFormat2(cursorWrapper.GetDouble("list1"), 1, 2, 2, False) & " €)"
				Dim vShow2 As Int = vDlg1.Show(str3, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				If vShow2 = -1 Then
					If IsNumber(vDlg1.Input) Then
						If mod1.Sub056(vDlg1.Input) > 0 Then
							Dim vTmp As Double = mod1.Sub056(vDlg1.Input)
							Dim vNumberToString2 As String = vTmp
							If vTmp > cursorWrapper.GetDouble("list1") Then
								Dim vObjectToCharSequence As Object = "Sconto troppo elevato"
								Dim vObjectToCharSequence2 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
							Else
								Dim vNumberToString3 As String = cursorWrapper.GetDouble("scov")
								If z Then
									Sub001(str)
									Main.vSql1.ExecNonQuery("update dettoff set scov  = " & vNumberToString2.Replace(",", ".") & ",scov2 =" & vNumberToString3.Replace(",", ".") & ",scop=0,scop2=0,prezzo=0  where codint  ='" & str & "' and codofferta=" & pCodint.Text)
								Else
									Main.vSql1.ExecNonQuery("insert into dettoff (codofferta,codint,descrizione,scov,scov2,prezzo2) values(" & pCodint.Text & ",'" & str & "','" & cursorWrapper.GetString("descrizione") & "'," & vNumberToString2.Replace(",", ".") & "," & vNumberToString3.Replace(",", ".") & "," & cursorWrapper.GetString("list1") & ")")
								End If
								If chkBuonosr.Checked Then
									Main.vSql1.ExecNonQuery("update anagra set scov  = " & vNumberToString2.Replace(",", ".") & " where codint  ='" & str & "'")
								End If
								mod1.Sub081
								Return True
							End If
						End If
					End If
					Dim vObjectToCharSequence3 As Object = "Sconto non valido"
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				Else
					mod1.Sub081
					Return False
				End If
			Case 2
				Dim inputDialog6 As InputDialog = vDlg1
				vDlg1.InputType = 12290
				vDlg1.Input = ""
				vDlg1.PasswordMode = False
				vDlg1.Hint = "Taglio Prezzo ( Prezzo " & NumberFormat2(cursorWrapper.GetDouble("list1"), 1, 2, 2, False) & " €)"
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				Dim str5 As String = "Inserire il nuovo prezzo per l'articolo " & cursorWrapper.GetString("descrizione") & " ( Prezzo " & NumberFormat2(cursorWrapper.GetDouble("list1"), 1, 2, 2, False) & " €)"
				Dim vShow3 As Int = vDlg1.Show(str5, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				If vShow3 = -1 Then
					If IsNumber(vDlg1.Input) Then
						If mod1.Sub056(vDlg1.Input) > 0 Then
							Dim vTmp_ As Double = mod1.Sub056(vDlg1.Input)
							Dim vNumberToString4 As String = vTmp_
							If vTmp_ > cursorWrapper.GetDouble("list1") Then
								Dim vObjectToCharSequence5 As Object = "Importo più alto del prezzo dell'articolo." & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", CRLF) & " " & QUOTE & "Si desidera proseguire ugualmente ?"
								Dim vObjectToCharSequence6 As Object = Main.vStr8
								Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "Annulla", Main.vBmp1)
								If vMsgbox2 <> -1 Then
									mod1.Sub081
									Return False
								End If
							End If
							Dim vNumberToString5 As String = cursorWrapper.GetDouble("list1")
							If z Then
								Sub001(str)
								Main.vSql1.ExecNonQuery("update dettoff set prezzo  = " & vNumberToString4.Replace(",", ".") & ",scop=0,scop2=0,scov=0,scov2=0  where codint  ='" & str & "' and codofferta=" & pCodint.Text)
							Else
								Main.vSql1.ExecNonQuery("insert into dettoff (codofferta,codint,descrizione,prezzo,prezzo2) values(" & pCodint.Text & ",'" & str & "','" & cursorWrapper.GetString("descrizione") & "'," & vNumberToString4.Replace(",", ".") & "," & vNumberToString5.Replace(",", ".") & ")")
							End If
							If chkBuonosr.Checked Then
								Main.vSql1.ExecNonQuery("update anagra set list1  = " & vNumberToString4.Replace(",", ".") & " where codint  ='" & str & "'")
							End If
							mod1.Sub081
							Return True
						End If
					End If
					Dim vObjectToCharSequence7 As Object = "Importo non valido"
					Dim vObjectToCharSequence8 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
				Else
					mod1.Sub081
					Return False
				End If
			Case Else
				mod1.Sub081
				Return False
		End Select
	Loop
	mod1.Sub081
	Return False
End Sub

Sub Sub007(z As Boolean, i As Int) As Boolean
	vCur3.Position = i
	Dim str As String = "_rep_" & i
	Do While Not(False)
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Sconto % "
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim str2 As String = "Inserire lo sconto in % per il reparto " & vCur3.GetString("descrizione")
		Dim vShow As Int = vDlg1.Show(str2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow <> -1 Then
			Return False
		End If
		If IsNumber(vDlg1.Input) Then
			If modfunstr.Sub006(vDlg1.Input) > 0 Then
				If modfunstr.Sub006(vDlg1.Input) <= 100 Then
					If z Then
						Main.vSql1.ExecNonQuery("update dettoff set scop  = " & vDlg1.Input.Replace(",", ".") & ",scop2 =0,scov=0,scov2=0,prezzo=0,prezzo2=0  where codint  ='" & str & "' and codofferta=" & pCodint.Text)
					Else
						Main.vSql1.ExecNonQuery("insert into dettoff (codofferta,codint,descrizione,scop,scop2) values(" & pCodint.Text & ",'" & str & "','" & vCur3.GetString("descrizione") & "'," & vDlg1.Input.Replace(",", ".") & ",0)")
					End If
					Return True
				End If
			Else
				Continue
			End If
		End If
		Dim vObjectToCharSequence As Object = "Sconto non valido"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Loop
	mod1.Sub081
	Return False
End Sub

Sub Sub008
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select * from headoff order by codofferta")
	vCur2.Position = 0
	vLst1.Initialize
	vLst1.Clear
	Dim rowCount As Int = vCur2.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		vCur2.Position = i
		vLst1.Add(vCur2.GetString("descrizione").Trim & IIf(vCur2.GetInt("attiva") = 1, "(ATTIVA)", "(NON ATTIVA)"))
	Next
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

