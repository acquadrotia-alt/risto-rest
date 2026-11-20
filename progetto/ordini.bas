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
	Public vStr1 As String
	Public vStr2 As String = " asc"
	Public vStr3 As String
	Public vStr4 As String
	Public vBln3 As Boolean
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public vcustomlistviewold1 As customlistviewold
	Public pCodint As EditText
	Public pDes As EditText
	Public pLista As Panel
	Public vWebView1 As WebView
	Public vCur1 As Cursor
	Public vCur2 As Cursor
	Public vIME1 As IME
	Public vLst1 As List
	Public vSMTP1 As SMTP
	Public vDlg1 As InputDialog
	Public bNew As Button
	Public vLst2 As List
	Public vLst3 As List
	Public bCarica As Button
	Public bRiattiva As Button
	Public bDaVenduto As Button
	Public bAzzera As Button
	Public bStampa As Button
	Public Mail As Button
	Public MailTabacchi As Button
	Public pnlWv As Panel
	Public vLst4 As List
	Public vLst5 As List
	Public vLst6 As List
	Public vLst7 As List
	Public bDaSottoscorta As Button
	Public Copia As Button
	Public CopiaTabacchi As Button
	Public lblTitolo As Label
	Public lblRiepTitolo As Label
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
			Sub005("ordini")
			vLst4.Initialize
			vLst5.Initialize
			vLst4.Clear
			vLst5.Clear
			vLst6.Initialize
			vLst7.Initialize
			vLst6.Clear
			vLst7.Clear
			vLst6.Add("20;Codice;S")
			vLst6.Add("10;Qta;N")
			vLst7.Add("Codice")
			vLst7.Add("Qta")
			vLst4.Add("10;Codice;S")
			vLst4.Add("25;Descrizione;S")
			vLst4.Add("10;Reparto;S")
			vLst4.Add("10;Listino1;N")
			vLst4.Add("10;ListinoAcq;N")
			vLst4.Add("8;Qta;N")
			vLst4.Add("8;Giacenza;N")
			vLst4.Add("8;Sconto;N")
			vLst5.Add("Codice")
			vLst5.Add("Descrizione")
			vLst5.Add("Reparto")
			vLst5.Add("Listino1")
			vLst5.Add("ListinoAcq")
			vLst5.Add("Qta")
			vLst5.Add("Giacenza")
			vLst5.Add("Sconto")
			lblTitolo.Color = Main.v_colormenutitle
			mod1.Sub173(lblTitolo)
			lblRiepTitolo.Color = Main.v_colormenutitle
			mod1.Sub173(lblRiepTitolo)
			vLst1.Initialize
			pnlWv.Background = mod1.Sub155(Colors.RGB(245, 245, 245), 0)
			vWebView1.Initialize("cStampa")
			pnlWv.AddView(vWebView1, PerXToCurrent(1), DipToCurrent(150), PerXToCurrent(99), PerYToCurrent(100) - DipToCurrent(150))
			vcustomlistviewold1.Initialize(Me, "clv2")
			vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
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
				vLst3.Initialize
				Sub006()
				If Main.vStr14 <> "" Then
					Dim cursorWrapper As Cursor
					Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where codint ='" & Main.vStr14 & "'")
					If Main.vBln33 And cursorWrapper2.RowCount > 0 Then
						cursorWrapper2.Position = 0
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettord where codint = '" & Main.vStr14 & "' and codordine=" & pCodint.Text) > 0 Then
							Dim vObjectToCharSequence As Object = "Articolo già in ordine"
							Dim vObjectToCharSequence2 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
							Main.vBln33 = False
							Main.vStr14 = ""
							mod1.Sub081
							Return
						End If
						Sub007(cursorWrapper2, False, Main.vStr14, 0)
					End If
					Main.vBln33 = False
					Main.vStr14 = ""
					Sub004(False)
				Else
					Sub004(True)
				End If
				vBln2 = False
				bRiattiva.Background = mod1.Sub155(-6587945, 25)
				bCarica.Background = mod1.Sub155(-6587945, 25)
				bDaVenduto.Background = mod1.Sub155(-6587945, 25)
				bDaSottoscorta.Background = mod1.Sub155(-6587945, 25)
				bAzzera.Background = mod1.Sub155(-6587945, 25)
				bNew.Background = mod1.Sub155(-8729438, 40)
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				MailTabacchi.Enabled = Main.v_tabacchi
				Copia.Enabled = Main.v_usbpath <> ""
				CopiaTabacchi.Enabled = Main.v_usbpath <> ""
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

Sub bAzzera_Click
	Dim vMsgbox2 As Int
	mod1.vStr2 = "Sub bAzzera_Click"
	Try
		Dim vObjectToCharSequence As Object = "Confermi la cancellazione dell'ordine " & pCodint.Text & " ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		vMsgbox2 = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		mod1.Sub081
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vMsgbox2 = -2 Then
		Return
	End If
	Main.vSql1.ExecNonQuery("delete from dettord where codordine = " & pCodint.Text)
	Sub004(True)
End Sub

Sub bCarica_Click
	If vCur2.GetInt("elaborato") > 0 Then
		Dim vObjectToCharSequence As Object = "Ordine già trasformato in carico."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	Dim vObjectToCharSequence3 As Object = "Confermi la selezione dell'ordine " & pCodint.Text & " ?"
	Dim vObjectToCharSequence4 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
	mod1.Sub081
	If vMsgbox2 = -2 Then
		Return
	End If
	Main.vStr14 = ""
	Main.vBln33 = False
	vBln2 = True
	Main.vInt2 = pCodint.Text
	Main.vStr6 = "ca"
	mod1.Sub205("ca", "", 0)
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub bDaSottoscorta_Click
	Dim vMsgbox2 As Int
	mod1.vStr2 = "Sub bDaSottoscorta_Click"
	Try
		If vcustomlistviewold1.Sub008 > 0 Then
			Dim vObjectToCharSequence As Object = "Esistono righe già selezionate per questo ordine." & CRLF & "Si desidera proseguire ugualmente ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
			mod1.Sub081
			If vMsgbox22 = -2 Then
				Return
			End If
		End If
		Dim vObjectToCharSequence3 As Object = "Si desidera generare l'ordine basandosi sui valori di sottoscorta ?"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		vMsgbox2 = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
		mod1.Sub081
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vMsgbox2 = -2 Then
		Return
	End If
	Dim vInputList1 As Int = idLib.InputList1(vLst3, "Selezionare il Reparto ")
	If vInputList1 >= 0 Then
		Dim replace As String = "select codint from anagra where reparto = @ and sottoscorta > giac  and sottoscorta>0 and qtaottimale>=0 and flgusointerno=0".Replace("@", vInputList1)
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery(replace)
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				Dim cursorWrapper3 As Cursor
				Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where codint ='" & cursorWrapper2.GetString("codint") & "'")
				If cursorWrapper4.RowCount > 0 Then
					cursorWrapper4.Position = 0
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettord where codint = '" & cursorWrapper2.GetString("codint") & "' and codordine=" & pCodint.Text) > 0 Then
						Dim vObjectToCharSequence5 As Object = "Articolo " & cursorWrapper2.GetString("codint") & " già in ordine"
						Dim vObjectToCharSequence6 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
					Else
						Dim vObjectToNumber As Int = IIf(cursorWrapper4.GetInt("qtaottimale") < cursorWrapper4.GetInt("sottoscorta"), cursorWrapper4.GetInt("sottoscorta"), cursorWrapper4.GetInt("qtaottimale")) - cursorWrapper4.GetInt("giac")
						Dim vGetInt As Int = cursorWrapper4.GetInt("qtacartone")
						If vGetInt = 0 Then
							vGetInt = 1
						End If
						If vObjectToNumber Mod vGetInt <> 0 Then
							vObjectToNumber = (Floor(vObjectToNumber / vGetInt) + 1) * vGetInt
						End If
						Sub007(cursorWrapper4, False, cursorWrapper2.GetString("codint"), vObjectToNumber)
					End If
				End If
			Next
			Sub004(True)
		End If
	End If
	mod1.Sub081
End Sub

Sub bDaVenduto_Click
	Dim vMsgbox2 As Int
	mod1.vStr2 = "Sub bDaVenduto_Click"
	Try
		If vcustomlistviewold1.Sub008 > 0 Then
			Dim vObjectToCharSequence As Object = "Esistono righe già selezionate per questo ordine." & CRLF & "Si desidera proseguire ugualmente ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
			mod1.Sub081
			If vMsgbox22 = -2 Then
				Return
			End If
		End If
		Dim vObjectToCharSequence3 As Object = "Si desidera generare l'ordine basandosi sulle vendite di un periodo?"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		vMsgbox2 = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
		mod1.Sub081
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vMsgbox2 <> -1 Then
		Return
	End If
	Dim vObjectToCharSequence5 As Object = "Creare l'ordine considerando anche le giacenze e sottoscorta (Venduto - Giacenza + Sottoscorta) o ordinare solo la quantità venduta?"
	Dim vObjectToCharSequence6 As Object = Main.vStr8
	Dim vMsgbox23 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Venduto", "", "Venduto - Giacenza + Sottoscorta", Main.vBmp1)
	Dim z As Boolean = vMsgbox23 = -2
	Dim vInputList1 As Int = idLib.InputList1(vLst3, "Selezionare il Reparto ")
	If vInputList1 >= 0 Then
		Dim str As String = "Select sum(qta) as tQta,codint from venduto where causale = 'sc' and  reparto = " & vInputList1
		Dim dateDialog As DateDialog
		Dim dateDialog2 As DateDialog
		dateDialog.Year = DateTime.GetYear(mod1.Sub058)
		dateDialog.Month = DateTime.GetMonth(mod1.Sub058)
		dateDialog.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
		Dim vShow As Int = dateDialog.Show("Impostare la prima data ", "Data inizio", "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			dateDialog2.Year = DateTime.GetYear(mod1.Sub058)
			dateDialog2.Month = DateTime.GetMonth(mod1.Sub058)
			dateDialog2.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
			Dim vShow2 As Int = dateDialog2.Show("Impostare la seconda data ", "Data Fine", "Ok", "Annulla", "", Main.vBmp1)
			If vShow2 = -1 Then
				Dim str2 As String = str & " and datam3 > '" & dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & " 00:00:00' and datam3 < '" & dateDialog2.Year & "-" & NumberFormat(dateDialog2.Month, 2, 0) & "-" & NumberFormat(dateDialog2.DayOfMonth, 2, 0) & " 23:59:59' group by venduto.codint order by descrizione "
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql2.ExecQuery(str2)
				If cursorWrapper2.RowCount > 0 Then
					Dim rowCount As Int = cursorWrapper2.RowCount - 1
					Dim i As Int
					For i = 0 To rowCount
						cursorWrapper2.Position = i
						Dim vGetInt As Int = cursorWrapper2.GetInt("tQta")
						If z Or vGetInt > 0 Then
							Dim cursorWrapper3 As Cursor
							Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where codint ='" & cursorWrapper2.GetString("codint") & "'")
							If cursorWrapper4.RowCount > 0 Then
								cursorWrapper4.Position = 0
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from dettord where codint = '" & cursorWrapper2.GetString("codint") & "' and codordine=" & pCodint.Text) > 0 Then
									Dim vObjectToCharSequence7 As Object = "Articolo " & cursorWrapper2.GetString("codint") & " già in ordine"
									Dim vObjectToCharSequence8 As Object = Main.vStr8
									Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
								Else If Not(z) Or vGetInt = vGetInt - cursorWrapper4.GetInt("giac") + cursorWrapper4.GetInt("sottoscorta") > 0 Then
									Sub007(cursorWrapper4, False, cursorWrapper2.GetString("codint"), vGetInt)
								End If
							End If
							cursorWrapper4.Close
						End If
					Next
					Sub004(True)
				End If
			End If
		End If
	End If
End Sub

Sub bNew_Click
	Main.vBln33 = True
	Main.vInt24 = Main.d_plu
	Main.vInt26 = 4
	Main.vBln32 = True
	vBln2 = True
	mod1.Sub198("tabelle")
End Sub

Sub bNew_LongClick
	vBln3 = Not(vBln3)
	If vBln3 Then
		bNew.Text = "Nuovo Articolo (Indicare il Peso)"
		Return
	End If
	bNew.Text = "Nuovo Articolo (Indicare i Pezzi)"
End Sub

Sub bRiattiva_Click
	Dim vMsgbox2 As Int
	mod1.vStr2 = "Sub bRiattiva_Click"
	Try
		Dim vObjectToCharSequence As Object = "Confermi la riattivazione dell'ordine " & pCodint.Text & " ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		vMsgbox2 = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		mod1.Sub081
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vMsgbox2 = -2 Then
		Return
	End If
	Main.vSql1.ExecNonQuery("update headord set elaborato=0 where codordine =" & pCodint.Text)
	Dim position As Int = vCur2.Position
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select * from headord order by codordine")
	vCur2.Position = position
	Sub008()
End Sub

Sub bSeleziona_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst2, "L'ordine da richiamare")
	If vInputList1 >= 0 Then
		vCur2.Position = vInputList1
		pDes.Text = vCur2.GetString("descrizione")
		Sub008()
		pCodint.Text = vInputList1
		Sub004(True)
		Return
	End If
End Sub

Sub bStampa_Click
	mod1.vStr2 = "Sub bStampa_Click"
	Try
		Mail.Visible = True
		vStr1 = "Select dettord.codint as Codice,dettord.descrizione as Descrizione,reparti.descrizione as Reparto,anagra.list1 as Listino1, anagra.list5 as ListinoAcq , dettord.qta as Qta, anagra.giac as Giacenza,anagra.scop as Sconto  from dettord inner join anagra  on anagra.codint = dettord.codint inner join reparti on reparti.codice = anagra.reparto where codordine = " & pCodint.Text
		vWebView1.LoadHtml(dbutil.Sub004(Main.vSql1, vStr1, Null, 0, True, -1))
		vWebView1.Tag = vStr1
		vLst1.Clear
		vLst1.AddAll(ArrayToList(Array As String("Codice", "Descrizione", "Reparto", "Listino1", "ListinoAcq", "Qta", "Giacenza", "Sconto")))
		pnlWv.Visible = True
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub BtnOk_Click
	pnlWv.Visible = False
End Sub

Sub Button1_Click
	Main.vBln33 = False
	Main.vStr14 = ""
	vBln2 = True
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub Copia_Click
	Sub001(False)
	mod1.Sub081
End Sub

Sub CopiaTabacchi_Click
	Sub002(False)
	mod1.Sub081
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ordini.java, metodo m7… (riga 1043).
Sub Sub001(z As Boolean)
	Dim z2 As Boolean
	Dim i As Int
	Try
		If z Then
			If Main.v_mserver <> "" Then
				If Main.v_mporta <> "" Then
					If Main.v_muser <> "" Then
						If Main.v_mpwd <> "" Then
							If Main.v_md1 = "" Then
							End If
						End If
					End If
				End If
			End If
			mod1.Sub081
			Return
		End If
		Dim text As String = pDes.Text
		Dim str As String = "Confermi l'invio della mail ? "
		If Not(z) Then
			str = "Confermi la copia dell'ordine su chiave USB ?"
		End If
		Dim vObjectToCharSequence As Object = str
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 = -1 Then
			If Not(z) Then
				ProgressDialogShow2("Copia in corso ...", False)
			Else
				ProgressDialogShow2("Invio in corso ...", False)
				Dim parseDouble As Int = Main.v_mporta
				vSMTP1.Initialize(Main.v_mserver, parseDouble, Main.v_muser, Main.v_mpwd, "SMTP")
				Dim sMTPWrapper2 As SMTP = vSMTP1
				If Main.v_mporta <> 465 Then
					If Main.v_mporta <> 587 Then
						z2 = False
						sMTPWrapper2.UseSSL = z2
						If Main.v_md1 <> "" Then
							mod1.Sub004(vSMTP1, Main.v_md1, False)
						End If
						If Main.v_md2 <> "" Then
							mod1.Sub004(vSMTP1, Main.v_md2, False)
						End If
						vSMTP1.Subject = text
					End If
				End If
				z2 = True
				sMTPWrapper2.UseSSL = z2
				If Main.v_md1 <> "" Then
				End If
				If Main.v_md2 <> "" Then
				End If
				vSMTP1.Subject = text
			End If
			Dim vTmp As String = mod1.Sub061(mod1.Sub058)
			Dim writableWorkbookWrapper As WritableWorkbook
			writableWorkbookWrapper.Initialize(mod1.vStr4, text & ".xls")
			Dim vAddSheet As WritableSheet = writableWorkbookWrapper.AddSheet(text, 0)
			Dim writableCellFormatWrapper As WritableCellFormat
			writableCellFormatWrapper.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			Dim writableCellFormatWrapper2 As WritableCellFormat
			writableCellFormatWrapper2.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			writableCellFormatWrapper2.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
			Dim writableCellFormatWrapper3 As WritableCellFormat
			writableCellFormatWrapper3.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			Dim writableCellFormatWrapper4 As WritableCellFormat
			writableCellFormatWrapper4.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			writableCellFormatWrapper4.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
			Dim writableCellFormatWrapper5 As WritableCellFormat
			writableCellFormatWrapper5.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_RED)
			Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GOLD)
			Dim writableCellFormatWrapper6 As WritableCellFormat
			writableCellFormatWrapper6.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREEN)
			Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			Dim writableCellWrapper As WritableCell
			writableCellWrapper.InitializeText(0, 0, text)
			writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
			vAddSheet.AddCell(writableCellWrapper)
			writableCellWrapper.InitializeText(2, 0, vTmp)
			writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
			vAddSheet.AddCell(writableCellWrapper)
			vAddSheet.SetRowHeight(0, 18)
			Dim stringBuilderWrapper As StringBuilder
			stringBuilderWrapper.Initialize
			stringBuilderWrapper.Append(text).Append(CRLF)
			stringBuilderWrapper.Append("").Append(CRLF)
			stringBuilderWrapper.Append("Data e ora di stampa: " & vTmp).Append(CRLF)
			stringBuilderWrapper.Append("Inviato da : ").Append(CRLF)
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from intesta order by codice")
			If cursorWrapper2.RowCount > 0 Then
				Dim i2 As Int
				For i2 = 0 To 5
					cursorWrapper2.Position = i2
					stringBuilderWrapper.Append(cursorWrapper2.GetString("descrizione")).Append(CRLF)
				Next
			End If
			stringBuilderWrapper.Append(" ").Append(CRLF)
			If vStr3 = "" Then
				i = 0
			Else
				stringBuilderWrapper.Append("Filtro: ").Append(CRLF)
				writableCellWrapper.InitializeText(0, 2, "Filtro: ")
				writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
				vAddSheet.AddCell(writableCellWrapper)
				stringBuilderWrapper.Append(vStr3 & vStr4).Append(CRLF)
				writableCellWrapper.InitializeText(1, 2, vStr3 & vStr4)
				writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
				vAddSheet.AddCell(writableCellWrapper)
				stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
				i = 5
			End If
			Dim size As Int = vLst5.Size - 1
			Dim str4 As String = ""
			Dim i3 As Int = 0
			Do While i3 <= size
				Dim vObjectToString As String = vLst5.Get(i3)
				Dim str5 As String = str4 & vObjectToString
				writableCellWrapper.InitializeText(i3, i, vObjectToString.Trim)
				writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
				vAddSheet.AddCell(writableCellWrapper)
				Select vObjectToString
					Case "Reparto"
						vAddSheet.SetColumnWidth(i3, 12)
					Case "Descrizione"
						vAddSheet.SetColumnWidth(i3, 25)
					Case "Codice", "Qta"
						vAddSheet.SetColumnWidth(i3, 10)
					Case Else
						vAddSheet.SetColumnWidth(i3, 7)
				End Select
				i3 = i3 + 1
				str4 = str5
			Loop
			Dim cursorWrapper3 As Cursor
			Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery(vWebView1.Tag)
			Dim rowCount As Int = cursorWrapper4.RowCount - 1
			Dim i4 As Int = 0
			Dim i5 As Int = i + 1
			Do While i4 <= rowCount
				cursorWrapper4.Position = i4
				Dim size2 As Int = vLst4.Size - 1
				Dim str6 As String = ""
				Dim i6 As Int
				For i6 = 0 To size2
					Dim vSplit() As String = Regex.Split(";", vLst4.Get(i6))
					Dim recsizeVar As recsize
					recsizeVar.size = vSplit(0)
					recsizeVar.descrizione = vSplit(1)
					recsizeVar.Tipo = vSplit(2)
					Dim writableCellFormatWrapper7 As WritableCellFormat = IIf(i4 Mod 2 = 0, writableCellFormatWrapper3, writableCellFormatWrapper4)
					If recsizeVar.Tipo = "S" Then
						Dim sb3 As String = str6 & modfunstr.left(cursorWrapper4.GetString(recsizeVar.descrizione).Trim & modfunstr.Sub004(recsizeVar.size), recsizeVar.size)
						writableCellWrapper.InitializeText(i6, i5, cursorWrapper4.GetString(recsizeVar.descrizione).Trim)
						writableCellWrapper.SetCellFormat(writableCellFormatWrapper7)
						vAddSheet.AddCell(writableCellWrapper)
						str6 = sb3
					Else If recsizeVar.Tipo = "N" Then
						Dim sb5 As String = str6 & modfunstr.Sub003(modfunstr.Sub004(recsizeVar.size) & NumberFormat2(cursorWrapper4.GetDouble(recsizeVar.descrizione), 1, 2, 2, False), recsizeVar.size)
						If recsizeVar.descrizione = "Giacenza" Then
							writableCellFormatWrapper7 = IIf(cursorWrapper4.GetDouble(recsizeVar.descrizione) <= 0, writableCellFormatWrapper5, writableCellFormatWrapper6)
						End If
						writableCellWrapper.InitializeNumber(i6, i5, cursorWrapper4.GetString(recsizeVar.descrizione).Trim)
						writableCellWrapper.SetCellFormat(writableCellFormatWrapper7)
						vAddSheet.AddCell(writableCellWrapper)
						str6 = sb5
					End If
				Next
				i4 = i4 + 1
				i5 = i5 + 1
			Loop
			writableWorkbookWrapper.Write
			writableWorkbookWrapper.Close
			If Not(z) Then
				Try
					File.Copy(mod1.vStr4, text & ".xls", Main.v_usbpath, text & ".xls")
					mod1.Sub178(2000)
					Dim vObjectToCharSequence3 As Object = "Il file " & text & ".xls è stato copiato su chiave USB."
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				Catch
					Dim vObjectToCharSequence5 As Object = "Si sono verificati problemi durante la copia del file." & CRLF & "Verificare che la chiave USB sia inserita correttamente"
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				End Try
				ProgressDialogHide
			Else
				vSMTP1.Body = stringBuilderWrapper
				vSMTP1.AddAttachment(mod1.vStr4, text & ".xls")
				vSMTP1.Send
			End If
		End If
		mod1.Sub081
		Return
	Catch
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ordini.java, metodo m0… (riga 1334).
Sub Sub002(z As Boolean)
	Dim z2 As Boolean
	Dim i As Int
	Try
		If z Then
			If Main.v_mserver <> "" Then
				If Main.v_mporta <> "" Then
					If Main.v_muser <> "" Then
						If Main.v_mpwd <> "" Then
						End If
					End If
				End If
			End If
			mod1.Sub081
			Return
		End If
		Dim vObjectToString As String = vLst3.Get(0)
		Dim str As String = pDes.Text & " Tabacchi"
		Dim str2 As String = "Confermi l'invio dell'ordine tabacchi? "
		If Not(z) Then
			str2 = "Confermi la copia dell'ordine tabacchi su chiave USB ?"
		End If
		Dim vObjectToCharSequence As Object = str2
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 = -1 Then
			If Not(z) Then
				ProgressDialogShow2("Copia in corso ...", False)
			Else
				ProgressDialogShow2("Invio in corso ...", False)
				Dim parseDouble As Int = Main.v_mporta
				vSMTP1.Initialize(Main.v_mserver, parseDouble, Main.v_muser, Main.v_mpwd, "SMTP")
				Dim sMTPWrapper2 As SMTP = vSMTP1
				If Main.v_mporta <> 465 Then
					If Main.v_mporta <> 587 Then
						z2 = False
						sMTPWrapper2.UseSSL = z2
						If Main.v_md1 <> "" Then
							mod1.Sub004(vSMTP1, Main.v_md1, False)
						End If
						If Main.v_md2 <> "" Then
							mod1.Sub004(vSMTP1, Main.v_md2, False)
						End If
						If Main.v_md4 <> "" Then
							Dim to_ As List = vSMTP1.To
							to_.Add(Main.v_md4)
						End If
						vSMTP1.Subject = str
					End If
				End If
				z2 = True
				sMTPWrapper2.UseSSL = z2
				If Main.v_md1 <> "" Then
				End If
				If Main.v_md2 <> "" Then
				End If
				If Main.v_md4 <> "" Then
				End If
				vSMTP1.Subject = str
			End If
			Dim vTmp As String = mod1.Sub061(mod1.Sub058)
			Dim writableWorkbookWrapper As WritableWorkbook
			writableWorkbookWrapper.Initialize(mod1.vStr4, str & ".xls")
			Dim vAddSheet As WritableSheet = writableWorkbookWrapper.AddSheet(str, 0)
			Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 13, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			Dim writableCellFormatWrapper As WritableCellFormat
			writableCellFormatWrapper.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			writableCellFormatWrapper.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
			Dim writableCellFormatWrapper2 As WritableCellFormat
			writableCellFormatWrapper2.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			Dim writableCellFormatWrapper3 As WritableCellFormat
			writableCellFormatWrapper3.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			writableCellFormatWrapper3.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
			Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_RED)
			Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GOLD)
			Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREEN)
			Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
			Dim writableCellWrapper As WritableCell
			vAddSheet.SetRowHeight(0, 18)
			Dim stringBuilderWrapper As StringBuilder
			stringBuilderWrapper.Initialize
			stringBuilderWrapper.Append(str).Append(CRLF)
			stringBuilderWrapper.Append("").Append(CRLF)
			stringBuilderWrapper.Append("Data e ora di stampa: " & vTmp).Append(CRLF)
			stringBuilderWrapper.Append("Inviato da : ").Append(CRLF)
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from intesta order by codice")
			If cursorWrapper2.RowCount > 0 Then
				Dim i2 As Int
				For i2 = 0 To 5
					cursorWrapper2.Position = i2
					stringBuilderWrapper.Append(cursorWrapper2.GetString("descrizione")).Append(CRLF)
				Next
			End If
			stringBuilderWrapper.Append(" ").Append(CRLF)
			Dim size As Int = vLst7.Size - 1
			Dim i3 As Int
			For i3 = 0 To size
				Dim str5 As String = "Codice AAMS"
				If i3 = 1 Then
					str5 = "Quantita"
				End If
				writableCellWrapper.InitializeText(i3, 0, str5.Trim)
				writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
				vAddSheet.AddCell(writableCellWrapper)
				vAddSheet.SetColumnWidth(i3, 20)
			Next
			Dim i4 As Int = 1
			Dim cursorWrapper3 As Cursor
			Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery(vWebView1.Tag)
			Dim rowCount As Int = cursorWrapper4.RowCount - 1
			Dim i5 As Int = 0
			Do While i5 <= rowCount
				cursorWrapper4.Position = i5
				If cursorWrapper4.GetString("Codice").Length <= 2 Or Not(cursorWrapper4.GetString("Codice").StartsWith("98")) Then
					i = i4
				Else
					Dim vNumberToString As String = modfunstr.Sub006(cursorWrapper4.GetString("Codice").SubString(2))
					If cursorWrapper4.GetString("Reparto").Trim = vObjectToString.Trim Then
						Dim size2 As Int = vLst4.Size - 1
						Dim i6 As Int
						For i6 = 0 To size2
							If i6 <= 0 Or i6 = 5 Then
								Dim vSplit() As String = Regex.Split(";", vLst4.Get(i6))
								Dim recsizeVar As recsize
								recsizeVar.size = vSplit(0)
								recsizeVar.descrizione = vSplit(1)
								recsizeVar.Tipo = vSplit(2)
								If i6 = 0 Then
									writableCellWrapper.InitializeNumber(i6, i4, vNumberToString)
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
									vAddSheet.AddCell(writableCellWrapper)
								Else If i6 = 5 Then
									Dim parseDouble2 As Double = Main.vSql1.ExecQuerySingleResult("Select peso from anagra  where codint = '" & cursorWrapper4.GetString("Codice") & "'")
									If parseDouble2 > 0 Then
										writableCellWrapper.InitializeNumber(1, i4, Round2(Round2(parseDouble2 * cursorWrapper4.GetInt(recsizeVar.descrizione), 3) / 1000, 3))
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
									End If
								End If
							End If
						Next
						i = i4 + 1
					Else
						i = i4
					End If
				End If
				i5 = i5 + 1
				i4 = i
			Loop
			writableWorkbookWrapper.Write
			writableWorkbookWrapper.Close
			If Not(z) Then
				Try
					File.Copy(mod1.vStr4, str & ".xls", Main.v_usbpath, str & ".xls")
					mod1.Sub178(2000)
					Dim vObjectToCharSequence3 As Object = "Il file " & str & ".xls è stato copiato su chiave USB."
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				Catch
					Dim vObjectToCharSequence5 As Object = "Si sono verificati problemi durante la copia del file." & CRLF & "Verificare che la chiave USB sia inserita correttamente"
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				End Try
				ProgressDialogHide
			Else
				vSMTP1.Body = stringBuilderWrapper
				vSMTP1.AddAttachment(mod1.vStr4, str & ".xls")
				vSMTP1.Send
			End If
		End If
		mod1.Sub081
		Return
	Catch
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
		Return
	End Try
End Sub

Sub Sub003(str As String, str2 As String, i As Int) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Color = -1
		Dim labelWrapper As Label
		labelWrapper.Initialize("selrow")
		labelWrapper.Gravity = Bit.Or(16, 3)
		labelWrapper.Tag = ""
		labelWrapper.Text = vCur1.GetString("codint")
		labelWrapper.Background = mod1.Sub155(-1, 0)
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("selrow")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.Text = str2
		If vCur1.GetInt("flgmag") = 1 Then
			labelWrapper2.Text = labelWrapper2.Text & CRLF & "(Giacenza " & vCur1.GetString("giac") & ")"
		End If
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(-1, 0)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("modoff")
		labelWrapper3.Gravity = Bit.Or(16, 1)
		labelWrapper3.Text = "Qta " & NumberFormat2(vCur1.GetString("qta"), 1, 0, 0, False)
		If vCur1.GetInt("peso") > 0 Then
			labelWrapper3.Text = labelWrapper3.Text & " (Peso:" & NumberFormat2(vCur1.GetInt("qta") * vCur1.GetDouble("peso"), 1, 3, 0, False) & ")"
		End If
		labelWrapper3.TextSize = 16
		labelWrapper3.TextColor = -16777216
		Dim vGetInt As Int = vCur1.GetInt("qta")
		labelWrapper3.Background = mod1.Sub155(-8729438, 0)
		If vCur1.GetInt("qtacartone") > 0 And vGetInt Mod vCur1.GetInt("qtacartone") <> 0 Then
			labelWrapper3.Background = mod1.Sub155(-65536, 0)
		End If
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

Sub Cstampa_OverrideUrl(str As String) As Boolean
	mod1.vStr2 = "Sub cStampa_OverrideUrl (Url As String) As Boolean"
	Try
		Dim vSplit() As String = Regex.Split("[.]", str.SubString(7))
		Dim parseDouble As Int = vSplit(0)
		If vSplit(1) = -1 Then
			If vStr1 <> "" Then
				vWebView1.LoadHtml(dbutil.Sub004(Main.vSql1, vStr1 & " order by " & vLst1.Get(parseDouble) & vStr2, Null, 0, True, parseDouble))
				vWebView1.Tag = vStr1 & " order by " & vLst1.Get(parseDouble) & vStr2
				vStr4 = " Ordinamento:" & vLst1.Get(parseDouble)
				If vStr2 = " asc" Then
					vStr2 = " desc"
				Else
					vStr2 = " asc"
				End If
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return True
End Sub

Sub Sub004(z As Boolean)
	Dim i As Int
	mod1.vStr2 = "Sub Init"
	Try
		ProgressDialogShow("Caricamento dati in corso ...")
		If vBln1 Then
			Sub009()
			vCur2.Position = 0
			Sub008()
			pDes.Text = vCur2.GetString("descrizione")
			pCodint.Text = "0"
			pCodint.Enabled = False
		End If
		If Not(vCur1.IsInitialized) Then
			i = -1
		Else
			i = vCur1.Position
		End If
		vBln1 = False
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("Select dettord.*,anagra.qtacartone,anagra.peso,anagra.giac,anagra.flgmag from dettord inner join anagra on anagra.codint = dettord.codint where codordine = " & pCodint.Text & " order by chiave")
		If z Then
			vcustomlistviewold1.Sub004
		End If
		If vCur1.RowCount > 0 Then
			If Not(z) Then
				Dim rowCount As Int = vCur1.RowCount - 1
				Dim vTmp As Int
				For vTmp = vcustomlistviewold1.Sub008 To rowCount
					vCur1.Position = vTmp
					vcustomlistviewold1.Sub001(Sub003(vTmp, vCur1.GetString("descrizione") & CRLF & "(Venduto reale: " & vCur1.GetString("qtana") & ")", DipToCurrent(70)), DipToCurrent(70), vCur1.GetString("descrizione"))
				Next
				vcustomlistviewold1.Sub012(vCur1.RowCount - 1)
			Else
				Dim rowCount2 As Int = vCur1.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount2
					vCur1.Position = i2
					vcustomlistviewold1.Sub001(Sub003(i2, vCur1.GetString("descrizione") & CRLF & "(Venduto reale: " & vCur1.GetString("qtana") & ")", DipToCurrent(70)), DipToCurrent(70), vCur1.GetString("descrizione"))
				Next
				If i < 0 Then
					vcustomlistviewold1.Sub012(vCur1.RowCount - 1)
				Else
					vcustomlistviewold1.Sub012(i)
				End If
			End If
		End If
		bCarica.Enabled = vCur1.RowCount > 0
		bAzzera.Enabled = vCur1.RowCount > 0
		bStampa.Enabled = vCur1.RowCount > 0
		ProgressDialogHide
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub005(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub Mail_Click
	mod1.vStr2 = "Sub Mail_Click"
	Sub001(True)
End Sub

Sub MailTabacchi_Click
	mod1.vStr2 = "Sub MailTabacchi_Click"
	Sub002(True)
End Sub

Sub Moddel_Click
	mod1.vStr2 = "Sub ElencoFiltroDel_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(0)
		Main.vSql1.ExecNonQuery("DELETE FROM  dettord WHERE codordine=" & pCodint.Text & " AND codint ='" & labelWrapper.Text & "'")
		Sub004(True)
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
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where codint ='" & labelWrapper.Text & "'")
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Dim cursorWrapper3 As Cursor
		Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select * from dettord where codordine = " & pCodint.Text & " and codint ='" & labelWrapper.Text & "'")
		If Sub007(cursorWrapper2, True, labelWrapper.Text, 0) Then
			Dim str As String = ""
			If cursorWrapper4.RowCount > 0 Then
				cursorWrapper4.Position = 0
				str = "Qta " & cursorWrapper4.GetInt("qta")
			End If
			labelWrapper2.Text = str
			labelWrapper2.Background = mod1.Sub155(-8729438, 0)
			If cursorWrapper2.GetInt("qtacartone") > 0 And cursorWrapper4.GetInt("qta") Mod cursorWrapper2.GetInt("qtacartone") <> 0 Then
				labelWrapper2.Background = mod1.Sub155(-65536, 0)
			End If
			If cursorWrapper2.GetInt("peso") > 0 Then
				labelWrapper2.Text = labelWrapper2.Text & " (Peso:" & NumberFormat2(cursorWrapper2.GetDouble("peso") * cursorWrapper4.GetInt("qta"), 1, 3, 0, False) & ")"
				Return
			End If
			Return
		End If
		Return
	End If
End Sub

Sub pDes_EnterPressed
	vIME1.HideKeyboard
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Replace("/", "").Replace("\", "").Replace(">", "").Replace("<", "").Replace(":", "").Replace("*", "").Replace("?", "").Replace(QUOTE, "").Replace("@", "").Replace("&", "").Replace("%", "").Trim, 50)
	Main.vSql1.ExecNonQuery("update headord set descrizione ='" & pDes.Text & "' where codordine =" & pCodint.Text)
	Sub009()
End Sub

Sub pDes_FocusChanged(z As Boolean)
	mod1.vStr2 = "Sub pDes_FocusChanged (HasFocus As Boolean)"
	Try
		If z Then
			vIME1.Initialize("IME")
			pDes.SelectionStart = pDes.Text.Length
		Else
			vIME1.HideKeyboard
			pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Replace("/", "").Replace("\", "").Replace(">", "").Replace("<", "").Replace(":", "").Replace("*", "").Replace("?", "").Replace(QUOTE, "").Replace("@", "").Replace("&", "").Replace("%", "").Trim, 50)
			Main.vSql1.ExecNonQuery("update headord set descrizione ='" & pDes.Text & "' where codordine =" & pCodint.Text)
			Sub009()
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub pDes_TextChanged(str As String, str2 As String)
	If str2.Length > 50 Then
		pDes.Text = str
		pDes.SelectionStart = str.Length
		Return
	End If
End Sub

Sub Sub006
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		vLst3.Clear
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM reparti order by codice")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			cursorWrapper2.Position = i
			vLst3.Add(cursorWrapper2.GetString("descrizione"))
		Next
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ordini.java, metodo m1… (riga 1980).
Sub Sub007(cursorWrapper As Cursor, z As Boolean, str As String, i As Int) As Boolean
	Dim i2 As Int
	Dim z2 As Boolean
	Dim i3 As Int
	Dim vFloor As Double
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Quantità "
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	If i = 0 Then
		If vBln3 And cursorWrapper.GetInt("peso") > 0 Then
			Dim str2 As String = "Inserire i grammi da ordinare per " & cursorWrapper.GetString("descrizione")
			i2 = vDlg1.Show(str2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			z2 = True
		Else
			Dim str4 As String = "Inserire la quantità da ordinare per " & cursorWrapper.GetString("descrizione")
			i2 = vDlg1.Show(str4, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			z2 = False
		End If
	Else
		i2 = -1
		vDlg1.Input = i
		z2 = False
	End If
	If i2 = -1 And IsNumber(vDlg1.Input) Then
		Dim parseDouble As Int = vDlg1.Input
		Dim vFloor2 As Int = IIf(z2, Floor(parseDouble / cursorWrapper.GetDouble("peso")), parseDouble)
		If cursorWrapper.GetInt("qtacartone") > 0 And vFloor2 Mod cursorWrapper.GetInt("qtacartone") <> 0 Then
			Dim vGetInt As Double = vFloor2 / cursorWrapper.GetInt("qtacartone")
			If vGetInt Mod 1 <> 0 Then
				vFloor = (Floor(vGetInt) + 1) * cursorWrapper.GetInt("qtacartone")
			Else
				vFloor = Floor(vGetInt) * cursorWrapper.GetInt("qtacartone")
			End If
			Dim i4 As Int = vFloor
			Dim str6 As String = "La quantità indicata da ordinare (" & vFloor2 & ")" & CRLF & "non è multipla del 'Numero pezzi per Cartone' (" & cursorWrapper.GetInt("qtacartone") & ")" & CRLF & "indicata nella anagrafica dell'articolo" & CRLF & cursorWrapper.GetString("descrizione") & CRLF & "Codice interno:" & cursorWrapper.GetString("codint") & CRLF & CRLF & "Si intende sostituirla con quantità " & i4 & " ?"
			If i > 0 Then
				i3 = i4
			Else
				Dim vObjectToCharSequence As Object = str6
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Dim str7 As String = "Mantieni Qta:" & vFloor2
				Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, str7, "", "Sostituisci", Main.vBmp1)
				If vMsgbox2 = -2 Then
					i3 = i4
				End If
			End If
			If Not(z) Then
				Main.vSql1.ExecNonQuery("update dettord set qta =" & i3 & ",qtana =" & vFloor2 & " where codint  ='" & str & "' and codordine=" & pCodint.Text)
			Else
				Main.vSql1.ExecNonQuery("insert into dettord (codordine,codint,descrizione,qta,qtana) values(" & pCodint.Text & ",'" & str & "','" & cursorWrapper.GetString("descrizione") & "'," & i3 & "," & vFloor2 & ")")
			End If
			mod1.Sub081
			Return True
		End If
		i3 = vFloor2
		If Not(z) Then
		End If
		mod1.Sub081
		Return True
	End If
	mod1.Sub081
	Return False
End Sub

Sub Sub008
	If vCur2.GetInt("elaborato") = 0 Then
		bRiattiva.Enabled = False
		bRiattiva.Text = "Ancora da Caricare"
		Return
	End If
	bRiattiva.Enabled = True
	bRiattiva.Text = "Rigenera Ordine (Caricato sul Mov." & vCur2.GetString("elaborato") & ")"
End Sub

Sub Smtp_MessageSent(z As Boolean)
	ProgressDialogHide
	If z Then
		ToastMessageShow("Mail inviata correttamente", True)
		Return
	End If
	Dim vObjectToCharSequence As Object = "Errore durante l'invio della Mail" & CRLF & CRLF & LastException.Message
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	mod1.Sub217(LastException.Message)
End Sub

Sub Sub009
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select * from headord order by codordine")
	vCur2.Position = 0
	vLst2.Initialize
	vLst2.Clear
	Dim rowCount As Int = vCur2.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		vCur2.Position = i
		vLst2.Add(vCur2.GetString("descrizione").Trim & IIf(vCur2.GetInt("elaborato") > 0, "(ELABORATO)", "(NON ELABORATO)"))
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

