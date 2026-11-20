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
	Public vBln3 As Boolean
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
	Public vDlg1 As InputDialog
	Public vLst1 As List
	Public lblTitolo As Label
	Public vCur3 As Cursor
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
			Sub003("menu")
			lblTitolo.Color = Main.v_colormenutitle
			mod1.Sub173(lblTitolo)
			vcustomlistviewold1.Initialize(Me, "clv2")
			vcustomlistviewold1.vInt3 = -16776961
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
						If Main.vStr14.ToLowerCase.StartsWith("mnu") Then
							Dim vObjectToCharSequence As Object = "Non è consentito inserire un articolo Menù"
							Dim vObjectToCharSequence2 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
							Main.vBln33 = False
							Main.vStr14 = ""
							Return
						End If
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettmnu where codmnu=" & pCodint.Text & " and codint = '" & Main.vStr14 & "'") > 0 Then
							Dim vObjectToCharSequence3 As Object = "Articolo già presente nel Menù"
							Dim vObjectToCharSequence4 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
							Main.vBln33 = False
							Main.vStr14 = ""
							Return
						End If
						If cursorWrapper2.GetInt("flgusointerno") = 1 And cursorWrapper2.GetString("codint") <> "abb" Then
							Dim vObjectToCharSequence5 As Object = "ATTENZIONE ..." & CRLF & "Non è possibile inserire articoli ad uso interno all'interno di un Menù"
							Dim vObjectToCharSequence6 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
							Main.vBln33 = False
							Main.vStr14 = ""
							Return
						End If
						If cursorWrapper2.GetInt("variazioni") = 1 Then
							Dim vObjectToCharSequence7 As Object = "ATTENZIONE ..." & CRLF & "Non verrà fatta la richiesta delle variazioni per questo articolo al momento della vendita del menu"
							Dim vObjectToCharSequence8 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
						End If
						If cursorWrapper2.GetInt("fraziona") = 1 Then
							Dim vObjectToCharSequence9 As Object = "ATTENZIONE ..." & CRLF & "Non verrà fatta la richiesta di frazionamento per questo articolo al momento della vendita del menu"
							Dim vObjectToCharSequence10 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
						End If
						Sub005(cursorWrapper2, False, Main.vStr14, False)
					End If
					Main.vBln33 = False
					Main.vStr14 = ""
					Sub002(True)
				Else
					Sub002(True)
				End If
				Dim cursorWrapper3 As Cursor
				vCur3 = Main.vSql1.ExecQuery("SELECT * FROM reparti order by codice")
				vBln2 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
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

Sub Attivadisattiva_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(0)
	Dim labelWrapper2 As Label = getpanel.GetView(1)
	Dim imageViewWrapper As ImageView = getpanel.GetView(4)
	If vBln3 Then
		Sub006()
	End If
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettmnu WHERE codmnu=" & pCodint.Text & " AND codint ='" & labelWrapper.Text & "'") > 0 Then
		Dim vNot As Boolean = Main.vSql1.ExecQuerySingleResult("Select mnuattivo from dettmnu WHERE codmnu=" & pCodint.Text & " AND codint ='" & labelWrapper.Text & "'") <> 1
		Main.vSql1.ExecNonQuery("update  dettmnu set mnuattivo = " & IIf(vNot, "1", "0") & " WHERE codmnu=" & pCodint.Text & " AND codint ='" & labelWrapper.Text & "'")
		If vNot Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fca_lucchetto ap.png")
			labelWrapper2.Background = mod1.Sub155(-1, 0)
			Return
		End If
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fca_lucchetto.png")
		labelWrapper2.Color = -1347953
		Return
	End If
End Sub

Sub bNew_Click
	If vBln3 Then
		Sub006()
	End If
	Main.vBln33 = True
	Main.vInt26 = 3
	Main.vBln32 = True
	Main.vInt24 = Main.d_plu
	vBln2 = True
	mod1.Sub198("tabelle")
End Sub

Sub bNewRep_Click
	Dim vTmp As Int = Sub004()
	If vTmp > 0 Then
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where bvar=0 and reparto =" & vTmp)
		If cursorWrapper2.RowCount = 0 Then
			Dim vObjectToCharSequence As Object = "Nessun articolo per il reparto selezionato."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return
		End If
		Dim vObjectToCharSequence3 As Object = "Attenzione ... Verranno inseriti " & cursorWrapper2.RowCount & " articoli." & CRLF & "Si desidera continuare ?"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			Return
		End If
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			If Not(cursorWrapper2.GetString("codint").ToLowerCase.StartsWith("mnu")) Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettmnu where codmnu=" & pCodint.Text & " and codint = '" & cursorWrapper2.GetString("codint") & "'") <= 0 And (cursorWrapper2.GetInt("flgusointerno") <> 1 Or cursorWrapper2.GetString("codint") = "abb") Then
					Sub005(cursorWrapper2, False, cursorWrapper2.GetString("codint"), True)
				End If
			End If
		Next
		Sub002(True)
	Else If vTmp = 0 Then
		Dim vObjectToCharSequence5 As Object = "Reparto non valido."
		Dim vObjectToCharSequence6 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
	End If
End Sub

Sub bPrint_Click
	If Main.v_stampaconto = 0 Then
		Dim vObjectToCharSequence As Object = "Non è possibile stampare i Menu su MF."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from headmnu where (select count(*) from dettmnu where  mnuattivo=1 and  auto = 0 and codmnu =headmnu.codmnu)>0") = 0 Then
		Dim vObjectToCharSequence3 As Object = "Nessun Menu può essere stampato."
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		Return
	End If
	Dim vObjectToCharSequence5 As Object = "Confermi la stampa dei menu su stampante non fiscale ?"
	Dim vObjectToCharSequence6 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 <> -1 Then
		Return
	End If
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper.Append("2 ").Append(CRLF)
	stringBuilderWrapper.Append("4Menu del Giorno").Append(CRLF)
	stringBuilderWrapper.Append("2" & mod1.Sub061(mod1.Sub058).SubString2(0, 10)).Append(CRLF)
	stringBuilderWrapper.Append("2Non si applicano").Append(CRLF)
	stringBuilderWrapper.Append("2Variazioni ai menu").Append(CRLF)
	stringBuilderWrapper.Append("2 ").Append(CRLF)
	stringBuilderWrapper.Append("2------------------------------------").Append(CRLF)
	Dim text As String = pDes.Text
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codint,prezzo,descrizione,desreparto from dettmnu where  mnuattivo=1 and  auto = 0 and codmnu =" & pCodint.Text & " order by indice ")
	If cursorWrapper2.RowCount > 0 Then
		stringBuilderWrapper.Append("2 ").Append(CRLF)
		stringBuilderWrapper.Append("2 ").Append(CRLF)
		stringBuilderWrapper.Append("4" & text).Append(CRLF)
		Dim str As String = ""
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			If cursorWrapper2.GetString("desreparto") <> str Then
				str = cursorWrapper2.GetString("desreparto")
				stringBuilderWrapper.Append("2 ").Append(CRLF)
				stringBuilderWrapper.Append("2" & str & ":").Append(CRLF)
			End If
			stringBuilderWrapper.Append("1" & cursorWrapper2.GetString("descrizione")).Append(CRLF)
		Next
	End If
	cursorWrapper2.Close
	Dim vSplit() As String = Regex.Split(CRLF, stringBuilderWrapper.ToString)
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(vSplit))
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = 1
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di copie da stampare", "Ok", "Annulla", "", Main.vBmp1)
	If vShow <> -1 Or numberDialog.Number <= 0 Then
		Return
	End If
	Dim number As Int = numberDialog.Number - 1
	Dim i2 As Int
	For i2 = 0 To number
		mod1.Sub191(list)
	Next
End Sub

Sub bSeleziona_Click
	If vBln3 Then
		Sub006()
	End If
	Dim vInputList1 As Int = idLib.InputList1(vLst1, "Il menù da richiamare")
	If vInputList1 >= 0 Then
		vCur2.Position = vInputList1
		pDes.Text = vCur2.GetString("descrizione")
		pCodint.Text = vInputList1
		lblTitolo.Text = "Menu Attivo : " & vCur2.GetString("descrizione")
		Sub002(True)
		Return
	End If
End Sub

Sub Button1_Click
	Main.vBln33 = False
	Main.vStr14 = ""
	vBln2 = True
	Activity.Finish
	mod1.Sub198("Main")
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/menu.java, metodo m3… (riga 814).
Sub Sub001(str As String, str2 As String, i As Int) As Panel
	Dim labelWrapper As Label
	Dim labelWrapper2 As Label
	Dim checkBoxWrapper As CheckBox
	Dim labelWrapper3 As Label
	Dim cursorWrapper As Cursor
	Dim str3 As String
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Color = -1
		'labelWrapper = Label
		labelWrapper.Initialize("selrow")
		labelWrapper.Gravity = Bit.Or(16, 3)
		labelWrapper.Tag = ""
		labelWrapper.Text = vCur1.GetString("codint")
		If vCur1.GetInt("elimina") = 1 Then
			labelWrapper.Color = -65536
		Else
			labelWrapper.Color = -1
		End If
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		'labelWrapper2 = Label
		labelWrapper2.Initialize("selrow")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.Text = str2 & CRLF & "    Reparto:" & vCur1.GetString("desreparto")
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(-1, 0)
		'checkBoxWrapper = CheckBox
		checkBoxWrapper.Initialize("eAuto")
		checkBoxWrapper.Gravity = Bit.Or(16, 3)
		checkBoxWrapper.Text = "Aggiungi automaticamente"
		checkBoxWrapper.TextSize = 16
		checkBoxWrapper.TextColor = -16777216
		checkBoxWrapper.Background = mod1.Sub155(-1, 0)
		checkBoxWrapper.Checked = vCur1.GetInt("auto") = 1
		'labelWrapper3 = Label
		labelWrapper3.Initialize("modoff")
		labelWrapper3.Gravity = Bit.Or(16, 5)
		Dim cursorWrapper2 As Cursor
		cursorWrapper = Main.vSql1.ExecQuery("select * from dettmnu where codmnu = " & pCodint.Text & " and codint ='" & vCur1.GetString("codint") & "'")
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If cursorWrapper.RowCount > 0 Then
		cursorWrapper.Position = 0
		If cursorWrapper.GetDouble("prezzo") >= 0 Then
			str3 = "Prezzo = " & NumberFormat2(cursorWrapper.GetDouble("prezzo"), 1, 2, 2, False)
			labelWrapper3.Text = str3
			labelWrapper3.TextSize = 16
			labelWrapper3.TextColor = -16777216
			labelWrapper3.Background = mod1.Sub155(-543307, 0)
			Dim labelWrapper4 As Label
			labelWrapper4.Initialize("")
			labelWrapper4.Text = str
			labelWrapper4.Visible = False
			Dim imageViewWrapper As ImageView
			imageViewWrapper.Initialize("AttivaDisattiva")
			If vCur1.GetInt("mnuattivo") <> 1 Then
				imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fca_lucchetto ap.png")
				labelWrapper2.Background = mod1.Sub155(-1, 0)
			Else
				imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fca_lucchetto.png")
				labelWrapper2.Color = -1347953
			End If
			Dim imageViewWrapper2 As ImageView
			imageViewWrapper2.Initialize("ModDel")
			imageViewWrapper2.Bitmap = LoadBitmap(File.DirAssets, "006.png")
			panelWrapper.AddView(labelWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(8), i)
			panelWrapper.AddView(labelWrapper2, PerXToCurrent(10), DipToCurrent(2), PerXToCurrent(30), i)
			panelWrapper.AddView(checkBoxWrapper, PerXToCurrent(40), DipToCurrent(2), PerXToCurrent(20), i)
			panelWrapper.AddView(labelWrapper3, PerXToCurrent(60), DipToCurrent(2), PerXToCurrent(16), i)
			panelWrapper.AddView(imageViewWrapper, PerXToCurrent(76), DipToCurrent(2), PerXToCurrent(12), i)
			panelWrapper.AddView(imageViewWrapper2, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i)
			panelWrapper.AddView(labelWrapper4, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
			Return panelWrapper
		End If
	End If
	str3 = ""
	labelWrapper3.Text = str3
	labelWrapper3.TextSize = 16
	labelWrapper3.TextColor = -16777216
	labelWrapper3.Background = mod1.Sub155(-543307, 0)
	Dim labelWrapper42 As Label
	labelWrapper42.Initialize("")
	labelWrapper42.Text = str
	labelWrapper42.Visible = False
	Dim imageViewWrapper3 As ImageView
	imageViewWrapper3.Initialize("AttivaDisattiva")
	If vCur1.GetInt("mnuattivo") <> 1 Then
	End If
	Dim imageViewWrapper22 As ImageView
	imageViewWrapper22.Initialize("ModDel")
	imageViewWrapper22.Bitmap = LoadBitmap(File.DirAssets, "006.png")
	panelWrapper.AddView(labelWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(8), i)
	panelWrapper.AddView(labelWrapper2, PerXToCurrent(10), DipToCurrent(2), PerXToCurrent(30), i)
	panelWrapper.AddView(checkBoxWrapper, PerXToCurrent(40), DipToCurrent(2), PerXToCurrent(20), i)
	panelWrapper.AddView(labelWrapper3, PerXToCurrent(60), DipToCurrent(2), PerXToCurrent(16), i)
	panelWrapper.AddView(imageViewWrapper3, PerXToCurrent(76), DipToCurrent(2), PerXToCurrent(12), i)
	panelWrapper.AddView(imageViewWrapper22, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i)
	panelWrapper.AddView(labelWrapper42, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
	Return panelWrapper
End Sub

Sub Eauto_CheckedChange(z As Boolean)
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	If vTmp < 0 Then
		Return
	End If
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(0)
	Main.vSql1.ExecNonQuery("update dettmnu set auto =" & IIf(z, "1", "0") & " where codint  ='" & labelWrapper.Text & "' and codmnu=" & pCodint.Text)
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

Sub Sub002(z As Boolean)
	Dim i As Int
	mod1.vStr2 = "Sub Init"
	Try
		ProgressDialogShow("Caricamento dati in corso ...")
		Activity.Title = "Gestione Menù"
		If vBln1 Then
			Sub007()
			vCur2.Position = 0
			pDes.Text = vCur2.GetString("descrizione")
			pCodint.Text = "0"
			lblTitolo.Text = "Menu Attivo : " & vCur2.GetString("descrizione")
			pCodint.Enabled = False
		End If
		If Not(vCur1.IsInitialized) Then
			i = -1
		Else
			i = vCur1.Position
		End If
		vBln1 = False
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("Select * from dettmnu where codmnu = " & pCodint.Text & " order by indice,descrizione")
		If z Then
			vcustomlistviewold1.Sub004
		End If
		If vCur1.RowCount > 0 Then
			If Not(z) Then
				Dim rowCount As Int = vCur1.RowCount - 1
				Dim vTmp As Int
				For vTmp = vcustomlistviewold1.Sub008 To rowCount
					vCur1.Position = vTmp
					vcustomlistviewold1.Sub001(Sub001(vTmp, vCur1.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur1.GetString("descrizione"))
				Next
				vcustomlistviewold1.Sub012(vCur1.RowCount - 1)
			Else
				Dim rowCount2 As Int = vCur1.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount2
					vCur1.Position = i2
					vcustomlistviewold1.Sub001(Sub001(i2, vCur1.GetString("descrizione"), DipToCurrent(60)), DipToCurrent(60), vCur1.GetString("descrizione"))
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
		ProgressDialogHide
		Return
	End Try
End Sub

Sub lblTitolo_Click
End Sub

Sub Sub003(str As String)
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
		If vBln3 Then
			Sub006()
		End If
		Main.vSql1.ExecNonQuery("DELETE FROM  dettmnu WHERE codmnu=" & pCodint.Text & " AND (codint ='" & labelWrapper.Text & "' or elimina=1)")
		Sub002(True)
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("Select * from dettmnu where codmnu = " & pCodint.Text & " order by indice")
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Moddel_LongClick
	mod1.vStr2 = "Sub ModDel_LongClick"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(0)
		If Main.vSql1.ExecQuerySingleResult("Select  elimina from dettmnu  WHERE codmnu=" & pCodint.Text & " AND codint ='" & labelWrapper.Text & "'") = 1 Then
			Main.vSql1.ExecNonQuery("update dettmnu set elimina=0 WHERE codmnu=" & pCodint.Text & " AND codint ='" & labelWrapper.Text & "'")
			labelWrapper.Color = -1
		Else
			Main.vSql1.ExecNonQuery("update dettmnu set elimina=1 WHERE codmnu=" & pCodint.Text & " AND codint ='" & labelWrapper.Text & "'")
			labelWrapper.Color = -65536
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Modoff_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(0)
	Dim labelWrapper2 As Label = getpanel.GetView(3)
	If vBln3 Then
		Sub006()
	End If
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where codint ='" & labelWrapper.Text & "'")
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Dim cursorWrapper3 As Cursor
		Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select * from dettmnu where codmnu = " & pCodint.Text & " and codint ='" & labelWrapper.Text & "'")
		If Sub005(cursorWrapper2, True, labelWrapper.Text, False) Then
			Dim str As String = ""
			If cursorWrapper4.RowCount > 0 Then
				cursorWrapper4.Position = 0
				If cursorWrapper4.GetDouble("prezzo") >= 0 Then
					str = "Prezzo = " & NumberFormat2(cursorWrapper4.GetDouble("prezzo"), 1, 2, 2, False)
				End If
			End If
			labelWrapper2.Text = str
			Return
		End If
		Return
	End If
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub pDes_EnterPressed
	vIME1.HideKeyboard
	Sub006()
	Sub007()
End Sub

Sub pDes_FocusChanged(z As Boolean)
	If z Then
		vIME1.Initialize("IME")
		pDes.SelectionStart = pDes.Text.Length
		Return
	End If
	vIME1.HideKeyboard
	Sub006()
	Sub007()
End Sub

Sub pDes_TextChanged(str As String, str2 As String)
	If str2.Length > 50 Then
		pDes.Text = str
		pDes.SelectionStart = str.Length
	End If
	vBln3 = True
End Sub

Sub pLista_Click
End Sub

Sub Sub004 As Int
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

Sub Selrow_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(0)
	Dim labelWrapper2 As Label = getpanel.GetView(1)
	Dim labelWrapper3 As Label = getpanel.GetView(6)
	If vBln3 Then
		Sub006()
	End If
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint ='" & labelWrapper.Text & "'")
	If Not(vExecQuerySingleResult = Null) Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 1
		vDlg1.Input = vExecQuerySingleResult
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Descrizione"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire la descrizione dell'articolo " & vExecQuerySingleResult, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			Dim left As String = modfunstr.left(vDlg1.Input.Replace("'", "").Replace("%", "").Replace("[", "").Replace("#", "").Replace(",", ""), 50)
			Main.vSql1.ExecNonQuery("update dettmnu set descrizione ='" & left & "' where codint  ='" & labelWrapper.Text & "' and codmnu=" & pCodint.Text)
			vCur1.Position = labelWrapper3.Text
			labelWrapper2.Text = left & CRLF & "    Reparto:" & vCur1.GetString("desreparto")
		End If
	End If
	mod1.Sub081
End Sub

Sub Sub005(cursorWrapper As Cursor, z As Boolean, str As String, z2 As Boolean) As Boolean
	Dim vShow As Int
	Do While Not(False)
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 12290
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Listino:" & NumberFormat2(cursorWrapper.GetString("list1"), 1, 2, 2, False) & " €"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		If z2 Then
			vShow = -1
			vDlg1.Input = 0
		Else
			Dim str2 As String = "Indicare il prezzo per " & cursorWrapper.GetString("descrizione") & " (Listino:" & NumberFormat2(cursorWrapper.GetString("list1"), 1, 2, 2, False) & " €)"
			vShow = vDlg1.Show(str2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		End If
		If vShow = -1 Then
			If IsNumber(vDlg1.Input) Then
				Dim vTmp As Double = mod1.Sub056(vDlg1.Input)
				Dim vNumberToString As String = vTmp
				If vTmp > 9999 Then
					Dim vObjectToCharSequence As Object = "Prezzo troppo elevato"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Else
					Dim i As Int = 0
					Dim str4 As String = ""
					If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra inner join reparti on reparti.codice = anagra.reparto where codint ='" & str & "'") > 0 Then
						str4 = Main.vSql1.ExecQuerySingleResult("select reparti.descrizione from anagra inner join reparti on reparti.codice = anagra.reparto where codint ='" & str & "'")
						i = Main.vSql1.ExecQuerySingleResult("select reparti.indice from anagra inner join reparti on reparti.codice = anagra.reparto where codint ='" & str & "'")
					End If
					If z Then
						Main.vSql1.ExecNonQuery("update dettmnu set desreparto ='" & str4 & "',indice=" & i & ", prezzo  = " & vNumberToString.Replace(",", ".") & " where codint  ='" & str & "' and codmnu=" & pCodint.Text)
					Else
						Main.vSql1.ExecNonQuery("insert into dettmnu (codmnu,codint,descrizione,prezzo,indice,desreparto) values(" & pCodint.Text & ",'" & str & "','" & cursorWrapper.GetString("descrizione") & "'," & vNumberToString.Replace(",", ".") & "," & i & ",'" & str4 & "')")
					End If
					mod1.Sub081
					Return True
				End If
			Else
				Dim vObjectToCharSequence3 As Object = "Prezzo non valido"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			End If
		Else
			mod1.Sub081
			Return False
		End If
	Loop
	Return False
End Sub

Sub Sub006
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Trim, 50)
	Main.vSql1.ExecNonQuery("update headmnu set descrizione ='" & pDes.Text & "' where codmnu =" & pCodint.Text)
	Main.vSql1.ExecNonQuery("update anagra set descrizione ='" & pDes.Text & "' where codint ='mnu" & pCodint.Text & "'")
	vBln3 = False
	Sub007()
End Sub

Sub Sub007
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select * from headmnu order by codmnu")
	vCur2.Position = 0
	vLst1.Initialize
	vLst1.Clear
	Dim rowCount As Int = vCur2.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		vCur2.Position = i
		vLst1.Add(vCur2.GetString("descrizione").Trim)
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

