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
	Public vStr1 As String
	Public vStr2 As String
	Public vInt1 As Int
	Public vLst1 As List
	Public vLst2 As List
	Public vLst3 As List
	Public vLst4 As List
	Public vLst5 As List
	Public vLst6 As List
	Public vLst7 As List
	Public vLst8 As List
	Public vLst9 As List
	Public vLst10 As List
	Public vLst11 As List
	Public vLst12 As List
	Public vLst13 As List
	Public vLst14 As List
	Public vLst15 As List
	Public vLst16 As List
	Public vLst17 As List
	Public vLst18 As List
	Public vLst19 As List
	Public vLst20 As List
	Public v6 As Timer
	Public vSql1 As SQL
	Public vSql2 As SQL
	Public vSql3 As SQL
	Public vBln1 As Boolean
	Public vStr3 As String
	Public vInt2 As Int = -1
	Public vInt3 As Int = -1
	Public vInt4 As Int = DipToCurrent(54)
	Public vInt5 As Int = DipToCurrent(60)
	Public vInt6 As Int = DipToCurrent(1)
	Public vIntArr1 As Int() = Array As Int(PerXToCurrent(7), PerXToCurrent(10), PerXToCurrent(28), PerXToCurrent(15), PerXToCurrent(15), PerXToCurrent(15), PerXToCurrent(10))
	Public vIntArr2 As Int() = Array As Int(PerXToCurrent(7), PerXToCurrent(10), PerXToCurrent(37), PerXToCurrent(18), PerXToCurrent(18), PerXToCurrent(10))
	Public vInt7 As Int = PerXToCurrent(100)
	Public vInt8 As Int
	Public vStr4 As String
	Public vStr5 As String
	Public vInt9 As Int = -1
	Public vByt1 As Byte = -1
	Public vBln2 As Boolean
	Public vStr6 As String = " order by descrizione"
	Public vBln3 As Boolean
	Public vStr7 As String = "Giorno"
	Public vStr8 As String
	Public vBln4 As Boolean
	Public vBln5 As Boolean
	Public vBln6 As Boolean
	Public s_reparti As Int
	Public s_iva As Int = 1
	Public s_pagamenti As Int = 2
	Public s_articoli As Int = 3
	Public s_clienti As Int = 4
	Public s_operatori As Int = 5
	Public s_repartiguadagno As Int = 6
	Public s_finanziario As Int = 7
	Public s_fasce As Int = 8
	Public s_movimenti As Int = 9
	Public vBln7 As Boolean
End Sub

Sub Globals
	Public vCur1 As Cursor
	Public vcustomlistviewold1 As customlistviewold
	Public vUltimateListView1 As UltimateListView
	Public vPnl1 As Panel
	Public vPnl2 As Panel
	Public vColorDrawable1 As ColorDrawable
	Public vLabelArr1(7) As Label
	Public vLabelArr2(7) As Label
	Public LblInfo As Label
	Public vCur2 As Cursor
	Public vCur3 As Cursor
	Public vPieChart1 As PieChart
	Public vPDFWriter1 As PDFWriter
	Public PDettaglio As Panel
	Public pElenco As Panel
	Public PGrafico As Panel
	Public vCur4 As Cursor
	Public vCur5 As Cursor
	Public vCur6 As Cursor
	Public vCur7 As Cursor
	Public vLbl1 As Label
	Public vCustomDialog21 As CustomDialog2
	Public PnlRep As Panel
	Public vLv1 As ListView
	Public vLbl2 As Label
	Public Ricerca As Button
	Public Totale As Label
	Public Fatture As Label
	Public vLst21 As List
	Public vLst22 As List
	Public Mail As Button
	Public fData As Label
	Public vLbl3 As Label
	Public vSMTP1 As SMTP
	Public pnlW As Panel
	Public FiltroAttivo As Label
	Public EdtRicerca As EditText
	Public lblTitolo As Label
	Public lblstampaTitolo As Label
End Sub

Sub Activity_Create(z As Boolean)
	mod1.vStr2 = "Sub Activity_Create(FirstTime As Boolean)"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
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
			Sub011("Stampe")
			Dim vGetAllViewsRecursive As IterableList = pElenco.GetAllViewsRecursive
			Dim size As Int = vGetAllViewsRecursive.Size
			Dim i As Int
			For i = 0 To size - 1
				Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i)
				If concreteViewWrapper Is Button And Not(concreteViewWrapper Is CheckBox) Then
					Dim buttonWrapper As Button = concreteViewWrapper
					mod1.Sub165(buttonWrapper)
				End If
			Next
			Dim vGetAllViewsRecursive2 As IterableList = PGrafico.GetAllViewsRecursive
			Dim size2 As Int = vGetAllViewsRecursive2.Size
			Dim i2 As Int
			For i2 = 0 To size2 - 1
				Dim concreteViewWrapper2 As View = vGetAllViewsRecursive2.Get(i2)
				If concreteViewWrapper2 Is Button And Not(concreteViewWrapper2 Is CheckBox) Then
					Dim buttonWrapper2 As Button = concreteViewWrapper2
					mod1.Sub165(buttonWrapper2)
				End If
			Next
			lblTitolo.Color = Main.v_colormenutitle
			mod1.Sub173(lblTitolo)
			lblstampaTitolo.Color = Main.v_colormenutitle
			mod1.Sub173(lblstampaTitolo)
			vcustomlistviewold1.Initialize(pElenco, "cElenco")
			vcustomlistviewold1.vInt3 = -16776961
			pElenco.AddView(vcustomlistviewold1.Sub003, 0, PerYToCurrent(14), PerXToCurrent(100), PerYToCurrent(86) - DipToCurrent(70))
			vPnl1.Initialize("")
			vPnl1.Color = -16777216
			vPnl2.Initialize("")
			vPnl2.Color = -16777216
			Dim i3 As Int = 0
			Dim i4 As Int = 0
			Dim i5 As Int = 0
			Do While i3 <= 6
				vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
				vLabelArr1(i3).Initialize("Header")
				vLabelArr1(i3).Background = vColorDrawable1
				Dim labelWrapper3 As Label = vLabelArr1(i3)
				labelWrapper3.TextColor = -1
				vLabelArr1(i3).TextSize = 16
				Dim labelWrapper4 As Label = vLabelArr1(i3)
				labelWrapper4.Typeface = Typeface.DEFAULT_BOLD
				Dim labelWrapper5 As Label = vLabelArr1(i3)
				labelWrapper5.Gravity = 19
				vLabelArr2(i3).Initialize("Header")
				vLabelArr2(i3).Background = vColorDrawable1
				Dim labelWrapper6 As Label = vLabelArr2(i3)
				labelWrapper6.TextColor = -1
				vLabelArr2(i3).TextSize = 16
				Dim labelWrapper7 As Label = vLabelArr2(i3)
				labelWrapper7.Typeface = Typeface.DEFAULT_BOLD
				Dim labelWrapper8 As Label = vLabelArr2(i3)
				labelWrapper8.Gravity = 19
				Select i3
					Case 0
						vLabelArr1(i3).Text = "#"
						vLabelArr2(i3).Text = "#"
					Case 1
						vLabelArr1(i3).Text = "Codice"
						vLabelArr2(i3).Text = "Codice"
					Case 2
						vLabelArr1(i3).Text = "Descrizione"
						vLabelArr2(i3).Text = "Descrizione"
					Case 3
						vLabelArr1(i3).Text = "Qta"
						vLabelArr2(i3).Text = "Qta"
						Dim labelWrapper9 As Label = vLabelArr1(i3)
						labelWrapper9.Gravity = 21
						Dim labelWrapper10 As Label = vLabelArr2(i3)
						labelWrapper10.Gravity = 21
					Case 4
						vLabelArr1(i3).Text = "Importo"
						vLabelArr2(i3).Text = "Importo"
						Dim labelWrapper11 As Label = vLabelArr1(i3)
						labelWrapper11.Gravity = 21
						Dim labelWrapper12 As Label = vLabelArr2(i3)
						labelWrapper12.Gravity = 21
					Case 5
						vLabelArr1(i3).Text = "Sconto"
						vLabelArr2(i3).Text = "      "
						Dim labelWrapper13 As Label = vLabelArr1(i3)
						labelWrapper13.Gravity = 21
						Dim labelWrapper14 As Label = vLabelArr2(i3)
						labelWrapper14.Gravity = 21
						vLbl2 = vLabelArr1(i3)
					Case 6
						vLabelArr1(i3).Text = "     "
				End Select
				If i3 < 6 Then
					vLabelArr2(i3).Tag = i3
					vPnl2.AddView(vLabelArr2(i3), i4 + vInt6 / 2, 0, vIntArr2(i3) - vInt6, vInt4)
					vLabelArr2(i3).RunMethod("setPadding", Array(DipToCurrent(10), 0, DipToCurrent(10), 0))
					i4 = i4 + vIntArr2(i3)
				End If
				vLabelArr1(i3).Tag = i3
				vPnl1.AddView(vLabelArr1(i3), i5 + vInt6 / 2, 0, vIntArr1(i3) - vInt6, vInt4)
				vLabelArr1(i3).RunMethod("setPadding", Array(DipToCurrent(10), 0, DipToCurrent(10), 0))
				Dim i6 As Int = i5 + vIntArr1(i3)
				i3 = i3 + 1
				i5 = i6
			Loop
			vPnl2.Visible = False
			PDettaglio.AddView(vPnl1, 0, PerYToCurrent(10), vInt7, vInt4)
			PDettaglio.AddView(vPnl2, 0, PerYToCurrent(10), vInt7, vInt4)
			vUltimateListView1.Initialize(0, 0, "", "ULV")
			vUltimateListView1.FastScroller(True)
			vUltimateListView1.DividerHeight = 0
			Dim ultimateListViewWrapper2 As UltimateListView = vUltimateListView1
			vUltimateListView1.SetStyle(1)
			Dim length As Byte = vIntArr1.Length
			vUltimateListView1.AddRowLayout("ROW", "Cell_RowLayoutCreator", "Cell_RowContentFiller", vInt5, length, vIntArr1, vInt6, -7829368, True)
			Dim length2 As Byte = vIntArr2.Length
			vUltimateListView1.AddRowLayout("ROWNS", "CellNS_RowLayoutCreator", "CellNS_RowContentFiller", vInt5, length2, vIntArr2, vInt6, -7829368, True)
			LblInfo.Initialize("")
			LblInfo.Background = vColorDrawable1
			LblInfo.Gravity = 17
			LblInfo.TextColor = -1
			LblInfo.TextSize = 24
			LblInfo.Typeface = Typeface.DEFAULT_BOLD
			Activity.AddView(LblInfo, PerXToCurrent(50) - DipToCurrent(35), PerYToCurrent(50) - DipToCurrent(30), DipToCurrent(70), DipToCurrent(60))
			LblInfo.Visible = False
			Dim reflection As Reflector
			reflection.Target = reflection.RunStaticMethod("android.view.ViewConfiguration", "get", Array(reflection.GetContext), Array As String("android.content.Context"))
			v6.Initialize("DisapTimer", reflection.RunMethod("getScrollDefaultDelay"))
			mod1.Sub067(EdtRicerca, 17301583)
			EdtRicerca.TextColor = -16777216
			PDettaglio.AddView(vUltimateListView1, 0, vInt4 + PerYToCurrent(10), vInt7, PDettaglio.Height - vInt4 - PerYToCurrent(5))
			PnlRep.Initialize("pnl")
			PnlRep.Background = mod1.Sub155(Colors.RGB(134, 232, 122), 25)
			vLv1.Initialize("lv")
			Dim cursorWrapper As Cursor
			vCur5 = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM reparti order by codice")
			If vCur6.IsInitialized Then
				vCur6.Close
			End If
			Dim cursorWrapper2 As Cursor
			vCur6 = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM pagamenti order by codice")
			Dim rowCount As Int = vCur5.RowCount - 1
			Dim i11 As Int
			For i11 = 0 To rowCount
				vCur5.Position = i11
				vLv1.AddTwoLinesAndBitmap(vCur5.GetString("descrizione"), "(Codice " & vCur5.GetString("codice") & ")", Null)
			Next
			PnlRep.AddView(vLv1, DipToCurrent(30), DipToCurrent(12), PerXToCurrent(57), PerYToCurrent(50))
			vCustomDialog21.AddView(PnlRep, PerXToCurrent(77), PerYToCurrent(60))
			vLst21.Initialize
			vLst22.Initialize
			vLst1.Initialize
			vLst8.Initialize
			vLst9.Initialize
			vLst7.Initialize
			vLst2.Initialize
			vLst3.Initialize
			vLst4.Initialize
			vLst5.Initialize
			vLst10.Initialize
			vLst6.Initialize
			vLst11.Initialize
			vLst18.Initialize
			vLst19.Initialize
			vLst17.Initialize
			vLst12.Initialize
			vLst13.Initialize
			vLst14.Initialize
			vLst15.Initialize
			vLst20.Initialize
			vLst16.Initialize
			vLst11.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst18.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst19.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst17.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst12.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst13.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst14.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst15.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst20.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst16.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst1.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst8.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst9.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst7.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst2.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst3.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst4.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst5.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst10.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
			vLst6.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
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

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/stampe.java, metodo _activity_resume (riga 834).
Sub Activity_Resume
	mod1.vStr2 = "Sub Activity_Create(FirstTime As Boolean)"
	Try
	Catch
		mod1.Sub217(LastException.Message)
		pnlW.Visible = False
	End Try
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			vBln1 = False
			If Main.vBln25 Then
				If Main.vBln38 Then
					Dim cursorWrapper As Cursor
					vCur1 = Main.vSql1.ExecQuery("Select * from Stampe where tipob=0 and flgattiva = 1 and codice <>2  order by codice")
					Dim phone As Phone = Main.vPhone1
					Phone.SetScreenBrightness(Main.v_screenbrightness)
					lblstampaTitolo.Text = "Gestione Stampe"
					vBln7 = False
					pnlW.Visible = True
					mod1.Sub161(pnlW, 9)
					DoEvents
					If Main.vStr15 <> "Venduto" Then
						vSql2 = Main.vSql1
						vStr7 = "Giorno"
						vSql3 = Main.vSql1
					Else
						If Main.vStr15 = "VendutoP2" Then
							Dim str As String = Main.v_percorsoazzera
							If Main.v_iprpi <> "" Then
								str = mod1.vStr4 & "/TMP"
							End If
							If Not(File.Exists(str, "Venduto.db")) Then
								Dim vObjectToCharSequence As Object = "Archivio non trovato nel percorso: " & Main.v_percorsoazzera & CRLF & "Verrà utilizzato il DB standard"
								Dim vObjectToCharSequence2 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
								vSql2 = Main.vSql2
								vSql3 = Main.vSql2
							Else
								Try
									vSql1.Initialize(str, "Venduto.db", False)
									vSql2 = vSql1
									vSql3 = vSql1
									vBln7 = True
								Catch
									Dim vObjectToCharSequence3 As Object = "Errore apertura archivio in: " & Main.v_percorsoazzera & CRLF & "Verrà utilizzato il DB standard"
									Dim vObjectToCharSequence4 As Object = Main.vStr8
									Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
									vSql2 = Main.vSql2
									vSql3 = Main.vSql2
								End Try
							End If
						Else
							vSql2 = Main.vSql2
							vSql3 = Main.vSql2
						End If
						vStr7 = "Periodo"
						Dim cursorWrapper2 As Cursor
						Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione,guadagnop,guadagnov from reparti order by codice")
						Dim rowCount As Int = cursorWrapper3.RowCount - 1
						Dim i As Int
						For i = 0 To rowCount
							cursorWrapper3.Position = i
							vSql2.ExecNonQuery("update reparti set guadagnop = " & cursorWrapper3.GetString2(2) & ",guadagnov =" & cursorWrapper3.GetString2(3) & ", descrizione ='" & cursorWrapper3.GetString2(1) & "' where codice = " & cursorWrapper3.GetString2(0))
						Next
						Dim cursorWrapper4 As Cursor
						Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione from iva order by codice")
						Dim rowCount2 As Int = cursorWrapper5.RowCount - 1
						Dim i2 As Int
						For i2 = 0 To rowCount2
							cursorWrapper5.Position = i2
							vSql2.ExecNonQuery("update iva set descrizione ='" & cursorWrapper5.GetString2(1) & "' where codice = " & cursorWrapper5.GetString2(0))
						Next
					End If
					If Not(vBln6) Then
						Sub007()
					End If
					If vStr1 = "" Then
						vLbl3.Tag = vStr1
						vLbl3.Text = vStr2
					Else If vBln6 Then
						vLbl3.Tag = ""
						vLbl3.Text = ""
					End If
					vStr1 = ""
					vBln6 = False
					Sub013()
					pnlW.Visible = False
					mod1.Sub081
					Return
				End If
			End If
			Dim cursorWrapper6 As Cursor
			vCur1 = Main.vSql1.ExecQuery("Select * from Stampe where tipob=0 and flgattiva = 1 order by codice")
			Dim phone2 As Phone = Main.vPhone1
			Phone.SetScreenBrightness(Main.v_screenbrightness)
			lblstampaTitolo.Text = "Gestione Stampe"
			vBln7 = False
			pnlW.Visible = True
			mod1.Sub161(pnlW, 9)
			DoEvents
			If Main.vStr15 <> "Venduto" Then
			End If
			If Not(vBln6) Then
			End If
			If vStr1 = "" Then
			End If
			vStr1 = ""
			vBln6 = False
			Sub013()
			pnlW.Visible = False
			mod1.Sub081
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Sub001
	Dim size As Int = vLst21.Size - 1
	Dim str As String = ""
	Dim i As Int
	For i = 0 To size
		Dim vObjectToString As String = vLst21.Get(i)
		If Not(vObjectToString.Contains("Ordinamento")) Then
			vObjectToString.Replace("null", "NESSUNO")
			If str <> "" Then
				str = str & "   e   " & vObjectToString
			Else
				str = "Filtro Attivo: " & vObjectToString
			End If
		End If
	Next
	If str = "" Then
		str = "Filtro Attivo: NESSUNO"
	End If
	FiltroAttivo.Text = str
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/stampe.java, metodo m7… (riga 1029).
Sub Sub002(i As Int)
	Dim i2 As Int
	For i2 = 0 To 10
		If i <> 100 Then
			Try
			Catch
				mod1.Sub217(LastException.Message)
				Return
			End Try
		End If
		vLst1.Set(i2, "")
		vLst11.Set(i2, "")
		If i = 100 Or i = s_articoli Then
			vLst2.Set(i2, "")
			vLst12.Set(i2, "")
		End If
		If i = 100 Or i = s_iva Then
			vLst3.Set(i2, "")
			vLst13.Set(i2, "")
		End If
		If i = 100 Or i = s_pagamenti Then
			vLst4.Set(i2, "")
			vLst14.Set(i2, "")
		End If
		If i = 100 Or i = s_clienti Then
			vLst5.Set(i2, "")
			vLst15.Set(i2, "")
		End If
		If i = 100 Or i = s_movimenti Then
			vLst10.Set(i2, "")
			vLst20.Set(i2, "")
		End If
		If i = 100 Or i = s_operatori Then
			vLst6.Set(i2, "")
			vLst16.Set(i2, "")
		End If
		If i = 100 Or i = s_repartiguadagno Then
			vLst7.Set(i2, "")
			vLst17.Set(i2, "")
		End If
		If i = 100 Or i = s_finanziario Then
			vLst8.Set(i2, "")
			vLst18.Set(i2, "")
		End If
		If i = 100 Or i = s_fasce Then
			vLst9.Set(i2, "")
			vLst19.Set(i2, "")
		End If
	Next
End Sub

Sub Sub003
	mod1.vStr2 = "  Sub Back"
	Try
		vStr6 = " order by descrizione"
		vLst21.Clear
		Dim size As Int = vLst22.Size - 1
		Dim i As Int
		For i = 0 To size
			vLst21.Add(vLst22.Get(i))
		Next
		If Ricerca.Tag = "Ritorna ai reparti" Then
			Sub009("REPARTI", vStr4)
		Else If Ricerca.Tag = "Ritorna ai Movimenti" Then
			Sub009("MOVIMENTI", vStr4)
		Else If Ricerca.Tag = "Ritorna stampa Iva" Then
			Sub009("IVA", vStr4)
		Else If Ricerca.Tag = "Ritorna Operatori" Then
			Sub009("OPERATORI", vStr4)
		Else If Ricerca.Tag = "Ritorna Guadagno Reparti" Then
			Sub009("GUADAGNO REPARTI", vStr4)
		End If
		vStr5 = ""
		vInt8 = 1
		If vInt2 >= 0 And vInt2 < vUltimateListView1.NumberOfItems Then
			vUltimateListView1.JumpTo(vInt2, False)
		End If
		vInt2 = -1
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Buttonfun_Click
	Dim vObjectToNumber As Int
	Dim i As Int = 0
	mod1.vStr2 = "  Sub buttonFun_Click"
	Try
		vObjectToNumber = Sender.Tag
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vObjectToNumber < 0 Then
		Return
	End If
	If vInt8 = 1 Then
		vInt2 = vObjectToNumber
	End If
	If vStr8 <> "R" Or vInt8 <> 1 Then
		If vStr8 <> "R" Or vInt8 <> 2 Then
			If vStr8 = "MO" And vInt8 = 1 Then
				Ricerca.Tag = "Ritorna ai Movimenti"
				vInt8 = vInt8 + 1
				Dim vExecQuerySingleResult As String = vSql2.ExecQuerySingleResult("SELECT codice from sortedStampa  WHERE rowid=" & vObjectToNumber + 1)
				vLst21.Clear
				vLst21.Add("Movimento = " & vExecQuerySingleResult)
				Dim size As Int = vLst22.Size - 1
				Do While i <= size
					vLst21.Add(vLst22.Get(i))
					i = i + 1
				Loop
				Sub009("ARTICOLI", " where venduto.nmov = " & vExecQuerySingleResult)
			Else
				If vStr8 = "C" And vInt8 = 1 Then
					Ricerca.Tag = "Ritorna Clienti"
					vInt8 = 2
					Dim vExecQuerySingleResult2 As String = vSql2.ExecQuerySingleResult("SELECT codice from sortedStampa  WHERE rowid=" & vObjectToNumber + 1)
					vLst21.Clear
					vLst21.Add("Cliente = " & Main.vSql1.ExecQuerySingleResult("Select descrizione from clienti where codice='" & vExecQuerySingleResult2 & "'"))
					Dim size2 As Int = vLst22.Size - 1
					Do While i <= size2
						vLst21.Add(vLst22.Get(i))
						i = i + 1
					Loop
					vStr5 = vStr4.Replace("select count(*) from venduto where venduto.nmov= headmov.nmov", "select count(*) from venduto  as v2 where venduto.nmov= v2.nmov") & " and cliente = '" & vExecQuerySingleResult2 & "'"
					Sub009("REPARTI", vStr5)
				Else
					If vStr8 = "O" And vInt8 = 1 Then
						Ricerca.Tag = "Ritorna Operatori"
						vInt8 = 2
						Dim vExecQuerySingleResult3 As String = vSql2.ExecQuerySingleResult("SELECT codice from sortedStampa  WHERE rowid=" & vObjectToNumber + 1)
						vLst21.Clear
						vLst21.Add("Operatore = " & Main.vSql1.ExecQuerySingleResult("Select descrizione from operatori where codice='" & vExecQuerySingleResult3 & "'"))
						Dim size3 As Int = vLst22.Size - 1
						Do While i <= size3
							vLst21.Add(vLst22.Get(i))
							i = i + 1
						Loop
						vStr5 = vStr4.Replace("select count(*) from venduto where venduto.nmov= headmov.nmov", "select count(*) from venduto  as v2 where venduto.nmov= v2.nmov") & " and (select count(*) from headmov  as v2 where venduto.nmov= v2.nmov and v2.operatore = '" & vExecQuerySingleResult3 & "')>0 "
						Sub009("REPARTI", vStr5)
					Else
						If vStr8 = "RG" And vInt8 = 1 Then
							If vInt8 = 1 Then
								Ricerca.Tag = "Ritorna Guadagno Reparti"
							End If
							vInt8 = vInt8 + 1
							Dim vExecQuerySingleResult4 As String = vSql2.ExecQuerySingleResult("SELECT codice from sortedStampa  WHERE rowid=" & vObjectToNumber + 1)
							vLst21.Clear
							vLst21.Add("Reparto = " & Main.vSql1.ExecQuerySingleResult("Select descrizione from reparti where codice=" & vExecQuerySingleResult4))
							Dim size4 As Int = vLst22.Size - 1
							Dim i2 As Int
							For i2 = 0 To size4
								vLst21.Add(vLst22.Get(i2))
							Next
							Sub009("ARTICOLI", vStr4 & " and brep = 0 and reparto = " & vExecQuerySingleResult4)
						End If
					End If
				End If
			End If
			Return
		End If
	End If
	If vInt8 = 1 Then
		Ricerca.Tag = "Ritorna ai reparti"
	End If
	vInt8 = vInt8 + 1
	Dim vExecQuerySingleResult5 As String = vSql2.ExecQuerySingleResult("SELECT codice from sortedStampa  WHERE rowid=" & vObjectToNumber + 1)
	If Ricerca.Tag = "Ritorna Clienti" Or Ricerca.Tag = "Ritorna Operatori" Or Ricerca.Tag = "Ritorna stampa Iva" Then
		Dim size5 As Int = vLst21.Size - 1
		vLst21.Set(size5, "Reparto = " & Main.vSql1.ExecQuerySingleResult("Select descrizione from reparti where codice=" & vExecQuerySingleResult5))
		Sub009("ARTICOLI", vStr5.Replace("select count(*) from venduto where venduto.nmov= headmov.nmov", "select count(*) from venduto  as v2 where venduto.nmov= v2.nmov") & " and brep = 0 and reparto = " & vExecQuerySingleResult5)
	Else
		vLst21.Clear
		vLst21.Add("Reparto = " & Main.vSql1.ExecQuerySingleResult("Select descrizione from reparti where codice=" & vExecQuerySingleResult5))
		Dim size6 As Int = vLst22.Size - 1
		Do While i <= size6
			vLst21.Add(vLst22.Get(i))
			i = i + 1
		Loop
		Sub009("ARTICOLI", vStr4 & " and brep = 0 and reparto = " & vExecQuerySingleResult5)
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/stampe.java, metodo _cell_rowcontentfiller (riga 1272).
Sub cell_rowcontentfiller(j As Long, str As String, panelWrapper As Panel, b As Byte, i As Int)
	Dim z As Boolean = True
	Try
		If i = vInt3 Then
			panelWrapper.Color = -16711936
		Else If i Mod 2 = 0 Then
			panelWrapper.Color = -1
		Else
			panelWrapper.Color = -3355444
		End If
		If b < 6 Then
			Dim labelWrapper As Label = panelWrapper.GetView(0)
			Select b
				Case 0
					labelWrapper.Text = i + 1
				Case 1
					vCur2 = vSql2.ExecQuery("SELECT * from sortedStampa  WHERE rowid=" & 1 + j)
					vCur2.Position = 0
					labelWrapper.Text = vCur2.GetString("codice")
				Case 2
					labelWrapper.Text = vCur2.GetString("descrizione")
				Case 3
					If vCur2.GetDouble("qta") * 1000 Mod 1000 = 0 Then
						labelWrapper.Text = NumberFormat2(vCur2.GetDouble("qta"), 1, 0, 0, False)
					Else
						labelWrapper.Text = NumberFormat2(vCur2.GetDouble("qta"), 1, 3, 3, False)
					End If
					labelWrapper.Gravity = Bit.Or(16, 5)
				Case 4
					labelWrapper.Text = vCur2.GetDouble("importo")
					labelWrapper.Gravity = Bit.Or(16, 5)
					labelWrapper.Text = NumberFormat2(vCur2.GetDouble("importo"), 1, 2, 2, False)
				Case 5
					labelWrapper.Text = vCur2.GetDouble("sconto")
					labelWrapper.Gravity = Bit.Or(16, 5)
					labelWrapper.Text = NumberFormat2(vCur2.GetDouble("sconto"), 1, 2, 2, False)
			End Select
			labelWrapper.Tag = j
			Return
		End If
		Dim imageViewWrapper As ImageView = panelWrapper.GetView(0)
		imageViewWrapper.Tag = j
		If vInt8 < 3 And Ricerca.Tag <> "Ritorna ai reparti" And Ricerca.Tag <> "Ritorna Guadagno Reparti" Then
			If vStr8 <> "P" Then
				If vStr8 <> "FC" Then
				End If
			End If
		End If
		z = False
		imageViewWrapper.Visible = z
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub cell_rowlayoutcreator(str As String, panelWrapper As Panel, b As Byte)
	vBln3 = True
	If b = 6 Then
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("buttonFun")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "003.png")
		panelWrapper.AddView(imageViewWrapper, DipToCurrent(10), DipToCurrent(5), panelWrapper.Width - DipToCurrent(20), panelWrapper.Height - DipToCurrent(10))
		Return
	End If
	Dim labelWrapper As Label
	labelWrapper.Initialize("")
	labelWrapper.Gravity = Bit.Or(16, 3)
	labelWrapper.Color = 0
	labelWrapper.TextColor = -16777216
	If b = 0 Then
		labelWrapper.TextSize = 9
	Else
		labelWrapper.TextSize = 16
	End If
	labelWrapper.Typeface = Typeface.DEFAULT
	panelWrapper.AddView(labelWrapper, DipToCurrent(10), DipToCurrent(5), panelWrapper.Width - DipToCurrent(20), panelWrapper.Height - DipToCurrent(10))
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/stampe.java, metodo _cellns_rowcontentfiller (riga 1394).
Sub cellns_rowcontentfiller(j As Long, str As String, panelWrapper As Panel, b As Byte, i As Int)
	Dim z As Boolean = True
	Try
		If i = vInt3 Then
			panelWrapper.Color = -16711936
		Else If i Mod 2 = 0 Then
			panelWrapper.Color = -1
		Else
			panelWrapper.Color = -3355444
		End If
		If b < 5 Then
			Dim labelWrapper As Label = panelWrapper.GetView(0)
			Select b
				Case 0
					labelWrapper.Text = i + 1
				Case 1
					vCur2 = vSql2.ExecQuery("SELECT * from sortedStampa  WHERE rowid=" & 1 + j)
					vCur2.Position = 0
					labelWrapper.Text = vCur2.GetString("codice")
				Case 2
					labelWrapper.Text = vCur2.GetString("descrizione")
				Case 3
					If vCur2.GetDouble("qta") * 1000 Mod 1000 = 0 Then
						labelWrapper.Text = NumberFormat2(vCur2.GetDouble("qta"), 1, 0, 0, False)
					Else
						labelWrapper.Text = NumberFormat2(vCur2.GetDouble("qta"), 1, 3, 3, False)
					End If
					labelWrapper.Gravity = Bit.Or(16, 5)
				Case 4
					labelWrapper.Text = vCur2.GetDouble("importo")
					labelWrapper.Gravity = Bit.Or(16, 5)
					labelWrapper.Text = NumberFormat2(vCur2.GetDouble("importo"), 1, 2, 2, False)
			End Select
			labelWrapper.Tag = j
			Return
		End If
		Dim imageViewWrapper As ImageView = panelWrapper.GetView(0)
		imageViewWrapper.Tag = j
		If vStr8 <> "P" Then
			If vStr8 <> "F" Then
			End If
		End If
		z = False
		imageViewWrapper.Visible = z
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub cellns_rowlayoutcreator(str As String, panelWrapper As Panel, b As Byte)
	vBln3 = False
	If b = 5 Then
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("buttonFun")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "003.png")
		panelWrapper.AddView(imageViewWrapper, DipToCurrent(10), DipToCurrent(5), panelWrapper.Width - DipToCurrent(20), panelWrapper.Height - DipToCurrent(10))
		Return
	End If
	Dim labelWrapper As Label
	labelWrapper.Initialize("")
	labelWrapper.Gravity = Bit.Or(16, 3)
	labelWrapper.Color = 0
	labelWrapper.TextColor = -16777216
	If b = 0 Then
		labelWrapper.TextSize = 9
	Else
		labelWrapper.TextSize = 14
	End If
	labelWrapper.Typeface = Typeface.DEFAULT
	panelWrapper.AddView(labelWrapper, DipToCurrent(10), DipToCurrent(5), panelWrapper.Width - DipToCurrent(20), panelWrapper.Height - DipToCurrent(10))
End Sub

Sub Chiudi_Click
	If vBln7 Then
		vSql1.Close
		vBln7 = False
	End If
	If Main.vBln25 Then
		If Main.vBln38 Then
			ToastMessageShow("Chiusura interfaccia server in corso ...", True)
			Main.vSql1.ExecNonQuery("delete from Ventmp")
			Main.vSql1.ExecNonQuery("delete from headmov")
			Main.vSql1.ExecNonQuery("delete from venduto")
			Main.vSql1.ExecNonQuery("delete from CausaliPagamenti")
			Main.vSql1.ExecNonQuery("delete from tmpStampa")
			Main.vBln29 = False
		End If
	End If
	If Main.vStr15 = "VendutoP2" Then
		If Main.v_iprpi <> "" Then
			Dim sb2 As String = mod1.vStr4 & "/TMP"
			If File.Exists(sb2, "Venduto.db") Then
				File.Delete(sb2, "Venduto.db")
			End If
		End If
	End If
	vBln1 = True
	Activity.Finish
	Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
	Main.vSql2.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
	mod1.Sub198("Main")
End Sub

Sub Sub004
	If vBln4 Then
		Sub006()
		PGrafico.Visible = True
		mod1.Sub161(PGrafico, 9)
		PDettaglio.Visible = False
	Else
		PGrafico.Visible = True
		mod1.Sub161(PGrafico, 7)
		PDettaglio.Visible = True
		mod1.Sub161(PDettaglio, 8)
	End If
	PDettaglio.Visible = True
	vBln5 = True
End Sub

Sub Sub005
	vSql2.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedStampa")
	vSql2.ExecNonQuery("CREATE TEMP TABLE sortedStampa (chiave INTEGER PRIMARY KEY ," & CRLF & TAB & TAB & "codice nvarchar (20)  NULL,descrizione" & TAB & "nvarchar (50)  NULL" & CRLF & TAB & TAB & ",qta numeric(18, 3) not NULL default 0,importo numeric(18, 2) not NULL default 0,sconto numeric(18, 2) not NULL default 0)")
End Sub

Sub Sub006
	Dim list As List
	Dim list2 As List
	Dim list3 As List
	Dim f As Float
	Dim z As Boolean
	Dim i As Int
	Dim i2 As Int
	mod1.vStr2 = "Sub CreatePieTab"
	Try
		Dim vGetAllViewsRecursive As IterableList = PGrafico.GetAllViewsRecursive
		Dim size As Int = vGetAllViewsRecursive.Size
		Dim i3 As Int
		For i3 = 0 To size - 1
			Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i3)
			If concreteViewWrapper.Tag = "Grafico" Then
				concreteViewWrapper.RemoveView
			End If
		Next
		vPieChart1.Initialize("")
		PGrafico.AddView(vPieChart1, 0, PerYToCurrent(14), PerXToCurrent(100), PerYToCurrent(80))
		vPieChart1.DrawHoleEnabled = True
		vPieChart1.HoleColorTransparent = True
		vPieChart1.Tag = "Grafico"
		vPieChart1.TransparentCircleColor = -1
		vPieChart1.TransparentCircleAlpha = 110
		vPieChart1.HoleRadius = 58
		vPieChart1.TransparentCircleRadius = 61
		vPieChart1.DrawCenterText = True
		vPieChart1.CenterText = FiltroAttivo.Text.Replace(" e ", CRLF)
		vPieChart1.CenterTextColor = -1
		vPieChart1.CenterTextRadiusPercent = 100
		vPieChart1.CenterTextSize = 15
		vPieChart1.DrawSliceText = True
		vPieChart1.HoleColor = -16777216
		vPieChart1.TransparentCircleColor = 0
		vPieChart1.TheLegendPosition = "RIGHT_OF_CHART"
		vPieChart1.TheLegendColor = -16777216
		vPieChart1.TheLegendTextSize = 14
		vPieChart1.LegendTitle = ""
		vPieChart1.ChartDescription = lblstampaTitolo.Text
		vPieChart1.ChartDescriptionColor = Colors.ARGB(200, 0, 25, 25)
		vPieChart1.ChartDescriptionTextSize = 14
		vPieChart1.ValueTextColor = -16777216
		vPieChart1.ValueTextSize = 12
		'list = List
		'list2 = List
		'list3 = List
		list.Initialize
		list2.Initialize
		list3.Initialize
		f = 0
		z = False
		vCur4 = vSql2.ExecQuery("Select * from sortedStampa order by chiave")
		If vCur4.RowCount <= 0 Then
			i = 0
		Else
			Dim rowCount As Int = vCur4.RowCount - 1
			Dim z2 As Boolean = False
			Dim f2 As Float = 0
			Dim i4 As Int = 0
			Dim i5 As Int
			For i5 = 0 To rowCount
				vCur4.Position = i5
				If vStr8 <> "I" Then
					If vStr8 <> "A" Then
						If vStr8 <> "C" Then
							If vStr8 <> "F" Then
								If vStr8 <> "FC" Then
									If vStr8 <> "MO" Then
										vCur7.Position = vCur4.GetInt("codice")
									End If
								End If
							End If
						End If
					End If
				End If
				Dim vTmp As Int = Sub012(i5)
				If vCur4.GetString("importo") > 0 Then
					z2 = True
					If i5 < 15 Then
						If vStr8 = "I" Then
							list.Add(vTmp)
							list2.Add(vCur4.GetString("codice") & " " & vCur4.GetString("descrizione"))
							list3.Add(vCur4.GetString("importo"))
							i4 = i4 + 1
						Else
							If vStr8 <> "A" Then
								If vStr8 <> "C" Then
									If vStr8 <> "F" Then
										If vStr8 <> "FC" Then
											If vStr8 <> "MO" Then
												list.Add(vTmp)
												list2.Add(vCur7.GetString("descrizione"))
												list3.Add(vCur4.GetString("importo"))
												i4 = i4 + 1
											End If
										End If
									End If
								End If
							End If
							list.Add(vTmp)
							list2.Add(vCur4.GetString("descrizione"))
							list3.Add(vCur4.GetString("importo"))
							i4 = i4 + 1
						End If
					Else
						f2 = f2 + vCur4.GetString("importo")
					End If
				End If
			Next
			i = i4
			f = f2
			z = z2
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Not(z) Then
		Return
	End If
	If f > 0 Then
		list.Add(-256)
		list2.Add("Altro")
		list3.Add(f)
		i2 = i + 1
	Else
		i2 = i
	End If
	Dim iArr(i2) As Int
	Dim strArr(i2) As String
	Dim fArr(i2) As Float
	Dim i6 As Int = i2 - 1
	Dim i7 As Int
	For i7 = 0 To i6
		iArr(i7) = list.Get(i7)
		strArr(i7) = list2.Get(i7)
		fArr(i7) = list3.Get(i7)
	Next
	vPieChart1.PieColors = iArr
	vPieChart1.LegendText = strArr
	vPieChart1.ChartData = fArr
	vPieChart1.PieData = i2
End Sub

Sub Disaptimer_Tick
	v6.Enabled = False
	LblInfo.Visible = False
End Sub

Sub EdtRicerca_TextChanged(str As String, str2 As String)
	Dim trim As String
	Try
		trim = str2.Trim
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If trim = "" Then
		vInt3 = -1
		vUltimateListView1.RefreshContent
		Return
	End If
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = vSql2.ExecQuery("SELECT rowid as RD FROM sortedStampa WHERE descrizione LIKE '%" & trim & "%' " & vStr6)
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Dim longValue As Long = cursorWrapper2.GetLong("RD") - 1
		If longValue >= 0 Then
			vInt3 = vUltimateListView1.GetPositionForID(longValue, False)
		Else
			vInt3 = -1
		End If
	Else
		vInt3 = -1
	End If
	vUltimateListView1.RefreshContent
	If vInt3 > -1 Then
		vUltimateListView1.PlaceItemFromTop(vInt3, DipToCurrent(10))
	End If
End Sub

Sub Elencofiltrodata_Click
	mod1.vStr2 = "Sub ElencoFiltroData_Click"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vBln5 Then
		Return
	End If
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(1)
	vCur1.Position = vTmp
	Dim vGetInt As Int = vCur1.GetInt("codice")
	If vGetInt > 6 Then
		vGetInt = vGetInt - 4
	End If
	If vGetInt = 7 Or vGetInt = 1 Then
		If vStr7 = "Giorno" Then
			Return
		End If
	End If
	vLbl3 = labelWrapper
	vStr1 = ""
	vInt1 = vGetInt
	vBln6 = True
	vBln1 = True
	mod1.Sub198("Filtro")
End Sub

Sub Elencofiltrodel_Click
	mod1.vStr2 = "Sub ElencoFiltroDel_Click"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vBln5 Then
		Return
	End If
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(0)
	Dim labelWrapper2 As Label = getpanel.GetView(1)
	labelWrapper2.Background = mod1.Sub155(-3355444, 25)
	labelWrapper2.Tag = ""
	labelWrapper2.Text = ""
	labelWrapper.Color = -1
	labelWrapper.Tag = ""
	vCur1.Position = vTmp
	Dim vGetInt As Int = vCur1.GetInt("codice")
	If vGetInt > 6 Then
		vGetInt = vGetInt - 4
	End If
	Sub002(vGetInt)
End Sub

Sub Elencofiltroprint_Click
	Dim str As String
	Dim d As Double
	Dim str2 As String
	Dim d2 As Double
	Dim rowCount As Double
	Dim d3 As Double
	mod1.vStr2 = "Sub ElencoFiltroPrint_Click"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vBln5 Then
		Return
	End If
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(0)
	Dim labelWrapper2 As Label = getpanel.GetView(1)
	vCur1.Position = vTmp
	Dim vGetInt As Int = vCur1.GetInt("codice")
	Dim i As Int = IIf(vGetInt > 6, vGetInt - 4, vGetInt)
	Mail.Enabled = True
	Mail.Tag = "M"
	If vCur1.GetInt("flgcopia") = 1 And vCur1.GetInt("flgmail") = 1 Then
		Mail.Text = "Mail e Copia su USB"
		Mail.Tag = "MC"
	Else If vCur1.GetInt("flgcopia") = 1 And vCur1.GetInt("flgmail") = 0 Then
		Mail.Text = "Copia su USB"
		Mail.Tag = "C"
	Else If vCur1.GetInt("flgcopia") = 0 And vCur1.GetInt("flgmail") = 1 Then
		Mail.Text = "Mail"
		Mail.Tag = "M"
	Else If vCur1.GetInt("flgcopia") = 0 And vCur1.GetInt("flgmail") = 0 Then
		Mail.Enabled = False
	End If
	vLst21.Clear
	vLst22.Clear
	If labelWrapper2.Tag <> "" Then
		str = " sospeso =0 and " & labelWrapper2.Tag & " and"
		Select i
			Case s_reparti
				Dim i2 As Int
				For i2 = 0 To 10
					If vLst11.Get(i2) <> "" Then
						vLst21.Add(vLst11.Get(i2))
						vLst22.Add(vLst11.Get(i2))
					End If
				Next
			Case s_articoli
				Dim i3 As Int
				For i3 = 0 To 10
					If vLst12.Get(i3) <> "" Then
						vLst21.Add(vLst12.Get(i3))
						vLst22.Add(vLst12.Get(i3))
					End If
				Next
			Case s_iva
				Dim i4 As Int
				For i4 = 0 To 10
					If vLst13.Get(i4) <> "" Then
						vLst21.Add(vLst13.Get(i4))
						vLst22.Add(vLst13.Get(i4))
					End If
				Next
			Case s_pagamenti
				Dim i5 As Int
				For i5 = 0 To 10
					If vLst14.Get(i5) <> "" Then
						vLst21.Add(vLst14.Get(i5))
						vLst22.Add(vLst14.Get(i5))
					End If
				Next
			Case s_clienti
				Dim i6 As Int
				For i6 = 0 To 10
					If vLst15.Get(i6) <> "" Then
						vLst21.Add(vLst15.Get(i6))
						vLst22.Add(vLst15.Get(i6))
					End If
				Next
			Case s_operatori
				Dim i7 As Int
				For i7 = 0 To 10
					If vLst16.Get(i7) <> "" Then
						vLst21.Add(vLst16.Get(i7))
						vLst22.Add(vLst16.Get(i7))
					End If
				Next
			Case s_repartiguadagno
				Dim i8 As Int
				For i8 = 0 To 10
					If vLst17.Get(i8) <> "" Then
						vLst21.Add(vLst17.Get(i8))
						vLst22.Add(vLst17.Get(i8))
					End If
				Next
			Case s_finanziario
				Dim i9 As Int
				For i9 = 0 To 10
					If vLst18.Get(i9) <> "" Then
						vLst21.Add(vLst18.Get(i9))
						vLst22.Add(vLst18.Get(i9))
					End If
				Next
			Case s_fasce
				Dim i10 As Int
				For i10 = 0 To 10
					If vLst19.Get(i10) <> "" Then
						vLst21.Add(vLst19.Get(i10))
						vLst22.Add(vLst19.Get(i10))
					End If
				Next
			Case s_movimenti
				Dim i11 As Int
				For i11 = 0 To 10
					If vLst20.Get(i11) <> "" Then
						vLst21.Add(vLst20.Get(i11))
						vLst22.Add(vLst20.Get(i11))
					End If
				Next
		End Select
	Else
		str = " sospeso =0 and"
	End If
	vSql2 = vSql3
	If labelWrapper.Text = "ARTICOLI" Then
		str = str & " brep = 0 and"
	End If
	If Main.vStr15 <> "Venduto" And i <> s_pagamenti And str.ToLowerCase.IndexOf("causale") = -1 Then
		str = str & " causale = 'sc' and"
	End If
	If str.EndsWith("and") Then
		str = " where " & str.SubString2(0, str.Length - 3)
	End If
	Dim str3 As String = IIf(Not(labelWrapper.Text = "OPERATORI" Or labelWrapper.Text = "MOVIMENTI" Or labelWrapper.Text = "CLIENTI" Or labelWrapper.Text = "PAGAMENTI" Or labelWrapper.Text = "FINANZIARIO"), str & " and lower(substr(venduto.codint,1,3))<>'mnu'  and lower(substr(venduto.codint,1,3))<>'msg' ", str)
	Dim parseDouble As Double = vSql2.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) end from Venduto " & str3)
	Dim rowCount2 As Double = vSql2.ExecQuery("Select nmov from Venduto " & str3 & " group by nmov").RowCount
	If labelWrapper.Text = "OPERATORI" Or labelWrapper.Text = "CLIENTI" Then
		d = rowCount2
		str2 = " and (select count(*) from venduto where venduto.nmov= headmov.nmov)>0 "
		d2 = parseDouble
	Else If labelWrapper.Text = "PAGAMENTI" Then
		Dim str4 As String = " and (select count(*) from venduto where venduto.nmov= CausaliPagamenti.nmov)>0 "
		Dim parseDouble2 As Double = vSql2.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) end from CausaliPagamenti " & str3 & str4)
		d = vSql2.ExecQuerySingleResult("Select case when sum(qta) is null then 0 else sum(qta) end from CausaliPagamenti " & str3 & str4)
		str2 = str4
		d2 = parseDouble2
	Else
		d = rowCount2
		str2 = ""
		d2 = parseDouble
	End If
	If str3 = "" Then
		Dim parseDouble3 As Double = vSql2.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) end from Venduto where   nfat >0")
		rowCount = vSql2.ExecQuery("Select nmov from Venduto  where  nfat >0  group by nmov").RowCount
		d3 = parseDouble3
	Else
		Dim parseDouble4 As Double = vSql2.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) end from Venduto " & str3 & " and  nfat >0")
		rowCount = vSql2.ExecQuery("Select nmov from Venduto  " & str3 & " and  nfat >0  group by nmov").RowCount
		d3 = parseDouble4
	End If
	Totale.Text = "Totale: € " & NumberFormat2(d2, 1, 2, 2, False) & " (Num." & NumberFormat(d, 1, 0) & ")"
	Fatture.Text = "Fatture: € " & NumberFormat2(d3, 1, 2, 2, False) & " (Num." & NumberFormat(rowCount, 1, 0) & ")"
	vBln4 = False
	Dim str5 As String = str3 & str2
	vStr4 = str5
	vInt8 = 1
	vStr6 = " order by descrizione"
	Sub009(labelWrapper.Text, str5)
	mod1.Sub161(LblInfo, 7)
	vUltimateListView1.Height = PerYToCurrent(72)
End Sub

Sub Sub007
	Sub002(100)
	vcustomlistviewold1.Sub004
	Dim rowCount As Int = vCur1.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		vCur1.Position = i
		vcustomlistviewold1.Sub001(Sub008(i, DipToCurrent(50)), DipToCurrent(50), vCur1.GetString("descrizione"))
	Next
	vcustomlistviewold1.Sub012(0)
End Sub

Sub Sub008(str As String, i As Int) As Panel
	Dim panelWrapper As Panel
	Dim exc As Exception
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper2 As Panel
	panelWrapper2.Initialize("noevent")
	Try
		Dim panelWrapper3 As Panel
		Try
			panelWrapper3.Initialize("noevent")
			panelWrapper3.Color = -1
			Dim labelWrapper As Label
			labelWrapper.Initialize("ElencoFiltroDescriz")
			labelWrapper.Gravity = Bit.Or(16, 1)
			labelWrapper.Text = vCur1.GetString("descrizione")
			labelWrapper.Color = -1
			labelWrapper.TextSize = 16
			labelWrapper.Tag = ""
			labelWrapper.TextColor = -16777216
			'fData = Label
			fData.Initialize("ElencoFiltroData")
			fData.Gravity = Bit.Or(16, 1)
			fData.Text = ""
			fData.Tag = ""
			fData.Background = mod1.Sub155(-3355444, 25)
			fData.TextSize = 16
			fData.TextColor = -16777216
			mod1.Sub168(fData, DipToCurrent(2), DipToCurrent(2), PerXToCurrent(12), DipToCurrent(2))
			Dim imageViewWrapper As ImageView
			imageViewWrapper.Initialize("ElencoFiltroDel")
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "006.png")
			Dim imageViewWrapper2 As ImageView
			imageViewWrapper2.Initialize("ElencoFiltroPrint")
			imageViewWrapper2.Bitmap = LoadBitmap(File.DirAssets, "ShowData.png")
			Dim labelWrapper5 As Label
			labelWrapper5.Initialize("")
			labelWrapper5.Text = str
			labelWrapper5.Visible = False
			panelWrapper3.AddView(labelWrapper, 0, DipToCurrent(0), PerXToCurrent(16), i)
			panelWrapper3.AddView(fData, PerXToCurrent(17), DipToCurrent(0), PerXToCurrent(69), i)
			panelWrapper3.AddView(imageViewWrapper, PerXToCurrent(76), DipToCurrent(0), PerXToCurrent(12), i)
			panelWrapper3.AddView(imageViewWrapper2, PerXToCurrent(88), DipToCurrent(0), PerXToCurrent(12), i)
			panelWrapper3.AddView(labelWrapper5, DipToCurrent(330), DipToCurrent(0), DipToCurrent(10), i)
			Return panelWrapper3
		Catch
			exc = e
			panelWrapper = panelWrapper3
			mod1.Sub217(LastException.Message)
			Return panelWrapper
		End Try
	Catch
		panelWrapper = panelWrapper2
		exc = e2
	End Try
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

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/stampe.java, metodo m1… (riga 2167).
Sub Sub009(str As String, str2 As String)
	ProgressDialogShow("Attendere  ... Elaborazione in corso")
	DoEvents
	DoEvents
	vSql2 = vSql3
	vStr6 = " order by descrizione"
	Dim i As Int
	For i = 0 To 6
		vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
		vLabelArr1(i).Background = vColorDrawable1
		If i < 6 Then
			vLabelArr2(i).Background = vColorDrawable1
		End If
	Next
	EdtRicerca.Text = ""
	vLbl2.Text = "Sconto"
	If str = "REPARTI" Then
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr1(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vCur7 = vCur5
		vStr3 = "Select  reparto as Codice,max(reparti.descrizione) as Descrizione,sum(case when lower(substr(venduto.codice,1,2))='vv' then 0 else qta end) As Qta,sum(importo) as Importo ,sum(prezzov*qta) - sum(importo) as Sconto  from Venduto inner join reparti on reparti.codice = venduto.reparto" & str2 & " group by reparto"
		Sub010("ROW")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			lblstampaTitolo.Text = "Stampa Reparti " & vStr7
			vStr8 = "R"
			Sub004()
		End If
	End If
	If str = "FINANZIARIO" Then
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr2(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vSql2 = Main.vSql1
		If Main.vBln24 Then
			If vSql2 <> Main.vSql1 Then
				mod1.Sub085(vSql2, str2.SubString(6))
				vStr3 = "Select codice as Codice,descrizione ,qta as Qta,importo as Importo from TmpFinanziario"
				Sub010("ROWNS")
				If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
					vStr8 = "F"
					lblstampaTitolo.Text = "Stampa Finanziario " & vStr7
					Sub004()
				End If
			End If
		End If
		mod1.Sub084(vSql3, str2.SubString(6), False)
		vStr3 = "Select codice as Codice,descrizione ,qta as Qta,importo as Importo from TmpFinanziario"
		Sub010("ROWNS")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
		End If
	End If
	If str = "GUADAGNO REPARTI" Then
		vCur7 = vCur5
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr1(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vLbl2.Text = "Guadagno"
		vStr3 = "Select  reparto as Codice,max(reparti.descrizione) as descrizione,sum(case when lower(substr(venduto.codice,1,2))='vv' then 0 else qta end) As Qta,sum(importo) as Importo ,case when max(guadagnop) >0 then round(round(sum(importo) * max(reparti.guadagnop),2)/100,2) else round(max(guadagnov) * sum(qta),2)  end as Sconto  from Venduto inner join reparti on reparti.codice = venduto.reparto" & str2 & " group by reparto"
		Sub010("ROW")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			lblstampaTitolo.Text = "Stampa Guadagno Reparti " & vStr7
			vStr8 = "RG"
			Sub004()
		End If
	End If
	If str = "FASCE ORARIE" Then
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr1(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vStr3 = "Select substr(datam3,12,2) as Codice,'Ore ' || substr(datam3,12,2) || '.00 Documenti ' || count(distinct(nmov)) as descrizione,sum(case when lower(substr(venduto.codice,1,2))='vv' then 0 else qta end) As qta,sum(importo) as Importo,sum(prezzov*qta) - sum(importo) as Sconto from Venduto " & str2 & " group by substr(datam3,12,2)"
		Sub010("ROW")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			vStr8 = "FC"
			lblstampaTitolo.Text = "Stampa Fasce Orarie " & vStr7
			Sub004()
		End If
	End If
	If str = "ARTICOLI" Then
		str2 = str2 & "  and lower(substr(venduto.codice,1,2))<>'vv'"
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr1(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vStr3 = "Select codint as Codice,descrizione,sum(qta) As qta,sum(importo+importo2) as Importo,sum(prezzov*qta) - sum(importo) as Sconto from Venduto " & str2 & " group by codint,descrizione"
		Sub010("ROW")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			vStr8 = "A"
			lblstampaTitolo.Text = "Stampa Articoli " & vStr7
			Sub004()
		Else If vInt8 > 1 Then
			vStr8 = "A"
			ricerca_click()
		End If
	End If
	If str = "IVA" Then
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr1(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vSql2 = Main.vSql1
		mod1.Sub086(vSql3, str2.SubString(6), True)
		vStr3 = "Select codice as Codice,descrizione ,qta as Qta,importo as Importo from TmpIva"
		vStr6 = " order by codice desc"
		Sub010("ROWNS")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			vStr8 = "I"
			lblstampaTitolo.Text = "Stampa Iva " & vStr7
			Sub004()
		End If
	End If
	If str = "PAGAMENTI" Then
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr2(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vCur7 = vCur6
		vStr3 = "Select  Codice,max(descrizione) as descrizione,sum(qta) As Qta,sum(importo) as Importo  from CausaliPagamenti " & str2 & " group by codice"
		Sub010("ROWNS")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			vStr8 = "P"
			lblstampaTitolo.Text = "Stampa Pagamenti " & vStr7
			Sub004()
		End If
	End If
	If str = "CLIENTI" Then
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr2(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vStr3 = "Select  cliente as Codice,max(clides) as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov " & str2 & " group by codice"
		Sub010("ROWNS")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			vStr8 = "C"
			lblstampaTitolo.Text = "Stampa Clienti " & vStr7
			Sub004()
		End If
	End If
	If str = "MOVIMENTI" Then
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr1(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		Dim sb As String = "'Mov. ' || nmov || ':' || Case WHEN flgNF =0 AND nfat =0 AND nric =0 Then 'Sco.' ELSE" & TAB & "CASE WHEN nfat >0 THEN" & TAB & "'Fat.' ||  nfat || ' ' || clides" & TAB & "ELSE CASE WHEN flgNF =1 and nfat =0 and nric =0 THEN 'Altro' else CASE WHEN nric>0 THEN" & TAB & "'Ric.' || nric" & TAB & "else 'NF' end end" & TAB & "END END || " & IIf(Main.vBln24, " ' Cassa ' || cassa || ", "") & " case when tavolo =0 then '' else ' (Tav.' || tavolo || ')' end"
		If Main.vStr15 <> "Venduto" Then
			sb = "case when causale ='sc' then 'Mov. ' || nmov || ':' || Case WHEN flgNF =0 AND nfat =0 AND nric =0 Then 'Sco.' ELSE" & TAB & "CASE WHEN nfat >0 THEN" & TAB & "'Fat.' ||  nfat || ' ' || clides" & TAB & "ELSE CASE WHEN flgNF =1 and nfat =0 and nric =0 THEN 'Altro' else CASE WHEN nric>0 THEN" & TAB & "'Ric.' || nric" & TAB & "else 'NF' end end" & TAB & "END END else" & TAB & "Case when causale ='ca' then" & TAB & "'Carico'" & TAB & "Else" & TAB & "Case when causale ='re' then" & TAB & "'Rettifica'" & TAB & "Else" & TAB & "Case when causale ='rf' then 'Reso a Fotnitore' Else" & TAB & "Case when causale ='au' then 'Autoconsumo'" & TAB & "Else Case when causale ='in' then" & TAB & "'Inventario' Else Case when causale ='pr' then" & TAB & "'Prenotazione'  end" & TAB & "End" & TAB & "End" & TAB & "End" & TAB & "End" & TAB & "End end" & IIf(Main.vBln24, " || case when cassa is null then '' else ' Cassa ' || cassa end ", "") & " || case when tavolo =0 then '' else '(Tav.' || tavolo || ')' end "
		End If
		str2 = str2 & " and qta > 0 "
		vStr3 = "Select  nmov as Codice," & sb & " As descrizione,(select count(*) from venduto where venduto.nmov=headmov.nmov) As Qta,totale as Importo,(select CASE WHEN sum(scov) is null then 0 else sum(scov) end from venduto where venduto.nmov=headmov.nmov) As Sconto  from headmov " & str2
		Sub010("ROW")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			vStr8 = "MO"
			lblstampaTitolo.Text = "Stampa Movimenti " & vStr7
			Sub004()
		End If
	End If
	If str = "OPERATORI" Then
		vColorDrawable1.Initialize(-65536, DipToCurrent(6))
		vLabelArr2(2).Background = vColorDrawable1
		vByt1 = 2
		vBln2 = False
		vStr3 = "Select  operatore as Codice,opdes as descrizione,count(*) As Qta,sum(totale) as Importo  from headmov " & str2 & " group by codice,opdes"
		Sub010("ROWNS")
		If vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa") > 0 Then
			vStr8 = "O"
			lblstampaTitolo.Text = "Stampa Operatori " & vStr7
			Sub004()
		End If
	End If
	vLst21.InsertAt(vLst21.Size, "Ordinamento: descrizione")
	Sub001()
	ProgressDialogHide
End Sub

Sub Header_Click
	Try
		If vUltimateListView1.Enabled And vUltimateListView1.NumberOfItems > 1 Then
			Dim concreteViewWrapper As View = Sender
			If concreteViewWrapper.Tag > 0 And concreteViewWrapper.Tag < 6 Then
				vUltimateListView1.StopScrolling
				If vByt1 = concreteViewWrapper.Tag Then
					vBln2 = Not(vBln2)
				Else
					vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
					If vByt1 >= 0 Then
						If vBln3 Then
							vLabelArr1(vByt1).Background = vColorDrawable1
						Else
							vLabelArr2(vByt1).Background = vColorDrawable1
						End If
					End If
					vBln2 = True
					vByt1 = concreteViewWrapper.Tag
				End If
				sort_data()
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

Sub Sub010(str As String)
	vUltimateListView1.ClearContent
	Sub005()
	If str = "ROW" Then
		vPnl1.Visible = True
		vPnl2.Visible = False
		vSql2.ExecNonQuery("insert into sortedStampa(codice,descrizione,qta," & CRLF & TAB & TAB & TAB & TAB & "importo,sconto) " & SmartStringFormatter("", vStr3 & vStr6) & "  ")
	Else
		vPnl1.Visible = False
		vPnl2.Visible = True
		vSql2.ExecNonQuery("insert into sortedStampa(codice,descrizione,qta," & CRLF & TAB & TAB & TAB & TAB & "importo) " & SmartStringFormatter("", vStr3 & vStr6) & "  ")
	End If
	vUltimateListView1.BulkAddItems(vSql2.ExecQuerySingleResult("Select count(*) from sortedStampa"), str, 0)
	vCur3 = vSql2.ExecQuery("Select descrizione from sortedStampa")
End Sub

Sub Sub011(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub Lv_ItemClick(i As Int, obj As Object)
	vLbl1.Background = mod1.Sub155(-65536, 25)
	vLbl1.Tag = ""
	vLbl1.Text = ""
End Sub

Sub Mail_Click
	mod1.vStr2 = "Sub Mail_Click"
	Try
		vCur4 = vSql2.ExecQuery("Select * from sortedStampa order by chiave")
		mod1.mail(False, vStr8, vLst21, vCur4, vCur7, vBln4, lblstampaTitolo.Text, vSMTP1, vPDFWriter1, Mail.Tag)
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

Sub Sub012(i As Int) As Int
	Dim valueOf As Int = i
	Select valueOf
		Case Main.c_rosso
			Return -65536
		Case Main.c_blu
			Return Colors.RGB(94, 169, 255)
		Case Main.c_verde
			Return -16711936
		Case Main.c_giallo
			Return -256
		Case Main.c_arancione
			Return Colors.RGB(255, 153, 50)
		Case Main.c_bianco
			Return -1
		Case Main.c_grigio
			Return -7829368
		Case Main.c_marrone
			Return Colors.RGB(167, 25, 36)
		Case Main.c_azzurro
			Return -16711681
		Case Main.c_verdesmeraldo
			Return Colors.RGB(0, 255, 89)
		Case Main.c_verdechiaro
			Return Colors.RGB(178, 255, 102)
		Case Main.c_viola
			Return Colors.RGB(178, 0, 255)
		Case Main.c_rosa
			Return Colors.RGB(255, 127, 237)
		Case Main.c_nero
			Return Colors.RGB(30, 30, 30)
		Case Else
			Return -1
	End Select
End Sub

Sub Noevent_Click
End Sub

Sub pdfwriter1_conversiondone(str As String)
	mod1.vStr3 = str
End Sub

Sub PGrafico_Click
End Sub

Sub pnlW_Click
End Sub

Sub Ricerca_Click
	If vInt8 > 1 Then
		Sub003()
		Ricerca.Tag = "Elenco"
		Return
	End If
	Sub013()
End Sub

Sub ShowGraph_Click
	vBln4 = Not(vBln4)
	Sub004()
End Sub

Sub Sub013
	vBln4 = False
	PDettaglio.Visible = False
	PGrafico.Visible = False
	vBln5 = False
End Sub

Sub Smtp_MessageSent(z As Boolean)
	ProgressDialogHide
	If z Then
		Dim vObjectToCharSequence As Object = "Mail inviata Correttamente"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
	Dim vObjectToCharSequence3 As Object = "Errore durante l'invio della Mail" & CRLF & CRLF & LastException.Message
	Dim vObjectToCharSequence4 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
	mod1.Sub217(LastException.Message)
End Sub

Sub sort_async
	Sub005()
	Dim sb As String = "insert into sortedStampa(codice,descrizione,qta," & CRLF & TAB & "importo " & SmartStringFormatter("", IIf(vBln3, ",sconto", "")) & ") " & SmartStringFormatter("", vStr3) & "  "
	Dim str As String = ""
	If Not(vBln2) Then
		str = " DESC"
	End If
	Select vByt1
		Case 0
			vStr6 = " order by descrizione "
		Case 1
			vStr6 = " order by codice" & str & ",descrizione"
		Case 2
			vStr6 = " order by descrizione" & str
		Case 3
			vStr6 = " order by qta" & str & ",descrizione"
		Case 4
			vStr6 = " order by importo" & str & ",descrizione"
		Case 5
			vStr6 = " order by sconto" & str & ",descrizione"
		Case 6
			vStr6 = " order by descrizione "
	End Select
	vSql2.ExecNonQuery(sb & vStr6)
	Dim size As Int = vLst21.Size - 1
	vLst21.Set(size, "Ordinamento:" & vStr6.Replace(" order by", "").Replace(",descrizione", "").Replace(" DESC", " Decrescente"))
	vUltimateListView1.RefreshContent
	vUltimateListView1.Enabled = True
End Sub

Sub sort_data
	vUltimateListView1.Enabled = False
	If vByt1 = -1 Then
		vByt1 = 2
		vBln2 = False
	End If
	vColorDrawable1.Initialize(-65536, DipToCurrent(6))
	If vBln3 Then
		vLabelArr1(vByt1).Background = vColorDrawable1
	Else
		vLabelArr2(vByt1).Background = vColorDrawable1
	End If
	sort_async()
End Sub

Sub Stampa_Click
	mod1.vStr2 = "Sub stampa_Click"
	Try
		Dim map As Map
		map.Initialize
		vCur4 = vSql2.ExecQuery("Select * from sortedStampa order by chiave")
		mod1.stampa(vStr8, vLst21, vCur4, vCur7, lblstampaTitolo.Text, map)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Ulv_Scrolled(i As Int, i2 As Int, i3 As Int, z As Boolean, z2 As Boolean)
	Try
		If i <> vInt9 Then
			vInt9 = i
			Dim fastScrollerState As Int = vUltimateListView1.FastScrollerState
			Dim ultimateListViewWrapper As UltimateListView = vUltimateListView1
			If fastScrollerState = 2 Then
				If vStr6.StartsWith(" order by descrizione") Then
					If vStr8 <> "MO" Then
						v6.Enabled = False
						Dim vGetItemID As Int = vUltimateListView1.GetItemID(i)
						If vGetItemID < 0 Then
							Return
						End If
						vCur3.Position = vGetItemID
						If vCur3.GetString("descrizione").Length < 2 Then
							Return
						End If
						LblInfo.Text = vCur3.GetString("descrizione").SubString2(0, 2).ToUpperCase
						LblInfo.Visible = True
						v6.Enabled = True
					End If
				End If
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Ulv_ScrollStateChanged(i As Int)
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

