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
	Public v5 As Timer
	Public v6 As Timer
	Public vBln1 As Boolean
	Public vStr1 As String
	Public m_rcodice As Int = 2
	Public m_rdescrizione As Int = 3
	Public m_rtutti As Int = 10
	Public vInt1 As Int = -1
	Public vInt2 As Int
	Public vInt3 As Int = DipToCurrent(54)
	Public vInt4 As Int = DipToCurrent(60)
	Public vInt5 As Int = DipToCurrent(1)
	Public vIntArr1 As Int() = Array As Int(PerXToCurrent(7), PerXToCurrent(10), PerXToCurrent(25), PerXToCurrent(18), PerXToCurrent(18), PerXToCurrent(12), PerXToCurrent(10))
	Public vInt6 As Int = PerXToCurrent(100)
	Public vInt7 As Int = -1
	Public vByt1 As Byte = -1
	Public vBln2 As Boolean
	Public vStr2 As String = " order by Descrizione"
	Public vStr3 As String
	Public vBln3 As Boolean
	Public vStr4 As String
	Public vBln4 As Boolean
End Sub

Sub Globals
	Public vDlg1 As InputDialog
	Public vLst1 As List
	Public a1 As Animation
	Public vIME1 As IME
	Public vUltimateListView1 As UltimateListView
	Public vcustomlistviewold1 As customlistviewold
	Public vcustomlistviewold2 As customlistviewold
	Public vcustomlistviewold3 As customlistviewold
	Public vColorDrawable1 As ColorDrawable
	Public vLabelArr1(7) As Label
	Public LblInfo As Label
	Public vCur1 As Cursor
	Public vCur2 As Cursor
	Public vCur3 As Cursor
	Public vCur4 As Cursor
	Public bNew As Button
	Public lblPluTitle As Label
	Public sRicerca As Spinner
	Public Edt1 As EditText
	Public pLista As Panel
	Public vCSBuilder1 As CSBuilder
	Public lblmainTitle As Label
	Public vPnl1 As Panel
	Public vLst2 As List
	Public vLst3 As List
	Public vLst4 As List
	Public vMap1 As Map
	Public vLst5 As List
	Public vLst6 As List
	Public inzLinea As Button
	Public inzCodElementoScontrino As Button
	Public inzElementoScontrino As Button
	Public inzDaData As Button
	Public inzAData As Button
	Public inzAOra As Button
	Public inzDaOra As Button
	Public inzDescrizione As Button
	Public inzGiorni As Button
	Public inzEsclusivita As Button
	Public inzPriorita As Button
	Public inzEsclutiNF As Button
	Public pAnnulla As Button
	Public PanVincoli As Panel
	Public bNewVincolo As Button
	Public sOrdinaVincoli As Spinner
	Public PanRicompense As Panel
	Public sOrdinaRicompense As Spinner
	Public bNewRicompensa As Button
	Public bGruppiRicompense As Button
	Public pnlLimiti As Panel
	Public bMsgVisualizza As Button
	Public inzLimitaRicompense As Button
End Sub

Sub ac_itemclicked(menuItemWrapper As MenuItem)
	mod1.vStr2 = "  Sub AC_Click (Position As Int, ActionItemID As Int)"
	Try
		Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select Descrizione from MPTitoloIniziative where Codice = '" & vStr1 & "'")
		Select vLst1.Get(menuItemWrapper.Id)
			Case "Modifica"
				bAddModNew(False, vStr1)
			Case "Esporta"
				Dim vObjectToCharSequence As Object = "Si desidera esportare la configurazione di questa offerta ?"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
				If vMsgbox2 = -1 Then
					Sub014(vStr1)
				End If
			Case "Ricompense"
				PanRicompense.Visible = True
				Sub064(PanRicompense)
				lblPluTitle.Text = "Ricompense per l'offerta " & vExecQuerySingleResult
				Sub044(vStr1, " order by chiave", False)
			Case "Vincoli"
				PanVincoli.Visible = True
				Sub063(PanVincoli)
				lblPluTitle.Text = "Vincoli per l'offerta " & vExecQuerySingleResult
				Sub045(vStr1, " order by chiave", False)
			Case "Elimina"
				Dim vObjectToCharSequence3 As Object = "Confermi la cancellazione dell'offerta " & vExecQuerySingleResult
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
				If vMsgbox22 = -1 Then
					Main.vSql1.ExecNonQuery("delete from MPLimitiRicompense where Codice = '" & vStr1 & "'")
					Main.vSql1.ExecNonQuery("delete from MPMixArticoli where Codice = '" & vStr1 & "'")
					Main.vSql1.ExecNonQuery("delete from MPRicompense where Codice = '" & vStr1 & "'")
					Main.vSql1.ExecNonQuery("delete from MPRicompenseGruppi where Codice = '" & vStr1 & "'")
					Main.vSql1.ExecNonQuery("delete from MPTitoloIniziative where Codice = '" & vStr1 & "'")
					Main.vSql1.ExecNonQuery("delete from MPIniziative where Codice = '" & vStr1 & "'")
					Main.vSql1.ExecNonQuery("delete from MPVincoli where Codice = '" & vStr1 & "'")
					imericerca_handleaction()
				End If
		End Select
		mod1.Sub081
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Activity_Create(z As Boolean)
	Dim z2 As Boolean
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			If Main.vInt9 >= 19 Then
				Dim javaObject As JavaObject = Activity
				javaObject.RunMethod("setOnSystemUiVisibilityChangeListener", Array(javaObject.CreateEvent("android.view.View.OnSystemUiVisibilityChangeListener", "VisibilityChanged", Null)))
				Activity.Width = -1
				Activity.Height = -1
				mod1.Sub081
			End If
			v5.Initialize("TimerBarcode", 10)
			v5.Enabled = False
			mod1.Sub175
			Sub007()
			Dim cursorWrapper As Cursor
			vCur2 = Main.vSql1.ExecQuery("Select Descrizione from sortedMPIniziative")
			Sub041("iniziative")
			mod1.Sub067(Edt1, 17301583)
			lblPluTitle.Color = Main.v_colormenutitle
			lblmainTitle.Color = Main.v_colormenutitle
			mod1.Sub173(lblPluTitle)
			mod1.Sub173(lblmainTitle)
			sRicerca.Clear
			sRicerca.Add("Ricerca attiva : Descrizione ")
			sRicerca.Add("Ricerca attiva : Codice ")
			sRicerca.Add("Trova tutte le Offerte")
			sRicerca.SelectedIndex = 0
			sOrdinaVincoli.Clear
			sOrdinaVincoli.Add("Ordinamento attivo : Ordine di inserimento ")
			sOrdinaVincoli.Add("Ordinamento attivo : Oggetto (Scontrino , Articolo ...) ")
			sOrdinaVincoli.Add("Ordinamento attivo : Gruppo Vincolo ")
			sOrdinaVincoli.SelectedIndex = 0
			sOrdinaRicompense.Clear
			sOrdinaRicompense.Add("Ordinamento attivo : Ordine di inserimento ")
			sOrdinaRicompense.Add("Ordinamento attivo : Oggetto (Scontrino , Articolo ...) ")
			sOrdinaRicompense.Add("Ordinamento attivo : Gruppo Ricompensa ")
			sOrdinaRicompense.Add("Ordinamento attivo : Priorità Ricompensa ")
			sOrdinaRicompense.SelectedIndex = 0
			pLista.Visible = True
			Edt1.Visible = True
			Edt1.Text = ""
			If vUltimateListView1.IsInitialized Then
				vUltimateListView1.ClearContent
			End If
			lblmainTitle.Text = "Gestione Offerte fidelity"
			vLst2.Initialize
			Dim cursorWrapper2 As Cursor
			Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione from reparti order by reparti.codice")
			If cursorWrapper3.RowCount > 0 Then
				Dim rowCount As Int = cursorWrapper3.RowCount - 1
				Dim i As Int
				For i = 0 To rowCount
					cursorWrapper3.Position = i
					vLst2.Add(cursorWrapper3.GetString("descrizione"))
				Next
			End If
			vLst3.Initialize
			Dim cursorWrapper4 As Cursor
			Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione from gruppovar order by codice")
			If cursorWrapper5.RowCount > 0 Then
				Dim rowCount2 As Int = cursorWrapper5.RowCount - 1
				Dim i2 As Int
				For i2 = 0 To rowCount2
					cursorWrapper5.Position = i2
					vLst3.Add(cursorWrapper5.GetString("descrizione"))
				Next
			End If
			vLst4.Initialize
			vLst4.Add("Tutti i clienti")
			vLst4.Add("Solo Fidelity")
			vLst4.Add("Tutti tranne i Fidelity")
			Dim i3 As Int
			For i3 = 1 To 99
				vLst4.Add("Solo Fidelity Gruppo " & i3)
			Next
			Dim cursorWrapper6 As Cursor
			Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("select CodiceCoupon from MPMessaggiCoupon ")
			vLst5.Initialize
			Dim rowCount3 As Int = cursorWrapper7.RowCount - 1
			Dim i4 As Int
			For i4 = 0 To rowCount3
				cursorWrapper7.Position = i4
				vLst5.Add(cursorWrapper7.GetString("CodiceCoupon"))
			Next
			cursorWrapper7.Close
			vLst6.Initialize
			vLst6.AddAll(ArrayToList(Array As String("Sconto % sul valore ", "Sconto % sulla quantità ", "Abbuono sul valore ", "Buono sulla quantità ", "M x N ", "Taglio prezzo ", "Generazione punti sulla quantità", "Generazione punti sul valore ", "Generazione Coupon sulla quantità ", "Generazione Coupon sul valore ", "Messaggio a operatore a valore ", "Messaggio a operatore Qta ", "Messaggio a cliente valore ", "Messaggio a cliente quantità ", "Esegui Macro sulla quantità", "Esegui Macro sul valore", "Ricarica con maggiorazione sulla quantità", "Ricarica con maggiorazione sul valore")))
			vMap1.Initialize
			vMap1.Put("A", 0)
			vMap1.Put("B", 1)
			vMap1.Put("C", 2)
			vMap1.Put("1", 3)
			vMap1.Put("2", 4)
			vMap1.Put("3", 5)
			vMap1.Put("4", 6)
			vMap1.Put("5", 7)
			vMap1.Put("6", 8)
			vMap1.Put("7", 9)
			vMap1.Put("8", 10)
			vMap1.Put("9", 11)
			vStr4 = DateTime.GetYear(DateTime.Now) & NumberFormat(DateTime.GetMonth(DateTime.Now), 2, 0) & NumberFormat(DateTime.GetDayOfMonth(DateTime.Now), 2, 0)
			Dim panelWrapper As Panel
			panelWrapper.Initialize("")
			panelWrapper.Color = -16777216
			Dim i5 As Int = 0
			Dim i6 As Int = 0
			Do While True
				Dim i7 As Int = i6
				Dim i8 As Int = i5
				If i7 <= 6 Then
					vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
					vLabelArr1(i7).Initialize("Header")
					vLabelArr1(i7).Background = vColorDrawable1
					Dim labelWrapper3 As Label = vLabelArr1(i7)
					labelWrapper3.TextColor = -1
					vLabelArr1(i7).TextSize = 16
					Dim labelWrapper4 As Label = vLabelArr1(i7)
					labelWrapper4.Typeface = Typeface.DEFAULT_BOLD
					Dim labelWrapper5 As Label = vLabelArr1(i7)
					labelWrapper5.Gravity = 19
					Select i7
						Case 0
							vLabelArr1(i7).Text = "#"
						Case 1
							vLabelArr1(i7).Text = "Codice"
						Case 2
							vLabelArr1(i7).Text = "Descrizione"
						Case 3
							vLabelArr1(i7).Text = "Tipo Elemento"
						Case 4
							vLabelArr1(i7).Text = "Data inizio"
						Case 5
							vLabelArr1(i7).Text = "Data fine"
						Case 6
							vLabelArr1(i7).Text = "     "
					End Select
					vLabelArr1(i7).Tag = i7
					panelWrapper.AddView(vLabelArr1(i7), i8 + vInt5 / 2, 0, vIntArr1(i7) - vInt5, vInt3)
					vLabelArr1(i7).RunMethod("setPadding", Array(DipToCurrent(10), 0, DipToCurrent(10), 0))
					i5 = i8 + vIntArr1(i7)
					i6 = i7 + 1
				Else
					pLista.AddView(panelWrapper, 0, 0, vInt6, vInt3)
					vcustomlistviewold1.Initialize(Me, "clvV")
					vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
					PanVincoli.AddView(vcustomlistviewold1.Sub003, DipToCurrent(0), DipToCurrent(100), PanVincoli.Width, PanVincoli.Height - DipToCurrent(100))
					vcustomlistviewold1.Sub004
					vcustomlistviewold2.Initialize(Me, "clvR")
					vcustomlistviewold2.vInt3 = Colors.RGB(245, 245, 245)
					PanRicompense.AddView(vcustomlistviewold2.Sub003, DipToCurrent(0), DipToCurrent(100), PanRicompense.Width, PanRicompense.Height - DipToCurrent(100))
					vcustomlistviewold2.Sub004
					vcustomlistviewold3.Initialize(Me, "clvL")
					vcustomlistviewold3.vInt3 = Colors.RGB(245, 245, 245)
					pnlLimiti.AddView(vcustomlistviewold3.Sub003, DipToCurrent(0), DipToCurrent(0), pnlLimiti.Width, pnlLimiti.Height - DipToCurrent(0))
					vcustomlistviewold3.Sub004
					vUltimateListView1.Initialize(0, 0, "", "ULV")
					vUltimateListView1.FastScroller(True)
					vUltimateListView1.DividerHeight = 0
					Dim ultimateListViewWrapper2 As UltimateListView = vUltimateListView1
					vUltimateListView1.SetStyle(2)
					Dim length As Byte = vIntArr1.Length
					vUltimateListView1.AddRowLayout("ROW", "Cell_RowLayoutCreator", "Cell_RowContentFiller", vInt4, length, vIntArr1, vInt5, -7829368, True)
					pLista.AddView(vUltimateListView1, 0, vInt3, vInt6, pLista.Height - vInt3)
					Dim panelWrapper2 As Panel
					panelWrapper2.Initialize("")
					panelWrapper2.Color = -16777216
					Dim i11 As Int = 0
					Dim i12 As Int = 0
					Do While True
						Dim i13 As Int = i12
						Dim i14 As Int = i11
						If i13 <= 6 Then
							vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
							vLabelArr1(i13).Initialize("Header")
							vLabelArr1(i13).Background = vColorDrawable1
							Dim labelWrapper6 As Label = vLabelArr1(i13)
							labelWrapper6.TextColor = -1
							vLabelArr1(i13).TextSize = 16
							Dim labelWrapper7 As Label = vLabelArr1(i13)
							labelWrapper7.Typeface = Typeface.DEFAULT_BOLD
							Dim labelWrapper8 As Label = vLabelArr1(i13)
							labelWrapper8.Gravity = 19
							Select i13
								Case 0
									vLabelArr1(i13).Text = "#"
								Case 1
									vLabelArr1(i13).Text = "Codice"
								Case 2
									vLabelArr1(i13).Text = "Descrizione"
								Case 3
									vLabelArr1(i13).Text = "Tipo Elemento"
								Case 4
									vLabelArr1(i13).Text = "Data inizio"
								Case 5
									vLabelArr1(i13).Text = "Data fine"
								Case 6
									vLabelArr1(i13).Text = "     "
							End Select
							vLabelArr1(i13).Tag = i13
							panelWrapper2.AddView(vLabelArr1(i13), i14 + vInt5 / 2, 0, vIntArr1(i13) - vInt5, vInt3)
							vLabelArr1(i13).RunMethod("setPadding", Array(DipToCurrent(10), 0, DipToCurrent(10), 0))
							i11 = i14 + vIntArr1(i13)
							i12 = i13 + 1
						Else
							pLista.AddView(panelWrapper2, 0, 0, vInt6, vInt3)
							vUltimateListView1.Initialize(0, 0, "", "ULV")
							vUltimateListView1.FastScroller(True)
							vUltimateListView1.DividerHeight = 0
							Dim ultimateListViewWrapper5 As UltimateListView = vUltimateListView1
							vUltimateListView1.SetStyle(2)
							Dim length2 As Byte = vIntArr1.Length
							vUltimateListView1.AddRowLayout("ROW", "Cell_RowLayoutCreator", "Cell_RowContentFiller", vInt4, length2, vIntArr1, vInt5, -7829368, True)
							pLista.AddView(vUltimateListView1, 0, vInt3, vInt6, pLista.Height - vInt3)
							vUltimateListView1.Initialize(0, 0, "", "ULV")
							vUltimateListView1.FastScroller(True)
							vUltimateListView1.DividerHeight = 0
							Dim ultimateListViewWrapper8 As UltimateListView = vUltimateListView1
							vUltimateListView1.SetStyle(2)
							Dim length3 As Byte = vIntArr1.Length
							vUltimateListView1.AddRowLayout("ROW", "Cell_RowLayoutCreator", "Cell_RowContentFiller", vInt4, length3, vIntArr1, vInt5, -7829368, True)
							pLista.AddView(vUltimateListView1, 0, vInt3, vInt6, pLista.Height - vInt3)
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
							DoEvents
							vLst1.Initialize
							vBln1 = False
							Dim buttonWrapper As Button = bNew
							If Main.v_attivaterminale Then
								If Not(Main.v_solovenduto) Then
									z2 = True
									buttonWrapper.Enabled = Not(z2)
									Dim phone As Phone = Main.vPhone1
									Phone.SetScreenBrightness(Main.v_screenbrightness)
									Return
								End If
							End If
							z2 = False
							buttonWrapper.Enabled = Not(z2)
							Dim phone2 As Phone = Main.vPhone1
							Phone.SetScreenBrightness(Main.v_screenbrightness)
							Return
						End If
					Loop
				End If
			Loop
		End If
	End If
	Activity.Finish
End Sub

Sub Activity_KeyPress(i As Int) As Boolean
	mod1.vStr2 = "Sub Activity_KeyPress(KeyCode As Int) As Boolean"
	Try
		If i <> 4 Then
			Return True
		End If
		ToastMessageShow("Non consentito", False)
		Return True
	Catch
		mod1.Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Activity_Pause(z As Boolean)
	If Not(mod1.vBln9) And Not(vBln1) Then
		mod1.vBln4 = True
		mod1.Sub220(False)
		mod1.vBln1 = True
		Activity.Finish
		ExitApplication
	End If
End Sub

Sub Activity_Resume
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			mod1.vStr2 = "Activity_Resume"
			Try
				Sub039()
				Sub002("Descrizione")
				mod1.Sub081
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Sub001(buttonWrapper As Button, str As String, str2 As String)
	Dim vAppend As CSBuilder = vCSBuilder1.Initialize.Size(16).Append(str)
	vAppend.Color(-65536).Append(str2)
	buttonWrapper.Text = vCSBuilder1.PopAll
End Sub

Sub Alim_Click
	Dim vTmp As Int = vcustomlistviewold3.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(6)
	Dim labelWrapper2 As Label = getpanel.GetView(1)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from MPLimitiRicompense where chiave=" & labelWrapper.Text)
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Dim str As String = "Indicare il valore in €"
		If Not(vBln3) Then
			str = "Indicare il numero di pezzi"
		End If
		Dim str2 As String = str & " per il fine soglia"
		If vBln3 Then
			Dim inputDialog2 As InputDialog = vDlg1
			vDlg1.InputType = 12290
		Else
			Dim inputDialog4 As InputDialog = vDlg1
			vDlg1.InputType = 2
		End If
		vDlg1.Input = ""
		vDlg1.Hint = str
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim vObjectToString As String = IIf(cursorWrapper2.GetInt("FineLR") = 99999999, "Ultima soglia", "")
		Dim vShow As Int = vDlg1.Show(str2, Main.vStr8, "Ok", "Annulla", vObjectToString, Main.vBmp1)
		If vShow <> -3 Then
			If vShow = -2 Then
				vDlg1.Input = "99999999"
			End If
			If Not(IsNumber(vDlg1.Input)) Then
				Return
			End If
			Dim parseDouble As Int = vDlg1.Input
			If parseDouble <= cursorWrapper2.GetInt("InizioLR") Or parseDouble < 0 Then
				Dim vObjectToCharSequence As Object = "Il valore inserito non è valido"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & " " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "and FineLR > " & SmartStringFormatter("", cursorWrapper2.GetInt("FineLR")) & "") > 0 Then
					If parseDouble >= Main.vSql1.ExecQuerySingleResult("Select min(FineLR) from MPLimitiRicompense " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & " " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "and FineLR > " & SmartStringFormatter("", cursorWrapper2.GetInt("FineLR")) & "") Then
						Dim vObjectToCharSequence3 As Object = "Il valore è più alto del valore di fine della soglia successiva"
						Dim vObjectToCharSequence4 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
						Return
					End If
				End If
				Main.vSql1.ExecNonQuery("Update MPLimitiRicompense set " & CRLF & TAB & TAB & TAB & TAB & " " & TAB & TAB & TAB & TAB & TAB & "FineLR=" & SmartStringFormatter("", vDlg1.Input) & "  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where chiave=" & SmartStringFormatter("", labelWrapper.Text) & " ")
				labelWrapper2.Text = "a " & Sub035(vDlg1.Input)
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & " and FineLR=99999999") = 0 Then
					Dim cursorWrapper3 As Cursor
					Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & " order by FineLR desc limit 1")
					cursorWrapper4.Position = 0
					Main.vSql1.ExecNonQuery("insert into MPLimitiRicompense(Codice," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "InizioLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "FineLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "PassoLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ValoreLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "SegnoLR," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " values('" & SmartStringFormatter("", cursorWrapper4.GetString("Codice")) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "'" & SmartStringFormatter("", cursorWrapper4.GetString("CodiceCondizione")) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", cursorWrapper4.GetString("FineLR")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", 99999999) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", cursorWrapper4.GetString("PassoLR")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", cursorWrapper4.GetString("ValoreLR")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "'" & SmartStringFormatter("", cursorWrapper4.GetString("SegnoLR")) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", cursorWrapper4.GetString("Priorita")) & ")")
				Else
					Main.vSql1.ExecNonQuery("update MPLimitiRicompense set " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "InizioLR=" & SmartStringFormatter("", vDlg1.Input) & " " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & " and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "InizioLR = " & SmartStringFormatter("", cursorWrapper2.GetString("FineLR")) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " ")
				End If
				Sub043()
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub Alim_LongClick
	Sub065(Sender, Sub019("aLim"))
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub bAddModNew(bnewoff As Boolean, codoff As String)
	Dim detailsdialog As CustomLayoutDialog
	Dim stmp As String
	Dim sf As Object
	Dim pnl As Panel
	Dim tmpcurs As Cursor
	Dim stmpdes As String
	Dim lineaindex As Int
	Dim res As Int
	Dim tmpdescrizioneiniziativa As String
	Dim tmpscodelemento As String
	Dim indexlinea As Int
	Dim tmpslinea As String
	Dim listofmaps As List
	Dim mapinz As Map
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				'detailsdialog = CustomLayoutDialog
				stmp = "Dati per l'inserimento dell'offerta " & codoff
				Continue
			Case 1
				rsState = 6
				If bnewoff Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 6
				stmp = "Dati per la modifica dell'offerta " & codoff
				Continue
			Case 6
				rsState = 7
				Dim customLayoutDialog As CustomLayoutDialog = detailsdialog
				Dim str As String = stmp
				sf = customLayoutDialog.ShowAsync(str, "Ok", "Annulla", "", Main.vBmp1, True)
				detailsdialog.SetSize(PerXToCurrent(60), PerYToCurrent(90))
				Wait For (sf) Dialog_Ready (wf101_0 As Panel)
				rsState = 101
				Continue
			Case 7
				rsState = 72
				If bnewoff Then
					rsState = 9
					Continue
				Else
					rsState = 11
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 72
				inzDescrizione.Text = "Inserire qui la descrizione per l'offerta "
				inzDescrizione.Tag = ""
				inzElementoScontrino.Text = "Elemento scontrino: Scontrino"
				inzElementoScontrino.Tag = "SCO"
				inzCodElementoScontrino.Text = "Codice Elemento scontrino: NESSUNO"
				inzCodElementoScontrino.Tag = "-1"
				inzLinea.Text = "Offerta attiva per : " & vLst4.Get(0)
				inzLinea.Tag = 0
				inzDaData.Text = "Offerta attiva dal : " & Sub006(vStr4)
				inzDaData.Tag = vStr4
				inzAData.Text = "Offerta attiva fino al : " & Sub006(vStr4)
				inzAData.Tag = vStr4
				inzDaOra.Text = "Offerta attiva dalle : 00:00"
				inzDaOra.Tag = "0000"
				inzAOra.Text = "Offerta attiva fino alle : 23:59"
				inzAOra.Tag = "2359"
				inzGiorni.Text = "Giorni della settimana in cui l'offerta è attiva"
				inzGiorni.Tag = "1111111"
				inzEsclusivita.Text = "Una volta eseguita questa offerta prosegui con le altre"
				inzEsclusivita.Tag = "C"
				inzPriorita.Text = "Indice di priorità offerta : 100"
				inzPriorita.Tag = 100
				inzEsclutiNF.Text = "Escludi gli articoli non fiscali dall'offerta"
				inzEsclutiNF.Tag = "1"
				inzLimitaRicompense.Text = "Applica tutte le ricompense "
				inzLimitaRicompense.Tag = 0
				Continue
			Case 11
				rsState = 12
				'tmpcurs = Cursor
				Dim cursorWrapper As Cursor
				tmpcurs = Main.vSql1.ExecQuery("select * from MPIniziative where Codice='" & SmartStringFormatter("", codoff) & "'")
				Continue
			Case 12
				rsState = 71
				If tmpcurs.RowCount <= 0 Then
					Continue
				Else
					rsState = 14
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 14
			Case 14
				rsState = 15
				tmpcurs.Position = 0
				Continue
			Case 15
				rsState = 20
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPTitoloIniziative where codice ='" & codoff & "'") > 0 Then
					rsState = 17
					Continue
				Else
					rsState = 19
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 17
			Case 17
				rsState = 20
				stmpdes = Main.vSql1.ExecQuerySingleResult("Select Descrizione from MPTitoloIniziative where codice ='" & codoff & "'")
				Sub001(inzDescrizione, "Descrizione offerta: ", stmpdes)
				inzDescrizione.Tag = stmpdes
				Continue
			Case 19
				rsState = 20
				inzDescrizione.Text = "Inserire qui la descrizione per l'offerta "
				inzDescrizione.Tag = ""
				Continue
			Case 20
				rsState = 21
				Sub001(inzElementoScontrino, "Elemento scontrino: ", Sub027(tmpcurs.GetString("ElementoScontrino")))
				inzElementoScontrino.Tag = tmpcurs.GetString("ElementoScontrino")
				Continue
			Case 21
				rsState = 52
				If tmpcurs.GetString("CodElementoScontrino") = "" Then
					rsState = 23
					Continue
				Else
					rsState = 25
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 23
			Case 23
				rsState = 52
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino:", " NESSUNO")
				inzCodElementoScontrino.Tag = "-1"
				Continue
			Case 25
				rsState = 26
				Continue
			Case 26
				rsState = 51
				Select inzElementoScontrino.Tag
					Case "ART"
						rsState = 28
					Case "REP"
						rsState = 36
					Case "GRP"
						rsState = 44
				End Select
				'(fallthrough java verso il case successivo)
				rsState = 28
			Case 28
				rsState = 29
				inzCodElementoScontrino.Tag = tmpcurs.GetString("CodElementoScontrino")
				Continue
			Case 29
				rsState = 34
				If inzCodElementoScontrino.Tag <> "" Then
					If IsNumber(inzCodElementoScontrino.Tag) Then
						If inzCodElementoScontrino.Tag < 0 Then
						End If
					End If
					rsState = 33
					Continue
				End If
				rsState = 31
				Continue
			Case 31
				rsState = 34
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", "NESSUNO")
				Continue
			Case 33
				rsState = 34
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", inzCodElementoScontrino.Tag)
				Continue
			Case 34
				rsState = 51
				Continue
			Case 36
				rsState = 37
				inzCodElementoScontrino.Tag = tmpcurs.GetString("CodElementoScontrino")
				Continue
			Case 37
				rsState = 42
				If inzCodElementoScontrino.Tag < 0 Then
					rsState = 39
					Continue
				Else
					rsState = 41
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 39
			Case 39
				rsState = 42
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino:", " NESSUNO")
				Continue
			Case 41
				rsState = 42
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", vLst2.Get(inzCodElementoScontrino.Tag))
				Continue
			Case 42
				rsState = 51
				Continue
			Case 44
				rsState = 45
				inzCodElementoScontrino.Tag = tmpcurs.GetString("CodElementoScontrino")
				Continue
			Case 45
				rsState = 50
				If inzCodElementoScontrino.Tag < 0 Then
					rsState = 47
					Continue
				Else
					rsState = 49
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 47
			Case 47
				rsState = 50
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino:", " NESSUNO")
				Continue
			Case 49
				rsState = 50
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", vLst3.Get(inzCodElementoScontrino.Tag))
				Continue
			Case 50
				rsState = 51
				Continue
			Case 51
				rsState = 52
				Continue
			Case 52
				rsState = 53
				lineaindex = vMap1.GetDefault(tmpcurs.GetString("Linea"), 0)
				Sub001(inzLinea, "Offerta attiva per : ", vLst4.Get(lineaindex))
				inzLinea.Tag = lineaindex
				Sub001(inzDaData, "Offerta attiva dal : ", Sub006(tmpcurs.GetString("DataInizio")))
				inzDaData.Tag = tmpcurs.GetString("DataInizio")
				Sub001(inzAData, "Offerta attiva fino al : ", Sub006(tmpcurs.GetString("DataFine")))
				inzAData.Tag = tmpcurs.GetString("DataFine")
				Sub001(inzDaOra, "Offerta attiva dalle : ", tmpcurs.GetString("OraInizio").SubString2(0, 2) & ":" & tmpcurs.GetString("OraInizio").SubString2(2, 4))
				inzDaOra.Tag = tmpcurs.GetString("OraInizio")
				Sub001(inzAOra, "Offerta attiva fino alle : ", tmpcurs.GetString("OraFine").SubString2(0, 2) & ":" & tmpcurs.GetString("OraFine").SubString2(2, 4))
				inzAOra.Tag = tmpcurs.GetString("OraFine")
				inzGiorni.Text = "Giorni della settimana in cui l'offerta è attiva"
				inzGiorni.Tag = tmpcurs.GetString("GiorniValidita")
				Continue
			Case 53
				rsState = 58
				If tmpcurs.GetString("Esclusivita") = "F" Then
					rsState = 55
					Continue
				Else
					rsState = 57
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 55
			Case 55
				rsState = 58
				inzEsclusivita.Text = "Una volta eseguita questa offerta non eseguire altre offerte"
				Continue
			Case 57
				rsState = 58
				inzEsclusivita.Text = "Una volta eseguita questa offerta prosegui con le altre"
				Continue
			Case 58
				rsState = 59
				inzEsclusivita.Tag = tmpcurs.GetString("Esclusivita")
				Sub001(inzPriorita, "Indice di priorità offerta : ", tmpcurs.GetString("Priorita"))
				inzPriorita.Tag = tmpcurs.GetInt("Priorita")
				Continue
			Case 59
				rsState = 64
				If tmpcurs.GetString("AmountType") = "0" Then
					rsState = 61
					Continue
				Else
					rsState = 63
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 61
			Case 61
				rsState = 64
				inzEsclutiNF.Text = "Non escludere gli articoli non fiscali dall'offerta"
				Continue
			Case 63
				rsState = 64
				inzEsclutiNF.Text = "Escludi gli articoli non fiscali dall'offerta"
				Continue
			Case 64
				rsState = 65
				inzEsclutiNF.Tag = tmpcurs.GetString("AmountType")
				Continue
			Case 65
				rsState = 70
				If tmpcurs.GetInt("limita") = 0 Then
					rsState = 67
					Continue
				Else
					rsState = 69
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 67
			Case 67
				rsState = 70
				inzLimitaRicompense.Text = "Applica tutte le ricompense "
				Continue
			Case 69
				rsState = 70
				inzLimitaRicompense.Text = "Limita le ricompense al numero di vincoli superati"
				Continue
			Case 70
				rsState = 71
				inzLimitaRicompense.Tag = tmpcurs.GetString("limita")
				Continue
			Case 71
				rsState = 72
				Continue
			Case 72
				rsState = 73
				Wait For (sf) Dialog_Result (wf102_0 As Int)
				rsState = 102
				Continue
			Case 73
				rsState = 100
				Dim i As Int = res
				If i <> -1 Then
					Continue
				Else
					rsState = 75
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 75
			Case 75
				rsState = 76
				tmpdescrizioneiniziativa = "Offerta numero " & codoff
				Continue
			Case 76
				rsState = 81
				If inzDescrizione.Tag <> "" Then
					rsState = 78
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 78
			Case 78
				rsState = 81
				tmpdescrizioneiniziativa = inzDescrizione.Tag
				Continue
			Case 81
				rsState = 82
				Continue
			Case 82
				rsState = 85
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPTitoloIniziative where codice ='" & codoff & "'") <= 0 Then
					Continue
				Else
					rsState = 84
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 84
			Case 84
				rsState = 85
				Main.vSql1.ExecNonQuery("delete from MPTitoloIniziative where codice ='" & codoff & "'")
				Continue
			Case 85
				rsState = 86
				Main.vSql1.ExecNonQuery("insert into MPTitoloIniziative([Codice]" & TAB & ",[Descrizione]) values('" & codoff & "','" & tmpdescrizioneiniziativa & "')")
				tmpscodelemento = inzCodElementoScontrino.Tag
				Continue
			Case 86
				rsState = 91
				If inzElementoScontrino.Tag <> "SCO" And tmpscodelemento <> "-1" Then
					Continue
				Else
					rsState = 88
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 88
			Case 88
				rsState = 91
				tmpscodelemento = ""
				Continue
			Case 91
				rsState = 92
				indexlinea = inzLinea.Tag
				tmpslinea = Sub020(indexlinea)
				'listofmaps = List
				listofmaps.Initialize
				'mapinz = Map
				mapinz.Initialize
				Dim map As Map = mapinz
				map.Put("ElementoScontrino", inzElementoScontrino.Tag)
				mapinz.Put("CodElementoScontrino", tmpscodelemento)
				mapinz.Put("Codice", codoff)
				mapinz.Put("ApplicazioneSconti", "0")
				mapinz.Put("Linea", tmpslinea)
				Dim map2 As Map = mapinz
				map2.Put("DataInizio", inzDaData.Tag)
				Dim map3 As Map = mapinz
				map3.Put("OraInizio", inzDaOra.Tag)
				Dim map4 As Map = mapinz
				map4.Put("DataFine", inzAData.Tag)
				Dim map5 As Map = mapinz
				map5.Put("OraFine", inzAOra.Tag)
				Dim map6 As Map = mapinz
				map6.Put("GiorniValidita", inzGiorni.Tag)
				Dim map7 As Map = mapinz
				map7.Put("Esclusivita", inzEsclusivita.Tag)
				mapinz.Put("CodiceCondizione", "123")
				mapinz.Put("Applicazione", "R")
				Dim map8 As Map = mapinz
				map8.Put("Priorita", inzPriorita.Tag)
				Dim map9 As Map = mapinz
				map9.Put("AmountType", inzEsclutiNF.Tag)
				Dim map10 As Map = mapinz
				map10.Put("limita", inzLimitaRicompense.Tag)
				Continue
			Case 92
				rsState = 95
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPIniziative where codice ='" & codoff & "'") <= 0 Then
					Continue
				Else
					rsState = 94
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 94
			Case 94
				rsState = 95
				Main.vSql1.ExecNonQuery("delete from MPIniziative   where codice ='" & codoff & "'")
				Continue
			Case 95
				rsState = 96
				listofmaps.Add(mapinz)
				dbutil.Sub007(Main.vSql1, "MPIniziative", listofmaps)
				Edt1.Text = codoff
				vInt2 = m_rcodice
				imericerca_handleaction()
				Continue
			Case 96
				rsState = 99
				If bnewoff And codoff > 0 Then
					rsState = 98
					Continue
				End If
				Continue
			Case 98
				rsState = 99
				codoff = codoff + 1
				Main.vSql1.ExecNonQuery("update progressivi set valore =" & codoff & " where codice ='Z'")
				Continue
			Case 99
				rsState = 100
				Continue
			Case 100
				rsState = -1
				Continue
			Case 101
				rsState = 7
				pnl = wf101_0
				pnl.LoadLayout("schedainz")
				mod1.Sub081
				Continue
			Case 102
				rsState = 73
				res = wf102_0
				Continue
		End Select
	Loop
End Sub

Sub Dialog_Ready(panelWrapper As Panel)
End Sub

Sub Dialog_Result(i As Int)
End Sub

Sub BChiudi_Click
	vBln1 = True
	Main.vBln32 = False
	vIME1.HideKeyboard
	Sub005()
	mod1.Sub198("Main")
	Activity.Finish
End Sub

Sub bGruppiRicompense_Click
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("Inserisci nuovo gruppo", "Visualizza gruppi", "Modifica gruppo", "Elimina gruppo", "Chiudi")))
	Dim vInputList As Int = InputList(list, "Gestione Gruppo Ricompense per l'offerta attiva", -1)
	If vInputList < 0 Then
		Return
	End If
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from MPRicompenseGruppi where Codice ='" & SmartStringFormatter("", vStr1) & "'")
	If vInputList = 0 Then
		Do While True
			Dim numberDialog As NumberDialog
			numberDialog.Digits = 5
			numberDialog.Number = 0
			numberDialog.Decimal = 0
			numberDialog.ShowSign = False
			Dim vShow As Int = numberDialog.Show("Inserire il nuovo codice gruppo per questa offerta", "Ok", "Annulla", "", Main.vBmp1)
			If vShow <> -1 Then
				Exit
			End If
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPRicompenseGruppi where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " Codice ='" & SmartStringFormatter("", vStr1) & "' and CodiceGruppoRicompensa ='" & SmartStringFormatter("", numberDialog.Number) & "'") > 0 Then
				Dim vObjectToCharSequence As Object = "Il gruppo ricompensa " & numberDialog.Number & " risulta essere già inserito per l'offerta " & vStr1
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else
				Dim vNumberToString As String = numberDialog.Number
				numberDialog.Digits = 5
				numberDialog.Number = 999
				numberDialog.Decimal = 0
				numberDialog.ShowSign = False
				Dim vShow2 As Int = numberDialog.Show("Inserire il limite massimo di articoli di questo gruppo che potranno ottenere la ricompensa", "Ok", "", "", Main.vBmp1)
				Dim number As Int = IIf(vShow2 = -1, numberDialog.Number, 999)
				If number <= 0 Then
					number = 999
				End If
				Main.vSql1.ExecNonQuery("INSERT INTO [MPRicompenseGruppi]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "([Codice]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[CodiceCondizione]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[CodiceGruppoRicompensa]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[NumeroRicompenseGruppo])" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "VALUES" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "('" & SmartStringFormatter("", vStr1) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & ",'123'" & CRLF & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", vNumberToString) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "," & SmartStringFormatter("", number) & ")" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB)
				Dim vObjectToCharSequence3 As Object = "Gruppo inserito correttamente"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			End If
		Loop
	Else If vInputList = 1 Then
		If cursorWrapper2.RowCount > 0 Then
			InputList(Sub021(cursorWrapper2), "Elenco gruppi offerta attiva", -1)
		End If
	Else If vInputList = 2 Then
		If cursorWrapper2.RowCount > 0 Then
			Dim vInputList2 As Int = InputList(Sub021(cursorWrapper2), "Selezionare il gruppo da modificare", -1)
			If vInputList2 < 0 Then
				Return
			End If
			cursorWrapper2.Position = vInputList2
			Dim vGetString As String = cursorWrapper2.GetString("CodiceGruppoRicompensa")
			Dim numberDialog2 As NumberDialog
			numberDialog2.Digits = 5
			numberDialog2.Number = cursorWrapper2.GetInt("NumeroRicompenseGruppo")
			numberDialog2.Decimal = 0
			numberDialog2.ShowSign = False
			Dim vShow3 As Int = numberDialog2.Show("Inserire il limite massimo di articoli di questo gruppo che potranno ottenere la ricompensa", "Ok", "", "", Main.vBmp1)
			Dim number2 As Int = IIf(vShow3 = -1, numberDialog2.Number, 999)
			Dim i As Int = IIf(number2 > 0, number2, 999)
			Main.vSql1.ExecNonQuery("update [MPRicompenseGruppi] set" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "[NumeroRicompenseGruppo] =" & SmartStringFormatter("", i) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where " & CRLF & TAB & TAB & TAB & "[Codice]='" & SmartStringFormatter("", vStr1) & "' and" & CRLF & TAB & TAB & TAB & "[CodiceCondizione]='123' and" & CRLF & TAB & TAB & TAB & "[CodiceGruppoRicompensa] ='" & SmartStringFormatter("", vGetString) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB)
			Dim vObjectToCharSequence5 As Object = "Gruppo modificato correttamente"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		Else
			Dim vObjectToCharSequence7 As Object = "Nessun gruppo da modificare"
			Dim vObjectToCharSequence8 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
		End If
	Else If vInputList = 3 Then
		If cursorWrapper2.RowCount > 0 Then
			Dim vInputList3 As Int = InputList(Sub021(cursorWrapper2), "Selezionare il gruppo da eliminare", -1)
			If vInputList3 < 0 Then
				Return
			End If
			cursorWrapper2.Position = vInputList3
			Dim vObjectToCharSequence9 As Object = "Confermi la cancellazione del gruppo ?"
			Dim vObjectToCharSequence10 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "Si", "", "No", Main.vBmp1)
			If vMsgbox2 = -1 Then
				Main.vSql1.ExecNonQuery("delete from [MPRicompenseGruppi] where" & CRLF & TAB & TAB & TAB & TAB & "[Codice]='" & SmartStringFormatter("", vStr1) & "' and" & CRLF & TAB & TAB & TAB & TAB & "[CodiceCondizione]='123' and" & CRLF & TAB & TAB & TAB & TAB & "[CodiceGruppoRicompensa] ='" & SmartStringFormatter("", cursorWrapper2.GetString("CodiceGruppoRicompensa")) & "'")
				Dim vObjectToCharSequence11 As Object = "Gruppo eliminato correttamente"
				Dim vObjectToCharSequence12 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
			End If
		Else
			Dim vObjectToCharSequence13 As Object = "Nessun gruppo da eliminare"
			Dim vObjectToCharSequence14 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
		End If
	End If
	cursorWrapper2.Close
	mod1.Sub081
End Sub

Sub bGruppiRicompense_LongClick
	Sub065(Sender, Sub019("bGruppiRicompense"))
End Sub

Sub Sub002(str As String)
	mod1.vStr2 = "Sub bM_Click"
	Try
		Edt1.Visible = True
		Select str
			Case "Tutti"
				Edt1.Visible = False
				pLista.Visible = True
				vInt2 = m_rtutti
				Edt1.Text = ""
				imericerca_handleaction()
			Case "Codice"
				pLista.Visible = True
				vInt2 = m_rcodice
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				Edt1.Hint = "Inserire il codice"
				vIME1.ShowKeyboard(Edt1)
			Case "Descrizione"
				pLista.Visible = True
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				vInt2 = m_rdescrizione
				Edt1.Hint = "Inserire la Descrizione "
				vIME1.ShowKeyboard(Edt1)
		End Select
		mod1.Sub081
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub bMsgStampa_Click
	Sub015()
End Sub

Sub bMsgStampa_LongClick
	Sub065(Sender, Sub019("bMsgStampa"))
End Sub

Sub bMsgVisualizza_Click
	Sub016()
End Sub

Sub bMsgVisualizza_LongClick
	Sub065(Sender, Sub019("bMsgVisualizza"))
End Sub

Sub bNew_Click
	Sub042()
	mod1.Sub081
End Sub

Sub bNew_LongClick
	Sub065(Sender, Sub019("bNew"))
End Sub

Sub bNewRicompensa_Click
	If pnlLimiti.Visible Then
		Return
	End If
	Dim vObjectToCharSequence As Object = "Confermi l'inserimento di una nuova ricompensa ? "
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Dim list As List
		list.Initialize
		Dim map As Map
		map.Initialize
		map.Put("Codice", vStr1)
		map.Put("CodiceCondizione", "123")
		map.Put("VeriabileRicompensa", "SCO")
		map.Put("ElementoRicompensa", "")
		map.Put("SogliaRicompensa", "0")
		map.Put("TipoRicompensa", "SV")
		map.Put("CodiceMessaggioCoupon", "")
		map.Put("Priorita", 1)
		map.Put("GruppoOrdinamentoRicompensa", "0")
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "MPRicompense", list)
		list.Initialize
		map.Initialize
		map.Put("Codice", vStr1)
		map.Put("CodiceCondizione", "123")
		map.Put("InizioLR", 0)
		map.Put("FineLR", 99999999)
		map.Put("PassoLR", 1)
		map.Put("ValoreLR", 1)
		map.Put("SegnoLR", "+")
		map.Put("Priorita", 1)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "MPLimitiRicompense", list)
		Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select max(chiave) from MPRicompense")
		Dim parseDouble2 As Int = Main.vSql1.ExecQuerySingleResult("select max(chiave) from MPLimitiRicompense")
		Main.vSql1.ExecNonQuery("update MPRicompense set priorita =" & parseDouble & " where chiave = " & parseDouble)
		Main.vSql1.ExecNonQuery("update MPLimitiRicompense set priorita =" & parseDouble & " where chiave = " & parseDouble2)
		Sub044(vStr1, " order by chiave", True)
		If vPnl1.IsInitialized Then
			If Sub060(vPnl1.GetView(0)) <= 0 Or Not(Sub061(vPnl1.GetView(1))) Then
				Main.vSql1.ExecNonQuery("delete from MPRicompense where chiave= " & parseDouble)
				Main.vSql1.ExecNonQuery("delete from MPLimitiRicompense where chiave= " & parseDouble2)
				Sub044(vStr1, " order by chiave", False)
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub bNewRicompensa_LongClick
	Sub065(Sender, Sub019("bNewRicompensa"))
End Sub

Sub bNewVincolo_Click
	Dim vObjectToCharSequence As Object = "Confermi l'inserimento di un nuovo vincolo ? "
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Dim list As List
		list.Initialize
		Dim map As Map
		map.Initialize
		map.Put("Codice", vStr1)
		map.Put("CodiceCondizione", "123")
		map.Put("OggettoVincolo", "SCO")
		map.Put("ElementoVincolo", "")
		map.Put("OperatoreVincolo", "GQ")
		map.Put("ModalitaConfrontoVincolo", "V")
		map.Put("ConfrontoVincolo", 0)
		list.Add(map)
		dbutil.Sub007(Main.vSql1, "MPVincoli", list)
		Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select max(chiave) from MPVincoli")
		Main.vSql1.ExecNonQuery("update MPVincoli set GruppoVincolo =" & parseDouble & " where chiave = " & parseDouble)
		Sub045(vStr1, " order by chiave", True)
		If vPnl1.IsInitialized Then
			If IIf(Sub057(vPnl1.GetView(0)) And Sub062(vPnl1.GetView(1)), False, True) Then
				Main.vSql1.ExecNonQuery("delete from MPVincoli where chiave= " & parseDouble)
				Sub045(vStr1, " order by chiave", False)
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub bNewVincolo_LongClick
	Sub065(Sender, Sub019("bNewVincolo"))
End Sub

Sub Buttonfun_Click
	mod1.vStr2 = "  Sub buttonFun_Click"
	Try
		Sub054(Sender)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Buttonfun_LongClick
	mod1.vStr2 = "  Sub buttonFun_Click"
	Try
		Dim imageViewWrapper As ImageView = Sender
		If Main.vBln32 Then
			Sub054(imageViewWrapper)
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub cell_rowcontentfiller(j As Long, str As String, panelWrapper As Panel, b As Byte, i As Int)
	Try
		If i Mod 2 = 0 Then
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
					Dim cursorWrapper As Cursor
					vCur1 = Main.vSql1.ExecQuery("SELECT * from sortedMPIniziative  WHERE rowid=" & 1 + j)
					vCur1.Position = 0
					labelWrapper.Text = vCur1.GetString("Codice")
				Case 2
					labelWrapper.Text = vCur1.GetString("Descrizione")
				Case 3
					labelWrapper.Text = Sub027(vCur1.GetString("ElementoScontrino"))
				Case 4
					labelWrapper.Text = vCur1.GetString("DataInizio").SubString2(6, 8) & "/" & vCur1.GetString("DataInizio").SubString2(4, 6) & "/" & vCur1.GetString("DataInizio").SubString2(0, 4)
				Case 5
					labelWrapper.Text = vCur1.GetString("DataFine").SubString2(6, 8) & "/" & vCur1.GetString("DataFine").SubString2(4, 6) & "/" & vCur1.GetString("DataFine").SubString2(0, 4)
			End Select
			labelWrapper.Tag = j
			Return
		End If
		panelWrapper.GetView(0).Tag = j
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub cell_rowlayoutcreator(str As String, panelWrapper As Panel, b As Byte)
	If b = 6 Then
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("buttonFun")
		If Main.vBln32 Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "012.png")
		Else
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "030.png")
		End If
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

Sub Sub003(str As String) As Boolean
	Return Not(str = "LQ" Or str = "AQ")
End Sub

Sub Sub004(str As String) As Boolean
	Return str = "SQ" Or str = "BQ" Or str = "SV" Or str = "EV" Or str = "BV" Or str = "uV" Or str = "MO" Or str = "MS" Or str = "CV"
End Sub

Sub Sub005
	If vCur1.IsInitialized Then
		vCur1.Close
	End If
	If vCur2.IsInitialized Then
		vCur2.Close
	End If
	Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
End Sub

Sub Sub006(str As String) As String
	Return str.SubString(6) & "/" & str.SubString2(4, 6) & "/" & str.SubString2(0, 4)
End Sub

Sub Sub007
	Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedMPIniziative")
	Main.vSql1.ExecNonQuery("CREATE TEMP TABLE sortedMPIniziative (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Descrizione]  nvarchar(50) NOT NULL DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[ElementoScontrino] nvarchar(5) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodElementoScontrino] nvarchar(20) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[DataInizio] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[DataFine] nvarchar(10) NOT NULL DEFAULT ''" & CRLF & TAB & TAB & TAB & TAB & TAB & ")")
End Sub

Sub Sub008(cursorWrapper As Cursor, i As Int, str As String) As Panel
	mod1.vStr2 = "Sub CreateListItemL(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		Dim labelWrapper As Label
		labelWrapper.Initialize("DaLim")
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.Text = "Da " & Sub035(cursorWrapper.GetString("InizioLR"))
		labelWrapper.TextSize = 14
		labelWrapper.Enabled = cursorWrapper.GetString("chiave") = str
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = mod1.Sub155(-1, 0)
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("aLim")
		labelWrapper2.Gravity = Bit.Or(16, 1)
		labelWrapper2.Text = "a " & Sub035(cursorWrapper.GetString("FineLR"))
		labelWrapper2.TextSize = 14
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(-2631721, 0)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("OgniLim")
		labelWrapper3.Gravity = Bit.Or(16, 1)
		labelWrapper3.Text = "Ogni " & Sub035(cursorWrapper.GetString("PassoLR"))
		If labelWrapper3.Text = "Ogni 0.00 €" Then
			labelWrapper3.Text = "Raggiunta la fascia"
		End If
		labelWrapper3.TextSize = 14
		labelWrapper3.TextColor = -16777216
		labelWrapper3.Background = mod1.Sub155(-5000269, 0)
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("ValoreLim")
		labelWrapper4.Gravity = Bit.Or(16, 1)
		labelWrapper4.Text = Sub031(cursorWrapper.GetString("ValoreLR"))
		labelWrapper4.Enabled = Not(vCur4.GetString("TipoRicompensa") = "MO" Or vCur4.GetString("TipoRicompensa") = "MS" Or vCur4.GetString("TipoRicompensa") = "MQ" Or vCur4.GetString("TipoRicompensa") = "mq")
		labelWrapper4.TextSize = 14
		labelWrapper4.TextColor = -16777216
		labelWrapper4.Background = mod1.Sub155(-7039852, 0)
		Dim labelWrapper5 As Label
		labelWrapper5.Initialize("SegnoLim")
		labelWrapper5.Gravity = Bit.Or(16, 1)
		labelWrapper5.Text = cursorWrapper.GetString("SegnoLR")
		If vCur4.GetString("TipoRicompensa") = "AQ" Then
			Dim str2 As String = "100% di sconto"
			If IsNumber(cursorWrapper.GetString("SegnoLR")) And cursorWrapper.GetInt("SegnoLR") >= 0 And cursorWrapper.GetInt("SegnoLR") <= 100 Then
				str2 = cursorWrapper.GetString("SegnoLR") & "% di sconto"
			End If
			labelWrapper5.Text = str2
			labelWrapper5.TextSize = 14
		Else
			labelWrapper5.TextSize = 20
		End If
		labelWrapper5.Enabled = vCur4.GetString("TipoRicompensa") = "EV" Or vCur4.GetString("TipoRicompensa") = "eQ" Or vCur4.GetString("TipoRicompensa") = "AQ"
		labelWrapper5.TextColor = -16777216
		labelWrapper5.Background = mod1.Sub155(-7039852, 0)
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("FunDelL")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "006.png")
		imageViewWrapper.Visible = cursorWrapper.GetInt("FineLR") = 99999999
		Dim labelWrapper6 As Label
		labelWrapper6.Initialize("")
		labelWrapper6.Text = cursorWrapper.GetString("chiave")
		labelWrapper6.Visible = False
		panelWrapper.AddView(labelWrapper, 0, DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(20), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(40), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper4, PerXToCurrent(60), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper5, PerXToCurrent(80), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(90), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(labelWrapper6, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
		vPnl1 = panelWrapper
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub009(cursorWrapper As Cursor, i As Int) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		Dim labelWrapper As Label
		labelWrapper.Initialize("Ricompensa")
		labelWrapper.Gravity = Bit.Or(16, 3)
		Dim vTmp As String = Sub027(cursorWrapper.GetString("VeriabileRicompensa"))
		If cursorWrapper.GetString("ElementoRicompensa") <> "" Then
			vTmp = vTmp & " codice " & cursorWrapper.GetString("ElementoRicompensa")
			Dim vTmp_ As String = Sub025(cursorWrapper.GetString("VeriabileRicompensa"), cursorWrapper.GetString("ElementoRicompensa"))
			If vTmp_ <> "" Then
				vTmp = vTmp & " (" & vTmp_ & ")"
			End If
		End If
		labelWrapper.Text = "Ricompensa su " & vTmp
		labelWrapper.TextSize = 14
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = mod1.Sub155(-1, 0)
		Dim str As String = Sub030(cursorWrapper.GetString("TipoRicompensa")) & " (" & IIf(cursorWrapper.GetString("SogliaRicompensa") = "1", "Irpef", "Normale") & ")"
		If cursorWrapper.GetString("CodiceMessaggioCoupon") <> "" Then
			If cursorWrapper.GetString("TipoRicompensa") = "MO" Or cursorWrapper.GetString("TipoRicompensa") = "MS" Or cursorWrapper.GetString("TipoRicompensa") = "mq" Or cursorWrapper.GetString("TipoRicompensa") = "MQ" Then
				str = str & CRLF & "Messaggio :" & cursorWrapper.GetString("CodiceMessaggioCoupon")
			Else If cursorWrapper.GetString("TipoRicompensa") = "uQ" Or cursorWrapper.GetString("TipoRicompensa") = "uV" Then
				str = str & CRLF & "Coupon:" & cursorWrapper.GetString("CodiceMessaggioCoupon")
			Else If cursorWrapper.GetString("TipoRicompensa") = "CQ" Or cursorWrapper.GetString("TipoRicompensa") = "CV" Then
				str = str & CRLF & "Macro:" & cursorWrapper.GetString("CodiceMessaggioCoupon")
			End If
		End If
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("TipoRicompensa")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.Text = str
		labelWrapper2.TextSize = 14
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(-2631721, 0)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("PrioritaRicompensa")
		labelWrapper3.Text = "Priorità : " & cursorWrapper.GetString("Priorita")
		labelWrapper3.TextSize = 14
		labelWrapper3.Gravity = Bit.Or(16, 3)
		labelWrapper3.TextColor = -16777216
		labelWrapper3.Background = mod1.Sub155(-5000269, 0)
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("GruppoRicompensa")
		labelWrapper4.Text = "Gruppo : " & cursorWrapper.GetString("GruppoOrdinamentoRicompensa")
		labelWrapper4.TextSize = 14
		labelWrapper4.Gravity = Bit.Or(16, 3)
		labelWrapper4.TextColor = -16777216
		labelWrapper4.Background = mod1.Sub155(-7039852, 0)
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("FunL")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "m_ordini.png")
		Dim imageViewWrapper2 As ImageView
		imageViewWrapper2.Initialize("FunM")
		imageViewWrapper2.Bitmap = LoadBitmap(File.DirAssets, "m_ingredienti.png")
		Dim imageViewWrapper3 As ImageView
		imageViewWrapper3.Initialize("FunR")
		imageViewWrapper3.Bitmap = LoadBitmap(File.DirAssets, "006.png")
		Dim labelWrapper5 As Label
		labelWrapper5.Initialize("")
		labelWrapper5.Text = cursorWrapper.GetString("chiave")
		labelWrapper5.Visible = False
		panelWrapper.AddView(labelWrapper, 0, DipToCurrent(2), PerXToCurrent(23), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(23), DipToCurrent(2), PerXToCurrent(23), i)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(46), DipToCurrent(2), PerXToCurrent(12), i)
		panelWrapper.AddView(labelWrapper4, PerXToCurrent(58), DipToCurrent(2), PerXToCurrent(12), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(70), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(imageViewWrapper2, PerXToCurrent(80), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(imageViewWrapper3, PerXToCurrent(90), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(labelWrapper5, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
		vPnl1 = panelWrapper
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub010(cursorWrapper As Cursor, i As Int) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(245, 245, 245)
	Try
		Dim labelWrapper As Label
		labelWrapper.Initialize("Vincolo")
		labelWrapper.Gravity = Bit.Or(16, 3)
		Dim vTmp As String = Sub027(cursorWrapper.GetString("OggettoVincolo"))
		If cursorWrapper.GetString("ElementoVincolo") <> "" Then
			vTmp = vTmp & " codice " & cursorWrapper.GetString("ElementoVincolo")
			Dim vTmp_ As String = Sub025(cursorWrapper.GetString("OggettoVincolo"), cursorWrapper.GetString("ElementoVincolo"))
			If vTmp_ <> "" Then
				vTmp = vTmp & " (" & vTmp_ & ")"
			End If
		End If
		labelWrapper.Text = "Vincolo su " & vTmp
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = mod1.Sub155(-1, 0)
		Dim str As String = IIf(cursorWrapper.GetString("ModalitaConfrontoVincolo").Contains("Q"), " la quantità è ", " il valore è ") & Sub029(cursorWrapper.GetString("OperatoreVincolo")) & cursorWrapper.GetString("ConfrontoVincolo") & IIf(cursorWrapper.GetString("ModalitaConfrontoVincolo").Contains("Q"), "", " €")
		If cursorWrapper.GetString("OggettoVincolo") = "COU" Then
			If cursorWrapper.GetString("ModalitaConfrontoVincolo").Contains("T") Then
				str = str & " e il totale scontrino è più alto del valore del coupon"
			End If
			If cursorWrapper.GetString("ModalitaConfrontoVincolo").Contains("N") Then
				str = str & " e il Coupon è stato emesso da questo negozio"
			End If
		End If
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("TipoVincolo")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		labelWrapper2.Text = " superato quando " & str
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(-2829100, 0)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("RaggruppamentoVincolo")
		labelWrapper3.Text = "Gruppo Vincolo = " & cursorWrapper.GetString("GruppoVincolo")
		labelWrapper3.TextSize = 16
		labelWrapper3.Gravity = Bit.Or(16, 3)
		labelWrapper3.TextColor = -16777216
		labelWrapper3.Background = mod1.Sub155(-5263441, 0)
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("FunV")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "006.png")
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("")
		labelWrapper4.Text = cursorWrapper.GetString("chiave")
		labelWrapper4.Visible = False
		panelWrapper.AddView(labelWrapper, 0, DipToCurrent(2), PerXToCurrent(28), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(28), DipToCurrent(2), PerXToCurrent(40), i)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(68), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i)
		panelWrapper.AddView(labelWrapper4, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
		vPnl1 = panelWrapper
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Dalim_Click
	Dim vTmp As Int = vcustomlistviewold3.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(6)
	Dim labelWrapper2 As Label = getpanel.GetView(0)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from MPLimitiRicompense where chiave=" & labelWrapper.Text)
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Dim str As String = "Indicare il valore in €"
		If Not(vBln3) Then
			str = "Indicare il numero di pezzi"
		End If
		Dim str2 As String = str & " per l'inizio soglia"
		If vBln3 Then
			Dim inputDialog2 As InputDialog = vDlg1
			vDlg1.InputType = 12290
		Else
			Dim inputDialog4 As InputDialog = vDlg1
			vDlg1.InputType = 2
		End If
		vDlg1.Input = ""
		vDlg1.Hint = str
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim vShow As Int = vDlg1.Show(str2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			If Not(IsNumber(vDlg1.Input)) Then
				Return
			End If
			Dim parseDouble As Int = vDlg1.Input
			If parseDouble >= cursorWrapper2.GetInt("FineLR") Or parseDouble < 0 Then
				Dim vObjectToCharSequence As Object = "Il valore inserito non è valido"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else
				Main.vSql1.ExecNonQuery("Update MPLimitiRicompense set " & CRLF & TAB & TAB & TAB & TAB & " " & TAB & TAB & TAB & TAB & TAB & "InizioLR=" & SmartStringFormatter("", vDlg1.Input) & "  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where chiave=" & SmartStringFormatter("", labelWrapper.Text) & " ")
				labelWrapper2.Text = "Da " & Sub035(vDlg1.Input)
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub Dalim_LongClick
	Sub065(Sender, Sub019("DaLim"))
End Sub

Sub delayedrefresh
	vUltimateListView1.RefreshContent
End Sub

Sub Disaptimer_Tick
	v6.Enabled = False
	LblInfo.Visible = False
End Sub

Sub Edt1_EnterPressed
	mod1.vStr2 = "Edt1_EnterPressed"
	Try
		v5.Initialize("TimerBarcode", 10)
		v5.Enabled = True
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub011(cursorWrapper As Cursor) As Map
	Dim map As Map
	map.Initialize
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		map.Put(cursorWrapper.GetString("descrizione") & "(" & cursorWrapper.GetString("CodiceArticolo") & ")", False)
	Next
	If map.Size <> 0 Then
		Return map
	End If
	Dim vObjectToCharSequence As Object = "Nessun articolo nel MIX di questa ricompensa"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	mod1.Sub081
	Return map
End Sub

Sub Sub012(randomAccessFile As RandomAccessFile, str As String)
	Dim list As List
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select distinct(CodiceMessaggioCoupon) from MPRicompense where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "(TipoRicompensa='uV' or TipoRicompensa='uQ') and codice ='" & SmartStringFormatter("", str) & "'")
	If cursorWrapper2.RowCount > 0 Then
		randomAccessFile.WriteObject("MPMessaggiCoupon", True, randomAccessFile.CurrentPosition)
		list.Initialize
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			Dim vTmp As Map = dbutil.Sub006(Main.vSql1, "Select * from MPMessaggiCoupon where CodiceCoupon ='" & SmartStringFormatter("", cursorWrapper2.GetString("CodiceMessaggioCoupon")) & "'", Null)
			If vTmp.ContainsKey("chiave") Then
				vTmp.Remove("chiave")
			End If
			list.Add(vTmp)
		Next
		randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
	End If
	cursorWrapper2.Close
	Dim cursorWrapper3 As Cursor
	Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select distinct(CodiceMessaggioCoupon) from MPRicompense where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "(TipoRicompensa='MO' or TipoRicompensa='mq' or TipoRicompensa='MS' or TipoRicompensa='MQ') and codice ='" & SmartStringFormatter("", str) & "'")
	If cursorWrapper4.RowCount > 0 Then
		randomAccessFile.WriteObject("MPMessaggiCliente", True, randomAccessFile.CurrentPosition)
		list.Initialize
		Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount2
			cursorWrapper4.Position = i2
			Dim vTmp_ As Map = dbutil.Sub006(Main.vSql1, "Select * from MPMessaggiCliente where CodiceMsg ='" & SmartStringFormatter("", cursorWrapper4.GetString("CodiceMessaggioCoupon")) & "'", Null)
			If vTmp_.ContainsKey("chiave") Then
				vTmp_.Remove("chiave")
			End If
			list.Add(vTmp_)
		Next
		randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
	End If
	cursorWrapper4.Close
End Sub

Sub Sub013(randomAccessFile As RandomAccessFile, str As String, str2 As String)
	Dim list As List
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select chiave from " & SmartStringFormatter("", str2) & " where codice ='" & SmartStringFormatter("", str) & "'")
	If cursorWrapper2.RowCount > 0 Then
		randomAccessFile.WriteObject(str2, True, randomAccessFile.CurrentPosition)
		list.Initialize
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			Dim vTmp As Map = dbutil.Sub006(Main.vSql1, "Select * from " & SmartStringFormatter("", str2) & " where chiave =" & SmartStringFormatter("", cursorWrapper2.GetString("chiave")) & "", Null)
			If vTmp.ContainsKey("chiave") Then
				vTmp.Remove("chiave")
			End If
			list.Add(vTmp)
		Next
		randomAccessFile.WriteObject(list, True, randomAccessFile.CurrentPosition)
	End If
	cursorWrapper2.Close
End Sub

Sub Sub014(str As String)
	Initialize
	Dim str2 As String = mod1.vStr4
	If Main.v_usbpath <> "" Then
		str2 = Main.v_usbpath
	End If
	Dim randomAccessFile As RandomAccessFile
	randomAccessFile.Initialize2(str2, "ExportOfferta" & str & ".raw.sql", False, False)
	randomAccessFile.WriteObject("anagra", True, randomAccessFile.CurrentPosition)
	Sub050(randomAccessFile, "delete from MPLimitiRicompense where Codice = '" & str & "'")
	Sub050(randomAccessFile, "delete from MPMixArticoli where Codice = '" & str & "'")
	Sub050(randomAccessFile, "delete from MPRicompense where Codice = '" & str & "'")
	Sub050(randomAccessFile, "delete from MPRicompenseGruppi where Codice = '" & str & "'")
	Sub050(randomAccessFile, "delete from MPTitoloIniziative where Codice = '" & str & "'")
	Sub050(randomAccessFile, "delete from MPIniziative where Codice = '" & str & "'")
	Sub050(randomAccessFile, "delete from MPVincoli where Codice = '" & str & "'")
	Sub013(randomAccessFile, str, "MPIniziative")
	Sub013(randomAccessFile, str, "MPLimitiRicompense")
	Sub013(randomAccessFile, str, "MPMixArticoli")
	Sub013(randomAccessFile, str, "MPPanieri")
	Sub013(randomAccessFile, str, "MPRicompense")
	Sub013(randomAccessFile, str, "MPRicompenseGruppi")
	Sub013(randomAccessFile, str, "MPTitoloIniziative")
	Sub013(randomAccessFile, str, "MPVincoli")
	Sub012(randomAccessFile, str)
	randomAccessFile.Close
	Dim vObjectToCharSequence As Object = "Procedura ultimata correttamente ." & CRLF & "File: ExportOfferta" & str & ".raw.sql" & CRLF & "nella cartella: " & str2
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub Fundell_Click
	Dim vTmp As Int = vcustomlistviewold3.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(6)
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "") > 1 Then
		Main.vSql1.ExecNonQuery("delete from MPLimitiRicompense where chiave = " & SmartStringFormatter("", labelWrapper.Text) & "")
		Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select chiave from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & " order by FineLR desc limit 1")
		Main.vSql1.ExecNonQuery("update MPLimitiRicompense set FineLR=99999999  where chiave = " & SmartStringFormatter("", parseDouble) & "")
		Sub043()
		Return
	End If
End Sub

Sub Fundell_LongClick
	Sub065(Sender, Sub019("FunDelL"))
End Sub

Sub Funl_Click
	Dim vTmp As Int = vcustomlistviewold2.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(7)
	Dim labelWrapper2 As Label = getpanel.GetView(0)
	Dim labelWrapper3 As Label = getpanel.GetView(1)
	Dim cursorWrapper As Cursor
	vCur4 = Main.vSql1.ExecQuery("select * from MPRicompense where chiave=" & labelWrapper.Text)
	If vCur4.RowCount > 0 Then
		vCur4.Position = 0
		pnlLimiti.Visible = True
		bGruppiRicompense.Visible = False
		bNewRicompensa.Visible = False
		lblPluTitle.Text = "Limiti per la " & labelWrapper2.Text & CRLF & labelWrapper3.Text
		Sub043()
		Return
	End If
End Sub

Sub Funl_LongClick
	Sub065(Sender, Sub019("FunL"))
End Sub

Sub Funm_Click
	Dim i As Int
	Dim vTmp As Int = vcustomlistviewold2.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(7)
	Dim cursorWrapper As Cursor
	vCur4 = Main.vSql1.ExecQuery("select * from MPRicompense where chiave=" & labelWrapper.Text)
	If vCur4.RowCount > 0 Then
		vCur4.Position = 0
		If vCur4.GetString("VeriabileRicompensa") <> "ART" Then
			Dim vObjectToCharSequence As Object = "Si possono agguingere articoli in MIX solo su ricompense di tipo articolo"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
		Dim list As List
		list.Initialize
		list.AddAll(ArrayToList(Array As String("Inserisci Articolo in MIX", "Visualizza articoli in Mix con questa ricompensa", "Elimina articoli in Mix con questa ricompensa", "Chiudi")))
		Dim vInputList As Int = InputList(list, "Gestione articoli in Mix con questa ricompensa", -1)
		If vInputList < 0 Then
			Return
		End If
		If vInputList = 0 Then
			Dim i2 As Int = 0
			Do While True
				Dim vTmp_ As String = Sub051()
				If vTmp_ <> "" Then
					If vCur4.GetString("ElementoRicompensa") = vTmp_ Then
						Dim vObjectToCharSequence3 As Object = "Non è possibile inserire questo articolo nel MIX in quanto è già presente come ricompensa"
						Dim vObjectToCharSequence4 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					If Main.vSql1.ExecQuerySingleResult("Select count(*) FROM [MPMixArticoli] where codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='123' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceArticolo='" & SmartStringFormatter("", vTmp_) & "' and MixCode ='" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "' ") > 0 Then
						Dim vObjectToCharSequence5 As Object = "Articolo già presente nel MIX di questa ricompensa"
						Dim vObjectToCharSequence6 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					If Main.vSql1.ExecQuerySingleResult("Select count(*) FROM [MPMixArticoli] where codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='123' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceArticolo='" & SmartStringFormatter("", vCur4.GetString("ElementoRicompensa")) & "' and MixCode ='" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "' ") = 0 Then
						Main.vSql1.ExecNonQuery("INSERT INTO [MPMixArticoli]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "([CodiceArticolo]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[MixCode]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[Codice]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[CodiceCondizione])" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "VALUES" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "('" & SmartStringFormatter("", vCur4.GetString("ElementoRicompensa")) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", vCur4.GetString("Codice")) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & ",'123')")
					End If
					i2 = i2 + 1
					Main.vSql1.ExecNonQuery("INSERT INTO [MPMixArticoli]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "([CodiceArticolo]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[MixCode]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[Codice]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[CodiceCondizione])" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "VALUES" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "('" & SmartStringFormatter("", vTmp_) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", vCur4.GetString("Codice")) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & ",'123')")
				Else
					If i2 = 1 Then
						Dim vObjectToCharSequence7 As Object = "1 Articolo inserito nel MIX di questa ricompensa"
						Dim vObjectToCharSequence8 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
					Else
						Dim vObjectToCharSequence9 As Object = i2 & " Articoli inseriti nel MIX di questa ricompensa"
						Dim vObjectToCharSequence10 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
					End If
					mod1.Sub081
				End If
			Loop
		Else If vInputList = 1 Then
			Dim cursorWrapper2 As Cursor
			Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select CodiceArticolo,anagra.descrizione from MPMixArticoli inner join anagra" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "on anagra.codint = MPMixArticoli.CodiceArticolo where codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='123' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "MPMixArticoli.MixCode ='" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "'")
			Sub067(cursorWrapper3, "Articoli presenti nel Mix della ricompensa selezionata")
			cursorWrapper3.Close
		Else If vInputList = 2 Then
			Dim cursorWrapper4 As Cursor
			Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("Select chiave,CodiceArticolo,anagra.descrizione from MPMixArticoli inner join anagra" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "on anagra.codint = MPMixArticoli.CodiceArticolo where codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='123' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "MPMixArticoli.MixCode ='" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "'")
			Dim vTmp__ As Map = Sub011(cursorWrapper5)
			If vTmp__.Size > 0 Then
				InputMap(vTmp__, "Selezionare gli articoli da eliminare dal Mix della ricompensa selezionata")
				Dim size As Int = vTmp__.Size - 1
				i = 0
				Dim i3 As Int
				For i3 = 0 To size
					If vTmp__.GetValueAt(i3) Then
						cursorWrapper5.Position = i3
						If vCur4.GetString("ElementoRicompensa") <> cursorWrapper5.GetString("CodiceArticolo") Or vTmp__.Size <= 1 Then
							Main.vSql1.ExecNonQuery("delete from MPMixArticoli where chiave =" & SmartStringFormatter("", cursorWrapper5.GetString("chiave")) & "")
							i = i + 1
						End If
					End If
				Next
			Else
				i = 0
			End If
			If i = 1 Then
				Dim vObjectToCharSequence11 As Object = "1 Articolo eliminato dal MIX di questa ricompensa"
				Dim vObjectToCharSequence12 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
			Else If i > 1 Then
				Dim vObjectToCharSequence13 As Object = i & " Articoli eliminati dal MIX di questa ricompensa"
				Dim vObjectToCharSequence14 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
			End If
			cursorWrapper5.Close
			mod1.Sub081
		End If
	End If
End Sub

Sub Funm_LongClick
	Sub065(Sender, Sub019("FunM"))
End Sub

Sub Funr_Click
	Dim vTmp As Int = vcustomlistviewold2.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(7)
	Dim vObjectToCharSequence As Object = "Confermi la cancellazione della ricompensa ? "
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select Codice,Priorita from MPRicompense where  chiave=" & SmartStringFormatter("", labelWrapper.Text) & "")
		If cursorWrapper2.RowCount > 0 Then
			cursorWrapper2.Position = 0
			Dim str As String = " codice ='" & SmartStringFormatter("", cursorWrapper2.GetString("Codice")) & "' and CodiceCondizione ='123' and Priorita = " & SmartStringFormatter("", cursorWrapper2.GetString("Priorita")) & ""
			Dim str2 As String = " codice ='" & SmartStringFormatter("", cursorWrapper2.GetString("Codice")) & "' and CodiceCondizione ='123' and MixCode = " & SmartStringFormatter("", cursorWrapper2.GetString("Priorita")) & ""
			Main.vSql1.ExecNonQuery("delete from MPRicompense where chiave=" & SmartStringFormatter("", labelWrapper.Text) & "")
			Main.vSql1.ExecNonQuery("delete from MPLimitiRicompense where " & SmartStringFormatter("", str) & "")
			Main.vSql1.ExecNonQuery("delete from MPMixArticoli where " & SmartStringFormatter("", str2) & "")
			Sub044(vStr1, " order by chiave", False)
		End If
	End If
	mod1.Sub081
End Sub

Sub Funr_LongClick
	Sub065(Sender, Sub019("FunR"))
End Sub

Sub Funv_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(4)
	Dim vObjectToCharSequence As Object = "Confermi la cancellazione del vincolo ? "
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Main.vSql1.ExecNonQuery("delete from MPVincoli where chiave=" & SmartStringFormatter("", labelWrapper.Text) & "")
		Sub045(vStr1, " order by chiave", False)
	End If
	mod1.Sub081
End Sub

Sub Funv_LongClick
	Sub065(Sender, Sub019("FunV"))
End Sub

Sub Sub015
	Dim i As Int
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("Inserisci nuovo messaggio cliente", "Visualizza messaggi cliente", "Elimina messaggi", "Chiudi")))
	Dim vInputList As Int = InputList(list, "Gestione Messaggi al cliente (Stampati su MF o Visualizzati sul display)", -1)
	If vInputList < 0 Then
		Return
	End If
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from MPMessaggiCliente")
	If vInputList = 0 Then
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPMessaggiCliente") > 0 Then
			i = Main.vSql1.ExecQuerySingleResult("Select max(CodiceMsg) from MPMessaggiCliente") + 1
		Else
			i = 1
		End If
		Dim modalmlineVar As modalmline
		modalmlineVar.Initialize("Iniziative", 28, Activity)
		Dim vRGB As Int = Colors.RGB(150, 150, 150)
		Dim vRGB2 As Int = Colors.RGB(150, 150, 150)
		modalmlineVar.Sub004(vRGB, vRGB2, -256)
		Dim vTmp As String = modalmlineVar.Sub002("Inserisci messaggio", "Aggiungi un testo da stampare sullo scontrino fiscale o visualizzare sul display dell'operatore", "", "")
		If vTmp <> -3 Then
			vTmp = vTmp.Replace(CRLF, "/n").Replace("'", "").Replace(",", "")
		End If
		Main.vSql1.ExecNonQuery("INSERT INTO [MPMessaggiCliente]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "([CodiceMsg]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[MessaggioMsg])" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "VALUES" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "('" & SmartStringFormatter("", i) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",'" & SmartStringFormatter("", modfunstr.left(vTmp, 200)) & "')")
		Dim vObjectToCharSequence As Object = "Messaggio inserito correttamente"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Else If vInputList = 1 Then
		If cursorWrapper2.RowCount > 0 Then
			Dim list2 As List
			list2.Initialize
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount
				cursorWrapper2.Position = i2
				list2.Add(cursorWrapper2.GetString("MessaggioMsg").Replace("/n", CRLF))
			Next
			InputList(list2, "Elenco Messaggi cliente", -1)
		Else
			Dim vObjectToCharSequence3 As Object = "Nessun messaggio presente in anagrafica"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		End If
	Else If vInputList = 2 Then
		If cursorWrapper2.RowCount > 0 Then
			Dim list3 As List
			list3.Initialize
			Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
			Dim i3 As Int
			For i3 = 0 To rowCount2
				cursorWrapper2.Position = i3
				list3.Add(cursorWrapper2.GetString("MessaggioMsg").Replace("/n", CRLF))
			Next
			Dim vInputList2 As Int = InputList(list3, "Elenco Messaggi cliente", -1)
			If vInputList2 < 0 Then
				Return
			End If
			cursorWrapper2.Position = vInputList2
			Dim vGetString As String = cursorWrapper2.GetString("CodiceMsg")
			Main.vSql1.ExecNonQuery("delete from [MPMessaggiCliente]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where CodiceMsg ='" & SmartStringFormatter("", vGetString) & "'")
			Dim vObjectToCharSequence5 As Object = "Messaggio eliminato correttamente"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		Else
			Dim vObjectToCharSequence7 As Object = "Nessun messaggio presente in anagrafica"
			Dim vObjectToCharSequence8 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
		End If
	End If
	cursorWrapper2.Close
	mod1.Sub081
End Sub

Sub Sub016
	Dim i As Int
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("Inserisci nuovo messaggio per coupon", "Visualizza messaggi per Coupon", "Elimina messaggi", "Chiudi")))
	Dim vInputList As Int = InputList(list, "Gestione Messaggi per i Coupon ", -1)
	If vInputList < 0 Then
		Return
	End If
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from MPMessaggiCoupon")
	If vInputList = 0 Then
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPMessaggiCoupon") > 0 Then
			i = Main.vSql1.ExecQuerySingleResult("Select max(CodiceCoupon) from MPMessaggiCoupon") + 1
		Else
			i = 1
		End If
		Dim modalmlineVar As modalmline
		modalmlineVar.Initialize("Iniziative", 28, Activity)
		Dim vRGB As Int = Colors.RGB(150, 150, 150)
		Dim vRGB2 As Int = Colors.RGB(150, 150, 150)
		modalmlineVar.Sub004(vRGB, vRGB2, -256)
		Dim vTmp As String = modalmlineVar.Sub002("Inserisci messaggio", "Aggiungi un testo da stampare sul coupon", "", "")
		If vTmp <> -3 Then
			vTmp = vTmp.Replace(CRLF, "/n").Replace("'", "").Replace(",", "")
		End If
		Main.vSql1.ExecNonQuery("INSERT INTO [MPMessaggiCoupon]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "([CodiceCoupon]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[MessaggioCoupon])" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "VALUES" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "('" & SmartStringFormatter("", i) & "'" & CRLF & TAB & TAB & ",'" & SmartStringFormatter("", modfunstr.left(vTmp, 200)) & "')")
		Dim vObjectToCharSequence As Object = "Messaggio coupon inserito correttamente"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Else If vInputList = 1 Then
		If cursorWrapper2.RowCount > 0 Then
			Dim list2 As List
			list2.Initialize
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount
				cursorWrapper2.Position = i2
				list2.Add(cursorWrapper2.GetString("MessaggioCoupon").Replace("/n", CRLF))
			Next
			InputList(list2, "Elenco Messaggi coupon", -1)
		Else
			Dim vObjectToCharSequence3 As Object = "Nessun messaggio presente in anagrafica"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		End If
	Else If vInputList = 2 Then
		If cursorWrapper2.RowCount > 0 Then
			Dim list3 As List
			list3.Initialize
			Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
			Dim i3 As Int
			For i3 = 0 To rowCount2
				cursorWrapper2.Position = i3
				list3.Add(cursorWrapper2.GetString("MessaggioCoupon").Replace("/n", CRLF))
			Next
			Dim vInputList2 As Int = InputList(list3, "Elenco Messaggi coupon", -1)
			If vInputList2 < 0 Then
				Return
			End If
			cursorWrapper2.Position = vInputList2
			Dim vGetString As String = cursorWrapper2.GetString("CodiceCoupon")
			Main.vSql1.ExecNonQuery("delete from [MPMessaggiCoupon]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where CodiceCoupon ='" & SmartStringFormatter("", vGetString) & "'")
			Dim vObjectToCharSequence5 As Object = "Messaggio eliminato correttamente"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		Else
			Dim vObjectToCharSequence7 As Object = "Nessun messaggio presente in anagrafica"
			Dim vObjectToCharSequence8 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
		End If
	End If
	cursorWrapper2.Close
	mod1.Sub081
End Sub

Sub Sub017(str As String, j As Long) As String
	Dim dateDialog As DateDialog
	dateDialog.Year = DateTime.GetYear(j)
	dateDialog.Month = DateTime.GetMonth(j)
	dateDialog.DayOfMonth = DateTime.GetDayOfMonth(j)
	Dim vShow As Int = dateDialog.Show(str, "Data", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Return dateDialog.Year & NumberFormat(dateDialog.Month, 2, 0) & NumberFormat(dateDialog.DayOfMonth, 2, 0)
	End If
	Return vStr4
End Sub

Sub Sub018(i As Int) As String
	Select i
	End Select
	Return "SV"
End Sub

Sub Sub019(str As String) As String
	Select str
		Case "RaggruppamentoVincolo"
			Return "Questo parametro consente di creare dei gruppi di vincoli all'interno dell'offerta." & CRLF & "Per creare un gruppo vincoli è sufficiente abbinare lo stesso codice gruppo a più vincoli." & CRLF & "Inserire 2 o più vincoli con lo stesso gruppo significa che quando uno solo dei vincoli del gruppo viene superato , gli altri non vengono testati." & CRLF & "Esempio pratico:" & CRLF & "Supponiamo di avere il gruppo 1 con 3 vincoli , il gruppo 2 con 3 vincoli;" & CRLF & "Per ottenere le ricompense è necessario che venga superato almeno 1 vincolo del gruppo 1 e 1 del gruppo 2." & CRLF & "Questo parametro è molto utile per la gestione dei panieri quando il paniere non è composto da un elenco fisso di articoli ma da una serie di liste all'interno delle quali il cliente può effettuare le proprie scelte." & CRLF & " "
		Case "Vincolo"
			Return "Consente di impostare il tipo di vincolo"
		Case "TipoVincolo"
			Return "Consente di impostare i parametri del vincolo"
		Case "Ricompensa"
			Return "Consente di impostare su quale elemento la ricompensa deve avere effetto :Scontrino , reparto o Articolo." & CRLF & "Per il tipo Articolo e Reparto , verrà chiesto di indicare un elemento."
		Case "TipoRicompensa"
			Return "Questo pulsante consente la modifica del tipo ricompensa." & CRLF & "A seconda della ricompensa selezionata, possono venire richieste ulteriori informazioni"
		Case "PrioritaRicompensa"
			Return "Consente di stabilire la priorità di applicazione delle ricompense all'interno dell'offerta." & CRLF & "Parametro molto utile nella gestione dei gruppi ricompense"
		Case "bGruppiRicompense"
			Return "Attraverso questo tasto è possibile gestire i gruppi ricompense PER L'OFFERTA ATTIVA." & CRLF & "Durante la creazione di un nuovo gruppo viene chiesto di inserire un valore che rappresenta il numero massimo di ricompense." & TAB & TAB & TAB & CRLF & "I gruppo creati possono poi essere legati alle ricompense di questa offerta;durante la vendita, le ricompense con lo stesso gruppo verranno applicate in misura non superiore alla quantità massima di ricompense stabilita come parametro di gruppo." & CRLF & "Per questo motivo è importante impostare una PRIORITA' corretta alle ricompense legate ad un gruppo :" & CRLF & "Supponiamo di avere 4 ricompense legate al gruppo 1 , dove il gruppo 1 ha un limite ricompense = 2;" & CRLF & "se nello scontrino troviamo gli elementi per applicare tutte e 4 le ricompense, allora solo quelle con priorità più bassa verranno applicate."
		Case "ValoreLim"
			Return "Indica il valore della ricompensa (in quantità o in euro) per la soglia selezionata"
		Case "SegnoLim"
			Return "Questo tasto può essere utilizzato per indicare se la generazione dei punti deve essere in aggiunta o in detrazione ." & CRLF & "Per le offerte di tipo M x N , questo campo può essere utilizzato per indicare una percentuale di sconto diversa dal 100%"
		Case "OgniLim"
			Return "Indica ogni quanti pezzi o € deve essere riconosciuta la ricompensa per la soglia" & CRLF & "Nel caso di offerta 'Sconto % sul valore' , indicando 0 non verrà considerato lo step."
		Case "inzLinea"
			Return "E' possibile limitare l'applicazione dell'offerta anche in funzione di alcuni parametri legati al cliente (vedi le opzioni del tasto)"
		Case "inzPriorita"
			Return "Consente di specificare un valore numerico per stabilire la priorità di applicazione delle offerte (il valore più basso viene eseguito per primo)" & CRLF & "Importante per il flag 'Una volta esequita questa offerta .....' (il tasto sopra)" & CRLF & CRLF
		Case "inzGiorni"
			Return "Consente di impostare quali giorni della settimana l'offerta è attiva" & CRLF & CRLF
		Case "inzEsclutiNF"
			Return "Questo pulsante consente di indicare se devono essere considerati tutti gli articoli o solo quelli fiscali." & CRLF & CRLF
		Case "inzEsclusivita"
			Return "Questo pulsante consente di indicare se in fase di vendita, una volta raggiunta questa offerta il programma procede con le altre offerte oppure si ferma." & CRLF & "E' evidente che vuole utilizzare questo parametro , deve impostare anche il valore di priorità offerte per potere controllare la sequenza di applicazione offerte e decidere quando fermarsi." & CRLF & CRLF
		Case "inzLimitaRicompense"
			Return "Questo pulsante consente di limitare il numero di ogni singola ricompensa in presenza di vincoli." & CRLF & "Esempio pratico:" & CRLF & "Supponiamo di avere inserito un vincolo che prevede l'inserimento di almeno 2 'pizza napoli' per essere superato." & CRLF & "Se durante la vendita inseriamo 2 pizze napoli , allora tutte le ricompernse avranno una quantità massima =1" & CRLF & "Se durante la vendita inseriamo 4 pizze napoli , allora tutte le ricompernse avranno una quantità massima =2" & CRLF & "Se durante la vendita inseriamo 6 pizze napoli , allora tutte le ricompernse avranno una quantità massima =3" & CRLF & "........" & CRLF & "Nel caso di più vincoli viene considerato il vincolo che restituisce la quantità più bassa" & CRLF & "Questa funzionalità si attiva con vincoli di tipo Articolo,Totale scontrino o Reparto e su ricompense di tipo 'Buono sulla quantità'" & CRLF & "Se è stato inserito un vincolo che per essere superato " & CRLF & CRLF
		Case "inzDescrizione"
			Return "Descrizione dell'offerta." & CRLF & "Questo testo viene stampato anche sui coupon e su alcuni messaggi al cliente - operatore" & CRLF
		Case "inzDaOra"
			Return "Indica l'orario di inizio offerta nel giorno;tutti i giorni in cui l'offerta è attiva , all'orario impostato verrà attivata." & CRLF
		Case "inzaOra"
			Return "Indica l'orario di fine offerta nel giorno;tutti i giorni in cui l'offerta è attiva , all'orario impostato verrà disattivata." & CRLF
		Case "inzDaData"
			Return "Indica la data di inizio applicazione dell'offerta" & CRLF
		Case "inzaData"
			Return "Indica la data di fine applicazione dell'offerta" & CRLF
		Case "inzCodElementoScontrino"
			Return "Indicare l'articolo o il reparto a seconda del tipo di evento che attiva l'offerta (tasto superiore)" & CRLF & "Nel caso di 'Elemento scontrino' = 'Totale Scontrino' questo parametro non ha significato" & CRLF
		Case "inzElementoScontrino"
			Return "Consente di indicare l'evento che attiverà l'offerta." & CRLF & "Se l'offerta è complessa , consiglio di impostare questo parametro a scontrino, quindi gestire l'attivazione dell'offerta attraverso i vincoli." & TAB & TAB & TAB & CRLF
		Case "GruppoRicompensa"
			Return "E' possibile legare più ricompense all'interno dello stesso gruppo." & CRLF & "Per poterlo fare è necessario creare prima il gruppo attraverso il pulsante che si trova in alto a destra (a fianco del tasto nuova ricompensa)" & CRLF & "Durante la creazione del gruppo viene chiesto di indicare il numero di ricompense da accettare (es:3) ." & CRLF & "A questo punto posso legare il gruppo appena creato a più ricompense;" & CRLF & "in questo modo durante la vendita, dopo avere ottenuto 3 ricompense abbinate al gruppo (come da esempio precedente) il programma non applica più ricompense per quel gruppo ." & CRLF & "Diventa importante impostare la priorità di applicazione della ricompensa." & CRLF & "Se una ricompensa è legata ad un gruppo inesistente verrà sempre applicata a patto di superare gli eventuali vincoli e le soglie stabilite" & CRLF & CRLF
		Case "FunV"
			Return "Consente la cancellazione del vincolo." & CRLF
		Case "FunR"
			Return "Consente la cancellazione della ricompensa." & CRLF & "Vengono cancellate anche le soglie e eventuali Mix legati alla ricompensa."
		Case "FunM"
			Return "Attraverso questo pulsante posso creare legami tra l'articolo inserito nella ricompensa e altri articoli (Mix)." & CRLF & "Questa funzione può essere utilizzata solo all'interno di ricompense su Articoli." & CRLF & "Lo stesso articolo può essere inserito all'interno di Mix di altre ricompense." & CRLF & "Gli articoli legati alla ricompensa attraverso il Mix , concorreranno al raggiungimento delle soglie e se ragguinte,beneficeranno anche loro della ricompensa."
		Case "FunL"
			Return "Attraverso questo pulsante posso impostare i valori della ricompensa e le relative soglie ." & CRLF & "Quello che viene visualizzato nella griglia delle soglie può variare a seconda del tipo ricompensa selezionata." & CRLF & "Posso modificare i valori delle soglie cliccando direttamente sulla griglia"
		Case "FunDelL"
			Return "Consente la cancellazione dell'ultima soglia nel caso in cui ne esista più di una." & CRLF & "La soglia precedente rispetto a quella che è stata cancellata , verrà impostata con valore di fine soglia = 99999999"
		Case "bNewVincolo"
			Return "Con questo pulsante è possibile creare nuove ricompense per l'offerta attiva." & CRLF & "Verrà richiesto di cosa il vincolo dovrà verificare (la presenza di 1 o più articoli , il passaggio di 1 o più coupon ....) ." & CRLF & "Una volta creato il vincolo , posso sempre modificarlo cliccando sugli elementi della griglia"
		Case "bNewRicompensa"
			Return "Con questo pulsante è possibile creare nuove ricompense per l'offerta attiva." & CRLF & "Verrà richiesto di indicare su cosa avrà effetto la ricompensa (Articolo,Scontrino o Reparto) e il tipo della ricompensa." & CRLF & "Una volta creata la testata della ricompensa , ricordarsi di impostarne i valori (e relative soglie) utilizzando il tasto lista presente in griglia." & CRLF & "Posso sempre modificare la ricompensa cliccando sugli elementi della griglia."
		Case "bNew"
			Return "Con questo pulsante è possibile creare nuove offerte." & CRLF & "Dopo avere inserito il progressivo del numero di offerta, sarà possibile modificare i parametri predefiniti della testata"
		Case "bMsgStampa"
			Return "Con questo pulsante è possibile gestire l'anagrafica dei testi che possono essere utilizzati per comunicare con il cliente o l'operatore attraverso dei messaggi stampati su MF o visualizzati sul display dell'operatore." & CRLF & "In fase di inserimento di una ricompensa che prevede la generazione di un messaggio , verrà richiesto di selezionare uno dei testi inseriti "
		Case "aLim"
			Return "Imposta il limite massimo (in quantità o importo a seconda del tipo di offerta) per questa soglia"
		Case "DaLim"
			Return "Imposta il valore di partenza (in quantità o importo a seconda del tipo di offerta) per questa soglia"
		Case "bMsgVisualizza"
			Return "Con questo pulsante è possibile gestire l'anagrafica dei testi che possono essere stampati sui coupon." & CRLF & "In fase di inserimento di una ricompensa che prevede l'emissione di coupon, verrà richiesto di selezionare uno dei testi inseriti "
		Case Else
			Return "Non trovato"
	End Select
End Sub

Sub Sub020(i As Int) As String
	If i = 0 Then
		Return "A"
	End If
	If i = 1 Then
		Return "B"
	End If
	If i = 2 Then
		Return "C"
	End If
	Return i - 2
End Sub

Sub Sub021(cursorWrapper As Cursor) As List
	Dim list As List
	list.Initialize
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		Dim vSize As CSBuilder = vCSBuilder1.Initialize.Size(14)
		vSize.Typeface(Typeface.MONOSPACE)
		vCSBuilder1.Append(modfunstr.left("Gruppo Codice " & cursorWrapper.GetString("CodiceGruppoRicompensa") & modfunstr.Sub004(20), 20))
		vCSBuilder1.Color(-65536)
		vCSBuilder1.Append(modfunstr.left("Limite quantità " & cursorWrapper.GetString("NumeroRicompenseGruppo") & modfunstr.Sub004(25), 25))
		list.Add(vCSBuilder1.PopAll)
	Next
	Return list
End Sub

Sub Sub022(i As Int, str As String) As String
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("Quantità", "Valore")))
	Dim vInputList As Int = InputList(list, str, i)
	If vInputList < 0 Then
		Return ""
	End If
	If vInputList = 0 Then
		Return "Q"
	End If
	Return "V"
End Sub

Sub Sub023(str As String) As String
	Dim timeDialog As TimeDialog
	timeDialog.Is24Hours = True
	Dim vShow As Int = timeDialog.Show(str, "Data", "Ok", "Annulla", "", Main.vBmp1)
	Return IIf(vShow = -1, NumberFormat(timeDialog.Hour, 2, 0) & NumberFormat(timeDialog.Minute, 2, 0), "0000")
End Sub

Sub Sub024(z As Boolean) As String
	mod1.vStr2 = "Sub getProgress(Tipo As String) As String"
	Try
		Dim str As String = ""
		If Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='Z'").Length >= 6 Then
			str = ""
		Else
			Dim parseDouble As Long = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='Z'")
			Do While str = ""
				If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" & parseDouble & "'")) = 0 Then
					str = parseDouble
				Else
					parseDouble = parseDouble + 1
				End If
			Loop
		End If
		If z Then
			Return str
		End If
		Do While True
			Dim inputDialog2 As InputDialog = vDlg1
			vDlg1.InputType = 2
			vDlg1.Input = str
			vDlg1.Hint = "Codice Offerte"
			vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
			vDlg1.PasswordMode = False
			Dim vShow As Int = vDlg1.Show("Confermi l'inserimento delle offerte ?", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow = -1 Then
				If IsNumber(vDlg1.Input) And vDlg1.Input.Length <= 10 Then
					If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from MPIniziative where codice = '" & vDlg1.Input & "'")) = 0 Then
						Return vDlg1.Input
					End If
					Dim vObjectToCharSequence As Object = "L'offerta " & vDlg1.Input & " risulta essere già presente in anagrafica."
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Else
					Dim vObjectToCharSequence3 As Object = "Il codice inserito non è valido (lunghezza massima 10 caratteri) "
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				End If
			Else
				Return ""
			End If
		Loop
	Catch
		mod1.Sub217(LastException.Message)
		Return ""
	End Try
End Sub

Sub Sub025(str As String, str2 As String) As String
	Select str
		Case "ART"
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint ='" & str2 & "'") > 0 Then
				Return Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint ='" & str2 & "'")
			End If
			Return ""
		Case "REP"
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from reparti where codice =" & str2) > 0 Then
				Return Main.vSql1.ExecQuerySingleResult("Select descrizione from reparti where codice =" & str2)
			End If
			Return ""
		Case "GRP"
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from gruppovar where codice =" & str2) > 0 Then
				Return Main.vSql1.ExecQuerySingleResult("Select descrizione from gruppovar where codice =" & str2)
			End If
			Return ""
		Case Else
			Return ""
	End Select
End Sub

Sub Sub026(str As String) As Int
	Select str
		Case "SCO"
			Return 1
		Case "ART"
			Return 0
		Case "REP"
			Return 2
		Case "COU"
			Return 3
		Case "ACM"
			Return 4
		Case "GRP"
			Return 5
	End Select
End Sub

Sub Sub027(str As String) As String
	Select str
	End Select
	Return "Totale Scontrino"
End Sub

Sub Sub028(str As String) As String
	Select str
	End Select
	Return "SCO"
End Sub

Sub Sub029(str As String) As String
	Select str
		Case "LQ"
			Return " minore uguale a "
		Case "GQ"
			Return " maggiore uguale a "
		Case "LT"
			Return " minore di "
		Case "GT"
			Return " maggiore di "
		Case "NQ"
			Return " diverso da "
		Case Else
			Return " uguale a "
	End Select
End Sub

Sub Sub030(str As String) As String
	Select str
	End Select
	Return " Sconto % sul valore "
End Sub

Sub Sub031(d As Double) As String
	Select vCur4.GetString("TipoRicompensa")
		Case "BV", "BQ"
			Return "Sconto " & NumberFormat2(d, 1, 2, 2, False) & " €"
		Case "uV", "uQ"
			Return "Emetti " & NumberFormat2(d, 1, 0, 0, False) & " coupon"
		Case "CV", "CQ"
			Return "Esegui " & NumberFormat2(d, 1, 0, 0, False) & " volte la Macro"
		Case "SV", "SQ"
			Return "Sconto " & NumberFormat2(d, 1, 0, 0, False) & " %"
		Case "MO", "mq"
			Return "Visualizza messaggio all'operatore"
		Case "EV", "eQ"
			Return "Emetti " & NumberFormat2(d, 1, 0, 0, False) & " punti"
		Case "RV", "RQ"
			Return "Maggiorazione " & NumberFormat2(d, 1, 0, 0, False) & " %"
		Case "MQ", "MS"
			Return "Stampa messaggio al cliente"
		Case "AQ"
			Return "Sconta " & NumberFormat2(d, 1, 0, 0, False) & " pezzi"
		Case "LQ"
			Return "Taglio prezzo " & NumberFormat2(d, 1, 2, 2, False) & " €"
		Case Else
			Return d & " pezzi"
	End Select
End Sub

Sub Sub032(i As Int, i2 As Int) As Int
	Select vCur4.GetString("TipoRicompensa")
		Case "BV", "BQ"
			Return i2
		Case "uV", "uQ", "CV", "CQ", "RV", "RQ"
			Return 999
		Case "SV", "SQ"
			Return 100
		Case "EV", "eQ"
			Return 9999
		Case "AQ"
			Return i
		Case "LQ"
			Return 9999
		Case Else
			Return 999
	End Select
End Sub

Sub Sub033 As String
	Select vCur4.GetString("TipoRicompensa")
		Case "BV", "BQ"
			Return "Indicare lo sconto in €"
		Case "uV", "uQ"
			Return "Indicare il numero coupon da emettere"
		Case "CV", "CQ"
			Return "Indicare quante volte eseguire la macro"
		Case "SV", "SQ"
			Return "Indicare lo sconto in %"
		Case "RV", "RQ"
			Return "Indicare il valore della maggiorazione"
		Case "EV", "eQ"
			Return "Inserire il numero dei punti"
		Case "AQ"
			Return "Indicare il numero di articoli da scontare"
		Case "LQ"
			Return "Indicare l'importo in € per il taglio prezzo"
		Case Else
			Return "Indicare un valore"
	End Select
End Sub

Sub Sub034(str As String) As Int
	Select str
		Case "SV"
			Return 0
		Case "SQ"
			Return 1
		Case "BV"
			Return 2
		Case "BQ"
			Return 3
		Case "AQ"
			Return 4
		Case "LQ"
			Return 5
		Case "eQ"
			Return 6
		Case "EV"
			Return 7
		Case "uQ"
			Return 8
		Case "uV"
			Return 9
		Case "MO"
			Return 10
		Case "mq"
			Return 11
		Case "MS"
			Return 12
		Case "MQ"
			Return 13
		Case "CQ"
			Return 14
		Case "CV"
			Return 15
		Case "RQ"
			Return 16
		Case "RV"
			Return 17
	End Select
End Sub

Sub Sub035(str As String) As String
	Select vCur4.GetString("TipoRicompensa")
		Case "BV", "uV", "SV", "EV", "MO", "MS", "CV", "RV"
			Return NumberFormat2(str, 1, 2, 2, False) & " €"
		Case Else
			If str = "1" Then
				Return " pezzo"
			End If
			Return str & " pezzi"
	End Select
End Sub

Sub Sub036 As Boolean
	Select vCur4.GetString("TipoRicompensa")
		Case "BV", "uV", "SV", "EV", "MO", "MS", "CV", "RV"
			Return True
		Case Else
			Return False
	End Select
End Sub

Sub Sub037(i As Int, str As String) As String
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("Minore uguale ", "Maggiore uguale", "Minore ", "Maggiore ", "Diverso ", "Uguale")))
	Dim vInputList As Int = InputList(list, str, i)
	If vInputList < 0 Then
		Return ""
	End If
	Select vInputList
		Case 0
			Return "LQ"
		Case 1
			Return "GQ"
		Case 2
			Return "LT"
		Case 3
			Return "GT"
		Case 4
			Return "NQ"
		Case Else
			Return "EQ"
	End Select
End Sub

Sub Sub038(str As String) As Int
	Select str
		Case "LQ"
			Return 0
		Case "GQ"
			Return 1
		Case "LT"
			Return 2
		Case "GT"
			Return 3
		Case "NQ"
			Return 4
		Case Else
			Return 5
	End Select
End Sub

Sub Grupporicompensa_Click
	Sub058(Sender)
	mod1.Sub081
End Sub

Sub Grupporicompensa_LongClick
	Sub065(Sender, Sub019("GruppoRicompensa"))
End Sub

Sub Header_Click
	If vUltimateListView1.Enabled And vUltimateListView1.NumberOfItems > 1 Then
		Dim concreteViewWrapper As View = Sender
		If concreteViewWrapper.Tag > 0 And concreteViewWrapper.Tag < 6 Then
			vUltimateListView1.StopScrolling
			If vByt1 = concreteViewWrapper.Tag Then
				vBln2 = Not(vBln2)
			Else
				vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
				If vByt1 >= 0 Then
					vLabelArr1(vByt1).Background = vColorDrawable1
				End If
				vBln2 = True
				vByt1 = concreteViewWrapper.Tag
			End If
			sort_data()
			Return
		End If
		Return
	End If
End Sub

Sub hide_keyboard
	Dim phone As Phone = Main.vPhone1
	Phone.HideKeyboard(Activity)
End Sub

Sub imericerca_handleaction As Boolean
	Dim editTextWrapper As EditText
	Dim z As Boolean = True
	mod1.vStr2 = "Sub IMERicerca_HandleAction As Boolean"
	Try
		DoEvents
		editTextWrapper = Edt1
		editTextWrapper.Text = editTextWrapper.Text.Replace(CRLF, "").Replace("'", "")
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If editTextWrapper.Text.Trim = "" Then
		If vInt2 <> m_rtutti Then
			ProgressDialogHide
			Return False
		End If
	End If
	vStr3 = ""
	If vInt2 = m_rcodice And editTextWrapper.Text.Trim <> "" Then
		vStr3 = "SELECT MPTitoloIniziative.[Descrizione],[ElementoScontrino], [CodElementoScontrino],MPIniziative.[Codice], [CodiceCondizione],[DataInizio], [DataFine] from MPIniziative inner join MPTitoloIniziative on MPTitoloIniziative.Codice = MPIniziative.Codice  where MPIniziative.Codice = '" & editTextWrapper.Text & "'"
	Else If vInt2 = m_rdescrizione And editTextWrapper.Text.Trim <> "" Then
		vStr3 = "SELECT MPTitoloIniziative.[Descrizione],[ElementoScontrino], [CodElementoScontrino],MPIniziative.[Codice], [CodiceCondizione],[DataInizio], [DataFine] from MPIniziative inner join MPTitoloIniziative on MPTitoloIniziative.Codice = MPIniziative.Codice  where  Descrizione like '%" & editTextWrapper.Text & "%'"
	Else If vInt2 = m_rtutti Then
		vStr3 = "SELECT MPTitoloIniziative.[Descrizione],[ElementoScontrino], [CodElementoScontrino],MPIniziative.[Codice], [CodiceCondizione],[DataInizio], [DataFine] from MPIniziative inner join MPTitoloIniziative on MPTitoloIniziative.Codice = MPIniziative.Codice "
	Else
		z = False
	End If
	If z Then
		Sub040()
		Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select count(*) from sortedMPIniziative")
		If vInt1 >= 0 And parseDouble - 1 >= vInt1 Then
			vUltimateListView1.JumpTo(vInt1, False)
			vInt1 = -1
		Else
			vUltimateListView1.JumpTo(0, False)
		End If
		If vInt2 = m_rcodice Then
			Edt1.Text = ""
		End If
	End If
	vIME1.HideKeyboard
	If Edt1.Visible Then
		Edt1.RequestFocus
		Edt1.SelectionStart = Edt1.Text.Length
	End If
	mod1.Sub081
	Return False
End Sub

Sub Sub039
	mod1.vStr2 = "Sub Init"
	Try
		Activity.Title = "Gestione Offerte fidelity ... Selezionare una funzione"
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub inzAData_Click
	Dim vObjectToString As String = inzAData.Tag
	Dim vTmp As String = Sub017("Impostare la data di fine offerta", DateUtils.setdate(vObjectToString.SubString2(0, 4), vObjectToString.SubString2(4, 6), vObjectToString.SubString2(6, 8)))
	If vTmp >= inzDaData.Tag Then
		inzAData.Tag = vTmp
		Sub001(inzAData, "Offerta attiva fino al : ", Sub006(inzAData.Tag))
	Else
		Dim vObjectToCharSequence As Object = "Attenzione .... Verificare le date inserite."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub inzAData_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzaData"))
End Sub

Sub inzAOra_Click
	Dim vTmp As String = Sub023("Impostare l'orario di fine offerta")
	If vTmp > inzDaOra.Tag Then
		inzAOra.Tag = vTmp
		Dim vObjectToString As String = inzAOra.Tag
		Sub001(inzAOra, "Offerta attiva fino alle ore : ", vObjectToString.SubString2(0, 2) & ":" & vObjectToString.SubString(2))
	Else
		Dim vObjectToCharSequence As Object = "Attenzione .... Verificare gli orari inseriti."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub inzAOra_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzaOra"))
End Sub

Sub inzCodElementoScontrino_Click
	Dim i As Int = -1
	Select inzElementoScontrino.Tag
		Case "ART"
			inzCodElementoScontrino.Tag = Sub051()
			If inzCodElementoScontrino.Tag = "" Or (IsNumber(inzCodElementoScontrino.Tag) And inzCodElementoScontrino.Tag < 0) Then
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", "NESSUNO")
			Else
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", inzCodElementoScontrino.Tag)
			End If
		Case "REP"
			If IsNumber(inzCodElementoScontrino.Tag) And inzCodElementoScontrino.Tag >= 0 Then
				i = inzCodElementoScontrino.Tag
			End If
			inzCodElementoScontrino.Tag = Sub053(i)
			If inzCodElementoScontrino.Tag < 0 Then
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", "NESSUNO")
			Else
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", vLst2.Get(inzCodElementoScontrino.Tag))
			End If
		Case "GRP"
			If IsNumber(inzCodElementoScontrino.Tag) And inzCodElementoScontrino.Tag >= 0 Then
				i = inzCodElementoScontrino.Tag
			End If
			inzCodElementoScontrino.Tag = Sub052(i)
			If inzCodElementoScontrino.Tag < 0 Then
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", "NESSUNO")
			Else
				Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", vLst3.Get(inzCodElementoScontrino.Tag))
			End If
	End Select
	mod1.Sub081
End Sub

Sub inzCodElementoScontrino_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzCodElementoScontrino"))
End Sub

Sub inzDaData_Click
	Dim vObjectToString As String = inzDaData.Tag
	Dim vTmp As String = Sub017("Impostare la data di inizio offerta", DateUtils.setdate(vObjectToString.SubString2(0, 4), vObjectToString.SubString2(4, 6), vObjectToString.SubString2(6, 8)))
	If vTmp <= inzAData.Tag Then
		inzDaData.Tag = vTmp
		Sub001(inzDaData, "Offerta attiva dal : ", Sub006(inzDaData.Tag))
	Else
		Dim vObjectToCharSequence As Object = "Attenzione .... Verificare le date inserite."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub inzDaData_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzDaData"))
End Sub

Sub inzDaOra_Click
	Dim vTmp As String = Sub023("Impostare l'orario di inizio offerta")
	If vTmp < inzAOra.Tag Then
		inzDaOra.Tag = vTmp
		Dim vObjectToString As String = inzDaOra.Tag
		Sub001(inzDaOra, "Offerta attiva dalle ore : ", vObjectToString.SubString2(0, 2) & ":" & vObjectToString.SubString(2))
	Else
		Dim vObjectToCharSequence As Object = "Attenzione .... Verificare gli orari inseriti."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub inzDaOra_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzDaOra"))
End Sub

Sub inzDescrizione_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = ""
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	vDlg1.PasswordMode = False
	vDlg1.Hint = "descrizione"
	Dim vShow As Int = vDlg1.Show("Indicare la descrizione per l'offerta", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And vDlg1.Input.Length <= 50 Then
		Dim replace As String = vDlg1.Input.Replace(",", "").Replace("'", "")
		Sub001(inzDescrizione, "Descrizione offerta: ", replace)
		inzDescrizione.Tag = replace
	Else
		inzDescrizione.Text = "Inserire qui la descrizione per l'offerta "
		inzDescrizione.Tag = ""
	End If
	mod1.Sub081
End Sub

Sub inzDescrizione_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzDescrizione"))
End Sub

Sub inzElementoScontrino_Click
	Dim list As List
	list.Initialize
	list.Add("Articolo")
	list.Add("Totale Scontrino")
	list.Add("Reparto")
	list.Add("Gruppo")
	Dim vInputList As Int = InputList(list, "Indicare l'elemento che dovrà attivare l'offerta", Sub026(inzElementoScontrino.Tag))
	If vInputList < 0 Then
		Return
	End If
	inzElementoScontrino.Tag = Sub028(list.Get(vInputList))
	Sub001(inzElementoScontrino, "Elemento scontrino: ", list.Get(vInputList))
	If vInputList = 0 Or vInputList = 2 Or vInputList = 3 Then
		inzcodelementoscontrino_click()
	Else
		Sub001(inzCodElementoScontrino, "Codice Elemento scontrino: ", "NESSUNO")
		inzCodElementoScontrino.Tag = -1
	End If
	mod1.Sub081
End Sub

Sub inzElementoScontrino_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzElementoScontrino"))
End Sub

Sub inzEsclusivita_Click
	If inzEsclusivita.Tag = "C" Then
		inzEsclusivita.Text = "Una volta eseguita questa offerta non eseguire altre offerte"
		inzEsclusivita.Tag = "F"
	Else
		inzEsclusivita.Text = "Una volta eseguita questa offerta prosegui con le altre"
		inzEsclusivita.Tag = "C"
	End If
	mod1.Sub081
End Sub

Sub inzEsclusivita_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzEsclusivita"))
End Sub

Sub inzEsclutiNF_Click
	If inzEsclutiNF.Tag = "1" Then
		inzEsclutiNF.Text = "Non escludere gli articoli non fiscali dall'offerta"
		inzEsclutiNF.Tag = "0"
	Else
		inzEsclutiNF.Text = "Escludi gli articoli non fiscali dall'offerta"
		inzEsclutiNF.Tag = "1"
	End If
	mod1.Sub081
End Sub

Sub inzEsclutiNF_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzEsclutiNF"))
End Sub

Sub inzGiorni_Click
	Dim map As Map
	map.Initialize
	Dim vObjectToString As String = inzGiorni.Tag
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato")))
	Dim length As Int = vObjectToString.Length - 1
	Dim i As Int
	For i = 0 To length
		map.Put(list.Get(i), vObjectToString.SubString2(i, i + 1) = "1")
	Next
	InputMap(map, "Indicare i giorni della settimana in cui l'offerta è attiva")
	Dim str As String = ""
	Dim size As Int = map.Size - 1
	Dim i2 As Int
	For i2 = 0 To size
		str = str & IIf(map.GetValueAt(i2), "1", "0")
	Next
	inzGiorni.Tag = str
	mod1.Sub081
End Sub

Sub inzGiorni_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzGiorni"))
End Sub

Sub inzLimitaRicompense_Click
	If 1 = inzLimitaRicompense.Tag Then
		inzLimitaRicompense.Text = "Applica tutte le ricompense "
		inzLimitaRicompense.Tag = 0
	Else
		inzLimitaRicompense.Text = "Limita le ricompense al numero di vincoli superati"
		inzLimitaRicompense.Tag = 1
	End If
	mod1.Sub081
End Sub

Sub inzLimitaRicompense_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzLimitaRicompense"))
End Sub

Sub inzLinea_Click
	Dim vInputList As Int = InputList(vLst4, "Indicare a chi applicare l'offerta", inzLinea.Tag)
	If vInputList < 0 Then
		vInputList = 0
	End If
	Sub001(inzLinea, "Offerta attiva per : ", vLst4.Get(vInputList))
	inzLinea.Tag = vInputList
	mod1.Sub081
End Sub

Sub inzLinea_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzLinea"))
End Sub

Sub inzPriorita_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 4
	numberDialog.Number = inzPriorita.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire l'indice di priorità per questa iniziativa", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Sub001(inzPriorita, "Indice di priorità offerta : ", numberDialog.Number)
		inzPriorita.Tag = numberDialog.Number
	End If
	mod1.Sub081
End Sub

Sub inzPriorita_LongClick
	vBln4 = True
	Sub065(Sender, Sub019("inzPriorita"))
End Sub

Sub lblmainTitle_Click
End Sub

Sub Sub040
	vUltimateListView1.ClearContent
	Sub007()
	Main.vSql1.ExecNonQuery("insert into sortedMPIniziative([Descrizione],[ElementoScontrino], [CodElementoScontrino]," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice], [CodiceCondizione],[DataInizio], [DataFine]) " & SmartStringFormatter("", vStr3 & vStr2) & "  ")
	vUltimateListView1.BulkAddItems(Main.vSql1.ExecQuerySingleResult("Select count(*) from sortedMPIniziative"), "ROW", 0)
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select Descrizione from sortedMPIniziative")
End Sub

Sub Sub041(str As String)
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

Sub Sub042
	If Not(bNew.Enabled) Then
		Dim vObjectToCharSequence As Object = "Non Consentito."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	Dim vTmp As String = Sub024(False)
	If vTmp = "" Then
		mod1.Sub081
		Return
	End If
	bAddModNew(True, vTmp)
End Sub

Sub Ognilim_Click
	Dim vTmp As Int = vcustomlistviewold3.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(6)
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from MPLimitiRicompense where chiave=" & labelWrapper.Text)
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Dim str As String = "Indicare il valore in €"
		If Not(vBln3) Then
			str = "Indicare il numero di pezzi"
		End If
		Dim str2 As String = str & " per lo step (ogni)"
		If vBln3 Then
			Dim inputDialog2 As InputDialog = vDlg1
			vDlg1.InputType = 12290
		Else
			Dim inputDialog4 As InputDialog = vDlg1
			vDlg1.InputType = 2
		End If
		vDlg1.Input = ""
		vDlg1.Hint = str
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim vShow As Int = vDlg1.Show(str2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			If Not(IsNumber(vDlg1.Input)) Then
				Return
			End If
			Dim parseDouble As Int = vDlg1.Input
			If parseDouble > cursorWrapper2.GetInt("FineLR") - cursorWrapper2.GetInt("InizioLR") Or parseDouble < 0 Or (parseDouble = 0 And vCur4.GetString("TipoRicompensa") <> "SV" And vCur4.GetString("TipoRicompensa") <> "BV" And vCur4.GetString("TipoRicompensa") <> "uV" And vCur4.GetString("TipoRicompensa") <> "EV" And vCur4.GetString("TipoRicompensa") <> "RV") Then
				Dim vObjectToCharSequence As Object = "Il valore inserito non è valido"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else
				Main.vSql1.ExecNonQuery("Update MPLimitiRicompense set " & CRLF & TAB & TAB & TAB & TAB & " " & TAB & TAB & TAB & TAB & TAB & "PassoLR=" & SmartStringFormatter("", vDlg1.Input) & "  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where chiave=" & SmartStringFormatter("", labelWrapper.Text) & " ")
				labelWrapper2.Text = "Ogni " & Sub035(vDlg1.Input)
				If labelWrapper2.Text = "Ogni 0.00 €" Then
					labelWrapper2.Text = "Raggiunta la fascia"
				End If
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub Ognilim_LongClick
	Sub065(Sender, Sub019("OgniLim"))
End Sub

Sub pAnnulla_Click
	mod1.vStr2 = "Sub pAnnulla_Click"
	If PanVincoli.Visible Then
		PanVincoli.Visible = False
		Sub063(PanVincoli)
	Else If pnlLimiti.Visible Then
		pnlLimiti.Visible = False
		PanRicompense.Visible = True
		bGruppiRicompense.Visible = True
		bNewRicompensa.Visible = True
		lblPluTitle.Text = "Ricompense per l'offerta " & Main.vSql1.ExecQuerySingleResult("Select Descrizione from MPTitoloIniziative where Codice = '" & vStr1 & "'")
		Sub064(PanRicompense)
	Else If PanRicompense.Visible Then
		PanRicompense.Visible = False
		Sub064(PanRicompense)
	End If
	mod1.Sub081
End Sub

Sub PanRicompense_Click
End Sub

Sub PanVincoli_Click
End Sub

Sub pMenu_Click
End Sub

Sub pnlLimiti_Click
End Sub

Sub pnlWv_Click
End Sub

Sub Prioritaricompensa_Click
	Sub059(Sender)
	mod1.Sub081
End Sub

Sub Prioritaricompensa_LongClick
	Sub065(Sender, Sub019("PrioritaRicompensa"))
End Sub

Sub progressonly(z As Boolean, str As String)
	If z Then
		ProgressDialogShow2(str, False)
		DoEvents
		Return
	End If
	ProgressDialogHide
End Sub

Sub Raggruppamentovincolo_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(4)
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select GruppoVincolo from MPVincoli where chiave=" & labelWrapper.Text)
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = parseDouble
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il codice del raggruppamento del vincolo", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		labelWrapper2.Text = "Gruppo Vincolo = " & numberDialog.Number
		Main.vSql1.ExecNonQuery("update MPVincoli set GruppoVincolo = " & SmartStringFormatter("", numberDialog.Number) & " where chiave=" & SmartStringFormatter("", labelWrapper.Text) & "")
	End If
	mod1.Sub081
End Sub

Sub Raggruppamentovincolo_LongClick
	Sub065(Sender, Sub019("RaggruppamentoVincolo"))
End Sub

Sub Sub043
	vcustomlistviewold3.Sub004
	vBln3 = Sub036()
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select min(chiave) from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "")
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from MPLimitiRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='" & SmartStringFormatter("", vCur4.GetString("CodiceCondizione")) & "' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Priorita=" & SmartStringFormatter("", vCur4.GetString("Priorita")) & " order by InizioLR")
	Dim rowCount As Int = cursorWrapper2.RowCount - 1
	Dim vTmp As Int
	For vTmp = vcustomlistviewold3.Sub008 To rowCount
		cursorWrapper2.Position = vTmp
		vcustomlistviewold3.Sub001(Sub008(cursorWrapper2, DipToCurrent(70), vExecQuerySingleResult), DipToCurrent(70), "")
	Next
	vcustomlistviewold3.Sub012(cursorWrapper2.RowCount - 1)
End Sub

Sub Sub044(str As String, str2 As String, z As Boolean)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery(" SELECT [chiave]" & CRLF & TAB & TAB & ",[Codice]" & CRLF & TAB & TAB & ",[CodiceCondizione]" & CRLF & TAB & TAB & ",[VeriabileRicompensa]" & CRLF & TAB & TAB & ",[ElementoRicompensa]" & CRLF & TAB & TAB & ",[SogliaRicompensa]" & CRLF & TAB & TAB & ",[TipoRicompensa]" & CRLF & TAB & TAB & ",[DataInizioRedenzione]" & CRLF & TAB & TAB & ",[DataFineRedenzione]" & CRLF & TAB & TAB & ",[CodiceMessaggioCoupon]" & CRLF & TAB & TAB & ",[CumulabilitaRicompensa]" & CRLF & TAB & TAB & ",[TipoCalcoloScontoRicompensa]" & CRLF & TAB & TAB & ",[TipoStampaCouponRicompensa]" & CRLF & TAB & TAB & ",[Priorita]" & CRLF & TAB & TAB & ",[GruppoOrdinamentoRicompensa]" & CRLF & TAB & "FROM [MPRicompense] where Codice = '" & SmartStringFormatter("", str) & "' " & SmartStringFormatter("", str2) & " ")
	If Not(z) Then
		vcustomlistviewold2.Sub004
	End If
	If cursorWrapper2.RowCount > 0 Then
		If Not(z) Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				vcustomlistviewold2.Sub001(Sub009(cursorWrapper2, DipToCurrent(70)), DipToCurrent(70), "")
			Next
			vcustomlistviewold2.Sub012(0)
			Return
		End If
		Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
		Dim vTmp As Int
		For vTmp = vcustomlistviewold2.Sub008 To rowCount2
			cursorWrapper2.Position = vTmp
			vcustomlistviewold2.Sub001(Sub009(cursorWrapper2, DipToCurrent(70)), DipToCurrent(70), "")
		Next
		vcustomlistviewold2.Sub012(cursorWrapper2.RowCount - 1)
		Return
	End If
End Sub

Sub Sub045(str As String, str2 As String, z As Boolean)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery(" SELECT [chiave]" & CRLF & TAB & TAB & ",[Codice]" & CRLF & TAB & TAB & ",[CodiceCondizione]" & CRLF & TAB & TAB & ",[OggettoVincolo]" & CRLF & TAB & TAB & ",[ElementoVincolo]" & CRLF & TAB & TAB & ",[OperatoreVincolo]" & CRLF & TAB & TAB & ",[ModalitaConfrontoVincolo]" & CRLF & TAB & TAB & ",[ConfrontoVincolo]" & CRLF & TAB & TAB & ",[DataFineRedenzione]" & CRLF & TAB & TAB & ",[GruppoVincolo]" & CRLF & TAB & "FROM [MPVincoli] where Codice = '" & SmartStringFormatter("", str) & "' " & SmartStringFormatter("", str2) & " ")
	If Not(z) Then
		vcustomlistviewold1.Sub004
	End If
	If cursorWrapper2.RowCount > 0 Then
		If Not(z) Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				vcustomlistviewold1.Sub001(Sub010(cursorWrapper2, DipToCurrent(70)), DipToCurrent(70), "")
			Next
			vcustomlistviewold1.Sub012(0)
			Return
		End If
		Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
		Dim vTmp As Int
		For vTmp = vcustomlistviewold1.Sub008 To rowCount2
			cursorWrapper2.Position = vTmp
			vcustomlistviewold1.Sub001(Sub010(cursorWrapper2, DipToCurrent(70)), DipToCurrent(70), "")
		Next
		vcustomlistviewold1.Sub012(cursorWrapper2.RowCount - 1)
		Return
	End If
End Sub

Sub Ricompensa_Click
	Dim vTmp As Int = vcustomlistviewold2.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(1)
	If Sub060(Sender) = 1 Then
		Sub061(labelWrapper)
	End If
	mod1.Sub081
End Sub

Sub Ricompensa_LongClick
	Sub065(Sender, Sub019("Ricompensa"))
End Sub

Sub Sub046(cursorWrapper As Cursor) As List
	Dim list As List
	list.Initialize
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		list.Add(cursorWrapper.GetString2(2).Replace("/n", CRLF))
	Next
	Return list
End Sub

Sub Sub047(cursorWrapper As Cursor) As List
	Dim list As List
	list.Initialize
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		list.Add("Codice : " & cursorWrapper.GetString("CodiceGruppoRicompensa") & CRLF & "Limite numero articoli nel gruppo ai quali verrà applicata l'offerta :" & cursorWrapper.GetString("NumeroRicompenseGruppo"))
	Next
	Return list
End Sub

Sub Sub048(cursorWrapper As Cursor) As Map
	Dim map As Map
	map.Initialize
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		map.Put(cursorWrapper.GetString2(1), i)
	Next
	Return map
End Sub

Sub Sub049(cursorWrapper As Cursor) As Map
	Dim map As Map
	map.Initialize
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		map.Put(cursorWrapper.GetString("CodiceGruppoRicompensa"), i)
	Next
	Return map
End Sub

Sub Sub050(randomAccessFile As RandomAccessFile, str As String)
	randomAccessFile.WriteObject("", True, randomAccessFile.CurrentPosition)
	randomAccessFile.WriteObject(str, True, randomAccessFile.CurrentPosition)
End Sub

Sub Segnolim_Click
	Dim str As String
	Dim z As Boolean
	Dim parseDouble As Int
	Dim vTmp As Int = vcustomlistviewold3.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(6)
	Dim labelWrapper2 As Label = getpanel.GetView(4)
	If Main.vSql1.ExecQuerySingleResult("select SegnoLR from MPLimitiRicompense where chiave=" & labelWrapper.Text) = "+" Then
		str = "-"
	Else
		str = "+"
	End If
	labelWrapper2.Text = str
	If vCur4.GetString("TipoRicompensa") = "AQ" Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Sconto da applicare"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Indicare la percentuale di sconto da applicare per ogni articolo scontato", Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
		If vShow <> -1 Or Not(IsNumber(vDlg1.Input)) Or parseDouble = vDlg1.Input < 0 Or parseDouble > 100 Then
			z = True
		Else
			str = parseDouble
			labelWrapper2.Text = str & "% di sconto"
			z = False
		End If
		If z Then
			Return
		End If
	End If
	Main.vSql1.ExecNonQuery("Update MPLimitiRicompense set" & CRLF & TAB & TAB & TAB & TAB & " " & TAB & TAB & TAB & TAB & TAB & "SegnoLR='" & SmartStringFormatter("", str) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where chiave=" & SmartStringFormatter("", labelWrapper.Text) & " ")
End Sub

Sub Segnolim_LongClick
	Sub065(Sender, Sub019("SegnoLim"))
End Sub

Sub Sub051 As String
	Dim str As String
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("Descrizione", "Reparto", "Codice Articolo", "Codice a Barre", "Chiudi")))
	Dim vInputList As Int = InputList(list, "Indicare il tipo di ricerca articolo ", -1)
	If vInputList < 0 Then
		Return ""
	End If
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = ""
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	vDlg1.PasswordMode = False
	Select vInputList
		Case 0
			vDlg1.Hint = "descrizione"
			Dim vShow As Int = vDlg1.Show("Indicare la descrizione da cercare (almeno 3 caratteri)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow = -1 And vDlg1.Input.Length >= 3 Then
				str = " descrizione like '%" & vDlg1.Input.Replace(",", "").Replace("'", "") & "%' "
			End If
			str = ""
		Case 1
			Dim vTmp As Int = Sub053(-1)
			If vTmp >= 0 Then
				str = " reparto= " & vTmp & " "
			End If
			str = ""
		Case 2
			vDlg1.Hint = "Codice articolo"
			Dim vShow2 As Int = vDlg1.Show("Indicare il codice articolo da cercare", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow2 = -1 Then
				str = " codint= '" & vDlg1.Input.Replace(",", "").Replace("'", "") & "' "
			End If
			str = ""
		Case 3
			vDlg1.Hint = "Codice a barre"
			Dim vShow3 As Int = vDlg1.Show("Indicare il barcode da cercare", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow3 = -1 Then
				str = " (Select count(*) from ean where ean.codint = anagra.codint and ean.codice = '" & vDlg1.Input.Replace(",", "").Replace("'", "") & "')"
			End If
			str = ""
		Case Else
			str = ""
	End Select
	If str <> "" Then
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codint,descrizione,list1 from anagra where " & (str & " and bvar=0 ") & " order by descrizione")
		If cursorWrapper2.RowCount > 0 Then
			Dim list2 As List
			list2.Initialize
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper2.Position = i
				Dim vSize As CSBuilder = vCSBuilder1.Initialize.Size(14)
				vSize.Typeface(Typeface.MONOSPACE)
				vCSBuilder1.Color(-65536)
				vCSBuilder1.Append(modfunstr.left(cursorWrapper2.GetString("codint") & modfunstr.Sub004(16), 16))
				vCSBuilder1.Pop
				vCSBuilder1.Append(modfunstr.left(cursorWrapper2.GetString("descrizione") & modfunstr.Sub004(30), 30))
				vCSBuilder1.Append(modfunstr.Sub003(modfunstr.Sub004(9) & NumberFormat2(cursorWrapper2.GetString("list1"), 1, 2, 2, False), 9))
				list2.Add(vCSBuilder1.PopAll)
			Next
			Dim vInputList2 As Int = InputList(list2, "Selezionare un articolo dalla lista", -1)
			If vInputList2 < 0 Then
				Return ""
			End If
			cursorWrapper2.Position = vInputList2
			Return cursorWrapper2.GetString("codint")
		End If
		cursorWrapper2.Close
	End If
	Return ""
End Sub

Sub Sub052(i As Int) As Int
	Return InputList(vLst3, "Selezionare il gruppo ", i)
End Sub

Sub Sub053(i As Int) As Int
	Return InputList(vLst2, "Selezionare il reparto ", i)
End Sub

Sub Sub054(imageViewWrapper As ImageView)
	Dim vObjectToNumber As Int = imageViewWrapper.Tag
	If vObjectToNumber < 0 Then
		Return
	End If
	vStr1 = Main.vSql1.ExecQuerySingleResult("SELECT Codice from sortedMPIniziative  WHERE rowid=" & vObjectToNumber + 1)
	vInt1 = vObjectToNumber
	vLst1.Clear
	vLst1.Add("Modifica")
	vLst1.Add("Elimina")
	vLst1.Add("Vincoli")
	vLst1.Add("Ricompense")
	vLst1.Add("Esporta")
	Dim popupMenuWrapper As PopupMenu
	vLst1.Add("Esci")
	If vLst1.Size > 1 Then
		popupMenuWrapper.Initialize("AC", imageViewWrapper)
		Dim size As Int = vLst1.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim bitmapDrawable As BitmapDrawable
			Dim str As String = ""
			Select vLst1.Get(i)
				Case "Modifica"
					str = "fun_pencil-red.png"
				Case "Elimina"
					str = "006.png"
				Case "Vincoli"
					str = "fca_lucchetto.png"
				Case "Ricompense"
					str = "117.png"
				Case "Esporta"
					str = "refresh palmari_48.png"
				Case "Esci"
					str = "014.png"
			End Select
			Dim vObjectToString As String = vLst1.Get(i)
			bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
			popupMenuWrapper.AddMenuItem(i, vObjectToString, bitmapDrawable)
		Next
	End If
	Sub066(imageViewWrapper)
	popupMenuWrapper.Show
End Sub

Sub Sub055 As Int
	Dim vNumberToString As String
	Dim i As Int = -1
	Dim list As List
	list.Initialize
	list.Add("Articolo")
	list.Add("Totale Scontrino")
	list.Add("Reparto")
	list.Add("Gruppo")
	Dim vInputList As Int = InputList(list, "Indicare il tipo di ricompensa", Sub026(vCur4.GetString("VeriabileRicompensa")))
	If vInputList < 0 Then
		Return 0
	End If
	Dim vTmp As String = Sub028(list.Get(vInputList))
	Dim str As String = ""
	If vInputList = 0 Or vInputList = 2 Or vInputList = 3 Then
		Select vTmp
			Case "ART"
				vNumberToString = Sub051()
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPMixArticoli where codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceCondizione='123' and " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "CodiceArticolo='" & SmartStringFormatter("", vNumberToString) & "' and MixCode='" & SmartStringFormatter("", vCur4.GetString("Priorita")) & "' ") > 0 Then
					Dim vObjectToCharSequence As Object = "Non è possibile inserire questo articolo come ricompensa in quanto è già presente nel MIX della stessa ricompensa"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					vNumberToString = ""
				End If
			Case "REP"
				If "" <> "" And "" >= 0 Then
					i = ""
				End If
				vNumberToString = Sub053(i)
			Case "GRP"
				If "" <> "" And "" >= 0 Then
					i = ""
				End If
				vNumberToString = Sub052(i)
			Case Else
				vNumberToString = ""
		End Select
		If vNumberToString = "" Then
			Return 0
		End If
		str = vNumberToString
	End If
	Main.vSql1.ExecNonQuery("update MPRicompense set VeriabileRicompensa= '" & SmartStringFormatter("", vTmp) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",ElementoRicompensa='" & SmartStringFormatter("", str) & "' " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where chiave = " & SmartStringFormatter("", vCur4.GetString("chiave")) & "")
	Dim cursorWrapper As Cursor
	vCur4 = Main.vSql1.ExecQuery("select * from MPRicompense where chiave=" & vCur4.GetString("chiave"))
	vCur4.Position = 0
	Return IIf(vTmp = "SCO" And Not(Sub004(vCur4.GetString("TipoRicompensa"))), 1, 2)
End Sub

Sub Sub056 As Boolean
	Dim vObjectToString As String
	Dim i As Int = -1
	Dim list As List
	list.Initialize
	list.Add("Articolo")
	list.Add("Totale Scontrino")
	list.Add("Reparto")
	list.Add("Coupon")
	list.Add("Montante punti")
	list.Add("Gruppo")
	Dim vInputList As Int = InputList(list, "Indicare il tipo di vincolo", Sub026(vCur3.GetString("OggettoVincolo")))
	If vInputList < 0 Then
		Return False
	End If
	Dim vTmp As String = Sub028(list.Get(vInputList))
	Dim str As String = ""
	If vInputList = 0 Or vInputList = 2 Or vInputList = 3 Or vInputList = 5 Then
		Select vTmp
			Case "ART"
				vObjectToString = Sub051()
			Case "REP"
				If "" <> "" And "" >= 0 Then
					i = ""
				End If
				vObjectToString = Sub053(i)
			Case "GRP"
				If "" <> "" And "" >= 0 Then
					i = ""
				End If
				vObjectToString = Sub052(i)
			Case "COU"
				If vLst5.Size = 0 Then
					Dim vObjectToCharSequence As Object = "Attenzione .... Nessun coupon inserito."
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					vObjectToString = ""
				Else
					Dim vInputList2 As Int = InputList(vLst5, "Selezionare il coupon necessario per superare il vincolo", -1)
					If vInputList2 >= 0 Then
						vObjectToString = vLst5.Get(vInputList2)
					End If
				End If
			Case Else
				vObjectToString = ""
		End Select
		If vObjectToString = "" Then
			Return False
		End If
		str = vObjectToString
	End If
	Main.vSql1.ExecNonQuery("update MPVincoli set OggettoVincolo= '" & SmartStringFormatter("", vTmp) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",ElementoVincolo='" & SmartStringFormatter("", str) & "' " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where chiave = " & SmartStringFormatter("", vCur3.GetString("chiave")) & "")
	Dim cursorWrapper As Cursor
	vCur3 = Main.vSql1.ExecQuery("select * from MPVincoli where chiave=" & vCur3.GetString("chiave"))
	vCur3.Position = 0
	Return True
End Sub

Sub Sub057(concreteViewWrapper As View) As Boolean
	Dim vTmp As Int = vcustomlistviewold1.Sub007(concreteViewWrapper)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(4)
	Dim labelWrapper2 As Label = getpanel.GetView(0)
	Dim cursorWrapper As Cursor
	vCur3 = Main.vSql1.ExecQuery("select * from MPVincoli where chiave=" & labelWrapper.Text)
	If vCur3.RowCount <= 0 Then
		Return False
	End If
	vCur3.Position = 0
	If Not(Sub056()) Then
		Return False
	End If
	Dim vTmp_ As String = Sub027(vCur3.GetString("OggettoVincolo"))
	If vCur3.GetString("ElementoVincolo") <> "" Then
		vTmp_ = vTmp_ & " codice " & vCur3.GetString("ElementoVincolo")
		Dim vTmp__ As String = Sub025(vCur3.GetString("OggettoVincolo"), vCur3.GetString("ElementoVincolo"))
		If vTmp__ <> "" Then
			vTmp_ = vTmp_ & " (" & vTmp__ & ")"
		End If
	End If
	labelWrapper2.Text = "Vincolo su " & vTmp_
	Return True
End Sub

Sub Sub058(concreteViewWrapper As View) As Boolean
	Dim vTmp As Int = vcustomlistviewold2.Sub007(concreteViewWrapper)
	Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(7)
	Dim labelWrapper2 As Label = getpanel.GetView(3)
	Dim cursorWrapper As Cursor
	vCur4 = Main.vSql1.ExecQuery("select * from MPRicompense where chiave=" & labelWrapper.Text)
	If vCur4.RowCount > 0 Then
		vCur4.Position = 0
		Dim str As String = "Select * from MPRicompenseGruppi where codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "'"
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery(str)
		Dim vTmp_ As List = Sub047(cursorWrapper3)
		Dim vTmp__ As Map = Sub049(cursorWrapper3)
		Dim vInputList As Int = InputList(vTmp_, "Selezionare un Raggruppamento per la ricompensa", vTmp__.GetDefault(vCur4.GetString("GruppoOrdinamentoRicompensa"), -1))
		If vInputList < 0 Then
			Return False
		End If
		Dim vObjectToString As String = vTmp__.GetKeyAt(vInputList)
		Main.vSql1.ExecNonQuery("update MPRicompense set" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " GruppoOrdinamentoRicompensa ='" & SmartStringFormatter("", vObjectToString) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " where chiave ='" & SmartStringFormatter("", labelWrapper.Text) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB)
		labelWrapper2.Text = "Gruppo : " & vObjectToString
		Return True
	End If
	Dim vObjectToCharSequence As Object = "Nessun Gruppo Ricompense inserito per questa offerta."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Return False
End Sub

Sub Sub059(concreteViewWrapper As View) As Boolean
	Dim vTmp As Int = vcustomlistviewold2.Sub007(concreteViewWrapper)
	Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(7)
	Dim labelWrapper2 As Label = getpanel.GetView(2)
	Dim cursorWrapper As Cursor
	vCur4 = Main.vSql1.ExecQuery("select * from MPRicompense where chiave=" & labelWrapper.Text)
	If vCur4.RowCount <= 0 Then
		Return False
	End If
	vCur4.Position = 0
	Dim z As Boolean = False
	Dim z2 As Boolean = False
	Do While Not(z)
		Dim numberDialog As NumberDialog
		numberDialog.Digits = 3
		numberDialog.Number = vCur4.GetInt("Priorita")
		numberDialog.Decimal = 0
		numberDialog.ShowSign = False
		Dim vShow As Int = numberDialog.Show("Inserire la priorità per questa ricompensa", "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from MPRicompense" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where Codice = '" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and Priorita = " & SmartStringFormatter("", numberDialog.Number) & "") > 0 Then
				Dim vObjectToCharSequence As Object = "Indice di priorità già utilizzato in un'altra ricompensa di questa offerta."
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else
				labelWrapper2.Text = "Priorità : " & numberDialog.Number
				Main.vSql1.ExecNonQuery("update MPLimitiRicompense set Priorita = " & SmartStringFormatter("", numberDialog.Number) & " where codice ='" & SmartStringFormatter("", vCur4.GetString("Codice")) & "' and Priorita = " & SmartStringFormatter("", vCur4.GetString("Priorita")) & "")
				Main.vSql1.ExecNonQuery("update MPRicompense set Priorita = " & SmartStringFormatter("", numberDialog.Number) & " where chiave=" & SmartStringFormatter("", labelWrapper.Text) & "")
				z = True
				z2 = True
			End If
		Else
			z = True
		End If
	Loop
	Return z2
End Sub

Sub Sub060(concreteViewWrapper As View) As Int
	Dim i As Int = 0
	Dim vTmp As Int = vcustomlistviewold2.Sub007(concreteViewWrapper)
	Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(7)
	Dim labelWrapper2 As Label = getpanel.GetView(0)
	Dim cursorWrapper As Cursor
	vCur4 = Main.vSql1.ExecQuery("select * from MPRicompense where chiave=" & labelWrapper.Text)
	If vCur4.RowCount > 0 Then
		vCur4.Position = 0
		i = Sub055()
		If i <> 0 Then
			Dim vTmp_ As String = Sub027(vCur4.GetString("VeriabileRicompensa"))
			If vCur4.GetString("ElementoRicompensa") <> "" Then
				vTmp_ = vTmp_ & " codice " & vCur4.GetString("ElementoRicompensa")
				Dim vTmp__ As String = Sub025(vCur4.GetString("VeriabileRicompensa"), vCur4.GetString("ElementoRicompensa"))
				If vTmp__ <> "" Then
					vTmp_ = vTmp_ & " (" & vTmp__ & ")"
				End If
			End If
			labelWrapper2.Text = "Ricompensa su " & vTmp_
		Else
			Return i
		End If
	End If
	Return i
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/iniziative.java, metodo m7… (riga 5553).
Sub Sub061(concreteViewWrapper As View) As Boolean
	Dim vTmp As Int = vcustomlistviewold2.Sub007(concreteViewWrapper)
	Dim getpanel As Panel = vcustomlistviewold2.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(7)
	Dim labelWrapper2 As Label = getpanel.GetView(1)
	Dim cursorWrapper As Cursor
	vCur4 = Main.vSql1.ExecQuery("select * from MPRicompense where chiave=" & labelWrapper.Text)
	If vCur4.RowCount > 0 Then
		vCur4.Position = 0
		Do While True
			Dim vInputList As Int = InputList(vLst6, "Indicare su cosa avrà effetto la ricompensa:", Sub034(vCur4.GetString("TipoRicompensa")))
			If vInputList < 0 Then
				Return False
			End If
			If vCur4.GetString("VeriabileRicompensa") = "SCO" And Not(Sub004(Sub018(vInputList))) Then
				Dim vObjectToCharSequence As Object = "Tipo ricompensa non gestita sulla modalità scontrino"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else If (vCur4.GetString("VeriabileRicompensa") = "REP" Or vCur4.GetString("VeriabileRicompensa") = "GRP") And Not(Sub003(Sub018(vInputList))) Then
				Dim vObjectToCharSequence3 As Object = "Tipo ricompensa non gestita sulla modalità reparto o gruppo"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			End If
		Loop
	End If
	Return True
End Sub

Sub Sub062(concreteViewWrapper As View) As Boolean
	Dim str As String
	Dim vTmp As String
	Dim vTmp_ As Int = vcustomlistviewold1.Sub007(concreteViewWrapper)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp_)
	Dim labelWrapper As Label = getpanel.GetView(4)
	Dim labelWrapper2 As Label = getpanel.GetView(1)
	Dim cursorWrapper As Cursor
	vCur3 = Main.vSql1.ExecQuery("select * from MPVincoli where chiave=" & labelWrapper.Text)
	If vCur3.RowCount > 0 Then
		vCur3.Position = 0
		Dim str2 As String = ""
		If vCur3.GetString("OggettoVincolo") = "ACM" Then
			str = ""
			vTmp = "Q"
		Else If vCur3.GetString("OggettoVincolo") <> "COU" Then
			str = ""
			vTmp = Sub022(IIf(vCur3.GetString("ModalitaConfrontoVincolo") = "Q", 0, 1), "Indicare se il vincolo deve verificare le quantità o il valore")
		Else
			Dim str3 As String = "Q"
			Dim map As Map
			map.Initialize
			map.Put("Verifica che il totale scontrino sia più alto del valore del Coupon", vCur3.GetString("ModalitaConfrontoVincolo").Contains("T"))
			map.Put("Accetta solo Coupon emessi da questo negozio", vCur3.GetString("ModalitaConfrontoVincolo").Contains("N"))
			InputMap(map, "Se necessario , attivare una delle opzioni ...")
			If map.GetValueAt(0) Then
				str3 = "QT"
				str2 = " e il totale scontrino è più alto del valore del coupon"
			End If
			If map.GetValueAt(1) Then
				str = str2 & " e il Coupon è stato emesso da questo negozio"
				vTmp = str3 & "N"
			Else
				str = str2
				vTmp = str3
			End If
		End If
		If vTmp = "" Then
			Return False
		End If
		Dim vObjectToString As String = IIf(vTmp.Contains("Q"), " la quantità è ", " il valore è ")
		Dim vTmp__ As String = Sub037(Sub038(vCur3.GetString("OperatoreVincolo")), "Selezionare un operatore (" & vObjectToString & ") ")
		If vTmp__ = "" Then
			Return False
		End If
		Dim str4 As String = vObjectToString & Sub029(vTmp__)
		Dim str5 As String = "Quantità"
		Dim str6 As String = "Inserire la quantità (" & str4 & ")"
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		If Not(vTmp.Contains("Q")) Then
			str5 = "Valore"
			str6 = "Inserire il Valore (" & str4 & ")"
			Dim inputDialog4 As InputDialog = vDlg1
			vDlg1.InputType = 12290
		End If
		vDlg1.Input = ""
		vDlg1.Hint = str5
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim vShow As Int = vDlg1.Show(str6, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And IsNumber(vDlg1.Input) And vDlg1.Input.Length <= 999999 Then
			If vTmp <> "Q" Then
				vDlg1.Input = NumberFormat2(vDlg1.Input, 1, 2, 2, False)
			End If
			Main.vSql1.ExecNonQuery("update " & TAB & "MPVincoli set " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ModalitaConfrontoVincolo='" & SmartStringFormatter("", vTmp) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "OperatoreVincolo='" & SmartStringFormatter("", vTmp__) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ConfrontoVincolo=" & SmartStringFormatter("", vDlg1.Input) & " where" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "chiave = " & SmartStringFormatter("", labelWrapper.Text) & "")
			labelWrapper2.Text = " superato quando " & (str4 & vDlg1.Input & IIf(vTmp.Contains("Q"), "", " €")) & str
			Return True
		End If
	End If
	Return False
End Sub

Sub Sub063(panelWrapper As Panel)
	lblPluTitle.Visible = panelWrapper.Visible
	pAnnulla.Visible = panelWrapper.Visible
	bNewVincolo.Visible = panelWrapper.Visible
	bMsgVisualizza.Visible = Not(panelWrapper.Visible)
End Sub

Sub Sub064(panelWrapper As Panel)
	lblPluTitle.Visible = panelWrapper.Visible
	pAnnulla.Visible = panelWrapper.Visible
	bNewRicompensa.Visible = panelWrapper.Visible
	bGruppiRicompense.Visible = panelWrapper.Visible
	bMsgVisualizza.Visible = Not(panelWrapper.Visible)
End Sub

Sub Sub065(concreteViewWrapper As View, str As String)
	If vBln4 Then
		Dim vObjectToCharSequence As Object = str
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		vBln4 = False
		Return
	End If
	Dim builderWrapper As Builder
	builderWrapper.Initialize("Tips")
	builderWrapper.Target = concreteViewWrapper.Title = "Info Offerte"
	builderWrapper.Description = str
	builderWrapper.DescriptionColor = -256
	builderWrapper.CircleColor = -256
	builderWrapper.ButtonText = "Chiudi"
	builderWrapper.show
End Sub

Sub sOrdinaRicompense_ItemClick(i As Int, obj As Object)
	Select i
		Case 0
			Sub044(vStr1, " order by chiave", False)
		Case 1
			Sub044(vStr1, " order by VeriabileRicompensa", False)
		Case 2
			Sub044(vStr1, " order by GruppoOrdinamentoRicompensa", False)
		Case 3
			Sub044(vStr1, " order by Priorita", False)
	End Select
End Sub

Sub sOrdinaVincoli_ItemClick(i As Int, obj As Object)
	Select i
		Case 0
			Sub045(vStr1, " order by chiave", False)
		Case 1
			Sub045(vStr1, " order by OggettoVincolo", False)
		Case 2
			Sub045(vStr1, " order by GruppoVincolo", False)
	End Select
End Sub

Sub sort_async
	Sub007()
	Dim sb As String = "insert into sortedMPIniziative([Descrizione],[ElementoScontrino], [CodElementoScontrino]," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice], [CodiceCondizione],[DataInizio], [DataFine]) " & SmartStringFormatter("", vStr3) & "  "
	Dim str As String = ""
	If Not(vBln2) Then
		str = " DESC"
	End If
	Select vByt1
		Case 0
			vStr2 = " order by Descrizione "
		Case 1
			vStr2 = " order by MPIniziative.Codice" & str & ",Descrizione"
		Case 2
			vStr2 = " order by Descrizione" & str
		Case 3
			vStr2 = " order by ElementoScontrino" & str & ",Descrizione"
		Case 4
			vStr2 = " order by DataInizio" & str & ",Descrizione"
		Case 5
			vStr2 = " order by DataFine" & str & ",Descrizione"
		Case 6
			vStr2 = " order by Descrizione "
	End Select
	Main.vSql1.ExecNonQuery(sb & vStr2)
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
	vLabelArr1(vByt1).Background = vColorDrawable1
	sort_async()
End Sub

Sub sRicerca_ItemClick(i As Int, obj As Object)
	Select i
		Case 0
			Sub002("Descrizione")
		Case 1
			Sub002("Codice")
		Case 2
			Sub002("Tutti")
	End Select
End Sub

Sub Sub066(concreteViewWrapper As View)
	a1.InitializeRotateCenter("", 0, 180, concreteViewWrapper)
	a1.Duration = 1000
	a1.RepeatCount = 1
	Dim animationWrapper2 As Animation = a1
	a1.RepeatMode = 2
	a1.Start(concreteViewWrapper)
End Sub

Sub Timerbarcode_Tick
	v5.Enabled = False
	imericerca_handleaction()
	mod1.Sub081
End Sub

Sub Tiporicompensa_Click
	Sub061(Sender)
	mod1.Sub081
End Sub

Sub Tiporicompensa_LongClick
	Sub065(Sender, Sub019("TipoRicompensa"))
End Sub

Sub Tipovincolo_Click
	Sub062(Sender)
	mod1.Sub081
End Sub

Sub Tipovincolo_LongClick
	Sub065(Sender, Sub019("TipoVincolo"))
End Sub

Sub Ulv_Scrolled(i As Int, i2 As Int, i3 As Int, z As Boolean, z2 As Boolean)
	Try
		If i <> vInt7 Then
			vInt7 = i
			Dim fastScrollerState As Int = vUltimateListView1.FastScrollerState
			Dim ultimateListViewWrapper As UltimateListView = vUltimateListView1
			If fastScrollerState = 2 Then
				If vStr2.StartsWith(" order by Descrizione") Then
					v6.Enabled = False
					Dim vGetItemID As Int = vUltimateListView1.GetItemID(i)
					If vGetItemID < 0 Then
						Return
					End If
					vCur2.Position = vGetItemID
					If vCur2.GetString("Descrizione").Length < 2 Then
						Return
					End If
					LblInfo.Text = vCur2.GetString("Descrizione").SubString2(0, 2).ToUpperCase
					LblInfo.Visible = True
					v6.Enabled = True
				End If
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Ulv_ScrollStateChanged(i As Int)
End Sub

Sub Valorelim_Click
	Dim vTmp As Int = vcustomlistviewold3.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold3.getpanel(vTmp)
	Dim labelWrapper As Label = getpanel.GetView(6)
	Dim labelWrapper2 As Label = getpanel.GetView(3)
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from MPLimitiRicompense where chiave=" & labelWrapper.Text)
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		Dim vTmp_ As String = Sub033()
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		vDlg1.Input = ""
		vDlg1.Hint = vTmp_
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim vShow As Int = vDlg1.Show(vTmp_, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			If Not(IsNumber(vDlg1.Input)) Then
				Return
			End If
			Dim parseDouble As Int = vDlg1.Input
			If parseDouble > Sub032(cursorWrapper2.GetInt("PassoLR"), cursorWrapper2.GetInt("FineLR") - cursorWrapper2.GetInt("InizioLR")) Or parseDouble < 0 Then
				Dim vObjectToCharSequence As Object = "Il valore inserito non è valido"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Else
				Main.vSql1.ExecNonQuery("Update MPLimitiRicompense set" & CRLF & TAB & TAB & TAB & TAB & " " & TAB & TAB & TAB & TAB & TAB & "ValoreLR=" & SmartStringFormatter("", vDlg1.Input) & "  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "where chiave=" & SmartStringFormatter("", labelWrapper.Text) & " ")
				labelWrapper2.Text = Sub031(vDlg1.Input)
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub Valorelim_LongClick
	Sub065(Sender, Sub019("ValoreLim"))
End Sub

Sub Vincolo_Click
	Sub057(Sender)
	mod1.Sub081
End Sub

Sub Vincolo_LongClick
	Sub065(Sender, Sub019("Vincolo"))
End Sub

Sub visibilitychanged_event(str As String, objArr As Object()) As Object
	mod1.Sub081
	Return Null
End Sub

Sub Sub067(cursorWrapper As Cursor, str As String) As Int
	Dim list As List
	list.Initialize
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		Dim vSize As CSBuilder = vCSBuilder1.Initialize.Size(14)
		vSize.Typeface(Typeface.MONOSPACE)
		vCSBuilder1.Append(modfunstr.left("Codice " & cursorWrapper.GetString("CodiceArticolo") & modfunstr.Sub004(20), 20))
		vCSBuilder1.Color(-65536)
		vCSBuilder1.Append(modfunstr.left("Descrizione " & cursorWrapper.GetString("descrizione") & modfunstr.Sub004(50), 50))
		list.Add(vCSBuilder1.PopAll)
	Next
	If list.Size <> 0 Then
		Return InputList(list, str, -1)
	End If
	Dim vObjectToCharSequence As Object = "Nessun articolo nel MIX di questa ricompensa"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	mod1.Sub081
	Return -1
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

