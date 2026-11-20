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
	Type recsize(Tipo As String, descrizione As String, size As Int)
	Public vStr1 As String
	Public vSql1 As SQL
	Public vStr2 As String
	Public vStr3 As String
	Public vStr4 As String
	Public vStr5 As String
	Public vInt1 As Int
	Public vBln1 As Boolean
	Public vStringArr1(0) As String
End Sub

Sub Globals
	Public Chiudi As Button
	Public Mail As Button
	Public PDettaglio As Panel
	Public Stampa As Button
	Public WebView1 As WebView
	Public vLst1 As List
	Public vLst2 As List
	Public vLst3 As List
	Public vLst4 As List
	Public vLst5 As List
	Public vLst6 As List
	Public elencocampi As Label
	Public PParameters As Panel
	Public QueryStampa As Label
	Public vSMTP1 As SMTP
	Public PParametersMail As Panel
	Public lblTitolo As Label
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
				Sub001(vStr1)
				Dim vGetAllViewsRecursive As IterableList = Activity.GetAllViewsRecursive
				Dim size As Int = vGetAllViewsRecursive.Size
				Dim i As Int
				For i = 0 To size - 1
					Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i)
					If concreteViewWrapper Is EditText Or concreteViewWrapper Is CheckBox Or concreteViewWrapper Is Button Or concreteViewWrapper Is TextView Or concreteViewWrapper Is B4ASpinner Then
						If concreteViewWrapper Is Button And Not(concreteViewWrapper Is CheckBox) Then
							Dim buttonWrapper As Button = concreteViewWrapper
							mod1.Sub165(buttonWrapper)
							buttonWrapper.TextColor = -16777216
						Else If concreteViewWrapper Is TextView And Not(concreteViewWrapper Is EditText) And Not(concreteViewWrapper Is CheckBox) Then
							Dim labelWrapper As Label = concreteViewWrapper
							If labelWrapper.Text <> "Parametri" Then
								labelWrapper.Gravity = Bit.Or(16, 5)
								labelWrapper.Color = 0
								labelWrapper.TextColor = -16777216
							End If
						End If
					End If
				Next
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
				If vStr4 <> "" Then
					WebView1.Tag = WebView1.Tag.Replace("?", vStr4)
					QueryStampa.Text = QueryStampa.Text.Replace("?", vStr4)
				End If
				vBln1 = False
				mod1.Sub165(Mail)
				mod1.Sub165(Stampa)
				mod1.Sub165(Chiudi)
				vLst1.Initialize
				vLst3.Initialize
				vLst2.Initialize
				vLst5.Initialize
				vLst6.Initialize
				vLst4.Initialize
				vStringArr1 = Regex.Split(";", elencocampi.Text)
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Sub002()
			vLst1.Clear
			vLst3.Clear
			Dim vGetAllViewsRecursive2 As IterableList = PParameters.GetAllViewsRecursive
			Dim size2 As Int = vGetAllViewsRecursive2.Size
			Dim i2 As Int
			For i2 = 0 To size2 - 1
				Dim concreteViewWrapper2 As View = vGetAllViewsRecursive2.Get(i2)
				If concreteViewWrapper2.Tag = "cassa" Then
					vLst1.Add(concreteViewWrapper2.Text)
				End If
				If concreteViewWrapper2.Tag = "hs" Then
					vLst3.Add(concreteViewWrapper2.Text)
				End If
			Next
			vLst5.Clear
			vLst6.Clear
			Mail.Enabled = Not(Main.vBln25)
			Dim vGetAllViewsRecursive3 As IterableList = PParametersMail.GetAllViewsRecursive
			Dim size3 As Int = vGetAllViewsRecursive3.Size
			Dim i3 As Int
			For i3 = 0 To size3 - 1
				Dim concreteViewWrapper3 As View = vGetAllViewsRecursive3.Get(i3)
				If concreteViewWrapper3.Tag = "cassa" Then
					vLst5.Add(concreteViewWrapper3.Text)
				End If
				If concreteViewWrapper3.Tag = "hs" Then
					vLst6.Add(concreteViewWrapper3.Text)
				End If
			Next
			mod1.Sub081
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Chiudi_Click
	vBln1 = True
	Activity.Finish
	mod1.Sub198(vStr3)
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

Sub Sub001(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/stampecustom.java, metodo _mail_click (riga 673).
Sub Mail_Click
	Dim z As Boolean
	Dim cursorWrapper As Cursor
	Dim i As Int
	Dim size As Int
	Dim i2 As Int
	Dim rowCount As Int
	Dim i3 As Int
	Dim size2 As Int
	Dim i4 As Int
	Dim i5 As Int
	Dim i6 As Int
	mod1.vStr2 = "Sub Mail_Click"
	Try
		If Main.v_mserver = "" Then
			Return
		End If
		If Main.v_mporta = "" Then
			Return
		End If
		If Main.v_muser = "" Then
			Return
		End If
		If Main.v_mpwd <> "" Then
			If Main.v_md1 = "" Then
				If Main.v_md2 = "" Then
					Return
				End If
			End If
			Dim vObjectToCharSequence As Object = "Confermi l'invio della mail ? "
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
			If vMsgbox2 = -1 Then
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
						vSMTP1.Subject = Main.v_mdesmittente & " " & vStr2
						Dim vTmp As String = mod1.Sub061(mod1.Sub058)
						Dim writableWorkbookWrapper As WritableWorkbook
						writableWorkbookWrapper.Initialize(mod1.vStr4, vStr2 & ".xls")
						Dim vAddSheet As WritableSheet = writableWorkbookWrapper.AddSheet(vStr2, 0)
						Dim writableCellFormatWrapper As WritableCellFormat
						writableCellFormatWrapper.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 13, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
						Dim writableCellFormatWrapper2 As WritableCellFormat
						writableCellFormatWrapper2.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
						writableCellFormatWrapper2.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
						Dim writableCellFormatWrapper3 As WritableCellFormat
						writableCellFormatWrapper3.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
						Dim writableCellFormatWrapper4 As WritableCellFormat
						writableCellFormatWrapper4.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
						Dim writableCellWrapper As WritableCell
						writableCellWrapper.InitializeText(0, 0, vStr2)
						writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
						vAddSheet.AddCell(writableCellWrapper)
						writableCellWrapper.InitializeText(2, 0, vTmp)
						writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
						vAddSheet.AddCell(writableCellWrapper)
						vAddSheet.SetRowHeight(0, 18)
						Dim stringBuilderWrapper As StringBuilder
						stringBuilderWrapper.Initialize
						stringBuilderWrapper.Append(vStr2).Append(CRLF)
						stringBuilderWrapper.Append("").Append(CRLF)
						stringBuilderWrapper.Append("Data e ora di stampa: " & vTmp).Append(CRLF)
						stringBuilderWrapper.Append("Inviato da : ").Append(CRLF)
						Dim cursorWrapper2 As Cursor
						cursorWrapper = Main.vSql1.ExecQuery("Select * from intesta order by codice")
						If cursorWrapper.RowCount > 0 Then
							Dim i7 As Int
							For i7 = 0 To 5
								cursorWrapper.Position = i7
								stringBuilderWrapper.Append(cursorWrapper.GetString("descrizione")).Append(CRLF)
							Next
						End If
						stringBuilderWrapper.Append(" ").Append(CRLF)
						If vStr5 <> "" Then
							i = 0
						Else
							stringBuilderWrapper.Append("Filtro: ").Append(CRLF)
							writableCellWrapper.InitializeText(0, 2, "Filtro: ")
							writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
							vAddSheet.AddCell(writableCellWrapper)
							stringBuilderWrapper.Append(vStr5).Append(CRLF)
							writableCellWrapper.InitializeText(1, 2, vStr5)
							writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
							vAddSheet.AddCell(writableCellWrapper)
							stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
							i = 5
						End If
						size = vLst6.Size - 1
						Dim str3 As String = ""
						i2 = 0
						Do While i2 <= size
							Dim vObjectToString As String = vLst6.Get(i2)
							writableCellWrapper.InitializeText(i2, i, vObjectToString.Trim)
							writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
							vAddSheet.AddCell(writableCellWrapper)
							vAddSheet.SetColumnWidth(i2, vObjectToString.Length)
							i2 = i2 + 1
							str3 = str3 & vObjectToString
						Loop
						stringBuilderWrapper.Append(str3).Append(CRLF)
						stringBuilderWrapper.Append("------------------------------------------------------------------------").Append(CRLF)
						Dim i8 As Int = i + 1
						Dim cursorWrapper3 As Cursor
						Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery(WebView1.Tag)
						rowCount = cursorWrapper4.RowCount - 1
						For i3 = 0 To rowCount
							cursorWrapper4.Position = i3
							Dim size3 As Int = vLst5.Size - 1
							Dim str4 As String = ""
							Dim i9 As Int
							For i9 = 0 To size3
								Dim vSplit() As String = Regex.Split(";", vLst5.Get(i9))
								Dim recsizeVar As recsize
								recsizeVar.size = vSplit(0)
								recsizeVar.descrizione = vSplit(1)
								recsizeVar.Tipo = vSplit(2)
								If recsizeVar.Tipo = "S" Then
									Dim sb2 As String = str4 & modfunstr.left(cursorWrapper4.GetString(recsizeVar.descrizione).Trim & modfunstr.Sub004(recsizeVar.size), recsizeVar.size)
									writableCellWrapper.InitializeText(i9, i8, cursorWrapper4.GetString(recsizeVar.descrizione).Trim)
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
									vAddSheet.AddCell(writableCellWrapper)
									str4 = sb2
								Else If recsizeVar.Tipo = "N" Then
									Dim sb4 As String = str4 & modfunstr.Sub003(modfunstr.Sub004(recsizeVar.size) & NumberFormat2(cursorWrapper4.GetDouble(recsizeVar.descrizione), 1, 2, 2, False), recsizeVar.size)
									writableCellWrapper.InitializeNumber(i9, i8, cursorWrapper4.GetString(recsizeVar.descrizione).Trim)
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
									vAddSheet.AddCell(writableCellWrapper)
									str4 = sb4
								End If
							Next
							stringBuilderWrapper.Append(str4).Append(CRLF)
							i8 = i8 + 1
						Next
						stringBuilderWrapper.Append("-----------------------------------------------------------------------").Append(CRLF)
						stringBuilderWrapper.Append("-----------------------------------------------------------------------").Append(CRLF)
						Dim i10 As Int = 0
						Dim vGetAllViewsRecursive As IterableList = PDettaglio.GetAllViewsRecursive
						size2 = vGetAllViewsRecursive.Size
						i4 = 0
						Dim i11 As Int = i8
						Do While i4 < size2
							Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i4)
							If Not(concreteViewWrapper Is TextView) Or concreteViewWrapper.Tag = "" Then
								i5 = i10
								i6 = i11
							Else
								Dim labelWrapper As Label = concreteViewWrapper
								vLst2.Get(i10)
								stringBuilderWrapper.Append(modfunstr.left(vLst2.Get(i10) & modfunstr.Sub004(23), 23) & modfunstr.Sub003(modfunstr.Sub004(9) & labelWrapper.Text, 9)).Append(CRLF)
								writableCellWrapper.InitializeText(0, i11, vLst2.Get(i10))
								writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
								vAddSheet.AddCell(writableCellWrapper)
								writableCellWrapper.InitializeNumber(1, i11, labelWrapper.Text)
								writableCellWrapper.SetCellFormat(writableCellFormatWrapper4)
								vAddSheet.AddCell(writableCellWrapper)
								i5 = i10 + 1
								i6 = i11 + 1
							End If
							i4 = i4 + 1
							i11 = i6
							i10 = i5
						Loop
						vSMTP1.Body = stringBuilderWrapper
						writableWorkbookWrapper.Write
						writableWorkbookWrapper.Close
						vSMTP1.AddAttachment(mod1.vStr4, vStr2 & ".xls")
						vSMTP1.Send
						ProgressDialogShow2("Invio in corso ...", False)
						Return
					End If
				End If
				z = True
				sMTPWrapper2.UseSSL = z
				If Main.v_md1 <> "" Then
				End If
				If Main.v_md2 <> "" Then
				End If
				vSMTP1.Subject = Main.v_mdesmittente & " " & vStr2
				Dim vTmp_ As String = mod1.Sub061(mod1.Sub058)
				Dim writableWorkbookWrapper2 As WritableWorkbook
				writableWorkbookWrapper2.Initialize(mod1.vStr4, vStr2 & ".xls")
				Dim vAddSheet2 As WritableSheet = writableWorkbookWrapper2.AddSheet(vStr2, 0)
				Dim writableCellFormatWrapper5 As WritableCellFormat
				writableCellFormatWrapper5.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 13, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
				Dim writableCellFormatWrapper22 As WritableCellFormat
				writableCellFormatWrapper22.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
				writableCellFormatWrapper22.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
				Dim writableCellFormatWrapper32 As WritableCellFormat
				writableCellFormatWrapper32.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
				Dim writableCellFormatWrapper42 As WritableCellFormat
				writableCellFormatWrapper42.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
				Dim writableCellWrapper2 As WritableCell
				writableCellWrapper2.InitializeText(0, 0, vStr2)
				writableCellWrapper2.SetCellFormat(writableCellFormatWrapper5)
				vAddSheet2.AddCell(writableCellWrapper2)
				writableCellWrapper2.InitializeText(2, 0, vTmp_)
				writableCellWrapper2.SetCellFormat(writableCellFormatWrapper5)
				vAddSheet2.AddCell(writableCellWrapper2)
				vAddSheet2.SetRowHeight(0, 18)
				Dim stringBuilderWrapper2 As StringBuilder
				stringBuilderWrapper2.Initialize
				stringBuilderWrapper2.Append(vStr2).Append(CRLF)
				stringBuilderWrapper2.Append("").Append(CRLF)
				stringBuilderWrapper2.Append("Data e ora di stampa: " & vTmp_).Append(CRLF)
				stringBuilderWrapper2.Append("Inviato da : ").Append(CRLF)
				Dim cursorWrapper22 As Cursor
				cursorWrapper = Main.vSql1.ExecQuery("Select * from intesta order by codice")
				If cursorWrapper.RowCount > 0 Then
				End If
				stringBuilderWrapper2.Append(" ").Append(CRLF)
				If vStr5 <> "" Then
				End If
				size = vLst6.Size - 1
				Dim str32 As String = ""
				i2 = 0
				Do While i2 <= size
				Loop
				stringBuilderWrapper2.Append(str32).Append(CRLF)
				stringBuilderWrapper2.Append("------------------------------------------------------------------------").Append(CRLF)
				Dim i82 As Int = i + 1
				Dim cursorWrapper32 As Cursor
				Dim cursorWrapper42 As Cursor = Main.vSql1.ExecQuery(WebView1.Tag)
				rowCount = cursorWrapper42.RowCount - 1
				Do While i3 <= rowCount
				Loop
				stringBuilderWrapper2.Append("-----------------------------------------------------------------------").Append(CRLF)
				stringBuilderWrapper2.Append("-----------------------------------------------------------------------").Append(CRLF)
				Dim i102 As Int = 0
				Dim vGetAllViewsRecursive2 As IterableList = PDettaglio.GetAllViewsRecursive
				size2 = vGetAllViewsRecursive2.Size
				i4 = 0
				Dim i112 As Int = i82
				Do While i4 < size2
				Loop
				vSMTP1.Body = stringBuilderWrapper2
				writableWorkbookWrapper2.Write
				writableWorkbookWrapper2.Close
				vSMTP1.AddAttachment(mod1.vStr4, vStr2 & ".xls")
				vSMTP1.Send
				ProgressDialogShow2("Invio in corso ...", False)
				Return
			End If
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub Sub002
	Dim i As Int
	Dim vObjectToString As String = WebView1.Tag
	If Main.vCur3.GetString("funzioni").SubString2(32, 33) <> "1" Then
		vObjectToString = vObjectToString.Replace("list5", "list1")
	End If
	vLst2.Clear
	If vStr2 = "Stampa Giacenze " Then
		dbutil.vDbl1 = 0
		WebView1.LoadHtml(dbutil.Sub003(vSql1, vObjectToString, Null, 0, True, vInt1, -1, -1))
	Else
		WebView1.LoadHtml(dbutil.Sub001(vSql1, vObjectToString, Null, 0, True, vInt1, -1, -1, True))
	End If
	PDettaglio.Background = mod1.Sub157(Colors.RGB(245, 245, 245), 0, 2)
	lblTitolo.Text = vStr2
	lblTitolo.TextColor = -1
	Dim vGetAllViewsRecursive As IterableList = PDettaglio.GetAllViewsRecursive
	Dim size As Int = vGetAllViewsRecursive.Size
	Dim i2 As Int
	For i2 = 0 To size - 1
		Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i2)
		If concreteViewWrapper.Tag <> "" And concreteViewWrapper Is TextView Then
			Dim labelWrapper2 As Label = concreteViewWrapper
			Dim vObjectToString2 As String = concreteViewWrapper.Tag
			If labelWrapper2.Text.IndexOf("_") >= 0 Then
				i = labelWrapper2.Text.SubString(labelWrapper2.Text.IndexOf("_") + 1)
				vLst2.Add(labelWrapper2.Text.SubString2(0, labelWrapper2.Text.IndexOf("_")))
			Else
				vLst2.Add(labelWrapper2.Text)
				i = 0
			End If
			If vStr4 <> "" Then
				vObjectToString2 = vObjectToString2.Replace("?", vStr4)
			End If
			If Main.vCur3.GetString("funzioni").SubString2(32, 33) <> "1" Then
				vObjectToString2 = vObjectToString2.Replace("list5", "list1")
			End If
			If vObjectToString2 = "costomedio" Then
				labelWrapper2.Text = NumberFormat2(dbutil.vDbl1, 1, 2, 2, False)
			Else If i > 0 Then
				labelWrapper2.Text = NumberFormat2(vSql1.ExecQuerySingleResult(vObjectToString2), 1, i, i, False)
			Else
				labelWrapper2.Text = vSql1.ExecQuerySingleResult(vObjectToString2)
			End If
		End If
	Next
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

Sub Stampa_Click
	Dim i As Int
	Dim str As String
	mod1.vStr2 = "Sub stampa_Click"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vLst1.Size = 0 Then
		Return
	End If
	Main.vccefdll1.nf_apri(Main.v_intestanf)
	Main.vccefdll1.nf_testo(vStr2, 4)
	Main.vccefdll1.nf_testo(Main.vStr19, 1)
	If vStr5 <> "" Then
		Main.vccefdll1.nf_testo("Filtro: ", 1)
		Main.vccefdll1.nf_testo(vStr5, 1)
		Main.vccefdll1.nf_testo(Main.vStr19, 1)
	End If
	Dim str2 As String = ""
	Dim size As Int = vLst3.Size - 1
	Dim i2 As Int
	For i2 = 0 To size
		str2 = str2 & vLst3.Get(i2)
	Next
	Main.vccefdll1.nf_testo(str2, 1)
	Main.vccefdll1.nf_testo(Main.vStr19, 1)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery(QueryStampa.Text)
	Dim rowCount As Int = cursorWrapper2.RowCount - 1
	Dim i3 As Int
	For i3 = 0 To rowCount
		cursorWrapper2.Position = i3
		Dim str3 As String = ""
		Dim str4 As String = ""
		Dim size2 As Int = vLst1.Size - 1
		Dim i4 As Int
		For i4 = 0 To size2
			Dim vSplit() As String = Regex.Split(";", vLst1.Get(i4))
			Dim recsizeVar As recsize
			recsizeVar.size = vSplit(0)
			recsizeVar.descrizione = vSplit(1)
			recsizeVar.Tipo = vSplit(2)
			If recsizeVar.Tipo = "S" Then
				str = IIf(recsizeVar.descrizione = "Distinta", cursorWrapper2.GetString("memo"), str4)
				str3 = str3 & modfunstr.left(cursorWrapper2.GetString(recsizeVar.descrizione).Trim & modfunstr.Sub004(recsizeVar.size), recsizeVar.size)
			Else If recsizeVar.Tipo = "N" Then
				If cursorWrapper2.GetDouble(recsizeVar.descrizione) * 1000 Mod 1000 = 0 Then
					str3 = str3 & modfunstr.Sub003(modfunstr.Sub004(recsizeVar.size) & NumberFormat2(cursorWrapper2.GetDouble(recsizeVar.descrizione), 1, 0, 0, False), recsizeVar.size)
					str = str4
				Else
					str3 = str3 & modfunstr.Sub003(modfunstr.Sub004(recsizeVar.size) & NumberFormat2(cursorWrapper2.GetDouble(recsizeVar.descrizione), 1, 2, 2, False), recsizeVar.size)
					str = str4
				End If
			Else If recsizeVar.Tipo = "N0" Then
				str3 = str3 & modfunstr.Sub003(modfunstr.Sub004(recsizeVar.size) & NumberFormat2(cursorWrapper2.GetDouble(recsizeVar.descrizione), 1, 0, 0, False), recsizeVar.size)
				str = str4
			Else
				str = str4
			End If
			str4 = str
		Next
		Main.vccefdll1.nf_testo(str3, 1)
		If str4 <> "" Then
			Main.vccefdll1.nf_testo(str4, 3)
			Main.vccefdll1.nf_testo(Main.vStr19, 1)
		End If
	Next
	Main.vccefdll1.nf_testo(Main.vStr19, 1)
	Main.vccefdll1.nf_testo(" ", 10)
	Dim i5 As Int = 0
	Dim vGetAllViewsRecursive As IterableList = PDettaglio.GetAllViewsRecursive
	Dim size3 As Int = vGetAllViewsRecursive.Size
	Dim i6 As Int = 0
	Do While i6 < size3
		Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i6)
		If Not(concreteViewWrapper Is TextView) Or concreteViewWrapper.Tag = "" Then
			i = i5
		Else
			Dim labelWrapper As Label = concreteViewWrapper
			vLst2.Get(i5)
			Dim sb6 As String = modfunstr.left(vLst2.Get(i5) & modfunstr.Sub004(23), 23) & modfunstr.Sub003(modfunstr.Sub004(9) & labelWrapper.Text, 9)
			Main.vccefdll1.nf_testo(sb6, 1)
			i = i5 + 1
		End If
		i6 = i6 + 1
		i5 = i
	Loop
	Main.vccefdll1.nf_chiudi
End Sub

Sub visibilitychanged_event(str As String, objArr As Object()) As Object
	mod1.Sub081
	Return Null
End Sub

Sub WebView1_OverrideUrl(str As String) As Boolean
	Try
		Dim vSplit() As String = Regex.Split("[.]", str.SubString(7))
		Dim parseDouble As Int = vSplit(0)
		If vSplit(1) = -1 Then
			Dim sb As String = WebView1.Tag & " order by " & vStringArr1(parseDouble)
			If Main.vCur3.GetString("funzioni").SubString2(32, 33) <> "1" Then
				sb = sb.Replace("list5", "list1")
			End If
			WebView1.LoadHtml(dbutil.Sub001(vSql1, sb, Null, 0, True, vInt1, -1, parseDouble, True))
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return True
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

