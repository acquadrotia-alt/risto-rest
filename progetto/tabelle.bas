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
	Public v7 As Timer
	Public v0 As Int = -1
	Public vBln1 As Boolean
	Public vBln2 As Boolean
	Public vBln3 As Boolean
	Public vInt1 As Int = -1
	Public vInt2 As Int
	Public m_nuovo As Int = 1
	Public m_rcodice As Int = 2
	Public m_rdescrizione As Int = 3
	Public m_rcodint As Int = 4
	Public m_rreparto As Int = 5
	Public m_rtutti As Int = 10
	Public vBln4 As Boolean
	Public vStr1 As String
	Public vBln5 As Boolean
	Public vStr2 As String
	Public vInt3 As Int
	Public vInt4 As Int
	Public vBln6 As Boolean
	Public vBln7 As Boolean = True
	Public vInt5 As Int = DipToCurrent(54)
	Public vInt6 As Int = DipToCurrent(60)
	Public vInt7 As Int = DipToCurrent(1)
	Public vIntArr1 As Int() = Array As Int(PerXToCurrent(7), PerXToCurrent(11), PerXToCurrent(26), PerXToCurrent(14), PerXToCurrent(10), PerXToCurrent(10), PerXToCurrent(12), PerXToCurrent(10))
	Public vInt8 As Int = PerXToCurrent(100)
	Public vInt9 As Int
	Public vInt10 As Int = -1
	Public vStr3 As String
	Public vByt1 As Byte = -1
	Public vBln8 As Boolean
	Public vStr4 As String = " order by Descrizione"
	Public vStr5 As String
	Public vStr6 As String
	Public vStr7 As String
	Public vStr8 As String = " asc"
	Public vInt11 As Int
	Public vBln9 As Boolean
	Public vDbl1 As Double
	Public vInt12 As Int
	Public vInt13 As Int = 1
	Public vStr9 As String
	Public vInt14 As Int
	Public vInt15 As Int
	Public vInt16 As Int
	Public vBln10 As Boolean
	Public vBln11 As Boolean
	Public vStr10 As String
	Public vStr11 As String
	Public vStr12 As String
	Public vStr13 As String
	Public vInt17 As Int
	Public vBln12 As Boolean = True
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public vDlg1 As InputDialog
	Public bNew As Button
	Public vcustomlistviewold1 As customlistviewold
	Public vWebView1 As WebView
	Public vLst1 As List
	Public a1 As Animation
	Public vCur1 As Cursor
	Public vLst2 As List
	Public vCur2 As Cursor
	Public vCur3 As Cursor
	Public vCur4 As Cursor
	Public vCur5 As Cursor
	Public vLst3 As List
	Public vLst4 As List
	Public vLst5 As List
	Public vLst6 As List
	Public vCur6 As Cursor
	Public vCur7 As Cursor
	Public vCur8 As Cursor
	Public vLst7 As List
	Public vLst8 As List
	Public vLst9 As List
	Public vUltimateListView1 As UltimateListView
	Public vColorDrawable1 As ColorDrawable
	Public vLabelArr1(8) As Label
	Public LblInfo As Label
	Public vCur9 As Cursor
	Public vCur10 As Cursor
	Public vMap1 As Map
	Public vLst10 As List
	Public vCSBuilder1 As CSBuilder
	Public Edt1 As EditText
	Public vIME1 As IME
	Public vIME2 As IME
	Public pCodint As EditText
	Public pDes As EditText
	Public pIva As Spinner
	Public pPlu As Panel
	Public pPrezzo As EditText
	Public pRep As Spinner
	Public pAddC As EditText
	Public pElencoCod As Spinner
	Public pLista As Panel
	Public lBil As Label
	Public pBil As Spinner
	Public Lcod As Label
	Public LelencoCod As Label
	Public LPrz As Label
	Public LPrz2 As Label
	Public LPrz3 As Label
	Public LPrz4 As Label
	Public pPrezzo2 As EditText
	Public pPrezzo3 As EditText
	Public pPrezzo4 As EditText
	Public Prezzo5 As EditText
	Public Sottoscorta As EditText
	Public vLst11 As List
	Public vMap2 As Map
	Public vMap3 As Map
	Public pSco As EditText
	Public pScov As EditText
	Public vCur11 As Cursor
	Public lPrza As Label
	Public lSco As Label
	Public lScov As Label
	Public lSottos As Label
	Public Addrep As Button
	Public vLst12 As List
	Public LIngredienti As Button
	Public pIngredienti As Spinner
	Public IngrMF As CheckBox
	Public IngrNF As CheckBox
	Public pAddImage As Button
	Public ImageView1 As ImageView
	Public vLst13 As List
	Public vLst14 As List
	Public ScrollView1 As ScrollView
	Public pMenu As Panel
	Public pDistinta As Button
	Public pElencoDistinta As Spinner
	Public bStampa As Button
	Public BtnOk As Button
	Public pnlWv As Panel
	Public Mail As Button
	Public vSMTP1 As SMTP
	Public vLst15 As List
	Public vLst16 As List
	Public pUscita As CheckBox
	Public PVariazioni As CheckBox
	Public pFraziona As CheckBox
	Public pEsclusiva As CheckBox
	Public pSelPrt As Button
	Public vLst17 As List
	Public vCur12 As Cursor
	Public StampaSubito As CheckBox
	Public pIndice As Button
	Public lGrp As Label
	Public pGrp As Spinner
	Public pPeso As EditText
	Public pQtaCar As Button
	Public lPeso As Label
	Public lQtaOttimale As Label
	Public pQtaOttimale As EditText
	Public pObbligoPrz As CheckBox
	Public pObbligoQta As CheckBox
	Public pObbligoDes As CheckBox
	Public PnlRep As Panel
	Public sRicerca As Spinner
	Public lblmainTitle As Label
	Public lblTitle As Label
	Public lblPluTitle As Label
	Public lblElencoTitle As Label
	Public bNew2 As Button
	Public lblInfoRep As Label
	Public sVarAuto As Spinner
	Public pVarAuto As Button
	Public pWebDes5 As Button
	Public pWebDes4 As Button
	Public pWebDes3 As Button
	Public pWebDes2 As Button
	Public pWebDes1 As Button
	Public invioweb As CheckBox
	Public pWebIng3 As Label
	Public pWebIng1 As Label
	Public pWebIng2 As Label
	Public pWebIng4 As Label
	Public pWebIng5 As Label
	Public vLst18 As List
	Public vCur13 As Cursor
	Public LAllergeni As Button
	Public pAllergeni As Spinner
	Public KCalorie As Button
	Public pPunti As Button
	Public pMemo As Button
	Public pnVariazioni As Button
	Public bGestBila As Button
	Public bBilPlu As Button
	Public bBilGruppo As Button
	Public bBilTara As Button
	Public bBilGGCons As Button
	Public bBilTipo As Button
	Public bBilTestoGen1 As Button
	Public bBilTestoGen2 As Button
	Public bBilTestoGen3 As Button
	Public bBilTestoGen4 As Button
	Public bBilIngredienti As Button
	Public lUM As Label
	Public pUM As Spinner
	Public pAddImagePrinter As Button
	Public pMacro As Spinner
	Public lMacro As Label
	Public btnShowImage As Button
	Public vtaborder1 As taborder
	Public pButtonsPlu As Panel
	Public pVariazioniWeb As CheckBox
	Public LIngredienti2 As Button
	Public pConferma As Button
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _ac_itemclicked (riga 621).
Sub ac_itemclicked(menuItemWrapper As MenuItem)
	Dim z As Boolean = True
	mod1.vStr2 = "  Sub AC_Click (Position As Int, ActionItemID As Int)"
	Try
		Select vLst2.Get(menuItemWrapper.Id)
			Case "Indice"
				Dim numberDialog As NumberDialog
				numberDialog.Digits = 1
				numberDialog.Number = vCur3.GetInt("indice")
				numberDialog.Decimal = 0
				numberDialog.ShowSign = False
				Dim vShow As Int = numberDialog.Show("Inserire l'indice di ordinamento dell'articolo selezionato ", "Ok", "Annulla", "", Main.vBmp1)
				If vShow = -1 Then
					Main.vSql1.ExecNonQuery("update anagra set indice = " & numberDialog.Number & " where codint  ='" & vCur3.GetString("codint") & "'")
					vInt3 = vInt11
					Edt1.Text = vStr7
					imericerca_handleaction()
				End If
				mod1.Sub081
			Case "Modifica"
				v7.Initialize("Timer1", 90)
				v7.Enabled = True
				mod1.Sub081
			Case "Elimina"
				If Main.vSql1.ExecQuerySingleResult("select count(*) from dettmnu where mnuattivo=1 and codint = '" & vCur3.GetString("codint") & "'") > 0 Then
					Dim vObjectToCharSequence As Object = "Questo articolo non può essere eliminato : " & CRLF & "è presente all'interno di un menù attivo"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Else
					If Main.vSql1.ExecQuerySingleResult("select count(*) from dettoff where attiva=1 and codint = '" & vCur3.GetString("codint") & "'") > 0 Then
						Dim vObjectToCharSequence3 As Object = "Questo articolo non può essere eliminato : " & CRLF & "è presente all'interno di una offerta attiva"
						Dim vObjectToCharSequence4 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Else If vCur3.GetInt("flgusointerno") = 1 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889" Then
						Dim vObjectToCharSequence5 As Object = "Non cancellabile"
						Dim vObjectToCharSequence6 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
					Else
						Dim vObjectToCharSequence7 As Object = "Confermi la cancellazione dell'articolo " & vCur3.GetString("descrizione")
						Dim vObjectToCharSequence8 As Object = Main.vStr8
						Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "Si", "", "No", Main.vBmp1)
						If vMsgbox2 = -1 Then
							Main.vSql1.ExecNonQuery("delete from anagra where codint = '" & vCur3.GetString("codint") & "'")
							Main.vSql1.ExecNonQuery("delete from ean where codint = '" & vCur3.GetString("codint") & "'")
							Main.vSql1.ExecNonQuery("delete from Testiart where codice='" & vCur3.GetString("codint") & "'")
							Main.vSql1.ExecNonQuery("delete from Artbloccati where codint ='" & vCur3.GetString("codint") & "'")
							vInt3 = vInt11
							Edt1.Text = vStr7
							imericerca_handleaction()
							Sub021()
						End If
					End If
				End If
				mod1.Sub081
			Case "Movimenti"
				If Main.vBln20 Then
					If Main.v_centralizza Then
						If Main.v_attivaterminale Then
						End If
					End If
				End If
				z = False
				If Not(z) Then
					Mail.Visible = False
					vBln12 = True
					vStr12 = "Select datam3 as DataOra ,prezzov as Prezzo,qta as Qta,importo as Importo,scov as Sconto,nmov as N_Mov,causale as Causale from venduto  where  codint= '" & vCur3.GetString("codint") & "'"
					vWebView1.LoadHtml(dbutil.Sub001(Main.vSql2, vStr12 & " order by datam3 desc, nmov desc limit 200", Null, 0, True, 3, 4, -1, False))
					vLst12.Clear
					vLst12.AddAll(ArrayToList(Array As String("datam3", "prezzov", "qta", "importo", "scov", "nmov", "causale")))
					pnlWv.Visible = True
					lblElencoTitle.Text = "Movimenti"
					lblElencoTitle.Visible = pnlWv.Visible
					BtnOk.Visible = pnlWv.Visible
					Mail.Visible = pnlWv.Visible
				Else
					ToastMessageShow("Non consentito con la gestione UniAndro attivata", False)
				End If
				mod1.Sub081
			Case "Seleziona"
				Main.vStr12 = vCur3.GetString("codint")
				vBln1 = True
				Main.vBln32 = False
				Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
				mod1.Sub198("Main")
				Activity.Finish
			Case Else
				mod1.Sub081
		End Select
		Return
	Catch
		mod1.Sub217(LastException.Message)
	End Try
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
			v5.Initialize("TimerBarcode", 10)
			v5.Enabled = False
			Sub017()
			Dim cursorWrapper As Cursor
			vCur10 = Main.vSql1.ExecQuery("Select Descrizione,Reparto from sortedAnagra")
			mod1.Sub175
			vLst10.Initialize
			vLst10.Add("Pesato")
			vLst10.Add("Manuale")
			vLst10.Add("In sottrazione")
			vLst11.Initialize
			vLst12.Initialize
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
	If Not(mod1.vBln9) And Not(vBln1) Then
		mod1.vStr1 = ""
		mod1.vBln4 = True
		mod1.Sub220(False)
		mod1.vBln1 = True
		Activity.Finish
		ExitApplication
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _activity_resume (riga 843).
Sub Activity_Resume
	Dim buttonWrapper As Button
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			mod1.vStr2 = "Activity_Resume"
			Try
				Sub025("tabelle")
				If Main.vInt24 = Main.d_plu Then
					vtaborder1.Initialize(ArrayToList(Array(pDes, pPrezzo, pPrezzo2, pPrezzo3, pPrezzo4, pQtaOttimale, pPeso, pSco, pScov, Prezzo5, Sottoscorta)), False)
				End If
				vcustomlistviewold1.Initialize(Me, "clv22")
				pPlu.AddView(vcustomlistviewold1.Sub003, PerXToCurrent(51), PerYToCurrent(0), PerXToCurrent(49), PerYToCurrent(100) - DipToCurrent(70))
				vcustomlistviewold1.Sub021(Colors.RGB(245, 245, 245))
				lblmainTitle.Color = Main.v_colormenutitle
				lblTitle.Color = Main.v_colormenutitle
				lblElencoTitle.Color = Main.v_colormenutitle
				lblPluTitle.Color = Main.v_colormenutitle
				mod1.Sub173(lblmainTitle)
				mod1.Sub173(lblTitle)
				mod1.Sub173(lblElencoTitle)
				mod1.Sub173(lblPluTitle)
				Dim cursorWrapper As Cursor
				vCur11 = Main.vSql1.ExecQuery("Select * from LinguaDescrizioniWeb order by codice")
				If vCur8.IsInitialized Then
					vCur8.Close
				End If
				Dim cursorWrapper2 As Cursor
				vCur8 = Main.vSql1.ExecQuery("Select * from um order by codice")
				pPlu.Color = Colors.RGB(245, 245, 245)
				Sub007()
				mod1.Sub165(pCodint)
				Sub022(Main.vInt24 = Main.d_plu)
				Dim vGetAllViewsRecursive As IterableList = pMenu.GetAllViewsRecursive
				Dim size As Int = vGetAllViewsRecursive.Size
				Dim i3 As Int
				For i3 = 0 To size - 1
					Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i3)
					If concreteViewWrapper Is Button And Not(concreteViewWrapper Is CheckBox) Then
						Dim buttonWrapper2 As Button = concreteViewWrapper
						mod1.Sub165(buttonWrapper2)
					End If
				Next
				Dim vGetAllViewsRecursive2 As IterableList = pPlu.GetAllViewsRecursive
				Dim size2 As Int = vGetAllViewsRecursive2.Size
				Dim i4 As Int
				For i4 = 0 To size2 - 1
					Dim concreteViewWrapper2 As View = vGetAllViewsRecursive2.Get(i4)
					If concreteViewWrapper2 Is EditText Or concreteViewWrapper2 Is CheckBox Or concreteViewWrapper2 Is Button Or concreteViewWrapper2 Is TextView Or concreteViewWrapper2 Is B4ASpinner Then
						If concreteViewWrapper2 Is Button And Not(concreteViewWrapper2 Is CheckBox) Then
							Dim buttonWrapper3 As Button = concreteViewWrapper2
							mod1.Sub165(buttonWrapper3)
							buttonWrapper3.TextSize = 14
							buttonWrapper3.TextColor = -16777216
							buttonWrapper3.Background = mod1.Sub155(-1, 20)
						Else If concreteViewWrapper2 Is TextView And Not(concreteViewWrapper2 Is EditText) And Not(concreteViewWrapper2 Is CheckBox) Then
							Dim labelWrapper5 As Label = concreteViewWrapper2
							If labelWrapper5.Text <> "Parametri" Then
								If labelWrapper5.Text <> "N" Then
									labelWrapper5.Gravity = Bit.Or(16, 5)
									labelWrapper5.Text = labelWrapper5.Text & ":  "
									labelWrapper5.Color = 0
								End If
								labelWrapper5.TextColor = -16777216
								labelWrapper5.TextSize = 14
							End If
						Else If concreteViewWrapper2 Is EditText Then
							Dim editTextWrapper As EditText = concreteViewWrapper2
							editTextWrapper.TextColor = -16777216
							editTextWrapper.TextSize = 14
							mod1.Sub165(editTextWrapper)
						Else If concreteViewWrapper2 Is CheckBox Then
							Dim checkBoxWrapper As CheckBox = concreteViewWrapper2
							checkBoxWrapper.TextSize = 14
							checkBoxWrapper.TextColor = -16777216
						Else If concreteViewWrapper2 Is B4ASpinner Then
							concreteViewWrapper2.TextSize = 14
						End If
					End If
				Next
				mod1.Sub165(BtnOk)
				mod1.Sub165(Mail)
				Sub032()
				vLst15.Initialize
				vLst16.Initialize
				vLst15.Clear
				vLst16.Clear
				vLst15.Add("20;DataOra;S")
				vLst15.Add("10;Prezzo;N")
				vLst15.Add("10;Qta;N")
				vLst15.Add("10;Importo;N")
				vLst15.Add("10;Sconto;N")
				vLst15.Add("8;N_Mov;N")
				vLst15.Add("8;Causale;S")
				vLst16.Add("Data")
				vLst16.Add("Prezzo")
				vLst16.Add("Qta")
				vLst16.Add("Importo")
				vLst16.Add("Sconto")
				vLst16.Add("N.Movimento")
				vLst16.Add("Causale")
				Dim panelWrapper2 As Panel
				panelWrapper2.Initialize("")
				panelWrapper2.Color = -16777216
				Dim i5 As Int = 0
				Dim i6 As Int = 0
				Do While i5 <= 7
					vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
					vLabelArr1(i5).Initialize("Header")
					vLabelArr1(i5).Background = vColorDrawable1
					Dim labelWrapper6 As Label = vLabelArr1(i5)
					labelWrapper6.TextColor = -1
					vLabelArr1(i5).TextSize = 16
					Dim labelWrapper7 As Label = vLabelArr1(i5)
					labelWrapper7.Typeface = Typeface.DEFAULT_BOLD
					Dim labelWrapper8 As Label = vLabelArr1(i5)
					labelWrapper8.Gravity = 19
					Select i5
						Case 0
							vLabelArr1(i5).Text = "#"
						Case 1
							vLabelArr1(i5).Text = "Codice"
						Case 2
							vLabelArr1(i5).Text = "Descrizione"
						Case 3
							vLabelArr1(i5).Text = "Reparto"
						Case 4
							vLabelArr1(i5).Text = "List.Anon_1"
						Case 5
							vLabelArr1(i5).Text = "Iva"
						Case 6
							vLabelArr1(i5).Text = "Gruppo"
						Case 7
							vLabelArr1(i5).Text = "     "
					End Select
					vLabelArr1(i5).Tag = i5
					panelWrapper2.AddView(vLabelArr1(i5), i6 + vInt7 / 2, 0, vIntArr1(i5) - vInt7, vInt5)
					vLabelArr1(i5).RunMethod("setPadding", Array(DipToCurrent(10), 0, DipToCurrent(10), 0))
					Dim i7 As Int = i6 + vIntArr1(i5)
					i5 = i5 + 1
					i6 = i7
				Loop
				pLista.AddView(panelWrapper2, 0, 0, vInt8, vInt5)
				vStr2 = ""
				vUltimateListView1.Initialize(0, 0, "", "ULV")
				vUltimateListView1.FastScroller(True)
				vUltimateListView1.DividerHeight = 0
				Dim ultimateListViewWrapper2 As UltimateListView = vUltimateListView1
				vUltimateListView1.SetStyle(2)
				Dim length As Byte = vIntArr1.Length
				vUltimateListView1.AddRowLayout("ROW", "Cell_RowLayoutCreator", "Cell_RowContentFiller", vInt6, length, vIntArr1, vInt7, -7829368, True)
				pLista.AddView(vUltimateListView1, 0, vInt5, vInt8, pLista.Height - vInt5)
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
				vWebView1.Initialize("cStampa")
				pnlWv.AddView(vWebView1, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(99), PerYToCurrent(100) - DipToCurrent(70))
				vLst2.Initialize
				vBln1 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				populatespinner(pRep, "reparti")
				Sub031(pMacro)
				pMacro.SelectedIndex = 0
				pRep.SelectedIndex = 1
				vInt13 = 1
				populatespinner(pIva, "iva")
				Sub033()
				pBil.Clear
				pBil.Add("NESSUNO")
				pBil.Add("PREZZO")
				pBil.Add("PESO")
				pBil.Add("SACCHETTONE")
				pBil.SelectedIndex = 0
				lBil.Text = "Tipo Bilancia"
				Dim cursorWrapper3 As Cursor
				vCur1 = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM reparti order by codice")
				vCur1.Position = 0
				Sub021()
				Sub037()
				If Main.vBln32 Then
					If Main.vInt26 <> 3 Then
						vInt4 = m_rdescrizione
						pLista.Visible = True
						Edt1.Visible = True
						Edt1.Text = ""
						If vUltimateListView1.IsInitialized Then
							vUltimateListView1.ClearContent
						End If
						vInt3 = m_rdescrizione
						Edt1.Hint = "Inserire la descrizione"
						vIME2.ShowKeyboard(Edt1)
					End If
				End If
				pAddImage.Visible = False
				pAddImagePrinter.Visible = False
				ImageView1.Visible = False
				btnShowImage.Visible = False
				If Main.vInt24 <> Main.d_plu Then
					Addrep.Background = mod1.Sub155(Colors.RGB(245, 245, 245), 0)
					LelencoCod.Text = "Elenco Reparti"
					LPrz2.Text = "Listino in Detrazione"
					Dim cursorWrapper4 As Cursor
					Dim cursorWrapper5 As Cursor = Main.vSql1.ExecQuery("Select * from gruppovar order by codice")
					pBil.Clear
					If cursorWrapper5.RowCount > 0 Then
						Dim rowCount As Int = cursorWrapper5.RowCount - 1
						Dim i11 As Int
						For i11 = 0 To rowCount
							cursorWrapper5.Position = i11
							pBil.Add(cursorWrapper5.GetString("descrizione"))
						Next
						pBil.SelectedIndex = 0
					End If
					lBil.Text = "Gruppo Variazione"
				Else
					Dim cursorWrapper6 As Cursor
					Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("Select * from gruppovar order by codice")
					pGrp.Clear
					If cursorWrapper7.RowCount > 0 Then
						Dim rowCount2 As Int = cursorWrapper7.RowCount - 1
						Dim i12 As Int
						For i12 = 0 To rowCount2
							cursorWrapper7.Position = i12
							pGrp.Add(cursorWrapper7.GetString("descrizione"))
						Next
						pGrp.SelectedIndex = 0
					End If
					LelencoCod.Text = "Elenco Codici"
					pAddImage.Visible = True
					pAddImagePrinter.Visible = True
					ImageView1.Visible = False
					btnShowImage.Visible = False
					vLst13.Initialize
					vLst14.Initialize
					Dim cursorWrapper8 As Cursor
					vCur7 = Main.vSql1.ExecQuery("Select * from ingredienti where substr(descrizione,1,11) <>'Ingrediente' order by descrizione")
					vLst6.Initialize
					Dim rowCount3 As Int = vCur7.RowCount - 1
					Dim i13 As Int
					For i13 = 0 To rowCount3
						vCur7.Position = i13
						vLst6.Add(vCur7.GetString("descrizione"))
					Next
					Dim cursorWrapper9 As Cursor
					vCur6 = Main.vSql1.ExecQuery("Select codice,case when tag=1 then '#' || descrizione else descrizione end as descrizione ,tag from allergeni where substr(descrizione,1,9) <>'allergene' order by case when tag=1 then 'b' || descrizione else 'a' || descrizione end ")
					vLst17.Initialize
					Dim cursorWrapper10 As Cursor
					vCur12 = Main.vSql1.ExecQuery("select * from reparti order by codice")
					vLst17.Add("Segue il reparto")
					Dim rowCount4 As Int = vCur12.RowCount - 1
					Dim i14 As Int
					For i14 = 0 To rowCount4
						vCur12.Position = i14
						If vCur12.GetInt("NF") = 0 Then
							vLst17.Add(vCur12.GetString("descrizione"))
						End If
					Next
				End If
				buttonWrapper = bNew
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			If Main.v_attivaterminale Then
				If Not(Main.v_solovenduto) Then
					z = True
					If Not(z) Then
						If Not(Main.vBln25) Then
							z2 = True
							buttonWrapper.Enabled = z2
							Dim buttonWrapper5 As Button = bNew2
							If Main.v_attivaterminale Then
								If Not(Main.v_solovenduto) Then
									z3 = True
									If Not(z3) Then
										If Not(Main.vBln25) Then
											z4 = True
											buttonWrapper5.Enabled = z4
											If Main.vInt26 <> 3 And vInt3 = m_rreparto Then
												If vUltimateListView1.IsInitialized Then
													vUltimateListView1.ClearContent
												End If
												pLista.Visible = True
												Edt1.Visible = True
												v5.Initialize("TimerBarcode", 10)
												v5.Enabled = True
											Else
												If Main.vInt26 = 3 Then
													Sub035()
												End If
											End If
											If v0 >= 0 Then
												vInt12 = v0
												vInt4 = m_rreparto
												pLista.Visible = True
												vInt3 = m_rreparto
												Edt1.Text = ""
												Edt1.Visible = False
												v5.Initialize("TimerBarcode", 10)
												v5.Enabled = True
												sRicerca.SelectedIndex = 3
												vCur1.Position = v0
												lblInfoRep.Visible = True
												lblInfoRep.Text = "Reparto = " & vCur1.GetString("descrizione")
												v0 = -1
											End If
											mod1.Sub081
											Return
										End If
									End If
									z4 = False
									buttonWrapper5.Enabled = z4
									If Main.vInt26 <> 3 Then
									End If
									If Main.vInt26 = 3 Then
									End If
									If v0 >= 0 Then
									End If
									mod1.Sub081
									Return
								End If
							End If
							z3 = False
							If Not(z3) Then
							End If
							z4 = False
							buttonWrapper5.Enabled = z4
							If Main.vInt26 <> 3 Then
							End If
							If Main.vInt26 = 3 Then
							End If
							If v0 >= 0 Then
							End If
							mod1.Sub081
							Return
						End If
					End If
					z2 = False
					buttonWrapper.Enabled = z2
					If Main.v_attivaterminale Then
					End If
					z3 = False
					If Not(z3) Then
					End If
					z4 = False
					bNew2.Enabled = z4
					If Main.vInt26 <> 3 Then
					End If
					If Main.vInt26 = 3 Then
					End If
					If v0 >= 0 Then
					End If
					mod1.Sub081
					Return
				End If
			End If
			z = False
			If Not(z) Then
			End If
			z2 = False
			buttonWrapper.Enabled = z2
			If Main.v_attivaterminale Then
			End If
			z3 = False
			If Not(z3) Then
			End If
			z4 = False
			bNew2.Enabled = z4
			If Main.vInt26 <> 3 Then
			End If
			If Main.vInt26 = 3 Then
			End If
			If v0 >= 0 Then
			End If
			mod1.Sub081
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Sub001(i As Int, z As Boolean) As Boolean
	Dim z2 As Boolean
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Inserire il codice bilancia"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Il Codice deve iniziare con 2 lungo 7 caratteri", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input.StartsWith("2") And vDlg1.Input.Length = 7 Then
			pAddC.Text = vDlg1.Input
			Sub006()
			Dim buttonWrapper As Button = bGestBila
			If Main.vBln20 Then
				If Main.v_ipserverbila <> "" And (i = 1 Or i = 2) Then
					z2 = True
					buttonWrapper.Visible = z2
					Return True
				End If
			End If
			z2 = False
			buttonWrapper.Visible = z2
			Return True
		End If
		Dim vObjectToCharSequence As Object = "Il codice non è valido"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		If z Then
			pBil.SelectedIndex = 0
		End If
	End If
	Return False
End Sub

Sub Sub002(buttonWrapper As Button, str As String, str2 As String)
	Dim vAppend As CSBuilder = vCSBuilder1.Initialize.Size(16).Append(str)
	vAppend.Color(-65536).Append(str2)
	buttonWrapper.Text = vCSBuilder1.PopAll
End Sub

Sub Sub003
	If Not(invioweb.Checked) Then
		Return
	End If
	If Main.v_iprpi <> "" Then
		pWebIng1.Tag = ""
		pWebIng2.Tag = ""
		pWebIng3.Tag = ""
		pWebIng4.Tag = ""
		pWebIng5.Tag = ""
		Dim size As Int = pIngredienti.Size - 1
		Dim i As Int
		For i = 0 To size
			pWebIng1.Tag = mod1.Sub038(pWebIng1.Tag & pIngredienti.GetItem(i) & "-", 2000, True)
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from anagraDescrizioni where codint ='Ing" & vLst8.Get(i) & "'")
			If cursorWrapper2.RowCount > 0 Then
				cursorWrapper2.Position = 0
				pWebIng2.Tag = mod1.Sub038(pWebIng2.Tag & cursorWrapper2.GetString("descrizione2") & "-", 2000, True)
				pWebIng3.Tag = mod1.Sub038(pWebIng3.Tag & cursorWrapper2.GetString("descrizione3") & "-", 2000, True)
				pWebIng4.Tag = mod1.Sub038(pWebIng4.Tag & cursorWrapper2.GetString("descrizione4") & "-", 2000, True)
				pWebIng5.Tag = mod1.Sub038(pWebIng5.Tag & cursorWrapper2.GetString("descrizione5") & "-", 2000, True)
			End If
		Next
		Sub011(pWebIng1)
		Sub011(pWebIng2)
		Sub011(pWebIng3)
		Sub011(pWebIng4)
		Sub011(pWebIng5)
		Sub020(pWebIng1, 0)
		Sub020(pWebIng2, 1)
		Sub020(pWebIng3, 2)
		Sub020(pWebIng4, 3)
		Sub020(pWebIng5, 4)
		vBln4 = True
		Return
	End If
End Sub

Sub Sub004(str As String)
	Dim d As Double
	Try
		vInt17 = 0
		vInt9 = vInt2
		lblmainTitle.Text = "Gestione PLU"
		vcustomlistviewold1.Sub012(0)
		Sub038(True)
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where flgusointerno=1 and codint = '" & str & "'") = 1 Then
			Dim vObjectToCharSequence As Object = "Non è possibilie utilizzare articoli per Uso Interno"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return
		End If
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from distintabaseTmp where codintpadre = '" & str & "'") > 0 Then
			Dim vObjectToCharSequence3 As Object = "L'articolo " & str & " risulta essere già inserito in questa distinta."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			Return
		End If
		If pCodint.Text = str Then
			Dim vObjectToCharSequence5 As Object = "Non è possibile inserire l'articolo padre in Distinta Base"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
			Return
		End If
		Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & str & "'")
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 12290
		vDlg1.Input = ""
		vDlg1.Hint = "Quantità"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim str2 As String = "Inserire la quantità da scaricare dell'articolo " & vExecQuerySingleResult
		Dim vShow As Int = vDlg1.Show(str2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			Try
				d = vDlg1.Input
			Catch
				mod1.Sub217(LastException.Message)
				d = 0
			End Try
			If d > 0 Then
				Main.vSql1.ExecNonQuery("insert into distintabaseTmp(codint,codintpadre,qta) values('" & pCodint.Text & "','" & str & "'," & d & ")")
				Dim cursorWrapper As Cursor
				vCur4 = Main.vSql1.ExecQuery("Select * from distintabaseTmp order by chiave")
				Sub028()
				Return
			End If
			Dim vObjectToCharSequence7 As Object = "La quantità inserita non è corretta"
			Dim vObjectToCharSequence8 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub005
	mod1.vStr2 = "Sub addEan"
	vBln10 = True
	v5.Initialize("TimerBarcode", 10)
	v5.Enabled = True
End Sub

Sub Sub006
	Try
		If pAddC.Text.Length >= 16 And pAddC.Text.StartsWith("01") Then
			If mod1.vcgs1databar1.Sub001(pAddC.Text) > 0 Then
				If mod1.vcgs1databar1.vStr3 <> "" Then
					pAddC.Text = mod1.vcgs1databar1.vStr3
				End If
			End If
		End If
		pAddC.Text = modfunstr.left(pAddC.Text, 20)
		Dim size As Int = vLst3.Size - 1
		Dim i As Int
		For i = 0 To size
			If vLst3.Get(i) = pAddC.Text Then
				ToastMessageShow("Il codice " & pAddC.Text & " è già stato inserito", True)
				pAddC.Text = ""
				Return
			End If
		Next
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from ean where codice = '" & pAddC.Text & "'") > 0 Then
			Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select codint from ean where codice = '" & pAddC.Text & "' limit 1")
			Dim vObjectToCharSequence As Object = "Il codice " & pAddC.Text & " è già stato inserito sull'articolo " & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra inner join ean on ean.codint = anagra.codint where ean.codice = '" & pAddC.Text & "' limit 1") & " con codice interno " & vExecQuerySingleResult & " ." & CRLF & "Si desidera proseguire ugualmente ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
			If vMsgbox2 = -2 Then
				pAddC.Text = ""
				Return
			End If
		End If
		vLst3.Add(pAddC.Text)
		vMap2.Put(pAddC.Text, 1)
		vMap3.Put(pAddC.Text, 0)
		pAddC.Text = ""
		Sub029()
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub007
	Dim vPerYToCurrent As Int = PerYToCurrent(5) - DipToCurrent(1)
	vcustomlistviewold1.Sub001(mod1.Sub048(vPerYToCurrent, "Parametri"), DipToCurrent(4) + vPerYToCurrent, "")
	If Main.vInt24 = Main.d_plu Then
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, StampaSubito, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, pEsclusiva, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, pObbligoPrz, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, pObbligoQta, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, pObbligoDes, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, pUscita, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, pFraziona, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, PVariazioni, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, pVariazioniWeb, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, IngrNF, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, IngrMF, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub053(vPerYToCurrent, lUM, pUM, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub053(vPerYToCurrent, lMacro, pMacro, -1), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pnVariazioni, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pSelPrt, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pIndice, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pPunti, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, KCalorie, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pMemo, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pQtaCar, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pAddImage, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pAddImagePrinter, -1, ""), vPerYToCurrent, "")
	Else
		vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, Addrep, -1, ""), vPerYToCurrent, "")
		vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, pObbligoDes, -1), vPerYToCurrent, "")
	End If
	vcustomlistviewold1.Sub001(mod1.Sub047(vPerYToCurrent, invioweb, -1), vPerYToCurrent, "")
	vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pWebDes1, -1, ""), vPerYToCurrent, "")
	vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pWebDes2, -1, ""), vPerYToCurrent, "")
	vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pWebDes3, -1, ""), vPerYToCurrent, "")
	vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pWebDes4, -1, ""), vPerYToCurrent, "")
	vcustomlistviewold1.Sub001(mod1.Sub045(vPerYToCurrent, pWebDes5, -1, ""), vPerYToCurrent, "")
	Dim vDipToCurrent As Int = DipToCurrent(50) + vPerYToCurrent
	vcustomlistviewold1.Sub001(mod1.Sub050(vDipToCurrent, pWebIng1, -1, ""), DipToCurrent(50) + vPerYToCurrent, "")
	Dim vDipToCurrent2 As Int = DipToCurrent(50) + vPerYToCurrent
	vcustomlistviewold1.Sub001(mod1.Sub050(vDipToCurrent2, pWebIng2, -1, ""), DipToCurrent(50) + vPerYToCurrent, "")
	Dim vDipToCurrent3 As Int = DipToCurrent(50) + vPerYToCurrent
	vcustomlistviewold1.Sub001(mod1.Sub050(vDipToCurrent3, pWebIng3, -1, ""), DipToCurrent(50) + vPerYToCurrent, "")
	Dim vDipToCurrent4 As Int = DipToCurrent(50) + vPerYToCurrent
	vcustomlistviewold1.Sub001(mod1.Sub050(vDipToCurrent4, pWebIng4, -1, ""), DipToCurrent(50) + vPerYToCurrent, "")
	Dim vDipToCurrent5 As Int = DipToCurrent(50) + vPerYToCurrent
	vcustomlistviewold1.Sub001(mod1.Sub050(vDipToCurrent5, pWebIng5, -1, ""), vPerYToCurrent + DipToCurrent(50), "")
End Sub

Sub Addrep_Click
	Dim i As Int
	Dim i2 As Int = 1
	Try
	Catch
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
	End Try
	If vBln11 Then
		PnlRep.Visible = True
		Return
	End If
	vBln11 = True
	Dim numberOfViews As Int
	For numberOfViews = PnlRep.NumberOfViews - 1 To 0 Step -1
		If PnlRep.GetView(numberOfViews) Is ScrollView Then
			PnlRep.RemoveViewAt(numberOfViews)
		End If
	Next
	Dim scrollViewWrapper As ScrollView
	scrollViewWrapper.Initialize(0)
	PnlRep.AddView(scrollViewWrapper, 0, PerYToCurrent(10), PerXToCurrent(80), PerYToCurrent(87))
	PnlRep.Visible = True
	Dim panel As Panel = scrollViewWrapper.Panel
	vLst1.Clear
	ProgressDialogShow2("Attendere ...", False)
	Dim map As Map
	map.Initialize
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select reparti.codice,reparti.descrizione from reparti where codice >0 and codice <> " & pRep.SelectedIndex & " order by reparti.descrizione")
	Dim rowCount As Int = cursorWrapper2.RowCount - 1
	Dim i3 As Int
	For i3 = 0 To rowCount
		DoEvents
		cursorWrapper2.Position = i3
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from GruppiVariazioniArt where codint = " & pCodint.Text & " and reparto = " & cursorWrapper2.GetString("codice")) > 0 Then
			Dim checkBoxWrapper As CheckBox
			checkBoxWrapper.Initialize("")
			checkBoxWrapper.Text = cursorWrapper2.GetString("descrizione")
			checkBoxWrapper.TextColor = -16777216
			checkBoxWrapper.Tag = cursorWrapper2.GetInt("codice")
			checkBoxWrapper.Checked = True
			vLst1.Add(checkBoxWrapper)
			panel.AddView(checkBoxWrapper, 0, DipToCurrent(50) * (i2 - 1), PerXToCurrent(100), DipToCurrent(50))
			map.Put(i3, "")
			i2 = i2 + 1
		End If
		If i3 Mod 10 = 0 Then
			DoEvents
		End If
	Next
	Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
	Dim i4 As Int
	For i4 = 0 To rowCount2
		DoEvents
		cursorWrapper2.Position = i4
		If Not(map.ContainsKey(i4)) And Not(cursorWrapper2.GetString("descrizione").ToLowerCase.StartsWith("reparto ")) Then
			Dim checkBoxWrapper2 As CheckBox
			checkBoxWrapper2.Initialize("")
			checkBoxWrapper2.Text = cursorWrapper2.GetString("descrizione")
			checkBoxWrapper2.Tag = cursorWrapper2.GetInt("codice")
			checkBoxWrapper2.TextColor = -16777216
			checkBoxWrapper2.Checked = False
			vLst1.Add(checkBoxWrapper2)
			panel.AddView(checkBoxWrapper2, 0, DipToCurrent(50) * (i2 - 1), PerXToCurrent(100), DipToCurrent(50))
			i = i2 + 1
		Else
			i = i2
		End If
		If i4 Mod 10 = 0 Then
			DoEvents
		End If
		i2 = i
	Next
	panel.Height = vLst1.Size * DipToCurrent(50)
	mod1.Sub161(panel, 7)
	ProgressDialogHide
End Sub

Sub Sub008(str As String)
	Try
		vInt17 = 0
		vInt9 = vInt2
		lblmainTitle.Text = "Gestione PLU"
		Main.vInt24 = Main.d_plu
		Sub022(True)
		vcustomlistviewold1.Sub012(0)
		Sub038(True)
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from varautoTmp where codintvar = '" & str & "'") > 0 Then
			Dim vObjectToCharSequence As Object = "L'articolo " & str & " risulta essere già inserito in questo elenco."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Else
			Main.vSql1.ExecNonQuery("insert into varautoTmp(codint,codintvar) values('" & pCodint.Text & "','" & str & "')")
			Dim cursorWrapper As Cursor
			vCur5 = Main.vSql1.ExecQuery("Select * from varautoTmp order by chiave")
			Sub034()
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub009(i As Int, buttonWrapper As Button, str As String, str2 As String)
	If i <> 0 Then
		Sub002(buttonWrapper, str, i)
		buttonWrapper.Tag = i
		Return
	End If
	buttonWrapper.Text = str2
	buttonWrapper.Tag = 0
End Sub

Sub Sub010
	vLst13.Clear
	vLst14.Clear
	Dim numberOfViews As Int
	For numberOfViews = ScrollView1.Panel.NumberOfViews - 1 To 0 Step -1
		ScrollView1.Panel.RemoveViewAt(numberOfViews)
	Next
End Sub

Sub Sub011(labelWrapper As Label)
	Dim vObjectToString As String = labelWrapper.Tag
	If vObjectToString.EndsWith("-") Then
		labelWrapper.Tag = vObjectToString.SubString2(0, vObjectToString.Length - 1)
	End If
	Dim vObjectToString2 As String = labelWrapper.Tag
	If vObjectToString2.StartsWith("-") Then
		labelWrapper.Tag = vObjectToString2.SubString(1)
		Return
	End If
End Sub

Sub bBilGGCons_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = bBilGGCons.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di giorni di conservazione", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		bBilGGCons.Tag = numberDialog.Number
		Sub009(numberDialog.Number, bBilGGCons, "Giorni di conservazione: ", "Inserire qui il numero di giorni di conservazione")
		Return
	End If
	bBilGGCons.Text = "Inserire qui il numero di giorni di conservazione"
	bBilGGCons.Tag = 0
End Sub

Sub bBilGruppo_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = bBilGruppo.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Codice gruppo bilancia"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire il codice gruppo bilancia", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow <> -1 Then
		bBilGruppo.Text = "Inserire qui il gruppo bilancia "
		bBilGruppo.Tag = "1"
		Return
	End If
	If Not(vDlg1.Input <= 0 Or vDlg1.Input > 9999) Then
		Sub002(bBilGruppo, "Gruppo bilancia: ", vDlg1.Input)
		bBilGruppo.Tag = vDlg1.Input
		Return
	End If
End Sub

Sub bBilIngredienti_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = bBilIngredienti.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "ingredienti"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire gli ingredienti per l'articolo", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		bBilIngredienti.Tag = vDlg1.Input
		Return
	End If
	bBilIngredienti.Tag = ""
End Sub

Sub bBilPlu_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = bBilPlu.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Codice plu bilancia"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire il Codice plu bilancia", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input.Length <= 6 Then
			Dim sb As String = "BILA" & modfunstr.Sub003("000000" & vDlg1.Input, 6)
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from ean where codice ='" & SmartStringFormatter("", sb) & "' ") > 0 Then
				Dim vObjectToCharSequence As Object = "Codice già legato all'articolo " & Main.vSql1.ExecQuerySingleResult("Select codint from ean where codice ='" & SmartStringFormatter("", sb) & "' ")
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Return
			End If
			Sub002(bBilPlu, "Codice plu bilancia: ", vDlg1.Input)
			bBilPlu.Tag = vDlg1.Input
		End If
	Else
		bBilPlu.Text = "Inserire qui il codice plu bilancia "
		bBilPlu.Tag = ""
	End If
End Sub

Sub bBilTara_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = bBilTara.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire i grammi per la tara", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Sub009(numberDialog.Number, bBilTara, "Tara: ", "Inserire qui la tara")
		Return
	End If
	bBilTara.Text = "Inserire qui la tara"
	bBilTara.Tag = 0
End Sub

Sub bBilTestoGen1_Click
	Sub039(bBilTestoGen1, 1)
End Sub

Sub bBilTestoGen2_Click
	Sub039(bBilTestoGen2, 2)
End Sub

Sub bBilTestoGen3_Click
	Sub039(bBilTestoGen3, 3)
End Sub

Sub bBilTestoGen4_Click
	Sub039(bBilTestoGen4, 4)
End Sub

Sub bBilTipo_Click
	Dim vInputList As Int = InputList(vLst10, "Indicare il tipo codice bilancia ", bBilTipo.Tag)
	If vInputList < 0 Then
		Return
	End If
	Sub002(bBilTipo, "Tipo codice bilancia: ", vLst10.Get(vInputList))
	bBilTipo.Tag = vInputList
End Sub

Sub BChiudi_Click
	If Sub016() Then
		Return
	End If
	Main.vStr14 = ""
	vBln1 = True
	Main.vBln32 = False
	If Main.vInt26 = 1 Then
		Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
		mod1.Sub198("Offerte")
		Main.vInt26 = 0
	Else
		If Main.vInt26 = 3 Then
			Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
			mod1.Sub198("Menu")
			Main.vInt26 = 0
		Else
			If Main.vInt26 = 4 Then
				Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
				mod1.Sub198("Ordini")
				Main.vInt26 = 0
			Else
				If Main.vInt26 = 2 Then
					Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
					mod1.Sub198("ConfPalmari")
					Main.vInt26 = 0
				Else
					vIME1.HideKeyboard
					Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
					mod1.Sub198("Main")
				End If
			End If
		End If
	End If
	Activity.Finish
	mod1.Sub081
End Sub

Sub bChiudiRep_Click
	PnlRep.Visible = False
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub bGestBila_Click
	Dim detailsdialog As CustomLayoutDialog
	Dim stmp As String
	Dim sf As Object
	Dim pnl As Panel
	Dim tmpcurs As Cursor
	Dim tbilplu As String
	Dim tbilgruppo As String
	Dim tbiltara As Int
	Dim tbilggcons As Int
	Dim tbiltipo As Int
	Dim tbiltestogen1 As Int
	Dim tbiltestogen2 As Int
	Dim tbiltestogen3 As Int
	Dim tbiltestogen4 As Int
	Dim tbilingredienti As String
	Dim tmpcodice As String
	Dim tmpbiltipo As Int
	Dim res As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				'detailsdialog = CustomLayoutDialog
				stmp = "Configurazione dati Bilancia per l'articolo " & pDes.Text
				Dim customLayoutDialog As CustomLayoutDialog = detailsdialog
				Dim str As String = stmp
				sf = customLayoutDialog.ShowAsync(str, "Ok", "Annulla", "", Main.vBmp1, True)
				detailsdialog.SetSize(PerXToCurrent(60), PerYToCurrent(88))
				Wait For (sf) Dialog_Ready (wf39_0 As Panel)
				rsState = 39
				Continue
			Case 1
				rsState = 4
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from DatiBilance where Codint ='" & pCodint.Text & "'") <> 0 Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 4
				Main.vSql1.ExecNonQuery("INSERT INTO [DatiBilance]" & CRLF & TAB & "([Codint])" & TAB & "VALUES('" & SmartStringFormatter("", pCodint.Text) & "')")
				Continue
			Case 4
				rsState = 5
				'tmpcurs = Cursor
				Dim cursorWrapper As Cursor
				tmpcurs = Main.vSql1.ExecQuery("select * from DatiBilance where Codint='" & SmartStringFormatter("", pCodint.Text) & "'")
				Continue
			Case 5
				rsState = 38
				If tmpcurs.RowCount <= 0 Then
					Continue
				Else
					rsState = 7
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 7
			Case 7
				rsState = 8
				tmpcurs.Position = 0
				tbilplu = tmpcurs.GetString("BilPlu")
				tbilgruppo = tmpcurs.GetString("BilGruppo")
				tbiltara = tmpcurs.GetInt("BilTara")
				tbilggcons = tmpcurs.GetInt("BilGGCons")
				tbiltipo = tmpcurs.GetInt("BilTipo")
				tbiltestogen1 = tmpcurs.GetInt("BilTestoGen1")
				tbiltestogen2 = tmpcurs.GetInt("BilTestoGen2")
				tbiltestogen3 = tmpcurs.GetInt("BilTestoGen3")
				tbiltestogen4 = tmpcurs.GetInt("BilTestoGen4")
				tbilingredienti = tmpcurs.GetString("BilIngredienti")
				Continue
			Case 8
				rsState = 17
				If vMap1.IsInitialized Then
					If vMap1.ContainsKey("BilPlu") Then
						rsState = 10
						Continue
					End If
				End If
				If tbilplu <> "" Then
					Continue
				Else
					If pCodint.Text.Length > 6 Then
						Continue
					Else
						rsState = 12
						Continue
					End If
				End If
				'(fallthrough java verso il case successivo)
				rsState = 10
			Case 10
				rsState = 17
				tbilplu = vMap1.Get("BilPlu")
				tbilgruppo = vMap1.Get("BilGruppo")
				tbiltara = vMap1.Get("BilTara")
				tbilggcons = vMap1.Get("BilGGCons")
				tbiltipo = vMap1.Get("BilTipo")
				tbiltestogen1 = vMap1.Get("BilTestoGen1")
				tbiltestogen2 = vMap1.Get("BilTestoGen2")
				tbiltestogen3 = vMap1.Get("BilTestoGen3")
				tbiltestogen4 = vMap1.Get("BilTestoGen4")
				tbilingredienti = vMap1.Get("BilIngredienti")
				Continue
			Case 12
				rsState = 13
				tmpcodice = "BILA" & modfunstr.Sub003("000000" & pCodint.Text, 6)
				Continue
			Case 13
				rsState = 16
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from ean where codice ='" & SmartStringFormatter("", tmpcodice) & "' ") <> 0 Then
					Continue
				Else
					rsState = 15
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 15
			Case 15
				rsState = 16
				tbilplu = pCodint.Text
				Continue
			Case 16
				rsState = 17
				Continue
			Case 17
				rsState = 22
				If tbilplu <> "" Then
					rsState = 19
					Continue
				Else
					rsState = 21
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 19
			Case 19
				rsState = 22
				Sub002(bBilPlu, "Codice plu bilancia: ", tbilplu)
				bBilPlu.Tag = tbilplu
				Continue
			Case 21
				rsState = 22
				bBilPlu.Text = "Inserire qui il codice plu bilancia "
				bBilPlu.Tag = ""
				Continue
			Case 22
				rsState = 27
				If tbilgruppo <> "" And tbilgruppo <> "1" Then
					rsState = 24
					Continue
				Else
					rsState = 26
					Continue
				End If
				Continue
			Case 24
				rsState = 27
				Sub002(bBilGruppo, "Gruppo bilancia: ", tbilgruppo)
				bBilGruppo.Tag = tbilgruppo
				Continue
			Case 26
				rsState = 27
				bBilGruppo.Text = "Inserire qui il gruppo bilancia "
				bBilGruppo.Tag = "1"
				Continue
			Case 27
				rsState = 28
				tmpbiltipo = tbiltipo
				Continue
			Case 28
				rsState = 33
				If tmpbiltipo >= 0 And tmpbiltipo <= 2 Then
					Continue
				Else
					rsState = 30
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 30
			Case 30
				rsState = 33
				tmpbiltipo = 0
				Continue
			Case 33
				rsState = 34
				Sub002(bBilTipo, "Tipo codice bilancia: ", vLst10.Get(tmpbiltipo))
				bBilTipo.Tag = tmpbiltipo
				bBilIngredienti.Tag = tbilingredienti
				Dim i As Int = tbiltara
				Sub009(i, bBilTara, "Tara: ", "Inserire qui la tara")
				Dim i2 As Int = tbilggcons
				Sub009(i2, bBilGGCons, "Giorni di conservazione: ", "Inserire qui il numero di giorni di conservazione")
				Dim i3 As Int = tbiltestogen1
				Sub009(i3, bBilTestoGen1, "Codice testo generico 1: ", "Inserire qui il codice del testo generico 1")
				Dim i4 As Int = tbiltestogen2
				Sub009(i4, bBilTestoGen2, "Codice testo generico 2: ", "Inserire qui il codice del testo generico 2")
				Dim i5 As Int = tbiltestogen3
				Sub009(i5, bBilTestoGen3, "Codice testo generico 3: ", "Inserire qui il codice del testo generico 3")
				Dim i6 As Int = tbiltestogen4
				Sub009(i6, bBilTestoGen4, "Codice testo generico 4: ", "Inserire qui il codice del testo generico 4")
				Wait For (sf) Dialog_Result (wf40_0 As Int)
				rsState = 40
				Continue
			Case 34
				rsState = 37
				Dim i7 As Int = res
				If i7 <> -1 Then
					Continue
				Else
					rsState = 36
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 36
			Case 36
				rsState = 37
				vMap1.Initialize
				vMap1.Put("BilPlu", bBilPlu.Tag)
				vMap1.Put("BilGruppo", bBilGruppo.Tag)
				vMap1.Put("BilTara", bBilTara.Tag)
				vMap1.Put("BilGGCons", bBilGGCons.Tag)
				vMap1.Put("BilTipo", bBilTipo.Tag)
				vMap1.Put("BilTestoGen1", bBilTestoGen1.Tag)
				vMap1.Put("BilTestoGen2", bBilTestoGen2.Tag)
				vMap1.Put("BilTestoGen3", bBilTestoGen3.Tag)
				vMap1.Put("BilTestoGen4", bBilTestoGen4.Tag)
				vMap1.Put("BilIngredienti", bBilIngredienti.Tag)
				Continue
			Case 37
				rsState = 38
				Continue
			Case 38
				rsState = -1
				tmpcurs.Close
				Continue
			Case 39
				rsState = 1
				pnl = wf39_0
				pnl.LoadLayout("confBila")
				mod1.Sub081
				Continue
			Case 40
				rsState = 34
				res = wf40_0
				Continue
		End Select
	Loop
End Sub

Sub Dialog_Ready(panelWrapper As Panel)
End Sub

Sub Dialog_Result(i As Int)
End Sub

Sub Sub012(str As String)
	mod1.vStr2 = "Sub bM_Click"
	Try
		Edt1.Visible = True
		lblInfoRep.Visible = False
		Select str
			Case "Tutti"
				vInt4 = m_rtutti
				pLista.Visible = True
				Edt1.Visible = False
				vInt3 = m_rtutti
				Edt1.Text = ""
				v5.Initialize("TimerBarcode", 10)
				v5.Enabled = True
			Case "Reparto"
				Sub035()
			Case "Codint"
				vInt4 = m_rcodint
				pLista.Visible = True
				Edt1.Visible = True
				vInt3 = m_rcodint
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				Edt1.Hint = "Inserire il codice Interno"
				vIME2.ShowKeyboard(Edt1)
			Case "Codice"
				vInt4 = m_rcodice
				pLista.Visible = True
				Edt1.Visible = True
				vInt3 = m_rcodice
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				Edt1.Hint = "Inserire il codice"
				vIME2.ShowKeyboard(Edt1)
			Case "Descrizione"
				vInt4 = m_rdescrizione
				pLista.Visible = True
				Edt1.Visible = True
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				vInt3 = m_rdescrizione
				Edt1.Hint = "Inserire la descrizione"
				vIME2.ShowKeyboard(Edt1)
		End Select
		mod1.Sub081
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _bnew_click (riga 2686).
Sub bNew_Click
	Dim i As Int
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean = True
	If Sub016() Then
		mod1.Sub081
		Return
	End If
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='A'")
	If Not(vBln6) Then
		i = Sub019(Main.d_plu, parseDouble)
	Else
		Do While True
			If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" & parseDouble & "'")) = 0 Then
				Exit
			End If
			parseDouble = parseDouble + 1
		Loop
		i = parseDouble
	End If
	If i = 0 Then
		mod1.Sub081
		Return
	End If
	vBln7 = False
	vInt4 = m_nuovo
	vStr9 = ""
	vInt14 = 0
	vInt15 = 0
	vInt16 = 0
	vInt9 = 2
	bGestBila.Visible = False
	vMap1.Initialize
	If Main.vInt24 = Main.d_plu Then
		pBil.Visible = True
		lBil.Visible = True
		pUM.Visible = True
		lUM.Visible = True
		lMacro.Visible = True
		pMacro.Visible = True
		pAddC.Visible = True
		Lcod.Visible = True
		LPrz3.Visible = True
		LPrz4.Visible = True
		LPrz2.Visible = True
		lPrza.Visible = True
		lScov.Visible = True
		lSco.Visible = True
		pElencoCod.Visible = True
		LelencoCod.Visible = True
		pElencoDistinta.Visible = True
		pGrp.Visible = True
		lGrp.Visible = True
		pDistinta.Visible = True
		pVarAuto.Visible = True
		sVarAuto.Visible = True
		pIngredienti.Visible = True
		pAllergeni.Visible = True
		IngrMF.Visible = True
		IngrNF.Visible = True
		pUscita.Visible = True
		StampaSubito.Visible = True
		PVariazioni.Visible = True
		pVariazioniWeb.Visible = True
		pFraziona.Visible = True
		pObbligoPrz.Visible = True
		pObbligoQta.Visible = True
		pObbligoDes.Visible = True
		invioweb.Visible = Main.v_iprpi <> ""
		invioweb.Checked = True
		pMemo.Tag = ""
		If Not(vBln6) Then
			IngrMF.Checked = False
			IngrNF.Checked = False
			pUscita.Checked = False
			StampaSubito.Checked = False
			PVariazioni.Checked = False
			pVariazioniWeb.Checked = False
			pFraziona.Checked = False
			pObbligoPrz.Checked = False
			pObbligoQta.Checked = False
			pObbligoDes.Checked = False
			pUM.SelectedIndex = 0
			pIva.SelectedIndex = Main.v_ivadefault
		Else
			pDes.RequestFocus
		End If
		LIngredienti.Visible = True
		LIngredienti2.Visible = True
		pPrezzo.Visible = True
		pPrezzo2.Visible = True
		pPrezzo3.Visible = True
		pPrezzo4.Visible = True
		Prezzo5.Visible = True
		Sottoscorta.Visible = True
		pSelPrt.Visible = True
		pnVariazioni.Visible = True
		pSco.Visible = True
		pIndice.Visible = True
		KCalorie.Visible = True
		pMemo.Visible = True
		pPunti.Visible = True
		lSottos.Visible = True
		pScov.Visible = True
		lPeso.Visible = True
		pPeso.Visible = True
		pQtaCar.Visible = True
		lQtaOttimale.Visible = True
		pQtaOttimale.Visible = True
		LPrz.Visible = True
		vLst3.Initialize
		vLst7.Initialize
		vLst5.Initialize
		vLst9.Initialize
		vLst8.Initialize
		vMap2.Initialize
		vMap3.Initialize
		pCodint.Text = i
		pCodint.Enabled = False
		pBil.Enabled = True
		pAddC.Enabled = True
		pElencoCod.Enabled = True
		pElencoDistinta.Enabled = True
		pDes.Text = ""
		pAddC.Text = ""
		pPrezzo.Text = "0"
		pPrezzo2.Text = "0"
		pPrezzo3.Text = "0"
		pPrezzo4.Text = "0"
		Prezzo5.Text = "0"
		Sottoscorta.Text = "0"
		pSelPrt.Text = "Stampe Centri di Produzione sul reparto: PREDEFINITO"
		pSelPrt.Tag = 0
		pnVariazioni.Text = "Limite Numero variazioni: Nessun Limite"
		pnVariazioni.Tag = 0
		pEsclusiva.Visible = False
		pEsclusiva.Checked = False
		pSco.Text = "0"
		pScov.Text = "0"
		pPeso.Text = "0"
		pQtaCar.Text = "Qta per Confezione: 0"
		pQtaCar.Tag = "0"
		pQtaOttimale.Text = "0"
		pIndice.Tag = 999
		pIndice.Text = "Indice Ordinamento=999"
		KCalorie.Tag = 0
		KCalorie.Text = "Inserire le Chilocalorie per questo articolo"
		pPunti.Tag = 0
		pPunti.Text = "Punti per questo articolo =0"
		pElencoCod.Clear
		pIngredienti.Clear
		pAllergeni.Clear
		pElencoDistinta.Clear
		Main.vSql1.ExecNonQuery("delete from distintabaseTmp")
		Dim cursorWrapper As Cursor
		vCur4 = Main.vSql1.ExecQuery("Select * from distintabaseTmp order by chiave")
		sVarAuto.Clear
		Main.vSql1.ExecNonQuery("delete from varautoTmp")
		Dim cursorWrapper2 As Cursor
		vCur5 = Main.vSql1.ExecQuery("Select * from varautoTmp order by chiave")
		vcustomlistviewold1.Sub012(0)
		vBln2 = False
		Sub038(True)
		lblPluTitle.Text = "Inserimento PLU " & pCodint.Text
	Else
		pBil.Visible = True
		lBil.Visible = True
		pAddC.Visible = False
		Lcod.Visible = False
		LPrz3.Visible = False
		LPrz4.Visible = False
		LPrz2.Visible = True
		lPrza.Visible = False
		lScov.Visible = False
		lSco.Visible = False
		pElencoCod.Visible = False
		LelencoCod.Visible = False
		pElencoDistinta.Visible = False
		pGrp.Visible = False
		lGrp.Visible = False
		pDistinta.Visible = False
		pMacro.Visible = False
		lMacro.Visible = False
		lUM.Visible = False
		pVarAuto.Visible = False
		sVarAuto.Visible = False
		pIngredienti.Visible = False
		pAllergeni.Visible = False
		LAllergeni.Visible = False
		LIngredienti.Visible = False
		LIngredienti2.Visible = False
		IngrMF.Visible = False
		IngrNF.Visible = False
		pUscita.Visible = False
		StampaSubito.Visible = False
		PVariazioni.Visible = False
		pVariazioniWeb.Visible = False
		pFraziona.Visible = False
		pObbligoPrz.Visible = False
		pObbligoQta.Visible = False
		pObbligoDes.Visible = True
		invioweb.Visible = Main.v_iprpi <> ""
		invioweb.Checked = True
		pPrezzo.Visible = True
		pPrezzo2.Visible = True
		pPrezzo3.Visible = False
		pPrezzo4.Visible = False
		Prezzo5.Visible = False
		Sottoscorta.Visible = False
		pSelPrt.Visible = False
		pnVariazioni.Visible = False
		pEsclusiva.Visible = False
		pEsclusiva.Checked = False
		pSco.Visible = False
		lSottos.Visible = False
		pScov.Visible = False
		lPeso.Visible = False
		pPeso.Visible = False
		pQtaCar.Visible = False
		lQtaOttimale.Visible = False
		pQtaOttimale.Visible = False
		If vBln6 Then
			pDes.RequestFocus
		End If
		pIva.SelectedIndex = Main.v_ivadefault
		pIndice.Visible = False
		KCalorie.Visible = False
		pMemo.Visible = False
		pPunti.Visible = False
		LPrz.Visible = True
		vLst3.Initialize
		vMap2.Initialize
		vMap3.Initialize
		vLst5.Initialize
		vLst7.Initialize
		vLst8.Initialize
		vLst9.Initialize
		vLst4.Initialize
		pCodint.Text = i
		pCodint.Enabled = False
		pBil.Enabled = True
		pAddC.Enabled = False
		pElencoCod.Enabled = True
		pDes.Text = ""
		pAddC.Text = ""
		pPrezzo.Text = "0"
		pPrezzo2.Text = "0"
		Prezzo5.Text = "0"
		Sottoscorta.Text = "0"
		pSco.Text = "0"
		pScov.Text = "0"
		pPeso.Text = "0"
		pQtaCar.Text = "Qta per Confezione: 0"
		pQtaCar.Tag = "0"
		pQtaOttimale.Text = "0"
		pIndice.Tag = 999
		pIndice.Text = "Indice Ordinamento=999"
		KCalorie.Tag = 0
		KCalorie.Text = "Inserire le Chilocalorie per questo articolo"
		pPunti.Tag = 0
		pPunti.Text = "Punti per questo articolo =0"
		pMemo.Tag = ""
		pElencoCod.Clear
		vcustomlistviewold1.Sub012(0)
		Sub038(True)
		lblPluTitle.Text = "Inserimento Variazione " & pCodint.Text
	End If
	If Not(invioweb.Visible) Then
		If Not(Main.v_totem) Then
			z = False
			pWebDes1.Visible = z
			pWebDes2.Visible = z
			pWebDes3.Visible = z
			pWebDes4.Visible = z
			pWebDes5.Visible = z
			Dim labelWrapper As Label = pWebIng1
			If z Then
				If Main.vInt24 = Main.d_plu Then
					z2 = True
					labelWrapper.Visible = z2
					Dim labelWrapper2 As Label = pWebIng2
					If z Then
						If Main.vInt24 = Main.d_plu Then
							z3 = True
							labelWrapper2.Visible = z3
							Dim labelWrapper3 As Label = pWebIng3
							If z Then
								If Main.vInt24 = Main.d_plu Then
									z4 = True
									labelWrapper3.Visible = z4
									Dim labelWrapper4 As Label = pWebIng4
									If z Then
										If Main.vInt24 = Main.d_plu Then
											z5 = True
											labelWrapper4.Visible = z5
											If z Then
												Dim i7 As Int = Main.vInt24
											End If
											z6 = False
											pWebIng5.Visible = z6
											If Not(vBln6) Then
												Sub041()
											End If
											mod1.Sub081
											Return
										End If
									End If
									z5 = False
									labelWrapper4.Visible = z5
									If z Then
									End If
									z6 = False
									pWebIng5.Visible = z6
									If Not(vBln6) Then
									End If
									mod1.Sub081
									Return
								End If
							End If
							z4 = False
							labelWrapper3.Visible = z4
							If z Then
							End If
							z5 = False
							pWebIng4.Visible = z5
							If z Then
							End If
							z6 = False
							pWebIng5.Visible = z6
							If Not(vBln6) Then
							End If
							mod1.Sub081
							Return
						End If
					End If
					z3 = False
					labelWrapper2.Visible = z3
					If z Then
					End If
					z4 = False
					pWebIng3.Visible = z4
					If z Then
					End If
					z5 = False
					pWebIng4.Visible = z5
					If z Then
					End If
					z6 = False
					pWebIng5.Visible = z6
					If Not(vBln6) Then
					End If
					mod1.Sub081
					Return
				End If
			End If
			z2 = False
			labelWrapper.Visible = z2
			If z Then
			End If
			z3 = False
			pWebIng2.Visible = z3
			If z Then
			End If
			z4 = False
			pWebIng3.Visible = z4
			If z Then
			End If
			z5 = False
			pWebIng4.Visible = z5
			If z Then
			End If
			z6 = False
			pWebIng5.Visible = z6
			If Not(vBln6) Then
			End If
			mod1.Sub081
			Return
		End If
	End If
	z = True
	pWebDes1.Visible = z
	pWebDes2.Visible = z
	pWebDes3.Visible = z
	pWebDes4.Visible = z
	pWebDes5.Visible = z
	If z Then
	End If
	z2 = False
	pWebIng1.Visible = z2
	If z Then
	End If
	z3 = False
	pWebIng2.Visible = z3
	If z Then
	End If
	z4 = False
	pWebIng3.Visible = z4
	If z Then
	End If
	z5 = False
	pWebIng4.Visible = z5
	If z Then
	End If
	z6 = False
	pWebIng5.Visible = z6
	If Not(vBln6) Then
	End If
	mod1.Sub081
End Sub

Sub bNew2_Click
	vBln6 = Not(vBln7)
	bnew_click()
	vBln6 = False
End Sub

Sub bStampa_Click
	If Sub016() Then
		Return
	End If
	vBln12 = False
	vStr12 = vStr6.Replace("descrizione like", "anagra.descrizione like")
	vWebView1.LoadHtml(dbutil.Sub002(Main.vSql1, vStr12, Null, 0, True, -1, True))
	vWebView1.Tag = vStr12
	vLst12.Clear
	vLst12.AddAll(ArrayToList(Array As String("Codice", "Descrizione", "Reparto", "Listino1", "Listino2", "Sottoscorta", "Giacenza", "Sconto")))
	pnlWv.Visible = True
	lblElencoTitle.Visible = pnlWv.Visible
	If Main.vInt24 = Main.d_plu Then
		lblElencoTitle.Text = "Elenco Articoli"
	Else
		lblElencoTitle.Text = "Elenco Variazioni"
	End If
	mod1.Sub161(lblElencoTitle, 5)
	BtnOk.Visible = pnlWv.Visible
	mod1.Sub081
End Sub

Sub BtnOk_Click
	pnlWv.Visible = False
	lblElencoTitle.Visible = pnlWv.Visible
	BtnOk.Visible = pnlWv.Visible
	Mail.Visible = pnlWv.Visible
End Sub

Sub btnShowImage_Click
	mod1.Sub161(ImageView1, 7)
	ImageView1.SetVisibleAnimated(500, True)
End Sub

Sub Buttonattiva_Click
	Dim labelWrapper As Label = Sender
	Dim vObjectToNumber As Int = labelWrapper.Tag
	If vObjectToNumber < 0 Then
		Return
	End If
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("SELECT Codice from sortedAnagra  WHERE rowid=" & vObjectToNumber + 1)
	Dim cursorWrapper As Cursor
	vCur3 = Main.vSql1.ExecQuery("Select * from anagra where codint = '" & vExecQuerySingleResult & "'")
	vCur3.Position = 0
	'vCSBuilder1 = CSBuilder
	vCSBuilder1.Initialize.Append(vExecQuerySingleResult).Append(CRLF)
	If vCur3.GetInt("invioweb") = 1 Then
		Main.vSql1.ExecNonQuery("update anagra set invioweb = 0  where codint  ='" & vExecQuerySingleResult & "'")
		Dim vAppend As CSBuilder = vCSBuilder1.Color(-5373951).Append("Web ")
		labelWrapper.Text = vAppend.Typeface(Typeface.FONTAWESOME).Append(Chr(61475)).PopAll
	Else
		Main.vSql1.ExecNonQuery("update anagra set invioweb = 1  where codint  ='" & vExecQuerySingleResult & "'")
		Dim vAppend2 As CSBuilder = vCSBuilder1.Color(-14249728).Append("Web ")
		labelWrapper.Text = vAppend2.Typeface(Typeface.FONTAWESOME).Append(Chr(61758)).PopAll
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _buttonfun_click (riga 3264).
Sub Buttonfun_Click
	Dim imageViewWrapper As ImageView
	Dim vObjectToNumber As Int
	Dim popupMenuWrapper As PopupMenu
	Dim z As Boolean
	mod1.vStr2 = "  Sub buttonFun_Click"
	Try
		imageViewWrapper = Sender
		vObjectToNumber = imageViewWrapper.Tag
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vObjectToNumber < 0 Then
		Return
	End If
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("SELECT Codice from sortedAnagra  WHERE rowid=" & vObjectToNumber + 1)
	vInt1 = vObjectToNumber
	Dim cursorWrapper As Cursor
	vCur3 = Main.vSql1.ExecQuery("Select * from anagra where codint = '" & vExecQuerySingleResult & "'")
	vCur3.Position = 0
	If vInt17 = 1 Then
		Sub004(vCur3.GetString("codint"))
	Else If vInt17 = 2 Then
		Sub008(vCur3.GetString("codint"))
	Else
		If Main.vBln33 Then
			If vCur3.GetInt("locked") = 1 Then
				Dim vObjectToCharSequence As Object = "L'articolo " & vCur3.GetString("descrizione") & " risulta essere esaurito."
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Return
			End If
			Main.vStr14 = vCur3.GetString("codint")
			vBln1 = True
			Main.vBln32 = False
			If Main.vInt26 = 1 Then
				Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
				mod1.Sub198("Offerte")
				Main.vInt26 = 0
			Else
				If Main.vInt26 = 3 Then
					Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
					mod1.Sub198("Menu")
					Main.vInt26 = 0
				Else
					If Main.vInt26 = 4 Then
						Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
						mod1.Sub198("Ordini")
						Main.vInt26 = 0
					Else
						If Main.vInt26 = 2 Then
							Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
							mod1.Sub198("ConfPalmari")
							Main.vInt26 = 0
						Else
							Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
							mod1.Sub198("Main")
						End If
					End If
				End If
			End If
			Activity.Finish
			Return
		End If
		If Main.vBln34 Then
			Main.vSql1.ExecNonQuery("update anagra set locked=not locked where codint ='" & vCur3.GetString("codint") & "'")
			Main.vSql1.ExecNonQuery("update pagine set locked=not locked where tipo =" & SmartStringFormatter("", Main.d_plu) & " and valore ='" & SmartStringFormatter("", vCur3.GetString("codint")) & "'")
			If Main.vSql1.ExecQuerySingleResult("SELECT count(*) from  anagra where locked=1 and codint ='" & vCur3.GetString("codint") & "'") > 0 Then
				Main.vSql1.ExecNonQuery("Insert into Artbloccati(codint) values('" & vCur3.GetString("codint") & "')")
			Else
				Main.vSql1.ExecNonQuery("delete from Artbloccati where codint ='" & vCur3.GetString("codint") & "'")
			End If
			Edt1.Text = vStr5
			v5.Initialize("TimerBarcode", 10)
			v5.Enabled = True
			Return
		End If
		If Main.vBln32 Then
			Main.vBln32 = False
			Main.vStr12 = vCur3.GetString("codint")
			vBln1 = True
			Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
			mod1.Sub198("Main")
			Activity.Finish
			Return
		End If
		vLst2.Clear
		vLst2.Add("Modifica")
		vLst2.Add("Elimina")
		vLst2.Add("Movimenti")
		vLst2.Add("Seleziona")
		vLst2.Add("Indice")
		vLst2.Add("Chiudi")
		If vLst2.Size <= 1 Then
			popupMenuWrapper = Null
		Else
			Dim popupMenuWrapper2 As PopupMenu
			popupMenuWrapper2.Initialize("AC", imageViewWrapper)
			Dim size As Int = vLst2.Size - 1
			Dim i As Int
			For i = 0 To size
				Dim bitmapDrawable As BitmapDrawable
				Dim str As String = ""
				Select vLst2.Get(i)
					Case "Modifica"
						str = "fun_pencil-red.png"
						Dim vObjectToString As String = vLst2.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString, bitmapDrawable)
					Case "Elimina"
						str = "006.png"
						Dim vObjectToString2 As String = vLst2.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString2, bitmapDrawable)
					Case "Seleziona"
						If vCur3.GetInt("locked") <> 1 Then
							str = "012.png"
							Dim vObjectToString22 As String = vLst2.Get(i)
							bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
							popupMenuWrapper2.AddMenuItem(i, vObjectToString22, bitmapDrawable)
						Else
						End If
					Case "Movimenti"
						str = "fun_griglia.png"
						Dim vObjectToString222 As String = vLst2.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString222, bitmapDrawable)
					Case "Indice"
						If Main.v_attivaterminale Then
							If Not(Main.v_solovenduto) Then
								If Main.vBln20 Then
									z = True
									If Not(z) Then
										str = "fun_sfoglia.png"
										Dim vObjectToString2222 As String = vLst2.Get(i)
										bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
										popupMenuWrapper2.AddMenuItem(i, vObjectToString2222, bitmapDrawable)
									Else
									End If
								End If
							End If
						End If
						z = False
						If Not(z) Then
						End If
					Case "Chiudi"
						str = "014.png"
						Dim vObjectToString22222 As String = vLst2.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString22222, bitmapDrawable)
					Case Else
						Dim vObjectToString222222 As String = vLst2.Get(i)
						bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
						popupMenuWrapper2.AddMenuItem(i, vObjectToString222222, bitmapDrawable)
				End Select
			Next
			popupMenuWrapper = popupMenuWrapper2
		End If
		Sub040(imageViewWrapper)
		popupMenuWrapper.Show
	End If
End Sub

Sub Buttonprz_Click
	Dim vObjectToNumber As Int
	mod1.vStr2 = "  Sub buttonFun_Click"
	Try
		vObjectToNumber = Sender.Tag
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vObjectToNumber < 0 Then
		Return
	End If
	Sub013(vObjectToNumber, Sender, "list1")
End Sub

Sub Buttonprz_LongClick
	Dim vObjectToNumber As Int
	mod1.vStr2 = "  Sub buttonFun_LongClick"
	Try
		vObjectToNumber = Sender.Tag
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vObjectToNumber < 0 Then
		Return
	End If
	Sub013(vObjectToNumber, Sender, "list2")
End Sub

Sub Buttonsel_Click
	Dim vObjectToNumber As Int
	mod1.vStr2 = "Sub buttonSel_Click"
	Try
		vObjectToNumber = Sender.Tag
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vObjectToNumber < 0 Then
		Return
	End If
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("SELECT Codice from sortedAnagra  WHERE rowid=" & vObjectToNumber + 1)
	Dim cursorWrapper As Cursor
	vCur3 = Main.vSql1.ExecQuery("Select * from anagra where codint = '" & vExecQuerySingleResult & "'")
	vCur3.Position = 0
	If vCur3.GetInt("flgmag") = 1 And vCur3.GetInt("flgusointerno") = 0 Then
		Dim vObjectToCharSequence As Object = "Si desidera annullare l'articolo " & vCur3.GetString("descrizione") & "dalla gestione del magazzino ? (LE EVENTUALI GIACENZE VERRANNO ELIMINATE)Si desidera continuare ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			Return
		End If
		If Main.vSql1.ExecQuerySingleResult("select count(*) from distintabase where codintpadre='" & vCur3.GetString("codint") & "'") > 0 Then
			Dim vObjectToCharSequence3 As Object = "Impossibile proseguire:" & CRLF & "L'articolo è contenuto in una distinta base."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			Return
		End If
		Main.vSql1.ExecNonQuery("update anagra set flgmag = 0 ,giac=0 where codint  ='" & vCur3.GetString("codint") & "'")
		vInt3 = vInt11
		Edt1.Text = vStr7
		imericerca_handleaction()
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo m5… (riga 3593).
Sub Sub013(i As Int, labelWrapper As Label, str As String)
	Dim str2 As String
	Dim vShow As Int
	Dim z As Boolean
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("SELECT Codice from sortedAnagra  WHERE rowid=" & i + 1)
	vInt1 = i
	Dim cursorWrapper As Cursor
	vCur3 = Main.vSql1.ExecQuery("Select * from anagra where codint = '" & vExecQuerySingleResult & "'")
	vCur3.Position = 0
	If vCur3.GetInt("flgusointerno") <> 1 Then
		If Main.v_attivaterminale Then
			If Not(Main.v_solovenduto) Then
			End If
		End If
		If Not(mod1.Sub026(Main.vCur3.GetString("funzioni"), 19)) Then
			Dim vObjectToCharSequence As Object = "Operatore non abilitato."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return
		End If
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 12290
		vDlg1.Input = ""
		vDlg1.Hint = "Prezzo"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		If str = "list2" Then
			If Main.vInt24 = Main.d_plu Then
				Dim vInputList As Int = InputList(ArrayToList(Array As String("Listino 2", "Listino 3", "Listino 4")), "Selezionare il listino da modificare:", -1)
				If vInputList >= 0 Then
					str = "list" & vInputList + 2
					str2 = "listino " & vInputList + 2
					Dim str3 As String = "Inserire il nuovo " & str2 & " (attuale " & NumberFormat2(vCur3.GetString(str), 1, 2, 2, False) & " ) "
					vShow = vDlg1.Show(str3, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
					If vShow = -1 Then
						If IsNumber(vDlg1.Input) Then
							Dim vTmp As Double = mod1.Sub056(vDlg1.Input)
							If vTmp >= 0 And vTmp < 500 Then
								If vTmp = 0 Then
									If Not(pObbligoPrz.Checked) Then
										If Not(Main.v_riducimsg) Then
											z = False
											If Not(z) Then
												Dim vObjectToCharSequence3 As Object = "Si desidera impostare il " & str2 & " a 0,00 ?"
												Dim vObjectToCharSequence4 As Object = Main.vStr8
												Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
												If vMsgbox2 = -2 Then
													Return
												End If
											End If
										End If
									End If
									z = True
									If Not(z) Then
									End If
								End If
								labelWrapper.Text = NumberFormat2(vTmp, 1, 2, 2, False)
								Main.vSql1.ExecNonQuery("update anagra set " & str & " = " & labelWrapper.Text.Replace(",", ".") & " where codint  ='" & vCur3.GetString("codint") & "'")
								If Main.vInt24 = Main.d_plu Then
									If Main.vBln20 Then
										If Main.v_ipserverbila <> "" And (vCur3.GetInt("plupeso") = 1 Or vCur3.GetInt("plupeso") = 2) Then
											If Main.vSql1.ExecQuerySingleResult("select count(*) from DatiBilance where Codint='" & SmartStringFormatter("", vCur3.GetString("codint")) & "'") > 0 Then
												Main.vSql1.ExecNonQuery("update DatiBilance set Aggiornamento=1 where Codint ='" & vCur3.GetString("codint") & "'")
											End If
										End If
									End If
								End If
								vInt3 = vInt11
								Edt1.Text = vStr7
								imericerca_handleaction()
							Else
								Dim vObjectToCharSequence5 As Object = "Prezzo non valido"
								Dim vObjectToCharSequence6 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
							End If
						Else
							Dim vObjectToCharSequence7 As Object = "Prezzo non valido"
							Dim vObjectToCharSequence8 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
						End If
					End If
					mod1.Sub081
					Return
				End If
				Return
			End If
		End If
		If str <> "list2" Then
			str2 = "prezzo di vendita"
		Else
			str2 = "prezzo in detrazione"
		End If
		Dim str32 As String = "Inserire il nuovo " & str2 & " (attuale " & NumberFormat2(vCur3.GetString(str), 1, 2, 2, False) & " ) "
		vShow = vDlg1.Show(str32, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
		End If
		mod1.Sub081
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _cell_rowcontentfiller (riga 3760).
Sub cell_rowcontentfiller(j As Long, str As String, panelWrapper As Panel, b As Byte, i As Int)
	Dim z As Boolean
	Dim str2 As String
	Dim str3 As String
	Try
		If i Mod 2 = 0 Then
			panelWrapper.Color = -1
		Else
			panelWrapper.Color = -3355444
		End If
		If b < 7 Then
			Dim labelWrapper As Label = panelWrapper.GetView(0)
			Select b
				Case 0
					Dim cursorWrapper As Cursor
					vCur9 = Main.vSql1.ExecQuery("SELECT * from sortedAnagra  WHERE rowid=" & 1 + j)
					vCur9.Position = 0
					If vCur9.GetInt("invioweb") = 1 Then
						labelWrapper.Text = i + 1 & "*"
					Else
						labelWrapper.Text = i + 1
					End If
				Case 1
					If Main.vBln17 Then
						'vCSBuilder1 = CSBuilder
						vCSBuilder1.Initialize.Append(vCur9.GetString("Codice")).Append(CRLF)
						If vCur9.GetInt("invioweb") = 1 Then
							Dim vAppend As CSBuilder = vCSBuilder1.Color(-14249728).Append("Web ")
							labelWrapper.Text = vAppend.Typeface(Typeface.FONTAWESOME).Append(Chr(61758)).PopAll
						Else
							Dim vAppend2 As CSBuilder = vCSBuilder1.Color(-5373951).Append("Web ")
							labelWrapper.Text = vAppend2.Typeface(Typeface.FONTAWESOME).Append(Chr(61475)).PopAll
						End If
					Else
						labelWrapper.Text = vCur9.GetString("Codice")
					End If
				Case 2
					Dim str4 As String = ""
					If vCur9.GetInt("flgmag") = 1 And vCur9.GetInt("flgusointerno") = 0 Then
						str4 = " ( Giac." & NumberFormat2(vCur9.GetDouble("giac"), 1, 3, 3, False) & " )"
						If vCur9.GetDouble("giac") <= 0 Then
							panelWrapper.Color = -886121
							str2 = str4
							If vCur9.GetInt("locked") = 1 Then
								panelWrapper.Color = -65536
							End If
							Dim str5 As String = ""
							If Main.v_visualizzavariazioni Then
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from varauto where codint='" & SmartStringFormatter("", vCur9.GetString("Codice")) & "' ") > 0 Then
									Dim cursorWrapper2 As Cursor
									Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select codintvar from varauto where codint='" & SmartStringFormatter("", vCur9.GetString("Codice")) & "' order by (select gruppovar.indice || gruppovar.descrizione from anagra inner join gruppovar on gruppovar.codice = anagra.gruppov where anagra.codint = varauto.codint) ")
									If cursorWrapper3.RowCount > 0 Then
										Dim rowCount As Int = cursorWrapper3.RowCount - 1
										Dim i2 As Int
										For i2 = 0 To rowCount
											cursorWrapper3.Position = i2
											str5 = str5 & " " & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & cursorWrapper3.GetString("codintvar") & "'")
										Next
									End If
									cursorWrapper3.Close
								End If
							End If
							str3 = str5
							If str3 = "" Then
								'vCSBuilder1 = CSBuilder
								Dim vAppend3 As CSBuilder = vCSBuilder1.Initialize.Append(vCur9.GetString("Descrizione"))
								labelWrapper.Text = vAppend3.Color(-16776961).Append(" " & str3 & " ").Append(str2).PopAll
							Else
								labelWrapper.Text = vCur9.GetString("Descrizione") & str3 & str2
							End If
						Else
							panelWrapper.Color = -8328278
						End If
					End If
					str2 = str4
					If vCur9.GetInt("locked") = 1 Then
					End If
					Dim str52 As String = ""
					If Main.v_visualizzavariazioni Then
					End If
					str3 = str52
					If str3 = "" Then
					End If
				Case 3
					labelWrapper.Text = vCur9.GetString("Reparto")
					If Main.vInt24 <> Main.d_plu Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from GruppiVariazioniArt where codint = '" & vCur9.GetString("Codice") & "'") > 0 Then
							labelWrapper.Background = mod1.Sub155(-8328278, 25)
						Else
							labelWrapper.Color = 0
						End If
					End If
				Case 4
					labelWrapper.Text = NumberFormat2(vCur9.GetDouble("Listino1"), 1, 2, 2, False)
					If vCur9.GetInt("flgusointerno") <> 1 Then
						If Main.v_attivaterminale Then
							If Not(Main.v_solovenduto) Then
							End If
						End If
						z = False
						If z Then
							labelWrapper.Background = mod1.Sub155(-8328278, 25)
						Else
							labelWrapper.Color = 0
						End If
					End If
					z = True
					If z Then
					End If
				Case 5
					labelWrapper.Text = vCur9.GetString("Iva")
				Case 6
					labelWrapper.Text = vCur9.GetString("gruppov")
					If Main.vInt24 <> Main.d_plu Then
						Sub036(vCur9.GetInt("gruppovCodice") + 1, labelWrapper)
					Else
						labelWrapper.Background = mod1.Sub155(-8328278, 25)
					End If
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
	If b = 7 Then
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("buttonFun")
		If Not(Main.vBln33) Then
			If Not(Main.vBln34) Then
				If Not(Main.vBln32) Then
					imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "030.png")
					panelWrapper.AddView(imageViewWrapper, DipToCurrent(10), DipToCurrent(5), panelWrapper.Width - DipToCurrent(20), panelWrapper.Height - DipToCurrent(10))
					Return
				End If
			End If
		End If
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "012.png")
		panelWrapper.AddView(imageViewWrapper, DipToCurrent(10), DipToCurrent(5), panelWrapper.Width - DipToCurrent(20), panelWrapper.Height - DipToCurrent(10))
		Return
	End If
	Dim labelWrapper As Label
	Select b
		Case 1
			If Not(Main.vBln17) Then
				labelWrapper.Initialize("")
			Else
				labelWrapper.Initialize("buttonAttiva")
			End If
			labelWrapper.Gravity = Bit.Or(16, 3)
		Case 2
			labelWrapper.Initialize("buttonSel")
			labelWrapper.Gravity = Bit.Or(16, 3)
		Case 3
			labelWrapper.Initialize("rep")
			labelWrapper.Gravity = Bit.Or(16, 3)
		Case 4
			labelWrapper.Initialize("buttonPrz")
			labelWrapper.Gravity = Bit.Or(16, 1)
		Case 5
			labelWrapper.Initialize("")
			labelWrapper.Gravity = Bit.Or(16, 1)
		Case 6
			labelWrapper.Initialize("grp")
			labelWrapper.Gravity = Bit.Or(16, 3)
		Case Else
			labelWrapper.Initialize("")
			labelWrapper.Gravity = Bit.Or(16, 3)
	End Select
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

Sub Sub014(buttonWrapper As Button)
	vBln4 = True
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = buttonWrapper.Tag
	vDlg1.Hint = "descrizione ..."
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	vDlg1.PasswordMode = False
	Dim str As String = "Inserire la descrizione per la lingua " & vCur11.GetString("descrizione")
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		buttonWrapper.Tag = mod1.Sub038(vDlg1.Input, 50, False)
		buttonWrapper.Text = "Descrizione Web " & vCur11.GetString("descrizione") & " = " & IIf(buttonWrapper.Tag = "", "da inserire", buttonWrapper.Tag)
		Return
	End If
End Sub

Sub Sub015(labelWrapper As Label)
	vBln4 = True
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = labelWrapper.Tag
	vDlg1.Hint = "Ingredienti ..."
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	vDlg1.PasswordMode = False
	Dim str As String = "Inserire gli Ingredienti per la lingua " & vCur11.GetString("descrizione")
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		labelWrapper.Tag = mod1.Sub038(vDlg1.Input, 2000, True)
		labelWrapper.Text = "Ingredienti Web " & vCur11.GetString("descrizione") & CRLF & IIf(labelWrapper.Tag = "", "da inserire", labelWrapper.Tag)
		Return
	End If
End Sub

Sub Sub016 As Boolean
	If vInt17 = 1 Then
		ToastMessageShow("Selezionare un articolo da aggiungere alla Distinta Base", True)
		Return True
	End If
	If vInt17 = 2 Then
		ToastMessageShow("Selezionare una variazione ", True)
		Return True
	End If
	Return False
End Sub

Sub Sub017
	Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedAnagra")
	Main.vSql1.ExecNonQuery("CREATE TEMP TABLE sortedAnagra (chiave INTEGER PRIMARY KEY ," & CRLF & TAB & "Codice nvarchar (20)  NULL,Descrizione" & TAB & "nvarchar (50)  NULL,Reparto nvarchar (50)  NULL" & CRLF & TAB & ",Listino1 numeric(18, 2) not NULL default 0,Iva nvarchar (50)  NULL," & CRLF & TAB & "flgusointerno bit not NULL default 0,locked bit not NULL default 0,gruppov nvarchar (50)  NULL,gruppovCodice nvarchar (20) not NULL default '0'," & CRLF & TAB & "flgmag Bit Not Null default 0,giac numeric(18, 3) not NULL default 0,invioweb bit not NULL default 1)")
End Sub

Sub Cstampa_OverrideUrl(str As String) As Boolean
	Dim vSplit() As String = Regex.Split("[.]", str.SubString(7))
	Dim parseDouble As Int = vSplit(0)
	If vSplit(1) = -1 Then
		If vStr12 <> "" Then
			If vBln12 Then
				vWebView1.LoadHtml(dbutil.Sub001(Main.vSql2, vStr12 & " order by " & vLst12.Get(parseDouble) & vStr8, Null, 0, True, 3, 99, parseDouble, False))
			Else
				vWebView1.LoadHtml(dbutil.Sub002(Main.vSql1, vStr12 & " order by " & vLst12.Get(parseDouble) & vStr8, Null, 0, True, parseDouble, True))
				vWebView1.Tag = vStr12 & " order by " & vLst12.Get(parseDouble) & vStr8
			End If
			vStr11 = " Ordinamento:" & vLst12.Get(parseDouble)
			If vStr8 = " asc" Then
				vStr8 = " desc"
			Else
				vStr8 = " asc"
			End If
		End If
	End If
	Return True
End Sub

Sub Sub018(str As String) As Double
	If str.IndexOf(".") >= 0 Then
		Return Round2(modfunstr.Sub006(str), 3)
	End If
	If Main.v_consideraprzintero Then
		Return modfunstr.Sub006(str)
	End If
	Return modfunstr.Sub006(str) / 1000
End Sub

Sub delayedrefresh
	vUltimateListView1.RefreshContent
End Sub

Sub Disaptimer_Tick
	v6.Enabled = False
	LblInfo.Visible = False
End Sub

Sub Edt1_TextChanged(str As String, str2 As String)
	mod1.vStr2 = "Sub Edt1_TextChanged (Old As String, New As String)"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Not(str2.EndsWith(CRLF)) Then
		Return
	End If
	v5.Initialize("TimerBarcode", 10)
	v5.Enabled = True
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

Sub Sub019(str As String, i As Int) As Int
	mod1.vStr2 = "Sub getProgress(Tipo As String) As String"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Select str
		Case Main.d_plu
			Dim str2 As String = ""
			Do While str2 = ""
				If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" & i & "'")) = 0 Then
					str2 = i
				Else
					i = i + 1
				End If
			Loop
			Do While True
				Dim inputDialog2 As InputDialog = vDlg1
				vDlg1.InputType = 2
				vDlg1.Input = str2
				vDlg1.Hint = "Codice Articolo"
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				vDlg1.PasswordMode = False
				Dim vShow As Int = vDlg1.Show("Confermi l'inserimento dell'articolo ?", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				If vShow <> -1 Then
					Return 0
				End If
				If IsNumber(vDlg1.Input) And vDlg1.Input.Length < 9 Then
					If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" & vDlg1.Input & "'")) = 0 Then
						Return vDlg1.Input
					End If
					Dim vObjectToCharSequence As Object = "L'articolo " & vDlg1.Input & " risulta essere già presente in anagrafica."
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Else
					Dim vObjectToCharSequence3 As Object = "Il codice inserito non è valido (lunghezza massima 8 caratteri)"
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				End If
			Loop
		Case Else
			Return 0
	End Select
	mod1.Sub217(LastException.Message)
	Return 0
End Sub

Sub Grp_Click
	Dim labelWrapper As Label
	Dim vObjectToNumber As Int
	mod1.vStr2 = "  Sub grp_Click"
	Try
		labelWrapper = Sender
		vObjectToNumber = labelWrapper.Tag
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vObjectToNumber < 0 Then
		Return
	End If
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("SELECT Codice from sortedAnagra  WHERE rowid=" & vObjectToNumber + 1)
	Dim cursorWrapper As Cursor
	vCur3 = Main.vSql1.ExecQuery("Select * from anagra where codint = '" & vExecQuerySingleResult & "'")
	vCur3.Position = 0
	If vCur3.GetInt("flgusointerno") = 1 Then
		Return
	End If
	If Not(vLst18.IsInitialized) Then
		Dim cursorWrapper2 As Cursor
		vCur13 = Main.vSql1.ExecQuery("Select codice,descrizione from gruppovar order by codice")
		If vCur13.RowCount > 0 Then
			vLst18.Initialize
			Dim rowCount As Int = vCur13.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				vCur13.Position = i
				vLst18.Add(vCur13.GetString("descrizione"))
			Next
		End If
	End If
	vInt1 = vObjectToNumber
	Dim vInputList1 As Int = idLib.InputList1(vLst18, "Selezionare il gruppo per " & vCur3.GetString("descrizione"))
	If vInputList1 >= 0 Then
		vCur13.Position = vInputList1
		labelWrapper.Text = vCur13.GetString("descrizione")
		Main.vSql1.ExecNonQuery("update anagra set gruppov = " & vCur13.GetString("codice") & " where codint  ='" & vCur3.GetString("codint") & "'")
		vInt3 = vInt11
		Edt1.Text = vStr7
		imericerca_handleaction()
	End If
End Sub

Sub Header_Click
	If vUltimateListView1.Enabled And vUltimateListView1.NumberOfItems > 1 Then
		Dim concreteViewWrapper As View = Sender
		If concreteViewWrapper.Tag > 0 And concreteViewWrapper.Tag < 7 Then
			vUltimateListView1.StopScrolling
			If vByt1 = concreteViewWrapper.Tag Then
				vBln8 = Not(vBln8)
			Else
				vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
				If vByt1 >= 0 Then
					vLabelArr1(vByt1).Background = vColorDrawable1
				End If
				vBln8 = True
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

Sub ImageView1_Click
	ImageView1.SetVisibleAnimated(500, False)
End Sub

Sub imericerca_handleaction As Boolean
	mod1.vStr2 = "Sub IMERicerca_HandleAction As Boolean"
	Try
		v5.Initialize("TimerBarcode", 10)
		v5.Enabled = True
		mod1.Sub081
		Return False
	Catch
		mod1.Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub020(labelWrapper As Label, i As Int)
	Dim vObjectToString As String = labelWrapper.Tag
	vCur11.Position = i
	labelWrapper.Text = "Ingredienti Web " & vCur11.GetString("descrizione") & " : " & CRLF & IIf(labelWrapper.Tag = "", "da inserire", vObjectToString.Replace("-", ","))
End Sub

Sub Sub021
	mod1.vStr2 = "Sub Init"
	Try
		vIME2.Initialize("IMERicerca")
		vIME2.AddHeightChangedEvent
		vIME2.AddHandleActionEvent(Edt1)
		If v0 >= 0 Then
			lblmainTitle.Text = "Selezionare un PLU"
		Else
			If Main.vInt24 = Main.d_plu Then
				lblmainTitle.Text = "Gestione PLU"
			Else
				lblmainTitle.Text = "Gestione VARIAZIONI"
			End If
		End If
		vBln5 = False
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub022(z As Boolean)
	sRicerca.Clear
	sRicerca.Add("Ricerca attiva : Descrizione")
	sRicerca.Add("Ricerca attiva : Codice Interno")
	sRicerca.Add("Ricerca attiva : Codice a Barre")
	sRicerca.Add("Ricerca attiva : Reparto")
	If Not(z) Then
		sRicerca.Add("Trova tutte le variazioni")
	Else
		sRicerca.Add("Trova tutti gli articoli")
	End If
	lblInfoRep.Visible = False
	sRicerca.SelectedIndex = 0
	Sub037()
	PnlRep.Visible = False
	vLst1.Initialize
	vInt4 = m_rdescrizione
	pLista.Visible = True
	Edt1.Visible = True
	Edt1.Text = ""
	If vUltimateListView1.IsInitialized Then
		vUltimateListView1.ClearContent
	End If
	vInt3 = m_rdescrizione
	Edt1.Hint = "Inserire la descrizione"
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _invioweb_checkedchange (riga 4720).
Sub Invioweb_CheckedChange(z As Boolean)
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	Dim z7 As Boolean = True
	If z Then
		If Main.v_iprpi <> "" Then
			z2 = True
			pWebDes1.Visible = z2
			pWebDes2.Visible = z2
			pWebDes3.Visible = z2
			pWebDes4.Visible = z2
			pWebDes5.Visible = z2
			Dim labelWrapper As Label = pWebIng1
			If z2 Then
				If Main.vInt24 = Main.d_plu Then
					z3 = True
					labelWrapper.Visible = z3
					Dim labelWrapper2 As Label = pWebIng2
					If z2 Then
						If Main.vInt24 = Main.d_plu Then
							z4 = True
							labelWrapper2.Visible = z4
							Dim labelWrapper3 As Label = pWebIng3
							If z2 Then
								If Main.vInt24 = Main.d_plu Then
									z5 = True
									labelWrapper3.Visible = z5
									Dim labelWrapper4 As Label = pWebIng4
									If z2 Then
										If Main.vInt24 = Main.d_plu Then
											z6 = True
											labelWrapper4.Visible = z6
											If z2 Then
												Dim i5 As Int = Main.vInt24
											End If
											z7 = False
											pWebIng5.Visible = z7
											Return
										End If
									End If
									z6 = False
									labelWrapper4.Visible = z6
									If z2 Then
									End If
									z7 = False
									pWebIng5.Visible = z7
									Return
								End If
							End If
							z5 = False
							labelWrapper3.Visible = z5
							If z2 Then
							End If
							z6 = False
							pWebIng4.Visible = z6
							If z2 Then
							End If
							z7 = False
							pWebIng5.Visible = z7
							Return
						End If
					End If
					z4 = False
					labelWrapper2.Visible = z4
					If z2 Then
					End If
					z5 = False
					pWebIng3.Visible = z5
					If z2 Then
					End If
					z6 = False
					pWebIng4.Visible = z6
					If z2 Then
					End If
					z7 = False
					pWebIng5.Visible = z7
					Return
				End If
			End If
			z3 = False
			labelWrapper.Visible = z3
			If z2 Then
			End If
			z4 = False
			pWebIng2.Visible = z4
			If z2 Then
			End If
			z5 = False
			pWebIng3.Visible = z5
			If z2 Then
			End If
			z6 = False
			pWebIng4.Visible = z6
			If z2 Then
			End If
			z7 = False
			pWebIng5.Visible = z7
			Return
		End If
	End If
	z2 = False
	pWebDes1.Visible = z2
	pWebDes2.Visible = z2
	pWebDes3.Visible = z2
	pWebDes4.Visible = z2
	pWebDes5.Visible = z2
	If z2 Then
	End If
	z3 = False
	pWebIng1.Visible = z3
	If z2 Then
	End If
	z4 = False
	pWebIng2.Visible = z4
	If z2 Then
	End If
	z5 = False
	pWebIng3.Visible = z5
	If z2 Then
	End If
	z6 = False
	pWebIng4.Visible = z6
	If z2 Then
	End If
	z7 = False
	pWebIng5.Visible = z7
End Sub

Sub Iv1_Click
	mod1.vStr2 = "Sub IV1_Click"
	Try
		Dim vObjectToNumber As Int = Sender.Tag
		ScrollView1.Visible = False
		pConferma.Visible = True
		If ScrollView1.Tag = True Then
			If File.Exists(File.DirDefaultExternal & "/ImgStampe", pCodint.Text & ".buf") Then
				File.Delete(File.DirDefaultExternal & "/ImgStampe", pCodint.Text & ".buf")
			End If
			If File.Exists(vStr13, vLst14.Get(vObjectToNumber)) Then
				Dim customprogressdialogVar As CustomProgressDialog
				Dim vPerYToCurrent As Double = PerYToCurrent(10)
				customprogressdialogVar._initialize(Activity, PerXToCurrent(60), (PerXToCurrent(100) - PerXToCurrent(60)) / 2, vPerYToCurrent, "", "", -12303292, 0, "Progress", False)
				Dim vObjectToString As String = vLst14.Get(vObjectToNumber)
				Dim text As String = pCodint.Text
				mod1.Sub091(vStr13, vObjectToString, 25, customprogressdialogVar, text, File.DirDefaultExternal & "/ImgStampe")
				If customprogressdialogVar.isshow Then
					customprogressdialogVar._hide
				End If
				If File.Exists(File.DirDefaultExternal & "/ImgStampe", pCodint.Text & ".buf") Then
					Dim vObjectToCharSequence As Object = "Importazione file riuscita"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Else
					Dim vObjectToCharSequence3 As Object = "Errore durante l'importazione file"
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				End If
			End If
		Else
			If File.Exists(vStr13, vLst14.Get(vObjectToNumber)) Then
				ImageView1.Bitmap = LoadBitmap(vStr13, vLst14.Get(vObjectToNumber))
				btnShowImage.Visible = True
				Dim vObjectToString2 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString2, mod1.vStr4 & "/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString3 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString3, Main.vStr7 & "/10001/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString4 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString4, Main.vStr7 & "/10002/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString5 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString5, Main.vStr7 & "/10003/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString6 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString6, Main.vStr7 & "/10004/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString7 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString7, Main.vStr7 & "/10005/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString8 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString8, Main.vStr7 & "/10006/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString9 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString9, Main.vStr7 & "/10007/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString10 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString10, Main.vStr7 & "/10008/ImgPalm", pCodint.Text & ".jpg")
				Dim vObjectToString11 As String = vLst14.Get(vObjectToNumber)
				File.Copy(vStr13, vObjectToString11, Main.vStr7 & "/10009/ImgPalm", pCodint.Text & ".jpg")
			End If
		End If
		mod1.Sub081
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub KCalorie_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = KCalorie.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di Chilocalorie dell'articolo selezionato ", "Ok", "Annulla", "", Main.vBmp1)
	If vShow <> -1 Or numberDialog.Number = 0 Then
		KCalorie.Tag = 0
		KCalorie.Text = "Inserire le Chilocalorie per questo articolo"
		Return
	End If
	If vShow = -1 Then
		KCalorie.Text = "Chilocalorie =" & numberDialog.Number
		KCalorie.Tag = numberDialog.Number
		Return
	End If
End Sub

Sub LAllergeni_Click
	Dim z As Boolean
	mod1.vStr2 = "LAllergeni_Click"
	Try
		If vCur6.RowCount > 0 Then
			Dim map As Map
			map.Initialize
			Dim rowCount As Int = vCur6.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				vCur6.Position = i
				Dim size As Int = vLst9.Size - 1
				Dim i2 As Int = 0
				Do While True
					If i2 > size Then
						z = False
						Exit
					End If
					If vLst9.Get(i2) <> vCur6.GetString("codice") Then
						i2 = i2 + 1
					Else
						z = True
						Exit
					End If
				Loop
				map.Put(vCur6.GetString("descrizione"), z)
			Next
			InputMap(map, "Selezionare gli allergeni")
			vLst7.Clear
			pAllergeni.Clear
			vLst9.Clear
			Dim size2 As Int = map.Size - 1
			Dim i3 As Int
			For i3 = 0 To size2
				If map.GetValueAt(i3) Then
					vCur6.Position = i3
					vLst7.Add(vCur6.GetString("descrizione"))
					vLst9.Add(vCur6.GetString("codice"))
				End If
			Next
			Sub027()
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub lblElencoTitle_Click
End Sub

Sub lblPluTitle_Click
End Sub

Sub LIngredienti_Click
	Dim z As Boolean
	mod1.vStr2 = "LIngredienti_Click"
	Try
		If vCur7.RowCount > 0 Then
			Dim map As Map
			map.Initialize
			Dim rowCount As Int = vCur7.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				vCur7.Position = i
				Dim size As Int = vLst8.Size - 1
				Dim i2 As Int = 0
				Do While True
					If i2 > size Then
						z = False
						Exit
					End If
					If vLst8.Get(i2) <> vCur7.GetString("codice") Then
						i2 = i2 + 1
					Else
						z = True
						Exit
					End If
				Loop
				map.Put(vCur7.GetString("descrizione"), z)
			Next
			InputMap(map, "Selezionare gli ingredienti")
			vLst5.Clear
			pIngredienti.Clear
			vLst8.Clear
			Dim size2 As Int = map.Size - 1
			Dim i3 As Int
			For i3 = 0 To size2
				If map.GetValueAt(i3) Then
					vLst5.Add(map.GetKeyAt(i3))
					vLst8.Add(Main.vSql1.ExecQuerySingleResult("Select max(codice) from ingredienti where descrizione ='" & map.GetKeyAt(i3) & "'"))
				End If
			Next
			Sub030()
			Sub003()
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub LIngredienti2_Click
	Try
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 1
		vDlg1.Input = ""
		vDlg1.Hint = "Trova ingrediente ..."
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim vShow As Int = vDlg1.Show("Inserisci le iniziali dell'ingrediente", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And vCur7.RowCount > 0 Then
			Dim rowCount As Int = vCur7.RowCount - 1
			Dim i As Int = 0
			Do While i <= rowCount
				vCur7.Position = i
				If vCur7.GetString("descrizione").ToLowerCase.StartsWith(vDlg1.Input.ToLowerCase) Then
					Exit
				End If
				i = i + 1
			Loop
			Dim vInputList As Int = InputList(vLst6, "Seleziona un ingrediente", i)
			If vInputList >= 0 Then
				vCur7.Position = vInputList
				vLst5.Add(vCur7.GetString("descrizione"))
				vLst8.Add(vCur7.GetString("codice"))
			End If
			Sub030()
			Sub003()
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub023
	If vInt9 = 0 Then
		vUltimateListView1.ClearContent
		Sub017()
		Main.vSql1.ExecNonQuery("insert into sortedAnagra(Codice,Descrizione,Reparto," & CRLF & TAB & "Listino1,Iva,flgusointerno,locked,gruppov,gruppovCodice,flgmag,giac,invioweb) " & SmartStringFormatter("", vStr3 & vStr4) & "  ")
		vUltimateListView1.BulkAddItems(Main.vSql1.ExecQuerySingleResult("Select count(*) from sortedAnagra"), "ROW", 0)
		Dim cursorWrapper As Cursor
		vCur10 = Main.vSql1.ExecQuery("Select Descrizione,Reparto from sortedAnagra")
		Return
	End If
	If vInt9 = 1 Then
		CallSubDelayed(Me, "DelayedRefresh")
		Return
	End If
	If vInt9 = 2 Then
		vUltimateListView1.ClearContent
		vUltimateListView1.BulkAddItems(Main.vSql1.ExecQuerySingleResult("Select count(*) from sortedAnagra"), "ROW", 0)
		Return
	End If
End Sub

Sub Sub024(z As Boolean)
	Dim str As String
	Dim i As Int
	mod1.vStr2 = "Sub LoadImages"
	Try
		If Not(z) Then
			str = ".jpg"
		Else
			str = ".png,.jpg"
		End If
		If vLst13.Size > 0 And ScrollView1.Tag <> z Then
			Sub010()
		End If
		If vLst13.Size = 0 Then
			Dim fileDialog As FileDialog
			fileDialog.TextColor = -7829368
			fileDialog.FastScroll = True
			fileDialog.FileFilter = str
			If Main.v_usbpath <> "" Then
				fileDialog.FilePath = Main.v_usbpath
			Else
				fileDialog.FilePath = mod1.vStr4
			End If
			Dim vObjectToCharSequence As Object = "Selezionare il percorso dell'immagine."
			Dim vShow As Int = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", "", Main.vBmp1)
			If vShow = -3 Then
				If Not(z) Then
					btnShowImage.Visible = False
					ImageView1.Visible = False
					If File.Exists(mod1.vStr4 & "/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(mod1.vStr4 & "/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10001/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10001/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10002/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10002/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10003/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10003/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10004/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10004/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10005/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10005/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10006/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10006/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10007/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10007/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10008/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10008/ImgPalm", pCodint.Text & ".jpg")
					End If
					If File.Exists(Main.vStr7 & "/10009/ImgPalm", pCodint.Text & ".jpg") Then
						File.Delete(Main.vStr7 & "/10009/ImgPalm", pCodint.Text & ".jpg")
					End If
				Else
					If File.Exists(File.DirDefaultExternal & "/ImgStampe", pCodint.Text & ".buf") Then
						File.Delete(File.DirDefaultExternal & "/ImgStampe", pCodint.Text & ".buf")
					End If
				End If
				Return
			End If
			vStr13 = fileDialog.FilePath
			If Not(File.Exists(vStr13, "")) Then
				Dim vObjectToCharSequence2 As Object = "Il percorso " & vStr13 & " non è stato trovato"
				Dim vObjectToCharSequence3 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence2, vObjectToCharSequence3, "OK", "", "", Main.vBmp1)
				Return
			End If
			Dim vListFiles As List = File.ListFiles(vStr13)
			If vListFiles.Size = 0 Then
				Return
			End If
			Dim size As Int = vListFiles.Size - 1
			Dim i2 As Int
			For i2 = 0 To size
				DoEvents
				Dim vObjectToString As String = vListFiles.Get(i2)
				Dim endsWith As Boolean = vObjectToString.ToLowerCase.EndsWith(".jpg")
				If z And Not(endsWith) Then
					endsWith = vObjectToString.ToLowerCase.EndsWith(".png")
				End If
				If endsWith Then
					Dim bitmapWrapper As Bitmap
					bitmapWrapper.InitializeSample(vStr13, vObjectToString, DipToCurrent(200), DipToCurrent(200))
					vLst13.Add(bitmapWrapper)
					vLst14.Add(vObjectToString)
					If vLst13.Size > 150 Then
						Exit
					End If
				End If
			Next
			ScrollView1.Tag = z
			ScrollView1.Panel.Height = DipToCurrent(200) * vLst13.Size
			Dim size2 As Int = vLst13.Size - 1
			Dim i3 As Int = 0
			Dim i4 As Int
			For i4 = 0 To size2
				Dim imageViewWrapper As ImageView
				imageViewWrapper.Initialize("IV1")
				imageViewWrapper.Tag = i4
				Dim bitmapDrawable As BitmapDrawable
				bitmapDrawable.Initialize(vLst13.Get(i4))
				imageViewWrapper.Background = bitmapDrawable
				imageViewWrapper.Gravity = 17
				Dim labelWrapper As Label
				labelWrapper.Initialize("lblIV")
				labelWrapper.Text = vLst14.Get(i4)
				labelWrapper.TextColor = -1
				Dim width As Int = ScrollView1.Width / 2 - DipToCurrent(10)
				If i4 Mod 2 = 0 Then
					ScrollView1.Panel.AddView(imageViewWrapper, DipToCurrent(5), DipToCurrent(5) + DipToCurrent(200) * i3, width, DipToCurrent(190))
					ScrollView1.Panel.AddView(labelWrapper, DipToCurrent(5), DipToCurrent(5) + DipToCurrent(200) * i3 + DipToCurrent(150), width, DipToCurrent(50))
					i = i3
				Else
					ScrollView1.Panel.AddView(imageViewWrapper, DipToCurrent(5) + width, DipToCurrent(5) + DipToCurrent(200) * i3, width, DipToCurrent(190))
					ScrollView1.Panel.AddView(labelWrapper, DipToCurrent(5) + width, DipToCurrent(5) + DipToCurrent(200) * i3 + DipToCurrent(150), width, DipToCurrent(50))
					i = i3 + 1
				End If
				i3 = i
			Next
		End If
		If vLst13.Size > 0 Then
			ScrollView1.Visible = vLst13.Size > 0
		End If
		pConferma.Visible = Not(ScrollView1.Visible)
		If ScrollView1.Visible Then
			mod1.Sub161(ScrollView1, 7)
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub025(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _mail_click (riga 5497).
Sub Mail_Click
	Dim z As Boolean
	Dim cursorWrapper As Cursor
	Dim i As Int
	Dim size As Int
	Dim i2 As Int
	Dim rowCount As Int
	Dim i3 As Int
	Dim str As String
	Dim i4 As Int
	mod1.vStr2 = "Sub Mail_Click"
	Try
		If Main.v_mserver <> "" Then
			If Main.v_mporta <> "" Then
				If Main.v_muser <> "" Then
					If Main.v_mpwd <> "" Then
						If Main.v_md1 = "" Then
						End If
						Dim vObjectToCharSequence As Object = "Confermi l'invio della mail ? "
						Dim vObjectToCharSequence2 As Object = Main.vStr8
						Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
						If vMsgbox2 = -1 Then
							ProgressDialogShow2("Invio in corso ...", False)
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
									vSMTP1.Subject = Main.v_mdesmittente & " " & "Elenco Articoli"
									Dim vTmp As String = mod1.Sub061(mod1.Sub058)
									Dim writableWorkbookWrapper As WritableWorkbook
									writableWorkbookWrapper.Initialize(mod1.vStr4, "Elenco Articoli.xls")
									Dim vAddSheet As WritableSheet = writableWorkbookWrapper.AddSheet("Elenco Articoli", 0)
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
									Dim writableCellFormatWrapper6 As WritableCellFormat
									writableCellFormatWrapper6.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GOLD)
									Dim writableCellFormatWrapper7 As WritableCellFormat
									writableCellFormatWrapper7.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREEN)
									Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
									Dim writableCellWrapper As WritableCell
									writableCellWrapper.InitializeText(0, 0, "Elenco Articoli")
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
									vAddSheet.AddCell(writableCellWrapper)
									writableCellWrapper.InitializeText(2, 0, vTmp)
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
									vAddSheet.AddCell(writableCellWrapper)
									vAddSheet.SetRowHeight(0, 18)
									Dim stringBuilderWrapper As StringBuilder
									stringBuilderWrapper.Initialize
									stringBuilderWrapper.Append("Elenco Articoli").Append(CRLF)
									stringBuilderWrapper.Append("").Append(CRLF)
									stringBuilderWrapper.Append("Data e ora di stampa: " & vTmp).Append(CRLF)
									stringBuilderWrapper.Append("Inviato da : ").Append(CRLF)
									Dim cursorWrapper2 As Cursor
									cursorWrapper = Main.vSql1.ExecQuery("Select * from intesta order by codice")
									If cursorWrapper.RowCount > 0 Then
										Dim i5 As Int
										For i5 = 0 To 5
											cursorWrapper.Position = i5
											stringBuilderWrapper.Append(cursorWrapper.GetString("descrizione")).Append(CRLF)
										Next
									End If
									stringBuilderWrapper.Append(" ").Append(CRLF)
									If vStr10 <> "" Then
										i = 0
									Else
										stringBuilderWrapper.Append("Filtro: ").Append(CRLF)
										writableCellWrapper.InitializeText(0, 2, "Filtro: ")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
										vAddSheet.AddCell(writableCellWrapper)
										stringBuilderWrapper.Append(vStr10 & vStr11).Append(CRLF)
										writableCellWrapper.InitializeText(1, 2, vStr10 & vStr11)
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
										vAddSheet.AddCell(writableCellWrapper)
										stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
										i = 5
									End If
									size = vLst16.Size - 1
									Dim str4 As String = ""
									i2 = 0
									Do While i2 <= size
										Dim vObjectToString As String = vLst16.Get(i2)
										Dim str5 As String = str4 & vObjectToString
										writableCellWrapper.InitializeText(i2, i, vObjectToString.Trim)
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper2)
										vAddSheet.AddCell(writableCellWrapper)
										Select vObjectToString
											Case "Reparto"
												vAddSheet.SetColumnWidth(i2, 12)
											Case "Descrizione"
												vAddSheet.SetColumnWidth(i2, 25)
											Case "Codice", "Sottoscorta"
												vAddSheet.SetColumnWidth(i2, 10)
											Case Else
												vAddSheet.SetColumnWidth(i2, 7)
										End Select
										i2 = i2 + 1
										str4 = str5
									Loop
									Dim cursorWrapper3 As Cursor
									Dim cursorWrapper4 As Cursor = Main.vSql2.ExecQuery(vStr12)
									rowCount = cursorWrapper4.RowCount - 1
									i3 = 0
									Dim i6 As Int = i + 1
									Do While i3 <= rowCount
										cursorWrapper4.Position = i3
										Dim i7 As Int = 0
										Dim size2 As Int = vLst15.Size - 1
										Dim i8 As Int = 0
										Dim str6 As String = ""
										Do While i8 <= size2
											Dim vSplit() As String = Regex.Split(";", vLst15.Get(i8))
											Dim recsizeVar As recsize
											recsizeVar.size = vSplit(0)
											recsizeVar.descrizione = vSplit(1)
											recsizeVar.Tipo = vSplit(2)
											Dim writableCellFormatWrapper8 As WritableCellFormat = IIf(i3 Mod 2 = 0, writableCellFormatWrapper3, writableCellFormatWrapper4)
											If recsizeVar.Tipo = "S" Then
												Dim sb4 As String = str6 & modfunstr.left(cursorWrapper4.GetString(recsizeVar.descrizione).Trim & modfunstr.Sub004(recsizeVar.size), recsizeVar.size)
												writableCellWrapper.InitializeText(i8, i6, cursorWrapper4.GetString(recsizeVar.descrizione).Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper8)
												vAddSheet.AddCell(writableCellWrapper)
												i4 = i7
												str = sb4
											Else If recsizeVar.Tipo = "N" Then
												If recsizeVar.descrizione = "Sottoscorta" Then
													i7 = cursorWrapper4.GetInt(recsizeVar.descrizione)
												End If
												Dim sb6 As String = str6 & modfunstr.Sub003(modfunstr.Sub004(recsizeVar.size) & NumberFormat2(cursorWrapper4.GetDouble(recsizeVar.descrizione), 1, 2, 2, False), recsizeVar.size)
												If recsizeVar.descrizione = "Giacenza" Then
													writableCellFormatWrapper8 = IIf(cursorWrapper4.GetDouble(recsizeVar.descrizione) <= 0, writableCellFormatWrapper5, IIf(cursorWrapper4.GetDouble(recsizeVar.descrizione) <= i7, writableCellFormatWrapper6, writableCellFormatWrapper7))
												End If
												writableCellWrapper.InitializeNumber(i8, i6, cursorWrapper4.GetString(recsizeVar.descrizione).Trim)
												writableCellWrapper.SetCellFormat(writableCellFormatWrapper8)
												vAddSheet.AddCell(writableCellWrapper)
												i4 = i7
												str = sb6
											Else
												str = str6
												i4 = i7
											End If
											i8 = i8 + 1
											str6 = str
											i7 = i4
										Loop
										i3 = i3 + 1
										i6 = i6 + 1
									Loop
									vSMTP1.Body = stringBuilderWrapper
									writableWorkbookWrapper.Write
									writableWorkbookWrapper.Close
									vSMTP1.AddAttachment(mod1.vStr4, "Elenco Articoli.xls")
									vSMTP1.Send
								End If
							End If
							z = True
							sMTPWrapper2.UseSSL = z
							If Main.v_md1 <> "" Then
							End If
							If Main.v_md2 <> "" Then
							End If
							vSMTP1.Subject = Main.v_mdesmittente & " " & "Elenco Articoli"
							Dim vTmp_ As String = mod1.Sub061(mod1.Sub058)
							Dim writableWorkbookWrapper2 As WritableWorkbook
							writableWorkbookWrapper2.Initialize(mod1.vStr4, "Elenco Articoli.xls")
							Dim vAddSheet2 As WritableSheet = writableWorkbookWrapper2.AddSheet("Elenco Articoli", 0)
							Dim writableCellFormatWrapper9 As WritableCellFormat
							writableCellFormatWrapper9.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 10, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
							Dim writableCellFormatWrapper22 As WritableCellFormat
							writableCellFormatWrapper22.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
							writableCellFormatWrapper22.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
							Dim writableCellFormatWrapper32 As WritableCellFormat
							writableCellFormatWrapper32.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
							Dim writableCellFormatWrapper42 As WritableCellFormat
							writableCellFormatWrapper42.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
							writableCellFormatWrapper42.BackgroundColor = anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREY_25_PERCENT
							Dim writableCellFormatWrapper52 As WritableCellFormat
							writableCellFormatWrapper52.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_RED)
							Dim writableCellFormatWrapper62 As WritableCellFormat
							writableCellFormatWrapper62.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GOLD)
							Dim writableCellFormatWrapper72 As WritableCellFormat
							writableCellFormatWrapper72.Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, False, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_GREEN)
							Initialize2(anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.FONT_ARIAL, 7, True, False, False, anywheresoftware.b4a.objects.WorkbookWrapper.WritableCellFormatWrapper.COLOR_AUTOMATIC)
							Dim writableCellWrapper2 As WritableCell
							writableCellWrapper2.InitializeText(0, 0, "Elenco Articoli")
							writableCellWrapper2.SetCellFormat(writableCellFormatWrapper9)
							vAddSheet2.AddCell(writableCellWrapper2)
							writableCellWrapper2.InitializeText(2, 0, vTmp_)
							writableCellWrapper2.SetCellFormat(writableCellFormatWrapper9)
							vAddSheet2.AddCell(writableCellWrapper2)
							vAddSheet2.SetRowHeight(0, 18)
							Dim stringBuilderWrapper2 As StringBuilder
							stringBuilderWrapper2.Initialize
							stringBuilderWrapper2.Append("Elenco Articoli").Append(CRLF)
							stringBuilderWrapper2.Append("").Append(CRLF)
							stringBuilderWrapper2.Append("Data e ora di stampa: " & vTmp_).Append(CRLF)
							stringBuilderWrapper2.Append("Inviato da : ").Append(CRLF)
							Dim cursorWrapper22 As Cursor
							cursorWrapper = Main.vSql1.ExecQuery("Select * from intesta order by codice")
							If cursorWrapper.RowCount > 0 Then
							End If
							stringBuilderWrapper2.Append(" ").Append(CRLF)
							If vStr10 <> "" Then
							End If
							size = vLst16.Size - 1
							Dim str42 As String = ""
							i2 = 0
							Do While i2 <= size
							Loop
							Dim cursorWrapper32 As Cursor
							Dim cursorWrapper42 As Cursor = Main.vSql2.ExecQuery(vStr12)
							rowCount = cursorWrapper42.RowCount - 1
							i3 = 0
							Dim i62 As Int = i + 1
							Do While i3 <= rowCount
							Loop
							vSMTP1.Body = stringBuilderWrapper2
							writableWorkbookWrapper2.Write
							writableWorkbookWrapper2.Close
							vSMTP1.AddAttachment(mod1.vStr4, "Elenco Articoli.xls")
							vSMTP1.Send
						End If
					End If
				End If
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
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo m1… (riga 5910).
Sub Sub026
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	Dim z7 As Boolean
	Dim z8 As Boolean
	Dim cursorWrapper As Cursor
	Dim z9 As Boolean
	Dim z10 As Boolean
	Dim z11 As Boolean
	Dim z12 As Boolean
	Dim z13 As Boolean
	Dim z14 As Boolean
	Dim z15 As Boolean
	Dim z16 As Boolean
	Dim z17 As Boolean
	Dim z18 As Boolean
	Dim vShow As Int
	If Main.v_attivaterminale Then
		If Not(Main.v_solovenduto) Then
			If Main.vBln20 Then
				Dim inputDialog2 As InputDialog = vDlg1
				vDlg1.InputType = 2
				vDlg1.Input = ""
				vDlg1.PasswordMode = True
				vDlg1.Hint = "Password di accesso"
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				If Main.vBln39 Then
					vDlg1.Input = "3698741"
					vShow = -1
				Else
					vShow = vDlg1.Show("Inserire la Password di accesso ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				End If
				If vShow <> -1 Then
					mod1.Sub081
					Return
				End If
				If Not(vDlg1.Input = "147896" Or vDlg1.Input = "3698741") Then
					Dim vObjectToCharSequence As Object = "Password non corretta"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
			End If
		End If
	End If
	vStr9 = ""
	vInt14 = 0
	vInt15 = 0
	vInt16 = 0
	vInt9 = 1
	If vCur3.GetString("codint") = "variaweb" Then
		Dim vObjectToCharSequence3 As Object = "Articolo non modificabile"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	bGestBila.Visible = False
	If Main.vInt24 = Main.d_plu Then
		vLst3.Initialize
		vMap2.Initialize
		vMap3.Initialize
		vLst5.Initialize
		vLst8.Initialize
		vLst7.Initialize
		vLst9.Initialize
		pCodint.Text = vCur3.GetString("codint")
		pCodint.Enabled = False
		ImageView1.Visible = False
		btnShowImage.Visible = False
		If File.Exists(mod1.vStr4 & "/ImgPalm", pCodint.Text & ".jpg") Then
			btnShowImage.Visible = True
			ImageView1.Bitmap = LoadBitmap(mod1.vStr4 & "/ImgPalm", pCodint.Text & ".jpg")
		Else
			ImageView1.Invalidate
		End If
		Dim buttonWrapper As Button = bGestBila
		If Main.vBln20 Then
			If Main.v_ipserverbila <> "" And (vCur3.GetInt("plupeso") = 1 Or vCur3.GetInt("plupeso") = 2) Then
				z8 = True
				buttonWrapper.Visible = z8
				vStr9 = vCur3.GetString("dll")
				vInt14 = vCur3.GetInt("textsize")
				vInt15 = vCur3.GetInt("colore")
				vInt16 = vCur3.GetInt("coloret")
				pRep.SelectedIndex = vCur3.GetInt("reparto")
				pMacro.SelectedIndex = vCur3.GetInt("macroa") + 1
				vInt13 = vCur3.GetInt("reparto")
				pIva.SelectedIndex = vCur3.GetInt("iva")
				pBil.SelectedIndex = vCur3.GetInt("plupeso")
				pUM.SelectedIndex = vCur3.GetInt("misura")
				pGrp.SelectedIndex = vCur3.GetInt("gruppov")
				pDes.Text = vCur3.GetString("descrizione")
				pAddC.Text = ""
				pPrezzo.Text = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
				pPrezzo2.Text = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
				pPrezzo3.Text = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
				pPrezzo4.Text = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
				Prezzo5.Text = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
				Sottoscorta.Text = vCur3.GetString("sottoscorta")
				If vCur3.GetInt("stampante2") <> 0 Then
					pSelPrt.Text = "Stampe Centri di Produzione sul reparto: PREDEFINITO"
					pEsclusiva.Visible = False
					pEsclusiva.Checked = False
				Else
					pSelPrt.Text = "Stampe Centri di Produzione sul reparto: " & Main.vSql1.ExecQuerySingleResult("Select descrizione from reparti where codice = " & vCur3.GetString("stampante2"))
					pEsclusiva.Visible = True
					pEsclusiva.Checked = vCur3.GetInt("stampaesclusiva") = 1
				End If
				pSelPrt.Tag = vCur3.GetInt("stampante2")
				pSco.Text = vCur3.GetString("scop")
				pScov.Text = vCur3.GetString("scov")
				pPeso.Text = vCur3.GetString("peso")
				pQtaCar.Text = "Qta per Confezione: " & vCur3.GetString("qtacartone")
				pQtaCar.Tag = vCur3.GetString("qtacartone")
				pQtaOttimale.Text = vCur3.GetString("qtaottimale")
				pIndice.Tag = vCur3.GetInt("indice")
				pIndice.Text = "Indice Ordinamento=" & pIndice.Tag
				pMemo.Tag = ""
				KCalorie.Tag = vCur3.GetInt("Kcal")
				If vCur3.GetInt("Kcal") <= 0 Then
					KCalorie.Text = "Chilocalorie =" & KCalorie.Tag
				Else
					KCalorie.Text = "Inserire le Chilocalorie per questo articolo"
				End If
				pPunti.Tag = vCur3.GetInt("punti")
				pPunti.Text = "Punti per questo articolo =" & vCur3.GetInt("punti")
				Sub041()
				Dim cursorWrapper2 As Cursor
				cursorWrapper = Main.vSql1.ExecQuery("Select * from ean where codint = '" & vCur3.GetString("codint") & "'")
				pElencoCod.Clear
				pIngredienti.Clear
				pAllergeni.Clear
				pElencoDistinta.Clear
				vLst3.Clear
				If cursorWrapper.RowCount > 0 Then
					Dim rowCount As Int = cursorWrapper.RowCount - 1
					Dim i2 As Int
					For i2 = 0 To rowCount
						cursorWrapper.Position = i2
						Dim str2 As String = cursorWrapper.GetString("codice") & IIf(cursorWrapper.GetInt("qta") > 1, " (Qta:" & cursorWrapper.GetString("qta") & ")", "")
						vLst3.Add(cursorWrapper.GetString("codice"))
						vMap2.Put(cursorWrapper.GetString("codice"), cursorWrapper.GetInt("qta"))
						vMap3.Put(cursorWrapper.GetString("codice"), cursorWrapper.GetInt("importo"))
						pElencoCod.Add(str2)
					Next
				End If
				vBln2 = False
				vcustomlistviewold1.Sub012(0)
				Sub038(True)
				Dim z19 As Boolean = IIf(vCur3.GetInt("flgusointerno") = 0 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				pBil.Visible = z19
				lBil.Visible = z19
				pMacro.Visible = z19
				pUM.Visible = z19
				lMacro.Visible = z19
				lUM.Visible = z19
				pAddC.Visible = z19
				Lcod.Visible = z19
				LIngredienti.Visible = z19
				LIngredienti2.Visible = z19
				pIngredienti.Visible = z19
				LAllergeni.Visible = z19
				pAllergeni.Visible = z19
				pElencoDistinta.Visible = pIngredienti.Visible
				pGrp.Visible = pIngredienti.Visible
				lGrp.Visible = pIngredienti.Visible
				pDistinta.Visible = pIngredienti.Visible
				pVarAuto.Visible = pIngredienti.Visible
				sVarAuto.Visible = pIngredienti.Visible
				Main.vSql1.ExecNonQuery("delete from distintabaseTmp")
				Main.vSql1.ExecNonQuery("delete from varautoTmp")
				If Not(pElencoDistinta.Visible) Then
					Dim cursorWrapper3 As Cursor
					Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from distintabase where codint = '" & vCur3.GetString("codint") & "'")
					If cursorWrapper4.RowCount > 0 Then
						Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
						Dim i3 As Int
						For i3 = 0 To rowCount2
							cursorWrapper4.Position = i3
							Main.vSql1.ExecNonQuery("insert into distintabaseTmp(codintpadre,qta) values('" & cursorWrapper4.GetString("codintpadre") & "'," & cursorWrapper4.GetString("qta") & ")")
						Next
					End If
					Dim cursorWrapper5 As Cursor
					vCur4 = Main.vSql1.ExecQuery("Select * from distintabaseTmp order by chiave")
					Dim cursorWrapper6 As Cursor
					Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("Select * from varauto where codint = '" & vCur3.GetString("codint") & "'")
					If cursorWrapper7.RowCount > 0 Then
						Dim rowCount3 As Int = cursorWrapper7.RowCount - 1
						Dim i4 As Int
						For i4 = 0 To rowCount3
							cursorWrapper7.Position = i4
							Main.vSql1.ExecNonQuery("insert into varautoTmp(codintvar) values('" & cursorWrapper7.GetString("codintvar") & "')")
						Next
					End If
					Dim cursorWrapper8 As Cursor
					vCur5 = Main.vSql1.ExecQuery("Select * from varautoTmp order by chiave")
					cursorWrapper7.Close
					Sub028()
					Sub034()
				Else
					Dim cursorWrapper9 As Cursor
					vCur4 = Main.vSql1.ExecQuery("Select * from distintabaseTmp order by chiave")
					Dim cursorWrapper10 As Cursor
					vCur5 = Main.vSql1.ExecQuery("Select * from varautoTmp order by chiave")
				End If
				IngrMF.Visible = pIngredienti.Visible
				IngrNF.Visible = pIngredienti.Visible
				pUscita.Visible = pIngredienti.Visible
				PVariazioni.Visible = pIngredienti.Visible
				pVariazioniWeb.Visible = pIngredienti.Visible
				pFraziona.Visible = pIngredienti.Visible
				pObbligoPrz.Visible = pIngredienti.Visible
				pObbligoQta.Visible = pIngredienti.Visible
				pObbligoDes.Visible = pIngredienti.Visible
				pMacro.Visible = pIngredienti.Visible
				Dim checkBoxWrapper As CheckBox = invioweb
				If pIngredienti.Visible Then
					If Main.v_iprpi <> "" Then
						z9 = True
						checkBoxWrapper.Visible = z9
						StampaSubito.Visible = pIngredienti.Visible
						If pIngredienti.Visible Then
							IngrMF.Checked = vCur3.GetInt("ingredientisumf") = 1
							IngrNF.Checked = vCur3.GetInt("ingredientisunf") = 1
							Dim cursorWrapper11 As Cursor
							cursorWrapper = Main.vSql1.ExecQuery("Select * from ingredientiplu where codint = '" & vCur3.GetString("codint") & "'")
							vLst5.Clear
							vLst8.Clear
							If cursorWrapper.RowCount > 0 Then
								Dim rowCount4 As Int = cursorWrapper.RowCount - 1
								Dim i5 As Int
								For i5 = 0 To rowCount4
									cursorWrapper.Position = i5
									Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select descrizione from ingredienti where codice = " & cursorWrapper.GetString("codice"))
									vLst8.Add(cursorWrapper.GetString("codice"))
									vLst5.Add(vExecQuerySingleResult)
									pIngredienti.Add(vExecQuerySingleResult)
								Next
							End If
						End If
						If pAllergeni.Visible Then
							Dim cursorWrapper12 As Cursor
							cursorWrapper = Main.vSql1.ExecQuery("Select * from allergeniplu where codint = '" & vCur3.GetString("codint") & "'")
							vLst7.Clear
							vLst9.Clear
							If cursorWrapper.RowCount > 0 Then
								Dim rowCount5 As Int = cursorWrapper.RowCount - 1
								Dim i6 As Int
								For i6 = 0 To rowCount5
									cursorWrapper.Position = i6
									Dim vExecQuerySingleResult2 As String = Main.vSql1.ExecQuerySingleResult("Select descrizione from allergeni where codice = " & cursorWrapper.GetString("codice"))
									vLst9.Add(cursorWrapper.GetString("codice"))
									vLst7.Add(vExecQuerySingleResult2)
									pAllergeni.Add(vExecQuerySingleResult2)
								Next
							End If
						End If
						If cursorWrapper.IsInitialized Then
							cursorWrapper.Close
						End If
						pUscita.Checked = vCur3.GetInt("uscita") = 1
						StampaSubito.Checked = vCur3.GetInt("stampasubito") = 1
						PVariazioni.Checked = vCur3.GetInt("variazioni") = 1
						pVariazioniWeb.Checked = vCur3.GetInt("variazioniWeb") = 1
						pFraziona.Checked = vCur3.GetInt("fraziona") = 1
						pObbligoPrz.Checked = vCur3.GetInt("obbligoprz") = 1
						pObbligoQta.Checked = vCur3.GetInt("obbligoqta") = 1
						pObbligoDes.Checked = vCur3.GetInt("obbligodes") = 1
						invioweb.Checked = vCur3.GetInt("invioweb") = 1
						If vCur3.GetInt("nVariazioni") = 0 Then
							pnVariazioni.Text = "Limite Numero variazioni: Nessun Limite"
						Else If vCur3.GetInt("nVariazioni") <= 10 Then
							pnVariazioni.Text = "Limite Numero variazioni: " & vCur3.GetString("nVariazioni")
						Else If vCur3.GetInt("nVariazioni") > 10 Then
							pnVariazioni.Text = "Numero variazioni obbligatorie: " & vCur3.GetInt("nVariazioni") - 10
							PVariazioni.Checked = True
							PVariazioni.Enabled = True
							pFraziona.Checked = False
						End If
						pnVariazioni.Tag = vCur3.GetInt("nVariazioni")
						vBln9 = (vCur3.GetInt("flgmag") = 1)
						vDbl1 = vCur3.GetDouble("giac")
						pElencoCod.Visible = IIf(vCur3.GetInt("flgusointerno") = 0 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
						LelencoCod.Visible = IIf(vCur3.GetInt("flgusointerno") = 0 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
						Dim editTextWrapper As EditText = pPrezzo
						If vCur3.GetString("codint") <> "cou" And vCur3.GetString("codint") <> "con" And vCur3.GetString("codint") <> "pco" And vCur3.GetString("codint") <> "srv" And vCur3.GetString("codint") <> "rgr" And vCur3.GetString("codint") <> "abb" And vCur3.GetString("codint") <> "ric" Then
							If Not(mod1.Sub029(vCur3.GetString("codint"))) Then
								If Not(mod1.Sub028(vCur3.GetString("codint"))) And pCodint.Text <> "pre" Then
									z10 = True
									editTextWrapper.Visible = z10
									LPrz.Visible = pPrezzo.Visible
									If pPrezzo.Visible Then
										If Not(mod1.Sub036(vCur3.GetString("codint"))) Then
											z11 = True
											pPrezzo2.Visible = pPrezzo.Visible
											pPrezzo3.Visible = pPrezzo.Visible
											pPrezzo4.Visible = pPrezzo.Visible
											LPrz2.Visible = pPrezzo2.Visible
											LPrz3.Visible = pPrezzo2.Visible
											LPrz4.Visible = pPrezzo2.Visible
											Prezzo5.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
											lPrza.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
											Sottoscorta.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
											pnVariazioni.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
											pSelPrt.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
											pEsclusiva.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetInt("stampante2") <= 0 Or vCur3.GetString("codint") = "888889", False, True)
											pSco.Visible = z11
											pScov.Visible = z11
											pIndice.Visible = z11
											KCalorie.Visible = z11
											pMemo.Visible = z11
											pPunti.Visible = z11
											pAddImage.Visible = z11
											pAddImagePrinter.Visible = z11
											If z11 And invioweb.Checked Then
												If Main.v_iprpi <> "" Then
													z12 = True
													If (z11 And invioweb.Checked) Or pCodint.Text = "zon1" Then
														If Main.v_iprpi <> "" Then
															z13 = True
															pWebDes1.Visible = z13
															pWebDes2.Visible = z13
															pWebDes3.Visible = z13
															pWebDes4.Visible = z13
															pWebDes5.Visible = z13
															Dim labelWrapper As Label = pWebIng1
															If z12 Then
																If Main.vInt24 = Main.d_plu And pCodint.Text <> "zon1" Then
																	z14 = True
																	labelWrapper.Visible = z14
																	Dim labelWrapper2 As Label = pWebIng2
																	If z12 Then
																		If Main.vInt24 = Main.d_plu And pCodint.Text <> "zon1" Then
																			z15 = True
																			labelWrapper2.Visible = z15
																			Dim labelWrapper3 As Label = pWebIng3
																			If z12 Then
																				If Main.vInt24 = Main.d_plu And pCodint.Text <> "zon1" Then
																					z16 = True
																					labelWrapper3.Visible = z16
																					Dim labelWrapper4 As Label = pWebIng4
																					If z12 Then
																						If Main.vInt24 = Main.d_plu And pCodint.Text <> "zon1" Then
																							z17 = True
																							labelWrapper4.Visible = z17
																							Dim labelWrapper5 As Label = pWebIng5
																							If z12 Then
																								If Main.vInt24 = Main.d_plu And pCodint.Text <> "zon1" Then
																									z18 = True
																									labelWrapper5.Visible = z18
																									lScov.Visible = z11
																									lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
																									lSco.Visible = z11
																									lPeso.Visible = z11
																									pPeso.Visible = z11
																									pQtaCar.Visible = z11
																									lQtaOttimale.Visible = z11
																									pQtaOttimale.Visible = z11
																									pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
																									pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
																									pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
																									pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
																									Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
																									Sottoscorta.Hint = vCur3.GetString("sottoscorta")
																									pSco.Hint = vCur3.GetString("scop")
																									pScov.Hint = vCur3.GetString("scov")
																									pPeso.Hint = vCur3.GetString("peso")
																									pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
																									lblPluTitle.Text = "Modifica Plu " & pCodint.Text
																									If pCodint.Text = "zon1" Then
																										If Main.v_iprpi <> "" Then
																											invioweb.Checked = True
																											vcustomlistviewold1.Sub012(25)
																										End If
																									End If
																								End If
																							End If
																							z18 = False
																							labelWrapper5.Visible = z18
																							lScov.Visible = z11
																							lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
																							lSco.Visible = z11
																							lPeso.Visible = z11
																							pPeso.Visible = z11
																							pQtaCar.Visible = z11
																							lQtaOttimale.Visible = z11
																							pQtaOttimale.Visible = z11
																							pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
																							pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
																							pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
																							pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
																							Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
																							Sottoscorta.Hint = vCur3.GetString("sottoscorta")
																							pSco.Hint = vCur3.GetString("scop")
																							pScov.Hint = vCur3.GetString("scov")
																							pPeso.Hint = vCur3.GetString("peso")
																							pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
																							lblPluTitle.Text = "Modifica Plu " & pCodint.Text
																							If pCodint.Text = "zon1" Then
																							End If
																						End If
																					End If
																					z17 = False
																					labelWrapper4.Visible = z17
																					If z12 Then
																					End If
																					z18 = False
																					pWebIng5.Visible = z18
																					lScov.Visible = z11
																					lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
																					lSco.Visible = z11
																					lPeso.Visible = z11
																					pPeso.Visible = z11
																					pQtaCar.Visible = z11
																					lQtaOttimale.Visible = z11
																					pQtaOttimale.Visible = z11
																					pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
																					pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
																					pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
																					pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
																					Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
																					Sottoscorta.Hint = vCur3.GetString("sottoscorta")
																					pSco.Hint = vCur3.GetString("scop")
																					pScov.Hint = vCur3.GetString("scov")
																					pPeso.Hint = vCur3.GetString("peso")
																					pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
																					lblPluTitle.Text = "Modifica Plu " & pCodint.Text
																					If pCodint.Text = "zon1" Then
																					End If
																				End If
																			End If
																			z16 = False
																			labelWrapper3.Visible = z16
																			If z12 Then
																			End If
																			z17 = False
																			pWebIng4.Visible = z17
																			If z12 Then
																			End If
																			z18 = False
																			pWebIng5.Visible = z18
																			lScov.Visible = z11
																			lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
																			lSco.Visible = z11
																			lPeso.Visible = z11
																			pPeso.Visible = z11
																			pQtaCar.Visible = z11
																			lQtaOttimale.Visible = z11
																			pQtaOttimale.Visible = z11
																			pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
																			pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
																			pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
																			pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
																			Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
																			Sottoscorta.Hint = vCur3.GetString("sottoscorta")
																			pSco.Hint = vCur3.GetString("scop")
																			pScov.Hint = vCur3.GetString("scov")
																			pPeso.Hint = vCur3.GetString("peso")
																			pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
																			lblPluTitle.Text = "Modifica Plu " & pCodint.Text
																			If pCodint.Text = "zon1" Then
																			End If
																		End If
																	End If
																	z15 = False
																	labelWrapper2.Visible = z15
																	If z12 Then
																	End If
																	z16 = False
																	pWebIng3.Visible = z16
																	If z12 Then
																	End If
																	z17 = False
																	pWebIng4.Visible = z17
																	If z12 Then
																	End If
																	z18 = False
																	pWebIng5.Visible = z18
																	lScov.Visible = z11
																	lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
																	lSco.Visible = z11
																	lPeso.Visible = z11
																	pPeso.Visible = z11
																	pQtaCar.Visible = z11
																	lQtaOttimale.Visible = z11
																	pQtaOttimale.Visible = z11
																	pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
																	pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
																	pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
																	pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
																	Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
																	Sottoscorta.Hint = vCur3.GetString("sottoscorta")
																	pSco.Hint = vCur3.GetString("scop")
																	pScov.Hint = vCur3.GetString("scov")
																	pPeso.Hint = vCur3.GetString("peso")
																	pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
																	lblPluTitle.Text = "Modifica Plu " & pCodint.Text
																	If pCodint.Text = "zon1" Then
																	End If
																End If
															End If
															z14 = False
															labelWrapper.Visible = z14
															If z12 Then
															End If
															z15 = False
															pWebIng2.Visible = z15
															If z12 Then
															End If
															z16 = False
															pWebIng3.Visible = z16
															If z12 Then
															End If
															z17 = False
															pWebIng4.Visible = z17
															If z12 Then
															End If
															z18 = False
															pWebIng5.Visible = z18
															lScov.Visible = z11
															lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
															lSco.Visible = z11
															lPeso.Visible = z11
															pPeso.Visible = z11
															pQtaCar.Visible = z11
															lQtaOttimale.Visible = z11
															pQtaOttimale.Visible = z11
															pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
															pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
															pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
															pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
															Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
															Sottoscorta.Hint = vCur3.GetString("sottoscorta")
															pSco.Hint = vCur3.GetString("scop")
															pScov.Hint = vCur3.GetString("scov")
															pPeso.Hint = vCur3.GetString("peso")
															pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
															lblPluTitle.Text = "Modifica Plu " & pCodint.Text
															If pCodint.Text = "zon1" Then
															End If
														End If
													End If
													z13 = False
													pWebDes1.Visible = z13
													pWebDes2.Visible = z13
													pWebDes3.Visible = z13
													pWebDes4.Visible = z13
													pWebDes5.Visible = z13
													If z12 Then
													End If
													z14 = False
													pWebIng1.Visible = z14
													If z12 Then
													End If
													z15 = False
													pWebIng2.Visible = z15
													If z12 Then
													End If
													z16 = False
													pWebIng3.Visible = z16
													If z12 Then
													End If
													z17 = False
													pWebIng4.Visible = z17
													If z12 Then
													End If
													z18 = False
													pWebIng5.Visible = z18
													lScov.Visible = z11
													lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
													lSco.Visible = z11
													lPeso.Visible = z11
													pPeso.Visible = z11
													pQtaCar.Visible = z11
													lQtaOttimale.Visible = z11
													pQtaOttimale.Visible = z11
													pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
													pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
													pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
													pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
													Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
													Sottoscorta.Hint = vCur3.GetString("sottoscorta")
													pSco.Hint = vCur3.GetString("scop")
													pScov.Hint = vCur3.GetString("scov")
													pPeso.Hint = vCur3.GetString("peso")
													pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
													lblPluTitle.Text = "Modifica Plu " & pCodint.Text
													If pCodint.Text = "zon1" Then
													End If
												End If
											End If
											z12 = False
											If z11 Then
												If Main.v_iprpi <> "" Then
												End If
												z13 = False
												pWebDes1.Visible = z13
												pWebDes2.Visible = z13
												pWebDes3.Visible = z13
												pWebDes4.Visible = z13
												pWebDes5.Visible = z13
												If z12 Then
												End If
												z14 = False
												pWebIng1.Visible = z14
												If z12 Then
												End If
												z15 = False
												pWebIng2.Visible = z15
												If z12 Then
												End If
												z16 = False
												pWebIng3.Visible = z16
												If z12 Then
												End If
												z17 = False
												pWebIng4.Visible = z17
												If z12 Then
												End If
												z18 = False
												pWebIng5.Visible = z18
												lScov.Visible = z11
												lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
												lSco.Visible = z11
												lPeso.Visible = z11
												pPeso.Visible = z11
												pQtaCar.Visible = z11
												lQtaOttimale.Visible = z11
												pQtaOttimale.Visible = z11
												pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
												pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
												pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
												pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
												Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
												Sottoscorta.Hint = vCur3.GetString("sottoscorta")
												pSco.Hint = vCur3.GetString("scop")
												pScov.Hint = vCur3.GetString("scov")
												pPeso.Hint = vCur3.GetString("peso")
												pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
												lblPluTitle.Text = "Modifica Plu " & pCodint.Text
												If pCodint.Text = "zon1" Then
												End If
											End If
											If Main.v_iprpi <> "" Then
											End If
											z13 = False
											pWebDes1.Visible = z13
											pWebDes2.Visible = z13
											pWebDes3.Visible = z13
											pWebDes4.Visible = z13
											pWebDes5.Visible = z13
											If z12 Then
											End If
											z14 = False
											pWebIng1.Visible = z14
											If z12 Then
											End If
											z15 = False
											pWebIng2.Visible = z15
											If z12 Then
											End If
											z16 = False
											pWebIng3.Visible = z16
											If z12 Then
											End If
											z17 = False
											pWebIng4.Visible = z17
											If z12 Then
											End If
											z18 = False
											pWebIng5.Visible = z18
											lScov.Visible = z11
											lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
											lSco.Visible = z11
											lPeso.Visible = z11
											pPeso.Visible = z11
											pQtaCar.Visible = z11
											lQtaOttimale.Visible = z11
											pQtaOttimale.Visible = z11
											pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
											pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
											pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
											pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
											Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
											Sottoscorta.Hint = vCur3.GetString("sottoscorta")
											pSco.Hint = vCur3.GetString("scop")
											pScov.Hint = vCur3.GetString("scov")
											pPeso.Hint = vCur3.GetString("peso")
											pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
											lblPluTitle.Text = "Modifica Plu " & pCodint.Text
											If pCodint.Text = "zon1" Then
											End If
										End If
									End If
									z11 = False
									pPrezzo2.Visible = pPrezzo.Visible
									pPrezzo3.Visible = pPrezzo.Visible
									pPrezzo4.Visible = pPrezzo.Visible
									LPrz2.Visible = pPrezzo2.Visible
									LPrz3.Visible = pPrezzo2.Visible
									LPrz4.Visible = pPrezzo2.Visible
									Prezzo5.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
									lPrza.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
									Sottoscorta.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
									pnVariazioni.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
									pSelPrt.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
									pEsclusiva.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetInt("stampante2") <= 0 Or vCur3.GetString("codint") = "888889", False, True)
									pSco.Visible = z11
									pScov.Visible = z11
									pIndice.Visible = z11
									KCalorie.Visible = z11
									pMemo.Visible = z11
									pPunti.Visible = z11
									pAddImage.Visible = z11
									pAddImagePrinter.Visible = z11
									If z11 Then
										If Main.v_iprpi <> "" Then
										End If
									End If
									z12 = False
									If z11 Then
									End If
									If Main.v_iprpi <> "" Then
									End If
									z13 = False
									pWebDes1.Visible = z13
									pWebDes2.Visible = z13
									pWebDes3.Visible = z13
									pWebDes4.Visible = z13
									pWebDes5.Visible = z13
									If z12 Then
									End If
									z14 = False
									pWebIng1.Visible = z14
									If z12 Then
									End If
									z15 = False
									pWebIng2.Visible = z15
									If z12 Then
									End If
									z16 = False
									pWebIng3.Visible = z16
									If z12 Then
									End If
									z17 = False
									pWebIng4.Visible = z17
									If z12 Then
									End If
									z18 = False
									pWebIng5.Visible = z18
									lScov.Visible = z11
									lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
									lSco.Visible = z11
									lPeso.Visible = z11
									pPeso.Visible = z11
									pQtaCar.Visible = z11
									lQtaOttimale.Visible = z11
									pQtaOttimale.Visible = z11
									pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
									pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
									pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
									pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
									Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
									Sottoscorta.Hint = vCur3.GetString("sottoscorta")
									pSco.Hint = vCur3.GetString("scop")
									pScov.Hint = vCur3.GetString("scov")
									pPeso.Hint = vCur3.GetString("peso")
									pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
									lblPluTitle.Text = "Modifica Plu " & pCodint.Text
									If pCodint.Text = "zon1" Then
									End If
								End If
							End If
						End If
						z10 = False
						editTextWrapper.Visible = z10
						LPrz.Visible = pPrezzo.Visible
						If pPrezzo.Visible Then
						End If
						z11 = False
						pPrezzo2.Visible = pPrezzo.Visible
						pPrezzo3.Visible = pPrezzo.Visible
						pPrezzo4.Visible = pPrezzo.Visible
						LPrz2.Visible = pPrezzo2.Visible
						LPrz3.Visible = pPrezzo2.Visible
						LPrz4.Visible = pPrezzo2.Visible
						Prezzo5.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
						lPrza.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
						Sottoscorta.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
						pnVariazioni.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
						pSelPrt.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
						pEsclusiva.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetInt("stampante2") <= 0 Or vCur3.GetString("codint") = "888889", False, True)
						pSco.Visible = z11
						pScov.Visible = z11
						pIndice.Visible = z11
						KCalorie.Visible = z11
						pMemo.Visible = z11
						pPunti.Visible = z11
						pAddImage.Visible = z11
						pAddImagePrinter.Visible = z11
						If z11 Then
						End If
						z12 = False
						If z11 Then
						End If
						If Main.v_iprpi <> "" Then
						End If
						z13 = False
						pWebDes1.Visible = z13
						pWebDes2.Visible = z13
						pWebDes3.Visible = z13
						pWebDes4.Visible = z13
						pWebDes5.Visible = z13
						If z12 Then
						End If
						z14 = False
						pWebIng1.Visible = z14
						If z12 Then
						End If
						z15 = False
						pWebIng2.Visible = z15
						If z12 Then
						End If
						z16 = False
						pWebIng3.Visible = z16
						If z12 Then
						End If
						z17 = False
						pWebIng4.Visible = z17
						If z12 Then
						End If
						z18 = False
						pWebIng5.Visible = z18
						lScov.Visible = z11
						lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
						lSco.Visible = z11
						lPeso.Visible = z11
						pPeso.Visible = z11
						pQtaCar.Visible = z11
						lQtaOttimale.Visible = z11
						pQtaOttimale.Visible = z11
						pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
						pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
						pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
						pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
						Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
						Sottoscorta.Hint = vCur3.GetString("sottoscorta")
						pSco.Hint = vCur3.GetString("scop")
						pScov.Hint = vCur3.GetString("scov")
						pPeso.Hint = vCur3.GetString("peso")
						pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
						lblPluTitle.Text = "Modifica Plu " & pCodint.Text
						If pCodint.Text = "zon1" Then
						End If
					End If
				End If
				z9 = False
				checkBoxWrapper.Visible = z9
				StampaSubito.Visible = pIngredienti.Visible
				If pIngredienti.Visible Then
				End If
				If pAllergeni.Visible Then
				End If
				If cursorWrapper.IsInitialized Then
				End If
				pUscita.Checked = vCur3.GetInt("uscita") = 1
				StampaSubito.Checked = vCur3.GetInt("stampasubito") = 1
				PVariazioni.Checked = vCur3.GetInt("variazioni") = 1
				pVariazioniWeb.Checked = vCur3.GetInt("variazioniWeb") = 1
				pFraziona.Checked = vCur3.GetInt("fraziona") = 1
				pObbligoPrz.Checked = vCur3.GetInt("obbligoprz") = 1
				pObbligoQta.Checked = vCur3.GetInt("obbligoqta") = 1
				pObbligoDes.Checked = vCur3.GetInt("obbligodes") = 1
				invioweb.Checked = vCur3.GetInt("invioweb") = 1
				If vCur3.GetInt("nVariazioni") = 0 Then
				End If
				pnVariazioni.Tag = vCur3.GetInt("nVariazioni")
				vBln9 = (vCur3.GetInt("flgmag") = 1)
				vDbl1 = vCur3.GetDouble("giac")
				pElencoCod.Visible = IIf(vCur3.GetInt("flgusointerno") = 0 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				LelencoCod.Visible = IIf(vCur3.GetInt("flgusointerno") = 0 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				If vCur3.GetString("codint") <> "cou" Then
					If Not(mod1.Sub029(vCur3.GetString("codint"))) Then
					End If
				End If
				z10 = False
				pPrezzo.Visible = z10
				LPrz.Visible = pPrezzo.Visible
				If pPrezzo.Visible Then
				End If
				z11 = False
				pPrezzo2.Visible = pPrezzo.Visible
				pPrezzo3.Visible = pPrezzo.Visible
				pPrezzo4.Visible = pPrezzo.Visible
				LPrz2.Visible = pPrezzo2.Visible
				LPrz3.Visible = pPrezzo2.Visible
				LPrz4.Visible = pPrezzo2.Visible
				Prezzo5.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				lPrza.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				Sottoscorta.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				pnVariazioni.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				pSelPrt.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				pEsclusiva.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetInt("stampante2") <= 0 Or vCur3.GetString("codint") = "888889", False, True)
				pSco.Visible = z11
				pScov.Visible = z11
				pIndice.Visible = z11
				KCalorie.Visible = z11
				pMemo.Visible = z11
				pPunti.Visible = z11
				pAddImage.Visible = z11
				pAddImagePrinter.Visible = z11
				If z11 Then
				End If
				z12 = False
				If z11 Then
				End If
				If Main.v_iprpi <> "" Then
				End If
				z13 = False
				pWebDes1.Visible = z13
				pWebDes2.Visible = z13
				pWebDes3.Visible = z13
				pWebDes4.Visible = z13
				pWebDes5.Visible = z13
				If z12 Then
				End If
				z14 = False
				pWebIng1.Visible = z14
				If z12 Then
				End If
				z15 = False
				pWebIng2.Visible = z15
				If z12 Then
				End If
				z16 = False
				pWebIng3.Visible = z16
				If z12 Then
				End If
				z17 = False
				pWebIng4.Visible = z17
				If z12 Then
				End If
				z18 = False
				pWebIng5.Visible = z18
				lScov.Visible = z11
				lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
				lSco.Visible = z11
				lPeso.Visible = z11
				pPeso.Visible = z11
				pQtaCar.Visible = z11
				lQtaOttimale.Visible = z11
				pQtaOttimale.Visible = z11
				pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
				pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
				pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
				pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
				Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
				Sottoscorta.Hint = vCur3.GetString("sottoscorta")
				pSco.Hint = vCur3.GetString("scop")
				pScov.Hint = vCur3.GetString("scov")
				pPeso.Hint = vCur3.GetString("peso")
				pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
				lblPluTitle.Text = "Modifica Plu " & pCodint.Text
				If pCodint.Text = "zon1" Then
				End If
			End If
		End If
		z8 = False
		buttonWrapper.Visible = z8
		vStr9 = vCur3.GetString("dll")
		vInt14 = vCur3.GetInt("textsize")
		vInt15 = vCur3.GetInt("colore")
		vInt16 = vCur3.GetInt("coloret")
		pRep.SelectedIndex = vCur3.GetInt("reparto")
		pMacro.SelectedIndex = vCur3.GetInt("macroa") + 1
		vInt13 = vCur3.GetInt("reparto")
		pIva.SelectedIndex = vCur3.GetInt("iva")
		pBil.SelectedIndex = vCur3.GetInt("plupeso")
		pUM.SelectedIndex = vCur3.GetInt("misura")
		pGrp.SelectedIndex = vCur3.GetInt("gruppov")
		pDes.Text = vCur3.GetString("descrizione")
		pAddC.Text = ""
		pPrezzo.Text = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
		pPrezzo2.Text = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
		pPrezzo3.Text = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
		pPrezzo4.Text = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
		Prezzo5.Text = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
		Sottoscorta.Text = vCur3.GetString("sottoscorta")
		If vCur3.GetInt("stampante2") <> 0 Then
		End If
		pSelPrt.Tag = vCur3.GetInt("stampante2")
		pSco.Text = vCur3.GetString("scop")
		pScov.Text = vCur3.GetString("scov")
		pPeso.Text = vCur3.GetString("peso")
		pQtaCar.Text = "Qta per Confezione: " & vCur3.GetString("qtacartone")
		pQtaCar.Tag = vCur3.GetString("qtacartone")
		pQtaOttimale.Text = vCur3.GetString("qtaottimale")
		pIndice.Tag = vCur3.GetInt("indice")
		pIndice.Text = "Indice Ordinamento=" & pIndice.Tag
		pMemo.Tag = ""
		KCalorie.Tag = vCur3.GetInt("Kcal")
		If vCur3.GetInt("Kcal") <= 0 Then
		End If
		pPunti.Tag = vCur3.GetInt("punti")
		pPunti.Text = "Punti per questo articolo =" & vCur3.GetInt("punti")
		Sub041()
		Dim cursorWrapper22 As Cursor
		cursorWrapper = Main.vSql1.ExecQuery("Select * from ean where codint = '" & vCur3.GetString("codint") & "'")
		pElencoCod.Clear
		pIngredienti.Clear
		pAllergeni.Clear
		pElencoDistinta.Clear
		vLst3.Clear
		If cursorWrapper.RowCount > 0 Then
		End If
		vBln2 = False
		vcustomlistviewold1.Sub012(0)
		Sub038(True)
		If vCur3.GetInt("flgusointerno") = 0 Then
		End If
		pBil.Visible = z19
		lBil.Visible = z19
		pMacro.Visible = z19
		pUM.Visible = z19
		lMacro.Visible = z19
		lUM.Visible = z19
		pAddC.Visible = z19
		Lcod.Visible = z19
		LIngredienti.Visible = z19
		LIngredienti2.Visible = z19
		pIngredienti.Visible = z19
		LAllergeni.Visible = z19
		pAllergeni.Visible = z19
		pElencoDistinta.Visible = pIngredienti.Visible
		pGrp.Visible = pIngredienti.Visible
		lGrp.Visible = pIngredienti.Visible
		pDistinta.Visible = pIngredienti.Visible
		pVarAuto.Visible = pIngredienti.Visible
		sVarAuto.Visible = pIngredienti.Visible
		Main.vSql1.ExecNonQuery("delete from distintabaseTmp")
		Main.vSql1.ExecNonQuery("delete from varautoTmp")
		If Not(pElencoDistinta.Visible) Then
		End If
		IngrMF.Visible = pIngredienti.Visible
		IngrNF.Visible = pIngredienti.Visible
		pUscita.Visible = pIngredienti.Visible
		PVariazioni.Visible = pIngredienti.Visible
		pVariazioniWeb.Visible = pIngredienti.Visible
		pFraziona.Visible = pIngredienti.Visible
		pObbligoPrz.Visible = pIngredienti.Visible
		pObbligoQta.Visible = pIngredienti.Visible
		pObbligoDes.Visible = pIngredienti.Visible
		pMacro.Visible = pIngredienti.Visible
		If pIngredienti.Visible Then
		End If
		z9 = False
		invioweb.Visible = z9
		StampaSubito.Visible = pIngredienti.Visible
		If pIngredienti.Visible Then
		End If
		If pAllergeni.Visible Then
		End If
		If cursorWrapper.IsInitialized Then
		End If
		pUscita.Checked = vCur3.GetInt("uscita") = 1
		StampaSubito.Checked = vCur3.GetInt("stampasubito") = 1
		PVariazioni.Checked = vCur3.GetInt("variazioni") = 1
		pVariazioniWeb.Checked = vCur3.GetInt("variazioniWeb") = 1
		pFraziona.Checked = vCur3.GetInt("fraziona") = 1
		pObbligoPrz.Checked = vCur3.GetInt("obbligoprz") = 1
		pObbligoQta.Checked = vCur3.GetInt("obbligoqta") = 1
		pObbligoDes.Checked = vCur3.GetInt("obbligodes") = 1
		invioweb.Checked = vCur3.GetInt("invioweb") = 1
		If vCur3.GetInt("nVariazioni") = 0 Then
		End If
		pnVariazioni.Tag = vCur3.GetInt("nVariazioni")
		vBln9 = (vCur3.GetInt("flgmag") = 1)
		vDbl1 = vCur3.GetDouble("giac")
		pElencoCod.Visible = IIf(vCur3.GetInt("flgusointerno") = 0 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
		LelencoCod.Visible = IIf(vCur3.GetInt("flgusointerno") = 0 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
		If vCur3.GetString("codint") <> "cou" Then
		End If
		z10 = False
		pPrezzo.Visible = z10
		LPrz.Visible = pPrezzo.Visible
		If pPrezzo.Visible Then
		End If
		z11 = False
		pPrezzo2.Visible = pPrezzo.Visible
		pPrezzo3.Visible = pPrezzo.Visible
		pPrezzo4.Visible = pPrezzo.Visible
		LPrz2.Visible = pPrezzo2.Visible
		LPrz3.Visible = pPrezzo2.Visible
		LPrz4.Visible = pPrezzo2.Visible
		Prezzo5.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
		lPrza.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
		Sottoscorta.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
		pnVariazioni.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
		pSelPrt.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
		pEsclusiva.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetInt("stampante2") <= 0 Or vCur3.GetString("codint") = "888889", False, True)
		pSco.Visible = z11
		pScov.Visible = z11
		pIndice.Visible = z11
		KCalorie.Visible = z11
		pMemo.Visible = z11
		pPunti.Visible = z11
		pAddImage.Visible = z11
		pAddImagePrinter.Visible = z11
		If z11 Then
		End If
		z12 = False
		If z11 Then
		End If
		If Main.v_iprpi <> "" Then
		End If
		z13 = False
		pWebDes1.Visible = z13
		pWebDes2.Visible = z13
		pWebDes3.Visible = z13
		pWebDes4.Visible = z13
		pWebDes5.Visible = z13
		If z12 Then
		End If
		z14 = False
		pWebIng1.Visible = z14
		If z12 Then
		End If
		z15 = False
		pWebIng2.Visible = z15
		If z12 Then
		End If
		z16 = False
		pWebIng3.Visible = z16
		If z12 Then
		End If
		z17 = False
		pWebIng4.Visible = z17
		If z12 Then
		End If
		z18 = False
		pWebIng5.Visible = z18
		lScov.Visible = z11
		lSottos.Visible = IIf(z11 Or vCur3.GetString("codint") = "888888" Or vCur3.GetString("codint") = "888889", False, True)
		lSco.Visible = z11
		lPeso.Visible = z11
		pPeso.Visible = z11
		pQtaCar.Visible = z11
		lQtaOttimale.Visible = z11
		pQtaOttimale.Visible = z11
		pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
		pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
		pPrezzo3.Hint = NumberFormat2(vCur3.GetString("list3"), 1, 2, 2, False)
		pPrezzo4.Hint = NumberFormat2(vCur3.GetString("list4"), 1, 2, 2, False)
		Prezzo5.Hint = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
		Sottoscorta.Hint = vCur3.GetString("sottoscorta")
		pSco.Hint = vCur3.GetString("scop")
		pScov.Hint = vCur3.GetString("scov")
		pPeso.Hint = vCur3.GetString("peso")
		pQtaOttimale.Hint = vCur3.GetString("qtaottimale")
		lblPluTitle.Text = "Modifica Plu " & pCodint.Text
		If pCodint.Text = "zon1" Then
		End If
	Else
		vLst3.Initialize
		vMap2.Initialize
		vMap3.Initialize
		vLst4.Initialize
		vLst7.Initialize
		vLst5.Initialize
		vLst9.Initialize
		vLst8.Initialize
		pCodint.Text = vCur3.GetString("codint")
		pCodint.Enabled = False
		pRep.SelectedIndex = vCur3.GetInt("reparto")
		pMacro.SelectedIndex = vCur3.GetInt("macroa") + 1
		vInt13 = vCur3.GetInt("reparto")
		pIva.SelectedIndex = vCur3.GetInt("iva")
		pBil.SelectedIndex = vCur3.GetInt("gruppov")
		pObbligoDes.Checked = vCur3.GetInt("obbligodes") = 1
		pObbligoDes.Visible = True
		invioweb.Checked = vCur3.GetInt("invioweb") = 1
		invioweb.Visible = Main.v_iprpi <> ""
		pDes.Text = vCur3.GetString("descrizione")
		pAddC.Text = ""
		pBil.Enabled = True
		pAddC.Enabled = vCur3.GetInt("plupeso") = 0
		pElencoCod.Enabled = vCur3.GetInt("plupeso") = 0
		pPrezzo.Text = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
		pPrezzo2.Text = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
		Prezzo5.Text = NumberFormat2(vCur3.GetString("list5"), 1, 2, 2, False)
		Sottoscorta.Text = vCur3.GetString("sottoscorta")
		pSco.Text = vCur3.GetString("scop")
		pScov.Text = vCur3.GetString("scov")
		pPeso.Text = vCur3.GetString("peso")
		pQtaCar.Text = "Qta per Confezione: " & vCur3.GetString("qtacartone")
		pQtaCar.Tag = vCur3.GetString("qtacartone")
		pQtaOttimale.Text = vCur3.GetString("qtaottimale")
		pMemo.Tag = ""
		KCalorie.Tag = vCur3.GetInt("Kcal")
		pPunti.Tag = vCur3.GetInt("punti")
		pIndice.Tag = vCur3.GetInt("indice")
		pIndice.Text = "Indice Ordinamento=" & pIndice.Tag
		Sub041()
		Dim cursorWrapper13 As Cursor
		Dim cursorWrapper14 As Cursor = Main.vSql1.ExecQuery("Select * from GruppiVariazioniArt where codint = '" & vCur3.GetString("codint") & "'")
		pElencoCod.Clear
		vLst3.Clear
		vLst4.Clear
		If cursorWrapper14.RowCount > 0 Then
			Dim rowCount6 As Int = cursorWrapper14.RowCount - 1
			Dim i12 As Int
			For i12 = 0 To rowCount6
				cursorWrapper14.Position = i12
				vLst3.Add(vLst11.Get(cursorWrapper14.GetString("reparto")))
				vLst4.Add(cursorWrapper14.GetString("reparto"))
			Next
		End If
		vcustomlistviewold1.Sub012(0)
		Sub038(True)
		If cursorWrapper14.IsInitialized Then
			cursorWrapper14.Close
		End If
		pBil.Visible = True
		lBil.Visible = True
		pUM.Visible = False
		lUM.Visible = False
		lMacro.Visible = False
		pMacro.Visible = False
		pAddC.Visible = False
		Lcod.Visible = False
		pMemo.Visible = False
		vBln9 = (vCur3.GetInt("flgmag") = 1)
		vDbl1 = vCur3.GetDouble("giac")
		pElencoCod.Visible = False
		LelencoCod.Visible = False
		Dim editTextWrapper3 As EditText = pPrezzo
		If vCur3.GetString("codint") <> "cou" And vCur3.GetString("codint") <> "con" And vCur3.GetString("codint") <> "pco" And vCur3.GetString("codint") <> "rgr" And vCur3.GetString("codint") <> "abb" And vCur3.GetString("codint") <> "srv" And vCur3.GetString("codint") <> "ric" Then
			If Not(mod1.Sub029(vCur3.GetString("codint"))) Then
				If Not(mod1.Sub028(vCur3.GetString("codint"))) Then
					z = True
					editTextWrapper3.Visible = z
					LPrz.Visible = pPrezzo.Visible
					pPrezzo2.Visible = pPrezzo.Visible
					pPrezzo3.Visible = False
					pPrezzo4.Visible = False
					LPrz2.Visible = pPrezzo2.Visible
					LPrz3.Visible = False
					LPrz4.Visible = False
					Prezzo5.Visible = False
					lPrza.Visible = False
					Sottoscorta.Visible = False
					pEsclusiva.Visible = False
					pEsclusiva.Checked = False
					pSelPrt.Visible = False
					pSelPrt.Tag = 0
					pnVariazioni.Visible = False
					pnVariazioni.Tag = 0
					pSco.Visible = False
					pScov.Visible = False
					lPeso.Visible = False
					pPeso.Visible = False
					pQtaCar.Visible = False
					lQtaOttimale.Visible = False
					pQtaOttimale.Visible = False
					KCalorie.Visible = False
					pPunti.Visible = False
					pIndice.Visible = False
					If invioweb.Checked Then
						If Main.v_iprpi <> "" Then
							z2 = True
							pWebDes1.Visible = z2
							pWebDes2.Visible = z2
							pWebDes3.Visible = z2
							pWebDes4.Visible = z2
							pWebDes5.Visible = z2
							Dim labelWrapper7 As Label = pWebIng1
							If z2 Then
								If Main.vInt24 = Main.d_plu Then
									z3 = True
									labelWrapper7.Visible = z3
									Dim labelWrapper8 As Label = pWebIng2
									If z2 Then
										If Main.vInt24 = Main.d_plu Then
											z4 = True
											labelWrapper8.Visible = z4
											Dim labelWrapper9 As Label = pWebIng3
											If z2 Then
												If Main.vInt24 = Main.d_plu Then
													z5 = True
													labelWrapper9.Visible = z5
													Dim labelWrapper10 As Label = pWebIng4
													If z2 Then
														If Main.vInt24 = Main.d_plu Then
															z6 = True
															labelWrapper10.Visible = z6
															Dim labelWrapper11 As Label = pWebIng5
															If z2 Then
																If Main.vInt24 = Main.d_plu Then
																	z7 = True
																	labelWrapper11.Visible = z7
																	lScov.Visible = False
																	lSottos.Visible = False
																	lSco.Visible = False
																	LIngredienti.Visible = False
																	LIngredienti2.Visible = False
																	pIngredienti.Visible = False
																	LAllergeni.Visible = False
																	pAllergeni.Visible = False
																	pElencoDistinta.Visible = False
																	pGrp.Visible = False
																	lGrp.Visible = False
																	pDistinta.Visible = False
																	pVarAuto.Visible = False
																	sVarAuto.Visible = False
																	IngrMF.Visible = pIngredienti.Visible
																	IngrNF.Visible = pIngredienti.Visible
																	pUscita.Visible = pIngredienti.Visible
																	StampaSubito.Visible = pIngredienti.Visible
																	PVariazioni.Visible = pIngredienti.Visible
																	pVariazioniWeb.Visible = pIngredienti.Visible
																	pFraziona.Visible = pIngredienti.Visible
																	pObbligoPrz.Visible = pIngredienti.Visible
																	pObbligoQta.Visible = pIngredienti.Visible
																	pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
																	pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
																	lblPluTitle.Text = "Modifica VARIAZIONE " & pCodint.Text
																End If
															End If
															z7 = False
															labelWrapper11.Visible = z7
															lScov.Visible = False
															lSottos.Visible = False
															lSco.Visible = False
															LIngredienti.Visible = False
															LIngredienti2.Visible = False
															pIngredienti.Visible = False
															LAllergeni.Visible = False
															pAllergeni.Visible = False
															pElencoDistinta.Visible = False
															pGrp.Visible = False
															lGrp.Visible = False
															pDistinta.Visible = False
															pVarAuto.Visible = False
															sVarAuto.Visible = False
															IngrMF.Visible = pIngredienti.Visible
															IngrNF.Visible = pIngredienti.Visible
															pUscita.Visible = pIngredienti.Visible
															StampaSubito.Visible = pIngredienti.Visible
															PVariazioni.Visible = pIngredienti.Visible
															pVariazioniWeb.Visible = pIngredienti.Visible
															pFraziona.Visible = pIngredienti.Visible
															pObbligoPrz.Visible = pIngredienti.Visible
															pObbligoQta.Visible = pIngredienti.Visible
															pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
															pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
															lblPluTitle.Text = "Modifica VARIAZIONE " & pCodint.Text
														End If
													End If
													z6 = False
													labelWrapper10.Visible = z6
													If z2 Then
													End If
													z7 = False
													pWebIng5.Visible = z7
													lScov.Visible = False
													lSottos.Visible = False
													lSco.Visible = False
													LIngredienti.Visible = False
													LIngredienti2.Visible = False
													pIngredienti.Visible = False
													LAllergeni.Visible = False
													pAllergeni.Visible = False
													pElencoDistinta.Visible = False
													pGrp.Visible = False
													lGrp.Visible = False
													pDistinta.Visible = False
													pVarAuto.Visible = False
													sVarAuto.Visible = False
													IngrMF.Visible = pIngredienti.Visible
													IngrNF.Visible = pIngredienti.Visible
													pUscita.Visible = pIngredienti.Visible
													StampaSubito.Visible = pIngredienti.Visible
													PVariazioni.Visible = pIngredienti.Visible
													pVariazioniWeb.Visible = pIngredienti.Visible
													pFraziona.Visible = pIngredienti.Visible
													pObbligoPrz.Visible = pIngredienti.Visible
													pObbligoQta.Visible = pIngredienti.Visible
													pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
													pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
													lblPluTitle.Text = "Modifica VARIAZIONE " & pCodint.Text
												End If
											End If
											z5 = False
											labelWrapper9.Visible = z5
											If z2 Then
											End If
											z6 = False
											pWebIng4.Visible = z6
											If z2 Then
											End If
											z7 = False
											pWebIng5.Visible = z7
											lScov.Visible = False
											lSottos.Visible = False
											lSco.Visible = False
											LIngredienti.Visible = False
											LIngredienti2.Visible = False
											pIngredienti.Visible = False
											LAllergeni.Visible = False
											pAllergeni.Visible = False
											pElencoDistinta.Visible = False
											pGrp.Visible = False
											lGrp.Visible = False
											pDistinta.Visible = False
											pVarAuto.Visible = False
											sVarAuto.Visible = False
											IngrMF.Visible = pIngredienti.Visible
											IngrNF.Visible = pIngredienti.Visible
											pUscita.Visible = pIngredienti.Visible
											StampaSubito.Visible = pIngredienti.Visible
											PVariazioni.Visible = pIngredienti.Visible
											pVariazioniWeb.Visible = pIngredienti.Visible
											pFraziona.Visible = pIngredienti.Visible
											pObbligoPrz.Visible = pIngredienti.Visible
											pObbligoQta.Visible = pIngredienti.Visible
											pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
											pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
											lblPluTitle.Text = "Modifica VARIAZIONE " & pCodint.Text
										End If
									End If
									z4 = False
									labelWrapper8.Visible = z4
									If z2 Then
									End If
									z5 = False
									pWebIng3.Visible = z5
									If z2 Then
									End If
									z6 = False
									pWebIng4.Visible = z6
									If z2 Then
									End If
									z7 = False
									pWebIng5.Visible = z7
									lScov.Visible = False
									lSottos.Visible = False
									lSco.Visible = False
									LIngredienti.Visible = False
									LIngredienti2.Visible = False
									pIngredienti.Visible = False
									LAllergeni.Visible = False
									pAllergeni.Visible = False
									pElencoDistinta.Visible = False
									pGrp.Visible = False
									lGrp.Visible = False
									pDistinta.Visible = False
									pVarAuto.Visible = False
									sVarAuto.Visible = False
									IngrMF.Visible = pIngredienti.Visible
									IngrNF.Visible = pIngredienti.Visible
									pUscita.Visible = pIngredienti.Visible
									StampaSubito.Visible = pIngredienti.Visible
									PVariazioni.Visible = pIngredienti.Visible
									pVariazioniWeb.Visible = pIngredienti.Visible
									pFraziona.Visible = pIngredienti.Visible
									pObbligoPrz.Visible = pIngredienti.Visible
									pObbligoQta.Visible = pIngredienti.Visible
									pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
									pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
									lblPluTitle.Text = "Modifica VARIAZIONE " & pCodint.Text
								End If
							End If
							z3 = False
							labelWrapper7.Visible = z3
							If z2 Then
							End If
							z4 = False
							pWebIng2.Visible = z4
							If z2 Then
							End If
							z5 = False
							pWebIng3.Visible = z5
							If z2 Then
							End If
							z6 = False
							pWebIng4.Visible = z6
							If z2 Then
							End If
							z7 = False
							pWebIng5.Visible = z7
							lScov.Visible = False
							lSottos.Visible = False
							lSco.Visible = False
							LIngredienti.Visible = False
							LIngredienti2.Visible = False
							pIngredienti.Visible = False
							LAllergeni.Visible = False
							pAllergeni.Visible = False
							pElencoDistinta.Visible = False
							pGrp.Visible = False
							lGrp.Visible = False
							pDistinta.Visible = False
							pVarAuto.Visible = False
							sVarAuto.Visible = False
							IngrMF.Visible = pIngredienti.Visible
							IngrNF.Visible = pIngredienti.Visible
							pUscita.Visible = pIngredienti.Visible
							StampaSubito.Visible = pIngredienti.Visible
							PVariazioni.Visible = pIngredienti.Visible
							pVariazioniWeb.Visible = pIngredienti.Visible
							pFraziona.Visible = pIngredienti.Visible
							pObbligoPrz.Visible = pIngredienti.Visible
							pObbligoQta.Visible = pIngredienti.Visible
							pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
							pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
							lblPluTitle.Text = "Modifica VARIAZIONE " & pCodint.Text
						End If
					End If
					z2 = False
					pWebDes1.Visible = z2
					pWebDes2.Visible = z2
					pWebDes3.Visible = z2
					pWebDes4.Visible = z2
					pWebDes5.Visible = z2
					If z2 Then
					End If
					z3 = False
					pWebIng1.Visible = z3
					If z2 Then
					End If
					z4 = False
					pWebIng2.Visible = z4
					If z2 Then
					End If
					z5 = False
					pWebIng3.Visible = z5
					If z2 Then
					End If
					z6 = False
					pWebIng4.Visible = z6
					If z2 Then
					End If
					z7 = False
					pWebIng5.Visible = z7
					lScov.Visible = False
					lSottos.Visible = False
					lSco.Visible = False
					LIngredienti.Visible = False
					LIngredienti2.Visible = False
					pIngredienti.Visible = False
					LAllergeni.Visible = False
					pAllergeni.Visible = False
					pElencoDistinta.Visible = False
					pGrp.Visible = False
					lGrp.Visible = False
					pDistinta.Visible = False
					pVarAuto.Visible = False
					sVarAuto.Visible = False
					IngrMF.Visible = pIngredienti.Visible
					IngrNF.Visible = pIngredienti.Visible
					pUscita.Visible = pIngredienti.Visible
					StampaSubito.Visible = pIngredienti.Visible
					PVariazioni.Visible = pIngredienti.Visible
					pVariazioniWeb.Visible = pIngredienti.Visible
					pFraziona.Visible = pIngredienti.Visible
					pObbligoPrz.Visible = pIngredienti.Visible
					pObbligoQta.Visible = pIngredienti.Visible
					pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
					pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
					lblPluTitle.Text = "Modifica VARIAZIONE " & pCodint.Text
				End If
			End If
		End If
		z = False
		editTextWrapper3.Visible = z
		LPrz.Visible = pPrezzo.Visible
		pPrezzo2.Visible = pPrezzo.Visible
		pPrezzo3.Visible = False
		pPrezzo4.Visible = False
		LPrz2.Visible = pPrezzo2.Visible
		LPrz3.Visible = False
		LPrz4.Visible = False
		Prezzo5.Visible = False
		lPrza.Visible = False
		Sottoscorta.Visible = False
		pEsclusiva.Visible = False
		pEsclusiva.Checked = False
		pSelPrt.Visible = False
		pSelPrt.Tag = 0
		pnVariazioni.Visible = False
		pnVariazioni.Tag = 0
		pSco.Visible = False
		pScov.Visible = False
		lPeso.Visible = False
		pPeso.Visible = False
		pQtaCar.Visible = False
		lQtaOttimale.Visible = False
		pQtaOttimale.Visible = False
		KCalorie.Visible = False
		pPunti.Visible = False
		pIndice.Visible = False
		If invioweb.Checked Then
		End If
		z2 = False
		pWebDes1.Visible = z2
		pWebDes2.Visible = z2
		pWebDes3.Visible = z2
		pWebDes4.Visible = z2
		pWebDes5.Visible = z2
		If z2 Then
		End If
		z3 = False
		pWebIng1.Visible = z3
		If z2 Then
		End If
		z4 = False
		pWebIng2.Visible = z4
		If z2 Then
		End If
		z5 = False
		pWebIng3.Visible = z5
		If z2 Then
		End If
		z6 = False
		pWebIng4.Visible = z6
		If z2 Then
		End If
		z7 = False
		pWebIng5.Visible = z7
		lScov.Visible = False
		lSottos.Visible = False
		lSco.Visible = False
		LIngredienti.Visible = False
		LIngredienti2.Visible = False
		pIngredienti.Visible = False
		LAllergeni.Visible = False
		pAllergeni.Visible = False
		pElencoDistinta.Visible = False
		pGrp.Visible = False
		lGrp.Visible = False
		pDistinta.Visible = False
		pVarAuto.Visible = False
		sVarAuto.Visible = False
		IngrMF.Visible = pIngredienti.Visible
		IngrNF.Visible = pIngredienti.Visible
		pUscita.Visible = pIngredienti.Visible
		StampaSubito.Visible = pIngredienti.Visible
		PVariazioni.Visible = pIngredienti.Visible
		pVariazioniWeb.Visible = pIngredienti.Visible
		pFraziona.Visible = pIngredienti.Visible
		pObbligoPrz.Visible = pIngredienti.Visible
		pObbligoQta.Visible = pIngredienti.Visible
		pPrezzo.Hint = NumberFormat2(vCur3.GetString("list1"), 1, 2, 2, False)
		pPrezzo2.Hint = NumberFormat2(vCur3.GetString("list2"), 1, 2, 2, False)
		lblPluTitle.Text = "Modifica VARIAZIONE " & pCodint.Text
	End If
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub pAddC_EnterPressed
	vIME1.HideKeyboard
	pAddC.Text = pAddC.Text.Replace(",", "").Replace("'", "").Trim
	If pAddC.Text.Trim <> "" Then
		vBln10 = True
		Sub005()
		Return
	End If
End Sub

Sub pAddC_FocusChanged(z As Boolean)
	If z Then
		vIME1.Initialize("IME")
		vIME1.ShowKeyboard(pAddC)
		Return
	End If
	pAddC.Text = pAddC.Text.Replace(",", "").Replace("'", "").Trim
	If pAddC.Text.Trim <> "" Then
		Sub005()
		Return
	End If
End Sub

Sub pAddImage_Click
	Sub024(False)
End Sub

Sub pAddImage_LongClick
	Sub010()
	Sub024(False)
End Sub

Sub pAddImagePrinter_Click
	Sub024(True)
End Sub

Sub pAddImagePrinter_LongClick
	Sub010()
	Sub024(True)
End Sub

Sub pAllergeni_ItemClick(i As Int, obj As Object)
	Dim vObjectToCharSequence As Object = "Si desidera eliminare l'ingrediente " & obj
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		vLst7.RemoveAt(i)
		pAllergeni.RemoveAt(i)
		vLst9.RemoveAt(i)
		Return
	End If
End Sub

Sub pAnnulla_Click
	If ScrollView1.Visible Then
		ScrollView1.Visible = False
		pConferma.Visible = True
		ImageView1.Visible = False
		btnShowImage.Visible = False
		If File.Exists(mod1.vStr4 & "/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(mod1.vStr4 & "/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10001/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10001/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10002/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10002/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10003/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10003/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10004/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10004/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10005/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10005/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10006/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10006/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10007/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10007/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10008/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10008/ImgPalm", pCodint.Text & ".jpg")
		End If
		If File.Exists(Main.vStr7 & "/10009/ImgPalm", pCodint.Text & ".jpg") Then
			File.Delete(Main.vStr7 & "/10009/ImgPalm", pCodint.Text & ".jpg")
		End If
		Return
	End If
	If Not(Main.v_riducimsg) Then
		Dim vObjectToCharSequence As Object = "Attenzione ... eventuali modifiche verranno annullate ..." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			Return
		End If
	End If
	Sub038(False)
	vBln11 = False
	vInt9 = 0
	vDbl1 = 0
	vBln9 = False
	bGestBila.Visible = False
	vMap1.Initialize
	Sub021()
	mod1.Sub081
End Sub

Sub pBil_ItemClick(i As Int, obj As Object)
	mod1.vStr2 = "Sub pBil_ItemClick (Position As Int, Value As Object)"
	Try
		If Main.vInt24 = Main.d_plu And i > 0 Then
			If vLst3.Size > 0 Then
				Dim size As Int = vLst3.Size - 1
				Dim i3 As Int
				For i3 = 0 To size
					Dim vObjectToString As String = vLst3.Get(i3)
					If vObjectToString.StartsWith("2") And vObjectToString.Length = 7 Then
						Return
					End If
				Next
			End If
			Sub001(i, True)
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub pButtonsPlu_Click
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _pconferma_click (riga 8011).
Sub pConferma_Click
	Dim z As Boolean
	Dim i As Int
	Dim i2 As Int
	Dim sql As SQL
	Dim append As String
	Dim z2 As Boolean
	Dim i3 As Int
	Dim i4 As Int
	Dim i5 As Int
	Dim i6 As Int
	Dim i7 As Int
	Dim size As Int
	Dim i8 As Int
	Dim size2 As Int
	Dim i9 As Int
	Dim rowCount As Int
	Dim i10 As Int
	Dim rowCount2 As Int
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim i11 As Int
	Dim i12 As Int = 0
	mod1.vStr2 = "Sub pConferma_Click"
	Try
		If Main.vInt24 = Main.d_plu And Sub042(pPrezzo.Text, False) = "0" And pCodint.Text <> "cou" And pCodint.Text <> "con" And pCodint.Text <> "pco" And pCodint.Text <> "abb" And pCodint.Text <> "rgr" And pCodint.Text <> "srv" And pCodint.Text <> "pre" And pCodint.Text <> "ric" And pCodint.Text <> "888888" And pCodint.Text <> "888889" Then
			If Not(mod1.Sub029(pCodint.Text)) Then
				If Not(mod1.Sub028(pCodint.Text)) Then
					If Not(mod1.Sub036(pCodint.Text)) And pBil.SelectedIndex <> 3 Then
						If Main.v_riducimsg Or pObbligoPrz.Checked Then
							i11 = -1
						Else
							Dim vObjectToCharSequence As Object = "Si desidera impostare il prezzo dell'articolo a 0,00 ?"
							Dim vObjectToCharSequence2 As Object = Main.vStr8
							i11 = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
						End If
						If i11 = -2 Then
							pPrezzo.Text = "0"
							Return
						End If
					End If
				End If
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vBln2 Then
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from ean where codint = '" & pCodint.Text & "' and importo >0 and qta > 1") > 0 Then
			Dim vObjectToCharSequence3 As Object = "Sono stati rilevati codici con prezzi impostati su questo articolo ." & CRLF & "Selezionare una delle opzioni:"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Allinea i prezzi automaticamente", "Lascia i prezzi invariati", "Annulla(modifico i prezzi a mano)", Main.vBmp1)
			If vMsgbox2 = -2 Then
				Return
			End If
			z = (vMsgbox2 = -1)
			i = Main.vInt24
			If i = Main.d_plu And pBil.SelectedIndex = 3 Then
				If Main.v_attivaterminale Then
					If Main.vBln20 Then
						If Main.v_centralizza Then
							z4 = True
							If Not(z4) Then
								Dim vObjectToCharSequence5 As Object = "Per attivare la gestione del sacchettone è necessario acquistare il modulo uniandro quindi inserire l'indirizzo Ip del server delle bilance"
								Dim vObjectToCharSequence6 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
								If pDes.Text = "" Then
									ToastMessageShow("Inserire una descrizione per l'articolo", True)
								Else
									Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select count(*) from dettmnu where mnuattivo=1 and codint = '" & pCodint.Text & "'")
									If parseDouble > 0 Then
										If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where codint = '" & pCodint.Text & "'") > 0 Then
											Dim parseDouble2 As Int = Main.vSql1.ExecQuerySingleResult("select reparto from anagra where codint = '" & pCodint.Text & "'")
											If parseDouble2 <> pRep.SelectedIndex Then
												Dim vObjectToCharSequence7 As Object = "Non è possibile modificare il reparto di un articolo inserito all'interno di un menù." & CRLF & "Si desidera impostare il valore percedente ?"
												Dim vObjectToCharSequence8 As Object = Main.vStr8
												Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "Si", "", "No", Main.vBmp1)
												If vMsgbox22 = -1 Then
													pRep.SelectedIndex = parseDouble2
												Else
													Return
												End If
											End If
											If vBln5 Then
												Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("select descrizione from anagra where codint = '" & pCodint.Text & "'")
												Dim str As String = " descrizione = '" & vExecQuerySingleResult & "' and "
												If parseDouble <> Main.vSql1.ExecQuerySingleResult("select count(*) from dettmnu where mnuattivo=1 and descrizione='" & vExecQuerySingleResult & "' and  codint = '" & pCodint.Text & "'") Then
													Dim vObjectToCharSequence9 As Object = "Attenzione..." & CRLF & "Esistono menù che contengono questo articolo ma con descrizione diversa." & CRLF & "Si desidera uniformarle ?"
													Dim vObjectToCharSequence10 As Object = Main.vStr8
													Dim vMsgbox23 As Int = Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "Si", "", "No", Main.vBmp1)
													z3 = (vMsgbox23 = -1)
													str = ""
												Else
													z3 = True
												End If
												If z3 Then
													Main.vSql1.ExecNonQuery("update dettmnu set descrizione='" & mod1.Sub209(pDes.Text).Trim & "' where " & str & "  codint ='" & pCodint.Text & "'")
												End If
											End If
										End If
									End If
									ImageView1.Visible = False
									btnShowImage.Visible = False
									Main.vSql1.ExecNonQuery("delete from anagra where codint = '" & pCodint.Text & "'")
									If Main.vInt24 = Main.d_plu Then
										Main.vSql1.ExecNonQuery("delete from ean where codint = '" & pCodint.Text & "'")
										Main.vSql1.ExecNonQuery("delete from allergeniplu where codint = '" & pCodint.Text & "'")
										Main.vSql1.ExecNonQuery("delete from ingredientiplu where codint = '" & pCodint.Text & "'")
										Main.vSql1.ExecNonQuery("delete from distintabase where codint = '" & pCodint.Text & "'")
										Main.vSql1.ExecNonQuery("delete from varauto where codint = '" & pCodint.Text & "'")
									Else
										Main.vSql1.ExecNonQuery("delete from GruppiVariazioniArt where codint = '" & pCodint.Text & "'")
									End If
									vIME1.HideKeyboard
									If pAddC.Text.Trim <> "" Then
										Sub006()
									End If
									Dim list As List
									list.Initialize
									Dim map As Map
									map.Initialize
									map.Put("codint", pCodint.Text)
									map.Put("descrizione", mod1.Sub209(pDes.Text))
									map.Put("reparto", pRep.SelectedIndex)
									map.Put("macroa", pMacro.SelectedIndex - 1)
									map.Put("iva", pIva.SelectedIndex)
									If Main.vInt24 = Main.d_plu Then
										map.Put("plupeso", pBil.SelectedIndex)
										map.Put("gruppov", pGrp.SelectedIndex)
										map.Put("misura", pUM.SelectedIndex)
									End If
									map.Put("list1", Sub042(pPrezzo.Text, False))
									map.Put("list2", Sub042(pPrezzo2.Text, False))
									If Main.vInt24 = Main.d_plu Then
										map.Put("list3", Sub042(pPrezzo3.Text, False))
										map.Put("list4", Sub042(pPrezzo4.Text, False))
									End If
									map.Put("list5", Sub042(Prezzo5.Text, False))
									map.Put("sottoscorta", IIf(IsNumber(Sottoscorta.Text.Replace(",", ".")), Sottoscorta.Text, "0"))
									map.Put("stampante2", IIf(IsNumber(pSelPrt.Tag), pSelPrt.Tag, "0"))
									map.Put("stampaesclusiva", pEsclusiva.Checked And pSelPrt.Tag > 0)
									map.Put("nVariazioni", IIf(IsNumber(pnVariazioni.Tag), pnVariazioni.Tag, "0"))
									map.Put("scop", IIf(IsNumber(pSco.Text.Replace(",", ".")), pSco.Text, "0"))
									map.Put("scov", Sub042(pScov.Text, False))
									map.Put("peso", IIf(IsNumber(pPeso.Text.Replace(",", ".")), pPeso.Text, "0"))
									Dim vObjectToString As String = pQtaCar.Tag
									If Not(IsNumber(vObjectToString.Replace(",", "."))) Then
										vObjectToString = "0"
									End If
									map.Put("qtacartone", vObjectToString)
									map.Put("qtaottimale", IIf(IsNumber(pQtaOttimale.Text.Replace(",", ".")), pQtaOttimale.Text, "0"))
									map.Put("indice", pIndice.Tag)
									map.Put("Kcal", KCalorie.Tag)
									map.Put("punti", pPunti.Tag)
									If pMemo.Tag <> "" Then
										If pMemo.Tag = "_D_" Then
											Main.vSql1.ExecNonQuery("delete from TestiArt where codice='" & pCodint.Text & "'")
										Else
											Main.vSql1.ExecNonQuery("delete from TestiArt where codice='" & pCodint.Text & "'")
											Main.vSql1.ExecNonQuery("insert into TestiArt(codice,testo) values('" & pCodint.Text & "','" & pMemo.Tag & "')")
										End If
									End If
									If pCodint.Text <> "cou" And pCodint.Text <> "con" And pCodint.Text <> "pco" And pCodint.Text <> "abb" And pCodint.Text <> "rgr" And pCodint.Text <> "srv" And pCodint.Text <> "pre" And pCodint.Text <> "ric" Then
										If Not(mod1.Sub029(pCodint.Text)) Then
											If Not(mod1.Sub028(pCodint.Text)) Then
												If Not(mod1.Sub036(pCodint.Text)) Then
													z2 = False
													map.Put("flgusointerno", z2)
													map.Put("flgmag", vBln9)
													map.Put("giac", vDbl1)
													i3 = Main.vInt24
													If i3 = Main.d_plu Then
														map.Put("distinta", vCur4.RowCount > 0)
													End If
													i4 = Main.vInt24
													If i4 = Main.d_plu Then
														map.Put("variazioniauto", vCur5.RowCount > 0)
													End If
													i5 = Main.vInt24
													If i5 <> Main.d_plu Then
														map.Put("gruppov", pBil.SelectedIndex)
													End If
													map.Put("ingredientisumf", IngrMF.Checked)
													map.Put("ingredientisunf", Not(IngrNF.Checked) And pIngredienti.Size > 0)
													map.Put("uscita", pUscita.Checked)
													map.Put("stampasubito", StampaSubito.Checked)
													map.Put("variazioni", Not(PVariazioni.Checked) And vCur5.RowCount = 0)
													map.Put("variazioniWeb", Not(pVariazioniWeb.Checked) And vCur5.RowCount = 0)
													map.Put("fraziona", Not(pFraziona.Checked) And vCur5.RowCount = 0)
													map.Put("obbligoprz", Not(pObbligoPrz.Checked) And vCur5.RowCount = 0)
													map.Put("obbligoqta", Not(pObbligoQta.Checked) And vCur5.RowCount = 0)
													map.Put("obbligodes", pObbligoDes.Checked)
													map.Put("invioweb", invioweb.Checked)
													map.Put("dll", vStr9)
													map.Put("textsize", vInt14)
													map.Put("colore", vInt15)
													map.Put("coloret", vInt16)
													i6 = Main.vInt24
													If i6 <> Main.d_plu Then
														map.Put("bvar", True)
													End If
													Dim selectedItem As String = pBil.SelectedItem
													Dim selectedItem2 As String = IIf(Main.vInt24 <> Main.d_plu, pGrp.SelectedItem, selectedItem)
													vDbl1 = 0
													vBln9 = False
													If vBln2 Then
														If Main.vSql1.ExecQuerySingleResult("select count(*) from headoff inner join dettoff on headoff.codofferta=dettoff.codofferta where (headoff.attiva=1 or dettoff.attiva=1) and prezzo >0 and codint ='" & pCodint.Text & "'") > 0 Then
															Main.vSql1.ExecNonQuery("update dettoff set prezzo2 = " & Sub042(pPrezzo.Text, False) & " where prezzo >0 and codint  ='" & pCodint.Text & "'")
															map.Put("list1", Sub042(Main.vSql1.ExecQuerySingleResult("Select prezzo from dettoff where prezzo2>0 and prezzo >0 and codint  ='" & pCodint.Text & "' limit 1"), False))
															Dim vObjectToCharSequence11 As Object = "Attenzione ... Articolo in Offerta." & CRLF & "Il prezzo modificato si attiverà allo scadere dell'offerta attiva. "
															Dim vObjectToCharSequence12 As Object = Main.vStr8
															Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
														End If
													End If
													vBln2 = False
													list.Add(map)
													dbutil.Sub007(Main.vSql1, "anagra", list)
													If vInt9 <> 1 Then
														Main.vSql1.ExecNonQuery("update sortedAnagra set Descrizione='" & SmartStringFormatter("", mod1.Sub209(pDes.Text)) & "',Reparto='" & SmartStringFormatter("", pRep.SelectedItem) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "invioweb=" & SmartStringFormatter("", IIf(map.Get("invioweb"), "1", "0")) & ",Listino1=" & SmartStringFormatter("", map.Get("list1")) & ",Iva='" & SmartStringFormatter("", pIva.SelectedItem) & "',gruppov='" & SmartStringFormatter("", selectedItem2) & "',gruppovCodice='" & SmartStringFormatter("", map.GetDefault("gruppov", "1")) & "',flgmag=" & SmartStringFormatter("", IIf(map.Get("flgmag"), "1", "0")) & ",giac=" & SmartStringFormatter("", map.Get("giac")) & ",flgusointerno=" & SmartStringFormatter("", IIf(map.Get("flgusointerno"), "1", "0")) & " where Codice ='" & SmartStringFormatter("", pCodint.Text) & "'")
													Else If vInt9 = 2 Then
														Main.vSql1.ExecNonQuery("Delete from sortedAnagra")
														Main.vSql1.ExecNonQuery("insert into sortedAnagra(Codice,Descrizione,Reparto," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Listino1,Iva,gruppov,gruppovCodice,flgusointerno,flgmag,giac,invioweb)" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " values('" & SmartStringFormatter("", pCodint.Text) & "','" & SmartStringFormatter("", mod1.Sub209(pDes.Text)) & "','" & SmartStringFormatter("", pRep.SelectedItem) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", map.Get("list1")) & ",'" & SmartStringFormatter("", pIva.SelectedItem) & "','" & SmartStringFormatter("", selectedItem2) & "','" & SmartStringFormatter("", map.GetDefault("gruppov", "1")) & "'," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", IIf(map.Get("flgusointerno"), "1", "0")) & "," & SmartStringFormatter("", IIf(map.Get("flgmag"), "1", "0")) & "," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " " & SmartStringFormatter("", map.Get("giac")) & "," & SmartStringFormatter("", IIf(map.Get("invioweb"), "1", "0")) & ")")
													End If
													Sub038(False)
													If vInt4 <> m_nuovo Then
														Dim parseDouble3 As Int = pCodint.Text + 1
														Main.vSql1.ExecNonQuery("update progressivi set valore =" & parseDouble3 & " where codice ='A'")
													Else If vBln5 And IsNumber(pCodint.Text) Then
														Main.vSql1.ExecNonQuery("update pagine set testo='" & mod1.Sub209(pDes.Text).Trim & "' where tipo =2 and valore =" & pCodint.Text)
														Main.vBln31 = True
													End If
													If invioweb.Checked And vBln4 Then
														Main.vSql1.ExecNonQuery("delete from anagraDescrizioni where codint = '" & pCodint.Text & "'")
														list.Initialize
														map.Initialize
														map.Put("codint", pCodint.Text)
														map.Put("descrizione1", pWebDes1.Tag)
														map.Put("descrizione2", pWebDes2.Tag)
														map.Put("descrizione3", pWebDes3.Tag)
														map.Put("descrizione4", pWebDes4.Tag)
														map.Put("descrizione5", pWebDes5.Tag)
														map.Put("ingredienti1", pWebIng1.Tag)
														map.Put("ingredienti2", pWebIng2.Tag)
														map.Put("ingredienti3", pWebIng3.Tag)
														map.Put("ingredienti4", pWebIng4.Tag)
														map.Put("ingredienti5", pWebIng5.Tag)
														list.Add(map)
														dbutil.Sub007(Main.vSql1, "anagraDescrizioni", list)
													End If
													vBln4 = False
													i7 = Main.vInt24
													If i7 <> Main.d_plu Then
														list.Initialize
														Dim size3 As Int = pElencoCod.Size - 1
														Dim i18 As Int
														For i18 = 0 To size3
															map.Initialize
															map.Put("codint", pCodint.Text)
															Dim vGetItem As String = pElencoCod.GetItem(i18)
															Dim indexOf As Int = vGetItem.IndexOf("(Qta:")
															If indexOf >= 0 Then
																vGetItem = vGetItem.SubString2(0, indexOf).Trim
															End If
															map.Put("codice", vGetItem)
															map.Put("qta", vMap2.Get(vGetItem))
															map.Put("importo", vMap3.Get(vGetItem))
															list.Add(map)
														Next
														If list.Size > 0 Then
															dbutil.Sub007(Main.vSql1, "ean", list)
														End If
														If vMap1.IsInitialized And vMap1.ContainsKey("BilPlu") Then
															If Main.vSql1.ExecQuerySingleResult("Select count(*) from DatiBilance where Codint ='" & pCodint.Text & "'") > 0 Then
																Dim sb As String = "BILA" & modfunstr.Sub003("000000" & vMap1.Get("BilPlu"), 6)
																Main.vSql1.ExecNonQuery("delete from ean where codice ='" & sb & "'")
																Main.vSql1.ExecNonQuery("delete from ean where substr(codice,1,4) ='BILA' and codint ='" & pCodint.Text & "'")
																list.Initialize
																map.Initialize
																map.Put("codint", pCodint.Text)
																map.Put("codice", sb)
																map.Put("qta", 1)
																map.Put("importo", 0)
																list.Add(map)
																If list.Size > 0 Then
																	dbutil.Sub007(Main.vSql1, "ean", list)
																End If
																Dim map2 As Map
																map2.Initialize
																map2.Put("Codint", pCodint.Text)
																vMap1.Put("Aggiornamento", 1)
																dbutil.Sub012(Main.vSql1, "DatiBilance", vMap1, map2)
																vMap1.Initialize
																list.Initialize
																size = pIngredienti.Size - 1
																For i8 = 0 To size
																	map.Initialize
																	map.Put("codint", pCodint.Text)
																	map.Put("codice", vLst8.Get(i8))
																	list.Add(map)
																Next
																If pIngredienti.Size > 0 Then
																	dbutil.Sub007(Main.vSql1, "ingredientiplu", list)
																End If
																list.Initialize
																size2 = pAllergeni.Size - 1
																For i9 = 0 To size2
																	map.Initialize
																	map.Put("codint", pCodint.Text)
																	map.Put("codice", vLst9.Get(i9))
																	list.Add(map)
																Next
																If pAllergeni.Size > 0 Then
																	dbutil.Sub007(Main.vSql1, "allergeniplu", list)
																End If
																list.Initialize
																rowCount = vCur4.RowCount - 1
																For i10 = 0 To rowCount
																	vCur4.Position = i10
																	map.Initialize
																	map.Put("codint", pCodint.Text)
																	map.Put("codintpadre", vCur4.GetString("codintpadre"))
																	If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where flgusointerno=0 and flgmag = 1 and codint ='" & vCur4.GetString("codintpadre") & "'") = 0 Then
																		Main.vSql1.ExecNonQuery("Update anagra set flgmag = 1 where codint ='" & vCur4.GetString("codintpadre") & "'")
																	End If
																	map.Put("qta", vCur4.GetDouble("qta"))
																	list.Add(map)
																Next
																If vCur4.RowCount > 0 Then
																	dbutil.Sub007(Main.vSql1, "distintabase", list)
																End If
																list.Initialize
																rowCount2 = vCur5.RowCount - 1
																Do While i12 <= rowCount2
																	vCur5.Position = i12
																	map.Initialize
																	map.Put("codint", pCodint.Text)
																	map.Put("codintvar", vCur5.GetString("codintvar"))
																	list.Add(map)
																	i12 = i12 + 1
																Loop
																If vCur5.RowCount > 0 Then
																	dbutil.Sub007(Main.vSql1, "varauto", list)
																End If
																If z Then
																	Main.vSql1.ExecNonQuery("update ean set importo = round(" & Sub042(pPrezzo.Text, False) & "* qta+0.000000001,2) where codint = '" & pCodint.Text & "' and importo >0 and qta > 1")
																End If
															End If
														End If
														If bGestBila.Visible Then
															Main.vSql1.ExecNonQuery("update DatiBilance set Aggiornamento=1 where Codint ='" & pCodint.Text & "'")
														End If
														list.Initialize
														size = pIngredienti.Size - 1
														Do While i8 <= size
														Loop
														If pIngredienti.Size > 0 Then
														End If
														list.Initialize
														size2 = pAllergeni.Size - 1
														Do While i9 <= size2
														Loop
														If pAllergeni.Size > 0 Then
														End If
														list.Initialize
														rowCount = vCur4.RowCount - 1
														Do While i10 <= rowCount
														Loop
														If vCur4.RowCount > 0 Then
														End If
														list.Initialize
														rowCount2 = vCur5.RowCount - 1
														Do While i12 <= rowCount2
														Loop
														If vCur5.RowCount > 0 Then
														End If
														If z Then
														End If
													Else
														list.Initialize
														Dim size4 As Int = vLst1.Size - 1
														Do While i12 <= size4
															Dim checkBoxWrapper As CheckBox = vLst1.Get(i12)
															If checkBoxWrapper.Checked Then
																map.Initialize
																map.Put("codint", pCodint.Text)
																map.Put("reparto", checkBoxWrapper.Tag)
																list.Add(map)
															End If
															i12 = i12 + 1
														Loop
														If list.Size > 0 Then
															dbutil.Sub007(Main.vSql1, "GruppiVariazioniArt", list)
														End If
													End If
													If vInt9 <> 1 Then
														vInt3 = vInt11
														Edt1.Text = vStr7
													Else If vInt9 = 2 Then
														Sub012("Descrizione")
														Sub023()
													End If
													ricerca()
													bGestBila.Visible = False
													vBln11 = False
													Sub021()
													vInt9 = 0
												End If
											End If
										End If
									End If
									z2 = True
									map.Put("flgusointerno", z2)
									map.Put("flgmag", vBln9)
									map.Put("giac", vDbl1)
									i3 = Main.vInt24
									If i3 = Main.d_plu Then
									End If
									i4 = Main.vInt24
									If i4 = Main.d_plu Then
									End If
									i5 = Main.vInt24
									If i5 <> Main.d_plu Then
									End If
									map.Put("ingredientisumf", IngrMF.Checked)
									map.Put("ingredientisunf", Not(IngrNF.Checked) And pIngredienti.Size > 0)
									map.Put("uscita", pUscita.Checked)
									map.Put("stampasubito", StampaSubito.Checked)
									map.Put("variazioni", Not(PVariazioni.Checked) And vCur5.RowCount = 0)
									map.Put("variazioniWeb", Not(pVariazioniWeb.Checked) And vCur5.RowCount = 0)
									map.Put("fraziona", Not(pFraziona.Checked) And vCur5.RowCount = 0)
									map.Put("obbligoprz", Not(pObbligoPrz.Checked) And vCur5.RowCount = 0)
									map.Put("obbligoqta", Not(pObbligoQta.Checked) And vCur5.RowCount = 0)
									map.Put("obbligodes", pObbligoDes.Checked)
									map.Put("invioweb", invioweb.Checked)
									map.Put("dll", vStr9)
									map.Put("textsize", vInt14)
									map.Put("colore", vInt15)
									map.Put("coloret", vInt16)
									i6 = Main.vInt24
									If i6 <> Main.d_plu Then
									End If
									Dim selectedItem3 As String = pBil.SelectedItem
									If Main.vInt24 <> Main.d_plu Then
									End If
									vDbl1 = 0
									vBln9 = False
									If vBln2 Then
									End If
									vBln2 = False
									list.Add(map)
									dbutil.Sub007(Main.vSql1, "anagra", list)
									If vInt9 <> 1 Then
									End If
									Sub038(False)
									If vInt4 <> m_nuovo Then
									End If
									If invioweb.Checked Then
										Main.vSql1.ExecNonQuery("delete from anagraDescrizioni where codint = '" & pCodint.Text & "'")
										list.Initialize
										map.Initialize
										map.Put("codint", pCodint.Text)
										map.Put("descrizione1", pWebDes1.Tag)
										map.Put("descrizione2", pWebDes2.Tag)
										map.Put("descrizione3", pWebDes3.Tag)
										map.Put("descrizione4", pWebDes4.Tag)
										map.Put("descrizione5", pWebDes5.Tag)
										map.Put("ingredienti1", pWebIng1.Tag)
										map.Put("ingredienti2", pWebIng2.Tag)
										map.Put("ingredienti3", pWebIng3.Tag)
										map.Put("ingredienti4", pWebIng4.Tag)
										map.Put("ingredienti5", pWebIng5.Tag)
										list.Add(map)
										dbutil.Sub007(Main.vSql1, "anagraDescrizioni", list)
									End If
									vBln4 = False
									i7 = Main.vInt24
									If i7 <> Main.d_plu Then
									End If
									If vInt9 <> 1 Then
									End If
									ricerca()
									bGestBila.Visible = False
									vBln11 = False
									Sub021()
									vInt9 = 0
								End If
								mod1.Sub081
								Return
							End If
						End If
					End If
				End If
				z4 = False
				If Not(z4) Then
				End If
			End If
			i2 = Main.vInt24
			If i2 = Main.d_plu And (pObbligoPrz.Checked Or pObbligoQta.Checked Or pObbligoDes.Checked Or PVariazioni.Checked Or pFraziona.Checked) Then
				sql = Main.vSql1
				append = "SELECT count(*) FROM Macro where funzione ="
				If sql.ExecQuerySingleResult(append & SmartStringFormatter("", Main.f_ricercaarticoli) & " and valore = '" & SmartStringFormatter("", pCodint.Text) & "'") > 0 Then
					Dim vObjectToCharSequence13 As Object = "Non è possibile abilitare obblighi su questo articolo in quanto è presente all'interno di una macro."
					Dim vObjectToCharSequence14 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
					pObbligoPrz.Checked = False
					pObbligoQta.Checked = False
					pObbligoDes.Checked = False
					PVariazioni.Checked = False
					pFraziona.Checked = False
				End If
			End If
			If pDes.Text = "" Then
			End If
			mod1.Sub081
			Return
		End If
	End If
	z = False
	i = Main.vInt24
	If i = Main.d_plu Then
		If Main.v_attivaterminale Then
		End If
		z4 = False
		If Not(z4) Then
		End If
	End If
	i2 = Main.vInt24
	If i2 = Main.d_plu Then
		sql = Main.vSql1
		append = "SELECT count(*) FROM Macro where funzione ="
		If sql.ExecQuerySingleResult(append & SmartStringFormatter("", Main.f_ricercaarticoli) & " and valore = '" & SmartStringFormatter("", pCodint.Text) & "'") > 0 Then
		End If
	End If
	If pDes.Text = "" Then
	End If
	mod1.Sub081
End Sub

Sub pDes_EnterPressed
	vIME1.HideKeyboard
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Trim, 50)
End Sub

Sub pDes_FocusChanged(z As Boolean)
	If z Then
		If vInt17 = 0 Then
			vIME1.Initialize("IME")
			vIME1.ShowKeyboard(pDes)
		End If
		pDes.SelectionStart = pDes.Text.Length
		Return
	End If
	pDes.Text = modfunstr.left(pDes.Text.Replace(",", "").Replace("'", "").Trim, 50)
End Sub

Sub pDes_TextChanged(str As String, str2 As String)
	If str2.Length > 50 Then
		pDes.Text = str
		pDes.SelectionStart = str.Length
	End If
	If vBln3 Then
		Return
	End If
	If Main.vInt24 = Main.d_plu Then
		vBln5 = True
		Return
	End If
End Sub

Sub pDistinta_Click
	ToastMessageShow("Selezionare un articolo da aggiungere alla Distinta Base", True)
	vInt17 = 1
	vInt2 = vInt9
	lblmainTitle.Text = "Selezionare un articolo"
	vInt9 = 0
	Sub038(False)
End Sub

Sub pElencoCod_ItemClick(i As Int, obj As Object)
	Dim i2 As Int
	Dim number As Int
	Dim vObjectToString As String = obj
	If vObjectToString.StartsWith("BILA") Then
		Dim vObjectToCharSequence As Object = "Questo codice non è modificabile "
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
	If Main.vInt24 = Main.d_plu Then
		Dim vObjectToCharSequence3 As Object = "Selezionare la funzione... " & vObjectToString
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Dim vObjectToString2 As String = IIf(pBil.SelectedIndex > 0, "Modifica Codice", "Elimina Codice")
		i2 = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, vObjectToString2, "Modifica Qta", "Annulla", Main.vBmp1)
	Else
		i2 = 0
	End If
	If i2 = -1 Then
		If pBil.SelectedIndex > 0 And Not(Sub001(pBil.SelectedIndex, False)) Then
			Return
		End If
		vLst3.RemoveAt(i)
		pElencoCod.RemoveAt(i)
		If Main.vInt24 <> Main.d_plu Then
			vLst4.RemoveAt(i)
		End If
	Else
		If i2 = -3 Then
			If Main.vInt24 = Main.d_plu Then
				If pBil.SelectedIndex > 0 Then
					Dim vObjectToCharSequence5 As Object = "Non possibile su articoli tipo bilancia"
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
					Return
				End If
				Dim numberDialog As NumberDialog
				numberDialog.Digits = 2
				numberDialog.Number = vMap2.GetDefault(vLst3.Get(i), 1)
				numberDialog.Decimal = 0
				numberDialog.ShowSign = False
				Dim str As String = "Inserire la quantità per il codice " & vLst3.Get(i)
				Dim vShow As Int = numberDialog.Show(str, "Ok", "Annulla", "", Main.vBmp1)
				If vShow <> -1 Or number = numberDialog.Number <= 0 Then
					Return
				End If
				Dim parseDouble As Double = pPrezzo.Text
				numberDialog.Digits = 5
				numberDialog.Number = Round2(parseDouble * number, 2) * 100
				numberDialog.Decimal = 2
				numberDialog.ShowSign = False
				Dim vShow2 As Int = numberDialog.Show("Inserire il prezzo complessivo ", "Ok", "Annulla", "", Main.vBmp1)
				If vShow2 = -1 Then
					vMap2.Put(vLst3.Get(i), number)
					Dim vRound2 As Double = Round2(numberDialog.Number / 100, 2)
					If vRound2 <= 0 Then
						Return
					End If
					vMap3.Put(vLst3.Get(i), vRound2)
					Sub029()
				End If
			End If
		End If
	End If
End Sub

Sub pElencoDistinta_ItemClick(i As Int, obj As Object)
	vCur4.Position = i
	Dim vGetString As String = vCur4.GetString("codintpadre")
	Dim vObjectToCharSequence As Object = "Si desidera eliminare l'articolo " & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & vGetString & "'")
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Main.vSql1.ExecNonQuery("delete from distintabaseTmp where codintpadre = '" & vGetString & "'")
		Dim cursorWrapper As Cursor
		vCur4 = Main.vSql1.ExecQuery("Select * from distintabaseTmp order by chiave")
		Sub028()
		Return
	End If
End Sub

Sub pEsclusiva_CheckedChange(z As Boolean)
End Sub

Sub pFraziona_CheckedChange(z As Boolean)
	pObbligoQta.Enabled = Not(z)
	PVariazioni.Enabled = Not(z)
	pObbligoPrz.Enabled = Not(z)
End Sub

Sub pIndice_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = pIndice.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire l'indice di ordinamento dell'articolo selezionato (Valore minimo = 500 , massimo 999) ", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number < 500 Then
			Dim vObjectToCharSequence As Object = "il valore inserito non è corretto."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return
		End If
		pIndice.Text = "Indice Ordinamento=" & numberDialog.Number
		pIndice.Tag = numberDialog.Number
		Return
	End If
End Sub

Sub pIngredienti_ItemClick(i As Int, obj As Object)
	Dim vObjectToCharSequence As Object = "Si desidera eliminare l'ingrediente " & obj
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		vLst5.RemoveAt(i)
		pIngredienti.RemoveAt(i)
		vLst8.RemoveAt(i)
	End If
	Sub003()
End Sub

Sub pIva_ItemClick(i As Int, obj As Object)
End Sub

Sub pMacro_ItemClick(i As Int, obj As Object)
	If i > 0 Then
		If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM Macro where funzione =" & SmartStringFormatter("", Main.f_ricercaarticoli) & " and valore = '" & SmartStringFormatter("", pCodint.Text) & "'") > 0 Then
			Dim vObjectToCharSequence As Object = "Questo articolo è presente all'interno di una macro."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			pMacro.SelectedIndex = 0
			Return
		End If
		Return
	End If
End Sub

Sub pMemo_Click
	Dim modalmlineVar As modalmline
	modalmlineVar.Initialize("tabelle", 28, Activity)
	Dim vRGB As Int = Colors.RGB(150, 150, 150)
	Dim vRGB2 As Int = Colors.RGB(150, 150, 150)
	modalmlineVar.Sub004(vRGB, vRGB2, -256)
	Dim str As String = ""
	If Main.vSql1.ExecQuerySingleResult("select count(*) from TestiArt where codice='" & pCodint.Text & "'") > 0 Then
		str = Main.vSql1.ExecQuerySingleResult("select testo from TestiArt where codice='" & pCodint.Text & "'")
	End If
	If pMemo.Tag <> "_D_" And pMemo.Tag <> "" Then
		str = pMemo.Tag
	End If
	Dim vTmp As String = modalmlineVar.Sub002("Testo aggiuntivo Articolo", "Aggiungi un testo", "", str)
	If vTmp <> -3 Then
		pMemo.Tag = vTmp
		Return
	End If
	pMemo.Tag = "_D_"
End Sub

Sub pMenu_Click
End Sub

Sub pnlWv_Click
End Sub

Sub pnVariazioni_Click
	Dim list As List
	list.Initialize
	list.Add("Limite Numero variazioni: Nessun Limite")
	Dim i As Int
	For i = 1 To 10
		list.Add("Limite Numero variazioni: " & i)
	Next
	Dim i2 As Int
	For i2 = 11 To 20
		list.Add("Numero variazioni obbligatorie: " & i2 - 10)
	Next
	Dim vInputList1 As Int = idLib.InputList1(list, " Gestione numero limite - numero obbligatorio variazioni")
	If vInputList1 < 0 Then
		Return
	End If
	If vInputList1 = 0 Then
		pnVariazioni.Text = "Limite Numero variazioni: Nessun Limite"
	Else If vInputList1 < 10 Then
		pnVariazioni.Text = "Limite Numero variazioni: " & vInputList1
	Else If vInputList1 >= 10 Then
		pnVariazioni.Text = "Numero variazioni obbligatorie: " & vInputList1 - 10
		PVariazioni.Checked = True
		PVariazioni.Enabled = True
		pFraziona.Checked = False
	End If
	pnVariazioni.Tag = vInputList1
End Sub

Sub pObbligoPrz_CheckedChange(z As Boolean)
	pObbligoQta.Enabled = Not(z)
	PVariazioni.Enabled = Not(z)
	pFraziona.Enabled = Not(z)
End Sub

Sub pObbligoQta_CheckedChange(z As Boolean)
	pObbligoPrz.Enabled = Not(z)
	PVariazioni.Enabled = Not(z)
	pFraziona.Enabled = Not(z)
End Sub

Sub populatespinner(spinnerWrapper As Spinner, str As String)
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		spinnerWrapper.Clear
		Dim cursorWrapper As Cursor
		vCur2 = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM " & str & " order by codice")
		Dim rowCount As Int = vCur2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			vCur2.Position = i
			spinnerWrapper.Add(vCur2.GetString("descrizione"))
		Next
		vCur2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub027
	mod1.vStr2 = "Sub PopulateSpinnerAll"
	Try
		pAllergeni.Clear
		Dim size As Int = vLst7.Size - 1
		Dim i As Int
		For i = 0 To size
			pAllergeni.Add(vLst7.Get(i))
		Next
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub028
	mod1.vStr2 = "Sub PopulateSpinnerDistinta"
	Try
		pElencoDistinta.Clear
		If vCur4.RowCount > 0 Then
			Dim rowCount As Int = vCur4.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				vCur4.Position = i
				Dim vNumberToString As String = vCur4.GetInt("qta")
				If vCur4.GetDouble("qta") Mod 1 <> 0 Then
					vNumberToString = NumberFormat2(vCur4.GetDouble("qta"), 1, 3, 3, False)
				End If
				pElencoDistinta.Add(vNumberToString & "  x  " & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & vCur4.GetString("codintpadre") & "'"))
			Next
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub029
	mod1.vStr2 = "Sub PopulateSpinnerEan"
	Try
		pElencoCod.Clear
		Dim size As Int = vLst3.Size - 1
		Dim i As Int
		For i = 0 To size
			pElencoCod.Add(vLst3.Get(i) & IIf(vMap2.Get(vLst3.Get(i)) > 1, " (Qta:" & vMap2.Get(vLst3.Get(i)) & ")", ""))
		Next
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub030
	mod1.vStr2 = "Sub PopulateSpinnerIngr"
	Try
		pIngredienti.Clear
		Dim size As Int = vLst5.Size - 1
		Dim i As Int
		For i = 0 To size
			pIngredienti.Add(vLst5.Get(i))
		Next
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub031(spinnerWrapper As Spinner)
	mod1.vStr2 = "Sub PopulateSpinnerMacro(TmpSpin As Spinner)"
	Try
		spinnerWrapper.Clear
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("SELECT descrizione FROM MacroHead order by codice")
		spinnerWrapper.Add("Macro disabilitata")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			cursorWrapper2.Position = i
			spinnerWrapper.Add(cursorWrapper2.GetString("descrizione"))
		Next
		spinnerWrapper.SelectedIndex = 0
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub032
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		vLst11.Clear
		'vCur2 = Cursor
		Dim cursorWrapper As Cursor
		vCur2 = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM reparti order by codice")
		Dim rowCount As Int = vCur2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			vCur2.Position = i
			vLst11.Add(vCur2.GetString("descrizione"))
		Next
		vCur2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub033
	mod1.vStr2 = "Sub PopulateSpinnerUM"
	Try
		pUM.Clear
		Dim rowCount As Int = vCur8.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			vCur8.Position = i
			pUM.Add(vCur8.GetString("descrizione"))
		Next
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub034
	mod1.vStr2 = "Sub PopulateSpinnerVarAuto"
	Try
		sVarAuto.Clear
		If vCur5.RowCount > 0 Then
			Dim rowCount As Int = vCur5.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				vCur5.Position = i
				sVarAuto.Add(Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & vCur5.GetString("codintvar") & "'"))
			Next
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub pPlu_Click
End Sub

Sub pPrezzo_EnterPressed
	vIME1.HideKeyboard
	Dim editTextWrapper As EditText = Sender
	Dim i As Int = IIf(editTextWrapper.Tag = "p", 3, 2)
	If editTextWrapper.Tag <> "s" And editTextWrapper.Tag <> "%" Then
		If editTextWrapper.Text = "" Then
			If vStr1 <> "" Then
				If vStr1 <> "0.00" Then
					editTextWrapper.Text = vStr1
				End If
			End If
		End If
		editTextWrapper.Text = NumberFormat2(Sub042(editTextWrapper.Text, i = 3), 1, i, i, False)
	End If
	editTextWrapper.Hint = editTextWrapper.Text
End Sub

Sub pPrezzo_FocusChanged(z As Boolean)
	Dim editTextWrapper As EditText = Sender
	Dim vObjectToString As String = editTextWrapper.Tag
	If z Then
		If Not(vBln2) Then
			vBln2 = (editTextWrapper = pPrezzo)
		End If
		vStr1 = editTextWrapper.Text
		editTextWrapper.Text = ""
		vIME1.Initialize("IME")
		If vObjectToString = "s" Or vObjectToString = "%" Then
			vIME1.SetCustomFilter(editTextWrapper, 2, "0123456789")
		Else
			If Main.vInt24 <> Main.d_plu And vObjectToString = "1" Then
				vIME1.SetCustomFilter(editTextWrapper, 12290, "0123456789.-")
			Else
				vIME1.SetCustomFilter(editTextWrapper, 12290, "0123456789.")
			End If
		End If
		vIME1.ShowKeyboard(editTextWrapper)
		Return
	End If
	Dim i2 As Int = IIf(editTextWrapper.Tag = "p", 3, 2)
	If editTextWrapper.Text = "" Then
		If vStr1 <> "" Then
			If vStr1 <> "0.00" Then
				editTextWrapper.Text = vStr1
				editTextWrapper.Hint = editTextWrapper.Text
				Return
			End If
		End If
	End If
	If editTextWrapper.Tag <> "s" And editTextWrapper.Tag <> "%" Then
		editTextWrapper.Text = NumberFormat2(Sub042(editTextWrapper.Text, i2 = 3), 1, i2, i2, False)
	End If
	editTextWrapper.Hint = editTextWrapper.Text
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/tabelle.java, metodo _pprezzo_textchanged (riga 9334).
Sub pPrezzo_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	Dim i As Int = 8
	If editTextWrapper.Tag = "s" Then
		i = 3
	End If
	If editTextWrapper.Tag = "%" Then
		If modfunstr.Sub006(editTextWrapper.Text) <= 100 Then
		End If
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
	If str2.Length > i Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
	End If
	If editTextWrapper.Tag = "a" And Sub042(editTextWrapper.Text, False) > 0 And Sub042(editTextWrapper.Text, False) > Sub042(pPrezzo.Text, False) Then
		Dim vObjectToCharSequence As Object = "L'importo dello sconto è più alto del prezzo di vendita"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		editTextWrapper.Text = str
	End If
End Sub

Sub pPunti_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = pPunti.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di Punti dell'articolo selezionato ", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		pPunti.Text = "Punti per questo articolo =" & numberDialog.Number
		pPunti.Tag = numberDialog.Number
		Return
	End If
End Sub

Sub pQtaCar_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = pQtaCar.Tag
	vDlg1.Hint = "Qta per Confezione"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	vDlg1.PasswordMode = False
	Dim vShow As Int = vDlg1.Show("Inserire la Quantità per confezione", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And IsNumber(vDlg1.Input) And vDlg1.Input.Length < 5 And vDlg1.Input.Length > 0 Then
		pQtaCar.Text = "Qta per Confezione: " & vDlg1.Input
		pQtaCar.Tag = vDlg1.Input
	End If
	mod1.Sub081
End Sub

Sub pRep_ItemClick(i As Int, obj As Object)
	If Main.vInt24 <> Main.d_plu And i = 0 Then
		pRep.SelectedIndex = vInt13
		Dim vObjectToCharSequence As Object = "Il reparto non è selezionabile."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
End Sub

Sub pSelPrt_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst17, "Selezionare la stampante da attivare")
	If vInputList1 < 0 Then
		Return
	End If
	If vInputList1 = 0 Then
		pSelPrt.Text = "Stampe Centri di Produzione sul reparto: PREDEFINITO"
		pSelPrt.Tag = 0
		pEsclusiva.Visible = False
	Else
		Dim rowCount As Int = vCur12.RowCount - 1
		Dim i As Int = 0
		Dim i2 As Int = 1
		Do While True
			If i > rowCount Then
				Exit
			End If
			vCur12.Position = i
			If vCur12.GetInt("NF") = 0 Then
				If i2 = vInputList1 Then
					pSelPrt.Text = "Stampe Centri di Produzione sul reparto: " & vLst17.Get(vInputList1)
					pSelPrt.Tag = vCur12.GetInt("codice")
					pEsclusiva.Visible = True
					Exit
				End If
				i2 = i2 + 1
			End If
			i = i + 1
		Loop
	End If
End Sub

Sub pUscita_CheckedChange(z As Boolean)
End Sub

Sub pVarAuto_Click
	ToastMessageShow("Selezionare una variazione da aggiungere all'elenco", True)
	vInt17 = 2
	vInt2 = vInt9
	vInt9 = 0
	lblmainTitle.Text = "Seleziona una Variazione"
	Main.vInt24 = Main.d_variazioni
	Sub022(False)
	vInt12 = pRep.SelectedIndex
	If vInt12 >= 0 Then
		vInt4 = m_rreparto
		pLista.Visible = True
		vInt3 = m_rreparto
		Edt1.Text = ""
		Edt1.Visible = False
		vCur1.Position = vInt12
		lblInfoRep.Visible = True
		lblInfoRep.Text = "Reparto = " & vCur1.GetString("descrizione")
		ricerca()
	End If
	Sub038(False)
End Sub

Sub PVariazioni_CheckedChange(z As Boolean)
	pObbligoQta.Enabled = Not(z)
	pObbligoPrz.Enabled = Not(z)
	pFraziona.Enabled = Not(z)
End Sub

Sub pWebDes1_Click
	Dim buttonWrapper As Button = Sender
	vCur11.Position = 0
	Sub014(buttonWrapper)
End Sub

Sub pWebDes2_Click
	Dim buttonWrapper As Button = Sender
	vCur11.Position = 1
	Sub014(buttonWrapper)
End Sub

Sub pWebDes3_Click
	Dim buttonWrapper As Button = Sender
	vCur11.Position = 2
	Sub014(buttonWrapper)
End Sub

Sub pWebDes4_Click
	Dim buttonWrapper As Button = Sender
	vCur11.Position = 3
	Sub014(buttonWrapper)
End Sub

Sub pWebDes5_Click
	Dim buttonWrapper As Button = Sender
	vCur11.Position = 4
	Sub014(buttonWrapper)
End Sub

Sub pWebIng1_Click
	Dim labelWrapper As Label = Sender
	vCur11.Position = 0
	Sub015(labelWrapper)
End Sub

Sub pWebIng2_Click
	Dim labelWrapper As Label = Sender
	vCur11.Position = 1
	Sub015(labelWrapper)
End Sub

Sub pWebIng3_Click
	Dim labelWrapper As Label = Sender
	vCur11.Position = 2
	Sub015(labelWrapper)
End Sub

Sub pWebIng4_Click
	Dim labelWrapper As Label = Sender
	vCur11.Position = 3
	Sub015(labelWrapper)
End Sub

Sub pWebIng5_Click
	Dim labelWrapper As Label = Sender
	vCur11.Position = 4
	Sub015(labelWrapper)
End Sub

Sub Rep_Click
	Dim i As Int
	mod1.vStr2 = "  Sub rep_Click"
	Try
		i = Main.vInt24
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If i <> Main.d_plu Then
		Dim vObjectToNumber As Int = Sender.Tag
		If vObjectToNumber < 0 Then
			Return
		End If
		Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("SELECT Codice from sortedAnagra  WHERE rowid=" & vObjectToNumber + 1)
		Dim cursorWrapper As Cursor
		vCur3 = Main.vSql1.ExecQuery("Select * from anagra where codint = '" & vExecQuerySingleResult & "'")
		vCur3.Position = 0
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("Select reparto from GruppiVariazioniArt where codint = '" & vCur3.GetString("codint") & "'")
		If cursorWrapper3.RowCount > 0 And cursorWrapper3.RowCount > 0 Then
			Dim list As List
			list.Initialize
			Dim rowCount As Int = cursorWrapper3.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount
				cursorWrapper3.Position = i2
				list.Add(vLst11.Get(cursorWrapper3.GetString("reparto")))
			Next
			idLib.InputList1(list, "Elenco reparti per la variazione " & vCur3.GetString("descrizione"))
		End If
		Return
	End If
End Sub

Sub ricerca
	Dim z As Boolean
	Dim z2 As Boolean
	Try
		ProgressDialogShow("Ricerca in corso ...")
		DoEvents
		Dim editTextWrapper As EditText = Edt1
		editTextWrapper.Text = editTextWrapper.Text.Replace(CRLF, "").Replace("'", "")
		If editTextWrapper.Text.Trim = "" Then
			If vInt3 <> m_rtutti Then
				If vInt3 <> m_rreparto Then
					ProgressDialogHide
					Return
				End If
			End If
		End If
		vStr5 = editTextWrapper.Text.Trim
		If editTextWrapper.Text.Length >= 16 And editTextWrapper.Text.StartsWith("01") Then
			If mod1.vcgs1databar1.Sub001(editTextWrapper.Text) > 0 Then
				If mod1.vcgs1databar1.vStr3 <> "" Then
					editTextWrapper.Text = mod1.vcgs1databar1.vStr3
				End If
			End If
		End If
		vStr6 = ""
		vStr11 = ""
		vStr10 = ""
		If editTextWrapper.Text.Length >= 14 And Not(False) And vInt3 = m_rcodice Then
			If Not(editTextWrapper.Text.Length = 18 And editTextWrapper.Text.SubString2(0, 2) = "97") Then
				If Main.v_repartogv >= 0 Then
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from ean inner join anagra on ean.codint = anagra.codint where anagra.reparto = " & Main.v_repartogv & " and ean.codice = '" & editTextWrapper.Text.SubString2(0, 4) & "'") > 0 Then
						editTextWrapper.Text = editTextWrapper.Text.SubString2(0, 4)
					End If
				Else
					ToastMessageShow("Impostare il reparto dei Gratta e Vinci in configurazione", True)
				End If
			End If
		End If
		If vInt3 = m_rcodice And editTextWrapper.Text.Trim <> "" Then
			vStr6 = "SELECT anagra.[codint]" & TAB & "as Codice,anagra.[descrizione] as Descrizione" & TAB & ",(select descrizione from reparti where reparti.codice =anagra.reparto) as Reparto,[list1] as Listino1,[list2] as Listino2,sottoscorta as Sottoscorta,[giac] as Giacenza,[scop] as Sconto FROM [anagra]   inner join ean on ean.codint = anagra.codint where bvar=0 and  ean.codice = '" & editTextWrapper.Text & "'"
			z = True
		Else If vInt3 = m_rcodint And editTextWrapper.Text.Trim <> "" Then
			vStr6 = "SELECT anagra.[codint]" & TAB & "as Codice,anagra.[descrizione] as Descrizione" & TAB & ",(select descrizione from reparti where reparti.codice =anagra.reparto) as Reparto,[list1] as Listino1,[list2] as Listino2,sottoscorta as Sottoscorta,[giac] as Giacenza,[scop] as Sconto FROM [anagra]  " & " where " & vStr2 & "  codint = '" & editTextWrapper.Text & "'"
			z = True
		Else If vInt3 = m_rdescrizione And editTextWrapper.Text.Trim <> "" Then
			vStr6 = "SELECT anagra.[codint]" & TAB & "as Codice,anagra.[descrizione] as Descrizione" & TAB & ",(select descrizione from reparti where reparti.codice =anagra.reparto) as Reparto,[list1] as Listino1,[list2] as Listino2,sottoscorta as Sottoscorta,[giac] as Giacenza,[scop] as Sconto FROM [anagra]  " & " where " & vStr2 & " descrizione like '%" & editTextWrapper.Text & "%'"
			vStr10 = "Descrizione contiene " & editTextWrapper.Text
			z = True
		Else If vInt3 = m_rreparto And vInt12 >= 0 Then
			vStr6 = "SELECT anagra.[codint]" & TAB & "as Codice,anagra.[descrizione] as Descrizione" & TAB & ",(select descrizione from reparti where reparti.codice =anagra.reparto) as Reparto,[list1] as Listino1,[list2] as Listino2,sottoscorta as Sottoscorta,[giac] as Giacenza,[scop] as Sconto FROM [anagra]  " & " where " & vStr2 & " reparto =" & vInt12
			vStr10 = "Reparto = " & vLst11.Get(vInt12)
			z = True
		Else If vInt3 = m_rtutti Then
			If vStr2 <> "" Then
				vStr6 = "SELECT anagra.[codint]" & TAB & "as Codice,anagra.[descrizione] as Descrizione" & TAB & ",(select descrizione from reparti where reparti.codice =anagra.reparto) as Reparto,[list1] as Listino1,[list2] as Listino2,sottoscorta as Sottoscorta,[giac] as Giacenza,[scop] as Sconto FROM [anagra]  " & " where " & vStr2.Replace("  and", "")
			Else
				vStr6 = "SELECT anagra.[codint]" & TAB & "as Codice,anagra.[descrizione] as Descrizione" & TAB & ",(select descrizione from reparti where reparti.codice =anagra.reparto) as Reparto,[list1] as Listino1,[list2] as Listino2,sottoscorta as Sottoscorta,[giac] as Giacenza,[scop] as Sconto FROM [anagra]   where  bvar=0"
			End If
			vStr10 = "Tutti gli articoli"
			z = True
		Else
			Dim vObjectToCharSequence As Object = "Indicare il tipo di ricerca"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			z = False
		End If
		vStr3 = "SELECT anagra.[codint]" & TAB & "as Codice,anagra.[descrizione] as Descrizione" & TAB & ",(select descrizione from reparti where reparti.codice =anagra.reparto) as Reparto,[list1] as Listino1,(select descrizione from iva where iva.codice =anagra.iva) as Iva,flgusointerno,locked,(Select descrizione from gruppovar where gruppovar.codice=anagra.gruppov) as gruppov,anagra.gruppov as gruppovCodice,flgmag,giac,invioweb FROM [anagra]  " & vStr6.Replace("SELECT anagra.[codint]" & TAB & "as Codice,anagra.[descrizione] as Descrizione" & TAB & ",(select descrizione from reparti where reparti.codice =anagra.reparto) as Reparto,[list1] as Listino1,[list2] as Listino2,sottoscorta as Sottoscorta,[giac] as Giacenza,[scop] as Sconto FROM [anagra]  ", "")
		If z Then
			vStr7 = editTextWrapper.Text
			vInt11 = vInt3
			Sub023()
			Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select count(*) from sortedAnagra")
			If vInt1 >= 0 And parseDouble - 1 >= vInt1 Then
				vUltimateListView1.JumpTo(vInt1, False)
				vInt1 = -1
			Else
				vUltimateListView1.JumpTo(0, False)
			End If
			Dim buttonWrapper As Button = bStampa
			If parseDouble > 0 Then
				If vStr6 <> "" Then
					z2 = True
					buttonWrapper.Enabled = z2
				End If
			End If
			z2 = False
			buttonWrapper.Enabled = z2
		End If
		vIME2.HideKeyboard
		If Edt1.Visible Then
			If vInt11 = m_rcodice Then
				Edt1.Text = ""
			End If
			Edt1.RequestFocus
			Edt1.SelectionStart = Edt1.Text.Length
		End If
		ProgressDialogHide
	Catch
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
	End Try
End Sub

Sub Sub035
	vInt12 = idLib.InputList1(vLst11, "Selezionare il Reparto ")
	If vInt12 >= 0 Then
		vInt4 = m_rreparto
		pLista.Visible = True
		vInt3 = m_rreparto
		Edt1.Text = ""
		Edt1.Visible = False
		vCur1.Position = vInt12
		lblInfoRep.Visible = True
		lblInfoRep.Text = "Reparto = " & vCur1.GetString("descrizione")
		v5.Initialize("TimerBarcode", 10)
		v5.Enabled = True
		Return
	End If
End Sub

Sub Sub036(i As Int, labelWrapper As Label) As Int
	Dim i2 As Int
	Dim i3 As Int
	Dim i4 As Int = -16776961
	labelWrapper.TextColor = -1
	If i = 14 Then
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = mod1.Sub155(-3355444, 50)
		labelWrapper.Gravity = Bit.Or(16, 17)
		Return -3355444
	End If
	Dim i5 As Int = i Mod 14
	If i5 <= 0 Or i5 >= 15 Then
		i2 = i5
	Else
		Dim valueOf As Int = i5
		Select valueOf
			Case Main.c_rosso
				i4 = -65536
			Case Main.c_blu
				i4 = Colors.RGB(94, 169, 255)
			Case Main.c_verde
				i4 = -16711936
			Case Main.c_giallo
				i4 = -256
				labelWrapper.TextColor = -16777216
			Case Main.c_arancione
				i4 = Colors.RGB(255, 153, 50)
			Case Main.c_bianco
				labelWrapper.TextColor = -16777216
				i4 = -1
			Case Main.c_grigio
				i4 = -7829368
				labelWrapper.TextColor = -16777216
			Case Main.c_marrone
				i4 = Colors.RGB(167, 25, 36)
			Case Main.c_azzurro
				i4 = -16711681
				labelWrapper.TextColor = -16777216
			Case Main.c_verdesmeraldo
				i4 = Colors.RGB(0, 255, 89)
			Case Main.c_verdechiaro
				i4 = Colors.RGB(178, 255, 102)
				labelWrapper.TextColor = -16777216
			Case Main.c_viola
				i4 = Colors.RGB(178, 0, 255)
			Case Main.c_rosa
				i4 = Colors.RGB(255, 127, 237)
			Case Main.c_nero
				i4 = Colors.RGB(0, 0, 0)
		End Select
		i2 = i4
	End If
	labelWrapper.Background = mod1.Sub155(i2, 50)
	Dim textColor As Int = labelWrapper.TextColor
	If textColor = -1 Then
		Dim concreteViewWrapper As View = labelWrapper
		mod1.Sub176(concreteViewWrapper, 1, 2, 2, -16777216)
	Else
		Dim concreteViewWrapper2 As View = labelWrapper
		If i5 = Main.c_bianco Then
			i3 = -7829368
		Else
			i3 = -1
		End If
		mod1.Sub176(concreteViewWrapper2, 1, 2, 2, i3)
	End If
	labelWrapper.Gravity = Bit.Or(16, 17)
	Return i2
End Sub

Sub Sub037
	mod1.vStr2 = "Sub SetDefaultRep"
	Try
		If Main.vInt24 <> Main.d_plu Then
			vStr2 = " anagra.bvar = 1 and codint <>'variaweb'  and "
			Addrep.Visible = vInt17 = 0
		Else
			vStr2 = " anagra.bvar = 0  and "
			Addrep.Visible = False
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub038(z As Boolean)
	pPlu.SetVisibleAnimated(500, z)
	pButtonsPlu.SetVisibleAnimated(500, z)
End Sub

Sub Sub039(buttonWrapper As Button, str As String)
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 4
	numberDialog.Number = buttonWrapper.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il codice del testo generico " & str, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Sub009(numberDialog.Number, buttonWrapper, "Codice testo generico " & str & ": ", "Inserire qui il codice del testo generico " & str)
		Return
	End If
	buttonWrapper.Text = "Inserire qui il codice del testo generico " & str
	buttonWrapper.Tag = 0
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

Sub sort_async
	Sub017()
	Dim sb As String = "insert into sortedAnagra(Codice,Descrizione,Reparto," & CRLF & TAB & TAB & TAB & "Listino1,Iva,flgusointerno,locked,gruppov,gruppovCodice,flgmag,giac,invioweb) " & SmartStringFormatter("", vStr3) & " "
	Dim str As String = ""
	If Not(vBln8) Then
		str = " DESC"
	End If
	Select vByt1
		Case 0
			vStr4 = " order by Descrizione "
		Case 1
			vStr4 = " order by Codice" & str & ",Descrizione"
		Case 2
			vStr4 = " order by Descrizione" & str
		Case 3
			vStr4 = " order by Reparto" & str & ",Descrizione"
		Case 4
			vStr4 = " order by Listino1" & str & ",Descrizione"
		Case 5
			vStr4 = " order by Iva" & str & ",Descrizione"
		Case 6
			vStr4 = " order by gruppov" & str & ",Descrizione"
		Case 7
			vStr4 = " order by Descrizione "
	End Select
	Main.vSql1.ExecNonQuery(sb & vStr4)
	vUltimateListView1.RefreshContent
	vUltimateListView1.Enabled = True
End Sub

Sub sort_data
	vUltimateListView1.Enabled = False
	If vByt1 = -1 Then
		vByt1 = 2
		vBln8 = False
	End If
	vColorDrawable1.Initialize(-65536, DipToCurrent(6))
	vLabelArr1(vByt1).Background = vColorDrawable1
	sort_async()
End Sub

Sub sRicerca_ItemClick(i As Int, obj As Object)
	Select i
		Case 0
			Sub012("Descrizione")
		Case 1
			Sub012("Codint")
		Case 2
			Sub012("Codice")
		Case 3
			Sub012("Reparto")
		Case 4
			Sub012("Tutti")
	End Select
End Sub

Sub Sub040(concreteViewWrapper As View)
	a1.InitializeRotateCenter("", 0, 180, concreteViewWrapper)
	a1.Duration = 1000
	a1.RepeatCount = 1
	Dim animationWrapper2 As Animation = a1
	a1.RepeatMode = 2
	a1.Start(concreteViewWrapper)
End Sub

Sub sVarAuto_ItemClick(i As Int, obj As Object)
	vCur5.Position = i
	Dim vGetString As String = vCur5.GetString("codintvar")
	Dim vObjectToCharSequence As Object = "Si desidera eliminare la variazione " & Main.vSql1.ExecQuerySingleResult("Select descrizione from anagra where codint = '" & vGetString & "'")
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Main.vSql1.ExecNonQuery("delete from varautoTmp where codintvar = '" & vGetString & "'")
		Dim cursorWrapper As Cursor
		vCur5 = Main.vSql1.ExecQuery("Select * from varautoTmp order by chiave")
		Sub034()
		Return
	End If
End Sub

Sub Timer1_Tick
	v7.Enabled = False
	vBln3 = True
	Sub026()
	vBln3 = False
End Sub

Sub Timerbarcode_Tick
	v5.Enabled = False
	If vBln10 Then
		Sub006()
		pAddC.RequestFocus
	Else
		ricerca()
	End If
	vBln10 = False
	mod1.Sub081
End Sub

Sub Ulv_Scrolled(i As Int, i2 As Int, i3 As Int, z As Boolean, z2 As Boolean)
	Try
		If i <> vInt10 Then
			vInt10 = i
			Dim fastScrollerState As Int = vUltimateListView1.FastScrollerState
			Dim ultimateListViewWrapper As UltimateListView = vUltimateListView1
			If fastScrollerState = 2 Then
				If vStr4.StartsWith(" order by Descrizione") Then
					v6.Enabled = False
					Dim vGetItemID As Int = vUltimateListView1.GetItemID(i)
					If vGetItemID < 0 Then
						Return
					End If
					vCur10.Position = vGetItemID
					If vCur10.GetString("Descrizione").Length < 2 Then
						Return
					End If
					LblInfo.Text = vCur10.GetString("Descrizione").SubString2(0, 2).ToUpperCase
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

Sub Sub041
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from anagraDescrizioni where codint ='" & pCodint.Text & "'")
	If cursorWrapper2.RowCount > 0 Then
		cursorWrapper2.Position = 0
		pWebDes1.Tag = cursorWrapper2.GetString("descrizione1")
		pWebDes2.Tag = cursorWrapper2.GetString("descrizione2")
		pWebDes3.Tag = cursorWrapper2.GetString("descrizione3")
		pWebDes4.Tag = cursorWrapper2.GetString("descrizione4")
		pWebDes5.Tag = cursorWrapper2.GetString("descrizione5")
		pWebIng1.Tag = cursorWrapper2.GetString("ingredienti1")
		pWebIng2.Tag = cursorWrapper2.GetString("ingredienti2")
		pWebIng3.Tag = cursorWrapper2.GetString("ingredienti3")
		pWebIng4.Tag = cursorWrapper2.GetString("ingredienti4")
		pWebIng5.Tag = cursorWrapper2.GetString("ingredienti5")
	Else
		pWebDes1.Tag = ""
		pWebDes2.Tag = ""
		pWebDes3.Tag = ""
		pWebDes4.Tag = ""
		pWebDes5.Tag = ""
		pWebIng1.Tag = ""
		pWebIng2.Tag = ""
		pWebIng3.Tag = ""
		pWebIng4.Tag = ""
		pWebIng5.Tag = ""
	End If
	Sub020(pWebIng1, 0)
	Sub020(pWebIng2, 1)
	Sub020(pWebIng3, 2)
	Sub020(pWebIng4, 3)
	Sub020(pWebIng5, 4)
	vCur11.Position = 0
	pWebDes1.Text = "Descrizione Web " & vCur11.GetString("descrizione") & " : " & IIf(pWebDes1.Tag = "", "da inserire", pWebDes1.Tag)
	vCur11.Position = 1
	pWebDes2.Text = "Descrizione Web " & vCur11.GetString("descrizione") & " : " & IIf(pWebDes2.Tag = "", "da inserire", pWebDes2.Tag)
	vCur11.Position = 2
	pWebDes3.Text = "Descrizione Web " & vCur11.GetString("descrizione") & " : " & IIf(pWebDes3.Tag = "", "da inserire", pWebDes3.Tag)
	vCur11.Position = 3
	pWebDes4.Text = "Descrizione Web " & vCur11.GetString("descrizione") & " : " & IIf(pWebDes4.Tag = "", "da inserire", pWebDes4.Tag)
	vCur11.Position = 4
	pWebDes5.Text = "Descrizione Web " & vCur11.GetString("descrizione") & " : " & IIf(pWebDes5.Tag = "", "da inserire", pWebDes5.Tag)
	cursorWrapper2.Close
End Sub

Sub Sub042(str As String, z As Boolean) As String
	If Not(IsNumber(str.Replace(",", "."))) Then
		Return "0"
	End If
	If z Then
		Return Sub018(str)
	End If
	Return mod1.Sub056(str)
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

